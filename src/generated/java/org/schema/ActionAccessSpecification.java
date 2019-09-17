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
 * A set of requirements that a must be fulfilled in order to perform an Action.Source: https://github.com/schemaorg/schemaorg/issues/1741
 */
public class ActionAccessSpecification extends Intangible {
  /**
   * The beginning of the availability of the product or service included in the offer.
   */
  @JsonIgnore public java.util.Date getAvailabilityStarts() {
    return (java.util.Date) getValue("availabilityStarts");
  }
  /**
   * The beginning of the availability of the product or service included in the offer.
   */
  @JsonIgnore public Collection<java.util.Date> getAvailabilityStartss() {
    final Object current = myData.get("availabilityStarts");
    if (current == null) return Collections.emptyList();
    if (current instanceof Collection) {
      return (Collection<java.util.Date>) current;
    }
    return Arrays.asList((java.util.Date) current);
  }
  /**
   * The end of the availability of the product or service included in the offer.
   */
  @JsonIgnore public java.util.Date getAvailabilityEnds() {
    return (java.util.Date) getValue("availabilityEnds");
  }
  /**
   * The end of the availability of the product or service included in the offer.
   */
  @JsonIgnore public Collection<java.util.Date> getAvailabilityEndss() {
    final Object current = myData.get("availabilityEnds");
    if (current == null) return Collections.emptyList();
    if (current instanceof Collection) {
      return (Collection<java.util.Date>) current;
    }
    return Arrays.asList((java.util.Date) current);
  }
  /**
   * A category for the item. Greater signs or slashes can be used to informally indicate a category hierarchy.
   */
  @JsonIgnore public String getCategoryString() {
    return (String) getValue("category");
  }
  /**
   * A category for the item. Greater signs or slashes can be used to informally indicate a category hierarchy.
   */
  @JsonIgnore public Collection<String> getCategoryStrings() {
    final Object current = myData.get("category");
    if (current == null) return Collections.emptyList();
    if (current instanceof Collection) {
      return (Collection<String>) current;
    }
    return Arrays.asList((String) current);
  }
  /**
   * A category for the item. Greater signs or slashes can be used to informally indicate a category hierarchy.
   */
  @JsonIgnore public Thing getCategoryThing() {
    return (Thing) getValue("category");
  }
  /**
   * A category for the item. Greater signs or slashes can be used to informally indicate a category hierarchy.
   */
  @JsonIgnore public Collection<Thing> getCategoryThings() {
    final Object current = myData.get("category");
    if (current == null) return Collections.emptyList();
    if (current instanceof Collection) {
      return (Collection<Thing>) current;
    }
    return Arrays.asList((Thing) current);
  }
  /**
   * The ISO 3166-1 (ISO 3166-1 alpha-2) or ISO 3166-2 code, the place, or the GeoShape for the geo-political region(s) for which the offer or delivery charge specification is valid.\n\nSee also [[ineligibleRegion]].
   *     
   */
  @JsonIgnore public GeoShape getEligibleRegionGeoShape() {
    return (GeoShape) getValue("eligibleRegion");
  }
  /**
   * The ISO 3166-1 (ISO 3166-1 alpha-2) or ISO 3166-2 code, the place, or the GeoShape for the geo-political region(s) for which the offer or delivery charge specification is valid.\n\nSee also [[ineligibleRegion]].
   *     
   */
  @JsonIgnore public Collection<GeoShape> getEligibleRegionGeoShapes() {
    final Object current = myData.get("eligibleRegion");
    if (current == null) return Collections.emptyList();
    if (current instanceof Collection) {
      return (Collection<GeoShape>) current;
    }
    return Arrays.asList((GeoShape) current);
  }
  /**
   * The ISO 3166-1 (ISO 3166-1 alpha-2) or ISO 3166-2 code, the place, or the GeoShape for the geo-political region(s) for which the offer or delivery charge specification is valid.\n\nSee also [[ineligibleRegion]].
   *     
   */
  @JsonIgnore public Place getEligibleRegionPlace() {
    return (Place) getValue("eligibleRegion");
  }
  /**
   * The ISO 3166-1 (ISO 3166-1 alpha-2) or ISO 3166-2 code, the place, or the GeoShape for the geo-political region(s) for which the offer or delivery charge specification is valid.\n\nSee also [[ineligibleRegion]].
   *     
   */
  @JsonIgnore public Collection<Place> getEligibleRegionPlaces() {
    final Object current = myData.get("eligibleRegion");
    if (current == null) return Collections.emptyList();
    if (current instanceof Collection) {
      return (Collection<Place>) current;
    }
    return Arrays.asList((Place) current);
  }
  /**
   * The ISO 3166-1 (ISO 3166-1 alpha-2) or ISO 3166-2 code, the place, or the GeoShape for the geo-political region(s) for which the offer or delivery charge specification is valid.\n\nSee also [[ineligibleRegion]].
   *     
   */
  @JsonIgnore public String getEligibleRegionString() {
    return (String) getValue("eligibleRegion");
  }
  /**
   * The ISO 3166-1 (ISO 3166-1 alpha-2) or ISO 3166-2 code, the place, or the GeoShape for the geo-political region(s) for which the offer or delivery charge specification is valid.\n\nSee also [[ineligibleRegion]].
   *     
   */
  @JsonIgnore public Collection<String> getEligibleRegionStrings() {
    final Object current = myData.get("eligibleRegion");
    if (current == null) return Collections.emptyList();
    if (current instanceof Collection) {
      return (Collection<String>) current;
    }
    return Arrays.asList((String) current);
  }
  /**
   * An Offer which must be accepted before the user can perform the Action. For example, the user may need to buy a movie before being able to watch it.
   */
  @JsonIgnore public Offer getExpectsAcceptanceOf() {
    return (Offer) getValue("expectsAcceptanceOf");
  }
  /**
   * An Offer which must be accepted before the user can perform the Action. For example, the user may need to buy a movie before being able to watch it.
   */
  @JsonIgnore public Collection<Offer> getExpectsAcceptanceOfs() {
    final Object current = myData.get("expectsAcceptanceOf");
    if (current == null) return Collections.emptyList();
    if (current instanceof Collection) {
      return (Collection<Offer>) current;
    }
    return Arrays.asList((Offer) current);
  }
  /**
   * Indicates if use of the media require a subscription  (either paid or free). Allowed values are ```true``` or ```false``` (note that an earlier version had 'yes', 'no').
   */
  @JsonIgnore public Boolean getRequiresSubscriptionBoolean() {
    return (Boolean) getValue("requiresSubscription");
  }
  /**
   * Indicates if use of the media require a subscription  (either paid or free). Allowed values are ```true``` or ```false``` (note that an earlier version had 'yes', 'no').
   */
  @JsonIgnore public Collection<Boolean> getRequiresSubscriptionBooleans() {
    final Object current = myData.get("requiresSubscription");
    if (current == null) return Collections.emptyList();
    if (current instanceof Collection) {
      return (Collection<Boolean>) current;
    }
    return Arrays.asList((Boolean) current);
  }
  /**
   * Indicates if use of the media require a subscription  (either paid or free). Allowed values are ```true``` or ```false``` (note that an earlier version had 'yes', 'no').
   */
  @JsonIgnore public MediaSubscription getRequiresSubscriptionMediaSubscription() {
    return (MediaSubscription) getValue("requiresSubscription");
  }
  /**
   * Indicates if use of the media require a subscription  (either paid or free). Allowed values are ```true``` or ```false``` (note that an earlier version had 'yes', 'no').
   */
  @JsonIgnore public Collection<MediaSubscription> getRequiresSubscriptionMediaSubscriptions() {
    final Object current = myData.get("requiresSubscription");
    if (current == null) return Collections.emptyList();
    if (current instanceof Collection) {
      return (Collection<MediaSubscription>) current;
    }
    return Arrays.asList((MediaSubscription) current);
  }
  protected ActionAccessSpecification(java.util.Map<String,Object> data) {
    super(data);
  }
  
  /**
   * Builder for {@link ActionAccessSpecification}
   */
  public static class Builder extends Intangible.Builder {
    public Builder(@NotNull HashMap<String,Object> data) {
      super(data);
    }
    @NotNull public ActionAccessSpecification build() {
      return new ActionAccessSpecification(myData);
    }
    /**
     * The beginning of the availability of the product or service included in the offer.
     */
    @NotNull public Builder availabilityStarts(@NotNull java.util.Date date) {
      putValue("availabilityStarts", date);
      return this;
    }
    /**
     * The end of the availability of the product or service included in the offer.
     */
    @NotNull public Builder availabilityEnds(@NotNull java.util.Date date) {
      putValue("availabilityEnds", date);
      return this;
    }
    /**
     * A category for the item. Greater signs or slashes can be used to informally indicate a category hierarchy.
     */
    @NotNull public Builder category(@NotNull String category) {
      putValue("category", category);
      return this;
    }
    /**
     * A category for the item. Greater signs or slashes can be used to informally indicate a category hierarchy.
     */
    @NotNull public Builder category(@NotNull Thing thing) {
      putValue("category", thing);
      return this;
    }
    /**
     * A category for the item. Greater signs or slashes can be used to informally indicate a category hierarchy.
     */
    @NotNull public Builder category(@NotNull Thing.Builder thing) {
      putValue("category", thing.build());
      return this;
    }
    /**
     * The ISO 3166-1 (ISO 3166-1 alpha-2) or ISO 3166-2 code, the place, or the GeoShape for the geo-political region(s) for which the offer or delivery charge specification is valid.\n\nSee also [[ineligibleRegion]].
     *     
     */
    @NotNull public Builder eligibleRegion(@NotNull GeoShape geoShape) {
      putValue("eligibleRegion", geoShape);
      return this;
    }
    /**
     * The ISO 3166-1 (ISO 3166-1 alpha-2) or ISO 3166-2 code, the place, or the GeoShape for the geo-political region(s) for which the offer or delivery charge specification is valid.\n\nSee also [[ineligibleRegion]].
     *     
     */
    @NotNull public Builder eligibleRegion(@NotNull GeoShape.Builder geoShape) {
      putValue("eligibleRegion", geoShape.build());
      return this;
    }
    /**
     * The ISO 3166-1 (ISO 3166-1 alpha-2) or ISO 3166-2 code, the place, or the GeoShape for the geo-political region(s) for which the offer or delivery charge specification is valid.\n\nSee also [[ineligibleRegion]].
     *     
     */
    @NotNull public Builder eligibleRegion(@NotNull Place place) {
      putValue("eligibleRegion", place);
      return this;
    }
    /**
     * The ISO 3166-1 (ISO 3166-1 alpha-2) or ISO 3166-2 code, the place, or the GeoShape for the geo-political region(s) for which the offer or delivery charge specification is valid.\n\nSee also [[ineligibleRegion]].
     *     
     */
    @NotNull public Builder eligibleRegion(@NotNull Place.Builder place) {
      putValue("eligibleRegion", place.build());
      return this;
    }
    /**
     * The ISO 3166-1 (ISO 3166-1 alpha-2) or ISO 3166-2 code, the place, or the GeoShape for the geo-political region(s) for which the offer or delivery charge specification is valid.\n\nSee also [[ineligibleRegion]].
     *     
     */
    @NotNull public Builder eligibleRegion(@NotNull String eligibleRegion) {
      putValue("eligibleRegion", eligibleRegion);
      return this;
    }
    /**
     * An Offer which must be accepted before the user can perform the Action. For example, the user may need to buy a movie before being able to watch it.
     */
    @NotNull public Builder expectsAcceptanceOf(@NotNull Offer offer) {
      putValue("expectsAcceptanceOf", offer);
      return this;
    }
    /**
     * An Offer which must be accepted before the user can perform the Action. For example, the user may need to buy a movie before being able to watch it.
     */
    @NotNull public Builder expectsAcceptanceOf(@NotNull Offer.Builder offer) {
      putValue("expectsAcceptanceOf", offer.build());
      return this;
    }
    /**
     * Indicates if use of the media require a subscription  (either paid or free). Allowed values are ```true``` or ```false``` (note that an earlier version had 'yes', 'no').
     */
    @NotNull public Builder requiresSubscription(@NotNull Boolean requiresSubscription) {
      putValue("requiresSubscription", requiresSubscription);
      return this;
    }
    /**
     * Indicates if use of the media require a subscription  (either paid or free). Allowed values are ```true``` or ```false``` (note that an earlier version had 'yes', 'no').
     */
    @NotNull public Builder requiresSubscription(@NotNull MediaSubscription mediaSubscription) {
      putValue("requiresSubscription", mediaSubscription);
      return this;
    }
    /**
     * Indicates if use of the media require a subscription  (either paid or free). Allowed values are ```true``` or ```false``` (note that an earlier version had 'yes', 'no').
     */
    @NotNull public Builder requiresSubscription(@NotNull MediaSubscription.Builder mediaSubscription) {
      putValue("requiresSubscription", mediaSubscription.build());
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
     * An alias for the item.
     */
    @NotNull public Builder alternateName(@NotNull String alternateName) {
      putValue("alternateName", alternateName);
      return this;
    }
    /**
     * A sub property of description. A short description of the item used to disambiguate from other, similar items. Information from other properties (in particular, name) may be necessary for the description to be useful for disambiguation.
     */
    @NotNull public Builder disambiguatingDescription(@NotNull String disambiguatingDescription) {
      putValue("disambiguatingDescription", disambiguatingDescription);
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
    /**
     * The name of the item.
     */
    @NotNull public Builder name(@NotNull String name) {
      putValue("name", name);
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
     * URL of the item.
     */
    @NotNull public Builder url(@NotNull String url) {
      putValue("url", url);
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
      if ("availabilityStarts".equals(key) && value instanceof java.util.Date) { availabilityStarts((java.util.Date)value); return; }
      if ("availabilityStartss".equals(key) && value instanceof java.util.Date) { availabilityStarts((java.util.Date)value); return; }
      if ("availabilityEnds".equals(key) && value instanceof java.util.Date) { availabilityEnds((java.util.Date)value); return; }
      if ("availabilityEndss".equals(key) && value instanceof java.util.Date) { availabilityEnds((java.util.Date)value); return; }
      if ("category".equals(key) && value instanceof String) { category((String)value); return; }
      if ("categorys".equals(key) && value instanceof String) { category((String)value); return; }
      if ("category".equals(key) && value instanceof Thing) { category((Thing)value); return; }
      if ("categorys".equals(key) && value instanceof Thing) { category((Thing)value); return; }
      if ("eligibleRegion".equals(key) && value instanceof GeoShape) { eligibleRegion((GeoShape)value); return; }
      if ("eligibleRegions".equals(key) && value instanceof GeoShape) { eligibleRegion((GeoShape)value); return; }
      if ("eligibleRegion".equals(key) && value instanceof Place) { eligibleRegion((Place)value); return; }
      if ("eligibleRegions".equals(key) && value instanceof Place) { eligibleRegion((Place)value); return; }
      if ("eligibleRegion".equals(key) && value instanceof String) { eligibleRegion((String)value); return; }
      if ("eligibleRegions".equals(key) && value instanceof String) { eligibleRegion((String)value); return; }
      if ("expectsAcceptanceOf".equals(key) && value instanceof Offer) { expectsAcceptanceOf((Offer)value); return; }
      if ("expectsAcceptanceOfs".equals(key) && value instanceof Offer) { expectsAcceptanceOf((Offer)value); return; }
      if ("requiresSubscription".equals(key) && value instanceof Boolean) { requiresSubscription((Boolean)value); return; }
      if ("requiresSubscriptions".equals(key) && value instanceof Boolean) { requiresSubscription((Boolean)value); return; }
      if ("requiresSubscription".equals(key) && value instanceof MediaSubscription) { requiresSubscription((MediaSubscription)value); return; }
      if ("requiresSubscriptions".equals(key) && value instanceof MediaSubscription) { requiresSubscription((MediaSubscription)value); return; }
      super.fromMap(key, value);
    }
  }
  
}
