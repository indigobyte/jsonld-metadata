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
 * A GeoCircle is a GeoShape representing a circular geographic area. As it is a GeoShape
 *           it provides the simple textual property 'circle', but also allows the combination of postalCode alongside geoRadius.
 *           The center of the circle can be indicated via the 'geoMidpoint' property, or more approximately using 'address', 'postalCode'.
 *        
 */
public class GeoCircle extends GeoShape {
  /**
   * Indicates the approximate radius of a GeoCircle (metres unless indicated otherwise via Distance notation).
   */
  @JsonIgnore public Integer getGeoRadiusInteger() {
    return (Integer) getValue("geoRadius");
  }
  /**
   * Indicates the approximate radius of a GeoCircle (metres unless indicated otherwise via Distance notation).
   */
  @JsonIgnore public java.util.Collection<Integer> getGeoRadiusIntegers() {
    final java.lang.Object current = myData.get("geoRadius");
    if (current == null) return Collections.emptyList();
    if (current instanceof java.util.Collection) {
      return (java.util.Collection<Integer>) current;
    }
    return Arrays.asList((Integer) current);
  }
  /**
   * Indicates the approximate radius of a GeoCircle (metres unless indicated otherwise via Distance notation).
   */
  @JsonIgnore public Long getGeoRadiusLong() {
    return (Long) getValue("geoRadius");
  }
  /**
   * Indicates the approximate radius of a GeoCircle (metres unless indicated otherwise via Distance notation).
   */
  @JsonIgnore public java.util.Collection<Long> getGeoRadiusLongs() {
    final java.lang.Object current = myData.get("geoRadius");
    if (current == null) return Collections.emptyList();
    if (current instanceof java.util.Collection) {
      return (java.util.Collection<Long>) current;
    }
    return Arrays.asList((Long) current);
  }
  /**
   * Indicates the approximate radius of a GeoCircle (metres unless indicated otherwise via Distance notation).
   */
  @JsonIgnore public Float getGeoRadiusFloat() {
    return (Float) getValue("geoRadius");
  }
  /**
   * Indicates the approximate radius of a GeoCircle (metres unless indicated otherwise via Distance notation).
   */
  @JsonIgnore public java.util.Collection<Float> getGeoRadiusFloats() {
    final java.lang.Object current = myData.get("geoRadius");
    if (current == null) return Collections.emptyList();
    if (current instanceof java.util.Collection) {
      return (java.util.Collection<Float>) current;
    }
    return Arrays.asList((Float) current);
  }
  /**
   * Indicates the approximate radius of a GeoCircle (metres unless indicated otherwise via Distance notation).
   */
  @JsonIgnore public Double getGeoRadiusDouble() {
    return (Double) getValue("geoRadius");
  }
  /**
   * Indicates the approximate radius of a GeoCircle (metres unless indicated otherwise via Distance notation).
   */
  @JsonIgnore public java.util.Collection<Double> getGeoRadiusDoubles() {
    final java.lang.Object current = myData.get("geoRadius");
    if (current == null) return Collections.emptyList();
    if (current instanceof java.util.Collection) {
      return (java.util.Collection<Double>) current;
    }
    return Arrays.asList((Double) current);
  }
  /**
   * Indicates the approximate radius of a GeoCircle (metres unless indicated otherwise via Distance notation).
   */
  @JsonIgnore public String getGeoRadiusString() {
    return (String) getValue("geoRadius");
  }
  /**
   * Indicates the approximate radius of a GeoCircle (metres unless indicated otherwise via Distance notation).
   */
  @JsonIgnore public java.util.Collection<String> getGeoRadiusStrings() {
    final java.lang.Object current = myData.get("geoRadius");
    if (current == null) return Collections.emptyList();
    if (current instanceof java.util.Collection) {
      return (java.util.Collection<String>) current;
    }
    return Arrays.asList((String) current);
  }
  /**
   * Indicates the GeoCoordinates at the centre of a GeoShape e.g. GeoCircle.
   */
  @JsonIgnore public GeoCoordinates getGeoMidpoint() {
    return (GeoCoordinates) getValue("geoMidpoint");
  }
  /**
   * Indicates the GeoCoordinates at the centre of a GeoShape e.g. GeoCircle.
   */
  @JsonIgnore public java.util.Collection<GeoCoordinates> getGeoMidpoints() {
    final java.lang.Object current = myData.get("geoMidpoint");
    if (current == null) return Collections.emptyList();
    if (current instanceof java.util.Collection) {
      return (java.util.Collection<GeoCoordinates>) current;
    }
    return Arrays.asList((GeoCoordinates) current);
  }
  protected GeoCircle(java.util.Map<String,java.lang.Object> data) {
    super(data);
  }
  
  /**
   * Builder for {@link GeoCircle}
   */
  public static class Builder extends GeoShape.Builder {
    public Builder(@NotNull HashMap<String,java.lang.Object> data) {
      super(data);
    }
    @NotNull public GeoCircle build() {
      return new GeoCircle(myData);
    }
    /**
     * Indicates the approximate radius of a GeoCircle (metres unless indicated otherwise via Distance notation).
     */
    @NotNull public Builder geoRadius(@NotNull Integer integer) {
      putValue("geoRadius", integer);
      return this;
    }
    /**
     * Indicates the approximate radius of a GeoCircle (metres unless indicated otherwise via Distance notation).
     */
    @NotNull public Builder geoRadius(@NotNull Long geoRadius) {
      putValue("geoRadius", geoRadius);
      return this;
    }
    /**
     * Indicates the approximate radius of a GeoCircle (metres unless indicated otherwise via Distance notation).
     */
    @NotNull public Builder geoRadius(@NotNull Float geoRadius) {
      putValue("geoRadius", geoRadius);
      return this;
    }
    /**
     * Indicates the approximate radius of a GeoCircle (metres unless indicated otherwise via Distance notation).
     */
    @NotNull public Builder geoRadius(@NotNull Double geoRadius) {
      putValue("geoRadius", geoRadius);
      return this;
    }
    /**
     * Indicates the approximate radius of a GeoCircle (metres unless indicated otherwise via Distance notation).
     */
    @NotNull public Builder geoRadius(@NotNull String geoRadius) {
      putValue("geoRadius", geoRadius);
      return this;
    }
    /**
     * Indicates the GeoCoordinates at the centre of a GeoShape e.g. GeoCircle.
     */
    @NotNull public Builder geoMidpoint(@NotNull GeoCoordinates geoCoordinates) {
      putValue("geoMidpoint", geoCoordinates);
      return this;
    }
    /**
     * Indicates the GeoCoordinates at the centre of a GeoShape e.g. GeoCircle.
     */
    @NotNull public Builder geoMidpoint(@NotNull GeoCoordinates.Builder geoCoordinates) {
      putValue("geoMidpoint", geoCoordinates.build());
      return this;
    }
    /**
     * The elevation of a location ([WGS 84](https://en.wikipedia.org/wiki/World_Geodetic_System)). Values may be of the form 'NUMBER UNIT_OF_MEASUREMENT' (e.g., '1,000 m', '3,200 ft') while numbers alone should be assumed to be a value in meters.
     */
    @NotNull public Builder elevation(@NotNull Integer integer) {
      putValue("elevation", integer);
      return this;
    }
    /**
     * The elevation of a location ([WGS 84](https://en.wikipedia.org/wiki/World_Geodetic_System)). Values may be of the form 'NUMBER UNIT_OF_MEASUREMENT' (e.g., '1,000 m', '3,200 ft') while numbers alone should be assumed to be a value in meters.
     */
    @NotNull public Builder elevation(@NotNull Long elevation) {
      putValue("elevation", elevation);
      return this;
    }
    /**
     * The elevation of a location ([WGS 84](https://en.wikipedia.org/wiki/World_Geodetic_System)). Values may be of the form 'NUMBER UNIT_OF_MEASUREMENT' (e.g., '1,000 m', '3,200 ft') while numbers alone should be assumed to be a value in meters.
     */
    @NotNull public Builder elevation(@NotNull Float elevation) {
      putValue("elevation", elevation);
      return this;
    }
    /**
     * The elevation of a location ([WGS 84](https://en.wikipedia.org/wiki/World_Geodetic_System)). Values may be of the form 'NUMBER UNIT_OF_MEASUREMENT' (e.g., '1,000 m', '3,200 ft') while numbers alone should be assumed to be a value in meters.
     */
    @NotNull public Builder elevation(@NotNull Double elevation) {
      putValue("elevation", elevation);
      return this;
    }
    /**
     * The elevation of a location ([WGS 84](https://en.wikipedia.org/wiki/World_Geodetic_System)). Values may be of the form 'NUMBER UNIT_OF_MEASUREMENT' (e.g., '1,000 m', '3,200 ft') while numbers alone should be assumed to be a value in meters.
     */
    @NotNull public Builder elevation(@NotNull String elevation) {
      putValue("elevation", elevation);
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
     * A line is a point-to-point path consisting of two or more points. A line is expressed as a series of two or more point objects separated by space.
     */
    @NotNull public Builder line(@NotNull String line) {
      putValue("line", line);
      return this;
    }
    /**
     * The postal code. For example, 94043.
     */
    @NotNull public Builder postalCode(@NotNull String postalCode) {
      putValue("postalCode", postalCode);
      return this;
    }
    /**
     * A polygon is the area enclosed by a point-to-point path for which the starting and ending points are the same. A polygon is expressed as a series of four or more space delimited points where the first and final points are identical.
     */
    @NotNull public Builder polygon(@NotNull String polygon) {
      putValue("polygon", polygon);
      return this;
    }
    /**
     * The country. For example, USA. You can also provide the two-letter [ISO 3166-1 alpha-2 country code](http://en.wikipedia.org/wiki/ISO_3166-1).
     */
    @NotNull public Builder addressCountry(@NotNull Country country) {
      putValue("addressCountry", country);
      return this;
    }
    /**
     * The country. For example, USA. You can also provide the two-letter [ISO 3166-1 alpha-2 country code](http://en.wikipedia.org/wiki/ISO_3166-1).
     */
    @NotNull public Builder addressCountry(@NotNull Country.Builder country) {
      putValue("addressCountry", country.build());
      return this;
    }
    /**
     * The country. For example, USA. You can also provide the two-letter [ISO 3166-1 alpha-2 country code](http://en.wikipedia.org/wiki/ISO_3166-1).
     */
    @NotNull public Builder addressCountry(@NotNull String addressCountry) {
      putValue("addressCountry", addressCountry);
      return this;
    }
    /**
     * A box is the area enclosed by the rectangle formed by two points. The first point is the lower corner, the second point is the upper corner. A box is expressed as two points separated by a space character.
     */
    @NotNull public Builder box(@NotNull String box) {
      putValue("box", box);
      return this;
    }
    /**
     * A circle is the circular region of a specified radius centered at a specified latitude and longitude. A circle is expressed as a pair followed by a radius in meters.
     */
    @NotNull public Builder circle(@NotNull String circle) {
      putValue("circle", circle);
      return this;
    }
    /**
     * The identifier property represents any kind of identifier for any kind of [[Thing]], such as ISBNs, GTIN codes, UUIDs etc. Schema.org provides dedicated properties for representing many of these, either as textual strings or as URL (URI) links. See [background notes](/docs/datamodel.html#identifierBg) for more details.
     *         
     */
    @NotNull public Builder identifier(@NotNull Identifier identifier) {
      putValue("identifier", identifier);
      return this;
    }
    /**
     * An image of the item. This can be a [[URL]] or a fully described [[ImageObject]].
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
    @Override protected void fromMap(String key, java.lang.Object value) {
      if ("geoRadius".equals(key) && value instanceof Integer) { this.geoRadius((Integer)value); return; }
      if ("geoRadiuss".equals(key) && value instanceof Integer) { this.geoRadius((Integer)value); return; }
      if ("geoRadius".equals(key) && value instanceof Long) { this.geoRadius((Long)value); return; }
      if ("geoRadiuss".equals(key) && value instanceof Long) { this.geoRadius((Long)value); return; }
      if ("geoRadius".equals(key) && value instanceof Float) { this.geoRadius((Float)value); return; }
      if ("geoRadiuss".equals(key) && value instanceof Float) { this.geoRadius((Float)value); return; }
      if ("geoRadius".equals(key) && value instanceof Double) { this.geoRadius((Double)value); return; }
      if ("geoRadiuss".equals(key) && value instanceof Double) { this.geoRadius((Double)value); return; }
      if ("geoRadius".equals(key) && value instanceof String) { this.geoRadius((String)value); return; }
      if ("geoRadiuss".equals(key) && value instanceof String) { this.geoRadius((String)value); return; }
      if ("geoMidpoint".equals(key) && value instanceof GeoCoordinates) { this.geoMidpoint((GeoCoordinates)value); return; }
      if ("geoMidpoints".equals(key) && value instanceof GeoCoordinates) { this.geoMidpoint((GeoCoordinates)value); return; }
      super.fromMap(key, value);
    }
  }
  
}
