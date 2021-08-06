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
 * A reservation for lodging at a hotel, motel, inn, etc.\n\nNote: This type is for information about actual reservations, e.g. in confirmation emails or HTML pages with individual confirmations of reservations.
 */
public class LodgingReservation extends Reservation {
  /**
   * The latest someone may check out of a lodging establishment.
   */
  @JsonIgnore public java.util.Date getCheckoutTime() {
    return (java.util.Date) getValue("checkoutTime");
  }
  /**
   * The latest someone may check out of a lodging establishment.
   */
  @JsonIgnore public java.util.Collection<java.util.Date> getCheckoutTimes() {
    final java.lang.Object current = myData.get("checkoutTime");
    if (current == null) return Collections.emptyList();
    if (current instanceof java.util.Collection) {
      return (java.util.Collection<java.util.Date>) current;
    }
    return Arrays.asList((java.util.Date) current);
  }
  /**
   * A full description of the lodging unit.
   */
  @JsonIgnore public String getLodgingUnitDescription() {
    return (String) getValue("lodgingUnitDescription");
  }
  /**
   * A full description of the lodging unit.
   */
  @JsonIgnore public java.util.Collection<String> getLodgingUnitDescriptions() {
    final java.lang.Object current = myData.get("lodgingUnitDescription");
    if (current == null) return Collections.emptyList();
    if (current instanceof java.util.Collection) {
      return (java.util.Collection<String>) current;
    }
    return Arrays.asList((String) current);
  }
  /**
   * The earliest someone may check into a lodging establishment.
   */
  @JsonIgnore public java.util.Date getCheckinTime() {
    return (java.util.Date) getValue("checkinTime");
  }
  /**
   * The earliest someone may check into a lodging establishment.
   */
  @JsonIgnore public java.util.Collection<java.util.Date> getCheckinTimes() {
    final java.lang.Object current = myData.get("checkinTime");
    if (current == null) return Collections.emptyList();
    if (current instanceof java.util.Collection) {
      return (java.util.Collection<java.util.Date>) current;
    }
    return Arrays.asList((java.util.Date) current);
  }
  /**
   * The number of adults staying in the unit.
   */
  @JsonIgnore public Integer getNumAdultsInteger() {
    return (Integer) getValue("numAdults");
  }
  /**
   * The number of adults staying in the unit.
   */
  @JsonIgnore public java.util.Collection<Integer> getNumAdultsIntegers() {
    final java.lang.Object current = myData.get("numAdults");
    if (current == null) return Collections.emptyList();
    if (current instanceof java.util.Collection) {
      return (java.util.Collection<Integer>) current;
    }
    return Arrays.asList((Integer) current);
  }
  /**
   * The number of adults staying in the unit.
   */
  @JsonIgnore public QuantitativeValue getNumAdultsQuantitativeValue() {
    return (QuantitativeValue) getValue("numAdults");
  }
  /**
   * The number of adults staying in the unit.
   */
  @JsonIgnore public java.util.Collection<QuantitativeValue> getNumAdultsQuantitativeValues() {
    final java.lang.Object current = myData.get("numAdults");
    if (current == null) return Collections.emptyList();
    if (current instanceof java.util.Collection) {
      return (java.util.Collection<QuantitativeValue>) current;
    }
    return Arrays.asList((QuantitativeValue) current);
  }
  /**
   * The number of children staying in the unit.
   */
  @JsonIgnore public Integer getNumChildrenInteger() {
    return (Integer) getValue("numChildren");
  }
  /**
   * The number of children staying in the unit.
   */
  @JsonIgnore public java.util.Collection<Integer> getNumChildrenIntegers() {
    final java.lang.Object current = myData.get("numChildren");
    if (current == null) return Collections.emptyList();
    if (current instanceof java.util.Collection) {
      return (java.util.Collection<Integer>) current;
    }
    return Arrays.asList((Integer) current);
  }
  /**
   * The number of children staying in the unit.
   */
  @JsonIgnore public QuantitativeValue getNumChildrenQuantitativeValue() {
    return (QuantitativeValue) getValue("numChildren");
  }
  /**
   * The number of children staying in the unit.
   */
  @JsonIgnore public java.util.Collection<QuantitativeValue> getNumChildrenQuantitativeValues() {
    final java.lang.Object current = myData.get("numChildren");
    if (current == null) return Collections.emptyList();
    if (current instanceof java.util.Collection) {
      return (java.util.Collection<QuantitativeValue>) current;
    }
    return Arrays.asList((QuantitativeValue) current);
  }
  /**
   * Textual description of the unit type (including suite vs. room, size of bed, etc.).
   */
  @JsonIgnore public QualitativeValue getLodgingUnitTypeQualitativeValue() {
    return (QualitativeValue) getValue("lodgingUnitType");
  }
  /**
   * Textual description of the unit type (including suite vs. room, size of bed, etc.).
   */
  @JsonIgnore public java.util.Collection<QualitativeValue> getLodgingUnitTypeQualitativeValues() {
    final java.lang.Object current = myData.get("lodgingUnitType");
    if (current == null) return Collections.emptyList();
    if (current instanceof java.util.Collection) {
      return (java.util.Collection<QualitativeValue>) current;
    }
    return Arrays.asList((QualitativeValue) current);
  }
  /**
   * Textual description of the unit type (including suite vs. room, size of bed, etc.).
   */
  @JsonIgnore public String getLodgingUnitTypeString() {
    return (String) getValue("lodgingUnitType");
  }
  /**
   * Textual description of the unit type (including suite vs. room, size of bed, etc.).
   */
  @JsonIgnore public java.util.Collection<String> getLodgingUnitTypeStrings() {
    final java.lang.Object current = myData.get("lodgingUnitType");
    if (current == null) return Collections.emptyList();
    if (current instanceof java.util.Collection) {
      return (java.util.Collection<String>) current;
    }
    return Arrays.asList((String) current);
  }
  protected LodgingReservation(java.util.Map<String,java.lang.Object> data) {
    super(data);
  }
  
  /**
   * Builder for {@link LodgingReservation}
   */
  public static class Builder extends Reservation.Builder {
    public Builder(@NotNull HashMap<String,java.lang.Object> data) {
      super(data);
    }
    @NotNull public LodgingReservation build() {
      return new LodgingReservation(myData);
    }
    /**
     * The latest someone may check out of a lodging establishment.
     */
    @NotNull public Builder checkoutTime(@NotNull java.util.Date date) {
      putValue("checkoutTime", date);
      return this;
    }
    /**
     * A full description of the lodging unit.
     */
    @NotNull public Builder lodgingUnitDescription(@NotNull String lodgingUnitDescription) {
      putValue("lodgingUnitDescription", lodgingUnitDescription);
      return this;
    }
    /**
     * The earliest someone may check into a lodging establishment.
     */
    @NotNull public Builder checkinTime(@NotNull java.util.Date date) {
      putValue("checkinTime", date);
      return this;
    }
    /**
     * The number of adults staying in the unit.
     */
    @NotNull public Builder numAdults(@NotNull Integer integer) {
      putValue("numAdults", integer);
      return this;
    }
    /**
     * The number of adults staying in the unit.
     */
    @NotNull public Builder numAdults(@NotNull QuantitativeValue quantitativeValue) {
      putValue("numAdults", quantitativeValue);
      return this;
    }
    /**
     * The number of adults staying in the unit.
     */
    @NotNull public Builder numAdults(@NotNull QuantitativeValue.Builder quantitativeValue) {
      putValue("numAdults", quantitativeValue.build());
      return this;
    }
    /**
     * The number of children staying in the unit.
     */
    @NotNull public Builder numChildren(@NotNull Integer integer) {
      putValue("numChildren", integer);
      return this;
    }
    /**
     * The number of children staying in the unit.
     */
    @NotNull public Builder numChildren(@NotNull QuantitativeValue quantitativeValue) {
      putValue("numChildren", quantitativeValue);
      return this;
    }
    /**
     * The number of children staying in the unit.
     */
    @NotNull public Builder numChildren(@NotNull QuantitativeValue.Builder quantitativeValue) {
      putValue("numChildren", quantitativeValue.build());
      return this;
    }
    /**
     * Textual description of the unit type (including suite vs. room, size of bed, etc.).
     */
    @NotNull public Builder lodgingUnitType(@NotNull QualitativeValue qualitativeValue) {
      putValue("lodgingUnitType", qualitativeValue);
      return this;
    }
    /**
     * Textual description of the unit type (including suite vs. room, size of bed, etc.).
     */
    @NotNull public Builder lodgingUnitType(@NotNull QualitativeValue.Builder qualitativeValue) {
      putValue("lodgingUnitType", qualitativeValue.build());
      return this;
    }
    /**
     * Textual description of the unit type (including suite vs. room, size of bed, etc.).
     */
    @NotNull public Builder lodgingUnitType(@NotNull String lodgingUnitType) {
      putValue("lodgingUnitType", lodgingUnitType);
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
      if ("checkoutTime".equals(key) && value instanceof java.util.Date) { this.checkoutTime((java.util.Date)value); return; }
      if ("checkoutTimes".equals(key) && value instanceof java.util.Date) { this.checkoutTime((java.util.Date)value); return; }
      if ("lodgingUnitDescription".equals(key) && value instanceof String) { this.lodgingUnitDescription((String)value); return; }
      if ("lodgingUnitDescriptions".equals(key) && value instanceof String) { this.lodgingUnitDescription((String)value); return; }
      if ("checkinTime".equals(key) && value instanceof java.util.Date) { this.checkinTime((java.util.Date)value); return; }
      if ("checkinTimes".equals(key) && value instanceof java.util.Date) { this.checkinTime((java.util.Date)value); return; }
      if ("numAdults".equals(key) && value instanceof Integer) { this.numAdults((Integer)value); return; }
      if ("numAdultss".equals(key) && value instanceof Integer) { this.numAdults((Integer)value); return; }
      if ("numAdults".equals(key) && value instanceof QuantitativeValue) { this.numAdults((QuantitativeValue)value); return; }
      if ("numAdultss".equals(key) && value instanceof QuantitativeValue) { this.numAdults((QuantitativeValue)value); return; }
      if ("numChildren".equals(key) && value instanceof Integer) { this.numChildren((Integer)value); return; }
      if ("numChildrens".equals(key) && value instanceof Integer) { this.numChildren((Integer)value); return; }
      if ("numChildren".equals(key) && value instanceof QuantitativeValue) { this.numChildren((QuantitativeValue)value); return; }
      if ("numChildrens".equals(key) && value instanceof QuantitativeValue) { this.numChildren((QuantitativeValue)value); return; }
      if ("lodgingUnitType".equals(key) && value instanceof QualitativeValue) { this.lodgingUnitType((QualitativeValue)value); return; }
      if ("lodgingUnitTypes".equals(key) && value instanceof QualitativeValue) { this.lodgingUnitType((QualitativeValue)value); return; }
      if ("lodgingUnitType".equals(key) && value instanceof String) { this.lodgingUnitType((String)value); return; }
      if ("lodgingUnitTypes".equals(key) && value instanceof String) { this.lodgingUnitType((String)value); return; }
      super.fromMap(key, value);
    }
  }
  
}
