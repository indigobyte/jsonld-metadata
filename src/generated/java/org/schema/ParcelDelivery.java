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
 * The delivery of a parcel either via the postal service or a commercial service.
 */
public class ParcelDelivery extends Intangible {
  /**
   * The service provider, service operator, or service performer; the goods producer. Another party (a seller) may offer those services or goods on behalf of the provider. A provider may also serve as the seller.
   * @return provider property set by first invocation of provider method or {@code null}.
   */
  @JsonIgnore public Organization getProviderOrganization() {
    return (Organization) getValue("provider");
  }
  /**
   * The service provider, service operator, or service performer; the goods producer. Another party (a seller) may offer those services or goods on behalf of the provider. A provider may also serve as the seller.
   * @return all provider properties as {@link java.util.Collection} or an empty collection 
   * if provider was not set.
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
   * @return provider property set by first invocation of provider method or {@code null}.
   */
  @JsonIgnore public Person getProviderPerson() {
    return (Person) getValue("provider");
  }
  /**
   * The service provider, service operator, or service performer; the goods producer. Another party (a seller) may offer those services or goods on behalf of the provider. A provider may also serve as the seller.
   * @return all provider properties as {@link java.util.Collection} or an empty collection 
   * if provider was not set.
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
   * @return expectedArrivalUntil property set by first invocation of expectedArrivalUntil method or {@code null}.
   */
  @JsonIgnore public java.util.Date getExpectedArrivalUntil() {
    return (java.util.Date) getValue("expectedArrivalUntil");
  }
  /**
   * The latest date the package may arrive.
   * @return all expectedArrivalUntil properties as {@link java.util.Collection} or an empty collection 
   * if expectedArrivalUntil was not set.
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
   * @return hasDeliveryMethod property set by first invocation of hasDeliveryMethod method or {@code null}.
   */
  @JsonIgnore public DeliveryMethod getHasDeliveryMethod() {
    return (DeliveryMethod) getValue("hasDeliveryMethod");
  }
  /**
   * Method used for delivery or shipping.
   * @return all hasDeliveryMethod properties as {@link java.util.Collection} or an empty collection 
   * if hasDeliveryMethod was not set.
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
   * @return partOfOrder property set by first invocation of partOfOrder method or {@code null}.
   */
  @JsonIgnore public Order getPartOfOrder() {
    return (Order) getValue("partOfOrder");
  }
  /**
   * The overall order the items in this delivery were included in.
   * @return all partOfOrder properties as {@link java.util.Collection} or an empty collection 
   * if partOfOrder was not set.
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
   * @return expectedArrivalFrom property set by first invocation of expectedArrivalFrom method or {@code null}.
   */
  @JsonIgnore public java.util.Date getExpectedArrivalFrom() {
    return (java.util.Date) getValue("expectedArrivalFrom");
  }
  /**
   * The earliest date the package may arrive.
   * @return all expectedArrivalFrom properties as {@link java.util.Collection} or an empty collection 
   * if expectedArrivalFrom was not set.
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
   * @return originAddress property set by first invocation of originAddress method or {@code null}.
   */
  @JsonIgnore public PostalAddress getOriginAddress() {
    return (PostalAddress) getValue("originAddress");
  }
  /**
   * Shipper's address.
   * @return all originAddress properties as {@link java.util.Collection} or an empty collection 
   * if originAddress was not set.
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
   * @return deliveryAddress property set by first invocation of deliveryAddress method or {@code null}.
   */
  @JsonIgnore public PostalAddress getDeliveryAddress() {
    return (PostalAddress) getValue("deliveryAddress");
  }
  /**
   * Destination address.
   * @return all deliveryAddress properties as {@link java.util.Collection} or an empty collection 
   * if deliveryAddress was not set.
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
   * @return itemShipped property set by first invocation of itemShipped method or {@code null}.
   */
  @JsonIgnore public Product getItemShipped() {
    return (Product) getValue("itemShipped");
  }
  /**
   * Item(s) being shipped.
   * @return all itemShipped properties as {@link java.util.Collection} or an empty collection 
   * if itemShipped was not set.
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
   * @return trackingUrl property set by first invocation of trackingUrl method or {@code null}.
   */
  @JsonIgnore public String getTrackingUrl() {
    return (String) getValue("trackingUrl");
  }
  /**
   * Tracking url for the parcel delivery.
   * @return all trackingUrl properties as {@link java.util.Collection} or an empty collection 
   * if trackingUrl was not set.
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
   * @return trackingNumber property set by first invocation of trackingNumber method or {@code null}.
   */
  @JsonIgnore public String getTrackingNumber() {
    return (String) getValue("trackingNumber");
  }
  /**
   * Shipper tracking number.
   * @return all trackingNumber properties as {@link java.util.Collection} or an empty collection 
   * if trackingNumber was not set.
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
   * @return deliveryStatus property set by first invocation of deliveryStatus method or {@code null}.
   */
  @JsonIgnore public DeliveryEvent getDeliveryStatus() {
    return (DeliveryEvent) getValue("deliveryStatus");
  }
  /**
   * New entry added as the package passes through each leg of its journey (from shipment to final delivery).
   * @return all deliveryStatus properties as {@link java.util.Collection} or an empty collection 
   * if deliveryStatus was not set.
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
   * @return new {@link Builder} initialized with this instance's data
   */
  @NotNull public Builder toBuilder() {
    return new Builder(new HashMap<>(this.myData));
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
     * @param organization value to set
     * @return this builder instance
     */
    @NotNull public Builder provider(@NotNull Organization organization) {
      putValue("provider", organization);
      return this;
    }
    /**
     * The service provider, service operator, or service performer; the goods producer. Another party (a seller) may offer those services or goods on behalf of the provider. A provider may also serve as the seller.
     * @param organization value to set
     * @return this builder instance
     */
    @NotNull public Builder provider(@NotNull Organization.Builder organization) {
      putValue("provider", organization.build());
      return this;
    }
    /**
     * The service provider, service operator, or service performer; the goods producer. Another party (a seller) may offer those services or goods on behalf of the provider. A provider may also serve as the seller.
     * @param person value to set
     * @return this builder instance
     */
    @NotNull public Builder provider(@NotNull Person person) {
      putValue("provider", person);
      return this;
    }
    /**
     * The service provider, service operator, or service performer; the goods producer. Another party (a seller) may offer those services or goods on behalf of the provider. A provider may also serve as the seller.
     * @param person value to set
     * @return this builder instance
     */
    @NotNull public Builder provider(@NotNull Person.Builder person) {
      putValue("provider", person.build());
      return this;
    }
    /**
     * Remove provider property from the builder.
     * If this property is repeatable, all instances are removed.
     * @return this builder instance
     */
    @NotNull public Builder removeProvider() {
      removeValue("provider");
      return this;
    }
    /**
     * Get currently set value for provider property in this builder.
     * @return previously set value or {@code null}. If multiple values have been 
     * set to this property, then {@link java.util.Collection} instance will be 
     * returned.
     */
    @Nullable public java.lang.Object getProvider() {
      return myData.get("provider");
    }
    /**
     * The latest date the package may arrive.
     * @param date value to set
     * @return this builder instance
     */
    @NotNull public Builder expectedArrivalUntil(@NotNull java.util.Date date) {
      putValue("expectedArrivalUntil", date);
      return this;
    }
    /**
     * Remove expectedArrivalUntil property from the builder.
     * If this property is repeatable, all instances are removed.
     * @return this builder instance
     */
    @NotNull public Builder removeExpectedArrivalUntil() {
      removeValue("expectedArrivalUntil");
      return this;
    }
    /**
     * Get currently set value for expectedArrivalUntil property in this builder.
     * @return previously set value or {@code null}. If multiple values have been 
     * set to this property, then {@link java.util.Collection} instance will be 
     * returned.
     */
    @Nullable public java.lang.Object getExpectedArrivalUntil() {
      return myData.get("expectedArrivalUntil");
    }
    /**
     * Method used for delivery or shipping.
     * @param deliveryMethod value to set
     * @return this builder instance
     */
    @NotNull public Builder hasDeliveryMethod(@NotNull DeliveryMethod deliveryMethod) {
      putValue("hasDeliveryMethod", deliveryMethod);
      return this;
    }
    /**
     * Remove hasDeliveryMethod property from the builder.
     * If this property is repeatable, all instances are removed.
     * @return this builder instance
     */
    @NotNull public Builder removeHasDeliveryMethod() {
      removeValue("hasDeliveryMethod");
      return this;
    }
    /**
     * Get currently set value for hasDeliveryMethod property in this builder.
     * @return previously set value or {@code null}. If multiple values have been 
     * set to this property, then {@link java.util.Collection} instance will be 
     * returned.
     */
    @Nullable public java.lang.Object getHasDeliveryMethod() {
      return myData.get("hasDeliveryMethod");
    }
    /**
     * The overall order the items in this delivery were included in.
     * @param order value to set
     * @return this builder instance
     */
    @NotNull public Builder partOfOrder(@NotNull Order order) {
      putValue("partOfOrder", order);
      return this;
    }
    /**
     * The overall order the items in this delivery were included in.
     * @param order value to set
     * @return this builder instance
     */
    @NotNull public Builder partOfOrder(@NotNull Order.Builder order) {
      putValue("partOfOrder", order.build());
      return this;
    }
    /**
     * Remove partOfOrder property from the builder.
     * If this property is repeatable, all instances are removed.
     * @return this builder instance
     */
    @NotNull public Builder removePartOfOrder() {
      removeValue("partOfOrder");
      return this;
    }
    /**
     * Get currently set value for partOfOrder property in this builder.
     * @return previously set value or {@code null}. If multiple values have been 
     * set to this property, then {@link java.util.Collection} instance will be 
     * returned.
     */
    @Nullable public java.lang.Object getPartOfOrder() {
      return myData.get("partOfOrder");
    }
    /**
     * The earliest date the package may arrive.
     * @param date value to set
     * @return this builder instance
     */
    @NotNull public Builder expectedArrivalFrom(@NotNull java.util.Date date) {
      putValue("expectedArrivalFrom", date);
      return this;
    }
    /**
     * Remove expectedArrivalFrom property from the builder.
     * If this property is repeatable, all instances are removed.
     * @return this builder instance
     */
    @NotNull public Builder removeExpectedArrivalFrom() {
      removeValue("expectedArrivalFrom");
      return this;
    }
    /**
     * Get currently set value for expectedArrivalFrom property in this builder.
     * @return previously set value or {@code null}. If multiple values have been 
     * set to this property, then {@link java.util.Collection} instance will be 
     * returned.
     */
    @Nullable public java.lang.Object getExpectedArrivalFrom() {
      return myData.get("expectedArrivalFrom");
    }
    /**
     * Shipper's address.
     * @param postalAddress value to set
     * @return this builder instance
     */
    @NotNull public Builder originAddress(@NotNull PostalAddress postalAddress) {
      putValue("originAddress", postalAddress);
      return this;
    }
    /**
     * Shipper's address.
     * @param postalAddress value to set
     * @return this builder instance
     */
    @NotNull public Builder originAddress(@NotNull PostalAddress.Builder postalAddress) {
      putValue("originAddress", postalAddress.build());
      return this;
    }
    /**
     * Remove originAddress property from the builder.
     * If this property is repeatable, all instances are removed.
     * @return this builder instance
     */
    @NotNull public Builder removeOriginAddress() {
      removeValue("originAddress");
      return this;
    }
    /**
     * Get currently set value for originAddress property in this builder.
     * @return previously set value or {@code null}. If multiple values have been 
     * set to this property, then {@link java.util.Collection} instance will be 
     * returned.
     */
    @Nullable public java.lang.Object getOriginAddress() {
      return myData.get("originAddress");
    }
    /**
     * Destination address.
     * @param postalAddress value to set
     * @return this builder instance
     */
    @NotNull public Builder deliveryAddress(@NotNull PostalAddress postalAddress) {
      putValue("deliveryAddress", postalAddress);
      return this;
    }
    /**
     * Destination address.
     * @param postalAddress value to set
     * @return this builder instance
     */
    @NotNull public Builder deliveryAddress(@NotNull PostalAddress.Builder postalAddress) {
      putValue("deliveryAddress", postalAddress.build());
      return this;
    }
    /**
     * Remove deliveryAddress property from the builder.
     * If this property is repeatable, all instances are removed.
     * @return this builder instance
     */
    @NotNull public Builder removeDeliveryAddress() {
      removeValue("deliveryAddress");
      return this;
    }
    /**
     * Get currently set value for deliveryAddress property in this builder.
     * @return previously set value or {@code null}. If multiple values have been 
     * set to this property, then {@link java.util.Collection} instance will be 
     * returned.
     */
    @Nullable public java.lang.Object getDeliveryAddress() {
      return myData.get("deliveryAddress");
    }
    /**
     * Item(s) being shipped.
     * @param product value to set
     * @return this builder instance
     */
    @NotNull public Builder itemShipped(@NotNull Product product) {
      putValue("itemShipped", product);
      return this;
    }
    /**
     * Item(s) being shipped.
     * @param product value to set
     * @return this builder instance
     */
    @NotNull public Builder itemShipped(@NotNull Product.Builder product) {
      putValue("itemShipped", product.build());
      return this;
    }
    /**
     * Remove itemShipped property from the builder.
     * If this property is repeatable, all instances are removed.
     * @return this builder instance
     */
    @NotNull public Builder removeItemShipped() {
      removeValue("itemShipped");
      return this;
    }
    /**
     * Get currently set value for itemShipped property in this builder.
     * @return previously set value or {@code null}. If multiple values have been 
     * set to this property, then {@link java.util.Collection} instance will be 
     * returned.
     */
    @Nullable public java.lang.Object getItemShipped() {
      return myData.get("itemShipped");
    }
    /**
     * Tracking url for the parcel delivery.
     * @param trackingUrl value to set
     * @return this builder instance
     */
    @NotNull public Builder trackingUrl(@NotNull String trackingUrl) {
      putValue("trackingUrl", trackingUrl);
      return this;
    }
    /**
     * Remove trackingUrl property from the builder.
     * If this property is repeatable, all instances are removed.
     * @return this builder instance
     */
    @NotNull public Builder removeTrackingUrl() {
      removeValue("trackingUrl");
      return this;
    }
    /**
     * Get currently set value for trackingUrl property in this builder.
     * @return previously set value or {@code null}. If multiple values have been 
     * set to this property, then {@link java.util.Collection} instance will be 
     * returned.
     */
    @Nullable public java.lang.Object getTrackingUrl() {
      return myData.get("trackingUrl");
    }
    /**
     * Shipper tracking number.
     * @param trackingNumber value to set
     * @return this builder instance
     */
    @NotNull public Builder trackingNumber(@NotNull String trackingNumber) {
      putValue("trackingNumber", trackingNumber);
      return this;
    }
    /**
     * Remove trackingNumber property from the builder.
     * If this property is repeatable, all instances are removed.
     * @return this builder instance
     */
    @NotNull public Builder removeTrackingNumber() {
      removeValue("trackingNumber");
      return this;
    }
    /**
     * Get currently set value for trackingNumber property in this builder.
     * @return previously set value or {@code null}. If multiple values have been 
     * set to this property, then {@link java.util.Collection} instance will be 
     * returned.
     */
    @Nullable public java.lang.Object getTrackingNumber() {
      return myData.get("trackingNumber");
    }
    /**
     * New entry added as the package passes through each leg of its journey (from shipment to final delivery).
     * @param deliveryEvent value to set
     * @return this builder instance
     */
    @NotNull public Builder deliveryStatus(@NotNull DeliveryEvent deliveryEvent) {
      putValue("deliveryStatus", deliveryEvent);
      return this;
    }
    /**
     * New entry added as the package passes through each leg of its journey (from shipment to final delivery).
     * @param deliveryEvent value to set
     * @return this builder instance
     */
    @NotNull public Builder deliveryStatus(@NotNull DeliveryEvent.Builder deliveryEvent) {
      putValue("deliveryStatus", deliveryEvent.build());
      return this;
    }
    /**
     * Remove deliveryStatus property from the builder.
     * If this property is repeatable, all instances are removed.
     * @return this builder instance
     */
    @NotNull public Builder removeDeliveryStatus() {
      removeValue("deliveryStatus");
      return this;
    }
    /**
     * Get currently set value for deliveryStatus property in this builder.
     * @return previously set value or {@code null}. If multiple values have been 
     * set to this property, then {@link java.util.Collection} instance will be 
     * returned.
     */
    @Nullable public java.lang.Object getDeliveryStatus() {
      return myData.get("deliveryStatus");
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
