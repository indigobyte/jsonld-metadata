import GeneratorSink
import Type
import org.semarglproject.rdf.rdfa.RdfaParser
import org.semarglproject.sink.TripleSink
import org.semarglproject.source.StreamProcessor
import java.io.File
import java.io.FileInputStream
import java.util.ArrayList
import java.util.Date
import java.util.HashMap
import java.util.HashSet
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
}

val Type.classOrInterface: String
    get() = when(isInterface) { true -> "interface"; else -> "class" }

class GeneratorSink : TripleSink {
    private var uri: String = "http://schema.org/"

    private val types = HashMap<String, Type>()

    override fun setProperty(key: String, value: Any): Boolean {
        println("Property: $key=$value")
        return true
    }

    override fun endStream() {
        for (type in types.values()) {
            if (type.isField && type.isInterface) {
                type.isField = false
                type.dataTypes.forEach { types.get(it).interfaces.add(type.name!!.capitalize()) }
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
            "http://www.w3.org/2000/01/rdf-schema#subClassOf" -> types.get(subj).parentType = obj
            "http://schema.org/domainIncludes" -> {
                val objType = types.get(obj)

                if (objType != null) {
                    val subjType = types.get(subj)
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
            "http://schema.org/rangeIncludes" -> types.get(subj).dataTypes.add(obj)
            "http://purl.org/dc/terms/source" -> types.get(subj).source = obj
            "http://www.w3.org/2002/07/owl#equivalentClass" -> types.get(subj).equivalent = obj
            "http://www.w3.org/2002/07/owl#equivalentProperty" -> types.get(subj).equivalent = obj
            "http://schema.org/inverseOf" -> { /* ignore */ }
            "http://schema.org/supersededBy" -> { types.get(subj).isSuperseded = true }
            "http://www.w3.org/2000/01/rdf-schema#subPropertyOf" -> {
                val interfaceType = Type()
                interfaceType.name = getInterfaceName(obj)
                interfaceType.isInterface = true
                types.put(obj, interfaceType)

                if (!types.containsKey(subj)) types.put(subj, Type())
                val type = types.get(subj)
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
            "http://www.w3.org/2000/01/rdf-schema#label" -> types.get(subj).name = content.replace(" ", "").replace(".", "")
            "http://www.w3.org/2000/01/rdf-schema#comment" -> types.get(subj).comment = content
            else -> System.err.println("Unknown plain literal: $pred")
        }
    }

    override fun addTypedLiteral(subj: String, pred: String, content: String, type: String) {
        System.err.println("Unknown typed literal: $pred")
    }

    private fun getFieldType(field: Type): String? {
        if (field.isInterface && field.name != null)
            return field.name!!.capitalize()

        val name = field.dataTypes.firstOrNull { types.get(it).isInterface } ?: field.dataTypes.firstOrNull()
        return when(types.get(name)?.name) {
            "Text", "URL" -> "String"
            "DateTime", "Date", "Time" -> "java.util.Date"
            else -> types.get(name)?.name?.capitalize()
        }
    }

    private fun shouldSkip(name: String): Boolean {
        return arrayOf("Text", "DateTime", "Date", "Time", "Boolean", "Float", "Double", "URL", "True", "False", "Class").contains(name) ||
                name.contains("#") || name.contains("/")
    }

    fun writeJava(dir: File, ns: String) {
        val packageDir = ns.split(Regex("\\.")).fold(dir) { d, s -> File(d, s) }
        packageDir.mkdirs()
        generateTypes(ns, packageDir)
        generateBuilders(ns, packageDir)
    }

    private fun generateBuilders(ns: String, packageDir: File) {
        // public API
        with(StringBuilder()) {
            appendln("/** THIS IS AN AUTO GENERATED CLASS. DO NOT EDIT. Generated on ${Date(System.currentTimeMillis())} */")
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
                appendln("  public static ${typeName}.Builder ${typeName.decapitalize()}() { return new ${typeName}.Builder(); }")
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
                appendln("/** THIS IS AN AUTO GENERATED CLASS. DO NOT EDIT. Generated on ${Date(System.currentTimeMillis())} */")
                appendln()
                appendln("package $ns;")
                appendln()

                appendln("/**")
                type.comment?.let { appendln(" * ${it.replace("\n", "\n  * ")}") }
                type.source?.let { appendln(" * Source: $it") }
                type.equivalent?.let { appendln(" * Equivalent class: $it") }
                appendln(" */")

                append("public ${type.classOrInterface} $typeName")
                type.parentType?.let { types.get(it)?.let { append(" extends ${it.name}") } }
                val interfaces = type.interfaces.filter { i -> types.any { it.getValue().name == i } }
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
""")
                }

                // getters
                for (field in type.subTypes) {
                    types.get(field)?.let {
                        if (it.name != null && !it.isSuperseded && it.name != "hasPart") {
                            val fieldType = getFieldType(it)
                            val name = it.name!!.capitalize()
                            it.comment?.let {
                                appendln("  /**")
                                appendln("   * $it")
                                appendln("   */")
                            }
                            appendln("  public $fieldType get$name() {")
                            appendln("    return my$name;")
                            appendln("  }")
                        }
                    }
                }

                // builder
                if (!type.isInterface) {
                    appendln("/**")
                    appendln(" * Builder for {@see $typeName}")
                    appendln(" */")
                    appendln("public static final class Builder {")
                    appendln("  public ${typeName} build() {")
                    append("    return new ${typeName}(")
                    append(getAllFields(type).map { it.name?.decapitalize() }.filterNotNull().join(", "))
                    appendln(");")
                    appendln("  }")
                    for (field in getAllFields(type)) {
                        if (field.name != null) {
                            val name = field.name!!.capitalize()
                            field.comment?.let {
                                appendln("  /**")
                                appendln("   * $it")
                                appendln("   */")
                            }
                            appendln("  public Builder ${name.decapitalize()}(${getFieldType(field)} value) {")
                            appendln("    ${name.decapitalize()} = value;")
                            appendln("    return this;")
                            appendln("  }")
                        }
                    }
                    getAllFields(type).forEach { appendln("  private ${getFieldType(it)} ${it.name!!.decapitalize()};") }
                    appendln("}")
                    appendln()
                }

                // package-local constructor and private fields
                if (!type.isInterface) {
                    append("  $typeName(")
                    append(getAllFields(type).map { "${getFieldType(it)} ${it.name!!.decapitalize()}" }.join(", "))
                    appendln(") {")
                    type.parentType?.let {
                        append("    super(")
                        append(getAllFields(types.get(type.parentType)).map { it.name!!.decapitalize() }.join(", "))
                        appendln(");")
                    }
                    for (field in type.subTypes) {
                        types.get(field)?.let {
                            if (it.name != null && !it.isSuperseded && it.name != "hasPart") {
                                appendln("    my${it.name!!.capitalize()} = ${it.name!!.decapitalize()};")
                            }
                        }
                    }
                    appendln("  }")
                }
                for (field in type.subTypes) {
                    types.get(field)?.let {
                        if (it.name != null && !it.isSuperseded && it.name != "hasPart") {
                            appendln("  private ${getFieldType(it)} my${it.name!!.capitalize()};")
                        }
                    }
                }


                appendln("}")

                File(packageDir, typeName + ".java").writeText(toString())
            }
        }
    }

    private fun getAllFields(type: Type?): Iterable<Type> {
        if (type == null) {
            return emptyList()
        }
        val fieldTypes = type.subTypes.map { types.get(it) }.filter { it.name != null && !it.isSuperseded && it.name != "hasPart" }.toHashSet()
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