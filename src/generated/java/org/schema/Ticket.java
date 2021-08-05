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
 * Used to describe a ticket to an event, a flight, a bus ride, etc.
 */
public class Ticket extends Intangible {
  /**
   * The person or organization the reservation or ticket is for.
   */
  @JsonIgnore public Organization getUnderNameOrganization() {
    return (Organization) getValue("underName");
  }
  /**
   * The person or organization the reservation or ticket is for.
   */
  @JsonIgnore public Collection<Organization> getUnderNameOrganizations() {
    final Object current = myData.get("underName");
    if (current == null) return Collections.emptyList();
    if (current instanceof Collection) {
      return (Collection<Organization>) current;
    }
    return Arrays.asList((Organization) current);
  }
  /**
   * The person or organization the reservation or ticket is for.
   */
  @JsonIgnore public Person getUnderNamePerson() {
    return (Person) getValue("underName");
  }
  /**
   * The person or organization the reservation or ticket is for.
   */
  @JsonIgnore public Collection<Person> getUnderNamePersons() {
    final Object current = myData.get("underName");
    if (current == null) return Collections.emptyList();
    if (current instanceof Collection) {
      return (Collection<Person>) current;
    }
    return Arrays.asList((Person) current);
  }
  /**
   * Reference to an asset (e.g., Barcode, QR code image or PDF) usable for entrance.
   */
  @JsonIgnore public String getTicketToken() {
    return (String) getValue("ticketToken");
  }
  /**
   * Reference to an asset (e.g., Barcode, QR code image or PDF) usable for entrance.
   */
  @JsonIgnore public Collection<String> getTicketTokens() {
    final Object current = myData.get("ticketToken");
    if (current == null) return Collections.emptyList();
    if (current instanceof Collection) {
      return (Collection<String>) current;
    }
    return Arrays.asList((String) current);
  }
  /**
   * The total price for the reservation or ticket, including applicable taxes, shipping, etc.\n\nUsage guidelines:\n\n* Use values from 0123456789 (Unicode 'DIGIT ZERO' (U+0030) to 'DIGIT NINE' (U+0039)) rather than superficially similiar Unicode symbols.\n* Use '.' (Unicode 'FULL STOP' (U+002E)) rather than ',' to indicate a decimal point. Avoid using these symbols as a readability separator.
   */
  @JsonIgnore public Number getTotalPriceNumber() {
    return (Number) getValue("totalPrice");
  }
  /**
   * The total price for the reservation or ticket, including applicable taxes, shipping, etc.\n\nUsage guidelines:\n\n* Use values from 0123456789 (Unicode 'DIGIT ZERO' (U+0030) to 'DIGIT NINE' (U+0039)) rather than superficially similiar Unicode symbols.\n* Use '.' (Unicode 'FULL STOP' (U+002E)) rather than ',' to indicate a decimal point. Avoid using these symbols as a readability separator.
   */
  @JsonIgnore public Collection<Number> getTotalPriceNumbers() {
    final Object current = myData.get("totalPrice");
    if (current == null) return Collections.emptyList();
    if (current instanceof Collection) {
      return (Collection<Number>) current;
    }
    return Arrays.asList((Number) current);
  }
  /**
   * The total price for the reservation or ticket, including applicable taxes, shipping, etc.\n\nUsage guidelines:\n\n* Use values from 0123456789 (Unicode 'DIGIT ZERO' (U+0030) to 'DIGIT NINE' (U+0039)) rather than superficially similiar Unicode symbols.\n* Use '.' (Unicode 'FULL STOP' (U+002E)) rather than ',' to indicate a decimal point. Avoid using these symbols as a readability separator.
   */
  @JsonIgnore public PriceSpecification getTotalPricePriceSpecification() {
    return (PriceSpecification) getValue("totalPrice");
  }
  /**
   * The total price for the reservation or ticket, including applicable taxes, shipping, etc.\n\nUsage guidelines:\n\n* Use values from 0123456789 (Unicode 'DIGIT ZERO' (U+0030) to 'DIGIT NINE' (U+0039)) rather than superficially similiar Unicode symbols.\n* Use '.' (Unicode 'FULL STOP' (U+002E)) rather than ',' to indicate a decimal point. Avoid using these symbols as a readability separator.
   */
  @JsonIgnore public Collection<PriceSpecification> getTotalPricePriceSpecifications() {
    final Object current = myData.get("totalPrice");
    if (current == null) return Collections.emptyList();
    if (current instanceof Collection) {
      return (Collection<PriceSpecification>) current;
    }
    return Arrays.asList((PriceSpecification) current);
  }
  /**
   * The total price for the reservation or ticket, including applicable taxes, shipping, etc.\n\nUsage guidelines:\n\n* Use values from 0123456789 (Unicode 'DIGIT ZERO' (U+0030) to 'DIGIT NINE' (U+0039)) rather than superficially similiar Unicode symbols.\n* Use '.' (Unicode 'FULL STOP' (U+002E)) rather than ',' to indicate a decimal point. Avoid using these symbols as a readability separator.
   */
  @JsonIgnore public String getTotalPriceString() {
    return (String) getValue("totalPrice");
  }
  /**
   * The total price for the reservation or ticket, including applicable taxes, shipping, etc.\n\nUsage guidelines:\n\n* Use values from 0123456789 (Unicode 'DIGIT ZERO' (U+0030) to 'DIGIT NINE' (U+0039)) rather than superficially similiar Unicode symbols.\n* Use '.' (Unicode 'FULL STOP' (U+002E)) rather than ',' to indicate a decimal point. Avoid using these symbols as a readability separator.
   */
  @JsonIgnore public Collection<String> getTotalPriceStrings() {
    final Object current = myData.get("totalPrice");
    if (current == null) return Collections.emptyList();
    if (current instanceof Collection) {
      return (Collection<String>) current;
    }
    return Arrays.asList((String) current);
  }
  /**
   * The date the ticket was issued.
   */
  @JsonIgnore public java.util.Date getDateIssued() {
    return (java.util.Date) getValue("dateIssued");
  }
  /**
   * The date the ticket was issued.
   */
  @JsonIgnore public Collection<java.util.Date> getDateIssueds() {
    final Object current = myData.get("dateIssued");
    if (current == null) return Collections.emptyList();
    if (current instanceof Collection) {
      return (Collection<java.util.Date>) current;
    }
    return Arrays.asList((java.util.Date) current);
  }
  /**
   * The seat associated with the ticket.
   */
  @JsonIgnore public Seat getTicketedSeat() {
    return (Seat) getValue("ticketedSeat");
  }
  /**
   * The seat associated with the ticket.
   */
  @JsonIgnore public Collection<Seat> getTicketedSeats() {
    final Object current = myData.get("ticketedSeat");
    if (current == null) return Collections.emptyList();
    if (current instanceof Collection) {
      return (Collection<Seat>) current;
    }
    return Arrays.asList((Seat) current);
  }
  /**
   * The currency of the price, or a price component when attached to [[PriceSpecification]] and its subtypes.\n\nUse standard formats: [ISO 4217 currency format](http://en.wikipedia.org/wiki/ISO_4217) e.g. &quot;USD&quot;; [Ticker symbol](https://en.wikipedia.org/wiki/List_of_cryptocurrencies) for cryptocurrencies e.g. &quot;BTC&quot;; well known names for [Local Exchange Tradings Systems](https://en.wikipedia.org/wiki/Local_exchange_trading_system) (LETS) and other currency types e.g. &quot;Ithaca HOUR&quot;.
   */
  @JsonIgnore public String getPriceCurrency() {
    return (String) getValue("priceCurrency");
  }
  /**
   * The currency of the price, or a price component when attached to [[PriceSpecification]] and its subtypes.\n\nUse standard formats: [ISO 4217 currency format](http://en.wikipedia.org/wiki/ISO_4217) e.g. &quot;USD&quot;; [Ticker symbol](https://en.wikipedia.org/wiki/List_of_cryptocurrencies) for cryptocurrencies e.g. &quot;BTC&quot;; well known names for [Local Exchange Tradings Systems](https://en.wikipedia.org/wiki/Local_exchange_trading_system) (LETS) and other currency types e.g. &quot;Ithaca HOUR&quot;.
   */
  @JsonIgnore public Collection<String> getPriceCurrencys() {
    final Object current = myData.get("priceCurrency");
    if (current == null) return Collections.emptyList();
    if (current instanceof Collection) {
      return (Collection<String>) current;
    }
    return Arrays.asList((String) current);
  }
  /**
   * The organization issuing the ticket or permit.
   */
  @JsonIgnore public Organization getIssuedBy() {
    return (Organization) getValue("issuedBy");
  }
  /**
   * The organization issuing the ticket or permit.
   */
  @JsonIgnore public Collection<Organization> getIssuedBys() {
    final Object current = myData.get("issuedBy");
    if (current == null) return Collections.emptyList();
    if (current instanceof Collection) {
      return (Collection<Organization>) current;
    }
    return Arrays.asList((Organization) current);
  }
  /**
   * The unique identifier for the ticket.
   */
  @JsonIgnore public String getTicketNumber() {
    return (String) getValue("ticketNumber");
  }
  /**
   * The unique identifier for the ticket.
   */
  @JsonIgnore public Collection<String> getTicketNumbers() {
    final Object current = myData.get("ticketNumber");
    if (current == null) return Collections.emptyList();
    if (current instanceof Collection) {
      return (Collection<String>) current;
    }
    return Arrays.asList((String) current);
  }
  protected Ticket(java.util.Map<String,Object> data) {
    super(data);
  }
  
  /**
   * Builder for {@link Ticket}
   */
  public static class Builder extends Intangible.Builder {
    public Builder(@NotNull HashMap<String,Object> data) {
      super(data);
    }
    @NotNull public Ticket build() {
      return new Ticket(myData);
    }
    /**
     * The person or organization the reservation or ticket is for.
     */
    @NotNull public Builder underName(@NotNull Organization organization) {
      putValue("underName", organization);
      return this;
    }
    /**
     * The person or organization the reservation or ticket is for.
     */
    @NotNull public Builder underName(@NotNull Organization.Builder organization) {
      putValue("underName", organization.build());
      return this;
    }
    /**
     * The person or organization the reservation or ticket is for.
     */
    @NotNull public Builder underName(@NotNull Person person) {
      putValue("underName", person);
      return this;
    }
    /**
     * The person or organization the reservation or ticket is for.
     */
    @NotNull public Builder underName(@NotNull Person.Builder person) {
      putValue("underName", person.build());
      return this;
    }
    /**
     * Reference to an asset (e.g., Barcode, QR code image or PDF) usable for entrance.
     */
    @NotNull public Builder ticketToken(@NotNull String ticketToken) {
      putValue("ticketToken", ticketToken);
      return this;
    }
    /**
     * The total price for the reservation or ticket, including applicable taxes, shipping, etc.\n\nUsage guidelines:\n\n* Use values from 0123456789 (Unicode 'DIGIT ZERO' (U+0030) to 'DIGIT NINE' (U+0039)) rather than superficially similiar Unicode symbols.\n* Use '.' (Unicode 'FULL STOP' (U+002E)) rather than ',' to indicate a decimal point. Avoid using these symbols as a readability separator.
     */
    @NotNull public Builder totalPrice(@NotNull Number number) {
      putValue("totalPrice", number);
      return this;
    }
    /**
     * The total price for the reservation or ticket, including applicable taxes, shipping, etc.\n\nUsage guidelines:\n\n* Use values from 0123456789 (Unicode 'DIGIT ZERO' (U+0030) to 'DIGIT NINE' (U+0039)) rather than superficially similiar Unicode symbols.\n* Use '.' (Unicode 'FULL STOP' (U+002E)) rather than ',' to indicate a decimal point. Avoid using these symbols as a readability separator.
     */
    @NotNull public Builder totalPrice(@NotNull PriceSpecification priceSpecification) {
      putValue("totalPrice", priceSpecification);
      return this;
    }
    /**
     * The total price for the reservation or ticket, including applicable taxes, shipping, etc.\n\nUsage guidelines:\n\n* Use values from 0123456789 (Unicode 'DIGIT ZERO' (U+0030) to 'DIGIT NINE' (U+0039)) rather than superficially similiar Unicode symbols.\n* Use '.' (Unicode 'FULL STOP' (U+002E)) rather than ',' to indicate a decimal point. Avoid using these symbols as a readability separator.
     */
    @NotNull public Builder totalPrice(@NotNull PriceSpecification.Builder priceSpecification) {
      putValue("totalPrice", priceSpecification.build());
      return this;
    }
    /**
     * The total price for the reservation or ticket, including applicable taxes, shipping, etc.\n\nUsage guidelines:\n\n* Use values from 0123456789 (Unicode 'DIGIT ZERO' (U+0030) to 'DIGIT NINE' (U+0039)) rather than superficially similiar Unicode symbols.\n* Use '.' (Unicode 'FULL STOP' (U+002E)) rather than ',' to indicate a decimal point. Avoid using these symbols as a readability separator.
     */
    @NotNull public Builder totalPrice(@NotNull String totalPrice) {
      putValue("totalPrice", totalPrice);
      return this;
    }
    /**
     * The date the ticket was issued.
     */
    @NotNull public Builder dateIssued(@NotNull java.util.Date date) {
      putValue("dateIssued", date);
      return this;
    }
    /**
     * The seat associated with the ticket.
     */
    @NotNull public Builder ticketedSeat(@NotNull Seat seat) {
      putValue("ticketedSeat", seat);
      return this;
    }
    /**
     * The seat associated with the ticket.
     */
    @NotNull public Builder ticketedSeat(@NotNull Seat.Builder seat) {
      putValue("ticketedSeat", seat.build());
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
     * The organization issuing the ticket or permit.
     */
    @NotNull public Builder issuedBy(@NotNull Organization organization) {
      putValue("issuedBy", organization);
      return this;
    }
    /**
     * The organization issuing the ticket or permit.
     */
    @NotNull public Builder issuedBy(@NotNull Organization.Builder organization) {
      putValue("issuedBy", organization.build());
      return this;
    }
    /**
     * The unique identifier for the ticket.
     */
    @NotNull public Builder ticketNumber(@NotNull String ticketNumber) {
      putValue("ticketNumber", ticketNumber);
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
      if ("underName".equals(key) && value instanceof Organization) { this.underName((Organization)value); return; }
      if ("underNames".equals(key) && value instanceof Organization) { this.underName((Organization)value); return; }
      if ("underName".equals(key) && value instanceof Person) { this.underName((Person)value); return; }
      if ("underNames".equals(key) && value instanceof Person) { this.underName((Person)value); return; }
      if ("ticketToken".equals(key) && value instanceof String) { this.ticketToken((String)value); return; }
      if ("ticketTokens".equals(key) && value instanceof String) { this.ticketToken((String)value); return; }
      if ("totalPrice".equals(key) && value instanceof Number) { this.totalPrice((Number)value); return; }
      if ("totalPrices".equals(key) && value instanceof Number) { this.totalPrice((Number)value); return; }
      if ("totalPrice".equals(key) && value instanceof PriceSpecification) { this.totalPrice((PriceSpecification)value); return; }
      if ("totalPrices".equals(key) && value instanceof PriceSpecification) { this.totalPrice((PriceSpecification)value); return; }
      if ("totalPrice".equals(key) && value instanceof String) { this.totalPrice((String)value); return; }
      if ("totalPrices".equals(key) && value instanceof String) { this.totalPrice((String)value); return; }
      if ("dateIssued".equals(key) && value instanceof java.util.Date) { this.dateIssued((java.util.Date)value); return; }
      if ("dateIssueds".equals(key) && value instanceof java.util.Date) { this.dateIssued((java.util.Date)value); return; }
      if ("ticketedSeat".equals(key) && value instanceof Seat) { this.ticketedSeat((Seat)value); return; }
      if ("ticketedSeats".equals(key) && value instanceof Seat) { this.ticketedSeat((Seat)value); return; }
      if ("priceCurrency".equals(key) && value instanceof String) { this.priceCurrency((String)value); return; }
      if ("priceCurrencys".equals(key) && value instanceof String) { this.priceCurrency((String)value); return; }
      if ("issuedBy".equals(key) && value instanceof Organization) { this.issuedBy((Organization)value); return; }
      if ("issuedBys".equals(key) && value instanceof Organization) { this.issuedBy((Organization)value); return; }
      if ("ticketNumber".equals(key) && value instanceof String) { this.ticketNumber((String)value); return; }
      if ("ticketNumbers".equals(key) && value instanceof String) { this.ticketNumber((String)value); return; }
      super.fromMap(key, value);
    }
  }
  
}
