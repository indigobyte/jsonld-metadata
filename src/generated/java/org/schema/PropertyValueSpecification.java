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
 * A Property value specification.
 */
public class PropertyValueSpecification extends Intangible {
  /**
   * Specifies the minimum allowed range for number of characters in a literal value.
   * @return valueMinLength property set by first invocation of valueMinLength method or {@code null}.
   */
  @JsonIgnore public Integer getValueMinLengthInteger() {
    return (Integer) getValue("valueMinLength");
  }
  /**
   * Specifies the minimum allowed range for number of characters in a literal value.
   * @return all valueMinLength properties as {@link java.util.Collection} or an empty collection 
   * if valueMinLength was not set.
   */
  @JsonIgnore public java.util.Collection<Integer> getValueMinLengthIntegers() {
    final java.lang.Object current = myData.get("valueMinLength");
    if (current == null) return Collections.emptyList();
    if (current instanceof java.util.Collection) {
      return (java.util.Collection<Integer>) current;
    }
    return Arrays.asList((Integer) current);
  }
  /**
   * Specifies the minimum allowed range for number of characters in a literal value.
   * @return valueMinLength property set by first invocation of valueMinLength method or {@code null}.
   */
  @JsonIgnore public Long getValueMinLengthLong() {
    return (Long) getValue("valueMinLength");
  }
  /**
   * Specifies the minimum allowed range for number of characters in a literal value.
   * @return all valueMinLength properties as {@link java.util.Collection} or an empty collection 
   * if valueMinLength was not set.
   */
  @JsonIgnore public java.util.Collection<Long> getValueMinLengthLongs() {
    final java.lang.Object current = myData.get("valueMinLength");
    if (current == null) return Collections.emptyList();
    if (current instanceof java.util.Collection) {
      return (java.util.Collection<Long>) current;
    }
    return Arrays.asList((Long) current);
  }
  /**
   * Specifies the minimum allowed range for number of characters in a literal value.
   * @return valueMinLength property set by first invocation of valueMinLength method or {@code null}.
   */
  @JsonIgnore public Float getValueMinLengthFloat() {
    return (Float) getValue("valueMinLength");
  }
  /**
   * Specifies the minimum allowed range for number of characters in a literal value.
   * @return all valueMinLength properties as {@link java.util.Collection} or an empty collection 
   * if valueMinLength was not set.
   */
  @JsonIgnore public java.util.Collection<Float> getValueMinLengthFloats() {
    final java.lang.Object current = myData.get("valueMinLength");
    if (current == null) return Collections.emptyList();
    if (current instanceof java.util.Collection) {
      return (java.util.Collection<Float>) current;
    }
    return Arrays.asList((Float) current);
  }
  /**
   * Specifies the minimum allowed range for number of characters in a literal value.
   * @return valueMinLength property set by first invocation of valueMinLength method or {@code null}.
   */
  @JsonIgnore public Double getValueMinLengthDouble() {
    return (Double) getValue("valueMinLength");
  }
  /**
   * Specifies the minimum allowed range for number of characters in a literal value.
   * @return all valueMinLength properties as {@link java.util.Collection} or an empty collection 
   * if valueMinLength was not set.
   */
  @JsonIgnore public java.util.Collection<Double> getValueMinLengthDoubles() {
    final java.lang.Object current = myData.get("valueMinLength");
    if (current == null) return Collections.emptyList();
    if (current instanceof java.util.Collection) {
      return (java.util.Collection<Double>) current;
    }
    return Arrays.asList((Double) current);
  }
  /**
   * Specifies the minimum allowed range for number of characters in a literal value.
   * @return valueMinLength property set by first invocation of valueMinLength method or {@code null}.
   */
  @JsonIgnore public String getValueMinLengthString() {
    return (String) getValue("valueMinLength");
  }
  /**
   * Specifies the minimum allowed range for number of characters in a literal value.
   * @return all valueMinLength properties as {@link java.util.Collection} or an empty collection 
   * if valueMinLength was not set.
   */
  @JsonIgnore public java.util.Collection<String> getValueMinLengthStrings() {
    final java.lang.Object current = myData.get("valueMinLength");
    if (current == null) return Collections.emptyList();
    if (current instanceof java.util.Collection) {
      return (java.util.Collection<String>) current;
    }
    return Arrays.asList((String) current);
  }
  /**
   * Indicates the name of the PropertyValueSpecification to be used in URL templates and form encoding in a manner analogous to HTML's input@name.
   * @return valueName property set by first invocation of valueName method or {@code null}.
   */
  @JsonIgnore public String getValueName() {
    return (String) getValue("valueName");
  }
  /**
   * Indicates the name of the PropertyValueSpecification to be used in URL templates and form encoding in a manner analogous to HTML's input@name.
   * @return all valueName properties as {@link java.util.Collection} or an empty collection 
   * if valueName was not set.
   */
  @JsonIgnore public java.util.Collection<String> getValueNames() {
    final java.lang.Object current = myData.get("valueName");
    if (current == null) return Collections.emptyList();
    if (current instanceof java.util.Collection) {
      return (java.util.Collection<String>) current;
    }
    return Arrays.asList((String) current);
  }
  /**
   * Whether or not a property is mutable.  Default is false. Specifying this for a property that also has a value makes it act similar to a &quot;hidden&quot; input in an HTML form.
   * @return readonlyValue property set by first invocation of readonlyValue method or {@code null}.
   */
  @JsonIgnore public Boolean getReadonlyValue() {
    return (Boolean) getValue("readonlyValue");
  }
  /**
   * Whether or not a property is mutable.  Default is false. Specifying this for a property that also has a value makes it act similar to a &quot;hidden&quot; input in an HTML form.
   * @return all readonlyValue properties as {@link java.util.Collection} or an empty collection 
   * if readonlyValue was not set.
   */
  @JsonIgnore public java.util.Collection<Boolean> getReadonlyValues() {
    final java.lang.Object current = myData.get("readonlyValue");
    if (current == null) return Collections.emptyList();
    if (current instanceof java.util.Collection) {
      return (java.util.Collection<Boolean>) current;
    }
    return Arrays.asList((Boolean) current);
  }
  /**
   * Whether multiple values are allowed for the property.  Default is false.
   * @return multipleValues property set by first invocation of multipleValues method or {@code null}.
   */
  @JsonIgnore public Boolean getMultipleValues() {
    return (Boolean) getValue("multipleValues");
  }
  /**
   * Whether multiple values are allowed for the property.  Default is false.
   * @return all multipleValues properties as {@link java.util.Collection} or an empty collection 
   * if multipleValues was not set.
   */
  @JsonIgnore public java.util.Collection<Boolean> getMultipleValuess() {
    final java.lang.Object current = myData.get("multipleValues");
    if (current == null) return Collections.emptyList();
    if (current instanceof java.util.Collection) {
      return (java.util.Collection<Boolean>) current;
    }
    return Arrays.asList((Boolean) current);
  }
  /**
   * The default value of the input.  For properties that expect a literal, the default is a literal value, for properties that expect an object, it's an ID reference to one of the current values.
   * @return defaultValue property set by first invocation of defaultValue method or {@code null}.
   */
  @JsonIgnore public String getDefaultValueString() {
    return (String) getValue("defaultValue");
  }
  /**
   * The default value of the input.  For properties that expect a literal, the default is a literal value, for properties that expect an object, it's an ID reference to one of the current values.
   * @return all defaultValue properties as {@link java.util.Collection} or an empty collection 
   * if defaultValue was not set.
   */
  @JsonIgnore public java.util.Collection<String> getDefaultValueStrings() {
    final java.lang.Object current = myData.get("defaultValue");
    if (current == null) return Collections.emptyList();
    if (current instanceof java.util.Collection) {
      return (java.util.Collection<String>) current;
    }
    return Arrays.asList((String) current);
  }
  /**
   * The default value of the input.  For properties that expect a literal, the default is a literal value, for properties that expect an object, it's an ID reference to one of the current values.
   * @return defaultValue property set by first invocation of defaultValue method or {@code null}.
   */
  @JsonIgnore public Thing getDefaultValueThing() {
    return (Thing) getValue("defaultValue");
  }
  /**
   * The default value of the input.  For properties that expect a literal, the default is a literal value, for properties that expect an object, it's an ID reference to one of the current values.
   * @return all defaultValue properties as {@link java.util.Collection} or an empty collection 
   * if defaultValue was not set.
   */
  @JsonIgnore public java.util.Collection<Thing> getDefaultValueThings() {
    final java.lang.Object current = myData.get("defaultValue");
    if (current == null) return Collections.emptyList();
    if (current instanceof java.util.Collection) {
      return (java.util.Collection<Thing>) current;
    }
    return Arrays.asList((Thing) current);
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
   * The stepValue attribute indicates the granularity that is expected (and required) of the value in a PropertyValueSpecification.
   * @return stepValue property set by first invocation of stepValue method or {@code null}.
   */
  @JsonIgnore public Integer getStepValueInteger() {
    return (Integer) getValue("stepValue");
  }
  /**
   * The stepValue attribute indicates the granularity that is expected (and required) of the value in a PropertyValueSpecification.
   * @return all stepValue properties as {@link java.util.Collection} or an empty collection 
   * if stepValue was not set.
   */
  @JsonIgnore public java.util.Collection<Integer> getStepValueIntegers() {
    final java.lang.Object current = myData.get("stepValue");
    if (current == null) return Collections.emptyList();
    if (current instanceof java.util.Collection) {
      return (java.util.Collection<Integer>) current;
    }
    return Arrays.asList((Integer) current);
  }
  /**
   * The stepValue attribute indicates the granularity that is expected (and required) of the value in a PropertyValueSpecification.
   * @return stepValue property set by first invocation of stepValue method or {@code null}.
   */
  @JsonIgnore public Long getStepValueLong() {
    return (Long) getValue("stepValue");
  }
  /**
   * The stepValue attribute indicates the granularity that is expected (and required) of the value in a PropertyValueSpecification.
   * @return all stepValue properties as {@link java.util.Collection} or an empty collection 
   * if stepValue was not set.
   */
  @JsonIgnore public java.util.Collection<Long> getStepValueLongs() {
    final java.lang.Object current = myData.get("stepValue");
    if (current == null) return Collections.emptyList();
    if (current instanceof java.util.Collection) {
      return (java.util.Collection<Long>) current;
    }
    return Arrays.asList((Long) current);
  }
  /**
   * The stepValue attribute indicates the granularity that is expected (and required) of the value in a PropertyValueSpecification.
   * @return stepValue property set by first invocation of stepValue method or {@code null}.
   */
  @JsonIgnore public Float getStepValueFloat() {
    return (Float) getValue("stepValue");
  }
  /**
   * The stepValue attribute indicates the granularity that is expected (and required) of the value in a PropertyValueSpecification.
   * @return all stepValue properties as {@link java.util.Collection} or an empty collection 
   * if stepValue was not set.
   */
  @JsonIgnore public java.util.Collection<Float> getStepValueFloats() {
    final java.lang.Object current = myData.get("stepValue");
    if (current == null) return Collections.emptyList();
    if (current instanceof java.util.Collection) {
      return (java.util.Collection<Float>) current;
    }
    return Arrays.asList((Float) current);
  }
  /**
   * The stepValue attribute indicates the granularity that is expected (and required) of the value in a PropertyValueSpecification.
   * @return stepValue property set by first invocation of stepValue method or {@code null}.
   */
  @JsonIgnore public Double getStepValueDouble() {
    return (Double) getValue("stepValue");
  }
  /**
   * The stepValue attribute indicates the granularity that is expected (and required) of the value in a PropertyValueSpecification.
   * @return all stepValue properties as {@link java.util.Collection} or an empty collection 
   * if stepValue was not set.
   */
  @JsonIgnore public java.util.Collection<Double> getStepValueDoubles() {
    final java.lang.Object current = myData.get("stepValue");
    if (current == null) return Collections.emptyList();
    if (current instanceof java.util.Collection) {
      return (java.util.Collection<Double>) current;
    }
    return Arrays.asList((Double) current);
  }
  /**
   * The stepValue attribute indicates the granularity that is expected (and required) of the value in a PropertyValueSpecification.
   * @return stepValue property set by first invocation of stepValue method or {@code null}.
   */
  @JsonIgnore public String getStepValueString() {
    return (String) getValue("stepValue");
  }
  /**
   * The stepValue attribute indicates the granularity that is expected (and required) of the value in a PropertyValueSpecification.
   * @return all stepValue properties as {@link java.util.Collection} or an empty collection 
   * if stepValue was not set.
   */
  @JsonIgnore public java.util.Collection<String> getStepValueStrings() {
    final java.lang.Object current = myData.get("stepValue");
    if (current == null) return Collections.emptyList();
    if (current instanceof java.util.Collection) {
      return (java.util.Collection<String>) current;
    }
    return Arrays.asList((String) current);
  }
  /**
   * Whether the property must be filled in to complete the action.  Default is false.
   * @return valueRequired property set by first invocation of valueRequired method or {@code null}.
   */
  @JsonIgnore public Boolean getValueRequired() {
    return (Boolean) getValue("valueRequired");
  }
  /**
   * Whether the property must be filled in to complete the action.  Default is false.
   * @return all valueRequired properties as {@link java.util.Collection} or an empty collection 
   * if valueRequired was not set.
   */
  @JsonIgnore public java.util.Collection<Boolean> getValueRequireds() {
    final java.lang.Object current = myData.get("valueRequired");
    if (current == null) return Collections.emptyList();
    if (current instanceof java.util.Collection) {
      return (java.util.Collection<Boolean>) current;
    }
    return Arrays.asList((Boolean) current);
  }
  /**
   * Specifies a regular expression for testing literal values according to the HTML spec.
   * @return valuePattern property set by first invocation of valuePattern method or {@code null}.
   */
  @JsonIgnore public String getValuePattern() {
    return (String) getValue("valuePattern");
  }
  /**
   * Specifies a regular expression for testing literal values according to the HTML spec.
   * @return all valuePattern properties as {@link java.util.Collection} or an empty collection 
   * if valuePattern was not set.
   */
  @JsonIgnore public java.util.Collection<String> getValuePatterns() {
    final java.lang.Object current = myData.get("valuePattern");
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
  /**
   * Specifies the allowed range for number of characters in a literal value.
   * @return valueMaxLength property set by first invocation of valueMaxLength method or {@code null}.
   */
  @JsonIgnore public Integer getValueMaxLengthInteger() {
    return (Integer) getValue("valueMaxLength");
  }
  /**
   * Specifies the allowed range for number of characters in a literal value.
   * @return all valueMaxLength properties as {@link java.util.Collection} or an empty collection 
   * if valueMaxLength was not set.
   */
  @JsonIgnore public java.util.Collection<Integer> getValueMaxLengthIntegers() {
    final java.lang.Object current = myData.get("valueMaxLength");
    if (current == null) return Collections.emptyList();
    if (current instanceof java.util.Collection) {
      return (java.util.Collection<Integer>) current;
    }
    return Arrays.asList((Integer) current);
  }
  /**
   * Specifies the allowed range for number of characters in a literal value.
   * @return valueMaxLength property set by first invocation of valueMaxLength method or {@code null}.
   */
  @JsonIgnore public Long getValueMaxLengthLong() {
    return (Long) getValue("valueMaxLength");
  }
  /**
   * Specifies the allowed range for number of characters in a literal value.
   * @return all valueMaxLength properties as {@link java.util.Collection} or an empty collection 
   * if valueMaxLength was not set.
   */
  @JsonIgnore public java.util.Collection<Long> getValueMaxLengthLongs() {
    final java.lang.Object current = myData.get("valueMaxLength");
    if (current == null) return Collections.emptyList();
    if (current instanceof java.util.Collection) {
      return (java.util.Collection<Long>) current;
    }
    return Arrays.asList((Long) current);
  }
  /**
   * Specifies the allowed range for number of characters in a literal value.
   * @return valueMaxLength property set by first invocation of valueMaxLength method or {@code null}.
   */
  @JsonIgnore public Float getValueMaxLengthFloat() {
    return (Float) getValue("valueMaxLength");
  }
  /**
   * Specifies the allowed range for number of characters in a literal value.
   * @return all valueMaxLength properties as {@link java.util.Collection} or an empty collection 
   * if valueMaxLength was not set.
   */
  @JsonIgnore public java.util.Collection<Float> getValueMaxLengthFloats() {
    final java.lang.Object current = myData.get("valueMaxLength");
    if (current == null) return Collections.emptyList();
    if (current instanceof java.util.Collection) {
      return (java.util.Collection<Float>) current;
    }
    return Arrays.asList((Float) current);
  }
  /**
   * Specifies the allowed range for number of characters in a literal value.
   * @return valueMaxLength property set by first invocation of valueMaxLength method or {@code null}.
   */
  @JsonIgnore public Double getValueMaxLengthDouble() {
    return (Double) getValue("valueMaxLength");
  }
  /**
   * Specifies the allowed range for number of characters in a literal value.
   * @return all valueMaxLength properties as {@link java.util.Collection} or an empty collection 
   * if valueMaxLength was not set.
   */
  @JsonIgnore public java.util.Collection<Double> getValueMaxLengthDoubles() {
    final java.lang.Object current = myData.get("valueMaxLength");
    if (current == null) return Collections.emptyList();
    if (current instanceof java.util.Collection) {
      return (java.util.Collection<Double>) current;
    }
    return Arrays.asList((Double) current);
  }
  /**
   * Specifies the allowed range for number of characters in a literal value.
   * @return valueMaxLength property set by first invocation of valueMaxLength method or {@code null}.
   */
  @JsonIgnore public String getValueMaxLengthString() {
    return (String) getValue("valueMaxLength");
  }
  /**
   * Specifies the allowed range for number of characters in a literal value.
   * @return all valueMaxLength properties as {@link java.util.Collection} or an empty collection 
   * if valueMaxLength was not set.
   */
  @JsonIgnore public java.util.Collection<String> getValueMaxLengthStrings() {
    final java.lang.Object current = myData.get("valueMaxLength");
    if (current == null) return Collections.emptyList();
    if (current instanceof java.util.Collection) {
      return (java.util.Collection<String>) current;
    }
    return Arrays.asList((String) current);
  }
  protected PropertyValueSpecification(java.util.Map<String,java.lang.Object> data) {
    super(data);
  }
  
  /**
   * Builder for {@link PropertyValueSpecification}
   */
  public static class Builder extends Intangible.Builder {
    public Builder(@NotNull HashMap<String,java.lang.Object> data) {
      super(data);
    }
    @NotNull public PropertyValueSpecification build() {
      return new PropertyValueSpecification(myData);
    }
    /**
     * Specifies the minimum allowed range for number of characters in a literal value.
     * @param integer value to set
     * @return this builder instance
     */
    @NotNull public Builder valueMinLength(@NotNull Integer integer) {
      putValue("valueMinLength", integer);
      return this;
    }
    /**
     * Specifies the minimum allowed range for number of characters in a literal value.
     * @param valueMinLength value to set
     * @return this builder instance
     */
    @NotNull public Builder valueMinLength(@NotNull Long valueMinLength) {
      putValue("valueMinLength", valueMinLength);
      return this;
    }
    /**
     * Specifies the minimum allowed range for number of characters in a literal value.
     * @param valueMinLength value to set
     * @return this builder instance
     */
    @NotNull public Builder valueMinLength(@NotNull Float valueMinLength) {
      putValue("valueMinLength", valueMinLength);
      return this;
    }
    /**
     * Specifies the minimum allowed range for number of characters in a literal value.
     * @param valueMinLength value to set
     * @return this builder instance
     */
    @NotNull public Builder valueMinLength(@NotNull Double valueMinLength) {
      putValue("valueMinLength", valueMinLength);
      return this;
    }
    /**
     * Specifies the minimum allowed range for number of characters in a literal value.
     * @param valueMinLength value to set
     * @return this builder instance
     */
    @NotNull public Builder valueMinLength(@NotNull String valueMinLength) {
      putValue("valueMinLength", valueMinLength);
      return this;
    }
    /**
     * Remove valueMinLength property from the builder.
     * If this property is repeatable, all instances are removed.
     * @return this builder instance
     */
    @NotNull public Builder removeValueMinLength() {
      removeValue("valueMinLength");
      return this;
    }
    /**
     * Get currently set value for valueMinLength property in this builder.
     * @return previously set value or {@code null}. If multiple values have been 
     * set to this property, then {@link java.util.Collection} instance will be 
     * returned.
     */
    @Nullable public java.lang.Object getValueMinLength() {
      return myData.get("valueMinLength");
    }
    /**
     * Indicates the name of the PropertyValueSpecification to be used in URL templates and form encoding in a manner analogous to HTML's input@name.
     * @param valueName value to set
     * @return this builder instance
     */
    @NotNull public Builder valueName(@NotNull String valueName) {
      putValue("valueName", valueName);
      return this;
    }
    /**
     * Remove valueName property from the builder.
     * If this property is repeatable, all instances are removed.
     * @return this builder instance
     */
    @NotNull public Builder removeValueName() {
      removeValue("valueName");
      return this;
    }
    /**
     * Get currently set value for valueName property in this builder.
     * @return previously set value or {@code null}. If multiple values have been 
     * set to this property, then {@link java.util.Collection} instance will be 
     * returned.
     */
    @Nullable public java.lang.Object getValueName() {
      return myData.get("valueName");
    }
    /**
     * Whether or not a property is mutable.  Default is false. Specifying this for a property that also has a value makes it act similar to a &quot;hidden&quot; input in an HTML form.
     * @param readonlyValue value to set
     * @return this builder instance
     */
    @NotNull public Builder readonlyValue(@NotNull Boolean readonlyValue) {
      putValue("readonlyValue", readonlyValue);
      return this;
    }
    /**
     * Remove readonlyValue property from the builder.
     * If this property is repeatable, all instances are removed.
     * @return this builder instance
     */
    @NotNull public Builder removeReadonlyValue() {
      removeValue("readonlyValue");
      return this;
    }
    /**
     * Get currently set value for readonlyValue property in this builder.
     * @return previously set value or {@code null}. If multiple values have been 
     * set to this property, then {@link java.util.Collection} instance will be 
     * returned.
     */
    @Nullable public java.lang.Object getReadonlyValue() {
      return myData.get("readonlyValue");
    }
    /**
     * Whether multiple values are allowed for the property.  Default is false.
     * @param multipleValues value to set
     * @return this builder instance
     */
    @NotNull public Builder multipleValues(@NotNull Boolean multipleValues) {
      putValue("multipleValues", multipleValues);
      return this;
    }
    /**
     * Remove multipleValues property from the builder.
     * If this property is repeatable, all instances are removed.
     * @return this builder instance
     */
    @NotNull public Builder removeMultipleValues() {
      removeValue("multipleValues");
      return this;
    }
    /**
     * Get currently set value for multipleValues property in this builder.
     * @return previously set value or {@code null}. If multiple values have been 
     * set to this property, then {@link java.util.Collection} instance will be 
     * returned.
     */
    @Nullable public java.lang.Object getMultipleValues() {
      return myData.get("multipleValues");
    }
    /**
     * The default value of the input.  For properties that expect a literal, the default is a literal value, for properties that expect an object, it's an ID reference to one of the current values.
     * @param defaultValue value to set
     * @return this builder instance
     */
    @NotNull public Builder defaultValue(@NotNull String defaultValue) {
      putValue("defaultValue", defaultValue);
      return this;
    }
    /**
     * The default value of the input.  For properties that expect a literal, the default is a literal value, for properties that expect an object, it's an ID reference to one of the current values.
     * @param thing value to set
     * @return this builder instance
     */
    @NotNull public Builder defaultValue(@NotNull Thing thing) {
      putValue("defaultValue", thing);
      return this;
    }
    /**
     * The default value of the input.  For properties that expect a literal, the default is a literal value, for properties that expect an object, it's an ID reference to one of the current values.
     * @param thing value to set
     * @return this builder instance
     */
    @NotNull public Builder defaultValue(@NotNull Thing.Builder thing) {
      putValue("defaultValue", thing.build());
      return this;
    }
    /**
     * Remove defaultValue property from the builder.
     * If this property is repeatable, all instances are removed.
     * @return this builder instance
     */
    @NotNull public Builder removeDefaultValue() {
      removeValue("defaultValue");
      return this;
    }
    /**
     * Get currently set value for defaultValue property in this builder.
     * @return previously set value or {@code null}. If multiple values have been 
     * set to this property, then {@link java.util.Collection} instance will be 
     * returned.
     */
    @Nullable public java.lang.Object getDefaultValue() {
      return myData.get("defaultValue");
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
     * The stepValue attribute indicates the granularity that is expected (and required) of the value in a PropertyValueSpecification.
     * @param integer value to set
     * @return this builder instance
     */
    @NotNull public Builder stepValue(@NotNull Integer integer) {
      putValue("stepValue", integer);
      return this;
    }
    /**
     * The stepValue attribute indicates the granularity that is expected (and required) of the value in a PropertyValueSpecification.
     * @param stepValue value to set
     * @return this builder instance
     */
    @NotNull public Builder stepValue(@NotNull Long stepValue) {
      putValue("stepValue", stepValue);
      return this;
    }
    /**
     * The stepValue attribute indicates the granularity that is expected (and required) of the value in a PropertyValueSpecification.
     * @param stepValue value to set
     * @return this builder instance
     */
    @NotNull public Builder stepValue(@NotNull Float stepValue) {
      putValue("stepValue", stepValue);
      return this;
    }
    /**
     * The stepValue attribute indicates the granularity that is expected (and required) of the value in a PropertyValueSpecification.
     * @param stepValue value to set
     * @return this builder instance
     */
    @NotNull public Builder stepValue(@NotNull Double stepValue) {
      putValue("stepValue", stepValue);
      return this;
    }
    /**
     * The stepValue attribute indicates the granularity that is expected (and required) of the value in a PropertyValueSpecification.
     * @param stepValue value to set
     * @return this builder instance
     */
    @NotNull public Builder stepValue(@NotNull String stepValue) {
      putValue("stepValue", stepValue);
      return this;
    }
    /**
     * Remove stepValue property from the builder.
     * If this property is repeatable, all instances are removed.
     * @return this builder instance
     */
    @NotNull public Builder removeStepValue() {
      removeValue("stepValue");
      return this;
    }
    /**
     * Get currently set value for stepValue property in this builder.
     * @return previously set value or {@code null}. If multiple values have been 
     * set to this property, then {@link java.util.Collection} instance will be 
     * returned.
     */
    @Nullable public java.lang.Object getStepValue() {
      return myData.get("stepValue");
    }
    /**
     * Whether the property must be filled in to complete the action.  Default is false.
     * @param valueRequired value to set
     * @return this builder instance
     */
    @NotNull public Builder valueRequired(@NotNull Boolean valueRequired) {
      putValue("valueRequired", valueRequired);
      return this;
    }
    /**
     * Remove valueRequired property from the builder.
     * If this property is repeatable, all instances are removed.
     * @return this builder instance
     */
    @NotNull public Builder removeValueRequired() {
      removeValue("valueRequired");
      return this;
    }
    /**
     * Get currently set value for valueRequired property in this builder.
     * @return previously set value or {@code null}. If multiple values have been 
     * set to this property, then {@link java.util.Collection} instance will be 
     * returned.
     */
    @Nullable public java.lang.Object getValueRequired() {
      return myData.get("valueRequired");
    }
    /**
     * Specifies a regular expression for testing literal values according to the HTML spec.
     * @param valuePattern value to set
     * @return this builder instance
     */
    @NotNull public Builder valuePattern(@NotNull String valuePattern) {
      putValue("valuePattern", valuePattern);
      return this;
    }
    /**
     * Remove valuePattern property from the builder.
     * If this property is repeatable, all instances are removed.
     * @return this builder instance
     */
    @NotNull public Builder removeValuePattern() {
      removeValue("valuePattern");
      return this;
    }
    /**
     * Get currently set value for valuePattern property in this builder.
     * @return previously set value or {@code null}. If multiple values have been 
     * set to this property, then {@link java.util.Collection} instance will be 
     * returned.
     */
    @Nullable public java.lang.Object getValuePattern() {
      return myData.get("valuePattern");
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
     * Specifies the allowed range for number of characters in a literal value.
     * @param integer value to set
     * @return this builder instance
     */
    @NotNull public Builder valueMaxLength(@NotNull Integer integer) {
      putValue("valueMaxLength", integer);
      return this;
    }
    /**
     * Specifies the allowed range for number of characters in a literal value.
     * @param valueMaxLength value to set
     * @return this builder instance
     */
    @NotNull public Builder valueMaxLength(@NotNull Long valueMaxLength) {
      putValue("valueMaxLength", valueMaxLength);
      return this;
    }
    /**
     * Specifies the allowed range for number of characters in a literal value.
     * @param valueMaxLength value to set
     * @return this builder instance
     */
    @NotNull public Builder valueMaxLength(@NotNull Float valueMaxLength) {
      putValue("valueMaxLength", valueMaxLength);
      return this;
    }
    /**
     * Specifies the allowed range for number of characters in a literal value.
     * @param valueMaxLength value to set
     * @return this builder instance
     */
    @NotNull public Builder valueMaxLength(@NotNull Double valueMaxLength) {
      putValue("valueMaxLength", valueMaxLength);
      return this;
    }
    /**
     * Specifies the allowed range for number of characters in a literal value.
     * @param valueMaxLength value to set
     * @return this builder instance
     */
    @NotNull public Builder valueMaxLength(@NotNull String valueMaxLength) {
      putValue("valueMaxLength", valueMaxLength);
      return this;
    }
    /**
     * Remove valueMaxLength property from the builder.
     * If this property is repeatable, all instances are removed.
     * @return this builder instance
     */
    @NotNull public Builder removeValueMaxLength() {
      removeValue("valueMaxLength");
      return this;
    }
    /**
     * Get currently set value for valueMaxLength property in this builder.
     * @return previously set value or {@code null}. If multiple values have been 
     * set to this property, then {@link java.util.Collection} instance will be 
     * returned.
     */
    @Nullable public java.lang.Object getValueMaxLength() {
      return myData.get("valueMaxLength");
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
      if ("valueMinLength".equals(key) && value instanceof Integer) { this.valueMinLength((Integer)value); return; }
      if ("valueMinLengths".equals(key) && value instanceof Integer) { this.valueMinLength((Integer)value); return; }
      if ("valueMinLength".equals(key) && value instanceof Long) { this.valueMinLength((Long)value); return; }
      if ("valueMinLengths".equals(key) && value instanceof Long) { this.valueMinLength((Long)value); return; }
      if ("valueMinLength".equals(key) && value instanceof Float) { this.valueMinLength((Float)value); return; }
      if ("valueMinLengths".equals(key) && value instanceof Float) { this.valueMinLength((Float)value); return; }
      if ("valueMinLength".equals(key) && value instanceof Double) { this.valueMinLength((Double)value); return; }
      if ("valueMinLengths".equals(key) && value instanceof Double) { this.valueMinLength((Double)value); return; }
      if ("valueMinLength".equals(key) && value instanceof String) { this.valueMinLength((String)value); return; }
      if ("valueMinLengths".equals(key) && value instanceof String) { this.valueMinLength((String)value); return; }
      if ("valueName".equals(key) && value instanceof String) { this.valueName((String)value); return; }
      if ("valueNames".equals(key) && value instanceof String) { this.valueName((String)value); return; }
      if ("readonlyValue".equals(key) && value instanceof Boolean) { this.readonlyValue((Boolean)value); return; }
      if ("readonlyValues".equals(key) && value instanceof Boolean) { this.readonlyValue((Boolean)value); return; }
      if ("multipleValues".equals(key) && value instanceof Boolean) { this.multipleValues((Boolean)value); return; }
      if ("multipleValuess".equals(key) && value instanceof Boolean) { this.multipleValues((Boolean)value); return; }
      if ("defaultValue".equals(key) && value instanceof String) { this.defaultValue((String)value); return; }
      if ("defaultValues".equals(key) && value instanceof String) { this.defaultValue((String)value); return; }
      if ("defaultValue".equals(key) && value instanceof Thing) { this.defaultValue((Thing)value); return; }
      if ("defaultValues".equals(key) && value instanceof Thing) { this.defaultValue((Thing)value); return; }
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
      if ("stepValue".equals(key) && value instanceof Integer) { this.stepValue((Integer)value); return; }
      if ("stepValues".equals(key) && value instanceof Integer) { this.stepValue((Integer)value); return; }
      if ("stepValue".equals(key) && value instanceof Long) { this.stepValue((Long)value); return; }
      if ("stepValues".equals(key) && value instanceof Long) { this.stepValue((Long)value); return; }
      if ("stepValue".equals(key) && value instanceof Float) { this.stepValue((Float)value); return; }
      if ("stepValues".equals(key) && value instanceof Float) { this.stepValue((Float)value); return; }
      if ("stepValue".equals(key) && value instanceof Double) { this.stepValue((Double)value); return; }
      if ("stepValues".equals(key) && value instanceof Double) { this.stepValue((Double)value); return; }
      if ("stepValue".equals(key) && value instanceof String) { this.stepValue((String)value); return; }
      if ("stepValues".equals(key) && value instanceof String) { this.stepValue((String)value); return; }
      if ("valueRequired".equals(key) && value instanceof Boolean) { this.valueRequired((Boolean)value); return; }
      if ("valueRequireds".equals(key) && value instanceof Boolean) { this.valueRequired((Boolean)value); return; }
      if ("valuePattern".equals(key) && value instanceof String) { this.valuePattern((String)value); return; }
      if ("valuePatterns".equals(key) && value instanceof String) { this.valuePattern((String)value); return; }
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
      if ("valueMaxLength".equals(key) && value instanceof Integer) { this.valueMaxLength((Integer)value); return; }
      if ("valueMaxLengths".equals(key) && value instanceof Integer) { this.valueMaxLength((Integer)value); return; }
      if ("valueMaxLength".equals(key) && value instanceof Long) { this.valueMaxLength((Long)value); return; }
      if ("valueMaxLengths".equals(key) && value instanceof Long) { this.valueMaxLength((Long)value); return; }
      if ("valueMaxLength".equals(key) && value instanceof Float) { this.valueMaxLength((Float)value); return; }
      if ("valueMaxLengths".equals(key) && value instanceof Float) { this.valueMaxLength((Float)value); return; }
      if ("valueMaxLength".equals(key) && value instanceof Double) { this.valueMaxLength((Double)value); return; }
      if ("valueMaxLengths".equals(key) && value instanceof Double) { this.valueMaxLength((Double)value); return; }
      if ("valueMaxLength".equals(key) && value instanceof String) { this.valueMaxLength((String)value); return; }
      if ("valueMaxLengths".equals(key) && value instanceof String) { this.valueMaxLength((String)value); return; }
      super.fromMap(key, value);
    }
  }
  
}
