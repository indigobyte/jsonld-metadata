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
 * Categories that represent an assessment of the risk of fetal injury due to a drug or pharmaceutical used as directed by the mother during pregnancy.
 */
public enum DrugPregnancyCategory {
  FDAcategoryC("http://schema.org/FDAcategoryC"), FDAcategoryD("http://schema.org/FDAcategoryD"), FDAcategoryA("http://schema.org/FDAcategoryA"), FDAcategoryB("http://schema.org/FDAcategoryB"), FDAcategoryX("http://schema.org/FDAcategoryX"), FDAnotEvaluated("http://schema.org/FDAnotEvaluated");
  DrugPregnancyCategory(String value) {
    myValue = value;
  }
  @JsonValue
  public String getValue() { return myValue; }
  private String myValue;
}
