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
 * The anatomical location at which two or more bones make contact.
 */
public class Joint extends AnatomicalStructure {
  /**
   * The degree of mobility the joint allows.
   */
  @JsonIgnore public MedicalEntity getFunctionalClassMedicalEntity() {
    return (MedicalEntity) getValue("functionalClass");
  }
  /**
   * The degree of mobility the joint allows.
   */
  @JsonIgnore public java.util.Collection<MedicalEntity> getFunctionalClassMedicalEntitys() {
    final Object current = myData.get("functionalClass");
    if (current == null) return Collections.emptyList();
    if (current instanceof java.util.Collection) {
      return (java.util.Collection<MedicalEntity>) current;
    }
    return Arrays.asList((MedicalEntity) current);
  }
  /**
   * The degree of mobility the joint allows.
   */
  @JsonIgnore public String getFunctionalClassString() {
    return (String) getValue("functionalClass");
  }
  /**
   * The degree of mobility the joint allows.
   */
  @JsonIgnore public java.util.Collection<String> getFunctionalClassStrings() {
    final Object current = myData.get("functionalClass");
    if (current == null) return Collections.emptyList();
    if (current instanceof java.util.Collection) {
      return (java.util.Collection<String>) current;
    }
    return Arrays.asList((String) current);
  }
  /**
   * The biomechanical properties of the bone.
   */
  @JsonIgnore public String getBiomechnicalClass() {
    return (String) getValue("biomechnicalClass");
  }
  /**
   * The biomechanical properties of the bone.
   */
  @JsonIgnore public java.util.Collection<String> getBiomechnicalClasss() {
    final Object current = myData.get("biomechnicalClass");
    if (current == null) return Collections.emptyList();
    if (current instanceof java.util.Collection) {
      return (java.util.Collection<String>) current;
    }
    return Arrays.asList((String) current);
  }
  /**
   * The name given to how bone physically connects to each other.
   */
  @JsonIgnore public String getStructuralClass() {
    return (String) getValue("structuralClass");
  }
  /**
   * The name given to how bone physically connects to each other.
   */
  @JsonIgnore public java.util.Collection<String> getStructuralClasss() {
    final Object current = myData.get("structuralClass");
    if (current == null) return Collections.emptyList();
    if (current instanceof java.util.Collection) {
      return (java.util.Collection<String>) current;
    }
    return Arrays.asList((String) current);
  }
  protected Joint(java.util.Map<String,Object> data) {
    super(data);
  }
  
  /**
   * Builder for {@link Joint}
   */
  public static class Builder extends AnatomicalStructure.Builder {
    public Builder(@NotNull HashMap<String,Object> data) {
      super(data);
    }
    @NotNull public Joint build() {
      return new Joint(myData);
    }
    /**
     * The degree of mobility the joint allows.
     */
    @NotNull public Builder functionalClass(@NotNull MedicalEntity medicalEntity) {
      putValue("functionalClass", medicalEntity);
      return this;
    }
    /**
     * The degree of mobility the joint allows.
     */
    @NotNull public Builder functionalClass(@NotNull MedicalEntity.Builder medicalEntity) {
      putValue("functionalClass", medicalEntity.build());
      return this;
    }
    /**
     * The degree of mobility the joint allows.
     */
    @NotNull public Builder functionalClass(@NotNull String functionalClass) {
      putValue("functionalClass", functionalClass);
      return this;
    }
    /**
     * The biomechanical properties of the bone.
     */
    @NotNull public Builder biomechnicalClass(@NotNull String biomechnicalClass) {
      putValue("biomechnicalClass", biomechnicalClass);
      return this;
    }
    /**
     * The name given to how bone physically connects to each other.
     */
    @NotNull public Builder structuralClass(@NotNull String structuralClass) {
      putValue("structuralClass", structuralClass);
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
      if ("functionalClass".equals(key) && value instanceof MedicalEntity) { this.functionalClass((MedicalEntity)value); return; }
      if ("functionalClasss".equals(key) && value instanceof MedicalEntity) { this.functionalClass((MedicalEntity)value); return; }
      if ("functionalClass".equals(key) && value instanceof String) { this.functionalClass((String)value); return; }
      if ("functionalClasss".equals(key) && value instanceof String) { this.functionalClass((String)value); return; }
      if ("biomechnicalClass".equals(key) && value instanceof String) { this.biomechnicalClass((String)value); return; }
      if ("biomechnicalClasss".equals(key) && value instanceof String) { this.biomechnicalClass((String)value); return; }
      if ("structuralClass".equals(key) && value instanceof String) { this.structuralClass((String)value); return; }
      if ("structuralClasss".equals(key) && value instanceof String) { this.structuralClass((String)value); return; }
      super.fromMap(key, value);
    }
  }
  
}
