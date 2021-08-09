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
 * (Eventually to be defined as) a supertype of GeoShape designed to accommodate definitions from Geo-Spatial best practices.
 */
public class GeospatialGeometry extends Intangible {
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
  protected GeospatialGeometry(java.util.Map<String,java.lang.Object> data) {
    super(data);
  }
  /**
   * @return new {@link Builder} initialized with this instance's data
   */
  @NotNull public Builder toBuilder() {
    return new Builder(new HashMap<>(this.myData));
  }
  
  /**
   * Builder for {@link GeospatialGeometry}
   */
  public static class Builder extends Intangible.Builder {
    public Builder(@NotNull HashMap<String,java.lang.Object> data) {
      super(data);
    }
    @NotNull public GeospatialGeometry build() {
      return new GeospatialGeometry(myData);
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
      if ("geoDisjoint".equals(key) && value instanceof GeospatialGeometry) { this.geoDisjoint((GeospatialGeometry)value); return; }
      if ("geoDisjoints".equals(key) && value instanceof GeospatialGeometry) { this.geoDisjoint((GeospatialGeometry)value); return; }
      if ("geoDisjoint".equals(key) && value instanceof Place) { this.geoDisjoint((Place)value); return; }
      if ("geoDisjoints".equals(key) && value instanceof Place) { this.geoDisjoint((Place)value); return; }
      if ("geoTouches".equals(key) && value instanceof GeospatialGeometry) { this.geoTouches((GeospatialGeometry)value); return; }
      if ("geoTouchess".equals(key) && value instanceof GeospatialGeometry) { this.geoTouches((GeospatialGeometry)value); return; }
      if ("geoTouches".equals(key) && value instanceof Place) { this.geoTouches((Place)value); return; }
      if ("geoTouchess".equals(key) && value instanceof Place) { this.geoTouches((Place)value); return; }
      if ("geoIntersects".equals(key) && value instanceof GeospatialGeometry) { this.geoIntersects((GeospatialGeometry)value); return; }
      if ("geoIntersectss".equals(key) && value instanceof GeospatialGeometry) { this.geoIntersects((GeospatialGeometry)value); return; }
      if ("geoIntersects".equals(key) && value instanceof Place) { this.geoIntersects((Place)value); return; }
      if ("geoIntersectss".equals(key) && value instanceof Place) { this.geoIntersects((Place)value); return; }
      if ("geoCrosses".equals(key) && value instanceof GeospatialGeometry) { this.geoCrosses((GeospatialGeometry)value); return; }
      if ("geoCrossess".equals(key) && value instanceof GeospatialGeometry) { this.geoCrosses((GeospatialGeometry)value); return; }
      if ("geoCrosses".equals(key) && value instanceof Place) { this.geoCrosses((Place)value); return; }
      if ("geoCrossess".equals(key) && value instanceof Place) { this.geoCrosses((Place)value); return; }
      if ("geoCoveredBy".equals(key) && value instanceof GeospatialGeometry) { this.geoCoveredBy((GeospatialGeometry)value); return; }
      if ("geoCoveredBys".equals(key) && value instanceof GeospatialGeometry) { this.geoCoveredBy((GeospatialGeometry)value); return; }
      if ("geoCoveredBy".equals(key) && value instanceof Place) { this.geoCoveredBy((Place)value); return; }
      if ("geoCoveredBys".equals(key) && value instanceof Place) { this.geoCoveredBy((Place)value); return; }
      if ("geoEquals".equals(key) && value instanceof GeospatialGeometry) { this.geoEquals((GeospatialGeometry)value); return; }
      if ("geoEqualss".equals(key) && value instanceof GeospatialGeometry) { this.geoEquals((GeospatialGeometry)value); return; }
      if ("geoEquals".equals(key) && value instanceof Place) { this.geoEquals((Place)value); return; }
      if ("geoEqualss".equals(key) && value instanceof Place) { this.geoEquals((Place)value); return; }
      if ("geoOverlaps".equals(key) && value instanceof GeospatialGeometry) { this.geoOverlaps((GeospatialGeometry)value); return; }
      if ("geoOverlapss".equals(key) && value instanceof GeospatialGeometry) { this.geoOverlaps((GeospatialGeometry)value); return; }
      if ("geoOverlaps".equals(key) && value instanceof Place) { this.geoOverlaps((Place)value); return; }
      if ("geoOverlapss".equals(key) && value instanceof Place) { this.geoOverlaps((Place)value); return; }
      if ("geoCovers".equals(key) && value instanceof GeospatialGeometry) { this.geoCovers((GeospatialGeometry)value); return; }
      if ("geoCoverss".equals(key) && value instanceof GeospatialGeometry) { this.geoCovers((GeospatialGeometry)value); return; }
      if ("geoCovers".equals(key) && value instanceof Place) { this.geoCovers((Place)value); return; }
      if ("geoCoverss".equals(key) && value instanceof Place) { this.geoCovers((Place)value); return; }
      if ("geoContains".equals(key) && value instanceof GeospatialGeometry) { this.geoContains((GeospatialGeometry)value); return; }
      if ("geoContainss".equals(key) && value instanceof GeospatialGeometry) { this.geoContains((GeospatialGeometry)value); return; }
      if ("geoContains".equals(key) && value instanceof Place) { this.geoContains((Place)value); return; }
      if ("geoContainss".equals(key) && value instanceof Place) { this.geoContains((Place)value); return; }
      super.fromMap(key, value);
    }
  }
  
}
