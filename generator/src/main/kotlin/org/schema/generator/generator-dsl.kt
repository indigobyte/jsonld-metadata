/*
 * Copyright 2015-2016 JetBrains s.r.o.
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

package org.schema.generator

import java.io.Closeable
import java.io.File

/**
 * @author Victor Kropp
 */

class Klass(private val sourceDirectory: File, val namespace: String, val name: String, private val classOrInterface: String?, private val extends : String?, private val implements: Collection<String>?, val imports: Collection<String>?, val annotations: Collection<String>?, val comment: String?, val copyright: String?) {
    internal val text = StringBuilder()

    val fields = arrayListOf<Field>()

    fun field(name: String, type: String, body: Field.() -> Unit = {}) {
        val field = Field(this, name.capitalize(), type)
        fields += field

        field.body()
    }

    fun constant(name: String, type: String, value: String) {
        text.appendln("  private static final $type $name = $value;");
    }

    fun konstructor(visibility: String = "public") {
        text.append("  $visibility $name(")
        text.append(fields.map { "${it.type} ${it.name}" }.joinToString(", "))
        text.appendln(") {")
/*
        type.parentType?.let {
            append("    super(")
            append(sink.getAllFields(sink.types[it]).map { it.name!!.decapitalize() }.joinToString(", "))
            appendln(");")
        }
        for (field in type.subTypes) {
            sink.types[field]?.let {
                if (it.name != null && !it.isSuperseded && it.dataTypes.any() && it.dataTypes[0] != "http://schema.org/Class") {
                    appendln("    my${it.name!!.capitalize()} = ${it.name!!.decapitalize()};")
                }
            }
        }
*/
        fields.forEach {
            text.appendln("    my${it.name} = ${it.name};")
        }
        text.appendln("  }")
    }

    fun method(name: String, type: String = "void", annotations: Collection<String>? = null, throws: String? = null, body: Method.() -> Unit) {
        Method(this, name, type, annotations, throws).use { it.body() }
    }

    fun hashCodeAndEquals(callSuper: Boolean = true) {
        with(text) {
            // hashCode
            appendln("  @Override public int hashCode() {")
            if (callSuper) {
                appendln("    int result = super.hashCode();")
            } else {
                appendln("    int result = 0;")
            }
            fields.forEach {
                appendln("    result = 31 * result + (my${it.name} != null ? my${it.name}.hashCode() : 0);")
            }
            appendln("    return result;")
            appendln("  }")

            // equals
            appendln("  @Override public boolean equals(Object o) {")
            appendln("    if (this == o) return true;")
            appendln("    if (o == null || getClass() != o.getClass()) return false;")
            val other = name.decapitalize()
            appendln("    $name $other = ($name) o;")
            if (callSuper) {
                appendln("    if (!super.equals(o)) return false;")
            }
            fields.forEach {
                appendln("    if (my${it.name} != null ? !my${it.name}.equals($other.my${it.name}) : $other.my${it.name} != null) return false;")
            }
            appendln("    return true;")
            appendln("  }")
        }
    }

    init {
        with(text) {
            copyright?.let {
                appendln(it)
                appendln()
            }
            appendln("package $namespace;")
            appendln()
            imports?.forEach {
                appendln("import $it;")
            }
            appendln()
            comment?.let {
                appendln("/**")
                it.split("\n").forEach { appendln(" * $it") }
                appendln(" */")
            }
            annotations?.forEach {
                appendln(it)
            }
            append("public $classOrInterface $name")

            extends?.let { append(" extends $it")}
            if (implements?.any() == true) {
                append(" implements ")
                append(implements!!.joinToString(", "))
            }
            appendln(" {")


        }
    }

    private fun finish() {
        fields.forEach {
            text.appendln("  private ${it.type} my${it.name};")
        }
        text.appendln("}")
    }

    fun save() {
        finish()

        val packageDir = namespace.split(Regex("\\.")).fold(sourceDirectory) { d, s -> File(d, s) }
        packageDir.mkdirs()
        File(packageDir, "$name.java").writeText(text.toString())
    }
}

fun klass(sourceDirectory: File, namespace: String, name: String, classOrInterface: String? = "class", extends : String? = null, implements: Collection<String>? = null, imports: Collection<String>? = null, annotations: Collection<String>? = null, comment: String? = null, copyright: String? = null, body: Klass.() -> Unit) {
    val c = Klass(sourceDirectory, namespace, name, classOrInterface, extends, implements, imports, annotations, comment, copyright)
    c.body()
    c.save()
}

class Field(val c: Klass, val name: String, val type: String) {
    fun getter(annotations: Collection<String>? = null, comment: String? = null) {
        comment?.let {
            c.text.appendln("  /**")
            c.text.appendln("   * $it")
            c.text.appendln("   */")
        }
        annotations?.forEach { c.text.appendln("  $it") }
        c.text.appendln("  public $type get$name() { return my$name; }")
    }
    fun setter(methodCallBefore: String? = null, isPublic: Boolean = true) {
        c.text.append(if (isPublic) "  public" else "  ")
        val paramName = getVariableName(type, "value")
        c.text.append("void set$type($type $paramName) {")
        methodCallBefore?.let { c.text.append(" $it();") }
        c.text.appendln(" my$name = $paramName; }")
    }
    private fun getVariableName(typeName: String, entityName: String? = null): String {
        val indexOfDot = typeName.lastIndexOf('.')
        if (indexOfDot > 0) {
            return typeName.substring(indexOfDot+1).decapitalize()
        }
        if (entityName != null && arrayOf("Boolean", "String", "Class", "Long", "Int", "Double", "Float").contains(typeName)) {
            return entityName.decapitalize()
        }
        return typeName.decapitalize()
    }
}

class Method(val c: Klass, val name: String, val type: String, val annotations: Collection<String>?, throws: String?): Closeable {
    init {
        annotations?.forEach {
            c.text.appendln("  $it")
        }
        c.text.append("  public $type $name()")
        throws?.let { c.text.append(" throws $it") }
        c.text.appendln(" {")
    }

    fun line(line: String) {
        c.text.appendln("    " + line)
    }

    override fun close() {
        c.text.appendln("  }")
    }
}