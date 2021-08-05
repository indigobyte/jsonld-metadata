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
 * A predefined value for a product characteristic, e.g. the power cord plug type 'US' or the garment sizes 'S', 'M', 'L', and 'XL'.
 */
public class QualitativeValue extends Enumeration {
  /**
   * A secondary value that provides additional information on the original value, e.g. a reference temperature or a type of measurement.
   */
  @JsonIgnore public DefinedTerm getValueReferenceDefinedTerm() {
    return (DefinedTerm) getValue("valueReference");
  }
  /**
   * A secondary value that provides additional information on the original value, e.g. a reference temperature or a type of measurement.
   */
  @JsonIgnore public Collection<DefinedTerm> getValueReferenceDefinedTerms() {
    final Object current = myData.get("valueReference");
    if (current == null) return Collections.emptyList();
    if (current instanceof Collection) {
      return (Collection<DefinedTerm>) current;
    }
    return Arrays.asList((DefinedTerm) current);
  }
  /**
   * A secondary value that provides additional information on the original value, e.g. a reference temperature or a type of measurement.
   */
  @JsonIgnore public Enumeration getValueReferenceEnumeration() {
    return (Enumeration) getValue("valueReference");
  }
  /**
   * A secondary value that provides additional information on the original value, e.g. a reference temperature or a type of measurement.
   */
  @JsonIgnore public Collection<Enumeration> getValueReferenceEnumerations() {
    final Object current = myData.get("valueReference");
    if (current == null) return Collections.emptyList();
    if (current instanceof Collection) {
      return (Collection<Enumeration>) current;
    }
    return Arrays.asList((Enumeration) current);
  }
  /**
   * A secondary value that provides additional information on the original value, e.g. a reference temperature or a type of measurement.
   */
  @JsonIgnore public MeasurementTypeEnumeration getValueReferenceMeasurementTypeEnumeration() {
    return (MeasurementTypeEnumeration) getValue("valueReference");
  }
  /**
   * A secondary value that provides additional information on the original value, e.g. a reference temperature or a type of measurement.
   */
  @JsonIgnore public Collection<MeasurementTypeEnumeration> getValueReferenceMeasurementTypeEnumerations() {
    final Object current = myData.get("valueReference");
    if (current == null) return Collections.emptyList();
    if (current instanceof Collection) {
      return (Collection<MeasurementTypeEnumeration>) current;
    }
    return Arrays.asList((MeasurementTypeEnumeration) current);
  }
  /**
   * A secondary value that provides additional information on the original value, e.g. a reference temperature or a type of measurement.
   */
  @JsonIgnore public PropertyValue getValueReferencePropertyValue() {
    return (PropertyValue) getValue("valueReference");
  }
  /**
   * A secondary value that provides additional information on the original value, e.g. a reference temperature or a type of measurement.
   */
  @JsonIgnore public Collection<PropertyValue> getValueReferencePropertyValues() {
    final Object current = myData.get("valueReference");
    if (current == null) return Collections.emptyList();
    if (current instanceof Collection) {
      return (Collection<PropertyValue>) current;
    }
    return Arrays.asList((PropertyValue) current);
  }
  /**
   * A secondary value that provides additional information on the original value, e.g. a reference temperature or a type of measurement.
   */
  @JsonIgnore public QualitativeValue getValueReferenceQualitativeValue() {
    return (QualitativeValue) getValue("valueReference");
  }
  /**
   * A secondary value that provides additional information on the original value, e.g. a reference temperature or a type of measurement.
   */
  @JsonIgnore public Collection<QualitativeValue> getValueReferenceQualitativeValues() {
    final Object current = myData.get("valueReference");
    if (current == null) return Collections.emptyList();
    if (current instanceof Collection) {
      return (Collection<QualitativeValue>) current;
    }
    return Arrays.asList((QualitativeValue) current);
  }
  /**
   * A secondary value that provides additional information on the original value, e.g. a reference temperature or a type of measurement.
   */
  @JsonIgnore public QuantitativeValue getValueReferenceQuantitativeValue() {
    return (QuantitativeValue) getValue("valueReference");
  }
  /**
   * A secondary value that provides additional information on the original value, e.g. a reference temperature or a type of measurement.
   */
  @JsonIgnore public Collection<QuantitativeValue> getValueReferenceQuantitativeValues() {
    final Object current = myData.get("valueReference");
    if (current == null) return Collections.emptyList();
    if (current instanceof Collection) {
      return (Collection<QuantitativeValue>) current;
    }
    return Arrays.asList((QuantitativeValue) current);
  }
  /**
   * A secondary value that provides additional information on the original value, e.g. a reference temperature or a type of measurement.
   */
  @JsonIgnore public String getValueReferenceString() {
    return (String) getValue("valueReference");
  }
  /**
   * A secondary value that provides additional information on the original value, e.g. a reference temperature or a type of measurement.
   */
  @JsonIgnore public Collection<String> getValueReferenceStrings() {
    final Object current = myData.get("valueReference");
    if (current == null) return Collections.emptyList();
    if (current instanceof Collection) {
      return (Collection<String>) current;
    }
    return Arrays.asList((String) current);
  }
  /**
   * A secondary value that provides additional information on the original value, e.g. a reference temperature or a type of measurement.
   */
  @JsonIgnore public StructuredValue getValueReferenceStructuredValue() {
    return (StructuredValue) getValue("valueReference");
  }
  /**
   * A secondary value that provides additional information on the original value, e.g. a reference temperature or a type of measurement.
   */
  @JsonIgnore public Collection<StructuredValue> getValueReferenceStructuredValues() {
    final Object current = myData.get("valueReference");
    if (current == null) return Collections.emptyList();
    if (current instanceof Collection) {
      return (Collection<StructuredValue>) current;
    }
    return Arrays.asList((StructuredValue) current);
  }
  /**
   * This ordering relation for qualitative values indicates that the subject is greater than the object.
   */
  @JsonIgnore public QualitativeValue getGreater() {
    return (QualitativeValue) getValue("greater");
  }
  /**
   * This ordering relation for qualitative values indicates that the subject is greater than the object.
   */
  @JsonIgnore public Collection<QualitativeValue> getGreaters() {
    final Object current = myData.get("greater");
    if (current == null) return Collections.emptyList();
    if (current instanceof Collection) {
      return (Collection<QualitativeValue>) current;
    }
    return Arrays.asList((QualitativeValue) current);
  }
  /**
   * This ordering relation for qualitative values indicates that the subject is lesser than or equal to the object.
   */
  @JsonIgnore public QualitativeValue getLesserOrEqual() {
    return (QualitativeValue) getValue("lesserOrEqual");
  }
  /**
   * This ordering relation for qualitative values indicates that the subject is lesser than or equal to the object.
   */
  @JsonIgnore public Collection<QualitativeValue> getLesserOrEquals() {
    final Object current = myData.get("lesserOrEqual");
    if (current == null) return Collections.emptyList();
    if (current instanceof Collection) {
      return (Collection<QualitativeValue>) current;
    }
    return Arrays.asList((QualitativeValue) current);
  }
  /**
   * This ordering relation for qualitative values indicates that the subject is lesser than the object.
   */
  @JsonIgnore public QualitativeValue getLesser() {
    return (QualitativeValue) getValue("lesser");
  }
  /**
   * This ordering relation for qualitative values indicates that the subject is lesser than the object.
   */
  @JsonIgnore public Collection<QualitativeValue> getLessers() {
    final Object current = myData.get("lesser");
    if (current == null) return Collections.emptyList();
    if (current instanceof Collection) {
      return (Collection<QualitativeValue>) current;
    }
    return Arrays.asList((QualitativeValue) current);
  }
  /**
   * A property-value pair representing an additional characteristics of the entitity, e.g. a product feature or another characteristic for which there is no matching property in schema.org.\n\nNote: Publishers should be aware that applications designed to use specific schema.org properties (e.g. http://schema.org/width, http://schema.org/color, http://schema.org/gtin13, ...) will typically expect such data to be provided using those properties, rather than using the generic property/value mechanism.
   * 
   */
  @JsonIgnore public PropertyValue getAdditionalProperty() {
    return (PropertyValue) getValue("additionalProperty");
  }
  /**
   * A property-value pair representing an additional characteristics of the entitity, e.g. a product feature or another characteristic for which there is no matching property in schema.org.\n\nNote: Publishers should be aware that applications designed to use specific schema.org properties (e.g. http://schema.org/width, http://schema.org/color, http://schema.org/gtin13, ...) will typically expect such data to be provided using those properties, rather than using the generic property/value mechanism.
   * 
   */
  @JsonIgnore public Collection<PropertyValue> getAdditionalPropertys() {
    final Object current = myData.get("additionalProperty");
    if (current == null) return Collections.emptyList();
    if (current instanceof Collection) {
      return (Collection<PropertyValue>) current;
    }
    return Arrays.asList((PropertyValue) current);
  }
  /**
   * This ordering relation for qualitative values indicates that the subject is greater than or equal to the object.
   */
  @JsonIgnore public QualitativeValue getGreaterOrEqual() {
    return (QualitativeValue) getValue("greaterOrEqual");
  }
  /**
   * This ordering relation for qualitative values indicates that the subject is greater than or equal to the object.
   */
  @JsonIgnore public Collection<QualitativeValue> getGreaterOrEquals() {
    final Object current = myData.get("greaterOrEqual");
    if (current == null) return Collections.emptyList();
    if (current instanceof Collection) {
      return (Collection<QualitativeValue>) current;
    }
    return Arrays.asList((QualitativeValue) current);
  }
  /**
   * This ordering relation for qualitative values indicates that the subject is not equal to the object.
   */
  @JsonIgnore public QualitativeValue getNonEqual() {
    return (QualitativeValue) getValue("nonEqual");
  }
  /**
   * This ordering relation for qualitative values indicates that the subject is not equal to the object.
   */
  @JsonIgnore public Collection<QualitativeValue> getNonEquals() {
    final Object current = myData.get("nonEqual");
    if (current == null) return Collections.emptyList();
    if (current instanceof Collection) {
      return (Collection<QualitativeValue>) current;
    }
    return Arrays.asList((QualitativeValue) current);
  }
  /**
   * This ordering relation for qualitative values indicates that the subject is equal to the object.
   */
  @JsonIgnore public QualitativeValue getEqual() {
    return (QualitativeValue) getValue("equal");
  }
  /**
   * This ordering relation for qualitative values indicates that the subject is equal to the object.
   */
  @JsonIgnore public Collection<QualitativeValue> getEquals() {
    final Object current = myData.get("equal");
    if (current == null) return Collections.emptyList();
    if (current instanceof Collection) {
      return (Collection<QualitativeValue>) current;
    }
    return Arrays.asList((QualitativeValue) current);
  }
  protected QualitativeValue(java.util.Map<String,Object> data) {
    super(data);
  }
  
  /**
   * Builder for {@link QualitativeValue}
   */
  public static class Builder extends Enumeration.Builder {
    public Builder(@NotNull HashMap<String,Object> data) {
      super(data);
    }
    @NotNull public QualitativeValue build() {
      return new QualitativeValue(myData);
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
      if ("valueReference".equals(key) && value instanceof DefinedTerm) { this.valueReference((DefinedTerm)value); return; }
      if ("valueReferences".equals(key) && value instanceof DefinedTerm) { this.valueReference((DefinedTerm)value); return; }
      if ("valueReference".equals(key) && value instanceof Enumeration) { this.valueReference((Enumeration)value); return; }
      if ("valueReferences".equals(key) && value instanceof Enumeration) { this.valueReference((Enumeration)value); return; }
      if ("valueReference".equals(key) && value instanceof MeasurementTypeEnumeration) { this.valueReference((MeasurementTypeEnumeration)value); return; }
      if ("valueReferences".equals(key) && value instanceof MeasurementTypeEnumeration) { this.valueReference((MeasurementTypeEnumeration)value); return; }
      if ("valueReference".equals(key) && value instanceof PropertyValue) { this.valueReference((PropertyValue)value); return; }
      if ("valueReferences".equals(key) && value instanceof PropertyValue) { this.valueReference((PropertyValue)value); return; }
      if ("valueReference".equals(key) && value instanceof QualitativeValue) { this.valueReference((QualitativeValue)value); return; }
      if ("valueReferences".equals(key) && value instanceof QualitativeValue) { this.valueReference((QualitativeValue)value); return; }
      if ("valueReference".equals(key) && value instanceof QuantitativeValue) { this.valueReference((QuantitativeValue)value); return; }
      if ("valueReferences".equals(key) && value instanceof QuantitativeValue) { this.valueReference((QuantitativeValue)value); return; }
      if ("valueReference".equals(key) && value instanceof String) { this.valueReference((String)value); return; }
      if ("valueReferences".equals(key) && value instanceof String) { this.valueReference((String)value); return; }
      if ("valueReference".equals(key) && value instanceof StructuredValue) { this.valueReference((StructuredValue)value); return; }
      if ("valueReferences".equals(key) && value instanceof StructuredValue) { this.valueReference((StructuredValue)value); return; }
      if ("greater".equals(key) && value instanceof QualitativeValue) { this.greater((QualitativeValue)value); return; }
      if ("greaters".equals(key) && value instanceof QualitativeValue) { this.greater((QualitativeValue)value); return; }
      if ("lesserOrEqual".equals(key) && value instanceof QualitativeValue) { this.lesserOrEqual((QualitativeValue)value); return; }
      if ("lesserOrEquals".equals(key) && value instanceof QualitativeValue) { this.lesserOrEqual((QualitativeValue)value); return; }
      if ("lesser".equals(key) && value instanceof QualitativeValue) { this.lesser((QualitativeValue)value); return; }
      if ("lessers".equals(key) && value instanceof QualitativeValue) { this.lesser((QualitativeValue)value); return; }
      if ("additionalProperty".equals(key) && value instanceof PropertyValue) { this.additionalProperty((PropertyValue)value); return; }
      if ("additionalPropertys".equals(key) && value instanceof PropertyValue) { this.additionalProperty((PropertyValue)value); return; }
      if ("greaterOrEqual".equals(key) && value instanceof QualitativeValue) { this.greaterOrEqual((QualitativeValue)value); return; }
      if ("greaterOrEquals".equals(key) && value instanceof QualitativeValue) { this.greaterOrEqual((QualitativeValue)value); return; }
      if ("nonEqual".equals(key) && value instanceof QualitativeValue) { this.nonEqual((QualitativeValue)value); return; }
      if ("nonEquals".equals(key) && value instanceof QualitativeValue) { this.nonEqual((QualitativeValue)value); return; }
      if ("equal".equals(key) && value instanceof QualitativeValue) { this.equal((QualitativeValue)value); return; }
      if ("equals".equals(key) && value instanceof QualitativeValue) { this.equal((QualitativeValue)value); return; }
      super.fromMap(key, value);
    }
  }
  
}
