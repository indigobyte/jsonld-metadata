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
 * A set of characteristics describing parents, who can be interested in viewing some content.
 */
public class ParentAudience extends PeopleAudience {
  /**
   * Maximal age of the child.
   * @return childMaxAge property set by first invocation of childMaxAge method or {@code null}.
   */
  @JsonIgnore public Integer getChildMaxAgeInteger() {
    return (Integer) getValue("childMaxAge");
  }
  /**
   * Maximal age of the child.
   * @return all childMaxAge properties as {@link java.util.Collection} or an empty collection 
   * if childMaxAge was not set.
   */
  @JsonIgnore public java.util.Collection<Integer> getChildMaxAgeIntegers() {
    final java.lang.Object current = myData.get("childMaxAge");
    if (current == null) return Collections.emptyList();
    if (current instanceof java.util.Collection) {
      return (java.util.Collection<Integer>) current;
    }
    return Arrays.asList((Integer) current);
  }
  /**
   * Maximal age of the child.
   * @return childMaxAge property set by first invocation of childMaxAge method or {@code null}.
   */
  @JsonIgnore public Long getChildMaxAgeLong() {
    return (Long) getValue("childMaxAge");
  }
  /**
   * Maximal age of the child.
   * @return all childMaxAge properties as {@link java.util.Collection} or an empty collection 
   * if childMaxAge was not set.
   */
  @JsonIgnore public java.util.Collection<Long> getChildMaxAgeLongs() {
    final java.lang.Object current = myData.get("childMaxAge");
    if (current == null) return Collections.emptyList();
    if (current instanceof java.util.Collection) {
      return (java.util.Collection<Long>) current;
    }
    return Arrays.asList((Long) current);
  }
  /**
   * Maximal age of the child.
   * @return childMaxAge property set by first invocation of childMaxAge method or {@code null}.
   */
  @JsonIgnore public Float getChildMaxAgeFloat() {
    return (Float) getValue("childMaxAge");
  }
  /**
   * Maximal age of the child.
   * @return all childMaxAge properties as {@link java.util.Collection} or an empty collection 
   * if childMaxAge was not set.
   */
  @JsonIgnore public java.util.Collection<Float> getChildMaxAgeFloats() {
    final java.lang.Object current = myData.get("childMaxAge");
    if (current == null) return Collections.emptyList();
    if (current instanceof java.util.Collection) {
      return (java.util.Collection<Float>) current;
    }
    return Arrays.asList((Float) current);
  }
  /**
   * Maximal age of the child.
   * @return childMaxAge property set by first invocation of childMaxAge method or {@code null}.
   */
  @JsonIgnore public Double getChildMaxAgeDouble() {
    return (Double) getValue("childMaxAge");
  }
  /**
   * Maximal age of the child.
   * @return all childMaxAge properties as {@link java.util.Collection} or an empty collection 
   * if childMaxAge was not set.
   */
  @JsonIgnore public java.util.Collection<Double> getChildMaxAgeDoubles() {
    final java.lang.Object current = myData.get("childMaxAge");
    if (current == null) return Collections.emptyList();
    if (current instanceof java.util.Collection) {
      return (java.util.Collection<Double>) current;
    }
    return Arrays.asList((Double) current);
  }
  /**
   * Maximal age of the child.
   * @return childMaxAge property set by first invocation of childMaxAge method or {@code null}.
   */
  @JsonIgnore public String getChildMaxAgeString() {
    return (String) getValue("childMaxAge");
  }
  /**
   * Maximal age of the child.
   * @return all childMaxAge properties as {@link java.util.Collection} or an empty collection 
   * if childMaxAge was not set.
   */
  @JsonIgnore public java.util.Collection<String> getChildMaxAgeStrings() {
    final java.lang.Object current = myData.get("childMaxAge");
    if (current == null) return Collections.emptyList();
    if (current instanceof java.util.Collection) {
      return (java.util.Collection<String>) current;
    }
    return Arrays.asList((String) current);
  }
  /**
   * Minimal age of the child.
   * @return childMinAge property set by first invocation of childMinAge method or {@code null}.
   */
  @JsonIgnore public Integer getChildMinAgeInteger() {
    return (Integer) getValue("childMinAge");
  }
  /**
   * Minimal age of the child.
   * @return all childMinAge properties as {@link java.util.Collection} or an empty collection 
   * if childMinAge was not set.
   */
  @JsonIgnore public java.util.Collection<Integer> getChildMinAgeIntegers() {
    final java.lang.Object current = myData.get("childMinAge");
    if (current == null) return Collections.emptyList();
    if (current instanceof java.util.Collection) {
      return (java.util.Collection<Integer>) current;
    }
    return Arrays.asList((Integer) current);
  }
  /**
   * Minimal age of the child.
   * @return childMinAge property set by first invocation of childMinAge method or {@code null}.
   */
  @JsonIgnore public Long getChildMinAgeLong() {
    return (Long) getValue("childMinAge");
  }
  /**
   * Minimal age of the child.
   * @return all childMinAge properties as {@link java.util.Collection} or an empty collection 
   * if childMinAge was not set.
   */
  @JsonIgnore public java.util.Collection<Long> getChildMinAgeLongs() {
    final java.lang.Object current = myData.get("childMinAge");
    if (current == null) return Collections.emptyList();
    if (current instanceof java.util.Collection) {
      return (java.util.Collection<Long>) current;
    }
    return Arrays.asList((Long) current);
  }
  /**
   * Minimal age of the child.
   * @return childMinAge property set by first invocation of childMinAge method or {@code null}.
   */
  @JsonIgnore public Float getChildMinAgeFloat() {
    return (Float) getValue("childMinAge");
  }
  /**
   * Minimal age of the child.
   * @return all childMinAge properties as {@link java.util.Collection} or an empty collection 
   * if childMinAge was not set.
   */
  @JsonIgnore public java.util.Collection<Float> getChildMinAgeFloats() {
    final java.lang.Object current = myData.get("childMinAge");
    if (current == null) return Collections.emptyList();
    if (current instanceof java.util.Collection) {
      return (java.util.Collection<Float>) current;
    }
    return Arrays.asList((Float) current);
  }
  /**
   * Minimal age of the child.
   * @return childMinAge property set by first invocation of childMinAge method or {@code null}.
   */
  @JsonIgnore public Double getChildMinAgeDouble() {
    return (Double) getValue("childMinAge");
  }
  /**
   * Minimal age of the child.
   * @return all childMinAge properties as {@link java.util.Collection} or an empty collection 
   * if childMinAge was not set.
   */
  @JsonIgnore public java.util.Collection<Double> getChildMinAgeDoubles() {
    final java.lang.Object current = myData.get("childMinAge");
    if (current == null) return Collections.emptyList();
    if (current instanceof java.util.Collection) {
      return (java.util.Collection<Double>) current;
    }
    return Arrays.asList((Double) current);
  }
  /**
   * Minimal age of the child.
   * @return childMinAge property set by first invocation of childMinAge method or {@code null}.
   */
  @JsonIgnore public String getChildMinAgeString() {
    return (String) getValue("childMinAge");
  }
  /**
   * Minimal age of the child.
   * @return all childMinAge properties as {@link java.util.Collection} or an empty collection 
   * if childMinAge was not set.
   */
  @JsonIgnore public java.util.Collection<String> getChildMinAgeStrings() {
    final java.lang.Object current = myData.get("childMinAge");
    if (current == null) return Collections.emptyList();
    if (current instanceof java.util.Collection) {
      return (java.util.Collection<String>) current;
    }
    return Arrays.asList((String) current);
  }
  protected ParentAudience(java.util.Map<String,java.lang.Object> data) {
    super(data);
  }
  
  /**
   * Builder for {@link ParentAudience}
   */
  public static class Builder extends PeopleAudience.Builder {
    public Builder(@NotNull HashMap<String,java.lang.Object> data) {
      super(data);
    }
    @NotNull public ParentAudience build() {
      return new ParentAudience(myData);
    }
    /**
     * Maximal age of the child.
     * @param integer value to set
     * @return this builder instance
     */
    @NotNull public Builder childMaxAge(@NotNull Integer integer) {
      putValue("childMaxAge", integer);
      return this;
    }
    /**
     * Maximal age of the child.
     * @param childMaxAge value to set
     * @return this builder instance
     */
    @NotNull public Builder childMaxAge(@NotNull Long childMaxAge) {
      putValue("childMaxAge", childMaxAge);
      return this;
    }
    /**
     * Maximal age of the child.
     * @param childMaxAge value to set
     * @return this builder instance
     */
    @NotNull public Builder childMaxAge(@NotNull Float childMaxAge) {
      putValue("childMaxAge", childMaxAge);
      return this;
    }
    /**
     * Maximal age of the child.
     * @param childMaxAge value to set
     * @return this builder instance
     */
    @NotNull public Builder childMaxAge(@NotNull Double childMaxAge) {
      putValue("childMaxAge", childMaxAge);
      return this;
    }
    /**
     * Maximal age of the child.
     * @param childMaxAge value to set
     * @return this builder instance
     */
    @NotNull public Builder childMaxAge(@NotNull String childMaxAge) {
      putValue("childMaxAge", childMaxAge);
      return this;
    }
    /**
     * Remove childMaxAge property from the builder.
     * If this property is repeatable, all instances are removed.
     * @return this builder instance
     */
    @NotNull public Builder removeChildMaxAge() {
      removeValue("childMaxAge");
      return this;
    }
    /**
     * Get currently set value for childMaxAge property in this builder.
     * @return previously set value or {@code null}. If multiple values have been 
     * set to this property, then {@link java.util.Collection} instance will be 
     * returned.
     */
    @Nullable public java.lang.Object getChildMaxAge() {
      return myData.get("childMaxAge");
    }
    /**
     * Minimal age of the child.
     * @param integer value to set
     * @return this builder instance
     */
    @NotNull public Builder childMinAge(@NotNull Integer integer) {
      putValue("childMinAge", integer);
      return this;
    }
    /**
     * Minimal age of the child.
     * @param childMinAge value to set
     * @return this builder instance
     */
    @NotNull public Builder childMinAge(@NotNull Long childMinAge) {
      putValue("childMinAge", childMinAge);
      return this;
    }
    /**
     * Minimal age of the child.
     * @param childMinAge value to set
     * @return this builder instance
     */
    @NotNull public Builder childMinAge(@NotNull Float childMinAge) {
      putValue("childMinAge", childMinAge);
      return this;
    }
    /**
     * Minimal age of the child.
     * @param childMinAge value to set
     * @return this builder instance
     */
    @NotNull public Builder childMinAge(@NotNull Double childMinAge) {
      putValue("childMinAge", childMinAge);
      return this;
    }
    /**
     * Minimal age of the child.
     * @param childMinAge value to set
     * @return this builder instance
     */
    @NotNull public Builder childMinAge(@NotNull String childMinAge) {
      putValue("childMinAge", childMinAge);
      return this;
    }
    /**
     * Remove childMinAge property from the builder.
     * If this property is repeatable, all instances are removed.
     * @return this builder instance
     */
    @NotNull public Builder removeChildMinAge() {
      removeValue("childMinAge");
      return this;
    }
    /**
     * Get currently set value for childMinAge property in this builder.
     * @return previously set value or {@code null}. If multiple values have been 
     * set to this property, then {@link java.util.Collection} instance will be 
     * returned.
     */
    @Nullable public java.lang.Object getChildMinAge() {
      return myData.get("childMinAge");
    }
    /**
     * Minimum recommended age in years for the audience or user.
     * @param integer value to set
     * @return this builder instance
     */
    @NotNull public Builder suggestedMinAge(@NotNull Integer integer) {
      putValue("suggestedMinAge", integer);
      return this;
    }
    /**
     * Minimum recommended age in years for the audience or user.
     * @param suggestedMinAge value to set
     * @return this builder instance
     */
    @NotNull public Builder suggestedMinAge(@NotNull Long suggestedMinAge) {
      putValue("suggestedMinAge", suggestedMinAge);
      return this;
    }
    /**
     * Minimum recommended age in years for the audience or user.
     * @param suggestedMinAge value to set
     * @return this builder instance
     */
    @NotNull public Builder suggestedMinAge(@NotNull Float suggestedMinAge) {
      putValue("suggestedMinAge", suggestedMinAge);
      return this;
    }
    /**
     * Minimum recommended age in years for the audience or user.
     * @param suggestedMinAge value to set
     * @return this builder instance
     */
    @NotNull public Builder suggestedMinAge(@NotNull Double suggestedMinAge) {
      putValue("suggestedMinAge", suggestedMinAge);
      return this;
    }
    /**
     * Minimum recommended age in years for the audience or user.
     * @param suggestedMinAge value to set
     * @return this builder instance
     */
    @NotNull public Builder suggestedMinAge(@NotNull String suggestedMinAge) {
      putValue("suggestedMinAge", suggestedMinAge);
      return this;
    }
    /**
     * Remove suggestedMinAge property from the builder.
     * If this property is repeatable, all instances are removed.
     * @return this builder instance
     */
    @NotNull public Builder removeSuggestedMinAge() {
      removeValue("suggestedMinAge");
      return this;
    }
    /**
     * Get currently set value for suggestedMinAge property in this builder.
     * @return previously set value or {@code null}. If multiple values have been 
     * set to this property, then {@link java.util.Collection} instance will be 
     * returned.
     */
    @Nullable public java.lang.Object getSuggestedMinAge() {
      return myData.get("suggestedMinAge");
    }
    /**
     * A suggested range of body measurements for the intended audience or person, for example inseam between 32 and 34 inches or height between 170 and 190 cm. Typically found on a size chart for wearable products.
     * @param quantitativeValue value to set
     * @return this builder instance
     */
    @NotNull public Builder suggestedMeasurement(@NotNull QuantitativeValue quantitativeValue) {
      putValue("suggestedMeasurement", quantitativeValue);
      return this;
    }
    /**
     * A suggested range of body measurements for the intended audience or person, for example inseam between 32 and 34 inches or height between 170 and 190 cm. Typically found on a size chart for wearable products.
     * @param quantitativeValue value to set
     * @return this builder instance
     */
    @NotNull public Builder suggestedMeasurement(@NotNull QuantitativeValue.Builder quantitativeValue) {
      putValue("suggestedMeasurement", quantitativeValue.build());
      return this;
    }
    /**
     * Remove suggestedMeasurement property from the builder.
     * If this property is repeatable, all instances are removed.
     * @return this builder instance
     */
    @NotNull public Builder removeSuggestedMeasurement() {
      removeValue("suggestedMeasurement");
      return this;
    }
    /**
     * Get currently set value for suggestedMeasurement property in this builder.
     * @return previously set value or {@code null}. If multiple values have been 
     * set to this property, then {@link java.util.Collection} instance will be 
     * returned.
     */
    @Nullable public java.lang.Object getSuggestedMeasurement() {
      return myData.get("suggestedMeasurement");
    }
    /**
     * Audiences defined by a person's minimum age.
     * @param integer value to set
     * @return this builder instance
     */
    @NotNull public Builder requiredMinAge(@NotNull Integer integer) {
      putValue("requiredMinAge", integer);
      return this;
    }
    /**
     * Remove requiredMinAge property from the builder.
     * If this property is repeatable, all instances are removed.
     * @return this builder instance
     */
    @NotNull public Builder removeRequiredMinAge() {
      removeValue("requiredMinAge");
      return this;
    }
    /**
     * Get currently set value for requiredMinAge property in this builder.
     * @return previously set value or {@code null}. If multiple values have been 
     * set to this property, then {@link java.util.Collection} instance will be 
     * returned.
     */
    @Nullable public java.lang.Object getRequiredMinAge() {
      return myData.get("requiredMinAge");
    }
    /**
     * Audiences defined by a person's gender.
     * @param requiredGender value to set
     * @return this builder instance
     */
    @NotNull public Builder requiredGender(@NotNull String requiredGender) {
      putValue("requiredGender", requiredGender);
      return this;
    }
    /**
     * Remove requiredGender property from the builder.
     * If this property is repeatable, all instances are removed.
     * @return this builder instance
     */
    @NotNull public Builder removeRequiredGender() {
      removeValue("requiredGender");
      return this;
    }
    /**
     * Get currently set value for requiredGender property in this builder.
     * @return previously set value or {@code null}. If multiple values have been 
     * set to this property, then {@link java.util.Collection} instance will be 
     * returned.
     */
    @Nullable public java.lang.Object getRequiredGender() {
      return myData.get("requiredGender");
    }
    /**
     * The suggested gender of the intended person or audience, for example &quot;male&quot;, &quot;female&quot;, or &quot;unisex&quot;.
     * @param genderType value to set
     * @return this builder instance
     */
    @NotNull public Builder suggestedGender(@NotNull GenderType genderType) {
      putValue("suggestedGender", genderType);
      return this;
    }
    /**
     * The suggested gender of the intended person or audience, for example &quot;male&quot;, &quot;female&quot;, or &quot;unisex&quot;.
     * @param suggestedGender value to set
     * @return this builder instance
     */
    @NotNull public Builder suggestedGender(@NotNull String suggestedGender) {
      putValue("suggestedGender", suggestedGender);
      return this;
    }
    /**
     * Remove suggestedGender property from the builder.
     * If this property is repeatable, all instances are removed.
     * @return this builder instance
     */
    @NotNull public Builder removeSuggestedGender() {
      removeValue("suggestedGender");
      return this;
    }
    /**
     * Get currently set value for suggestedGender property in this builder.
     * @return previously set value or {@code null}. If multiple values have been 
     * set to this property, then {@link java.util.Collection} instance will be 
     * returned.
     */
    @Nullable public java.lang.Object getSuggestedGender() {
      return myData.get("suggestedGender");
    }
    /**
     * The age or age range for the intended audience or person, for example 3-12 months for infants, 1-5 years for toddlers.
     * @param quantitativeValue value to set
     * @return this builder instance
     */
    @NotNull public Builder suggestedAge(@NotNull QuantitativeValue quantitativeValue) {
      putValue("suggestedAge", quantitativeValue);
      return this;
    }
    /**
     * The age or age range for the intended audience or person, for example 3-12 months for infants, 1-5 years for toddlers.
     * @param quantitativeValue value to set
     * @return this builder instance
     */
    @NotNull public Builder suggestedAge(@NotNull QuantitativeValue.Builder quantitativeValue) {
      putValue("suggestedAge", quantitativeValue.build());
      return this;
    }
    /**
     * Remove suggestedAge property from the builder.
     * If this property is repeatable, all instances are removed.
     * @return this builder instance
     */
    @NotNull public Builder removeSuggestedAge() {
      removeValue("suggestedAge");
      return this;
    }
    /**
     * Get currently set value for suggestedAge property in this builder.
     * @return previously set value or {@code null}. If multiple values have been 
     * set to this property, then {@link java.util.Collection} instance will be 
     * returned.
     */
    @Nullable public java.lang.Object getSuggestedAge() {
      return myData.get("suggestedAge");
    }
    /**
     * Audiences defined by a person's maximum age.
     * @param integer value to set
     * @return this builder instance
     */
    @NotNull public Builder requiredMaxAge(@NotNull Integer integer) {
      putValue("requiredMaxAge", integer);
      return this;
    }
    /**
     * Remove requiredMaxAge property from the builder.
     * If this property is repeatable, all instances are removed.
     * @return this builder instance
     */
    @NotNull public Builder removeRequiredMaxAge() {
      removeValue("requiredMaxAge");
      return this;
    }
    /**
     * Get currently set value for requiredMaxAge property in this builder.
     * @return previously set value or {@code null}. If multiple values have been 
     * set to this property, then {@link java.util.Collection} instance will be 
     * returned.
     */
    @Nullable public java.lang.Object getRequiredMaxAge() {
      return myData.get("requiredMaxAge");
    }
    /**
     * Specifying the health condition(s) of a patient, medical study, or other target audience.
     * @param medicalCondition value to set
     * @return this builder instance
     */
    @NotNull public Builder healthCondition(@NotNull MedicalCondition medicalCondition) {
      putValue("healthCondition", medicalCondition);
      return this;
    }
    /**
     * Specifying the health condition(s) of a patient, medical study, or other target audience.
     * @param medicalCondition value to set
     * @return this builder instance
     */
    @NotNull public Builder healthCondition(@NotNull MedicalCondition.Builder medicalCondition) {
      putValue("healthCondition", medicalCondition.build());
      return this;
    }
    /**
     * Remove healthCondition property from the builder.
     * If this property is repeatable, all instances are removed.
     * @return this builder instance
     */
    @NotNull public Builder removeHealthCondition() {
      removeValue("healthCondition");
      return this;
    }
    /**
     * Get currently set value for healthCondition property in this builder.
     * @return previously set value or {@code null}. If multiple values have been 
     * set to this property, then {@link java.util.Collection} instance will be 
     * returned.
     */
    @Nullable public java.lang.Object getHealthCondition() {
      return myData.get("healthCondition");
    }
    /**
     * Maximum recommended age in years for the audience or user.
     * @param integer value to set
     * @return this builder instance
     */
    @NotNull public Builder suggestedMaxAge(@NotNull Integer integer) {
      putValue("suggestedMaxAge", integer);
      return this;
    }
    /**
     * Maximum recommended age in years for the audience or user.
     * @param suggestedMaxAge value to set
     * @return this builder instance
     */
    @NotNull public Builder suggestedMaxAge(@NotNull Long suggestedMaxAge) {
      putValue("suggestedMaxAge", suggestedMaxAge);
      return this;
    }
    /**
     * Maximum recommended age in years for the audience or user.
     * @param suggestedMaxAge value to set
     * @return this builder instance
     */
    @NotNull public Builder suggestedMaxAge(@NotNull Float suggestedMaxAge) {
      putValue("suggestedMaxAge", suggestedMaxAge);
      return this;
    }
    /**
     * Maximum recommended age in years for the audience or user.
     * @param suggestedMaxAge value to set
     * @return this builder instance
     */
    @NotNull public Builder suggestedMaxAge(@NotNull Double suggestedMaxAge) {
      putValue("suggestedMaxAge", suggestedMaxAge);
      return this;
    }
    /**
     * Maximum recommended age in years for the audience or user.
     * @param suggestedMaxAge value to set
     * @return this builder instance
     */
    @NotNull public Builder suggestedMaxAge(@NotNull String suggestedMaxAge) {
      putValue("suggestedMaxAge", suggestedMaxAge);
      return this;
    }
    /**
     * Remove suggestedMaxAge property from the builder.
     * If this property is repeatable, all instances are removed.
     * @return this builder instance
     */
    @NotNull public Builder removeSuggestedMaxAge() {
      removeValue("suggestedMaxAge");
      return this;
    }
    /**
     * Get currently set value for suggestedMaxAge property in this builder.
     * @return previously set value or {@code null}. If multiple values have been 
     * set to this property, then {@link java.util.Collection} instance will be 
     * returned.
     */
    @Nullable public java.lang.Object getSuggestedMaxAge() {
      return myData.get("suggestedMaxAge");
    }
    /**
     * The target group associated with a given audience (e.g. veterans, car owners, musicians, etc.).
     * @param audienceType value to set
     * @return this builder instance
     */
    @NotNull public Builder audienceType(@NotNull String audienceType) {
      putValue("audienceType", audienceType);
      return this;
    }
    /**
     * Remove audienceType property from the builder.
     * If this property is repeatable, all instances are removed.
     * @return this builder instance
     */
    @NotNull public Builder removeAudienceType() {
      removeValue("audienceType");
      return this;
    }
    /**
     * Get currently set value for audienceType property in this builder.
     * @return previously set value or {@code null}. If multiple values have been 
     * set to this property, then {@link java.util.Collection} instance will be 
     * returned.
     */
    @Nullable public java.lang.Object getAudienceType() {
      return myData.get("audienceType");
    }
    /**
     * The geographic area associated with the audience.
     * @param administrativeArea value to set
     * @return this builder instance
     */
    @NotNull public Builder geographicArea(@NotNull AdministrativeArea administrativeArea) {
      putValue("geographicArea", administrativeArea);
      return this;
    }
    /**
     * The geographic area associated with the audience.
     * @param administrativeArea value to set
     * @return this builder instance
     */
    @NotNull public Builder geographicArea(@NotNull AdministrativeArea.Builder administrativeArea) {
      putValue("geographicArea", administrativeArea.build());
      return this;
    }
    /**
     * Remove geographicArea property from the builder.
     * If this property is repeatable, all instances are removed.
     * @return this builder instance
     */
    @NotNull public Builder removeGeographicArea() {
      removeValue("geographicArea");
      return this;
    }
    /**
     * Get currently set value for geographicArea property in this builder.
     * @return previously set value or {@code null}. If multiple values have been 
     * set to this property, then {@link java.util.Collection} instance will be 
     * returned.
     */
    @Nullable public java.lang.Object getGeographicArea() {
      return myData.get("geographicArea");
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
      if ("childMaxAge".equals(key) && value instanceof Integer) { this.childMaxAge((Integer)value); return; }
      if ("childMaxAges".equals(key) && value instanceof Integer) { this.childMaxAge((Integer)value); return; }
      if ("childMaxAge".equals(key) && value instanceof Long) { this.childMaxAge((Long)value); return; }
      if ("childMaxAges".equals(key) && value instanceof Long) { this.childMaxAge((Long)value); return; }
      if ("childMaxAge".equals(key) && value instanceof Float) { this.childMaxAge((Float)value); return; }
      if ("childMaxAges".equals(key) && value instanceof Float) { this.childMaxAge((Float)value); return; }
      if ("childMaxAge".equals(key) && value instanceof Double) { this.childMaxAge((Double)value); return; }
      if ("childMaxAges".equals(key) && value instanceof Double) { this.childMaxAge((Double)value); return; }
      if ("childMaxAge".equals(key) && value instanceof String) { this.childMaxAge((String)value); return; }
      if ("childMaxAges".equals(key) && value instanceof String) { this.childMaxAge((String)value); return; }
      if ("childMinAge".equals(key) && value instanceof Integer) { this.childMinAge((Integer)value); return; }
      if ("childMinAges".equals(key) && value instanceof Integer) { this.childMinAge((Integer)value); return; }
      if ("childMinAge".equals(key) && value instanceof Long) { this.childMinAge((Long)value); return; }
      if ("childMinAges".equals(key) && value instanceof Long) { this.childMinAge((Long)value); return; }
      if ("childMinAge".equals(key) && value instanceof Float) { this.childMinAge((Float)value); return; }
      if ("childMinAges".equals(key) && value instanceof Float) { this.childMinAge((Float)value); return; }
      if ("childMinAge".equals(key) && value instanceof Double) { this.childMinAge((Double)value); return; }
      if ("childMinAges".equals(key) && value instanceof Double) { this.childMinAge((Double)value); return; }
      if ("childMinAge".equals(key) && value instanceof String) { this.childMinAge((String)value); return; }
      if ("childMinAges".equals(key) && value instanceof String) { this.childMinAge((String)value); return; }
      super.fromMap(key, value);
    }
  }
  
}
