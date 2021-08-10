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
 * Design models for observational medical studies. Enumerated type.
 */
public enum MedicalObservationalStudyDesign {
  Longitudinal("http://schema.org/Longitudinal"), CrossSectional("http://schema.org/CrossSectional"), CaseSeries("http://schema.org/CaseSeries"), Observational("http://schema.org/Observational"), CohortStudy("http://schema.org/CohortStudy"), Registry("http://schema.org/Registry");
  MedicalObservationalStudyDesign(String value) {
    myValue = value;
  }
  @JsonValue
  public String getValue() { return myValue; }
  private String myValue;
}
