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
 * Design models for medical trials. Enumerated type.
 */
public enum MedicalTrialDesign {
  SingleBlindedTrial("http://schema.org/SingleBlindedTrial"), MultiCenterTrial("http://schema.org/MultiCenterTrial"), SingleCenterTrial("http://schema.org/SingleCenterTrial"), RandomizedTrial("http://schema.org/RandomizedTrial"), DoubleBlindedTrial("http://schema.org/DoubleBlindedTrial"), PlaceboControlledTrial("http://schema.org/PlaceboControlledTrial"), TripleBlindedTrial("http://schema.org/TripleBlindedTrial"), OpenTrial("http://schema.org/OpenTrial"), InternationalTrial("http://schema.org/InternationalTrial");
  MedicalTrialDesign(String value) {
    myValue = value;
  }
  @JsonValue
  public String getValue() { return myValue; }
  private String myValue;
}
