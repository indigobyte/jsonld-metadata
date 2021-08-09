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
 * A statement of the money due for goods or services; a bill.
 */
public class Invoice extends Intangible {
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
   * The total amount due.
   * @return totalPaymentDue property set by first invocation of totalPaymentDue method or {@code null}.
   */
  @JsonIgnore public MonetaryAmount getTotalPaymentDueMonetaryAmount() {
    return (MonetaryAmount) getValue("totalPaymentDue");
  }
  /**
   * The total amount due.
   * @return all totalPaymentDue properties as {@link java.util.Collection} or an empty collection 
   * if totalPaymentDue was not set.
   */
  @JsonIgnore public java.util.Collection<MonetaryAmount> getTotalPaymentDueMonetaryAmounts() {
    final java.lang.Object current = myData.get("totalPaymentDue");
    if (current == null) return Collections.emptyList();
    if (current instanceof java.util.Collection) {
      return (java.util.Collection<MonetaryAmount>) current;
    }
    return Arrays.asList((MonetaryAmount) current);
  }
  /**
   * The total amount due.
   * @return totalPaymentDue property set by first invocation of totalPaymentDue method or {@code null}.
   */
  @JsonIgnore public PriceSpecification getTotalPaymentDuePriceSpecification() {
    return (PriceSpecification) getValue("totalPaymentDue");
  }
  /**
   * The total amount due.
   * @return all totalPaymentDue properties as {@link java.util.Collection} or an empty collection 
   * if totalPaymentDue was not set.
   */
  @JsonIgnore public java.util.Collection<PriceSpecification> getTotalPaymentDuePriceSpecifications() {
    final java.lang.Object current = myData.get("totalPaymentDue");
    if (current == null) return Collections.emptyList();
    if (current instanceof java.util.Collection) {
      return (java.util.Collection<PriceSpecification>) current;
    }
    return Arrays.asList((PriceSpecification) current);
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
   * The date the invoice is scheduled to be paid.
   * @return scheduledPaymentDate property set by first invocation of scheduledPaymentDate method or {@code null}.
   */
  @JsonIgnore public java.util.Date getScheduledPaymentDate() {
    return (java.util.Date) getValue("scheduledPaymentDate");
  }
  /**
   * The date the invoice is scheduled to be paid.
   * @return all scheduledPaymentDate properties as {@link java.util.Collection} or an empty collection 
   * if scheduledPaymentDate was not set.
   */
  @JsonIgnore public java.util.Collection<java.util.Date> getScheduledPaymentDates() {
    final java.lang.Object current = myData.get("scheduledPaymentDate");
    if (current == null) return Collections.emptyList();
    if (current instanceof java.util.Collection) {
      return (java.util.Collection<java.util.Date>) current;
    }
    return Arrays.asList((java.util.Date) current);
  }
  /**
   * The status of payment; whether the invoice has been paid or not.
   * @return paymentStatus property set by first invocation of paymentStatus method or {@code null}.
   */
  @JsonIgnore public PaymentStatusType getPaymentStatusPaymentStatusType() {
    return (PaymentStatusType) getValue("paymentStatus");
  }
  /**
   * The status of payment; whether the invoice has been paid or not.
   * @return all paymentStatus properties as {@link java.util.Collection} or an empty collection 
   * if paymentStatus was not set.
   */
  @JsonIgnore public java.util.Collection<PaymentStatusType> getPaymentStatusPaymentStatusTypes() {
    final java.lang.Object current = myData.get("paymentStatus");
    if (current == null) return Collections.emptyList();
    if (current instanceof java.util.Collection) {
      return (java.util.Collection<PaymentStatusType>) current;
    }
    return Arrays.asList((PaymentStatusType) current);
  }
  /**
   * The status of payment; whether the invoice has been paid or not.
   * @return paymentStatus property set by first invocation of paymentStatus method or {@code null}.
   */
  @JsonIgnore public String getPaymentStatusString() {
    return (String) getValue("paymentStatus");
  }
  /**
   * The status of payment; whether the invoice has been paid or not.
   * @return all paymentStatus properties as {@link java.util.Collection} or an empty collection 
   * if paymentStatus was not set.
   */
  @JsonIgnore public java.util.Collection<String> getPaymentStatusStrings() {
    final java.lang.Object current = myData.get("paymentStatus");
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
   * The minimum payment required at this time.
   * @return minimumPaymentDue property set by first invocation of minimumPaymentDue method or {@code null}.
   */
  @JsonIgnore public MonetaryAmount getMinimumPaymentDueMonetaryAmount() {
    return (MonetaryAmount) getValue("minimumPaymentDue");
  }
  /**
   * The minimum payment required at this time.
   * @return all minimumPaymentDue properties as {@link java.util.Collection} or an empty collection 
   * if minimumPaymentDue was not set.
   */
  @JsonIgnore public java.util.Collection<MonetaryAmount> getMinimumPaymentDueMonetaryAmounts() {
    final java.lang.Object current = myData.get("minimumPaymentDue");
    if (current == null) return Collections.emptyList();
    if (current instanceof java.util.Collection) {
      return (java.util.Collection<MonetaryAmount>) current;
    }
    return Arrays.asList((MonetaryAmount) current);
  }
  /**
   * The minimum payment required at this time.
   * @return minimumPaymentDue property set by first invocation of minimumPaymentDue method or {@code null}.
   */
  @JsonIgnore public PriceSpecification getMinimumPaymentDuePriceSpecification() {
    return (PriceSpecification) getValue("minimumPaymentDue");
  }
  /**
   * The minimum payment required at this time.
   * @return all minimumPaymentDue properties as {@link java.util.Collection} or an empty collection 
   * if minimumPaymentDue was not set.
   */
  @JsonIgnore public java.util.Collection<PriceSpecification> getMinimumPaymentDuePriceSpecifications() {
    final java.lang.Object current = myData.get("minimumPaymentDue");
    if (current == null) return Collections.emptyList();
    if (current instanceof java.util.Collection) {
      return (java.util.Collection<PriceSpecification>) current;
    }
    return Arrays.asList((PriceSpecification) current);
  }
  /**
   * A category for the item. Greater signs or slashes can be used to informally indicate a category hierarchy.
   * @return category property set by first invocation of category method or {@code null}.
   */
  @JsonIgnore public Category getCategory() {
    return (Category) getValue("category");
  }
  /**
   * A category for the item. Greater signs or slashes can be used to informally indicate a category hierarchy.
   * @return all category properties as {@link java.util.Collection} or an empty collection 
   * if category was not set.
   */
  @JsonIgnore public java.util.Collection<Category> getCategorys() {
    final java.lang.Object current = myData.get("category");
    if (current == null) return Collections.emptyList();
    if (current instanceof java.util.Collection) {
      return (java.util.Collection<Category>) current;
    }
    return Arrays.asList((Category) current);
  }
  /**
   * The identifier for the account the payment will be applied to.
   * @return accountId property set by first invocation of accountId method or {@code null}.
   */
  @JsonIgnore public Identifier getAccountId() {
    return (Identifier) getValue("accountId");
  }
  /**
   * The identifier for the account the payment will be applied to.
   * @return all accountId properties as {@link java.util.Collection} or an empty collection 
   * if accountId was not set.
   */
  @JsonIgnore public java.util.Collection<Identifier> getAccountIds() {
    final java.lang.Object current = myData.get("accountId");
    if (current == null) return Collections.emptyList();
    if (current instanceof java.util.Collection) {
      return (java.util.Collection<Identifier>) current;
    }
    return Arrays.asList((Identifier) current);
  }
  /**
   * The Order(s) related to this Invoice. One or more Orders may be combined into a single Invoice.
   * @return referencesOrder property set by first invocation of referencesOrder method or {@code null}.
   */
  @JsonIgnore public Order getReferencesOrder() {
    return (Order) getValue("referencesOrder");
  }
  /**
   * The Order(s) related to this Invoice. One or more Orders may be combined into a single Invoice.
   * @return all referencesOrder properties as {@link java.util.Collection} or an empty collection 
   * if referencesOrder was not set.
   */
  @JsonIgnore public java.util.Collection<Order> getReferencesOrders() {
    final java.lang.Object current = myData.get("referencesOrder");
    if (current == null) return Collections.emptyList();
    if (current instanceof java.util.Collection) {
      return (java.util.Collection<Order>) current;
    }
    return Arrays.asList((Order) current);
  }
  /**
   * The time interval used to compute the invoice.
   * @return billingPeriod property set by first invocation of billingPeriod method or {@code null}.
   */
  @JsonIgnore public Duration getBillingPeriod() {
    return (Duration) getValue("billingPeriod");
  }
  /**
   * The time interval used to compute the invoice.
   * @return all billingPeriod properties as {@link java.util.Collection} or an empty collection 
   * if billingPeriod was not set.
   */
  @JsonIgnore public java.util.Collection<Duration> getBillingPeriods() {
    final java.lang.Object current = myData.get("billingPeriod");
    if (current == null) return Collections.emptyList();
    if (current instanceof java.util.Collection) {
      return (java.util.Collection<Duration>) current;
    }
    return Arrays.asList((Duration) current);
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
  protected Invoice(java.util.Map<String,java.lang.Object> data) {
    super(data);
  }
  
  /**
   * Builder for {@link Invoice}
   */
  public static class Builder extends Intangible.Builder {
    public Builder(@NotNull HashMap<String,java.lang.Object> data) {
      super(data);
    }
    @NotNull public Invoice build() {
      return new Invoice(myData);
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
     * The total amount due.
     * @param monetaryAmount value to set
     * @return this builder instance
     */
    @NotNull public Builder totalPaymentDue(@NotNull MonetaryAmount monetaryAmount) {
      putValue("totalPaymentDue", monetaryAmount);
      return this;
    }
    /**
     * The total amount due.
     * @param monetaryAmount value to set
     * @return this builder instance
     */
    @NotNull public Builder totalPaymentDue(@NotNull MonetaryAmount.Builder monetaryAmount) {
      putValue("totalPaymentDue", monetaryAmount.build());
      return this;
    }
    /**
     * The total amount due.
     * @param priceSpecification value to set
     * @return this builder instance
     */
    @NotNull public Builder totalPaymentDue(@NotNull PriceSpecification priceSpecification) {
      putValue("totalPaymentDue", priceSpecification);
      return this;
    }
    /**
     * The total amount due.
     * @param priceSpecification value to set
     * @return this builder instance
     */
    @NotNull public Builder totalPaymentDue(@NotNull PriceSpecification.Builder priceSpecification) {
      putValue("totalPaymentDue", priceSpecification.build());
      return this;
    }
    /**
     * Remove totalPaymentDue property from the builder.
     * If this property is repeatable, all instances are removed.
     * @return this builder instance
     */
    @NotNull public Builder removeTotalPaymentDue() {
      removeValue("totalPaymentDue");
      return this;
    }
    /**
     * Get currently set value for totalPaymentDue property in this builder.
     * @return previously set value or {@code null}. If multiple values have been 
     * set to this property, then {@link java.util.Collection} instance will be 
     * returned.
     */
    @Nullable public java.lang.Object getTotalPaymentDue() {
      return myData.get("totalPaymentDue");
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
     * The date the invoice is scheduled to be paid.
     * @param date value to set
     * @return this builder instance
     */
    @NotNull public Builder scheduledPaymentDate(@NotNull java.util.Date date) {
      putValue("scheduledPaymentDate", date);
      return this;
    }
    /**
     * Remove scheduledPaymentDate property from the builder.
     * If this property is repeatable, all instances are removed.
     * @return this builder instance
     */
    @NotNull public Builder removeScheduledPaymentDate() {
      removeValue("scheduledPaymentDate");
      return this;
    }
    /**
     * Get currently set value for scheduledPaymentDate property in this builder.
     * @return previously set value or {@code null}. If multiple values have been 
     * set to this property, then {@link java.util.Collection} instance will be 
     * returned.
     */
    @Nullable public java.lang.Object getScheduledPaymentDate() {
      return myData.get("scheduledPaymentDate");
    }
    /**
     * The status of payment; whether the invoice has been paid or not.
     * @param paymentStatusType value to set
     * @return this builder instance
     */
    @NotNull public Builder paymentStatus(@NotNull PaymentStatusType paymentStatusType) {
      putValue("paymentStatus", paymentStatusType);
      return this;
    }
    /**
     * The status of payment; whether the invoice has been paid or not.
     * @param paymentStatus value to set
     * @return this builder instance
     */
    @NotNull public Builder paymentStatus(@NotNull String paymentStatus) {
      putValue("paymentStatus", paymentStatus);
      return this;
    }
    /**
     * Remove paymentStatus property from the builder.
     * If this property is repeatable, all instances are removed.
     * @return this builder instance
     */
    @NotNull public Builder removePaymentStatus() {
      removeValue("paymentStatus");
      return this;
    }
    /**
     * Get currently set value for paymentStatus property in this builder.
     * @return previously set value or {@code null}. If multiple values have been 
     * set to this property, then {@link java.util.Collection} instance will be 
     * returned.
     */
    @Nullable public java.lang.Object getPaymentStatus() {
      return myData.get("paymentStatus");
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
     * The minimum payment required at this time.
     * @param monetaryAmount value to set
     * @return this builder instance
     */
    @NotNull public Builder minimumPaymentDue(@NotNull MonetaryAmount monetaryAmount) {
      putValue("minimumPaymentDue", monetaryAmount);
      return this;
    }
    /**
     * The minimum payment required at this time.
     * @param monetaryAmount value to set
     * @return this builder instance
     */
    @NotNull public Builder minimumPaymentDue(@NotNull MonetaryAmount.Builder monetaryAmount) {
      putValue("minimumPaymentDue", monetaryAmount.build());
      return this;
    }
    /**
     * The minimum payment required at this time.
     * @param priceSpecification value to set
     * @return this builder instance
     */
    @NotNull public Builder minimumPaymentDue(@NotNull PriceSpecification priceSpecification) {
      putValue("minimumPaymentDue", priceSpecification);
      return this;
    }
    /**
     * The minimum payment required at this time.
     * @param priceSpecification value to set
     * @return this builder instance
     */
    @NotNull public Builder minimumPaymentDue(@NotNull PriceSpecification.Builder priceSpecification) {
      putValue("minimumPaymentDue", priceSpecification.build());
      return this;
    }
    /**
     * Remove minimumPaymentDue property from the builder.
     * If this property is repeatable, all instances are removed.
     * @return this builder instance
     */
    @NotNull public Builder removeMinimumPaymentDue() {
      removeValue("minimumPaymentDue");
      return this;
    }
    /**
     * Get currently set value for minimumPaymentDue property in this builder.
     * @return previously set value or {@code null}. If multiple values have been 
     * set to this property, then {@link java.util.Collection} instance will be 
     * returned.
     */
    @Nullable public java.lang.Object getMinimumPaymentDue() {
      return myData.get("minimumPaymentDue");
    }
    /**
     * A category for the item. Greater signs or slashes can be used to informally indicate a category hierarchy.
     * @param category value to set
     * @return this builder instance
     */
    @NotNull public Builder category(@NotNull Category category) {
      putValue("category", category);
      return this;
    }
    /**
     * Remove category property from the builder.
     * If this property is repeatable, all instances are removed.
     * @return this builder instance
     */
    @NotNull public Builder removeCategory() {
      removeValue("category");
      return this;
    }
    /**
     * Get currently set value for category property in this builder.
     * @return previously set value or {@code null}. If multiple values have been 
     * set to this property, then {@link java.util.Collection} instance will be 
     * returned.
     */
    @Nullable public java.lang.Object getCategory() {
      return myData.get("category");
    }
    /**
     * The identifier for the account the payment will be applied to.
     * @param identifier value to set
     * @return this builder instance
     */
    @NotNull public Builder accountId(@NotNull Identifier identifier) {
      putValue("accountId", identifier);
      return this;
    }
    /**
     * Remove accountId property from the builder.
     * If this property is repeatable, all instances are removed.
     * @return this builder instance
     */
    @NotNull public Builder removeAccountId() {
      removeValue("accountId");
      return this;
    }
    /**
     * Get currently set value for accountId property in this builder.
     * @return previously set value or {@code null}. If multiple values have been 
     * set to this property, then {@link java.util.Collection} instance will be 
     * returned.
     */
    @Nullable public java.lang.Object getAccountId() {
      return myData.get("accountId");
    }
    /**
     * The Order(s) related to this Invoice. One or more Orders may be combined into a single Invoice.
     * @param order value to set
     * @return this builder instance
     */
    @NotNull public Builder referencesOrder(@NotNull Order order) {
      putValue("referencesOrder", order);
      return this;
    }
    /**
     * The Order(s) related to this Invoice. One or more Orders may be combined into a single Invoice.
     * @param order value to set
     * @return this builder instance
     */
    @NotNull public Builder referencesOrder(@NotNull Order.Builder order) {
      putValue("referencesOrder", order.build());
      return this;
    }
    /**
     * Remove referencesOrder property from the builder.
     * If this property is repeatable, all instances are removed.
     * @return this builder instance
     */
    @NotNull public Builder removeReferencesOrder() {
      removeValue("referencesOrder");
      return this;
    }
    /**
     * Get currently set value for referencesOrder property in this builder.
     * @return previously set value or {@code null}. If multiple values have been 
     * set to this property, then {@link java.util.Collection} instance will be 
     * returned.
     */
    @Nullable public java.lang.Object getReferencesOrder() {
      return myData.get("referencesOrder");
    }
    /**
     * The time interval used to compute the invoice.
     * @param duration value to set
     * @return this builder instance
     */
    @NotNull public Builder billingPeriod(@NotNull Duration duration) {
      putValue("billingPeriod", duration);
      return this;
    }
    /**
     * Remove billingPeriod property from the builder.
     * If this property is repeatable, all instances are removed.
     * @return this builder instance
     */
    @NotNull public Builder removeBillingPeriod() {
      removeValue("billingPeriod");
      return this;
    }
    /**
     * Get currently set value for billingPeriod property in this builder.
     * @return previously set value or {@code null}. If multiple values have been 
     * set to this property, then {@link java.util.Collection} instance will be 
     * returned.
     */
    @Nullable public java.lang.Object getBillingPeriod() {
      return myData.get("billingPeriod");
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
