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
import org.jetbrains.annotations.Nullable;
import java.util.*;

/**
 * Any condition of the human body that affects the normal functioning of a person, whether physically or mentally. Includes diseases, injuries, disabilities, disorders, syndromes, etc.
 */
public class MedicalCondition extends MedicalEntity {
  /**
   * Specifying a drug or medicine used in a medication procedure.
   * @return drug property set by first invocation of drug method or {@code null}.
   */
  @JsonIgnore public Drug getDrug() {
    return (Drug) getValue("drug");
  }
  /**
   * Specifying a drug or medicine used in a medication procedure.
   * @return all drug properties as {@link java.util.Collection} or an empty collection 
   * if drug was not set.
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
   * @return associatedAnatomy property set by first invocation of associatedAnatomy method or {@code null}.
   */
  @JsonIgnore public AnatomicalStructure getAssociatedAnatomyAnatomicalStructure() {
    return (AnatomicalStructure) getValue("associatedAnatomy");
  }
  /**
   * The anatomy of the underlying organ system or structures associated with this entity.
   * @return all associatedAnatomy properties as {@link java.util.Collection} or an empty collection 
   * if associatedAnatomy was not set.
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
   * @return associatedAnatomy property set by first invocation of associatedAnatomy method or {@code null}.
   */
  @JsonIgnore public AnatomicalSystem getAssociatedAnatomyAnatomicalSystem() {
    return (AnatomicalSystem) getValue("associatedAnatomy");
  }
  /**
   * The anatomy of the underlying organ system or structures associated with this entity.
   * @return all associatedAnatomy properties as {@link java.util.Collection} or an empty collection 
   * if associatedAnatomy was not set.
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
   * @return associatedAnatomy property set by first invocation of associatedAnatomy method or {@code null}.
   */
  @JsonIgnore public SuperficialAnatomy getAssociatedAnatomySuperficialAnatomy() {
    return (SuperficialAnatomy) getValue("associatedAnatomy");
  }
  /**
   * The anatomy of the underlying organ system or structures associated with this entity.
   * @return all associatedAnatomy properties as {@link java.util.Collection} or an empty collection 
   * if associatedAnatomy was not set.
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
   * @return status property set by first invocation of status method or {@code null}.
   */
  @JsonIgnore public EventStatusType getStatusEventStatusType() {
    return (EventStatusType) getValue("status");
  }
  /**
   * The status of the study (enumerated).
   * @return all status properties as {@link java.util.Collection} or an empty collection 
   * if status was not set.
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
   * @return status property set by first invocation of status method or {@code null}.
   */
  @JsonIgnore public MedicalStudyStatus getStatusMedicalStudyStatus() {
    return (MedicalStudyStatus) getValue("status");
  }
  /**
   * The status of the study (enumerated).
   * @return all status properties as {@link java.util.Collection} or an empty collection 
   * if status was not set.
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
   * @return status property set by first invocation of status method or {@code null}.
   */
  @JsonIgnore public String getStatusString() {
    return (String) getValue("status");
  }
  /**
   * The status of the study (enumerated).
   * @return all status properties as {@link java.util.Collection} or an empty collection 
   * if status was not set.
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
   * @return typicalTest property set by first invocation of typicalTest method or {@code null}.
   */
  @JsonIgnore public MedicalTest getTypicalTest() {
    return (MedicalTest) getValue("typicalTest");
  }
  /**
   * A medical test typically performed given this condition.
   * @return all typicalTest properties as {@link java.util.Collection} or an empty collection 
   * if typicalTest was not set.
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
   * @return stage property set by first invocation of stage method or {@code null}.
   */
  @JsonIgnore public MedicalConditionStage getStage() {
    return (MedicalConditionStage) getValue("stage");
  }
  /**
   * The stage of the condition, if applicable.
   * @return all stage properties as {@link java.util.Collection} or an empty collection 
   * if stage was not set.
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
   * @return riskFactor property set by first invocation of riskFactor method or {@code null}.
   */
  @JsonIgnore public MedicalRiskFactor getRiskFactor() {
    return (MedicalRiskFactor) getValue("riskFactor");
  }
  /**
   * A modifiable or non-modifiable factor that increases the risk of a patient contracting this condition, e.g. age,  coexisting condition.
   * @return all riskFactor properties as {@link java.util.Collection} or an empty collection 
   * if riskFactor was not set.
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
   * @return differentialDiagnosis property set by first invocation of differentialDiagnosis method or {@code null}.
   */
  @JsonIgnore public DDxElement getDifferentialDiagnosis() {
    return (DDxElement) getValue("differentialDiagnosis");
  }
  /**
   * One of a set of differential diagnoses for the condition. Specifically, a closely-related or competing diagnosis typically considered later in the cognitive process whereby this medical condition is distinguished from others most likely responsible for a similar collection of signs and symptoms to reach the most parsimonious diagnosis or diagnoses in a patient.
   * @return all differentialDiagnosis properties as {@link java.util.Collection} or an empty collection 
   * if differentialDiagnosis was not set.
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
   * @return expectedPrognosis property set by first invocation of expectedPrognosis method or {@code null}.
   */
  @JsonIgnore public String getExpectedPrognosis() {
    return (String) getValue("expectedPrognosis");
  }
  /**
   * The likely outcome in either the short term or long term of the medical condition.
   * @return all expectedPrognosis properties as {@link java.util.Collection} or an empty collection 
   * if expectedPrognosis was not set.
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
   * @return possibleTreatment property set by first invocation of possibleTreatment method or {@code null}.
   */
  @JsonIgnore public MedicalTherapy getPossibleTreatment() {
    return (MedicalTherapy) getValue("possibleTreatment");
  }
  /**
   * A possible treatment to address this condition, sign or symptom.
   * @return all possibleTreatment properties as {@link java.util.Collection} or an empty collection 
   * if possibleTreatment was not set.
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
   * @return pathophysiology property set by first invocation of pathophysiology method or {@code null}.
   */
  @JsonIgnore public String getPathophysiology() {
    return (String) getValue("pathophysiology");
  }
  /**
   * Changes in the normal mechanical, physical, and biochemical functions that are associated with this activity or condition.
   * @return all pathophysiology properties as {@link java.util.Collection} or an empty collection 
   * if pathophysiology was not set.
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
   * @return epidemiology property set by first invocation of epidemiology method or {@code null}.
   */
  @JsonIgnore public String getEpidemiology() {
    return (String) getValue("epidemiology");
  }
  /**
   * The characteristics of associated patients, such as age, gender, race etc.
   * @return all epidemiology properties as {@link java.util.Collection} or an empty collection 
   * if epidemiology was not set.
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
   * @return secondaryPrevention property set by first invocation of secondaryPrevention method or {@code null}.
   */
  @JsonIgnore public MedicalTherapy getSecondaryPrevention() {
    return (MedicalTherapy) getValue("secondaryPrevention");
  }
  /**
   * A preventative therapy used to prevent reoccurrence of the medical condition after an initial episode of the condition.
   * @return all secondaryPrevention properties as {@link java.util.Collection} or an empty collection 
   * if secondaryPrevention was not set.
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
   * @return possibleComplication property set by first invocation of possibleComplication method or {@code null}.
   */
  @JsonIgnore public String getPossibleComplication() {
    return (String) getValue("possibleComplication");
  }
  /**
   * A possible unexpected and unfavorable evolution of a medical condition. Complications may include worsening of the signs or symptoms of the disease, extension of the condition to other organ systems, etc.
   * @return all possibleComplication properties as {@link java.util.Collection} or an empty collection 
   * if possibleComplication was not set.
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
   * @return signOrSymptom property set by first invocation of signOrSymptom method or {@code null}.
   */
  @JsonIgnore public MedicalSignOrSymptom getSignOrSymptom() {
    return (MedicalSignOrSymptom) getValue("signOrSymptom");
  }
  /**
   * A sign or symptom of this condition. Signs are objective or physically observable manifestations of the medical condition while symptoms are the subjective experience of the medical condition.
   * @return all signOrSymptom properties as {@link java.util.Collection} or an empty collection 
   * if signOrSymptom was not set.
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
   * @return naturalProgression property set by first invocation of naturalProgression method or {@code null}.
   */
  @JsonIgnore public String getNaturalProgression() {
    return (String) getValue("naturalProgression");
  }
  /**
   * The expected progression of the condition if it is not treated and allowed to progress naturally.
   * @return all naturalProgression properties as {@link java.util.Collection} or an empty collection 
   * if naturalProgression was not set.
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
   * @return primaryPrevention property set by first invocation of primaryPrevention method or {@code null}.
   */
  @JsonIgnore public MedicalTherapy getPrimaryPrevention() {
    return (MedicalTherapy) getValue("primaryPrevention");
  }
  /**
   * A preventative therapy used to prevent an initial occurrence of the medical condition, such as vaccination.
   * @return all primaryPrevention properties as {@link java.util.Collection} or an empty collection 
   * if primaryPrevention was not set.
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
     * @param drug value to set
     * @return this builder instance
     */
    @NotNull public Builder drug(@NotNull Drug drug) {
      putValue("drug", drug);
      return this;
    }
    /**
     * Specifying a drug or medicine used in a medication procedure.
     * @param drug value to set
     * @return this builder instance
     */
    @NotNull public Builder drug(@NotNull Drug.Builder drug) {
      putValue("drug", drug.build());
      return this;
    }
    /**
     * Remove drug property from the builder.
     * If this property is repeatable, all instances are removed.
     * @return this builder instance
     */
    @NotNull public Builder removeDrug() {
      removeValue("drug");
      return this;
    }
    /**
     * Get currently set value for drug property in this builder.
     * @return previously set value or {@code null}. If multiple values have been 
     * set to this property, then {@link java.util.Collection} instance will be 
     * returned.
     */
    @Nullable public java.lang.Object getDrug() {
      return myData.get("drug");
    }
    /**
     * The anatomy of the underlying organ system or structures associated with this entity.
     * @param anatomicalStructure value to set
     * @return this builder instance
     */
    @NotNull public Builder associatedAnatomy(@NotNull AnatomicalStructure anatomicalStructure) {
      putValue("associatedAnatomy", anatomicalStructure);
      return this;
    }
    /**
     * The anatomy of the underlying organ system or structures associated with this entity.
     * @param anatomicalStructure value to set
     * @return this builder instance
     */
    @NotNull public Builder associatedAnatomy(@NotNull AnatomicalStructure.Builder anatomicalStructure) {
      putValue("associatedAnatomy", anatomicalStructure.build());
      return this;
    }
    /**
     * The anatomy of the underlying organ system or structures associated with this entity.
     * @param anatomicalSystem value to set
     * @return this builder instance
     */
    @NotNull public Builder associatedAnatomy(@NotNull AnatomicalSystem anatomicalSystem) {
      putValue("associatedAnatomy", anatomicalSystem);
      return this;
    }
    /**
     * The anatomy of the underlying organ system or structures associated with this entity.
     * @param anatomicalSystem value to set
     * @return this builder instance
     */
    @NotNull public Builder associatedAnatomy(@NotNull AnatomicalSystem.Builder anatomicalSystem) {
      putValue("associatedAnatomy", anatomicalSystem.build());
      return this;
    }
    /**
     * The anatomy of the underlying organ system or structures associated with this entity.
     * @param superficialAnatomy value to set
     * @return this builder instance
     */
    @NotNull public Builder associatedAnatomy(@NotNull SuperficialAnatomy superficialAnatomy) {
      putValue("associatedAnatomy", superficialAnatomy);
      return this;
    }
    /**
     * The anatomy of the underlying organ system or structures associated with this entity.
     * @param superficialAnatomy value to set
     * @return this builder instance
     */
    @NotNull public Builder associatedAnatomy(@NotNull SuperficialAnatomy.Builder superficialAnatomy) {
      putValue("associatedAnatomy", superficialAnatomy.build());
      return this;
    }
    /**
     * Remove associatedAnatomy property from the builder.
     * If this property is repeatable, all instances are removed.
     * @return this builder instance
     */
    @NotNull public Builder removeAssociatedAnatomy() {
      removeValue("associatedAnatomy");
      return this;
    }
    /**
     * Get currently set value for associatedAnatomy property in this builder.
     * @return previously set value or {@code null}. If multiple values have been 
     * set to this property, then {@link java.util.Collection} instance will be 
     * returned.
     */
    @Nullable public java.lang.Object getAssociatedAnatomy() {
      return myData.get("associatedAnatomy");
    }
    /**
     * The status of the study (enumerated).
     * @param eventStatusType value to set
     * @return this builder instance
     */
    @NotNull public Builder status(@NotNull EventStatusType eventStatusType) {
      putValue("status", eventStatusType);
      return this;
    }
    /**
     * The status of the study (enumerated).
     * @param medicalStudyStatus value to set
     * @return this builder instance
     */
    @NotNull public Builder status(@NotNull MedicalStudyStatus medicalStudyStatus) {
      putValue("status", medicalStudyStatus);
      return this;
    }
    /**
     * The status of the study (enumerated).
     * @param status value to set
     * @return this builder instance
     */
    @NotNull public Builder status(@NotNull String status) {
      putValue("status", status);
      return this;
    }
    /**
     * Remove status property from the builder.
     * If this property is repeatable, all instances are removed.
     * @return this builder instance
     */
    @NotNull public Builder removeStatus() {
      removeValue("status");
      return this;
    }
    /**
     * Get currently set value for status property in this builder.
     * @return previously set value or {@code null}. If multiple values have been 
     * set to this property, then {@link java.util.Collection} instance will be 
     * returned.
     */
    @Nullable public java.lang.Object getStatus() {
      return myData.get("status");
    }
    /**
     * A medical test typically performed given this condition.
     * @param medicalTest value to set
     * @return this builder instance
     */
    @NotNull public Builder typicalTest(@NotNull MedicalTest medicalTest) {
      putValue("typicalTest", medicalTest);
      return this;
    }
    /**
     * A medical test typically performed given this condition.
     * @param medicalTest value to set
     * @return this builder instance
     */
    @NotNull public Builder typicalTest(@NotNull MedicalTest.Builder medicalTest) {
      putValue("typicalTest", medicalTest.build());
      return this;
    }
    /**
     * Remove typicalTest property from the builder.
     * If this property is repeatable, all instances are removed.
     * @return this builder instance
     */
    @NotNull public Builder removeTypicalTest() {
      removeValue("typicalTest");
      return this;
    }
    /**
     * Get currently set value for typicalTest property in this builder.
     * @return previously set value or {@code null}. If multiple values have been 
     * set to this property, then {@link java.util.Collection} instance will be 
     * returned.
     */
    @Nullable public java.lang.Object getTypicalTest() {
      return myData.get("typicalTest");
    }
    /**
     * The stage of the condition, if applicable.
     * @param medicalConditionStage value to set
     * @return this builder instance
     */
    @NotNull public Builder stage(@NotNull MedicalConditionStage medicalConditionStage) {
      putValue("stage", medicalConditionStage);
      return this;
    }
    /**
     * The stage of the condition, if applicable.
     * @param medicalConditionStage value to set
     * @return this builder instance
     */
    @NotNull public Builder stage(@NotNull MedicalConditionStage.Builder medicalConditionStage) {
      putValue("stage", medicalConditionStage.build());
      return this;
    }
    /**
     * Remove stage property from the builder.
     * If this property is repeatable, all instances are removed.
     * @return this builder instance
     */
    @NotNull public Builder removeStage() {
      removeValue("stage");
      return this;
    }
    /**
     * Get currently set value for stage property in this builder.
     * @return previously set value or {@code null}. If multiple values have been 
     * set to this property, then {@link java.util.Collection} instance will be 
     * returned.
     */
    @Nullable public java.lang.Object getStage() {
      return myData.get("stage");
    }
    /**
     * A modifiable or non-modifiable factor that increases the risk of a patient contracting this condition, e.g. age,  coexisting condition.
     * @param medicalRiskFactor value to set
     * @return this builder instance
     */
    @NotNull public Builder riskFactor(@NotNull MedicalRiskFactor medicalRiskFactor) {
      putValue("riskFactor", medicalRiskFactor);
      return this;
    }
    /**
     * A modifiable or non-modifiable factor that increases the risk of a patient contracting this condition, e.g. age,  coexisting condition.
     * @param medicalRiskFactor value to set
     * @return this builder instance
     */
    @NotNull public Builder riskFactor(@NotNull MedicalRiskFactor.Builder medicalRiskFactor) {
      putValue("riskFactor", medicalRiskFactor.build());
      return this;
    }
    /**
     * Remove riskFactor property from the builder.
     * If this property is repeatable, all instances are removed.
     * @return this builder instance
     */
    @NotNull public Builder removeRiskFactor() {
      removeValue("riskFactor");
      return this;
    }
    /**
     * Get currently set value for riskFactor property in this builder.
     * @return previously set value or {@code null}. If multiple values have been 
     * set to this property, then {@link java.util.Collection} instance will be 
     * returned.
     */
    @Nullable public java.lang.Object getRiskFactor() {
      return myData.get("riskFactor");
    }
    /**
     * One of a set of differential diagnoses for the condition. Specifically, a closely-related or competing diagnosis typically considered later in the cognitive process whereby this medical condition is distinguished from others most likely responsible for a similar collection of signs and symptoms to reach the most parsimonious diagnosis or diagnoses in a patient.
     * @param dDxElement value to set
     * @return this builder instance
     */
    @NotNull public Builder differentialDiagnosis(@NotNull DDxElement dDxElement) {
      putValue("differentialDiagnosis", dDxElement);
      return this;
    }
    /**
     * One of a set of differential diagnoses for the condition. Specifically, a closely-related or competing diagnosis typically considered later in the cognitive process whereby this medical condition is distinguished from others most likely responsible for a similar collection of signs and symptoms to reach the most parsimonious diagnosis or diagnoses in a patient.
     * @param dDxElement value to set
     * @return this builder instance
     */
    @NotNull public Builder differentialDiagnosis(@NotNull DDxElement.Builder dDxElement) {
      putValue("differentialDiagnosis", dDxElement.build());
      return this;
    }
    /**
     * Remove differentialDiagnosis property from the builder.
     * If this property is repeatable, all instances are removed.
     * @return this builder instance
     */
    @NotNull public Builder removeDifferentialDiagnosis() {
      removeValue("differentialDiagnosis");
      return this;
    }
    /**
     * Get currently set value for differentialDiagnosis property in this builder.
     * @return previously set value or {@code null}. If multiple values have been 
     * set to this property, then {@link java.util.Collection} instance will be 
     * returned.
     */
    @Nullable public java.lang.Object getDifferentialDiagnosis() {
      return myData.get("differentialDiagnosis");
    }
    /**
     * The likely outcome in either the short term or long term of the medical condition.
     * @param expectedPrognosis value to set
     * @return this builder instance
     */
    @NotNull public Builder expectedPrognosis(@NotNull String expectedPrognosis) {
      putValue("expectedPrognosis", expectedPrognosis);
      return this;
    }
    /**
     * Remove expectedPrognosis property from the builder.
     * If this property is repeatable, all instances are removed.
     * @return this builder instance
     */
    @NotNull public Builder removeExpectedPrognosis() {
      removeValue("expectedPrognosis");
      return this;
    }
    /**
     * Get currently set value for expectedPrognosis property in this builder.
     * @return previously set value or {@code null}. If multiple values have been 
     * set to this property, then {@link java.util.Collection} instance will be 
     * returned.
     */
    @Nullable public java.lang.Object getExpectedPrognosis() {
      return myData.get("expectedPrognosis");
    }
    /**
     * A possible treatment to address this condition, sign or symptom.
     * @param medicalTherapy value to set
     * @return this builder instance
     */
    @NotNull public Builder possibleTreatment(@NotNull MedicalTherapy medicalTherapy) {
      putValue("possibleTreatment", medicalTherapy);
      return this;
    }
    /**
     * A possible treatment to address this condition, sign or symptom.
     * @param medicalTherapy value to set
     * @return this builder instance
     */
    @NotNull public Builder possibleTreatment(@NotNull MedicalTherapy.Builder medicalTherapy) {
      putValue("possibleTreatment", medicalTherapy.build());
      return this;
    }
    /**
     * Remove possibleTreatment property from the builder.
     * If this property is repeatable, all instances are removed.
     * @return this builder instance
     */
    @NotNull public Builder removePossibleTreatment() {
      removeValue("possibleTreatment");
      return this;
    }
    /**
     * Get currently set value for possibleTreatment property in this builder.
     * @return previously set value or {@code null}. If multiple values have been 
     * set to this property, then {@link java.util.Collection} instance will be 
     * returned.
     */
    @Nullable public java.lang.Object getPossibleTreatment() {
      return myData.get("possibleTreatment");
    }
    /**
     * Changes in the normal mechanical, physical, and biochemical functions that are associated with this activity or condition.
     * @param pathophysiology value to set
     * @return this builder instance
     */
    @NotNull public Builder pathophysiology(@NotNull String pathophysiology) {
      putValue("pathophysiology", pathophysiology);
      return this;
    }
    /**
     * Remove pathophysiology property from the builder.
     * If this property is repeatable, all instances are removed.
     * @return this builder instance
     */
    @NotNull public Builder removePathophysiology() {
      removeValue("pathophysiology");
      return this;
    }
    /**
     * Get currently set value for pathophysiology property in this builder.
     * @return previously set value or {@code null}. If multiple values have been 
     * set to this property, then {@link java.util.Collection} instance will be 
     * returned.
     */
    @Nullable public java.lang.Object getPathophysiology() {
      return myData.get("pathophysiology");
    }
    /**
     * The characteristics of associated patients, such as age, gender, race etc.
     * @param epidemiology value to set
     * @return this builder instance
     */
    @NotNull public Builder epidemiology(@NotNull String epidemiology) {
      putValue("epidemiology", epidemiology);
      return this;
    }
    /**
     * Remove epidemiology property from the builder.
     * If this property is repeatable, all instances are removed.
     * @return this builder instance
     */
    @NotNull public Builder removeEpidemiology() {
      removeValue("epidemiology");
      return this;
    }
    /**
     * Get currently set value for epidemiology property in this builder.
     * @return previously set value or {@code null}. If multiple values have been 
     * set to this property, then {@link java.util.Collection} instance will be 
     * returned.
     */
    @Nullable public java.lang.Object getEpidemiology() {
      return myData.get("epidemiology");
    }
    /**
     * A preventative therapy used to prevent reoccurrence of the medical condition after an initial episode of the condition.
     * @param medicalTherapy value to set
     * @return this builder instance
     */
    @NotNull public Builder secondaryPrevention(@NotNull MedicalTherapy medicalTherapy) {
      putValue("secondaryPrevention", medicalTherapy);
      return this;
    }
    /**
     * A preventative therapy used to prevent reoccurrence of the medical condition after an initial episode of the condition.
     * @param medicalTherapy value to set
     * @return this builder instance
     */
    @NotNull public Builder secondaryPrevention(@NotNull MedicalTherapy.Builder medicalTherapy) {
      putValue("secondaryPrevention", medicalTherapy.build());
      return this;
    }
    /**
     * Remove secondaryPrevention property from the builder.
     * If this property is repeatable, all instances are removed.
     * @return this builder instance
     */
    @NotNull public Builder removeSecondaryPrevention() {
      removeValue("secondaryPrevention");
      return this;
    }
    /**
     * Get currently set value for secondaryPrevention property in this builder.
     * @return previously set value or {@code null}. If multiple values have been 
     * set to this property, then {@link java.util.Collection} instance will be 
     * returned.
     */
    @Nullable public java.lang.Object getSecondaryPrevention() {
      return myData.get("secondaryPrevention");
    }
    /**
     * A possible unexpected and unfavorable evolution of a medical condition. Complications may include worsening of the signs or symptoms of the disease, extension of the condition to other organ systems, etc.
     * @param possibleComplication value to set
     * @return this builder instance
     */
    @NotNull public Builder possibleComplication(@NotNull String possibleComplication) {
      putValue("possibleComplication", possibleComplication);
      return this;
    }
    /**
     * Remove possibleComplication property from the builder.
     * If this property is repeatable, all instances are removed.
     * @return this builder instance
     */
    @NotNull public Builder removePossibleComplication() {
      removeValue("possibleComplication");
      return this;
    }
    /**
     * Get currently set value for possibleComplication property in this builder.
     * @return previously set value or {@code null}. If multiple values have been 
     * set to this property, then {@link java.util.Collection} instance will be 
     * returned.
     */
    @Nullable public java.lang.Object getPossibleComplication() {
      return myData.get("possibleComplication");
    }
    /**
     * A sign or symptom of this condition. Signs are objective or physically observable manifestations of the medical condition while symptoms are the subjective experience of the medical condition.
     * @param medicalSignOrSymptom value to set
     * @return this builder instance
     */
    @NotNull public Builder signOrSymptom(@NotNull MedicalSignOrSymptom medicalSignOrSymptom) {
      putValue("signOrSymptom", medicalSignOrSymptom);
      return this;
    }
    /**
     * A sign or symptom of this condition. Signs are objective or physically observable manifestations of the medical condition while symptoms are the subjective experience of the medical condition.
     * @param medicalSignOrSymptom value to set
     * @return this builder instance
     */
    @NotNull public Builder signOrSymptom(@NotNull MedicalSignOrSymptom.Builder medicalSignOrSymptom) {
      putValue("signOrSymptom", medicalSignOrSymptom.build());
      return this;
    }
    /**
     * Remove signOrSymptom property from the builder.
     * If this property is repeatable, all instances are removed.
     * @return this builder instance
     */
    @NotNull public Builder removeSignOrSymptom() {
      removeValue("signOrSymptom");
      return this;
    }
    /**
     * Get currently set value for signOrSymptom property in this builder.
     * @return previously set value or {@code null}. If multiple values have been 
     * set to this property, then {@link java.util.Collection} instance will be 
     * returned.
     */
    @Nullable public java.lang.Object getSignOrSymptom() {
      return myData.get("signOrSymptom");
    }
    /**
     * The expected progression of the condition if it is not treated and allowed to progress naturally.
     * @param naturalProgression value to set
     * @return this builder instance
     */
    @NotNull public Builder naturalProgression(@NotNull String naturalProgression) {
      putValue("naturalProgression", naturalProgression);
      return this;
    }
    /**
     * Remove naturalProgression property from the builder.
     * If this property is repeatable, all instances are removed.
     * @return this builder instance
     */
    @NotNull public Builder removeNaturalProgression() {
      removeValue("naturalProgression");
      return this;
    }
    /**
     * Get currently set value for naturalProgression property in this builder.
     * @return previously set value or {@code null}. If multiple values have been 
     * set to this property, then {@link java.util.Collection} instance will be 
     * returned.
     */
    @Nullable public java.lang.Object getNaturalProgression() {
      return myData.get("naturalProgression");
    }
    /**
     * A preventative therapy used to prevent an initial occurrence of the medical condition, such as vaccination.
     * @param medicalTherapy value to set
     * @return this builder instance
     */
    @NotNull public Builder primaryPrevention(@NotNull MedicalTherapy medicalTherapy) {
      putValue("primaryPrevention", medicalTherapy);
      return this;
    }
    /**
     * A preventative therapy used to prevent an initial occurrence of the medical condition, such as vaccination.
     * @param medicalTherapy value to set
     * @return this builder instance
     */
    @NotNull public Builder primaryPrevention(@NotNull MedicalTherapy.Builder medicalTherapy) {
      putValue("primaryPrevention", medicalTherapy.build());
      return this;
    }
    /**
     * Remove primaryPrevention property from the builder.
     * If this property is repeatable, all instances are removed.
     * @return this builder instance
     */
    @NotNull public Builder removePrimaryPrevention() {
      removeValue("primaryPrevention");
      return this;
    }
    /**
     * Get currently set value for primaryPrevention property in this builder.
     * @return previously set value or {@code null}. If multiple values have been 
     * set to this property, then {@link java.util.Collection} instance will be 
     * returned.
     */
    @Nullable public java.lang.Object getPrimaryPrevention() {
      return myData.get("primaryPrevention");
    }
    /**
     * The drug or supplement's legal status, including any controlled substance schedules that apply.
     * @param drugLegalStatus value to set
     * @return this builder instance
     */
    @NotNull public Builder legalStatus(@NotNull DrugLegalStatus drugLegalStatus) {
      putValue("legalStatus", drugLegalStatus);
      return this;
    }
    /**
     * The drug or supplement's legal status, including any controlled substance schedules that apply.
     * @param drugLegalStatus value to set
     * @return this builder instance
     */
    @NotNull public Builder legalStatus(@NotNull DrugLegalStatus.Builder drugLegalStatus) {
      putValue("legalStatus", drugLegalStatus.build());
      return this;
    }
    /**
     * The drug or supplement's legal status, including any controlled substance schedules that apply.
     * @param medicalEnumeration value to set
     * @return this builder instance
     */
    @NotNull public Builder legalStatus(@NotNull MedicalEnumeration medicalEnumeration) {
      putValue("legalStatus", medicalEnumeration);
      return this;
    }
    /**
     * The drug or supplement's legal status, including any controlled substance schedules that apply.
     * @param legalStatus value to set
     * @return this builder instance
     */
    @NotNull public Builder legalStatus(@NotNull String legalStatus) {
      putValue("legalStatus", legalStatus);
      return this;
    }
    /**
     * Remove legalStatus property from the builder.
     * If this property is repeatable, all instances are removed.
     * @return this builder instance
     */
    @NotNull public Builder removeLegalStatus() {
      removeValue("legalStatus");
      return this;
    }
    /**
     * Get currently set value for legalStatus property in this builder.
     * @return previously set value or {@code null}. If multiple values have been 
     * set to this property, then {@link java.util.Collection} instance will be 
     * returned.
     */
    @Nullable public java.lang.Object getLegalStatus() {
      return myData.get("legalStatus");
    }
    /**
     * A medical code for the entity, taken from a controlled vocabulary or ontology such as ICD-9, DiseasesDB, MeSH, SNOMED-CT, RxNorm, etc.
     * @param medicalCode value to set
     * @return this builder instance
     */
    @NotNull public Builder code(@NotNull MedicalCode medicalCode) {
      putValue("code", medicalCode);
      return this;
    }
    /**
     * A medical code for the entity, taken from a controlled vocabulary or ontology such as ICD-9, DiseasesDB, MeSH, SNOMED-CT, RxNorm, etc.
     * @param medicalCode value to set
     * @return this builder instance
     */
    @NotNull public Builder code(@NotNull MedicalCode.Builder medicalCode) {
      putValue("code", medicalCode.build());
      return this;
    }
    /**
     * Remove code property from the builder.
     * If this property is repeatable, all instances are removed.
     * @return this builder instance
     */
    @NotNull public Builder removeCode() {
      removeValue("code");
      return this;
    }
    /**
     * Get currently set value for code property in this builder.
     * @return previously set value or {@code null}. If multiple values have been 
     * set to this property, then {@link java.util.Collection} instance will be 
     * returned.
     */
    @Nullable public java.lang.Object getCode() {
      return myData.get("code");
    }
    /**
     * If applicable, a medical specialty in which this entity is relevant.
     * @param medicalSpecialty value to set
     * @return this builder instance
     */
    @NotNull public Builder relevantSpecialty(@NotNull MedicalSpecialty medicalSpecialty) {
      putValue("relevantSpecialty", medicalSpecialty);
      return this;
    }
    /**
     * Remove relevantSpecialty property from the builder.
     * If this property is repeatable, all instances are removed.
     * @return this builder instance
     */
    @NotNull public Builder removeRelevantSpecialty() {
      removeValue("relevantSpecialty");
      return this;
    }
    /**
     * Get currently set value for relevantSpecialty property in this builder.
     * @return previously set value or {@code null}. If multiple values have been 
     * set to this property, then {@link java.util.Collection} instance will be 
     * returned.
     */
    @Nullable public java.lang.Object getRelevantSpecialty() {
      return myData.get("relevantSpecialty");
    }
    /**
     * The system of medicine that includes this MedicalEntity, for example 'evidence-based', 'homeopathic', 'chiropractic', etc.
     * @param medicineSystem value to set
     * @return this builder instance
     */
    @NotNull public Builder medicineSystem(@NotNull MedicineSystem medicineSystem) {
      putValue("medicineSystem", medicineSystem);
      return this;
    }
    /**
     * Remove medicineSystem property from the builder.
     * If this property is repeatable, all instances are removed.
     * @return this builder instance
     */
    @NotNull public Builder removeMedicineSystem() {
      removeValue("medicineSystem");
      return this;
    }
    /**
     * Get currently set value for medicineSystem property in this builder.
     * @return previously set value or {@code null}. If multiple values have been 
     * set to this property, then {@link java.util.Collection} instance will be 
     * returned.
     */
    @Nullable public java.lang.Object getMedicineSystem() {
      return myData.get("medicineSystem");
    }
    /**
     * A medical study or trial related to this entity.
     * @param medicalStudy value to set
     * @return this builder instance
     */
    @NotNull public Builder study(@NotNull MedicalStudy medicalStudy) {
      putValue("study", medicalStudy);
      return this;
    }
    /**
     * A medical study or trial related to this entity.
     * @param medicalStudy value to set
     * @return this builder instance
     */
    @NotNull public Builder study(@NotNull MedicalStudy.Builder medicalStudy) {
      putValue("study", medicalStudy.build());
      return this;
    }
    /**
     * Remove study property from the builder.
     * If this property is repeatable, all instances are removed.
     * @return this builder instance
     */
    @NotNull public Builder removeStudy() {
      removeValue("study");
      return this;
    }
    /**
     * Get currently set value for study property in this builder.
     * @return previously set value or {@code null}. If multiple values have been 
     * set to this property, then {@link java.util.Collection} instance will be 
     * returned.
     */
    @Nullable public java.lang.Object getStudy() {
      return myData.get("study");
    }
    /**
     * A medical guideline related to this entity.
     * @param medicalGuideline value to set
     * @return this builder instance
     */
    @NotNull public Builder guideline(@NotNull MedicalGuideline medicalGuideline) {
      putValue("guideline", medicalGuideline);
      return this;
    }
    /**
     * A medical guideline related to this entity.
     * @param medicalGuideline value to set
     * @return this builder instance
     */
    @NotNull public Builder guideline(@NotNull MedicalGuideline.Builder medicalGuideline) {
      putValue("guideline", medicalGuideline.build());
      return this;
    }
    /**
     * Remove guideline property from the builder.
     * If this property is repeatable, all instances are removed.
     * @return this builder instance
     */
    @NotNull public Builder removeGuideline() {
      removeValue("guideline");
      return this;
    }
    /**
     * Get currently set value for guideline property in this builder.
     * @return previously set value or {@code null}. If multiple values have been 
     * set to this property, then {@link java.util.Collection} instance will be 
     * returned.
     */
    @Nullable public java.lang.Object getGuideline() {
      return myData.get("guideline");
    }
    /**
     * If applicable, the organization that officially recognizes this entity as part of its endorsed system of medicine.
     * @param organization value to set
     * @return this builder instance
     */
    @NotNull public Builder recognizingAuthority(@NotNull Organization organization) {
      putValue("recognizingAuthority", organization);
      return this;
    }
    /**
     * If applicable, the organization that officially recognizes this entity as part of its endorsed system of medicine.
     * @param organization value to set
     * @return this builder instance
     */
    @NotNull public Builder recognizingAuthority(@NotNull Organization.Builder organization) {
      putValue("recognizingAuthority", organization.build());
      return this;
    }
    /**
     * Remove recognizingAuthority property from the builder.
     * If this property is repeatable, all instances are removed.
     * @return this builder instance
     */
    @NotNull public Builder removeRecognizingAuthority() {
      removeValue("recognizingAuthority");
      return this;
    }
    /**
     * Get currently set value for recognizingAuthority property in this builder.
     * @return previously set value or {@code null}. If multiple values have been 
     * set to this property, then {@link java.util.Collection} instance will be 
     * returned.
     */
    @Nullable public java.lang.Object getRecognizingAuthority() {
      return myData.get("recognizingAuthority");
    }
    /**
     * The identifier property represents any kind of identifier for any kind of [[Thing]], such as ISBNs, GTIN codes, UUIDs etc. Schema.org provides dedicated properties for representing many of these, either as textual strings or as URL (URI) links. See [background notes](/docs/datamodel.html#identifierBg) for more details.
     * 
     * @param identifier value to set
     * @return this builder instance
     */
    @NotNull public Builder identifier(@NotNull Identifier identifier) {
      putValue("identifier", identifier);
      return this;
    }
    /**
     * Remove identifier property from the builder.
     * If this property is repeatable, all instances are removed.
     * @return this builder instance
     */
    @NotNull public Builder removeIdentifier() {
      removeValue("identifier");
      return this;
    }
    /**
     * Get currently set value for identifier property in this builder.
     * @return previously set value or {@code null}. If multiple values have been 
     * set to this property, then {@link java.util.Collection} instance will be 
     * returned.
     */
    @Nullable public java.lang.Object getIdentifier() {
      return myData.get("identifier");
    }
    /**
     * An image of the item. This can be a [[URL]] or a fully described [[ImageObject]].
     * @param image value to set
     * @return this builder instance
     */
    @NotNull public Builder image(@NotNull Image image) {
      putValue("image", image);
      return this;
    }
    /**
     * Remove image property from the builder.
     * If this property is repeatable, all instances are removed.
     * @return this builder instance
     */
    @NotNull public Builder removeImage() {
      removeValue("image");
      return this;
    }
    /**
     * Get currently set value for image property in this builder.
     * @return previously set value or {@code null}. If multiple values have been 
     * set to this property, then {@link java.util.Collection} instance will be 
     * returned.
     */
    @Nullable public java.lang.Object getImage() {
      return myData.get("image");
    }
    /**
     * Indicates a potential Action, which describes an idealized action in which this thing would play an 'object' role.
     * @param action value to set
     * @return this builder instance
     */
    @NotNull public Builder potentialAction(@NotNull Action action) {
      putValue("potentialAction", action);
      return this;
    }
    /**
     * Indicates a potential Action, which describes an idealized action in which this thing would play an 'object' role.
     * @param action value to set
     * @return this builder instance
     */
    @NotNull public Builder potentialAction(@NotNull Action.Builder action) {
      putValue("potentialAction", action.build());
      return this;
    }
    /**
     * Remove potentialAction property from the builder.
     * If this property is repeatable, all instances are removed.
     * @return this builder instance
     */
    @NotNull public Builder removePotentialAction() {
      removeValue("potentialAction");
      return this;
    }
    /**
     * Get currently set value for potentialAction property in this builder.
     * @return previously set value or {@code null}. If multiple values have been 
     * set to this property, then {@link java.util.Collection} instance will be 
     * returned.
     */
    @Nullable public java.lang.Object getPotentialAction() {
      return myData.get("potentialAction");
    }
    /**
     * A sub property of description. A short description of the item used to disambiguate from other, similar items. Information from other properties (in particular, name) may be necessary for the description to be useful for disambiguation.
     * @param disambiguatingDescription value to set
     * @return this builder instance
     */
    @NotNull public Builder disambiguatingDescription(@NotNull String disambiguatingDescription) {
      putValue("disambiguatingDescription", disambiguatingDescription);
      return this;
    }
    /**
     * Remove disambiguatingDescription property from the builder.
     * If this property is repeatable, all instances are removed.
     * @return this builder instance
     */
    @NotNull public Builder removeDisambiguatingDescription() {
      removeValue("disambiguatingDescription");
      return this;
    }
    /**
     * Get currently set value for disambiguatingDescription property in this builder.
     * @return previously set value or {@code null}. If multiple values have been 
     * set to this property, then {@link java.util.Collection} instance will be 
     * returned.
     */
    @Nullable public java.lang.Object getDisambiguatingDescription() {
      return myData.get("disambiguatingDescription");
    }
    /**
     * A description of the item.
     * @param description value to set
     * @return this builder instance
     */
    @NotNull public Builder description(@NotNull String description) {
      putValue("description", description);
      return this;
    }
    /**
     * Remove description property from the builder.
     * If this property is repeatable, all instances are removed.
     * @return this builder instance
     */
    @NotNull public Builder removeDescription() {
      removeValue("description");
      return this;
    }
    /**
     * Get currently set value for description property in this builder.
     * @return previously set value or {@code null}. If multiple values have been 
     * set to this property, then {@link java.util.Collection} instance will be 
     * returned.
     */
    @Nullable public java.lang.Object getDescription() {
      return myData.get("description");
    }
    /**
     * URL of the item.
     * @param url value to set
     * @return this builder instance
     */
    @NotNull public Builder url(@NotNull String url) {
      putValue("url", url);
      return this;
    }
    /**
     * Remove url property from the builder.
     * If this property is repeatable, all instances are removed.
     * @return this builder instance
     */
    @NotNull public Builder removeUrl() {
      removeValue("url");
      return this;
    }
    /**
     * Get currently set value for url property in this builder.
     * @return previously set value or {@code null}. If multiple values have been 
     * set to this property, then {@link java.util.Collection} instance will be 
     * returned.
     */
    @Nullable public java.lang.Object getUrl() {
      return myData.get("url");
    }
    /**
     * An additional type for the item, typically used for adding more specific types from external vocabularies in microdata syntax. This is a relationship between something and a class that the thing is in. In RDFa syntax, it is better to use the native RDFa syntax - the 'typeof' attribute - for multiple types. Schema.org tools may have only weaker understanding of extra types, in particular those defined externally.
     * @param additionalType value to set
     * @return this builder instance
     */
    @NotNull public Builder additionalType(@NotNull String additionalType) {
      putValue("additionalType", additionalType);
      return this;
    }
    /**
     * Remove additionalType property from the builder.
     * If this property is repeatable, all instances are removed.
     * @return this builder instance
     */
    @NotNull public Builder removeAdditionalType() {
      removeValue("additionalType");
      return this;
    }
    /**
     * Get currently set value for additionalType property in this builder.
     * @return previously set value or {@code null}. If multiple values have been 
     * set to this property, then {@link java.util.Collection} instance will be 
     * returned.
     */
    @Nullable public java.lang.Object getAdditionalType() {
      return myData.get("additionalType");
    }
    /**
     * URL of a reference Web page that unambiguously indicates the item's identity. E.g. the URL of the item's Wikipedia page, Wikidata entry, or official website.
     * @param sameAs value to set
     * @return this builder instance
     */
    @NotNull public Builder sameAs(@NotNull String sameAs) {
      putValue("sameAs", sameAs);
      return this;
    }
    /**
     * Remove sameAs property from the builder.
     * If this property is repeatable, all instances are removed.
     * @return this builder instance
     */
    @NotNull public Builder removeSameAs() {
      removeValue("sameAs");
      return this;
    }
    /**
     * Get currently set value for sameAs property in this builder.
     * @return previously set value or {@code null}. If multiple values have been 
     * set to this property, then {@link java.util.Collection} instance will be 
     * returned.
     */
    @Nullable public java.lang.Object getSameAs() {
      return myData.get("sameAs");
    }
    /**
     * An alias for the item.
     * @param alternateName value to set
     * @return this builder instance
     */
    @NotNull public Builder alternateName(@NotNull String alternateName) {
      putValue("alternateName", alternateName);
      return this;
    }
    /**
     * Remove alternateName property from the builder.
     * If this property is repeatable, all instances are removed.
     * @return this builder instance
     */
    @NotNull public Builder removeAlternateName() {
      removeValue("alternateName");
      return this;
    }
    /**
     * Get currently set value for alternateName property in this builder.
     * @return previously set value or {@code null}. If multiple values have been 
     * set to this property, then {@link java.util.Collection} instance will be 
     * returned.
     */
    @Nullable public java.lang.Object getAlternateName() {
      return myData.get("alternateName");
    }
    /**
     * The name of the item.
     * @param name value to set
     * @return this builder instance
     */
    @NotNull public Builder name(@NotNull String name) {
      putValue("name", name);
      return this;
    }
    /**
     * Remove name property from the builder.
     * If this property is repeatable, all instances are removed.
     * @return this builder instance
     */
    @NotNull public Builder removeName() {
      removeValue("name");
      return this;
    }
    /**
     * Get currently set value for name property in this builder.
     * @return previously set value or {@code null}. If multiple values have been 
     * set to this property, then {@link java.util.Collection} instance will be 
     * returned.
     */
    @Nullable public java.lang.Object getName() {
      return myData.get("name");
    }
    /**
     * A CreativeWork or Event about this Thing.
     * @param creativeWork value to set
     * @return this builder instance
     */
    @NotNull public Builder subjectOf(@NotNull CreativeWork creativeWork) {
      putValue("subjectOf", creativeWork);
      return this;
    }
    /**
     * A CreativeWork or Event about this Thing.
     * @param creativeWork value to set
     * @return this builder instance
     */
    @NotNull public Builder subjectOf(@NotNull CreativeWork.Builder creativeWork) {
      putValue("subjectOf", creativeWork.build());
      return this;
    }
    /**
     * A CreativeWork or Event about this Thing.
     * @param event value to set
     * @return this builder instance
     */
    @NotNull public Builder subjectOf(@NotNull Event event) {
      putValue("subjectOf", event);
      return this;
    }
    /**
     * A CreativeWork or Event about this Thing.
     * @param event value to set
     * @return this builder instance
     */
    @NotNull public Builder subjectOf(@NotNull Event.Builder event) {
      putValue("subjectOf", event.build());
      return this;
    }
    /**
     * Remove subjectOf property from the builder.
     * If this property is repeatable, all instances are removed.
     * @return this builder instance
     */
    @NotNull public Builder removeSubjectOf() {
      removeValue("subjectOf");
      return this;
    }
    /**
     * Get currently set value for subjectOf property in this builder.
     * @return previously set value or {@code null}. If multiple values have been 
     * set to this property, then {@link java.util.Collection} instance will be 
     * returned.
     */
    @Nullable public java.lang.Object getSubjectOf() {
      return myData.get("subjectOf");
    }
    /**
     * Indicates a page (or other CreativeWork) for which this thing is the main entity being described. See [background notes](/docs/datamodel.html#mainEntityBackground) for details.
     * @param creativeWork value to set
     * @return this builder instance
     */
    @NotNull public Builder mainEntityOfPage(@NotNull CreativeWork creativeWork) {
      putValue("mainEntityOfPage", creativeWork);
      return this;
    }
    /**
     * Indicates a page (or other CreativeWork) for which this thing is the main entity being described. See [background notes](/docs/datamodel.html#mainEntityBackground) for details.
     * @param creativeWork value to set
     * @return this builder instance
     */
    @NotNull public Builder mainEntityOfPage(@NotNull CreativeWork.Builder creativeWork) {
      putValue("mainEntityOfPage", creativeWork.build());
      return this;
    }
    /**
     * Indicates a page (or other CreativeWork) for which this thing is the main entity being described. See [background notes](/docs/datamodel.html#mainEntityBackground) for details.
     * @param mainEntityOfPage value to set
     * @return this builder instance
     */
    @NotNull public Builder mainEntityOfPage(@NotNull String mainEntityOfPage) {
      putValue("mainEntityOfPage", mainEntityOfPage);
      return this;
    }
    /**
     * Remove mainEntityOfPage property from the builder.
     * If this property is repeatable, all instances are removed.
     * @return this builder instance
     */
    @NotNull public Builder removeMainEntityOfPage() {
      removeValue("mainEntityOfPage");
      return this;
    }
    /**
     * Get currently set value for mainEntityOfPage property in this builder.
     * @return previously set value or {@code null}. If multiple values have been 
     * set to this property, then {@link java.util.Collection} instance will be 
     * returned.
     */
    @Nullable public java.lang.Object getMainEntityOfPage() {
      return myData.get("mainEntityOfPage");
    }
    /**
     * null
     * @param id value to set
     * @return this builder instance
     */
    @NotNull public Builder id(@NotNull String id) {
      myData.put("id", id);
      return this;
    }
    /**
     * Remove id property from the builder.
     * If this property is repeatable, all instances are removed.
     * @return this builder instance
     */
    @NotNull public Builder removeId() {
      removeValue("id");
      return this;
    }
    /**
     * Get currently set value for id property in this builder.
     * @return previously set value or {@code null}. If multiple values have been 
     * set to this property, then {@link java.util.Collection} instance will be 
     * returned.
     */
    @Nullable public java.lang.Object getId() {
      return myData.get("id");
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
