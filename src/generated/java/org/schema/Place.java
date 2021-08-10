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
 * Entities that have a somewhat fixed, physical extension.
 */
public class Place extends Thing implements org.schema.ContentLocation, SpatialCoverage, Location, AreaServed {
  /**
   * Represents a relationship between two geometries (or the places they represent), relating a geometry to one that contains it, i.e. it is inside (i.e. within) its interior. As defined in [DE-9IM](https://en.wikipedia.org/wiki/DE-9IM).
   * @return geoWithin property set by first invocation of geoWithin method or {@code null}.
   */
  @JsonIgnore public GeospatialGeometry getGeoWithinGeospatialGeometry() {
    return (GeospatialGeometry) getValue("geoWithin");
  }
  /**
   * Represents a relationship between two geometries (or the places they represent), relating a geometry to one that contains it, i.e. it is inside (i.e. within) its interior. As defined in [DE-9IM](https://en.wikipedia.org/wiki/DE-9IM).
   * @return all geoWithin properties as {@link java.util.Collection} or an empty collection 
   * if geoWithin was not set.
   */
  @JsonIgnore public java.util.Collection<GeospatialGeometry> getGeoWithinGeospatialGeometrys() {
    final java.lang.Object current = myData.get("geoWithin");
    if (current == null) return Collections.emptyList();
    if (current instanceof java.util.Collection) {
      return (java.util.Collection<GeospatialGeometry>) current;
    }
    return Arrays.asList((GeospatialGeometry) current);
  }
  /**
   * Represents a relationship between two geometries (or the places they represent), relating a geometry to one that contains it, i.e. it is inside (i.e. within) its interior. As defined in [DE-9IM](https://en.wikipedia.org/wiki/DE-9IM).
   * @return geoWithin property set by first invocation of geoWithin method or {@code null}.
   */
  @JsonIgnore public Place getGeoWithinPlace() {
    return (Place) getValue("geoWithin");
  }
  /**
   * Represents a relationship between two geometries (or the places they represent), relating a geometry to one that contains it, i.e. it is inside (i.e. within) its interior. As defined in [DE-9IM](https://en.wikipedia.org/wiki/DE-9IM).
   * @return all geoWithin properties as {@link java.util.Collection} or an empty collection 
   * if geoWithin was not set.
   */
  @JsonIgnore public java.util.Collection<Place> getGeoWithinPlaces() {
    final java.lang.Object current = myData.get("geoWithin");
    if (current == null) return Collections.emptyList();
    if (current instanceof java.util.Collection) {
      return (java.util.Collection<Place>) current;
    }
    return Arrays.asList((Place) current);
  }
  /**
   * Upcoming or past event associated with this place, organization, or action.
   * @return event property set by first invocation of event method or {@code null}.
   */
  @JsonIgnore public Event getEvent() {
    return (Event) getValue("event");
  }
  /**
   * Upcoming or past event associated with this place, organization, or action.
   * @return all event properties as {@link java.util.Collection} or an empty collection 
   * if event was not set.
   */
  @JsonIgnore public java.util.Collection<Event> getEvents() {
    final java.lang.Object current = myData.get("event");
    if (current == null) return Collections.emptyList();
    if (current instanceof java.util.Collection) {
      return (java.util.Collection<Event>) current;
    }
    return Arrays.asList((Event) current);
  }
  /**
   * A page providing information on how to book a tour of some [[Place]], such as an [[Accommodation]] or [[ApartmentComplex]] in a real estate setting, as well as other kinds of tours as appropriate.
   * @return tourBookingPage property set by first invocation of tourBookingPage method or {@code null}.
   */
  @JsonIgnore public String getTourBookingPage() {
    return (String) getValue("tourBookingPage");
  }
  /**
   * A page providing information on how to book a tour of some [[Place]], such as an [[Accommodation]] or [[ApartmentComplex]] in a real estate setting, as well as other kinds of tours as appropriate.
   * @return all tourBookingPage properties as {@link java.util.Collection} or an empty collection 
   * if tourBookingPage was not set.
   */
  @JsonIgnore public java.util.Collection<String> getTourBookingPages() {
    final java.lang.Object current = myData.get("tourBookingPage");
    if (current == null) return Collections.emptyList();
    if (current instanceof java.util.Collection) {
      return (java.util.Collection<String>) current;
    }
    return Arrays.asList((String) current);
  }
  /**
   * The geo coordinates of the place.
   * @return geo property set by first invocation of geo method or {@code null}.
   */
  @JsonIgnore public GeoCoordinates getGeoGeoCoordinates() {
    return (GeoCoordinates) getValue("geo");
  }
  /**
   * The geo coordinates of the place.
   * @return all geo properties as {@link java.util.Collection} or an empty collection 
   * if geo was not set.
   */
  @JsonIgnore public java.util.Collection<GeoCoordinates> getGeoGeoCoordinatess() {
    final java.lang.Object current = myData.get("geo");
    if (current == null) return Collections.emptyList();
    if (current instanceof java.util.Collection) {
      return (java.util.Collection<GeoCoordinates>) current;
    }
    return Arrays.asList((GeoCoordinates) current);
  }
  /**
   * The geo coordinates of the place.
   * @return geo property set by first invocation of geo method or {@code null}.
   */
  @JsonIgnore public GeoShape getGeoGeoShape() {
    return (GeoShape) getValue("geo");
  }
  /**
   * The geo coordinates of the place.
   * @return all geo properties as {@link java.util.Collection} or an empty collection 
   * if geo was not set.
   */
  @JsonIgnore public java.util.Collection<GeoShape> getGeoGeoShapes() {
    final java.lang.Object current = myData.get("geo");
    if (current == null) return Collections.emptyList();
    if (current instanceof java.util.Collection) {
      return (java.util.Collection<GeoShape>) current;
    }
    return Arrays.asList((GeoShape) current);
  }
  /**
   * Represents spatial relations in which two geometries (or the places they represent) are topologically disjoint: they have no point in common. They form a set of disconnected geometries.&quot; (a symmetric relationship, as defined in [DE-9IM](https://en.wikipedia.org/wiki/DE-9IM))
   * @return geoDisjoint property set by first invocation of geoDisjoint method or {@code null}.
   */
  @JsonIgnore public GeospatialGeometry getGeoDisjointGeospatialGeometry() {
    return (GeospatialGeometry) getValue("geoDisjoint");
  }
  /**
   * Represents spatial relations in which two geometries (or the places they represent) are topologically disjoint: they have no point in common. They form a set of disconnected geometries.&quot; (a symmetric relationship, as defined in [DE-9IM](https://en.wikipedia.org/wiki/DE-9IM))
   * @return all geoDisjoint properties as {@link java.util.Collection} or an empty collection 
   * if geoDisjoint was not set.
   */
  @JsonIgnore public java.util.Collection<GeospatialGeometry> getGeoDisjointGeospatialGeometrys() {
    final java.lang.Object current = myData.get("geoDisjoint");
    if (current == null) return Collections.emptyList();
    if (current instanceof java.util.Collection) {
      return (java.util.Collection<GeospatialGeometry>) current;
    }
    return Arrays.asList((GeospatialGeometry) current);
  }
  /**
   * Represents spatial relations in which two geometries (or the places they represent) are topologically disjoint: they have no point in common. They form a set of disconnected geometries.&quot; (a symmetric relationship, as defined in [DE-9IM](https://en.wikipedia.org/wiki/DE-9IM))
   * @return geoDisjoint property set by first invocation of geoDisjoint method or {@code null}.
   */
  @JsonIgnore public Place getGeoDisjointPlace() {
    return (Place) getValue("geoDisjoint");
  }
  /**
   * Represents spatial relations in which two geometries (or the places they represent) are topologically disjoint: they have no point in common. They form a set of disconnected geometries.&quot; (a symmetric relationship, as defined in [DE-9IM](https://en.wikipedia.org/wiki/DE-9IM))
   * @return all geoDisjoint properties as {@link java.util.Collection} or an empty collection 
   * if geoDisjoint was not set.
   */
  @JsonIgnore public java.util.Collection<Place> getGeoDisjointPlaces() {
    final java.lang.Object current = myData.get("geoDisjoint");
    if (current == null) return Collections.emptyList();
    if (current instanceof java.util.Collection) {
      return (java.util.Collection<Place>) current;
    }
    return Arrays.asList((Place) current);
  }
  /**
   * A URL to a map of the place.
   * @return hasMap property set by first invocation of hasMap method or {@code null}.
   */
  @JsonIgnore public Map getHasMapMap() {
    return (Map) getValue("hasMap");
  }
  /**
   * A URL to a map of the place.
   * @return all hasMap properties as {@link java.util.Collection} or an empty collection 
   * if hasMap was not set.
   */
  @JsonIgnore public java.util.Collection<Map> getHasMapMaps() {
    final java.lang.Object current = myData.get("hasMap");
    if (current == null) return Collections.emptyList();
    if (current instanceof java.util.Collection) {
      return (java.util.Collection<Map>) current;
    }
    return Arrays.asList((Map) current);
  }
  /**
   * A URL to a map of the place.
   * @return hasMap property set by first invocation of hasMap method or {@code null}.
   */
  @JsonIgnore public String getHasMapString() {
    return (String) getValue("hasMap");
  }
  /**
   * A URL to a map of the place.
   * @return all hasMap properties as {@link java.util.Collection} or an empty collection 
   * if hasMap was not set.
   */
  @JsonIgnore public java.util.Collection<String> getHasMapStrings() {
    final java.lang.Object current = myData.get("hasMap");
    if (current == null) return Collections.emptyList();
    if (current instanceof java.util.Collection) {
      return (java.util.Collection<String>) current;
    }
    return Arrays.asList((String) current);
  }
  /**
   * Represents spatial relations in which two geometries (or the places they represent) touch: they have at least one boundary point in common, but no interior points.&quot; (a symmetric relationship, as defined in [DE-9IM](https://en.wikipedia.org/wiki/DE-9IM) )
   * @return geoTouches property set by first invocation of geoTouches method or {@code null}.
   */
  @JsonIgnore public GeospatialGeometry getGeoTouchesGeospatialGeometry() {
    return (GeospatialGeometry) getValue("geoTouches");
  }
  /**
   * Represents spatial relations in which two geometries (or the places they represent) touch: they have at least one boundary point in common, but no interior points.&quot; (a symmetric relationship, as defined in [DE-9IM](https://en.wikipedia.org/wiki/DE-9IM) )
   * @return all geoTouches properties as {@link java.util.Collection} or an empty collection 
   * if geoTouches was not set.
   */
  @JsonIgnore public java.util.Collection<GeospatialGeometry> getGeoTouchesGeospatialGeometrys() {
    final java.lang.Object current = myData.get("geoTouches");
    if (current == null) return Collections.emptyList();
    if (current instanceof java.util.Collection) {
      return (java.util.Collection<GeospatialGeometry>) current;
    }
    return Arrays.asList((GeospatialGeometry) current);
  }
  /**
   * Represents spatial relations in which two geometries (or the places they represent) touch: they have at least one boundary point in common, but no interior points.&quot; (a symmetric relationship, as defined in [DE-9IM](https://en.wikipedia.org/wiki/DE-9IM) )
   * @return geoTouches property set by first invocation of geoTouches method or {@code null}.
   */
  @JsonIgnore public Place getGeoTouchesPlace() {
    return (Place) getValue("geoTouches");
  }
  /**
   * Represents spatial relations in which two geometries (or the places they represent) touch: they have at least one boundary point in common, but no interior points.&quot; (a symmetric relationship, as defined in [DE-9IM](https://en.wikipedia.org/wiki/DE-9IM) )
   * @return all geoTouches properties as {@link java.util.Collection} or an empty collection 
   * if geoTouches was not set.
   */
  @JsonIgnore public java.util.Collection<Place> getGeoTouchesPlaces() {
    final java.lang.Object current = myData.get("geoTouches");
    if (current == null) return Collections.emptyList();
    if (current instanceof java.util.Collection) {
      return (java.util.Collection<Place>) current;
    }
    return Arrays.asList((Place) current);
  }
  /**
   * Represents spatial relations in which two geometries (or the places they represent) have at least one point in common. As defined in [DE-9IM](https://en.wikipedia.org/wiki/DE-9IM).
   * @return geoIntersects property set by first invocation of geoIntersects method or {@code null}.
   */
  @JsonIgnore public GeospatialGeometry getGeoIntersectsGeospatialGeometry() {
    return (GeospatialGeometry) getValue("geoIntersects");
  }
  /**
   * Represents spatial relations in which two geometries (or the places they represent) have at least one point in common. As defined in [DE-9IM](https://en.wikipedia.org/wiki/DE-9IM).
   * @return all geoIntersects properties as {@link java.util.Collection} or an empty collection 
   * if geoIntersects was not set.
   */
  @JsonIgnore public java.util.Collection<GeospatialGeometry> getGeoIntersectsGeospatialGeometrys() {
    final java.lang.Object current = myData.get("geoIntersects");
    if (current == null) return Collections.emptyList();
    if (current instanceof java.util.Collection) {
      return (java.util.Collection<GeospatialGeometry>) current;
    }
    return Arrays.asList((GeospatialGeometry) current);
  }
  /**
   * Represents spatial relations in which two geometries (or the places they represent) have at least one point in common. As defined in [DE-9IM](https://en.wikipedia.org/wiki/DE-9IM).
   * @return geoIntersects property set by first invocation of geoIntersects method or {@code null}.
   */
  @JsonIgnore public Place getGeoIntersectsPlace() {
    return (Place) getValue("geoIntersects");
  }
  /**
   * Represents spatial relations in which two geometries (or the places they represent) have at least one point in common. As defined in [DE-9IM](https://en.wikipedia.org/wiki/DE-9IM).
   * @return all geoIntersects properties as {@link java.util.Collection} or an empty collection 
   * if geoIntersects was not set.
   */
  @JsonIgnore public java.util.Collection<Place> getGeoIntersectsPlaces() {
    final java.lang.Object current = myData.get("geoIntersects");
    if (current == null) return Collections.emptyList();
    if (current instanceof java.util.Collection) {
      return (java.util.Collection<Place>) current;
    }
    return Arrays.asList((Place) current);
  }
  /**
   * The overall rating, based on a collection of reviews or ratings, of the item.
   * @return aggregateRating property set by first invocation of aggregateRating method or {@code null}.
   */
  @JsonIgnore public AggregateRating getAggregateRating() {
    return (AggregateRating) getValue("aggregateRating");
  }
  /**
   * The overall rating, based on a collection of reviews or ratings, of the item.
   * @return all aggregateRating properties as {@link java.util.Collection} or an empty collection 
   * if aggregateRating was not set.
   */
  @JsonIgnore public java.util.Collection<AggregateRating> getAggregateRatings() {
    final java.lang.Object current = myData.get("aggregateRating");
    if (current == null) return Collections.emptyList();
    if (current instanceof java.util.Collection) {
      return (java.util.Collection<AggregateRating>) current;
    }
    return Arrays.asList((AggregateRating) current);
  }
  /**
   * The longitude of a location. For example ```-122.08585``` ([WGS 84](https://en.wikipedia.org/wiki/World_Geodetic_System)).
   * @return longitude property set by first invocation of longitude method or {@code null}.
   */
  @JsonIgnore public Integer getLongitudeInteger() {
    return (Integer) getValue("longitude");
  }
  /**
   * The longitude of a location. For example ```-122.08585``` ([WGS 84](https://en.wikipedia.org/wiki/World_Geodetic_System)).
   * @return all longitude properties as {@link java.util.Collection} or an empty collection 
   * if longitude was not set.
   */
  @JsonIgnore public java.util.Collection<Integer> getLongitudeIntegers() {
    final java.lang.Object current = myData.get("longitude");
    if (current == null) return Collections.emptyList();
    if (current instanceof java.util.Collection) {
      return (java.util.Collection<Integer>) current;
    }
    return Arrays.asList((Integer) current);
  }
  /**
   * The longitude of a location. For example ```-122.08585``` ([WGS 84](https://en.wikipedia.org/wiki/World_Geodetic_System)).
   * @return longitude property set by first invocation of longitude method or {@code null}.
   */
  @JsonIgnore public Long getLongitudeLong() {
    return (Long) getValue("longitude");
  }
  /**
   * The longitude of a location. For example ```-122.08585``` ([WGS 84](https://en.wikipedia.org/wiki/World_Geodetic_System)).
   * @return all longitude properties as {@link java.util.Collection} or an empty collection 
   * if longitude was not set.
   */
  @JsonIgnore public java.util.Collection<Long> getLongitudeLongs() {
    final java.lang.Object current = myData.get("longitude");
    if (current == null) return Collections.emptyList();
    if (current instanceof java.util.Collection) {
      return (java.util.Collection<Long>) current;
    }
    return Arrays.asList((Long) current);
  }
  /**
   * The longitude of a location. For example ```-122.08585``` ([WGS 84](https://en.wikipedia.org/wiki/World_Geodetic_System)).
   * @return longitude property set by first invocation of longitude method or {@code null}.
   */
  @JsonIgnore public Float getLongitudeFloat() {
    return (Float) getValue("longitude");
  }
  /**
   * The longitude of a location. For example ```-122.08585``` ([WGS 84](https://en.wikipedia.org/wiki/World_Geodetic_System)).
   * @return all longitude properties as {@link java.util.Collection} or an empty collection 
   * if longitude was not set.
   */
  @JsonIgnore public java.util.Collection<Float> getLongitudeFloats() {
    final java.lang.Object current = myData.get("longitude");
    if (current == null) return Collections.emptyList();
    if (current instanceof java.util.Collection) {
      return (java.util.Collection<Float>) current;
    }
    return Arrays.asList((Float) current);
  }
  /**
   * The longitude of a location. For example ```-122.08585``` ([WGS 84](https://en.wikipedia.org/wiki/World_Geodetic_System)).
   * @return longitude property set by first invocation of longitude method or {@code null}.
   */
  @JsonIgnore public Double getLongitudeDouble() {
    return (Double) getValue("longitude");
  }
  /**
   * The longitude of a location. For example ```-122.08585``` ([WGS 84](https://en.wikipedia.org/wiki/World_Geodetic_System)).
   * @return all longitude properties as {@link java.util.Collection} or an empty collection 
   * if longitude was not set.
   */
  @JsonIgnore public java.util.Collection<Double> getLongitudeDoubles() {
    final java.lang.Object current = myData.get("longitude");
    if (current == null) return Collections.emptyList();
    if (current instanceof java.util.Collection) {
      return (java.util.Collection<Double>) current;
    }
    return Arrays.asList((Double) current);
  }
  /**
   * The longitude of a location. For example ```-122.08585``` ([WGS 84](https://en.wikipedia.org/wiki/World_Geodetic_System)).
   * @return longitude property set by first invocation of longitude method or {@code null}.
   */
  @JsonIgnore public String getLongitudeString() {
    return (String) getValue("longitude");
  }
  /**
   * The longitude of a location. For example ```-122.08585``` ([WGS 84](https://en.wikipedia.org/wiki/World_Geodetic_System)).
   * @return all longitude properties as {@link java.util.Collection} or an empty collection 
   * if longitude was not set.
   */
  @JsonIgnore public java.util.Collection<String> getLongitudeStrings() {
    final java.lang.Object current = myData.get("longitude");
    if (current == null) return Collections.emptyList();
    if (current instanceof java.util.Collection) {
      return (java.util.Collection<String>) current;
    }
    return Arrays.asList((String) current);
  }
  /**
   * The telephone number.
   * @return telephone property set by first invocation of telephone method or {@code null}.
   */
  @JsonIgnore public String getTelephone() {
    return (String) getValue("telephone");
  }
  /**
   * The telephone number.
   * @return all telephone properties as {@link java.util.Collection} or an empty collection 
   * if telephone was not set.
   */
  @JsonIgnore public java.util.Collection<String> getTelephones() {
    final java.lang.Object current = myData.get("telephone");
    if (current == null) return Collections.emptyList();
    if (current instanceof java.util.Collection) {
      return (java.util.Collection<String>) current;
    }
    return Arrays.asList((String) current);
  }
  /**
   * Represents a relationship between two geometries (or the places they represent), relating a geometry to another that crosses it: &quot;a crosses b: they have some but not all interior points in common, and the dimension of the intersection is less than that of at least one of them&quot;. As defined in [DE-9IM](https://en.wikipedia.org/wiki/DE-9IM).
   * @return geoCrosses property set by first invocation of geoCrosses method or {@code null}.
   */
  @JsonIgnore public GeospatialGeometry getGeoCrossesGeospatialGeometry() {
    return (GeospatialGeometry) getValue("geoCrosses");
  }
  /**
   * Represents a relationship between two geometries (or the places they represent), relating a geometry to another that crosses it: &quot;a crosses b: they have some but not all interior points in common, and the dimension of the intersection is less than that of at least one of them&quot;. As defined in [DE-9IM](https://en.wikipedia.org/wiki/DE-9IM).
   * @return all geoCrosses properties as {@link java.util.Collection} or an empty collection 
   * if geoCrosses was not set.
   */
  @JsonIgnore public java.util.Collection<GeospatialGeometry> getGeoCrossesGeospatialGeometrys() {
    final java.lang.Object current = myData.get("geoCrosses");
    if (current == null) return Collections.emptyList();
    if (current instanceof java.util.Collection) {
      return (java.util.Collection<GeospatialGeometry>) current;
    }
    return Arrays.asList((GeospatialGeometry) current);
  }
  /**
   * Represents a relationship between two geometries (or the places they represent), relating a geometry to another that crosses it: &quot;a crosses b: they have some but not all interior points in common, and the dimension of the intersection is less than that of at least one of them&quot;. As defined in [DE-9IM](https://en.wikipedia.org/wiki/DE-9IM).
   * @return geoCrosses property set by first invocation of geoCrosses method or {@code null}.
   */
  @JsonIgnore public Place getGeoCrossesPlace() {
    return (Place) getValue("geoCrosses");
  }
  /**
   * Represents a relationship between two geometries (or the places they represent), relating a geometry to another that crosses it: &quot;a crosses b: they have some but not all interior points in common, and the dimension of the intersection is less than that of at least one of them&quot;. As defined in [DE-9IM](https://en.wikipedia.org/wiki/DE-9IM).
   * @return all geoCrosses properties as {@link java.util.Collection} or an empty collection 
   * if geoCrosses was not set.
   */
  @JsonIgnore public java.util.Collection<Place> getGeoCrossesPlaces() {
    final java.lang.Object current = myData.get("geoCrosses");
    if (current == null) return Collections.emptyList();
    if (current instanceof java.util.Collection) {
      return (java.util.Collection<Place>) current;
    }
    return Arrays.asList((Place) current);
  }
  /**
   * An associated logo.
   * @return logo property set by first invocation of logo method or {@code null}.
   */
  @JsonIgnore public Image getLogo() {
    return (Image) getValue("logo");
  }
  /**
   * An associated logo.
   * @return all logo properties as {@link java.util.Collection} or an empty collection 
   * if logo was not set.
   */
  @JsonIgnore public java.util.Collection<Image> getLogos() {
    final java.lang.Object current = myData.get("logo");
    if (current == null) return Collections.emptyList();
    if (current instanceof java.util.Collection) {
      return (java.util.Collection<Image>) current;
    }
    return Arrays.asList((Image) current);
  }
  /**
   * The International Standard of Industrial Classification of All Economic Activities (ISIC), Revision 4 code for a particular organization, business person, or place.
   * @return isicV4 property set by first invocation of isicV4 method or {@code null}.
   */
  @JsonIgnore public String getIsicV4() {
    return (String) getValue("isicV4");
  }
  /**
   * The International Standard of Industrial Classification of All Economic Activities (ISIC), Revision 4 code for a particular organization, business person, or place.
   * @return all isicV4 properties as {@link java.util.Collection} or an empty collection 
   * if isicV4 was not set.
   */
  @JsonIgnore public java.util.Collection<String> getIsicV4s() {
    final java.lang.Object current = myData.get("isicV4");
    if (current == null) return Collections.emptyList();
    if (current instanceof java.util.Collection) {
      return (java.util.Collection<String>) current;
    }
    return Arrays.asList((String) current);
  }
  /**
   * A flag to signal that the item, event, or place is accessible for free.
   * @return isAccessibleForFree property set by first invocation of isAccessibleForFree method or {@code null}.
   */
  @JsonIgnore public Boolean getIsAccessibleForFree() {
    return (Boolean) getValue("isAccessibleForFree");
  }
  /**
   * A flag to signal that the item, event, or place is accessible for free.
   * @return all isAccessibleForFree properties as {@link java.util.Collection} or an empty collection 
   * if isAccessibleForFree was not set.
   */
  @JsonIgnore public java.util.Collection<Boolean> getIsAccessibleForFrees() {
    final java.lang.Object current = myData.get("isAccessibleForFree");
    if (current == null) return Collections.emptyList();
    if (current instanceof java.util.Collection) {
      return (java.util.Collection<Boolean>) current;
    }
    return Arrays.asList((Boolean) current);
  }
  /**
   * A photograph of this place.
   * @return photo property set by first invocation of photo method or {@code null}.
   */
  @JsonIgnore public Image getPhoto() {
    return (Image) getValue("photo");
  }
  /**
   * A photograph of this place.
   * @return all photo properties as {@link java.util.Collection} or an empty collection 
   * if photo was not set.
   */
  @JsonIgnore public java.util.Collection<Image> getPhotos() {
    final java.lang.Object current = myData.get("photo");
    if (current == null) return Collections.emptyList();
    if (current instanceof java.util.Collection) {
      return (java.util.Collection<Image>) current;
    }
    return Arrays.asList((Image) current);
  }
  /**
   * The basic containment relation between a place and one that contains it.
   * @return containedInPlace property set by first invocation of containedInPlace method or {@code null}.
   */
  @JsonIgnore public Place getContainedInPlace() {
    return (Place) getValue("containedInPlace");
  }
  /**
   * The basic containment relation between a place and one that contains it.
   * @return all containedInPlace properties as {@link java.util.Collection} or an empty collection 
   * if containedInPlace was not set.
   */
  @JsonIgnore public java.util.Collection<Place> getContainedInPlaces() {
    final java.lang.Object current = myData.get("containedInPlace");
    if (current == null) return Collections.emptyList();
    if (current instanceof java.util.Collection) {
      return (java.util.Collection<Place>) current;
    }
    return Arrays.asList((Place) current);
  }
  /**
   * Physical address of the item.
   * @return address property set by first invocation of address method or {@code null}.
   */
  @JsonIgnore public PostalAddress getAddressPostalAddress() {
    return (PostalAddress) getValue("address");
  }
  /**
   * Physical address of the item.
   * @return all address properties as {@link java.util.Collection} or an empty collection 
   * if address was not set.
   */
  @JsonIgnore public java.util.Collection<PostalAddress> getAddressPostalAddresss() {
    final java.lang.Object current = myData.get("address");
    if (current == null) return Collections.emptyList();
    if (current instanceof java.util.Collection) {
      return (java.util.Collection<PostalAddress>) current;
    }
    return Arrays.asList((PostalAddress) current);
  }
  /**
   * Physical address of the item.
   * @return address property set by first invocation of address method or {@code null}.
   */
  @JsonIgnore public String getAddressString() {
    return (String) getValue("address");
  }
  /**
   * Physical address of the item.
   * @return all address properties as {@link java.util.Collection} or an empty collection 
   * if address was not set.
   */
  @JsonIgnore public java.util.Collection<String> getAddressStrings() {
    final java.lang.Object current = myData.get("address");
    if (current == null) return Collections.emptyList();
    if (current instanceof java.util.Collection) {
      return (java.util.Collection<String>) current;
    }
    return Arrays.asList((String) current);
  }
  /**
   * Represents a relationship between two geometries (or the places they represent), relating a geometry to another that covers it. As defined in [DE-9IM](https://en.wikipedia.org/wiki/DE-9IM).
   * @return geoCoveredBy property set by first invocation of geoCoveredBy method or {@code null}.
   */
  @JsonIgnore public GeospatialGeometry getGeoCoveredByGeospatialGeometry() {
    return (GeospatialGeometry) getValue("geoCoveredBy");
  }
  /**
   * Represents a relationship between two geometries (or the places they represent), relating a geometry to another that covers it. As defined in [DE-9IM](https://en.wikipedia.org/wiki/DE-9IM).
   * @return all geoCoveredBy properties as {@link java.util.Collection} or an empty collection 
   * if geoCoveredBy was not set.
   */
  @JsonIgnore public java.util.Collection<GeospatialGeometry> getGeoCoveredByGeospatialGeometrys() {
    final java.lang.Object current = myData.get("geoCoveredBy");
    if (current == null) return Collections.emptyList();
    if (current instanceof java.util.Collection) {
      return (java.util.Collection<GeospatialGeometry>) current;
    }
    return Arrays.asList((GeospatialGeometry) current);
  }
  /**
   * Represents a relationship between two geometries (or the places they represent), relating a geometry to another that covers it. As defined in [DE-9IM](https://en.wikipedia.org/wiki/DE-9IM).
   * @return geoCoveredBy property set by first invocation of geoCoveredBy method or {@code null}.
   */
  @JsonIgnore public Place getGeoCoveredByPlace() {
    return (Place) getValue("geoCoveredBy");
  }
  /**
   * Represents a relationship between two geometries (or the places they represent), relating a geometry to another that covers it. As defined in [DE-9IM](https://en.wikipedia.org/wiki/DE-9IM).
   * @return all geoCoveredBy properties as {@link java.util.Collection} or an empty collection 
   * if geoCoveredBy was not set.
   */
  @JsonIgnore public java.util.Collection<Place> getGeoCoveredByPlaces() {
    final java.lang.Object current = myData.get("geoCoveredBy");
    if (current == null) return Collections.emptyList();
    if (current instanceof java.util.Collection) {
      return (java.util.Collection<Place>) current;
    }
    return Arrays.asList((Place) current);
  }
  /**
   * Indicates whether it is allowed to smoke in the place, e.g. in the restaurant, hotel or hotel room.
   * @return smokingAllowed property set by first invocation of smokingAllowed method or {@code null}.
   */
  @JsonIgnore public Boolean getSmokingAllowed() {
    return (Boolean) getValue("smokingAllowed");
  }
  /**
   * Indicates whether it is allowed to smoke in the place, e.g. in the restaurant, hotel or hotel room.
   * @return all smokingAllowed properties as {@link java.util.Collection} or an empty collection 
   * if smokingAllowed was not set.
   */
  @JsonIgnore public java.util.Collection<Boolean> getSmokingAlloweds() {
    final java.lang.Object current = myData.get("smokingAllowed");
    if (current == null) return Collections.emptyList();
    if (current instanceof java.util.Collection) {
      return (java.util.Collection<Boolean>) current;
    }
    return Arrays.asList((Boolean) current);
  }
  /**
   * A property-value pair representing an additional characteristics of the entitity, e.g. a product feature or another characteristic for which there is no matching property in schema.org.\n\nNote: Publishers should be aware that applications designed to use specific schema.org properties (e.g. http://schema.org/width, http://schema.org/color, http://schema.org/gtin13, ...) will typically expect such data to be provided using those properties, rather than using the generic property/value mechanism.
   * 
   * @return additionalProperty property set by first invocation of additionalProperty method or {@code null}.
   */
  @JsonIgnore public PropertyValue getAdditionalProperty() {
    return (PropertyValue) getValue("additionalProperty");
  }
  /**
   * A property-value pair representing an additional characteristics of the entitity, e.g. a product feature or another characteristic for which there is no matching property in schema.org.\n\nNote: Publishers should be aware that applications designed to use specific schema.org properties (e.g. http://schema.org/width, http://schema.org/color, http://schema.org/gtin13, ...) will typically expect such data to be provided using those properties, rather than using the generic property/value mechanism.
   * 
   * @return all additionalProperty properties as {@link java.util.Collection} or an empty collection 
   * if additionalProperty was not set.
   */
  @JsonIgnore public java.util.Collection<PropertyValue> getAdditionalPropertys() {
    final java.lang.Object current = myData.get("additionalProperty");
    if (current == null) return Collections.emptyList();
    if (current instanceof java.util.Collection) {
      return (java.util.Collection<PropertyValue>) current;
    }
    return Arrays.asList((PropertyValue) current);
  }
  /**
   * The latitude of a location. For example ```37.42242``` ([WGS 84](https://en.wikipedia.org/wiki/World_Geodetic_System)).
   * @return latitude property set by first invocation of latitude method or {@code null}.
   */
  @JsonIgnore public Number getLatitudeNumber() {
    return (Number) getValue("latitude");
  }
  /**
   * The latitude of a location. For example ```37.42242``` ([WGS 84](https://en.wikipedia.org/wiki/World_Geodetic_System)).
   * @return all latitude properties as {@link java.util.Collection} or an empty collection 
   * if latitude was not set.
   */
  @JsonIgnore public java.util.Collection<Number> getLatitudeNumbers() {
    final java.lang.Object current = myData.get("latitude");
    if (current == null) return Collections.emptyList();
    if (current instanceof java.util.Collection) {
      return (java.util.Collection<Number>) current;
    }
    return Arrays.asList((Number) current);
  }
  /**
   * The latitude of a location. For example ```37.42242``` ([WGS 84](https://en.wikipedia.org/wiki/World_Geodetic_System)).
   * @return latitude property set by first invocation of latitude method or {@code null}.
   */
  @JsonIgnore public String getLatitudeString() {
    return (String) getValue("latitude");
  }
  /**
   * The latitude of a location. For example ```37.42242``` ([WGS 84](https://en.wikipedia.org/wiki/World_Geodetic_System)).
   * @return all latitude properties as {@link java.util.Collection} or an empty collection 
   * if latitude was not set.
   */
  @JsonIgnore public java.util.Collection<String> getLatitudeStrings() {
    final java.lang.Object current = myData.get("latitude");
    if (current == null) return Collections.emptyList();
    if (current instanceof java.util.Collection) {
      return (java.util.Collection<String>) current;
    }
    return Arrays.asList((String) current);
  }
  /**
   * Represents spatial relations in which two geometries (or the places they represent) are topologically equal, as defined in [DE-9IM](https://en.wikipedia.org/wiki/DE-9IM). &quot;Two geometries are topologically equal if their interiors intersect and no part of the interior or boundary of one geometry intersects the exterior of the other&quot; (a symmetric relationship)
   * @return geoEquals property set by first invocation of geoEquals method or {@code null}.
   */
  @JsonIgnore public GeospatialGeometry getGeoEqualsGeospatialGeometry() {
    return (GeospatialGeometry) getValue("geoEquals");
  }
  /**
   * Represents spatial relations in which two geometries (or the places they represent) are topologically equal, as defined in [DE-9IM](https://en.wikipedia.org/wiki/DE-9IM). &quot;Two geometries are topologically equal if their interiors intersect and no part of the interior or boundary of one geometry intersects the exterior of the other&quot; (a symmetric relationship)
   * @return all geoEquals properties as {@link java.util.Collection} or an empty collection 
   * if geoEquals was not set.
   */
  @JsonIgnore public java.util.Collection<GeospatialGeometry> getGeoEqualsGeospatialGeometrys() {
    final java.lang.Object current = myData.get("geoEquals");
    if (current == null) return Collections.emptyList();
    if (current instanceof java.util.Collection) {
      return (java.util.Collection<GeospatialGeometry>) current;
    }
    return Arrays.asList((GeospatialGeometry) current);
  }
  /**
   * Represents spatial relations in which two geometries (or the places they represent) are topologically equal, as defined in [DE-9IM](https://en.wikipedia.org/wiki/DE-9IM). &quot;Two geometries are topologically equal if their interiors intersect and no part of the interior or boundary of one geometry intersects the exterior of the other&quot; (a symmetric relationship)
   * @return geoEquals property set by first invocation of geoEquals method or {@code null}.
   */
  @JsonIgnore public Place getGeoEqualsPlace() {
    return (Place) getValue("geoEquals");
  }
  /**
   * Represents spatial relations in which two geometries (or the places they represent) are topologically equal, as defined in [DE-9IM](https://en.wikipedia.org/wiki/DE-9IM). &quot;Two geometries are topologically equal if their interiors intersect and no part of the interior or boundary of one geometry intersects the exterior of the other&quot; (a symmetric relationship)
   * @return all geoEquals properties as {@link java.util.Collection} or an empty collection 
   * if geoEquals was not set.
   */
  @JsonIgnore public java.util.Collection<Place> getGeoEqualsPlaces() {
    final java.lang.Object current = myData.get("geoEquals");
    if (current == null) return Collections.emptyList();
    if (current instanceof java.util.Collection) {
      return (java.util.Collection<Place>) current;
    }
    return Arrays.asList((Place) current);
  }
  /**
   * Indicates whether some facility (e.g. [[FoodEstablishment]], [[CovidTestingFacility]]) offers a service that can be used by driving through in a car. In the case of [[CovidTestingFacility]] such facilities could potentially help with social distancing from other potentially-infected users.
   * @return hasDriveThroughService property set by first invocation of hasDriveThroughService method or {@code null}.
   */
  @JsonIgnore public Boolean getHasDriveThroughService() {
    return (Boolean) getValue("hasDriveThroughService");
  }
  /**
   * Indicates whether some facility (e.g. [[FoodEstablishment]], [[CovidTestingFacility]]) offers a service that can be used by driving through in a car. In the case of [[CovidTestingFacility]] such facilities could potentially help with social distancing from other potentially-infected users.
   * @return all hasDriveThroughService properties as {@link java.util.Collection} or an empty collection 
   * if hasDriveThroughService was not set.
   */
  @JsonIgnore public java.util.Collection<Boolean> getHasDriveThroughServices() {
    final java.lang.Object current = myData.get("hasDriveThroughService");
    if (current == null) return Collections.emptyList();
    if (current instanceof java.util.Collection) {
      return (java.util.Collection<Boolean>) current;
    }
    return Arrays.asList((Boolean) current);
  }
  /**
   * The [Global Location Number](http://www.gs1.org/gln) (GLN, sometimes also referred to as International Location Number or ILN) of the respective organization, person, or place. The GLN is a 13-digit number used to identify parties and physical locations.
   * @return globalLocationNumber property set by first invocation of globalLocationNumber method or {@code null}.
   */
  @JsonIgnore public Identifier getGlobalLocationNumber() {
    return (Identifier) getValue("globalLocationNumber");
  }
  /**
   * The [Global Location Number](http://www.gs1.org/gln) (GLN, sometimes also referred to as International Location Number or ILN) of the respective organization, person, or place. The GLN is a 13-digit number used to identify parties and physical locations.
   * @return all globalLocationNumber properties as {@link java.util.Collection} or an empty collection 
   * if globalLocationNumber was not set.
   */
  @JsonIgnore public java.util.Collection<Identifier> getGlobalLocationNumbers() {
    final java.lang.Object current = myData.get("globalLocationNumber");
    if (current == null) return Collections.emptyList();
    if (current instanceof java.util.Collection) {
      return (java.util.Collection<Identifier>) current;
    }
    return Arrays.asList((Identifier) current);
  }
  /**
   * A review of the item.
   * @return review property set by first invocation of review method or {@code null}.
   */
  @JsonIgnore public Review getReview() {
    return (Review) getValue("review");
  }
  /**
   * A review of the item.
   * @return all review properties as {@link java.util.Collection} or an empty collection 
   * if review was not set.
   */
  @JsonIgnore public java.util.Collection<Review> getReviews() {
    final java.lang.Object current = myData.get("review");
    if (current == null) return Collections.emptyList();
    if (current instanceof java.util.Collection) {
      return (java.util.Collection<Review>) current;
    }
    return Arrays.asList((Review) current);
  }
  /**
   * The fax number.
   * @return faxNumber property set by first invocation of faxNumber method or {@code null}.
   */
  @JsonIgnore public String getFaxNumber() {
    return (String) getValue("faxNumber");
  }
  /**
   * The fax number.
   * @return all faxNumber properties as {@link java.util.Collection} or an empty collection 
   * if faxNumber was not set.
   */
  @JsonIgnore public java.util.Collection<String> getFaxNumbers() {
    final java.lang.Object current = myData.get("faxNumber");
    if (current == null) return Collections.emptyList();
    if (current instanceof java.util.Collection) {
      return (java.util.Collection<String>) current;
    }
    return Arrays.asList((String) current);
  }
  /**
   * Represents a relationship between two geometries (or the places they represent), relating a geometry to another that geospatially overlaps it, i.e. they have some but not all points in common. As defined in [DE-9IM](https://en.wikipedia.org/wiki/DE-9IM).
   * @return geoOverlaps property set by first invocation of geoOverlaps method or {@code null}.
   */
  @JsonIgnore public GeospatialGeometry getGeoOverlapsGeospatialGeometry() {
    return (GeospatialGeometry) getValue("geoOverlaps");
  }
  /**
   * Represents a relationship between two geometries (or the places they represent), relating a geometry to another that geospatially overlaps it, i.e. they have some but not all points in common. As defined in [DE-9IM](https://en.wikipedia.org/wiki/DE-9IM).
   * @return all geoOverlaps properties as {@link java.util.Collection} or an empty collection 
   * if geoOverlaps was not set.
   */
  @JsonIgnore public java.util.Collection<GeospatialGeometry> getGeoOverlapsGeospatialGeometrys() {
    final java.lang.Object current = myData.get("geoOverlaps");
    if (current == null) return Collections.emptyList();
    if (current instanceof java.util.Collection) {
      return (java.util.Collection<GeospatialGeometry>) current;
    }
    return Arrays.asList((GeospatialGeometry) current);
  }
  /**
   * Represents a relationship between two geometries (or the places they represent), relating a geometry to another that geospatially overlaps it, i.e. they have some but not all points in common. As defined in [DE-9IM](https://en.wikipedia.org/wiki/DE-9IM).
   * @return geoOverlaps property set by first invocation of geoOverlaps method or {@code null}.
   */
  @JsonIgnore public Place getGeoOverlapsPlace() {
    return (Place) getValue("geoOverlaps");
  }
  /**
   * Represents a relationship between two geometries (or the places they represent), relating a geometry to another that geospatially overlaps it, i.e. they have some but not all points in common. As defined in [DE-9IM](https://en.wikipedia.org/wiki/DE-9IM).
   * @return all geoOverlaps properties as {@link java.util.Collection} or an empty collection 
   * if geoOverlaps was not set.
   */
  @JsonIgnore public java.util.Collection<Place> getGeoOverlapsPlaces() {
    final java.lang.Object current = myData.get("geoOverlaps");
    if (current == null) return Collections.emptyList();
    if (current instanceof java.util.Collection) {
      return (java.util.Collection<Place>) current;
    }
    return Arrays.asList((Place) current);
  }
  /**
   * The total number of individuals that may attend an event or venue.
   * @return maximumAttendeeCapacity property set by first invocation of maximumAttendeeCapacity method or {@code null}.
   */
  @JsonIgnore public Integer getMaximumAttendeeCapacity() {
    return (Integer) getValue("maximumAttendeeCapacity");
  }
  /**
   * The total number of individuals that may attend an event or venue.
   * @return all maximumAttendeeCapacity properties as {@link java.util.Collection} or an empty collection 
   * if maximumAttendeeCapacity was not set.
   */
  @JsonIgnore public java.util.Collection<Integer> getMaximumAttendeeCapacitys() {
    final java.lang.Object current = myData.get("maximumAttendeeCapacity");
    if (current == null) return Collections.emptyList();
    if (current instanceof java.util.Collection) {
      return (java.util.Collection<Integer>) current;
    }
    return Arrays.asList((Integer) current);
  }
  /**
   * Represents a relationship between two geometries (or the places they represent), relating a covering geometry to a covered geometry. &quot;Every point of b is a point of (the interior or boundary of) a&quot;. As defined in [DE-9IM](https://en.wikipedia.org/wiki/DE-9IM).
   * @return geoCovers property set by first invocation of geoCovers method or {@code null}.
   */
  @JsonIgnore public GeospatialGeometry getGeoCoversGeospatialGeometry() {
    return (GeospatialGeometry) getValue("geoCovers");
  }
  /**
   * Represents a relationship between two geometries (or the places they represent), relating a covering geometry to a covered geometry. &quot;Every point of b is a point of (the interior or boundary of) a&quot;. As defined in [DE-9IM](https://en.wikipedia.org/wiki/DE-9IM).
   * @return all geoCovers properties as {@link java.util.Collection} or an empty collection 
   * if geoCovers was not set.
   */
  @JsonIgnore public java.util.Collection<GeospatialGeometry> getGeoCoversGeospatialGeometrys() {
    final java.lang.Object current = myData.get("geoCovers");
    if (current == null) return Collections.emptyList();
    if (current instanceof java.util.Collection) {
      return (java.util.Collection<GeospatialGeometry>) current;
    }
    return Arrays.asList((GeospatialGeometry) current);
  }
  /**
   * Represents a relationship between two geometries (or the places they represent), relating a covering geometry to a covered geometry. &quot;Every point of b is a point of (the interior or boundary of) a&quot;. As defined in [DE-9IM](https://en.wikipedia.org/wiki/DE-9IM).
   * @return geoCovers property set by first invocation of geoCovers method or {@code null}.
   */
  @JsonIgnore public Place getGeoCoversPlace() {
    return (Place) getValue("geoCovers");
  }
  /**
   * Represents a relationship between two geometries (or the places they represent), relating a covering geometry to a covered geometry. &quot;Every point of b is a point of (the interior or boundary of) a&quot;. As defined in [DE-9IM](https://en.wikipedia.org/wiki/DE-9IM).
   * @return all geoCovers properties as {@link java.util.Collection} or an empty collection 
   * if geoCovers was not set.
   */
  @JsonIgnore public java.util.Collection<Place> getGeoCoversPlaces() {
    final java.lang.Object current = myData.get("geoCovers");
    if (current == null) return Collections.emptyList();
    if (current instanceof java.util.Collection) {
      return (java.util.Collection<Place>) current;
    }
    return Arrays.asList((Place) current);
  }
  /**
   * The special opening hours of a certain place.\n\nUse this to explicitly override general opening hours brought in scope by [[openingHoursSpecification]] or [[openingHours]].
   * 
   * @return specialOpeningHoursSpecification property set by first invocation of specialOpeningHoursSpecification method or {@code null}.
   */
  @JsonIgnore public OpeningHoursSpecification getSpecialOpeningHoursSpecification() {
    return (OpeningHoursSpecification) getValue("specialOpeningHoursSpecification");
  }
  /**
   * The special opening hours of a certain place.\n\nUse this to explicitly override general opening hours brought in scope by [[openingHoursSpecification]] or [[openingHours]].
   * 
   * @return all specialOpeningHoursSpecification properties as {@link java.util.Collection} or an empty collection 
   * if specialOpeningHoursSpecification was not set.
   */
  @JsonIgnore public java.util.Collection<OpeningHoursSpecification> getSpecialOpeningHoursSpecifications() {
    final java.lang.Object current = myData.get("specialOpeningHoursSpecification");
    if (current == null) return Collections.emptyList();
    if (current instanceof java.util.Collection) {
      return (java.util.Collection<OpeningHoursSpecification>) current;
    }
    return Arrays.asList((OpeningHoursSpecification) current);
  }
  /**
   * The opening hours of a certain place.
   * @return openingHoursSpecification property set by first invocation of openingHoursSpecification method or {@code null}.
   */
  @JsonIgnore public OpeningHoursSpecification getOpeningHoursSpecification() {
    return (OpeningHoursSpecification) getValue("openingHoursSpecification");
  }
  /**
   * The opening hours of a certain place.
   * @return all openingHoursSpecification properties as {@link java.util.Collection} or an empty collection 
   * if openingHoursSpecification was not set.
   */
  @JsonIgnore public java.util.Collection<OpeningHoursSpecification> getOpeningHoursSpecifications() {
    final java.lang.Object current = myData.get("openingHoursSpecification");
    if (current == null) return Collections.emptyList();
    if (current instanceof java.util.Collection) {
      return (java.util.Collection<OpeningHoursSpecification>) current;
    }
    return Arrays.asList((OpeningHoursSpecification) current);
  }
  /**
   * A slogan or motto associated with the item.
   * @return slogan property set by first invocation of slogan method or {@code null}.
   */
  @JsonIgnore public String getSlogan() {
    return (String) getValue("slogan");
  }
  /**
   * A slogan or motto associated with the item.
   * @return all slogan properties as {@link java.util.Collection} or an empty collection 
   * if slogan was not set.
   */
  @JsonIgnore public java.util.Collection<String> getSlogans() {
    final java.lang.Object current = myData.get("slogan");
    if (current == null) return Collections.emptyList();
    if (current instanceof java.util.Collection) {
      return (java.util.Collection<String>) current;
    }
    return Arrays.asList((String) current);
  }
  /**
   * A short textual code (also called &quot;store code&quot;) that uniquely identifies a place of business. The code is typically assigned by the parentOrganization and used in structured URLs.\n\nFor example, in the URL http://www.starbucks.co.uk/store-locator/etc/detail/3047 the code &quot;3047&quot; is a branchCode for a particular branch.
   * 
   * @return branchCode property set by first invocation of branchCode method or {@code null}.
   */
  @JsonIgnore public String getBranchCode() {
    return (String) getValue("branchCode");
  }
  /**
   * A short textual code (also called &quot;store code&quot;) that uniquely identifies a place of business. The code is typically assigned by the parentOrganization and used in structured URLs.\n\nFor example, in the URL http://www.starbucks.co.uk/store-locator/etc/detail/3047 the code &quot;3047&quot; is a branchCode for a particular branch.
   * 
   * @return all branchCode properties as {@link java.util.Collection} or an empty collection 
   * if branchCode was not set.
   */
  @JsonIgnore public java.util.Collection<String> getBranchCodes() {
    final java.lang.Object current = myData.get("branchCode");
    if (current == null) return Collections.emptyList();
    if (current instanceof java.util.Collection) {
      return (java.util.Collection<String>) current;
    }
    return Arrays.asList((String) current);
  }
  /**
   * Represents a relationship between two geometries (or the places they represent), relating a containing geometry to a contained geometry. &quot;a contains b iff no points of b lie in the exterior of a, and at least one point of the interior of b lies in the interior of a&quot;. As defined in [DE-9IM](https://en.wikipedia.org/wiki/DE-9IM).
   * @return geoContains property set by first invocation of geoContains method or {@code null}.
   */
  @JsonIgnore public GeospatialGeometry getGeoContainsGeospatialGeometry() {
    return (GeospatialGeometry) getValue("geoContains");
  }
  /**
   * Represents a relationship between two geometries (or the places they represent), relating a containing geometry to a contained geometry. &quot;a contains b iff no points of b lie in the exterior of a, and at least one point of the interior of b lies in the interior of a&quot;. As defined in [DE-9IM](https://en.wikipedia.org/wiki/DE-9IM).
   * @return all geoContains properties as {@link java.util.Collection} or an empty collection 
   * if geoContains was not set.
   */
  @JsonIgnore public java.util.Collection<GeospatialGeometry> getGeoContainsGeospatialGeometrys() {
    final java.lang.Object current = myData.get("geoContains");
    if (current == null) return Collections.emptyList();
    if (current instanceof java.util.Collection) {
      return (java.util.Collection<GeospatialGeometry>) current;
    }
    return Arrays.asList((GeospatialGeometry) current);
  }
  /**
   * Represents a relationship between two geometries (or the places they represent), relating a containing geometry to a contained geometry. &quot;a contains b iff no points of b lie in the exterior of a, and at least one point of the interior of b lies in the interior of a&quot;. As defined in [DE-9IM](https://en.wikipedia.org/wiki/DE-9IM).
   * @return geoContains property set by first invocation of geoContains method or {@code null}.
   */
  @JsonIgnore public Place getGeoContainsPlace() {
    return (Place) getValue("geoContains");
  }
  /**
   * Represents a relationship between two geometries (or the places they represent), relating a containing geometry to a contained geometry. &quot;a contains b iff no points of b lie in the exterior of a, and at least one point of the interior of b lies in the interior of a&quot;. As defined in [DE-9IM](https://en.wikipedia.org/wiki/DE-9IM).
   * @return all geoContains properties as {@link java.util.Collection} or an empty collection 
   * if geoContains was not set.
   */
  @JsonIgnore public java.util.Collection<Place> getGeoContainsPlaces() {
    final java.lang.Object current = myData.get("geoContains");
    if (current == null) return Collections.emptyList();
    if (current instanceof java.util.Collection) {
      return (java.util.Collection<Place>) current;
    }
    return Arrays.asList((Place) current);
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
   * A flag to signal that the [[Place]] is open to public visitors.  If this property is omitted there is no assumed default boolean value
   * @return publicAccess property set by first invocation of publicAccess method or {@code null}.
   */
  @JsonIgnore public Boolean getPublicAccess() {
    return (Boolean) getValue("publicAccess");
  }
  /**
   * A flag to signal that the [[Place]] is open to public visitors.  If this property is omitted there is no assumed default boolean value
   * @return all publicAccess properties as {@link java.util.Collection} or an empty collection 
   * if publicAccess was not set.
   */
  @JsonIgnore public java.util.Collection<Boolean> getPublicAccesss() {
    final java.lang.Object current = myData.get("publicAccess");
    if (current == null) return Collections.emptyList();
    if (current instanceof java.util.Collection) {
      return (java.util.Collection<Boolean>) current;
    }
    return Arrays.asList((Boolean) current);
  }
  /**
   * The basic containment relation between a place and another that it contains.
   * @return containsPlace property set by first invocation of containsPlace method or {@code null}.
   */
  @JsonIgnore public Place getContainsPlace() {
    return (Place) getValue("containsPlace");
  }
  /**
   * The basic containment relation between a place and another that it contains.
   * @return all containsPlace properties as {@link java.util.Collection} or an empty collection 
   * if containsPlace was not set.
   */
  @JsonIgnore public java.util.Collection<Place> getContainsPlaces() {
    final java.lang.Object current = myData.get("containsPlace");
    if (current == null) return Collections.emptyList();
    if (current instanceof java.util.Collection) {
      return (java.util.Collection<Place>) current;
    }
    return Arrays.asList((Place) current);
  }
  protected Place(java.util.Map<String,java.lang.Object> data) {
    super(data);
  }
  /**
   * @return new {@link Builder} initialized with this instance's data
   */
  @NotNull public Builder toBuilder() {
    return new Builder(new HashMap<>(this.myData));
  }
  
  /**
   * Builder for {@link Place}
   */
  public static class Builder extends Thing.Builder {
    public Builder(@NotNull HashMap<String,java.lang.Object> data) {
      super(data);
    }
    @NotNull public Place build() {
      return new Place(myData);
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
