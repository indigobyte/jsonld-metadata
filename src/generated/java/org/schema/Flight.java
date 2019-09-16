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
   * The airport where the flight originates.
   */
  @JsonIgnore public Airport getDepartureAirport() {
    return (Airport) getValue("departureAirport");
  }
  /**
   * The airport where the flight originates.
   */
  @JsonIgnore public Collection<Airport> getDepartureAirports() {
    final Object current = myData.get("departureAirport");
    if (current == null) return Collections.emptyList();
    if (current instanceof Collection) {
      return (Collection<Airport>) current;
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
  @JsonIgnore public Collection<Airport> getArrivalAirports() {
    final Object current = myData.get("arrivalAirport");
    if (current == null) return Collections.emptyList();
    if (current instanceof Collection) {
      return (Collection<Airport>) current;
    }
    return Arrays.asList((Airport) current);
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
  @JsonIgnore public Collection<String> getDepartureGates() {
    final Object current = myData.get("departureGate");
    if (current == null) return Collections.emptyList();
    if (current instanceof Collection) {
      return (Collection<String>) current;
    }
    return Arrays.asList((String) current);
  }
  /**
   * Identifier of the flight's arrival gate.
   */
  @JsonIgnore public String getArrivalGate() {
    return (String) getValue("arrivalGate");
  }
  /**
   * Identifier of the flight's arrival gate.
   */
  @JsonIgnore public Collection<String> getArrivalGates() {
    final Object current = myData.get("arrivalGate");
    if (current == null) return Collections.emptyList();
    if (current instanceof Collection) {
      return (Collection<String>) current;
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
  @JsonIgnore public Collection<BoardingPolicyType> getBoardingPolicys() {
    final Object current = myData.get("boardingPolicy");
    if (current == null) return Collections.emptyList();
    if (current instanceof Collection) {
      return (Collection<BoardingPolicyType>) current;
    }
    return Arrays.asList((BoardingPolicyType) current);
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
  @JsonIgnore public Collection<String> getDepartureTerminals() {
    final Object current = myData.get("departureTerminal");
    if (current == null) return Collections.emptyList();
    if (current instanceof Collection) {
      return (Collection<String>) current;
    }
    return Arrays.asList((String) current);
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
  @JsonIgnore public Collection<String> getArrivalTerminals() {
    final Object current = myData.get("arrivalTerminal");
    if (current == null) return Collections.emptyList();
    if (current instanceof Collection) {
      return (Collection<String>) current;
    }
    return Arrays.asList((String) current);
  }
  /**
   * The kind of aircraft (e.g., "Boeing 747").
   */
  @JsonIgnore public String getAircraftString() {
    return (String) getValue("aircraft");
  }
  /**
   * The kind of aircraft (e.g., "Boeing 747").
   */
  @JsonIgnore public Collection<String> getAircraftStrings() {
    final Object current = myData.get("aircraft");
    if (current == null) return Collections.emptyList();
    if (current instanceof Collection) {
      return (Collection<String>) current;
    }
    return Arrays.asList((String) current);
  }
  /**
   * The kind of aircraft (e.g., "Boeing 747").
   */
  @JsonIgnore public Vehicle getAircraftVehicle() {
    return (Vehicle) getValue("aircraft");
  }
  /**
   * The kind of aircraft (e.g., "Boeing 747").
   */
  @JsonIgnore public Collection<Vehicle> getAircraftVehicles() {
    final Object current = myData.get("aircraft");
    if (current == null) return Collections.emptyList();
    if (current instanceof Collection) {
      return (Collection<Vehicle>) current;
    }
    return Arrays.asList((Vehicle) current);
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
  @JsonIgnore public Collection<String> getMealServices() {
    final Object current = myData.get("mealService");
    if (current == null) return Collections.emptyList();
    if (current instanceof Collection) {
      return (Collection<String>) current;
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
  @JsonIgnore public Collection<Duration> getEstimatedFlightDurationDurations() {
    final Object current = myData.get("estimatedFlightDuration");
    if (current == null) return Collections.emptyList();
    if (current instanceof Collection) {
      return (Collection<Duration>) current;
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
  @JsonIgnore public Collection<String> getEstimatedFlightDurationStrings() {
    final Object current = myData.get("estimatedFlightDuration");
    if (current == null) return Collections.emptyList();
    if (current instanceof Collection) {
      return (Collection<String>) current;
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
  @JsonIgnore public Collection<Distance> getFlightDistanceDistances() {
    final Object current = myData.get("flightDistance");
    if (current == null) return Collections.emptyList();
    if (current instanceof Collection) {
      return (Collection<Distance>) current;
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
  @JsonIgnore public Collection<String> getFlightDistanceStrings() {
    final Object current = myData.get("flightDistance");
    if (current == null) return Collections.emptyList();
    if (current instanceof Collection) {
      return (Collection<String>) current;
    }
    return Arrays.asList((String) current);
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
  @JsonIgnore public Collection<java.util.Date> getWebCheckinTimes() {
    final Object current = myData.get("webCheckinTime");
    if (current == null) return Collections.emptyList();
    if (current instanceof Collection) {
      return (Collection<java.util.Date>) current;
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
     * Identifier of the flight's departure gate.
     */
    @NotNull public Builder departureGate(@NotNull String departureGate) {
      putValue("departureGate", departureGate);
      return this;
    }
    /**
     * Identifier of the flight's arrival gate.
     */
    @NotNull public Builder arrivalGate(@NotNull String arrivalGate) {
      putValue("arrivalGate", arrivalGate);
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
     * Identifier of the flight's departure terminal.
     */
    @NotNull public Builder departureTerminal(@NotNull String departureTerminal) {
      putValue("departureTerminal", departureTerminal);
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
     * The kind of aircraft (e.g., "Boeing 747").
     */
    @NotNull public Builder aircraft(@NotNull String aircraft) {
      putValue("aircraft", aircraft);
      return this;
    }
    /**
     * The kind of aircraft (e.g., "Boeing 747").
     */
    @NotNull public Builder aircraft(@NotNull Vehicle vehicle) {
      putValue("aircraft", vehicle);
      return this;
    }
    /**
     * The kind of aircraft (e.g., "Boeing 747").
     */
    @NotNull public Builder aircraft(@NotNull Vehicle.Builder vehicle) {
      putValue("aircraft", vehicle.build());
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
    @NotNull public Builder estimatedFlightDuration(@NotNull Duration.Builder duration) {
      putValue("estimatedFlightDuration", duration.build());
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
     * The expected departure time.
     */
    @NotNull public Builder departureTime(@NotNull java.util.Date date) {
      putValue("departureTime", date);
      return this;
    }
    /**
     * The expected arrival time.
     */
    @NotNull public Builder arrivalTime(@NotNull java.util.Date date) {
      putValue("arrivalTime", date);
      return this;
    }
    @NotNull public Builder additionalType(@NotNull AdditionalType additionalType) {
      putValue("additionalType", additionalType);
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
     * A description of the item.
     */
    @NotNull public Builder description(@NotNull DisambiguatingDescription disambiguatingDescription) {
      putValue("description", disambiguatingDescription);
      return this;
    }
    @NotNull public Builder disambiguatingDescription(@NotNull DisambiguatingDescription disambiguatingDescription) {
      putValue("disambiguatingDescription", disambiguatingDescription);
      return this;
    }
    /**
     * An image of the item. This can be a [[URL]] or a fully described [[ImageObject]].
     */
    @NotNull public Builder image(@NotNull Logo logo) {
      putValue("image", logo);
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
    /**
     * URL of a reference Web page that unambiguously indicates the item's identity. E.g. the URL of the item's Wikipedia page, Wikidata entry, or official website.
     */
    @NotNull public Builder sameAs(@NotNull String sameAs) {
      putValue("sameAs", sameAs);
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
     * The identifier property represents any kind of identifier for any kind of [[Thing]], such as ISBNs, GTIN codes, UUIDs etc. Schema.org provides dedicated properties for representing many of these, either as textual strings or as URL (URI) links. See [background notes](/docs/datamodel.html#identifierBg) for more details.
     *         
     */
    @NotNull public Builder identifier(@NotNull Isbn isbn) {
      putValue("identifier", isbn);
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
      if ("departureAirport".equals(key) && value instanceof Airport) { departureAirport((Airport)value); return; }
      if ("departureAirports".equals(key) && value instanceof Airport) { departureAirport((Airport)value); return; }
      if ("arrivalAirport".equals(key) && value instanceof Airport) { arrivalAirport((Airport)value); return; }
      if ("arrivalAirports".equals(key) && value instanceof Airport) { arrivalAirport((Airport)value); return; }
      if ("departureGate".equals(key) && value instanceof String) { departureGate((String)value); return; }
      if ("departureGates".equals(key) && value instanceof String) { departureGate((String)value); return; }
      if ("arrivalGate".equals(key) && value instanceof String) { arrivalGate((String)value); return; }
      if ("arrivalGates".equals(key) && value instanceof String) { arrivalGate((String)value); return; }
      if ("boardingPolicy".equals(key) && value instanceof BoardingPolicyType) { boardingPolicy((BoardingPolicyType)value); return; }
      if ("boardingPolicys".equals(key) && value instanceof BoardingPolicyType) { boardingPolicy((BoardingPolicyType)value); return; }
      if ("departureTerminal".equals(key) && value instanceof String) { departureTerminal((String)value); return; }
      if ("departureTerminals".equals(key) && value instanceof String) { departureTerminal((String)value); return; }
      if ("arrivalTerminal".equals(key) && value instanceof String) { arrivalTerminal((String)value); return; }
      if ("arrivalTerminals".equals(key) && value instanceof String) { arrivalTerminal((String)value); return; }
      if ("aircraft".equals(key) && value instanceof String) { aircraft((String)value); return; }
      if ("aircrafts".equals(key) && value instanceof String) { aircraft((String)value); return; }
      if ("aircraft".equals(key) && value instanceof Vehicle) { aircraft((Vehicle)value); return; }
      if ("aircrafts".equals(key) && value instanceof Vehicle) { aircraft((Vehicle)value); return; }
      if ("mealService".equals(key) && value instanceof String) { mealService((String)value); return; }
      if ("mealServices".equals(key) && value instanceof String) { mealService((String)value); return; }
      if ("estimatedFlightDuration".equals(key) && value instanceof Duration) { estimatedFlightDuration((Duration)value); return; }
      if ("estimatedFlightDurations".equals(key) && value instanceof Duration) { estimatedFlightDuration((Duration)value); return; }
      if ("estimatedFlightDuration".equals(key) && value instanceof String) { estimatedFlightDuration((String)value); return; }
      if ("estimatedFlightDurations".equals(key) && value instanceof String) { estimatedFlightDuration((String)value); return; }
      if ("flightDistance".equals(key) && value instanceof Distance) { flightDistance((Distance)value); return; }
      if ("flightDistances".equals(key) && value instanceof Distance) { flightDistance((Distance)value); return; }
      if ("flightDistance".equals(key) && value instanceof String) { flightDistance((String)value); return; }
      if ("flightDistances".equals(key) && value instanceof String) { flightDistance((String)value); return; }
      if ("webCheckinTime".equals(key) && value instanceof java.util.Date) { webCheckinTime((java.util.Date)value); return; }
      if ("webCheckinTimes".equals(key) && value instanceof java.util.Date) { webCheckinTime((java.util.Date)value); return; }
      super.fromMap(key, value);
    }
  }
  
}
