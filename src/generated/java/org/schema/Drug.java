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
 * A chemical or biologic substance, used as a medical therapy, that has a physiological effect on an organism. Here the term drug is used interchangeably with the term medicine although clinical knowledge make a clear difference between them.Equivalent class: http://purl.bioontology.org/ontology/SNOMEDCT/410942007
 */
public class Drug extends Substance {
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
   * The insurance plans that cover this drug.
   * @return includedInHealthInsurancePlan property set by first invocation of includedInHealthInsurancePlan method or {@code null}.
   */
  @JsonIgnore public HealthInsurancePlan getIncludedInHealthInsurancePlan() {
    return (HealthInsurancePlan) getValue("includedInHealthInsurancePlan");
  }
  /**
   * The insurance plans that cover this drug.
   * @return all includedInHealthInsurancePlan properties as {@link java.util.Collection} or an empty collection 
   * if includedInHealthInsurancePlan was not set.
   */
  @JsonIgnore public java.util.Collection<HealthInsurancePlan> getIncludedInHealthInsurancePlans() {
    final java.lang.Object current = myData.get("includedInHealthInsurancePlan");
    if (current == null) return Collections.emptyList();
    if (current instanceof java.util.Collection) {
      return (java.util.Collection<HealthInsurancePlan>) current;
    }
    return Arrays.asList((HealthInsurancePlan) current);
  }
  /**
   * Any other drug related to this one, for example commonly-prescribed alternatives.
   * @return relatedDrug property set by first invocation of relatedDrug method or {@code null}.
   */
  @JsonIgnore public Drug getRelatedDrug() {
    return (Drug) getValue("relatedDrug");
  }
  /**
   * Any other drug related to this one, for example commonly-prescribed alternatives.
   * @return all relatedDrug properties as {@link java.util.Collection} or an empty collection 
   * if relatedDrug was not set.
   */
  @JsonIgnore public java.util.Collection<Drug> getRelatedDrugs() {
    final java.lang.Object current = myData.get("relatedDrug");
    if (current == null) return Collections.emptyList();
    if (current instanceof java.util.Collection) {
      return (java.util.Collection<Drug>) current;
    }
    return Arrays.asList((Drug) current);
  }
  /**
   * Any precaution, guidance, contraindication, etc. related to consumption of specific foods while taking this drug.
   * @return foodWarning property set by first invocation of foodWarning method or {@code null}.
   */
  @JsonIgnore public String getFoodWarning() {
    return (String) getValue("foodWarning");
  }
  /**
   * Any precaution, guidance, contraindication, etc. related to consumption of specific foods while taking this drug.
   * @return all foodWarning properties as {@link java.util.Collection} or an empty collection 
   * if foodWarning was not set.
   */
  @JsonIgnore public java.util.Collection<String> getFoodWarnings() {
    final java.lang.Object current = myData.get("foodWarning");
    if (current == null) return Collections.emptyList();
    if (current instanceof java.util.Collection) {
      return (java.util.Collection<String>) current;
    }
    return Arrays.asList((String) current);
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
   * Any information related to overdose on a drug, including signs or symptoms, treatments, contact information for emergency response.
   * @return overdosage property set by first invocation of overdosage method or {@code null}.
   */
  @JsonIgnore public String getOverdosage() {
    return (String) getValue("overdosage");
  }
  /**
   * Any information related to overdose on a drug, including signs or symptoms, treatments, contact information for emergency response.
   * @return all overdosage properties as {@link java.util.Collection} or an empty collection 
   * if overdosage was not set.
   */
  @JsonIgnore public java.util.Collection<String> getOverdosages() {
    final java.lang.Object current = myData.get("overdosage");
    if (current == null) return Collections.emptyList();
    if (current instanceof java.util.Collection) {
      return (java.util.Collection<String>) current;
    }
    return Arrays.asList((String) current);
  }
  /**
   * The class of drug this belongs to (e.g., statins).
   * @return drugClass property set by first invocation of drugClass method or {@code null}.
   */
  @JsonIgnore public DrugClass getDrugClass() {
    return (DrugClass) getValue("drugClass");
  }
  /**
   * The class of drug this belongs to (e.g., statins).
   * @return all drugClass properties as {@link java.util.Collection} or an empty collection 
   * if drugClass was not set.
   */
  @JsonIgnore public java.util.Collection<DrugClass> getDrugClasss() {
    final java.lang.Object current = myData.get("drugClass");
    if (current == null) return Collections.emptyList();
    if (current instanceof java.util.Collection) {
      return (java.util.Collection<DrugClass>) current;
    }
    return Arrays.asList((DrugClass) current);
  }
  /**
   * An available dosage strength for the drug.
   * @return availableStrength property set by first invocation of availableStrength method or {@code null}.
   */
  @JsonIgnore public DrugStrength getAvailableStrength() {
    return (DrugStrength) getValue("availableStrength");
  }
  /**
   * An available dosage strength for the drug.
   * @return all availableStrength properties as {@link java.util.Collection} or an empty collection 
   * if availableStrength was not set.
   */
  @JsonIgnore public java.util.Collection<DrugStrength> getAvailableStrengths() {
    final java.lang.Object current = myData.get("availableStrength");
    if (current == null) return Collections.emptyList();
    if (current instanceof java.util.Collection) {
      return (java.util.Collection<DrugStrength>) current;
    }
    return Arrays.asList((DrugStrength) current);
  }
  /**
   * A route by which this drug may be administered, e.g. 'oral'.
   * @return administrationRoute property set by first invocation of administrationRoute method or {@code null}.
   */
  @JsonIgnore public String getAdministrationRoute() {
    return (String) getValue("administrationRoute");
  }
  /**
   * A route by which this drug may be administered, e.g. 'oral'.
   * @return all administrationRoute properties as {@link java.util.Collection} or an empty collection 
   * if administrationRoute was not set.
   */
  @JsonIgnore public java.util.Collection<String> getAdministrationRoutes() {
    final java.lang.Object current = myData.get("administrationRoute");
    if (current == null) return Collections.emptyList();
    if (current instanceof java.util.Collection) {
      return (java.util.Collection<String>) current;
    }
    return Arrays.asList((String) current);
  }
  /**
   * Link to prescribing information for the drug.
   * @return prescribingInfo property set by first invocation of prescribingInfo method or {@code null}.
   */
  @JsonIgnore public String getPrescribingInfo() {
    return (String) getValue("prescribingInfo");
  }
  /**
   * Link to prescribing information for the drug.
   * @return all prescribingInfo properties as {@link java.util.Collection} or an empty collection 
   * if prescribingInfo was not set.
   */
  @JsonIgnore public java.util.Collection<String> getPrescribingInfos() {
    final java.lang.Object current = myData.get("prescribingInfo");
    if (current == null) return Collections.emptyList();
    if (current instanceof java.util.Collection) {
      return (java.util.Collection<String>) current;
    }
    return Arrays.asList((String) current);
  }
  /**
   * Any precaution, guidance, contraindication, etc. related to this drug's use by breastfeeding mothers.
   * @return breastfeedingWarning property set by first invocation of breastfeedingWarning method or {@code null}.
   */
  @JsonIgnore public String getBreastfeedingWarning() {
    return (String) getValue("breastfeedingWarning");
  }
  /**
   * Any precaution, guidance, contraindication, etc. related to this drug's use by breastfeeding mothers.
   * @return all breastfeedingWarning properties as {@link java.util.Collection} or an empty collection 
   * if breastfeedingWarning was not set.
   */
  @JsonIgnore public java.util.Collection<String> getBreastfeedingWarnings() {
    final java.lang.Object current = myData.get("breastfeedingWarning");
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
   * Another drug that is known to interact with this drug in a way that impacts the effect of this drug or causes a risk to the patient. Note: disease interactions are typically captured as contraindications.
   * @return interactingDrug property set by first invocation of interactingDrug method or {@code null}.
   */
  @JsonIgnore public Drug getInteractingDrug() {
    return (Drug) getValue("interactingDrug");
  }
  /**
   * Another drug that is known to interact with this drug in a way that impacts the effect of this drug or causes a risk to the patient. Note: disease interactions are typically captured as contraindications.
   * @return all interactingDrug properties as {@link java.util.Collection} or an empty collection 
   * if interactingDrug was not set.
   */
  @JsonIgnore public java.util.Collection<Drug> getInteractingDrugs() {
    final java.lang.Object current = myData.get("interactingDrug");
    if (current == null) return Collections.emptyList();
    if (current instanceof java.util.Collection) {
      return (java.util.Collection<Drug>) current;
    }
    return Arrays.asList((Drug) current);
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
   * True if the drug is available in a generic form (regardless of name).
   * @return isAvailableGenerically property set by first invocation of isAvailableGenerically method or {@code null}.
   */
  @JsonIgnore public Boolean getIsAvailableGenerically() {
    return (Boolean) getValue("isAvailableGenerically");
  }
  /**
   * True if the drug is available in a generic form (regardless of name).
   * @return all isAvailableGenerically properties as {@link java.util.Collection} or an empty collection 
   * if isAvailableGenerically was not set.
   */
  @JsonIgnore public java.util.Collection<Boolean> getIsAvailableGenericallys() {
    final java.lang.Object current = myData.get("isAvailableGenerically");
    if (current == null) return Collections.emptyList();
    if (current instanceof java.util.Collection) {
      return (java.util.Collection<Boolean>) current;
    }
    return Arrays.asList((Boolean) current);
  }
  /**
   * Pregnancy category of this drug.
   * @return pregnancyCategory property set by first invocation of pregnancyCategory method or {@code null}.
   */
  @JsonIgnore public DrugPregnancyCategory getPregnancyCategory() {
    return (DrugPregnancyCategory) getValue("pregnancyCategory");
  }
  /**
   * Pregnancy category of this drug.
   * @return all pregnancyCategory properties as {@link java.util.Collection} or an empty collection 
   * if pregnancyCategory was not set.
   */
  @JsonIgnore public java.util.Collection<DrugPregnancyCategory> getPregnancyCategorys() {
    final java.lang.Object current = myData.get("pregnancyCategory");
    if (current == null) return Collections.emptyList();
    if (current instanceof java.util.Collection) {
      return (java.util.Collection<DrugPregnancyCategory>) current;
    }
    return Arrays.asList((DrugPregnancyCategory) current);
  }
  /**
   * Any precaution, guidance, contraindication, etc. related to this drug's use during pregnancy.
   * @return pregnancyWarning property set by first invocation of pregnancyWarning method or {@code null}.
   */
  @JsonIgnore public String getPregnancyWarning() {
    return (String) getValue("pregnancyWarning");
  }
  /**
   * Any precaution, guidance, contraindication, etc. related to this drug's use during pregnancy.
   * @return all pregnancyWarning properties as {@link java.util.Collection} or an empty collection 
   * if pregnancyWarning was not set.
   */
  @JsonIgnore public java.util.Collection<String> getPregnancyWarnings() {
    final java.lang.Object current = myData.get("pregnancyWarning");
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
   * A dosing schedule for the drug for a given population, either observed, recommended, or maximum dose based on the type used.
   * @return doseSchedule property set by first invocation of doseSchedule method or {@code null}.
   */
  @JsonIgnore public DoseSchedule getDoseSchedule() {
    return (DoseSchedule) getValue("doseSchedule");
  }
  /**
   * A dosing schedule for the drug for a given population, either observed, recommended, or maximum dose based on the type used.
   * @return all doseSchedule properties as {@link java.util.Collection} or an empty collection 
   * if doseSchedule was not set.
   */
  @JsonIgnore public java.util.Collection<DoseSchedule> getDoseSchedules() {
    final java.lang.Object current = myData.get("doseSchedule");
    if (current == null) return Collections.emptyList();
    if (current instanceof java.util.Collection) {
      return (java.util.Collection<DoseSchedule>) current;
    }
    return Arrays.asList((DoseSchedule) current);
  }
  /**
   * Any precaution, guidance, contraindication, etc. related to consumption of alcohol while taking this drug.
   * @return alcoholWarning property set by first invocation of alcoholWarning method or {@code null}.
   */
  @JsonIgnore public String getAlcoholWarning() {
    return (String) getValue("alcoholWarning");
  }
  /**
   * Any precaution, guidance, contraindication, etc. related to consumption of alcohol while taking this drug.
   * @return all alcoholWarning properties as {@link java.util.Collection} or an empty collection 
   * if alcoholWarning was not set.
   */
  @JsonIgnore public java.util.Collection<String> getAlcoholWarnings() {
    final java.lang.Object current = myData.get("alcoholWarning");
    if (current == null) return Collections.emptyList();
    if (current instanceof java.util.Collection) {
      return (java.util.Collection<String>) current;
    }
    return Arrays.asList((String) current);
  }
  /**
   * Link to the drug's label details.
   * @return labelDetails property set by first invocation of labelDetails method or {@code null}.
   */
  @JsonIgnore public String getLabelDetails() {
    return (String) getValue("labelDetails");
  }
  /**
   * Link to the drug's label details.
   * @return all labelDetails properties as {@link java.util.Collection} or an empty collection 
   * if labelDetails was not set.
   */
  @JsonIgnore public java.util.Collection<String> getLabelDetailss() {
    final java.lang.Object current = myData.get("labelDetails");
    if (current == null) return Collections.emptyList();
    if (current instanceof java.util.Collection) {
      return (java.util.Collection<String>) current;
    }
    return Arrays.asList((String) current);
  }
  /**
   * Indicates the status of drug prescription eg. local catalogs classifications or whether the drug is available by prescription or over-the-counter, etc.
   * @return prescriptionStatus property set by first invocation of prescriptionStatus method or {@code null}.
   */
  @JsonIgnore public DrugPrescriptionStatus getPrescriptionStatusDrugPrescriptionStatus() {
    return (DrugPrescriptionStatus) getValue("prescriptionStatus");
  }
  /**
   * Indicates the status of drug prescription eg. local catalogs classifications or whether the drug is available by prescription or over-the-counter, etc.
   * @return all prescriptionStatus properties as {@link java.util.Collection} or an empty collection 
   * if prescriptionStatus was not set.
   */
  @JsonIgnore public java.util.Collection<DrugPrescriptionStatus> getPrescriptionStatusDrugPrescriptionStatuss() {
    final java.lang.Object current = myData.get("prescriptionStatus");
    if (current == null) return Collections.emptyList();
    if (current instanceof java.util.Collection) {
      return (java.util.Collection<DrugPrescriptionStatus>) current;
    }
    return Arrays.asList((DrugPrescriptionStatus) current);
  }
  /**
   * Indicates the status of drug prescription eg. local catalogs classifications or whether the drug is available by prescription or over-the-counter, etc.
   * @return prescriptionStatus property set by first invocation of prescriptionStatus method or {@code null}.
   */
  @JsonIgnore public String getPrescriptionStatusString() {
    return (String) getValue("prescriptionStatus");
  }
  /**
   * Indicates the status of drug prescription eg. local catalogs classifications or whether the drug is available by prescription or over-the-counter, etc.
   * @return all prescriptionStatus properties as {@link java.util.Collection} or an empty collection 
   * if prescriptionStatus was not set.
   */
  @JsonIgnore public java.util.Collection<String> getPrescriptionStatusStrings() {
    final java.lang.Object current = myData.get("prescriptionStatus");
    if (current == null) return Collections.emptyList();
    if (current instanceof java.util.Collection) {
      return (java.util.Collection<String>) current;
    }
    return Arrays.asList((String) current);
  }
  /**
   * A dosage form in which this drug/supplement is available, e.g. 'tablet', 'suspension', 'injection'.
   * @return dosageForm property set by first invocation of dosageForm method or {@code null}.
   */
  @JsonIgnore public String getDosageForm() {
    return (String) getValue("dosageForm");
  }
  /**
   * A dosage form in which this drug/supplement is available, e.g. 'tablet', 'suspension', 'injection'.
   * @return all dosageForm properties as {@link java.util.Collection} or an empty collection 
   * if dosageForm was not set.
   */
  @JsonIgnore public java.util.Collection<String> getDosageForms() {
    final java.lang.Object current = myData.get("dosageForm");
    if (current == null) return Collections.emptyList();
    if (current instanceof java.util.Collection) {
      return (java.util.Collection<String>) current;
    }
    return Arrays.asList((String) current);
  }
  /**
   * The unit in which the drug is measured, e.g. '5 mg tablet'.
   * @return drugUnit property set by first invocation of drugUnit method or {@code null}.
   */
  @JsonIgnore public String getDrugUnit() {
    return (String) getValue("drugUnit");
  }
  /**
   * The unit in which the drug is measured, e.g. '5 mg tablet'.
   * @return all drugUnit properties as {@link java.util.Collection} or an empty collection 
   * if drugUnit was not set.
   */
  @JsonIgnore public java.util.Collection<String> getDrugUnits() {
    final java.lang.Object current = myData.get("drugUnit");
    if (current == null) return Collections.emptyList();
    if (current instanceof java.util.Collection) {
      return (java.util.Collection<String>) current;
    }
    return Arrays.asList((String) current);
  }
  /**
   * The RxCUI drug identifier from RXNORM.
   * @return rxcui property set by first invocation of rxcui method or {@code null}.
   */
  @JsonIgnore public String getRxcui() {
    return (String) getValue("rxcui");
  }
  /**
   * The RxCUI drug identifier from RXNORM.
   * @return all rxcui properties as {@link java.util.Collection} or an empty collection 
   * if rxcui was not set.
   */
  @JsonIgnore public java.util.Collection<String> getRxcuis() {
    final java.lang.Object current = myData.get("rxcui");
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
  /**
   * Description of the absorption and elimination of drugs, including their concentration (pharmacokinetics, pK) and biological effects (pharmacodynamics, pD).
   * @return clinicalPharmacology property set by first invocation of clinicalPharmacology method or {@code null}.
   */
  @JsonIgnore public String getClinicalPharmacology() {
    return (String) getValue("clinicalPharmacology");
  }
  /**
   * Description of the absorption and elimination of drugs, including their concentration (pharmacokinetics, pK) and biological effects (pharmacodynamics, pD).
   * @return all clinicalPharmacology properties as {@link java.util.Collection} or an empty collection 
   * if clinicalPharmacology was not set.
   */
  @JsonIgnore public java.util.Collection<String> getClinicalPharmacologys() {
    final java.lang.Object current = myData.get("clinicalPharmacology");
    if (current == null) return Collections.emptyList();
    if (current instanceof java.util.Collection) {
      return (java.util.Collection<String>) current;
    }
    return Arrays.asList((String) current);
  }
  /**
   * Any FDA or other warnings about the drug (text or URL).
   * @return warning property set by first invocation of warning method or {@code null}.
   */
  @JsonIgnore public String getWarning() {
    return (String) getValue("warning");
  }
  /**
   * Any FDA or other warnings about the drug (text or URL).
   * @return all warning properties as {@link java.util.Collection} or an empty collection 
   * if warning was not set.
   */
  @JsonIgnore public java.util.Collection<String> getWarnings() {
    final java.lang.Object current = myData.get("warning");
    if (current == null) return Collections.emptyList();
    if (current instanceof java.util.Collection) {
      return (java.util.Collection<String>) current;
    }
    return Arrays.asList((String) current);
  }
  protected Drug(java.util.Map<String,java.lang.Object> data) {
    super(data);
  }
  
  /**
   * Builder for {@link Drug}
   */
  public static class Builder extends Substance.Builder {
    public Builder(@NotNull HashMap<String,java.lang.Object> data) {
      super(data);
    }
    @NotNull public Drug build() {
      return new Drug(myData);
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
     * The insurance plans that cover this drug.
     * @param healthInsurancePlan value to set
     * @return this builder instance
     */
    @NotNull public Builder includedInHealthInsurancePlan(@NotNull HealthInsurancePlan healthInsurancePlan) {
      putValue("includedInHealthInsurancePlan", healthInsurancePlan);
      return this;
    }
    /**
     * The insurance plans that cover this drug.
     * @param healthInsurancePlan value to set
     * @return this builder instance
     */
    @NotNull public Builder includedInHealthInsurancePlan(@NotNull HealthInsurancePlan.Builder healthInsurancePlan) {
      putValue("includedInHealthInsurancePlan", healthInsurancePlan.build());
      return this;
    }
    /**
     * Remove includedInHealthInsurancePlan property from the builder.
     * If this property is repeatable, all instances are removed.
     * @return this builder instance
     */
    @NotNull public Builder removeIncludedInHealthInsurancePlan() {
      removeValue("includedInHealthInsurancePlan");
      return this;
    }
    /**
     * Get currently set value for includedInHealthInsurancePlan property in this builder.
     * @return previously set value or {@code null}. If multiple values have been 
     * set to this property, then {@link java.util.Collection} instance will be 
     * returned.
     */
    @Nullable public java.lang.Object getIncludedInHealthInsurancePlan() {
      return myData.get("includedInHealthInsurancePlan");
    }
    /**
     * Any other drug related to this one, for example commonly-prescribed alternatives.
     * @param drug value to set
     * @return this builder instance
     */
    @NotNull public Builder relatedDrug(@NotNull Drug drug) {
      putValue("relatedDrug", drug);
      return this;
    }
    /**
     * Any other drug related to this one, for example commonly-prescribed alternatives.
     * @param drug value to set
     * @return this builder instance
     */
    @NotNull public Builder relatedDrug(@NotNull Drug.Builder drug) {
      putValue("relatedDrug", drug.build());
      return this;
    }
    /**
     * Remove relatedDrug property from the builder.
     * If this property is repeatable, all instances are removed.
     * @return this builder instance
     */
    @NotNull public Builder removeRelatedDrug() {
      removeValue("relatedDrug");
      return this;
    }
    /**
     * Get currently set value for relatedDrug property in this builder.
     * @return previously set value or {@code null}. If multiple values have been 
     * set to this property, then {@link java.util.Collection} instance will be 
     * returned.
     */
    @Nullable public java.lang.Object getRelatedDrug() {
      return myData.get("relatedDrug");
    }
    /**
     * Any precaution, guidance, contraindication, etc. related to consumption of specific foods while taking this drug.
     * @param foodWarning value to set
     * @return this builder instance
     */
    @NotNull public Builder foodWarning(@NotNull String foodWarning) {
      putValue("foodWarning", foodWarning);
      return this;
    }
    /**
     * Remove foodWarning property from the builder.
     * If this property is repeatable, all instances are removed.
     * @return this builder instance
     */
    @NotNull public Builder removeFoodWarning() {
      removeValue("foodWarning");
      return this;
    }
    /**
     * Get currently set value for foodWarning property in this builder.
     * @return previously set value or {@code null}. If multiple values have been 
     * set to this property, then {@link java.util.Collection} instance will be 
     * returned.
     */
    @Nullable public java.lang.Object getFoodWarning() {
      return myData.get("foodWarning");
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
     * Any information related to overdose on a drug, including signs or symptoms, treatments, contact information for emergency response.
     * @param overdosage value to set
     * @return this builder instance
     */
    @NotNull public Builder overdosage(@NotNull String overdosage) {
      putValue("overdosage", overdosage);
      return this;
    }
    /**
     * Remove overdosage property from the builder.
     * If this property is repeatable, all instances are removed.
     * @return this builder instance
     */
    @NotNull public Builder removeOverdosage() {
      removeValue("overdosage");
      return this;
    }
    /**
     * Get currently set value for overdosage property in this builder.
     * @return previously set value or {@code null}. If multiple values have been 
     * set to this property, then {@link java.util.Collection} instance will be 
     * returned.
     */
    @Nullable public java.lang.Object getOverdosage() {
      return myData.get("overdosage");
    }
    /**
     * The class of drug this belongs to (e.g., statins).
     * @param drugClass value to set
     * @return this builder instance
     */
    @NotNull public Builder drugClass(@NotNull DrugClass drugClass) {
      putValue("drugClass", drugClass);
      return this;
    }
    /**
     * The class of drug this belongs to (e.g., statins).
     * @param drugClass value to set
     * @return this builder instance
     */
    @NotNull public Builder drugClass(@NotNull DrugClass.Builder drugClass) {
      putValue("drugClass", drugClass.build());
      return this;
    }
    /**
     * Remove drugClass property from the builder.
     * If this property is repeatable, all instances are removed.
     * @return this builder instance
     */
    @NotNull public Builder removeDrugClass() {
      removeValue("drugClass");
      return this;
    }
    /**
     * Get currently set value for drugClass property in this builder.
     * @return previously set value or {@code null}. If multiple values have been 
     * set to this property, then {@link java.util.Collection} instance will be 
     * returned.
     */
    @Nullable public java.lang.Object getDrugClass() {
      return myData.get("drugClass");
    }
    /**
     * An available dosage strength for the drug.
     * @param drugStrength value to set
     * @return this builder instance
     */
    @NotNull public Builder availableStrength(@NotNull DrugStrength drugStrength) {
      putValue("availableStrength", drugStrength);
      return this;
    }
    /**
     * An available dosage strength for the drug.
     * @param drugStrength value to set
     * @return this builder instance
     */
    @NotNull public Builder availableStrength(@NotNull DrugStrength.Builder drugStrength) {
      putValue("availableStrength", drugStrength.build());
      return this;
    }
    /**
     * Remove availableStrength property from the builder.
     * If this property is repeatable, all instances are removed.
     * @return this builder instance
     */
    @NotNull public Builder removeAvailableStrength() {
      removeValue("availableStrength");
      return this;
    }
    /**
     * Get currently set value for availableStrength property in this builder.
     * @return previously set value or {@code null}. If multiple values have been 
     * set to this property, then {@link java.util.Collection} instance will be 
     * returned.
     */
    @Nullable public java.lang.Object getAvailableStrength() {
      return myData.get("availableStrength");
    }
    /**
     * A route by which this drug may be administered, e.g. 'oral'.
     * @param administrationRoute value to set
     * @return this builder instance
     */
    @NotNull public Builder administrationRoute(@NotNull String administrationRoute) {
      putValue("administrationRoute", administrationRoute);
      return this;
    }
    /**
     * Remove administrationRoute property from the builder.
     * If this property is repeatable, all instances are removed.
     * @return this builder instance
     */
    @NotNull public Builder removeAdministrationRoute() {
      removeValue("administrationRoute");
      return this;
    }
    /**
     * Get currently set value for administrationRoute property in this builder.
     * @return previously set value or {@code null}. If multiple values have been 
     * set to this property, then {@link java.util.Collection} instance will be 
     * returned.
     */
    @Nullable public java.lang.Object getAdministrationRoute() {
      return myData.get("administrationRoute");
    }
    /**
     * Link to prescribing information for the drug.
     * @param prescribingInfo value to set
     * @return this builder instance
     */
    @NotNull public Builder prescribingInfo(@NotNull String prescribingInfo) {
      putValue("prescribingInfo", prescribingInfo);
      return this;
    }
    /**
     * Remove prescribingInfo property from the builder.
     * If this property is repeatable, all instances are removed.
     * @return this builder instance
     */
    @NotNull public Builder removePrescribingInfo() {
      removeValue("prescribingInfo");
      return this;
    }
    /**
     * Get currently set value for prescribingInfo property in this builder.
     * @return previously set value or {@code null}. If multiple values have been 
     * set to this property, then {@link java.util.Collection} instance will be 
     * returned.
     */
    @Nullable public java.lang.Object getPrescribingInfo() {
      return myData.get("prescribingInfo");
    }
    /**
     * Any precaution, guidance, contraindication, etc. related to this drug's use by breastfeeding mothers.
     * @param breastfeedingWarning value to set
     * @return this builder instance
     */
    @NotNull public Builder breastfeedingWarning(@NotNull String breastfeedingWarning) {
      putValue("breastfeedingWarning", breastfeedingWarning);
      return this;
    }
    /**
     * Remove breastfeedingWarning property from the builder.
     * If this property is repeatable, all instances are removed.
     * @return this builder instance
     */
    @NotNull public Builder removeBreastfeedingWarning() {
      removeValue("breastfeedingWarning");
      return this;
    }
    /**
     * Get currently set value for breastfeedingWarning property in this builder.
     * @return previously set value or {@code null}. If multiple values have been 
     * set to this property, then {@link java.util.Collection} instance will be 
     * returned.
     */
    @Nullable public java.lang.Object getBreastfeedingWarning() {
      return myData.get("breastfeedingWarning");
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
     * Another drug that is known to interact with this drug in a way that impacts the effect of this drug or causes a risk to the patient. Note: disease interactions are typically captured as contraindications.
     * @param drug value to set
     * @return this builder instance
     */
    @NotNull public Builder interactingDrug(@NotNull Drug drug) {
      putValue("interactingDrug", drug);
      return this;
    }
    /**
     * Another drug that is known to interact with this drug in a way that impacts the effect of this drug or causes a risk to the patient. Note: disease interactions are typically captured as contraindications.
     * @param drug value to set
     * @return this builder instance
     */
    @NotNull public Builder interactingDrug(@NotNull Drug.Builder drug) {
      putValue("interactingDrug", drug.build());
      return this;
    }
    /**
     * Remove interactingDrug property from the builder.
     * If this property is repeatable, all instances are removed.
     * @return this builder instance
     */
    @NotNull public Builder removeInteractingDrug() {
      removeValue("interactingDrug");
      return this;
    }
    /**
     * Get currently set value for interactingDrug property in this builder.
     * @return previously set value or {@code null}. If multiple values have been 
     * set to this property, then {@link java.util.Collection} instance will be 
     * returned.
     */
    @Nullable public java.lang.Object getInteractingDrug() {
      return myData.get("interactingDrug");
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
     * True if the drug is available in a generic form (regardless of name).
     * @param isAvailableGenerically value to set
     * @return this builder instance
     */
    @NotNull public Builder isAvailableGenerically(@NotNull Boolean isAvailableGenerically) {
      putValue("isAvailableGenerically", isAvailableGenerically);
      return this;
    }
    /**
     * Remove isAvailableGenerically property from the builder.
     * If this property is repeatable, all instances are removed.
     * @return this builder instance
     */
    @NotNull public Builder removeIsAvailableGenerically() {
      removeValue("isAvailableGenerically");
      return this;
    }
    /**
     * Get currently set value for isAvailableGenerically property in this builder.
     * @return previously set value or {@code null}. If multiple values have been 
     * set to this property, then {@link java.util.Collection} instance will be 
     * returned.
     */
    @Nullable public java.lang.Object getIsAvailableGenerically() {
      return myData.get("isAvailableGenerically");
    }
    /**
     * Pregnancy category of this drug.
     * @param drugPregnancyCategory value to set
     * @return this builder instance
     */
    @NotNull public Builder pregnancyCategory(@NotNull DrugPregnancyCategory drugPregnancyCategory) {
      putValue("pregnancyCategory", drugPregnancyCategory);
      return this;
    }
    /**
     * Remove pregnancyCategory property from the builder.
     * If this property is repeatable, all instances are removed.
     * @return this builder instance
     */
    @NotNull public Builder removePregnancyCategory() {
      removeValue("pregnancyCategory");
      return this;
    }
    /**
     * Get currently set value for pregnancyCategory property in this builder.
     * @return previously set value or {@code null}. If multiple values have been 
     * set to this property, then {@link java.util.Collection} instance will be 
     * returned.
     */
    @Nullable public java.lang.Object getPregnancyCategory() {
      return myData.get("pregnancyCategory");
    }
    /**
     * Any precaution, guidance, contraindication, etc. related to this drug's use during pregnancy.
     * @param pregnancyWarning value to set
     * @return this builder instance
     */
    @NotNull public Builder pregnancyWarning(@NotNull String pregnancyWarning) {
      putValue("pregnancyWarning", pregnancyWarning);
      return this;
    }
    /**
     * Remove pregnancyWarning property from the builder.
     * If this property is repeatable, all instances are removed.
     * @return this builder instance
     */
    @NotNull public Builder removePregnancyWarning() {
      removeValue("pregnancyWarning");
      return this;
    }
    /**
     * Get currently set value for pregnancyWarning property in this builder.
     * @return previously set value or {@code null}. If multiple values have been 
     * set to this property, then {@link java.util.Collection} instance will be 
     * returned.
     */
    @Nullable public java.lang.Object getPregnancyWarning() {
      return myData.get("pregnancyWarning");
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
     * A dosing schedule for the drug for a given population, either observed, recommended, or maximum dose based on the type used.
     * @param doseSchedule value to set
     * @return this builder instance
     */
    @NotNull public Builder doseSchedule(@NotNull DoseSchedule doseSchedule) {
      putValue("doseSchedule", doseSchedule);
      return this;
    }
    /**
     * A dosing schedule for the drug for a given population, either observed, recommended, or maximum dose based on the type used.
     * @param doseSchedule value to set
     * @return this builder instance
     */
    @NotNull public Builder doseSchedule(@NotNull DoseSchedule.Builder doseSchedule) {
      putValue("doseSchedule", doseSchedule.build());
      return this;
    }
    /**
     * Remove doseSchedule property from the builder.
     * If this property is repeatable, all instances are removed.
     * @return this builder instance
     */
    @NotNull public Builder removeDoseSchedule() {
      removeValue("doseSchedule");
      return this;
    }
    /**
     * Get currently set value for doseSchedule property in this builder.
     * @return previously set value or {@code null}. If multiple values have been 
     * set to this property, then {@link java.util.Collection} instance will be 
     * returned.
     */
    @Nullable public java.lang.Object getDoseSchedule() {
      return myData.get("doseSchedule");
    }
    /**
     * Any precaution, guidance, contraindication, etc. related to consumption of alcohol while taking this drug.
     * @param alcoholWarning value to set
     * @return this builder instance
     */
    @NotNull public Builder alcoholWarning(@NotNull String alcoholWarning) {
      putValue("alcoholWarning", alcoholWarning);
      return this;
    }
    /**
     * Remove alcoholWarning property from the builder.
     * If this property is repeatable, all instances are removed.
     * @return this builder instance
     */
    @NotNull public Builder removeAlcoholWarning() {
      removeValue("alcoholWarning");
      return this;
    }
    /**
     * Get currently set value for alcoholWarning property in this builder.
     * @return previously set value or {@code null}. If multiple values have been 
     * set to this property, then {@link java.util.Collection} instance will be 
     * returned.
     */
    @Nullable public java.lang.Object getAlcoholWarning() {
      return myData.get("alcoholWarning");
    }
    /**
     * Link to the drug's label details.
     * @param labelDetails value to set
     * @return this builder instance
     */
    @NotNull public Builder labelDetails(@NotNull String labelDetails) {
      putValue("labelDetails", labelDetails);
      return this;
    }
    /**
     * Remove labelDetails property from the builder.
     * If this property is repeatable, all instances are removed.
     * @return this builder instance
     */
    @NotNull public Builder removeLabelDetails() {
      removeValue("labelDetails");
      return this;
    }
    /**
     * Get currently set value for labelDetails property in this builder.
     * @return previously set value or {@code null}. If multiple values have been 
     * set to this property, then {@link java.util.Collection} instance will be 
     * returned.
     */
    @Nullable public java.lang.Object getLabelDetails() {
      return myData.get("labelDetails");
    }
    /**
     * Indicates the status of drug prescription eg. local catalogs classifications or whether the drug is available by prescription or over-the-counter, etc.
     * @param drugPrescriptionStatus value to set
     * @return this builder instance
     */
    @NotNull public Builder prescriptionStatus(@NotNull DrugPrescriptionStatus drugPrescriptionStatus) {
      putValue("prescriptionStatus", drugPrescriptionStatus);
      return this;
    }
    /**
     * Indicates the status of drug prescription eg. local catalogs classifications or whether the drug is available by prescription or over-the-counter, etc.
     * @param prescriptionStatus value to set
     * @return this builder instance
     */
    @NotNull public Builder prescriptionStatus(@NotNull String prescriptionStatus) {
      putValue("prescriptionStatus", prescriptionStatus);
      return this;
    }
    /**
     * Remove prescriptionStatus property from the builder.
     * If this property is repeatable, all instances are removed.
     * @return this builder instance
     */
    @NotNull public Builder removePrescriptionStatus() {
      removeValue("prescriptionStatus");
      return this;
    }
    /**
     * Get currently set value for prescriptionStatus property in this builder.
     * @return previously set value or {@code null}. If multiple values have been 
     * set to this property, then {@link java.util.Collection} instance will be 
     * returned.
     */
    @Nullable public java.lang.Object getPrescriptionStatus() {
      return myData.get("prescriptionStatus");
    }
    /**
     * A dosage form in which this drug/supplement is available, e.g. 'tablet', 'suspension', 'injection'.
     * @param dosageForm value to set
     * @return this builder instance
     */
    @NotNull public Builder dosageForm(@NotNull String dosageForm) {
      putValue("dosageForm", dosageForm);
      return this;
    }
    /**
     * Remove dosageForm property from the builder.
     * If this property is repeatable, all instances are removed.
     * @return this builder instance
     */
    @NotNull public Builder removeDosageForm() {
      removeValue("dosageForm");
      return this;
    }
    /**
     * Get currently set value for dosageForm property in this builder.
     * @return previously set value or {@code null}. If multiple values have been 
     * set to this property, then {@link java.util.Collection} instance will be 
     * returned.
     */
    @Nullable public java.lang.Object getDosageForm() {
      return myData.get("dosageForm");
    }
    /**
     * The unit in which the drug is measured, e.g. '5 mg tablet'.
     * @param drugUnit value to set
     * @return this builder instance
     */
    @NotNull public Builder drugUnit(@NotNull String drugUnit) {
      putValue("drugUnit", drugUnit);
      return this;
    }
    /**
     * Remove drugUnit property from the builder.
     * If this property is repeatable, all instances are removed.
     * @return this builder instance
     */
    @NotNull public Builder removeDrugUnit() {
      removeValue("drugUnit");
      return this;
    }
    /**
     * Get currently set value for drugUnit property in this builder.
     * @return previously set value or {@code null}. If multiple values have been 
     * set to this property, then {@link java.util.Collection} instance will be 
     * returned.
     */
    @Nullable public java.lang.Object getDrugUnit() {
      return myData.get("drugUnit");
    }
    /**
     * The RxCUI drug identifier from RXNORM.
     * @param rxcui value to set
     * @return this builder instance
     */
    @NotNull public Builder rxcui(@NotNull String rxcui) {
      putValue("rxcui", rxcui);
      return this;
    }
    /**
     * Remove rxcui property from the builder.
     * If this property is repeatable, all instances are removed.
     * @return this builder instance
     */
    @NotNull public Builder removeRxcui() {
      removeValue("rxcui");
      return this;
    }
    /**
     * Get currently set value for rxcui property in this builder.
     * @return previously set value or {@code null}. If multiple values have been 
     * set to this property, then {@link java.util.Collection} instance will be 
     * returned.
     */
    @Nullable public java.lang.Object getRxcui() {
      return myData.get("rxcui");
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
     * Description of the absorption and elimination of drugs, including their concentration (pharmacokinetics, pK) and biological effects (pharmacodynamics, pD).
     * @param clinicalPharmacology value to set
     * @return this builder instance
     */
    @NotNull public Builder clinicalPharmacology(@NotNull String clinicalPharmacology) {
      putValue("clinicalPharmacology", clinicalPharmacology);
      return this;
    }
    /**
     * Remove clinicalPharmacology property from the builder.
     * If this property is repeatable, all instances are removed.
     * @return this builder instance
     */
    @NotNull public Builder removeClinicalPharmacology() {
      removeValue("clinicalPharmacology");
      return this;
    }
    /**
     * Get currently set value for clinicalPharmacology property in this builder.
     * @return previously set value or {@code null}. If multiple values have been 
     * set to this property, then {@link java.util.Collection} instance will be 
     * returned.
     */
    @Nullable public java.lang.Object getClinicalPharmacology() {
      return myData.get("clinicalPharmacology");
    }
    /**
     * Any FDA or other warnings about the drug (text or URL).
     * @param warning value to set
     * @return this builder instance
     */
    @NotNull public Builder warning(@NotNull String warning) {
      putValue("warning", warning);
      return this;
    }
    /**
     * Remove warning property from the builder.
     * If this property is repeatable, all instances are removed.
     * @return this builder instance
     */
    @NotNull public Builder removeWarning() {
      removeValue("warning");
      return this;
    }
    /**
     * Get currently set value for warning property in this builder.
     * @return previously set value or {@code null}. If multiple values have been 
     * set to this property, then {@link java.util.Collection} instance will be 
     * returned.
     */
    @Nullable public java.lang.Object getWarning() {
      return myData.get("warning");
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
