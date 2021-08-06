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
 * Enumerates the EU energy efficiency classes A-G as well as A+, A++, and A+++ as defined in EU directive 2017/1369.
 */
public enum EUEnergyEfficiencyEnumeration {
  EUEnergyEfficiencyCategoryA3Plus("http://schema.org/EUEnergyEfficiencyCategoryA3Plus"), EUEnergyEfficiencyCategoryA1Plus("http://schema.org/EUEnergyEfficiencyCategoryA1Plus"), EUEnergyEfficiencyCategoryA("http://schema.org/EUEnergyEfficiencyCategoryA"), EUEnergyEfficiencyCategoryB("http://schema.org/EUEnergyEfficiencyCategoryB"), EUEnergyEfficiencyCategoryC("http://schema.org/EUEnergyEfficiencyCategoryC"), EUEnergyEfficiencyCategoryD("http://schema.org/EUEnergyEfficiencyCategoryD"), EUEnergyEfficiencyCategoryE("http://schema.org/EUEnergyEfficiencyCategoryE"), EUEnergyEfficiencyCategoryF("http://schema.org/EUEnergyEfficiencyCategoryF"), EUEnergyEfficiencyCategoryG("http://schema.org/EUEnergyEfficiencyCategoryG"), EUEnergyEfficiencyCategoryA2Plus("http://schema.org/EUEnergyEfficiencyCategoryA2Plus");
  EUEnergyEfficiencyEnumeration(String value) {
    myValue = value;
  }
  @JsonValue
  public String getValue() { return myValue; }
  private String myValue;
}
