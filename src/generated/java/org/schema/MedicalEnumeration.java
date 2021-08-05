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
 * Enumerations related to health and the practice of medicine: A concept that is used to attribute a quality to another concept, as a qualifier, a collection of items or a listing of all of the elements of a set in medicine practice.
 */
public enum MedicalEnumeration {
  PhysicalExam("http://schema.org/PhysicalExam"), MedicalObservationalStudyDesign("http://schema.org/MedicalObservationalStudyDesign"), MedicalDevicePurpose("http://schema.org/MedicalDevicePurpose"), MedicalImagingTechnique("http://schema.org/MedicalImagingTechnique"), DrugCost("http://schema.org/DrugCost"), MedicalProcedureType("http://schema.org/MedicalProcedureType"), MedicalTrialDesign("http://schema.org/MedicalTrialDesign"), MedicalSpecialty("http://schema.org/MedicalSpecialty"), MedicalStudyStatus("http://schema.org/MedicalStudyStatus"), DrugCostCategory("http://schema.org/DrugCostCategory"), MedicalEvidenceLevel("http://schema.org/MedicalEvidenceLevel"), MedicineSystem("http://schema.org/MedicineSystem"), DrugPrescriptionStatus("http://schema.org/DrugPrescriptionStatus"), DrugPregnancyCategory("http://schema.org/DrugPregnancyCategory"), DrugClass("http://schema.org/DrugClass"), InfectiousAgentClass("http://schema.org/InfectiousAgentClass");
  MedicalEnumeration(String value) {
    myValue = value;
  }
  @JsonValue
  public String getValue() { return myValue; }
  private String myValue;
}
