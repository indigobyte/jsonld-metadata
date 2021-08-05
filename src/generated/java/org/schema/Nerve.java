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
 * A common pathway for the electrochemical nerve impulses that are transmitted along each of the axons.
 */
public class Nerve extends AnatomicalStructure {
  /**
   * The neurological pathway extension that inputs and sends information to the brain or spinal cord.
   */
  @JsonIgnore public AnatomicalStructure getSensoryUnitAnatomicalStructure() {
    return (AnatomicalStructure) getValue("sensoryUnit");
  }
  /**
   * The neurological pathway extension that inputs and sends information to the brain or spinal cord.
   */
  @JsonIgnore public java.util.Collection<AnatomicalStructure> getSensoryUnitAnatomicalStructures() {
    final Object current = myData.get("sensoryUnit");
    if (current == null) return Collections.emptyList();
    if (current instanceof java.util.Collection) {
      return (java.util.Collection<AnatomicalStructure>) current;
    }
    return Arrays.asList((AnatomicalStructure) current);
  }
  /**
   * The neurological pathway extension that inputs and sends information to the brain or spinal cord.
   */
  @JsonIgnore public SuperficialAnatomy getSensoryUnitSuperficialAnatomy() {
    return (SuperficialAnatomy) getValue("sensoryUnit");
  }
  /**
   * The neurological pathway extension that inputs and sends information to the brain or spinal cord.
   */
  @JsonIgnore public java.util.Collection<SuperficialAnatomy> getSensoryUnitSuperficialAnatomys() {
    final Object current = myData.get("sensoryUnit");
    if (current == null) return Collections.emptyList();
    if (current instanceof java.util.Collection) {
      return (java.util.Collection<SuperficialAnatomy>) current;
    }
    return Arrays.asList((SuperficialAnatomy) current);
  }
  /**
   * The neurological pathway extension that involves muscle control.
   */
  @JsonIgnore public Muscle getNerveMotor() {
    return (Muscle) getValue("nerveMotor");
  }
  /**
   * The neurological pathway extension that involves muscle control.
   */
  @JsonIgnore public java.util.Collection<Muscle> getNerveMotors() {
    final Object current = myData.get("nerveMotor");
    if (current == null) return Collections.emptyList();
    if (current instanceof java.util.Collection) {
      return (java.util.Collection<Muscle>) current;
    }
    return Arrays.asList((Muscle) current);
  }
  /**
   * The neurological pathway that originates the neurons.
   */
  @JsonIgnore public BrainStructure getSourcedFrom() {
    return (BrainStructure) getValue("sourcedFrom");
  }
  /**
   * The neurological pathway that originates the neurons.
   */
  @JsonIgnore public java.util.Collection<BrainStructure> getSourcedFroms() {
    final Object current = myData.get("sourcedFrom");
    if (current == null) return Collections.emptyList();
    if (current instanceof java.util.Collection) {
      return (java.util.Collection<BrainStructure>) current;
    }
    return Arrays.asList((BrainStructure) current);
  }
  protected Nerve(java.util.Map<String,Object> data) {
    super(data);
  }
  
  /**
   * Builder for {@link Nerve}
   */
  public static class Builder extends AnatomicalStructure.Builder {
    public Builder(@NotNull HashMap<String,Object> data) {
      super(data);
    }
    @NotNull public Nerve build() {
      return new Nerve(myData);
    }
    /**
     * The neurological pathway extension that inputs and sends information to the brain or spinal cord.
     */
    @NotNull public Builder sensoryUnit(@NotNull AnatomicalStructure anatomicalStructure) {
      putValue("sensoryUnit", anatomicalStructure);
      return this;
    }
    /**
     * The neurological pathway extension that inputs and sends information to the brain or spinal cord.
     */
    @NotNull public Builder sensoryUnit(@NotNull AnatomicalStructure.Builder anatomicalStructure) {
      putValue("sensoryUnit", anatomicalStructure.build());
      return this;
    }
    /**
     * The neurological pathway extension that inputs and sends information to the brain or spinal cord.
     */
    @NotNull public Builder sensoryUnit(@NotNull SuperficialAnatomy superficialAnatomy) {
      putValue("sensoryUnit", superficialAnatomy);
      return this;
    }
    /**
     * The neurological pathway extension that inputs and sends information to the brain or spinal cord.
     */
    @NotNull public Builder sensoryUnit(@NotNull SuperficialAnatomy.Builder superficialAnatomy) {
      putValue("sensoryUnit", superficialAnatomy.build());
      return this;
    }
    /**
     * The neurological pathway extension that involves muscle control.
     */
    @NotNull public Builder nerveMotor(@NotNull Muscle muscle) {
      putValue("nerveMotor", muscle);
      return this;
    }
    /**
     * The neurological pathway extension that involves muscle control.
     */
    @NotNull public Builder nerveMotor(@NotNull Muscle.Builder muscle) {
      putValue("nerveMotor", muscle.build());
      return this;
    }
    /**
     * The neurological pathway that originates the neurons.
     */
    @NotNull public Builder sourcedFrom(@NotNull BrainStructure brainStructure) {
      putValue("sourcedFrom", brainStructure);
      return this;
    }
    /**
     * The neurological pathway that originates the neurons.
     */
    @NotNull public Builder sourcedFrom(@NotNull BrainStructure.Builder brainStructure) {
      putValue("sourcedFrom", brainStructure.build());
      return this;
    }
    /**
     * Component (sub-)structure(s) that comprise this anatomical structure.
     */
    @NotNull public Builder subStructure(@NotNull AnatomicalStructure anatomicalStructure) {
      putValue("subStructure", anatomicalStructure);
      return this;
    }
    /**
     * Component (sub-)structure(s) that comprise this anatomical structure.
     */
    @NotNull public Builder subStructure(@NotNull AnatomicalStructure.Builder anatomicalStructure) {
      putValue("subStructure", anatomicalStructure.build());
      return this;
    }
    /**
     * A medical condition associated with this anatomy.
     */
    @NotNull public Builder relatedCondition(@NotNull MedicalCondition medicalCondition) {
      putValue("relatedCondition", medicalCondition);
      return this;
    }
    /**
     * A medical condition associated with this anatomy.
     */
    @NotNull public Builder relatedCondition(@NotNull MedicalCondition.Builder medicalCondition) {
      putValue("relatedCondition", medicalCondition.build());
      return this;
    }
    /**
     * Other anatomical structures to which this structure is connected.
     */
    @NotNull public Builder connectedTo(@NotNull AnatomicalStructure anatomicalStructure) {
      putValue("connectedTo", anatomicalStructure);
      return this;
    }
    /**
     * Other anatomical structures to which this structure is connected.
     */
    @NotNull public Builder connectedTo(@NotNull AnatomicalStructure.Builder anatomicalStructure) {
      putValue("connectedTo", anatomicalStructure.build());
      return this;
    }
    /**
     * The anatomical or organ system that this structure is part of.
     */
    @NotNull public Builder partOfSystem(@NotNull AnatomicalSystem anatomicalSystem) {
      putValue("partOfSystem", anatomicalSystem);
      return this;
    }
    /**
     * The anatomical or organ system that this structure is part of.
     */
    @NotNull public Builder partOfSystem(@NotNull AnatomicalSystem.Builder anatomicalSystem) {
      putValue("partOfSystem", anatomicalSystem.build());
      return this;
    }
    /**
     * An image containing a diagram that illustrates the structure and/or its component substructures and/or connections with other structures.
     */
    @NotNull public Builder diagram(@NotNull ImageObject imageObject) {
      putValue("diagram", imageObject);
      return this;
    }
    /**
     * An image containing a diagram that illustrates the structure and/or its component substructures and/or connections with other structures.
     */
    @NotNull public Builder diagram(@NotNull ImageObject.Builder imageObject) {
      putValue("diagram", imageObject.build());
      return this;
    }
    /**
     * If applicable, a description of the pathophysiology associated with the anatomical system, including potential abnormal changes in the mechanical, physical, and biochemical functions of the system.
     */
    @NotNull public Builder associatedPathophysiology(@NotNull String associatedPathophysiology) {
      putValue("associatedPathophysiology", associatedPathophysiology);
      return this;
    }
    /**
     * A medical therapy related to this anatomy.
     */
    @NotNull public Builder relatedTherapy(@NotNull MedicalTherapy medicalTherapy) {
      putValue("relatedTherapy", medicalTherapy);
      return this;
    }
    /**
     * A medical therapy related to this anatomy.
     */
    @NotNull public Builder relatedTherapy(@NotNull MedicalTherapy.Builder medicalTherapy) {
      putValue("relatedTherapy", medicalTherapy.build());
      return this;
    }
    /**
     * Location in the body of the anatomical structure.
     */
    @NotNull public Builder bodyLocation(@NotNull String bodyLocation) {
      putValue("bodyLocation", bodyLocation);
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
    @NotNull public Builder disambiguatingDescription(@NotNull Description description) {
      putValue("disambiguatingDescription", description);
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
    @Override protected void fromMap(String key, Object value) {
      if ("sensoryUnit".equals(key) && value instanceof AnatomicalStructure) { this.sensoryUnit((AnatomicalStructure)value); return; }
      if ("sensoryUnits".equals(key) && value instanceof AnatomicalStructure) { this.sensoryUnit((AnatomicalStructure)value); return; }
      if ("sensoryUnit".equals(key) && value instanceof SuperficialAnatomy) { this.sensoryUnit((SuperficialAnatomy)value); return; }
      if ("sensoryUnits".equals(key) && value instanceof SuperficialAnatomy) { this.sensoryUnit((SuperficialAnatomy)value); return; }
      if ("nerveMotor".equals(key) && value instanceof Muscle) { this.nerveMotor((Muscle)value); return; }
      if ("nerveMotors".equals(key) && value instanceof Muscle) { this.nerveMotor((Muscle)value); return; }
      if ("sourcedFrom".equals(key) && value instanceof BrainStructure) { this.sourcedFrom((BrainStructure)value); return; }
      if ("sourcedFroms".equals(key) && value instanceof BrainStructure) { this.sourcedFrom((BrainStructure)value); return; }
      super.fromMap(key, value);
    }
  }
  
}
