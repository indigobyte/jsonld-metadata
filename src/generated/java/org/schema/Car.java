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
 * A car is a wheeled, self-powered motor vehicle used for transportation.Source: http://www.w3.org/wiki/WebSchemas/SchemaDotOrgSources#Automotive_Ontology_Working_Group
 */
public class Car extends Vehicle {
  /**
   * The ACRISS Car Classification Code is a code used by many car rental companies, for classifying vehicles. ACRISS stands for Association of Car Rental Industry Systems and Standards.
   */
  @JsonIgnore public String getAcrissCode() {
    return (String) getValue("acrissCode");
  }
  /**
   * The ACRISS Car Classification Code is a code used by many car rental companies, for classifying vehicles. ACRISS stands for Association of Car Rental Industry Systems and Standards.
   */
  @JsonIgnore public Collection<String> getAcrissCodes() {
    final Object current = myData.get("acrissCode");
    if (current == null) return Collections.emptyList();
    if (current instanceof Collection) {
      return (Collection<String>) current;
    }
    return Arrays.asList((String) current);
  }
  /**
   * The permitted total weight of cargo and installations (e.g. a roof rack) on top of the vehicle.&lt;br/&gt;&lt;br/&gt;
   * 
   * Typical unit code(s): KGM for kilogram, LBR for pound&lt;br/&gt;&lt;br/&gt;
   * 
   * &lt;ul&gt;
   * &lt;li&gt;Note 1: You can indicate additional information in the &lt;a class=&quot;localLink&quot; href=&quot;http://schema.org/name&quot;&gt;name&lt;/a&gt; of the &lt;a class=&quot;localLink&quot; href=&quot;http://schema.org/QuantitativeValue&quot;&gt;QuantitativeValue&lt;/a&gt; node.&lt;/li&gt;
   * &lt;li&gt;Note 2: You may also link to a &lt;a class=&quot;localLink&quot; href=&quot;http://schema.org/QualitativeValue&quot;&gt;QualitativeValue&lt;/a&gt; node that provides additional information using &lt;a class=&quot;localLink&quot; href=&quot;http://schema.org/valueReference&quot;&gt;valueReference&lt;/a&gt;&lt;/li&gt;
   * &lt;li&gt;Note 3: Note that you can use &lt;a class=&quot;localLink&quot; href=&quot;http://schema.org/minValue&quot;&gt;minValue&lt;/a&gt; and &lt;a class=&quot;localLink&quot; href=&quot;http://schema.org/maxValue&quot;&gt;maxValue&lt;/a&gt; to indicate ranges.&lt;/li&gt;
   * &lt;/ul&gt;
   * 
   */
  @JsonIgnore public QuantitativeValue getRoofLoad() {
    return (QuantitativeValue) getValue("roofLoad");
  }
  /**
   * The permitted total weight of cargo and installations (e.g. a roof rack) on top of the vehicle.&lt;br/&gt;&lt;br/&gt;
   * 
   * Typical unit code(s): KGM for kilogram, LBR for pound&lt;br/&gt;&lt;br/&gt;
   * 
   * &lt;ul&gt;
   * &lt;li&gt;Note 1: You can indicate additional information in the &lt;a class=&quot;localLink&quot; href=&quot;http://schema.org/name&quot;&gt;name&lt;/a&gt; of the &lt;a class=&quot;localLink&quot; href=&quot;http://schema.org/QuantitativeValue&quot;&gt;QuantitativeValue&lt;/a&gt; node.&lt;/li&gt;
   * &lt;li&gt;Note 2: You may also link to a &lt;a class=&quot;localLink&quot; href=&quot;http://schema.org/QualitativeValue&quot;&gt;QualitativeValue&lt;/a&gt; node that provides additional information using &lt;a class=&quot;localLink&quot; href=&quot;http://schema.org/valueReference&quot;&gt;valueReference&lt;/a&gt;&lt;/li&gt;
   * &lt;li&gt;Note 3: Note that you can use &lt;a class=&quot;localLink&quot; href=&quot;http://schema.org/minValue&quot;&gt;minValue&lt;/a&gt; and &lt;a class=&quot;localLink&quot; href=&quot;http://schema.org/maxValue&quot;&gt;maxValue&lt;/a&gt; to indicate ranges.&lt;/li&gt;
   * &lt;/ul&gt;
   * 
   */
  @JsonIgnore public Collection<QuantitativeValue> getRoofLoads() {
    final Object current = myData.get("roofLoad");
    if (current == null) return Collections.emptyList();
    if (current instanceof Collection) {
      return (Collection<QuantitativeValue>) current;
    }
    return Arrays.asList((QuantitativeValue) current);
  }
  protected Car(java.util.Map<String,Object> data) {
    super(data);
  }
  
  /**
   * Builder for {@link Car}
   */
  public static class Builder extends Vehicle.Builder {
    public Builder(@NotNull HashMap<String,Object> data) {
      super(data);
    }
    @NotNull public Car build() {
      return new Car(myData);
    }
    /**
     * The ACRISS Car Classification Code is a code used by many car rental companies, for classifying vehicles. ACRISS stands for Association of Car Rental Industry Systems and Standards.
     */
    @NotNull public Builder acrissCode(@NotNull String acrissCode) {
      putValue("acrissCode", acrissCode);
      return this;
    }
    /**
     * The permitted total weight of cargo and installations (e.g. a roof rack) on top of the vehicle.&lt;br/&gt;&lt;br/&gt;
     * 
     * Typical unit code(s): KGM for kilogram, LBR for pound&lt;br/&gt;&lt;br/&gt;
     * 
     * &lt;ul&gt;
     * &lt;li&gt;Note 1: You can indicate additional information in the &lt;a class=&quot;localLink&quot; href=&quot;http://schema.org/name&quot;&gt;name&lt;/a&gt; of the &lt;a class=&quot;localLink&quot; href=&quot;http://schema.org/QuantitativeValue&quot;&gt;QuantitativeValue&lt;/a&gt; node.&lt;/li&gt;
     * &lt;li&gt;Note 2: You may also link to a &lt;a class=&quot;localLink&quot; href=&quot;http://schema.org/QualitativeValue&quot;&gt;QualitativeValue&lt;/a&gt; node that provides additional information using &lt;a class=&quot;localLink&quot; href=&quot;http://schema.org/valueReference&quot;&gt;valueReference&lt;/a&gt;&lt;/li&gt;
     * &lt;li&gt;Note 3: Note that you can use &lt;a class=&quot;localLink&quot; href=&quot;http://schema.org/minValue&quot;&gt;minValue&lt;/a&gt; and &lt;a class=&quot;localLink&quot; href=&quot;http://schema.org/maxValue&quot;&gt;maxValue&lt;/a&gt; to indicate ranges.&lt;/li&gt;
     * &lt;/ul&gt;
     * 
     */
    @NotNull public Builder roofLoad(@NotNull QuantitativeValue quantitativeValue) {
      putValue("roofLoad", quantitativeValue);
      return this;
    }
    /**
     * The permitted total weight of cargo and installations (e.g. a roof rack) on top of the vehicle.&lt;br/&gt;&lt;br/&gt;
     * 
     * Typical unit code(s): KGM for kilogram, LBR for pound&lt;br/&gt;&lt;br/&gt;
     * 
     * &lt;ul&gt;
     * &lt;li&gt;Note 1: You can indicate additional information in the &lt;a class=&quot;localLink&quot; href=&quot;http://schema.org/name&quot;&gt;name&lt;/a&gt; of the &lt;a class=&quot;localLink&quot; href=&quot;http://schema.org/QuantitativeValue&quot;&gt;QuantitativeValue&lt;/a&gt; node.&lt;/li&gt;
     * &lt;li&gt;Note 2: You may also link to a &lt;a class=&quot;localLink&quot; href=&quot;http://schema.org/QualitativeValue&quot;&gt;QualitativeValue&lt;/a&gt; node that provides additional information using &lt;a class=&quot;localLink&quot; href=&quot;http://schema.org/valueReference&quot;&gt;valueReference&lt;/a&gt;&lt;/li&gt;
     * &lt;li&gt;Note 3: Note that you can use &lt;a class=&quot;localLink&quot; href=&quot;http://schema.org/minValue&quot;&gt;minValue&lt;/a&gt; and &lt;a class=&quot;localLink&quot; href=&quot;http://schema.org/maxValue&quot;&gt;maxValue&lt;/a&gt; to indicate ranges.&lt;/li&gt;
     * &lt;/ul&gt;
     * 
     */
    @NotNull public Builder roofLoad(@NotNull QuantitativeValue.Builder quantitativeValue) {
      putValue("roofLoad", quantitativeValue.build());
      return this;
    }
    /**
     * The time needed to accelerate the vehicle from a given start velocity to a given target velocity.&lt;br/&gt;&lt;br/&gt;
     * 
     * Typical unit code(s): SEC for seconds&lt;br/&gt;&lt;br/&gt;
     * 
     * &lt;ul&gt;
     * &lt;li&gt;Note: There are unfortunately no standard unit codes for seconds/0..100 km/h or seconds/0..60 mph. Simply use &quot;SEC&quot; for seconds and indicate the velocities in the &lt;a class=&quot;localLink&quot; href=&quot;http://schema.org/name&quot;&gt;name&lt;/a&gt; of the &lt;a class=&quot;localLink&quot; href=&quot;http://schema.org/QuantitativeValue&quot;&gt;QuantitativeValue&lt;/a&gt;, or use &lt;a class=&quot;localLink&quot; href=&quot;http://schema.org/valueReference&quot;&gt;valueReference&lt;/a&gt; with a &lt;a class=&quot;localLink&quot; href=&quot;http://schema.org/QuantitativeValue&quot;&gt;QuantitativeValue&lt;/a&gt; of 0..60 mph or 0..100 km/h to specify the reference speeds.&lt;/li&gt;
     * &lt;/ul&gt;
     * 
     */
    @NotNull public Builder accelerationTime(@NotNull QuantitativeValue quantitativeValue) {
      putValue("accelerationTime", quantitativeValue);
      return this;
    }
    /**
     * The time needed to accelerate the vehicle from a given start velocity to a given target velocity.&lt;br/&gt;&lt;br/&gt;
     * 
     * Typical unit code(s): SEC for seconds&lt;br/&gt;&lt;br/&gt;
     * 
     * &lt;ul&gt;
     * &lt;li&gt;Note: There are unfortunately no standard unit codes for seconds/0..100 km/h or seconds/0..60 mph. Simply use &quot;SEC&quot; for seconds and indicate the velocities in the &lt;a class=&quot;localLink&quot; href=&quot;http://schema.org/name&quot;&gt;name&lt;/a&gt; of the &lt;a class=&quot;localLink&quot; href=&quot;http://schema.org/QuantitativeValue&quot;&gt;QuantitativeValue&lt;/a&gt;, or use &lt;a class=&quot;localLink&quot; href=&quot;http://schema.org/valueReference&quot;&gt;valueReference&lt;/a&gt; with a &lt;a class=&quot;localLink&quot; href=&quot;http://schema.org/QuantitativeValue&quot;&gt;QuantitativeValue&lt;/a&gt; of 0..60 mph or 0..100 km/h to specify the reference speeds.&lt;/li&gt;
     * &lt;/ul&gt;
     * 
     */
    @NotNull public Builder accelerationTime(@NotNull QuantitativeValue.Builder quantitativeValue) {
      putValue("accelerationTime", quantitativeValue.build());
      return this;
    }
    /**
     * The available volume for cargo or luggage. For automobiles, this is usually the trunk volume.&lt;br/&gt;&lt;br/&gt;
     * 
     * Typical unit code(s): LTR for liters, FTQ for cubic foot/feet&lt;br/&gt;&lt;br/&gt;
     * 
     * Note: You can use &lt;a class=&quot;localLink&quot; href=&quot;http://schema.org/minValue&quot;&gt;minValue&lt;/a&gt; and &lt;a class=&quot;localLink&quot; href=&quot;http://schema.org/maxValue&quot;&gt;maxValue&lt;/a&gt; to indicate ranges.
     */
    @NotNull public Builder cargoVolume(@NotNull QuantitativeValue quantitativeValue) {
      putValue("cargoVolume", quantitativeValue);
      return this;
    }
    /**
     * The available volume for cargo or luggage. For automobiles, this is usually the trunk volume.&lt;br/&gt;&lt;br/&gt;
     * 
     * Typical unit code(s): LTR for liters, FTQ for cubic foot/feet&lt;br/&gt;&lt;br/&gt;
     * 
     * Note: You can use &lt;a class=&quot;localLink&quot; href=&quot;http://schema.org/minValue&quot;&gt;minValue&lt;/a&gt; and &lt;a class=&quot;localLink&quot; href=&quot;http://schema.org/maxValue&quot;&gt;maxValue&lt;/a&gt; to indicate ranges.
     */
    @NotNull public Builder cargoVolume(@NotNull QuantitativeValue.Builder quantitativeValue) {
      putValue("cargoVolume", quantitativeValue.build());
      return this;
    }
    /**
     * Indicates the design and body style of the vehicle (e.g. station wagon, hatchback, etc.).
     */
    @NotNull public Builder bodyType(@NotNull QualitativeValue qualitativeValue) {
      putValue("bodyType", qualitativeValue);
      return this;
    }
    /**
     * Indicates the design and body style of the vehicle (e.g. station wagon, hatchback, etc.).
     */
    @NotNull public Builder bodyType(@NotNull QualitativeValue.Builder qualitativeValue) {
      putValue("bodyType", qualitativeValue.build());
      return this;
    }
    /**
     * Indicates the design and body style of the vehicle (e.g. station wagon, hatchback, etc.).
     */
    @NotNull public Builder bodyType(@NotNull String bodyType) {
      putValue("bodyType", bodyType);
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
     * The amount of fuel consumed for traveling a particular distance or temporal duration with the given vehicle (e.g. liters per 100 km).&lt;br/&gt;&lt;br/&gt;
     * 
     * &lt;ul&gt;
     * &lt;li&gt;Note 1: There are unfortunately no standard unit codes for liters per 100 km.  Use &lt;a class=&quot;localLink&quot; href=&quot;http://schema.org/unitText&quot;&gt;unitText&lt;/a&gt; to indicate the unit of measurement, e.g. L/100 km.&lt;/li&gt;
     * &lt;li&gt;Note 2: There are two ways of indicating the fuel consumption, &lt;a class=&quot;localLink&quot; href=&quot;http://schema.org/fuelConsumption&quot;&gt;fuelConsumption&lt;/a&gt; (e.g. 8 liters per 100 km) and &lt;a class=&quot;localLink&quot; href=&quot;http://schema.org/fuelEfficiency&quot;&gt;fuelEfficiency&lt;/a&gt; (e.g. 30 miles per gallon). They are reciprocal.&lt;/li&gt;
     * &lt;li&gt;Note 3: Often, the absolute value is useful only when related to driving speed (&quot;at 80 km/h&quot;) or usage pattern (&quot;city traffic&quot;). You can use &lt;a class=&quot;localLink&quot; href=&quot;http://schema.org/valueReference&quot;&gt;valueReference&lt;/a&gt; to link the value for the fuel consumption to another value.&lt;/li&gt;
     * &lt;/ul&gt;
     * 
     */
    @NotNull public Builder fuelConsumption(@NotNull QuantitativeValue quantitativeValue) {
      putValue("fuelConsumption", quantitativeValue);
      return this;
    }
    /**
     * The amount of fuel consumed for traveling a particular distance or temporal duration with the given vehicle (e.g. liters per 100 km).&lt;br/&gt;&lt;br/&gt;
     * 
     * &lt;ul&gt;
     * &lt;li&gt;Note 1: There are unfortunately no standard unit codes for liters per 100 km.  Use &lt;a class=&quot;localLink&quot; href=&quot;http://schema.org/unitText&quot;&gt;unitText&lt;/a&gt; to indicate the unit of measurement, e.g. L/100 km.&lt;/li&gt;
     * &lt;li&gt;Note 2: There are two ways of indicating the fuel consumption, &lt;a class=&quot;localLink&quot; href=&quot;http://schema.org/fuelConsumption&quot;&gt;fuelConsumption&lt;/a&gt; (e.g. 8 liters per 100 km) and &lt;a class=&quot;localLink&quot; href=&quot;http://schema.org/fuelEfficiency&quot;&gt;fuelEfficiency&lt;/a&gt; (e.g. 30 miles per gallon). They are reciprocal.&lt;/li&gt;
     * &lt;li&gt;Note 3: Often, the absolute value is useful only when related to driving speed (&quot;at 80 km/h&quot;) or usage pattern (&quot;city traffic&quot;). You can use &lt;a class=&quot;localLink&quot; href=&quot;http://schema.org/valueReference&quot;&gt;valueReference&lt;/a&gt; to link the value for the fuel consumption to another value.&lt;/li&gt;
     * &lt;/ul&gt;
     * 
     */
    @NotNull public Builder fuelConsumption(@NotNull QuantitativeValue.Builder quantitativeValue) {
      putValue("fuelConsumption", quantitativeValue.build());
      return this;
    }
    /**
     * The CO2 emissions in g/km. When used in combination with a QuantitativeValue, put &quot;g/km&quot; into the unitText property of that value, since there is no UN/CEFACT Common Code for &quot;g/km&quot;.
     */
    @NotNull public Builder emissionsCO2(@NotNull Integer integer) {
      putValue("emissionsCO2", integer);
      return this;
    }
    /**
     * The CO2 emissions in g/km. When used in combination with a QuantitativeValue, put &quot;g/km&quot; into the unitText property of that value, since there is no UN/CEFACT Common Code for &quot;g/km&quot;.
     */
    @NotNull public Builder emissionsCO2(@NotNull Long emissionsCO2) {
      putValue("emissionsCO2", emissionsCO2);
      return this;
    }
    /**
     * The CO2 emissions in g/km. When used in combination with a QuantitativeValue, put &quot;g/km&quot; into the unitText property of that value, since there is no UN/CEFACT Common Code for &quot;g/km&quot;.
     */
    @NotNull public Builder emissionsCO2(@NotNull Float emissionsCO2) {
      putValue("emissionsCO2", emissionsCO2);
      return this;
    }
    /**
     * The CO2 emissions in g/km. When used in combination with a QuantitativeValue, put &quot;g/km&quot; into the unitText property of that value, since there is no UN/CEFACT Common Code for &quot;g/km&quot;.
     */
    @NotNull public Builder emissionsCO2(@NotNull Double emissionsCO2) {
      putValue("emissionsCO2", emissionsCO2);
      return this;
    }
    /**
     * The CO2 emissions in g/km. When used in combination with a QuantitativeValue, put &quot;g/km&quot; into the unitText property of that value, since there is no UN/CEFACT Common Code for &quot;g/km&quot;.
     */
    @NotNull public Builder emissionsCO2(@NotNull String emissionsCO2) {
      putValue("emissionsCO2", emissionsCO2);
      return this;
    }
    /**
     * The total distance travelled by the particular vehicle since its initial production, as read from its odometer.&lt;br/&gt;&lt;br/&gt;
     * 
     * Typical unit code(s): KMT for kilometers, SMI for statute miles
     */
    @NotNull public Builder mileageFromOdometer(@NotNull QuantitativeValue quantitativeValue) {
      putValue("mileageFromOdometer", quantitativeValue);
      return this;
    }
    /**
     * The total distance travelled by the particular vehicle since its initial production, as read from its odometer.&lt;br/&gt;&lt;br/&gt;
     * 
     * Typical unit code(s): KMT for kilometers, SMI for statute miles
     */
    @NotNull public Builder mileageFromOdometer(@NotNull QuantitativeValue.Builder quantitativeValue) {
      putValue("mileageFromOdometer", quantitativeValue.build());
      return this;
    }
    /**
     * The permitted total weight of the loaded vehicle, including passengers and cargo and the weight of the empty vehicle.&lt;br/&gt;&lt;br/&gt;
     * 
     * Typical unit code(s): KGM for kilogram, LBR for pound&lt;br/&gt;&lt;br/&gt;
     * 
     * &lt;ul&gt;
     * &lt;li&gt;Note 1: You can indicate additional information in the &lt;a class=&quot;localLink&quot; href=&quot;http://schema.org/name&quot;&gt;name&lt;/a&gt; of the &lt;a class=&quot;localLink&quot; href=&quot;http://schema.org/QuantitativeValue&quot;&gt;QuantitativeValue&lt;/a&gt; node.&lt;/li&gt;
     * &lt;li&gt;Note 2: You may also link to a &lt;a class=&quot;localLink&quot; href=&quot;http://schema.org/QualitativeValue&quot;&gt;QualitativeValue&lt;/a&gt; node that provides additional information using &lt;a class=&quot;localLink&quot; href=&quot;http://schema.org/valueReference&quot;&gt;valueReference&lt;/a&gt;.&lt;/li&gt;
     * &lt;li&gt;Note 3: Note that you can use &lt;a class=&quot;localLink&quot; href=&quot;http://schema.org/minValue&quot;&gt;minValue&lt;/a&gt; and &lt;a class=&quot;localLink&quot; href=&quot;http://schema.org/maxValue&quot;&gt;maxValue&lt;/a&gt; to indicate ranges.&lt;/li&gt;
     * &lt;/ul&gt;
     * 
     */
    @NotNull public Builder weightTotal(@NotNull QuantitativeValue quantitativeValue) {
      putValue("weightTotal", quantitativeValue);
      return this;
    }
    /**
     * The permitted total weight of the loaded vehicle, including passengers and cargo and the weight of the empty vehicle.&lt;br/&gt;&lt;br/&gt;
     * 
     * Typical unit code(s): KGM for kilogram, LBR for pound&lt;br/&gt;&lt;br/&gt;
     * 
     * &lt;ul&gt;
     * &lt;li&gt;Note 1: You can indicate additional information in the &lt;a class=&quot;localLink&quot; href=&quot;http://schema.org/name&quot;&gt;name&lt;/a&gt; of the &lt;a class=&quot;localLink&quot; href=&quot;http://schema.org/QuantitativeValue&quot;&gt;QuantitativeValue&lt;/a&gt; node.&lt;/li&gt;
     * &lt;li&gt;Note 2: You may also link to a &lt;a class=&quot;localLink&quot; href=&quot;http://schema.org/QualitativeValue&quot;&gt;QualitativeValue&lt;/a&gt; node that provides additional information using &lt;a class=&quot;localLink&quot; href=&quot;http://schema.org/valueReference&quot;&gt;valueReference&lt;/a&gt;.&lt;/li&gt;
     * &lt;li&gt;Note 3: Note that you can use &lt;a class=&quot;localLink&quot; href=&quot;http://schema.org/minValue&quot;&gt;minValue&lt;/a&gt; and &lt;a class=&quot;localLink&quot; href=&quot;http://schema.org/maxValue&quot;&gt;maxValue&lt;/a&gt; to indicate ranges.&lt;/li&gt;
     * &lt;/ul&gt;
     * 
     */
    @NotNull public Builder weightTotal(@NotNull QuantitativeValue.Builder quantitativeValue) {
      putValue("weightTotal", quantitativeValue.build());
      return this;
    }
    /**
     * The total number of forward gears available for the transmission system of the vehicle.&lt;br/&gt;&lt;br/&gt;
     * 
     * Typical unit code(s): C62
     */
    @NotNull public Builder numberOfForwardGears(@NotNull Integer integer) {
      putValue("numberOfForwardGears", integer);
      return this;
    }
    /**
     * The total number of forward gears available for the transmission system of the vehicle.&lt;br/&gt;&lt;br/&gt;
     * 
     * Typical unit code(s): C62
     */
    @NotNull public Builder numberOfForwardGears(@NotNull Long numberOfForwardGears) {
      putValue("numberOfForwardGears", numberOfForwardGears);
      return this;
    }
    /**
     * The total number of forward gears available for the transmission system of the vehicle.&lt;br/&gt;&lt;br/&gt;
     * 
     * Typical unit code(s): C62
     */
    @NotNull public Builder numberOfForwardGears(@NotNull Float numberOfForwardGears) {
      putValue("numberOfForwardGears", numberOfForwardGears);
      return this;
    }
    /**
     * The total number of forward gears available for the transmission system of the vehicle.&lt;br/&gt;&lt;br/&gt;
     * 
     * Typical unit code(s): C62
     */
    @NotNull public Builder numberOfForwardGears(@NotNull Double numberOfForwardGears) {
      putValue("numberOfForwardGears", numberOfForwardGears);
      return this;
    }
    /**
     * The total number of forward gears available for the transmission system of the vehicle.&lt;br/&gt;&lt;br/&gt;
     * 
     * Typical unit code(s): C62
     */
    @NotNull public Builder numberOfForwardGears(@NotNull String numberOfForwardGears) {
      putValue("numberOfForwardGears", numberOfForwardGears);
      return this;
    }
    /**
     * The number of doors.&lt;br/&gt;&lt;br/&gt;
     * 
     * Typical unit code(s): C62
     */
    @NotNull public Builder numberOfDoors(@NotNull Integer integer) {
      putValue("numberOfDoors", integer);
      return this;
    }
    /**
     * The number of doors.&lt;br/&gt;&lt;br/&gt;
     * 
     * Typical unit code(s): C62
     */
    @NotNull public Builder numberOfDoors(@NotNull Long numberOfDoors) {
      putValue("numberOfDoors", numberOfDoors);
      return this;
    }
    /**
     * The number of doors.&lt;br/&gt;&lt;br/&gt;
     * 
     * Typical unit code(s): C62
     */
    @NotNull public Builder numberOfDoors(@NotNull Float numberOfDoors) {
      putValue("numberOfDoors", numberOfDoors);
      return this;
    }
    /**
     * The number of doors.&lt;br/&gt;&lt;br/&gt;
     * 
     * Typical unit code(s): C62
     */
    @NotNull public Builder numberOfDoors(@NotNull Double numberOfDoors) {
      putValue("numberOfDoors", numberOfDoors);
      return this;
    }
    /**
     * The number of doors.&lt;br/&gt;&lt;br/&gt;
     * 
     * Typical unit code(s): C62
     */
    @NotNull public Builder numberOfDoors(@NotNull String numberOfDoors) {
      putValue("numberOfDoors", numberOfDoors);
      return this;
    }
    /**
     * Indicates that the vehicle meets the respective emission standard.
     */
    @NotNull public Builder meetsEmissionStandard(@NotNull QualitativeValue qualitativeValue) {
      putValue("meetsEmissionStandard", qualitativeValue);
      return this;
    }
    /**
     * Indicates that the vehicle meets the respective emission standard.
     */
    @NotNull public Builder meetsEmissionStandard(@NotNull QualitativeValue.Builder qualitativeValue) {
      putValue("meetsEmissionStandard", qualitativeValue.build());
      return this;
    }
    /**
     * Indicates that the vehicle meets the respective emission standard.
     */
    @NotNull public Builder meetsEmissionStandard(@NotNull String meetsEmissionStandard) {
      putValue("meetsEmissionStandard", meetsEmissionStandard);
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
     * The Vehicle Identification Number (VIN) is a unique serial number used by the automotive industry to identify individual motor vehicles.
     */
    @NotNull public Builder vehicleIdentificationNumber(@NotNull String vehicleIdentificationNumber) {
      putValue("vehicleIdentificationNumber", vehicleIdentificationNumber);
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
     * This is a StupidProperty! - for testing only
     */
    @NotNull public Builder stupidProperty(@NotNull QuantitativeValue quantitativeValue) {
      putValue("stupidProperty", quantitativeValue);
      return this;
    }
    /**
     * This is a StupidProperty! - for testing only
     */
    @NotNull public Builder stupidProperty(@NotNull QuantitativeValue.Builder quantitativeValue) {
      putValue("stupidProperty", quantitativeValue.build());
      return this;
    }
    /**
     * The distance traveled per unit of fuel used; most commonly miles per gallon (mpg) or kilometers per liter (km/L).&lt;br/&gt;&lt;br/&gt;
     * 
     * &lt;ul&gt;
     * &lt;li&gt;Note 1: There are unfortunately no standard unit codes for miles per gallon or kilometers per liter. Use &lt;a class=&quot;localLink&quot; href=&quot;http://schema.org/unitText&quot;&gt;unitText&lt;/a&gt; to indicate the unit of measurement, e.g. mpg or km/L.&lt;/li&gt;
     * &lt;li&gt;Note 2: There are two ways of indicating the fuel consumption, &lt;a class=&quot;localLink&quot; href=&quot;http://schema.org/fuelConsumption&quot;&gt;fuelConsumption&lt;/a&gt; (e.g. 8 liters per 100 km) and &lt;a class=&quot;localLink&quot; href=&quot;http://schema.org/fuelEfficiency&quot;&gt;fuelEfficiency&lt;/a&gt; (e.g. 30 miles per gallon). They are reciprocal.&lt;/li&gt;
     * &lt;li&gt;Note 3: Often, the absolute value is useful only when related to driving speed (&quot;at 80 km/h&quot;) or usage pattern (&quot;city traffic&quot;). You can use &lt;a class=&quot;localLink&quot; href=&quot;http://schema.org/valueReference&quot;&gt;valueReference&lt;/a&gt; to link the value for the fuel economy to another value.&lt;/li&gt;
     * &lt;/ul&gt;
     * 
     */
    @NotNull public Builder fuelEfficiency(@NotNull QuantitativeValue quantitativeValue) {
      putValue("fuelEfficiency", quantitativeValue);
      return this;
    }
    /**
     * The distance traveled per unit of fuel used; most commonly miles per gallon (mpg) or kilometers per liter (km/L).&lt;br/&gt;&lt;br/&gt;
     * 
     * &lt;ul&gt;
     * &lt;li&gt;Note 1: There are unfortunately no standard unit codes for miles per gallon or kilometers per liter. Use &lt;a class=&quot;localLink&quot; href=&quot;http://schema.org/unitText&quot;&gt;unitText&lt;/a&gt; to indicate the unit of measurement, e.g. mpg or km/L.&lt;/li&gt;
     * &lt;li&gt;Note 2: There are two ways of indicating the fuel consumption, &lt;a class=&quot;localLink&quot; href=&quot;http://schema.org/fuelConsumption&quot;&gt;fuelConsumption&lt;/a&gt; (e.g. 8 liters per 100 km) and &lt;a class=&quot;localLink&quot; href=&quot;http://schema.org/fuelEfficiency&quot;&gt;fuelEfficiency&lt;/a&gt; (e.g. 30 miles per gallon). They are reciprocal.&lt;/li&gt;
     * &lt;li&gt;Note 3: Often, the absolute value is useful only when related to driving speed (&quot;at 80 km/h&quot;) or usage pattern (&quot;city traffic&quot;). You can use &lt;a class=&quot;localLink&quot; href=&quot;http://schema.org/valueReference&quot;&gt;valueReference&lt;/a&gt; to link the value for the fuel economy to another value.&lt;/li&gt;
     * &lt;/ul&gt;
     * 
     */
    @NotNull public Builder fuelEfficiency(@NotNull QuantitativeValue.Builder quantitativeValue) {
      putValue("fuelEfficiency", quantitativeValue.build());
      return this;
    }
    /**
     * A &lt;a href=&quot;https://en.wikipedia.org/wiki/Call_sign&quot;&gt;callsign&lt;/a&gt;, as used in broadcasting and radio communications to identify people, radio and TV stations, or vehicles.
     */
    @NotNull public Builder callSign(@NotNull Identifier identifier) {
      putValue("callSign", identifier);
      return this;
    }
    /**
     * The speed range of the vehicle. If the vehicle is powered by an engine, the upper limit of the speed range (indicated by &lt;a class=&quot;localLink&quot; href=&quot;http://schema.org/maxValue&quot;&gt;maxValue&lt;/a&gt; should be the maximum speed achievable under regular conditions.&lt;br/&gt;&lt;br/&gt;
     * 
     * Typical unit code(s): KMH for km/h, HM for mile per hour (0.447 04 m/s), KNT for knot&lt;br/&gt;&lt;br/&gt;
     * 
     * *Note 1: Use &lt;a class=&quot;localLink&quot; href=&quot;http://schema.org/minValue&quot;&gt;minValue&lt;/a&gt; and &lt;a class=&quot;localLink&quot; href=&quot;http://schema.org/maxValue&quot;&gt;maxValue&lt;/a&gt; to indicate the range. Typically, the minimal value is zero.
     * * Note 2: There are many different ways of measuring the speed range. You can link to information about how the given value has been determined using the &lt;a class=&quot;localLink&quot; href=&quot;http://schema.org/valueReference&quot;&gt;valueReference&lt;/a&gt; property.
     */
    @NotNull public Builder speed(@NotNull QuantitativeValue quantitativeValue) {
      putValue("speed", quantitativeValue);
      return this;
    }
    /**
     * The speed range of the vehicle. If the vehicle is powered by an engine, the upper limit of the speed range (indicated by &lt;a class=&quot;localLink&quot; href=&quot;http://schema.org/maxValue&quot;&gt;maxValue&lt;/a&gt; should be the maximum speed achievable under regular conditions.&lt;br/&gt;&lt;br/&gt;
     * 
     * Typical unit code(s): KMH for km/h, HM for mile per hour (0.447 04 m/s), KNT for knot&lt;br/&gt;&lt;br/&gt;
     * 
     * *Note 1: Use &lt;a class=&quot;localLink&quot; href=&quot;http://schema.org/minValue&quot;&gt;minValue&lt;/a&gt; and &lt;a class=&quot;localLink&quot; href=&quot;http://schema.org/maxValue&quot;&gt;maxValue&lt;/a&gt; to indicate the range. Typically, the minimal value is zero.
     * * Note 2: There are many different ways of measuring the speed range. You can link to information about how the given value has been determined using the &lt;a class=&quot;localLink&quot; href=&quot;http://schema.org/valueReference&quot;&gt;valueReference&lt;/a&gt; property.
     */
    @NotNull public Builder speed(@NotNull QuantitativeValue.Builder quantitativeValue) {
      putValue("speed", quantitativeValue.build());
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
     * The color or color combination of the interior of the vehicle.
     */
    @NotNull public Builder vehicleInteriorColor(@NotNull String vehicleInteriorColor) {
      putValue("vehicleInteriorColor", vehicleInteriorColor);
      return this;
    }
    /**
     * The number of axles.&lt;br/&gt;&lt;br/&gt;
     * 
     * Typical unit code(s): C62
     */
    @NotNull public Builder numberOfAxles(@NotNull Number number) {
      putValue("numberOfAxles", number);
      return this;
    }
    /**
     * The number of axles.&lt;br/&gt;&lt;br/&gt;
     * 
     * Typical unit code(s): C62
     */
    @NotNull public Builder numberOfAxles(@NotNull QuantitativeValue quantitativeValue) {
      putValue("numberOfAxles", quantitativeValue);
      return this;
    }
    /**
     * The number of axles.&lt;br/&gt;&lt;br/&gt;
     * 
     * Typical unit code(s): C62
     */
    @NotNull public Builder numberOfAxles(@NotNull QuantitativeValue.Builder quantitativeValue) {
      putValue("numberOfAxles", quantitativeValue.build());
      return this;
    }
    /**
     * Indicates whether the vehicle has been used for special purposes, like commercial rental, driving school, or as a taxi. The legislation in many countries requires this information to be revealed when offering a car for sale.
     */
    @NotNull public Builder vehicleSpecialUsage(@NotNull CarUsageType carUsageType) {
      putValue("vehicleSpecialUsage", carUsageType);
      return this;
    }
    /**
     * Indicates whether the vehicle has been used for special purposes, like commercial rental, driving school, or as a taxi. The legislation in many countries requires this information to be revealed when offering a car for sale.
     */
    @NotNull public Builder vehicleSpecialUsage(@NotNull CarUsageType.Builder carUsageType) {
      putValue("vehicleSpecialUsage", carUsageType.build());
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
     * The number of owners of the vehicle, including the current one.&lt;br/&gt;&lt;br/&gt;
     * 
     * Typical unit code(s): C62
     */
    @NotNull public Builder numberOfPreviousOwners(@NotNull Number number) {
      putValue("numberOfPreviousOwners", number);
      return this;
    }
    /**
     * The number of owners of the vehicle, including the current one.&lt;br/&gt;&lt;br/&gt;
     * 
     * Typical unit code(s): C62
     */
    @NotNull public Builder numberOfPreviousOwners(@NotNull QuantitativeValue quantitativeValue) {
      putValue("numberOfPreviousOwners", quantitativeValue);
      return this;
    }
    /**
     * The number of owners of the vehicle, including the current one.&lt;br/&gt;&lt;br/&gt;
     * 
     * Typical unit code(s): C62
     */
    @NotNull public Builder numberOfPreviousOwners(@NotNull QuantitativeValue.Builder quantitativeValue) {
      putValue("numberOfPreviousOwners", quantitativeValue.build());
      return this;
    }
    /**
     * The permitted weight of passengers and cargo, EXCLUDING the weight of the empty vehicle.&lt;br/&gt;&lt;br/&gt;
     * 
     * Typical unit code(s): KGM for kilogram, LBR for pound&lt;br/&gt;&lt;br/&gt;
     * 
     * &lt;ul&gt;
     * &lt;li&gt;Note 1: Many databases specify the permitted TOTAL weight instead, which is the sum of &lt;a class=&quot;localLink&quot; href=&quot;http://schema.org/weight&quot;&gt;weight&lt;/a&gt; and &lt;a class=&quot;localLink&quot; href=&quot;http://schema.org/payload&quot;&gt;payload&lt;/a&gt;&lt;/li&gt;
     * &lt;li&gt;Note 2: You can indicate additional information in the &lt;a class=&quot;localLink&quot; href=&quot;http://schema.org/name&quot;&gt;name&lt;/a&gt; of the &lt;a class=&quot;localLink&quot; href=&quot;http://schema.org/QuantitativeValue&quot;&gt;QuantitativeValue&lt;/a&gt; node.&lt;/li&gt;
     * &lt;li&gt;Note 3: You may also link to a &lt;a class=&quot;localLink&quot; href=&quot;http://schema.org/QualitativeValue&quot;&gt;QualitativeValue&lt;/a&gt; node that provides additional information using &lt;a class=&quot;localLink&quot; href=&quot;http://schema.org/valueReference&quot;&gt;valueReference&lt;/a&gt;.&lt;/li&gt;
     * &lt;li&gt;Note 4: Note that you can use &lt;a class=&quot;localLink&quot; href=&quot;http://schema.org/minValue&quot;&gt;minValue&lt;/a&gt; and &lt;a class=&quot;localLink&quot; href=&quot;http://schema.org/maxValue&quot;&gt;maxValue&lt;/a&gt; to indicate ranges.&lt;/li&gt;
     * &lt;/ul&gt;
     * 
     */
    @NotNull public Builder payload(@NotNull QuantitativeValue quantitativeValue) {
      putValue("payload", quantitativeValue);
      return this;
    }
    /**
     * The permitted weight of passengers and cargo, EXCLUDING the weight of the empty vehicle.&lt;br/&gt;&lt;br/&gt;
     * 
     * Typical unit code(s): KGM for kilogram, LBR for pound&lt;br/&gt;&lt;br/&gt;
     * 
     * &lt;ul&gt;
     * &lt;li&gt;Note 1: Many databases specify the permitted TOTAL weight instead, which is the sum of &lt;a class=&quot;localLink&quot; href=&quot;http://schema.org/weight&quot;&gt;weight&lt;/a&gt; and &lt;a class=&quot;localLink&quot; href=&quot;http://schema.org/payload&quot;&gt;payload&lt;/a&gt;&lt;/li&gt;
     * &lt;li&gt;Note 2: You can indicate additional information in the &lt;a class=&quot;localLink&quot; href=&quot;http://schema.org/name&quot;&gt;name&lt;/a&gt; of the &lt;a class=&quot;localLink&quot; href=&quot;http://schema.org/QuantitativeValue&quot;&gt;QuantitativeValue&lt;/a&gt; node.&lt;/li&gt;
     * &lt;li&gt;Note 3: You may also link to a &lt;a class=&quot;localLink&quot; href=&quot;http://schema.org/QualitativeValue&quot;&gt;QualitativeValue&lt;/a&gt; node that provides additional information using &lt;a class=&quot;localLink&quot; href=&quot;http://schema.org/valueReference&quot;&gt;valueReference&lt;/a&gt;.&lt;/li&gt;
     * &lt;li&gt;Note 4: Note that you can use &lt;a class=&quot;localLink&quot; href=&quot;http://schema.org/minValue&quot;&gt;minValue&lt;/a&gt; and &lt;a class=&quot;localLink&quot; href=&quot;http://schema.org/maxValue&quot;&gt;maxValue&lt;/a&gt; to indicate ranges.&lt;/li&gt;
     * &lt;/ul&gt;
     * 
     */
    @NotNull public Builder payload(@NotNull QuantitativeValue.Builder quantitativeValue) {
      putValue("payload", quantitativeValue.build());
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
     * The date of the first registration of the vehicle with the respective public authorities.
     */
    @NotNull public Builder dateVehicleFirstRegistered(@NotNull java.util.Date date) {
      putValue("dateVehicleFirstRegistered", date);
      return this;
    }
    /**
     * The number of persons that can be seated (e.g. in a vehicle), both in terms of the physical space available, and in terms of limitations set by law.&lt;br/&gt;&lt;br/&gt;
     * 
     * Typical unit code(s): C62 for persons
     */
    @NotNull public Builder seatingCapacity(@NotNull Integer integer) {
      putValue("seatingCapacity", integer);
      return this;
    }
    /**
     * The number of persons that can be seated (e.g. in a vehicle), both in terms of the physical space available, and in terms of limitations set by law.&lt;br/&gt;&lt;br/&gt;
     * 
     * Typical unit code(s): C62 for persons
     */
    @NotNull public Builder seatingCapacity(@NotNull Long seatingCapacity) {
      putValue("seatingCapacity", seatingCapacity);
      return this;
    }
    /**
     * The number of persons that can be seated (e.g. in a vehicle), both in terms of the physical space available, and in terms of limitations set by law.&lt;br/&gt;&lt;br/&gt;
     * 
     * Typical unit code(s): C62 for persons
     */
    @NotNull public Builder seatingCapacity(@NotNull Float seatingCapacity) {
      putValue("seatingCapacity", seatingCapacity);
      return this;
    }
    /**
     * The number of persons that can be seated (e.g. in a vehicle), both in terms of the physical space available, and in terms of limitations set by law.&lt;br/&gt;&lt;br/&gt;
     * 
     * Typical unit code(s): C62 for persons
     */
    @NotNull public Builder seatingCapacity(@NotNull Double seatingCapacity) {
      putValue("seatingCapacity", seatingCapacity);
      return this;
    }
    /**
     * The number of persons that can be seated (e.g. in a vehicle), both in terms of the physical space available, and in terms of limitations set by law.&lt;br/&gt;&lt;br/&gt;
     * 
     * Typical unit code(s): C62 for persons
     */
    @NotNull public Builder seatingCapacity(@NotNull String seatingCapacity) {
      putValue("seatingCapacity", seatingCapacity);
      return this;
    }
    /**
     * The capacity of the fuel tank or in the case of electric cars, the battery. If there are multiple components for storage, this should indicate the total of all storage of the same type.&lt;br/&gt;&lt;br/&gt;
     * 
     * Typical unit code(s): LTR for liters, GLL of US gallons, GLI for UK / imperial gallons, AMH for ampere-hours (for electrical vehicles).
     */
    @NotNull public Builder fuelCapacity(@NotNull QuantitativeValue quantitativeValue) {
      putValue("fuelCapacity", quantitativeValue);
      return this;
    }
    /**
     * The capacity of the fuel tank or in the case of electric cars, the battery. If there are multiple components for storage, this should indicate the total of all storage of the same type.&lt;br/&gt;&lt;br/&gt;
     * 
     * Typical unit code(s): LTR for liters, GLL of US gallons, GLI for UK / imperial gallons, AMH for ampere-hours (for electrical vehicles).
     */
    @NotNull public Builder fuelCapacity(@NotNull QuantitativeValue.Builder quantitativeValue) {
      putValue("fuelCapacity", quantitativeValue.build());
      return this;
    }
    /**
     * The number of passengers that can be seated in the vehicle, both in terms of the physical space available, and in terms of limitations set by law.&lt;br/&gt;&lt;br/&gt;
     * 
     * Typical unit code(s): C62 for persons.
     */
    @NotNull public Builder vehicleSeatingCapacity(@NotNull Number number) {
      putValue("vehicleSeatingCapacity", number);
      return this;
    }
    /**
     * The number of passengers that can be seated in the vehicle, both in terms of the physical space available, and in terms of limitations set by law.&lt;br/&gt;&lt;br/&gt;
     * 
     * Typical unit code(s): C62 for persons.
     */
    @NotNull public Builder vehicleSeatingCapacity(@NotNull QuantitativeValue quantitativeValue) {
      putValue("vehicleSeatingCapacity", quantitativeValue);
      return this;
    }
    /**
     * The number of passengers that can be seated in the vehicle, both in terms of the physical space available, and in terms of limitations set by law.&lt;br/&gt;&lt;br/&gt;
     * 
     * Typical unit code(s): C62 for persons.
     */
    @NotNull public Builder vehicleSeatingCapacity(@NotNull QuantitativeValue.Builder quantitativeValue) {
      putValue("vehicleSeatingCapacity", quantitativeValue.build());
      return this;
    }
    /**
     * The release date of a vehicle model (often used to differentiate versions of the same make and model).
     */
    @NotNull public Builder modelDate(@NotNull java.util.Date date) {
      putValue("modelDate", date);
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
     * The permitted vertical load (TWR) of a trailer attached to the vehicle. Also referred to as Tongue Load Rating (TLR) or Vertical Load Rating (VLR)&lt;br/&gt;&lt;br/&gt;
     * 
     * Typical unit code(s): KGM for kilogram, LBR for pound&lt;br/&gt;&lt;br/&gt;
     * 
     * &lt;ul&gt;
     * &lt;li&gt;Note 1: You can indicate additional information in the &lt;a class=&quot;localLink&quot; href=&quot;http://schema.org/name&quot;&gt;name&lt;/a&gt; of the &lt;a class=&quot;localLink&quot; href=&quot;http://schema.org/QuantitativeValue&quot;&gt;QuantitativeValue&lt;/a&gt; node.&lt;/li&gt;
     * &lt;li&gt;Note 2: You may also link to a &lt;a class=&quot;localLink&quot; href=&quot;http://schema.org/QualitativeValue&quot;&gt;QualitativeValue&lt;/a&gt; node that provides additional information using &lt;a class=&quot;localLink&quot; href=&quot;http://schema.org/valueReference&quot;&gt;valueReference&lt;/a&gt;.&lt;/li&gt;
     * &lt;li&gt;Note 3: Note that you can use &lt;a class=&quot;localLink&quot; href=&quot;http://schema.org/minValue&quot;&gt;minValue&lt;/a&gt; and &lt;a class=&quot;localLink&quot; href=&quot;http://schema.org/maxValue&quot;&gt;maxValue&lt;/a&gt; to indicate ranges.&lt;/li&gt;
     * &lt;/ul&gt;
     * 
     */
    @NotNull public Builder tongueWeight(@NotNull QuantitativeValue quantitativeValue) {
      putValue("tongueWeight", quantitativeValue);
      return this;
    }
    /**
     * The permitted vertical load (TWR) of a trailer attached to the vehicle. Also referred to as Tongue Load Rating (TLR) or Vertical Load Rating (VLR)&lt;br/&gt;&lt;br/&gt;
     * 
     * Typical unit code(s): KGM for kilogram, LBR for pound&lt;br/&gt;&lt;br/&gt;
     * 
     * &lt;ul&gt;
     * &lt;li&gt;Note 1: You can indicate additional information in the &lt;a class=&quot;localLink&quot; href=&quot;http://schema.org/name&quot;&gt;name&lt;/a&gt; of the &lt;a class=&quot;localLink&quot; href=&quot;http://schema.org/QuantitativeValue&quot;&gt;QuantitativeValue&lt;/a&gt; node.&lt;/li&gt;
     * &lt;li&gt;Note 2: You may also link to a &lt;a class=&quot;localLink&quot; href=&quot;http://schema.org/QualitativeValue&quot;&gt;QualitativeValue&lt;/a&gt; node that provides additional information using &lt;a class=&quot;localLink&quot; href=&quot;http://schema.org/valueReference&quot;&gt;valueReference&lt;/a&gt;.&lt;/li&gt;
     * &lt;li&gt;Note 3: Note that you can use &lt;a class=&quot;localLink&quot; href=&quot;http://schema.org/minValue&quot;&gt;minValue&lt;/a&gt; and &lt;a class=&quot;localLink&quot; href=&quot;http://schema.org/maxValue&quot;&gt;maxValue&lt;/a&gt; to indicate ranges.&lt;/li&gt;
     * &lt;/ul&gt;
     * 
     */
    @NotNull public Builder tongueWeight(@NotNull QuantitativeValue.Builder quantitativeValue) {
      putValue("tongueWeight", quantitativeValue.build());
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
     * The type or material of the interior of the vehicle (e.g. synthetic fabric, leather, wood, etc.). While most interior types are characterized by the material used, an interior type can also be based on vehicle usage or target audience.
     */
    @NotNull public Builder vehicleInteriorType(@NotNull String vehicleInteriorType) {
      putValue("vehicleInteriorType", vehicleInteriorType);
      return this;
    }
    /**
     * The distance between the centers of the front and rear wheels.&lt;br/&gt;&lt;br/&gt;
     * 
     * Typical unit code(s): CMT for centimeters, MTR for meters, INH for inches, FOT for foot/feet
     */
    @NotNull public Builder wheelbase(@NotNull QuantitativeValue quantitativeValue) {
      putValue("wheelbase", quantitativeValue);
      return this;
    }
    /**
     * The distance between the centers of the front and rear wheels.&lt;br/&gt;&lt;br/&gt;
     * 
     * Typical unit code(s): CMT for centimeters, MTR for meters, INH for inches, FOT for foot/feet
     */
    @NotNull public Builder wheelbase(@NotNull QuantitativeValue.Builder quantitativeValue) {
      putValue("wheelbase", quantitativeValue.build());
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
     * The permitted weight of a trailer attached to the vehicle.&lt;br/&gt;&lt;br/&gt;
     * 
     * Typical unit code(s): KGM for kilogram, LBR for pound
     * * Note 1: You can indicate additional information in the &lt;a class=&quot;localLink&quot; href=&quot;http://schema.org/name&quot;&gt;name&lt;/a&gt; of the &lt;a class=&quot;localLink&quot; href=&quot;http://schema.org/QuantitativeValue&quot;&gt;QuantitativeValue&lt;/a&gt; node.
     * * Note 2: You may also link to a &lt;a class=&quot;localLink&quot; href=&quot;http://schema.org/QualitativeValue&quot;&gt;QualitativeValue&lt;/a&gt; node that provides additional information using &lt;a class=&quot;localLink&quot; href=&quot;http://schema.org/valueReference&quot;&gt;valueReference&lt;/a&gt;.
     * * Note 3: Note that you can use &lt;a class=&quot;localLink&quot; href=&quot;http://schema.org/minValue&quot;&gt;minValue&lt;/a&gt; and &lt;a class=&quot;localLink&quot; href=&quot;http://schema.org/maxValue&quot;&gt;maxValue&lt;/a&gt; to indicate ranges.
     */
    @NotNull public Builder trailerWeight(@NotNull QuantitativeValue quantitativeValue) {
      putValue("trailerWeight", quantitativeValue);
      return this;
    }
    /**
     * The permitted weight of a trailer attached to the vehicle.&lt;br/&gt;&lt;br/&gt;
     * 
     * Typical unit code(s): KGM for kilogram, LBR for pound
     * * Note 1: You can indicate additional information in the &lt;a class=&quot;localLink&quot; href=&quot;http://schema.org/name&quot;&gt;name&lt;/a&gt; of the &lt;a class=&quot;localLink&quot; href=&quot;http://schema.org/QuantitativeValue&quot;&gt;QuantitativeValue&lt;/a&gt; node.
     * * Note 2: You may also link to a &lt;a class=&quot;localLink&quot; href=&quot;http://schema.org/QualitativeValue&quot;&gt;QualitativeValue&lt;/a&gt; node that provides additional information using &lt;a class=&quot;localLink&quot; href=&quot;http://schema.org/valueReference&quot;&gt;valueReference&lt;/a&gt;.
     * * Note 3: Note that you can use &lt;a class=&quot;localLink&quot; href=&quot;http://schema.org/minValue&quot;&gt;minValue&lt;/a&gt; and &lt;a class=&quot;localLink&quot; href=&quot;http://schema.org/maxValue&quot;&gt;maxValue&lt;/a&gt; to indicate ranges.
     */
    @NotNull public Builder trailerWeight(@NotNull QuantitativeValue.Builder quantitativeValue) {
      putValue("trailerWeight", quantitativeValue.build());
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
     * Indicates a MerchantReturnPolicy that may be applicable.
     */
    @NotNull public Builder hasMerchantReturnPolicy(@NotNull MerchantReturnPolicy merchantReturnPolicy) {
      putValue("hasMerchantReturnPolicy", merchantReturnPolicy);
      return this;
    }
    /**
     * Indicates a MerchantReturnPolicy that may be applicable.
     */
    @NotNull public Builder hasMerchantReturnPolicy(@NotNull MerchantReturnPolicy.Builder merchantReturnPolicy) {
      putValue("hasMerchantReturnPolicy", merchantReturnPolicy.build());
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
     * The GTIN-14 code of the product, or the product to which the offer refers. See &lt;a href=&quot;http://www.gs1.org/barcodes/technical/idkeys/gtin&quot;&gt;GS1 GTIN Summary&lt;/a&gt; for more details.
     */
    @NotNull public Builder gtin14(@NotNull Gtin gtin) {
      putValue("gtin14", gtin);
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
     * A property-value pair representing an additional characteristics of the entitity, e.g. a product feature or another characteristic for which there is no matching property in schema.org.&lt;br/&gt;&lt;br/&gt;
     * 
     * Note: Publishers should be aware that applications designed to use specific schema.org properties (e.g. http://schema.org/width, http://schema.org/color, http://schema.org/gtin13, ...) will typically expect such data to be provided using those properties, rather than using the generic property/value mechanism.
     */
    @NotNull public Builder additionalProperty(@NotNull PropertyValue propertyValue) {
      putValue("additionalProperty", propertyValue);
      return this;
    }
    /**
     * A property-value pair representing an additional characteristics of the entitity, e.g. a product feature or another characteristic for which there is no matching property in schema.org.&lt;br/&gt;&lt;br/&gt;
     * 
     * Note: Publishers should be aware that applications designed to use specific schema.org properties (e.g. http://schema.org/width, http://schema.org/color, http://schema.org/gtin13, ...) will typically expect such data to be provided using those properties, rather than using the generic property/value mechanism.
     */
    @NotNull public Builder additionalProperty(@NotNull PropertyValue.Builder propertyValue) {
      putValue("additionalProperty", propertyValue.build());
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
     * The &lt;a href=&quot;http://apps.gs1.org/GDD/glossary/Pages/GTIN-8.aspx&quot;&gt;GTIN-8&lt;/a&gt; code of the product, or the product to which the offer refers. This code is also known as EAN/UCC-8 or 8-digit EAN. See &lt;a href=&quot;http://www.gs1.org/barcodes/technical/idkeys/gtin&quot;&gt;GS1 GTIN Summary&lt;/a&gt; for more details.
     */
    @NotNull public Builder gtin8(@NotNull Gtin gtin) {
      putValue("gtin8", gtin);
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
     * The release date of a product or product model. This can be used to distinguish the exact variant of a product.
     */
    @NotNull public Builder releaseDate(@NotNull java.util.Date date) {
      putValue("releaseDate", date);
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
     * A category for the item. Greater signs or slashes can be used to informally indicate a category hierarchy.
     */
    @NotNull public Builder category(@NotNull Category category) {
      putValue("category", category);
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
     * The color of the product.
     */
    @NotNull public Builder color(@NotNull String color) {
      putValue("color", color);
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
     * A slogan or motto associated with the item.
     */
    @NotNull public Builder slogan(@NotNull String slogan) {
      putValue("slogan", slogan);
      return this;
    }
    /**
     * The GTIN-12 code of the product, or the product to which the offer refers. The GTIN-12 is the 12-digit GS1 Identification Key composed of a U.P.C. Company Prefix, Item Reference, and Check Digit used to identify trade items. See &lt;a href=&quot;http://www.gs1.org/barcodes/technical/idkeys/gtin&quot;&gt;GS1 GTIN Summary&lt;/a&gt; for more details.
     */
    @NotNull public Builder gtin12(@NotNull Gtin gtin) {
      putValue("gtin12", gtin);
      return this;
    }
    /**
     * The product identifier, such as ISBN. For example: &lt;code&gt;meta itemprop=&quot;productID&quot; content=&quot;isbn:123-456-789&quot;&lt;/code&gt;.
     */
    @NotNull public Builder productID(@NotNull Identifier identifier) {
      putValue("productID", identifier);
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
     * The GTIN-13 code of the product, or the product to which the offer refers. This is equivalent to 13-digit ISBN codes and EAN UCC-13. Former 12-digit UPC codes can be converted into a GTIN-13 code by simply adding a preceeding zero. See &lt;a href=&quot;http://www.gs1.org/barcodes/technical/idkeys/gtin&quot;&gt;GS1 GTIN Summary&lt;/a&gt; for more details.
     */
    @NotNull public Builder gtin13(@NotNull Identifier identifier) {
      putValue("gtin13", identifier);
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
     * An associated logo.
     */
    @NotNull public Builder logo(@NotNull Image image) {
      putValue("logo", image);
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
     * Indicates the &lt;a href=&quot;https://en.wikipedia.org/wiki/NATO_Stock_Number&quot;&gt;NATO stock number&lt;/a&gt; (nsn) of a &lt;a class=&quot;localLink&quot; href=&quot;http://schema.org/Product&quot;&gt;Product&lt;/a&gt;.
     */
    @NotNull public Builder nsn(@NotNull String nsn) {
      putValue("nsn", nsn);
      return this;
    }
    /**
     * An offer to provide this item&amp;#x2014;for example, an offer to sell a product, rent the DVD of a movie, perform a service, or give away tickets to an event. Use &lt;a class=&quot;localLink&quot; href=&quot;http://schema.org/businessFunction&quot;&gt;businessFunction&lt;/a&gt; to indicate the kind of transaction offered, i.e. sell, lease, etc. This property can also be used to describe a &lt;a class=&quot;localLink&quot; href=&quot;http://schema.org/Demand&quot;&gt;Demand&lt;/a&gt;. While this property is listed as expected on a number of common types, it can be used in others. In that case, using a second type, such as Product or a subtype of Product, can clarify the nature of the offer.
     */
    @NotNull public Builder offers(@NotNull Demand demand) {
      putValue("offers", demand);
      return this;
    }
    /**
     * An offer to provide this item&amp;#x2014;for example, an offer to sell a product, rent the DVD of a movie, perform a service, or give away tickets to an event. Use &lt;a class=&quot;localLink&quot; href=&quot;http://schema.org/businessFunction&quot;&gt;businessFunction&lt;/a&gt; to indicate the kind of transaction offered, i.e. sell, lease, etc. This property can also be used to describe a &lt;a class=&quot;localLink&quot; href=&quot;http://schema.org/Demand&quot;&gt;Demand&lt;/a&gt;. While this property is listed as expected on a number of common types, it can be used in others. In that case, using a second type, such as Product or a subtype of Product, can clarify the nature of the offer.
     */
    @NotNull public Builder offers(@NotNull Demand.Builder demand) {
      putValue("offers", demand.build());
      return this;
    }
    /**
     * An offer to provide this item&amp;#x2014;for example, an offer to sell a product, rent the DVD of a movie, perform a service, or give away tickets to an event. Use &lt;a class=&quot;localLink&quot; href=&quot;http://schema.org/businessFunction&quot;&gt;businessFunction&lt;/a&gt; to indicate the kind of transaction offered, i.e. sell, lease, etc. This property can also be used to describe a &lt;a class=&quot;localLink&quot; href=&quot;http://schema.org/Demand&quot;&gt;Demand&lt;/a&gt;. While this property is listed as expected on a number of common types, it can be used in others. In that case, using a second type, such as Product or a subtype of Product, can clarify the nature of the offer.
     */
    @NotNull public Builder offers(@NotNull Offer offer) {
      putValue("offers", offer);
      return this;
    }
    /**
     * An offer to provide this item&amp;#x2014;for example, an offer to sell a product, rent the DVD of a movie, perform a service, or give away tickets to an event. Use &lt;a class=&quot;localLink&quot; href=&quot;http://schema.org/businessFunction&quot;&gt;businessFunction&lt;/a&gt; to indicate the kind of transaction offered, i.e. sell, lease, etc. This property can also be used to describe a &lt;a class=&quot;localLink&quot; href=&quot;http://schema.org/Demand&quot;&gt;Demand&lt;/a&gt;. While this property is listed as expected on a number of common types, it can be used in others. In that case, using a second type, such as Product or a subtype of Product, can clarify the nature of the offer.
     */
    @NotNull public Builder offers(@NotNull Offer.Builder offer) {
      putValue("offers", offer.build());
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
     * A sub property of description. A short description of the item used to disambiguate from other, similar items. Information from other properties (in particular, name) may be necessary for the description to be useful for disambiguation.
     */
    @NotNull public Builder disambiguatingDescription(@NotNull Description description) {
      putValue("disambiguatingDescription", description);
      return this;
    }
    /**
     * A description of the item.
     */
    @NotNull public Builder description(@NotNull Description description) {
      putValue("description", description);
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
     * The name of the item.
     */
    @NotNull public Builder name(@NotNull String name) {
      putValue("name", name);
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
     * An image of the item. This can be a &lt;a class=&quot;localLink&quot; href=&quot;http://schema.org/URL&quot;&gt;URL&lt;/a&gt; or a fully described &lt;a class=&quot;localLink&quot; href=&quot;http://schema.org/ImageObject&quot;&gt;ImageObject&lt;/a&gt;.
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
     * Indicates a page (or other CreativeWork) for which this thing is the main entity being described. See &lt;a href=&quot;/docs/datamodel.html#mainEntityBackground&quot;&gt;background notes&lt;/a&gt; for details.
     */
    @NotNull public Builder mainEntityOfPage(@NotNull CreativeWork creativeWork) {
      putValue("mainEntityOfPage", creativeWork);
      return this;
    }
    /**
     * Indicates a page (or other CreativeWork) for which this thing is the main entity being described. See &lt;a href=&quot;/docs/datamodel.html#mainEntityBackground&quot;&gt;background notes&lt;/a&gt; for details.
     */
    @NotNull public Builder mainEntityOfPage(@NotNull CreativeWork.Builder creativeWork) {
      putValue("mainEntityOfPage", creativeWork.build());
      return this;
    }
    /**
     * Indicates a page (or other CreativeWork) for which this thing is the main entity being described. See &lt;a href=&quot;/docs/datamodel.html#mainEntityBackground&quot;&gt;background notes&lt;/a&gt; for details.
     */
    @NotNull public Builder mainEntityOfPage(@NotNull String mainEntityOfPage) {
      putValue("mainEntityOfPage", mainEntityOfPage);
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
      if ("acrissCode".equals(key) && value instanceof String) { this.acrissCode((String)value); return; }
      if ("acrissCodes".equals(key) && value instanceof String) { this.acrissCode((String)value); return; }
      if ("roofLoad".equals(key) && value instanceof QuantitativeValue) { this.roofLoad((QuantitativeValue)value); return; }
      if ("roofLoads".equals(key) && value instanceof QuantitativeValue) { this.roofLoad((QuantitativeValue)value); return; }
      super.fromMap(key, value);
    }
  }
  
}
