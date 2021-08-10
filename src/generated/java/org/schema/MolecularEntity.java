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
 * Any constitutionally or isotopically distinct atom, molecule, ion, ion pair, radical, radical ion, complex, conformer etc., identifiable as a separately distinguishable entity.Source: http://bioschemas.org
 */
public class MolecularEntity extends BioChemEntity {
  /**
   * A specification in form of a line notation for describing the structure of chemical species using short ASCII strings.  Double bond stereochemistry \ indicators may need to be escaped in the string in formats where the backslash is an escape character.
   * @return smiles property set by first invocation of smiles method or {@code null}.
   */
  @JsonIgnore public HasRepresentation getSmiles() {
    return (HasRepresentation) getValue("smiles");
  }
  /**
   * A specification in form of a line notation for describing the structure of chemical species using short ASCII strings.  Double bond stereochemistry \ indicators may need to be escaped in the string in formats where the backslash is an escape character.
   * @return all smiles properties as {@link java.util.Collection} or an empty collection 
   * if smiles was not set.
   */
  @JsonIgnore public java.util.Collection<HasRepresentation> getSmiless() {
    final java.lang.Object current = myData.get("smiles");
    if (current == null) return Collections.emptyList();
    if (current instanceof java.util.Collection) {
      return (java.util.Collection<HasRepresentation>) current;
    }
    return Arrays.asList((HasRepresentation) current);
  }
  /**
   * Systematic method of naming chemical compounds as recommended by the International Union of Pure and Applied Chemistry (IUPAC).
   * @return iupacName property set by first invocation of iupacName method or {@code null}.
   */
  @JsonIgnore public String getIupacName() {
    return (String) getValue("iupacName");
  }
  /**
   * Systematic method of naming chemical compounds as recommended by the International Union of Pure and Applied Chemistry (IUPAC).
   * @return all iupacName properties as {@link java.util.Collection} or an empty collection 
   * if iupacName was not set.
   */
  @JsonIgnore public java.util.Collection<String> getIupacNames() {
    final java.lang.Object current = myData.get("iupacName");
    if (current == null) return Collections.emptyList();
    if (current instanceof java.util.Collection) {
      return (java.util.Collection<String>) current;
    }
    return Arrays.asList((String) current);
  }
  /**
   * The monoisotopic mass is the sum of the masses of the atoms in a molecule using the unbound, ground-state, rest mass of the principal (most abundant) isotope for each element instead of the isotopic average mass. Please include the units the form '&amp;lt;Number&amp;gt; &amp;lt;unit&amp;gt;', for example '770.230488 g/mol' or as '&amp;lt;QuantitativeValue&amp;gt;.
   * @return monoisotopicMolecularWeight property set by first invocation of monoisotopicMolecularWeight method or {@code null}.
   */
  @JsonIgnore public QuantitativeValue getMonoisotopicMolecularWeightQuantitativeValue() {
    return (QuantitativeValue) getValue("monoisotopicMolecularWeight");
  }
  /**
   * The monoisotopic mass is the sum of the masses of the atoms in a molecule using the unbound, ground-state, rest mass of the principal (most abundant) isotope for each element instead of the isotopic average mass. Please include the units the form '&amp;lt;Number&amp;gt; &amp;lt;unit&amp;gt;', for example '770.230488 g/mol' or as '&amp;lt;QuantitativeValue&amp;gt;.
   * @return all monoisotopicMolecularWeight properties as {@link java.util.Collection} or an empty collection 
   * if monoisotopicMolecularWeight was not set.
   */
  @JsonIgnore public java.util.Collection<QuantitativeValue> getMonoisotopicMolecularWeightQuantitativeValues() {
    final java.lang.Object current = myData.get("monoisotopicMolecularWeight");
    if (current == null) return Collections.emptyList();
    if (current instanceof java.util.Collection) {
      return (java.util.Collection<QuantitativeValue>) current;
    }
    return Arrays.asList((QuantitativeValue) current);
  }
  /**
   * The monoisotopic mass is the sum of the masses of the atoms in a molecule using the unbound, ground-state, rest mass of the principal (most abundant) isotope for each element instead of the isotopic average mass. Please include the units the form '&amp;lt;Number&amp;gt; &amp;lt;unit&amp;gt;', for example '770.230488 g/mol' or as '&amp;lt;QuantitativeValue&amp;gt;.
   * @return monoisotopicMolecularWeight property set by first invocation of monoisotopicMolecularWeight method or {@code null}.
   */
  @JsonIgnore public String getMonoisotopicMolecularWeightString() {
    return (String) getValue("monoisotopicMolecularWeight");
  }
  /**
   * The monoisotopic mass is the sum of the masses of the atoms in a molecule using the unbound, ground-state, rest mass of the principal (most abundant) isotope for each element instead of the isotopic average mass. Please include the units the form '&amp;lt;Number&amp;gt; &amp;lt;unit&amp;gt;', for example '770.230488 g/mol' or as '&amp;lt;QuantitativeValue&amp;gt;.
   * @return all monoisotopicMolecularWeight properties as {@link java.util.Collection} or an empty collection 
   * if monoisotopicMolecularWeight was not set.
   */
  @JsonIgnore public java.util.Collection<String> getMonoisotopicMolecularWeightStrings() {
    final java.lang.Object current = myData.get("monoisotopicMolecularWeight");
    if (current == null) return Collections.emptyList();
    if (current instanceof java.util.Collection) {
      return (java.util.Collection<String>) current;
    }
    return Arrays.asList((String) current);
  }
  /**
   * A role played by the BioChemEntity within a chemical context.
   * @return chemicalRole property set by first invocation of chemicalRole method or {@code null}.
   */
  @JsonIgnore public DefinedTerm getChemicalRole() {
    return (DefinedTerm) getValue("chemicalRole");
  }
  /**
   * A role played by the BioChemEntity within a chemical context.
   * @return all chemicalRole properties as {@link java.util.Collection} or an empty collection 
   * if chemicalRole was not set.
   */
  @JsonIgnore public java.util.Collection<DefinedTerm> getChemicalRoles() {
    final java.lang.Object current = myData.get("chemicalRole");
    if (current == null) return Collections.emptyList();
    if (current instanceof java.util.Collection) {
      return (java.util.Collection<DefinedTerm>) current;
    }
    return Arrays.asList((DefinedTerm) current);
  }
  /**
   * InChIKey is a hashed version of the full InChI (using the SHA-256 algorithm).
   * @return inChIKey property set by first invocation of inChIKey method or {@code null}.
   */
  @JsonIgnore public HasRepresentation getInChIKey() {
    return (HasRepresentation) getValue("inChIKey");
  }
  /**
   * InChIKey is a hashed version of the full InChI (using the SHA-256 algorithm).
   * @return all inChIKey properties as {@link java.util.Collection} or an empty collection 
   * if inChIKey was not set.
   */
  @JsonIgnore public java.util.Collection<HasRepresentation> getInChIKeys() {
    final java.lang.Object current = myData.get("inChIKey");
    if (current == null) return Collections.emptyList();
    if (current instanceof java.util.Collection) {
      return (java.util.Collection<HasRepresentation>) current;
    }
    return Arrays.asList((HasRepresentation) current);
  }
  /**
   * This is the molecular weight of the entity being described, not of the parent. Units should be included in the form '&amp;lt;Number&amp;gt; &amp;lt;unit&amp;gt;', for example '12 amu' or as '&amp;lt;QuantitativeValue&amp;gt;.
   * @return molecularWeight property set by first invocation of molecularWeight method or {@code null}.
   */
  @JsonIgnore public QuantitativeValue getMolecularWeightQuantitativeValue() {
    return (QuantitativeValue) getValue("molecularWeight");
  }
  /**
   * This is the molecular weight of the entity being described, not of the parent. Units should be included in the form '&amp;lt;Number&amp;gt; &amp;lt;unit&amp;gt;', for example '12 amu' or as '&amp;lt;QuantitativeValue&amp;gt;.
   * @return all molecularWeight properties as {@link java.util.Collection} or an empty collection 
   * if molecularWeight was not set.
   */
  @JsonIgnore public java.util.Collection<QuantitativeValue> getMolecularWeightQuantitativeValues() {
    final java.lang.Object current = myData.get("molecularWeight");
    if (current == null) return Collections.emptyList();
    if (current instanceof java.util.Collection) {
      return (java.util.Collection<QuantitativeValue>) current;
    }
    return Arrays.asList((QuantitativeValue) current);
  }
  /**
   * This is the molecular weight of the entity being described, not of the parent. Units should be included in the form '&amp;lt;Number&amp;gt; &amp;lt;unit&amp;gt;', for example '12 amu' or as '&amp;lt;QuantitativeValue&amp;gt;.
   * @return molecularWeight property set by first invocation of molecularWeight method or {@code null}.
   */
  @JsonIgnore public String getMolecularWeightString() {
    return (String) getValue("molecularWeight");
  }
  /**
   * This is the molecular weight of the entity being described, not of the parent. Units should be included in the form '&amp;lt;Number&amp;gt; &amp;lt;unit&amp;gt;', for example '12 amu' or as '&amp;lt;QuantitativeValue&amp;gt;.
   * @return all molecularWeight properties as {@link java.util.Collection} or an empty collection 
   * if molecularWeight was not set.
   */
  @JsonIgnore public java.util.Collection<String> getMolecularWeightStrings() {
    final java.lang.Object current = myData.get("molecularWeight");
    if (current == null) return Collections.emptyList();
    if (current instanceof java.util.Collection) {
      return (java.util.Collection<String>) current;
    }
    return Arrays.asList((String) current);
  }
  /**
   * The empirical formula is the simplest whole number ratio of all the atoms in a molecule.
   * @return molecularFormula property set by first invocation of molecularFormula method or {@code null}.
   */
  @JsonIgnore public String getMolecularFormula() {
    return (String) getValue("molecularFormula");
  }
  /**
   * The empirical formula is the simplest whole number ratio of all the atoms in a molecule.
   * @return all molecularFormula properties as {@link java.util.Collection} or an empty collection 
   * if molecularFormula was not set.
   */
  @JsonIgnore public java.util.Collection<String> getMolecularFormulas() {
    final java.lang.Object current = myData.get("molecularFormula");
    if (current == null) return Collections.emptyList();
    if (current instanceof java.util.Collection) {
      return (java.util.Collection<String>) current;
    }
    return Arrays.asList((String) current);
  }
  /**
   * Intended use of the BioChemEntity by humans.
   * @return potentialUse property set by first invocation of potentialUse method or {@code null}.
   */
  @JsonIgnore public DefinedTerm getPotentialUse() {
    return (DefinedTerm) getValue("potentialUse");
  }
  /**
   * Intended use of the BioChemEntity by humans.
   * @return all potentialUse properties as {@link java.util.Collection} or an empty collection 
   * if potentialUse was not set.
   */
  @JsonIgnore public java.util.Collection<DefinedTerm> getPotentialUses() {
    final java.lang.Object current = myData.get("potentialUse");
    if (current == null) return Collections.emptyList();
    if (current instanceof java.util.Collection) {
      return (java.util.Collection<DefinedTerm>) current;
    }
    return Arrays.asList((DefinedTerm) current);
  }
  /**
   * Non-proprietary identifier for molecular entity that can be used in printed and electronic data sources thus enabling easier linking of diverse data compilations.
   * @return inChI property set by first invocation of inChI method or {@code null}.
   */
  @JsonIgnore public HasRepresentation getInChI() {
    return (HasRepresentation) getValue("inChI");
  }
  /**
   * Non-proprietary identifier for molecular entity that can be used in printed and electronic data sources thus enabling easier linking of diverse data compilations.
   * @return all inChI properties as {@link java.util.Collection} or an empty collection 
   * if inChI was not set.
   */
  @JsonIgnore public java.util.Collection<HasRepresentation> getInChIs() {
    final java.lang.Object current = myData.get("inChI");
    if (current == null) return Collections.emptyList();
    if (current instanceof java.util.Collection) {
      return (java.util.Collection<HasRepresentation>) current;
    }
    return Arrays.asList((HasRepresentation) current);
  }
  protected MolecularEntity(java.util.Map<String,java.lang.Object> data) {
    super(data);
  }
  /**
   * @return new {@link Builder} initialized with this instance's data
   */
  @NotNull public Builder toBuilder() {
    return new Builder(new HashMap<>(this.myData));
  }
  
  /**
   * Builder for {@link MolecularEntity}
   */
  public static class Builder extends BioChemEntity.Builder {
    public Builder(@NotNull HashMap<String,java.lang.Object> data) {
      super(data);
    }
    @NotNull public MolecularEntity build() {
      return new MolecularEntity(myData);
    }
    /**
     * A specification in form of a line notation for describing the structure of chemical species using short ASCII strings.  Double bond stereochemistry \ indicators may need to be escaped in the string in formats where the backslash is an escape character.
     * @param hasRepresentation value to set
     * @return this builder instance
     */
    @NotNull public Builder smiles(@NotNull HasRepresentation hasRepresentation) {
      putValue("smiles", hasRepresentation);
      return this;
    }
    /**
     * Remove smiles property from the builder.
     * If this property is repeatable, all instances are removed.
     * @return this builder instance
     */
    @NotNull public Builder removeSmiles() {
      removeValue("smiles");
      return this;
    }
    /**
     * Get currently set value for smiles property in this builder.
     * @return previously set value or {@code null}. If multiple values have been 
     * set to this property, then {@link java.util.Collection} instance will be 
     * returned.
     */
    @Nullable public java.lang.Object getSmiles() {
      return myData.get("smiles");
    }
    /**
     * Systematic method of naming chemical compounds as recommended by the International Union of Pure and Applied Chemistry (IUPAC).
     * @param iupacName value to set
     * @return this builder instance
     */
    @NotNull public Builder iupacName(@NotNull String iupacName) {
      putValue("iupacName", iupacName);
      return this;
    }
    /**
     * Remove iupacName property from the builder.
     * If this property is repeatable, all instances are removed.
     * @return this builder instance
     */
    @NotNull public Builder removeIupacName() {
      removeValue("iupacName");
      return this;
    }
    /**
     * Get currently set value for iupacName property in this builder.
     * @return previously set value or {@code null}. If multiple values have been 
     * set to this property, then {@link java.util.Collection} instance will be 
     * returned.
     */
    @Nullable public java.lang.Object getIupacName() {
      return myData.get("iupacName");
    }
    /**
     * The monoisotopic mass is the sum of the masses of the atoms in a molecule using the unbound, ground-state, rest mass of the principal (most abundant) isotope for each element instead of the isotopic average mass. Please include the units the form '&amp;lt;Number&amp;gt; &amp;lt;unit&amp;gt;', for example '770.230488 g/mol' or as '&amp;lt;QuantitativeValue&amp;gt;.
     * @param quantitativeValue value to set
     * @return this builder instance
     */
    @NotNull public Builder monoisotopicMolecularWeight(@NotNull QuantitativeValue quantitativeValue) {
      putValue("monoisotopicMolecularWeight", quantitativeValue);
      return this;
    }
    /**
     * The monoisotopic mass is the sum of the masses of the atoms in a molecule using the unbound, ground-state, rest mass of the principal (most abundant) isotope for each element instead of the isotopic average mass. Please include the units the form '&amp;lt;Number&amp;gt; &amp;lt;unit&amp;gt;', for example '770.230488 g/mol' or as '&amp;lt;QuantitativeValue&amp;gt;.
     * @param quantitativeValue value to set
     * @return this builder instance
     */
    @NotNull public Builder monoisotopicMolecularWeight(@NotNull QuantitativeValue.Builder quantitativeValue) {
      putValue("monoisotopicMolecularWeight", quantitativeValue.build());
      return this;
    }
    /**
     * The monoisotopic mass is the sum of the masses of the atoms in a molecule using the unbound, ground-state, rest mass of the principal (most abundant) isotope for each element instead of the isotopic average mass. Please include the units the form '&amp;lt;Number&amp;gt; &amp;lt;unit&amp;gt;', for example '770.230488 g/mol' or as '&amp;lt;QuantitativeValue&amp;gt;.
     * @param monoisotopicMolecularWeight value to set
     * @return this builder instance
     */
    @NotNull public Builder monoisotopicMolecularWeight(@NotNull String monoisotopicMolecularWeight) {
      putValue("monoisotopicMolecularWeight", monoisotopicMolecularWeight);
      return this;
    }
    /**
     * Remove monoisotopicMolecularWeight property from the builder.
     * If this property is repeatable, all instances are removed.
     * @return this builder instance
     */
    @NotNull public Builder removeMonoisotopicMolecularWeight() {
      removeValue("monoisotopicMolecularWeight");
      return this;
    }
    /**
     * Get currently set value for monoisotopicMolecularWeight property in this builder.
     * @return previously set value or {@code null}. If multiple values have been 
     * set to this property, then {@link java.util.Collection} instance will be 
     * returned.
     */
    @Nullable public java.lang.Object getMonoisotopicMolecularWeight() {
      return myData.get("monoisotopicMolecularWeight");
    }
    /**
     * A role played by the BioChemEntity within a chemical context.
     * @param definedTerm value to set
     * @return this builder instance
     */
    @NotNull public Builder chemicalRole(@NotNull DefinedTerm definedTerm) {
      putValue("chemicalRole", definedTerm);
      return this;
    }
    /**
     * A role played by the BioChemEntity within a chemical context.
     * @param definedTerm value to set
     * @return this builder instance
     */
    @NotNull public Builder chemicalRole(@NotNull DefinedTerm.Builder definedTerm) {
      putValue("chemicalRole", definedTerm.build());
      return this;
    }
    /**
     * Remove chemicalRole property from the builder.
     * If this property is repeatable, all instances are removed.
     * @return this builder instance
     */
    @NotNull public Builder removeChemicalRole() {
      removeValue("chemicalRole");
      return this;
    }
    /**
     * Get currently set value for chemicalRole property in this builder.
     * @return previously set value or {@code null}. If multiple values have been 
     * set to this property, then {@link java.util.Collection} instance will be 
     * returned.
     */
    @Nullable public java.lang.Object getChemicalRole() {
      return myData.get("chemicalRole");
    }
    /**
     * InChIKey is a hashed version of the full InChI (using the SHA-256 algorithm).
     * @param hasRepresentation value to set
     * @return this builder instance
     */
    @NotNull public Builder inChIKey(@NotNull HasRepresentation hasRepresentation) {
      putValue("inChIKey", hasRepresentation);
      return this;
    }
    /**
     * Remove inChIKey property from the builder.
     * If this property is repeatable, all instances are removed.
     * @return this builder instance
     */
    @NotNull public Builder removeInChIKey() {
      removeValue("inChIKey");
      return this;
    }
    /**
     * Get currently set value for inChIKey property in this builder.
     * @return previously set value or {@code null}. If multiple values have been 
     * set to this property, then {@link java.util.Collection} instance will be 
     * returned.
     */
    @Nullable public java.lang.Object getInChIKey() {
      return myData.get("inChIKey");
    }
    /**
     * This is the molecular weight of the entity being described, not of the parent. Units should be included in the form '&amp;lt;Number&amp;gt; &amp;lt;unit&amp;gt;', for example '12 amu' or as '&amp;lt;QuantitativeValue&amp;gt;.
     * @param quantitativeValue value to set
     * @return this builder instance
     */
    @NotNull public Builder molecularWeight(@NotNull QuantitativeValue quantitativeValue) {
      putValue("molecularWeight", quantitativeValue);
      return this;
    }
    /**
     * This is the molecular weight of the entity being described, not of the parent. Units should be included in the form '&amp;lt;Number&amp;gt; &amp;lt;unit&amp;gt;', for example '12 amu' or as '&amp;lt;QuantitativeValue&amp;gt;.
     * @param quantitativeValue value to set
     * @return this builder instance
     */
    @NotNull public Builder molecularWeight(@NotNull QuantitativeValue.Builder quantitativeValue) {
      putValue("molecularWeight", quantitativeValue.build());
      return this;
    }
    /**
     * This is the molecular weight of the entity being described, not of the parent. Units should be included in the form '&amp;lt;Number&amp;gt; &amp;lt;unit&amp;gt;', for example '12 amu' or as '&amp;lt;QuantitativeValue&amp;gt;.
     * @param molecularWeight value to set
     * @return this builder instance
     */
    @NotNull public Builder molecularWeight(@NotNull String molecularWeight) {
      putValue("molecularWeight", molecularWeight);
      return this;
    }
    /**
     * Remove molecularWeight property from the builder.
     * If this property is repeatable, all instances are removed.
     * @return this builder instance
     */
    @NotNull public Builder removeMolecularWeight() {
      removeValue("molecularWeight");
      return this;
    }
    /**
     * Get currently set value for molecularWeight property in this builder.
     * @return previously set value or {@code null}. If multiple values have been 
     * set to this property, then {@link java.util.Collection} instance will be 
     * returned.
     */
    @Nullable public java.lang.Object getMolecularWeight() {
      return myData.get("molecularWeight");
    }
    /**
     * The empirical formula is the simplest whole number ratio of all the atoms in a molecule.
     * @param molecularFormula value to set
     * @return this builder instance
     */
    @NotNull public Builder molecularFormula(@NotNull String molecularFormula) {
      putValue("molecularFormula", molecularFormula);
      return this;
    }
    /**
     * Remove molecularFormula property from the builder.
     * If this property is repeatable, all instances are removed.
     * @return this builder instance
     */
    @NotNull public Builder removeMolecularFormula() {
      removeValue("molecularFormula");
      return this;
    }
    /**
     * Get currently set value for molecularFormula property in this builder.
     * @return previously set value or {@code null}. If multiple values have been 
     * set to this property, then {@link java.util.Collection} instance will be 
     * returned.
     */
    @Nullable public java.lang.Object getMolecularFormula() {
      return myData.get("molecularFormula");
    }
    /**
     * Intended use of the BioChemEntity by humans.
     * @param definedTerm value to set
     * @return this builder instance
     */
    @NotNull public Builder potentialUse(@NotNull DefinedTerm definedTerm) {
      putValue("potentialUse", definedTerm);
      return this;
    }
    /**
     * Intended use of the BioChemEntity by humans.
     * @param definedTerm value to set
     * @return this builder instance
     */
    @NotNull public Builder potentialUse(@NotNull DefinedTerm.Builder definedTerm) {
      putValue("potentialUse", definedTerm.build());
      return this;
    }
    /**
     * Remove potentialUse property from the builder.
     * If this property is repeatable, all instances are removed.
     * @return this builder instance
     */
    @NotNull public Builder removePotentialUse() {
      removeValue("potentialUse");
      return this;
    }
    /**
     * Get currently set value for potentialUse property in this builder.
     * @return previously set value or {@code null}. If multiple values have been 
     * set to this property, then {@link java.util.Collection} instance will be 
     * returned.
     */
    @Nullable public java.lang.Object getPotentialUse() {
      return myData.get("potentialUse");
    }
    /**
     * Non-proprietary identifier for molecular entity that can be used in printed and electronic data sources thus enabling easier linking of diverse data compilations.
     * @param hasRepresentation value to set
     * @return this builder instance
     */
    @NotNull public Builder inChI(@NotNull HasRepresentation hasRepresentation) {
      putValue("inChI", hasRepresentation);
      return this;
    }
    /**
     * Remove inChI property from the builder.
     * If this property is repeatable, all instances are removed.
     * @return this builder instance
     */
    @NotNull public Builder removeInChI() {
      removeValue("inChI");
      return this;
    }
    /**
     * Get currently set value for inChI property in this builder.
     * @return previously set value or {@code null}. If multiple values have been 
     * set to this property, then {@link java.util.Collection} instance will be 
     * returned.
     */
    @Nullable public java.lang.Object getInChI() {
      return myData.get("inChI");
    }
    /**
     * A similar BioChemEntity, e.g., obtained by fingerprint similarity algorithms.
     * @param bioChemEntity value to set
     * @return this builder instance
     */
    @NotNull public Builder bioChemSimilarity(@NotNull BioChemEntity bioChemEntity) {
      putValue("bioChemSimilarity", bioChemEntity);
      return this;
    }
    /**
     * A similar BioChemEntity, e.g., obtained by fingerprint similarity algorithms.
     * @param bioChemEntity value to set
     * @return this builder instance
     */
    @NotNull public Builder bioChemSimilarity(@NotNull BioChemEntity.Builder bioChemEntity) {
      putValue("bioChemSimilarity", bioChemEntity.build());
      return this;
    }
    /**
     * Remove bioChemSimilarity property from the builder.
     * If this property is repeatable, all instances are removed.
     * @return this builder instance
     */
    @NotNull public Builder removeBioChemSimilarity() {
      removeValue("bioChemSimilarity");
      return this;
    }
    /**
     * Get currently set value for bioChemSimilarity property in this builder.
     * @return previously set value or {@code null}. If multiple values have been 
     * set to this property, then {@link java.util.Collection} instance will be 
     * returned.
     */
    @Nullable public java.lang.Object getBioChemSimilarity() {
      return myData.get("bioChemSimilarity");
    }
    /**
     * A common representation such as a protein sequence or chemical structure for this entity. For images use schema.org/image.
     * @param hasRepresentation value to set
     * @return this builder instance
     */
    @NotNull public Builder hasRepresentation(@NotNull HasRepresentation hasRepresentation) {
      putValue("hasRepresentation", hasRepresentation);
      return this;
    }
    /**
     * Remove hasRepresentation property from the builder.
     * If this property is repeatable, all instances are removed.
     * @return this builder instance
     */
    @NotNull public Builder removeHasRepresentation() {
      removeValue("hasRepresentation");
      return this;
    }
    /**
     * Get currently set value for hasRepresentation property in this builder.
     * @return previously set value or {@code null}. If multiple values have been 
     * set to this property, then {@link java.util.Collection} instance will be 
     * returned.
     */
    @Nullable public java.lang.Object getHasRepresentation() {
      return myData.get("hasRepresentation");
    }
    /**
     * Molecular function performed by this BioChemEntity; please use PropertyValue if you want to include any evidence.
     * @param definedTerm value to set
     * @return this builder instance
     */
    @NotNull public Builder hasMolecularFunction(@NotNull DefinedTerm definedTerm) {
      putValue("hasMolecularFunction", definedTerm);
      return this;
    }
    /**
     * Molecular function performed by this BioChemEntity; please use PropertyValue if you want to include any evidence.
     * @param definedTerm value to set
     * @return this builder instance
     */
    @NotNull public Builder hasMolecularFunction(@NotNull DefinedTerm.Builder definedTerm) {
      putValue("hasMolecularFunction", definedTerm.build());
      return this;
    }
    /**
     * Molecular function performed by this BioChemEntity; please use PropertyValue if you want to include any evidence.
     * @param propertyValue value to set
     * @return this builder instance
     */
    @NotNull public Builder hasMolecularFunction(@NotNull PropertyValue propertyValue) {
      putValue("hasMolecularFunction", propertyValue);
      return this;
    }
    /**
     * Molecular function performed by this BioChemEntity; please use PropertyValue if you want to include any evidence.
     * @param propertyValue value to set
     * @return this builder instance
     */
    @NotNull public Builder hasMolecularFunction(@NotNull PropertyValue.Builder propertyValue) {
      putValue("hasMolecularFunction", propertyValue.build());
      return this;
    }
    /**
     * Molecular function performed by this BioChemEntity; please use PropertyValue if you want to include any evidence.
     * @param hasMolecularFunction value to set
     * @return this builder instance
     */
    @NotNull public Builder hasMolecularFunction(@NotNull String hasMolecularFunction) {
      putValue("hasMolecularFunction", hasMolecularFunction);
      return this;
    }
    /**
     * Remove hasMolecularFunction property from the builder.
     * If this property is repeatable, all instances are removed.
     * @return this builder instance
     */
    @NotNull public Builder removeHasMolecularFunction() {
      removeValue("hasMolecularFunction");
      return this;
    }
    /**
     * Get currently set value for hasMolecularFunction property in this builder.
     * @return previously set value or {@code null}. If multiple values have been 
     * set to this property, then {@link java.util.Collection} instance will be 
     * returned.
     */
    @Nullable public java.lang.Object getHasMolecularFunction() {
      return myData.get("hasMolecularFunction");
    }
    /**
     * A role played by the BioChemEntity within a biological context.
     * @param definedTerm value to set
     * @return this builder instance
     */
    @NotNull public Builder biologicalRole(@NotNull DefinedTerm definedTerm) {
      putValue("biologicalRole", definedTerm);
      return this;
    }
    /**
     * A role played by the BioChemEntity within a biological context.
     * @param definedTerm value to set
     * @return this builder instance
     */
    @NotNull public Builder biologicalRole(@NotNull DefinedTerm.Builder definedTerm) {
      putValue("biologicalRole", definedTerm.build());
      return this;
    }
    /**
     * Remove biologicalRole property from the builder.
     * If this property is repeatable, all instances are removed.
     * @return this builder instance
     */
    @NotNull public Builder removeBiologicalRole() {
      removeValue("biologicalRole");
      return this;
    }
    /**
     * Get currently set value for biologicalRole property in this builder.
     * @return previously set value or {@code null}. If multiple values have been 
     * set to this property, then {@link java.util.Collection} instance will be 
     * returned.
     */
    @Nullable public java.lang.Object getBiologicalRole() {
      return myData.get("biologicalRole");
    }
    /**
     * A BioChemEntity that is known to interact with this item.
     * @param bioChemEntity value to set
     * @return this builder instance
     */
    @NotNull public Builder bioChemInteraction(@NotNull BioChemEntity bioChemEntity) {
      putValue("bioChemInteraction", bioChemEntity);
      return this;
    }
    /**
     * A BioChemEntity that is known to interact with this item.
     * @param bioChemEntity value to set
     * @return this builder instance
     */
    @NotNull public Builder bioChemInteraction(@NotNull BioChemEntity.Builder bioChemEntity) {
      putValue("bioChemInteraction", bioChemEntity.build());
      return this;
    }
    /**
     * Remove bioChemInteraction property from the builder.
     * If this property is repeatable, all instances are removed.
     * @return this builder instance
     */
    @NotNull public Builder removeBioChemInteraction() {
      removeValue("bioChemInteraction");
      return this;
    }
    /**
     * Get currently set value for bioChemInteraction property in this builder.
     * @return previously set value or {@code null}. If multiple values have been 
     * set to this property, then {@link java.util.Collection} instance will be 
     * returned.
     */
    @Nullable public java.lang.Object getBioChemInteraction() {
      return myData.get("bioChemInteraction");
    }
    /**
     * Biological process this BioChemEntity is involved in; please use PropertyValue if you want to include any evidence.
     * @param definedTerm value to set
     * @return this builder instance
     */
    @NotNull public Builder isInvolvedInBiologicalProcess(@NotNull DefinedTerm definedTerm) {
      putValue("isInvolvedInBiologicalProcess", definedTerm);
      return this;
    }
    /**
     * Biological process this BioChemEntity is involved in; please use PropertyValue if you want to include any evidence.
     * @param definedTerm value to set
     * @return this builder instance
     */
    @NotNull public Builder isInvolvedInBiologicalProcess(@NotNull DefinedTerm.Builder definedTerm) {
      putValue("isInvolvedInBiologicalProcess", definedTerm.build());
      return this;
    }
    /**
     * Biological process this BioChemEntity is involved in; please use PropertyValue if you want to include any evidence.
     * @param propertyValue value to set
     * @return this builder instance
     */
    @NotNull public Builder isInvolvedInBiologicalProcess(@NotNull PropertyValue propertyValue) {
      putValue("isInvolvedInBiologicalProcess", propertyValue);
      return this;
    }
    /**
     * Biological process this BioChemEntity is involved in; please use PropertyValue if you want to include any evidence.
     * @param propertyValue value to set
     * @return this builder instance
     */
    @NotNull public Builder isInvolvedInBiologicalProcess(@NotNull PropertyValue.Builder propertyValue) {
      putValue("isInvolvedInBiologicalProcess", propertyValue.build());
      return this;
    }
    /**
     * Biological process this BioChemEntity is involved in; please use PropertyValue if you want to include any evidence.
     * @param isInvolvedInBiologicalProcess value to set
     * @return this builder instance
     */
    @NotNull public Builder isInvolvedInBiologicalProcess(@NotNull String isInvolvedInBiologicalProcess) {
      putValue("isInvolvedInBiologicalProcess", isInvolvedInBiologicalProcess);
      return this;
    }
    /**
     * Remove isInvolvedInBiologicalProcess property from the builder.
     * If this property is repeatable, all instances are removed.
     * @return this builder instance
     */
    @NotNull public Builder removeIsInvolvedInBiologicalProcess() {
      removeValue("isInvolvedInBiologicalProcess");
      return this;
    }
    /**
     * Get currently set value for isInvolvedInBiologicalProcess property in this builder.
     * @return previously set value or {@code null}. If multiple values have been 
     * set to this property, then {@link java.util.Collection} instance will be 
     * returned.
     */
    @Nullable public java.lang.Object getIsInvolvedInBiologicalProcess() {
      return myData.get("isInvolvedInBiologicalProcess");
    }
    /**
     * Subcellular location where this BioChemEntity is located; please use PropertyValue if you want to include any evidence.
     * @param definedTerm value to set
     * @return this builder instance
     */
    @NotNull public Builder isLocatedInSubcellularLocation(@NotNull DefinedTerm definedTerm) {
      putValue("isLocatedInSubcellularLocation", definedTerm);
      return this;
    }
    /**
     * Subcellular location where this BioChemEntity is located; please use PropertyValue if you want to include any evidence.
     * @param definedTerm value to set
     * @return this builder instance
     */
    @NotNull public Builder isLocatedInSubcellularLocation(@NotNull DefinedTerm.Builder definedTerm) {
      putValue("isLocatedInSubcellularLocation", definedTerm.build());
      return this;
    }
    /**
     * Subcellular location where this BioChemEntity is located; please use PropertyValue if you want to include any evidence.
     * @param propertyValue value to set
     * @return this builder instance
     */
    @NotNull public Builder isLocatedInSubcellularLocation(@NotNull PropertyValue propertyValue) {
      putValue("isLocatedInSubcellularLocation", propertyValue);
      return this;
    }
    /**
     * Subcellular location where this BioChemEntity is located; please use PropertyValue if you want to include any evidence.
     * @param propertyValue value to set
     * @return this builder instance
     */
    @NotNull public Builder isLocatedInSubcellularLocation(@NotNull PropertyValue.Builder propertyValue) {
      putValue("isLocatedInSubcellularLocation", propertyValue.build());
      return this;
    }
    /**
     * Subcellular location where this BioChemEntity is located; please use PropertyValue if you want to include any evidence.
     * @param isLocatedInSubcellularLocation value to set
     * @return this builder instance
     */
    @NotNull public Builder isLocatedInSubcellularLocation(@NotNull String isLocatedInSubcellularLocation) {
      putValue("isLocatedInSubcellularLocation", isLocatedInSubcellularLocation);
      return this;
    }
    /**
     * Remove isLocatedInSubcellularLocation property from the builder.
     * If this property is repeatable, all instances are removed.
     * @return this builder instance
     */
    @NotNull public Builder removeIsLocatedInSubcellularLocation() {
      removeValue("isLocatedInSubcellularLocation");
      return this;
    }
    /**
     * Get currently set value for isLocatedInSubcellularLocation property in this builder.
     * @return previously set value or {@code null}. If multiple values have been 
     * set to this property, then {@link java.util.Collection} instance will be 
     * returned.
     */
    @Nullable public java.lang.Object getIsLocatedInSubcellularLocation() {
      return myData.get("isLocatedInSubcellularLocation");
    }
    /**
     * The taxonomic grouping of the organism that expresses, encodes, or in someway related to the BioChemEntity.
     * @param definedTerm value to set
     * @return this builder instance
     */
    @NotNull public Builder taxonomicRange(@NotNull DefinedTerm definedTerm) {
      putValue("taxonomicRange", definedTerm);
      return this;
    }
    /**
     * The taxonomic grouping of the organism that expresses, encodes, or in someway related to the BioChemEntity.
     * @param definedTerm value to set
     * @return this builder instance
     */
    @NotNull public Builder taxonomicRange(@NotNull DefinedTerm.Builder definedTerm) {
      putValue("taxonomicRange", definedTerm.build());
      return this;
    }
    /**
     * The taxonomic grouping of the organism that expresses, encodes, or in someway related to the BioChemEntity.
     * @param taxonomicRange value to set
     * @return this builder instance
     */
    @NotNull public Builder taxonomicRange(@NotNull String taxonomicRange) {
      putValue("taxonomicRange", taxonomicRange);
      return this;
    }
    /**
     * The taxonomic grouping of the organism that expresses, encodes, or in someway related to the BioChemEntity.
     * @param taxon value to set
     * @return this builder instance
     */
    @NotNull public Builder taxonomicRange(@NotNull Taxon taxon) {
      putValue("taxonomicRange", taxon);
      return this;
    }
    /**
     * The taxonomic grouping of the organism that expresses, encodes, or in someway related to the BioChemEntity.
     * @param taxon value to set
     * @return this builder instance
     */
    @NotNull public Builder taxonomicRange(@NotNull Taxon.Builder taxon) {
      putValue("taxonomicRange", taxon.build());
      return this;
    }
    /**
     * Remove taxonomicRange property from the builder.
     * If this property is repeatable, all instances are removed.
     * @return this builder instance
     */
    @NotNull public Builder removeTaxonomicRange() {
      removeValue("taxonomicRange");
      return this;
    }
    /**
     * Get currently set value for taxonomicRange property in this builder.
     * @return previously set value or {@code null}. If multiple values have been 
     * set to this property, then {@link java.util.Collection} instance will be 
     * returned.
     */
    @Nullable public java.lang.Object getTaxonomicRange() {
      return myData.get("taxonomicRange");
    }
    /**
     * Disease associated to this BioChemEntity. Such disease can be a MedicalCondition or a URL. If you want to add an evidence supporting the association, please use PropertyValue.
     * @param medicalCondition value to set
     * @return this builder instance
     */
    @NotNull public Builder associatedDisease(@NotNull MedicalCondition medicalCondition) {
      putValue("associatedDisease", medicalCondition);
      return this;
    }
    /**
     * Disease associated to this BioChemEntity. Such disease can be a MedicalCondition or a URL. If you want to add an evidence supporting the association, please use PropertyValue.
     * @param medicalCondition value to set
     * @return this builder instance
     */
    @NotNull public Builder associatedDisease(@NotNull MedicalCondition.Builder medicalCondition) {
      putValue("associatedDisease", medicalCondition.build());
      return this;
    }
    /**
     * Disease associated to this BioChemEntity. Such disease can be a MedicalCondition or a URL. If you want to add an evidence supporting the association, please use PropertyValue.
     * @param propertyValue value to set
     * @return this builder instance
     */
    @NotNull public Builder associatedDisease(@NotNull PropertyValue propertyValue) {
      putValue("associatedDisease", propertyValue);
      return this;
    }
    /**
     * Disease associated to this BioChemEntity. Such disease can be a MedicalCondition or a URL. If you want to add an evidence supporting the association, please use PropertyValue.
     * @param propertyValue value to set
     * @return this builder instance
     */
    @NotNull public Builder associatedDisease(@NotNull PropertyValue.Builder propertyValue) {
      putValue("associatedDisease", propertyValue.build());
      return this;
    }
    /**
     * Disease associated to this BioChemEntity. Such disease can be a MedicalCondition or a URL. If you want to add an evidence supporting the association, please use PropertyValue.
     * @param associatedDisease value to set
     * @return this builder instance
     */
    @NotNull public Builder associatedDisease(@NotNull String associatedDisease) {
      putValue("associatedDisease", associatedDisease);
      return this;
    }
    /**
     * Remove associatedDisease property from the builder.
     * If this property is repeatable, all instances are removed.
     * @return this builder instance
     */
    @NotNull public Builder removeAssociatedDisease() {
      removeValue("associatedDisease");
      return this;
    }
    /**
     * Get currently set value for associatedDisease property in this builder.
     * @return previously set value or {@code null}. If multiple values have been 
     * set to this property, then {@link java.util.Collection} instance will be 
     * returned.
     */
    @Nullable public java.lang.Object getAssociatedDisease() {
      return myData.get("associatedDisease");
    }
    /**
     * Another BioChemEntity encoding by this one.
     * @param gene value to set
     * @return this builder instance
     */
    @NotNull public Builder isEncodedByBioChemEntity(@NotNull Gene gene) {
      putValue("isEncodedByBioChemEntity", gene);
      return this;
    }
    /**
     * Another BioChemEntity encoding by this one.
     * @param gene value to set
     * @return this builder instance
     */
    @NotNull public Builder isEncodedByBioChemEntity(@NotNull Gene.Builder gene) {
      putValue("isEncodedByBioChemEntity", gene.build());
      return this;
    }
    /**
     * Remove isEncodedByBioChemEntity property from the builder.
     * If this property is repeatable, all instances are removed.
     * @return this builder instance
     */
    @NotNull public Builder removeIsEncodedByBioChemEntity() {
      removeValue("isEncodedByBioChemEntity");
      return this;
    }
    /**
     * Get currently set value for isEncodedByBioChemEntity property in this builder.
     * @return previously set value or {@code null}. If multiple values have been 
     * set to this property, then {@link java.util.Collection} instance will be 
     * returned.
     */
    @Nullable public java.lang.Object getIsEncodedByBioChemEntity() {
      return myData.get("isEncodedByBioChemEntity");
    }
    /**
     * Indicates a BioChemEntity that is (in some sense) a part of this BioChemEntity. 
     * @param bioChemEntity value to set
     * @return this builder instance
     */
    @NotNull public Builder isPartOfBioChemEntity(@NotNull BioChemEntity bioChemEntity) {
      putValue("isPartOfBioChemEntity", bioChemEntity);
      return this;
    }
    /**
     * Indicates a BioChemEntity that is (in some sense) a part of this BioChemEntity. 
     * @param bioChemEntity value to set
     * @return this builder instance
     */
    @NotNull public Builder isPartOfBioChemEntity(@NotNull BioChemEntity.Builder bioChemEntity) {
      putValue("isPartOfBioChemEntity", bioChemEntity.build());
      return this;
    }
    /**
     * Remove isPartOfBioChemEntity property from the builder.
     * If this property is repeatable, all instances are removed.
     * @return this builder instance
     */
    @NotNull public Builder removeIsPartOfBioChemEntity() {
      removeValue("isPartOfBioChemEntity");
      return this;
    }
    /**
     * Get currently set value for isPartOfBioChemEntity property in this builder.
     * @return previously set value or {@code null}. If multiple values have been 
     * set to this property, then {@link java.util.Collection} instance will be 
     * returned.
     */
    @Nullable public java.lang.Object getIsPartOfBioChemEntity() {
      return myData.get("isPartOfBioChemEntity");
    }
    /**
     * Indicates a BioChemEntity that (in some sense) has this BioChemEntity as a part. 
     * @param bioChemEntity value to set
     * @return this builder instance
     */
    @NotNull public Builder hasBioChemEntityPart(@NotNull BioChemEntity bioChemEntity) {
      putValue("hasBioChemEntityPart", bioChemEntity);
      return this;
    }
    /**
     * Indicates a BioChemEntity that (in some sense) has this BioChemEntity as a part. 
     * @param bioChemEntity value to set
     * @return this builder instance
     */
    @NotNull public Builder hasBioChemEntityPart(@NotNull BioChemEntity.Builder bioChemEntity) {
      putValue("hasBioChemEntityPart", bioChemEntity.build());
      return this;
    }
    /**
     * Remove hasBioChemEntityPart property from the builder.
     * If this property is repeatable, all instances are removed.
     * @return this builder instance
     */
    @NotNull public Builder removeHasBioChemEntityPart() {
      removeValue("hasBioChemEntityPart");
      return this;
    }
    /**
     * Get currently set value for hasBioChemEntityPart property in this builder.
     * @return previously set value or {@code null}. If multiple values have been 
     * set to this property, then {@link java.util.Collection} instance will be 
     * returned.
     */
    @Nullable public java.lang.Object getHasBioChemEntityPart() {
      return myData.get("hasBioChemEntityPart");
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
