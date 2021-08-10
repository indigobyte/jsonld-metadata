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
 * A trip on a commercial bus line.
 */
public class BusTrip extends Trip {
  /**
   * The stop or station from which the bus arrives.
   * @return arrivalBusStop property set by first invocation of arrivalBusStop method or {@code null}.
   */
  @JsonIgnore public BusStation getArrivalBusStopBusStation() {
    return (BusStation) getValue("arrivalBusStop");
  }
  /**
   * The stop or station from which the bus arrives.
   * @return all arrivalBusStop properties as {@link java.util.Collection} or an empty collection 
   * if arrivalBusStop was not set.
   */
  @JsonIgnore public java.util.Collection<BusStation> getArrivalBusStopBusStations() {
    final java.lang.Object current = myData.get("arrivalBusStop");
    if (current == null) return Collections.emptyList();
    if (current instanceof java.util.Collection) {
      return (java.util.Collection<BusStation>) current;
    }
    return Arrays.asList((BusStation) current);
  }
  /**
   * The stop or station from which the bus arrives.
   * @return arrivalBusStop property set by first invocation of arrivalBusStop method or {@code null}.
   */
  @JsonIgnore public BusStop getArrivalBusStopBusStop() {
    return (BusStop) getValue("arrivalBusStop");
  }
  /**
   * The stop or station from which the bus arrives.
   * @return all arrivalBusStop properties as {@link java.util.Collection} or an empty collection 
   * if arrivalBusStop was not set.
   */
  @JsonIgnore public java.util.Collection<BusStop> getArrivalBusStopBusStops() {
    final java.lang.Object current = myData.get("arrivalBusStop");
    if (current == null) return Collections.emptyList();
    if (current instanceof java.util.Collection) {
      return (java.util.Collection<BusStop>) current;
    }
    return Arrays.asList((BusStop) current);
  }
  /**
   * The unique identifier for the bus.
   * @return busNumber property set by first invocation of busNumber method or {@code null}.
   */
  @JsonIgnore public String getBusNumber() {
    return (String) getValue("busNumber");
  }
  /**
   * The unique identifier for the bus.
   * @return all busNumber properties as {@link java.util.Collection} or an empty collection 
   * if busNumber was not set.
   */
  @JsonIgnore public java.util.Collection<String> getBusNumbers() {
    final java.lang.Object current = myData.get("busNumber");
    if (current == null) return Collections.emptyList();
    if (current instanceof java.util.Collection) {
      return (java.util.Collection<String>) current;
    }
    return Arrays.asList((String) current);
  }
  /**
   * The stop or station from which the bus departs.
   * @return departureBusStop property set by first invocation of departureBusStop method or {@code null}.
   */
  @JsonIgnore public BusStation getDepartureBusStopBusStation() {
    return (BusStation) getValue("departureBusStop");
  }
  /**
   * The stop or station from which the bus departs.
   * @return all departureBusStop properties as {@link java.util.Collection} or an empty collection 
   * if departureBusStop was not set.
   */
  @JsonIgnore public java.util.Collection<BusStation> getDepartureBusStopBusStations() {
    final java.lang.Object current = myData.get("departureBusStop");
    if (current == null) return Collections.emptyList();
    if (current instanceof java.util.Collection) {
      return (java.util.Collection<BusStation>) current;
    }
    return Arrays.asList((BusStation) current);
  }
  /**
   * The stop or station from which the bus departs.
   * @return departureBusStop property set by first invocation of departureBusStop method or {@code null}.
   */
  @JsonIgnore public BusStop getDepartureBusStopBusStop() {
    return (BusStop) getValue("departureBusStop");
  }
  /**
   * The stop or station from which the bus departs.
   * @return all departureBusStop properties as {@link java.util.Collection} or an empty collection 
   * if departureBusStop was not set.
   */
  @JsonIgnore public java.util.Collection<BusStop> getDepartureBusStopBusStops() {
    final java.lang.Object current = myData.get("departureBusStop");
    if (current == null) return Collections.emptyList();
    if (current instanceof java.util.Collection) {
      return (java.util.Collection<BusStop>) current;
    }
    return Arrays.asList((BusStop) current);
  }
  /**
   * The name of the bus (e.g. Bolt Express).
   * @return busName property set by first invocation of busName method or {@code null}.
   */
  @JsonIgnore public String getBusName() {
    return (String) getValue("busName");
  }
  /**
   * The name of the bus (e.g. Bolt Express).
   * @return all busName properties as {@link java.util.Collection} or an empty collection 
   * if busName was not set.
   */
  @JsonIgnore public java.util.Collection<String> getBusNames() {
    final java.lang.Object current = myData.get("busName");
    if (current == null) return Collections.emptyList();
    if (current instanceof java.util.Collection) {
      return (java.util.Collection<String>) current;
    }
    return Arrays.asList((String) current);
  }
  protected BusTrip(java.util.Map<String,java.lang.Object> data) {
    super(data);
  }
  /**
   * @return new {@link Builder} initialized with this instance's data
   */
  @NotNull public Builder toBuilder() {
    return new Builder(new HashMap<>(this.myData));
  }
  
  /**
   * Builder for {@link BusTrip}
   */
  public static class Builder extends Trip.Builder {
    public Builder(@NotNull HashMap<String,java.lang.Object> data) {
      super(data);
    }
    @NotNull public BusTrip build() {
      return new BusTrip(myData);
    }
    /**
     * The stop or station from which the bus arrives.
     * @param busStation value to set
     * @return this builder instance
     */
    @NotNull public Builder arrivalBusStop(@NotNull BusStation busStation) {
      putValue("arrivalBusStop", busStation);
      return this;
    }
    /**
     * The stop or station from which the bus arrives.
     * @param busStation value to set
     * @return this builder instance
     */
    @NotNull public Builder arrivalBusStop(@NotNull BusStation.Builder busStation) {
      putValue("arrivalBusStop", busStation.build());
      return this;
    }
    /**
     * The stop or station from which the bus arrives.
     * @param busStop value to set
     * @return this builder instance
     */
    @NotNull public Builder arrivalBusStop(@NotNull BusStop busStop) {
      putValue("arrivalBusStop", busStop);
      return this;
    }
    /**
     * The stop or station from which the bus arrives.
     * @param busStop value to set
     * @return this builder instance
     */
    @NotNull public Builder arrivalBusStop(@NotNull BusStop.Builder busStop) {
      putValue("arrivalBusStop", busStop.build());
      return this;
    }
    /**
     * Remove arrivalBusStop property from the builder.
     * If this property is repeatable, all instances are removed.
     * @return this builder instance
     */
    @NotNull public Builder removeArrivalBusStop() {
      removeValue("arrivalBusStop");
      return this;
    }
    /**
     * Get currently set value for arrivalBusStop property in this builder.
     * @return previously set value or {@code null}. If multiple values have been 
     * set to this property, then {@link java.util.Collection} instance will be 
     * returned.
     */
    @Nullable public java.lang.Object getArrivalBusStop() {
      return myData.get("arrivalBusStop");
    }
    /**
     * The unique identifier for the bus.
     * @param busNumber value to set
     * @return this builder instance
     */
    @NotNull public Builder busNumber(@NotNull String busNumber) {
      putValue("busNumber", busNumber);
      return this;
    }
    /**
     * Remove busNumber property from the builder.
     * If this property is repeatable, all instances are removed.
     * @return this builder instance
     */
    @NotNull public Builder removeBusNumber() {
      removeValue("busNumber");
      return this;
    }
    /**
     * Get currently set value for busNumber property in this builder.
     * @return previously set value or {@code null}. If multiple values have been 
     * set to this property, then {@link java.util.Collection} instance will be 
     * returned.
     */
    @Nullable public java.lang.Object getBusNumber() {
      return myData.get("busNumber");
    }
    /**
     * The stop or station from which the bus departs.
     * @param busStation value to set
     * @return this builder instance
     */
    @NotNull public Builder departureBusStop(@NotNull BusStation busStation) {
      putValue("departureBusStop", busStation);
      return this;
    }
    /**
     * The stop or station from which the bus departs.
     * @param busStation value to set
     * @return this builder instance
     */
    @NotNull public Builder departureBusStop(@NotNull BusStation.Builder busStation) {
      putValue("departureBusStop", busStation.build());
      return this;
    }
    /**
     * The stop or station from which the bus departs.
     * @param busStop value to set
     * @return this builder instance
     */
    @NotNull public Builder departureBusStop(@NotNull BusStop busStop) {
      putValue("departureBusStop", busStop);
      return this;
    }
    /**
     * The stop or station from which the bus departs.
     * @param busStop value to set
     * @return this builder instance
     */
    @NotNull public Builder departureBusStop(@NotNull BusStop.Builder busStop) {
      putValue("departureBusStop", busStop.build());
      return this;
    }
    /**
     * Remove departureBusStop property from the builder.
     * If this property is repeatable, all instances are removed.
     * @return this builder instance
     */
    @NotNull public Builder removeDepartureBusStop() {
      removeValue("departureBusStop");
      return this;
    }
    /**
     * Get currently set value for departureBusStop property in this builder.
     * @return previously set value or {@code null}. If multiple values have been 
     * set to this property, then {@link java.util.Collection} instance will be 
     * returned.
     */
    @Nullable public java.lang.Object getDepartureBusStop() {
      return myData.get("departureBusStop");
    }
    /**
     * The name of the bus (e.g. Bolt Express).
     * @param busName value to set
     * @return this builder instance
     */
    @NotNull public Builder busName(@NotNull String busName) {
      putValue("busName", busName);
      return this;
    }
    /**
     * Remove busName property from the builder.
     * If this property is repeatable, all instances are removed.
     * @return this builder instance
     */
    @NotNull public Builder removeBusName() {
      removeValue("busName");
      return this;
    }
    /**
     * Get currently set value for busName property in this builder.
     * @return previously set value or {@code null}. If multiple values have been 
     * set to this property, then {@link java.util.Collection} instance will be 
     * returned.
     */
    @Nullable public java.lang.Object getBusName() {
      return myData.get("busName");
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
     * The expected arrival time.
     * @param date value to set
     * @return this builder instance
     */
    @NotNull public Builder arrivalTime(@NotNull java.util.Date date) {
      putValue("arrivalTime", date);
      return this;
    }
    /**
     * Remove arrivalTime property from the builder.
     * If this property is repeatable, all instances are removed.
     * @return this builder instance
     */
    @NotNull public Builder removeArrivalTime() {
      removeValue("arrivalTime");
      return this;
    }
    /**
     * Get currently set value for arrivalTime property in this builder.
     * @return previously set value or {@code null}. If multiple values have been 
     * set to this property, then {@link java.util.Collection} instance will be 
     * returned.
     */
    @Nullable public java.lang.Object getArrivalTime() {
      return myData.get("arrivalTime");
    }
    /**
     * The expected departure time.
     * @param date value to set
     * @return this builder instance
     */
    @NotNull public Builder departureTime(@NotNull java.util.Date date) {
      putValue("departureTime", date);
      return this;
    }
    /**
     * Remove departureTime property from the builder.
     * If this property is repeatable, all instances are removed.
     * @return this builder instance
     */
    @NotNull public Builder removeDepartureTime() {
      removeValue("departureTime");
      return this;
    }
    /**
     * Get currently set value for departureTime property in this builder.
     * @return previously set value or {@code null}. If multiple values have been 
     * set to this property, then {@link java.util.Collection} instance will be 
     * returned.
     */
    @Nullable public java.lang.Object getDepartureTime() {
      return myData.get("departureTime");
    }
    /**
     * Destination(s) ( [[Place]] ) that make up a trip. For a trip where destination order is important use [[ItemList]] to specify that order (see examples).
     * @param itemList value to set
     * @return this builder instance
     */
    @NotNull public Builder itinerary(@NotNull ItemList itemList) {
      putValue("itinerary", itemList);
      return this;
    }
    /**
     * Destination(s) ( [[Place]] ) that make up a trip. For a trip where destination order is important use [[ItemList]] to specify that order (see examples).
     * @param itemList value to set
     * @return this builder instance
     */
    @NotNull public Builder itinerary(@NotNull ItemList.Builder itemList) {
      putValue("itinerary", itemList.build());
      return this;
    }
    /**
     * Destination(s) ( [[Place]] ) that make up a trip. For a trip where destination order is important use [[ItemList]] to specify that order (see examples).
     * @param place value to set
     * @return this builder instance
     */
    @NotNull public Builder itinerary(@NotNull Place place) {
      putValue("itinerary", place);
      return this;
    }
    /**
     * Destination(s) ( [[Place]] ) that make up a trip. For a trip where destination order is important use [[ItemList]] to specify that order (see examples).
     * @param place value to set
     * @return this builder instance
     */
    @NotNull public Builder itinerary(@NotNull Place.Builder place) {
      putValue("itinerary", place.build());
      return this;
    }
    /**
     * Remove itinerary property from the builder.
     * If this property is repeatable, all instances are removed.
     * @return this builder instance
     */
    @NotNull public Builder removeItinerary() {
      removeValue("itinerary");
      return this;
    }
    /**
     * Get currently set value for itinerary property in this builder.
     * @return previously set value or {@code null}. If multiple values have been 
     * set to this property, then {@link java.util.Collection} instance will be 
     * returned.
     */
    @Nullable public java.lang.Object getItinerary() {
      return myData.get("itinerary");
    }
    /**
     * An offer to provide this item&amp;#x2014;for example, an offer to sell a product, rent the DVD of a movie, perform a service, or give away tickets to an event. Use [[businessFunction]] to indicate the kind of transaction offered, i.e. sell, lease, etc. This property can also be used to describe a [[Demand]]. While this property is listed as expected on a number of common types, it can be used in others. In that case, using a second type, such as Product or a subtype of Product, can clarify the nature of the offer.
     * 
     * @param demand value to set
     * @return this builder instance
     */
    @NotNull public Builder offers(@NotNull Demand demand) {
      putValue("offers", demand);
      return this;
    }
    /**
     * An offer to provide this item&amp;#x2014;for example, an offer to sell a product, rent the DVD of a movie, perform a service, or give away tickets to an event. Use [[businessFunction]] to indicate the kind of transaction offered, i.e. sell, lease, etc. This property can also be used to describe a [[Demand]]. While this property is listed as expected on a number of common types, it can be used in others. In that case, using a second type, such as Product or a subtype of Product, can clarify the nature of the offer.
     * 
     * @param demand value to set
     * @return this builder instance
     */
    @NotNull public Builder offers(@NotNull Demand.Builder demand) {
      putValue("offers", demand.build());
      return this;
    }
    /**
     * An offer to provide this item&amp;#x2014;for example, an offer to sell a product, rent the DVD of a movie, perform a service, or give away tickets to an event. Use [[businessFunction]] to indicate the kind of transaction offered, i.e. sell, lease, etc. This property can also be used to describe a [[Demand]]. While this property is listed as expected on a number of common types, it can be used in others. In that case, using a second type, such as Product or a subtype of Product, can clarify the nature of the offer.
     * 
     * @param offer value to set
     * @return this builder instance
     */
    @NotNull public Builder offers(@NotNull Offer offer) {
      putValue("offers", offer);
      return this;
    }
    /**
     * An offer to provide this item&amp;#x2014;for example, an offer to sell a product, rent the DVD of a movie, perform a service, or give away tickets to an event. Use [[businessFunction]] to indicate the kind of transaction offered, i.e. sell, lease, etc. This property can also be used to describe a [[Demand]]. While this property is listed as expected on a number of common types, it can be used in others. In that case, using a second type, such as Product or a subtype of Product, can clarify the nature of the offer.
     * 
     * @param offer value to set
     * @return this builder instance
     */
    @NotNull public Builder offers(@NotNull Offer.Builder offer) {
      putValue("offers", offer.build());
      return this;
    }
    /**
     * Remove offers property from the builder.
     * If this property is repeatable, all instances are removed.
     * @return this builder instance
     */
    @NotNull public Builder removeOffers() {
      removeValue("offers");
      return this;
    }
    /**
     * Get currently set value for offers property in this builder.
     * @return previously set value or {@code null}. If multiple values have been 
     * set to this property, then {@link java.util.Collection} instance will be 
     * returned.
     */
    @Nullable public java.lang.Object getOffers() {
      return myData.get("offers");
    }
    /**
     * Identifies that this [[Trip]] is a subTrip of another Trip.  For example Day 1, Day 2, etc. of a multi-day trip.
     * @param trip value to set
     * @return this builder instance
     */
    @NotNull public Builder partOfTrip(@NotNull Trip trip) {
      putValue("partOfTrip", trip);
      return this;
    }
    /**
     * Identifies that this [[Trip]] is a subTrip of another Trip.  For example Day 1, Day 2, etc. of a multi-day trip.
     * @param trip value to set
     * @return this builder instance
     */
    @NotNull public Builder partOfTrip(@NotNull Trip.Builder trip) {
      putValue("partOfTrip", trip.build());
      return this;
    }
    /**
     * Remove partOfTrip property from the builder.
     * If this property is repeatable, all instances are removed.
     * @return this builder instance
     */
    @NotNull public Builder removePartOfTrip() {
      removeValue("partOfTrip");
      return this;
    }
    /**
     * Get currently set value for partOfTrip property in this builder.
     * @return previously set value or {@code null}. If multiple values have been 
     * set to this property, then {@link java.util.Collection} instance will be 
     * returned.
     */
    @Nullable public java.lang.Object getPartOfTrip() {
      return myData.get("partOfTrip");
    }
    /**
     * Identifies a [[Trip]] that is a subTrip of this Trip.  For example Day 1, Day 2, etc. of a multi-day trip.
     * @param trip value to set
     * @return this builder instance
     */
    @NotNull public Builder subTrip(@NotNull Trip trip) {
      putValue("subTrip", trip);
      return this;
    }
    /**
     * Identifies a [[Trip]] that is a subTrip of this Trip.  For example Day 1, Day 2, etc. of a multi-day trip.
     * @param trip value to set
     * @return this builder instance
     */
    @NotNull public Builder subTrip(@NotNull Trip.Builder trip) {
      putValue("subTrip", trip.build());
      return this;
    }
    /**
     * Remove subTrip property from the builder.
     * If this property is repeatable, all instances are removed.
     * @return this builder instance
     */
    @NotNull public Builder removeSubTrip() {
      removeValue("subTrip");
      return this;
    }
    /**
     * Get currently set value for subTrip property in this builder.
     * @return previously set value or {@code null}. If multiple values have been 
     * set to this property, then {@link java.util.Collection} instance will be 
     * returned.
     */
    @Nullable public java.lang.Object getSubTrip() {
      return myData.get("subTrip");
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
      if ("arrivalBusStop".equals(key) && value instanceof BusStation) { this.arrivalBusStop((BusStation)value); return; }
      if ("arrivalBusStops".equals(key) && value instanceof BusStation) { this.arrivalBusStop((BusStation)value); return; }
      if ("arrivalBusStop".equals(key) && value instanceof BusStop) { this.arrivalBusStop((BusStop)value); return; }
      if ("arrivalBusStops".equals(key) && value instanceof BusStop) { this.arrivalBusStop((BusStop)value); return; }
      if ("busNumber".equals(key) && value instanceof String) { this.busNumber((String)value); return; }
      if ("busNumbers".equals(key) && value instanceof String) { this.busNumber((String)value); return; }
      if ("departureBusStop".equals(key) && value instanceof BusStation) { this.departureBusStop((BusStation)value); return; }
      if ("departureBusStops".equals(key) && value instanceof BusStation) { this.departureBusStop((BusStation)value); return; }
      if ("departureBusStop".equals(key) && value instanceof BusStop) { this.departureBusStop((BusStop)value); return; }
      if ("departureBusStops".equals(key) && value instanceof BusStop) { this.departureBusStop((BusStop)value); return; }
      if ("busName".equals(key) && value instanceof String) { this.busName((String)value); return; }
      if ("busNames".equals(key) && value instanceof String) { this.busName((String)value); return; }
      super.fromMap(key, value);
    }
  }
  
}
