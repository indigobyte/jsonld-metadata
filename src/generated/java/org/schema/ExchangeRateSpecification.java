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
 * A structured value representing exchange rate.
 */
public class ExchangeRateSpecification extends StructuredValue {
  /**
   * The current price of a currency.
   */
  @JsonIgnore public UnitPriceSpecification getCurrentExchangeRate() {
    return (UnitPriceSpecification) getValue("currentExchangeRate");
  }
  /**
   * The current price of a currency.
   */
  @JsonIgnore public java.util.Collection<UnitPriceSpecification> getCurrentExchangeRates() {
    final java.lang.Object current = myData.get("currentExchangeRate");
    if (current == null) return Collections.emptyList();
    if (current instanceof java.util.Collection) {
      return (java.util.Collection<UnitPriceSpecification>) current;
    }
    return Arrays.asList((UnitPriceSpecification) current);
  }
  /**
   * The difference between the price at which a broker or other intermediary buys and sells foreign currency.
   */
  @JsonIgnore public Integer getExchangeRateSpreadInteger() {
    return (Integer) getValue("exchangeRateSpread");
  }
  /**
   * The difference between the price at which a broker or other intermediary buys and sells foreign currency.
   */
  @JsonIgnore public java.util.Collection<Integer> getExchangeRateSpreadIntegers() {
    final java.lang.Object current = myData.get("exchangeRateSpread");
    if (current == null) return Collections.emptyList();
    if (current instanceof java.util.Collection) {
      return (java.util.Collection<Integer>) current;
    }
    return Arrays.asList((Integer) current);
  }
  /**
   * The difference between the price at which a broker or other intermediary buys and sells foreign currency.
   */
  @JsonIgnore public Long getExchangeRateSpreadLong() {
    return (Long) getValue("exchangeRateSpread");
  }
  /**
   * The difference between the price at which a broker or other intermediary buys and sells foreign currency.
   */
  @JsonIgnore public java.util.Collection<Long> getExchangeRateSpreadLongs() {
    final java.lang.Object current = myData.get("exchangeRateSpread");
    if (current == null) return Collections.emptyList();
    if (current instanceof java.util.Collection) {
      return (java.util.Collection<Long>) current;
    }
    return Arrays.asList((Long) current);
  }
  /**
   * The difference between the price at which a broker or other intermediary buys and sells foreign currency.
   */
  @JsonIgnore public Float getExchangeRateSpreadFloat() {
    return (Float) getValue("exchangeRateSpread");
  }
  /**
   * The difference between the price at which a broker or other intermediary buys and sells foreign currency.
   */
  @JsonIgnore public java.util.Collection<Float> getExchangeRateSpreadFloats() {
    final java.lang.Object current = myData.get("exchangeRateSpread");
    if (current == null) return Collections.emptyList();
    if (current instanceof java.util.Collection) {
      return (java.util.Collection<Float>) current;
    }
    return Arrays.asList((Float) current);
  }
  /**
   * The difference between the price at which a broker or other intermediary buys and sells foreign currency.
   */
  @JsonIgnore public Double getExchangeRateSpreadDouble() {
    return (Double) getValue("exchangeRateSpread");
  }
  /**
   * The difference between the price at which a broker or other intermediary buys and sells foreign currency.
   */
  @JsonIgnore public java.util.Collection<Double> getExchangeRateSpreadDoubles() {
    final java.lang.Object current = myData.get("exchangeRateSpread");
    if (current == null) return Collections.emptyList();
    if (current instanceof java.util.Collection) {
      return (java.util.Collection<Double>) current;
    }
    return Arrays.asList((Double) current);
  }
  /**
   * The difference between the price at which a broker or other intermediary buys and sells foreign currency.
   */
  @JsonIgnore public String getExchangeRateSpreadString() {
    return (String) getValue("exchangeRateSpread");
  }
  /**
   * The difference between the price at which a broker or other intermediary buys and sells foreign currency.
   */
  @JsonIgnore public java.util.Collection<String> getExchangeRateSpreadStrings() {
    final java.lang.Object current = myData.get("exchangeRateSpread");
    if (current == null) return Collections.emptyList();
    if (current instanceof java.util.Collection) {
      return (java.util.Collection<String>) current;
    }
    return Arrays.asList((String) current);
  }
  /**
   * The currency in which the monetary amount is expressed.\n\nUse standard formats: [ISO 4217 currency format](http://en.wikipedia.org/wiki/ISO_4217) e.g. &quot;USD&quot;; [Ticker symbol](https://en.wikipedia.org/wiki/List_of_cryptocurrencies) for cryptocurrencies e.g. &quot;BTC&quot;; well known names for [Local Exchange Tradings Systems](https://en.wikipedia.org/wiki/Local_exchange_trading_system) (LETS) and other currency types e.g. &quot;Ithaca HOUR&quot;.
   */
  @JsonIgnore public String getCurrency() {
    return (String) getValue("currency");
  }
  /**
   * The currency in which the monetary amount is expressed.\n\nUse standard formats: [ISO 4217 currency format](http://en.wikipedia.org/wiki/ISO_4217) e.g. &quot;USD&quot;; [Ticker symbol](https://en.wikipedia.org/wiki/List_of_cryptocurrencies) for cryptocurrencies e.g. &quot;BTC&quot;; well known names for [Local Exchange Tradings Systems](https://en.wikipedia.org/wiki/Local_exchange_trading_system) (LETS) and other currency types e.g. &quot;Ithaca HOUR&quot;.
   */
  @JsonIgnore public java.util.Collection<String> getCurrencys() {
    final java.lang.Object current = myData.get("currency");
    if (current == null) return Collections.emptyList();
    if (current instanceof java.util.Collection) {
      return (java.util.Collection<String>) current;
    }
    return Arrays.asList((String) current);
  }
  protected ExchangeRateSpecification(java.util.Map<String,java.lang.Object> data) {
    super(data);
  }
  
  /**
   * Builder for {@link ExchangeRateSpecification}
   */
  public static class Builder extends StructuredValue.Builder {
    public Builder(@NotNull HashMap<String,java.lang.Object> data) {
      super(data);
    }
    @NotNull public ExchangeRateSpecification build() {
      return new ExchangeRateSpecification(myData);
    }
    /**
     * The current price of a currency.
     */
    @NotNull public Builder currentExchangeRate(@NotNull UnitPriceSpecification unitPriceSpecification) {
      putValue("currentExchangeRate", unitPriceSpecification);
      return this;
    }
    /**
     * The current price of a currency.
     */
    @NotNull public Builder currentExchangeRate(@NotNull UnitPriceSpecification.Builder unitPriceSpecification) {
      putValue("currentExchangeRate", unitPriceSpecification.build());
      return this;
    }
    /**
     * The difference between the price at which a broker or other intermediary buys and sells foreign currency.
     */
    @NotNull public Builder exchangeRateSpread(@NotNull Integer integer) {
      putValue("exchangeRateSpread", integer);
      return this;
    }
    /**
     * The difference between the price at which a broker or other intermediary buys and sells foreign currency.
     */
    @NotNull public Builder exchangeRateSpread(@NotNull Long exchangeRateSpread) {
      putValue("exchangeRateSpread", exchangeRateSpread);
      return this;
    }
    /**
     * The difference between the price at which a broker or other intermediary buys and sells foreign currency.
     */
    @NotNull public Builder exchangeRateSpread(@NotNull Float exchangeRateSpread) {
      putValue("exchangeRateSpread", exchangeRateSpread);
      return this;
    }
    /**
     * The difference between the price at which a broker or other intermediary buys and sells foreign currency.
     */
    @NotNull public Builder exchangeRateSpread(@NotNull Double exchangeRateSpread) {
      putValue("exchangeRateSpread", exchangeRateSpread);
      return this;
    }
    /**
     * The difference between the price at which a broker or other intermediary buys and sells foreign currency.
     */
    @NotNull public Builder exchangeRateSpread(@NotNull String exchangeRateSpread) {
      putValue("exchangeRateSpread", exchangeRateSpread);
      return this;
    }
    /**
     * The currency in which the monetary amount is expressed.\n\nUse standard formats: [ISO 4217 currency format](http://en.wikipedia.org/wiki/ISO_4217) e.g. &quot;USD&quot;; [Ticker symbol](https://en.wikipedia.org/wiki/List_of_cryptocurrencies) for cryptocurrencies e.g. &quot;BTC&quot;; well known names for [Local Exchange Tradings Systems](https://en.wikipedia.org/wiki/Local_exchange_trading_system) (LETS) and other currency types e.g. &quot;Ithaca HOUR&quot;.
     */
    @NotNull public Builder currency(@NotNull String currency) {
      putValue("currency", currency);
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
      if ("currentExchangeRate".equals(key) && value instanceof UnitPriceSpecification) { this.currentExchangeRate((UnitPriceSpecification)value); return; }
      if ("currentExchangeRates".equals(key) && value instanceof UnitPriceSpecification) { this.currentExchangeRate((UnitPriceSpecification)value); return; }
      if ("exchangeRateSpread".equals(key) && value instanceof Integer) { this.exchangeRateSpread((Integer)value); return; }
      if ("exchangeRateSpreads".equals(key) && value instanceof Integer) { this.exchangeRateSpread((Integer)value); return; }
      if ("exchangeRateSpread".equals(key) && value instanceof Long) { this.exchangeRateSpread((Long)value); return; }
      if ("exchangeRateSpreads".equals(key) && value instanceof Long) { this.exchangeRateSpread((Long)value); return; }
      if ("exchangeRateSpread".equals(key) && value instanceof Float) { this.exchangeRateSpread((Float)value); return; }
      if ("exchangeRateSpreads".equals(key) && value instanceof Float) { this.exchangeRateSpread((Float)value); return; }
      if ("exchangeRateSpread".equals(key) && value instanceof Double) { this.exchangeRateSpread((Double)value); return; }
      if ("exchangeRateSpreads".equals(key) && value instanceof Double) { this.exchangeRateSpread((Double)value); return; }
      if ("exchangeRateSpread".equals(key) && value instanceof String) { this.exchangeRateSpread((String)value); return; }
      if ("exchangeRateSpreads".equals(key) && value instanceof String) { this.exchangeRateSpread((String)value); return; }
      if ("currency".equals(key) && value instanceof String) { this.currency((String)value); return; }
      if ("currencys".equals(key) && value instanceof String) { this.currency((String)value); return; }
      super.fromMap(key, value);
    }
  }
  
}
