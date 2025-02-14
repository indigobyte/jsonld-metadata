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
 * Size related properties of a product, typically a size code ([[name]]) and optionally a [[sizeSystem]], [[sizeGroup]], and product measurements ([[hasMeasurement]]). In addition, the intended audience can be defined through [[suggestedAge]], [[suggestedGender]], and suggested body measurements ([[suggestedMeasurement]]).
 */
public class SizeSpecification extends QualitativeValue {
  /**
   * A suggested range of body measurements for the intended audience or person, for example inseam between 32 and 34 inches or height between 170 and 190 cm. Typically found on a size chart for wearable products.
   * @return suggestedMeasurement property set by first invocation of suggestedMeasurement method or {@code null}.
   */
  @JsonIgnore public QuantitativeValue getSuggestedMeasurement() {
    return (QuantitativeValue) getValue("suggestedMeasurement");
  }
  /**
   * A suggested range of body measurements for the intended audience or person, for example inseam between 32 and 34 inches or height between 170 and 190 cm. Typically found on a size chart for wearable products.
   * @return all suggestedMeasurement properties as {@link java.util.Collection} or an empty collection 
   * if suggestedMeasurement was not set.
   */
  @JsonIgnore public java.util.Collection<QuantitativeValue> getSuggestedMeasurements() {
    final java.lang.Object current = myData.get("suggestedMeasurement");
    if (current == null) return Collections.emptyList();
    if (current instanceof java.util.Collection) {
      return (java.util.Collection<QuantitativeValue>) current;
    }
    return Arrays.asList((QuantitativeValue) current);
  }
  /**
   * The size group (also known as &quot;size type&quot;) for a product's size. Size groups are common in the fashion industry to define size segments and suggested audiences for wearable products. Multiple values can be combined, for example &quot;men's big and tall&quot;, &quot;petite maternity&quot; or &quot;regular&quot;
   * @return sizeGroup property set by first invocation of sizeGroup method or {@code null}.
   */
  @JsonIgnore public SizeGroupEnumeration getSizeGroupSizeGroupEnumeration() {
    return (SizeGroupEnumeration) getValue("sizeGroup");
  }
  /**
   * The size group (also known as &quot;size type&quot;) for a product's size. Size groups are common in the fashion industry to define size segments and suggested audiences for wearable products. Multiple values can be combined, for example &quot;men's big and tall&quot;, &quot;petite maternity&quot; or &quot;regular&quot;
   * @return all sizeGroup properties as {@link java.util.Collection} or an empty collection 
   * if sizeGroup was not set.
   */
  @JsonIgnore public java.util.Collection<SizeGroupEnumeration> getSizeGroupSizeGroupEnumerations() {
    final java.lang.Object current = myData.get("sizeGroup");
    if (current == null) return Collections.emptyList();
    if (current instanceof java.util.Collection) {
      return (java.util.Collection<SizeGroupEnumeration>) current;
    }
    return Arrays.asList((SizeGroupEnumeration) current);
  }
  /**
   * The size group (also known as &quot;size type&quot;) for a product's size. Size groups are common in the fashion industry to define size segments and suggested audiences for wearable products. Multiple values can be combined, for example &quot;men's big and tall&quot;, &quot;petite maternity&quot; or &quot;regular&quot;
   * @return sizeGroup property set by first invocation of sizeGroup method or {@code null}.
   */
  @JsonIgnore public String getSizeGroupString() {
    return (String) getValue("sizeGroup");
  }
  /**
   * The size group (also known as &quot;size type&quot;) for a product's size. Size groups are common in the fashion industry to define size segments and suggested audiences for wearable products. Multiple values can be combined, for example &quot;men's big and tall&quot;, &quot;petite maternity&quot; or &quot;regular&quot;
   * @return all sizeGroup properties as {@link java.util.Collection} or an empty collection 
   * if sizeGroup was not set.
   */
  @JsonIgnore public java.util.Collection<String> getSizeGroupStrings() {
    final java.lang.Object current = myData.get("sizeGroup");
    if (current == null) return Collections.emptyList();
    if (current instanceof java.util.Collection) {
      return (java.util.Collection<String>) current;
    }
    return Arrays.asList((String) current);
  }
  /**
   * The size system used to identify a product's size. Typically either a standard (for example, &quot;GS1&quot; or &quot;ISO-EN13402&quot;), country code (for example &quot;US&quot; or &quot;JP&quot;), or a measuring system (for example &quot;Metric&quot; or &quot;Imperial&quot;).
   * @return sizeSystem property set by first invocation of sizeSystem method or {@code null}.
   */
  @JsonIgnore public SizeSystemEnumeration getSizeSystemSizeSystemEnumeration() {
    return (SizeSystemEnumeration) getValue("sizeSystem");
  }
  /**
   * The size system used to identify a product's size. Typically either a standard (for example, &quot;GS1&quot; or &quot;ISO-EN13402&quot;), country code (for example &quot;US&quot; or &quot;JP&quot;), or a measuring system (for example &quot;Metric&quot; or &quot;Imperial&quot;).
   * @return all sizeSystem properties as {@link java.util.Collection} or an empty collection 
   * if sizeSystem was not set.
   */
  @JsonIgnore public java.util.Collection<SizeSystemEnumeration> getSizeSystemSizeSystemEnumerations() {
    final java.lang.Object current = myData.get("sizeSystem");
    if (current == null) return Collections.emptyList();
    if (current instanceof java.util.Collection) {
      return (java.util.Collection<SizeSystemEnumeration>) current;
    }
    return Arrays.asList((SizeSystemEnumeration) current);
  }
  /**
   * The size system used to identify a product's size. Typically either a standard (for example, &quot;GS1&quot; or &quot;ISO-EN13402&quot;), country code (for example &quot;US&quot; or &quot;JP&quot;), or a measuring system (for example &quot;Metric&quot; or &quot;Imperial&quot;).
   * @return sizeSystem property set by first invocation of sizeSystem method or {@code null}.
   */
  @JsonIgnore public String getSizeSystemString() {
    return (String) getValue("sizeSystem");
  }
  /**
   * The size system used to identify a product's size. Typically either a standard (for example, &quot;GS1&quot; or &quot;ISO-EN13402&quot;), country code (for example &quot;US&quot; or &quot;JP&quot;), or a measuring system (for example &quot;Metric&quot; or &quot;Imperial&quot;).
   * @return all sizeSystem properties as {@link java.util.Collection} or an empty collection 
   * if sizeSystem was not set.
   */
  @JsonIgnore public java.util.Collection<String> getSizeSystemStrings() {
    final java.lang.Object current = myData.get("sizeSystem");
    if (current == null) return Collections.emptyList();
    if (current instanceof java.util.Collection) {
      return (java.util.Collection<String>) current;
    }
    return Arrays.asList((String) current);
  }
  /**
   * The suggested gender of the intended person or audience, for example &quot;male&quot;, &quot;female&quot;, or &quot;unisex&quot;.
   * @return suggestedGender property set by first invocation of suggestedGender method or {@code null}.
   */
  @JsonIgnore public GenderType getSuggestedGenderGenderType() {
    return (GenderType) getValue("suggestedGender");
  }
  /**
   * The suggested gender of the intended person or audience, for example &quot;male&quot;, &quot;female&quot;, or &quot;unisex&quot;.
   * @return all suggestedGender properties as {@link java.util.Collection} or an empty collection 
   * if suggestedGender was not set.
   */
  @JsonIgnore public java.util.Collection<GenderType> getSuggestedGenderGenderTypes() {
    final java.lang.Object current = myData.get("suggestedGender");
    if (current == null) return Collections.emptyList();
    if (current instanceof java.util.Collection) {
      return (java.util.Collection<GenderType>) current;
    }
    return Arrays.asList((GenderType) current);
  }
  /**
   * The suggested gender of the intended person or audience, for example &quot;male&quot;, &quot;female&quot;, or &quot;unisex&quot;.
   * @return suggestedGender property set by first invocation of suggestedGender method or {@code null}.
   */
  @JsonIgnore public String getSuggestedGenderString() {
    return (String) getValue("suggestedGender");
  }
  /**
   * The suggested gender of the intended person or audience, for example &quot;male&quot;, &quot;female&quot;, or &quot;unisex&quot;.
   * @return all suggestedGender properties as {@link java.util.Collection} or an empty collection 
   * if suggestedGender was not set.
   */
  @JsonIgnore public java.util.Collection<String> getSuggestedGenderStrings() {
    final java.lang.Object current = myData.get("suggestedGender");
    if (current == null) return Collections.emptyList();
    if (current instanceof java.util.Collection) {
      return (java.util.Collection<String>) current;
    }
    return Arrays.asList((String) current);
  }
  /**
   * The age or age range for the intended audience or person, for example 3-12 months for infants, 1-5 years for toddlers.
   * @return suggestedAge property set by first invocation of suggestedAge method or {@code null}.
   */
  @JsonIgnore public QuantitativeValue getSuggestedAge() {
    return (QuantitativeValue) getValue("suggestedAge");
  }
  /**
   * The age or age range for the intended audience or person, for example 3-12 months for infants, 1-5 years for toddlers.
   * @return all suggestedAge properties as {@link java.util.Collection} or an empty collection 
   * if suggestedAge was not set.
   */
  @JsonIgnore public java.util.Collection<QuantitativeValue> getSuggestedAges() {
    final java.lang.Object current = myData.get("suggestedAge");
    if (current == null) return Collections.emptyList();
    if (current instanceof java.util.Collection) {
      return (java.util.Collection<QuantitativeValue>) current;
    }
    return Arrays.asList((QuantitativeValue) current);
  }
  /**
   * A product measurement, for example the inseam of pants, the wheel size of a bicycle, or the gauge of a screw. Usually an exact measurement, but can also be a range of measurements for adjustable products, for example belts and ski bindings.
   * @return hasMeasurement property set by first invocation of hasMeasurement method or {@code null}.
   */
  @JsonIgnore public QuantitativeValue getHasMeasurement() {
    return (QuantitativeValue) getValue("hasMeasurement");
  }
  /**
   * A product measurement, for example the inseam of pants, the wheel size of a bicycle, or the gauge of a screw. Usually an exact measurement, but can also be a range of measurements for adjustable products, for example belts and ski bindings.
   * @return all hasMeasurement properties as {@link java.util.Collection} or an empty collection 
   * if hasMeasurement was not set.
   */
  @JsonIgnore public java.util.Collection<QuantitativeValue> getHasMeasurements() {
    final java.lang.Object current = myData.get("hasMeasurement");
    if (current == null) return Collections.emptyList();
    if (current instanceof java.util.Collection) {
      return (java.util.Collection<QuantitativeValue>) current;
    }
    return Arrays.asList((QuantitativeValue) current);
  }
  protected SizeSpecification(java.util.Map<String,java.lang.Object> data) {
    super(data);
  }
  /**
   * @return new {@link Builder} initialized with this instance's data
   */
  @NotNull public Builder toBuilder() {
    return new Builder(new HashMap<>(this.myData));
  }
  
  /**
   * Builder for {@link SizeSpecification}
   */
  public static class Builder extends QualitativeValue.Builder {
    public Builder(@NotNull HashMap<String,java.lang.Object> data) {
      super(data);
    }
    @NotNull public SizeSpecification build() {
      return new SizeSpecification(myData);
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
     * The size group (also known as &quot;size type&quot;) for a product's size. Size groups are common in the fashion industry to define size segments and suggested audiences for wearable products. Multiple values can be combined, for example &quot;men's big and tall&quot;, &quot;petite maternity&quot; or &quot;regular&quot;
     * @param sizeGroupEnumeration value to set
     * @return this builder instance
     */
    @NotNull public Builder sizeGroup(@NotNull SizeGroupEnumeration sizeGroupEnumeration) {
      putValue("sizeGroup", sizeGroupEnumeration);
      return this;
    }
    /**
     * The size group (also known as &quot;size type&quot;) for a product's size. Size groups are common in the fashion industry to define size segments and suggested audiences for wearable products. Multiple values can be combined, for example &quot;men's big and tall&quot;, &quot;petite maternity&quot; or &quot;regular&quot;
     * @param sizeGroup value to set
     * @return this builder instance
     */
    @NotNull public Builder sizeGroup(@NotNull String sizeGroup) {
      putValue("sizeGroup", sizeGroup);
      return this;
    }
    /**
     * Remove sizeGroup property from the builder.
     * If this property is repeatable, all instances are removed.
     * @return this builder instance
     */
    @NotNull public Builder removeSizeGroup() {
      removeValue("sizeGroup");
      return this;
    }
    /**
     * Get currently set value for sizeGroup property in this builder.
     * @return previously set value or {@code null}. If multiple values have been 
     * set to this property, then {@link java.util.Collection} instance will be 
     * returned.
     */
    @Nullable public java.lang.Object getSizeGroup() {
      return myData.get("sizeGroup");
    }
    /**
     * The size system used to identify a product's size. Typically either a standard (for example, &quot;GS1&quot; or &quot;ISO-EN13402&quot;), country code (for example &quot;US&quot; or &quot;JP&quot;), or a measuring system (for example &quot;Metric&quot; or &quot;Imperial&quot;).
     * @param sizeSystemEnumeration value to set
     * @return this builder instance
     */
    @NotNull public Builder sizeSystem(@NotNull SizeSystemEnumeration sizeSystemEnumeration) {
      putValue("sizeSystem", sizeSystemEnumeration);
      return this;
    }
    /**
     * The size system used to identify a product's size. Typically either a standard (for example, &quot;GS1&quot; or &quot;ISO-EN13402&quot;), country code (for example &quot;US&quot; or &quot;JP&quot;), or a measuring system (for example &quot;Metric&quot; or &quot;Imperial&quot;).
     * @param sizeSystem value to set
     * @return this builder instance
     */
    @NotNull public Builder sizeSystem(@NotNull String sizeSystem) {
      putValue("sizeSystem", sizeSystem);
      return this;
    }
    /**
     * Remove sizeSystem property from the builder.
     * If this property is repeatable, all instances are removed.
     * @return this builder instance
     */
    @NotNull public Builder removeSizeSystem() {
      removeValue("sizeSystem");
      return this;
    }
    /**
     * Get currently set value for sizeSystem property in this builder.
     * @return previously set value or {@code null}. If multiple values have been 
     * set to this property, then {@link java.util.Collection} instance will be 
     * returned.
     */
    @Nullable public java.lang.Object getSizeSystem() {
      return myData.get("sizeSystem");
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
     * A product measurement, for example the inseam of pants, the wheel size of a bicycle, or the gauge of a screw. Usually an exact measurement, but can also be a range of measurements for adjustable products, for example belts and ski bindings.
     * @param quantitativeValue value to set
     * @return this builder instance
     */
    @NotNull public Builder hasMeasurement(@NotNull QuantitativeValue quantitativeValue) {
      putValue("hasMeasurement", quantitativeValue);
      return this;
    }
    /**
     * A product measurement, for example the inseam of pants, the wheel size of a bicycle, or the gauge of a screw. Usually an exact measurement, but can also be a range of measurements for adjustable products, for example belts and ski bindings.
     * @param quantitativeValue value to set
     * @return this builder instance
     */
    @NotNull public Builder hasMeasurement(@NotNull QuantitativeValue.Builder quantitativeValue) {
      putValue("hasMeasurement", quantitativeValue.build());
      return this;
    }
    /**
     * Remove hasMeasurement property from the builder.
     * If this property is repeatable, all instances are removed.
     * @return this builder instance
     */
    @NotNull public Builder removeHasMeasurement() {
      removeValue("hasMeasurement");
      return this;
    }
    /**
     * Get currently set value for hasMeasurement property in this builder.
     * @return previously set value or {@code null}. If multiple values have been 
     * set to this property, then {@link java.util.Collection} instance will be 
     * returned.
     */
    @Nullable public java.lang.Object getHasMeasurement() {
      return myData.get("hasMeasurement");
    }
    /**
     * A secondary value that provides additional information on the original value, e.g. a reference temperature or a type of measurement.
     * @param definedTerm value to set
     * @return this builder instance
     */
    @NotNull public Builder valueReference(@NotNull DefinedTerm definedTerm) {
      putValue("valueReference", definedTerm);
      return this;
    }
    /**
     * A secondary value that provides additional information on the original value, e.g. a reference temperature or a type of measurement.
     * @param definedTerm value to set
     * @return this builder instance
     */
    @NotNull public Builder valueReference(@NotNull DefinedTerm.Builder definedTerm) {
      putValue("valueReference", definedTerm.build());
      return this;
    }
    /**
     * A secondary value that provides additional information on the original value, e.g. a reference temperature or a type of measurement.
     * @param enumeration value to set
     * @return this builder instance
     */
    @NotNull public Builder valueReference(@NotNull Enumeration enumeration) {
      putValue("valueReference", enumeration);
      return this;
    }
    /**
     * A secondary value that provides additional information on the original value, e.g. a reference temperature or a type of measurement.
     * @param measurementTypeEnumeration value to set
     * @return this builder instance
     */
    @NotNull public Builder valueReference(@NotNull MeasurementTypeEnumeration measurementTypeEnumeration) {
      putValue("valueReference", measurementTypeEnumeration);
      return this;
    }
    /**
     * A secondary value that provides additional information on the original value, e.g. a reference temperature or a type of measurement.
     * @param propertyValue value to set
     * @return this builder instance
     */
    @NotNull public Builder valueReference(@NotNull PropertyValue propertyValue) {
      putValue("valueReference", propertyValue);
      return this;
    }
    /**
     * A secondary value that provides additional information on the original value, e.g. a reference temperature or a type of measurement.
     * @param propertyValue value to set
     * @return this builder instance
     */
    @NotNull public Builder valueReference(@NotNull PropertyValue.Builder propertyValue) {
      putValue("valueReference", propertyValue.build());
      return this;
    }
    /**
     * A secondary value that provides additional information on the original value, e.g. a reference temperature or a type of measurement.
     * @param qualitativeValue value to set
     * @return this builder instance
     */
    @NotNull public Builder valueReference(@NotNull QualitativeValue qualitativeValue) {
      putValue("valueReference", qualitativeValue);
      return this;
    }
    /**
     * A secondary value that provides additional information on the original value, e.g. a reference temperature or a type of measurement.
     * @param qualitativeValue value to set
     * @return this builder instance
     */
    @NotNull public Builder valueReference(@NotNull QualitativeValue.Builder qualitativeValue) {
      putValue("valueReference", qualitativeValue.build());
      return this;
    }
    /**
     * A secondary value that provides additional information on the original value, e.g. a reference temperature or a type of measurement.
     * @param quantitativeValue value to set
     * @return this builder instance
     */
    @NotNull public Builder valueReference(@NotNull QuantitativeValue quantitativeValue) {
      putValue("valueReference", quantitativeValue);
      return this;
    }
    /**
     * A secondary value that provides additional information on the original value, e.g. a reference temperature or a type of measurement.
     * @param quantitativeValue value to set
     * @return this builder instance
     */
    @NotNull public Builder valueReference(@NotNull QuantitativeValue.Builder quantitativeValue) {
      putValue("valueReference", quantitativeValue.build());
      return this;
    }
    /**
     * A secondary value that provides additional information on the original value, e.g. a reference temperature or a type of measurement.
     * @param valueReference value to set
     * @return this builder instance
     */
    @NotNull public Builder valueReference(@NotNull String valueReference) {
      putValue("valueReference", valueReference);
      return this;
    }
    /**
     * A secondary value that provides additional information on the original value, e.g. a reference temperature or a type of measurement.
     * @param structuredValue value to set
     * @return this builder instance
     */
    @NotNull public Builder valueReference(@NotNull StructuredValue structuredValue) {
      putValue("valueReference", structuredValue);
      return this;
    }
    /**
     * A secondary value that provides additional information on the original value, e.g. a reference temperature or a type of measurement.
     * @param structuredValue value to set
     * @return this builder instance
     */
    @NotNull public Builder valueReference(@NotNull StructuredValue.Builder structuredValue) {
      putValue("valueReference", structuredValue.build());
      return this;
    }
    /**
     * Remove valueReference property from the builder.
     * If this property is repeatable, all instances are removed.
     * @return this builder instance
     */
    @NotNull public Builder removeValueReference() {
      removeValue("valueReference");
      return this;
    }
    /**
     * Get currently set value for valueReference property in this builder.
     * @return previously set value or {@code null}. If multiple values have been 
     * set to this property, then {@link java.util.Collection} instance will be 
     * returned.
     */
    @Nullable public java.lang.Object getValueReference() {
      return myData.get("valueReference");
    }
    /**
     * This ordering relation for qualitative values indicates that the subject is greater than the object.
     * @param qualitativeValue value to set
     * @return this builder instance
     */
    @NotNull public Builder greater(@NotNull QualitativeValue qualitativeValue) {
      putValue("greater", qualitativeValue);
      return this;
    }
    /**
     * This ordering relation for qualitative values indicates that the subject is greater than the object.
     * @param qualitativeValue value to set
     * @return this builder instance
     */
    @NotNull public Builder greater(@NotNull QualitativeValue.Builder qualitativeValue) {
      putValue("greater", qualitativeValue.build());
      return this;
    }
    /**
     * Remove greater property from the builder.
     * If this property is repeatable, all instances are removed.
     * @return this builder instance
     */
    @NotNull public Builder removeGreater() {
      removeValue("greater");
      return this;
    }
    /**
     * Get currently set value for greater property in this builder.
     * @return previously set value or {@code null}. If multiple values have been 
     * set to this property, then {@link java.util.Collection} instance will be 
     * returned.
     */
    @Nullable public java.lang.Object getGreater() {
      return myData.get("greater");
    }
    /**
     * This ordering relation for qualitative values indicates that the subject is lesser than or equal to the object.
     * @param qualitativeValue value to set
     * @return this builder instance
     */
    @NotNull public Builder lesserOrEqual(@NotNull QualitativeValue qualitativeValue) {
      putValue("lesserOrEqual", qualitativeValue);
      return this;
    }
    /**
     * This ordering relation for qualitative values indicates that the subject is lesser than or equal to the object.
     * @param qualitativeValue value to set
     * @return this builder instance
     */
    @NotNull public Builder lesserOrEqual(@NotNull QualitativeValue.Builder qualitativeValue) {
      putValue("lesserOrEqual", qualitativeValue.build());
      return this;
    }
    /**
     * Remove lesserOrEqual property from the builder.
     * If this property is repeatable, all instances are removed.
     * @return this builder instance
     */
    @NotNull public Builder removeLesserOrEqual() {
      removeValue("lesserOrEqual");
      return this;
    }
    /**
     * Get currently set value for lesserOrEqual property in this builder.
     * @return previously set value or {@code null}. If multiple values have been 
     * set to this property, then {@link java.util.Collection} instance will be 
     * returned.
     */
    @Nullable public java.lang.Object getLesserOrEqual() {
      return myData.get("lesserOrEqual");
    }
    /**
     * This ordering relation for qualitative values indicates that the subject is lesser than the object.
     * @param qualitativeValue value to set
     * @return this builder instance
     */
    @NotNull public Builder lesser(@NotNull QualitativeValue qualitativeValue) {
      putValue("lesser", qualitativeValue);
      return this;
    }
    /**
     * This ordering relation for qualitative values indicates that the subject is lesser than the object.
     * @param qualitativeValue value to set
     * @return this builder instance
     */
    @NotNull public Builder lesser(@NotNull QualitativeValue.Builder qualitativeValue) {
      putValue("lesser", qualitativeValue.build());
      return this;
    }
    /**
     * Remove lesser property from the builder.
     * If this property is repeatable, all instances are removed.
     * @return this builder instance
     */
    @NotNull public Builder removeLesser() {
      removeValue("lesser");
      return this;
    }
    /**
     * Get currently set value for lesser property in this builder.
     * @return previously set value or {@code null}. If multiple values have been 
     * set to this property, then {@link java.util.Collection} instance will be 
     * returned.
     */
    @Nullable public java.lang.Object getLesser() {
      return myData.get("lesser");
    }
    /**
     * A property-value pair representing an additional characteristics of the entitity, e.g. a product feature or another characteristic for which there is no matching property in schema.org.\n\nNote: Publishers should be aware that applications designed to use specific schema.org properties (e.g. http://schema.org/width, http://schema.org/color, http://schema.org/gtin13, ...) will typically expect such data to be provided using those properties, rather than using the generic property/value mechanism.
     * 
     * @param propertyValue value to set
     * @return this builder instance
     */
    @NotNull public Builder additionalProperty(@NotNull PropertyValue propertyValue) {
      putValue("additionalProperty", propertyValue);
      return this;
    }
    /**
     * A property-value pair representing an additional characteristics of the entitity, e.g. a product feature or another characteristic for which there is no matching property in schema.org.\n\nNote: Publishers should be aware that applications designed to use specific schema.org properties (e.g. http://schema.org/width, http://schema.org/color, http://schema.org/gtin13, ...) will typically expect such data to be provided using those properties, rather than using the generic property/value mechanism.
     * 
     * @param propertyValue value to set
     * @return this builder instance
     */
    @NotNull public Builder additionalProperty(@NotNull PropertyValue.Builder propertyValue) {
      putValue("additionalProperty", propertyValue.build());
      return this;
    }
    /**
     * Remove additionalProperty property from the builder.
     * If this property is repeatable, all instances are removed.
     * @return this builder instance
     */
    @NotNull public Builder removeAdditionalProperty() {
      removeValue("additionalProperty");
      return this;
    }
    /**
     * Get currently set value for additionalProperty property in this builder.
     * @return previously set value or {@code null}. If multiple values have been 
     * set to this property, then {@link java.util.Collection} instance will be 
     * returned.
     */
    @Nullable public java.lang.Object getAdditionalProperty() {
      return myData.get("additionalProperty");
    }
    /**
     * This ordering relation for qualitative values indicates that the subject is greater than or equal to the object.
     * @param qualitativeValue value to set
     * @return this builder instance
     */
    @NotNull public Builder greaterOrEqual(@NotNull QualitativeValue qualitativeValue) {
      putValue("greaterOrEqual", qualitativeValue);
      return this;
    }
    /**
     * This ordering relation for qualitative values indicates that the subject is greater than or equal to the object.
     * @param qualitativeValue value to set
     * @return this builder instance
     */
    @NotNull public Builder greaterOrEqual(@NotNull QualitativeValue.Builder qualitativeValue) {
      putValue("greaterOrEqual", qualitativeValue.build());
      return this;
    }
    /**
     * Remove greaterOrEqual property from the builder.
     * If this property is repeatable, all instances are removed.
     * @return this builder instance
     */
    @NotNull public Builder removeGreaterOrEqual() {
      removeValue("greaterOrEqual");
      return this;
    }
    /**
     * Get currently set value for greaterOrEqual property in this builder.
     * @return previously set value or {@code null}. If multiple values have been 
     * set to this property, then {@link java.util.Collection} instance will be 
     * returned.
     */
    @Nullable public java.lang.Object getGreaterOrEqual() {
      return myData.get("greaterOrEqual");
    }
    /**
     * This ordering relation for qualitative values indicates that the subject is not equal to the object.
     * @param qualitativeValue value to set
     * @return this builder instance
     */
    @NotNull public Builder nonEqual(@NotNull QualitativeValue qualitativeValue) {
      putValue("nonEqual", qualitativeValue);
      return this;
    }
    /**
     * This ordering relation for qualitative values indicates that the subject is not equal to the object.
     * @param qualitativeValue value to set
     * @return this builder instance
     */
    @NotNull public Builder nonEqual(@NotNull QualitativeValue.Builder qualitativeValue) {
      putValue("nonEqual", qualitativeValue.build());
      return this;
    }
    /**
     * Remove nonEqual property from the builder.
     * If this property is repeatable, all instances are removed.
     * @return this builder instance
     */
    @NotNull public Builder removeNonEqual() {
      removeValue("nonEqual");
      return this;
    }
    /**
     * Get currently set value for nonEqual property in this builder.
     * @return previously set value or {@code null}. If multiple values have been 
     * set to this property, then {@link java.util.Collection} instance will be 
     * returned.
     */
    @Nullable public java.lang.Object getNonEqual() {
      return myData.get("nonEqual");
    }
    /**
     * This ordering relation for qualitative values indicates that the subject is equal to the object.
     * @param qualitativeValue value to set
     * @return this builder instance
     */
    @NotNull public Builder equal(@NotNull QualitativeValue qualitativeValue) {
      putValue("equal", qualitativeValue);
      return this;
    }
    /**
     * This ordering relation for qualitative values indicates that the subject is equal to the object.
     * @param qualitativeValue value to set
     * @return this builder instance
     */
    @NotNull public Builder equal(@NotNull QualitativeValue.Builder qualitativeValue) {
      putValue("equal", qualitativeValue.build());
      return this;
    }
    /**
     * Remove equal property from the builder.
     * If this property is repeatable, all instances are removed.
     * @return this builder instance
     */
    @NotNull public Builder removeEqual() {
      removeValue("equal");
      return this;
    }
    /**
     * Get currently set value for equal property in this builder.
     * @return previously set value or {@code null}. If multiple values have been 
     * set to this property, then {@link java.util.Collection} instance will be 
     * returned.
     */
    @Nullable public java.lang.Object getEqual() {
      return myData.get("equal");
    }
    /**
     * Relates a term (i.e. a property, class or enumeration) to one that supersedes it.
     * @param enumeration value to set
     * @return this builder instance
     */
    @NotNull public Builder supersededBy(@NotNull Enumeration enumeration) {
      putValue("supersededBy", enumeration);
      return this;
    }
    /**
     * Relates a term (i.e. a property, class or enumeration) to one that supersedes it.
     * @param enumeration value to set
     * @return this builder instance
     */
    @NotNull public Builder supersededBy(@NotNull Enumeration.Builder enumeration) {
      putValue("supersededBy", enumeration.build());
      return this;
    }
    /**
     * Relates a term (i.e. a property, class or enumeration) to one that supersedes it.
     * @param property value to set
     * @return this builder instance
     */
    @NotNull public Builder supersededBy(@NotNull Property property) {
      putValue("supersededBy", property);
      return this;
    }
    /**
     * Relates a term (i.e. a property, class or enumeration) to one that supersedes it.
     * @param property value to set
     * @return this builder instance
     */
    @NotNull public Builder supersededBy(@NotNull Property.Builder property) {
      putValue("supersededBy", property.build());
      return this;
    }
    /**
     * Remove supersededBy property from the builder.
     * If this property is repeatable, all instances are removed.
     * @return this builder instance
     */
    @NotNull public Builder removeSupersededBy() {
      removeValue("supersededBy");
      return this;
    }
    /**
     * Get currently set value for supersededBy property in this builder.
     * @return previously set value or {@code null}. If multiple values have been 
     * set to this property, then {@link java.util.Collection} instance will be 
     * returned.
     */
    @Nullable public java.lang.Object getSupersededBy() {
      return myData.get("supersededBy");
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
      if ("suggestedMeasurement".equals(key) && value instanceof QuantitativeValue) { this.suggestedMeasurement((QuantitativeValue)value); return; }
      if ("suggestedMeasurements".equals(key) && value instanceof QuantitativeValue) { this.suggestedMeasurement((QuantitativeValue)value); return; }
      if ("sizeGroup".equals(key) && value instanceof SizeGroupEnumeration) { this.sizeGroup((SizeGroupEnumeration)value); return; }
      if ("sizeGroups".equals(key) && value instanceof SizeGroupEnumeration) { this.sizeGroup((SizeGroupEnumeration)value); return; }
      if ("sizeGroup".equals(key) && value instanceof String) { this.sizeGroup((String)value); return; }
      if ("sizeGroups".equals(key) && value instanceof String) { this.sizeGroup((String)value); return; }
      if ("sizeSystem".equals(key) && value instanceof SizeSystemEnumeration) { this.sizeSystem((SizeSystemEnumeration)value); return; }
      if ("sizeSystems".equals(key) && value instanceof SizeSystemEnumeration) { this.sizeSystem((SizeSystemEnumeration)value); return; }
      if ("sizeSystem".equals(key) && value instanceof String) { this.sizeSystem((String)value); return; }
      if ("sizeSystems".equals(key) && value instanceof String) { this.sizeSystem((String)value); return; }
      if ("suggestedGender".equals(key) && value instanceof GenderType) { this.suggestedGender((GenderType)value); return; }
      if ("suggestedGenders".equals(key) && value instanceof GenderType) { this.suggestedGender((GenderType)value); return; }
      if ("suggestedGender".equals(key) && value instanceof String) { this.suggestedGender((String)value); return; }
      if ("suggestedGenders".equals(key) && value instanceof String) { this.suggestedGender((String)value); return; }
      if ("suggestedAge".equals(key) && value instanceof QuantitativeValue) { this.suggestedAge((QuantitativeValue)value); return; }
      if ("suggestedAges".equals(key) && value instanceof QuantitativeValue) { this.suggestedAge((QuantitativeValue)value); return; }
      if ("hasMeasurement".equals(key) && value instanceof QuantitativeValue) { this.hasMeasurement((QuantitativeValue)value); return; }
      if ("hasMeasurements".equals(key) && value instanceof QuantitativeValue) { this.hasMeasurement((QuantitativeValue)value); return; }
      super.fromMap(key, value);
    }
  }
  
}
