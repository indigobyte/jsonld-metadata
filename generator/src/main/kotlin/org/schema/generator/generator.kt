/*
 * Copyright 2015-2017 JetBrains s.r.o.
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

import org.semarglproject.rdf.RdfXmlParser
import org.semarglproject.rdf.rdfa.RdfaParser
import org.semarglproject.source.StreamProcessor
import java.io.File
import java.io.FileInputStream

/**
 * @author Victor Kropp
 */

private val BANNER = """/*
 * Copyright 2015-2017 JetBrains s.r.o.
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

private const val NAMESPACE = "org.schema"
private const val NAMESPACE_KOTLIN = "$NAMESPACE.kotlin"

fun main() {
    val sink = GeneratorSink()
    val processor = StreamProcessor(
        RdfXmlParser.connect(sink)
        //RdfaParser.connect(sink)
    )

    File("resources").listFiles { f -> f.extension == "rdf" }?.forEach {
        println("Processing ${it.name}")
        processor.process(FileInputStream(it), "http://schema.org/")
    }
    sink.postProcess()

    sources("../src/generated/java") {
        pakage(NAMESPACE) {
            println("Generating Java classes")
            ClassesGenerator(sink, BANNER).generate(this)

            println("Generating API")
            ApiGenerator(sink, BANNER).generate(this)
        }
    }

    //sources("../kotlin/src/generated/kotlin") {
    //    pakage(NAMESPACE_KOTLIN) {
    //        println("Generating Kotlin classes")
    //        KotlinClassesGenerator(sink, BANNER).generate(this)
    //    }
    //}

    sources("../src/generated-test/java") {
        pakage(NAMESPACE) {
            println("Generating tests")
            TestsGenerator(sink, BANNER).generate(this)
        }
    }
}
