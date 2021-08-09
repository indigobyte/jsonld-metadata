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
 * A FloorPlan is an explicit representation of a collection of similar accommodations, allowing the provision of common information (room counts, sizes, layout diagrams) and offers for rental or sale. In typical use, some [[ApartmentComplex]] has an [[accommodationFloorPlan]] which is a [[FloorPlan]].  A FloorPlan is always in the context of a particular place, either a larger [[ApartmentComplex]] or a single [[Apartment]]. The visual/spatial aspects of a floor plan (i.e. room layout, [see wikipedia](https://en.wikipedia.org/wiki/Floor_plan)) can be indicated using [[image]]. 
 */
public class FloorPlan extends Intangible {
  /**
   * Indicates the total (available plus unavailable) number of accommodation units in an [[ApartmentComplex]], or the number of accommodation units for a specific [[FloorPlan]] (within its specific [[ApartmentComplex]]). See also [[numberOfAvailableAccommodationUnits]].
   * @return numberOfAccommodationUnits property set by first invocation of numberOfAccommodationUnits method or {@code null}.
   */
  @JsonIgnore public QuantitativeValue getNumberOfAccommodationUnits() {
    return (QuantitativeValue) getValue("numberOfAccommodationUnits");
  }
  /**
   * Indicates the total (available plus unavailable) number of accommodation units in an [[ApartmentComplex]], or the number of accommodation units for a specific [[FloorPlan]] (within its specific [[ApartmentComplex]]). See also [[numberOfAvailableAccommodationUnits]].
   * @return all numberOfAccommodationUnits properties as {@link java.util.Collection} or an empty collection 
   * if numberOfAccommodationUnits was not set.
   */
  @JsonIgnore public java.util.Collection<QuantitativeValue> getNumberOfAccommodationUnitss() {
    final java.lang.Object current = myData.get("numberOfAccommodationUnits");
    if (current == null) return Collections.emptyList();
    if (current instanceof java.util.Collection) {
      return (java.util.Collection<QuantitativeValue>) current;
    }
    return Arrays.asList((QuantitativeValue) current);
  }
  /**
   * A schematic image showing the floorplan layout.
   * @return layoutImage property set by first invocation of layoutImage method or {@code null}.
   */
  @JsonIgnore public Image getLayoutImage() {
    return (Image) getValue("layoutImage");
  }
  /**
   * A schematic image showing the floorplan layout.
   * @return all layoutImage properties as {@link java.util.Collection} or an empty collection 
   * if layoutImage was not set.
   */
  @JsonIgnore public java.util.Collection<Image> getLayoutImages() {
    final java.lang.Object current = myData.get("layoutImage");
    if (current == null) return Collections.emptyList();
    if (current instanceof java.util.Collection) {
      return (java.util.Collection<Image>) current;
    }
    return Arrays.asList((Image) current);
  }
  /**
   * The total integer number of bathrooms in a some [[Accommodation]], following real estate conventions as [documented in RESO](https://ddwiki.reso.org/display/DDW17/BathroomsTotalInteger+Field): &quot;The simple sum of the number of bathrooms. For example for a property with two Full Bathrooms and one Half Bathroom, the Bathrooms Total Integer will be 3.&quot;. See also [[numberOfRooms]].
   * @return numberOfBathroomsTotal property set by first invocation of numberOfBathroomsTotal method or {@code null}.
   */
  @JsonIgnore public Integer getNumberOfBathroomsTotal() {
    return (Integer) getValue("numberOfBathroomsTotal");
  }
  /**
   * The total integer number of bathrooms in a some [[Accommodation]], following real estate conventions as [documented in RESO](https://ddwiki.reso.org/display/DDW17/BathroomsTotalInteger+Field): &quot;The simple sum of the number of bathrooms. For example for a property with two Full Bathrooms and one Half Bathroom, the Bathrooms Total Integer will be 3.&quot;. See also [[numberOfRooms]].
   * @return all numberOfBathroomsTotal properties as {@link java.util.Collection} or an empty collection 
   * if numberOfBathroomsTotal was not set.
   */
  @JsonIgnore public java.util.Collection<Integer> getNumberOfBathroomsTotals() {
    final java.lang.Object current = myData.get("numberOfBathroomsTotal");
    if (current == null) return Collections.emptyList();
    if (current instanceof java.util.Collection) {
      return (java.util.Collection<Integer>) current;
    }
    return Arrays.asList((Integer) current);
  }
  /**
   * Number of full bathrooms - The total number of full and &frac34; bathrooms in an [[Accommodation]]. This corresponds to the [BathroomsFull field in RESO](https://ddwiki.reso.org/display/DDW17/BathroomsFull+Field).
   * @return numberOfFullBathrooms property set by first invocation of numberOfFullBathrooms method or {@code null}.
   */
  @JsonIgnore public Integer getNumberOfFullBathroomsInteger() {
    return (Integer) getValue("numberOfFullBathrooms");
  }
  /**
   * Number of full bathrooms - The total number of full and &frac34; bathrooms in an [[Accommodation]]. This corresponds to the [BathroomsFull field in RESO](https://ddwiki.reso.org/display/DDW17/BathroomsFull+Field).
   * @return all numberOfFullBathrooms properties as {@link java.util.Collection} or an empty collection 
   * if numberOfFullBathrooms was not set.
   */
  @JsonIgnore public java.util.Collection<Integer> getNumberOfFullBathroomsIntegers() {
    final java.lang.Object current = myData.get("numberOfFullBathrooms");
    if (current == null) return Collections.emptyList();
    if (current instanceof java.util.Collection) {
      return (java.util.Collection<Integer>) current;
    }
    return Arrays.asList((Integer) current);
  }
  /**
   * Number of full bathrooms - The total number of full and &frac34; bathrooms in an [[Accommodation]]. This corresponds to the [BathroomsFull field in RESO](https://ddwiki.reso.org/display/DDW17/BathroomsFull+Field).
   * @return numberOfFullBathrooms property set by first invocation of numberOfFullBathrooms method or {@code null}.
   */
  @JsonIgnore public Long getNumberOfFullBathroomsLong() {
    return (Long) getValue("numberOfFullBathrooms");
  }
  /**
   * Number of full bathrooms - The total number of full and &frac34; bathrooms in an [[Accommodation]]. This corresponds to the [BathroomsFull field in RESO](https://ddwiki.reso.org/display/DDW17/BathroomsFull+Field).
   * @return all numberOfFullBathrooms properties as {@link java.util.Collection} or an empty collection 
   * if numberOfFullBathrooms was not set.
   */
  @JsonIgnore public java.util.Collection<Long> getNumberOfFullBathroomsLongs() {
    final java.lang.Object current = myData.get("numberOfFullBathrooms");
    if (current == null) return Collections.emptyList();
    if (current instanceof java.util.Collection) {
      return (java.util.Collection<Long>) current;
    }
    return Arrays.asList((Long) current);
  }
  /**
   * Number of full bathrooms - The total number of full and &frac34; bathrooms in an [[Accommodation]]. This corresponds to the [BathroomsFull field in RESO](https://ddwiki.reso.org/display/DDW17/BathroomsFull+Field).
   * @return numberOfFullBathrooms property set by first invocation of numberOfFullBathrooms method or {@code null}.
   */
  @JsonIgnore public Float getNumberOfFullBathroomsFloat() {
    return (Float) getValue("numberOfFullBathrooms");
  }
  /**
   * Number of full bathrooms - The total number of full and &frac34; bathrooms in an [[Accommodation]]. This corresponds to the [BathroomsFull field in RESO](https://ddwiki.reso.org/display/DDW17/BathroomsFull+Field).
   * @return all numberOfFullBathrooms properties as {@link java.util.Collection} or an empty collection 
   * if numberOfFullBathrooms was not set.
   */
  @JsonIgnore public java.util.Collection<Float> getNumberOfFullBathroomsFloats() {
    final java.lang.Object current = myData.get("numberOfFullBathrooms");
    if (current == null) return Collections.emptyList();
    if (current instanceof java.util.Collection) {
      return (java.util.Collection<Float>) current;
    }
    return Arrays.asList((Float) current);
  }
  /**
   * Number of full bathrooms - The total number of full and &frac34; bathrooms in an [[Accommodation]]. This corresponds to the [BathroomsFull field in RESO](https://ddwiki.reso.org/display/DDW17/BathroomsFull+Field).
   * @return numberOfFullBathrooms property set by first invocation of numberOfFullBathrooms method or {@code null}.
   */
  @JsonIgnore public Double getNumberOfFullBathroomsDouble() {
    return (Double) getValue("numberOfFullBathrooms");
  }
  /**
   * Number of full bathrooms - The total number of full and &frac34; bathrooms in an [[Accommodation]]. This corresponds to the [BathroomsFull field in RESO](https://ddwiki.reso.org/display/DDW17/BathroomsFull+Field).
   * @return all numberOfFullBathrooms properties as {@link java.util.Collection} or an empty collection 
   * if numberOfFullBathrooms was not set.
   */
  @JsonIgnore public java.util.Collection<Double> getNumberOfFullBathroomsDoubles() {
    final java.lang.Object current = myData.get("numberOfFullBathrooms");
    if (current == null) return Collections.emptyList();
    if (current instanceof java.util.Collection) {
      return (java.util.Collection<Double>) current;
    }
    return Arrays.asList((Double) current);
  }
  /**
   * Number of full bathrooms - The total number of full and &frac34; bathrooms in an [[Accommodation]]. This corresponds to the [BathroomsFull field in RESO](https://ddwiki.reso.org/display/DDW17/BathroomsFull+Field).
   * @return numberOfFullBathrooms property set by first invocation of numberOfFullBathrooms method or {@code null}.
   */
  @JsonIgnore public String getNumberOfFullBathroomsString() {
    return (String) getValue("numberOfFullBathrooms");
  }
  /**
   * Number of full bathrooms - The total number of full and &frac34; bathrooms in an [[Accommodation]]. This corresponds to the [BathroomsFull field in RESO](https://ddwiki.reso.org/display/DDW17/BathroomsFull+Field).
   * @return all numberOfFullBathrooms properties as {@link java.util.Collection} or an empty collection 
   * if numberOfFullBathrooms was not set.
   */
  @JsonIgnore public java.util.Collection<String> getNumberOfFullBathroomsStrings() {
    final java.lang.Object current = myData.get("numberOfFullBathrooms");
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
   * The total integer number of bedrooms in a some [[Accommodation]], [[ApartmentComplex]] or [[FloorPlan]].
   * @return numberOfBedrooms property set by first invocation of numberOfBedrooms method or {@code null}.
   */
  @JsonIgnore public Number getNumberOfBedroomsNumber() {
    return (Number) getValue("numberOfBedrooms");
  }
  /**
   * The total integer number of bedrooms in a some [[Accommodation]], [[ApartmentComplex]] or [[FloorPlan]].
   * @return all numberOfBedrooms properties as {@link java.util.Collection} or an empty collection 
   * if numberOfBedrooms was not set.
   */
  @JsonIgnore public java.util.Collection<Number> getNumberOfBedroomsNumbers() {
    final java.lang.Object current = myData.get("numberOfBedrooms");
    if (current == null) return Collections.emptyList();
    if (current instanceof java.util.Collection) {
      return (java.util.Collection<Number>) current;
    }
    return Arrays.asList((Number) current);
  }
  /**
   * The total integer number of bedrooms in a some [[Accommodation]], [[ApartmentComplex]] or [[FloorPlan]].
   * @return numberOfBedrooms property set by first invocation of numberOfBedrooms method or {@code null}.
   */
  @JsonIgnore public QuantitativeValue getNumberOfBedroomsQuantitativeValue() {
    return (QuantitativeValue) getValue("numberOfBedrooms");
  }
  /**
   * The total integer number of bedrooms in a some [[Accommodation]], [[ApartmentComplex]] or [[FloorPlan]].
   * @return all numberOfBedrooms properties as {@link java.util.Collection} or an empty collection 
   * if numberOfBedrooms was not set.
   */
  @JsonIgnore public java.util.Collection<QuantitativeValue> getNumberOfBedroomsQuantitativeValues() {
    final java.lang.Object current = myData.get("numberOfBedrooms");
    if (current == null) return Collections.emptyList();
    if (current instanceof java.util.Collection) {
      return (java.util.Collection<QuantitativeValue>) current;
    }
    return Arrays.asList((QuantitativeValue) current);
  }
  /**
   * Number of partial bathrooms - The total number of half and &frac14; bathrooms in an [[Accommodation]]. This corresponds to the [BathroomsPartial field in RESO](https://ddwiki.reso.org/display/DDW17/BathroomsPartial+Field). 
   * @return numberOfPartialBathrooms property set by first invocation of numberOfPartialBathrooms method or {@code null}.
   */
  @JsonIgnore public Integer getNumberOfPartialBathroomsInteger() {
    return (Integer) getValue("numberOfPartialBathrooms");
  }
  /**
   * Number of partial bathrooms - The total number of half and &frac14; bathrooms in an [[Accommodation]]. This corresponds to the [BathroomsPartial field in RESO](https://ddwiki.reso.org/display/DDW17/BathroomsPartial+Field). 
   * @return all numberOfPartialBathrooms properties as {@link java.util.Collection} or an empty collection 
   * if numberOfPartialBathrooms was not set.
   */
  @JsonIgnore public java.util.Collection<Integer> getNumberOfPartialBathroomsIntegers() {
    final java.lang.Object current = myData.get("numberOfPartialBathrooms");
    if (current == null) return Collections.emptyList();
    if (current instanceof java.util.Collection) {
      return (java.util.Collection<Integer>) current;
    }
    return Arrays.asList((Integer) current);
  }
  /**
   * Number of partial bathrooms - The total number of half and &frac14; bathrooms in an [[Accommodation]]. This corresponds to the [BathroomsPartial field in RESO](https://ddwiki.reso.org/display/DDW17/BathroomsPartial+Field). 
   * @return numberOfPartialBathrooms property set by first invocation of numberOfPartialBathrooms method or {@code null}.
   */
  @JsonIgnore public Long getNumberOfPartialBathroomsLong() {
    return (Long) getValue("numberOfPartialBathrooms");
  }
  /**
   * Number of partial bathrooms - The total number of half and &frac14; bathrooms in an [[Accommodation]]. This corresponds to the [BathroomsPartial field in RESO](https://ddwiki.reso.org/display/DDW17/BathroomsPartial+Field). 
   * @return all numberOfPartialBathrooms properties as {@link java.util.Collection} or an empty collection 
   * if numberOfPartialBathrooms was not set.
   */
  @JsonIgnore public java.util.Collection<Long> getNumberOfPartialBathroomsLongs() {
    final java.lang.Object current = myData.get("numberOfPartialBathrooms");
    if (current == null) return Collections.emptyList();
    if (current instanceof java.util.Collection) {
      return (java.util.Collection<Long>) current;
    }
    return Arrays.asList((Long) current);
  }
  /**
   * Number of partial bathrooms - The total number of half and &frac14; bathrooms in an [[Accommodation]]. This corresponds to the [BathroomsPartial field in RESO](https://ddwiki.reso.org/display/DDW17/BathroomsPartial+Field). 
   * @return numberOfPartialBathrooms property set by first invocation of numberOfPartialBathrooms method or {@code null}.
   */
  @JsonIgnore public Float getNumberOfPartialBathroomsFloat() {
    return (Float) getValue("numberOfPartialBathrooms");
  }
  /**
   * Number of partial bathrooms - The total number of half and &frac14; bathrooms in an [[Accommodation]]. This corresponds to the [BathroomsPartial field in RESO](https://ddwiki.reso.org/display/DDW17/BathroomsPartial+Field). 
   * @return all numberOfPartialBathrooms properties as {@link java.util.Collection} or an empty collection 
   * if numberOfPartialBathrooms was not set.
   */
  @JsonIgnore public java.util.Collection<Float> getNumberOfPartialBathroomsFloats() {
    final java.lang.Object current = myData.get("numberOfPartialBathrooms");
    if (current == null) return Collections.emptyList();
    if (current instanceof java.util.Collection) {
      return (java.util.Collection<Float>) current;
    }
    return Arrays.asList((Float) current);
  }
  /**
   * Number of partial bathrooms - The total number of half and &frac14; bathrooms in an [[Accommodation]]. This corresponds to the [BathroomsPartial field in RESO](https://ddwiki.reso.org/display/DDW17/BathroomsPartial+Field). 
   * @return numberOfPartialBathrooms property set by first invocation of numberOfPartialBathrooms method or {@code null}.
   */
  @JsonIgnore public Double getNumberOfPartialBathroomsDouble() {
    return (Double) getValue("numberOfPartialBathrooms");
  }
  /**
   * Number of partial bathrooms - The total number of half and &frac14; bathrooms in an [[Accommodation]]. This corresponds to the [BathroomsPartial field in RESO](https://ddwiki.reso.org/display/DDW17/BathroomsPartial+Field). 
   * @return all numberOfPartialBathrooms properties as {@link java.util.Collection} or an empty collection 
   * if numberOfPartialBathrooms was not set.
   */
  @JsonIgnore public java.util.Collection<Double> getNumberOfPartialBathroomsDoubles() {
    final java.lang.Object current = myData.get("numberOfPartialBathrooms");
    if (current == null) return Collections.emptyList();
    if (current instanceof java.util.Collection) {
      return (java.util.Collection<Double>) current;
    }
    return Arrays.asList((Double) current);
  }
  /**
   * Number of partial bathrooms - The total number of half and &frac14; bathrooms in an [[Accommodation]]. This corresponds to the [BathroomsPartial field in RESO](https://ddwiki.reso.org/display/DDW17/BathroomsPartial+Field). 
   * @return numberOfPartialBathrooms property set by first invocation of numberOfPartialBathrooms method or {@code null}.
   */
  @JsonIgnore public String getNumberOfPartialBathroomsString() {
    return (String) getValue("numberOfPartialBathrooms");
  }
  /**
   * Number of partial bathrooms - The total number of half and &frac14; bathrooms in an [[Accommodation]]. This corresponds to the [BathroomsPartial field in RESO](https://ddwiki.reso.org/display/DDW17/BathroomsPartial+Field). 
   * @return all numberOfPartialBathrooms properties as {@link java.util.Collection} or an empty collection 
   * if numberOfPartialBathrooms was not set.
   */
  @JsonIgnore public java.util.Collection<String> getNumberOfPartialBathroomsStrings() {
    final java.lang.Object current = myData.get("numberOfPartialBathrooms");
    if (current == null) return Collections.emptyList();
    if (current instanceof java.util.Collection) {
      return (java.util.Collection<String>) current;
    }
    return Arrays.asList((String) current);
  }
  /**
   *                                 The size of the accommodation, e.g. in square meter or squarefoot.
   * Typical unit code(s): MTK for square meter, FTK for square foot, or YDK for square yard 
   *                                 @return floorSize property set by first invocation of floorSize method or {@code null}.
   */
  @JsonIgnore public QuantitativeValue getFloorSize() {
    return (QuantitativeValue) getValue("floorSize");
  }
  /**
   *                                     The size of the accommodation, e.g. in square meter or squarefoot.
   * Typical unit code(s): MTK for square meter, FTK for square foot, or YDK for square yard 
   *                                     @return all floorSize properties as {@link java.util.Collection} or an empty collection 
   *                                     if floorSize was not set.
   */
  @JsonIgnore public java.util.Collection<QuantitativeValue> getFloorSizes() {
    final java.lang.Object current = myData.get("floorSize");
    if (current == null) return Collections.emptyList();
    if (current instanceof java.util.Collection) {
      return (java.util.Collection<QuantitativeValue>) current;
    }
    return Arrays.asList((QuantitativeValue) current);
  }
  /**
   * Indicates the number of available accommodation units in an [[ApartmentComplex]], or the number of accommodation units for a specific [[FloorPlan]] (within its specific [[ApartmentComplex]]). See also [[numberOfAccommodationUnits]].
   * @return numberOfAvailableAccommodationUnits property set by first invocation of numberOfAvailableAccommodationUnits method or {@code null}.
   */
  @JsonIgnore public QuantitativeValue getNumberOfAvailableAccommodationUnits() {
    return (QuantitativeValue) getValue("numberOfAvailableAccommodationUnits");
  }
  /**
   * Indicates the number of available accommodation units in an [[ApartmentComplex]], or the number of accommodation units for a specific [[FloorPlan]] (within its specific [[ApartmentComplex]]). See also [[numberOfAccommodationUnits]].
   * @return all numberOfAvailableAccommodationUnits properties as {@link java.util.Collection} or an empty collection 
   * if numberOfAvailableAccommodationUnits was not set.
   */
  @JsonIgnore public java.util.Collection<QuantitativeValue> getNumberOfAvailableAccommodationUnitss() {
    final java.lang.Object current = myData.get("numberOfAvailableAccommodationUnits");
    if (current == null) return Collections.emptyList();
    if (current instanceof java.util.Collection) {
      return (java.util.Collection<QuantitativeValue>) current;
    }
    return Arrays.asList((QuantitativeValue) current);
  }
  /**
   * Indicates some accommodation that this floor plan describes.
   * @return isPlanForApartment property set by first invocation of isPlanForApartment method or {@code null}.
   */
  @JsonIgnore public Accommodation getIsPlanForApartment() {
    return (Accommodation) getValue("isPlanForApartment");
  }
  /**
   * Indicates some accommodation that this floor plan describes.
   * @return all isPlanForApartment properties as {@link java.util.Collection} or an empty collection 
   * if isPlanForApartment was not set.
   */
  @JsonIgnore public java.util.Collection<Accommodation> getIsPlanForApartments() {
    final java.lang.Object current = myData.get("isPlanForApartment");
    if (current == null) return Collections.emptyList();
    if (current instanceof java.util.Collection) {
      return (java.util.Collection<Accommodation>) current;
    }
    return Arrays.asList((Accommodation) current);
  }
  /**
   * An amenity feature (e.g. a characteristic or service) of the Accommodation. This generic property does not make a statement about whether the feature is included in an offer for the main accommodation or available at extra costs.
   * @return amenityFeature property set by first invocation of amenityFeature method or {@code null}.
   */
  @JsonIgnore public LocationFeatureSpecification getAmenityFeature() {
    return (LocationFeatureSpecification) getValue("amenityFeature");
  }
  /**
   * An amenity feature (e.g. a characteristic or service) of the Accommodation. This generic property does not make a statement about whether the feature is included in an offer for the main accommodation or available at extra costs.
   * @return all amenityFeature properties as {@link java.util.Collection} or an empty collection 
   * if amenityFeature was not set.
   */
  @JsonIgnore public java.util.Collection<LocationFeatureSpecification> getAmenityFeatures() {
    final java.lang.Object current = myData.get("amenityFeature");
    if (current == null) return Collections.emptyList();
    if (current instanceof java.util.Collection) {
      return (java.util.Collection<LocationFeatureSpecification>) current;
    }
    return Arrays.asList((LocationFeatureSpecification) current);
  }
  /**
   * Indicates whether pets are allowed to enter the accommodation or lodging business. More detailed information can be put in a text value.
   * @return petsAllowed property set by first invocation of petsAllowed method or {@code null}.
   */
  @JsonIgnore public Boolean getPetsAllowedBoolean() {
    return (Boolean) getValue("petsAllowed");
  }
  /**
   * Indicates whether pets are allowed to enter the accommodation or lodging business. More detailed information can be put in a text value.
   * @return all petsAllowed properties as {@link java.util.Collection} or an empty collection 
   * if petsAllowed was not set.
   */
  @JsonIgnore public java.util.Collection<Boolean> getPetsAllowedBooleans() {
    final java.lang.Object current = myData.get("petsAllowed");
    if (current == null) return Collections.emptyList();
    if (current instanceof java.util.Collection) {
      return (java.util.Collection<Boolean>) current;
    }
    return Arrays.asList((Boolean) current);
  }
  /**
   * Indicates whether pets are allowed to enter the accommodation or lodging business. More detailed information can be put in a text value.
   * @return petsAllowed property set by first invocation of petsAllowed method or {@code null}.
   */
  @JsonIgnore public String getPetsAllowedString() {
    return (String) getValue("petsAllowed");
  }
  /**
   * Indicates whether pets are allowed to enter the accommodation or lodging business. More detailed information can be put in a text value.
   * @return all petsAllowed properties as {@link java.util.Collection} or an empty collection 
   * if petsAllowed was not set.
   */
  @JsonIgnore public java.util.Collection<String> getPetsAllowedStrings() {
    final java.lang.Object current = myData.get("petsAllowed");
    if (current == null) return Collections.emptyList();
    if (current instanceof java.util.Collection) {
      return (java.util.Collection<String>) current;
    }
    return Arrays.asList((String) current);
  }
  protected FloorPlan(java.util.Map<String,java.lang.Object> data) {
    super(data);
  }
  /**
   * @return new {@link Builder} initialized with this instance's data
   */
  @NotNull public Builder toBuilder() {
    return new Builder(new HashMap<>(this.myData));
  }
  
  /**
   * Builder for {@link FloorPlan}
   */
  public static class Builder extends Intangible.Builder {
    public Builder(@NotNull HashMap<String,java.lang.Object> data) {
      super(data);
    }
    @NotNull public FloorPlan build() {
      return new FloorPlan(myData);
    }
    /**
     * Indicates the total (available plus unavailable) number of accommodation units in an [[ApartmentComplex]], or the number of accommodation units for a specific [[FloorPlan]] (within its specific [[ApartmentComplex]]). See also [[numberOfAvailableAccommodationUnits]].
     * @param quantitativeValue value to set
     * @return this builder instance
     */
    @NotNull public Builder numberOfAccommodationUnits(@NotNull QuantitativeValue quantitativeValue) {
      putValue("numberOfAccommodationUnits", quantitativeValue);
      return this;
    }
    /**
     * Indicates the total (available plus unavailable) number of accommodation units in an [[ApartmentComplex]], or the number of accommodation units for a specific [[FloorPlan]] (within its specific [[ApartmentComplex]]). See also [[numberOfAvailableAccommodationUnits]].
     * @param quantitativeValue value to set
     * @return this builder instance
     */
    @NotNull public Builder numberOfAccommodationUnits(@NotNull QuantitativeValue.Builder quantitativeValue) {
      putValue("numberOfAccommodationUnits", quantitativeValue.build());
      return this;
    }
    /**
     * Remove numberOfAccommodationUnits property from the builder.
     * If this property is repeatable, all instances are removed.
     * @return this builder instance
     */
    @NotNull public Builder removeNumberOfAccommodationUnits() {
      removeValue("numberOfAccommodationUnits");
      return this;
    }
    /**
     * Get currently set value for numberOfAccommodationUnits property in this builder.
     * @return previously set value or {@code null}. If multiple values have been 
     * set to this property, then {@link java.util.Collection} instance will be 
     * returned.
     */
    @Nullable public java.lang.Object getNumberOfAccommodationUnits() {
      return myData.get("numberOfAccommodationUnits");
    }
    /**
     * A schematic image showing the floorplan layout.
     * @param image value to set
     * @return this builder instance
     */
    @NotNull public Builder layoutImage(@NotNull Image image) {
      putValue("layoutImage", image);
      return this;
    }
    /**
     * Remove layoutImage property from the builder.
     * If this property is repeatable, all instances are removed.
     * @return this builder instance
     */
    @NotNull public Builder removeLayoutImage() {
      removeValue("layoutImage");
      return this;
    }
    /**
     * Get currently set value for layoutImage property in this builder.
     * @return previously set value or {@code null}. If multiple values have been 
     * set to this property, then {@link java.util.Collection} instance will be 
     * returned.
     */
    @Nullable public java.lang.Object getLayoutImage() {
      return myData.get("layoutImage");
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
     * Indicates the number of available accommodation units in an [[ApartmentComplex]], or the number of accommodation units for a specific [[FloorPlan]] (within its specific [[ApartmentComplex]]). See also [[numberOfAccommodationUnits]].
     * @param quantitativeValue value to set
     * @return this builder instance
     */
    @NotNull public Builder numberOfAvailableAccommodationUnits(@NotNull QuantitativeValue quantitativeValue) {
      putValue("numberOfAvailableAccommodationUnits", quantitativeValue);
      return this;
    }
    /**
     * Indicates the number of available accommodation units in an [[ApartmentComplex]], or the number of accommodation units for a specific [[FloorPlan]] (within its specific [[ApartmentComplex]]). See also [[numberOfAccommodationUnits]].
     * @param quantitativeValue value to set
     * @return this builder instance
     */
    @NotNull public Builder numberOfAvailableAccommodationUnits(@NotNull QuantitativeValue.Builder quantitativeValue) {
      putValue("numberOfAvailableAccommodationUnits", quantitativeValue.build());
      return this;
    }
    /**
     * Remove numberOfAvailableAccommodationUnits property from the builder.
     * If this property is repeatable, all instances are removed.
     * @return this builder instance
     */
    @NotNull public Builder removeNumberOfAvailableAccommodationUnits() {
      removeValue("numberOfAvailableAccommodationUnits");
      return this;
    }
    /**
     * Get currently set value for numberOfAvailableAccommodationUnits property in this builder.
     * @return previously set value or {@code null}. If multiple values have been 
     * set to this property, then {@link java.util.Collection} instance will be 
     * returned.
     */
    @Nullable public java.lang.Object getNumberOfAvailableAccommodationUnits() {
      return myData.get("numberOfAvailableAccommodationUnits");
    }
    /**
     * Indicates some accommodation that this floor plan describes.
     * @param accommodation value to set
     * @return this builder instance
     */
    @NotNull public Builder isPlanForApartment(@NotNull Accommodation accommodation) {
      putValue("isPlanForApartment", accommodation);
      return this;
    }
    /**
     * Indicates some accommodation that this floor plan describes.
     * @param accommodation value to set
     * @return this builder instance
     */
    @NotNull public Builder isPlanForApartment(@NotNull Accommodation.Builder accommodation) {
      putValue("isPlanForApartment", accommodation.build());
      return this;
    }
    /**
     * Remove isPlanForApartment property from the builder.
     * If this property is repeatable, all instances are removed.
     * @return this builder instance
     */
    @NotNull public Builder removeIsPlanForApartment() {
      removeValue("isPlanForApartment");
      return this;
    }
    /**
     * Get currently set value for isPlanForApartment property in this builder.
     * @return previously set value or {@code null}. If multiple values have been 
     * set to this property, then {@link java.util.Collection} instance will be 
     * returned.
     */
    @Nullable public java.lang.Object getIsPlanForApartment() {
      return myData.get("isPlanForApartment");
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
      if ("numberOfAccommodationUnits".equals(key) && value instanceof QuantitativeValue) { this.numberOfAccommodationUnits((QuantitativeValue)value); return; }
      if ("numberOfAccommodationUnitss".equals(key) && value instanceof QuantitativeValue) { this.numberOfAccommodationUnits((QuantitativeValue)value); return; }
      if ("layoutImage".equals(key) && value instanceof Image) { this.layoutImage((Image)value); return; }
      if ("layoutImages".equals(key) && value instanceof Image) { this.layoutImage((Image)value); return; }
      if ("numberOfBathroomsTotal".equals(key) && value instanceof Integer) { this.numberOfBathroomsTotal((Integer)value); return; }
      if ("numberOfBathroomsTotals".equals(key) && value instanceof Integer) { this.numberOfBathroomsTotal((Integer)value); return; }
      if ("numberOfFullBathrooms".equals(key) && value instanceof Integer) { this.numberOfFullBathrooms((Integer)value); return; }
      if ("numberOfFullBathroomss".equals(key) && value instanceof Integer) { this.numberOfFullBathrooms((Integer)value); return; }
      if ("numberOfFullBathrooms".equals(key) && value instanceof Long) { this.numberOfFullBathrooms((Long)value); return; }
      if ("numberOfFullBathroomss".equals(key) && value instanceof Long) { this.numberOfFullBathrooms((Long)value); return; }
      if ("numberOfFullBathrooms".equals(key) && value instanceof Float) { this.numberOfFullBathrooms((Float)value); return; }
      if ("numberOfFullBathroomss".equals(key) && value instanceof Float) { this.numberOfFullBathrooms((Float)value); return; }
      if ("numberOfFullBathrooms".equals(key) && value instanceof Double) { this.numberOfFullBathrooms((Double)value); return; }
      if ("numberOfFullBathroomss".equals(key) && value instanceof Double) { this.numberOfFullBathrooms((Double)value); return; }
      if ("numberOfFullBathrooms".equals(key) && value instanceof String) { this.numberOfFullBathrooms((String)value); return; }
      if ("numberOfFullBathroomss".equals(key) && value instanceof String) { this.numberOfFullBathrooms((String)value); return; }
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
      if ("numberOfBedrooms".equals(key) && value instanceof Number) { this.numberOfBedrooms((Number)value); return; }
      if ("numberOfBedroomss".equals(key) && value instanceof Number) { this.numberOfBedrooms((Number)value); return; }
      if ("numberOfBedrooms".equals(key) && value instanceof QuantitativeValue) { this.numberOfBedrooms((QuantitativeValue)value); return; }
      if ("numberOfBedroomss".equals(key) && value instanceof QuantitativeValue) { this.numberOfBedrooms((QuantitativeValue)value); return; }
      if ("numberOfPartialBathrooms".equals(key) && value instanceof Integer) { this.numberOfPartialBathrooms((Integer)value); return; }
      if ("numberOfPartialBathroomss".equals(key) && value instanceof Integer) { this.numberOfPartialBathrooms((Integer)value); return; }
      if ("numberOfPartialBathrooms".equals(key) && value instanceof Long) { this.numberOfPartialBathrooms((Long)value); return; }
      if ("numberOfPartialBathroomss".equals(key) && value instanceof Long) { this.numberOfPartialBathrooms((Long)value); return; }
      if ("numberOfPartialBathrooms".equals(key) && value instanceof Float) { this.numberOfPartialBathrooms((Float)value); return; }
      if ("numberOfPartialBathroomss".equals(key) && value instanceof Float) { this.numberOfPartialBathrooms((Float)value); return; }
      if ("numberOfPartialBathrooms".equals(key) && value instanceof Double) { this.numberOfPartialBathrooms((Double)value); return; }
      if ("numberOfPartialBathroomss".equals(key) && value instanceof Double) { this.numberOfPartialBathrooms((Double)value); return; }
      if ("numberOfPartialBathrooms".equals(key) && value instanceof String) { this.numberOfPartialBathrooms((String)value); return; }
      if ("numberOfPartialBathroomss".equals(key) && value instanceof String) { this.numberOfPartialBathrooms((String)value); return; }
      if ("floorSize".equals(key) && value instanceof QuantitativeValue) { this.floorSize((QuantitativeValue)value); return; }
      if ("floorSizes".equals(key) && value instanceof QuantitativeValue) { this.floorSize((QuantitativeValue)value); return; }
      if ("numberOfAvailableAccommodationUnits".equals(key) && value instanceof QuantitativeValue) { this.numberOfAvailableAccommodationUnits((QuantitativeValue)value); return; }
      if ("numberOfAvailableAccommodationUnitss".equals(key) && value instanceof QuantitativeValue) { this.numberOfAvailableAccommodationUnits((QuantitativeValue)value); return; }
      if ("isPlanForApartment".equals(key) && value instanceof Accommodation) { this.isPlanForApartment((Accommodation)value); return; }
      if ("isPlanForApartments".equals(key) && value instanceof Accommodation) { this.isPlanForApartment((Accommodation)value); return; }
      if ("amenityFeature".equals(key) && value instanceof LocationFeatureSpecification) { this.amenityFeature((LocationFeatureSpecification)value); return; }
      if ("amenityFeatures".equals(key) && value instanceof LocationFeatureSpecification) { this.amenityFeature((LocationFeatureSpecification)value); return; }
      if ("petsAllowed".equals(key) && value instanceof Boolean) { this.petsAllowed((Boolean)value); return; }
      if ("petsAlloweds".equals(key) && value instanceof Boolean) { this.petsAllowed((Boolean)value); return; }
      if ("petsAllowed".equals(key) && value instanceof String) { this.petsAllowed((String)value); return; }
      if ("petsAlloweds".equals(key) && value instanceof String) { this.petsAllowed((String)value); return; }
      super.fromMap(key, value);
    }
  }
  
}
