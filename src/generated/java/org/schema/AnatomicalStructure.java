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
 * Any part of the human body, typically a component of an anatomical system. Organs, tissues, and cells are all anatomical structures.
 */
public class AnatomicalStructure extends MedicalEntity {
  /**
   * Component (sub-)structure(s) that comprise this anatomical structure.
   * @return subStructure property set by first invocation of subStructure method or {@code null}.
   */
  @JsonIgnore public AnatomicalStructure getSubStructure() {
    return (AnatomicalStructure) getValue("subStructure");
  }
  /**
   * Component (sub-)structure(s) that comprise this anatomical structure.
   * @return all subStructure properties as {@link java.util.Collection} or an empty collection 
   * if subStructure was not set.
   */
  @JsonIgnore public java.util.Collection<AnatomicalStructure> getSubStructures() {
    final java.lang.Object current = myData.get("subStructure");
    if (current == null) return Collections.emptyList();
    if (current instanceof java.util.Collection) {
      return (java.util.Collection<AnatomicalStructure>) current;
    }
    return Arrays.asList((AnatomicalStructure) current);
  }
  /**
   * A medical condition associated with this anatomy.
   * @return relatedCondition property set by first invocation of relatedCondition method or {@code null}.
   */
  @JsonIgnore public MedicalCondition getRelatedCondition() {
    return (MedicalCondition) getValue("relatedCondition");
  }
  /**
   * A medical condition associated with this anatomy.
   * @return all relatedCondition properties as {@link java.util.Collection} or an empty collection 
   * if relatedCondition was not set.
   */
  @JsonIgnore public java.util.Collection<MedicalCondition> getRelatedConditions() {
    final java.lang.Object current = myData.get("relatedCondition");
    if (current == null) return Collections.emptyList();
    if (current instanceof java.util.Collection) {
      return (java.util.Collection<MedicalCondition>) current;
    }
    return Arrays.asList((MedicalCondition) current);
  }
  /**
   * Other anatomical structures to which this structure is connected.
   * @return connectedTo property set by first invocation of connectedTo method or {@code null}.
   */
  @JsonIgnore public AnatomicalStructure getConnectedTo() {
    return (AnatomicalStructure) getValue("connectedTo");
  }
  /**
   * Other anatomical structures to which this structure is connected.
   * @return all connectedTo properties as {@link java.util.Collection} or an empty collection 
   * if connectedTo was not set.
   */
  @JsonIgnore public java.util.Collection<AnatomicalStructure> getConnectedTos() {
    final java.lang.Object current = myData.get("connectedTo");
    if (current == null) return Collections.emptyList();
    if (current instanceof java.util.Collection) {
      return (java.util.Collection<AnatomicalStructure>) current;
    }
    return Arrays.asList((AnatomicalStructure) current);
  }
  /**
   * The anatomical or organ system that this structure is part of.
   * @return partOfSystem property set by first invocation of partOfSystem method or {@code null}.
   */
  @JsonIgnore public AnatomicalSystem getPartOfSystem() {
    return (AnatomicalSystem) getValue("partOfSystem");
  }
  /**
   * The anatomical or organ system that this structure is part of.
   * @return all partOfSystem properties as {@link java.util.Collection} or an empty collection 
   * if partOfSystem was not set.
   */
  @JsonIgnore public java.util.Collection<AnatomicalSystem> getPartOfSystems() {
    final java.lang.Object current = myData.get("partOfSystem");
    if (current == null) return Collections.emptyList();
    if (current instanceof java.util.Collection) {
      return (java.util.Collection<AnatomicalSystem>) current;
    }
    return Arrays.asList((AnatomicalSystem) current);
  }
  /**
   * An image containing a diagram that illustrates the structure and/or its component substructures and/or connections with other structures.
   * @return diagram property set by first invocation of diagram method or {@code null}.
   */
  @JsonIgnore public ImageObject getDiagram() {
    return (ImageObject) getValue("diagram");
  }
  /**
   * An image containing a diagram that illustrates the structure and/or its component substructures and/or connections with other structures.
   * @return all diagram properties as {@link java.util.Collection} or an empty collection 
   * if diagram was not set.
   */
  @JsonIgnore public java.util.Collection<ImageObject> getDiagrams() {
    final java.lang.Object current = myData.get("diagram");
    if (current == null) return Collections.emptyList();
    if (current instanceof java.util.Collection) {
      return (java.util.Collection<ImageObject>) current;
    }
    return Arrays.asList((ImageObject) current);
  }
  /**
   * If applicable, a description of the pathophysiology associated with the anatomical system, including potential abnormal changes in the mechanical, physical, and biochemical functions of the system.
   * @return associatedPathophysiology property set by first invocation of associatedPathophysiology method or {@code null}.
   */
  @JsonIgnore public String getAssociatedPathophysiology() {
    return (String) getValue("associatedPathophysiology");
  }
  /**
   * If applicable, a description of the pathophysiology associated with the anatomical system, including potential abnormal changes in the mechanical, physical, and biochemical functions of the system.
   * @return all associatedPathophysiology properties as {@link java.util.Collection} or an empty collection 
   * if associatedPathophysiology was not set.
   */
  @JsonIgnore public java.util.Collection<String> getAssociatedPathophysiologys() {
    final java.lang.Object current = myData.get("associatedPathophysiology");
    if (current == null) return Collections.emptyList();
    if (current instanceof java.util.Collection) {
      return (java.util.Collection<String>) current;
    }
    return Arrays.asList((String) current);
  }
  /**
   * A medical therapy related to this anatomy.
   * @return relatedTherapy property set by first invocation of relatedTherapy method or {@code null}.
   */
  @JsonIgnore public MedicalTherapy getRelatedTherapy() {
    return (MedicalTherapy) getValue("relatedTherapy");
  }
  /**
   * A medical therapy related to this anatomy.
   * @return all relatedTherapy properties as {@link java.util.Collection} or an empty collection 
   * if relatedTherapy was not set.
   */
  @JsonIgnore public java.util.Collection<MedicalTherapy> getRelatedTherapys() {
    final java.lang.Object current = myData.get("relatedTherapy");
    if (current == null) return Collections.emptyList();
    if (current instanceof java.util.Collection) {
      return (java.util.Collection<MedicalTherapy>) current;
    }
    return Arrays.asList((MedicalTherapy) current);
  }
  /**
   * Location in the body of the anatomical structure.
   * @return bodyLocation property set by first invocation of bodyLocation method or {@code null}.
   */
  @JsonIgnore public String getBodyLocation() {
    return (String) getValue("bodyLocation");
  }
  /**
   * Location in the body of the anatomical structure.
   * @return all bodyLocation properties as {@link java.util.Collection} or an empty collection 
   * if bodyLocation was not set.
   */
  @JsonIgnore public java.util.Collection<String> getBodyLocations() {
    final java.lang.Object current = myData.get("bodyLocation");
    if (current == null) return Collections.emptyList();
    if (current instanceof java.util.Collection) {
      return (java.util.Collection<String>) current;
    }
    return Arrays.asList((String) current);
  }
  protected AnatomicalStructure(java.util.Map<String,java.lang.Object> data) {
    super(data);
  }
  
  /**
   * Builder for {@link AnatomicalStructure}
   */
  public static class Builder extends MedicalEntity.Builder {
    public Builder(@NotNull HashMap<String,java.lang.Object> data) {
      super(data);
    }
    @NotNull public AnatomicalStructure build() {
      return new AnatomicalStructure(myData);
    }
    /**
     * Component (sub-)structure(s) that comprise this anatomical structure.
     * @param anatomicalStructure value to set
     * @return this builder instance
     */
    @NotNull public Builder subStructure(@NotNull AnatomicalStructure anatomicalStructure) {
      putValue("subStructure", anatomicalStructure);
      return this;
    }
    /**
     * Component (sub-)structure(s) that comprise this anatomical structure.
     * @param anatomicalStructure value to set
     * @return this builder instance
     */
    @NotNull public Builder subStructure(@NotNull AnatomicalStructure.Builder anatomicalStructure) {
      putValue("subStructure", anatomicalStructure.build());
      return this;
    }
    /**
     * Remove subStructure property from the builder.
     * If this property is repeatable, all instances are removed.
     * @return this builder instance
     */
    @NotNull public Builder removeSubStructure() {
      removeValue("subStructure");
      return this;
    }
    /**
     * Get currently set value for subStructure property in this builder.
     * @return previously set value or {@code null}. If multiple values have been 
     * set to this property, then {@link java.util.Collection} instance will be 
     * returned.
     */
    @Nullable public java.lang.Object getSubStructure() {
      return myData.get("subStructure");
    }
    /**
     * A medical condition associated with this anatomy.
     * @param medicalCondition value to set
     * @return this builder instance
     */
    @NotNull public Builder relatedCondition(@NotNull MedicalCondition medicalCondition) {
      putValue("relatedCondition", medicalCondition);
      return this;
    }
    /**
     * A medical condition associated with this anatomy.
     * @param medicalCondition value to set
     * @return this builder instance
     */
    @NotNull public Builder relatedCondition(@NotNull MedicalCondition.Builder medicalCondition) {
      putValue("relatedCondition", medicalCondition.build());
      return this;
    }
    /**
     * Remove relatedCondition property from the builder.
     * If this property is repeatable, all instances are removed.
     * @return this builder instance
     */
    @NotNull public Builder removeRelatedCondition() {
      removeValue("relatedCondition");
      return this;
    }
    /**
     * Get currently set value for relatedCondition property in this builder.
     * @return previously set value or {@code null}. If multiple values have been 
     * set to this property, then {@link java.util.Collection} instance will be 
     * returned.
     */
    @Nullable public java.lang.Object getRelatedCondition() {
      return myData.get("relatedCondition");
    }
    /**
     * Other anatomical structures to which this structure is connected.
     * @param anatomicalStructure value to set
     * @return this builder instance
     */
    @NotNull public Builder connectedTo(@NotNull AnatomicalStructure anatomicalStructure) {
      putValue("connectedTo", anatomicalStructure);
      return this;
    }
    /**
     * Other anatomical structures to which this structure is connected.
     * @param anatomicalStructure value to set
     * @return this builder instance
     */
    @NotNull public Builder connectedTo(@NotNull AnatomicalStructure.Builder anatomicalStructure) {
      putValue("connectedTo", anatomicalStructure.build());
      return this;
    }
    /**
     * Remove connectedTo property from the builder.
     * If this property is repeatable, all instances are removed.
     * @return this builder instance
     */
    @NotNull public Builder removeConnectedTo() {
      removeValue("connectedTo");
      return this;
    }
    /**
     * Get currently set value for connectedTo property in this builder.
     * @return previously set value or {@code null}. If multiple values have been 
     * set to this property, then {@link java.util.Collection} instance will be 
     * returned.
     */
    @Nullable public java.lang.Object getConnectedTo() {
      return myData.get("connectedTo");
    }
    /**
     * The anatomical or organ system that this structure is part of.
     * @param anatomicalSystem value to set
     * @return this builder instance
     */
    @NotNull public Builder partOfSystem(@NotNull AnatomicalSystem anatomicalSystem) {
      putValue("partOfSystem", anatomicalSystem);
      return this;
    }
    /**
     * The anatomical or organ system that this structure is part of.
     * @param anatomicalSystem value to set
     * @return this builder instance
     */
    @NotNull public Builder partOfSystem(@NotNull AnatomicalSystem.Builder anatomicalSystem) {
      putValue("partOfSystem", anatomicalSystem.build());
      return this;
    }
    /**
     * Remove partOfSystem property from the builder.
     * If this property is repeatable, all instances are removed.
     * @return this builder instance
     */
    @NotNull public Builder removePartOfSystem() {
      removeValue("partOfSystem");
      return this;
    }
    /**
     * Get currently set value for partOfSystem property in this builder.
     * @return previously set value or {@code null}. If multiple values have been 
     * set to this property, then {@link java.util.Collection} instance will be 
     * returned.
     */
    @Nullable public java.lang.Object getPartOfSystem() {
      return myData.get("partOfSystem");
    }
    /**
     * An image containing a diagram that illustrates the structure and/or its component substructures and/or connections with other structures.
     * @param imageObject value to set
     * @return this builder instance
     */
    @NotNull public Builder diagram(@NotNull ImageObject imageObject) {
      putValue("diagram", imageObject);
      return this;
    }
    /**
     * An image containing a diagram that illustrates the structure and/or its component substructures and/or connections with other structures.
     * @param imageObject value to set
     * @return this builder instance
     */
    @NotNull public Builder diagram(@NotNull ImageObject.Builder imageObject) {
      putValue("diagram", imageObject.build());
      return this;
    }
    /**
     * Remove diagram property from the builder.
     * If this property is repeatable, all instances are removed.
     * @return this builder instance
     */
    @NotNull public Builder removeDiagram() {
      removeValue("diagram");
      return this;
    }
    /**
     * Get currently set value for diagram property in this builder.
     * @return previously set value or {@code null}. If multiple values have been 
     * set to this property, then {@link java.util.Collection} instance will be 
     * returned.
     */
    @Nullable public java.lang.Object getDiagram() {
      return myData.get("diagram");
    }
    /**
     * If applicable, a description of the pathophysiology associated with the anatomical system, including potential abnormal changes in the mechanical, physical, and biochemical functions of the system.
     * @param associatedPathophysiology value to set
     * @return this builder instance
     */
    @NotNull public Builder associatedPathophysiology(@NotNull String associatedPathophysiology) {
      putValue("associatedPathophysiology", associatedPathophysiology);
      return this;
    }
    /**
     * Remove associatedPathophysiology property from the builder.
     * If this property is repeatable, all instances are removed.
     * @return this builder instance
     */
    @NotNull public Builder removeAssociatedPathophysiology() {
      removeValue("associatedPathophysiology");
      return this;
    }
    /**
     * Get currently set value for associatedPathophysiology property in this builder.
     * @return previously set value or {@code null}. If multiple values have been 
     * set to this property, then {@link java.util.Collection} instance will be 
     * returned.
     */
    @Nullable public java.lang.Object getAssociatedPathophysiology() {
      return myData.get("associatedPathophysiology");
    }
    /**
     * A medical therapy related to this anatomy.
     * @param medicalTherapy value to set
     * @return this builder instance
     */
    @NotNull public Builder relatedTherapy(@NotNull MedicalTherapy medicalTherapy) {
      putValue("relatedTherapy", medicalTherapy);
      return this;
    }
    /**
     * A medical therapy related to this anatomy.
     * @param medicalTherapy value to set
     * @return this builder instance
     */
    @NotNull public Builder relatedTherapy(@NotNull MedicalTherapy.Builder medicalTherapy) {
      putValue("relatedTherapy", medicalTherapy.build());
      return this;
    }
    /**
     * Remove relatedTherapy property from the builder.
     * If this property is repeatable, all instances are removed.
     * @return this builder instance
     */
    @NotNull public Builder removeRelatedTherapy() {
      removeValue("relatedTherapy");
      return this;
    }
    /**
     * Get currently set value for relatedTherapy property in this builder.
     * @return previously set value or {@code null}. If multiple values have been 
     * set to this property, then {@link java.util.Collection} instance will be 
     * returned.
     */
    @Nullable public java.lang.Object getRelatedTherapy() {
      return myData.get("relatedTherapy");
    }
    /**
     * Location in the body of the anatomical structure.
     * @param bodyLocation value to set
     * @return this builder instance
     */
    @NotNull public Builder bodyLocation(@NotNull String bodyLocation) {
      putValue("bodyLocation", bodyLocation);
      return this;
    }
    /**
     * Remove bodyLocation property from the builder.
     * If this property is repeatable, all instances are removed.
     * @return this builder instance
     */
    @NotNull public Builder removeBodyLocation() {
      removeValue("bodyLocation");
      return this;
    }
    /**
     * Get currently set value for bodyLocation property in this builder.
     * @return previously set value or {@code null}. If multiple values have been 
     * set to this property, then {@link java.util.Collection} instance will be 
     * returned.
     */
    @Nullable public java.lang.Object getBodyLocation() {
      return myData.get("bodyLocation");
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
      if ("subStructure".equals(key) && value instanceof AnatomicalStructure) { this.subStructure((AnatomicalStructure)value); return; }
      if ("subStructures".equals(key) && value instanceof AnatomicalStructure) { this.subStructure((AnatomicalStructure)value); return; }
      if ("relatedCondition".equals(key) && value instanceof MedicalCondition) { this.relatedCondition((MedicalCondition)value); return; }
      if ("relatedConditions".equals(key) && value instanceof MedicalCondition) { this.relatedCondition((MedicalCondition)value); return; }
      if ("connectedTo".equals(key) && value instanceof AnatomicalStructure) { this.connectedTo((AnatomicalStructure)value); return; }
      if ("connectedTos".equals(key) && value instanceof AnatomicalStructure) { this.connectedTo((AnatomicalStructure)value); return; }
      if ("partOfSystem".equals(key) && value instanceof AnatomicalSystem) { this.partOfSystem((AnatomicalSystem)value); return; }
      if ("partOfSystems".equals(key) && value instanceof AnatomicalSystem) { this.partOfSystem((AnatomicalSystem)value); return; }
      if ("diagram".equals(key) && value instanceof ImageObject) { this.diagram((ImageObject)value); return; }
      if ("diagrams".equals(key) && value instanceof ImageObject) { this.diagram((ImageObject)value); return; }
      if ("associatedPathophysiology".equals(key) && value instanceof String) { this.associatedPathophysiology((String)value); return; }
      if ("associatedPathophysiologys".equals(key) && value instanceof String) { this.associatedPathophysiology((String)value); return; }
      if ("relatedTherapy".equals(key) && value instanceof MedicalTherapy) { this.relatedTherapy((MedicalTherapy)value); return; }
      if ("relatedTherapys".equals(key) && value instanceof MedicalTherapy) { this.relatedTherapy((MedicalTherapy)value); return; }
      if ("bodyLocation".equals(key) && value instanceof String) { this.bodyLocation((String)value); return; }
      if ("bodyLocations".equals(key) && value instanceof String) { this.bodyLocation((String)value); return; }
      super.fromMap(key, value);
    }
  }
  
}
