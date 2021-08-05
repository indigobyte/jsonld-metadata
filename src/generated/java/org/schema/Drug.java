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
 * A chemical or biologic substance, used as a medical therapy, that has a physiological effect on an organism. Here the term drug is used interchangeably with the term medicine although clinical knowledge make a clear difference between them.Equivalent class: http://purl.bioontology.org/ontology/SNOMEDCT/410942007
 */
public class Drug extends Substance {
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
    final Object current = myData.get("manufacturer");
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
    final Object current = myData.get("activeIngredient");
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
    final Object current = myData.get("maximumIntake");
    if (current == null) return Collections.emptyList();
    if (current instanceof java.util.Collection) {
      return (java.util.Collection<MaximumDoseSchedule>) current;
    }
    return Arrays.asList((MaximumDoseSchedule) current);
  }
  /**
   * The insurance plans that cover this drug.
   */
  @JsonIgnore public HealthInsurancePlan getIncludedInHealthInsurancePlan() {
    return (HealthInsurancePlan) getValue("includedInHealthInsurancePlan");
  }
  /**
   * The insurance plans that cover this drug.
   */
  @JsonIgnore public java.util.Collection<HealthInsurancePlan> getIncludedInHealthInsurancePlans() {
    final Object current = myData.get("includedInHealthInsurancePlan");
    if (current == null) return Collections.emptyList();
    if (current instanceof java.util.Collection) {
      return (java.util.Collection<HealthInsurancePlan>) current;
    }
    return Arrays.asList((HealthInsurancePlan) current);
  }
  /**
   * Any other drug related to this one, for example commonly-prescribed alternatives.
   */
  @JsonIgnore public Drug getRelatedDrug() {
    return (Drug) getValue("relatedDrug");
  }
  /**
   * Any other drug related to this one, for example commonly-prescribed alternatives.
   */
  @JsonIgnore public java.util.Collection<Drug> getRelatedDrugs() {
    final Object current = myData.get("relatedDrug");
    if (current == null) return Collections.emptyList();
    if (current instanceof java.util.Collection) {
      return (java.util.Collection<Drug>) current;
    }
    return Arrays.asList((Drug) current);
  }
  /**
   * Any precaution, guidance, contraindication, etc. related to consumption of specific foods while taking this drug.
   */
  @JsonIgnore public String getFoodWarning() {
    return (String) getValue("foodWarning");
  }
  /**
   * Any precaution, guidance, contraindication, etc. related to consumption of specific foods while taking this drug.
   */
  @JsonIgnore public java.util.Collection<String> getFoodWarnings() {
    final Object current = myData.get("foodWarning");
    if (current == null) return Collections.emptyList();
    if (current instanceof java.util.Collection) {
      return (java.util.Collection<String>) current;
    }
    return Arrays.asList((String) current);
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
    final Object current = myData.get("legalStatus");
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
    final Object current = myData.get("legalStatus");
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
    final Object current = myData.get("legalStatus");
    if (current == null) return Collections.emptyList();
    if (current instanceof java.util.Collection) {
      return (java.util.Collection<String>) current;
    }
    return Arrays.asList((String) current);
  }
  /**
   * Any information related to overdose on a drug, including signs or symptoms, treatments, contact information for emergency response.
   */
  @JsonIgnore public String getOverdosage() {
    return (String) getValue("overdosage");
  }
  /**
   * Any information related to overdose on a drug, including signs or symptoms, treatments, contact information for emergency response.
   */
  @JsonIgnore public java.util.Collection<String> getOverdosages() {
    final Object current = myData.get("overdosage");
    if (current == null) return Collections.emptyList();
    if (current instanceof java.util.Collection) {
      return (java.util.Collection<String>) current;
    }
    return Arrays.asList((String) current);
  }
  /**
   * The class of drug this belongs to (e.g., statins).
   */
  @JsonIgnore public DrugClass getDrugClass() {
    return (DrugClass) getValue("drugClass");
  }
  /**
   * The class of drug this belongs to (e.g., statins).
   */
  @JsonIgnore public java.util.Collection<DrugClass> getDrugClasss() {
    final Object current = myData.get("drugClass");
    if (current == null) return Collections.emptyList();
    if (current instanceof java.util.Collection) {
      return (java.util.Collection<DrugClass>) current;
    }
    return Arrays.asList((DrugClass) current);
  }
  /**
   * An available dosage strength for the drug.
   */
  @JsonIgnore public DrugStrength getAvailableStrength() {
    return (DrugStrength) getValue("availableStrength");
  }
  /**
   * An available dosage strength for the drug.
   */
  @JsonIgnore public java.util.Collection<DrugStrength> getAvailableStrengths() {
    final Object current = myData.get("availableStrength");
    if (current == null) return Collections.emptyList();
    if (current instanceof java.util.Collection) {
      return (java.util.Collection<DrugStrength>) current;
    }
    return Arrays.asList((DrugStrength) current);
  }
  /**
   * A route by which this drug may be administered, e.g. 'oral'.
   */
  @JsonIgnore public String getAdministrationRoute() {
    return (String) getValue("administrationRoute");
  }
  /**
   * A route by which this drug may be administered, e.g. 'oral'.
   */
  @JsonIgnore public java.util.Collection<String> getAdministrationRoutes() {
    final Object current = myData.get("administrationRoute");
    if (current == null) return Collections.emptyList();
    if (current instanceof java.util.Collection) {
      return (java.util.Collection<String>) current;
    }
    return Arrays.asList((String) current);
  }
  /**
   * Link to prescribing information for the drug.
   */
  @JsonIgnore public String getPrescribingInfo() {
    return (String) getValue("prescribingInfo");
  }
  /**
   * Link to prescribing information for the drug.
   */
  @JsonIgnore public java.util.Collection<String> getPrescribingInfos() {
    final Object current = myData.get("prescribingInfo");
    if (current == null) return Collections.emptyList();
    if (current instanceof java.util.Collection) {
      return (java.util.Collection<String>) current;
    }
    return Arrays.asList((String) current);
  }
  /**
   * Any precaution, guidance, contraindication, etc. related to this drug's use by breastfeeding mothers.
   */
  @JsonIgnore public String getBreastfeedingWarning() {
    return (String) getValue("breastfeedingWarning");
  }
  /**
   * Any precaution, guidance, contraindication, etc. related to this drug's use by breastfeeding mothers.
   */
  @JsonIgnore public java.util.Collection<String> getBreastfeedingWarnings() {
    final Object current = myData.get("breastfeedingWarning");
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
    final Object current = myData.get("isProprietary");
    if (current == null) return Collections.emptyList();
    if (current instanceof java.util.Collection) {
      return (java.util.Collection<Boolean>) current;
    }
    return Arrays.asList((Boolean) current);
  }
  /**
   * Another drug that is known to interact with this drug in a way that impacts the effect of this drug or causes a risk to the patient. Note: disease interactions are typically captured as contraindications.
   */
  @JsonIgnore public Drug getInteractingDrug() {
    return (Drug) getValue("interactingDrug");
  }
  /**
   * Another drug that is known to interact with this drug in a way that impacts the effect of this drug or causes a risk to the patient. Note: disease interactions are typically captured as contraindications.
   */
  @JsonIgnore public java.util.Collection<Drug> getInteractingDrugs() {
    final Object current = myData.get("interactingDrug");
    if (current == null) return Collections.emptyList();
    if (current instanceof java.util.Collection) {
      return (java.util.Collection<Drug>) current;
    }
    return Arrays.asList((Drug) current);
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
    final Object current = myData.get("nonProprietaryName");
    if (current == null) return Collections.emptyList();
    if (current instanceof java.util.Collection) {
      return (java.util.Collection<String>) current;
    }
    return Arrays.asList((String) current);
  }
  /**
   * True if the drug is available in a generic form (regardless of name).
   */
  @JsonIgnore public Boolean getIsAvailableGenerically() {
    return (Boolean) getValue("isAvailableGenerically");
  }
  /**
   * True if the drug is available in a generic form (regardless of name).
   */
  @JsonIgnore public java.util.Collection<Boolean> getIsAvailableGenericallys() {
    final Object current = myData.get("isAvailableGenerically");
    if (current == null) return Collections.emptyList();
    if (current instanceof java.util.Collection) {
      return (java.util.Collection<Boolean>) current;
    }
    return Arrays.asList((Boolean) current);
  }
  /**
   * Pregnancy category of this drug.
   */
  @JsonIgnore public DrugPregnancyCategory getPregnancyCategory() {
    return (DrugPregnancyCategory) getValue("pregnancyCategory");
  }
  /**
   * Pregnancy category of this drug.
   */
  @JsonIgnore public java.util.Collection<DrugPregnancyCategory> getPregnancyCategorys() {
    final Object current = myData.get("pregnancyCategory");
    if (current == null) return Collections.emptyList();
    if (current instanceof java.util.Collection) {
      return (java.util.Collection<DrugPregnancyCategory>) current;
    }
    return Arrays.asList((DrugPregnancyCategory) current);
  }
  /**
   * Any precaution, guidance, contraindication, etc. related to this drug's use during pregnancy.
   */
  @JsonIgnore public String getPregnancyWarning() {
    return (String) getValue("pregnancyWarning");
  }
  /**
   * Any precaution, guidance, contraindication, etc. related to this drug's use during pregnancy.
   */
  @JsonIgnore public java.util.Collection<String> getPregnancyWarnings() {
    final Object current = myData.get("pregnancyWarning");
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
    final Object current = myData.get("mechanismOfAction");
    if (current == null) return Collections.emptyList();
    if (current instanceof java.util.Collection) {
      return (java.util.Collection<String>) current;
    }
    return Arrays.asList((String) current);
  }
  /**
   * A dosing schedule for the drug for a given population, either observed, recommended, or maximum dose based on the type used.
   */
  @JsonIgnore public DoseSchedule getDoseSchedule() {
    return (DoseSchedule) getValue("doseSchedule");
  }
  /**
   * A dosing schedule for the drug for a given population, either observed, recommended, or maximum dose based on the type used.
   */
  @JsonIgnore public java.util.Collection<DoseSchedule> getDoseSchedules() {
    final Object current = myData.get("doseSchedule");
    if (current == null) return Collections.emptyList();
    if (current instanceof java.util.Collection) {
      return (java.util.Collection<DoseSchedule>) current;
    }
    return Arrays.asList((DoseSchedule) current);
  }
  /**
   * Any precaution, guidance, contraindication, etc. related to consumption of alcohol while taking this drug.
   */
  @JsonIgnore public String getAlcoholWarning() {
    return (String) getValue("alcoholWarning");
  }
  /**
   * Any precaution, guidance, contraindication, etc. related to consumption of alcohol while taking this drug.
   */
  @JsonIgnore public java.util.Collection<String> getAlcoholWarnings() {
    final Object current = myData.get("alcoholWarning");
    if (current == null) return Collections.emptyList();
    if (current instanceof java.util.Collection) {
      return (java.util.Collection<String>) current;
    }
    return Arrays.asList((String) current);
  }
  /**
   * Link to the drug's label details.
   */
  @JsonIgnore public String getLabelDetails() {
    return (String) getValue("labelDetails");
  }
  /**
   * Link to the drug's label details.
   */
  @JsonIgnore public java.util.Collection<String> getLabelDetailss() {
    final Object current = myData.get("labelDetails");
    if (current == null) return Collections.emptyList();
    if (current instanceof java.util.Collection) {
      return (java.util.Collection<String>) current;
    }
    return Arrays.asList((String) current);
  }
  /**
   * Indicates the status of drug prescription eg. local catalogs classifications or whether the drug is available by prescription or over-the-counter, etc.
   */
  @JsonIgnore public DrugPrescriptionStatus getPrescriptionStatusDrugPrescriptionStatus() {
    return (DrugPrescriptionStatus) getValue("prescriptionStatus");
  }
  /**
   * Indicates the status of drug prescription eg. local catalogs classifications or whether the drug is available by prescription or over-the-counter, etc.
   */
  @JsonIgnore public java.util.Collection<DrugPrescriptionStatus> getPrescriptionStatusDrugPrescriptionStatuss() {
    final Object current = myData.get("prescriptionStatus");
    if (current == null) return Collections.emptyList();
    if (current instanceof java.util.Collection) {
      return (java.util.Collection<DrugPrescriptionStatus>) current;
    }
    return Arrays.asList((DrugPrescriptionStatus) current);
  }
  /**
   * Indicates the status of drug prescription eg. local catalogs classifications or whether the drug is available by prescription or over-the-counter, etc.
   */
  @JsonIgnore public String getPrescriptionStatusString() {
    return (String) getValue("prescriptionStatus");
  }
  /**
   * Indicates the status of drug prescription eg. local catalogs classifications or whether the drug is available by prescription or over-the-counter, etc.
   */
  @JsonIgnore public java.util.Collection<String> getPrescriptionStatusStrings() {
    final Object current = myData.get("prescriptionStatus");
    if (current == null) return Collections.emptyList();
    if (current instanceof java.util.Collection) {
      return (java.util.Collection<String>) current;
    }
    return Arrays.asList((String) current);
  }
  /**
   * A dosage form in which this drug/supplement is available, e.g. 'tablet', 'suspension', 'injection'.
   */
  @JsonIgnore public String getDosageForm() {
    return (String) getValue("dosageForm");
  }
  /**
   * A dosage form in which this drug/supplement is available, e.g. 'tablet', 'suspension', 'injection'.
   */
  @JsonIgnore public java.util.Collection<String> getDosageForms() {
    final Object current = myData.get("dosageForm");
    if (current == null) return Collections.emptyList();
    if (current instanceof java.util.Collection) {
      return (java.util.Collection<String>) current;
    }
    return Arrays.asList((String) current);
  }
  /**
   * The unit in which the drug is measured, e.g. '5 mg tablet'.
   */
  @JsonIgnore public String getDrugUnit() {
    return (String) getValue("drugUnit");
  }
  /**
   * The unit in which the drug is measured, e.g. '5 mg tablet'.
   */
  @JsonIgnore public java.util.Collection<String> getDrugUnits() {
    final Object current = myData.get("drugUnit");
    if (current == null) return Collections.emptyList();
    if (current instanceof java.util.Collection) {
      return (java.util.Collection<String>) current;
    }
    return Arrays.asList((String) current);
  }
  /**
   * The RxCUI drug identifier from RXNORM.
   */
  @JsonIgnore public String getRxcui() {
    return (String) getValue("rxcui");
  }
  /**
   * The RxCUI drug identifier from RXNORM.
   */
  @JsonIgnore public java.util.Collection<String> getRxcuis() {
    final Object current = myData.get("rxcui");
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
    final Object current = myData.get("proprietaryName");
    if (current == null) return Collections.emptyList();
    if (current instanceof java.util.Collection) {
      return (java.util.Collection<String>) current;
    }
    return Arrays.asList((String) current);
  }
  /**
   * Description of the absorption and elimination of drugs, including their concentration (pharmacokinetics, pK) and biological effects (pharmacodynamics, pD).
   */
  @JsonIgnore public String getClinicalPharmacology() {
    return (String) getValue("clinicalPharmacology");
  }
  /**
   * Description of the absorption and elimination of drugs, including their concentration (pharmacokinetics, pK) and biological effects (pharmacodynamics, pD).
   */
  @JsonIgnore public java.util.Collection<String> getClinicalPharmacologys() {
    final Object current = myData.get("clinicalPharmacology");
    if (current == null) return Collections.emptyList();
    if (current instanceof java.util.Collection) {
      return (java.util.Collection<String>) current;
    }
    return Arrays.asList((String) current);
  }
  /**
   * Any FDA or other warnings about the drug (text or URL).
   */
  @JsonIgnore public String getWarning() {
    return (String) getValue("warning");
  }
  /**
   * Any FDA or other warnings about the drug (text or URL).
   */
  @JsonIgnore public java.util.Collection<String> getWarnings() {
    final Object current = myData.get("warning");
    if (current == null) return Collections.emptyList();
    if (current instanceof java.util.Collection) {
      return (java.util.Collection<String>) current;
    }
    return Arrays.asList((String) current);
  }
  protected Drug(java.util.Map<String,Object> data) {
    super(data);
  }
  
  /**
   * Builder for {@link Drug}
   */
  public static class Builder extends Substance.Builder {
    public Builder(@NotNull HashMap<String,Object> data) {
      super(data);
    }
    @NotNull public Drug build() {
      return new Drug(myData);
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
     * The insurance plans that cover this drug.
     */
    @NotNull public Builder includedInHealthInsurancePlan(@NotNull HealthInsurancePlan healthInsurancePlan) {
      putValue("includedInHealthInsurancePlan", healthInsurancePlan);
      return this;
    }
    /**
     * The insurance plans that cover this drug.
     */
    @NotNull public Builder includedInHealthInsurancePlan(@NotNull HealthInsurancePlan.Builder healthInsurancePlan) {
      putValue("includedInHealthInsurancePlan", healthInsurancePlan.build());
      return this;
    }
    /**
     * Any other drug related to this one, for example commonly-prescribed alternatives.
     */
    @NotNull public Builder relatedDrug(@NotNull Drug drug) {
      putValue("relatedDrug", drug);
      return this;
    }
    /**
     * Any other drug related to this one, for example commonly-prescribed alternatives.
     */
    @NotNull public Builder relatedDrug(@NotNull Drug.Builder drug) {
      putValue("relatedDrug", drug.build());
      return this;
    }
    /**
     * Any precaution, guidance, contraindication, etc. related to consumption of specific foods while taking this drug.
     */
    @NotNull public Builder foodWarning(@NotNull String foodWarning) {
      putValue("foodWarning", foodWarning);
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
     * Any information related to overdose on a drug, including signs or symptoms, treatments, contact information for emergency response.
     */
    @NotNull public Builder overdosage(@NotNull String overdosage) {
      putValue("overdosage", overdosage);
      return this;
    }
    /**
     * The class of drug this belongs to (e.g., statins).
     */
    @NotNull public Builder drugClass(@NotNull DrugClass drugClass) {
      putValue("drugClass", drugClass);
      return this;
    }
    /**
     * The class of drug this belongs to (e.g., statins).
     */
    @NotNull public Builder drugClass(@NotNull DrugClass.Builder drugClass) {
      putValue("drugClass", drugClass.build());
      return this;
    }
    /**
     * An available dosage strength for the drug.
     */
    @NotNull public Builder availableStrength(@NotNull DrugStrength drugStrength) {
      putValue("availableStrength", drugStrength);
      return this;
    }
    /**
     * An available dosage strength for the drug.
     */
    @NotNull public Builder availableStrength(@NotNull DrugStrength.Builder drugStrength) {
      putValue("availableStrength", drugStrength.build());
      return this;
    }
    /**
     * A route by which this drug may be administered, e.g. 'oral'.
     */
    @NotNull public Builder administrationRoute(@NotNull String administrationRoute) {
      putValue("administrationRoute", administrationRoute);
      return this;
    }
    /**
     * Link to prescribing information for the drug.
     */
    @NotNull public Builder prescribingInfo(@NotNull String prescribingInfo) {
      putValue("prescribingInfo", prescribingInfo);
      return this;
    }
    /**
     * Any precaution, guidance, contraindication, etc. related to this drug's use by breastfeeding mothers.
     */
    @NotNull public Builder breastfeedingWarning(@NotNull String breastfeedingWarning) {
      putValue("breastfeedingWarning", breastfeedingWarning);
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
     * Another drug that is known to interact with this drug in a way that impacts the effect of this drug or causes a risk to the patient. Note: disease interactions are typically captured as contraindications.
     */
    @NotNull public Builder interactingDrug(@NotNull Drug drug) {
      putValue("interactingDrug", drug);
      return this;
    }
    /**
     * Another drug that is known to interact with this drug in a way that impacts the effect of this drug or causes a risk to the patient. Note: disease interactions are typically captured as contraindications.
     */
    @NotNull public Builder interactingDrug(@NotNull Drug.Builder drug) {
      putValue("interactingDrug", drug.build());
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
     * True if the drug is available in a generic form (regardless of name).
     */
    @NotNull public Builder isAvailableGenerically(@NotNull Boolean isAvailableGenerically) {
      putValue("isAvailableGenerically", isAvailableGenerically);
      return this;
    }
    /**
     * Pregnancy category of this drug.
     */
    @NotNull public Builder pregnancyCategory(@NotNull DrugPregnancyCategory drugPregnancyCategory) {
      putValue("pregnancyCategory", drugPregnancyCategory);
      return this;
    }
    /**
     * Any precaution, guidance, contraindication, etc. related to this drug's use during pregnancy.
     */
    @NotNull public Builder pregnancyWarning(@NotNull String pregnancyWarning) {
      putValue("pregnancyWarning", pregnancyWarning);
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
     * A dosing schedule for the drug for a given population, either observed, recommended, or maximum dose based on the type used.
     */
    @NotNull public Builder doseSchedule(@NotNull DoseSchedule doseSchedule) {
      putValue("doseSchedule", doseSchedule);
      return this;
    }
    /**
     * A dosing schedule for the drug for a given population, either observed, recommended, or maximum dose based on the type used.
     */
    @NotNull public Builder doseSchedule(@NotNull DoseSchedule.Builder doseSchedule) {
      putValue("doseSchedule", doseSchedule.build());
      return this;
    }
    /**
     * Any precaution, guidance, contraindication, etc. related to consumption of alcohol while taking this drug.
     */
    @NotNull public Builder alcoholWarning(@NotNull String alcoholWarning) {
      putValue("alcoholWarning", alcoholWarning);
      return this;
    }
    /**
     * Link to the drug's label details.
     */
    @NotNull public Builder labelDetails(@NotNull String labelDetails) {
      putValue("labelDetails", labelDetails);
      return this;
    }
    /**
     * Indicates the status of drug prescription eg. local catalogs classifications or whether the drug is available by prescription or over-the-counter, etc.
     */
    @NotNull public Builder prescriptionStatus(@NotNull DrugPrescriptionStatus drugPrescriptionStatus) {
      putValue("prescriptionStatus", drugPrescriptionStatus);
      return this;
    }
    /**
     * Indicates the status of drug prescription eg. local catalogs classifications or whether the drug is available by prescription or over-the-counter, etc.
     */
    @NotNull public Builder prescriptionStatus(@NotNull String prescriptionStatus) {
      putValue("prescriptionStatus", prescriptionStatus);
      return this;
    }
    /**
     * A dosage form in which this drug/supplement is available, e.g. 'tablet', 'suspension', 'injection'.
     */
    @NotNull public Builder dosageForm(@NotNull String dosageForm) {
      putValue("dosageForm", dosageForm);
      return this;
    }
    /**
     * The unit in which the drug is measured, e.g. '5 mg tablet'.
     */
    @NotNull public Builder drugUnit(@NotNull String drugUnit) {
      putValue("drugUnit", drugUnit);
      return this;
    }
    /**
     * The RxCUI drug identifier from RXNORM.
     */
    @NotNull public Builder rxcui(@NotNull String rxcui) {
      putValue("rxcui", rxcui);
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
     * Description of the absorption and elimination of drugs, including their concentration (pharmacokinetics, pK) and biological effects (pharmacodynamics, pD).
     */
    @NotNull public Builder clinicalPharmacology(@NotNull String clinicalPharmacology) {
      putValue("clinicalPharmacology", clinicalPharmacology);
      return this;
    }
    /**
     * Any FDA or other warnings about the drug (text or URL).
     */
    @NotNull public Builder warning(@NotNull String warning) {
      putValue("warning", warning);
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
      if ("manufacturer".equals(key) && value instanceof Organization) { this.manufacturer((Organization)value); return; }
      if ("manufacturers".equals(key) && value instanceof Organization) { this.manufacturer((Organization)value); return; }
      if ("activeIngredient".equals(key) && value instanceof String) { this.activeIngredient((String)value); return; }
      if ("activeIngredients".equals(key) && value instanceof String) { this.activeIngredient((String)value); return; }
      if ("maximumIntake".equals(key) && value instanceof MaximumDoseSchedule) { this.maximumIntake((MaximumDoseSchedule)value); return; }
      if ("maximumIntakes".equals(key) && value instanceof MaximumDoseSchedule) { this.maximumIntake((MaximumDoseSchedule)value); return; }
      if ("includedInHealthInsurancePlan".equals(key) && value instanceof HealthInsurancePlan) { this.includedInHealthInsurancePlan((HealthInsurancePlan)value); return; }
      if ("includedInHealthInsurancePlans".equals(key) && value instanceof HealthInsurancePlan) { this.includedInHealthInsurancePlan((HealthInsurancePlan)value); return; }
      if ("relatedDrug".equals(key) && value instanceof Drug) { this.relatedDrug((Drug)value); return; }
      if ("relatedDrugs".equals(key) && value instanceof Drug) { this.relatedDrug((Drug)value); return; }
      if ("foodWarning".equals(key) && value instanceof String) { this.foodWarning((String)value); return; }
      if ("foodWarnings".equals(key) && value instanceof String) { this.foodWarning((String)value); return; }
      if ("legalStatus".equals(key) && value instanceof DrugLegalStatus) { this.legalStatus((DrugLegalStatus)value); return; }
      if ("legalStatuss".equals(key) && value instanceof DrugLegalStatus) { this.legalStatus((DrugLegalStatus)value); return; }
      if ("legalStatus".equals(key) && value instanceof MedicalEnumeration) { this.legalStatus((MedicalEnumeration)value); return; }
      if ("legalStatuss".equals(key) && value instanceof MedicalEnumeration) { this.legalStatus((MedicalEnumeration)value); return; }
      if ("legalStatus".equals(key) && value instanceof String) { this.legalStatus((String)value); return; }
      if ("legalStatuss".equals(key) && value instanceof String) { this.legalStatus((String)value); return; }
      if ("overdosage".equals(key) && value instanceof String) { this.overdosage((String)value); return; }
      if ("overdosages".equals(key) && value instanceof String) { this.overdosage((String)value); return; }
      if ("drugClass".equals(key) && value instanceof DrugClass) { this.drugClass((DrugClass)value); return; }
      if ("drugClasss".equals(key) && value instanceof DrugClass) { this.drugClass((DrugClass)value); return; }
      if ("availableStrength".equals(key) && value instanceof DrugStrength) { this.availableStrength((DrugStrength)value); return; }
      if ("availableStrengths".equals(key) && value instanceof DrugStrength) { this.availableStrength((DrugStrength)value); return; }
      if ("administrationRoute".equals(key) && value instanceof String) { this.administrationRoute((String)value); return; }
      if ("administrationRoutes".equals(key) && value instanceof String) { this.administrationRoute((String)value); return; }
      if ("prescribingInfo".equals(key) && value instanceof String) { this.prescribingInfo((String)value); return; }
      if ("prescribingInfos".equals(key) && value instanceof String) { this.prescribingInfo((String)value); return; }
      if ("breastfeedingWarning".equals(key) && value instanceof String) { this.breastfeedingWarning((String)value); return; }
      if ("breastfeedingWarnings".equals(key) && value instanceof String) { this.breastfeedingWarning((String)value); return; }
      if ("isProprietary".equals(key) && value instanceof Boolean) { this.isProprietary((Boolean)value); return; }
      if ("isProprietarys".equals(key) && value instanceof Boolean) { this.isProprietary((Boolean)value); return; }
      if ("interactingDrug".equals(key) && value instanceof Drug) { this.interactingDrug((Drug)value); return; }
      if ("interactingDrugs".equals(key) && value instanceof Drug) { this.interactingDrug((Drug)value); return; }
      if ("nonProprietaryName".equals(key) && value instanceof String) { this.nonProprietaryName((String)value); return; }
      if ("nonProprietaryNames".equals(key) && value instanceof String) { this.nonProprietaryName((String)value); return; }
      if ("isAvailableGenerically".equals(key) && value instanceof Boolean) { this.isAvailableGenerically((Boolean)value); return; }
      if ("isAvailableGenericallys".equals(key) && value instanceof Boolean) { this.isAvailableGenerically((Boolean)value); return; }
      if ("pregnancyCategory".equals(key) && value instanceof DrugPregnancyCategory) { this.pregnancyCategory((DrugPregnancyCategory)value); return; }
      if ("pregnancyCategorys".equals(key) && value instanceof DrugPregnancyCategory) { this.pregnancyCategory((DrugPregnancyCategory)value); return; }
      if ("pregnancyWarning".equals(key) && value instanceof String) { this.pregnancyWarning((String)value); return; }
      if ("pregnancyWarnings".equals(key) && value instanceof String) { this.pregnancyWarning((String)value); return; }
      if ("mechanismOfAction".equals(key) && value instanceof String) { this.mechanismOfAction((String)value); return; }
      if ("mechanismOfActions".equals(key) && value instanceof String) { this.mechanismOfAction((String)value); return; }
      if ("doseSchedule".equals(key) && value instanceof DoseSchedule) { this.doseSchedule((DoseSchedule)value); return; }
      if ("doseSchedules".equals(key) && value instanceof DoseSchedule) { this.doseSchedule((DoseSchedule)value); return; }
      if ("alcoholWarning".equals(key) && value instanceof String) { this.alcoholWarning((String)value); return; }
      if ("alcoholWarnings".equals(key) && value instanceof String) { this.alcoholWarning((String)value); return; }
      if ("labelDetails".equals(key) && value instanceof String) { this.labelDetails((String)value); return; }
      if ("labelDetailss".equals(key) && value instanceof String) { this.labelDetails((String)value); return; }
      if ("prescriptionStatus".equals(key) && value instanceof DrugPrescriptionStatus) { this.prescriptionStatus((DrugPrescriptionStatus)value); return; }
      if ("prescriptionStatuss".equals(key) && value instanceof DrugPrescriptionStatus) { this.prescriptionStatus((DrugPrescriptionStatus)value); return; }
      if ("prescriptionStatus".equals(key) && value instanceof String) { this.prescriptionStatus((String)value); return; }
      if ("prescriptionStatuss".equals(key) && value instanceof String) { this.prescriptionStatus((String)value); return; }
      if ("dosageForm".equals(key) && value instanceof String) { this.dosageForm((String)value); return; }
      if ("dosageForms".equals(key) && value instanceof String) { this.dosageForm((String)value); return; }
      if ("drugUnit".equals(key) && value instanceof String) { this.drugUnit((String)value); return; }
      if ("drugUnits".equals(key) && value instanceof String) { this.drugUnit((String)value); return; }
      if ("rxcui".equals(key) && value instanceof String) { this.rxcui((String)value); return; }
      if ("rxcuis".equals(key) && value instanceof String) { this.rxcui((String)value); return; }
      if ("proprietaryName".equals(key) && value instanceof String) { this.proprietaryName((String)value); return; }
      if ("proprietaryNames".equals(key) && value instanceof String) { this.proprietaryName((String)value); return; }
      if ("clinicalPharmacology".equals(key) && value instanceof String) { this.clinicalPharmacology((String)value); return; }
      if ("clinicalPharmacologys".equals(key) && value instanceof String) { this.clinicalPharmacology((String)value); return; }
      if ("warning".equals(key) && value instanceof String) { this.warning((String)value); return; }
      if ("warnings".equals(key) && value instanceof String) { this.warning((String)value); return; }
      super.fromMap(key, value);
    }
  }
  
}
