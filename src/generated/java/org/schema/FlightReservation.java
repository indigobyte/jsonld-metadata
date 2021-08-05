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
 * A reservation for air travel.\n\nNote: This type is for information about actual reservations, e.g. in confirmation emails or HTML pages with individual confirmations of reservations. For offers of tickets, use [[Offer]].
 */
public class FlightReservation extends Reservation {
  /**
   * The type of security screening the passenger is subject to.
   */
  @JsonIgnore public String getSecurityScreening() {
    return (String) getValue("securityScreening");
  }
  /**
   * The type of security screening the passenger is subject to.
   */
  @JsonIgnore public java.util.Collection<String> getSecurityScreenings() {
    final Object current = myData.get("securityScreening");
    if (current == null) return Collections.emptyList();
    if (current instanceof java.util.Collection) {
      return (java.util.Collection<String>) current;
    }
    return Arrays.asList((String) current);
  }
  /**
   * The passenger's sequence number as assigned by the airline.
   */
  @JsonIgnore public String getPassengerSequenceNumber() {
    return (String) getValue("passengerSequenceNumber");
  }
  /**
   * The passenger's sequence number as assigned by the airline.
   */
  @JsonIgnore public java.util.Collection<String> getPassengerSequenceNumbers() {
    final Object current = myData.get("passengerSequenceNumber");
    if (current == null) return Collections.emptyList();
    if (current instanceof java.util.Collection) {
      return (java.util.Collection<String>) current;
    }
    return Arrays.asList((String) current);
  }
  /**
   * The priority status assigned to a passenger for security or boarding (e.g. FastTrack or Priority).
   */
  @JsonIgnore public QualitativeValue getPassengerPriorityStatusQualitativeValue() {
    return (QualitativeValue) getValue("passengerPriorityStatus");
  }
  /**
   * The priority status assigned to a passenger for security or boarding (e.g. FastTrack or Priority).
   */
  @JsonIgnore public java.util.Collection<QualitativeValue> getPassengerPriorityStatusQualitativeValues() {
    final Object current = myData.get("passengerPriorityStatus");
    if (current == null) return Collections.emptyList();
    if (current instanceof java.util.Collection) {
      return (java.util.Collection<QualitativeValue>) current;
    }
    return Arrays.asList((QualitativeValue) current);
  }
  /**
   * The priority status assigned to a passenger for security or boarding (e.g. FastTrack or Priority).
   */
  @JsonIgnore public String getPassengerPriorityStatusString() {
    return (String) getValue("passengerPriorityStatus");
  }
  /**
   * The priority status assigned to a passenger for security or boarding (e.g. FastTrack or Priority).
   */
  @JsonIgnore public java.util.Collection<String> getPassengerPriorityStatusStrings() {
    final Object current = myData.get("passengerPriorityStatus");
    if (current == null) return Collections.emptyList();
    if (current instanceof java.util.Collection) {
      return (java.util.Collection<String>) current;
    }
    return Arrays.asList((String) current);
  }
  /**
   * The airline-specific indicator of boarding order / preference.
   */
  @JsonIgnore public String getBoardingGroup() {
    return (String) getValue("boardingGroup");
  }
  /**
   * The airline-specific indicator of boarding order / preference.
   */
  @JsonIgnore public java.util.Collection<String> getBoardingGroups() {
    final Object current = myData.get("boardingGroup");
    if (current == null) return Collections.emptyList();
    if (current instanceof java.util.Collection) {
      return (java.util.Collection<String>) current;
    }
    return Arrays.asList((String) current);
  }
  protected FlightReservation(java.util.Map<String,Object> data) {
    super(data);
  }
  
  /**
   * Builder for {@link FlightReservation}
   */
  public static class Builder extends Reservation.Builder {
    public Builder(@NotNull HashMap<String,Object> data) {
      super(data);
    }
    @NotNull public FlightReservation build() {
      return new FlightReservation(myData);
    }
    /**
     * The type of security screening the passenger is subject to.
     */
    @NotNull public Builder securityScreening(@NotNull String securityScreening) {
      putValue("securityScreening", securityScreening);
      return this;
    }
    /**
     * The passenger's sequence number as assigned by the airline.
     */
    @NotNull public Builder passengerSequenceNumber(@NotNull String passengerSequenceNumber) {
      putValue("passengerSequenceNumber", passengerSequenceNumber);
      return this;
    }
    /**
     * The priority status assigned to a passenger for security or boarding (e.g. FastTrack or Priority).
     */
    @NotNull public Builder passengerPriorityStatus(@NotNull QualitativeValue qualitativeValue) {
      putValue("passengerPriorityStatus", qualitativeValue);
      return this;
    }
    /**
     * The priority status assigned to a passenger for security or boarding (e.g. FastTrack or Priority).
     */
    @NotNull public Builder passengerPriorityStatus(@NotNull QualitativeValue.Builder qualitativeValue) {
      putValue("passengerPriorityStatus", qualitativeValue.build());
      return this;
    }
    /**
     * The priority status assigned to a passenger for security or boarding (e.g. FastTrack or Priority).
     */
    @NotNull public Builder passengerPriorityStatus(@NotNull String passengerPriorityStatus) {
      putValue("passengerPriorityStatus", passengerPriorityStatus);
      return this;
    }
    /**
     * The airline-specific indicator of boarding order / preference.
     */
    @NotNull public Builder boardingGroup(@NotNull String boardingGroup) {
      putValue("boardingGroup", boardingGroup);
      return this;
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
     * The current status of the reservation.
     */
    @NotNull public Builder reservationStatus(@NotNull ReservationStatusType reservationStatusType) {
      putValue("reservationStatus", reservationStatusType);
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
     * The date and time the reservation was booked.
     */
    @NotNull public Builder bookingTime(@NotNull java.util.Date date) {
      putValue("bookingTime", date);
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
     * The date and time the reservation was modified.
     */
    @NotNull public Builder modifiedTime(@NotNull java.util.Date date) {
      putValue("modifiedTime", date);
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
     * The currency of the price, or a price component when attached to [[PriceSpecification]] and its subtypes.\n\nUse standard formats: [ISO 4217 currency format](http://en.wikipedia.org/wiki/ISO_4217) e.g. &quot;USD&quot;; [Ticker symbol](https://en.wikipedia.org/wiki/List_of_cryptocurrencies) for cryptocurrencies e.g. &quot;BTC&quot;; well known names for [Local Exchange Tradings Systems](https://en.wikipedia.org/wiki/Local_exchange_trading_system) (LETS) and other currency types e.g. &quot;Ithaca HOUR&quot;.
     */
    @NotNull public Builder priceCurrency(@NotNull String priceCurrency) {
      putValue("priceCurrency", priceCurrency);
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
      if ("securityScreening".equals(key) && value instanceof String) { this.securityScreening((String)value); return; }
      if ("securityScreenings".equals(key) && value instanceof String) { this.securityScreening((String)value); return; }
      if ("passengerSequenceNumber".equals(key) && value instanceof String) { this.passengerSequenceNumber((String)value); return; }
      if ("passengerSequenceNumbers".equals(key) && value instanceof String) { this.passengerSequenceNumber((String)value); return; }
      if ("passengerPriorityStatus".equals(key) && value instanceof QualitativeValue) { this.passengerPriorityStatus((QualitativeValue)value); return; }
      if ("passengerPriorityStatuss".equals(key) && value instanceof QualitativeValue) { this.passengerPriorityStatus((QualitativeValue)value); return; }
      if ("passengerPriorityStatus".equals(key) && value instanceof String) { this.passengerPriorityStatus((String)value); return; }
      if ("passengerPriorityStatuss".equals(key) && value instanceof String) { this.passengerPriorityStatus((String)value); return; }
      if ("boardingGroup".equals(key) && value instanceof String) { this.boardingGroup((String)value); return; }
      if ("boardingGroups".equals(key) && value instanceof String) { this.boardingGroup((String)value); return; }
      super.fromMap(key, value);
    }
  }
  
}
