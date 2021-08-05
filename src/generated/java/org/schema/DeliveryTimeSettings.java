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
 * A DeliveryTimeSettings represents re-usable pieces of shipping information, relating to timing. It is designed for publication on an URL that may be referenced via the [[shippingSettingsLink]] property of a [[OfferShippingDetails]]. Several occurrences can be published, distinguished (and identified/referenced) by their different values for [[transitTimeLabel]].
 */
public class DeliveryTimeSettings extends StructuredValue {
  /**
   * This can be marked 'true' to indicate that some published [[DeliveryTimeSettings]] or [[ShippingRateSettings]] are intended to apply to all [[OfferShippingDetails]] published by the same merchant, when referenced by a [[shippingSettingsLink]] in those settings. It is not meaningful to use a 'true' value for this property alongside a transitTimeLabel (for [[DeliveryTimeSettings]]) or shippingLabel (for [[ShippingRateSettings]]), since this property is for use with unlabelled settings.
   */
  @JsonIgnore public Boolean getIsUnlabelledFallback() {
    return (Boolean) getValue("isUnlabelledFallback");
  }
  /**
   * This can be marked 'true' to indicate that some published [[DeliveryTimeSettings]] or [[ShippingRateSettings]] are intended to apply to all [[OfferShippingDetails]] published by the same merchant, when referenced by a [[shippingSettingsLink]] in those settings. It is not meaningful to use a 'true' value for this property alongside a transitTimeLabel (for [[DeliveryTimeSettings]]) or shippingLabel (for [[ShippingRateSettings]]), since this property is for use with unlabelled settings.
   */
  @JsonIgnore public Collection<Boolean> getIsUnlabelledFallbacks() {
    final Object current = myData.get("isUnlabelledFallback");
    if (current == null) return Collections.emptyList();
    if (current instanceof Collection) {
      return (Collection<Boolean>) current;
    }
    return Arrays.asList((Boolean) current);
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
  @JsonIgnore public Collection<ShippingDeliveryTime> getDeliveryTimes() {
    final Object current = myData.get("deliveryTime");
    if (current == null) return Collections.emptyList();
    if (current instanceof Collection) {
      return (Collection<ShippingDeliveryTime>) current;
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
  @JsonIgnore public Collection<String> getTransitTimeLabels() {
    final Object current = myData.get("transitTimeLabel");
    if (current == null) return Collections.emptyList();
    if (current instanceof Collection) {
      return (Collection<String>) current;
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
  @JsonIgnore public Collection<DefinedRegion> getShippingDestinations() {
    final Object current = myData.get("shippingDestination");
    if (current == null) return Collections.emptyList();
    if (current instanceof Collection) {
      return (Collection<DefinedRegion>) current;
    }
    return Arrays.asList((DefinedRegion) current);
  }
  protected DeliveryTimeSettings(java.util.Map<String,Object> data) {
    super(data);
  }
  
  /**
   * Builder for {@link DeliveryTimeSettings}
   */
  public static class Builder extends StructuredValue.Builder {
    public Builder(@NotNull HashMap<String,Object> data) {
      super(data);
    }
    @NotNull public DeliveryTimeSettings build() {
      return new DeliveryTimeSettings(myData);
    }
    /**
     * This can be marked 'true' to indicate that some published [[DeliveryTimeSettings]] or [[ShippingRateSettings]] are intended to apply to all [[OfferShippingDetails]] published by the same merchant, when referenced by a [[shippingSettingsLink]] in those settings. It is not meaningful to use a 'true' value for this property alongside a transitTimeLabel (for [[DeliveryTimeSettings]]) or shippingLabel (for [[ShippingRateSettings]]), since this property is for use with unlabelled settings.
     */
    @NotNull public Builder isUnlabelledFallback(@NotNull Boolean isUnlabelledFallback) {
      putValue("isUnlabelledFallback", isUnlabelledFallback);
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
      if ("isUnlabelledFallback".equals(key) && value instanceof Boolean) { this.isUnlabelledFallback((Boolean)value); return; }
      if ("isUnlabelledFallbacks".equals(key) && value instanceof Boolean) { this.isUnlabelledFallback((Boolean)value); return; }
      if ("deliveryTime".equals(key) && value instanceof ShippingDeliveryTime) { this.deliveryTime((ShippingDeliveryTime)value); return; }
      if ("deliveryTimes".equals(key) && value instanceof ShippingDeliveryTime) { this.deliveryTime((ShippingDeliveryTime)value); return; }
      if ("transitTimeLabel".equals(key) && value instanceof String) { this.transitTimeLabel((String)value); return; }
      if ("transitTimeLabels".equals(key) && value instanceof String) { this.transitTimeLabel((String)value); return; }
      if ("shippingDestination".equals(key) && value instanceof DefinedRegion) { this.shippingDestination((DefinedRegion)value); return; }
      if ("shippingDestinations".equals(key) && value instanceof DefinedRegion) { this.shippingDestination((DefinedRegion)value); return; }
      super.fromMap(key, value);
    }
  }
  
}
