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
 * Specifies a location feature by providing a structured value representing a feature of an accommodation as a property-value pair of varying degrees of formality.
 */
public class LocationFeatureSpecification extends PropertyValue {
  /**
   * The date when the item becomes valid.
   * @return validFrom property set by first invocation of validFrom method or {@code null}.
   */
  @JsonIgnore public java.util.Date getValidFrom() {
    return (java.util.Date) getValue("validFrom");
  }
  /**
   * The date when the item becomes valid.
   * @return all validFrom properties as {@link java.util.Collection} or an empty collection 
   * if validFrom was not set.
   */
  @JsonIgnore public java.util.Collection<java.util.Date> getValidFroms() {
    final java.lang.Object current = myData.get("validFrom");
    if (current == null) return Collections.emptyList();
    if (current instanceof java.util.Collection) {
      return (java.util.Collection<java.util.Date>) current;
    }
    return Arrays.asList((java.util.Date) current);
  }
  /**
   * The date after when the item is not valid. For example the end of an offer, salary period, or a period of opening hours.
   * @return validThrough property set by first invocation of validThrough method or {@code null}.
   */
  @JsonIgnore public java.util.Date getValidThrough() {
    return (java.util.Date) getValue("validThrough");
  }
  /**
   * The date after when the item is not valid. For example the end of an offer, salary period, or a period of opening hours.
   * @return all validThrough properties as {@link java.util.Collection} or an empty collection 
   * if validThrough was not set.
   */
  @JsonIgnore public java.util.Collection<java.util.Date> getValidThroughs() {
    final java.lang.Object current = myData.get("validThrough");
    if (current == null) return Collections.emptyList();
    if (current instanceof java.util.Collection) {
      return (java.util.Collection<java.util.Date>) current;
    }
    return Arrays.asList((java.util.Date) current);
  }
  /**
   * The hours during which this service or contact is available.
   * @return hoursAvailable property set by first invocation of hoursAvailable method or {@code null}.
   */
  @JsonIgnore public OpeningHoursSpecification getHoursAvailable() {
    return (OpeningHoursSpecification) getValue("hoursAvailable");
  }
  /**
   * The hours during which this service or contact is available.
   * @return all hoursAvailable properties as {@link java.util.Collection} or an empty collection 
   * if hoursAvailable was not set.
   */
  @JsonIgnore public java.util.Collection<OpeningHoursSpecification> getHoursAvailables() {
    final java.lang.Object current = myData.get("hoursAvailable");
    if (current == null) return Collections.emptyList();
    if (current instanceof java.util.Collection) {
      return (java.util.Collection<OpeningHoursSpecification>) current;
    }
    return Arrays.asList((OpeningHoursSpecification) current);
  }
  protected LocationFeatureSpecification(java.util.Map<String,java.lang.Object> data) {
    super(data);
  }
  /**
   * @return new {@link Builder} initialized with this instance's data
   */
  @NotNull public Builder toBuilder() {
    return new Builder(new HashMap<>(this.myData));
  }
  
  /**
   * Builder for {@link LocationFeatureSpecification}
   */
  public static class Builder extends PropertyValue.Builder {
    public Builder(@NotNull HashMap<String,java.lang.Object> data) {
      super(data);
    }
    @NotNull public LocationFeatureSpecification build() {
      return new LocationFeatureSpecification(myData);
    }
    /**
     * The date when the item becomes valid.
     * @param date value to set
     * @return this builder instance
     */
    @NotNull public Builder validFrom(@NotNull java.util.Date date) {
      putValue("validFrom", date);
      return this;
    }
    /**
     * Remove validFrom property from the builder.
     * If this property is repeatable, all instances are removed.
     * @return this builder instance
     */
    @NotNull public Builder removeValidFrom() {
      removeValue("validFrom");
      return this;
    }
    /**
     * Get currently set value for validFrom property in this builder.
     * @return previously set value or {@code null}. If multiple values have been 
     * set to this property, then {@link java.util.Collection} instance will be 
     * returned.
     */
    @Nullable public java.lang.Object getValidFrom() {
      return myData.get("validFrom");
    }
    /**
     * The date after when the item is not valid. For example the end of an offer, salary period, or a period of opening hours.
     * @param date value to set
     * @return this builder instance
     */
    @NotNull public Builder validThrough(@NotNull java.util.Date date) {
      putValue("validThrough", date);
      return this;
    }
    /**
     * Remove validThrough property from the builder.
     * If this property is repeatable, all instances are removed.
     * @return this builder instance
     */
    @NotNull public Builder removeValidThrough() {
      removeValue("validThrough");
      return this;
    }
    /**
     * Get currently set value for validThrough property in this builder.
     * @return previously set value or {@code null}. If multiple values have been 
     * set to this property, then {@link java.util.Collection} instance will be 
     * returned.
     */
    @Nullable public java.lang.Object getValidThrough() {
      return myData.get("validThrough");
    }
    /**
     * The hours during which this service or contact is available.
     * @param openingHoursSpecification value to set
     * @return this builder instance
     */
    @NotNull public Builder hoursAvailable(@NotNull OpeningHoursSpecification openingHoursSpecification) {
      putValue("hoursAvailable", openingHoursSpecification);
      return this;
    }
    /**
     * The hours during which this service or contact is available.
     * @param openingHoursSpecification value to set
     * @return this builder instance
     */
    @NotNull public Builder hoursAvailable(@NotNull OpeningHoursSpecification.Builder openingHoursSpecification) {
      putValue("hoursAvailable", openingHoursSpecification.build());
      return this;
    }
    /**
     * Remove hoursAvailable property from the builder.
     * If this property is repeatable, all instances are removed.
     * @return this builder instance
     */
    @NotNull public Builder removeHoursAvailable() {
      removeValue("hoursAvailable");
      return this;
    }
    /**
     * Get currently set value for hoursAvailable property in this builder.
     * @return previously set value or {@code null}. If multiple values have been 
     * set to this property, then {@link java.util.Collection} instance will be 
     * returned.
     */
    @Nullable public java.lang.Object getHoursAvailable() {
      return myData.get("hoursAvailable");
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
     * The value of the quantitative value or property value node.\n\n* For [[QuantitativeValue]] and [[MonetaryAmount]], the recommended type for values is 'Number'.\n* For [[PropertyValue]], it can be 'Text;', 'Number', 'Boolean', or 'StructuredValue'.\n* Use values from 0123456789 (Unicode 'DIGIT ZERO' (U+0030) to 'DIGIT NINE' (U+0039)) rather than superficially similiar Unicode symbols.\n* Use '.' (Unicode 'FULL STOP' (U+002E)) rather than ',' to indicate a decimal point. Avoid using these symbols as a readability separator.
     * @param value value to set
     * @return this builder instance
     */
    @NotNull public Builder value(@NotNull Boolean value) {
      putValue("value", value);
      return this;
    }
    /**
     * The value of the quantitative value or property value node.\n\n* For [[QuantitativeValue]] and [[MonetaryAmount]], the recommended type for values is 'Number'.\n* For [[PropertyValue]], it can be 'Text;', 'Number', 'Boolean', or 'StructuredValue'.\n* Use values from 0123456789 (Unicode 'DIGIT ZERO' (U+0030) to 'DIGIT NINE' (U+0039)) rather than superficially similiar Unicode symbols.\n* Use '.' (Unicode 'FULL STOP' (U+002E)) rather than ',' to indicate a decimal point. Avoid using these symbols as a readability separator.
     * @param number value to set
     * @return this builder instance
     */
    @NotNull public Builder value(@NotNull Number number) {
      putValue("value", number);
      return this;
    }
    /**
     * The value of the quantitative value or property value node.\n\n* For [[QuantitativeValue]] and [[MonetaryAmount]], the recommended type for values is 'Number'.\n* For [[PropertyValue]], it can be 'Text;', 'Number', 'Boolean', or 'StructuredValue'.\n* Use values from 0123456789 (Unicode 'DIGIT ZERO' (U+0030) to 'DIGIT NINE' (U+0039)) rather than superficially similiar Unicode symbols.\n* Use '.' (Unicode 'FULL STOP' (U+002E)) rather than ',' to indicate a decimal point. Avoid using these symbols as a readability separator.
     * @param value value to set
     * @return this builder instance
     */
    @NotNull public Builder value(@NotNull String value) {
      putValue("value", value);
      return this;
    }
    /**
     * The value of the quantitative value or property value node.\n\n* For [[QuantitativeValue]] and [[MonetaryAmount]], the recommended type for values is 'Number'.\n* For [[PropertyValue]], it can be 'Text;', 'Number', 'Boolean', or 'StructuredValue'.\n* Use values from 0123456789 (Unicode 'DIGIT ZERO' (U+0030) to 'DIGIT NINE' (U+0039)) rather than superficially similiar Unicode symbols.\n* Use '.' (Unicode 'FULL STOP' (U+002E)) rather than ',' to indicate a decimal point. Avoid using these symbols as a readability separator.
     * @param structuredValue value to set
     * @return this builder instance
     */
    @NotNull public Builder value(@NotNull StructuredValue structuredValue) {
      putValue("value", structuredValue);
      return this;
    }
    /**
     * The value of the quantitative value or property value node.\n\n* For [[QuantitativeValue]] and [[MonetaryAmount]], the recommended type for values is 'Number'.\n* For [[PropertyValue]], it can be 'Text;', 'Number', 'Boolean', or 'StructuredValue'.\n* Use values from 0123456789 (Unicode 'DIGIT ZERO' (U+0030) to 'DIGIT NINE' (U+0039)) rather than superficially similiar Unicode symbols.\n* Use '.' (Unicode 'FULL STOP' (U+002E)) rather than ',' to indicate a decimal point. Avoid using these symbols as a readability separator.
     * @param structuredValue value to set
     * @return this builder instance
     */
    @NotNull public Builder value(@NotNull StructuredValue.Builder structuredValue) {
      putValue("value", structuredValue.build());
      return this;
    }
    /**
     * Remove value property from the builder.
     * If this property is repeatable, all instances are removed.
     * @return this builder instance
     */
    @NotNull public Builder removeValue() {
      removeValue("value");
      return this;
    }
    /**
     * Get currently set value for value property in this builder.
     * @return previously set value or {@code null}. If multiple values have been 
     * set to this property, then {@link java.util.Collection} instance will be 
     * returned.
     */
    @Nullable public java.lang.Object getValue() {
      return myData.get("value");
    }
    /**
     * The upper value of some characteristic or property.
     * @param integer value to set
     * @return this builder instance
     */
    @NotNull public Builder maxValue(@NotNull Integer integer) {
      putValue("maxValue", integer);
      return this;
    }
    /**
     * The upper value of some characteristic or property.
     * @param maxValue value to set
     * @return this builder instance
     */
    @NotNull public Builder maxValue(@NotNull Long maxValue) {
      putValue("maxValue", maxValue);
      return this;
    }
    /**
     * The upper value of some characteristic or property.
     * @param maxValue value to set
     * @return this builder instance
     */
    @NotNull public Builder maxValue(@NotNull Float maxValue) {
      putValue("maxValue", maxValue);
      return this;
    }
    /**
     * The upper value of some characteristic or property.
     * @param maxValue value to set
     * @return this builder instance
     */
    @NotNull public Builder maxValue(@NotNull Double maxValue) {
      putValue("maxValue", maxValue);
      return this;
    }
    /**
     * The upper value of some characteristic or property.
     * @param maxValue value to set
     * @return this builder instance
     */
    @NotNull public Builder maxValue(@NotNull String maxValue) {
      putValue("maxValue", maxValue);
      return this;
    }
    /**
     * Remove maxValue property from the builder.
     * If this property is repeatable, all instances are removed.
     * @return this builder instance
     */
    @NotNull public Builder removeMaxValue() {
      removeValue("maxValue");
      return this;
    }
    /**
     * Get currently set value for maxValue property in this builder.
     * @return previously set value or {@code null}. If multiple values have been 
     * set to this property, then {@link java.util.Collection} instance will be 
     * returned.
     */
    @Nullable public java.lang.Object getMaxValue() {
      return myData.get("maxValue");
    }
    /**
     *                                         A string or text indicating the unit of measurement. Useful if you cannot provide a standard unit code for
     * &lt;a href='unitCode'&gt;unitCode&lt;/a&gt;.
     *                                         @param unitText value to set
     *                                         @return this builder instance
     */
    @NotNull public Builder unitText(@NotNull String unitText) {
      putValue("unitText", unitText);
      return this;
    }
    /**
     * Remove unitText property from the builder.
     * If this property is repeatable, all instances are removed.
     * @return this builder instance
     */
    @NotNull public Builder removeUnitText() {
      removeValue("unitText");
      return this;
    }
    /**
     * Get currently set value for unitText property in this builder.
     * @return previously set value or {@code null}. If multiple values have been 
     * set to this property, then {@link java.util.Collection} instance will be 
     * returned.
     */
    @Nullable public java.lang.Object getUnitText() {
      return myData.get("unitText");
    }
    /**
     *                                         A commonly used identifier for the characteristic represented by the property, e.g. a manufacturer or a standard code for a property. propertyID can be
     * (1) a prefixed string, mainly meant to be used with standards for product properties; (2) a site-specific, non-prefixed string (e.g. the primary key of the property or the vendor-specific id of the property), or (3)
     * a URL indicating the type of the property, either pointing to an external vocabulary, or a Web resource that describes the property (e.g. a glossary entry).
     * Standards bodies should promote a standard prefix for the identifiers of properties from their standards.
     *                                         @param propertyID value to set
     *                                         @return this builder instance
     */
    @NotNull public Builder propertyID(@NotNull String propertyID) {
      putValue("propertyID", propertyID);
      return this;
    }
    /**
     * Remove propertyID property from the builder.
     * If this property is repeatable, all instances are removed.
     * @return this builder instance
     */
    @NotNull public Builder removePropertyID() {
      removeValue("propertyID");
      return this;
    }
    /**
     * Get currently set value for propertyID property in this builder.
     * @return previously set value or {@code null}. If multiple values have been 
     * set to this property, then {@link java.util.Collection} instance will be 
     * returned.
     */
    @Nullable public java.lang.Object getPropertyID() {
      return myData.get("propertyID");
    }
    /**
     *                                         A technique or technology used in a [[Dataset]] (or [[DataDownload]], [[DataCatalog]]),
     * corresponding to the method used for measuring the corresponding variable(s) (described using [[variableMeasured]]). This is oriented towards scientific and scholarly dataset publication but may have broader applicability; it is not intended as a full representation of measurement, but rather as a high level summary for dataset discovery.
     * 
     * For example, if [[variableMeasured]] is: molecule concentration, [[measurementTechnique]] could be: &quot;mass spectrometry&quot; or &quot;nmr spectroscopy&quot; or &quot;colorimetry&quot; or &quot;immunofluorescence&quot;.
     * 
     * If the [[variableMeasured]] is &quot;depression rating&quot;, the [[measurementTechnique]] could be &quot;Zung Scale&quot; or &quot;HAM-D&quot; or &quot;Beck Depression Inventory&quot;.
     * 
     * If there are several [[variableMeasured]] properties recorded for some given data object, use a [[PropertyValue]] for each [[variableMeasured]] and attach the corresponding [[measurementTechnique]].
     *       
     *                                         @param measurementTechnique value to set
     *                                         @return this builder instance
     */
    @NotNull public Builder measurementTechnique(@NotNull String measurementTechnique) {
      putValue("measurementTechnique", measurementTechnique);
      return this;
    }
    /**
     * Remove measurementTechnique property from the builder.
     * If this property is repeatable, all instances are removed.
     * @return this builder instance
     */
    @NotNull public Builder removeMeasurementTechnique() {
      removeValue("measurementTechnique");
      return this;
    }
    /**
     * Get currently set value for measurementTechnique property in this builder.
     * @return previously set value or {@code null}. If multiple values have been 
     * set to this property, then {@link java.util.Collection} instance will be 
     * returned.
     */
    @Nullable public java.lang.Object getMeasurementTechnique() {
      return myData.get("measurementTechnique");
    }
    /**
     * The unit of measurement given using the UN/CEFACT Common Code (3 characters) or a URL. Other codes than the UN/CEFACT Common Code may be used with a prefix followed by a colon.
     * @param unitCode value to set
     * @return this builder instance
     */
    @NotNull public Builder unitCode(@NotNull String unitCode) {
      putValue("unitCode", unitCode);
      return this;
    }
    /**
     * Remove unitCode property from the builder.
     * If this property is repeatable, all instances are removed.
     * @return this builder instance
     */
    @NotNull public Builder removeUnitCode() {
      removeValue("unitCode");
      return this;
    }
    /**
     * Get currently set value for unitCode property in this builder.
     * @return previously set value or {@code null}. If multiple values have been 
     * set to this property, then {@link java.util.Collection} instance will be 
     * returned.
     */
    @Nullable public java.lang.Object getUnitCode() {
      return myData.get("unitCode");
    }
    /**
     * The lower value of some characteristic or property.
     * @param integer value to set
     * @return this builder instance
     */
    @NotNull public Builder minValue(@NotNull Integer integer) {
      putValue("minValue", integer);
      return this;
    }
    /**
     * The lower value of some characteristic or property.
     * @param minValue value to set
     * @return this builder instance
     */
    @NotNull public Builder minValue(@NotNull Long minValue) {
      putValue("minValue", minValue);
      return this;
    }
    /**
     * The lower value of some characteristic or property.
     * @param minValue value to set
     * @return this builder instance
     */
    @NotNull public Builder minValue(@NotNull Float minValue) {
      putValue("minValue", minValue);
      return this;
    }
    /**
     * The lower value of some characteristic or property.
     * @param minValue value to set
     * @return this builder instance
     */
    @NotNull public Builder minValue(@NotNull Double minValue) {
      putValue("minValue", minValue);
      return this;
    }
    /**
     * The lower value of some characteristic or property.
     * @param minValue value to set
     * @return this builder instance
     */
    @NotNull public Builder minValue(@NotNull String minValue) {
      putValue("minValue", minValue);
      return this;
    }
    /**
     * Remove minValue property from the builder.
     * If this property is repeatable, all instances are removed.
     * @return this builder instance
     */
    @NotNull public Builder removeMinValue() {
      removeValue("minValue");
      return this;
    }
    /**
     * Get currently set value for minValue property in this builder.
     * @return previously set value or {@code null}. If multiple values have been 
     * set to this property, then {@link java.util.Collection} instance will be 
     * returned.
     */
    @Nullable public java.lang.Object getMinValue() {
      return myData.get("minValue");
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
      if ("validFrom".equals(key) && value instanceof java.util.Date) { this.validFrom((java.util.Date)value); return; }
      if ("validFroms".equals(key) && value instanceof java.util.Date) { this.validFrom((java.util.Date)value); return; }
      if ("validThrough".equals(key) && value instanceof java.util.Date) { this.validThrough((java.util.Date)value); return; }
      if ("validThroughs".equals(key) && value instanceof java.util.Date) { this.validThrough((java.util.Date)value); return; }
      if ("hoursAvailable".equals(key) && value instanceof OpeningHoursSpecification) { this.hoursAvailable((OpeningHoursSpecification)value); return; }
      if ("hoursAvailables".equals(key) && value instanceof OpeningHoursSpecification) { this.hoursAvailable((OpeningHoursSpecification)value); return; }
      super.fromMap(key, value);
    }
  }
  
}
