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
 * A trip or journey. An itinerary of visits to one or more places.Source: http://www.w3.org/wiki/WebSchemas/SchemaDotOrgSources#Tourism
 */
public class Trip extends Intangible {
  /**
   * The expected arrival time.
   */
  @JsonIgnore public java.util.Date getArrivalTime() {
    return (java.util.Date) getValue("arrivalTime");
  }
  /**
   * The expected arrival time.
   */
  @JsonIgnore public Collection<java.util.Date> getArrivalTimes() {
    final Object current = myData.get("arrivalTime");
    if (current == null) return Collections.emptyList();
    if (current instanceof Collection) {
      return (Collection<java.util.Date>) current;
    }
    return Arrays.asList((java.util.Date) current);
  }
  /**
   * Destination(s) ( &lt;a class=&quot;localLink&quot; href=&quot;http://schema.org/Place&quot;&gt;Place&lt;/a&gt; ) that make up a trip. For a trip where destination order is important use &lt;a class=&quot;localLink&quot; href=&quot;http://schema.org/ItemList&quot;&gt;ItemList&lt;/a&gt; to specify that order (see examples).
   */
  @JsonIgnore public ItemList getItineraryItemList() {
    return (ItemList) getValue("itinerary");
  }
  /**
   * Destination(s) ( &lt;a class=&quot;localLink&quot; href=&quot;http://schema.org/Place&quot;&gt;Place&lt;/a&gt; ) that make up a trip. For a trip where destination order is important use &lt;a class=&quot;localLink&quot; href=&quot;http://schema.org/ItemList&quot;&gt;ItemList&lt;/a&gt; to specify that order (see examples).
   */
  @JsonIgnore public Collection<ItemList> getItineraryItemLists() {
    final Object current = myData.get("itinerary");
    if (current == null) return Collections.emptyList();
    if (current instanceof Collection) {
      return (Collection<ItemList>) current;
    }
    return Arrays.asList((ItemList) current);
  }
  /**
   * Destination(s) ( &lt;a class=&quot;localLink&quot; href=&quot;http://schema.org/Place&quot;&gt;Place&lt;/a&gt; ) that make up a trip. For a trip where destination order is important use &lt;a class=&quot;localLink&quot; href=&quot;http://schema.org/ItemList&quot;&gt;ItemList&lt;/a&gt; to specify that order (see examples).
   */
  @JsonIgnore public Place getItineraryPlace() {
    return (Place) getValue("itinerary");
  }
  /**
   * Destination(s) ( &lt;a class=&quot;localLink&quot; href=&quot;http://schema.org/Place&quot;&gt;Place&lt;/a&gt; ) that make up a trip. For a trip where destination order is important use &lt;a class=&quot;localLink&quot; href=&quot;http://schema.org/ItemList&quot;&gt;ItemList&lt;/a&gt; to specify that order (see examples).
   */
  @JsonIgnore public Collection<Place> getItineraryPlaces() {
    final Object current = myData.get("itinerary");
    if (current == null) return Collections.emptyList();
    if (current instanceof Collection) {
      return (Collection<Place>) current;
    }
    return Arrays.asList((Place) current);
  }
  /**
   * The service provider, service operator, or service performer; the goods producer. Another party (a seller) may offer those services or goods on behalf of the provider. A provider may also serve as the seller.
   */
  @JsonIgnore public Organization getProviderOrganization() {
    return (Organization) getValue("provider");
  }
  /**
   * The service provider, service operator, or service performer; the goods producer. Another party (a seller) may offer those services or goods on behalf of the provider. A provider may also serve as the seller.
   */
  @JsonIgnore public Collection<Organization> getProviderOrganizations() {
    final Object current = myData.get("provider");
    if (current == null) return Collections.emptyList();
    if (current instanceof Collection) {
      return (Collection<Organization>) current;
    }
    return Arrays.asList((Organization) current);
  }
  /**
   * The service provider, service operator, or service performer; the goods producer. Another party (a seller) may offer those services or goods on behalf of the provider. A provider may also serve as the seller.
   */
  @JsonIgnore public Person getProviderPerson() {
    return (Person) getValue("provider");
  }
  /**
   * The service provider, service operator, or service performer; the goods producer. Another party (a seller) may offer those services or goods on behalf of the provider. A provider may also serve as the seller.
   */
  @JsonIgnore public Collection<Person> getProviderPersons() {
    final Object current = myData.get("provider");
    if (current == null) return Collections.emptyList();
    if (current instanceof Collection) {
      return (Collection<Person>) current;
    }
    return Arrays.asList((Person) current);
  }
  /**
   * The expected departure time.
   */
  @JsonIgnore public java.util.Date getDepartureTime() {
    return (java.util.Date) getValue("departureTime");
  }
  /**
   * The expected departure time.
   */
  @JsonIgnore public Collection<java.util.Date> getDepartureTimes() {
    final Object current = myData.get("departureTime");
    if (current == null) return Collections.emptyList();
    if (current instanceof Collection) {
      return (Collection<java.util.Date>) current;
    }
    return Arrays.asList((java.util.Date) current);
  }
  /**
   * Identifies a &lt;a class=&quot;localLink&quot; href=&quot;http://schema.org/Trip&quot;&gt;Trip&lt;/a&gt; that is a subTrip of this Trip.  For example Day 1, Day 2, etc. of a multi-day trip.
   */
  @JsonIgnore public Trip getSubTrip() {
    return (Trip) getValue("subTrip");
  }
  /**
   * Identifies a &lt;a class=&quot;localLink&quot; href=&quot;http://schema.org/Trip&quot;&gt;Trip&lt;/a&gt; that is a subTrip of this Trip.  For example Day 1, Day 2, etc. of a multi-day trip.
   */
  @JsonIgnore public Collection<Trip> getSubTrips() {
    final Object current = myData.get("subTrip");
    if (current == null) return Collections.emptyList();
    if (current instanceof Collection) {
      return (Collection<Trip>) current;
    }
    return Arrays.asList((Trip) current);
  }
  /**
   * Identifies that this &lt;a class=&quot;localLink&quot; href=&quot;http://schema.org/Trip&quot;&gt;Trip&lt;/a&gt; is a subTrip of another Trip.  For example Day 1, Day 2, etc. of a multi-day trip.
   */
  @JsonIgnore public Trip getPartOfTrip() {
    return (Trip) getValue("partOfTrip");
  }
  /**
   * Identifies that this &lt;a class=&quot;localLink&quot; href=&quot;http://schema.org/Trip&quot;&gt;Trip&lt;/a&gt; is a subTrip of another Trip.  For example Day 1, Day 2, etc. of a multi-day trip.
   */
  @JsonIgnore public Collection<Trip> getPartOfTrips() {
    final Object current = myData.get("partOfTrip");
    if (current == null) return Collections.emptyList();
    if (current instanceof Collection) {
      return (Collection<Trip>) current;
    }
    return Arrays.asList((Trip) current);
  }
  /**
   * An offer to provide this item&amp;#x2014;for example, an offer to sell a product, rent the DVD of a movie, perform a service, or give away tickets to an event. Use &lt;a class=&quot;localLink&quot; href=&quot;http://schema.org/businessFunction&quot;&gt;businessFunction&lt;/a&gt; to indicate the kind of transaction offered, i.e. sell, lease, etc. This property can also be used to describe a &lt;a class=&quot;localLink&quot; href=&quot;http://schema.org/Demand&quot;&gt;Demand&lt;/a&gt;. While this property is listed as expected on a number of common types, it can be used in others. In that case, using a second type, such as Product or a subtype of Product, can clarify the nature of the offer.
   */
  @JsonIgnore public Demand getOffersDemand() {
    return (Demand) getValue("offers");
  }
  /**
   * An offer to provide this item&amp;#x2014;for example, an offer to sell a product, rent the DVD of a movie, perform a service, or give away tickets to an event. Use &lt;a class=&quot;localLink&quot; href=&quot;http://schema.org/businessFunction&quot;&gt;businessFunction&lt;/a&gt; to indicate the kind of transaction offered, i.e. sell, lease, etc. This property can also be used to describe a &lt;a class=&quot;localLink&quot; href=&quot;http://schema.org/Demand&quot;&gt;Demand&lt;/a&gt;. While this property is listed as expected on a number of common types, it can be used in others. In that case, using a second type, such as Product or a subtype of Product, can clarify the nature of the offer.
   */
  @JsonIgnore public Collection<Demand> getOffersDemands() {
    final Object current = myData.get("offers");
    if (current == null) return Collections.emptyList();
    if (current instanceof Collection) {
      return (Collection<Demand>) current;
    }
    return Arrays.asList((Demand) current);
  }
  /**
   * An offer to provide this item&amp;#x2014;for example, an offer to sell a product, rent the DVD of a movie, perform a service, or give away tickets to an event. Use &lt;a class=&quot;localLink&quot; href=&quot;http://schema.org/businessFunction&quot;&gt;businessFunction&lt;/a&gt; to indicate the kind of transaction offered, i.e. sell, lease, etc. This property can also be used to describe a &lt;a class=&quot;localLink&quot; href=&quot;http://schema.org/Demand&quot;&gt;Demand&lt;/a&gt;. While this property is listed as expected on a number of common types, it can be used in others. In that case, using a second type, such as Product or a subtype of Product, can clarify the nature of the offer.
   */
  @JsonIgnore public Offer getOffersOffer() {
    return (Offer) getValue("offers");
  }
  /**
   * An offer to provide this item&amp;#x2014;for example, an offer to sell a product, rent the DVD of a movie, perform a service, or give away tickets to an event. Use &lt;a class=&quot;localLink&quot; href=&quot;http://schema.org/businessFunction&quot;&gt;businessFunction&lt;/a&gt; to indicate the kind of transaction offered, i.e. sell, lease, etc. This property can also be used to describe a &lt;a class=&quot;localLink&quot; href=&quot;http://schema.org/Demand&quot;&gt;Demand&lt;/a&gt;. While this property is listed as expected on a number of common types, it can be used in others. In that case, using a second type, such as Product or a subtype of Product, can clarify the nature of the offer.
   */
  @JsonIgnore public Collection<Offer> getOffersOffers() {
    final Object current = myData.get("offers");
    if (current == null) return Collections.emptyList();
    if (current instanceof Collection) {
      return (Collection<Offer>) current;
    }
    return Arrays.asList((Offer) current);
  }
  protected Trip(java.util.Map<String,Object> data) {
    super(data);
  }
  
  /**
   * Builder for {@link Trip}
   */
  public static class Builder extends Intangible.Builder {
    public Builder(@NotNull HashMap<String,Object> data) {
      super(data);
    }
    @NotNull public Trip build() {
      return new Trip(myData);
    }
    /**
     * The expected arrival time.
     */
    @NotNull public Builder arrivalTime(@NotNull java.util.Date date) {
      putValue("arrivalTime", date);
      return this;
    }
    /**
     * Destination(s) ( &lt;a class=&quot;localLink&quot; href=&quot;http://schema.org/Place&quot;&gt;Place&lt;/a&gt; ) that make up a trip. For a trip where destination order is important use &lt;a class=&quot;localLink&quot; href=&quot;http://schema.org/ItemList&quot;&gt;ItemList&lt;/a&gt; to specify that order (see examples).
     */
    @NotNull public Builder itinerary(@NotNull ItemList itemList) {
      putValue("itinerary", itemList);
      return this;
    }
    /**
     * Destination(s) ( &lt;a class=&quot;localLink&quot; href=&quot;http://schema.org/Place&quot;&gt;Place&lt;/a&gt; ) that make up a trip. For a trip where destination order is important use &lt;a class=&quot;localLink&quot; href=&quot;http://schema.org/ItemList&quot;&gt;ItemList&lt;/a&gt; to specify that order (see examples).
     */
    @NotNull public Builder itinerary(@NotNull ItemList.Builder itemList) {
      putValue("itinerary", itemList.build());
      return this;
    }
    /**
     * Destination(s) ( &lt;a class=&quot;localLink&quot; href=&quot;http://schema.org/Place&quot;&gt;Place&lt;/a&gt; ) that make up a trip. For a trip where destination order is important use &lt;a class=&quot;localLink&quot; href=&quot;http://schema.org/ItemList&quot;&gt;ItemList&lt;/a&gt; to specify that order (see examples).
     */
    @NotNull public Builder itinerary(@NotNull Place place) {
      putValue("itinerary", place);
      return this;
    }
    /**
     * Destination(s) ( &lt;a class=&quot;localLink&quot; href=&quot;http://schema.org/Place&quot;&gt;Place&lt;/a&gt; ) that make up a trip. For a trip where destination order is important use &lt;a class=&quot;localLink&quot; href=&quot;http://schema.org/ItemList&quot;&gt;ItemList&lt;/a&gt; to specify that order (see examples).
     */
    @NotNull public Builder itinerary(@NotNull Place.Builder place) {
      putValue("itinerary", place.build());
      return this;
    }
    /**
     * The service provider, service operator, or service performer; the goods producer. Another party (a seller) may offer those services or goods on behalf of the provider. A provider may also serve as the seller.
     */
    @NotNull public Builder provider(@NotNull Organization organization) {
      putValue("provider", organization);
      return this;
    }
    /**
     * The service provider, service operator, or service performer; the goods producer. Another party (a seller) may offer those services or goods on behalf of the provider. A provider may also serve as the seller.
     */
    @NotNull public Builder provider(@NotNull Organization.Builder organization) {
      putValue("provider", organization.build());
      return this;
    }
    /**
     * The service provider, service operator, or service performer; the goods producer. Another party (a seller) may offer those services or goods on behalf of the provider. A provider may also serve as the seller.
     */
    @NotNull public Builder provider(@NotNull Person person) {
      putValue("provider", person);
      return this;
    }
    /**
     * The service provider, service operator, or service performer; the goods producer. Another party (a seller) may offer those services or goods on behalf of the provider. A provider may also serve as the seller.
     */
    @NotNull public Builder provider(@NotNull Person.Builder person) {
      putValue("provider", person.build());
      return this;
    }
    /**
     * The expected departure time.
     */
    @NotNull public Builder departureTime(@NotNull java.util.Date date) {
      putValue("departureTime", date);
      return this;
    }
    /**
     * Identifies a &lt;a class=&quot;localLink&quot; href=&quot;http://schema.org/Trip&quot;&gt;Trip&lt;/a&gt; that is a subTrip of this Trip.  For example Day 1, Day 2, etc. of a multi-day trip.
     */
    @NotNull public Builder subTrip(@NotNull Trip trip) {
      putValue("subTrip", trip);
      return this;
    }
    /**
     * Identifies a &lt;a class=&quot;localLink&quot; href=&quot;http://schema.org/Trip&quot;&gt;Trip&lt;/a&gt; that is a subTrip of this Trip.  For example Day 1, Day 2, etc. of a multi-day trip.
     */
    @NotNull public Builder subTrip(@NotNull Trip.Builder trip) {
      putValue("subTrip", trip.build());
      return this;
    }
    /**
     * Identifies that this &lt;a class=&quot;localLink&quot; href=&quot;http://schema.org/Trip&quot;&gt;Trip&lt;/a&gt; is a subTrip of another Trip.  For example Day 1, Day 2, etc. of a multi-day trip.
     */
    @NotNull public Builder partOfTrip(@NotNull Trip trip) {
      putValue("partOfTrip", trip);
      return this;
    }
    /**
     * Identifies that this &lt;a class=&quot;localLink&quot; href=&quot;http://schema.org/Trip&quot;&gt;Trip&lt;/a&gt; is a subTrip of another Trip.  For example Day 1, Day 2, etc. of a multi-day trip.
     */
    @NotNull public Builder partOfTrip(@NotNull Trip.Builder trip) {
      putValue("partOfTrip", trip.build());
      return this;
    }
    /**
     * An offer to provide this item&amp;#x2014;for example, an offer to sell a product, rent the DVD of a movie, perform a service, or give away tickets to an event. Use &lt;a class=&quot;localLink&quot; href=&quot;http://schema.org/businessFunction&quot;&gt;businessFunction&lt;/a&gt; to indicate the kind of transaction offered, i.e. sell, lease, etc. This property can also be used to describe a &lt;a class=&quot;localLink&quot; href=&quot;http://schema.org/Demand&quot;&gt;Demand&lt;/a&gt;. While this property is listed as expected on a number of common types, it can be used in others. In that case, using a second type, such as Product or a subtype of Product, can clarify the nature of the offer.
     */
    @NotNull public Builder offers(@NotNull Demand demand) {
      putValue("offers", demand);
      return this;
    }
    /**
     * An offer to provide this item&amp;#x2014;for example, an offer to sell a product, rent the DVD of a movie, perform a service, or give away tickets to an event. Use &lt;a class=&quot;localLink&quot; href=&quot;http://schema.org/businessFunction&quot;&gt;businessFunction&lt;/a&gt; to indicate the kind of transaction offered, i.e. sell, lease, etc. This property can also be used to describe a &lt;a class=&quot;localLink&quot; href=&quot;http://schema.org/Demand&quot;&gt;Demand&lt;/a&gt;. While this property is listed as expected on a number of common types, it can be used in others. In that case, using a second type, such as Product or a subtype of Product, can clarify the nature of the offer.
     */
    @NotNull public Builder offers(@NotNull Demand.Builder demand) {
      putValue("offers", demand.build());
      return this;
    }
    /**
     * An offer to provide this item&amp;#x2014;for example, an offer to sell a product, rent the DVD of a movie, perform a service, or give away tickets to an event. Use &lt;a class=&quot;localLink&quot; href=&quot;http://schema.org/businessFunction&quot;&gt;businessFunction&lt;/a&gt; to indicate the kind of transaction offered, i.e. sell, lease, etc. This property can also be used to describe a &lt;a class=&quot;localLink&quot; href=&quot;http://schema.org/Demand&quot;&gt;Demand&lt;/a&gt;. While this property is listed as expected on a number of common types, it can be used in others. In that case, using a second type, such as Product or a subtype of Product, can clarify the nature of the offer.
     */
    @NotNull public Builder offers(@NotNull Offer offer) {
      putValue("offers", offer);
      return this;
    }
    /**
     * An offer to provide this item&amp;#x2014;for example, an offer to sell a product, rent the DVD of a movie, perform a service, or give away tickets to an event. Use &lt;a class=&quot;localLink&quot; href=&quot;http://schema.org/businessFunction&quot;&gt;businessFunction&lt;/a&gt; to indicate the kind of transaction offered, i.e. sell, lease, etc. This property can also be used to describe a &lt;a class=&quot;localLink&quot; href=&quot;http://schema.org/Demand&quot;&gt;Demand&lt;/a&gt;. While this property is listed as expected on a number of common types, it can be used in others. In that case, using a second type, such as Product or a subtype of Product, can clarify the nature of the offer.
     */
    @NotNull public Builder offers(@NotNull Offer.Builder offer) {
      putValue("offers", offer.build());
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
      if ("arrivalTime".equals(key) && value instanceof java.util.Date) { this.arrivalTime((java.util.Date)value); return; }
      if ("arrivalTimes".equals(key) && value instanceof java.util.Date) { this.arrivalTime((java.util.Date)value); return; }
      if ("itinerary".equals(key) && value instanceof ItemList) { this.itinerary((ItemList)value); return; }
      if ("itinerarys".equals(key) && value instanceof ItemList) { this.itinerary((ItemList)value); return; }
      if ("itinerary".equals(key) && value instanceof Place) { this.itinerary((Place)value); return; }
      if ("itinerarys".equals(key) && value instanceof Place) { this.itinerary((Place)value); return; }
      if ("provider".equals(key) && value instanceof Organization) { this.provider((Organization)value); return; }
      if ("providers".equals(key) && value instanceof Organization) { this.provider((Organization)value); return; }
      if ("provider".equals(key) && value instanceof Person) { this.provider((Person)value); return; }
      if ("providers".equals(key) && value instanceof Person) { this.provider((Person)value); return; }
      if ("departureTime".equals(key) && value instanceof java.util.Date) { this.departureTime((java.util.Date)value); return; }
      if ("departureTimes".equals(key) && value instanceof java.util.Date) { this.departureTime((java.util.Date)value); return; }
      if ("subTrip".equals(key) && value instanceof Trip) { this.subTrip((Trip)value); return; }
      if ("subTrips".equals(key) && value instanceof Trip) { this.subTrip((Trip)value); return; }
      if ("partOfTrip".equals(key) && value instanceof Trip) { this.partOfTrip((Trip)value); return; }
      if ("partOfTrips".equals(key) && value instanceof Trip) { this.partOfTrip((Trip)value); return; }
      if ("offers".equals(key) && value instanceof Demand) { this.offers((Demand)value); return; }
      if ("offerss".equals(key) && value instanceof Demand) { this.offers((Demand)value); return; }
      if ("offers".equals(key) && value instanceof Offer) { this.offers((Offer)value); return; }
      if ("offerss".equals(key) && value instanceof Offer) { this.offers((Offer)value); return; }
      super.fromMap(key, value);
    }
  }
  
}
