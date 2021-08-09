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
 * A vehicle is a device that is designed or used to transport people or cargo over land, water, air, or through space.
 */
public class Vehicle extends Product {
  /**
   * The number of passengers that can be seated in the vehicle, both in terms of the physical space available, and in terms of limitations set by law.\n\nTypical unit code(s): C62 for persons.
   * @return vehicleSeatingCapacity property set by first invocation of vehicleSeatingCapacity method or {@code null}.
   */
  @JsonIgnore public Number getVehicleSeatingCapacityNumber() {
    return (Number) getValue("vehicleSeatingCapacity");
  }
  /**
   * The number of passengers that can be seated in the vehicle, both in terms of the physical space available, and in terms of limitations set by law.\n\nTypical unit code(s): C62 for persons.
   * @return all vehicleSeatingCapacity properties as {@link java.util.Collection} or an empty collection 
   * if vehicleSeatingCapacity was not set.
   */
  @JsonIgnore public java.util.Collection<Number> getVehicleSeatingCapacityNumbers() {
    final java.lang.Object current = myData.get("vehicleSeatingCapacity");
    if (current == null) return Collections.emptyList();
    if (current instanceof java.util.Collection) {
      return (java.util.Collection<Number>) current;
    }
    return Arrays.asList((Number) current);
  }
  /**
   * The number of passengers that can be seated in the vehicle, both in terms of the physical space available, and in terms of limitations set by law.\n\nTypical unit code(s): C62 for persons.
   * @return vehicleSeatingCapacity property set by first invocation of vehicleSeatingCapacity method or {@code null}.
   */
  @JsonIgnore public QuantitativeValue getVehicleSeatingCapacityQuantitativeValue() {
    return (QuantitativeValue) getValue("vehicleSeatingCapacity");
  }
  /**
   * The number of passengers that can be seated in the vehicle, both in terms of the physical space available, and in terms of limitations set by law.\n\nTypical unit code(s): C62 for persons.
   * @return all vehicleSeatingCapacity properties as {@link java.util.Collection} or an empty collection 
   * if vehicleSeatingCapacity was not set.
   */
  @JsonIgnore public java.util.Collection<QuantitativeValue> getVehicleSeatingCapacityQuantitativeValues() {
    final java.lang.Object current = myData.get("vehicleSeatingCapacity");
    if (current == null) return Collections.emptyList();
    if (current instanceof java.util.Collection) {
      return (java.util.Collection<QuantitativeValue>) current;
    }
    return Arrays.asList((QuantitativeValue) current);
  }
  /**
   * The drive wheel configuration, i.e. which roadwheels will receive torque from the vehicle's engine via the drivetrain.
   * @return driveWheelConfiguration property set by first invocation of driveWheelConfiguration method or {@code null}.
   */
  @JsonIgnore public DriveWheelConfigurationValue getDriveWheelConfigurationDriveWheelConfigurationValue() {
    return (DriveWheelConfigurationValue) getValue("driveWheelConfiguration");
  }
  /**
   * The drive wheel configuration, i.e. which roadwheels will receive torque from the vehicle's engine via the drivetrain.
   * @return all driveWheelConfiguration properties as {@link java.util.Collection} or an empty collection 
   * if driveWheelConfiguration was not set.
   */
  @JsonIgnore public java.util.Collection<DriveWheelConfigurationValue> getDriveWheelConfigurationDriveWheelConfigurationValues() {
    final java.lang.Object current = myData.get("driveWheelConfiguration");
    if (current == null) return Collections.emptyList();
    if (current instanceof java.util.Collection) {
      return (java.util.Collection<DriveWheelConfigurationValue>) current;
    }
    return Arrays.asList((DriveWheelConfigurationValue) current);
  }
  /**
   * The drive wheel configuration, i.e. which roadwheels will receive torque from the vehicle's engine via the drivetrain.
   * @return driveWheelConfiguration property set by first invocation of driveWheelConfiguration method or {@code null}.
   */
  @JsonIgnore public String getDriveWheelConfigurationString() {
    return (String) getValue("driveWheelConfiguration");
  }
  /**
   * The drive wheel configuration, i.e. which roadwheels will receive torque from the vehicle's engine via the drivetrain.
   * @return all driveWheelConfiguration properties as {@link java.util.Collection} or an empty collection 
   * if driveWheelConfiguration was not set.
   */
  @JsonIgnore public java.util.Collection<String> getDriveWheelConfigurationStrings() {
    final java.lang.Object current = myData.get("driveWheelConfiguration");
    if (current == null) return Collections.emptyList();
    if (current instanceof java.util.Collection) {
      return (java.util.Collection<String>) current;
    }
    return Arrays.asList((String) current);
  }
  /**
   * The date the item e.g. vehicle was purchased by the current owner.
   * @return purchaseDate property set by first invocation of purchaseDate method or {@code null}.
   */
  @JsonIgnore public java.util.Date getPurchaseDate() {
    return (java.util.Date) getValue("purchaseDate");
  }
  /**
   * The date the item e.g. vehicle was purchased by the current owner.
   * @return all purchaseDate properties as {@link java.util.Collection} or an empty collection 
   * if purchaseDate was not set.
   */
  @JsonIgnore public java.util.Collection<java.util.Date> getPurchaseDates() {
    final java.lang.Object current = myData.get("purchaseDate");
    if (current == null) return Collections.emptyList();
    if (current instanceof java.util.Collection) {
      return (java.util.Collection<java.util.Date>) current;
    }
    return Arrays.asList((java.util.Date) current);
  }
  /**
   * A [callsign](https://en.wikipedia.org/wiki/Call_sign), as used in broadcasting and radio communications to identify people, radio and TV stations, or vehicles.
   * @return callSign property set by first invocation of callSign method or {@code null}.
   */
  @JsonIgnore public Identifier getCallSign() {
    return (Identifier) getValue("callSign");
  }
  /**
   * A [callsign](https://en.wikipedia.org/wiki/Call_sign), as used in broadcasting and radio communications to identify people, radio and TV stations, or vehicles.
   * @return all callSign properties as {@link java.util.Collection} or an empty collection 
   * if callSign was not set.
   */
  @JsonIgnore public java.util.Collection<Identifier> getCallSigns() {
    final java.lang.Object current = myData.get("callSign");
    if (current == null) return Collections.emptyList();
    if (current instanceof java.util.Collection) {
      return (java.util.Collection<Identifier>) current;
    }
    return Arrays.asList((Identifier) current);
  }
  /**
   * The amount of fuel consumed for traveling a particular distance or temporal duration with the given vehicle (e.g. liters per 100 km).\n\n* Note 1: There are unfortunately no standard unit codes for liters per 100 km.  Use [[unitText]] to indicate the unit of measurement, e.g. L/100 km.\n* Note 2: There are two ways of indicating the fuel consumption, [[fuelConsumption]] (e.g. 8 liters per 100 km) and [[fuelEfficiency]] (e.g. 30 miles per gallon). They are reciprocal.\n* Note 3: Often, the absolute value is useful only when related to driving speed (&quot;at 80 km/h&quot;) or usage pattern (&quot;city traffic&quot;). You can use [[valueReference]] to link the value for the fuel consumption to another value.
   * @return fuelConsumption property set by first invocation of fuelConsumption method or {@code null}.
   */
  @JsonIgnore public QuantitativeValue getFuelConsumption() {
    return (QuantitativeValue) getValue("fuelConsumption");
  }
  /**
   * The amount of fuel consumed for traveling a particular distance or temporal duration with the given vehicle (e.g. liters per 100 km).\n\n* Note 1: There are unfortunately no standard unit codes for liters per 100 km.  Use [[unitText]] to indicate the unit of measurement, e.g. L/100 km.\n* Note 2: There are two ways of indicating the fuel consumption, [[fuelConsumption]] (e.g. 8 liters per 100 km) and [[fuelEfficiency]] (e.g. 30 miles per gallon). They are reciprocal.\n* Note 3: Often, the absolute value is useful only when related to driving speed (&quot;at 80 km/h&quot;) or usage pattern (&quot;city traffic&quot;). You can use [[valueReference]] to link the value for the fuel consumption to another value.
   * @return all fuelConsumption properties as {@link java.util.Collection} or an empty collection 
   * if fuelConsumption was not set.
   */
  @JsonIgnore public java.util.Collection<QuantitativeValue> getFuelConsumptions() {
    final java.lang.Object current = myData.get("fuelConsumption");
    if (current == null) return Collections.emptyList();
    if (current instanceof java.util.Collection) {
      return (java.util.Collection<QuantitativeValue>) current;
    }
    return Arrays.asList((QuantitativeValue) current);
  }
  /**
   * A short text indicating the configuration of the vehicle, e.g. '5dr hatchback ST 2.5 MT 225 hp' or 'limited edition'.
   * @return vehicleConfiguration property set by first invocation of vehicleConfiguration method or {@code null}.
   */
  @JsonIgnore public String getVehicleConfiguration() {
    return (String) getValue("vehicleConfiguration");
  }
  /**
   * A short text indicating the configuration of the vehicle, e.g. '5dr hatchback ST 2.5 MT 225 hp' or 'limited edition'.
   * @return all vehicleConfiguration properties as {@link java.util.Collection} or an empty collection 
   * if vehicleConfiguration was not set.
   */
  @JsonIgnore public java.util.Collection<String> getVehicleConfigurations() {
    final java.lang.Object current = myData.get("vehicleConfiguration");
    if (current == null) return Collections.emptyList();
    if (current instanceof java.util.Collection) {
      return (java.util.Collection<String>) current;
    }
    return Arrays.asList((String) current);
  }
  /**
   * The permitted vertical load (TWR) of a trailer attached to the vehicle. Also referred to as Tongue Load Rating (TLR) or Vertical Load Rating (VLR)\n\nTypical unit code(s): KGM for kilogram, LBR for pound\n\n* Note 1: You can indicate additional information in the [[name]] of the [[QuantitativeValue]] node.\n* Note 2: You may also link to a [[QualitativeValue]] node that provides additional information using [[valueReference]].\n* Note 3: Note that you can use [[minValue]] and [[maxValue]] to indicate ranges.
   * @return tongueWeight property set by first invocation of tongueWeight method or {@code null}.
   */
  @JsonIgnore public QuantitativeValue getTongueWeight() {
    return (QuantitativeValue) getValue("tongueWeight");
  }
  /**
   * The permitted vertical load (TWR) of a trailer attached to the vehicle. Also referred to as Tongue Load Rating (TLR) or Vertical Load Rating (VLR)\n\nTypical unit code(s): KGM for kilogram, LBR for pound\n\n* Note 1: You can indicate additional information in the [[name]] of the [[QuantitativeValue]] node.\n* Note 2: You may also link to a [[QualitativeValue]] node that provides additional information using [[valueReference]].\n* Note 3: Note that you can use [[minValue]] and [[maxValue]] to indicate ranges.
   * @return all tongueWeight properties as {@link java.util.Collection} or an empty collection 
   * if tongueWeight was not set.
   */
  @JsonIgnore public java.util.Collection<QuantitativeValue> getTongueWeights() {
    final java.lang.Object current = myData.get("tongueWeight");
    if (current == null) return Collections.emptyList();
    if (current instanceof java.util.Collection) {
      return (java.util.Collection<QuantitativeValue>) current;
    }
    return Arrays.asList((QuantitativeValue) current);
  }
  /**
   * The number of doors.\n\nTypical unit code(s): C62
   * @return numberOfDoors property set by first invocation of numberOfDoors method or {@code null}.
   */
  @JsonIgnore public Integer getNumberOfDoorsInteger() {
    return (Integer) getValue("numberOfDoors");
  }
  /**
   * The number of doors.\n\nTypical unit code(s): C62
   * @return all numberOfDoors properties as {@link java.util.Collection} or an empty collection 
   * if numberOfDoors was not set.
   */
  @JsonIgnore public java.util.Collection<Integer> getNumberOfDoorsIntegers() {
    final java.lang.Object current = myData.get("numberOfDoors");
    if (current == null) return Collections.emptyList();
    if (current instanceof java.util.Collection) {
      return (java.util.Collection<Integer>) current;
    }
    return Arrays.asList((Integer) current);
  }
  /**
   * The number of doors.\n\nTypical unit code(s): C62
   * @return numberOfDoors property set by first invocation of numberOfDoors method or {@code null}.
   */
  @JsonIgnore public Long getNumberOfDoorsLong() {
    return (Long) getValue("numberOfDoors");
  }
  /**
   * The number of doors.\n\nTypical unit code(s): C62
   * @return all numberOfDoors properties as {@link java.util.Collection} or an empty collection 
   * if numberOfDoors was not set.
   */
  @JsonIgnore public java.util.Collection<Long> getNumberOfDoorsLongs() {
    final java.lang.Object current = myData.get("numberOfDoors");
    if (current == null) return Collections.emptyList();
    if (current instanceof java.util.Collection) {
      return (java.util.Collection<Long>) current;
    }
    return Arrays.asList((Long) current);
  }
  /**
   * The number of doors.\n\nTypical unit code(s): C62
   * @return numberOfDoors property set by first invocation of numberOfDoors method or {@code null}.
   */
  @JsonIgnore public Float getNumberOfDoorsFloat() {
    return (Float) getValue("numberOfDoors");
  }
  /**
   * The number of doors.\n\nTypical unit code(s): C62
   * @return all numberOfDoors properties as {@link java.util.Collection} or an empty collection 
   * if numberOfDoors was not set.
   */
  @JsonIgnore public java.util.Collection<Float> getNumberOfDoorsFloats() {
    final java.lang.Object current = myData.get("numberOfDoors");
    if (current == null) return Collections.emptyList();
    if (current instanceof java.util.Collection) {
      return (java.util.Collection<Float>) current;
    }
    return Arrays.asList((Float) current);
  }
  /**
   * The number of doors.\n\nTypical unit code(s): C62
   * @return numberOfDoors property set by first invocation of numberOfDoors method or {@code null}.
   */
  @JsonIgnore public Double getNumberOfDoorsDouble() {
    return (Double) getValue("numberOfDoors");
  }
  /**
   * The number of doors.\n\nTypical unit code(s): C62
   * @return all numberOfDoors properties as {@link java.util.Collection} or an empty collection 
   * if numberOfDoors was not set.
   */
  @JsonIgnore public java.util.Collection<Double> getNumberOfDoorsDoubles() {
    final java.lang.Object current = myData.get("numberOfDoors");
    if (current == null) return Collections.emptyList();
    if (current instanceof java.util.Collection) {
      return (java.util.Collection<Double>) current;
    }
    return Arrays.asList((Double) current);
  }
  /**
   * The number of doors.\n\nTypical unit code(s): C62
   * @return numberOfDoors property set by first invocation of numberOfDoors method or {@code null}.
   */
  @JsonIgnore public String getNumberOfDoorsString() {
    return (String) getValue("numberOfDoors");
  }
  /**
   * The number of doors.\n\nTypical unit code(s): C62
   * @return all numberOfDoors properties as {@link java.util.Collection} or an empty collection 
   * if numberOfDoors was not set.
   */
  @JsonIgnore public java.util.Collection<String> getNumberOfDoorsStrings() {
    final java.lang.Object current = myData.get("numberOfDoors");
    if (current == null) return Collections.emptyList();
    if (current instanceof java.util.Collection) {
      return (java.util.Collection<String>) current;
    }
    return Arrays.asList((String) current);
  }
  /**
   * The total number of forward gears available for the transmission system of the vehicle.\n\nTypical unit code(s): C62
   * @return numberOfForwardGears property set by first invocation of numberOfForwardGears method or {@code null}.
   */
  @JsonIgnore public Number getNumberOfForwardGearsNumber() {
    return (Number) getValue("numberOfForwardGears");
  }
  /**
   * The total number of forward gears available for the transmission system of the vehicle.\n\nTypical unit code(s): C62
   * @return all numberOfForwardGears properties as {@link java.util.Collection} or an empty collection 
   * if numberOfForwardGears was not set.
   */
  @JsonIgnore public java.util.Collection<Number> getNumberOfForwardGearsNumbers() {
    final java.lang.Object current = myData.get("numberOfForwardGears");
    if (current == null) return Collections.emptyList();
    if (current instanceof java.util.Collection) {
      return (java.util.Collection<Number>) current;
    }
    return Arrays.asList((Number) current);
  }
  /**
   * The total number of forward gears available for the transmission system of the vehicle.\n\nTypical unit code(s): C62
   * @return numberOfForwardGears property set by first invocation of numberOfForwardGears method or {@code null}.
   */
  @JsonIgnore public QuantitativeValue getNumberOfForwardGearsQuantitativeValue() {
    return (QuantitativeValue) getValue("numberOfForwardGears");
  }
  /**
   * The total number of forward gears available for the transmission system of the vehicle.\n\nTypical unit code(s): C62
   * @return all numberOfForwardGears properties as {@link java.util.Collection} or an empty collection 
   * if numberOfForwardGears was not set.
   */
  @JsonIgnore public java.util.Collection<QuantitativeValue> getNumberOfForwardGearsQuantitativeValues() {
    final java.lang.Object current = myData.get("numberOfForwardGears");
    if (current == null) return Collections.emptyList();
    if (current instanceof java.util.Collection) {
      return (java.util.Collection<QuantitativeValue>) current;
    }
    return Arrays.asList((QuantitativeValue) current);
  }
  /**
   * The number of owners of the vehicle, including the current one.\n\nTypical unit code(s): C62
   * @return numberOfPreviousOwners property set by first invocation of numberOfPreviousOwners method or {@code null}.
   */
  @JsonIgnore public Number getNumberOfPreviousOwnersNumber() {
    return (Number) getValue("numberOfPreviousOwners");
  }
  /**
   * The number of owners of the vehicle, including the current one.\n\nTypical unit code(s): C62
   * @return all numberOfPreviousOwners properties as {@link java.util.Collection} or an empty collection 
   * if numberOfPreviousOwners was not set.
   */
  @JsonIgnore public java.util.Collection<Number> getNumberOfPreviousOwnersNumbers() {
    final java.lang.Object current = myData.get("numberOfPreviousOwners");
    if (current == null) return Collections.emptyList();
    if (current instanceof java.util.Collection) {
      return (java.util.Collection<Number>) current;
    }
    return Arrays.asList((Number) current);
  }
  /**
   * The number of owners of the vehicle, including the current one.\n\nTypical unit code(s): C62
   * @return numberOfPreviousOwners property set by first invocation of numberOfPreviousOwners method or {@code null}.
   */
  @JsonIgnore public QuantitativeValue getNumberOfPreviousOwnersQuantitativeValue() {
    return (QuantitativeValue) getValue("numberOfPreviousOwners");
  }
  /**
   * The number of owners of the vehicle, including the current one.\n\nTypical unit code(s): C62
   * @return all numberOfPreviousOwners properties as {@link java.util.Collection} or an empty collection 
   * if numberOfPreviousOwners was not set.
   */
  @JsonIgnore public java.util.Collection<QuantitativeValue> getNumberOfPreviousOwnersQuantitativeValues() {
    final java.lang.Object current = myData.get("numberOfPreviousOwners");
    if (current == null) return Collections.emptyList();
    if (current instanceof java.util.Collection) {
      return (java.util.Collection<QuantitativeValue>) current;
    }
    return Arrays.asList((QuantitativeValue) current);
  }
  /**
   * The speed range of the vehicle. If the vehicle is powered by an engine, the upper limit of the speed range (indicated by [[maxValue]] should be the maximum speed achievable under regular conditions.\n\nTypical unit code(s): KMH for km/h, HM for mile per hour (0.447 04 m/s), KNT for knot\n\n*Note 1: Use [[minValue]] and [[maxValue]] to indicate the range. Typically, the minimal value is zero.\n* Note 2: There are many different ways of measuring the speed range. You can link to information about how the given value has been determined using the [[valueReference]] property.
   * @return speed property set by first invocation of speed method or {@code null}.
   */
  @JsonIgnore public QuantitativeValue getSpeed() {
    return (QuantitativeValue) getValue("speed");
  }
  /**
   * The speed range of the vehicle. If the vehicle is powered by an engine, the upper limit of the speed range (indicated by [[maxValue]] should be the maximum speed achievable under regular conditions.\n\nTypical unit code(s): KMH for km/h, HM for mile per hour (0.447 04 m/s), KNT for knot\n\n*Note 1: Use [[minValue]] and [[maxValue]] to indicate the range. Typically, the minimal value is zero.\n* Note 2: There are many different ways of measuring the speed range. You can link to information about how the given value has been determined using the [[valueReference]] property.
   * @return all speed properties as {@link java.util.Collection} or an empty collection 
   * if speed was not set.
   */
  @JsonIgnore public java.util.Collection<QuantitativeValue> getSpeeds() {
    final java.lang.Object current = myData.get("speed");
    if (current == null) return Collections.emptyList();
    if (current instanceof java.util.Collection) {
      return (java.util.Collection<QuantitativeValue>) current;
    }
    return Arrays.asList((QuantitativeValue) current);
  }
  /**
   * The number of persons that can be seated (e.g. in a vehicle), both in terms of the physical space available, and in terms of limitations set by law.\n\nTypical unit code(s): C62 for persons 
   * @return seatingCapacity property set by first invocation of seatingCapacity method or {@code null}.
   */
  @JsonIgnore public Number getSeatingCapacityNumber() {
    return (Number) getValue("seatingCapacity");
  }
  /**
   * The number of persons that can be seated (e.g. in a vehicle), both in terms of the physical space available, and in terms of limitations set by law.\n\nTypical unit code(s): C62 for persons 
   * @return all seatingCapacity properties as {@link java.util.Collection} or an empty collection 
   * if seatingCapacity was not set.
   */
  @JsonIgnore public java.util.Collection<Number> getSeatingCapacityNumbers() {
    final java.lang.Object current = myData.get("seatingCapacity");
    if (current == null) return Collections.emptyList();
    if (current instanceof java.util.Collection) {
      return (java.util.Collection<Number>) current;
    }
    return Arrays.asList((Number) current);
  }
  /**
   * The number of persons that can be seated (e.g. in a vehicle), both in terms of the physical space available, and in terms of limitations set by law.\n\nTypical unit code(s): C62 for persons 
   * @return seatingCapacity property set by first invocation of seatingCapacity method or {@code null}.
   */
  @JsonIgnore public QuantitativeValue getSeatingCapacityQuantitativeValue() {
    return (QuantitativeValue) getValue("seatingCapacity");
  }
  /**
   * The number of persons that can be seated (e.g. in a vehicle), both in terms of the physical space available, and in terms of limitations set by law.\n\nTypical unit code(s): C62 for persons 
   * @return all seatingCapacity properties as {@link java.util.Collection} or an empty collection 
   * if seatingCapacity was not set.
   */
  @JsonIgnore public java.util.Collection<QuantitativeValue> getSeatingCapacityQuantitativeValues() {
    final java.lang.Object current = myData.get("seatingCapacity");
    if (current == null) return Collections.emptyList();
    if (current instanceof java.util.Collection) {
      return (java.util.Collection<QuantitativeValue>) current;
    }
    return Arrays.asList((QuantitativeValue) current);
  }
  /**
   * The type of fuel suitable for the engine or engines of the vehicle. If the vehicle has only one engine, this property can be attached directly to the vehicle.
   * @return fuelType property set by first invocation of fuelType method or {@code null}.
   */
  @JsonIgnore public QualitativeValue getFuelTypeQualitativeValue() {
    return (QualitativeValue) getValue("fuelType");
  }
  /**
   * The type of fuel suitable for the engine or engines of the vehicle. If the vehicle has only one engine, this property can be attached directly to the vehicle.
   * @return all fuelType properties as {@link java.util.Collection} or an empty collection 
   * if fuelType was not set.
   */
  @JsonIgnore public java.util.Collection<QualitativeValue> getFuelTypeQualitativeValues() {
    final java.lang.Object current = myData.get("fuelType");
    if (current == null) return Collections.emptyList();
    if (current instanceof java.util.Collection) {
      return (java.util.Collection<QualitativeValue>) current;
    }
    return Arrays.asList((QualitativeValue) current);
  }
  /**
   * The type of fuel suitable for the engine or engines of the vehicle. If the vehicle has only one engine, this property can be attached directly to the vehicle.
   * @return fuelType property set by first invocation of fuelType method or {@code null}.
   */
  @JsonIgnore public String getFuelTypeString() {
    return (String) getValue("fuelType");
  }
  /**
   * The type of fuel suitable for the engine or engines of the vehicle. If the vehicle has only one engine, this property can be attached directly to the vehicle.
   * @return all fuelType properties as {@link java.util.Collection} or an empty collection 
   * if fuelType was not set.
   */
  @JsonIgnore public java.util.Collection<String> getFuelTypeStrings() {
    final java.lang.Object current = myData.get("fuelType");
    if (current == null) return Collections.emptyList();
    if (current instanceof java.util.Collection) {
      return (java.util.Collection<String>) current;
    }
    return Arrays.asList((String) current);
  }
  /**
   * Information about the engine or engines of the vehicle.
   * @return vehicleEngine property set by first invocation of vehicleEngine method or {@code null}.
   */
  @JsonIgnore public EngineSpecification getVehicleEngine() {
    return (EngineSpecification) getValue("vehicleEngine");
  }
  /**
   * Information about the engine or engines of the vehicle.
   * @return all vehicleEngine properties as {@link java.util.Collection} or an empty collection 
   * if vehicleEngine was not set.
   */
  @JsonIgnore public java.util.Collection<EngineSpecification> getVehicleEngines() {
    final java.lang.Object current = myData.get("vehicleEngine");
    if (current == null) return Collections.emptyList();
    if (current instanceof java.util.Collection) {
      return (java.util.Collection<EngineSpecification>) current;
    }
    return Arrays.asList((EngineSpecification) current);
  }
  /**
   * The type or material of the interior of the vehicle (e.g. synthetic fabric, leather, wood, etc.). While most interior types are characterized by the material used, an interior type can also be based on vehicle usage or target audience.
   * @return vehicleInteriorType property set by first invocation of vehicleInteriorType method or {@code null}.
   */
  @JsonIgnore public String getVehicleInteriorType() {
    return (String) getValue("vehicleInteriorType");
  }
  /**
   * The type or material of the interior of the vehicle (e.g. synthetic fabric, leather, wood, etc.). While most interior types are characterized by the material used, an interior type can also be based on vehicle usage or target audience.
   * @return all vehicleInteriorType properties as {@link java.util.Collection} or an empty collection 
   * if vehicleInteriorType was not set.
   */
  @JsonIgnore public java.util.Collection<String> getVehicleInteriorTypes() {
    final java.lang.Object current = myData.get("vehicleInteriorType");
    if (current == null) return Collections.emptyList();
    if (current instanceof java.util.Collection) {
      return (java.util.Collection<String>) current;
    }
    return Arrays.asList((String) current);
  }
  /**
   * The position of the steering wheel or similar device (mostly for cars).
   * @return steeringPosition property set by first invocation of steeringPosition method or {@code null}.
   */
  @JsonIgnore public SteeringPositionValue getSteeringPosition() {
    return (SteeringPositionValue) getValue("steeringPosition");
  }
  /**
   * The position of the steering wheel or similar device (mostly for cars).
   * @return all steeringPosition properties as {@link java.util.Collection} or an empty collection 
   * if steeringPosition was not set.
   */
  @JsonIgnore public java.util.Collection<SteeringPositionValue> getSteeringPositions() {
    final java.lang.Object current = myData.get("steeringPosition");
    if (current == null) return Collections.emptyList();
    if (current instanceof java.util.Collection) {
      return (java.util.Collection<SteeringPositionValue>) current;
    }
    return Arrays.asList((SteeringPositionValue) current);
  }
  /**
   * The color or color combination of the interior of the vehicle.
   * @return vehicleInteriorColor property set by first invocation of vehicleInteriorColor method or {@code null}.
   */
  @JsonIgnore public String getVehicleInteriorColor() {
    return (String) getValue("vehicleInteriorColor");
  }
  /**
   * The color or color combination of the interior of the vehicle.
   * @return all vehicleInteriorColor properties as {@link java.util.Collection} or an empty collection 
   * if vehicleInteriorColor was not set.
   */
  @JsonIgnore public java.util.Collection<String> getVehicleInteriorColors() {
    final java.lang.Object current = myData.get("vehicleInteriorColor");
    if (current == null) return Collections.emptyList();
    if (current instanceof java.util.Collection) {
      return (java.util.Collection<String>) current;
    }
    return Arrays.asList((String) current);
  }
  /**
   * The total distance travelled by the particular vehicle since its initial production, as read from its odometer.\n\nTypical unit code(s): KMT for kilometers, SMI for statute miles
   * @return mileageFromOdometer property set by first invocation of mileageFromOdometer method or {@code null}.
   */
  @JsonIgnore public QuantitativeValue getMileageFromOdometer() {
    return (QuantitativeValue) getValue("mileageFromOdometer");
  }
  /**
   * The total distance travelled by the particular vehicle since its initial production, as read from its odometer.\n\nTypical unit code(s): KMT for kilometers, SMI for statute miles
   * @return all mileageFromOdometer properties as {@link java.util.Collection} or an empty collection 
   * if mileageFromOdometer was not set.
   */
  @JsonIgnore public java.util.Collection<QuantitativeValue> getMileageFromOdometers() {
    final java.lang.Object current = myData.get("mileageFromOdometer");
    if (current == null) return Collections.emptyList();
    if (current instanceof java.util.Collection) {
      return (java.util.Collection<QuantitativeValue>) current;
    }
    return Arrays.asList((QuantitativeValue) current);
  }
  /**
   * The capacity of the fuel tank or in the case of electric cars, the battery. If there are multiple components for storage, this should indicate the total of all storage of the same type.\n\nTypical unit code(s): LTR for liters, GLL of US gallons, GLI for UK / imperial gallons, AMH for ampere-hours (for electrical vehicles).
   * @return fuelCapacity property set by first invocation of fuelCapacity method or {@code null}.
   */
  @JsonIgnore public QuantitativeValue getFuelCapacity() {
    return (QuantitativeValue) getValue("fuelCapacity");
  }
  /**
   * The capacity of the fuel tank or in the case of electric cars, the battery. If there are multiple components for storage, this should indicate the total of all storage of the same type.\n\nTypical unit code(s): LTR for liters, GLL of US gallons, GLI for UK / imperial gallons, AMH for ampere-hours (for electrical vehicles).
   * @return all fuelCapacity properties as {@link java.util.Collection} or an empty collection 
   * if fuelCapacity was not set.
   */
  @JsonIgnore public java.util.Collection<QuantitativeValue> getFuelCapacitys() {
    final java.lang.Object current = myData.get("fuelCapacity");
    if (current == null) return Collections.emptyList();
    if (current instanceof java.util.Collection) {
      return (java.util.Collection<QuantitativeValue>) current;
    }
    return Arrays.asList((QuantitativeValue) current);
  }
  /**
   * The number of axles.\n\nTypical unit code(s): C62
   * @return numberOfAxles property set by first invocation of numberOfAxles method or {@code null}.
   */
  @JsonIgnore public Integer getNumberOfAxlesInteger() {
    return (Integer) getValue("numberOfAxles");
  }
  /**
   * The number of axles.\n\nTypical unit code(s): C62
   * @return all numberOfAxles properties as {@link java.util.Collection} or an empty collection 
   * if numberOfAxles was not set.
   */
  @JsonIgnore public java.util.Collection<Integer> getNumberOfAxlesIntegers() {
    final java.lang.Object current = myData.get("numberOfAxles");
    if (current == null) return Collections.emptyList();
    if (current instanceof java.util.Collection) {
      return (java.util.Collection<Integer>) current;
    }
    return Arrays.asList((Integer) current);
  }
  /**
   * The number of axles.\n\nTypical unit code(s): C62
   * @return numberOfAxles property set by first invocation of numberOfAxles method or {@code null}.
   */
  @JsonIgnore public Long getNumberOfAxlesLong() {
    return (Long) getValue("numberOfAxles");
  }
  /**
   * The number of axles.\n\nTypical unit code(s): C62
   * @return all numberOfAxles properties as {@link java.util.Collection} or an empty collection 
   * if numberOfAxles was not set.
   */
  @JsonIgnore public java.util.Collection<Long> getNumberOfAxlesLongs() {
    final java.lang.Object current = myData.get("numberOfAxles");
    if (current == null) return Collections.emptyList();
    if (current instanceof java.util.Collection) {
      return (java.util.Collection<Long>) current;
    }
    return Arrays.asList((Long) current);
  }
  /**
   * The number of axles.\n\nTypical unit code(s): C62
   * @return numberOfAxles property set by first invocation of numberOfAxles method or {@code null}.
   */
  @JsonIgnore public Float getNumberOfAxlesFloat() {
    return (Float) getValue("numberOfAxles");
  }
  /**
   * The number of axles.\n\nTypical unit code(s): C62
   * @return all numberOfAxles properties as {@link java.util.Collection} or an empty collection 
   * if numberOfAxles was not set.
   */
  @JsonIgnore public java.util.Collection<Float> getNumberOfAxlesFloats() {
    final java.lang.Object current = myData.get("numberOfAxles");
    if (current == null) return Collections.emptyList();
    if (current instanceof java.util.Collection) {
      return (java.util.Collection<Float>) current;
    }
    return Arrays.asList((Float) current);
  }
  /**
   * The number of axles.\n\nTypical unit code(s): C62
   * @return numberOfAxles property set by first invocation of numberOfAxles method or {@code null}.
   */
  @JsonIgnore public Double getNumberOfAxlesDouble() {
    return (Double) getValue("numberOfAxles");
  }
  /**
   * The number of axles.\n\nTypical unit code(s): C62
   * @return all numberOfAxles properties as {@link java.util.Collection} or an empty collection 
   * if numberOfAxles was not set.
   */
  @JsonIgnore public java.util.Collection<Double> getNumberOfAxlesDoubles() {
    final java.lang.Object current = myData.get("numberOfAxles");
    if (current == null) return Collections.emptyList();
    if (current instanceof java.util.Collection) {
      return (java.util.Collection<Double>) current;
    }
    return Arrays.asList((Double) current);
  }
  /**
   * The number of axles.\n\nTypical unit code(s): C62
   * @return numberOfAxles property set by first invocation of numberOfAxles method or {@code null}.
   */
  @JsonIgnore public String getNumberOfAxlesString() {
    return (String) getValue("numberOfAxles");
  }
  /**
   * The number of axles.\n\nTypical unit code(s): C62
   * @return all numberOfAxles properties as {@link java.util.Collection} or an empty collection 
   * if numberOfAxles was not set.
   */
  @JsonIgnore public java.util.Collection<String> getNumberOfAxlesStrings() {
    final java.lang.Object current = myData.get("numberOfAxles");
    if (current == null) return Collections.emptyList();
    if (current instanceof java.util.Collection) {
      return (java.util.Collection<String>) current;
    }
    return Arrays.asList((String) current);
  }
  /**
   * Indicates the design and body style of the vehicle (e.g. station wagon, hatchback, etc.).
   * @return bodyType property set by first invocation of bodyType method or {@code null}.
   */
  @JsonIgnore public QualitativeValue getBodyTypeQualitativeValue() {
    return (QualitativeValue) getValue("bodyType");
  }
  /**
   * Indicates the design and body style of the vehicle (e.g. station wagon, hatchback, etc.).
   * @return all bodyType properties as {@link java.util.Collection} or an empty collection 
   * if bodyType was not set.
   */
  @JsonIgnore public java.util.Collection<QualitativeValue> getBodyTypeQualitativeValues() {
    final java.lang.Object current = myData.get("bodyType");
    if (current == null) return Collections.emptyList();
    if (current instanceof java.util.Collection) {
      return (java.util.Collection<QualitativeValue>) current;
    }
    return Arrays.asList((QualitativeValue) current);
  }
  /**
   * Indicates the design and body style of the vehicle (e.g. station wagon, hatchback, etc.).
   * @return bodyType property set by first invocation of bodyType method or {@code null}.
   */
  @JsonIgnore public String getBodyTypeString() {
    return (String) getValue("bodyType");
  }
  /**
   * Indicates the design and body style of the vehicle (e.g. station wagon, hatchback, etc.).
   * @return all bodyType properties as {@link java.util.Collection} or an empty collection 
   * if bodyType was not set.
   */
  @JsonIgnore public java.util.Collection<String> getBodyTypeStrings() {
    final java.lang.Object current = myData.get("bodyType");
    if (current == null) return Collections.emptyList();
    if (current instanceof java.util.Collection) {
      return (java.util.Collection<String>) current;
    }
    return Arrays.asList((String) current);
  }
  /**
   * The permitted total weight of the loaded vehicle, including passengers and cargo and the weight of the empty vehicle.\n\nTypical unit code(s): KGM for kilogram, LBR for pound\n\n* Note 1: You can indicate additional information in the [[name]] of the [[QuantitativeValue]] node.\n* Note 2: You may also link to a [[QualitativeValue]] node that provides additional information using [[valueReference]].\n* Note 3: Note that you can use [[minValue]] and [[maxValue]] to indicate ranges.
   * @return weightTotal property set by first invocation of weightTotal method or {@code null}.
   */
  @JsonIgnore public QuantitativeValue getWeightTotal() {
    return (QuantitativeValue) getValue("weightTotal");
  }
  /**
   * The permitted total weight of the loaded vehicle, including passengers and cargo and the weight of the empty vehicle.\n\nTypical unit code(s): KGM for kilogram, LBR for pound\n\n* Note 1: You can indicate additional information in the [[name]] of the [[QuantitativeValue]] node.\n* Note 2: You may also link to a [[QualitativeValue]] node that provides additional information using [[valueReference]].\n* Note 3: Note that you can use [[minValue]] and [[maxValue]] to indicate ranges.
   * @return all weightTotal properties as {@link java.util.Collection} or an empty collection 
   * if weightTotal was not set.
   */
  @JsonIgnore public java.util.Collection<QuantitativeValue> getWeightTotals() {
    final java.lang.Object current = myData.get("weightTotal");
    if (current == null) return Collections.emptyList();
    if (current instanceof java.util.Collection) {
      return (java.util.Collection<QuantitativeValue>) current;
    }
    return Arrays.asList((QuantitativeValue) current);
  }
  /**
   * The CO2 emissions in g/km. When used in combination with a QuantitativeValue, put &quot;g/km&quot; into the unitText property of that value, since there is no UN/CEFACT Common Code for &quot;g/km&quot;.
   * @return emissionsCO2 property set by first invocation of emissionsCO2 method or {@code null}.
   */
  @JsonIgnore public Integer getEmissionsCO2Integer() {
    return (Integer) getValue("emissionsCO2");
  }
  /**
   * The CO2 emissions in g/km. When used in combination with a QuantitativeValue, put &quot;g/km&quot; into the unitText property of that value, since there is no UN/CEFACT Common Code for &quot;g/km&quot;.
   * @return all emissionsCO2 properties as {@link java.util.Collection} or an empty collection 
   * if emissionsCO2 was not set.
   */
  @JsonIgnore public java.util.Collection<Integer> getEmissionsCO2Integers() {
    final java.lang.Object current = myData.get("emissionsCO2");
    if (current == null) return Collections.emptyList();
    if (current instanceof java.util.Collection) {
      return (java.util.Collection<Integer>) current;
    }
    return Arrays.asList((Integer) current);
  }
  /**
   * The CO2 emissions in g/km. When used in combination with a QuantitativeValue, put &quot;g/km&quot; into the unitText property of that value, since there is no UN/CEFACT Common Code for &quot;g/km&quot;.
   * @return emissionsCO2 property set by first invocation of emissionsCO2 method or {@code null}.
   */
  @JsonIgnore public Long getEmissionsCO2Long() {
    return (Long) getValue("emissionsCO2");
  }
  /**
   * The CO2 emissions in g/km. When used in combination with a QuantitativeValue, put &quot;g/km&quot; into the unitText property of that value, since there is no UN/CEFACT Common Code for &quot;g/km&quot;.
   * @return all emissionsCO2 properties as {@link java.util.Collection} or an empty collection 
   * if emissionsCO2 was not set.
   */
  @JsonIgnore public java.util.Collection<Long> getEmissionsCO2Longs() {
    final java.lang.Object current = myData.get("emissionsCO2");
    if (current == null) return Collections.emptyList();
    if (current instanceof java.util.Collection) {
      return (java.util.Collection<Long>) current;
    }
    return Arrays.asList((Long) current);
  }
  /**
   * The CO2 emissions in g/km. When used in combination with a QuantitativeValue, put &quot;g/km&quot; into the unitText property of that value, since there is no UN/CEFACT Common Code for &quot;g/km&quot;.
   * @return emissionsCO2 property set by first invocation of emissionsCO2 method or {@code null}.
   */
  @JsonIgnore public Float getEmissionsCO2Float() {
    return (Float) getValue("emissionsCO2");
  }
  /**
   * The CO2 emissions in g/km. When used in combination with a QuantitativeValue, put &quot;g/km&quot; into the unitText property of that value, since there is no UN/CEFACT Common Code for &quot;g/km&quot;.
   * @return all emissionsCO2 properties as {@link java.util.Collection} or an empty collection 
   * if emissionsCO2 was not set.
   */
  @JsonIgnore public java.util.Collection<Float> getEmissionsCO2Floats() {
    final java.lang.Object current = myData.get("emissionsCO2");
    if (current == null) return Collections.emptyList();
    if (current instanceof java.util.Collection) {
      return (java.util.Collection<Float>) current;
    }
    return Arrays.asList((Float) current);
  }
  /**
   * The CO2 emissions in g/km. When used in combination with a QuantitativeValue, put &quot;g/km&quot; into the unitText property of that value, since there is no UN/CEFACT Common Code for &quot;g/km&quot;.
   * @return emissionsCO2 property set by first invocation of emissionsCO2 method or {@code null}.
   */
  @JsonIgnore public Double getEmissionsCO2Double() {
    return (Double) getValue("emissionsCO2");
  }
  /**
   * The CO2 emissions in g/km. When used in combination with a QuantitativeValue, put &quot;g/km&quot; into the unitText property of that value, since there is no UN/CEFACT Common Code for &quot;g/km&quot;.
   * @return all emissionsCO2 properties as {@link java.util.Collection} or an empty collection 
   * if emissionsCO2 was not set.
   */
  @JsonIgnore public java.util.Collection<Double> getEmissionsCO2Doubles() {
    final java.lang.Object current = myData.get("emissionsCO2");
    if (current == null) return Collections.emptyList();
    if (current instanceof java.util.Collection) {
      return (java.util.Collection<Double>) current;
    }
    return Arrays.asList((Double) current);
  }
  /**
   * The CO2 emissions in g/km. When used in combination with a QuantitativeValue, put &quot;g/km&quot; into the unitText property of that value, since there is no UN/CEFACT Common Code for &quot;g/km&quot;.
   * @return emissionsCO2 property set by first invocation of emissionsCO2 method or {@code null}.
   */
  @JsonIgnore public String getEmissionsCO2String() {
    return (String) getValue("emissionsCO2");
  }
  /**
   * The CO2 emissions in g/km. When used in combination with a QuantitativeValue, put &quot;g/km&quot; into the unitText property of that value, since there is no UN/CEFACT Common Code for &quot;g/km&quot;.
   * @return all emissionsCO2 properties as {@link java.util.Collection} or an empty collection 
   * if emissionsCO2 was not set.
   */
  @JsonIgnore public java.util.Collection<String> getEmissionsCO2Strings() {
    final java.lang.Object current = myData.get("emissionsCO2");
    if (current == null) return Collections.emptyList();
    if (current instanceof java.util.Collection) {
      return (java.util.Collection<String>) current;
    }
    return Arrays.asList((String) current);
  }
  /**
   * The permitted weight of passengers and cargo, EXCLUDING the weight of the empty vehicle.\n\nTypical unit code(s): KGM for kilogram, LBR for pound\n\n* Note 1: Many databases specify the permitted TOTAL weight instead, which is the sum of [[weight]] and [[payload]]\n* Note 2: You can indicate additional information in the [[name]] of the [[QuantitativeValue]] node.\n* Note 3: You may also link to a [[QualitativeValue]] node that provides additional information using [[valueReference]].\n* Note 4: Note that you can use [[minValue]] and [[maxValue]] to indicate ranges.
   * @return payload property set by first invocation of payload method or {@code null}.
   */
  @JsonIgnore public QuantitativeValue getPayload() {
    return (QuantitativeValue) getValue("payload");
  }
  /**
   * The permitted weight of passengers and cargo, EXCLUDING the weight of the empty vehicle.\n\nTypical unit code(s): KGM for kilogram, LBR for pound\n\n* Note 1: Many databases specify the permitted TOTAL weight instead, which is the sum of [[weight]] and [[payload]]\n* Note 2: You can indicate additional information in the [[name]] of the [[QuantitativeValue]] node.\n* Note 3: You may also link to a [[QualitativeValue]] node that provides additional information using [[valueReference]].\n* Note 4: Note that you can use [[minValue]] and [[maxValue]] to indicate ranges.
   * @return all payload properties as {@link java.util.Collection} or an empty collection 
   * if payload was not set.
   */
  @JsonIgnore public java.util.Collection<QuantitativeValue> getPayloads() {
    final java.lang.Object current = myData.get("payload");
    if (current == null) return Collections.emptyList();
    if (current instanceof java.util.Collection) {
      return (java.util.Collection<QuantitativeValue>) current;
    }
    return Arrays.asList((QuantitativeValue) current);
  }
  /**
   * The date of the first registration of the vehicle with the respective public authorities.
   * @return dateVehicleFirstRegistered property set by first invocation of dateVehicleFirstRegistered method or {@code null}.
   */
  @JsonIgnore public java.util.Date getDateVehicleFirstRegistered() {
    return (java.util.Date) getValue("dateVehicleFirstRegistered");
  }
  /**
   * The date of the first registration of the vehicle with the respective public authorities.
   * @return all dateVehicleFirstRegistered properties as {@link java.util.Collection} or an empty collection 
   * if dateVehicleFirstRegistered was not set.
   */
  @JsonIgnore public java.util.Collection<java.util.Date> getDateVehicleFirstRegistereds() {
    final java.lang.Object current = myData.get("dateVehicleFirstRegistered");
    if (current == null) return Collections.emptyList();
    if (current instanceof java.util.Collection) {
      return (java.util.Collection<java.util.Date>) current;
    }
    return Arrays.asList((java.util.Date) current);
  }
  /**
   * Indicates whether the vehicle has been used for special purposes, like commercial rental, driving school, or as a taxi. The legislation in many countries requires this information to be revealed when offering a car for sale.
   * @return vehicleSpecialUsage property set by first invocation of vehicleSpecialUsage method or {@code null}.
   */
  @JsonIgnore public CarUsageType getVehicleSpecialUsageCarUsageType() {
    return (CarUsageType) getValue("vehicleSpecialUsage");
  }
  /**
   * Indicates whether the vehicle has been used for special purposes, like commercial rental, driving school, or as a taxi. The legislation in many countries requires this information to be revealed when offering a car for sale.
   * @return all vehicleSpecialUsage properties as {@link java.util.Collection} or an empty collection 
   * if vehicleSpecialUsage was not set.
   */
  @JsonIgnore public java.util.Collection<CarUsageType> getVehicleSpecialUsageCarUsageTypes() {
    final java.lang.Object current = myData.get("vehicleSpecialUsage");
    if (current == null) return Collections.emptyList();
    if (current instanceof java.util.Collection) {
      return (java.util.Collection<CarUsageType>) current;
    }
    return Arrays.asList((CarUsageType) current);
  }
  /**
   * Indicates whether the vehicle has been used for special purposes, like commercial rental, driving school, or as a taxi. The legislation in many countries requires this information to be revealed when offering a car for sale.
   * @return vehicleSpecialUsage property set by first invocation of vehicleSpecialUsage method or {@code null}.
   */
  @JsonIgnore public String getVehicleSpecialUsageString() {
    return (String) getValue("vehicleSpecialUsage");
  }
  /**
   * Indicates whether the vehicle has been used for special purposes, like commercial rental, driving school, or as a taxi. The legislation in many countries requires this information to be revealed when offering a car for sale.
   * @return all vehicleSpecialUsage properties as {@link java.util.Collection} or an empty collection 
   * if vehicleSpecialUsage was not set.
   */
  @JsonIgnore public java.util.Collection<String> getVehicleSpecialUsageStrings() {
    final java.lang.Object current = myData.get("vehicleSpecialUsage");
    if (current == null) return Collections.emptyList();
    if (current instanceof java.util.Collection) {
      return (java.util.Collection<String>) current;
    }
    return Arrays.asList((String) current);
  }
  /**
   * Indicates that the vehicle meets the respective emission standard.
   * @return meetsEmissionStandard property set by first invocation of meetsEmissionStandard method or {@code null}.
   */
  @JsonIgnore public QualitativeValue getMeetsEmissionStandardQualitativeValue() {
    return (QualitativeValue) getValue("meetsEmissionStandard");
  }
  /**
   * Indicates that the vehicle meets the respective emission standard.
   * @return all meetsEmissionStandard properties as {@link java.util.Collection} or an empty collection 
   * if meetsEmissionStandard was not set.
   */
  @JsonIgnore public java.util.Collection<QualitativeValue> getMeetsEmissionStandardQualitativeValues() {
    final java.lang.Object current = myData.get("meetsEmissionStandard");
    if (current == null) return Collections.emptyList();
    if (current instanceof java.util.Collection) {
      return (java.util.Collection<QualitativeValue>) current;
    }
    return Arrays.asList((QualitativeValue) current);
  }
  /**
   * Indicates that the vehicle meets the respective emission standard.
   * @return meetsEmissionStandard property set by first invocation of meetsEmissionStandard method or {@code null}.
   */
  @JsonIgnore public String getMeetsEmissionStandardString() {
    return (String) getValue("meetsEmissionStandard");
  }
  /**
   * Indicates that the vehicle meets the respective emission standard.
   * @return all meetsEmissionStandard properties as {@link java.util.Collection} or an empty collection 
   * if meetsEmissionStandard was not set.
   */
  @JsonIgnore public java.util.Collection<String> getMeetsEmissionStandardStrings() {
    final java.lang.Object current = myData.get("meetsEmissionStandard");
    if (current == null) return Collections.emptyList();
    if (current instanceof java.util.Collection) {
      return (java.util.Collection<String>) current;
    }
    return Arrays.asList((String) current);
  }
  /**
   * The type of component used for transmitting the power from a rotating power source to the wheels or other relevant component(s) (&quot;gearbox&quot; for cars).
   * @return vehicleTransmission property set by first invocation of vehicleTransmission method or {@code null}.
   */
  @JsonIgnore public QualitativeValue getVehicleTransmissionQualitativeValue() {
    return (QualitativeValue) getValue("vehicleTransmission");
  }
  /**
   * The type of component used for transmitting the power from a rotating power source to the wheels or other relevant component(s) (&quot;gearbox&quot; for cars).
   * @return all vehicleTransmission properties as {@link java.util.Collection} or an empty collection 
   * if vehicleTransmission was not set.
   */
  @JsonIgnore public java.util.Collection<QualitativeValue> getVehicleTransmissionQualitativeValues() {
    final java.lang.Object current = myData.get("vehicleTransmission");
    if (current == null) return Collections.emptyList();
    if (current instanceof java.util.Collection) {
      return (java.util.Collection<QualitativeValue>) current;
    }
    return Arrays.asList((QualitativeValue) current);
  }
  /**
   * The type of component used for transmitting the power from a rotating power source to the wheels or other relevant component(s) (&quot;gearbox&quot; for cars).
   * @return vehicleTransmission property set by first invocation of vehicleTransmission method or {@code null}.
   */
  @JsonIgnore public String getVehicleTransmissionString() {
    return (String) getValue("vehicleTransmission");
  }
  /**
   * The type of component used for transmitting the power from a rotating power source to the wheels or other relevant component(s) (&quot;gearbox&quot; for cars).
   * @return all vehicleTransmission properties as {@link java.util.Collection} or an empty collection 
   * if vehicleTransmission was not set.
   */
  @JsonIgnore public java.util.Collection<String> getVehicleTransmissionStrings() {
    final java.lang.Object current = myData.get("vehicleTransmission");
    if (current == null) return Collections.emptyList();
    if (current instanceof java.util.Collection) {
      return (java.util.Collection<String>) current;
    }
    return Arrays.asList((String) current);
  }
  /**
   * The available volume for cargo or luggage. For automobiles, this is usually the trunk volume.\n\nTypical unit code(s): LTR for liters, FTQ for cubic foot/feet\n\nNote: You can use [[minValue]] and [[maxValue]] to indicate ranges.
   * @return cargoVolume property set by first invocation of cargoVolume method or {@code null}.
   */
  @JsonIgnore public QuantitativeValue getCargoVolume() {
    return (QuantitativeValue) getValue("cargoVolume");
  }
  /**
   * The available volume for cargo or luggage. For automobiles, this is usually the trunk volume.\n\nTypical unit code(s): LTR for liters, FTQ for cubic foot/feet\n\nNote: You can use [[minValue]] and [[maxValue]] to indicate ranges.
   * @return all cargoVolume properties as {@link java.util.Collection} or an empty collection 
   * if cargoVolume was not set.
   */
  @JsonIgnore public java.util.Collection<QuantitativeValue> getCargoVolumes() {
    final java.lang.Object current = myData.get("cargoVolume");
    if (current == null) return Collections.emptyList();
    if (current instanceof java.util.Collection) {
      return (java.util.Collection<QuantitativeValue>) current;
    }
    return Arrays.asList((QuantitativeValue) current);
  }
  /**
   * The distance traveled per unit of fuel used; most commonly miles per gallon (mpg) or kilometers per liter (km/L).\n\n* Note 1: There are unfortunately no standard unit codes for miles per gallon or kilometers per liter. Use [[unitText]] to indicate the unit of measurement, e.g. mpg or km/L.\n* Note 2: There are two ways of indicating the fuel consumption, [[fuelConsumption]] (e.g. 8 liters per 100 km) and [[fuelEfficiency]] (e.g. 30 miles per gallon). They are reciprocal.\n* Note 3: Often, the absolute value is useful only when related to driving speed (&quot;at 80 km/h&quot;) or usage pattern (&quot;city traffic&quot;). You can use [[valueReference]] to link the value for the fuel economy to another value.
   * @return fuelEfficiency property set by first invocation of fuelEfficiency method or {@code null}.
   */
  @JsonIgnore public QuantitativeValue getFuelEfficiency() {
    return (QuantitativeValue) getValue("fuelEfficiency");
  }
  /**
   * The distance traveled per unit of fuel used; most commonly miles per gallon (mpg) or kilometers per liter (km/L).\n\n* Note 1: There are unfortunately no standard unit codes for miles per gallon or kilometers per liter. Use [[unitText]] to indicate the unit of measurement, e.g. mpg or km/L.\n* Note 2: There are two ways of indicating the fuel consumption, [[fuelConsumption]] (e.g. 8 liters per 100 km) and [[fuelEfficiency]] (e.g. 30 miles per gallon). They are reciprocal.\n* Note 3: Often, the absolute value is useful only when related to driving speed (&quot;at 80 km/h&quot;) or usage pattern (&quot;city traffic&quot;). You can use [[valueReference]] to link the value for the fuel economy to another value.
   * @return all fuelEfficiency properties as {@link java.util.Collection} or an empty collection 
   * if fuelEfficiency was not set.
   */
  @JsonIgnore public java.util.Collection<QuantitativeValue> getFuelEfficiencys() {
    final java.lang.Object current = myData.get("fuelEfficiency");
    if (current == null) return Collections.emptyList();
    if (current instanceof java.util.Collection) {
      return (java.util.Collection<QuantitativeValue>) current;
    }
    return Arrays.asList((QuantitativeValue) current);
  }
  /**
   * The Vehicle Identification Number (VIN) is a unique serial number used by the automotive industry to identify individual motor vehicles.
   * @return vehicleIdentificationNumber property set by first invocation of vehicleIdentificationNumber method or {@code null}.
   */
  @JsonIgnore public SerialNumber getVehicleIdentificationNumber() {
    return (SerialNumber) getValue("vehicleIdentificationNumber");
  }
  /**
   * The Vehicle Identification Number (VIN) is a unique serial number used by the automotive industry to identify individual motor vehicles.
   * @return all vehicleIdentificationNumber properties as {@link java.util.Collection} or an empty collection 
   * if vehicleIdentificationNumber was not set.
   */
  @JsonIgnore public java.util.Collection<SerialNumber> getVehicleIdentificationNumbers() {
    final java.lang.Object current = myData.get("vehicleIdentificationNumber");
    if (current == null) return Collections.emptyList();
    if (current instanceof java.util.Collection) {
      return (java.util.Collection<SerialNumber>) current;
    }
    return Arrays.asList((SerialNumber) current);
  }
  /**
   * The distance between the centers of the front and rear wheels.\n\nTypical unit code(s): CMT for centimeters, MTR for meters, INH for inches, FOT for foot/feet
   * @return wheelbase property set by first invocation of wheelbase method or {@code null}.
   */
  @JsonIgnore public QuantitativeValue getWheelbase() {
    return (QuantitativeValue) getValue("wheelbase");
  }
  /**
   * The distance between the centers of the front and rear wheels.\n\nTypical unit code(s): CMT for centimeters, MTR for meters, INH for inches, FOT for foot/feet
   * @return all wheelbase properties as {@link java.util.Collection} or an empty collection 
   * if wheelbase was not set.
   */
  @JsonIgnore public java.util.Collection<QuantitativeValue> getWheelbases() {
    final java.lang.Object current = myData.get("wheelbase");
    if (current == null) return Collections.emptyList();
    if (current instanceof java.util.Collection) {
      return (java.util.Collection<QuantitativeValue>) current;
    }
    return Arrays.asList((QuantitativeValue) current);
  }
  /**
   * The date of production of the item, e.g. vehicle.
   * @return productionDate property set by first invocation of productionDate method or {@code null}.
   */
  @JsonIgnore public java.util.Date getProductionDate() {
    return (java.util.Date) getValue("productionDate");
  }
  /**
   * The date of production of the item, e.g. vehicle.
   * @return all productionDate properties as {@link java.util.Collection} or an empty collection 
   * if productionDate was not set.
   */
  @JsonIgnore public java.util.Collection<java.util.Date> getProductionDates() {
    final java.lang.Object current = myData.get("productionDate");
    if (current == null) return Collections.emptyList();
    if (current instanceof java.util.Collection) {
      return (java.util.Collection<java.util.Date>) current;
    }
    return Arrays.asList((java.util.Date) current);
  }
  /**
   * The permitted weight of a trailer attached to the vehicle.\n\nTypical unit code(s): KGM for kilogram, LBR for pound\n* Note 1: You can indicate additional information in the [[name]] of the [[QuantitativeValue]] node.\n* Note 2: You may also link to a [[QualitativeValue]] node that provides additional information using [[valueReference]].\n* Note 3: Note that you can use [[minValue]] and [[maxValue]] to indicate ranges.
   * @return trailerWeight property set by first invocation of trailerWeight method or {@code null}.
   */
  @JsonIgnore public QuantitativeValue getTrailerWeight() {
    return (QuantitativeValue) getValue("trailerWeight");
  }
  /**
   * The permitted weight of a trailer attached to the vehicle.\n\nTypical unit code(s): KGM for kilogram, LBR for pound\n* Note 1: You can indicate additional information in the [[name]] of the [[QuantitativeValue]] node.\n* Note 2: You may also link to a [[QualitativeValue]] node that provides additional information using [[valueReference]].\n* Note 3: Note that you can use [[minValue]] and [[maxValue]] to indicate ranges.
   * @return all trailerWeight properties as {@link java.util.Collection} or an empty collection 
   * if trailerWeight was not set.
   */
  @JsonIgnore public java.util.Collection<QuantitativeValue> getTrailerWeights() {
    final java.lang.Object current = myData.get("trailerWeight");
    if (current == null) return Collections.emptyList();
    if (current instanceof java.util.Collection) {
      return (java.util.Collection<QuantitativeValue>) current;
    }
    return Arrays.asList((QuantitativeValue) current);
  }
  /**
   * The number or type of airbags in the vehicle.
   * @return numberOfAirbags property set by first invocation of numberOfAirbags method or {@code null}.
   */
  @JsonIgnore public Number getNumberOfAirbagsNumber() {
    return (Number) getValue("numberOfAirbags");
  }
  /**
   * The number or type of airbags in the vehicle.
   * @return all numberOfAirbags properties as {@link java.util.Collection} or an empty collection 
   * if numberOfAirbags was not set.
   */
  @JsonIgnore public java.util.Collection<Number> getNumberOfAirbagsNumbers() {
    final java.lang.Object current = myData.get("numberOfAirbags");
    if (current == null) return Collections.emptyList();
    if (current instanceof java.util.Collection) {
      return (java.util.Collection<Number>) current;
    }
    return Arrays.asList((Number) current);
  }
  /**
   * The number or type of airbags in the vehicle.
   * @return numberOfAirbags property set by first invocation of numberOfAirbags method or {@code null}.
   */
  @JsonIgnore public String getNumberOfAirbagsString() {
    return (String) getValue("numberOfAirbags");
  }
  /**
   * The number or type of airbags in the vehicle.
   * @return all numberOfAirbags properties as {@link java.util.Collection} or an empty collection 
   * if numberOfAirbags was not set.
   */
  @JsonIgnore public java.util.Collection<String> getNumberOfAirbagsStrings() {
    final java.lang.Object current = myData.get("numberOfAirbags");
    if (current == null) return Collections.emptyList();
    if (current instanceof java.util.Collection) {
      return (java.util.Collection<String>) current;
    }
    return Arrays.asList((String) current);
  }
  /**
   * The time needed to accelerate the vehicle from a given start velocity to a given target velocity.\n\nTypical unit code(s): SEC for seconds\n\n* Note: There are unfortunately no standard unit codes for seconds/0..100 km/h or seconds/0..60 mph. Simply use &quot;SEC&quot; for seconds and indicate the velocities in the [[name]] of the [[QuantitativeValue]], or use [[valueReference]] with a [[QuantitativeValue]] of 0..60 mph or 0..100 km/h to specify the reference speeds.
   * @return accelerationTime property set by first invocation of accelerationTime method or {@code null}.
   */
  @JsonIgnore public QuantitativeValue getAccelerationTime() {
    return (QuantitativeValue) getValue("accelerationTime");
  }
  /**
   * The time needed to accelerate the vehicle from a given start velocity to a given target velocity.\n\nTypical unit code(s): SEC for seconds\n\n* Note: There are unfortunately no standard unit codes for seconds/0..100 km/h or seconds/0..60 mph. Simply use &quot;SEC&quot; for seconds and indicate the velocities in the [[name]] of the [[QuantitativeValue]], or use [[valueReference]] with a [[QuantitativeValue]] of 0..60 mph or 0..100 km/h to specify the reference speeds.
   * @return all accelerationTime properties as {@link java.util.Collection} or an empty collection 
   * if accelerationTime was not set.
   */
  @JsonIgnore public java.util.Collection<QuantitativeValue> getAccelerationTimes() {
    final java.lang.Object current = myData.get("accelerationTime");
    if (current == null) return Collections.emptyList();
    if (current instanceof java.util.Collection) {
      return (java.util.Collection<QuantitativeValue>) current;
    }
    return Arrays.asList((QuantitativeValue) current);
  }
  /**
   * A textual description of known damages, both repaired and unrepaired.
   * @return knownVehicleDamages property set by first invocation of knownVehicleDamages method or {@code null}.
   */
  @JsonIgnore public String getKnownVehicleDamages() {
    return (String) getValue("knownVehicleDamages");
  }
  /**
   * A textual description of known damages, both repaired and unrepaired.
   * @return all knownVehicleDamages properties as {@link java.util.Collection} or an empty collection 
   * if knownVehicleDamages was not set.
   */
  @JsonIgnore public java.util.Collection<String> getKnownVehicleDamagess() {
    final java.lang.Object current = myData.get("knownVehicleDamages");
    if (current == null) return Collections.emptyList();
    if (current instanceof java.util.Collection) {
      return (java.util.Collection<String>) current;
    }
    return Arrays.asList((String) current);
  }
  /**
   * The release date of a vehicle model (often used to differentiate versions of the same make and model).
   * @return modelDate property set by first invocation of modelDate method or {@code null}.
   */
  @JsonIgnore public java.util.Date getModelDate() {
    return (java.util.Date) getValue("modelDate");
  }
  /**
   * The release date of a vehicle model (often used to differentiate versions of the same make and model).
   * @return all modelDate properties as {@link java.util.Collection} or an empty collection 
   * if modelDate was not set.
   */
  @JsonIgnore public java.util.Collection<java.util.Date> getModelDates() {
    final java.lang.Object current = myData.get("modelDate");
    if (current == null) return Collections.emptyList();
    if (current instanceof java.util.Collection) {
      return (java.util.Collection<java.util.Date>) current;
    }
    return Arrays.asList((java.util.Date) current);
  }
  /**
   * This is a StupidProperty! - for testing only
   * @return stupidProperty property set by first invocation of stupidProperty method or {@code null}.
   */
  @JsonIgnore public QuantitativeValue getStupidProperty() {
    return (QuantitativeValue) getValue("stupidProperty");
  }
  /**
   * This is a StupidProperty! - for testing only
   * @return all stupidProperty properties as {@link java.util.Collection} or an empty collection 
   * if stupidProperty was not set.
   */
  @JsonIgnore public java.util.Collection<QuantitativeValue> getStupidPropertys() {
    final java.lang.Object current = myData.get("stupidProperty");
    if (current == null) return Collections.emptyList();
    if (current instanceof java.util.Collection) {
      return (java.util.Collection<QuantitativeValue>) current;
    }
    return Arrays.asList((QuantitativeValue) current);
  }
  /**
   * The release date of a vehicle model (often used to differentiate versions of the same make and model).
   * @return vehicleModelDate property set by first invocation of vehicleModelDate method or {@code null}.
   */
  @JsonIgnore public java.util.Date getVehicleModelDate() {
    return (java.util.Date) getValue("vehicleModelDate");
  }
  /**
   * The release date of a vehicle model (often used to differentiate versions of the same make and model).
   * @return all vehicleModelDate properties as {@link java.util.Collection} or an empty collection 
   * if vehicleModelDate was not set.
   */
  @JsonIgnore public java.util.Collection<java.util.Date> getVehicleModelDates() {
    final java.lang.Object current = myData.get("vehicleModelDate");
    if (current == null) return Collections.emptyList();
    if (current instanceof java.util.Collection) {
      return (java.util.Collection<java.util.Date>) current;
    }
    return Arrays.asList((java.util.Date) current);
  }
  protected Vehicle(java.util.Map<String,java.lang.Object> data) {
    super(data);
  }
  
  /**
   * Builder for {@link Vehicle}
   */
  public static class Builder extends Product.Builder {
    public Builder(@NotNull HashMap<String,java.lang.Object> data) {
      super(data);
    }
    @NotNull public Vehicle build() {
      return new Vehicle(myData);
    }
    /**
     * The number of passengers that can be seated in the vehicle, both in terms of the physical space available, and in terms of limitations set by law.\n\nTypical unit code(s): C62 for persons.
     * @param number value to set
     * @return this builder instance
     */
    @NotNull public Builder vehicleSeatingCapacity(@NotNull Number number) {
      putValue("vehicleSeatingCapacity", number);
      return this;
    }
    /**
     * The number of passengers that can be seated in the vehicle, both in terms of the physical space available, and in terms of limitations set by law.\n\nTypical unit code(s): C62 for persons.
     * @param quantitativeValue value to set
     * @return this builder instance
     */
    @NotNull public Builder vehicleSeatingCapacity(@NotNull QuantitativeValue quantitativeValue) {
      putValue("vehicleSeatingCapacity", quantitativeValue);
      return this;
    }
    /**
     * The number of passengers that can be seated in the vehicle, both in terms of the physical space available, and in terms of limitations set by law.\n\nTypical unit code(s): C62 for persons.
     * @param quantitativeValue value to set
     * @return this builder instance
     */
    @NotNull public Builder vehicleSeatingCapacity(@NotNull QuantitativeValue.Builder quantitativeValue) {
      putValue("vehicleSeatingCapacity", quantitativeValue.build());
      return this;
    }
    /**
     * Remove vehicleSeatingCapacity property from the builder.
     * If this property is repeatable, all instances are removed.
     * @return this builder instance
     */
    @NotNull public Builder removeVehicleSeatingCapacity() {
      removeValue("vehicleSeatingCapacity");
      return this;
    }
    /**
     * Get currently set value for vehicleSeatingCapacity property in this builder.
     * @return previously set value or {@code null}. If multiple values have been 
     * set to this property, then {@link java.util.Collection} instance will be 
     * returned.
     */
    @Nullable public java.lang.Object getVehicleSeatingCapacity() {
      return myData.get("vehicleSeatingCapacity");
    }
    /**
     * The drive wheel configuration, i.e. which roadwheels will receive torque from the vehicle's engine via the drivetrain.
     * @param driveWheelConfigurationValue value to set
     * @return this builder instance
     */
    @NotNull public Builder driveWheelConfiguration(@NotNull DriveWheelConfigurationValue driveWheelConfigurationValue) {
      putValue("driveWheelConfiguration", driveWheelConfigurationValue);
      return this;
    }
    /**
     * The drive wheel configuration, i.e. which roadwheels will receive torque from the vehicle's engine via the drivetrain.
     * @param driveWheelConfigurationValue value to set
     * @return this builder instance
     */
    @NotNull public Builder driveWheelConfiguration(@NotNull DriveWheelConfigurationValue.Builder driveWheelConfigurationValue) {
      putValue("driveWheelConfiguration", driveWheelConfigurationValue.build());
      return this;
    }
    /**
     * The drive wheel configuration, i.e. which roadwheels will receive torque from the vehicle's engine via the drivetrain.
     * @param driveWheelConfiguration value to set
     * @return this builder instance
     */
    @NotNull public Builder driveWheelConfiguration(@NotNull String driveWheelConfiguration) {
      putValue("driveWheelConfiguration", driveWheelConfiguration);
      return this;
    }
    /**
     * Remove driveWheelConfiguration property from the builder.
     * If this property is repeatable, all instances are removed.
     * @return this builder instance
     */
    @NotNull public Builder removeDriveWheelConfiguration() {
      removeValue("driveWheelConfiguration");
      return this;
    }
    /**
     * Get currently set value for driveWheelConfiguration property in this builder.
     * @return previously set value or {@code null}. If multiple values have been 
     * set to this property, then {@link java.util.Collection} instance will be 
     * returned.
     */
    @Nullable public java.lang.Object getDriveWheelConfiguration() {
      return myData.get("driveWheelConfiguration");
    }
    /**
     * The date the item e.g. vehicle was purchased by the current owner.
     * @param date value to set
     * @return this builder instance
     */
    @NotNull public Builder purchaseDate(@NotNull java.util.Date date) {
      putValue("purchaseDate", date);
      return this;
    }
    /**
     * Remove purchaseDate property from the builder.
     * If this property is repeatable, all instances are removed.
     * @return this builder instance
     */
    @NotNull public Builder removePurchaseDate() {
      removeValue("purchaseDate");
      return this;
    }
    /**
     * Get currently set value for purchaseDate property in this builder.
     * @return previously set value or {@code null}. If multiple values have been 
     * set to this property, then {@link java.util.Collection} instance will be 
     * returned.
     */
    @Nullable public java.lang.Object getPurchaseDate() {
      return myData.get("purchaseDate");
    }
    /**
     * A [callsign](https://en.wikipedia.org/wiki/Call_sign), as used in broadcasting and radio communications to identify people, radio and TV stations, or vehicles.
     * @param identifier value to set
     * @return this builder instance
     */
    @NotNull public Builder callSign(@NotNull Identifier identifier) {
      putValue("callSign", identifier);
      return this;
    }
    /**
     * Remove callSign property from the builder.
     * If this property is repeatable, all instances are removed.
     * @return this builder instance
     */
    @NotNull public Builder removeCallSign() {
      removeValue("callSign");
      return this;
    }
    /**
     * Get currently set value for callSign property in this builder.
     * @return previously set value or {@code null}. If multiple values have been 
     * set to this property, then {@link java.util.Collection} instance will be 
     * returned.
     */
    @Nullable public java.lang.Object getCallSign() {
      return myData.get("callSign");
    }
    /**
     * The amount of fuel consumed for traveling a particular distance or temporal duration with the given vehicle (e.g. liters per 100 km).\n\n* Note 1: There are unfortunately no standard unit codes for liters per 100 km.  Use [[unitText]] to indicate the unit of measurement, e.g. L/100 km.\n* Note 2: There are two ways of indicating the fuel consumption, [[fuelConsumption]] (e.g. 8 liters per 100 km) and [[fuelEfficiency]] (e.g. 30 miles per gallon). They are reciprocal.\n* Note 3: Often, the absolute value is useful only when related to driving speed (&quot;at 80 km/h&quot;) or usage pattern (&quot;city traffic&quot;). You can use [[valueReference]] to link the value for the fuel consumption to another value.
     * @param quantitativeValue value to set
     * @return this builder instance
     */
    @NotNull public Builder fuelConsumption(@NotNull QuantitativeValue quantitativeValue) {
      putValue("fuelConsumption", quantitativeValue);
      return this;
    }
    /**
     * The amount of fuel consumed for traveling a particular distance or temporal duration with the given vehicle (e.g. liters per 100 km).\n\n* Note 1: There are unfortunately no standard unit codes for liters per 100 km.  Use [[unitText]] to indicate the unit of measurement, e.g. L/100 km.\n* Note 2: There are two ways of indicating the fuel consumption, [[fuelConsumption]] (e.g. 8 liters per 100 km) and [[fuelEfficiency]] (e.g. 30 miles per gallon). They are reciprocal.\n* Note 3: Often, the absolute value is useful only when related to driving speed (&quot;at 80 km/h&quot;) or usage pattern (&quot;city traffic&quot;). You can use [[valueReference]] to link the value for the fuel consumption to another value.
     * @param quantitativeValue value to set
     * @return this builder instance
     */
    @NotNull public Builder fuelConsumption(@NotNull QuantitativeValue.Builder quantitativeValue) {
      putValue("fuelConsumption", quantitativeValue.build());
      return this;
    }
    /**
     * Remove fuelConsumption property from the builder.
     * If this property is repeatable, all instances are removed.
     * @return this builder instance
     */
    @NotNull public Builder removeFuelConsumption() {
      removeValue("fuelConsumption");
      return this;
    }
    /**
     * Get currently set value for fuelConsumption property in this builder.
     * @return previously set value or {@code null}. If multiple values have been 
     * set to this property, then {@link java.util.Collection} instance will be 
     * returned.
     */
    @Nullable public java.lang.Object getFuelConsumption() {
      return myData.get("fuelConsumption");
    }
    /**
     * A short text indicating the configuration of the vehicle, e.g. '5dr hatchback ST 2.5 MT 225 hp' or 'limited edition'.
     * @param vehicleConfiguration value to set
     * @return this builder instance
     */
    @NotNull public Builder vehicleConfiguration(@NotNull String vehicleConfiguration) {
      putValue("vehicleConfiguration", vehicleConfiguration);
      return this;
    }
    /**
     * Remove vehicleConfiguration property from the builder.
     * If this property is repeatable, all instances are removed.
     * @return this builder instance
     */
    @NotNull public Builder removeVehicleConfiguration() {
      removeValue("vehicleConfiguration");
      return this;
    }
    /**
     * Get currently set value for vehicleConfiguration property in this builder.
     * @return previously set value or {@code null}. If multiple values have been 
     * set to this property, then {@link java.util.Collection} instance will be 
     * returned.
     */
    @Nullable public java.lang.Object getVehicleConfiguration() {
      return myData.get("vehicleConfiguration");
    }
    /**
     * The permitted vertical load (TWR) of a trailer attached to the vehicle. Also referred to as Tongue Load Rating (TLR) or Vertical Load Rating (VLR)\n\nTypical unit code(s): KGM for kilogram, LBR for pound\n\n* Note 1: You can indicate additional information in the [[name]] of the [[QuantitativeValue]] node.\n* Note 2: You may also link to a [[QualitativeValue]] node that provides additional information using [[valueReference]].\n* Note 3: Note that you can use [[minValue]] and [[maxValue]] to indicate ranges.
     * @param quantitativeValue value to set
     * @return this builder instance
     */
    @NotNull public Builder tongueWeight(@NotNull QuantitativeValue quantitativeValue) {
      putValue("tongueWeight", quantitativeValue);
      return this;
    }
    /**
     * The permitted vertical load (TWR) of a trailer attached to the vehicle. Also referred to as Tongue Load Rating (TLR) or Vertical Load Rating (VLR)\n\nTypical unit code(s): KGM for kilogram, LBR for pound\n\n* Note 1: You can indicate additional information in the [[name]] of the [[QuantitativeValue]] node.\n* Note 2: You may also link to a [[QualitativeValue]] node that provides additional information using [[valueReference]].\n* Note 3: Note that you can use [[minValue]] and [[maxValue]] to indicate ranges.
     * @param quantitativeValue value to set
     * @return this builder instance
     */
    @NotNull public Builder tongueWeight(@NotNull QuantitativeValue.Builder quantitativeValue) {
      putValue("tongueWeight", quantitativeValue.build());
      return this;
    }
    /**
     * Remove tongueWeight property from the builder.
     * If this property is repeatable, all instances are removed.
     * @return this builder instance
     */
    @NotNull public Builder removeTongueWeight() {
      removeValue("tongueWeight");
      return this;
    }
    /**
     * Get currently set value for tongueWeight property in this builder.
     * @return previously set value or {@code null}. If multiple values have been 
     * set to this property, then {@link java.util.Collection} instance will be 
     * returned.
     */
    @Nullable public java.lang.Object getTongueWeight() {
      return myData.get("tongueWeight");
    }
    /**
     * The number of doors.\n\nTypical unit code(s): C62
     * @param integer value to set
     * @return this builder instance
     */
    @NotNull public Builder numberOfDoors(@NotNull Integer integer) {
      putValue("numberOfDoors", integer);
      return this;
    }
    /**
     * The number of doors.\n\nTypical unit code(s): C62
     * @param numberOfDoors value to set
     * @return this builder instance
     */
    @NotNull public Builder numberOfDoors(@NotNull Long numberOfDoors) {
      putValue("numberOfDoors", numberOfDoors);
      return this;
    }
    /**
     * The number of doors.\n\nTypical unit code(s): C62
     * @param numberOfDoors value to set
     * @return this builder instance
     */
    @NotNull public Builder numberOfDoors(@NotNull Float numberOfDoors) {
      putValue("numberOfDoors", numberOfDoors);
      return this;
    }
    /**
     * The number of doors.\n\nTypical unit code(s): C62
     * @param numberOfDoors value to set
     * @return this builder instance
     */
    @NotNull public Builder numberOfDoors(@NotNull Double numberOfDoors) {
      putValue("numberOfDoors", numberOfDoors);
      return this;
    }
    /**
     * The number of doors.\n\nTypical unit code(s): C62
     * @param numberOfDoors value to set
     * @return this builder instance
     */
    @NotNull public Builder numberOfDoors(@NotNull String numberOfDoors) {
      putValue("numberOfDoors", numberOfDoors);
      return this;
    }
    /**
     * Remove numberOfDoors property from the builder.
     * If this property is repeatable, all instances are removed.
     * @return this builder instance
     */
    @NotNull public Builder removeNumberOfDoors() {
      removeValue("numberOfDoors");
      return this;
    }
    /**
     * Get currently set value for numberOfDoors property in this builder.
     * @return previously set value or {@code null}. If multiple values have been 
     * set to this property, then {@link java.util.Collection} instance will be 
     * returned.
     */
    @Nullable public java.lang.Object getNumberOfDoors() {
      return myData.get("numberOfDoors");
    }
    /**
     * The total number of forward gears available for the transmission system of the vehicle.\n\nTypical unit code(s): C62
     * @param number value to set
     * @return this builder instance
     */
    @NotNull public Builder numberOfForwardGears(@NotNull Number number) {
      putValue("numberOfForwardGears", number);
      return this;
    }
    /**
     * The total number of forward gears available for the transmission system of the vehicle.\n\nTypical unit code(s): C62
     * @param quantitativeValue value to set
     * @return this builder instance
     */
    @NotNull public Builder numberOfForwardGears(@NotNull QuantitativeValue quantitativeValue) {
      putValue("numberOfForwardGears", quantitativeValue);
      return this;
    }
    /**
     * The total number of forward gears available for the transmission system of the vehicle.\n\nTypical unit code(s): C62
     * @param quantitativeValue value to set
     * @return this builder instance
     */
    @NotNull public Builder numberOfForwardGears(@NotNull QuantitativeValue.Builder quantitativeValue) {
      putValue("numberOfForwardGears", quantitativeValue.build());
      return this;
    }
    /**
     * Remove numberOfForwardGears property from the builder.
     * If this property is repeatable, all instances are removed.
     * @return this builder instance
     */
    @NotNull public Builder removeNumberOfForwardGears() {
      removeValue("numberOfForwardGears");
      return this;
    }
    /**
     * Get currently set value for numberOfForwardGears property in this builder.
     * @return previously set value or {@code null}. If multiple values have been 
     * set to this property, then {@link java.util.Collection} instance will be 
     * returned.
     */
    @Nullable public java.lang.Object getNumberOfForwardGears() {
      return myData.get("numberOfForwardGears");
    }
    /**
     * The number of owners of the vehicle, including the current one.\n\nTypical unit code(s): C62
     * @param number value to set
     * @return this builder instance
     */
    @NotNull public Builder numberOfPreviousOwners(@NotNull Number number) {
      putValue("numberOfPreviousOwners", number);
      return this;
    }
    /**
     * The number of owners of the vehicle, including the current one.\n\nTypical unit code(s): C62
     * @param quantitativeValue value to set
     * @return this builder instance
     */
    @NotNull public Builder numberOfPreviousOwners(@NotNull QuantitativeValue quantitativeValue) {
      putValue("numberOfPreviousOwners", quantitativeValue);
      return this;
    }
    /**
     * The number of owners of the vehicle, including the current one.\n\nTypical unit code(s): C62
     * @param quantitativeValue value to set
     * @return this builder instance
     */
    @NotNull public Builder numberOfPreviousOwners(@NotNull QuantitativeValue.Builder quantitativeValue) {
      putValue("numberOfPreviousOwners", quantitativeValue.build());
      return this;
    }
    /**
     * Remove numberOfPreviousOwners property from the builder.
     * If this property is repeatable, all instances are removed.
     * @return this builder instance
     */
    @NotNull public Builder removeNumberOfPreviousOwners() {
      removeValue("numberOfPreviousOwners");
      return this;
    }
    /**
     * Get currently set value for numberOfPreviousOwners property in this builder.
     * @return previously set value or {@code null}. If multiple values have been 
     * set to this property, then {@link java.util.Collection} instance will be 
     * returned.
     */
    @Nullable public java.lang.Object getNumberOfPreviousOwners() {
      return myData.get("numberOfPreviousOwners");
    }
    /**
     * The speed range of the vehicle. If the vehicle is powered by an engine, the upper limit of the speed range (indicated by [[maxValue]] should be the maximum speed achievable under regular conditions.\n\nTypical unit code(s): KMH for km/h, HM for mile per hour (0.447 04 m/s), KNT for knot\n\n*Note 1: Use [[minValue]] and [[maxValue]] to indicate the range. Typically, the minimal value is zero.\n* Note 2: There are many different ways of measuring the speed range. You can link to information about how the given value has been determined using the [[valueReference]] property.
     * @param quantitativeValue value to set
     * @return this builder instance
     */
    @NotNull public Builder speed(@NotNull QuantitativeValue quantitativeValue) {
      putValue("speed", quantitativeValue);
      return this;
    }
    /**
     * The speed range of the vehicle. If the vehicle is powered by an engine, the upper limit of the speed range (indicated by [[maxValue]] should be the maximum speed achievable under regular conditions.\n\nTypical unit code(s): KMH for km/h, HM for mile per hour (0.447 04 m/s), KNT for knot\n\n*Note 1: Use [[minValue]] and [[maxValue]] to indicate the range. Typically, the minimal value is zero.\n* Note 2: There are many different ways of measuring the speed range. You can link to information about how the given value has been determined using the [[valueReference]] property.
     * @param quantitativeValue value to set
     * @return this builder instance
     */
    @NotNull public Builder speed(@NotNull QuantitativeValue.Builder quantitativeValue) {
      putValue("speed", quantitativeValue.build());
      return this;
    }
    /**
     * Remove speed property from the builder.
     * If this property is repeatable, all instances are removed.
     * @return this builder instance
     */
    @NotNull public Builder removeSpeed() {
      removeValue("speed");
      return this;
    }
    /**
     * Get currently set value for speed property in this builder.
     * @return previously set value or {@code null}. If multiple values have been 
     * set to this property, then {@link java.util.Collection} instance will be 
     * returned.
     */
    @Nullable public java.lang.Object getSpeed() {
      return myData.get("speed");
    }
    /**
     * The number of persons that can be seated (e.g. in a vehicle), both in terms of the physical space available, and in terms of limitations set by law.\n\nTypical unit code(s): C62 for persons 
     * @param number value to set
     * @return this builder instance
     */
    @NotNull public Builder seatingCapacity(@NotNull Number number) {
      putValue("seatingCapacity", number);
      return this;
    }
    /**
     * The number of persons that can be seated (e.g. in a vehicle), both in terms of the physical space available, and in terms of limitations set by law.\n\nTypical unit code(s): C62 for persons 
     * @param quantitativeValue value to set
     * @return this builder instance
     */
    @NotNull public Builder seatingCapacity(@NotNull QuantitativeValue quantitativeValue) {
      putValue("seatingCapacity", quantitativeValue);
      return this;
    }
    /**
     * The number of persons that can be seated (e.g. in a vehicle), both in terms of the physical space available, and in terms of limitations set by law.\n\nTypical unit code(s): C62 for persons 
     * @param quantitativeValue value to set
     * @return this builder instance
     */
    @NotNull public Builder seatingCapacity(@NotNull QuantitativeValue.Builder quantitativeValue) {
      putValue("seatingCapacity", quantitativeValue.build());
      return this;
    }
    /**
     * Remove seatingCapacity property from the builder.
     * If this property is repeatable, all instances are removed.
     * @return this builder instance
     */
    @NotNull public Builder removeSeatingCapacity() {
      removeValue("seatingCapacity");
      return this;
    }
    /**
     * Get currently set value for seatingCapacity property in this builder.
     * @return previously set value or {@code null}. If multiple values have been 
     * set to this property, then {@link java.util.Collection} instance will be 
     * returned.
     */
    @Nullable public java.lang.Object getSeatingCapacity() {
      return myData.get("seatingCapacity");
    }
    /**
     * The type of fuel suitable for the engine or engines of the vehicle. If the vehicle has only one engine, this property can be attached directly to the vehicle.
     * @param qualitativeValue value to set
     * @return this builder instance
     */
    @NotNull public Builder fuelType(@NotNull QualitativeValue qualitativeValue) {
      putValue("fuelType", qualitativeValue);
      return this;
    }
    /**
     * The type of fuel suitable for the engine or engines of the vehicle. If the vehicle has only one engine, this property can be attached directly to the vehicle.
     * @param qualitativeValue value to set
     * @return this builder instance
     */
    @NotNull public Builder fuelType(@NotNull QualitativeValue.Builder qualitativeValue) {
      putValue("fuelType", qualitativeValue.build());
      return this;
    }
    /**
     * The type of fuel suitable for the engine or engines of the vehicle. If the vehicle has only one engine, this property can be attached directly to the vehicle.
     * @param fuelType value to set
     * @return this builder instance
     */
    @NotNull public Builder fuelType(@NotNull String fuelType) {
      putValue("fuelType", fuelType);
      return this;
    }
    /**
     * Remove fuelType property from the builder.
     * If this property is repeatable, all instances are removed.
     * @return this builder instance
     */
    @NotNull public Builder removeFuelType() {
      removeValue("fuelType");
      return this;
    }
    /**
     * Get currently set value for fuelType property in this builder.
     * @return previously set value or {@code null}. If multiple values have been 
     * set to this property, then {@link java.util.Collection} instance will be 
     * returned.
     */
    @Nullable public java.lang.Object getFuelType() {
      return myData.get("fuelType");
    }
    /**
     * Information about the engine or engines of the vehicle.
     * @param engineSpecification value to set
     * @return this builder instance
     */
    @NotNull public Builder vehicleEngine(@NotNull EngineSpecification engineSpecification) {
      putValue("vehicleEngine", engineSpecification);
      return this;
    }
    /**
     * Information about the engine or engines of the vehicle.
     * @param engineSpecification value to set
     * @return this builder instance
     */
    @NotNull public Builder vehicleEngine(@NotNull EngineSpecification.Builder engineSpecification) {
      putValue("vehicleEngine", engineSpecification.build());
      return this;
    }
    /**
     * Remove vehicleEngine property from the builder.
     * If this property is repeatable, all instances are removed.
     * @return this builder instance
     */
    @NotNull public Builder removeVehicleEngine() {
      removeValue("vehicleEngine");
      return this;
    }
    /**
     * Get currently set value for vehicleEngine property in this builder.
     * @return previously set value or {@code null}. If multiple values have been 
     * set to this property, then {@link java.util.Collection} instance will be 
     * returned.
     */
    @Nullable public java.lang.Object getVehicleEngine() {
      return myData.get("vehicleEngine");
    }
    /**
     * The type or material of the interior of the vehicle (e.g. synthetic fabric, leather, wood, etc.). While most interior types are characterized by the material used, an interior type can also be based on vehicle usage or target audience.
     * @param vehicleInteriorType value to set
     * @return this builder instance
     */
    @NotNull public Builder vehicleInteriorType(@NotNull String vehicleInteriorType) {
      putValue("vehicleInteriorType", vehicleInteriorType);
      return this;
    }
    /**
     * Remove vehicleInteriorType property from the builder.
     * If this property is repeatable, all instances are removed.
     * @return this builder instance
     */
    @NotNull public Builder removeVehicleInteriorType() {
      removeValue("vehicleInteriorType");
      return this;
    }
    /**
     * Get currently set value for vehicleInteriorType property in this builder.
     * @return previously set value or {@code null}. If multiple values have been 
     * set to this property, then {@link java.util.Collection} instance will be 
     * returned.
     */
    @Nullable public java.lang.Object getVehicleInteriorType() {
      return myData.get("vehicleInteriorType");
    }
    /**
     * The position of the steering wheel or similar device (mostly for cars).
     * @param steeringPositionValue value to set
     * @return this builder instance
     */
    @NotNull public Builder steeringPosition(@NotNull SteeringPositionValue steeringPositionValue) {
      putValue("steeringPosition", steeringPositionValue);
      return this;
    }
    /**
     * The position of the steering wheel or similar device (mostly for cars).
     * @param steeringPositionValue value to set
     * @return this builder instance
     */
    @NotNull public Builder steeringPosition(@NotNull SteeringPositionValue.Builder steeringPositionValue) {
      putValue("steeringPosition", steeringPositionValue.build());
      return this;
    }
    /**
     * Remove steeringPosition property from the builder.
     * If this property is repeatable, all instances are removed.
     * @return this builder instance
     */
    @NotNull public Builder removeSteeringPosition() {
      removeValue("steeringPosition");
      return this;
    }
    /**
     * Get currently set value for steeringPosition property in this builder.
     * @return previously set value or {@code null}. If multiple values have been 
     * set to this property, then {@link java.util.Collection} instance will be 
     * returned.
     */
    @Nullable public java.lang.Object getSteeringPosition() {
      return myData.get("steeringPosition");
    }
    /**
     * The color or color combination of the interior of the vehicle.
     * @param vehicleInteriorColor value to set
     * @return this builder instance
     */
    @NotNull public Builder vehicleInteriorColor(@NotNull String vehicleInteriorColor) {
      putValue("vehicleInteriorColor", vehicleInteriorColor);
      return this;
    }
    /**
     * Remove vehicleInteriorColor property from the builder.
     * If this property is repeatable, all instances are removed.
     * @return this builder instance
     */
    @NotNull public Builder removeVehicleInteriorColor() {
      removeValue("vehicleInteriorColor");
      return this;
    }
    /**
     * Get currently set value for vehicleInteriorColor property in this builder.
     * @return previously set value or {@code null}. If multiple values have been 
     * set to this property, then {@link java.util.Collection} instance will be 
     * returned.
     */
    @Nullable public java.lang.Object getVehicleInteriorColor() {
      return myData.get("vehicleInteriorColor");
    }
    /**
     * The total distance travelled by the particular vehicle since its initial production, as read from its odometer.\n\nTypical unit code(s): KMT for kilometers, SMI for statute miles
     * @param quantitativeValue value to set
     * @return this builder instance
     */
    @NotNull public Builder mileageFromOdometer(@NotNull QuantitativeValue quantitativeValue) {
      putValue("mileageFromOdometer", quantitativeValue);
      return this;
    }
    /**
     * The total distance travelled by the particular vehicle since its initial production, as read from its odometer.\n\nTypical unit code(s): KMT for kilometers, SMI for statute miles
     * @param quantitativeValue value to set
     * @return this builder instance
     */
    @NotNull public Builder mileageFromOdometer(@NotNull QuantitativeValue.Builder quantitativeValue) {
      putValue("mileageFromOdometer", quantitativeValue.build());
      return this;
    }
    /**
     * Remove mileageFromOdometer property from the builder.
     * If this property is repeatable, all instances are removed.
     * @return this builder instance
     */
    @NotNull public Builder removeMileageFromOdometer() {
      removeValue("mileageFromOdometer");
      return this;
    }
    /**
     * Get currently set value for mileageFromOdometer property in this builder.
     * @return previously set value or {@code null}. If multiple values have been 
     * set to this property, then {@link java.util.Collection} instance will be 
     * returned.
     */
    @Nullable public java.lang.Object getMileageFromOdometer() {
      return myData.get("mileageFromOdometer");
    }
    /**
     * The capacity of the fuel tank or in the case of electric cars, the battery. If there are multiple components for storage, this should indicate the total of all storage of the same type.\n\nTypical unit code(s): LTR for liters, GLL of US gallons, GLI for UK / imperial gallons, AMH for ampere-hours (for electrical vehicles).
     * @param quantitativeValue value to set
     * @return this builder instance
     */
    @NotNull public Builder fuelCapacity(@NotNull QuantitativeValue quantitativeValue) {
      putValue("fuelCapacity", quantitativeValue);
      return this;
    }
    /**
     * The capacity of the fuel tank or in the case of electric cars, the battery. If there are multiple components for storage, this should indicate the total of all storage of the same type.\n\nTypical unit code(s): LTR for liters, GLL of US gallons, GLI for UK / imperial gallons, AMH for ampere-hours (for electrical vehicles).
     * @param quantitativeValue value to set
     * @return this builder instance
     */
    @NotNull public Builder fuelCapacity(@NotNull QuantitativeValue.Builder quantitativeValue) {
      putValue("fuelCapacity", quantitativeValue.build());
      return this;
    }
    /**
     * Remove fuelCapacity property from the builder.
     * If this property is repeatable, all instances are removed.
     * @return this builder instance
     */
    @NotNull public Builder removeFuelCapacity() {
      removeValue("fuelCapacity");
      return this;
    }
    /**
     * Get currently set value for fuelCapacity property in this builder.
     * @return previously set value or {@code null}. If multiple values have been 
     * set to this property, then {@link java.util.Collection} instance will be 
     * returned.
     */
    @Nullable public java.lang.Object getFuelCapacity() {
      return myData.get("fuelCapacity");
    }
    /**
     * The number of axles.\n\nTypical unit code(s): C62
     * @param integer value to set
     * @return this builder instance
     */
    @NotNull public Builder numberOfAxles(@NotNull Integer integer) {
      putValue("numberOfAxles", integer);
      return this;
    }
    /**
     * The number of axles.\n\nTypical unit code(s): C62
     * @param numberOfAxles value to set
     * @return this builder instance
     */
    @NotNull public Builder numberOfAxles(@NotNull Long numberOfAxles) {
      putValue("numberOfAxles", numberOfAxles);
      return this;
    }
    /**
     * The number of axles.\n\nTypical unit code(s): C62
     * @param numberOfAxles value to set
     * @return this builder instance
     */
    @NotNull public Builder numberOfAxles(@NotNull Float numberOfAxles) {
      putValue("numberOfAxles", numberOfAxles);
      return this;
    }
    /**
     * The number of axles.\n\nTypical unit code(s): C62
     * @param numberOfAxles value to set
     * @return this builder instance
     */
    @NotNull public Builder numberOfAxles(@NotNull Double numberOfAxles) {
      putValue("numberOfAxles", numberOfAxles);
      return this;
    }
    /**
     * The number of axles.\n\nTypical unit code(s): C62
     * @param numberOfAxles value to set
     * @return this builder instance
     */
    @NotNull public Builder numberOfAxles(@NotNull String numberOfAxles) {
      putValue("numberOfAxles", numberOfAxles);
      return this;
    }
    /**
     * Remove numberOfAxles property from the builder.
     * If this property is repeatable, all instances are removed.
     * @return this builder instance
     */
    @NotNull public Builder removeNumberOfAxles() {
      removeValue("numberOfAxles");
      return this;
    }
    /**
     * Get currently set value for numberOfAxles property in this builder.
     * @return previously set value or {@code null}. If multiple values have been 
     * set to this property, then {@link java.util.Collection} instance will be 
     * returned.
     */
    @Nullable public java.lang.Object getNumberOfAxles() {
      return myData.get("numberOfAxles");
    }
    /**
     * Indicates the design and body style of the vehicle (e.g. station wagon, hatchback, etc.).
     * @param qualitativeValue value to set
     * @return this builder instance
     */
    @NotNull public Builder bodyType(@NotNull QualitativeValue qualitativeValue) {
      putValue("bodyType", qualitativeValue);
      return this;
    }
    /**
     * Indicates the design and body style of the vehicle (e.g. station wagon, hatchback, etc.).
     * @param qualitativeValue value to set
     * @return this builder instance
     */
    @NotNull public Builder bodyType(@NotNull QualitativeValue.Builder qualitativeValue) {
      putValue("bodyType", qualitativeValue.build());
      return this;
    }
    /**
     * Indicates the design and body style of the vehicle (e.g. station wagon, hatchback, etc.).
     * @param bodyType value to set
     * @return this builder instance
     */
    @NotNull public Builder bodyType(@NotNull String bodyType) {
      putValue("bodyType", bodyType);
      return this;
    }
    /**
     * Remove bodyType property from the builder.
     * If this property is repeatable, all instances are removed.
     * @return this builder instance
     */
    @NotNull public Builder removeBodyType() {
      removeValue("bodyType");
      return this;
    }
    /**
     * Get currently set value for bodyType property in this builder.
     * @return previously set value or {@code null}. If multiple values have been 
     * set to this property, then {@link java.util.Collection} instance will be 
     * returned.
     */
    @Nullable public java.lang.Object getBodyType() {
      return myData.get("bodyType");
    }
    /**
     * The permitted total weight of the loaded vehicle, including passengers and cargo and the weight of the empty vehicle.\n\nTypical unit code(s): KGM for kilogram, LBR for pound\n\n* Note 1: You can indicate additional information in the [[name]] of the [[QuantitativeValue]] node.\n* Note 2: You may also link to a [[QualitativeValue]] node that provides additional information using [[valueReference]].\n* Note 3: Note that you can use [[minValue]] and [[maxValue]] to indicate ranges.
     * @param quantitativeValue value to set
     * @return this builder instance
     */
    @NotNull public Builder weightTotal(@NotNull QuantitativeValue quantitativeValue) {
      putValue("weightTotal", quantitativeValue);
      return this;
    }
    /**
     * The permitted total weight of the loaded vehicle, including passengers and cargo and the weight of the empty vehicle.\n\nTypical unit code(s): KGM for kilogram, LBR for pound\n\n* Note 1: You can indicate additional information in the [[name]] of the [[QuantitativeValue]] node.\n* Note 2: You may also link to a [[QualitativeValue]] node that provides additional information using [[valueReference]].\n* Note 3: Note that you can use [[minValue]] and [[maxValue]] to indicate ranges.
     * @param quantitativeValue value to set
     * @return this builder instance
     */
    @NotNull public Builder weightTotal(@NotNull QuantitativeValue.Builder quantitativeValue) {
      putValue("weightTotal", quantitativeValue.build());
      return this;
    }
    /**
     * Remove weightTotal property from the builder.
     * If this property is repeatable, all instances are removed.
     * @return this builder instance
     */
    @NotNull public Builder removeWeightTotal() {
      removeValue("weightTotal");
      return this;
    }
    /**
     * Get currently set value for weightTotal property in this builder.
     * @return previously set value or {@code null}. If multiple values have been 
     * set to this property, then {@link java.util.Collection} instance will be 
     * returned.
     */
    @Nullable public java.lang.Object getWeightTotal() {
      return myData.get("weightTotal");
    }
    /**
     * The CO2 emissions in g/km. When used in combination with a QuantitativeValue, put &quot;g/km&quot; into the unitText property of that value, since there is no UN/CEFACT Common Code for &quot;g/km&quot;.
     * @param integer value to set
     * @return this builder instance
     */
    @NotNull public Builder emissionsCO2(@NotNull Integer integer) {
      putValue("emissionsCO2", integer);
      return this;
    }
    /**
     * The CO2 emissions in g/km. When used in combination with a QuantitativeValue, put &quot;g/km&quot; into the unitText property of that value, since there is no UN/CEFACT Common Code for &quot;g/km&quot;.
     * @param emissionsCO2 value to set
     * @return this builder instance
     */
    @NotNull public Builder emissionsCO2(@NotNull Long emissionsCO2) {
      putValue("emissionsCO2", emissionsCO2);
      return this;
    }
    /**
     * The CO2 emissions in g/km. When used in combination with a QuantitativeValue, put &quot;g/km&quot; into the unitText property of that value, since there is no UN/CEFACT Common Code for &quot;g/km&quot;.
     * @param emissionsCO2 value to set
     * @return this builder instance
     */
    @NotNull public Builder emissionsCO2(@NotNull Float emissionsCO2) {
      putValue("emissionsCO2", emissionsCO2);
      return this;
    }
    /**
     * The CO2 emissions in g/km. When used in combination with a QuantitativeValue, put &quot;g/km&quot; into the unitText property of that value, since there is no UN/CEFACT Common Code for &quot;g/km&quot;.
     * @param emissionsCO2 value to set
     * @return this builder instance
     */
    @NotNull public Builder emissionsCO2(@NotNull Double emissionsCO2) {
      putValue("emissionsCO2", emissionsCO2);
      return this;
    }
    /**
     * The CO2 emissions in g/km. When used in combination with a QuantitativeValue, put &quot;g/km&quot; into the unitText property of that value, since there is no UN/CEFACT Common Code for &quot;g/km&quot;.
     * @param emissionsCO2 value to set
     * @return this builder instance
     */
    @NotNull public Builder emissionsCO2(@NotNull String emissionsCO2) {
      putValue("emissionsCO2", emissionsCO2);
      return this;
    }
    /**
     * Remove emissionsCO2 property from the builder.
     * If this property is repeatable, all instances are removed.
     * @return this builder instance
     */
    @NotNull public Builder removeEmissionsCO2() {
      removeValue("emissionsCO2");
      return this;
    }
    /**
     * Get currently set value for emissionsCO2 property in this builder.
     * @return previously set value or {@code null}. If multiple values have been 
     * set to this property, then {@link java.util.Collection} instance will be 
     * returned.
     */
    @Nullable public java.lang.Object getEmissionsCO2() {
      return myData.get("emissionsCO2");
    }
    /**
     * The permitted weight of passengers and cargo, EXCLUDING the weight of the empty vehicle.\n\nTypical unit code(s): KGM for kilogram, LBR for pound\n\n* Note 1: Many databases specify the permitted TOTAL weight instead, which is the sum of [[weight]] and [[payload]]\n* Note 2: You can indicate additional information in the [[name]] of the [[QuantitativeValue]] node.\n* Note 3: You may also link to a [[QualitativeValue]] node that provides additional information using [[valueReference]].\n* Note 4: Note that you can use [[minValue]] and [[maxValue]] to indicate ranges.
     * @param quantitativeValue value to set
     * @return this builder instance
     */
    @NotNull public Builder payload(@NotNull QuantitativeValue quantitativeValue) {
      putValue("payload", quantitativeValue);
      return this;
    }
    /**
     * The permitted weight of passengers and cargo, EXCLUDING the weight of the empty vehicle.\n\nTypical unit code(s): KGM for kilogram, LBR for pound\n\n* Note 1: Many databases specify the permitted TOTAL weight instead, which is the sum of [[weight]] and [[payload]]\n* Note 2: You can indicate additional information in the [[name]] of the [[QuantitativeValue]] node.\n* Note 3: You may also link to a [[QualitativeValue]] node that provides additional information using [[valueReference]].\n* Note 4: Note that you can use [[minValue]] and [[maxValue]] to indicate ranges.
     * @param quantitativeValue value to set
     * @return this builder instance
     */
    @NotNull public Builder payload(@NotNull QuantitativeValue.Builder quantitativeValue) {
      putValue("payload", quantitativeValue.build());
      return this;
    }
    /**
     * Remove payload property from the builder.
     * If this property is repeatable, all instances are removed.
     * @return this builder instance
     */
    @NotNull public Builder removePayload() {
      removeValue("payload");
      return this;
    }
    /**
     * Get currently set value for payload property in this builder.
     * @return previously set value or {@code null}. If multiple values have been 
     * set to this property, then {@link java.util.Collection} instance will be 
     * returned.
     */
    @Nullable public java.lang.Object getPayload() {
      return myData.get("payload");
    }
    /**
     * The date of the first registration of the vehicle with the respective public authorities.
     * @param date value to set
     * @return this builder instance
     */
    @NotNull public Builder dateVehicleFirstRegistered(@NotNull java.util.Date date) {
      putValue("dateVehicleFirstRegistered", date);
      return this;
    }
    /**
     * Remove dateVehicleFirstRegistered property from the builder.
     * If this property is repeatable, all instances are removed.
     * @return this builder instance
     */
    @NotNull public Builder removeDateVehicleFirstRegistered() {
      removeValue("dateVehicleFirstRegistered");
      return this;
    }
    /**
     * Get currently set value for dateVehicleFirstRegistered property in this builder.
     * @return previously set value or {@code null}. If multiple values have been 
     * set to this property, then {@link java.util.Collection} instance will be 
     * returned.
     */
    @Nullable public java.lang.Object getDateVehicleFirstRegistered() {
      return myData.get("dateVehicleFirstRegistered");
    }
    /**
     * Indicates whether the vehicle has been used for special purposes, like commercial rental, driving school, or as a taxi. The legislation in many countries requires this information to be revealed when offering a car for sale.
     * @param carUsageType value to set
     * @return this builder instance
     */
    @NotNull public Builder vehicleSpecialUsage(@NotNull CarUsageType carUsageType) {
      putValue("vehicleSpecialUsage", carUsageType);
      return this;
    }
    /**
     * Indicates whether the vehicle has been used for special purposes, like commercial rental, driving school, or as a taxi. The legislation in many countries requires this information to be revealed when offering a car for sale.
     * @param vehicleSpecialUsage value to set
     * @return this builder instance
     */
    @NotNull public Builder vehicleSpecialUsage(@NotNull String vehicleSpecialUsage) {
      putValue("vehicleSpecialUsage", vehicleSpecialUsage);
      return this;
    }
    /**
     * Remove vehicleSpecialUsage property from the builder.
     * If this property is repeatable, all instances are removed.
     * @return this builder instance
     */
    @NotNull public Builder removeVehicleSpecialUsage() {
      removeValue("vehicleSpecialUsage");
      return this;
    }
    /**
     * Get currently set value for vehicleSpecialUsage property in this builder.
     * @return previously set value or {@code null}. If multiple values have been 
     * set to this property, then {@link java.util.Collection} instance will be 
     * returned.
     */
    @Nullable public java.lang.Object getVehicleSpecialUsage() {
      return myData.get("vehicleSpecialUsage");
    }
    /**
     * Indicates that the vehicle meets the respective emission standard.
     * @param qualitativeValue value to set
     * @return this builder instance
     */
    @NotNull public Builder meetsEmissionStandard(@NotNull QualitativeValue qualitativeValue) {
      putValue("meetsEmissionStandard", qualitativeValue);
      return this;
    }
    /**
     * Indicates that the vehicle meets the respective emission standard.
     * @param qualitativeValue value to set
     * @return this builder instance
     */
    @NotNull public Builder meetsEmissionStandard(@NotNull QualitativeValue.Builder qualitativeValue) {
      putValue("meetsEmissionStandard", qualitativeValue.build());
      return this;
    }
    /**
     * Indicates that the vehicle meets the respective emission standard.
     * @param meetsEmissionStandard value to set
     * @return this builder instance
     */
    @NotNull public Builder meetsEmissionStandard(@NotNull String meetsEmissionStandard) {
      putValue("meetsEmissionStandard", meetsEmissionStandard);
      return this;
    }
    /**
     * Remove meetsEmissionStandard property from the builder.
     * If this property is repeatable, all instances are removed.
     * @return this builder instance
     */
    @NotNull public Builder removeMeetsEmissionStandard() {
      removeValue("meetsEmissionStandard");
      return this;
    }
    /**
     * Get currently set value for meetsEmissionStandard property in this builder.
     * @return previously set value or {@code null}. If multiple values have been 
     * set to this property, then {@link java.util.Collection} instance will be 
     * returned.
     */
    @Nullable public java.lang.Object getMeetsEmissionStandard() {
      return myData.get("meetsEmissionStandard");
    }
    /**
     * The type of component used for transmitting the power from a rotating power source to the wheels or other relevant component(s) (&quot;gearbox&quot; for cars).
     * @param qualitativeValue value to set
     * @return this builder instance
     */
    @NotNull public Builder vehicleTransmission(@NotNull QualitativeValue qualitativeValue) {
      putValue("vehicleTransmission", qualitativeValue);
      return this;
    }
    /**
     * The type of component used for transmitting the power from a rotating power source to the wheels or other relevant component(s) (&quot;gearbox&quot; for cars).
     * @param qualitativeValue value to set
     * @return this builder instance
     */
    @NotNull public Builder vehicleTransmission(@NotNull QualitativeValue.Builder qualitativeValue) {
      putValue("vehicleTransmission", qualitativeValue.build());
      return this;
    }
    /**
     * The type of component used for transmitting the power from a rotating power source to the wheels or other relevant component(s) (&quot;gearbox&quot; for cars).
     * @param vehicleTransmission value to set
     * @return this builder instance
     */
    @NotNull public Builder vehicleTransmission(@NotNull String vehicleTransmission) {
      putValue("vehicleTransmission", vehicleTransmission);
      return this;
    }
    /**
     * Remove vehicleTransmission property from the builder.
     * If this property is repeatable, all instances are removed.
     * @return this builder instance
     */
    @NotNull public Builder removeVehicleTransmission() {
      removeValue("vehicleTransmission");
      return this;
    }
    /**
     * Get currently set value for vehicleTransmission property in this builder.
     * @return previously set value or {@code null}. If multiple values have been 
     * set to this property, then {@link java.util.Collection} instance will be 
     * returned.
     */
    @Nullable public java.lang.Object getVehicleTransmission() {
      return myData.get("vehicleTransmission");
    }
    /**
     * The available volume for cargo or luggage. For automobiles, this is usually the trunk volume.\n\nTypical unit code(s): LTR for liters, FTQ for cubic foot/feet\n\nNote: You can use [[minValue]] and [[maxValue]] to indicate ranges.
     * @param quantitativeValue value to set
     * @return this builder instance
     */
    @NotNull public Builder cargoVolume(@NotNull QuantitativeValue quantitativeValue) {
      putValue("cargoVolume", quantitativeValue);
      return this;
    }
    /**
     * The available volume for cargo or luggage. For automobiles, this is usually the trunk volume.\n\nTypical unit code(s): LTR for liters, FTQ for cubic foot/feet\n\nNote: You can use [[minValue]] and [[maxValue]] to indicate ranges.
     * @param quantitativeValue value to set
     * @return this builder instance
     */
    @NotNull public Builder cargoVolume(@NotNull QuantitativeValue.Builder quantitativeValue) {
      putValue("cargoVolume", quantitativeValue.build());
      return this;
    }
    /**
     * Remove cargoVolume property from the builder.
     * If this property is repeatable, all instances are removed.
     * @return this builder instance
     */
    @NotNull public Builder removeCargoVolume() {
      removeValue("cargoVolume");
      return this;
    }
    /**
     * Get currently set value for cargoVolume property in this builder.
     * @return previously set value or {@code null}. If multiple values have been 
     * set to this property, then {@link java.util.Collection} instance will be 
     * returned.
     */
    @Nullable public java.lang.Object getCargoVolume() {
      return myData.get("cargoVolume");
    }
    /**
     * The distance traveled per unit of fuel used; most commonly miles per gallon (mpg) or kilometers per liter (km/L).\n\n* Note 1: There are unfortunately no standard unit codes for miles per gallon or kilometers per liter. Use [[unitText]] to indicate the unit of measurement, e.g. mpg or km/L.\n* Note 2: There are two ways of indicating the fuel consumption, [[fuelConsumption]] (e.g. 8 liters per 100 km) and [[fuelEfficiency]] (e.g. 30 miles per gallon). They are reciprocal.\n* Note 3: Often, the absolute value is useful only when related to driving speed (&quot;at 80 km/h&quot;) or usage pattern (&quot;city traffic&quot;). You can use [[valueReference]] to link the value for the fuel economy to another value.
     * @param quantitativeValue value to set
     * @return this builder instance
     */
    @NotNull public Builder fuelEfficiency(@NotNull QuantitativeValue quantitativeValue) {
      putValue("fuelEfficiency", quantitativeValue);
      return this;
    }
    /**
     * The distance traveled per unit of fuel used; most commonly miles per gallon (mpg) or kilometers per liter (km/L).\n\n* Note 1: There are unfortunately no standard unit codes for miles per gallon or kilometers per liter. Use [[unitText]] to indicate the unit of measurement, e.g. mpg or km/L.\n* Note 2: There are two ways of indicating the fuel consumption, [[fuelConsumption]] (e.g. 8 liters per 100 km) and [[fuelEfficiency]] (e.g. 30 miles per gallon). They are reciprocal.\n* Note 3: Often, the absolute value is useful only when related to driving speed (&quot;at 80 km/h&quot;) or usage pattern (&quot;city traffic&quot;). You can use [[valueReference]] to link the value for the fuel economy to another value.
     * @param quantitativeValue value to set
     * @return this builder instance
     */
    @NotNull public Builder fuelEfficiency(@NotNull QuantitativeValue.Builder quantitativeValue) {
      putValue("fuelEfficiency", quantitativeValue.build());
      return this;
    }
    /**
     * Remove fuelEfficiency property from the builder.
     * If this property is repeatable, all instances are removed.
     * @return this builder instance
     */
    @NotNull public Builder removeFuelEfficiency() {
      removeValue("fuelEfficiency");
      return this;
    }
    /**
     * Get currently set value for fuelEfficiency property in this builder.
     * @return previously set value or {@code null}. If multiple values have been 
     * set to this property, then {@link java.util.Collection} instance will be 
     * returned.
     */
    @Nullable public java.lang.Object getFuelEfficiency() {
      return myData.get("fuelEfficiency");
    }
    /**
     * The Vehicle Identification Number (VIN) is a unique serial number used by the automotive industry to identify individual motor vehicles.
     * @param serialNumber value to set
     * @return this builder instance
     */
    @NotNull public Builder vehicleIdentificationNumber(@NotNull SerialNumber serialNumber) {
      putValue("vehicleIdentificationNumber", serialNumber);
      return this;
    }
    /**
     * Remove vehicleIdentificationNumber property from the builder.
     * If this property is repeatable, all instances are removed.
     * @return this builder instance
     */
    @NotNull public Builder removeVehicleIdentificationNumber() {
      removeValue("vehicleIdentificationNumber");
      return this;
    }
    /**
     * Get currently set value for vehicleIdentificationNumber property in this builder.
     * @return previously set value or {@code null}. If multiple values have been 
     * set to this property, then {@link java.util.Collection} instance will be 
     * returned.
     */
    @Nullable public java.lang.Object getVehicleIdentificationNumber() {
      return myData.get("vehicleIdentificationNumber");
    }
    /**
     * The distance between the centers of the front and rear wheels.\n\nTypical unit code(s): CMT for centimeters, MTR for meters, INH for inches, FOT for foot/feet
     * @param quantitativeValue value to set
     * @return this builder instance
     */
    @NotNull public Builder wheelbase(@NotNull QuantitativeValue quantitativeValue) {
      putValue("wheelbase", quantitativeValue);
      return this;
    }
    /**
     * The distance between the centers of the front and rear wheels.\n\nTypical unit code(s): CMT for centimeters, MTR for meters, INH for inches, FOT for foot/feet
     * @param quantitativeValue value to set
     * @return this builder instance
     */
    @NotNull public Builder wheelbase(@NotNull QuantitativeValue.Builder quantitativeValue) {
      putValue("wheelbase", quantitativeValue.build());
      return this;
    }
    /**
     * Remove wheelbase property from the builder.
     * If this property is repeatable, all instances are removed.
     * @return this builder instance
     */
    @NotNull public Builder removeWheelbase() {
      removeValue("wheelbase");
      return this;
    }
    /**
     * Get currently set value for wheelbase property in this builder.
     * @return previously set value or {@code null}. If multiple values have been 
     * set to this property, then {@link java.util.Collection} instance will be 
     * returned.
     */
    @Nullable public java.lang.Object getWheelbase() {
      return myData.get("wheelbase");
    }
    /**
     * The date of production of the item, e.g. vehicle.
     * @param date value to set
     * @return this builder instance
     */
    @NotNull public Builder productionDate(@NotNull java.util.Date date) {
      putValue("productionDate", date);
      return this;
    }
    /**
     * Remove productionDate property from the builder.
     * If this property is repeatable, all instances are removed.
     * @return this builder instance
     */
    @NotNull public Builder removeProductionDate() {
      removeValue("productionDate");
      return this;
    }
    /**
     * Get currently set value for productionDate property in this builder.
     * @return previously set value or {@code null}. If multiple values have been 
     * set to this property, then {@link java.util.Collection} instance will be 
     * returned.
     */
    @Nullable public java.lang.Object getProductionDate() {
      return myData.get("productionDate");
    }
    /**
     * The permitted weight of a trailer attached to the vehicle.\n\nTypical unit code(s): KGM for kilogram, LBR for pound\n* Note 1: You can indicate additional information in the [[name]] of the [[QuantitativeValue]] node.\n* Note 2: You may also link to a [[QualitativeValue]] node that provides additional information using [[valueReference]].\n* Note 3: Note that you can use [[minValue]] and [[maxValue]] to indicate ranges.
     * @param quantitativeValue value to set
     * @return this builder instance
     */
    @NotNull public Builder trailerWeight(@NotNull QuantitativeValue quantitativeValue) {
      putValue("trailerWeight", quantitativeValue);
      return this;
    }
    /**
     * The permitted weight of a trailer attached to the vehicle.\n\nTypical unit code(s): KGM for kilogram, LBR for pound\n* Note 1: You can indicate additional information in the [[name]] of the [[QuantitativeValue]] node.\n* Note 2: You may also link to a [[QualitativeValue]] node that provides additional information using [[valueReference]].\n* Note 3: Note that you can use [[minValue]] and [[maxValue]] to indicate ranges.
     * @param quantitativeValue value to set
     * @return this builder instance
     */
    @NotNull public Builder trailerWeight(@NotNull QuantitativeValue.Builder quantitativeValue) {
      putValue("trailerWeight", quantitativeValue.build());
      return this;
    }
    /**
     * Remove trailerWeight property from the builder.
     * If this property is repeatable, all instances are removed.
     * @return this builder instance
     */
    @NotNull public Builder removeTrailerWeight() {
      removeValue("trailerWeight");
      return this;
    }
    /**
     * Get currently set value for trailerWeight property in this builder.
     * @return previously set value or {@code null}. If multiple values have been 
     * set to this property, then {@link java.util.Collection} instance will be 
     * returned.
     */
    @Nullable public java.lang.Object getTrailerWeight() {
      return myData.get("trailerWeight");
    }
    /**
     * The number or type of airbags in the vehicle.
     * @param number value to set
     * @return this builder instance
     */
    @NotNull public Builder numberOfAirbags(@NotNull Number number) {
      putValue("numberOfAirbags", number);
      return this;
    }
    /**
     * The number or type of airbags in the vehicle.
     * @param numberOfAirbags value to set
     * @return this builder instance
     */
    @NotNull public Builder numberOfAirbags(@NotNull String numberOfAirbags) {
      putValue("numberOfAirbags", numberOfAirbags);
      return this;
    }
    /**
     * Remove numberOfAirbags property from the builder.
     * If this property is repeatable, all instances are removed.
     * @return this builder instance
     */
    @NotNull public Builder removeNumberOfAirbags() {
      removeValue("numberOfAirbags");
      return this;
    }
    /**
     * Get currently set value for numberOfAirbags property in this builder.
     * @return previously set value or {@code null}. If multiple values have been 
     * set to this property, then {@link java.util.Collection} instance will be 
     * returned.
     */
    @Nullable public java.lang.Object getNumberOfAirbags() {
      return myData.get("numberOfAirbags");
    }
    /**
     * The time needed to accelerate the vehicle from a given start velocity to a given target velocity.\n\nTypical unit code(s): SEC for seconds\n\n* Note: There are unfortunately no standard unit codes for seconds/0..100 km/h or seconds/0..60 mph. Simply use &quot;SEC&quot; for seconds and indicate the velocities in the [[name]] of the [[QuantitativeValue]], or use [[valueReference]] with a [[QuantitativeValue]] of 0..60 mph or 0..100 km/h to specify the reference speeds.
     * @param quantitativeValue value to set
     * @return this builder instance
     */
    @NotNull public Builder accelerationTime(@NotNull QuantitativeValue quantitativeValue) {
      putValue("accelerationTime", quantitativeValue);
      return this;
    }
    /**
     * The time needed to accelerate the vehicle from a given start velocity to a given target velocity.\n\nTypical unit code(s): SEC for seconds\n\n* Note: There are unfortunately no standard unit codes for seconds/0..100 km/h or seconds/0..60 mph. Simply use &quot;SEC&quot; for seconds and indicate the velocities in the [[name]] of the [[QuantitativeValue]], or use [[valueReference]] with a [[QuantitativeValue]] of 0..60 mph or 0..100 km/h to specify the reference speeds.
     * @param quantitativeValue value to set
     * @return this builder instance
     */
    @NotNull public Builder accelerationTime(@NotNull QuantitativeValue.Builder quantitativeValue) {
      putValue("accelerationTime", quantitativeValue.build());
      return this;
    }
    /**
     * Remove accelerationTime property from the builder.
     * If this property is repeatable, all instances are removed.
     * @return this builder instance
     */
    @NotNull public Builder removeAccelerationTime() {
      removeValue("accelerationTime");
      return this;
    }
    /**
     * Get currently set value for accelerationTime property in this builder.
     * @return previously set value or {@code null}. If multiple values have been 
     * set to this property, then {@link java.util.Collection} instance will be 
     * returned.
     */
    @Nullable public java.lang.Object getAccelerationTime() {
      return myData.get("accelerationTime");
    }
    /**
     * A textual description of known damages, both repaired and unrepaired.
     * @param knownVehicleDamages value to set
     * @return this builder instance
     */
    @NotNull public Builder knownVehicleDamages(@NotNull String knownVehicleDamages) {
      putValue("knownVehicleDamages", knownVehicleDamages);
      return this;
    }
    /**
     * Remove knownVehicleDamages property from the builder.
     * If this property is repeatable, all instances are removed.
     * @return this builder instance
     */
    @NotNull public Builder removeKnownVehicleDamages() {
      removeValue("knownVehicleDamages");
      return this;
    }
    /**
     * Get currently set value for knownVehicleDamages property in this builder.
     * @return previously set value or {@code null}. If multiple values have been 
     * set to this property, then {@link java.util.Collection} instance will be 
     * returned.
     */
    @Nullable public java.lang.Object getKnownVehicleDamages() {
      return myData.get("knownVehicleDamages");
    }
    /**
     * The release date of a vehicle model (often used to differentiate versions of the same make and model).
     * @param date value to set
     * @return this builder instance
     */
    @NotNull public Builder modelDate(@NotNull java.util.Date date) {
      putValue("modelDate", date);
      return this;
    }
    /**
     * Remove modelDate property from the builder.
     * If this property is repeatable, all instances are removed.
     * @return this builder instance
     */
    @NotNull public Builder removeModelDate() {
      removeValue("modelDate");
      return this;
    }
    /**
     * Get currently set value for modelDate property in this builder.
     * @return previously set value or {@code null}. If multiple values have been 
     * set to this property, then {@link java.util.Collection} instance will be 
     * returned.
     */
    @Nullable public java.lang.Object getModelDate() {
      return myData.get("modelDate");
    }
    /**
     * This is a StupidProperty! - for testing only
     * @param quantitativeValue value to set
     * @return this builder instance
     */
    @NotNull public Builder stupidProperty(@NotNull QuantitativeValue quantitativeValue) {
      putValue("stupidProperty", quantitativeValue);
      return this;
    }
    /**
     * This is a StupidProperty! - for testing only
     * @param quantitativeValue value to set
     * @return this builder instance
     */
    @NotNull public Builder stupidProperty(@NotNull QuantitativeValue.Builder quantitativeValue) {
      putValue("stupidProperty", quantitativeValue.build());
      return this;
    }
    /**
     * Remove stupidProperty property from the builder.
     * If this property is repeatable, all instances are removed.
     * @return this builder instance
     */
    @NotNull public Builder removeStupidProperty() {
      removeValue("stupidProperty");
      return this;
    }
    /**
     * Get currently set value for stupidProperty property in this builder.
     * @return previously set value or {@code null}. If multiple values have been 
     * set to this property, then {@link java.util.Collection} instance will be 
     * returned.
     */
    @Nullable public java.lang.Object getStupidProperty() {
      return myData.get("stupidProperty");
    }
    /**
     * The release date of a vehicle model (often used to differentiate versions of the same make and model).
     * @param date value to set
     * @return this builder instance
     */
    @NotNull public Builder vehicleModelDate(@NotNull java.util.Date date) {
      putValue("vehicleModelDate", date);
      return this;
    }
    /**
     * Remove vehicleModelDate property from the builder.
     * If this property is repeatable, all instances are removed.
     * @return this builder instance
     */
    @NotNull public Builder removeVehicleModelDate() {
      removeValue("vehicleModelDate");
      return this;
    }
    /**
     * Get currently set value for vehicleModelDate property in this builder.
     * @return previously set value or {@code null}. If multiple values have been 
     * set to this property, then {@link java.util.Collection} instance will be 
     * returned.
     */
    @Nullable public java.lang.Object getVehicleModelDate() {
      return myData.get("vehicleModelDate");
    }
    /**
     * The width of the item.
     * @param distance value to set
     * @return this builder instance
     */
    @NotNull public Builder width(@NotNull Distance distance) {
      putValue("width", distance);
      return this;
    }
    /**
     * The width of the item.
     * @param distance value to set
     * @return this builder instance
     */
    @NotNull public Builder width(@NotNull Distance.Builder distance) {
      putValue("width", distance.build());
      return this;
    }
    /**
     * The width of the item.
     * @param quantitativeValue value to set
     * @return this builder instance
     */
    @NotNull public Builder width(@NotNull QuantitativeValue quantitativeValue) {
      putValue("width", quantitativeValue);
      return this;
    }
    /**
     * The width of the item.
     * @param quantitativeValue value to set
     * @return this builder instance
     */
    @NotNull public Builder width(@NotNull QuantitativeValue.Builder quantitativeValue) {
      putValue("width", quantitativeValue.build());
      return this;
    }
    /**
     * Remove width property from the builder.
     * If this property is repeatable, all instances are removed.
     * @return this builder instance
     */
    @NotNull public Builder removeWidth() {
      removeValue("width");
      return this;
    }
    /**
     * Get currently set value for width property in this builder.
     * @return previously set value or {@code null}. If multiple values have been 
     * set to this property, then {@link java.util.Collection} instance will be 
     * returned.
     */
    @Nullable public java.lang.Object getWidth() {
      return myData.get("width");
    }
    /**
     * The manufacturer of the product.
     * @param organization value to set
     * @return this builder instance
     */
    @NotNull public Builder manufacturer(@NotNull Organization organization) {
      putValue("manufacturer", organization);
      return this;
    }
    /**
     * The manufacturer of the product.
     * @param organization value to set
     * @return this builder instance
     */
    @NotNull public Builder manufacturer(@NotNull Organization.Builder organization) {
      putValue("manufacturer", organization.build());
      return this;
    }
    /**
     * Remove manufacturer property from the builder.
     * If this property is repeatable, all instances are removed.
     * @return this builder instance
     */
    @NotNull public Builder removeManufacturer() {
      removeValue("manufacturer");
      return this;
    }
    /**
     * Get currently set value for manufacturer property in this builder.
     * @return previously set value or {@code null}. If multiple values have been 
     * set to this property, then {@link java.util.Collection} instance will be 
     * returned.
     */
    @Nullable public java.lang.Object getManufacturer() {
      return myData.get("manufacturer");
    }
    /**
     * A standardized size of a product or creative work, specified either through a simple textual string (for example 'XL', '32Wx34L'), a  QuantitativeValue with a unitCode, or a comprehensive and structured [[SizeSpecification]]; in other cases, the [[width]], [[height]], [[depth]] and [[weight]] properties may be more applicable. 
     * @param definedTerm value to set
     * @return this builder instance
     */
    @NotNull public Builder size(@NotNull DefinedTerm definedTerm) {
      putValue("size", definedTerm);
      return this;
    }
    /**
     * A standardized size of a product or creative work, specified either through a simple textual string (for example 'XL', '32Wx34L'), a  QuantitativeValue with a unitCode, or a comprehensive and structured [[SizeSpecification]]; in other cases, the [[width]], [[height]], [[depth]] and [[weight]] properties may be more applicable. 
     * @param definedTerm value to set
     * @return this builder instance
     */
    @NotNull public Builder size(@NotNull DefinedTerm.Builder definedTerm) {
      putValue("size", definedTerm.build());
      return this;
    }
    /**
     * A standardized size of a product or creative work, specified either through a simple textual string (for example 'XL', '32Wx34L'), a  QuantitativeValue with a unitCode, or a comprehensive and structured [[SizeSpecification]]; in other cases, the [[width]], [[height]], [[depth]] and [[weight]] properties may be more applicable. 
     * @param quantitativeValue value to set
     * @return this builder instance
     */
    @NotNull public Builder size(@NotNull QuantitativeValue quantitativeValue) {
      putValue("size", quantitativeValue);
      return this;
    }
    /**
     * A standardized size of a product or creative work, specified either through a simple textual string (for example 'XL', '32Wx34L'), a  QuantitativeValue with a unitCode, or a comprehensive and structured [[SizeSpecification]]; in other cases, the [[width]], [[height]], [[depth]] and [[weight]] properties may be more applicable. 
     * @param quantitativeValue value to set
     * @return this builder instance
     */
    @NotNull public Builder size(@NotNull QuantitativeValue.Builder quantitativeValue) {
      putValue("size", quantitativeValue.build());
      return this;
    }
    /**
     * A standardized size of a product or creative work, specified either through a simple textual string (for example 'XL', '32Wx34L'), a  QuantitativeValue with a unitCode, or a comprehensive and structured [[SizeSpecification]]; in other cases, the [[width]], [[height]], [[depth]] and [[weight]] properties may be more applicable. 
     * @param sizeSpecification value to set
     * @return this builder instance
     */
    @NotNull public Builder size(@NotNull SizeSpecification sizeSpecification) {
      putValue("size", sizeSpecification);
      return this;
    }
    /**
     * A standardized size of a product or creative work, specified either through a simple textual string (for example 'XL', '32Wx34L'), a  QuantitativeValue with a unitCode, or a comprehensive and structured [[SizeSpecification]]; in other cases, the [[width]], [[height]], [[depth]] and [[weight]] properties may be more applicable. 
     * @param sizeSpecification value to set
     * @return this builder instance
     */
    @NotNull public Builder size(@NotNull SizeSpecification.Builder sizeSpecification) {
      putValue("size", sizeSpecification.build());
      return this;
    }
    /**
     * A standardized size of a product or creative work, specified either through a simple textual string (for example 'XL', '32Wx34L'), a  QuantitativeValue with a unitCode, or a comprehensive and structured [[SizeSpecification]]; in other cases, the [[width]], [[height]], [[depth]] and [[weight]] properties may be more applicable. 
     * @param size value to set
     * @return this builder instance
     */
    @NotNull public Builder size(@NotNull String size) {
      putValue("size", size);
      return this;
    }
    /**
     * Remove size property from the builder.
     * If this property is repeatable, all instances are removed.
     * @return this builder instance
     */
    @NotNull public Builder removeSize() {
      removeValue("size");
      return this;
    }
    /**
     * Get currently set value for size property in this builder.
     * @return previously set value or {@code null}. If multiple values have been 
     * set to this property, then {@link java.util.Collection} instance will be 
     * returned.
     */
    @Nullable public java.lang.Object getSize() {
      return myData.get("size");
    }
    /**
     * Indicates the [[productGroupID]] for a [[ProductGroup]] that this product [[isVariantOf]]. 
     * @param inProductGroupWithID value to set
     * @return this builder instance
     */
    @NotNull public Builder inProductGroupWithID(@NotNull String inProductGroupWithID) {
      putValue("inProductGroupWithID", inProductGroupWithID);
      return this;
    }
    /**
     * Remove inProductGroupWithID property from the builder.
     * If this property is repeatable, all instances are removed.
     * @return this builder instance
     */
    @NotNull public Builder removeInProductGroupWithID() {
      removeValue("inProductGroupWithID");
      return this;
    }
    /**
     * Get currently set value for inProductGroupWithID property in this builder.
     * @return previously set value or {@code null}. If multiple values have been 
     * set to this property, then {@link java.util.Collection} instance will be 
     * returned.
     */
    @Nullable public java.lang.Object getInProductGroupWithID() {
      return myData.get("inProductGroupWithID");
    }
    /**
     * The GTIN-13 code of the product, or the product to which the offer refers. This is equivalent to 13-digit ISBN codes and EAN UCC-13. Former 12-digit UPC codes can be converted into a GTIN-13 code by simply adding a preceding zero. See [GS1 GTIN Summary](http://www.gs1.org/barcodes/technical/idkeys/gtin) for more details.
     * @param gtin value to set
     * @return this builder instance
     */
    @NotNull public Builder gtin13(@NotNull Gtin gtin) {
      putValue("gtin13", gtin);
      return this;
    }
    /**
     * Remove gtin13 property from the builder.
     * If this property is repeatable, all instances are removed.
     * @return this builder instance
     */
    @NotNull public Builder removeGtin13() {
      removeValue("gtin13");
      return this;
    }
    /**
     * Get currently set value for gtin13 property in this builder.
     * @return previously set value or {@code null}. If multiple values have been 
     * set to this property, then {@link java.util.Collection} instance will be 
     * returned.
     */
    @Nullable public java.lang.Object getGtin13() {
      return myData.get("gtin13");
    }
    /**
     * A Global Trade Item Number ([GTIN](https://www.gs1.org/standards/id-keys/gtin)). GTINs identify trade items, including products and services, using numeric identification codes. The [[gtin]] property generalizes the earlier [[gtin8]], [[gtin12]], [[gtin13]], and [[gtin14]] properties. The GS1 [digital link specifications](https://www.gs1.org/standards/Digital-Link/) express GTINs as URLs. A correct [[gtin]] value should be a valid GTIN, which means that it should be an all-numeric string of either 8, 12, 13 or 14 digits, or a &quot;GS1 Digital Link&quot; URL based on such a string. The numeric component should also have a [valid GS1 check digit](https://www.gs1.org/services/check-digit-calculator) and meet the other rules for valid GTINs. See also [GS1's GTIN Summary](http://www.gs1.org/barcodes/technical/idkeys/gtin) and [Wikipedia](https://en.wikipedia.org/wiki/Global_Trade_Item_Number) for more details. Left-padding of the gtin values is not required or encouraged.
     * 
     * @param gtin value to set
     * @return this builder instance
     */
    @NotNull public Builder gtin(@NotNull Gtin gtin) {
      putValue("gtin", gtin);
      return this;
    }
    /**
     * Remove gtin property from the builder.
     * If this property is repeatable, all instances are removed.
     * @return this builder instance
     */
    @NotNull public Builder removeGtin() {
      removeValue("gtin");
      return this;
    }
    /**
     * Get currently set value for gtin property in this builder.
     * @return previously set value or {@code null}. If multiple values have been 
     * set to this property, then {@link java.util.Collection} instance will be 
     * returned.
     */
    @Nullable public java.lang.Object getGtin() {
      return myData.get("gtin");
    }
    /**
     * A material that something is made from, e.g. leather, wool, cotton, paper.
     * @param material value to set
     * @return this builder instance
     */
    @NotNull public Builder material(@NotNull Material material) {
      putValue("material", material);
      return this;
    }
    /**
     * Remove material property from the builder.
     * If this property is repeatable, all instances are removed.
     * @return this builder instance
     */
    @NotNull public Builder removeMaterial() {
      removeValue("material");
      return this;
    }
    /**
     * Get currently set value for material property in this builder.
     * @return previously set value or {@code null}. If multiple values have been 
     * set to this property, then {@link java.util.Collection} instance will be 
     * returned.
     */
    @Nullable public java.lang.Object getMaterial() {
      return myData.get("material");
    }
    /**
     * A pattern that something has, for example 'polka dot', 'striped', 'Canadian flag'. Values are typically expressed as text, although links to controlled value schemes are also supported.
     * @param definedTerm value to set
     * @return this builder instance
     */
    @NotNull public Builder pattern(@NotNull DefinedTerm definedTerm) {
      putValue("pattern", definedTerm);
      return this;
    }
    /**
     * A pattern that something has, for example 'polka dot', 'striped', 'Canadian flag'. Values are typically expressed as text, although links to controlled value schemes are also supported.
     * @param definedTerm value to set
     * @return this builder instance
     */
    @NotNull public Builder pattern(@NotNull DefinedTerm.Builder definedTerm) {
      putValue("pattern", definedTerm.build());
      return this;
    }
    /**
     * A pattern that something has, for example 'polka dot', 'striped', 'Canadian flag'. Values are typically expressed as text, although links to controlled value schemes are also supported.
     * @param pattern value to set
     * @return this builder instance
     */
    @NotNull public Builder pattern(@NotNull String pattern) {
      putValue("pattern", pattern);
      return this;
    }
    /**
     * Remove pattern property from the builder.
     * If this property is repeatable, all instances are removed.
     * @return this builder instance
     */
    @NotNull public Builder removePattern() {
      removeValue("pattern");
      return this;
    }
    /**
     * Get currently set value for pattern property in this builder.
     * @return previously set value or {@code null}. If multiple values have been 
     * set to this property, then {@link java.util.Collection} instance will be 
     * returned.
     */
    @Nullable public java.lang.Object getPattern() {
      return myData.get("pattern");
    }
    /**
     * The GTIN-14 code of the product, or the product to which the offer refers. See [GS1 GTIN Summary](http://www.gs1.org/barcodes/technical/idkeys/gtin) for more details.
     * @param identifier value to set
     * @return this builder instance
     */
    @NotNull public Builder gtin14(@NotNull Identifier identifier) {
      putValue("gtin14", identifier);
      return this;
    }
    /**
     * Remove gtin14 property from the builder.
     * If this property is repeatable, all instances are removed.
     * @return this builder instance
     */
    @NotNull public Builder removeGtin14() {
      removeValue("gtin14");
      return this;
    }
    /**
     * Get currently set value for gtin14 property in this builder.
     * @return previously set value or {@code null}. If multiple values have been 
     * set to this property, then {@link java.util.Collection} instance will be 
     * returned.
     */
    @Nullable public java.lang.Object getGtin14() {
      return myData.get("gtin14");
    }
    /**
     * A predefined value from OfferItemCondition specifying the condition of the product or service, or the products or services included in the offer. Also used for product return policies to specify the condition of products accepted for returns.
     * @param offerItemCondition value to set
     * @return this builder instance
     */
    @NotNull public Builder itemCondition(@NotNull OfferItemCondition offerItemCondition) {
      putValue("itemCondition", offerItemCondition);
      return this;
    }
    /**
     * Remove itemCondition property from the builder.
     * If this property is repeatable, all instances are removed.
     * @return this builder instance
     */
    @NotNull public Builder removeItemCondition() {
      removeValue("itemCondition");
      return this;
    }
    /**
     * Get currently set value for itemCondition property in this builder.
     * @return previously set value or {@code null}. If multiple values have been 
     * set to this property, then {@link java.util.Collection} instance will be 
     * returned.
     */
    @Nullable public java.lang.Object getItemCondition() {
      return myData.get("itemCondition");
    }
    /**
     * The overall rating, based on a collection of reviews or ratings, of the item.
     * @param aggregateRating value to set
     * @return this builder instance
     */
    @NotNull public Builder aggregateRating(@NotNull AggregateRating aggregateRating) {
      putValue("aggregateRating", aggregateRating);
      return this;
    }
    /**
     * The overall rating, based on a collection of reviews or ratings, of the item.
     * @param aggregateRating value to set
     * @return this builder instance
     */
    @NotNull public Builder aggregateRating(@NotNull AggregateRating.Builder aggregateRating) {
      putValue("aggregateRating", aggregateRating.build());
      return this;
    }
    /**
     * Remove aggregateRating property from the builder.
     * If this property is repeatable, all instances are removed.
     * @return this builder instance
     */
    @NotNull public Builder removeAggregateRating() {
      removeValue("aggregateRating");
      return this;
    }
    /**
     * Get currently set value for aggregateRating property in this builder.
     * @return previously set value or {@code null}. If multiple values have been 
     * set to this property, then {@link java.util.Collection} instance will be 
     * returned.
     */
    @Nullable public java.lang.Object getAggregateRating() {
      return myData.get("aggregateRating");
    }
    /**
     * The Manufacturer Part Number (MPN) of the product, or the product to which the offer refers.
     * @param mpn value to set
     * @return this builder instance
     */
    @NotNull public Builder mpn(@NotNull String mpn) {
      putValue("mpn", mpn);
      return this;
    }
    /**
     * Remove mpn property from the builder.
     * If this property is repeatable, all instances are removed.
     * @return this builder instance
     */
    @NotNull public Builder removeMpn() {
      removeValue("mpn");
      return this;
    }
    /**
     * Get currently set value for mpn property in this builder.
     * @return previously set value or {@code null}. If multiple values have been 
     * set to this property, then {@link java.util.Collection} instance will be 
     * returned.
     */
    @Nullable public java.lang.Object getMpn() {
      return myData.get("mpn");
    }
    /**
     * The depth of the item.
     * @param distance value to set
     * @return this builder instance
     */
    @NotNull public Builder depth(@NotNull Distance distance) {
      putValue("depth", distance);
      return this;
    }
    /**
     * The depth of the item.
     * @param distance value to set
     * @return this builder instance
     */
    @NotNull public Builder depth(@NotNull Distance.Builder distance) {
      putValue("depth", distance.build());
      return this;
    }
    /**
     * The depth of the item.
     * @param quantitativeValue value to set
     * @return this builder instance
     */
    @NotNull public Builder depth(@NotNull QuantitativeValue quantitativeValue) {
      putValue("depth", quantitativeValue);
      return this;
    }
    /**
     * The depth of the item.
     * @param quantitativeValue value to set
     * @return this builder instance
     */
    @NotNull public Builder depth(@NotNull QuantitativeValue.Builder quantitativeValue) {
      putValue("depth", quantitativeValue.build());
      return this;
    }
    /**
     * Remove depth property from the builder.
     * If this property is repeatable, all instances are removed.
     * @return this builder instance
     */
    @NotNull public Builder removeDepth() {
      removeValue("depth");
      return this;
    }
    /**
     * Get currently set value for depth property in this builder.
     * @return previously set value or {@code null}. If multiple values have been 
     * set to this property, then {@link java.util.Collection} instance will be 
     * returned.
     */
    @Nullable public java.lang.Object getDepth() {
      return myData.get("depth");
    }
    /**
     * An associated logo.
     * @param image value to set
     * @return this builder instance
     */
    @NotNull public Builder logo(@NotNull Image image) {
      putValue("logo", image);
      return this;
    }
    /**
     * Remove logo property from the builder.
     * If this property is repeatable, all instances are removed.
     * @return this builder instance
     */
    @NotNull public Builder removeLogo() {
      removeValue("logo");
      return this;
    }
    /**
     * Get currently set value for logo property in this builder.
     * @return previously set value or {@code null}. If multiple values have been 
     * set to this property, then {@link java.util.Collection} instance will be 
     * returned.
     */
    @Nullable public java.lang.Object getLogo() {
      return myData.get("logo");
    }
    /**
     * The GTIN-12 code of the product, or the product to which the offer refers. The GTIN-12 is the 12-digit GS1 Identification Key composed of a U.P.C. Company Prefix, Item Reference, and Check Digit used to identify trade items. See [GS1 GTIN Summary](http://www.gs1.org/barcodes/technical/idkeys/gtin) for more details.
     * @param identifier value to set
     * @return this builder instance
     */
    @NotNull public Builder gtin12(@NotNull Identifier identifier) {
      putValue("gtin12", identifier);
      return this;
    }
    /**
     * Remove gtin12 property from the builder.
     * If this property is repeatable, all instances are removed.
     * @return this builder instance
     */
    @NotNull public Builder removeGtin12() {
      removeValue("gtin12");
      return this;
    }
    /**
     * Get currently set value for gtin12 property in this builder.
     * @return previously set value or {@code null}. If multiple values have been 
     * set to this property, then {@link java.util.Collection} instance will be 
     * returned.
     */
    @Nullable public java.lang.Object getGtin12() {
      return myData.get("gtin12");
    }
    /**
     * The height of the item.
     * @param distance value to set
     * @return this builder instance
     */
    @NotNull public Builder height(@NotNull Distance distance) {
      putValue("height", distance);
      return this;
    }
    /**
     * The height of the item.
     * @param distance value to set
     * @return this builder instance
     */
    @NotNull public Builder height(@NotNull Distance.Builder distance) {
      putValue("height", distance.build());
      return this;
    }
    /**
     * The height of the item.
     * @param quantitativeValue value to set
     * @return this builder instance
     */
    @NotNull public Builder height(@NotNull QuantitativeValue quantitativeValue) {
      putValue("height", quantitativeValue);
      return this;
    }
    /**
     * The height of the item.
     * @param quantitativeValue value to set
     * @return this builder instance
     */
    @NotNull public Builder height(@NotNull QuantitativeValue.Builder quantitativeValue) {
      putValue("height", quantitativeValue.build());
      return this;
    }
    /**
     * Remove height property from the builder.
     * If this property is repeatable, all instances are removed.
     * @return this builder instance
     */
    @NotNull public Builder removeHeight() {
      removeValue("height");
      return this;
    }
    /**
     * Get currently set value for height property in this builder.
     * @return previously set value or {@code null}. If multiple values have been 
     * set to this property, then {@link java.util.Collection} instance will be 
     * returned.
     */
    @Nullable public java.lang.Object getHeight() {
      return myData.get("height");
    }
    /**
     * The Stock Keeping Unit (SKU), i.e. a merchant-specific identifier for a product or service, or the product to which the offer refers.
     * @param identifier value to set
     * @return this builder instance
     */
    @NotNull public Builder sku(@NotNull Identifier identifier) {
      putValue("sku", identifier);
      return this;
    }
    /**
     * Remove sku property from the builder.
     * If this property is repeatable, all instances are removed.
     * @return this builder instance
     */
    @NotNull public Builder removeSku() {
      removeValue("sku");
      return this;
    }
    /**
     * Get currently set value for sku property in this builder.
     * @return previously set value or {@code null}. If multiple values have been 
     * set to this property, then {@link java.util.Collection} instance will be 
     * returned.
     */
    @Nullable public java.lang.Object getSku() {
      return myData.get("sku");
    }
    /**
     * A pointer to another, functionally similar product (or multiple products).
     * @param product value to set
     * @return this builder instance
     */
    @NotNull public Builder isSimilarTo(@NotNull Product product) {
      putValue("isSimilarTo", product);
      return this;
    }
    /**
     * A pointer to another, functionally similar product (or multiple products).
     * @param product value to set
     * @return this builder instance
     */
    @NotNull public Builder isSimilarTo(@NotNull Product.Builder product) {
      putValue("isSimilarTo", product.build());
      return this;
    }
    /**
     * A pointer to another, functionally similar product (or multiple products).
     * @param service value to set
     * @return this builder instance
     */
    @NotNull public Builder isSimilarTo(@NotNull Service service) {
      putValue("isSimilarTo", service);
      return this;
    }
    /**
     * A pointer to another, functionally similar product (or multiple products).
     * @param service value to set
     * @return this builder instance
     */
    @NotNull public Builder isSimilarTo(@NotNull Service.Builder service) {
      putValue("isSimilarTo", service.build());
      return this;
    }
    /**
     * Remove isSimilarTo property from the builder.
     * If this property is repeatable, all instances are removed.
     * @return this builder instance
     */
    @NotNull public Builder removeIsSimilarTo() {
      removeValue("isSimilarTo");
      return this;
    }
    /**
     * Get currently set value for isSimilarTo property in this builder.
     * @return previously set value or {@code null}. If multiple values have been 
     * set to this property, then {@link java.util.Collection} instance will be 
     * returned.
     */
    @Nullable public java.lang.Object getIsSimilarTo() {
      return myData.get("isSimilarTo");
    }
    /**
     * A pointer to another, somehow related product (or multiple products).
     * @param product value to set
     * @return this builder instance
     */
    @NotNull public Builder isRelatedTo(@NotNull Product product) {
      putValue("isRelatedTo", product);
      return this;
    }
    /**
     * A pointer to another, somehow related product (or multiple products).
     * @param product value to set
     * @return this builder instance
     */
    @NotNull public Builder isRelatedTo(@NotNull Product.Builder product) {
      putValue("isRelatedTo", product.build());
      return this;
    }
    /**
     * A pointer to another, somehow related product (or multiple products).
     * @param service value to set
     * @return this builder instance
     */
    @NotNull public Builder isRelatedTo(@NotNull Service service) {
      putValue("isRelatedTo", service);
      return this;
    }
    /**
     * A pointer to another, somehow related product (or multiple products).
     * @param service value to set
     * @return this builder instance
     */
    @NotNull public Builder isRelatedTo(@NotNull Service.Builder service) {
      putValue("isRelatedTo", service.build());
      return this;
    }
    /**
     * Remove isRelatedTo property from the builder.
     * If this property is repeatable, all instances are removed.
     * @return this builder instance
     */
    @NotNull public Builder removeIsRelatedTo() {
      removeValue("isRelatedTo");
      return this;
    }
    /**
     * Get currently set value for isRelatedTo property in this builder.
     * @return previously set value or {@code null}. If multiple values have been 
     * set to this property, then {@link java.util.Collection} instance will be 
     * returned.
     */
    @Nullable public java.lang.Object getIsRelatedTo() {
      return myData.get("isRelatedTo");
    }
    /**
     * An intended audience, i.e. a group for whom something was created.
     * @param audience value to set
     * @return this builder instance
     */
    @NotNull public Builder audience(@NotNull Audience audience) {
      putValue("audience", audience);
      return this;
    }
    /**
     * An intended audience, i.e. a group for whom something was created.
     * @param audience value to set
     * @return this builder instance
     */
    @NotNull public Builder audience(@NotNull Audience.Builder audience) {
      putValue("audience", audience.build());
      return this;
    }
    /**
     * Remove audience property from the builder.
     * If this property is repeatable, all instances are removed.
     * @return this builder instance
     */
    @NotNull public Builder removeAudience() {
      removeValue("audience");
      return this;
    }
    /**
     * Get currently set value for audience property in this builder.
     * @return previously set value or {@code null}. If multiple values have been 
     * set to this property, then {@link java.util.Collection} instance will be 
     * returned.
     */
    @Nullable public java.lang.Object getAudience() {
      return myData.get("audience");
    }
    /**
     * The brand(s) associated with a product or service, or the brand(s) maintained by an organization or business person.
     * @param brand value to set
     * @return this builder instance
     */
    @NotNull public Builder brand(@NotNull Brand brand) {
      putValue("brand", brand);
      return this;
    }
    /**
     * The brand(s) associated with a product or service, or the brand(s) maintained by an organization or business person.
     * @param brand value to set
     * @return this builder instance
     */
    @NotNull public Builder brand(@NotNull Brand.Builder brand) {
      putValue("brand", brand.build());
      return this;
    }
    /**
     * The brand(s) associated with a product or service, or the brand(s) maintained by an organization or business person.
     * @param organization value to set
     * @return this builder instance
     */
    @NotNull public Builder brand(@NotNull Organization organization) {
      putValue("brand", organization);
      return this;
    }
    /**
     * The brand(s) associated with a product or service, or the brand(s) maintained by an organization or business person.
     * @param organization value to set
     * @return this builder instance
     */
    @NotNull public Builder brand(@NotNull Organization.Builder organization) {
      putValue("brand", organization.build());
      return this;
    }
    /**
     * Remove brand property from the builder.
     * If this property is repeatable, all instances are removed.
     * @return this builder instance
     */
    @NotNull public Builder removeBrand() {
      removeValue("brand");
      return this;
    }
    /**
     * Get currently set value for brand property in this builder.
     * @return previously set value or {@code null}. If multiple values have been 
     * set to this property, then {@link java.util.Collection} instance will be 
     * returned.
     */
    @Nullable public java.lang.Object getBrand() {
      return myData.get("brand");
    }
    /**
     * Indicates the [NATO stock number](https://en.wikipedia.org/wiki/NATO_Stock_Number) (nsn) of a [[Product]]. 
     * @param identifier value to set
     * @return this builder instance
     */
    @NotNull public Builder nsn(@NotNull Identifier identifier) {
      putValue("nsn", identifier);
      return this;
    }
    /**
     * Remove nsn property from the builder.
     * If this property is repeatable, all instances are removed.
     * @return this builder instance
     */
    @NotNull public Builder removeNsn() {
      removeValue("nsn");
      return this;
    }
    /**
     * Get currently set value for nsn property in this builder.
     * @return previously set value or {@code null}. If multiple values have been 
     * set to this property, then {@link java.util.Collection} instance will be 
     * returned.
     */
    @Nullable public java.lang.Object getNsn() {
      return myData.get("nsn");
    }
    /**
     * The product identifier, such as ISBN. For example: ``` meta itemprop=&quot;productID&quot; content=&quot;isbn:123-456-789&quot; ```.
     * @param identifier value to set
     * @return this builder instance
     */
    @NotNull public Builder productID(@NotNull Identifier identifier) {
      putValue("productID", identifier);
      return this;
    }
    /**
     * Remove productID property from the builder.
     * If this property is repeatable, all instances are removed.
     * @return this builder instance
     */
    @NotNull public Builder removeProductID() {
      removeValue("productID");
      return this;
    }
    /**
     * Get currently set value for productID property in this builder.
     * @return previously set value or {@code null}. If multiple values have been 
     * set to this property, then {@link java.util.Collection} instance will be 
     * returned.
     */
    @Nullable public java.lang.Object getProductID() {
      return myData.get("productID");
    }
    /**
     * Specifies a MerchantReturnPolicy that may be applicable.
     * @param merchantReturnPolicy value to set
     * @return this builder instance
     */
    @NotNull public Builder hasMerchantReturnPolicy(@NotNull MerchantReturnPolicy merchantReturnPolicy) {
      putValue("hasMerchantReturnPolicy", merchantReturnPolicy);
      return this;
    }
    /**
     * Specifies a MerchantReturnPolicy that may be applicable.
     * @param merchantReturnPolicy value to set
     * @return this builder instance
     */
    @NotNull public Builder hasMerchantReturnPolicy(@NotNull MerchantReturnPolicy.Builder merchantReturnPolicy) {
      putValue("hasMerchantReturnPolicy", merchantReturnPolicy.build());
      return this;
    }
    /**
     * Remove hasMerchantReturnPolicy property from the builder.
     * If this property is repeatable, all instances are removed.
     * @return this builder instance
     */
    @NotNull public Builder removeHasMerchantReturnPolicy() {
      removeValue("hasMerchantReturnPolicy");
      return this;
    }
    /**
     * Get currently set value for hasMerchantReturnPolicy property in this builder.
     * @return previously set value or {@code null}. If multiple values have been 
     * set to this property, then {@link java.util.Collection} instance will be 
     * returned.
     */
    @Nullable public java.lang.Object getHasMerchantReturnPolicy() {
      return myData.get("hasMerchantReturnPolicy");
    }
    /**
     * The model of the product. Use with the URL of a ProductModel or a textual representation of the model identifier. The URL of the ProductModel can be from an external source. It is recommended to additionally provide strong product identifiers via the gtin8/gtin13/gtin14 and mpn properties.
     * @param productModel value to set
     * @return this builder instance
     */
    @NotNull public Builder model(@NotNull ProductModel productModel) {
      putValue("model", productModel);
      return this;
    }
    /**
     * The model of the product. Use with the URL of a ProductModel or a textual representation of the model identifier. The URL of the ProductModel can be from an external source. It is recommended to additionally provide strong product identifiers via the gtin8/gtin13/gtin14 and mpn properties.
     * @param productModel value to set
     * @return this builder instance
     */
    @NotNull public Builder model(@NotNull ProductModel.Builder productModel) {
      putValue("model", productModel.build());
      return this;
    }
    /**
     * The model of the product. Use with the URL of a ProductModel or a textual representation of the model identifier. The URL of the ProductModel can be from an external source. It is recommended to additionally provide strong product identifiers via the gtin8/gtin13/gtin14 and mpn properties.
     * @param model value to set
     * @return this builder instance
     */
    @NotNull public Builder model(@NotNull String model) {
      putValue("model", model);
      return this;
    }
    /**
     * Remove model property from the builder.
     * If this property is repeatable, all instances are removed.
     * @return this builder instance
     */
    @NotNull public Builder removeModel() {
      removeValue("model");
      return this;
    }
    /**
     * Get currently set value for model property in this builder.
     * @return previously set value or {@code null}. If multiple values have been 
     * set to this property, then {@link java.util.Collection} instance will be 
     * returned.
     */
    @Nullable public java.lang.Object getModel() {
      return myData.get("model");
    }
    /**
     * The place where the item (typically [[Product]]) was last processed and tested before importation.
     * @param countryOfLastProcessing value to set
     * @return this builder instance
     */
    @NotNull public Builder countryOfLastProcessing(@NotNull String countryOfLastProcessing) {
      putValue("countryOfLastProcessing", countryOfLastProcessing);
      return this;
    }
    /**
     * Remove countryOfLastProcessing property from the builder.
     * If this property is repeatable, all instances are removed.
     * @return this builder instance
     */
    @NotNull public Builder removeCountryOfLastProcessing() {
      removeValue("countryOfLastProcessing");
      return this;
    }
    /**
     * Get currently set value for countryOfLastProcessing property in this builder.
     * @return previously set value or {@code null}. If multiple values have been 
     * set to this property, then {@link java.util.Collection} instance will be 
     * returned.
     */
    @Nullable public java.lang.Object getCountryOfLastProcessing() {
      return myData.get("countryOfLastProcessing");
    }
    /**
     * A category for the item. Greater signs or slashes can be used to informally indicate a category hierarchy.
     * @param category value to set
     * @return this builder instance
     */
    @NotNull public Builder category(@NotNull Category category) {
      putValue("category", category);
      return this;
    }
    /**
     * Remove category property from the builder.
     * If this property is repeatable, all instances are removed.
     * @return this builder instance
     */
    @NotNull public Builder removeCategory() {
      removeValue("category");
      return this;
    }
    /**
     * Get currently set value for category property in this builder.
     * @return previously set value or {@code null}. If multiple values have been 
     * set to this property, then {@link java.util.Collection} instance will be 
     * returned.
     */
    @Nullable public java.lang.Object getCategory() {
      return myData.get("category");
    }
    /**
     * The place where the product was assembled.
     * @param countryOfAssembly value to set
     * @return this builder instance
     */
    @NotNull public Builder countryOfAssembly(@NotNull String countryOfAssembly) {
      putValue("countryOfAssembly", countryOfAssembly);
      return this;
    }
    /**
     * Remove countryOfAssembly property from the builder.
     * If this property is repeatable, all instances are removed.
     * @return this builder instance
     */
    @NotNull public Builder removeCountryOfAssembly() {
      removeValue("countryOfAssembly");
      return this;
    }
    /**
     * Get currently set value for countryOfAssembly property in this builder.
     * @return previously set value or {@code null}. If multiple values have been 
     * set to this property, then {@link java.util.Collection} instance will be 
     * returned.
     */
    @Nullable public java.lang.Object getCountryOfAssembly() {
      return myData.get("countryOfAssembly");
    }
    /**
     * A property-value pair representing an additional characteristics of the entitity, e.g. a product feature or another characteristic for which there is no matching property in schema.org.\n\nNote: Publishers should be aware that applications designed to use specific schema.org properties (e.g. http://schema.org/width, http://schema.org/color, http://schema.org/gtin13, ...) will typically expect such data to be provided using those properties, rather than using the generic property/value mechanism.
     * 
     * @param propertyValue value to set
     * @return this builder instance
     */
    @NotNull public Builder additionalProperty(@NotNull PropertyValue propertyValue) {
      putValue("additionalProperty", propertyValue);
      return this;
    }
    /**
     * A property-value pair representing an additional characteristics of the entitity, e.g. a product feature or another characteristic for which there is no matching property in schema.org.\n\nNote: Publishers should be aware that applications designed to use specific schema.org properties (e.g. http://schema.org/width, http://schema.org/color, http://schema.org/gtin13, ...) will typically expect such data to be provided using those properties, rather than using the generic property/value mechanism.
     * 
     * @param propertyValue value to set
     * @return this builder instance
     */
    @NotNull public Builder additionalProperty(@NotNull PropertyValue.Builder propertyValue) {
      putValue("additionalProperty", propertyValue.build());
      return this;
    }
    /**
     * Remove additionalProperty property from the builder.
     * If this property is repeatable, all instances are removed.
     * @return this builder instance
     */
    @NotNull public Builder removeAdditionalProperty() {
      removeValue("additionalProperty");
      return this;
    }
    /**
     * Get currently set value for additionalProperty property in this builder.
     * @return previously set value or {@code null}. If multiple values have been 
     * set to this property, then {@link java.util.Collection} instance will be 
     * returned.
     */
    @Nullable public java.lang.Object getAdditionalProperty() {
      return myData.get("additionalProperty");
    }
    /**
     * A pointer to another product (or multiple products) for which this product is an accessory or spare part.
     * @param product value to set
     * @return this builder instance
     */
    @NotNull public Builder isAccessoryOrSparePartFor(@NotNull Product product) {
      putValue("isAccessoryOrSparePartFor", product);
      return this;
    }
    /**
     * A pointer to another product (or multiple products) for which this product is an accessory or spare part.
     * @param product value to set
     * @return this builder instance
     */
    @NotNull public Builder isAccessoryOrSparePartFor(@NotNull Product.Builder product) {
      putValue("isAccessoryOrSparePartFor", product.build());
      return this;
    }
    /**
     * Remove isAccessoryOrSparePartFor property from the builder.
     * If this property is repeatable, all instances are removed.
     * @return this builder instance
     */
    @NotNull public Builder removeIsAccessoryOrSparePartFor() {
      removeValue("isAccessoryOrSparePartFor");
      return this;
    }
    /**
     * Get currently set value for isAccessoryOrSparePartFor property in this builder.
     * @return previously set value or {@code null}. If multiple values have been 
     * set to this property, then {@link java.util.Collection} instance will be 
     * returned.
     */
    @Nullable public java.lang.Object getIsAccessoryOrSparePartFor() {
      return myData.get("isAccessoryOrSparePartFor");
    }
    /**
     *                                         The country of origin of something, including products as well as creative  works such as movie and TV content.
     * 
     * In the case of TV and movie, this would be the country of the principle offices of the production company or individual responsible for the movie. For other kinds of [[CreativeWork]] it is difficult to provide fully general guidance, and properties such as [[contentLocation]] and [[locationCreated]] may be more applicable.
     * 
     * In the case of products, the country of origin of the product. The exact interpretation of this may vary by context and product type, and cannot be fully enumerated here.
     *                                         @param country value to set
     *                                         @return this builder instance
     */
    @NotNull public Builder countryOfOrigin(@NotNull Country country) {
      putValue("countryOfOrigin", country);
      return this;
    }
    /**
     *                                             The country of origin of something, including products as well as creative  works such as movie and TV content.
     * 
     * In the case of TV and movie, this would be the country of the principle offices of the production company or individual responsible for the movie. For other kinds of [[CreativeWork]] it is difficult to provide fully general guidance, and properties such as [[contentLocation]] and [[locationCreated]] may be more applicable.
     * 
     * In the case of products, the country of origin of the product. The exact interpretation of this may vary by context and product type, and cannot be fully enumerated here.
     *                                             @param country value to set
     *                                             @return this builder instance
     */
    @NotNull public Builder countryOfOrigin(@NotNull Country.Builder country) {
      putValue("countryOfOrigin", country.build());
      return this;
    }
    /**
     * Remove countryOfOrigin property from the builder.
     * If this property is repeatable, all instances are removed.
     * @return this builder instance
     */
    @NotNull public Builder removeCountryOfOrigin() {
      removeValue("countryOfOrigin");
      return this;
    }
    /**
     * Get currently set value for countryOfOrigin property in this builder.
     * @return previously set value or {@code null}. If multiple values have been 
     * set to this property, then {@link java.util.Collection} instance will be 
     * returned.
     */
    @Nullable public java.lang.Object getCountryOfOrigin() {
      return myData.get("countryOfOrigin");
    }
    /**
     * The release date of a product or product model. This can be used to distinguish the exact variant of a product.
     * @param date value to set
     * @return this builder instance
     */
    @NotNull public Builder releaseDate(@NotNull java.util.Date date) {
      putValue("releaseDate", date);
      return this;
    }
    /**
     * Remove releaseDate property from the builder.
     * If this property is repeatable, all instances are removed.
     * @return this builder instance
     */
    @NotNull public Builder removeReleaseDate() {
      removeValue("releaseDate");
      return this;
    }
    /**
     * Get currently set value for releaseDate property in this builder.
     * @return previously set value or {@code null}. If multiple values have been 
     * set to this property, then {@link java.util.Collection} instance will be 
     * returned.
     */
    @Nullable public java.lang.Object getReleaseDate() {
      return myData.get("releaseDate");
    }
    /**
     * A review of the item.
     * @param review value to set
     * @return this builder instance
     */
    @NotNull public Builder review(@NotNull Review review) {
      putValue("review", review);
      return this;
    }
    /**
     * A review of the item.
     * @param review value to set
     * @return this builder instance
     */
    @NotNull public Builder review(@NotNull Review.Builder review) {
      putValue("review", review.build());
      return this;
    }
    /**
     * Remove review property from the builder.
     * If this property is repeatable, all instances are removed.
     * @return this builder instance
     */
    @NotNull public Builder removeReview() {
      removeValue("review");
      return this;
    }
    /**
     * Get currently set value for review property in this builder.
     * @return previously set value or {@code null}. If multiple values have been 
     * set to this property, then {@link java.util.Collection} instance will be 
     * returned.
     */
    @Nullable public java.lang.Object getReview() {
      return myData.get("review");
    }
    /**
     * An award won by or for this item.
     * @param award value to set
     * @return this builder instance
     */
    @NotNull public Builder award(@NotNull String award) {
      putValue("award", award);
      return this;
    }
    /**
     * Remove award property from the builder.
     * If this property is repeatable, all instances are removed.
     * @return this builder instance
     */
    @NotNull public Builder removeAward() {
      removeValue("award");
      return this;
    }
    /**
     * Get currently set value for award property in this builder.
     * @return previously set value or {@code null}. If multiple values have been 
     * set to this property, then {@link java.util.Collection} instance will be 
     * returned.
     */
    @Nullable public java.lang.Object getAward() {
      return myData.get("award");
    }
    /**
     * The GTIN-8 code of the product, or the product to which the offer refers. This code is also known as EAN/UCC-8 or 8-digit EAN. See [GS1 GTIN Summary](http://www.gs1.org/barcodes/technical/idkeys/gtin) for more details.
     * @param gtin value to set
     * @return this builder instance
     */
    @NotNull public Builder gtin8(@NotNull Gtin gtin) {
      putValue("gtin8", gtin);
      return this;
    }
    /**
     * Remove gtin8 property from the builder.
     * If this property is repeatable, all instances are removed.
     * @return this builder instance
     */
    @NotNull public Builder removeGtin8() {
      removeValue("gtin8");
      return this;
    }
    /**
     * Get currently set value for gtin8 property in this builder.
     * @return previously set value or {@code null}. If multiple values have been 
     * set to this property, then {@link java.util.Collection} instance will be 
     * returned.
     */
    @Nullable public java.lang.Object getGtin8() {
      return myData.get("gtin8");
    }
    /**
     * The weight of the product or person.
     * @param quantitativeValue value to set
     * @return this builder instance
     */
    @NotNull public Builder weight(@NotNull QuantitativeValue quantitativeValue) {
      putValue("weight", quantitativeValue);
      return this;
    }
    /**
     * The weight of the product or person.
     * @param quantitativeValue value to set
     * @return this builder instance
     */
    @NotNull public Builder weight(@NotNull QuantitativeValue.Builder quantitativeValue) {
      putValue("weight", quantitativeValue.build());
      return this;
    }
    /**
     * Remove weight property from the builder.
     * If this property is repeatable, all instances are removed.
     * @return this builder instance
     */
    @NotNull public Builder removeWeight() {
      removeValue("weight");
      return this;
    }
    /**
     * Get currently set value for weight property in this builder.
     * @return previously set value or {@code null}. If multiple values have been 
     * set to this property, then {@link java.util.Collection} instance will be 
     * returned.
     */
    @Nullable public java.lang.Object getWeight() {
      return myData.get("weight");
    }
    /**
     * Defines the energy efficiency Category (also known as &quot;class&quot; or &quot;rating&quot;) for a product according to an international energy efficiency standard.
     * @param energyConsumptionDetails value to set
     * @return this builder instance
     */
    @NotNull public Builder hasEnergyConsumptionDetails(@NotNull EnergyConsumptionDetails energyConsumptionDetails) {
      putValue("hasEnergyConsumptionDetails", energyConsumptionDetails);
      return this;
    }
    /**
     * Defines the energy efficiency Category (also known as &quot;class&quot; or &quot;rating&quot;) for a product according to an international energy efficiency standard.
     * @param energyConsumptionDetails value to set
     * @return this builder instance
     */
    @NotNull public Builder hasEnergyConsumptionDetails(@NotNull EnergyConsumptionDetails.Builder energyConsumptionDetails) {
      putValue("hasEnergyConsumptionDetails", energyConsumptionDetails.build());
      return this;
    }
    /**
     * Remove hasEnergyConsumptionDetails property from the builder.
     * If this property is repeatable, all instances are removed.
     * @return this builder instance
     */
    @NotNull public Builder removeHasEnergyConsumptionDetails() {
      removeValue("hasEnergyConsumptionDetails");
      return this;
    }
    /**
     * Get currently set value for hasEnergyConsumptionDetails property in this builder.
     * @return previously set value or {@code null}. If multiple values have been 
     * set to this property, then {@link java.util.Collection} instance will be 
     * returned.
     */
    @Nullable public java.lang.Object getHasEnergyConsumptionDetails() {
      return myData.get("hasEnergyConsumptionDetails");
    }
    /**
     * A product measurement, for example the inseam of pants, the wheel size of a bicycle, or the gauge of a screw. Usually an exact measurement, but can also be a range of measurements for adjustable products, for example belts and ski bindings.
     * @param quantitativeValue value to set
     * @return this builder instance
     */
    @NotNull public Builder hasMeasurement(@NotNull QuantitativeValue quantitativeValue) {
      putValue("hasMeasurement", quantitativeValue);
      return this;
    }
    /**
     * A product measurement, for example the inseam of pants, the wheel size of a bicycle, or the gauge of a screw. Usually an exact measurement, but can also be a range of measurements for adjustable products, for example belts and ski bindings.
     * @param quantitativeValue value to set
     * @return this builder instance
     */
    @NotNull public Builder hasMeasurement(@NotNull QuantitativeValue.Builder quantitativeValue) {
      putValue("hasMeasurement", quantitativeValue.build());
      return this;
    }
    /**
     * Remove hasMeasurement property from the builder.
     * If this property is repeatable, all instances are removed.
     * @return this builder instance
     */
    @NotNull public Builder removeHasMeasurement() {
      removeValue("hasMeasurement");
      return this;
    }
    /**
     * Get currently set value for hasMeasurement property in this builder.
     * @return previously set value or {@code null}. If multiple values have been 
     * set to this property, then {@link java.util.Collection} instance will be 
     * returned.
     */
    @Nullable public java.lang.Object getHasMeasurement() {
      return myData.get("hasMeasurement");
    }
    /**
     * A pointer to another product (or multiple products) for which this product is a consumable.
     * @param product value to set
     * @return this builder instance
     */
    @NotNull public Builder isConsumableFor(@NotNull Product product) {
      putValue("isConsumableFor", product);
      return this;
    }
    /**
     * A pointer to another product (or multiple products) for which this product is a consumable.
     * @param product value to set
     * @return this builder instance
     */
    @NotNull public Builder isConsumableFor(@NotNull Product.Builder product) {
      putValue("isConsumableFor", product.build());
      return this;
    }
    /**
     * Remove isConsumableFor property from the builder.
     * If this property is repeatable, all instances are removed.
     * @return this builder instance
     */
    @NotNull public Builder removeIsConsumableFor() {
      removeValue("isConsumableFor");
      return this;
    }
    /**
     * Get currently set value for isConsumableFor property in this builder.
     * @return previously set value or {@code null}. If multiple values have been 
     * set to this property, then {@link java.util.Collection} instance will be 
     * returned.
     */
    @Nullable public java.lang.Object getIsConsumableFor() {
      return myData.get("isConsumableFor");
    }
    /**
     * The color of the product.
     * @param color value to set
     * @return this builder instance
     */
    @NotNull public Builder color(@NotNull String color) {
      putValue("color", color);
      return this;
    }
    /**
     * Remove color property from the builder.
     * If this property is repeatable, all instances are removed.
     * @return this builder instance
     */
    @NotNull public Builder removeColor() {
      removeValue("color");
      return this;
    }
    /**
     * Get currently set value for color property in this builder.
     * @return previously set value or {@code null}. If multiple values have been 
     * set to this property, then {@link java.util.Collection} instance will be 
     * returned.
     */
    @Nullable public java.lang.Object getColor() {
      return myData.get("color");
    }
    /**
     * A slogan or motto associated with the item.
     * @param slogan value to set
     * @return this builder instance
     */
    @NotNull public Builder slogan(@NotNull String slogan) {
      putValue("slogan", slogan);
      return this;
    }
    /**
     * Remove slogan property from the builder.
     * If this property is repeatable, all instances are removed.
     * @return this builder instance
     */
    @NotNull public Builder removeSlogan() {
      removeValue("slogan");
      return this;
    }
    /**
     * Get currently set value for slogan property in this builder.
     * @return previously set value or {@code null}. If multiple values have been 
     * set to this property, then {@link java.util.Collection} instance will be 
     * returned.
     */
    @Nullable public java.lang.Object getSlogan() {
      return myData.get("slogan");
    }
    /**
     * Indicates the kind of product that this is a variant of. In the case of [[ProductModel]], this is a pointer (from a ProductModel) to a base product from which this product is a variant. It is safe to infer that the variant inherits all product features from the base model, unless defined locally. This is not transitive. In the case of a [[ProductGroup]], the group description also serves as a template, representing a set of Products that vary on explicitly defined, specific dimensions only (so it defines both a set of variants, as well as which values distinguish amongst those variants). When used with [[ProductGroup]], this property can apply to any [[Product]] included in the group.
     * @param productGroup value to set
     * @return this builder instance
     */
    @NotNull public Builder isVariantOf(@NotNull ProductGroup productGroup) {
      putValue("isVariantOf", productGroup);
      return this;
    }
    /**
     * Indicates the kind of product that this is a variant of. In the case of [[ProductModel]], this is a pointer (from a ProductModel) to a base product from which this product is a variant. It is safe to infer that the variant inherits all product features from the base model, unless defined locally. This is not transitive. In the case of a [[ProductGroup]], the group description also serves as a template, representing a set of Products that vary on explicitly defined, specific dimensions only (so it defines both a set of variants, as well as which values distinguish amongst those variants). When used with [[ProductGroup]], this property can apply to any [[Product]] included in the group.
     * @param productGroup value to set
     * @return this builder instance
     */
    @NotNull public Builder isVariantOf(@NotNull ProductGroup.Builder productGroup) {
      putValue("isVariantOf", productGroup.build());
      return this;
    }
    /**
     * Indicates the kind of product that this is a variant of. In the case of [[ProductModel]], this is a pointer (from a ProductModel) to a base product from which this product is a variant. It is safe to infer that the variant inherits all product features from the base model, unless defined locally. This is not transitive. In the case of a [[ProductGroup]], the group description also serves as a template, representing a set of Products that vary on explicitly defined, specific dimensions only (so it defines both a set of variants, as well as which values distinguish amongst those variants). When used with [[ProductGroup]], this property can apply to any [[Product]] included in the group.
     * @param productModel value to set
     * @return this builder instance
     */
    @NotNull public Builder isVariantOf(@NotNull ProductModel productModel) {
      putValue("isVariantOf", productModel);
      return this;
    }
    /**
     * Indicates the kind of product that this is a variant of. In the case of [[ProductModel]], this is a pointer (from a ProductModel) to a base product from which this product is a variant. It is safe to infer that the variant inherits all product features from the base model, unless defined locally. This is not transitive. In the case of a [[ProductGroup]], the group description also serves as a template, representing a set of Products that vary on explicitly defined, specific dimensions only (so it defines both a set of variants, as well as which values distinguish amongst those variants). When used with [[ProductGroup]], this property can apply to any [[Product]] included in the group.
     * @param productModel value to set
     * @return this builder instance
     */
    @NotNull public Builder isVariantOf(@NotNull ProductModel.Builder productModel) {
      putValue("isVariantOf", productModel.build());
      return this;
    }
    /**
     * Remove isVariantOf property from the builder.
     * If this property is repeatable, all instances are removed.
     * @return this builder instance
     */
    @NotNull public Builder removeIsVariantOf() {
      removeValue("isVariantOf");
      return this;
    }
    /**
     * Get currently set value for isVariantOf property in this builder.
     * @return previously set value or {@code null}. If multiple values have been 
     * set to this property, then {@link java.util.Collection} instance will be 
     * returned.
     */
    @Nullable public java.lang.Object getIsVariantOf() {
      return myData.get("isVariantOf");
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
      if ("vehicleSeatingCapacity".equals(key) && value instanceof Number) { this.vehicleSeatingCapacity((Number)value); return; }
      if ("vehicleSeatingCapacitys".equals(key) && value instanceof Number) { this.vehicleSeatingCapacity((Number)value); return; }
      if ("vehicleSeatingCapacity".equals(key) && value instanceof QuantitativeValue) { this.vehicleSeatingCapacity((QuantitativeValue)value); return; }
      if ("vehicleSeatingCapacitys".equals(key) && value instanceof QuantitativeValue) { this.vehicleSeatingCapacity((QuantitativeValue)value); return; }
      if ("driveWheelConfiguration".equals(key) && value instanceof DriveWheelConfigurationValue) { this.driveWheelConfiguration((DriveWheelConfigurationValue)value); return; }
      if ("driveWheelConfigurations".equals(key) && value instanceof DriveWheelConfigurationValue) { this.driveWheelConfiguration((DriveWheelConfigurationValue)value); return; }
      if ("driveWheelConfiguration".equals(key) && value instanceof String) { this.driveWheelConfiguration((String)value); return; }
      if ("driveWheelConfigurations".equals(key) && value instanceof String) { this.driveWheelConfiguration((String)value); return; }
      if ("purchaseDate".equals(key) && value instanceof java.util.Date) { this.purchaseDate((java.util.Date)value); return; }
      if ("purchaseDates".equals(key) && value instanceof java.util.Date) { this.purchaseDate((java.util.Date)value); return; }
      if ("callSign".equals(key) && value instanceof Identifier) { this.callSign((Identifier)value); return; }
      if ("callSigns".equals(key) && value instanceof Identifier) { this.callSign((Identifier)value); return; }
      if ("fuelConsumption".equals(key) && value instanceof QuantitativeValue) { this.fuelConsumption((QuantitativeValue)value); return; }
      if ("fuelConsumptions".equals(key) && value instanceof QuantitativeValue) { this.fuelConsumption((QuantitativeValue)value); return; }
      if ("vehicleConfiguration".equals(key) && value instanceof String) { this.vehicleConfiguration((String)value); return; }
      if ("vehicleConfigurations".equals(key) && value instanceof String) { this.vehicleConfiguration((String)value); return; }
      if ("tongueWeight".equals(key) && value instanceof QuantitativeValue) { this.tongueWeight((QuantitativeValue)value); return; }
      if ("tongueWeights".equals(key) && value instanceof QuantitativeValue) { this.tongueWeight((QuantitativeValue)value); return; }
      if ("numberOfDoors".equals(key) && value instanceof Integer) { this.numberOfDoors((Integer)value); return; }
      if ("numberOfDoorss".equals(key) && value instanceof Integer) { this.numberOfDoors((Integer)value); return; }
      if ("numberOfDoors".equals(key) && value instanceof Long) { this.numberOfDoors((Long)value); return; }
      if ("numberOfDoorss".equals(key) && value instanceof Long) { this.numberOfDoors((Long)value); return; }
      if ("numberOfDoors".equals(key) && value instanceof Float) { this.numberOfDoors((Float)value); return; }
      if ("numberOfDoorss".equals(key) && value instanceof Float) { this.numberOfDoors((Float)value); return; }
      if ("numberOfDoors".equals(key) && value instanceof Double) { this.numberOfDoors((Double)value); return; }
      if ("numberOfDoorss".equals(key) && value instanceof Double) { this.numberOfDoors((Double)value); return; }
      if ("numberOfDoors".equals(key) && value instanceof String) { this.numberOfDoors((String)value); return; }
      if ("numberOfDoorss".equals(key) && value instanceof String) { this.numberOfDoors((String)value); return; }
      if ("numberOfForwardGears".equals(key) && value instanceof Number) { this.numberOfForwardGears((Number)value); return; }
      if ("numberOfForwardGearss".equals(key) && value instanceof Number) { this.numberOfForwardGears((Number)value); return; }
      if ("numberOfForwardGears".equals(key) && value instanceof QuantitativeValue) { this.numberOfForwardGears((QuantitativeValue)value); return; }
      if ("numberOfForwardGearss".equals(key) && value instanceof QuantitativeValue) { this.numberOfForwardGears((QuantitativeValue)value); return; }
      if ("numberOfPreviousOwners".equals(key) && value instanceof Number) { this.numberOfPreviousOwners((Number)value); return; }
      if ("numberOfPreviousOwnerss".equals(key) && value instanceof Number) { this.numberOfPreviousOwners((Number)value); return; }
      if ("numberOfPreviousOwners".equals(key) && value instanceof QuantitativeValue) { this.numberOfPreviousOwners((QuantitativeValue)value); return; }
      if ("numberOfPreviousOwnerss".equals(key) && value instanceof QuantitativeValue) { this.numberOfPreviousOwners((QuantitativeValue)value); return; }
      if ("speed".equals(key) && value instanceof QuantitativeValue) { this.speed((QuantitativeValue)value); return; }
      if ("speeds".equals(key) && value instanceof QuantitativeValue) { this.speed((QuantitativeValue)value); return; }
      if ("seatingCapacity".equals(key) && value instanceof Number) { this.seatingCapacity((Number)value); return; }
      if ("seatingCapacitys".equals(key) && value instanceof Number) { this.seatingCapacity((Number)value); return; }
      if ("seatingCapacity".equals(key) && value instanceof QuantitativeValue) { this.seatingCapacity((QuantitativeValue)value); return; }
      if ("seatingCapacitys".equals(key) && value instanceof QuantitativeValue) { this.seatingCapacity((QuantitativeValue)value); return; }
      if ("fuelType".equals(key) && value instanceof QualitativeValue) { this.fuelType((QualitativeValue)value); return; }
      if ("fuelTypes".equals(key) && value instanceof QualitativeValue) { this.fuelType((QualitativeValue)value); return; }
      if ("fuelType".equals(key) && value instanceof String) { this.fuelType((String)value); return; }
      if ("fuelTypes".equals(key) && value instanceof String) { this.fuelType((String)value); return; }
      if ("vehicleEngine".equals(key) && value instanceof EngineSpecification) { this.vehicleEngine((EngineSpecification)value); return; }
      if ("vehicleEngines".equals(key) && value instanceof EngineSpecification) { this.vehicleEngine((EngineSpecification)value); return; }
      if ("vehicleInteriorType".equals(key) && value instanceof String) { this.vehicleInteriorType((String)value); return; }
      if ("vehicleInteriorTypes".equals(key) && value instanceof String) { this.vehicleInteriorType((String)value); return; }
      if ("steeringPosition".equals(key) && value instanceof SteeringPositionValue) { this.steeringPosition((SteeringPositionValue)value); return; }
      if ("steeringPositions".equals(key) && value instanceof SteeringPositionValue) { this.steeringPosition((SteeringPositionValue)value); return; }
      if ("vehicleInteriorColor".equals(key) && value instanceof String) { this.vehicleInteriorColor((String)value); return; }
      if ("vehicleInteriorColors".equals(key) && value instanceof String) { this.vehicleInteriorColor((String)value); return; }
      if ("mileageFromOdometer".equals(key) && value instanceof QuantitativeValue) { this.mileageFromOdometer((QuantitativeValue)value); return; }
      if ("mileageFromOdometers".equals(key) && value instanceof QuantitativeValue) { this.mileageFromOdometer((QuantitativeValue)value); return; }
      if ("fuelCapacity".equals(key) && value instanceof QuantitativeValue) { this.fuelCapacity((QuantitativeValue)value); return; }
      if ("fuelCapacitys".equals(key) && value instanceof QuantitativeValue) { this.fuelCapacity((QuantitativeValue)value); return; }
      if ("numberOfAxles".equals(key) && value instanceof Integer) { this.numberOfAxles((Integer)value); return; }
      if ("numberOfAxless".equals(key) && value instanceof Integer) { this.numberOfAxles((Integer)value); return; }
      if ("numberOfAxles".equals(key) && value instanceof Long) { this.numberOfAxles((Long)value); return; }
      if ("numberOfAxless".equals(key) && value instanceof Long) { this.numberOfAxles((Long)value); return; }
      if ("numberOfAxles".equals(key) && value instanceof Float) { this.numberOfAxles((Float)value); return; }
      if ("numberOfAxless".equals(key) && value instanceof Float) { this.numberOfAxles((Float)value); return; }
      if ("numberOfAxles".equals(key) && value instanceof Double) { this.numberOfAxles((Double)value); return; }
      if ("numberOfAxless".equals(key) && value instanceof Double) { this.numberOfAxles((Double)value); return; }
      if ("numberOfAxles".equals(key) && value instanceof String) { this.numberOfAxles((String)value); return; }
      if ("numberOfAxless".equals(key) && value instanceof String) { this.numberOfAxles((String)value); return; }
      if ("bodyType".equals(key) && value instanceof QualitativeValue) { this.bodyType((QualitativeValue)value); return; }
      if ("bodyTypes".equals(key) && value instanceof QualitativeValue) { this.bodyType((QualitativeValue)value); return; }
      if ("bodyType".equals(key) && value instanceof String) { this.bodyType((String)value); return; }
      if ("bodyTypes".equals(key) && value instanceof String) { this.bodyType((String)value); return; }
      if ("weightTotal".equals(key) && value instanceof QuantitativeValue) { this.weightTotal((QuantitativeValue)value); return; }
      if ("weightTotals".equals(key) && value instanceof QuantitativeValue) { this.weightTotal((QuantitativeValue)value); return; }
      if ("emissionsCO2".equals(key) && value instanceof Integer) { this.emissionsCO2((Integer)value); return; }
      if ("emissionsCO2s".equals(key) && value instanceof Integer) { this.emissionsCO2((Integer)value); return; }
      if ("emissionsCO2".equals(key) && value instanceof Long) { this.emissionsCO2((Long)value); return; }
      if ("emissionsCO2s".equals(key) && value instanceof Long) { this.emissionsCO2((Long)value); return; }
      if ("emissionsCO2".equals(key) && value instanceof Float) { this.emissionsCO2((Float)value); return; }
      if ("emissionsCO2s".equals(key) && value instanceof Float) { this.emissionsCO2((Float)value); return; }
      if ("emissionsCO2".equals(key) && value instanceof Double) { this.emissionsCO2((Double)value); return; }
      if ("emissionsCO2s".equals(key) && value instanceof Double) { this.emissionsCO2((Double)value); return; }
      if ("emissionsCO2".equals(key) && value instanceof String) { this.emissionsCO2((String)value); return; }
      if ("emissionsCO2s".equals(key) && value instanceof String) { this.emissionsCO2((String)value); return; }
      if ("payload".equals(key) && value instanceof QuantitativeValue) { this.payload((QuantitativeValue)value); return; }
      if ("payloads".equals(key) && value instanceof QuantitativeValue) { this.payload((QuantitativeValue)value); return; }
      if ("dateVehicleFirstRegistered".equals(key) && value instanceof java.util.Date) { this.dateVehicleFirstRegistered((java.util.Date)value); return; }
      if ("dateVehicleFirstRegistereds".equals(key) && value instanceof java.util.Date) { this.dateVehicleFirstRegistered((java.util.Date)value); return; }
      if ("vehicleSpecialUsage".equals(key) && value instanceof CarUsageType) { this.vehicleSpecialUsage((CarUsageType)value); return; }
      if ("vehicleSpecialUsages".equals(key) && value instanceof CarUsageType) { this.vehicleSpecialUsage((CarUsageType)value); return; }
      if ("vehicleSpecialUsage".equals(key) && value instanceof String) { this.vehicleSpecialUsage((String)value); return; }
      if ("vehicleSpecialUsages".equals(key) && value instanceof String) { this.vehicleSpecialUsage((String)value); return; }
      if ("meetsEmissionStandard".equals(key) && value instanceof QualitativeValue) { this.meetsEmissionStandard((QualitativeValue)value); return; }
      if ("meetsEmissionStandards".equals(key) && value instanceof QualitativeValue) { this.meetsEmissionStandard((QualitativeValue)value); return; }
      if ("meetsEmissionStandard".equals(key) && value instanceof String) { this.meetsEmissionStandard((String)value); return; }
      if ("meetsEmissionStandards".equals(key) && value instanceof String) { this.meetsEmissionStandard((String)value); return; }
      if ("vehicleTransmission".equals(key) && value instanceof QualitativeValue) { this.vehicleTransmission((QualitativeValue)value); return; }
      if ("vehicleTransmissions".equals(key) && value instanceof QualitativeValue) { this.vehicleTransmission((QualitativeValue)value); return; }
      if ("vehicleTransmission".equals(key) && value instanceof String) { this.vehicleTransmission((String)value); return; }
      if ("vehicleTransmissions".equals(key) && value instanceof String) { this.vehicleTransmission((String)value); return; }
      if ("cargoVolume".equals(key) && value instanceof QuantitativeValue) { this.cargoVolume((QuantitativeValue)value); return; }
      if ("cargoVolumes".equals(key) && value instanceof QuantitativeValue) { this.cargoVolume((QuantitativeValue)value); return; }
      if ("fuelEfficiency".equals(key) && value instanceof QuantitativeValue) { this.fuelEfficiency((QuantitativeValue)value); return; }
      if ("fuelEfficiencys".equals(key) && value instanceof QuantitativeValue) { this.fuelEfficiency((QuantitativeValue)value); return; }
      if ("vehicleIdentificationNumber".equals(key) && value instanceof SerialNumber) { this.vehicleIdentificationNumber((SerialNumber)value); return; }
      if ("vehicleIdentificationNumbers".equals(key) && value instanceof SerialNumber) { this.vehicleIdentificationNumber((SerialNumber)value); return; }
      if ("wheelbase".equals(key) && value instanceof QuantitativeValue) { this.wheelbase((QuantitativeValue)value); return; }
      if ("wheelbases".equals(key) && value instanceof QuantitativeValue) { this.wheelbase((QuantitativeValue)value); return; }
      if ("productionDate".equals(key) && value instanceof java.util.Date) { this.productionDate((java.util.Date)value); return; }
      if ("productionDates".equals(key) && value instanceof java.util.Date) { this.productionDate((java.util.Date)value); return; }
      if ("trailerWeight".equals(key) && value instanceof QuantitativeValue) { this.trailerWeight((QuantitativeValue)value); return; }
      if ("trailerWeights".equals(key) && value instanceof QuantitativeValue) { this.trailerWeight((QuantitativeValue)value); return; }
      if ("numberOfAirbags".equals(key) && value instanceof Number) { this.numberOfAirbags((Number)value); return; }
      if ("numberOfAirbagss".equals(key) && value instanceof Number) { this.numberOfAirbags((Number)value); return; }
      if ("numberOfAirbags".equals(key) && value instanceof String) { this.numberOfAirbags((String)value); return; }
      if ("numberOfAirbagss".equals(key) && value instanceof String) { this.numberOfAirbags((String)value); return; }
      if ("accelerationTime".equals(key) && value instanceof QuantitativeValue) { this.accelerationTime((QuantitativeValue)value); return; }
      if ("accelerationTimes".equals(key) && value instanceof QuantitativeValue) { this.accelerationTime((QuantitativeValue)value); return; }
      if ("knownVehicleDamages".equals(key) && value instanceof String) { this.knownVehicleDamages((String)value); return; }
      if ("knownVehicleDamagess".equals(key) && value instanceof String) { this.knownVehicleDamages((String)value); return; }
      if ("modelDate".equals(key) && value instanceof java.util.Date) { this.modelDate((java.util.Date)value); return; }
      if ("modelDates".equals(key) && value instanceof java.util.Date) { this.modelDate((java.util.Date)value); return; }
      if ("stupidProperty".equals(key) && value instanceof QuantitativeValue) { this.stupidProperty((QuantitativeValue)value); return; }
      if ("stupidPropertys".equals(key) && value instanceof QuantitativeValue) { this.stupidProperty((QuantitativeValue)value); return; }
      if ("vehicleModelDate".equals(key) && value instanceof java.util.Date) { this.vehicleModelDate((java.util.Date)value); return; }
      if ("vehicleModelDates".equals(key) && value instanceof java.util.Date) { this.vehicleModelDate((java.util.Date)value); return; }
      super.fromMap(key, value);
    }
  }
  
}
