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
 * Any medical test, typically performed for diagnostic purposes.
 */
public class MedicalTest extends MedicalEntity {
  /**
   * Device used to perform the test.
   * @return usesDevice property set by first invocation of usesDevice method or {@code null}.
   */
  @JsonIgnore public MedicalDevice getUsesDevice() {
    return (MedicalDevice) getValue("usesDevice");
  }
  /**
   * Device used to perform the test.
   * @return all usesDevice properties as {@link java.util.Collection} or an empty collection 
   * if usesDevice was not set.
   */
  @JsonIgnore public java.util.Collection<MedicalDevice> getUsesDevices() {
    final java.lang.Object current = myData.get("usesDevice");
    if (current == null) return Collections.emptyList();
    if (current instanceof java.util.Collection) {
      return (java.util.Collection<MedicalDevice>) current;
    }
    return Arrays.asList((MedicalDevice) current);
  }
  /**
   * Range of acceptable values for a typical patient, when applicable.
   * @return normalRange property set by first invocation of normalRange method or {@code null}.
   */
  @JsonIgnore public MedicalEnumeration getNormalRangeMedicalEnumeration() {
    return (MedicalEnumeration) getValue("normalRange");
  }
  /**
   * Range of acceptable values for a typical patient, when applicable.
   * @return all normalRange properties as {@link java.util.Collection} or an empty collection 
   * if normalRange was not set.
   */
  @JsonIgnore public java.util.Collection<MedicalEnumeration> getNormalRangeMedicalEnumerations() {
    final java.lang.Object current = myData.get("normalRange");
    if (current == null) return Collections.emptyList();
    if (current instanceof java.util.Collection) {
      return (java.util.Collection<MedicalEnumeration>) current;
    }
    return Arrays.asList((MedicalEnumeration) current);
  }
  /**
   * Range of acceptable values for a typical patient, when applicable.
   * @return normalRange property set by first invocation of normalRange method or {@code null}.
   */
  @JsonIgnore public String getNormalRangeString() {
    return (String) getValue("normalRange");
  }
  /**
   * Range of acceptable values for a typical patient, when applicable.
   * @return all normalRange properties as {@link java.util.Collection} or an empty collection 
   * if normalRange was not set.
   */
  @JsonIgnore public java.util.Collection<String> getNormalRangeStrings() {
    final java.lang.Object current = myData.get("normalRange");
    if (current == null) return Collections.emptyList();
    if (current instanceof java.util.Collection) {
      return (java.util.Collection<String>) current;
    }
    return Arrays.asList((String) current);
  }
  /**
   * A condition the test is used to diagnose.
   * @return usedToDiagnose property set by first invocation of usedToDiagnose method or {@code null}.
   */
  @JsonIgnore public MedicalCondition getUsedToDiagnose() {
    return (MedicalCondition) getValue("usedToDiagnose");
  }
  /**
   * A condition the test is used to diagnose.
   * @return all usedToDiagnose properties as {@link java.util.Collection} or an empty collection 
   * if usedToDiagnose was not set.
   */
  @JsonIgnore public java.util.Collection<MedicalCondition> getUsedToDiagnoses() {
    final java.lang.Object current = myData.get("usedToDiagnose");
    if (current == null) return Collections.emptyList();
    if (current instanceof java.util.Collection) {
      return (java.util.Collection<MedicalCondition>) current;
    }
    return Arrays.asList((MedicalCondition) current);
  }
  /**
   * A sign detected by the test.
   * @return signDetected property set by first invocation of signDetected method or {@code null}.
   */
  @JsonIgnore public MedicalSign getSignDetected() {
    return (MedicalSign) getValue("signDetected");
  }
  /**
   * A sign detected by the test.
   * @return all signDetected properties as {@link java.util.Collection} or an empty collection 
   * if signDetected was not set.
   */
  @JsonIgnore public java.util.Collection<MedicalSign> getSignDetecteds() {
    final java.lang.Object current = myData.get("signDetected");
    if (current == null) return Collections.emptyList();
    if (current instanceof java.util.Collection) {
      return (java.util.Collection<MedicalSign>) current;
    }
    return Arrays.asList((MedicalSign) current);
  }
  /**
   * Drugs that affect the test's results.
   * @return affectedBy property set by first invocation of affectedBy method or {@code null}.
   */
  @JsonIgnore public Drug getAffectedBy() {
    return (Drug) getValue("affectedBy");
  }
  /**
   * Drugs that affect the test's results.
   * @return all affectedBy properties as {@link java.util.Collection} or an empty collection 
   * if affectedBy was not set.
   */
  @JsonIgnore public java.util.Collection<Drug> getAffectedBys() {
    final java.lang.Object current = myData.get("affectedBy");
    if (current == null) return Collections.emptyList();
    if (current instanceof java.util.Collection) {
      return (java.util.Collection<Drug>) current;
    }
    return Arrays.asList((Drug) current);
  }
  protected MedicalTest(java.util.Map<String,java.lang.Object> data) {
    super(data);
  }
  
  /**
   * Builder for {@link MedicalTest}
   */
  public static class Builder extends MedicalEntity.Builder {
    public Builder(@NotNull HashMap<String,java.lang.Object> data) {
      super(data);
    }
    @NotNull public MedicalTest build() {
      return new MedicalTest(myData);
    }
    /**
     * Device used to perform the test.
     * @param medicalDevice value to set
     * @return this builder instance
     */
    @NotNull public Builder usesDevice(@NotNull MedicalDevice medicalDevice) {
      putValue("usesDevice", medicalDevice);
      return this;
    }
    /**
     * Device used to perform the test.
     * @param medicalDevice value to set
     * @return this builder instance
     */
    @NotNull public Builder usesDevice(@NotNull MedicalDevice.Builder medicalDevice) {
      putValue("usesDevice", medicalDevice.build());
      return this;
    }
    /**
     * Remove usesDevice property from the builder.
     * If this property is repeatable, all instances are removed.
     * @return this builder instance
     */
    @NotNull public Builder removeUsesDevice() {
      removeValue("usesDevice");
      return this;
    }
    /**
     * Get currently set value for usesDevice property in this builder.
     * @return previously set value or {@code null}. If multiple values have been 
     * set to this property, then {@link java.util.Collection} instance will be 
     * returned.
     */
    @Nullable public java.lang.Object getUsesDevice() {
      return myData.get("usesDevice");
    }
    /**
     * Range of acceptable values for a typical patient, when applicable.
     * @param medicalEnumeration value to set
     * @return this builder instance
     */
    @NotNull public Builder normalRange(@NotNull MedicalEnumeration medicalEnumeration) {
      putValue("normalRange", medicalEnumeration);
      return this;
    }
    /**
     * Range of acceptable values for a typical patient, when applicable.
     * @param normalRange value to set
     * @return this builder instance
     */
    @NotNull public Builder normalRange(@NotNull String normalRange) {
      putValue("normalRange", normalRange);
      return this;
    }
    /**
     * Remove normalRange property from the builder.
     * If this property is repeatable, all instances are removed.
     * @return this builder instance
     */
    @NotNull public Builder removeNormalRange() {
      removeValue("normalRange");
      return this;
    }
    /**
     * Get currently set value for normalRange property in this builder.
     * @return previously set value or {@code null}. If multiple values have been 
     * set to this property, then {@link java.util.Collection} instance will be 
     * returned.
     */
    @Nullable public java.lang.Object getNormalRange() {
      return myData.get("normalRange");
    }
    /**
     * A condition the test is used to diagnose.
     * @param medicalCondition value to set
     * @return this builder instance
     */
    @NotNull public Builder usedToDiagnose(@NotNull MedicalCondition medicalCondition) {
      putValue("usedToDiagnose", medicalCondition);
      return this;
    }
    /**
     * A condition the test is used to diagnose.
     * @param medicalCondition value to set
     * @return this builder instance
     */
    @NotNull public Builder usedToDiagnose(@NotNull MedicalCondition.Builder medicalCondition) {
      putValue("usedToDiagnose", medicalCondition.build());
      return this;
    }
    /**
     * Remove usedToDiagnose property from the builder.
     * If this property is repeatable, all instances are removed.
     * @return this builder instance
     */
    @NotNull public Builder removeUsedToDiagnose() {
      removeValue("usedToDiagnose");
      return this;
    }
    /**
     * Get currently set value for usedToDiagnose property in this builder.
     * @return previously set value or {@code null}. If multiple values have been 
     * set to this property, then {@link java.util.Collection} instance will be 
     * returned.
     */
    @Nullable public java.lang.Object getUsedToDiagnose() {
      return myData.get("usedToDiagnose");
    }
    /**
     * A sign detected by the test.
     * @param medicalSign value to set
     * @return this builder instance
     */
    @NotNull public Builder signDetected(@NotNull MedicalSign medicalSign) {
      putValue("signDetected", medicalSign);
      return this;
    }
    /**
     * A sign detected by the test.
     * @param medicalSign value to set
     * @return this builder instance
     */
    @NotNull public Builder signDetected(@NotNull MedicalSign.Builder medicalSign) {
      putValue("signDetected", medicalSign.build());
      return this;
    }
    /**
     * Remove signDetected property from the builder.
     * If this property is repeatable, all instances are removed.
     * @return this builder instance
     */
    @NotNull public Builder removeSignDetected() {
      removeValue("signDetected");
      return this;
    }
    /**
     * Get currently set value for signDetected property in this builder.
     * @return previously set value or {@code null}. If multiple values have been 
     * set to this property, then {@link java.util.Collection} instance will be 
     * returned.
     */
    @Nullable public java.lang.Object getSignDetected() {
      return myData.get("signDetected");
    }
    /**
     * Drugs that affect the test's results.
     * @param drug value to set
     * @return this builder instance
     */
    @NotNull public Builder affectedBy(@NotNull Drug drug) {
      putValue("affectedBy", drug);
      return this;
    }
    /**
     * Drugs that affect the test's results.
     * @param drug value to set
     * @return this builder instance
     */
    @NotNull public Builder affectedBy(@NotNull Drug.Builder drug) {
      putValue("affectedBy", drug.build());
      return this;
    }
    /**
     * Remove affectedBy property from the builder.
     * If this property is repeatable, all instances are removed.
     * @return this builder instance
     */
    @NotNull public Builder removeAffectedBy() {
      removeValue("affectedBy");
      return this;
    }
    /**
     * Get currently set value for affectedBy property in this builder.
     * @return previously set value or {@code null}. If multiple values have been 
     * set to this property, then {@link java.util.Collection} instance will be 
     * returned.
     */
    @Nullable public java.lang.Object getAffectedBy() {
      return myData.get("affectedBy");
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
      if ("usesDevice".equals(key) && value instanceof MedicalDevice) { this.usesDevice((MedicalDevice)value); return; }
      if ("usesDevices".equals(key) && value instanceof MedicalDevice) { this.usesDevice((MedicalDevice)value); return; }
      if ("normalRange".equals(key) && value instanceof MedicalEnumeration) { this.normalRange((MedicalEnumeration)value); return; }
      if ("normalRanges".equals(key) && value instanceof MedicalEnumeration) { this.normalRange((MedicalEnumeration)value); return; }
      if ("normalRange".equals(key) && value instanceof String) { this.normalRange((String)value); return; }
      if ("normalRanges".equals(key) && value instanceof String) { this.normalRange((String)value); return; }
      if ("usedToDiagnose".equals(key) && value instanceof MedicalCondition) { this.usedToDiagnose((MedicalCondition)value); return; }
      if ("usedToDiagnoses".equals(key) && value instanceof MedicalCondition) { this.usedToDiagnose((MedicalCondition)value); return; }
      if ("signDetected".equals(key) && value instanceof MedicalSign) { this.signDetected((MedicalSign)value); return; }
      if ("signDetecteds".equals(key) && value instanceof MedicalSign) { this.signDetected((MedicalSign)value); return; }
      if ("affectedBy".equals(key) && value instanceof Drug) { this.affectedBy((Drug)value); return; }
      if ("affectedBys".equals(key) && value instanceof Drug) { this.affectedBy((Drug)value); return; }
      super.fromMap(key, value);
    }
  }
  
}
