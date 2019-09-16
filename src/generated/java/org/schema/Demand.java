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
 * A demand entity represents the public, not necessarily binding, not necessarily exclusive, announcement by an organization or person to seek a certain type of goods or services. For describing demand using this type, the very same properties used for Offer apply.Source: http://www.w3.org/wiki/WebSchemas/SchemaDotOrgSources#source_GoodRelationsClass
 */
public class Demand extends Intangible {
  /**
   * The payment method(s) accepted by seller for this offer.
   */
  @JsonIgnore public LoanOrCredit getAcceptedPaymentMethodLoanOrCredit() {
    return (LoanOrCredit) getValue("acceptedPaymentMethod");
  }
  /**
   * The payment method(s) accepted by seller for this offer.
   */
  @JsonIgnore public Collection<LoanOrCredit> getAcceptedPaymentMethodLoanOrCredits() {
    final Object current = myData.get("acceptedPaymentMethod");
    if (current == null) return Collections.emptyList();
    if (current instanceof Collection) {
      return (Collection<LoanOrCredit>) current;
    }
    return Arrays.asList((LoanOrCredit) current);
  }
  /**
   * The payment method(s) accepted by seller for this offer.
   */
  @JsonIgnore public PaymentMethod getAcceptedPaymentMethodPaymentMethod() {
    return (PaymentMethod) getValue("acceptedPaymentMethod");
  }
  /**
   * The payment method(s) accepted by seller for this offer.
   */
  @JsonIgnore public Collection<PaymentMethod> getAcceptedPaymentMethodPaymentMethods() {
    final Object current = myData.get("acceptedPaymentMethod");
    if (current == null) return Collections.emptyList();
    if (current instanceof Collection) {
      return (Collection<PaymentMethod>) current;
    }
    return Arrays.asList((PaymentMethod) current);
  }
  /**
   * The amount of time that is required between accepting the offer and the actual usage of the resource or service.
   */
  @JsonIgnore public QuantitativeValue getAdvanceBookingRequirement() {
    return (QuantitativeValue) getValue("advanceBookingRequirement");
  }
  /**
   * The amount of time that is required between accepting the offer and the actual usage of the resource or service.
   */
  @JsonIgnore public Collection<QuantitativeValue> getAdvanceBookingRequirements() {
    final Object current = myData.get("advanceBookingRequirement");
    if (current == null) return Collections.emptyList();
    if (current instanceof Collection) {
      return (Collection<QuantitativeValue>) current;
    }
    return Arrays.asList((QuantitativeValue) current);
  }
  /**
   * The geographic area where a service or offered item is provided.
   */
  @JsonIgnore public AvailableAtOrFrom getAreaServed() {
    return (AvailableAtOrFrom) getValue("areaServed");
  }
  /**
   * The geographic area where a service or offered item is provided.
   */
  @JsonIgnore public Collection<AvailableAtOrFrom> getAreaServeds() {
    final Object current = myData.get("areaServed");
    if (current == null) return Collections.emptyList();
    if (current instanceof Collection) {
      return (Collection<AvailableAtOrFrom>) current;
    }
    return Arrays.asList((AvailableAtOrFrom) current);
  }
  /**
   * The availability of this item&#x2014;for example In stock, Out of stock, Pre-order, etc.
   */
  @JsonIgnore public ItemAvailability getAvailability() {
    return (ItemAvailability) getValue("availability");
  }
  /**
   * The availability of this item&#x2014;for example In stock, Out of stock, Pre-order, etc.
   */
  @JsonIgnore public Collection<ItemAvailability> getAvailabilitys() {
    final Object current = myData.get("availability");
    if (current == null) return Collections.emptyList();
    if (current instanceof Collection) {
      return (Collection<ItemAvailability>) current;
    }
    return Arrays.asList((ItemAvailability) current);
  }
  /**
   * The end of the availability of the product or service included in the offer.
   */
  @JsonIgnore public java.util.Date getAvailabilityEnds() {
    return (java.util.Date) getValue("availabilityEnds");
  }
  /**
   * The end of the availability of the product or service included in the offer.
   */
  @JsonIgnore public Collection<java.util.Date> getAvailabilityEndss() {
    final Object current = myData.get("availabilityEnds");
    if (current == null) return Collections.emptyList();
    if (current instanceof Collection) {
      return (Collection<java.util.Date>) current;
    }
    return Arrays.asList((java.util.Date) current);
  }
  /**
   * The beginning of the availability of the product or service included in the offer.
   */
  @JsonIgnore public java.util.Date getAvailabilityStarts() {
    return (java.util.Date) getValue("availabilityStarts");
  }
  /**
   * The beginning of the availability of the product or service included in the offer.
   */
  @JsonIgnore public Collection<java.util.Date> getAvailabilityStartss() {
    final Object current = myData.get("availabilityStarts");
    if (current == null) return Collections.emptyList();
    if (current instanceof Collection) {
      return (Collection<java.util.Date>) current;
    }
    return Arrays.asList((java.util.Date) current);
  }
  @JsonIgnore public AvailableAtOrFrom getAvailableAtOrFrom() {
    return (AvailableAtOrFrom) getValue("availableAtOrFrom");
  }
  @JsonIgnore public Collection<AvailableAtOrFrom> getAvailableAtOrFroms() {
    final Object current = myData.get("availableAtOrFrom");
    if (current == null) return Collections.emptyList();
    if (current instanceof Collection) {
      return (Collection<AvailableAtOrFrom>) current;
    }
    return Arrays.asList((AvailableAtOrFrom) current);
  }
  /**
   * The delivery method(s) available for this offer.
   */
  @JsonIgnore public DeliveryMethod getAvailableDeliveryMethod() {
    return (DeliveryMethod) getValue("availableDeliveryMethod");
  }
  /**
   * The delivery method(s) available for this offer.
   */
  @JsonIgnore public Collection<DeliveryMethod> getAvailableDeliveryMethods() {
    final Object current = myData.get("availableDeliveryMethod");
    if (current == null) return Collections.emptyList();
    if (current instanceof Collection) {
      return (Collection<DeliveryMethod>) current;
    }
    return Arrays.asList((DeliveryMethod) current);
  }
  /**
   * The business function (e.g. sell, lease, repair, dispose) of the offer or component of a bundle (TypeAndQuantityNode). The default is http://purl.org/goodrelations/v1#Sell.
   */
  @JsonIgnore public BusinessFunction getBusinessFunction() {
    return (BusinessFunction) getValue("businessFunction");
  }
  /**
   * The business function (e.g. sell, lease, repair, dispose) of the offer or component of a bundle (TypeAndQuantityNode). The default is http://purl.org/goodrelations/v1#Sell.
   */
  @JsonIgnore public Collection<BusinessFunction> getBusinessFunctions() {
    final Object current = myData.get("businessFunction");
    if (current == null) return Collections.emptyList();
    if (current instanceof Collection) {
      return (Collection<BusinessFunction>) current;
    }
    return Arrays.asList((BusinessFunction) current);
  }
  /**
   * The typical delay between the receipt of the order and the goods either leaving the warehouse or being prepared for pickup, in case the delivery method is on site pickup.
   */
  @JsonIgnore public QuantitativeValue getDeliveryLeadTime() {
    return (QuantitativeValue) getValue("deliveryLeadTime");
  }
  /**
   * The typical delay between the receipt of the order and the goods either leaving the warehouse or being prepared for pickup, in case the delivery method is on site pickup.
   */
  @JsonIgnore public Collection<QuantitativeValue> getDeliveryLeadTimes() {
    final Object current = myData.get("deliveryLeadTime");
    if (current == null) return Collections.emptyList();
    if (current instanceof Collection) {
      return (Collection<QuantitativeValue>) current;
    }
    return Arrays.asList((QuantitativeValue) current);
  }
  /**
   * The type(s) of customers for which the given offer is valid.
   */
  @JsonIgnore public BusinessEntityType getEligibleCustomerType() {
    return (BusinessEntityType) getValue("eligibleCustomerType");
  }
  /**
   * The type(s) of customers for which the given offer is valid.
   */
  @JsonIgnore public Collection<BusinessEntityType> getEligibleCustomerTypes() {
    final Object current = myData.get("eligibleCustomerType");
    if (current == null) return Collections.emptyList();
    if (current instanceof Collection) {
      return (Collection<BusinessEntityType>) current;
    }
    return Arrays.asList((BusinessEntityType) current);
  }
  /**
   * The duration for which the given offer is valid.
   */
  @JsonIgnore public QuantitativeValue getEligibleDuration() {
    return (QuantitativeValue) getValue("eligibleDuration");
  }
  /**
   * The duration for which the given offer is valid.
   */
  @JsonIgnore public Collection<QuantitativeValue> getEligibleDurations() {
    final Object current = myData.get("eligibleDuration");
    if (current == null) return Collections.emptyList();
    if (current instanceof Collection) {
      return (Collection<QuantitativeValue>) current;
    }
    return Arrays.asList((QuantitativeValue) current);
  }
  /**
   * The interval and unit of measurement of ordering quantities for which the offer or price specification is valid. This allows e.g. specifying that a certain freight charge is valid only for a certain quantity.
   */
  @JsonIgnore public QuantitativeValue getEligibleQuantity() {
    return (QuantitativeValue) getValue("eligibleQuantity");
  }
  /**
   * The interval and unit of measurement of ordering quantities for which the offer or price specification is valid. This allows e.g. specifying that a certain freight charge is valid only for a certain quantity.
   */
  @JsonIgnore public Collection<QuantitativeValue> getEligibleQuantitys() {
    final Object current = myData.get("eligibleQuantity");
    if (current == null) return Collections.emptyList();
    if (current instanceof Collection) {
      return (Collection<QuantitativeValue>) current;
    }
    return Arrays.asList((QuantitativeValue) current);
  }
  @JsonIgnore public EligibleRegion getEligibleRegion() {
    return (EligibleRegion) getValue("eligibleRegion");
  }
  @JsonIgnore public Collection<EligibleRegion> getEligibleRegions() {
    final Object current = myData.get("eligibleRegion");
    if (current == null) return Collections.emptyList();
    if (current instanceof Collection) {
      return (Collection<EligibleRegion>) current;
    }
    return Arrays.asList((EligibleRegion) current);
  }
  /**
   * The ISO 3166-1 (ISO 3166-1 alpha-2) or ISO 3166-2 code, the place, or the GeoShape for the geo-political region(s) for which the offer or delivery charge specification is not valid, e.g. a region where the transaction is not allowed.\n\nSee also [[eligibleRegion]].
   *       
   */
  @JsonIgnore public GeoShape getIneligibleRegionGeoShape() {
    return (GeoShape) getValue("ineligibleRegion");
  }
  /**
   * The ISO 3166-1 (ISO 3166-1 alpha-2) or ISO 3166-2 code, the place, or the GeoShape for the geo-political region(s) for which the offer or delivery charge specification is not valid, e.g. a region where the transaction is not allowed.\n\nSee also [[eligibleRegion]].
   *       
   */
  @JsonIgnore public Collection<GeoShape> getIneligibleRegionGeoShapes() {
    final Object current = myData.get("ineligibleRegion");
    if (current == null) return Collections.emptyList();
    if (current instanceof Collection) {
      return (Collection<GeoShape>) current;
    }
    return Arrays.asList((GeoShape) current);
  }
  /**
   * The ISO 3166-1 (ISO 3166-1 alpha-2) or ISO 3166-2 code, the place, or the GeoShape for the geo-political region(s) for which the offer or delivery charge specification is not valid, e.g. a region where the transaction is not allowed.\n\nSee also [[eligibleRegion]].
   *       
   */
  @JsonIgnore public Place getIneligibleRegionPlace() {
    return (Place) getValue("ineligibleRegion");
  }
  /**
   * The ISO 3166-1 (ISO 3166-1 alpha-2) or ISO 3166-2 code, the place, or the GeoShape for the geo-political region(s) for which the offer or delivery charge specification is not valid, e.g. a region where the transaction is not allowed.\n\nSee also [[eligibleRegion]].
   *       
   */
  @JsonIgnore public Collection<Place> getIneligibleRegionPlaces() {
    final Object current = myData.get("ineligibleRegion");
    if (current == null) return Collections.emptyList();
    if (current instanceof Collection) {
      return (Collection<Place>) current;
    }
    return Arrays.asList((Place) current);
  }
  /**
   * The ISO 3166-1 (ISO 3166-1 alpha-2) or ISO 3166-2 code, the place, or the GeoShape for the geo-political region(s) for which the offer or delivery charge specification is not valid, e.g. a region where the transaction is not allowed.\n\nSee also [[eligibleRegion]].
   *       
   */
  @JsonIgnore public String getIneligibleRegionString() {
    return (String) getValue("ineligibleRegion");
  }
  /**
   * The ISO 3166-1 (ISO 3166-1 alpha-2) or ISO 3166-2 code, the place, or the GeoShape for the geo-political region(s) for which the offer or delivery charge specification is not valid, e.g. a region where the transaction is not allowed.\n\nSee also [[eligibleRegion]].
   *       
   */
  @JsonIgnore public Collection<String> getIneligibleRegionStrings() {
    final Object current = myData.get("ineligibleRegion");
    if (current == null) return Collections.emptyList();
    if (current instanceof Collection) {
      return (Collection<String>) current;
    }
    return Arrays.asList((String) current);
  }
  /**
   * The transaction volume, in a monetary unit, for which the offer or price specification is valid, e.g. for indicating a minimal purchasing volume, to express free shipping above a certain order volume, or to limit the acceptance of credit cards to purchases to a certain minimal amount.
   */
  @JsonIgnore public PriceSpecification getEligibleTransactionVolume() {
    return (PriceSpecification) getValue("eligibleTransactionVolume");
  }
  /**
   * The transaction volume, in a monetary unit, for which the offer or price specification is valid, e.g. for indicating a minimal purchasing volume, to express free shipping above a certain order volume, or to limit the acceptance of credit cards to purchases to a certain minimal amount.
   */
  @JsonIgnore public Collection<PriceSpecification> getEligibleTransactionVolumes() {
    final Object current = myData.get("eligibleTransactionVolume");
    if (current == null) return Collections.emptyList();
    if (current instanceof Collection) {
      return (Collection<PriceSpecification>) current;
    }
    return Arrays.asList((PriceSpecification) current);
  }
  /**
   * This links to a node or nodes indicating the exact quantity of the products included in the offer.
   */
  @JsonIgnore public TypeAndQuantityNode getIncludesObject() {
    return (TypeAndQuantityNode) getValue("includesObject");
  }
  /**
   * This links to a node or nodes indicating the exact quantity of the products included in the offer.
   */
  @JsonIgnore public Collection<TypeAndQuantityNode> getIncludesObjects() {
    final Object current = myData.get("includesObject");
    if (current == null) return Collections.emptyList();
    if (current instanceof Collection) {
      return (Collection<TypeAndQuantityNode>) current;
    }
    return Arrays.asList((TypeAndQuantityNode) current);
  }
  /**
   * The current approximate inventory level for the item or items.
   */
  @JsonIgnore public QuantitativeValue getInventoryLevel() {
    return (QuantitativeValue) getValue("inventoryLevel");
  }
  /**
   * The current approximate inventory level for the item or items.
   */
  @JsonIgnore public Collection<QuantitativeValue> getInventoryLevels() {
    final Object current = myData.get("inventoryLevel");
    if (current == null) return Collections.emptyList();
    if (current instanceof Collection) {
      return (Collection<QuantitativeValue>) current;
    }
    return Arrays.asList((QuantitativeValue) current);
  }
  /**
   * A predefined value from OfferItemCondition or a textual description of the condition of the product or service, or the products or services included in the offer.
   */
  @JsonIgnore public OfferItemCondition getItemCondition() {
    return (OfferItemCondition) getValue("itemCondition");
  }
  /**
   * A predefined value from OfferItemCondition or a textual description of the condition of the product or service, or the products or services included in the offer.
   */
  @JsonIgnore public Collection<OfferItemCondition> getItemConditions() {
    final Object current = myData.get("itemCondition");
    if (current == null) return Collections.emptyList();
    if (current instanceof Collection) {
      return (Collection<OfferItemCondition>) current;
    }
    return Arrays.asList((OfferItemCondition) current);
  }
  /**
   * The item being offered.
   */
  @JsonIgnore public Product getItemOfferedProduct() {
    return (Product) getValue("itemOffered");
  }
  /**
   * The item being offered.
   */
  @JsonIgnore public Collection<Product> getItemOfferedProducts() {
    final Object current = myData.get("itemOffered");
    if (current == null) return Collections.emptyList();
    if (current instanceof Collection) {
      return (Collection<Product>) current;
    }
    return Arrays.asList((Product) current);
  }
  /**
   * The item being offered.
   */
  @JsonIgnore public Service getItemOfferedService() {
    return (Service) getValue("itemOffered");
  }
  /**
   * The item being offered.
   */
  @JsonIgnore public Collection<Service> getItemOfferedServices() {
    final Object current = myData.get("itemOffered");
    if (current == null) return Collections.emptyList();
    if (current instanceof Collection) {
      return (Collection<Service>) current;
    }
    return Arrays.asList((Service) current);
  }
  /**
   * The Manufacturer Part Number (MPN) of the product, or the product to which the offer refers.
   */
  @JsonIgnore public String getMpn() {
    return (String) getValue("mpn");
  }
  /**
   * The Manufacturer Part Number (MPN) of the product, or the product to which the offer refers.
   */
  @JsonIgnore public Collection<String> getMpns() {
    final Object current = myData.get("mpn");
    if (current == null) return Collections.emptyList();
    if (current instanceof Collection) {
      return (Collection<String>) current;
    }
    return Arrays.asList((String) current);
  }
  /**
   * One or more detailed price specifications, indicating the unit price and delivery or payment charges.
   */
  @JsonIgnore public PriceSpecification getPriceSpecification() {
    return (PriceSpecification) getValue("priceSpecification");
  }
  /**
   * One or more detailed price specifications, indicating the unit price and delivery or payment charges.
   */
  @JsonIgnore public Collection<PriceSpecification> getPriceSpecifications() {
    final Object current = myData.get("priceSpecification");
    if (current == null) return Collections.emptyList();
    if (current instanceof Collection) {
      return (Collection<PriceSpecification>) current;
    }
    return Arrays.asList((PriceSpecification) current);
  }
  /**
   * The date when the item becomes valid.
   */
  @JsonIgnore public java.util.Date getValidFrom() {
    return (java.util.Date) getValue("validFrom");
  }
  /**
   * The date when the item becomes valid.
   */
  @JsonIgnore public Collection<java.util.Date> getValidFroms() {
    final Object current = myData.get("validFrom");
    if (current == null) return Collections.emptyList();
    if (current instanceof Collection) {
      return (Collection<java.util.Date>) current;
    }
    return Arrays.asList((java.util.Date) current);
  }
  /**
   * The date after when the item is not valid. For example the end of an offer, salary period, or a period of opening hours.
   */
  @JsonIgnore public java.util.Date getValidThrough() {
    return (java.util.Date) getValue("validThrough");
  }
  /**
   * The date after when the item is not valid. For example the end of an offer, salary period, or a period of opening hours.
   */
  @JsonIgnore public Collection<java.util.Date> getValidThroughs() {
    final Object current = myData.get("validThrough");
    if (current == null) return Collections.emptyList();
    if (current instanceof Collection) {
      return (Collection<java.util.Date>) current;
    }
    return Arrays.asList((java.util.Date) current);
  }
  /**
   * The warranty promise(s) included in the offer.
   */
  @JsonIgnore public WarrantyPromise getWarranty() {
    return (WarrantyPromise) getValue("warranty");
  }
  /**
   * The warranty promise(s) included in the offer.
   */
  @JsonIgnore public Collection<WarrantyPromise> getWarrantys() {
    final Object current = myData.get("warranty");
    if (current == null) return Collections.emptyList();
    if (current instanceof Collection) {
      return (Collection<WarrantyPromise>) current;
    }
    return Arrays.asList((WarrantyPromise) current);
  }
  protected Demand(java.util.Map<String,Object> data) {
    super(data);
  }
  
  /**
   * Builder for {@link Demand}
   */
  public static class Builder extends Intangible.Builder {
    public Builder(@NotNull HashMap<String,Object> data) {
      super(data);
    }
    @NotNull public Demand build() {
      return new Demand(myData);
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
    @NotNull public Builder acceptedPaymentMethod(@NotNull LoanOrCredit.Builder loanOrCredit) {
      putValue("acceptedPaymentMethod", loanOrCredit.build());
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
     * The geographic area where a service or offered item is provided.
     */
    @NotNull public Builder areaServed(@NotNull AvailableAtOrFrom availableAtOrFrom) {
      putValue("areaServed", availableAtOrFrom);
      return this;
    }
    /**
     * The availability of this item&#x2014;for example In stock, Out of stock, Pre-order, etc.
     */
    @NotNull public Builder availability(@NotNull ItemAvailability itemAvailability) {
      putValue("availability", itemAvailability);
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
     * The beginning of the availability of the product or service included in the offer.
     */
    @NotNull public Builder availabilityStarts(@NotNull java.util.Date date) {
      putValue("availabilityStarts", date);
      return this;
    }
    @NotNull public Builder availableAtOrFrom(@NotNull AvailableAtOrFrom availableAtOrFrom) {
      putValue("availableAtOrFrom", availableAtOrFrom);
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
     * The business function (e.g. sell, lease, repair, dispose) of the offer or component of a bundle (TypeAndQuantityNode). The default is http://purl.org/goodrelations/v1#Sell.
     */
    @NotNull public Builder businessFunction(@NotNull BusinessFunction businessFunction) {
      putValue("businessFunction", businessFunction);
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
     * The type(s) of customers for which the given offer is valid.
     */
    @NotNull public Builder eligibleCustomerType(@NotNull BusinessEntityType businessEntityType) {
      putValue("eligibleCustomerType", businessEntityType);
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
    @NotNull public Builder eligibleRegion(@NotNull EligibleRegion eligibleRegion) {
      putValue("eligibleRegion", eligibleRegion);
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
     * This links to a node or nodes indicating the exact quantity of the products included in the offer.
     */
    @NotNull public Builder includesObject(@NotNull TypeAndQuantityNode typeAndQuantityNode) {
      putValue("includesObject", typeAndQuantityNode);
      return this;
    }
    /**
     * This links to a node or nodes indicating the exact quantity of the products included in the offer.
     */
    @NotNull public Builder includesObject(@NotNull TypeAndQuantityNode.Builder typeAndQuantityNode) {
      putValue("includesObject", typeAndQuantityNode.build());
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
     * A predefined value from OfferItemCondition or a textual description of the condition of the product or service, or the products or services included in the offer.
     */
    @NotNull public Builder itemCondition(@NotNull OfferItemCondition offerItemCondition) {
      putValue("itemCondition", offerItemCondition);
      return this;
    }
    /**
     * The item being offered.
     */
    @NotNull public Builder itemOffered(@NotNull Product product) {
      putValue("itemOffered", product);
      return this;
    }
    /**
     * The item being offered.
     */
    @NotNull public Builder itemOffered(@NotNull Product.Builder product) {
      putValue("itemOffered", product.build());
      return this;
    }
    /**
     * The item being offered.
     */
    @NotNull public Builder itemOffered(@NotNull Service service) {
      putValue("itemOffered", service);
      return this;
    }
    /**
     * The item being offered.
     */
    @NotNull public Builder itemOffered(@NotNull Service.Builder service) {
      putValue("itemOffered", service.build());
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
     * The date when the item becomes valid.
     */
    @NotNull public Builder validFrom(@NotNull java.util.Date date) {
      putValue("validFrom", date);
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
      if ("acceptedPaymentMethod".equals(key) && value instanceof LoanOrCredit) { acceptedPaymentMethod((LoanOrCredit)value); return; }
      if ("acceptedPaymentMethods".equals(key) && value instanceof LoanOrCredit) { acceptedPaymentMethod((LoanOrCredit)value); return; }
      if ("acceptedPaymentMethod".equals(key) && value instanceof PaymentMethod) { acceptedPaymentMethod((PaymentMethod)value); return; }
      if ("acceptedPaymentMethods".equals(key) && value instanceof PaymentMethod) { acceptedPaymentMethod((PaymentMethod)value); return; }
      if ("advanceBookingRequirement".equals(key) && value instanceof QuantitativeValue) { advanceBookingRequirement((QuantitativeValue)value); return; }
      if ("advanceBookingRequirements".equals(key) && value instanceof QuantitativeValue) { advanceBookingRequirement((QuantitativeValue)value); return; }
      if ("areaServed".equals(key) && value instanceof AvailableAtOrFrom) { areaServed((AvailableAtOrFrom)value); return; }
      if ("areaServeds".equals(key) && value instanceof AvailableAtOrFrom) { areaServed((AvailableAtOrFrom)value); return; }
      if ("availability".equals(key) && value instanceof ItemAvailability) { availability((ItemAvailability)value); return; }
      if ("availabilitys".equals(key) && value instanceof ItemAvailability) { availability((ItemAvailability)value); return; }
      if ("availabilityEnds".equals(key) && value instanceof java.util.Date) { availabilityEnds((java.util.Date)value); return; }
      if ("availabilityEndss".equals(key) && value instanceof java.util.Date) { availabilityEnds((java.util.Date)value); return; }
      if ("availabilityStarts".equals(key) && value instanceof java.util.Date) { availabilityStarts((java.util.Date)value); return; }
      if ("availabilityStartss".equals(key) && value instanceof java.util.Date) { availabilityStarts((java.util.Date)value); return; }
      if ("availableAtOrFrom".equals(key) && value instanceof AvailableAtOrFrom) { availableAtOrFrom((AvailableAtOrFrom)value); return; }
      if ("availableAtOrFroms".equals(key) && value instanceof AvailableAtOrFrom) { availableAtOrFrom((AvailableAtOrFrom)value); return; }
      if ("availableDeliveryMethod".equals(key) && value instanceof DeliveryMethod) { availableDeliveryMethod((DeliveryMethod)value); return; }
      if ("availableDeliveryMethods".equals(key) && value instanceof DeliveryMethod) { availableDeliveryMethod((DeliveryMethod)value); return; }
      if ("businessFunction".equals(key) && value instanceof BusinessFunction) { businessFunction((BusinessFunction)value); return; }
      if ("businessFunctions".equals(key) && value instanceof BusinessFunction) { businessFunction((BusinessFunction)value); return; }
      if ("deliveryLeadTime".equals(key) && value instanceof QuantitativeValue) { deliveryLeadTime((QuantitativeValue)value); return; }
      if ("deliveryLeadTimes".equals(key) && value instanceof QuantitativeValue) { deliveryLeadTime((QuantitativeValue)value); return; }
      if ("eligibleCustomerType".equals(key) && value instanceof BusinessEntityType) { eligibleCustomerType((BusinessEntityType)value); return; }
      if ("eligibleCustomerTypes".equals(key) && value instanceof BusinessEntityType) { eligibleCustomerType((BusinessEntityType)value); return; }
      if ("eligibleDuration".equals(key) && value instanceof QuantitativeValue) { eligibleDuration((QuantitativeValue)value); return; }
      if ("eligibleDurations".equals(key) && value instanceof QuantitativeValue) { eligibleDuration((QuantitativeValue)value); return; }
      if ("eligibleQuantity".equals(key) && value instanceof QuantitativeValue) { eligibleQuantity((QuantitativeValue)value); return; }
      if ("eligibleQuantitys".equals(key) && value instanceof QuantitativeValue) { eligibleQuantity((QuantitativeValue)value); return; }
      if ("eligibleRegion".equals(key) && value instanceof EligibleRegion) { eligibleRegion((EligibleRegion)value); return; }
      if ("eligibleRegions".equals(key) && value instanceof EligibleRegion) { eligibleRegion((EligibleRegion)value); return; }
      if ("ineligibleRegion".equals(key) && value instanceof GeoShape) { ineligibleRegion((GeoShape)value); return; }
      if ("ineligibleRegions".equals(key) && value instanceof GeoShape) { ineligibleRegion((GeoShape)value); return; }
      if ("ineligibleRegion".equals(key) && value instanceof Place) { ineligibleRegion((Place)value); return; }
      if ("ineligibleRegions".equals(key) && value instanceof Place) { ineligibleRegion((Place)value); return; }
      if ("ineligibleRegion".equals(key) && value instanceof String) { ineligibleRegion((String)value); return; }
      if ("ineligibleRegions".equals(key) && value instanceof String) { ineligibleRegion((String)value); return; }
      if ("eligibleTransactionVolume".equals(key) && value instanceof PriceSpecification) { eligibleTransactionVolume((PriceSpecification)value); return; }
      if ("eligibleTransactionVolumes".equals(key) && value instanceof PriceSpecification) { eligibleTransactionVolume((PriceSpecification)value); return; }
      if ("includesObject".equals(key) && value instanceof TypeAndQuantityNode) { includesObject((TypeAndQuantityNode)value); return; }
      if ("includesObjects".equals(key) && value instanceof TypeAndQuantityNode) { includesObject((TypeAndQuantityNode)value); return; }
      if ("inventoryLevel".equals(key) && value instanceof QuantitativeValue) { inventoryLevel((QuantitativeValue)value); return; }
      if ("inventoryLevels".equals(key) && value instanceof QuantitativeValue) { inventoryLevel((QuantitativeValue)value); return; }
      if ("itemCondition".equals(key) && value instanceof OfferItemCondition) { itemCondition((OfferItemCondition)value); return; }
      if ("itemConditions".equals(key) && value instanceof OfferItemCondition) { itemCondition((OfferItemCondition)value); return; }
      if ("itemOffered".equals(key) && value instanceof Product) { itemOffered((Product)value); return; }
      if ("itemOffereds".equals(key) && value instanceof Product) { itemOffered((Product)value); return; }
      if ("itemOffered".equals(key) && value instanceof Service) { itemOffered((Service)value); return; }
      if ("itemOffereds".equals(key) && value instanceof Service) { itemOffered((Service)value); return; }
      if ("mpn".equals(key) && value instanceof String) { mpn((String)value); return; }
      if ("mpns".equals(key) && value instanceof String) { mpn((String)value); return; }
      if ("priceSpecification".equals(key) && value instanceof PriceSpecification) { priceSpecification((PriceSpecification)value); return; }
      if ("priceSpecifications".equals(key) && value instanceof PriceSpecification) { priceSpecification((PriceSpecification)value); return; }
      if ("validFrom".equals(key) && value instanceof java.util.Date) { validFrom((java.util.Date)value); return; }
      if ("validFroms".equals(key) && value instanceof java.util.Date) { validFrom((java.util.Date)value); return; }
      if ("validThrough".equals(key) && value instanceof java.util.Date) { validThrough((java.util.Date)value); return; }
      if ("validThroughs".equals(key) && value instanceof java.util.Date) { validThrough((java.util.Date)value); return; }
      if ("warranty".equals(key) && value instanceof WarrantyPromise) { warranty((WarrantyPromise)value); return; }
      if ("warrantys".equals(key) && value instanceof WarrantyPromise) { warranty((WarrantyPromise)value); return; }
      super.fromMap(key, value);
    }
  }
  
}
