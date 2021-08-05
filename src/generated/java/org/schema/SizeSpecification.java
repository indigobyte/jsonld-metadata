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
 * Size related properties of a product, typically a size code ([[name]]) and optionally a [[sizeSystem]], [[sizeGroup]], and product measurements ([[hasMeasurement]]). In addition, the intended audience can be defined through [[suggestedAge]], [[suggestedGender]], and suggested body measurements ([[suggestedMeasurement]]).
 */
public class SizeSpecification extends QualitativeValue {
  /**
   * A suggested range of body measurements for the intended audience or person, for example inseam between 32 and 34 inches or height between 170 and 190 cm. Typically found on a size chart for wearable products.
   */
  @JsonIgnore public QuantitativeValue getSuggestedMeasurement() {
    return (QuantitativeValue) getValue("suggestedMeasurement");
  }
  /**
   * A suggested range of body measurements for the intended audience or person, for example inseam between 32 and 34 inches or height between 170 and 190 cm. Typically found on a size chart for wearable products.
   */
  @JsonIgnore public Collection<QuantitativeValue> getSuggestedMeasurements() {
    final Object current = myData.get("suggestedMeasurement");
    if (current == null) return Collections.emptyList();
    if (current instanceof Collection) {
      return (Collection<QuantitativeValue>) current;
    }
    return Arrays.asList((QuantitativeValue) current);
  }
  /**
   * The size group (also known as &quot;size type&quot;) for a product's size. Size groups are common in the fashion industry to define size segments and suggested audiences for wearable products. Multiple values can be combined, for example &quot;men's big and tall&quot;, &quot;petite maternity&quot; or &quot;regular&quot;
   */
  @JsonIgnore public SizeGroupEnumeration getSizeGroupSizeGroupEnumeration() {
    return (SizeGroupEnumeration) getValue("sizeGroup");
  }
  /**
   * The size group (also known as &quot;size type&quot;) for a product's size. Size groups are common in the fashion industry to define size segments and suggested audiences for wearable products. Multiple values can be combined, for example &quot;men's big and tall&quot;, &quot;petite maternity&quot; or &quot;regular&quot;
   */
  @JsonIgnore public Collection<SizeGroupEnumeration> getSizeGroupSizeGroupEnumerations() {
    final Object current = myData.get("sizeGroup");
    if (current == null) return Collections.emptyList();
    if (current instanceof Collection) {
      return (Collection<SizeGroupEnumeration>) current;
    }
    return Arrays.asList((SizeGroupEnumeration) current);
  }
  /**
   * The size group (also known as &quot;size type&quot;) for a product's size. Size groups are common in the fashion industry to define size segments and suggested audiences for wearable products. Multiple values can be combined, for example &quot;men's big and tall&quot;, &quot;petite maternity&quot; or &quot;regular&quot;
   */
  @JsonIgnore public String getSizeGroupString() {
    return (String) getValue("sizeGroup");
  }
  /**
   * The size group (also known as &quot;size type&quot;) for a product's size. Size groups are common in the fashion industry to define size segments and suggested audiences for wearable products. Multiple values can be combined, for example &quot;men's big and tall&quot;, &quot;petite maternity&quot; or &quot;regular&quot;
   */
  @JsonIgnore public Collection<String> getSizeGroupStrings() {
    final Object current = myData.get("sizeGroup");
    if (current == null) return Collections.emptyList();
    if (current instanceof Collection) {
      return (Collection<String>) current;
    }
    return Arrays.asList((String) current);
  }
  /**
   * The size system used to identify a product's size. Typically either a standard (for example, &quot;GS1&quot; or &quot;ISO-EN13402&quot;), country code (for example &quot;US&quot; or &quot;JP&quot;), or a measuring system (for example &quot;Metric&quot; or &quot;Imperial&quot;).
   */
  @JsonIgnore public SizeSystemEnumeration getSizeSystemSizeSystemEnumeration() {
    return (SizeSystemEnumeration) getValue("sizeSystem");
  }
  /**
   * The size system used to identify a product's size. Typically either a standard (for example, &quot;GS1&quot; or &quot;ISO-EN13402&quot;), country code (for example &quot;US&quot; or &quot;JP&quot;), or a measuring system (for example &quot;Metric&quot; or &quot;Imperial&quot;).
   */
  @JsonIgnore public Collection<SizeSystemEnumeration> getSizeSystemSizeSystemEnumerations() {
    final Object current = myData.get("sizeSystem");
    if (current == null) return Collections.emptyList();
    if (current instanceof Collection) {
      return (Collection<SizeSystemEnumeration>) current;
    }
    return Arrays.asList((SizeSystemEnumeration) current);
  }
  /**
   * The size system used to identify a product's size. Typically either a standard (for example, &quot;GS1&quot; or &quot;ISO-EN13402&quot;), country code (for example &quot;US&quot; or &quot;JP&quot;), or a measuring system (for example &quot;Metric&quot; or &quot;Imperial&quot;).
   */
  @JsonIgnore public String getSizeSystemString() {
    return (String) getValue("sizeSystem");
  }
  /**
   * The size system used to identify a product's size. Typically either a standard (for example, &quot;GS1&quot; or &quot;ISO-EN13402&quot;), country code (for example &quot;US&quot; or &quot;JP&quot;), or a measuring system (for example &quot;Metric&quot; or &quot;Imperial&quot;).
   */
  @JsonIgnore public Collection<String> getSizeSystemStrings() {
    final Object current = myData.get("sizeSystem");
    if (current == null) return Collections.emptyList();
    if (current instanceof Collection) {
      return (Collection<String>) current;
    }
    return Arrays.asList((String) current);
  }
  /**
   * The suggested gender of the intended person or audience, for example &quot;male&quot;, &quot;female&quot;, or &quot;unisex&quot;.
   */
  @JsonIgnore public GenderType getSuggestedGenderGenderType() {
    return (GenderType) getValue("suggestedGender");
  }
  /**
   * The suggested gender of the intended person or audience, for example &quot;male&quot;, &quot;female&quot;, or &quot;unisex&quot;.
   */
  @JsonIgnore public Collection<GenderType> getSuggestedGenderGenderTypes() {
    final Object current = myData.get("suggestedGender");
    if (current == null) return Collections.emptyList();
    if (current instanceof Collection) {
      return (Collection<GenderType>) current;
    }
    return Arrays.asList((GenderType) current);
  }
  /**
   * The suggested gender of the intended person or audience, for example &quot;male&quot;, &quot;female&quot;, or &quot;unisex&quot;.
   */
  @JsonIgnore public String getSuggestedGenderString() {
    return (String) getValue("suggestedGender");
  }
  /**
   * The suggested gender of the intended person or audience, for example &quot;male&quot;, &quot;female&quot;, or &quot;unisex&quot;.
   */
  @JsonIgnore public Collection<String> getSuggestedGenderStrings() {
    final Object current = myData.get("suggestedGender");
    if (current == null) return Collections.emptyList();
    if (current instanceof Collection) {
      return (Collection<String>) current;
    }
    return Arrays.asList((String) current);
  }
  /**
   * The age or age range for the intended audience or person, for example 3-12 months for infants, 1-5 years for toddlers.
   */
  @JsonIgnore public QuantitativeValue getSuggestedAge() {
    return (QuantitativeValue) getValue("suggestedAge");
  }
  /**
   * The age or age range for the intended audience or person, for example 3-12 months for infants, 1-5 years for toddlers.
   */
  @JsonIgnore public Collection<QuantitativeValue> getSuggestedAges() {
    final Object current = myData.get("suggestedAge");
    if (current == null) return Collections.emptyList();
    if (current instanceof Collection) {
      return (Collection<QuantitativeValue>) current;
    }
    return Arrays.asList((QuantitativeValue) current);
  }
  /**
   * A product measurement, for example the inseam of pants, the wheel size of a bicycle, or the gauge of a screw. Usually an exact measurement, but can also be a range of measurements for adjustable products, for example belts and ski bindings.
   */
  @JsonIgnore public QuantitativeValue getHasMeasurement() {
    return (QuantitativeValue) getValue("hasMeasurement");
  }
  /**
   * A product measurement, for example the inseam of pants, the wheel size of a bicycle, or the gauge of a screw. Usually an exact measurement, but can also be a range of measurements for adjustable products, for example belts and ski bindings.
   */
  @JsonIgnore public Collection<QuantitativeValue> getHasMeasurements() {
    final Object current = myData.get("hasMeasurement");
    if (current == null) return Collections.emptyList();
    if (current instanceof Collection) {
      return (Collection<QuantitativeValue>) current;
    }
    return Arrays.asList((QuantitativeValue) current);
  }
  protected SizeSpecification(java.util.Map<String,Object> data) {
    super(data);
  }
  
  /**
   * Builder for {@link SizeSpecification}
   */
  public static class Builder extends QualitativeValue.Builder {
    public Builder(@NotNull HashMap<String,Object> data) {
      super(data);
    }
    @NotNull public SizeSpecification build() {
      return new SizeSpecification(myData);
    }
    /**
     * A suggested range of body measurements for the intended audience or person, for example inseam between 32 and 34 inches or height between 170 and 190 cm. Typically found on a size chart for wearable products.
     */
    @NotNull public Builder suggestedMeasurement(@NotNull QuantitativeValue quantitativeValue) {
      putValue("suggestedMeasurement", quantitativeValue);
      return this;
    }
    /**
     * A suggested range of body measurements for the intended audience or person, for example inseam between 32 and 34 inches or height between 170 and 190 cm. Typically found on a size chart for wearable products.
     */
    @NotNull public Builder suggestedMeasurement(@NotNull QuantitativeValue.Builder quantitativeValue) {
      putValue("suggestedMeasurement", quantitativeValue.build());
      return this;
    }
    /**
     * The size group (also known as &quot;size type&quot;) for a product's size. Size groups are common in the fashion industry to define size segments and suggested audiences for wearable products. Multiple values can be combined, for example &quot;men's big and tall&quot;, &quot;petite maternity&quot; or &quot;regular&quot;
     */
    @NotNull public Builder sizeGroup(@NotNull SizeGroupEnumeration sizeGroupEnumeration) {
      putValue("sizeGroup", sizeGroupEnumeration);
      return this;
    }
    /**
     * The size group (also known as &quot;size type&quot;) for a product's size. Size groups are common in the fashion industry to define size segments and suggested audiences for wearable products. Multiple values can be combined, for example &quot;men's big and tall&quot;, &quot;petite maternity&quot; or &quot;regular&quot;
     */
    @NotNull public Builder sizeGroup(@NotNull String sizeGroup) {
      putValue("sizeGroup", sizeGroup);
      return this;
    }
    /**
     * The size system used to identify a product's size. Typically either a standard (for example, &quot;GS1&quot; or &quot;ISO-EN13402&quot;), country code (for example &quot;US&quot; or &quot;JP&quot;), or a measuring system (for example &quot;Metric&quot; or &quot;Imperial&quot;).
     */
    @NotNull public Builder sizeSystem(@NotNull SizeSystemEnumeration sizeSystemEnumeration) {
      putValue("sizeSystem", sizeSystemEnumeration);
      return this;
    }
    /**
     * The size system used to identify a product's size. Typically either a standard (for example, &quot;GS1&quot; or &quot;ISO-EN13402&quot;), country code (for example &quot;US&quot; or &quot;JP&quot;), or a measuring system (for example &quot;Metric&quot; or &quot;Imperial&quot;).
     */
    @NotNull public Builder sizeSystem(@NotNull String sizeSystem) {
      putValue("sizeSystem", sizeSystem);
      return this;
    }
    /**
     * The suggested gender of the intended person or audience, for example &quot;male&quot;, &quot;female&quot;, or &quot;unisex&quot;.
     */
    @NotNull public Builder suggestedGender(@NotNull GenderType genderType) {
      putValue("suggestedGender", genderType);
      return this;
    }
    /**
     * The suggested gender of the intended person or audience, for example &quot;male&quot;, &quot;female&quot;, or &quot;unisex&quot;.
     */
    @NotNull public Builder suggestedGender(@NotNull String suggestedGender) {
      putValue("suggestedGender", suggestedGender);
      return this;
    }
    /**
     * The age or age range for the intended audience or person, for example 3-12 months for infants, 1-5 years for toddlers.
     */
    @NotNull public Builder suggestedAge(@NotNull QuantitativeValue quantitativeValue) {
      putValue("suggestedAge", quantitativeValue);
      return this;
    }
    /**
     * The age or age range for the intended audience or person, for example 3-12 months for infants, 1-5 years for toddlers.
     */
    @NotNull public Builder suggestedAge(@NotNull QuantitativeValue.Builder quantitativeValue) {
      putValue("suggestedAge", quantitativeValue.build());
      return this;
    }
    /**
     * A product measurement, for example the inseam of pants, the wheel size of a bicycle, or the gauge of a screw. Usually an exact measurement, but can also be a range of measurements for adjustable products, for example belts and ski bindings.
     */
    @NotNull public Builder hasMeasurement(@NotNull QuantitativeValue quantitativeValue) {
      putValue("hasMeasurement", quantitativeValue);
      return this;
    }
    /**
     * A product measurement, for example the inseam of pants, the wheel size of a bicycle, or the gauge of a screw. Usually an exact measurement, but can also be a range of measurements for adjustable products, for example belts and ski bindings.
     */
    @NotNull public Builder hasMeasurement(@NotNull QuantitativeValue.Builder quantitativeValue) {
      putValue("hasMeasurement", quantitativeValue.build());
      return this;
    }
    /**
     * A secondary value that provides additional information on the original value, e.g. a reference temperature or a type of measurement.
     */
    @NotNull public Builder valueReference(@NotNull DefinedTerm definedTerm) {
      putValue("valueReference", definedTerm);
      return this;
    }
    /**
     * A secondary value that provides additional information on the original value, e.g. a reference temperature or a type of measurement.
     */
    @NotNull public Builder valueReference(@NotNull DefinedTerm.Builder definedTerm) {
      putValue("valueReference", definedTerm.build());
      return this;
    }
    /**
     * A secondary value that provides additional information on the original value, e.g. a reference temperature or a type of measurement.
     */
    @NotNull public Builder valueReference(@NotNull Enumeration enumeration) {
      putValue("valueReference", enumeration);
      return this;
    }
    /**
     * A secondary value that provides additional information on the original value, e.g. a reference temperature or a type of measurement.
     */
    @NotNull public Builder valueReference(@NotNull MeasurementTypeEnumeration measurementTypeEnumeration) {
      putValue("valueReference", measurementTypeEnumeration);
      return this;
    }
    /**
     * A secondary value that provides additional information on the original value, e.g. a reference temperature or a type of measurement.
     */
    @NotNull public Builder valueReference(@NotNull PropertyValue propertyValue) {
      putValue("valueReference", propertyValue);
      return this;
    }
    /**
     * A secondary value that provides additional information on the original value, e.g. a reference temperature or a type of measurement.
     */
    @NotNull public Builder valueReference(@NotNull PropertyValue.Builder propertyValue) {
      putValue("valueReference", propertyValue.build());
      return this;
    }
    /**
     * A secondary value that provides additional information on the original value, e.g. a reference temperature or a type of measurement.
     */
    @NotNull public Builder valueReference(@NotNull QualitativeValue qualitativeValue) {
      putValue("valueReference", qualitativeValue);
      return this;
    }
    /**
     * A secondary value that provides additional information on the original value, e.g. a reference temperature or a type of measurement.
     */
    @NotNull public Builder valueReference(@NotNull QualitativeValue.Builder qualitativeValue) {
      putValue("valueReference", qualitativeValue.build());
      return this;
    }
    /**
     * A secondary value that provides additional information on the original value, e.g. a reference temperature or a type of measurement.
     */
    @NotNull public Builder valueReference(@NotNull QuantitativeValue quantitativeValue) {
      putValue("valueReference", quantitativeValue);
      return this;
    }
    /**
     * A secondary value that provides additional information on the original value, e.g. a reference temperature or a type of measurement.
     */
    @NotNull public Builder valueReference(@NotNull QuantitativeValue.Builder quantitativeValue) {
      putValue("valueReference", quantitativeValue.build());
      return this;
    }
    /**
     * A secondary value that provides additional information on the original value, e.g. a reference temperature or a type of measurement.
     */
    @NotNull public Builder valueReference(@NotNull String valueReference) {
      putValue("valueReference", valueReference);
      return this;
    }
    /**
     * A secondary value that provides additional information on the original value, e.g. a reference temperature or a type of measurement.
     */
    @NotNull public Builder valueReference(@NotNull StructuredValue structuredValue) {
      putValue("valueReference", structuredValue);
      return this;
    }
    /**
     * A secondary value that provides additional information on the original value, e.g. a reference temperature or a type of measurement.
     */
    @NotNull public Builder valueReference(@NotNull StructuredValue.Builder structuredValue) {
      putValue("valueReference", structuredValue.build());
      return this;
    }
    /**
     * This ordering relation for qualitative values indicates that the subject is greater than the object.
     */
    @NotNull public Builder greater(@NotNull QualitativeValue qualitativeValue) {
      putValue("greater", qualitativeValue);
      return this;
    }
    /**
     * This ordering relation for qualitative values indicates that the subject is greater than the object.
     */
    @NotNull public Builder greater(@NotNull QualitativeValue.Builder qualitativeValue) {
      putValue("greater", qualitativeValue.build());
      return this;
    }
    /**
     * This ordering relation for qualitative values indicates that the subject is lesser than or equal to the object.
     */
    @NotNull public Builder lesserOrEqual(@NotNull QualitativeValue qualitativeValue) {
      putValue("lesserOrEqual", qualitativeValue);
      return this;
    }
    /**
     * This ordering relation for qualitative values indicates that the subject is lesser than or equal to the object.
     */
    @NotNull public Builder lesserOrEqual(@NotNull QualitativeValue.Builder qualitativeValue) {
      putValue("lesserOrEqual", qualitativeValue.build());
      return this;
    }
    /**
     * This ordering relation for qualitative values indicates that the subject is lesser than the object.
     */
    @NotNull public Builder lesser(@NotNull QualitativeValue qualitativeValue) {
      putValue("lesser", qualitativeValue);
      return this;
    }
    /**
     * This ordering relation for qualitative values indicates that the subject is lesser than the object.
     */
    @NotNull public Builder lesser(@NotNull QualitativeValue.Builder qualitativeValue) {
      putValue("lesser", qualitativeValue.build());
      return this;
    }
    /**
     * A property-value pair representing an additional characteristics of the entitity, e.g. a product feature or another characteristic for which there is no matching property in schema.org.\n\nNote: Publishers should be aware that applications designed to use specific schema.org properties (e.g. http://schema.org/width, http://schema.org/color, http://schema.org/gtin13, ...) will typically expect such data to be provided using those properties, rather than using the generic property/value mechanism.
     * 
     */
    @NotNull public Builder additionalProperty(@NotNull PropertyValue propertyValue) {
      putValue("additionalProperty", propertyValue);
      return this;
    }
    /**
     * A property-value pair representing an additional characteristics of the entitity, e.g. a product feature or another characteristic for which there is no matching property in schema.org.\n\nNote: Publishers should be aware that applications designed to use specific schema.org properties (e.g. http://schema.org/width, http://schema.org/color, http://schema.org/gtin13, ...) will typically expect such data to be provided using those properties, rather than using the generic property/value mechanism.
     * 
     */
    @NotNull public Builder additionalProperty(@NotNull PropertyValue.Builder propertyValue) {
      putValue("additionalProperty", propertyValue.build());
      return this;
    }
    /**
     * This ordering relation for qualitative values indicates that the subject is greater than or equal to the object.
     */
    @NotNull public Builder greaterOrEqual(@NotNull QualitativeValue qualitativeValue) {
      putValue("greaterOrEqual", qualitativeValue);
      return this;
    }
    /**
     * This ordering relation for qualitative values indicates that the subject is greater than or equal to the object.
     */
    @NotNull public Builder greaterOrEqual(@NotNull QualitativeValue.Builder qualitativeValue) {
      putValue("greaterOrEqual", qualitativeValue.build());
      return this;
    }
    /**
     * This ordering relation for qualitative values indicates that the subject is not equal to the object.
     */
    @NotNull public Builder nonEqual(@NotNull QualitativeValue qualitativeValue) {
      putValue("nonEqual", qualitativeValue);
      return this;
    }
    /**
     * This ordering relation for qualitative values indicates that the subject is not equal to the object.
     */
    @NotNull public Builder nonEqual(@NotNull QualitativeValue.Builder qualitativeValue) {
      putValue("nonEqual", qualitativeValue.build());
      return this;
    }
    /**
     * This ordering relation for qualitative values indicates that the subject is equal to the object.
     */
    @NotNull public Builder equal(@NotNull QualitativeValue qualitativeValue) {
      putValue("equal", qualitativeValue);
      return this;
    }
    /**
     * This ordering relation for qualitative values indicates that the subject is equal to the object.
     */
    @NotNull public Builder equal(@NotNull QualitativeValue.Builder qualitativeValue) {
      putValue("equal", qualitativeValue.build());
      return this;
    }
    /**
     * Relates a term (i.e. a property, class or enumeration) to one that supersedes it.
     */
    @NotNull public Builder supersededBy(@NotNull Enumeration enumeration) {
      putValue("supersededBy", enumeration);
      return this;
    }
    /**
     * Relates a term (i.e. a property, class or enumeration) to one that supersedes it.
     */
    @NotNull public Builder supersededBy(@NotNull Enumeration.Builder enumeration) {
      putValue("supersededBy", enumeration.build());
      return this;
    }
    /**
     * Relates a term (i.e. a property, class or enumeration) to one that supersedes it.
     */
    @NotNull public Builder supersededBy(@NotNull Property property) {
      putValue("supersededBy", property);
      return this;
    }
    /**
     * Relates a term (i.e. a property, class or enumeration) to one that supersedes it.
     */
    @NotNull public Builder supersededBy(@NotNull Property.Builder property) {
      putValue("supersededBy", property.build());
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
