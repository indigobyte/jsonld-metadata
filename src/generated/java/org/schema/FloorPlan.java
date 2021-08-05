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
 * A FloorPlan is an explicit representation of a collection of similar accommodations, allowing the provision of common information (room counts, sizes, layout diagrams) and offers for rental or sale. In typical use, some &lt;a class=&quot;localLink&quot; href=&quot;http://schema.org/ApartmentComplex&quot;&gt;ApartmentComplex&lt;/a&gt; has an &lt;a class=&quot;localLink&quot; href=&quot;http://schema.org/accommodationFloorPlan&quot;&gt;accommodationFloorPlan&lt;/a&gt; which is a &lt;a class=&quot;localLink&quot; href=&quot;http://schema.org/FloorPlan&quot;&gt;FloorPlan&lt;/a&gt;.  A FloorPlan is always in the context of a particular place, either a larger &lt;a class=&quot;localLink&quot; href=&quot;http://schema.org/ApartmentComplex&quot;&gt;ApartmentComplex&lt;/a&gt; or a single &lt;a class=&quot;localLink&quot; href=&quot;http://schema.org/Apartment&quot;&gt;Apartment&lt;/a&gt;. The visual/spatial aspects of a floor plan (i.e. room layout, &lt;a href=&quot;https://en.wikipedia.org/wiki/Floor_plan&quot;&gt;see wikipedia&lt;/a&gt;) can be indicated using &lt;a class=&quot;localLink&quot; href=&quot;http://schema.org/image&quot;&gt;image&lt;/a&gt;.Source: https://github.com/schemaorg/schemaorg/issues/2373
 */
public class FloorPlan extends Intangible {
  /**
   * Number of full bathrooms - The total number of full and &frac34; bathrooms in an &lt;a class=&quot;localLink&quot; href=&quot;http://schema.org/Accommodation&quot;&gt;Accommodation&lt;/a&gt;. This corresponds to the &lt;a href=&quot;https://ddwiki.reso.org/display/DDW17/BathroomsFull+Field&quot;&gt;BathroomsFull field in RESO&lt;/a&gt;.
   */
  @JsonIgnore public Integer getNumberOfFullBathroomsInteger() {
    return (Integer) getValue("numberOfFullBathrooms");
  }
  /**
   * Number of full bathrooms - The total number of full and &frac34; bathrooms in an &lt;a class=&quot;localLink&quot; href=&quot;http://schema.org/Accommodation&quot;&gt;Accommodation&lt;/a&gt;. This corresponds to the &lt;a href=&quot;https://ddwiki.reso.org/display/DDW17/BathroomsFull+Field&quot;&gt;BathroomsFull field in RESO&lt;/a&gt;.
   */
  @JsonIgnore public Collection<Integer> getNumberOfFullBathroomsIntegers() {
    final Object current = myData.get("numberOfFullBathrooms");
    if (current == null) return Collections.emptyList();
    if (current instanceof Collection) {
      return (Collection<Integer>) current;
    }
    return Arrays.asList((Integer) current);
  }
  /**
   * Number of full bathrooms - The total number of full and &frac34; bathrooms in an &lt;a class=&quot;localLink&quot; href=&quot;http://schema.org/Accommodation&quot;&gt;Accommodation&lt;/a&gt;. This corresponds to the &lt;a href=&quot;https://ddwiki.reso.org/display/DDW17/BathroomsFull+Field&quot;&gt;BathroomsFull field in RESO&lt;/a&gt;.
   */
  @JsonIgnore public Long getNumberOfFullBathroomsLong() {
    return (Long) getValue("numberOfFullBathrooms");
  }
  /**
   * Number of full bathrooms - The total number of full and &frac34; bathrooms in an &lt;a class=&quot;localLink&quot; href=&quot;http://schema.org/Accommodation&quot;&gt;Accommodation&lt;/a&gt;. This corresponds to the &lt;a href=&quot;https://ddwiki.reso.org/display/DDW17/BathroomsFull+Field&quot;&gt;BathroomsFull field in RESO&lt;/a&gt;.
   */
  @JsonIgnore public Collection<Long> getNumberOfFullBathroomsLongs() {
    final Object current = myData.get("numberOfFullBathrooms");
    if (current == null) return Collections.emptyList();
    if (current instanceof Collection) {
      return (Collection<Long>) current;
    }
    return Arrays.asList((Long) current);
  }
  /**
   * Number of full bathrooms - The total number of full and &frac34; bathrooms in an &lt;a class=&quot;localLink&quot; href=&quot;http://schema.org/Accommodation&quot;&gt;Accommodation&lt;/a&gt;. This corresponds to the &lt;a href=&quot;https://ddwiki.reso.org/display/DDW17/BathroomsFull+Field&quot;&gt;BathroomsFull field in RESO&lt;/a&gt;.
   */
  @JsonIgnore public Float getNumberOfFullBathroomsFloat() {
    return (Float) getValue("numberOfFullBathrooms");
  }
  /**
   * Number of full bathrooms - The total number of full and &frac34; bathrooms in an &lt;a class=&quot;localLink&quot; href=&quot;http://schema.org/Accommodation&quot;&gt;Accommodation&lt;/a&gt;. This corresponds to the &lt;a href=&quot;https://ddwiki.reso.org/display/DDW17/BathroomsFull+Field&quot;&gt;BathroomsFull field in RESO&lt;/a&gt;.
   */
  @JsonIgnore public Collection<Float> getNumberOfFullBathroomsFloats() {
    final Object current = myData.get("numberOfFullBathrooms");
    if (current == null) return Collections.emptyList();
    if (current instanceof Collection) {
      return (Collection<Float>) current;
    }
    return Arrays.asList((Float) current);
  }
  /**
   * Number of full bathrooms - The total number of full and &frac34; bathrooms in an &lt;a class=&quot;localLink&quot; href=&quot;http://schema.org/Accommodation&quot;&gt;Accommodation&lt;/a&gt;. This corresponds to the &lt;a href=&quot;https://ddwiki.reso.org/display/DDW17/BathroomsFull+Field&quot;&gt;BathroomsFull field in RESO&lt;/a&gt;.
   */
  @JsonIgnore public Double getNumberOfFullBathroomsDouble() {
    return (Double) getValue("numberOfFullBathrooms");
  }
  /**
   * Number of full bathrooms - The total number of full and &frac34; bathrooms in an &lt;a class=&quot;localLink&quot; href=&quot;http://schema.org/Accommodation&quot;&gt;Accommodation&lt;/a&gt;. This corresponds to the &lt;a href=&quot;https://ddwiki.reso.org/display/DDW17/BathroomsFull+Field&quot;&gt;BathroomsFull field in RESO&lt;/a&gt;.
   */
  @JsonIgnore public Collection<Double> getNumberOfFullBathroomsDoubles() {
    final Object current = myData.get("numberOfFullBathrooms");
    if (current == null) return Collections.emptyList();
    if (current instanceof Collection) {
      return (Collection<Double>) current;
    }
    return Arrays.asList((Double) current);
  }
  /**
   * Number of full bathrooms - The total number of full and &frac34; bathrooms in an &lt;a class=&quot;localLink&quot; href=&quot;http://schema.org/Accommodation&quot;&gt;Accommodation&lt;/a&gt;. This corresponds to the &lt;a href=&quot;https://ddwiki.reso.org/display/DDW17/BathroomsFull+Field&quot;&gt;BathroomsFull field in RESO&lt;/a&gt;.
   */
  @JsonIgnore public String getNumberOfFullBathroomsString() {
    return (String) getValue("numberOfFullBathrooms");
  }
  /**
   * Number of full bathrooms - The total number of full and &frac34; bathrooms in an &lt;a class=&quot;localLink&quot; href=&quot;http://schema.org/Accommodation&quot;&gt;Accommodation&lt;/a&gt;. This corresponds to the &lt;a href=&quot;https://ddwiki.reso.org/display/DDW17/BathroomsFull+Field&quot;&gt;BathroomsFull field in RESO&lt;/a&gt;.
   */
  @JsonIgnore public Collection<String> getNumberOfFullBathroomsStrings() {
    final Object current = myData.get("numberOfFullBathrooms");
    if (current == null) return Collections.emptyList();
    if (current instanceof Collection) {
      return (Collection<String>) current;
    }
    return Arrays.asList((String) current);
  }
  /**
   * Indicates the number of available accommodation units in an &lt;a class=&quot;localLink&quot; href=&quot;http://schema.org/ApartmentComplex&quot;&gt;ApartmentComplex&lt;/a&gt;, or the number of accommodation units for a specific &lt;a class=&quot;localLink&quot; href=&quot;http://schema.org/FloorPlan&quot;&gt;FloorPlan&lt;/a&gt; (within its specific &lt;a class=&quot;localLink&quot; href=&quot;http://schema.org/ApartmentComplex&quot;&gt;ApartmentComplex&lt;/a&gt;). See also &lt;a class=&quot;localLink&quot; href=&quot;http://schema.org/numberOfAccommodationUnits&quot;&gt;numberOfAccommodationUnits&lt;/a&gt;.
   */
  @JsonIgnore public QuantitativeValue getNumberOfAvailableAccommodationUnits() {
    return (QuantitativeValue) getValue("numberOfAvailableAccommodationUnits");
  }
  /**
   * Indicates the number of available accommodation units in an &lt;a class=&quot;localLink&quot; href=&quot;http://schema.org/ApartmentComplex&quot;&gt;ApartmentComplex&lt;/a&gt;, or the number of accommodation units for a specific &lt;a class=&quot;localLink&quot; href=&quot;http://schema.org/FloorPlan&quot;&gt;FloorPlan&lt;/a&gt; (within its specific &lt;a class=&quot;localLink&quot; href=&quot;http://schema.org/ApartmentComplex&quot;&gt;ApartmentComplex&lt;/a&gt;). See also &lt;a class=&quot;localLink&quot; href=&quot;http://schema.org/numberOfAccommodationUnits&quot;&gt;numberOfAccommodationUnits&lt;/a&gt;.
   */
  @JsonIgnore public Collection<QuantitativeValue> getNumberOfAvailableAccommodationUnitss() {
    final Object current = myData.get("numberOfAvailableAccommodationUnits");
    if (current == null) return Collections.emptyList();
    if (current instanceof Collection) {
      return (Collection<QuantitativeValue>) current;
    }
    return Arrays.asList((QuantitativeValue) current);
  }
  /**
   * The total integer number of bedrooms in a some &lt;a class=&quot;localLink&quot; href=&quot;http://schema.org/Accommodation&quot;&gt;Accommodation&lt;/a&gt;, &lt;a class=&quot;localLink&quot; href=&quot;http://schema.org/ApartmentComplex&quot;&gt;ApartmentComplex&lt;/a&gt; or &lt;a class=&quot;localLink&quot; href=&quot;http://schema.org/FloorPlan&quot;&gt;FloorPlan&lt;/a&gt;.
   */
  @JsonIgnore public Number getNumberOfBedroomsNumber() {
    return (Number) getValue("numberOfBedrooms");
  }
  /**
   * The total integer number of bedrooms in a some &lt;a class=&quot;localLink&quot; href=&quot;http://schema.org/Accommodation&quot;&gt;Accommodation&lt;/a&gt;, &lt;a class=&quot;localLink&quot; href=&quot;http://schema.org/ApartmentComplex&quot;&gt;ApartmentComplex&lt;/a&gt; or &lt;a class=&quot;localLink&quot; href=&quot;http://schema.org/FloorPlan&quot;&gt;FloorPlan&lt;/a&gt;.
   */
  @JsonIgnore public Collection<Number> getNumberOfBedroomsNumbers() {
    final Object current = myData.get("numberOfBedrooms");
    if (current == null) return Collections.emptyList();
    if (current instanceof Collection) {
      return (Collection<Number>) current;
    }
    return Arrays.asList((Number) current);
  }
  /**
   * The total integer number of bedrooms in a some &lt;a class=&quot;localLink&quot; href=&quot;http://schema.org/Accommodation&quot;&gt;Accommodation&lt;/a&gt;, &lt;a class=&quot;localLink&quot; href=&quot;http://schema.org/ApartmentComplex&quot;&gt;ApartmentComplex&lt;/a&gt; or &lt;a class=&quot;localLink&quot; href=&quot;http://schema.org/FloorPlan&quot;&gt;FloorPlan&lt;/a&gt;.
   */
  @JsonIgnore public QuantitativeValue getNumberOfBedroomsQuantitativeValue() {
    return (QuantitativeValue) getValue("numberOfBedrooms");
  }
  /**
   * The total integer number of bedrooms in a some &lt;a class=&quot;localLink&quot; href=&quot;http://schema.org/Accommodation&quot;&gt;Accommodation&lt;/a&gt;, &lt;a class=&quot;localLink&quot; href=&quot;http://schema.org/ApartmentComplex&quot;&gt;ApartmentComplex&lt;/a&gt; or &lt;a class=&quot;localLink&quot; href=&quot;http://schema.org/FloorPlan&quot;&gt;FloorPlan&lt;/a&gt;.
   */
  @JsonIgnore public Collection<QuantitativeValue> getNumberOfBedroomsQuantitativeValues() {
    final Object current = myData.get("numberOfBedrooms");
    if (current == null) return Collections.emptyList();
    if (current instanceof Collection) {
      return (Collection<QuantitativeValue>) current;
    }
    return Arrays.asList((QuantitativeValue) current);
  }
  /**
   * Indicates the total (available plus unavailable) number of accommodation units in an &lt;a class=&quot;localLink&quot; href=&quot;http://schema.org/ApartmentComplex&quot;&gt;ApartmentComplex&lt;/a&gt;, or the number of accommodation units for a specific &lt;a class=&quot;localLink&quot; href=&quot;http://schema.org/FloorPlan&quot;&gt;FloorPlan&lt;/a&gt; (within its specific &lt;a class=&quot;localLink&quot; href=&quot;http://schema.org/ApartmentComplex&quot;&gt;ApartmentComplex&lt;/a&gt;). See also &lt;a class=&quot;localLink&quot; href=&quot;http://schema.org/numberOfAvailableAccommodationUnits&quot;&gt;numberOfAvailableAccommodationUnits&lt;/a&gt;.
   */
  @JsonIgnore public QuantitativeValue getNumberOfAccommodationUnits() {
    return (QuantitativeValue) getValue("numberOfAccommodationUnits");
  }
  /**
   * Indicates the total (available plus unavailable) number of accommodation units in an &lt;a class=&quot;localLink&quot; href=&quot;http://schema.org/ApartmentComplex&quot;&gt;ApartmentComplex&lt;/a&gt;, or the number of accommodation units for a specific &lt;a class=&quot;localLink&quot; href=&quot;http://schema.org/FloorPlan&quot;&gt;FloorPlan&lt;/a&gt; (within its specific &lt;a class=&quot;localLink&quot; href=&quot;http://schema.org/ApartmentComplex&quot;&gt;ApartmentComplex&lt;/a&gt;). See also &lt;a class=&quot;localLink&quot; href=&quot;http://schema.org/numberOfAvailableAccommodationUnits&quot;&gt;numberOfAvailableAccommodationUnits&lt;/a&gt;.
   */
  @JsonIgnore public Collection<QuantitativeValue> getNumberOfAccommodationUnitss() {
    final Object current = myData.get("numberOfAccommodationUnits");
    if (current == null) return Collections.emptyList();
    if (current instanceof Collection) {
      return (Collection<QuantitativeValue>) current;
    }
    return Arrays.asList((QuantitativeValue) current);
  }
  /**
   * Indicates some accommodation that this floor plan describes.
   */
  @JsonIgnore public Accommodation getIsPlanForApartment() {
    return (Accommodation) getValue("isPlanForApartment");
  }
  /**
   * Indicates some accommodation that this floor plan describes.
   */
  @JsonIgnore public Collection<Accommodation> getIsPlanForApartments() {
    final Object current = myData.get("isPlanForApartment");
    if (current == null) return Collections.emptyList();
    if (current instanceof Collection) {
      return (Collection<Accommodation>) current;
    }
    return Arrays.asList((Accommodation) current);
  }
  /**
   * An amenity feature (e.g. a characteristic or service) of the Accommodation. This generic property does not make a statement about whether the feature is included in an offer for the main accommodation or available at extra costs.
   */
  @JsonIgnore public LocationFeatureSpecification getAmenityFeature() {
    return (LocationFeatureSpecification) getValue("amenityFeature");
  }
  /**
   * An amenity feature (e.g. a characteristic or service) of the Accommodation. This generic property does not make a statement about whether the feature is included in an offer for the main accommodation or available at extra costs.
   */
  @JsonIgnore public Collection<LocationFeatureSpecification> getAmenityFeatures() {
    final Object current = myData.get("amenityFeature");
    if (current == null) return Collections.emptyList();
    if (current instanceof Collection) {
      return (Collection<LocationFeatureSpecification>) current;
    }
    return Arrays.asList((LocationFeatureSpecification) current);
  }
  /**
   * The size of the accommodation, e.g. in square meter or squarefoot.
   * Typical unit code(s): MTK for square meter, FTK for square foot, or YDK for square yard
   */
  @JsonIgnore public QuantitativeValue getFloorSize() {
    return (QuantitativeValue) getValue("floorSize");
  }
  /**
   * The size of the accommodation, e.g. in square meter or squarefoot.
   * Typical unit code(s): MTK for square meter, FTK for square foot, or YDK for square yard
   */
  @JsonIgnore public Collection<QuantitativeValue> getFloorSizes() {
    final Object current = myData.get("floorSize");
    if (current == null) return Collections.emptyList();
    if (current instanceof Collection) {
      return (Collection<QuantitativeValue>) current;
    }
    return Arrays.asList((QuantitativeValue) current);
  }
  /**
   * The total integer number of bathrooms in a some &lt;a class=&quot;localLink&quot; href=&quot;http://schema.org/Accommodation&quot;&gt;Accommodation&lt;/a&gt;, following real estate conventions as &lt;a href=&quot;https://ddwiki.reso.org/display/DDW17/BathroomsTotalInteger+Field&quot;&gt;documented in RESO&lt;/a&gt;: &quot;The simple sum of the number of bathrooms. For example for a property with two Full Bathrooms and one Half Bathroom, the Bathrooms Total Integer will be 3.&quot;. See also &lt;a class=&quot;localLink&quot; href=&quot;http://schema.org/numberOfRooms&quot;&gt;numberOfRooms&lt;/a&gt;.
   */
  @JsonIgnore public Integer getNumberOfBathroomsTotal() {
    return (Integer) getValue("numberOfBathroomsTotal");
  }
  /**
   * The total integer number of bathrooms in a some &lt;a class=&quot;localLink&quot; href=&quot;http://schema.org/Accommodation&quot;&gt;Accommodation&lt;/a&gt;, following real estate conventions as &lt;a href=&quot;https://ddwiki.reso.org/display/DDW17/BathroomsTotalInteger+Field&quot;&gt;documented in RESO&lt;/a&gt;: &quot;The simple sum of the number of bathrooms. For example for a property with two Full Bathrooms and one Half Bathroom, the Bathrooms Total Integer will be 3.&quot;. See also &lt;a class=&quot;localLink&quot; href=&quot;http://schema.org/numberOfRooms&quot;&gt;numberOfRooms&lt;/a&gt;.
   */
  @JsonIgnore public Collection<Integer> getNumberOfBathroomsTotals() {
    final Object current = myData.get("numberOfBathroomsTotal");
    if (current == null) return Collections.emptyList();
    if (current instanceof Collection) {
      return (Collection<Integer>) current;
    }
    return Arrays.asList((Integer) current);
  }
  /**
   * The number of rooms (excluding bathrooms and closets) of the accommodation or lodging business.
   * Typical unit code(s): ROM for room or C62 for no unit. The type of room can be put in the unitText property of the QuantitativeValue.
   */
  @JsonIgnore public Number getNumberOfRoomsNumber() {
    return (Number) getValue("numberOfRooms");
  }
  /**
   * The number of rooms (excluding bathrooms and closets) of the accommodation or lodging business.
   * Typical unit code(s): ROM for room or C62 for no unit. The type of room can be put in the unitText property of the QuantitativeValue.
   */
  @JsonIgnore public Collection<Number> getNumberOfRoomsNumbers() {
    final Object current = myData.get("numberOfRooms");
    if (current == null) return Collections.emptyList();
    if (current instanceof Collection) {
      return (Collection<Number>) current;
    }
    return Arrays.asList((Number) current);
  }
  /**
   * The number of rooms (excluding bathrooms and closets) of the accommodation or lodging business.
   * Typical unit code(s): ROM for room or C62 for no unit. The type of room can be put in the unitText property of the QuantitativeValue.
   */
  @JsonIgnore public QuantitativeValue getNumberOfRoomsQuantitativeValue() {
    return (QuantitativeValue) getValue("numberOfRooms");
  }
  /**
   * The number of rooms (excluding bathrooms and closets) of the accommodation or lodging business.
   * Typical unit code(s): ROM for room or C62 for no unit. The type of room can be put in the unitText property of the QuantitativeValue.
   */
  @JsonIgnore public Collection<QuantitativeValue> getNumberOfRoomsQuantitativeValues() {
    final Object current = myData.get("numberOfRooms");
    if (current == null) return Collections.emptyList();
    if (current instanceof Collection) {
      return (Collection<QuantitativeValue>) current;
    }
    return Arrays.asList((QuantitativeValue) current);
  }
  /**
   * Indicates whether pets are allowed to enter the accommodation or lodging business. More detailed information can be put in a text value.
   */
  @JsonIgnore public Boolean getPetsAllowedBoolean() {
    return (Boolean) getValue("petsAllowed");
  }
  /**
   * Indicates whether pets are allowed to enter the accommodation or lodging business. More detailed information can be put in a text value.
   */
  @JsonIgnore public Collection<Boolean> getPetsAllowedBooleans() {
    final Object current = myData.get("petsAllowed");
    if (current == null) return Collections.emptyList();
    if (current instanceof Collection) {
      return (Collection<Boolean>) current;
    }
    return Arrays.asList((Boolean) current);
  }
  /**
   * Indicates whether pets are allowed to enter the accommodation or lodging business. More detailed information can be put in a text value.
   */
  @JsonIgnore public String getPetsAllowedString() {
    return (String) getValue("petsAllowed");
  }
  /**
   * Indicates whether pets are allowed to enter the accommodation or lodging business. More detailed information can be put in a text value.
   */
  @JsonIgnore public Collection<String> getPetsAllowedStrings() {
    final Object current = myData.get("petsAllowed");
    if (current == null) return Collections.emptyList();
    if (current instanceof Collection) {
      return (Collection<String>) current;
    }
    return Arrays.asList((String) current);
  }
  /**
   * Number of partial bathrooms - The total number of half and &frac14; bathrooms in an &lt;a class=&quot;localLink&quot; href=&quot;http://schema.org/Accommodation&quot;&gt;Accommodation&lt;/a&gt;. This corresponds to the &lt;a href=&quot;https://ddwiki.reso.org/display/DDW17/BathroomsPartial+Field&quot;&gt;BathroomsPartial field in RESO&lt;/a&gt;.
   */
  @JsonIgnore public Integer getNumberOfPartialBathroomsInteger() {
    return (Integer) getValue("numberOfPartialBathrooms");
  }
  /**
   * Number of partial bathrooms - The total number of half and &frac14; bathrooms in an &lt;a class=&quot;localLink&quot; href=&quot;http://schema.org/Accommodation&quot;&gt;Accommodation&lt;/a&gt;. This corresponds to the &lt;a href=&quot;https://ddwiki.reso.org/display/DDW17/BathroomsPartial+Field&quot;&gt;BathroomsPartial field in RESO&lt;/a&gt;.
   */
  @JsonIgnore public Collection<Integer> getNumberOfPartialBathroomsIntegers() {
    final Object current = myData.get("numberOfPartialBathrooms");
    if (current == null) return Collections.emptyList();
    if (current instanceof Collection) {
      return (Collection<Integer>) current;
    }
    return Arrays.asList((Integer) current);
  }
  /**
   * Number of partial bathrooms - The total number of half and &frac14; bathrooms in an &lt;a class=&quot;localLink&quot; href=&quot;http://schema.org/Accommodation&quot;&gt;Accommodation&lt;/a&gt;. This corresponds to the &lt;a href=&quot;https://ddwiki.reso.org/display/DDW17/BathroomsPartial+Field&quot;&gt;BathroomsPartial field in RESO&lt;/a&gt;.
   */
  @JsonIgnore public Long getNumberOfPartialBathroomsLong() {
    return (Long) getValue("numberOfPartialBathrooms");
  }
  /**
   * Number of partial bathrooms - The total number of half and &frac14; bathrooms in an &lt;a class=&quot;localLink&quot; href=&quot;http://schema.org/Accommodation&quot;&gt;Accommodation&lt;/a&gt;. This corresponds to the &lt;a href=&quot;https://ddwiki.reso.org/display/DDW17/BathroomsPartial+Field&quot;&gt;BathroomsPartial field in RESO&lt;/a&gt;.
   */
  @JsonIgnore public Collection<Long> getNumberOfPartialBathroomsLongs() {
    final Object current = myData.get("numberOfPartialBathrooms");
    if (current == null) return Collections.emptyList();
    if (current instanceof Collection) {
      return (Collection<Long>) current;
    }
    return Arrays.asList((Long) current);
  }
  /**
   * Number of partial bathrooms - The total number of half and &frac14; bathrooms in an &lt;a class=&quot;localLink&quot; href=&quot;http://schema.org/Accommodation&quot;&gt;Accommodation&lt;/a&gt;. This corresponds to the &lt;a href=&quot;https://ddwiki.reso.org/display/DDW17/BathroomsPartial+Field&quot;&gt;BathroomsPartial field in RESO&lt;/a&gt;.
   */
  @JsonIgnore public Float getNumberOfPartialBathroomsFloat() {
    return (Float) getValue("numberOfPartialBathrooms");
  }
  /**
   * Number of partial bathrooms - The total number of half and &frac14; bathrooms in an &lt;a class=&quot;localLink&quot; href=&quot;http://schema.org/Accommodation&quot;&gt;Accommodation&lt;/a&gt;. This corresponds to the &lt;a href=&quot;https://ddwiki.reso.org/display/DDW17/BathroomsPartial+Field&quot;&gt;BathroomsPartial field in RESO&lt;/a&gt;.
   */
  @JsonIgnore public Collection<Float> getNumberOfPartialBathroomsFloats() {
    final Object current = myData.get("numberOfPartialBathrooms");
    if (current == null) return Collections.emptyList();
    if (current instanceof Collection) {
      return (Collection<Float>) current;
    }
    return Arrays.asList((Float) current);
  }
  /**
   * Number of partial bathrooms - The total number of half and &frac14; bathrooms in an &lt;a class=&quot;localLink&quot; href=&quot;http://schema.org/Accommodation&quot;&gt;Accommodation&lt;/a&gt;. This corresponds to the &lt;a href=&quot;https://ddwiki.reso.org/display/DDW17/BathroomsPartial+Field&quot;&gt;BathroomsPartial field in RESO&lt;/a&gt;.
   */
  @JsonIgnore public Double getNumberOfPartialBathroomsDouble() {
    return (Double) getValue("numberOfPartialBathrooms");
  }
  /**
   * Number of partial bathrooms - The total number of half and &frac14; bathrooms in an &lt;a class=&quot;localLink&quot; href=&quot;http://schema.org/Accommodation&quot;&gt;Accommodation&lt;/a&gt;. This corresponds to the &lt;a href=&quot;https://ddwiki.reso.org/display/DDW17/BathroomsPartial+Field&quot;&gt;BathroomsPartial field in RESO&lt;/a&gt;.
   */
  @JsonIgnore public Collection<Double> getNumberOfPartialBathroomsDoubles() {
    final Object current = myData.get("numberOfPartialBathrooms");
    if (current == null) return Collections.emptyList();
    if (current instanceof Collection) {
      return (Collection<Double>) current;
    }
    return Arrays.asList((Double) current);
  }
  /**
   * Number of partial bathrooms - The total number of half and &frac14; bathrooms in an &lt;a class=&quot;localLink&quot; href=&quot;http://schema.org/Accommodation&quot;&gt;Accommodation&lt;/a&gt;. This corresponds to the &lt;a href=&quot;https://ddwiki.reso.org/display/DDW17/BathroomsPartial+Field&quot;&gt;BathroomsPartial field in RESO&lt;/a&gt;.
   */
  @JsonIgnore public String getNumberOfPartialBathroomsString() {
    return (String) getValue("numberOfPartialBathrooms");
  }
  /**
   * Number of partial bathrooms - The total number of half and &frac14; bathrooms in an &lt;a class=&quot;localLink&quot; href=&quot;http://schema.org/Accommodation&quot;&gt;Accommodation&lt;/a&gt;. This corresponds to the &lt;a href=&quot;https://ddwiki.reso.org/display/DDW17/BathroomsPartial+Field&quot;&gt;BathroomsPartial field in RESO&lt;/a&gt;.
   */
  @JsonIgnore public Collection<String> getNumberOfPartialBathroomsStrings() {
    final Object current = myData.get("numberOfPartialBathrooms");
    if (current == null) return Collections.emptyList();
    if (current instanceof Collection) {
      return (Collection<String>) current;
    }
    return Arrays.asList((String) current);
  }
  protected FloorPlan(java.util.Map<String,Object> data) {
    super(data);
  }
  
  /**
   * Builder for {@link FloorPlan}
   */
  public static class Builder extends Intangible.Builder {
    public Builder(@NotNull HashMap<String,Object> data) {
      super(data);
    }
    @NotNull public FloorPlan build() {
      return new FloorPlan(myData);
    }
    /**
     * Number of full bathrooms - The total number of full and &frac34; bathrooms in an &lt;a class=&quot;localLink&quot; href=&quot;http://schema.org/Accommodation&quot;&gt;Accommodation&lt;/a&gt;. This corresponds to the &lt;a href=&quot;https://ddwiki.reso.org/display/DDW17/BathroomsFull+Field&quot;&gt;BathroomsFull field in RESO&lt;/a&gt;.
     */
    @NotNull public Builder numberOfFullBathrooms(@NotNull Integer integer) {
      putValue("numberOfFullBathrooms", integer);
      return this;
    }
    /**
     * Number of full bathrooms - The total number of full and &frac34; bathrooms in an &lt;a class=&quot;localLink&quot; href=&quot;http://schema.org/Accommodation&quot;&gt;Accommodation&lt;/a&gt;. This corresponds to the &lt;a href=&quot;https://ddwiki.reso.org/display/DDW17/BathroomsFull+Field&quot;&gt;BathroomsFull field in RESO&lt;/a&gt;.
     */
    @NotNull public Builder numberOfFullBathrooms(@NotNull Long numberOfFullBathrooms) {
      putValue("numberOfFullBathrooms", numberOfFullBathrooms);
      return this;
    }
    /**
     * Number of full bathrooms - The total number of full and &frac34; bathrooms in an &lt;a class=&quot;localLink&quot; href=&quot;http://schema.org/Accommodation&quot;&gt;Accommodation&lt;/a&gt;. This corresponds to the &lt;a href=&quot;https://ddwiki.reso.org/display/DDW17/BathroomsFull+Field&quot;&gt;BathroomsFull field in RESO&lt;/a&gt;.
     */
    @NotNull public Builder numberOfFullBathrooms(@NotNull Float numberOfFullBathrooms) {
      putValue("numberOfFullBathrooms", numberOfFullBathrooms);
      return this;
    }
    /**
     * Number of full bathrooms - The total number of full and &frac34; bathrooms in an &lt;a class=&quot;localLink&quot; href=&quot;http://schema.org/Accommodation&quot;&gt;Accommodation&lt;/a&gt;. This corresponds to the &lt;a href=&quot;https://ddwiki.reso.org/display/DDW17/BathroomsFull+Field&quot;&gt;BathroomsFull field in RESO&lt;/a&gt;.
     */
    @NotNull public Builder numberOfFullBathrooms(@NotNull Double numberOfFullBathrooms) {
      putValue("numberOfFullBathrooms", numberOfFullBathrooms);
      return this;
    }
    /**
     * Number of full bathrooms - The total number of full and &frac34; bathrooms in an &lt;a class=&quot;localLink&quot; href=&quot;http://schema.org/Accommodation&quot;&gt;Accommodation&lt;/a&gt;. This corresponds to the &lt;a href=&quot;https://ddwiki.reso.org/display/DDW17/BathroomsFull+Field&quot;&gt;BathroomsFull field in RESO&lt;/a&gt;.
     */
    @NotNull public Builder numberOfFullBathrooms(@NotNull String numberOfFullBathrooms) {
      putValue("numberOfFullBathrooms", numberOfFullBathrooms);
      return this;
    }
    /**
     * Indicates the number of available accommodation units in an &lt;a class=&quot;localLink&quot; href=&quot;http://schema.org/ApartmentComplex&quot;&gt;ApartmentComplex&lt;/a&gt;, or the number of accommodation units for a specific &lt;a class=&quot;localLink&quot; href=&quot;http://schema.org/FloorPlan&quot;&gt;FloorPlan&lt;/a&gt; (within its specific &lt;a class=&quot;localLink&quot; href=&quot;http://schema.org/ApartmentComplex&quot;&gt;ApartmentComplex&lt;/a&gt;). See also &lt;a class=&quot;localLink&quot; href=&quot;http://schema.org/numberOfAccommodationUnits&quot;&gt;numberOfAccommodationUnits&lt;/a&gt;.
     */
    @NotNull public Builder numberOfAvailableAccommodationUnits(@NotNull QuantitativeValue quantitativeValue) {
      putValue("numberOfAvailableAccommodationUnits", quantitativeValue);
      return this;
    }
    /**
     * Indicates the number of available accommodation units in an &lt;a class=&quot;localLink&quot; href=&quot;http://schema.org/ApartmentComplex&quot;&gt;ApartmentComplex&lt;/a&gt;, or the number of accommodation units for a specific &lt;a class=&quot;localLink&quot; href=&quot;http://schema.org/FloorPlan&quot;&gt;FloorPlan&lt;/a&gt; (within its specific &lt;a class=&quot;localLink&quot; href=&quot;http://schema.org/ApartmentComplex&quot;&gt;ApartmentComplex&lt;/a&gt;). See also &lt;a class=&quot;localLink&quot; href=&quot;http://schema.org/numberOfAccommodationUnits&quot;&gt;numberOfAccommodationUnits&lt;/a&gt;.
     */
    @NotNull public Builder numberOfAvailableAccommodationUnits(@NotNull QuantitativeValue.Builder quantitativeValue) {
      putValue("numberOfAvailableAccommodationUnits", quantitativeValue.build());
      return this;
    }
    /**
     * The total integer number of bedrooms in a some &lt;a class=&quot;localLink&quot; href=&quot;http://schema.org/Accommodation&quot;&gt;Accommodation&lt;/a&gt;, &lt;a class=&quot;localLink&quot; href=&quot;http://schema.org/ApartmentComplex&quot;&gt;ApartmentComplex&lt;/a&gt; or &lt;a class=&quot;localLink&quot; href=&quot;http://schema.org/FloorPlan&quot;&gt;FloorPlan&lt;/a&gt;.
     */
    @NotNull public Builder numberOfBedrooms(@NotNull Number number) {
      putValue("numberOfBedrooms", number);
      return this;
    }
    /**
     * The total integer number of bedrooms in a some &lt;a class=&quot;localLink&quot; href=&quot;http://schema.org/Accommodation&quot;&gt;Accommodation&lt;/a&gt;, &lt;a class=&quot;localLink&quot; href=&quot;http://schema.org/ApartmentComplex&quot;&gt;ApartmentComplex&lt;/a&gt; or &lt;a class=&quot;localLink&quot; href=&quot;http://schema.org/FloorPlan&quot;&gt;FloorPlan&lt;/a&gt;.
     */
    @NotNull public Builder numberOfBedrooms(@NotNull QuantitativeValue quantitativeValue) {
      putValue("numberOfBedrooms", quantitativeValue);
      return this;
    }
    /**
     * The total integer number of bedrooms in a some &lt;a class=&quot;localLink&quot; href=&quot;http://schema.org/Accommodation&quot;&gt;Accommodation&lt;/a&gt;, &lt;a class=&quot;localLink&quot; href=&quot;http://schema.org/ApartmentComplex&quot;&gt;ApartmentComplex&lt;/a&gt; or &lt;a class=&quot;localLink&quot; href=&quot;http://schema.org/FloorPlan&quot;&gt;FloorPlan&lt;/a&gt;.
     */
    @NotNull public Builder numberOfBedrooms(@NotNull QuantitativeValue.Builder quantitativeValue) {
      putValue("numberOfBedrooms", quantitativeValue.build());
      return this;
    }
    /**
     * Indicates the total (available plus unavailable) number of accommodation units in an &lt;a class=&quot;localLink&quot; href=&quot;http://schema.org/ApartmentComplex&quot;&gt;ApartmentComplex&lt;/a&gt;, or the number of accommodation units for a specific &lt;a class=&quot;localLink&quot; href=&quot;http://schema.org/FloorPlan&quot;&gt;FloorPlan&lt;/a&gt; (within its specific &lt;a class=&quot;localLink&quot; href=&quot;http://schema.org/ApartmentComplex&quot;&gt;ApartmentComplex&lt;/a&gt;). See also &lt;a class=&quot;localLink&quot; href=&quot;http://schema.org/numberOfAvailableAccommodationUnits&quot;&gt;numberOfAvailableAccommodationUnits&lt;/a&gt;.
     */
    @NotNull public Builder numberOfAccommodationUnits(@NotNull QuantitativeValue quantitativeValue) {
      putValue("numberOfAccommodationUnits", quantitativeValue);
      return this;
    }
    /**
     * Indicates the total (available plus unavailable) number of accommodation units in an &lt;a class=&quot;localLink&quot; href=&quot;http://schema.org/ApartmentComplex&quot;&gt;ApartmentComplex&lt;/a&gt;, or the number of accommodation units for a specific &lt;a class=&quot;localLink&quot; href=&quot;http://schema.org/FloorPlan&quot;&gt;FloorPlan&lt;/a&gt; (within its specific &lt;a class=&quot;localLink&quot; href=&quot;http://schema.org/ApartmentComplex&quot;&gt;ApartmentComplex&lt;/a&gt;). See also &lt;a class=&quot;localLink&quot; href=&quot;http://schema.org/numberOfAvailableAccommodationUnits&quot;&gt;numberOfAvailableAccommodationUnits&lt;/a&gt;.
     */
    @NotNull public Builder numberOfAccommodationUnits(@NotNull QuantitativeValue.Builder quantitativeValue) {
      putValue("numberOfAccommodationUnits", quantitativeValue.build());
      return this;
    }
    /**
     * Indicates some accommodation that this floor plan describes.
     */
    @NotNull public Builder isPlanForApartment(@NotNull Accommodation accommodation) {
      putValue("isPlanForApartment", accommodation);
      return this;
    }
    /**
     * Indicates some accommodation that this floor plan describes.
     */
    @NotNull public Builder isPlanForApartment(@NotNull Accommodation.Builder accommodation) {
      putValue("isPlanForApartment", accommodation.build());
      return this;
    }
    /**
     * An amenity feature (e.g. a characteristic or service) of the Accommodation. This generic property does not make a statement about whether the feature is included in an offer for the main accommodation or available at extra costs.
     */
    @NotNull public Builder amenityFeature(@NotNull LocationFeatureSpecification locationFeatureSpecification) {
      putValue("amenityFeature", locationFeatureSpecification);
      return this;
    }
    /**
     * An amenity feature (e.g. a characteristic or service) of the Accommodation. This generic property does not make a statement about whether the feature is included in an offer for the main accommodation or available at extra costs.
     */
    @NotNull public Builder amenityFeature(@NotNull LocationFeatureSpecification.Builder locationFeatureSpecification) {
      putValue("amenityFeature", locationFeatureSpecification.build());
      return this;
    }
    /**
     * The size of the accommodation, e.g. in square meter or squarefoot.
     * Typical unit code(s): MTK for square meter, FTK for square foot, or YDK for square yard
     */
    @NotNull public Builder floorSize(@NotNull QuantitativeValue quantitativeValue) {
      putValue("floorSize", quantitativeValue);
      return this;
    }
    /**
     * The size of the accommodation, e.g. in square meter or squarefoot.
     * Typical unit code(s): MTK for square meter, FTK for square foot, or YDK for square yard
     */
    @NotNull public Builder floorSize(@NotNull QuantitativeValue.Builder quantitativeValue) {
      putValue("floorSize", quantitativeValue.build());
      return this;
    }
    /**
     * The total integer number of bathrooms in a some &lt;a class=&quot;localLink&quot; href=&quot;http://schema.org/Accommodation&quot;&gt;Accommodation&lt;/a&gt;, following real estate conventions as &lt;a href=&quot;https://ddwiki.reso.org/display/DDW17/BathroomsTotalInteger+Field&quot;&gt;documented in RESO&lt;/a&gt;: &quot;The simple sum of the number of bathrooms. For example for a property with two Full Bathrooms and one Half Bathroom, the Bathrooms Total Integer will be 3.&quot;. See also &lt;a class=&quot;localLink&quot; href=&quot;http://schema.org/numberOfRooms&quot;&gt;numberOfRooms&lt;/a&gt;.
     */
    @NotNull public Builder numberOfBathroomsTotal(@NotNull Integer integer) {
      putValue("numberOfBathroomsTotal", integer);
      return this;
    }
    /**
     * The number of rooms (excluding bathrooms and closets) of the accommodation or lodging business.
     * Typical unit code(s): ROM for room or C62 for no unit. The type of room can be put in the unitText property of the QuantitativeValue.
     */
    @NotNull public Builder numberOfRooms(@NotNull Number number) {
      putValue("numberOfRooms", number);
      return this;
    }
    /**
     * The number of rooms (excluding bathrooms and closets) of the accommodation or lodging business.
     * Typical unit code(s): ROM for room or C62 for no unit. The type of room can be put in the unitText property of the QuantitativeValue.
     */
    @NotNull public Builder numberOfRooms(@NotNull QuantitativeValue quantitativeValue) {
      putValue("numberOfRooms", quantitativeValue);
      return this;
    }
    /**
     * The number of rooms (excluding bathrooms and closets) of the accommodation or lodging business.
     * Typical unit code(s): ROM for room or C62 for no unit. The type of room can be put in the unitText property of the QuantitativeValue.
     */
    @NotNull public Builder numberOfRooms(@NotNull QuantitativeValue.Builder quantitativeValue) {
      putValue("numberOfRooms", quantitativeValue.build());
      return this;
    }
    /**
     * Indicates whether pets are allowed to enter the accommodation or lodging business. More detailed information can be put in a text value.
     */
    @NotNull public Builder petsAllowed(@NotNull Boolean petsAllowed) {
      putValue("petsAllowed", petsAllowed);
      return this;
    }
    /**
     * Indicates whether pets are allowed to enter the accommodation or lodging business. More detailed information can be put in a text value.
     */
    @NotNull public Builder petsAllowed(@NotNull String petsAllowed) {
      putValue("petsAllowed", petsAllowed);
      return this;
    }
    /**
     * Number of partial bathrooms - The total number of half and &frac14; bathrooms in an &lt;a class=&quot;localLink&quot; href=&quot;http://schema.org/Accommodation&quot;&gt;Accommodation&lt;/a&gt;. This corresponds to the &lt;a href=&quot;https://ddwiki.reso.org/display/DDW17/BathroomsPartial+Field&quot;&gt;BathroomsPartial field in RESO&lt;/a&gt;.
     */
    @NotNull public Builder numberOfPartialBathrooms(@NotNull Integer integer) {
      putValue("numberOfPartialBathrooms", integer);
      return this;
    }
    /**
     * Number of partial bathrooms - The total number of half and &frac14; bathrooms in an &lt;a class=&quot;localLink&quot; href=&quot;http://schema.org/Accommodation&quot;&gt;Accommodation&lt;/a&gt;. This corresponds to the &lt;a href=&quot;https://ddwiki.reso.org/display/DDW17/BathroomsPartial+Field&quot;&gt;BathroomsPartial field in RESO&lt;/a&gt;.
     */
    @NotNull public Builder numberOfPartialBathrooms(@NotNull Long numberOfPartialBathrooms) {
      putValue("numberOfPartialBathrooms", numberOfPartialBathrooms);
      return this;
    }
    /**
     * Number of partial bathrooms - The total number of half and &frac14; bathrooms in an &lt;a class=&quot;localLink&quot; href=&quot;http://schema.org/Accommodation&quot;&gt;Accommodation&lt;/a&gt;. This corresponds to the &lt;a href=&quot;https://ddwiki.reso.org/display/DDW17/BathroomsPartial+Field&quot;&gt;BathroomsPartial field in RESO&lt;/a&gt;.
     */
    @NotNull public Builder numberOfPartialBathrooms(@NotNull Float numberOfPartialBathrooms) {
      putValue("numberOfPartialBathrooms", numberOfPartialBathrooms);
      return this;
    }
    /**
     * Number of partial bathrooms - The total number of half and &frac14; bathrooms in an &lt;a class=&quot;localLink&quot; href=&quot;http://schema.org/Accommodation&quot;&gt;Accommodation&lt;/a&gt;. This corresponds to the &lt;a href=&quot;https://ddwiki.reso.org/display/DDW17/BathroomsPartial+Field&quot;&gt;BathroomsPartial field in RESO&lt;/a&gt;.
     */
    @NotNull public Builder numberOfPartialBathrooms(@NotNull Double numberOfPartialBathrooms) {
      putValue("numberOfPartialBathrooms", numberOfPartialBathrooms);
      return this;
    }
    /**
     * Number of partial bathrooms - The total number of half and &frac14; bathrooms in an &lt;a class=&quot;localLink&quot; href=&quot;http://schema.org/Accommodation&quot;&gt;Accommodation&lt;/a&gt;. This corresponds to the &lt;a href=&quot;https://ddwiki.reso.org/display/DDW17/BathroomsPartial+Field&quot;&gt;BathroomsPartial field in RESO&lt;/a&gt;.
     */
    @NotNull public Builder numberOfPartialBathrooms(@NotNull String numberOfPartialBathrooms) {
      putValue("numberOfPartialBathrooms", numberOfPartialBathrooms);
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
      if ("numberOfAvailableAccommodationUnits".equals(key) && value instanceof QuantitativeValue) { this.numberOfAvailableAccommodationUnits((QuantitativeValue)value); return; }
      if ("numberOfAvailableAccommodationUnitss".equals(key) && value instanceof QuantitativeValue) { this.numberOfAvailableAccommodationUnits((QuantitativeValue)value); return; }
      if ("numberOfBedrooms".equals(key) && value instanceof Number) { this.numberOfBedrooms((Number)value); return; }
      if ("numberOfBedroomss".equals(key) && value instanceof Number) { this.numberOfBedrooms((Number)value); return; }
      if ("numberOfBedrooms".equals(key) && value instanceof QuantitativeValue) { this.numberOfBedrooms((QuantitativeValue)value); return; }
      if ("numberOfBedroomss".equals(key) && value instanceof QuantitativeValue) { this.numberOfBedrooms((QuantitativeValue)value); return; }
      if ("numberOfAccommodationUnits".equals(key) && value instanceof QuantitativeValue) { this.numberOfAccommodationUnits((QuantitativeValue)value); return; }
      if ("numberOfAccommodationUnitss".equals(key) && value instanceof QuantitativeValue) { this.numberOfAccommodationUnits((QuantitativeValue)value); return; }
      if ("isPlanForApartment".equals(key) && value instanceof Accommodation) { this.isPlanForApartment((Accommodation)value); return; }
      if ("isPlanForApartments".equals(key) && value instanceof Accommodation) { this.isPlanForApartment((Accommodation)value); return; }
      if ("amenityFeature".equals(key) && value instanceof LocationFeatureSpecification) { this.amenityFeature((LocationFeatureSpecification)value); return; }
      if ("amenityFeatures".equals(key) && value instanceof LocationFeatureSpecification) { this.amenityFeature((LocationFeatureSpecification)value); return; }
      if ("floorSize".equals(key) && value instanceof QuantitativeValue) { this.floorSize((QuantitativeValue)value); return; }
      if ("floorSizes".equals(key) && value instanceof QuantitativeValue) { this.floorSize((QuantitativeValue)value); return; }
      if ("numberOfBathroomsTotal".equals(key) && value instanceof Integer) { this.numberOfBathroomsTotal((Integer)value); return; }
      if ("numberOfBathroomsTotals".equals(key) && value instanceof Integer) { this.numberOfBathroomsTotal((Integer)value); return; }
      if ("numberOfRooms".equals(key) && value instanceof Number) { this.numberOfRooms((Number)value); return; }
      if ("numberOfRoomss".equals(key) && value instanceof Number) { this.numberOfRooms((Number)value); return; }
      if ("numberOfRooms".equals(key) && value instanceof QuantitativeValue) { this.numberOfRooms((QuantitativeValue)value); return; }
      if ("numberOfRoomss".equals(key) && value instanceof QuantitativeValue) { this.numberOfRooms((QuantitativeValue)value); return; }
      if ("petsAllowed".equals(key) && value instanceof Boolean) { this.petsAllowed((Boolean)value); return; }
      if ("petsAlloweds".equals(key) && value instanceof Boolean) { this.petsAllowed((Boolean)value); return; }
      if ("petsAllowed".equals(key) && value instanceof String) { this.petsAllowed((String)value); return; }
      if ("petsAlloweds".equals(key) && value instanceof String) { this.petsAllowed((String)value); return; }
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
      super.fromMap(key, value);
    }
  }
  
}
