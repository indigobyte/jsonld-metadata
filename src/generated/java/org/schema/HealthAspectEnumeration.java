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
 * HealthAspectEnumeration enumerates several aspects of health content online, each of which might be described using [[hasHealthAspect]] and [[HealthTopicContent]].
 */
public enum HealthAspectEnumeration {
  AllergiesHealthAspect("http://schema.org/AllergiesHealthAspect"), MisconceptionsHealthAspect("http://schema.org/MisconceptionsHealthAspect"), PregnancyHealthAspect("http://schema.org/PregnancyHealthAspect"), StagesHealthAspect("http://schema.org/StagesHealthAspect"), RelatedTopicsHealthAspect("http://schema.org/RelatedTopicsHealthAspect"), ScreeningHealthAspect("http://schema.org/ScreeningHealthAspect"), SeeDoctorHealthAspect("http://schema.org/SeeDoctorHealthAspect"), GettingAccessHealthAspect("http://schema.org/GettingAccessHealthAspect"), OverviewHealthAspect("http://schema.org/OverviewHealthAspect"), SymptomsHealthAspect("http://schema.org/SymptomsHealthAspect"), CausesHealthAspect("http://schema.org/CausesHealthAspect"), MayTreatHealthAspect("http://schema.org/MayTreatHealthAspect"), HowOrWhereHealthAspect("http://schema.org/HowOrWhereHealthAspect"), BenefitsHealthAspect("http://schema.org/BenefitsHealthAspect"), PatientExperienceHealthAspect("http://schema.org/PatientExperienceHealthAspect"), PrognosisHealthAspect("http://schema.org/PrognosisHealthAspect"), TreatmentsHealthAspect("http://schema.org/TreatmentsHealthAspect"), PreventionHealthAspect("http://schema.org/PreventionHealthAspect"), TypesHealthAspect("http://schema.org/TypesHealthAspect"), SelfCareHealthAspect("http://schema.org/SelfCareHealthAspect"), SideEffectsHealthAspect("http://schema.org/SideEffectsHealthAspect"), EffectivenessHealthAspect("http://schema.org/EffectivenessHealthAspect"), SafetyHealthAspect("http://schema.org/SafetyHealthAspect"), IngredientsHealthAspect("http://schema.org/IngredientsHealthAspect"), RisksOrComplicationsHealthAspect("http://schema.org/RisksOrComplicationsHealthAspect"), LivingWithHealthAspect("http://schema.org/LivingWithHealthAspect"), UsageOrScheduleHealthAspect("http://schema.org/UsageOrScheduleHealthAspect"), HowItWorksHealthAspect("http://schema.org/HowItWorksHealthAspect"), ContagiousnessHealthAspect("http://schema.org/ContagiousnessHealthAspect");
  HealthAspectEnumeration(String value) {
    myValue = value;
  }
  @JsonValue
  public String getValue() { return myValue; }
  private String myValue;
}
