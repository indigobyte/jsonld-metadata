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
 * A reservation to dine at a food-related business.\n\nNote: This type is for information about actual reservations, e.g. in confirmation emails or HTML pages with individual confirmations of reservations.
 */
public class FoodEstablishmentReservation extends Reservation {
  /**
   * The startTime of something. For a reserved event or service (e.g. FoodEstablishmentReservation), the time that it is expected to start. For actions that span a period of time, when the action was performed. e.g. John wrote a book from *January* to December. For media, including audio and video, it's the time offset of the start of a clip within a larger file.\n\nNote that Event uses startDate/endDate instead of startTime/endTime, even when describing dates with times. This situation may be clarified in future revisions.
   */
  @JsonIgnore public java.util.Date getStartTime() {
    return (java.util.Date) getValue("startTime");
  }
  /**
   * The startTime of something. For a reserved event or service (e.g. FoodEstablishmentReservation), the time that it is expected to start. For actions that span a period of time, when the action was performed. e.g. John wrote a book from *January* to December. For media, including audio and video, it's the time offset of the start of a clip within a larger file.\n\nNote that Event uses startDate/endDate instead of startTime/endTime, even when describing dates with times. This situation may be clarified in future revisions.
   */
  @JsonIgnore public java.util.Collection<java.util.Date> getStartTimes() {
    final Object current = myData.get("startTime");
    if (current == null) return Collections.emptyList();
    if (current instanceof java.util.Collection) {
      return (java.util.Collection<java.util.Date>) current;
    }
    return Arrays.asList((java.util.Date) current);
  }
  /**
   * Number of people the reservation should accommodate.
   */
  @JsonIgnore public Integer getPartySizeInteger() {
    return (Integer) getValue("partySize");
  }
  /**
   * Number of people the reservation should accommodate.
   */
  @JsonIgnore public java.util.Collection<Integer> getPartySizeIntegers() {
    final Object current = myData.get("partySize");
    if (current == null) return Collections.emptyList();
    if (current instanceof java.util.Collection) {
      return (java.util.Collection<Integer>) current;
    }
    return Arrays.asList((Integer) current);
  }
  /**
   * Number of people the reservation should accommodate.
   */
  @JsonIgnore public QuantitativeValue getPartySizeQuantitativeValue() {
    return (QuantitativeValue) getValue("partySize");
  }
  /**
   * Number of people the reservation should accommodate.
   */
  @JsonIgnore public java.util.Collection<QuantitativeValue> getPartySizeQuantitativeValues() {
    final Object current = myData.get("partySize");
    if (current == null) return Collections.emptyList();
    if (current instanceof java.util.Collection) {
      return (java.util.Collection<QuantitativeValue>) current;
    }
    return Arrays.asList((QuantitativeValue) current);
  }
  /**
   * The endTime of something. For a reserved event or service (e.g. FoodEstablishmentReservation), the time that it is expected to end. For actions that span a period of time, when the action was performed. e.g. John wrote a book from January to *December*. For media, including audio and video, it's the time offset of the end of a clip within a larger file.\n\nNote that Event uses startDate/endDate instead of startTime/endTime, even when describing dates with times. This situation may be clarified in future revisions.
   */
  @JsonIgnore public java.util.Date getEndTime() {
    return (java.util.Date) getValue("endTime");
  }
  /**
   * The endTime of something. For a reserved event or service (e.g. FoodEstablishmentReservation), the time that it is expected to end. For actions that span a period of time, when the action was performed. e.g. John wrote a book from January to *December*. For media, including audio and video, it's the time offset of the end of a clip within a larger file.\n\nNote that Event uses startDate/endDate instead of startTime/endTime, even when describing dates with times. This situation may be clarified in future revisions.
   */
  @JsonIgnore public java.util.Collection<java.util.Date> getEndTimes() {
    final Object current = myData.get("endTime");
    if (current == null) return Collections.emptyList();
    if (current instanceof java.util.Collection) {
      return (java.util.Collection<java.util.Date>) current;
    }
    return Arrays.asList((java.util.Date) current);
  }
  protected FoodEstablishmentReservation(java.util.Map<String,Object> data) {
    super(data);
  }
  
  /**
   * Builder for {@link FoodEstablishmentReservation}
   */
  public static class Builder extends Reservation.Builder {
    public Builder(@NotNull HashMap<String,Object> data) {
      super(data);
    }
    @NotNull public FoodEstablishmentReservation build() {
      return new FoodEstablishmentReservation(myData);
    }
    /**
     * The startTime of something. For a reserved event or service (e.g. FoodEstablishmentReservation), the time that it is expected to start. For actions that span a period of time, when the action was performed. e.g. John wrote a book from *January* to December. For media, including audio and video, it's the time offset of the start of a clip within a larger file.\n\nNote that Event uses startDate/endDate instead of startTime/endTime, even when describing dates with times. This situation may be clarified in future revisions.
     */
    @NotNull public Builder startTime(@NotNull java.util.Date date) {
      putValue("startTime", date);
      return this;
    }
    /**
     * Number of people the reservation should accommodate.
     */
    @NotNull public Builder partySize(@NotNull Integer integer) {
      putValue("partySize", integer);
      return this;
    }
    /**
     * Number of people the reservation should accommodate.
     */
    @NotNull public Builder partySize(@NotNull QuantitativeValue quantitativeValue) {
      putValue("partySize", quantitativeValue);
      return this;
    }
    /**
     * Number of people the reservation should accommodate.
     */
    @NotNull public Builder partySize(@NotNull QuantitativeValue.Builder quantitativeValue) {
      putValue("partySize", quantitativeValue.build());
      return this;
    }
    /**
     * The endTime of something. For a reserved event or service (e.g. FoodEstablishmentReservation), the time that it is expected to end. For actions that span a period of time, when the action was performed. e.g. John wrote a book from January to *December*. For media, including audio and video, it's the time offset of the end of a clip within a larger file.\n\nNote that Event uses startDate/endDate instead of startTime/endTime, even when describing dates with times. This situation may be clarified in future revisions.
     */
    @NotNull public Builder endTime(@NotNull java.util.Date date) {
      putValue("endTime", date);
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
      if ("startTime".equals(key) && value instanceof java.util.Date) { this.startTime((java.util.Date)value); return; }
      if ("startTimes".equals(key) && value instanceof java.util.Date) { this.startTime((java.util.Date)value); return; }
      if ("partySize".equals(key) && value instanceof Integer) { this.partySize((Integer)value); return; }
      if ("partySizes".equals(key) && value instanceof Integer) { this.partySize((Integer)value); return; }
      if ("partySize".equals(key) && value instanceof QuantitativeValue) { this.partySize((QuantitativeValue)value); return; }
      if ("partySizes".equals(key) && value instanceof QuantitativeValue) { this.partySize((QuantitativeValue)value); return; }
      if ("endTime".equals(key) && value instanceof java.util.Date) { this.endTime((java.util.Date)value); return; }
      if ("endTimes".equals(key) && value instanceof java.util.Date) { this.endTime((java.util.Date)value); return; }
      super.fromMap(key, value);
    }
  }
  
}
