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
 * Any specific branch of medical science or practice. Medical specialities include clinical specialties that pertain to particular organ systems and their respective disease states, as well as allied health specialties. Enumerated type.
 */
public enum MedicalSpecialty {
  Toxicologic("http://schema.org/Toxicologic"), Urologic("http://schema.org/Urologic"), Pathology("http://schema.org/Pathology"), Musculoskeletal("http://schema.org/Musculoskeletal"), Surgical("http://schema.org/Surgical"), Cardiovascular("http://schema.org/Cardiovascular"), Endocrine("http://schema.org/Endocrine"), LaboratoryScience("http://schema.org/LaboratoryScience"), Dentistry("http://schema.org/Dentistry"), Hematologic("http://schema.org/Hematologic"), Genetic("http://schema.org/Genetic"), Gastroenterologic("http://schema.org/Gastroenterologic"), Dermatologic("http://schema.org/Dermatologic"), PharmacySpecialty("http://schema.org/PharmacySpecialty"), Rheumatologic("http://schema.org/Rheumatologic"), Pulmonary("http://schema.org/Pulmonary"), Neurologic("http://schema.org/Neurologic"), Infectious("http://schema.org/Infectious"), Renal("http://schema.org/Renal"), Anesthesia("http://schema.org/Anesthesia"), SpeechPathology("http://schema.org/SpeechPathology");
  MedicalSpecialty(String value) {
    myValue = value;
  }
  @JsonValue
  public String getValue() { return myValue; }
  private String myValue;
}
