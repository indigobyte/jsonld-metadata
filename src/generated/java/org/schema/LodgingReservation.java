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
 * A reservation for lodging at a hotel, motel, inn, etc.\n\nNote: This type is for information about actual reservations, e.g. in confirmation emails or HTML pages with individual confirmations of reservations.
 */
public class LodgingReservation extends Reservation {
  /**
   * The latest someone may check out of a lodging establishment.
   * @return checkoutTime property set by first invocation of checkoutTime method or {@code null}.
   */
  @JsonIgnore public java.util.Date getCheckoutTime() {
    return (java.util.Date) getValue("checkoutTime");
  }
  /**
   * The latest someone may check out of a lodging establishment.
   * @return all checkoutTime properties as {@link java.util.Collection} or an empty collection 
   * if checkoutTime was not set.
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
   * @return lodgingUnitDescription property set by first invocation of lodgingUnitDescription method or {@code null}.
   */
  @JsonIgnore public String getLodgingUnitDescription() {
    return (String) getValue("lodgingUnitDescription");
  }
  /**
   * A full description of the lodging unit.
   * @return all lodgingUnitDescription properties as {@link java.util.Collection} or an empty collection 
   * if lodgingUnitDescription was not set.
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
   * @return checkinTime property set by first invocation of checkinTime method or {@code null}.
   */
  @JsonIgnore public java.util.Date getCheckinTime() {
    return (java.util.Date) getValue("checkinTime");
  }
  /**
   * The earliest someone may check into a lodging establishment.
   * @return all checkinTime properties as {@link java.util.Collection} or an empty collection 
   * if checkinTime was not set.
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
   * @return numAdults property set by first invocation of numAdults method or {@code null}.
   */
  @JsonIgnore public Integer getNumAdultsInteger() {
    return (Integer) getValue("numAdults");
  }
  /**
   * The number of adults staying in the unit.
   * @return all numAdults properties as {@link java.util.Collection} or an empty collection 
   * if numAdults was not set.
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
   * @return numAdults property set by first invocation of numAdults method or {@code null}.
   */
  @JsonIgnore public QuantitativeValue getNumAdultsQuantitativeValue() {
    return (QuantitativeValue) getValue("numAdults");
  }
  /**
   * The number of adults staying in the unit.
   * @return all numAdults properties as {@link java.util.Collection} or an empty collection 
   * if numAdults was not set.
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
   * @return numChildren property set by first invocation of numChildren method or {@code null}.
   */
  @JsonIgnore public Integer getNumChildrenInteger() {
    return (Integer) getValue("numChildren");
  }
  /**
   * The number of children staying in the unit.
   * @return all numChildren properties as {@link java.util.Collection} or an empty collection 
   * if numChildren was not set.
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
   * @return numChildren property set by first invocation of numChildren method or {@code null}.
   */
  @JsonIgnore public QuantitativeValue getNumChildrenQuantitativeValue() {
    return (QuantitativeValue) getValue("numChildren");
  }
  /**
   * The number of children staying in the unit.
   * @return all numChildren properties as {@link java.util.Collection} or an empty collection 
   * if numChildren was not set.
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
   * @return lodgingUnitType property set by first invocation of lodgingUnitType method or {@code null}.
   */
  @JsonIgnore public QualitativeValue getLodgingUnitTypeQualitativeValue() {
    return (QualitativeValue) getValue("lodgingUnitType");
  }
  /**
   * Textual description of the unit type (including suite vs. room, size of bed, etc.).
   * @return all lodgingUnitType properties as {@link java.util.Collection} or an empty collection 
   * if lodgingUnitType was not set.
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
   * @return lodgingUnitType property set by first invocation of lodgingUnitType method or {@code null}.
   */
  @JsonIgnore public String getLodgingUnitTypeString() {
    return (String) getValue("lodgingUnitType");
  }
  /**
   * Textual description of the unit type (including suite vs. room, size of bed, etc.).
   * @return all lodgingUnitType properties as {@link java.util.Collection} or an empty collection 
   * if lodgingUnitType was not set.
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
   * @return new {@link Builder} initialized with this instance's data
   */
  @NotNull public Builder toBuilder() {
    return new Builder(new HashMap<>(this.myData));
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
     * @param date value to set
     * @return this builder instance
     */
    @NotNull public Builder checkoutTime(@NotNull java.util.Date date) {
      putValue("checkoutTime", date);
      return this;
    }
    /**
     * Remove checkoutTime property from the builder.
     * If this property is repeatable, all instances are removed.
     * @return this builder instance
     */
    @NotNull public Builder removeCheckoutTime() {
      removeValue("checkoutTime");
      return this;
    }
    /**
     * Get currently set value for checkoutTime property in this builder.
     * @return previously set value or {@code null}. If multiple values have been 
     * set to this property, then {@link java.util.Collection} instance will be 
     * returned.
     */
    @Nullable public java.lang.Object getCheckoutTime() {
      return myData.get("checkoutTime");
    }
    /**
     * A full description of the lodging unit.
     * @param lodgingUnitDescription value to set
     * @return this builder instance
     */
    @NotNull public Builder lodgingUnitDescription(@NotNull String lodgingUnitDescription) {
      putValue("lodgingUnitDescription", lodgingUnitDescription);
      return this;
    }
    /**
     * Remove lodgingUnitDescription property from the builder.
     * If this property is repeatable, all instances are removed.
     * @return this builder instance
     */
    @NotNull public Builder removeLodgingUnitDescription() {
      removeValue("lodgingUnitDescription");
      return this;
    }
    /**
     * Get currently set value for lodgingUnitDescription property in this builder.
     * @return previously set value or {@code null}. If multiple values have been 
     * set to this property, then {@link java.util.Collection} instance will be 
     * returned.
     */
    @Nullable public java.lang.Object getLodgingUnitDescription() {
      return myData.get("lodgingUnitDescription");
    }
    /**
     * The earliest someone may check into a lodging establishment.
     * @param date value to set
     * @return this builder instance
     */
    @NotNull public Builder checkinTime(@NotNull java.util.Date date) {
      putValue("checkinTime", date);
      return this;
    }
    /**
     * Remove checkinTime property from the builder.
     * If this property is repeatable, all instances are removed.
     * @return this builder instance
     */
    @NotNull public Builder removeCheckinTime() {
      removeValue("checkinTime");
      return this;
    }
    /**
     * Get currently set value for checkinTime property in this builder.
     * @return previously set value or {@code null}. If multiple values have been 
     * set to this property, then {@link java.util.Collection} instance will be 
     * returned.
     */
    @Nullable public java.lang.Object getCheckinTime() {
      return myData.get("checkinTime");
    }
    /**
     * The number of adults staying in the unit.
     * @param integer value to set
     * @return this builder instance
     */
    @NotNull public Builder numAdults(@NotNull Integer integer) {
      putValue("numAdults", integer);
      return this;
    }
    /**
     * The number of adults staying in the unit.
     * @param quantitativeValue value to set
     * @return this builder instance
     */
    @NotNull public Builder numAdults(@NotNull QuantitativeValue quantitativeValue) {
      putValue("numAdults", quantitativeValue);
      return this;
    }
    /**
     * The number of adults staying in the unit.
     * @param quantitativeValue value to set
     * @return this builder instance
     */
    @NotNull public Builder numAdults(@NotNull QuantitativeValue.Builder quantitativeValue) {
      putValue("numAdults", quantitativeValue.build());
      return this;
    }
    /**
     * Remove numAdults property from the builder.
     * If this property is repeatable, all instances are removed.
     * @return this builder instance
     */
    @NotNull public Builder removeNumAdults() {
      removeValue("numAdults");
      return this;
    }
    /**
     * Get currently set value for numAdults property in this builder.
     * @return previously set value or {@code null}. If multiple values have been 
     * set to this property, then {@link java.util.Collection} instance will be 
     * returned.
     */
    @Nullable public java.lang.Object getNumAdults() {
      return myData.get("numAdults");
    }
    /**
     * The number of children staying in the unit.
     * @param integer value to set
     * @return this builder instance
     */
    @NotNull public Builder numChildren(@NotNull Integer integer) {
      putValue("numChildren", integer);
      return this;
    }
    /**
     * The number of children staying in the unit.
     * @param quantitativeValue value to set
     * @return this builder instance
     */
    @NotNull public Builder numChildren(@NotNull QuantitativeValue quantitativeValue) {
      putValue("numChildren", quantitativeValue);
      return this;
    }
    /**
     * The number of children staying in the unit.
     * @param quantitativeValue value to set
     * @return this builder instance
     */
    @NotNull public Builder numChildren(@NotNull QuantitativeValue.Builder quantitativeValue) {
      putValue("numChildren", quantitativeValue.build());
      return this;
    }
    /**
     * Remove numChildren property from the builder.
     * If this property is repeatable, all instances are removed.
     * @return this builder instance
     */
    @NotNull public Builder removeNumChildren() {
      removeValue("numChildren");
      return this;
    }
    /**
     * Get currently set value for numChildren property in this builder.
     * @return previously set value or {@code null}. If multiple values have been 
     * set to this property, then {@link java.util.Collection} instance will be 
     * returned.
     */
    @Nullable public java.lang.Object getNumChildren() {
      return myData.get("numChildren");
    }
    /**
     * Textual description of the unit type (including suite vs. room, size of bed, etc.).
     * @param qualitativeValue value to set
     * @return this builder instance
     */
    @NotNull public Builder lodgingUnitType(@NotNull QualitativeValue qualitativeValue) {
      putValue("lodgingUnitType", qualitativeValue);
      return this;
    }
    /**
     * Textual description of the unit type (including suite vs. room, size of bed, etc.).
     * @param qualitativeValue value to set
     * @return this builder instance
     */
    @NotNull public Builder lodgingUnitType(@NotNull QualitativeValue.Builder qualitativeValue) {
      putValue("lodgingUnitType", qualitativeValue.build());
      return this;
    }
    /**
     * Textual description of the unit type (including suite vs. room, size of bed, etc.).
     * @param lodgingUnitType value to set
     * @return this builder instance
     */
    @NotNull public Builder lodgingUnitType(@NotNull String lodgingUnitType) {
      putValue("lodgingUnitType", lodgingUnitType);
      return this;
    }
    /**
     * Remove lodgingUnitType property from the builder.
     * If this property is repeatable, all instances are removed.
     * @return this builder instance
     */
    @NotNull public Builder removeLodgingUnitType() {
      removeValue("lodgingUnitType");
      return this;
    }
    /**
     * Get currently set value for lodgingUnitType property in this builder.
     * @return previously set value or {@code null}. If multiple values have been 
     * set to this property, then {@link java.util.Collection} instance will be 
     * returned.
     */
    @Nullable public java.lang.Object getLodgingUnitType() {
      return myData.get("lodgingUnitType");
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
     * The current status of the reservation.
     * @param reservationStatusType value to set
     * @return this builder instance
     */
    @NotNull public Builder reservationStatus(@NotNull ReservationStatusType reservationStatusType) {
      putValue("reservationStatus", reservationStatusType);
      return this;
    }
    /**
     * Remove reservationStatus property from the builder.
     * If this property is repeatable, all instances are removed.
     * @return this builder instance
     */
    @NotNull public Builder removeReservationStatus() {
      removeValue("reservationStatus");
      return this;
    }
    /**
     * Get currently set value for reservationStatus property in this builder.
     * @return previously set value or {@code null}. If multiple values have been 
     * set to this property, then {@link java.util.Collection} instance will be 
     * returned.
     */
    @Nullable public java.lang.Object getReservationStatus() {
      return myData.get("reservationStatus");
    }
    /**
     * The service provider, service operator, or service performer; the goods producer. Another party (a seller) may offer those services or goods on behalf of the provider. A provider may also serve as the seller.
     * @param organization value to set
     * @return this builder instance
     */
    @NotNull public Builder provider(@NotNull Organization organization) {
      putValue("provider", organization);
      return this;
    }
    /**
     * The service provider, service operator, or service performer; the goods producer. Another party (a seller) may offer those services or goods on behalf of the provider. A provider may also serve as the seller.
     * @param organization value to set
     * @return this builder instance
     */
    @NotNull public Builder provider(@NotNull Organization.Builder organization) {
      putValue("provider", organization.build());
      return this;
    }
    /**
     * The service provider, service operator, or service performer; the goods producer. Another party (a seller) may offer those services or goods on behalf of the provider. A provider may also serve as the seller.
     * @param person value to set
     * @return this builder instance
     */
    @NotNull public Builder provider(@NotNull Person person) {
      putValue("provider", person);
      return this;
    }
    /**
     * The service provider, service operator, or service performer; the goods producer. Another party (a seller) may offer those services or goods on behalf of the provider. A provider may also serve as the seller.
     * @param person value to set
     * @return this builder instance
     */
    @NotNull public Builder provider(@NotNull Person.Builder person) {
      putValue("provider", person.build());
      return this;
    }
    /**
     * Remove provider property from the builder.
     * If this property is repeatable, all instances are removed.
     * @return this builder instance
     */
    @NotNull public Builder removeProvider() {
      removeValue("provider");
      return this;
    }
    /**
     * Get currently set value for provider property in this builder.
     * @return previously set value or {@code null}. If multiple values have been 
     * set to this property, then {@link java.util.Collection} instance will be 
     * returned.
     */
    @Nullable public java.lang.Object getProvider() {
      return myData.get("provider");
    }
    /**
     * A ticket associated with the reservation.
     * @param ticket value to set
     * @return this builder instance
     */
    @NotNull public Builder reservedTicket(@NotNull Ticket ticket) {
      putValue("reservedTicket", ticket);
      return this;
    }
    /**
     * A ticket associated with the reservation.
     * @param ticket value to set
     * @return this builder instance
     */
    @NotNull public Builder reservedTicket(@NotNull Ticket.Builder ticket) {
      putValue("reservedTicket", ticket.build());
      return this;
    }
    /**
     * Remove reservedTicket property from the builder.
     * If this property is repeatable, all instances are removed.
     * @return this builder instance
     */
    @NotNull public Builder removeReservedTicket() {
      removeValue("reservedTicket");
      return this;
    }
    /**
     * Get currently set value for reservedTicket property in this builder.
     * @return previously set value or {@code null}. If multiple values have been 
     * set to this property, then {@link java.util.Collection} instance will be 
     * returned.
     */
    @Nullable public java.lang.Object getReservedTicket() {
      return myData.get("reservedTicket");
    }
    /**
     * The date and time the reservation was booked.
     * @param date value to set
     * @return this builder instance
     */
    @NotNull public Builder bookingTime(@NotNull java.util.Date date) {
      putValue("bookingTime", date);
      return this;
    }
    /**
     * Remove bookingTime property from the builder.
     * If this property is repeatable, all instances are removed.
     * @return this builder instance
     */
    @NotNull public Builder removeBookingTime() {
      removeValue("bookingTime");
      return this;
    }
    /**
     * Get currently set value for bookingTime property in this builder.
     * @return previously set value or {@code null}. If multiple values have been 
     * set to this property, then {@link java.util.Collection} instance will be 
     * returned.
     */
    @Nullable public java.lang.Object getBookingTime() {
      return myData.get("bookingTime");
    }
    /**
     * The thing -- flight, event, restaurant,etc. being reserved.
     * @param thing value to set
     * @return this builder instance
     */
    @NotNull public Builder reservationFor(@NotNull Thing thing) {
      putValue("reservationFor", thing);
      return this;
    }
    /**
     * The thing -- flight, event, restaurant,etc. being reserved.
     * @param thing value to set
     * @return this builder instance
     */
    @NotNull public Builder reservationFor(@NotNull Thing.Builder thing) {
      putValue("reservationFor", thing.build());
      return this;
    }
    /**
     * Remove reservationFor property from the builder.
     * If this property is repeatable, all instances are removed.
     * @return this builder instance
     */
    @NotNull public Builder removeReservationFor() {
      removeValue("reservationFor");
      return this;
    }
    /**
     * Get currently set value for reservationFor property in this builder.
     * @return previously set value or {@code null}. If multiple values have been 
     * set to this property, then {@link java.util.Collection} instance will be 
     * returned.
     */
    @Nullable public java.lang.Object getReservationFor() {
      return myData.get("reservationFor");
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
     * The date and time the reservation was modified.
     * @param date value to set
     * @return this builder instance
     */
    @NotNull public Builder modifiedTime(@NotNull java.util.Date date) {
      putValue("modifiedTime", date);
      return this;
    }
    /**
     * Remove modifiedTime property from the builder.
     * If this property is repeatable, all instances are removed.
     * @return this builder instance
     */
    @NotNull public Builder removeModifiedTime() {
      removeValue("modifiedTime");
      return this;
    }
    /**
     * Get currently set value for modifiedTime property in this builder.
     * @return previously set value or {@code null}. If multiple values have been 
     * set to this property, then {@link java.util.Collection} instance will be 
     * returned.
     */
    @Nullable public java.lang.Object getModifiedTime() {
      return myData.get("modifiedTime");
    }
    /**
     * A unique identifier for the reservation.
     * @param reservationId value to set
     * @return this builder instance
     */
    @NotNull public Builder reservationId(@NotNull String reservationId) {
      putValue("reservationId", reservationId);
      return this;
    }
    /**
     * Remove reservationId property from the builder.
     * If this property is repeatable, all instances are removed.
     * @return this builder instance
     */
    @NotNull public Builder removeReservationId() {
      removeValue("reservationId");
      return this;
    }
    /**
     * Get currently set value for reservationId property in this builder.
     * @return previously set value or {@code null}. If multiple values have been 
     * set to this property, then {@link java.util.Collection} instance will be 
     * returned.
     */
    @Nullable public java.lang.Object getReservationId() {
      return myData.get("reservationId");
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
     * Any membership in a frequent flyer, hotel loyalty program, etc. being applied to the reservation.
     * @param programMembership value to set
     * @return this builder instance
     */
    @NotNull public Builder programMembershipUsed(@NotNull ProgramMembership programMembership) {
      putValue("programMembershipUsed", programMembership);
      return this;
    }
    /**
     * Any membership in a frequent flyer, hotel loyalty program, etc. being applied to the reservation.
     * @param programMembership value to set
     * @return this builder instance
     */
    @NotNull public Builder programMembershipUsed(@NotNull ProgramMembership.Builder programMembership) {
      putValue("programMembershipUsed", programMembership.build());
      return this;
    }
    /**
     * Remove programMembershipUsed property from the builder.
     * If this property is repeatable, all instances are removed.
     * @return this builder instance
     */
    @NotNull public Builder removeProgramMembershipUsed() {
      removeValue("programMembershipUsed");
      return this;
    }
    /**
     * Get currently set value for programMembershipUsed property in this builder.
     * @return previously set value or {@code null}. If multiple values have been 
     * set to this property, then {@link java.util.Collection} instance will be 
     * returned.
     */
    @Nullable public java.lang.Object getProgramMembershipUsed() {
      return myData.get("programMembershipUsed");
    }
    /**
     * An entity that arranges for an exchange between a buyer and a seller.  In most cases a broker never acquires or releases ownership of a product or service involved in an exchange.  If it is not clear whether an entity is a broker, seller, or buyer, the latter two terms are preferred.
     * @param organization value to set
     * @return this builder instance
     */
    @NotNull public Builder broker(@NotNull Organization organization) {
      putValue("broker", organization);
      return this;
    }
    /**
     * An entity that arranges for an exchange between a buyer and a seller.  In most cases a broker never acquires or releases ownership of a product or service involved in an exchange.  If it is not clear whether an entity is a broker, seller, or buyer, the latter two terms are preferred.
     * @param organization value to set
     * @return this builder instance
     */
    @NotNull public Builder broker(@NotNull Organization.Builder organization) {
      putValue("broker", organization.build());
      return this;
    }
    /**
     * An entity that arranges for an exchange between a buyer and a seller.  In most cases a broker never acquires or releases ownership of a product or service involved in an exchange.  If it is not clear whether an entity is a broker, seller, or buyer, the latter two terms are preferred.
     * @param person value to set
     * @return this builder instance
     */
    @NotNull public Builder broker(@NotNull Person person) {
      putValue("broker", person);
      return this;
    }
    /**
     * An entity that arranges for an exchange between a buyer and a seller.  In most cases a broker never acquires or releases ownership of a product or service involved in an exchange.  If it is not clear whether an entity is a broker, seller, or buyer, the latter two terms are preferred.
     * @param person value to set
     * @return this builder instance
     */
    @NotNull public Builder broker(@NotNull Person.Builder person) {
      putValue("broker", person.build());
      return this;
    }
    /**
     * Remove broker property from the builder.
     * If this property is repeatable, all instances are removed.
     * @return this builder instance
     */
    @NotNull public Builder removeBroker() {
      removeValue("broker");
      return this;
    }
    /**
     * Get currently set value for broker property in this builder.
     * @return previously set value or {@code null}. If multiple values have been 
     * set to this property, then {@link java.util.Collection} instance will be 
     * returned.
     */
    @Nullable public java.lang.Object getBroker() {
      return myData.get("broker");
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
