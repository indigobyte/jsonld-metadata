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
 * A Property value specification.
 */
public class PropertyValueSpecification extends Intangible {
  /**
   * Specifies the minimum allowed range for number of characters in a literal value.
   */
  @JsonIgnore public Integer getValueMinLengthInteger() {
    return (Integer) getValue("valueMinLength");
  }
  /**
   * Specifies the minimum allowed range for number of characters in a literal value.
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
   */
  @JsonIgnore public Long getValueMinLengthLong() {
    return (Long) getValue("valueMinLength");
  }
  /**
   * Specifies the minimum allowed range for number of characters in a literal value.
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
   */
  @JsonIgnore public Float getValueMinLengthFloat() {
    return (Float) getValue("valueMinLength");
  }
  /**
   * Specifies the minimum allowed range for number of characters in a literal value.
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
   */
  @JsonIgnore public Double getValueMinLengthDouble() {
    return (Double) getValue("valueMinLength");
  }
  /**
   * Specifies the minimum allowed range for number of characters in a literal value.
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
   */
  @JsonIgnore public String getValueMinLengthString() {
    return (String) getValue("valueMinLength");
  }
  /**
   * Specifies the minimum allowed range for number of characters in a literal value.
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
   */
  @JsonIgnore public String getValueName() {
    return (String) getValue("valueName");
  }
  /**
   * Indicates the name of the PropertyValueSpecification to be used in URL templates and form encoding in a manner analogous to HTML's input@name.
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
   */
  @JsonIgnore public Boolean getReadonlyValue() {
    return (Boolean) getValue("readonlyValue");
  }
  /**
   * Whether or not a property is mutable.  Default is false. Specifying this for a property that also has a value makes it act similar to a &quot;hidden&quot; input in an HTML form.
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
   */
  @JsonIgnore public Boolean getMultipleValues() {
    return (Boolean) getValue("multipleValues");
  }
  /**
   * Whether multiple values are allowed for the property.  Default is false.
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
   */
  @JsonIgnore public String getDefaultValueString() {
    return (String) getValue("defaultValue");
  }
  /**
   * The default value of the input.  For properties that expect a literal, the default is a literal value, for properties that expect an object, it's an ID reference to one of the current values.
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
   */
  @JsonIgnore public Thing getDefaultValueThing() {
    return (Thing) getValue("defaultValue");
  }
  /**
   * The default value of the input.  For properties that expect a literal, the default is a literal value, for properties that expect an object, it's an ID reference to one of the current values.
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
   */
  @JsonIgnore public Integer getMaxValueInteger() {
    return (Integer) getValue("maxValue");
  }
  /**
   * The upper value of some characteristic or property.
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
   */
  @JsonIgnore public Long getMaxValueLong() {
    return (Long) getValue("maxValue");
  }
  /**
   * The upper value of some characteristic or property.
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
   */
  @JsonIgnore public Float getMaxValueFloat() {
    return (Float) getValue("maxValue");
  }
  /**
   * The upper value of some characteristic or property.
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
   */
  @JsonIgnore public Double getMaxValueDouble() {
    return (Double) getValue("maxValue");
  }
  /**
   * The upper value of some characteristic or property.
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
   */
  @JsonIgnore public String getMaxValueString() {
    return (String) getValue("maxValue");
  }
  /**
   * The upper value of some characteristic or property.
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
   */
  @JsonIgnore public Integer getStepValueInteger() {
    return (Integer) getValue("stepValue");
  }
  /**
   * The stepValue attribute indicates the granularity that is expected (and required) of the value in a PropertyValueSpecification.
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
   */
  @JsonIgnore public Long getStepValueLong() {
    return (Long) getValue("stepValue");
  }
  /**
   * The stepValue attribute indicates the granularity that is expected (and required) of the value in a PropertyValueSpecification.
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
   */
  @JsonIgnore public Float getStepValueFloat() {
    return (Float) getValue("stepValue");
  }
  /**
   * The stepValue attribute indicates the granularity that is expected (and required) of the value in a PropertyValueSpecification.
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
   */
  @JsonIgnore public Double getStepValueDouble() {
    return (Double) getValue("stepValue");
  }
  /**
   * The stepValue attribute indicates the granularity that is expected (and required) of the value in a PropertyValueSpecification.
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
   */
  @JsonIgnore public String getStepValueString() {
    return (String) getValue("stepValue");
  }
  /**
   * The stepValue attribute indicates the granularity that is expected (and required) of the value in a PropertyValueSpecification.
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
   */
  @JsonIgnore public Boolean getValueRequired() {
    return (Boolean) getValue("valueRequired");
  }
  /**
   * Whether the property must be filled in to complete the action.  Default is false.
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
   */
  @JsonIgnore public String getValuePattern() {
    return (String) getValue("valuePattern");
  }
  /**
   * Specifies a regular expression for testing literal values according to the HTML spec.
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
   */
  @JsonIgnore public Integer getMinValueInteger() {
    return (Integer) getValue("minValue");
  }
  /**
   * The lower value of some characteristic or property.
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
   */
  @JsonIgnore public Long getMinValueLong() {
    return (Long) getValue("minValue");
  }
  /**
   * The lower value of some characteristic or property.
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
   */
  @JsonIgnore public Float getMinValueFloat() {
    return (Float) getValue("minValue");
  }
  /**
   * The lower value of some characteristic or property.
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
   */
  @JsonIgnore public Double getMinValueDouble() {
    return (Double) getValue("minValue");
  }
  /**
   * The lower value of some characteristic or property.
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
   */
  @JsonIgnore public String getMinValueString() {
    return (String) getValue("minValue");
  }
  /**
   * The lower value of some characteristic or property.
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
   */
  @JsonIgnore public Integer getValueMaxLengthInteger() {
    return (Integer) getValue("valueMaxLength");
  }
  /**
   * Specifies the allowed range for number of characters in a literal value.
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
   */
  @JsonIgnore public Long getValueMaxLengthLong() {
    return (Long) getValue("valueMaxLength");
  }
  /**
   * Specifies the allowed range for number of characters in a literal value.
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
   */
  @JsonIgnore public Float getValueMaxLengthFloat() {
    return (Float) getValue("valueMaxLength");
  }
  /**
   * Specifies the allowed range for number of characters in a literal value.
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
   */
  @JsonIgnore public Double getValueMaxLengthDouble() {
    return (Double) getValue("valueMaxLength");
  }
  /**
   * Specifies the allowed range for number of characters in a literal value.
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
   */
  @JsonIgnore public String getValueMaxLengthString() {
    return (String) getValue("valueMaxLength");
  }
  /**
   * Specifies the allowed range for number of characters in a literal value.
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
     */
    @NotNull public Builder valueMinLength(@NotNull Integer integer) {
      putValue("valueMinLength", integer);
      return this;
    }
    /**
     * Specifies the minimum allowed range for number of characters in a literal value.
     */
    @NotNull public Builder valueMinLength(@NotNull Long valueMinLength) {
      putValue("valueMinLength", valueMinLength);
      return this;
    }
    /**
     * Specifies the minimum allowed range for number of characters in a literal value.
     */
    @NotNull public Builder valueMinLength(@NotNull Float valueMinLength) {
      putValue("valueMinLength", valueMinLength);
      return this;
    }
    /**
     * Specifies the minimum allowed range for number of characters in a literal value.
     */
    @NotNull public Builder valueMinLength(@NotNull Double valueMinLength) {
      putValue("valueMinLength", valueMinLength);
      return this;
    }
    /**
     * Specifies the minimum allowed range for number of characters in a literal value.
     */
    @NotNull public Builder valueMinLength(@NotNull String valueMinLength) {
      putValue("valueMinLength", valueMinLength);
      return this;
    }
    /**
     * Indicates the name of the PropertyValueSpecification to be used in URL templates and form encoding in a manner analogous to HTML's input@name.
     */
    @NotNull public Builder valueName(@NotNull String valueName) {
      putValue("valueName", valueName);
      return this;
    }
    /**
     * Whether or not a property is mutable.  Default is false. Specifying this for a property that also has a value makes it act similar to a &quot;hidden&quot; input in an HTML form.
     */
    @NotNull public Builder readonlyValue(@NotNull Boolean readonlyValue) {
      putValue("readonlyValue", readonlyValue);
      return this;
    }
    /**
     * Whether multiple values are allowed for the property.  Default is false.
     */
    @NotNull public Builder multipleValues(@NotNull Boolean multipleValues) {
      putValue("multipleValues", multipleValues);
      return this;
    }
    /**
     * The default value of the input.  For properties that expect a literal, the default is a literal value, for properties that expect an object, it's an ID reference to one of the current values.
     */
    @NotNull public Builder defaultValue(@NotNull String defaultValue) {
      putValue("defaultValue", defaultValue);
      return this;
    }
    /**
     * The default value of the input.  For properties that expect a literal, the default is a literal value, for properties that expect an object, it's an ID reference to one of the current values.
     */
    @NotNull public Builder defaultValue(@NotNull Thing thing) {
      putValue("defaultValue", thing);
      return this;
    }
    /**
     * The default value of the input.  For properties that expect a literal, the default is a literal value, for properties that expect an object, it's an ID reference to one of the current values.
     */
    @NotNull public Builder defaultValue(@NotNull Thing.Builder thing) {
      putValue("defaultValue", thing.build());
      return this;
    }
    /**
     * The upper value of some characteristic or property.
     */
    @NotNull public Builder maxValue(@NotNull Integer integer) {
      putValue("maxValue", integer);
      return this;
    }
    /**
     * The upper value of some characteristic or property.
     */
    @NotNull public Builder maxValue(@NotNull Long maxValue) {
      putValue("maxValue", maxValue);
      return this;
    }
    /**
     * The upper value of some characteristic or property.
     */
    @NotNull public Builder maxValue(@NotNull Float maxValue) {
      putValue("maxValue", maxValue);
      return this;
    }
    /**
     * The upper value of some characteristic or property.
     */
    @NotNull public Builder maxValue(@NotNull Double maxValue) {
      putValue("maxValue", maxValue);
      return this;
    }
    /**
     * The upper value of some characteristic or property.
     */
    @NotNull public Builder maxValue(@NotNull String maxValue) {
      putValue("maxValue", maxValue);
      return this;
    }
    /**
     * The stepValue attribute indicates the granularity that is expected (and required) of the value in a PropertyValueSpecification.
     */
    @NotNull public Builder stepValue(@NotNull Integer integer) {
      putValue("stepValue", integer);
      return this;
    }
    /**
     * The stepValue attribute indicates the granularity that is expected (and required) of the value in a PropertyValueSpecification.
     */
    @NotNull public Builder stepValue(@NotNull Long stepValue) {
      putValue("stepValue", stepValue);
      return this;
    }
    /**
     * The stepValue attribute indicates the granularity that is expected (and required) of the value in a PropertyValueSpecification.
     */
    @NotNull public Builder stepValue(@NotNull Float stepValue) {
      putValue("stepValue", stepValue);
      return this;
    }
    /**
     * The stepValue attribute indicates the granularity that is expected (and required) of the value in a PropertyValueSpecification.
     */
    @NotNull public Builder stepValue(@NotNull Double stepValue) {
      putValue("stepValue", stepValue);
      return this;
    }
    /**
     * The stepValue attribute indicates the granularity that is expected (and required) of the value in a PropertyValueSpecification.
     */
    @NotNull public Builder stepValue(@NotNull String stepValue) {
      putValue("stepValue", stepValue);
      return this;
    }
    /**
     * Whether the property must be filled in to complete the action.  Default is false.
     */
    @NotNull public Builder valueRequired(@NotNull Boolean valueRequired) {
      putValue("valueRequired", valueRequired);
      return this;
    }
    /**
     * Specifies a regular expression for testing literal values according to the HTML spec.
     */
    @NotNull public Builder valuePattern(@NotNull String valuePattern) {
      putValue("valuePattern", valuePattern);
      return this;
    }
    /**
     * The lower value of some characteristic or property.
     */
    @NotNull public Builder minValue(@NotNull Integer integer) {
      putValue("minValue", integer);
      return this;
    }
    /**
     * The lower value of some characteristic or property.
     */
    @NotNull public Builder minValue(@NotNull Long minValue) {
      putValue("minValue", minValue);
      return this;
    }
    /**
     * The lower value of some characteristic or property.
     */
    @NotNull public Builder minValue(@NotNull Float minValue) {
      putValue("minValue", minValue);
      return this;
    }
    /**
     * The lower value of some characteristic or property.
     */
    @NotNull public Builder minValue(@NotNull Double minValue) {
      putValue("minValue", minValue);
      return this;
    }
    /**
     * The lower value of some characteristic or property.
     */
    @NotNull public Builder minValue(@NotNull String minValue) {
      putValue("minValue", minValue);
      return this;
    }
    /**
     * Specifies the allowed range for number of characters in a literal value.
     */
    @NotNull public Builder valueMaxLength(@NotNull Integer integer) {
      putValue("valueMaxLength", integer);
      return this;
    }
    /**
     * Specifies the allowed range for number of characters in a literal value.
     */
    @NotNull public Builder valueMaxLength(@NotNull Long valueMaxLength) {
      putValue("valueMaxLength", valueMaxLength);
      return this;
    }
    /**
     * Specifies the allowed range for number of characters in a literal value.
     */
    @NotNull public Builder valueMaxLength(@NotNull Float valueMaxLength) {
      putValue("valueMaxLength", valueMaxLength);
      return this;
    }
    /**
     * Specifies the allowed range for number of characters in a literal value.
     */
    @NotNull public Builder valueMaxLength(@NotNull Double valueMaxLength) {
      putValue("valueMaxLength", valueMaxLength);
      return this;
    }
    /**
     * Specifies the allowed range for number of characters in a literal value.
     */
    @NotNull public Builder valueMaxLength(@NotNull String valueMaxLength) {
      putValue("valueMaxLength", valueMaxLength);
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
    @NotNull public Builder disambiguatingDescription(@NotNull Description description) {
      putValue("disambiguatingDescription", description);
      return this;
    }
    /**
     * A description of the item.
     */
    @NotNull public Builder description(@NotNull Description description) {
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
