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
 * A statistical distribution of monetary amounts.Source: https://github.com/schemaorg/schemaorg/issues/1698
 */
public class MonetaryAmountDistribution extends QuantitativeValueDistribution {
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
  protected MonetaryAmountDistribution(java.util.Map<String,Object> data) {
    super(data);
  }
  
  /**
   * Builder for {@link MonetaryAmountDistribution}
   */
  public static class Builder extends QuantitativeValueDistribution.Builder {
    public Builder(@NotNull HashMap<String,Object> data) {
      super(data);
    }
    @NotNull public MonetaryAmountDistribution build() {
      return new MonetaryAmountDistribution(myData);
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
     * The 90th percentile value.
     */
    @NotNull public Builder percentile90(@NotNull Integer integer) {
      putValue("percentile90", integer);
      return this;
    }
    /**
     * The 90th percentile value.
     */
    @NotNull public Builder percentile90(@NotNull Long percentile90) {
      putValue("percentile90", percentile90);
      return this;
    }
    /**
     * The 90th percentile value.
     */
    @NotNull public Builder percentile90(@NotNull Float percentile90) {
      putValue("percentile90", percentile90);
      return this;
    }
    /**
     * The 90th percentile value.
     */
    @NotNull public Builder percentile90(@NotNull Double percentile90) {
      putValue("percentile90", percentile90);
      return this;
    }
    /**
     * The 90th percentile value.
     */
    @NotNull public Builder percentile90(@NotNull String percentile90) {
      putValue("percentile90", percentile90);
      return this;
    }
    /**
     * The 75th percentile value.
     */
    @NotNull public Builder percentile75(@NotNull Integer integer) {
      putValue("percentile75", integer);
      return this;
    }
    /**
     * The 75th percentile value.
     */
    @NotNull public Builder percentile75(@NotNull Long percentile75) {
      putValue("percentile75", percentile75);
      return this;
    }
    /**
     * The 75th percentile value.
     */
    @NotNull public Builder percentile75(@NotNull Float percentile75) {
      putValue("percentile75", percentile75);
      return this;
    }
    /**
     * The 75th percentile value.
     */
    @NotNull public Builder percentile75(@NotNull Double percentile75) {
      putValue("percentile75", percentile75);
      return this;
    }
    /**
     * The 75th percentile value.
     */
    @NotNull public Builder percentile75(@NotNull String percentile75) {
      putValue("percentile75", percentile75);
      return this;
    }
    /**
     * The duration of the item (movie, audio recording, event, etc.) in &lt;a href=&quot;http://en.wikipedia.org/wiki/ISO_8601&quot;&gt;ISO 8601 date format&lt;/a&gt;.
     */
    @NotNull public Builder duration(@NotNull Duration duration) {
      putValue("duration", duration);
      return this;
    }
    /**
     * The 25th percentile value.
     */
    @NotNull public Builder percentile25(@NotNull Integer integer) {
      putValue("percentile25", integer);
      return this;
    }
    /**
     * The 25th percentile value.
     */
    @NotNull public Builder percentile25(@NotNull Long percentile25) {
      putValue("percentile25", percentile25);
      return this;
    }
    /**
     * The 25th percentile value.
     */
    @NotNull public Builder percentile25(@NotNull Float percentile25) {
      putValue("percentile25", percentile25);
      return this;
    }
    /**
     * The 25th percentile value.
     */
    @NotNull public Builder percentile25(@NotNull Double percentile25) {
      putValue("percentile25", percentile25);
      return this;
    }
    /**
     * The 25th percentile value.
     */
    @NotNull public Builder percentile25(@NotNull String percentile25) {
      putValue("percentile25", percentile25);
      return this;
    }
    /**
     * The median value.
     */
    @NotNull public Builder median(@NotNull Integer integer) {
      putValue("median", integer);
      return this;
    }
    /**
     * The median value.
     */
    @NotNull public Builder median(@NotNull Long median) {
      putValue("median", median);
      return this;
    }
    /**
     * The median value.
     */
    @NotNull public Builder median(@NotNull Float median) {
      putValue("median", median);
      return this;
    }
    /**
     * The median value.
     */
    @NotNull public Builder median(@NotNull Double median) {
      putValue("median", median);
      return this;
    }
    /**
     * The median value.
     */
    @NotNull public Builder median(@NotNull String median) {
      putValue("median", median);
      return this;
    }
    /**
     * The 10th percentile value.
     */
    @NotNull public Builder percentile10(@NotNull Integer integer) {
      putValue("percentile10", integer);
      return this;
    }
    /**
     * The 10th percentile value.
     */
    @NotNull public Builder percentile10(@NotNull Long percentile10) {
      putValue("percentile10", percentile10);
      return this;
    }
    /**
     * The 10th percentile value.
     */
    @NotNull public Builder percentile10(@NotNull Float percentile10) {
      putValue("percentile10", percentile10);
      return this;
    }
    /**
     * The 10th percentile value.
     */
    @NotNull public Builder percentile10(@NotNull Double percentile10) {
      putValue("percentile10", percentile10);
      return this;
    }
    /**
     * The 10th percentile value.
     */
    @NotNull public Builder percentile10(@NotNull String percentile10) {
      putValue("percentile10", percentile10);
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
      if ("currency".equals(key) && value instanceof String) { this.currency((String)value); return; }
      if ("currencys".equals(key) && value instanceof String) { this.currency((String)value); return; }
      super.fromMap(key, value);
    }
  }
  
}
