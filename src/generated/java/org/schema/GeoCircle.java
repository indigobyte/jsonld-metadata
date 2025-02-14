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
 * A GeoCircle is a GeoShape representing a circular geographic area. As it is a GeoShape
 *           it provides the simple textual property 'circle', but also allows the combination of postalCode alongside geoRadius.
 *           The center of the circle can be indicated via the 'geoMidpoint' property, or more approximately using 'address', 'postalCode'.
 *        
 */
public class GeoCircle extends GeoShape {
  /**
   * Indicates the approximate radius of a GeoCircle (metres unless indicated otherwise via Distance notation).
   * @return geoRadius property set by first invocation of geoRadius method or {@code null}.
   */
  @JsonIgnore public Integer getGeoRadiusInteger() {
    return (Integer) getValue("geoRadius");
  }
  /**
   * Indicates the approximate radius of a GeoCircle (metres unless indicated otherwise via Distance notation).
   * @return all geoRadius properties as {@link java.util.Collection} or an empty collection 
   * if geoRadius was not set.
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
   * @return geoRadius property set by first invocation of geoRadius method or {@code null}.
   */
  @JsonIgnore public Long getGeoRadiusLong() {
    return (Long) getValue("geoRadius");
  }
  /**
   * Indicates the approximate radius of a GeoCircle (metres unless indicated otherwise via Distance notation).
   * @return all geoRadius properties as {@link java.util.Collection} or an empty collection 
   * if geoRadius was not set.
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
   * @return geoRadius property set by first invocation of geoRadius method or {@code null}.
   */
  @JsonIgnore public Float getGeoRadiusFloat() {
    return (Float) getValue("geoRadius");
  }
  /**
   * Indicates the approximate radius of a GeoCircle (metres unless indicated otherwise via Distance notation).
   * @return all geoRadius properties as {@link java.util.Collection} or an empty collection 
   * if geoRadius was not set.
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
   * @return geoRadius property set by first invocation of geoRadius method or {@code null}.
   */
  @JsonIgnore public Double getGeoRadiusDouble() {
    return (Double) getValue("geoRadius");
  }
  /**
   * Indicates the approximate radius of a GeoCircle (metres unless indicated otherwise via Distance notation).
   * @return all geoRadius properties as {@link java.util.Collection} or an empty collection 
   * if geoRadius was not set.
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
   * @return geoRadius property set by first invocation of geoRadius method or {@code null}.
   */
  @JsonIgnore public String getGeoRadiusString() {
    return (String) getValue("geoRadius");
  }
  /**
   * Indicates the approximate radius of a GeoCircle (metres unless indicated otherwise via Distance notation).
   * @return all geoRadius properties as {@link java.util.Collection} or an empty collection 
   * if geoRadius was not set.
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
   * @return geoMidpoint property set by first invocation of geoMidpoint method or {@code null}.
   */
  @JsonIgnore public GeoCoordinates getGeoMidpoint() {
    return (GeoCoordinates) getValue("geoMidpoint");
  }
  /**
   * Indicates the GeoCoordinates at the centre of a GeoShape e.g. GeoCircle.
   * @return all geoMidpoint properties as {@link java.util.Collection} or an empty collection 
   * if geoMidpoint was not set.
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
   * @return new {@link Builder} initialized with this instance's data
   */
  @NotNull public Builder toBuilder() {
    return new Builder(new HashMap<>(this.myData));
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
     * @param integer value to set
     * @return this builder instance
     */
    @NotNull public Builder geoRadius(@NotNull Integer integer) {
      putValue("geoRadius", integer);
      return this;
    }
    /**
     * Indicates the approximate radius of a GeoCircle (metres unless indicated otherwise via Distance notation).
     * @param geoRadius value to set
     * @return this builder instance
     */
    @NotNull public Builder geoRadius(@NotNull Long geoRadius) {
      putValue("geoRadius", geoRadius);
      return this;
    }
    /**
     * Indicates the approximate radius of a GeoCircle (metres unless indicated otherwise via Distance notation).
     * @param geoRadius value to set
     * @return this builder instance
     */
    @NotNull public Builder geoRadius(@NotNull Float geoRadius) {
      putValue("geoRadius", geoRadius);
      return this;
    }
    /**
     * Indicates the approximate radius of a GeoCircle (metres unless indicated otherwise via Distance notation).
     * @param geoRadius value to set
     * @return this builder instance
     */
    @NotNull public Builder geoRadius(@NotNull Double geoRadius) {
      putValue("geoRadius", geoRadius);
      return this;
    }
    /**
     * Indicates the approximate radius of a GeoCircle (metres unless indicated otherwise via Distance notation).
     * @param geoRadius value to set
     * @return this builder instance
     */
    @NotNull public Builder geoRadius(@NotNull String geoRadius) {
      putValue("geoRadius", geoRadius);
      return this;
    }
    /**
     * Remove geoRadius property from the builder.
     * If this property is repeatable, all instances are removed.
     * @return this builder instance
     */
    @NotNull public Builder removeGeoRadius() {
      removeValue("geoRadius");
      return this;
    }
    /**
     * Get currently set value for geoRadius property in this builder.
     * @return previously set value or {@code null}. If multiple values have been 
     * set to this property, then {@link java.util.Collection} instance will be 
     * returned.
     */
    @Nullable public java.lang.Object getGeoRadius() {
      return myData.get("geoRadius");
    }
    /**
     * Indicates the GeoCoordinates at the centre of a GeoShape e.g. GeoCircle.
     * @param geoCoordinates value to set
     * @return this builder instance
     */
    @NotNull public Builder geoMidpoint(@NotNull GeoCoordinates geoCoordinates) {
      putValue("geoMidpoint", geoCoordinates);
      return this;
    }
    /**
     * Indicates the GeoCoordinates at the centre of a GeoShape e.g. GeoCircle.
     * @param geoCoordinates value to set
     * @return this builder instance
     */
    @NotNull public Builder geoMidpoint(@NotNull GeoCoordinates.Builder geoCoordinates) {
      putValue("geoMidpoint", geoCoordinates.build());
      return this;
    }
    /**
     * Remove geoMidpoint property from the builder.
     * If this property is repeatable, all instances are removed.
     * @return this builder instance
     */
    @NotNull public Builder removeGeoMidpoint() {
      removeValue("geoMidpoint");
      return this;
    }
    /**
     * Get currently set value for geoMidpoint property in this builder.
     * @return previously set value or {@code null}. If multiple values have been 
     * set to this property, then {@link java.util.Collection} instance will be 
     * returned.
     */
    @Nullable public java.lang.Object getGeoMidpoint() {
      return myData.get("geoMidpoint");
    }
    /**
     * The elevation of a location ([WGS 84](https://en.wikipedia.org/wiki/World_Geodetic_System)). Values may be of the form 'NUMBER UNIT_OF_MEASUREMENT' (e.g., '1,000 m', '3,200 ft') while numbers alone should be assumed to be a value in meters.
     * @param integer value to set
     * @return this builder instance
     */
    @NotNull public Builder elevation(@NotNull Integer integer) {
      putValue("elevation", integer);
      return this;
    }
    /**
     * The elevation of a location ([WGS 84](https://en.wikipedia.org/wiki/World_Geodetic_System)). Values may be of the form 'NUMBER UNIT_OF_MEASUREMENT' (e.g., '1,000 m', '3,200 ft') while numbers alone should be assumed to be a value in meters.
     * @param elevation value to set
     * @return this builder instance
     */
    @NotNull public Builder elevation(@NotNull Long elevation) {
      putValue("elevation", elevation);
      return this;
    }
    /**
     * The elevation of a location ([WGS 84](https://en.wikipedia.org/wiki/World_Geodetic_System)). Values may be of the form 'NUMBER UNIT_OF_MEASUREMENT' (e.g., '1,000 m', '3,200 ft') while numbers alone should be assumed to be a value in meters.
     * @param elevation value to set
     * @return this builder instance
     */
    @NotNull public Builder elevation(@NotNull Float elevation) {
      putValue("elevation", elevation);
      return this;
    }
    /**
     * The elevation of a location ([WGS 84](https://en.wikipedia.org/wiki/World_Geodetic_System)). Values may be of the form 'NUMBER UNIT_OF_MEASUREMENT' (e.g., '1,000 m', '3,200 ft') while numbers alone should be assumed to be a value in meters.
     * @param elevation value to set
     * @return this builder instance
     */
    @NotNull public Builder elevation(@NotNull Double elevation) {
      putValue("elevation", elevation);
      return this;
    }
    /**
     * The elevation of a location ([WGS 84](https://en.wikipedia.org/wiki/World_Geodetic_System)). Values may be of the form 'NUMBER UNIT_OF_MEASUREMENT' (e.g., '1,000 m', '3,200 ft') while numbers alone should be assumed to be a value in meters.
     * @param elevation value to set
     * @return this builder instance
     */
    @NotNull public Builder elevation(@NotNull String elevation) {
      putValue("elevation", elevation);
      return this;
    }
    /**
     * Remove elevation property from the builder.
     * If this property is repeatable, all instances are removed.
     * @return this builder instance
     */
    @NotNull public Builder removeElevation() {
      removeValue("elevation");
      return this;
    }
    /**
     * Get currently set value for elevation property in this builder.
     * @return previously set value or {@code null}. If multiple values have been 
     * set to this property, then {@link java.util.Collection} instance will be 
     * returned.
     */
    @Nullable public java.lang.Object getElevation() {
      return myData.get("elevation");
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
     * A line is a point-to-point path consisting of two or more points. A line is expressed as a series of two or more point objects separated by space.
     * @param line value to set
     * @return this builder instance
     */
    @NotNull public Builder line(@NotNull String line) {
      putValue("line", line);
      return this;
    }
    /**
     * Remove line property from the builder.
     * If this property is repeatable, all instances are removed.
     * @return this builder instance
     */
    @NotNull public Builder removeLine() {
      removeValue("line");
      return this;
    }
    /**
     * Get currently set value for line property in this builder.
     * @return previously set value or {@code null}. If multiple values have been 
     * set to this property, then {@link java.util.Collection} instance will be 
     * returned.
     */
    @Nullable public java.lang.Object getLine() {
      return myData.get("line");
    }
    /**
     * The postal code. For example, 94043.
     * @param postalCode value to set
     * @return this builder instance
     */
    @NotNull public Builder postalCode(@NotNull String postalCode) {
      putValue("postalCode", postalCode);
      return this;
    }
    /**
     * Remove postalCode property from the builder.
     * If this property is repeatable, all instances are removed.
     * @return this builder instance
     */
    @NotNull public Builder removePostalCode() {
      removeValue("postalCode");
      return this;
    }
    /**
     * Get currently set value for postalCode property in this builder.
     * @return previously set value or {@code null}. If multiple values have been 
     * set to this property, then {@link java.util.Collection} instance will be 
     * returned.
     */
    @Nullable public java.lang.Object getPostalCode() {
      return myData.get("postalCode");
    }
    /**
     * A polygon is the area enclosed by a point-to-point path for which the starting and ending points are the same. A polygon is expressed as a series of four or more space delimited points where the first and final points are identical.
     * @param polygon value to set
     * @return this builder instance
     */
    @NotNull public Builder polygon(@NotNull String polygon) {
      putValue("polygon", polygon);
      return this;
    }
    /**
     * Remove polygon property from the builder.
     * If this property is repeatable, all instances are removed.
     * @return this builder instance
     */
    @NotNull public Builder removePolygon() {
      removeValue("polygon");
      return this;
    }
    /**
     * Get currently set value for polygon property in this builder.
     * @return previously set value or {@code null}. If multiple values have been 
     * set to this property, then {@link java.util.Collection} instance will be 
     * returned.
     */
    @Nullable public java.lang.Object getPolygon() {
      return myData.get("polygon");
    }
    /**
     * The country. For example, USA. You can also provide the two-letter [ISO 3166-1 alpha-2 country code](http://en.wikipedia.org/wiki/ISO_3166-1).
     * @param country value to set
     * @return this builder instance
     */
    @NotNull public Builder addressCountry(@NotNull Country country) {
      putValue("addressCountry", country);
      return this;
    }
    /**
     * The country. For example, USA. You can also provide the two-letter [ISO 3166-1 alpha-2 country code](http://en.wikipedia.org/wiki/ISO_3166-1).
     * @param country value to set
     * @return this builder instance
     */
    @NotNull public Builder addressCountry(@NotNull Country.Builder country) {
      putValue("addressCountry", country.build());
      return this;
    }
    /**
     * The country. For example, USA. You can also provide the two-letter [ISO 3166-1 alpha-2 country code](http://en.wikipedia.org/wiki/ISO_3166-1).
     * @param addressCountry value to set
     * @return this builder instance
     */
    @NotNull public Builder addressCountry(@NotNull String addressCountry) {
      putValue("addressCountry", addressCountry);
      return this;
    }
    /**
     * Remove addressCountry property from the builder.
     * If this property is repeatable, all instances are removed.
     * @return this builder instance
     */
    @NotNull public Builder removeAddressCountry() {
      removeValue("addressCountry");
      return this;
    }
    /**
     * Get currently set value for addressCountry property in this builder.
     * @return previously set value or {@code null}. If multiple values have been 
     * set to this property, then {@link java.util.Collection} instance will be 
     * returned.
     */
    @Nullable public java.lang.Object getAddressCountry() {
      return myData.get("addressCountry");
    }
    /**
     * A box is the area enclosed by the rectangle formed by two points. The first point is the lower corner, the second point is the upper corner. A box is expressed as two points separated by a space character.
     * @param box value to set
     * @return this builder instance
     */
    @NotNull public Builder box(@NotNull String box) {
      putValue("box", box);
      return this;
    }
    /**
     * Remove box property from the builder.
     * If this property is repeatable, all instances are removed.
     * @return this builder instance
     */
    @NotNull public Builder removeBox() {
      removeValue("box");
      return this;
    }
    /**
     * Get currently set value for box property in this builder.
     * @return previously set value or {@code null}. If multiple values have been 
     * set to this property, then {@link java.util.Collection} instance will be 
     * returned.
     */
    @Nullable public java.lang.Object getBox() {
      return myData.get("box");
    }
    /**
     * A circle is the circular region of a specified radius centered at a specified latitude and longitude. A circle is expressed as a pair followed by a radius in meters.
     * @param circle value to set
     * @return this builder instance
     */
    @NotNull public Builder circle(@NotNull String circle) {
      putValue("circle", circle);
      return this;
    }
    /**
     * Remove circle property from the builder.
     * If this property is repeatable, all instances are removed.
     * @return this builder instance
     */
    @NotNull public Builder removeCircle() {
      removeValue("circle");
      return this;
    }
    /**
     * Get currently set value for circle property in this builder.
     * @return previously set value or {@code null}. If multiple values have been 
     * set to this property, then {@link java.util.Collection} instance will be 
     * returned.
     */
    @Nullable public java.lang.Object getCircle() {
      return myData.get("circle");
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
