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
 * A financial product for the loaning of an amount of money, or line of credit, under agreed terms and charges.
 */
public class LoanOrCredit extends FinancialProduct {
  /**
   * The amount of money.
   * @return amount property set by first invocation of amount method or {@code null}.
   */
  @JsonIgnore public MonetaryAmount getAmountMonetaryAmount() {
    return (MonetaryAmount) getValue("amount");
  }
  /**
   * The amount of money.
   * @return all amount properties as {@link java.util.Collection} or an empty collection 
   * if amount was not set.
   */
  @JsonIgnore public java.util.Collection<MonetaryAmount> getAmountMonetaryAmounts() {
    final java.lang.Object current = myData.get("amount");
    if (current == null) return Collections.emptyList();
    if (current instanceof java.util.Collection) {
      return (java.util.Collection<MonetaryAmount>) current;
    }
    return Arrays.asList((MonetaryAmount) current);
  }
  /**
   * The amount of money.
   * @return amount property set by first invocation of amount method or {@code null}.
   */
  @JsonIgnore public Number getAmountNumber() {
    return (Number) getValue("amount");
  }
  /**
   * The amount of money.
   * @return all amount properties as {@link java.util.Collection} or an empty collection 
   * if amount was not set.
   */
  @JsonIgnore public java.util.Collection<Number> getAmountNumbers() {
    final java.lang.Object current = myData.get("amount");
    if (current == null) return Collections.emptyList();
    if (current instanceof java.util.Collection) {
      return (java.util.Collection<Number>) current;
    }
    return Arrays.asList((Number) current);
  }
  /**
   * The duration of the loan or credit agreement.
   * @return loanTerm property set by first invocation of loanTerm method or {@code null}.
   */
  @JsonIgnore public Duration getLoanTerm() {
    return (Duration) getValue("loanTerm");
  }
  /**
   * The duration of the loan or credit agreement.
   * @return all loanTerm properties as {@link java.util.Collection} or an empty collection 
   * if loanTerm was not set.
   */
  @JsonIgnore public java.util.Collection<Duration> getLoanTerms() {
    final java.lang.Object current = myData.get("loanTerm");
    if (current == null) return Collections.emptyList();
    if (current instanceof java.util.Collection) {
      return (java.util.Collection<Duration>) current;
    }
    return Arrays.asList((Duration) current);
  }
  /**
   * The only way you get the money back in the event of default is the security. Recourse is where you still have the opportunity to go back to the borrower for the rest of the money.
   * @return recourseLoan property set by first invocation of recourseLoan method or {@code null}.
   */
  @JsonIgnore public Boolean getRecourseLoan() {
    return (Boolean) getValue("recourseLoan");
  }
  /**
   * The only way you get the money back in the event of default is the security. Recourse is where you still have the opportunity to go back to the borrower for the rest of the money.
   * @return all recourseLoan properties as {@link java.util.Collection} or an empty collection 
   * if recourseLoan was not set.
   */
  @JsonIgnore public java.util.Collection<Boolean> getRecourseLoans() {
    final java.lang.Object current = myData.get("recourseLoan");
    if (current == null) return Collections.emptyList();
    if (current instanceof java.util.Collection) {
      return (java.util.Collection<Boolean>) current;
    }
    return Arrays.asList((Boolean) current);
  }
  /**
   * The period of time after any due date that the borrower has to fulfil its obligations before a default (failure to pay) is deemed to have occurred.
   * @return gracePeriod property set by first invocation of gracePeriod method or {@code null}.
   */
  @JsonIgnore public Duration getGracePeriod() {
    return (Duration) getValue("gracePeriod");
  }
  /**
   * The period of time after any due date that the borrower has to fulfil its obligations before a default (failure to pay) is deemed to have occurred.
   * @return all gracePeriod properties as {@link java.util.Collection} or an empty collection 
   * if gracePeriod was not set.
   */
  @JsonIgnore public java.util.Collection<Duration> getGracePeriods() {
    final java.lang.Object current = myData.get("gracePeriod");
    if (current == null) return Collections.emptyList();
    if (current instanceof java.util.Collection) {
      return (java.util.Collection<Duration>) current;
    }
    return Arrays.asList((Duration) current);
  }
  /**
   * The type of a loan or credit.
   * @return loanType property set by first invocation of loanType method or {@code null}.
   */
  @JsonIgnore public String getLoanType() {
    return (String) getValue("loanType");
  }
  /**
   * The type of a loan or credit.
   * @return all loanType properties as {@link java.util.Collection} or an empty collection 
   * if loanType was not set.
   */
  @JsonIgnore public java.util.Collection<String> getLoanTypes() {
    final java.lang.Object current = myData.get("loanType");
    if (current == null) return Collections.emptyList();
    if (current instanceof java.util.Collection) {
      return (java.util.Collection<String>) current;
    }
    return Arrays.asList((String) current);
  }
  /**
   * The currency in which the monetary amount is expressed.\n\nUse standard formats: [ISO 4217 currency format](http://en.wikipedia.org/wiki/ISO_4217) e.g. &quot;USD&quot;; [Ticker symbol](https://en.wikipedia.org/wiki/List_of_cryptocurrencies) for cryptocurrencies e.g. &quot;BTC&quot;; well known names for [Local Exchange Tradings Systems](https://en.wikipedia.org/wiki/Local_exchange_trading_system) (LETS) and other currency types e.g. &quot;Ithaca HOUR&quot;.
   * @return currency property set by first invocation of currency method or {@code null}.
   */
  @JsonIgnore public String getCurrency() {
    return (String) getValue("currency");
  }
  /**
   * The currency in which the monetary amount is expressed.\n\nUse standard formats: [ISO 4217 currency format](http://en.wikipedia.org/wiki/ISO_4217) e.g. &quot;USD&quot;; [Ticker symbol](https://en.wikipedia.org/wiki/List_of_cryptocurrencies) for cryptocurrencies e.g. &quot;BTC&quot;; well known names for [Local Exchange Tradings Systems](https://en.wikipedia.org/wiki/Local_exchange_trading_system) (LETS) and other currency types e.g. &quot;Ithaca HOUR&quot;.
   * @return all currency properties as {@link java.util.Collection} or an empty collection 
   * if currency was not set.
   */
  @JsonIgnore public java.util.Collection<String> getCurrencys() {
    final java.lang.Object current = myData.get("currency");
    if (current == null) return Collections.emptyList();
    if (current instanceof java.util.Collection) {
      return (java.util.Collection<String>) current;
    }
    return Arrays.asList((String) current);
  }
  /**
   * A form of paying back money previously borrowed from a lender. Repayment usually takes the form of periodic payments that normally include part principal plus interest in each payment.
   * @return loanRepaymentForm property set by first invocation of loanRepaymentForm method or {@code null}.
   */
  @JsonIgnore public RepaymentSpecification getLoanRepaymentForm() {
    return (RepaymentSpecification) getValue("loanRepaymentForm");
  }
  /**
   * A form of paying back money previously borrowed from a lender. Repayment usually takes the form of periodic payments that normally include part principal plus interest in each payment.
   * @return all loanRepaymentForm properties as {@link java.util.Collection} or an empty collection 
   * if loanRepaymentForm was not set.
   */
  @JsonIgnore public java.util.Collection<RepaymentSpecification> getLoanRepaymentForms() {
    final java.lang.Object current = myData.get("loanRepaymentForm");
    if (current == null) return Collections.emptyList();
    if (current instanceof java.util.Collection) {
      return (java.util.Collection<RepaymentSpecification>) current;
    }
    return Arrays.asList((RepaymentSpecification) current);
  }
  /**
   * Assets required to secure loan or credit repayments. It may take form of third party pledge, goods, financial instruments (cash, securities, etc.)
   * @return requiredCollateral property set by first invocation of requiredCollateral method or {@code null}.
   */
  @JsonIgnore public String getRequiredCollateralString() {
    return (String) getValue("requiredCollateral");
  }
  /**
   * Assets required to secure loan or credit repayments. It may take form of third party pledge, goods, financial instruments (cash, securities, etc.)
   * @return all requiredCollateral properties as {@link java.util.Collection} or an empty collection 
   * if requiredCollateral was not set.
   */
  @JsonIgnore public java.util.Collection<String> getRequiredCollateralStrings() {
    final java.lang.Object current = myData.get("requiredCollateral");
    if (current == null) return Collections.emptyList();
    if (current instanceof java.util.Collection) {
      return (java.util.Collection<String>) current;
    }
    return Arrays.asList((String) current);
  }
  /**
   * Assets required to secure loan or credit repayments. It may take form of third party pledge, goods, financial instruments (cash, securities, etc.)
   * @return requiredCollateral property set by first invocation of requiredCollateral method or {@code null}.
   */
  @JsonIgnore public Thing getRequiredCollateralThing() {
    return (Thing) getValue("requiredCollateral");
  }
  /**
   * Assets required to secure loan or credit repayments. It may take form of third party pledge, goods, financial instruments (cash, securities, etc.)
   * @return all requiredCollateral properties as {@link java.util.Collection} or an empty collection 
   * if requiredCollateral was not set.
   */
  @JsonIgnore public java.util.Collection<Thing> getRequiredCollateralThings() {
    final java.lang.Object current = myData.get("requiredCollateral");
    if (current == null) return Collections.emptyList();
    if (current instanceof java.util.Collection) {
      return (java.util.Collection<Thing>) current;
    }
    return Arrays.asList((Thing) current);
  }
  /**
   * Whether the terms for payment of interest can be renegotiated during the life of the loan.
   * @return renegotiableLoan property set by first invocation of renegotiableLoan method or {@code null}.
   */
  @JsonIgnore public Boolean getRenegotiableLoan() {
    return (Boolean) getValue("renegotiableLoan");
  }
  /**
   * Whether the terms for payment of interest can be renegotiated during the life of the loan.
   * @return all renegotiableLoan properties as {@link java.util.Collection} or an empty collection 
   * if renegotiableLoan was not set.
   */
  @JsonIgnore public java.util.Collection<Boolean> getRenegotiableLoans() {
    final java.lang.Object current = myData.get("renegotiableLoan");
    if (current == null) return Collections.emptyList();
    if (current instanceof java.util.Collection) {
      return (java.util.Collection<Boolean>) current;
    }
    return Arrays.asList((Boolean) current);
  }
  protected LoanOrCredit(java.util.Map<String,java.lang.Object> data) {
    super(data);
  }
  
  /**
   * Builder for {@link LoanOrCredit}
   */
  public static class Builder extends FinancialProduct.Builder {
    public Builder(@NotNull HashMap<String,java.lang.Object> data) {
      super(data);
    }
    @NotNull public LoanOrCredit build() {
      return new LoanOrCredit(myData);
    }
    /**
     * The amount of money.
     * @param monetaryAmount value to set
     * @return this builder instance
     */
    @NotNull public Builder amount(@NotNull MonetaryAmount monetaryAmount) {
      putValue("amount", monetaryAmount);
      return this;
    }
    /**
     * The amount of money.
     * @param monetaryAmount value to set
     * @return this builder instance
     */
    @NotNull public Builder amount(@NotNull MonetaryAmount.Builder monetaryAmount) {
      putValue("amount", monetaryAmount.build());
      return this;
    }
    /**
     * The amount of money.
     * @param number value to set
     * @return this builder instance
     */
    @NotNull public Builder amount(@NotNull Number number) {
      putValue("amount", number);
      return this;
    }
    /**
     * Remove amount property from the builder.
     * If this property is repeatable, all instances are removed.
     * @return this builder instance
     */
    @NotNull public Builder removeAmount() {
      removeValue("amount");
      return this;
    }
    /**
     * Get currently set value for amount property in this builder.
     * @return previously set value or {@code null}. If multiple values have been 
     * set to this property, then {@link java.util.Collection} instance will be 
     * returned.
     */
    @Nullable public java.lang.Object getAmount() {
      return myData.get("amount");
    }
    /**
     * The duration of the loan or credit agreement.
     * @param duration value to set
     * @return this builder instance
     */
    @NotNull public Builder loanTerm(@NotNull Duration duration) {
      putValue("loanTerm", duration);
      return this;
    }
    /**
     * Remove loanTerm property from the builder.
     * If this property is repeatable, all instances are removed.
     * @return this builder instance
     */
    @NotNull public Builder removeLoanTerm() {
      removeValue("loanTerm");
      return this;
    }
    /**
     * Get currently set value for loanTerm property in this builder.
     * @return previously set value or {@code null}. If multiple values have been 
     * set to this property, then {@link java.util.Collection} instance will be 
     * returned.
     */
    @Nullable public java.lang.Object getLoanTerm() {
      return myData.get("loanTerm");
    }
    /**
     * The only way you get the money back in the event of default is the security. Recourse is where you still have the opportunity to go back to the borrower for the rest of the money.
     * @param recourseLoan value to set
     * @return this builder instance
     */
    @NotNull public Builder recourseLoan(@NotNull Boolean recourseLoan) {
      putValue("recourseLoan", recourseLoan);
      return this;
    }
    /**
     * Remove recourseLoan property from the builder.
     * If this property is repeatable, all instances are removed.
     * @return this builder instance
     */
    @NotNull public Builder removeRecourseLoan() {
      removeValue("recourseLoan");
      return this;
    }
    /**
     * Get currently set value for recourseLoan property in this builder.
     * @return previously set value or {@code null}. If multiple values have been 
     * set to this property, then {@link java.util.Collection} instance will be 
     * returned.
     */
    @Nullable public java.lang.Object getRecourseLoan() {
      return myData.get("recourseLoan");
    }
    /**
     * The period of time after any due date that the borrower has to fulfil its obligations before a default (failure to pay) is deemed to have occurred.
     * @param duration value to set
     * @return this builder instance
     */
    @NotNull public Builder gracePeriod(@NotNull Duration duration) {
      putValue("gracePeriod", duration);
      return this;
    }
    /**
     * Remove gracePeriod property from the builder.
     * If this property is repeatable, all instances are removed.
     * @return this builder instance
     */
    @NotNull public Builder removeGracePeriod() {
      removeValue("gracePeriod");
      return this;
    }
    /**
     * Get currently set value for gracePeriod property in this builder.
     * @return previously set value or {@code null}. If multiple values have been 
     * set to this property, then {@link java.util.Collection} instance will be 
     * returned.
     */
    @Nullable public java.lang.Object getGracePeriod() {
      return myData.get("gracePeriod");
    }
    /**
     * The type of a loan or credit.
     * @param loanType value to set
     * @return this builder instance
     */
    @NotNull public Builder loanType(@NotNull String loanType) {
      putValue("loanType", loanType);
      return this;
    }
    /**
     * Remove loanType property from the builder.
     * If this property is repeatable, all instances are removed.
     * @return this builder instance
     */
    @NotNull public Builder removeLoanType() {
      removeValue("loanType");
      return this;
    }
    /**
     * Get currently set value for loanType property in this builder.
     * @return previously set value or {@code null}. If multiple values have been 
     * set to this property, then {@link java.util.Collection} instance will be 
     * returned.
     */
    @Nullable public java.lang.Object getLoanType() {
      return myData.get("loanType");
    }
    /**
     * The currency in which the monetary amount is expressed.\n\nUse standard formats: [ISO 4217 currency format](http://en.wikipedia.org/wiki/ISO_4217) e.g. &quot;USD&quot;; [Ticker symbol](https://en.wikipedia.org/wiki/List_of_cryptocurrencies) for cryptocurrencies e.g. &quot;BTC&quot;; well known names for [Local Exchange Tradings Systems](https://en.wikipedia.org/wiki/Local_exchange_trading_system) (LETS) and other currency types e.g. &quot;Ithaca HOUR&quot;.
     * @param currency value to set
     * @return this builder instance
     */
    @NotNull public Builder currency(@NotNull String currency) {
      putValue("currency", currency);
      return this;
    }
    /**
     * Remove currency property from the builder.
     * If this property is repeatable, all instances are removed.
     * @return this builder instance
     */
    @NotNull public Builder removeCurrency() {
      removeValue("currency");
      return this;
    }
    /**
     * Get currently set value for currency property in this builder.
     * @return previously set value or {@code null}. If multiple values have been 
     * set to this property, then {@link java.util.Collection} instance will be 
     * returned.
     */
    @Nullable public java.lang.Object getCurrency() {
      return myData.get("currency");
    }
    /**
     * A form of paying back money previously borrowed from a lender. Repayment usually takes the form of periodic payments that normally include part principal plus interest in each payment.
     * @param repaymentSpecification value to set
     * @return this builder instance
     */
    @NotNull public Builder loanRepaymentForm(@NotNull RepaymentSpecification repaymentSpecification) {
      putValue("loanRepaymentForm", repaymentSpecification);
      return this;
    }
    /**
     * A form of paying back money previously borrowed from a lender. Repayment usually takes the form of periodic payments that normally include part principal plus interest in each payment.
     * @param repaymentSpecification value to set
     * @return this builder instance
     */
    @NotNull public Builder loanRepaymentForm(@NotNull RepaymentSpecification.Builder repaymentSpecification) {
      putValue("loanRepaymentForm", repaymentSpecification.build());
      return this;
    }
    /**
     * Remove loanRepaymentForm property from the builder.
     * If this property is repeatable, all instances are removed.
     * @return this builder instance
     */
    @NotNull public Builder removeLoanRepaymentForm() {
      removeValue("loanRepaymentForm");
      return this;
    }
    /**
     * Get currently set value for loanRepaymentForm property in this builder.
     * @return previously set value or {@code null}. If multiple values have been 
     * set to this property, then {@link java.util.Collection} instance will be 
     * returned.
     */
    @Nullable public java.lang.Object getLoanRepaymentForm() {
      return myData.get("loanRepaymentForm");
    }
    /**
     * Assets required to secure loan or credit repayments. It may take form of third party pledge, goods, financial instruments (cash, securities, etc.)
     * @param requiredCollateral value to set
     * @return this builder instance
     */
    @NotNull public Builder requiredCollateral(@NotNull String requiredCollateral) {
      putValue("requiredCollateral", requiredCollateral);
      return this;
    }
    /**
     * Assets required to secure loan or credit repayments. It may take form of third party pledge, goods, financial instruments (cash, securities, etc.)
     * @param thing value to set
     * @return this builder instance
     */
    @NotNull public Builder requiredCollateral(@NotNull Thing thing) {
      putValue("requiredCollateral", thing);
      return this;
    }
    /**
     * Assets required to secure loan or credit repayments. It may take form of third party pledge, goods, financial instruments (cash, securities, etc.)
     * @param thing value to set
     * @return this builder instance
     */
    @NotNull public Builder requiredCollateral(@NotNull Thing.Builder thing) {
      putValue("requiredCollateral", thing.build());
      return this;
    }
    /**
     * Remove requiredCollateral property from the builder.
     * If this property is repeatable, all instances are removed.
     * @return this builder instance
     */
    @NotNull public Builder removeRequiredCollateral() {
      removeValue("requiredCollateral");
      return this;
    }
    /**
     * Get currently set value for requiredCollateral property in this builder.
     * @return previously set value or {@code null}. If multiple values have been 
     * set to this property, then {@link java.util.Collection} instance will be 
     * returned.
     */
    @Nullable public java.lang.Object getRequiredCollateral() {
      return myData.get("requiredCollateral");
    }
    /**
     * Whether the terms for payment of interest can be renegotiated during the life of the loan.
     * @param renegotiableLoan value to set
     * @return this builder instance
     */
    @NotNull public Builder renegotiableLoan(@NotNull Boolean renegotiableLoan) {
      putValue("renegotiableLoan", renegotiableLoan);
      return this;
    }
    /**
     * Remove renegotiableLoan property from the builder.
     * If this property is repeatable, all instances are removed.
     * @return this builder instance
     */
    @NotNull public Builder removeRenegotiableLoan() {
      removeValue("renegotiableLoan");
      return this;
    }
    /**
     * Get currently set value for renegotiableLoan property in this builder.
     * @return previously set value or {@code null}. If multiple values have been 
     * set to this property, then {@link java.util.Collection} instance will be 
     * returned.
     */
    @Nullable public java.lang.Object getRenegotiableLoan() {
      return myData.get("renegotiableLoan");
    }
    /**
     * The interest rate, charged or paid, applicable to the financial product. Note: This is different from the calculated annualPercentageRate.
     * @param integer value to set
     * @return this builder instance
     */
    @NotNull public Builder interestRate(@NotNull Integer integer) {
      putValue("interestRate", integer);
      return this;
    }
    /**
     * The interest rate, charged or paid, applicable to the financial product. Note: This is different from the calculated annualPercentageRate.
     * @param interestRate value to set
     * @return this builder instance
     */
    @NotNull public Builder interestRate(@NotNull Long interestRate) {
      putValue("interestRate", interestRate);
      return this;
    }
    /**
     * The interest rate, charged or paid, applicable to the financial product. Note: This is different from the calculated annualPercentageRate.
     * @param interestRate value to set
     * @return this builder instance
     */
    @NotNull public Builder interestRate(@NotNull Float interestRate) {
      putValue("interestRate", interestRate);
      return this;
    }
    /**
     * The interest rate, charged or paid, applicable to the financial product. Note: This is different from the calculated annualPercentageRate.
     * @param interestRate value to set
     * @return this builder instance
     */
    @NotNull public Builder interestRate(@NotNull Double interestRate) {
      putValue("interestRate", interestRate);
      return this;
    }
    /**
     * The interest rate, charged or paid, applicable to the financial product. Note: This is different from the calculated annualPercentageRate.
     * @param interestRate value to set
     * @return this builder instance
     */
    @NotNull public Builder interestRate(@NotNull String interestRate) {
      putValue("interestRate", interestRate);
      return this;
    }
    /**
     * Remove interestRate property from the builder.
     * If this property is repeatable, all instances are removed.
     * @return this builder instance
     */
    @NotNull public Builder removeInterestRate() {
      removeValue("interestRate");
      return this;
    }
    /**
     * Get currently set value for interestRate property in this builder.
     * @return previously set value or {@code null}. If multiple values have been 
     * set to this property, then {@link java.util.Collection} instance will be 
     * returned.
     */
    @Nullable public java.lang.Object getInterestRate() {
      return myData.get("interestRate");
    }
    /**
     * Description of fees, commissions, and other terms applied either to a class of financial product, or by a financial service organization.
     * @param feesAndCommissionsSpecification value to set
     * @return this builder instance
     */
    @NotNull public Builder feesAndCommissionsSpecification(@NotNull String feesAndCommissionsSpecification) {
      putValue("feesAndCommissionsSpecification", feesAndCommissionsSpecification);
      return this;
    }
    /**
     * Remove feesAndCommissionsSpecification property from the builder.
     * If this property is repeatable, all instances are removed.
     * @return this builder instance
     */
    @NotNull public Builder removeFeesAndCommissionsSpecification() {
      removeValue("feesAndCommissionsSpecification");
      return this;
    }
    /**
     * Get currently set value for feesAndCommissionsSpecification property in this builder.
     * @return previously set value or {@code null}. If multiple values have been 
     * set to this property, then {@link java.util.Collection} instance will be 
     * returned.
     */
    @Nullable public java.lang.Object getFeesAndCommissionsSpecification() {
      return myData.get("feesAndCommissionsSpecification");
    }
    /**
     * The annual rate that is charged for borrowing (or made by investing), expressed as a single percentage number that represents the actual yearly cost of funds over the term of a loan. This includes any fees or additional costs associated with the transaction.
     * @param integer value to set
     * @return this builder instance
     */
    @NotNull public Builder annualPercentageRate(@NotNull Integer integer) {
      putValue("annualPercentageRate", integer);
      return this;
    }
    /**
     * The annual rate that is charged for borrowing (or made by investing), expressed as a single percentage number that represents the actual yearly cost of funds over the term of a loan. This includes any fees or additional costs associated with the transaction.
     * @param annualPercentageRate value to set
     * @return this builder instance
     */
    @NotNull public Builder annualPercentageRate(@NotNull Long annualPercentageRate) {
      putValue("annualPercentageRate", annualPercentageRate);
      return this;
    }
    /**
     * The annual rate that is charged for borrowing (or made by investing), expressed as a single percentage number that represents the actual yearly cost of funds over the term of a loan. This includes any fees or additional costs associated with the transaction.
     * @param annualPercentageRate value to set
     * @return this builder instance
     */
    @NotNull public Builder annualPercentageRate(@NotNull Float annualPercentageRate) {
      putValue("annualPercentageRate", annualPercentageRate);
      return this;
    }
    /**
     * The annual rate that is charged for borrowing (or made by investing), expressed as a single percentage number that represents the actual yearly cost of funds over the term of a loan. This includes any fees or additional costs associated with the transaction.
     * @param annualPercentageRate value to set
     * @return this builder instance
     */
    @NotNull public Builder annualPercentageRate(@NotNull Double annualPercentageRate) {
      putValue("annualPercentageRate", annualPercentageRate);
      return this;
    }
    /**
     * The annual rate that is charged for borrowing (or made by investing), expressed as a single percentage number that represents the actual yearly cost of funds over the term of a loan. This includes any fees or additional costs associated with the transaction.
     * @param annualPercentageRate value to set
     * @return this builder instance
     */
    @NotNull public Builder annualPercentageRate(@NotNull String annualPercentageRate) {
      putValue("annualPercentageRate", annualPercentageRate);
      return this;
    }
    /**
     * Remove annualPercentageRate property from the builder.
     * If this property is repeatable, all instances are removed.
     * @return this builder instance
     */
    @NotNull public Builder removeAnnualPercentageRate() {
      removeValue("annualPercentageRate");
      return this;
    }
    /**
     * Get currently set value for annualPercentageRate property in this builder.
     * @return previously set value or {@code null}. If multiple values have been 
     * set to this property, then {@link java.util.Collection} instance will be 
     * returned.
     */
    @Nullable public java.lang.Object getAnnualPercentageRate() {
      return myData.get("annualPercentageRate");
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
     * A means of accessing the service (e.g. a phone bank, a web site, a location, etc.).
     * @param serviceChannel value to set
     * @return this builder instance
     */
    @NotNull public Builder availableChannel(@NotNull ServiceChannel serviceChannel) {
      putValue("availableChannel", serviceChannel);
      return this;
    }
    /**
     * A means of accessing the service (e.g. a phone bank, a web site, a location, etc.).
     * @param serviceChannel value to set
     * @return this builder instance
     */
    @NotNull public Builder availableChannel(@NotNull ServiceChannel.Builder serviceChannel) {
      putValue("availableChannel", serviceChannel.build());
      return this;
    }
    /**
     * Remove availableChannel property from the builder.
     * If this property is repeatable, all instances are removed.
     * @return this builder instance
     */
    @NotNull public Builder removeAvailableChannel() {
      removeValue("availableChannel");
      return this;
    }
    /**
     * Get currently set value for availableChannel property in this builder.
     * @return previously set value or {@code null}. If multiple values have been 
     * set to this property, then {@link java.util.Collection} instance will be 
     * returned.
     */
    @Nullable public java.lang.Object getAvailableChannel() {
      return myData.get("availableChannel");
    }
    /**
     * The tangible thing generated by the service, e.g. a passport, permit, etc.
     * @param thing value to set
     * @return this builder instance
     */
    @NotNull public Builder serviceOutput(@NotNull Thing thing) {
      putValue("serviceOutput", thing);
      return this;
    }
    /**
     * The tangible thing generated by the service, e.g. a passport, permit, etc.
     * @param thing value to set
     * @return this builder instance
     */
    @NotNull public Builder serviceOutput(@NotNull Thing.Builder thing) {
      putValue("serviceOutput", thing.build());
      return this;
    }
    /**
     * Remove serviceOutput property from the builder.
     * If this property is repeatable, all instances are removed.
     * @return this builder instance
     */
    @NotNull public Builder removeServiceOutput() {
      removeValue("serviceOutput");
      return this;
    }
    /**
     * Get currently set value for serviceOutput property in this builder.
     * @return previously set value or {@code null}. If multiple values have been 
     * set to this property, then {@link java.util.Collection} instance will be 
     * returned.
     */
    @Nullable public java.lang.Object getServiceOutput() {
      return myData.get("serviceOutput");
    }
    /**
     * The overall rating, based on a collection of reviews or ratings, of the item.
     * @param aggregateRating value to set
     * @return this builder instance
     */
    @NotNull public Builder aggregateRating(@NotNull AggregateRating aggregateRating) {
      putValue("aggregateRating", aggregateRating);
      return this;
    }
    /**
     * The overall rating, based on a collection of reviews or ratings, of the item.
     * @param aggregateRating value to set
     * @return this builder instance
     */
    @NotNull public Builder aggregateRating(@NotNull AggregateRating.Builder aggregateRating) {
      putValue("aggregateRating", aggregateRating.build());
      return this;
    }
    /**
     * Remove aggregateRating property from the builder.
     * If this property is repeatable, all instances are removed.
     * @return this builder instance
     */
    @NotNull public Builder removeAggregateRating() {
      removeValue("aggregateRating");
      return this;
    }
    /**
     * Get currently set value for aggregateRating property in this builder.
     * @return previously set value or {@code null}. If multiple values have been 
     * set to this property, then {@link java.util.Collection} instance will be 
     * returned.
     */
    @Nullable public java.lang.Object getAggregateRating() {
      return myData.get("aggregateRating");
    }
    /**
     * An associated logo.
     * @param image value to set
     * @return this builder instance
     */
    @NotNull public Builder logo(@NotNull Image image) {
      putValue("logo", image);
      return this;
    }
    /**
     * Remove logo property from the builder.
     * If this property is repeatable, all instances are removed.
     * @return this builder instance
     */
    @NotNull public Builder removeLogo() {
      removeValue("logo");
      return this;
    }
    /**
     * Get currently set value for logo property in this builder.
     * @return previously set value or {@code null}. If multiple values have been 
     * set to this property, then {@link java.util.Collection} instance will be 
     * returned.
     */
    @Nullable public java.lang.Object getLogo() {
      return myData.get("logo");
    }
    /**
     * A pointer to another, functionally similar product (or multiple products).
     * @param product value to set
     * @return this builder instance
     */
    @NotNull public Builder isSimilarTo(@NotNull Product product) {
      putValue("isSimilarTo", product);
      return this;
    }
    /**
     * A pointer to another, functionally similar product (or multiple products).
     * @param product value to set
     * @return this builder instance
     */
    @NotNull public Builder isSimilarTo(@NotNull Product.Builder product) {
      putValue("isSimilarTo", product.build());
      return this;
    }
    /**
     * A pointer to another, functionally similar product (or multiple products).
     * @param service value to set
     * @return this builder instance
     */
    @NotNull public Builder isSimilarTo(@NotNull Service service) {
      putValue("isSimilarTo", service);
      return this;
    }
    /**
     * A pointer to another, functionally similar product (or multiple products).
     * @param service value to set
     * @return this builder instance
     */
    @NotNull public Builder isSimilarTo(@NotNull Service.Builder service) {
      putValue("isSimilarTo", service.build());
      return this;
    }
    /**
     * Remove isSimilarTo property from the builder.
     * If this property is repeatable, all instances are removed.
     * @return this builder instance
     */
    @NotNull public Builder removeIsSimilarTo() {
      removeValue("isSimilarTo");
      return this;
    }
    /**
     * Get currently set value for isSimilarTo property in this builder.
     * @return previously set value or {@code null}. If multiple values have been 
     * set to this property, then {@link java.util.Collection} instance will be 
     * returned.
     */
    @Nullable public java.lang.Object getIsSimilarTo() {
      return myData.get("isSimilarTo");
    }
    /**
     * A pointer to another, somehow related product (or multiple products).
     * @param product value to set
     * @return this builder instance
     */
    @NotNull public Builder isRelatedTo(@NotNull Product product) {
      putValue("isRelatedTo", product);
      return this;
    }
    /**
     * A pointer to another, somehow related product (or multiple products).
     * @param product value to set
     * @return this builder instance
     */
    @NotNull public Builder isRelatedTo(@NotNull Product.Builder product) {
      putValue("isRelatedTo", product.build());
      return this;
    }
    /**
     * A pointer to another, somehow related product (or multiple products).
     * @param service value to set
     * @return this builder instance
     */
    @NotNull public Builder isRelatedTo(@NotNull Service service) {
      putValue("isRelatedTo", service);
      return this;
    }
    /**
     * A pointer to another, somehow related product (or multiple products).
     * @param service value to set
     * @return this builder instance
     */
    @NotNull public Builder isRelatedTo(@NotNull Service.Builder service) {
      putValue("isRelatedTo", service.build());
      return this;
    }
    /**
     * Remove isRelatedTo property from the builder.
     * If this property is repeatable, all instances are removed.
     * @return this builder instance
     */
    @NotNull public Builder removeIsRelatedTo() {
      removeValue("isRelatedTo");
      return this;
    }
    /**
     * Get currently set value for isRelatedTo property in this builder.
     * @return previously set value or {@code null}. If multiple values have been 
     * set to this property, then {@link java.util.Collection} instance will be 
     * returned.
     */
    @Nullable public java.lang.Object getIsRelatedTo() {
      return myData.get("isRelatedTo");
    }
    /**
     * An intended audience, i.e. a group for whom something was created.
     * @param audience value to set
     * @return this builder instance
     */
    @NotNull public Builder audience(@NotNull Audience audience) {
      putValue("audience", audience);
      return this;
    }
    /**
     * An intended audience, i.e. a group for whom something was created.
     * @param audience value to set
     * @return this builder instance
     */
    @NotNull public Builder audience(@NotNull Audience.Builder audience) {
      putValue("audience", audience.build());
      return this;
    }
    /**
     * Remove audience property from the builder.
     * If this property is repeatable, all instances are removed.
     * @return this builder instance
     */
    @NotNull public Builder removeAudience() {
      removeValue("audience");
      return this;
    }
    /**
     * Get currently set value for audience property in this builder.
     * @return previously set value or {@code null}. If multiple values have been 
     * set to this property, then {@link java.util.Collection} instance will be 
     * returned.
     */
    @Nullable public java.lang.Object getAudience() {
      return myData.get("audience");
    }
    /**
     * The brand(s) associated with a product or service, or the brand(s) maintained by an organization or business person.
     * @param brand value to set
     * @return this builder instance
     */
    @NotNull public Builder brand(@NotNull Brand brand) {
      putValue("brand", brand);
      return this;
    }
    /**
     * The brand(s) associated with a product or service, or the brand(s) maintained by an organization or business person.
     * @param brand value to set
     * @return this builder instance
     */
    @NotNull public Builder brand(@NotNull Brand.Builder brand) {
      putValue("brand", brand.build());
      return this;
    }
    /**
     * The brand(s) associated with a product or service, or the brand(s) maintained by an organization or business person.
     * @param organization value to set
     * @return this builder instance
     */
    @NotNull public Builder brand(@NotNull Organization organization) {
      putValue("brand", organization);
      return this;
    }
    /**
     * The brand(s) associated with a product or service, or the brand(s) maintained by an organization or business person.
     * @param organization value to set
     * @return this builder instance
     */
    @NotNull public Builder brand(@NotNull Organization.Builder organization) {
      putValue("brand", organization.build());
      return this;
    }
    /**
     * Remove brand property from the builder.
     * If this property is repeatable, all instances are removed.
     * @return this builder instance
     */
    @NotNull public Builder removeBrand() {
      removeValue("brand");
      return this;
    }
    /**
     * Get currently set value for brand property in this builder.
     * @return previously set value or {@code null}. If multiple values have been 
     * set to this property, then {@link java.util.Collection} instance will be 
     * returned.
     */
    @Nullable public java.lang.Object getBrand() {
      return myData.get("brand");
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
     * Human-readable terms of service documentation.
     * @param termsOfService value to set
     * @return this builder instance
     */
    @NotNull public Builder termsOfService(@NotNull String termsOfService) {
      putValue("termsOfService", termsOfService);
      return this;
    }
    /**
     * Remove termsOfService property from the builder.
     * If this property is repeatable, all instances are removed.
     * @return this builder instance
     */
    @NotNull public Builder removeTermsOfService() {
      removeValue("termsOfService");
      return this;
    }
    /**
     * Get currently set value for termsOfService property in this builder.
     * @return previously set value or {@code null}. If multiple values have been 
     * set to this property, then {@link java.util.Collection} instance will be 
     * returned.
     */
    @Nullable public java.lang.Object getTermsOfService() {
      return myData.get("termsOfService");
    }
    /**
     * Indicates an OfferCatalog listing for this Organization, Person, or Service.
     * @param offerCatalog value to set
     * @return this builder instance
     */
    @NotNull public Builder hasOfferCatalog(@NotNull OfferCatalog offerCatalog) {
      putValue("hasOfferCatalog", offerCatalog);
      return this;
    }
    /**
     * Indicates an OfferCatalog listing for this Organization, Person, or Service.
     * @param offerCatalog value to set
     * @return this builder instance
     */
    @NotNull public Builder hasOfferCatalog(@NotNull OfferCatalog.Builder offerCatalog) {
      putValue("hasOfferCatalog", offerCatalog.build());
      return this;
    }
    /**
     * Remove hasOfferCatalog property from the builder.
     * If this property is repeatable, all instances are removed.
     * @return this builder instance
     */
    @NotNull public Builder removeHasOfferCatalog() {
      removeValue("hasOfferCatalog");
      return this;
    }
    /**
     * Get currently set value for hasOfferCatalog property in this builder.
     * @return previously set value or {@code null}. If multiple values have been 
     * set to this property, then {@link java.util.Collection} instance will be 
     * returned.
     */
    @Nullable public java.lang.Object getHasOfferCatalog() {
      return myData.get("hasOfferCatalog");
    }
    /**
     * The type of service being offered, e.g. veterans' benefits, emergency relief, etc.
     * @param governmentBenefitsType value to set
     * @return this builder instance
     */
    @NotNull public Builder serviceType(@NotNull GovernmentBenefitsType governmentBenefitsType) {
      putValue("serviceType", governmentBenefitsType);
      return this;
    }
    /**
     * The type of service being offered, e.g. veterans' benefits, emergency relief, etc.
     * @param serviceType value to set
     * @return this builder instance
     */
    @NotNull public Builder serviceType(@NotNull String serviceType) {
      putValue("serviceType", serviceType);
      return this;
    }
    /**
     * Remove serviceType property from the builder.
     * If this property is repeatable, all instances are removed.
     * @return this builder instance
     */
    @NotNull public Builder removeServiceType() {
      removeValue("serviceType");
      return this;
    }
    /**
     * Get currently set value for serviceType property in this builder.
     * @return previously set value or {@code null}. If multiple values have been 
     * set to this property, then {@link java.util.Collection} instance will be 
     * returned.
     */
    @Nullable public java.lang.Object getServiceType() {
      return myData.get("serviceType");
    }
    /**
     * Indicates the mobility of a provided service (e.g. 'static', 'dynamic').
     * @param providerMobility value to set
     * @return this builder instance
     */
    @NotNull public Builder providerMobility(@NotNull String providerMobility) {
      putValue("providerMobility", providerMobility);
      return this;
    }
    /**
     * Remove providerMobility property from the builder.
     * If this property is repeatable, all instances are removed.
     * @return this builder instance
     */
    @NotNull public Builder removeProviderMobility() {
      removeValue("providerMobility");
      return this;
    }
    /**
     * Get currently set value for providerMobility property in this builder.
     * @return previously set value or {@code null}. If multiple values have been 
     * set to this property, then {@link java.util.Collection} instance will be 
     * returned.
     */
    @Nullable public java.lang.Object getProviderMobility() {
      return myData.get("providerMobility");
    }
    /**
     * A review of the item.
     * @param review value to set
     * @return this builder instance
     */
    @NotNull public Builder review(@NotNull Review review) {
      putValue("review", review);
      return this;
    }
    /**
     * A review of the item.
     * @param review value to set
     * @return this builder instance
     */
    @NotNull public Builder review(@NotNull Review.Builder review) {
      putValue("review", review.build());
      return this;
    }
    /**
     * Remove review property from the builder.
     * If this property is repeatable, all instances are removed.
     * @return this builder instance
     */
    @NotNull public Builder removeReview() {
      removeValue("review");
      return this;
    }
    /**
     * Get currently set value for review property in this builder.
     * @return previously set value or {@code null}. If multiple values have been 
     * set to this property, then {@link java.util.Collection} instance will be 
     * returned.
     */
    @Nullable public java.lang.Object getReview() {
      return myData.get("review");
    }
    /**
     * An award won by or for this item.
     * @param award value to set
     * @return this builder instance
     */
    @NotNull public Builder award(@NotNull String award) {
      putValue("award", award);
      return this;
    }
    /**
     * Remove award property from the builder.
     * If this property is repeatable, all instances are removed.
     * @return this builder instance
     */
    @NotNull public Builder removeAward() {
      removeValue("award");
      return this;
    }
    /**
     * Get currently set value for award property in this builder.
     * @return previously set value or {@code null}. If multiple values have been 
     * set to this property, then {@link java.util.Collection} instance will be 
     * returned.
     */
    @Nullable public java.lang.Object getAward() {
      return myData.get("award");
    }
    /**
     * The hours during which this service or contact is available.
     * @param openingHoursSpecification value to set
     * @return this builder instance
     */
    @NotNull public Builder hoursAvailable(@NotNull OpeningHoursSpecification openingHoursSpecification) {
      putValue("hoursAvailable", openingHoursSpecification);
      return this;
    }
    /**
     * The hours during which this service or contact is available.
     * @param openingHoursSpecification value to set
     * @return this builder instance
     */
    @NotNull public Builder hoursAvailable(@NotNull OpeningHoursSpecification.Builder openingHoursSpecification) {
      putValue("hoursAvailable", openingHoursSpecification.build());
      return this;
    }
    /**
     * Remove hoursAvailable property from the builder.
     * If this property is repeatable, all instances are removed.
     * @return this builder instance
     */
    @NotNull public Builder removeHoursAvailable() {
      removeValue("hoursAvailable");
      return this;
    }
    /**
     * Get currently set value for hoursAvailable property in this builder.
     * @return previously set value or {@code null}. If multiple values have been 
     * set to this property, then {@link java.util.Collection} instance will be 
     * returned.
     */
    @Nullable public java.lang.Object getHoursAvailable() {
      return myData.get("hoursAvailable");
    }
    /**
     * A slogan or motto associated with the item.
     * @param slogan value to set
     * @return this builder instance
     */
    @NotNull public Builder slogan(@NotNull String slogan) {
      putValue("slogan", slogan);
      return this;
    }
    /**
     * Remove slogan property from the builder.
     * If this property is repeatable, all instances are removed.
     * @return this builder instance
     */
    @NotNull public Builder removeSlogan() {
      removeValue("slogan");
      return this;
    }
    /**
     * Get currently set value for slogan property in this builder.
     * @return previously set value or {@code null}. If multiple values have been 
     * set to this property, then {@link java.util.Collection} instance will be 
     * returned.
     */
    @Nullable public java.lang.Object getSlogan() {
      return myData.get("slogan");
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
     * An offer to provide this item&amp;#x2014;for example, an offer to sell a product, rent the DVD of a movie, perform a service, or give away tickets to an event. Use [[businessFunction]] to indicate the kind of transaction offered, i.e. sell, lease, etc. This property can also be used to describe a [[Demand]]. While this property is listed as expected on a number of common types, it can be used in others. In that case, using a second type, such as Product or a subtype of Product, can clarify the nature of the offer.
     * 
     * @param demand value to set
     * @return this builder instance
     */
    @NotNull public Builder offers(@NotNull Demand demand) {
      putValue("offers", demand);
      return this;
    }
    /**
     * An offer to provide this item&amp;#x2014;for example, an offer to sell a product, rent the DVD of a movie, perform a service, or give away tickets to an event. Use [[businessFunction]] to indicate the kind of transaction offered, i.e. sell, lease, etc. This property can also be used to describe a [[Demand]]. While this property is listed as expected on a number of common types, it can be used in others. In that case, using a second type, such as Product or a subtype of Product, can clarify the nature of the offer.
     * 
     * @param demand value to set
     * @return this builder instance
     */
    @NotNull public Builder offers(@NotNull Demand.Builder demand) {
      putValue("offers", demand.build());
      return this;
    }
    /**
     * An offer to provide this item&amp;#x2014;for example, an offer to sell a product, rent the DVD of a movie, perform a service, or give away tickets to an event. Use [[businessFunction]] to indicate the kind of transaction offered, i.e. sell, lease, etc. This property can also be used to describe a [[Demand]]. While this property is listed as expected on a number of common types, it can be used in others. In that case, using a second type, such as Product or a subtype of Product, can clarify the nature of the offer.
     * 
     * @param offer value to set
     * @return this builder instance
     */
    @NotNull public Builder offers(@NotNull Offer offer) {
      putValue("offers", offer);
      return this;
    }
    /**
     * An offer to provide this item&amp;#x2014;for example, an offer to sell a product, rent the DVD of a movie, perform a service, or give away tickets to an event. Use [[businessFunction]] to indicate the kind of transaction offered, i.e. sell, lease, etc. This property can also be used to describe a [[Demand]]. While this property is listed as expected on a number of common types, it can be used in others. In that case, using a second type, such as Product or a subtype of Product, can clarify the nature of the offer.
     * 
     * @param offer value to set
     * @return this builder instance
     */
    @NotNull public Builder offers(@NotNull Offer.Builder offer) {
      putValue("offers", offer.build());
      return this;
    }
    /**
     * Remove offers property from the builder.
     * If this property is repeatable, all instances are removed.
     * @return this builder instance
     */
    @NotNull public Builder removeOffers() {
      removeValue("offers");
      return this;
    }
    /**
     * Get currently set value for offers property in this builder.
     * @return previously set value or {@code null}. If multiple values have been 
     * set to this property, then {@link java.util.Collection} instance will be 
     * returned.
     */
    @Nullable public java.lang.Object getOffers() {
      return myData.get("offers");
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
      if ("amount".equals(key) && value instanceof MonetaryAmount) { this.amount((MonetaryAmount)value); return; }
      if ("amounts".equals(key) && value instanceof MonetaryAmount) { this.amount((MonetaryAmount)value); return; }
      if ("amount".equals(key) && value instanceof Number) { this.amount((Number)value); return; }
      if ("amounts".equals(key) && value instanceof Number) { this.amount((Number)value); return; }
      if ("loanTerm".equals(key) && value instanceof Duration) { this.loanTerm((Duration)value); return; }
      if ("loanTerms".equals(key) && value instanceof Duration) { this.loanTerm((Duration)value); return; }
      if ("recourseLoan".equals(key) && value instanceof Boolean) { this.recourseLoan((Boolean)value); return; }
      if ("recourseLoans".equals(key) && value instanceof Boolean) { this.recourseLoan((Boolean)value); return; }
      if ("gracePeriod".equals(key) && value instanceof Duration) { this.gracePeriod((Duration)value); return; }
      if ("gracePeriods".equals(key) && value instanceof Duration) { this.gracePeriod((Duration)value); return; }
      if ("loanType".equals(key) && value instanceof String) { this.loanType((String)value); return; }
      if ("loanTypes".equals(key) && value instanceof String) { this.loanType((String)value); return; }
      if ("currency".equals(key) && value instanceof String) { this.currency((String)value); return; }
      if ("currencys".equals(key) && value instanceof String) { this.currency((String)value); return; }
      if ("loanRepaymentForm".equals(key) && value instanceof RepaymentSpecification) { this.loanRepaymentForm((RepaymentSpecification)value); return; }
      if ("loanRepaymentForms".equals(key) && value instanceof RepaymentSpecification) { this.loanRepaymentForm((RepaymentSpecification)value); return; }
      if ("requiredCollateral".equals(key) && value instanceof String) { this.requiredCollateral((String)value); return; }
      if ("requiredCollaterals".equals(key) && value instanceof String) { this.requiredCollateral((String)value); return; }
      if ("requiredCollateral".equals(key) && value instanceof Thing) { this.requiredCollateral((Thing)value); return; }
      if ("requiredCollaterals".equals(key) && value instanceof Thing) { this.requiredCollateral((Thing)value); return; }
      if ("renegotiableLoan".equals(key) && value instanceof Boolean) { this.renegotiableLoan((Boolean)value); return; }
      if ("renegotiableLoans".equals(key) && value instanceof Boolean) { this.renegotiableLoan((Boolean)value); return; }
      super.fromMap(key, value);
    }
  }
  
}
