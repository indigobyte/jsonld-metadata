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
 * A statement of the money due for goods or services; a bill.
 */
public class Invoice extends Intangible {
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
   * The total amount due.
   */
  @JsonIgnore public MonetaryAmount getTotalPaymentDueMonetaryAmount() {
    return (MonetaryAmount) getValue("totalPaymentDue");
  }
  /**
   * The total amount due.
   */
  @JsonIgnore public java.util.Collection<MonetaryAmount> getTotalPaymentDueMonetaryAmounts() {
    final Object current = myData.get("totalPaymentDue");
    if (current == null) return Collections.emptyList();
    if (current instanceof java.util.Collection) {
      return (java.util.Collection<MonetaryAmount>) current;
    }
    return Arrays.asList((MonetaryAmount) current);
  }
  /**
   * The total amount due.
   */
  @JsonIgnore public PriceSpecification getTotalPaymentDuePriceSpecification() {
    return (PriceSpecification) getValue("totalPaymentDue");
  }
  /**
   * The total amount due.
   */
  @JsonIgnore public java.util.Collection<PriceSpecification> getTotalPaymentDuePriceSpecifications() {
    final Object current = myData.get("totalPaymentDue");
    if (current == null) return Collections.emptyList();
    if (current instanceof java.util.Collection) {
      return (java.util.Collection<PriceSpecification>) current;
    }
    return Arrays.asList((PriceSpecification) current);
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
   * The service provider, service operator, or service performer; the goods producer. Another party (a seller) may offer those services or goods on behalf of the provider. A provider may also serve as the seller.
   */
  @JsonIgnore public Organization getProviderOrganization() {
    return (Organization) getValue("provider");
  }
  /**
   * The service provider, service operator, or service performer; the goods producer. Another party (a seller) may offer those services or goods on behalf of the provider. A provider may also serve as the seller.
   */
  @JsonIgnore public java.util.Collection<Organization> getProviderOrganizations() {
    final Object current = myData.get("provider");
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
    final Object current = myData.get("provider");
    if (current == null) return Collections.emptyList();
    if (current instanceof java.util.Collection) {
      return (java.util.Collection<Person>) current;
    }
    return Arrays.asList((Person) current);
  }
  /**
   * The date the invoice is scheduled to be paid.
   */
  @JsonIgnore public java.util.Date getScheduledPaymentDate() {
    return (java.util.Date) getValue("scheduledPaymentDate");
  }
  /**
   * The date the invoice is scheduled to be paid.
   */
  @JsonIgnore public java.util.Collection<java.util.Date> getScheduledPaymentDates() {
    final Object current = myData.get("scheduledPaymentDate");
    if (current == null) return Collections.emptyList();
    if (current instanceof java.util.Collection) {
      return (java.util.Collection<java.util.Date>) current;
    }
    return Arrays.asList((java.util.Date) current);
  }
  /**
   * The status of payment; whether the invoice has been paid or not.
   */
  @JsonIgnore public PaymentStatusType getPaymentStatusPaymentStatusType() {
    return (PaymentStatusType) getValue("paymentStatus");
  }
  /**
   * The status of payment; whether the invoice has been paid or not.
   */
  @JsonIgnore public java.util.Collection<PaymentStatusType> getPaymentStatusPaymentStatusTypes() {
    final Object current = myData.get("paymentStatus");
    if (current == null) return Collections.emptyList();
    if (current instanceof java.util.Collection) {
      return (java.util.Collection<PaymentStatusType>) current;
    }
    return Arrays.asList((PaymentStatusType) current);
  }
  /**
   * The status of payment; whether the invoice has been paid or not.
   */
  @JsonIgnore public String getPaymentStatusString() {
    return (String) getValue("paymentStatus");
  }
  /**
   * The status of payment; whether the invoice has been paid or not.
   */
  @JsonIgnore public java.util.Collection<String> getPaymentStatusStrings() {
    final Object current = myData.get("paymentStatus");
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
   * The minimum payment required at this time.
   */
  @JsonIgnore public MonetaryAmount getMinimumPaymentDueMonetaryAmount() {
    return (MonetaryAmount) getValue("minimumPaymentDue");
  }
  /**
   * The minimum payment required at this time.
   */
  @JsonIgnore public java.util.Collection<MonetaryAmount> getMinimumPaymentDueMonetaryAmounts() {
    final Object current = myData.get("minimumPaymentDue");
    if (current == null) return Collections.emptyList();
    if (current instanceof java.util.Collection) {
      return (java.util.Collection<MonetaryAmount>) current;
    }
    return Arrays.asList((MonetaryAmount) current);
  }
  /**
   * The minimum payment required at this time.
   */
  @JsonIgnore public PriceSpecification getMinimumPaymentDuePriceSpecification() {
    return (PriceSpecification) getValue("minimumPaymentDue");
  }
  /**
   * The minimum payment required at this time.
   */
  @JsonIgnore public java.util.Collection<PriceSpecification> getMinimumPaymentDuePriceSpecifications() {
    final Object current = myData.get("minimumPaymentDue");
    if (current == null) return Collections.emptyList();
    if (current instanceof java.util.Collection) {
      return (java.util.Collection<PriceSpecification>) current;
    }
    return Arrays.asList((PriceSpecification) current);
  }
  /**
   * A category for the item. Greater signs or slashes can be used to informally indicate a category hierarchy.
   */
  @JsonIgnore public Category getCategory() {
    return (Category) getValue("category");
  }
  /**
   * A category for the item. Greater signs or slashes can be used to informally indicate a category hierarchy.
   */
  @JsonIgnore public java.util.Collection<Category> getCategorys() {
    final Object current = myData.get("category");
    if (current == null) return Collections.emptyList();
    if (current instanceof java.util.Collection) {
      return (java.util.Collection<Category>) current;
    }
    return Arrays.asList((Category) current);
  }
  /**
   * The identifier for the account the payment will be applied to.
   */
  @JsonIgnore public Identifier getAccountId() {
    return (Identifier) getValue("accountId");
  }
  /**
   * The identifier for the account the payment will be applied to.
   */
  @JsonIgnore public java.util.Collection<Identifier> getAccountIds() {
    final Object current = myData.get("accountId");
    if (current == null) return Collections.emptyList();
    if (current instanceof java.util.Collection) {
      return (java.util.Collection<Identifier>) current;
    }
    return Arrays.asList((Identifier) current);
  }
  /**
   * The Order(s) related to this Invoice. One or more Orders may be combined into a single Invoice.
   */
  @JsonIgnore public Order getReferencesOrder() {
    return (Order) getValue("referencesOrder");
  }
  /**
   * The Order(s) related to this Invoice. One or more Orders may be combined into a single Invoice.
   */
  @JsonIgnore public java.util.Collection<Order> getReferencesOrders() {
    final Object current = myData.get("referencesOrder");
    if (current == null) return Collections.emptyList();
    if (current instanceof java.util.Collection) {
      return (java.util.Collection<Order>) current;
    }
    return Arrays.asList((Order) current);
  }
  /**
   * The time interval used to compute the invoice.
   */
  @JsonIgnore public Duration getBillingPeriod() {
    return (Duration) getValue("billingPeriod");
  }
  /**
   * The time interval used to compute the invoice.
   */
  @JsonIgnore public java.util.Collection<Duration> getBillingPeriods() {
    final Object current = myData.get("billingPeriod");
    if (current == null) return Collections.emptyList();
    if (current instanceof java.util.Collection) {
      return (java.util.Collection<Duration>) current;
    }
    return Arrays.asList((Duration) current);
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
  protected Invoice(java.util.Map<String,Object> data) {
    super(data);
  }
  
  /**
   * Builder for {@link Invoice}
   */
  public static class Builder extends Intangible.Builder {
    public Builder(@NotNull HashMap<String,Object> data) {
      super(data);
    }
    @NotNull public Invoice build() {
      return new Invoice(myData);
    }
    /**
     * An identifier for the method of payment used (e.g. the last 4 digits of the credit card).
     */
    @NotNull public Builder paymentMethodId(@NotNull String paymentMethodId) {
      putValue("paymentMethodId", paymentMethodId);
      return this;
    }
    /**
     * The total amount due.
     */
    @NotNull public Builder totalPaymentDue(@NotNull MonetaryAmount monetaryAmount) {
      putValue("totalPaymentDue", monetaryAmount);
      return this;
    }
    /**
     * The total amount due.
     */
    @NotNull public Builder totalPaymentDue(@NotNull MonetaryAmount.Builder monetaryAmount) {
      putValue("totalPaymentDue", monetaryAmount.build());
      return this;
    }
    /**
     * The total amount due.
     */
    @NotNull public Builder totalPaymentDue(@NotNull PriceSpecification priceSpecification) {
      putValue("totalPaymentDue", priceSpecification);
      return this;
    }
    /**
     * The total amount due.
     */
    @NotNull public Builder totalPaymentDue(@NotNull PriceSpecification.Builder priceSpecification) {
      putValue("totalPaymentDue", priceSpecification.build());
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
     * The date the invoice is scheduled to be paid.
     */
    @NotNull public Builder scheduledPaymentDate(@NotNull java.util.Date date) {
      putValue("scheduledPaymentDate", date);
      return this;
    }
    /**
     * The status of payment; whether the invoice has been paid or not.
     */
    @NotNull public Builder paymentStatus(@NotNull PaymentStatusType paymentStatusType) {
      putValue("paymentStatus", paymentStatusType);
      return this;
    }
    /**
     * The status of payment; whether the invoice has been paid or not.
     */
    @NotNull public Builder paymentStatus(@NotNull String paymentStatus) {
      putValue("paymentStatus", paymentStatus);
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
     * The minimum payment required at this time.
     */
    @NotNull public Builder minimumPaymentDue(@NotNull MonetaryAmount monetaryAmount) {
      putValue("minimumPaymentDue", monetaryAmount);
      return this;
    }
    /**
     * The minimum payment required at this time.
     */
    @NotNull public Builder minimumPaymentDue(@NotNull MonetaryAmount.Builder monetaryAmount) {
      putValue("minimumPaymentDue", monetaryAmount.build());
      return this;
    }
    /**
     * The minimum payment required at this time.
     */
    @NotNull public Builder minimumPaymentDue(@NotNull PriceSpecification priceSpecification) {
      putValue("minimumPaymentDue", priceSpecification);
      return this;
    }
    /**
     * The minimum payment required at this time.
     */
    @NotNull public Builder minimumPaymentDue(@NotNull PriceSpecification.Builder priceSpecification) {
      putValue("minimumPaymentDue", priceSpecification.build());
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
     * The identifier for the account the payment will be applied to.
     */
    @NotNull public Builder accountId(@NotNull Identifier identifier) {
      putValue("accountId", identifier);
      return this;
    }
    /**
     * The Order(s) related to this Invoice. One or more Orders may be combined into a single Invoice.
     */
    @NotNull public Builder referencesOrder(@NotNull Order order) {
      putValue("referencesOrder", order);
      return this;
    }
    /**
     * The Order(s) related to this Invoice. One or more Orders may be combined into a single Invoice.
     */
    @NotNull public Builder referencesOrder(@NotNull Order.Builder order) {
      putValue("referencesOrder", order.build());
      return this;
    }
    /**
     * The time interval used to compute the invoice.
     */
    @NotNull public Builder billingPeriod(@NotNull Duration duration) {
      putValue("billingPeriod", duration);
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
     * The name of the credit card or other method of payment for the order.
     */
    @NotNull public Builder paymentMethod(@NotNull PaymentMethod paymentMethod) {
      putValue("paymentMethod", paymentMethod);
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
      if ("paymentMethodId".equals(key) && value instanceof String) { this.paymentMethodId((String)value); return; }
      if ("paymentMethodIds".equals(key) && value instanceof String) { this.paymentMethodId((String)value); return; }
      if ("totalPaymentDue".equals(key) && value instanceof MonetaryAmount) { this.totalPaymentDue((MonetaryAmount)value); return; }
      if ("totalPaymentDues".equals(key) && value instanceof MonetaryAmount) { this.totalPaymentDue((MonetaryAmount)value); return; }
      if ("totalPaymentDue".equals(key) && value instanceof PriceSpecification) { this.totalPaymentDue((PriceSpecification)value); return; }
      if ("totalPaymentDues".equals(key) && value instanceof PriceSpecification) { this.totalPaymentDue((PriceSpecification)value); return; }
      if ("customer".equals(key) && value instanceof Organization) { this.customer((Organization)value); return; }
      if ("customers".equals(key) && value instanceof Organization) { this.customer((Organization)value); return; }
      if ("customer".equals(key) && value instanceof Person) { this.customer((Person)value); return; }
      if ("customers".equals(key) && value instanceof Person) { this.customer((Person)value); return; }
      if ("provider".equals(key) && value instanceof Organization) { this.provider((Organization)value); return; }
      if ("providers".equals(key) && value instanceof Organization) { this.provider((Organization)value); return; }
      if ("provider".equals(key) && value instanceof Person) { this.provider((Person)value); return; }
      if ("providers".equals(key) && value instanceof Person) { this.provider((Person)value); return; }
      if ("scheduledPaymentDate".equals(key) && value instanceof java.util.Date) { this.scheduledPaymentDate((java.util.Date)value); return; }
      if ("scheduledPaymentDates".equals(key) && value instanceof java.util.Date) { this.scheduledPaymentDate((java.util.Date)value); return; }
      if ("paymentStatus".equals(key) && value instanceof PaymentStatusType) { this.paymentStatus((PaymentStatusType)value); return; }
      if ("paymentStatuss".equals(key) && value instanceof PaymentStatusType) { this.paymentStatus((PaymentStatusType)value); return; }
      if ("paymentStatus".equals(key) && value instanceof String) { this.paymentStatus((String)value); return; }
      if ("paymentStatuss".equals(key) && value instanceof String) { this.paymentStatus((String)value); return; }
      if ("paymentDueDate".equals(key) && value instanceof java.util.Date) { this.paymentDueDate((java.util.Date)value); return; }
      if ("paymentDueDates".equals(key) && value instanceof java.util.Date) { this.paymentDueDate((java.util.Date)value); return; }
      if ("minimumPaymentDue".equals(key) && value instanceof MonetaryAmount) { this.minimumPaymentDue((MonetaryAmount)value); return; }
      if ("minimumPaymentDues".equals(key) && value instanceof MonetaryAmount) { this.minimumPaymentDue((MonetaryAmount)value); return; }
      if ("minimumPaymentDue".equals(key) && value instanceof PriceSpecification) { this.minimumPaymentDue((PriceSpecification)value); return; }
      if ("minimumPaymentDues".equals(key) && value instanceof PriceSpecification) { this.minimumPaymentDue((PriceSpecification)value); return; }
      if ("category".equals(key) && value instanceof Category) { this.category((Category)value); return; }
      if ("categorys".equals(key) && value instanceof Category) { this.category((Category)value); return; }
      if ("accountId".equals(key) && value instanceof Identifier) { this.accountId((Identifier)value); return; }
      if ("accountIds".equals(key) && value instanceof Identifier) { this.accountId((Identifier)value); return; }
      if ("referencesOrder".equals(key) && value instanceof Order) { this.referencesOrder((Order)value); return; }
      if ("referencesOrders".equals(key) && value instanceof Order) { this.referencesOrder((Order)value); return; }
      if ("billingPeriod".equals(key) && value instanceof Duration) { this.billingPeriod((Duration)value); return; }
      if ("billingPeriods".equals(key) && value instanceof Duration) { this.billingPeriod((Duration)value); return; }
      if ("confirmationNumber".equals(key) && value instanceof Identifier) { this.confirmationNumber((Identifier)value); return; }
      if ("confirmationNumbers".equals(key) && value instanceof Identifier) { this.confirmationNumber((Identifier)value); return; }
      if ("paymentMethod".equals(key) && value instanceof PaymentMethod) { this.paymentMethod((PaymentMethod)value); return; }
      if ("paymentMethods".equals(key) && value instanceof PaymentMethod) { this.paymentMethod((PaymentMethod)value); return; }
      if ("broker".equals(key) && value instanceof Organization) { this.broker((Organization)value); return; }
      if ("brokers".equals(key) && value instanceof Organization) { this.broker((Organization)value); return; }
      if ("broker".equals(key) && value instanceof Person) { this.broker((Person)value); return; }
      if ("brokers".equals(key) && value instanceof Person) { this.broker((Person)value); return; }
      super.fromMap(key, value);
    }
  }
  
}
