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
 * A computer store.
 */
public class ComputerStore extends Store {
  protected ComputerStore(java.util.Map<String,Object> data) {
    super(data);
  }
  
  /**
   * Builder for {@link ComputerStore}
   */
  public static class Builder extends Store.Builder {
    public Builder(@NotNull HashMap<String,Object> data) {
      super(data);
    }
    @NotNull public ComputerStore build() {
      return new ComputerStore(myData);
    }
    /**
     * The currency accepted.\n\nUse standard formats: [ISO 4217 currency format](http://en.wikipedia.org/wiki/ISO_4217) e.g. &quot;USD&quot;; [Ticker symbol](https://en.wikipedia.org/wiki/List_of_cryptocurrencies) for cryptocurrencies e.g. &quot;BTC&quot;; well known names for [Local Exchange Tradings Systems](https://en.wikipedia.org/wiki/Local_exchange_trading_system) (LETS) and other currency types e.g. &quot;Ithaca HOUR&quot;.
     */
    @NotNull public Builder currenciesAccepted(@NotNull String currenciesAccepted) {
      putValue("currenciesAccepted", currenciesAccepted);
      return this;
    }
    /**
     * Cash, Credit Card, Cryptocurrency, Local Exchange Tradings System, etc.
     */
    @NotNull public Builder paymentAccepted(@NotNull String paymentAccepted) {
      putValue("paymentAccepted", paymentAccepted);
      return this;
    }
    /**
     * The price range of the business, for example ```$$$```.
     */
    @NotNull public Builder priceRange(@NotNull String priceRange) {
      putValue("priceRange", priceRange);
      return this;
    }
    /**
     * The general opening hours for a business. Opening hours can be specified as a weekly time range, starting with days, then times per day. Multiple days can be listed with commas ',' separating each day. Day or time ranges are specified using a hyphen '-'.\n\n* Days are specified using the following two-letter combinations: ```Mo```, ```Tu```, ```We```, ```Th```, ```Fr```, ```Sa```, ```Su```.\n* Times are specified using 24:00 format. For example, 3pm is specified as ```15:00```, 10am as ```10:00```. \n* Here is an example: &lt;code&gt;&amp;lt;time itemprop=&quot;openingHours&quot; datetime=&amp;quot;Tu,Th 16:00-20:00&amp;quot;&amp;gt;Tuesdays and Thursdays 4-8pm&amp;lt;/time&amp;gt;&lt;/code&gt;.\n* If a business is open 7 days a week, then it can be specified as &lt;code&gt;&amp;lt;time itemprop=&amp;quot;openingHours&amp;quot; datetime=&amp;quot;Mo-Su&amp;quot;&amp;gt;Monday through Sunday, all day&amp;lt;/time&amp;gt;&lt;/code&gt;.
     */
    @NotNull public Builder openingHours(@NotNull String openingHours) {
      putValue("openingHours", openingHours);
      return this;
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
      super.fromMap(key, value);
    }
  }
  
}
