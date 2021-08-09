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
 * A property-value pair, e.g. representing a feature of a product or place. Use the 'name' property for the name of the property. If there is an additional human-readable version of the value, put that into the 'description' property.\n\n Always use specific schema.org properties when a) they exist and b) you can populate them. Using PropertyValue as a substitute will typically not trigger the same effect as using the original, specific property.
 *     
 */
public class PropertyValue extends StructuredValue implements org.schema.HasRepresentation, Identifier {
  /**
   * A secondary value that provides additional information on the original value, e.g. a reference temperature or a type of measurement.
   * @return valueReference property set by first invocation of valueReference method or {@code null}.
   */
  @JsonIgnore public DefinedTerm getValueReferenceDefinedTerm() {
    return (DefinedTerm) getValue("valueReference");
  }
  /**
   * A secondary value that provides additional information on the original value, e.g. a reference temperature or a type of measurement.
   * @return all valueReference properties as {@link java.util.Collection} or an empty collection 
   * if valueReference was not set.
   */
  @JsonIgnore public java.util.Collection<DefinedTerm> getValueReferenceDefinedTerms() {
    final java.lang.Object current = myData.get("valueReference");
    if (current == null) return Collections.emptyList();
    if (current instanceof java.util.Collection) {
      return (java.util.Collection<DefinedTerm>) current;
    }
    return Arrays.asList((DefinedTerm) current);
  }
  /**
   * A secondary value that provides additional information on the original value, e.g. a reference temperature or a type of measurement.
   * @return valueReference property set by first invocation of valueReference method or {@code null}.
   */
  @JsonIgnore public Enumeration getValueReferenceEnumeration() {
    return (Enumeration) getValue("valueReference");
  }
  /**
   * A secondary value that provides additional information on the original value, e.g. a reference temperature or a type of measurement.
   * @return all valueReference properties as {@link java.util.Collection} or an empty collection 
   * if valueReference was not set.
   */
  @JsonIgnore public java.util.Collection<Enumeration> getValueReferenceEnumerations() {
    final java.lang.Object current = myData.get("valueReference");
    if (current == null) return Collections.emptyList();
    if (current instanceof java.util.Collection) {
      return (java.util.Collection<Enumeration>) current;
    }
    return Arrays.asList((Enumeration) current);
  }
  /**
   * A secondary value that provides additional information on the original value, e.g. a reference temperature or a type of measurement.
   * @return valueReference property set by first invocation of valueReference method or {@code null}.
   */
  @JsonIgnore public MeasurementTypeEnumeration getValueReferenceMeasurementTypeEnumeration() {
    return (MeasurementTypeEnumeration) getValue("valueReference");
  }
  /**
   * A secondary value that provides additional information on the original value, e.g. a reference temperature or a type of measurement.
   * @return all valueReference properties as {@link java.util.Collection} or an empty collection 
   * if valueReference was not set.
   */
  @JsonIgnore public java.util.Collection<MeasurementTypeEnumeration> getValueReferenceMeasurementTypeEnumerations() {
    final java.lang.Object current = myData.get("valueReference");
    if (current == null) return Collections.emptyList();
    if (current instanceof java.util.Collection) {
      return (java.util.Collection<MeasurementTypeEnumeration>) current;
    }
    return Arrays.asList((MeasurementTypeEnumeration) current);
  }
  /**
   * A secondary value that provides additional information on the original value, e.g. a reference temperature or a type of measurement.
   * @return valueReference property set by first invocation of valueReference method or {@code null}.
   */
  @JsonIgnore public PropertyValue getValueReferencePropertyValue() {
    return (PropertyValue) getValue("valueReference");
  }
  /**
   * A secondary value that provides additional information on the original value, e.g. a reference temperature or a type of measurement.
   * @return all valueReference properties as {@link java.util.Collection} or an empty collection 
   * if valueReference was not set.
   */
  @JsonIgnore public java.util.Collection<PropertyValue> getValueReferencePropertyValues() {
    final java.lang.Object current = myData.get("valueReference");
    if (current == null) return Collections.emptyList();
    if (current instanceof java.util.Collection) {
      return (java.util.Collection<PropertyValue>) current;
    }
    return Arrays.asList((PropertyValue) current);
  }
  /**
   * A secondary value that provides additional information on the original value, e.g. a reference temperature or a type of measurement.
   * @return valueReference property set by first invocation of valueReference method or {@code null}.
   */
  @JsonIgnore public QualitativeValue getValueReferenceQualitativeValue() {
    return (QualitativeValue) getValue("valueReference");
  }
  /**
   * A secondary value that provides additional information on the original value, e.g. a reference temperature or a type of measurement.
   * @return all valueReference properties as {@link java.util.Collection} or an empty collection 
   * if valueReference was not set.
   */
  @JsonIgnore public java.util.Collection<QualitativeValue> getValueReferenceQualitativeValues() {
    final java.lang.Object current = myData.get("valueReference");
    if (current == null) return Collections.emptyList();
    if (current instanceof java.util.Collection) {
      return (java.util.Collection<QualitativeValue>) current;
    }
    return Arrays.asList((QualitativeValue) current);
  }
  /**
   * A secondary value that provides additional information on the original value, e.g. a reference temperature or a type of measurement.
   * @return valueReference property set by first invocation of valueReference method or {@code null}.
   */
  @JsonIgnore public QuantitativeValue getValueReferenceQuantitativeValue() {
    return (QuantitativeValue) getValue("valueReference");
  }
  /**
   * A secondary value that provides additional information on the original value, e.g. a reference temperature or a type of measurement.
   * @return all valueReference properties as {@link java.util.Collection} or an empty collection 
   * if valueReference was not set.
   */
  @JsonIgnore public java.util.Collection<QuantitativeValue> getValueReferenceQuantitativeValues() {
    final java.lang.Object current = myData.get("valueReference");
    if (current == null) return Collections.emptyList();
    if (current instanceof java.util.Collection) {
      return (java.util.Collection<QuantitativeValue>) current;
    }
    return Arrays.asList((QuantitativeValue) current);
  }
  /**
   * A secondary value that provides additional information on the original value, e.g. a reference temperature or a type of measurement.
   * @return valueReference property set by first invocation of valueReference method or {@code null}.
   */
  @JsonIgnore public String getValueReferenceString() {
    return (String) getValue("valueReference");
  }
  /**
   * A secondary value that provides additional information on the original value, e.g. a reference temperature or a type of measurement.
   * @return all valueReference properties as {@link java.util.Collection} or an empty collection 
   * if valueReference was not set.
   */
  @JsonIgnore public java.util.Collection<String> getValueReferenceStrings() {
    final java.lang.Object current = myData.get("valueReference");
    if (current == null) return Collections.emptyList();
    if (current instanceof java.util.Collection) {
      return (java.util.Collection<String>) current;
    }
    return Arrays.asList((String) current);
  }
  /**
   * A secondary value that provides additional information on the original value, e.g. a reference temperature or a type of measurement.
   * @return valueReference property set by first invocation of valueReference method or {@code null}.
   */
  @JsonIgnore public StructuredValue getValueReferenceStructuredValue() {
    return (StructuredValue) getValue("valueReference");
  }
  /**
   * A secondary value that provides additional information on the original value, e.g. a reference temperature or a type of measurement.
   * @return all valueReference properties as {@link java.util.Collection} or an empty collection 
   * if valueReference was not set.
   */
  @JsonIgnore public java.util.Collection<StructuredValue> getValueReferenceStructuredValues() {
    final java.lang.Object current = myData.get("valueReference");
    if (current == null) return Collections.emptyList();
    if (current instanceof java.util.Collection) {
      return (java.util.Collection<StructuredValue>) current;
    }
    return Arrays.asList((StructuredValue) current);
  }
  /**
   * The value of the quantitative value or property value node.\n\n* For [[QuantitativeValue]] and [[MonetaryAmount]], the recommended type for values is 'Number'.\n* For [[PropertyValue]], it can be 'Text;', 'Number', 'Boolean', or 'StructuredValue'.\n* Use values from 0123456789 (Unicode 'DIGIT ZERO' (U+0030) to 'DIGIT NINE' (U+0039)) rather than superficially similiar Unicode symbols.\n* Use '.' (Unicode 'FULL STOP' (U+002E)) rather than ',' to indicate a decimal point. Avoid using these symbols as a readability separator.
   * @return value property set by first invocation of value method or {@code null}.
   */
  @JsonIgnore public Boolean getValueBoolean() {
    return (Boolean) getValue("value");
  }
  /**
   * The value of the quantitative value or property value node.\n\n* For [[QuantitativeValue]] and [[MonetaryAmount]], the recommended type for values is 'Number'.\n* For [[PropertyValue]], it can be 'Text;', 'Number', 'Boolean', or 'StructuredValue'.\n* Use values from 0123456789 (Unicode 'DIGIT ZERO' (U+0030) to 'DIGIT NINE' (U+0039)) rather than superficially similiar Unicode symbols.\n* Use '.' (Unicode 'FULL STOP' (U+002E)) rather than ',' to indicate a decimal point. Avoid using these symbols as a readability separator.
   * @return all value properties as {@link java.util.Collection} or an empty collection 
   * if value was not set.
   */
  @JsonIgnore public java.util.Collection<Boolean> getValueBooleans() {
    final java.lang.Object current = myData.get("value");
    if (current == null) return Collections.emptyList();
    if (current instanceof java.util.Collection) {
      return (java.util.Collection<Boolean>) current;
    }
    return Arrays.asList((Boolean) current);
  }
  /**
   * The value of the quantitative value or property value node.\n\n* For [[QuantitativeValue]] and [[MonetaryAmount]], the recommended type for values is 'Number'.\n* For [[PropertyValue]], it can be 'Text;', 'Number', 'Boolean', or 'StructuredValue'.\n* Use values from 0123456789 (Unicode 'DIGIT ZERO' (U+0030) to 'DIGIT NINE' (U+0039)) rather than superficially similiar Unicode symbols.\n* Use '.' (Unicode 'FULL STOP' (U+002E)) rather than ',' to indicate a decimal point. Avoid using these symbols as a readability separator.
   * @return value property set by first invocation of value method or {@code null}.
   */
  @JsonIgnore public Number getValueNumber() {
    return (Number) getValue("value");
  }
  /**
   * The value of the quantitative value or property value node.\n\n* For [[QuantitativeValue]] and [[MonetaryAmount]], the recommended type for values is 'Number'.\n* For [[PropertyValue]], it can be 'Text;', 'Number', 'Boolean', or 'StructuredValue'.\n* Use values from 0123456789 (Unicode 'DIGIT ZERO' (U+0030) to 'DIGIT NINE' (U+0039)) rather than superficially similiar Unicode symbols.\n* Use '.' (Unicode 'FULL STOP' (U+002E)) rather than ',' to indicate a decimal point. Avoid using these symbols as a readability separator.
   * @return all value properties as {@link java.util.Collection} or an empty collection 
   * if value was not set.
   */
  @JsonIgnore public java.util.Collection<Number> getValueNumbers() {
    final java.lang.Object current = myData.get("value");
    if (current == null) return Collections.emptyList();
    if (current instanceof java.util.Collection) {
      return (java.util.Collection<Number>) current;
    }
    return Arrays.asList((Number) current);
  }
  /**
   * The value of the quantitative value or property value node.\n\n* For [[QuantitativeValue]] and [[MonetaryAmount]], the recommended type for values is 'Number'.\n* For [[PropertyValue]], it can be 'Text;', 'Number', 'Boolean', or 'StructuredValue'.\n* Use values from 0123456789 (Unicode 'DIGIT ZERO' (U+0030) to 'DIGIT NINE' (U+0039)) rather than superficially similiar Unicode symbols.\n* Use '.' (Unicode 'FULL STOP' (U+002E)) rather than ',' to indicate a decimal point. Avoid using these symbols as a readability separator.
   * @return value property set by first invocation of value method or {@code null}.
   */
  @JsonIgnore public String getValueString() {
    return (String) getValue("value");
  }
  /**
   * The value of the quantitative value or property value node.\n\n* For [[QuantitativeValue]] and [[MonetaryAmount]], the recommended type for values is 'Number'.\n* For [[PropertyValue]], it can be 'Text;', 'Number', 'Boolean', or 'StructuredValue'.\n* Use values from 0123456789 (Unicode 'DIGIT ZERO' (U+0030) to 'DIGIT NINE' (U+0039)) rather than superficially similiar Unicode symbols.\n* Use '.' (Unicode 'FULL STOP' (U+002E)) rather than ',' to indicate a decimal point. Avoid using these symbols as a readability separator.
   * @return all value properties as {@link java.util.Collection} or an empty collection 
   * if value was not set.
   */
  @JsonIgnore public java.util.Collection<String> getValueStrings() {
    final java.lang.Object current = myData.get("value");
    if (current == null) return Collections.emptyList();
    if (current instanceof java.util.Collection) {
      return (java.util.Collection<String>) current;
    }
    return Arrays.asList((String) current);
  }
  /**
   * The value of the quantitative value or property value node.\n\n* For [[QuantitativeValue]] and [[MonetaryAmount]], the recommended type for values is 'Number'.\n* For [[PropertyValue]], it can be 'Text;', 'Number', 'Boolean', or 'StructuredValue'.\n* Use values from 0123456789 (Unicode 'DIGIT ZERO' (U+0030) to 'DIGIT NINE' (U+0039)) rather than superficially similiar Unicode symbols.\n* Use '.' (Unicode 'FULL STOP' (U+002E)) rather than ',' to indicate a decimal point. Avoid using these symbols as a readability separator.
   * @return value property set by first invocation of value method or {@code null}.
   */
  @JsonIgnore public StructuredValue getValueStructuredValue() {
    return (StructuredValue) getValue("value");
  }
  /**
   * The value of the quantitative value or property value node.\n\n* For [[QuantitativeValue]] and [[MonetaryAmount]], the recommended type for values is 'Number'.\n* For [[PropertyValue]], it can be 'Text;', 'Number', 'Boolean', or 'StructuredValue'.\n* Use values from 0123456789 (Unicode 'DIGIT ZERO' (U+0030) to 'DIGIT NINE' (U+0039)) rather than superficially similiar Unicode symbols.\n* Use '.' (Unicode 'FULL STOP' (U+002E)) rather than ',' to indicate a decimal point. Avoid using these symbols as a readability separator.
   * @return all value properties as {@link java.util.Collection} or an empty collection 
   * if value was not set.
   */
  @JsonIgnore public java.util.Collection<StructuredValue> getValueStructuredValues() {
    final java.lang.Object current = myData.get("value");
    if (current == null) return Collections.emptyList();
    if (current instanceof java.util.Collection) {
      return (java.util.Collection<StructuredValue>) current;
    }
    return Arrays.asList((StructuredValue) current);
  }
  /**
   * The upper value of some characteristic or property.
   * @return maxValue property set by first invocation of maxValue method or {@code null}.
   */
  @JsonIgnore public Integer getMaxValueInteger() {
    return (Integer) getValue("maxValue");
  }
  /**
   * The upper value of some characteristic or property.
   * @return all maxValue properties as {@link java.util.Collection} or an empty collection 
   * if maxValue was not set.
   */
  @JsonIgnore public java.util.Collection<Integer> getMaxValueIntegers() {
    final java.lang.Object current = myData.get("maxValue");
    if (current == null) return Collections.emptyList();
    if (current instanceof java.util.Collection) {
      return (java.util.Collection<Integer>) current;
    }
    return Arrays.asList((Integer) current);
  }
  /**
   * The upper value of some characteristic or property.
   * @return maxValue property set by first invocation of maxValue method or {@code null}.
   */
  @JsonIgnore public Long getMaxValueLong() {
    return (Long) getValue("maxValue");
  }
  /**
   * The upper value of some characteristic or property.
   * @return all maxValue properties as {@link java.util.Collection} or an empty collection 
   * if maxValue was not set.
   */
  @JsonIgnore public java.util.Collection<Long> getMaxValueLongs() {
    final java.lang.Object current = myData.get("maxValue");
    if (current == null) return Collections.emptyList();
    if (current instanceof java.util.Collection) {
      return (java.util.Collection<Long>) current;
    }
    return Arrays.asList((Long) current);
  }
  /**
   * The upper value of some characteristic or property.
   * @return maxValue property set by first invocation of maxValue method or {@code null}.
   */
  @JsonIgnore public Float getMaxValueFloat() {
    return (Float) getValue("maxValue");
  }
  /**
   * The upper value of some characteristic or property.
   * @return all maxValue properties as {@link java.util.Collection} or an empty collection 
   * if maxValue was not set.
   */
  @JsonIgnore public java.util.Collection<Float> getMaxValueFloats() {
    final java.lang.Object current = myData.get("maxValue");
    if (current == null) return Collections.emptyList();
    if (current instanceof java.util.Collection) {
      return (java.util.Collection<Float>) current;
    }
    return Arrays.asList((Float) current);
  }
  /**
   * The upper value of some characteristic or property.
   * @return maxValue property set by first invocation of maxValue method or {@code null}.
   */
  @JsonIgnore public Double getMaxValueDouble() {
    return (Double) getValue("maxValue");
  }
  /**
   * The upper value of some characteristic or property.
   * @return all maxValue properties as {@link java.util.Collection} or an empty collection 
   * if maxValue was not set.
   */
  @JsonIgnore public java.util.Collection<Double> getMaxValueDoubles() {
    final java.lang.Object current = myData.get("maxValue");
    if (current == null) return Collections.emptyList();
    if (current instanceof java.util.Collection) {
      return (java.util.Collection<Double>) current;
    }
    return Arrays.asList((Double) current);
  }
  /**
   * The upper value of some characteristic or property.
   * @return maxValue property set by first invocation of maxValue method or {@code null}.
   */
  @JsonIgnore public String getMaxValueString() {
    return (String) getValue("maxValue");
  }
  /**
   * The upper value of some characteristic or property.
   * @return all maxValue properties as {@link java.util.Collection} or an empty collection 
   * if maxValue was not set.
   */
  @JsonIgnore public java.util.Collection<String> getMaxValueStrings() {
    final java.lang.Object current = myData.get("maxValue");
    if (current == null) return Collections.emptyList();
    if (current instanceof java.util.Collection) {
      return (java.util.Collection<String>) current;
    }
    return Arrays.asList((String) current);
  }
  /**
   *                                 A string or text indicating the unit of measurement. Useful if you cannot provide a standard unit code for
   * &lt;a href='unitCode'&gt;unitCode&lt;/a&gt;.
   *                                 @return unitText property set by first invocation of unitText method or {@code null}.
   */
  @JsonIgnore public String getUnitText() {
    return (String) getValue("unitText");
  }
  /**
   *                                     A string or text indicating the unit of measurement. Useful if you cannot provide a standard unit code for
   * &lt;a href='unitCode'&gt;unitCode&lt;/a&gt;.
   *                                     @return all unitText properties as {@link java.util.Collection} or an empty collection 
   *                                     if unitText was not set.
   */
  @JsonIgnore public java.util.Collection<String> getUnitTexts() {
    final java.lang.Object current = myData.get("unitText");
    if (current == null) return Collections.emptyList();
    if (current instanceof java.util.Collection) {
      return (java.util.Collection<String>) current;
    }
    return Arrays.asList((String) current);
  }
  /**
   *                                 A commonly used identifier for the characteristic represented by the property, e.g. a manufacturer or a standard code for a property. propertyID can be
   * (1) a prefixed string, mainly meant to be used with standards for product properties; (2) a site-specific, non-prefixed string (e.g. the primary key of the property or the vendor-specific id of the property), or (3)
   * a URL indicating the type of the property, either pointing to an external vocabulary, or a Web resource that describes the property (e.g. a glossary entry).
   * Standards bodies should promote a standard prefix for the identifiers of properties from their standards.
   *                                 @return propertyID property set by first invocation of propertyID method or {@code null}.
   */
  @JsonIgnore public String getPropertyID() {
    return (String) getValue("propertyID");
  }
  /**
   *                                     A commonly used identifier for the characteristic represented by the property, e.g. a manufacturer or a standard code for a property. propertyID can be
   * (1) a prefixed string, mainly meant to be used with standards for product properties; (2) a site-specific, non-prefixed string (e.g. the primary key of the property or the vendor-specific id of the property), or (3)
   * a URL indicating the type of the property, either pointing to an external vocabulary, or a Web resource that describes the property (e.g. a glossary entry).
   * Standards bodies should promote a standard prefix for the identifiers of properties from their standards.
   *                                     @return all propertyID properties as {@link java.util.Collection} or an empty collection 
   *                                     if propertyID was not set.
   */
  @JsonIgnore public java.util.Collection<String> getPropertyIDs() {
    final java.lang.Object current = myData.get("propertyID");
    if (current == null) return Collections.emptyList();
    if (current instanceof java.util.Collection) {
      return (java.util.Collection<String>) current;
    }
    return Arrays.asList((String) current);
  }
  /**
   *                                 A technique or technology used in a [[Dataset]] (or [[DataDownload]], [[DataCatalog]]),
   * corresponding to the method used for measuring the corresponding variable(s) (described using [[variableMeasured]]). This is oriented towards scientific and scholarly dataset publication but may have broader applicability; it is not intended as a full representation of measurement, but rather as a high level summary for dataset discovery.
   * 
   * For example, if [[variableMeasured]] is: molecule concentration, [[measurementTechnique]] could be: &quot;mass spectrometry&quot; or &quot;nmr spectroscopy&quot; or &quot;colorimetry&quot; or &quot;immunofluorescence&quot;.
   * 
   * If the [[variableMeasured]] is &quot;depression rating&quot;, the [[measurementTechnique]] could be &quot;Zung Scale&quot; or &quot;HAM-D&quot; or &quot;Beck Depression Inventory&quot;.
   * 
   * If there are several [[variableMeasured]] properties recorded for some given data object, use a [[PropertyValue]] for each [[variableMeasured]] and attach the corresponding [[measurementTechnique]].
   *       
   *                                 @return measurementTechnique property set by first invocation of measurementTechnique method or {@code null}.
   */
  @JsonIgnore public String getMeasurementTechnique() {
    return (String) getValue("measurementTechnique");
  }
  /**
   *                                     A technique or technology used in a [[Dataset]] (or [[DataDownload]], [[DataCatalog]]),
   * corresponding to the method used for measuring the corresponding variable(s) (described using [[variableMeasured]]). This is oriented towards scientific and scholarly dataset publication but may have broader applicability; it is not intended as a full representation of measurement, but rather as a high level summary for dataset discovery.
   * 
   * For example, if [[variableMeasured]] is: molecule concentration, [[measurementTechnique]] could be: &quot;mass spectrometry&quot; or &quot;nmr spectroscopy&quot; or &quot;colorimetry&quot; or &quot;immunofluorescence&quot;.
   * 
   * If the [[variableMeasured]] is &quot;depression rating&quot;, the [[measurementTechnique]] could be &quot;Zung Scale&quot; or &quot;HAM-D&quot; or &quot;Beck Depression Inventory&quot;.
   * 
   * If there are several [[variableMeasured]] properties recorded for some given data object, use a [[PropertyValue]] for each [[variableMeasured]] and attach the corresponding [[measurementTechnique]].
   *       
   *                                     @return all measurementTechnique properties as {@link java.util.Collection} or an empty collection 
   *                                     if measurementTechnique was not set.
   */
  @JsonIgnore public java.util.Collection<String> getMeasurementTechniques() {
    final java.lang.Object current = myData.get("measurementTechnique");
    if (current == null) return Collections.emptyList();
    if (current instanceof java.util.Collection) {
      return (java.util.Collection<String>) current;
    }
    return Arrays.asList((String) current);
  }
  /**
   * The unit of measurement given using the UN/CEFACT Common Code (3 characters) or a URL. Other codes than the UN/CEFACT Common Code may be used with a prefix followed by a colon.
   * @return unitCode property set by first invocation of unitCode method or {@code null}.
   */
  @JsonIgnore public String getUnitCode() {
    return (String) getValue("unitCode");
  }
  /**
   * The unit of measurement given using the UN/CEFACT Common Code (3 characters) or a URL. Other codes than the UN/CEFACT Common Code may be used with a prefix followed by a colon.
   * @return all unitCode properties as {@link java.util.Collection} or an empty collection 
   * if unitCode was not set.
   */
  @JsonIgnore public java.util.Collection<String> getUnitCodes() {
    final java.lang.Object current = myData.get("unitCode");
    if (current == null) return Collections.emptyList();
    if (current instanceof java.util.Collection) {
      return (java.util.Collection<String>) current;
    }
    return Arrays.asList((String) current);
  }
  /**
   * The lower value of some characteristic or property.
   * @return minValue property set by first invocation of minValue method or {@code null}.
   */
  @JsonIgnore public Integer getMinValueInteger() {
    return (Integer) getValue("minValue");
  }
  /**
   * The lower value of some characteristic or property.
   * @return all minValue properties as {@link java.util.Collection} or an empty collection 
   * if minValue was not set.
   */
  @JsonIgnore public java.util.Collection<Integer> getMinValueIntegers() {
    final java.lang.Object current = myData.get("minValue");
    if (current == null) return Collections.emptyList();
    if (current instanceof java.util.Collection) {
      return (java.util.Collection<Integer>) current;
    }
    return Arrays.asList((Integer) current);
  }
  /**
   * The lower value of some characteristic or property.
   * @return minValue property set by first invocation of minValue method or {@code null}.
   */
  @JsonIgnore public Long getMinValueLong() {
    return (Long) getValue("minValue");
  }
  /**
   * The lower value of some characteristic or property.
   * @return all minValue properties as {@link java.util.Collection} or an empty collection 
   * if minValue was not set.
   */
  @JsonIgnore public java.util.Collection<Long> getMinValueLongs() {
    final java.lang.Object current = myData.get("minValue");
    if (current == null) return Collections.emptyList();
    if (current instanceof java.util.Collection) {
      return (java.util.Collection<Long>) current;
    }
    return Arrays.asList((Long) current);
  }
  /**
   * The lower value of some characteristic or property.
   * @return minValue property set by first invocation of minValue method or {@code null}.
   */
  @JsonIgnore public Float getMinValueFloat() {
    return (Float) getValue("minValue");
  }
  /**
   * The lower value of some characteristic or property.
   * @return all minValue properties as {@link java.util.Collection} or an empty collection 
   * if minValue was not set.
   */
  @JsonIgnore public java.util.Collection<Float> getMinValueFloats() {
    final java.lang.Object current = myData.get("minValue");
    if (current == null) return Collections.emptyList();
    if (current instanceof java.util.Collection) {
      return (java.util.Collection<Float>) current;
    }
    return Arrays.asList((Float) current);
  }
  /**
   * The lower value of some characteristic or property.
   * @return minValue property set by first invocation of minValue method or {@code null}.
   */
  @JsonIgnore public Double getMinValueDouble() {
    return (Double) getValue("minValue");
  }
  /**
   * The lower value of some characteristic or property.
   * @return all minValue properties as {@link java.util.Collection} or an empty collection 
   * if minValue was not set.
   */
  @JsonIgnore public java.util.Collection<Double> getMinValueDoubles() {
    final java.lang.Object current = myData.get("minValue");
    if (current == null) return Collections.emptyList();
    if (current instanceof java.util.Collection) {
      return (java.util.Collection<Double>) current;
    }
    return Arrays.asList((Double) current);
  }
  /**
   * The lower value of some characteristic or property.
   * @return minValue property set by first invocation of minValue method or {@code null}.
   */
  @JsonIgnore public String getMinValueString() {
    return (String) getValue("minValue");
  }
  /**
   * The lower value of some characteristic or property.
   * @return all minValue properties as {@link java.util.Collection} or an empty collection 
   * if minValue was not set.
   */
  @JsonIgnore public java.util.Collection<String> getMinValueStrings() {
    final java.lang.Object current = myData.get("minValue");
    if (current == null) return Collections.emptyList();
    if (current instanceof java.util.Collection) {
      return (java.util.Collection<String>) current;
    }
    return Arrays.asList((String) current);
  }
  protected PropertyValue(java.util.Map<String,java.lang.Object> data) {
    super(data);
  }
  
  /**
   * Builder for {@link PropertyValue}
   */
  public static class Builder extends StructuredValue.Builder {
    public Builder(@NotNull HashMap<String,java.lang.Object> data) {
      super(data);
    }
    @NotNull public PropertyValue build() {
      return new PropertyValue(myData);
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
      if ("value".equals(key) && value instanceof Boolean) { this.value((Boolean)value); return; }
      if ("values".equals(key) && value instanceof Boolean) { this.value((Boolean)value); return; }
      if ("value".equals(key) && value instanceof Number) { this.value((Number)value); return; }
      if ("values".equals(key) && value instanceof Number) { this.value((Number)value); return; }
      if ("value".equals(key) && value instanceof String) { this.value((String)value); return; }
      if ("values".equals(key) && value instanceof String) { this.value((String)value); return; }
      if ("value".equals(key) && value instanceof StructuredValue) { this.value((StructuredValue)value); return; }
      if ("values".equals(key) && value instanceof StructuredValue) { this.value((StructuredValue)value); return; }
      if ("maxValue".equals(key) && value instanceof Integer) { this.maxValue((Integer)value); return; }
      if ("maxValues".equals(key) && value instanceof Integer) { this.maxValue((Integer)value); return; }
      if ("maxValue".equals(key) && value instanceof Long) { this.maxValue((Long)value); return; }
      if ("maxValues".equals(key) && value instanceof Long) { this.maxValue((Long)value); return; }
      if ("maxValue".equals(key) && value instanceof Float) { this.maxValue((Float)value); return; }
      if ("maxValues".equals(key) && value instanceof Float) { this.maxValue((Float)value); return; }
      if ("maxValue".equals(key) && value instanceof Double) { this.maxValue((Double)value); return; }
      if ("maxValues".equals(key) && value instanceof Double) { this.maxValue((Double)value); return; }
      if ("maxValue".equals(key) && value instanceof String) { this.maxValue((String)value); return; }
      if ("maxValues".equals(key) && value instanceof String) { this.maxValue((String)value); return; }
      if ("unitText".equals(key) && value instanceof String) { this.unitText((String)value); return; }
      if ("unitTexts".equals(key) && value instanceof String) { this.unitText((String)value); return; }
      if ("propertyID".equals(key) && value instanceof String) { this.propertyID((String)value); return; }
      if ("propertyIDs".equals(key) && value instanceof String) { this.propertyID((String)value); return; }
      if ("measurementTechnique".equals(key) && value instanceof String) { this.measurementTechnique((String)value); return; }
      if ("measurementTechniques".equals(key) && value instanceof String) { this.measurementTechnique((String)value); return; }
      if ("unitCode".equals(key) && value instanceof String) { this.unitCode((String)value); return; }
      if ("unitCodes".equals(key) && value instanceof String) { this.unitCode((String)value); return; }
      if ("minValue".equals(key) && value instanceof Integer) { this.minValue((Integer)value); return; }
      if ("minValues".equals(key) && value instanceof Integer) { this.minValue((Integer)value); return; }
      if ("minValue".equals(key) && value instanceof Long) { this.minValue((Long)value); return; }
      if ("minValues".equals(key) && value instanceof Long) { this.minValue((Long)value); return; }
      if ("minValue".equals(key) && value instanceof Float) { this.minValue((Float)value); return; }
      if ("minValues".equals(key) && value instanceof Float) { this.minValue((Float)value); return; }
      if ("minValue".equals(key) && value instanceof Double) { this.minValue((Double)value); return; }
      if ("minValues".equals(key) && value instanceof Double) { this.minValue((Double)value); return; }
      if ("minValue".equals(key) && value instanceof String) { this.minValue((String)value); return; }
      if ("minValues".equals(key) && value instanceof String) { this.minValue((String)value); return; }
      super.fromMap(key, value);
    }
  }
  
}
