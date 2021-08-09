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
 * A ShippingRateSettings represents re-usable pieces of shipping information. It is designed for publication on an URL that may be referenced via the [[shippingSettingsLink]] property of an [[OfferShippingDetails]]. Several occurrences can be published, distinguished and matched (i.e. identified/referenced) by their different values for [[shippingLabel]].
 */
public class ShippingRateSettings extends StructuredValue {
  /**
   * Label to match an [[OfferShippingDetails]] with a [[ShippingRateSettings]] (within the context of a [[shippingSettingsLink]] cross-reference).
   * @return shippingLabel property set by first invocation of shippingLabel method or {@code null}.
   */
  @JsonIgnore public String getShippingLabel() {
    return (String) getValue("shippingLabel");
  }
  /**
   * Label to match an [[OfferShippingDetails]] with a [[ShippingRateSettings]] (within the context of a [[shippingSettingsLink]] cross-reference).
   * @return all shippingLabel properties as {@link java.util.Collection} or an empty collection 
   * if shippingLabel was not set.
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
   * This can be marked 'true' to indicate that some published [[DeliveryTimeSettings]] or [[ShippingRateSettings]] are intended to apply to all [[OfferShippingDetails]] published by the same merchant, when referenced by a [[shippingSettingsLink]] in those settings. It is not meaningful to use a 'true' value for this property alongside a transitTimeLabel (for [[DeliveryTimeSettings]]) or shippingLabel (for [[ShippingRateSettings]]), since this property is for use with unlabelled settings.
   * @return isUnlabelledFallback property set by first invocation of isUnlabelledFallback method or {@code null}.
   */
  @JsonIgnore public Boolean getIsUnlabelledFallback() {
    return (Boolean) getValue("isUnlabelledFallback");
  }
  /**
   * This can be marked 'true' to indicate that some published [[DeliveryTimeSettings]] or [[ShippingRateSettings]] are intended to apply to all [[OfferShippingDetails]] published by the same merchant, when referenced by a [[shippingSettingsLink]] in those settings. It is not meaningful to use a 'true' value for this property alongside a transitTimeLabel (for [[DeliveryTimeSettings]]) or shippingLabel (for [[ShippingRateSettings]]), since this property is for use with unlabelled settings.
   * @return all isUnlabelledFallback properties as {@link java.util.Collection} or an empty collection 
   * if isUnlabelledFallback was not set.
   */
  @JsonIgnore public java.util.Collection<Boolean> getIsUnlabelledFallbacks() {
    final java.lang.Object current = myData.get("isUnlabelledFallback");
    if (current == null) return Collections.emptyList();
    if (current instanceof java.util.Collection) {
      return (java.util.Collection<Boolean>) current;
    }
    return Arrays.asList((Boolean) current);
  }
  /**
   * The shipping rate is the cost of shipping to the specified destination. Typically, the maxValue and currency values (of the [[MonetaryAmount]]) are most appropriate.
   * @return shippingRate property set by first invocation of shippingRate method or {@code null}.
   */
  @JsonIgnore public MonetaryAmount getShippingRate() {
    return (MonetaryAmount) getValue("shippingRate");
  }
  /**
   * The shipping rate is the cost of shipping to the specified destination. Typically, the maxValue and currency values (of the [[MonetaryAmount]]) are most appropriate.
   * @return all shippingRate properties as {@link java.util.Collection} or an empty collection 
   * if shippingRate was not set.
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
   * A monetary value above which (or equal to) the shipping rate becomes free. Intended to be used via an [[OfferShippingDetails]] with [[shippingSettingsLink]] matching this [[ShippingRateSettings]].
   * @return freeShippingThreshold property set by first invocation of freeShippingThreshold method or {@code null}.
   */
  @JsonIgnore public DeliveryChargeSpecification getFreeShippingThresholdDeliveryChargeSpecification() {
    return (DeliveryChargeSpecification) getValue("freeShippingThreshold");
  }
  /**
   * A monetary value above which (or equal to) the shipping rate becomes free. Intended to be used via an [[OfferShippingDetails]] with [[shippingSettingsLink]] matching this [[ShippingRateSettings]].
   * @return all freeShippingThreshold properties as {@link java.util.Collection} or an empty collection 
   * if freeShippingThreshold was not set.
   */
  @JsonIgnore public java.util.Collection<DeliveryChargeSpecification> getFreeShippingThresholdDeliveryChargeSpecifications() {
    final java.lang.Object current = myData.get("freeShippingThreshold");
    if (current == null) return Collections.emptyList();
    if (current instanceof java.util.Collection) {
      return (java.util.Collection<DeliveryChargeSpecification>) current;
    }
    return Arrays.asList((DeliveryChargeSpecification) current);
  }
  /**
   * A monetary value above which (or equal to) the shipping rate becomes free. Intended to be used via an [[OfferShippingDetails]] with [[shippingSettingsLink]] matching this [[ShippingRateSettings]].
   * @return freeShippingThreshold property set by first invocation of freeShippingThreshold method or {@code null}.
   */
  @JsonIgnore public MonetaryAmount getFreeShippingThresholdMonetaryAmount() {
    return (MonetaryAmount) getValue("freeShippingThreshold");
  }
  /**
   * A monetary value above which (or equal to) the shipping rate becomes free. Intended to be used via an [[OfferShippingDetails]] with [[shippingSettingsLink]] matching this [[ShippingRateSettings]].
   * @return all freeShippingThreshold properties as {@link java.util.Collection} or an empty collection 
   * if freeShippingThreshold was not set.
   */
  @JsonIgnore public java.util.Collection<MonetaryAmount> getFreeShippingThresholdMonetaryAmounts() {
    final java.lang.Object current = myData.get("freeShippingThreshold");
    if (current == null) return Collections.emptyList();
    if (current instanceof java.util.Collection) {
      return (java.util.Collection<MonetaryAmount>) current;
    }
    return Arrays.asList((MonetaryAmount) current);
  }
  /**
   * indicates (possibly multiple) shipping destinations. These can be defined in several ways e.g. postalCode ranges.
   * @return shippingDestination property set by first invocation of shippingDestination method or {@code null}.
   */
  @JsonIgnore public DefinedRegion getShippingDestination() {
    return (DefinedRegion) getValue("shippingDestination");
  }
  /**
   * indicates (possibly multiple) shipping destinations. These can be defined in several ways e.g. postalCode ranges.
   * @return all shippingDestination properties as {@link java.util.Collection} or an empty collection 
   * if shippingDestination was not set.
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
   * @return doesNotShip property set by first invocation of doesNotShip method or {@code null}.
   */
  @JsonIgnore public Boolean getDoesNotShip() {
    return (Boolean) getValue("doesNotShip");
  }
  /**
   * Indicates when shipping to a particular [[shippingDestination]] is not available.
   * @return all doesNotShip properties as {@link java.util.Collection} or an empty collection 
   * if doesNotShip was not set.
   */
  @JsonIgnore public java.util.Collection<Boolean> getDoesNotShips() {
    final java.lang.Object current = myData.get("doesNotShip");
    if (current == null) return Collections.emptyList();
    if (current instanceof java.util.Collection) {
      return (java.util.Collection<Boolean>) current;
    }
    return Arrays.asList((Boolean) current);
  }
  protected ShippingRateSettings(java.util.Map<String,java.lang.Object> data) {
    super(data);
  }
  
  /**
   * Builder for {@link ShippingRateSettings}
   */
  public static class Builder extends StructuredValue.Builder {
    public Builder(@NotNull HashMap<String,java.lang.Object> data) {
      super(data);
    }
    @NotNull public ShippingRateSettings build() {
      return new ShippingRateSettings(myData);
    }
    /**
     * Label to match an [[OfferShippingDetails]] with a [[ShippingRateSettings]] (within the context of a [[shippingSettingsLink]] cross-reference).
     * @param shippingLabel value to set
     * @return this builder instance
     */
    @NotNull public Builder shippingLabel(@NotNull String shippingLabel) {
      putValue("shippingLabel", shippingLabel);
      return this;
    }
    /**
     * Remove shippingLabel property from the builder.
     * If this property is repeatable, all instances are removed.
     * @return this builder instance
     */
    @NotNull public Builder removeShippingLabel() {
      removeValue("shippingLabel");
      return this;
    }
    /**
     * Get currently set value for shippingLabel property in this builder.
     * @return previously set value or {@code null}. If multiple values have been 
     * set to this property, then {@link java.util.Collection} instance will be 
     * returned.
     */
    @Nullable public java.lang.Object getShippingLabel() {
      return myData.get("shippingLabel");
    }
    /**
     * This can be marked 'true' to indicate that some published [[DeliveryTimeSettings]] or [[ShippingRateSettings]] are intended to apply to all [[OfferShippingDetails]] published by the same merchant, when referenced by a [[shippingSettingsLink]] in those settings. It is not meaningful to use a 'true' value for this property alongside a transitTimeLabel (for [[DeliveryTimeSettings]]) or shippingLabel (for [[ShippingRateSettings]]), since this property is for use with unlabelled settings.
     * @param isUnlabelledFallback value to set
     * @return this builder instance
     */
    @NotNull public Builder isUnlabelledFallback(@NotNull Boolean isUnlabelledFallback) {
      putValue("isUnlabelledFallback", isUnlabelledFallback);
      return this;
    }
    /**
     * Remove isUnlabelledFallback property from the builder.
     * If this property is repeatable, all instances are removed.
     * @return this builder instance
     */
    @NotNull public Builder removeIsUnlabelledFallback() {
      removeValue("isUnlabelledFallback");
      return this;
    }
    /**
     * Get currently set value for isUnlabelledFallback property in this builder.
     * @return previously set value or {@code null}. If multiple values have been 
     * set to this property, then {@link java.util.Collection} instance will be 
     * returned.
     */
    @Nullable public java.lang.Object getIsUnlabelledFallback() {
      return myData.get("isUnlabelledFallback");
    }
    /**
     * The shipping rate is the cost of shipping to the specified destination. Typically, the maxValue and currency values (of the [[MonetaryAmount]]) are most appropriate.
     * @param monetaryAmount value to set
     * @return this builder instance
     */
    @NotNull public Builder shippingRate(@NotNull MonetaryAmount monetaryAmount) {
      putValue("shippingRate", monetaryAmount);
      return this;
    }
    /**
     * The shipping rate is the cost of shipping to the specified destination. Typically, the maxValue and currency values (of the [[MonetaryAmount]]) are most appropriate.
     * @param monetaryAmount value to set
     * @return this builder instance
     */
    @NotNull public Builder shippingRate(@NotNull MonetaryAmount.Builder monetaryAmount) {
      putValue("shippingRate", monetaryAmount.build());
      return this;
    }
    /**
     * Remove shippingRate property from the builder.
     * If this property is repeatable, all instances are removed.
     * @return this builder instance
     */
    @NotNull public Builder removeShippingRate() {
      removeValue("shippingRate");
      return this;
    }
    /**
     * Get currently set value for shippingRate property in this builder.
     * @return previously set value or {@code null}. If multiple values have been 
     * set to this property, then {@link java.util.Collection} instance will be 
     * returned.
     */
    @Nullable public java.lang.Object getShippingRate() {
      return myData.get("shippingRate");
    }
    /**
     * A monetary value above which (or equal to) the shipping rate becomes free. Intended to be used via an [[OfferShippingDetails]] with [[shippingSettingsLink]] matching this [[ShippingRateSettings]].
     * @param deliveryChargeSpecification value to set
     * @return this builder instance
     */
    @NotNull public Builder freeShippingThreshold(@NotNull DeliveryChargeSpecification deliveryChargeSpecification) {
      putValue("freeShippingThreshold", deliveryChargeSpecification);
      return this;
    }
    /**
     * A monetary value above which (or equal to) the shipping rate becomes free. Intended to be used via an [[OfferShippingDetails]] with [[shippingSettingsLink]] matching this [[ShippingRateSettings]].
     * @param deliveryChargeSpecification value to set
     * @return this builder instance
     */
    @NotNull public Builder freeShippingThreshold(@NotNull DeliveryChargeSpecification.Builder deliveryChargeSpecification) {
      putValue("freeShippingThreshold", deliveryChargeSpecification.build());
      return this;
    }
    /**
     * A monetary value above which (or equal to) the shipping rate becomes free. Intended to be used via an [[OfferShippingDetails]] with [[shippingSettingsLink]] matching this [[ShippingRateSettings]].
     * @param monetaryAmount value to set
     * @return this builder instance
     */
    @NotNull public Builder freeShippingThreshold(@NotNull MonetaryAmount monetaryAmount) {
      putValue("freeShippingThreshold", monetaryAmount);
      return this;
    }
    /**
     * A monetary value above which (or equal to) the shipping rate becomes free. Intended to be used via an [[OfferShippingDetails]] with [[shippingSettingsLink]] matching this [[ShippingRateSettings]].
     * @param monetaryAmount value to set
     * @return this builder instance
     */
    @NotNull public Builder freeShippingThreshold(@NotNull MonetaryAmount.Builder monetaryAmount) {
      putValue("freeShippingThreshold", monetaryAmount.build());
      return this;
    }
    /**
     * Remove freeShippingThreshold property from the builder.
     * If this property is repeatable, all instances are removed.
     * @return this builder instance
     */
    @NotNull public Builder removeFreeShippingThreshold() {
      removeValue("freeShippingThreshold");
      return this;
    }
    /**
     * Get currently set value for freeShippingThreshold property in this builder.
     * @return previously set value or {@code null}. If multiple values have been 
     * set to this property, then {@link java.util.Collection} instance will be 
     * returned.
     */
    @Nullable public java.lang.Object getFreeShippingThreshold() {
      return myData.get("freeShippingThreshold");
    }
    /**
     * indicates (possibly multiple) shipping destinations. These can be defined in several ways e.g. postalCode ranges.
     * @param definedRegion value to set
     * @return this builder instance
     */
    @NotNull public Builder shippingDestination(@NotNull DefinedRegion definedRegion) {
      putValue("shippingDestination", definedRegion);
      return this;
    }
    /**
     * indicates (possibly multiple) shipping destinations. These can be defined in several ways e.g. postalCode ranges.
     * @param definedRegion value to set
     * @return this builder instance
     */
    @NotNull public Builder shippingDestination(@NotNull DefinedRegion.Builder definedRegion) {
      putValue("shippingDestination", definedRegion.build());
      return this;
    }
    /**
     * Remove shippingDestination property from the builder.
     * If this property is repeatable, all instances are removed.
     * @return this builder instance
     */
    @NotNull public Builder removeShippingDestination() {
      removeValue("shippingDestination");
      return this;
    }
    /**
     * Get currently set value for shippingDestination property in this builder.
     * @return previously set value or {@code null}. If multiple values have been 
     * set to this property, then {@link java.util.Collection} instance will be 
     * returned.
     */
    @Nullable public java.lang.Object getShippingDestination() {
      return myData.get("shippingDestination");
    }
    /**
     * Indicates when shipping to a particular [[shippingDestination]] is not available.
     * @param doesNotShip value to set
     * @return this builder instance
     */
    @NotNull public Builder doesNotShip(@NotNull Boolean doesNotShip) {
      putValue("doesNotShip", doesNotShip);
      return this;
    }
    /**
     * Remove doesNotShip property from the builder.
     * If this property is repeatable, all instances are removed.
     * @return this builder instance
     */
    @NotNull public Builder removeDoesNotShip() {
      removeValue("doesNotShip");
      return this;
    }
    /**
     * Get currently set value for doesNotShip property in this builder.
     * @return previously set value or {@code null}. If multiple values have been 
     * set to this property, then {@link java.util.Collection} instance will be 
     * returned.
     */
    @Nullable public java.lang.Object getDoesNotShip() {
      return myData.get("doesNotShip");
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
      if ("shippingLabel".equals(key) && value instanceof String) { this.shippingLabel((String)value); return; }
      if ("shippingLabels".equals(key) && value instanceof String) { this.shippingLabel((String)value); return; }
      if ("isUnlabelledFallback".equals(key) && value instanceof Boolean) { this.isUnlabelledFallback((Boolean)value); return; }
      if ("isUnlabelledFallbacks".equals(key) && value instanceof Boolean) { this.isUnlabelledFallback((Boolean)value); return; }
      if ("shippingRate".equals(key) && value instanceof MonetaryAmount) { this.shippingRate((MonetaryAmount)value); return; }
      if ("shippingRates".equals(key) && value instanceof MonetaryAmount) { this.shippingRate((MonetaryAmount)value); return; }
      if ("freeShippingThreshold".equals(key) && value instanceof DeliveryChargeSpecification) { this.freeShippingThreshold((DeliveryChargeSpecification)value); return; }
      if ("freeShippingThresholds".equals(key) && value instanceof DeliveryChargeSpecification) { this.freeShippingThreshold((DeliveryChargeSpecification)value); return; }
      if ("freeShippingThreshold".equals(key) && value instanceof MonetaryAmount) { this.freeShippingThreshold((MonetaryAmount)value); return; }
      if ("freeShippingThresholds".equals(key) && value instanceof MonetaryAmount) { this.freeShippingThreshold((MonetaryAmount)value); return; }
      if ("shippingDestination".equals(key) && value instanceof DefinedRegion) { this.shippingDestination((DefinedRegion)value); return; }
      if ("shippingDestinations".equals(key) && value instanceof DefinedRegion) { this.shippingDestination((DefinedRegion)value); return; }
      if ("doesNotShip".equals(key) && value instanceof Boolean) { this.doesNotShip((Boolean)value); return; }
      if ("doesNotShips".equals(key) && value instanceof Boolean) { this.doesNotShip((Boolean)value); return; }
      super.fromMap(key, value);
    }
  }
  
}
