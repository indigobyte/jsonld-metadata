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
 * A person (alive, dead, undead, or fictional).Equivalent class: http://xmlns.com/foaf/0.1/Person
 */
public class Person extends Thing implements org.schema.Participant, Competitor, Creator, Sponsor, Actor, Recipient {
  /**
   * The publishingPrinciples property indicates (typically via [[URL]]) a document describing the editorial principles of an [[Organization]] (or individual e.g. a [[Person]] writing a blog) that relate to their activities as a publisher, e.g. ethics or diversity policies. When applied to a [[CreativeWork]] (e.g. [[NewsArticle]]) the principles are those of the party primarily responsible for the creation of the [[CreativeWork]].
   * 
   * While such policies are most typically expressed in natural language, sometimes related information (e.g. indicating a [[funder]]) can be expressed using schema.org terminology.
   * 
   */
  @JsonIgnore public PublishingPrinciples getPublishingPrinciples() {
    return (PublishingPrinciples) getValue("publishingPrinciples");
  }
  /**
   * The publishingPrinciples property indicates (typically via [[URL]]) a document describing the editorial principles of an [[Organization]] (or individual e.g. a [[Person]] writing a blog) that relate to their activities as a publisher, e.g. ethics or diversity policies. When applied to a [[CreativeWork]] (e.g. [[NewsArticle]]) the principles are those of the party primarily responsible for the creation of the [[CreativeWork]].
   * 
   * While such policies are most typically expressed in natural language, sometimes related information (e.g. indicating a [[funder]]) can be expressed using schema.org terminology.
   * 
   */
  @JsonIgnore public java.util.Collection<PublishingPrinciples> getPublishingPrincipless() {
    final java.lang.Object current = myData.get("publishingPrinciples");
    if (current == null) return Collections.emptyList();
    if (current instanceof java.util.Collection) {
      return (java.util.Collection<PublishingPrinciples>) current;
    }
    return Arrays.asList((PublishingPrinciples) current);
  }
  /**
   * Of a [[Person]], and less typically of an [[Organization]], to indicate a topic that is known about - suggesting possible expertise but not implying it. We do not distinguish skill levels here, or relate this to educational content, events, objectives or [[JobPosting]] descriptions.
   */
  @JsonIgnore public String getKnowsAboutString() {
    return (String) getValue("knowsAbout");
  }
  /**
   * Of a [[Person]], and less typically of an [[Organization]], to indicate a topic that is known about - suggesting possible expertise but not implying it. We do not distinguish skill levels here, or relate this to educational content, events, objectives or [[JobPosting]] descriptions.
   */
  @JsonIgnore public java.util.Collection<String> getKnowsAboutStrings() {
    final java.lang.Object current = myData.get("knowsAbout");
    if (current == null) return Collections.emptyList();
    if (current instanceof java.util.Collection) {
      return (java.util.Collection<String>) current;
    }
    return Arrays.asList((String) current);
  }
  /**
   * Of a [[Person]], and less typically of an [[Organization]], to indicate a topic that is known about - suggesting possible expertise but not implying it. We do not distinguish skill levels here, or relate this to educational content, events, objectives or [[JobPosting]] descriptions.
   */
  @JsonIgnore public Thing getKnowsAboutThing() {
    return (Thing) getValue("knowsAbout");
  }
  /**
   * Of a [[Person]], and less typically of an [[Organization]], to indicate a topic that is known about - suggesting possible expertise but not implying it. We do not distinguish skill levels here, or relate this to educational content, events, objectives or [[JobPosting]] descriptions.
   */
  @JsonIgnore public java.util.Collection<Thing> getKnowsAboutThings() {
    final java.lang.Object current = myData.get("knowsAbout");
    if (current == null) return Collections.emptyList();
    if (current instanceof java.util.Collection) {
      return (java.util.Collection<Thing>) current;
    }
    return Arrays.asList((Thing) current);
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
  @JsonIgnore public java.util.Collection<Demand> getSeekss() {
    final java.lang.Object current = myData.get("seeks");
    if (current == null) return Collections.emptyList();
    if (current instanceof java.util.Collection) {
      return (java.util.Collection<Demand>) current;
    }
    return Arrays.asList((Demand) current);
  }
  /**
   * A sibling of the person.
   */
  @JsonIgnore public Person getSibling() {
    return (Person) getValue("sibling");
  }
  /**
   * A sibling of the person.
   */
  @JsonIgnore public java.util.Collection<Person> getSiblings() {
    final java.lang.Object current = myData.get("sibling");
    if (current == null) return Collections.emptyList();
    if (current instanceof java.util.Collection) {
      return (java.util.Collection<Person>) current;
    }
    return Arrays.asList((Person) current);
  }
  /**
   * A [callsign](https://en.wikipedia.org/wiki/Call_sign), as used in broadcasting and radio communications to identify people, radio and TV stations, or vehicles.
   */
  @JsonIgnore public Identifier getCallSign() {
    return (Identifier) getValue("callSign");
  }
  /**
   * A [callsign](https://en.wikipedia.org/wiki/Call_sign), as used in broadcasting and radio communications to identify people, radio and TV stations, or vehicles.
   */
  @JsonIgnore public java.util.Collection<Identifier> getCallSigns() {
    final java.lang.Object current = myData.get("callSign");
    if (current == null) return Collections.emptyList();
    if (current instanceof java.util.Collection) {
      return (java.util.Collection<Identifier>) current;
    }
    return Arrays.asList((Identifier) current);
  }
  /**
   * A contact location for a person's residence.
   */
  @JsonIgnore public Location getHomeLocation() {
    return (Location) getValue("homeLocation");
  }
  /**
   * A contact location for a person's residence.
   */
  @JsonIgnore public java.util.Collection<Location> getHomeLocations() {
    final java.lang.Object current = myData.get("homeLocation");
    if (current == null) return Collections.emptyList();
    if (current instanceof java.util.Collection) {
      return (java.util.Collection<Location>) current;
    }
    return Arrays.asList((Location) current);
  }
  /**
   * The Dun &amp; Bradstreet DUNS number for identifying an organization or business person.
   */
  @JsonIgnore public Identifier getDuns() {
    return (Identifier) getValue("duns");
  }
  /**
   * The Dun &amp; Bradstreet DUNS number for identifying an organization or business person.
   */
  @JsonIgnore public java.util.Collection<Identifier> getDunss() {
    final java.lang.Object current = myData.get("duns");
    if (current == null) return Collections.emptyList();
    if (current instanceof java.util.Collection) {
      return (java.util.Collection<Identifier>) current;
    }
    return Arrays.asList((Identifier) current);
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
  @JsonIgnore public java.util.Collection<ContactPoint> getContactPoints() {
    final java.lang.Object current = myData.get("contactPoint");
    if (current == null) return Collections.emptyList();
    if (current instanceof java.util.Collection) {
      return (java.util.Collection<ContactPoint>) current;
    }
    return Arrays.asList((ContactPoint) current);
  }
  /**
   * Organizations that the person works for.
   */
  @JsonIgnore public Organization getWorksFor() {
    return (Organization) getValue("worksFor");
  }
  /**
   * Organizations that the person works for.
   */
  @JsonIgnore public java.util.Collection<Organization> getWorksFors() {
    final java.lang.Object current = myData.get("worksFor");
    if (current == null) return Collections.emptyList();
    if (current instanceof java.util.Collection) {
      return (java.util.Collection<Organization>) current;
    }
    return Arrays.asList((Organization) current);
  }
  /**
   * A contact location for a person's place of work.
   */
  @JsonIgnore public Location getWorkLocation() {
    return (Location) getValue("workLocation");
  }
  /**
   * A contact location for a person's place of work.
   */
  @JsonIgnore public java.util.Collection<Location> getWorkLocations() {
    final java.lang.Object current = myData.get("workLocation");
    if (current == null) return Collections.emptyList();
    if (current instanceof java.util.Collection) {
      return (java.util.Collection<Location>) current;
    }
    return Arrays.asList((Location) current);
  }
  /**
   * The Person's occupation. For past professions, use Role for expressing dates.
   */
  @JsonIgnore public Occupation getHasOccupation() {
    return (Occupation) getValue("hasOccupation");
  }
  /**
   * The Person's occupation. For past professions, use Role for expressing dates.
   */
  @JsonIgnore public java.util.Collection<Occupation> getHasOccupations() {
    final java.lang.Object current = myData.get("hasOccupation");
    if (current == null) return Collections.emptyList();
    if (current instanceof java.util.Collection) {
      return (java.util.Collection<Occupation>) current;
    }
    return Arrays.asList((Occupation) current);
  }
  /**
   * Given name. In the U.S., the first name of a Person.
   */
  @JsonIgnore public String getGivenName() {
    return (String) getValue("givenName");
  }
  /**
   * Given name. In the U.S., the first name of a Person.
   */
  @JsonIgnore public java.util.Collection<String> getGivenNames() {
    final java.lang.Object current = myData.get("givenName");
    if (current == null) return Collections.emptyList();
    if (current instanceof java.util.Collection) {
      return (java.util.Collection<String>) current;
    }
    return Arrays.asList((String) current);
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
  @JsonIgnore public java.util.Collection<String> getEmails() {
    final java.lang.Object current = myData.get("email");
    if (current == null) return Collections.emptyList();
    if (current instanceof java.util.Collection) {
      return (java.util.Collection<String>) current;
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
  @JsonIgnore public java.util.Collection<String> getTelephones() {
    final java.lang.Object current = myData.get("telephone");
    if (current == null) return Collections.emptyList();
    if (current instanceof java.util.Collection) {
      return (java.util.Collection<String>) current;
    }
    return Arrays.asList((String) current);
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
  @JsonIgnore public java.util.Collection<String> getIsicV4s() {
    final java.lang.Object current = myData.get("isicV4");
    if (current == null) return Collections.emptyList();
    if (current instanceof java.util.Collection) {
      return (java.util.Collection<String>) current;
    }
    return Arrays.asList((String) current);
  }
  /**
   * A credential awarded to the Person or Organization.
   */
  @JsonIgnore public EducationalOccupationalCredential getHasCredential() {
    return (EducationalOccupationalCredential) getValue("hasCredential");
  }
  /**
   * A credential awarded to the Person or Organization.
   */
  @JsonIgnore public java.util.Collection<EducationalOccupationalCredential> getHasCredentials() {
    final java.lang.Object current = myData.get("hasCredential");
    if (current == null) return Collections.emptyList();
    if (current instanceof java.util.Collection) {
      return (java.util.Collection<EducationalOccupationalCredential>) current;
    }
    return Arrays.asList((EducationalOccupationalCredential) current);
  }
  /**
   * The height of the item.
   */
  @JsonIgnore public Distance getHeightDistance() {
    return (Distance) getValue("height");
  }
  /**
   * The height of the item.
   */
  @JsonIgnore public java.util.Collection<Distance> getHeightDistances() {
    final java.lang.Object current = myData.get("height");
    if (current == null) return Collections.emptyList();
    if (current instanceof java.util.Collection) {
      return (java.util.Collection<Distance>) current;
    }
    return Arrays.asList((Distance) current);
  }
  /**
   * The height of the item.
   */
  @JsonIgnore public QuantitativeValue getHeightQuantitativeValue() {
    return (QuantitativeValue) getValue("height");
  }
  /**
   * The height of the item.
   */
  @JsonIgnore public java.util.Collection<QuantitativeValue> getHeightQuantitativeValues() {
    final java.lang.Object current = myData.get("height");
    if (current == null) return Collections.emptyList();
    if (current instanceof java.util.Collection) {
      return (java.util.Collection<QuantitativeValue>) current;
    }
    return Arrays.asList((QuantitativeValue) current);
  }
  /**
   * Family name. In the U.S., the last name of a Person.
   */
  @JsonIgnore public String getFamilyName() {
    return (String) getValue("familyName");
  }
  /**
   * Family name. In the U.S., the last name of a Person.
   */
  @JsonIgnore public java.util.Collection<String> getFamilyNames() {
    final java.lang.Object current = myData.get("familyName");
    if (current == null) return Collections.emptyList();
    if (current instanceof java.util.Collection) {
      return (java.util.Collection<String>) current;
    }
    return Arrays.asList((String) current);
  }
  /**
   * Event that this person is a performer or participant in.
   */
  @JsonIgnore public Event getPerformerIn() {
    return (Event) getValue("performerIn");
  }
  /**
   * Event that this person is a performer or participant in.
   */
  @JsonIgnore public java.util.Collection<Event> getPerformerIns() {
    final java.lang.Object current = myData.get("performerIn");
    if (current == null) return Collections.emptyList();
    if (current instanceof java.util.Collection) {
      return (java.util.Collection<Event>) current;
    }
    return Arrays.asList((Event) current);
  }
  /**
   * The Tax / Fiscal ID of the organization or person, e.g. the TIN in the US or the CIF/NIF in Spain.
   */
  @JsonIgnore public Identifier getTaxID() {
    return (Identifier) getValue("taxID");
  }
  /**
   * The Tax / Fiscal ID of the organization or person, e.g. the TIN in the US or the CIF/NIF in Spain.
   */
  @JsonIgnore public java.util.Collection<Identifier> getTaxIDs() {
    final java.lang.Object current = myData.get("taxID");
    if (current == null) return Collections.emptyList();
    if (current instanceof java.util.Collection) {
      return (java.util.Collection<Identifier>) current;
    }
    return Arrays.asList((Identifier) current);
  }
  /**
   * Of a [[Person]], and less typically of an [[Organization]], to indicate a known language. We do not distinguish skill levels or reading/writing/speaking/signing here. Use language codes from the [IETF BCP 47 standard](http://tools.ietf.org/html/bcp47).
   */
  @JsonIgnore public Language getKnowsLanguageLanguage() {
    return (Language) getValue("knowsLanguage");
  }
  /**
   * Of a [[Person]], and less typically of an [[Organization]], to indicate a known language. We do not distinguish skill levels or reading/writing/speaking/signing here. Use language codes from the [IETF BCP 47 standard](http://tools.ietf.org/html/bcp47).
   */
  @JsonIgnore public java.util.Collection<Language> getKnowsLanguageLanguages() {
    final java.lang.Object current = myData.get("knowsLanguage");
    if (current == null) return Collections.emptyList();
    if (current instanceof java.util.Collection) {
      return (java.util.Collection<Language>) current;
    }
    return Arrays.asList((Language) current);
  }
  /**
   * Of a [[Person]], and less typically of an [[Organization]], to indicate a known language. We do not distinguish skill levels or reading/writing/speaking/signing here. Use language codes from the [IETF BCP 47 standard](http://tools.ietf.org/html/bcp47).
   */
  @JsonIgnore public String getKnowsLanguageString() {
    return (String) getValue("knowsLanguage");
  }
  /**
   * Of a [[Person]], and less typically of an [[Organization]], to indicate a known language. We do not distinguish skill levels or reading/writing/speaking/signing here. Use language codes from the [IETF BCP 47 standard](http://tools.ietf.org/html/bcp47).
   */
  @JsonIgnore public java.util.Collection<String> getKnowsLanguageStrings() {
    final java.lang.Object current = myData.get("knowsLanguage");
    if (current == null) return Collections.emptyList();
    if (current instanceof java.util.Collection) {
      return (java.util.Collection<String>) current;
    }
    return Arrays.asList((String) current);
  }
  /**
   * An Organization (or ProgramMembership) to which this Person or Organization belongs.
   */
  @JsonIgnore public MemberOf getMemberOf() {
    return (MemberOf) getValue("memberOf");
  }
  /**
   * An Organization (or ProgramMembership) to which this Person or Organization belongs.
   */
  @JsonIgnore public java.util.Collection<MemberOf> getMemberOfs() {
    final java.lang.Object current = myData.get("memberOf");
    if (current == null) return Collections.emptyList();
    if (current instanceof java.util.Collection) {
      return (java.util.Collection<MemberOf>) current;
    }
    return Arrays.asList((MemberOf) current);
  }
  /**
   * An organization that this person is affiliated with. For example, a school/university, a club, or a team.
   */
  @JsonIgnore public MemberOf getAffiliation() {
    return (MemberOf) getValue("affiliation");
  }
  /**
   * An organization that this person is affiliated with. For example, a school/university, a club, or a team.
   */
  @JsonIgnore public java.util.Collection<MemberOf> getAffiliations() {
    final java.lang.Object current = myData.get("affiliation");
    if (current == null) return Collections.emptyList();
    if (current instanceof java.util.Collection) {
      return (java.util.Collection<MemberOf>) current;
    }
    return Arrays.asList((MemberOf) current);
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
  @JsonIgnore public java.util.Collection<Brand> getBrandBrands() {
    final java.lang.Object current = myData.get("brand");
    if (current == null) return Collections.emptyList();
    if (current instanceof java.util.Collection) {
      return (java.util.Collection<Brand>) current;
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
  @JsonIgnore public java.util.Collection<Organization> getBrandOrganizations() {
    final java.lang.Object current = myData.get("brand");
    if (current == null) return Collections.emptyList();
    if (current instanceof java.util.Collection) {
      return (java.util.Collection<Organization>) current;
    }
    return Arrays.asList((Organization) current);
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
  @JsonIgnore public java.util.Collection<String> getVatIDs() {
    final java.lang.Object current = myData.get("vatID");
    if (current == null) return Collections.emptyList();
    if (current instanceof java.util.Collection) {
      return (java.util.Collection<String>) current;
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
   */
  @JsonIgnore public String getAddressString() {
    return (String) getValue("address");
  }
  /**
   * Physical address of the item.
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
   * Nationality of the person.
   */
  @JsonIgnore public Country getNationality() {
    return (Country) getValue("nationality");
  }
  /**
   * Nationality of the person.
   */
  @JsonIgnore public java.util.Collection<Country> getNationalitys() {
    final java.lang.Object current = myData.get("nationality");
    if (current == null) return Collections.emptyList();
    if (current instanceof java.util.Collection) {
      return (java.util.Collection<Country>) current;
    }
    return Arrays.asList((Country) current);
  }
  /**
   * Date of birth.
   */
  @JsonIgnore public java.util.Date getBirthDate() {
    return (java.util.Date) getValue("birthDate");
  }
  /**
   * Date of birth.
   */
  @JsonIgnore public java.util.Collection<java.util.Date> getBirthDates() {
    final java.lang.Object current = myData.get("birthDate");
    if (current == null) return Collections.emptyList();
    if (current instanceof java.util.Collection) {
      return (java.util.Collection<java.util.Date>) current;
    }
    return Arrays.asList((java.util.Date) current);
  }
  /**
   * The job title of the person (for example, Financial Manager).
   */
  @JsonIgnore public DefinedTerm getJobTitleDefinedTerm() {
    return (DefinedTerm) getValue("jobTitle");
  }
  /**
   * The job title of the person (for example, Financial Manager).
   */
  @JsonIgnore public java.util.Collection<DefinedTerm> getJobTitleDefinedTerms() {
    final java.lang.Object current = myData.get("jobTitle");
    if (current == null) return Collections.emptyList();
    if (current instanceof java.util.Collection) {
      return (java.util.Collection<DefinedTerm>) current;
    }
    return Arrays.asList((DefinedTerm) current);
  }
  /**
   * The job title of the person (for example, Financial Manager).
   */
  @JsonIgnore public String getJobTitleString() {
    return (String) getValue("jobTitle");
  }
  /**
   * The job title of the person (for example, Financial Manager).
   */
  @JsonIgnore public java.util.Collection<String> getJobTitleStrings() {
    final java.lang.Object current = myData.get("jobTitle");
    if (current == null) return Collections.emptyList();
    if (current instanceof java.util.Collection) {
      return (java.util.Collection<String>) current;
    }
    return Arrays.asList((String) current);
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
  @JsonIgnore public java.util.Collection<OwnershipInfo> getOwnsOwnershipInfos() {
    final java.lang.Object current = myData.get("owns");
    if (current == null) return Collections.emptyList();
    if (current instanceof java.util.Collection) {
      return (java.util.Collection<OwnershipInfo>) current;
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
  @JsonIgnore public java.util.Collection<Product> getOwnsProducts() {
    final java.lang.Object current = myData.get("owns");
    if (current == null) return Collections.emptyList();
    if (current instanceof java.util.Collection) {
      return (java.util.Collection<Product>) current;
    }
    return Arrays.asList((Product) current);
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
  @JsonIgnore public java.util.Collection<String> getNaicss() {
    final java.lang.Object current = myData.get("naics");
    if (current == null) return Collections.emptyList();
    if (current instanceof java.util.Collection) {
      return (java.util.Collection<String>) current;
    }
    return Arrays.asList((String) current);
  }
  /**
   * The most generic uni-directional social relation.
   */
  @JsonIgnore public Person getFollows() {
    return (Person) getValue("follows");
  }
  /**
   * The most generic uni-directional social relation.
   */
  @JsonIgnore public java.util.Collection<Person> getFollowss() {
    final java.lang.Object current = myData.get("follows");
    if (current == null) return Collections.emptyList();
    if (current instanceof java.util.Collection) {
      return (java.util.Collection<Person>) current;
    }
    return Arrays.asList((Person) current);
  }
  /**
   * Gender of something, typically a [[Person]], but possibly also fictional characters, animals, etc. While http://schema.org/Male and http://schema.org/Female may be used, text strings are also acceptable for people who do not identify as a binary gender. The [[gender]] property can also be used in an extended sense to cover e.g. the gender of sports teams. As with the gender of individuals, we do not try to enumerate all possibilities. A mixed-gender [[SportsTeam]] can be indicated with a text value of &quot;Mixed&quot;.
   */
  @JsonIgnore public GenderType getGenderGenderType() {
    return (GenderType) getValue("gender");
  }
  /**
   * Gender of something, typically a [[Person]], but possibly also fictional characters, animals, etc. While http://schema.org/Male and http://schema.org/Female may be used, text strings are also acceptable for people who do not identify as a binary gender. The [[gender]] property can also be used in an extended sense to cover e.g. the gender of sports teams. As with the gender of individuals, we do not try to enumerate all possibilities. A mixed-gender [[SportsTeam]] can be indicated with a text value of &quot;Mixed&quot;.
   */
  @JsonIgnore public java.util.Collection<GenderType> getGenderGenderTypes() {
    final java.lang.Object current = myData.get("gender");
    if (current == null) return Collections.emptyList();
    if (current instanceof java.util.Collection) {
      return (java.util.Collection<GenderType>) current;
    }
    return Arrays.asList((GenderType) current);
  }
  /**
   * Gender of something, typically a [[Person]], but possibly also fictional characters, animals, etc. While http://schema.org/Male and http://schema.org/Female may be used, text strings are also acceptable for people who do not identify as a binary gender. The [[gender]] property can also be used in an extended sense to cover e.g. the gender of sports teams. As with the gender of individuals, we do not try to enumerate all possibilities. A mixed-gender [[SportsTeam]] can be indicated with a text value of &quot;Mixed&quot;.
   */
  @JsonIgnore public String getGenderString() {
    return (String) getValue("gender");
  }
  /**
   * Gender of something, typically a [[Person]], but possibly also fictional characters, animals, etc. While http://schema.org/Male and http://schema.org/Female may be used, text strings are also acceptable for people who do not identify as a binary gender. The [[gender]] property can also be used in an extended sense to cover e.g. the gender of sports teams. As with the gender of individuals, we do not try to enumerate all possibilities. A mixed-gender [[SportsTeam]] can be indicated with a text value of &quot;Mixed&quot;.
   */
  @JsonIgnore public java.util.Collection<String> getGenderStrings() {
    final java.lang.Object current = myData.get("gender");
    if (current == null) return Collections.emptyList();
    if (current instanceof java.util.Collection) {
      return (java.util.Collection<String>) current;
    }
    return Arrays.asList((String) current);
  }
  /**
   * Indicates an OfferCatalog listing for this Organization, Person, or Service.
   */
  @JsonIgnore public OfferCatalog getHasOfferCatalog() {
    return (OfferCatalog) getValue("hasOfferCatalog");
  }
  /**
   * Indicates an OfferCatalog listing for this Organization, Person, or Service.
   */
  @JsonIgnore public java.util.Collection<OfferCatalog> getHasOfferCatalogs() {
    final java.lang.Object current = myData.get("hasOfferCatalog");
    if (current == null) return Collections.emptyList();
    if (current instanceof java.util.Collection) {
      return (java.util.Collection<OfferCatalog>) current;
    }
    return Arrays.asList((OfferCatalog) current);
  }
  /**
   * The most generic familial relation.
   */
  @JsonIgnore public Person getRelatedTo() {
    return (Person) getValue("relatedTo");
  }
  /**
   * The most generic familial relation.
   */
  @JsonIgnore public java.util.Collection<Person> getRelatedTos() {
    final java.lang.Object current = myData.get("relatedTo");
    if (current == null) return Collections.emptyList();
    if (current instanceof java.util.Collection) {
      return (java.util.Collection<Person>) current;
    }
    return Arrays.asList((Person) current);
  }
  /**
   * An honorific suffix following a Person's name such as M.D. /PhD/MSCSW.
   */
  @JsonIgnore public String getHonorificSuffix() {
    return (String) getValue("honorificSuffix");
  }
  /**
   * An honorific suffix following a Person's name such as M.D. /PhD/MSCSW.
   */
  @JsonIgnore public java.util.Collection<String> getHonorificSuffixs() {
    final java.lang.Object current = myData.get("honorificSuffix");
    if (current == null) return Collections.emptyList();
    if (current instanceof java.util.Collection) {
      return (java.util.Collection<String>) current;
    }
    return Arrays.asList((String) current);
  }
  /**
   * The place where the person was born.
   */
  @JsonIgnore public Place getBirthPlace() {
    return (Place) getValue("birthPlace");
  }
  /**
   * The place where the person was born.
   */
  @JsonIgnore public java.util.Collection<Place> getBirthPlaces() {
    final java.lang.Object current = myData.get("birthPlace");
    if (current == null) return Collections.emptyList();
    if (current instanceof java.util.Collection) {
      return (java.util.Collection<Place>) current;
    }
    return Arrays.asList((Place) current);
  }
  /**
   * The [Global Location Number](http://www.gs1.org/gln) (GLN, sometimes also referred to as International Location Number or ILN) of the respective organization, person, or place. The GLN is a 13-digit number used to identify parties and physical locations.
   */
  @JsonIgnore public Identifier getGlobalLocationNumber() {
    return (Identifier) getValue("globalLocationNumber");
  }
  /**
   * The [Global Location Number](http://www.gs1.org/gln) (GLN, sometimes also referred to as International Location Number or ILN) of the respective organization, person, or place. The GLN is a 13-digit number used to identify parties and physical locations.
   */
  @JsonIgnore public java.util.Collection<Identifier> getGlobalLocationNumbers() {
    final java.lang.Object current = myData.get("globalLocationNumber");
    if (current == null) return Collections.emptyList();
    if (current instanceof java.util.Collection) {
      return (java.util.Collection<Identifier>) current;
    }
    return Arrays.asList((Identifier) current);
  }
  /**
   * A person or organization that supports (sponsors) something through some kind of financial contribution.
   */
  @JsonIgnore public Sponsor getFunder() {
    return (Sponsor) getValue("funder");
  }
  /**
   * A person or organization that supports (sponsors) something through some kind of financial contribution.
   */
  @JsonIgnore public java.util.Collection<Sponsor> getFunders() {
    final java.lang.Object current = myData.get("funder");
    if (current == null) return Collections.emptyList();
    if (current instanceof java.util.Collection) {
      return (java.util.Collection<Sponsor>) current;
    }
    return Arrays.asList((Sponsor) current);
  }
  /**
   * A person or organization that supports a thing through a pledge, promise, or financial contribution. e.g. a sponsor of a Medical Study or a corporate sponsor of an event.
   */
  @JsonIgnore public Sponsor getSponsor() {
    return (Sponsor) getValue("sponsor");
  }
  /**
   * A person or organization that supports a thing through a pledge, promise, or financial contribution. e.g. a sponsor of a Medical Study or a corporate sponsor of an event.
   */
  @JsonIgnore public java.util.Collection<Sponsor> getSponsors() {
    final java.lang.Object current = myData.get("sponsor");
    if (current == null) return Collections.emptyList();
    if (current instanceof java.util.Collection) {
      return (java.util.Collection<Sponsor>) current;
    }
    return Arrays.asList((Sponsor) current);
  }
  /**
   * The number of interactions for the CreativeWork using the WebSite or SoftwareApplication. The most specific child type of InteractionCounter should be used.
   */
  @JsonIgnore public InteractionCounter getInteractionStatistic() {
    return (InteractionCounter) getValue("interactionStatistic");
  }
  /**
   * The number of interactions for the CreativeWork using the WebSite or SoftwareApplication. The most specific child type of InteractionCounter should be used.
   */
  @JsonIgnore public java.util.Collection<InteractionCounter> getInteractionStatistics() {
    final java.lang.Object current = myData.get("interactionStatistic");
    if (current == null) return Collections.emptyList();
    if (current instanceof java.util.Collection) {
      return (java.util.Collection<InteractionCounter>) current;
    }
    return Arrays.asList((InteractionCounter) current);
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
  @JsonIgnore public java.util.Collection<String> getFaxNumbers() {
    final java.lang.Object current = myData.get("faxNumber");
    if (current == null) return Collections.emptyList();
    if (current instanceof java.util.Collection) {
      return (java.util.Collection<String>) current;
    }
    return Arrays.asList((String) current);
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
  @JsonIgnore public java.util.Collection<String> getAwards() {
    final java.lang.Object current = myData.get("award");
    if (current == null) return Collections.emptyList();
    if (current instanceof java.util.Collection) {
      return (java.util.Collection<String>) current;
    }
    return Arrays.asList((String) current);
  }
  /**
   * A parent of this person.
   */
  @JsonIgnore public Person getParent() {
    return (Person) getValue("parent");
  }
  /**
   * A parent of this person.
   */
  @JsonIgnore public java.util.Collection<Person> getParents() {
    final java.lang.Object current = myData.get("parent");
    if (current == null) return Collections.emptyList();
    if (current instanceof java.util.Collection) {
      return (java.util.Collection<Person>) current;
    }
    return Arrays.asList((Person) current);
  }
  /**
   * An additional name for a Person, can be used for a middle name.
   */
  @JsonIgnore public String getAdditionalName() {
    return (String) getValue("additionalName");
  }
  /**
   * An additional name for a Person, can be used for a middle name.
   */
  @JsonIgnore public java.util.Collection<String> getAdditionalNames() {
    final java.lang.Object current = myData.get("additionalName");
    if (current == null) return Collections.emptyList();
    if (current instanceof java.util.Collection) {
      return (java.util.Collection<String>) current;
    }
    return Arrays.asList((String) current);
  }
  /**
   * The weight of the product or person.
   */
  @JsonIgnore public QuantitativeValue getWeight() {
    return (QuantitativeValue) getValue("weight");
  }
  /**
   * The weight of the product or person.
   */
  @JsonIgnore public java.util.Collection<QuantitativeValue> getWeights() {
    final java.lang.Object current = myData.get("weight");
    if (current == null) return Collections.emptyList();
    if (current instanceof java.util.Collection) {
      return (java.util.Collection<QuantitativeValue>) current;
    }
    return Arrays.asList((QuantitativeValue) current);
  }
  /**
   * A colleague of the person.
   */
  @JsonIgnore public Person getColleaguePerson() {
    return (Person) getValue("colleague");
  }
  /**
   * A colleague of the person.
   */
  @JsonIgnore public java.util.Collection<Person> getColleaguePersons() {
    final java.lang.Object current = myData.get("colleague");
    if (current == null) return Collections.emptyList();
    if (current instanceof java.util.Collection) {
      return (java.util.Collection<Person>) current;
    }
    return Arrays.asList((Person) current);
  }
  /**
   * A colleague of the person.
   */
  @JsonIgnore public String getColleagueString() {
    return (String) getValue("colleague");
  }
  /**
   * A colleague of the person.
   */
  @JsonIgnore public java.util.Collection<String> getColleagueStrings() {
    final java.lang.Object current = myData.get("colleague");
    if (current == null) return Collections.emptyList();
    if (current instanceof java.util.Collection) {
      return (java.util.Collection<String>) current;
    }
    return Arrays.asList((String) current);
  }
  /**
   * A child of the person.
   */
  @JsonIgnore public Person getChildren() {
    return (Person) getValue("children");
  }
  /**
   * A child of the person.
   */
  @JsonIgnore public java.util.Collection<Person> getChildrens() {
    final java.lang.Object current = myData.get("children");
    if (current == null) return Collections.emptyList();
    if (current instanceof java.util.Collection) {
      return (java.util.Collection<Person>) current;
    }
    return Arrays.asList((Person) current);
  }
  /**
   * The most generic bi-directional social/work relation.
   */
  @JsonIgnore public Person getKnows() {
    return (Person) getValue("knows");
  }
  /**
   * The most generic bi-directional social/work relation.
   */
  @JsonIgnore public java.util.Collection<Person> getKnowss() {
    final java.lang.Object current = myData.get("knows");
    if (current == null) return Collections.emptyList();
    if (current instanceof java.util.Collection) {
      return (java.util.Collection<Person>) current;
    }
    return Arrays.asList((Person) current);
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
  @JsonIgnore public java.util.Collection<Place> getHasPOSs() {
    final java.lang.Object current = myData.get("hasPOS");
    if (current == null) return Collections.emptyList();
    if (current instanceof java.util.Collection) {
      return (java.util.Collection<Place>) current;
    }
    return Arrays.asList((Place) current);
  }
  /**
   * The place where the person died.
   */
  @JsonIgnore public Place getDeathPlace() {
    return (Place) getValue("deathPlace");
  }
  /**
   * The place where the person died.
   */
  @JsonIgnore public java.util.Collection<Place> getDeathPlaces() {
    final java.lang.Object current = myData.get("deathPlace");
    if (current == null) return Collections.emptyList();
    if (current instanceof java.util.Collection) {
      return (java.util.Collection<Place>) current;
    }
    return Arrays.asList((Place) current);
  }
  /**
   * The total financial value of the person as calculated by subtracting assets from liabilities.
   */
  @JsonIgnore public MonetaryAmount getNetWorthMonetaryAmount() {
    return (MonetaryAmount) getValue("netWorth");
  }
  /**
   * The total financial value of the person as calculated by subtracting assets from liabilities.
   */
  @JsonIgnore public java.util.Collection<MonetaryAmount> getNetWorthMonetaryAmounts() {
    final java.lang.Object current = myData.get("netWorth");
    if (current == null) return Collections.emptyList();
    if (current instanceof java.util.Collection) {
      return (java.util.Collection<MonetaryAmount>) current;
    }
    return Arrays.asList((MonetaryAmount) current);
  }
  /**
   * The total financial value of the person as calculated by subtracting assets from liabilities.
   */
  @JsonIgnore public PriceSpecification getNetWorthPriceSpecification() {
    return (PriceSpecification) getValue("netWorth");
  }
  /**
   * The total financial value of the person as calculated by subtracting assets from liabilities.
   */
  @JsonIgnore public java.util.Collection<PriceSpecification> getNetWorthPriceSpecifications() {
    final java.lang.Object current = myData.get("netWorth");
    if (current == null) return Collections.emptyList();
    if (current instanceof java.util.Collection) {
      return (java.util.Collection<PriceSpecification>) current;
    }
    return Arrays.asList((PriceSpecification) current);
  }
  /**
   * An honorific prefix preceding a Person's name such as Dr/Mrs/Mr.
   */
  @JsonIgnore public String getHonorificPrefix() {
    return (String) getValue("honorificPrefix");
  }
  /**
   * An honorific prefix preceding a Person's name such as Dr/Mrs/Mr.
   */
  @JsonIgnore public java.util.Collection<String> getHonorificPrefixs() {
    final java.lang.Object current = myData.get("honorificPrefix");
    if (current == null) return Collections.emptyList();
    if (current instanceof java.util.Collection) {
      return (java.util.Collection<String>) current;
    }
    return Arrays.asList((String) current);
  }
  /**
   * The person's spouse.
   */
  @JsonIgnore public Person getSpouse() {
    return (Person) getValue("spouse");
  }
  /**
   * The person's spouse.
   */
  @JsonIgnore public java.util.Collection<Person> getSpouses() {
    final java.lang.Object current = myData.get("spouse");
    if (current == null) return Collections.emptyList();
    if (current instanceof java.util.Collection) {
      return (java.util.Collection<Person>) current;
    }
    return Arrays.asList((Person) current);
  }
  /**
   * Date of death.
   */
  @JsonIgnore public java.util.Date getDeathDate() {
    return (java.util.Date) getValue("deathDate");
  }
  /**
   * Date of death.
   */
  @JsonIgnore public java.util.Collection<java.util.Date> getDeathDates() {
    final java.lang.Object current = myData.get("deathDate");
    if (current == null) return Collections.emptyList();
    if (current instanceof java.util.Collection) {
      return (java.util.Collection<java.util.Date>) current;
    }
    return Arrays.asList((java.util.Date) current);
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
  @JsonIgnore public java.util.Collection<Offer> getMakesOffers() {
    final java.lang.Object current = myData.get("makesOffer");
    if (current == null) return Collections.emptyList();
    if (current instanceof java.util.Collection) {
      return (java.util.Collection<Offer>) current;
    }
    return Arrays.asList((Offer) current);
  }
  /**
   * An organization that the person is an alumni of.
   */
  @JsonIgnore public EducationalOrganization getAlumniOfEducationalOrganization() {
    return (EducationalOrganization) getValue("alumniOf");
  }
  /**
   * An organization that the person is an alumni of.
   */
  @JsonIgnore public java.util.Collection<EducationalOrganization> getAlumniOfEducationalOrganizations() {
    final java.lang.Object current = myData.get("alumniOf");
    if (current == null) return Collections.emptyList();
    if (current instanceof java.util.Collection) {
      return (java.util.Collection<EducationalOrganization>) current;
    }
    return Arrays.asList((EducationalOrganization) current);
  }
  /**
   * An organization that the person is an alumni of.
   */
  @JsonIgnore public Organization getAlumniOfOrganization() {
    return (Organization) getValue("alumniOf");
  }
  /**
   * An organization that the person is an alumni of.
   */
  @JsonIgnore public java.util.Collection<Organization> getAlumniOfOrganizations() {
    final java.lang.Object current = myData.get("alumniOf");
    if (current == null) return Collections.emptyList();
    if (current instanceof java.util.Collection) {
      return (java.util.Collection<Organization>) current;
    }
    return Arrays.asList((Organization) current);
  }
  protected Person(java.util.Map<String,java.lang.Object> data) {
    super(data);
  }
  
  /**
   * Builder for {@link Person}
   */
  public static class Builder extends Thing.Builder {
    public Builder(@NotNull HashMap<String,java.lang.Object> data) {
      super(data);
    }
    @NotNull public Person build() {
      return new Person(myData);
    }
    /**
     * The publishingPrinciples property indicates (typically via [[URL]]) a document describing the editorial principles of an [[Organization]] (or individual e.g. a [[Person]] writing a blog) that relate to their activities as a publisher, e.g. ethics or diversity policies. When applied to a [[CreativeWork]] (e.g. [[NewsArticle]]) the principles are those of the party primarily responsible for the creation of the [[CreativeWork]].
     * 
     * While such policies are most typically expressed in natural language, sometimes related information (e.g. indicating a [[funder]]) can be expressed using schema.org terminology.
     * 
     */
    @NotNull public Builder publishingPrinciples(@NotNull PublishingPrinciples publishingPrinciples) {
      putValue("publishingPrinciples", publishingPrinciples);
      return this;
    }
    /**
     * Of a [[Person]], and less typically of an [[Organization]], to indicate a topic that is known about - suggesting possible expertise but not implying it. We do not distinguish skill levels here, or relate this to educational content, events, objectives or [[JobPosting]] descriptions.
     */
    @NotNull public Builder knowsAbout(@NotNull String knowsAbout) {
      putValue("knowsAbout", knowsAbout);
      return this;
    }
    /**
     * Of a [[Person]], and less typically of an [[Organization]], to indicate a topic that is known about - suggesting possible expertise but not implying it. We do not distinguish skill levels here, or relate this to educational content, events, objectives or [[JobPosting]] descriptions.
     */
    @NotNull public Builder knowsAbout(@NotNull Thing thing) {
      putValue("knowsAbout", thing);
      return this;
    }
    /**
     * Of a [[Person]], and less typically of an [[Organization]], to indicate a topic that is known about - suggesting possible expertise but not implying it. We do not distinguish skill levels here, or relate this to educational content, events, objectives or [[JobPosting]] descriptions.
     */
    @NotNull public Builder knowsAbout(@NotNull Thing.Builder thing) {
      putValue("knowsAbout", thing.build());
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
     * A sibling of the person.
     */
    @NotNull public Builder sibling(@NotNull Person person) {
      putValue("sibling", person);
      return this;
    }
    /**
     * A sibling of the person.
     */
    @NotNull public Builder sibling(@NotNull Person.Builder person) {
      putValue("sibling", person.build());
      return this;
    }
    /**
     * A [callsign](https://en.wikipedia.org/wiki/Call_sign), as used in broadcasting and radio communications to identify people, radio and TV stations, or vehicles.
     */
    @NotNull public Builder callSign(@NotNull Identifier identifier) {
      putValue("callSign", identifier);
      return this;
    }
    /**
     * A contact location for a person's residence.
     */
    @NotNull public Builder homeLocation(@NotNull Location location) {
      putValue("homeLocation", location);
      return this;
    }
    /**
     * The Dun &amp; Bradstreet DUNS number for identifying an organization or business person.
     */
    @NotNull public Builder duns(@NotNull Identifier identifier) {
      putValue("duns", identifier);
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
     * Organizations that the person works for.
     */
    @NotNull public Builder worksFor(@NotNull Organization organization) {
      putValue("worksFor", organization);
      return this;
    }
    /**
     * Organizations that the person works for.
     */
    @NotNull public Builder worksFor(@NotNull Organization.Builder organization) {
      putValue("worksFor", organization.build());
      return this;
    }
    /**
     * A contact location for a person's place of work.
     */
    @NotNull public Builder workLocation(@NotNull Location location) {
      putValue("workLocation", location);
      return this;
    }
    /**
     * The Person's occupation. For past professions, use Role for expressing dates.
     */
    @NotNull public Builder hasOccupation(@NotNull Occupation occupation) {
      putValue("hasOccupation", occupation);
      return this;
    }
    /**
     * The Person's occupation. For past professions, use Role for expressing dates.
     */
    @NotNull public Builder hasOccupation(@NotNull Occupation.Builder occupation) {
      putValue("hasOccupation", occupation.build());
      return this;
    }
    /**
     * Given name. In the U.S., the first name of a Person.
     */
    @NotNull public Builder givenName(@NotNull String givenName) {
      putValue("givenName", givenName);
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
     * The telephone number.
     */
    @NotNull public Builder telephone(@NotNull String telephone) {
      putValue("telephone", telephone);
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
     * A credential awarded to the Person or Organization.
     */
    @NotNull public Builder hasCredential(@NotNull EducationalOccupationalCredential educationalOccupationalCredential) {
      putValue("hasCredential", educationalOccupationalCredential);
      return this;
    }
    /**
     * A credential awarded to the Person or Organization.
     */
    @NotNull public Builder hasCredential(@NotNull EducationalOccupationalCredential.Builder educationalOccupationalCredential) {
      putValue("hasCredential", educationalOccupationalCredential.build());
      return this;
    }
    /**
     * The height of the item.
     */
    @NotNull public Builder height(@NotNull Distance distance) {
      putValue("height", distance);
      return this;
    }
    /**
     * The height of the item.
     */
    @NotNull public Builder height(@NotNull Distance.Builder distance) {
      putValue("height", distance.build());
      return this;
    }
    /**
     * The height of the item.
     */
    @NotNull public Builder height(@NotNull QuantitativeValue quantitativeValue) {
      putValue("height", quantitativeValue);
      return this;
    }
    /**
     * The height of the item.
     */
    @NotNull public Builder height(@NotNull QuantitativeValue.Builder quantitativeValue) {
      putValue("height", quantitativeValue.build());
      return this;
    }
    /**
     * Family name. In the U.S., the last name of a Person.
     */
    @NotNull public Builder familyName(@NotNull String familyName) {
      putValue("familyName", familyName);
      return this;
    }
    /**
     * Event that this person is a performer or participant in.
     */
    @NotNull public Builder performerIn(@NotNull Event event) {
      putValue("performerIn", event);
      return this;
    }
    /**
     * Event that this person is a performer or participant in.
     */
    @NotNull public Builder performerIn(@NotNull Event.Builder event) {
      putValue("performerIn", event.build());
      return this;
    }
    /**
     * The Tax / Fiscal ID of the organization or person, e.g. the TIN in the US or the CIF/NIF in Spain.
     */
    @NotNull public Builder taxID(@NotNull Identifier identifier) {
      putValue("taxID", identifier);
      return this;
    }
    /**
     * Of a [[Person]], and less typically of an [[Organization]], to indicate a known language. We do not distinguish skill levels or reading/writing/speaking/signing here. Use language codes from the [IETF BCP 47 standard](http://tools.ietf.org/html/bcp47).
     */
    @NotNull public Builder knowsLanguage(@NotNull Language language) {
      putValue("knowsLanguage", language);
      return this;
    }
    /**
     * Of a [[Person]], and less typically of an [[Organization]], to indicate a known language. We do not distinguish skill levels or reading/writing/speaking/signing here. Use language codes from the [IETF BCP 47 standard](http://tools.ietf.org/html/bcp47).
     */
    @NotNull public Builder knowsLanguage(@NotNull Language.Builder language) {
      putValue("knowsLanguage", language.build());
      return this;
    }
    /**
     * Of a [[Person]], and less typically of an [[Organization]], to indicate a known language. We do not distinguish skill levels or reading/writing/speaking/signing here. Use language codes from the [IETF BCP 47 standard](http://tools.ietf.org/html/bcp47).
     */
    @NotNull public Builder knowsLanguage(@NotNull String knowsLanguage) {
      putValue("knowsLanguage", knowsLanguage);
      return this;
    }
    /**
     * An Organization (or ProgramMembership) to which this Person or Organization belongs.
     */
    @NotNull public Builder memberOf(@NotNull MemberOf memberOf) {
      putValue("memberOf", memberOf);
      return this;
    }
    /**
     * An organization that this person is affiliated with. For example, a school/university, a club, or a team.
     */
    @NotNull public Builder affiliation(@NotNull MemberOf memberOf) {
      putValue("affiliation", memberOf);
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
     * The Value-added Tax ID of the organization or person.
     */
    @NotNull public Builder vatID(@NotNull String vatID) {
      putValue("vatID", vatID);
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
     * Nationality of the person.
     */
    @NotNull public Builder nationality(@NotNull Country country) {
      putValue("nationality", country);
      return this;
    }
    /**
     * Nationality of the person.
     */
    @NotNull public Builder nationality(@NotNull Country.Builder country) {
      putValue("nationality", country.build());
      return this;
    }
    /**
     * Date of birth.
     */
    @NotNull public Builder birthDate(@NotNull java.util.Date date) {
      putValue("birthDate", date);
      return this;
    }
    /**
     * The job title of the person (for example, Financial Manager).
     */
    @NotNull public Builder jobTitle(@NotNull DefinedTerm definedTerm) {
      putValue("jobTitle", definedTerm);
      return this;
    }
    /**
     * The job title of the person (for example, Financial Manager).
     */
    @NotNull public Builder jobTitle(@NotNull DefinedTerm.Builder definedTerm) {
      putValue("jobTitle", definedTerm.build());
      return this;
    }
    /**
     * The job title of the person (for example, Financial Manager).
     */
    @NotNull public Builder jobTitle(@NotNull String jobTitle) {
      putValue("jobTitle", jobTitle);
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
     * The North American Industry Classification System (NAICS) code for a particular organization or business person.
     */
    @NotNull public Builder naics(@NotNull String naics) {
      putValue("naics", naics);
      return this;
    }
    /**
     * The most generic uni-directional social relation.
     */
    @NotNull public Builder follows(@NotNull Person person) {
      putValue("follows", person);
      return this;
    }
    /**
     * The most generic uni-directional social relation.
     */
    @NotNull public Builder follows(@NotNull Person.Builder person) {
      putValue("follows", person.build());
      return this;
    }
    /**
     * Gender of something, typically a [[Person]], but possibly also fictional characters, animals, etc. While http://schema.org/Male and http://schema.org/Female may be used, text strings are also acceptable for people who do not identify as a binary gender. The [[gender]] property can also be used in an extended sense to cover e.g. the gender of sports teams. As with the gender of individuals, we do not try to enumerate all possibilities. A mixed-gender [[SportsTeam]] can be indicated with a text value of &quot;Mixed&quot;.
     */
    @NotNull public Builder gender(@NotNull GenderType genderType) {
      putValue("gender", genderType);
      return this;
    }
    /**
     * Gender of something, typically a [[Person]], but possibly also fictional characters, animals, etc. While http://schema.org/Male and http://schema.org/Female may be used, text strings are also acceptable for people who do not identify as a binary gender. The [[gender]] property can also be used in an extended sense to cover e.g. the gender of sports teams. As with the gender of individuals, we do not try to enumerate all possibilities. A mixed-gender [[SportsTeam]] can be indicated with a text value of &quot;Mixed&quot;.
     */
    @NotNull public Builder gender(@NotNull String gender) {
      putValue("gender", gender);
      return this;
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
     * The most generic familial relation.
     */
    @NotNull public Builder relatedTo(@NotNull Person person) {
      putValue("relatedTo", person);
      return this;
    }
    /**
     * The most generic familial relation.
     */
    @NotNull public Builder relatedTo(@NotNull Person.Builder person) {
      putValue("relatedTo", person.build());
      return this;
    }
    /**
     * An honorific suffix following a Person's name such as M.D. /PhD/MSCSW.
     */
    @NotNull public Builder honorificSuffix(@NotNull String honorificSuffix) {
      putValue("honorificSuffix", honorificSuffix);
      return this;
    }
    /**
     * The place where the person was born.
     */
    @NotNull public Builder birthPlace(@NotNull Place place) {
      putValue("birthPlace", place);
      return this;
    }
    /**
     * The place where the person was born.
     */
    @NotNull public Builder birthPlace(@NotNull Place.Builder place) {
      putValue("birthPlace", place.build());
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
     * A person or organization that supports (sponsors) something through some kind of financial contribution.
     */
    @NotNull public Builder funder(@NotNull Sponsor sponsor) {
      putValue("funder", sponsor);
      return this;
    }
    /**
     * A person or organization that supports a thing through a pledge, promise, or financial contribution. e.g. a sponsor of a Medical Study or a corporate sponsor of an event.
     */
    @NotNull public Builder sponsor(@NotNull Sponsor sponsor) {
      putValue("sponsor", sponsor);
      return this;
    }
    /**
     * The number of interactions for the CreativeWork using the WebSite or SoftwareApplication. The most specific child type of InteractionCounter should be used.
     */
    @NotNull public Builder interactionStatistic(@NotNull InteractionCounter interactionCounter) {
      putValue("interactionStatistic", interactionCounter);
      return this;
    }
    /**
     * The number of interactions for the CreativeWork using the WebSite or SoftwareApplication. The most specific child type of InteractionCounter should be used.
     */
    @NotNull public Builder interactionStatistic(@NotNull InteractionCounter.Builder interactionCounter) {
      putValue("interactionStatistic", interactionCounter.build());
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
     * An award won by or for this item.
     */
    @NotNull public Builder award(@NotNull String award) {
      putValue("award", award);
      return this;
    }
    /**
     * A parent of this person.
     */
    @NotNull public Builder parent(@NotNull Person person) {
      putValue("parent", person);
      return this;
    }
    /**
     * A parent of this person.
     */
    @NotNull public Builder parent(@NotNull Person.Builder person) {
      putValue("parent", person.build());
      return this;
    }
    /**
     * An additional name for a Person, can be used for a middle name.
     */
    @NotNull public Builder additionalName(@NotNull String additionalName) {
      putValue("additionalName", additionalName);
      return this;
    }
    /**
     * The weight of the product or person.
     */
    @NotNull public Builder weight(@NotNull QuantitativeValue quantitativeValue) {
      putValue("weight", quantitativeValue);
      return this;
    }
    /**
     * The weight of the product or person.
     */
    @NotNull public Builder weight(@NotNull QuantitativeValue.Builder quantitativeValue) {
      putValue("weight", quantitativeValue.build());
      return this;
    }
    /**
     * A colleague of the person.
     */
    @NotNull public Builder colleague(@NotNull Person person) {
      putValue("colleague", person);
      return this;
    }
    /**
     * A colleague of the person.
     */
    @NotNull public Builder colleague(@NotNull Person.Builder person) {
      putValue("colleague", person.build());
      return this;
    }
    /**
     * A colleague of the person.
     */
    @NotNull public Builder colleague(@NotNull String colleague) {
      putValue("colleague", colleague);
      return this;
    }
    /**
     * A child of the person.
     */
    @NotNull public Builder children(@NotNull Person person) {
      putValue("children", person);
      return this;
    }
    /**
     * A child of the person.
     */
    @NotNull public Builder children(@NotNull Person.Builder person) {
      putValue("children", person.build());
      return this;
    }
    /**
     * The most generic bi-directional social/work relation.
     */
    @NotNull public Builder knows(@NotNull Person person) {
      putValue("knows", person);
      return this;
    }
    /**
     * The most generic bi-directional social/work relation.
     */
    @NotNull public Builder knows(@NotNull Person.Builder person) {
      putValue("knows", person.build());
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
     * The place where the person died.
     */
    @NotNull public Builder deathPlace(@NotNull Place place) {
      putValue("deathPlace", place);
      return this;
    }
    /**
     * The place where the person died.
     */
    @NotNull public Builder deathPlace(@NotNull Place.Builder place) {
      putValue("deathPlace", place.build());
      return this;
    }
    /**
     * The total financial value of the person as calculated by subtracting assets from liabilities.
     */
    @NotNull public Builder netWorth(@NotNull MonetaryAmount monetaryAmount) {
      putValue("netWorth", monetaryAmount);
      return this;
    }
    /**
     * The total financial value of the person as calculated by subtracting assets from liabilities.
     */
    @NotNull public Builder netWorth(@NotNull MonetaryAmount.Builder monetaryAmount) {
      putValue("netWorth", monetaryAmount.build());
      return this;
    }
    /**
     * The total financial value of the person as calculated by subtracting assets from liabilities.
     */
    @NotNull public Builder netWorth(@NotNull PriceSpecification priceSpecification) {
      putValue("netWorth", priceSpecification);
      return this;
    }
    /**
     * The total financial value of the person as calculated by subtracting assets from liabilities.
     */
    @NotNull public Builder netWorth(@NotNull PriceSpecification.Builder priceSpecification) {
      putValue("netWorth", priceSpecification.build());
      return this;
    }
    /**
     * An honorific prefix preceding a Person's name such as Dr/Mrs/Mr.
     */
    @NotNull public Builder honorificPrefix(@NotNull String honorificPrefix) {
      putValue("honorificPrefix", honorificPrefix);
      return this;
    }
    /**
     * The person's spouse.
     */
    @NotNull public Builder spouse(@NotNull Person person) {
      putValue("spouse", person);
      return this;
    }
    /**
     * The person's spouse.
     */
    @NotNull public Builder spouse(@NotNull Person.Builder person) {
      putValue("spouse", person.build());
      return this;
    }
    /**
     * Date of death.
     */
    @NotNull public Builder deathDate(@NotNull java.util.Date date) {
      putValue("deathDate", date);
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
     * An organization that the person is an alumni of.
     */
    @NotNull public Builder alumniOf(@NotNull EducationalOrganization educationalOrganization) {
      putValue("alumniOf", educationalOrganization);
      return this;
    }
    /**
     * An organization that the person is an alumni of.
     */
    @NotNull public Builder alumniOf(@NotNull EducationalOrganization.Builder educationalOrganization) {
      putValue("alumniOf", educationalOrganization.build());
      return this;
    }
    /**
     * An organization that the person is an alumni of.
     */
    @NotNull public Builder alumniOf(@NotNull Organization organization) {
      putValue("alumniOf", organization);
      return this;
    }
    /**
     * An organization that the person is an alumni of.
     */
    @NotNull public Builder alumniOf(@NotNull Organization.Builder organization) {
      putValue("alumniOf", organization.build());
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
    @NotNull public Builder disambiguatingDescription(@NotNull String disambiguatingDescription) {
      putValue("disambiguatingDescription", disambiguatingDescription);
      return this;
    }
    /**
     * A description of the item.
     */
    @NotNull public Builder description(@NotNull String description) {
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
      if ("publishingPrinciples".equals(key) && value instanceof PublishingPrinciples) { this.publishingPrinciples((PublishingPrinciples)value); return; }
      if ("publishingPrincipless".equals(key) && value instanceof PublishingPrinciples) { this.publishingPrinciples((PublishingPrinciples)value); return; }
      if ("knowsAbout".equals(key) && value instanceof String) { this.knowsAbout((String)value); return; }
      if ("knowsAbouts".equals(key) && value instanceof String) { this.knowsAbout((String)value); return; }
      if ("knowsAbout".equals(key) && value instanceof Thing) { this.knowsAbout((Thing)value); return; }
      if ("knowsAbouts".equals(key) && value instanceof Thing) { this.knowsAbout((Thing)value); return; }
      if ("seeks".equals(key) && value instanceof Demand) { this.seeks((Demand)value); return; }
      if ("seekss".equals(key) && value instanceof Demand) { this.seeks((Demand)value); return; }
      if ("sibling".equals(key) && value instanceof Person) { this.sibling((Person)value); return; }
      if ("siblings".equals(key) && value instanceof Person) { this.sibling((Person)value); return; }
      if ("callSign".equals(key) && value instanceof Identifier) { this.callSign((Identifier)value); return; }
      if ("callSigns".equals(key) && value instanceof Identifier) { this.callSign((Identifier)value); return; }
      if ("homeLocation".equals(key) && value instanceof Location) { this.homeLocation((Location)value); return; }
      if ("homeLocations".equals(key) && value instanceof Location) { this.homeLocation((Location)value); return; }
      if ("duns".equals(key) && value instanceof Identifier) { this.duns((Identifier)value); return; }
      if ("dunss".equals(key) && value instanceof Identifier) { this.duns((Identifier)value); return; }
      if ("contactPoint".equals(key) && value instanceof ContactPoint) { this.contactPoint((ContactPoint)value); return; }
      if ("contactPoints".equals(key) && value instanceof ContactPoint) { this.contactPoint((ContactPoint)value); return; }
      if ("worksFor".equals(key) && value instanceof Organization) { this.worksFor((Organization)value); return; }
      if ("worksFors".equals(key) && value instanceof Organization) { this.worksFor((Organization)value); return; }
      if ("workLocation".equals(key) && value instanceof Location) { this.workLocation((Location)value); return; }
      if ("workLocations".equals(key) && value instanceof Location) { this.workLocation((Location)value); return; }
      if ("hasOccupation".equals(key) && value instanceof Occupation) { this.hasOccupation((Occupation)value); return; }
      if ("hasOccupations".equals(key) && value instanceof Occupation) { this.hasOccupation((Occupation)value); return; }
      if ("givenName".equals(key) && value instanceof String) { this.givenName((String)value); return; }
      if ("givenNames".equals(key) && value instanceof String) { this.givenName((String)value); return; }
      if ("email".equals(key) && value instanceof String) { this.email((String)value); return; }
      if ("emails".equals(key) && value instanceof String) { this.email((String)value); return; }
      if ("telephone".equals(key) && value instanceof String) { this.telephone((String)value); return; }
      if ("telephones".equals(key) && value instanceof String) { this.telephone((String)value); return; }
      if ("isicV4".equals(key) && value instanceof String) { this.isicV4((String)value); return; }
      if ("isicV4s".equals(key) && value instanceof String) { this.isicV4((String)value); return; }
      if ("hasCredential".equals(key) && value instanceof EducationalOccupationalCredential) { this.hasCredential((EducationalOccupationalCredential)value); return; }
      if ("hasCredentials".equals(key) && value instanceof EducationalOccupationalCredential) { this.hasCredential((EducationalOccupationalCredential)value); return; }
      if ("height".equals(key) && value instanceof Distance) { this.height((Distance)value); return; }
      if ("heights".equals(key) && value instanceof Distance) { this.height((Distance)value); return; }
      if ("height".equals(key) && value instanceof QuantitativeValue) { this.height((QuantitativeValue)value); return; }
      if ("heights".equals(key) && value instanceof QuantitativeValue) { this.height((QuantitativeValue)value); return; }
      if ("familyName".equals(key) && value instanceof String) { this.familyName((String)value); return; }
      if ("familyNames".equals(key) && value instanceof String) { this.familyName((String)value); return; }
      if ("performerIn".equals(key) && value instanceof Event) { this.performerIn((Event)value); return; }
      if ("performerIns".equals(key) && value instanceof Event) { this.performerIn((Event)value); return; }
      if ("taxID".equals(key) && value instanceof Identifier) { this.taxID((Identifier)value); return; }
      if ("taxIDs".equals(key) && value instanceof Identifier) { this.taxID((Identifier)value); return; }
      if ("knowsLanguage".equals(key) && value instanceof Language) { this.knowsLanguage((Language)value); return; }
      if ("knowsLanguages".equals(key) && value instanceof Language) { this.knowsLanguage((Language)value); return; }
      if ("knowsLanguage".equals(key) && value instanceof String) { this.knowsLanguage((String)value); return; }
      if ("knowsLanguages".equals(key) && value instanceof String) { this.knowsLanguage((String)value); return; }
      if ("memberOf".equals(key) && value instanceof MemberOf) { this.memberOf((MemberOf)value); return; }
      if ("memberOfs".equals(key) && value instanceof MemberOf) { this.memberOf((MemberOf)value); return; }
      if ("affiliation".equals(key) && value instanceof MemberOf) { this.affiliation((MemberOf)value); return; }
      if ("affiliations".equals(key) && value instanceof MemberOf) { this.affiliation((MemberOf)value); return; }
      if ("brand".equals(key) && value instanceof Brand) { this.brand((Brand)value); return; }
      if ("brands".equals(key) && value instanceof Brand) { this.brand((Brand)value); return; }
      if ("brand".equals(key) && value instanceof Organization) { this.brand((Organization)value); return; }
      if ("brands".equals(key) && value instanceof Organization) { this.brand((Organization)value); return; }
      if ("vatID".equals(key) && value instanceof String) { this.vatID((String)value); return; }
      if ("vatIDs".equals(key) && value instanceof String) { this.vatID((String)value); return; }
      if ("address".equals(key) && value instanceof PostalAddress) { this.address((PostalAddress)value); return; }
      if ("addresss".equals(key) && value instanceof PostalAddress) { this.address((PostalAddress)value); return; }
      if ("address".equals(key) && value instanceof String) { this.address((String)value); return; }
      if ("addresss".equals(key) && value instanceof String) { this.address((String)value); return; }
      if ("nationality".equals(key) && value instanceof Country) { this.nationality((Country)value); return; }
      if ("nationalitys".equals(key) && value instanceof Country) { this.nationality((Country)value); return; }
      if ("birthDate".equals(key) && value instanceof java.util.Date) { this.birthDate((java.util.Date)value); return; }
      if ("birthDates".equals(key) && value instanceof java.util.Date) { this.birthDate((java.util.Date)value); return; }
      if ("jobTitle".equals(key) && value instanceof DefinedTerm) { this.jobTitle((DefinedTerm)value); return; }
      if ("jobTitles".equals(key) && value instanceof DefinedTerm) { this.jobTitle((DefinedTerm)value); return; }
      if ("jobTitle".equals(key) && value instanceof String) { this.jobTitle((String)value); return; }
      if ("jobTitles".equals(key) && value instanceof String) { this.jobTitle((String)value); return; }
      if ("owns".equals(key) && value instanceof OwnershipInfo) { this.owns((OwnershipInfo)value); return; }
      if ("ownss".equals(key) && value instanceof OwnershipInfo) { this.owns((OwnershipInfo)value); return; }
      if ("owns".equals(key) && value instanceof Product) { this.owns((Product)value); return; }
      if ("ownss".equals(key) && value instanceof Product) { this.owns((Product)value); return; }
      if ("naics".equals(key) && value instanceof String) { this.naics((String)value); return; }
      if ("naicss".equals(key) && value instanceof String) { this.naics((String)value); return; }
      if ("follows".equals(key) && value instanceof Person) { this.follows((Person)value); return; }
      if ("followss".equals(key) && value instanceof Person) { this.follows((Person)value); return; }
      if ("gender".equals(key) && value instanceof GenderType) { this.gender((GenderType)value); return; }
      if ("genders".equals(key) && value instanceof GenderType) { this.gender((GenderType)value); return; }
      if ("gender".equals(key) && value instanceof String) { this.gender((String)value); return; }
      if ("genders".equals(key) && value instanceof String) { this.gender((String)value); return; }
      if ("hasOfferCatalog".equals(key) && value instanceof OfferCatalog) { this.hasOfferCatalog((OfferCatalog)value); return; }
      if ("hasOfferCatalogs".equals(key) && value instanceof OfferCatalog) { this.hasOfferCatalog((OfferCatalog)value); return; }
      if ("relatedTo".equals(key) && value instanceof Person) { this.relatedTo((Person)value); return; }
      if ("relatedTos".equals(key) && value instanceof Person) { this.relatedTo((Person)value); return; }
      if ("honorificSuffix".equals(key) && value instanceof String) { this.honorificSuffix((String)value); return; }
      if ("honorificSuffixs".equals(key) && value instanceof String) { this.honorificSuffix((String)value); return; }
      if ("birthPlace".equals(key) && value instanceof Place) { this.birthPlace((Place)value); return; }
      if ("birthPlaces".equals(key) && value instanceof Place) { this.birthPlace((Place)value); return; }
      if ("globalLocationNumber".equals(key) && value instanceof Identifier) { this.globalLocationNumber((Identifier)value); return; }
      if ("globalLocationNumbers".equals(key) && value instanceof Identifier) { this.globalLocationNumber((Identifier)value); return; }
      if ("funder".equals(key) && value instanceof Sponsor) { this.funder((Sponsor)value); return; }
      if ("funders".equals(key) && value instanceof Sponsor) { this.funder((Sponsor)value); return; }
      if ("sponsor".equals(key) && value instanceof Sponsor) { this.sponsor((Sponsor)value); return; }
      if ("sponsors".equals(key) && value instanceof Sponsor) { this.sponsor((Sponsor)value); return; }
      if ("interactionStatistic".equals(key) && value instanceof InteractionCounter) { this.interactionStatistic((InteractionCounter)value); return; }
      if ("interactionStatistics".equals(key) && value instanceof InteractionCounter) { this.interactionStatistic((InteractionCounter)value); return; }
      if ("faxNumber".equals(key) && value instanceof String) { this.faxNumber((String)value); return; }
      if ("faxNumbers".equals(key) && value instanceof String) { this.faxNumber((String)value); return; }
      if ("award".equals(key) && value instanceof String) { this.award((String)value); return; }
      if ("awards".equals(key) && value instanceof String) { this.award((String)value); return; }
      if ("parent".equals(key) && value instanceof Person) { this.parent((Person)value); return; }
      if ("parents".equals(key) && value instanceof Person) { this.parent((Person)value); return; }
      if ("additionalName".equals(key) && value instanceof String) { this.additionalName((String)value); return; }
      if ("additionalNames".equals(key) && value instanceof String) { this.additionalName((String)value); return; }
      if ("weight".equals(key) && value instanceof QuantitativeValue) { this.weight((QuantitativeValue)value); return; }
      if ("weights".equals(key) && value instanceof QuantitativeValue) { this.weight((QuantitativeValue)value); return; }
      if ("colleague".equals(key) && value instanceof Person) { this.colleague((Person)value); return; }
      if ("colleagues".equals(key) && value instanceof Person) { this.colleague((Person)value); return; }
      if ("colleague".equals(key) && value instanceof String) { this.colleague((String)value); return; }
      if ("colleagues".equals(key) && value instanceof String) { this.colleague((String)value); return; }
      if ("children".equals(key) && value instanceof Person) { this.children((Person)value); return; }
      if ("childrens".equals(key) && value instanceof Person) { this.children((Person)value); return; }
      if ("knows".equals(key) && value instanceof Person) { this.knows((Person)value); return; }
      if ("knowss".equals(key) && value instanceof Person) { this.knows((Person)value); return; }
      if ("hasPOS".equals(key) && value instanceof Place) { this.hasPOS((Place)value); return; }
      if ("hasPOSs".equals(key) && value instanceof Place) { this.hasPOS((Place)value); return; }
      if ("deathPlace".equals(key) && value instanceof Place) { this.deathPlace((Place)value); return; }
      if ("deathPlaces".equals(key) && value instanceof Place) { this.deathPlace((Place)value); return; }
      if ("netWorth".equals(key) && value instanceof MonetaryAmount) { this.netWorth((MonetaryAmount)value); return; }
      if ("netWorths".equals(key) && value instanceof MonetaryAmount) { this.netWorth((MonetaryAmount)value); return; }
      if ("netWorth".equals(key) && value instanceof PriceSpecification) { this.netWorth((PriceSpecification)value); return; }
      if ("netWorths".equals(key) && value instanceof PriceSpecification) { this.netWorth((PriceSpecification)value); return; }
      if ("honorificPrefix".equals(key) && value instanceof String) { this.honorificPrefix((String)value); return; }
      if ("honorificPrefixs".equals(key) && value instanceof String) { this.honorificPrefix((String)value); return; }
      if ("spouse".equals(key) && value instanceof Person) { this.spouse((Person)value); return; }
      if ("spouses".equals(key) && value instanceof Person) { this.spouse((Person)value); return; }
      if ("deathDate".equals(key) && value instanceof java.util.Date) { this.deathDate((java.util.Date)value); return; }
      if ("deathDates".equals(key) && value instanceof java.util.Date) { this.deathDate((java.util.Date)value); return; }
      if ("makesOffer".equals(key) && value instanceof Offer) { this.makesOffer((Offer)value); return; }
      if ("makesOffers".equals(key) && value instanceof Offer) { this.makesOffer((Offer)value); return; }
      if ("alumniOf".equals(key) && value instanceof EducationalOrganization) { this.alumniOf((EducationalOrganization)value); return; }
      if ("alumniOfs".equals(key) && value instanceof EducationalOrganization) { this.alumniOf((EducationalOrganization)value); return; }
      if ("alumniOf".equals(key) && value instanceof Organization) { this.alumniOf((Organization)value); return; }
      if ("alumniOfs".equals(key) && value instanceof Organization) { this.alumniOf((Organization)value); return; }
      super.fromMap(key, value);
    }
  }
  
}
