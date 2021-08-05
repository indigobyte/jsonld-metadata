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
 * A DatedMoneySpecification represents monetary values with optional start and end dates. For example, this could represent an employee's salary over a specific period of time. &lt;strong&gt;Note:&lt;/strong&gt; This type has been superseded by &lt;a class=&quot;localLink&quot; href=&quot;http://schema.org/MonetaryAmount&quot;&gt;MonetaryAmount&lt;/a&gt; use of that type is recommended
 */
public class DatedMoneySpecification extends StructuredValue {
  /**
   * The start date and time of the item (in &lt;a href=&quot;http://en.wikipedia.org/wiki/ISO_8601&quot;&gt;ISO 8601 date format&lt;/a&gt;).
   */
  @JsonIgnore public java.util.Date getStartDate() {
    return (java.util.Date) getValue("startDate");
  }
  /**
   * The start date and time of the item (in &lt;a href=&quot;http://en.wikipedia.org/wiki/ISO_8601&quot;&gt;ISO 8601 date format&lt;/a&gt;).
   */
  @JsonIgnore public Collection<java.util.Date> getStartDates() {
    final Object current = myData.get("startDate");
    if (current == null) return Collections.emptyList();
    if (current instanceof Collection) {
      return (Collection<java.util.Date>) current;
    }
    return Arrays.asList((java.util.Date) current);
  }
  /**
   * The amount of money.
   */
  @JsonIgnore public Integer getAmountInteger() {
    return (Integer) getValue("amount");
  }
  /**
   * The amount of money.
   */
  @JsonIgnore public Collection<Integer> getAmountIntegers() {
    final Object current = myData.get("amount");
    if (current == null) return Collections.emptyList();
    if (current instanceof Collection) {
      return (Collection<Integer>) current;
    }
    return Arrays.asList((Integer) current);
  }
  /**
   * The amount of money.
   */
  @JsonIgnore public Long getAmountLong() {
    return (Long) getValue("amount");
  }
  /**
   * The amount of money.
   */
  @JsonIgnore public Collection<Long> getAmountLongs() {
    final Object current = myData.get("amount");
    if (current == null) return Collections.emptyList();
    if (current instanceof Collection) {
      return (Collection<Long>) current;
    }
    return Arrays.asList((Long) current);
  }
  /**
   * The amount of money.
   */
  @JsonIgnore public Float getAmountFloat() {
    return (Float) getValue("amount");
  }
  /**
   * The amount of money.
   */
  @JsonIgnore public Collection<Float> getAmountFloats() {
    final Object current = myData.get("amount");
    if (current == null) return Collections.emptyList();
    if (current instanceof Collection) {
      return (Collection<Float>) current;
    }
    return Arrays.asList((Float) current);
  }
  /**
   * The amount of money.
   */
  @JsonIgnore public Double getAmountDouble() {
    return (Double) getValue("amount");
  }
  /**
   * The amount of money.
   */
  @JsonIgnore public Collection<Double> getAmountDoubles() {
    final Object current = myData.get("amount");
    if (current == null) return Collections.emptyList();
    if (current instanceof Collection) {
      return (Collection<Double>) current;
    }
    return Arrays.asList((Double) current);
  }
  /**
   * The amount of money.
   */
  @JsonIgnore public String getAmountString() {
    return (String) getValue("amount");
  }
  /**
   * The amount of money.
   */
  @JsonIgnore public Collection<String> getAmountStrings() {
    final Object current = myData.get("amount");
    if (current == null) return Collections.emptyList();
    if (current instanceof Collection) {
      return (Collection<String>) current;
    }
    return Arrays.asList((String) current);
  }
  /**
   * The end date and time of the item (in &lt;a href=&quot;http://en.wikipedia.org/wiki/ISO_8601&quot;&gt;ISO 8601 date format&lt;/a&gt;).
   */
  @JsonIgnore public java.util.Date getEndDate() {
    return (java.util.Date) getValue("endDate");
  }
  /**
   * The end date and time of the item (in &lt;a href=&quot;http://en.wikipedia.org/wiki/ISO_8601&quot;&gt;ISO 8601 date format&lt;/a&gt;).
   */
  @JsonIgnore public Collection<java.util.Date> getEndDates() {
    final Object current = myData.get("endDate");
    if (current == null) return Collections.emptyList();
    if (current instanceof Collection) {
      return (Collection<java.util.Date>) current;
    }
    return Arrays.asList((java.util.Date) current);
  }
  /**
   * The currency in which the monetary amount is expressed.&lt;br/&gt;&lt;br/&gt;
   * 
   * Use standard formats: &lt;a href=&quot;http://en.wikipedia.org/wiki/ISO_4217&quot;&gt;ISO 4217 currency format&lt;/a&gt; e.g. &quot;USD&quot;; &lt;a href=&quot;https://en.wikipedia.org/wiki/List_of_cryptocurrencies&quot;&gt;Ticker symbol&lt;/a&gt; for cryptocurrencies e.g. &quot;BTC&quot;; well known names for &lt;a href=&quot;https://en.wikipedia.org/wiki/Local_exchange_trading_system&quot;&gt;Local Exchange Tradings Systems&lt;/a&gt; (LETS) and other currency types e.g. &quot;Ithaca HOUR&quot;.
   */
  @JsonIgnore public String getCurrency() {
    return (String) getValue("currency");
  }
  /**
   * The currency in which the monetary amount is expressed.&lt;br/&gt;&lt;br/&gt;
   * 
   * Use standard formats: &lt;a href=&quot;http://en.wikipedia.org/wiki/ISO_4217&quot;&gt;ISO 4217 currency format&lt;/a&gt; e.g. &quot;USD&quot;; &lt;a href=&quot;https://en.wikipedia.org/wiki/List_of_cryptocurrencies&quot;&gt;Ticker symbol&lt;/a&gt; for cryptocurrencies e.g. &quot;BTC&quot;; well known names for &lt;a href=&quot;https://en.wikipedia.org/wiki/Local_exchange_trading_system&quot;&gt;Local Exchange Tradings Systems&lt;/a&gt; (LETS) and other currency types e.g. &quot;Ithaca HOUR&quot;.
   */
  @JsonIgnore public Collection<String> getCurrencys() {
    final Object current = myData.get("currency");
    if (current == null) return Collections.emptyList();
    if (current instanceof Collection) {
      return (Collection<String>) current;
    }
    return Arrays.asList((String) current);
  }
  protected DatedMoneySpecification(java.util.Map<String,Object> data) {
    super(data);
  }
  
  /**
   * Builder for {@link DatedMoneySpecification}
   */
  public static class Builder extends StructuredValue.Builder {
    public Builder(@NotNull HashMap<String,Object> data) {
      super(data);
    }
    @NotNull public DatedMoneySpecification build() {
      return new DatedMoneySpecification(myData);
    }
    /**
     * The start date and time of the item (in &lt;a href=&quot;http://en.wikipedia.org/wiki/ISO_8601&quot;&gt;ISO 8601 date format&lt;/a&gt;).
     */
    @NotNull public Builder startDate(@NotNull java.util.Date date) {
      putValue("startDate", date);
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
     * The end date and time of the item (in &lt;a href=&quot;http://en.wikipedia.org/wiki/ISO_8601&quot;&gt;ISO 8601 date format&lt;/a&gt;).
     */
    @NotNull public Builder endDate(@NotNull java.util.Date date) {
      putValue("endDate", date);
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
      if ("startDate".equals(key) && value instanceof java.util.Date) { this.startDate((java.util.Date)value); return; }
      if ("startDates".equals(key) && value instanceof java.util.Date) { this.startDate((java.util.Date)value); return; }
      if ("amount".equals(key) && value instanceof Integer) { this.amount((Integer)value); return; }
      if ("amounts".equals(key) && value instanceof Integer) { this.amount((Integer)value); return; }
      if ("amount".equals(key) && value instanceof Long) { this.amount((Long)value); return; }
      if ("amounts".equals(key) && value instanceof Long) { this.amount((Long)value); return; }
      if ("amount".equals(key) && value instanceof Float) { this.amount((Float)value); return; }
      if ("amounts".equals(key) && value instanceof Float) { this.amount((Float)value); return; }
      if ("amount".equals(key) && value instanceof Double) { this.amount((Double)value); return; }
      if ("amounts".equals(key) && value instanceof Double) { this.amount((Double)value); return; }
      if ("amount".equals(key) && value instanceof String) { this.amount((String)value); return; }
      if ("amounts".equals(key) && value instanceof String) { this.amount((String)value); return; }
      if ("endDate".equals(key) && value instanceof java.util.Date) { this.endDate((java.util.Date)value); return; }
      if ("endDates".equals(key) && value instanceof java.util.Date) { this.endDate((java.util.Date)value); return; }
      if ("currency".equals(key) && value instanceof String) { this.currency((String)value); return; }
      if ("currencys".equals(key) && value instanceof String) { this.currency((String)value); return; }
      super.fromMap(key, value);
    }
  }
  
}
