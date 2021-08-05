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
 * A trip on a commercial bus line.
 */
public class BusTrip extends Trip {
  /**
   * The stop or station from which the bus arrives.
   */
  @JsonIgnore public BusStation getArrivalBusStopBusStation() {
    return (BusStation) getValue("arrivalBusStop");
  }
  /**
   * The stop or station from which the bus arrives.
   */
  @JsonIgnore public java.util.Collection<BusStation> getArrivalBusStopBusStations() {
    final Object current = myData.get("arrivalBusStop");
    if (current == null) return Collections.emptyList();
    if (current instanceof java.util.Collection) {
      return (java.util.Collection<BusStation>) current;
    }
    return Arrays.asList((BusStation) current);
  }
  /**
   * The stop or station from which the bus arrives.
   */
  @JsonIgnore public BusStop getArrivalBusStopBusStop() {
    return (BusStop) getValue("arrivalBusStop");
  }
  /**
   * The stop or station from which the bus arrives.
   */
  @JsonIgnore public java.util.Collection<BusStop> getArrivalBusStopBusStops() {
    final Object current = myData.get("arrivalBusStop");
    if (current == null) return Collections.emptyList();
    if (current instanceof java.util.Collection) {
      return (java.util.Collection<BusStop>) current;
    }
    return Arrays.asList((BusStop) current);
  }
  /**
   * The unique identifier for the bus.
   */
  @JsonIgnore public String getBusNumber() {
    return (String) getValue("busNumber");
  }
  /**
   * The unique identifier for the bus.
   */
  @JsonIgnore public java.util.Collection<String> getBusNumbers() {
    final Object current = myData.get("busNumber");
    if (current == null) return Collections.emptyList();
    if (current instanceof java.util.Collection) {
      return (java.util.Collection<String>) current;
    }
    return Arrays.asList((String) current);
  }
  /**
   * The stop or station from which the bus departs.
   */
  @JsonIgnore public BusStation getDepartureBusStopBusStation() {
    return (BusStation) getValue("departureBusStop");
  }
  /**
   * The stop or station from which the bus departs.
   */
  @JsonIgnore public java.util.Collection<BusStation> getDepartureBusStopBusStations() {
    final Object current = myData.get("departureBusStop");
    if (current == null) return Collections.emptyList();
    if (current instanceof java.util.Collection) {
      return (java.util.Collection<BusStation>) current;
    }
    return Arrays.asList((BusStation) current);
  }
  /**
   * The stop or station from which the bus departs.
   */
  @JsonIgnore public BusStop getDepartureBusStopBusStop() {
    return (BusStop) getValue("departureBusStop");
  }
  /**
   * The stop or station from which the bus departs.
   */
  @JsonIgnore public java.util.Collection<BusStop> getDepartureBusStopBusStops() {
    final Object current = myData.get("departureBusStop");
    if (current == null) return Collections.emptyList();
    if (current instanceof java.util.Collection) {
      return (java.util.Collection<BusStop>) current;
    }
    return Arrays.asList((BusStop) current);
  }
  /**
   * The name of the bus (e.g. Bolt Express).
   */
  @JsonIgnore public String getBusName() {
    return (String) getValue("busName");
  }
  /**
   * The name of the bus (e.g. Bolt Express).
   */
  @JsonIgnore public java.util.Collection<String> getBusNames() {
    final Object current = myData.get("busName");
    if (current == null) return Collections.emptyList();
    if (current instanceof java.util.Collection) {
      return (java.util.Collection<String>) current;
    }
    return Arrays.asList((String) current);
  }
  protected BusTrip(java.util.Map<String,Object> data) {
    super(data);
  }
  
  /**
   * Builder for {@link BusTrip}
   */
  public static class Builder extends Trip.Builder {
    public Builder(@NotNull HashMap<String,Object> data) {
      super(data);
    }
    @NotNull public BusTrip build() {
      return new BusTrip(myData);
    }
    /**
     * The stop or station from which the bus arrives.
     */
    @NotNull public Builder arrivalBusStop(@NotNull BusStation busStation) {
      putValue("arrivalBusStop", busStation);
      return this;
    }
    /**
     * The stop or station from which the bus arrives.
     */
    @NotNull public Builder arrivalBusStop(@NotNull BusStation.Builder busStation) {
      putValue("arrivalBusStop", busStation.build());
      return this;
    }
    /**
     * The stop or station from which the bus arrives.
     */
    @NotNull public Builder arrivalBusStop(@NotNull BusStop busStop) {
      putValue("arrivalBusStop", busStop);
      return this;
    }
    /**
     * The stop or station from which the bus arrives.
     */
    @NotNull public Builder arrivalBusStop(@NotNull BusStop.Builder busStop) {
      putValue("arrivalBusStop", busStop.build());
      return this;
    }
    /**
     * The unique identifier for the bus.
     */
    @NotNull public Builder busNumber(@NotNull String busNumber) {
      putValue("busNumber", busNumber);
      return this;
    }
    /**
     * The stop or station from which the bus departs.
     */
    @NotNull public Builder departureBusStop(@NotNull BusStation busStation) {
      putValue("departureBusStop", busStation);
      return this;
    }
    /**
     * The stop or station from which the bus departs.
     */
    @NotNull public Builder departureBusStop(@NotNull BusStation.Builder busStation) {
      putValue("departureBusStop", busStation.build());
      return this;
    }
    /**
     * The stop or station from which the bus departs.
     */
    @NotNull public Builder departureBusStop(@NotNull BusStop busStop) {
      putValue("departureBusStop", busStop);
      return this;
    }
    /**
     * The stop or station from which the bus departs.
     */
    @NotNull public Builder departureBusStop(@NotNull BusStop.Builder busStop) {
      putValue("departureBusStop", busStop.build());
      return this;
    }
    /**
     * The name of the bus (e.g. Bolt Express).
     */
    @NotNull public Builder busName(@NotNull String busName) {
      putValue("busName", busName);
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
     * The expected arrival time.
     */
    @NotNull public Builder arrivalTime(@NotNull java.util.Date date) {
      putValue("arrivalTime", date);
      return this;
    }
    /**
     * The expected departure time.
     */
    @NotNull public Builder departureTime(@NotNull java.util.Date date) {
      putValue("departureTime", date);
      return this;
    }
    /**
     * Destination(s) ( [[Place]] ) that make up a trip. For a trip where destination order is important use [[ItemList]] to specify that order (see examples).
     */
    @NotNull public Builder itinerary(@NotNull ItemList itemList) {
      putValue("itinerary", itemList);
      return this;
    }
    /**
     * Destination(s) ( [[Place]] ) that make up a trip. For a trip where destination order is important use [[ItemList]] to specify that order (see examples).
     */
    @NotNull public Builder itinerary(@NotNull ItemList.Builder itemList) {
      putValue("itinerary", itemList.build());
      return this;
    }
    /**
     * Destination(s) ( [[Place]] ) that make up a trip. For a trip where destination order is important use [[ItemList]] to specify that order (see examples).
     */
    @NotNull public Builder itinerary(@NotNull Place place) {
      putValue("itinerary", place);
      return this;
    }
    /**
     * Destination(s) ( [[Place]] ) that make up a trip. For a trip where destination order is important use [[ItemList]] to specify that order (see examples).
     */
    @NotNull public Builder itinerary(@NotNull Place.Builder place) {
      putValue("itinerary", place.build());
      return this;
    }
    /**
     * An offer to provide this item&amp;#x2014;for example, an offer to sell a product, rent the DVD of a movie, perform a service, or give away tickets to an event. Use [[businessFunction]] to indicate the kind of transaction offered, i.e. sell, lease, etc. This property can also be used to describe a [[Demand]]. While this property is listed as expected on a number of common types, it can be used in others. In that case, using a second type, such as Product or a subtype of Product, can clarify the nature of the offer.
     *       
     */
    @NotNull public Builder offers(@NotNull Demand demand) {
      putValue("offers", demand);
      return this;
    }
    /**
     * An offer to provide this item&amp;#x2014;for example, an offer to sell a product, rent the DVD of a movie, perform a service, or give away tickets to an event. Use [[businessFunction]] to indicate the kind of transaction offered, i.e. sell, lease, etc. This property can also be used to describe a [[Demand]]. While this property is listed as expected on a number of common types, it can be used in others. In that case, using a second type, such as Product or a subtype of Product, can clarify the nature of the offer.
     *       
     */
    @NotNull public Builder offers(@NotNull Demand.Builder demand) {
      putValue("offers", demand.build());
      return this;
    }
    /**
     * An offer to provide this item&amp;#x2014;for example, an offer to sell a product, rent the DVD of a movie, perform a service, or give away tickets to an event. Use [[businessFunction]] to indicate the kind of transaction offered, i.e. sell, lease, etc. This property can also be used to describe a [[Demand]]. While this property is listed as expected on a number of common types, it can be used in others. In that case, using a second type, such as Product or a subtype of Product, can clarify the nature of the offer.
     *       
     */
    @NotNull public Builder offers(@NotNull Offer offer) {
      putValue("offers", offer);
      return this;
    }
    /**
     * An offer to provide this item&amp;#x2014;for example, an offer to sell a product, rent the DVD of a movie, perform a service, or give away tickets to an event. Use [[businessFunction]] to indicate the kind of transaction offered, i.e. sell, lease, etc. This property can also be used to describe a [[Demand]]. While this property is listed as expected on a number of common types, it can be used in others. In that case, using a second type, such as Product or a subtype of Product, can clarify the nature of the offer.
     *       
     */
    @NotNull public Builder offers(@NotNull Offer.Builder offer) {
      putValue("offers", offer.build());
      return this;
    }
    /**
     * Identifies that this [[Trip]] is a subTrip of another Trip.  For example Day 1, Day 2, etc. of a multi-day trip.
     */
    @NotNull public Builder partOfTrip(@NotNull Trip trip) {
      putValue("partOfTrip", trip);
      return this;
    }
    /**
     * Identifies that this [[Trip]] is a subTrip of another Trip.  For example Day 1, Day 2, etc. of a multi-day trip.
     */
    @NotNull public Builder partOfTrip(@NotNull Trip.Builder trip) {
      putValue("partOfTrip", trip.build());
      return this;
    }
    /**
     * Identifies a [[Trip]] that is a subTrip of this Trip.  For example Day 1, Day 2, etc. of a multi-day trip.
     */
    @NotNull public Builder subTrip(@NotNull Trip trip) {
      putValue("subTrip", trip);
      return this;
    }
    /**
     * Identifies a [[Trip]] that is a subTrip of this Trip.  For example Day 1, Day 2, etc. of a multi-day trip.
     */
    @NotNull public Builder subTrip(@NotNull Trip.Builder trip) {
      putValue("subTrip", trip.build());
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
