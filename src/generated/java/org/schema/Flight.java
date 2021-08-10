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
 * An airline flight.
 */
public class Flight extends Trip {
  /**
   * Identifier of the flight's arrival gate.
   * @return arrivalGate property set by first invocation of arrivalGate method or {@code null}.
   */
  @JsonIgnore public String getArrivalGate() {
    return (String) getValue("arrivalGate");
  }
  /**
   * Identifier of the flight's arrival gate.
   * @return all arrivalGate properties as {@link java.util.Collection} or an empty collection 
   * if arrivalGate was not set.
   */
  @JsonIgnore public java.util.Collection<String> getArrivalGates() {
    final java.lang.Object current = myData.get("arrivalGate");
    if (current == null) return Collections.emptyList();
    if (current instanceof java.util.Collection) {
      return (java.util.Collection<String>) current;
    }
    return Arrays.asList((String) current);
  }
  /**
   * The kind of aircraft (e.g., &quot;Boeing 747&quot;).
   * @return aircraft property set by first invocation of aircraft method or {@code null}.
   */
  @JsonIgnore public String getAircraftString() {
    return (String) getValue("aircraft");
  }
  /**
   * The kind of aircraft (e.g., &quot;Boeing 747&quot;).
   * @return all aircraft properties as {@link java.util.Collection} or an empty collection 
   * if aircraft was not set.
   */
  @JsonIgnore public java.util.Collection<String> getAircraftStrings() {
    final java.lang.Object current = myData.get("aircraft");
    if (current == null) return Collections.emptyList();
    if (current instanceof java.util.Collection) {
      return (java.util.Collection<String>) current;
    }
    return Arrays.asList((String) current);
  }
  /**
   * The kind of aircraft (e.g., &quot;Boeing 747&quot;).
   * @return aircraft property set by first invocation of aircraft method or {@code null}.
   */
  @JsonIgnore public Vehicle getAircraftVehicle() {
    return (Vehicle) getValue("aircraft");
  }
  /**
   * The kind of aircraft (e.g., &quot;Boeing 747&quot;).
   * @return all aircraft properties as {@link java.util.Collection} or an empty collection 
   * if aircraft was not set.
   */
  @JsonIgnore public java.util.Collection<Vehicle> getAircraftVehicles() {
    final java.lang.Object current = myData.get("aircraft");
    if (current == null) return Collections.emptyList();
    if (current instanceof java.util.Collection) {
      return (java.util.Collection<Vehicle>) current;
    }
    return Arrays.asList((Vehicle) current);
  }
  /**
   * Identifier of the flight's departure terminal.
   * @return departureTerminal property set by first invocation of departureTerminal method or {@code null}.
   */
  @JsonIgnore public String getDepartureTerminal() {
    return (String) getValue("departureTerminal");
  }
  /**
   * Identifier of the flight's departure terminal.
   * @return all departureTerminal properties as {@link java.util.Collection} or an empty collection 
   * if departureTerminal was not set.
   */
  @JsonIgnore public java.util.Collection<String> getDepartureTerminals() {
    final java.lang.Object current = myData.get("departureTerminal");
    if (current == null) return Collections.emptyList();
    if (current instanceof java.util.Collection) {
      return (java.util.Collection<String>) current;
    }
    return Arrays.asList((String) current);
  }
  /**
   * Description of the meals that will be provided or available for purchase.
   * @return mealService property set by first invocation of mealService method or {@code null}.
   */
  @JsonIgnore public String getMealService() {
    return (String) getValue("mealService");
  }
  /**
   * Description of the meals that will be provided or available for purchase.
   * @return all mealService properties as {@link java.util.Collection} or an empty collection 
   * if mealService was not set.
   */
  @JsonIgnore public java.util.Collection<String> getMealServices() {
    final java.lang.Object current = myData.get("mealService");
    if (current == null) return Collections.emptyList();
    if (current instanceof java.util.Collection) {
      return (java.util.Collection<String>) current;
    }
    return Arrays.asList((String) current);
  }
  /**
   * The estimated time the flight will take.
   * @return estimatedFlightDuration property set by first invocation of estimatedFlightDuration method or {@code null}.
   */
  @JsonIgnore public Duration getEstimatedFlightDurationDuration() {
    return (Duration) getValue("estimatedFlightDuration");
  }
  /**
   * The estimated time the flight will take.
   * @return all estimatedFlightDuration properties as {@link java.util.Collection} or an empty collection 
   * if estimatedFlightDuration was not set.
   */
  @JsonIgnore public java.util.Collection<Duration> getEstimatedFlightDurationDurations() {
    final java.lang.Object current = myData.get("estimatedFlightDuration");
    if (current == null) return Collections.emptyList();
    if (current instanceof java.util.Collection) {
      return (java.util.Collection<Duration>) current;
    }
    return Arrays.asList((Duration) current);
  }
  /**
   * The estimated time the flight will take.
   * @return estimatedFlightDuration property set by first invocation of estimatedFlightDuration method or {@code null}.
   */
  @JsonIgnore public String getEstimatedFlightDurationString() {
    return (String) getValue("estimatedFlightDuration");
  }
  /**
   * The estimated time the flight will take.
   * @return all estimatedFlightDuration properties as {@link java.util.Collection} or an empty collection 
   * if estimatedFlightDuration was not set.
   */
  @JsonIgnore public java.util.Collection<String> getEstimatedFlightDurationStrings() {
    final java.lang.Object current = myData.get("estimatedFlightDuration");
    if (current == null) return Collections.emptyList();
    if (current instanceof java.util.Collection) {
      return (java.util.Collection<String>) current;
    }
    return Arrays.asList((String) current);
  }
  /**
   * The type of boarding policy used by the airline (e.g. zone-based or group-based).
   * @return boardingPolicy property set by first invocation of boardingPolicy method or {@code null}.
   */
  @JsonIgnore public BoardingPolicyType getBoardingPolicy() {
    return (BoardingPolicyType) getValue("boardingPolicy");
  }
  /**
   * The type of boarding policy used by the airline (e.g. zone-based or group-based).
   * @return all boardingPolicy properties as {@link java.util.Collection} or an empty collection 
   * if boardingPolicy was not set.
   */
  @JsonIgnore public java.util.Collection<BoardingPolicyType> getBoardingPolicys() {
    final java.lang.Object current = myData.get("boardingPolicy");
    if (current == null) return Collections.emptyList();
    if (current instanceof java.util.Collection) {
      return (java.util.Collection<BoardingPolicyType>) current;
    }
    return Arrays.asList((BoardingPolicyType) current);
  }
  /**
   * Identifier of the flight's departure gate.
   * @return departureGate property set by first invocation of departureGate method or {@code null}.
   */
  @JsonIgnore public String getDepartureGate() {
    return (String) getValue("departureGate");
  }
  /**
   * Identifier of the flight's departure gate.
   * @return all departureGate properties as {@link java.util.Collection} or an empty collection 
   * if departureGate was not set.
   */
  @JsonIgnore public java.util.Collection<String> getDepartureGates() {
    final java.lang.Object current = myData.get("departureGate");
    if (current == null) return Collections.emptyList();
    if (current instanceof java.util.Collection) {
      return (java.util.Collection<String>) current;
    }
    return Arrays.asList((String) current);
  }
  /**
   * The distance of the flight.
   * @return flightDistance property set by first invocation of flightDistance method or {@code null}.
   */
  @JsonIgnore public Distance getFlightDistanceDistance() {
    return (Distance) getValue("flightDistance");
  }
  /**
   * The distance of the flight.
   * @return all flightDistance properties as {@link java.util.Collection} or an empty collection 
   * if flightDistance was not set.
   */
  @JsonIgnore public java.util.Collection<Distance> getFlightDistanceDistances() {
    final java.lang.Object current = myData.get("flightDistance");
    if (current == null) return Collections.emptyList();
    if (current instanceof java.util.Collection) {
      return (java.util.Collection<Distance>) current;
    }
    return Arrays.asList((Distance) current);
  }
  /**
   * The distance of the flight.
   * @return flightDistance property set by first invocation of flightDistance method or {@code null}.
   */
  @JsonIgnore public String getFlightDistanceString() {
    return (String) getValue("flightDistance");
  }
  /**
   * The distance of the flight.
   * @return all flightDistance properties as {@link java.util.Collection} or an empty collection 
   * if flightDistance was not set.
   */
  @JsonIgnore public java.util.Collection<String> getFlightDistanceStrings() {
    final java.lang.Object current = myData.get("flightDistance");
    if (current == null) return Collections.emptyList();
    if (current instanceof java.util.Collection) {
      return (java.util.Collection<String>) current;
    }
    return Arrays.asList((String) current);
  }
  /**
   * The unique identifier for a flight including the airline IATA code. For example, if describing United flight 110, where the IATA code for United is 'UA', the flightNumber is 'UA110'.
   * @return flightNumber property set by first invocation of flightNumber method or {@code null}.
   */
  @JsonIgnore public Identifier getFlightNumber() {
    return (Identifier) getValue("flightNumber");
  }
  /**
   * The unique identifier for a flight including the airline IATA code. For example, if describing United flight 110, where the IATA code for United is 'UA', the flightNumber is 'UA110'.
   * @return all flightNumber properties as {@link java.util.Collection} or an empty collection 
   * if flightNumber was not set.
   */
  @JsonIgnore public java.util.Collection<Identifier> getFlightNumbers() {
    final java.lang.Object current = myData.get("flightNumber");
    if (current == null) return Collections.emptyList();
    if (current instanceof java.util.Collection) {
      return (java.util.Collection<Identifier>) current;
    }
    return Arrays.asList((Identifier) current);
  }
  /**
   * Identifier of the flight's arrival terminal.
   * @return arrivalTerminal property set by first invocation of arrivalTerminal method or {@code null}.
   */
  @JsonIgnore public String getArrivalTerminal() {
    return (String) getValue("arrivalTerminal");
  }
  /**
   * Identifier of the flight's arrival terminal.
   * @return all arrivalTerminal properties as {@link java.util.Collection} or an empty collection 
   * if arrivalTerminal was not set.
   */
  @JsonIgnore public java.util.Collection<String> getArrivalTerminals() {
    final java.lang.Object current = myData.get("arrivalTerminal");
    if (current == null) return Collections.emptyList();
    if (current instanceof java.util.Collection) {
      return (java.util.Collection<String>) current;
    }
    return Arrays.asList((String) current);
  }
  /**
   * An entity which offers (sells / leases / lends / loans) the services / goods.  A seller may also be a provider.
   * @return seller property set by first invocation of seller method or {@code null}.
   */
  @JsonIgnore public Participant getSeller() {
    return (Participant) getValue("seller");
  }
  /**
   * An entity which offers (sells / leases / lends / loans) the services / goods.  A seller may also be a provider.
   * @return all seller properties as {@link java.util.Collection} or an empty collection 
   * if seller was not set.
   */
  @JsonIgnore public java.util.Collection<Participant> getSellers() {
    final java.lang.Object current = myData.get("seller");
    if (current == null) return Collections.emptyList();
    if (current instanceof java.util.Collection) {
      return (java.util.Collection<Participant>) current;
    }
    return Arrays.asList((Participant) current);
  }
  /**
   * The airport where the flight originates.
   * @return departureAirport property set by first invocation of departureAirport method or {@code null}.
   */
  @JsonIgnore public Airport getDepartureAirport() {
    return (Airport) getValue("departureAirport");
  }
  /**
   * The airport where the flight originates.
   * @return all departureAirport properties as {@link java.util.Collection} or an empty collection 
   * if departureAirport was not set.
   */
  @JsonIgnore public java.util.Collection<Airport> getDepartureAirports() {
    final java.lang.Object current = myData.get("departureAirport");
    if (current == null) return Collections.emptyList();
    if (current instanceof java.util.Collection) {
      return (java.util.Collection<Airport>) current;
    }
    return Arrays.asList((Airport) current);
  }
  /**
   * The airport where the flight terminates.
   * @return arrivalAirport property set by first invocation of arrivalAirport method or {@code null}.
   */
  @JsonIgnore public Airport getArrivalAirport() {
    return (Airport) getValue("arrivalAirport");
  }
  /**
   * The airport where the flight terminates.
   * @return all arrivalAirport properties as {@link java.util.Collection} or an empty collection 
   * if arrivalAirport was not set.
   */
  @JsonIgnore public java.util.Collection<Airport> getArrivalAirports() {
    final java.lang.Object current = myData.get("arrivalAirport");
    if (current == null) return Collections.emptyList();
    if (current instanceof java.util.Collection) {
      return (java.util.Collection<Airport>) current;
    }
    return Arrays.asList((Airport) current);
  }
  /**
   * The time when a passenger can check into the flight online.
   * @return webCheckinTime property set by first invocation of webCheckinTime method or {@code null}.
   */
  @JsonIgnore public java.util.Date getWebCheckinTime() {
    return (java.util.Date) getValue("webCheckinTime");
  }
  /**
   * The time when a passenger can check into the flight online.
   * @return all webCheckinTime properties as {@link java.util.Collection} or an empty collection 
   * if webCheckinTime was not set.
   */
  @JsonIgnore public java.util.Collection<java.util.Date> getWebCheckinTimes() {
    final java.lang.Object current = myData.get("webCheckinTime");
    if (current == null) return Collections.emptyList();
    if (current instanceof java.util.Collection) {
      return (java.util.Collection<java.util.Date>) current;
    }
    return Arrays.asList((java.util.Date) current);
  }
  protected Flight(java.util.Map<String,java.lang.Object> data) {
    super(data);
  }
  /**
   * @return new {@link Builder} initialized with this instance's data
   */
  @NotNull public Builder toBuilder() {
    return new Builder(new HashMap<>(this.myData));
  }
  
  /**
   * Builder for {@link Flight}
   */
  public static class Builder extends Trip.Builder {
    public Builder(@NotNull HashMap<String,java.lang.Object> data) {
      super(data);
    }
    @NotNull public Flight build() {
      return new Flight(myData);
    }
    /**
     * Identifier of the flight's arrival gate.
     * @param arrivalGate value to set
     * @return this builder instance
     */
    @NotNull public Builder arrivalGate(@NotNull String arrivalGate) {
      putValue("arrivalGate", arrivalGate);
      return this;
    }
    /**
     * Remove arrivalGate property from the builder.
     * If this property is repeatable, all instances are removed.
     * @return this builder instance
     */
    @NotNull public Builder removeArrivalGate() {
      removeValue("arrivalGate");
      return this;
    }
    /**
     * Get currently set value for arrivalGate property in this builder.
     * @return previously set value or {@code null}. If multiple values have been 
     * set to this property, then {@link java.util.Collection} instance will be 
     * returned.
     */
    @Nullable public java.lang.Object getArrivalGate() {
      return myData.get("arrivalGate");
    }
    /**
     * The kind of aircraft (e.g., &quot;Boeing 747&quot;).
     * @param aircraft value to set
     * @return this builder instance
     */
    @NotNull public Builder aircraft(@NotNull String aircraft) {
      putValue("aircraft", aircraft);
      return this;
    }
    /**
     * The kind of aircraft (e.g., &quot;Boeing 747&quot;).
     * @param vehicle value to set
     * @return this builder instance
     */
    @NotNull public Builder aircraft(@NotNull Vehicle vehicle) {
      putValue("aircraft", vehicle);
      return this;
    }
    /**
     * The kind of aircraft (e.g., &quot;Boeing 747&quot;).
     * @param vehicle value to set
     * @return this builder instance
     */
    @NotNull public Builder aircraft(@NotNull Vehicle.Builder vehicle) {
      putValue("aircraft", vehicle.build());
      return this;
    }
    /**
     * Remove aircraft property from the builder.
     * If this property is repeatable, all instances are removed.
     * @return this builder instance
     */
    @NotNull public Builder removeAircraft() {
      removeValue("aircraft");
      return this;
    }
    /**
     * Get currently set value for aircraft property in this builder.
     * @return previously set value or {@code null}. If multiple values have been 
     * set to this property, then {@link java.util.Collection} instance will be 
     * returned.
     */
    @Nullable public java.lang.Object getAircraft() {
      return myData.get("aircraft");
    }
    /**
     * Identifier of the flight's departure terminal.
     * @param departureTerminal value to set
     * @return this builder instance
     */
    @NotNull public Builder departureTerminal(@NotNull String departureTerminal) {
      putValue("departureTerminal", departureTerminal);
      return this;
    }
    /**
     * Remove departureTerminal property from the builder.
     * If this property is repeatable, all instances are removed.
     * @return this builder instance
     */
    @NotNull public Builder removeDepartureTerminal() {
      removeValue("departureTerminal");
      return this;
    }
    /**
     * Get currently set value for departureTerminal property in this builder.
     * @return previously set value or {@code null}. If multiple values have been 
     * set to this property, then {@link java.util.Collection} instance will be 
     * returned.
     */
    @Nullable public java.lang.Object getDepartureTerminal() {
      return myData.get("departureTerminal");
    }
    /**
     * Description of the meals that will be provided or available for purchase.
     * @param mealService value to set
     * @return this builder instance
     */
    @NotNull public Builder mealService(@NotNull String mealService) {
      putValue("mealService", mealService);
      return this;
    }
    /**
     * Remove mealService property from the builder.
     * If this property is repeatable, all instances are removed.
     * @return this builder instance
     */
    @NotNull public Builder removeMealService() {
      removeValue("mealService");
      return this;
    }
    /**
     * Get currently set value for mealService property in this builder.
     * @return previously set value or {@code null}. If multiple values have been 
     * set to this property, then {@link java.util.Collection} instance will be 
     * returned.
     */
    @Nullable public java.lang.Object getMealService() {
      return myData.get("mealService");
    }
    /**
     * The estimated time the flight will take.
     * @param duration value to set
     * @return this builder instance
     */
    @NotNull public Builder estimatedFlightDuration(@NotNull Duration duration) {
      putValue("estimatedFlightDuration", duration);
      return this;
    }
    /**
     * The estimated time the flight will take.
     * @param estimatedFlightDuration value to set
     * @return this builder instance
     */
    @NotNull public Builder estimatedFlightDuration(@NotNull String estimatedFlightDuration) {
      putValue("estimatedFlightDuration", estimatedFlightDuration);
      return this;
    }
    /**
     * Remove estimatedFlightDuration property from the builder.
     * If this property is repeatable, all instances are removed.
     * @return this builder instance
     */
    @NotNull public Builder removeEstimatedFlightDuration() {
      removeValue("estimatedFlightDuration");
      return this;
    }
    /**
     * Get currently set value for estimatedFlightDuration property in this builder.
     * @return previously set value or {@code null}. If multiple values have been 
     * set to this property, then {@link java.util.Collection} instance will be 
     * returned.
     */
    @Nullable public java.lang.Object getEstimatedFlightDuration() {
      return myData.get("estimatedFlightDuration");
    }
    /**
     * The type of boarding policy used by the airline (e.g. zone-based or group-based).
     * @param boardingPolicyType value to set
     * @return this builder instance
     */
    @NotNull public Builder boardingPolicy(@NotNull BoardingPolicyType boardingPolicyType) {
      putValue("boardingPolicy", boardingPolicyType);
      return this;
    }
    /**
     * Remove boardingPolicy property from the builder.
     * If this property is repeatable, all instances are removed.
     * @return this builder instance
     */
    @NotNull public Builder removeBoardingPolicy() {
      removeValue("boardingPolicy");
      return this;
    }
    /**
     * Get currently set value for boardingPolicy property in this builder.
     * @return previously set value or {@code null}. If multiple values have been 
     * set to this property, then {@link java.util.Collection} instance will be 
     * returned.
     */
    @Nullable public java.lang.Object getBoardingPolicy() {
      return myData.get("boardingPolicy");
    }
    /**
     * Identifier of the flight's departure gate.
     * @param departureGate value to set
     * @return this builder instance
     */
    @NotNull public Builder departureGate(@NotNull String departureGate) {
      putValue("departureGate", departureGate);
      return this;
    }
    /**
     * Remove departureGate property from the builder.
     * If this property is repeatable, all instances are removed.
     * @return this builder instance
     */
    @NotNull public Builder removeDepartureGate() {
      removeValue("departureGate");
      return this;
    }
    /**
     * Get currently set value for departureGate property in this builder.
     * @return previously set value or {@code null}. If multiple values have been 
     * set to this property, then {@link java.util.Collection} instance will be 
     * returned.
     */
    @Nullable public java.lang.Object getDepartureGate() {
      return myData.get("departureGate");
    }
    /**
     * The distance of the flight.
     * @param distance value to set
     * @return this builder instance
     */
    @NotNull public Builder flightDistance(@NotNull Distance distance) {
      putValue("flightDistance", distance);
      return this;
    }
    /**
     * The distance of the flight.
     * @param distance value to set
     * @return this builder instance
     */
    @NotNull public Builder flightDistance(@NotNull Distance.Builder distance) {
      putValue("flightDistance", distance.build());
      return this;
    }
    /**
     * The distance of the flight.
     * @param flightDistance value to set
     * @return this builder instance
     */
    @NotNull public Builder flightDistance(@NotNull String flightDistance) {
      putValue("flightDistance", flightDistance);
      return this;
    }
    /**
     * Remove flightDistance property from the builder.
     * If this property is repeatable, all instances are removed.
     * @return this builder instance
     */
    @NotNull public Builder removeFlightDistance() {
      removeValue("flightDistance");
      return this;
    }
    /**
     * Get currently set value for flightDistance property in this builder.
     * @return previously set value or {@code null}. If multiple values have been 
     * set to this property, then {@link java.util.Collection} instance will be 
     * returned.
     */
    @Nullable public java.lang.Object getFlightDistance() {
      return myData.get("flightDistance");
    }
    /**
     * The unique identifier for a flight including the airline IATA code. For example, if describing United flight 110, where the IATA code for United is 'UA', the flightNumber is 'UA110'.
     * @param identifier value to set
     * @return this builder instance
     */
    @NotNull public Builder flightNumber(@NotNull Identifier identifier) {
      putValue("flightNumber", identifier);
      return this;
    }
    /**
     * Remove flightNumber property from the builder.
     * If this property is repeatable, all instances are removed.
     * @return this builder instance
     */
    @NotNull public Builder removeFlightNumber() {
      removeValue("flightNumber");
      return this;
    }
    /**
     * Get currently set value for flightNumber property in this builder.
     * @return previously set value or {@code null}. If multiple values have been 
     * set to this property, then {@link java.util.Collection} instance will be 
     * returned.
     */
    @Nullable public java.lang.Object getFlightNumber() {
      return myData.get("flightNumber");
    }
    /**
     * Identifier of the flight's arrival terminal.
     * @param arrivalTerminal value to set
     * @return this builder instance
     */
    @NotNull public Builder arrivalTerminal(@NotNull String arrivalTerminal) {
      putValue("arrivalTerminal", arrivalTerminal);
      return this;
    }
    /**
     * Remove arrivalTerminal property from the builder.
     * If this property is repeatable, all instances are removed.
     * @return this builder instance
     */
    @NotNull public Builder removeArrivalTerminal() {
      removeValue("arrivalTerminal");
      return this;
    }
    /**
     * Get currently set value for arrivalTerminal property in this builder.
     * @return previously set value or {@code null}. If multiple values have been 
     * set to this property, then {@link java.util.Collection} instance will be 
     * returned.
     */
    @Nullable public java.lang.Object getArrivalTerminal() {
      return myData.get("arrivalTerminal");
    }
    /**
     * An entity which offers (sells / leases / lends / loans) the services / goods.  A seller may also be a provider.
     * @param participant value to set
     * @return this builder instance
     */
    @NotNull public Builder seller(@NotNull Participant participant) {
      putValue("seller", participant);
      return this;
    }
    /**
     * Remove seller property from the builder.
     * If this property is repeatable, all instances are removed.
     * @return this builder instance
     */
    @NotNull public Builder removeSeller() {
      removeValue("seller");
      return this;
    }
    /**
     * Get currently set value for seller property in this builder.
     * @return previously set value or {@code null}. If multiple values have been 
     * set to this property, then {@link java.util.Collection} instance will be 
     * returned.
     */
    @Nullable public java.lang.Object getSeller() {
      return myData.get("seller");
    }
    /**
     * The airport where the flight originates.
     * @param airport value to set
     * @return this builder instance
     */
    @NotNull public Builder departureAirport(@NotNull Airport airport) {
      putValue("departureAirport", airport);
      return this;
    }
    /**
     * The airport where the flight originates.
     * @param airport value to set
     * @return this builder instance
     */
    @NotNull public Builder departureAirport(@NotNull Airport.Builder airport) {
      putValue("departureAirport", airport.build());
      return this;
    }
    /**
     * Remove departureAirport property from the builder.
     * If this property is repeatable, all instances are removed.
     * @return this builder instance
     */
    @NotNull public Builder removeDepartureAirport() {
      removeValue("departureAirport");
      return this;
    }
    /**
     * Get currently set value for departureAirport property in this builder.
     * @return previously set value or {@code null}. If multiple values have been 
     * set to this property, then {@link java.util.Collection} instance will be 
     * returned.
     */
    @Nullable public java.lang.Object getDepartureAirport() {
      return myData.get("departureAirport");
    }
    /**
     * The airport where the flight terminates.
     * @param airport value to set
     * @return this builder instance
     */
    @NotNull public Builder arrivalAirport(@NotNull Airport airport) {
      putValue("arrivalAirport", airport);
      return this;
    }
    /**
     * The airport where the flight terminates.
     * @param airport value to set
     * @return this builder instance
     */
    @NotNull public Builder arrivalAirport(@NotNull Airport.Builder airport) {
      putValue("arrivalAirport", airport.build());
      return this;
    }
    /**
     * Remove arrivalAirport property from the builder.
     * If this property is repeatable, all instances are removed.
     * @return this builder instance
     */
    @NotNull public Builder removeArrivalAirport() {
      removeValue("arrivalAirport");
      return this;
    }
    /**
     * Get currently set value for arrivalAirport property in this builder.
     * @return previously set value or {@code null}. If multiple values have been 
     * set to this property, then {@link java.util.Collection} instance will be 
     * returned.
     */
    @Nullable public java.lang.Object getArrivalAirport() {
      return myData.get("arrivalAirport");
    }
    /**
     * The time when a passenger can check into the flight online.
     * @param date value to set
     * @return this builder instance
     */
    @NotNull public Builder webCheckinTime(@NotNull java.util.Date date) {
      putValue("webCheckinTime", date);
      return this;
    }
    /**
     * Remove webCheckinTime property from the builder.
     * If this property is repeatable, all instances are removed.
     * @return this builder instance
     */
    @NotNull public Builder removeWebCheckinTime() {
      removeValue("webCheckinTime");
      return this;
    }
    /**
     * Get currently set value for webCheckinTime property in this builder.
     * @return previously set value or {@code null}. If multiple values have been 
     * set to this property, then {@link java.util.Collection} instance will be 
     * returned.
     */
    @Nullable public java.lang.Object getWebCheckinTime() {
      return myData.get("webCheckinTime");
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
