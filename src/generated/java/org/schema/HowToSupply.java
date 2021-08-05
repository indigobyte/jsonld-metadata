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
 * A supply consumed when performing the instructions for how to achieve a result.
 */
public class HowToSupply extends HowToItem implements Supply {
  /**
   * The estimated cost of the supply or supplies consumed when performing instructions.
   */
  @JsonIgnore public MonetaryAmount getEstimatedCostMonetaryAmount() {
    return (MonetaryAmount) getValue("estimatedCost");
  }
  /**
   * The estimated cost of the supply or supplies consumed when performing instructions.
   */
  @JsonIgnore public java.util.Collection<MonetaryAmount> getEstimatedCostMonetaryAmounts() {
    final Object current = myData.get("estimatedCost");
    if (current == null) return Collections.emptyList();
    if (current instanceof java.util.Collection) {
      return (java.util.Collection<MonetaryAmount>) current;
    }
    return Arrays.asList((MonetaryAmount) current);
  }
  /**
   * The estimated cost of the supply or supplies consumed when performing instructions.
   */
  @JsonIgnore public String getEstimatedCostString() {
    return (String) getValue("estimatedCost");
  }
  /**
   * The estimated cost of the supply or supplies consumed when performing instructions.
   */
  @JsonIgnore public java.util.Collection<String> getEstimatedCostStrings() {
    final Object current = myData.get("estimatedCost");
    if (current == null) return Collections.emptyList();
    if (current instanceof java.util.Collection) {
      return (java.util.Collection<String>) current;
    }
    return Arrays.asList((String) current);
  }
  protected HowToSupply(java.util.Map<String,Object> data) {
    super(data);
  }
  
  /**
   * Builder for {@link HowToSupply}
   */
  public static class Builder extends HowToItem.Builder {
    public Builder(@NotNull HashMap<String,Object> data) {
      super(data);
    }
    @NotNull public HowToSupply build() {
      return new HowToSupply(myData);
    }
    /**
     * The estimated cost of the supply or supplies consumed when performing instructions.
     */
    @NotNull public Builder estimatedCost(@NotNull MonetaryAmount monetaryAmount) {
      putValue("estimatedCost", monetaryAmount);
      return this;
    }
    /**
     * The estimated cost of the supply or supplies consumed when performing instructions.
     */
    @NotNull public Builder estimatedCost(@NotNull MonetaryAmount.Builder monetaryAmount) {
      putValue("estimatedCost", monetaryAmount.build());
      return this;
    }
    /**
     * The estimated cost of the supply or supplies consumed when performing instructions.
     */
    @NotNull public Builder estimatedCost(@NotNull String estimatedCost) {
      putValue("estimatedCost", estimatedCost);
      return this;
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
      if ("estimatedCost".equals(key) && value instanceof MonetaryAmount) { this.estimatedCost((MonetaryAmount)value); return; }
      if ("estimatedCosts".equals(key) && value instanceof MonetaryAmount) { this.estimatedCost((MonetaryAmount)value); return; }
      if ("estimatedCost".equals(key) && value instanceof String) { this.estimatedCost((String)value); return; }
      if ("estimatedCosts".equals(key) && value instanceof String) { this.estimatedCost((String)value); return; }
      super.fromMap(key, value);
    }
  }
  
}
