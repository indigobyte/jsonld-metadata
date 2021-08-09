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
 * A demand entity represents the public, not necessarily binding, not necessarily exclusive, announcement by an organization or person to seek a certain type of goods or services. For describing demand using this type, the very same properties used for Offer apply.
 */
public class Demand extends Intangible {
  /**
   * The typical delay between the receipt of the order and the goods either leaving the warehouse or being prepared for pickup, in case the delivery method is on site pickup.
   * @return deliveryLeadTime property set by first invocation of deliveryLeadTime method or {@code null}.
   */
  @JsonIgnore public QuantitativeValue getDeliveryLeadTime() {
    return (QuantitativeValue) getValue("deliveryLeadTime");
  }
  /**
   * The typical delay between the receipt of the order and the goods either leaving the warehouse or being prepared for pickup, in case the delivery method is on site pickup.
   * @return all deliveryLeadTime properties as {@link java.util.Collection} or an empty collection 
   * if deliveryLeadTime was not set.
   */
  @JsonIgnore public java.util.Collection<QuantitativeValue> getDeliveryLeadTimes() {
    final java.lang.Object current = myData.get("deliveryLeadTime");
    if (current == null) return Collections.emptyList();
    if (current instanceof java.util.Collection) {
      return (java.util.Collection<QuantitativeValue>) current;
    }
    return Arrays.asList((QuantitativeValue) current);
  }
  /**
   * The end of the availability of the product or service included in the offer.
   * @return availabilityEnds property set by first invocation of availabilityEnds method or {@code null}.
   */
  @JsonIgnore public java.util.Date getAvailabilityEnds() {
    return (java.util.Date) getValue("availabilityEnds");
  }
  /**
   * The end of the availability of the product or service included in the offer.
   * @return all availabilityEnds properties as {@link java.util.Collection} or an empty collection 
   * if availabilityEnds was not set.
   */
  @JsonIgnore public java.util.Collection<java.util.Date> getAvailabilityEndss() {
    final java.lang.Object current = myData.get("availabilityEnds");
    if (current == null) return Collections.emptyList();
    if (current instanceof java.util.Collection) {
      return (java.util.Collection<java.util.Date>) current;
    }
    return Arrays.asList((java.util.Date) current);
  }
  /**
   * The date when the item becomes valid.
   * @return validFrom property set by first invocation of validFrom method or {@code null}.
   */
  @JsonIgnore public java.util.Date getValidFrom() {
    return (java.util.Date) getValue("validFrom");
  }
  /**
   * The date when the item becomes valid.
   * @return all validFrom properties as {@link java.util.Collection} or an empty collection 
   * if validFrom was not set.
   */
  @JsonIgnore public java.util.Collection<java.util.Date> getValidFroms() {
    final java.lang.Object current = myData.get("validFrom");
    if (current == null) return Collections.emptyList();
    if (current instanceof java.util.Collection) {
      return (java.util.Collection<java.util.Date>) current;
    }
    return Arrays.asList((java.util.Date) current);
  }
  /**
   * The current approximate inventory level for the item or items.
   * @return inventoryLevel property set by first invocation of inventoryLevel method or {@code null}.
   */
  @JsonIgnore public QuantitativeValue getInventoryLevel() {
    return (QuantitativeValue) getValue("inventoryLevel");
  }
  /**
   * The current approximate inventory level for the item or items.
   * @return all inventoryLevel properties as {@link java.util.Collection} or an empty collection 
   * if inventoryLevel was not set.
   */
  @JsonIgnore public java.util.Collection<QuantitativeValue> getInventoryLevels() {
    final java.lang.Object current = myData.get("inventoryLevel");
    if (current == null) return Collections.emptyList();
    if (current instanceof java.util.Collection) {
      return (java.util.Collection<QuantitativeValue>) current;
    }
    return Arrays.asList((QuantitativeValue) current);
  }
  /**
   * A Global Trade Item Number ([GTIN](https://www.gs1.org/standards/id-keys/gtin)). GTINs identify trade items, including products and services, using numeric identification codes. The [[gtin]] property generalizes the earlier [[gtin8]], [[gtin12]], [[gtin13]], and [[gtin14]] properties. The GS1 [digital link specifications](https://www.gs1.org/standards/Digital-Link/) express GTINs as URLs. A correct [[gtin]] value should be a valid GTIN, which means that it should be an all-numeric string of either 8, 12, 13 or 14 digits, or a &quot;GS1 Digital Link&quot; URL based on such a string. The numeric component should also have a [valid GS1 check digit](https://www.gs1.org/services/check-digit-calculator) and meet the other rules for valid GTINs. See also [GS1's GTIN Summary](http://www.gs1.org/barcodes/technical/idkeys/gtin) and [Wikipedia](https://en.wikipedia.org/wiki/Global_Trade_Item_Number) for more details. Left-padding of the gtin values is not required or encouraged.
   * 
   * @return gtin property set by first invocation of gtin method or {@code null}.
   */
  @JsonIgnore public Gtin getGtin() {
    return (Gtin) getValue("gtin");
  }
  /**
   * A Global Trade Item Number ([GTIN](https://www.gs1.org/standards/id-keys/gtin)). GTINs identify trade items, including products and services, using numeric identification codes. The [[gtin]] property generalizes the earlier [[gtin8]], [[gtin12]], [[gtin13]], and [[gtin14]] properties. The GS1 [digital link specifications](https://www.gs1.org/standards/Digital-Link/) express GTINs as URLs. A correct [[gtin]] value should be a valid GTIN, which means that it should be an all-numeric string of either 8, 12, 13 or 14 digits, or a &quot;GS1 Digital Link&quot; URL based on such a string. The numeric component should also have a [valid GS1 check digit](https://www.gs1.org/services/check-digit-calculator) and meet the other rules for valid GTINs. See also [GS1's GTIN Summary](http://www.gs1.org/barcodes/technical/idkeys/gtin) and [Wikipedia](https://en.wikipedia.org/wiki/Global_Trade_Item_Number) for more details. Left-padding of the gtin values is not required or encouraged.
   * 
   * @return all gtin properties as {@link java.util.Collection} or an empty collection 
   * if gtin was not set.
   */
  @JsonIgnore public java.util.Collection<Gtin> getGtins() {
    final java.lang.Object current = myData.get("gtin");
    if (current == null) return Collections.emptyList();
    if (current instanceof java.util.Collection) {
      return (java.util.Collection<Gtin>) current;
    }
    return Arrays.asList((Gtin) current);
  }
  /**
   * The GTIN-13 code of the product, or the product to which the offer refers. This is equivalent to 13-digit ISBN codes and EAN UCC-13. Former 12-digit UPC codes can be converted into a GTIN-13 code by simply adding a preceding zero. See [GS1 GTIN Summary](http://www.gs1.org/barcodes/technical/idkeys/gtin) for more details.
   * @return gtin13 property set by first invocation of gtin13 method or {@code null}.
   */
  @JsonIgnore public Gtin getGtin13() {
    return (Gtin) getValue("gtin13");
  }
  /**
   * The GTIN-13 code of the product, or the product to which the offer refers. This is equivalent to 13-digit ISBN codes and EAN UCC-13. Former 12-digit UPC codes can be converted into a GTIN-13 code by simply adding a preceding zero. See [GS1 GTIN Summary](http://www.gs1.org/barcodes/technical/idkeys/gtin) for more details.
   * @return all gtin13 properties as {@link java.util.Collection} or an empty collection 
   * if gtin13 was not set.
   */
  @JsonIgnore public java.util.Collection<Gtin> getGtin13s() {
    final java.lang.Object current = myData.get("gtin13");
    if (current == null) return Collections.emptyList();
    if (current instanceof java.util.Collection) {
      return (java.util.Collection<Gtin>) current;
    }
    return Arrays.asList((Gtin) current);
  }
  /**
   * The ISO 3166-1 (ISO 3166-1 alpha-2) or ISO 3166-2 code, the place, or the GeoShape for the geo-political region(s) for which the offer or delivery charge specification is not valid, e.g. a region where the transaction is not allowed.\n\nSee also [[eligibleRegion]].
   * 
   * @return ineligibleRegion property set by first invocation of ineligibleRegion method or {@code null}.
   */
  @JsonIgnore public GeoShape getIneligibleRegionGeoShape() {
    return (GeoShape) getValue("ineligibleRegion");
  }
  /**
   * The ISO 3166-1 (ISO 3166-1 alpha-2) or ISO 3166-2 code, the place, or the GeoShape for the geo-political region(s) for which the offer or delivery charge specification is not valid, e.g. a region where the transaction is not allowed.\n\nSee also [[eligibleRegion]].
   * 
   * @return all ineligibleRegion properties as {@link java.util.Collection} or an empty collection 
   * if ineligibleRegion was not set.
   */
  @JsonIgnore public java.util.Collection<GeoShape> getIneligibleRegionGeoShapes() {
    final java.lang.Object current = myData.get("ineligibleRegion");
    if (current == null) return Collections.emptyList();
    if (current instanceof java.util.Collection) {
      return (java.util.Collection<GeoShape>) current;
    }
    return Arrays.asList((GeoShape) current);
  }
  /**
   * The ISO 3166-1 (ISO 3166-1 alpha-2) or ISO 3166-2 code, the place, or the GeoShape for the geo-political region(s) for which the offer or delivery charge specification is not valid, e.g. a region where the transaction is not allowed.\n\nSee also [[eligibleRegion]].
   * 
   * @return ineligibleRegion property set by first invocation of ineligibleRegion method or {@code null}.
   */
  @JsonIgnore public Place getIneligibleRegionPlace() {
    return (Place) getValue("ineligibleRegion");
  }
  /**
   * The ISO 3166-1 (ISO 3166-1 alpha-2) or ISO 3166-2 code, the place, or the GeoShape for the geo-political region(s) for which the offer or delivery charge specification is not valid, e.g. a region where the transaction is not allowed.\n\nSee also [[eligibleRegion]].
   * 
   * @return all ineligibleRegion properties as {@link java.util.Collection} or an empty collection 
   * if ineligibleRegion was not set.
   */
  @JsonIgnore public java.util.Collection<Place> getIneligibleRegionPlaces() {
    final java.lang.Object current = myData.get("ineligibleRegion");
    if (current == null) return Collections.emptyList();
    if (current instanceof java.util.Collection) {
      return (java.util.Collection<Place>) current;
    }
    return Arrays.asList((Place) current);
  }
  /**
   * The ISO 3166-1 (ISO 3166-1 alpha-2) or ISO 3166-2 code, the place, or the GeoShape for the geo-political region(s) for which the offer or delivery charge specification is not valid, e.g. a region where the transaction is not allowed.\n\nSee also [[eligibleRegion]].
   * 
   * @return ineligibleRegion property set by first invocation of ineligibleRegion method or {@code null}.
   */
  @JsonIgnore public String getIneligibleRegionString() {
    return (String) getValue("ineligibleRegion");
  }
  /**
   * The ISO 3166-1 (ISO 3166-1 alpha-2) or ISO 3166-2 code, the place, or the GeoShape for the geo-political region(s) for which the offer or delivery charge specification is not valid, e.g. a region where the transaction is not allowed.\n\nSee also [[eligibleRegion]].
   * 
   * @return all ineligibleRegion properties as {@link java.util.Collection} or an empty collection 
   * if ineligibleRegion was not set.
   */
  @JsonIgnore public java.util.Collection<String> getIneligibleRegionStrings() {
    final java.lang.Object current = myData.get("ineligibleRegion");
    if (current == null) return Collections.emptyList();
    if (current instanceof java.util.Collection) {
      return (java.util.Collection<String>) current;
    }
    return Arrays.asList((String) current);
  }
  /**
   * The GTIN-14 code of the product, or the product to which the offer refers. See [GS1 GTIN Summary](http://www.gs1.org/barcodes/technical/idkeys/gtin) for more details.
   * @return gtin14 property set by first invocation of gtin14 method or {@code null}.
   */
  @JsonIgnore public Identifier getGtin14() {
    return (Identifier) getValue("gtin14");
  }
  /**
   * The GTIN-14 code of the product, or the product to which the offer refers. See [GS1 GTIN Summary](http://www.gs1.org/barcodes/technical/idkeys/gtin) for more details.
   * @return all gtin14 properties as {@link java.util.Collection} or an empty collection 
   * if gtin14 was not set.
   */
  @JsonIgnore public java.util.Collection<Identifier> getGtin14s() {
    final java.lang.Object current = myData.get("gtin14");
    if (current == null) return Collections.emptyList();
    if (current instanceof java.util.Collection) {
      return (java.util.Collection<Identifier>) current;
    }
    return Arrays.asList((Identifier) current);
  }
  /**
   * A predefined value from OfferItemCondition specifying the condition of the product or service, or the products or services included in the offer. Also used for product return policies to specify the condition of products accepted for returns.
   * @return itemCondition property set by first invocation of itemCondition method or {@code null}.
   */
  @JsonIgnore public OfferItemCondition getItemCondition() {
    return (OfferItemCondition) getValue("itemCondition");
  }
  /**
   * A predefined value from OfferItemCondition specifying the condition of the product or service, or the products or services included in the offer. Also used for product return policies to specify the condition of products accepted for returns.
   * @return all itemCondition properties as {@link java.util.Collection} or an empty collection 
   * if itemCondition was not set.
   */
  @JsonIgnore public java.util.Collection<OfferItemCondition> getItemConditions() {
    final java.lang.Object current = myData.get("itemCondition");
    if (current == null) return Collections.emptyList();
    if (current instanceof java.util.Collection) {
      return (java.util.Collection<OfferItemCondition>) current;
    }
    return Arrays.asList((OfferItemCondition) current);
  }
  /**
   * One or more detailed price specifications, indicating the unit price and delivery or payment charges.
   * @return priceSpecification property set by first invocation of priceSpecification method or {@code null}.
   */
  @JsonIgnore public PriceSpecification getPriceSpecification() {
    return (PriceSpecification) getValue("priceSpecification");
  }
  /**
   * One or more detailed price specifications, indicating the unit price and delivery or payment charges.
   * @return all priceSpecification properties as {@link java.util.Collection} or an empty collection 
   * if priceSpecification was not set.
   */
  @JsonIgnore public java.util.Collection<PriceSpecification> getPriceSpecifications() {
    final java.lang.Object current = myData.get("priceSpecification");
    if (current == null) return Collections.emptyList();
    if (current instanceof java.util.Collection) {
      return (java.util.Collection<PriceSpecification>) current;
    }
    return Arrays.asList((PriceSpecification) current);
  }
  /**
   * The Manufacturer Part Number (MPN) of the product, or the product to which the offer refers.
   * @return mpn property set by first invocation of mpn method or {@code null}.
   */
  @JsonIgnore public String getMpn() {
    return (String) getValue("mpn");
  }
  /**
   * The Manufacturer Part Number (MPN) of the product, or the product to which the offer refers.
   * @return all mpn properties as {@link java.util.Collection} or an empty collection 
   * if mpn was not set.
   */
  @JsonIgnore public java.util.Collection<String> getMpns() {
    final java.lang.Object current = myData.get("mpn");
    if (current == null) return Collections.emptyList();
    if (current instanceof java.util.Collection) {
      return (java.util.Collection<String>) current;
    }
    return Arrays.asList((String) current);
  }
  /**
   * The type(s) of customers for which the given offer is valid.
   * @return eligibleCustomerType property set by first invocation of eligibleCustomerType method or {@code null}.
   */
  @JsonIgnore public BusinessEntityType getEligibleCustomerType() {
    return (BusinessEntityType) getValue("eligibleCustomerType");
  }
  /**
   * The type(s) of customers for which the given offer is valid.
   * @return all eligibleCustomerType properties as {@link java.util.Collection} or an empty collection 
   * if eligibleCustomerType was not set.
   */
  @JsonIgnore public java.util.Collection<BusinessEntityType> getEligibleCustomerTypes() {
    final java.lang.Object current = myData.get("eligibleCustomerType");
    if (current == null) return Collections.emptyList();
    if (current instanceof java.util.Collection) {
      return (java.util.Collection<BusinessEntityType>) current;
    }
    return Arrays.asList((BusinessEntityType) current);
  }
  /**
   * The payment method(s) accepted by seller for this offer.
   * @return acceptedPaymentMethod property set by first invocation of acceptedPaymentMethod method or {@code null}.
   */
  @JsonIgnore public LoanOrCredit getAcceptedPaymentMethodLoanOrCredit() {
    return (LoanOrCredit) getValue("acceptedPaymentMethod");
  }
  /**
   * The payment method(s) accepted by seller for this offer.
   * @return all acceptedPaymentMethod properties as {@link java.util.Collection} or an empty collection 
   * if acceptedPaymentMethod was not set.
   */
  @JsonIgnore public java.util.Collection<LoanOrCredit> getAcceptedPaymentMethodLoanOrCredits() {
    final java.lang.Object current = myData.get("acceptedPaymentMethod");
    if (current == null) return Collections.emptyList();
    if (current instanceof java.util.Collection) {
      return (java.util.Collection<LoanOrCredit>) current;
    }
    return Arrays.asList((LoanOrCredit) current);
  }
  /**
   * The payment method(s) accepted by seller for this offer.
   * @return acceptedPaymentMethod property set by first invocation of acceptedPaymentMethod method or {@code null}.
   */
  @JsonIgnore public PaymentMethod getAcceptedPaymentMethodPaymentMethod() {
    return (PaymentMethod) getValue("acceptedPaymentMethod");
  }
  /**
   * The payment method(s) accepted by seller for this offer.
   * @return all acceptedPaymentMethod properties as {@link java.util.Collection} or an empty collection 
   * if acceptedPaymentMethod was not set.
   */
  @JsonIgnore public java.util.Collection<PaymentMethod> getAcceptedPaymentMethodPaymentMethods() {
    final java.lang.Object current = myData.get("acceptedPaymentMethod");
    if (current == null) return Collections.emptyList();
    if (current instanceof java.util.Collection) {
      return (java.util.Collection<PaymentMethod>) current;
    }
    return Arrays.asList((PaymentMethod) current);
  }
  /**
   * This links to a node or nodes indicating the exact quantity of the products included in  an [[Offer]] or [[ProductCollection]].
   * @return includesObject property set by first invocation of includesObject method or {@code null}.
   */
  @JsonIgnore public TypeAndQuantityNode getIncludesObject() {
    return (TypeAndQuantityNode) getValue("includesObject");
  }
  /**
   * This links to a node or nodes indicating the exact quantity of the products included in  an [[Offer]] or [[ProductCollection]].
   * @return all includesObject properties as {@link java.util.Collection} or an empty collection 
   * if includesObject was not set.
   */
  @JsonIgnore public java.util.Collection<TypeAndQuantityNode> getIncludesObjects() {
    final java.lang.Object current = myData.get("includesObject");
    if (current == null) return Collections.emptyList();
    if (current instanceof java.util.Collection) {
      return (java.util.Collection<TypeAndQuantityNode>) current;
    }
    return Arrays.asList((TypeAndQuantityNode) current);
  }
  /**
   * The GTIN-12 code of the product, or the product to which the offer refers. The GTIN-12 is the 12-digit GS1 Identification Key composed of a U.P.C. Company Prefix, Item Reference, and Check Digit used to identify trade items. See [GS1 GTIN Summary](http://www.gs1.org/barcodes/technical/idkeys/gtin) for more details.
   * @return gtin12 property set by first invocation of gtin12 method or {@code null}.
   */
  @JsonIgnore public Identifier getGtin12() {
    return (Identifier) getValue("gtin12");
  }
  /**
   * The GTIN-12 code of the product, or the product to which the offer refers. The GTIN-12 is the 12-digit GS1 Identification Key composed of a U.P.C. Company Prefix, Item Reference, and Check Digit used to identify trade items. See [GS1 GTIN Summary](http://www.gs1.org/barcodes/technical/idkeys/gtin) for more details.
   * @return all gtin12 properties as {@link java.util.Collection} or an empty collection 
   * if gtin12 was not set.
   */
  @JsonIgnore public java.util.Collection<Identifier> getGtin12s() {
    final java.lang.Object current = myData.get("gtin12");
    if (current == null) return Collections.emptyList();
    if (current instanceof java.util.Collection) {
      return (java.util.Collection<Identifier>) current;
    }
    return Arrays.asList((Identifier) current);
  }
  /**
   * The Stock Keeping Unit (SKU), i.e. a merchant-specific identifier for a product or service, or the product to which the offer refers.
   * @return sku property set by first invocation of sku method or {@code null}.
   */
  @JsonIgnore public Identifier getSku() {
    return (Identifier) getValue("sku");
  }
  /**
   * The Stock Keeping Unit (SKU), i.e. a merchant-specific identifier for a product or service, or the product to which the offer refers.
   * @return all sku properties as {@link java.util.Collection} or an empty collection 
   * if sku was not set.
   */
  @JsonIgnore public java.util.Collection<Identifier> getSkus() {
    final java.lang.Object current = myData.get("sku");
    if (current == null) return Collections.emptyList();
    if (current instanceof java.util.Collection) {
      return (java.util.Collection<Identifier>) current;
    }
    return Arrays.asList((Identifier) current);
  }
  /**
   * The interval and unit of measurement of ordering quantities for which the offer or price specification is valid. This allows e.g. specifying that a certain freight charge is valid only for a certain quantity.
   * @return eligibleQuantity property set by first invocation of eligibleQuantity method or {@code null}.
   */
  @JsonIgnore public QuantitativeValue getEligibleQuantity() {
    return (QuantitativeValue) getValue("eligibleQuantity");
  }
  /**
   * The interval and unit of measurement of ordering quantities for which the offer or price specification is valid. This allows e.g. specifying that a certain freight charge is valid only for a certain quantity.
   * @return all eligibleQuantity properties as {@link java.util.Collection} or an empty collection 
   * if eligibleQuantity was not set.
   */
  @JsonIgnore public java.util.Collection<QuantitativeValue> getEligibleQuantitys() {
    final java.lang.Object current = myData.get("eligibleQuantity");
    if (current == null) return Collections.emptyList();
    if (current instanceof java.util.Collection) {
      return (java.util.Collection<QuantitativeValue>) current;
    }
    return Arrays.asList((QuantitativeValue) current);
  }
  /**
   * The warranty promise(s) included in the offer.
   * @return warranty property set by first invocation of warranty method or {@code null}.
   */
  @JsonIgnore public WarrantyPromise getWarranty() {
    return (WarrantyPromise) getValue("warranty");
  }
  /**
   * The warranty promise(s) included in the offer.
   * @return all warranty properties as {@link java.util.Collection} or an empty collection 
   * if warranty was not set.
   */
  @JsonIgnore public java.util.Collection<WarrantyPromise> getWarrantys() {
    final java.lang.Object current = myData.get("warranty");
    if (current == null) return Collections.emptyList();
    if (current instanceof java.util.Collection) {
      return (java.util.Collection<WarrantyPromise>) current;
    }
    return Arrays.asList((WarrantyPromise) current);
  }
  /**
   * The geographic area where a service or offered item is provided.
   * @return areaServed property set by first invocation of areaServed method or {@code null}.
   */
  @JsonIgnore public AreaServed getAreaServed() {
    return (AreaServed) getValue("areaServed");
  }
  /**
   * The geographic area where a service or offered item is provided.
   * @return all areaServed properties as {@link java.util.Collection} or an empty collection 
   * if areaServed was not set.
   */
  @JsonIgnore public java.util.Collection<AreaServed> getAreaServeds() {
    final java.lang.Object current = myData.get("areaServed");
    if (current == null) return Collections.emptyList();
    if (current instanceof java.util.Collection) {
      return (java.util.Collection<AreaServed>) current;
    }
    return Arrays.asList((AreaServed) current);
  }
  /**
   * The place(s) from which the offer can be obtained (e.g. store locations).
   * @return availableAtOrFrom property set by first invocation of availableAtOrFrom method or {@code null}.
   */
  @JsonIgnore public AreaServed getAvailableAtOrFrom() {
    return (AreaServed) getValue("availableAtOrFrom");
  }
  /**
   * The place(s) from which the offer can be obtained (e.g. store locations).
   * @return all availableAtOrFrom properties as {@link java.util.Collection} or an empty collection 
   * if availableAtOrFrom was not set.
   */
  @JsonIgnore public java.util.Collection<AreaServed> getAvailableAtOrFroms() {
    final java.lang.Object current = myData.get("availableAtOrFrom");
    if (current == null) return Collections.emptyList();
    if (current instanceof java.util.Collection) {
      return (java.util.Collection<AreaServed>) current;
    }
    return Arrays.asList((AreaServed) current);
  }
  /**
   * The date after when the item is not valid. For example the end of an offer, salary period, or a period of opening hours.
   * @return validThrough property set by first invocation of validThrough method or {@code null}.
   */
  @JsonIgnore public java.util.Date getValidThrough() {
    return (java.util.Date) getValue("validThrough");
  }
  /**
   * The date after when the item is not valid. For example the end of an offer, salary period, or a period of opening hours.
   * @return all validThrough properties as {@link java.util.Collection} or an empty collection 
   * if validThrough was not set.
   */
  @JsonIgnore public java.util.Collection<java.util.Date> getValidThroughs() {
    final java.lang.Object current = myData.get("validThrough");
    if (current == null) return Collections.emptyList();
    if (current instanceof java.util.Collection) {
      return (java.util.Collection<java.util.Date>) current;
    }
    return Arrays.asList((java.util.Date) current);
  }
  /**
   * The delivery method(s) available for this offer.
   * @return availableDeliveryMethod property set by first invocation of availableDeliveryMethod method or {@code null}.
   */
  @JsonIgnore public DeliveryMethod getAvailableDeliveryMethod() {
    return (DeliveryMethod) getValue("availableDeliveryMethod");
  }
  /**
   * The delivery method(s) available for this offer.
   * @return all availableDeliveryMethod properties as {@link java.util.Collection} or an empty collection 
   * if availableDeliveryMethod was not set.
   */
  @JsonIgnore public java.util.Collection<DeliveryMethod> getAvailableDeliveryMethods() {
    final java.lang.Object current = myData.get("availableDeliveryMethod");
    if (current == null) return Collections.emptyList();
    if (current instanceof java.util.Collection) {
      return (java.util.Collection<DeliveryMethod>) current;
    }
    return Arrays.asList((DeliveryMethod) current);
  }
  /**
   * The ISO 3166-1 (ISO 3166-1 alpha-2) or ISO 3166-2 code, the place, or the GeoShape for the geo-political region(s) for which the offer or delivery charge specification is valid.\n\nSee also [[ineligibleRegion]].
   * 
   * @return eligibleRegion property set by first invocation of eligibleRegion method or {@code null}.
   */
  @JsonIgnore public AreaServed getEligibleRegion() {
    return (AreaServed) getValue("eligibleRegion");
  }
  /**
   * The ISO 3166-1 (ISO 3166-1 alpha-2) or ISO 3166-2 code, the place, or the GeoShape for the geo-political region(s) for which the offer or delivery charge specification is valid.\n\nSee also [[ineligibleRegion]].
   * 
   * @return all eligibleRegion properties as {@link java.util.Collection} or an empty collection 
   * if eligibleRegion was not set.
   */
  @JsonIgnore public java.util.Collection<AreaServed> getEligibleRegions() {
    final java.lang.Object current = myData.get("eligibleRegion");
    if (current == null) return Collections.emptyList();
    if (current instanceof java.util.Collection) {
      return (java.util.Collection<AreaServed>) current;
    }
    return Arrays.asList((AreaServed) current);
  }
  /**
   * The transaction volume, in a monetary unit, for which the offer or price specification is valid, e.g. for indicating a minimal purchasing volume, to express free shipping above a certain order volume, or to limit the acceptance of credit cards to purchases to a certain minimal amount.
   * @return eligibleTransactionVolume property set by first invocation of eligibleTransactionVolume method or {@code null}.
   */
  @JsonIgnore public PriceSpecification getEligibleTransactionVolume() {
    return (PriceSpecification) getValue("eligibleTransactionVolume");
  }
  /**
   * The transaction volume, in a monetary unit, for which the offer or price specification is valid, e.g. for indicating a minimal purchasing volume, to express free shipping above a certain order volume, or to limit the acceptance of credit cards to purchases to a certain minimal amount.
   * @return all eligibleTransactionVolume properties as {@link java.util.Collection} or an empty collection 
   * if eligibleTransactionVolume was not set.
   */
  @JsonIgnore public java.util.Collection<PriceSpecification> getEligibleTransactionVolumes() {
    final java.lang.Object current = myData.get("eligibleTransactionVolume");
    if (current == null) return Collections.emptyList();
    if (current instanceof java.util.Collection) {
      return (java.util.Collection<PriceSpecification>) current;
    }
    return Arrays.asList((PriceSpecification) current);
  }
  /**
   * The serial number or any alphanumeric identifier of a particular product. When attached to an offer, it is a shortcut for the serial number of the product included in the offer.
   * @return serialNumber property set by first invocation of serialNumber method or {@code null}.
   */
  @JsonIgnore public SerialNumber getSerialNumber() {
    return (SerialNumber) getValue("serialNumber");
  }
  /**
   * The serial number or any alphanumeric identifier of a particular product. When attached to an offer, it is a shortcut for the serial number of the product included in the offer.
   * @return all serialNumber properties as {@link java.util.Collection} or an empty collection 
   * if serialNumber was not set.
   */
  @JsonIgnore public java.util.Collection<SerialNumber> getSerialNumbers() {
    final java.lang.Object current = myData.get("serialNumber");
    if (current == null) return Collections.emptyList();
    if (current instanceof java.util.Collection) {
      return (java.util.Collection<SerialNumber>) current;
    }
    return Arrays.asList((SerialNumber) current);
  }
  /**
   * The business function (e.g. sell, lease, repair, dispose) of the offer or component of a bundle (TypeAndQuantityNode). The default is http://purl.org/goodrelations/v1#Sell.
   * @return businessFunction property set by first invocation of businessFunction method or {@code null}.
   */
  @JsonIgnore public BusinessFunction getBusinessFunction() {
    return (BusinessFunction) getValue("businessFunction");
  }
  /**
   * The business function (e.g. sell, lease, repair, dispose) of the offer or component of a bundle (TypeAndQuantityNode). The default is http://purl.org/goodrelations/v1#Sell.
   * @return all businessFunction properties as {@link java.util.Collection} or an empty collection 
   * if businessFunction was not set.
   */
  @JsonIgnore public java.util.Collection<BusinessFunction> getBusinessFunctions() {
    final java.lang.Object current = myData.get("businessFunction");
    if (current == null) return Collections.emptyList();
    if (current instanceof java.util.Collection) {
      return (java.util.Collection<BusinessFunction>) current;
    }
    return Arrays.asList((BusinessFunction) current);
  }
  /**
   * The availability of this item&amp;#x2014;for example In stock, Out of stock, Pre-order, etc.
   * @return availability property set by first invocation of availability method or {@code null}.
   */
  @JsonIgnore public ItemAvailability getAvailability() {
    return (ItemAvailability) getValue("availability");
  }
  /**
   * The availability of this item&amp;#x2014;for example In stock, Out of stock, Pre-order, etc.
   * @return all availability properties as {@link java.util.Collection} or an empty collection 
   * if availability was not set.
   */
  @JsonIgnore public java.util.Collection<ItemAvailability> getAvailabilitys() {
    final java.lang.Object current = myData.get("availability");
    if (current == null) return Collections.emptyList();
    if (current instanceof java.util.Collection) {
      return (java.util.Collection<ItemAvailability>) current;
    }
    return Arrays.asList((ItemAvailability) current);
  }
  /**
   * An entity which offers (sells / leases / lends / loans) the services / goods.  A seller may also be a provider.
   * @return seller property set by first invocation of seller method or {@code null}.
   */
  @JsonIgnore public Participant getSeller() {
    return (Participant) getValue("seller");
  }
  /**
   * An entity which offers (sells / leases / lends / loans) the services / goods.  A seller may also be a provider.
   * @return all seller properties as {@link java.util.Collection} or an empty collection 
   * if seller was not set.
   */
  @JsonIgnore public java.util.Collection<Participant> getSellers() {
    final java.lang.Object current = myData.get("seller");
    if (current == null) return Collections.emptyList();
    if (current instanceof java.util.Collection) {
      return (java.util.Collection<Participant>) current;
    }
    return Arrays.asList((Participant) current);
  }
  /**
   * The GTIN-8 code of the product, or the product to which the offer refers. This code is also known as EAN/UCC-8 or 8-digit EAN. See [GS1 GTIN Summary](http://www.gs1.org/barcodes/technical/idkeys/gtin) for more details.
   * @return gtin8 property set by first invocation of gtin8 method or {@code null}.
   */
  @JsonIgnore public Gtin getGtin8() {
    return (Gtin) getValue("gtin8");
  }
  /**
   * The GTIN-8 code of the product, or the product to which the offer refers. This code is also known as EAN/UCC-8 or 8-digit EAN. See [GS1 GTIN Summary](http://www.gs1.org/barcodes/technical/idkeys/gtin) for more details.
   * @return all gtin8 properties as {@link java.util.Collection} or an empty collection 
   * if gtin8 was not set.
   */
  @JsonIgnore public java.util.Collection<Gtin> getGtin8s() {
    final java.lang.Object current = myData.get("gtin8");
    if (current == null) return Collections.emptyList();
    if (current instanceof java.util.Collection) {
      return (java.util.Collection<Gtin>) current;
    }
    return Arrays.asList((Gtin) current);
  }
  /**
   * The duration for which the given offer is valid.
   * @return eligibleDuration property set by first invocation of eligibleDuration method or {@code null}.
   */
  @JsonIgnore public QuantitativeValue getEligibleDuration() {
    return (QuantitativeValue) getValue("eligibleDuration");
  }
  /**
   * The duration for which the given offer is valid.
   * @return all eligibleDuration properties as {@link java.util.Collection} or an empty collection 
   * if eligibleDuration was not set.
   */
  @JsonIgnore public java.util.Collection<QuantitativeValue> getEligibleDurations() {
    final java.lang.Object current = myData.get("eligibleDuration");
    if (current == null) return Collections.emptyList();
    if (current instanceof java.util.Collection) {
      return (java.util.Collection<QuantitativeValue>) current;
    }
    return Arrays.asList((QuantitativeValue) current);
  }
  /**
   * The beginning of the availability of the product or service included in the offer.
   * @return availabilityStarts property set by first invocation of availabilityStarts method or {@code null}.
   */
  @JsonIgnore public java.util.Date getAvailabilityStarts() {
    return (java.util.Date) getValue("availabilityStarts");
  }
  /**
   * The beginning of the availability of the product or service included in the offer.
   * @return all availabilityStarts properties as {@link java.util.Collection} or an empty collection 
   * if availabilityStarts was not set.
   */
  @JsonIgnore public java.util.Collection<java.util.Date> getAvailabilityStartss() {
    final java.lang.Object current = myData.get("availabilityStarts");
    if (current == null) return Collections.emptyList();
    if (current instanceof java.util.Collection) {
      return (java.util.Collection<java.util.Date>) current;
    }
    return Arrays.asList((java.util.Date) current);
  }
  /**
   * The amount of time that is required between accepting the offer and the actual usage of the resource or service.
   * @return advanceBookingRequirement property set by first invocation of advanceBookingRequirement method or {@code null}.
   */
  @JsonIgnore public QuantitativeValue getAdvanceBookingRequirement() {
    return (QuantitativeValue) getValue("advanceBookingRequirement");
  }
  /**
   * The amount of time that is required between accepting the offer and the actual usage of the resource or service.
   * @return all advanceBookingRequirement properties as {@link java.util.Collection} or an empty collection 
   * if advanceBookingRequirement was not set.
   */
  @JsonIgnore public java.util.Collection<QuantitativeValue> getAdvanceBookingRequirements() {
    final java.lang.Object current = myData.get("advanceBookingRequirement");
    if (current == null) return Collections.emptyList();
    if (current instanceof java.util.Collection) {
      return (java.util.Collection<QuantitativeValue>) current;
    }
    return Arrays.asList((QuantitativeValue) current);
  }
  /**
   * An item being offered (or demanded). The transactional nature of the offer or demand is documented using [[businessFunction]], e.g. sell, lease etc. While several common expected types are listed explicitly in this definition, others can be used. Using a second type, such as Product or a subtype of Product, can clarify the nature of the offer.
   * @return itemOffered property set by first invocation of itemOffered method or {@code null}.
   */
  @JsonIgnore public AggregateOffer getItemOfferedAggregateOffer() {
    return (AggregateOffer) getValue("itemOffered");
  }
  /**
   * An item being offered (or demanded). The transactional nature of the offer or demand is documented using [[businessFunction]], e.g. sell, lease etc. While several common expected types are listed explicitly in this definition, others can be used. Using a second type, such as Product or a subtype of Product, can clarify the nature of the offer.
   * @return all itemOffered properties as {@link java.util.Collection} or an empty collection 
   * if itemOffered was not set.
   */
  @JsonIgnore public java.util.Collection<AggregateOffer> getItemOfferedAggregateOffers() {
    final java.lang.Object current = myData.get("itemOffered");
    if (current == null) return Collections.emptyList();
    if (current instanceof java.util.Collection) {
      return (java.util.Collection<AggregateOffer>) current;
    }
    return Arrays.asList((AggregateOffer) current);
  }
  /**
   * An item being offered (or demanded). The transactional nature of the offer or demand is documented using [[businessFunction]], e.g. sell, lease etc. While several common expected types are listed explicitly in this definition, others can be used. Using a second type, such as Product or a subtype of Product, can clarify the nature of the offer.
   * @return itemOffered property set by first invocation of itemOffered method or {@code null}.
   */
  @JsonIgnore public CreativeWork getItemOfferedCreativeWork() {
    return (CreativeWork) getValue("itemOffered");
  }
  /**
   * An item being offered (or demanded). The transactional nature of the offer or demand is documented using [[businessFunction]], e.g. sell, lease etc. While several common expected types are listed explicitly in this definition, others can be used. Using a second type, such as Product or a subtype of Product, can clarify the nature of the offer.
   * @return all itemOffered properties as {@link java.util.Collection} or an empty collection 
   * if itemOffered was not set.
   */
  @JsonIgnore public java.util.Collection<CreativeWork> getItemOfferedCreativeWorks() {
    final java.lang.Object current = myData.get("itemOffered");
    if (current == null) return Collections.emptyList();
    if (current instanceof java.util.Collection) {
      return (java.util.Collection<CreativeWork>) current;
    }
    return Arrays.asList((CreativeWork) current);
  }
  /**
   * An item being offered (or demanded). The transactional nature of the offer or demand is documented using [[businessFunction]], e.g. sell, lease etc. While several common expected types are listed explicitly in this definition, others can be used. Using a second type, such as Product or a subtype of Product, can clarify the nature of the offer.
   * @return itemOffered property set by first invocation of itemOffered method or {@code null}.
   */
  @JsonIgnore public Event getItemOfferedEvent() {
    return (Event) getValue("itemOffered");
  }
  /**
   * An item being offered (or demanded). The transactional nature of the offer or demand is documented using [[businessFunction]], e.g. sell, lease etc. While several common expected types are listed explicitly in this definition, others can be used. Using a second type, such as Product or a subtype of Product, can clarify the nature of the offer.
   * @return all itemOffered properties as {@link java.util.Collection} or an empty collection 
   * if itemOffered was not set.
   */
  @JsonIgnore public java.util.Collection<Event> getItemOfferedEvents() {
    final java.lang.Object current = myData.get("itemOffered");
    if (current == null) return Collections.emptyList();
    if (current instanceof java.util.Collection) {
      return (java.util.Collection<Event>) current;
    }
    return Arrays.asList((Event) current);
  }
  /**
   * An item being offered (or demanded). The transactional nature of the offer or demand is documented using [[businessFunction]], e.g. sell, lease etc. While several common expected types are listed explicitly in this definition, others can be used. Using a second type, such as Product or a subtype of Product, can clarify the nature of the offer.
   * @return itemOffered property set by first invocation of itemOffered method or {@code null}.
   */
  @JsonIgnore public MenuItem getItemOfferedMenuItem() {
    return (MenuItem) getValue("itemOffered");
  }
  /**
   * An item being offered (or demanded). The transactional nature of the offer or demand is documented using [[businessFunction]], e.g. sell, lease etc. While several common expected types are listed explicitly in this definition, others can be used. Using a second type, such as Product or a subtype of Product, can clarify the nature of the offer.
   * @return all itemOffered properties as {@link java.util.Collection} or an empty collection 
   * if itemOffered was not set.
   */
  @JsonIgnore public java.util.Collection<MenuItem> getItemOfferedMenuItems() {
    final java.lang.Object current = myData.get("itemOffered");
    if (current == null) return Collections.emptyList();
    if (current instanceof java.util.Collection) {
      return (java.util.Collection<MenuItem>) current;
    }
    return Arrays.asList((MenuItem) current);
  }
  /**
   * An item being offered (or demanded). The transactional nature of the offer or demand is documented using [[businessFunction]], e.g. sell, lease etc. While several common expected types are listed explicitly in this definition, others can be used. Using a second type, such as Product or a subtype of Product, can clarify the nature of the offer.
   * @return itemOffered property set by first invocation of itemOffered method or {@code null}.
   */
  @JsonIgnore public Product getItemOfferedProduct() {
    return (Product) getValue("itemOffered");
  }
  /**
   * An item being offered (or demanded). The transactional nature of the offer or demand is documented using [[businessFunction]], e.g. sell, lease etc. While several common expected types are listed explicitly in this definition, others can be used. Using a second type, such as Product or a subtype of Product, can clarify the nature of the offer.
   * @return all itemOffered properties as {@link java.util.Collection} or an empty collection 
   * if itemOffered was not set.
   */
  @JsonIgnore public java.util.Collection<Product> getItemOfferedProducts() {
    final java.lang.Object current = myData.get("itemOffered");
    if (current == null) return Collections.emptyList();
    if (current instanceof java.util.Collection) {
      return (java.util.Collection<Product>) current;
    }
    return Arrays.asList((Product) current);
  }
  /**
   * An item being offered (or demanded). The transactional nature of the offer or demand is documented using [[businessFunction]], e.g. sell, lease etc. While several common expected types are listed explicitly in this definition, others can be used. Using a second type, such as Product or a subtype of Product, can clarify the nature of the offer.
   * @return itemOffered property set by first invocation of itemOffered method or {@code null}.
   */
  @JsonIgnore public Service getItemOfferedService() {
    return (Service) getValue("itemOffered");
  }
  /**
   * An item being offered (or demanded). The transactional nature of the offer or demand is documented using [[businessFunction]], e.g. sell, lease etc. While several common expected types are listed explicitly in this definition, others can be used. Using a second type, such as Product or a subtype of Product, can clarify the nature of the offer.
   * @return all itemOffered properties as {@link java.util.Collection} or an empty collection 
   * if itemOffered was not set.
   */
  @JsonIgnore public java.util.Collection<Service> getItemOfferedServices() {
    final java.lang.Object current = myData.get("itemOffered");
    if (current == null) return Collections.emptyList();
    if (current instanceof java.util.Collection) {
      return (java.util.Collection<Service>) current;
    }
    return Arrays.asList((Service) current);
  }
  /**
   * An item being offered (or demanded). The transactional nature of the offer or demand is documented using [[businessFunction]], e.g. sell, lease etc. While several common expected types are listed explicitly in this definition, others can be used. Using a second type, such as Product or a subtype of Product, can clarify the nature of the offer.
   * @return itemOffered property set by first invocation of itemOffered method or {@code null}.
   */
  @JsonIgnore public Trip getItemOfferedTrip() {
    return (Trip) getValue("itemOffered");
  }
  /**
   * An item being offered (or demanded). The transactional nature of the offer or demand is documented using [[businessFunction]], e.g. sell, lease etc. While several common expected types are listed explicitly in this definition, others can be used. Using a second type, such as Product or a subtype of Product, can clarify the nature of the offer.
   * @return all itemOffered properties as {@link java.util.Collection} or an empty collection 
   * if itemOffered was not set.
   */
  @JsonIgnore public java.util.Collection<Trip> getItemOfferedTrips() {
    final java.lang.Object current = myData.get("itemOffered");
    if (current == null) return Collections.emptyList();
    if (current instanceof java.util.Collection) {
      return (java.util.Collection<Trip>) current;
    }
    return Arrays.asList((Trip) current);
  }
  protected Demand(java.util.Map<String,java.lang.Object> data) {
    super(data);
  }
  
  /**
   * Builder for {@link Demand}
   */
  public static class Builder extends Intangible.Builder {
    public Builder(@NotNull HashMap<String,java.lang.Object> data) {
      super(data);
    }
    @NotNull public Demand build() {
      return new Demand(myData);
    }
    /**
     * The typical delay between the receipt of the order and the goods either leaving the warehouse or being prepared for pickup, in case the delivery method is on site pickup.
     * @param quantitativeValue value to set
     * @return this builder instance
     */
    @NotNull public Builder deliveryLeadTime(@NotNull QuantitativeValue quantitativeValue) {
      putValue("deliveryLeadTime", quantitativeValue);
      return this;
    }
    /**
     * The typical delay between the receipt of the order and the goods either leaving the warehouse or being prepared for pickup, in case the delivery method is on site pickup.
     * @param quantitativeValue value to set
     * @return this builder instance
     */
    @NotNull public Builder deliveryLeadTime(@NotNull QuantitativeValue.Builder quantitativeValue) {
      putValue("deliveryLeadTime", quantitativeValue.build());
      return this;
    }
    /**
     * Remove deliveryLeadTime property from the builder.
     * If this property is repeatable, all instances are removed.
     * @return this builder instance
     */
    @NotNull public Builder removeDeliveryLeadTime() {
      removeValue("deliveryLeadTime");
      return this;
    }
    /**
     * Get currently set value for deliveryLeadTime property in this builder.
     * @return previously set value or {@code null}. If multiple values have been 
     * set to this property, then {@link java.util.Collection} instance will be 
     * returned.
     */
    @Nullable public java.lang.Object getDeliveryLeadTime() {
      return myData.get("deliveryLeadTime");
    }
    /**
     * The end of the availability of the product or service included in the offer.
     * @param date value to set
     * @return this builder instance
     */
    @NotNull public Builder availabilityEnds(@NotNull java.util.Date date) {
      putValue("availabilityEnds", date);
      return this;
    }
    /**
     * Remove availabilityEnds property from the builder.
     * If this property is repeatable, all instances are removed.
     * @return this builder instance
     */
    @NotNull public Builder removeAvailabilityEnds() {
      removeValue("availabilityEnds");
      return this;
    }
    /**
     * Get currently set value for availabilityEnds property in this builder.
     * @return previously set value or {@code null}. If multiple values have been 
     * set to this property, then {@link java.util.Collection} instance will be 
     * returned.
     */
    @Nullable public java.lang.Object getAvailabilityEnds() {
      return myData.get("availabilityEnds");
    }
    /**
     * The date when the item becomes valid.
     * @param date value to set
     * @return this builder instance
     */
    @NotNull public Builder validFrom(@NotNull java.util.Date date) {
      putValue("validFrom", date);
      return this;
    }
    /**
     * Remove validFrom property from the builder.
     * If this property is repeatable, all instances are removed.
     * @return this builder instance
     */
    @NotNull public Builder removeValidFrom() {
      removeValue("validFrom");
      return this;
    }
    /**
     * Get currently set value for validFrom property in this builder.
     * @return previously set value or {@code null}. If multiple values have been 
     * set to this property, then {@link java.util.Collection} instance will be 
     * returned.
     */
    @Nullable public java.lang.Object getValidFrom() {
      return myData.get("validFrom");
    }
    /**
     * The current approximate inventory level for the item or items.
     * @param quantitativeValue value to set
     * @return this builder instance
     */
    @NotNull public Builder inventoryLevel(@NotNull QuantitativeValue quantitativeValue) {
      putValue("inventoryLevel", quantitativeValue);
      return this;
    }
    /**
     * The current approximate inventory level for the item or items.
     * @param quantitativeValue value to set
     * @return this builder instance
     */
    @NotNull public Builder inventoryLevel(@NotNull QuantitativeValue.Builder quantitativeValue) {
      putValue("inventoryLevel", quantitativeValue.build());
      return this;
    }
    /**
     * Remove inventoryLevel property from the builder.
     * If this property is repeatable, all instances are removed.
     * @return this builder instance
     */
    @NotNull public Builder removeInventoryLevel() {
      removeValue("inventoryLevel");
      return this;
    }
    /**
     * Get currently set value for inventoryLevel property in this builder.
     * @return previously set value or {@code null}. If multiple values have been 
     * set to this property, then {@link java.util.Collection} instance will be 
     * returned.
     */
    @Nullable public java.lang.Object getInventoryLevel() {
      return myData.get("inventoryLevel");
    }
    /**
     * A Global Trade Item Number ([GTIN](https://www.gs1.org/standards/id-keys/gtin)). GTINs identify trade items, including products and services, using numeric identification codes. The [[gtin]] property generalizes the earlier [[gtin8]], [[gtin12]], [[gtin13]], and [[gtin14]] properties. The GS1 [digital link specifications](https://www.gs1.org/standards/Digital-Link/) express GTINs as URLs. A correct [[gtin]] value should be a valid GTIN, which means that it should be an all-numeric string of either 8, 12, 13 or 14 digits, or a &quot;GS1 Digital Link&quot; URL based on such a string. The numeric component should also have a [valid GS1 check digit](https://www.gs1.org/services/check-digit-calculator) and meet the other rules for valid GTINs. See also [GS1's GTIN Summary](http://www.gs1.org/barcodes/technical/idkeys/gtin) and [Wikipedia](https://en.wikipedia.org/wiki/Global_Trade_Item_Number) for more details. Left-padding of the gtin values is not required or encouraged.
     * 
     * @param gtin value to set
     * @return this builder instance
     */
    @NotNull public Builder gtin(@NotNull Gtin gtin) {
      putValue("gtin", gtin);
      return this;
    }
    /**
     * Remove gtin property from the builder.
     * If this property is repeatable, all instances are removed.
     * @return this builder instance
     */
    @NotNull public Builder removeGtin() {
      removeValue("gtin");
      return this;
    }
    /**
     * Get currently set value for gtin property in this builder.
     * @return previously set value or {@code null}. If multiple values have been 
     * set to this property, then {@link java.util.Collection} instance will be 
     * returned.
     */
    @Nullable public java.lang.Object getGtin() {
      return myData.get("gtin");
    }
    /**
     * The GTIN-13 code of the product, or the product to which the offer refers. This is equivalent to 13-digit ISBN codes and EAN UCC-13. Former 12-digit UPC codes can be converted into a GTIN-13 code by simply adding a preceding zero. See [GS1 GTIN Summary](http://www.gs1.org/barcodes/technical/idkeys/gtin) for more details.
     * @param gtin value to set
     * @return this builder instance
     */
    @NotNull public Builder gtin13(@NotNull Gtin gtin) {
      putValue("gtin13", gtin);
      return this;
    }
    /**
     * Remove gtin13 property from the builder.
     * If this property is repeatable, all instances are removed.
     * @return this builder instance
     */
    @NotNull public Builder removeGtin13() {
      removeValue("gtin13");
      return this;
    }
    /**
     * Get currently set value for gtin13 property in this builder.
     * @return previously set value or {@code null}. If multiple values have been 
     * set to this property, then {@link java.util.Collection} instance will be 
     * returned.
     */
    @Nullable public java.lang.Object getGtin13() {
      return myData.get("gtin13");
    }
    /**
     * The ISO 3166-1 (ISO 3166-1 alpha-2) or ISO 3166-2 code, the place, or the GeoShape for the geo-political region(s) for which the offer or delivery charge specification is not valid, e.g. a region where the transaction is not allowed.\n\nSee also [[eligibleRegion]].
     * 
     * @param geoShape value to set
     * @return this builder instance
     */
    @NotNull public Builder ineligibleRegion(@NotNull GeoShape geoShape) {
      putValue("ineligibleRegion", geoShape);
      return this;
    }
    /**
     * The ISO 3166-1 (ISO 3166-1 alpha-2) or ISO 3166-2 code, the place, or the GeoShape for the geo-political region(s) for which the offer or delivery charge specification is not valid, e.g. a region where the transaction is not allowed.\n\nSee also [[eligibleRegion]].
     * 
     * @param geoShape value to set
     * @return this builder instance
     */
    @NotNull public Builder ineligibleRegion(@NotNull GeoShape.Builder geoShape) {
      putValue("ineligibleRegion", geoShape.build());
      return this;
    }
    /**
     * The ISO 3166-1 (ISO 3166-1 alpha-2) or ISO 3166-2 code, the place, or the GeoShape for the geo-political region(s) for which the offer or delivery charge specification is not valid, e.g. a region where the transaction is not allowed.\n\nSee also [[eligibleRegion]].
     * 
     * @param place value to set
     * @return this builder instance
     */
    @NotNull public Builder ineligibleRegion(@NotNull Place place) {
      putValue("ineligibleRegion", place);
      return this;
    }
    /**
     * The ISO 3166-1 (ISO 3166-1 alpha-2) or ISO 3166-2 code, the place, or the GeoShape for the geo-political region(s) for which the offer or delivery charge specification is not valid, e.g. a region where the transaction is not allowed.\n\nSee also [[eligibleRegion]].
     * 
     * @param place value to set
     * @return this builder instance
     */
    @NotNull public Builder ineligibleRegion(@NotNull Place.Builder place) {
      putValue("ineligibleRegion", place.build());
      return this;
    }
    /**
     * The ISO 3166-1 (ISO 3166-1 alpha-2) or ISO 3166-2 code, the place, or the GeoShape for the geo-political region(s) for which the offer or delivery charge specification is not valid, e.g. a region where the transaction is not allowed.\n\nSee also [[eligibleRegion]].
     * 
     * @param ineligibleRegion value to set
     * @return this builder instance
     */
    @NotNull public Builder ineligibleRegion(@NotNull String ineligibleRegion) {
      putValue("ineligibleRegion", ineligibleRegion);
      return this;
    }
    /**
     * Remove ineligibleRegion property from the builder.
     * If this property is repeatable, all instances are removed.
     * @return this builder instance
     */
    @NotNull public Builder removeIneligibleRegion() {
      removeValue("ineligibleRegion");
      return this;
    }
    /**
     * Get currently set value for ineligibleRegion property in this builder.
     * @return previously set value or {@code null}. If multiple values have been 
     * set to this property, then {@link java.util.Collection} instance will be 
     * returned.
     */
    @Nullable public java.lang.Object getIneligibleRegion() {
      return myData.get("ineligibleRegion");
    }
    /**
     * The GTIN-14 code of the product, or the product to which the offer refers. See [GS1 GTIN Summary](http://www.gs1.org/barcodes/technical/idkeys/gtin) for more details.
     * @param identifier value to set
     * @return this builder instance
     */
    @NotNull public Builder gtin14(@NotNull Identifier identifier) {
      putValue("gtin14", identifier);
      return this;
    }
    /**
     * Remove gtin14 property from the builder.
     * If this property is repeatable, all instances are removed.
     * @return this builder instance
     */
    @NotNull public Builder removeGtin14() {
      removeValue("gtin14");
      return this;
    }
    /**
     * Get currently set value for gtin14 property in this builder.
     * @return previously set value or {@code null}. If multiple values have been 
     * set to this property, then {@link java.util.Collection} instance will be 
     * returned.
     */
    @Nullable public java.lang.Object getGtin14() {
      return myData.get("gtin14");
    }
    /**
     * A predefined value from OfferItemCondition specifying the condition of the product or service, or the products or services included in the offer. Also used for product return policies to specify the condition of products accepted for returns.
     * @param offerItemCondition value to set
     * @return this builder instance
     */
    @NotNull public Builder itemCondition(@NotNull OfferItemCondition offerItemCondition) {
      putValue("itemCondition", offerItemCondition);
      return this;
    }
    /**
     * Remove itemCondition property from the builder.
     * If this property is repeatable, all instances are removed.
     * @return this builder instance
     */
    @NotNull public Builder removeItemCondition() {
      removeValue("itemCondition");
      return this;
    }
    /**
     * Get currently set value for itemCondition property in this builder.
     * @return previously set value or {@code null}. If multiple values have been 
     * set to this property, then {@link java.util.Collection} instance will be 
     * returned.
     */
    @Nullable public java.lang.Object getItemCondition() {
      return myData.get("itemCondition");
    }
    /**
     * One or more detailed price specifications, indicating the unit price and delivery or payment charges.
     * @param priceSpecification value to set
     * @return this builder instance
     */
    @NotNull public Builder priceSpecification(@NotNull PriceSpecification priceSpecification) {
      putValue("priceSpecification", priceSpecification);
      return this;
    }
    /**
     * One or more detailed price specifications, indicating the unit price and delivery or payment charges.
     * @param priceSpecification value to set
     * @return this builder instance
     */
    @NotNull public Builder priceSpecification(@NotNull PriceSpecification.Builder priceSpecification) {
      putValue("priceSpecification", priceSpecification.build());
      return this;
    }
    /**
     * Remove priceSpecification property from the builder.
     * If this property is repeatable, all instances are removed.
     * @return this builder instance
     */
    @NotNull public Builder removePriceSpecification() {
      removeValue("priceSpecification");
      return this;
    }
    /**
     * Get currently set value for priceSpecification property in this builder.
     * @return previously set value or {@code null}. If multiple values have been 
     * set to this property, then {@link java.util.Collection} instance will be 
     * returned.
     */
    @Nullable public java.lang.Object getPriceSpecification() {
      return myData.get("priceSpecification");
    }
    /**
     * The Manufacturer Part Number (MPN) of the product, or the product to which the offer refers.
     * @param mpn value to set
     * @return this builder instance
     */
    @NotNull public Builder mpn(@NotNull String mpn) {
      putValue("mpn", mpn);
      return this;
    }
    /**
     * Remove mpn property from the builder.
     * If this property is repeatable, all instances are removed.
     * @return this builder instance
     */
    @NotNull public Builder removeMpn() {
      removeValue("mpn");
      return this;
    }
    /**
     * Get currently set value for mpn property in this builder.
     * @return previously set value or {@code null}. If multiple values have been 
     * set to this property, then {@link java.util.Collection} instance will be 
     * returned.
     */
    @Nullable public java.lang.Object getMpn() {
      return myData.get("mpn");
    }
    /**
     * The type(s) of customers for which the given offer is valid.
     * @param businessEntityType value to set
     * @return this builder instance
     */
    @NotNull public Builder eligibleCustomerType(@NotNull BusinessEntityType businessEntityType) {
      putValue("eligibleCustomerType", businessEntityType);
      return this;
    }
    /**
     * Remove eligibleCustomerType property from the builder.
     * If this property is repeatable, all instances are removed.
     * @return this builder instance
     */
    @NotNull public Builder removeEligibleCustomerType() {
      removeValue("eligibleCustomerType");
      return this;
    }
    /**
     * Get currently set value for eligibleCustomerType property in this builder.
     * @return previously set value or {@code null}. If multiple values have been 
     * set to this property, then {@link java.util.Collection} instance will be 
     * returned.
     */
    @Nullable public java.lang.Object getEligibleCustomerType() {
      return myData.get("eligibleCustomerType");
    }
    /**
     * The payment method(s) accepted by seller for this offer.
     * @param loanOrCredit value to set
     * @return this builder instance
     */
    @NotNull public Builder acceptedPaymentMethod(@NotNull LoanOrCredit loanOrCredit) {
      putValue("acceptedPaymentMethod", loanOrCredit);
      return this;
    }
    /**
     * The payment method(s) accepted by seller for this offer.
     * @param paymentMethod value to set
     * @return this builder instance
     */
    @NotNull public Builder acceptedPaymentMethod(@NotNull PaymentMethod paymentMethod) {
      putValue("acceptedPaymentMethod", paymentMethod);
      return this;
    }
    /**
     * Remove acceptedPaymentMethod property from the builder.
     * If this property is repeatable, all instances are removed.
     * @return this builder instance
     */
    @NotNull public Builder removeAcceptedPaymentMethod() {
      removeValue("acceptedPaymentMethod");
      return this;
    }
    /**
     * Get currently set value for acceptedPaymentMethod property in this builder.
     * @return previously set value or {@code null}. If multiple values have been 
     * set to this property, then {@link java.util.Collection} instance will be 
     * returned.
     */
    @Nullable public java.lang.Object getAcceptedPaymentMethod() {
      return myData.get("acceptedPaymentMethod");
    }
    /**
     * This links to a node or nodes indicating the exact quantity of the products included in  an [[Offer]] or [[ProductCollection]].
     * @param typeAndQuantityNode value to set
     * @return this builder instance
     */
    @NotNull public Builder includesObject(@NotNull TypeAndQuantityNode typeAndQuantityNode) {
      putValue("includesObject", typeAndQuantityNode);
      return this;
    }
    /**
     * This links to a node or nodes indicating the exact quantity of the products included in  an [[Offer]] or [[ProductCollection]].
     * @param typeAndQuantityNode value to set
     * @return this builder instance
     */
    @NotNull public Builder includesObject(@NotNull TypeAndQuantityNode.Builder typeAndQuantityNode) {
      putValue("includesObject", typeAndQuantityNode.build());
      return this;
    }
    /**
     * Remove includesObject property from the builder.
     * If this property is repeatable, all instances are removed.
     * @return this builder instance
     */
    @NotNull public Builder removeIncludesObject() {
      removeValue("includesObject");
      return this;
    }
    /**
     * Get currently set value for includesObject property in this builder.
     * @return previously set value or {@code null}. If multiple values have been 
     * set to this property, then {@link java.util.Collection} instance will be 
     * returned.
     */
    @Nullable public java.lang.Object getIncludesObject() {
      return myData.get("includesObject");
    }
    /**
     * The GTIN-12 code of the product, or the product to which the offer refers. The GTIN-12 is the 12-digit GS1 Identification Key composed of a U.P.C. Company Prefix, Item Reference, and Check Digit used to identify trade items. See [GS1 GTIN Summary](http://www.gs1.org/barcodes/technical/idkeys/gtin) for more details.
     * @param identifier value to set
     * @return this builder instance
     */
    @NotNull public Builder gtin12(@NotNull Identifier identifier) {
      putValue("gtin12", identifier);
      return this;
    }
    /**
     * Remove gtin12 property from the builder.
     * If this property is repeatable, all instances are removed.
     * @return this builder instance
     */
    @NotNull public Builder removeGtin12() {
      removeValue("gtin12");
      return this;
    }
    /**
     * Get currently set value for gtin12 property in this builder.
     * @return previously set value or {@code null}. If multiple values have been 
     * set to this property, then {@link java.util.Collection} instance will be 
     * returned.
     */
    @Nullable public java.lang.Object getGtin12() {
      return myData.get("gtin12");
    }
    /**
     * The Stock Keeping Unit (SKU), i.e. a merchant-specific identifier for a product or service, or the product to which the offer refers.
     * @param identifier value to set
     * @return this builder instance
     */
    @NotNull public Builder sku(@NotNull Identifier identifier) {
      putValue("sku", identifier);
      return this;
    }
    /**
     * Remove sku property from the builder.
     * If this property is repeatable, all instances are removed.
     * @return this builder instance
     */
    @NotNull public Builder removeSku() {
      removeValue("sku");
      return this;
    }
    /**
     * Get currently set value for sku property in this builder.
     * @return previously set value or {@code null}. If multiple values have been 
     * set to this property, then {@link java.util.Collection} instance will be 
     * returned.
     */
    @Nullable public java.lang.Object getSku() {
      return myData.get("sku");
    }
    /**
     * The interval and unit of measurement of ordering quantities for which the offer or price specification is valid. This allows e.g. specifying that a certain freight charge is valid only for a certain quantity.
     * @param quantitativeValue value to set
     * @return this builder instance
     */
    @NotNull public Builder eligibleQuantity(@NotNull QuantitativeValue quantitativeValue) {
      putValue("eligibleQuantity", quantitativeValue);
      return this;
    }
    /**
     * The interval and unit of measurement of ordering quantities for which the offer or price specification is valid. This allows e.g. specifying that a certain freight charge is valid only for a certain quantity.
     * @param quantitativeValue value to set
     * @return this builder instance
     */
    @NotNull public Builder eligibleQuantity(@NotNull QuantitativeValue.Builder quantitativeValue) {
      putValue("eligibleQuantity", quantitativeValue.build());
      return this;
    }
    /**
     * Remove eligibleQuantity property from the builder.
     * If this property is repeatable, all instances are removed.
     * @return this builder instance
     */
    @NotNull public Builder removeEligibleQuantity() {
      removeValue("eligibleQuantity");
      return this;
    }
    /**
     * Get currently set value for eligibleQuantity property in this builder.
     * @return previously set value or {@code null}. If multiple values have been 
     * set to this property, then {@link java.util.Collection} instance will be 
     * returned.
     */
    @Nullable public java.lang.Object getEligibleQuantity() {
      return myData.get("eligibleQuantity");
    }
    /**
     * The warranty promise(s) included in the offer.
     * @param warrantyPromise value to set
     * @return this builder instance
     */
    @NotNull public Builder warranty(@NotNull WarrantyPromise warrantyPromise) {
      putValue("warranty", warrantyPromise);
      return this;
    }
    /**
     * The warranty promise(s) included in the offer.
     * @param warrantyPromise value to set
     * @return this builder instance
     */
    @NotNull public Builder warranty(@NotNull WarrantyPromise.Builder warrantyPromise) {
      putValue("warranty", warrantyPromise.build());
      return this;
    }
    /**
     * Remove warranty property from the builder.
     * If this property is repeatable, all instances are removed.
     * @return this builder instance
     */
    @NotNull public Builder removeWarranty() {
      removeValue("warranty");
      return this;
    }
    /**
     * Get currently set value for warranty property in this builder.
     * @return previously set value or {@code null}. If multiple values have been 
     * set to this property, then {@link java.util.Collection} instance will be 
     * returned.
     */
    @Nullable public java.lang.Object getWarranty() {
      return myData.get("warranty");
    }
    /**
     * The geographic area where a service or offered item is provided.
     * @param areaServed value to set
     * @return this builder instance
     */
    @NotNull public Builder areaServed(@NotNull AreaServed areaServed) {
      putValue("areaServed", areaServed);
      return this;
    }
    /**
     * Remove areaServed property from the builder.
     * If this property is repeatable, all instances are removed.
     * @return this builder instance
     */
    @NotNull public Builder removeAreaServed() {
      removeValue("areaServed");
      return this;
    }
    /**
     * Get currently set value for areaServed property in this builder.
     * @return previously set value or {@code null}. If multiple values have been 
     * set to this property, then {@link java.util.Collection} instance will be 
     * returned.
     */
    @Nullable public java.lang.Object getAreaServed() {
      return myData.get("areaServed");
    }
    /**
     * The place(s) from which the offer can be obtained (e.g. store locations).
     * @param areaServed value to set
     * @return this builder instance
     */
    @NotNull public Builder availableAtOrFrom(@NotNull AreaServed areaServed) {
      putValue("availableAtOrFrom", areaServed);
      return this;
    }
    /**
     * Remove availableAtOrFrom property from the builder.
     * If this property is repeatable, all instances are removed.
     * @return this builder instance
     */
    @NotNull public Builder removeAvailableAtOrFrom() {
      removeValue("availableAtOrFrom");
      return this;
    }
    /**
     * Get currently set value for availableAtOrFrom property in this builder.
     * @return previously set value or {@code null}. If multiple values have been 
     * set to this property, then {@link java.util.Collection} instance will be 
     * returned.
     */
    @Nullable public java.lang.Object getAvailableAtOrFrom() {
      return myData.get("availableAtOrFrom");
    }
    /**
     * The date after when the item is not valid. For example the end of an offer, salary period, or a period of opening hours.
     * @param date value to set
     * @return this builder instance
     */
    @NotNull public Builder validThrough(@NotNull java.util.Date date) {
      putValue("validThrough", date);
      return this;
    }
    /**
     * Remove validThrough property from the builder.
     * If this property is repeatable, all instances are removed.
     * @return this builder instance
     */
    @NotNull public Builder removeValidThrough() {
      removeValue("validThrough");
      return this;
    }
    /**
     * Get currently set value for validThrough property in this builder.
     * @return previously set value or {@code null}. If multiple values have been 
     * set to this property, then {@link java.util.Collection} instance will be 
     * returned.
     */
    @Nullable public java.lang.Object getValidThrough() {
      return myData.get("validThrough");
    }
    /**
     * The delivery method(s) available for this offer.
     * @param deliveryMethod value to set
     * @return this builder instance
     */
    @NotNull public Builder availableDeliveryMethod(@NotNull DeliveryMethod deliveryMethod) {
      putValue("availableDeliveryMethod", deliveryMethod);
      return this;
    }
    /**
     * Remove availableDeliveryMethod property from the builder.
     * If this property is repeatable, all instances are removed.
     * @return this builder instance
     */
    @NotNull public Builder removeAvailableDeliveryMethod() {
      removeValue("availableDeliveryMethod");
      return this;
    }
    /**
     * Get currently set value for availableDeliveryMethod property in this builder.
     * @return previously set value or {@code null}. If multiple values have been 
     * set to this property, then {@link java.util.Collection} instance will be 
     * returned.
     */
    @Nullable public java.lang.Object getAvailableDeliveryMethod() {
      return myData.get("availableDeliveryMethod");
    }
    /**
     * The ISO 3166-1 (ISO 3166-1 alpha-2) or ISO 3166-2 code, the place, or the GeoShape for the geo-political region(s) for which the offer or delivery charge specification is valid.\n\nSee also [[ineligibleRegion]].
     * 
     * @param areaServed value to set
     * @return this builder instance
     */
    @NotNull public Builder eligibleRegion(@NotNull AreaServed areaServed) {
      putValue("eligibleRegion", areaServed);
      return this;
    }
    /**
     * Remove eligibleRegion property from the builder.
     * If this property is repeatable, all instances are removed.
     * @return this builder instance
     */
    @NotNull public Builder removeEligibleRegion() {
      removeValue("eligibleRegion");
      return this;
    }
    /**
     * Get currently set value for eligibleRegion property in this builder.
     * @return previously set value or {@code null}. If multiple values have been 
     * set to this property, then {@link java.util.Collection} instance will be 
     * returned.
     */
    @Nullable public java.lang.Object getEligibleRegion() {
      return myData.get("eligibleRegion");
    }
    /**
     * The transaction volume, in a monetary unit, for which the offer or price specification is valid, e.g. for indicating a minimal purchasing volume, to express free shipping above a certain order volume, or to limit the acceptance of credit cards to purchases to a certain minimal amount.
     * @param priceSpecification value to set
     * @return this builder instance
     */
    @NotNull public Builder eligibleTransactionVolume(@NotNull PriceSpecification priceSpecification) {
      putValue("eligibleTransactionVolume", priceSpecification);
      return this;
    }
    /**
     * The transaction volume, in a monetary unit, for which the offer or price specification is valid, e.g. for indicating a minimal purchasing volume, to express free shipping above a certain order volume, or to limit the acceptance of credit cards to purchases to a certain minimal amount.
     * @param priceSpecification value to set
     * @return this builder instance
     */
    @NotNull public Builder eligibleTransactionVolume(@NotNull PriceSpecification.Builder priceSpecification) {
      putValue("eligibleTransactionVolume", priceSpecification.build());
      return this;
    }
    /**
     * Remove eligibleTransactionVolume property from the builder.
     * If this property is repeatable, all instances are removed.
     * @return this builder instance
     */
    @NotNull public Builder removeEligibleTransactionVolume() {
      removeValue("eligibleTransactionVolume");
      return this;
    }
    /**
     * Get currently set value for eligibleTransactionVolume property in this builder.
     * @return previously set value or {@code null}. If multiple values have been 
     * set to this property, then {@link java.util.Collection} instance will be 
     * returned.
     */
    @Nullable public java.lang.Object getEligibleTransactionVolume() {
      return myData.get("eligibleTransactionVolume");
    }
    /**
     * The serial number or any alphanumeric identifier of a particular product. When attached to an offer, it is a shortcut for the serial number of the product included in the offer.
     * @param serialNumber value to set
     * @return this builder instance
     */
    @NotNull public Builder serialNumber(@NotNull SerialNumber serialNumber) {
      putValue("serialNumber", serialNumber);
      return this;
    }
    /**
     * Remove serialNumber property from the builder.
     * If this property is repeatable, all instances are removed.
     * @return this builder instance
     */
    @NotNull public Builder removeSerialNumber() {
      removeValue("serialNumber");
      return this;
    }
    /**
     * Get currently set value for serialNumber property in this builder.
     * @return previously set value or {@code null}. If multiple values have been 
     * set to this property, then {@link java.util.Collection} instance will be 
     * returned.
     */
    @Nullable public java.lang.Object getSerialNumber() {
      return myData.get("serialNumber");
    }
    /**
     * The business function (e.g. sell, lease, repair, dispose) of the offer or component of a bundle (TypeAndQuantityNode). The default is http://purl.org/goodrelations/v1#Sell.
     * @param businessFunction value to set
     * @return this builder instance
     */
    @NotNull public Builder businessFunction(@NotNull BusinessFunction businessFunction) {
      putValue("businessFunction", businessFunction);
      return this;
    }
    /**
     * Remove businessFunction property from the builder.
     * If this property is repeatable, all instances are removed.
     * @return this builder instance
     */
    @NotNull public Builder removeBusinessFunction() {
      removeValue("businessFunction");
      return this;
    }
    /**
     * Get currently set value for businessFunction property in this builder.
     * @return previously set value or {@code null}. If multiple values have been 
     * set to this property, then {@link java.util.Collection} instance will be 
     * returned.
     */
    @Nullable public java.lang.Object getBusinessFunction() {
      return myData.get("businessFunction");
    }
    /**
     * The availability of this item&amp;#x2014;for example In stock, Out of stock, Pre-order, etc.
     * @param itemAvailability value to set
     * @return this builder instance
     */
    @NotNull public Builder availability(@NotNull ItemAvailability itemAvailability) {
      putValue("availability", itemAvailability);
      return this;
    }
    /**
     * Remove availability property from the builder.
     * If this property is repeatable, all instances are removed.
     * @return this builder instance
     */
    @NotNull public Builder removeAvailability() {
      removeValue("availability");
      return this;
    }
    /**
     * Get currently set value for availability property in this builder.
     * @return previously set value or {@code null}. If multiple values have been 
     * set to this property, then {@link java.util.Collection} instance will be 
     * returned.
     */
    @Nullable public java.lang.Object getAvailability() {
      return myData.get("availability");
    }
    /**
     * An entity which offers (sells / leases / lends / loans) the services / goods.  A seller may also be a provider.
     * @param participant value to set
     * @return this builder instance
     */
    @NotNull public Builder seller(@NotNull Participant participant) {
      putValue("seller", participant);
      return this;
    }
    /**
     * Remove seller property from the builder.
     * If this property is repeatable, all instances are removed.
     * @return this builder instance
     */
    @NotNull public Builder removeSeller() {
      removeValue("seller");
      return this;
    }
    /**
     * Get currently set value for seller property in this builder.
     * @return previously set value or {@code null}. If multiple values have been 
     * set to this property, then {@link java.util.Collection} instance will be 
     * returned.
     */
    @Nullable public java.lang.Object getSeller() {
      return myData.get("seller");
    }
    /**
     * The GTIN-8 code of the product, or the product to which the offer refers. This code is also known as EAN/UCC-8 or 8-digit EAN. See [GS1 GTIN Summary](http://www.gs1.org/barcodes/technical/idkeys/gtin) for more details.
     * @param gtin value to set
     * @return this builder instance
     */
    @NotNull public Builder gtin8(@NotNull Gtin gtin) {
      putValue("gtin8", gtin);
      return this;
    }
    /**
     * Remove gtin8 property from the builder.
     * If this property is repeatable, all instances are removed.
     * @return this builder instance
     */
    @NotNull public Builder removeGtin8() {
      removeValue("gtin8");
      return this;
    }
    /**
     * Get currently set value for gtin8 property in this builder.
     * @return previously set value or {@code null}. If multiple values have been 
     * set to this property, then {@link java.util.Collection} instance will be 
     * returned.
     */
    @Nullable public java.lang.Object getGtin8() {
      return myData.get("gtin8");
    }
    /**
     * The duration for which the given offer is valid.
     * @param quantitativeValue value to set
     * @return this builder instance
     */
    @NotNull public Builder eligibleDuration(@NotNull QuantitativeValue quantitativeValue) {
      putValue("eligibleDuration", quantitativeValue);
      return this;
    }
    /**
     * The duration for which the given offer is valid.
     * @param quantitativeValue value to set
     * @return this builder instance
     */
    @NotNull public Builder eligibleDuration(@NotNull QuantitativeValue.Builder quantitativeValue) {
      putValue("eligibleDuration", quantitativeValue.build());
      return this;
    }
    /**
     * Remove eligibleDuration property from the builder.
     * If this property is repeatable, all instances are removed.
     * @return this builder instance
     */
    @NotNull public Builder removeEligibleDuration() {
      removeValue("eligibleDuration");
      return this;
    }
    /**
     * Get currently set value for eligibleDuration property in this builder.
     * @return previously set value or {@code null}. If multiple values have been 
     * set to this property, then {@link java.util.Collection} instance will be 
     * returned.
     */
    @Nullable public java.lang.Object getEligibleDuration() {
      return myData.get("eligibleDuration");
    }
    /**
     * The beginning of the availability of the product or service included in the offer.
     * @param date value to set
     * @return this builder instance
     */
    @NotNull public Builder availabilityStarts(@NotNull java.util.Date date) {
      putValue("availabilityStarts", date);
      return this;
    }
    /**
     * Remove availabilityStarts property from the builder.
     * If this property is repeatable, all instances are removed.
     * @return this builder instance
     */
    @NotNull public Builder removeAvailabilityStarts() {
      removeValue("availabilityStarts");
      return this;
    }
    /**
     * Get currently set value for availabilityStarts property in this builder.
     * @return previously set value or {@code null}. If multiple values have been 
     * set to this property, then {@link java.util.Collection} instance will be 
     * returned.
     */
    @Nullable public java.lang.Object getAvailabilityStarts() {
      return myData.get("availabilityStarts");
    }
    /**
     * The amount of time that is required between accepting the offer and the actual usage of the resource or service.
     * @param quantitativeValue value to set
     * @return this builder instance
     */
    @NotNull public Builder advanceBookingRequirement(@NotNull QuantitativeValue quantitativeValue) {
      putValue("advanceBookingRequirement", quantitativeValue);
      return this;
    }
    /**
     * The amount of time that is required between accepting the offer and the actual usage of the resource or service.
     * @param quantitativeValue value to set
     * @return this builder instance
     */
    @NotNull public Builder advanceBookingRequirement(@NotNull QuantitativeValue.Builder quantitativeValue) {
      putValue("advanceBookingRequirement", quantitativeValue.build());
      return this;
    }
    /**
     * Remove advanceBookingRequirement property from the builder.
     * If this property is repeatable, all instances are removed.
     * @return this builder instance
     */
    @NotNull public Builder removeAdvanceBookingRequirement() {
      removeValue("advanceBookingRequirement");
      return this;
    }
    /**
     * Get currently set value for advanceBookingRequirement property in this builder.
     * @return previously set value or {@code null}. If multiple values have been 
     * set to this property, then {@link java.util.Collection} instance will be 
     * returned.
     */
    @Nullable public java.lang.Object getAdvanceBookingRequirement() {
      return myData.get("advanceBookingRequirement");
    }
    /**
     * An item being offered (or demanded). The transactional nature of the offer or demand is documented using [[businessFunction]], e.g. sell, lease etc. While several common expected types are listed explicitly in this definition, others can be used. Using a second type, such as Product or a subtype of Product, can clarify the nature of the offer.
     * @param aggregateOffer value to set
     * @return this builder instance
     */
    @NotNull public Builder itemOffered(@NotNull AggregateOffer aggregateOffer) {
      putValue("itemOffered", aggregateOffer);
      return this;
    }
    /**
     * An item being offered (or demanded). The transactional nature of the offer or demand is documented using [[businessFunction]], e.g. sell, lease etc. While several common expected types are listed explicitly in this definition, others can be used. Using a second type, such as Product or a subtype of Product, can clarify the nature of the offer.
     * @param aggregateOffer value to set
     * @return this builder instance
     */
    @NotNull public Builder itemOffered(@NotNull AggregateOffer.Builder aggregateOffer) {
      putValue("itemOffered", aggregateOffer.build());
      return this;
    }
    /**
     * An item being offered (or demanded). The transactional nature of the offer or demand is documented using [[businessFunction]], e.g. sell, lease etc. While several common expected types are listed explicitly in this definition, others can be used. Using a second type, such as Product or a subtype of Product, can clarify the nature of the offer.
     * @param creativeWork value to set
     * @return this builder instance
     */
    @NotNull public Builder itemOffered(@NotNull CreativeWork creativeWork) {
      putValue("itemOffered", creativeWork);
      return this;
    }
    /**
     * An item being offered (or demanded). The transactional nature of the offer or demand is documented using [[businessFunction]], e.g. sell, lease etc. While several common expected types are listed explicitly in this definition, others can be used. Using a second type, such as Product or a subtype of Product, can clarify the nature of the offer.
     * @param creativeWork value to set
     * @return this builder instance
     */
    @NotNull public Builder itemOffered(@NotNull CreativeWork.Builder creativeWork) {
      putValue("itemOffered", creativeWork.build());
      return this;
    }
    /**
     * An item being offered (or demanded). The transactional nature of the offer or demand is documented using [[businessFunction]], e.g. sell, lease etc. While several common expected types are listed explicitly in this definition, others can be used. Using a second type, such as Product or a subtype of Product, can clarify the nature of the offer.
     * @param event value to set
     * @return this builder instance
     */
    @NotNull public Builder itemOffered(@NotNull Event event) {
      putValue("itemOffered", event);
      return this;
    }
    /**
     * An item being offered (or demanded). The transactional nature of the offer or demand is documented using [[businessFunction]], e.g. sell, lease etc. While several common expected types are listed explicitly in this definition, others can be used. Using a second type, such as Product or a subtype of Product, can clarify the nature of the offer.
     * @param event value to set
     * @return this builder instance
     */
    @NotNull public Builder itemOffered(@NotNull Event.Builder event) {
      putValue("itemOffered", event.build());
      return this;
    }
    /**
     * An item being offered (or demanded). The transactional nature of the offer or demand is documented using [[businessFunction]], e.g. sell, lease etc. While several common expected types are listed explicitly in this definition, others can be used. Using a second type, such as Product or a subtype of Product, can clarify the nature of the offer.
     * @param menuItem value to set
     * @return this builder instance
     */
    @NotNull public Builder itemOffered(@NotNull MenuItem menuItem) {
      putValue("itemOffered", menuItem);
      return this;
    }
    /**
     * An item being offered (or demanded). The transactional nature of the offer or demand is documented using [[businessFunction]], e.g. sell, lease etc. While several common expected types are listed explicitly in this definition, others can be used. Using a second type, such as Product or a subtype of Product, can clarify the nature of the offer.
     * @param menuItem value to set
     * @return this builder instance
     */
    @NotNull public Builder itemOffered(@NotNull MenuItem.Builder menuItem) {
      putValue("itemOffered", menuItem.build());
      return this;
    }
    /**
     * An item being offered (or demanded). The transactional nature of the offer or demand is documented using [[businessFunction]], e.g. sell, lease etc. While several common expected types are listed explicitly in this definition, others can be used. Using a second type, such as Product or a subtype of Product, can clarify the nature of the offer.
     * @param product value to set
     * @return this builder instance
     */
    @NotNull public Builder itemOffered(@NotNull Product product) {
      putValue("itemOffered", product);
      return this;
    }
    /**
     * An item being offered (or demanded). The transactional nature of the offer or demand is documented using [[businessFunction]], e.g. sell, lease etc. While several common expected types are listed explicitly in this definition, others can be used. Using a second type, such as Product or a subtype of Product, can clarify the nature of the offer.
     * @param product value to set
     * @return this builder instance
     */
    @NotNull public Builder itemOffered(@NotNull Product.Builder product) {
      putValue("itemOffered", product.build());
      return this;
    }
    /**
     * An item being offered (or demanded). The transactional nature of the offer or demand is documented using [[businessFunction]], e.g. sell, lease etc. While several common expected types are listed explicitly in this definition, others can be used. Using a second type, such as Product or a subtype of Product, can clarify the nature of the offer.
     * @param service value to set
     * @return this builder instance
     */
    @NotNull public Builder itemOffered(@NotNull Service service) {
      putValue("itemOffered", service);
      return this;
    }
    /**
     * An item being offered (or demanded). The transactional nature of the offer or demand is documented using [[businessFunction]], e.g. sell, lease etc. While several common expected types are listed explicitly in this definition, others can be used. Using a second type, such as Product or a subtype of Product, can clarify the nature of the offer.
     * @param service value to set
     * @return this builder instance
     */
    @NotNull public Builder itemOffered(@NotNull Service.Builder service) {
      putValue("itemOffered", service.build());
      return this;
    }
    /**
     * An item being offered (or demanded). The transactional nature of the offer or demand is documented using [[businessFunction]], e.g. sell, lease etc. While several common expected types are listed explicitly in this definition, others can be used. Using a second type, such as Product or a subtype of Product, can clarify the nature of the offer.
     * @param trip value to set
     * @return this builder instance
     */
    @NotNull public Builder itemOffered(@NotNull Trip trip) {
      putValue("itemOffered", trip);
      return this;
    }
    /**
     * An item being offered (or demanded). The transactional nature of the offer or demand is documented using [[businessFunction]], e.g. sell, lease etc. While several common expected types are listed explicitly in this definition, others can be used. Using a second type, such as Product or a subtype of Product, can clarify the nature of the offer.
     * @param trip value to set
     * @return this builder instance
     */
    @NotNull public Builder itemOffered(@NotNull Trip.Builder trip) {
      putValue("itemOffered", trip.build());
      return this;
    }
    /**
     * Remove itemOffered property from the builder.
     * If this property is repeatable, all instances are removed.
     * @return this builder instance
     */
    @NotNull public Builder removeItemOffered() {
      removeValue("itemOffered");
      return this;
    }
    /**
     * Get currently set value for itemOffered property in this builder.
     * @return previously set value or {@code null}. If multiple values have been 
     * set to this property, then {@link java.util.Collection} instance will be 
     * returned.
     */
    @Nullable public java.lang.Object getItemOffered() {
      return myData.get("itemOffered");
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
      if ("deliveryLeadTime".equals(key) && value instanceof QuantitativeValue) { this.deliveryLeadTime((QuantitativeValue)value); return; }
      if ("deliveryLeadTimes".equals(key) && value instanceof QuantitativeValue) { this.deliveryLeadTime((QuantitativeValue)value); return; }
      if ("availabilityEnds".equals(key) && value instanceof java.util.Date) { this.availabilityEnds((java.util.Date)value); return; }
      if ("availabilityEndss".equals(key) && value instanceof java.util.Date) { this.availabilityEnds((java.util.Date)value); return; }
      if ("validFrom".equals(key) && value instanceof java.util.Date) { this.validFrom((java.util.Date)value); return; }
      if ("validFroms".equals(key) && value instanceof java.util.Date) { this.validFrom((java.util.Date)value); return; }
      if ("inventoryLevel".equals(key) && value instanceof QuantitativeValue) { this.inventoryLevel((QuantitativeValue)value); return; }
      if ("inventoryLevels".equals(key) && value instanceof QuantitativeValue) { this.inventoryLevel((QuantitativeValue)value); return; }
      if ("gtin".equals(key) && value instanceof Gtin) { this.gtin((Gtin)value); return; }
      if ("gtins".equals(key) && value instanceof Gtin) { this.gtin((Gtin)value); return; }
      if ("gtin13".equals(key) && value instanceof Gtin) { this.gtin13((Gtin)value); return; }
      if ("gtin13s".equals(key) && value instanceof Gtin) { this.gtin13((Gtin)value); return; }
      if ("ineligibleRegion".equals(key) && value instanceof GeoShape) { this.ineligibleRegion((GeoShape)value); return; }
      if ("ineligibleRegions".equals(key) && value instanceof GeoShape) { this.ineligibleRegion((GeoShape)value); return; }
      if ("ineligibleRegion".equals(key) && value instanceof Place) { this.ineligibleRegion((Place)value); return; }
      if ("ineligibleRegions".equals(key) && value instanceof Place) { this.ineligibleRegion((Place)value); return; }
      if ("ineligibleRegion".equals(key) && value instanceof String) { this.ineligibleRegion((String)value); return; }
      if ("ineligibleRegions".equals(key) && value instanceof String) { this.ineligibleRegion((String)value); return; }
      if ("gtin14".equals(key) && value instanceof Identifier) { this.gtin14((Identifier)value); return; }
      if ("gtin14s".equals(key) && value instanceof Identifier) { this.gtin14((Identifier)value); return; }
      if ("itemCondition".equals(key) && value instanceof OfferItemCondition) { this.itemCondition((OfferItemCondition)value); return; }
      if ("itemConditions".equals(key) && value instanceof OfferItemCondition) { this.itemCondition((OfferItemCondition)value); return; }
      if ("priceSpecification".equals(key) && value instanceof PriceSpecification) { this.priceSpecification((PriceSpecification)value); return; }
      if ("priceSpecifications".equals(key) && value instanceof PriceSpecification) { this.priceSpecification((PriceSpecification)value); return; }
      if ("mpn".equals(key) && value instanceof String) { this.mpn((String)value); return; }
      if ("mpns".equals(key) && value instanceof String) { this.mpn((String)value); return; }
      if ("eligibleCustomerType".equals(key) && value instanceof BusinessEntityType) { this.eligibleCustomerType((BusinessEntityType)value); return; }
      if ("eligibleCustomerTypes".equals(key) && value instanceof BusinessEntityType) { this.eligibleCustomerType((BusinessEntityType)value); return; }
      if ("acceptedPaymentMethod".equals(key) && value instanceof LoanOrCredit) { this.acceptedPaymentMethod((LoanOrCredit)value); return; }
      if ("acceptedPaymentMethods".equals(key) && value instanceof LoanOrCredit) { this.acceptedPaymentMethod((LoanOrCredit)value); return; }
      if ("acceptedPaymentMethod".equals(key) && value instanceof PaymentMethod) { this.acceptedPaymentMethod((PaymentMethod)value); return; }
      if ("acceptedPaymentMethods".equals(key) && value instanceof PaymentMethod) { this.acceptedPaymentMethod((PaymentMethod)value); return; }
      if ("includesObject".equals(key) && value instanceof TypeAndQuantityNode) { this.includesObject((TypeAndQuantityNode)value); return; }
      if ("includesObjects".equals(key) && value instanceof TypeAndQuantityNode) { this.includesObject((TypeAndQuantityNode)value); return; }
      if ("gtin12".equals(key) && value instanceof Identifier) { this.gtin12((Identifier)value); return; }
      if ("gtin12s".equals(key) && value instanceof Identifier) { this.gtin12((Identifier)value); return; }
      if ("sku".equals(key) && value instanceof Identifier) { this.sku((Identifier)value); return; }
      if ("skus".equals(key) && value instanceof Identifier) { this.sku((Identifier)value); return; }
      if ("eligibleQuantity".equals(key) && value instanceof QuantitativeValue) { this.eligibleQuantity((QuantitativeValue)value); return; }
      if ("eligibleQuantitys".equals(key) && value instanceof QuantitativeValue) { this.eligibleQuantity((QuantitativeValue)value); return; }
      if ("warranty".equals(key) && value instanceof WarrantyPromise) { this.warranty((WarrantyPromise)value); return; }
      if ("warrantys".equals(key) && value instanceof WarrantyPromise) { this.warranty((WarrantyPromise)value); return; }
      if ("areaServed".equals(key) && value instanceof AreaServed) { this.areaServed((AreaServed)value); return; }
      if ("areaServeds".equals(key) && value instanceof AreaServed) { this.areaServed((AreaServed)value); return; }
      if ("availableAtOrFrom".equals(key) && value instanceof AreaServed) { this.availableAtOrFrom((AreaServed)value); return; }
      if ("availableAtOrFroms".equals(key) && value instanceof AreaServed) { this.availableAtOrFrom((AreaServed)value); return; }
      if ("validThrough".equals(key) && value instanceof java.util.Date) { this.validThrough((java.util.Date)value); return; }
      if ("validThroughs".equals(key) && value instanceof java.util.Date) { this.validThrough((java.util.Date)value); return; }
      if ("availableDeliveryMethod".equals(key) && value instanceof DeliveryMethod) { this.availableDeliveryMethod((DeliveryMethod)value); return; }
      if ("availableDeliveryMethods".equals(key) && value instanceof DeliveryMethod) { this.availableDeliveryMethod((DeliveryMethod)value); return; }
      if ("eligibleRegion".equals(key) && value instanceof AreaServed) { this.eligibleRegion((AreaServed)value); return; }
      if ("eligibleRegions".equals(key) && value instanceof AreaServed) { this.eligibleRegion((AreaServed)value); return; }
      if ("eligibleTransactionVolume".equals(key) && value instanceof PriceSpecification) { this.eligibleTransactionVolume((PriceSpecification)value); return; }
      if ("eligibleTransactionVolumes".equals(key) && value instanceof PriceSpecification) { this.eligibleTransactionVolume((PriceSpecification)value); return; }
      if ("serialNumber".equals(key) && value instanceof SerialNumber) { this.serialNumber((SerialNumber)value); return; }
      if ("serialNumbers".equals(key) && value instanceof SerialNumber) { this.serialNumber((SerialNumber)value); return; }
      if ("businessFunction".equals(key) && value instanceof BusinessFunction) { this.businessFunction((BusinessFunction)value); return; }
      if ("businessFunctions".equals(key) && value instanceof BusinessFunction) { this.businessFunction((BusinessFunction)value); return; }
      if ("availability".equals(key) && value instanceof ItemAvailability) { this.availability((ItemAvailability)value); return; }
      if ("availabilitys".equals(key) && value instanceof ItemAvailability) { this.availability((ItemAvailability)value); return; }
      if ("seller".equals(key) && value instanceof Participant) { this.seller((Participant)value); return; }
      if ("sellers".equals(key) && value instanceof Participant) { this.seller((Participant)value); return; }
      if ("gtin8".equals(key) && value instanceof Gtin) { this.gtin8((Gtin)value); return; }
      if ("gtin8s".equals(key) && value instanceof Gtin) { this.gtin8((Gtin)value); return; }
      if ("eligibleDuration".equals(key) && value instanceof QuantitativeValue) { this.eligibleDuration((QuantitativeValue)value); return; }
      if ("eligibleDurations".equals(key) && value instanceof QuantitativeValue) { this.eligibleDuration((QuantitativeValue)value); return; }
      if ("availabilityStarts".equals(key) && value instanceof java.util.Date) { this.availabilityStarts((java.util.Date)value); return; }
      if ("availabilityStartss".equals(key) && value instanceof java.util.Date) { this.availabilityStarts((java.util.Date)value); return; }
      if ("advanceBookingRequirement".equals(key) && value instanceof QuantitativeValue) { this.advanceBookingRequirement((QuantitativeValue)value); return; }
      if ("advanceBookingRequirements".equals(key) && value instanceof QuantitativeValue) { this.advanceBookingRequirement((QuantitativeValue)value); return; }
      if ("itemOffered".equals(key) && value instanceof AggregateOffer) { this.itemOffered((AggregateOffer)value); return; }
      if ("itemOffereds".equals(key) && value instanceof AggregateOffer) { this.itemOffered((AggregateOffer)value); return; }
      if ("itemOffered".equals(key) && value instanceof CreativeWork) { this.itemOffered((CreativeWork)value); return; }
      if ("itemOffereds".equals(key) && value instanceof CreativeWork) { this.itemOffered((CreativeWork)value); return; }
      if ("itemOffered".equals(key) && value instanceof Event) { this.itemOffered((Event)value); return; }
      if ("itemOffereds".equals(key) && value instanceof Event) { this.itemOffered((Event)value); return; }
      if ("itemOffered".equals(key) && value instanceof MenuItem) { this.itemOffered((MenuItem)value); return; }
      if ("itemOffereds".equals(key) && value instanceof MenuItem) { this.itemOffered((MenuItem)value); return; }
      if ("itemOffered".equals(key) && value instanceof Product) { this.itemOffered((Product)value); return; }
      if ("itemOffereds".equals(key) && value instanceof Product) { this.itemOffered((Product)value); return; }
      if ("itemOffered".equals(key) && value instanceof Service) { this.itemOffered((Service)value); return; }
      if ("itemOffereds".equals(key) && value instanceof Service) { this.itemOffered((Service)value); return; }
      if ("itemOffered".equals(key) && value instanceof Trip) { this.itemOffered((Trip)value); return; }
      if ("itemOffereds".equals(key) && value instanceof Trip) { this.itemOffered((Trip)value); return; }
      super.fromMap(key, value);
    }
  }
  
}
