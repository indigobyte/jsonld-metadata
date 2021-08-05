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
 * An infectious disease is a clinically evident human disease resulting from the presence of pathogenic microbial agents, like pathogenic viruses, pathogenic bacteria, fungi, protozoa, multicellular parasites, and prions. To be considered an infectious disease, such pathogens are known to be able to cause this disease.
 */
public class InfectiousDisease extends MedicalCondition {
  /**
   * How the disease spreads, either as a route or vector, for example 'direct contact', 'Aedes aegypti', etc.
   */
  @JsonIgnore public String getTransmissionMethod() {
    return (String) getValue("transmissionMethod");
  }
  /**
   * How the disease spreads, either as a route or vector, for example 'direct contact', 'Aedes aegypti', etc.
   */
  @JsonIgnore public Collection<String> getTransmissionMethods() {
    final Object current = myData.get("transmissionMethod");
    if (current == null) return Collections.emptyList();
    if (current instanceof Collection) {
      return (Collection<String>) current;
    }
    return Arrays.asList((String) current);
  }
  /**
   * The actual infectious agent, such as a specific bacterium.
   */
  @JsonIgnore public String getInfectiousAgent() {
    return (String) getValue("infectiousAgent");
  }
  /**
   * The actual infectious agent, such as a specific bacterium.
   */
  @JsonIgnore public Collection<String> getInfectiousAgents() {
    final Object current = myData.get("infectiousAgent");
    if (current == null) return Collections.emptyList();
    if (current instanceof Collection) {
      return (Collection<String>) current;
    }
    return Arrays.asList((String) current);
  }
  /**
   * The class of infectious agent (bacteria, prion, etc.) that causes the disease.
   */
  @JsonIgnore public InfectiousAgentClass getInfectiousAgentClass() {
    return (InfectiousAgentClass) getValue("infectiousAgentClass");
  }
  /**
   * The class of infectious agent (bacteria, prion, etc.) that causes the disease.
   */
  @JsonIgnore public Collection<InfectiousAgentClass> getInfectiousAgentClasss() {
    final Object current = myData.get("infectiousAgentClass");
    if (current == null) return Collections.emptyList();
    if (current instanceof Collection) {
      return (Collection<InfectiousAgentClass>) current;
    }
    return Arrays.asList((InfectiousAgentClass) current);
  }
  protected InfectiousDisease(java.util.Map<String,Object> data) {
    super(data);
  }
  
  /**
   * Builder for {@link InfectiousDisease}
   */
  public static class Builder extends MedicalCondition.Builder {
    public Builder(@NotNull HashMap<String,Object> data) {
      super(data);
    }
    @NotNull public InfectiousDisease build() {
      return new InfectiousDisease(myData);
    }
    /**
     * How the disease spreads, either as a route or vector, for example 'direct contact', 'Aedes aegypti', etc.
     */
    @NotNull public Builder transmissionMethod(@NotNull String transmissionMethod) {
      putValue("transmissionMethod", transmissionMethod);
      return this;
    }
    /**
     * The actual infectious agent, such as a specific bacterium.
     */
    @NotNull public Builder infectiousAgent(@NotNull String infectiousAgent) {
      putValue("infectiousAgent", infectiousAgent);
      return this;
    }
    /**
     * The class of infectious agent (bacteria, prion, etc.) that causes the disease.
     */
    @NotNull public Builder infectiousAgentClass(@NotNull InfectiousAgentClass infectiousAgentClass) {
      putValue("infectiousAgentClass", infectiousAgentClass);
      return this;
    }
    /**
     * The class of infectious agent (bacteria, prion, etc.) that causes the disease.
     */
    @NotNull public Builder infectiousAgentClass(@NotNull InfectiousAgentClass.Builder infectiousAgentClass) {
      putValue("infectiousAgentClass", infectiousAgentClass.build());
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
     * Changes in the normal mechanical, physical, and biochemical functions that are associated with this activity or condition.
     */
    @NotNull public Builder pathophysiology(@NotNull String pathophysiology) {
      putValue("pathophysiology", pathophysiology);
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
    @NotNull public Builder status(@NotNull MedicalStudyStatus.Builder medicalStudyStatus) {
      putValue("status", medicalStudyStatus.build());
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
     * The expected progression of the condition if it is not treated and allowed to progress naturally.
     */
    @NotNull public Builder naturalProgression(@NotNull String naturalProgression) {
      putValue("naturalProgression", naturalProgression);
      return this;
    }
    /**
     * Specifying a drug or medicine used in a medication procedure
     */
    @NotNull public Builder drug(@NotNull Drug drug) {
      putValue("drug", drug);
      return this;
    }
    /**
     * Specifying a drug or medicine used in a medication procedure
     */
    @NotNull public Builder drug(@NotNull Drug.Builder drug) {
      putValue("drug", drug.build());
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
     * The likely outcome in either the short term or long term of the medical condition.
     */
    @NotNull public Builder expectedPrognosis(@NotNull String expectedPrognosis) {
      putValue("expectedPrognosis", expectedPrognosis);
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
     * The characteristics of associated patients, such as age, gender, race etc.
     */
    @NotNull public Builder epidemiology(@NotNull String epidemiology) {
      putValue("epidemiology", epidemiology);
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
     * The system of medicine that includes this MedicalEntity, for example 'evidence-based', 'homeopathic', 'chiropractic', etc.
     */
    @NotNull public Builder medicineSystem(@NotNull MedicineSystem medicineSystem) {
      putValue("medicineSystem", medicineSystem);
      return this;
    }
    /**
     * The system of medicine that includes this MedicalEntity, for example 'evidence-based', 'homeopathic', 'chiropractic', etc.
     */
    @NotNull public Builder medicineSystem(@NotNull MedicineSystem.Builder medicineSystem) {
      putValue("medicineSystem", medicineSystem.build());
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
     * If applicable, a medical specialty in which this entity is relevant.
     */
    @NotNull public Builder relevantSpecialty(@NotNull MedicalSpecialty.Builder medicalSpecialty) {
      putValue("relevantSpecialty", medicalSpecialty.build());
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
     * A sub property of description. A short description of the item used to disambiguate from other, similar items. Information from other properties (in particular, name) may be necessary for the description to be useful for disambiguation.
     */
    @NotNull public Builder disambiguatingDescription(@NotNull Description description) {
      putValue("disambiguatingDescription", description);
      return this;
    }
    /**
     * A description of the item.
     */
    @NotNull public Builder description(@NotNull Description description) {
      putValue("description", description);
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
     * The name of the item.
     */
    @NotNull public Builder name(@NotNull String name) {
      putValue("name", name);
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
     * An image of the item. This can be a &lt;a class=&quot;localLink&quot; href=&quot;http://schema.org/URL&quot;&gt;URL&lt;/a&gt; or a fully described &lt;a class=&quot;localLink&quot; href=&quot;http://schema.org/ImageObject&quot;&gt;ImageObject&lt;/a&gt;.
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
     * Indicates a page (or other CreativeWork) for which this thing is the main entity being described. See &lt;a href=&quot;/docs/datamodel.html#mainEntityBackground&quot;&gt;background notes&lt;/a&gt; for details.
     */
    @NotNull public Builder mainEntityOfPage(@NotNull CreativeWork creativeWork) {
      putValue("mainEntityOfPage", creativeWork);
      return this;
    }
    /**
     * Indicates a page (or other CreativeWork) for which this thing is the main entity being described. See &lt;a href=&quot;/docs/datamodel.html#mainEntityBackground&quot;&gt;background notes&lt;/a&gt; for details.
     */
    @NotNull public Builder mainEntityOfPage(@NotNull CreativeWork.Builder creativeWork) {
      putValue("mainEntityOfPage", creativeWork.build());
      return this;
    }
    /**
     * Indicates a page (or other CreativeWork) for which this thing is the main entity being described. See &lt;a href=&quot;/docs/datamodel.html#mainEntityBackground&quot;&gt;background notes&lt;/a&gt; for details.
     */
    @NotNull public Builder mainEntityOfPage(@NotNull String mainEntityOfPage) {
      putValue("mainEntityOfPage", mainEntityOfPage);
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
    @NotNull public Builder id(@NotNull String id) {
      myData.put("id", id);
      return this;
    }
    public Builder id(long id) {
      return id(Long.toString(id));
    }
    @Override protected void fromMap(String key, Object value) {
      if ("transmissionMethod".equals(key) && value instanceof String) { this.transmissionMethod((String)value); return; }
      if ("transmissionMethods".equals(key) && value instanceof String) { this.transmissionMethod((String)value); return; }
      if ("infectiousAgent".equals(key) && value instanceof String) { this.infectiousAgent((String)value); return; }
      if ("infectiousAgents".equals(key) && value instanceof String) { this.infectiousAgent((String)value); return; }
      if ("infectiousAgentClass".equals(key) && value instanceof InfectiousAgentClass) { this.infectiousAgentClass((InfectiousAgentClass)value); return; }
      if ("infectiousAgentClasss".equals(key) && value instanceof InfectiousAgentClass) { this.infectiousAgentClass((InfectiousAgentClass)value); return; }
      super.fromMap(key, value);
    }
  }
  
}
