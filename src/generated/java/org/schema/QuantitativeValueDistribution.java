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
 * A statistical distribution of values.Source: https://github.com/schemaorg/schemaorg/issues/1698
 */
public class QuantitativeValueDistribution extends StructuredValue {
  /**
   * The duration of the item (movie, audio recording, event, etc.) in [ISO 8601 date format](http://en.wikipedia.org/wiki/ISO_8601).
   */
  @JsonIgnore public LoanTerm getDuration() {
    return (LoanTerm) getValue("duration");
  }
  /**
   * The duration of the item (movie, audio recording, event, etc.) in [ISO 8601 date format](http://en.wikipedia.org/wiki/ISO_8601).
   */
  @JsonIgnore public Collection<LoanTerm> getDurations() {
    final Object current = myData.get("duration");
    if (current == null) return Collections.emptyList();
    if (current instanceof Collection) {
      return (Collection<LoanTerm>) current;
    }
    return Arrays.asList((LoanTerm) current);
  }
  /**
   * The 10th percentile value.
   */
  @JsonIgnore public Integer getPercentile10Integer() {
    return (Integer) getValue("percentile10");
  }
  /**
   * The 10th percentile value.
   */
  @JsonIgnore public Collection<Integer> getPercentile10Integers() {
    final Object current = myData.get("percentile10");
    if (current == null) return Collections.emptyList();
    if (current instanceof Collection) {
      return (Collection<Integer>) current;
    }
    return Arrays.asList((Integer) current);
  }
  /**
   * The 10th percentile value.
   */
  @JsonIgnore public Long getPercentile10Long() {
    return (Long) getValue("percentile10");
  }
  /**
   * The 10th percentile value.
   */
  @JsonIgnore public Collection<Long> getPercentile10Longs() {
    final Object current = myData.get("percentile10");
    if (current == null) return Collections.emptyList();
    if (current instanceof Collection) {
      return (Collection<Long>) current;
    }
    return Arrays.asList((Long) current);
  }
  /**
   * The 10th percentile value.
   */
  @JsonIgnore public Float getPercentile10Float() {
    return (Float) getValue("percentile10");
  }
  /**
   * The 10th percentile value.
   */
  @JsonIgnore public Collection<Float> getPercentile10Floats() {
    final Object current = myData.get("percentile10");
    if (current == null) return Collections.emptyList();
    if (current instanceof Collection) {
      return (Collection<Float>) current;
    }
    return Arrays.asList((Float) current);
  }
  /**
   * The 10th percentile value.
   */
  @JsonIgnore public Double getPercentile10Double() {
    return (Double) getValue("percentile10");
  }
  /**
   * The 10th percentile value.
   */
  @JsonIgnore public Collection<Double> getPercentile10Doubles() {
    final Object current = myData.get("percentile10");
    if (current == null) return Collections.emptyList();
    if (current instanceof Collection) {
      return (Collection<Double>) current;
    }
    return Arrays.asList((Double) current);
  }
  /**
   * The 10th percentile value.
   */
  @JsonIgnore public String getPercentile10String() {
    return (String) getValue("percentile10");
  }
  /**
   * The 10th percentile value.
   */
  @JsonIgnore public Collection<String> getPercentile10Strings() {
    final Object current = myData.get("percentile10");
    if (current == null) return Collections.emptyList();
    if (current instanceof Collection) {
      return (Collection<String>) current;
    }
    return Arrays.asList((String) current);
  }
  /**
   * The 25th percentile value.
   */
  @JsonIgnore public Integer getPercentile25Integer() {
    return (Integer) getValue("percentile25");
  }
  /**
   * The 25th percentile value.
   */
  @JsonIgnore public Collection<Integer> getPercentile25Integers() {
    final Object current = myData.get("percentile25");
    if (current == null) return Collections.emptyList();
    if (current instanceof Collection) {
      return (Collection<Integer>) current;
    }
    return Arrays.asList((Integer) current);
  }
  /**
   * The 25th percentile value.
   */
  @JsonIgnore public Long getPercentile25Long() {
    return (Long) getValue("percentile25");
  }
  /**
   * The 25th percentile value.
   */
  @JsonIgnore public Collection<Long> getPercentile25Longs() {
    final Object current = myData.get("percentile25");
    if (current == null) return Collections.emptyList();
    if (current instanceof Collection) {
      return (Collection<Long>) current;
    }
    return Arrays.asList((Long) current);
  }
  /**
   * The 25th percentile value.
   */
  @JsonIgnore public Float getPercentile25Float() {
    return (Float) getValue("percentile25");
  }
  /**
   * The 25th percentile value.
   */
  @JsonIgnore public Collection<Float> getPercentile25Floats() {
    final Object current = myData.get("percentile25");
    if (current == null) return Collections.emptyList();
    if (current instanceof Collection) {
      return (Collection<Float>) current;
    }
    return Arrays.asList((Float) current);
  }
  /**
   * The 25th percentile value.
   */
  @JsonIgnore public Double getPercentile25Double() {
    return (Double) getValue("percentile25");
  }
  /**
   * The 25th percentile value.
   */
  @JsonIgnore public Collection<Double> getPercentile25Doubles() {
    final Object current = myData.get("percentile25");
    if (current == null) return Collections.emptyList();
    if (current instanceof Collection) {
      return (Collection<Double>) current;
    }
    return Arrays.asList((Double) current);
  }
  /**
   * The 25th percentile value.
   */
  @JsonIgnore public String getPercentile25String() {
    return (String) getValue("percentile25");
  }
  /**
   * The 25th percentile value.
   */
  @JsonIgnore public Collection<String> getPercentile25Strings() {
    final Object current = myData.get("percentile25");
    if (current == null) return Collections.emptyList();
    if (current instanceof Collection) {
      return (Collection<String>) current;
    }
    return Arrays.asList((String) current);
  }
  /**
   * The median value.
   */
  @JsonIgnore public Integer getMedianInteger() {
    return (Integer) getValue("median");
  }
  /**
   * The median value.
   */
  @JsonIgnore public Collection<Integer> getMedianIntegers() {
    final Object current = myData.get("median");
    if (current == null) return Collections.emptyList();
    if (current instanceof Collection) {
      return (Collection<Integer>) current;
    }
    return Arrays.asList((Integer) current);
  }
  /**
   * The median value.
   */
  @JsonIgnore public Long getMedianLong() {
    return (Long) getValue("median");
  }
  /**
   * The median value.
   */
  @JsonIgnore public Collection<Long> getMedianLongs() {
    final Object current = myData.get("median");
    if (current == null) return Collections.emptyList();
    if (current instanceof Collection) {
      return (Collection<Long>) current;
    }
    return Arrays.asList((Long) current);
  }
  /**
   * The median value.
   */
  @JsonIgnore public Float getMedianFloat() {
    return (Float) getValue("median");
  }
  /**
   * The median value.
   */
  @JsonIgnore public Collection<Float> getMedianFloats() {
    final Object current = myData.get("median");
    if (current == null) return Collections.emptyList();
    if (current instanceof Collection) {
      return (Collection<Float>) current;
    }
    return Arrays.asList((Float) current);
  }
  /**
   * The median value.
   */
  @JsonIgnore public Double getMedianDouble() {
    return (Double) getValue("median");
  }
  /**
   * The median value.
   */
  @JsonIgnore public Collection<Double> getMedianDoubles() {
    final Object current = myData.get("median");
    if (current == null) return Collections.emptyList();
    if (current instanceof Collection) {
      return (Collection<Double>) current;
    }
    return Arrays.asList((Double) current);
  }
  /**
   * The median value.
   */
  @JsonIgnore public String getMedianString() {
    return (String) getValue("median");
  }
  /**
   * The median value.
   */
  @JsonIgnore public Collection<String> getMedianStrings() {
    final Object current = myData.get("median");
    if (current == null) return Collections.emptyList();
    if (current instanceof Collection) {
      return (Collection<String>) current;
    }
    return Arrays.asList((String) current);
  }
  /**
   * The 75th percentile value.
   */
  @JsonIgnore public Integer getPercentile75Integer() {
    return (Integer) getValue("percentile75");
  }
  /**
   * The 75th percentile value.
   */
  @JsonIgnore public Collection<Integer> getPercentile75Integers() {
    final Object current = myData.get("percentile75");
    if (current == null) return Collections.emptyList();
    if (current instanceof Collection) {
      return (Collection<Integer>) current;
    }
    return Arrays.asList((Integer) current);
  }
  /**
   * The 75th percentile value.
   */
  @JsonIgnore public Long getPercentile75Long() {
    return (Long) getValue("percentile75");
  }
  /**
   * The 75th percentile value.
   */
  @JsonIgnore public Collection<Long> getPercentile75Longs() {
    final Object current = myData.get("percentile75");
    if (current == null) return Collections.emptyList();
    if (current instanceof Collection) {
      return (Collection<Long>) current;
    }
    return Arrays.asList((Long) current);
  }
  /**
   * The 75th percentile value.
   */
  @JsonIgnore public Float getPercentile75Float() {
    return (Float) getValue("percentile75");
  }
  /**
   * The 75th percentile value.
   */
  @JsonIgnore public Collection<Float> getPercentile75Floats() {
    final Object current = myData.get("percentile75");
    if (current == null) return Collections.emptyList();
    if (current instanceof Collection) {
      return (Collection<Float>) current;
    }
    return Arrays.asList((Float) current);
  }
  /**
   * The 75th percentile value.
   */
  @JsonIgnore public Double getPercentile75Double() {
    return (Double) getValue("percentile75");
  }
  /**
   * The 75th percentile value.
   */
  @JsonIgnore public Collection<Double> getPercentile75Doubles() {
    final Object current = myData.get("percentile75");
    if (current == null) return Collections.emptyList();
    if (current instanceof Collection) {
      return (Collection<Double>) current;
    }
    return Arrays.asList((Double) current);
  }
  /**
   * The 75th percentile value.
   */
  @JsonIgnore public String getPercentile75String() {
    return (String) getValue("percentile75");
  }
  /**
   * The 75th percentile value.
   */
  @JsonIgnore public Collection<String> getPercentile75Strings() {
    final Object current = myData.get("percentile75");
    if (current == null) return Collections.emptyList();
    if (current instanceof Collection) {
      return (Collection<String>) current;
    }
    return Arrays.asList((String) current);
  }
  /**
   * The 90th percentile value.
   */
  @JsonIgnore public Integer getPercentile90Integer() {
    return (Integer) getValue("percentile90");
  }
  /**
   * The 90th percentile value.
   */
  @JsonIgnore public Collection<Integer> getPercentile90Integers() {
    final Object current = myData.get("percentile90");
    if (current == null) return Collections.emptyList();
    if (current instanceof Collection) {
      return (Collection<Integer>) current;
    }
    return Arrays.asList((Integer) current);
  }
  /**
   * The 90th percentile value.
   */
  @JsonIgnore public Long getPercentile90Long() {
    return (Long) getValue("percentile90");
  }
  /**
   * The 90th percentile value.
   */
  @JsonIgnore public Collection<Long> getPercentile90Longs() {
    final Object current = myData.get("percentile90");
    if (current == null) return Collections.emptyList();
    if (current instanceof Collection) {
      return (Collection<Long>) current;
    }
    return Arrays.asList((Long) current);
  }
  /**
   * The 90th percentile value.
   */
  @JsonIgnore public Float getPercentile90Float() {
    return (Float) getValue("percentile90");
  }
  /**
   * The 90th percentile value.
   */
  @JsonIgnore public Collection<Float> getPercentile90Floats() {
    final Object current = myData.get("percentile90");
    if (current == null) return Collections.emptyList();
    if (current instanceof Collection) {
      return (Collection<Float>) current;
    }
    return Arrays.asList((Float) current);
  }
  /**
   * The 90th percentile value.
   */
  @JsonIgnore public Double getPercentile90Double() {
    return (Double) getValue("percentile90");
  }
  /**
   * The 90th percentile value.
   */
  @JsonIgnore public Collection<Double> getPercentile90Doubles() {
    final Object current = myData.get("percentile90");
    if (current == null) return Collections.emptyList();
    if (current instanceof Collection) {
      return (Collection<Double>) current;
    }
    return Arrays.asList((Double) current);
  }
  /**
   * The 90th percentile value.
   */
  @JsonIgnore public String getPercentile90String() {
    return (String) getValue("percentile90");
  }
  /**
   * The 90th percentile value.
   */
  @JsonIgnore public Collection<String> getPercentile90Strings() {
    final Object current = myData.get("percentile90");
    if (current == null) return Collections.emptyList();
    if (current instanceof Collection) {
      return (Collection<String>) current;
    }
    return Arrays.asList((String) current);
  }
  protected QuantitativeValueDistribution(java.util.Map<String,Object> data) {
    super(data);
  }
  
  /**
   * Builder for {@link QuantitativeValueDistribution}
   */
  public static class Builder extends StructuredValue.Builder {
    public Builder(@NotNull HashMap<String,Object> data) {
      super(data);
    }
    @NotNull public QuantitativeValueDistribution build() {
      return new QuantitativeValueDistribution(myData);
    }
    /**
     * The duration of the item (movie, audio recording, event, etc.) in [ISO 8601 date format](http://en.wikipedia.org/wiki/ISO_8601).
     */
    @NotNull public Builder duration(@NotNull LoanTerm loanTerm) {
      putValue("duration", loanTerm);
      return this;
    }
    /**
     * The 10th percentile value.
     */
    @NotNull public Builder percentile10(@NotNull Integer integer) {
      putValue("percentile10", integer);
      return this;
    }
    /**
     * The 10th percentile value.
     */
    @NotNull public Builder percentile10(@NotNull Long percentile10) {
      putValue("percentile10", percentile10);
      return this;
    }
    /**
     * The 10th percentile value.
     */
    @NotNull public Builder percentile10(@NotNull Float percentile10) {
      putValue("percentile10", percentile10);
      return this;
    }
    /**
     * The 10th percentile value.
     */
    @NotNull public Builder percentile10(@NotNull Double percentile10) {
      putValue("percentile10", percentile10);
      return this;
    }
    /**
     * The 10th percentile value.
     */
    @NotNull public Builder percentile10(@NotNull String percentile10) {
      putValue("percentile10", percentile10);
      return this;
    }
    /**
     * The 25th percentile value.
     */
    @NotNull public Builder percentile25(@NotNull Integer integer) {
      putValue("percentile25", integer);
      return this;
    }
    /**
     * The 25th percentile value.
     */
    @NotNull public Builder percentile25(@NotNull Long percentile25) {
      putValue("percentile25", percentile25);
      return this;
    }
    /**
     * The 25th percentile value.
     */
    @NotNull public Builder percentile25(@NotNull Float percentile25) {
      putValue("percentile25", percentile25);
      return this;
    }
    /**
     * The 25th percentile value.
     */
    @NotNull public Builder percentile25(@NotNull Double percentile25) {
      putValue("percentile25", percentile25);
      return this;
    }
    /**
     * The 25th percentile value.
     */
    @NotNull public Builder percentile25(@NotNull String percentile25) {
      putValue("percentile25", percentile25);
      return this;
    }
    /**
     * The median value.
     */
    @NotNull public Builder median(@NotNull Integer integer) {
      putValue("median", integer);
      return this;
    }
    /**
     * The median value.
     */
    @NotNull public Builder median(@NotNull Long median) {
      putValue("median", median);
      return this;
    }
    /**
     * The median value.
     */
    @NotNull public Builder median(@NotNull Float median) {
      putValue("median", median);
      return this;
    }
    /**
     * The median value.
     */
    @NotNull public Builder median(@NotNull Double median) {
      putValue("median", median);
      return this;
    }
    /**
     * The median value.
     */
    @NotNull public Builder median(@NotNull String median) {
      putValue("median", median);
      return this;
    }
    /**
     * The 75th percentile value.
     */
    @NotNull public Builder percentile75(@NotNull Integer integer) {
      putValue("percentile75", integer);
      return this;
    }
    /**
     * The 75th percentile value.
     */
    @NotNull public Builder percentile75(@NotNull Long percentile75) {
      putValue("percentile75", percentile75);
      return this;
    }
    /**
     * The 75th percentile value.
     */
    @NotNull public Builder percentile75(@NotNull Float percentile75) {
      putValue("percentile75", percentile75);
      return this;
    }
    /**
     * The 75th percentile value.
     */
    @NotNull public Builder percentile75(@NotNull Double percentile75) {
      putValue("percentile75", percentile75);
      return this;
    }
    /**
     * The 75th percentile value.
     */
    @NotNull public Builder percentile75(@NotNull String percentile75) {
      putValue("percentile75", percentile75);
      return this;
    }
    /**
     * The 90th percentile value.
     */
    @NotNull public Builder percentile90(@NotNull Integer integer) {
      putValue("percentile90", integer);
      return this;
    }
    /**
     * The 90th percentile value.
     */
    @NotNull public Builder percentile90(@NotNull Long percentile90) {
      putValue("percentile90", percentile90);
      return this;
    }
    /**
     * The 90th percentile value.
     */
    @NotNull public Builder percentile90(@NotNull Float percentile90) {
      putValue("percentile90", percentile90);
      return this;
    }
    /**
     * The 90th percentile value.
     */
    @NotNull public Builder percentile90(@NotNull Double percentile90) {
      putValue("percentile90", percentile90);
      return this;
    }
    /**
     * The 90th percentile value.
     */
    @NotNull public Builder percentile90(@NotNull String percentile90) {
      putValue("percentile90", percentile90);
      return this;
    }
    @NotNull public Builder additionalType(@NotNull AdditionalType additionalType) {
      putValue("additionalType", additionalType);
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
     * A description of the item.
     */
    @NotNull public Builder description(@NotNull DisambiguatingDescription disambiguatingDescription) {
      putValue("description", disambiguatingDescription);
      return this;
    }
    @NotNull public Builder disambiguatingDescription(@NotNull DisambiguatingDescription disambiguatingDescription) {
      putValue("disambiguatingDescription", disambiguatingDescription);
      return this;
    }
    /**
     * An image of the item. This can be a [[URL]] or a fully described [[ImageObject]].
     */
    @NotNull public Builder image(@NotNull Logo logo) {
      putValue("image", logo);
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
    /**
     * URL of a reference Web page that unambiguously indicates the item's identity. E.g. the URL of the item's Wikipedia page, Wikidata entry, or official website.
     */
    @NotNull public Builder sameAs(@NotNull String sameAs) {
      putValue("sameAs", sameAs);
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
     * The identifier property represents any kind of identifier for any kind of [[Thing]], such as ISBNs, GTIN codes, UUIDs etc. Schema.org provides dedicated properties for representing many of these, either as textual strings or as URL (URI) links. See [background notes](/docs/datamodel.html#identifierBg) for more details.
     *         
     */
    @NotNull public Builder identifier(@NotNull Isbn isbn) {
      putValue("identifier", isbn);
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
    @NotNull public Builder id(@NotNull String id) {
      myData.put("id", id);
      return this;
    }
    public Builder id(long id) {
      return id(Long.toString(id));
    }
    @Override protected void fromMap(String key, Object value) {
      if ("duration".equals(key) && value instanceof LoanTerm) { duration((LoanTerm)value); return; }
      if ("durations".equals(key) && value instanceof LoanTerm) { duration((LoanTerm)value); return; }
      if ("percentile10".equals(key) && value instanceof Integer) { percentile10((Integer)value); return; }
      if ("percentile10s".equals(key) && value instanceof Integer) { percentile10((Integer)value); return; }
      if ("percentile10".equals(key) && value instanceof Long) { percentile10((Long)value); return; }
      if ("percentile10s".equals(key) && value instanceof Long) { percentile10((Long)value); return; }
      if ("percentile10".equals(key) && value instanceof Float) { percentile10((Float)value); return; }
      if ("percentile10s".equals(key) && value instanceof Float) { percentile10((Float)value); return; }
      if ("percentile10".equals(key) && value instanceof Double) { percentile10((Double)value); return; }
      if ("percentile10s".equals(key) && value instanceof Double) { percentile10((Double)value); return; }
      if ("percentile10".equals(key) && value instanceof String) { percentile10((String)value); return; }
      if ("percentile10s".equals(key) && value instanceof String) { percentile10((String)value); return; }
      if ("percentile25".equals(key) && value instanceof Integer) { percentile25((Integer)value); return; }
      if ("percentile25s".equals(key) && value instanceof Integer) { percentile25((Integer)value); return; }
      if ("percentile25".equals(key) && value instanceof Long) { percentile25((Long)value); return; }
      if ("percentile25s".equals(key) && value instanceof Long) { percentile25((Long)value); return; }
      if ("percentile25".equals(key) && value instanceof Float) { percentile25((Float)value); return; }
      if ("percentile25s".equals(key) && value instanceof Float) { percentile25((Float)value); return; }
      if ("percentile25".equals(key) && value instanceof Double) { percentile25((Double)value); return; }
      if ("percentile25s".equals(key) && value instanceof Double) { percentile25((Double)value); return; }
      if ("percentile25".equals(key) && value instanceof String) { percentile25((String)value); return; }
      if ("percentile25s".equals(key) && value instanceof String) { percentile25((String)value); return; }
      if ("median".equals(key) && value instanceof Integer) { median((Integer)value); return; }
      if ("medians".equals(key) && value instanceof Integer) { median((Integer)value); return; }
      if ("median".equals(key) && value instanceof Long) { median((Long)value); return; }
      if ("medians".equals(key) && value instanceof Long) { median((Long)value); return; }
      if ("median".equals(key) && value instanceof Float) { median((Float)value); return; }
      if ("medians".equals(key) && value instanceof Float) { median((Float)value); return; }
      if ("median".equals(key) && value instanceof Double) { median((Double)value); return; }
      if ("medians".equals(key) && value instanceof Double) { median((Double)value); return; }
      if ("median".equals(key) && value instanceof String) { median((String)value); return; }
      if ("medians".equals(key) && value instanceof String) { median((String)value); return; }
      if ("percentile75".equals(key) && value instanceof Integer) { percentile75((Integer)value); return; }
      if ("percentile75s".equals(key) && value instanceof Integer) { percentile75((Integer)value); return; }
      if ("percentile75".equals(key) && value instanceof Long) { percentile75((Long)value); return; }
      if ("percentile75s".equals(key) && value instanceof Long) { percentile75((Long)value); return; }
      if ("percentile75".equals(key) && value instanceof Float) { percentile75((Float)value); return; }
      if ("percentile75s".equals(key) && value instanceof Float) { percentile75((Float)value); return; }
      if ("percentile75".equals(key) && value instanceof Double) { percentile75((Double)value); return; }
      if ("percentile75s".equals(key) && value instanceof Double) { percentile75((Double)value); return; }
      if ("percentile75".equals(key) && value instanceof String) { percentile75((String)value); return; }
      if ("percentile75s".equals(key) && value instanceof String) { percentile75((String)value); return; }
      if ("percentile90".equals(key) && value instanceof Integer) { percentile90((Integer)value); return; }
      if ("percentile90s".equals(key) && value instanceof Integer) { percentile90((Integer)value); return; }
      if ("percentile90".equals(key) && value instanceof Long) { percentile90((Long)value); return; }
      if ("percentile90s".equals(key) && value instanceof Long) { percentile90((Long)value); return; }
      if ("percentile90".equals(key) && value instanceof Float) { percentile90((Float)value); return; }
      if ("percentile90s".equals(key) && value instanceof Float) { percentile90((Float)value); return; }
      if ("percentile90".equals(key) && value instanceof Double) { percentile90((Double)value); return; }
      if ("percentile90s".equals(key) && value instanceof Double) { percentile90((Double)value); return; }
      if ("percentile90".equals(key) && value instanceof String) { percentile90((String)value); return; }
      if ("percentile90s".equals(key) && value instanceof String) { percentile90((String)value); return; }
      super.fromMap(key, value);
    }
  }
  
}
