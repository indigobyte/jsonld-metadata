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
 * A card payment method of a particular brand or name.  Used to mark up a particular payment method and/or the financial product/service that supplies the card account.&lt;br/&gt;&lt;br/&gt;
 * 
 * Commonly used values:&lt;br/&gt;&lt;br/&gt;
 * 
 * &lt;ul&gt;
 * &lt;li&gt;http://purl.org/goodrelations/v1#AmericanExpress&lt;/li&gt;
 * &lt;li&gt;http://purl.org/goodrelations/v1#DinersClub&lt;/li&gt;
 * &lt;li&gt;http://purl.org/goodrelations/v1#Discover&lt;/li&gt;
 * &lt;li&gt;http://purl.org/goodrelations/v1#JCB&lt;/li&gt;
 * &lt;li&gt;http://purl.org/goodrelations/v1#MasterCard&lt;/li&gt;
 * &lt;li&gt;http://purl.org/goodrelations/v1#VISA&lt;/li&gt;
 * &lt;/ul&gt;
 * Source: http://www.w3.org/wiki/WebSchemas/SchemaDotOrgSources#source_GoodRelationsClass
 */
public class CreditCard extends LoanOrCredit {
  /**
   * The minimum payment is the lowest amount of money that one is required to pay on a credit card statement each month.
   */
  @JsonIgnore public Integer getMonthlyMinimumRepaymentAmountInteger() {
    return (Integer) getValue("monthlyMinimumRepaymentAmount");
  }
  /**
   * The minimum payment is the lowest amount of money that one is required to pay on a credit card statement each month.
   */
  @JsonIgnore public Collection<Integer> getMonthlyMinimumRepaymentAmountIntegers() {
    final Object current = myData.get("monthlyMinimumRepaymentAmount");
    if (current == null) return Collections.emptyList();
    if (current instanceof Collection) {
      return (Collection<Integer>) current;
    }
    return Arrays.asList((Integer) current);
  }
  /**
   * The minimum payment is the lowest amount of money that one is required to pay on a credit card statement each month.
   */
  @JsonIgnore public Long getMonthlyMinimumRepaymentAmountLong() {
    return (Long) getValue("monthlyMinimumRepaymentAmount");
  }
  /**
   * The minimum payment is the lowest amount of money that one is required to pay on a credit card statement each month.
   */
  @JsonIgnore public Collection<Long> getMonthlyMinimumRepaymentAmountLongs() {
    final Object current = myData.get("monthlyMinimumRepaymentAmount");
    if (current == null) return Collections.emptyList();
    if (current instanceof Collection) {
      return (Collection<Long>) current;
    }
    return Arrays.asList((Long) current);
  }
  /**
   * The minimum payment is the lowest amount of money that one is required to pay on a credit card statement each month.
   */
  @JsonIgnore public Float getMonthlyMinimumRepaymentAmountFloat() {
    return (Float) getValue("monthlyMinimumRepaymentAmount");
  }
  /**
   * The minimum payment is the lowest amount of money that one is required to pay on a credit card statement each month.
   */
  @JsonIgnore public Collection<Float> getMonthlyMinimumRepaymentAmountFloats() {
    final Object current = myData.get("monthlyMinimumRepaymentAmount");
    if (current == null) return Collections.emptyList();
    if (current instanceof Collection) {
      return (Collection<Float>) current;
    }
    return Arrays.asList((Float) current);
  }
  /**
   * The minimum payment is the lowest amount of money that one is required to pay on a credit card statement each month.
   */
  @JsonIgnore public Double getMonthlyMinimumRepaymentAmountDouble() {
    return (Double) getValue("monthlyMinimumRepaymentAmount");
  }
  /**
   * The minimum payment is the lowest amount of money that one is required to pay on a credit card statement each month.
   */
  @JsonIgnore public Collection<Double> getMonthlyMinimumRepaymentAmountDoubles() {
    final Object current = myData.get("monthlyMinimumRepaymentAmount");
    if (current == null) return Collections.emptyList();
    if (current instanceof Collection) {
      return (Collection<Double>) current;
    }
    return Arrays.asList((Double) current);
  }
  /**
   * The minimum payment is the lowest amount of money that one is required to pay on a credit card statement each month.
   */
  @JsonIgnore public String getMonthlyMinimumRepaymentAmountString() {
    return (String) getValue("monthlyMinimumRepaymentAmount");
  }
  /**
   * The minimum payment is the lowest amount of money that one is required to pay on a credit card statement each month.
   */
  @JsonIgnore public Collection<String> getMonthlyMinimumRepaymentAmountStrings() {
    final Object current = myData.get("monthlyMinimumRepaymentAmount");
    if (current == null) return Collections.emptyList();
    if (current instanceof Collection) {
      return (Collection<String>) current;
    }
    return Arrays.asList((String) current);
  }
  protected CreditCard(java.util.Map<String,Object> data) {
    super(data);
  }
  
  /**
   * Builder for {@link CreditCard}
   */
  public static class Builder extends LoanOrCredit.Builder {
    public Builder(@NotNull HashMap<String,Object> data) {
      super(data);
    }
    @NotNull public CreditCard build() {
      return new CreditCard(myData);
    }
    /**
     * The minimum payment is the lowest amount of money that one is required to pay on a credit card statement each month.
     */
    @NotNull public Builder monthlyMinimumRepaymentAmount(@NotNull Integer integer) {
      putValue("monthlyMinimumRepaymentAmount", integer);
      return this;
    }
    /**
     * The minimum payment is the lowest amount of money that one is required to pay on a credit card statement each month.
     */
    @NotNull public Builder monthlyMinimumRepaymentAmount(@NotNull Long monthlyMinimumRepaymentAmount) {
      putValue("monthlyMinimumRepaymentAmount", monthlyMinimumRepaymentAmount);
      return this;
    }
    /**
     * The minimum payment is the lowest amount of money that one is required to pay on a credit card statement each month.
     */
    @NotNull public Builder monthlyMinimumRepaymentAmount(@NotNull Float monthlyMinimumRepaymentAmount) {
      putValue("monthlyMinimumRepaymentAmount", monthlyMinimumRepaymentAmount);
      return this;
    }
    /**
     * The minimum payment is the lowest amount of money that one is required to pay on a credit card statement each month.
     */
    @NotNull public Builder monthlyMinimumRepaymentAmount(@NotNull Double monthlyMinimumRepaymentAmount) {
      putValue("monthlyMinimumRepaymentAmount", monthlyMinimumRepaymentAmount);
      return this;
    }
    /**
     * The minimum payment is the lowest amount of money that one is required to pay on a credit card statement each month.
     */
    @NotNull public Builder monthlyMinimumRepaymentAmount(@NotNull String monthlyMinimumRepaymentAmount) {
      putValue("monthlyMinimumRepaymentAmount", monthlyMinimumRepaymentAmount);
      return this;
    }
    /**
     * The amount of money.
     */
    @NotNull public Builder amount(@NotNull Integer integer) {
      putValue("amount", integer);
      return this;
    }
    /**
     * The amount of money.
     */
    @NotNull public Builder amount(@NotNull Long amount) {
      putValue("amount", amount);
      return this;
    }
    /**
     * The amount of money.
     */
    @NotNull public Builder amount(@NotNull Float amount) {
      putValue("amount", amount);
      return this;
    }
    /**
     * The amount of money.
     */
    @NotNull public Builder amount(@NotNull Double amount) {
      putValue("amount", amount);
      return this;
    }
    /**
     * The amount of money.
     */
    @NotNull public Builder amount(@NotNull String amount) {
      putValue("amount", amount);
      return this;
    }
    /**
     * A form of paying back money previously borrowed from a lender. Repayment usually takes the form of periodic payments that normally include part principal plus interest in each payment.
     */
    @NotNull public Builder loanRepaymentForm(@NotNull RepaymentSpecification repaymentSpecification) {
      putValue("loanRepaymentForm", repaymentSpecification);
      return this;
    }
    /**
     * A form of paying back money previously borrowed from a lender. Repayment usually takes the form of periodic payments that normally include part principal plus interest in each payment.
     */
    @NotNull public Builder loanRepaymentForm(@NotNull RepaymentSpecification.Builder repaymentSpecification) {
      putValue("loanRepaymentForm", repaymentSpecification.build());
      return this;
    }
    /**
     * The duration of the loan or credit agreement.
     */
    @NotNull public Builder loanTerm(@NotNull Duration duration) {
      putValue("loanTerm", duration);
      return this;
    }
    /**
     * The type of a loan or credit.
     */
    @NotNull public Builder loanType(@NotNull String loanType) {
      putValue("loanType", loanType);
      return this;
    }
    /**
     * Whether the terms for payment of interest can be renegotiated during the life of the loan.
     */
    @NotNull public Builder renegotiableLoan(@NotNull Boolean renegotiableLoan) {
      putValue("renegotiableLoan", renegotiableLoan);
      return this;
    }
    /**
     * The currency in which the monetary amount is expressed.&lt;br/&gt;&lt;br/&gt;
     * 
     * Use standard formats: &lt;a href=&quot;http://en.wikipedia.org/wiki/ISO_4217&quot;&gt;ISO 4217 currency format&lt;/a&gt; e.g. &quot;USD&quot;; &lt;a href=&quot;https://en.wikipedia.org/wiki/List_of_cryptocurrencies&quot;&gt;Ticker symbol&lt;/a&gt; for cryptocurrencies e.g. &quot;BTC&quot;; well known names for &lt;a href=&quot;https://en.wikipedia.org/wiki/Local_exchange_trading_system&quot;&gt;Local Exchange Tradings Systems&lt;/a&gt; (LETS) and other currency types e.g. &quot;Ithaca HOUR&quot;.
     */
    @NotNull public Builder currency(@NotNull String currency) {
      putValue("currency", currency);
      return this;
    }
    /**
     * The period of time after any due date that the borrower has to fulfil its obligations before a default (failure to pay) is deemed to have occurred.
     */
    @NotNull public Builder gracePeriod(@NotNull Duration duration) {
      putValue("gracePeriod", duration);
      return this;
    }
    /**
     * The only way you get the money back in the event of default is the security. Recourse is where you still have the opportunity to go back to the borrower for the rest of the money.
     */
    @NotNull public Builder recourseLoan(@NotNull Boolean recourseLoan) {
      putValue("recourseLoan", recourseLoan);
      return this;
    }
    /**
     * Assets required to secure loan or credit repayments. It may take form of third party pledge, goods, financial instruments (cash, securities, etc.)
     */
    @NotNull public Builder requiredCollateral(@NotNull String requiredCollateral) {
      putValue("requiredCollateral", requiredCollateral);
      return this;
    }
    /**
     * Assets required to secure loan or credit repayments. It may take form of third party pledge, goods, financial instruments (cash, securities, etc.)
     */
    @NotNull public Builder requiredCollateral(@NotNull Thing thing) {
      putValue("requiredCollateral", thing);
      return this;
    }
    /**
     * Assets required to secure loan or credit repayments. It may take form of third party pledge, goods, financial instruments (cash, securities, etc.)
     */
    @NotNull public Builder requiredCollateral(@NotNull Thing.Builder thing) {
      putValue("requiredCollateral", thing.build());
      return this;
    }
    /**
     * Description of fees, commissions, and other terms applied either to a class of financial product, or by a financial service organization.
     */
    @NotNull public Builder feesAndCommissionsSpecification(@NotNull String feesAndCommissionsSpecification) {
      putValue("feesAndCommissionsSpecification", feesAndCommissionsSpecification);
      return this;
    }
    /**
     * The annual rate that is charged for borrowing (or made by investing), expressed as a single percentage number that represents the actual yearly cost of funds over the term of a loan. This includes any fees or additional costs associated with the transaction.
     */
    @NotNull public Builder annualPercentageRate(@NotNull Integer integer) {
      putValue("annualPercentageRate", integer);
      return this;
    }
    /**
     * The annual rate that is charged for borrowing (or made by investing), expressed as a single percentage number that represents the actual yearly cost of funds over the term of a loan. This includes any fees or additional costs associated with the transaction.
     */
    @NotNull public Builder annualPercentageRate(@NotNull Long annualPercentageRate) {
      putValue("annualPercentageRate", annualPercentageRate);
      return this;
    }
    /**
     * The annual rate that is charged for borrowing (or made by investing), expressed as a single percentage number that represents the actual yearly cost of funds over the term of a loan. This includes any fees or additional costs associated with the transaction.
     */
    @NotNull public Builder annualPercentageRate(@NotNull Float annualPercentageRate) {
      putValue("annualPercentageRate", annualPercentageRate);
      return this;
    }
    /**
     * The annual rate that is charged for borrowing (or made by investing), expressed as a single percentage number that represents the actual yearly cost of funds over the term of a loan. This includes any fees or additional costs associated with the transaction.
     */
    @NotNull public Builder annualPercentageRate(@NotNull Double annualPercentageRate) {
      putValue("annualPercentageRate", annualPercentageRate);
      return this;
    }
    /**
     * The annual rate that is charged for borrowing (or made by investing), expressed as a single percentage number that represents the actual yearly cost of funds over the term of a loan. This includes any fees or additional costs associated with the transaction.
     */
    @NotNull public Builder annualPercentageRate(@NotNull String annualPercentageRate) {
      putValue("annualPercentageRate", annualPercentageRate);
      return this;
    }
    /**
     * The interest rate, charged or paid, applicable to the financial product. Note: This is different from the calculated annualPercentageRate.
     */
    @NotNull public Builder interestRate(@NotNull Number number) {
      putValue("interestRate", number);
      return this;
    }
    /**
     * The interest rate, charged or paid, applicable to the financial product. Note: This is different from the calculated annualPercentageRate.
     */
    @NotNull public Builder interestRate(@NotNull QuantitativeValue quantitativeValue) {
      putValue("interestRate", quantitativeValue);
      return this;
    }
    /**
     * The interest rate, charged or paid, applicable to the financial product. Note: This is different from the calculated annualPercentageRate.
     */
    @NotNull public Builder interestRate(@NotNull QuantitativeValue.Builder quantitativeValue) {
      putValue("interestRate", quantitativeValue.build());
      return this;
    }
    /**
     * The tangible thing generated by the service, e.g. a passport, permit, etc.
     */
    @NotNull public Builder serviceOutput(@NotNull Thing thing) {
      putValue("serviceOutput", thing);
      return this;
    }
    /**
     * The tangible thing generated by the service, e.g. a passport, permit, etc.
     */
    @NotNull public Builder serviceOutput(@NotNull Thing.Builder thing) {
      putValue("serviceOutput", thing.build());
      return this;
    }
    /**
     * The type of service being offered, e.g. veterans' benefits, emergency relief, etc.
     */
    @NotNull public Builder serviceType(@NotNull GovernmentBenefitsType governmentBenefitsType) {
      putValue("serviceType", governmentBenefitsType);
      return this;
    }
    /**
     * The type of service being offered, e.g. veterans' benefits, emergency relief, etc.
     */
    @NotNull public Builder serviceType(@NotNull String serviceType) {
      putValue("serviceType", serviceType);
      return this;
    }
    /**
     * A pointer to another, functionally similar product (or multiple products).
     */
    @NotNull public Builder isSimilarTo(@NotNull Product product) {
      putValue("isSimilarTo", product);
      return this;
    }
    /**
     * A pointer to another, functionally similar product (or multiple products).
     */
    @NotNull public Builder isSimilarTo(@NotNull Product.Builder product) {
      putValue("isSimilarTo", product.build());
      return this;
    }
    /**
     * A pointer to another, functionally similar product (or multiple products).
     */
    @NotNull public Builder isSimilarTo(@NotNull Service service) {
      putValue("isSimilarTo", service);
      return this;
    }
    /**
     * A pointer to another, functionally similar product (or multiple products).
     */
    @NotNull public Builder isSimilarTo(@NotNull Service.Builder service) {
      putValue("isSimilarTo", service.build());
      return this;
    }
    /**
     * An award won by or for this item.
     */
    @NotNull public Builder award(@NotNull String award) {
      putValue("award", award);
      return this;
    }
    /**
     * The brand(s) associated with a product or service, or the brand(s) maintained by an organization or business person.
     */
    @NotNull public Builder brand(@NotNull Brand brand) {
      putValue("brand", brand);
      return this;
    }
    /**
     * The brand(s) associated with a product or service, or the brand(s) maintained by an organization or business person.
     */
    @NotNull public Builder brand(@NotNull Brand.Builder brand) {
      putValue("brand", brand.build());
      return this;
    }
    /**
     * The brand(s) associated with a product or service, or the brand(s) maintained by an organization or business person.
     */
    @NotNull public Builder brand(@NotNull Organization organization) {
      putValue("brand", organization);
      return this;
    }
    /**
     * The brand(s) associated with a product or service, or the brand(s) maintained by an organization or business person.
     */
    @NotNull public Builder brand(@NotNull Organization.Builder organization) {
      putValue("brand", organization.build());
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
     * Indicates an OfferCatalog listing for this Organization, Person, or Service.
     */
    @NotNull public Builder hasOfferCatalog(@NotNull OfferCatalog offerCatalog) {
      putValue("hasOfferCatalog", offerCatalog);
      return this;
    }
    /**
     * Indicates an OfferCatalog listing for this Organization, Person, or Service.
     */
    @NotNull public Builder hasOfferCatalog(@NotNull OfferCatalog.Builder offerCatalog) {
      putValue("hasOfferCatalog", offerCatalog.build());
      return this;
    }
    /**
     * A pointer to another, somehow related product (or multiple products).
     */
    @NotNull public Builder isRelatedTo(@NotNull Product product) {
      putValue("isRelatedTo", product);
      return this;
    }
    /**
     * A pointer to another, somehow related product (or multiple products).
     */
    @NotNull public Builder isRelatedTo(@NotNull Product.Builder product) {
      putValue("isRelatedTo", product.build());
      return this;
    }
    /**
     * A pointer to another, somehow related product (or multiple products).
     */
    @NotNull public Builder isRelatedTo(@NotNull Service service) {
      putValue("isRelatedTo", service);
      return this;
    }
    /**
     * A pointer to another, somehow related product (or multiple products).
     */
    @NotNull public Builder isRelatedTo(@NotNull Service.Builder service) {
      putValue("isRelatedTo", service.build());
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
     * A means of accessing the service (e.g. a phone bank, a web site, a location, etc.).
     */
    @NotNull public Builder availableChannel(@NotNull ServiceChannel serviceChannel) {
      putValue("availableChannel", serviceChannel);
      return this;
    }
    /**
     * A means of accessing the service (e.g. a phone bank, a web site, a location, etc.).
     */
    @NotNull public Builder availableChannel(@NotNull ServiceChannel.Builder serviceChannel) {
      putValue("availableChannel", serviceChannel.build());
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
     * An intended audience, i.e. a group for whom something was created.
     */
    @NotNull public Builder audience(@NotNull Audience audience) {
      putValue("audience", audience);
      return this;
    }
    /**
     * An intended audience, i.e. a group for whom something was created.
     */
    @NotNull public Builder audience(@NotNull Audience.Builder audience) {
      putValue("audience", audience.build());
      return this;
    }
    /**
     * The hours during which this service or contact is available.
     */
    @NotNull public Builder hoursAvailable(@NotNull OpeningHoursSpecification openingHoursSpecification) {
      putValue("hoursAvailable", openingHoursSpecification);
      return this;
    }
    /**
     * The hours during which this service or contact is available.
     */
    @NotNull public Builder hoursAvailable(@NotNull OpeningHoursSpecification.Builder openingHoursSpecification) {
      putValue("hoursAvailable", openingHoursSpecification.build());
      return this;
    }
    /**
     * A slogan or motto associated with the item.
     */
    @NotNull public Builder slogan(@NotNull String slogan) {
      putValue("slogan", slogan);
      return this;
    }
    /**
     * Indicates the mobility of a provided service (e.g. 'static', 'dynamic').
     */
    @NotNull public Builder providerMobility(@NotNull String providerMobility) {
      putValue("providerMobility", providerMobility);
      return this;
    }
    /**
     * An associated logo.
     */
    @NotNull public Builder logo(@NotNull Image image) {
      putValue("logo", image);
      return this;
    }
    /**
     * Human-readable terms of service documentation.
     */
    @NotNull public Builder termsOfService(@NotNull String termsOfService) {
      putValue("termsOfService", termsOfService);
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
     * An offer to provide this item&amp;#x2014;for example, an offer to sell a product, rent the DVD of a movie, perform a service, or give away tickets to an event. Use &lt;a class=&quot;localLink&quot; href=&quot;http://schema.org/businessFunction&quot;&gt;businessFunction&lt;/a&gt; to indicate the kind of transaction offered, i.e. sell, lease, etc. This property can also be used to describe a &lt;a class=&quot;localLink&quot; href=&quot;http://schema.org/Demand&quot;&gt;Demand&lt;/a&gt;. While this property is listed as expected on a number of common types, it can be used in others. In that case, using a second type, such as Product or a subtype of Product, can clarify the nature of the offer.
     */
    @NotNull public Builder offers(@NotNull Demand demand) {
      putValue("offers", demand);
      return this;
    }
    /**
     * An offer to provide this item&amp;#x2014;for example, an offer to sell a product, rent the DVD of a movie, perform a service, or give away tickets to an event. Use &lt;a class=&quot;localLink&quot; href=&quot;http://schema.org/businessFunction&quot;&gt;businessFunction&lt;/a&gt; to indicate the kind of transaction offered, i.e. sell, lease, etc. This property can also be used to describe a &lt;a class=&quot;localLink&quot; href=&quot;http://schema.org/Demand&quot;&gt;Demand&lt;/a&gt;. While this property is listed as expected on a number of common types, it can be used in others. In that case, using a second type, such as Product or a subtype of Product, can clarify the nature of the offer.
     */
    @NotNull public Builder offers(@NotNull Demand.Builder demand) {
      putValue("offers", demand.build());
      return this;
    }
    /**
     * An offer to provide this item&amp;#x2014;for example, an offer to sell a product, rent the DVD of a movie, perform a service, or give away tickets to an event. Use &lt;a class=&quot;localLink&quot; href=&quot;http://schema.org/businessFunction&quot;&gt;businessFunction&lt;/a&gt; to indicate the kind of transaction offered, i.e. sell, lease, etc. This property can also be used to describe a &lt;a class=&quot;localLink&quot; href=&quot;http://schema.org/Demand&quot;&gt;Demand&lt;/a&gt;. While this property is listed as expected on a number of common types, it can be used in others. In that case, using a second type, such as Product or a subtype of Product, can clarify the nature of the offer.
     */
    @NotNull public Builder offers(@NotNull Offer offer) {
      putValue("offers", offer);
      return this;
    }
    /**
     * An offer to provide this item&amp;#x2014;for example, an offer to sell a product, rent the DVD of a movie, perform a service, or give away tickets to an event. Use &lt;a class=&quot;localLink&quot; href=&quot;http://schema.org/businessFunction&quot;&gt;businessFunction&lt;/a&gt; to indicate the kind of transaction offered, i.e. sell, lease, etc. This property can also be used to describe a &lt;a class=&quot;localLink&quot; href=&quot;http://schema.org/Demand&quot;&gt;Demand&lt;/a&gt;. While this property is listed as expected on a number of common types, it can be used in others. In that case, using a second type, such as Product or a subtype of Product, can clarify the nature of the offer.
     */
    @NotNull public Builder offers(@NotNull Offer.Builder offer) {
      putValue("offers", offer.build());
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
     * A sub property of description. A short description of the item used to disambiguate from other, similar items. Information from other properties (in particular, name) may be necessary for the description to be useful for disambiguation.
     */
    @NotNull public Builder disambiguatingDescription(@NotNull Description description) {
      putValue("disambiguatingDescription", description);
      return this;
    }
    /**
     * A description of the item.
     */
    @NotNull public Builder description(@NotNull Description description) {
      putValue("description", description);
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
     * The name of the item.
     */
    @NotNull public Builder name(@NotNull String name) {
      putValue("name", name);
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
     * An image of the item. This can be a &lt;a class=&quot;localLink&quot; href=&quot;http://schema.org/URL&quot;&gt;URL&lt;/a&gt; or a fully described &lt;a class=&quot;localLink&quot; href=&quot;http://schema.org/ImageObject&quot;&gt;ImageObject&lt;/a&gt;.
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
     * Indicates a page (or other CreativeWork) for which this thing is the main entity being described. See &lt;a href=&quot;/docs/datamodel.html#mainEntityBackground&quot;&gt;background notes&lt;/a&gt; for details.
     */
    @NotNull public Builder mainEntityOfPage(@NotNull CreativeWork creativeWork) {
      putValue("mainEntityOfPage", creativeWork);
      return this;
    }
    /**
     * Indicates a page (or other CreativeWork) for which this thing is the main entity being described. See &lt;a href=&quot;/docs/datamodel.html#mainEntityBackground&quot;&gt;background notes&lt;/a&gt; for details.
     */
    @NotNull public Builder mainEntityOfPage(@NotNull CreativeWork.Builder creativeWork) {
      putValue("mainEntityOfPage", creativeWork.build());
      return this;
    }
    /**
     * Indicates a page (or other CreativeWork) for which this thing is the main entity being described. See &lt;a href=&quot;/docs/datamodel.html#mainEntityBackground&quot;&gt;background notes&lt;/a&gt; for details.
     */
    @NotNull public Builder mainEntityOfPage(@NotNull String mainEntityOfPage) {
      putValue("mainEntityOfPage", mainEntityOfPage);
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
      if ("monthlyMinimumRepaymentAmount".equals(key) && value instanceof Integer) { this.monthlyMinimumRepaymentAmount((Integer)value); return; }
      if ("monthlyMinimumRepaymentAmounts".equals(key) && value instanceof Integer) { this.monthlyMinimumRepaymentAmount((Integer)value); return; }
      if ("monthlyMinimumRepaymentAmount".equals(key) && value instanceof Long) { this.monthlyMinimumRepaymentAmount((Long)value); return; }
      if ("monthlyMinimumRepaymentAmounts".equals(key) && value instanceof Long) { this.monthlyMinimumRepaymentAmount((Long)value); return; }
      if ("monthlyMinimumRepaymentAmount".equals(key) && value instanceof Float) { this.monthlyMinimumRepaymentAmount((Float)value); return; }
      if ("monthlyMinimumRepaymentAmounts".equals(key) && value instanceof Float) { this.monthlyMinimumRepaymentAmount((Float)value); return; }
      if ("monthlyMinimumRepaymentAmount".equals(key) && value instanceof Double) { this.monthlyMinimumRepaymentAmount((Double)value); return; }
      if ("monthlyMinimumRepaymentAmounts".equals(key) && value instanceof Double) { this.monthlyMinimumRepaymentAmount((Double)value); return; }
      if ("monthlyMinimumRepaymentAmount".equals(key) && value instanceof String) { this.monthlyMinimumRepaymentAmount((String)value); return; }
      if ("monthlyMinimumRepaymentAmounts".equals(key) && value instanceof String) { this.monthlyMinimumRepaymentAmount((String)value); return; }
      super.fromMap(key, value);
    }
  }
  
}
