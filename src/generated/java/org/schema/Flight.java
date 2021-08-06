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
 * An airline flight.
 */
public class Flight extends Trip {
  /**
   * Identifier of the flight's arrival gate.
   */
  @JsonIgnore public String getArrivalGate() {
    return (String) getValue("arrivalGate");
  }
  /**
   * Identifier of the flight's arrival gate.
   */
  @JsonIgnore public java.util.Collection<String> getArrivalGates() {
    final Object current = myData.get("arrivalGate");
    if (current == null) return Collections.emptyList();
    if (current instanceof java.util.Collection) {
      return (java.util.Collection<String>) current;
    }
    return Arrays.asList((String) current);
  }
  /**
   * The kind of aircraft (e.g., &quot;Boeing 747&quot;).
   */
  @JsonIgnore public String getAircraftString() {
    return (String) getValue("aircraft");
  }
  /**
   * The kind of aircraft (e.g., &quot;Boeing 747&quot;).
   */
  @JsonIgnore public java.util.Collection<String> getAircraftStrings() {
    final Object current = myData.get("aircraft");
    if (current == null) return Collections.emptyList();
    if (current instanceof java.util.Collection) {
      return (java.util.Collection<String>) current;
    }
    return Arrays.asList((String) current);
  }
  /**
   * The kind of aircraft (e.g., &quot;Boeing 747&quot;).
   */
  @JsonIgnore public Vehicle getAircraftVehicle() {
    return (Vehicle) getValue("aircraft");
  }
  /**
   * The kind of aircraft (e.g., &quot;Boeing 747&quot;).
   */
  @JsonIgnore public java.util.Collection<Vehicle> getAircraftVehicles() {
    final Object current = myData.get("aircraft");
    if (current == null) return Collections.emptyList();
    if (current instanceof java.util.Collection) {
      return (java.util.Collection<Vehicle>) current;
    }
    return Arrays.asList((Vehicle) current);
  }
  /**
   * Identifier of the flight's departure terminal.
   */
  @JsonIgnore public String getDepartureTerminal() {
    return (String) getValue("departureTerminal");
  }
  /**
   * Identifier of the flight's departure terminal.
   */
  @JsonIgnore public java.util.Collection<String> getDepartureTerminals() {
    final Object current = myData.get("departureTerminal");
    if (current == null) return Collections.emptyList();
    if (current instanceof java.util.Collection) {
      return (java.util.Collection<String>) current;
    }
    return Arrays.asList((String) current);
  }
  /**
   * Description of the meals that will be provided or available for purchase.
   */
  @JsonIgnore public String getMealService() {
    return (String) getValue("mealService");
  }
  /**
   * Description of the meals that will be provided or available for purchase.
   */
  @JsonIgnore public java.util.Collection<String> getMealServices() {
    final Object current = myData.get("mealService");
    if (current == null) return Collections.emptyList();
    if (current instanceof java.util.Collection) {
      return (java.util.Collection<String>) current;
    }
    return Arrays.asList((String) current);
  }
  /**
   * The estimated time the flight will take.
   */
  @JsonIgnore public Duration getEstimatedFlightDurationDuration() {
    return (Duration) getValue("estimatedFlightDuration");
  }
  /**
   * The estimated time the flight will take.
   */
  @JsonIgnore public java.util.Collection<Duration> getEstimatedFlightDurationDurations() {
    final Object current = myData.get("estimatedFlightDuration");
    if (current == null) return Collections.emptyList();
    if (current instanceof java.util.Collection) {
      return (java.util.Collection<Duration>) current;
    }
    return Arrays.asList((Duration) current);
  }
  /**
   * The estimated time the flight will take.
   */
  @JsonIgnore public String getEstimatedFlightDurationString() {
    return (String) getValue("estimatedFlightDuration");
  }
  /**
   * The estimated time the flight will take.
   */
  @JsonIgnore public java.util.Collection<String> getEstimatedFlightDurationStrings() {
    final Object current = myData.get("estimatedFlightDuration");
    if (current == null) return Collections.emptyList();
    if (current instanceof java.util.Collection) {
      return (java.util.Collection<String>) current;
    }
    return Arrays.asList((String) current);
  }
  /**
   * The type of boarding policy used by the airline (e.g. zone-based or group-based).
   */
  @JsonIgnore public BoardingPolicyType getBoardingPolicy() {
    return (BoardingPolicyType) getValue("boardingPolicy");
  }
  /**
   * The type of boarding policy used by the airline (e.g. zone-based or group-based).
   */
  @JsonIgnore public java.util.Collection<BoardingPolicyType> getBoardingPolicys() {
    final Object current = myData.get("boardingPolicy");
    if (current == null) return Collections.emptyList();
    if (current instanceof java.util.Collection) {
      return (java.util.Collection<BoardingPolicyType>) current;
    }
    return Arrays.asList((BoardingPolicyType) current);
  }
  /**
   * Identifier of the flight's departure gate.
   */
  @JsonIgnore public String getDepartureGate() {
    return (String) getValue("departureGate");
  }
  /**
   * Identifier of the flight's departure gate.
   */
  @JsonIgnore public java.util.Collection<String> getDepartureGates() {
    final Object current = myData.get("departureGate");
    if (current == null) return Collections.emptyList();
    if (current instanceof java.util.Collection) {
      return (java.util.Collection<String>) current;
    }
    return Arrays.asList((String) current);
  }
  /**
   * The distance of the flight.
   */
  @JsonIgnore public Distance getFlightDistanceDistance() {
    return (Distance) getValue("flightDistance");
  }
  /**
   * The distance of the flight.
   */
  @JsonIgnore public java.util.Collection<Distance> getFlightDistanceDistances() {
    final Object current = myData.get("flightDistance");
    if (current == null) return Collections.emptyList();
    if (current instanceof java.util.Collection) {
      return (java.util.Collection<Distance>) current;
    }
    return Arrays.asList((Distance) current);
  }
  /**
   * The distance of the flight.
   */
  @JsonIgnore public String getFlightDistanceString() {
    return (String) getValue("flightDistance");
  }
  /**
   * The distance of the flight.
   */
  @JsonIgnore public java.util.Collection<String> getFlightDistanceStrings() {
    final Object current = myData.get("flightDistance");
    if (current == null) return Collections.emptyList();
    if (current instanceof java.util.Collection) {
      return (java.util.Collection<String>) current;
    }
    return Arrays.asList((String) current);
  }
  /**
   * The unique identifier for a flight including the airline IATA code. For example, if describing United flight 110, where the IATA code for United is 'UA', the flightNumber is 'UA110'.
   */
  @JsonIgnore public Identifier getFlightNumber() {
    return (Identifier) getValue("flightNumber");
  }
  /**
   * The unique identifier for a flight including the airline IATA code. For example, if describing United flight 110, where the IATA code for United is 'UA', the flightNumber is 'UA110'.
   */
  @JsonIgnore public java.util.Collection<Identifier> getFlightNumbers() {
    final Object current = myData.get("flightNumber");
    if (current == null) return Collections.emptyList();
    if (current instanceof java.util.Collection) {
      return (java.util.Collection<Identifier>) current;
    }
    return Arrays.asList((Identifier) current);
  }
  /**
   * Identifier of the flight's arrival terminal.
   */
  @JsonIgnore public String getArrivalTerminal() {
    return (String) getValue("arrivalTerminal");
  }
  /**
   * Identifier of the flight's arrival terminal.
   */
  @JsonIgnore public java.util.Collection<String> getArrivalTerminals() {
    final Object current = myData.get("arrivalTerminal");
    if (current == null) return Collections.emptyList();
    if (current instanceof java.util.Collection) {
      return (java.util.Collection<String>) current;
    }
    return Arrays.asList((String) current);
  }
  /**
   * An entity which offers (sells / leases / lends / loans) the services / goods.  A seller may also be a provider.
   */
  @JsonIgnore public Participant getSeller() {
    return (Participant) getValue("seller");
  }
  /**
   * An entity which offers (sells / leases / lends / loans) the services / goods.  A seller may also be a provider.
   */
  @JsonIgnore public java.util.Collection<Participant> getSellers() {
    final Object current = myData.get("seller");
    if (current == null) return Collections.emptyList();
    if (current instanceof java.util.Collection) {
      return (java.util.Collection<Participant>) current;
    }
    return Arrays.asList((Participant) current);
  }
  /**
   * The airport where the flight originates.
   */
  @JsonIgnore public Airport getDepartureAirport() {
    return (Airport) getValue("departureAirport");
  }
  /**
   * The airport where the flight originates.
   */
  @JsonIgnore public java.util.Collection<Airport> getDepartureAirports() {
    final Object current = myData.get("departureAirport");
    if (current == null) return Collections.emptyList();
    if (current instanceof java.util.Collection) {
      return (java.util.Collection<Airport>) current;
    }
    return Arrays.asList((Airport) current);
  }
  /**
   * The airport where the flight terminates.
   */
  @JsonIgnore public Airport getArrivalAirport() {
    return (Airport) getValue("arrivalAirport");
  }
  /**
   * The airport where the flight terminates.
   */
  @JsonIgnore public java.util.Collection<Airport> getArrivalAirports() {
    final Object current = myData.get("arrivalAirport");
    if (current == null) return Collections.emptyList();
    if (current instanceof java.util.Collection) {
      return (java.util.Collection<Airport>) current;
    }
    return Arrays.asList((Airport) current);
  }
  /**
   * The time when a passenger can check into the flight online.
   */
  @JsonIgnore public java.util.Date getWebCheckinTime() {
    return (java.util.Date) getValue("webCheckinTime");
  }
  /**
   * The time when a passenger can check into the flight online.
   */
  @JsonIgnore public java.util.Collection<java.util.Date> getWebCheckinTimes() {
    final Object current = myData.get("webCheckinTime");
    if (current == null) return Collections.emptyList();
    if (current instanceof java.util.Collection) {
      return (java.util.Collection<java.util.Date>) current;
    }
    return Arrays.asList((java.util.Date) current);
  }
  protected Flight(java.util.Map<String,Object> data) {
    super(data);
  }
  
  /**
   * Builder for {@link Flight}
   */
  public static class Builder extends Trip.Builder {
    public Builder(@NotNull HashMap<String,Object> data) {
      super(data);
    }
    @NotNull public Flight build() {
      return new Flight(myData);
    }
    /**
     * Identifier of the flight's arrival gate.
     */
    @NotNull public Builder arrivalGate(@NotNull String arrivalGate) {
      putValue("arrivalGate", arrivalGate);
      return this;
    }
    /**
     * The kind of aircraft (e.g., &quot;Boeing 747&quot;).
     */
    @NotNull public Builder aircraft(@NotNull String aircraft) {
      putValue("aircraft", aircraft);
      return this;
    }
    /**
     * The kind of aircraft (e.g., &quot;Boeing 747&quot;).
     */
    @NotNull public Builder aircraft(@NotNull Vehicle vehicle) {
      putValue("aircraft", vehicle);
      return this;
    }
    /**
     * The kind of aircraft (e.g., &quot;Boeing 747&quot;).
     */
    @NotNull public Builder aircraft(@NotNull Vehicle.Builder vehicle) {
      putValue("aircraft", vehicle.build());
      return this;
    }
    /**
     * Identifier of the flight's departure terminal.
     */
    @NotNull public Builder departureTerminal(@NotNull String departureTerminal) {
      putValue("departureTerminal", departureTerminal);
      return this;
    }
    /**
     * Description of the meals that will be provided or available for purchase.
     */
    @NotNull public Builder mealService(@NotNull String mealService) {
      putValue("mealService", mealService);
      return this;
    }
    /**
     * The estimated time the flight will take.
     */
    @NotNull public Builder estimatedFlightDuration(@NotNull Duration duration) {
      putValue("estimatedFlightDuration", duration);
      return this;
    }
    /**
     * The estimated time the flight will take.
     */
    @NotNull public Builder estimatedFlightDuration(@NotNull String estimatedFlightDuration) {
      putValue("estimatedFlightDuration", estimatedFlightDuration);
      return this;
    }
    /**
     * The type of boarding policy used by the airline (e.g. zone-based or group-based).
     */
    @NotNull public Builder boardingPolicy(@NotNull BoardingPolicyType boardingPolicyType) {
      putValue("boardingPolicy", boardingPolicyType);
      return this;
    }
    /**
     * Identifier of the flight's departure gate.
     */
    @NotNull public Builder departureGate(@NotNull String departureGate) {
      putValue("departureGate", departureGate);
      return this;
    }
    /**
     * The distance of the flight.
     */
    @NotNull public Builder flightDistance(@NotNull Distance distance) {
      putValue("flightDistance", distance);
      return this;
    }
    /**
     * The distance of the flight.
     */
    @NotNull public Builder flightDistance(@NotNull Distance.Builder distance) {
      putValue("flightDistance", distance.build());
      return this;
    }
    /**
     * The distance of the flight.
     */
    @NotNull public Builder flightDistance(@NotNull String flightDistance) {
      putValue("flightDistance", flightDistance);
      return this;
    }
    /**
     * The unique identifier for a flight including the airline IATA code. For example, if describing United flight 110, where the IATA code for United is 'UA', the flightNumber is 'UA110'.
     */
    @NotNull public Builder flightNumber(@NotNull Identifier identifier) {
      putValue("flightNumber", identifier);
      return this;
    }
    /**
     * Identifier of the flight's arrival terminal.
     */
    @NotNull public Builder arrivalTerminal(@NotNull String arrivalTerminal) {
      putValue("arrivalTerminal", arrivalTerminal);
      return this;
    }
    /**
     * An entity which offers (sells / leases / lends / loans) the services / goods.  A seller may also be a provider.
     */
    @NotNull public Builder seller(@NotNull Participant participant) {
      putValue("seller", participant);
      return this;
    }
    /**
     * The airport where the flight originates.
     */
    @NotNull public Builder departureAirport(@NotNull Airport airport) {
      putValue("departureAirport", airport);
      return this;
    }
    /**
     * The airport where the flight originates.
     */
    @NotNull public Builder departureAirport(@NotNull Airport.Builder airport) {
      putValue("departureAirport", airport.build());
      return this;
    }
    /**
     * The airport where the flight terminates.
     */
    @NotNull public Builder arrivalAirport(@NotNull Airport airport) {
      putValue("arrivalAirport", airport);
      return this;
    }
    /**
     * The airport where the flight terminates.
     */
    @NotNull public Builder arrivalAirport(@NotNull Airport.Builder airport) {
      putValue("arrivalAirport", airport.build());
      return this;
    }
    /**
     * The time when a passenger can check into the flight online.
     */
    @NotNull public Builder webCheckinTime(@NotNull java.util.Date date) {
      putValue("webCheckinTime", date);
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
      if ("arrivalGate".equals(key) && value instanceof String) { this.arrivalGate((String)value); return; }
      if ("arrivalGates".equals(key) && value instanceof String) { this.arrivalGate((String)value); return; }
      if ("aircraft".equals(key) && value instanceof String) { this.aircraft((String)value); return; }
      if ("aircrafts".equals(key) && value instanceof String) { this.aircraft((String)value); return; }
      if ("aircraft".equals(key) && value instanceof Vehicle) { this.aircraft((Vehicle)value); return; }
      if ("aircrafts".equals(key) && value instanceof Vehicle) { this.aircraft((Vehicle)value); return; }
      if ("departureTerminal".equals(key) && value instanceof String) { this.departureTerminal((String)value); return; }
      if ("departureTerminals".equals(key) && value instanceof String) { this.departureTerminal((String)value); return; }
      if ("mealService".equals(key) && value instanceof String) { this.mealService((String)value); return; }
      if ("mealServices".equals(key) && value instanceof String) { this.mealService((String)value); return; }
      if ("estimatedFlightDuration".equals(key) && value instanceof Duration) { this.estimatedFlightDuration((Duration)value); return; }
      if ("estimatedFlightDurations".equals(key) && value instanceof Duration) { this.estimatedFlightDuration((Duration)value); return; }
      if ("estimatedFlightDuration".equals(key) && value instanceof String) { this.estimatedFlightDuration((String)value); return; }
      if ("estimatedFlightDurations".equals(key) && value instanceof String) { this.estimatedFlightDuration((String)value); return; }
      if ("boardingPolicy".equals(key) && value instanceof BoardingPolicyType) { this.boardingPolicy((BoardingPolicyType)value); return; }
      if ("boardingPolicys".equals(key) && value instanceof BoardingPolicyType) { this.boardingPolicy((BoardingPolicyType)value); return; }
      if ("departureGate".equals(key) && value instanceof String) { this.departureGate((String)value); return; }
      if ("departureGates".equals(key) && value instanceof String) { this.departureGate((String)value); return; }
      if ("flightDistance".equals(key) && value instanceof Distance) { this.flightDistance((Distance)value); return; }
      if ("flightDistances".equals(key) && value instanceof Distance) { this.flightDistance((Distance)value); return; }
      if ("flightDistance".equals(key) && value instanceof String) { this.flightDistance((String)value); return; }
      if ("flightDistances".equals(key) && value instanceof String) { this.flightDistance((String)value); return; }
      if ("flightNumber".equals(key) && value instanceof Identifier) { this.flightNumber((Identifier)value); return; }
      if ("flightNumbers".equals(key) && value instanceof Identifier) { this.flightNumber((Identifier)value); return; }
      if ("arrivalTerminal".equals(key) && value instanceof String) { this.arrivalTerminal((String)value); return; }
      if ("arrivalTerminals".equals(key) && value instanceof String) { this.arrivalTerminal((String)value); return; }
      if ("seller".equals(key) && value instanceof Participant) { this.seller((Participant)value); return; }
      if ("sellers".equals(key) && value instanceof Participant) { this.seller((Participant)value); return; }
      if ("departureAirport".equals(key) && value instanceof Airport) { this.departureAirport((Airport)value); return; }
      if ("departureAirports".equals(key) && value instanceof Airport) { this.departureAirport((Airport)value); return; }
      if ("arrivalAirport".equals(key) && value instanceof Airport) { this.arrivalAirport((Airport)value); return; }
      if ("arrivalAirports".equals(key) && value instanceof Airport) { this.arrivalAirport((Airport)value); return; }
      if ("webCheckinTime".equals(key) && value instanceof java.util.Date) { this.webCheckinTime((java.util.Date)value); return; }
      if ("webCheckinTimes".equals(key) && value instanceof java.util.Date) { this.webCheckinTime((java.util.Date)value); return; }
      super.fromMap(key, value);
    }
  }
  
}
