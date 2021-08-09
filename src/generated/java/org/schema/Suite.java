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
 * A suite in a hotel or other public accommodation, denotes a class of luxury accommodations, the key feature of which is multiple rooms (Source: Wikipedia, the free encyclopedia, see &lt;a href=&quot;http://en.wikipedia.org/wiki/Suite_(hotel)&quot;&gt;http://en.wikipedia.org/wiki/Suite_(hotel)&lt;/a&gt;).
 * &lt;br /&gt;&lt;br /&gt;
 * See also the &lt;a href=&quot;/docs/hotels.html&quot;&gt;dedicated document on the use of schema.org for marking up hotels and other forms of accommodations&lt;/a&gt;.
 * 
 */
public class Suite extends Accommodation {
  /**
   *                           The type of bed or beds included in the accommodation. For the single case of just one bed of a certain type, you use bed directly with a text.
   * If you want to indicate the quantity of a certain kind of bed, use an instance of BedDetails. For more detailed information, use the amenityFeature property.
   *                           @return bed property set by first invocation of bed method or {@code null}.
   */
  @JsonIgnore public BedDetails getBedBedDetails() {
    return (BedDetails) getValue("bed");
  }
  /**
   *                               The type of bed or beds included in the accommodation. For the single case of just one bed of a certain type, you use bed directly with a text.
   * If you want to indicate the quantity of a certain kind of bed, use an instance of BedDetails. For more detailed information, use the amenityFeature property.
   *                               @return all bed properties as {@link java.util.Collection} or an empty collection 
   *                               if bed was not set.
   */
  @JsonIgnore public java.util.Collection<BedDetails> getBedBedDetailss() {
    final java.lang.Object current = myData.get("bed");
    if (current == null) return Collections.emptyList();
    if (current instanceof java.util.Collection) {
      return (java.util.Collection<BedDetails>) current;
    }
    return Arrays.asList((BedDetails) current);
  }
  /**
   *                           The type of bed or beds included in the accommodation. For the single case of just one bed of a certain type, you use bed directly with a text.
   * If you want to indicate the quantity of a certain kind of bed, use an instance of BedDetails. For more detailed information, use the amenityFeature property.
   *                           @return bed property set by first invocation of bed method or {@code null}.
   */
  @JsonIgnore public BedType getBedBedType() {
    return (BedType) getValue("bed");
  }
  /**
   *                               The type of bed or beds included in the accommodation. For the single case of just one bed of a certain type, you use bed directly with a text.
   * If you want to indicate the quantity of a certain kind of bed, use an instance of BedDetails. For more detailed information, use the amenityFeature property.
   *                               @return all bed properties as {@link java.util.Collection} or an empty collection 
   *                               if bed was not set.
   */
  @JsonIgnore public java.util.Collection<BedType> getBedBedTypes() {
    final java.lang.Object current = myData.get("bed");
    if (current == null) return Collections.emptyList();
    if (current instanceof java.util.Collection) {
      return (java.util.Collection<BedType>) current;
    }
    return Arrays.asList((BedType) current);
  }
  /**
   *                           The type of bed or beds included in the accommodation. For the single case of just one bed of a certain type, you use bed directly with a text.
   * If you want to indicate the quantity of a certain kind of bed, use an instance of BedDetails. For more detailed information, use the amenityFeature property.
   *                           @return bed property set by first invocation of bed method or {@code null}.
   */
  @JsonIgnore public String getBedString() {
    return (String) getValue("bed");
  }
  /**
   *                               The type of bed or beds included in the accommodation. For the single case of just one bed of a certain type, you use bed directly with a text.
   * If you want to indicate the quantity of a certain kind of bed, use an instance of BedDetails. For more detailed information, use the amenityFeature property.
   *                               @return all bed properties as {@link java.util.Collection} or an empty collection 
   *                               if bed was not set.
   */
  @JsonIgnore public java.util.Collection<String> getBedStrings() {
    final java.lang.Object current = myData.get("bed");
    if (current == null) return Collections.emptyList();
    if (current instanceof java.util.Collection) {
      return (java.util.Collection<String>) current;
    }
    return Arrays.asList((String) current);
  }
  /**
   *                                 The number of rooms (excluding bathrooms and closets) of the accommodation or lodging business.
   * Typical unit code(s): ROM for room or C62 for no unit. The type of room can be put in the unitText property of the QuantitativeValue.
   *                                 @return numberOfRooms property set by first invocation of numberOfRooms method or {@code null}.
   */
  @JsonIgnore public Integer getNumberOfRoomsInteger() {
    return (Integer) getValue("numberOfRooms");
  }
  /**
   *                                     The number of rooms (excluding bathrooms and closets) of the accommodation or lodging business.
   * Typical unit code(s): ROM for room or C62 for no unit. The type of room can be put in the unitText property of the QuantitativeValue.
   *                                     @return all numberOfRooms properties as {@link java.util.Collection} or an empty collection 
   *                                     if numberOfRooms was not set.
   */
  @JsonIgnore public java.util.Collection<Integer> getNumberOfRoomsIntegers() {
    final java.lang.Object current = myData.get("numberOfRooms");
    if (current == null) return Collections.emptyList();
    if (current instanceof java.util.Collection) {
      return (java.util.Collection<Integer>) current;
    }
    return Arrays.asList((Integer) current);
  }
  /**
   *                                 The number of rooms (excluding bathrooms and closets) of the accommodation or lodging business.
   * Typical unit code(s): ROM for room or C62 for no unit. The type of room can be put in the unitText property of the QuantitativeValue.
   *                                 @return numberOfRooms property set by first invocation of numberOfRooms method or {@code null}.
   */
  @JsonIgnore public Long getNumberOfRoomsLong() {
    return (Long) getValue("numberOfRooms");
  }
  /**
   *                                     The number of rooms (excluding bathrooms and closets) of the accommodation or lodging business.
   * Typical unit code(s): ROM for room or C62 for no unit. The type of room can be put in the unitText property of the QuantitativeValue.
   *                                     @return all numberOfRooms properties as {@link java.util.Collection} or an empty collection 
   *                                     if numberOfRooms was not set.
   */
  @JsonIgnore public java.util.Collection<Long> getNumberOfRoomsLongs() {
    final java.lang.Object current = myData.get("numberOfRooms");
    if (current == null) return Collections.emptyList();
    if (current instanceof java.util.Collection) {
      return (java.util.Collection<Long>) current;
    }
    return Arrays.asList((Long) current);
  }
  /**
   *                                 The number of rooms (excluding bathrooms and closets) of the accommodation or lodging business.
   * Typical unit code(s): ROM for room or C62 for no unit. The type of room can be put in the unitText property of the QuantitativeValue.
   *                                 @return numberOfRooms property set by first invocation of numberOfRooms method or {@code null}.
   */
  @JsonIgnore public Float getNumberOfRoomsFloat() {
    return (Float) getValue("numberOfRooms");
  }
  /**
   *                                     The number of rooms (excluding bathrooms and closets) of the accommodation or lodging business.
   * Typical unit code(s): ROM for room or C62 for no unit. The type of room can be put in the unitText property of the QuantitativeValue.
   *                                     @return all numberOfRooms properties as {@link java.util.Collection} or an empty collection 
   *                                     if numberOfRooms was not set.
   */
  @JsonIgnore public java.util.Collection<Float> getNumberOfRoomsFloats() {
    final java.lang.Object current = myData.get("numberOfRooms");
    if (current == null) return Collections.emptyList();
    if (current instanceof java.util.Collection) {
      return (java.util.Collection<Float>) current;
    }
    return Arrays.asList((Float) current);
  }
  /**
   *                                 The number of rooms (excluding bathrooms and closets) of the accommodation or lodging business.
   * Typical unit code(s): ROM for room or C62 for no unit. The type of room can be put in the unitText property of the QuantitativeValue.
   *                                 @return numberOfRooms property set by first invocation of numberOfRooms method or {@code null}.
   */
  @JsonIgnore public Double getNumberOfRoomsDouble() {
    return (Double) getValue("numberOfRooms");
  }
  /**
   *                                     The number of rooms (excluding bathrooms and closets) of the accommodation or lodging business.
   * Typical unit code(s): ROM for room or C62 for no unit. The type of room can be put in the unitText property of the QuantitativeValue.
   *                                     @return all numberOfRooms properties as {@link java.util.Collection} or an empty collection 
   *                                     if numberOfRooms was not set.
   */
  @JsonIgnore public java.util.Collection<Double> getNumberOfRoomsDoubles() {
    final java.lang.Object current = myData.get("numberOfRooms");
    if (current == null) return Collections.emptyList();
    if (current instanceof java.util.Collection) {
      return (java.util.Collection<Double>) current;
    }
    return Arrays.asList((Double) current);
  }
  /**
   *                                 The number of rooms (excluding bathrooms and closets) of the accommodation or lodging business.
   * Typical unit code(s): ROM for room or C62 for no unit. The type of room can be put in the unitText property of the QuantitativeValue.
   *                                 @return numberOfRooms property set by first invocation of numberOfRooms method or {@code null}.
   */
  @JsonIgnore public String getNumberOfRoomsString() {
    return (String) getValue("numberOfRooms");
  }
  /**
   *                                     The number of rooms (excluding bathrooms and closets) of the accommodation or lodging business.
   * Typical unit code(s): ROM for room or C62 for no unit. The type of room can be put in the unitText property of the QuantitativeValue.
   *                                     @return all numberOfRooms properties as {@link java.util.Collection} or an empty collection 
   *                                     if numberOfRooms was not set.
   */
  @JsonIgnore public java.util.Collection<String> getNumberOfRoomsStrings() {
    final java.lang.Object current = myData.get("numberOfRooms");
    if (current == null) return Collections.emptyList();
    if (current instanceof java.util.Collection) {
      return (java.util.Collection<String>) current;
    }
    return Arrays.asList((String) current);
  }
  /**
   *                                 The allowed total occupancy for the accommodation in persons (including infants etc). For individual accommodations, this is not necessarily the legal maximum but defines the permitted usage as per the contractual agreement (e.g. a double room used by a single person).
   * Typical unit code(s): C62 for person
   *                                 @return occupancy property set by first invocation of occupancy method or {@code null}.
   */
  @JsonIgnore public QuantitativeValue getOccupancy() {
    return (QuantitativeValue) getValue("occupancy");
  }
  /**
   *                                     The allowed total occupancy for the accommodation in persons (including infants etc). For individual accommodations, this is not necessarily the legal maximum but defines the permitted usage as per the contractual agreement (e.g. a double room used by a single person).
   * Typical unit code(s): C62 for person
   *                                     @return all occupancy properties as {@link java.util.Collection} or an empty collection 
   *                                     if occupancy was not set.
   */
  @JsonIgnore public java.util.Collection<QuantitativeValue> getOccupancys() {
    final java.lang.Object current = myData.get("occupancy");
    if (current == null) return Collections.emptyList();
    if (current instanceof java.util.Collection) {
      return (java.util.Collection<QuantitativeValue>) current;
    }
    return Arrays.asList((QuantitativeValue) current);
  }
  protected Suite(java.util.Map<String,java.lang.Object> data) {
    super(data);
  }
  
  /**
   * Builder for {@link Suite}
   */
  public static class Builder extends Accommodation.Builder {
    public Builder(@NotNull HashMap<String,java.lang.Object> data) {
      super(data);
    }
    @NotNull public Suite build() {
      return new Suite(myData);
    }
    /**
     *                                   The type of bed or beds included in the accommodation. For the single case of just one bed of a certain type, you use bed directly with a text.
     * If you want to indicate the quantity of a certain kind of bed, use an instance of BedDetails. For more detailed information, use the amenityFeature property.
     *                                   @param bedDetails value to set
     *                                   @return this builder instance
     */
    @NotNull public Builder bed(@NotNull BedDetails bedDetails) {
      putValue("bed", bedDetails);
      return this;
    }
    /**
     *                                       The type of bed or beds included in the accommodation. For the single case of just one bed of a certain type, you use bed directly with a text.
     * If you want to indicate the quantity of a certain kind of bed, use an instance of BedDetails. For more detailed information, use the amenityFeature property.
     *                                       @param bedDetails value to set
     *                                       @return this builder instance
     */
    @NotNull public Builder bed(@NotNull BedDetails.Builder bedDetails) {
      putValue("bed", bedDetails.build());
      return this;
    }
    /**
     *                                   The type of bed or beds included in the accommodation. For the single case of just one bed of a certain type, you use bed directly with a text.
     * If you want to indicate the quantity of a certain kind of bed, use an instance of BedDetails. For more detailed information, use the amenityFeature property.
     *                                   @param bedType value to set
     *                                   @return this builder instance
     */
    @NotNull public Builder bed(@NotNull BedType bedType) {
      putValue("bed", bedType);
      return this;
    }
    /**
     *                                       The type of bed or beds included in the accommodation. For the single case of just one bed of a certain type, you use bed directly with a text.
     * If you want to indicate the quantity of a certain kind of bed, use an instance of BedDetails. For more detailed information, use the amenityFeature property.
     *                                       @param bedType value to set
     *                                       @return this builder instance
     */
    @NotNull public Builder bed(@NotNull BedType.Builder bedType) {
      putValue("bed", bedType.build());
      return this;
    }
    /**
     *                                   The type of bed or beds included in the accommodation. For the single case of just one bed of a certain type, you use bed directly with a text.
     * If you want to indicate the quantity of a certain kind of bed, use an instance of BedDetails. For more detailed information, use the amenityFeature property.
     *                                   @param bed value to set
     *                                   @return this builder instance
     */
    @NotNull public Builder bed(@NotNull String bed) {
      putValue("bed", bed);
      return this;
    }
    /**
     * Remove bed property from the builder.
     * If this property is repeatable, all instances are removed.
     * @return this builder instance
     */
    @NotNull public Builder removeBed() {
      removeValue("bed");
      return this;
    }
    /**
     * Get currently set value for bed property in this builder.
     * @return previously set value or {@code null}. If multiple values have been 
     * set to this property, then {@link java.util.Collection} instance will be 
     * returned.
     */
    @Nullable public java.lang.Object getBed() {
      return myData.get("bed");
    }
    /**
     *                                         The number of rooms (excluding bathrooms and closets) of the accommodation or lodging business.
     * Typical unit code(s): ROM for room or C62 for no unit. The type of room can be put in the unitText property of the QuantitativeValue.
     *                                         @param integer value to set
     *                                         @return this builder instance
     */
    @NotNull public Builder numberOfRooms(@NotNull Integer integer) {
      putValue("numberOfRooms", integer);
      return this;
    }
    /**
     *                                         The number of rooms (excluding bathrooms and closets) of the accommodation or lodging business.
     * Typical unit code(s): ROM for room or C62 for no unit. The type of room can be put in the unitText property of the QuantitativeValue.
     *                                         @param numberOfRooms value to set
     *                                         @return this builder instance
     */
    @NotNull public Builder numberOfRooms(@NotNull Long numberOfRooms) {
      putValue("numberOfRooms", numberOfRooms);
      return this;
    }
    /**
     *                                         The number of rooms (excluding bathrooms and closets) of the accommodation or lodging business.
     * Typical unit code(s): ROM for room or C62 for no unit. The type of room can be put in the unitText property of the QuantitativeValue.
     *                                         @param numberOfRooms value to set
     *                                         @return this builder instance
     */
    @NotNull public Builder numberOfRooms(@NotNull Float numberOfRooms) {
      putValue("numberOfRooms", numberOfRooms);
      return this;
    }
    /**
     *                                         The number of rooms (excluding bathrooms and closets) of the accommodation or lodging business.
     * Typical unit code(s): ROM for room or C62 for no unit. The type of room can be put in the unitText property of the QuantitativeValue.
     *                                         @param numberOfRooms value to set
     *                                         @return this builder instance
     */
    @NotNull public Builder numberOfRooms(@NotNull Double numberOfRooms) {
      putValue("numberOfRooms", numberOfRooms);
      return this;
    }
    /**
     *                                         The number of rooms (excluding bathrooms and closets) of the accommodation or lodging business.
     * Typical unit code(s): ROM for room or C62 for no unit. The type of room can be put in the unitText property of the QuantitativeValue.
     *                                         @param numberOfRooms value to set
     *                                         @return this builder instance
     */
    @NotNull public Builder numberOfRooms(@NotNull String numberOfRooms) {
      putValue("numberOfRooms", numberOfRooms);
      return this;
    }
    /**
     * Remove numberOfRooms property from the builder.
     * If this property is repeatable, all instances are removed.
     * @return this builder instance
     */
    @NotNull public Builder removeNumberOfRooms() {
      removeValue("numberOfRooms");
      return this;
    }
    /**
     * Get currently set value for numberOfRooms property in this builder.
     * @return previously set value or {@code null}. If multiple values have been 
     * set to this property, then {@link java.util.Collection} instance will be 
     * returned.
     */
    @Nullable public java.lang.Object getNumberOfRooms() {
      return myData.get("numberOfRooms");
    }
    /**
     *                                         The allowed total occupancy for the accommodation in persons (including infants etc). For individual accommodations, this is not necessarily the legal maximum but defines the permitted usage as per the contractual agreement (e.g. a double room used by a single person).
     * Typical unit code(s): C62 for person
     *                                         @param quantitativeValue value to set
     *                                         @return this builder instance
     */
    @NotNull public Builder occupancy(@NotNull QuantitativeValue quantitativeValue) {
      putValue("occupancy", quantitativeValue);
      return this;
    }
    /**
     *                                             The allowed total occupancy for the accommodation in persons (including infants etc). For individual accommodations, this is not necessarily the legal maximum but defines the permitted usage as per the contractual agreement (e.g. a double room used by a single person).
     * Typical unit code(s): C62 for person
     *                                             @param quantitativeValue value to set
     *                                             @return this builder instance
     */
    @NotNull public Builder occupancy(@NotNull QuantitativeValue.Builder quantitativeValue) {
      putValue("occupancy", quantitativeValue.build());
      return this;
    }
    /**
     * Remove occupancy property from the builder.
     * If this property is repeatable, all instances are removed.
     * @return this builder instance
     */
    @NotNull public Builder removeOccupancy() {
      removeValue("occupancy");
      return this;
    }
    /**
     * Get currently set value for occupancy property in this builder.
     * @return previously set value or {@code null}. If multiple values have been 
     * set to this property, then {@link java.util.Collection} instance will be 
     * returned.
     */
    @Nullable public java.lang.Object getOccupancy() {
      return myData.get("occupancy");
    }
    /**
     * A page providing information on how to book a tour of some [[Place]], such as an [[Accommodation]] or [[ApartmentComplex]] in a real estate setting, as well as other kinds of tours as appropriate.
     * @param tourBookingPage value to set
     * @return this builder instance
     */
    @NotNull public Builder tourBookingPage(@NotNull String tourBookingPage) {
      putValue("tourBookingPage", tourBookingPage);
      return this;
    }
    /**
     * Remove tourBookingPage property from the builder.
     * If this property is repeatable, all instances are removed.
     * @return this builder instance
     */
    @NotNull public Builder removeTourBookingPage() {
      removeValue("tourBookingPage");
      return this;
    }
    /**
     * Get currently set value for tourBookingPage property in this builder.
     * @return previously set value or {@code null}. If multiple values have been 
     * set to this property, then {@link java.util.Collection} instance will be 
     * returned.
     */
    @Nullable public java.lang.Object getTourBookingPage() {
      return myData.get("tourBookingPage");
    }
    /**
     * The year an [[Accommodation]] was constructed. This corresponds to the [YearBuilt field in RESO](https://ddwiki.reso.org/display/DDW17/YearBuilt+Field). 
     * @param integer value to set
     * @return this builder instance
     */
    @NotNull public Builder yearBuilt(@NotNull Integer integer) {
      putValue("yearBuilt", integer);
      return this;
    }
    /**
     * The year an [[Accommodation]] was constructed. This corresponds to the [YearBuilt field in RESO](https://ddwiki.reso.org/display/DDW17/YearBuilt+Field). 
     * @param yearBuilt value to set
     * @return this builder instance
     */
    @NotNull public Builder yearBuilt(@NotNull Long yearBuilt) {
      putValue("yearBuilt", yearBuilt);
      return this;
    }
    /**
     * The year an [[Accommodation]] was constructed. This corresponds to the [YearBuilt field in RESO](https://ddwiki.reso.org/display/DDW17/YearBuilt+Field). 
     * @param yearBuilt value to set
     * @return this builder instance
     */
    @NotNull public Builder yearBuilt(@NotNull Float yearBuilt) {
      putValue("yearBuilt", yearBuilt);
      return this;
    }
    /**
     * The year an [[Accommodation]] was constructed. This corresponds to the [YearBuilt field in RESO](https://ddwiki.reso.org/display/DDW17/YearBuilt+Field). 
     * @param yearBuilt value to set
     * @return this builder instance
     */
    @NotNull public Builder yearBuilt(@NotNull Double yearBuilt) {
      putValue("yearBuilt", yearBuilt);
      return this;
    }
    /**
     * The year an [[Accommodation]] was constructed. This corresponds to the [YearBuilt field in RESO](https://ddwiki.reso.org/display/DDW17/YearBuilt+Field). 
     * @param yearBuilt value to set
     * @return this builder instance
     */
    @NotNull public Builder yearBuilt(@NotNull String yearBuilt) {
      putValue("yearBuilt", yearBuilt);
      return this;
    }
    /**
     * Remove yearBuilt property from the builder.
     * If this property is repeatable, all instances are removed.
     * @return this builder instance
     */
    @NotNull public Builder removeYearBuilt() {
      removeValue("yearBuilt");
      return this;
    }
    /**
     * Get currently set value for yearBuilt property in this builder.
     * @return previously set value or {@code null}. If multiple values have been 
     * set to this property, then {@link java.util.Collection} instance will be 
     * returned.
     */
    @Nullable public java.lang.Object getYearBuilt() {
      return myData.get("yearBuilt");
    }
    /**
     * A floorplan of some [[Accommodation]].
     * @param floorPlan value to set
     * @return this builder instance
     */
    @NotNull public Builder accommodationFloorPlan(@NotNull FloorPlan floorPlan) {
      putValue("accommodationFloorPlan", floorPlan);
      return this;
    }
    /**
     * A floorplan of some [[Accommodation]].
     * @param floorPlan value to set
     * @return this builder instance
     */
    @NotNull public Builder accommodationFloorPlan(@NotNull FloorPlan.Builder floorPlan) {
      putValue("accommodationFloorPlan", floorPlan.build());
      return this;
    }
    /**
     * Remove accommodationFloorPlan property from the builder.
     * If this property is repeatable, all instances are removed.
     * @return this builder instance
     */
    @NotNull public Builder removeAccommodationFloorPlan() {
      removeValue("accommodationFloorPlan");
      return this;
    }
    /**
     * Get currently set value for accommodationFloorPlan property in this builder.
     * @return previously set value or {@code null}. If multiple values have been 
     * set to this property, then {@link java.util.Collection} instance will be 
     * returned.
     */
    @Nullable public java.lang.Object getAccommodationFloorPlan() {
      return myData.get("accommodationFloorPlan");
    }
    /**
     * The total integer number of bathrooms in a some [[Accommodation]], following real estate conventions as [documented in RESO](https://ddwiki.reso.org/display/DDW17/BathroomsTotalInteger+Field): &quot;The simple sum of the number of bathrooms. For example for a property with two Full Bathrooms and one Half Bathroom, the Bathrooms Total Integer will be 3.&quot;. See also [[numberOfRooms]].
     * @param integer value to set
     * @return this builder instance
     */
    @NotNull public Builder numberOfBathroomsTotal(@NotNull Integer integer) {
      putValue("numberOfBathroomsTotal", integer);
      return this;
    }
    /**
     * Remove numberOfBathroomsTotal property from the builder.
     * If this property is repeatable, all instances are removed.
     * @return this builder instance
     */
    @NotNull public Builder removeNumberOfBathroomsTotal() {
      removeValue("numberOfBathroomsTotal");
      return this;
    }
    /**
     * Get currently set value for numberOfBathroomsTotal property in this builder.
     * @return previously set value or {@code null}. If multiple values have been 
     * set to this property, then {@link java.util.Collection} instance will be 
     * returned.
     */
    @Nullable public java.lang.Object getNumberOfBathroomsTotal() {
      return myData.get("numberOfBathroomsTotal");
    }
    /**
     * Number of full bathrooms - The total number of full and &frac34; bathrooms in an [[Accommodation]]. This corresponds to the [BathroomsFull field in RESO](https://ddwiki.reso.org/display/DDW17/BathroomsFull+Field).
     * @param integer value to set
     * @return this builder instance
     */
    @NotNull public Builder numberOfFullBathrooms(@NotNull Integer integer) {
      putValue("numberOfFullBathrooms", integer);
      return this;
    }
    /**
     * Number of full bathrooms - The total number of full and &frac34; bathrooms in an [[Accommodation]]. This corresponds to the [BathroomsFull field in RESO](https://ddwiki.reso.org/display/DDW17/BathroomsFull+Field).
     * @param numberOfFullBathrooms value to set
     * @return this builder instance
     */
    @NotNull public Builder numberOfFullBathrooms(@NotNull Long numberOfFullBathrooms) {
      putValue("numberOfFullBathrooms", numberOfFullBathrooms);
      return this;
    }
    /**
     * Number of full bathrooms - The total number of full and &frac34; bathrooms in an [[Accommodation]]. This corresponds to the [BathroomsFull field in RESO](https://ddwiki.reso.org/display/DDW17/BathroomsFull+Field).
     * @param numberOfFullBathrooms value to set
     * @return this builder instance
     */
    @NotNull public Builder numberOfFullBathrooms(@NotNull Float numberOfFullBathrooms) {
      putValue("numberOfFullBathrooms", numberOfFullBathrooms);
      return this;
    }
    /**
     * Number of full bathrooms - The total number of full and &frac34; bathrooms in an [[Accommodation]]. This corresponds to the [BathroomsFull field in RESO](https://ddwiki.reso.org/display/DDW17/BathroomsFull+Field).
     * @param numberOfFullBathrooms value to set
     * @return this builder instance
     */
    @NotNull public Builder numberOfFullBathrooms(@NotNull Double numberOfFullBathrooms) {
      putValue("numberOfFullBathrooms", numberOfFullBathrooms);
      return this;
    }
    /**
     * Number of full bathrooms - The total number of full and &frac34; bathrooms in an [[Accommodation]]. This corresponds to the [BathroomsFull field in RESO](https://ddwiki.reso.org/display/DDW17/BathroomsFull+Field).
     * @param numberOfFullBathrooms value to set
     * @return this builder instance
     */
    @NotNull public Builder numberOfFullBathrooms(@NotNull String numberOfFullBathrooms) {
      putValue("numberOfFullBathrooms", numberOfFullBathrooms);
      return this;
    }
    /**
     * Remove numberOfFullBathrooms property from the builder.
     * If this property is repeatable, all instances are removed.
     * @return this builder instance
     */
    @NotNull public Builder removeNumberOfFullBathrooms() {
      removeValue("numberOfFullBathrooms");
      return this;
    }
    /**
     * Get currently set value for numberOfFullBathrooms property in this builder.
     * @return previously set value or {@code null}. If multiple values have been 
     * set to this property, then {@link java.util.Collection} instance will be 
     * returned.
     */
    @Nullable public java.lang.Object getNumberOfFullBathrooms() {
      return myData.get("numberOfFullBathrooms");
    }
    /**
     * Indications regarding the permitted usage of the accommodation.
     * @param permittedUsage value to set
     * @return this builder instance
     */
    @NotNull public Builder permittedUsage(@NotNull String permittedUsage) {
      putValue("permittedUsage", permittedUsage);
      return this;
    }
    /**
     * Remove permittedUsage property from the builder.
     * If this property is repeatable, all instances are removed.
     * @return this builder instance
     */
    @NotNull public Builder removePermittedUsage() {
      removeValue("permittedUsage");
      return this;
    }
    /**
     * Get currently set value for permittedUsage property in this builder.
     * @return previously set value or {@code null}. If multiple values have been 
     * set to this property, then {@link java.util.Collection} instance will be 
     * returned.
     */
    @Nullable public java.lang.Object getPermittedUsage() {
      return myData.get("permittedUsage");
    }
    /**
     * The total integer number of bedrooms in a some [[Accommodation]], [[ApartmentComplex]] or [[FloorPlan]].
     * @param number value to set
     * @return this builder instance
     */
    @NotNull public Builder numberOfBedrooms(@NotNull Number number) {
      putValue("numberOfBedrooms", number);
      return this;
    }
    /**
     * The total integer number of bedrooms in a some [[Accommodation]], [[ApartmentComplex]] or [[FloorPlan]].
     * @param quantitativeValue value to set
     * @return this builder instance
     */
    @NotNull public Builder numberOfBedrooms(@NotNull QuantitativeValue quantitativeValue) {
      putValue("numberOfBedrooms", quantitativeValue);
      return this;
    }
    /**
     * The total integer number of bedrooms in a some [[Accommodation]], [[ApartmentComplex]] or [[FloorPlan]].
     * @param quantitativeValue value to set
     * @return this builder instance
     */
    @NotNull public Builder numberOfBedrooms(@NotNull QuantitativeValue.Builder quantitativeValue) {
      putValue("numberOfBedrooms", quantitativeValue.build());
      return this;
    }
    /**
     * Remove numberOfBedrooms property from the builder.
     * If this property is repeatable, all instances are removed.
     * @return this builder instance
     */
    @NotNull public Builder removeNumberOfBedrooms() {
      removeValue("numberOfBedrooms");
      return this;
    }
    /**
     * Get currently set value for numberOfBedrooms property in this builder.
     * @return previously set value or {@code null}. If multiple values have been 
     * set to this property, then {@link java.util.Collection} instance will be 
     * returned.
     */
    @Nullable public java.lang.Object getNumberOfBedrooms() {
      return myData.get("numberOfBedrooms");
    }
    /**
     * Category of an [[Accommodation]], following real estate conventions e.g. RESO (see [PropertySubType](https://ddwiki.reso.org/display/DDW17/PropertySubType+Field), and [PropertyType](https://ddwiki.reso.org/display/DDW17/PropertyType+Field) fields  for suggested values).
     * @param category value to set
     * @return this builder instance
     */
    @NotNull public Builder accommodationCategory(@NotNull Category category) {
      putValue("accommodationCategory", category);
      return this;
    }
    /**
     * Remove accommodationCategory property from the builder.
     * If this property is repeatable, all instances are removed.
     * @return this builder instance
     */
    @NotNull public Builder removeAccommodationCategory() {
      removeValue("accommodationCategory");
      return this;
    }
    /**
     * Get currently set value for accommodationCategory property in this builder.
     * @return previously set value or {@code null}. If multiple values have been 
     * set to this property, then {@link java.util.Collection} instance will be 
     * returned.
     */
    @Nullable public java.lang.Object getAccommodationCategory() {
      return myData.get("accommodationCategory");
    }
    /**
     * Number of partial bathrooms - The total number of half and &frac14; bathrooms in an [[Accommodation]]. This corresponds to the [BathroomsPartial field in RESO](https://ddwiki.reso.org/display/DDW17/BathroomsPartial+Field). 
     * @param integer value to set
     * @return this builder instance
     */
    @NotNull public Builder numberOfPartialBathrooms(@NotNull Integer integer) {
      putValue("numberOfPartialBathrooms", integer);
      return this;
    }
    /**
     * Number of partial bathrooms - The total number of half and &frac14; bathrooms in an [[Accommodation]]. This corresponds to the [BathroomsPartial field in RESO](https://ddwiki.reso.org/display/DDW17/BathroomsPartial+Field). 
     * @param numberOfPartialBathrooms value to set
     * @return this builder instance
     */
    @NotNull public Builder numberOfPartialBathrooms(@NotNull Long numberOfPartialBathrooms) {
      putValue("numberOfPartialBathrooms", numberOfPartialBathrooms);
      return this;
    }
    /**
     * Number of partial bathrooms - The total number of half and &frac14; bathrooms in an [[Accommodation]]. This corresponds to the [BathroomsPartial field in RESO](https://ddwiki.reso.org/display/DDW17/BathroomsPartial+Field). 
     * @param numberOfPartialBathrooms value to set
     * @return this builder instance
     */
    @NotNull public Builder numberOfPartialBathrooms(@NotNull Float numberOfPartialBathrooms) {
      putValue("numberOfPartialBathrooms", numberOfPartialBathrooms);
      return this;
    }
    /**
     * Number of partial bathrooms - The total number of half and &frac14; bathrooms in an [[Accommodation]]. This corresponds to the [BathroomsPartial field in RESO](https://ddwiki.reso.org/display/DDW17/BathroomsPartial+Field). 
     * @param numberOfPartialBathrooms value to set
     * @return this builder instance
     */
    @NotNull public Builder numberOfPartialBathrooms(@NotNull Double numberOfPartialBathrooms) {
      putValue("numberOfPartialBathrooms", numberOfPartialBathrooms);
      return this;
    }
    /**
     * Number of partial bathrooms - The total number of half and &frac14; bathrooms in an [[Accommodation]]. This corresponds to the [BathroomsPartial field in RESO](https://ddwiki.reso.org/display/DDW17/BathroomsPartial+Field). 
     * @param numberOfPartialBathrooms value to set
     * @return this builder instance
     */
    @NotNull public Builder numberOfPartialBathrooms(@NotNull String numberOfPartialBathrooms) {
      putValue("numberOfPartialBathrooms", numberOfPartialBathrooms);
      return this;
    }
    /**
     * Remove numberOfPartialBathrooms property from the builder.
     * If this property is repeatable, all instances are removed.
     * @return this builder instance
     */
    @NotNull public Builder removeNumberOfPartialBathrooms() {
      removeValue("numberOfPartialBathrooms");
      return this;
    }
    /**
     * Get currently set value for numberOfPartialBathrooms property in this builder.
     * @return previously set value or {@code null}. If multiple values have been 
     * set to this property, then {@link java.util.Collection} instance will be 
     * returned.
     */
    @Nullable public java.lang.Object getNumberOfPartialBathrooms() {
      return myData.get("numberOfPartialBathrooms");
    }
    /**
     * Length of the lease for some [[Accommodation]], either particular to some [[Offer]] or in some cases intrinsic to the property.
     * @param duration value to set
     * @return this builder instance
     */
    @NotNull public Builder leaseLength(@NotNull Duration duration) {
      putValue("leaseLength", duration);
      return this;
    }
    /**
     * Length of the lease for some [[Accommodation]], either particular to some [[Offer]] or in some cases intrinsic to the property.
     * @param quantitativeValue value to set
     * @return this builder instance
     */
    @NotNull public Builder leaseLength(@NotNull QuantitativeValue quantitativeValue) {
      putValue("leaseLength", quantitativeValue);
      return this;
    }
    /**
     * Length of the lease for some [[Accommodation]], either particular to some [[Offer]] or in some cases intrinsic to the property.
     * @param quantitativeValue value to set
     * @return this builder instance
     */
    @NotNull public Builder leaseLength(@NotNull QuantitativeValue.Builder quantitativeValue) {
      putValue("leaseLength", quantitativeValue.build());
      return this;
    }
    /**
     * Remove leaseLength property from the builder.
     * If this property is repeatable, all instances are removed.
     * @return this builder instance
     */
    @NotNull public Builder removeLeaseLength() {
      removeValue("leaseLength");
      return this;
    }
    /**
     * Get currently set value for leaseLength property in this builder.
     * @return previously set value or {@code null}. If multiple values have been 
     * set to this property, then {@link java.util.Collection} instance will be 
     * returned.
     */
    @Nullable public java.lang.Object getLeaseLength() {
      return myData.get("leaseLength");
    }
    /**
     *                                         The size of the accommodation, e.g. in square meter or squarefoot.
     * Typical unit code(s): MTK for square meter, FTK for square foot, or YDK for square yard 
     *                                         @param quantitativeValue value to set
     *                                         @return this builder instance
     */
    @NotNull public Builder floorSize(@NotNull QuantitativeValue quantitativeValue) {
      putValue("floorSize", quantitativeValue);
      return this;
    }
    /**
     *                                             The size of the accommodation, e.g. in square meter or squarefoot.
     * Typical unit code(s): MTK for square meter, FTK for square foot, or YDK for square yard 
     *                                             @param quantitativeValue value to set
     *                                             @return this builder instance
     */
    @NotNull public Builder floorSize(@NotNull QuantitativeValue.Builder quantitativeValue) {
      putValue("floorSize", quantitativeValue.build());
      return this;
    }
    /**
     * Remove floorSize property from the builder.
     * If this property is repeatable, all instances are removed.
     * @return this builder instance
     */
    @NotNull public Builder removeFloorSize() {
      removeValue("floorSize");
      return this;
    }
    /**
     * Get currently set value for floorSize property in this builder.
     * @return previously set value or {@code null}. If multiple values have been 
     * set to this property, then {@link java.util.Collection} instance will be 
     * returned.
     */
    @Nullable public java.lang.Object getFloorSize() {
      return myData.get("floorSize");
    }
    /**
     * An amenity feature (e.g. a characteristic or service) of the Accommodation. This generic property does not make a statement about whether the feature is included in an offer for the main accommodation or available at extra costs.
     * @param locationFeatureSpecification value to set
     * @return this builder instance
     */
    @NotNull public Builder amenityFeature(@NotNull LocationFeatureSpecification locationFeatureSpecification) {
      putValue("amenityFeature", locationFeatureSpecification);
      return this;
    }
    /**
     * An amenity feature (e.g. a characteristic or service) of the Accommodation. This generic property does not make a statement about whether the feature is included in an offer for the main accommodation or available at extra costs.
     * @param locationFeatureSpecification value to set
     * @return this builder instance
     */
    @NotNull public Builder amenityFeature(@NotNull LocationFeatureSpecification.Builder locationFeatureSpecification) {
      putValue("amenityFeature", locationFeatureSpecification.build());
      return this;
    }
    /**
     * Remove amenityFeature property from the builder.
     * If this property is repeatable, all instances are removed.
     * @return this builder instance
     */
    @NotNull public Builder removeAmenityFeature() {
      removeValue("amenityFeature");
      return this;
    }
    /**
     * Get currently set value for amenityFeature property in this builder.
     * @return previously set value or {@code null}. If multiple values have been 
     * set to this property, then {@link java.util.Collection} instance will be 
     * returned.
     */
    @Nullable public java.lang.Object getAmenityFeature() {
      return myData.get("amenityFeature");
    }
    /**
     * Indicates whether pets are allowed to enter the accommodation or lodging business. More detailed information can be put in a text value.
     * @param petsAllowed value to set
     * @return this builder instance
     */
    @NotNull public Builder petsAllowed(@NotNull Boolean petsAllowed) {
      putValue("petsAllowed", petsAllowed);
      return this;
    }
    /**
     * Indicates whether pets are allowed to enter the accommodation or lodging business. More detailed information can be put in a text value.
     * @param petsAllowed value to set
     * @return this builder instance
     */
    @NotNull public Builder petsAllowed(@NotNull String petsAllowed) {
      putValue("petsAllowed", petsAllowed);
      return this;
    }
    /**
     * Remove petsAllowed property from the builder.
     * If this property is repeatable, all instances are removed.
     * @return this builder instance
     */
    @NotNull public Builder removePetsAllowed() {
      removeValue("petsAllowed");
      return this;
    }
    /**
     * Get currently set value for petsAllowed property in this builder.
     * @return previously set value or {@code null}. If multiple values have been 
     * set to this property, then {@link java.util.Collection} instance will be 
     * returned.
     */
    @Nullable public java.lang.Object getPetsAllowed() {
      return myData.get("petsAllowed");
    }
    /**
     *                                       The floor level for an [[Accommodation]] in a multi-storey building. Since counting
     * systems [vary internationally](https://en.wikipedia.org/wiki/Storey#Consecutive_number_floor_designations), the local system should be used where possible.
     *                                       @param floorLevel value to set
     *                                       @return this builder instance
     */
    @NotNull public Builder floorLevel(@NotNull String floorLevel) {
      putValue("floorLevel", floorLevel);
      return this;
    }
    /**
     * Remove floorLevel property from the builder.
     * If this property is repeatable, all instances are removed.
     * @return this builder instance
     */
    @NotNull public Builder removeFloorLevel() {
      removeValue("floorLevel");
      return this;
    }
    /**
     * Get currently set value for floorLevel property in this builder.
     * @return previously set value or {@code null}. If multiple values have been 
     * set to this property, then {@link java.util.Collection} instance will be 
     * returned.
     */
    @Nullable public java.lang.Object getFloorLevel() {
      return myData.get("floorLevel");
    }
    /**
     * Represents a relationship between two geometries (or the places they represent), relating a geometry to one that contains it, i.e. it is inside (i.e. within) its interior. As defined in [DE-9IM](https://en.wikipedia.org/wiki/DE-9IM).
     * @param geospatialGeometry value to set
     * @return this builder instance
     */
    @NotNull public Builder geoWithin(@NotNull GeospatialGeometry geospatialGeometry) {
      putValue("geoWithin", geospatialGeometry);
      return this;
    }
    /**
     * Represents a relationship between two geometries (or the places they represent), relating a geometry to one that contains it, i.e. it is inside (i.e. within) its interior. As defined in [DE-9IM](https://en.wikipedia.org/wiki/DE-9IM).
     * @param geospatialGeometry value to set
     * @return this builder instance
     */
    @NotNull public Builder geoWithin(@NotNull GeospatialGeometry.Builder geospatialGeometry) {
      putValue("geoWithin", geospatialGeometry.build());
      return this;
    }
    /**
     * Represents a relationship between two geometries (or the places they represent), relating a geometry to one that contains it, i.e. it is inside (i.e. within) its interior. As defined in [DE-9IM](https://en.wikipedia.org/wiki/DE-9IM).
     * @param place value to set
     * @return this builder instance
     */
    @NotNull public Builder geoWithin(@NotNull Place place) {
      putValue("geoWithin", place);
      return this;
    }
    /**
     * Represents a relationship between two geometries (or the places they represent), relating a geometry to one that contains it, i.e. it is inside (i.e. within) its interior. As defined in [DE-9IM](https://en.wikipedia.org/wiki/DE-9IM).
     * @param place value to set
     * @return this builder instance
     */
    @NotNull public Builder geoWithin(@NotNull Place.Builder place) {
      putValue("geoWithin", place.build());
      return this;
    }
    /**
     * Remove geoWithin property from the builder.
     * If this property is repeatable, all instances are removed.
     * @return this builder instance
     */
    @NotNull public Builder removeGeoWithin() {
      removeValue("geoWithin");
      return this;
    }
    /**
     * Get currently set value for geoWithin property in this builder.
     * @return previously set value or {@code null}. If multiple values have been 
     * set to this property, then {@link java.util.Collection} instance will be 
     * returned.
     */
    @Nullable public java.lang.Object getGeoWithin() {
      return myData.get("geoWithin");
    }
    /**
     * Upcoming or past event associated with this place, organization, or action.
     * @param event value to set
     * @return this builder instance
     */
    @NotNull public Builder event(@NotNull Event event) {
      putValue("event", event);
      return this;
    }
    /**
     * Upcoming or past event associated with this place, organization, or action.
     * @param event value to set
     * @return this builder instance
     */
    @NotNull public Builder event(@NotNull Event.Builder event) {
      putValue("event", event.build());
      return this;
    }
    /**
     * Remove event property from the builder.
     * If this property is repeatable, all instances are removed.
     * @return this builder instance
     */
    @NotNull public Builder removeEvent() {
      removeValue("event");
      return this;
    }
    /**
     * Get currently set value for event property in this builder.
     * @return previously set value or {@code null}. If multiple values have been 
     * set to this property, then {@link java.util.Collection} instance will be 
     * returned.
     */
    @Nullable public java.lang.Object getEvent() {
      return myData.get("event");
    }
    /**
     * The geo coordinates of the place.
     * @param geoCoordinates value to set
     * @return this builder instance
     */
    @NotNull public Builder geo(@NotNull GeoCoordinates geoCoordinates) {
      putValue("geo", geoCoordinates);
      return this;
    }
    /**
     * The geo coordinates of the place.
     * @param geoCoordinates value to set
     * @return this builder instance
     */
    @NotNull public Builder geo(@NotNull GeoCoordinates.Builder geoCoordinates) {
      putValue("geo", geoCoordinates.build());
      return this;
    }
    /**
     * The geo coordinates of the place.
     * @param geoShape value to set
     * @return this builder instance
     */
    @NotNull public Builder geo(@NotNull GeoShape geoShape) {
      putValue("geo", geoShape);
      return this;
    }
    /**
     * The geo coordinates of the place.
     * @param geoShape value to set
     * @return this builder instance
     */
    @NotNull public Builder geo(@NotNull GeoShape.Builder geoShape) {
      putValue("geo", geoShape.build());
      return this;
    }
    /**
     * Remove geo property from the builder.
     * If this property is repeatable, all instances are removed.
     * @return this builder instance
     */
    @NotNull public Builder removeGeo() {
      removeValue("geo");
      return this;
    }
    /**
     * Get currently set value for geo property in this builder.
     * @return previously set value or {@code null}. If multiple values have been 
     * set to this property, then {@link java.util.Collection} instance will be 
     * returned.
     */
    @Nullable public java.lang.Object getGeo() {
      return myData.get("geo");
    }
    /**
     * Represents spatial relations in which two geometries (or the places they represent) are topologically disjoint: they have no point in common. They form a set of disconnected geometries.&quot; (a symmetric relationship, as defined in [DE-9IM](https://en.wikipedia.org/wiki/DE-9IM))
     * @param geospatialGeometry value to set
     * @return this builder instance
     */
    @NotNull public Builder geoDisjoint(@NotNull GeospatialGeometry geospatialGeometry) {
      putValue("geoDisjoint", geospatialGeometry);
      return this;
    }
    /**
     * Represents spatial relations in which two geometries (or the places they represent) are topologically disjoint: they have no point in common. They form a set of disconnected geometries.&quot; (a symmetric relationship, as defined in [DE-9IM](https://en.wikipedia.org/wiki/DE-9IM))
     * @param geospatialGeometry value to set
     * @return this builder instance
     */
    @NotNull public Builder geoDisjoint(@NotNull GeospatialGeometry.Builder geospatialGeometry) {
      putValue("geoDisjoint", geospatialGeometry.build());
      return this;
    }
    /**
     * Represents spatial relations in which two geometries (or the places they represent) are topologically disjoint: they have no point in common. They form a set of disconnected geometries.&quot; (a symmetric relationship, as defined in [DE-9IM](https://en.wikipedia.org/wiki/DE-9IM))
     * @param place value to set
     * @return this builder instance
     */
    @NotNull public Builder geoDisjoint(@NotNull Place place) {
      putValue("geoDisjoint", place);
      return this;
    }
    /**
     * Represents spatial relations in which two geometries (or the places they represent) are topologically disjoint: they have no point in common. They form a set of disconnected geometries.&quot; (a symmetric relationship, as defined in [DE-9IM](https://en.wikipedia.org/wiki/DE-9IM))
     * @param place value to set
     * @return this builder instance
     */
    @NotNull public Builder geoDisjoint(@NotNull Place.Builder place) {
      putValue("geoDisjoint", place.build());
      return this;
    }
    /**
     * Remove geoDisjoint property from the builder.
     * If this property is repeatable, all instances are removed.
     * @return this builder instance
     */
    @NotNull public Builder removeGeoDisjoint() {
      removeValue("geoDisjoint");
      return this;
    }
    /**
     * Get currently set value for geoDisjoint property in this builder.
     * @return previously set value or {@code null}. If multiple values have been 
     * set to this property, then {@link java.util.Collection} instance will be 
     * returned.
     */
    @Nullable public java.lang.Object getGeoDisjoint() {
      return myData.get("geoDisjoint");
    }
    /**
     * A URL to a map of the place.
     * @param map value to set
     * @return this builder instance
     */
    @NotNull public Builder hasMap(@NotNull Map map) {
      putValue("hasMap", map);
      return this;
    }
    /**
     * A URL to a map of the place.
     * @param map value to set
     * @return this builder instance
     */
    @NotNull public Builder hasMap(@NotNull Map.Builder map) {
      putValue("hasMap", map.build());
      return this;
    }
    /**
     * A URL to a map of the place.
     * @param hasMap value to set
     * @return this builder instance
     */
    @NotNull public Builder hasMap(@NotNull String hasMap) {
      putValue("hasMap", hasMap);
      return this;
    }
    /**
     * Remove hasMap property from the builder.
     * If this property is repeatable, all instances are removed.
     * @return this builder instance
     */
    @NotNull public Builder removeHasMap() {
      removeValue("hasMap");
      return this;
    }
    /**
     * Get currently set value for hasMap property in this builder.
     * @return previously set value or {@code null}. If multiple values have been 
     * set to this property, then {@link java.util.Collection} instance will be 
     * returned.
     */
    @Nullable public java.lang.Object getHasMap() {
      return myData.get("hasMap");
    }
    /**
     * Represents spatial relations in which two geometries (or the places they represent) touch: they have at least one boundary point in common, but no interior points.&quot; (a symmetric relationship, as defined in [DE-9IM](https://en.wikipedia.org/wiki/DE-9IM) )
     * @param geospatialGeometry value to set
     * @return this builder instance
     */
    @NotNull public Builder geoTouches(@NotNull GeospatialGeometry geospatialGeometry) {
      putValue("geoTouches", geospatialGeometry);
      return this;
    }
    /**
     * Represents spatial relations in which two geometries (or the places they represent) touch: they have at least one boundary point in common, but no interior points.&quot; (a symmetric relationship, as defined in [DE-9IM](https://en.wikipedia.org/wiki/DE-9IM) )
     * @param geospatialGeometry value to set
     * @return this builder instance
     */
    @NotNull public Builder geoTouches(@NotNull GeospatialGeometry.Builder geospatialGeometry) {
      putValue("geoTouches", geospatialGeometry.build());
      return this;
    }
    /**
     * Represents spatial relations in which two geometries (or the places they represent) touch: they have at least one boundary point in common, but no interior points.&quot; (a symmetric relationship, as defined in [DE-9IM](https://en.wikipedia.org/wiki/DE-9IM) )
     * @param place value to set
     * @return this builder instance
     */
    @NotNull public Builder geoTouches(@NotNull Place place) {
      putValue("geoTouches", place);
      return this;
    }
    /**
     * Represents spatial relations in which two geometries (or the places they represent) touch: they have at least one boundary point in common, but no interior points.&quot; (a symmetric relationship, as defined in [DE-9IM](https://en.wikipedia.org/wiki/DE-9IM) )
     * @param place value to set
     * @return this builder instance
     */
    @NotNull public Builder geoTouches(@NotNull Place.Builder place) {
      putValue("geoTouches", place.build());
      return this;
    }
    /**
     * Remove geoTouches property from the builder.
     * If this property is repeatable, all instances are removed.
     * @return this builder instance
     */
    @NotNull public Builder removeGeoTouches() {
      removeValue("geoTouches");
      return this;
    }
    /**
     * Get currently set value for geoTouches property in this builder.
     * @return previously set value or {@code null}. If multiple values have been 
     * set to this property, then {@link java.util.Collection} instance will be 
     * returned.
     */
    @Nullable public java.lang.Object getGeoTouches() {
      return myData.get("geoTouches");
    }
    /**
     * Represents spatial relations in which two geometries (or the places they represent) have at least one point in common. As defined in [DE-9IM](https://en.wikipedia.org/wiki/DE-9IM).
     * @param geospatialGeometry value to set
     * @return this builder instance
     */
    @NotNull public Builder geoIntersects(@NotNull GeospatialGeometry geospatialGeometry) {
      putValue("geoIntersects", geospatialGeometry);
      return this;
    }
    /**
     * Represents spatial relations in which two geometries (or the places they represent) have at least one point in common. As defined in [DE-9IM](https://en.wikipedia.org/wiki/DE-9IM).
     * @param geospatialGeometry value to set
     * @return this builder instance
     */
    @NotNull public Builder geoIntersects(@NotNull GeospatialGeometry.Builder geospatialGeometry) {
      putValue("geoIntersects", geospatialGeometry.build());
      return this;
    }
    /**
     * Represents spatial relations in which two geometries (or the places they represent) have at least one point in common. As defined in [DE-9IM](https://en.wikipedia.org/wiki/DE-9IM).
     * @param place value to set
     * @return this builder instance
     */
    @NotNull public Builder geoIntersects(@NotNull Place place) {
      putValue("geoIntersects", place);
      return this;
    }
    /**
     * Represents spatial relations in which two geometries (or the places they represent) have at least one point in common. As defined in [DE-9IM](https://en.wikipedia.org/wiki/DE-9IM).
     * @param place value to set
     * @return this builder instance
     */
    @NotNull public Builder geoIntersects(@NotNull Place.Builder place) {
      putValue("geoIntersects", place.build());
      return this;
    }
    /**
     * Remove geoIntersects property from the builder.
     * If this property is repeatable, all instances are removed.
     * @return this builder instance
     */
    @NotNull public Builder removeGeoIntersects() {
      removeValue("geoIntersects");
      return this;
    }
    /**
     * Get currently set value for geoIntersects property in this builder.
     * @return previously set value or {@code null}. If multiple values have been 
     * set to this property, then {@link java.util.Collection} instance will be 
     * returned.
     */
    @Nullable public java.lang.Object getGeoIntersects() {
      return myData.get("geoIntersects");
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
     * The longitude of a location. For example ```-122.08585``` ([WGS 84](https://en.wikipedia.org/wiki/World_Geodetic_System)).
     * @param integer value to set
     * @return this builder instance
     */
    @NotNull public Builder longitude(@NotNull Integer integer) {
      putValue("longitude", integer);
      return this;
    }
    /**
     * The longitude of a location. For example ```-122.08585``` ([WGS 84](https://en.wikipedia.org/wiki/World_Geodetic_System)).
     * @param longitude value to set
     * @return this builder instance
     */
    @NotNull public Builder longitude(@NotNull Long longitude) {
      putValue("longitude", longitude);
      return this;
    }
    /**
     * The longitude of a location. For example ```-122.08585``` ([WGS 84](https://en.wikipedia.org/wiki/World_Geodetic_System)).
     * @param longitude value to set
     * @return this builder instance
     */
    @NotNull public Builder longitude(@NotNull Float longitude) {
      putValue("longitude", longitude);
      return this;
    }
    /**
     * The longitude of a location. For example ```-122.08585``` ([WGS 84](https://en.wikipedia.org/wiki/World_Geodetic_System)).
     * @param longitude value to set
     * @return this builder instance
     */
    @NotNull public Builder longitude(@NotNull Double longitude) {
      putValue("longitude", longitude);
      return this;
    }
    /**
     * The longitude of a location. For example ```-122.08585``` ([WGS 84](https://en.wikipedia.org/wiki/World_Geodetic_System)).
     * @param longitude value to set
     * @return this builder instance
     */
    @NotNull public Builder longitude(@NotNull String longitude) {
      putValue("longitude", longitude);
      return this;
    }
    /**
     * Remove longitude property from the builder.
     * If this property is repeatable, all instances are removed.
     * @return this builder instance
     */
    @NotNull public Builder removeLongitude() {
      removeValue("longitude");
      return this;
    }
    /**
     * Get currently set value for longitude property in this builder.
     * @return previously set value or {@code null}. If multiple values have been 
     * set to this property, then {@link java.util.Collection} instance will be 
     * returned.
     */
    @Nullable public java.lang.Object getLongitude() {
      return myData.get("longitude");
    }
    /**
     * The telephone number.
     * @param telephone value to set
     * @return this builder instance
     */
    @NotNull public Builder telephone(@NotNull String telephone) {
      putValue("telephone", telephone);
      return this;
    }
    /**
     * Remove telephone property from the builder.
     * If this property is repeatable, all instances are removed.
     * @return this builder instance
     */
    @NotNull public Builder removeTelephone() {
      removeValue("telephone");
      return this;
    }
    /**
     * Get currently set value for telephone property in this builder.
     * @return previously set value or {@code null}. If multiple values have been 
     * set to this property, then {@link java.util.Collection} instance will be 
     * returned.
     */
    @Nullable public java.lang.Object getTelephone() {
      return myData.get("telephone");
    }
    /**
     * Represents a relationship between two geometries (or the places they represent), relating a geometry to another that crosses it: &quot;a crosses b: they have some but not all interior points in common, and the dimension of the intersection is less than that of at least one of them&quot;. As defined in [DE-9IM](https://en.wikipedia.org/wiki/DE-9IM).
     * @param geospatialGeometry value to set
     * @return this builder instance
     */
    @NotNull public Builder geoCrosses(@NotNull GeospatialGeometry geospatialGeometry) {
      putValue("geoCrosses", geospatialGeometry);
      return this;
    }
    /**
     * Represents a relationship between two geometries (or the places they represent), relating a geometry to another that crosses it: &quot;a crosses b: they have some but not all interior points in common, and the dimension of the intersection is less than that of at least one of them&quot;. As defined in [DE-9IM](https://en.wikipedia.org/wiki/DE-9IM).
     * @param geospatialGeometry value to set
     * @return this builder instance
     */
    @NotNull public Builder geoCrosses(@NotNull GeospatialGeometry.Builder geospatialGeometry) {
      putValue("geoCrosses", geospatialGeometry.build());
      return this;
    }
    /**
     * Represents a relationship between two geometries (or the places they represent), relating a geometry to another that crosses it: &quot;a crosses b: they have some but not all interior points in common, and the dimension of the intersection is less than that of at least one of them&quot;. As defined in [DE-9IM](https://en.wikipedia.org/wiki/DE-9IM).
     * @param place value to set
     * @return this builder instance
     */
    @NotNull public Builder geoCrosses(@NotNull Place place) {
      putValue("geoCrosses", place);
      return this;
    }
    /**
     * Represents a relationship between two geometries (or the places they represent), relating a geometry to another that crosses it: &quot;a crosses b: they have some but not all interior points in common, and the dimension of the intersection is less than that of at least one of them&quot;. As defined in [DE-9IM](https://en.wikipedia.org/wiki/DE-9IM).
     * @param place value to set
     * @return this builder instance
     */
    @NotNull public Builder geoCrosses(@NotNull Place.Builder place) {
      putValue("geoCrosses", place.build());
      return this;
    }
    /**
     * Remove geoCrosses property from the builder.
     * If this property is repeatable, all instances are removed.
     * @return this builder instance
     */
    @NotNull public Builder removeGeoCrosses() {
      removeValue("geoCrosses");
      return this;
    }
    /**
     * Get currently set value for geoCrosses property in this builder.
     * @return previously set value or {@code null}. If multiple values have been 
     * set to this property, then {@link java.util.Collection} instance will be 
     * returned.
     */
    @Nullable public java.lang.Object getGeoCrosses() {
      return myData.get("geoCrosses");
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
     * The International Standard of Industrial Classification of All Economic Activities (ISIC), Revision 4 code for a particular organization, business person, or place.
     * @param isicV4 value to set
     * @return this builder instance
     */
    @NotNull public Builder isicV4(@NotNull String isicV4) {
      putValue("isicV4", isicV4);
      return this;
    }
    /**
     * Remove isicV4 property from the builder.
     * If this property is repeatable, all instances are removed.
     * @return this builder instance
     */
    @NotNull public Builder removeIsicV4() {
      removeValue("isicV4");
      return this;
    }
    /**
     * Get currently set value for isicV4 property in this builder.
     * @return previously set value or {@code null}. If multiple values have been 
     * set to this property, then {@link java.util.Collection} instance will be 
     * returned.
     */
    @Nullable public java.lang.Object getIsicV4() {
      return myData.get("isicV4");
    }
    /**
     * A flag to signal that the item, event, or place is accessible for free.
     * @param isAccessibleForFree value to set
     * @return this builder instance
     */
    @NotNull public Builder isAccessibleForFree(@NotNull Boolean isAccessibleForFree) {
      putValue("isAccessibleForFree", isAccessibleForFree);
      return this;
    }
    /**
     * Remove isAccessibleForFree property from the builder.
     * If this property is repeatable, all instances are removed.
     * @return this builder instance
     */
    @NotNull public Builder removeIsAccessibleForFree() {
      removeValue("isAccessibleForFree");
      return this;
    }
    /**
     * Get currently set value for isAccessibleForFree property in this builder.
     * @return previously set value or {@code null}. If multiple values have been 
     * set to this property, then {@link java.util.Collection} instance will be 
     * returned.
     */
    @Nullable public java.lang.Object getIsAccessibleForFree() {
      return myData.get("isAccessibleForFree");
    }
    /**
     * A photograph of this place.
     * @param image value to set
     * @return this builder instance
     */
    @NotNull public Builder photo(@NotNull Image image) {
      putValue("photo", image);
      return this;
    }
    /**
     * Remove photo property from the builder.
     * If this property is repeatable, all instances are removed.
     * @return this builder instance
     */
    @NotNull public Builder removePhoto() {
      removeValue("photo");
      return this;
    }
    /**
     * Get currently set value for photo property in this builder.
     * @return previously set value or {@code null}. If multiple values have been 
     * set to this property, then {@link java.util.Collection} instance will be 
     * returned.
     */
    @Nullable public java.lang.Object getPhoto() {
      return myData.get("photo");
    }
    /**
     * The basic containment relation between a place and one that contains it.
     * @param place value to set
     * @return this builder instance
     */
    @NotNull public Builder containedInPlace(@NotNull Place place) {
      putValue("containedInPlace", place);
      return this;
    }
    /**
     * The basic containment relation between a place and one that contains it.
     * @param place value to set
     * @return this builder instance
     */
    @NotNull public Builder containedInPlace(@NotNull Place.Builder place) {
      putValue("containedInPlace", place.build());
      return this;
    }
    /**
     * Remove containedInPlace property from the builder.
     * If this property is repeatable, all instances are removed.
     * @return this builder instance
     */
    @NotNull public Builder removeContainedInPlace() {
      removeValue("containedInPlace");
      return this;
    }
    /**
     * Get currently set value for containedInPlace property in this builder.
     * @return previously set value or {@code null}. If multiple values have been 
     * set to this property, then {@link java.util.Collection} instance will be 
     * returned.
     */
    @Nullable public java.lang.Object getContainedInPlace() {
      return myData.get("containedInPlace");
    }
    /**
     * Physical address of the item.
     * @param postalAddress value to set
     * @return this builder instance
     */
    @NotNull public Builder address(@NotNull PostalAddress postalAddress) {
      putValue("address", postalAddress);
      return this;
    }
    /**
     * Physical address of the item.
     * @param postalAddress value to set
     * @return this builder instance
     */
    @NotNull public Builder address(@NotNull PostalAddress.Builder postalAddress) {
      putValue("address", postalAddress.build());
      return this;
    }
    /**
     * Physical address of the item.
     * @param address value to set
     * @return this builder instance
     */
    @NotNull public Builder address(@NotNull String address) {
      putValue("address", address);
      return this;
    }
    /**
     * Remove address property from the builder.
     * If this property is repeatable, all instances are removed.
     * @return this builder instance
     */
    @NotNull public Builder removeAddress() {
      removeValue("address");
      return this;
    }
    /**
     * Get currently set value for address property in this builder.
     * @return previously set value or {@code null}. If multiple values have been 
     * set to this property, then {@link java.util.Collection} instance will be 
     * returned.
     */
    @Nullable public java.lang.Object getAddress() {
      return myData.get("address");
    }
    /**
     * Represents a relationship between two geometries (or the places they represent), relating a geometry to another that covers it. As defined in [DE-9IM](https://en.wikipedia.org/wiki/DE-9IM).
     * @param geospatialGeometry value to set
     * @return this builder instance
     */
    @NotNull public Builder geoCoveredBy(@NotNull GeospatialGeometry geospatialGeometry) {
      putValue("geoCoveredBy", geospatialGeometry);
      return this;
    }
    /**
     * Represents a relationship between two geometries (or the places they represent), relating a geometry to another that covers it. As defined in [DE-9IM](https://en.wikipedia.org/wiki/DE-9IM).
     * @param geospatialGeometry value to set
     * @return this builder instance
     */
    @NotNull public Builder geoCoveredBy(@NotNull GeospatialGeometry.Builder geospatialGeometry) {
      putValue("geoCoveredBy", geospatialGeometry.build());
      return this;
    }
    /**
     * Represents a relationship between two geometries (or the places they represent), relating a geometry to another that covers it. As defined in [DE-9IM](https://en.wikipedia.org/wiki/DE-9IM).
     * @param place value to set
     * @return this builder instance
     */
    @NotNull public Builder geoCoveredBy(@NotNull Place place) {
      putValue("geoCoveredBy", place);
      return this;
    }
    /**
     * Represents a relationship between two geometries (or the places they represent), relating a geometry to another that covers it. As defined in [DE-9IM](https://en.wikipedia.org/wiki/DE-9IM).
     * @param place value to set
     * @return this builder instance
     */
    @NotNull public Builder geoCoveredBy(@NotNull Place.Builder place) {
      putValue("geoCoveredBy", place.build());
      return this;
    }
    /**
     * Remove geoCoveredBy property from the builder.
     * If this property is repeatable, all instances are removed.
     * @return this builder instance
     */
    @NotNull public Builder removeGeoCoveredBy() {
      removeValue("geoCoveredBy");
      return this;
    }
    /**
     * Get currently set value for geoCoveredBy property in this builder.
     * @return previously set value or {@code null}. If multiple values have been 
     * set to this property, then {@link java.util.Collection} instance will be 
     * returned.
     */
    @Nullable public java.lang.Object getGeoCoveredBy() {
      return myData.get("geoCoveredBy");
    }
    /**
     * Indicates whether it is allowed to smoke in the place, e.g. in the restaurant, hotel or hotel room.
     * @param smokingAllowed value to set
     * @return this builder instance
     */
    @NotNull public Builder smokingAllowed(@NotNull Boolean smokingAllowed) {
      putValue("smokingAllowed", smokingAllowed);
      return this;
    }
    /**
     * Remove smokingAllowed property from the builder.
     * If this property is repeatable, all instances are removed.
     * @return this builder instance
     */
    @NotNull public Builder removeSmokingAllowed() {
      removeValue("smokingAllowed");
      return this;
    }
    /**
     * Get currently set value for smokingAllowed property in this builder.
     * @return previously set value or {@code null}. If multiple values have been 
     * set to this property, then {@link java.util.Collection} instance will be 
     * returned.
     */
    @Nullable public java.lang.Object getSmokingAllowed() {
      return myData.get("smokingAllowed");
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
     * The latitude of a location. For example ```37.42242``` ([WGS 84](https://en.wikipedia.org/wiki/World_Geodetic_System)).
     * @param number value to set
     * @return this builder instance
     */
    @NotNull public Builder latitude(@NotNull Number number) {
      putValue("latitude", number);
      return this;
    }
    /**
     * The latitude of a location. For example ```37.42242``` ([WGS 84](https://en.wikipedia.org/wiki/World_Geodetic_System)).
     * @param latitude value to set
     * @return this builder instance
     */
    @NotNull public Builder latitude(@NotNull String latitude) {
      putValue("latitude", latitude);
      return this;
    }
    /**
     * Remove latitude property from the builder.
     * If this property is repeatable, all instances are removed.
     * @return this builder instance
     */
    @NotNull public Builder removeLatitude() {
      removeValue("latitude");
      return this;
    }
    /**
     * Get currently set value for latitude property in this builder.
     * @return previously set value or {@code null}. If multiple values have been 
     * set to this property, then {@link java.util.Collection} instance will be 
     * returned.
     */
    @Nullable public java.lang.Object getLatitude() {
      return myData.get("latitude");
    }
    /**
     * Represents spatial relations in which two geometries (or the places they represent) are topologically equal, as defined in [DE-9IM](https://en.wikipedia.org/wiki/DE-9IM). &quot;Two geometries are topologically equal if their interiors intersect and no part of the interior or boundary of one geometry intersects the exterior of the other&quot; (a symmetric relationship)
     * @param geospatialGeometry value to set
     * @return this builder instance
     */
    @NotNull public Builder geoEquals(@NotNull GeospatialGeometry geospatialGeometry) {
      putValue("geoEquals", geospatialGeometry);
      return this;
    }
    /**
     * Represents spatial relations in which two geometries (or the places they represent) are topologically equal, as defined in [DE-9IM](https://en.wikipedia.org/wiki/DE-9IM). &quot;Two geometries are topologically equal if their interiors intersect and no part of the interior or boundary of one geometry intersects the exterior of the other&quot; (a symmetric relationship)
     * @param geospatialGeometry value to set
     * @return this builder instance
     */
    @NotNull public Builder geoEquals(@NotNull GeospatialGeometry.Builder geospatialGeometry) {
      putValue("geoEquals", geospatialGeometry.build());
      return this;
    }
    /**
     * Represents spatial relations in which two geometries (or the places they represent) are topologically equal, as defined in [DE-9IM](https://en.wikipedia.org/wiki/DE-9IM). &quot;Two geometries are topologically equal if their interiors intersect and no part of the interior or boundary of one geometry intersects the exterior of the other&quot; (a symmetric relationship)
     * @param place value to set
     * @return this builder instance
     */
    @NotNull public Builder geoEquals(@NotNull Place place) {
      putValue("geoEquals", place);
      return this;
    }
    /**
     * Represents spatial relations in which two geometries (or the places they represent) are topologically equal, as defined in [DE-9IM](https://en.wikipedia.org/wiki/DE-9IM). &quot;Two geometries are topologically equal if their interiors intersect and no part of the interior or boundary of one geometry intersects the exterior of the other&quot; (a symmetric relationship)
     * @param place value to set
     * @return this builder instance
     */
    @NotNull public Builder geoEquals(@NotNull Place.Builder place) {
      putValue("geoEquals", place.build());
      return this;
    }
    /**
     * Remove geoEquals property from the builder.
     * If this property is repeatable, all instances are removed.
     * @return this builder instance
     */
    @NotNull public Builder removeGeoEquals() {
      removeValue("geoEquals");
      return this;
    }
    /**
     * Get currently set value for geoEquals property in this builder.
     * @return previously set value or {@code null}. If multiple values have been 
     * set to this property, then {@link java.util.Collection} instance will be 
     * returned.
     */
    @Nullable public java.lang.Object getGeoEquals() {
      return myData.get("geoEquals");
    }
    /**
     * Indicates whether some facility (e.g. [[FoodEstablishment]], [[CovidTestingFacility]]) offers a service that can be used by driving through in a car. In the case of [[CovidTestingFacility]] such facilities could potentially help with social distancing from other potentially-infected users.
     * @param hasDriveThroughService value to set
     * @return this builder instance
     */
    @NotNull public Builder hasDriveThroughService(@NotNull Boolean hasDriveThroughService) {
      putValue("hasDriveThroughService", hasDriveThroughService);
      return this;
    }
    /**
     * Remove hasDriveThroughService property from the builder.
     * If this property is repeatable, all instances are removed.
     * @return this builder instance
     */
    @NotNull public Builder removeHasDriveThroughService() {
      removeValue("hasDriveThroughService");
      return this;
    }
    /**
     * Get currently set value for hasDriveThroughService property in this builder.
     * @return previously set value or {@code null}. If multiple values have been 
     * set to this property, then {@link java.util.Collection} instance will be 
     * returned.
     */
    @Nullable public java.lang.Object getHasDriveThroughService() {
      return myData.get("hasDriveThroughService");
    }
    /**
     * The [Global Location Number](http://www.gs1.org/gln) (GLN, sometimes also referred to as International Location Number or ILN) of the respective organization, person, or place. The GLN is a 13-digit number used to identify parties and physical locations.
     * @param identifier value to set
     * @return this builder instance
     */
    @NotNull public Builder globalLocationNumber(@NotNull Identifier identifier) {
      putValue("globalLocationNumber", identifier);
      return this;
    }
    /**
     * Remove globalLocationNumber property from the builder.
     * If this property is repeatable, all instances are removed.
     * @return this builder instance
     */
    @NotNull public Builder removeGlobalLocationNumber() {
      removeValue("globalLocationNumber");
      return this;
    }
    /**
     * Get currently set value for globalLocationNumber property in this builder.
     * @return previously set value or {@code null}. If multiple values have been 
     * set to this property, then {@link java.util.Collection} instance will be 
     * returned.
     */
    @Nullable public java.lang.Object getGlobalLocationNumber() {
      return myData.get("globalLocationNumber");
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
     * The fax number.
     * @param faxNumber value to set
     * @return this builder instance
     */
    @NotNull public Builder faxNumber(@NotNull String faxNumber) {
      putValue("faxNumber", faxNumber);
      return this;
    }
    /**
     * Remove faxNumber property from the builder.
     * If this property is repeatable, all instances are removed.
     * @return this builder instance
     */
    @NotNull public Builder removeFaxNumber() {
      removeValue("faxNumber");
      return this;
    }
    /**
     * Get currently set value for faxNumber property in this builder.
     * @return previously set value or {@code null}. If multiple values have been 
     * set to this property, then {@link java.util.Collection} instance will be 
     * returned.
     */
    @Nullable public java.lang.Object getFaxNumber() {
      return myData.get("faxNumber");
    }
    /**
     * Represents a relationship between two geometries (or the places they represent), relating a geometry to another that geospatially overlaps it, i.e. they have some but not all points in common. As defined in [DE-9IM](https://en.wikipedia.org/wiki/DE-9IM).
     * @param geospatialGeometry value to set
     * @return this builder instance
     */
    @NotNull public Builder geoOverlaps(@NotNull GeospatialGeometry geospatialGeometry) {
      putValue("geoOverlaps", geospatialGeometry);
      return this;
    }
    /**
     * Represents a relationship between two geometries (or the places they represent), relating a geometry to another that geospatially overlaps it, i.e. they have some but not all points in common. As defined in [DE-9IM](https://en.wikipedia.org/wiki/DE-9IM).
     * @param geospatialGeometry value to set
     * @return this builder instance
     */
    @NotNull public Builder geoOverlaps(@NotNull GeospatialGeometry.Builder geospatialGeometry) {
      putValue("geoOverlaps", geospatialGeometry.build());
      return this;
    }
    /**
     * Represents a relationship between two geometries (or the places they represent), relating a geometry to another that geospatially overlaps it, i.e. they have some but not all points in common. As defined in [DE-9IM](https://en.wikipedia.org/wiki/DE-9IM).
     * @param place value to set
     * @return this builder instance
     */
    @NotNull public Builder geoOverlaps(@NotNull Place place) {
      putValue("geoOverlaps", place);
      return this;
    }
    /**
     * Represents a relationship between two geometries (or the places they represent), relating a geometry to another that geospatially overlaps it, i.e. they have some but not all points in common. As defined in [DE-9IM](https://en.wikipedia.org/wiki/DE-9IM).
     * @param place value to set
     * @return this builder instance
     */
    @NotNull public Builder geoOverlaps(@NotNull Place.Builder place) {
      putValue("geoOverlaps", place.build());
      return this;
    }
    /**
     * Remove geoOverlaps property from the builder.
     * If this property is repeatable, all instances are removed.
     * @return this builder instance
     */
    @NotNull public Builder removeGeoOverlaps() {
      removeValue("geoOverlaps");
      return this;
    }
    /**
     * Get currently set value for geoOverlaps property in this builder.
     * @return previously set value or {@code null}. If multiple values have been 
     * set to this property, then {@link java.util.Collection} instance will be 
     * returned.
     */
    @Nullable public java.lang.Object getGeoOverlaps() {
      return myData.get("geoOverlaps");
    }
    /**
     * The total number of individuals that may attend an event or venue.
     * @param integer value to set
     * @return this builder instance
     */
    @NotNull public Builder maximumAttendeeCapacity(@NotNull Integer integer) {
      putValue("maximumAttendeeCapacity", integer);
      return this;
    }
    /**
     * Remove maximumAttendeeCapacity property from the builder.
     * If this property is repeatable, all instances are removed.
     * @return this builder instance
     */
    @NotNull public Builder removeMaximumAttendeeCapacity() {
      removeValue("maximumAttendeeCapacity");
      return this;
    }
    /**
     * Get currently set value for maximumAttendeeCapacity property in this builder.
     * @return previously set value or {@code null}. If multiple values have been 
     * set to this property, then {@link java.util.Collection} instance will be 
     * returned.
     */
    @Nullable public java.lang.Object getMaximumAttendeeCapacity() {
      return myData.get("maximumAttendeeCapacity");
    }
    /**
     * Represents a relationship between two geometries (or the places they represent), relating a covering geometry to a covered geometry. &quot;Every point of b is a point of (the interior or boundary of) a&quot;. As defined in [DE-9IM](https://en.wikipedia.org/wiki/DE-9IM).
     * @param geospatialGeometry value to set
     * @return this builder instance
     */
    @NotNull public Builder geoCovers(@NotNull GeospatialGeometry geospatialGeometry) {
      putValue("geoCovers", geospatialGeometry);
      return this;
    }
    /**
     * Represents a relationship between two geometries (or the places they represent), relating a covering geometry to a covered geometry. &quot;Every point of b is a point of (the interior or boundary of) a&quot;. As defined in [DE-9IM](https://en.wikipedia.org/wiki/DE-9IM).
     * @param geospatialGeometry value to set
     * @return this builder instance
     */
    @NotNull public Builder geoCovers(@NotNull GeospatialGeometry.Builder geospatialGeometry) {
      putValue("geoCovers", geospatialGeometry.build());
      return this;
    }
    /**
     * Represents a relationship between two geometries (or the places they represent), relating a covering geometry to a covered geometry. &quot;Every point of b is a point of (the interior or boundary of) a&quot;. As defined in [DE-9IM](https://en.wikipedia.org/wiki/DE-9IM).
     * @param place value to set
     * @return this builder instance
     */
    @NotNull public Builder geoCovers(@NotNull Place place) {
      putValue("geoCovers", place);
      return this;
    }
    /**
     * Represents a relationship between two geometries (or the places they represent), relating a covering geometry to a covered geometry. &quot;Every point of b is a point of (the interior or boundary of) a&quot;. As defined in [DE-9IM](https://en.wikipedia.org/wiki/DE-9IM).
     * @param place value to set
     * @return this builder instance
     */
    @NotNull public Builder geoCovers(@NotNull Place.Builder place) {
      putValue("geoCovers", place.build());
      return this;
    }
    /**
     * Remove geoCovers property from the builder.
     * If this property is repeatable, all instances are removed.
     * @return this builder instance
     */
    @NotNull public Builder removeGeoCovers() {
      removeValue("geoCovers");
      return this;
    }
    /**
     * Get currently set value for geoCovers property in this builder.
     * @return previously set value or {@code null}. If multiple values have been 
     * set to this property, then {@link java.util.Collection} instance will be 
     * returned.
     */
    @Nullable public java.lang.Object getGeoCovers() {
      return myData.get("geoCovers");
    }
    /**
     * The special opening hours of a certain place.\n\nUse this to explicitly override general opening hours brought in scope by [[openingHoursSpecification]] or [[openingHours]].
     * 
     * @param openingHoursSpecification value to set
     * @return this builder instance
     */
    @NotNull public Builder specialOpeningHoursSpecification(@NotNull OpeningHoursSpecification openingHoursSpecification) {
      putValue("specialOpeningHoursSpecification", openingHoursSpecification);
      return this;
    }
    /**
     * The special opening hours of a certain place.\n\nUse this to explicitly override general opening hours brought in scope by [[openingHoursSpecification]] or [[openingHours]].
     * 
     * @param openingHoursSpecification value to set
     * @return this builder instance
     */
    @NotNull public Builder specialOpeningHoursSpecification(@NotNull OpeningHoursSpecification.Builder openingHoursSpecification) {
      putValue("specialOpeningHoursSpecification", openingHoursSpecification.build());
      return this;
    }
    /**
     * Remove specialOpeningHoursSpecification property from the builder.
     * If this property is repeatable, all instances are removed.
     * @return this builder instance
     */
    @NotNull public Builder removeSpecialOpeningHoursSpecification() {
      removeValue("specialOpeningHoursSpecification");
      return this;
    }
    /**
     * Get currently set value for specialOpeningHoursSpecification property in this builder.
     * @return previously set value or {@code null}. If multiple values have been 
     * set to this property, then {@link java.util.Collection} instance will be 
     * returned.
     */
    @Nullable public java.lang.Object getSpecialOpeningHoursSpecification() {
      return myData.get("specialOpeningHoursSpecification");
    }
    /**
     * The opening hours of a certain place.
     * @param openingHoursSpecification value to set
     * @return this builder instance
     */
    @NotNull public Builder openingHoursSpecification(@NotNull OpeningHoursSpecification openingHoursSpecification) {
      putValue("openingHoursSpecification", openingHoursSpecification);
      return this;
    }
    /**
     * The opening hours of a certain place.
     * @param openingHoursSpecification value to set
     * @return this builder instance
     */
    @NotNull public Builder openingHoursSpecification(@NotNull OpeningHoursSpecification.Builder openingHoursSpecification) {
      putValue("openingHoursSpecification", openingHoursSpecification.build());
      return this;
    }
    /**
     * Remove openingHoursSpecification property from the builder.
     * If this property is repeatable, all instances are removed.
     * @return this builder instance
     */
    @NotNull public Builder removeOpeningHoursSpecification() {
      removeValue("openingHoursSpecification");
      return this;
    }
    /**
     * Get currently set value for openingHoursSpecification property in this builder.
     * @return previously set value or {@code null}. If multiple values have been 
     * set to this property, then {@link java.util.Collection} instance will be 
     * returned.
     */
    @Nullable public java.lang.Object getOpeningHoursSpecification() {
      return myData.get("openingHoursSpecification");
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
     * A short textual code (also called &quot;store code&quot;) that uniquely identifies a place of business. The code is typically assigned by the parentOrganization and used in structured URLs.\n\nFor example, in the URL http://www.starbucks.co.uk/store-locator/etc/detail/3047 the code &quot;3047&quot; is a branchCode for a particular branch.
     * 
     * @param branchCode value to set
     * @return this builder instance
     */
    @NotNull public Builder branchCode(@NotNull String branchCode) {
      putValue("branchCode", branchCode);
      return this;
    }
    /**
     * Remove branchCode property from the builder.
     * If this property is repeatable, all instances are removed.
     * @return this builder instance
     */
    @NotNull public Builder removeBranchCode() {
      removeValue("branchCode");
      return this;
    }
    /**
     * Get currently set value for branchCode property in this builder.
     * @return previously set value or {@code null}. If multiple values have been 
     * set to this property, then {@link java.util.Collection} instance will be 
     * returned.
     */
    @Nullable public java.lang.Object getBranchCode() {
      return myData.get("branchCode");
    }
    /**
     * Represents a relationship between two geometries (or the places they represent), relating a containing geometry to a contained geometry. &quot;a contains b iff no points of b lie in the exterior of a, and at least one point of the interior of b lies in the interior of a&quot;. As defined in [DE-9IM](https://en.wikipedia.org/wiki/DE-9IM).
     * @param geospatialGeometry value to set
     * @return this builder instance
     */
    @NotNull public Builder geoContains(@NotNull GeospatialGeometry geospatialGeometry) {
      putValue("geoContains", geospatialGeometry);
      return this;
    }
    /**
     * Represents a relationship between two geometries (or the places they represent), relating a containing geometry to a contained geometry. &quot;a contains b iff no points of b lie in the exterior of a, and at least one point of the interior of b lies in the interior of a&quot;. As defined in [DE-9IM](https://en.wikipedia.org/wiki/DE-9IM).
     * @param geospatialGeometry value to set
     * @return this builder instance
     */
    @NotNull public Builder geoContains(@NotNull GeospatialGeometry.Builder geospatialGeometry) {
      putValue("geoContains", geospatialGeometry.build());
      return this;
    }
    /**
     * Represents a relationship between two geometries (or the places they represent), relating a containing geometry to a contained geometry. &quot;a contains b iff no points of b lie in the exterior of a, and at least one point of the interior of b lies in the interior of a&quot;. As defined in [DE-9IM](https://en.wikipedia.org/wiki/DE-9IM).
     * @param place value to set
     * @return this builder instance
     */
    @NotNull public Builder geoContains(@NotNull Place place) {
      putValue("geoContains", place);
      return this;
    }
    /**
     * Represents a relationship between two geometries (or the places they represent), relating a containing geometry to a contained geometry. &quot;a contains b iff no points of b lie in the exterior of a, and at least one point of the interior of b lies in the interior of a&quot;. As defined in [DE-9IM](https://en.wikipedia.org/wiki/DE-9IM).
     * @param place value to set
     * @return this builder instance
     */
    @NotNull public Builder geoContains(@NotNull Place.Builder place) {
      putValue("geoContains", place.build());
      return this;
    }
    /**
     * Remove geoContains property from the builder.
     * If this property is repeatable, all instances are removed.
     * @return this builder instance
     */
    @NotNull public Builder removeGeoContains() {
      removeValue("geoContains");
      return this;
    }
    /**
     * Get currently set value for geoContains property in this builder.
     * @return previously set value or {@code null}. If multiple values have been 
     * set to this property, then {@link java.util.Collection} instance will be 
     * returned.
     */
    @Nullable public java.lang.Object getGeoContains() {
      return myData.get("geoContains");
    }
    /**
     * A flag to signal that the [[Place]] is open to public visitors.  If this property is omitted there is no assumed default boolean value
     * @param publicAccess value to set
     * @return this builder instance
     */
    @NotNull public Builder publicAccess(@NotNull Boolean publicAccess) {
      putValue("publicAccess", publicAccess);
      return this;
    }
    /**
     * Remove publicAccess property from the builder.
     * If this property is repeatable, all instances are removed.
     * @return this builder instance
     */
    @NotNull public Builder removePublicAccess() {
      removeValue("publicAccess");
      return this;
    }
    /**
     * Get currently set value for publicAccess property in this builder.
     * @return previously set value or {@code null}. If multiple values have been 
     * set to this property, then {@link java.util.Collection} instance will be 
     * returned.
     */
    @Nullable public java.lang.Object getPublicAccess() {
      return myData.get("publicAccess");
    }
    /**
     * The basic containment relation between a place and another that it contains.
     * @param place value to set
     * @return this builder instance
     */
    @NotNull public Builder containsPlace(@NotNull Place place) {
      putValue("containsPlace", place);
      return this;
    }
    /**
     * The basic containment relation between a place and another that it contains.
     * @param place value to set
     * @return this builder instance
     */
    @NotNull public Builder containsPlace(@NotNull Place.Builder place) {
      putValue("containsPlace", place.build());
      return this;
    }
    /**
     * Remove containsPlace property from the builder.
     * If this property is repeatable, all instances are removed.
     * @return this builder instance
     */
    @NotNull public Builder removeContainsPlace() {
      removeValue("containsPlace");
      return this;
    }
    /**
     * Get currently set value for containsPlace property in this builder.
     * @return previously set value or {@code null}. If multiple values have been 
     * set to this property, then {@link java.util.Collection} instance will be 
     * returned.
     */
    @Nullable public java.lang.Object getContainsPlace() {
      return myData.get("containsPlace");
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
      if ("bed".equals(key) && value instanceof BedDetails) { this.bed((BedDetails)value); return; }
      if ("beds".equals(key) && value instanceof BedDetails) { this.bed((BedDetails)value); return; }
      if ("bed".equals(key) && value instanceof BedType) { this.bed((BedType)value); return; }
      if ("beds".equals(key) && value instanceof BedType) { this.bed((BedType)value); return; }
      if ("bed".equals(key) && value instanceof String) { this.bed((String)value); return; }
      if ("beds".equals(key) && value instanceof String) { this.bed((String)value); return; }
      if ("numberOfRooms".equals(key) && value instanceof Integer) { this.numberOfRooms((Integer)value); return; }
      if ("numberOfRoomss".equals(key) && value instanceof Integer) { this.numberOfRooms((Integer)value); return; }
      if ("numberOfRooms".equals(key) && value instanceof Long) { this.numberOfRooms((Long)value); return; }
      if ("numberOfRoomss".equals(key) && value instanceof Long) { this.numberOfRooms((Long)value); return; }
      if ("numberOfRooms".equals(key) && value instanceof Float) { this.numberOfRooms((Float)value); return; }
      if ("numberOfRoomss".equals(key) && value instanceof Float) { this.numberOfRooms((Float)value); return; }
      if ("numberOfRooms".equals(key) && value instanceof Double) { this.numberOfRooms((Double)value); return; }
      if ("numberOfRoomss".equals(key) && value instanceof Double) { this.numberOfRooms((Double)value); return; }
      if ("numberOfRooms".equals(key) && value instanceof String) { this.numberOfRooms((String)value); return; }
      if ("numberOfRoomss".equals(key) && value instanceof String) { this.numberOfRooms((String)value); return; }
      if ("occupancy".equals(key) && value instanceof QuantitativeValue) { this.occupancy((QuantitativeValue)value); return; }
      if ("occupancys".equals(key) && value instanceof QuantitativeValue) { this.occupancy((QuantitativeValue)value); return; }
      super.fromMap(key, value);
    }
  }
  
}
