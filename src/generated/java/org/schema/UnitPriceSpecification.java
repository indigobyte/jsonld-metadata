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
 * The price asked for a given offer by the respective organization or person.
 */
public class UnitPriceSpecification extends PriceSpecification {
  /**
   * Defines the type of a price specified for an offered product, for example a list price, a (temporary) sale price or a manufacturer suggested retail price. If multiple prices are specified for an offer the [[priceType]] property can be used to identify the type of each such specified price. The value of priceType can be specified as a value from enumeration PriceTypeEnumeration or as a free form text string for price types that are not already predefined in PriceTypeEnumeration.
   */
  @JsonIgnore public PriceTypeEnumeration getPriceTypePriceTypeEnumeration() {
    return (PriceTypeEnumeration) getValue("priceType");
  }
  /**
   * Defines the type of a price specified for an offered product, for example a list price, a (temporary) sale price or a manufacturer suggested retail price. If multiple prices are specified for an offer the [[priceType]] property can be used to identify the type of each such specified price. The value of priceType can be specified as a value from enumeration PriceTypeEnumeration or as a free form text string for price types that are not already predefined in PriceTypeEnumeration.
   */
  @JsonIgnore public java.util.Collection<PriceTypeEnumeration> getPriceTypePriceTypeEnumerations() {
    final java.lang.Object current = myData.get("priceType");
    if (current == null) return Collections.emptyList();
    if (current instanceof java.util.Collection) {
      return (java.util.Collection<PriceTypeEnumeration>) current;
    }
    return Arrays.asList((PriceTypeEnumeration) current);
  }
  /**
   * Defines the type of a price specified for an offered product, for example a list price, a (temporary) sale price or a manufacturer suggested retail price. If multiple prices are specified for an offer the [[priceType]] property can be used to identify the type of each such specified price. The value of priceType can be specified as a value from enumeration PriceTypeEnumeration or as a free form text string for price types that are not already predefined in PriceTypeEnumeration.
   */
  @JsonIgnore public String getPriceTypeString() {
    return (String) getValue("priceType");
  }
  /**
   * Defines the type of a price specified for an offered product, for example a list price, a (temporary) sale price or a manufacturer suggested retail price. If multiple prices are specified for an offer the [[priceType]] property can be used to identify the type of each such specified price. The value of priceType can be specified as a value from enumeration PriceTypeEnumeration or as a free form text string for price types that are not already predefined in PriceTypeEnumeration.
   */
  @JsonIgnore public java.util.Collection<String> getPriceTypeStrings() {
    final java.lang.Object current = myData.get("priceType");
    if (current == null) return Collections.emptyList();
    if (current instanceof java.util.Collection) {
      return (java.util.Collection<String>) current;
    }
    return Arrays.asList((String) current);
  }
  /**
   * A string or text indicating the unit of measurement. Useful if you cannot provide a standard unit code for
   * &lt;a href='unitCode'&gt;unitCode&lt;/a&gt;.
   */
  @JsonIgnore public String getUnitText() {
    return (String) getValue("unitText");
  }
  /**
   * A string or text indicating the unit of measurement. Useful if you cannot provide a standard unit code for
   * &lt;a href='unitCode'&gt;unitCode&lt;/a&gt;.
   */
  @JsonIgnore public java.util.Collection<String> getUnitTexts() {
    final java.lang.Object current = myData.get("unitText");
    if (current == null) return Collections.emptyList();
    if (current instanceof java.util.Collection) {
      return (java.util.Collection<String>) current;
    }
    return Arrays.asList((String) current);
  }
  /**
   * This property specifies the minimal quantity and rounding increment that will be the basis for the billing. The unit of measurement is specified by the unitCode property.
   */
  @JsonIgnore public Integer getBillingIncrementInteger() {
    return (Integer) getValue("billingIncrement");
  }
  /**
   * This property specifies the minimal quantity and rounding increment that will be the basis for the billing. The unit of measurement is specified by the unitCode property.
   */
  @JsonIgnore public java.util.Collection<Integer> getBillingIncrementIntegers() {
    final java.lang.Object current = myData.get("billingIncrement");
    if (current == null) return Collections.emptyList();
    if (current instanceof java.util.Collection) {
      return (java.util.Collection<Integer>) current;
    }
    return Arrays.asList((Integer) current);
  }
  /**
   * This property specifies the minimal quantity and rounding increment that will be the basis for the billing. The unit of measurement is specified by the unitCode property.
   */
  @JsonIgnore public Long getBillingIncrementLong() {
    return (Long) getValue("billingIncrement");
  }
  /**
   * This property specifies the minimal quantity and rounding increment that will be the basis for the billing. The unit of measurement is specified by the unitCode property.
   */
  @JsonIgnore public java.util.Collection<Long> getBillingIncrementLongs() {
    final java.lang.Object current = myData.get("billingIncrement");
    if (current == null) return Collections.emptyList();
    if (current instanceof java.util.Collection) {
      return (java.util.Collection<Long>) current;
    }
    return Arrays.asList((Long) current);
  }
  /**
   * This property specifies the minimal quantity and rounding increment that will be the basis for the billing. The unit of measurement is specified by the unitCode property.
   */
  @JsonIgnore public Float getBillingIncrementFloat() {
    return (Float) getValue("billingIncrement");
  }
  /**
   * This property specifies the minimal quantity and rounding increment that will be the basis for the billing. The unit of measurement is specified by the unitCode property.
   */
  @JsonIgnore public java.util.Collection<Float> getBillingIncrementFloats() {
    final java.lang.Object current = myData.get("billingIncrement");
    if (current == null) return Collections.emptyList();
    if (current instanceof java.util.Collection) {
      return (java.util.Collection<Float>) current;
    }
    return Arrays.asList((Float) current);
  }
  /**
   * This property specifies the minimal quantity and rounding increment that will be the basis for the billing. The unit of measurement is specified by the unitCode property.
   */
  @JsonIgnore public Double getBillingIncrementDouble() {
    return (Double) getValue("billingIncrement");
  }
  /**
   * This property specifies the minimal quantity and rounding increment that will be the basis for the billing. The unit of measurement is specified by the unitCode property.
   */
  @JsonIgnore public java.util.Collection<Double> getBillingIncrementDoubles() {
    final java.lang.Object current = myData.get("billingIncrement");
    if (current == null) return Collections.emptyList();
    if (current instanceof java.util.Collection) {
      return (java.util.Collection<Double>) current;
    }
    return Arrays.asList((Double) current);
  }
  /**
   * This property specifies the minimal quantity and rounding increment that will be the basis for the billing. The unit of measurement is specified by the unitCode property.
   */
  @JsonIgnore public String getBillingIncrementString() {
    return (String) getValue("billingIncrement");
  }
  /**
   * This property specifies the minimal quantity and rounding increment that will be the basis for the billing. The unit of measurement is specified by the unitCode property.
   */
  @JsonIgnore public java.util.Collection<String> getBillingIncrementStrings() {
    final java.lang.Object current = myData.get("billingIncrement");
    if (current == null) return Collections.emptyList();
    if (current instanceof java.util.Collection) {
      return (java.util.Collection<String>) current;
    }
    return Arrays.asList((String) current);
  }
  /**
   * The reference quantity for which a certain price applies, e.g. 1 EUR per 4 kWh of electricity. This property is a replacement for unitOfMeasurement for the advanced cases where the price does not relate to a standard unit.
   */
  @JsonIgnore public QuantitativeValue getReferenceQuantity() {
    return (QuantitativeValue) getValue("referenceQuantity");
  }
  /**
   * The reference quantity for which a certain price applies, e.g. 1 EUR per 4 kWh of electricity. This property is a replacement for unitOfMeasurement for the advanced cases where the price does not relate to a standard unit.
   */
  @JsonIgnore public java.util.Collection<QuantitativeValue> getReferenceQuantitys() {
    final java.lang.Object current = myData.get("referenceQuantity");
    if (current == null) return Collections.emptyList();
    if (current instanceof java.util.Collection) {
      return (java.util.Collection<QuantitativeValue>) current;
    }
    return Arrays.asList((QuantitativeValue) current);
  }
  /**
   * The unit of measurement given using the UN/CEFACT Common Code (3 characters) or a URL. Other codes than the UN/CEFACT Common Code may be used with a prefix followed by a colon.
   */
  @JsonIgnore public String getUnitCode() {
    return (String) getValue("unitCode");
  }
  /**
   * The unit of measurement given using the UN/CEFACT Common Code (3 characters) or a URL. Other codes than the UN/CEFACT Common Code may be used with a prefix followed by a colon.
   */
  @JsonIgnore public java.util.Collection<String> getUnitCodes() {
    final java.lang.Object current = myData.get("unitCode");
    if (current == null) return Collections.emptyList();
    if (current instanceof java.util.Collection) {
      return (java.util.Collection<String>) current;
    }
    return Arrays.asList((String) current);
  }
  /**
   * Specifies after how much time this price (or price component) becomes valid and billing starts. Can be used, for example, to model a price increase after the first year of a subscription. The unit of measurement is specified by the unitCode property.
   */
  @JsonIgnore public Integer getBillingStartInteger() {
    return (Integer) getValue("billingStart");
  }
  /**
   * Specifies after how much time this price (or price component) becomes valid and billing starts. Can be used, for example, to model a price increase after the first year of a subscription. The unit of measurement is specified by the unitCode property.
   */
  @JsonIgnore public java.util.Collection<Integer> getBillingStartIntegers() {
    final java.lang.Object current = myData.get("billingStart");
    if (current == null) return Collections.emptyList();
    if (current instanceof java.util.Collection) {
      return (java.util.Collection<Integer>) current;
    }
    return Arrays.asList((Integer) current);
  }
  /**
   * Specifies after how much time this price (or price component) becomes valid and billing starts. Can be used, for example, to model a price increase after the first year of a subscription. The unit of measurement is specified by the unitCode property.
   */
  @JsonIgnore public Long getBillingStartLong() {
    return (Long) getValue("billingStart");
  }
  /**
   * Specifies after how much time this price (or price component) becomes valid and billing starts. Can be used, for example, to model a price increase after the first year of a subscription. The unit of measurement is specified by the unitCode property.
   */
  @JsonIgnore public java.util.Collection<Long> getBillingStartLongs() {
    final java.lang.Object current = myData.get("billingStart");
    if (current == null) return Collections.emptyList();
    if (current instanceof java.util.Collection) {
      return (java.util.Collection<Long>) current;
    }
    return Arrays.asList((Long) current);
  }
  /**
   * Specifies after how much time this price (or price component) becomes valid and billing starts. Can be used, for example, to model a price increase after the first year of a subscription. The unit of measurement is specified by the unitCode property.
   */
  @JsonIgnore public Float getBillingStartFloat() {
    return (Float) getValue("billingStart");
  }
  /**
   * Specifies after how much time this price (or price component) becomes valid and billing starts. Can be used, for example, to model a price increase after the first year of a subscription. The unit of measurement is specified by the unitCode property.
   */
  @JsonIgnore public java.util.Collection<Float> getBillingStartFloats() {
    final java.lang.Object current = myData.get("billingStart");
    if (current == null) return Collections.emptyList();
    if (current instanceof java.util.Collection) {
      return (java.util.Collection<Float>) current;
    }
    return Arrays.asList((Float) current);
  }
  /**
   * Specifies after how much time this price (or price component) becomes valid and billing starts. Can be used, for example, to model a price increase after the first year of a subscription. The unit of measurement is specified by the unitCode property.
   */
  @JsonIgnore public Double getBillingStartDouble() {
    return (Double) getValue("billingStart");
  }
  /**
   * Specifies after how much time this price (or price component) becomes valid and billing starts. Can be used, for example, to model a price increase after the first year of a subscription. The unit of measurement is specified by the unitCode property.
   */
  @JsonIgnore public java.util.Collection<Double> getBillingStartDoubles() {
    final java.lang.Object current = myData.get("billingStart");
    if (current == null) return Collections.emptyList();
    if (current instanceof java.util.Collection) {
      return (java.util.Collection<Double>) current;
    }
    return Arrays.asList((Double) current);
  }
  /**
   * Specifies after how much time this price (or price component) becomes valid and billing starts. Can be used, for example, to model a price increase after the first year of a subscription. The unit of measurement is specified by the unitCode property.
   */
  @JsonIgnore public String getBillingStartString() {
    return (String) getValue("billingStart");
  }
  /**
   * Specifies after how much time this price (or price component) becomes valid and billing starts. Can be used, for example, to model a price increase after the first year of a subscription. The unit of measurement is specified by the unitCode property.
   */
  @JsonIgnore public java.util.Collection<String> getBillingStartStrings() {
    final java.lang.Object current = myData.get("billingStart");
    if (current == null) return Collections.emptyList();
    if (current instanceof java.util.Collection) {
      return (java.util.Collection<String>) current;
    }
    return Arrays.asList((String) current);
  }
  /**
   * Specifies for how long this price (or price component) will be billed. Can be used, for example, to model the contractual duration of a subscription or payment plan. Type can be either a Duration or a Number (in which case the unit of measurement, for example month, is specified by the unitCode property).
   */
  @JsonIgnore public Duration getBillingDurationDuration() {
    return (Duration) getValue("billingDuration");
  }
  /**
   * Specifies for how long this price (or price component) will be billed. Can be used, for example, to model the contractual duration of a subscription or payment plan. Type can be either a Duration or a Number (in which case the unit of measurement, for example month, is specified by the unitCode property).
   */
  @JsonIgnore public java.util.Collection<Duration> getBillingDurationDurations() {
    final java.lang.Object current = myData.get("billingDuration");
    if (current == null) return Collections.emptyList();
    if (current instanceof java.util.Collection) {
      return (java.util.Collection<Duration>) current;
    }
    return Arrays.asList((Duration) current);
  }
  /**
   * Specifies for how long this price (or price component) will be billed. Can be used, for example, to model the contractual duration of a subscription or payment plan. Type can be either a Duration or a Number (in which case the unit of measurement, for example month, is specified by the unitCode property).
   */
  @JsonIgnore public Number getBillingDurationNumber() {
    return (Number) getValue("billingDuration");
  }
  /**
   * Specifies for how long this price (or price component) will be billed. Can be used, for example, to model the contractual duration of a subscription or payment plan. Type can be either a Duration or a Number (in which case the unit of measurement, for example month, is specified by the unitCode property).
   */
  @JsonIgnore public java.util.Collection<Number> getBillingDurationNumbers() {
    final java.lang.Object current = myData.get("billingDuration");
    if (current == null) return Collections.emptyList();
    if (current instanceof java.util.Collection) {
      return (java.util.Collection<Number>) current;
    }
    return Arrays.asList((Number) current);
  }
  /**
   * Specifies for how long this price (or price component) will be billed. Can be used, for example, to model the contractual duration of a subscription or payment plan. Type can be either a Duration or a Number (in which case the unit of measurement, for example month, is specified by the unitCode property).
   */
  @JsonIgnore public QuantitativeValue getBillingDurationQuantitativeValue() {
    return (QuantitativeValue) getValue("billingDuration");
  }
  /**
   * Specifies for how long this price (or price component) will be billed. Can be used, for example, to model the contractual duration of a subscription or payment plan. Type can be either a Duration or a Number (in which case the unit of measurement, for example month, is specified by the unitCode property).
   */
  @JsonIgnore public java.util.Collection<QuantitativeValue> getBillingDurationQuantitativeValues() {
    final java.lang.Object current = myData.get("billingDuration");
    if (current == null) return Collections.emptyList();
    if (current instanceof java.util.Collection) {
      return (java.util.Collection<QuantitativeValue>) current;
    }
    return Arrays.asList((QuantitativeValue) current);
  }
  /**
   * Identifies a price component (for example, a line item on an invoice), part of the total price for an offer.
   */
  @JsonIgnore public PriceComponentTypeEnumeration getPriceComponentType() {
    return (PriceComponentTypeEnumeration) getValue("priceComponentType");
  }
  /**
   * Identifies a price component (for example, a line item on an invoice), part of the total price for an offer.
   */
  @JsonIgnore public java.util.Collection<PriceComponentTypeEnumeration> getPriceComponentTypes() {
    final java.lang.Object current = myData.get("priceComponentType");
    if (current == null) return Collections.emptyList();
    if (current instanceof java.util.Collection) {
      return (java.util.Collection<PriceComponentTypeEnumeration>) current;
    }
    return Arrays.asList((PriceComponentTypeEnumeration) current);
  }
  protected UnitPriceSpecification(java.util.Map<String,java.lang.Object> data) {
    super(data);
  }
  
  /**
   * Builder for {@link UnitPriceSpecification}
   */
  public static class Builder extends PriceSpecification.Builder {
    public Builder(@NotNull HashMap<String,java.lang.Object> data) {
      super(data);
    }
    @NotNull public UnitPriceSpecification build() {
      return new UnitPriceSpecification(myData);
    }
    /**
     * Defines the type of a price specified for an offered product, for example a list price, a (temporary) sale price or a manufacturer suggested retail price. If multiple prices are specified for an offer the [[priceType]] property can be used to identify the type of each such specified price. The value of priceType can be specified as a value from enumeration PriceTypeEnumeration or as a free form text string for price types that are not already predefined in PriceTypeEnumeration.
     */
    @NotNull public Builder priceType(@NotNull PriceTypeEnumeration priceTypeEnumeration) {
      putValue("priceType", priceTypeEnumeration);
      return this;
    }
    /**
     * Defines the type of a price specified for an offered product, for example a list price, a (temporary) sale price or a manufacturer suggested retail price. If multiple prices are specified for an offer the [[priceType]] property can be used to identify the type of each such specified price. The value of priceType can be specified as a value from enumeration PriceTypeEnumeration or as a free form text string for price types that are not already predefined in PriceTypeEnumeration.
     */
    @NotNull public Builder priceType(@NotNull String priceType) {
      putValue("priceType", priceType);
      return this;
    }
    /**
     * A string or text indicating the unit of measurement. Useful if you cannot provide a standard unit code for
     * &lt;a href='unitCode'&gt;unitCode&lt;/a&gt;.
     */
    @NotNull public Builder unitText(@NotNull String unitText) {
      putValue("unitText", unitText);
      return this;
    }
    /**
     * This property specifies the minimal quantity and rounding increment that will be the basis for the billing. The unit of measurement is specified by the unitCode property.
     */
    @NotNull public Builder billingIncrement(@NotNull Integer integer) {
      putValue("billingIncrement", integer);
      return this;
    }
    /**
     * This property specifies the minimal quantity and rounding increment that will be the basis for the billing. The unit of measurement is specified by the unitCode property.
     */
    @NotNull public Builder billingIncrement(@NotNull Long billingIncrement) {
      putValue("billingIncrement", billingIncrement);
      return this;
    }
    /**
     * This property specifies the minimal quantity and rounding increment that will be the basis for the billing. The unit of measurement is specified by the unitCode property.
     */
    @NotNull public Builder billingIncrement(@NotNull Float billingIncrement) {
      putValue("billingIncrement", billingIncrement);
      return this;
    }
    /**
     * This property specifies the minimal quantity and rounding increment that will be the basis for the billing. The unit of measurement is specified by the unitCode property.
     */
    @NotNull public Builder billingIncrement(@NotNull Double billingIncrement) {
      putValue("billingIncrement", billingIncrement);
      return this;
    }
    /**
     * This property specifies the minimal quantity and rounding increment that will be the basis for the billing. The unit of measurement is specified by the unitCode property.
     */
    @NotNull public Builder billingIncrement(@NotNull String billingIncrement) {
      putValue("billingIncrement", billingIncrement);
      return this;
    }
    /**
     * The reference quantity for which a certain price applies, e.g. 1 EUR per 4 kWh of electricity. This property is a replacement for unitOfMeasurement for the advanced cases where the price does not relate to a standard unit.
     */
    @NotNull public Builder referenceQuantity(@NotNull QuantitativeValue quantitativeValue) {
      putValue("referenceQuantity", quantitativeValue);
      return this;
    }
    /**
     * The reference quantity for which a certain price applies, e.g. 1 EUR per 4 kWh of electricity. This property is a replacement for unitOfMeasurement for the advanced cases where the price does not relate to a standard unit.
     */
    @NotNull public Builder referenceQuantity(@NotNull QuantitativeValue.Builder quantitativeValue) {
      putValue("referenceQuantity", quantitativeValue.build());
      return this;
    }
    /**
     * The unit of measurement given using the UN/CEFACT Common Code (3 characters) or a URL. Other codes than the UN/CEFACT Common Code may be used with a prefix followed by a colon.
     */
    @NotNull public Builder unitCode(@NotNull String unitCode) {
      putValue("unitCode", unitCode);
      return this;
    }
    /**
     * Specifies after how much time this price (or price component) becomes valid and billing starts. Can be used, for example, to model a price increase after the first year of a subscription. The unit of measurement is specified by the unitCode property.
     */
    @NotNull public Builder billingStart(@NotNull Integer integer) {
      putValue("billingStart", integer);
      return this;
    }
    /**
     * Specifies after how much time this price (or price component) becomes valid and billing starts. Can be used, for example, to model a price increase after the first year of a subscription. The unit of measurement is specified by the unitCode property.
     */
    @NotNull public Builder billingStart(@NotNull Long billingStart) {
      putValue("billingStart", billingStart);
      return this;
    }
    /**
     * Specifies after how much time this price (or price component) becomes valid and billing starts. Can be used, for example, to model a price increase after the first year of a subscription. The unit of measurement is specified by the unitCode property.
     */
    @NotNull public Builder billingStart(@NotNull Float billingStart) {
      putValue("billingStart", billingStart);
      return this;
    }
    /**
     * Specifies after how much time this price (or price component) becomes valid and billing starts. Can be used, for example, to model a price increase after the first year of a subscription. The unit of measurement is specified by the unitCode property.
     */
    @NotNull public Builder billingStart(@NotNull Double billingStart) {
      putValue("billingStart", billingStart);
      return this;
    }
    /**
     * Specifies after how much time this price (or price component) becomes valid and billing starts. Can be used, for example, to model a price increase after the first year of a subscription. The unit of measurement is specified by the unitCode property.
     */
    @NotNull public Builder billingStart(@NotNull String billingStart) {
      putValue("billingStart", billingStart);
      return this;
    }
    /**
     * Specifies for how long this price (or price component) will be billed. Can be used, for example, to model the contractual duration of a subscription or payment plan. Type can be either a Duration or a Number (in which case the unit of measurement, for example month, is specified by the unitCode property).
     */
    @NotNull public Builder billingDuration(@NotNull Duration duration) {
      putValue("billingDuration", duration);
      return this;
    }
    /**
     * Specifies for how long this price (or price component) will be billed. Can be used, for example, to model the contractual duration of a subscription or payment plan. Type can be either a Duration or a Number (in which case the unit of measurement, for example month, is specified by the unitCode property).
     */
    @NotNull public Builder billingDuration(@NotNull Number number) {
      putValue("billingDuration", number);
      return this;
    }
    /**
     * Specifies for how long this price (or price component) will be billed. Can be used, for example, to model the contractual duration of a subscription or payment plan. Type can be either a Duration or a Number (in which case the unit of measurement, for example month, is specified by the unitCode property).
     */
    @NotNull public Builder billingDuration(@NotNull QuantitativeValue quantitativeValue) {
      putValue("billingDuration", quantitativeValue);
      return this;
    }
    /**
     * Specifies for how long this price (or price component) will be billed. Can be used, for example, to model the contractual duration of a subscription or payment plan. Type can be either a Duration or a Number (in which case the unit of measurement, for example month, is specified by the unitCode property).
     */
    @NotNull public Builder billingDuration(@NotNull QuantitativeValue.Builder quantitativeValue) {
      putValue("billingDuration", quantitativeValue.build());
      return this;
    }
    /**
     * Identifies a price component (for example, a line item on an invoice), part of the total price for an offer.
     */
    @NotNull public Builder priceComponentType(@NotNull PriceComponentTypeEnumeration priceComponentTypeEnumeration) {
      putValue("priceComponentType", priceComponentTypeEnumeration);
      return this;
    }
    /**
     * The date when the item becomes valid.
     */
    @NotNull public Builder validFrom(@NotNull java.util.Date date) {
      putValue("validFrom", date);
      return this;
    }
    /**
     * The offer price of a product, or of a price component when attached to PriceSpecification and its subtypes.\n\nUsage guidelines:\n\n* Use the [[priceCurrency]] property (with standard formats: [ISO 4217 currency format](http://en.wikipedia.org/wiki/ISO_4217) e.g. &quot;USD&quot;; [Ticker symbol](https://en.wikipedia.org/wiki/List_of_cryptocurrencies) for cryptocurrencies e.g. &quot;BTC&quot;; well known names for [Local Exchange Tradings Systems](https://en.wikipedia.org/wiki/Local_exchange_trading_system) (LETS) and other currency types e.g. &quot;Ithaca HOUR&quot;) instead of including [ambiguous symbols](http://en.wikipedia.org/wiki/Dollar_sign#Currencies_that_use_the_dollar_or_peso_sign) such as '$' in the value.\n* Use '.' (Unicode 'FULL STOP' (U+002E)) rather than ',' to indicate a decimal point. Avoid using these symbols as a readability separator.\n* Note that both [RDFa](http://www.w3.org/TR/xhtml-rdfa-primer/#using-the-content-attribute) and Microdata syntax allow the use of a &quot;content=&quot; attribute for publishing simple machine-readable values alongside more human-friendly formatting.\n* Use values from 0123456789 (Unicode 'DIGIT ZERO' (U+0030) to 'DIGIT NINE' (U+0039)) rather than superficially similiar Unicode symbols.
     *       
     */
    @NotNull public Builder price(@NotNull Number number) {
      putValue("price", number);
      return this;
    }
    /**
     * The offer price of a product, or of a price component when attached to PriceSpecification and its subtypes.\n\nUsage guidelines:\n\n* Use the [[priceCurrency]] property (with standard formats: [ISO 4217 currency format](http://en.wikipedia.org/wiki/ISO_4217) e.g. &quot;USD&quot;; [Ticker symbol](https://en.wikipedia.org/wiki/List_of_cryptocurrencies) for cryptocurrencies e.g. &quot;BTC&quot;; well known names for [Local Exchange Tradings Systems](https://en.wikipedia.org/wiki/Local_exchange_trading_system) (LETS) and other currency types e.g. &quot;Ithaca HOUR&quot;) instead of including [ambiguous symbols](http://en.wikipedia.org/wiki/Dollar_sign#Currencies_that_use_the_dollar_or_peso_sign) such as '$' in the value.\n* Use '.' (Unicode 'FULL STOP' (U+002E)) rather than ',' to indicate a decimal point. Avoid using these symbols as a readability separator.\n* Note that both [RDFa](http://www.w3.org/TR/xhtml-rdfa-primer/#using-the-content-attribute) and Microdata syntax allow the use of a &quot;content=&quot; attribute for publishing simple machine-readable values alongside more human-friendly formatting.\n* Use values from 0123456789 (Unicode 'DIGIT ZERO' (U+0030) to 'DIGIT NINE' (U+0039)) rather than superficially similiar Unicode symbols.
     *       
     */
    @NotNull public Builder price(@NotNull String price) {
      putValue("price", price);
      return this;
    }
    /**
     * The lowest price if the price is a range.
     */
    @NotNull public Builder minPrice(@NotNull Integer integer) {
      putValue("minPrice", integer);
      return this;
    }
    /**
     * The lowest price if the price is a range.
     */
    @NotNull public Builder minPrice(@NotNull Long minPrice) {
      putValue("minPrice", minPrice);
      return this;
    }
    /**
     * The lowest price if the price is a range.
     */
    @NotNull public Builder minPrice(@NotNull Float minPrice) {
      putValue("minPrice", minPrice);
      return this;
    }
    /**
     * The lowest price if the price is a range.
     */
    @NotNull public Builder minPrice(@NotNull Double minPrice) {
      putValue("minPrice", minPrice);
      return this;
    }
    /**
     * The lowest price if the price is a range.
     */
    @NotNull public Builder minPrice(@NotNull String minPrice) {
      putValue("minPrice", minPrice);
      return this;
    }
    /**
     * The interval and unit of measurement of ordering quantities for which the offer or price specification is valid. This allows e.g. specifying that a certain freight charge is valid only for a certain quantity.
     */
    @NotNull public Builder eligibleQuantity(@NotNull QuantitativeValue quantitativeValue) {
      putValue("eligibleQuantity", quantitativeValue);
      return this;
    }
    /**
     * The interval and unit of measurement of ordering quantities for which the offer or price specification is valid. This allows e.g. specifying that a certain freight charge is valid only for a certain quantity.
     */
    @NotNull public Builder eligibleQuantity(@NotNull QuantitativeValue.Builder quantitativeValue) {
      putValue("eligibleQuantity", quantitativeValue.build());
      return this;
    }
    /**
     * Specifies whether the applicable value-added tax (VAT) is included in the price specification or not.
     */
    @NotNull public Builder valueAddedTaxIncluded(@NotNull Boolean valueAddedTaxIncluded) {
      putValue("valueAddedTaxIncluded", valueAddedTaxIncluded);
      return this;
    }
    /**
     * The date after when the item is not valid. For example the end of an offer, salary period, or a period of opening hours.
     */
    @NotNull public Builder validThrough(@NotNull java.util.Date date) {
      putValue("validThrough", date);
      return this;
    }
    /**
     * The transaction volume, in a monetary unit, for which the offer or price specification is valid, e.g. for indicating a minimal purchasing volume, to express free shipping above a certain order volume, or to limit the acceptance of credit cards to purchases to a certain minimal amount.
     */
    @NotNull public Builder eligibleTransactionVolume(@NotNull PriceSpecification priceSpecification) {
      putValue("eligibleTransactionVolume", priceSpecification);
      return this;
    }
    /**
     * The transaction volume, in a monetary unit, for which the offer or price specification is valid, e.g. for indicating a minimal purchasing volume, to express free shipping above a certain order volume, or to limit the acceptance of credit cards to purchases to a certain minimal amount.
     */
    @NotNull public Builder eligibleTransactionVolume(@NotNull PriceSpecification.Builder priceSpecification) {
      putValue("eligibleTransactionVolume", priceSpecification.build());
      return this;
    }
    /**
     * The currency of the price, or a price component when attached to [[PriceSpecification]] and its subtypes.\n\nUse standard formats: [ISO 4217 currency format](http://en.wikipedia.org/wiki/ISO_4217) e.g. &quot;USD&quot;; [Ticker symbol](https://en.wikipedia.org/wiki/List_of_cryptocurrencies) for cryptocurrencies e.g. &quot;BTC&quot;; well known names for [Local Exchange Tradings Systems](https://en.wikipedia.org/wiki/Local_exchange_trading_system) (LETS) and other currency types e.g. &quot;Ithaca HOUR&quot;.
     */
    @NotNull public Builder priceCurrency(@NotNull String priceCurrency) {
      putValue("priceCurrency", priceCurrency);
      return this;
    }
    /**
     * The highest price if the price is a range.
     */
    @NotNull public Builder maxPrice(@NotNull Integer integer) {
      putValue("maxPrice", integer);
      return this;
    }
    /**
     * The highest price if the price is a range.
     */
    @NotNull public Builder maxPrice(@NotNull Long maxPrice) {
      putValue("maxPrice", maxPrice);
      return this;
    }
    /**
     * The highest price if the price is a range.
     */
    @NotNull public Builder maxPrice(@NotNull Float maxPrice) {
      putValue("maxPrice", maxPrice);
      return this;
    }
    /**
     * The highest price if the price is a range.
     */
    @NotNull public Builder maxPrice(@NotNull Double maxPrice) {
      putValue("maxPrice", maxPrice);
      return this;
    }
    /**
     * The highest price if the price is a range.
     */
    @NotNull public Builder maxPrice(@NotNull String maxPrice) {
      putValue("maxPrice", maxPrice);
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
      if ("priceType".equals(key) && value instanceof PriceTypeEnumeration) { this.priceType((PriceTypeEnumeration)value); return; }
      if ("priceTypes".equals(key) && value instanceof PriceTypeEnumeration) { this.priceType((PriceTypeEnumeration)value); return; }
      if ("priceType".equals(key) && value instanceof String) { this.priceType((String)value); return; }
      if ("priceTypes".equals(key) && value instanceof String) { this.priceType((String)value); return; }
      if ("unitText".equals(key) && value instanceof String) { this.unitText((String)value); return; }
      if ("unitTexts".equals(key) && value instanceof String) { this.unitText((String)value); return; }
      if ("billingIncrement".equals(key) && value instanceof Integer) { this.billingIncrement((Integer)value); return; }
      if ("billingIncrements".equals(key) && value instanceof Integer) { this.billingIncrement((Integer)value); return; }
      if ("billingIncrement".equals(key) && value instanceof Long) { this.billingIncrement((Long)value); return; }
      if ("billingIncrements".equals(key) && value instanceof Long) { this.billingIncrement((Long)value); return; }
      if ("billingIncrement".equals(key) && value instanceof Float) { this.billingIncrement((Float)value); return; }
      if ("billingIncrements".equals(key) && value instanceof Float) { this.billingIncrement((Float)value); return; }
      if ("billingIncrement".equals(key) && value instanceof Double) { this.billingIncrement((Double)value); return; }
      if ("billingIncrements".equals(key) && value instanceof Double) { this.billingIncrement((Double)value); return; }
      if ("billingIncrement".equals(key) && value instanceof String) { this.billingIncrement((String)value); return; }
      if ("billingIncrements".equals(key) && value instanceof String) { this.billingIncrement((String)value); return; }
      if ("referenceQuantity".equals(key) && value instanceof QuantitativeValue) { this.referenceQuantity((QuantitativeValue)value); return; }
      if ("referenceQuantitys".equals(key) && value instanceof QuantitativeValue) { this.referenceQuantity((QuantitativeValue)value); return; }
      if ("unitCode".equals(key) && value instanceof String) { this.unitCode((String)value); return; }
      if ("unitCodes".equals(key) && value instanceof String) { this.unitCode((String)value); return; }
      if ("billingStart".equals(key) && value instanceof Integer) { this.billingStart((Integer)value); return; }
      if ("billingStarts".equals(key) && value instanceof Integer) { this.billingStart((Integer)value); return; }
      if ("billingStart".equals(key) && value instanceof Long) { this.billingStart((Long)value); return; }
      if ("billingStarts".equals(key) && value instanceof Long) { this.billingStart((Long)value); return; }
      if ("billingStart".equals(key) && value instanceof Float) { this.billingStart((Float)value); return; }
      if ("billingStarts".equals(key) && value instanceof Float) { this.billingStart((Float)value); return; }
      if ("billingStart".equals(key) && value instanceof Double) { this.billingStart((Double)value); return; }
      if ("billingStarts".equals(key) && value instanceof Double) { this.billingStart((Double)value); return; }
      if ("billingStart".equals(key) && value instanceof String) { this.billingStart((String)value); return; }
      if ("billingStarts".equals(key) && value instanceof String) { this.billingStart((String)value); return; }
      if ("billingDuration".equals(key) && value instanceof Duration) { this.billingDuration((Duration)value); return; }
      if ("billingDurations".equals(key) && value instanceof Duration) { this.billingDuration((Duration)value); return; }
      if ("billingDuration".equals(key) && value instanceof Number) { this.billingDuration((Number)value); return; }
      if ("billingDurations".equals(key) && value instanceof Number) { this.billingDuration((Number)value); return; }
      if ("billingDuration".equals(key) && value instanceof QuantitativeValue) { this.billingDuration((QuantitativeValue)value); return; }
      if ("billingDurations".equals(key) && value instanceof QuantitativeValue) { this.billingDuration((QuantitativeValue)value); return; }
      if ("priceComponentType".equals(key) && value instanceof PriceComponentTypeEnumeration) { this.priceComponentType((PriceComponentTypeEnumeration)value); return; }
      if ("priceComponentTypes".equals(key) && value instanceof PriceComponentTypeEnumeration) { this.priceComponentType((PriceComponentTypeEnumeration)value); return; }
      super.fromMap(key, value);
    }
  }
  
}
