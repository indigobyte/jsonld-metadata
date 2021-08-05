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
 * The most generic type of entity related to health and the practice of medicine.
 */
public class MedicalEntity extends Thing {
  /**
   * The drug or supplement's legal status, including any controlled substance schedules that apply.
   */
  @JsonIgnore public DrugLegalStatus getLegalStatusDrugLegalStatus() {
    return (DrugLegalStatus) getValue("legalStatus");
  }
  /**
   * The drug or supplement's legal status, including any controlled substance schedules that apply.
   */
  @JsonIgnore public Collection<DrugLegalStatus> getLegalStatusDrugLegalStatuss() {
    final Object current = myData.get("legalStatus");
    if (current == null) return Collections.emptyList();
    if (current instanceof Collection) {
      return (Collection<DrugLegalStatus>) current;
    }
    return Arrays.asList((DrugLegalStatus) current);
  }
  /**
   * The drug or supplement's legal status, including any controlled substance schedules that apply.
   */
  @JsonIgnore public MedicalEnumeration getLegalStatusMedicalEnumeration() {
    return (MedicalEnumeration) getValue("legalStatus");
  }
  /**
   * The drug or supplement's legal status, including any controlled substance schedules that apply.
   */
  @JsonIgnore public Collection<MedicalEnumeration> getLegalStatusMedicalEnumerations() {
    final Object current = myData.get("legalStatus");
    if (current == null) return Collections.emptyList();
    if (current instanceof Collection) {
      return (Collection<MedicalEnumeration>) current;
    }
    return Arrays.asList((MedicalEnumeration) current);
  }
  /**
   * The drug or supplement's legal status, including any controlled substance schedules that apply.
   */
  @JsonIgnore public String getLegalStatusString() {
    return (String) getValue("legalStatus");
  }
  /**
   * The drug or supplement's legal status, including any controlled substance schedules that apply.
   */
  @JsonIgnore public Collection<String> getLegalStatusStrings() {
    final Object current = myData.get("legalStatus");
    if (current == null) return Collections.emptyList();
    if (current instanceof Collection) {
      return (Collection<String>) current;
    }
    return Arrays.asList((String) current);
  }
  /**
   * A medical code for the entity, taken from a controlled vocabulary or ontology such as ICD-9, DiseasesDB, MeSH, SNOMED-CT, RxNorm, etc.
   */
  @JsonIgnore public MedicalCode getCode() {
    return (MedicalCode) getValue("code");
  }
  /**
   * A medical code for the entity, taken from a controlled vocabulary or ontology such as ICD-9, DiseasesDB, MeSH, SNOMED-CT, RxNorm, etc.
   */
  @JsonIgnore public Collection<MedicalCode> getCodes() {
    final Object current = myData.get("code");
    if (current == null) return Collections.emptyList();
    if (current instanceof Collection) {
      return (Collection<MedicalCode>) current;
    }
    return Arrays.asList((MedicalCode) current);
  }
  /**
   * If applicable, a medical specialty in which this entity is relevant.
   */
  @JsonIgnore public MedicalSpecialty getRelevantSpecialty() {
    return (MedicalSpecialty) getValue("relevantSpecialty");
  }
  /**
   * If applicable, a medical specialty in which this entity is relevant.
   */
  @JsonIgnore public Collection<MedicalSpecialty> getRelevantSpecialtys() {
    final Object current = myData.get("relevantSpecialty");
    if (current == null) return Collections.emptyList();
    if (current instanceof Collection) {
      return (Collection<MedicalSpecialty>) current;
    }
    return Arrays.asList((MedicalSpecialty) current);
  }
  /**
   * The system of medicine that includes this MedicalEntity, for example 'evidence-based', 'homeopathic', 'chiropractic', etc.
   */
  @JsonIgnore public MedicineSystem getMedicineSystem() {
    return (MedicineSystem) getValue("medicineSystem");
  }
  /**
   * The system of medicine that includes this MedicalEntity, for example 'evidence-based', 'homeopathic', 'chiropractic', etc.
   */
  @JsonIgnore public Collection<MedicineSystem> getMedicineSystems() {
    final Object current = myData.get("medicineSystem");
    if (current == null) return Collections.emptyList();
    if (current instanceof Collection) {
      return (Collection<MedicineSystem>) current;
    }
    return Arrays.asList((MedicineSystem) current);
  }
  /**
   * A medical study or trial related to this entity.
   */
  @JsonIgnore public MedicalStudy getStudy() {
    return (MedicalStudy) getValue("study");
  }
  /**
   * A medical study or trial related to this entity.
   */
  @JsonIgnore public Collection<MedicalStudy> getStudys() {
    final Object current = myData.get("study");
    if (current == null) return Collections.emptyList();
    if (current instanceof Collection) {
      return (Collection<MedicalStudy>) current;
    }
    return Arrays.asList((MedicalStudy) current);
  }
  /**
   * A medical guideline related to this entity.
   */
  @JsonIgnore public MedicalGuideline getGuideline() {
    return (MedicalGuideline) getValue("guideline");
  }
  /**
   * A medical guideline related to this entity.
   */
  @JsonIgnore public Collection<MedicalGuideline> getGuidelines() {
    final Object current = myData.get("guideline");
    if (current == null) return Collections.emptyList();
    if (current instanceof Collection) {
      return (Collection<MedicalGuideline>) current;
    }
    return Arrays.asList((MedicalGuideline) current);
  }
  /**
   * If applicable, the organization that officially recognizes this entity as part of its endorsed system of medicine.
   */
  @JsonIgnore public Organization getRecognizingAuthority() {
    return (Organization) getValue("recognizingAuthority");
  }
  /**
   * If applicable, the organization that officially recognizes this entity as part of its endorsed system of medicine.
   */
  @JsonIgnore public Collection<Organization> getRecognizingAuthoritys() {
    final Object current = myData.get("recognizingAuthority");
    if (current == null) return Collections.emptyList();
    if (current instanceof Collection) {
      return (Collection<Organization>) current;
    }
    return Arrays.asList((Organization) current);
  }
  protected MedicalEntity(java.util.Map<String,Object> data) {
    super(data);
  }
  
  /**
   * Builder for {@link MedicalEntity}
   */
  public static class Builder extends Thing.Builder {
    public Builder(@NotNull HashMap<String,Object> data) {
      super(data);
    }
    @NotNull public MedicalEntity build() {
      return new MedicalEntity(myData);
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
      if ("legalStatus".equals(key) && value instanceof DrugLegalStatus) { this.legalStatus((DrugLegalStatus)value); return; }
      if ("legalStatuss".equals(key) && value instanceof DrugLegalStatus) { this.legalStatus((DrugLegalStatus)value); return; }
      if ("legalStatus".equals(key) && value instanceof MedicalEnumeration) { this.legalStatus((MedicalEnumeration)value); return; }
      if ("legalStatuss".equals(key) && value instanceof MedicalEnumeration) { this.legalStatus((MedicalEnumeration)value); return; }
      if ("legalStatus".equals(key) && value instanceof String) { this.legalStatus((String)value); return; }
      if ("legalStatuss".equals(key) && value instanceof String) { this.legalStatus((String)value); return; }
      if ("code".equals(key) && value instanceof MedicalCode) { this.code((MedicalCode)value); return; }
      if ("codes".equals(key) && value instanceof MedicalCode) { this.code((MedicalCode)value); return; }
      if ("relevantSpecialty".equals(key) && value instanceof MedicalSpecialty) { this.relevantSpecialty((MedicalSpecialty)value); return; }
      if ("relevantSpecialtys".equals(key) && value instanceof MedicalSpecialty) { this.relevantSpecialty((MedicalSpecialty)value); return; }
      if ("medicineSystem".equals(key) && value instanceof MedicineSystem) { this.medicineSystem((MedicineSystem)value); return; }
      if ("medicineSystems".equals(key) && value instanceof MedicineSystem) { this.medicineSystem((MedicineSystem)value); return; }
      if ("study".equals(key) && value instanceof MedicalStudy) { this.study((MedicalStudy)value); return; }
      if ("studys".equals(key) && value instanceof MedicalStudy) { this.study((MedicalStudy)value); return; }
      if ("guideline".equals(key) && value instanceof MedicalGuideline) { this.guideline((MedicalGuideline)value); return; }
      if ("guidelines".equals(key) && value instanceof MedicalGuideline) { this.guideline((MedicalGuideline)value); return; }
      if ("recognizingAuthority".equals(key) && value instanceof Organization) { this.recognizingAuthority((Organization)value); return; }
      if ("recognizingAuthoritys".equals(key) && value instanceof Organization) { this.recognizingAuthority((Organization)value); return; }
      super.fromMap(key, value);
    }
  }
  
}
