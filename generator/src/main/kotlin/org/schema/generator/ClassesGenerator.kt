package org.schema.generator

import org.schema.generator.helper.sanitizeIdentifier


/**
 * @author Victor Kropp
 */

class ClassesGenerator(private val sink: GeneratorSink, private val banner: String? = null) {
    private val NOT_NULL = listOf("@NotNull")
    private val NULLABLE = listOf("@Nullable")
    private val OVERRIDE = listOf("@Override")

    fun generate(p: Package) {
        for ((key, type) in sink.types) {
            if (type.name.isNullOrEmpty() ||
                (type.isField && !type.isInterface) ||
                sink.shouldSkip(type.name!!)
            )
                continue
            if (type.parentType == null &&
                type.name != "Thing" &&
                //type.name != "About" && // hack
                !type.isInterface
            )
                continue
            //if (type.name == "http://schema.org/Enumeration" || (type.parentType?.let{ sink.types[it] }?.isEnum == true)) continue

            val typeName = sanitizeIdentifier(type.name!!.capitalize())

            if (type.isEnum ||
                type.parentType?.let { sink.types[it] }?.isEnum == true
            ) {
                p.enumeration(typeName) {
                    copyright = banner
                    comment = type.comment ?: ""
                    imports = listOf("com.fasterxml.jackson.annotation.JsonValue")
                    members = subTypes(key).map { it.value.name!!.capitalize() to it.key }.toMap()

                    field("Value", "String") {
                        getter(listOf("@JsonValue"))
                    }
                }
                continue
            }

            p.klass(typeName, type.classOrInterface) {
                copyright = banner
                if (type.isInterface) {
                    extends =
                        type.interfaces.filter { i ->
                            sink.types.values.any {
                                it.name == i &&
                                        !it.isField &&
                                        it.name != "HasPart" &&
                                        !sink.shouldSkip(it.name!!)
                            }
                        }
                } else {
                    extends = type.parentType?.let { sink.types[it]?.name }?.let { listOf(it) }
                    implements =
                        type.interfaces.filter { i ->
                            sink.types.values.any {
                                it.name == i &&
                                        !it.isField &&
                                        it.name != "HasPart" &&
                                        it.name != type.name && // Avoid "Duration implements Duration" bug &&
                                        !sink.shouldSkip(it.name!!)
                            }
                        }
                }
                imports = listOf(
                    "com.fasterxml.jackson.databind.annotation.*",
                    "com.fasterxml.jackson.annotation.*",
                    "org.jetbrains.annotations.NotNull",
                    "org.jetbrains.annotations.Nullable",
                    "java.util.*"
                )
                annotations = if (typeName == "Thing") {
                    listOf("@JsonSerialize(include = JsonSerialize.Inclusion.NON_NULL)")
                } else null
                comment = (type.comment ?: "") + (type.source?.let { "Source: $it" }
                    ?: "") + (type.equivalent?.let { "Equivalent class: $it" } ?: "")

                if (typeName == "Thing") {
                    method("getJsonLdType", "String") {
                        annotations = listOf("@JsonProperty(\"@type\")")

                        line("return getClass().getSimpleName();")
                    }
                    method("getJsonLdContext", "String") {
                        annotations = listOf("@JsonProperty(\"@context\")")

                        line("return \"http://schema.org/\";")
                    }
                    field("data", "java.util.Map<String,java.lang.Object>", "protected") {
                        getter(listOf("@JsonAnyGetter"))
                    }

                    method("getValue", "java.lang.Object") {
                        access = "protected"
                        parameters("key" to "String")

                        line("final java.lang.Object current = myData.get(key);")
                        line("if (current instanceof java.util.Collection) {")
                        line("  return ((java.util.Collection) current).iterator().next();")
                        line("}")
                        line("return current;")
                    }
                }

                val ownFields = type.subTypes.mapNotNull { sink.types[it] }
                    .filter {
                        it.name != null &&
                                !it.isSuperseded &&
                                it.dataTypes.any() &&
                                it.dataTypes.firstOrNull() != "http://schema.org/Class" &&
                                it.dataTypes.firstOrNull() != "http://schema.org/HasPart"
                    }
                ownFields.forEach {
                    val fieldTypes = sink.getEitherTypes(it)
                    val name = it.name!!.capitalize()

                    fieldTypes.forEach { fieldType ->
                        val methodName = getMethodName(fieldType, fieldTypes, name)
                        val key1 = name.decapitalize()
                        method(methodName, fieldType) {
                            comment = """
                                ${it.comment}
                                @return $key1 property set by first invocation of $key1 method or {@code null}.
                            """.trimIndent()
                            annotations = if (name == "Id") listOf("@JsonProperty(\"@id\")") else listOf("@JsonIgnore")

                            line("return ($fieldType) getValue(\"$key1\");")
                        }
                        if (name != "Id") {
                            method(methodName + "s", "java.util.Collection<$fieldType>") {
                                comment = """
                                    ${it.comment}
                                    @return all $key1 properties as {@link java.util.Collection} or an empty collection 
                                    if $key1 was not set.
                                """.trimIndent()
                                annotations = listOf("@JsonIgnore")

                                line("final java.lang.Object current = myData.get(\"$key1\");")
                                line("if (current == null) return Collections.emptyList();")
                                line("if (current instanceof java.util.Collection) {")
                                line("  return (java.util.Collection<$fieldType>) current;")
                                line("}")
                                line("return Arrays.asList(($fieldType) current);")
                            }
                        }
                    }
                }

                val allFields = sink.getAllFields(type)

                if (!type.isInterface) {
                    konstructor("protected",
                        parameters = listOf(Parameter("data", "java.util.Map<String,java.lang.Object>")),
                        superParameters = type.parentType?.let { listOf("data") }
                    )

                    if (typeName == "Thing") {
                        hashCodeAndEquals(false)
                    }

                    method("toBuilder", "Builder") {
                        comment = "@return new {@link Builder} initialized with this instance's data"
                        annotations = NOT_NULL
                        line("return new Builder(new HashMap<>(this.myData));")
                    }

                    klass("Builder") {
                        comment = "Builder for {@link $typeName}"
                        extends = type.parentType?.let {
                            sink.types[it]?.name
                                ?.let { sanitizeIdentifier(it) }
                                ?.plus(".Builder")
                        }?.let { listOf(it) }
                        if (type.parentType == null) {
                            implements = listOf("ThingBuilder<$typeName>")

                            field("data", "HashMap<String,java.lang.Object>", "protected")

                            method("putValue") {
                                parameters("key" to "String", "value" to "java.lang.Object")
                                line(
                                    """
                                    if (myData.containsKey(key)) {
                                     final java.lang.Object current = myData.get(key);
                                     final java.util.Collection list;
                                     if (current instanceof java.util.Collection) {
                                       list = (java.util.Collection) current;
                                     } else {
                                       list = new ArrayList<java.lang.Object>();
                                       list.add(current);
                                       myData.put(key, list);
                                     }
                                     list.add(value);
                                   } else {
                                     myData.put(key, value);
                                   }
                                   """
                                )
                            }

                            method("removeValue") {
                                parameters = listOf(Parameter("key", "String", NOT_NULL))
                                line("myData.remove(key);")
                            }
                        }

                        konstructor(
                            "public",
                            listOf(Parameter("data", "HashMap<String,java.lang.Object>", NOT_NULL)),
                            type.parentType?.let { listOf("data") })

                        method("build", typeName) {
                            annotations = NOT_NULL
                            line("return new $typeName(myData);")
                        }

                        allFields.filter { it.name != null }.forEach { field ->
                            val name = field.name!!.capitalize()
                            val eitherTypes = sink.getEitherTypes(field)
                            eitherTypes.forEachIndexed { i, fieldType ->
                                method(sanitizeIdentifier(name.decapitalize()), "Builder") {
                                    comment = """
                                        ${field.comment}
                                        @param ${getVariableName(fieldType, name)} value to set
                                        @return this builder instance
                                    """.trimIndent()
                                    parameters =
                                        listOf(Parameter(getVariableName(fieldType, name), fieldType, NOT_NULL))
                                    annotations = NOT_NULL

                                    if (name != "Id") {
                                        line(
                                            "putValue(\"${name.decapitalize()}\", ${
                                                getVariableName(
                                                    fieldType,
                                                    name
                                                )
                                            });"
                                        )
                                    } else {
                                        line(
                                            "myData.put(\"${name.decapitalize()}\", ${
                                                getVariableName(
                                                    fieldType,
                                                    name
                                                )
                                            });"
                                        )
                                    }
                                    line("return this;")
                                }

                                // add overload accepting ThingBuilder<T>
                                val isEnum = findType(fieldType)?.isEnum != true &&
                                        (i >= field.dataTypes.size ||
                                                sink.types[field.dataTypes.elementAt(i)]?.isEnum != true
                                                )
                                if (!sink.shouldSkip(fieldType) &&
                                    findType(fieldType)?.isInterface != true &&
                                    isEnum &&
                                    fieldType != "String" &&
                                    fieldType != "Integer" &&
                                    fieldType != "java.util.Date"
                                ) {
                                    method(name.decapitalize(), "Builder") {
                                        comment = """
                                            ${field.comment}
                                            @param ${getVariableName(fieldType, name)} value to set
                                            @return this builder instance
                                        """.trimIndent()
                                        parameters = listOf(
                                            Parameter(
                                                getVariableName(fieldType, name),
                                                "${sanitizeIdentifier(fieldType)}.Builder", NOT_NULL
                                            )
                                        )
                                        annotations = NOT_NULL

                                        line(
                                            "putValue(\"${name.decapitalize()}\", ${
                                                getVariableName(
                                                    fieldType,
                                                    name
                                                )
                                            }.build());"
                                        )
                                        line("return this;")
                                    }
                                }
                            }
                            if (eitherTypes.isNotEmpty()) {
                                method("remove" + sanitizeIdentifier(name.capitalize()), "Builder") {
                                    comment = """
                                            Remove ${name.decapitalize()} property from the builder.
                                            If this property is repeatable, all instances are removed.
                                            @return this builder instance
                                        """.trimIndent()
                                    annotations = NOT_NULL

                                    line("removeValue(\"${name.decapitalize()}\");")
                                    line("return this;")
                                }

                                method("get" + sanitizeIdentifier(name.capitalize()), "java.lang.Object") {
                                    comment = """
                                            Get currently set value for ${name.decapitalize()} property in this builder.
                                            @return previously set value or {@code null}. If multiple values have been 
                                            set to this property, then {@link java.util.Collection} instance will be 
                                            returned.
                                        """.trimIndent()
                                    annotations = NULLABLE
                                    line("return myData.get(\"${name.decapitalize()}\");")
                                }
                            }
                        }

                        // support for integer id on all builders that have id
                        if (allFields.any { it.name?.equals("id", true) ?: false }) {
                            method("id", "Builder") {
                                parameters("id" to "long")
                                line("return id(Long.toString(id));")
                            }
                        }

                        if (type.parentType == null) {
                            method("fromMap") {
                                parameters("map" to "java.util.Map<String, java.lang.Object>")

                                line("for (java.util.Map.Entry<String, java.lang.Object> entry : map.entrySet()) {")
                                line("  final String key = entry.getKey();")
                                line("  java.lang.Object value = entry.getValue();")
                                line("  if (value instanceof java.util.List) {")
                                line("    final java.util.List list = (java.util.List) value;")
                                line("    for (java.lang.Object o : list) {")
                                line("      if (o instanceof java.util.Map) {")
                                line("        fromMap(key, ThingDeserializer.fromMap((java.util.Map<String, java.lang.Object>)o));")
                                line("      } else {")
                                line("        fromMap(key, o);")
                                line("      }")
                                line("    }")
                                line("  } else {")
                                line("    if (value instanceof java.util.Map) { value = ThingDeserializer.fromMap((java.util.Map<String,java.lang.Object>)value); }")
                                line("    fromMap(key, value);")
                                line("  }")
                                line("}")
                            }
                        }

                        method("fromMap") {
                            access = "protected"
                            parameters("key" to "String", "value" to "java.lang.Object")

                            lines(ownFields.flatMap {
                                val varName = it.name!!.decapitalize()
                                val fieldTypes = sink.getEitherTypes(it)

                                fieldTypes.flatMap {
                                    listOf(
                                        "if (\"$varName\".equals(key) && value instanceof $it) { this.${
                                            sanitizeIdentifier(
                                                varName
                                            )
                                        }(($it)value); return; }",
                                        "if (\"${varName}s\".equals(key) && value instanceof $it) { this.${
                                            sanitizeIdentifier(
                                                varName
                                            )
                                        }(($it)value); return; }"
                                    )
                                }
                            })

                            if (type.parentType == null) {
                                line("if (\"@id\".equals(key) && value instanceof String) { id((String)value); return; }")
                            }

                            if (type.parentType != null) {
                                annotations = OVERRIDE
                                line("super.fromMap(key, value);")
                            }
                        }
                    }
                }
            }
        }
    }

    private fun getMethodName(fieldType: String, fieldTypes: Collection<String>, name: String) = sanitizeIdentifier(
        when {
            fieldTypes.size == 1 -> "get$name"
            fieldType == "java.util.Date" -> "get${name}Date"
            else -> "get$name$fieldType"
        }
    )


    private fun findType(fieldType: String): GeneratorSink.Type? =
        sink.types.values.firstOrNull {
            it.name == fieldType && !it.isField
        }

    private fun subTypes(typeName: String) = sink.types.filter { it.value.parentType == typeName }

    private fun getVariableName(typeName: String, entityName: String? = null): String {
        val indexOfDot = typeName.lastIndexOf('.')
        if (indexOfDot > 0) {
            return sanitizeIdentifier(typeName.substring(indexOfDot + 1).decapitalize())
        }
        if (entityName != null && arrayOf("Boolean", "String", "Class", "Long", "Int", "Double", "Float").contains(
                typeName
            )
        ) {
            return sanitizeIdentifier(entityName.decapitalize())
        }
        return sanitizeIdentifier(typeName.decapitalize())
    }
}
