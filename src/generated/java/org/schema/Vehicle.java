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
 * A vehicle is a device that is designed or used to transport people or cargo over land, water, air, or through space.
 */
public class Vehicle extends Product {
  /**
   * The number of doors.\n\nTypical unit code(s): C62
   */
  @JsonIgnore public Number getNumberOfDoorsNumber() {
    return (Number) getValue("numberOfDoors");
  }
  /**
   * The number of doors.\n\nTypical unit code(s): C62
   */
  @JsonIgnore public Collection<Number> getNumberOfDoorsNumbers() {
    final Object current = myData.get("numberOfDoors");
    if (current == null) return Collections.emptyList();
    if (current instanceof Collection) {
      return (Collection<Number>) current;
    }
    return Arrays.asList((Number) current);
  }
  /**
   * The number of doors.\n\nTypical unit code(s): C62
   */
  @JsonIgnore public QuantitativeValue getNumberOfDoorsQuantitativeValue() {
    return (QuantitativeValue) getValue("numberOfDoors");
  }
  /**
   * The number of doors.\n\nTypical unit code(s): C62
   */
  @JsonIgnore public Collection<QuantitativeValue> getNumberOfDoorsQuantitativeValues() {
    final Object current = myData.get("numberOfDoors");
    if (current == null) return Collections.emptyList();
    if (current instanceof Collection) {
      return (Collection<QuantitativeValue>) current;
    }
    return Arrays.asList((QuantitativeValue) current);
  }
  /**
   * The number or type of airbags in the vehicle.
   */
  @JsonIgnore public Integer getNumberOfAirbagsInteger() {
    return (Integer) getValue("numberOfAirbags");
  }
  /**
   * The number or type of airbags in the vehicle.
   */
  @JsonIgnore public Collection<Integer> getNumberOfAirbagsIntegers() {
    final Object current = myData.get("numberOfAirbags");
    if (current == null) return Collections.emptyList();
    if (current instanceof Collection) {
      return (Collection<Integer>) current;
    }
    return Arrays.asList((Integer) current);
  }
  /**
   * The number or type of airbags in the vehicle.
   */
  @JsonIgnore public Long getNumberOfAirbagsLong() {
    return (Long) getValue("numberOfAirbags");
  }
  /**
   * The number or type of airbags in the vehicle.
   */
  @JsonIgnore public Collection<Long> getNumberOfAirbagsLongs() {
    final Object current = myData.get("numberOfAirbags");
    if (current == null) return Collections.emptyList();
    if (current instanceof Collection) {
      return (Collection<Long>) current;
    }
    return Arrays.asList((Long) current);
  }
  /**
   * The number or type of airbags in the vehicle.
   */
  @JsonIgnore public Float getNumberOfAirbagsFloat() {
    return (Float) getValue("numberOfAirbags");
  }
  /**
   * The number or type of airbags in the vehicle.
   */
  @JsonIgnore public Collection<Float> getNumberOfAirbagsFloats() {
    final Object current = myData.get("numberOfAirbags");
    if (current == null) return Collections.emptyList();
    if (current instanceof Collection) {
      return (Collection<Float>) current;
    }
    return Arrays.asList((Float) current);
  }
  /**
   * The number or type of airbags in the vehicle.
   */
  @JsonIgnore public Double getNumberOfAirbagsDouble() {
    return (Double) getValue("numberOfAirbags");
  }
  /**
   * The number or type of airbags in the vehicle.
   */
  @JsonIgnore public Collection<Double> getNumberOfAirbagsDoubles() {
    final Object current = myData.get("numberOfAirbags");
    if (current == null) return Collections.emptyList();
    if (current instanceof Collection) {
      return (Collection<Double>) current;
    }
    return Arrays.asList((Double) current);
  }
  /**
   * The number or type of airbags in the vehicle.
   */
  @JsonIgnore public String getNumberOfAirbagsString() {
    return (String) getValue("numberOfAirbags");
  }
  /**
   * The number or type of airbags in the vehicle.
   */
  @JsonIgnore public Collection<String> getNumberOfAirbagsStrings() {
    final Object current = myData.get("numberOfAirbags");
    if (current == null) return Collections.emptyList();
    if (current instanceof Collection) {
      return (Collection<String>) current;
    }
    return Arrays.asList((String) current);
  }
  /**
   * The number of axles.\n\nTypical unit code(s): C62
   */
  @JsonIgnore public Number getNumberOfAxlesNumber() {
    return (Number) getValue("numberOfAxles");
  }
  /**
   * The number of axles.\n\nTypical unit code(s): C62
   */
  @JsonIgnore public Collection<Number> getNumberOfAxlesNumbers() {
    final Object current = myData.get("numberOfAxles");
    if (current == null) return Collections.emptyList();
    if (current instanceof Collection) {
      return (Collection<Number>) current;
    }
    return Arrays.asList((Number) current);
  }
  /**
   * The number of axles.\n\nTypical unit code(s): C62
   */
  @JsonIgnore public QuantitativeValue getNumberOfAxlesQuantitativeValue() {
    return (QuantitativeValue) getValue("numberOfAxles");
  }
  /**
   * The number of axles.\n\nTypical unit code(s): C62
   */
  @JsonIgnore public Collection<QuantitativeValue> getNumberOfAxlesQuantitativeValues() {
    final Object current = myData.get("numberOfAxles");
    if (current == null) return Collections.emptyList();
    if (current instanceof Collection) {
      return (Collection<QuantitativeValue>) current;
    }
    return Arrays.asList((QuantitativeValue) current);
  }
  /**
   * Information about the engine or engines of the vehicle.
   */
  @JsonIgnore public EngineSpecification getVehicleEngine() {
    return (EngineSpecification) getValue("vehicleEngine");
  }
  /**
   * Information about the engine or engines of the vehicle.
   */
  @JsonIgnore public Collection<EngineSpecification> getVehicleEngines() {
    final Object current = myData.get("vehicleEngine");
    if (current == null) return Collections.emptyList();
    if (current instanceof Collection) {
      return (Collection<EngineSpecification>) current;
    }
    return Arrays.asList((EngineSpecification) current);
  }
  /**
   * The amount of fuel consumed for traveling a particular distance or temporal duration with the given vehicle (e.g. liters per 100 km).\n\n* Note 1: There are unfortunately no standard unit codes for liters per 100 km.  Use [[unitText]] to indicate the unit of measurement, e.g. L/100 km.\n* Note 2: There are two ways of indicating the fuel consumption, [[fuelConsumption]] (e.g. 8 liters per 100 km) and [[fuelEfficiency]] (e.g. 30 miles per gallon). They are reciprocal.\n* Note 3: Often, the absolute value is useful only when related to driving speed (&quot;at 80 km/h&quot;) or usage pattern (&quot;city traffic&quot;). You can use [[valueReference]] to link the value for the fuel consumption to another value.
   */
  @JsonIgnore public QuantitativeValue getFuelConsumption() {
    return (QuantitativeValue) getValue("fuelConsumption");
  }
  /**
   * The amount of fuel consumed for traveling a particular distance or temporal duration with the given vehicle (e.g. liters per 100 km).\n\n* Note 1: There are unfortunately no standard unit codes for liters per 100 km.  Use [[unitText]] to indicate the unit of measurement, e.g. L/100 km.\n* Note 2: There are two ways of indicating the fuel consumption, [[fuelConsumption]] (e.g. 8 liters per 100 km) and [[fuelEfficiency]] (e.g. 30 miles per gallon). They are reciprocal.\n* Note 3: Often, the absolute value is useful only when related to driving speed (&quot;at 80 km/h&quot;) or usage pattern (&quot;city traffic&quot;). You can use [[valueReference]] to link the value for the fuel consumption to another value.
   */
  @JsonIgnore public Collection<QuantitativeValue> getFuelConsumptions() {
    final Object current = myData.get("fuelConsumption");
    if (current == null) return Collections.emptyList();
    if (current instanceof Collection) {
      return (Collection<QuantitativeValue>) current;
    }
    return Arrays.asList((QuantitativeValue) current);
  }
  /**
   * The distance traveled per unit of fuel used; most commonly miles per gallon (mpg) or kilometers per liter (km/L).\n\n* Note 1: There are unfortunately no standard unit codes for miles per gallon or kilometers per liter. Use [[unitText]] to indicate the unit of measurement, e.g. mpg or km/L.\n* Note 2: There are two ways of indicating the fuel consumption, [[fuelConsumption]] (e.g. 8 liters per 100 km) and [[fuelEfficiency]] (e.g. 30 miles per gallon). They are reciprocal.\n* Note 3: Often, the absolute value is useful only when related to driving speed (&quot;at 80 km/h&quot;) or usage pattern (&quot;city traffic&quot;). You can use [[valueReference]] to link the value for the fuel economy to another value.
   */
  @JsonIgnore public QuantitativeValue getFuelEfficiency() {
    return (QuantitativeValue) getValue("fuelEfficiency");
  }
  /**
   * The distance traveled per unit of fuel used; most commonly miles per gallon (mpg) or kilometers per liter (km/L).\n\n* Note 1: There are unfortunately no standard unit codes for miles per gallon or kilometers per liter. Use [[unitText]] to indicate the unit of measurement, e.g. mpg or km/L.\n* Note 2: There are two ways of indicating the fuel consumption, [[fuelConsumption]] (e.g. 8 liters per 100 km) and [[fuelEfficiency]] (e.g. 30 miles per gallon). They are reciprocal.\n* Note 3: Often, the absolute value is useful only when related to driving speed (&quot;at 80 km/h&quot;) or usage pattern (&quot;city traffic&quot;). You can use [[valueReference]] to link the value for the fuel economy to another value.
   */
  @JsonIgnore public Collection<QuantitativeValue> getFuelEfficiencys() {
    final Object current = myData.get("fuelEfficiency");
    if (current == null) return Collections.emptyList();
    if (current instanceof Collection) {
      return (Collection<QuantitativeValue>) current;
    }
    return Arrays.asList((QuantitativeValue) current);
  }
  /**
   * The total number of forward gears available for the transmission system of the vehicle.\n\nTypical unit code(s): C62
   */
  @JsonIgnore public Number getNumberOfForwardGearsNumber() {
    return (Number) getValue("numberOfForwardGears");
  }
  /**
   * The total number of forward gears available for the transmission system of the vehicle.\n\nTypical unit code(s): C62
   */
  @JsonIgnore public Collection<Number> getNumberOfForwardGearsNumbers() {
    final Object current = myData.get("numberOfForwardGears");
    if (current == null) return Collections.emptyList();
    if (current instanceof Collection) {
      return (Collection<Number>) current;
    }
    return Arrays.asList((Number) current);
  }
  /**
   * The total number of forward gears available for the transmission system of the vehicle.\n\nTypical unit code(s): C62
   */
  @JsonIgnore public QuantitativeValue getNumberOfForwardGearsQuantitativeValue() {
    return (QuantitativeValue) getValue("numberOfForwardGears");
  }
  /**
   * The total number of forward gears available for the transmission system of the vehicle.\n\nTypical unit code(s): C62
   */
  @JsonIgnore public Collection<QuantitativeValue> getNumberOfForwardGearsQuantitativeValues() {
    final Object current = myData.get("numberOfForwardGears");
    if (current == null) return Collections.emptyList();
    if (current instanceof Collection) {
      return (Collection<QuantitativeValue>) current;
    }
    return Arrays.asList((QuantitativeValue) current);
  }
  /**
   * The Vehicle Identification Number (VIN) is a unique serial number used by the automotive industry to identify individual motor vehicles.
   */
  @JsonIgnore public String getVehicleIdentificationNumber() {
    return (String) getValue("vehicleIdentificationNumber");
  }
  /**
   * The Vehicle Identification Number (VIN) is a unique serial number used by the automotive industry to identify individual motor vehicles.
   */
  @JsonIgnore public Collection<String> getVehicleIdentificationNumbers() {
    final Object current = myData.get("vehicleIdentificationNumber");
    if (current == null) return Collections.emptyList();
    if (current instanceof Collection) {
      return (Collection<String>) current;
    }
    return Arrays.asList((String) current);
  }
  /**
   * The available volume for cargo or luggage. For automobiles, this is usually the trunk volume.\n\nTypical unit code(s): LTR for liters, FTQ for cubic foot/feet\n\nNote: You can use [[minValue]] and [[maxValue]] to indicate ranges.
   */
  @JsonIgnore public QuantitativeValue getCargoVolume() {
    return (QuantitativeValue) getValue("cargoVolume");
  }
  /**
   * The available volume for cargo or luggage. For automobiles, this is usually the trunk volume.\n\nTypical unit code(s): LTR for liters, FTQ for cubic foot/feet\n\nNote: You can use [[minValue]] and [[maxValue]] to indicate ranges.
   */
  @JsonIgnore public Collection<QuantitativeValue> getCargoVolumes() {
    final Object current = myData.get("cargoVolume");
    if (current == null) return Collections.emptyList();
    if (current instanceof Collection) {
      return (Collection<QuantitativeValue>) current;
    }
    return Arrays.asList((QuantitativeValue) current);
  }
  /**
   * A short text indicating the configuration of the vehicle, e.g. '5dr hatchback ST 2.5 MT 225 hp' or 'limited edition'.
   */
  @JsonIgnore public String getVehicleConfiguration() {
    return (String) getValue("vehicleConfiguration");
  }
  /**
   * A short text indicating the configuration of the vehicle, e.g. '5dr hatchback ST 2.5 MT 225 hp' or 'limited edition'.
   */
  @JsonIgnore public Collection<String> getVehicleConfigurations() {
    final Object current = myData.get("vehicleConfiguration");
    if (current == null) return Collections.emptyList();
    if (current instanceof Collection) {
      return (Collection<String>) current;
    }
    return Arrays.asList((String) current);
  }
  /**
   * A textual description of known damages, both repaired and unrepaired.
   */
  @JsonIgnore public String getKnownVehicleDamages() {
    return (String) getValue("knownVehicleDamages");
  }
  /**
   * A textual description of known damages, both repaired and unrepaired.
   */
  @JsonIgnore public Collection<String> getKnownVehicleDamagess() {
    final Object current = myData.get("knownVehicleDamages");
    if (current == null) return Collections.emptyList();
    if (current instanceof Collection) {
      return (Collection<String>) current;
    }
    return Arrays.asList((String) current);
  }
  /**
   * The date of the first registration of the vehicle with the respective public authorities.
   */
  @JsonIgnore public java.util.Date getDateVehicleFirstRegistered() {
    return (java.util.Date) getValue("dateVehicleFirstRegistered");
  }
  /**
   * The date of the first registration of the vehicle with the respective public authorities.
   */
  @JsonIgnore public Collection<java.util.Date> getDateVehicleFirstRegistereds() {
    final Object current = myData.get("dateVehicleFirstRegistered");
    if (current == null) return Collections.emptyList();
    if (current instanceof Collection) {
      return (Collection<java.util.Date>) current;
    }
    return Arrays.asList((java.util.Date) current);
  }
  /**
   * The drive wheel configuration, i.e. which roadwheels will receive torque from the vehicle's engine via the drivetrain.
   */
  @JsonIgnore public DriveWheelConfigurationValue getDriveWheelConfigurationDriveWheelConfigurationValue() {
    return (DriveWheelConfigurationValue) getValue("driveWheelConfiguration");
  }
  /**
   * The drive wheel configuration, i.e. which roadwheels will receive torque from the vehicle's engine via the drivetrain.
   */
  @JsonIgnore public Collection<DriveWheelConfigurationValue> getDriveWheelConfigurationDriveWheelConfigurationValues() {
    final Object current = myData.get("driveWheelConfiguration");
    if (current == null) return Collections.emptyList();
    if (current instanceof Collection) {
      return (Collection<DriveWheelConfigurationValue>) current;
    }
    return Arrays.asList((DriveWheelConfigurationValue) current);
  }
  /**
   * The drive wheel configuration, i.e. which roadwheels will receive torque from the vehicle's engine via the drivetrain.
   */
  @JsonIgnore public String getDriveWheelConfigurationString() {
    return (String) getValue("driveWheelConfiguration");
  }
  /**
   * The drive wheel configuration, i.e. which roadwheels will receive torque from the vehicle's engine via the drivetrain.
   */
  @JsonIgnore public Collection<String> getDriveWheelConfigurationStrings() {
    final Object current = myData.get("driveWheelConfiguration");
    if (current == null) return Collections.emptyList();
    if (current instanceof Collection) {
      return (Collection<String>) current;
    }
    return Arrays.asList((String) current);
  }
  /**
   * The type of fuel suitable for the engine or engines of the vehicle. If the vehicle has only one engine, this property can be attached directly to the vehicle.
   */
  @JsonIgnore public QualitativeValue getFuelTypeQualitativeValue() {
    return (QualitativeValue) getValue("fuelType");
  }
  /**
   * The type of fuel suitable for the engine or engines of the vehicle. If the vehicle has only one engine, this property can be attached directly to the vehicle.
   */
  @JsonIgnore public Collection<QualitativeValue> getFuelTypeQualitativeValues() {
    final Object current = myData.get("fuelType");
    if (current == null) return Collections.emptyList();
    if (current instanceof Collection) {
      return (Collection<QualitativeValue>) current;
    }
    return Arrays.asList((QualitativeValue) current);
  }
  /**
   * The type of fuel suitable for the engine or engines of the vehicle. If the vehicle has only one engine, this property can be attached directly to the vehicle.
   */
  @JsonIgnore public String getFuelTypeString() {
    return (String) getValue("fuelType");
  }
  /**
   * The type of fuel suitable for the engine or engines of the vehicle. If the vehicle has only one engine, this property can be attached directly to the vehicle.
   */
  @JsonIgnore public Collection<String> getFuelTypeStrings() {
    final Object current = myData.get("fuelType");
    if (current == null) return Collections.emptyList();
    if (current instanceof Collection) {
      return (Collection<String>) current;
    }
    return Arrays.asList((String) current);
  }
  /**
   * The color or color combination of the interior of the vehicle.
   */
  @JsonIgnore public String getVehicleInteriorColor() {
    return (String) getValue("vehicleInteriorColor");
  }
  /**
   * The color or color combination of the interior of the vehicle.
   */
  @JsonIgnore public Collection<String> getVehicleInteriorColors() {
    final Object current = myData.get("vehicleInteriorColor");
    if (current == null) return Collections.emptyList();
    if (current instanceof Collection) {
      return (Collection<String>) current;
    }
    return Arrays.asList((String) current);
  }
  /**
   * The type or material of the interior of the vehicle (e.g. synthetic fabric, leather, wood, etc.). While most interior types are characterized by the material used, an interior type can also be based on vehicle usage or target audience.
   */
  @JsonIgnore public String getVehicleInteriorType() {
    return (String) getValue("vehicleInteriorType");
  }
  /**
   * The type or material of the interior of the vehicle (e.g. synthetic fabric, leather, wood, etc.). While most interior types are characterized by the material used, an interior type can also be based on vehicle usage or target audience.
   */
  @JsonIgnore public Collection<String> getVehicleInteriorTypes() {
    final Object current = myData.get("vehicleInteriorType");
    if (current == null) return Collections.emptyList();
    if (current instanceof Collection) {
      return (Collection<String>) current;
    }
    return Arrays.asList((String) current);
  }
  /**
   * The total distance travelled by the particular vehicle since its initial production, as read from its odometer.\n\nTypical unit code(s): KMT for kilometers, SMI for statute miles
   */
  @JsonIgnore public QuantitativeValue getMileageFromOdometer() {
    return (QuantitativeValue) getValue("mileageFromOdometer");
  }
  /**
   * The total distance travelled by the particular vehicle since its initial production, as read from its odometer.\n\nTypical unit code(s): KMT for kilometers, SMI for statute miles
   */
  @JsonIgnore public Collection<QuantitativeValue> getMileageFromOdometers() {
    final Object current = myData.get("mileageFromOdometer");
    if (current == null) return Collections.emptyList();
    if (current instanceof Collection) {
      return (Collection<QuantitativeValue>) current;
    }
    return Arrays.asList((QuantitativeValue) current);
  }
  /**
   * The release date of a vehicle model (often used to differentiate versions of the same make and model).
   */
  @JsonIgnore public java.util.Date getVehicleModelDate() {
    return (java.util.Date) getValue("vehicleModelDate");
  }
  /**
   * The release date of a vehicle model (often used to differentiate versions of the same make and model).
   */
  @JsonIgnore public Collection<java.util.Date> getVehicleModelDates() {
    final Object current = myData.get("vehicleModelDate");
    if (current == null) return Collections.emptyList();
    if (current instanceof Collection) {
      return (Collection<java.util.Date>) current;
    }
    return Arrays.asList((java.util.Date) current);
  }
  /**
   * The number of owners of the vehicle, including the current one.\n\nTypical unit code(s): C62
   */
  @JsonIgnore public Number getNumberOfPreviousOwnersNumber() {
    return (Number) getValue("numberOfPreviousOwners");
  }
  /**
   * The number of owners of the vehicle, including the current one.\n\nTypical unit code(s): C62
   */
  @JsonIgnore public Collection<Number> getNumberOfPreviousOwnersNumbers() {
    final Object current = myData.get("numberOfPreviousOwners");
    if (current == null) return Collections.emptyList();
    if (current instanceof Collection) {
      return (Collection<Number>) current;
    }
    return Arrays.asList((Number) current);
  }
  /**
   * The number of owners of the vehicle, including the current one.\n\nTypical unit code(s): C62
   */
  @JsonIgnore public QuantitativeValue getNumberOfPreviousOwnersQuantitativeValue() {
    return (QuantitativeValue) getValue("numberOfPreviousOwners");
  }
  /**
   * The number of owners of the vehicle, including the current one.\n\nTypical unit code(s): C62
   */
  @JsonIgnore public Collection<QuantitativeValue> getNumberOfPreviousOwnersQuantitativeValues() {
    final Object current = myData.get("numberOfPreviousOwners");
    if (current == null) return Collections.emptyList();
    if (current instanceof Collection) {
      return (Collection<QuantitativeValue>) current;
    }
    return Arrays.asList((QuantitativeValue) current);
  }
  /**
   * The date of production of the item, e.g. vehicle.
   */
  @JsonIgnore public java.util.Date getProductionDate() {
    return (java.util.Date) getValue("productionDate");
  }
  /**
   * The date of production of the item, e.g. vehicle.
   */
  @JsonIgnore public Collection<java.util.Date> getProductionDates() {
    final Object current = myData.get("productionDate");
    if (current == null) return Collections.emptyList();
    if (current instanceof Collection) {
      return (Collection<java.util.Date>) current;
    }
    return Arrays.asList((java.util.Date) current);
  }
  /**
   * The date the item e.g. vehicle was purchased by the current owner.
   */
  @JsonIgnore public java.util.Date getPurchaseDate() {
    return (java.util.Date) getValue("purchaseDate");
  }
  /**
   * The date the item e.g. vehicle was purchased by the current owner.
   */
  @JsonIgnore public Collection<java.util.Date> getPurchaseDates() {
    final Object current = myData.get("purchaseDate");
    if (current == null) return Collections.emptyList();
    if (current instanceof Collection) {
      return (Collection<java.util.Date>) current;
    }
    return Arrays.asList((java.util.Date) current);
  }
  /**
   * The number of passengers that can be seated in the vehicle, both in terms of the physical space available, and in terms of limitations set by law.\n\nTypical unit code(s): C62 for persons.
   */
  @JsonIgnore public Number getVehicleSeatingCapacityNumber() {
    return (Number) getValue("vehicleSeatingCapacity");
  }
  /**
   * The number of passengers that can be seated in the vehicle, both in terms of the physical space available, and in terms of limitations set by law.\n\nTypical unit code(s): C62 for persons.
   */
  @JsonIgnore public Collection<Number> getVehicleSeatingCapacityNumbers() {
    final Object current = myData.get("vehicleSeatingCapacity");
    if (current == null) return Collections.emptyList();
    if (current instanceof Collection) {
      return (Collection<Number>) current;
    }
    return Arrays.asList((Number) current);
  }
  /**
   * The number of passengers that can be seated in the vehicle, both in terms of the physical space available, and in terms of limitations set by law.\n\nTypical unit code(s): C62 for persons.
   */
  @JsonIgnore public QuantitativeValue getVehicleSeatingCapacityQuantitativeValue() {
    return (QuantitativeValue) getValue("vehicleSeatingCapacity");
  }
  /**
   * The number of passengers that can be seated in the vehicle, both in terms of the physical space available, and in terms of limitations set by law.\n\nTypical unit code(s): C62 for persons.
   */
  @JsonIgnore public Collection<QuantitativeValue> getVehicleSeatingCapacityQuantitativeValues() {
    final Object current = myData.get("vehicleSeatingCapacity");
    if (current == null) return Collections.emptyList();
    if (current instanceof Collection) {
      return (Collection<QuantitativeValue>) current;
    }
    return Arrays.asList((QuantitativeValue) current);
  }
  /**
   * The type of component used for transmitting the power from a rotating power source to the wheels or other relevant component(s) (&quot;gearbox&quot; for cars).
   */
  @JsonIgnore public QualitativeValue getVehicleTransmissionQualitativeValue() {
    return (QualitativeValue) getValue("vehicleTransmission");
  }
  /**
   * The type of component used for transmitting the power from a rotating power source to the wheels or other relevant component(s) (&quot;gearbox&quot; for cars).
   */
  @JsonIgnore public Collection<QualitativeValue> getVehicleTransmissionQualitativeValues() {
    final Object current = myData.get("vehicleTransmission");
    if (current == null) return Collections.emptyList();
    if (current instanceof Collection) {
      return (Collection<QualitativeValue>) current;
    }
    return Arrays.asList((QualitativeValue) current);
  }
  /**
   * The type of component used for transmitting the power from a rotating power source to the wheels or other relevant component(s) (&quot;gearbox&quot; for cars).
   */
  @JsonIgnore public String getVehicleTransmissionString() {
    return (String) getValue("vehicleTransmission");
  }
  /**
   * The type of component used for transmitting the power from a rotating power source to the wheels or other relevant component(s) (&quot;gearbox&quot; for cars).
   */
  @JsonIgnore public Collection<String> getVehicleTransmissionStrings() {
    final Object current = myData.get("vehicleTransmission");
    if (current == null) return Collections.emptyList();
    if (current instanceof Collection) {
      return (Collection<String>) current;
    }
    return Arrays.asList((String) current);
  }
  /**
   * The position of the steering wheel or similar device (mostly for cars).
   */
  @JsonIgnore public SteeringPositionValue getSteeringPosition() {
    return (SteeringPositionValue) getValue("steeringPosition");
  }
  /**
   * The position of the steering wheel or similar device (mostly for cars).
   */
  @JsonIgnore public Collection<SteeringPositionValue> getSteeringPositions() {
    final Object current = myData.get("steeringPosition");
    if (current == null) return Collections.emptyList();
    if (current instanceof Collection) {
      return (Collection<SteeringPositionValue>) current;
    }
    return Arrays.asList((SteeringPositionValue) current);
  }
  /**
   * Indicates whether the vehicle has been used for special purposes, like commercial rental, driving school, or as a taxi. The legislation in many countries requires this information to be revealed when offering a car for sale.
   */
  @JsonIgnore public String getVehicleSpecialUsage() {
    return (String) getValue("vehicleSpecialUsage");
  }
  /**
   * Indicates whether the vehicle has been used for special purposes, like commercial rental, driving school, or as a taxi. The legislation in many countries requires this information to be revealed when offering a car for sale.
   */
  @JsonIgnore public Collection<String> getVehicleSpecialUsages() {
    final Object current = myData.get("vehicleSpecialUsage");
    if (current == null) return Collections.emptyList();
    if (current instanceof Collection) {
      return (Collection<String>) current;
    }
    return Arrays.asList((String) current);
  }
  protected Vehicle(java.util.Map<String,Object> data) {
    super(data);
  }
  
  /**
   * Builder for {@link Vehicle}
   */
  public static class Builder extends Product.Builder {
    public Builder(@NotNull HashMap<String,Object> data) {
      super(data);
    }
    @NotNull public Vehicle build() {
      return new Vehicle(myData);
    }
    /**
     * The number of doors.\n\nTypical unit code(s): C62
     */
    @NotNull public Builder numberOfDoors(@NotNull Number number) {
      putValue("numberOfDoors", number);
      return this;
    }
    /**
     * The number of doors.\n\nTypical unit code(s): C62
     */
    @NotNull public Builder numberOfDoors(@NotNull QuantitativeValue quantitativeValue) {
      putValue("numberOfDoors", quantitativeValue);
      return this;
    }
    /**
     * The number of doors.\n\nTypical unit code(s): C62
     */
    @NotNull public Builder numberOfDoors(@NotNull QuantitativeValue.Builder quantitativeValue) {
      putValue("numberOfDoors", quantitativeValue.build());
      return this;
    }
    /**
     * The number or type of airbags in the vehicle.
     */
    @NotNull public Builder numberOfAirbags(@NotNull Integer integer) {
      putValue("numberOfAirbags", integer);
      return this;
    }
    /**
     * The number or type of airbags in the vehicle.
     */
    @NotNull public Builder numberOfAirbags(@NotNull Long numberOfAirbags) {
      putValue("numberOfAirbags", numberOfAirbags);
      return this;
    }
    /**
     * The number or type of airbags in the vehicle.
     */
    @NotNull public Builder numberOfAirbags(@NotNull Float numberOfAirbags) {
      putValue("numberOfAirbags", numberOfAirbags);
      return this;
    }
    /**
     * The number or type of airbags in the vehicle.
     */
    @NotNull public Builder numberOfAirbags(@NotNull Double numberOfAirbags) {
      putValue("numberOfAirbags", numberOfAirbags);
      return this;
    }
    /**
     * The number or type of airbags in the vehicle.
     */
    @NotNull public Builder numberOfAirbags(@NotNull String numberOfAirbags) {
      putValue("numberOfAirbags", numberOfAirbags);
      return this;
    }
    /**
     * The number of axles.\n\nTypical unit code(s): C62
     */
    @NotNull public Builder numberOfAxles(@NotNull Number number) {
      putValue("numberOfAxles", number);
      return this;
    }
    /**
     * The number of axles.\n\nTypical unit code(s): C62
     */
    @NotNull public Builder numberOfAxles(@NotNull QuantitativeValue quantitativeValue) {
      putValue("numberOfAxles", quantitativeValue);
      return this;
    }
    /**
     * The number of axles.\n\nTypical unit code(s): C62
     */
    @NotNull public Builder numberOfAxles(@NotNull QuantitativeValue.Builder quantitativeValue) {
      putValue("numberOfAxles", quantitativeValue.build());
      return this;
    }
    /**
     * Information about the engine or engines of the vehicle.
     */
    @NotNull public Builder vehicleEngine(@NotNull EngineSpecification engineSpecification) {
      putValue("vehicleEngine", engineSpecification);
      return this;
    }
    /**
     * Information about the engine or engines of the vehicle.
     */
    @NotNull public Builder vehicleEngine(@NotNull EngineSpecification.Builder engineSpecification) {
      putValue("vehicleEngine", engineSpecification.build());
      return this;
    }
    /**
     * The amount of fuel consumed for traveling a particular distance or temporal duration with the given vehicle (e.g. liters per 100 km).\n\n* Note 1: There are unfortunately no standard unit codes for liters per 100 km.  Use [[unitText]] to indicate the unit of measurement, e.g. L/100 km.\n* Note 2: There are two ways of indicating the fuel consumption, [[fuelConsumption]] (e.g. 8 liters per 100 km) and [[fuelEfficiency]] (e.g. 30 miles per gallon). They are reciprocal.\n* Note 3: Often, the absolute value is useful only when related to driving speed (&quot;at 80 km/h&quot;) or usage pattern (&quot;city traffic&quot;). You can use [[valueReference]] to link the value for the fuel consumption to another value.
     */
    @NotNull public Builder fuelConsumption(@NotNull QuantitativeValue quantitativeValue) {
      putValue("fuelConsumption", quantitativeValue);
      return this;
    }
    /**
     * The amount of fuel consumed for traveling a particular distance or temporal duration with the given vehicle (e.g. liters per 100 km).\n\n* Note 1: There are unfortunately no standard unit codes for liters per 100 km.  Use [[unitText]] to indicate the unit of measurement, e.g. L/100 km.\n* Note 2: There are two ways of indicating the fuel consumption, [[fuelConsumption]] (e.g. 8 liters per 100 km) and [[fuelEfficiency]] (e.g. 30 miles per gallon). They are reciprocal.\n* Note 3: Often, the absolute value is useful only when related to driving speed (&quot;at 80 km/h&quot;) or usage pattern (&quot;city traffic&quot;). You can use [[valueReference]] to link the value for the fuel consumption to another value.
     */
    @NotNull public Builder fuelConsumption(@NotNull QuantitativeValue.Builder quantitativeValue) {
      putValue("fuelConsumption", quantitativeValue.build());
      return this;
    }
    /**
     * The distance traveled per unit of fuel used; most commonly miles per gallon (mpg) or kilometers per liter (km/L).\n\n* Note 1: There are unfortunately no standard unit codes for miles per gallon or kilometers per liter. Use [[unitText]] to indicate the unit of measurement, e.g. mpg or km/L.\n* Note 2: There are two ways of indicating the fuel consumption, [[fuelConsumption]] (e.g. 8 liters per 100 km) and [[fuelEfficiency]] (e.g. 30 miles per gallon). They are reciprocal.\n* Note 3: Often, the absolute value is useful only when related to driving speed (&quot;at 80 km/h&quot;) or usage pattern (&quot;city traffic&quot;). You can use [[valueReference]] to link the value for the fuel economy to another value.
     */
    @NotNull public Builder fuelEfficiency(@NotNull QuantitativeValue quantitativeValue) {
      putValue("fuelEfficiency", quantitativeValue);
      return this;
    }
    /**
     * The distance traveled per unit of fuel used; most commonly miles per gallon (mpg) or kilometers per liter (km/L).\n\n* Note 1: There are unfortunately no standard unit codes for miles per gallon or kilometers per liter. Use [[unitText]] to indicate the unit of measurement, e.g. mpg or km/L.\n* Note 2: There are two ways of indicating the fuel consumption, [[fuelConsumption]] (e.g. 8 liters per 100 km) and [[fuelEfficiency]] (e.g. 30 miles per gallon). They are reciprocal.\n* Note 3: Often, the absolute value is useful only when related to driving speed (&quot;at 80 km/h&quot;) or usage pattern (&quot;city traffic&quot;). You can use [[valueReference]] to link the value for the fuel economy to another value.
     */
    @NotNull public Builder fuelEfficiency(@NotNull QuantitativeValue.Builder quantitativeValue) {
      putValue("fuelEfficiency", quantitativeValue.build());
      return this;
    }
    /**
     * The total number of forward gears available for the transmission system of the vehicle.\n\nTypical unit code(s): C62
     */
    @NotNull public Builder numberOfForwardGears(@NotNull Number number) {
      putValue("numberOfForwardGears", number);
      return this;
    }
    /**
     * The total number of forward gears available for the transmission system of the vehicle.\n\nTypical unit code(s): C62
     */
    @NotNull public Builder numberOfForwardGears(@NotNull QuantitativeValue quantitativeValue) {
      putValue("numberOfForwardGears", quantitativeValue);
      return this;
    }
    /**
     * The total number of forward gears available for the transmission system of the vehicle.\n\nTypical unit code(s): C62
     */
    @NotNull public Builder numberOfForwardGears(@NotNull QuantitativeValue.Builder quantitativeValue) {
      putValue("numberOfForwardGears", quantitativeValue.build());
      return this;
    }
    /**
     * The Vehicle Identification Number (VIN) is a unique serial number used by the automotive industry to identify individual motor vehicles.
     */
    @NotNull public Builder vehicleIdentificationNumber(@NotNull String vehicleIdentificationNumber) {
      putValue("vehicleIdentificationNumber", vehicleIdentificationNumber);
      return this;
    }
    /**
     * The available volume for cargo or luggage. For automobiles, this is usually the trunk volume.\n\nTypical unit code(s): LTR for liters, FTQ for cubic foot/feet\n\nNote: You can use [[minValue]] and [[maxValue]] to indicate ranges.
     */
    @NotNull public Builder cargoVolume(@NotNull QuantitativeValue quantitativeValue) {
      putValue("cargoVolume", quantitativeValue);
      return this;
    }
    /**
     * The available volume for cargo or luggage. For automobiles, this is usually the trunk volume.\n\nTypical unit code(s): LTR for liters, FTQ for cubic foot/feet\n\nNote: You can use [[minValue]] and [[maxValue]] to indicate ranges.
     */
    @NotNull public Builder cargoVolume(@NotNull QuantitativeValue.Builder quantitativeValue) {
      putValue("cargoVolume", quantitativeValue.build());
      return this;
    }
    /**
     * A short text indicating the configuration of the vehicle, e.g. '5dr hatchback ST 2.5 MT 225 hp' or 'limited edition'.
     */
    @NotNull public Builder vehicleConfiguration(@NotNull String vehicleConfiguration) {
      putValue("vehicleConfiguration", vehicleConfiguration);
      return this;
    }
    /**
     * A textual description of known damages, both repaired and unrepaired.
     */
    @NotNull public Builder knownVehicleDamages(@NotNull String knownVehicleDamages) {
      putValue("knownVehicleDamages", knownVehicleDamages);
      return this;
    }
    /**
     * The date of the first registration of the vehicle with the respective public authorities.
     */
    @NotNull public Builder dateVehicleFirstRegistered(@NotNull java.util.Date date) {
      putValue("dateVehicleFirstRegistered", date);
      return this;
    }
    /**
     * The drive wheel configuration, i.e. which roadwheels will receive torque from the vehicle's engine via the drivetrain.
     */
    @NotNull public Builder driveWheelConfiguration(@NotNull DriveWheelConfigurationValue driveWheelConfigurationValue) {
      putValue("driveWheelConfiguration", driveWheelConfigurationValue);
      return this;
    }
    /**
     * The drive wheel configuration, i.e. which roadwheels will receive torque from the vehicle's engine via the drivetrain.
     */
    @NotNull public Builder driveWheelConfiguration(@NotNull DriveWheelConfigurationValue.Builder driveWheelConfigurationValue) {
      putValue("driveWheelConfiguration", driveWheelConfigurationValue.build());
      return this;
    }
    /**
     * The drive wheel configuration, i.e. which roadwheels will receive torque from the vehicle's engine via the drivetrain.
     */
    @NotNull public Builder driveWheelConfiguration(@NotNull String driveWheelConfiguration) {
      putValue("driveWheelConfiguration", driveWheelConfiguration);
      return this;
    }
    /**
     * The type of fuel suitable for the engine or engines of the vehicle. If the vehicle has only one engine, this property can be attached directly to the vehicle.
     */
    @NotNull public Builder fuelType(@NotNull QualitativeValue qualitativeValue) {
      putValue("fuelType", qualitativeValue);
      return this;
    }
    /**
     * The type of fuel suitable for the engine or engines of the vehicle. If the vehicle has only one engine, this property can be attached directly to the vehicle.
     */
    @NotNull public Builder fuelType(@NotNull QualitativeValue.Builder qualitativeValue) {
      putValue("fuelType", qualitativeValue.build());
      return this;
    }
    /**
     * The type of fuel suitable for the engine or engines of the vehicle. If the vehicle has only one engine, this property can be attached directly to the vehicle.
     */
    @NotNull public Builder fuelType(@NotNull String fuelType) {
      putValue("fuelType", fuelType);
      return this;
    }
    /**
     * The color or color combination of the interior of the vehicle.
     */
    @NotNull public Builder vehicleInteriorColor(@NotNull String vehicleInteriorColor) {
      putValue("vehicleInteriorColor", vehicleInteriorColor);
      return this;
    }
    /**
     * The type or material of the interior of the vehicle (e.g. synthetic fabric, leather, wood, etc.). While most interior types are characterized by the material used, an interior type can also be based on vehicle usage or target audience.
     */
    @NotNull public Builder vehicleInteriorType(@NotNull String vehicleInteriorType) {
      putValue("vehicleInteriorType", vehicleInteriorType);
      return this;
    }
    /**
     * The total distance travelled by the particular vehicle since its initial production, as read from its odometer.\n\nTypical unit code(s): KMT for kilometers, SMI for statute miles
     */
    @NotNull public Builder mileageFromOdometer(@NotNull QuantitativeValue quantitativeValue) {
      putValue("mileageFromOdometer", quantitativeValue);
      return this;
    }
    /**
     * The total distance travelled by the particular vehicle since its initial production, as read from its odometer.\n\nTypical unit code(s): KMT for kilometers, SMI for statute miles
     */
    @NotNull public Builder mileageFromOdometer(@NotNull QuantitativeValue.Builder quantitativeValue) {
      putValue("mileageFromOdometer", quantitativeValue.build());
      return this;
    }
    /**
     * The release date of a vehicle model (often used to differentiate versions of the same make and model).
     */
    @NotNull public Builder vehicleModelDate(@NotNull java.util.Date date) {
      putValue("vehicleModelDate", date);
      return this;
    }
    /**
     * The number of owners of the vehicle, including the current one.\n\nTypical unit code(s): C62
     */
    @NotNull public Builder numberOfPreviousOwners(@NotNull Number number) {
      putValue("numberOfPreviousOwners", number);
      return this;
    }
    /**
     * The number of owners of the vehicle, including the current one.\n\nTypical unit code(s): C62
     */
    @NotNull public Builder numberOfPreviousOwners(@NotNull QuantitativeValue quantitativeValue) {
      putValue("numberOfPreviousOwners", quantitativeValue);
      return this;
    }
    /**
     * The number of owners of the vehicle, including the current one.\n\nTypical unit code(s): C62
     */
    @NotNull public Builder numberOfPreviousOwners(@NotNull QuantitativeValue.Builder quantitativeValue) {
      putValue("numberOfPreviousOwners", quantitativeValue.build());
      return this;
    }
    /**
     * The date of production of the item, e.g. vehicle.
     */
    @NotNull public Builder productionDate(@NotNull java.util.Date date) {
      putValue("productionDate", date);
      return this;
    }
    /**
     * The date the item e.g. vehicle was purchased by the current owner.
     */
    @NotNull public Builder purchaseDate(@NotNull java.util.Date date) {
      putValue("purchaseDate", date);
      return this;
    }
    /**
     * The number of passengers that can be seated in the vehicle, both in terms of the physical space available, and in terms of limitations set by law.\n\nTypical unit code(s): C62 for persons.
     */
    @NotNull public Builder vehicleSeatingCapacity(@NotNull Number number) {
      putValue("vehicleSeatingCapacity", number);
      return this;
    }
    /**
     * The number of passengers that can be seated in the vehicle, both in terms of the physical space available, and in terms of limitations set by law.\n\nTypical unit code(s): C62 for persons.
     */
    @NotNull public Builder vehicleSeatingCapacity(@NotNull QuantitativeValue quantitativeValue) {
      putValue("vehicleSeatingCapacity", quantitativeValue);
      return this;
    }
    /**
     * The number of passengers that can be seated in the vehicle, both in terms of the physical space available, and in terms of limitations set by law.\n\nTypical unit code(s): C62 for persons.
     */
    @NotNull public Builder vehicleSeatingCapacity(@NotNull QuantitativeValue.Builder quantitativeValue) {
      putValue("vehicleSeatingCapacity", quantitativeValue.build());
      return this;
    }
    /**
     * The type of component used for transmitting the power from a rotating power source to the wheels or other relevant component(s) (&quot;gearbox&quot; for cars).
     */
    @NotNull public Builder vehicleTransmission(@NotNull QualitativeValue qualitativeValue) {
      putValue("vehicleTransmission", qualitativeValue);
      return this;
    }
    /**
     * The type of component used for transmitting the power from a rotating power source to the wheels or other relevant component(s) (&quot;gearbox&quot; for cars).
     */
    @NotNull public Builder vehicleTransmission(@NotNull QualitativeValue.Builder qualitativeValue) {
      putValue("vehicleTransmission", qualitativeValue.build());
      return this;
    }
    /**
     * The type of component used for transmitting the power from a rotating power source to the wheels or other relevant component(s) (&quot;gearbox&quot; for cars).
     */
    @NotNull public Builder vehicleTransmission(@NotNull String vehicleTransmission) {
      putValue("vehicleTransmission", vehicleTransmission);
      return this;
    }
    /**
     * The position of the steering wheel or similar device (mostly for cars).
     */
    @NotNull public Builder steeringPosition(@NotNull SteeringPositionValue steeringPositionValue) {
      putValue("steeringPosition", steeringPositionValue);
      return this;
    }
    /**
     * The position of the steering wheel or similar device (mostly for cars).
     */
    @NotNull public Builder steeringPosition(@NotNull SteeringPositionValue.Builder steeringPositionValue) {
      putValue("steeringPosition", steeringPositionValue.build());
      return this;
    }
    /**
     * Indicates whether the vehicle has been used for special purposes, like commercial rental, driving school, or as a taxi. The legislation in many countries requires this information to be revealed when offering a car for sale.
     */
    @NotNull public Builder vehicleSpecialUsage(@NotNull String vehicleSpecialUsage) {
      putValue("vehicleSpecialUsage", vehicleSpecialUsage);
      return this;
    }
    /**
     * The overall rating, based on a collection of reviews or ratings, of the item.
     */
    @NotNull public Builder aggregateRating(@NotNull AggregateRating aggregateRating) {
      putValue("aggregateRating", aggregateRating);
      return this;
    }
    /**
     * The overall rating, based on a collection of reviews or ratings, of the item.
     */
    @NotNull public Builder aggregateRating(@NotNull AggregateRating.Builder aggregateRating) {
      putValue("aggregateRating", aggregateRating.build());
      return this;
    }
    /**
     * An intended audience, i.e. a group for whom something was created.
     */
    @NotNull public Builder audience(@NotNull Audience audience) {
      putValue("audience", audience);
      return this;
    }
    /**
     * An intended audience, i.e. a group for whom something was created.
     */
    @NotNull public Builder audience(@NotNull Audience.Builder audience) {
      putValue("audience", audience.build());
      return this;
    }
    /**
     * An award won by or for this item.
     */
    @NotNull public Builder award(@NotNull String award) {
      putValue("award", award);
      return this;
    }
    /**
     * The brand(s) associated with a product or service, or the brand(s) maintained by an organization or business person.
     */
    @NotNull public Builder brand(@NotNull Brand brand) {
      putValue("brand", brand);
      return this;
    }
    /**
     * The brand(s) associated with a product or service, or the brand(s) maintained by an organization or business person.
     */
    @NotNull public Builder brand(@NotNull Brand.Builder brand) {
      putValue("brand", brand.build());
      return this;
    }
    /**
     * The brand(s) associated with a product or service, or the brand(s) maintained by an organization or business person.
     */
    @NotNull public Builder brand(@NotNull Organization organization) {
      putValue("brand", organization);
      return this;
    }
    /**
     * The brand(s) associated with a product or service, or the brand(s) maintained by an organization or business person.
     */
    @NotNull public Builder brand(@NotNull Organization.Builder organization) {
      putValue("brand", organization.build());
      return this;
    }
    /**
     * A category for the item. Greater signs or slashes can be used to informally indicate a category hierarchy.
     */
    @NotNull public Builder category(@NotNull String category) {
      putValue("category", category);
      return this;
    }
    /**
     * A category for the item. Greater signs or slashes can be used to informally indicate a category hierarchy.
     */
    @NotNull public Builder category(@NotNull Thing thing) {
      putValue("category", thing);
      return this;
    }
    /**
     * A category for the item. Greater signs or slashes can be used to informally indicate a category hierarchy.
     */
    @NotNull public Builder category(@NotNull Thing.Builder thing) {
      putValue("category", thing.build());
      return this;
    }
    /**
     * The color of the product.
     */
    @NotNull public Builder color(@NotNull String color) {
      putValue("color", color);
      return this;
    }
    /**
     * The depth of the item.
     */
    @NotNull public Builder depth(@NotNull Distance distance) {
      putValue("depth", distance);
      return this;
    }
    /**
     * The depth of the item.
     */
    @NotNull public Builder depth(@NotNull Distance.Builder distance) {
      putValue("depth", distance.build());
      return this;
    }
    /**
     * The depth of the item.
     */
    @NotNull public Builder depth(@NotNull QuantitativeValue quantitativeValue) {
      putValue("depth", quantitativeValue);
      return this;
    }
    /**
     * The depth of the item.
     */
    @NotNull public Builder depth(@NotNull QuantitativeValue.Builder quantitativeValue) {
      putValue("depth", quantitativeValue.build());
      return this;
    }
    /**
     * The GTIN-12 code of the product, or the product to which the offer refers. The GTIN-12 is the 12-digit GS1 Identification Key composed of a U.P.C. Company Prefix, Item Reference, and Check Digit used to identify trade items. See [GS1 GTIN Summary](http://www.gs1.org/barcodes/technical/idkeys/gtin) for more details.
     */
    @NotNull public Builder gtin12(@NotNull Identifier identifier) {
      putValue("gtin12", identifier);
      return this;
    }
    /**
     * The GTIN-12 code of the product, or the product to which the offer refers. The GTIN-12 is the 12-digit GS1 Identification Key composed of a U.P.C. Company Prefix, Item Reference, and Check Digit used to identify trade items. See [GS1 GTIN Summary](http://www.gs1.org/barcodes/technical/idkeys/gtin) for more details.
     */
    @NotNull public Builder gtin12(@NotNull String gtin12) {
      putValue("gtin12", gtin12);
      return this;
    }
    /**
     * The GTIN-13 code of the product, or the product to which the offer refers. This is equivalent to 13-digit ISBN codes and EAN UCC-13. Former 12-digit UPC codes can be converted into a GTIN-13 code by simply adding a preceeding zero. See [GS1 GTIN Summary](http://www.gs1.org/barcodes/technical/idkeys/gtin) for more details.
     */
    @NotNull public Builder gtin13(@NotNull Identifier identifier) {
      putValue("gtin13", identifier);
      return this;
    }
    /**
     * The GTIN-13 code of the product, or the product to which the offer refers. This is equivalent to 13-digit ISBN codes and EAN UCC-13. Former 12-digit UPC codes can be converted into a GTIN-13 code by simply adding a preceeding zero. See [GS1 GTIN Summary](http://www.gs1.org/barcodes/technical/idkeys/gtin) for more details.
     */
    @NotNull public Builder gtin13(@NotNull String gtin13) {
      putValue("gtin13", gtin13);
      return this;
    }
    /**
     * The GTIN-14 code of the product, or the product to which the offer refers. See [GS1 GTIN Summary](http://www.gs1.org/barcodes/technical/idkeys/gtin) for more details.
     */
    @NotNull public Builder gtin14(@NotNull Identifier identifier) {
      putValue("gtin14", identifier);
      return this;
    }
    /**
     * The GTIN-14 code of the product, or the product to which the offer refers. See [GS1 GTIN Summary](http://www.gs1.org/barcodes/technical/idkeys/gtin) for more details.
     */
    @NotNull public Builder gtin14(@NotNull String gtin14) {
      putValue("gtin14", gtin14);
      return this;
    }
    /**
     * The [GTIN-8](http://apps.gs1.org/GDD/glossary/Pages/GTIN-8.aspx) code of the product, or the product to which the offer refers. This code is also known as EAN/UCC-8 or 8-digit EAN. See [GS1 GTIN Summary](http://www.gs1.org/barcodes/technical/idkeys/gtin) for more details.
     */
    @NotNull public Builder gtin8(@NotNull Identifier identifier) {
      putValue("gtin8", identifier);
      return this;
    }
    /**
     * The [GTIN-8](http://apps.gs1.org/GDD/glossary/Pages/GTIN-8.aspx) code of the product, or the product to which the offer refers. This code is also known as EAN/UCC-8 or 8-digit EAN. See [GS1 GTIN Summary](http://www.gs1.org/barcodes/technical/idkeys/gtin) for more details.
     */
    @NotNull public Builder gtin8(@NotNull String gtin8) {
      putValue("gtin8", gtin8);
      return this;
    }
    /**
     * The height of the item.
     */
    @NotNull public Builder height(@NotNull Distance distance) {
      putValue("height", distance);
      return this;
    }
    /**
     * The height of the item.
     */
    @NotNull public Builder height(@NotNull Distance.Builder distance) {
      putValue("height", distance.build());
      return this;
    }
    /**
     * The height of the item.
     */
    @NotNull public Builder height(@NotNull QuantitativeValue quantitativeValue) {
      putValue("height", quantitativeValue);
      return this;
    }
    /**
     * The height of the item.
     */
    @NotNull public Builder height(@NotNull QuantitativeValue.Builder quantitativeValue) {
      putValue("height", quantitativeValue.build());
      return this;
    }
    /**
     * A pointer to another product (or multiple products) for which this product is an accessory or spare part.
     */
    @NotNull public Builder isAccessoryOrSparePartFor(@NotNull Product product) {
      putValue("isAccessoryOrSparePartFor", product);
      return this;
    }
    /**
     * A pointer to another product (or multiple products) for which this product is an accessory or spare part.
     */
    @NotNull public Builder isAccessoryOrSparePartFor(@NotNull Product.Builder product) {
      putValue("isAccessoryOrSparePartFor", product.build());
      return this;
    }
    /**
     * A pointer to another product (or multiple products) for which this product is a consumable.
     */
    @NotNull public Builder isConsumableFor(@NotNull Product product) {
      putValue("isConsumableFor", product);
      return this;
    }
    /**
     * A pointer to another product (or multiple products) for which this product is a consumable.
     */
    @NotNull public Builder isConsumableFor(@NotNull Product.Builder product) {
      putValue("isConsumableFor", product.build());
      return this;
    }
    /**
     * A pointer to another, somehow related product (or multiple products).
     */
    @NotNull public Builder isRelatedTo(@NotNull Product product) {
      putValue("isRelatedTo", product);
      return this;
    }
    /**
     * A pointer to another, somehow related product (or multiple products).
     */
    @NotNull public Builder isRelatedTo(@NotNull Product.Builder product) {
      putValue("isRelatedTo", product.build());
      return this;
    }
    /**
     * A pointer to another, somehow related product (or multiple products).
     */
    @NotNull public Builder isRelatedTo(@NotNull Service service) {
      putValue("isRelatedTo", service);
      return this;
    }
    /**
     * A pointer to another, somehow related product (or multiple products).
     */
    @NotNull public Builder isRelatedTo(@NotNull Service.Builder service) {
      putValue("isRelatedTo", service.build());
      return this;
    }
    /**
     * A pointer to another, functionally similar product (or multiple products).
     */
    @NotNull public Builder isSimilarTo(@NotNull Product product) {
      putValue("isSimilarTo", product);
      return this;
    }
    /**
     * A pointer to another, functionally similar product (or multiple products).
     */
    @NotNull public Builder isSimilarTo(@NotNull Product.Builder product) {
      putValue("isSimilarTo", product.build());
      return this;
    }
    /**
     * A pointer to another, functionally similar product (or multiple products).
     */
    @NotNull public Builder isSimilarTo(@NotNull Service service) {
      putValue("isSimilarTo", service);
      return this;
    }
    /**
     * A pointer to another, functionally similar product (or multiple products).
     */
    @NotNull public Builder isSimilarTo(@NotNull Service.Builder service) {
      putValue("isSimilarTo", service.build());
      return this;
    }
    /**
     * A predefined value from OfferItemCondition or a textual description of the condition of the product or service, or the products or services included in the offer.
     */
    @NotNull public Builder itemCondition(@NotNull OfferItemCondition offerItemCondition) {
      putValue("itemCondition", offerItemCondition);
      return this;
    }
    /**
     * An associated logo.
     */
    @NotNull public Builder logo(@NotNull ImageObject imageObject) {
      putValue("logo", imageObject);
      return this;
    }
    /**
     * An associated logo.
     */
    @NotNull public Builder logo(@NotNull ImageObject.Builder imageObject) {
      putValue("logo", imageObject.build());
      return this;
    }
    /**
     * An associated logo.
     */
    @NotNull public Builder logo(@NotNull String logo) {
      putValue("logo", logo);
      return this;
    }
    /**
     * The model of the product. Use with the URL of a ProductModel or a textual representation of the model identifier. The URL of the ProductModel can be from an external source. It is recommended to additionally provide strong product identifiers via the gtin8/gtin13/gtin14 and mpn properties.
     */
    @NotNull public Builder model(@NotNull ProductModel productModel) {
      putValue("model", productModel);
      return this;
    }
    /**
     * The model of the product. Use with the URL of a ProductModel or a textual representation of the model identifier. The URL of the ProductModel can be from an external source. It is recommended to additionally provide strong product identifiers via the gtin8/gtin13/gtin14 and mpn properties.
     */
    @NotNull public Builder model(@NotNull ProductModel.Builder productModel) {
      putValue("model", productModel.build());
      return this;
    }
    /**
     * The model of the product. Use with the URL of a ProductModel or a textual representation of the model identifier. The URL of the ProductModel can be from an external source. It is recommended to additionally provide strong product identifiers via the gtin8/gtin13/gtin14 and mpn properties.
     */
    @NotNull public Builder model(@NotNull String model) {
      putValue("model", model);
      return this;
    }
    /**
     * The Manufacturer Part Number (MPN) of the product, or the product to which the offer refers.
     */
    @NotNull public Builder mpn(@NotNull String mpn) {
      putValue("mpn", mpn);
      return this;
    }
    /**
     * The manufacturer of the product.
     */
    @NotNull public Builder manufacturer(@NotNull Organization organization) {
      putValue("manufacturer", organization);
      return this;
    }
    /**
     * The manufacturer of the product.
     */
    @NotNull public Builder manufacturer(@NotNull Organization.Builder organization) {
      putValue("manufacturer", organization.build());
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
     * The product identifier, such as ISBN. For example: ``` meta itemprop=&quot;productID&quot; content=&quot;isbn:123-456-789&quot; ```.
     */
    @NotNull public Builder productID(@NotNull Identifier identifier) {
      putValue("productID", identifier);
      return this;
    }
    /**
     * The product identifier, such as ISBN. For example: ``` meta itemprop=&quot;productID&quot; content=&quot;isbn:123-456-789&quot; ```.
     */
    @NotNull public Builder productID(@NotNull String productID) {
      putValue("productID", productID);
      return this;
    }
    /**
     * The release date of a product or product model. This can be used to distinguish the exact variant of a product.
     */
    @NotNull public Builder releaseDate(@NotNull java.util.Date date) {
      putValue("releaseDate", date);
      return this;
    }
    /**
     * A review of the item.
     */
    @NotNull public Builder review(@NotNull Review review) {
      putValue("review", review);
      return this;
    }
    /**
     * A review of the item.
     */
    @NotNull public Builder review(@NotNull Review.Builder review) {
      putValue("review", review.build());
      return this;
    }
    /**
     * A slogan or motto associated with the item.
     */
    @NotNull public Builder slogan(@NotNull String slogan) {
      putValue("slogan", slogan);
      return this;
    }
    /**
     * The Stock Keeping Unit (SKU), i.e. a merchant-specific identifier for a product or service, or the product to which the offer refers.
     */
    @NotNull public Builder sku(@NotNull Identifier identifier) {
      putValue("sku", identifier);
      return this;
    }
    /**
     * The Stock Keeping Unit (SKU), i.e. a merchant-specific identifier for a product or service, or the product to which the offer refers.
     */
    @NotNull public Builder sku(@NotNull String sku) {
      putValue("sku", sku);
      return this;
    }
    /**
     * The weight of the product or person.
     */
    @NotNull public Builder weight(@NotNull QuantitativeValue quantitativeValue) {
      putValue("weight", quantitativeValue);
      return this;
    }
    /**
     * The weight of the product or person.
     */
    @NotNull public Builder weight(@NotNull QuantitativeValue.Builder quantitativeValue) {
      putValue("weight", quantitativeValue.build());
      return this;
    }
    /**
     * The width of the item.
     */
    @NotNull public Builder width(@NotNull Distance distance) {
      putValue("width", distance);
      return this;
    }
    /**
     * The width of the item.
     */
    @NotNull public Builder width(@NotNull Distance.Builder distance) {
      putValue("width", distance.build());
      return this;
    }
    /**
     * The width of the item.
     */
    @NotNull public Builder width(@NotNull QuantitativeValue quantitativeValue) {
      putValue("width", quantitativeValue);
      return this;
    }
    /**
     * The width of the item.
     */
    @NotNull public Builder width(@NotNull QuantitativeValue.Builder quantitativeValue) {
      putValue("width", quantitativeValue.build());
      return this;
    }
    /**
     * A property-value pair representing an additional characteristics of the entitity, e.g. a product feature or another characteristic for which there is no matching property in schema.org.\n\nNote: Publishers should be aware that applications designed to use specific schema.org properties (e.g. http://schema.org/width, http://schema.org/color, http://schema.org/gtin13, ...) will typically expect such data to be provided using those properties, rather than using the generic property/value mechanism.
     * 
     */
    @NotNull public Builder additionalProperty(@NotNull PropertyValue propertyValue) {
      putValue("additionalProperty", propertyValue);
      return this;
    }
    /**
     * A property-value pair representing an additional characteristics of the entitity, e.g. a product feature or another characteristic for which there is no matching property in schema.org.\n\nNote: Publishers should be aware that applications designed to use specific schema.org properties (e.g. http://schema.org/width, http://schema.org/color, http://schema.org/gtin13, ...) will typically expect such data to be provided using those properties, rather than using the generic property/value mechanism.
     * 
     */
    @NotNull public Builder additionalProperty(@NotNull PropertyValue.Builder propertyValue) {
      putValue("additionalProperty", propertyValue.build());
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
     * An alias for the item.
     */
    @NotNull public Builder alternateName(@NotNull String alternateName) {
      putValue("alternateName", alternateName);
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
     * The name of the item.
     */
    @NotNull public Builder name(@NotNull String name) {
      putValue("name", name);
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
      if ("numberOfDoors".equals(key) && value instanceof Number) { this.numberOfDoors((Number)value); return; }
      if ("numberOfDoorss".equals(key) && value instanceof Number) { this.numberOfDoors((Number)value); return; }
      if ("numberOfDoors".equals(key) && value instanceof QuantitativeValue) { this.numberOfDoors((QuantitativeValue)value); return; }
      if ("numberOfDoorss".equals(key) && value instanceof QuantitativeValue) { this.numberOfDoors((QuantitativeValue)value); return; }
      if ("numberOfAirbags".equals(key) && value instanceof Integer) { this.numberOfAirbags((Integer)value); return; }
      if ("numberOfAirbagss".equals(key) && value instanceof Integer) { this.numberOfAirbags((Integer)value); return; }
      if ("numberOfAirbags".equals(key) && value instanceof Long) { this.numberOfAirbags((Long)value); return; }
      if ("numberOfAirbagss".equals(key) && value instanceof Long) { this.numberOfAirbags((Long)value); return; }
      if ("numberOfAirbags".equals(key) && value instanceof Float) { this.numberOfAirbags((Float)value); return; }
      if ("numberOfAirbagss".equals(key) && value instanceof Float) { this.numberOfAirbags((Float)value); return; }
      if ("numberOfAirbags".equals(key) && value instanceof Double) { this.numberOfAirbags((Double)value); return; }
      if ("numberOfAirbagss".equals(key) && value instanceof Double) { this.numberOfAirbags((Double)value); return; }
      if ("numberOfAirbags".equals(key) && value instanceof String) { this.numberOfAirbags((String)value); return; }
      if ("numberOfAirbagss".equals(key) && value instanceof String) { this.numberOfAirbags((String)value); return; }
      if ("numberOfAxles".equals(key) && value instanceof Number) { this.numberOfAxles((Number)value); return; }
      if ("numberOfAxless".equals(key) && value instanceof Number) { this.numberOfAxles((Number)value); return; }
      if ("numberOfAxles".equals(key) && value instanceof QuantitativeValue) { this.numberOfAxles((QuantitativeValue)value); return; }
      if ("numberOfAxless".equals(key) && value instanceof QuantitativeValue) { this.numberOfAxles((QuantitativeValue)value); return; }
      if ("vehicleEngine".equals(key) && value instanceof EngineSpecification) { this.vehicleEngine((EngineSpecification)value); return; }
      if ("vehicleEngines".equals(key) && value instanceof EngineSpecification) { this.vehicleEngine((EngineSpecification)value); return; }
      if ("fuelConsumption".equals(key) && value instanceof QuantitativeValue) { this.fuelConsumption((QuantitativeValue)value); return; }
      if ("fuelConsumptions".equals(key) && value instanceof QuantitativeValue) { this.fuelConsumption((QuantitativeValue)value); return; }
      if ("fuelEfficiency".equals(key) && value instanceof QuantitativeValue) { this.fuelEfficiency((QuantitativeValue)value); return; }
      if ("fuelEfficiencys".equals(key) && value instanceof QuantitativeValue) { this.fuelEfficiency((QuantitativeValue)value); return; }
      if ("numberOfForwardGears".equals(key) && value instanceof Number) { this.numberOfForwardGears((Number)value); return; }
      if ("numberOfForwardGearss".equals(key) && value instanceof Number) { this.numberOfForwardGears((Number)value); return; }
      if ("numberOfForwardGears".equals(key) && value instanceof QuantitativeValue) { this.numberOfForwardGears((QuantitativeValue)value); return; }
      if ("numberOfForwardGearss".equals(key) && value instanceof QuantitativeValue) { this.numberOfForwardGears((QuantitativeValue)value); return; }
      if ("vehicleIdentificationNumber".equals(key) && value instanceof String) { this.vehicleIdentificationNumber((String)value); return; }
      if ("vehicleIdentificationNumbers".equals(key) && value instanceof String) { this.vehicleIdentificationNumber((String)value); return; }
      if ("cargoVolume".equals(key) && value instanceof QuantitativeValue) { this.cargoVolume((QuantitativeValue)value); return; }
      if ("cargoVolumes".equals(key) && value instanceof QuantitativeValue) { this.cargoVolume((QuantitativeValue)value); return; }
      if ("vehicleConfiguration".equals(key) && value instanceof String) { this.vehicleConfiguration((String)value); return; }
      if ("vehicleConfigurations".equals(key) && value instanceof String) { this.vehicleConfiguration((String)value); return; }
      if ("knownVehicleDamages".equals(key) && value instanceof String) { this.knownVehicleDamages((String)value); return; }
      if ("knownVehicleDamagess".equals(key) && value instanceof String) { this.knownVehicleDamages((String)value); return; }
      if ("dateVehicleFirstRegistered".equals(key) && value instanceof java.util.Date) { this.dateVehicleFirstRegistered((java.util.Date)value); return; }
      if ("dateVehicleFirstRegistereds".equals(key) && value instanceof java.util.Date) { this.dateVehicleFirstRegistered((java.util.Date)value); return; }
      if ("driveWheelConfiguration".equals(key) && value instanceof DriveWheelConfigurationValue) { this.driveWheelConfiguration((DriveWheelConfigurationValue)value); return; }
      if ("driveWheelConfigurations".equals(key) && value instanceof DriveWheelConfigurationValue) { this.driveWheelConfiguration((DriveWheelConfigurationValue)value); return; }
      if ("driveWheelConfiguration".equals(key) && value instanceof String) { this.driveWheelConfiguration((String)value); return; }
      if ("driveWheelConfigurations".equals(key) && value instanceof String) { this.driveWheelConfiguration((String)value); return; }
      if ("fuelType".equals(key) && value instanceof QualitativeValue) { this.fuelType((QualitativeValue)value); return; }
      if ("fuelTypes".equals(key) && value instanceof QualitativeValue) { this.fuelType((QualitativeValue)value); return; }
      if ("fuelType".equals(key) && value instanceof String) { this.fuelType((String)value); return; }
      if ("fuelTypes".equals(key) && value instanceof String) { this.fuelType((String)value); return; }
      if ("vehicleInteriorColor".equals(key) && value instanceof String) { this.vehicleInteriorColor((String)value); return; }
      if ("vehicleInteriorColors".equals(key) && value instanceof String) { this.vehicleInteriorColor((String)value); return; }
      if ("vehicleInteriorType".equals(key) && value instanceof String) { this.vehicleInteriorType((String)value); return; }
      if ("vehicleInteriorTypes".equals(key) && value instanceof String) { this.vehicleInteriorType((String)value); return; }
      if ("mileageFromOdometer".equals(key) && value instanceof QuantitativeValue) { this.mileageFromOdometer((QuantitativeValue)value); return; }
      if ("mileageFromOdometers".equals(key) && value instanceof QuantitativeValue) { this.mileageFromOdometer((QuantitativeValue)value); return; }
      if ("vehicleModelDate".equals(key) && value instanceof java.util.Date) { this.vehicleModelDate((java.util.Date)value); return; }
      if ("vehicleModelDates".equals(key) && value instanceof java.util.Date) { this.vehicleModelDate((java.util.Date)value); return; }
      if ("numberOfPreviousOwners".equals(key) && value instanceof Number) { this.numberOfPreviousOwners((Number)value); return; }
      if ("numberOfPreviousOwnerss".equals(key) && value instanceof Number) { this.numberOfPreviousOwners((Number)value); return; }
      if ("numberOfPreviousOwners".equals(key) && value instanceof QuantitativeValue) { this.numberOfPreviousOwners((QuantitativeValue)value); return; }
      if ("numberOfPreviousOwnerss".equals(key) && value instanceof QuantitativeValue) { this.numberOfPreviousOwners((QuantitativeValue)value); return; }
      if ("productionDate".equals(key) && value instanceof java.util.Date) { this.productionDate((java.util.Date)value); return; }
      if ("productionDates".equals(key) && value instanceof java.util.Date) { this.productionDate((java.util.Date)value); return; }
      if ("purchaseDate".equals(key) && value instanceof java.util.Date) { this.purchaseDate((java.util.Date)value); return; }
      if ("purchaseDates".equals(key) && value instanceof java.util.Date) { this.purchaseDate((java.util.Date)value); return; }
      if ("vehicleSeatingCapacity".equals(key) && value instanceof Number) { this.vehicleSeatingCapacity((Number)value); return; }
      if ("vehicleSeatingCapacitys".equals(key) && value instanceof Number) { this.vehicleSeatingCapacity((Number)value); return; }
      if ("vehicleSeatingCapacity".equals(key) && value instanceof QuantitativeValue) { this.vehicleSeatingCapacity((QuantitativeValue)value); return; }
      if ("vehicleSeatingCapacitys".equals(key) && value instanceof QuantitativeValue) { this.vehicleSeatingCapacity((QuantitativeValue)value); return; }
      if ("vehicleTransmission".equals(key) && value instanceof QualitativeValue) { this.vehicleTransmission((QualitativeValue)value); return; }
      if ("vehicleTransmissions".equals(key) && value instanceof QualitativeValue) { this.vehicleTransmission((QualitativeValue)value); return; }
      if ("vehicleTransmission".equals(key) && value instanceof String) { this.vehicleTransmission((String)value); return; }
      if ("vehicleTransmissions".equals(key) && value instanceof String) { this.vehicleTransmission((String)value); return; }
      if ("steeringPosition".equals(key) && value instanceof SteeringPositionValue) { this.steeringPosition((SteeringPositionValue)value); return; }
      if ("steeringPositions".equals(key) && value instanceof SteeringPositionValue) { this.steeringPosition((SteeringPositionValue)value); return; }
      if ("vehicleSpecialUsage".equals(key) && value instanceof String) { this.vehicleSpecialUsage((String)value); return; }
      if ("vehicleSpecialUsages".equals(key) && value instanceof String) { this.vehicleSpecialUsage((String)value); return; }
      super.fromMap(key, value);
    }
  }
  
}
