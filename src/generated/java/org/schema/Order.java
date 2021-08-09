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
 * An order is a confirmation of a transaction (a receipt), which can contain multiple line items, each represented by an Offer that has been accepted by the customer.
 */
public class Order extends Intangible {
  /**
   * The offer(s) -- e.g., product, quantity and price combinations -- included in the order.
   * @return acceptedOffer property set by first invocation of acceptedOffer method or {@code null}.
   */
  @JsonIgnore public Offer getAcceptedOffer() {
    return (Offer) getValue("acceptedOffer");
  }
  /**
   * The offer(s) -- e.g., product, quantity and price combinations -- included in the order.
   * @return all acceptedOffer properties as {@link java.util.Collection} or an empty collection 
   * if acceptedOffer was not set.
   */
  @JsonIgnore public java.util.Collection<Offer> getAcceptedOffers() {
    final java.lang.Object current = myData.get("acceptedOffer");
    if (current == null) return Collections.emptyList();
    if (current instanceof java.util.Collection) {
      return (java.util.Collection<Offer>) current;
    }
    return Arrays.asList((Offer) current);
  }
  /**
   * The current status of the order.
   * @return orderStatus property set by first invocation of orderStatus method or {@code null}.
   */
  @JsonIgnore public OrderStatus getOrderStatus() {
    return (OrderStatus) getValue("orderStatus");
  }
  /**
   * The current status of the order.
   * @return all orderStatus properties as {@link java.util.Collection} or an empty collection 
   * if orderStatus was not set.
   */
  @JsonIgnore public java.util.Collection<OrderStatus> getOrderStatuss() {
    final java.lang.Object current = myData.get("orderStatus");
    if (current == null) return Collections.emptyList();
    if (current instanceof java.util.Collection) {
      return (java.util.Collection<OrderStatus>) current;
    }
    return Arrays.asList((OrderStatus) current);
  }
  /**
   * An identifier for the method of payment used (e.g. the last 4 digits of the credit card).
   * @return paymentMethodId property set by first invocation of paymentMethodId method or {@code null}.
   */
  @JsonIgnore public String getPaymentMethodId() {
    return (String) getValue("paymentMethodId");
  }
  /**
   * An identifier for the method of payment used (e.g. the last 4 digits of the credit card).
   * @return all paymentMethodId properties as {@link java.util.Collection} or an empty collection 
   * if paymentMethodId was not set.
   */
  @JsonIgnore public java.util.Collection<String> getPaymentMethodIds() {
    final java.lang.Object current = myData.get("paymentMethodId");
    if (current == null) return Collections.emptyList();
    if (current instanceof java.util.Collection) {
      return (java.util.Collection<String>) current;
    }
    return Arrays.asList((String) current);
  }
  /**
   * Party placing the order or paying the invoice.
   * @return customer property set by first invocation of customer method or {@code null}.
   */
  @JsonIgnore public Organization getCustomerOrganization() {
    return (Organization) getValue("customer");
  }
  /**
   * Party placing the order or paying the invoice.
   * @return all customer properties as {@link java.util.Collection} or an empty collection 
   * if customer was not set.
   */
  @JsonIgnore public java.util.Collection<Organization> getCustomerOrganizations() {
    final java.lang.Object current = myData.get("customer");
    if (current == null) return Collections.emptyList();
    if (current instanceof java.util.Collection) {
      return (java.util.Collection<Organization>) current;
    }
    return Arrays.asList((Organization) current);
  }
  /**
   * Party placing the order or paying the invoice.
   * @return customer property set by first invocation of customer method or {@code null}.
   */
  @JsonIgnore public Person getCustomerPerson() {
    return (Person) getValue("customer");
  }
  /**
   * Party placing the order or paying the invoice.
   * @return all customer properties as {@link java.util.Collection} or an empty collection 
   * if customer was not set.
   */
  @JsonIgnore public java.util.Collection<Person> getCustomerPersons() {
    final java.lang.Object current = myData.get("customer");
    if (current == null) return Collections.emptyList();
    if (current instanceof java.util.Collection) {
      return (java.util.Collection<Person>) current;
    }
    return Arrays.asList((Person) current);
  }
  /**
   * Was the offer accepted as a gift for someone other than the buyer.
   * @return isGift property set by first invocation of isGift method or {@code null}.
   */
  @JsonIgnore public Boolean getIsGift() {
    return (Boolean) getValue("isGift");
  }
  /**
   * Was the offer accepted as a gift for someone other than the buyer.
   * @return all isGift properties as {@link java.util.Collection} or an empty collection 
   * if isGift was not set.
   */
  @JsonIgnore public java.util.Collection<Boolean> getIsGifts() {
    final java.lang.Object current = myData.get("isGift");
    if (current == null) return Collections.emptyList();
    if (current instanceof java.util.Collection) {
      return (java.util.Collection<Boolean>) current;
    }
    return Arrays.asList((Boolean) current);
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
   * The URL for sending a payment.
   * @return paymentUrl property set by first invocation of paymentUrl method or {@code null}.
   */
  @JsonIgnore public String getPaymentUrl() {
    return (String) getValue("paymentUrl");
  }
  /**
   * The URL for sending a payment.
   * @return all paymentUrl properties as {@link java.util.Collection} or an empty collection 
   * if paymentUrl was not set.
   */
  @JsonIgnore public java.util.Collection<String> getPaymentUrls() {
    final java.lang.Object current = myData.get("paymentUrl");
    if (current == null) return Collections.emptyList();
    if (current instanceof java.util.Collection) {
      return (java.util.Collection<String>) current;
    }
    return Arrays.asList((String) current);
  }
  /**
   * Code used to redeem a discount.
   * @return discountCode property set by first invocation of discountCode method or {@code null}.
   */
  @JsonIgnore public String getDiscountCode() {
    return (String) getValue("discountCode");
  }
  /**
   * Code used to redeem a discount.
   * @return all discountCode properties as {@link java.util.Collection} or an empty collection 
   * if discountCode was not set.
   */
  @JsonIgnore public java.util.Collection<String> getDiscountCodes() {
    final java.lang.Object current = myData.get("discountCode");
    if (current == null) return Collections.emptyList();
    if (current instanceof java.util.Collection) {
      return (java.util.Collection<String>) current;
    }
    return Arrays.asList((String) current);
  }
  /**
   * The date that payment is due.
   * @return paymentDueDate property set by first invocation of paymentDueDate method or {@code null}.
   */
  @JsonIgnore public java.util.Date getPaymentDueDate() {
    return (java.util.Date) getValue("paymentDueDate");
  }
  /**
   * The date that payment is due.
   * @return all paymentDueDate properties as {@link java.util.Collection} or an empty collection 
   * if paymentDueDate was not set.
   */
  @JsonIgnore public java.util.Collection<java.util.Date> getPaymentDueDates() {
    final java.lang.Object current = myData.get("paymentDueDate");
    if (current == null) return Collections.emptyList();
    if (current instanceof java.util.Collection) {
      return (java.util.Collection<java.util.Date>) current;
    }
    return Arrays.asList((java.util.Date) current);
  }
  /**
   * The currency of the discount.\n\nUse standard formats: [ISO 4217 currency format](http://en.wikipedia.org/wiki/ISO_4217) e.g. &quot;USD&quot;; [Ticker symbol](https://en.wikipedia.org/wiki/List_of_cryptocurrencies) for cryptocurrencies e.g. &quot;BTC&quot;; well known names for [Local Exchange Tradings Systems](https://en.wikipedia.org/wiki/Local_exchange_trading_system) (LETS) and other currency types e.g. &quot;Ithaca HOUR&quot;.
   * @return discountCurrency property set by first invocation of discountCurrency method or {@code null}.
   */
  @JsonIgnore public String getDiscountCurrency() {
    return (String) getValue("discountCurrency");
  }
  /**
   * The currency of the discount.\n\nUse standard formats: [ISO 4217 currency format](http://en.wikipedia.org/wiki/ISO_4217) e.g. &quot;USD&quot;; [Ticker symbol](https://en.wikipedia.org/wiki/List_of_cryptocurrencies) for cryptocurrencies e.g. &quot;BTC&quot;; well known names for [Local Exchange Tradings Systems](https://en.wikipedia.org/wiki/Local_exchange_trading_system) (LETS) and other currency types e.g. &quot;Ithaca HOUR&quot;.
   * @return all discountCurrency properties as {@link java.util.Collection} or an empty collection 
   * if discountCurrency was not set.
   */
  @JsonIgnore public java.util.Collection<String> getDiscountCurrencys() {
    final java.lang.Object current = myData.get("discountCurrency");
    if (current == null) return Collections.emptyList();
    if (current instanceof java.util.Collection) {
      return (java.util.Collection<String>) current;
    }
    return Arrays.asList((String) current);
  }
  /**
   * Any discount applied (to an Order).
   * @return discount property set by first invocation of discount method or {@code null}.
   */
  @JsonIgnore public Integer getDiscountInteger() {
    return (Integer) getValue("discount");
  }
  /**
   * Any discount applied (to an Order).
   * @return all discount properties as {@link java.util.Collection} or an empty collection 
   * if discount was not set.
   */
  @JsonIgnore public java.util.Collection<Integer> getDiscountIntegers() {
    final java.lang.Object current = myData.get("discount");
    if (current == null) return Collections.emptyList();
    if (current instanceof java.util.Collection) {
      return (java.util.Collection<Integer>) current;
    }
    return Arrays.asList((Integer) current);
  }
  /**
   * Any discount applied (to an Order).
   * @return discount property set by first invocation of discount method or {@code null}.
   */
  @JsonIgnore public Long getDiscountLong() {
    return (Long) getValue("discount");
  }
  /**
   * Any discount applied (to an Order).
   * @return all discount properties as {@link java.util.Collection} or an empty collection 
   * if discount was not set.
   */
  @JsonIgnore public java.util.Collection<Long> getDiscountLongs() {
    final java.lang.Object current = myData.get("discount");
    if (current == null) return Collections.emptyList();
    if (current instanceof java.util.Collection) {
      return (java.util.Collection<Long>) current;
    }
    return Arrays.asList((Long) current);
  }
  /**
   * Any discount applied (to an Order).
   * @return discount property set by first invocation of discount method or {@code null}.
   */
  @JsonIgnore public Float getDiscountFloat() {
    return (Float) getValue("discount");
  }
  /**
   * Any discount applied (to an Order).
   * @return all discount properties as {@link java.util.Collection} or an empty collection 
   * if discount was not set.
   */
  @JsonIgnore public java.util.Collection<Float> getDiscountFloats() {
    final java.lang.Object current = myData.get("discount");
    if (current == null) return Collections.emptyList();
    if (current instanceof java.util.Collection) {
      return (java.util.Collection<Float>) current;
    }
    return Arrays.asList((Float) current);
  }
  /**
   * Any discount applied (to an Order).
   * @return discount property set by first invocation of discount method or {@code null}.
   */
  @JsonIgnore public Double getDiscountDouble() {
    return (Double) getValue("discount");
  }
  /**
   * Any discount applied (to an Order).
   * @return all discount properties as {@link java.util.Collection} or an empty collection 
   * if discount was not set.
   */
  @JsonIgnore public java.util.Collection<Double> getDiscountDoubles() {
    final java.lang.Object current = myData.get("discount");
    if (current == null) return Collections.emptyList();
    if (current instanceof java.util.Collection) {
      return (java.util.Collection<Double>) current;
    }
    return Arrays.asList((Double) current);
  }
  /**
   * Any discount applied (to an Order).
   * @return discount property set by first invocation of discount method or {@code null}.
   */
  @JsonIgnore public String getDiscountString() {
    return (String) getValue("discount");
  }
  /**
   * Any discount applied (to an Order).
   * @return all discount properties as {@link java.util.Collection} or an empty collection 
   * if discount was not set.
   */
  @JsonIgnore public java.util.Collection<String> getDiscountStrings() {
    final java.lang.Object current = myData.get("discount");
    if (current == null) return Collections.emptyList();
    if (current instanceof java.util.Collection) {
      return (java.util.Collection<String>) current;
    }
    return Arrays.asList((String) current);
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
   * Date order was placed.
   * @return orderDate property set by first invocation of orderDate method or {@code null}.
   */
  @JsonIgnore public java.util.Date getOrderDate() {
    return (java.util.Date) getValue("orderDate");
  }
  /**
   * Date order was placed.
   * @return all orderDate properties as {@link java.util.Collection} or an empty collection 
   * if orderDate was not set.
   */
  @JsonIgnore public java.util.Collection<java.util.Date> getOrderDates() {
    final java.lang.Object current = myData.get("orderDate");
    if (current == null) return Collections.emptyList();
    if (current instanceof java.util.Collection) {
      return (java.util.Collection<java.util.Date>) current;
    }
    return Arrays.asList((java.util.Date) current);
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
   * The order is being paid as part of the referenced Invoice.
   * @return partOfInvoice property set by first invocation of partOfInvoice method or {@code null}.
   */
  @JsonIgnore public Invoice getPartOfInvoice() {
    return (Invoice) getValue("partOfInvoice");
  }
  /**
   * The order is being paid as part of the referenced Invoice.
   * @return all partOfInvoice properties as {@link java.util.Collection} or an empty collection 
   * if partOfInvoice was not set.
   */
  @JsonIgnore public java.util.Collection<Invoice> getPartOfInvoices() {
    final java.lang.Object current = myData.get("partOfInvoice");
    if (current == null) return Collections.emptyList();
    if (current instanceof java.util.Collection) {
      return (java.util.Collection<Invoice>) current;
    }
    return Arrays.asList((Invoice) current);
  }
  /**
   * A number that confirms the given order or payment has been received.
   * @return confirmationNumber property set by first invocation of confirmationNumber method or {@code null}.
   */
  @JsonIgnore public Identifier getConfirmationNumber() {
    return (Identifier) getValue("confirmationNumber");
  }
  /**
   * A number that confirms the given order or payment has been received.
   * @return all confirmationNumber properties as {@link java.util.Collection} or an empty collection 
   * if confirmationNumber was not set.
   */
  @JsonIgnore public java.util.Collection<Identifier> getConfirmationNumbers() {
    final java.lang.Object current = myData.get("confirmationNumber");
    if (current == null) return Collections.emptyList();
    if (current instanceof java.util.Collection) {
      return (java.util.Collection<Identifier>) current;
    }
    return Arrays.asList((Identifier) current);
  }
  /**
   * The billing address for the order.
   * @return billingAddress property set by first invocation of billingAddress method or {@code null}.
   */
  @JsonIgnore public PostalAddress getBillingAddress() {
    return (PostalAddress) getValue("billingAddress");
  }
  /**
   * The billing address for the order.
   * @return all billingAddress properties as {@link java.util.Collection} or an empty collection 
   * if billingAddress was not set.
   */
  @JsonIgnore public java.util.Collection<PostalAddress> getBillingAddresss() {
    final java.lang.Object current = myData.get("billingAddress");
    if (current == null) return Collections.emptyList();
    if (current instanceof java.util.Collection) {
      return (java.util.Collection<PostalAddress>) current;
    }
    return Arrays.asList((PostalAddress) current);
  }
  /**
   * The name of the credit card or other method of payment for the order.
   * @return paymentMethod property set by first invocation of paymentMethod method or {@code null}.
   */
  @JsonIgnore public PaymentMethod getPaymentMethod() {
    return (PaymentMethod) getValue("paymentMethod");
  }
  /**
   * The name of the credit card or other method of payment for the order.
   * @return all paymentMethod properties as {@link java.util.Collection} or an empty collection 
   * if paymentMethod was not set.
   */
  @JsonIgnore public java.util.Collection<PaymentMethod> getPaymentMethods() {
    final java.lang.Object current = myData.get("paymentMethod");
    if (current == null) return Collections.emptyList();
    if (current instanceof java.util.Collection) {
      return (java.util.Collection<PaymentMethod>) current;
    }
    return Arrays.asList((PaymentMethod) current);
  }
  /**
   * The identifier of the transaction.
   * @return orderNumber property set by first invocation of orderNumber method or {@code null}.
   */
  @JsonIgnore public Identifier getOrderNumber() {
    return (Identifier) getValue("orderNumber");
  }
  /**
   * The identifier of the transaction.
   * @return all orderNumber properties as {@link java.util.Collection} or an empty collection 
   * if orderNumber was not set.
   */
  @JsonIgnore public java.util.Collection<Identifier> getOrderNumbers() {
    final java.lang.Object current = myData.get("orderNumber");
    if (current == null) return Collections.emptyList();
    if (current instanceof java.util.Collection) {
      return (java.util.Collection<Identifier>) current;
    }
    return Arrays.asList((Identifier) current);
  }
  /**
   * An entity that arranges for an exchange between a buyer and a seller.  In most cases a broker never acquires or releases ownership of a product or service involved in an exchange.  If it is not clear whether an entity is a broker, seller, or buyer, the latter two terms are preferred.
   * @return broker property set by first invocation of broker method or {@code null}.
   */
  @JsonIgnore public Organization getBrokerOrganization() {
    return (Organization) getValue("broker");
  }
  /**
   * An entity that arranges for an exchange between a buyer and a seller.  In most cases a broker never acquires or releases ownership of a product or service involved in an exchange.  If it is not clear whether an entity is a broker, seller, or buyer, the latter two terms are preferred.
   * @return all broker properties as {@link java.util.Collection} or an empty collection 
   * if broker was not set.
   */
  @JsonIgnore public java.util.Collection<Organization> getBrokerOrganizations() {
    final java.lang.Object current = myData.get("broker");
    if (current == null) return Collections.emptyList();
    if (current instanceof java.util.Collection) {
      return (java.util.Collection<Organization>) current;
    }
    return Arrays.asList((Organization) current);
  }
  /**
   * An entity that arranges for an exchange between a buyer and a seller.  In most cases a broker never acquires or releases ownership of a product or service involved in an exchange.  If it is not clear whether an entity is a broker, seller, or buyer, the latter two terms are preferred.
   * @return broker property set by first invocation of broker method or {@code null}.
   */
  @JsonIgnore public Person getBrokerPerson() {
    return (Person) getValue("broker");
  }
  /**
   * An entity that arranges for an exchange between a buyer and a seller.  In most cases a broker never acquires or releases ownership of a product or service involved in an exchange.  If it is not clear whether an entity is a broker, seller, or buyer, the latter two terms are preferred.
   * @return all broker properties as {@link java.util.Collection} or an empty collection 
   * if broker was not set.
   */
  @JsonIgnore public java.util.Collection<Person> getBrokerPersons() {
    final java.lang.Object current = myData.get("broker");
    if (current == null) return Collections.emptyList();
    if (current instanceof java.util.Collection) {
      return (java.util.Collection<Person>) current;
    }
    return Arrays.asList((Person) current);
  }
  protected Order(java.util.Map<String,java.lang.Object> data) {
    super(data);
  }
  
  /**
   * Builder for {@link Order}
   */
  public static class Builder extends Intangible.Builder {
    public Builder(@NotNull HashMap<String,java.lang.Object> data) {
      super(data);
    }
    @NotNull public Order build() {
      return new Order(myData);
    }
    /**
     * The offer(s) -- e.g., product, quantity and price combinations -- included in the order.
     * @param offer value to set
     * @return this builder instance
     */
    @NotNull public Builder acceptedOffer(@NotNull Offer offer) {
      putValue("acceptedOffer", offer);
      return this;
    }
    /**
     * The offer(s) -- e.g., product, quantity and price combinations -- included in the order.
     * @param offer value to set
     * @return this builder instance
     */
    @NotNull public Builder acceptedOffer(@NotNull Offer.Builder offer) {
      putValue("acceptedOffer", offer.build());
      return this;
    }
    /**
     * Remove acceptedOffer property from the builder.
     * If this property is repeatable, all instances are removed.
     * @return this builder instance
     */
    @NotNull public Builder removeAcceptedOffer() {
      removeValue("acceptedOffer");
      return this;
    }
    /**
     * Get currently set value for acceptedOffer property in this builder.
     * @return previously set value or {@code null}. If multiple values have been 
     * set to this property, then {@link java.util.Collection} instance will be 
     * returned.
     */
    @Nullable public java.lang.Object getAcceptedOffer() {
      return myData.get("acceptedOffer");
    }
    /**
     * The current status of the order.
     * @param orderStatus value to set
     * @return this builder instance
     */
    @NotNull public Builder orderStatus(@NotNull OrderStatus orderStatus) {
      putValue("orderStatus", orderStatus);
      return this;
    }
    /**
     * Remove orderStatus property from the builder.
     * If this property is repeatable, all instances are removed.
     * @return this builder instance
     */
    @NotNull public Builder removeOrderStatus() {
      removeValue("orderStatus");
      return this;
    }
    /**
     * Get currently set value for orderStatus property in this builder.
     * @return previously set value or {@code null}. If multiple values have been 
     * set to this property, then {@link java.util.Collection} instance will be 
     * returned.
     */
    @Nullable public java.lang.Object getOrderStatus() {
      return myData.get("orderStatus");
    }
    /**
     * An identifier for the method of payment used (e.g. the last 4 digits of the credit card).
     * @param paymentMethodId value to set
     * @return this builder instance
     */
    @NotNull public Builder paymentMethodId(@NotNull String paymentMethodId) {
      putValue("paymentMethodId", paymentMethodId);
      return this;
    }
    /**
     * Remove paymentMethodId property from the builder.
     * If this property is repeatable, all instances are removed.
     * @return this builder instance
     */
    @NotNull public Builder removePaymentMethodId() {
      removeValue("paymentMethodId");
      return this;
    }
    /**
     * Get currently set value for paymentMethodId property in this builder.
     * @return previously set value or {@code null}. If multiple values have been 
     * set to this property, then {@link java.util.Collection} instance will be 
     * returned.
     */
    @Nullable public java.lang.Object getPaymentMethodId() {
      return myData.get("paymentMethodId");
    }
    /**
     * Party placing the order or paying the invoice.
     * @param organization value to set
     * @return this builder instance
     */
    @NotNull public Builder customer(@NotNull Organization organization) {
      putValue("customer", organization);
      return this;
    }
    /**
     * Party placing the order or paying the invoice.
     * @param organization value to set
     * @return this builder instance
     */
    @NotNull public Builder customer(@NotNull Organization.Builder organization) {
      putValue("customer", organization.build());
      return this;
    }
    /**
     * Party placing the order or paying the invoice.
     * @param person value to set
     * @return this builder instance
     */
    @NotNull public Builder customer(@NotNull Person person) {
      putValue("customer", person);
      return this;
    }
    /**
     * Party placing the order or paying the invoice.
     * @param person value to set
     * @return this builder instance
     */
    @NotNull public Builder customer(@NotNull Person.Builder person) {
      putValue("customer", person.build());
      return this;
    }
    /**
     * Remove customer property from the builder.
     * If this property is repeatable, all instances are removed.
     * @return this builder instance
     */
    @NotNull public Builder removeCustomer() {
      removeValue("customer");
      return this;
    }
    /**
     * Get currently set value for customer property in this builder.
     * @return previously set value or {@code null}. If multiple values have been 
     * set to this property, then {@link java.util.Collection} instance will be 
     * returned.
     */
    @Nullable public java.lang.Object getCustomer() {
      return myData.get("customer");
    }
    /**
     * Was the offer accepted as a gift for someone other than the buyer.
     * @param isGift value to set
     * @return this builder instance
     */
    @NotNull public Builder isGift(@NotNull Boolean isGift) {
      putValue("isGift", isGift);
      return this;
    }
    /**
     * Remove isGift property from the builder.
     * If this property is repeatable, all instances are removed.
     * @return this builder instance
     */
    @NotNull public Builder removeIsGift() {
      removeValue("isGift");
      return this;
    }
    /**
     * Get currently set value for isGift property in this builder.
     * @return previously set value or {@code null}. If multiple values have been 
     * set to this property, then {@link java.util.Collection} instance will be 
     * returned.
     */
    @Nullable public java.lang.Object getIsGift() {
      return myData.get("isGift");
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
     * The URL for sending a payment.
     * @param paymentUrl value to set
     * @return this builder instance
     */
    @NotNull public Builder paymentUrl(@NotNull String paymentUrl) {
      putValue("paymentUrl", paymentUrl);
      return this;
    }
    /**
     * Remove paymentUrl property from the builder.
     * If this property is repeatable, all instances are removed.
     * @return this builder instance
     */
    @NotNull public Builder removePaymentUrl() {
      removeValue("paymentUrl");
      return this;
    }
    /**
     * Get currently set value for paymentUrl property in this builder.
     * @return previously set value or {@code null}. If multiple values have been 
     * set to this property, then {@link java.util.Collection} instance will be 
     * returned.
     */
    @Nullable public java.lang.Object getPaymentUrl() {
      return myData.get("paymentUrl");
    }
    /**
     * Code used to redeem a discount.
     * @param discountCode value to set
     * @return this builder instance
     */
    @NotNull public Builder discountCode(@NotNull String discountCode) {
      putValue("discountCode", discountCode);
      return this;
    }
    /**
     * Remove discountCode property from the builder.
     * If this property is repeatable, all instances are removed.
     * @return this builder instance
     */
    @NotNull public Builder removeDiscountCode() {
      removeValue("discountCode");
      return this;
    }
    /**
     * Get currently set value for discountCode property in this builder.
     * @return previously set value or {@code null}. If multiple values have been 
     * set to this property, then {@link java.util.Collection} instance will be 
     * returned.
     */
    @Nullable public java.lang.Object getDiscountCode() {
      return myData.get("discountCode");
    }
    /**
     * The date that payment is due.
     * @param date value to set
     * @return this builder instance
     */
    @NotNull public Builder paymentDueDate(@NotNull java.util.Date date) {
      putValue("paymentDueDate", date);
      return this;
    }
    /**
     * Remove paymentDueDate property from the builder.
     * If this property is repeatable, all instances are removed.
     * @return this builder instance
     */
    @NotNull public Builder removePaymentDueDate() {
      removeValue("paymentDueDate");
      return this;
    }
    /**
     * Get currently set value for paymentDueDate property in this builder.
     * @return previously set value or {@code null}. If multiple values have been 
     * set to this property, then {@link java.util.Collection} instance will be 
     * returned.
     */
    @Nullable public java.lang.Object getPaymentDueDate() {
      return myData.get("paymentDueDate");
    }
    /**
     * The currency of the discount.\n\nUse standard formats: [ISO 4217 currency format](http://en.wikipedia.org/wiki/ISO_4217) e.g. &quot;USD&quot;; [Ticker symbol](https://en.wikipedia.org/wiki/List_of_cryptocurrencies) for cryptocurrencies e.g. &quot;BTC&quot;; well known names for [Local Exchange Tradings Systems](https://en.wikipedia.org/wiki/Local_exchange_trading_system) (LETS) and other currency types e.g. &quot;Ithaca HOUR&quot;.
     * @param discountCurrency value to set
     * @return this builder instance
     */
    @NotNull public Builder discountCurrency(@NotNull String discountCurrency) {
      putValue("discountCurrency", discountCurrency);
      return this;
    }
    /**
     * Remove discountCurrency property from the builder.
     * If this property is repeatable, all instances are removed.
     * @return this builder instance
     */
    @NotNull public Builder removeDiscountCurrency() {
      removeValue("discountCurrency");
      return this;
    }
    /**
     * Get currently set value for discountCurrency property in this builder.
     * @return previously set value or {@code null}. If multiple values have been 
     * set to this property, then {@link java.util.Collection} instance will be 
     * returned.
     */
    @Nullable public java.lang.Object getDiscountCurrency() {
      return myData.get("discountCurrency");
    }
    /**
     * Any discount applied (to an Order).
     * @param integer value to set
     * @return this builder instance
     */
    @NotNull public Builder discount(@NotNull Integer integer) {
      putValue("discount", integer);
      return this;
    }
    /**
     * Any discount applied (to an Order).
     * @param discount value to set
     * @return this builder instance
     */
    @NotNull public Builder discount(@NotNull Long discount) {
      putValue("discount", discount);
      return this;
    }
    /**
     * Any discount applied (to an Order).
     * @param discount value to set
     * @return this builder instance
     */
    @NotNull public Builder discount(@NotNull Float discount) {
      putValue("discount", discount);
      return this;
    }
    /**
     * Any discount applied (to an Order).
     * @param discount value to set
     * @return this builder instance
     */
    @NotNull public Builder discount(@NotNull Double discount) {
      putValue("discount", discount);
      return this;
    }
    /**
     * Any discount applied (to an Order).
     * @param discount value to set
     * @return this builder instance
     */
    @NotNull public Builder discount(@NotNull String discount) {
      putValue("discount", discount);
      return this;
    }
    /**
     * Remove discount property from the builder.
     * If this property is repeatable, all instances are removed.
     * @return this builder instance
     */
    @NotNull public Builder removeDiscount() {
      removeValue("discount");
      return this;
    }
    /**
     * Get currently set value for discount property in this builder.
     * @return previously set value or {@code null}. If multiple values have been 
     * set to this property, then {@link java.util.Collection} instance will be 
     * returned.
     */
    @Nullable public java.lang.Object getDiscount() {
      return myData.get("discount");
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
     * Date order was placed.
     * @param date value to set
     * @return this builder instance
     */
    @NotNull public Builder orderDate(@NotNull java.util.Date date) {
      putValue("orderDate", date);
      return this;
    }
    /**
     * Remove orderDate property from the builder.
     * If this property is repeatable, all instances are removed.
     * @return this builder instance
     */
    @NotNull public Builder removeOrderDate() {
      removeValue("orderDate");
      return this;
    }
    /**
     * Get currently set value for orderDate property in this builder.
     * @return previously set value or {@code null}. If multiple values have been 
     * set to this property, then {@link java.util.Collection} instance will be 
     * returned.
     */
    @Nullable public java.lang.Object getOrderDate() {
      return myData.get("orderDate");
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
     * The order is being paid as part of the referenced Invoice.
     * @param invoice value to set
     * @return this builder instance
     */
    @NotNull public Builder partOfInvoice(@NotNull Invoice invoice) {
      putValue("partOfInvoice", invoice);
      return this;
    }
    /**
     * The order is being paid as part of the referenced Invoice.
     * @param invoice value to set
     * @return this builder instance
     */
    @NotNull public Builder partOfInvoice(@NotNull Invoice.Builder invoice) {
      putValue("partOfInvoice", invoice.build());
      return this;
    }
    /**
     * Remove partOfInvoice property from the builder.
     * If this property is repeatable, all instances are removed.
     * @return this builder instance
     */
    @NotNull public Builder removePartOfInvoice() {
      removeValue("partOfInvoice");
      return this;
    }
    /**
     * Get currently set value for partOfInvoice property in this builder.
     * @return previously set value or {@code null}. If multiple values have been 
     * set to this property, then {@link java.util.Collection} instance will be 
     * returned.
     */
    @Nullable public java.lang.Object getPartOfInvoice() {
      return myData.get("partOfInvoice");
    }
    /**
     * A number that confirms the given order or payment has been received.
     * @param identifier value to set
     * @return this builder instance
     */
    @NotNull public Builder confirmationNumber(@NotNull Identifier identifier) {
      putValue("confirmationNumber", identifier);
      return this;
    }
    /**
     * Remove confirmationNumber property from the builder.
     * If this property is repeatable, all instances are removed.
     * @return this builder instance
     */
    @NotNull public Builder removeConfirmationNumber() {
      removeValue("confirmationNumber");
      return this;
    }
    /**
     * Get currently set value for confirmationNumber property in this builder.
     * @return previously set value or {@code null}. If multiple values have been 
     * set to this property, then {@link java.util.Collection} instance will be 
     * returned.
     */
    @Nullable public java.lang.Object getConfirmationNumber() {
      return myData.get("confirmationNumber");
    }
    /**
     * The billing address for the order.
     * @param postalAddress value to set
     * @return this builder instance
     */
    @NotNull public Builder billingAddress(@NotNull PostalAddress postalAddress) {
      putValue("billingAddress", postalAddress);
      return this;
    }
    /**
     * The billing address for the order.
     * @param postalAddress value to set
     * @return this builder instance
     */
    @NotNull public Builder billingAddress(@NotNull PostalAddress.Builder postalAddress) {
      putValue("billingAddress", postalAddress.build());
      return this;
    }
    /**
     * Remove billingAddress property from the builder.
     * If this property is repeatable, all instances are removed.
     * @return this builder instance
     */
    @NotNull public Builder removeBillingAddress() {
      removeValue("billingAddress");
      return this;
    }
    /**
     * Get currently set value for billingAddress property in this builder.
     * @return previously set value or {@code null}. If multiple values have been 
     * set to this property, then {@link java.util.Collection} instance will be 
     * returned.
     */
    @Nullable public java.lang.Object getBillingAddress() {
      return myData.get("billingAddress");
    }
    /**
     * The name of the credit card or other method of payment for the order.
     * @param paymentMethod value to set
     * @return this builder instance
     */
    @NotNull public Builder paymentMethod(@NotNull PaymentMethod paymentMethod) {
      putValue("paymentMethod", paymentMethod);
      return this;
    }
    /**
     * Remove paymentMethod property from the builder.
     * If this property is repeatable, all instances are removed.
     * @return this builder instance
     */
    @NotNull public Builder removePaymentMethod() {
      removeValue("paymentMethod");
      return this;
    }
    /**
     * Get currently set value for paymentMethod property in this builder.
     * @return previously set value or {@code null}. If multiple values have been 
     * set to this property, then {@link java.util.Collection} instance will be 
     * returned.
     */
    @Nullable public java.lang.Object getPaymentMethod() {
      return myData.get("paymentMethod");
    }
    /**
     * The identifier of the transaction.
     * @param identifier value to set
     * @return this builder instance
     */
    @NotNull public Builder orderNumber(@NotNull Identifier identifier) {
      putValue("orderNumber", identifier);
      return this;
    }
    /**
     * Remove orderNumber property from the builder.
     * If this property is repeatable, all instances are removed.
     * @return this builder instance
     */
    @NotNull public Builder removeOrderNumber() {
      removeValue("orderNumber");
      return this;
    }
    /**
     * Get currently set value for orderNumber property in this builder.
     * @return previously set value or {@code null}. If multiple values have been 
     * set to this property, then {@link java.util.Collection} instance will be 
     * returned.
     */
    @Nullable public java.lang.Object getOrderNumber() {
      return myData.get("orderNumber");
    }
    /**
     * An entity that arranges for an exchange between a buyer and a seller.  In most cases a broker never acquires or releases ownership of a product or service involved in an exchange.  If it is not clear whether an entity is a broker, seller, or buyer, the latter two terms are preferred.
     * @param organization value to set
     * @return this builder instance
     */
    @NotNull public Builder broker(@NotNull Organization organization) {
      putValue("broker", organization);
      return this;
    }
    /**
     * An entity that arranges for an exchange between a buyer and a seller.  In most cases a broker never acquires or releases ownership of a product or service involved in an exchange.  If it is not clear whether an entity is a broker, seller, or buyer, the latter two terms are preferred.
     * @param organization value to set
     * @return this builder instance
     */
    @NotNull public Builder broker(@NotNull Organization.Builder organization) {
      putValue("broker", organization.build());
      return this;
    }
    /**
     * An entity that arranges for an exchange between a buyer and a seller.  In most cases a broker never acquires or releases ownership of a product or service involved in an exchange.  If it is not clear whether an entity is a broker, seller, or buyer, the latter two terms are preferred.
     * @param person value to set
     * @return this builder instance
     */
    @NotNull public Builder broker(@NotNull Person person) {
      putValue("broker", person);
      return this;
    }
    /**
     * An entity that arranges for an exchange between a buyer and a seller.  In most cases a broker never acquires or releases ownership of a product or service involved in an exchange.  If it is not clear whether an entity is a broker, seller, or buyer, the latter two terms are preferred.
     * @param person value to set
     * @return this builder instance
     */
    @NotNull public Builder broker(@NotNull Person.Builder person) {
      putValue("broker", person.build());
      return this;
    }
    /**
     * Remove broker property from the builder.
     * If this property is repeatable, all instances are removed.
     * @return this builder instance
     */
    @NotNull public Builder removeBroker() {
      removeValue("broker");
      return this;
    }
    /**
     * Get currently set value for broker property in this builder.
     * @return previously set value or {@code null}. If multiple values have been 
     * set to this property, then {@link java.util.Collection} instance will be 
     * returned.
     */
    @Nullable public java.lang.Object getBroker() {
      return myData.get("broker");
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
      if ("acceptedOffer".equals(key) && value instanceof Offer) { this.acceptedOffer((Offer)value); return; }
      if ("acceptedOffers".equals(key) && value instanceof Offer) { this.acceptedOffer((Offer)value); return; }
      if ("orderStatus".equals(key) && value instanceof OrderStatus) { this.orderStatus((OrderStatus)value); return; }
      if ("orderStatuss".equals(key) && value instanceof OrderStatus) { this.orderStatus((OrderStatus)value); return; }
      if ("paymentMethodId".equals(key) && value instanceof String) { this.paymentMethodId((String)value); return; }
      if ("paymentMethodIds".equals(key) && value instanceof String) { this.paymentMethodId((String)value); return; }
      if ("customer".equals(key) && value instanceof Organization) { this.customer((Organization)value); return; }
      if ("customers".equals(key) && value instanceof Organization) { this.customer((Organization)value); return; }
      if ("customer".equals(key) && value instanceof Person) { this.customer((Person)value); return; }
      if ("customers".equals(key) && value instanceof Person) { this.customer((Person)value); return; }
      if ("isGift".equals(key) && value instanceof Boolean) { this.isGift((Boolean)value); return; }
      if ("isGifts".equals(key) && value instanceof Boolean) { this.isGift((Boolean)value); return; }
      if ("orderedItem".equals(key) && value instanceof OrderItem) { this.orderedItem((OrderItem)value); return; }
      if ("orderedItems".equals(key) && value instanceof OrderItem) { this.orderedItem((OrderItem)value); return; }
      if ("orderedItem".equals(key) && value instanceof Product) { this.orderedItem((Product)value); return; }
      if ("orderedItems".equals(key) && value instanceof Product) { this.orderedItem((Product)value); return; }
      if ("orderedItem".equals(key) && value instanceof Service) { this.orderedItem((Service)value); return; }
      if ("orderedItems".equals(key) && value instanceof Service) { this.orderedItem((Service)value); return; }
      if ("paymentUrl".equals(key) && value instanceof String) { this.paymentUrl((String)value); return; }
      if ("paymentUrls".equals(key) && value instanceof String) { this.paymentUrl((String)value); return; }
      if ("discountCode".equals(key) && value instanceof String) { this.discountCode((String)value); return; }
      if ("discountCodes".equals(key) && value instanceof String) { this.discountCode((String)value); return; }
      if ("paymentDueDate".equals(key) && value instanceof java.util.Date) { this.paymentDueDate((java.util.Date)value); return; }
      if ("paymentDueDates".equals(key) && value instanceof java.util.Date) { this.paymentDueDate((java.util.Date)value); return; }
      if ("discountCurrency".equals(key) && value instanceof String) { this.discountCurrency((String)value); return; }
      if ("discountCurrencys".equals(key) && value instanceof String) { this.discountCurrency((String)value); return; }
      if ("discount".equals(key) && value instanceof Integer) { this.discount((Integer)value); return; }
      if ("discounts".equals(key) && value instanceof Integer) { this.discount((Integer)value); return; }
      if ("discount".equals(key) && value instanceof Long) { this.discount((Long)value); return; }
      if ("discounts".equals(key) && value instanceof Long) { this.discount((Long)value); return; }
      if ("discount".equals(key) && value instanceof Float) { this.discount((Float)value); return; }
      if ("discounts".equals(key) && value instanceof Float) { this.discount((Float)value); return; }
      if ("discount".equals(key) && value instanceof Double) { this.discount((Double)value); return; }
      if ("discounts".equals(key) && value instanceof Double) { this.discount((Double)value); return; }
      if ("discount".equals(key) && value instanceof String) { this.discount((String)value); return; }
      if ("discounts".equals(key) && value instanceof String) { this.discount((String)value); return; }
      if ("orderDelivery".equals(key) && value instanceof ParcelDelivery) { this.orderDelivery((ParcelDelivery)value); return; }
      if ("orderDeliverys".equals(key) && value instanceof ParcelDelivery) { this.orderDelivery((ParcelDelivery)value); return; }
      if ("orderDate".equals(key) && value instanceof java.util.Date) { this.orderDate((java.util.Date)value); return; }
      if ("orderDates".equals(key) && value instanceof java.util.Date) { this.orderDate((java.util.Date)value); return; }
      if ("seller".equals(key) && value instanceof Participant) { this.seller((Participant)value); return; }
      if ("sellers".equals(key) && value instanceof Participant) { this.seller((Participant)value); return; }
      if ("partOfInvoice".equals(key) && value instanceof Invoice) { this.partOfInvoice((Invoice)value); return; }
      if ("partOfInvoices".equals(key) && value instanceof Invoice) { this.partOfInvoice((Invoice)value); return; }
      if ("confirmationNumber".equals(key) && value instanceof Identifier) { this.confirmationNumber((Identifier)value); return; }
      if ("confirmationNumbers".equals(key) && value instanceof Identifier) { this.confirmationNumber((Identifier)value); return; }
      if ("billingAddress".equals(key) && value instanceof PostalAddress) { this.billingAddress((PostalAddress)value); return; }
      if ("billingAddresss".equals(key) && value instanceof PostalAddress) { this.billingAddress((PostalAddress)value); return; }
      if ("paymentMethod".equals(key) && value instanceof PaymentMethod) { this.paymentMethod((PaymentMethod)value); return; }
      if ("paymentMethods".equals(key) && value instanceof PaymentMethod) { this.paymentMethod((PaymentMethod)value); return; }
      if ("orderNumber".equals(key) && value instanceof Identifier) { this.orderNumber((Identifier)value); return; }
      if ("orderNumbers".equals(key) && value instanceof Identifier) { this.orderNumber((Identifier)value); return; }
      if ("broker".equals(key) && value instanceof Organization) { this.broker((Organization)value); return; }
      if ("brokers".equals(key) && value instanceof Organization) { this.broker((Organization)value); return; }
      if ("broker".equals(key) && value instanceof Person) { this.broker((Person)value); return; }
      if ("brokers".equals(key) && value instanceof Person) { this.broker((Person)value); return; }
      super.fromMap(key, value);
    }
  }
  
}
