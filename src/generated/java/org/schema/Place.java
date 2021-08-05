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
 * Entities that have a somewhat fixed, physical extension.
 */
public class Place extends Thing implements ContentLocation {
  /**
   * Represents a relationship between two geometries (or the places they represent), relating a geometry to one that contains it, i.e. it is inside (i.e. within) its interior. As defined in [DE-9IM](https://en.wikipedia.org/wiki/DE-9IM).
   */
  @JsonIgnore public GeospatialGeometry getGeoWithinGeospatialGeometry() {
    return (GeospatialGeometry) getValue("geoWithin");
  }
  /**
   * Represents a relationship between two geometries (or the places they represent), relating a geometry to one that contains it, i.e. it is inside (i.e. within) its interior. As defined in [DE-9IM](https://en.wikipedia.org/wiki/DE-9IM).
   */
  @JsonIgnore public Collection<GeospatialGeometry> getGeoWithinGeospatialGeometrys() {
    final Object current = myData.get("geoWithin");
    if (current == null) return Collections.emptyList();
    if (current instanceof Collection) {
      return (Collection<GeospatialGeometry>) current;
    }
    return Arrays.asList((GeospatialGeometry) current);
  }
  /**
   * Represents a relationship between two geometries (or the places they represent), relating a geometry to one that contains it, i.e. it is inside (i.e. within) its interior. As defined in [DE-9IM](https://en.wikipedia.org/wiki/DE-9IM).
   */
  @JsonIgnore public Place getGeoWithinPlace() {
    return (Place) getValue("geoWithin");
  }
  /**
   * Represents a relationship between two geometries (or the places they represent), relating a geometry to one that contains it, i.e. it is inside (i.e. within) its interior. As defined in [DE-9IM](https://en.wikipedia.org/wiki/DE-9IM).
   */
  @JsonIgnore public Collection<Place> getGeoWithinPlaces() {
    final Object current = myData.get("geoWithin");
    if (current == null) return Collections.emptyList();
    if (current instanceof Collection) {
      return (Collection<Place>) current;
    }
    return Arrays.asList((Place) current);
  }
  /**
   * Upcoming or past event associated with this place, organization, or action.
   */
  @JsonIgnore public Event getEvent() {
    return (Event) getValue("event");
  }
  /**
   * Upcoming or past event associated with this place, organization, or action.
   */
  @JsonIgnore public Collection<Event> getEvents() {
    final Object current = myData.get("event");
    if (current == null) return Collections.emptyList();
    if (current instanceof Collection) {
      return (Collection<Event>) current;
    }
    return Arrays.asList((Event) current);
  }
  /**
   * A page providing information on how to book a tour of some [[Place]], such as an [[Accommodation]] or [[ApartmentComplex]] in a real estate setting, as well as other kinds of tours as appropriate.
   */
  @JsonIgnore public String getTourBookingPage() {
    return (String) getValue("tourBookingPage");
  }
  /**
   * A page providing information on how to book a tour of some [[Place]], such as an [[Accommodation]] or [[ApartmentComplex]] in a real estate setting, as well as other kinds of tours as appropriate.
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
   * The geo coordinates of the place.
   */
  @JsonIgnore public GeoCoordinates getGeoGeoCoordinates() {
    return (GeoCoordinates) getValue("geo");
  }
  /**
   * The geo coordinates of the place.
   */
  @JsonIgnore public Collection<GeoCoordinates> getGeoGeoCoordinatess() {
    final Object current = myData.get("geo");
    if (current == null) return Collections.emptyList();
    if (current instanceof Collection) {
      return (Collection<GeoCoordinates>) current;
    }
    return Arrays.asList((GeoCoordinates) current);
  }
  /**
   * The geo coordinates of the place.
   */
  @JsonIgnore public GeoShape getGeoGeoShape() {
    return (GeoShape) getValue("geo");
  }
  /**
   * The geo coordinates of the place.
   */
  @JsonIgnore public Collection<GeoShape> getGeoGeoShapes() {
    final Object current = myData.get("geo");
    if (current == null) return Collections.emptyList();
    if (current instanceof Collection) {
      return (Collection<GeoShape>) current;
    }
    return Arrays.asList((GeoShape) current);
  }
  /**
   * Represents spatial relations in which two geometries (or the places they represent) are topologically disjoint: they have no point in common. They form a set of disconnected geometries.&quot; (a symmetric relationship, as defined in [DE-9IM](https://en.wikipedia.org/wiki/DE-9IM))
   */
  @JsonIgnore public GeospatialGeometry getGeoDisjointGeospatialGeometry() {
    return (GeospatialGeometry) getValue("geoDisjoint");
  }
  /**
   * Represents spatial relations in which two geometries (or the places they represent) are topologically disjoint: they have no point in common. They form a set of disconnected geometries.&quot; (a symmetric relationship, as defined in [DE-9IM](https://en.wikipedia.org/wiki/DE-9IM))
   */
  @JsonIgnore public Collection<GeospatialGeometry> getGeoDisjointGeospatialGeometrys() {
    final Object current = myData.get("geoDisjoint");
    if (current == null) return Collections.emptyList();
    if (current instanceof Collection) {
      return (Collection<GeospatialGeometry>) current;
    }
    return Arrays.asList((GeospatialGeometry) current);
  }
  /**
   * Represents spatial relations in which two geometries (or the places they represent) are topologically disjoint: they have no point in common. They form a set of disconnected geometries.&quot; (a symmetric relationship, as defined in [DE-9IM](https://en.wikipedia.org/wiki/DE-9IM))
   */
  @JsonIgnore public Place getGeoDisjointPlace() {
    return (Place) getValue("geoDisjoint");
  }
  /**
   * Represents spatial relations in which two geometries (or the places they represent) are topologically disjoint: they have no point in common. They form a set of disconnected geometries.&quot; (a symmetric relationship, as defined in [DE-9IM](https://en.wikipedia.org/wiki/DE-9IM))
   */
  @JsonIgnore public Collection<Place> getGeoDisjointPlaces() {
    final Object current = myData.get("geoDisjoint");
    if (current == null) return Collections.emptyList();
    if (current instanceof Collection) {
      return (Collection<Place>) current;
    }
    return Arrays.asList((Place) current);
  }
  /**
   * A URL to a map of the place.
   */
  @JsonIgnore public Map getHasMapMap() {
    return (Map) getValue("hasMap");
  }
  /**
   * A URL to a map of the place.
   */
  @JsonIgnore public Collection<Map> getHasMapMaps() {
    final Object current = myData.get("hasMap");
    if (current == null) return Collections.emptyList();
    if (current instanceof Collection) {
      return (Collection<Map>) current;
    }
    return Arrays.asList((Map) current);
  }
  /**
   * A URL to a map of the place.
   */
  @JsonIgnore public String getHasMapString() {
    return (String) getValue("hasMap");
  }
  /**
   * A URL to a map of the place.
   */
  @JsonIgnore public Collection<String> getHasMapStrings() {
    final Object current = myData.get("hasMap");
    if (current == null) return Collections.emptyList();
    if (current instanceof Collection) {
      return (Collection<String>) current;
    }
    return Arrays.asList((String) current);
  }
  /**
   * Represents spatial relations in which two geometries (or the places they represent) touch: they have at least one boundary point in common, but no interior points.&quot; (a symmetric relationship, as defined in [DE-9IM](https://en.wikipedia.org/wiki/DE-9IM) )
   */
  @JsonIgnore public GeospatialGeometry getGeoTouchesGeospatialGeometry() {
    return (GeospatialGeometry) getValue("geoTouches");
  }
  /**
   * Represents spatial relations in which two geometries (or the places they represent) touch: they have at least one boundary point in common, but no interior points.&quot; (a symmetric relationship, as defined in [DE-9IM](https://en.wikipedia.org/wiki/DE-9IM) )
   */
  @JsonIgnore public Collection<GeospatialGeometry> getGeoTouchesGeospatialGeometrys() {
    final Object current = myData.get("geoTouches");
    if (current == null) return Collections.emptyList();
    if (current instanceof Collection) {
      return (Collection<GeospatialGeometry>) current;
    }
    return Arrays.asList((GeospatialGeometry) current);
  }
  /**
   * Represents spatial relations in which two geometries (or the places they represent) touch: they have at least one boundary point in common, but no interior points.&quot; (a symmetric relationship, as defined in [DE-9IM](https://en.wikipedia.org/wiki/DE-9IM) )
   */
  @JsonIgnore public Place getGeoTouchesPlace() {
    return (Place) getValue("geoTouches");
  }
  /**
   * Represents spatial relations in which two geometries (or the places they represent) touch: they have at least one boundary point in common, but no interior points.&quot; (a symmetric relationship, as defined in [DE-9IM](https://en.wikipedia.org/wiki/DE-9IM) )
   */
  @JsonIgnore public Collection<Place> getGeoTouchesPlaces() {
    final Object current = myData.get("geoTouches");
    if (current == null) return Collections.emptyList();
    if (current instanceof Collection) {
      return (Collection<Place>) current;
    }
    return Arrays.asList((Place) current);
  }
  /**
   * Represents spatial relations in which two geometries (or the places they represent) have at least one point in common. As defined in [DE-9IM](https://en.wikipedia.org/wiki/DE-9IM).
   */
  @JsonIgnore public GeospatialGeometry getGeoIntersectsGeospatialGeometry() {
    return (GeospatialGeometry) getValue("geoIntersects");
  }
  /**
   * Represents spatial relations in which two geometries (or the places they represent) have at least one point in common. As defined in [DE-9IM](https://en.wikipedia.org/wiki/DE-9IM).
   */
  @JsonIgnore public Collection<GeospatialGeometry> getGeoIntersectsGeospatialGeometrys() {
    final Object current = myData.get("geoIntersects");
    if (current == null) return Collections.emptyList();
    if (current instanceof Collection) {
      return (Collection<GeospatialGeometry>) current;
    }
    return Arrays.asList((GeospatialGeometry) current);
  }
  /**
   * Represents spatial relations in which two geometries (or the places they represent) have at least one point in common. As defined in [DE-9IM](https://en.wikipedia.org/wiki/DE-9IM).
   */
  @JsonIgnore public Place getGeoIntersectsPlace() {
    return (Place) getValue("geoIntersects");
  }
  /**
   * Represents spatial relations in which two geometries (or the places they represent) have at least one point in common. As defined in [DE-9IM](https://en.wikipedia.org/wiki/DE-9IM).
   */
  @JsonIgnore public Collection<Place> getGeoIntersectsPlaces() {
    final Object current = myData.get("geoIntersects");
    if (current == null) return Collections.emptyList();
    if (current instanceof Collection) {
      return (Collection<Place>) current;
    }
    return Arrays.asList((Place) current);
  }
  /**
   * The overall rating, based on a collection of reviews or ratings, of the item.
   */
  @JsonIgnore public AggregateRating getAggregateRating() {
    return (AggregateRating) getValue("aggregateRating");
  }
  /**
   * The overall rating, based on a collection of reviews or ratings, of the item.
   */
  @JsonIgnore public Collection<AggregateRating> getAggregateRatings() {
    final Object current = myData.get("aggregateRating");
    if (current == null) return Collections.emptyList();
    if (current instanceof Collection) {
      return (Collection<AggregateRating>) current;
    }
    return Arrays.asList((AggregateRating) current);
  }
  /**
   * The longitude of a location. For example ```-122.08585``` ([WGS 84](https://en.wikipedia.org/wiki/World_Geodetic_System)).
   */
  @JsonIgnore public Integer getLongitudeInteger() {
    return (Integer) getValue("longitude");
  }
  /**
   * The longitude of a location. For example ```-122.08585``` ([WGS 84](https://en.wikipedia.org/wiki/World_Geodetic_System)).
   */
  @JsonIgnore public Collection<Integer> getLongitudeIntegers() {
    final Object current = myData.get("longitude");
    if (current == null) return Collections.emptyList();
    if (current instanceof Collection) {
      return (Collection<Integer>) current;
    }
    return Arrays.asList((Integer) current);
  }
  /**
   * The longitude of a location. For example ```-122.08585``` ([WGS 84](https://en.wikipedia.org/wiki/World_Geodetic_System)).
   */
  @JsonIgnore public Long getLongitudeLong() {
    return (Long) getValue("longitude");
  }
  /**
   * The longitude of a location. For example ```-122.08585``` ([WGS 84](https://en.wikipedia.org/wiki/World_Geodetic_System)).
   */
  @JsonIgnore public Collection<Long> getLongitudeLongs() {
    final Object current = myData.get("longitude");
    if (current == null) return Collections.emptyList();
    if (current instanceof Collection) {
      return (Collection<Long>) current;
    }
    return Arrays.asList((Long) current);
  }
  /**
   * The longitude of a location. For example ```-122.08585``` ([WGS 84](https://en.wikipedia.org/wiki/World_Geodetic_System)).
   */
  @JsonIgnore public Float getLongitudeFloat() {
    return (Float) getValue("longitude");
  }
  /**
   * The longitude of a location. For example ```-122.08585``` ([WGS 84](https://en.wikipedia.org/wiki/World_Geodetic_System)).
   */
  @JsonIgnore public Collection<Float> getLongitudeFloats() {
    final Object current = myData.get("longitude");
    if (current == null) return Collections.emptyList();
    if (current instanceof Collection) {
      return (Collection<Float>) current;
    }
    return Arrays.asList((Float) current);
  }
  /**
   * The longitude of a location. For example ```-122.08585``` ([WGS 84](https://en.wikipedia.org/wiki/World_Geodetic_System)).
   */
  @JsonIgnore public Double getLongitudeDouble() {
    return (Double) getValue("longitude");
  }
  /**
   * The longitude of a location. For example ```-122.08585``` ([WGS 84](https://en.wikipedia.org/wiki/World_Geodetic_System)).
   */
  @JsonIgnore public Collection<Double> getLongitudeDoubles() {
    final Object current = myData.get("longitude");
    if (current == null) return Collections.emptyList();
    if (current instanceof Collection) {
      return (Collection<Double>) current;
    }
    return Arrays.asList((Double) current);
  }
  /**
   * The longitude of a location. For example ```-122.08585``` ([WGS 84](https://en.wikipedia.org/wiki/World_Geodetic_System)).
   */
  @JsonIgnore public String getLongitudeString() {
    return (String) getValue("longitude");
  }
  /**
   * The longitude of a location. For example ```-122.08585``` ([WGS 84](https://en.wikipedia.org/wiki/World_Geodetic_System)).
   */
  @JsonIgnore public Collection<String> getLongitudeStrings() {
    final Object current = myData.get("longitude");
    if (current == null) return Collections.emptyList();
    if (current instanceof Collection) {
      return (Collection<String>) current;
    }
    return Arrays.asList((String) current);
  }
  /**
   * The telephone number.
   */
  @JsonIgnore public String getTelephone() {
    return (String) getValue("telephone");
  }
  /**
   * The telephone number.
   */
  @JsonIgnore public Collection<String> getTelephones() {
    final Object current = myData.get("telephone");
    if (current == null) return Collections.emptyList();
    if (current instanceof Collection) {
      return (Collection<String>) current;
    }
    return Arrays.asList((String) current);
  }
  /**
   * Represents a relationship between two geometries (or the places they represent), relating a geometry to another that crosses it: &quot;a crosses b: they have some but not all interior points in common, and the dimension of the intersection is less than that of at least one of them&quot;. As defined in [DE-9IM](https://en.wikipedia.org/wiki/DE-9IM).
   */
  @JsonIgnore public GeospatialGeometry getGeoCrossesGeospatialGeometry() {
    return (GeospatialGeometry) getValue("geoCrosses");
  }
  /**
   * Represents a relationship between two geometries (or the places they represent), relating a geometry to another that crosses it: &quot;a crosses b: they have some but not all interior points in common, and the dimension of the intersection is less than that of at least one of them&quot;. As defined in [DE-9IM](https://en.wikipedia.org/wiki/DE-9IM).
   */
  @JsonIgnore public Collection<GeospatialGeometry> getGeoCrossesGeospatialGeometrys() {
    final Object current = myData.get("geoCrosses");
    if (current == null) return Collections.emptyList();
    if (current instanceof Collection) {
      return (Collection<GeospatialGeometry>) current;
    }
    return Arrays.asList((GeospatialGeometry) current);
  }
  /**
   * Represents a relationship between two geometries (or the places they represent), relating a geometry to another that crosses it: &quot;a crosses b: they have some but not all interior points in common, and the dimension of the intersection is less than that of at least one of them&quot;. As defined in [DE-9IM](https://en.wikipedia.org/wiki/DE-9IM).
   */
  @JsonIgnore public Place getGeoCrossesPlace() {
    return (Place) getValue("geoCrosses");
  }
  /**
   * Represents a relationship between two geometries (or the places they represent), relating a geometry to another that crosses it: &quot;a crosses b: they have some but not all interior points in common, and the dimension of the intersection is less than that of at least one of them&quot;. As defined in [DE-9IM](https://en.wikipedia.org/wiki/DE-9IM).
   */
  @JsonIgnore public Collection<Place> getGeoCrossesPlaces() {
    final Object current = myData.get("geoCrosses");
    if (current == null) return Collections.emptyList();
    if (current instanceof Collection) {
      return (Collection<Place>) current;
    }
    return Arrays.asList((Place) current);
  }
  /**
   * An associated logo.
   */
  @JsonIgnore public Image getLogo() {
    return (Image) getValue("logo");
  }
  /**
   * An associated logo.
   */
  @JsonIgnore public Collection<Image> getLogos() {
    final Object current = myData.get("logo");
    if (current == null) return Collections.emptyList();
    if (current instanceof Collection) {
      return (Collection<Image>) current;
    }
    return Arrays.asList((Image) current);
  }
  /**
   * The International Standard of Industrial Classification of All Economic Activities (ISIC), Revision 4 code for a particular organization, business person, or place.
   */
  @JsonIgnore public String getIsicV4() {
    return (String) getValue("isicV4");
  }
  /**
   * The International Standard of Industrial Classification of All Economic Activities (ISIC), Revision 4 code for a particular organization, business person, or place.
   */
  @JsonIgnore public Collection<String> getIsicV4s() {
    final Object current = myData.get("isicV4");
    if (current == null) return Collections.emptyList();
    if (current instanceof Collection) {
      return (Collection<String>) current;
    }
    return Arrays.asList((String) current);
  }
  /**
   * A flag to signal that the item, event, or place is accessible for free.
   */
  @JsonIgnore public Boolean getIsAccessibleForFree() {
    return (Boolean) getValue("isAccessibleForFree");
  }
  /**
   * A flag to signal that the item, event, or place is accessible for free.
   */
  @JsonIgnore public Collection<Boolean> getIsAccessibleForFrees() {
    final Object current = myData.get("isAccessibleForFree");
    if (current == null) return Collections.emptyList();
    if (current instanceof Collection) {
      return (Collection<Boolean>) current;
    }
    return Arrays.asList((Boolean) current);
  }
  /**
   * A photograph of this place.
   */
  @JsonIgnore public Image getPhoto() {
    return (Image) getValue("photo");
  }
  /**
   * A photograph of this place.
   */
  @JsonIgnore public Collection<Image> getPhotos() {
    final Object current = myData.get("photo");
    if (current == null) return Collections.emptyList();
    if (current instanceof Collection) {
      return (Collection<Image>) current;
    }
    return Arrays.asList((Image) current);
  }
  /**
   * The basic containment relation between a place and one that contains it.
   */
  @JsonIgnore public Place getContainedInPlace() {
    return (Place) getValue("containedInPlace");
  }
  /**
   * The basic containment relation between a place and one that contains it.
   */
  @JsonIgnore public Collection<Place> getContainedInPlaces() {
    final Object current = myData.get("containedInPlace");
    if (current == null) return Collections.emptyList();
    if (current instanceof Collection) {
      return (Collection<Place>) current;
    }
    return Arrays.asList((Place) current);
  }
  /**
   * Physical address of the item.
   */
  @JsonIgnore public PostalAddress getAddressPostalAddress() {
    return (PostalAddress) getValue("address");
  }
  /**
   * Physical address of the item.
   */
  @JsonIgnore public Collection<PostalAddress> getAddressPostalAddresss() {
    final Object current = myData.get("address");
    if (current == null) return Collections.emptyList();
    if (current instanceof Collection) {
      return (Collection<PostalAddress>) current;
    }
    return Arrays.asList((PostalAddress) current);
  }
  /**
   * Physical address of the item.
   */
  @JsonIgnore public String getAddressString() {
    return (String) getValue("address");
  }
  /**
   * Physical address of the item.
   */
  @JsonIgnore public Collection<String> getAddressStrings() {
    final Object current = myData.get("address");
    if (current == null) return Collections.emptyList();
    if (current instanceof Collection) {
      return (Collection<String>) current;
    }
    return Arrays.asList((String) current);
  }
  /**
   * Represents a relationship between two geometries (or the places they represent), relating a geometry to another that covers it. As defined in [DE-9IM](https://en.wikipedia.org/wiki/DE-9IM).
   */
  @JsonIgnore public GeospatialGeometry getGeoCoveredByGeospatialGeometry() {
    return (GeospatialGeometry) getValue("geoCoveredBy");
  }
  /**
   * Represents a relationship between two geometries (or the places they represent), relating a geometry to another that covers it. As defined in [DE-9IM](https://en.wikipedia.org/wiki/DE-9IM).
   */
  @JsonIgnore public Collection<GeospatialGeometry> getGeoCoveredByGeospatialGeometrys() {
    final Object current = myData.get("geoCoveredBy");
    if (current == null) return Collections.emptyList();
    if (current instanceof Collection) {
      return (Collection<GeospatialGeometry>) current;
    }
    return Arrays.asList((GeospatialGeometry) current);
  }
  /**
   * Represents a relationship between two geometries (or the places they represent), relating a geometry to another that covers it. As defined in [DE-9IM](https://en.wikipedia.org/wiki/DE-9IM).
   */
  @JsonIgnore public Place getGeoCoveredByPlace() {
    return (Place) getValue("geoCoveredBy");
  }
  /**
   * Represents a relationship between two geometries (or the places they represent), relating a geometry to another that covers it. As defined in [DE-9IM](https://en.wikipedia.org/wiki/DE-9IM).
   */
  @JsonIgnore public Collection<Place> getGeoCoveredByPlaces() {
    final Object current = myData.get("geoCoveredBy");
    if (current == null) return Collections.emptyList();
    if (current instanceof Collection) {
      return (Collection<Place>) current;
    }
    return Arrays.asList((Place) current);
  }
  /**
   * Indicates whether it is allowed to smoke in the place, e.g. in the restaurant, hotel or hotel room.
   */
  @JsonIgnore public Boolean getSmokingAllowed() {
    return (Boolean) getValue("smokingAllowed");
  }
  /**
   * Indicates whether it is allowed to smoke in the place, e.g. in the restaurant, hotel or hotel room.
   */
  @JsonIgnore public Collection<Boolean> getSmokingAlloweds() {
    final Object current = myData.get("smokingAllowed");
    if (current == null) return Collections.emptyList();
    if (current instanceof Collection) {
      return (Collection<Boolean>) current;
    }
    return Arrays.asList((Boolean) current);
  }
  /**
   * A property-value pair representing an additional characteristics of the entitity, e.g. a product feature or another characteristic for which there is no matching property in schema.org.\n\nNote: Publishers should be aware that applications designed to use specific schema.org properties (e.g. http://schema.org/width, http://schema.org/color, http://schema.org/gtin13, ...) will typically expect such data to be provided using those properties, rather than using the generic property/value mechanism.
   * 
   */
  @JsonIgnore public PropertyValue getAdditionalProperty() {
    return (PropertyValue) getValue("additionalProperty");
  }
  /**
   * A property-value pair representing an additional characteristics of the entitity, e.g. a product feature or another characteristic for which there is no matching property in schema.org.\n\nNote: Publishers should be aware that applications designed to use specific schema.org properties (e.g. http://schema.org/width, http://schema.org/color, http://schema.org/gtin13, ...) will typically expect such data to be provided using those properties, rather than using the generic property/value mechanism.
   * 
   */
  @JsonIgnore public Collection<PropertyValue> getAdditionalPropertys() {
    final Object current = myData.get("additionalProperty");
    if (current == null) return Collections.emptyList();
    if (current instanceof Collection) {
      return (Collection<PropertyValue>) current;
    }
    return Arrays.asList((PropertyValue) current);
  }
  /**
   * The latitude of a location. For example ```37.42242``` ([WGS 84](https://en.wikipedia.org/wiki/World_Geodetic_System)).
   */
  @JsonIgnore public Number getLatitudeNumber() {
    return (Number) getValue("latitude");
  }
  /**
   * The latitude of a location. For example ```37.42242``` ([WGS 84](https://en.wikipedia.org/wiki/World_Geodetic_System)).
   */
  @JsonIgnore public Collection<Number> getLatitudeNumbers() {
    final Object current = myData.get("latitude");
    if (current == null) return Collections.emptyList();
    if (current instanceof Collection) {
      return (Collection<Number>) current;
    }
    return Arrays.asList((Number) current);
  }
  /**
   * The latitude of a location. For example ```37.42242``` ([WGS 84](https://en.wikipedia.org/wiki/World_Geodetic_System)).
   */
  @JsonIgnore public String getLatitudeString() {
    return (String) getValue("latitude");
  }
  /**
   * The latitude of a location. For example ```37.42242``` ([WGS 84](https://en.wikipedia.org/wiki/World_Geodetic_System)).
   */
  @JsonIgnore public Collection<String> getLatitudeStrings() {
    final Object current = myData.get("latitude");
    if (current == null) return Collections.emptyList();
    if (current instanceof Collection) {
      return (Collection<String>) current;
    }
    return Arrays.asList((String) current);
  }
  /**
   * Represents spatial relations in which two geometries (or the places they represent) are topologically equal, as defined in [DE-9IM](https://en.wikipedia.org/wiki/DE-9IM). &quot;Two geometries are topologically equal if their interiors intersect and no part of the interior or boundary of one geometry intersects the exterior of the other&quot; (a symmetric relationship)
   */
  @JsonIgnore public GeospatialGeometry getGeoEqualsGeospatialGeometry() {
    return (GeospatialGeometry) getValue("geoEquals");
  }
  /**
   * Represents spatial relations in which two geometries (or the places they represent) are topologically equal, as defined in [DE-9IM](https://en.wikipedia.org/wiki/DE-9IM). &quot;Two geometries are topologically equal if their interiors intersect and no part of the interior or boundary of one geometry intersects the exterior of the other&quot; (a symmetric relationship)
   */
  @JsonIgnore public Collection<GeospatialGeometry> getGeoEqualsGeospatialGeometrys() {
    final Object current = myData.get("geoEquals");
    if (current == null) return Collections.emptyList();
    if (current instanceof Collection) {
      return (Collection<GeospatialGeometry>) current;
    }
    return Arrays.asList((GeospatialGeometry) current);
  }
  /**
   * Represents spatial relations in which two geometries (or the places they represent) are topologically equal, as defined in [DE-9IM](https://en.wikipedia.org/wiki/DE-9IM). &quot;Two geometries are topologically equal if their interiors intersect and no part of the interior or boundary of one geometry intersects the exterior of the other&quot; (a symmetric relationship)
   */
  @JsonIgnore public Place getGeoEqualsPlace() {
    return (Place) getValue("geoEquals");
  }
  /**
   * Represents spatial relations in which two geometries (or the places they represent) are topologically equal, as defined in [DE-9IM](https://en.wikipedia.org/wiki/DE-9IM). &quot;Two geometries are topologically equal if their interiors intersect and no part of the interior or boundary of one geometry intersects the exterior of the other&quot; (a symmetric relationship)
   */
  @JsonIgnore public Collection<Place> getGeoEqualsPlaces() {
    final Object current = myData.get("geoEquals");
    if (current == null) return Collections.emptyList();
    if (current instanceof Collection) {
      return (Collection<Place>) current;
    }
    return Arrays.asList((Place) current);
  }
  /**
   * Indicates whether some facility (e.g. [[FoodEstablishment]], [[CovidTestingFacility]]) offers a service that can be used by driving through in a car. In the case of [[CovidTestingFacility]] such facilities could potentially help with social distancing from other potentially-infected users.
   */
  @JsonIgnore public Boolean getHasDriveThroughService() {
    return (Boolean) getValue("hasDriveThroughService");
  }
  /**
   * Indicates whether some facility (e.g. [[FoodEstablishment]], [[CovidTestingFacility]]) offers a service that can be used by driving through in a car. In the case of [[CovidTestingFacility]] such facilities could potentially help with social distancing from other potentially-infected users.
   */
  @JsonIgnore public Collection<Boolean> getHasDriveThroughServices() {
    final Object current = myData.get("hasDriveThroughService");
    if (current == null) return Collections.emptyList();
    if (current instanceof Collection) {
      return (Collection<Boolean>) current;
    }
    return Arrays.asList((Boolean) current);
  }
  /**
   * The [Global Location Number](http://www.gs1.org/gln) (GLN, sometimes also referred to as International Location Number or ILN) of the respective organization, person, or place. The GLN is a 13-digit number used to identify parties and physical locations.
   */
  @JsonIgnore public Identifier getGlobalLocationNumber() {
    return (Identifier) getValue("globalLocationNumber");
  }
  /**
   * The [Global Location Number](http://www.gs1.org/gln) (GLN, sometimes also referred to as International Location Number or ILN) of the respective organization, person, or place. The GLN is a 13-digit number used to identify parties and physical locations.
   */
  @JsonIgnore public Collection<Identifier> getGlobalLocationNumbers() {
    final Object current = myData.get("globalLocationNumber");
    if (current == null) return Collections.emptyList();
    if (current instanceof Collection) {
      return (Collection<Identifier>) current;
    }
    return Arrays.asList((Identifier) current);
  }
  /**
   * A review of the item.
   */
  @JsonIgnore public Review getReview() {
    return (Review) getValue("review");
  }
  /**
   * A review of the item.
   */
  @JsonIgnore public Collection<Review> getReviews() {
    final Object current = myData.get("review");
    if (current == null) return Collections.emptyList();
    if (current instanceof Collection) {
      return (Collection<Review>) current;
    }
    return Arrays.asList((Review) current);
  }
  /**
   * The fax number.
   */
  @JsonIgnore public String getFaxNumber() {
    return (String) getValue("faxNumber");
  }
  /**
   * The fax number.
   */
  @JsonIgnore public Collection<String> getFaxNumbers() {
    final Object current = myData.get("faxNumber");
    if (current == null) return Collections.emptyList();
    if (current instanceof Collection) {
      return (Collection<String>) current;
    }
    return Arrays.asList((String) current);
  }
  /**
   * Represents a relationship between two geometries (or the places they represent), relating a geometry to another that geospatially overlaps it, i.e. they have some but not all points in common. As defined in [DE-9IM](https://en.wikipedia.org/wiki/DE-9IM).
   */
  @JsonIgnore public GeospatialGeometry getGeoOverlapsGeospatialGeometry() {
    return (GeospatialGeometry) getValue("geoOverlaps");
  }
  /**
   * Represents a relationship between two geometries (or the places they represent), relating a geometry to another that geospatially overlaps it, i.e. they have some but not all points in common. As defined in [DE-9IM](https://en.wikipedia.org/wiki/DE-9IM).
   */
  @JsonIgnore public Collection<GeospatialGeometry> getGeoOverlapsGeospatialGeometrys() {
    final Object current = myData.get("geoOverlaps");
    if (current == null) return Collections.emptyList();
    if (current instanceof Collection) {
      return (Collection<GeospatialGeometry>) current;
    }
    return Arrays.asList((GeospatialGeometry) current);
  }
  /**
   * Represents a relationship between two geometries (or the places they represent), relating a geometry to another that geospatially overlaps it, i.e. they have some but not all points in common. As defined in [DE-9IM](https://en.wikipedia.org/wiki/DE-9IM).
   */
  @JsonIgnore public Place getGeoOverlapsPlace() {
    return (Place) getValue("geoOverlaps");
  }
  /**
   * Represents a relationship between two geometries (or the places they represent), relating a geometry to another that geospatially overlaps it, i.e. they have some but not all points in common. As defined in [DE-9IM](https://en.wikipedia.org/wiki/DE-9IM).
   */
  @JsonIgnore public Collection<Place> getGeoOverlapsPlaces() {
    final Object current = myData.get("geoOverlaps");
    if (current == null) return Collections.emptyList();
    if (current instanceof Collection) {
      return (Collection<Place>) current;
    }
    return Arrays.asList((Place) current);
  }
  /**
   * The total number of individuals that may attend an event or venue.
   */
  @JsonIgnore public Integer getMaximumAttendeeCapacity() {
    return (Integer) getValue("maximumAttendeeCapacity");
  }
  /**
   * The total number of individuals that may attend an event or venue.
   */
  @JsonIgnore public Collection<Integer> getMaximumAttendeeCapacitys() {
    final Object current = myData.get("maximumAttendeeCapacity");
    if (current == null) return Collections.emptyList();
    if (current instanceof Collection) {
      return (Collection<Integer>) current;
    }
    return Arrays.asList((Integer) current);
  }
  /**
   * Represents a relationship between two geometries (or the places they represent), relating a covering geometry to a covered geometry. &quot;Every point of b is a point of (the interior or boundary of) a&quot;. As defined in [DE-9IM](https://en.wikipedia.org/wiki/DE-9IM).
   */
  @JsonIgnore public GeospatialGeometry getGeoCoversGeospatialGeometry() {
    return (GeospatialGeometry) getValue("geoCovers");
  }
  /**
   * Represents a relationship between two geometries (or the places they represent), relating a covering geometry to a covered geometry. &quot;Every point of b is a point of (the interior or boundary of) a&quot;. As defined in [DE-9IM](https://en.wikipedia.org/wiki/DE-9IM).
   */
  @JsonIgnore public Collection<GeospatialGeometry> getGeoCoversGeospatialGeometrys() {
    final Object current = myData.get("geoCovers");
    if (current == null) return Collections.emptyList();
    if (current instanceof Collection) {
      return (Collection<GeospatialGeometry>) current;
    }
    return Arrays.asList((GeospatialGeometry) current);
  }
  /**
   * Represents a relationship between two geometries (or the places they represent), relating a covering geometry to a covered geometry. &quot;Every point of b is a point of (the interior or boundary of) a&quot;. As defined in [DE-9IM](https://en.wikipedia.org/wiki/DE-9IM).
   */
  @JsonIgnore public Place getGeoCoversPlace() {
    return (Place) getValue("geoCovers");
  }
  /**
   * Represents a relationship between two geometries (or the places they represent), relating a covering geometry to a covered geometry. &quot;Every point of b is a point of (the interior or boundary of) a&quot;. As defined in [DE-9IM](https://en.wikipedia.org/wiki/DE-9IM).
   */
  @JsonIgnore public Collection<Place> getGeoCoversPlaces() {
    final Object current = myData.get("geoCovers");
    if (current == null) return Collections.emptyList();
    if (current instanceof Collection) {
      return (Collection<Place>) current;
    }
    return Arrays.asList((Place) current);
  }
  /**
   * The special opening hours of a certain place.\n\nUse this to explicitly override general opening hours brought in scope by [[openingHoursSpecification]] or [[openingHours]].
   *       
   */
  @JsonIgnore public OpeningHoursSpecification getSpecialOpeningHoursSpecification() {
    return (OpeningHoursSpecification) getValue("specialOpeningHoursSpecification");
  }
  /**
   * The special opening hours of a certain place.\n\nUse this to explicitly override general opening hours brought in scope by [[openingHoursSpecification]] or [[openingHours]].
   *       
   */
  @JsonIgnore public Collection<OpeningHoursSpecification> getSpecialOpeningHoursSpecifications() {
    final Object current = myData.get("specialOpeningHoursSpecification");
    if (current == null) return Collections.emptyList();
    if (current instanceof Collection) {
      return (Collection<OpeningHoursSpecification>) current;
    }
    return Arrays.asList((OpeningHoursSpecification) current);
  }
  /**
   * The opening hours of a certain place.
   */
  @JsonIgnore public OpeningHoursSpecification getOpeningHoursSpecification() {
    return (OpeningHoursSpecification) getValue("openingHoursSpecification");
  }
  /**
   * The opening hours of a certain place.
   */
  @JsonIgnore public Collection<OpeningHoursSpecification> getOpeningHoursSpecifications() {
    final Object current = myData.get("openingHoursSpecification");
    if (current == null) return Collections.emptyList();
    if (current instanceof Collection) {
      return (Collection<OpeningHoursSpecification>) current;
    }
    return Arrays.asList((OpeningHoursSpecification) current);
  }
  /**
   * A slogan or motto associated with the item.
   */
  @JsonIgnore public String getSlogan() {
    return (String) getValue("slogan");
  }
  /**
   * A slogan or motto associated with the item.
   */
  @JsonIgnore public Collection<String> getSlogans() {
    final Object current = myData.get("slogan");
    if (current == null) return Collections.emptyList();
    if (current instanceof Collection) {
      return (Collection<String>) current;
    }
    return Arrays.asList((String) current);
  }
  /**
   * A short textual code (also called &quot;store code&quot;) that uniquely identifies a place of business. The code is typically assigned by the parentOrganization and used in structured URLs.\n\nFor example, in the URL http://www.starbucks.co.uk/store-locator/etc/detail/3047 the code &quot;3047&quot; is a branchCode for a particular branch.
   *       
   */
  @JsonIgnore public String getBranchCode() {
    return (String) getValue("branchCode");
  }
  /**
   * A short textual code (also called &quot;store code&quot;) that uniquely identifies a place of business. The code is typically assigned by the parentOrganization and used in structured URLs.\n\nFor example, in the URL http://www.starbucks.co.uk/store-locator/etc/detail/3047 the code &quot;3047&quot; is a branchCode for a particular branch.
   *       
   */
  @JsonIgnore public Collection<String> getBranchCodes() {
    final Object current = myData.get("branchCode");
    if (current == null) return Collections.emptyList();
    if (current instanceof Collection) {
      return (Collection<String>) current;
    }
    return Arrays.asList((String) current);
  }
  /**
   * Represents a relationship between two geometries (or the places they represent), relating a containing geometry to a contained geometry. &quot;a contains b iff no points of b lie in the exterior of a, and at least one point of the interior of b lies in the interior of a&quot;. As defined in [DE-9IM](https://en.wikipedia.org/wiki/DE-9IM).
   */
  @JsonIgnore public GeospatialGeometry getGeoContainsGeospatialGeometry() {
    return (GeospatialGeometry) getValue("geoContains");
  }
  /**
   * Represents a relationship between two geometries (or the places they represent), relating a containing geometry to a contained geometry. &quot;a contains b iff no points of b lie in the exterior of a, and at least one point of the interior of b lies in the interior of a&quot;. As defined in [DE-9IM](https://en.wikipedia.org/wiki/DE-9IM).
   */
  @JsonIgnore public Collection<GeospatialGeometry> getGeoContainsGeospatialGeometrys() {
    final Object current = myData.get("geoContains");
    if (current == null) return Collections.emptyList();
    if (current instanceof Collection) {
      return (Collection<GeospatialGeometry>) current;
    }
    return Arrays.asList((GeospatialGeometry) current);
  }
  /**
   * Represents a relationship between two geometries (or the places they represent), relating a containing geometry to a contained geometry. &quot;a contains b iff no points of b lie in the exterior of a, and at least one point of the interior of b lies in the interior of a&quot;. As defined in [DE-9IM](https://en.wikipedia.org/wiki/DE-9IM).
   */
  @JsonIgnore public Place getGeoContainsPlace() {
    return (Place) getValue("geoContains");
  }
  /**
   * Represents a relationship between two geometries (or the places they represent), relating a containing geometry to a contained geometry. &quot;a contains b iff no points of b lie in the exterior of a, and at least one point of the interior of b lies in the interior of a&quot;. As defined in [DE-9IM](https://en.wikipedia.org/wiki/DE-9IM).
   */
  @JsonIgnore public Collection<Place> getGeoContainsPlaces() {
    final Object current = myData.get("geoContains");
    if (current == null) return Collections.emptyList();
    if (current instanceof Collection) {
      return (Collection<Place>) current;
    }
    return Arrays.asList((Place) current);
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
   * A flag to signal that the [[Place]] is open to public visitors.  If this property is omitted there is no assumed default boolean value
   */
  @JsonIgnore public Boolean getPublicAccess() {
    return (Boolean) getValue("publicAccess");
  }
  /**
   * A flag to signal that the [[Place]] is open to public visitors.  If this property is omitted there is no assumed default boolean value
   */
  @JsonIgnore public Collection<Boolean> getPublicAccesss() {
    final Object current = myData.get("publicAccess");
    if (current == null) return Collections.emptyList();
    if (current instanceof Collection) {
      return (Collection<Boolean>) current;
    }
    return Arrays.asList((Boolean) current);
  }
  /**
   * The basic containment relation between a place and another that it contains.
   */
  @JsonIgnore public Place getContainsPlace() {
    return (Place) getValue("containsPlace");
  }
  /**
   * The basic containment relation between a place and another that it contains.
   */
  @JsonIgnore public Collection<Place> getContainsPlaces() {
    final Object current = myData.get("containsPlace");
    if (current == null) return Collections.emptyList();
    if (current instanceof Collection) {
      return (Collection<Place>) current;
    }
    return Arrays.asList((Place) current);
  }
  protected Place(java.util.Map<String,Object> data) {
    super(data);
  }
  
  /**
   * Builder for {@link Place}
   */
  public static class Builder extends Thing.Builder {
    public Builder(@NotNull HashMap<String,Object> data) {
      super(data);
    }
    @NotNull public Place build() {
      return new Place(myData);
    }
    /**
     * Represents a relationship between two geometries (or the places they represent), relating a geometry to one that contains it, i.e. it is inside (i.e. within) its interior. As defined in [DE-9IM](https://en.wikipedia.org/wiki/DE-9IM).
     */
    @NotNull public Builder geoWithin(@NotNull GeospatialGeometry geospatialGeometry) {
      putValue("geoWithin", geospatialGeometry);
      return this;
    }
    /**
     * Represents a relationship between two geometries (or the places they represent), relating a geometry to one that contains it, i.e. it is inside (i.e. within) its interior. As defined in [DE-9IM](https://en.wikipedia.org/wiki/DE-9IM).
     */
    @NotNull public Builder geoWithin(@NotNull GeospatialGeometry.Builder geospatialGeometry) {
      putValue("geoWithin", geospatialGeometry.build());
      return this;
    }
    /**
     * Represents a relationship between two geometries (or the places they represent), relating a geometry to one that contains it, i.e. it is inside (i.e. within) its interior. As defined in [DE-9IM](https://en.wikipedia.org/wiki/DE-9IM).
     */
    @NotNull public Builder geoWithin(@NotNull Place place) {
      putValue("geoWithin", place);
      return this;
    }
    /**
     * Represents a relationship between two geometries (or the places they represent), relating a geometry to one that contains it, i.e. it is inside (i.e. within) its interior. As defined in [DE-9IM](https://en.wikipedia.org/wiki/DE-9IM).
     */
    @NotNull public Builder geoWithin(@NotNull Place.Builder place) {
      putValue("geoWithin", place.build());
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
     * A page providing information on how to book a tour of some [[Place]], such as an [[Accommodation]] or [[ApartmentComplex]] in a real estate setting, as well as other kinds of tours as appropriate.
     */
    @NotNull public Builder tourBookingPage(@NotNull String tourBookingPage) {
      putValue("tourBookingPage", tourBookingPage);
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
     * Represents spatial relations in which two geometries (or the places they represent) are topologically disjoint: they have no point in common. They form a set of disconnected geometries.&quot; (a symmetric relationship, as defined in [DE-9IM](https://en.wikipedia.org/wiki/DE-9IM))
     */
    @NotNull public Builder geoDisjoint(@NotNull GeospatialGeometry geospatialGeometry) {
      putValue("geoDisjoint", geospatialGeometry);
      return this;
    }
    /**
     * Represents spatial relations in which two geometries (or the places they represent) are topologically disjoint: they have no point in common. They form a set of disconnected geometries.&quot; (a symmetric relationship, as defined in [DE-9IM](https://en.wikipedia.org/wiki/DE-9IM))
     */
    @NotNull public Builder geoDisjoint(@NotNull GeospatialGeometry.Builder geospatialGeometry) {
      putValue("geoDisjoint", geospatialGeometry.build());
      return this;
    }
    /**
     * Represents spatial relations in which two geometries (or the places they represent) are topologically disjoint: they have no point in common. They form a set of disconnected geometries.&quot; (a symmetric relationship, as defined in [DE-9IM](https://en.wikipedia.org/wiki/DE-9IM))
     */
    @NotNull public Builder geoDisjoint(@NotNull Place place) {
      putValue("geoDisjoint", place);
      return this;
    }
    /**
     * Represents spatial relations in which two geometries (or the places they represent) are topologically disjoint: they have no point in common. They form a set of disconnected geometries.&quot; (a symmetric relationship, as defined in [DE-9IM](https://en.wikipedia.org/wiki/DE-9IM))
     */
    @NotNull public Builder geoDisjoint(@NotNull Place.Builder place) {
      putValue("geoDisjoint", place.build());
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
     * Represents spatial relations in which two geometries (or the places they represent) touch: they have at least one boundary point in common, but no interior points.&quot; (a symmetric relationship, as defined in [DE-9IM](https://en.wikipedia.org/wiki/DE-9IM) )
     */
    @NotNull public Builder geoTouches(@NotNull GeospatialGeometry geospatialGeometry) {
      putValue("geoTouches", geospatialGeometry);
      return this;
    }
    /**
     * Represents spatial relations in which two geometries (or the places they represent) touch: they have at least one boundary point in common, but no interior points.&quot; (a symmetric relationship, as defined in [DE-9IM](https://en.wikipedia.org/wiki/DE-9IM) )
     */
    @NotNull public Builder geoTouches(@NotNull GeospatialGeometry.Builder geospatialGeometry) {
      putValue("geoTouches", geospatialGeometry.build());
      return this;
    }
    /**
     * Represents spatial relations in which two geometries (or the places they represent) touch: they have at least one boundary point in common, but no interior points.&quot; (a symmetric relationship, as defined in [DE-9IM](https://en.wikipedia.org/wiki/DE-9IM) )
     */
    @NotNull public Builder geoTouches(@NotNull Place place) {
      putValue("geoTouches", place);
      return this;
    }
    /**
     * Represents spatial relations in which two geometries (or the places they represent) touch: they have at least one boundary point in common, but no interior points.&quot; (a symmetric relationship, as defined in [DE-9IM](https://en.wikipedia.org/wiki/DE-9IM) )
     */
    @NotNull public Builder geoTouches(@NotNull Place.Builder place) {
      putValue("geoTouches", place.build());
      return this;
    }
    /**
     * Represents spatial relations in which two geometries (or the places they represent) have at least one point in common. As defined in [DE-9IM](https://en.wikipedia.org/wiki/DE-9IM).
     */
    @NotNull public Builder geoIntersects(@NotNull GeospatialGeometry geospatialGeometry) {
      putValue("geoIntersects", geospatialGeometry);
      return this;
    }
    /**
     * Represents spatial relations in which two geometries (or the places they represent) have at least one point in common. As defined in [DE-9IM](https://en.wikipedia.org/wiki/DE-9IM).
     */
    @NotNull public Builder geoIntersects(@NotNull GeospatialGeometry.Builder geospatialGeometry) {
      putValue("geoIntersects", geospatialGeometry.build());
      return this;
    }
    /**
     * Represents spatial relations in which two geometries (or the places they represent) have at least one point in common. As defined in [DE-9IM](https://en.wikipedia.org/wiki/DE-9IM).
     */
    @NotNull public Builder geoIntersects(@NotNull Place place) {
      putValue("geoIntersects", place);
      return this;
    }
    /**
     * Represents spatial relations in which two geometries (or the places they represent) have at least one point in common. As defined in [DE-9IM](https://en.wikipedia.org/wiki/DE-9IM).
     */
    @NotNull public Builder geoIntersects(@NotNull Place.Builder place) {
      putValue("geoIntersects", place.build());
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
     * The longitude of a location. For example ```-122.08585``` ([WGS 84](https://en.wikipedia.org/wiki/World_Geodetic_System)).
     */
    @NotNull public Builder longitude(@NotNull Integer integer) {
      putValue("longitude", integer);
      return this;
    }
    /**
     * The longitude of a location. For example ```-122.08585``` ([WGS 84](https://en.wikipedia.org/wiki/World_Geodetic_System)).
     */
    @NotNull public Builder longitude(@NotNull Long longitude) {
      putValue("longitude", longitude);
      return this;
    }
    /**
     * The longitude of a location. For example ```-122.08585``` ([WGS 84](https://en.wikipedia.org/wiki/World_Geodetic_System)).
     */
    @NotNull public Builder longitude(@NotNull Float longitude) {
      putValue("longitude", longitude);
      return this;
    }
    /**
     * The longitude of a location. For example ```-122.08585``` ([WGS 84](https://en.wikipedia.org/wiki/World_Geodetic_System)).
     */
    @NotNull public Builder longitude(@NotNull Double longitude) {
      putValue("longitude", longitude);
      return this;
    }
    /**
     * The longitude of a location. For example ```-122.08585``` ([WGS 84](https://en.wikipedia.org/wiki/World_Geodetic_System)).
     */
    @NotNull public Builder longitude(@NotNull String longitude) {
      putValue("longitude", longitude);
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
     * Represents a relationship between two geometries (or the places they represent), relating a geometry to another that crosses it: &quot;a crosses b: they have some but not all interior points in common, and the dimension of the intersection is less than that of at least one of them&quot;. As defined in [DE-9IM](https://en.wikipedia.org/wiki/DE-9IM).
     */
    @NotNull public Builder geoCrosses(@NotNull GeospatialGeometry geospatialGeometry) {
      putValue("geoCrosses", geospatialGeometry);
      return this;
    }
    /**
     * Represents a relationship between two geometries (or the places they represent), relating a geometry to another that crosses it: &quot;a crosses b: they have some but not all interior points in common, and the dimension of the intersection is less than that of at least one of them&quot;. As defined in [DE-9IM](https://en.wikipedia.org/wiki/DE-9IM).
     */
    @NotNull public Builder geoCrosses(@NotNull GeospatialGeometry.Builder geospatialGeometry) {
      putValue("geoCrosses", geospatialGeometry.build());
      return this;
    }
    /**
     * Represents a relationship between two geometries (or the places they represent), relating a geometry to another that crosses it: &quot;a crosses b: they have some but not all interior points in common, and the dimension of the intersection is less than that of at least one of them&quot;. As defined in [DE-9IM](https://en.wikipedia.org/wiki/DE-9IM).
     */
    @NotNull public Builder geoCrosses(@NotNull Place place) {
      putValue("geoCrosses", place);
      return this;
    }
    /**
     * Represents a relationship between two geometries (or the places they represent), relating a geometry to another that crosses it: &quot;a crosses b: they have some but not all interior points in common, and the dimension of the intersection is less than that of at least one of them&quot;. As defined in [DE-9IM](https://en.wikipedia.org/wiki/DE-9IM).
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
     * The International Standard of Industrial Classification of All Economic Activities (ISIC), Revision 4 code for a particular organization, business person, or place.
     */
    @NotNull public Builder isicV4(@NotNull String isicV4) {
      putValue("isicV4", isicV4);
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
     * A photograph of this place.
     */
    @NotNull public Builder photo(@NotNull Image image) {
      putValue("photo", image);
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
     * Represents a relationship between two geometries (or the places they represent), relating a geometry to another that covers it. As defined in [DE-9IM](https://en.wikipedia.org/wiki/DE-9IM).
     */
    @NotNull public Builder geoCoveredBy(@NotNull GeospatialGeometry geospatialGeometry) {
      putValue("geoCoveredBy", geospatialGeometry);
      return this;
    }
    /**
     * Represents a relationship between two geometries (or the places they represent), relating a geometry to another that covers it. As defined in [DE-9IM](https://en.wikipedia.org/wiki/DE-9IM).
     */
    @NotNull public Builder geoCoveredBy(@NotNull GeospatialGeometry.Builder geospatialGeometry) {
      putValue("geoCoveredBy", geospatialGeometry.build());
      return this;
    }
    /**
     * Represents a relationship between two geometries (or the places they represent), relating a geometry to another that covers it. As defined in [DE-9IM](https://en.wikipedia.org/wiki/DE-9IM).
     */
    @NotNull public Builder geoCoveredBy(@NotNull Place place) {
      putValue("geoCoveredBy", place);
      return this;
    }
    /**
     * Represents a relationship between two geometries (or the places they represent), relating a geometry to another that covers it. As defined in [DE-9IM](https://en.wikipedia.org/wiki/DE-9IM).
     */
    @NotNull public Builder geoCoveredBy(@NotNull Place.Builder place) {
      putValue("geoCoveredBy", place.build());
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
     * The latitude of a location. For example ```37.42242``` ([WGS 84](https://en.wikipedia.org/wiki/World_Geodetic_System)).
     */
    @NotNull public Builder latitude(@NotNull Number number) {
      putValue("latitude", number);
      return this;
    }
    /**
     * The latitude of a location. For example ```37.42242``` ([WGS 84](https://en.wikipedia.org/wiki/World_Geodetic_System)).
     */
    @NotNull public Builder latitude(@NotNull String latitude) {
      putValue("latitude", latitude);
      return this;
    }
    /**
     * Represents spatial relations in which two geometries (or the places they represent) are topologically equal, as defined in [DE-9IM](https://en.wikipedia.org/wiki/DE-9IM). &quot;Two geometries are topologically equal if their interiors intersect and no part of the interior or boundary of one geometry intersects the exterior of the other&quot; (a symmetric relationship)
     */
    @NotNull public Builder geoEquals(@NotNull GeospatialGeometry geospatialGeometry) {
      putValue("geoEquals", geospatialGeometry);
      return this;
    }
    /**
     * Represents spatial relations in which two geometries (or the places they represent) are topologically equal, as defined in [DE-9IM](https://en.wikipedia.org/wiki/DE-9IM). &quot;Two geometries are topologically equal if their interiors intersect and no part of the interior or boundary of one geometry intersects the exterior of the other&quot; (a symmetric relationship)
     */
    @NotNull public Builder geoEquals(@NotNull GeospatialGeometry.Builder geospatialGeometry) {
      putValue("geoEquals", geospatialGeometry.build());
      return this;
    }
    /**
     * Represents spatial relations in which two geometries (or the places they represent) are topologically equal, as defined in [DE-9IM](https://en.wikipedia.org/wiki/DE-9IM). &quot;Two geometries are topologically equal if their interiors intersect and no part of the interior or boundary of one geometry intersects the exterior of the other&quot; (a symmetric relationship)
     */
    @NotNull public Builder geoEquals(@NotNull Place place) {
      putValue("geoEquals", place);
      return this;
    }
    /**
     * Represents spatial relations in which two geometries (or the places they represent) are topologically equal, as defined in [DE-9IM](https://en.wikipedia.org/wiki/DE-9IM). &quot;Two geometries are topologically equal if their interiors intersect and no part of the interior or boundary of one geometry intersects the exterior of the other&quot; (a symmetric relationship)
     */
    @NotNull public Builder geoEquals(@NotNull Place.Builder place) {
      putValue("geoEquals", place.build());
      return this;
    }
    /**
     * Indicates whether some facility (e.g. [[FoodEstablishment]], [[CovidTestingFacility]]) offers a service that can be used by driving through in a car. In the case of [[CovidTestingFacility]] such facilities could potentially help with social distancing from other potentially-infected users.
     */
    @NotNull public Builder hasDriveThroughService(@NotNull Boolean hasDriveThroughService) {
      putValue("hasDriveThroughService", hasDriveThroughService);
      return this;
    }
    /**
     * The [Global Location Number](http://www.gs1.org/gln) (GLN, sometimes also referred to as International Location Number or ILN) of the respective organization, person, or place. The GLN is a 13-digit number used to identify parties and physical locations.
     */
    @NotNull public Builder globalLocationNumber(@NotNull Identifier identifier) {
      putValue("globalLocationNumber", identifier);
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
     * The fax number.
     */
    @NotNull public Builder faxNumber(@NotNull String faxNumber) {
      putValue("faxNumber", faxNumber);
      return this;
    }
    /**
     * Represents a relationship between two geometries (or the places they represent), relating a geometry to another that geospatially overlaps it, i.e. they have some but not all points in common. As defined in [DE-9IM](https://en.wikipedia.org/wiki/DE-9IM).
     */
    @NotNull public Builder geoOverlaps(@NotNull GeospatialGeometry geospatialGeometry) {
      putValue("geoOverlaps", geospatialGeometry);
      return this;
    }
    /**
     * Represents a relationship between two geometries (or the places they represent), relating a geometry to another that geospatially overlaps it, i.e. they have some but not all points in common. As defined in [DE-9IM](https://en.wikipedia.org/wiki/DE-9IM).
     */
    @NotNull public Builder geoOverlaps(@NotNull GeospatialGeometry.Builder geospatialGeometry) {
      putValue("geoOverlaps", geospatialGeometry.build());
      return this;
    }
    /**
     * Represents a relationship between two geometries (or the places they represent), relating a geometry to another that geospatially overlaps it, i.e. they have some but not all points in common. As defined in [DE-9IM](https://en.wikipedia.org/wiki/DE-9IM).
     */
    @NotNull public Builder geoOverlaps(@NotNull Place place) {
      putValue("geoOverlaps", place);
      return this;
    }
    /**
     * Represents a relationship between two geometries (or the places they represent), relating a geometry to another that geospatially overlaps it, i.e. they have some but not all points in common. As defined in [DE-9IM](https://en.wikipedia.org/wiki/DE-9IM).
     */
    @NotNull public Builder geoOverlaps(@NotNull Place.Builder place) {
      putValue("geoOverlaps", place.build());
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
     * Represents a relationship between two geometries (or the places they represent), relating a covering geometry to a covered geometry. &quot;Every point of b is a point of (the interior or boundary of) a&quot;. As defined in [DE-9IM](https://en.wikipedia.org/wiki/DE-9IM).
     */
    @NotNull public Builder geoCovers(@NotNull GeospatialGeometry geospatialGeometry) {
      putValue("geoCovers", geospatialGeometry);
      return this;
    }
    /**
     * Represents a relationship between two geometries (or the places they represent), relating a covering geometry to a covered geometry. &quot;Every point of b is a point of (the interior or boundary of) a&quot;. As defined in [DE-9IM](https://en.wikipedia.org/wiki/DE-9IM).
     */
    @NotNull public Builder geoCovers(@NotNull GeospatialGeometry.Builder geospatialGeometry) {
      putValue("geoCovers", geospatialGeometry.build());
      return this;
    }
    /**
     * Represents a relationship between two geometries (or the places they represent), relating a covering geometry to a covered geometry. &quot;Every point of b is a point of (the interior or boundary of) a&quot;. As defined in [DE-9IM](https://en.wikipedia.org/wiki/DE-9IM).
     */
    @NotNull public Builder geoCovers(@NotNull Place place) {
      putValue("geoCovers", place);
      return this;
    }
    /**
     * Represents a relationship between two geometries (or the places they represent), relating a covering geometry to a covered geometry. &quot;Every point of b is a point of (the interior or boundary of) a&quot;. As defined in [DE-9IM](https://en.wikipedia.org/wiki/DE-9IM).
     */
    @NotNull public Builder geoCovers(@NotNull Place.Builder place) {
      putValue("geoCovers", place.build());
      return this;
    }
    /**
     * The special opening hours of a certain place.\n\nUse this to explicitly override general opening hours brought in scope by [[openingHoursSpecification]] or [[openingHours]].
     *       
     */
    @NotNull public Builder specialOpeningHoursSpecification(@NotNull OpeningHoursSpecification openingHoursSpecification) {
      putValue("specialOpeningHoursSpecification", openingHoursSpecification);
      return this;
    }
    /**
     * The special opening hours of a certain place.\n\nUse this to explicitly override general opening hours brought in scope by [[openingHoursSpecification]] or [[openingHours]].
     *       
     */
    @NotNull public Builder specialOpeningHoursSpecification(@NotNull OpeningHoursSpecification.Builder openingHoursSpecification) {
      putValue("specialOpeningHoursSpecification", openingHoursSpecification.build());
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
     * A slogan or motto associated with the item.
     */
    @NotNull public Builder slogan(@NotNull String slogan) {
      putValue("slogan", slogan);
      return this;
    }
    /**
     * A short textual code (also called &quot;store code&quot;) that uniquely identifies a place of business. The code is typically assigned by the parentOrganization and used in structured URLs.\n\nFor example, in the URL http://www.starbucks.co.uk/store-locator/etc/detail/3047 the code &quot;3047&quot; is a branchCode for a particular branch.
     *       
     */
    @NotNull public Builder branchCode(@NotNull String branchCode) {
      putValue("branchCode", branchCode);
      return this;
    }
    /**
     * Represents a relationship between two geometries (or the places they represent), relating a containing geometry to a contained geometry. &quot;a contains b iff no points of b lie in the exterior of a, and at least one point of the interior of b lies in the interior of a&quot;. As defined in [DE-9IM](https://en.wikipedia.org/wiki/DE-9IM).
     */
    @NotNull public Builder geoContains(@NotNull GeospatialGeometry geospatialGeometry) {
      putValue("geoContains", geospatialGeometry);
      return this;
    }
    /**
     * Represents a relationship between two geometries (or the places they represent), relating a containing geometry to a contained geometry. &quot;a contains b iff no points of b lie in the exterior of a, and at least one point of the interior of b lies in the interior of a&quot;. As defined in [DE-9IM](https://en.wikipedia.org/wiki/DE-9IM).
     */
    @NotNull public Builder geoContains(@NotNull GeospatialGeometry.Builder geospatialGeometry) {
      putValue("geoContains", geospatialGeometry.build());
      return this;
    }
    /**
     * Represents a relationship between two geometries (or the places they represent), relating a containing geometry to a contained geometry. &quot;a contains b iff no points of b lie in the exterior of a, and at least one point of the interior of b lies in the interior of a&quot;. As defined in [DE-9IM](https://en.wikipedia.org/wiki/DE-9IM).
     */
    @NotNull public Builder geoContains(@NotNull Place place) {
      putValue("geoContains", place);
      return this;
    }
    /**
     * Represents a relationship between two geometries (or the places they represent), relating a containing geometry to a contained geometry. &quot;a contains b iff no points of b lie in the exterior of a, and at least one point of the interior of b lies in the interior of a&quot;. As defined in [DE-9IM](https://en.wikipedia.org/wiki/DE-9IM).
     */
    @NotNull public Builder geoContains(@NotNull Place.Builder place) {
      putValue("geoContains", place.build());
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
     * A flag to signal that the [[Place]] is open to public visitors.  If this property is omitted there is no assumed default boolean value
     */
    @NotNull public Builder publicAccess(@NotNull Boolean publicAccess) {
      putValue("publicAccess", publicAccess);
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
      if ("geoWithin".equals(key) && value instanceof GeospatialGeometry) { this.geoWithin((GeospatialGeometry)value); return; }
      if ("geoWithins".equals(key) && value instanceof GeospatialGeometry) { this.geoWithin((GeospatialGeometry)value); return; }
      if ("geoWithin".equals(key) && value instanceof Place) { this.geoWithin((Place)value); return; }
      if ("geoWithins".equals(key) && value instanceof Place) { this.geoWithin((Place)value); return; }
      if ("event".equals(key) && value instanceof Event) { this.event((Event)value); return; }
      if ("events".equals(key) && value instanceof Event) { this.event((Event)value); return; }
      if ("tourBookingPage".equals(key) && value instanceof String) { this.tourBookingPage((String)value); return; }
      if ("tourBookingPages".equals(key) && value instanceof String) { this.tourBookingPage((String)value); return; }
      if ("geo".equals(key) && value instanceof GeoCoordinates) { this.geo((GeoCoordinates)value); return; }
      if ("geos".equals(key) && value instanceof GeoCoordinates) { this.geo((GeoCoordinates)value); return; }
      if ("geo".equals(key) && value instanceof GeoShape) { this.geo((GeoShape)value); return; }
      if ("geos".equals(key) && value instanceof GeoShape) { this.geo((GeoShape)value); return; }
      if ("geoDisjoint".equals(key) && value instanceof GeospatialGeometry) { this.geoDisjoint((GeospatialGeometry)value); return; }
      if ("geoDisjoints".equals(key) && value instanceof GeospatialGeometry) { this.geoDisjoint((GeospatialGeometry)value); return; }
      if ("geoDisjoint".equals(key) && value instanceof Place) { this.geoDisjoint((Place)value); return; }
      if ("geoDisjoints".equals(key) && value instanceof Place) { this.geoDisjoint((Place)value); return; }
      if ("hasMap".equals(key) && value instanceof Map) { this.hasMap((Map)value); return; }
      if ("hasMaps".equals(key) && value instanceof Map) { this.hasMap((Map)value); return; }
      if ("hasMap".equals(key) && value instanceof String) { this.hasMap((String)value); return; }
      if ("hasMaps".equals(key) && value instanceof String) { this.hasMap((String)value); return; }
      if ("geoTouches".equals(key) && value instanceof GeospatialGeometry) { this.geoTouches((GeospatialGeometry)value); return; }
      if ("geoTouchess".equals(key) && value instanceof GeospatialGeometry) { this.geoTouches((GeospatialGeometry)value); return; }
      if ("geoTouches".equals(key) && value instanceof Place) { this.geoTouches((Place)value); return; }
      if ("geoTouchess".equals(key) && value instanceof Place) { this.geoTouches((Place)value); return; }
      if ("geoIntersects".equals(key) && value instanceof GeospatialGeometry) { this.geoIntersects((GeospatialGeometry)value); return; }
      if ("geoIntersectss".equals(key) && value instanceof GeospatialGeometry) { this.geoIntersects((GeospatialGeometry)value); return; }
      if ("geoIntersects".equals(key) && value instanceof Place) { this.geoIntersects((Place)value); return; }
      if ("geoIntersectss".equals(key) && value instanceof Place) { this.geoIntersects((Place)value); return; }
      if ("aggregateRating".equals(key) && value instanceof AggregateRating) { this.aggregateRating((AggregateRating)value); return; }
      if ("aggregateRatings".equals(key) && value instanceof AggregateRating) { this.aggregateRating((AggregateRating)value); return; }
      if ("longitude".equals(key) && value instanceof Integer) { this.longitude((Integer)value); return; }
      if ("longitudes".equals(key) && value instanceof Integer) { this.longitude((Integer)value); return; }
      if ("longitude".equals(key) && value instanceof Long) { this.longitude((Long)value); return; }
      if ("longitudes".equals(key) && value instanceof Long) { this.longitude((Long)value); return; }
      if ("longitude".equals(key) && value instanceof Float) { this.longitude((Float)value); return; }
      if ("longitudes".equals(key) && value instanceof Float) { this.longitude((Float)value); return; }
      if ("longitude".equals(key) && value instanceof Double) { this.longitude((Double)value); return; }
      if ("longitudes".equals(key) && value instanceof Double) { this.longitude((Double)value); return; }
      if ("longitude".equals(key) && value instanceof String) { this.longitude((String)value); return; }
      if ("longitudes".equals(key) && value instanceof String) { this.longitude((String)value); return; }
      if ("telephone".equals(key) && value instanceof String) { this.telephone((String)value); return; }
      if ("telephones".equals(key) && value instanceof String) { this.telephone((String)value); return; }
      if ("geoCrosses".equals(key) && value instanceof GeospatialGeometry) { this.geoCrosses((GeospatialGeometry)value); return; }
      if ("geoCrossess".equals(key) && value instanceof GeospatialGeometry) { this.geoCrosses((GeospatialGeometry)value); return; }
      if ("geoCrosses".equals(key) && value instanceof Place) { this.geoCrosses((Place)value); return; }
      if ("geoCrossess".equals(key) && value instanceof Place) { this.geoCrosses((Place)value); return; }
      if ("logo".equals(key) && value instanceof Image) { this.logo((Image)value); return; }
      if ("logos".equals(key) && value instanceof Image) { this.logo((Image)value); return; }
      if ("isicV4".equals(key) && value instanceof String) { this.isicV4((String)value); return; }
      if ("isicV4s".equals(key) && value instanceof String) { this.isicV4((String)value); return; }
      if ("isAccessibleForFree".equals(key) && value instanceof Boolean) { this.isAccessibleForFree((Boolean)value); return; }
      if ("isAccessibleForFrees".equals(key) && value instanceof Boolean) { this.isAccessibleForFree((Boolean)value); return; }
      if ("photo".equals(key) && value instanceof Image) { this.photo((Image)value); return; }
      if ("photos".equals(key) && value instanceof Image) { this.photo((Image)value); return; }
      if ("containedInPlace".equals(key) && value instanceof Place) { this.containedInPlace((Place)value); return; }
      if ("containedInPlaces".equals(key) && value instanceof Place) { this.containedInPlace((Place)value); return; }
      if ("address".equals(key) && value instanceof PostalAddress) { this.address((PostalAddress)value); return; }
      if ("addresss".equals(key) && value instanceof PostalAddress) { this.address((PostalAddress)value); return; }
      if ("address".equals(key) && value instanceof String) { this.address((String)value); return; }
      if ("addresss".equals(key) && value instanceof String) { this.address((String)value); return; }
      if ("geoCoveredBy".equals(key) && value instanceof GeospatialGeometry) { this.geoCoveredBy((GeospatialGeometry)value); return; }
      if ("geoCoveredBys".equals(key) && value instanceof GeospatialGeometry) { this.geoCoveredBy((GeospatialGeometry)value); return; }
      if ("geoCoveredBy".equals(key) && value instanceof Place) { this.geoCoveredBy((Place)value); return; }
      if ("geoCoveredBys".equals(key) && value instanceof Place) { this.geoCoveredBy((Place)value); return; }
      if ("smokingAllowed".equals(key) && value instanceof Boolean) { this.smokingAllowed((Boolean)value); return; }
      if ("smokingAlloweds".equals(key) && value instanceof Boolean) { this.smokingAllowed((Boolean)value); return; }
      if ("additionalProperty".equals(key) && value instanceof PropertyValue) { this.additionalProperty((PropertyValue)value); return; }
      if ("additionalPropertys".equals(key) && value instanceof PropertyValue) { this.additionalProperty((PropertyValue)value); return; }
      if ("latitude".equals(key) && value instanceof Number) { this.latitude((Number)value); return; }
      if ("latitudes".equals(key) && value instanceof Number) { this.latitude((Number)value); return; }
      if ("latitude".equals(key) && value instanceof String) { this.latitude((String)value); return; }
      if ("latitudes".equals(key) && value instanceof String) { this.latitude((String)value); return; }
      if ("geoEquals".equals(key) && value instanceof GeospatialGeometry) { this.geoEquals((GeospatialGeometry)value); return; }
      if ("geoEqualss".equals(key) && value instanceof GeospatialGeometry) { this.geoEquals((GeospatialGeometry)value); return; }
      if ("geoEquals".equals(key) && value instanceof Place) { this.geoEquals((Place)value); return; }
      if ("geoEqualss".equals(key) && value instanceof Place) { this.geoEquals((Place)value); return; }
      if ("hasDriveThroughService".equals(key) && value instanceof Boolean) { this.hasDriveThroughService((Boolean)value); return; }
      if ("hasDriveThroughServices".equals(key) && value instanceof Boolean) { this.hasDriveThroughService((Boolean)value); return; }
      if ("globalLocationNumber".equals(key) && value instanceof Identifier) { this.globalLocationNumber((Identifier)value); return; }
      if ("globalLocationNumbers".equals(key) && value instanceof Identifier) { this.globalLocationNumber((Identifier)value); return; }
      if ("review".equals(key) && value instanceof Review) { this.review((Review)value); return; }
      if ("reviews".equals(key) && value instanceof Review) { this.review((Review)value); return; }
      if ("faxNumber".equals(key) && value instanceof String) { this.faxNumber((String)value); return; }
      if ("faxNumbers".equals(key) && value instanceof String) { this.faxNumber((String)value); return; }
      if ("geoOverlaps".equals(key) && value instanceof GeospatialGeometry) { this.geoOverlaps((GeospatialGeometry)value); return; }
      if ("geoOverlapss".equals(key) && value instanceof GeospatialGeometry) { this.geoOverlaps((GeospatialGeometry)value); return; }
      if ("geoOverlaps".equals(key) && value instanceof Place) { this.geoOverlaps((Place)value); return; }
      if ("geoOverlapss".equals(key) && value instanceof Place) { this.geoOverlaps((Place)value); return; }
      if ("maximumAttendeeCapacity".equals(key) && value instanceof Integer) { this.maximumAttendeeCapacity((Integer)value); return; }
      if ("maximumAttendeeCapacitys".equals(key) && value instanceof Integer) { this.maximumAttendeeCapacity((Integer)value); return; }
      if ("geoCovers".equals(key) && value instanceof GeospatialGeometry) { this.geoCovers((GeospatialGeometry)value); return; }
      if ("geoCoverss".equals(key) && value instanceof GeospatialGeometry) { this.geoCovers((GeospatialGeometry)value); return; }
      if ("geoCovers".equals(key) && value instanceof Place) { this.geoCovers((Place)value); return; }
      if ("geoCoverss".equals(key) && value instanceof Place) { this.geoCovers((Place)value); return; }
      if ("specialOpeningHoursSpecification".equals(key) && value instanceof OpeningHoursSpecification) { this.specialOpeningHoursSpecification((OpeningHoursSpecification)value); return; }
      if ("specialOpeningHoursSpecifications".equals(key) && value instanceof OpeningHoursSpecification) { this.specialOpeningHoursSpecification((OpeningHoursSpecification)value); return; }
      if ("openingHoursSpecification".equals(key) && value instanceof OpeningHoursSpecification) { this.openingHoursSpecification((OpeningHoursSpecification)value); return; }
      if ("openingHoursSpecifications".equals(key) && value instanceof OpeningHoursSpecification) { this.openingHoursSpecification((OpeningHoursSpecification)value); return; }
      if ("slogan".equals(key) && value instanceof String) { this.slogan((String)value); return; }
      if ("slogans".equals(key) && value instanceof String) { this.slogan((String)value); return; }
      if ("branchCode".equals(key) && value instanceof String) { this.branchCode((String)value); return; }
      if ("branchCodes".equals(key) && value instanceof String) { this.branchCode((String)value); return; }
      if ("geoContains".equals(key) && value instanceof GeospatialGeometry) { this.geoContains((GeospatialGeometry)value); return; }
      if ("geoContainss".equals(key) && value instanceof GeospatialGeometry) { this.geoContains((GeospatialGeometry)value); return; }
      if ("geoContains".equals(key) && value instanceof Place) { this.geoContains((Place)value); return; }
      if ("geoContainss".equals(key) && value instanceof Place) { this.geoContains((Place)value); return; }
      if ("amenityFeature".equals(key) && value instanceof LocationFeatureSpecification) { this.amenityFeature((LocationFeatureSpecification)value); return; }
      if ("amenityFeatures".equals(key) && value instanceof LocationFeatureSpecification) { this.amenityFeature((LocationFeatureSpecification)value); return; }
      if ("publicAccess".equals(key) && value instanceof Boolean) { this.publicAccess((Boolean)value); return; }
      if ("publicAccesss".equals(key) && value instanceof Boolean) { this.publicAccess((Boolean)value); return; }
      if ("containsPlace".equals(key) && value instanceof Place) { this.containsPlace((Place)value); return; }
      if ("containsPlaces".equals(key) && value instanceof Place) { this.containsPlace((Place)value); return; }
      super.fromMap(key, value);
    }
  }
  
}
