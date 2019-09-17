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

import org.semarglproject.sink.TripleSink
import java.util.*

fun <K,V> MutableMap<K,V>.doWith(key: K, block: V.() -> Unit) {
    this.getValue(key).let {
        this[key] = it.apply { block() }
    }
}

class GeneratorSink : TripleSink {
    private var uri: String = "http://schema.org/"

    private val ID_TYPE = "http://schema.org/@id"

    private val NUMBER_UNDERLYING_TYPES = listOf("Integer", "Long", "Float", "Double", "String")
    
    private val subjects = mutableSetOf<String>()
    private val predicates = mutableSetOf<String>()
    private val objects = mutableSetOf<String>()

    data class Type(
            var isSuperseded: Boolean = false,
            var isInterface: Boolean = false,
            var name: String? = null,
            var parentType: String? = null,
            var comment: String? = null,
            var source: String? = null,
            var equivalent: String? = null,
            val subTypes: MutableList<String> = mutableListOf(),
            val interfaces: MutableList<String> = mutableListOf(),
            var isField: Boolean = false,
            val dataTypes: MutableList<String> = mutableListOf()
    ) {

        val classOrInterface
            get() = if (isInterface) "interface" else "class"

        val isEnum
            get() = parentType == "http://schema.org/Enumeration" && name != "QualitativeValue"
    }

    val types = hashMapOf<String, Type>().withDefault { Type() }

    override fun setProperty(key: String, value: Any): Boolean {
        return true
    }

    override fun endStream() {
    }

    fun postProcess() {
        println("Subjects\n========")
        println(subjects)
        println()
        println("Predicates\n==========")
        println(predicates)
        println()
        println("Objects\n=======")
        println(objects)
    
        for (type in types.values) {
            if (type.isField && type.isInterface) {
                type.isField = false
                type.dataTypes.forEach { types[it]!!.interfaces.add(type.name!!.capitalize()) }
            }
            if (type.name == "Thing") {
                type.subTypes.add(ID_TYPE)
            }
        }
        val idType = Type()
        idType.name = "Id"
        idType.isField = true
        idType.dataTypes.add("http://schema.org/Text")
        types.put(ID_TYPE, idType)
    }

    override fun setBaseUri(baseUri: String) {
        uri = baseUri
    }

    override fun startStream() {
    }

    override fun addNonLiteral(subj: String, pred: String, obj: String) {
        addNonLiteralOriginal(subj, pred, obj)
    }
    
    private fun addNonLiteralMine(subj: String, pred: String, obj: String) {
        //println("Subject: $subj -- Pred: $pred -- obj: $obj")
        subjects.add(subj)
        predicates.add(pred)
        objects.add(obj)
        when(pred) {
            "http://schema.org/" -> { /* ignore */ }
            // Top level types (aka classes)
            "http://www.w3.org/1999/02/22-rdf-syntax-ns#type" -> {
                println("Found Type ${subj} with obj ${obj}")
                if (!types.containsKey(subj)) {
                    println("Creating...")
                    types.put(subj, Type().apply { if (types.containsKey(obj)) parentType = obj })
                }
            }
            "http://www.w3.org/2000/01/rdf-schema#subClassOf",
                "rdfs:subClassOf" -> {
                    println("Making ${subj} a sublcass of ${obj}")
                    types[subj]!!.parentType = obj // ???
                }
            "http://schema.org/domainIncludes" -> {
                val objType = types[obj]

                if (objType != null) {
                    types[subj]?.let { subjType ->
                        if (!objType.subTypes.contains(subj)) {
                            objType.subTypes.add(subj)
                        }
                        subjType.isField = true
                    } ?: println("No SubjType, make one")

                } else {
                    val type = Type()
                    getInterfaceName(subj)?.let {
                        type.interfaces.add(it)
                    }

                    types[obj] = type

                    //type.subTypes.add(subj)
                    //val subjType = Type()
                    //subjType.isField = true
                    //types.add(subjType, subj)


                }
            }
            "http://schema.org/rangeIncludes" ->  types.doWith(subj) { dataTypes.add(obj) } //types[subj]!!.dataTypes.add(obj)
            "http://purl.org/dc/terms/source" -> {
                try {
                    types[subj]!!.source = obj
                } catch(e: Exception) {
                    println("No pred for $pred")
                }

            }
            "http://www.w3.org/2002/07/owl#equivalentClass",
                "owl:equivalentClass" -> types[subj]!!.equivalent = obj
            "http://www.w3.org/2002/07/owl#equivalentProperty",
                "owl:equivalentProperty"-> types[subj]!!.equivalent = obj
            "http://schema.org/inverseOf" -> { /* ignore */ }
            "http://schema.org/supersededBy" -> { types[subj]!!.isSuperseded = true }
            "http://www.w3.org/2000/01/rdf-schema#subPropertyOf",
                "rdfs:subPropertyOf"-> {
                //println("Making subPropertyOf ${obj} -> ${subj}")
                
                if (subj.contains("http:")) {
                    val interfaceType = Type()
                    // Create child type (subj)
                    interfaceType.name = getInterfaceName(subj)
                    interfaceType.isInterface = true
                    types.put(subj, interfaceType)

                    // Create parent type (obj)
                    if (!types.containsKey(obj)) types.put(obj, Type())
                    val type = types[obj]!!
                    if (type.isField) {
                        type.dataTypes.add(subj)
                    } else {
                        type.interfaces.add(interfaceType.name!!)
                    }
                }
            }
            else -> System.err.println("Unknown non-literal: $pred, $subj")
        }
    }
    
    
    
    private fun addNonLiteralOriginal(subj: String, pred: String, obj: String) {
        when(pred) {
            "http://www.w3.org/1999/02/22-rdf-syntax-ns#type" -> types.doWith(subj) { if (types.containsKey(obj)) parentType = obj }  //if(!types.containsKey(subj)) types.put(subj, Type().apply { if (types.containsKey(obj)) parentType = obj }) 
            "http://www.w3.org/2000/01/rdf-schema#subClassOf" -> types.doWith(subj) { parentType = obj } //types[subj]!!.parentType = obj
            "http://schema.org/domainIncludes" -> {
            if (subj.contains("fileFormat") || obj.contains("fileFormat")) {
                    println("domainIncludes: $subj -- $obj")
                    //System.exit(1)
                }
                types.doWith(obj) {
                    if (!subTypes.contains(subj)) subTypes.add(subj)
                }
                
                types.doWith(subj) {
                    getInterfaceName(subj)?.let {
                        name = it
                    }
                    isField = true
                }
            }
            "http://schema.org/rangeIncludes" -> types.doWith(subj) { dataTypes.add(obj) }
            "http://purl.org/dc/terms/source" -> types.doWith(subj) { source = obj }
            "http://www.w3.org/2002/07/owl#equivalentClass" -> types.doWith(subj) { equivalent = obj }
            "http://www.w3.org/2002/07/owl#equivalentProperty" -> types.doWith(subj) { equivalent = obj }
            "http://schema.org/inverseOf" -> { /* ignore */ }
            "http://schema.org/supersededBy" -> types.doWith(subj) { isSuperseded = true }
            "http://www.w3.org/2000/01/rdf-schema#subPropertyOf" -> {
                if (subj.contains("fileFormat") || obj.contains("fileFormat")) {
                   println("subPropertyOf: $subj -- $obj")
                    //System.exit(1)
                }
                
                getInterfaceName(obj)?.let {
                    val interfaceType = Type()
                    interfaceType.name = it
                    interfaceType.isInterface = true
                    types.put(obj, interfaceType)
    
                    if (!types.containsKey(subj)) types.put(subj, Type())
                    
                    val type = types[subj]!!
                    if (type.isField) {
                        type.dataTypes.add(obj)
                    } else {
                        type.interfaces.add(it)
                        //println("adding interface $it to $subj")
                    }
                } //?: println("${obj} not a valid interface type subprop")
            }
            else -> System.err.println("Unknown non-literal: $pred")
        }
    }
    

    private fun getInterfaceName(name: String): String? = if (name.contains(uri, true)) {
            name.substring(uri.length).capitalize()
        } else {
            null
        }
    
    override fun addPlainLiteral(subj: String, pred: String, content: String, lang: String?) {
        when(pred) {
            "http://www.w3.org/2000/01/rdf-schema#label" -> types.doWith(subj) { name = content.replace(" ", "").replace(".", "").capitalize() }
            "http://www.w3.org/2000/01/rdf-schema#comment" -> types.doWith(subj) { comment = content }
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

        return try {
            val name = field.dataTypes.firstOrNull { types[it]!!.isInterface } ?: field.dataTypes.firstOrNull()
            getBasicTypeName(types[name]?.name)
        } catch (e: Exception) {
            println("exception: ${e.message}")
            println("Failed to find a field for ${field.name} (${field.isInterface})")
            // TODO This is a hack.  They are basically an array list of strings
            when (field.name) {
                "Xpath", "CssSelector" -> "String"
                else -> null
            }
        }
    }

    fun getEitherTypes(field: Type): Collection<String> {
        if (field.isInterface && field.name != null)
            return listOf(field.name!!.capitalize())

        if (field.dataTypes[0] == "http://schema.org/Number") {
            return NUMBER_UNDERLYING_TYPES
        }

        if (field.dataTypes.size < 2) {
            return listOf(getFieldType(field) ?: "")
        }

        val interfaceName = field.dataTypes.firstOrNull { types[it]!!.isInterface }
        if (interfaceName != null)
            return listOf(types[interfaceName]!!.name!!)

        return field.dataTypes.mapNotNull { getBasicTypeName(types[it]?.name) }.distinct().sorted()
    }

    fun shouldSkip(name: String): Boolean {
        return arrayOf("Text", "DataType", "DateTime", "Date", "Time", "Boolean", "Number", "Integer", "Int", "Long", "Float", "Double", "URL", "True", "False", "Class", "Object").contains(name) ||
                name.contains("#") || name.contains("/")
    }

    fun getAllFields(type: Type?): Iterable<Type> {
        if (type == null) {
            return emptyList()
        }
        val fieldTypes = type.subTypes
            .mapNotNull { types[it] }
            //.filterNotNull()
            .filter { it.name != null && !it.isSuperseded && it.dataTypes.any() && it.dataTypes[0] != "http://schema.org/Class" }
            .toMutableList()
            
        getAllFields(types[type.parentType]).filterNot { i -> fieldTypes.any { it.name == i.name} }.forEach { fieldTypes.add(it) }
        return fieldTypes
    }
}
