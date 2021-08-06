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
 * A strategy of regulating the intake of food to achieve or maintain a specific health-related goal.
 */
public class Diet extends LifestyleModification {
  /**
   * Specific physiologic risks associated to the diet plan.
   */
  @JsonIgnore public String getRisks() {
    return (String) getValue("risks");
  }
  /**
   * Specific physiologic risks associated to the diet plan.
   */
  @JsonIgnore public java.util.Collection<String> getRiskss() {
    final java.lang.Object current = myData.get("risks");
    if (current == null) return Collections.emptyList();
    if (current instanceof java.util.Collection) {
      return (java.util.Collection<String>) current;
    }
    return Arrays.asList((String) current);
  }
  /**
   * Specific physiologic benefits associated to the plan.
   */
  @JsonIgnore public String getPhysiologicalBenefits() {
    return (String) getValue("physiologicalBenefits");
  }
  /**
   * Specific physiologic benefits associated to the plan.
   */
  @JsonIgnore public java.util.Collection<String> getPhysiologicalBenefitss() {
    final java.lang.Object current = myData.get("physiologicalBenefits");
    if (current == null) return Collections.emptyList();
    if (current instanceof java.util.Collection) {
      return (java.util.Collection<String>) current;
    }
    return Arrays.asList((String) current);
  }
  /**
   * Medical expert advice related to the plan.
   */
  @JsonIgnore public String getExpertConsiderations() {
    return (String) getValue("expertConsiderations");
  }
  /**
   * Medical expert advice related to the plan.
   */
  @JsonIgnore public java.util.Collection<String> getExpertConsiderationss() {
    final java.lang.Object current = myData.get("expertConsiderations");
    if (current == null) return Collections.emptyList();
    if (current instanceof java.util.Collection) {
      return (java.util.Collection<String>) current;
    }
    return Arrays.asList((String) current);
  }
  /**
   * Nutritional information specific to the dietary plan. May include dietary recommendations on what foods to avoid, what foods to consume, and specific alterations/deviations from the USDA or other regulatory body's approved dietary guidelines.
   */
  @JsonIgnore public String getDietFeatures() {
    return (String) getValue("dietFeatures");
  }
  /**
   * Nutritional information specific to the dietary plan. May include dietary recommendations on what foods to avoid, what foods to consume, and specific alterations/deviations from the USDA or other regulatory body's approved dietary guidelines.
   */
  @JsonIgnore public java.util.Collection<String> getDietFeaturess() {
    final java.lang.Object current = myData.get("dietFeatures");
    if (current == null) return Collections.emptyList();
    if (current instanceof java.util.Collection) {
      return (java.util.Collection<String>) current;
    }
    return Arrays.asList((String) current);
  }
  /**
   * People or organizations that endorse the plan.
   */
  @JsonIgnore public Organization getEndorsersOrganization() {
    return (Organization) getValue("endorsers");
  }
  /**
   * People or organizations that endorse the plan.
   */
  @JsonIgnore public java.util.Collection<Organization> getEndorsersOrganizations() {
    final java.lang.Object current = myData.get("endorsers");
    if (current == null) return Collections.emptyList();
    if (current instanceof java.util.Collection) {
      return (java.util.Collection<Organization>) current;
    }
    return Arrays.asList((Organization) current);
  }
  /**
   * People or organizations that endorse the plan.
   */
  @JsonIgnore public Person getEndorsersPerson() {
    return (Person) getValue("endorsers");
  }
  /**
   * People or organizations that endorse the plan.
   */
  @JsonIgnore public java.util.Collection<Person> getEndorsersPersons() {
    final java.lang.Object current = myData.get("endorsers");
    if (current == null) return Collections.emptyList();
    if (current instanceof java.util.Collection) {
      return (java.util.Collection<Person>) current;
    }
    return Arrays.asList((Person) current);
  }
  protected Diet(java.util.Map<String,java.lang.Object> data) {
    super(data);
  }
  
  /**
   * Builder for {@link Diet}
   */
  public static class Builder extends LifestyleModification.Builder {
    public Builder(@NotNull HashMap<String,java.lang.Object> data) {
      super(data);
    }
    @NotNull public Diet build() {
      return new Diet(myData);
    }
    /**
     * Specific physiologic risks associated to the diet plan.
     */
    @NotNull public Builder risks(@NotNull String risks) {
      putValue("risks", risks);
      return this;
    }
    /**
     * Specific physiologic benefits associated to the plan.
     */
    @NotNull public Builder physiologicalBenefits(@NotNull String physiologicalBenefits) {
      putValue("physiologicalBenefits", physiologicalBenefits);
      return this;
    }
    /**
     * Medical expert advice related to the plan.
     */
    @NotNull public Builder expertConsiderations(@NotNull String expertConsiderations) {
      putValue("expertConsiderations", expertConsiderations);
      return this;
    }
    /**
     * Nutritional information specific to the dietary plan. May include dietary recommendations on what foods to avoid, what foods to consume, and specific alterations/deviations from the USDA or other regulatory body's approved dietary guidelines.
     */
    @NotNull public Builder dietFeatures(@NotNull String dietFeatures) {
      putValue("dietFeatures", dietFeatures);
      return this;
    }
    /**
     * People or organizations that endorse the plan.
     */
    @NotNull public Builder endorsers(@NotNull Organization organization) {
      putValue("endorsers", organization);
      return this;
    }
    /**
     * People or organizations that endorse the plan.
     */
    @NotNull public Builder endorsers(@NotNull Organization.Builder organization) {
      putValue("endorsers", organization.build());
      return this;
    }
    /**
     * People or organizations that endorse the plan.
     */
    @NotNull public Builder endorsers(@NotNull Person person) {
      putValue("endorsers", person);
      return this;
    }
    /**
     * People or organizations that endorse the plan.
     */
    @NotNull public Builder endorsers(@NotNull Person.Builder person) {
      putValue("endorsers", person.build());
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
      if ("risks".equals(key) && value instanceof String) { this.risks((String)value); return; }
      if ("riskss".equals(key) && value instanceof String) { this.risks((String)value); return; }
      if ("physiologicalBenefits".equals(key) && value instanceof String) { this.physiologicalBenefits((String)value); return; }
      if ("physiologicalBenefitss".equals(key) && value instanceof String) { this.physiologicalBenefits((String)value); return; }
      if ("expertConsiderations".equals(key) && value instanceof String) { this.expertConsiderations((String)value); return; }
      if ("expertConsiderationss".equals(key) && value instanceof String) { this.expertConsiderations((String)value); return; }
      if ("dietFeatures".equals(key) && value instanceof String) { this.dietFeatures((String)value); return; }
      if ("dietFeaturess".equals(key) && value instanceof String) { this.dietFeatures((String)value); return; }
      if ("endorsers".equals(key) && value instanceof Organization) { this.endorsers((Organization)value); return; }
      if ("endorserss".equals(key) && value instanceof Organization) { this.endorsers((Organization)value); return; }
      if ("endorsers".equals(key) && value instanceof Person) { this.endorsers((Person)value); return; }
      if ("endorserss".equals(key) && value instanceof Person) { this.endorsers((Person)value); return; }
      super.fromMap(key, value);
    }
  }
  
}
