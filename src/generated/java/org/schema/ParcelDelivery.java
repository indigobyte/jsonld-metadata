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
 * The delivery of a parcel either via the postal service or a commercial service.
 */
public class ParcelDelivery extends Intangible {
  /**
   * The service provider, service operator, or service performer; the goods producer. Another party (a seller) may offer those services or goods on behalf of the provider. A provider may also serve as the seller.
   */
  @JsonIgnore public Organization getProviderOrganization() {
    return (Organization) getValue("provider");
  }
  /**
   * The service provider, service operator, or service performer; the goods producer. Another party (a seller) may offer those services or goods on behalf of the provider. A provider may also serve as the seller.
   */
  @JsonIgnore public java.util.Collection<Organization> getProviderOrganizations() {
    final java.lang.Object current = myData.get("provider");
    if (current == null) return Collections.emptyList();
    if (current instanceof java.util.Collection) {
      return (java.util.Collection<Organization>) current;
    }
    return Arrays.asList((Organization) current);
  }
  /**
   * The service provider, service operator, or service performer; the goods producer. Another party (a seller) may offer those services or goods on behalf of the provider. A provider may also serve as the seller.
   */
  @JsonIgnore public Person getProviderPerson() {
    return (Person) getValue("provider");
  }
  /**
   * The service provider, service operator, or service performer; the goods producer. Another party (a seller) may offer those services or goods on behalf of the provider. A provider may also serve as the seller.
   */
  @JsonIgnore public java.util.Collection<Person> getProviderPersons() {
    final java.lang.Object current = myData.get("provider");
    if (current == null) return Collections.emptyList();
    if (current instanceof java.util.Collection) {
      return (java.util.Collection<Person>) current;
    }
    return Arrays.asList((Person) current);
  }
  /**
   * The latest date the package may arrive.
   */
  @JsonIgnore public java.util.Date getExpectedArrivalUntil() {
    return (java.util.Date) getValue("expectedArrivalUntil");
  }
  /**
   * The latest date the package may arrive.
   */
  @JsonIgnore public java.util.Collection<java.util.Date> getExpectedArrivalUntils() {
    final java.lang.Object current = myData.get("expectedArrivalUntil");
    if (current == null) return Collections.emptyList();
    if (current instanceof java.util.Collection) {
      return (java.util.Collection<java.util.Date>) current;
    }
    return Arrays.asList((java.util.Date) current);
  }
  /**
   * Method used for delivery or shipping.
   */
  @JsonIgnore public DeliveryMethod getHasDeliveryMethod() {
    return (DeliveryMethod) getValue("hasDeliveryMethod");
  }
  /**
   * Method used for delivery or shipping.
   */
  @JsonIgnore public java.util.Collection<DeliveryMethod> getHasDeliveryMethods() {
    final java.lang.Object current = myData.get("hasDeliveryMethod");
    if (current == null) return Collections.emptyList();
    if (current instanceof java.util.Collection) {
      return (java.util.Collection<DeliveryMethod>) current;
    }
    return Arrays.asList((DeliveryMethod) current);
  }
  /**
   * The overall order the items in this delivery were included in.
   */
  @JsonIgnore public Order getPartOfOrder() {
    return (Order) getValue("partOfOrder");
  }
  /**
   * The overall order the items in this delivery were included in.
   */
  @JsonIgnore public java.util.Collection<Order> getPartOfOrders() {
    final java.lang.Object current = myData.get("partOfOrder");
    if (current == null) return Collections.emptyList();
    if (current instanceof java.util.Collection) {
      return (java.util.Collection<Order>) current;
    }
    return Arrays.asList((Order) current);
  }
  /**
   * The earliest date the package may arrive.
   */
  @JsonIgnore public java.util.Date getExpectedArrivalFrom() {
    return (java.util.Date) getValue("expectedArrivalFrom");
  }
  /**
   * The earliest date the package may arrive.
   */
  @JsonIgnore public java.util.Collection<java.util.Date> getExpectedArrivalFroms() {
    final java.lang.Object current = myData.get("expectedArrivalFrom");
    if (current == null) return Collections.emptyList();
    if (current instanceof java.util.Collection) {
      return (java.util.Collection<java.util.Date>) current;
    }
    return Arrays.asList((java.util.Date) current);
  }
  /**
   * Shipper's address.
   */
  @JsonIgnore public PostalAddress getOriginAddress() {
    return (PostalAddress) getValue("originAddress");
  }
  /**
   * Shipper's address.
   */
  @JsonIgnore public java.util.Collection<PostalAddress> getOriginAddresss() {
    final java.lang.Object current = myData.get("originAddress");
    if (current == null) return Collections.emptyList();
    if (current instanceof java.util.Collection) {
      return (java.util.Collection<PostalAddress>) current;
    }
    return Arrays.asList((PostalAddress) current);
  }
  /**
   * Destination address.
   */
  @JsonIgnore public PostalAddress getDeliveryAddress() {
    return (PostalAddress) getValue("deliveryAddress");
  }
  /**
   * Destination address.
   */
  @JsonIgnore public java.util.Collection<PostalAddress> getDeliveryAddresss() {
    final java.lang.Object current = myData.get("deliveryAddress");
    if (current == null) return Collections.emptyList();
    if (current instanceof java.util.Collection) {
      return (java.util.Collection<PostalAddress>) current;
    }
    return Arrays.asList((PostalAddress) current);
  }
  /**
   * Item(s) being shipped.
   */
  @JsonIgnore public Product getItemShipped() {
    return (Product) getValue("itemShipped");
  }
  /**
   * Item(s) being shipped.
   */
  @JsonIgnore public java.util.Collection<Product> getItemShippeds() {
    final java.lang.Object current = myData.get("itemShipped");
    if (current == null) return Collections.emptyList();
    if (current instanceof java.util.Collection) {
      return (java.util.Collection<Product>) current;
    }
    return Arrays.asList((Product) current);
  }
  /**
   * Tracking url for the parcel delivery.
   */
  @JsonIgnore public String getTrackingUrl() {
    return (String) getValue("trackingUrl");
  }
  /**
   * Tracking url for the parcel delivery.
   */
  @JsonIgnore public java.util.Collection<String> getTrackingUrls() {
    final java.lang.Object current = myData.get("trackingUrl");
    if (current == null) return Collections.emptyList();
    if (current instanceof java.util.Collection) {
      return (java.util.Collection<String>) current;
    }
    return Arrays.asList((String) current);
  }
  /**
   * Shipper tracking number.
   */
  @JsonIgnore public String getTrackingNumber() {
    return (String) getValue("trackingNumber");
  }
  /**
   * Shipper tracking number.
   */
  @JsonIgnore public java.util.Collection<String> getTrackingNumbers() {
    final java.lang.Object current = myData.get("trackingNumber");
    if (current == null) return Collections.emptyList();
    if (current instanceof java.util.Collection) {
      return (java.util.Collection<String>) current;
    }
    return Arrays.asList((String) current);
  }
  /**
   * New entry added as the package passes through each leg of its journey (from shipment to final delivery).
   */
  @JsonIgnore public DeliveryEvent getDeliveryStatus() {
    return (DeliveryEvent) getValue("deliveryStatus");
  }
  /**
   * New entry added as the package passes through each leg of its journey (from shipment to final delivery).
   */
  @JsonIgnore public java.util.Collection<DeliveryEvent> getDeliveryStatuss() {
    final java.lang.Object current = myData.get("deliveryStatus");
    if (current == null) return Collections.emptyList();
    if (current instanceof java.util.Collection) {
      return (java.util.Collection<DeliveryEvent>) current;
    }
    return Arrays.asList((DeliveryEvent) current);
  }
  protected ParcelDelivery(java.util.Map<String,java.lang.Object> data) {
    super(data);
  }
  
  /**
   * Builder for {@link ParcelDelivery}
   */
  public static class Builder extends Intangible.Builder {
    public Builder(@NotNull HashMap<String,java.lang.Object> data) {
      super(data);
    }
    @NotNull public ParcelDelivery build() {
      return new ParcelDelivery(myData);
    }
    /**
     * The service provider, service operator, or service performer; the goods producer. Another party (a seller) may offer those services or goods on behalf of the provider. A provider may also serve as the seller.
     */
    @NotNull public Builder provider(@NotNull Organization organization) {
      putValue("provider", organization);
      return this;
    }
    /**
     * The service provider, service operator, or service performer; the goods producer. Another party (a seller) may offer those services or goods on behalf of the provider. A provider may also serve as the seller.
     */
    @NotNull public Builder provider(@NotNull Organization.Builder organization) {
      putValue("provider", organization.build());
      return this;
    }
    /**
     * The service provider, service operator, or service performer; the goods producer. Another party (a seller) may offer those services or goods on behalf of the provider. A provider may also serve as the seller.
     */
    @NotNull public Builder provider(@NotNull Person person) {
      putValue("provider", person);
      return this;
    }
    /**
     * The service provider, service operator, or service performer; the goods producer. Another party (a seller) may offer those services or goods on behalf of the provider. A provider may also serve as the seller.
     */
    @NotNull public Builder provider(@NotNull Person.Builder person) {
      putValue("provider", person.build());
      return this;
    }
    /**
     * The latest date the package may arrive.
     */
    @NotNull public Builder expectedArrivalUntil(@NotNull java.util.Date date) {
      putValue("expectedArrivalUntil", date);
      return this;
    }
    /**
     * Method used for delivery or shipping.
     */
    @NotNull public Builder hasDeliveryMethod(@NotNull DeliveryMethod deliveryMethod) {
      putValue("hasDeliveryMethod", deliveryMethod);
      return this;
    }
    /**
     * The overall order the items in this delivery were included in.
     */
    @NotNull public Builder partOfOrder(@NotNull Order order) {
      putValue("partOfOrder", order);
      return this;
    }
    /**
     * The overall order the items in this delivery were included in.
     */
    @NotNull public Builder partOfOrder(@NotNull Order.Builder order) {
      putValue("partOfOrder", order.build());
      return this;
    }
    /**
     * The earliest date the package may arrive.
     */
    @NotNull public Builder expectedArrivalFrom(@NotNull java.util.Date date) {
      putValue("expectedArrivalFrom", date);
      return this;
    }
    /**
     * Shipper's address.
     */
    @NotNull public Builder originAddress(@NotNull PostalAddress postalAddress) {
      putValue("originAddress", postalAddress);
      return this;
    }
    /**
     * Shipper's address.
     */
    @NotNull public Builder originAddress(@NotNull PostalAddress.Builder postalAddress) {
      putValue("originAddress", postalAddress.build());
      return this;
    }
    /**
     * Destination address.
     */
    @NotNull public Builder deliveryAddress(@NotNull PostalAddress postalAddress) {
      putValue("deliveryAddress", postalAddress);
      return this;
    }
    /**
     * Destination address.
     */
    @NotNull public Builder deliveryAddress(@NotNull PostalAddress.Builder postalAddress) {
      putValue("deliveryAddress", postalAddress.build());
      return this;
    }
    /**
     * Item(s) being shipped.
     */
    @NotNull public Builder itemShipped(@NotNull Product product) {
      putValue("itemShipped", product);
      return this;
    }
    /**
     * Item(s) being shipped.
     */
    @NotNull public Builder itemShipped(@NotNull Product.Builder product) {
      putValue("itemShipped", product.build());
      return this;
    }
    /**
     * Tracking url for the parcel delivery.
     */
    @NotNull public Builder trackingUrl(@NotNull String trackingUrl) {
      putValue("trackingUrl", trackingUrl);
      return this;
    }
    /**
     * Shipper tracking number.
     */
    @NotNull public Builder trackingNumber(@NotNull String trackingNumber) {
      putValue("trackingNumber", trackingNumber);
      return this;
    }
    /**
     * New entry added as the package passes through each leg of its journey (from shipment to final delivery).
     */
    @NotNull public Builder deliveryStatus(@NotNull DeliveryEvent deliveryEvent) {
      putValue("deliveryStatus", deliveryEvent);
      return this;
    }
    /**
     * New entry added as the package passes through each leg of its journey (from shipment to final delivery).
     */
    @NotNull public Builder deliveryStatus(@NotNull DeliveryEvent.Builder deliveryEvent) {
      putValue("deliveryStatus", deliveryEvent.build());
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
      if ("provider".equals(key) && value instanceof Organization) { this.provider((Organization)value); return; }
      if ("providers".equals(key) && value instanceof Organization) { this.provider((Organization)value); return; }
      if ("provider".equals(key) && value instanceof Person) { this.provider((Person)value); return; }
      if ("providers".equals(key) && value instanceof Person) { this.provider((Person)value); return; }
      if ("expectedArrivalUntil".equals(key) && value instanceof java.util.Date) { this.expectedArrivalUntil((java.util.Date)value); return; }
      if ("expectedArrivalUntils".equals(key) && value instanceof java.util.Date) { this.expectedArrivalUntil((java.util.Date)value); return; }
      if ("hasDeliveryMethod".equals(key) && value instanceof DeliveryMethod) { this.hasDeliveryMethod((DeliveryMethod)value); return; }
      if ("hasDeliveryMethods".equals(key) && value instanceof DeliveryMethod) { this.hasDeliveryMethod((DeliveryMethod)value); return; }
      if ("partOfOrder".equals(key) && value instanceof Order) { this.partOfOrder((Order)value); return; }
      if ("partOfOrders".equals(key) && value instanceof Order) { this.partOfOrder((Order)value); return; }
      if ("expectedArrivalFrom".equals(key) && value instanceof java.util.Date) { this.expectedArrivalFrom((java.util.Date)value); return; }
      if ("expectedArrivalFroms".equals(key) && value instanceof java.util.Date) { this.expectedArrivalFrom((java.util.Date)value); return; }
      if ("originAddress".equals(key) && value instanceof PostalAddress) { this.originAddress((PostalAddress)value); return; }
      if ("originAddresss".equals(key) && value instanceof PostalAddress) { this.originAddress((PostalAddress)value); return; }
      if ("deliveryAddress".equals(key) && value instanceof PostalAddress) { this.deliveryAddress((PostalAddress)value); return; }
      if ("deliveryAddresss".equals(key) && value instanceof PostalAddress) { this.deliveryAddress((PostalAddress)value); return; }
      if ("itemShipped".equals(key) && value instanceof Product) { this.itemShipped((Product)value); return; }
      if ("itemShippeds".equals(key) && value instanceof Product) { this.itemShipped((Product)value); return; }
      if ("trackingUrl".equals(key) && value instanceof String) { this.trackingUrl((String)value); return; }
      if ("trackingUrls".equals(key) && value instanceof String) { this.trackingUrl((String)value); return; }
      if ("trackingNumber".equals(key) && value instanceof String) { this.trackingNumber((String)value); return; }
      if ("trackingNumbers".equals(key) && value instanceof String) { this.trackingNumber((String)value); return; }
      if ("deliveryStatus".equals(key) && value instanceof DeliveryEvent) { this.deliveryStatus((DeliveryEvent)value); return; }
      if ("deliveryStatuss".equals(key) && value instanceof DeliveryEvent) { this.deliveryStatus((DeliveryEvent)value); return; }
      super.fromMap(key, value);
    }
  }
  
}
