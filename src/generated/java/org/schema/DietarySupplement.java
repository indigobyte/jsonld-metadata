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
 * A product taken by mouth that contains a dietary ingredient intended to supplement the diet. Dietary ingredients may include vitamins, minerals, herbs or other botanicals, amino acids, and substances such as enzymes, organ tissues, glandulars and metabolites.
 */
public class DietarySupplement extends Substance {
  /**
   * The manufacturer of the product.
   */
  @JsonIgnore public Organization getManufacturer() {
    return (Organization) getValue("manufacturer");
  }
  /**
   * The manufacturer of the product.
   */
  @JsonIgnore public java.util.Collection<Organization> getManufacturers() {
    final java.lang.Object current = myData.get("manufacturer");
    if (current == null) return Collections.emptyList();
    if (current instanceof java.util.Collection) {
      return (java.util.Collection<Organization>) current;
    }
    return Arrays.asList((Organization) current);
  }
  /**
   * An active ingredient, typically chemical compounds and/or biologic substances.
   */
  @JsonIgnore public String getActiveIngredient() {
    return (String) getValue("activeIngredient");
  }
  /**
   * An active ingredient, typically chemical compounds and/or biologic substances.
   */
  @JsonIgnore public java.util.Collection<String> getActiveIngredients() {
    final java.lang.Object current = myData.get("activeIngredient");
    if (current == null) return Collections.emptyList();
    if (current instanceof java.util.Collection) {
      return (java.util.Collection<String>) current;
    }
    return Arrays.asList((String) current);
  }
  /**
   * Recommended intake of this supplement for a given population as defined by a specific recommending authority.
   */
  @JsonIgnore public MaximumDoseSchedule getMaximumIntake() {
    return (MaximumDoseSchedule) getValue("maximumIntake");
  }
  /**
   * Recommended intake of this supplement for a given population as defined by a specific recommending authority.
   */
  @JsonIgnore public java.util.Collection<MaximumDoseSchedule> getMaximumIntakes() {
    final java.lang.Object current = myData.get("maximumIntake");
    if (current == null) return Collections.emptyList();
    if (current instanceof java.util.Collection) {
      return (java.util.Collection<MaximumDoseSchedule>) current;
    }
    return Arrays.asList((MaximumDoseSchedule) current);
  }
  /**
   * Recommended intake of this supplement for a given population as defined by a specific recommending authority.
   */
  @JsonIgnore public RecommendedDoseSchedule getRecommendedIntake() {
    return (RecommendedDoseSchedule) getValue("recommendedIntake");
  }
  /**
   * Recommended intake of this supplement for a given population as defined by a specific recommending authority.
   */
  @JsonIgnore public java.util.Collection<RecommendedDoseSchedule> getRecommendedIntakes() {
    final java.lang.Object current = myData.get("recommendedIntake");
    if (current == null) return Collections.emptyList();
    if (current instanceof java.util.Collection) {
      return (java.util.Collection<RecommendedDoseSchedule>) current;
    }
    return Arrays.asList((RecommendedDoseSchedule) current);
  }
  /**
   * The drug or supplement's legal status, including any controlled substance schedules that apply.
   */
  @JsonIgnore public DrugLegalStatus getLegalStatusDrugLegalStatus() {
    return (DrugLegalStatus) getValue("legalStatus");
  }
  /**
   * The drug or supplement's legal status, including any controlled substance schedules that apply.
   */
  @JsonIgnore public java.util.Collection<DrugLegalStatus> getLegalStatusDrugLegalStatuss() {
    final java.lang.Object current = myData.get("legalStatus");
    if (current == null) return Collections.emptyList();
    if (current instanceof java.util.Collection) {
      return (java.util.Collection<DrugLegalStatus>) current;
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
  @JsonIgnore public java.util.Collection<MedicalEnumeration> getLegalStatusMedicalEnumerations() {
    final java.lang.Object current = myData.get("legalStatus");
    if (current == null) return Collections.emptyList();
    if (current instanceof java.util.Collection) {
      return (java.util.Collection<MedicalEnumeration>) current;
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
  @JsonIgnore public java.util.Collection<String> getLegalStatusStrings() {
    final java.lang.Object current = myData.get("legalStatus");
    if (current == null) return Collections.emptyList();
    if (current instanceof java.util.Collection) {
      return (java.util.Collection<String>) current;
    }
    return Arrays.asList((String) current);
  }
  /**
   * True if this item's name is a proprietary/brand name (vs. generic name).
   */
  @JsonIgnore public Boolean getIsProprietary() {
    return (Boolean) getValue("isProprietary");
  }
  /**
   * True if this item's name is a proprietary/brand name (vs. generic name).
   */
  @JsonIgnore public java.util.Collection<Boolean> getIsProprietarys() {
    final java.lang.Object current = myData.get("isProprietary");
    if (current == null) return Collections.emptyList();
    if (current instanceof java.util.Collection) {
      return (java.util.Collection<Boolean>) current;
    }
    return Arrays.asList((Boolean) current);
  }
  /**
   * The generic name of this drug or supplement.
   */
  @JsonIgnore public String getNonProprietaryName() {
    return (String) getValue("nonProprietaryName");
  }
  /**
   * The generic name of this drug or supplement.
   */
  @JsonIgnore public java.util.Collection<String> getNonProprietaryNames() {
    final java.lang.Object current = myData.get("nonProprietaryName");
    if (current == null) return Collections.emptyList();
    if (current instanceof java.util.Collection) {
      return (java.util.Collection<String>) current;
    }
    return Arrays.asList((String) current);
  }
  /**
   * Characteristics of the population for which this is intended, or which typically uses it, e.g. 'adults'.
   */
  @JsonIgnore public String getTargetPopulation() {
    return (String) getValue("targetPopulation");
  }
  /**
   * Characteristics of the population for which this is intended, or which typically uses it, e.g. 'adults'.
   */
  @JsonIgnore public java.util.Collection<String> getTargetPopulations() {
    final java.lang.Object current = myData.get("targetPopulation");
    if (current == null) return Collections.emptyList();
    if (current instanceof java.util.Collection) {
      return (java.util.Collection<String>) current;
    }
    return Arrays.asList((String) current);
  }
  /**
   * The specific biochemical interaction through which this drug or supplement produces its pharmacological effect.
   */
  @JsonIgnore public String getMechanismOfAction() {
    return (String) getValue("mechanismOfAction");
  }
  /**
   * The specific biochemical interaction through which this drug or supplement produces its pharmacological effect.
   */
  @JsonIgnore public java.util.Collection<String> getMechanismOfActions() {
    final java.lang.Object current = myData.get("mechanismOfAction");
    if (current == null) return Collections.emptyList();
    if (current instanceof java.util.Collection) {
      return (java.util.Collection<String>) current;
    }
    return Arrays.asList((String) current);
  }
  /**
   * Any potential safety concern associated with the supplement. May include interactions with other drugs and foods, pregnancy, breastfeeding, known adverse reactions, and documented efficacy of the supplement.
   */
  @JsonIgnore public String getSafetyConsideration() {
    return (String) getValue("safetyConsideration");
  }
  /**
   * Any potential safety concern associated with the supplement. May include interactions with other drugs and foods, pregnancy, breastfeeding, known adverse reactions, and documented efficacy of the supplement.
   */
  @JsonIgnore public java.util.Collection<String> getSafetyConsiderations() {
    final java.lang.Object current = myData.get("safetyConsideration");
    if (current == null) return Collections.emptyList();
    if (current instanceof java.util.Collection) {
      return (java.util.Collection<String>) current;
    }
    return Arrays.asList((String) current);
  }
  /**
   * Proprietary name given to the diet plan, typically by its originator or creator.
   */
  @JsonIgnore public String getProprietaryName() {
    return (String) getValue("proprietaryName");
  }
  /**
   * Proprietary name given to the diet plan, typically by its originator or creator.
   */
  @JsonIgnore public java.util.Collection<String> getProprietaryNames() {
    final java.lang.Object current = myData.get("proprietaryName");
    if (current == null) return Collections.emptyList();
    if (current instanceof java.util.Collection) {
      return (java.util.Collection<String>) current;
    }
    return Arrays.asList((String) current);
  }
  protected DietarySupplement(java.util.Map<String,java.lang.Object> data) {
    super(data);
  }
  
  /**
   * Builder for {@link DietarySupplement}
   */
  public static class Builder extends Substance.Builder {
    public Builder(@NotNull HashMap<String,java.lang.Object> data) {
      super(data);
    }
    @NotNull public DietarySupplement build() {
      return new DietarySupplement(myData);
    }
    /**
     * The manufacturer of the product.
     */
    @NotNull public Builder manufacturer(@NotNull Organization organization) {
      putValue("manufacturer", organization);
      return this;
    }
    /**
     * The manufacturer of the product.
     */
    @NotNull public Builder manufacturer(@NotNull Organization.Builder organization) {
      putValue("manufacturer", organization.build());
      return this;
    }
    /**
     * An active ingredient, typically chemical compounds and/or biologic substances.
     */
    @NotNull public Builder activeIngredient(@NotNull String activeIngredient) {
      putValue("activeIngredient", activeIngredient);
      return this;
    }
    /**
     * Recommended intake of this supplement for a given population as defined by a specific recommending authority.
     */
    @NotNull public Builder maximumIntake(@NotNull MaximumDoseSchedule maximumDoseSchedule) {
      putValue("maximumIntake", maximumDoseSchedule);
      return this;
    }
    /**
     * Recommended intake of this supplement for a given population as defined by a specific recommending authority.
     */
    @NotNull public Builder maximumIntake(@NotNull MaximumDoseSchedule.Builder maximumDoseSchedule) {
      putValue("maximumIntake", maximumDoseSchedule.build());
      return this;
    }
    /**
     * Recommended intake of this supplement for a given population as defined by a specific recommending authority.
     */
    @NotNull public Builder recommendedIntake(@NotNull RecommendedDoseSchedule recommendedDoseSchedule) {
      putValue("recommendedIntake", recommendedDoseSchedule);
      return this;
    }
    /**
     * Recommended intake of this supplement for a given population as defined by a specific recommending authority.
     */
    @NotNull public Builder recommendedIntake(@NotNull RecommendedDoseSchedule.Builder recommendedDoseSchedule) {
      putValue("recommendedIntake", recommendedDoseSchedule.build());
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
     * True if this item's name is a proprietary/brand name (vs. generic name).
     */
    @NotNull public Builder isProprietary(@NotNull Boolean isProprietary) {
      putValue("isProprietary", isProprietary);
      return this;
    }
    /**
     * The generic name of this drug or supplement.
     */
    @NotNull public Builder nonProprietaryName(@NotNull String nonProprietaryName) {
      putValue("nonProprietaryName", nonProprietaryName);
      return this;
    }
    /**
     * Characteristics of the population for which this is intended, or which typically uses it, e.g. 'adults'.
     */
    @NotNull public Builder targetPopulation(@NotNull String targetPopulation) {
      putValue("targetPopulation", targetPopulation);
      return this;
    }
    /**
     * The specific biochemical interaction through which this drug or supplement produces its pharmacological effect.
     */
    @NotNull public Builder mechanismOfAction(@NotNull String mechanismOfAction) {
      putValue("mechanismOfAction", mechanismOfAction);
      return this;
    }
    /**
     * Any potential safety concern associated with the supplement. May include interactions with other drugs and foods, pregnancy, breastfeeding, known adverse reactions, and documented efficacy of the supplement.
     */
    @NotNull public Builder safetyConsideration(@NotNull String safetyConsideration) {
      putValue("safetyConsideration", safetyConsideration);
      return this;
    }
    /**
     * Proprietary name given to the diet plan, typically by its originator or creator.
     */
    @NotNull public Builder proprietaryName(@NotNull String proprietaryName) {
      putValue("proprietaryName", proprietaryName);
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
      if ("manufacturer".equals(key) && value instanceof Organization) { this.manufacturer((Organization)value); return; }
      if ("manufacturers".equals(key) && value instanceof Organization) { this.manufacturer((Organization)value); return; }
      if ("activeIngredient".equals(key) && value instanceof String) { this.activeIngredient((String)value); return; }
      if ("activeIngredients".equals(key) && value instanceof String) { this.activeIngredient((String)value); return; }
      if ("maximumIntake".equals(key) && value instanceof MaximumDoseSchedule) { this.maximumIntake((MaximumDoseSchedule)value); return; }
      if ("maximumIntakes".equals(key) && value instanceof MaximumDoseSchedule) { this.maximumIntake((MaximumDoseSchedule)value); return; }
      if ("recommendedIntake".equals(key) && value instanceof RecommendedDoseSchedule) { this.recommendedIntake((RecommendedDoseSchedule)value); return; }
      if ("recommendedIntakes".equals(key) && value instanceof RecommendedDoseSchedule) { this.recommendedIntake((RecommendedDoseSchedule)value); return; }
      if ("legalStatus".equals(key) && value instanceof DrugLegalStatus) { this.legalStatus((DrugLegalStatus)value); return; }
      if ("legalStatuss".equals(key) && value instanceof DrugLegalStatus) { this.legalStatus((DrugLegalStatus)value); return; }
      if ("legalStatus".equals(key) && value instanceof MedicalEnumeration) { this.legalStatus((MedicalEnumeration)value); return; }
      if ("legalStatuss".equals(key) && value instanceof MedicalEnumeration) { this.legalStatus((MedicalEnumeration)value); return; }
      if ("legalStatus".equals(key) && value instanceof String) { this.legalStatus((String)value); return; }
      if ("legalStatuss".equals(key) && value instanceof String) { this.legalStatus((String)value); return; }
      if ("isProprietary".equals(key) && value instanceof Boolean) { this.isProprietary((Boolean)value); return; }
      if ("isProprietarys".equals(key) && value instanceof Boolean) { this.isProprietary((Boolean)value); return; }
      if ("nonProprietaryName".equals(key) && value instanceof String) { this.nonProprietaryName((String)value); return; }
      if ("nonProprietaryNames".equals(key) && value instanceof String) { this.nonProprietaryName((String)value); return; }
      if ("targetPopulation".equals(key) && value instanceof String) { this.targetPopulation((String)value); return; }
      if ("targetPopulations".equals(key) && value instanceof String) { this.targetPopulation((String)value); return; }
      if ("mechanismOfAction".equals(key) && value instanceof String) { this.mechanismOfAction((String)value); return; }
      if ("mechanismOfActions".equals(key) && value instanceof String) { this.mechanismOfAction((String)value); return; }
      if ("safetyConsideration".equals(key) && value instanceof String) { this.safetyConsideration((String)value); return; }
      if ("safetyConsiderations".equals(key) && value instanceof String) { this.safetyConsideration((String)value); return; }
      if ("proprietaryName".equals(key) && value instanceof String) { this.proprietaryName((String)value); return; }
      if ("proprietaryNames".equals(key) && value instanceof String) { this.proprietaryName((String)value); return; }
      super.fromMap(key, value);
    }
  }
  
}
