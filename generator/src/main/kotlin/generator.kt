/*
 * Copyright 2015 JetBrains s.r.o.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

import GeneratorSink
import Type
import org.semarglproject.rdf.rdfa.RdfaParser
import org.semarglproject.sink.TripleSink
import org.semarglproject.source.StreamProcessor
import java.io.File
import java.io.FileInputStream
import java.text.DateFormat
import java.util.ArrayList
import java.util.Date
import java.util.HashMap
import kotlin.text.Regex

/**
 * @author Victor Kropp
 */

class Type() {
    var isSuperseded: Boolean = false
    var isInterface: Boolean = false
    var name: String? = null
    var parentType: String? = null
    var comment: String? = null
    var source: String? = null
    var equivalent: String? = null
    val subTypes: MutableList<String> = ArrayList()
    val interfaces: MutableList<String> = ArrayList()
    var isField = false
    val dataTypes: MutableList<String> = ArrayList()

    val classOrInterface: String
        get() = when(isInterface) { true -> "interface"; else -> "class" }
}

private val BANNER = """/*
 * Copyright 2015 JetBrains s.r.o.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 *
 * This is auto-generated file. Do not edit.
 */"""

class GeneratorSink : TripleSink {
    private var uri: String = "http://schema.org/"

    private val types = HashMap<String, Type>()

    override fun setProperty(key: String, value: Any): Boolean {
        return true
    }

    override fun endStream() {
        for (type in types.values()) {
            if (type.isField && type.isInterface) {
                type.isField = false
                type.dataTypes.forEach { types.get(it)!!.interfaces.add(type.name!!.capitalize()) }
            }
        }
    }

    override fun setBaseUri(baseUri: String) {
        uri = baseUri
    }

    override fun startStream() {
    }

    override fun addNonLiteral(subj: String, pred: String, obj: String) {
        when(pred) {
            "http://www.w3.org/1999/02/22-rdf-syntax-ns#type" -> { if(!types.containsKey(subj)) types.put(subj, Type()) }
            "http://www.w3.org/2000/01/rdf-schema#subClassOf" -> types.get(subj)!!.parentType = obj
            "http://schema.org/domainIncludes" -> {
                val objType = types.get(obj)

                if (objType != null) {
                    val subjType = types.get(subj)!!
                    subjType.isField = true
                    if (!objType.subTypes.contains(subj)) {
                        objType.subTypes.add(subj)
                    }
                } else {
                    val type = Type()
                    type.interfaces.add(getInterfaceName(subj))
                    types.put(obj, type)
                }
            }
            "http://schema.org/rangeIncludes" -> types.get(subj)!!.dataTypes.add(obj)
            "http://purl.org/dc/terms/source" -> types.get(subj)!!.source = obj
            "http://www.w3.org/2002/07/owl#equivalentClass" -> types.get(subj)!!.equivalent = obj
            "http://www.w3.org/2002/07/owl#equivalentProperty" -> types.get(subj)!!.equivalent = obj
            "http://schema.org/inverseOf" -> { /* ignore */ }
            "http://schema.org/supersededBy" -> { types.get(subj)!!.isSuperseded = true }
            "http://www.w3.org/2000/01/rdf-schema#subPropertyOf" -> {
                val interfaceType = Type()
                interfaceType.name = getInterfaceName(obj)
                interfaceType.isInterface = true
                types.put(obj, interfaceType)

                if (!types.containsKey(subj)) types.put(subj, Type())
                val type = types.get(subj)!!
                if (type.isField) {
                    type.dataTypes.add(obj)
                } else {
                    type.interfaces.add(interfaceType.name!!)
                }
            }
            else -> System.err.println("Unknown non-literal: $pred")
        }
    }

    private fun getInterfaceName(obj: String): String = obj.substring(uri.length()).capitalize()

    override fun addPlainLiteral(subj: String, pred: String, content: String, lang: String?) {
        when(pred) {
            "http://www.w3.org/2000/01/rdf-schema#label" -> types.get(subj)!!.name = content.replace(" ", "").replace(".", "").capitalize()
            "http://www.w3.org/2000/01/rdf-schema#comment" -> types.get(subj)!!.comment = content
            else -> System.err.println("Unknown plain literal: $pred")
        }
    }

    override fun addTypedLiteral(subj: String, pred: String, content: String, type: String) {
        System.err.println("Unknown typed literal: $pred")
    }

    private fun getBasicTypeName(name: String?): String? {
        return when(name) {
            "Text", "URL" -> "String"
            "DateTime", "Date", "Time" -> "java.util.Date"
            "Class" -> null
            else -> name?.capitalize()
        }
    }

    private fun getFieldType(field: Type): String? {
        if (field.isInterface && field.name != null)
            return field.name!!.capitalize()

        val name = field.dataTypes.firstOrNull { types.get(it)!!.isInterface } ?: field.dataTypes.firstOrNull()
        return getBasicTypeName(types.get(name)?.name)
    }

    private fun getEitherFieldType(ns: String, packageDir: File, field: Type): String? {
        val names = getEitherTypes(field)
        if (names.size() < 2)
            return names.firstOrNull()
        return generateEither(ns, packageDir, names)
    }

    private fun getEitherTypes(field: Type): Collection<String> {
        if (field.isInterface && field.name != null)
            return listOf(field.name!!.capitalize())

        if (field.dataTypes.size() < 2)
            return listOf(getFieldType(field) ?: "")

        val iface = field.dataTypes.firstOrNull { types.get(it)!!.isInterface }
        if (iface != null)
            return listOf(types.get(iface)!!.name!!)

        return field.dataTypes.map { getBasicTypeName(types.get(it)?.name) }.filterNotNull().toHashSet().sort()
    }

    private fun shouldSkip(name: String): Boolean {
        return arrayOf("Text", "DateTime", "Date", "Time", "Boolean", "Float", "Double", "URL", "True", "False", "Class", "Object").contains(name) ||
                name.contains("#") || name.contains("/")
    }

    fun writeJava(dir: File, ns: String) {
        val packageDir = ns.split(Regex("\\.")).fold(dir) { d, s -> File(d, s) }
        packageDir.mkdirs()
        generateTypes(ns, packageDir)
        generateBuilders(ns, packageDir)
    }

    private fun generateEither(ns: String, packageDir: File, types: Collection<String>): String {
        val eitherName = types.join("Or")
        val file = File(packageDir, "$eitherName.java")
        if (!file.exists()) {
            with(StringBuilder()) {
                appendln(BANNER)
                appendln()
                appendln("package $ns;")
                appendln()
                appendln("@com.fasterxml.jackson.databind.annotation.JsonSerialize(include = com.fasterxml.jackson.databind.annotation.JsonSerialize.Inclusion.NON_NULL)")
                appendln("class $eitherName {")

                appendln("  @com.fasterxml.jackson.annotation.JsonValue")
                appendln("  public Object getJsonLdValue() {")
                types.forEach {
                    appendln("    if (my$it != null) return my$it;")
                }
                appendln("    return null;")
                appendln("  }")

                val filteredTypes = types.filterNot { shouldSkip(it) || it == "String" || it == "Boolean" || it == "Number" || it == "Integer" }
                if (filteredTypes.any() && !filteredTypes.contains("Thing")) {
                    appendln("  public Thing getThing() {")
                    filteredTypes.forEach {
                        appendln("    if (my$it != null) return my$it;")
                    }
                    appendln("    return null;")
                    appendln("  }")
                }
                types.forEach {
                    appendln("  public void set$it($it ${getVariableName(it, "value")}) { clear(); my$it = ${getVariableName(it, "value")}; }")
                    appendln("  public $it get$it() { return my$it; }")
                    appendln("  private $it my$it;")
                }
                appendln("  private void clear() {")
                types.forEach {
                    appendln("    my$it = null;")
                }
                appendln("  }")
                appendln("}")

                file.writeText(toString())
            }
        }
        return eitherName
    }

    private fun generateBuilders(ns: String, packageDir: File) {
        // public API
        with(StringBuilder()) {
            appendln(BANNER)
            appendln()
            appendln("package $ns;")
            appendln()
            appendln("public class SchemaOrg {")

            for (type in types.values()) {
                if (type.name.isNullOrEmpty() || type.isField || type.isInterface || shouldSkip(type.name!!))
                    continue

                val typeName = type.name!!.capitalize()

                type.comment?.let {
                    appendln("  /**")
                    appendln("   * $it")
                    appendln("   */")
                }
                appendln("  public static $typeName.Builder ${typeName.decapitalize()}() { return new $typeName.Builder(); }")
            }
            appendln("}")

            File(packageDir, "SchemaOrg.java").writeText(toString())
        }
    }

    private fun generateTypes(ns: String, packageDir: File) {
        for (type in types.values()) {
            if (type.name.isNullOrEmpty() || (type.isField && !type.isInterface) || shouldSkip(type.name!!))
                continue

            val typeName = type.name!!.capitalize()

            with(StringBuilder()) {
                appendln(BANNER)
                appendln()
                appendln("package $ns;")
                appendln()

                appendln("/**")
                type.comment?.let { appendln(" * ${it.replace("\n", "\n  * ")}") }
                type.source?.let { appendln(" * Source: $it") }
                type.equivalent?.let { appendln(" * Equivalent class: $it") }
                appendln(" */")

                if (typeName == "Thing") {
                    appendln("@com.fasterxml.jackson.databind.annotation.JsonSerialize(include = com.fasterxml.jackson.databind.annotation.JsonSerialize.Inclusion.NON_NULL)")
                }
                append("public ${type.classOrInterface} $typeName")
                type.parentType?.let { types.get(it)?.let { append(" extends ${it.name}") } }
                val interfaces = type.interfaces.filter { i -> types.values().any { it.name == i && !it.isField } }
                if (interfaces.any()) {
                    append(" implements ")
                    append(interfaces.join(", "))
                }
                appendln(" {")

                if (typeName == "Thing") {
                    appendln("""  @com.fasterxml.jackson.annotation.JsonProperty("@type")
  public String getJsonLdType() {
    return getClass().getSimpleName();
  }

  @com.fasterxml.jackson.annotation.JsonProperty("@context")
  public String getJsonLdContext() {
    return "http://schema.org/";
  }
""")
                }

                // getters
                for (field in type.subTypes) {
                    types.get(field)?.let {
                        if (it.name != null && !it.isSuperseded && it.dataTypes.any() && it.dataTypes[0] != "http://schema.org/Class") {
                            val fieldType = getEitherFieldType(ns, packageDir, it)
                            val name = it.name!!.capitalize()
                            it.comment?.let {
                                appendln("  /**")
                                appendln("   * $it")
                                appendln("   */")
                            }
                            if (fieldType == "java.util.Date") {
                                appendln("    @com.fasterxml.jackson.annotation.JsonFormat(shape = com.fasterxml.jackson.annotation.JsonFormat.Shape.STRING, pattern = \"yyyy-MM-dd'T'HH:mm:ss'Z'\")")
                            }
                            appendln("  public $fieldType get$name() {")
                            appendln("    return my$name;")
                            appendln("  }")
                        }
                    }
                }

                // builder
                if (!type.isInterface) {
                    appendln("  /**")
                    appendln("   * Builder for {@link $typeName}")
                    appendln("   */")
                    appendln("  public static final class Builder {")
                    appendln("    /**")
                    appendln("     * Creates new {@link $typeName} instance.")
                    appendln("     */")
                    appendln("    public $typeName build() {")
                    append("      return new $typeName(")
                    append(getAllFields(type).map { it.name?.decapitalize() }.filterNotNull().join(", "))
                    appendln(");")
                    appendln("    }")
                    for (field in getAllFields(type)) {
                        if (field.name != null) {
                            val eitherTypes = getEitherTypes(field)
                            eitherTypes.forEachIndexed { i, fieldType ->
                                val name = field.name!!.capitalize()
                                field.comment?.let {
                                    appendln("    /**")
                                    appendln("     * $it")
                                    appendln("     */")
                                }
                                appendln("    public Builder ${name.decapitalize()}($fieldType ${getVariableName(fieldType, name)}) {")
                                if (eitherTypes.size() < 2) {
                                    appendln("      this.${name.decapitalize()} = ${getVariableName(fieldType, name)};")
                                } else {
                                    appendln("      if(this.${name.decapitalize()} == null) this.${name.decapitalize()} = new ${getEitherFieldType(ns, packageDir, field)}();")
                                    appendln("      this.${name.decapitalize()}.set$fieldType(${getVariableName(fieldType, name)});")
                                }
                                appendln("      return this;")
                                appendln("    }")
                            }
                        }
                    }
                    getAllFields(type).forEach { appendln("    private ${getEitherFieldType(ns, packageDir, it)} ${getVariableName(it.name!!)};") }
                    appendln("  }")
                    appendln()
                }

                // package-local constructor and private fields
                if (!type.isInterface) {
                    append("  protected $typeName(")
                    append(getAllFields(type).map { "${getEitherFieldType(ns, packageDir, it)} ${it.name!!.decapitalize()}" }.join(", "))
                    appendln(") {")
                    type.parentType?.let {
                        append("    super(")
                        append(getAllFields(types.get(type.parentType)).map { it.name!!.decapitalize() }.join(", "))
                        appendln(");")
                    }
                    for (field in type.subTypes) {
                        types.get(field)?.let {
                            if (it.name != null && !it.isSuperseded && it.dataTypes.any() && it.dataTypes[0] != "http://schema.org/Class") {
                                appendln("    my${it.name!!.capitalize()} = ${it.name!!.decapitalize()};")
                            }
                        }
                    }
                    appendln("  }")
                }
                for (field in type.subTypes) {
                    types.get(field)?.let {
                        if (it.name != null && !it.isSuperseded && it.dataTypes.any() && it.dataTypes[0] != "http://schema.org/Class") {
                            appendln("  private ${getEitherFieldType(ns, packageDir, it)} my${it.name!!.capitalize()};")
                        }
                    }
                }


                appendln("}")

                File(packageDir, "$typeName.java").writeText(toString())
            }
        }
    }

    private fun getVariableName(typeName: String, entityName: String? = null): String {
        val indexOfDot = typeName.lastIndexOf('.')
        if (indexOfDot > 0) {
            return typeName.substring(indexOfDot+1).decapitalize()
        }
        if (entityName != null && (typeName == "Boolean" || typeName == "String" || typeName == "Class")) {
            return entityName.decapitalize()
        }
        return typeName.decapitalize()
    }

    private fun getAllFields(type: Type?): Iterable<Type> {
        if (type == null) {
            return emptyList()
        }
        val fieldTypes = type.subTypes.map { types.get(it) }.filterNotNull().filter { it.name != null && !it.isSuperseded && it.dataTypes.any() && it.dataTypes[0] != "http://schema.org/Class" }.toArrayList()
        getAllFields(types.get(type.parentType)).filterNot { i -> fieldTypes.any { it.name == i.name} }.forEach { fieldTypes.add(it) }
        return fieldTypes
    }
}

fun main(args: Array<String>) {
    val generator = GeneratorSink()
    val sp = StreamProcessor(RdfaParser.connect(generator))
    val stream = FileInputStream("generator/resources/schema.rdfa")
    sp.process(stream, "http://schema.org/")

    generator.writeJava(File("src/main/java"), "org.schema")
}