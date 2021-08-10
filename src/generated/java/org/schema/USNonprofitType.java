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
 *
 * This is auto-generated file. Do not edit.
 */

package org.schema;

import com.fasterxml.jackson.annotation.JsonValue;

/**
 * USNonprofitType: Non-profit organization type originating from the United States.
 */
public enum USNonprofitType {
  Nonprofit501k("http://schema.org/Nonprofit501k"), Nonprofit501n("http://schema.org/Nonprofit501n"), Nonprofit501q("http://schema.org/Nonprofit501q"), Nonprofit501d("http://schema.org/Nonprofit501d"), Nonprofit501e("http://schema.org/Nonprofit501e"), Nonprofit501f("http://schema.org/Nonprofit501f"), Nonprofit501a("http://schema.org/Nonprofit501a"), Nonprofit501c19("http://schema.org/Nonprofit501c19"), Nonprofit501c28("http://schema.org/Nonprofit501c28"), Nonprofit501c27("http://schema.org/Nonprofit501c27"), Nonprofit501c26("http://schema.org/Nonprofit501c26"), Nonprofit501c25("http://schema.org/Nonprofit501c25"), Nonprofit501c24("http://schema.org/Nonprofit501c24"), Nonprofit501c23("http://schema.org/Nonprofit501c23"), Nonprofit501c22("http://schema.org/Nonprofit501c22"), Nonprofit501c21("http://schema.org/Nonprofit501c21"), Nonprofit501c20("http://schema.org/Nonprofit501c20"), Nonprofit501c18("http://schema.org/Nonprofit501c18"), Nonprofit501c17("http://schema.org/Nonprofit501c17"), Nonprofit501c16("http://schema.org/Nonprofit501c16"), Nonprofit501c15("http://schema.org/Nonprofit501c15"), Nonprofit501c14("http://schema.org/Nonprofit501c14"), Nonprofit501c13("http://schema.org/Nonprofit501c13"), Nonprofit501c12("http://schema.org/Nonprofit501c12"), Nonprofit501c11("http://schema.org/Nonprofit501c11"), Nonprofit501c10("http://schema.org/Nonprofit501c10"), Nonprofit501c9("http://schema.org/Nonprofit501c9"), Nonprofit501c8("http://schema.org/Nonprofit501c8"), Nonprofit501c7("http://schema.org/Nonprofit501c7"), Nonprofit501c6("http://schema.org/Nonprofit501c6"), Nonprofit501c5("http://schema.org/Nonprofit501c5"), Nonprofit501c4("http://schema.org/Nonprofit501c4"), Nonprofit501c3("http://schema.org/Nonprofit501c3"), Nonprofit501c2("http://schema.org/Nonprofit501c2"), Nonprofit501c1("http://schema.org/Nonprofit501c1"), Nonprofit527("http://schema.org/Nonprofit527");
  USNonprofitType(String value) {
    myValue = value;
  }
  @JsonValue
  public String getValue() { return myValue; }
  private String myValue;
}
