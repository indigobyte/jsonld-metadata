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
 * When a single product is associated with multiple offers (for example, the same pair of shoes is offered by different merchants), then AggregateOffer can be used.\n\nNote: AggregateOffers are normally expected to associate multiple offers that all share the same defined [[businessFunction]] value, or default to http://purl.org/goodrelations/v1#Sell if businessFunction is not explicitly defined.
 */
public class AggregateOffer extends Offer {
  /**
   * The lowest price of all offers available.\n\nUsage guidelines:\n\n* Use values from 0123456789 (Unicode 'DIGIT ZERO' (U+0030) to 'DIGIT NINE' (U+0039)) rather than superficially similiar Unicode symbols.\n* Use '.' (Unicode 'FULL STOP' (U+002E)) rather than ',' to indicate a decimal point. Avoid using these symbols as a readability separator.
   */
  @JsonIgnore public Number getLowPriceNumber() {
    return (Number) getValue("lowPrice");
  }
  /**
   * The lowest price of all offers available.\n\nUsage guidelines:\n\n* Use values from 0123456789 (Unicode 'DIGIT ZERO' (U+0030) to 'DIGIT NINE' (U+0039)) rather than superficially similiar Unicode symbols.\n* Use '.' (Unicode 'FULL STOP' (U+002E)) rather than ',' to indicate a decimal point. Avoid using these symbols as a readability separator.
   */
  @JsonIgnore public Collection<Number> getLowPriceNumbers() {
    final Object current = myData.get("lowPrice");
    if (current == null) return Collections.emptyList();
    if (current instanceof Collection) {
      return (Collection<Number>) current;
    }
    return Arrays.asList((Number) current);
  }
  /**
   * The lowest price of all offers available.\n\nUsage guidelines:\n\n* Use values from 0123456789 (Unicode 'DIGIT ZERO' (U+0030) to 'DIGIT NINE' (U+0039)) rather than superficially similiar Unicode symbols.\n* Use '.' (Unicode 'FULL STOP' (U+002E)) rather than ',' to indicate a decimal point. Avoid using these symbols as a readability separator.
   */
  @JsonIgnore public String getLowPriceString() {
    return (String) getValue("lowPrice");
  }
  /**
   * The lowest price of all offers available.\n\nUsage guidelines:\n\n* Use values from 0123456789 (Unicode 'DIGIT ZERO' (U+0030) to 'DIGIT NINE' (U+0039)) rather than superficially similiar Unicode symbols.\n* Use '.' (Unicode 'FULL STOP' (U+002E)) rather than ',' to indicate a decimal point. Avoid using these symbols as a readability separator.
   */
  @JsonIgnore public Collection<String> getLowPriceStrings() {
    final Object current = myData.get("lowPrice");
    if (current == null) return Collections.emptyList();
    if (current instanceof Collection) {
      return (Collection<String>) current;
    }
    return Arrays.asList((String) current);
  }
  /**
   * The highest price of all offers available.\n\nUsage guidelines:\n\n* Use values from 0123456789 (Unicode 'DIGIT ZERO' (U+0030) to 'DIGIT NINE' (U+0039)) rather than superficially similiar Unicode symbols.\n* Use '.' (Unicode 'FULL STOP' (U+002E)) rather than ',' to indicate a decimal point. Avoid using these symbols as a readability separator.
   */
  @JsonIgnore public Number getHighPriceNumber() {
    return (Number) getValue("highPrice");
  }
  /**
   * The highest price of all offers available.\n\nUsage guidelines:\n\n* Use values from 0123456789 (Unicode 'DIGIT ZERO' (U+0030) to 'DIGIT NINE' (U+0039)) rather than superficially similiar Unicode symbols.\n* Use '.' (Unicode 'FULL STOP' (U+002E)) rather than ',' to indicate a decimal point. Avoid using these symbols as a readability separator.
   */
  @JsonIgnore public Collection<Number> getHighPriceNumbers() {
    final Object current = myData.get("highPrice");
    if (current == null) return Collections.emptyList();
    if (current instanceof Collection) {
      return (Collection<Number>) current;
    }
    return Arrays.asList((Number) current);
  }
  /**
   * The highest price of all offers available.\n\nUsage guidelines:\n\n* Use values from 0123456789 (Unicode 'DIGIT ZERO' (U+0030) to 'DIGIT NINE' (U+0039)) rather than superficially similiar Unicode symbols.\n* Use '.' (Unicode 'FULL STOP' (U+002E)) rather than ',' to indicate a decimal point. Avoid using these symbols as a readability separator.
   */
  @JsonIgnore public String getHighPriceString() {
    return (String) getValue("highPrice");
  }
  /**
   * The highest price of all offers available.\n\nUsage guidelines:\n\n* Use values from 0123456789 (Unicode 'DIGIT ZERO' (U+0030) to 'DIGIT NINE' (U+0039)) rather than superficially similiar Unicode symbols.\n* Use '.' (Unicode 'FULL STOP' (U+002E)) rather than ',' to indicate a decimal point. Avoid using these symbols as a readability separator.
   */
  @JsonIgnore public Collection<String> getHighPriceStrings() {
    final Object current = myData.get("highPrice");
    if (current == null) return Collections.emptyList();
    if (current instanceof Collection) {
      return (Collection<String>) current;
    }
    return Arrays.asList((String) current);
  }
  /**
   * The number of offers for the product.
   */
  @JsonIgnore public Integer getOfferCount() {
    return (Integer) getValue("offerCount");
  }
  /**
   * The number of offers for the product.
   */
  @JsonIgnore public Collection<Integer> getOfferCounts() {
    final Object current = myData.get("offerCount");
    if (current == null) return Collections.emptyList();
    if (current instanceof Collection) {
      return (Collection<Integer>) current;
    }
    return Arrays.asList((Integer) current);
  }
  /**
   * An offer to provide this item&amp;#x2014;for example, an offer to sell a product, rent the DVD of a movie, perform a service, or give away tickets to an event. Use [[businessFunction]] to indicate the kind of transaction offered, i.e. sell, lease, etc. This property can also be used to describe a [[Demand]]. While this property is listed as expected on a number of common types, it can be used in others. In that case, using a second type, such as Product or a subtype of Product, can clarify the nature of the offer.
   *       
   */
  @JsonIgnore public Demand getOffersDemand() {
    return (Demand) getValue("offers");
  }
  /**
   * An offer to provide this item&amp;#x2014;for example, an offer to sell a product, rent the DVD of a movie, perform a service, or give away tickets to an event. Use [[businessFunction]] to indicate the kind of transaction offered, i.e. sell, lease, etc. This property can also be used to describe a [[Demand]]. While this property is listed as expected on a number of common types, it can be used in others. In that case, using a second type, such as Product or a subtype of Product, can clarify the nature of the offer.
   *       
   */
  @JsonIgnore public Collection<Demand> getOffersDemands() {
    final Object current = myData.get("offers");
    if (current == null) return Collections.emptyList();
    if (current instanceof Collection) {
      return (Collection<Demand>) current;
    }
    return Arrays.asList((Demand) current);
  }
  /**
   * An offer to provide this item&amp;#x2014;for example, an offer to sell a product, rent the DVD of a movie, perform a service, or give away tickets to an event. Use [[businessFunction]] to indicate the kind of transaction offered, i.e. sell, lease, etc. This property can also be used to describe a [[Demand]]. While this property is listed as expected on a number of common types, it can be used in others. In that case, using a second type, such as Product or a subtype of Product, can clarify the nature of the offer.
   *       
   */
  @JsonIgnore public Offer getOffersOffer() {
    return (Offer) getValue("offers");
  }
  /**
   * An offer to provide this item&amp;#x2014;for example, an offer to sell a product, rent the DVD of a movie, perform a service, or give away tickets to an event. Use [[businessFunction]] to indicate the kind of transaction offered, i.e. sell, lease, etc. This property can also be used to describe a [[Demand]]. While this property is listed as expected on a number of common types, it can be used in others. In that case, using a second type, such as Product or a subtype of Product, can clarify the nature of the offer.
   *       
   */
  @JsonIgnore public Collection<Offer> getOffersOffers() {
    final Object current = myData.get("offers");
    if (current == null) return Collections.emptyList();
    if (current instanceof Collection) {
      return (Collection<Offer>) current;
    }
    return Arrays.asList((Offer) current);
  }
  protected AggregateOffer(java.util.Map<String,Object> data) {
    super(data);
  }
  
  /**
   * Builder for {@link AggregateOffer}
   */
  public static class Builder extends Offer.Builder {
    public Builder(@NotNull HashMap<String,Object> data) {
      super(data);
    }
    @NotNull public AggregateOffer build() {
      return new AggregateOffer(myData);
    }
    /**
     * The lowest price of all offers available.\n\nUsage guidelines:\n\n* Use values from 0123456789 (Unicode 'DIGIT ZERO' (U+0030) to 'DIGIT NINE' (U+0039)) rather than superficially similiar Unicode symbols.\n* Use '.' (Unicode 'FULL STOP' (U+002E)) rather than ',' to indicate a decimal point. Avoid using these symbols as a readability separator.
     */
    @NotNull public Builder lowPrice(@NotNull Number number) {
      putValue("lowPrice", number);
      return this;
    }
    /**
     * The lowest price of all offers available.\n\nUsage guidelines:\n\n* Use values from 0123456789 (Unicode 'DIGIT ZERO' (U+0030) to 'DIGIT NINE' (U+0039)) rather than superficially similiar Unicode symbols.\n* Use '.' (Unicode 'FULL STOP' (U+002E)) rather than ',' to indicate a decimal point. Avoid using these symbols as a readability separator.
     */
    @NotNull public Builder lowPrice(@NotNull String lowPrice) {
      putValue("lowPrice", lowPrice);
      return this;
    }
    /**
     * The highest price of all offers available.\n\nUsage guidelines:\n\n* Use values from 0123456789 (Unicode 'DIGIT ZERO' (U+0030) to 'DIGIT NINE' (U+0039)) rather than superficially similiar Unicode symbols.\n* Use '.' (Unicode 'FULL STOP' (U+002E)) rather than ',' to indicate a decimal point. Avoid using these symbols as a readability separator.
     */
    @NotNull public Builder highPrice(@NotNull Number number) {
      putValue("highPrice", number);
      return this;
    }
    /**
     * The highest price of all offers available.\n\nUsage guidelines:\n\n* Use values from 0123456789 (Unicode 'DIGIT ZERO' (U+0030) to 'DIGIT NINE' (U+0039)) rather than superficially similiar Unicode symbols.\n* Use '.' (Unicode 'FULL STOP' (U+002E)) rather than ',' to indicate a decimal point. Avoid using these symbols as a readability separator.
     */
    @NotNull public Builder highPrice(@NotNull String highPrice) {
      putValue("highPrice", highPrice);
      return this;
    }
    /**
     * The number of offers for the product.
     */
    @NotNull public Builder offerCount(@NotNull Integer integer) {
      putValue("offerCount", integer);
      return this;
    }
    /**
     * An offer to provide this item&amp;#x2014;for example, an offer to sell a product, rent the DVD of a movie, perform a service, or give away tickets to an event. Use [[businessFunction]] to indicate the kind of transaction offered, i.e. sell, lease, etc. This property can also be used to describe a [[Demand]]. While this property is listed as expected on a number of common types, it can be used in others. In that case, using a second type, such as Product or a subtype of Product, can clarify the nature of the offer.
     *       
     */
    @NotNull public Builder offers(@NotNull Demand demand) {
      putValue("offers", demand);
      return this;
    }
    /**
     * An offer to provide this item&amp;#x2014;for example, an offer to sell a product, rent the DVD of a movie, perform a service, or give away tickets to an event. Use [[businessFunction]] to indicate the kind of transaction offered, i.e. sell, lease, etc. This property can also be used to describe a [[Demand]]. While this property is listed as expected on a number of common types, it can be used in others. In that case, using a second type, such as Product or a subtype of Product, can clarify the nature of the offer.
     *       
     */
    @NotNull public Builder offers(@NotNull Demand.Builder demand) {
      putValue("offers", demand.build());
      return this;
    }
    /**
     * An offer to provide this item&amp;#x2014;for example, an offer to sell a product, rent the DVD of a movie, perform a service, or give away tickets to an event. Use [[businessFunction]] to indicate the kind of transaction offered, i.e. sell, lease, etc. This property can also be used to describe a [[Demand]]. While this property is listed as expected on a number of common types, it can be used in others. In that case, using a second type, such as Product or a subtype of Product, can clarify the nature of the offer.
     *       
     */
    @NotNull public Builder offers(@NotNull Offer offer) {
      putValue("offers", offer);
      return this;
    }
    /**
     * An offer to provide this item&amp;#x2014;for example, an offer to sell a product, rent the DVD of a movie, perform a service, or give away tickets to an event. Use [[businessFunction]] to indicate the kind of transaction offered, i.e. sell, lease, etc. This property can also be used to describe a [[Demand]]. While this property is listed as expected on a number of common types, it can be used in others. In that case, using a second type, such as Product or a subtype of Product, can clarify the nature of the offer.
     *       
     */
    @NotNull public Builder offers(@NotNull Offer.Builder offer) {
      putValue("offers", offer.build());
      return this;
    }
    /**
     * The typical delay between the receipt of the order and the goods either leaving the warehouse or being prepared for pickup, in case the delivery method is on site pickup.
     */
    @NotNull public Builder deliveryLeadTime(@NotNull QuantitativeValue quantitativeValue) {
      putValue("deliveryLeadTime", quantitativeValue);
      return this;
    }
    /**
     * The typical delay between the receipt of the order and the goods either leaving the warehouse or being prepared for pickup, in case the delivery method is on site pickup.
     */
    @NotNull public Builder deliveryLeadTime(@NotNull QuantitativeValue.Builder quantitativeValue) {
      putValue("deliveryLeadTime", quantitativeValue.build());
      return this;
    }
    /**
     * The end of the availability of the product or service included in the offer.
     */
    @NotNull public Builder availabilityEnds(@NotNull java.util.Date date) {
      putValue("availabilityEnds", date);
      return this;
    }
    /**
     * The date when the item becomes valid.
     */
    @NotNull public Builder validFrom(@NotNull java.util.Date date) {
      putValue("validFrom", date);
      return this;
    }
    /**
     * The current approximate inventory level for the item or items.
     */
    @NotNull public Builder inventoryLevel(@NotNull QuantitativeValue quantitativeValue) {
      putValue("inventoryLevel", quantitativeValue);
      return this;
    }
    /**
     * The current approximate inventory level for the item or items.
     */
    @NotNull public Builder inventoryLevel(@NotNull QuantitativeValue.Builder quantitativeValue) {
      putValue("inventoryLevel", quantitativeValue.build());
      return this;
    }
    /**
     * The GTIN-13 code of the product, or the product to which the offer refers. This is equivalent to 13-digit ISBN codes and EAN UCC-13. Former 12-digit UPC codes can be converted into a GTIN-13 code by simply adding a preceding zero. See [GS1 GTIN Summary](http://www.gs1.org/barcodes/technical/idkeys/gtin) for more details.
     */
    @NotNull public Builder gtin13(@NotNull Gtin gtin) {
      putValue("gtin13", gtin);
      return this;
    }
    /**
     * The ISO 3166-1 (ISO 3166-1 alpha-2) or ISO 3166-2 code, the place, or the GeoShape for the geo-political region(s) for which the offer or delivery charge specification is not valid, e.g. a region where the transaction is not allowed.\n\nSee also [[eligibleRegion]].
     *       
     */
    @NotNull public Builder ineligibleRegion(@NotNull GeoShape geoShape) {
      putValue("ineligibleRegion", geoShape);
      return this;
    }
    /**
     * The ISO 3166-1 (ISO 3166-1 alpha-2) or ISO 3166-2 code, the place, or the GeoShape for the geo-political region(s) for which the offer or delivery charge specification is not valid, e.g. a region where the transaction is not allowed.\n\nSee also [[eligibleRegion]].
     *       
     */
    @NotNull public Builder ineligibleRegion(@NotNull GeoShape.Builder geoShape) {
      putValue("ineligibleRegion", geoShape.build());
      return this;
    }
    /**
     * The ISO 3166-1 (ISO 3166-1 alpha-2) or ISO 3166-2 code, the place, or the GeoShape for the geo-political region(s) for which the offer or delivery charge specification is not valid, e.g. a region where the transaction is not allowed.\n\nSee also [[eligibleRegion]].
     *       
     */
    @NotNull public Builder ineligibleRegion(@NotNull Place place) {
      putValue("ineligibleRegion", place);
      return this;
    }
    /**
     * The ISO 3166-1 (ISO 3166-1 alpha-2) or ISO 3166-2 code, the place, or the GeoShape for the geo-political region(s) for which the offer or delivery charge specification is not valid, e.g. a region where the transaction is not allowed.\n\nSee also [[eligibleRegion]].
     *       
     */
    @NotNull public Builder ineligibleRegion(@NotNull Place.Builder place) {
      putValue("ineligibleRegion", place.build());
      return this;
    }
    /**
     * The ISO 3166-1 (ISO 3166-1 alpha-2) or ISO 3166-2 code, the place, or the GeoShape for the geo-political region(s) for which the offer or delivery charge specification is not valid, e.g. a region where the transaction is not allowed.\n\nSee also [[eligibleRegion]].
     *       
     */
    @NotNull public Builder ineligibleRegion(@NotNull String ineligibleRegion) {
      putValue("ineligibleRegion", ineligibleRegion);
      return this;
    }
    /**
     * The GTIN-14 code of the product, or the product to which the offer refers. See [GS1 GTIN Summary](http://www.gs1.org/barcodes/technical/idkeys/gtin) for more details.
     */
    @NotNull public Builder gtin14(@NotNull Identifier identifier) {
      putValue("gtin14", identifier);
      return this;
    }
    /**
     * A predefined value from OfferItemCondition specifying the condition of the product or service, or the products or services included in the offer. Also used for product return policies to specify the condition of products accepted for returns.
     */
    @NotNull public Builder itemCondition(@NotNull OfferItemCondition offerItemCondition) {
      putValue("itemCondition", offerItemCondition);
      return this;
    }
    /**
     * The offer price of a product, or of a price component when attached to PriceSpecification and its subtypes.\n\nUsage guidelines:\n\n* Use the [[priceCurrency]] property (with standard formats: [ISO 4217 currency format](http://en.wikipedia.org/wiki/ISO_4217) e.g. &quot;USD&quot;; [Ticker symbol](https://en.wikipedia.org/wiki/List_of_cryptocurrencies) for cryptocurrencies e.g. &quot;BTC&quot;; well known names for [Local Exchange Tradings Systems](https://en.wikipedia.org/wiki/Local_exchange_trading_system) (LETS) and other currency types e.g. &quot;Ithaca HOUR&quot;) instead of including [ambiguous symbols](http://en.wikipedia.org/wiki/Dollar_sign#Currencies_that_use_the_dollar_or_peso_sign) such as '$' in the value.\n* Use '.' (Unicode 'FULL STOP' (U+002E)) rather than ',' to indicate a decimal point. Avoid using these symbols as a readability separator.\n* Note that both [RDFa](http://www.w3.org/TR/xhtml-rdfa-primer/#using-the-content-attribute) and Microdata syntax allow the use of a &quot;content=&quot; attribute for publishing simple machine-readable values alongside more human-friendly formatting.\n* Use values from 0123456789 (Unicode 'DIGIT ZERO' (U+0030) to 'DIGIT NINE' (U+0039)) rather than superficially similiar Unicode symbols.
     *       
     */
    @NotNull public Builder price(@NotNull Number number) {
      putValue("price", number);
      return this;
    }
    /**
     * The offer price of a product, or of a price component when attached to PriceSpecification and its subtypes.\n\nUsage guidelines:\n\n* Use the [[priceCurrency]] property (with standard formats: [ISO 4217 currency format](http://en.wikipedia.org/wiki/ISO_4217) e.g. &quot;USD&quot;; [Ticker symbol](https://en.wikipedia.org/wiki/List_of_cryptocurrencies) for cryptocurrencies e.g. &quot;BTC&quot;; well known names for [Local Exchange Tradings Systems](https://en.wikipedia.org/wiki/Local_exchange_trading_system) (LETS) and other currency types e.g. &quot;Ithaca HOUR&quot;) instead of including [ambiguous symbols](http://en.wikipedia.org/wiki/Dollar_sign#Currencies_that_use_the_dollar_or_peso_sign) such as '$' in the value.\n* Use '.' (Unicode 'FULL STOP' (U+002E)) rather than ',' to indicate a decimal point. Avoid using these symbols as a readability separator.\n* Note that both [RDFa](http://www.w3.org/TR/xhtml-rdfa-primer/#using-the-content-attribute) and Microdata syntax allow the use of a &quot;content=&quot; attribute for publishing simple machine-readable values alongside more human-friendly formatting.\n* Use values from 0123456789 (Unicode 'DIGIT ZERO' (U+0030) to 'DIGIT NINE' (U+0039)) rather than superficially similiar Unicode symbols.
     *       
     */
    @NotNull public Builder price(@NotNull String price) {
      putValue("price", price);
      return this;
    }
    /**
     * One or more detailed price specifications, indicating the unit price and delivery or payment charges.
     */
    @NotNull public Builder priceSpecification(@NotNull PriceSpecification priceSpecification) {
      putValue("priceSpecification", priceSpecification);
      return this;
    }
    /**
     * One or more detailed price specifications, indicating the unit price and delivery or payment charges.
     */
    @NotNull public Builder priceSpecification(@NotNull PriceSpecification.Builder priceSpecification) {
      putValue("priceSpecification", priceSpecification.build());
      return this;
    }
    /**
     * The overall rating, based on a collection of reviews or ratings, of the item.
     */
    @NotNull public Builder aggregateRating(@NotNull AggregateRating aggregateRating) {
      putValue("aggregateRating", aggregateRating);
      return this;
    }
    /**
     * The overall rating, based on a collection of reviews or ratings, of the item.
     */
    @NotNull public Builder aggregateRating(@NotNull AggregateRating.Builder aggregateRating) {
      putValue("aggregateRating", aggregateRating.build());
      return this;
    }
    /**
     * The Manufacturer Part Number (MPN) of the product, or the product to which the offer refers.
     */
    @NotNull public Builder mpn(@NotNull String mpn) {
      putValue("mpn", mpn);
      return this;
    }
    /**
     * The type(s) of customers for which the given offer is valid.
     */
    @NotNull public Builder eligibleCustomerType(@NotNull BusinessEntityType businessEntityType) {
      putValue("eligibleCustomerType", businessEntityType);
      return this;
    }
    /**
     * The payment method(s) accepted by seller for this offer.
     */
    @NotNull public Builder acceptedPaymentMethod(@NotNull LoanOrCredit loanOrCredit) {
      putValue("acceptedPaymentMethod", loanOrCredit);
      return this;
    }
    /**
     * The payment method(s) accepted by seller for this offer.
     */
    @NotNull public Builder acceptedPaymentMethod(@NotNull PaymentMethod paymentMethod) {
      putValue("acceptedPaymentMethod", paymentMethod);
      return this;
    }
    /**
     * The payment method(s) accepted by seller for this offer.
     */
    @NotNull public Builder acceptedPaymentMethod(@NotNull PaymentMethod.Builder paymentMethod) {
      putValue("acceptedPaymentMethod", paymentMethod.build());
      return this;
    }
    /**
     * This links to a node or nodes indicating the exact quantity of the products included in  an [[Offer]] or [[ProductCollection]].
     */
    @NotNull public Builder includesObject(@NotNull TypeAndQuantityNode typeAndQuantityNode) {
      putValue("includesObject", typeAndQuantityNode);
      return this;
    }
    /**
     * This links to a node or nodes indicating the exact quantity of the products included in  an [[Offer]] or [[ProductCollection]].
     */
    @NotNull public Builder includesObject(@NotNull TypeAndQuantityNode.Builder typeAndQuantityNode) {
      putValue("includesObject", typeAndQuantityNode.build());
      return this;
    }
    /**
     * The GTIN-12 code of the product, or the product to which the offer refers. The GTIN-12 is the 12-digit GS1 Identification Key composed of a U.P.C. Company Prefix, Item Reference, and Check Digit used to identify trade items. See [GS1 GTIN Summary](http://www.gs1.org/barcodes/technical/idkeys/gtin) for more details.
     */
    @NotNull public Builder gtin12(@NotNull Identifier identifier) {
      putValue("gtin12", identifier);
      return this;
    }
    /**
     * Indicates information about the shipping policies and options associated with an [[Offer]].
     */
    @NotNull public Builder shippingDetails(@NotNull OfferShippingDetails offerShippingDetails) {
      putValue("shippingDetails", offerShippingDetails);
      return this;
    }
    /**
     * Indicates information about the shipping policies and options associated with an [[Offer]].
     */
    @NotNull public Builder shippingDetails(@NotNull OfferShippingDetails.Builder offerShippingDetails) {
      putValue("shippingDetails", offerShippingDetails.build());
      return this;
    }
    /**
     * The Stock Keeping Unit (SKU), i.e. a merchant-specific identifier for a product or service, or the product to which the offer refers.
     */
    @NotNull public Builder sku(@NotNull Identifier identifier) {
      putValue("sku", identifier);
      return this;
    }
    /**
     * The interval and unit of measurement of ordering quantities for which the offer or price specification is valid. This allows e.g. specifying that a certain freight charge is valid only for a certain quantity.
     */
    @NotNull public Builder eligibleQuantity(@NotNull QuantitativeValue quantitativeValue) {
      putValue("eligibleQuantity", quantitativeValue);
      return this;
    }
    /**
     * The interval and unit of measurement of ordering quantities for which the offer or price specification is valid. This allows e.g. specifying that a certain freight charge is valid only for a certain quantity.
     */
    @NotNull public Builder eligibleQuantity(@NotNull QuantitativeValue.Builder quantitativeValue) {
      putValue("eligibleQuantity", quantitativeValue.build());
      return this;
    }
    /**
     * The warranty promise(s) included in the offer.
     */
    @NotNull public Builder warranty(@NotNull WarrantyPromise warrantyPromise) {
      putValue("warranty", warrantyPromise);
      return this;
    }
    /**
     * The warranty promise(s) included in the offer.
     */
    @NotNull public Builder warranty(@NotNull WarrantyPromise.Builder warrantyPromise) {
      putValue("warranty", warrantyPromise.build());
      return this;
    }
    /**
     * The place(s) from which the offer can be obtained (e.g. store locations).
     */
    @NotNull public Builder availableAtOrFrom(@NotNull AreaServed areaServed) {
      putValue("availableAtOrFrom", areaServed);
      return this;
    }
    /**
     * The date after when the item is not valid. For example the end of an offer, salary period, or a period of opening hours.
     */
    @NotNull public Builder validThrough(@NotNull java.util.Date date) {
      putValue("validThrough", date);
      return this;
    }
    /**
     * Specifies a MerchantReturnPolicy that may be applicable.
     */
    @NotNull public Builder hasMerchantReturnPolicy(@NotNull MerchantReturnPolicy merchantReturnPolicy) {
      putValue("hasMerchantReturnPolicy", merchantReturnPolicy);
      return this;
    }
    /**
     * Specifies a MerchantReturnPolicy that may be applicable.
     */
    @NotNull public Builder hasMerchantReturnPolicy(@NotNull MerchantReturnPolicy.Builder merchantReturnPolicy) {
      putValue("hasMerchantReturnPolicy", merchantReturnPolicy.build());
      return this;
    }
    /**
     * The delivery method(s) available for this offer.
     */
    @NotNull public Builder availableDeliveryMethod(@NotNull DeliveryMethod deliveryMethod) {
      putValue("availableDeliveryMethod", deliveryMethod);
      return this;
    }
    /**
     * The ISO 3166-1 (ISO 3166-1 alpha-2) or ISO 3166-2 code, the place, or the GeoShape for the geo-political region(s) for which the offer or delivery charge specification is valid.\n\nSee also [[ineligibleRegion]].
     *     
     */
    @NotNull public Builder eligibleRegion(@NotNull AreaServed areaServed) {
      putValue("eligibleRegion", areaServed);
      return this;
    }
    /**
     * The transaction volume, in a monetary unit, for which the offer or price specification is valid, e.g. for indicating a minimal purchasing volume, to express free shipping above a certain order volume, or to limit the acceptance of credit cards to purchases to a certain minimal amount.
     */
    @NotNull public Builder eligibleTransactionVolume(@NotNull PriceSpecification priceSpecification) {
      putValue("eligibleTransactionVolume", priceSpecification);
      return this;
    }
    /**
     * The transaction volume, in a monetary unit, for which the offer or price specification is valid, e.g. for indicating a minimal purchasing volume, to express free shipping above a certain order volume, or to limit the acceptance of credit cards to purchases to a certain minimal amount.
     */
    @NotNull public Builder eligibleTransactionVolume(@NotNull PriceSpecification.Builder priceSpecification) {
      putValue("eligibleTransactionVolume", priceSpecification.build());
      return this;
    }
    /**
     * A category for the item. Greater signs or slashes can be used to informally indicate a category hierarchy.
     */
    @NotNull public Builder category(@NotNull Category category) {
      putValue("category", category);
      return this;
    }
    /**
     * Length of the lease for some [[Accommodation]], either particular to some [[Offer]] or in some cases intrinsic to the property.
     */
    @NotNull public Builder leaseLength(@NotNull Duration duration) {
      putValue("leaseLength", duration);
      return this;
    }
    /**
     * Length of the lease for some [[Accommodation]], either particular to some [[Offer]] or in some cases intrinsic to the property.
     */
    @NotNull public Builder leaseLength(@NotNull QuantitativeValue quantitativeValue) {
      putValue("leaseLength", quantitativeValue);
      return this;
    }
    /**
     * Length of the lease for some [[Accommodation]], either particular to some [[Offer]] or in some cases intrinsic to the property.
     */
    @NotNull public Builder leaseLength(@NotNull QuantitativeValue.Builder quantitativeValue) {
      putValue("leaseLength", quantitativeValue.build());
      return this;
    }
    /**
     * The serial number or any alphanumeric identifier of a particular product. When attached to an offer, it is a shortcut for the serial number of the product included in the offer.
     */
    @NotNull public Builder serialNumber(@NotNull SerialNumber serialNumber) {
      putValue("serialNumber", serialNumber);
      return this;
    }
    /**
     * The business function (e.g. sell, lease, repair, dispose) of the offer or component of a bundle (TypeAndQuantityNode). The default is http://purl.org/goodrelations/v1#Sell.
     */
    @NotNull public Builder businessFunction(@NotNull BusinessFunction businessFunction) {
      putValue("businessFunction", businessFunction);
      return this;
    }
    /**
     * A review of the item.
     */
    @NotNull public Builder review(@NotNull Review review) {
      putValue("review", review);
      return this;
    }
    /**
     * A review of the item.
     */
    @NotNull public Builder review(@NotNull Review.Builder review) {
      putValue("review", review.build());
      return this;
    }
    /**
     * The availability of this item&amp;#x2014;for example In stock, Out of stock, Pre-order, etc.
     */
    @NotNull public Builder availability(@NotNull ItemAvailability itemAvailability) {
      putValue("availability", itemAvailability);
      return this;
    }
    /**
     * An entity which offers (sells / leases / lends / loans) the services / goods.  A seller may also be a provider.
     */
    @NotNull public Builder seller(@NotNull Participant participant) {
      putValue("seller", participant);
      return this;
    }
    /**
     * The currency of the price, or a price component when attached to [[PriceSpecification]] and its subtypes.\n\nUse standard formats: [ISO 4217 currency format](http://en.wikipedia.org/wiki/ISO_4217) e.g. &quot;USD&quot;; [Ticker symbol](https://en.wikipedia.org/wiki/List_of_cryptocurrencies) for cryptocurrencies e.g. &quot;BTC&quot;; well known names for [Local Exchange Tradings Systems](https://en.wikipedia.org/wiki/Local_exchange_trading_system) (LETS) and other currency types e.g. &quot;Ithaca HOUR&quot;.
     */
    @NotNull public Builder priceCurrency(@NotNull String priceCurrency) {
      putValue("priceCurrency", priceCurrency);
      return this;
    }
    /**
     * The GTIN-8 code of the product, or the product to which the offer refers. This code is also known as EAN/UCC-8 or 8-digit EAN. See [GS1 GTIN Summary](http://www.gs1.org/barcodes/technical/idkeys/gtin) for more details.
     */
    @NotNull public Builder gtin8(@NotNull Gtin gtin) {
      putValue("gtin8", gtin);
      return this;
    }
    /**
     * The date after which the price is no longer available.
     */
    @NotNull public Builder priceValidUntil(@NotNull java.util.Date date) {
      putValue("priceValidUntil", date);
      return this;
    }
    /**
     * The duration for which the given offer is valid.
     */
    @NotNull public Builder eligibleDuration(@NotNull QuantitativeValue quantitativeValue) {
      putValue("eligibleDuration", quantitativeValue);
      return this;
    }
    /**
     * The duration for which the given offer is valid.
     */
    @NotNull public Builder eligibleDuration(@NotNull QuantitativeValue.Builder quantitativeValue) {
      putValue("eligibleDuration", quantitativeValue.build());
      return this;
    }
    /**
     * The beginning of the availability of the product or service included in the offer.
     */
    @NotNull public Builder availabilityStarts(@NotNull java.util.Date date) {
      putValue("availabilityStarts", date);
      return this;
    }
    /**
     * A product measurement, for example the inseam of pants, the wheel size of a bicycle, or the gauge of a screw. Usually an exact measurement, but can also be a range of measurements for adjustable products, for example belts and ski bindings.
     */
    @NotNull public Builder hasMeasurement(@NotNull QuantitativeValue quantitativeValue) {
      putValue("hasMeasurement", quantitativeValue);
      return this;
    }
    /**
     * A product measurement, for example the inseam of pants, the wheel size of a bicycle, or the gauge of a screw. Usually an exact measurement, but can also be a range of measurements for adjustable products, for example belts and ski bindings.
     */
    @NotNull public Builder hasMeasurement(@NotNull QuantitativeValue.Builder quantitativeValue) {
      putValue("hasMeasurement", quantitativeValue.build());
      return this;
    }
    /**
     * The amount of time that is required between accepting the offer and the actual usage of the resource or service.
     */
    @NotNull public Builder advanceBookingRequirement(@NotNull QuantitativeValue quantitativeValue) {
      putValue("advanceBookingRequirement", quantitativeValue);
      return this;
    }
    /**
     * The amount of time that is required between accepting the offer and the actual usage of the resource or service.
     */
    @NotNull public Builder advanceBookingRequirement(@NotNull QuantitativeValue.Builder quantitativeValue) {
      putValue("advanceBookingRequirement", quantitativeValue.build());
      return this;
    }
    /**
     * An additional offer that can only be obtained in combination with the first base offer (e.g. supplements and extensions that are available for a surcharge).
     */
    @NotNull public Builder addOn(@NotNull Offer offer) {
      putValue("addOn", offer);
      return this;
    }
    /**
     * An additional offer that can only be obtained in combination with the first base offer (e.g. supplements and extensions that are available for a surcharge).
     */
    @NotNull public Builder addOn(@NotNull Offer.Builder offer) {
      putValue("addOn", offer.build());
      return this;
    }
    /**
     * An item being offered (or demanded). The transactional nature of the offer or demand is documented using [[businessFunction]], e.g. sell, lease etc. While several common expected types are listed explicitly in this definition, others can be used. Using a second type, such as Product or a subtype of Product, can clarify the nature of the offer.
     */
    @NotNull public Builder itemOffered(@NotNull AggregateOffer aggregateOffer) {
      putValue("itemOffered", aggregateOffer);
      return this;
    }
    /**
     * An item being offered (or demanded). The transactional nature of the offer or demand is documented using [[businessFunction]], e.g. sell, lease etc. While several common expected types are listed explicitly in this definition, others can be used. Using a second type, such as Product or a subtype of Product, can clarify the nature of the offer.
     */
    @NotNull public Builder itemOffered(@NotNull AggregateOffer.Builder aggregateOffer) {
      putValue("itemOffered", aggregateOffer.build());
      return this;
    }
    /**
     * An item being offered (or demanded). The transactional nature of the offer or demand is documented using [[businessFunction]], e.g. sell, lease etc. While several common expected types are listed explicitly in this definition, others can be used. Using a second type, such as Product or a subtype of Product, can clarify the nature of the offer.
     */
    @NotNull public Builder itemOffered(@NotNull CreativeWork creativeWork) {
      putValue("itemOffered", creativeWork);
      return this;
    }
    /**
     * An item being offered (or demanded). The transactional nature of the offer or demand is documented using [[businessFunction]], e.g. sell, lease etc. While several common expected types are listed explicitly in this definition, others can be used. Using a second type, such as Product or a subtype of Product, can clarify the nature of the offer.
     */
    @NotNull public Builder itemOffered(@NotNull CreativeWork.Builder creativeWork) {
      putValue("itemOffered", creativeWork.build());
      return this;
    }
    /**
     * An item being offered (or demanded). The transactional nature of the offer or demand is documented using [[businessFunction]], e.g. sell, lease etc. While several common expected types are listed explicitly in this definition, others can be used. Using a second type, such as Product or a subtype of Product, can clarify the nature of the offer.
     */
    @NotNull public Builder itemOffered(@NotNull Event event) {
      putValue("itemOffered", event);
      return this;
    }
    /**
     * An item being offered (or demanded). The transactional nature of the offer or demand is documented using [[businessFunction]], e.g. sell, lease etc. While several common expected types are listed explicitly in this definition, others can be used. Using a second type, such as Product or a subtype of Product, can clarify the nature of the offer.
     */
    @NotNull public Builder itemOffered(@NotNull Event.Builder event) {
      putValue("itemOffered", event.build());
      return this;
    }
    /**
     * An item being offered (or demanded). The transactional nature of the offer or demand is documented using [[businessFunction]], e.g. sell, lease etc. While several common expected types are listed explicitly in this definition, others can be used. Using a second type, such as Product or a subtype of Product, can clarify the nature of the offer.
     */
    @NotNull public Builder itemOffered(@NotNull MenuItem menuItem) {
      putValue("itemOffered", menuItem);
      return this;
    }
    /**
     * An item being offered (or demanded). The transactional nature of the offer or demand is documented using [[businessFunction]], e.g. sell, lease etc. While several common expected types are listed explicitly in this definition, others can be used. Using a second type, such as Product or a subtype of Product, can clarify the nature of the offer.
     */
    @NotNull public Builder itemOffered(@NotNull MenuItem.Builder menuItem) {
      putValue("itemOffered", menuItem.build());
      return this;
    }
    /**
     * An item being offered (or demanded). The transactional nature of the offer or demand is documented using [[businessFunction]], e.g. sell, lease etc. While several common expected types are listed explicitly in this definition, others can be used. Using a second type, such as Product or a subtype of Product, can clarify the nature of the offer.
     */
    @NotNull public Builder itemOffered(@NotNull Product product) {
      putValue("itemOffered", product);
      return this;
    }
    /**
     * An item being offered (or demanded). The transactional nature of the offer or demand is documented using [[businessFunction]], e.g. sell, lease etc. While several common expected types are listed explicitly in this definition, others can be used. Using a second type, such as Product or a subtype of Product, can clarify the nature of the offer.
     */
    @NotNull public Builder itemOffered(@NotNull Product.Builder product) {
      putValue("itemOffered", product.build());
      return this;
    }
    /**
     * An item being offered (or demanded). The transactional nature of the offer or demand is documented using [[businessFunction]], e.g. sell, lease etc. While several common expected types are listed explicitly in this definition, others can be used. Using a second type, such as Product or a subtype of Product, can clarify the nature of the offer.
     */
    @NotNull public Builder itemOffered(@NotNull Service service) {
      putValue("itemOffered", service);
      return this;
    }
    /**
     * An item being offered (or demanded). The transactional nature of the offer or demand is documented using [[businessFunction]], e.g. sell, lease etc. While several common expected types are listed explicitly in this definition, others can be used. Using a second type, such as Product or a subtype of Product, can clarify the nature of the offer.
     */
    @NotNull public Builder itemOffered(@NotNull Service.Builder service) {
      putValue("itemOffered", service.build());
      return this;
    }
    /**
     * An item being offered (or demanded). The transactional nature of the offer or demand is documented using [[businessFunction]], e.g. sell, lease etc. While several common expected types are listed explicitly in this definition, others can be used. Using a second type, such as Product or a subtype of Product, can clarify the nature of the offer.
     */
    @NotNull public Builder itemOffered(@NotNull Trip trip) {
      putValue("itemOffered", trip);
      return this;
    }
    /**
     * An item being offered (or demanded). The transactional nature of the offer or demand is documented using [[businessFunction]], e.g. sell, lease etc. While several common expected types are listed explicitly in this definition, others can be used. Using a second type, such as Product or a subtype of Product, can clarify the nature of the offer.
     */
    @NotNull public Builder itemOffered(@NotNull Trip.Builder trip) {
      putValue("itemOffered", trip.build());
      return this;
    }
    /**
     * A pointer to the organization or person making the offer.
     */
    @NotNull public Builder offeredBy(@NotNull Organization organization) {
      putValue("offeredBy", organization);
      return this;
    }
    /**
     * A pointer to the organization or person making the offer.
     */
    @NotNull public Builder offeredBy(@NotNull Organization.Builder organization) {
      putValue("offeredBy", organization.build());
      return this;
    }
    /**
     * A pointer to the organization or person making the offer.
     */
    @NotNull public Builder offeredBy(@NotNull Person person) {
      putValue("offeredBy", person);
      return this;
    }
    /**
     * A pointer to the organization or person making the offer.
     */
    @NotNull public Builder offeredBy(@NotNull Person.Builder person) {
      putValue("offeredBy", person.build());
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
      if ("lowPrice".equals(key) && value instanceof Number) { this.lowPrice((Number)value); return; }
      if ("lowPrices".equals(key) && value instanceof Number) { this.lowPrice((Number)value); return; }
      if ("lowPrice".equals(key) && value instanceof String) { this.lowPrice((String)value); return; }
      if ("lowPrices".equals(key) && value instanceof String) { this.lowPrice((String)value); return; }
      if ("highPrice".equals(key) && value instanceof Number) { this.highPrice((Number)value); return; }
      if ("highPrices".equals(key) && value instanceof Number) { this.highPrice((Number)value); return; }
      if ("highPrice".equals(key) && value instanceof String) { this.highPrice((String)value); return; }
      if ("highPrices".equals(key) && value instanceof String) { this.highPrice((String)value); return; }
      if ("offerCount".equals(key) && value instanceof Integer) { this.offerCount((Integer)value); return; }
      if ("offerCounts".equals(key) && value instanceof Integer) { this.offerCount((Integer)value); return; }
      if ("offers".equals(key) && value instanceof Demand) { this.offers((Demand)value); return; }
      if ("offerss".equals(key) && value instanceof Demand) { this.offers((Demand)value); return; }
      if ("offers".equals(key) && value instanceof Offer) { this.offers((Offer)value); return; }
      if ("offerss".equals(key) && value instanceof Offer) { this.offers((Offer)value); return; }
      super.fromMap(key, value);
    }
  }
  
}
