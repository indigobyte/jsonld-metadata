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
public class Place extends Thing implements ToLocation, EligibleRegion, WorkLocation, FromLocation, ExerciseCourse, SpatialCoverage, HomeLocation, Course, AvailableAtOrFrom {
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
   * A short textual code (also called "store code") that uniquely identifies a place of business. The code is typically assigned by the parentOrganization and used in structured URLs.\n\nFor example, in the URL http://www.starbucks.co.uk/store-locator/etc/detail/3047 the code "3047" is a branchCode for a particular branch.
   *       
   */
  @JsonIgnore public String getBranchCode() {
    return (String) getValue("branchCode");
  }
  /**
   * A short textual code (also called "store code") that uniquely identifies a place of business. The code is typically assigned by the parentOrganization and used in structured URLs.\n\nFor example, in the URL http://www.starbucks.co.uk/store-locator/etc/detail/3047 the code "3047" is a branchCode for a particular branch.
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
  @JsonIgnore public Logo getLogo() {
    return (Logo) getValue("logo");
  }
  @JsonIgnore public Collection<Logo> getLogos() {
    final Object current = myData.get("logo");
    if (current == null) return Collections.emptyList();
    if (current instanceof Collection) {
      return (Collection<Logo>) current;
    }
    return Arrays.asList((Logo) current);
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
  @JsonIgnore public Photo getPhoto() {
    return (Photo) getValue("photo");
  }
  @JsonIgnore public Collection<Photo> getPhotos() {
    final Object current = myData.get("photo");
    if (current == null) return Collections.emptyList();
    if (current instanceof Collection) {
      return (Collection<Photo>) current;
    }
    return Arrays.asList((Photo) current);
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
     * A short textual code (also called "store code") that uniquely identifies a place of business. The code is typically assigned by the parentOrganization and used in structured URLs.\n\nFor example, in the URL http://www.starbucks.co.uk/store-locator/etc/detail/3047 the code "3047" is a branchCode for a particular branch.
     *       
     */
    @NotNull public Builder branchCode(@NotNull String branchCode) {
      putValue("branchCode", branchCode);
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
     * The fax number.
     */
    @NotNull public Builder faxNumber(@NotNull String faxNumber) {
      putValue("faxNumber", faxNumber);
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
     * A flag to signal that the [[Place]] is open to public visitors.  If this property is omitted there is no assumed default boolean value
     */
    @NotNull public Builder publicAccess(@NotNull Boolean publicAccess) {
      putValue("publicAccess", publicAccess);
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
     * The International Standard of Industrial Classification of All Economic Activities (ISIC), Revision 4 code for a particular organization, business person, or place.
     */
    @NotNull public Builder isicV4(@NotNull String isicV4) {
      putValue("isicV4", isicV4);
      return this;
    }
    @NotNull public Builder logo(@NotNull Logo logo) {
      putValue("logo", logo);
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
     * The total number of individuals that may attend an event or venue.
     */
    @NotNull public Builder maximumAttendeeCapacity(@NotNull Integer integer) {
      putValue("maximumAttendeeCapacity", integer);
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
    @NotNull public Builder photo(@NotNull Photo photo) {
      putValue("photo", photo);
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
     * A slogan or motto associated with the item.
     */
    @NotNull public Builder slogan(@NotNull String slogan) {
      putValue("slogan", slogan);
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
     * Indicates whether it is allowed to smoke in the place, e.g. in the restaurant, hotel or hotel room.
     */
    @NotNull public Builder smokingAllowed(@NotNull Boolean smokingAllowed) {
      putValue("smokingAllowed", smokingAllowed);
      return this;
    }
    @NotNull public Builder additionalType(@NotNull AdditionalType additionalType) {
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
     * A description of the item.
     */
    @NotNull public Builder description(@NotNull DisambiguatingDescription disambiguatingDescription) {
      putValue("description", disambiguatingDescription);
      return this;
    }
    @NotNull public Builder disambiguatingDescription(@NotNull DisambiguatingDescription disambiguatingDescription) {
      putValue("disambiguatingDescription", disambiguatingDescription);
      return this;
    }
    /**
     * An image of the item. This can be a [[URL]] or a fully described [[ImageObject]].
     */
    @NotNull public Builder image(@NotNull Logo logo) {
      putValue("image", logo);
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
     * The identifier property represents any kind of identifier for any kind of [[Thing]], such as ISBNs, GTIN codes, UUIDs etc. Schema.org provides dedicated properties for representing many of these, either as textual strings or as URL (URI) links. See [background notes](/docs/datamodel.html#identifierBg) for more details.
     *         
     */
    @NotNull public Builder identifier(@NotNull Isbn isbn) {
      putValue("identifier", isbn);
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
      if ("address".equals(key) && value instanceof PostalAddress) { address((PostalAddress)value); return; }
      if ("addresss".equals(key) && value instanceof PostalAddress) { address((PostalAddress)value); return; }
      if ("address".equals(key) && value instanceof String) { address((String)value); return; }
      if ("addresss".equals(key) && value instanceof String) { address((String)value); return; }
      if ("aggregateRating".equals(key) && value instanceof AggregateRating) { aggregateRating((AggregateRating)value); return; }
      if ("aggregateRatings".equals(key) && value instanceof AggregateRating) { aggregateRating((AggregateRating)value); return; }
      if ("branchCode".equals(key) && value instanceof String) { branchCode((String)value); return; }
      if ("branchCodes".equals(key) && value instanceof String) { branchCode((String)value); return; }
      if ("containedInPlace".equals(key) && value instanceof Place) { containedInPlace((Place)value); return; }
      if ("containedInPlaces".equals(key) && value instanceof Place) { containedInPlace((Place)value); return; }
      if ("containsPlace".equals(key) && value instanceof Place) { containsPlace((Place)value); return; }
      if ("containsPlaces".equals(key) && value instanceof Place) { containsPlace((Place)value); return; }
      if ("event".equals(key) && value instanceof Event) { event((Event)value); return; }
      if ("events".equals(key) && value instanceof Event) { event((Event)value); return; }
      if ("faxNumber".equals(key) && value instanceof String) { faxNumber((String)value); return; }
      if ("faxNumbers".equals(key) && value instanceof String) { faxNumber((String)value); return; }
      if ("isAccessibleForFree".equals(key) && value instanceof Boolean) { isAccessibleForFree((Boolean)value); return; }
      if ("isAccessibleForFrees".equals(key) && value instanceof Boolean) { isAccessibleForFree((Boolean)value); return; }
      if ("publicAccess".equals(key) && value instanceof Boolean) { publicAccess((Boolean)value); return; }
      if ("publicAccesss".equals(key) && value instanceof Boolean) { publicAccess((Boolean)value); return; }
      if ("geo".equals(key) && value instanceof GeoCoordinates) { geo((GeoCoordinates)value); return; }
      if ("geos".equals(key) && value instanceof GeoCoordinates) { geo((GeoCoordinates)value); return; }
      if ("geo".equals(key) && value instanceof GeoShape) { geo((GeoShape)value); return; }
      if ("geos".equals(key) && value instanceof GeoShape) { geo((GeoShape)value); return; }
      if ("isicV4".equals(key) && value instanceof String) { isicV4((String)value); return; }
      if ("isicV4s".equals(key) && value instanceof String) { isicV4((String)value); return; }
      if ("logo".equals(key) && value instanceof Logo) { logo((Logo)value); return; }
      if ("logos".equals(key) && value instanceof Logo) { logo((Logo)value); return; }
      if ("hasMap".equals(key) && value instanceof Map) { hasMap((Map)value); return; }
      if ("hasMaps".equals(key) && value instanceof Map) { hasMap((Map)value); return; }
      if ("hasMap".equals(key) && value instanceof String) { hasMap((String)value); return; }
      if ("hasMaps".equals(key) && value instanceof String) { hasMap((String)value); return; }
      if ("maximumAttendeeCapacity".equals(key) && value instanceof Integer) { maximumAttendeeCapacity((Integer)value); return; }
      if ("maximumAttendeeCapacitys".equals(key) && value instanceof Integer) { maximumAttendeeCapacity((Integer)value); return; }
      if ("openingHoursSpecification".equals(key) && value instanceof OpeningHoursSpecification) { openingHoursSpecification((OpeningHoursSpecification)value); return; }
      if ("openingHoursSpecifications".equals(key) && value instanceof OpeningHoursSpecification) { openingHoursSpecification((OpeningHoursSpecification)value); return; }
      if ("specialOpeningHoursSpecification".equals(key) && value instanceof OpeningHoursSpecification) { specialOpeningHoursSpecification((OpeningHoursSpecification)value); return; }
      if ("specialOpeningHoursSpecifications".equals(key) && value instanceof OpeningHoursSpecification) { specialOpeningHoursSpecification((OpeningHoursSpecification)value); return; }
      if ("photo".equals(key) && value instanceof Photo) { photo((Photo)value); return; }
      if ("photos".equals(key) && value instanceof Photo) { photo((Photo)value); return; }
      if ("review".equals(key) && value instanceof Review) { review((Review)value); return; }
      if ("reviews".equals(key) && value instanceof Review) { review((Review)value); return; }
      if ("slogan".equals(key) && value instanceof String) { slogan((String)value); return; }
      if ("slogans".equals(key) && value instanceof String) { slogan((String)value); return; }
      if ("telephone".equals(key) && value instanceof String) { telephone((String)value); return; }
      if ("telephones".equals(key) && value instanceof String) { telephone((String)value); return; }
      if ("additionalProperty".equals(key) && value instanceof PropertyValue) { additionalProperty((PropertyValue)value); return; }
      if ("additionalPropertys".equals(key) && value instanceof PropertyValue) { additionalProperty((PropertyValue)value); return; }
      if ("amenityFeature".equals(key) && value instanceof LocationFeatureSpecification) { amenityFeature((LocationFeatureSpecification)value); return; }
      if ("amenityFeatures".equals(key) && value instanceof LocationFeatureSpecification) { amenityFeature((LocationFeatureSpecification)value); return; }
      if ("smokingAllowed".equals(key) && value instanceof Boolean) { smokingAllowed((Boolean)value); return; }
      if ("smokingAlloweds".equals(key) && value instanceof Boolean) { smokingAllowed((Boolean)value); return; }
      super.fromMap(key, value);
    }
  }
  
}
