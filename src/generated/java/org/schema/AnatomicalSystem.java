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
 * An anatomical system is a group of anatomical structures that work together to perform a certain task. Anatomical systems, such as organ systems, are one organizing principle of anatomy, and can includes circulatory, digestive, endocrine, integumentary, immune, lymphatic, muscular, nervous, reproductive, respiratory, skeletal, urinary, vestibular, and other systems.
 */
public class AnatomicalSystem extends MedicalEntity {
  /**
   * If applicable, a description of the pathophysiology associated with the anatomical system, including potential abnormal changes in the mechanical, physical, and biochemical functions of the system.
   */
  @JsonIgnore public String getAssociatedPathophysiology() {
    return (String) getValue("associatedPathophysiology");
  }
  /**
   * If applicable, a description of the pathophysiology associated with the anatomical system, including potential abnormal changes in the mechanical, physical, and biochemical functions of the system.
   */
  @JsonIgnore public Collection<String> getAssociatedPathophysiologys() {
    final Object current = myData.get("associatedPathophysiology");
    if (current == null) return Collections.emptyList();
    if (current instanceof Collection) {
      return (Collection<String>) current;
    }
    return Arrays.asList((String) current);
  }
  /**
   * A medical condition associated with this anatomy.
   */
  @JsonIgnore public MedicalCondition getRelatedCondition() {
    return (MedicalCondition) getValue("relatedCondition");
  }
  /**
   * A medical condition associated with this anatomy.
   */
  @JsonIgnore public Collection<MedicalCondition> getRelatedConditions() {
    final Object current = myData.get("relatedCondition");
    if (current == null) return Collections.emptyList();
    if (current instanceof Collection) {
      return (Collection<MedicalCondition>) current;
    }
    return Arrays.asList((MedicalCondition) current);
  }
  /**
   * A medical therapy related to this anatomy.
   */
  @JsonIgnore public MedicalTherapy getRelatedTherapy() {
    return (MedicalTherapy) getValue("relatedTherapy");
  }
  /**
   * A medical therapy related to this anatomy.
   */
  @JsonIgnore public Collection<MedicalTherapy> getRelatedTherapys() {
    final Object current = myData.get("relatedTherapy");
    if (current == null) return Collections.emptyList();
    if (current instanceof Collection) {
      return (Collection<MedicalTherapy>) current;
    }
    return Arrays.asList((MedicalTherapy) current);
  }
  /**
   * Related anatomical structure(s) that are not part of the system but relate or connect to it, such as vascular bundles associated with an organ system.
   */
  @JsonIgnore public AnatomicalStructure getRelatedStructure() {
    return (AnatomicalStructure) getValue("relatedStructure");
  }
  /**
   * Related anatomical structure(s) that are not part of the system but relate or connect to it, such as vascular bundles associated with an organ system.
   */
  @JsonIgnore public Collection<AnatomicalStructure> getRelatedStructures() {
    final Object current = myData.get("relatedStructure");
    if (current == null) return Collections.emptyList();
    if (current instanceof Collection) {
      return (Collection<AnatomicalStructure>) current;
    }
    return Arrays.asList((AnatomicalStructure) current);
  }
  /**
   * Specifying something physically contained by something else. Typically used here for the underlying anatomical structures, such as organs, that comprise the anatomical system.
   */
  @JsonIgnore public AnatomicalStructure getComprisedOfAnatomicalStructure() {
    return (AnatomicalStructure) getValue("comprisedOf");
  }
  /**
   * Specifying something physically contained by something else. Typically used here for the underlying anatomical structures, such as organs, that comprise the anatomical system.
   */
  @JsonIgnore public Collection<AnatomicalStructure> getComprisedOfAnatomicalStructures() {
    final Object current = myData.get("comprisedOf");
    if (current == null) return Collections.emptyList();
    if (current instanceof Collection) {
      return (Collection<AnatomicalStructure>) current;
    }
    return Arrays.asList((AnatomicalStructure) current);
  }
  /**
   * Specifying something physically contained by something else. Typically used here for the underlying anatomical structures, such as organs, that comprise the anatomical system.
   */
  @JsonIgnore public AnatomicalSystem getComprisedOfAnatomicalSystem() {
    return (AnatomicalSystem) getValue("comprisedOf");
  }
  /**
   * Specifying something physically contained by something else. Typically used here for the underlying anatomical structures, such as organs, that comprise the anatomical system.
   */
  @JsonIgnore public Collection<AnatomicalSystem> getComprisedOfAnatomicalSystems() {
    final Object current = myData.get("comprisedOf");
    if (current == null) return Collections.emptyList();
    if (current instanceof Collection) {
      return (Collection<AnatomicalSystem>) current;
    }
    return Arrays.asList((AnatomicalSystem) current);
  }
  protected AnatomicalSystem(java.util.Map<String,Object> data) {
    super(data);
  }
  
  /**
   * Builder for {@link AnatomicalSystem}
   */
  public static class Builder extends MedicalEntity.Builder {
    public Builder(@NotNull HashMap<String,Object> data) {
      super(data);
    }
    @NotNull public AnatomicalSystem build() {
      return new AnatomicalSystem(myData);
    }
    /**
     * If applicable, a description of the pathophysiology associated with the anatomical system, including potential abnormal changes in the mechanical, physical, and biochemical functions of the system.
     */
    @NotNull public Builder associatedPathophysiology(@NotNull String associatedPathophysiology) {
      putValue("associatedPathophysiology", associatedPathophysiology);
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
     * Related anatomical structure(s) that are not part of the system but relate or connect to it, such as vascular bundles associated with an organ system.
     */
    @NotNull public Builder relatedStructure(@NotNull AnatomicalStructure anatomicalStructure) {
      putValue("relatedStructure", anatomicalStructure);
      return this;
    }
    /**
     * Related anatomical structure(s) that are not part of the system but relate or connect to it, such as vascular bundles associated with an organ system.
     */
    @NotNull public Builder relatedStructure(@NotNull AnatomicalStructure.Builder anatomicalStructure) {
      putValue("relatedStructure", anatomicalStructure.build());
      return this;
    }
    /**
     * Specifying something physically contained by something else. Typically used here for the underlying anatomical structures, such as organs, that comprise the anatomical system.
     */
    @NotNull public Builder comprisedOf(@NotNull AnatomicalStructure anatomicalStructure) {
      putValue("comprisedOf", anatomicalStructure);
      return this;
    }
    /**
     * Specifying something physically contained by something else. Typically used here for the underlying anatomical structures, such as organs, that comprise the anatomical system.
     */
    @NotNull public Builder comprisedOf(@NotNull AnatomicalStructure.Builder anatomicalStructure) {
      putValue("comprisedOf", anatomicalStructure.build());
      return this;
    }
    /**
     * Specifying something physically contained by something else. Typically used here for the underlying anatomical structures, such as organs, that comprise the anatomical system.
     */
    @NotNull public Builder comprisedOf(@NotNull AnatomicalSystem anatomicalSystem) {
      putValue("comprisedOf", anatomicalSystem);
      return this;
    }
    /**
     * Specifying something physically contained by something else. Typically used here for the underlying anatomical structures, such as organs, that comprise the anatomical system.
     */
    @NotNull public Builder comprisedOf(@NotNull AnatomicalSystem.Builder anatomicalSystem) {
      putValue("comprisedOf", anatomicalSystem.build());
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
      if ("associatedPathophysiology".equals(key) && value instanceof String) { this.associatedPathophysiology((String)value); return; }
      if ("associatedPathophysiologys".equals(key) && value instanceof String) { this.associatedPathophysiology((String)value); return; }
      if ("relatedCondition".equals(key) && value instanceof MedicalCondition) { this.relatedCondition((MedicalCondition)value); return; }
      if ("relatedConditions".equals(key) && value instanceof MedicalCondition) { this.relatedCondition((MedicalCondition)value); return; }
      if ("relatedTherapy".equals(key) && value instanceof MedicalTherapy) { this.relatedTherapy((MedicalTherapy)value); return; }
      if ("relatedTherapys".equals(key) && value instanceof MedicalTherapy) { this.relatedTherapy((MedicalTherapy)value); return; }
      if ("relatedStructure".equals(key) && value instanceof AnatomicalStructure) { this.relatedStructure((AnatomicalStructure)value); return; }
      if ("relatedStructures".equals(key) && value instanceof AnatomicalStructure) { this.relatedStructure((AnatomicalStructure)value); return; }
      if ("comprisedOf".equals(key) && value instanceof AnatomicalStructure) { this.comprisedOf((AnatomicalStructure)value); return; }
      if ("comprisedOfs".equals(key) && value instanceof AnatomicalStructure) { this.comprisedOf((AnatomicalStructure)value); return; }
      if ("comprisedOf".equals(key) && value instanceof AnatomicalSystem) { this.comprisedOf((AnatomicalSystem)value); return; }
      if ("comprisedOfs".equals(key) && value instanceof AnatomicalSystem) { this.comprisedOf((AnatomicalSystem)value); return; }
      super.fromMap(key, value);
    }
  }
  
}
