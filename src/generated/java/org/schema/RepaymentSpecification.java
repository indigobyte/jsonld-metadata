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
 * A structured value representing repayment.
 */
public class RepaymentSpecification extends StructuredValue {
  /**
   * a type of payment made in cash during the onset of the purchase of an expensive good/service. The payment typically represents only a percentage of the full purchase price.
   */
  @JsonIgnore public Integer getDownPaymentInteger() {
    return (Integer) getValue("downPayment");
  }
  /**
   * a type of payment made in cash during the onset of the purchase of an expensive good/service. The payment typically represents only a percentage of the full purchase price.
   */
  @JsonIgnore public Collection<Integer> getDownPaymentIntegers() {
    final Object current = myData.get("downPayment");
    if (current == null) return Collections.emptyList();
    if (current instanceof Collection) {
      return (Collection<Integer>) current;
    }
    return Arrays.asList((Integer) current);
  }
  /**
   * a type of payment made in cash during the onset of the purchase of an expensive good/service. The payment typically represents only a percentage of the full purchase price.
   */
  @JsonIgnore public Long getDownPaymentLong() {
    return (Long) getValue("downPayment");
  }
  /**
   * a type of payment made in cash during the onset of the purchase of an expensive good/service. The payment typically represents only a percentage of the full purchase price.
   */
  @JsonIgnore public Collection<Long> getDownPaymentLongs() {
    final Object current = myData.get("downPayment");
    if (current == null) return Collections.emptyList();
    if (current instanceof Collection) {
      return (Collection<Long>) current;
    }
    return Arrays.asList((Long) current);
  }
  /**
   * a type of payment made in cash during the onset of the purchase of an expensive good/service. The payment typically represents only a percentage of the full purchase price.
   */
  @JsonIgnore public Float getDownPaymentFloat() {
    return (Float) getValue("downPayment");
  }
  /**
   * a type of payment made in cash during the onset of the purchase of an expensive good/service. The payment typically represents only a percentage of the full purchase price.
   */
  @JsonIgnore public Collection<Float> getDownPaymentFloats() {
    final Object current = myData.get("downPayment");
    if (current == null) return Collections.emptyList();
    if (current instanceof Collection) {
      return (Collection<Float>) current;
    }
    return Arrays.asList((Float) current);
  }
  /**
   * a type of payment made in cash during the onset of the purchase of an expensive good/service. The payment typically represents only a percentage of the full purchase price.
   */
  @JsonIgnore public Double getDownPaymentDouble() {
    return (Double) getValue("downPayment");
  }
  /**
   * a type of payment made in cash during the onset of the purchase of an expensive good/service. The payment typically represents only a percentage of the full purchase price.
   */
  @JsonIgnore public Collection<Double> getDownPaymentDoubles() {
    final Object current = myData.get("downPayment");
    if (current == null) return Collections.emptyList();
    if (current instanceof Collection) {
      return (Collection<Double>) current;
    }
    return Arrays.asList((Double) current);
  }
  /**
   * a type of payment made in cash during the onset of the purchase of an expensive good/service. The payment typically represents only a percentage of the full purchase price.
   */
  @JsonIgnore public String getDownPaymentString() {
    return (String) getValue("downPayment");
  }
  /**
   * a type of payment made in cash during the onset of the purchase of an expensive good/service. The payment typically represents only a percentage of the full purchase price.
   */
  @JsonIgnore public Collection<String> getDownPaymentStrings() {
    final Object current = myData.get("downPayment");
    if (current == null) return Collections.emptyList();
    if (current instanceof Collection) {
      return (Collection<String>) current;
    }
    return Arrays.asList((String) current);
  }
  /**
   * The amount of money to pay in a single payment.
   */
  @JsonIgnore public MonetaryAmount getLoanPaymentAmount() {
    return (MonetaryAmount) getValue("loanPaymentAmount");
  }
  /**
   * The amount of money to pay in a single payment.
   */
  @JsonIgnore public Collection<MonetaryAmount> getLoanPaymentAmounts() {
    final Object current = myData.get("loanPaymentAmount");
    if (current == null) return Collections.emptyList();
    if (current instanceof Collection) {
      return (Collection<MonetaryAmount>) current;
    }
    return Arrays.asList((MonetaryAmount) current);
  }
  /**
   * Frequency of payments due, i.e. number of months between payments. This is defined as a frequency, i.e. the reciprocal of a period of time.
   */
  @JsonIgnore public Integer getLoanPaymentFrequencyInteger() {
    return (Integer) getValue("loanPaymentFrequency");
  }
  /**
   * Frequency of payments due, i.e. number of months between payments. This is defined as a frequency, i.e. the reciprocal of a period of time.
   */
  @JsonIgnore public Collection<Integer> getLoanPaymentFrequencyIntegers() {
    final Object current = myData.get("loanPaymentFrequency");
    if (current == null) return Collections.emptyList();
    if (current instanceof Collection) {
      return (Collection<Integer>) current;
    }
    return Arrays.asList((Integer) current);
  }
  /**
   * Frequency of payments due, i.e. number of months between payments. This is defined as a frequency, i.e. the reciprocal of a period of time.
   */
  @JsonIgnore public Long getLoanPaymentFrequencyLong() {
    return (Long) getValue("loanPaymentFrequency");
  }
  /**
   * Frequency of payments due, i.e. number of months between payments. This is defined as a frequency, i.e. the reciprocal of a period of time.
   */
  @JsonIgnore public Collection<Long> getLoanPaymentFrequencyLongs() {
    final Object current = myData.get("loanPaymentFrequency");
    if (current == null) return Collections.emptyList();
    if (current instanceof Collection) {
      return (Collection<Long>) current;
    }
    return Arrays.asList((Long) current);
  }
  /**
   * Frequency of payments due, i.e. number of months between payments. This is defined as a frequency, i.e. the reciprocal of a period of time.
   */
  @JsonIgnore public Float getLoanPaymentFrequencyFloat() {
    return (Float) getValue("loanPaymentFrequency");
  }
  /**
   * Frequency of payments due, i.e. number of months between payments. This is defined as a frequency, i.e. the reciprocal of a period of time.
   */
  @JsonIgnore public Collection<Float> getLoanPaymentFrequencyFloats() {
    final Object current = myData.get("loanPaymentFrequency");
    if (current == null) return Collections.emptyList();
    if (current instanceof Collection) {
      return (Collection<Float>) current;
    }
    return Arrays.asList((Float) current);
  }
  /**
   * Frequency of payments due, i.e. number of months between payments. This is defined as a frequency, i.e. the reciprocal of a period of time.
   */
  @JsonIgnore public Double getLoanPaymentFrequencyDouble() {
    return (Double) getValue("loanPaymentFrequency");
  }
  /**
   * Frequency of payments due, i.e. number of months between payments. This is defined as a frequency, i.e. the reciprocal of a period of time.
   */
  @JsonIgnore public Collection<Double> getLoanPaymentFrequencyDoubles() {
    final Object current = myData.get("loanPaymentFrequency");
    if (current == null) return Collections.emptyList();
    if (current instanceof Collection) {
      return (Collection<Double>) current;
    }
    return Arrays.asList((Double) current);
  }
  /**
   * Frequency of payments due, i.e. number of months between payments. This is defined as a frequency, i.e. the reciprocal of a period of time.
   */
  @JsonIgnore public String getLoanPaymentFrequencyString() {
    return (String) getValue("loanPaymentFrequency");
  }
  /**
   * Frequency of payments due, i.e. number of months between payments. This is defined as a frequency, i.e. the reciprocal of a period of time.
   */
  @JsonIgnore public Collection<String> getLoanPaymentFrequencyStrings() {
    final Object current = myData.get("loanPaymentFrequency");
    if (current == null) return Collections.emptyList();
    if (current instanceof Collection) {
      return (Collection<String>) current;
    }
    return Arrays.asList((String) current);
  }
  /**
   * The number of payments contractually required at origination to repay the loan. For monthly paying loans this is the number of months from the contractual first payment date to the maturity date.
   */
  @JsonIgnore public Integer getNumberOfLoanPaymentsInteger() {
    return (Integer) getValue("numberOfLoanPayments");
  }
  /**
   * The number of payments contractually required at origination to repay the loan. For monthly paying loans this is the number of months from the contractual first payment date to the maturity date.
   */
  @JsonIgnore public Collection<Integer> getNumberOfLoanPaymentsIntegers() {
    final Object current = myData.get("numberOfLoanPayments");
    if (current == null) return Collections.emptyList();
    if (current instanceof Collection) {
      return (Collection<Integer>) current;
    }
    return Arrays.asList((Integer) current);
  }
  /**
   * The number of payments contractually required at origination to repay the loan. For monthly paying loans this is the number of months from the contractual first payment date to the maturity date.
   */
  @JsonIgnore public Long getNumberOfLoanPaymentsLong() {
    return (Long) getValue("numberOfLoanPayments");
  }
  /**
   * The number of payments contractually required at origination to repay the loan. For monthly paying loans this is the number of months from the contractual first payment date to the maturity date.
   */
  @JsonIgnore public Collection<Long> getNumberOfLoanPaymentsLongs() {
    final Object current = myData.get("numberOfLoanPayments");
    if (current == null) return Collections.emptyList();
    if (current instanceof Collection) {
      return (Collection<Long>) current;
    }
    return Arrays.asList((Long) current);
  }
  /**
   * The number of payments contractually required at origination to repay the loan. For monthly paying loans this is the number of months from the contractual first payment date to the maturity date.
   */
  @JsonIgnore public Float getNumberOfLoanPaymentsFloat() {
    return (Float) getValue("numberOfLoanPayments");
  }
  /**
   * The number of payments contractually required at origination to repay the loan. For monthly paying loans this is the number of months from the contractual first payment date to the maturity date.
   */
  @JsonIgnore public Collection<Float> getNumberOfLoanPaymentsFloats() {
    final Object current = myData.get("numberOfLoanPayments");
    if (current == null) return Collections.emptyList();
    if (current instanceof Collection) {
      return (Collection<Float>) current;
    }
    return Arrays.asList((Float) current);
  }
  /**
   * The number of payments contractually required at origination to repay the loan. For monthly paying loans this is the number of months from the contractual first payment date to the maturity date.
   */
  @JsonIgnore public Double getNumberOfLoanPaymentsDouble() {
    return (Double) getValue("numberOfLoanPayments");
  }
  /**
   * The number of payments contractually required at origination to repay the loan. For monthly paying loans this is the number of months from the contractual first payment date to the maturity date.
   */
  @JsonIgnore public Collection<Double> getNumberOfLoanPaymentsDoubles() {
    final Object current = myData.get("numberOfLoanPayments");
    if (current == null) return Collections.emptyList();
    if (current instanceof Collection) {
      return (Collection<Double>) current;
    }
    return Arrays.asList((Double) current);
  }
  /**
   * The number of payments contractually required at origination to repay the loan. For monthly paying loans this is the number of months from the contractual first payment date to the maturity date.
   */
  @JsonIgnore public String getNumberOfLoanPaymentsString() {
    return (String) getValue("numberOfLoanPayments");
  }
  /**
   * The number of payments contractually required at origination to repay the loan. For monthly paying loans this is the number of months from the contractual first payment date to the maturity date.
   */
  @JsonIgnore public Collection<String> getNumberOfLoanPaymentsStrings() {
    final Object current = myData.get("numberOfLoanPayments");
    if (current == null) return Collections.emptyList();
    if (current instanceof Collection) {
      return (Collection<String>) current;
    }
    return Arrays.asList((String) current);
  }
  /**
   * The amount to be paid as a penalty in the event of early payment of the loan.
   */
  @JsonIgnore public MonetaryAmount getEarlyPrepaymentPenalty() {
    return (MonetaryAmount) getValue("earlyPrepaymentPenalty");
  }
  /**
   * The amount to be paid as a penalty in the event of early payment of the loan.
   */
  @JsonIgnore public Collection<MonetaryAmount> getEarlyPrepaymentPenaltys() {
    final Object current = myData.get("earlyPrepaymentPenalty");
    if (current == null) return Collections.emptyList();
    if (current instanceof Collection) {
      return (Collection<MonetaryAmount>) current;
    }
    return Arrays.asList((MonetaryAmount) current);
  }
  protected RepaymentSpecification(java.util.Map<String,Object> data) {
    super(data);
  }
  
  /**
   * Builder for {@link RepaymentSpecification}
   */
  public static class Builder extends StructuredValue.Builder {
    public Builder(@NotNull HashMap<String,Object> data) {
      super(data);
    }
    @NotNull public RepaymentSpecification build() {
      return new RepaymentSpecification(myData);
    }
    /**
     * a type of payment made in cash during the onset of the purchase of an expensive good/service. The payment typically represents only a percentage of the full purchase price.
     */
    @NotNull public Builder downPayment(@NotNull Integer integer) {
      putValue("downPayment", integer);
      return this;
    }
    /**
     * a type of payment made in cash during the onset of the purchase of an expensive good/service. The payment typically represents only a percentage of the full purchase price.
     */
    @NotNull public Builder downPayment(@NotNull Long downPayment) {
      putValue("downPayment", downPayment);
      return this;
    }
    /**
     * a type of payment made in cash during the onset of the purchase of an expensive good/service. The payment typically represents only a percentage of the full purchase price.
     */
    @NotNull public Builder downPayment(@NotNull Float downPayment) {
      putValue("downPayment", downPayment);
      return this;
    }
    /**
     * a type of payment made in cash during the onset of the purchase of an expensive good/service. The payment typically represents only a percentage of the full purchase price.
     */
    @NotNull public Builder downPayment(@NotNull Double downPayment) {
      putValue("downPayment", downPayment);
      return this;
    }
    /**
     * a type of payment made in cash during the onset of the purchase of an expensive good/service. The payment typically represents only a percentage of the full purchase price.
     */
    @NotNull public Builder downPayment(@NotNull String downPayment) {
      putValue("downPayment", downPayment);
      return this;
    }
    /**
     * The amount of money to pay in a single payment.
     */
    @NotNull public Builder loanPaymentAmount(@NotNull MonetaryAmount monetaryAmount) {
      putValue("loanPaymentAmount", monetaryAmount);
      return this;
    }
    /**
     * The amount of money to pay in a single payment.
     */
    @NotNull public Builder loanPaymentAmount(@NotNull MonetaryAmount.Builder monetaryAmount) {
      putValue("loanPaymentAmount", monetaryAmount.build());
      return this;
    }
    /**
     * Frequency of payments due, i.e. number of months between payments. This is defined as a frequency, i.e. the reciprocal of a period of time.
     */
    @NotNull public Builder loanPaymentFrequency(@NotNull Integer integer) {
      putValue("loanPaymentFrequency", integer);
      return this;
    }
    /**
     * Frequency of payments due, i.e. number of months between payments. This is defined as a frequency, i.e. the reciprocal of a period of time.
     */
    @NotNull public Builder loanPaymentFrequency(@NotNull Long loanPaymentFrequency) {
      putValue("loanPaymentFrequency", loanPaymentFrequency);
      return this;
    }
    /**
     * Frequency of payments due, i.e. number of months between payments. This is defined as a frequency, i.e. the reciprocal of a period of time.
     */
    @NotNull public Builder loanPaymentFrequency(@NotNull Float loanPaymentFrequency) {
      putValue("loanPaymentFrequency", loanPaymentFrequency);
      return this;
    }
    /**
     * Frequency of payments due, i.e. number of months between payments. This is defined as a frequency, i.e. the reciprocal of a period of time.
     */
    @NotNull public Builder loanPaymentFrequency(@NotNull Double loanPaymentFrequency) {
      putValue("loanPaymentFrequency", loanPaymentFrequency);
      return this;
    }
    /**
     * Frequency of payments due, i.e. number of months between payments. This is defined as a frequency, i.e. the reciprocal of a period of time.
     */
    @NotNull public Builder loanPaymentFrequency(@NotNull String loanPaymentFrequency) {
      putValue("loanPaymentFrequency", loanPaymentFrequency);
      return this;
    }
    /**
     * The number of payments contractually required at origination to repay the loan. For monthly paying loans this is the number of months from the contractual first payment date to the maturity date.
     */
    @NotNull public Builder numberOfLoanPayments(@NotNull Integer integer) {
      putValue("numberOfLoanPayments", integer);
      return this;
    }
    /**
     * The number of payments contractually required at origination to repay the loan. For monthly paying loans this is the number of months from the contractual first payment date to the maturity date.
     */
    @NotNull public Builder numberOfLoanPayments(@NotNull Long numberOfLoanPayments) {
      putValue("numberOfLoanPayments", numberOfLoanPayments);
      return this;
    }
    /**
     * The number of payments contractually required at origination to repay the loan. For monthly paying loans this is the number of months from the contractual first payment date to the maturity date.
     */
    @NotNull public Builder numberOfLoanPayments(@NotNull Float numberOfLoanPayments) {
      putValue("numberOfLoanPayments", numberOfLoanPayments);
      return this;
    }
    /**
     * The number of payments contractually required at origination to repay the loan. For monthly paying loans this is the number of months from the contractual first payment date to the maturity date.
     */
    @NotNull public Builder numberOfLoanPayments(@NotNull Double numberOfLoanPayments) {
      putValue("numberOfLoanPayments", numberOfLoanPayments);
      return this;
    }
    /**
     * The number of payments contractually required at origination to repay the loan. For monthly paying loans this is the number of months from the contractual first payment date to the maturity date.
     */
    @NotNull public Builder numberOfLoanPayments(@NotNull String numberOfLoanPayments) {
      putValue("numberOfLoanPayments", numberOfLoanPayments);
      return this;
    }
    /**
     * The amount to be paid as a penalty in the event of early payment of the loan.
     */
    @NotNull public Builder earlyPrepaymentPenalty(@NotNull MonetaryAmount monetaryAmount) {
      putValue("earlyPrepaymentPenalty", monetaryAmount);
      return this;
    }
    /**
     * The amount to be paid as a penalty in the event of early payment of the loan.
     */
    @NotNull public Builder earlyPrepaymentPenalty(@NotNull MonetaryAmount.Builder monetaryAmount) {
      putValue("earlyPrepaymentPenalty", monetaryAmount.build());
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
      if ("downPayment".equals(key) && value instanceof Integer) { this.downPayment((Integer)value); return; }
      if ("downPayments".equals(key) && value instanceof Integer) { this.downPayment((Integer)value); return; }
      if ("downPayment".equals(key) && value instanceof Long) { this.downPayment((Long)value); return; }
      if ("downPayments".equals(key) && value instanceof Long) { this.downPayment((Long)value); return; }
      if ("downPayment".equals(key) && value instanceof Float) { this.downPayment((Float)value); return; }
      if ("downPayments".equals(key) && value instanceof Float) { this.downPayment((Float)value); return; }
      if ("downPayment".equals(key) && value instanceof Double) { this.downPayment((Double)value); return; }
      if ("downPayments".equals(key) && value instanceof Double) { this.downPayment((Double)value); return; }
      if ("downPayment".equals(key) && value instanceof String) { this.downPayment((String)value); return; }
      if ("downPayments".equals(key) && value instanceof String) { this.downPayment((String)value); return; }
      if ("loanPaymentAmount".equals(key) && value instanceof MonetaryAmount) { this.loanPaymentAmount((MonetaryAmount)value); return; }
      if ("loanPaymentAmounts".equals(key) && value instanceof MonetaryAmount) { this.loanPaymentAmount((MonetaryAmount)value); return; }
      if ("loanPaymentFrequency".equals(key) && value instanceof Integer) { this.loanPaymentFrequency((Integer)value); return; }
      if ("loanPaymentFrequencys".equals(key) && value instanceof Integer) { this.loanPaymentFrequency((Integer)value); return; }
      if ("loanPaymentFrequency".equals(key) && value instanceof Long) { this.loanPaymentFrequency((Long)value); return; }
      if ("loanPaymentFrequencys".equals(key) && value instanceof Long) { this.loanPaymentFrequency((Long)value); return; }
      if ("loanPaymentFrequency".equals(key) && value instanceof Float) { this.loanPaymentFrequency((Float)value); return; }
      if ("loanPaymentFrequencys".equals(key) && value instanceof Float) { this.loanPaymentFrequency((Float)value); return; }
      if ("loanPaymentFrequency".equals(key) && value instanceof Double) { this.loanPaymentFrequency((Double)value); return; }
      if ("loanPaymentFrequencys".equals(key) && value instanceof Double) { this.loanPaymentFrequency((Double)value); return; }
      if ("loanPaymentFrequency".equals(key) && value instanceof String) { this.loanPaymentFrequency((String)value); return; }
      if ("loanPaymentFrequencys".equals(key) && value instanceof String) { this.loanPaymentFrequency((String)value); return; }
      if ("numberOfLoanPayments".equals(key) && value instanceof Integer) { this.numberOfLoanPayments((Integer)value); return; }
      if ("numberOfLoanPaymentss".equals(key) && value instanceof Integer) { this.numberOfLoanPayments((Integer)value); return; }
      if ("numberOfLoanPayments".equals(key) && value instanceof Long) { this.numberOfLoanPayments((Long)value); return; }
      if ("numberOfLoanPaymentss".equals(key) && value instanceof Long) { this.numberOfLoanPayments((Long)value); return; }
      if ("numberOfLoanPayments".equals(key) && value instanceof Float) { this.numberOfLoanPayments((Float)value); return; }
      if ("numberOfLoanPaymentss".equals(key) && value instanceof Float) { this.numberOfLoanPayments((Float)value); return; }
      if ("numberOfLoanPayments".equals(key) && value instanceof Double) { this.numberOfLoanPayments((Double)value); return; }
      if ("numberOfLoanPaymentss".equals(key) && value instanceof Double) { this.numberOfLoanPayments((Double)value); return; }
      if ("numberOfLoanPayments".equals(key) && value instanceof String) { this.numberOfLoanPayments((String)value); return; }
      if ("numberOfLoanPaymentss".equals(key) && value instanceof String) { this.numberOfLoanPayments((String)value); return; }
      if ("earlyPrepaymentPenalty".equals(key) && value instanceof MonetaryAmount) { this.earlyPrepaymentPenalty((MonetaryAmount)value); return; }
      if ("earlyPrepaymentPenaltys".equals(key) && value instanceof MonetaryAmount) { this.earlyPrepaymentPenalty((MonetaryAmount)value); return; }
      super.fromMap(key, value);
    }
  }
  
}
