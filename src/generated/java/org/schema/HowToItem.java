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
 * An item used as either a tool or supply when performing the instructions for how to to achieve a result.
 */
public class HowToItem extends ListItem {
  /**
   * The required quantity of the item(s).
   */
  @JsonIgnore public Integer getRequiredQuantityInteger() {
    return (Integer) getValue("requiredQuantity");
  }
  /**
   * The required quantity of the item(s).
   */
  @JsonIgnore public java.util.Collection<Integer> getRequiredQuantityIntegers() {
    final java.lang.Object current = myData.get("requiredQuantity");
    if (current == null) return Collections.emptyList();
    if (current instanceof java.util.Collection) {
      return (java.util.Collection<Integer>) current;
    }
    return Arrays.asList((Integer) current);
  }
  /**
   * The required quantity of the item(s).
   */
  @JsonIgnore public Long getRequiredQuantityLong() {
    return (Long) getValue("requiredQuantity");
  }
  /**
   * The required quantity of the item(s).
   */
  @JsonIgnore public java.util.Collection<Long> getRequiredQuantityLongs() {
    final java.lang.Object current = myData.get("requiredQuantity");
    if (current == null) return Collections.emptyList();
    if (current instanceof java.util.Collection) {
      return (java.util.Collection<Long>) current;
    }
    return Arrays.asList((Long) current);
  }
  /**
   * The required quantity of the item(s).
   */
  @JsonIgnore public Float getRequiredQuantityFloat() {
    return (Float) getValue("requiredQuantity");
  }
  /**
   * The required quantity of the item(s).
   */
  @JsonIgnore public java.util.Collection<Float> getRequiredQuantityFloats() {
    final java.lang.Object current = myData.get("requiredQuantity");
    if (current == null) return Collections.emptyList();
    if (current instanceof java.util.Collection) {
      return (java.util.Collection<Float>) current;
    }
    return Arrays.asList((Float) current);
  }
  /**
   * The required quantity of the item(s).
   */
  @JsonIgnore public Double getRequiredQuantityDouble() {
    return (Double) getValue("requiredQuantity");
  }
  /**
   * The required quantity of the item(s).
   */
  @JsonIgnore public java.util.Collection<Double> getRequiredQuantityDoubles() {
    final java.lang.Object current = myData.get("requiredQuantity");
    if (current == null) return Collections.emptyList();
    if (current instanceof java.util.Collection) {
      return (java.util.Collection<Double>) current;
    }
    return Arrays.asList((Double) current);
  }
  /**
   * The required quantity of the item(s).
   */
  @JsonIgnore public String getRequiredQuantityString() {
    return (String) getValue("requiredQuantity");
  }
  /**
   * The required quantity of the item(s).
   */
  @JsonIgnore public java.util.Collection<String> getRequiredQuantityStrings() {
    final java.lang.Object current = myData.get("requiredQuantity");
    if (current == null) return Collections.emptyList();
    if (current instanceof java.util.Collection) {
      return (java.util.Collection<String>) current;
    }
    return Arrays.asList((String) current);
  }
  protected HowToItem(java.util.Map<String,java.lang.Object> data) {
    super(data);
  }
  
  /**
   * Builder for {@link HowToItem}
   */
  public static class Builder extends ListItem.Builder {
    public Builder(@NotNull HashMap<String,java.lang.Object> data) {
      super(data);
    }
    @NotNull public HowToItem build() {
      return new HowToItem(myData);
    }
    /**
     * The required quantity of the item(s).
     */
    @NotNull public Builder requiredQuantity(@NotNull Integer integer) {
      putValue("requiredQuantity", integer);
      return this;
    }
    /**
     * The required quantity of the item(s).
     */
    @NotNull public Builder requiredQuantity(@NotNull Long requiredQuantity) {
      putValue("requiredQuantity", requiredQuantity);
      return this;
    }
    /**
     * The required quantity of the item(s).
     */
    @NotNull public Builder requiredQuantity(@NotNull Float requiredQuantity) {
      putValue("requiredQuantity", requiredQuantity);
      return this;
    }
    /**
     * The required quantity of the item(s).
     */
    @NotNull public Builder requiredQuantity(@NotNull Double requiredQuantity) {
      putValue("requiredQuantity", requiredQuantity);
      return this;
    }
    /**
     * The required quantity of the item(s).
     */
    @NotNull public Builder requiredQuantity(@NotNull String requiredQuantity) {
      putValue("requiredQuantity", requiredQuantity);
      return this;
    }
    /**
     * The position of an item in a series or sequence of items.
     */
    @NotNull public Builder position(@NotNull Integer integer) {
      putValue("position", integer);
      return this;
    }
    /**
     * The position of an item in a series or sequence of items.
     */
    @NotNull public Builder position(@NotNull String position) {
      putValue("position", position);
      return this;
    }
    /**
     * A link to the ListItem that preceeds the current one.
     */
    @NotNull public Builder previousItem(@NotNull ListItem listItem) {
      putValue("previousItem", listItem);
      return this;
    }
    /**
     * A link to the ListItem that preceeds the current one.
     */
    @NotNull public Builder previousItem(@NotNull ListItem.Builder listItem) {
      putValue("previousItem", listItem.build());
      return this;
    }
    /**
     * An entity represented by an entry in a list or data feed (e.g. an 'artist' in a list of 'artists')&rsquo;.
     */
    @NotNull public Builder item(@NotNull Thing thing) {
      putValue("item", thing);
      return this;
    }
    /**
     * An entity represented by an entry in a list or data feed (e.g. an 'artist' in a list of 'artists')&rsquo;.
     */
    @NotNull public Builder item(@NotNull Thing.Builder thing) {
      putValue("item", thing.build());
      return this;
    }
    /**
     * A link to the ListItem that follows the current one.
     */
    @NotNull public Builder nextItem(@NotNull ListItem listItem) {
      putValue("nextItem", listItem);
      return this;
    }
    /**
     * A link to the ListItem that follows the current one.
     */
    @NotNull public Builder nextItem(@NotNull ListItem.Builder listItem) {
      putValue("nextItem", listItem.build());
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
    @NotNull public Builder disambiguatingDescription(@NotNull String disambiguatingDescription) {
      putValue("disambiguatingDescription", disambiguatingDescription);
      return this;
    }
    /**
     * A description of the item.
     */
    @NotNull public Builder description(@NotNull String description) {
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
      if ("requiredQuantity".equals(key) && value instanceof Integer) { this.requiredQuantity((Integer)value); return; }
      if ("requiredQuantitys".equals(key) && value instanceof Integer) { this.requiredQuantity((Integer)value); return; }
      if ("requiredQuantity".equals(key) && value instanceof Long) { this.requiredQuantity((Long)value); return; }
      if ("requiredQuantitys".equals(key) && value instanceof Long) { this.requiredQuantity((Long)value); return; }
      if ("requiredQuantity".equals(key) && value instanceof Float) { this.requiredQuantity((Float)value); return; }
      if ("requiredQuantitys".equals(key) && value instanceof Float) { this.requiredQuantity((Float)value); return; }
      if ("requiredQuantity".equals(key) && value instanceof Double) { this.requiredQuantity((Double)value); return; }
      if ("requiredQuantitys".equals(key) && value instanceof Double) { this.requiredQuantity((Double)value); return; }
      if ("requiredQuantity".equals(key) && value instanceof String) { this.requiredQuantity((String)value); return; }
      if ("requiredQuantitys".equals(key) && value instanceof String) { this.requiredQuantity((String)value); return; }
      super.fromMap(key, value);
    }
  }
  
}
