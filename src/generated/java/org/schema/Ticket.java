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
 * Used to describe a ticket to an event, a flight, a bus ride, etc.
 */
public class Ticket extends Intangible {
  /**
   * The person or organization the reservation or ticket is for.
   * @return underName property set by first invocation of underName method or {@code null}.
   */
  @JsonIgnore public Organization getUnderNameOrganization() {
    return (Organization) getValue("underName");
  }
  /**
   * The person or organization the reservation or ticket is for.
   * @return all underName properties as {@link java.util.Collection} or an empty collection 
   * if underName was not set.
   */
  @JsonIgnore public java.util.Collection<Organization> getUnderNameOrganizations() {
    final java.lang.Object current = myData.get("underName");
    if (current == null) return Collections.emptyList();
    if (current instanceof java.util.Collection) {
      return (java.util.Collection<Organization>) current;
    }
    return Arrays.asList((Organization) current);
  }
  /**
   * The person or organization the reservation or ticket is for.
   * @return underName property set by first invocation of underName method or {@code null}.
   */
  @JsonIgnore public Person getUnderNamePerson() {
    return (Person) getValue("underName");
  }
  /**
   * The person or organization the reservation or ticket is for.
   * @return all underName properties as {@link java.util.Collection} or an empty collection 
   * if underName was not set.
   */
  @JsonIgnore public java.util.Collection<Person> getUnderNamePersons() {
    final java.lang.Object current = myData.get("underName");
    if (current == null) return Collections.emptyList();
    if (current instanceof java.util.Collection) {
      return (java.util.Collection<Person>) current;
    }
    return Arrays.asList((Person) current);
  }
  /**
   * Reference to an asset (e.g., Barcode, QR code image or PDF) usable for entrance.
   * @return ticketToken property set by first invocation of ticketToken method or {@code null}.
   */
  @JsonIgnore public String getTicketToken() {
    return (String) getValue("ticketToken");
  }
  /**
   * Reference to an asset (e.g., Barcode, QR code image or PDF) usable for entrance.
   * @return all ticketToken properties as {@link java.util.Collection} or an empty collection 
   * if ticketToken was not set.
   */
  @JsonIgnore public java.util.Collection<String> getTicketTokens() {
    final java.lang.Object current = myData.get("ticketToken");
    if (current == null) return Collections.emptyList();
    if (current instanceof java.util.Collection) {
      return (java.util.Collection<String>) current;
    }
    return Arrays.asList((String) current);
  }
  /**
   * The total price for the reservation or ticket, including applicable taxes, shipping, etc.\n\nUsage guidelines:\n\n* Use values from 0123456789 (Unicode 'DIGIT ZERO' (U+0030) to 'DIGIT NINE' (U+0039)) rather than superficially similiar Unicode symbols.\n* Use '.' (Unicode 'FULL STOP' (U+002E)) rather than ',' to indicate a decimal point. Avoid using these symbols as a readability separator.
   * @return totalPrice property set by first invocation of totalPrice method or {@code null}.
   */
  @JsonIgnore public Number getTotalPriceNumber() {
    return (Number) getValue("totalPrice");
  }
  /**
   * The total price for the reservation or ticket, including applicable taxes, shipping, etc.\n\nUsage guidelines:\n\n* Use values from 0123456789 (Unicode 'DIGIT ZERO' (U+0030) to 'DIGIT NINE' (U+0039)) rather than superficially similiar Unicode symbols.\n* Use '.' (Unicode 'FULL STOP' (U+002E)) rather than ',' to indicate a decimal point. Avoid using these symbols as a readability separator.
   * @return all totalPrice properties as {@link java.util.Collection} or an empty collection 
   * if totalPrice was not set.
   */
  @JsonIgnore public java.util.Collection<Number> getTotalPriceNumbers() {
    final java.lang.Object current = myData.get("totalPrice");
    if (current == null) return Collections.emptyList();
    if (current instanceof java.util.Collection) {
      return (java.util.Collection<Number>) current;
    }
    return Arrays.asList((Number) current);
  }
  /**
   * The total price for the reservation or ticket, including applicable taxes, shipping, etc.\n\nUsage guidelines:\n\n* Use values from 0123456789 (Unicode 'DIGIT ZERO' (U+0030) to 'DIGIT NINE' (U+0039)) rather than superficially similiar Unicode symbols.\n* Use '.' (Unicode 'FULL STOP' (U+002E)) rather than ',' to indicate a decimal point. Avoid using these symbols as a readability separator.
   * @return totalPrice property set by first invocation of totalPrice method or {@code null}.
   */
  @JsonIgnore public PriceSpecification getTotalPricePriceSpecification() {
    return (PriceSpecification) getValue("totalPrice");
  }
  /**
   * The total price for the reservation or ticket, including applicable taxes, shipping, etc.\n\nUsage guidelines:\n\n* Use values from 0123456789 (Unicode 'DIGIT ZERO' (U+0030) to 'DIGIT NINE' (U+0039)) rather than superficially similiar Unicode symbols.\n* Use '.' (Unicode 'FULL STOP' (U+002E)) rather than ',' to indicate a decimal point. Avoid using these symbols as a readability separator.
   * @return all totalPrice properties as {@link java.util.Collection} or an empty collection 
   * if totalPrice was not set.
   */
  @JsonIgnore public java.util.Collection<PriceSpecification> getTotalPricePriceSpecifications() {
    final java.lang.Object current = myData.get("totalPrice");
    if (current == null) return Collections.emptyList();
    if (current instanceof java.util.Collection) {
      return (java.util.Collection<PriceSpecification>) current;
    }
    return Arrays.asList((PriceSpecification) current);
  }
  /**
   * The total price for the reservation or ticket, including applicable taxes, shipping, etc.\n\nUsage guidelines:\n\n* Use values from 0123456789 (Unicode 'DIGIT ZERO' (U+0030) to 'DIGIT NINE' (U+0039)) rather than superficially similiar Unicode symbols.\n* Use '.' (Unicode 'FULL STOP' (U+002E)) rather than ',' to indicate a decimal point. Avoid using these symbols as a readability separator.
   * @return totalPrice property set by first invocation of totalPrice method or {@code null}.
   */
  @JsonIgnore public String getTotalPriceString() {
    return (String) getValue("totalPrice");
  }
  /**
   * The total price for the reservation or ticket, including applicable taxes, shipping, etc.\n\nUsage guidelines:\n\n* Use values from 0123456789 (Unicode 'DIGIT ZERO' (U+0030) to 'DIGIT NINE' (U+0039)) rather than superficially similiar Unicode symbols.\n* Use '.' (Unicode 'FULL STOP' (U+002E)) rather than ',' to indicate a decimal point. Avoid using these symbols as a readability separator.
   * @return all totalPrice properties as {@link java.util.Collection} or an empty collection 
   * if totalPrice was not set.
   */
  @JsonIgnore public java.util.Collection<String> getTotalPriceStrings() {
    final java.lang.Object current = myData.get("totalPrice");
    if (current == null) return Collections.emptyList();
    if (current instanceof java.util.Collection) {
      return (java.util.Collection<String>) current;
    }
    return Arrays.asList((String) current);
  }
  /**
   * The date the ticket was issued.
   * @return dateIssued property set by first invocation of dateIssued method or {@code null}.
   */
  @JsonIgnore public java.util.Date getDateIssued() {
    return (java.util.Date) getValue("dateIssued");
  }
  /**
   * The date the ticket was issued.
   * @return all dateIssued properties as {@link java.util.Collection} or an empty collection 
   * if dateIssued was not set.
   */
  @JsonIgnore public java.util.Collection<java.util.Date> getDateIssueds() {
    final java.lang.Object current = myData.get("dateIssued");
    if (current == null) return Collections.emptyList();
    if (current instanceof java.util.Collection) {
      return (java.util.Collection<java.util.Date>) current;
    }
    return Arrays.asList((java.util.Date) current);
  }
  /**
   * The seat associated with the ticket.
   * @return ticketedSeat property set by first invocation of ticketedSeat method or {@code null}.
   */
  @JsonIgnore public Seat getTicketedSeat() {
    return (Seat) getValue("ticketedSeat");
  }
  /**
   * The seat associated with the ticket.
   * @return all ticketedSeat properties as {@link java.util.Collection} or an empty collection 
   * if ticketedSeat was not set.
   */
  @JsonIgnore public java.util.Collection<Seat> getTicketedSeats() {
    final java.lang.Object current = myData.get("ticketedSeat");
    if (current == null) return Collections.emptyList();
    if (current instanceof java.util.Collection) {
      return (java.util.Collection<Seat>) current;
    }
    return Arrays.asList((Seat) current);
  }
  /**
   * The currency of the price, or a price component when attached to [[PriceSpecification]] and its subtypes.\n\nUse standard formats: [ISO 4217 currency format](http://en.wikipedia.org/wiki/ISO_4217) e.g. &quot;USD&quot;; [Ticker symbol](https://en.wikipedia.org/wiki/List_of_cryptocurrencies) for cryptocurrencies e.g. &quot;BTC&quot;; well known names for [Local Exchange Tradings Systems](https://en.wikipedia.org/wiki/Local_exchange_trading_system) (LETS) and other currency types e.g. &quot;Ithaca HOUR&quot;.
   * @return priceCurrency property set by first invocation of priceCurrency method or {@code null}.
   */
  @JsonIgnore public String getPriceCurrency() {
    return (String) getValue("priceCurrency");
  }
  /**
   * The currency of the price, or a price component when attached to [[PriceSpecification]] and its subtypes.\n\nUse standard formats: [ISO 4217 currency format](http://en.wikipedia.org/wiki/ISO_4217) e.g. &quot;USD&quot;; [Ticker symbol](https://en.wikipedia.org/wiki/List_of_cryptocurrencies) for cryptocurrencies e.g. &quot;BTC&quot;; well known names for [Local Exchange Tradings Systems](https://en.wikipedia.org/wiki/Local_exchange_trading_system) (LETS) and other currency types e.g. &quot;Ithaca HOUR&quot;.
   * @return all priceCurrency properties as {@link java.util.Collection} or an empty collection 
   * if priceCurrency was not set.
   */
  @JsonIgnore public java.util.Collection<String> getPriceCurrencys() {
    final java.lang.Object current = myData.get("priceCurrency");
    if (current == null) return Collections.emptyList();
    if (current instanceof java.util.Collection) {
      return (java.util.Collection<String>) current;
    }
    return Arrays.asList((String) current);
  }
  /**
   * The organization issuing the ticket or permit.
   * @return issuedBy property set by first invocation of issuedBy method or {@code null}.
   */
  @JsonIgnore public Organization getIssuedBy() {
    return (Organization) getValue("issuedBy");
  }
  /**
   * The organization issuing the ticket or permit.
   * @return all issuedBy properties as {@link java.util.Collection} or an empty collection 
   * if issuedBy was not set.
   */
  @JsonIgnore public java.util.Collection<Organization> getIssuedBys() {
    final java.lang.Object current = myData.get("issuedBy");
    if (current == null) return Collections.emptyList();
    if (current instanceof java.util.Collection) {
      return (java.util.Collection<Organization>) current;
    }
    return Arrays.asList((Organization) current);
  }
  /**
   * The unique identifier for the ticket.
   * @return ticketNumber property set by first invocation of ticketNumber method or {@code null}.
   */
  @JsonIgnore public String getTicketNumber() {
    return (String) getValue("ticketNumber");
  }
  /**
   * The unique identifier for the ticket.
   * @return all ticketNumber properties as {@link java.util.Collection} or an empty collection 
   * if ticketNumber was not set.
   */
  @JsonIgnore public java.util.Collection<String> getTicketNumbers() {
    final java.lang.Object current = myData.get("ticketNumber");
    if (current == null) return Collections.emptyList();
    if (current instanceof java.util.Collection) {
      return (java.util.Collection<String>) current;
    }
    return Arrays.asList((String) current);
  }
  protected Ticket(java.util.Map<String,java.lang.Object> data) {
    super(data);
  }
  /**
   * @return new {@link Builder} initialized with this instance's data
   */
  @NotNull public Builder toBuilder() {
    return new Builder(new HashMap<>(this.myData));
  }
  
  /**
   * Builder for {@link Ticket}
   */
  public static class Builder extends Intangible.Builder {
    public Builder(@NotNull HashMap<String,java.lang.Object> data) {
      super(data);
    }
    @NotNull public Ticket build() {
      return new Ticket(myData);
    }
    /**
     * The person or organization the reservation or ticket is for.
     * @param organization value to set
     * @return this builder instance
     */
    @NotNull public Builder underName(@NotNull Organization organization) {
      putValue("underName", organization);
      return this;
    }
    /**
     * The person or organization the reservation or ticket is for.
     * @param organization value to set
     * @return this builder instance
     */
    @NotNull public Builder underName(@NotNull Organization.Builder organization) {
      putValue("underName", organization.build());
      return this;
    }
    /**
     * The person or organization the reservation or ticket is for.
     * @param person value to set
     * @return this builder instance
     */
    @NotNull public Builder underName(@NotNull Person person) {
      putValue("underName", person);
      return this;
    }
    /**
     * The person or organization the reservation or ticket is for.
     * @param person value to set
     * @return this builder instance
     */
    @NotNull public Builder underName(@NotNull Person.Builder person) {
      putValue("underName", person.build());
      return this;
    }
    /**
     * Remove underName property from the builder.
     * If this property is repeatable, all instances are removed.
     * @return this builder instance
     */
    @NotNull public Builder removeUnderName() {
      removeValue("underName");
      return this;
    }
    /**
     * Get currently set value for underName property in this builder.
     * @return previously set value or {@code null}. If multiple values have been 
     * set to this property, then {@link java.util.Collection} instance will be 
     * returned.
     */
    @Nullable public java.lang.Object getUnderName() {
      return myData.get("underName");
    }
    /**
     * Reference to an asset (e.g., Barcode, QR code image or PDF) usable for entrance.
     * @param ticketToken value to set
     * @return this builder instance
     */
    @NotNull public Builder ticketToken(@NotNull String ticketToken) {
      putValue("ticketToken", ticketToken);
      return this;
    }
    /**
     * Remove ticketToken property from the builder.
     * If this property is repeatable, all instances are removed.
     * @return this builder instance
     */
    @NotNull public Builder removeTicketToken() {
      removeValue("ticketToken");
      return this;
    }
    /**
     * Get currently set value for ticketToken property in this builder.
     * @return previously set value or {@code null}. If multiple values have been 
     * set to this property, then {@link java.util.Collection} instance will be 
     * returned.
     */
    @Nullable public java.lang.Object getTicketToken() {
      return myData.get("ticketToken");
    }
    /**
     * The total price for the reservation or ticket, including applicable taxes, shipping, etc.\n\nUsage guidelines:\n\n* Use values from 0123456789 (Unicode 'DIGIT ZERO' (U+0030) to 'DIGIT NINE' (U+0039)) rather than superficially similiar Unicode symbols.\n* Use '.' (Unicode 'FULL STOP' (U+002E)) rather than ',' to indicate a decimal point. Avoid using these symbols as a readability separator.
     * @param number value to set
     * @return this builder instance
     */
    @NotNull public Builder totalPrice(@NotNull Number number) {
      putValue("totalPrice", number);
      return this;
    }
    /**
     * The total price for the reservation or ticket, including applicable taxes, shipping, etc.\n\nUsage guidelines:\n\n* Use values from 0123456789 (Unicode 'DIGIT ZERO' (U+0030) to 'DIGIT NINE' (U+0039)) rather than superficially similiar Unicode symbols.\n* Use '.' (Unicode 'FULL STOP' (U+002E)) rather than ',' to indicate a decimal point. Avoid using these symbols as a readability separator.
     * @param priceSpecification value to set
     * @return this builder instance
     */
    @NotNull public Builder totalPrice(@NotNull PriceSpecification priceSpecification) {
      putValue("totalPrice", priceSpecification);
      return this;
    }
    /**
     * The total price for the reservation or ticket, including applicable taxes, shipping, etc.\n\nUsage guidelines:\n\n* Use values from 0123456789 (Unicode 'DIGIT ZERO' (U+0030) to 'DIGIT NINE' (U+0039)) rather than superficially similiar Unicode symbols.\n* Use '.' (Unicode 'FULL STOP' (U+002E)) rather than ',' to indicate a decimal point. Avoid using these symbols as a readability separator.
     * @param priceSpecification value to set
     * @return this builder instance
     */
    @NotNull public Builder totalPrice(@NotNull PriceSpecification.Builder priceSpecification) {
      putValue("totalPrice", priceSpecification.build());
      return this;
    }
    /**
     * The total price for the reservation or ticket, including applicable taxes, shipping, etc.\n\nUsage guidelines:\n\n* Use values from 0123456789 (Unicode 'DIGIT ZERO' (U+0030) to 'DIGIT NINE' (U+0039)) rather than superficially similiar Unicode symbols.\n* Use '.' (Unicode 'FULL STOP' (U+002E)) rather than ',' to indicate a decimal point. Avoid using these symbols as a readability separator.
     * @param totalPrice value to set
     * @return this builder instance
     */
    @NotNull public Builder totalPrice(@NotNull String totalPrice) {
      putValue("totalPrice", totalPrice);
      return this;
    }
    /**
     * Remove totalPrice property from the builder.
     * If this property is repeatable, all instances are removed.
     * @return this builder instance
     */
    @NotNull public Builder removeTotalPrice() {
      removeValue("totalPrice");
      return this;
    }
    /**
     * Get currently set value for totalPrice property in this builder.
     * @return previously set value or {@code null}. If multiple values have been 
     * set to this property, then {@link java.util.Collection} instance will be 
     * returned.
     */
    @Nullable public java.lang.Object getTotalPrice() {
      return myData.get("totalPrice");
    }
    /**
     * The date the ticket was issued.
     * @param date value to set
     * @return this builder instance
     */
    @NotNull public Builder dateIssued(@NotNull java.util.Date date) {
      putValue("dateIssued", date);
      return this;
    }
    /**
     * Remove dateIssued property from the builder.
     * If this property is repeatable, all instances are removed.
     * @return this builder instance
     */
    @NotNull public Builder removeDateIssued() {
      removeValue("dateIssued");
      return this;
    }
    /**
     * Get currently set value for dateIssued property in this builder.
     * @return previously set value or {@code null}. If multiple values have been 
     * set to this property, then {@link java.util.Collection} instance will be 
     * returned.
     */
    @Nullable public java.lang.Object getDateIssued() {
      return myData.get("dateIssued");
    }
    /**
     * The seat associated with the ticket.
     * @param seat value to set
     * @return this builder instance
     */
    @NotNull public Builder ticketedSeat(@NotNull Seat seat) {
      putValue("ticketedSeat", seat);
      return this;
    }
    /**
     * The seat associated with the ticket.
     * @param seat value to set
     * @return this builder instance
     */
    @NotNull public Builder ticketedSeat(@NotNull Seat.Builder seat) {
      putValue("ticketedSeat", seat.build());
      return this;
    }
    /**
     * Remove ticketedSeat property from the builder.
     * If this property is repeatable, all instances are removed.
     * @return this builder instance
     */
    @NotNull public Builder removeTicketedSeat() {
      removeValue("ticketedSeat");
      return this;
    }
    /**
     * Get currently set value for ticketedSeat property in this builder.
     * @return previously set value or {@code null}. If multiple values have been 
     * set to this property, then {@link java.util.Collection} instance will be 
     * returned.
     */
    @Nullable public java.lang.Object getTicketedSeat() {
      return myData.get("ticketedSeat");
    }
    /**
     * The currency of the price, or a price component when attached to [[PriceSpecification]] and its subtypes.\n\nUse standard formats: [ISO 4217 currency format](http://en.wikipedia.org/wiki/ISO_4217) e.g. &quot;USD&quot;; [Ticker symbol](https://en.wikipedia.org/wiki/List_of_cryptocurrencies) for cryptocurrencies e.g. &quot;BTC&quot;; well known names for [Local Exchange Tradings Systems](https://en.wikipedia.org/wiki/Local_exchange_trading_system) (LETS) and other currency types e.g. &quot;Ithaca HOUR&quot;.
     * @param priceCurrency value to set
     * @return this builder instance
     */
    @NotNull public Builder priceCurrency(@NotNull String priceCurrency) {
      putValue("priceCurrency", priceCurrency);
      return this;
    }
    /**
     * Remove priceCurrency property from the builder.
     * If this property is repeatable, all instances are removed.
     * @return this builder instance
     */
    @NotNull public Builder removePriceCurrency() {
      removeValue("priceCurrency");
      return this;
    }
    /**
     * Get currently set value for priceCurrency property in this builder.
     * @return previously set value or {@code null}. If multiple values have been 
     * set to this property, then {@link java.util.Collection} instance will be 
     * returned.
     */
    @Nullable public java.lang.Object getPriceCurrency() {
      return myData.get("priceCurrency");
    }
    /**
     * The organization issuing the ticket or permit.
     * @param organization value to set
     * @return this builder instance
     */
    @NotNull public Builder issuedBy(@NotNull Organization organization) {
      putValue("issuedBy", organization);
      return this;
    }
    /**
     * The organization issuing the ticket or permit.
     * @param organization value to set
     * @return this builder instance
     */
    @NotNull public Builder issuedBy(@NotNull Organization.Builder organization) {
      putValue("issuedBy", organization.build());
      return this;
    }
    /**
     * Remove issuedBy property from the builder.
     * If this property is repeatable, all instances are removed.
     * @return this builder instance
     */
    @NotNull public Builder removeIssuedBy() {
      removeValue("issuedBy");
      return this;
    }
    /**
     * Get currently set value for issuedBy property in this builder.
     * @return previously set value or {@code null}. If multiple values have been 
     * set to this property, then {@link java.util.Collection} instance will be 
     * returned.
     */
    @Nullable public java.lang.Object getIssuedBy() {
      return myData.get("issuedBy");
    }
    /**
     * The unique identifier for the ticket.
     * @param ticketNumber value to set
     * @return this builder instance
     */
    @NotNull public Builder ticketNumber(@NotNull String ticketNumber) {
      putValue("ticketNumber", ticketNumber);
      return this;
    }
    /**
     * Remove ticketNumber property from the builder.
     * If this property is repeatable, all instances are removed.
     * @return this builder instance
     */
    @NotNull public Builder removeTicketNumber() {
      removeValue("ticketNumber");
      return this;
    }
    /**
     * Get currently set value for ticketNumber property in this builder.
     * @return previously set value or {@code null}. If multiple values have been 
     * set to this property, then {@link java.util.Collection} instance will be 
     * returned.
     */
    @Nullable public java.lang.Object getTicketNumber() {
      return myData.get("ticketNumber");
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
