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
 * An order is a confirmation of a transaction (a receipt), which can contain multiple line items, each represented by an Offer that has been accepted by the customer.
 */
public class Order extends Intangible {
  /**
   * The offer(s) -- e.g., product, quantity and price combinations -- included in the order.
   */
  @JsonIgnore public Offer getAcceptedOffer() {
    return (Offer) getValue("acceptedOffer");
  }
  /**
   * The offer(s) -- e.g., product, quantity and price combinations -- included in the order.
   */
  @JsonIgnore public java.util.Collection<Offer> getAcceptedOffers() {
    final Object current = myData.get("acceptedOffer");
    if (current == null) return Collections.emptyList();
    if (current instanceof java.util.Collection) {
      return (java.util.Collection<Offer>) current;
    }
    return Arrays.asList((Offer) current);
  }
  /**
   * The current status of the order.
   */
  @JsonIgnore public OrderStatus getOrderStatus() {
    return (OrderStatus) getValue("orderStatus");
  }
  /**
   * The current status of the order.
   */
  @JsonIgnore public java.util.Collection<OrderStatus> getOrderStatuss() {
    final Object current = myData.get("orderStatus");
    if (current == null) return Collections.emptyList();
    if (current instanceof java.util.Collection) {
      return (java.util.Collection<OrderStatus>) current;
    }
    return Arrays.asList((OrderStatus) current);
  }
  /**
   * An identifier for the method of payment used (e.g. the last 4 digits of the credit card).
   */
  @JsonIgnore public String getPaymentMethodId() {
    return (String) getValue("paymentMethodId");
  }
  /**
   * An identifier for the method of payment used (e.g. the last 4 digits of the credit card).
   */
  @JsonIgnore public java.util.Collection<String> getPaymentMethodIds() {
    final Object current = myData.get("paymentMethodId");
    if (current == null) return Collections.emptyList();
    if (current instanceof java.util.Collection) {
      return (java.util.Collection<String>) current;
    }
    return Arrays.asList((String) current);
  }
  /**
   * Party placing the order or paying the invoice.
   */
  @JsonIgnore public Organization getCustomerOrganization() {
    return (Organization) getValue("customer");
  }
  /**
   * Party placing the order or paying the invoice.
   */
  @JsonIgnore public java.util.Collection<Organization> getCustomerOrganizations() {
    final Object current = myData.get("customer");
    if (current == null) return Collections.emptyList();
    if (current instanceof java.util.Collection) {
      return (java.util.Collection<Organization>) current;
    }
    return Arrays.asList((Organization) current);
  }
  /**
   * Party placing the order or paying the invoice.
   */
  @JsonIgnore public Person getCustomerPerson() {
    return (Person) getValue("customer");
  }
  /**
   * Party placing the order or paying the invoice.
   */
  @JsonIgnore public java.util.Collection<Person> getCustomerPersons() {
    final Object current = myData.get("customer");
    if (current == null) return Collections.emptyList();
    if (current instanceof java.util.Collection) {
      return (java.util.Collection<Person>) current;
    }
    return Arrays.asList((Person) current);
  }
  /**
   * Was the offer accepted as a gift for someone other than the buyer.
   */
  @JsonIgnore public Boolean getIsGift() {
    return (Boolean) getValue("isGift");
  }
  /**
   * Was the offer accepted as a gift for someone other than the buyer.
   */
  @JsonIgnore public java.util.Collection<Boolean> getIsGifts() {
    final Object current = myData.get("isGift");
    if (current == null) return Collections.emptyList();
    if (current instanceof java.util.Collection) {
      return (java.util.Collection<Boolean>) current;
    }
    return Arrays.asList((Boolean) current);
  }
  /**
   * The item ordered.
   */
  @JsonIgnore public OrderItem getOrderedItemOrderItem() {
    return (OrderItem) getValue("orderedItem");
  }
  /**
   * The item ordered.
   */
  @JsonIgnore public java.util.Collection<OrderItem> getOrderedItemOrderItems() {
    final Object current = myData.get("orderedItem");
    if (current == null) return Collections.emptyList();
    if (current instanceof java.util.Collection) {
      return (java.util.Collection<OrderItem>) current;
    }
    return Arrays.asList((OrderItem) current);
  }
  /**
   * The item ordered.
   */
  @JsonIgnore public Product getOrderedItemProduct() {
    return (Product) getValue("orderedItem");
  }
  /**
   * The item ordered.
   */
  @JsonIgnore public java.util.Collection<Product> getOrderedItemProducts() {
    final Object current = myData.get("orderedItem");
    if (current == null) return Collections.emptyList();
    if (current instanceof java.util.Collection) {
      return (java.util.Collection<Product>) current;
    }
    return Arrays.asList((Product) current);
  }
  /**
   * The item ordered.
   */
  @JsonIgnore public Service getOrderedItemService() {
    return (Service) getValue("orderedItem");
  }
  /**
   * The item ordered.
   */
  @JsonIgnore public java.util.Collection<Service> getOrderedItemServices() {
    final Object current = myData.get("orderedItem");
    if (current == null) return Collections.emptyList();
    if (current instanceof java.util.Collection) {
      return (java.util.Collection<Service>) current;
    }
    return Arrays.asList((Service) current);
  }
  /**
   * The URL for sending a payment.
   */
  @JsonIgnore public String getPaymentUrl() {
    return (String) getValue("paymentUrl");
  }
  /**
   * The URL for sending a payment.
   */
  @JsonIgnore public java.util.Collection<String> getPaymentUrls() {
    final Object current = myData.get("paymentUrl");
    if (current == null) return Collections.emptyList();
    if (current instanceof java.util.Collection) {
      return (java.util.Collection<String>) current;
    }
    return Arrays.asList((String) current);
  }
  /**
   * Code used to redeem a discount.
   */
  @JsonIgnore public String getDiscountCode() {
    return (String) getValue("discountCode");
  }
  /**
   * Code used to redeem a discount.
   */
  @JsonIgnore public java.util.Collection<String> getDiscountCodes() {
    final Object current = myData.get("discountCode");
    if (current == null) return Collections.emptyList();
    if (current instanceof java.util.Collection) {
      return (java.util.Collection<String>) current;
    }
    return Arrays.asList((String) current);
  }
  /**
   * The date that payment is due.
   */
  @JsonIgnore public java.util.Date getPaymentDueDate() {
    return (java.util.Date) getValue("paymentDueDate");
  }
  /**
   * The date that payment is due.
   */
  @JsonIgnore public java.util.Collection<java.util.Date> getPaymentDueDates() {
    final Object current = myData.get("paymentDueDate");
    if (current == null) return Collections.emptyList();
    if (current instanceof java.util.Collection) {
      return (java.util.Collection<java.util.Date>) current;
    }
    return Arrays.asList((java.util.Date) current);
  }
  /**
   * The currency of the discount.\n\nUse standard formats: [ISO 4217 currency format](http://en.wikipedia.org/wiki/ISO_4217) e.g. &quot;USD&quot;; [Ticker symbol](https://en.wikipedia.org/wiki/List_of_cryptocurrencies) for cryptocurrencies e.g. &quot;BTC&quot;; well known names for [Local Exchange Tradings Systems](https://en.wikipedia.org/wiki/Local_exchange_trading_system) (LETS) and other currency types e.g. &quot;Ithaca HOUR&quot;.
   */
  @JsonIgnore public String getDiscountCurrency() {
    return (String) getValue("discountCurrency");
  }
  /**
   * The currency of the discount.\n\nUse standard formats: [ISO 4217 currency format](http://en.wikipedia.org/wiki/ISO_4217) e.g. &quot;USD&quot;; [Ticker symbol](https://en.wikipedia.org/wiki/List_of_cryptocurrencies) for cryptocurrencies e.g. &quot;BTC&quot;; well known names for [Local Exchange Tradings Systems](https://en.wikipedia.org/wiki/Local_exchange_trading_system) (LETS) and other currency types e.g. &quot;Ithaca HOUR&quot;.
   */
  @JsonIgnore public java.util.Collection<String> getDiscountCurrencys() {
    final Object current = myData.get("discountCurrency");
    if (current == null) return Collections.emptyList();
    if (current instanceof java.util.Collection) {
      return (java.util.Collection<String>) current;
    }
    return Arrays.asList((String) current);
  }
  /**
   * Any discount applied (to an Order).
   */
  @JsonIgnore public Integer getDiscountInteger() {
    return (Integer) getValue("discount");
  }
  /**
   * Any discount applied (to an Order).
   */
  @JsonIgnore public java.util.Collection<Integer> getDiscountIntegers() {
    final Object current = myData.get("discount");
    if (current == null) return Collections.emptyList();
    if (current instanceof java.util.Collection) {
      return (java.util.Collection<Integer>) current;
    }
    return Arrays.asList((Integer) current);
  }
  /**
   * Any discount applied (to an Order).
   */
  @JsonIgnore public Long getDiscountLong() {
    return (Long) getValue("discount");
  }
  /**
   * Any discount applied (to an Order).
   */
  @JsonIgnore public java.util.Collection<Long> getDiscountLongs() {
    final Object current = myData.get("discount");
    if (current == null) return Collections.emptyList();
    if (current instanceof java.util.Collection) {
      return (java.util.Collection<Long>) current;
    }
    return Arrays.asList((Long) current);
  }
  /**
   * Any discount applied (to an Order).
   */
  @JsonIgnore public Float getDiscountFloat() {
    return (Float) getValue("discount");
  }
  /**
   * Any discount applied (to an Order).
   */
  @JsonIgnore public java.util.Collection<Float> getDiscountFloats() {
    final Object current = myData.get("discount");
    if (current == null) return Collections.emptyList();
    if (current instanceof java.util.Collection) {
      return (java.util.Collection<Float>) current;
    }
    return Arrays.asList((Float) current);
  }
  /**
   * Any discount applied (to an Order).
   */
  @JsonIgnore public Double getDiscountDouble() {
    return (Double) getValue("discount");
  }
  /**
   * Any discount applied (to an Order).
   */
  @JsonIgnore public java.util.Collection<Double> getDiscountDoubles() {
    final Object current = myData.get("discount");
    if (current == null) return Collections.emptyList();
    if (current instanceof java.util.Collection) {
      return (java.util.Collection<Double>) current;
    }
    return Arrays.asList((Double) current);
  }
  /**
   * Any discount applied (to an Order).
   */
  @JsonIgnore public String getDiscountString() {
    return (String) getValue("discount");
  }
  /**
   * Any discount applied (to an Order).
   */
  @JsonIgnore public java.util.Collection<String> getDiscountStrings() {
    final Object current = myData.get("discount");
    if (current == null) return Collections.emptyList();
    if (current instanceof java.util.Collection) {
      return (java.util.Collection<String>) current;
    }
    return Arrays.asList((String) current);
  }
  /**
   * The delivery of the parcel related to this order or order item.
   */
  @JsonIgnore public ParcelDelivery getOrderDelivery() {
    return (ParcelDelivery) getValue("orderDelivery");
  }
  /**
   * The delivery of the parcel related to this order or order item.
   */
  @JsonIgnore public java.util.Collection<ParcelDelivery> getOrderDeliverys() {
    final Object current = myData.get("orderDelivery");
    if (current == null) return Collections.emptyList();
    if (current instanceof java.util.Collection) {
      return (java.util.Collection<ParcelDelivery>) current;
    }
    return Arrays.asList((ParcelDelivery) current);
  }
  /**
   * Date order was placed.
   */
  @JsonIgnore public java.util.Date getOrderDate() {
    return (java.util.Date) getValue("orderDate");
  }
  /**
   * Date order was placed.
   */
  @JsonIgnore public java.util.Collection<java.util.Date> getOrderDates() {
    final Object current = myData.get("orderDate");
    if (current == null) return Collections.emptyList();
    if (current instanceof java.util.Collection) {
      return (java.util.Collection<java.util.Date>) current;
    }
    return Arrays.asList((java.util.Date) current);
  }
  /**
   * An entity which offers (sells / leases / lends / loans) the services / goods.  A seller may also be a provider.
   */
  @JsonIgnore public Participant getSeller() {
    return (Participant) getValue("seller");
  }
  /**
   * An entity which offers (sells / leases / lends / loans) the services / goods.  A seller may also be a provider.
   */
  @JsonIgnore public java.util.Collection<Participant> getSellers() {
    final Object current = myData.get("seller");
    if (current == null) return Collections.emptyList();
    if (current instanceof java.util.Collection) {
      return (java.util.Collection<Participant>) current;
    }
    return Arrays.asList((Participant) current);
  }
  /**
   * The order is being paid as part of the referenced Invoice.
   */
  @JsonIgnore public Invoice getPartOfInvoice() {
    return (Invoice) getValue("partOfInvoice");
  }
  /**
   * The order is being paid as part of the referenced Invoice.
   */
  @JsonIgnore public java.util.Collection<Invoice> getPartOfInvoices() {
    final Object current = myData.get("partOfInvoice");
    if (current == null) return Collections.emptyList();
    if (current instanceof java.util.Collection) {
      return (java.util.Collection<Invoice>) current;
    }
    return Arrays.asList((Invoice) current);
  }
  /**
   * A number that confirms the given order or payment has been received.
   */
  @JsonIgnore public Identifier getConfirmationNumber() {
    return (Identifier) getValue("confirmationNumber");
  }
  /**
   * A number that confirms the given order or payment has been received.
   */
  @JsonIgnore public java.util.Collection<Identifier> getConfirmationNumbers() {
    final Object current = myData.get("confirmationNumber");
    if (current == null) return Collections.emptyList();
    if (current instanceof java.util.Collection) {
      return (java.util.Collection<Identifier>) current;
    }
    return Arrays.asList((Identifier) current);
  }
  /**
   * The billing address for the order.
   */
  @JsonIgnore public PostalAddress getBillingAddress() {
    return (PostalAddress) getValue("billingAddress");
  }
  /**
   * The billing address for the order.
   */
  @JsonIgnore public java.util.Collection<PostalAddress> getBillingAddresss() {
    final Object current = myData.get("billingAddress");
    if (current == null) return Collections.emptyList();
    if (current instanceof java.util.Collection) {
      return (java.util.Collection<PostalAddress>) current;
    }
    return Arrays.asList((PostalAddress) current);
  }
  /**
   * The name of the credit card or other method of payment for the order.
   */
  @JsonIgnore public PaymentMethod getPaymentMethod() {
    return (PaymentMethod) getValue("paymentMethod");
  }
  /**
   * The name of the credit card or other method of payment for the order.
   */
  @JsonIgnore public java.util.Collection<PaymentMethod> getPaymentMethods() {
    final Object current = myData.get("paymentMethod");
    if (current == null) return Collections.emptyList();
    if (current instanceof java.util.Collection) {
      return (java.util.Collection<PaymentMethod>) current;
    }
    return Arrays.asList((PaymentMethod) current);
  }
  /**
   * The identifier of the transaction.
   */
  @JsonIgnore public Identifier getOrderNumber() {
    return (Identifier) getValue("orderNumber");
  }
  /**
   * The identifier of the transaction.
   */
  @JsonIgnore public java.util.Collection<Identifier> getOrderNumbers() {
    final Object current = myData.get("orderNumber");
    if (current == null) return Collections.emptyList();
    if (current instanceof java.util.Collection) {
      return (java.util.Collection<Identifier>) current;
    }
    return Arrays.asList((Identifier) current);
  }
  /**
   * An entity that arranges for an exchange between a buyer and a seller.  In most cases a broker never acquires or releases ownership of a product or service involved in an exchange.  If it is not clear whether an entity is a broker, seller, or buyer, the latter two terms are preferred.
   */
  @JsonIgnore public Organization getBrokerOrganization() {
    return (Organization) getValue("broker");
  }
  /**
   * An entity that arranges for an exchange between a buyer and a seller.  In most cases a broker never acquires or releases ownership of a product or service involved in an exchange.  If it is not clear whether an entity is a broker, seller, or buyer, the latter two terms are preferred.
   */
  @JsonIgnore public java.util.Collection<Organization> getBrokerOrganizations() {
    final Object current = myData.get("broker");
    if (current == null) return Collections.emptyList();
    if (current instanceof java.util.Collection) {
      return (java.util.Collection<Organization>) current;
    }
    return Arrays.asList((Organization) current);
  }
  /**
   * An entity that arranges for an exchange between a buyer and a seller.  In most cases a broker never acquires or releases ownership of a product or service involved in an exchange.  If it is not clear whether an entity is a broker, seller, or buyer, the latter two terms are preferred.
   */
  @JsonIgnore public Person getBrokerPerson() {
    return (Person) getValue("broker");
  }
  /**
   * An entity that arranges for an exchange between a buyer and a seller.  In most cases a broker never acquires or releases ownership of a product or service involved in an exchange.  If it is not clear whether an entity is a broker, seller, or buyer, the latter two terms are preferred.
   */
  @JsonIgnore public java.util.Collection<Person> getBrokerPersons() {
    final Object current = myData.get("broker");
    if (current == null) return Collections.emptyList();
    if (current instanceof java.util.Collection) {
      return (java.util.Collection<Person>) current;
    }
    return Arrays.asList((Person) current);
  }
  protected Order(java.util.Map<String,Object> data) {
    super(data);
  }
  
  /**
   * Builder for {@link Order}
   */
  public static class Builder extends Intangible.Builder {
    public Builder(@NotNull HashMap<String,Object> data) {
      super(data);
    }
    @NotNull public Order build() {
      return new Order(myData);
    }
    /**
     * The offer(s) -- e.g., product, quantity and price combinations -- included in the order.
     */
    @NotNull public Builder acceptedOffer(@NotNull Offer offer) {
      putValue("acceptedOffer", offer);
      return this;
    }
    /**
     * The offer(s) -- e.g., product, quantity and price combinations -- included in the order.
     */
    @NotNull public Builder acceptedOffer(@NotNull Offer.Builder offer) {
      putValue("acceptedOffer", offer.build());
      return this;
    }
    /**
     * The current status of the order.
     */
    @NotNull public Builder orderStatus(@NotNull OrderStatus orderStatus) {
      putValue("orderStatus", orderStatus);
      return this;
    }
    /**
     * An identifier for the method of payment used (e.g. the last 4 digits of the credit card).
     */
    @NotNull public Builder paymentMethodId(@NotNull String paymentMethodId) {
      putValue("paymentMethodId", paymentMethodId);
      return this;
    }
    /**
     * Party placing the order or paying the invoice.
     */
    @NotNull public Builder customer(@NotNull Organization organization) {
      putValue("customer", organization);
      return this;
    }
    /**
     * Party placing the order or paying the invoice.
     */
    @NotNull public Builder customer(@NotNull Organization.Builder organization) {
      putValue("customer", organization.build());
      return this;
    }
    /**
     * Party placing the order or paying the invoice.
     */
    @NotNull public Builder customer(@NotNull Person person) {
      putValue("customer", person);
      return this;
    }
    /**
     * Party placing the order or paying the invoice.
     */
    @NotNull public Builder customer(@NotNull Person.Builder person) {
      putValue("customer", person.build());
      return this;
    }
    /**
     * Was the offer accepted as a gift for someone other than the buyer.
     */
    @NotNull public Builder isGift(@NotNull Boolean isGift) {
      putValue("isGift", isGift);
      return this;
    }
    /**
     * The item ordered.
     */
    @NotNull public Builder orderedItem(@NotNull OrderItem orderItem) {
      putValue("orderedItem", orderItem);
      return this;
    }
    /**
     * The item ordered.
     */
    @NotNull public Builder orderedItem(@NotNull OrderItem.Builder orderItem) {
      putValue("orderedItem", orderItem.build());
      return this;
    }
    /**
     * The item ordered.
     */
    @NotNull public Builder orderedItem(@NotNull Product product) {
      putValue("orderedItem", product);
      return this;
    }
    /**
     * The item ordered.
     */
    @NotNull public Builder orderedItem(@NotNull Product.Builder product) {
      putValue("orderedItem", product.build());
      return this;
    }
    /**
     * The item ordered.
     */
    @NotNull public Builder orderedItem(@NotNull Service service) {
      putValue("orderedItem", service);
      return this;
    }
    /**
     * The item ordered.
     */
    @NotNull public Builder orderedItem(@NotNull Service.Builder service) {
      putValue("orderedItem", service.build());
      return this;
    }
    /**
     * The URL for sending a payment.
     */
    @NotNull public Builder paymentUrl(@NotNull String paymentUrl) {
      putValue("paymentUrl", paymentUrl);
      return this;
    }
    /**
     * Code used to redeem a discount.
     */
    @NotNull public Builder discountCode(@NotNull String discountCode) {
      putValue("discountCode", discountCode);
      return this;
    }
    /**
     * The date that payment is due.
     */
    @NotNull public Builder paymentDueDate(@NotNull java.util.Date date) {
      putValue("paymentDueDate", date);
      return this;
    }
    /**
     * The currency of the discount.\n\nUse standard formats: [ISO 4217 currency format](http://en.wikipedia.org/wiki/ISO_4217) e.g. &quot;USD&quot;; [Ticker symbol](https://en.wikipedia.org/wiki/List_of_cryptocurrencies) for cryptocurrencies e.g. &quot;BTC&quot;; well known names for [Local Exchange Tradings Systems](https://en.wikipedia.org/wiki/Local_exchange_trading_system) (LETS) and other currency types e.g. &quot;Ithaca HOUR&quot;.
     */
    @NotNull public Builder discountCurrency(@NotNull String discountCurrency) {
      putValue("discountCurrency", discountCurrency);
      return this;
    }
    /**
     * Any discount applied (to an Order).
     */
    @NotNull public Builder discount(@NotNull Integer integer) {
      putValue("discount", integer);
      return this;
    }
    /**
     * Any discount applied (to an Order).
     */
    @NotNull public Builder discount(@NotNull Long discount) {
      putValue("discount", discount);
      return this;
    }
    /**
     * Any discount applied (to an Order).
     */
    @NotNull public Builder discount(@NotNull Float discount) {
      putValue("discount", discount);
      return this;
    }
    /**
     * Any discount applied (to an Order).
     */
    @NotNull public Builder discount(@NotNull Double discount) {
      putValue("discount", discount);
      return this;
    }
    /**
     * Any discount applied (to an Order).
     */
    @NotNull public Builder discount(@NotNull String discount) {
      putValue("discount", discount);
      return this;
    }
    /**
     * The delivery of the parcel related to this order or order item.
     */
    @NotNull public Builder orderDelivery(@NotNull ParcelDelivery parcelDelivery) {
      putValue("orderDelivery", parcelDelivery);
      return this;
    }
    /**
     * The delivery of the parcel related to this order or order item.
     */
    @NotNull public Builder orderDelivery(@NotNull ParcelDelivery.Builder parcelDelivery) {
      putValue("orderDelivery", parcelDelivery.build());
      return this;
    }
    /**
     * Date order was placed.
     */
    @NotNull public Builder orderDate(@NotNull java.util.Date date) {
      putValue("orderDate", date);
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
     * The order is being paid as part of the referenced Invoice.
     */
    @NotNull public Builder partOfInvoice(@NotNull Invoice invoice) {
      putValue("partOfInvoice", invoice);
      return this;
    }
    /**
     * The order is being paid as part of the referenced Invoice.
     */
    @NotNull public Builder partOfInvoice(@NotNull Invoice.Builder invoice) {
      putValue("partOfInvoice", invoice.build());
      return this;
    }
    /**
     * A number that confirms the given order or payment has been received.
     */
    @NotNull public Builder confirmationNumber(@NotNull Identifier identifier) {
      putValue("confirmationNumber", identifier);
      return this;
    }
    /**
     * The billing address for the order.
     */
    @NotNull public Builder billingAddress(@NotNull PostalAddress postalAddress) {
      putValue("billingAddress", postalAddress);
      return this;
    }
    /**
     * The billing address for the order.
     */
    @NotNull public Builder billingAddress(@NotNull PostalAddress.Builder postalAddress) {
      putValue("billingAddress", postalAddress.build());
      return this;
    }
    /**
     * The name of the credit card or other method of payment for the order.
     */
    @NotNull public Builder paymentMethod(@NotNull PaymentMethod paymentMethod) {
      putValue("paymentMethod", paymentMethod);
      return this;
    }
    /**
     * The identifier of the transaction.
     */
    @NotNull public Builder orderNumber(@NotNull Identifier identifier) {
      putValue("orderNumber", identifier);
      return this;
    }
    /**
     * An entity that arranges for an exchange between a buyer and a seller.  In most cases a broker never acquires or releases ownership of a product or service involved in an exchange.  If it is not clear whether an entity is a broker, seller, or buyer, the latter two terms are preferred.
     */
    @NotNull public Builder broker(@NotNull Organization organization) {
      putValue("broker", organization);
      return this;
    }
    /**
     * An entity that arranges for an exchange between a buyer and a seller.  In most cases a broker never acquires or releases ownership of a product or service involved in an exchange.  If it is not clear whether an entity is a broker, seller, or buyer, the latter two terms are preferred.
     */
    @NotNull public Builder broker(@NotNull Organization.Builder organization) {
      putValue("broker", organization.build());
      return this;
    }
    /**
     * An entity that arranges for an exchange between a buyer and a seller.  In most cases a broker never acquires or releases ownership of a product or service involved in an exchange.  If it is not clear whether an entity is a broker, seller, or buyer, the latter two terms are preferred.
     */
    @NotNull public Builder broker(@NotNull Person person) {
      putValue("broker", person);
      return this;
    }
    /**
     * An entity that arranges for an exchange between a buyer and a seller.  In most cases a broker never acquires or releases ownership of a product or service involved in an exchange.  If it is not clear whether an entity is a broker, seller, or buyer, the latter two terms are preferred.
     */
    @NotNull public Builder broker(@NotNull Person.Builder person) {
      putValue("broker", person.build());
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
