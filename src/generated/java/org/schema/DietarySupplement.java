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
 * A product taken by mouth that contains a dietary ingredient intended to supplement the diet. Dietary ingredients may include vitamins, minerals, herbs or other botanicals, amino acids, and substances such as enzymes, organ tissues, glandulars and metabolites.
 */
public class DietarySupplement extends Substance {
  /**
   * The manufacturer of the product.
   * @return manufacturer property set by first invocation of manufacturer method or {@code null}.
   */
  @JsonIgnore public Organization getManufacturer() {
    return (Organization) getValue("manufacturer");
  }
  /**
   * The manufacturer of the product.
   * @return all manufacturer properties as {@link java.util.Collection} or an empty collection 
   * if manufacturer was not set.
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
   * @return activeIngredient property set by first invocation of activeIngredient method or {@code null}.
   */
  @JsonIgnore public String getActiveIngredient() {
    return (String) getValue("activeIngredient");
  }
  /**
   * An active ingredient, typically chemical compounds and/or biologic substances.
   * @return all activeIngredient properties as {@link java.util.Collection} or an empty collection 
   * if activeIngredient was not set.
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
   * @return maximumIntake property set by first invocation of maximumIntake method or {@code null}.
   */
  @JsonIgnore public MaximumDoseSchedule getMaximumIntake() {
    return (MaximumDoseSchedule) getValue("maximumIntake");
  }
  /**
   * Recommended intake of this supplement for a given population as defined by a specific recommending authority.
   * @return all maximumIntake properties as {@link java.util.Collection} or an empty collection 
   * if maximumIntake was not set.
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
   * @return recommendedIntake property set by first invocation of recommendedIntake method or {@code null}.
   */
  @JsonIgnore public RecommendedDoseSchedule getRecommendedIntake() {
    return (RecommendedDoseSchedule) getValue("recommendedIntake");
  }
  /**
   * Recommended intake of this supplement for a given population as defined by a specific recommending authority.
   * @return all recommendedIntake properties as {@link java.util.Collection} or an empty collection 
   * if recommendedIntake was not set.
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
   * @return legalStatus property set by first invocation of legalStatus method or {@code null}.
   */
  @JsonIgnore public DrugLegalStatus getLegalStatusDrugLegalStatus() {
    return (DrugLegalStatus) getValue("legalStatus");
  }
  /**
   * The drug or supplement's legal status, including any controlled substance schedules that apply.
   * @return all legalStatus properties as {@link java.util.Collection} or an empty collection 
   * if legalStatus was not set.
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
   * @return legalStatus property set by first invocation of legalStatus method or {@code null}.
   */
  @JsonIgnore public MedicalEnumeration getLegalStatusMedicalEnumeration() {
    return (MedicalEnumeration) getValue("legalStatus");
  }
  /**
   * The drug or supplement's legal status, including any controlled substance schedules that apply.
   * @return all legalStatus properties as {@link java.util.Collection} or an empty collection 
   * if legalStatus was not set.
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
   * @return legalStatus property set by first invocation of legalStatus method or {@code null}.
   */
  @JsonIgnore public String getLegalStatusString() {
    return (String) getValue("legalStatus");
  }
  /**
   * The drug or supplement's legal status, including any controlled substance schedules that apply.
   * @return all legalStatus properties as {@link java.util.Collection} or an empty collection 
   * if legalStatus was not set.
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
   * @return isProprietary property set by first invocation of isProprietary method or {@code null}.
   */
  @JsonIgnore public Boolean getIsProprietary() {
    return (Boolean) getValue("isProprietary");
  }
  /**
   * True if this item's name is a proprietary/brand name (vs. generic name).
   * @return all isProprietary properties as {@link java.util.Collection} or an empty collection 
   * if isProprietary was not set.
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
   * @return nonProprietaryName property set by first invocation of nonProprietaryName method or {@code null}.
   */
  @JsonIgnore public String getNonProprietaryName() {
    return (String) getValue("nonProprietaryName");
  }
  /**
   * The generic name of this drug or supplement.
   * @return all nonProprietaryName properties as {@link java.util.Collection} or an empty collection 
   * if nonProprietaryName was not set.
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
   * @return targetPopulation property set by first invocation of targetPopulation method or {@code null}.
   */
  @JsonIgnore public String getTargetPopulation() {
    return (String) getValue("targetPopulation");
  }
  /**
   * Characteristics of the population for which this is intended, or which typically uses it, e.g. 'adults'.
   * @return all targetPopulation properties as {@link java.util.Collection} or an empty collection 
   * if targetPopulation was not set.
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
   * @return mechanismOfAction property set by first invocation of mechanismOfAction method or {@code null}.
   */
  @JsonIgnore public String getMechanismOfAction() {
    return (String) getValue("mechanismOfAction");
  }
  /**
   * The specific biochemical interaction through which this drug or supplement produces its pharmacological effect.
   * @return all mechanismOfAction properties as {@link java.util.Collection} or an empty collection 
   * if mechanismOfAction was not set.
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
   * @return safetyConsideration property set by first invocation of safetyConsideration method or {@code null}.
   */
  @JsonIgnore public String getSafetyConsideration() {
    return (String) getValue("safetyConsideration");
  }
  /**
   * Any potential safety concern associated with the supplement. May include interactions with other drugs and foods, pregnancy, breastfeeding, known adverse reactions, and documented efficacy of the supplement.
   * @return all safetyConsideration properties as {@link java.util.Collection} or an empty collection 
   * if safetyConsideration was not set.
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
   * @return proprietaryName property set by first invocation of proprietaryName method or {@code null}.
   */
  @JsonIgnore public String getProprietaryName() {
    return (String) getValue("proprietaryName");
  }
  /**
   * Proprietary name given to the diet plan, typically by its originator or creator.
   * @return all proprietaryName properties as {@link java.util.Collection} or an empty collection 
   * if proprietaryName was not set.
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
     * @param organization value to set
     * @return this builder instance
     */
    @NotNull public Builder manufacturer(@NotNull Organization organization) {
      putValue("manufacturer", organization);
      return this;
    }
    /**
     * The manufacturer of the product.
     * @param organization value to set
     * @return this builder instance
     */
    @NotNull public Builder manufacturer(@NotNull Organization.Builder organization) {
      putValue("manufacturer", organization.build());
      return this;
    }
    /**
     * Remove manufacturer property from the builder.
     * If this property is repeatable, all instances are removed.
     * @return this builder instance
     */
    @NotNull public Builder removeManufacturer() {
      removeValue("manufacturer");
      return this;
    }
    /**
     * Get currently set value for manufacturer property in this builder.
     * @return previously set value or {@code null}. If multiple values have been 
     * set to this property, then {@link java.util.Collection} instance will be 
     * returned.
     */
    @Nullable public java.lang.Object getManufacturer() {
      return myData.get("manufacturer");
    }
    /**
     * An active ingredient, typically chemical compounds and/or biologic substances.
     * @param activeIngredient value to set
     * @return this builder instance
     */
    @NotNull public Builder activeIngredient(@NotNull String activeIngredient) {
      putValue("activeIngredient", activeIngredient);
      return this;
    }
    /**
     * Remove activeIngredient property from the builder.
     * If this property is repeatable, all instances are removed.
     * @return this builder instance
     */
    @NotNull public Builder removeActiveIngredient() {
      removeValue("activeIngredient");
      return this;
    }
    /**
     * Get currently set value for activeIngredient property in this builder.
     * @return previously set value or {@code null}. If multiple values have been 
     * set to this property, then {@link java.util.Collection} instance will be 
     * returned.
     */
    @Nullable public java.lang.Object getActiveIngredient() {
      return myData.get("activeIngredient");
    }
    /**
     * Recommended intake of this supplement for a given population as defined by a specific recommending authority.
     * @param maximumDoseSchedule value to set
     * @return this builder instance
     */
    @NotNull public Builder maximumIntake(@NotNull MaximumDoseSchedule maximumDoseSchedule) {
      putValue("maximumIntake", maximumDoseSchedule);
      return this;
    }
    /**
     * Recommended intake of this supplement for a given population as defined by a specific recommending authority.
     * @param maximumDoseSchedule value to set
     * @return this builder instance
     */
    @NotNull public Builder maximumIntake(@NotNull MaximumDoseSchedule.Builder maximumDoseSchedule) {
      putValue("maximumIntake", maximumDoseSchedule.build());
      return this;
    }
    /**
     * Remove maximumIntake property from the builder.
     * If this property is repeatable, all instances are removed.
     * @return this builder instance
     */
    @NotNull public Builder removeMaximumIntake() {
      removeValue("maximumIntake");
      return this;
    }
    /**
     * Get currently set value for maximumIntake property in this builder.
     * @return previously set value or {@code null}. If multiple values have been 
     * set to this property, then {@link java.util.Collection} instance will be 
     * returned.
     */
    @Nullable public java.lang.Object getMaximumIntake() {
      return myData.get("maximumIntake");
    }
    /**
     * Recommended intake of this supplement for a given population as defined by a specific recommending authority.
     * @param recommendedDoseSchedule value to set
     * @return this builder instance
     */
    @NotNull public Builder recommendedIntake(@NotNull RecommendedDoseSchedule recommendedDoseSchedule) {
      putValue("recommendedIntake", recommendedDoseSchedule);
      return this;
    }
    /**
     * Recommended intake of this supplement for a given population as defined by a specific recommending authority.
     * @param recommendedDoseSchedule value to set
     * @return this builder instance
     */
    @NotNull public Builder recommendedIntake(@NotNull RecommendedDoseSchedule.Builder recommendedDoseSchedule) {
      putValue("recommendedIntake", recommendedDoseSchedule.build());
      return this;
    }
    /**
     * Remove recommendedIntake property from the builder.
     * If this property is repeatable, all instances are removed.
     * @return this builder instance
     */
    @NotNull public Builder removeRecommendedIntake() {
      removeValue("recommendedIntake");
      return this;
    }
    /**
     * Get currently set value for recommendedIntake property in this builder.
     * @return previously set value or {@code null}. If multiple values have been 
     * set to this property, then {@link java.util.Collection} instance will be 
     * returned.
     */
    @Nullable public java.lang.Object getRecommendedIntake() {
      return myData.get("recommendedIntake");
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
     * True if this item's name is a proprietary/brand name (vs. generic name).
     * @param isProprietary value to set
     * @return this builder instance
     */
    @NotNull public Builder isProprietary(@NotNull Boolean isProprietary) {
      putValue("isProprietary", isProprietary);
      return this;
    }
    /**
     * Remove isProprietary property from the builder.
     * If this property is repeatable, all instances are removed.
     * @return this builder instance
     */
    @NotNull public Builder removeIsProprietary() {
      removeValue("isProprietary");
      return this;
    }
    /**
     * Get currently set value for isProprietary property in this builder.
     * @return previously set value or {@code null}. If multiple values have been 
     * set to this property, then {@link java.util.Collection} instance will be 
     * returned.
     */
    @Nullable public java.lang.Object getIsProprietary() {
      return myData.get("isProprietary");
    }
    /**
     * The generic name of this drug or supplement.
     * @param nonProprietaryName value to set
     * @return this builder instance
     */
    @NotNull public Builder nonProprietaryName(@NotNull String nonProprietaryName) {
      putValue("nonProprietaryName", nonProprietaryName);
      return this;
    }
    /**
     * Remove nonProprietaryName property from the builder.
     * If this property is repeatable, all instances are removed.
     * @return this builder instance
     */
    @NotNull public Builder removeNonProprietaryName() {
      removeValue("nonProprietaryName");
      return this;
    }
    /**
     * Get currently set value for nonProprietaryName property in this builder.
     * @return previously set value or {@code null}. If multiple values have been 
     * set to this property, then {@link java.util.Collection} instance will be 
     * returned.
     */
    @Nullable public java.lang.Object getNonProprietaryName() {
      return myData.get("nonProprietaryName");
    }
    /**
     * Characteristics of the population for which this is intended, or which typically uses it, e.g. 'adults'.
     * @param targetPopulation value to set
     * @return this builder instance
     */
    @NotNull public Builder targetPopulation(@NotNull String targetPopulation) {
      putValue("targetPopulation", targetPopulation);
      return this;
    }
    /**
     * Remove targetPopulation property from the builder.
     * If this property is repeatable, all instances are removed.
     * @return this builder instance
     */
    @NotNull public Builder removeTargetPopulation() {
      removeValue("targetPopulation");
      return this;
    }
    /**
     * Get currently set value for targetPopulation property in this builder.
     * @return previously set value or {@code null}. If multiple values have been 
     * set to this property, then {@link java.util.Collection} instance will be 
     * returned.
     */
    @Nullable public java.lang.Object getTargetPopulation() {
      return myData.get("targetPopulation");
    }
    /**
     * The specific biochemical interaction through which this drug or supplement produces its pharmacological effect.
     * @param mechanismOfAction value to set
     * @return this builder instance
     */
    @NotNull public Builder mechanismOfAction(@NotNull String mechanismOfAction) {
      putValue("mechanismOfAction", mechanismOfAction);
      return this;
    }
    /**
     * Remove mechanismOfAction property from the builder.
     * If this property is repeatable, all instances are removed.
     * @return this builder instance
     */
    @NotNull public Builder removeMechanismOfAction() {
      removeValue("mechanismOfAction");
      return this;
    }
    /**
     * Get currently set value for mechanismOfAction property in this builder.
     * @return previously set value or {@code null}. If multiple values have been 
     * set to this property, then {@link java.util.Collection} instance will be 
     * returned.
     */
    @Nullable public java.lang.Object getMechanismOfAction() {
      return myData.get("mechanismOfAction");
    }
    /**
     * Any potential safety concern associated with the supplement. May include interactions with other drugs and foods, pregnancy, breastfeeding, known adverse reactions, and documented efficacy of the supplement.
     * @param safetyConsideration value to set
     * @return this builder instance
     */
    @NotNull public Builder safetyConsideration(@NotNull String safetyConsideration) {
      putValue("safetyConsideration", safetyConsideration);
      return this;
    }
    /**
     * Remove safetyConsideration property from the builder.
     * If this property is repeatable, all instances are removed.
     * @return this builder instance
     */
    @NotNull public Builder removeSafetyConsideration() {
      removeValue("safetyConsideration");
      return this;
    }
    /**
     * Get currently set value for safetyConsideration property in this builder.
     * @return previously set value or {@code null}. If multiple values have been 
     * set to this property, then {@link java.util.Collection} instance will be 
     * returned.
     */
    @Nullable public java.lang.Object getSafetyConsideration() {
      return myData.get("safetyConsideration");
    }
    /**
     * Proprietary name given to the diet plan, typically by its originator or creator.
     * @param proprietaryName value to set
     * @return this builder instance
     */
    @NotNull public Builder proprietaryName(@NotNull String proprietaryName) {
      putValue("proprietaryName", proprietaryName);
      return this;
    }
    /**
     * Remove proprietaryName property from the builder.
     * If this property is repeatable, all instances are removed.
     * @return this builder instance
     */
    @NotNull public Builder removeProprietaryName() {
      removeValue("proprietaryName");
      return this;
    }
    /**
     * Get currently set value for proprietaryName property in this builder.
     * @return previously set value or {@code null}. If multiple values have been 
     * set to this property, then {@link java.util.Collection} instance will be 
     * returned.
     */
    @Nullable public java.lang.Object getProprietaryName() {
      return myData.get("proprietaryName");
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
