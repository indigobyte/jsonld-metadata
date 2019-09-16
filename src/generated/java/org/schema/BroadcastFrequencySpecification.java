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
 * The frequency in MHz and the modulation used for a particular BroadcastService.Source: https://github.com/schemaorg/schemaorg/issues/1004
 */
public class BroadcastFrequencySpecification extends Intangible {
  /**
   * The frequency in MHz for a particular broadcast.
   */
  @JsonIgnore public Integer getBroadcastFrequencyValueInteger() {
    return (Integer) getValue("broadcastFrequencyValue");
  }
  /**
   * The frequency in MHz for a particular broadcast.
   */
  @JsonIgnore public Collection<Integer> getBroadcastFrequencyValueIntegers() {
    final Object current = myData.get("broadcastFrequencyValue");
    if (current == null) return Collections.emptyList();
    if (current instanceof Collection) {
      return (Collection<Integer>) current;
    }
    return Arrays.asList((Integer) current);
  }
  /**
   * The frequency in MHz for a particular broadcast.
   */
  @JsonIgnore public Long getBroadcastFrequencyValueLong() {
    return (Long) getValue("broadcastFrequencyValue");
  }
  /**
   * The frequency in MHz for a particular broadcast.
   */
  @JsonIgnore public Collection<Long> getBroadcastFrequencyValueLongs() {
    final Object current = myData.get("broadcastFrequencyValue");
    if (current == null) return Collections.emptyList();
    if (current instanceof Collection) {
      return (Collection<Long>) current;
    }
    return Arrays.asList((Long) current);
  }
  /**
   * The frequency in MHz for a particular broadcast.
   */
  @JsonIgnore public Float getBroadcastFrequencyValueFloat() {
    return (Float) getValue("broadcastFrequencyValue");
  }
  /**
   * The frequency in MHz for a particular broadcast.
   */
  @JsonIgnore public Collection<Float> getBroadcastFrequencyValueFloats() {
    final Object current = myData.get("broadcastFrequencyValue");
    if (current == null) return Collections.emptyList();
    if (current instanceof Collection) {
      return (Collection<Float>) current;
    }
    return Arrays.asList((Float) current);
  }
  /**
   * The frequency in MHz for a particular broadcast.
   */
  @JsonIgnore public Double getBroadcastFrequencyValueDouble() {
    return (Double) getValue("broadcastFrequencyValue");
  }
  /**
   * The frequency in MHz for a particular broadcast.
   */
  @JsonIgnore public Collection<Double> getBroadcastFrequencyValueDoubles() {
    final Object current = myData.get("broadcastFrequencyValue");
    if (current == null) return Collections.emptyList();
    if (current instanceof Collection) {
      return (Collection<Double>) current;
    }
    return Arrays.asList((Double) current);
  }
  /**
   * The frequency in MHz for a particular broadcast.
   */
  @JsonIgnore public String getBroadcastFrequencyValueString() {
    return (String) getValue("broadcastFrequencyValue");
  }
  /**
   * The frequency in MHz for a particular broadcast.
   */
  @JsonIgnore public Collection<String> getBroadcastFrequencyValueStrings() {
    final Object current = myData.get("broadcastFrequencyValue");
    if (current == null) return Collections.emptyList();
    if (current instanceof Collection) {
      return (Collection<String>) current;
    }
    return Arrays.asList((String) current);
  }
  protected BroadcastFrequencySpecification(java.util.Map<String,Object> data) {
    super(data);
  }
  
  /**
   * Builder for {@link BroadcastFrequencySpecification}
   */
  public static class Builder extends Intangible.Builder {
    public Builder(@NotNull HashMap<String,Object> data) {
      super(data);
    }
    @NotNull public BroadcastFrequencySpecification build() {
      return new BroadcastFrequencySpecification(myData);
    }
    /**
     * The frequency in MHz for a particular broadcast.
     */
    @NotNull public Builder broadcastFrequencyValue(@NotNull Integer integer) {
      putValue("broadcastFrequencyValue", integer);
      return this;
    }
    /**
     * The frequency in MHz for a particular broadcast.
     */
    @NotNull public Builder broadcastFrequencyValue(@NotNull Long broadcastFrequencyValue) {
      putValue("broadcastFrequencyValue", broadcastFrequencyValue);
      return this;
    }
    /**
     * The frequency in MHz for a particular broadcast.
     */
    @NotNull public Builder broadcastFrequencyValue(@NotNull Float broadcastFrequencyValue) {
      putValue("broadcastFrequencyValue", broadcastFrequencyValue);
      return this;
    }
    /**
     * The frequency in MHz for a particular broadcast.
     */
    @NotNull public Builder broadcastFrequencyValue(@NotNull Double broadcastFrequencyValue) {
      putValue("broadcastFrequencyValue", broadcastFrequencyValue);
      return this;
    }
    /**
     * The frequency in MHz for a particular broadcast.
     */
    @NotNull public Builder broadcastFrequencyValue(@NotNull String broadcastFrequencyValue) {
      putValue("broadcastFrequencyValue", broadcastFrequencyValue);
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
      if ("broadcastFrequencyValue".equals(key) && value instanceof Integer) { broadcastFrequencyValue((Integer)value); return; }
      if ("broadcastFrequencyValues".equals(key) && value instanceof Integer) { broadcastFrequencyValue((Integer)value); return; }
      if ("broadcastFrequencyValue".equals(key) && value instanceof Long) { broadcastFrequencyValue((Long)value); return; }
      if ("broadcastFrequencyValues".equals(key) && value instanceof Long) { broadcastFrequencyValue((Long)value); return; }
      if ("broadcastFrequencyValue".equals(key) && value instanceof Float) { broadcastFrequencyValue((Float)value); return; }
      if ("broadcastFrequencyValues".equals(key) && value instanceof Float) { broadcastFrequencyValue((Float)value); return; }
      if ("broadcastFrequencyValue".equals(key) && value instanceof Double) { broadcastFrequencyValue((Double)value); return; }
      if ("broadcastFrequencyValues".equals(key) && value instanceof Double) { broadcastFrequencyValue((Double)value); return; }
      if ("broadcastFrequencyValue".equals(key) && value instanceof String) { broadcastFrequencyValue((String)value); return; }
      if ("broadcastFrequencyValues".equals(key) && value instanceof String) { broadcastFrequencyValue((String)value); return; }
      super.fromMap(key, value);
    }
  }
  
}
