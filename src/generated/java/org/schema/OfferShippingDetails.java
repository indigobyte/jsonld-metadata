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
 * OfferShippingDetails represents information about shipping destinations.
 * 
 * Multiple of these entities can be used to represent different shipping rates for different destinations:
 * 
 * One entity for Alaska/Hawaii. A different one for continental US.A different one for all France.
 * 
 * Multiple of these entities can be used to represent different shipping costs and delivery times.
 * 
 * Two entities that are identical but differ in rate and time:
 * 
 * e.g. Cheaper and slower: $5 in 5-7days
 * or Fast and expensive: $15 in 1-2 days.
 */
public class OfferShippingDetails extends StructuredValue {
  /**
   * Label to match an [[OfferShippingDetails]] with a [[ShippingRateSettings]] (within the context of a [[shippingSettingsLink]] cross-reference).
   */
  @JsonIgnore public String getShippingLabel() {
    return (String) getValue("shippingLabel");
  }
  /**
   * Label to match an [[OfferShippingDetails]] with a [[ShippingRateSettings]] (within the context of a [[shippingSettingsLink]] cross-reference).
   */
  @JsonIgnore public java.util.Collection<String> getShippingLabels() {
    final java.lang.Object current = myData.get("shippingLabel");
    if (current == null) return Collections.emptyList();
    if (current instanceof java.util.Collection) {
      return (java.util.Collection<String>) current;
    }
    return Arrays.asList((String) current);
  }
  /**
   * The shipping rate is the cost of shipping to the specified destination. Typically, the maxValue and currency values (of the [[MonetaryAmount]]) are most appropriate.
   */
  @JsonIgnore public MonetaryAmount getShippingRate() {
    return (MonetaryAmount) getValue("shippingRate");
  }
  /**
   * The shipping rate is the cost of shipping to the specified destination. Typically, the maxValue and currency values (of the [[MonetaryAmount]]) are most appropriate.
   */
  @JsonIgnore public java.util.Collection<MonetaryAmount> getShippingRates() {
    final java.lang.Object current = myData.get("shippingRate");
    if (current == null) return Collections.emptyList();
    if (current instanceof java.util.Collection) {
      return (java.util.Collection<MonetaryAmount>) current;
    }
    return Arrays.asList((MonetaryAmount) current);
  }
  /**
   * The total delay between the receipt of the order and the goods reaching the final customer.
   */
  @JsonIgnore public ShippingDeliveryTime getDeliveryTime() {
    return (ShippingDeliveryTime) getValue("deliveryTime");
  }
  /**
   * The total delay between the receipt of the order and the goods reaching the final customer.
   */
  @JsonIgnore public java.util.Collection<ShippingDeliveryTime> getDeliveryTimes() {
    final java.lang.Object current = myData.get("deliveryTime");
    if (current == null) return Collections.emptyList();
    if (current instanceof java.util.Collection) {
      return (java.util.Collection<ShippingDeliveryTime>) current;
    }
    return Arrays.asList((ShippingDeliveryTime) current);
  }
  /**
   * Label to match an [[OfferShippingDetails]] with a [[DeliveryTimeSettings]] (within the context of a [[shippingSettingsLink]] cross-reference).
   */
  @JsonIgnore public String getTransitTimeLabel() {
    return (String) getValue("transitTimeLabel");
  }
  /**
   * Label to match an [[OfferShippingDetails]] with a [[DeliveryTimeSettings]] (within the context of a [[shippingSettingsLink]] cross-reference).
   */
  @JsonIgnore public java.util.Collection<String> getTransitTimeLabels() {
    final java.lang.Object current = myData.get("transitTimeLabel");
    if (current == null) return Collections.emptyList();
    if (current instanceof java.util.Collection) {
      return (java.util.Collection<String>) current;
    }
    return Arrays.asList((String) current);
  }
  /**
   * indicates (possibly multiple) shipping destinations. These can be defined in several ways e.g. postalCode ranges.
   */
  @JsonIgnore public DefinedRegion getShippingDestination() {
    return (DefinedRegion) getValue("shippingDestination");
  }
  /**
   * indicates (possibly multiple) shipping destinations. These can be defined in several ways e.g. postalCode ranges.
   */
  @JsonIgnore public java.util.Collection<DefinedRegion> getShippingDestinations() {
    final java.lang.Object current = myData.get("shippingDestination");
    if (current == null) return Collections.emptyList();
    if (current instanceof java.util.Collection) {
      return (java.util.Collection<DefinedRegion>) current;
    }
    return Arrays.asList((DefinedRegion) current);
  }
  /**
   * Indicates when shipping to a particular [[shippingDestination]] is not available.
   */
  @JsonIgnore public Boolean getDoesNotShip() {
    return (Boolean) getValue("doesNotShip");
  }
  /**
   * Indicates when shipping to a particular [[shippingDestination]] is not available.
   */
  @JsonIgnore public java.util.Collection<Boolean> getDoesNotShips() {
    final java.lang.Object current = myData.get("doesNotShip");
    if (current == null) return Collections.emptyList();
    if (current instanceof java.util.Collection) {
      return (java.util.Collection<Boolean>) current;
    }
    return Arrays.asList((Boolean) current);
  }
  /**
   * Link to a page containing [[ShippingRateSettings]] and [[DeliveryTimeSettings]] details.
   */
  @JsonIgnore public String getShippingSettingsLink() {
    return (String) getValue("shippingSettingsLink");
  }
  /**
   * Link to a page containing [[ShippingRateSettings]] and [[DeliveryTimeSettings]] details.
   */
  @JsonIgnore public java.util.Collection<String> getShippingSettingsLinks() {
    final java.lang.Object current = myData.get("shippingSettingsLink");
    if (current == null) return Collections.emptyList();
    if (current instanceof java.util.Collection) {
      return (java.util.Collection<String>) current;
    }
    return Arrays.asList((String) current);
  }
  protected OfferShippingDetails(java.util.Map<String,java.lang.Object> data) {
    super(data);
  }
  
  /**
   * Builder for {@link OfferShippingDetails}
   */
  public static class Builder extends StructuredValue.Builder {
    public Builder(@NotNull HashMap<String,java.lang.Object> data) {
      super(data);
    }
    @NotNull public OfferShippingDetails build() {
      return new OfferShippingDetails(myData);
    }
    /**
     * Label to match an [[OfferShippingDetails]] with a [[ShippingRateSettings]] (within the context of a [[shippingSettingsLink]] cross-reference).
     */
    @NotNull public Builder shippingLabel(@NotNull String shippingLabel) {
      putValue("shippingLabel", shippingLabel);
      return this;
    }
    /**
     * The shipping rate is the cost of shipping to the specified destination. Typically, the maxValue and currency values (of the [[MonetaryAmount]]) are most appropriate.
     */
    @NotNull public Builder shippingRate(@NotNull MonetaryAmount monetaryAmount) {
      putValue("shippingRate", monetaryAmount);
      return this;
    }
    /**
     * The shipping rate is the cost of shipping to the specified destination. Typically, the maxValue and currency values (of the [[MonetaryAmount]]) are most appropriate.
     */
    @NotNull public Builder shippingRate(@NotNull MonetaryAmount.Builder monetaryAmount) {
      putValue("shippingRate", monetaryAmount.build());
      return this;
    }
    /**
     * The total delay between the receipt of the order and the goods reaching the final customer.
     */
    @NotNull public Builder deliveryTime(@NotNull ShippingDeliveryTime shippingDeliveryTime) {
      putValue("deliveryTime", shippingDeliveryTime);
      return this;
    }
    /**
     * The total delay between the receipt of the order and the goods reaching the final customer.
     */
    @NotNull public Builder deliveryTime(@NotNull ShippingDeliveryTime.Builder shippingDeliveryTime) {
      putValue("deliveryTime", shippingDeliveryTime.build());
      return this;
    }
    /**
     * Label to match an [[OfferShippingDetails]] with a [[DeliveryTimeSettings]] (within the context of a [[shippingSettingsLink]] cross-reference).
     */
    @NotNull public Builder transitTimeLabel(@NotNull String transitTimeLabel) {
      putValue("transitTimeLabel", transitTimeLabel);
      return this;
    }
    /**
     * indicates (possibly multiple) shipping destinations. These can be defined in several ways e.g. postalCode ranges.
     */
    @NotNull public Builder shippingDestination(@NotNull DefinedRegion definedRegion) {
      putValue("shippingDestination", definedRegion);
      return this;
    }
    /**
     * indicates (possibly multiple) shipping destinations. These can be defined in several ways e.g. postalCode ranges.
     */
    @NotNull public Builder shippingDestination(@NotNull DefinedRegion.Builder definedRegion) {
      putValue("shippingDestination", definedRegion.build());
      return this;
    }
    /**
     * Indicates when shipping to a particular [[shippingDestination]] is not available.
     */
    @NotNull public Builder doesNotShip(@NotNull Boolean doesNotShip) {
      putValue("doesNotShip", doesNotShip);
      return this;
    }
    /**
     * Link to a page containing [[ShippingRateSettings]] and [[DeliveryTimeSettings]] details.
     */
    @NotNull public Builder shippingSettingsLink(@NotNull String shippingSettingsLink) {
      putValue("shippingSettingsLink", shippingSettingsLink);
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
      if ("shippingLabel".equals(key) && value instanceof String) { this.shippingLabel((String)value); return; }
      if ("shippingLabels".equals(key) && value instanceof String) { this.shippingLabel((String)value); return; }
      if ("shippingRate".equals(key) && value instanceof MonetaryAmount) { this.shippingRate((MonetaryAmount)value); return; }
      if ("shippingRates".equals(key) && value instanceof MonetaryAmount) { this.shippingRate((MonetaryAmount)value); return; }
      if ("deliveryTime".equals(key) && value instanceof ShippingDeliveryTime) { this.deliveryTime((ShippingDeliveryTime)value); return; }
      if ("deliveryTimes".equals(key) && value instanceof ShippingDeliveryTime) { this.deliveryTime((ShippingDeliveryTime)value); return; }
      if ("transitTimeLabel".equals(key) && value instanceof String) { this.transitTimeLabel((String)value); return; }
      if ("transitTimeLabels".equals(key) && value instanceof String) { this.transitTimeLabel((String)value); return; }
      if ("shippingDestination".equals(key) && value instanceof DefinedRegion) { this.shippingDestination((DefinedRegion)value); return; }
      if ("shippingDestinations".equals(key) && value instanceof DefinedRegion) { this.shippingDestination((DefinedRegion)value); return; }
      if ("doesNotShip".equals(key) && value instanceof Boolean) { this.doesNotShip((Boolean)value); return; }
      if ("doesNotShips".equals(key) && value instanceof Boolean) { this.doesNotShip((Boolean)value); return; }
      if ("shippingSettingsLink".equals(key) && value instanceof String) { this.shippingSettingsLink((String)value); return; }
      if ("shippingSettingsLinks".equals(key) && value instanceof String) { this.shippingSettingsLink((String)value); return; }
      super.fromMap(key, value);
    }
  }
  
}
