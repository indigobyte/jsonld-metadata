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
 * Any constitutionally or isotopically distinct atom, molecule, ion, ion pair, radical, radical ion, complex, conformer etc., identifiable as a separately distinguishable entity.Source: http://bioschemas.org
 */
public class MolecularEntity extends BioChemEntity {
  /**
   * A specification in form of a line notation for describing the structure of chemical species using short ASCII strings.  Double bond stereochemistry \ indicators may need to be escaped in the string in formats where the backslash is an escape character.
   */
  @JsonIgnore public HasRepresentation getSmiles() {
    return (HasRepresentation) getValue("smiles");
  }
  /**
   * A specification in form of a line notation for describing the structure of chemical species using short ASCII strings.  Double bond stereochemistry \ indicators may need to be escaped in the string in formats where the backslash is an escape character.
   */
  @JsonIgnore public java.util.Collection<HasRepresentation> getSmiless() {
    final Object current = myData.get("smiles");
    if (current == null) return Collections.emptyList();
    if (current instanceof java.util.Collection) {
      return (java.util.Collection<HasRepresentation>) current;
    }
    return Arrays.asList((HasRepresentation) current);
  }
  /**
   * Systematic method of naming chemical compounds as recommended by the International Union of Pure and Applied Chemistry (IUPAC).
   */
  @JsonIgnore public String getIupacName() {
    return (String) getValue("iupacName");
  }
  /**
   * Systematic method of naming chemical compounds as recommended by the International Union of Pure and Applied Chemistry (IUPAC).
   */
  @JsonIgnore public java.util.Collection<String> getIupacNames() {
    final Object current = myData.get("iupacName");
    if (current == null) return Collections.emptyList();
    if (current instanceof java.util.Collection) {
      return (java.util.Collection<String>) current;
    }
    return Arrays.asList((String) current);
  }
  /**
   * The monoisotopic mass is the sum of the masses of the atoms in a molecule using the unbound, ground-state, rest mass of the principal (most abundant) isotope for each element instead of the isotopic average mass. Please include the units the form '&amp;lt;Number&amp;gt; &amp;lt;unit&amp;gt;', for example '770.230488 g/mol' or as '&amp;lt;QuantitativeValue&amp;gt;.
   */
  @JsonIgnore public QuantitativeValue getMonoisotopicMolecularWeightQuantitativeValue() {
    return (QuantitativeValue) getValue("monoisotopicMolecularWeight");
  }
  /**
   * The monoisotopic mass is the sum of the masses of the atoms in a molecule using the unbound, ground-state, rest mass of the principal (most abundant) isotope for each element instead of the isotopic average mass. Please include the units the form '&amp;lt;Number&amp;gt; &amp;lt;unit&amp;gt;', for example '770.230488 g/mol' or as '&amp;lt;QuantitativeValue&amp;gt;.
   */
  @JsonIgnore public java.util.Collection<QuantitativeValue> getMonoisotopicMolecularWeightQuantitativeValues() {
    final Object current = myData.get("monoisotopicMolecularWeight");
    if (current == null) return Collections.emptyList();
    if (current instanceof java.util.Collection) {
      return (java.util.Collection<QuantitativeValue>) current;
    }
    return Arrays.asList((QuantitativeValue) current);
  }
  /**
   * The monoisotopic mass is the sum of the masses of the atoms in a molecule using the unbound, ground-state, rest mass of the principal (most abundant) isotope for each element instead of the isotopic average mass. Please include the units the form '&amp;lt;Number&amp;gt; &amp;lt;unit&amp;gt;', for example '770.230488 g/mol' or as '&amp;lt;QuantitativeValue&amp;gt;.
   */
  @JsonIgnore public String getMonoisotopicMolecularWeightString() {
    return (String) getValue("monoisotopicMolecularWeight");
  }
  /**
   * The monoisotopic mass is the sum of the masses of the atoms in a molecule using the unbound, ground-state, rest mass of the principal (most abundant) isotope for each element instead of the isotopic average mass. Please include the units the form '&amp;lt;Number&amp;gt; &amp;lt;unit&amp;gt;', for example '770.230488 g/mol' or as '&amp;lt;QuantitativeValue&amp;gt;.
   */
  @JsonIgnore public java.util.Collection<String> getMonoisotopicMolecularWeightStrings() {
    final Object current = myData.get("monoisotopicMolecularWeight");
    if (current == null) return Collections.emptyList();
    if (current instanceof java.util.Collection) {
      return (java.util.Collection<String>) current;
    }
    return Arrays.asList((String) current);
  }
  /**
   * A role played by the BioChemEntity within a chemical context.
   */
  @JsonIgnore public DefinedTerm getChemicalRole() {
    return (DefinedTerm) getValue("chemicalRole");
  }
  /**
   * A role played by the BioChemEntity within a chemical context.
   */
  @JsonIgnore public java.util.Collection<DefinedTerm> getChemicalRoles() {
    final Object current = myData.get("chemicalRole");
    if (current == null) return Collections.emptyList();
    if (current instanceof java.util.Collection) {
      return (java.util.Collection<DefinedTerm>) current;
    }
    return Arrays.asList((DefinedTerm) current);
  }
  /**
   * InChIKey is a hashed version of the full InChI (using the SHA-256 algorithm).
   */
  @JsonIgnore public HasRepresentation getInChIKey() {
    return (HasRepresentation) getValue("inChIKey");
  }
  /**
   * InChIKey is a hashed version of the full InChI (using the SHA-256 algorithm).
   */
  @JsonIgnore public java.util.Collection<HasRepresentation> getInChIKeys() {
    final Object current = myData.get("inChIKey");
    if (current == null) return Collections.emptyList();
    if (current instanceof java.util.Collection) {
      return (java.util.Collection<HasRepresentation>) current;
    }
    return Arrays.asList((HasRepresentation) current);
  }
  /**
   * This is the molecular weight of the entity being described, not of the parent. Units should be included in the form '&amp;lt;Number&amp;gt; &amp;lt;unit&amp;gt;', for example '12 amu' or as '&amp;lt;QuantitativeValue&amp;gt;.
   */
  @JsonIgnore public QuantitativeValue getMolecularWeightQuantitativeValue() {
    return (QuantitativeValue) getValue("molecularWeight");
  }
  /**
   * This is the molecular weight of the entity being described, not of the parent. Units should be included in the form '&amp;lt;Number&amp;gt; &amp;lt;unit&amp;gt;', for example '12 amu' or as '&amp;lt;QuantitativeValue&amp;gt;.
   */
  @JsonIgnore public java.util.Collection<QuantitativeValue> getMolecularWeightQuantitativeValues() {
    final Object current = myData.get("molecularWeight");
    if (current == null) return Collections.emptyList();
    if (current instanceof java.util.Collection) {
      return (java.util.Collection<QuantitativeValue>) current;
    }
    return Arrays.asList((QuantitativeValue) current);
  }
  /**
   * This is the molecular weight of the entity being described, not of the parent. Units should be included in the form '&amp;lt;Number&amp;gt; &amp;lt;unit&amp;gt;', for example '12 amu' or as '&amp;lt;QuantitativeValue&amp;gt;.
   */
  @JsonIgnore public String getMolecularWeightString() {
    return (String) getValue("molecularWeight");
  }
  /**
   * This is the molecular weight of the entity being described, not of the parent. Units should be included in the form '&amp;lt;Number&amp;gt; &amp;lt;unit&amp;gt;', for example '12 amu' or as '&amp;lt;QuantitativeValue&amp;gt;.
   */
  @JsonIgnore public java.util.Collection<String> getMolecularWeightStrings() {
    final Object current = myData.get("molecularWeight");
    if (current == null) return Collections.emptyList();
    if (current instanceof java.util.Collection) {
      return (java.util.Collection<String>) current;
    }
    return Arrays.asList((String) current);
  }
  /**
   * The empirical formula is the simplest whole number ratio of all the atoms in a molecule.
   */
  @JsonIgnore public String getMolecularFormula() {
    return (String) getValue("molecularFormula");
  }
  /**
   * The empirical formula is the simplest whole number ratio of all the atoms in a molecule.
   */
  @JsonIgnore public java.util.Collection<String> getMolecularFormulas() {
    final Object current = myData.get("molecularFormula");
    if (current == null) return Collections.emptyList();
    if (current instanceof java.util.Collection) {
      return (java.util.Collection<String>) current;
    }
    return Arrays.asList((String) current);
  }
  /**
   * Intended use of the BioChemEntity by humans.
   */
  @JsonIgnore public DefinedTerm getPotentialUse() {
    return (DefinedTerm) getValue("potentialUse");
  }
  /**
   * Intended use of the BioChemEntity by humans.
   */
  @JsonIgnore public java.util.Collection<DefinedTerm> getPotentialUses() {
    final Object current = myData.get("potentialUse");
    if (current == null) return Collections.emptyList();
    if (current instanceof java.util.Collection) {
      return (java.util.Collection<DefinedTerm>) current;
    }
    return Arrays.asList((DefinedTerm) current);
  }
  /**
   * Non-proprietary identifier for molecular entity that can be used in printed and electronic data sources thus enabling easier linking of diverse data compilations.
   */
  @JsonIgnore public HasRepresentation getInChI() {
    return (HasRepresentation) getValue("inChI");
  }
  /**
   * Non-proprietary identifier for molecular entity that can be used in printed and electronic data sources thus enabling easier linking of diverse data compilations.
   */
  @JsonIgnore public java.util.Collection<HasRepresentation> getInChIs() {
    final Object current = myData.get("inChI");
    if (current == null) return Collections.emptyList();
    if (current instanceof java.util.Collection) {
      return (java.util.Collection<HasRepresentation>) current;
    }
    return Arrays.asList((HasRepresentation) current);
  }
  protected MolecularEntity(java.util.Map<String,Object> data) {
    super(data);
  }
  
  /**
   * Builder for {@link MolecularEntity}
   */
  public static class Builder extends BioChemEntity.Builder {
    public Builder(@NotNull HashMap<String,Object> data) {
      super(data);
    }
    @NotNull public MolecularEntity build() {
      return new MolecularEntity(myData);
    }
    /**
     * A specification in form of a line notation for describing the structure of chemical species using short ASCII strings.  Double bond stereochemistry \ indicators may need to be escaped in the string in formats where the backslash is an escape character.
     */
    @NotNull public Builder smiles(@NotNull HasRepresentation hasRepresentation) {
      putValue("smiles", hasRepresentation);
      return this;
    }
    /**
     * Systematic method of naming chemical compounds as recommended by the International Union of Pure and Applied Chemistry (IUPAC).
     */
    @NotNull public Builder iupacName(@NotNull String iupacName) {
      putValue("iupacName", iupacName);
      return this;
    }
    /**
     * The monoisotopic mass is the sum of the masses of the atoms in a molecule using the unbound, ground-state, rest mass of the principal (most abundant) isotope for each element instead of the isotopic average mass. Please include the units the form '&amp;lt;Number&amp;gt; &amp;lt;unit&amp;gt;', for example '770.230488 g/mol' or as '&amp;lt;QuantitativeValue&amp;gt;.
     */
    @NotNull public Builder monoisotopicMolecularWeight(@NotNull QuantitativeValue quantitativeValue) {
      putValue("monoisotopicMolecularWeight", quantitativeValue);
      return this;
    }
    /**
     * The monoisotopic mass is the sum of the masses of the atoms in a molecule using the unbound, ground-state, rest mass of the principal (most abundant) isotope for each element instead of the isotopic average mass. Please include the units the form '&amp;lt;Number&amp;gt; &amp;lt;unit&amp;gt;', for example '770.230488 g/mol' or as '&amp;lt;QuantitativeValue&amp;gt;.
     */
    @NotNull public Builder monoisotopicMolecularWeight(@NotNull QuantitativeValue.Builder quantitativeValue) {
      putValue("monoisotopicMolecularWeight", quantitativeValue.build());
      return this;
    }
    /**
     * The monoisotopic mass is the sum of the masses of the atoms in a molecule using the unbound, ground-state, rest mass of the principal (most abundant) isotope for each element instead of the isotopic average mass. Please include the units the form '&amp;lt;Number&amp;gt; &amp;lt;unit&amp;gt;', for example '770.230488 g/mol' or as '&amp;lt;QuantitativeValue&amp;gt;.
     */
    @NotNull public Builder monoisotopicMolecularWeight(@NotNull String monoisotopicMolecularWeight) {
      putValue("monoisotopicMolecularWeight", monoisotopicMolecularWeight);
      return this;
    }
    /**
     * A role played by the BioChemEntity within a chemical context.
     */
    @NotNull public Builder chemicalRole(@NotNull DefinedTerm definedTerm) {
      putValue("chemicalRole", definedTerm);
      return this;
    }
    /**
     * A role played by the BioChemEntity within a chemical context.
     */
    @NotNull public Builder chemicalRole(@NotNull DefinedTerm.Builder definedTerm) {
      putValue("chemicalRole", definedTerm.build());
      return this;
    }
    /**
     * InChIKey is a hashed version of the full InChI (using the SHA-256 algorithm).
     */
    @NotNull public Builder inChIKey(@NotNull HasRepresentation hasRepresentation) {
      putValue("inChIKey", hasRepresentation);
      return this;
    }
    /**
     * This is the molecular weight of the entity being described, not of the parent. Units should be included in the form '&amp;lt;Number&amp;gt; &amp;lt;unit&amp;gt;', for example '12 amu' or as '&amp;lt;QuantitativeValue&amp;gt;.
     */
    @NotNull public Builder molecularWeight(@NotNull QuantitativeValue quantitativeValue) {
      putValue("molecularWeight", quantitativeValue);
      return this;
    }
    /**
     * This is the molecular weight of the entity being described, not of the parent. Units should be included in the form '&amp;lt;Number&amp;gt; &amp;lt;unit&amp;gt;', for example '12 amu' or as '&amp;lt;QuantitativeValue&amp;gt;.
     */
    @NotNull public Builder molecularWeight(@NotNull QuantitativeValue.Builder quantitativeValue) {
      putValue("molecularWeight", quantitativeValue.build());
      return this;
    }
    /**
     * This is the molecular weight of the entity being described, not of the parent. Units should be included in the form '&amp;lt;Number&amp;gt; &amp;lt;unit&amp;gt;', for example '12 amu' or as '&amp;lt;QuantitativeValue&amp;gt;.
     */
    @NotNull public Builder molecularWeight(@NotNull String molecularWeight) {
      putValue("molecularWeight", molecularWeight);
      return this;
    }
    /**
     * The empirical formula is the simplest whole number ratio of all the atoms in a molecule.
     */
    @NotNull public Builder molecularFormula(@NotNull String molecularFormula) {
      putValue("molecularFormula", molecularFormula);
      return this;
    }
    /**
     * Intended use of the BioChemEntity by humans.
     */
    @NotNull public Builder potentialUse(@NotNull DefinedTerm definedTerm) {
      putValue("potentialUse", definedTerm);
      return this;
    }
    /**
     * Intended use of the BioChemEntity by humans.
     */
    @NotNull public Builder potentialUse(@NotNull DefinedTerm.Builder definedTerm) {
      putValue("potentialUse", definedTerm.build());
      return this;
    }
    /**
     * Non-proprietary identifier for molecular entity that can be used in printed and electronic data sources thus enabling easier linking of diverse data compilations.
     */
    @NotNull public Builder inChI(@NotNull HasRepresentation hasRepresentation) {
      putValue("inChI", hasRepresentation);
      return this;
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
      if ("smiles".equals(key) && value instanceof HasRepresentation) { this.smiles((HasRepresentation)value); return; }
      if ("smiless".equals(key) && value instanceof HasRepresentation) { this.smiles((HasRepresentation)value); return; }
      if ("iupacName".equals(key) && value instanceof String) { this.iupacName((String)value); return; }
      if ("iupacNames".equals(key) && value instanceof String) { this.iupacName((String)value); return; }
      if ("monoisotopicMolecularWeight".equals(key) && value instanceof QuantitativeValue) { this.monoisotopicMolecularWeight((QuantitativeValue)value); return; }
      if ("monoisotopicMolecularWeights".equals(key) && value instanceof QuantitativeValue) { this.monoisotopicMolecularWeight((QuantitativeValue)value); return; }
      if ("monoisotopicMolecularWeight".equals(key) && value instanceof String) { this.monoisotopicMolecularWeight((String)value); return; }
      if ("monoisotopicMolecularWeights".equals(key) && value instanceof String) { this.monoisotopicMolecularWeight((String)value); return; }
      if ("chemicalRole".equals(key) && value instanceof DefinedTerm) { this.chemicalRole((DefinedTerm)value); return; }
      if ("chemicalRoles".equals(key) && value instanceof DefinedTerm) { this.chemicalRole((DefinedTerm)value); return; }
      if ("inChIKey".equals(key) && value instanceof HasRepresentation) { this.inChIKey((HasRepresentation)value); return; }
      if ("inChIKeys".equals(key) && value instanceof HasRepresentation) { this.inChIKey((HasRepresentation)value); return; }
      if ("molecularWeight".equals(key) && value instanceof QuantitativeValue) { this.molecularWeight((QuantitativeValue)value); return; }
      if ("molecularWeights".equals(key) && value instanceof QuantitativeValue) { this.molecularWeight((QuantitativeValue)value); return; }
      if ("molecularWeight".equals(key) && value instanceof String) { this.molecularWeight((String)value); return; }
      if ("molecularWeights".equals(key) && value instanceof String) { this.molecularWeight((String)value); return; }
      if ("molecularFormula".equals(key) && value instanceof String) { this.molecularFormula((String)value); return; }
      if ("molecularFormulas".equals(key) && value instanceof String) { this.molecularFormula((String)value); return; }
      if ("potentialUse".equals(key) && value instanceof DefinedTerm) { this.potentialUse((DefinedTerm)value); return; }
      if ("potentialUses".equals(key) && value instanceof DefinedTerm) { this.potentialUse((DefinedTerm)value); return; }
      if ("inChI".equals(key) && value instanceof HasRepresentation) { this.inChI((HasRepresentation)value); return; }
      if ("inChIs".equals(key) && value instanceof HasRepresentation) { this.inChI((HasRepresentation)value); return; }
      super.fromMap(key, value);
    }
  }
  
}
