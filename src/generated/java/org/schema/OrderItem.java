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
 * An order item is a line of an order. It includes the quantity and shipping details of a bought offer.
 */
public class OrderItem extends Intangible {
  /**
   * The number of the item ordered. If the property is not set, assume the quantity is one.
   * @return orderQuantity property set by first invocation of orderQuantity method or {@code null}.
   */
  @JsonIgnore public Integer getOrderQuantityInteger() {
    return (Integer) getValue("orderQuantity");
  }
  /**
   * The number of the item ordered. If the property is not set, assume the quantity is one.
   * @return all orderQuantity properties as {@link java.util.Collection} or an empty collection 
   * if orderQuantity was not set.
   */
  @JsonIgnore public java.util.Collection<Integer> getOrderQuantityIntegers() {
    final java.lang.Object current = myData.get("orderQuantity");
    if (current == null) return Collections.emptyList();
    if (current instanceof java.util.Collection) {
      return (java.util.Collection<Integer>) current;
    }
    return Arrays.asList((Integer) current);
  }
  /**
   * The number of the item ordered. If the property is not set, assume the quantity is one.
   * @return orderQuantity property set by first invocation of orderQuantity method or {@code null}.
   */
  @JsonIgnore public Long getOrderQuantityLong() {
    return (Long) getValue("orderQuantity");
  }
  /**
   * The number of the item ordered. If the property is not set, assume the quantity is one.
   * @return all orderQuantity properties as {@link java.util.Collection} or an empty collection 
   * if orderQuantity was not set.
   */
  @JsonIgnore public java.util.Collection<Long> getOrderQuantityLongs() {
    final java.lang.Object current = myData.get("orderQuantity");
    if (current == null) return Collections.emptyList();
    if (current instanceof java.util.Collection) {
      return (java.util.Collection<Long>) current;
    }
    return Arrays.asList((Long) current);
  }
  /**
   * The number of the item ordered. If the property is not set, assume the quantity is one.
   * @return orderQuantity property set by first invocation of orderQuantity method or {@code null}.
   */
  @JsonIgnore public Float getOrderQuantityFloat() {
    return (Float) getValue("orderQuantity");
  }
  /**
   * The number of the item ordered. If the property is not set, assume the quantity is one.
   * @return all orderQuantity properties as {@link java.util.Collection} or an empty collection 
   * if orderQuantity was not set.
   */
  @JsonIgnore public java.util.Collection<Float> getOrderQuantityFloats() {
    final java.lang.Object current = myData.get("orderQuantity");
    if (current == null) return Collections.emptyList();
    if (current instanceof java.util.Collection) {
      return (java.util.Collection<Float>) current;
    }
    return Arrays.asList((Float) current);
  }
  /**
   * The number of the item ordered. If the property is not set, assume the quantity is one.
   * @return orderQuantity property set by first invocation of orderQuantity method or {@code null}.
   */
  @JsonIgnore public Double getOrderQuantityDouble() {
    return (Double) getValue("orderQuantity");
  }
  /**
   * The number of the item ordered. If the property is not set, assume the quantity is one.
   * @return all orderQuantity properties as {@link java.util.Collection} or an empty collection 
   * if orderQuantity was not set.
   */
  @JsonIgnore public java.util.Collection<Double> getOrderQuantityDoubles() {
    final java.lang.Object current = myData.get("orderQuantity");
    if (current == null) return Collections.emptyList();
    if (current instanceof java.util.Collection) {
      return (java.util.Collection<Double>) current;
    }
    return Arrays.asList((Double) current);
  }
  /**
   * The number of the item ordered. If the property is not set, assume the quantity is one.
   * @return orderQuantity property set by first invocation of orderQuantity method or {@code null}.
   */
  @JsonIgnore public String getOrderQuantityString() {
    return (String) getValue("orderQuantity");
  }
  /**
   * The number of the item ordered. If the property is not set, assume the quantity is one.
   * @return all orderQuantity properties as {@link java.util.Collection} or an empty collection 
   * if orderQuantity was not set.
   */
  @JsonIgnore public java.util.Collection<String> getOrderQuantityStrings() {
    final java.lang.Object current = myData.get("orderQuantity");
    if (current == null) return Collections.emptyList();
    if (current instanceof java.util.Collection) {
      return (java.util.Collection<String>) current;
    }
    return Arrays.asList((String) current);
  }
  /**
   * The item ordered.
   * @return orderedItem property set by first invocation of orderedItem method or {@code null}.
   */
  @JsonIgnore public OrderItem getOrderedItemOrderItem() {
    return (OrderItem) getValue("orderedItem");
  }
  /**
   * The item ordered.
   * @return all orderedItem properties as {@link java.util.Collection} or an empty collection 
   * if orderedItem was not set.
   */
  @JsonIgnore public java.util.Collection<OrderItem> getOrderedItemOrderItems() {
    final java.lang.Object current = myData.get("orderedItem");
    if (current == null) return Collections.emptyList();
    if (current instanceof java.util.Collection) {
      return (java.util.Collection<OrderItem>) current;
    }
    return Arrays.asList((OrderItem) current);
  }
  /**
   * The item ordered.
   * @return orderedItem property set by first invocation of orderedItem method or {@code null}.
   */
  @JsonIgnore public Product getOrderedItemProduct() {
    return (Product) getValue("orderedItem");
  }
  /**
   * The item ordered.
   * @return all orderedItem properties as {@link java.util.Collection} or an empty collection 
   * if orderedItem was not set.
   */
  @JsonIgnore public java.util.Collection<Product> getOrderedItemProducts() {
    final java.lang.Object current = myData.get("orderedItem");
    if (current == null) return Collections.emptyList();
    if (current instanceof java.util.Collection) {
      return (java.util.Collection<Product>) current;
    }
    return Arrays.asList((Product) current);
  }
  /**
   * The item ordered.
   * @return orderedItem property set by first invocation of orderedItem method or {@code null}.
   */
  @JsonIgnore public Service getOrderedItemService() {
    return (Service) getValue("orderedItem");
  }
  /**
   * The item ordered.
   * @return all orderedItem properties as {@link java.util.Collection} or an empty collection 
   * if orderedItem was not set.
   */
  @JsonIgnore public java.util.Collection<Service> getOrderedItemServices() {
    final java.lang.Object current = myData.get("orderedItem");
    if (current == null) return Collections.emptyList();
    if (current instanceof java.util.Collection) {
      return (java.util.Collection<Service>) current;
    }
    return Arrays.asList((Service) current);
  }
  /**
   * The current status of the order item.
   * @return orderItemStatus property set by first invocation of orderItemStatus method or {@code null}.
   */
  @JsonIgnore public OrderStatus getOrderItemStatus() {
    return (OrderStatus) getValue("orderItemStatus");
  }
  /**
   * The current status of the order item.
   * @return all orderItemStatus properties as {@link java.util.Collection} or an empty collection 
   * if orderItemStatus was not set.
   */
  @JsonIgnore public java.util.Collection<OrderStatus> getOrderItemStatuss() {
    final java.lang.Object current = myData.get("orderItemStatus");
    if (current == null) return Collections.emptyList();
    if (current instanceof java.util.Collection) {
      return (java.util.Collection<OrderStatus>) current;
    }
    return Arrays.asList((OrderStatus) current);
  }
  /**
   * The delivery of the parcel related to this order or order item.
   * @return orderDelivery property set by first invocation of orderDelivery method or {@code null}.
   */
  @JsonIgnore public ParcelDelivery getOrderDelivery() {
    return (ParcelDelivery) getValue("orderDelivery");
  }
  /**
   * The delivery of the parcel related to this order or order item.
   * @return all orderDelivery properties as {@link java.util.Collection} or an empty collection 
   * if orderDelivery was not set.
   */
  @JsonIgnore public java.util.Collection<ParcelDelivery> getOrderDeliverys() {
    final java.lang.Object current = myData.get("orderDelivery");
    if (current == null) return Collections.emptyList();
    if (current instanceof java.util.Collection) {
      return (java.util.Collection<ParcelDelivery>) current;
    }
    return Arrays.asList((ParcelDelivery) current);
  }
  /**
   * The identifier of the order item.
   * @return orderItemNumber property set by first invocation of orderItemNumber method or {@code null}.
   */
  @JsonIgnore public String getOrderItemNumber() {
    return (String) getValue("orderItemNumber");
  }
  /**
   * The identifier of the order item.
   * @return all orderItemNumber properties as {@link java.util.Collection} or an empty collection 
   * if orderItemNumber was not set.
   */
  @JsonIgnore public java.util.Collection<String> getOrderItemNumbers() {
    final java.lang.Object current = myData.get("orderItemNumber");
    if (current == null) return Collections.emptyList();
    if (current instanceof java.util.Collection) {
      return (java.util.Collection<String>) current;
    }
    return Arrays.asList((String) current);
  }
  protected OrderItem(java.util.Map<String,java.lang.Object> data) {
    super(data);
  }
  
  /**
   * Builder for {@link OrderItem}
   */
  public static class Builder extends Intangible.Builder {
    public Builder(@NotNull HashMap<String,java.lang.Object> data) {
      super(data);
    }
    @NotNull public OrderItem build() {
      return new OrderItem(myData);
    }
    /**
     * The number of the item ordered. If the property is not set, assume the quantity is one.
     * @param integer value to set
     * @return this builder instance
     */
    @NotNull public Builder orderQuantity(@NotNull Integer integer) {
      putValue("orderQuantity", integer);
      return this;
    }
    /**
     * The number of the item ordered. If the property is not set, assume the quantity is one.
     * @param orderQuantity value to set
     * @return this builder instance
     */
    @NotNull public Builder orderQuantity(@NotNull Long orderQuantity) {
      putValue("orderQuantity", orderQuantity);
      return this;
    }
    /**
     * The number of the item ordered. If the property is not set, assume the quantity is one.
     * @param orderQuantity value to set
     * @return this builder instance
     */
    @NotNull public Builder orderQuantity(@NotNull Float orderQuantity) {
      putValue("orderQuantity", orderQuantity);
      return this;
    }
    /**
     * The number of the item ordered. If the property is not set, assume the quantity is one.
     * @param orderQuantity value to set
     * @return this builder instance
     */
    @NotNull public Builder orderQuantity(@NotNull Double orderQuantity) {
      putValue("orderQuantity", orderQuantity);
      return this;
    }
    /**
     * The number of the item ordered. If the property is not set, assume the quantity is one.
     * @param orderQuantity value to set
     * @return this builder instance
     */
    @NotNull public Builder orderQuantity(@NotNull String orderQuantity) {
      putValue("orderQuantity", orderQuantity);
      return this;
    }
    /**
     * Remove orderQuantity property from the builder.
     * If this property is repeatable, all instances are removed.
     * @return this builder instance
     */
    @NotNull public Builder removeOrderQuantity() {
      removeValue("orderQuantity");
      return this;
    }
    /**
     * Get currently set value for orderQuantity property in this builder.
     * @return previously set value or {@code null}. If multiple values have been 
     * set to this property, then {@link java.util.Collection} instance will be 
     * returned.
     */
    @Nullable public java.lang.Object getOrderQuantity() {
      return myData.get("orderQuantity");
    }
    /**
     * The item ordered.
     * @param orderItem value to set
     * @return this builder instance
     */
    @NotNull public Builder orderedItem(@NotNull OrderItem orderItem) {
      putValue("orderedItem", orderItem);
      return this;
    }
    /**
     * The item ordered.
     * @param orderItem value to set
     * @return this builder instance
     */
    @NotNull public Builder orderedItem(@NotNull OrderItem.Builder orderItem) {
      putValue("orderedItem", orderItem.build());
      return this;
    }
    /**
     * The item ordered.
     * @param product value to set
     * @return this builder instance
     */
    @NotNull public Builder orderedItem(@NotNull Product product) {
      putValue("orderedItem", product);
      return this;
    }
    /**
     * The item ordered.
     * @param product value to set
     * @return this builder instance
     */
    @NotNull public Builder orderedItem(@NotNull Product.Builder product) {
      putValue("orderedItem", product.build());
      return this;
    }
    /**
     * The item ordered.
     * @param service value to set
     * @return this builder instance
     */
    @NotNull public Builder orderedItem(@NotNull Service service) {
      putValue("orderedItem", service);
      return this;
    }
    /**
     * The item ordered.
     * @param service value to set
     * @return this builder instance
     */
    @NotNull public Builder orderedItem(@NotNull Service.Builder service) {
      putValue("orderedItem", service.build());
      return this;
    }
    /**
     * Remove orderedItem property from the builder.
     * If this property is repeatable, all instances are removed.
     * @return this builder instance
     */
    @NotNull public Builder removeOrderedItem() {
      removeValue("orderedItem");
      return this;
    }
    /**
     * Get currently set value for orderedItem property in this builder.
     * @return previously set value or {@code null}. If multiple values have been 
     * set to this property, then {@link java.util.Collection} instance will be 
     * returned.
     */
    @Nullable public java.lang.Object getOrderedItem() {
      return myData.get("orderedItem");
    }
    /**
     * The current status of the order item.
     * @param orderStatus value to set
     * @return this builder instance
     */
    @NotNull public Builder orderItemStatus(@NotNull OrderStatus orderStatus) {
      putValue("orderItemStatus", orderStatus);
      return this;
    }
    /**
     * Remove orderItemStatus property from the builder.
     * If this property is repeatable, all instances are removed.
     * @return this builder instance
     */
    @NotNull public Builder removeOrderItemStatus() {
      removeValue("orderItemStatus");
      return this;
    }
    /**
     * Get currently set value for orderItemStatus property in this builder.
     * @return previously set value or {@code null}. If multiple values have been 
     * set to this property, then {@link java.util.Collection} instance will be 
     * returned.
     */
    @Nullable public java.lang.Object getOrderItemStatus() {
      return myData.get("orderItemStatus");
    }
    /**
     * The delivery of the parcel related to this order or order item.
     * @param parcelDelivery value to set
     * @return this builder instance
     */
    @NotNull public Builder orderDelivery(@NotNull ParcelDelivery parcelDelivery) {
      putValue("orderDelivery", parcelDelivery);
      return this;
    }
    /**
     * The delivery of the parcel related to this order or order item.
     * @param parcelDelivery value to set
     * @return this builder instance
     */
    @NotNull public Builder orderDelivery(@NotNull ParcelDelivery.Builder parcelDelivery) {
      putValue("orderDelivery", parcelDelivery.build());
      return this;
    }
    /**
     * Remove orderDelivery property from the builder.
     * If this property is repeatable, all instances are removed.
     * @return this builder instance
     */
    @NotNull public Builder removeOrderDelivery() {
      removeValue("orderDelivery");
      return this;
    }
    /**
     * Get currently set value for orderDelivery property in this builder.
     * @return previously set value or {@code null}. If multiple values have been 
     * set to this property, then {@link java.util.Collection} instance will be 
     * returned.
     */
    @Nullable public java.lang.Object getOrderDelivery() {
      return myData.get("orderDelivery");
    }
    /**
     * The identifier of the order item.
     * @param orderItemNumber value to set
     * @return this builder instance
     */
    @NotNull public Builder orderItemNumber(@NotNull String orderItemNumber) {
      putValue("orderItemNumber", orderItemNumber);
      return this;
    }
    /**
     * Remove orderItemNumber property from the builder.
     * If this property is repeatable, all instances are removed.
     * @return this builder instance
     */
    @NotNull public Builder removeOrderItemNumber() {
      removeValue("orderItemNumber");
      return this;
    }
    /**
     * Get currently set value for orderItemNumber property in this builder.
     * @return previously set value or {@code null}. If multiple values have been 
     * set to this property, then {@link java.util.Collection} instance will be 
     * returned.
     */
    @Nullable public java.lang.Object getOrderItemNumber() {
      return myData.get("orderItemNumber");
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
      if ("orderQuantity".equals(key) && value instanceof Integer) { this.orderQuantity((Integer)value); return; }
      if ("orderQuantitys".equals(key) && value instanceof Integer) { this.orderQuantity((Integer)value); return; }
      if ("orderQuantity".equals(key) && value instanceof Long) { this.orderQuantity((Long)value); return; }
      if ("orderQuantitys".equals(key) && value instanceof Long) { this.orderQuantity((Long)value); return; }
      if ("orderQuantity".equals(key) && value instanceof Float) { this.orderQuantity((Float)value); return; }
      if ("orderQuantitys".equals(key) && value instanceof Float) { this.orderQuantity((Float)value); return; }
      if ("orderQuantity".equals(key) && value instanceof Double) { this.orderQuantity((Double)value); return; }
      if ("orderQuantitys".equals(key) && value instanceof Double) { this.orderQuantity((Double)value); return; }
      if ("orderQuantity".equals(key) && value instanceof String) { this.orderQuantity((String)value); return; }
      if ("orderQuantitys".equals(key) && value instanceof String) { this.orderQuantity((String)value); return; }
      if ("orderedItem".equals(key) && value instanceof OrderItem) { this.orderedItem((OrderItem)value); return; }
      if ("orderedItems".equals(key) && value instanceof OrderItem) { this.orderedItem((OrderItem)value); return; }
      if ("orderedItem".equals(key) && value instanceof Product) { this.orderedItem((Product)value); return; }
      if ("orderedItems".equals(key) && value instanceof Product) { this.orderedItem((Product)value); return; }
      if ("orderedItem".equals(key) && value instanceof Service) { this.orderedItem((Service)value); return; }
      if ("orderedItems".equals(key) && value instanceof Service) { this.orderedItem((Service)value); return; }
      if ("orderItemStatus".equals(key) && value instanceof OrderStatus) { this.orderItemStatus((OrderStatus)value); return; }
      if ("orderItemStatuss".equals(key) && value instanceof OrderStatus) { this.orderItemStatus((OrderStatus)value); return; }
      if ("orderDelivery".equals(key) && value instanceof ParcelDelivery) { this.orderDelivery((ParcelDelivery)value); return; }
      if ("orderDeliverys".equals(key) && value instanceof ParcelDelivery) { this.orderDelivery((ParcelDelivery)value); return; }
      if ("orderItemNumber".equals(key) && value instanceof String) { this.orderItemNumber((String)value); return; }
      if ("orderItemNumbers".equals(key) && value instanceof String) { this.orderItemNumber((String)value); return; }
      super.fromMap(key, value);
    }
  }
  
}
