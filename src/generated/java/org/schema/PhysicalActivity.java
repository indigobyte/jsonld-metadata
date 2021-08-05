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
 * Any bodily activity that enhances or maintains physical fitness and overall health and wellness. Includes activity that is part of daily living and routine, structured exercise, and exercise prescribed as part of a medical treatment or recovery plan.
 */
public class PhysicalActivity extends LifestyleModification {
  /**
   * The anatomy of the underlying organ system or structures associated with this entity.
   */
  @JsonIgnore public AnatomicalStructure getAssociatedAnatomyAnatomicalStructure() {
    return (AnatomicalStructure) getValue("associatedAnatomy");
  }
  /**
   * The anatomy of the underlying organ system or structures associated with this entity.
   */
  @JsonIgnore public Collection<AnatomicalStructure> getAssociatedAnatomyAnatomicalStructures() {
    final Object current = myData.get("associatedAnatomy");
    if (current == null) return Collections.emptyList();
    if (current instanceof Collection) {
      return (Collection<AnatomicalStructure>) current;
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
  @JsonIgnore public Collection<AnatomicalSystem> getAssociatedAnatomyAnatomicalSystems() {
    final Object current = myData.get("associatedAnatomy");
    if (current == null) return Collections.emptyList();
    if (current instanceof Collection) {
      return (Collection<AnatomicalSystem>) current;
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
  @JsonIgnore public Collection<SuperficialAnatomy> getAssociatedAnatomySuperficialAnatomys() {
    final Object current = myData.get("associatedAnatomy");
    if (current == null) return Collections.emptyList();
    if (current instanceof Collection) {
      return (Collection<SuperficialAnatomy>) current;
    }
    return Arrays.asList((SuperficialAnatomy) current);
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
  @JsonIgnore public Collection<String> getPathophysiologys() {
    final Object current = myData.get("pathophysiology");
    if (current == null) return Collections.emptyList();
    if (current instanceof Collection) {
      return (Collection<String>) current;
    }
    return Arrays.asList((String) current);
  }
  /**
   * A category for the item. Greater signs or slashes can be used to informally indicate a category hierarchy.
   */
  @JsonIgnore public Category getCategory() {
    return (Category) getValue("category");
  }
  /**
   * A category for the item. Greater signs or slashes can be used to informally indicate a category hierarchy.
   */
  @JsonIgnore public Collection<Category> getCategorys() {
    final Object current = myData.get("category");
    if (current == null) return Collections.emptyList();
    if (current instanceof Collection) {
      return (Collection<Category>) current;
    }
    return Arrays.asList((Category) current);
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
  @JsonIgnore public Collection<String> getEpidemiologys() {
    final Object current = myData.get("epidemiology");
    if (current == null) return Collections.emptyList();
    if (current instanceof Collection) {
      return (Collection<String>) current;
    }
    return Arrays.asList((String) current);
  }
  protected PhysicalActivity(java.util.Map<String,Object> data) {
    super(data);
  }
  
  /**
   * Builder for {@link PhysicalActivity}
   */
  public static class Builder extends LifestyleModification.Builder {
    public Builder(@NotNull HashMap<String,Object> data) {
      super(data);
    }
    @NotNull public PhysicalActivity build() {
      return new PhysicalActivity(myData);
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
     * Changes in the normal mechanical, physical, and biochemical functions that are associated with this activity or condition.
     */
    @NotNull public Builder pathophysiology(@NotNull String pathophysiology) {
      putValue("pathophysiology", pathophysiology);
      return this;
    }
    /**
     * A category for the item. Greater signs or slashes can be used to informally indicate a category hierarchy.
     */
    @NotNull public Builder category(@NotNull Category category) {
      putValue("category", category);
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
     * If applicable, a medical specialty in which this entity is relevant.
     */
    @NotNull public Builder relevantSpecialty(@NotNull MedicalSpecialty.Builder medicalSpecialty) {
      putValue("relevantSpecialty", medicalSpecialty.build());
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
      if ("associatedAnatomy".equals(key) && value instanceof AnatomicalStructure) { this.associatedAnatomy((AnatomicalStructure)value); return; }
      if ("associatedAnatomys".equals(key) && value instanceof AnatomicalStructure) { this.associatedAnatomy((AnatomicalStructure)value); return; }
      if ("associatedAnatomy".equals(key) && value instanceof AnatomicalSystem) { this.associatedAnatomy((AnatomicalSystem)value); return; }
      if ("associatedAnatomys".equals(key) && value instanceof AnatomicalSystem) { this.associatedAnatomy((AnatomicalSystem)value); return; }
      if ("associatedAnatomy".equals(key) && value instanceof SuperficialAnatomy) { this.associatedAnatomy((SuperficialAnatomy)value); return; }
      if ("associatedAnatomys".equals(key) && value instanceof SuperficialAnatomy) { this.associatedAnatomy((SuperficialAnatomy)value); return; }
      if ("pathophysiology".equals(key) && value instanceof String) { this.pathophysiology((String)value); return; }
      if ("pathophysiologys".equals(key) && value instanceof String) { this.pathophysiology((String)value); return; }
      if ("category".equals(key) && value instanceof Category) { this.category((Category)value); return; }
      if ("categorys".equals(key) && value instanceof Category) { this.category((Category)value); return; }
      if ("epidemiology".equals(key) && value instanceof String) { this.epidemiology((String)value); return; }
      if ("epidemiologys".equals(key) && value instanceof String) { this.epidemiology((String)value); return; }
      super.fromMap(key, value);
    }
  }
  
}
