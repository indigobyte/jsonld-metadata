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
 * Describes a reservation for travel, dining or an event. Some reservations require tickets. &lt;br/&gt;&lt;br/&gt;
 * 
 * Note: This type is for information about actual reservations, e.g. in confirmation emails or HTML pages with individual confirmations of reservations. For offers of tickets, restaurant reservations, flights, or rental cars, use &lt;a class=&quot;localLink&quot; href=&quot;http://schema.org/Offer&quot;&gt;Offer&lt;/a&gt;.
 */
public class Reservation extends Intangible {
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
   * The date and time the reservation was modified.
   */
  @JsonIgnore public java.util.Date getModifiedTime() {
    return (java.util.Date) getValue("modifiedTime");
  }
  /**
   * The date and time the reservation was modified.
   */
  @JsonIgnore public Collection<java.util.Date> getModifiedTimes() {
    final Object current = myData.get("modifiedTime");
    if (current == null) return Collections.emptyList();
    if (current instanceof Collection) {
      return (Collection<java.util.Date>) current;
    }
    return Arrays.asList((java.util.Date) current);
  }
  /**
   * Any membership in a frequent flyer, hotel loyalty program, etc. being applied to the reservation.
   */
  @JsonIgnore public ProgramMembership getProgramMembershipUsed() {
    return (ProgramMembership) getValue("programMembershipUsed");
  }
  /**
   * Any membership in a frequent flyer, hotel loyalty program, etc. being applied to the reservation.
   */
  @JsonIgnore public Collection<ProgramMembership> getProgramMembershipUseds() {
    final Object current = myData.get("programMembershipUsed");
    if (current == null) return Collections.emptyList();
    if (current instanceof Collection) {
      return (Collection<ProgramMembership>) current;
    }
    return Arrays.asList((ProgramMembership) current);
  }
  /**
   * The currency of the price, or a price component when attached to &lt;a class=&quot;localLink&quot; href=&quot;http://schema.org/PriceSpecification&quot;&gt;PriceSpecification&lt;/a&gt; and its subtypes.&lt;br/&gt;&lt;br/&gt;
   * 
   * Use standard formats: &lt;a href=&quot;http://en.wikipedia.org/wiki/ISO_4217&quot;&gt;ISO 4217 currency format&lt;/a&gt; e.g. &quot;USD&quot;; &lt;a href=&quot;https://en.wikipedia.org/wiki/List_of_cryptocurrencies&quot;&gt;Ticker symbol&lt;/a&gt; for cryptocurrencies e.g. &quot;BTC&quot;; well known names for &lt;a href=&quot;https://en.wikipedia.org/wiki/Local_exchange_trading_system&quot;&gt;Local Exchange Tradings Systems&lt;/a&gt; (LETS) and other currency types e.g. &quot;Ithaca HOUR&quot;.
   */
  @JsonIgnore public String getPriceCurrency() {
    return (String) getValue("priceCurrency");
  }
  /**
   * The currency of the price, or a price component when attached to &lt;a class=&quot;localLink&quot; href=&quot;http://schema.org/PriceSpecification&quot;&gt;PriceSpecification&lt;/a&gt; and its subtypes.&lt;br/&gt;&lt;br/&gt;
   * 
   * Use standard formats: &lt;a href=&quot;http://en.wikipedia.org/wiki/ISO_4217&quot;&gt;ISO 4217 currency format&lt;/a&gt; e.g. &quot;USD&quot;; &lt;a href=&quot;https://en.wikipedia.org/wiki/List_of_cryptocurrencies&quot;&gt;Ticker symbol&lt;/a&gt; for cryptocurrencies e.g. &quot;BTC&quot;; well known names for &lt;a href=&quot;https://en.wikipedia.org/wiki/Local_exchange_trading_system&quot;&gt;Local Exchange Tradings Systems&lt;/a&gt; (LETS) and other currency types e.g. &quot;Ithaca HOUR&quot;.
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
   * The service provider, service operator, or service performer; the goods producer. Another party (a seller) may offer those services or goods on behalf of the provider. A provider may also serve as the seller.
   */
  @JsonIgnore public Organization getProviderOrganization() {
    return (Organization) getValue("provider");
  }
  /**
   * The service provider, service operator, or service performer; the goods producer. Another party (a seller) may offer those services or goods on behalf of the provider. A provider may also serve as the seller.
   */
  @JsonIgnore public Collection<Organization> getProviderOrganizations() {
    final Object current = myData.get("provider");
    if (current == null) return Collections.emptyList();
    if (current instanceof Collection) {
      return (Collection<Organization>) current;
    }
    return Arrays.asList((Organization) current);
  }
  /**
   * The service provider, service operator, or service performer; the goods producer. Another party (a seller) may offer those services or goods on behalf of the provider. A provider may also serve as the seller.
   */
  @JsonIgnore public Person getProviderPerson() {
    return (Person) getValue("provider");
  }
  /**
   * The service provider, service operator, or service performer; the goods producer. Another party (a seller) may offer those services or goods on behalf of the provider. A provider may also serve as the seller.
   */
  @JsonIgnore public Collection<Person> getProviderPersons() {
    final Object current = myData.get("provider");
    if (current == null) return Collections.emptyList();
    if (current instanceof Collection) {
      return (Collection<Person>) current;
    }
    return Arrays.asList((Person) current);
  }
  /**
   * A ticket associated with the reservation.
   */
  @JsonIgnore public Ticket getReservedTicket() {
    return (Ticket) getValue("reservedTicket");
  }
  /**
   * A ticket associated with the reservation.
   */
  @JsonIgnore public Collection<Ticket> getReservedTickets() {
    final Object current = myData.get("reservedTicket");
    if (current == null) return Collections.emptyList();
    if (current instanceof Collection) {
      return (Collection<Ticket>) current;
    }
    return Arrays.asList((Ticket) current);
  }
  /**
   * The total price for the reservation or ticket, including applicable taxes, shipping, etc.&lt;br/&gt;&lt;br/&gt;
   * 
   * Usage guidelines:&lt;br/&gt;&lt;br/&gt;
   * 
   * &lt;ul&gt;
   * &lt;li&gt;Use values from 0123456789 (Unicode 'DIGIT ZERO' (U+0030) to 'DIGIT NINE' (U+0039)) rather than superficially similiar Unicode symbols.&lt;/li&gt;
   * &lt;li&gt;Use '.' (Unicode 'FULL STOP' (U+002E)) rather than ',' to indicate a decimal point. Avoid using these symbols as a readability separator.&lt;/li&gt;
   * &lt;/ul&gt;
   * 
   */
  @JsonIgnore public Number getTotalPriceNumber() {
    return (Number) getValue("totalPrice");
  }
  /**
   * The total price for the reservation or ticket, including applicable taxes, shipping, etc.&lt;br/&gt;&lt;br/&gt;
   * 
   * Usage guidelines:&lt;br/&gt;&lt;br/&gt;
   * 
   * &lt;ul&gt;
   * &lt;li&gt;Use values from 0123456789 (Unicode 'DIGIT ZERO' (U+0030) to 'DIGIT NINE' (U+0039)) rather than superficially similiar Unicode symbols.&lt;/li&gt;
   * &lt;li&gt;Use '.' (Unicode 'FULL STOP' (U+002E)) rather than ',' to indicate a decimal point. Avoid using these symbols as a readability separator.&lt;/li&gt;
   * &lt;/ul&gt;
   * 
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
   * The total price for the reservation or ticket, including applicable taxes, shipping, etc.&lt;br/&gt;&lt;br/&gt;
   * 
   * Usage guidelines:&lt;br/&gt;&lt;br/&gt;
   * 
   * &lt;ul&gt;
   * &lt;li&gt;Use values from 0123456789 (Unicode 'DIGIT ZERO' (U+0030) to 'DIGIT NINE' (U+0039)) rather than superficially similiar Unicode symbols.&lt;/li&gt;
   * &lt;li&gt;Use '.' (Unicode 'FULL STOP' (U+002E)) rather than ',' to indicate a decimal point. Avoid using these symbols as a readability separator.&lt;/li&gt;
   * &lt;/ul&gt;
   * 
   */
  @JsonIgnore public PriceSpecification getTotalPricePriceSpecification() {
    return (PriceSpecification) getValue("totalPrice");
  }
  /**
   * The total price for the reservation or ticket, including applicable taxes, shipping, etc.&lt;br/&gt;&lt;br/&gt;
   * 
   * Usage guidelines:&lt;br/&gt;&lt;br/&gt;
   * 
   * &lt;ul&gt;
   * &lt;li&gt;Use values from 0123456789 (Unicode 'DIGIT ZERO' (U+0030) to 'DIGIT NINE' (U+0039)) rather than superficially similiar Unicode symbols.&lt;/li&gt;
   * &lt;li&gt;Use '.' (Unicode 'FULL STOP' (U+002E)) rather than ',' to indicate a decimal point. Avoid using these symbols as a readability separator.&lt;/li&gt;
   * &lt;/ul&gt;
   * 
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
   * The total price for the reservation or ticket, including applicable taxes, shipping, etc.&lt;br/&gt;&lt;br/&gt;
   * 
   * Usage guidelines:&lt;br/&gt;&lt;br/&gt;
   * 
   * &lt;ul&gt;
   * &lt;li&gt;Use values from 0123456789 (Unicode 'DIGIT ZERO' (U+0030) to 'DIGIT NINE' (U+0039)) rather than superficially similiar Unicode symbols.&lt;/li&gt;
   * &lt;li&gt;Use '.' (Unicode 'FULL STOP' (U+002E)) rather than ',' to indicate a decimal point. Avoid using these symbols as a readability separator.&lt;/li&gt;
   * &lt;/ul&gt;
   * 
   */
  @JsonIgnore public String getTotalPriceString() {
    return (String) getValue("totalPrice");
  }
  /**
   * The total price for the reservation or ticket, including applicable taxes, shipping, etc.&lt;br/&gt;&lt;br/&gt;
   * 
   * Usage guidelines:&lt;br/&gt;&lt;br/&gt;
   * 
   * &lt;ul&gt;
   * &lt;li&gt;Use values from 0123456789 (Unicode 'DIGIT ZERO' (U+0030) to 'DIGIT NINE' (U+0039)) rather than superficially similiar Unicode symbols.&lt;/li&gt;
   * &lt;li&gt;Use '.' (Unicode 'FULL STOP' (U+002E)) rather than ',' to indicate a decimal point. Avoid using these symbols as a readability separator.&lt;/li&gt;
   * &lt;/ul&gt;
   * 
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
   * The date and time the reservation was booked.
   */
  @JsonIgnore public java.util.Date getBookingTime() {
    return (java.util.Date) getValue("bookingTime");
  }
  /**
   * The date and time the reservation was booked.
   */
  @JsonIgnore public Collection<java.util.Date> getBookingTimes() {
    final Object current = myData.get("bookingTime");
    if (current == null) return Collections.emptyList();
    if (current instanceof Collection) {
      return (Collection<java.util.Date>) current;
    }
    return Arrays.asList((java.util.Date) current);
  }
  /**
   * A unique identifier for the reservation.
   */
  @JsonIgnore public String getReservationId() {
    return (String) getValue("reservationId");
  }
  /**
   * A unique identifier for the reservation.
   */
  @JsonIgnore public Collection<String> getReservationIds() {
    final Object current = myData.get("reservationId");
    if (current == null) return Collections.emptyList();
    if (current instanceof Collection) {
      return (Collection<String>) current;
    }
    return Arrays.asList((String) current);
  }
  /**
   * The thing -- flight, event, restaurant,etc. being reserved.
   */
  @JsonIgnore public Thing getReservationFor() {
    return (Thing) getValue("reservationFor");
  }
  /**
   * The thing -- flight, event, restaurant,etc. being reserved.
   */
  @JsonIgnore public Collection<Thing> getReservationFors() {
    final Object current = myData.get("reservationFor");
    if (current == null) return Collections.emptyList();
    if (current instanceof Collection) {
      return (Collection<Thing>) current;
    }
    return Arrays.asList((Thing) current);
  }
  /**
   * An entity that arranges for an exchange between a buyer and a seller.  In most cases a broker never acquires or releases ownership of a product or service involved in an exchange.  If it is not clear whether an entity is a broker, seller, or buyer, the latter two terms are preferred.
   */
  @JsonIgnore public Organization getBrokerOrganization() {
    return (Organization) getValue("broker");
  }
  /**
   * An entity that arranges for an exchange between a buyer and a seller.  In most cases a broker never acquires or releases ownership of a product or service involved in an exchange.  If it is not clear whether an entity is a broker, seller, or buyer, the latter two terms are preferred.
   */
  @JsonIgnore public Collection<Organization> getBrokerOrganizations() {
    final Object current = myData.get("broker");
    if (current == null) return Collections.emptyList();
    if (current instanceof Collection) {
      return (Collection<Organization>) current;
    }
    return Arrays.asList((Organization) current);
  }
  /**
   * An entity that arranges for an exchange between a buyer and a seller.  In most cases a broker never acquires or releases ownership of a product or service involved in an exchange.  If it is not clear whether an entity is a broker, seller, or buyer, the latter two terms are preferred.
   */
  @JsonIgnore public Person getBrokerPerson() {
    return (Person) getValue("broker");
  }
  /**
   * An entity that arranges for an exchange between a buyer and a seller.  In most cases a broker never acquires or releases ownership of a product or service involved in an exchange.  If it is not clear whether an entity is a broker, seller, or buyer, the latter two terms are preferred.
   */
  @JsonIgnore public Collection<Person> getBrokerPersons() {
    final Object current = myData.get("broker");
    if (current == null) return Collections.emptyList();
    if (current instanceof Collection) {
      return (Collection<Person>) current;
    }
    return Arrays.asList((Person) current);
  }
  /**
   * The current status of the reservation.
   */
  @JsonIgnore public ReservationStatusType getReservationStatus() {
    return (ReservationStatusType) getValue("reservationStatus");
  }
  /**
   * The current status of the reservation.
   */
  @JsonIgnore public Collection<ReservationStatusType> getReservationStatuss() {
    final Object current = myData.get("reservationStatus");
    if (current == null) return Collections.emptyList();
    if (current instanceof Collection) {
      return (Collection<ReservationStatusType>) current;
    }
    return Arrays.asList((ReservationStatusType) current);
  }
  protected Reservation(java.util.Map<String,Object> data) {
    super(data);
  }
  
  /**
   * Builder for {@link Reservation}
   */
  public static class Builder extends Intangible.Builder {
    public Builder(@NotNull HashMap<String,Object> data) {
      super(data);
    }
    @NotNull public Reservation build() {
      return new Reservation(myData);
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
     * The date and time the reservation was modified.
     */
    @NotNull public Builder modifiedTime(@NotNull java.util.Date date) {
      putValue("modifiedTime", date);
      return this;
    }
    /**
     * Any membership in a frequent flyer, hotel loyalty program, etc. being applied to the reservation.
     */
    @NotNull public Builder programMembershipUsed(@NotNull ProgramMembership programMembership) {
      putValue("programMembershipUsed", programMembership);
      return this;
    }
    /**
     * Any membership in a frequent flyer, hotel loyalty program, etc. being applied to the reservation.
     */
    @NotNull public Builder programMembershipUsed(@NotNull ProgramMembership.Builder programMembership) {
      putValue("programMembershipUsed", programMembership.build());
      return this;
    }
    /**
     * The currency of the price, or a price component when attached to &lt;a class=&quot;localLink&quot; href=&quot;http://schema.org/PriceSpecification&quot;&gt;PriceSpecification&lt;/a&gt; and its subtypes.&lt;br/&gt;&lt;br/&gt;
     * 
     * Use standard formats: &lt;a href=&quot;http://en.wikipedia.org/wiki/ISO_4217&quot;&gt;ISO 4217 currency format&lt;/a&gt; e.g. &quot;USD&quot;; &lt;a href=&quot;https://en.wikipedia.org/wiki/List_of_cryptocurrencies&quot;&gt;Ticker symbol&lt;/a&gt; for cryptocurrencies e.g. &quot;BTC&quot;; well known names for &lt;a href=&quot;https://en.wikipedia.org/wiki/Local_exchange_trading_system&quot;&gt;Local Exchange Tradings Systems&lt;/a&gt; (LETS) and other currency types e.g. &quot;Ithaca HOUR&quot;.
     */
    @NotNull public Builder priceCurrency(@NotNull String priceCurrency) {
      putValue("priceCurrency", priceCurrency);
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
     * A ticket associated with the reservation.
     */
    @NotNull public Builder reservedTicket(@NotNull Ticket ticket) {
      putValue("reservedTicket", ticket);
      return this;
    }
    /**
     * A ticket associated with the reservation.
     */
    @NotNull public Builder reservedTicket(@NotNull Ticket.Builder ticket) {
      putValue("reservedTicket", ticket.build());
      return this;
    }
    /**
     * The total price for the reservation or ticket, including applicable taxes, shipping, etc.&lt;br/&gt;&lt;br/&gt;
     * 
     * Usage guidelines:&lt;br/&gt;&lt;br/&gt;
     * 
     * &lt;ul&gt;
     * &lt;li&gt;Use values from 0123456789 (Unicode 'DIGIT ZERO' (U+0030) to 'DIGIT NINE' (U+0039)) rather than superficially similiar Unicode symbols.&lt;/li&gt;
     * &lt;li&gt;Use '.' (Unicode 'FULL STOP' (U+002E)) rather than ',' to indicate a decimal point. Avoid using these symbols as a readability separator.&lt;/li&gt;
     * &lt;/ul&gt;
     * 
     */
    @NotNull public Builder totalPrice(@NotNull Number number) {
      putValue("totalPrice", number);
      return this;
    }
    /**
     * The total price for the reservation or ticket, including applicable taxes, shipping, etc.&lt;br/&gt;&lt;br/&gt;
     * 
     * Usage guidelines:&lt;br/&gt;&lt;br/&gt;
     * 
     * &lt;ul&gt;
     * &lt;li&gt;Use values from 0123456789 (Unicode 'DIGIT ZERO' (U+0030) to 'DIGIT NINE' (U+0039)) rather than superficially similiar Unicode symbols.&lt;/li&gt;
     * &lt;li&gt;Use '.' (Unicode 'FULL STOP' (U+002E)) rather than ',' to indicate a decimal point. Avoid using these symbols as a readability separator.&lt;/li&gt;
     * &lt;/ul&gt;
     * 
     */
    @NotNull public Builder totalPrice(@NotNull PriceSpecification priceSpecification) {
      putValue("totalPrice", priceSpecification);
      return this;
    }
    /**
     * The total price for the reservation or ticket, including applicable taxes, shipping, etc.&lt;br/&gt;&lt;br/&gt;
     * 
     * Usage guidelines:&lt;br/&gt;&lt;br/&gt;
     * 
     * &lt;ul&gt;
     * &lt;li&gt;Use values from 0123456789 (Unicode 'DIGIT ZERO' (U+0030) to 'DIGIT NINE' (U+0039)) rather than superficially similiar Unicode symbols.&lt;/li&gt;
     * &lt;li&gt;Use '.' (Unicode 'FULL STOP' (U+002E)) rather than ',' to indicate a decimal point. Avoid using these symbols as a readability separator.&lt;/li&gt;
     * &lt;/ul&gt;
     * 
     */
    @NotNull public Builder totalPrice(@NotNull PriceSpecification.Builder priceSpecification) {
      putValue("totalPrice", priceSpecification.build());
      return this;
    }
    /**
     * The total price for the reservation or ticket, including applicable taxes, shipping, etc.&lt;br/&gt;&lt;br/&gt;
     * 
     * Usage guidelines:&lt;br/&gt;&lt;br/&gt;
     * 
     * &lt;ul&gt;
     * &lt;li&gt;Use values from 0123456789 (Unicode 'DIGIT ZERO' (U+0030) to 'DIGIT NINE' (U+0039)) rather than superficially similiar Unicode symbols.&lt;/li&gt;
     * &lt;li&gt;Use '.' (Unicode 'FULL STOP' (U+002E)) rather than ',' to indicate a decimal point. Avoid using these symbols as a readability separator.&lt;/li&gt;
     * &lt;/ul&gt;
     * 
     */
    @NotNull public Builder totalPrice(@NotNull String totalPrice) {
      putValue("totalPrice", totalPrice);
      return this;
    }
    /**
     * The date and time the reservation was booked.
     */
    @NotNull public Builder bookingTime(@NotNull java.util.Date date) {
      putValue("bookingTime", date);
      return this;
    }
    /**
     * A unique identifier for the reservation.
     */
    @NotNull public Builder reservationId(@NotNull String reservationId) {
      putValue("reservationId", reservationId);
      return this;
    }
    /**
     * The thing -- flight, event, restaurant,etc. being reserved.
     */
    @NotNull public Builder reservationFor(@NotNull Thing thing) {
      putValue("reservationFor", thing);
      return this;
    }
    /**
     * The thing -- flight, event, restaurant,etc. being reserved.
     */
    @NotNull public Builder reservationFor(@NotNull Thing.Builder thing) {
      putValue("reservationFor", thing.build());
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
     * The current status of the reservation.
     */
    @NotNull public Builder reservationStatus(@NotNull ReservationStatusType reservationStatusType) {
      putValue("reservationStatus", reservationStatusType);
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
      if ("underName".equals(key) && value instanceof Organization) { this.underName((Organization)value); return; }
      if ("underNames".equals(key) && value instanceof Organization) { this.underName((Organization)value); return; }
      if ("underName".equals(key) && value instanceof Person) { this.underName((Person)value); return; }
      if ("underNames".equals(key) && value instanceof Person) { this.underName((Person)value); return; }
      if ("modifiedTime".equals(key) && value instanceof java.util.Date) { this.modifiedTime((java.util.Date)value); return; }
      if ("modifiedTimes".equals(key) && value instanceof java.util.Date) { this.modifiedTime((java.util.Date)value); return; }
      if ("programMembershipUsed".equals(key) && value instanceof ProgramMembership) { this.programMembershipUsed((ProgramMembership)value); return; }
      if ("programMembershipUseds".equals(key) && value instanceof ProgramMembership) { this.programMembershipUsed((ProgramMembership)value); return; }
      if ("priceCurrency".equals(key) && value instanceof String) { this.priceCurrency((String)value); return; }
      if ("priceCurrencys".equals(key) && value instanceof String) { this.priceCurrency((String)value); return; }
      if ("provider".equals(key) && value instanceof Organization) { this.provider((Organization)value); return; }
      if ("providers".equals(key) && value instanceof Organization) { this.provider((Organization)value); return; }
      if ("provider".equals(key) && value instanceof Person) { this.provider((Person)value); return; }
      if ("providers".equals(key) && value instanceof Person) { this.provider((Person)value); return; }
      if ("reservedTicket".equals(key) && value instanceof Ticket) { this.reservedTicket((Ticket)value); return; }
      if ("reservedTickets".equals(key) && value instanceof Ticket) { this.reservedTicket((Ticket)value); return; }
      if ("totalPrice".equals(key) && value instanceof Number) { this.totalPrice((Number)value); return; }
      if ("totalPrices".equals(key) && value instanceof Number) { this.totalPrice((Number)value); return; }
      if ("totalPrice".equals(key) && value instanceof PriceSpecification) { this.totalPrice((PriceSpecification)value); return; }
      if ("totalPrices".equals(key) && value instanceof PriceSpecification) { this.totalPrice((PriceSpecification)value); return; }
      if ("totalPrice".equals(key) && value instanceof String) { this.totalPrice((String)value); return; }
      if ("totalPrices".equals(key) && value instanceof String) { this.totalPrice((String)value); return; }
      if ("bookingTime".equals(key) && value instanceof java.util.Date) { this.bookingTime((java.util.Date)value); return; }
      if ("bookingTimes".equals(key) && value instanceof java.util.Date) { this.bookingTime((java.util.Date)value); return; }
      if ("reservationId".equals(key) && value instanceof String) { this.reservationId((String)value); return; }
      if ("reservationIds".equals(key) && value instanceof String) { this.reservationId((String)value); return; }
      if ("reservationFor".equals(key) && value instanceof Thing) { this.reservationFor((Thing)value); return; }
      if ("reservationFors".equals(key) && value instanceof Thing) { this.reservationFor((Thing)value); return; }
      if ("broker".equals(key) && value instanceof Organization) { this.broker((Organization)value); return; }
      if ("brokers".equals(key) && value instanceof Organization) { this.broker((Organization)value); return; }
      if ("broker".equals(key) && value instanceof Person) { this.broker((Person)value); return; }
      if ("brokers".equals(key) && value instanceof Person) { this.broker((Person)value); return; }
      if ("reservationStatus".equals(key) && value instanceof ReservationStatusType) { this.reservationStatus((ReservationStatusType)value); return; }
      if ("reservationStatuss".equals(key) && value instanceof ReservationStatusType) { this.reservationStatus((ReservationStatusType)value); return; }
      super.fromMap(key, value);
    }
  }
  
}
