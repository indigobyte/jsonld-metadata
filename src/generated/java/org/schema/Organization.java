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
 * An organization such as a school, NGO, corporation, club, etc.
 */
public class Organization extends Thing implements CcRecipient, Funder, Lender, ToRecipient, Vendor, Followee, Landlord, Recipient, Sender, Endorsee {
  /**
   * Indicates an OfferCatalog listing for this Organization, Person, or Service.
   */
  @JsonIgnore public OfferCatalog getHasOfferCatalog() {
    return (OfferCatalog) getValue("hasOfferCatalog");
  }
  /**
   * Indicates an OfferCatalog listing for this Organization, Person, or Service.
   */
  @JsonIgnore public Collection<OfferCatalog> getHasOfferCatalogs() {
    final Object current = myData.get("hasOfferCatalog");
    if (current == null) return Collections.emptyList();
    if (current instanceof Collection) {
      return (Collection<OfferCatalog>) current;
    }
    return Arrays.asList((OfferCatalog) current);
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
   * Alumni of an organization.
   */
  @JsonIgnore public Person getAlumni() {
    return (Person) getValue("alumni");
  }
  /**
   * Alumni of an organization.
   */
  @JsonIgnore public Collection<Person> getAlumnis() {
    final Object current = myData.get("alumni");
    if (current == null) return Collections.emptyList();
    if (current instanceof Collection) {
      return (Collection<Person>) current;
    }
    return Arrays.asList((Person) current);
  }
  /**
   * The geographic area where a service or offered item is provided.
   */
  @JsonIgnore public AvailableAtOrFrom getAreaServed() {
    return (AvailableAtOrFrom) getValue("areaServed");
  }
  /**
   * The geographic area where a service or offered item is provided.
   */
  @JsonIgnore public Collection<AvailableAtOrFrom> getAreaServeds() {
    final Object current = myData.get("areaServed");
    if (current == null) return Collections.emptyList();
    if (current instanceof Collection) {
      return (Collection<AvailableAtOrFrom>) current;
    }
    return Arrays.asList((AvailableAtOrFrom) current);
  }
  /**
   * An award won by or for this item.
   */
  @JsonIgnore public String getAward() {
    return (String) getValue("award");
  }
  /**
   * An award won by or for this item.
   */
  @JsonIgnore public Collection<String> getAwards() {
    final Object current = myData.get("award");
    if (current == null) return Collections.emptyList();
    if (current instanceof Collection) {
      return (Collection<String>) current;
    }
    return Arrays.asList((String) current);
  }
  /**
   * The larger organization that this organization is a [[subOrganization]] of, if any.
   */
  @JsonIgnore public Organization getParentOrganization() {
    return (Organization) getValue("parentOrganization");
  }
  /**
   * The larger organization that this organization is a [[subOrganization]] of, if any.
   */
  @JsonIgnore public Collection<Organization> getParentOrganizations() {
    final Object current = myData.get("parentOrganization");
    if (current == null) return Collections.emptyList();
    if (current instanceof Collection) {
      return (Collection<Organization>) current;
    }
    return Arrays.asList((Organization) current);
  }
  /**
   * The brand(s) associated with a product or service, or the brand(s) maintained by an organization or business person.
   */
  @JsonIgnore public Brand getBrandBrand() {
    return (Brand) getValue("brand");
  }
  /**
   * The brand(s) associated with a product or service, or the brand(s) maintained by an organization or business person.
   */
  @JsonIgnore public Collection<Brand> getBrandBrands() {
    final Object current = myData.get("brand");
    if (current == null) return Collections.emptyList();
    if (current instanceof Collection) {
      return (Collection<Brand>) current;
    }
    return Arrays.asList((Brand) current);
  }
  /**
   * The brand(s) associated with a product or service, or the brand(s) maintained by an organization or business person.
   */
  @JsonIgnore public Organization getBrandOrganization() {
    return (Organization) getValue("brand");
  }
  /**
   * The brand(s) associated with a product or service, or the brand(s) maintained by an organization or business person.
   */
  @JsonIgnore public Collection<Organization> getBrandOrganizations() {
    final Object current = myData.get("brand");
    if (current == null) return Collections.emptyList();
    if (current instanceof Collection) {
      return (Collection<Organization>) current;
    }
    return Arrays.asList((Organization) current);
  }
  /**
   * A contact point for a person or organization.
   */
  @JsonIgnore public ContactPoint getContactPoint() {
    return (ContactPoint) getValue("contactPoint");
  }
  /**
   * A contact point for a person or organization.
   */
  @JsonIgnore public Collection<ContactPoint> getContactPoints() {
    final Object current = myData.get("contactPoint");
    if (current == null) return Collections.emptyList();
    if (current instanceof Collection) {
      return (Collection<ContactPoint>) current;
    }
    return Arrays.asList((ContactPoint) current);
  }
  /**
   * A relationship between an organization and a department of that organization, also described as an organization (allowing different urls, logos, opening hours). For example: a store with a pharmacy, or a bakery with a cafe.
   */
  @JsonIgnore public Organization getDepartment() {
    return (Organization) getValue("department");
  }
  /**
   * A relationship between an organization and a department of that organization, also described as an organization (allowing different urls, logos, opening hours). For example: a store with a pharmacy, or a bakery with a cafe.
   */
  @JsonIgnore public Collection<Organization> getDepartments() {
    final Object current = myData.get("department");
    if (current == null) return Collections.emptyList();
    if (current instanceof Collection) {
      return (Collection<Organization>) current;
    }
    return Arrays.asList((Organization) current);
  }
  /**
   * Email address.
   */
  @JsonIgnore public String getEmail() {
    return (String) getValue("email");
  }
  /**
   * Email address.
   */
  @JsonIgnore public Collection<String> getEmails() {
    final Object current = myData.get("email");
    if (current == null) return Collections.emptyList();
    if (current instanceof Collection) {
      return (Collection<String>) current;
    }
    return Arrays.asList((String) current);
  }
  /**
   * Someone working for this organization.
   */
  @JsonIgnore public Person getEmployee() {
    return (Person) getValue("employee");
  }
  /**
   * Someone working for this organization.
   */
  @JsonIgnore public Collection<Person> getEmployees() {
    final Object current = myData.get("employee");
    if (current == null) return Collections.emptyList();
    if (current instanceof Collection) {
      return (Collection<Person>) current;
    }
    return Arrays.asList((Person) current);
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
   * A person who founded this organization.
   */
  @JsonIgnore public Person getFounder() {
    return (Person) getValue("founder");
  }
  /**
   * A person who founded this organization.
   */
  @JsonIgnore public Collection<Person> getFounders() {
    final Object current = myData.get("founder");
    if (current == null) return Collections.emptyList();
    if (current instanceof Collection) {
      return (Collection<Person>) current;
    }
    return Arrays.asList((Person) current);
  }
  /**
   * The date that this organization was dissolved.
   */
  @JsonIgnore public java.util.Date getDissolutionDate() {
    return (java.util.Date) getValue("dissolutionDate");
  }
  /**
   * The date that this organization was dissolved.
   */
  @JsonIgnore public Collection<java.util.Date> getDissolutionDates() {
    final Object current = myData.get("dissolutionDate");
    if (current == null) return Collections.emptyList();
    if (current instanceof Collection) {
      return (Collection<java.util.Date>) current;
    }
    return Arrays.asList((java.util.Date) current);
  }
  /**
   * The date that this organization was founded.
   */
  @JsonIgnore public java.util.Date getFoundingDate() {
    return (java.util.Date) getValue("foundingDate");
  }
  /**
   * The date that this organization was founded.
   */
  @JsonIgnore public Collection<java.util.Date> getFoundingDates() {
    final Object current = myData.get("foundingDate");
    if (current == null) return Collections.emptyList();
    if (current instanceof Collection) {
      return (Collection<java.util.Date>) current;
    }
    return Arrays.asList((java.util.Date) current);
  }
  /**
   * Points-of-Sales operated by the organization or person.
   */
  @JsonIgnore public Place getHasPOS() {
    return (Place) getValue("hasPOS");
  }
  /**
   * Points-of-Sales operated by the organization or person.
   */
  @JsonIgnore public Collection<Place> getHasPOSs() {
    final Object current = myData.get("hasPOS");
    if (current == null) return Collections.emptyList();
    if (current instanceof Collection) {
      return (Collection<Place>) current;
    }
    return Arrays.asList((Place) current);
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
  /**
   * The official name of the organization, e.g. the registered company name.
   */
  @JsonIgnore public String getLegalName() {
    return (String) getValue("legalName");
  }
  /**
   * The official name of the organization, e.g. the registered company name.
   */
  @JsonIgnore public Collection<String> getLegalNames() {
    final Object current = myData.get("legalName");
    if (current == null) return Collections.emptyList();
    if (current instanceof Collection) {
      return (Collection<String>) current;
    }
    return Arrays.asList((String) current);
  }
  /**
   * The location of for example where the event is happening, an organization is located, or where an action takes place.
   */
  @JsonIgnore public SportsActivityLocation getLocation() {
    return (SportsActivityLocation) getValue("location");
  }
  /**
   * The location of for example where the event is happening, an organization is located, or where an action takes place.
   */
  @JsonIgnore public Collection<SportsActivityLocation> getLocations() {
    final Object current = myData.get("location");
    if (current == null) return Collections.emptyList();
    if (current instanceof Collection) {
      return (Collection<SportsActivityLocation>) current;
    }
    return Arrays.asList((SportsActivityLocation) current);
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
   * A pointer to products or services offered by the organization or person.
   */
  @JsonIgnore public Offer getMakesOffer() {
    return (Offer) getValue("makesOffer");
  }
  /**
   * A pointer to products or services offered by the organization or person.
   */
  @JsonIgnore public Collection<Offer> getMakesOffers() {
    final Object current = myData.get("makesOffer");
    if (current == null) return Collections.emptyList();
    if (current instanceof Collection) {
      return (Collection<Offer>) current;
    }
    return Arrays.asList((Offer) current);
  }
  /**
   * A member of an Organization or a ProgramMembership. Organizations can be members of organizations; ProgramMembership is typically for individuals.
   */
  @JsonIgnore public Organization getMemberOrganization() {
    return (Organization) getValue("member");
  }
  /**
   * A member of an Organization or a ProgramMembership. Organizations can be members of organizations; ProgramMembership is typically for individuals.
   */
  @JsonIgnore public Collection<Organization> getMemberOrganizations() {
    final Object current = myData.get("member");
    if (current == null) return Collections.emptyList();
    if (current instanceof Collection) {
      return (Collection<Organization>) current;
    }
    return Arrays.asList((Organization) current);
  }
  /**
   * A member of an Organization or a ProgramMembership. Organizations can be members of organizations; ProgramMembership is typically for individuals.
   */
  @JsonIgnore public Person getMemberPerson() {
    return (Person) getValue("member");
  }
  /**
   * A member of an Organization or a ProgramMembership. Organizations can be members of organizations; ProgramMembership is typically for individuals.
   */
  @JsonIgnore public Collection<Person> getMemberPersons() {
    final Object current = myData.get("member");
    if (current == null) return Collections.emptyList();
    if (current instanceof Collection) {
      return (Collection<Person>) current;
    }
    return Arrays.asList((Person) current);
  }
  /**
   * An Organization (or ProgramMembership) to which this Person or Organization belongs.
   */
  @JsonIgnore public Organization getMemberOfOrganization() {
    return (Organization) getValue("memberOf");
  }
  /**
   * An Organization (or ProgramMembership) to which this Person or Organization belongs.
   */
  @JsonIgnore public Collection<Organization> getMemberOfOrganizations() {
    final Object current = myData.get("memberOf");
    if (current == null) return Collections.emptyList();
    if (current instanceof Collection) {
      return (Collection<Organization>) current;
    }
    return Arrays.asList((Organization) current);
  }
  /**
   * An Organization (or ProgramMembership) to which this Person or Organization belongs.
   */
  @JsonIgnore public ProgramMembership getMemberOfProgramMembership() {
    return (ProgramMembership) getValue("memberOf");
  }
  /**
   * An Organization (or ProgramMembership) to which this Person or Organization belongs.
   */
  @JsonIgnore public Collection<ProgramMembership> getMemberOfProgramMemberships() {
    final Object current = myData.get("memberOf");
    if (current == null) return Collections.emptyList();
    if (current instanceof Collection) {
      return (Collection<ProgramMembership>) current;
    }
    return Arrays.asList((ProgramMembership) current);
  }
  /**
   * The North American Industry Classification System (NAICS) code for a particular organization or business person.
   */
  @JsonIgnore public String getNaics() {
    return (String) getValue("naics");
  }
  /**
   * The North American Industry Classification System (NAICS) code for a particular organization or business person.
   */
  @JsonIgnore public Collection<String> getNaicss() {
    final Object current = myData.get("naics");
    if (current == null) return Collections.emptyList();
    if (current instanceof Collection) {
      return (Collection<String>) current;
    }
    return Arrays.asList((String) current);
  }
  /**
   * The number of employees in an organization e.g. business.
   */
  @JsonIgnore public QuantitativeValue getNumberOfEmployees() {
    return (QuantitativeValue) getValue("numberOfEmployees");
  }
  /**
   * The number of employees in an organization e.g. business.
   */
  @JsonIgnore public Collection<QuantitativeValue> getNumberOfEmployeess() {
    final Object current = myData.get("numberOfEmployees");
    if (current == null) return Collections.emptyList();
    if (current instanceof Collection) {
      return (Collection<QuantitativeValue>) current;
    }
    return Arrays.asList((QuantitativeValue) current);
  }
  /**
   * Products owned by the organization or person.
   */
  @JsonIgnore public OwnershipInfo getOwnsOwnershipInfo() {
    return (OwnershipInfo) getValue("owns");
  }
  /**
   * Products owned by the organization or person.
   */
  @JsonIgnore public Collection<OwnershipInfo> getOwnsOwnershipInfos() {
    final Object current = myData.get("owns");
    if (current == null) return Collections.emptyList();
    if (current instanceof Collection) {
      return (Collection<OwnershipInfo>) current;
    }
    return Arrays.asList((OwnershipInfo) current);
  }
  /**
   * Products owned by the organization or person.
   */
  @JsonIgnore public Product getOwnsProduct() {
    return (Product) getValue("owns");
  }
  /**
   * Products owned by the organization or person.
   */
  @JsonIgnore public Collection<Product> getOwnsProducts() {
    final Object current = myData.get("owns");
    if (current == null) return Collections.emptyList();
    if (current instanceof Collection) {
      return (Collection<Product>) current;
    }
    return Arrays.asList((Product) current);
  }
  /**
   * The publishingPrinciples property indicates (typically via [[URL]]) a document describing the editorial principles of an [[Organization]] (or individual e.g. a [[Person]] writing a blog) that relate to their activities as a publisher, e.g. ethics or diversity policies. When applied to a [[CreativeWork]] (e.g. [[NewsArticle]]) the principles are those of the party primarily responsible for the creation of the [[CreativeWork]].
   * 
   * While such policies are most typically expressed in natural language, sometimes related information (e.g. indicating a [[funder]]) can be expressed using schema.org terminology.
   * 
   */
  @JsonIgnore public CreativeWork getPublishingPrinciplesCreativeWork() {
    return (CreativeWork) getValue("publishingPrinciples");
  }
  /**
   * The publishingPrinciples property indicates (typically via [[URL]]) a document describing the editorial principles of an [[Organization]] (or individual e.g. a [[Person]] writing a blog) that relate to their activities as a publisher, e.g. ethics or diversity policies. When applied to a [[CreativeWork]] (e.g. [[NewsArticle]]) the principles are those of the party primarily responsible for the creation of the [[CreativeWork]].
   * 
   * While such policies are most typically expressed in natural language, sometimes related information (e.g. indicating a [[funder]]) can be expressed using schema.org terminology.
   * 
   */
  @JsonIgnore public Collection<CreativeWork> getPublishingPrinciplesCreativeWorks() {
    final Object current = myData.get("publishingPrinciples");
    if (current == null) return Collections.emptyList();
    if (current instanceof Collection) {
      return (Collection<CreativeWork>) current;
    }
    return Arrays.asList((CreativeWork) current);
  }
  /**
   * The publishingPrinciples property indicates (typically via [[URL]]) a document describing the editorial principles of an [[Organization]] (or individual e.g. a [[Person]] writing a blog) that relate to their activities as a publisher, e.g. ethics or diversity policies. When applied to a [[CreativeWork]] (e.g. [[NewsArticle]]) the principles are those of the party primarily responsible for the creation of the [[CreativeWork]].
   * 
   * While such policies are most typically expressed in natural language, sometimes related information (e.g. indicating a [[funder]]) can be expressed using schema.org terminology.
   * 
   */
  @JsonIgnore public String getPublishingPrinciplesString() {
    return (String) getValue("publishingPrinciples");
  }
  /**
   * The publishingPrinciples property indicates (typically via [[URL]]) a document describing the editorial principles of an [[Organization]] (or individual e.g. a [[Person]] writing a blog) that relate to their activities as a publisher, e.g. ethics or diversity policies. When applied to a [[CreativeWork]] (e.g. [[NewsArticle]]) the principles are those of the party primarily responsible for the creation of the [[CreativeWork]].
   * 
   * While such policies are most typically expressed in natural language, sometimes related information (e.g. indicating a [[funder]]) can be expressed using schema.org terminology.
   * 
   */
  @JsonIgnore public Collection<String> getPublishingPrinciplesStrings() {
    final Object current = myData.get("publishingPrinciples");
    if (current == null) return Collections.emptyList();
    if (current instanceof Collection) {
      return (Collection<String>) current;
    }
    return Arrays.asList((String) current);
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
   * A pointer to products or services sought by the organization or person (demand).
   */
  @JsonIgnore public Demand getSeeks() {
    return (Demand) getValue("seeks");
  }
  /**
   * A pointer to products or services sought by the organization or person (demand).
   */
  @JsonIgnore public Collection<Demand> getSeekss() {
    final Object current = myData.get("seeks");
    if (current == null) return Collections.emptyList();
    if (current instanceof Collection) {
      return (Collection<Demand>) current;
    }
    return Arrays.asList((Demand) current);
  }
  /**
   * A person or organization that supports a thing through a pledge, promise, or financial contribution. e.g. a sponsor of a Medical Study or a corporate sponsor of an event.
   */
  @JsonIgnore public Funder getSponsor() {
    return (Funder) getValue("sponsor");
  }
  /**
   * A person or organization that supports a thing through a pledge, promise, or financial contribution. e.g. a sponsor of a Medical Study or a corporate sponsor of an event.
   */
  @JsonIgnore public Collection<Funder> getSponsors() {
    final Object current = myData.get("sponsor");
    if (current == null) return Collections.emptyList();
    if (current instanceof Collection) {
      return (Collection<Funder>) current;
    }
    return Arrays.asList((Funder) current);
  }
  @JsonIgnore public Funder getFunder() {
    return (Funder) getValue("funder");
  }
  @JsonIgnore public Collection<Funder> getFunders() {
    final Object current = myData.get("funder");
    if (current == null) return Collections.emptyList();
    if (current instanceof Collection) {
      return (Collection<Funder>) current;
    }
    return Arrays.asList((Funder) current);
  }
  /**
   * A relationship between two organizations where the first includes the second, e.g., as a subsidiary. See also: the more specific 'department' property.
   */
  @JsonIgnore public Organization getSubOrganization() {
    return (Organization) getValue("subOrganization");
  }
  /**
   * A relationship between two organizations where the first includes the second, e.g., as a subsidiary. See also: the more specific 'department' property.
   */
  @JsonIgnore public Collection<Organization> getSubOrganizations() {
    final Object current = myData.get("subOrganization");
    if (current == null) return Collections.emptyList();
    if (current instanceof Collection) {
      return (Collection<Organization>) current;
    }
    return Arrays.asList((Organization) current);
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
   * The Value-added Tax ID of the organization or person.
   */
  @JsonIgnore public String getVatID() {
    return (String) getValue("vatID");
  }
  /**
   * The Value-added Tax ID of the organization or person.
   */
  @JsonIgnore public Collection<String> getVatIDs() {
    final Object current = myData.get("vatID");
    if (current == null) return Collections.emptyList();
    if (current instanceof Collection) {
      return (Collection<String>) current;
    }
    return Arrays.asList((String) current);
  }
  /**
   * The place where the Organization was founded.
   */
  @JsonIgnore public Place getFoundingLocation() {
    return (Place) getValue("foundingLocation");
  }
  /**
   * The place where the Organization was founded.
   */
  @JsonIgnore public Collection<Place> getFoundingLocations() {
    final Object current = myData.get("foundingLocation");
    if (current == null) return Collections.emptyList();
    if (current instanceof Collection) {
      return (Collection<Place>) current;
    }
    return Arrays.asList((Place) current);
  }
  protected Organization(java.util.Map<String,Object> data) {
    super(data);
  }
  
  /**
   * Builder for {@link Organization}
   */
  public static class Builder extends Thing.Builder {
    public Builder(@NotNull HashMap<String,Object> data) {
      super(data);
    }
    @NotNull public Organization build() {
      return new Organization(myData);
    }
    /**
     * Indicates an OfferCatalog listing for this Organization, Person, or Service.
     */
    @NotNull public Builder hasOfferCatalog(@NotNull OfferCatalog offerCatalog) {
      putValue("hasOfferCatalog", offerCatalog);
      return this;
    }
    /**
     * Indicates an OfferCatalog listing for this Organization, Person, or Service.
     */
    @NotNull public Builder hasOfferCatalog(@NotNull OfferCatalog.Builder offerCatalog) {
      putValue("hasOfferCatalog", offerCatalog.build());
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
     * Alumni of an organization.
     */
    @NotNull public Builder alumni(@NotNull Person person) {
      putValue("alumni", person);
      return this;
    }
    /**
     * Alumni of an organization.
     */
    @NotNull public Builder alumni(@NotNull Person.Builder person) {
      putValue("alumni", person.build());
      return this;
    }
    /**
     * The geographic area where a service or offered item is provided.
     */
    @NotNull public Builder areaServed(@NotNull AvailableAtOrFrom availableAtOrFrom) {
      putValue("areaServed", availableAtOrFrom);
      return this;
    }
    /**
     * An award won by or for this item.
     */
    @NotNull public Builder award(@NotNull String award) {
      putValue("award", award);
      return this;
    }
    /**
     * The larger organization that this organization is a [[subOrganization]] of, if any.
     */
    @NotNull public Builder parentOrganization(@NotNull Organization organization) {
      putValue("parentOrganization", organization);
      return this;
    }
    /**
     * The larger organization that this organization is a [[subOrganization]] of, if any.
     */
    @NotNull public Builder parentOrganization(@NotNull Organization.Builder organization) {
      putValue("parentOrganization", organization.build());
      return this;
    }
    /**
     * The brand(s) associated with a product or service, or the brand(s) maintained by an organization or business person.
     */
    @NotNull public Builder brand(@NotNull Brand brand) {
      putValue("brand", brand);
      return this;
    }
    /**
     * The brand(s) associated with a product or service, or the brand(s) maintained by an organization or business person.
     */
    @NotNull public Builder brand(@NotNull Brand.Builder brand) {
      putValue("brand", brand.build());
      return this;
    }
    /**
     * The brand(s) associated with a product or service, or the brand(s) maintained by an organization or business person.
     */
    @NotNull public Builder brand(@NotNull Organization organization) {
      putValue("brand", organization);
      return this;
    }
    /**
     * The brand(s) associated with a product or service, or the brand(s) maintained by an organization or business person.
     */
    @NotNull public Builder brand(@NotNull Organization.Builder organization) {
      putValue("brand", organization.build());
      return this;
    }
    /**
     * A contact point for a person or organization.
     */
    @NotNull public Builder contactPoint(@NotNull ContactPoint contactPoint) {
      putValue("contactPoint", contactPoint);
      return this;
    }
    /**
     * A contact point for a person or organization.
     */
    @NotNull public Builder contactPoint(@NotNull ContactPoint.Builder contactPoint) {
      putValue("contactPoint", contactPoint.build());
      return this;
    }
    /**
     * A relationship between an organization and a department of that organization, also described as an organization (allowing different urls, logos, opening hours). For example: a store with a pharmacy, or a bakery with a cafe.
     */
    @NotNull public Builder department(@NotNull Organization organization) {
      putValue("department", organization);
      return this;
    }
    /**
     * A relationship between an organization and a department of that organization, also described as an organization (allowing different urls, logos, opening hours). For example: a store with a pharmacy, or a bakery with a cafe.
     */
    @NotNull public Builder department(@NotNull Organization.Builder organization) {
      putValue("department", organization.build());
      return this;
    }
    /**
     * Email address.
     */
    @NotNull public Builder email(@NotNull String email) {
      putValue("email", email);
      return this;
    }
    /**
     * Someone working for this organization.
     */
    @NotNull public Builder employee(@NotNull Person person) {
      putValue("employee", person);
      return this;
    }
    /**
     * Someone working for this organization.
     */
    @NotNull public Builder employee(@NotNull Person.Builder person) {
      putValue("employee", person.build());
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
     * A person who founded this organization.
     */
    @NotNull public Builder founder(@NotNull Person person) {
      putValue("founder", person);
      return this;
    }
    /**
     * A person who founded this organization.
     */
    @NotNull public Builder founder(@NotNull Person.Builder person) {
      putValue("founder", person.build());
      return this;
    }
    /**
     * The date that this organization was dissolved.
     */
    @NotNull public Builder dissolutionDate(@NotNull java.util.Date date) {
      putValue("dissolutionDate", date);
      return this;
    }
    /**
     * The date that this organization was founded.
     */
    @NotNull public Builder foundingDate(@NotNull java.util.Date date) {
      putValue("foundingDate", date);
      return this;
    }
    /**
     * Points-of-Sales operated by the organization or person.
     */
    @NotNull public Builder hasPOS(@NotNull Place place) {
      putValue("hasPOS", place);
      return this;
    }
    /**
     * Points-of-Sales operated by the organization or person.
     */
    @NotNull public Builder hasPOS(@NotNull Place.Builder place) {
      putValue("hasPOS", place.build());
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
     * The official name of the organization, e.g. the registered company name.
     */
    @NotNull public Builder legalName(@NotNull String legalName) {
      putValue("legalName", legalName);
      return this;
    }
    /**
     * The location of for example where the event is happening, an organization is located, or where an action takes place.
     */
    @NotNull public Builder location(@NotNull SportsActivityLocation sportsActivityLocation) {
      putValue("location", sportsActivityLocation);
      return this;
    }
    /**
     * The location of for example where the event is happening, an organization is located, or where an action takes place.
     */
    @NotNull public Builder location(@NotNull SportsActivityLocation.Builder sportsActivityLocation) {
      putValue("location", sportsActivityLocation.build());
      return this;
    }
    @NotNull public Builder logo(@NotNull Logo logo) {
      putValue("logo", logo);
      return this;
    }
    /**
     * A pointer to products or services offered by the organization or person.
     */
    @NotNull public Builder makesOffer(@NotNull Offer offer) {
      putValue("makesOffer", offer);
      return this;
    }
    /**
     * A pointer to products or services offered by the organization or person.
     */
    @NotNull public Builder makesOffer(@NotNull Offer.Builder offer) {
      putValue("makesOffer", offer.build());
      return this;
    }
    /**
     * A member of an Organization or a ProgramMembership. Organizations can be members of organizations; ProgramMembership is typically for individuals.
     */
    @NotNull public Builder member(@NotNull Organization organization) {
      putValue("member", organization);
      return this;
    }
    /**
     * A member of an Organization or a ProgramMembership. Organizations can be members of organizations; ProgramMembership is typically for individuals.
     */
    @NotNull public Builder member(@NotNull Organization.Builder organization) {
      putValue("member", organization.build());
      return this;
    }
    /**
     * A member of an Organization or a ProgramMembership. Organizations can be members of organizations; ProgramMembership is typically for individuals.
     */
    @NotNull public Builder member(@NotNull Person person) {
      putValue("member", person);
      return this;
    }
    /**
     * A member of an Organization or a ProgramMembership. Organizations can be members of organizations; ProgramMembership is typically for individuals.
     */
    @NotNull public Builder member(@NotNull Person.Builder person) {
      putValue("member", person.build());
      return this;
    }
    /**
     * An Organization (or ProgramMembership) to which this Person or Organization belongs.
     */
    @NotNull public Builder memberOf(@NotNull Organization organization) {
      putValue("memberOf", organization);
      return this;
    }
    /**
     * An Organization (or ProgramMembership) to which this Person or Organization belongs.
     */
    @NotNull public Builder memberOf(@NotNull Organization.Builder organization) {
      putValue("memberOf", organization.build());
      return this;
    }
    /**
     * An Organization (or ProgramMembership) to which this Person or Organization belongs.
     */
    @NotNull public Builder memberOf(@NotNull ProgramMembership programMembership) {
      putValue("memberOf", programMembership);
      return this;
    }
    /**
     * An Organization (or ProgramMembership) to which this Person or Organization belongs.
     */
    @NotNull public Builder memberOf(@NotNull ProgramMembership.Builder programMembership) {
      putValue("memberOf", programMembership.build());
      return this;
    }
    /**
     * The North American Industry Classification System (NAICS) code for a particular organization or business person.
     */
    @NotNull public Builder naics(@NotNull String naics) {
      putValue("naics", naics);
      return this;
    }
    /**
     * The number of employees in an organization e.g. business.
     */
    @NotNull public Builder numberOfEmployees(@NotNull QuantitativeValue quantitativeValue) {
      putValue("numberOfEmployees", quantitativeValue);
      return this;
    }
    /**
     * The number of employees in an organization e.g. business.
     */
    @NotNull public Builder numberOfEmployees(@NotNull QuantitativeValue.Builder quantitativeValue) {
      putValue("numberOfEmployees", quantitativeValue.build());
      return this;
    }
    /**
     * Products owned by the organization or person.
     */
    @NotNull public Builder owns(@NotNull OwnershipInfo ownershipInfo) {
      putValue("owns", ownershipInfo);
      return this;
    }
    /**
     * Products owned by the organization or person.
     */
    @NotNull public Builder owns(@NotNull OwnershipInfo.Builder ownershipInfo) {
      putValue("owns", ownershipInfo.build());
      return this;
    }
    /**
     * Products owned by the organization or person.
     */
    @NotNull public Builder owns(@NotNull Product product) {
      putValue("owns", product);
      return this;
    }
    /**
     * Products owned by the organization or person.
     */
    @NotNull public Builder owns(@NotNull Product.Builder product) {
      putValue("owns", product.build());
      return this;
    }
    /**
     * The publishingPrinciples property indicates (typically via [[URL]]) a document describing the editorial principles of an [[Organization]] (or individual e.g. a [[Person]] writing a blog) that relate to their activities as a publisher, e.g. ethics or diversity policies. When applied to a [[CreativeWork]] (e.g. [[NewsArticle]]) the principles are those of the party primarily responsible for the creation of the [[CreativeWork]].
     * 
     * While such policies are most typically expressed in natural language, sometimes related information (e.g. indicating a [[funder]]) can be expressed using schema.org terminology.
     * 
     */
    @NotNull public Builder publishingPrinciples(@NotNull CreativeWork creativeWork) {
      putValue("publishingPrinciples", creativeWork);
      return this;
    }
    /**
     * The publishingPrinciples property indicates (typically via [[URL]]) a document describing the editorial principles of an [[Organization]] (or individual e.g. a [[Person]] writing a blog) that relate to their activities as a publisher, e.g. ethics or diversity policies. When applied to a [[CreativeWork]] (e.g. [[NewsArticle]]) the principles are those of the party primarily responsible for the creation of the [[CreativeWork]].
     * 
     * While such policies are most typically expressed in natural language, sometimes related information (e.g. indicating a [[funder]]) can be expressed using schema.org terminology.
     * 
     */
    @NotNull public Builder publishingPrinciples(@NotNull CreativeWork.Builder creativeWork) {
      putValue("publishingPrinciples", creativeWork.build());
      return this;
    }
    /**
     * The publishingPrinciples property indicates (typically via [[URL]]) a document describing the editorial principles of an [[Organization]] (or individual e.g. a [[Person]] writing a blog) that relate to their activities as a publisher, e.g. ethics or diversity policies. When applied to a [[CreativeWork]] (e.g. [[NewsArticle]]) the principles are those of the party primarily responsible for the creation of the [[CreativeWork]].
     * 
     * While such policies are most typically expressed in natural language, sometimes related information (e.g. indicating a [[funder]]) can be expressed using schema.org terminology.
     * 
     */
    @NotNull public Builder publishingPrinciples(@NotNull String publishingPrinciples) {
      putValue("publishingPrinciples", publishingPrinciples);
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
     * A pointer to products or services sought by the organization or person (demand).
     */
    @NotNull public Builder seeks(@NotNull Demand demand) {
      putValue("seeks", demand);
      return this;
    }
    /**
     * A pointer to products or services sought by the organization or person (demand).
     */
    @NotNull public Builder seeks(@NotNull Demand.Builder demand) {
      putValue("seeks", demand.build());
      return this;
    }
    /**
     * A person or organization that supports a thing through a pledge, promise, or financial contribution. e.g. a sponsor of a Medical Study or a corporate sponsor of an event.
     */
    @NotNull public Builder sponsor(@NotNull Funder funder) {
      putValue("sponsor", funder);
      return this;
    }
    @NotNull public Builder funder(@NotNull Funder funder) {
      putValue("funder", funder);
      return this;
    }
    /**
     * A relationship between two organizations where the first includes the second, e.g., as a subsidiary. See also: the more specific 'department' property.
     */
    @NotNull public Builder subOrganization(@NotNull Organization organization) {
      putValue("subOrganization", organization);
      return this;
    }
    /**
     * A relationship between two organizations where the first includes the second, e.g., as a subsidiary. See also: the more specific 'department' property.
     */
    @NotNull public Builder subOrganization(@NotNull Organization.Builder organization) {
      putValue("subOrganization", organization.build());
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
     * The Value-added Tax ID of the organization or person.
     */
    @NotNull public Builder vatID(@NotNull String vatID) {
      putValue("vatID", vatID);
      return this;
    }
    /**
     * The place where the Organization was founded.
     */
    @NotNull public Builder foundingLocation(@NotNull Place place) {
      putValue("foundingLocation", place);
      return this;
    }
    /**
     * The place where the Organization was founded.
     */
    @NotNull public Builder foundingLocation(@NotNull Place.Builder place) {
      putValue("foundingLocation", place.build());
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
      if ("hasOfferCatalog".equals(key) && value instanceof OfferCatalog) { hasOfferCatalog((OfferCatalog)value); return; }
      if ("hasOfferCatalogs".equals(key) && value instanceof OfferCatalog) { hasOfferCatalog((OfferCatalog)value); return; }
      if ("address".equals(key) && value instanceof PostalAddress) { address((PostalAddress)value); return; }
      if ("addresss".equals(key) && value instanceof PostalAddress) { address((PostalAddress)value); return; }
      if ("address".equals(key) && value instanceof String) { address((String)value); return; }
      if ("addresss".equals(key) && value instanceof String) { address((String)value); return; }
      if ("aggregateRating".equals(key) && value instanceof AggregateRating) { aggregateRating((AggregateRating)value); return; }
      if ("aggregateRatings".equals(key) && value instanceof AggregateRating) { aggregateRating((AggregateRating)value); return; }
      if ("alumni".equals(key) && value instanceof Person) { alumni((Person)value); return; }
      if ("alumnis".equals(key) && value instanceof Person) { alumni((Person)value); return; }
      if ("areaServed".equals(key) && value instanceof AvailableAtOrFrom) { areaServed((AvailableAtOrFrom)value); return; }
      if ("areaServeds".equals(key) && value instanceof AvailableAtOrFrom) { areaServed((AvailableAtOrFrom)value); return; }
      if ("award".equals(key) && value instanceof String) { award((String)value); return; }
      if ("awards".equals(key) && value instanceof String) { award((String)value); return; }
      if ("parentOrganization".equals(key) && value instanceof Organization) { parentOrganization((Organization)value); return; }
      if ("parentOrganizations".equals(key) && value instanceof Organization) { parentOrganization((Organization)value); return; }
      if ("brand".equals(key) && value instanceof Brand) { brand((Brand)value); return; }
      if ("brands".equals(key) && value instanceof Brand) { brand((Brand)value); return; }
      if ("brand".equals(key) && value instanceof Organization) { brand((Organization)value); return; }
      if ("brands".equals(key) && value instanceof Organization) { brand((Organization)value); return; }
      if ("contactPoint".equals(key) && value instanceof ContactPoint) { contactPoint((ContactPoint)value); return; }
      if ("contactPoints".equals(key) && value instanceof ContactPoint) { contactPoint((ContactPoint)value); return; }
      if ("department".equals(key) && value instanceof Organization) { department((Organization)value); return; }
      if ("departments".equals(key) && value instanceof Organization) { department((Organization)value); return; }
      if ("email".equals(key) && value instanceof String) { email((String)value); return; }
      if ("emails".equals(key) && value instanceof String) { email((String)value); return; }
      if ("employee".equals(key) && value instanceof Person) { employee((Person)value); return; }
      if ("employees".equals(key) && value instanceof Person) { employee((Person)value); return; }
      if ("event".equals(key) && value instanceof Event) { event((Event)value); return; }
      if ("events".equals(key) && value instanceof Event) { event((Event)value); return; }
      if ("faxNumber".equals(key) && value instanceof String) { faxNumber((String)value); return; }
      if ("faxNumbers".equals(key) && value instanceof String) { faxNumber((String)value); return; }
      if ("founder".equals(key) && value instanceof Person) { founder((Person)value); return; }
      if ("founders".equals(key) && value instanceof Person) { founder((Person)value); return; }
      if ("dissolutionDate".equals(key) && value instanceof java.util.Date) { dissolutionDate((java.util.Date)value); return; }
      if ("dissolutionDates".equals(key) && value instanceof java.util.Date) { dissolutionDate((java.util.Date)value); return; }
      if ("foundingDate".equals(key) && value instanceof java.util.Date) { foundingDate((java.util.Date)value); return; }
      if ("foundingDates".equals(key) && value instanceof java.util.Date) { foundingDate((java.util.Date)value); return; }
      if ("hasPOS".equals(key) && value instanceof Place) { hasPOS((Place)value); return; }
      if ("hasPOSs".equals(key) && value instanceof Place) { hasPOS((Place)value); return; }
      if ("isicV4".equals(key) && value instanceof String) { isicV4((String)value); return; }
      if ("isicV4s".equals(key) && value instanceof String) { isicV4((String)value); return; }
      if ("legalName".equals(key) && value instanceof String) { legalName((String)value); return; }
      if ("legalNames".equals(key) && value instanceof String) { legalName((String)value); return; }
      if ("location".equals(key) && value instanceof SportsActivityLocation) { location((SportsActivityLocation)value); return; }
      if ("locations".equals(key) && value instanceof SportsActivityLocation) { location((SportsActivityLocation)value); return; }
      if ("logo".equals(key) && value instanceof Logo) { logo((Logo)value); return; }
      if ("logos".equals(key) && value instanceof Logo) { logo((Logo)value); return; }
      if ("makesOffer".equals(key) && value instanceof Offer) { makesOffer((Offer)value); return; }
      if ("makesOffers".equals(key) && value instanceof Offer) { makesOffer((Offer)value); return; }
      if ("member".equals(key) && value instanceof Organization) { member((Organization)value); return; }
      if ("members".equals(key) && value instanceof Organization) { member((Organization)value); return; }
      if ("member".equals(key) && value instanceof Person) { member((Person)value); return; }
      if ("members".equals(key) && value instanceof Person) { member((Person)value); return; }
      if ("memberOf".equals(key) && value instanceof Organization) { memberOf((Organization)value); return; }
      if ("memberOfs".equals(key) && value instanceof Organization) { memberOf((Organization)value); return; }
      if ("memberOf".equals(key) && value instanceof ProgramMembership) { memberOf((ProgramMembership)value); return; }
      if ("memberOfs".equals(key) && value instanceof ProgramMembership) { memberOf((ProgramMembership)value); return; }
      if ("naics".equals(key) && value instanceof String) { naics((String)value); return; }
      if ("naicss".equals(key) && value instanceof String) { naics((String)value); return; }
      if ("numberOfEmployees".equals(key) && value instanceof QuantitativeValue) { numberOfEmployees((QuantitativeValue)value); return; }
      if ("numberOfEmployeess".equals(key) && value instanceof QuantitativeValue) { numberOfEmployees((QuantitativeValue)value); return; }
      if ("owns".equals(key) && value instanceof OwnershipInfo) { owns((OwnershipInfo)value); return; }
      if ("ownss".equals(key) && value instanceof OwnershipInfo) { owns((OwnershipInfo)value); return; }
      if ("owns".equals(key) && value instanceof Product) { owns((Product)value); return; }
      if ("ownss".equals(key) && value instanceof Product) { owns((Product)value); return; }
      if ("publishingPrinciples".equals(key) && value instanceof CreativeWork) { publishingPrinciples((CreativeWork)value); return; }
      if ("publishingPrincipless".equals(key) && value instanceof CreativeWork) { publishingPrinciples((CreativeWork)value); return; }
      if ("publishingPrinciples".equals(key) && value instanceof String) { publishingPrinciples((String)value); return; }
      if ("publishingPrincipless".equals(key) && value instanceof String) { publishingPrinciples((String)value); return; }
      if ("review".equals(key) && value instanceof Review) { review((Review)value); return; }
      if ("reviews".equals(key) && value instanceof Review) { review((Review)value); return; }
      if ("slogan".equals(key) && value instanceof String) { slogan((String)value); return; }
      if ("slogans".equals(key) && value instanceof String) { slogan((String)value); return; }
      if ("seeks".equals(key) && value instanceof Demand) { seeks((Demand)value); return; }
      if ("seekss".equals(key) && value instanceof Demand) { seeks((Demand)value); return; }
      if ("sponsor".equals(key) && value instanceof Funder) { sponsor((Funder)value); return; }
      if ("sponsors".equals(key) && value instanceof Funder) { sponsor((Funder)value); return; }
      if ("funder".equals(key) && value instanceof Funder) { funder((Funder)value); return; }
      if ("funders".equals(key) && value instanceof Funder) { funder((Funder)value); return; }
      if ("subOrganization".equals(key) && value instanceof Organization) { subOrganization((Organization)value); return; }
      if ("subOrganizations".equals(key) && value instanceof Organization) { subOrganization((Organization)value); return; }
      if ("telephone".equals(key) && value instanceof String) { telephone((String)value); return; }
      if ("telephones".equals(key) && value instanceof String) { telephone((String)value); return; }
      if ("vatID".equals(key) && value instanceof String) { vatID((String)value); return; }
      if ("vatIDs".equals(key) && value instanceof String) { vatID((String)value); return; }
      if ("foundingLocation".equals(key) && value instanceof Place) { foundingLocation((Place)value); return; }
      if ("foundingLocations".equals(key) && value instanceof Place) { foundingLocation((Place)value); return; }
      super.fromMap(key, value);
    }
  }
  
}
