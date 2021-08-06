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
 * Any biological, chemical, or biochemical thing. For example: a protein; a gene; a chemical; a synthetic chemical.Source: http://bioschemas.org
 */
public class BioChemEntity extends Thing {
  /**
   * A similar BioChemEntity, e.g., obtained by fingerprint similarity algorithms.
   */
  @JsonIgnore public BioChemEntity getBioChemSimilarity() {
    return (BioChemEntity) getValue("bioChemSimilarity");
  }
  /**
   * A similar BioChemEntity, e.g., obtained by fingerprint similarity algorithms.
   */
  @JsonIgnore public java.util.Collection<BioChemEntity> getBioChemSimilaritys() {
    final java.lang.Object current = myData.get("bioChemSimilarity");
    if (current == null) return Collections.emptyList();
    if (current instanceof java.util.Collection) {
      return (java.util.Collection<BioChemEntity>) current;
    }
    return Arrays.asList((BioChemEntity) current);
  }
  /**
   * A common representation such as a protein sequence or chemical structure for this entity. For images use schema.org/image.
   */
  @JsonIgnore public HasRepresentation getHasRepresentation() {
    return (HasRepresentation) getValue("hasRepresentation");
  }
  /**
   * A common representation such as a protein sequence or chemical structure for this entity. For images use schema.org/image.
   */
  @JsonIgnore public java.util.Collection<HasRepresentation> getHasRepresentations() {
    final java.lang.Object current = myData.get("hasRepresentation");
    if (current == null) return Collections.emptyList();
    if (current instanceof java.util.Collection) {
      return (java.util.Collection<HasRepresentation>) current;
    }
    return Arrays.asList((HasRepresentation) current);
  }
  /**
   * Molecular function performed by this BioChemEntity; please use PropertyValue if you want to include any evidence.
   */
  @JsonIgnore public DefinedTerm getHasMolecularFunctionDefinedTerm() {
    return (DefinedTerm) getValue("hasMolecularFunction");
  }
  /**
   * Molecular function performed by this BioChemEntity; please use PropertyValue if you want to include any evidence.
   */
  @JsonIgnore public java.util.Collection<DefinedTerm> getHasMolecularFunctionDefinedTerms() {
    final java.lang.Object current = myData.get("hasMolecularFunction");
    if (current == null) return Collections.emptyList();
    if (current instanceof java.util.Collection) {
      return (java.util.Collection<DefinedTerm>) current;
    }
    return Arrays.asList((DefinedTerm) current);
  }
  /**
   * Molecular function performed by this BioChemEntity; please use PropertyValue if you want to include any evidence.
   */
  @JsonIgnore public PropertyValue getHasMolecularFunctionPropertyValue() {
    return (PropertyValue) getValue("hasMolecularFunction");
  }
  /**
   * Molecular function performed by this BioChemEntity; please use PropertyValue if you want to include any evidence.
   */
  @JsonIgnore public java.util.Collection<PropertyValue> getHasMolecularFunctionPropertyValues() {
    final java.lang.Object current = myData.get("hasMolecularFunction");
    if (current == null) return Collections.emptyList();
    if (current instanceof java.util.Collection) {
      return (java.util.Collection<PropertyValue>) current;
    }
    return Arrays.asList((PropertyValue) current);
  }
  /**
   * Molecular function performed by this BioChemEntity; please use PropertyValue if you want to include any evidence.
   */
  @JsonIgnore public String getHasMolecularFunctionString() {
    return (String) getValue("hasMolecularFunction");
  }
  /**
   * Molecular function performed by this BioChemEntity; please use PropertyValue if you want to include any evidence.
   */
  @JsonIgnore public java.util.Collection<String> getHasMolecularFunctionStrings() {
    final java.lang.Object current = myData.get("hasMolecularFunction");
    if (current == null) return Collections.emptyList();
    if (current instanceof java.util.Collection) {
      return (java.util.Collection<String>) current;
    }
    return Arrays.asList((String) current);
  }
  /**
   * A role played by the BioChemEntity within a biological context.
   */
  @JsonIgnore public DefinedTerm getBiologicalRole() {
    return (DefinedTerm) getValue("biologicalRole");
  }
  /**
   * A role played by the BioChemEntity within a biological context.
   */
  @JsonIgnore public java.util.Collection<DefinedTerm> getBiologicalRoles() {
    final java.lang.Object current = myData.get("biologicalRole");
    if (current == null) return Collections.emptyList();
    if (current instanceof java.util.Collection) {
      return (java.util.Collection<DefinedTerm>) current;
    }
    return Arrays.asList((DefinedTerm) current);
  }
  /**
   * A BioChemEntity that is known to interact with this item.
   */
  @JsonIgnore public BioChemEntity getBioChemInteraction() {
    return (BioChemEntity) getValue("bioChemInteraction");
  }
  /**
   * A BioChemEntity that is known to interact with this item.
   */
  @JsonIgnore public java.util.Collection<BioChemEntity> getBioChemInteractions() {
    final java.lang.Object current = myData.get("bioChemInteraction");
    if (current == null) return Collections.emptyList();
    if (current instanceof java.util.Collection) {
      return (java.util.Collection<BioChemEntity>) current;
    }
    return Arrays.asList((BioChemEntity) current);
  }
  /**
   * Biological process this BioChemEntity is involved in; please use PropertyValue if you want to include any evidence.
   */
  @JsonIgnore public DefinedTerm getIsInvolvedInBiologicalProcessDefinedTerm() {
    return (DefinedTerm) getValue("isInvolvedInBiologicalProcess");
  }
  /**
   * Biological process this BioChemEntity is involved in; please use PropertyValue if you want to include any evidence.
   */
  @JsonIgnore public java.util.Collection<DefinedTerm> getIsInvolvedInBiologicalProcessDefinedTerms() {
    final java.lang.Object current = myData.get("isInvolvedInBiologicalProcess");
    if (current == null) return Collections.emptyList();
    if (current instanceof java.util.Collection) {
      return (java.util.Collection<DefinedTerm>) current;
    }
    return Arrays.asList((DefinedTerm) current);
  }
  /**
   * Biological process this BioChemEntity is involved in; please use PropertyValue if you want to include any evidence.
   */
  @JsonIgnore public PropertyValue getIsInvolvedInBiologicalProcessPropertyValue() {
    return (PropertyValue) getValue("isInvolvedInBiologicalProcess");
  }
  /**
   * Biological process this BioChemEntity is involved in; please use PropertyValue if you want to include any evidence.
   */
  @JsonIgnore public java.util.Collection<PropertyValue> getIsInvolvedInBiologicalProcessPropertyValues() {
    final java.lang.Object current = myData.get("isInvolvedInBiologicalProcess");
    if (current == null) return Collections.emptyList();
    if (current instanceof java.util.Collection) {
      return (java.util.Collection<PropertyValue>) current;
    }
    return Arrays.asList((PropertyValue) current);
  }
  /**
   * Biological process this BioChemEntity is involved in; please use PropertyValue if you want to include any evidence.
   */
  @JsonIgnore public String getIsInvolvedInBiologicalProcessString() {
    return (String) getValue("isInvolvedInBiologicalProcess");
  }
  /**
   * Biological process this BioChemEntity is involved in; please use PropertyValue if you want to include any evidence.
   */
  @JsonIgnore public java.util.Collection<String> getIsInvolvedInBiologicalProcessStrings() {
    final java.lang.Object current = myData.get("isInvolvedInBiologicalProcess");
    if (current == null) return Collections.emptyList();
    if (current instanceof java.util.Collection) {
      return (java.util.Collection<String>) current;
    }
    return Arrays.asList((String) current);
  }
  /**
   * Subcellular location where this BioChemEntity is located; please use PropertyValue if you want to include any evidence.
   */
  @JsonIgnore public DefinedTerm getIsLocatedInSubcellularLocationDefinedTerm() {
    return (DefinedTerm) getValue("isLocatedInSubcellularLocation");
  }
  /**
   * Subcellular location where this BioChemEntity is located; please use PropertyValue if you want to include any evidence.
   */
  @JsonIgnore public java.util.Collection<DefinedTerm> getIsLocatedInSubcellularLocationDefinedTerms() {
    final java.lang.Object current = myData.get("isLocatedInSubcellularLocation");
    if (current == null) return Collections.emptyList();
    if (current instanceof java.util.Collection) {
      return (java.util.Collection<DefinedTerm>) current;
    }
    return Arrays.asList((DefinedTerm) current);
  }
  /**
   * Subcellular location where this BioChemEntity is located; please use PropertyValue if you want to include any evidence.
   */
  @JsonIgnore public PropertyValue getIsLocatedInSubcellularLocationPropertyValue() {
    return (PropertyValue) getValue("isLocatedInSubcellularLocation");
  }
  /**
   * Subcellular location where this BioChemEntity is located; please use PropertyValue if you want to include any evidence.
   */
  @JsonIgnore public java.util.Collection<PropertyValue> getIsLocatedInSubcellularLocationPropertyValues() {
    final java.lang.Object current = myData.get("isLocatedInSubcellularLocation");
    if (current == null) return Collections.emptyList();
    if (current instanceof java.util.Collection) {
      return (java.util.Collection<PropertyValue>) current;
    }
    return Arrays.asList((PropertyValue) current);
  }
  /**
   * Subcellular location where this BioChemEntity is located; please use PropertyValue if you want to include any evidence.
   */
  @JsonIgnore public String getIsLocatedInSubcellularLocationString() {
    return (String) getValue("isLocatedInSubcellularLocation");
  }
  /**
   * Subcellular location where this BioChemEntity is located; please use PropertyValue if you want to include any evidence.
   */
  @JsonIgnore public java.util.Collection<String> getIsLocatedInSubcellularLocationStrings() {
    final java.lang.Object current = myData.get("isLocatedInSubcellularLocation");
    if (current == null) return Collections.emptyList();
    if (current instanceof java.util.Collection) {
      return (java.util.Collection<String>) current;
    }
    return Arrays.asList((String) current);
  }
  /**
   * The taxonomic grouping of the organism that expresses, encodes, or in someway related to the BioChemEntity.
   */
  @JsonIgnore public DefinedTerm getTaxonomicRangeDefinedTerm() {
    return (DefinedTerm) getValue("taxonomicRange");
  }
  /**
   * The taxonomic grouping of the organism that expresses, encodes, or in someway related to the BioChemEntity.
   */
  @JsonIgnore public java.util.Collection<DefinedTerm> getTaxonomicRangeDefinedTerms() {
    final java.lang.Object current = myData.get("taxonomicRange");
    if (current == null) return Collections.emptyList();
    if (current instanceof java.util.Collection) {
      return (java.util.Collection<DefinedTerm>) current;
    }
    return Arrays.asList((DefinedTerm) current);
  }
  /**
   * The taxonomic grouping of the organism that expresses, encodes, or in someway related to the BioChemEntity.
   */
  @JsonIgnore public String getTaxonomicRangeString() {
    return (String) getValue("taxonomicRange");
  }
  /**
   * The taxonomic grouping of the organism that expresses, encodes, or in someway related to the BioChemEntity.
   */
  @JsonIgnore public java.util.Collection<String> getTaxonomicRangeStrings() {
    final java.lang.Object current = myData.get("taxonomicRange");
    if (current == null) return Collections.emptyList();
    if (current instanceof java.util.Collection) {
      return (java.util.Collection<String>) current;
    }
    return Arrays.asList((String) current);
  }
  /**
   * The taxonomic grouping of the organism that expresses, encodes, or in someway related to the BioChemEntity.
   */
  @JsonIgnore public Taxon getTaxonomicRangeTaxon() {
    return (Taxon) getValue("taxonomicRange");
  }
  /**
   * The taxonomic grouping of the organism that expresses, encodes, or in someway related to the BioChemEntity.
   */
  @JsonIgnore public java.util.Collection<Taxon> getTaxonomicRangeTaxons() {
    final java.lang.Object current = myData.get("taxonomicRange");
    if (current == null) return Collections.emptyList();
    if (current instanceof java.util.Collection) {
      return (java.util.Collection<Taxon>) current;
    }
    return Arrays.asList((Taxon) current);
  }
  /**
   * Disease associated to this BioChemEntity. Such disease can be a MedicalCondition or a URL. If you want to add an evidence supporting the association, please use PropertyValue.
   */
  @JsonIgnore public MedicalCondition getAssociatedDiseaseMedicalCondition() {
    return (MedicalCondition) getValue("associatedDisease");
  }
  /**
   * Disease associated to this BioChemEntity. Such disease can be a MedicalCondition or a URL. If you want to add an evidence supporting the association, please use PropertyValue.
   */
  @JsonIgnore public java.util.Collection<MedicalCondition> getAssociatedDiseaseMedicalConditions() {
    final java.lang.Object current = myData.get("associatedDisease");
    if (current == null) return Collections.emptyList();
    if (current instanceof java.util.Collection) {
      return (java.util.Collection<MedicalCondition>) current;
    }
    return Arrays.asList((MedicalCondition) current);
  }
  /**
   * Disease associated to this BioChemEntity. Such disease can be a MedicalCondition or a URL. If you want to add an evidence supporting the association, please use PropertyValue.
   */
  @JsonIgnore public PropertyValue getAssociatedDiseasePropertyValue() {
    return (PropertyValue) getValue("associatedDisease");
  }
  /**
   * Disease associated to this BioChemEntity. Such disease can be a MedicalCondition or a URL. If you want to add an evidence supporting the association, please use PropertyValue.
   */
  @JsonIgnore public java.util.Collection<PropertyValue> getAssociatedDiseasePropertyValues() {
    final java.lang.Object current = myData.get("associatedDisease");
    if (current == null) return Collections.emptyList();
    if (current instanceof java.util.Collection) {
      return (java.util.Collection<PropertyValue>) current;
    }
    return Arrays.asList((PropertyValue) current);
  }
  /**
   * Disease associated to this BioChemEntity. Such disease can be a MedicalCondition or a URL. If you want to add an evidence supporting the association, please use PropertyValue.
   */
  @JsonIgnore public String getAssociatedDiseaseString() {
    return (String) getValue("associatedDisease");
  }
  /**
   * Disease associated to this BioChemEntity. Such disease can be a MedicalCondition or a URL. If you want to add an evidence supporting the association, please use PropertyValue.
   */
  @JsonIgnore public java.util.Collection<String> getAssociatedDiseaseStrings() {
    final java.lang.Object current = myData.get("associatedDisease");
    if (current == null) return Collections.emptyList();
    if (current instanceof java.util.Collection) {
      return (java.util.Collection<String>) current;
    }
    return Arrays.asList((String) current);
  }
  /**
   * Another BioChemEntity encoding by this one.
   */
  @JsonIgnore public Gene getIsEncodedByBioChemEntity() {
    return (Gene) getValue("isEncodedByBioChemEntity");
  }
  /**
   * Another BioChemEntity encoding by this one.
   */
  @JsonIgnore public java.util.Collection<Gene> getIsEncodedByBioChemEntitys() {
    final java.lang.Object current = myData.get("isEncodedByBioChemEntity");
    if (current == null) return Collections.emptyList();
    if (current instanceof java.util.Collection) {
      return (java.util.Collection<Gene>) current;
    }
    return Arrays.asList((Gene) current);
  }
  /**
   * Indicates a BioChemEntity that is (in some sense) a part of this BioChemEntity. 
   */
  @JsonIgnore public BioChemEntity getIsPartOfBioChemEntity() {
    return (BioChemEntity) getValue("isPartOfBioChemEntity");
  }
  /**
   * Indicates a BioChemEntity that is (in some sense) a part of this BioChemEntity. 
   */
  @JsonIgnore public java.util.Collection<BioChemEntity> getIsPartOfBioChemEntitys() {
    final java.lang.Object current = myData.get("isPartOfBioChemEntity");
    if (current == null) return Collections.emptyList();
    if (current instanceof java.util.Collection) {
      return (java.util.Collection<BioChemEntity>) current;
    }
    return Arrays.asList((BioChemEntity) current);
  }
  /**
   * Indicates a BioChemEntity that (in some sense) has this BioChemEntity as a part. 
   */
  @JsonIgnore public BioChemEntity getHasBioChemEntityPart() {
    return (BioChemEntity) getValue("hasBioChemEntityPart");
  }
  /**
   * Indicates a BioChemEntity that (in some sense) has this BioChemEntity as a part. 
   */
  @JsonIgnore public java.util.Collection<BioChemEntity> getHasBioChemEntityParts() {
    final java.lang.Object current = myData.get("hasBioChemEntityPart");
    if (current == null) return Collections.emptyList();
    if (current instanceof java.util.Collection) {
      return (java.util.Collection<BioChemEntity>) current;
    }
    return Arrays.asList((BioChemEntity) current);
  }
  protected BioChemEntity(java.util.Map<String,java.lang.Object> data) {
    super(data);
  }
  
  /**
   * Builder for {@link BioChemEntity}
   */
  public static class Builder extends Thing.Builder {
    public Builder(@NotNull HashMap<String,java.lang.Object> data) {
      super(data);
    }
    @NotNull public BioChemEntity build() {
      return new BioChemEntity(myData);
    }
    /**
     * A similar BioChemEntity, e.g., obtained by fingerprint similarity algorithms.
     */
    @NotNull public Builder bioChemSimilarity(@NotNull BioChemEntity bioChemEntity) {
      putValue("bioChemSimilarity", bioChemEntity);
      return this;
    }
    /**
     * A similar BioChemEntity, e.g., obtained by fingerprint similarity algorithms.
     */
    @NotNull public Builder bioChemSimilarity(@NotNull BioChemEntity.Builder bioChemEntity) {
      putValue("bioChemSimilarity", bioChemEntity.build());
      return this;
    }
    /**
     * A common representation such as a protein sequence or chemical structure for this entity. For images use schema.org/image.
     */
    @NotNull public Builder hasRepresentation(@NotNull HasRepresentation hasRepresentation) {
      putValue("hasRepresentation", hasRepresentation);
      return this;
    }
    /**
     * Molecular function performed by this BioChemEntity; please use PropertyValue if you want to include any evidence.
     */
    @NotNull public Builder hasMolecularFunction(@NotNull DefinedTerm definedTerm) {
      putValue("hasMolecularFunction", definedTerm);
      return this;
    }
    /**
     * Molecular function performed by this BioChemEntity; please use PropertyValue if you want to include any evidence.
     */
    @NotNull public Builder hasMolecularFunction(@NotNull DefinedTerm.Builder definedTerm) {
      putValue("hasMolecularFunction", definedTerm.build());
      return this;
    }
    /**
     * Molecular function performed by this BioChemEntity; please use PropertyValue if you want to include any evidence.
     */
    @NotNull public Builder hasMolecularFunction(@NotNull PropertyValue propertyValue) {
      putValue("hasMolecularFunction", propertyValue);
      return this;
    }
    /**
     * Molecular function performed by this BioChemEntity; please use PropertyValue if you want to include any evidence.
     */
    @NotNull public Builder hasMolecularFunction(@NotNull PropertyValue.Builder propertyValue) {
      putValue("hasMolecularFunction", propertyValue.build());
      return this;
    }
    /**
     * Molecular function performed by this BioChemEntity; please use PropertyValue if you want to include any evidence.
     */
    @NotNull public Builder hasMolecularFunction(@NotNull String hasMolecularFunction) {
      putValue("hasMolecularFunction", hasMolecularFunction);
      return this;
    }
    /**
     * A role played by the BioChemEntity within a biological context.
     */
    @NotNull public Builder biologicalRole(@NotNull DefinedTerm definedTerm) {
      putValue("biologicalRole", definedTerm);
      return this;
    }
    /**
     * A role played by the BioChemEntity within a biological context.
     */
    @NotNull public Builder biologicalRole(@NotNull DefinedTerm.Builder definedTerm) {
      putValue("biologicalRole", definedTerm.build());
      return this;
    }
    /**
     * A BioChemEntity that is known to interact with this item.
     */
    @NotNull public Builder bioChemInteraction(@NotNull BioChemEntity bioChemEntity) {
      putValue("bioChemInteraction", bioChemEntity);
      return this;
    }
    /**
     * A BioChemEntity that is known to interact with this item.
     */
    @NotNull public Builder bioChemInteraction(@NotNull BioChemEntity.Builder bioChemEntity) {
      putValue("bioChemInteraction", bioChemEntity.build());
      return this;
    }
    /**
     * Biological process this BioChemEntity is involved in; please use PropertyValue if you want to include any evidence.
     */
    @NotNull public Builder isInvolvedInBiologicalProcess(@NotNull DefinedTerm definedTerm) {
      putValue("isInvolvedInBiologicalProcess", definedTerm);
      return this;
    }
    /**
     * Biological process this BioChemEntity is involved in; please use PropertyValue if you want to include any evidence.
     */
    @NotNull public Builder isInvolvedInBiologicalProcess(@NotNull DefinedTerm.Builder definedTerm) {
      putValue("isInvolvedInBiologicalProcess", definedTerm.build());
      return this;
    }
    /**
     * Biological process this BioChemEntity is involved in; please use PropertyValue if you want to include any evidence.
     */
    @NotNull public Builder isInvolvedInBiologicalProcess(@NotNull PropertyValue propertyValue) {
      putValue("isInvolvedInBiologicalProcess", propertyValue);
      return this;
    }
    /**
     * Biological process this BioChemEntity is involved in; please use PropertyValue if you want to include any evidence.
     */
    @NotNull public Builder isInvolvedInBiologicalProcess(@NotNull PropertyValue.Builder propertyValue) {
      putValue("isInvolvedInBiologicalProcess", propertyValue.build());
      return this;
    }
    /**
     * Biological process this BioChemEntity is involved in; please use PropertyValue if you want to include any evidence.
     */
    @NotNull public Builder isInvolvedInBiologicalProcess(@NotNull String isInvolvedInBiologicalProcess) {
      putValue("isInvolvedInBiologicalProcess", isInvolvedInBiologicalProcess);
      return this;
    }
    /**
     * Subcellular location where this BioChemEntity is located; please use PropertyValue if you want to include any evidence.
     */
    @NotNull public Builder isLocatedInSubcellularLocation(@NotNull DefinedTerm definedTerm) {
      putValue("isLocatedInSubcellularLocation", definedTerm);
      return this;
    }
    /**
     * Subcellular location where this BioChemEntity is located; please use PropertyValue if you want to include any evidence.
     */
    @NotNull public Builder isLocatedInSubcellularLocation(@NotNull DefinedTerm.Builder definedTerm) {
      putValue("isLocatedInSubcellularLocation", definedTerm.build());
      return this;
    }
    /**
     * Subcellular location where this BioChemEntity is located; please use PropertyValue if you want to include any evidence.
     */
    @NotNull public Builder isLocatedInSubcellularLocation(@NotNull PropertyValue propertyValue) {
      putValue("isLocatedInSubcellularLocation", propertyValue);
      return this;
    }
    /**
     * Subcellular location where this BioChemEntity is located; please use PropertyValue if you want to include any evidence.
     */
    @NotNull public Builder isLocatedInSubcellularLocation(@NotNull PropertyValue.Builder propertyValue) {
      putValue("isLocatedInSubcellularLocation", propertyValue.build());
      return this;
    }
    /**
     * Subcellular location where this BioChemEntity is located; please use PropertyValue if you want to include any evidence.
     */
    @NotNull public Builder isLocatedInSubcellularLocation(@NotNull String isLocatedInSubcellularLocation) {
      putValue("isLocatedInSubcellularLocation", isLocatedInSubcellularLocation);
      return this;
    }
    /**
     * The taxonomic grouping of the organism that expresses, encodes, or in someway related to the BioChemEntity.
     */
    @NotNull public Builder taxonomicRange(@NotNull DefinedTerm definedTerm) {
      putValue("taxonomicRange", definedTerm);
      return this;
    }
    /**
     * The taxonomic grouping of the organism that expresses, encodes, or in someway related to the BioChemEntity.
     */
    @NotNull public Builder taxonomicRange(@NotNull DefinedTerm.Builder definedTerm) {
      putValue("taxonomicRange", definedTerm.build());
      return this;
    }
    /**
     * The taxonomic grouping of the organism that expresses, encodes, or in someway related to the BioChemEntity.
     */
    @NotNull public Builder taxonomicRange(@NotNull String taxonomicRange) {
      putValue("taxonomicRange", taxonomicRange);
      return this;
    }
    /**
     * The taxonomic grouping of the organism that expresses, encodes, or in someway related to the BioChemEntity.
     */
    @NotNull public Builder taxonomicRange(@NotNull Taxon taxon) {
      putValue("taxonomicRange", taxon);
      return this;
    }
    /**
     * The taxonomic grouping of the organism that expresses, encodes, or in someway related to the BioChemEntity.
     */
    @NotNull public Builder taxonomicRange(@NotNull Taxon.Builder taxon) {
      putValue("taxonomicRange", taxon.build());
      return this;
    }
    /**
     * Disease associated to this BioChemEntity. Such disease can be a MedicalCondition or a URL. If you want to add an evidence supporting the association, please use PropertyValue.
     */
    @NotNull public Builder associatedDisease(@NotNull MedicalCondition medicalCondition) {
      putValue("associatedDisease", medicalCondition);
      return this;
    }
    /**
     * Disease associated to this BioChemEntity. Such disease can be a MedicalCondition or a URL. If you want to add an evidence supporting the association, please use PropertyValue.
     */
    @NotNull public Builder associatedDisease(@NotNull MedicalCondition.Builder medicalCondition) {
      putValue("associatedDisease", medicalCondition.build());
      return this;
    }
    /**
     * Disease associated to this BioChemEntity. Such disease can be a MedicalCondition or a URL. If you want to add an evidence supporting the association, please use PropertyValue.
     */
    @NotNull public Builder associatedDisease(@NotNull PropertyValue propertyValue) {
      putValue("associatedDisease", propertyValue);
      return this;
    }
    /**
     * Disease associated to this BioChemEntity. Such disease can be a MedicalCondition or a URL. If you want to add an evidence supporting the association, please use PropertyValue.
     */
    @NotNull public Builder associatedDisease(@NotNull PropertyValue.Builder propertyValue) {
      putValue("associatedDisease", propertyValue.build());
      return this;
    }
    /**
     * Disease associated to this BioChemEntity. Such disease can be a MedicalCondition or a URL. If you want to add an evidence supporting the association, please use PropertyValue.
     */
    @NotNull public Builder associatedDisease(@NotNull String associatedDisease) {
      putValue("associatedDisease", associatedDisease);
      return this;
    }
    /**
     * Another BioChemEntity encoding by this one.
     */
    @NotNull public Builder isEncodedByBioChemEntity(@NotNull Gene gene) {
      putValue("isEncodedByBioChemEntity", gene);
      return this;
    }
    /**
     * Another BioChemEntity encoding by this one.
     */
    @NotNull public Builder isEncodedByBioChemEntity(@NotNull Gene.Builder gene) {
      putValue("isEncodedByBioChemEntity", gene.build());
      return this;
    }
    /**
     * Indicates a BioChemEntity that is (in some sense) a part of this BioChemEntity. 
     */
    @NotNull public Builder isPartOfBioChemEntity(@NotNull BioChemEntity bioChemEntity) {
      putValue("isPartOfBioChemEntity", bioChemEntity);
      return this;
    }
    /**
     * Indicates a BioChemEntity that is (in some sense) a part of this BioChemEntity. 
     */
    @NotNull public Builder isPartOfBioChemEntity(@NotNull BioChemEntity.Builder bioChemEntity) {
      putValue("isPartOfBioChemEntity", bioChemEntity.build());
      return this;
    }
    /**
     * Indicates a BioChemEntity that (in some sense) has this BioChemEntity as a part. 
     */
    @NotNull public Builder hasBioChemEntityPart(@NotNull BioChemEntity bioChemEntity) {
      putValue("hasBioChemEntityPart", bioChemEntity);
      return this;
    }
    /**
     * Indicates a BioChemEntity that (in some sense) has this BioChemEntity as a part. 
     */
    @NotNull public Builder hasBioChemEntityPart(@NotNull BioChemEntity.Builder bioChemEntity) {
      putValue("hasBioChemEntityPart", bioChemEntity.build());
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
      if ("bioChemSimilarity".equals(key) && value instanceof BioChemEntity) { this.bioChemSimilarity((BioChemEntity)value); return; }
      if ("bioChemSimilaritys".equals(key) && value instanceof BioChemEntity) { this.bioChemSimilarity((BioChemEntity)value); return; }
      if ("hasRepresentation".equals(key) && value instanceof HasRepresentation) { this.hasRepresentation((HasRepresentation)value); return; }
      if ("hasRepresentations".equals(key) && value instanceof HasRepresentation) { this.hasRepresentation((HasRepresentation)value); return; }
      if ("hasMolecularFunction".equals(key) && value instanceof DefinedTerm) { this.hasMolecularFunction((DefinedTerm)value); return; }
      if ("hasMolecularFunctions".equals(key) && value instanceof DefinedTerm) { this.hasMolecularFunction((DefinedTerm)value); return; }
      if ("hasMolecularFunction".equals(key) && value instanceof PropertyValue) { this.hasMolecularFunction((PropertyValue)value); return; }
      if ("hasMolecularFunctions".equals(key) && value instanceof PropertyValue) { this.hasMolecularFunction((PropertyValue)value); return; }
      if ("hasMolecularFunction".equals(key) && value instanceof String) { this.hasMolecularFunction((String)value); return; }
      if ("hasMolecularFunctions".equals(key) && value instanceof String) { this.hasMolecularFunction((String)value); return; }
      if ("biologicalRole".equals(key) && value instanceof DefinedTerm) { this.biologicalRole((DefinedTerm)value); return; }
      if ("biologicalRoles".equals(key) && value instanceof DefinedTerm) { this.biologicalRole((DefinedTerm)value); return; }
      if ("bioChemInteraction".equals(key) && value instanceof BioChemEntity) { this.bioChemInteraction((BioChemEntity)value); return; }
      if ("bioChemInteractions".equals(key) && value instanceof BioChemEntity) { this.bioChemInteraction((BioChemEntity)value); return; }
      if ("isInvolvedInBiologicalProcess".equals(key) && value instanceof DefinedTerm) { this.isInvolvedInBiologicalProcess((DefinedTerm)value); return; }
      if ("isInvolvedInBiologicalProcesss".equals(key) && value instanceof DefinedTerm) { this.isInvolvedInBiologicalProcess((DefinedTerm)value); return; }
      if ("isInvolvedInBiologicalProcess".equals(key) && value instanceof PropertyValue) { this.isInvolvedInBiologicalProcess((PropertyValue)value); return; }
      if ("isInvolvedInBiologicalProcesss".equals(key) && value instanceof PropertyValue) { this.isInvolvedInBiologicalProcess((PropertyValue)value); return; }
      if ("isInvolvedInBiologicalProcess".equals(key) && value instanceof String) { this.isInvolvedInBiologicalProcess((String)value); return; }
      if ("isInvolvedInBiologicalProcesss".equals(key) && value instanceof String) { this.isInvolvedInBiologicalProcess((String)value); return; }
      if ("isLocatedInSubcellularLocation".equals(key) && value instanceof DefinedTerm) { this.isLocatedInSubcellularLocation((DefinedTerm)value); return; }
      if ("isLocatedInSubcellularLocations".equals(key) && value instanceof DefinedTerm) { this.isLocatedInSubcellularLocation((DefinedTerm)value); return; }
      if ("isLocatedInSubcellularLocation".equals(key) && value instanceof PropertyValue) { this.isLocatedInSubcellularLocation((PropertyValue)value); return; }
      if ("isLocatedInSubcellularLocations".equals(key) && value instanceof PropertyValue) { this.isLocatedInSubcellularLocation((PropertyValue)value); return; }
      if ("isLocatedInSubcellularLocation".equals(key) && value instanceof String) { this.isLocatedInSubcellularLocation((String)value); return; }
      if ("isLocatedInSubcellularLocations".equals(key) && value instanceof String) { this.isLocatedInSubcellularLocation((String)value); return; }
      if ("taxonomicRange".equals(key) && value instanceof DefinedTerm) { this.taxonomicRange((DefinedTerm)value); return; }
      if ("taxonomicRanges".equals(key) && value instanceof DefinedTerm) { this.taxonomicRange((DefinedTerm)value); return; }
      if ("taxonomicRange".equals(key) && value instanceof String) { this.taxonomicRange((String)value); return; }
      if ("taxonomicRanges".equals(key) && value instanceof String) { this.taxonomicRange((String)value); return; }
      if ("taxonomicRange".equals(key) && value instanceof Taxon) { this.taxonomicRange((Taxon)value); return; }
      if ("taxonomicRanges".equals(key) && value instanceof Taxon) { this.taxonomicRange((Taxon)value); return; }
      if ("associatedDisease".equals(key) && value instanceof MedicalCondition) { this.associatedDisease((MedicalCondition)value); return; }
      if ("associatedDiseases".equals(key) && value instanceof MedicalCondition) { this.associatedDisease((MedicalCondition)value); return; }
      if ("associatedDisease".equals(key) && value instanceof PropertyValue) { this.associatedDisease((PropertyValue)value); return; }
      if ("associatedDiseases".equals(key) && value instanceof PropertyValue) { this.associatedDisease((PropertyValue)value); return; }
      if ("associatedDisease".equals(key) && value instanceof String) { this.associatedDisease((String)value); return; }
      if ("associatedDiseases".equals(key) && value instanceof String) { this.associatedDisease((String)value); return; }
      if ("isEncodedByBioChemEntity".equals(key) && value instanceof Gene) { this.isEncodedByBioChemEntity((Gene)value); return; }
      if ("isEncodedByBioChemEntitys".equals(key) && value instanceof Gene) { this.isEncodedByBioChemEntity((Gene)value); return; }
      if ("isPartOfBioChemEntity".equals(key) && value instanceof BioChemEntity) { this.isPartOfBioChemEntity((BioChemEntity)value); return; }
      if ("isPartOfBioChemEntitys".equals(key) && value instanceof BioChemEntity) { this.isPartOfBioChemEntity((BioChemEntity)value); return; }
      if ("hasBioChemEntityPart".equals(key) && value instanceof BioChemEntity) { this.hasBioChemEntityPart((BioChemEntity)value); return; }
      if ("hasBioChemEntityParts".equals(key) && value instanceof BioChemEntity) { this.hasBioChemEntityPart((BioChemEntity)value); return; }
      super.fromMap(key, value);
    }
  }
  
}
