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
 * A discrete unit of inheritance which affects one or more biological traits (Source: [https://en.wikipedia.org/wiki/Gene](https://en.wikipedia.org/wiki/Gene)). Examples include FOXP2 (Forkhead box protein P2), SCARNA21 (small Cajal body-specific RNA 21), A- (agouti genotype).Source: http://bioschemas.org
 */
public class Gene extends BioChemEntity {
  /**
   * Another gene which is a variation of this one.
   */
  @JsonIgnore public Gene getAlternativeOf() {
    return (Gene) getValue("alternativeOf");
  }
  /**
   * Another gene which is a variation of this one.
   */
  @JsonIgnore public java.util.Collection<Gene> getAlternativeOfs() {
    final java.lang.Object current = myData.get("alternativeOf");
    if (current == null) return Collections.emptyList();
    if (current instanceof java.util.Collection) {
      return (java.util.Collection<Gene>) current;
    }
    return Arrays.asList((Gene) current);
  }
  /**
   * Tissue, organ, biological sample, etc in which activity of this gene has been observed experimentally. For example brain, digestive system.
   */
  @JsonIgnore public AnatomicalStructure getExpressedInAnatomicalStructure() {
    return (AnatomicalStructure) getValue("expressedIn");
  }
  /**
   * Tissue, organ, biological sample, etc in which activity of this gene has been observed experimentally. For example brain, digestive system.
   */
  @JsonIgnore public java.util.Collection<AnatomicalStructure> getExpressedInAnatomicalStructures() {
    final java.lang.Object current = myData.get("expressedIn");
    if (current == null) return Collections.emptyList();
    if (current instanceof java.util.Collection) {
      return (java.util.Collection<AnatomicalStructure>) current;
    }
    return Arrays.asList((AnatomicalStructure) current);
  }
  /**
   * Tissue, organ, biological sample, etc in which activity of this gene has been observed experimentally. For example brain, digestive system.
   */
  @JsonIgnore public AnatomicalSystem getExpressedInAnatomicalSystem() {
    return (AnatomicalSystem) getValue("expressedIn");
  }
  /**
   * Tissue, organ, biological sample, etc in which activity of this gene has been observed experimentally. For example brain, digestive system.
   */
  @JsonIgnore public java.util.Collection<AnatomicalSystem> getExpressedInAnatomicalSystems() {
    final java.lang.Object current = myData.get("expressedIn");
    if (current == null) return Collections.emptyList();
    if (current instanceof java.util.Collection) {
      return (java.util.Collection<AnatomicalSystem>) current;
    }
    return Arrays.asList((AnatomicalSystem) current);
  }
  /**
   * Tissue, organ, biological sample, etc in which activity of this gene has been observed experimentally. For example brain, digestive system.
   */
  @JsonIgnore public BioChemEntity getExpressedInBioChemEntity() {
    return (BioChemEntity) getValue("expressedIn");
  }
  /**
   * Tissue, organ, biological sample, etc in which activity of this gene has been observed experimentally. For example brain, digestive system.
   */
  @JsonIgnore public java.util.Collection<BioChemEntity> getExpressedInBioChemEntitys() {
    final java.lang.Object current = myData.get("expressedIn");
    if (current == null) return Collections.emptyList();
    if (current instanceof java.util.Collection) {
      return (java.util.Collection<BioChemEntity>) current;
    }
    return Arrays.asList((BioChemEntity) current);
  }
  /**
   * Tissue, organ, biological sample, etc in which activity of this gene has been observed experimentally. For example brain, digestive system.
   */
  @JsonIgnore public DefinedTerm getExpressedInDefinedTerm() {
    return (DefinedTerm) getValue("expressedIn");
  }
  /**
   * Tissue, organ, biological sample, etc in which activity of this gene has been observed experimentally. For example brain, digestive system.
   */
  @JsonIgnore public java.util.Collection<DefinedTerm> getExpressedInDefinedTerms() {
    final java.lang.Object current = myData.get("expressedIn");
    if (current == null) return Collections.emptyList();
    if (current instanceof java.util.Collection) {
      return (java.util.Collection<DefinedTerm>) current;
    }
    return Arrays.asList((DefinedTerm) current);
  }
  /**
   * A symbolic representation of a BioChemEnity. For example, a nucleotide sequence of a Gene or an amino acid sequence of a Protein.
   */
  @JsonIgnore public HasRepresentation getHasBioPolymerSequence() {
    return (HasRepresentation) getValue("hasBioPolymerSequence");
  }
  /**
   * A symbolic representation of a BioChemEnity. For example, a nucleotide sequence of a Gene or an amino acid sequence of a Protein.
   */
  @JsonIgnore public java.util.Collection<HasRepresentation> getHasBioPolymerSequences() {
    final java.lang.Object current = myData.get("hasBioPolymerSequence");
    if (current == null) return Collections.emptyList();
    if (current instanceof java.util.Collection) {
      return (java.util.Collection<HasRepresentation>) current;
    }
    return Arrays.asList((HasRepresentation) current);
  }
  /**
   * Another BioChemEntity encoded by this one. 
   */
  @JsonIgnore public BioChemEntity getEncodesBioChemEntity() {
    return (BioChemEntity) getValue("encodesBioChemEntity");
  }
  /**
   * Another BioChemEntity encoded by this one. 
   */
  @JsonIgnore public java.util.Collection<BioChemEntity> getEncodesBioChemEntitys() {
    final java.lang.Object current = myData.get("encodesBioChemEntity");
    if (current == null) return Collections.emptyList();
    if (current instanceof java.util.Collection) {
      return (java.util.Collection<BioChemEntity>) current;
    }
    return Arrays.asList((BioChemEntity) current);
  }
  protected Gene(java.util.Map<String,java.lang.Object> data) {
    super(data);
  }
  
  /**
   * Builder for {@link Gene}
   */
  public static class Builder extends BioChemEntity.Builder {
    public Builder(@NotNull HashMap<String,java.lang.Object> data) {
      super(data);
    }
    @NotNull public Gene build() {
      return new Gene(myData);
    }
    /**
     * Another gene which is a variation of this one.
     */
    @NotNull public Builder alternativeOf(@NotNull Gene gene) {
      putValue("alternativeOf", gene);
      return this;
    }
    /**
     * Another gene which is a variation of this one.
     */
    @NotNull public Builder alternativeOf(@NotNull Gene.Builder gene) {
      putValue("alternativeOf", gene.build());
      return this;
    }
    /**
     * Tissue, organ, biological sample, etc in which activity of this gene has been observed experimentally. For example brain, digestive system.
     */
    @NotNull public Builder expressedIn(@NotNull AnatomicalStructure anatomicalStructure) {
      putValue("expressedIn", anatomicalStructure);
      return this;
    }
    /**
     * Tissue, organ, biological sample, etc in which activity of this gene has been observed experimentally. For example brain, digestive system.
     */
    @NotNull public Builder expressedIn(@NotNull AnatomicalStructure.Builder anatomicalStructure) {
      putValue("expressedIn", anatomicalStructure.build());
      return this;
    }
    /**
     * Tissue, organ, biological sample, etc in which activity of this gene has been observed experimentally. For example brain, digestive system.
     */
    @NotNull public Builder expressedIn(@NotNull AnatomicalSystem anatomicalSystem) {
      putValue("expressedIn", anatomicalSystem);
      return this;
    }
    /**
     * Tissue, organ, biological sample, etc in which activity of this gene has been observed experimentally. For example brain, digestive system.
     */
    @NotNull public Builder expressedIn(@NotNull AnatomicalSystem.Builder anatomicalSystem) {
      putValue("expressedIn", anatomicalSystem.build());
      return this;
    }
    /**
     * Tissue, organ, biological sample, etc in which activity of this gene has been observed experimentally. For example brain, digestive system.
     */
    @NotNull public Builder expressedIn(@NotNull BioChemEntity bioChemEntity) {
      putValue("expressedIn", bioChemEntity);
      return this;
    }
    /**
     * Tissue, organ, biological sample, etc in which activity of this gene has been observed experimentally. For example brain, digestive system.
     */
    @NotNull public Builder expressedIn(@NotNull BioChemEntity.Builder bioChemEntity) {
      putValue("expressedIn", bioChemEntity.build());
      return this;
    }
    /**
     * Tissue, organ, biological sample, etc in which activity of this gene has been observed experimentally. For example brain, digestive system.
     */
    @NotNull public Builder expressedIn(@NotNull DefinedTerm definedTerm) {
      putValue("expressedIn", definedTerm);
      return this;
    }
    /**
     * Tissue, organ, biological sample, etc in which activity of this gene has been observed experimentally. For example brain, digestive system.
     */
    @NotNull public Builder expressedIn(@NotNull DefinedTerm.Builder definedTerm) {
      putValue("expressedIn", definedTerm.build());
      return this;
    }
    /**
     * A symbolic representation of a BioChemEnity. For example, a nucleotide sequence of a Gene or an amino acid sequence of a Protein.
     */
    @NotNull public Builder hasBioPolymerSequence(@NotNull HasRepresentation hasRepresentation) {
      putValue("hasBioPolymerSequence", hasRepresentation);
      return this;
    }
    /**
     * Another BioChemEntity encoded by this one. 
     */
    @NotNull public Builder encodesBioChemEntity(@NotNull BioChemEntity bioChemEntity) {
      putValue("encodesBioChemEntity", bioChemEntity);
      return this;
    }
    /**
     * Another BioChemEntity encoded by this one. 
     */
    @NotNull public Builder encodesBioChemEntity(@NotNull BioChemEntity.Builder bioChemEntity) {
      putValue("encodesBioChemEntity", bioChemEntity.build());
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
      if ("alternativeOf".equals(key) && value instanceof Gene) { this.alternativeOf((Gene)value); return; }
      if ("alternativeOfs".equals(key) && value instanceof Gene) { this.alternativeOf((Gene)value); return; }
      if ("expressedIn".equals(key) && value instanceof AnatomicalStructure) { this.expressedIn((AnatomicalStructure)value); return; }
      if ("expressedIns".equals(key) && value instanceof AnatomicalStructure) { this.expressedIn((AnatomicalStructure)value); return; }
      if ("expressedIn".equals(key) && value instanceof AnatomicalSystem) { this.expressedIn((AnatomicalSystem)value); return; }
      if ("expressedIns".equals(key) && value instanceof AnatomicalSystem) { this.expressedIn((AnatomicalSystem)value); return; }
      if ("expressedIn".equals(key) && value instanceof BioChemEntity) { this.expressedIn((BioChemEntity)value); return; }
      if ("expressedIns".equals(key) && value instanceof BioChemEntity) { this.expressedIn((BioChemEntity)value); return; }
      if ("expressedIn".equals(key) && value instanceof DefinedTerm) { this.expressedIn((DefinedTerm)value); return; }
      if ("expressedIns".equals(key) && value instanceof DefinedTerm) { this.expressedIn((DefinedTerm)value); return; }
      if ("hasBioPolymerSequence".equals(key) && value instanceof HasRepresentation) { this.hasBioPolymerSequence((HasRepresentation)value); return; }
      if ("hasBioPolymerSequences".equals(key) && value instanceof HasRepresentation) { this.hasBioPolymerSequence((HasRepresentation)value); return; }
      if ("encodesBioChemEntity".equals(key) && value instanceof BioChemEntity) { this.encodesBioChemEntity((BioChemEntity)value); return; }
      if ("encodesBioChemEntitys".equals(key) && value instanceof BioChemEntity) { this.encodesBioChemEntity((BioChemEntity)value); return; }
      super.fromMap(key, value);
    }
  }
  
}
