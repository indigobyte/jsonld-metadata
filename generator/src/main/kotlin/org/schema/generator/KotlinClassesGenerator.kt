package org.schema.generator

/**
 * @author Victor Kropp
 */

class KotlinClassesGenerator(private val sink: GeneratorSink, private val banner: String? = null) {
    fun generate(p: Package) {
        p.writeClass("SchemaOrg", "kt") {
            appendLine("package org.schema.kotlin")
            appendLine("")

            for ((_, type) in sink.types) {
                if (type.isInterface) continue
                if (type.name.isNullOrEmpty() || type.isField || sink.shouldSkip(type.name!!)) continue
                if (type.parentType == null && type.name != "Thing") continue
                if (type.name == "http://schema.org/Enumeration" || (type.parentType?.let { sink.types[it] }?.isEnum == true)) continue
                if (type.isEnum) continue

                val typeName = type.name!!.capitalize()

                generateMutableClass(p, typeName, type)

                appendLine("fun ${typeName.decapitalize()}(builder: Mutable$typeName.() -> Unit) = Mutable$typeName().apply(builder).build()")
            }
        }
    }

    private fun generateMutableClass(p: Package, typeName: String, type: GeneratorSink.Type) {
        p.writeClass("Mutable$typeName", "kt") {
            appendLine("package org.schema.kotlin")
            appendLine("import org.schema.*")
            appendLine("class Mutable$typeName {")
            appendLine("  private val map = HashMap<String,Any>()")
            val allFields = sink.getAllFields(type)
            allFields.forEach {
                val eitherTypes = sink.getEitherTypes(it)
                val varName = it.name!!.decapitalize()
                if (eitherTypes.size > 1) {
                    appendLine("  var $varName: Any")
                    appendLine("    get() = map[\"$varName\"]!!")
                    appendLine("    set(value) { map[\"$varName\"] = value }")
                } else {
                    val type1 = when (eitherTypes.first()) {
                        "Map" -> "org.schema.Map"
                        "Integer" -> "Int"
                        else -> eitherTypes.first()
                    }
                    appendLine("  var $varName: $type1")
                    appendLine("    get() = map[\"$varName\"] as $type1")
                    appendLine("    set(value) { map[\"$varName\"] = value }")
                }
                eitherTypes.forEachIndexed { i, fieldType ->
                    val suffix = if (eitherTypes.size > 1) {
                        if (fieldType == "java.util.Date") "Date" else fieldType
                    } else ""
                    val nameWithSuffix = "$varName$suffix"

                    val isEnum =
                        findType(fieldType)?.isEnum != true && (
                                i >= it.dataTypes.size ||
                                        sink.types[it.dataTypes.elementAt(i)]?.isEnum != true
                                )
                    if (!sink.shouldSkip(fieldType) &&
                        findType(fieldType)?.isInterface != true &&
                        isEnum &&
                        fieldType != "String" &&
                        fieldType != "Integer" &&
                        fieldType != "java.util.Date"
                    ) {
                        appendLine("  fun $nameWithSuffix(builder: Mutable$fieldType.() -> Unit) { map[\"$varName\"] = Mutable$fieldType().apply(builder).build() }")
                    }
                }
            }
            appendLine("  fun build() = org.schema.$typeName.Builder(map).build()")
            appendLine("}")
        }
    }

    private fun findType(fieldType: String): GeneratorSink.Type? =
        sink.types.values.firstOrNull { it.name == fieldType }
}
