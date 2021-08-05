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
 * An accommodation is a place that can accommodate human beings, e.g. a hotel room, a camping pitch, or a meeting room. Many accommodations are for overnight stays, but this is not a mandatory requirement.
 * For more specific types of accommodations not defined in schema.org, one can use additionalType with external vocabularies.
 * &lt;br /&gt;&lt;br /&gt;
 * See also the &lt;a href=&quot;/docs/hotels.html&quot;&gt;dedicated document on the use of schema.org for marking up hotels and other forms of accommodations&lt;/a&gt;.Source: https://www.w3.org/wiki/WebSchemas/SchemaDotOrgSources#STI_Accommodation_Ontology
 */
public class Accommodation extends Place {
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
   * A page providing information on how to book a tour of some &lt;a class=&quot;localLink&quot; href=&quot;http://schema.org/Place&quot;&gt;Place&lt;/a&gt;, such as an &lt;a class=&quot;localLink&quot; href=&quot;http://schema.org/Accommodation&quot;&gt;Accommodation&lt;/a&gt; or &lt;a class=&quot;localLink&quot; href=&quot;http://schema.org/ApartmentComplex&quot;&gt;ApartmentComplex&lt;/a&gt; in a real estate setting, as well as other kinds of tours as appropriate.
   */
  @JsonIgnore public String getTourBookingPage() {
    return (String) getValue("tourBookingPage");
  }
  /**
   * A page providing information on how to book a tour of some &lt;a class=&quot;localLink&quot; href=&quot;http://schema.org/Place&quot;&gt;Place&lt;/a&gt;, such as an &lt;a class=&quot;localLink&quot; href=&quot;http://schema.org/Accommodation&quot;&gt;Accommodation&lt;/a&gt; or &lt;a class=&quot;localLink&quot; href=&quot;http://schema.org/ApartmentComplex&quot;&gt;ApartmentComplex&lt;/a&gt; in a real estate setting, as well as other kinds of tours as appropriate.
   */
  @JsonIgnore public Collection<String> getTourBookingPages() {
    final Object current = myData.get("tourBookingPage");
    if (current == null) return Collections.emptyList();
    if (current instanceof Collection) {
      return (Collection<String>) current;
    }
    return Arrays.asList((String) current);
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
   * Length of the lease for some &lt;a class=&quot;localLink&quot; href=&quot;http://schema.org/Accommodation&quot;&gt;Accommodation&lt;/a&gt;, either particular to some &lt;a class=&quot;localLink&quot; href=&quot;http://schema.org/Offer&quot;&gt;Offer&lt;/a&gt; or in some cases intrinsic to the property.
   */
  @JsonIgnore public Duration getLeaseLengthDuration() {
    return (Duration) getValue("leaseLength");
  }
  /**
   * Length of the lease for some &lt;a class=&quot;localLink&quot; href=&quot;http://schema.org/Accommodation&quot;&gt;Accommodation&lt;/a&gt;, either particular to some &lt;a class=&quot;localLink&quot; href=&quot;http://schema.org/Offer&quot;&gt;Offer&lt;/a&gt; or in some cases intrinsic to the property.
   */
  @JsonIgnore public Collection<Duration> getLeaseLengthDurations() {
    final Object current = myData.get("leaseLength");
    if (current == null) return Collections.emptyList();
    if (current instanceof Collection) {
      return (Collection<Duration>) current;
    }
    return Arrays.asList((Duration) current);
  }
  /**
   * Length of the lease for some &lt;a class=&quot;localLink&quot; href=&quot;http://schema.org/Accommodation&quot;&gt;Accommodation&lt;/a&gt;, either particular to some &lt;a class=&quot;localLink&quot; href=&quot;http://schema.org/Offer&quot;&gt;Offer&lt;/a&gt; or in some cases intrinsic to the property.
   */
  @JsonIgnore public QuantitativeValue getLeaseLengthQuantitativeValue() {
    return (QuantitativeValue) getValue("leaseLength");
  }
  /**
   * Length of the lease for some &lt;a class=&quot;localLink&quot; href=&quot;http://schema.org/Accommodation&quot;&gt;Accommodation&lt;/a&gt;, either particular to some &lt;a class=&quot;localLink&quot; href=&quot;http://schema.org/Offer&quot;&gt;Offer&lt;/a&gt; or in some cases intrinsic to the property.
   */
  @JsonIgnore public Collection<QuantitativeValue> getLeaseLengthQuantitativeValues() {
    final Object current = myData.get("leaseLength");
    if (current == null) return Collections.emptyList();
    if (current instanceof Collection) {
      return (Collection<QuantitativeValue>) current;
    }
    return Arrays.asList((QuantitativeValue) current);
  }
  /**
   * A floorplan of some &lt;a class=&quot;localLink&quot; href=&quot;http://schema.org/Accommodation&quot;&gt;Accommodation&lt;/a&gt;.
   */
  @JsonIgnore public FloorPlan getAccommodationFloorPlan() {
    return (FloorPlan) getValue("accommodationFloorPlan");
  }
  /**
   * A floorplan of some &lt;a class=&quot;localLink&quot; href=&quot;http://schema.org/Accommodation&quot;&gt;Accommodation&lt;/a&gt;.
   */
  @JsonIgnore public Collection<FloorPlan> getAccommodationFloorPlans() {
    final Object current = myData.get("accommodationFloorPlan");
    if (current == null) return Collections.emptyList();
    if (current instanceof Collection) {
      return (Collection<FloorPlan>) current;
    }
    return Arrays.asList((FloorPlan) current);
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
   * The year an &lt;a class=&quot;localLink&quot; href=&quot;http://schema.org/Accommodation&quot;&gt;Accommodation&lt;/a&gt; was constructed. This corresponds to the &lt;a href=&quot;https://ddwiki.reso.org/display/DDW17/YearBuilt+Field&quot;&gt;YearBuilt field in RESO&lt;/a&gt;.
   */
  @JsonIgnore public Integer getYearBuiltInteger() {
    return (Integer) getValue("yearBuilt");
  }
  /**
   * The year an &lt;a class=&quot;localLink&quot; href=&quot;http://schema.org/Accommodation&quot;&gt;Accommodation&lt;/a&gt; was constructed. This corresponds to the &lt;a href=&quot;https://ddwiki.reso.org/display/DDW17/YearBuilt+Field&quot;&gt;YearBuilt field in RESO&lt;/a&gt;.
   */
  @JsonIgnore public Collection<Integer> getYearBuiltIntegers() {
    final Object current = myData.get("yearBuilt");
    if (current == null) return Collections.emptyList();
    if (current instanceof Collection) {
      return (Collection<Integer>) current;
    }
    return Arrays.asList((Integer) current);
  }
  /**
   * The year an &lt;a class=&quot;localLink&quot; href=&quot;http://schema.org/Accommodation&quot;&gt;Accommodation&lt;/a&gt; was constructed. This corresponds to the &lt;a href=&quot;https://ddwiki.reso.org/display/DDW17/YearBuilt+Field&quot;&gt;YearBuilt field in RESO&lt;/a&gt;.
   */
  @JsonIgnore public Long getYearBuiltLong() {
    return (Long) getValue("yearBuilt");
  }
  /**
   * The year an &lt;a class=&quot;localLink&quot; href=&quot;http://schema.org/Accommodation&quot;&gt;Accommodation&lt;/a&gt; was constructed. This corresponds to the &lt;a href=&quot;https://ddwiki.reso.org/display/DDW17/YearBuilt+Field&quot;&gt;YearBuilt field in RESO&lt;/a&gt;.
   */
  @JsonIgnore public Collection<Long> getYearBuiltLongs() {
    final Object current = myData.get("yearBuilt");
    if (current == null) return Collections.emptyList();
    if (current instanceof Collection) {
      return (Collection<Long>) current;
    }
    return Arrays.asList((Long) current);
  }
  /**
   * The year an &lt;a class=&quot;localLink&quot; href=&quot;http://schema.org/Accommodation&quot;&gt;Accommodation&lt;/a&gt; was constructed. This corresponds to the &lt;a href=&quot;https://ddwiki.reso.org/display/DDW17/YearBuilt+Field&quot;&gt;YearBuilt field in RESO&lt;/a&gt;.
   */
  @JsonIgnore public Float getYearBuiltFloat() {
    return (Float) getValue("yearBuilt");
  }
  /**
   * The year an &lt;a class=&quot;localLink&quot; href=&quot;http://schema.org/Accommodation&quot;&gt;Accommodation&lt;/a&gt; was constructed. This corresponds to the &lt;a href=&quot;https://ddwiki.reso.org/display/DDW17/YearBuilt+Field&quot;&gt;YearBuilt field in RESO&lt;/a&gt;.
   */
  @JsonIgnore public Collection<Float> getYearBuiltFloats() {
    final Object current = myData.get("yearBuilt");
    if (current == null) return Collections.emptyList();
    if (current instanceof Collection) {
      return (Collection<Float>) current;
    }
    return Arrays.asList((Float) current);
  }
  /**
   * The year an &lt;a class=&quot;localLink&quot; href=&quot;http://schema.org/Accommodation&quot;&gt;Accommodation&lt;/a&gt; was constructed. This corresponds to the &lt;a href=&quot;https://ddwiki.reso.org/display/DDW17/YearBuilt+Field&quot;&gt;YearBuilt field in RESO&lt;/a&gt;.
   */
  @JsonIgnore public Double getYearBuiltDouble() {
    return (Double) getValue("yearBuilt");
  }
  /**
   * The year an &lt;a class=&quot;localLink&quot; href=&quot;http://schema.org/Accommodation&quot;&gt;Accommodation&lt;/a&gt; was constructed. This corresponds to the &lt;a href=&quot;https://ddwiki.reso.org/display/DDW17/YearBuilt+Field&quot;&gt;YearBuilt field in RESO&lt;/a&gt;.
   */
  @JsonIgnore public Collection<Double> getYearBuiltDoubles() {
    final Object current = myData.get("yearBuilt");
    if (current == null) return Collections.emptyList();
    if (current instanceof Collection) {
      return (Collection<Double>) current;
    }
    return Arrays.asList((Double) current);
  }
  /**
   * The year an &lt;a class=&quot;localLink&quot; href=&quot;http://schema.org/Accommodation&quot;&gt;Accommodation&lt;/a&gt; was constructed. This corresponds to the &lt;a href=&quot;https://ddwiki.reso.org/display/DDW17/YearBuilt+Field&quot;&gt;YearBuilt field in RESO&lt;/a&gt;.
   */
  @JsonIgnore public String getYearBuiltString() {
    return (String) getValue("yearBuilt");
  }
  /**
   * The year an &lt;a class=&quot;localLink&quot; href=&quot;http://schema.org/Accommodation&quot;&gt;Accommodation&lt;/a&gt; was constructed. This corresponds to the &lt;a href=&quot;https://ddwiki.reso.org/display/DDW17/YearBuilt+Field&quot;&gt;YearBuilt field in RESO&lt;/a&gt;.
   */
  @JsonIgnore public Collection<String> getYearBuiltStrings() {
    final Object current = myData.get("yearBuilt");
    if (current == null) return Collections.emptyList();
    if (current instanceof Collection) {
      return (Collection<String>) current;
    }
    return Arrays.asList((String) current);
  }
  /**
   * Category of an &lt;a class=&quot;localLink&quot; href=&quot;http://schema.org/Accommodation&quot;&gt;Accommodation&lt;/a&gt;, following real estate conventions e.g. RESO (see &lt;a href=&quot;https://ddwiki.reso.org/display/DDW17/PropertySubType+Field&quot;&gt;PropertySubType&lt;/a&gt;, and &lt;a href=&quot;https://ddwiki.reso.org/display/DDW17/PropertyType+Field&quot;&gt;PropertyType&lt;/a&gt; fields  for suggested values).
   */
  @JsonIgnore public String getAccommodationCategory() {
    return (String) getValue("accommodationCategory");
  }
  /**
   * Category of an &lt;a class=&quot;localLink&quot; href=&quot;http://schema.org/Accommodation&quot;&gt;Accommodation&lt;/a&gt;, following real estate conventions e.g. RESO (see &lt;a href=&quot;https://ddwiki.reso.org/display/DDW17/PropertySubType+Field&quot;&gt;PropertySubType&lt;/a&gt;, and &lt;a href=&quot;https://ddwiki.reso.org/display/DDW17/PropertyType+Field&quot;&gt;PropertyType&lt;/a&gt; fields  for suggested values).
   */
  @JsonIgnore public Collection<String> getAccommodationCategorys() {
    final Object current = myData.get("accommodationCategory");
    if (current == null) return Collections.emptyList();
    if (current instanceof Collection) {
      return (Collection<String>) current;
    }
    return Arrays.asList((String) current);
  }
  /**
   * The floor level for an &lt;a class=&quot;localLink&quot; href=&quot;http://schema.org/Accommodation&quot;&gt;Accommodation&lt;/a&gt; in a multi-storey building. Since counting
   *   systems &lt;a href=&quot;https://en.wikipedia.org/wiki/Storey#Consecutive_number_floor_designations&quot;&gt;vary internationally&lt;/a&gt;, the local system should be used where possible.
   */
  @JsonIgnore public String getFloorLevel() {
    return (String) getValue("floorLevel");
  }
  /**
   * The floor level for an &lt;a class=&quot;localLink&quot; href=&quot;http://schema.org/Accommodation&quot;&gt;Accommodation&lt;/a&gt; in a multi-storey building. Since counting
   *   systems &lt;a href=&quot;https://en.wikipedia.org/wiki/Storey#Consecutive_number_floor_designations&quot;&gt;vary internationally&lt;/a&gt;, the local system should be used where possible.
   */
  @JsonIgnore public Collection<String> getFloorLevels() {
    final Object current = myData.get("floorLevel");
    if (current == null) return Collections.emptyList();
    if (current instanceof Collection) {
      return (Collection<String>) current;
    }
    return Arrays.asList((String) current);
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
   * Indications regarding the permitted usage of the accommodation.
   */
  @JsonIgnore public String getPermittedUsage() {
    return (String) getValue("permittedUsage");
  }
  /**
   * Indications regarding the permitted usage of the accommodation.
   */
  @JsonIgnore public Collection<String> getPermittedUsages() {
    final Object current = myData.get("permittedUsage");
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
  protected Accommodation(java.util.Map<String,Object> data) {
    super(data);
  }
  
  /**
   * Builder for {@link Accommodation}
   */
  public static class Builder extends Place.Builder {
    public Builder(@NotNull HashMap<String,Object> data) {
      super(data);
    }
    @NotNull public Accommodation build() {
      return new Accommodation(myData);
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
     * A page providing information on how to book a tour of some &lt;a class=&quot;localLink&quot; href=&quot;http://schema.org/Place&quot;&gt;Place&lt;/a&gt;, such as an &lt;a class=&quot;localLink&quot; href=&quot;http://schema.org/Accommodation&quot;&gt;Accommodation&lt;/a&gt; or &lt;a class=&quot;localLink&quot; href=&quot;http://schema.org/ApartmentComplex&quot;&gt;ApartmentComplex&lt;/a&gt; in a real estate setting, as well as other kinds of tours as appropriate.
     */
    @NotNull public Builder tourBookingPage(@NotNull String tourBookingPage) {
      putValue("tourBookingPage", tourBookingPage);
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
     * Length of the lease for some &lt;a class=&quot;localLink&quot; href=&quot;http://schema.org/Accommodation&quot;&gt;Accommodation&lt;/a&gt;, either particular to some &lt;a class=&quot;localLink&quot; href=&quot;http://schema.org/Offer&quot;&gt;Offer&lt;/a&gt; or in some cases intrinsic to the property.
     */
    @NotNull public Builder leaseLength(@NotNull Duration duration) {
      putValue("leaseLength", duration);
      return this;
    }
    /**
     * Length of the lease for some &lt;a class=&quot;localLink&quot; href=&quot;http://schema.org/Accommodation&quot;&gt;Accommodation&lt;/a&gt;, either particular to some &lt;a class=&quot;localLink&quot; href=&quot;http://schema.org/Offer&quot;&gt;Offer&lt;/a&gt; or in some cases intrinsic to the property.
     */
    @NotNull public Builder leaseLength(@NotNull QuantitativeValue quantitativeValue) {
      putValue("leaseLength", quantitativeValue);
      return this;
    }
    /**
     * Length of the lease for some &lt;a class=&quot;localLink&quot; href=&quot;http://schema.org/Accommodation&quot;&gt;Accommodation&lt;/a&gt;, either particular to some &lt;a class=&quot;localLink&quot; href=&quot;http://schema.org/Offer&quot;&gt;Offer&lt;/a&gt; or in some cases intrinsic to the property.
     */
    @NotNull public Builder leaseLength(@NotNull QuantitativeValue.Builder quantitativeValue) {
      putValue("leaseLength", quantitativeValue.build());
      return this;
    }
    /**
     * A floorplan of some &lt;a class=&quot;localLink&quot; href=&quot;http://schema.org/Accommodation&quot;&gt;Accommodation&lt;/a&gt;.
     */
    @NotNull public Builder accommodationFloorPlan(@NotNull FloorPlan floorPlan) {
      putValue("accommodationFloorPlan", floorPlan);
      return this;
    }
    /**
     * A floorplan of some &lt;a class=&quot;localLink&quot; href=&quot;http://schema.org/Accommodation&quot;&gt;Accommodation&lt;/a&gt;.
     */
    @NotNull public Builder accommodationFloorPlan(@NotNull FloorPlan.Builder floorPlan) {
      putValue("accommodationFloorPlan", floorPlan.build());
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
     * The year an &lt;a class=&quot;localLink&quot; href=&quot;http://schema.org/Accommodation&quot;&gt;Accommodation&lt;/a&gt; was constructed. This corresponds to the &lt;a href=&quot;https://ddwiki.reso.org/display/DDW17/YearBuilt+Field&quot;&gt;YearBuilt field in RESO&lt;/a&gt;.
     */
    @NotNull public Builder yearBuilt(@NotNull Integer integer) {
      putValue("yearBuilt", integer);
      return this;
    }
    /**
     * The year an &lt;a class=&quot;localLink&quot; href=&quot;http://schema.org/Accommodation&quot;&gt;Accommodation&lt;/a&gt; was constructed. This corresponds to the &lt;a href=&quot;https://ddwiki.reso.org/display/DDW17/YearBuilt+Field&quot;&gt;YearBuilt field in RESO&lt;/a&gt;.
     */
    @NotNull public Builder yearBuilt(@NotNull Long yearBuilt) {
      putValue("yearBuilt", yearBuilt);
      return this;
    }
    /**
     * The year an &lt;a class=&quot;localLink&quot; href=&quot;http://schema.org/Accommodation&quot;&gt;Accommodation&lt;/a&gt; was constructed. This corresponds to the &lt;a href=&quot;https://ddwiki.reso.org/display/DDW17/YearBuilt+Field&quot;&gt;YearBuilt field in RESO&lt;/a&gt;.
     */
    @NotNull public Builder yearBuilt(@NotNull Float yearBuilt) {
      putValue("yearBuilt", yearBuilt);
      return this;
    }
    /**
     * The year an &lt;a class=&quot;localLink&quot; href=&quot;http://schema.org/Accommodation&quot;&gt;Accommodation&lt;/a&gt; was constructed. This corresponds to the &lt;a href=&quot;https://ddwiki.reso.org/display/DDW17/YearBuilt+Field&quot;&gt;YearBuilt field in RESO&lt;/a&gt;.
     */
    @NotNull public Builder yearBuilt(@NotNull Double yearBuilt) {
      putValue("yearBuilt", yearBuilt);
      return this;
    }
    /**
     * The year an &lt;a class=&quot;localLink&quot; href=&quot;http://schema.org/Accommodation&quot;&gt;Accommodation&lt;/a&gt; was constructed. This corresponds to the &lt;a href=&quot;https://ddwiki.reso.org/display/DDW17/YearBuilt+Field&quot;&gt;YearBuilt field in RESO&lt;/a&gt;.
     */
    @NotNull public Builder yearBuilt(@NotNull String yearBuilt) {
      putValue("yearBuilt", yearBuilt);
      return this;
    }
    /**
     * Category of an &lt;a class=&quot;localLink&quot; href=&quot;http://schema.org/Accommodation&quot;&gt;Accommodation&lt;/a&gt;, following real estate conventions e.g. RESO (see &lt;a href=&quot;https://ddwiki.reso.org/display/DDW17/PropertySubType+Field&quot;&gt;PropertySubType&lt;/a&gt;, and &lt;a href=&quot;https://ddwiki.reso.org/display/DDW17/PropertyType+Field&quot;&gt;PropertyType&lt;/a&gt; fields  for suggested values).
     */
    @NotNull public Builder accommodationCategory(@NotNull String accommodationCategory) {
      putValue("accommodationCategory", accommodationCategory);
      return this;
    }
    /**
     * The floor level for an &lt;a class=&quot;localLink&quot; href=&quot;http://schema.org/Accommodation&quot;&gt;Accommodation&lt;/a&gt; in a multi-storey building. Since counting
     *   systems &lt;a href=&quot;https://en.wikipedia.org/wiki/Storey#Consecutive_number_floor_designations&quot;&gt;vary internationally&lt;/a&gt;, the local system should be used where possible.
     */
    @NotNull public Builder floorLevel(@NotNull String floorLevel) {
      putValue("floorLevel", floorLevel);
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
     * Indications regarding the permitted usage of the accommodation.
     */
    @NotNull public Builder permittedUsage(@NotNull String permittedUsage) {
      putValue("permittedUsage", permittedUsage);
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
     * Represents spatial relations in which two geometries (or the places they represent) are topologically disjoint: they have no point in common. They form a set of disconnected geometries.&quot; (a symmetric relationship, as defined in &lt;a href=&quot;https://en.wikipedia.org/wiki/DE-9IM&quot;&gt;DE-9IM&lt;/a&gt;)
     */
    @NotNull public Builder geoDisjoint(@NotNull GeospatialGeometry geospatialGeometry) {
      putValue("geoDisjoint", geospatialGeometry);
      return this;
    }
    /**
     * Represents spatial relations in which two geometries (or the places they represent) are topologically disjoint: they have no point in common. They form a set of disconnected geometries.&quot; (a symmetric relationship, as defined in &lt;a href=&quot;https://en.wikipedia.org/wiki/DE-9IM&quot;&gt;DE-9IM&lt;/a&gt;)
     */
    @NotNull public Builder geoDisjoint(@NotNull GeospatialGeometry.Builder geospatialGeometry) {
      putValue("geoDisjoint", geospatialGeometry.build());
      return this;
    }
    /**
     * Represents spatial relations in which two geometries (or the places they represent) are topologically disjoint: they have no point in common. They form a set of disconnected geometries.&quot; (a symmetric relationship, as defined in &lt;a href=&quot;https://en.wikipedia.org/wiki/DE-9IM&quot;&gt;DE-9IM&lt;/a&gt;)
     */
    @NotNull public Builder geoDisjoint(@NotNull Place place) {
      putValue("geoDisjoint", place);
      return this;
    }
    /**
     * Represents spatial relations in which two geometries (or the places they represent) are topologically disjoint: they have no point in common. They form a set of disconnected geometries.&quot; (a symmetric relationship, as defined in &lt;a href=&quot;https://en.wikipedia.org/wiki/DE-9IM&quot;&gt;DE-9IM&lt;/a&gt;)
     */
    @NotNull public Builder geoDisjoint(@NotNull Place.Builder place) {
      putValue("geoDisjoint", place.build());
      return this;
    }
    /**
     * Represents spatial relations in which two geometries (or the places they represent) are topologically equal, as defined in &lt;a href=&quot;https://en.wikipedia.org/wiki/DE-9IM&quot;&gt;DE-9IM&lt;/a&gt;. &quot;Two geometries are topologically equal if their interiors intersect and no part of the interior or boundary of one geometry intersects the exterior of the other&quot; (a symmetric relationship)
     */
    @NotNull public Builder geoEquals(@NotNull GeospatialGeometry geospatialGeometry) {
      putValue("geoEquals", geospatialGeometry);
      return this;
    }
    /**
     * Represents spatial relations in which two geometries (or the places they represent) are topologically equal, as defined in &lt;a href=&quot;https://en.wikipedia.org/wiki/DE-9IM&quot;&gt;DE-9IM&lt;/a&gt;. &quot;Two geometries are topologically equal if their interiors intersect and no part of the interior or boundary of one geometry intersects the exterior of the other&quot; (a symmetric relationship)
     */
    @NotNull public Builder geoEquals(@NotNull GeospatialGeometry.Builder geospatialGeometry) {
      putValue("geoEquals", geospatialGeometry.build());
      return this;
    }
    /**
     * Represents spatial relations in which two geometries (or the places they represent) are topologically equal, as defined in &lt;a href=&quot;https://en.wikipedia.org/wiki/DE-9IM&quot;&gt;DE-9IM&lt;/a&gt;. &quot;Two geometries are topologically equal if their interiors intersect and no part of the interior or boundary of one geometry intersects the exterior of the other&quot; (a symmetric relationship)
     */
    @NotNull public Builder geoEquals(@NotNull Place place) {
      putValue("geoEquals", place);
      return this;
    }
    /**
     * Represents spatial relations in which two geometries (or the places they represent) are topologically equal, as defined in &lt;a href=&quot;https://en.wikipedia.org/wiki/DE-9IM&quot;&gt;DE-9IM&lt;/a&gt;. &quot;Two geometries are topologically equal if their interiors intersect and no part of the interior or boundary of one geometry intersects the exterior of the other&quot; (a symmetric relationship)
     */
    @NotNull public Builder geoEquals(@NotNull Place.Builder place) {
      putValue("geoEquals", place.build());
      return this;
    }
    /**
     * The fax number.
     */
    @NotNull public Builder faxNumber(@NotNull String faxNumber) {
      putValue("faxNumber", faxNumber);
      return this;
    }
    /**
     * The &lt;a href=&quot;http://www.gs1.org/gln&quot;&gt;Global Location Number&lt;/a&gt; (GLN, sometimes also referred to as International Location Number or ILN) of the respective organization, person, or place. The GLN is a 13-digit number used to identify parties and physical locations.
     */
    @NotNull public Builder globalLocationNumber(@NotNull String globalLocationNumber) {
      putValue("globalLocationNumber", globalLocationNumber);
      return this;
    }
    /**
     * Indicates whether some facility (e.g. &lt;a class=&quot;localLink&quot; href=&quot;http://schema.org/FoodEstablishment&quot;&gt;FoodEstablishment&lt;/a&gt;, &lt;a class=&quot;localLink&quot; href=&quot;http://schema.org/CovidTestingFacility&quot;&gt;CovidTestingFacility&lt;/a&gt;) offers a service that can be used by driving through in a car. In the case of &lt;a class=&quot;localLink&quot; href=&quot;http://schema.org/CovidTestingFacility&quot;&gt;CovidTestingFacility&lt;/a&gt; such facilities could potentially help with social distancing from other potentially-infected users.
     */
    @NotNull public Builder hasDriveThroughService(@NotNull Boolean hasDriveThroughService) {
      putValue("hasDriveThroughService", hasDriveThroughService);
      return this;
    }
    /**
     * Represents a relationship between two geometries (or the places they represent), relating a covering geometry to a covered geometry. &quot;Every point of b is a point of (the interior or boundary of) a&quot;. As defined in &lt;a href=&quot;https://en.wikipedia.org/wiki/DE-9IM&quot;&gt;DE-9IM&lt;/a&gt;.
     */
    @NotNull public Builder geoCovers(@NotNull GeospatialGeometry geospatialGeometry) {
      putValue("geoCovers", geospatialGeometry);
      return this;
    }
    /**
     * Represents a relationship between two geometries (or the places they represent), relating a covering geometry to a covered geometry. &quot;Every point of b is a point of (the interior or boundary of) a&quot;. As defined in &lt;a href=&quot;https://en.wikipedia.org/wiki/DE-9IM&quot;&gt;DE-9IM&lt;/a&gt;.
     */
    @NotNull public Builder geoCovers(@NotNull GeospatialGeometry.Builder geospatialGeometry) {
      putValue("geoCovers", geospatialGeometry.build());
      return this;
    }
    /**
     * Represents a relationship between two geometries (or the places they represent), relating a covering geometry to a covered geometry. &quot;Every point of b is a point of (the interior or boundary of) a&quot;. As defined in &lt;a href=&quot;https://en.wikipedia.org/wiki/DE-9IM&quot;&gt;DE-9IM&lt;/a&gt;.
     */
    @NotNull public Builder geoCovers(@NotNull Place place) {
      putValue("geoCovers", place);
      return this;
    }
    /**
     * Represents a relationship between two geometries (or the places they represent), relating a covering geometry to a covered geometry. &quot;Every point of b is a point of (the interior or boundary of) a&quot;. As defined in &lt;a href=&quot;https://en.wikipedia.org/wiki/DE-9IM&quot;&gt;DE-9IM&lt;/a&gt;.
     */
    @NotNull public Builder geoCovers(@NotNull Place.Builder place) {
      putValue("geoCovers", place.build());
      return this;
    }
    /**
     * The opening hours of a certain place.
     */
    @NotNull public Builder openingHoursSpecification(@NotNull OpeningHoursSpecification openingHoursSpecification) {
      putValue("openingHoursSpecification", openingHoursSpecification);
      return this;
    }
    /**
     * The opening hours of a certain place.
     */
    @NotNull public Builder openingHoursSpecification(@NotNull OpeningHoursSpecification.Builder openingHoursSpecification) {
      putValue("openingHoursSpecification", openingHoursSpecification.build());
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
     * Represents a relationship between two geometries (or the places they represent), relating a geometry to one that contains it, i.e. it is inside (i.e. within) its interior. As defined in &lt;a href=&quot;https://en.wikipedia.org/wiki/DE-9IM&quot;&gt;DE-9IM&lt;/a&gt;.
     */
    @NotNull public Builder geoWithin(@NotNull GeospatialGeometry geospatialGeometry) {
      putValue("geoWithin", geospatialGeometry);
      return this;
    }
    /**
     * Represents a relationship between two geometries (or the places they represent), relating a geometry to one that contains it, i.e. it is inside (i.e. within) its interior. As defined in &lt;a href=&quot;https://en.wikipedia.org/wiki/DE-9IM&quot;&gt;DE-9IM&lt;/a&gt;.
     */
    @NotNull public Builder geoWithin(@NotNull GeospatialGeometry.Builder geospatialGeometry) {
      putValue("geoWithin", geospatialGeometry.build());
      return this;
    }
    /**
     * Represents a relationship between two geometries (or the places they represent), relating a geometry to one that contains it, i.e. it is inside (i.e. within) its interior. As defined in &lt;a href=&quot;https://en.wikipedia.org/wiki/DE-9IM&quot;&gt;DE-9IM&lt;/a&gt;.
     */
    @NotNull public Builder geoWithin(@NotNull Place place) {
      putValue("geoWithin", place);
      return this;
    }
    /**
     * Represents a relationship between two geometries (or the places they represent), relating a geometry to one that contains it, i.e. it is inside (i.e. within) its interior. As defined in &lt;a href=&quot;https://en.wikipedia.org/wiki/DE-9IM&quot;&gt;DE-9IM&lt;/a&gt;.
     */
    @NotNull public Builder geoWithin(@NotNull Place.Builder place) {
      putValue("geoWithin", place.build());
      return this;
    }
    /**
     * The latitude of a location. For example &lt;code&gt;37.42242&lt;/code&gt; (&lt;a href=&quot;https://en.wikipedia.org/wiki/World_Geodetic_System&quot;&gt;WGS 84&lt;/a&gt;).
     */
    @NotNull public Builder latitude(@NotNull Number number) {
      putValue("latitude", number);
      return this;
    }
    /**
     * The latitude of a location. For example &lt;code&gt;37.42242&lt;/code&gt; (&lt;a href=&quot;https://en.wikipedia.org/wiki/World_Geodetic_System&quot;&gt;WGS 84&lt;/a&gt;).
     */
    @NotNull public Builder latitude(@NotNull String latitude) {
      putValue("latitude", latitude);
      return this;
    }
    /**
     * The basic containment relation between a place and one that contains it.
     */
    @NotNull public Builder containedInPlace(@NotNull Place place) {
      putValue("containedInPlace", place);
      return this;
    }
    /**
     * The basic containment relation between a place and one that contains it.
     */
    @NotNull public Builder containedInPlace(@NotNull Place.Builder place) {
      putValue("containedInPlace", place.build());
      return this;
    }
    /**
     * Physical address of the item.
     */
    @NotNull public Builder address(@NotNull PostalAddress postalAddress) {
      putValue("address", postalAddress);
      return this;
    }
    /**
     * Physical address of the item.
     */
    @NotNull public Builder address(@NotNull PostalAddress.Builder postalAddress) {
      putValue("address", postalAddress.build());
      return this;
    }
    /**
     * Physical address of the item.
     */
    @NotNull public Builder address(@NotNull String address) {
      putValue("address", address);
      return this;
    }
    /**
     * Represents a relationship between two geometries (or the places they represent), relating a geometry to another that covers it. As defined in &lt;a href=&quot;https://en.wikipedia.org/wiki/DE-9IM&quot;&gt;DE-9IM&lt;/a&gt;.
     */
    @NotNull public Builder geoCoveredBy(@NotNull GeospatialGeometry geospatialGeometry) {
      putValue("geoCoveredBy", geospatialGeometry);
      return this;
    }
    /**
     * Represents a relationship between two geometries (or the places they represent), relating a geometry to another that covers it. As defined in &lt;a href=&quot;https://en.wikipedia.org/wiki/DE-9IM&quot;&gt;DE-9IM&lt;/a&gt;.
     */
    @NotNull public Builder geoCoveredBy(@NotNull GeospatialGeometry.Builder geospatialGeometry) {
      putValue("geoCoveredBy", geospatialGeometry.build());
      return this;
    }
    /**
     * Represents a relationship between two geometries (or the places they represent), relating a geometry to another that covers it. As defined in &lt;a href=&quot;https://en.wikipedia.org/wiki/DE-9IM&quot;&gt;DE-9IM&lt;/a&gt;.
     */
    @NotNull public Builder geoCoveredBy(@NotNull Place place) {
      putValue("geoCoveredBy", place);
      return this;
    }
    /**
     * Represents a relationship between two geometries (or the places they represent), relating a geometry to another that covers it. As defined in &lt;a href=&quot;https://en.wikipedia.org/wiki/DE-9IM&quot;&gt;DE-9IM&lt;/a&gt;.
     */
    @NotNull public Builder geoCoveredBy(@NotNull Place.Builder place) {
      putValue("geoCoveredBy", place.build());
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
     * Represents a relationship between two geometries (or the places they represent), relating a containing geometry to a contained geometry. &quot;a contains b iff no points of b lie in the exterior of a, and at least one point of the interior of b lies in the interior of a&quot;. As defined in &lt;a href=&quot;https://en.wikipedia.org/wiki/DE-9IM&quot;&gt;DE-9IM&lt;/a&gt;.
     */
    @NotNull public Builder geoContains(@NotNull GeospatialGeometry geospatialGeometry) {
      putValue("geoContains", geospatialGeometry);
      return this;
    }
    /**
     * Represents a relationship between two geometries (or the places they represent), relating a containing geometry to a contained geometry. &quot;a contains b iff no points of b lie in the exterior of a, and at least one point of the interior of b lies in the interior of a&quot;. As defined in &lt;a href=&quot;https://en.wikipedia.org/wiki/DE-9IM&quot;&gt;DE-9IM&lt;/a&gt;.
     */
    @NotNull public Builder geoContains(@NotNull GeospatialGeometry.Builder geospatialGeometry) {
      putValue("geoContains", geospatialGeometry.build());
      return this;
    }
    /**
     * Represents a relationship between two geometries (or the places they represent), relating a containing geometry to a contained geometry. &quot;a contains b iff no points of b lie in the exterior of a, and at least one point of the interior of b lies in the interior of a&quot;. As defined in &lt;a href=&quot;https://en.wikipedia.org/wiki/DE-9IM&quot;&gt;DE-9IM&lt;/a&gt;.
     */
    @NotNull public Builder geoContains(@NotNull Place place) {
      putValue("geoContains", place);
      return this;
    }
    /**
     * Represents a relationship between two geometries (or the places they represent), relating a containing geometry to a contained geometry. &quot;a contains b iff no points of b lie in the exterior of a, and at least one point of the interior of b lies in the interior of a&quot;. As defined in &lt;a href=&quot;https://en.wikipedia.org/wiki/DE-9IM&quot;&gt;DE-9IM&lt;/a&gt;.
     */
    @NotNull public Builder geoContains(@NotNull Place.Builder place) {
      putValue("geoContains", place.build());
      return this;
    }
    /**
     * Represents spatial relations in which two geometries (or the places they represent) have at least one point in common. As defined in &lt;a href=&quot;https://en.wikipedia.org/wiki/DE-9IM&quot;&gt;DE-9IM&lt;/a&gt;.
     */
    @NotNull public Builder geoIntersects(@NotNull GeospatialGeometry geospatialGeometry) {
      putValue("geoIntersects", geospatialGeometry);
      return this;
    }
    /**
     * Represents spatial relations in which two geometries (or the places they represent) have at least one point in common. As defined in &lt;a href=&quot;https://en.wikipedia.org/wiki/DE-9IM&quot;&gt;DE-9IM&lt;/a&gt;.
     */
    @NotNull public Builder geoIntersects(@NotNull GeospatialGeometry.Builder geospatialGeometry) {
      putValue("geoIntersects", geospatialGeometry.build());
      return this;
    }
    /**
     * Represents spatial relations in which two geometries (or the places they represent) have at least one point in common. As defined in &lt;a href=&quot;https://en.wikipedia.org/wiki/DE-9IM&quot;&gt;DE-9IM&lt;/a&gt;.
     */
    @NotNull public Builder geoIntersects(@NotNull Place place) {
      putValue("geoIntersects", place);
      return this;
    }
    /**
     * Represents spatial relations in which two geometries (or the places they represent) have at least one point in common. As defined in &lt;a href=&quot;https://en.wikipedia.org/wiki/DE-9IM&quot;&gt;DE-9IM&lt;/a&gt;.
     */
    @NotNull public Builder geoIntersects(@NotNull Place.Builder place) {
      putValue("geoIntersects", place.build());
      return this;
    }
    /**
     * The telephone number.
     */
    @NotNull public Builder telephone(@NotNull String telephone) {
      putValue("telephone", telephone);
      return this;
    }
    /**
     * The total number of individuals that may attend an event or venue.
     */
    @NotNull public Builder maximumAttendeeCapacity(@NotNull Integer integer) {
      putValue("maximumAttendeeCapacity", integer);
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
     * The geo coordinates of the place.
     */
    @NotNull public Builder geo(@NotNull GeoCoordinates geoCoordinates) {
      putValue("geo", geoCoordinates);
      return this;
    }
    /**
     * The geo coordinates of the place.
     */
    @NotNull public Builder geo(@NotNull GeoCoordinates.Builder geoCoordinates) {
      putValue("geo", geoCoordinates.build());
      return this;
    }
    /**
     * The geo coordinates of the place.
     */
    @NotNull public Builder geo(@NotNull GeoShape geoShape) {
      putValue("geo", geoShape);
      return this;
    }
    /**
     * The geo coordinates of the place.
     */
    @NotNull public Builder geo(@NotNull GeoShape.Builder geoShape) {
      putValue("geo", geoShape.build());
      return this;
    }
    /**
     * Indicates whether it is allowed to smoke in the place, e.g. in the restaurant, hotel or hotel room.
     */
    @NotNull public Builder smokingAllowed(@NotNull Boolean smokingAllowed) {
      putValue("smokingAllowed", smokingAllowed);
      return this;
    }
    /**
     * The longitude of a location. For example &lt;code&gt;-122.08585&lt;/code&gt; (&lt;a href=&quot;https://en.wikipedia.org/wiki/World_Geodetic_System&quot;&gt;WGS 84&lt;/a&gt;).
     */
    @NotNull public Builder longitude(@NotNull Number number) {
      putValue("longitude", number);
      return this;
    }
    /**
     * The longitude of a location. For example &lt;code&gt;-122.08585&lt;/code&gt; (&lt;a href=&quot;https://en.wikipedia.org/wiki/World_Geodetic_System&quot;&gt;WGS 84&lt;/a&gt;).
     */
    @NotNull public Builder longitude(@NotNull String longitude) {
      putValue("longitude", longitude);
      return this;
    }
    /**
     * A flag to signal that the item, event, or place is accessible for free.
     */
    @NotNull public Builder isAccessibleForFree(@NotNull Boolean isAccessibleForFree) {
      putValue("isAccessibleForFree", isAccessibleForFree);
      return this;
    }
    /**
     * Represents a relationship between two geometries (or the places they represent), relating a geometry to another that geospatially overlaps it, i.e. they have some but not all points in common. As defined in &lt;a href=&quot;https://en.wikipedia.org/wiki/DE-9IM&quot;&gt;DE-9IM&lt;/a&gt;.
     */
    @NotNull public Builder geoOverlaps(@NotNull GeospatialGeometry geospatialGeometry) {
      putValue("geoOverlaps", geospatialGeometry);
      return this;
    }
    /**
     * Represents a relationship between two geometries (or the places they represent), relating a geometry to another that geospatially overlaps it, i.e. they have some but not all points in common. As defined in &lt;a href=&quot;https://en.wikipedia.org/wiki/DE-9IM&quot;&gt;DE-9IM&lt;/a&gt;.
     */
    @NotNull public Builder geoOverlaps(@NotNull GeospatialGeometry.Builder geospatialGeometry) {
      putValue("geoOverlaps", geospatialGeometry.build());
      return this;
    }
    /**
     * Represents a relationship between two geometries (or the places they represent), relating a geometry to another that geospatially overlaps it, i.e. they have some but not all points in common. As defined in &lt;a href=&quot;https://en.wikipedia.org/wiki/DE-9IM&quot;&gt;DE-9IM&lt;/a&gt;.
     */
    @NotNull public Builder geoOverlaps(@NotNull Place place) {
      putValue("geoOverlaps", place);
      return this;
    }
    /**
     * Represents a relationship between two geometries (or the places they represent), relating a geometry to another that geospatially overlaps it, i.e. they have some but not all points in common. As defined in &lt;a href=&quot;https://en.wikipedia.org/wiki/DE-9IM&quot;&gt;DE-9IM&lt;/a&gt;.
     */
    @NotNull public Builder geoOverlaps(@NotNull Place.Builder place) {
      putValue("geoOverlaps", place.build());
      return this;
    }
    /**
     * The International Standard of Industrial Classification of All Economic Activities (ISIC), Revision 4 code for a particular organization, business person, or place.
     */
    @NotNull public Builder isicV4(@NotNull String isicV4) {
      putValue("isicV4", isicV4);
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
     * Upcoming or past event associated with this place, organization, or action.
     */
    @NotNull public Builder event(@NotNull Event event) {
      putValue("event", event);
      return this;
    }
    /**
     * Upcoming or past event associated with this place, organization, or action.
     */
    @NotNull public Builder event(@NotNull Event.Builder event) {
      putValue("event", event.build());
      return this;
    }
    /**
     * A photograph of this place.
     */
    @NotNull public Builder photo(@NotNull Image image) {
      putValue("photo", image);
      return this;
    }
    /**
     * Represents spatial relations in which two geometries (or the places they represent) touch: they have at least one boundary point in common, but no interior points.&quot; (a symmetric relationship, as defined in &lt;a href=&quot;https://en.wikipedia.org/wiki/DE-9IM&quot;&gt;DE-9IM&lt;/a&gt; )
     */
    @NotNull public Builder geoTouches(@NotNull GeospatialGeometry geospatialGeometry) {
      putValue("geoTouches", geospatialGeometry);
      return this;
    }
    /**
     * Represents spatial relations in which two geometries (or the places they represent) touch: they have at least one boundary point in common, but no interior points.&quot; (a symmetric relationship, as defined in &lt;a href=&quot;https://en.wikipedia.org/wiki/DE-9IM&quot;&gt;DE-9IM&lt;/a&gt; )
     */
    @NotNull public Builder geoTouches(@NotNull GeospatialGeometry.Builder geospatialGeometry) {
      putValue("geoTouches", geospatialGeometry.build());
      return this;
    }
    /**
     * Represents spatial relations in which two geometries (or the places they represent) touch: they have at least one boundary point in common, but no interior points.&quot; (a symmetric relationship, as defined in &lt;a href=&quot;https://en.wikipedia.org/wiki/DE-9IM&quot;&gt;DE-9IM&lt;/a&gt; )
     */
    @NotNull public Builder geoTouches(@NotNull Place place) {
      putValue("geoTouches", place);
      return this;
    }
    /**
     * Represents spatial relations in which two geometries (or the places they represent) touch: they have at least one boundary point in common, but no interior points.&quot; (a symmetric relationship, as defined in &lt;a href=&quot;https://en.wikipedia.org/wiki/DE-9IM&quot;&gt;DE-9IM&lt;/a&gt; )
     */
    @NotNull public Builder geoTouches(@NotNull Place.Builder place) {
      putValue("geoTouches", place.build());
      return this;
    }
    /**
     * Represents a relationship between two geometries (or the places they represent), relating a geometry to another that crosses it: &quot;a crosses b: they have some but not all interior points in common, and the dimension of the intersection is less than that of at least one of them&quot;. As defined in &lt;a href=&quot;https://en.wikipedia.org/wiki/DE-9IM&quot;&gt;DE-9IM&lt;/a&gt;.
     */
    @NotNull public Builder geoCrosses(@NotNull GeospatialGeometry geospatialGeometry) {
      putValue("geoCrosses", geospatialGeometry);
      return this;
    }
    /**
     * Represents a relationship between two geometries (or the places they represent), relating a geometry to another that crosses it: &quot;a crosses b: they have some but not all interior points in common, and the dimension of the intersection is less than that of at least one of them&quot;. As defined in &lt;a href=&quot;https://en.wikipedia.org/wiki/DE-9IM&quot;&gt;DE-9IM&lt;/a&gt;.
     */
    @NotNull public Builder geoCrosses(@NotNull GeospatialGeometry.Builder geospatialGeometry) {
      putValue("geoCrosses", geospatialGeometry.build());
      return this;
    }
    /**
     * Represents a relationship between two geometries (or the places they represent), relating a geometry to another that crosses it: &quot;a crosses b: they have some but not all interior points in common, and the dimension of the intersection is less than that of at least one of them&quot;. As defined in &lt;a href=&quot;https://en.wikipedia.org/wiki/DE-9IM&quot;&gt;DE-9IM&lt;/a&gt;.
     */
    @NotNull public Builder geoCrosses(@NotNull Place place) {
      putValue("geoCrosses", place);
      return this;
    }
    /**
     * Represents a relationship between two geometries (or the places they represent), relating a geometry to another that crosses it: &quot;a crosses b: they have some but not all interior points in common, and the dimension of the intersection is less than that of at least one of them&quot;. As defined in &lt;a href=&quot;https://en.wikipedia.org/wiki/DE-9IM&quot;&gt;DE-9IM&lt;/a&gt;.
     */
    @NotNull public Builder geoCrosses(@NotNull Place.Builder place) {
      putValue("geoCrosses", place.build());
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
     * The special opening hours of a certain place.&lt;br/&gt;&lt;br/&gt;
     * 
     * Use this to explicitly override general opening hours brought in scope by &lt;a class=&quot;localLink&quot; href=&quot;http://schema.org/openingHoursSpecification&quot;&gt;openingHoursSpecification&lt;/a&gt; or &lt;a class=&quot;localLink&quot; href=&quot;http://schema.org/openingHours&quot;&gt;openingHours&lt;/a&gt;.
     */
    @NotNull public Builder specialOpeningHoursSpecification(@NotNull OpeningHoursSpecification openingHoursSpecification) {
      putValue("specialOpeningHoursSpecification", openingHoursSpecification);
      return this;
    }
    /**
     * The special opening hours of a certain place.&lt;br/&gt;&lt;br/&gt;
     * 
     * Use this to explicitly override general opening hours brought in scope by &lt;a class=&quot;localLink&quot; href=&quot;http://schema.org/openingHoursSpecification&quot;&gt;openingHoursSpecification&lt;/a&gt; or &lt;a class=&quot;localLink&quot; href=&quot;http://schema.org/openingHours&quot;&gt;openingHours&lt;/a&gt;.
     */
    @NotNull public Builder specialOpeningHoursSpecification(@NotNull OpeningHoursSpecification.Builder openingHoursSpecification) {
      putValue("specialOpeningHoursSpecification", openingHoursSpecification.build());
      return this;
    }
    /**
     * A URL to a map of the place.
     */
    @NotNull public Builder hasMap(@NotNull Map map) {
      putValue("hasMap", map);
      return this;
    }
    /**
     * A URL to a map of the place.
     */
    @NotNull public Builder hasMap(@NotNull Map.Builder map) {
      putValue("hasMap", map.build());
      return this;
    }
    /**
     * A URL to a map of the place.
     */
    @NotNull public Builder hasMap(@NotNull String hasMap) {
      putValue("hasMap", hasMap);
      return this;
    }
    /**
     * A flag to signal that the &lt;a class=&quot;localLink&quot; href=&quot;http://schema.org/Place&quot;&gt;Place&lt;/a&gt; is open to public visitors.  If this property is omitted there is no assumed default boolean value
     */
    @NotNull public Builder publicAccess(@NotNull Boolean publicAccess) {
      putValue("publicAccess", publicAccess);
      return this;
    }
    /**
     * A short textual code (also called &quot;store code&quot;) that uniquely identifies a place of business. The code is typically assigned by the parentOrganization and used in structured URLs.&lt;br/&gt;&lt;br/&gt;
     * 
     * For example, in the URL http://www.starbucks.co.uk/store-locator/etc/detail/3047 the code &quot;3047&quot; is a branchCode for a particular branch.
     */
    @NotNull public Builder branchCode(@NotNull String branchCode) {
      putValue("branchCode", branchCode);
      return this;
    }
    /**
     * The basic containment relation between a place and another that it contains.
     */
    @NotNull public Builder containsPlace(@NotNull Place place) {
      putValue("containsPlace", place);
      return this;
    }
    /**
     * The basic containment relation between a place and another that it contains.
     */
    @NotNull public Builder containsPlace(@NotNull Place.Builder place) {
      putValue("containsPlace", place.build());
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
      if ("numberOfBedrooms".equals(key) && value instanceof Number) { this.numberOfBedrooms((Number)value); return; }
      if ("numberOfBedroomss".equals(key) && value instanceof Number) { this.numberOfBedrooms((Number)value); return; }
      if ("numberOfBedrooms".equals(key) && value instanceof QuantitativeValue) { this.numberOfBedrooms((QuantitativeValue)value); return; }
      if ("numberOfBedroomss".equals(key) && value instanceof QuantitativeValue) { this.numberOfBedrooms((QuantitativeValue)value); return; }
      if ("tourBookingPage".equals(key) && value instanceof String) { this.tourBookingPage((String)value); return; }
      if ("tourBookingPages".equals(key) && value instanceof String) { this.tourBookingPage((String)value); return; }
      if ("amenityFeature".equals(key) && value instanceof LocationFeatureSpecification) { this.amenityFeature((LocationFeatureSpecification)value); return; }
      if ("amenityFeatures".equals(key) && value instanceof LocationFeatureSpecification) { this.amenityFeature((LocationFeatureSpecification)value); return; }
      if ("leaseLength".equals(key) && value instanceof Duration) { this.leaseLength((Duration)value); return; }
      if ("leaseLengths".equals(key) && value instanceof Duration) { this.leaseLength((Duration)value); return; }
      if ("leaseLength".equals(key) && value instanceof QuantitativeValue) { this.leaseLength((QuantitativeValue)value); return; }
      if ("leaseLengths".equals(key) && value instanceof QuantitativeValue) { this.leaseLength((QuantitativeValue)value); return; }
      if ("accommodationFloorPlan".equals(key) && value instanceof FloorPlan) { this.accommodationFloorPlan((FloorPlan)value); return; }
      if ("accommodationFloorPlans".equals(key) && value instanceof FloorPlan) { this.accommodationFloorPlan((FloorPlan)value); return; }
      if ("floorSize".equals(key) && value instanceof QuantitativeValue) { this.floorSize((QuantitativeValue)value); return; }
      if ("floorSizes".equals(key) && value instanceof QuantitativeValue) { this.floorSize((QuantitativeValue)value); return; }
      if ("yearBuilt".equals(key) && value instanceof Integer) { this.yearBuilt((Integer)value); return; }
      if ("yearBuilts".equals(key) && value instanceof Integer) { this.yearBuilt((Integer)value); return; }
      if ("yearBuilt".equals(key) && value instanceof Long) { this.yearBuilt((Long)value); return; }
      if ("yearBuilts".equals(key) && value instanceof Long) { this.yearBuilt((Long)value); return; }
      if ("yearBuilt".equals(key) && value instanceof Float) { this.yearBuilt((Float)value); return; }
      if ("yearBuilts".equals(key) && value instanceof Float) { this.yearBuilt((Float)value); return; }
      if ("yearBuilt".equals(key) && value instanceof Double) { this.yearBuilt((Double)value); return; }
      if ("yearBuilts".equals(key) && value instanceof Double) { this.yearBuilt((Double)value); return; }
      if ("yearBuilt".equals(key) && value instanceof String) { this.yearBuilt((String)value); return; }
      if ("yearBuilts".equals(key) && value instanceof String) { this.yearBuilt((String)value); return; }
      if ("accommodationCategory".equals(key) && value instanceof String) { this.accommodationCategory((String)value); return; }
      if ("accommodationCategorys".equals(key) && value instanceof String) { this.accommodationCategory((String)value); return; }
      if ("floorLevel".equals(key) && value instanceof String) { this.floorLevel((String)value); return; }
      if ("floorLevels".equals(key) && value instanceof String) { this.floorLevel((String)value); return; }
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
      if ("permittedUsage".equals(key) && value instanceof String) { this.permittedUsage((String)value); return; }
      if ("permittedUsages".equals(key) && value instanceof String) { this.permittedUsage((String)value); return; }
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
