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

import com.fasterxml.jackson.databind.annotation.*;
import com.fasterxml.jackson.annotation.*;
import org.jetbrains.annotations.NotNull;
import java.util.*;

/**
 * Any condition of the human body that affects the normal functioning of a person, whether physically or mentally. Includes diseases, injuries, disabilities, disorders, syndromes, etc.
 */
public class MedicalCondition extends MedicalEntity {
  /**
   * Specifying a drug or medicine used in a medication procedure.
   */
  @JsonIgnore public Drug getDrug() {
    return (Drug) getValue("drug");
  }
  /**
   * Specifying a drug or medicine used in a medication procedure.
   */
  @JsonIgnore public java.util.Collection<Drug> getDrugs() {
    final java.lang.Object current = myData.get("drug");
    if (current == null) return Collections.emptyList();
    if (current instanceof java.util.Collection) {
      return (java.util.Collection<Drug>) current;
    }
    return Arrays.asList((Drug) current);
  }
  /**
   * The anatomy of the underlying organ system or structures associated with this entity.
   */
  @JsonIgnore public AnatomicalStructure getAssociatedAnatomyAnatomicalStructure() {
    return (AnatomicalStructure) getValue("associatedAnatomy");
  }
  /**
   * The anatomy of the underlying organ system or structures associated with this entity.
   */
  @JsonIgnore public java.util.Collection<AnatomicalStructure> getAssociatedAnatomyAnatomicalStructures() {
    final java.lang.Object current = myData.get("associatedAnatomy");
    if (current == null) return Collections.emptyList();
    if (current instanceof java.util.Collection) {
      return (java.util.Collection<AnatomicalStructure>) current;
    }
    return Arrays.asList((AnatomicalStructure) current);
  }
  /**
   * The anatomy of the underlying organ system or structures associated with this entity.
   */
  @JsonIgnore public AnatomicalSystem getAssociatedAnatomyAnatomicalSystem() {
    return (AnatomicalSystem) getValue("associatedAnatomy");
  }
  /**
   * The anatomy of the underlying organ system or structures associated with this entity.
   */
  @JsonIgnore public java.util.Collection<AnatomicalSystem> getAssociatedAnatomyAnatomicalSystems() {
    final java.lang.Object current = myData.get("associatedAnatomy");
    if (current == null) return Collections.emptyList();
    if (current instanceof java.util.Collection) {
      return (java.util.Collection<AnatomicalSystem>) current;
    }
    return Arrays.asList((AnatomicalSystem) current);
  }
  /**
   * The anatomy of the underlying organ system or structures associated with this entity.
   */
  @JsonIgnore public SuperficialAnatomy getAssociatedAnatomySuperficialAnatomy() {
    return (SuperficialAnatomy) getValue("associatedAnatomy");
  }
  /**
   * The anatomy of the underlying organ system or structures associated with this entity.
   */
  @JsonIgnore public java.util.Collection<SuperficialAnatomy> getAssociatedAnatomySuperficialAnatomys() {
    final java.lang.Object current = myData.get("associatedAnatomy");
    if (current == null) return Collections.emptyList();
    if (current instanceof java.util.Collection) {
      return (java.util.Collection<SuperficialAnatomy>) current;
    }
    return Arrays.asList((SuperficialAnatomy) current);
  }
  /**
   * The status of the study (enumerated).
   */
  @JsonIgnore public EventStatusType getStatusEventStatusType() {
    return (EventStatusType) getValue("status");
  }
  /**
   * The status of the study (enumerated).
   */
  @JsonIgnore public java.util.Collection<EventStatusType> getStatusEventStatusTypes() {
    final java.lang.Object current = myData.get("status");
    if (current == null) return Collections.emptyList();
    if (current instanceof java.util.Collection) {
      return (java.util.Collection<EventStatusType>) current;
    }
    return Arrays.asList((EventStatusType) current);
  }
  /**
   * The status of the study (enumerated).
   */
  @JsonIgnore public MedicalStudyStatus getStatusMedicalStudyStatus() {
    return (MedicalStudyStatus) getValue("status");
  }
  /**
   * The status of the study (enumerated).
   */
  @JsonIgnore public java.util.Collection<MedicalStudyStatus> getStatusMedicalStudyStatuss() {
    final java.lang.Object current = myData.get("status");
    if (current == null) return Collections.emptyList();
    if (current instanceof java.util.Collection) {
      return (java.util.Collection<MedicalStudyStatus>) current;
    }
    return Arrays.asList((MedicalStudyStatus) current);
  }
  /**
   * The status of the study (enumerated).
   */
  @JsonIgnore public String getStatusString() {
    return (String) getValue("status");
  }
  /**
   * The status of the study (enumerated).
   */
  @JsonIgnore public java.util.Collection<String> getStatusStrings() {
    final java.lang.Object current = myData.get("status");
    if (current == null) return Collections.emptyList();
    if (current instanceof java.util.Collection) {
      return (java.util.Collection<String>) current;
    }
    return Arrays.asList((String) current);
  }
  /**
   * A medical test typically performed given this condition.
   */
  @JsonIgnore public MedicalTest getTypicalTest() {
    return (MedicalTest) getValue("typicalTest");
  }
  /**
   * A medical test typically performed given this condition.
   */
  @JsonIgnore public java.util.Collection<MedicalTest> getTypicalTests() {
    final java.lang.Object current = myData.get("typicalTest");
    if (current == null) return Collections.emptyList();
    if (current instanceof java.util.Collection) {
      return (java.util.Collection<MedicalTest>) current;
    }
    return Arrays.asList((MedicalTest) current);
  }
  /**
   * The stage of the condition, if applicable.
   */
  @JsonIgnore public MedicalConditionStage getStage() {
    return (MedicalConditionStage) getValue("stage");
  }
  /**
   * The stage of the condition, if applicable.
   */
  @JsonIgnore public java.util.Collection<MedicalConditionStage> getStages() {
    final java.lang.Object current = myData.get("stage");
    if (current == null) return Collections.emptyList();
    if (current instanceof java.util.Collection) {
      return (java.util.Collection<MedicalConditionStage>) current;
    }
    return Arrays.asList((MedicalConditionStage) current);
  }
  /**
   * A modifiable or non-modifiable factor that increases the risk of a patient contracting this condition, e.g. age,  coexisting condition.
   */
  @JsonIgnore public MedicalRiskFactor getRiskFactor() {
    return (MedicalRiskFactor) getValue("riskFactor");
  }
  /**
   * A modifiable or non-modifiable factor that increases the risk of a patient contracting this condition, e.g. age,  coexisting condition.
   */
  @JsonIgnore public java.util.Collection<MedicalRiskFactor> getRiskFactors() {
    final java.lang.Object current = myData.get("riskFactor");
    if (current == null) return Collections.emptyList();
    if (current instanceof java.util.Collection) {
      return (java.util.Collection<MedicalRiskFactor>) current;
    }
    return Arrays.asList((MedicalRiskFactor) current);
  }
  /**
   * One of a set of differential diagnoses for the condition. Specifically, a closely-related or competing diagnosis typically considered later in the cognitive process whereby this medical condition is distinguished from others most likely responsible for a similar collection of signs and symptoms to reach the most parsimonious diagnosis or diagnoses in a patient.
   */
  @JsonIgnore public DDxElement getDifferentialDiagnosis() {
    return (DDxElement) getValue("differentialDiagnosis");
  }
  /**
   * One of a set of differential diagnoses for the condition. Specifically, a closely-related or competing diagnosis typically considered later in the cognitive process whereby this medical condition is distinguished from others most likely responsible for a similar collection of signs and symptoms to reach the most parsimonious diagnosis or diagnoses in a patient.
   */
  @JsonIgnore public java.util.Collection<DDxElement> getDifferentialDiagnosiss() {
    final java.lang.Object current = myData.get("differentialDiagnosis");
    if (current == null) return Collections.emptyList();
    if (current instanceof java.util.Collection) {
      return (java.util.Collection<DDxElement>) current;
    }
    return Arrays.asList((DDxElement) current);
  }
  /**
   * The likely outcome in either the short term or long term of the medical condition.
   */
  @JsonIgnore public String getExpectedPrognosis() {
    return (String) getValue("expectedPrognosis");
  }
  /**
   * The likely outcome in either the short term or long term of the medical condition.
   */
  @JsonIgnore public java.util.Collection<String> getExpectedPrognosiss() {
    final java.lang.Object current = myData.get("expectedPrognosis");
    if (current == null) return Collections.emptyList();
    if (current instanceof java.util.Collection) {
      return (java.util.Collection<String>) current;
    }
    return Arrays.asList((String) current);
  }
  /**
   * A possible treatment to address this condition, sign or symptom.
   */
  @JsonIgnore public MedicalTherapy getPossibleTreatment() {
    return (MedicalTherapy) getValue("possibleTreatment");
  }
  /**
   * A possible treatment to address this condition, sign or symptom.
   */
  @JsonIgnore public java.util.Collection<MedicalTherapy> getPossibleTreatments() {
    final java.lang.Object current = myData.get("possibleTreatment");
    if (current == null) return Collections.emptyList();
    if (current instanceof java.util.Collection) {
      return (java.util.Collection<MedicalTherapy>) current;
    }
    return Arrays.asList((MedicalTherapy) current);
  }
  /**
   * Changes in the normal mechanical, physical, and biochemical functions that are associated with this activity or condition.
   */
  @JsonIgnore public String getPathophysiology() {
    return (String) getValue("pathophysiology");
  }
  /**
   * Changes in the normal mechanical, physical, and biochemical functions that are associated with this activity or condition.
   */
  @JsonIgnore public java.util.Collection<String> getPathophysiologys() {
    final java.lang.Object current = myData.get("pathophysiology");
    if (current == null) return Collections.emptyList();
    if (current instanceof java.util.Collection) {
      return (java.util.Collection<String>) current;
    }
    return Arrays.asList((String) current);
  }
  /**
   * The characteristics of associated patients, such as age, gender, race etc.
   */
  @JsonIgnore public String getEpidemiology() {
    return (String) getValue("epidemiology");
  }
  /**
   * The characteristics of associated patients, such as age, gender, race etc.
   */
  @JsonIgnore public java.util.Collection<String> getEpidemiologys() {
    final java.lang.Object current = myData.get("epidemiology");
    if (current == null) return Collections.emptyList();
    if (current instanceof java.util.Collection) {
      return (java.util.Collection<String>) current;
    }
    return Arrays.asList((String) current);
  }
  /**
   * A preventative therapy used to prevent reoccurrence of the medical condition after an initial episode of the condition.
   */
  @JsonIgnore public MedicalTherapy getSecondaryPrevention() {
    return (MedicalTherapy) getValue("secondaryPrevention");
  }
  /**
   * A preventative therapy used to prevent reoccurrence of the medical condition after an initial episode of the condition.
   */
  @JsonIgnore public java.util.Collection<MedicalTherapy> getSecondaryPreventions() {
    final java.lang.Object current = myData.get("secondaryPrevention");
    if (current == null) return Collections.emptyList();
    if (current instanceof java.util.Collection) {
      return (java.util.Collection<MedicalTherapy>) current;
    }
    return Arrays.asList((MedicalTherapy) current);
  }
  /**
   * A possible unexpected and unfavorable evolution of a medical condition. Complications may include worsening of the signs or symptoms of the disease, extension of the condition to other organ systems, etc.
   */
  @JsonIgnore public String getPossibleComplication() {
    return (String) getValue("possibleComplication");
  }
  /**
   * A possible unexpected and unfavorable evolution of a medical condition. Complications may include worsening of the signs or symptoms of the disease, extension of the condition to other organ systems, etc.
   */
  @JsonIgnore public java.util.Collection<String> getPossibleComplications() {
    final java.lang.Object current = myData.get("possibleComplication");
    if (current == null) return Collections.emptyList();
    if (current instanceof java.util.Collection) {
      return (java.util.Collection<String>) current;
    }
    return Arrays.asList((String) current);
  }
  /**
   * A sign or symptom of this condition. Signs are objective or physically observable manifestations of the medical condition while symptoms are the subjective experience of the medical condition.
   */
  @JsonIgnore public MedicalSignOrSymptom getSignOrSymptom() {
    return (MedicalSignOrSymptom) getValue("signOrSymptom");
  }
  /**
   * A sign or symptom of this condition. Signs are objective or physically observable manifestations of the medical condition while symptoms are the subjective experience of the medical condition.
   */
  @JsonIgnore public java.util.Collection<MedicalSignOrSymptom> getSignOrSymptoms() {
    final java.lang.Object current = myData.get("signOrSymptom");
    if (current == null) return Collections.emptyList();
    if (current instanceof java.util.Collection) {
      return (java.util.Collection<MedicalSignOrSymptom>) current;
    }
    return Arrays.asList((MedicalSignOrSymptom) current);
  }
  /**
   * The expected progression of the condition if it is not treated and allowed to progress naturally.
   */
  @JsonIgnore public String getNaturalProgression() {
    return (String) getValue("naturalProgression");
  }
  /**
   * The expected progression of the condition if it is not treated and allowed to progress naturally.
   */
  @JsonIgnore public java.util.Collection<String> getNaturalProgressions() {
    final java.lang.Object current = myData.get("naturalProgression");
    if (current == null) return Collections.emptyList();
    if (current instanceof java.util.Collection) {
      return (java.util.Collection<String>) current;
    }
    return Arrays.asList((String) current);
  }
  /**
   * A preventative therapy used to prevent an initial occurrence of the medical condition, such as vaccination.
   */
  @JsonIgnore public MedicalTherapy getPrimaryPrevention() {
    return (MedicalTherapy) getValue("primaryPrevention");
  }
  /**
   * A preventative therapy used to prevent an initial occurrence of the medical condition, such as vaccination.
   */
  @JsonIgnore public java.util.Collection<MedicalTherapy> getPrimaryPreventions() {
    final java.lang.Object current = myData.get("primaryPrevention");
    if (current == null) return Collections.emptyList();
    if (current instanceof java.util.Collection) {
      return (java.util.Collection<MedicalTherapy>) current;
    }
    return Arrays.asList((MedicalTherapy) current);
  }
  protected MedicalCondition(java.util.Map<String,java.lang.Object> data) {
    super(data);
  }
  
  /**
   * Builder for {@link MedicalCondition}
   */
  public static class Builder extends MedicalEntity.Builder {
    public Builder(@NotNull HashMap<String,java.lang.Object> data) {
      super(data);
    }
    @NotNull public MedicalCondition build() {
      return new MedicalCondition(myData);
    }
    /**
     * Specifying a drug or medicine used in a medication procedure.
     */
    @NotNull public Builder drug(@NotNull Drug drug) {
      putValue("drug", drug);
      return this;
    }
    /**
     * Specifying a drug or medicine used in a medication procedure.
     */
    @NotNull public Builder drug(@NotNull Drug.Builder drug) {
      putValue("drug", drug.build());
      return this;
    }
    /**
     * The anatomy of the underlying organ system or structures associated with this entity.
     */
    @NotNull public Builder associatedAnatomy(@NotNull AnatomicalStructure anatomicalStructure) {
      putValue("associatedAnatomy", anatomicalStructure);
      return this;
    }
    /**
     * The anatomy of the underlying organ system or structures associated with this entity.
     */
    @NotNull public Builder associatedAnatomy(@NotNull AnatomicalStructure.Builder anatomicalStructure) {
      putValue("associatedAnatomy", anatomicalStructure.build());
      return this;
    }
    /**
     * The anatomy of the underlying organ system or structures associated with this entity.
     */
    @NotNull public Builder associatedAnatomy(@NotNull AnatomicalSystem anatomicalSystem) {
      putValue("associatedAnatomy", anatomicalSystem);
      return this;
    }
    /**
     * The anatomy of the underlying organ system or structures associated with this entity.
     */
    @NotNull public Builder associatedAnatomy(@NotNull AnatomicalSystem.Builder anatomicalSystem) {
      putValue("associatedAnatomy", anatomicalSystem.build());
      return this;
    }
    /**
     * The anatomy of the underlying organ system or structures associated with this entity.
     */
    @NotNull public Builder associatedAnatomy(@NotNull SuperficialAnatomy superficialAnatomy) {
      putValue("associatedAnatomy", superficialAnatomy);
      return this;
    }
    /**
     * The anatomy of the underlying organ system or structures associated with this entity.
     */
    @NotNull public Builder associatedAnatomy(@NotNull SuperficialAnatomy.Builder superficialAnatomy) {
      putValue("associatedAnatomy", superficialAnatomy.build());
      return this;
    }
    /**
     * The status of the study (enumerated).
     */
    @NotNull public Builder status(@NotNull EventStatusType eventStatusType) {
      putValue("status", eventStatusType);
      return this;
    }
    /**
     * The status of the study (enumerated).
     */
    @NotNull public Builder status(@NotNull MedicalStudyStatus medicalStudyStatus) {
      putValue("status", medicalStudyStatus);
      return this;
    }
    /**
     * The status of the study (enumerated).
     */
    @NotNull public Builder status(@NotNull String status) {
      putValue("status", status);
      return this;
    }
    /**
     * A medical test typically performed given this condition.
     */
    @NotNull public Builder typicalTest(@NotNull MedicalTest medicalTest) {
      putValue("typicalTest", medicalTest);
      return this;
    }
    /**
     * A medical test typically performed given this condition.
     */
    @NotNull public Builder typicalTest(@NotNull MedicalTest.Builder medicalTest) {
      putValue("typicalTest", medicalTest.build());
      return this;
    }
    /**
     * The stage of the condition, if applicable.
     */
    @NotNull public Builder stage(@NotNull MedicalConditionStage medicalConditionStage) {
      putValue("stage", medicalConditionStage);
      return this;
    }
    /**
     * The stage of the condition, if applicable.
     */
    @NotNull public Builder stage(@NotNull MedicalConditionStage.Builder medicalConditionStage) {
      putValue("stage", medicalConditionStage.build());
      return this;
    }
    /**
     * A modifiable or non-modifiable factor that increases the risk of a patient contracting this condition, e.g. age,  coexisting condition.
     */
    @NotNull public Builder riskFactor(@NotNull MedicalRiskFactor medicalRiskFactor) {
      putValue("riskFactor", medicalRiskFactor);
      return this;
    }
    /**
     * A modifiable or non-modifiable factor that increases the risk of a patient contracting this condition, e.g. age,  coexisting condition.
     */
    @NotNull public Builder riskFactor(@NotNull MedicalRiskFactor.Builder medicalRiskFactor) {
      putValue("riskFactor", medicalRiskFactor.build());
      return this;
    }
    /**
     * One of a set of differential diagnoses for the condition. Specifically, a closely-related or competing diagnosis typically considered later in the cognitive process whereby this medical condition is distinguished from others most likely responsible for a similar collection of signs and symptoms to reach the most parsimonious diagnosis or diagnoses in a patient.
     */
    @NotNull public Builder differentialDiagnosis(@NotNull DDxElement dDxElement) {
      putValue("differentialDiagnosis", dDxElement);
      return this;
    }
    /**
     * One of a set of differential diagnoses for the condition. Specifically, a closely-related or competing diagnosis typically considered later in the cognitive process whereby this medical condition is distinguished from others most likely responsible for a similar collection of signs and symptoms to reach the most parsimonious diagnosis or diagnoses in a patient.
     */
    @NotNull public Builder differentialDiagnosis(@NotNull DDxElement.Builder dDxElement) {
      putValue("differentialDiagnosis", dDxElement.build());
      return this;
    }
    /**
     * The likely outcome in either the short term or long term of the medical condition.
     */
    @NotNull public Builder expectedPrognosis(@NotNull String expectedPrognosis) {
      putValue("expectedPrognosis", expectedPrognosis);
      return this;
    }
    /**
     * A possible treatment to address this condition, sign or symptom.
     */
    @NotNull public Builder possibleTreatment(@NotNull MedicalTherapy medicalTherapy) {
      putValue("possibleTreatment", medicalTherapy);
      return this;
    }
    /**
     * A possible treatment to address this condition, sign or symptom.
     */
    @NotNull public Builder possibleTreatment(@NotNull MedicalTherapy.Builder medicalTherapy) {
      putValue("possibleTreatment", medicalTherapy.build());
      return this;
    }
    /**
     * Changes in the normal mechanical, physical, and biochemical functions that are associated with this activity or condition.
     */
    @NotNull public Builder pathophysiology(@NotNull String pathophysiology) {
      putValue("pathophysiology", pathophysiology);
      return this;
    }
    /**
     * The characteristics of associated patients, such as age, gender, race etc.
     */
    @NotNull public Builder epidemiology(@NotNull String epidemiology) {
      putValue("epidemiology", epidemiology);
      return this;
    }
    /**
     * A preventative therapy used to prevent reoccurrence of the medical condition after an initial episode of the condition.
     */
    @NotNull public Builder secondaryPrevention(@NotNull MedicalTherapy medicalTherapy) {
      putValue("secondaryPrevention", medicalTherapy);
      return this;
    }
    /**
     * A preventative therapy used to prevent reoccurrence of the medical condition after an initial episode of the condition.
     */
    @NotNull public Builder secondaryPrevention(@NotNull MedicalTherapy.Builder medicalTherapy) {
      putValue("secondaryPrevention", medicalTherapy.build());
      return this;
    }
    /**
     * A possible unexpected and unfavorable evolution of a medical condition. Complications may include worsening of the signs or symptoms of the disease, extension of the condition to other organ systems, etc.
     */
    @NotNull public Builder possibleComplication(@NotNull String possibleComplication) {
      putValue("possibleComplication", possibleComplication);
      return this;
    }
    /**
     * A sign or symptom of this condition. Signs are objective or physically observable manifestations of the medical condition while symptoms are the subjective experience of the medical condition.
     */
    @NotNull public Builder signOrSymptom(@NotNull MedicalSignOrSymptom medicalSignOrSymptom) {
      putValue("signOrSymptom", medicalSignOrSymptom);
      return this;
    }
    /**
     * A sign or symptom of this condition. Signs are objective or physically observable manifestations of the medical condition while symptoms are the subjective experience of the medical condition.
     */
    @NotNull public Builder signOrSymptom(@NotNull MedicalSignOrSymptom.Builder medicalSignOrSymptom) {
      putValue("signOrSymptom", medicalSignOrSymptom.build());
      return this;
    }
    /**
     * The expected progression of the condition if it is not treated and allowed to progress naturally.
     */
    @NotNull public Builder naturalProgression(@NotNull String naturalProgression) {
      putValue("naturalProgression", naturalProgression);
      return this;
    }
    /**
     * A preventative therapy used to prevent an initial occurrence of the medical condition, such as vaccination.
     */
    @NotNull public Builder primaryPrevention(@NotNull MedicalTherapy medicalTherapy) {
      putValue("primaryPrevention", medicalTherapy);
      return this;
    }
    /**
     * A preventative therapy used to prevent an initial occurrence of the medical condition, such as vaccination.
     */
    @NotNull public Builder primaryPrevention(@NotNull MedicalTherapy.Builder medicalTherapy) {
      putValue("primaryPrevention", medicalTherapy.build());
      return this;
    }
    /**
     * The drug or supplement's legal status, including any controlled substance schedules that apply.
     */
    @NotNull public Builder legalStatus(@NotNull DrugLegalStatus drugLegalStatus) {
      putValue("legalStatus", drugLegalStatus);
      return this;
    }
    /**
     * The drug or supplement's legal status, including any controlled substance schedules that apply.
     */
    @NotNull public Builder legalStatus(@NotNull DrugLegalStatus.Builder drugLegalStatus) {
      putValue("legalStatus", drugLegalStatus.build());
      return this;
    }
    /**
     * The drug or supplement's legal status, including any controlled substance schedules that apply.
     */
    @NotNull public Builder legalStatus(@NotNull MedicalEnumeration medicalEnumeration) {
      putValue("legalStatus", medicalEnumeration);
      return this;
    }
    /**
     * The drug or supplement's legal status, including any controlled substance schedules that apply.
     */
    @NotNull public Builder legalStatus(@NotNull String legalStatus) {
      putValue("legalStatus", legalStatus);
      return this;
    }
    /**
     * A medical code for the entity, taken from a controlled vocabulary or ontology such as ICD-9, DiseasesDB, MeSH, SNOMED-CT, RxNorm, etc.
     */
    @NotNull public Builder code(@NotNull MedicalCode medicalCode) {
      putValue("code", medicalCode);
      return this;
    }
    /**
     * A medical code for the entity, taken from a controlled vocabulary or ontology such as ICD-9, DiseasesDB, MeSH, SNOMED-CT, RxNorm, etc.
     */
    @NotNull public Builder code(@NotNull MedicalCode.Builder medicalCode) {
      putValue("code", medicalCode.build());
      return this;
    }
    /**
     * If applicable, a medical specialty in which this entity is relevant.
     */
    @NotNull public Builder relevantSpecialty(@NotNull MedicalSpecialty medicalSpecialty) {
      putValue("relevantSpecialty", medicalSpecialty);
      return this;
    }
    /**
     * The system of medicine that includes this MedicalEntity, for example 'evidence-based', 'homeopathic', 'chiropractic', etc.
     */
    @NotNull public Builder medicineSystem(@NotNull MedicineSystem medicineSystem) {
      putValue("medicineSystem", medicineSystem);
      return this;
    }
    /**
     * A medical study or trial related to this entity.
     */
    @NotNull public Builder study(@NotNull MedicalStudy medicalStudy) {
      putValue("study", medicalStudy);
      return this;
    }
    /**
     * A medical study or trial related to this entity.
     */
    @NotNull public Builder study(@NotNull MedicalStudy.Builder medicalStudy) {
      putValue("study", medicalStudy.build());
      return this;
    }
    /**
     * A medical guideline related to this entity.
     */
    @NotNull public Builder guideline(@NotNull MedicalGuideline medicalGuideline) {
      putValue("guideline", medicalGuideline);
      return this;
    }
    /**
     * A medical guideline related to this entity.
     */
    @NotNull public Builder guideline(@NotNull MedicalGuideline.Builder medicalGuideline) {
      putValue("guideline", medicalGuideline.build());
      return this;
    }
    /**
     * If applicable, the organization that officially recognizes this entity as part of its endorsed system of medicine.
     */
    @NotNull public Builder recognizingAuthority(@NotNull Organization organization) {
      putValue("recognizingAuthority", organization);
      return this;
    }
    /**
     * If applicable, the organization that officially recognizes this entity as part of its endorsed system of medicine.
     */
    @NotNull public Builder recognizingAuthority(@NotNull Organization.Builder organization) {
      putValue("recognizingAuthority", organization.build());
      return this;
    }
    /**
     * The identifier property represents any kind of identifier for any kind of [[Thing]], such as ISBNs, GTIN codes, UUIDs etc. Schema.org provides dedicated properties for representing many of these, either as textual strings or as URL (URI) links. See [background notes](/docs/datamodel.html#identifierBg) for more details.
     *         
     */
    @NotNull public Builder identifier(@NotNull Identifier identifier) {
      putValue("identifier", identifier);
      return this;
    }
    /**
     * An image of the item. This can be a [[URL]] or a fully described [[ImageObject]].
     */
    @NotNull public Builder image(@NotNull Image image) {
      putValue("image", image);
      return this;
    }
    /**
     * Indicates a potential Action, which describes an idealized action in which this thing would play an 'object' role.
     */
    @NotNull public Builder potentialAction(@NotNull Action action) {
      putValue("potentialAction", action);
      return this;
    }
    /**
     * Indicates a potential Action, which describes an idealized action in which this thing would play an 'object' role.
     */
    @NotNull public Builder potentialAction(@NotNull Action.Builder action) {
      putValue("potentialAction", action.build());
      return this;
    }
    /**
     * A sub property of description. A short description of the item used to disambiguate from other, similar items. Information from other properties (in particular, name) may be necessary for the description to be useful for disambiguation.
     */
    @NotNull public Builder disambiguatingDescription(@NotNull String disambiguatingDescription) {
      putValue("disambiguatingDescription", disambiguatingDescription);
      return this;
    }
    /**
     * A description of the item.
     */
    @NotNull public Builder description(@NotNull String description) {
      putValue("description", description);
      return this;
    }
    /**
     * URL of the item.
     */
    @NotNull public Builder url(@NotNull String url) {
      putValue("url", url);
      return this;
    }
    /**
     * An additional type for the item, typically used for adding more specific types from external vocabularies in microdata syntax. This is a relationship between something and a class that the thing is in. In RDFa syntax, it is better to use the native RDFa syntax - the 'typeof' attribute - for multiple types. Schema.org tools may have only weaker understanding of extra types, in particular those defined externally.
     */
    @NotNull public Builder additionalType(@NotNull String additionalType) {
      putValue("additionalType", additionalType);
      return this;
    }
    /**
     * URL of a reference Web page that unambiguously indicates the item's identity. E.g. the URL of the item's Wikipedia page, Wikidata entry, or official website.
     */
    @NotNull public Builder sameAs(@NotNull String sameAs) {
      putValue("sameAs", sameAs);
      return this;
    }
    /**
     * An alias for the item.
     */
    @NotNull public Builder alternateName(@NotNull String alternateName) {
      putValue("alternateName", alternateName);
      return this;
    }
    /**
     * The name of the item.
     */
    @NotNull public Builder name(@NotNull String name) {
      putValue("name", name);
      return this;
    }
    /**
     * A CreativeWork or Event about this Thing.
     */
    @NotNull public Builder subjectOf(@NotNull CreativeWork creativeWork) {
      putValue("subjectOf", creativeWork);
      return this;
    }
    /**
     * A CreativeWork or Event about this Thing.
     */
    @NotNull public Builder subjectOf(@NotNull CreativeWork.Builder creativeWork) {
      putValue("subjectOf", creativeWork.build());
      return this;
    }
    /**
     * A CreativeWork or Event about this Thing.
     */
    @NotNull public Builder subjectOf(@NotNull Event event) {
      putValue("subjectOf", event);
      return this;
    }
    /**
     * A CreativeWork or Event about this Thing.
     */
    @NotNull public Builder subjectOf(@NotNull Event.Builder event) {
      putValue("subjectOf", event.build());
      return this;
    }
    /**
     * Indicates a page (or other CreativeWork) for which this thing is the main entity being described. See [background notes](/docs/datamodel.html#mainEntityBackground) for details.
     */
    @NotNull public Builder mainEntityOfPage(@NotNull CreativeWork creativeWork) {
      putValue("mainEntityOfPage", creativeWork);
      return this;
    }
    /**
     * Indicates a page (or other CreativeWork) for which this thing is the main entity being described. See [background notes](/docs/datamodel.html#mainEntityBackground) for details.
     */
    @NotNull public Builder mainEntityOfPage(@NotNull CreativeWork.Builder creativeWork) {
      putValue("mainEntityOfPage", creativeWork.build());
      return this;
    }
    /**
     * Indicates a page (or other CreativeWork) for which this thing is the main entity being described. See [background notes](/docs/datamodel.html#mainEntityBackground) for details.
     */
    @NotNull public Builder mainEntityOfPage(@NotNull String mainEntityOfPage) {
      putValue("mainEntityOfPage", mainEntityOfPage);
      return this;
    }
    @NotNull public Builder id(@NotNull String id) {
      myData.put("id", id);
      return this;
    }
    public Builder id(long id) {
      return id(Long.toString(id));
    }
    @Override protected void fromMap(String key, java.lang.Object value) {
      if ("drug".equals(key) && value instanceof Drug) { this.drug((Drug)value); return; }
      if ("drugs".equals(key) && value instanceof Drug) { this.drug((Drug)value); return; }
      if ("associatedAnatomy".equals(key) && value instanceof AnatomicalStructure) { this.associatedAnatomy((AnatomicalStructure)value); return; }
      if ("associatedAnatomys".equals(key) && value instanceof AnatomicalStructure) { this.associatedAnatomy((AnatomicalStructure)value); return; }
      if ("associatedAnatomy".equals(key) && value instanceof AnatomicalSystem) { this.associatedAnatomy((AnatomicalSystem)value); return; }
      if ("associatedAnatomys".equals(key) && value instanceof AnatomicalSystem) { this.associatedAnatomy((AnatomicalSystem)value); return; }
      if ("associatedAnatomy".equals(key) && value instanceof SuperficialAnatomy) { this.associatedAnatomy((SuperficialAnatomy)value); return; }
      if ("associatedAnatomys".equals(key) && value instanceof SuperficialAnatomy) { this.associatedAnatomy((SuperficialAnatomy)value); return; }
      if ("status".equals(key) && value instanceof EventStatusType) { this.status((EventStatusType)value); return; }
      if ("statuss".equals(key) && value instanceof EventStatusType) { this.status((EventStatusType)value); return; }
      if ("status".equals(key) && value instanceof MedicalStudyStatus) { this.status((MedicalStudyStatus)value); return; }
      if ("statuss".equals(key) && value instanceof MedicalStudyStatus) { this.status((MedicalStudyStatus)value); return; }
      if ("status".equals(key) && value instanceof String) { this.status((String)value); return; }
      if ("statuss".equals(key) && value instanceof String) { this.status((String)value); return; }
      if ("typicalTest".equals(key) && value instanceof MedicalTest) { this.typicalTest((MedicalTest)value); return; }
      if ("typicalTests".equals(key) && value instanceof MedicalTest) { this.typicalTest((MedicalTest)value); return; }
      if ("stage".equals(key) && value instanceof MedicalConditionStage) { this.stage((MedicalConditionStage)value); return; }
      if ("stages".equals(key) && value instanceof MedicalConditionStage) { this.stage((MedicalConditionStage)value); return; }
      if ("riskFactor".equals(key) && value instanceof MedicalRiskFactor) { this.riskFactor((MedicalRiskFactor)value); return; }
      if ("riskFactors".equals(key) && value instanceof MedicalRiskFactor) { this.riskFactor((MedicalRiskFactor)value); return; }
      if ("differentialDiagnosis".equals(key) && value instanceof DDxElement) { this.differentialDiagnosis((DDxElement)value); return; }
      if ("differentialDiagnosiss".equals(key) && value instanceof DDxElement) { this.differentialDiagnosis((DDxElement)value); return; }
      if ("expectedPrognosis".equals(key) && value instanceof String) { this.expectedPrognosis((String)value); return; }
      if ("expectedPrognosiss".equals(key) && value instanceof String) { this.expectedPrognosis((String)value); return; }
      if ("possibleTreatment".equals(key) && value instanceof MedicalTherapy) { this.possibleTreatment((MedicalTherapy)value); return; }
      if ("possibleTreatments".equals(key) && value instanceof MedicalTherapy) { this.possibleTreatment((MedicalTherapy)value); return; }
      if ("pathophysiology".equals(key) && value instanceof String) { this.pathophysiology((String)value); return; }
      if ("pathophysiologys".equals(key) && value instanceof String) { this.pathophysiology((String)value); return; }
      if ("epidemiology".equals(key) && value instanceof String) { this.epidemiology((String)value); return; }
      if ("epidemiologys".equals(key) && value instanceof String) { this.epidemiology((String)value); return; }
      if ("secondaryPrevention".equals(key) && value instanceof MedicalTherapy) { this.secondaryPrevention((MedicalTherapy)value); return; }
      if ("secondaryPreventions".equals(key) && value instanceof MedicalTherapy) { this.secondaryPrevention((MedicalTherapy)value); return; }
      if ("possibleComplication".equals(key) && value instanceof String) { this.possibleComplication((String)value); return; }
      if ("possibleComplications".equals(key) && value instanceof String) { this.possibleComplication((String)value); return; }
      if ("signOrSymptom".equals(key) && value instanceof MedicalSignOrSymptom) { this.signOrSymptom((MedicalSignOrSymptom)value); return; }
      if ("signOrSymptoms".equals(key) && value instanceof MedicalSignOrSymptom) { this.signOrSymptom((MedicalSignOrSymptom)value); return; }
      if ("naturalProgression".equals(key) && value instanceof String) { this.naturalProgression((String)value); return; }
      if ("naturalProgressions".equals(key) && value instanceof String) { this.naturalProgression((String)value); return; }
      if ("primaryPrevention".equals(key) && value instanceof MedicalTherapy) { this.primaryPrevention((MedicalTherapy)value); return; }
      if ("primaryPreventions".equals(key) && value instanceof MedicalTherapy) { this.primaryPrevention((MedicalTherapy)value); return; }
      super.fromMap(key, value);
    }
  }
  
}
