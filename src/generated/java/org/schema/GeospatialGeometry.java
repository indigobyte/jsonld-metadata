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
 * (Eventually to be defined as) a supertype of GeoShape designed to accommodate definitions from Geo-Spatial best practices.Source: https://github.com/schemaorg/schemaorg/issues/1375
 */
public class GeospatialGeometry extends Intangible {
  /**
   * Represents spatial relations in which two geometries (or the places they represent) are topologically disjoint: they have no point in common. They form a set of disconnected geometries.&quot; (a symmetric relationship, as defined in &lt;a href=&quot;https://en.wikipedia.org/wiki/DE-9IM&quot;&gt;DE-9IM&lt;/a&gt;)
   */
  @JsonIgnore public GeospatialGeometry getGeoDisjointGeospatialGeometry() {
    return (GeospatialGeometry) getValue("geoDisjoint");
  }
  /**
   * Represents spatial relations in which two geometries (or the places they represent) are topologically disjoint: they have no point in common. They form a set of disconnected geometries.&quot; (a symmetric relationship, as defined in &lt;a href=&quot;https://en.wikipedia.org/wiki/DE-9IM&quot;&gt;DE-9IM&lt;/a&gt;)
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
   * Represents spatial relations in which two geometries (or the places they represent) are topologically disjoint: they have no point in common. They form a set of disconnected geometries.&quot; (a symmetric relationship, as defined in &lt;a href=&quot;https://en.wikipedia.org/wiki/DE-9IM&quot;&gt;DE-9IM&lt;/a&gt;)
   */
  @JsonIgnore public Place getGeoDisjointPlace() {
    return (Place) getValue("geoDisjoint");
  }
  /**
   * Represents spatial relations in which two geometries (or the places they represent) are topologically disjoint: they have no point in common. They form a set of disconnected geometries.&quot; (a symmetric relationship, as defined in &lt;a href=&quot;https://en.wikipedia.org/wiki/DE-9IM&quot;&gt;DE-9IM&lt;/a&gt;)
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
   * Represents spatial relations in which two geometries (or the places they represent) are topologically equal, as defined in &lt;a href=&quot;https://en.wikipedia.org/wiki/DE-9IM&quot;&gt;DE-9IM&lt;/a&gt;. &quot;Two geometries are topologically equal if their interiors intersect and no part of the interior or boundary of one geometry intersects the exterior of the other&quot; (a symmetric relationship)
   */
  @JsonIgnore public GeospatialGeometry getGeoEqualsGeospatialGeometry() {
    return (GeospatialGeometry) getValue("geoEquals");
  }
  /**
   * Represents spatial relations in which two geometries (or the places they represent) are topologically equal, as defined in &lt;a href=&quot;https://en.wikipedia.org/wiki/DE-9IM&quot;&gt;DE-9IM&lt;/a&gt;. &quot;Two geometries are topologically equal if their interiors intersect and no part of the interior or boundary of one geometry intersects the exterior of the other&quot; (a symmetric relationship)
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
   * Represents spatial relations in which two geometries (or the places they represent) are topologically equal, as defined in &lt;a href=&quot;https://en.wikipedia.org/wiki/DE-9IM&quot;&gt;DE-9IM&lt;/a&gt;. &quot;Two geometries are topologically equal if their interiors intersect and no part of the interior or boundary of one geometry intersects the exterior of the other&quot; (a symmetric relationship)
   */
  @JsonIgnore public Place getGeoEqualsPlace() {
    return (Place) getValue("geoEquals");
  }
  /**
   * Represents spatial relations in which two geometries (or the places they represent) are topologically equal, as defined in &lt;a href=&quot;https://en.wikipedia.org/wiki/DE-9IM&quot;&gt;DE-9IM&lt;/a&gt;. &quot;Two geometries are topologically equal if their interiors intersect and no part of the interior or boundary of one geometry intersects the exterior of the other&quot; (a symmetric relationship)
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
   * Represents a relationship between two geometries (or the places they represent), relating a covering geometry to a covered geometry. &quot;Every point of b is a point of (the interior or boundary of) a&quot;. As defined in &lt;a href=&quot;https://en.wikipedia.org/wiki/DE-9IM&quot;&gt;DE-9IM&lt;/a&gt;.
   */
  @JsonIgnore public GeospatialGeometry getGeoCoversGeospatialGeometry() {
    return (GeospatialGeometry) getValue("geoCovers");
  }
  /**
   * Represents a relationship between two geometries (or the places they represent), relating a covering geometry to a covered geometry. &quot;Every point of b is a point of (the interior or boundary of) a&quot;. As defined in &lt;a href=&quot;https://en.wikipedia.org/wiki/DE-9IM&quot;&gt;DE-9IM&lt;/a&gt;.
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
   * Represents a relationship between two geometries (or the places they represent), relating a covering geometry to a covered geometry. &quot;Every point of b is a point of (the interior or boundary of) a&quot;. As defined in &lt;a href=&quot;https://en.wikipedia.org/wiki/DE-9IM&quot;&gt;DE-9IM&lt;/a&gt;.
   */
  @JsonIgnore public Place getGeoCoversPlace() {
    return (Place) getValue("geoCovers");
  }
  /**
   * Represents a relationship between two geometries (or the places they represent), relating a covering geometry to a covered geometry. &quot;Every point of b is a point of (the interior or boundary of) a&quot;. As defined in &lt;a href=&quot;https://en.wikipedia.org/wiki/DE-9IM&quot;&gt;DE-9IM&lt;/a&gt;.
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
   * Represents a relationship between two geometries (or the places they represent), relating a geometry to one that contains it, i.e. it is inside (i.e. within) its interior. As defined in &lt;a href=&quot;https://en.wikipedia.org/wiki/DE-9IM&quot;&gt;DE-9IM&lt;/a&gt;.
   */
  @JsonIgnore public GeospatialGeometry getGeoWithinGeospatialGeometry() {
    return (GeospatialGeometry) getValue("geoWithin");
  }
  /**
   * Represents a relationship between two geometries (or the places they represent), relating a geometry to one that contains it, i.e. it is inside (i.e. within) its interior. As defined in &lt;a href=&quot;https://en.wikipedia.org/wiki/DE-9IM&quot;&gt;DE-9IM&lt;/a&gt;.
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
   * Represents a relationship between two geometries (or the places they represent), relating a geometry to one that contains it, i.e. it is inside (i.e. within) its interior. As defined in &lt;a href=&quot;https://en.wikipedia.org/wiki/DE-9IM&quot;&gt;DE-9IM&lt;/a&gt;.
   */
  @JsonIgnore public Place getGeoWithinPlace() {
    return (Place) getValue("geoWithin");
  }
  /**
   * Represents a relationship between two geometries (or the places they represent), relating a geometry to one that contains it, i.e. it is inside (i.e. within) its interior. As defined in &lt;a href=&quot;https://en.wikipedia.org/wiki/DE-9IM&quot;&gt;DE-9IM&lt;/a&gt;.
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
   * Represents a relationship between two geometries (or the places they represent), relating a geometry to another that covers it. As defined in &lt;a href=&quot;https://en.wikipedia.org/wiki/DE-9IM&quot;&gt;DE-9IM&lt;/a&gt;.
   */
  @JsonIgnore public GeospatialGeometry getGeoCoveredByGeospatialGeometry() {
    return (GeospatialGeometry) getValue("geoCoveredBy");
  }
  /**
   * Represents a relationship between two geometries (or the places they represent), relating a geometry to another that covers it. As defined in &lt;a href=&quot;https://en.wikipedia.org/wiki/DE-9IM&quot;&gt;DE-9IM&lt;/a&gt;.
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
   * Represents a relationship between two geometries (or the places they represent), relating a geometry to another that covers it. As defined in &lt;a href=&quot;https://en.wikipedia.org/wiki/DE-9IM&quot;&gt;DE-9IM&lt;/a&gt;.
   */
  @JsonIgnore public Place getGeoCoveredByPlace() {
    return (Place) getValue("geoCoveredBy");
  }
  /**
   * Represents a relationship between two geometries (or the places they represent), relating a geometry to another that covers it. As defined in &lt;a href=&quot;https://en.wikipedia.org/wiki/DE-9IM&quot;&gt;DE-9IM&lt;/a&gt;.
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
   * Represents a relationship between two geometries (or the places they represent), relating a containing geometry to a contained geometry. &quot;a contains b iff no points of b lie in the exterior of a, and at least one point of the interior of b lies in the interior of a&quot;. As defined in &lt;a href=&quot;https://en.wikipedia.org/wiki/DE-9IM&quot;&gt;DE-9IM&lt;/a&gt;.
   */
  @JsonIgnore public GeospatialGeometry getGeoContainsGeospatialGeometry() {
    return (GeospatialGeometry) getValue("geoContains");
  }
  /**
   * Represents a relationship between two geometries (or the places they represent), relating a containing geometry to a contained geometry. &quot;a contains b iff no points of b lie in the exterior of a, and at least one point of the interior of b lies in the interior of a&quot;. As defined in &lt;a href=&quot;https://en.wikipedia.org/wiki/DE-9IM&quot;&gt;DE-9IM&lt;/a&gt;.
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
   * Represents a relationship between two geometries (or the places they represent), relating a containing geometry to a contained geometry. &quot;a contains b iff no points of b lie in the exterior of a, and at least one point of the interior of b lies in the interior of a&quot;. As defined in &lt;a href=&quot;https://en.wikipedia.org/wiki/DE-9IM&quot;&gt;DE-9IM&lt;/a&gt;.
   */
  @JsonIgnore public Place getGeoContainsPlace() {
    return (Place) getValue("geoContains");
  }
  /**
   * Represents a relationship between two geometries (or the places they represent), relating a containing geometry to a contained geometry. &quot;a contains b iff no points of b lie in the exterior of a, and at least one point of the interior of b lies in the interior of a&quot;. As defined in &lt;a href=&quot;https://en.wikipedia.org/wiki/DE-9IM&quot;&gt;DE-9IM&lt;/a&gt;.
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
   * Represents spatial relations in which two geometries (or the places they represent) have at least one point in common. As defined in &lt;a href=&quot;https://en.wikipedia.org/wiki/DE-9IM&quot;&gt;DE-9IM&lt;/a&gt;.
   */
  @JsonIgnore public GeospatialGeometry getGeoIntersectsGeospatialGeometry() {
    return (GeospatialGeometry) getValue("geoIntersects");
  }
  /**
   * Represents spatial relations in which two geometries (or the places they represent) have at least one point in common. As defined in &lt;a href=&quot;https://en.wikipedia.org/wiki/DE-9IM&quot;&gt;DE-9IM&lt;/a&gt;.
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
   * Represents spatial relations in which two geometries (or the places they represent) have at least one point in common. As defined in &lt;a href=&quot;https://en.wikipedia.org/wiki/DE-9IM&quot;&gt;DE-9IM&lt;/a&gt;.
   */
  @JsonIgnore public Place getGeoIntersectsPlace() {
    return (Place) getValue("geoIntersects");
  }
  /**
   * Represents spatial relations in which two geometries (or the places they represent) have at least one point in common. As defined in &lt;a href=&quot;https://en.wikipedia.org/wiki/DE-9IM&quot;&gt;DE-9IM&lt;/a&gt;.
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
   * Represents a relationship between two geometries (or the places they represent), relating a geometry to another that geospatially overlaps it, i.e. they have some but not all points in common. As defined in &lt;a href=&quot;https://en.wikipedia.org/wiki/DE-9IM&quot;&gt;DE-9IM&lt;/a&gt;.
   */
  @JsonIgnore public GeospatialGeometry getGeoOverlapsGeospatialGeometry() {
    return (GeospatialGeometry) getValue("geoOverlaps");
  }
  /**
   * Represents a relationship between two geometries (or the places they represent), relating a geometry to another that geospatially overlaps it, i.e. they have some but not all points in common. As defined in &lt;a href=&quot;https://en.wikipedia.org/wiki/DE-9IM&quot;&gt;DE-9IM&lt;/a&gt;.
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
   * Represents a relationship between two geometries (or the places they represent), relating a geometry to another that geospatially overlaps it, i.e. they have some but not all points in common. As defined in &lt;a href=&quot;https://en.wikipedia.org/wiki/DE-9IM&quot;&gt;DE-9IM&lt;/a&gt;.
   */
  @JsonIgnore public Place getGeoOverlapsPlace() {
    return (Place) getValue("geoOverlaps");
  }
  /**
   * Represents a relationship between two geometries (or the places they represent), relating a geometry to another that geospatially overlaps it, i.e. they have some but not all points in common. As defined in &lt;a href=&quot;https://en.wikipedia.org/wiki/DE-9IM&quot;&gt;DE-9IM&lt;/a&gt;.
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
   * Represents spatial relations in which two geometries (or the places they represent) touch: they have at least one boundary point in common, but no interior points.&quot; (a symmetric relationship, as defined in &lt;a href=&quot;https://en.wikipedia.org/wiki/DE-9IM&quot;&gt;DE-9IM&lt;/a&gt; )
   */
  @JsonIgnore public GeospatialGeometry getGeoTouchesGeospatialGeometry() {
    return (GeospatialGeometry) getValue("geoTouches");
  }
  /**
   * Represents spatial relations in which two geometries (or the places they represent) touch: they have at least one boundary point in common, but no interior points.&quot; (a symmetric relationship, as defined in &lt;a href=&quot;https://en.wikipedia.org/wiki/DE-9IM&quot;&gt;DE-9IM&lt;/a&gt; )
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
   * Represents spatial relations in which two geometries (or the places they represent) touch: they have at least one boundary point in common, but no interior points.&quot; (a symmetric relationship, as defined in &lt;a href=&quot;https://en.wikipedia.org/wiki/DE-9IM&quot;&gt;DE-9IM&lt;/a&gt; )
   */
  @JsonIgnore public Place getGeoTouchesPlace() {
    return (Place) getValue("geoTouches");
  }
  /**
   * Represents spatial relations in which two geometries (or the places they represent) touch: they have at least one boundary point in common, but no interior points.&quot; (a symmetric relationship, as defined in &lt;a href=&quot;https://en.wikipedia.org/wiki/DE-9IM&quot;&gt;DE-9IM&lt;/a&gt; )
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
   * Represents a relationship between two geometries (or the places they represent), relating a geometry to another that crosses it: &quot;a crosses b: they have some but not all interior points in common, and the dimension of the intersection is less than that of at least one of them&quot;. As defined in &lt;a href=&quot;https://en.wikipedia.org/wiki/DE-9IM&quot;&gt;DE-9IM&lt;/a&gt;.
   */
  @JsonIgnore public GeospatialGeometry getGeoCrossesGeospatialGeometry() {
    return (GeospatialGeometry) getValue("geoCrosses");
  }
  /**
   * Represents a relationship between two geometries (or the places they represent), relating a geometry to another that crosses it: &quot;a crosses b: they have some but not all interior points in common, and the dimension of the intersection is less than that of at least one of them&quot;. As defined in &lt;a href=&quot;https://en.wikipedia.org/wiki/DE-9IM&quot;&gt;DE-9IM&lt;/a&gt;.
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
   * Represents a relationship between two geometries (or the places they represent), relating a geometry to another that crosses it: &quot;a crosses b: they have some but not all interior points in common, and the dimension of the intersection is less than that of at least one of them&quot;. As defined in &lt;a href=&quot;https://en.wikipedia.org/wiki/DE-9IM&quot;&gt;DE-9IM&lt;/a&gt;.
   */
  @JsonIgnore public Place getGeoCrossesPlace() {
    return (Place) getValue("geoCrosses");
  }
  /**
   * Represents a relationship between two geometries (or the places they represent), relating a geometry to another that crosses it: &quot;a crosses b: they have some but not all interior points in common, and the dimension of the intersection is less than that of at least one of them&quot;. As defined in &lt;a href=&quot;https://en.wikipedia.org/wiki/DE-9IM&quot;&gt;DE-9IM&lt;/a&gt;.
   */
  @JsonIgnore public Collection<Place> getGeoCrossesPlaces() {
    final Object current = myData.get("geoCrosses");
    if (current == null) return Collections.emptyList();
    if (current instanceof Collection) {
      return (Collection<Place>) current;
    }
    return Arrays.asList((Place) current);
  }
  protected GeospatialGeometry(java.util.Map<String,Object> data) {
    super(data);
  }
  
  /**
   * Builder for {@link GeospatialGeometry}
   */
  public static class Builder extends Intangible.Builder {
    public Builder(@NotNull HashMap<String,Object> data) {
      super(data);
    }
    @NotNull public GeospatialGeometry build() {
      return new GeospatialGeometry(myData);
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
      if ("geoDisjoint".equals(key) && value instanceof GeospatialGeometry) { this.geoDisjoint((GeospatialGeometry)value); return; }
      if ("geoDisjoints".equals(key) && value instanceof GeospatialGeometry) { this.geoDisjoint((GeospatialGeometry)value); return; }
      if ("geoDisjoint".equals(key) && value instanceof Place) { this.geoDisjoint((Place)value); return; }
      if ("geoDisjoints".equals(key) && value instanceof Place) { this.geoDisjoint((Place)value); return; }
      if ("geoEquals".equals(key) && value instanceof GeospatialGeometry) { this.geoEquals((GeospatialGeometry)value); return; }
      if ("geoEqualss".equals(key) && value instanceof GeospatialGeometry) { this.geoEquals((GeospatialGeometry)value); return; }
      if ("geoEquals".equals(key) && value instanceof Place) { this.geoEquals((Place)value); return; }
      if ("geoEqualss".equals(key) && value instanceof Place) { this.geoEquals((Place)value); return; }
      if ("geoCovers".equals(key) && value instanceof GeospatialGeometry) { this.geoCovers((GeospatialGeometry)value); return; }
      if ("geoCoverss".equals(key) && value instanceof GeospatialGeometry) { this.geoCovers((GeospatialGeometry)value); return; }
      if ("geoCovers".equals(key) && value instanceof Place) { this.geoCovers((Place)value); return; }
      if ("geoCoverss".equals(key) && value instanceof Place) { this.geoCovers((Place)value); return; }
      if ("geoWithin".equals(key) && value instanceof GeospatialGeometry) { this.geoWithin((GeospatialGeometry)value); return; }
      if ("geoWithins".equals(key) && value instanceof GeospatialGeometry) { this.geoWithin((GeospatialGeometry)value); return; }
      if ("geoWithin".equals(key) && value instanceof Place) { this.geoWithin((Place)value); return; }
      if ("geoWithins".equals(key) && value instanceof Place) { this.geoWithin((Place)value); return; }
      if ("geoCoveredBy".equals(key) && value instanceof GeospatialGeometry) { this.geoCoveredBy((GeospatialGeometry)value); return; }
      if ("geoCoveredBys".equals(key) && value instanceof GeospatialGeometry) { this.geoCoveredBy((GeospatialGeometry)value); return; }
      if ("geoCoveredBy".equals(key) && value instanceof Place) { this.geoCoveredBy((Place)value); return; }
      if ("geoCoveredBys".equals(key) && value instanceof Place) { this.geoCoveredBy((Place)value); return; }
      if ("geoContains".equals(key) && value instanceof GeospatialGeometry) { this.geoContains((GeospatialGeometry)value); return; }
      if ("geoContainss".equals(key) && value instanceof GeospatialGeometry) { this.geoContains((GeospatialGeometry)value); return; }
      if ("geoContains".equals(key) && value instanceof Place) { this.geoContains((Place)value); return; }
      if ("geoContainss".equals(key) && value instanceof Place) { this.geoContains((Place)value); return; }
      if ("geoIntersects".equals(key) && value instanceof GeospatialGeometry) { this.geoIntersects((GeospatialGeometry)value); return; }
      if ("geoIntersectss".equals(key) && value instanceof GeospatialGeometry) { this.geoIntersects((GeospatialGeometry)value); return; }
      if ("geoIntersects".equals(key) && value instanceof Place) { this.geoIntersects((Place)value); return; }
      if ("geoIntersectss".equals(key) && value instanceof Place) { this.geoIntersects((Place)value); return; }
      if ("geoOverlaps".equals(key) && value instanceof GeospatialGeometry) { this.geoOverlaps((GeospatialGeometry)value); return; }
      if ("geoOverlapss".equals(key) && value instanceof GeospatialGeometry) { this.geoOverlaps((GeospatialGeometry)value); return; }
      if ("geoOverlaps".equals(key) && value instanceof Place) { this.geoOverlaps((Place)value); return; }
      if ("geoOverlapss".equals(key) && value instanceof Place) { this.geoOverlaps((Place)value); return; }
      if ("geoTouches".equals(key) && value instanceof GeospatialGeometry) { this.geoTouches((GeospatialGeometry)value); return; }
      if ("geoTouchess".equals(key) && value instanceof GeospatialGeometry) { this.geoTouches((GeospatialGeometry)value); return; }
      if ("geoTouches".equals(key) && value instanceof Place) { this.geoTouches((Place)value); return; }
      if ("geoTouchess".equals(key) && value instanceof Place) { this.geoTouches((Place)value); return; }
      if ("geoCrosses".equals(key) && value instanceof GeospatialGeometry) { this.geoCrosses((GeospatialGeometry)value); return; }
      if ("geoCrossess".equals(key) && value instanceof GeospatialGeometry) { this.geoCrosses((GeospatialGeometry)value); return; }
      if ("geoCrosses".equals(key) && value instanceof Place) { this.geoCrosses((Place)value); return; }
      if ("geoCrossess".equals(key) && value instanceof Place) { this.geoCrosses((Place)value); return; }
      super.fromMap(key, value);
    }
  }
  
}
