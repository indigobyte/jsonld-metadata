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
 * The geographic coordinates of a place or event.
 */
public class GeoCoordinates extends StructuredValue {
  /**
   * The latitude of a location. For example &lt;code&gt;37.42242&lt;/code&gt; (&lt;a href=&quot;https://en.wikipedia.org/wiki/World_Geodetic_System&quot;&gt;WGS 84&lt;/a&gt;).
   */
  @JsonIgnore public Number getLatitudeNumber() {
    return (Number) getValue("latitude");
  }
  /**
   * The latitude of a location. For example &lt;code&gt;37.42242&lt;/code&gt; (&lt;a href=&quot;https://en.wikipedia.org/wiki/World_Geodetic_System&quot;&gt;WGS 84&lt;/a&gt;).
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
   * The latitude of a location. For example &lt;code&gt;37.42242&lt;/code&gt; (&lt;a href=&quot;https://en.wikipedia.org/wiki/World_Geodetic_System&quot;&gt;WGS 84&lt;/a&gt;).
   */
  @JsonIgnore public String getLatitudeString() {
    return (String) getValue("latitude");
  }
  /**
   * The latitude of a location. For example &lt;code&gt;37.42242&lt;/code&gt; (&lt;a href=&quot;https://en.wikipedia.org/wiki/World_Geodetic_System&quot;&gt;WGS 84&lt;/a&gt;).
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
   * The country. For example, USA. You can also provide the two-letter &lt;a href=&quot;http://en.wikipedia.org/wiki/ISO_3166-1&quot;&gt;ISO 3166-1 alpha-2 country code&lt;/a&gt;.
   */
  @JsonIgnore public Country getAddressCountryCountry() {
    return (Country) getValue("addressCountry");
  }
  /**
   * The country. For example, USA. You can also provide the two-letter &lt;a href=&quot;http://en.wikipedia.org/wiki/ISO_3166-1&quot;&gt;ISO 3166-1 alpha-2 country code&lt;/a&gt;.
   */
  @JsonIgnore public Collection<Country> getAddressCountryCountrys() {
    final Object current = myData.get("addressCountry");
    if (current == null) return Collections.emptyList();
    if (current instanceof Collection) {
      return (Collection<Country>) current;
    }
    return Arrays.asList((Country) current);
  }
  /**
   * The country. For example, USA. You can also provide the two-letter &lt;a href=&quot;http://en.wikipedia.org/wiki/ISO_3166-1&quot;&gt;ISO 3166-1 alpha-2 country code&lt;/a&gt;.
   */
  @JsonIgnore public String getAddressCountryString() {
    return (String) getValue("addressCountry");
  }
  /**
   * The country. For example, USA. You can also provide the two-letter &lt;a href=&quot;http://en.wikipedia.org/wiki/ISO_3166-1&quot;&gt;ISO 3166-1 alpha-2 country code&lt;/a&gt;.
   */
  @JsonIgnore public Collection<String> getAddressCountryStrings() {
    final Object current = myData.get("addressCountry");
    if (current == null) return Collections.emptyList();
    if (current instanceof Collection) {
      return (Collection<String>) current;
    }
    return Arrays.asList((String) current);
  }
  /**
   * The postal code. For example, 94043.
   */
  @JsonIgnore public String getPostalCode() {
    return (String) getValue("postalCode");
  }
  /**
   * The postal code. For example, 94043.
   */
  @JsonIgnore public Collection<String> getPostalCodes() {
    final Object current = myData.get("postalCode");
    if (current == null) return Collections.emptyList();
    if (current instanceof Collection) {
      return (Collection<String>) current;
    }
    return Arrays.asList((String) current);
  }
  /**
   * The longitude of a location. For example &lt;code&gt;-122.08585&lt;/code&gt; (&lt;a href=&quot;https://en.wikipedia.org/wiki/World_Geodetic_System&quot;&gt;WGS 84&lt;/a&gt;).
   */
  @JsonIgnore public Number getLongitudeNumber() {
    return (Number) getValue("longitude");
  }
  /**
   * The longitude of a location. For example &lt;code&gt;-122.08585&lt;/code&gt; (&lt;a href=&quot;https://en.wikipedia.org/wiki/World_Geodetic_System&quot;&gt;WGS 84&lt;/a&gt;).
   */
  @JsonIgnore public Collection<Number> getLongitudeNumbers() {
    final Object current = myData.get("longitude");
    if (current == null) return Collections.emptyList();
    if (current instanceof Collection) {
      return (Collection<Number>) current;
    }
    return Arrays.asList((Number) current);
  }
  /**
   * The longitude of a location. For example &lt;code&gt;-122.08585&lt;/code&gt; (&lt;a href=&quot;https://en.wikipedia.org/wiki/World_Geodetic_System&quot;&gt;WGS 84&lt;/a&gt;).
   */
  @JsonIgnore public String getLongitudeString() {
    return (String) getValue("longitude");
  }
  /**
   * The longitude of a location. For example &lt;code&gt;-122.08585&lt;/code&gt; (&lt;a href=&quot;https://en.wikipedia.org/wiki/World_Geodetic_System&quot;&gt;WGS 84&lt;/a&gt;).
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
   * The elevation of a location (&lt;a href=&quot;https://en.wikipedia.org/wiki/World_Geodetic_System&quot;&gt;WGS 84&lt;/a&gt;). Values may be of the form 'NUMBER UNIT&lt;em&gt;OF&lt;/em&gt;MEASUREMENT' (e.g., '1,000 m', '3,200 ft') while numbers alone should be assumed to be a value in meters.
   */
  @JsonIgnore public Number getElevationNumber() {
    return (Number) getValue("elevation");
  }
  /**
   * The elevation of a location (&lt;a href=&quot;https://en.wikipedia.org/wiki/World_Geodetic_System&quot;&gt;WGS 84&lt;/a&gt;). Values may be of the form 'NUMBER UNIT&lt;em&gt;OF&lt;/em&gt;MEASUREMENT' (e.g., '1,000 m', '3,200 ft') while numbers alone should be assumed to be a value in meters.
   */
  @JsonIgnore public Collection<Number> getElevationNumbers() {
    final Object current = myData.get("elevation");
    if (current == null) return Collections.emptyList();
    if (current instanceof Collection) {
      return (Collection<Number>) current;
    }
    return Arrays.asList((Number) current);
  }
  /**
   * The elevation of a location (&lt;a href=&quot;https://en.wikipedia.org/wiki/World_Geodetic_System&quot;&gt;WGS 84&lt;/a&gt;). Values may be of the form 'NUMBER UNIT&lt;em&gt;OF&lt;/em&gt;MEASUREMENT' (e.g., '1,000 m', '3,200 ft') while numbers alone should be assumed to be a value in meters.
   */
  @JsonIgnore public String getElevationString() {
    return (String) getValue("elevation");
  }
  /**
   * The elevation of a location (&lt;a href=&quot;https://en.wikipedia.org/wiki/World_Geodetic_System&quot;&gt;WGS 84&lt;/a&gt;). Values may be of the form 'NUMBER UNIT&lt;em&gt;OF&lt;/em&gt;MEASUREMENT' (e.g., '1,000 m', '3,200 ft') while numbers alone should be assumed to be a value in meters.
   */
  @JsonIgnore public Collection<String> getElevationStrings() {
    final Object current = myData.get("elevation");
    if (current == null) return Collections.emptyList();
    if (current instanceof Collection) {
      return (Collection<String>) current;
    }
    return Arrays.asList((String) current);
  }
  protected GeoCoordinates(java.util.Map<String,Object> data) {
    super(data);
  }
  
  /**
   * Builder for {@link GeoCoordinates}
   */
  public static class Builder extends StructuredValue.Builder {
    public Builder(@NotNull HashMap<String,Object> data) {
      super(data);
    }
    @NotNull public GeoCoordinates build() {
      return new GeoCoordinates(myData);
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
     * The country. For example, USA. You can also provide the two-letter &lt;a href=&quot;http://en.wikipedia.org/wiki/ISO_3166-1&quot;&gt;ISO 3166-1 alpha-2 country code&lt;/a&gt;.
     */
    @NotNull public Builder addressCountry(@NotNull Country country) {
      putValue("addressCountry", country);
      return this;
    }
    /**
     * The country. For example, USA. You can also provide the two-letter &lt;a href=&quot;http://en.wikipedia.org/wiki/ISO_3166-1&quot;&gt;ISO 3166-1 alpha-2 country code&lt;/a&gt;.
     */
    @NotNull public Builder addressCountry(@NotNull Country.Builder country) {
      putValue("addressCountry", country.build());
      return this;
    }
    /**
     * The country. For example, USA. You can also provide the two-letter &lt;a href=&quot;http://en.wikipedia.org/wiki/ISO_3166-1&quot;&gt;ISO 3166-1 alpha-2 country code&lt;/a&gt;.
     */
    @NotNull public Builder addressCountry(@NotNull String addressCountry) {
      putValue("addressCountry", addressCountry);
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
     * The elevation of a location (&lt;a href=&quot;https://en.wikipedia.org/wiki/World_Geodetic_System&quot;&gt;WGS 84&lt;/a&gt;). Values may be of the form 'NUMBER UNIT&lt;em&gt;OF&lt;/em&gt;MEASUREMENT' (e.g., '1,000 m', '3,200 ft') while numbers alone should be assumed to be a value in meters.
     */
    @NotNull public Builder elevation(@NotNull Number number) {
      putValue("elevation", number);
      return this;
    }
    /**
     * The elevation of a location (&lt;a href=&quot;https://en.wikipedia.org/wiki/World_Geodetic_System&quot;&gt;WGS 84&lt;/a&gt;). Values may be of the form 'NUMBER UNIT&lt;em&gt;OF&lt;/em&gt;MEASUREMENT' (e.g., '1,000 m', '3,200 ft') while numbers alone should be assumed to be a value in meters.
     */
    @NotNull public Builder elevation(@NotNull String elevation) {
      putValue("elevation", elevation);
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
      if ("latitude".equals(key) && value instanceof Number) { this.latitude((Number)value); return; }
      if ("latitudes".equals(key) && value instanceof Number) { this.latitude((Number)value); return; }
      if ("latitude".equals(key) && value instanceof String) { this.latitude((String)value); return; }
      if ("latitudes".equals(key) && value instanceof String) { this.latitude((String)value); return; }
      if ("address".equals(key) && value instanceof PostalAddress) { this.address((PostalAddress)value); return; }
      if ("addresss".equals(key) && value instanceof PostalAddress) { this.address((PostalAddress)value); return; }
      if ("address".equals(key) && value instanceof String) { this.address((String)value); return; }
      if ("addresss".equals(key) && value instanceof String) { this.address((String)value); return; }
      if ("addressCountry".equals(key) && value instanceof Country) { this.addressCountry((Country)value); return; }
      if ("addressCountrys".equals(key) && value instanceof Country) { this.addressCountry((Country)value); return; }
      if ("addressCountry".equals(key) && value instanceof String) { this.addressCountry((String)value); return; }
      if ("addressCountrys".equals(key) && value instanceof String) { this.addressCountry((String)value); return; }
      if ("postalCode".equals(key) && value instanceof String) { this.postalCode((String)value); return; }
      if ("postalCodes".equals(key) && value instanceof String) { this.postalCode((String)value); return; }
      if ("longitude".equals(key) && value instanceof Number) { this.longitude((Number)value); return; }
      if ("longitudes".equals(key) && value instanceof Number) { this.longitude((Number)value); return; }
      if ("longitude".equals(key) && value instanceof String) { this.longitude((String)value); return; }
      if ("longitudes".equals(key) && value instanceof String) { this.longitude((String)value); return; }
      if ("elevation".equals(key) && value instanceof Number) { this.elevation((Number)value); return; }
      if ("elevations".equals(key) && value instanceof Number) { this.elevation((Number)value); return; }
      if ("elevation".equals(key) && value instanceof String) { this.elevation((String)value); return; }
      if ("elevations".equals(key) && value instanceof String) { this.elevation((String)value); return; }
      super.fromMap(key, value);
    }
  }
  
}
