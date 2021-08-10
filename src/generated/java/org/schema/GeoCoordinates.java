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
 * The geographic coordinates of a place or event.
 */
public class GeoCoordinates extends StructuredValue {
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
   * The elevation of a location ([WGS 84](https://en.wikipedia.org/wiki/World_Geodetic_System)). Values may be of the form 'NUMBER UNIT_OF_MEASUREMENT' (e.g., '1,000 m', '3,200 ft') while numbers alone should be assumed to be a value in meters.
   * @return elevation property set by first invocation of elevation method or {@code null}.
   */
  @JsonIgnore public Integer getElevationInteger() {
    return (Integer) getValue("elevation");
  }
  /**
   * The elevation of a location ([WGS 84](https://en.wikipedia.org/wiki/World_Geodetic_System)). Values may be of the form 'NUMBER UNIT_OF_MEASUREMENT' (e.g., '1,000 m', '3,200 ft') while numbers alone should be assumed to be a value in meters.
   * @return all elevation properties as {@link java.util.Collection} or an empty collection 
   * if elevation was not set.
   */
  @JsonIgnore public java.util.Collection<Integer> getElevationIntegers() {
    final java.lang.Object current = myData.get("elevation");
    if (current == null) return Collections.emptyList();
    if (current instanceof java.util.Collection) {
      return (java.util.Collection<Integer>) current;
    }
    return Arrays.asList((Integer) current);
  }
  /**
   * The elevation of a location ([WGS 84](https://en.wikipedia.org/wiki/World_Geodetic_System)). Values may be of the form 'NUMBER UNIT_OF_MEASUREMENT' (e.g., '1,000 m', '3,200 ft') while numbers alone should be assumed to be a value in meters.
   * @return elevation property set by first invocation of elevation method or {@code null}.
   */
  @JsonIgnore public Long getElevationLong() {
    return (Long) getValue("elevation");
  }
  /**
   * The elevation of a location ([WGS 84](https://en.wikipedia.org/wiki/World_Geodetic_System)). Values may be of the form 'NUMBER UNIT_OF_MEASUREMENT' (e.g., '1,000 m', '3,200 ft') while numbers alone should be assumed to be a value in meters.
   * @return all elevation properties as {@link java.util.Collection} or an empty collection 
   * if elevation was not set.
   */
  @JsonIgnore public java.util.Collection<Long> getElevationLongs() {
    final java.lang.Object current = myData.get("elevation");
    if (current == null) return Collections.emptyList();
    if (current instanceof java.util.Collection) {
      return (java.util.Collection<Long>) current;
    }
    return Arrays.asList((Long) current);
  }
  /**
   * The elevation of a location ([WGS 84](https://en.wikipedia.org/wiki/World_Geodetic_System)). Values may be of the form 'NUMBER UNIT_OF_MEASUREMENT' (e.g., '1,000 m', '3,200 ft') while numbers alone should be assumed to be a value in meters.
   * @return elevation property set by first invocation of elevation method or {@code null}.
   */
  @JsonIgnore public Float getElevationFloat() {
    return (Float) getValue("elevation");
  }
  /**
   * The elevation of a location ([WGS 84](https://en.wikipedia.org/wiki/World_Geodetic_System)). Values may be of the form 'NUMBER UNIT_OF_MEASUREMENT' (e.g., '1,000 m', '3,200 ft') while numbers alone should be assumed to be a value in meters.
   * @return all elevation properties as {@link java.util.Collection} or an empty collection 
   * if elevation was not set.
   */
  @JsonIgnore public java.util.Collection<Float> getElevationFloats() {
    final java.lang.Object current = myData.get("elevation");
    if (current == null) return Collections.emptyList();
    if (current instanceof java.util.Collection) {
      return (java.util.Collection<Float>) current;
    }
    return Arrays.asList((Float) current);
  }
  /**
   * The elevation of a location ([WGS 84](https://en.wikipedia.org/wiki/World_Geodetic_System)). Values may be of the form 'NUMBER UNIT_OF_MEASUREMENT' (e.g., '1,000 m', '3,200 ft') while numbers alone should be assumed to be a value in meters.
   * @return elevation property set by first invocation of elevation method or {@code null}.
   */
  @JsonIgnore public Double getElevationDouble() {
    return (Double) getValue("elevation");
  }
  /**
   * The elevation of a location ([WGS 84](https://en.wikipedia.org/wiki/World_Geodetic_System)). Values may be of the form 'NUMBER UNIT_OF_MEASUREMENT' (e.g., '1,000 m', '3,200 ft') while numbers alone should be assumed to be a value in meters.
   * @return all elevation properties as {@link java.util.Collection} or an empty collection 
   * if elevation was not set.
   */
  @JsonIgnore public java.util.Collection<Double> getElevationDoubles() {
    final java.lang.Object current = myData.get("elevation");
    if (current == null) return Collections.emptyList();
    if (current instanceof java.util.Collection) {
      return (java.util.Collection<Double>) current;
    }
    return Arrays.asList((Double) current);
  }
  /**
   * The elevation of a location ([WGS 84](https://en.wikipedia.org/wiki/World_Geodetic_System)). Values may be of the form 'NUMBER UNIT_OF_MEASUREMENT' (e.g., '1,000 m', '3,200 ft') while numbers alone should be assumed to be a value in meters.
   * @return elevation property set by first invocation of elevation method or {@code null}.
   */
  @JsonIgnore public String getElevationString() {
    return (String) getValue("elevation");
  }
  /**
   * The elevation of a location ([WGS 84](https://en.wikipedia.org/wiki/World_Geodetic_System)). Values may be of the form 'NUMBER UNIT_OF_MEASUREMENT' (e.g., '1,000 m', '3,200 ft') while numbers alone should be assumed to be a value in meters.
   * @return all elevation properties as {@link java.util.Collection} or an empty collection 
   * if elevation was not set.
   */
  @JsonIgnore public java.util.Collection<String> getElevationStrings() {
    final java.lang.Object current = myData.get("elevation");
    if (current == null) return Collections.emptyList();
    if (current instanceof java.util.Collection) {
      return (java.util.Collection<String>) current;
    }
    return Arrays.asList((String) current);
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
   * The postal code. For example, 94043.
   * @return postalCode property set by first invocation of postalCode method or {@code null}.
   */
  @JsonIgnore public String getPostalCode() {
    return (String) getValue("postalCode");
  }
  /**
   * The postal code. For example, 94043.
   * @return all postalCode properties as {@link java.util.Collection} or an empty collection 
   * if postalCode was not set.
   */
  @JsonIgnore public java.util.Collection<String> getPostalCodes() {
    final java.lang.Object current = myData.get("postalCode");
    if (current == null) return Collections.emptyList();
    if (current instanceof java.util.Collection) {
      return (java.util.Collection<String>) current;
    }
    return Arrays.asList((String) current);
  }
  /**
   * The country. For example, USA. You can also provide the two-letter [ISO 3166-1 alpha-2 country code](http://en.wikipedia.org/wiki/ISO_3166-1).
   * @return addressCountry property set by first invocation of addressCountry method or {@code null}.
   */
  @JsonIgnore public Country getAddressCountryCountry() {
    return (Country) getValue("addressCountry");
  }
  /**
   * The country. For example, USA. You can also provide the two-letter [ISO 3166-1 alpha-2 country code](http://en.wikipedia.org/wiki/ISO_3166-1).
   * @return all addressCountry properties as {@link java.util.Collection} or an empty collection 
   * if addressCountry was not set.
   */
  @JsonIgnore public java.util.Collection<Country> getAddressCountryCountrys() {
    final java.lang.Object current = myData.get("addressCountry");
    if (current == null) return Collections.emptyList();
    if (current instanceof java.util.Collection) {
      return (java.util.Collection<Country>) current;
    }
    return Arrays.asList((Country) current);
  }
  /**
   * The country. For example, USA. You can also provide the two-letter [ISO 3166-1 alpha-2 country code](http://en.wikipedia.org/wiki/ISO_3166-1).
   * @return addressCountry property set by first invocation of addressCountry method or {@code null}.
   */
  @JsonIgnore public String getAddressCountryString() {
    return (String) getValue("addressCountry");
  }
  /**
   * The country. For example, USA. You can also provide the two-letter [ISO 3166-1 alpha-2 country code](http://en.wikipedia.org/wiki/ISO_3166-1).
   * @return all addressCountry properties as {@link java.util.Collection} or an empty collection 
   * if addressCountry was not set.
   */
  @JsonIgnore public java.util.Collection<String> getAddressCountryStrings() {
    final java.lang.Object current = myData.get("addressCountry");
    if (current == null) return Collections.emptyList();
    if (current instanceof java.util.Collection) {
      return (java.util.Collection<String>) current;
    }
    return Arrays.asList((String) current);
  }
  protected GeoCoordinates(java.util.Map<String,java.lang.Object> data) {
    super(data);
  }
  /**
   * @return new {@link Builder} initialized with this instance's data
   */
  @NotNull public Builder toBuilder() {
    return new Builder(new HashMap<>(this.myData));
  }
  
  /**
   * Builder for {@link GeoCoordinates}
   */
  public static class Builder extends StructuredValue.Builder {
    public Builder(@NotNull HashMap<String,java.lang.Object> data) {
      super(data);
    }
    @NotNull public GeoCoordinates build() {
      return new GeoCoordinates(myData);
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
      if ("elevation".equals(key) && value instanceof Integer) { this.elevation((Integer)value); return; }
      if ("elevations".equals(key) && value instanceof Integer) { this.elevation((Integer)value); return; }
      if ("elevation".equals(key) && value instanceof Long) { this.elevation((Long)value); return; }
      if ("elevations".equals(key) && value instanceof Long) { this.elevation((Long)value); return; }
      if ("elevation".equals(key) && value instanceof Float) { this.elevation((Float)value); return; }
      if ("elevations".equals(key) && value instanceof Float) { this.elevation((Float)value); return; }
      if ("elevation".equals(key) && value instanceof Double) { this.elevation((Double)value); return; }
      if ("elevations".equals(key) && value instanceof Double) { this.elevation((Double)value); return; }
      if ("elevation".equals(key) && value instanceof String) { this.elevation((String)value); return; }
      if ("elevations".equals(key) && value instanceof String) { this.elevation((String)value); return; }
      if ("address".equals(key) && value instanceof PostalAddress) { this.address((PostalAddress)value); return; }
      if ("addresss".equals(key) && value instanceof PostalAddress) { this.address((PostalAddress)value); return; }
      if ("address".equals(key) && value instanceof String) { this.address((String)value); return; }
      if ("addresss".equals(key) && value instanceof String) { this.address((String)value); return; }
      if ("latitude".equals(key) && value instanceof Number) { this.latitude((Number)value); return; }
      if ("latitudes".equals(key) && value instanceof Number) { this.latitude((Number)value); return; }
      if ("latitude".equals(key) && value instanceof String) { this.latitude((String)value); return; }
      if ("latitudes".equals(key) && value instanceof String) { this.latitude((String)value); return; }
      if ("postalCode".equals(key) && value instanceof String) { this.postalCode((String)value); return; }
      if ("postalCodes".equals(key) && value instanceof String) { this.postalCode((String)value); return; }
      if ("addressCountry".equals(key) && value instanceof Country) { this.addressCountry((Country)value); return; }
      if ("addressCountrys".equals(key) && value instanceof Country) { this.addressCountry((Country)value); return; }
      if ("addressCountry".equals(key) && value instanceof String) { this.addressCountry((String)value); return; }
      if ("addressCountrys".equals(key) && value instanceof String) { this.addressCountry((String)value); return; }
      super.fromMap(key, value);
    }
  }
  
}
