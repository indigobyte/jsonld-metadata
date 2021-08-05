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
public class Organization extends Thing implements Creator, Sponsor, MemberOf {
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
   * Of a [[Person]], and less typically of an [[Organization]], to indicate a topic that is known about - suggesting possible expertise but not implying it. We do not distinguish skill levels here, or relate this to educational content, events, objectives or [[JobPosting]] descriptions.
   */
  @JsonIgnore public String getKnowsAboutString() {
    return (String) getValue("knowsAbout");
  }
  /**
   * Of a [[Person]], and less typically of an [[Organization]], to indicate a topic that is known about - suggesting possible expertise but not implying it. We do not distinguish skill levels here, or relate this to educational content, events, objectives or [[JobPosting]] descriptions.
   */
  @JsonIgnore public Collection<String> getKnowsAboutStrings() {
    final Object current = myData.get("knowsAbout");
    if (current == null) return Collections.emptyList();
    if (current instanceof Collection) {
      return (Collection<String>) current;
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
  @JsonIgnore public Collection<Thing> getKnowsAboutThings() {
    final Object current = myData.get("knowsAbout");
    if (current == null) return Collections.emptyList();
    if (current instanceof Collection) {
      return (Collection<Thing>) current;
    }
    return Arrays.asList((Thing) current);
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
   * Statement on diversity policy by an [[Organization]] e.g. a [[NewsMediaOrganization]]. For a [[NewsMediaOrganization]], a statement describing the newsroom&rsquo;s diversity policy on both staffing and sources, typically providing staffing data.
   */
  @JsonIgnore public CreativeWork getDiversityPolicyCreativeWork() {
    return (CreativeWork) getValue("diversityPolicy");
  }
  /**
   * Statement on diversity policy by an [[Organization]] e.g. a [[NewsMediaOrganization]]. For a [[NewsMediaOrganization]], a statement describing the newsroom&rsquo;s diversity policy on both staffing and sources, typically providing staffing data.
   */
  @JsonIgnore public Collection<CreativeWork> getDiversityPolicyCreativeWorks() {
    final Object current = myData.get("diversityPolicy");
    if (current == null) return Collections.emptyList();
    if (current instanceof Collection) {
      return (Collection<CreativeWork>) current;
    }
    return Arrays.asList((CreativeWork) current);
  }
  /**
   * Statement on diversity policy by an [[Organization]] e.g. a [[NewsMediaOrganization]]. For a [[NewsMediaOrganization]], a statement describing the newsroom&rsquo;s diversity policy on both staffing and sources, typically providing staffing data.
   */
  @JsonIgnore public String getDiversityPolicyString() {
    return (String) getValue("diversityPolicy");
  }
  /**
   * Statement on diversity policy by an [[Organization]] e.g. a [[NewsMediaOrganization]]. For a [[NewsMediaOrganization]], a statement describing the newsroom&rsquo;s diversity policy on both staffing and sources, typically providing staffing data.
   */
  @JsonIgnore public Collection<String> getDiversityPolicyStrings() {
    final Object current = myData.get("diversityPolicy");
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
   * For an [[Organization]] (typically a [[NewsMediaOrganization]]), a statement about policy on use of unnamed sources and the decision process required.
   */
  @JsonIgnore public PublishingPrinciples getUnnamedSourcesPolicy() {
    return (PublishingPrinciples) getValue("unnamedSourcesPolicy");
  }
  /**
   * For an [[Organization]] (typically a [[NewsMediaOrganization]]), a statement about policy on use of unnamed sources and the decision process required.
   */
  @JsonIgnore public Collection<PublishingPrinciples> getUnnamedSourcesPolicys() {
    final Object current = myData.get("unnamedSourcesPolicy");
    if (current == null) return Collections.emptyList();
    if (current instanceof Collection) {
      return (Collection<PublishingPrinciples>) current;
    }
    return Arrays.asList((PublishingPrinciples) current);
  }
  /**
   * The Dun &amp; Bradstreet DUNS number for identifying an organization or business person.
   */
  @JsonIgnore public String getDuns() {
    return (String) getValue("duns");
  }
  /**
   * The Dun &amp; Bradstreet DUNS number for identifying an organization or business person.
   */
  @JsonIgnore public Collection<String> getDunss() {
    final Object current = myData.get("duns");
    if (current == null) return Collections.emptyList();
    if (current instanceof Collection) {
      return (Collection<String>) current;
    }
    return Arrays.asList((String) current);
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
   * nonprofit Status indicates the legal status of a non-profit organization in its primary place of business.
   */
  @JsonIgnore public NonprofitType getNonprofitStatus() {
    return (NonprofitType) getValue("nonprofitStatus");
  }
  /**
   * nonprofit Status indicates the legal status of a non-profit organization in its primary place of business.
   */
  @JsonIgnore public Collection<NonprofitType> getNonprofitStatuss() {
    final Object current = myData.get("nonprofitStatus");
    if (current == null) return Collections.emptyList();
    if (current instanceof Collection) {
      return (Collection<NonprofitType>) current;
    }
    return Arrays.asList((NonprofitType) current);
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
   * An organization identifier that uniquely identifies a legal entity as defined in ISO 17442.
   */
  @JsonIgnore public Identifier getLeiCode() {
    return (Identifier) getValue("leiCode");
  }
  /**
   * An organization identifier that uniquely identifies a legal entity as defined in ISO 17442.
   */
  @JsonIgnore public Collection<Identifier> getLeiCodes() {
    final Object current = myData.get("leiCode");
    if (current == null) return Collections.emptyList();
    if (current instanceof Collection) {
      return (Collection<Identifier>) current;
    }
    return Arrays.asList((Identifier) current);
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
   * For an [[Organization]] (often but not necessarily a [[NewsMediaOrganization]]), a description of organizational ownership structure; funding and grants. In a news/media setting, this is with particular reference to editorial independence.   Note that the [[funder]] is also available and can be used to make basic funder information machine-readable.
   */
  @JsonIgnore public PublishingPrinciples getOwnershipFundingInfo() {
    return (PublishingPrinciples) getValue("ownershipFundingInfo");
  }
  /**
   * For an [[Organization]] (often but not necessarily a [[NewsMediaOrganization]]), a description of organizational ownership structure; funding and grants. In a news/media setting, this is with particular reference to editorial independence.   Note that the [[funder]] is also available and can be used to make basic funder information machine-readable.
   */
  @JsonIgnore public Collection<PublishingPrinciples> getOwnershipFundingInfos() {
    final Object current = myData.get("ownershipFundingInfo");
    if (current == null) return Collections.emptyList();
    if (current instanceof Collection) {
      return (Collection<PublishingPrinciples>) current;
    }
    return Arrays.asList((PublishingPrinciples) current);
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
   * An associated logo.
   */
  @JsonIgnore public Image getLogo() {
    return (Image) getValue("logo");
  }
  /**
   * An associated logo.
   */
  @JsonIgnore public Collection<Image> getLogos() {
    final Object current = myData.get("logo");
    if (current == null) return Collections.emptyList();
    if (current instanceof Collection) {
      return (Collection<Image>) current;
    }
    return Arrays.asList((Image) current);
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
   * For an [[Organization]] (often but not necessarily a [[NewsMediaOrganization]]), a report on staffing diversity issues. In a news context this might be for example ASNE or RTDNA (US) reports, or self-reported.
   */
  @JsonIgnore public PublishingPrinciples getDiversityStaffingReport() {
    return (PublishingPrinciples) getValue("diversityStaffingReport");
  }
  /**
   * For an [[Organization]] (often but not necessarily a [[NewsMediaOrganization]]), a report on staffing diversity issues. In a news context this might be for example ASNE or RTDNA (US) reports, or self-reported.
   */
  @JsonIgnore public Collection<PublishingPrinciples> getDiversityStaffingReports() {
    final Object current = myData.get("diversityStaffingReport");
    if (current == null) return Collections.emptyList();
    if (current instanceof Collection) {
      return (Collection<PublishingPrinciples>) current;
    }
    return Arrays.asList((PublishingPrinciples) current);
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
  @JsonIgnore public Collection<EducationalOccupationalCredential> getHasCredentials() {
    final Object current = myData.get("hasCredential");
    if (current == null) return Collections.emptyList();
    if (current instanceof Collection) {
      return (Collection<EducationalOccupationalCredential>) current;
    }
    return Arrays.asList((EducationalOccupationalCredential) current);
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
   * The Tax / Fiscal ID of the organization or person, e.g. the TIN in the US or the CIF/NIF in Spain.
   */
  @JsonIgnore public Identifier getTaxID() {
    return (Identifier) getValue("taxID");
  }
  /**
   * The Tax / Fiscal ID of the organization or person, e.g. the TIN in the US or the CIF/NIF in Spain.
   */
  @JsonIgnore public Collection<Identifier> getTaxIDs() {
    final Object current = myData.get("taxID");
    if (current == null) return Collections.emptyList();
    if (current instanceof Collection) {
      return (Collection<Identifier>) current;
    }
    return Arrays.asList((Identifier) current);
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
  /**
   * Of a [[Person]], and less typically of an [[Organization]], to indicate a known language. We do not distinguish skill levels or reading/writing/speaking/signing here. Use language codes from the [IETF BCP 47 standard](http://tools.ietf.org/html/bcp47).
   */
  @JsonIgnore public Language getKnowsLanguageLanguage() {
    return (Language) getValue("knowsLanguage");
  }
  /**
   * Of a [[Person]], and less typically of an [[Organization]], to indicate a known language. We do not distinguish skill levels or reading/writing/speaking/signing here. Use language codes from the [IETF BCP 47 standard](http://tools.ietf.org/html/bcp47).
   */
  @JsonIgnore public Collection<Language> getKnowsLanguageLanguages() {
    final Object current = myData.get("knowsLanguage");
    if (current == null) return Collections.emptyList();
    if (current instanceof Collection) {
      return (Collection<Language>) current;
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
  @JsonIgnore public Collection<String> getKnowsLanguageStrings() {
    final Object current = myData.get("knowsLanguage");
    if (current == null) return Collections.emptyList();
    if (current instanceof Collection) {
      return (Collection<String>) current;
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
  @JsonIgnore public Collection<MemberOf> getMemberOfs() {
    final Object current = myData.get("memberOf");
    if (current == null) return Collections.emptyList();
    if (current instanceof Collection) {
      return (Collection<MemberOf>) current;
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
   * Specifies a MerchantReturnPolicy that may be applicable.
   */
  @JsonIgnore public MerchantReturnPolicy getHasMerchantReturnPolicy() {
    return (MerchantReturnPolicy) getValue("hasMerchantReturnPolicy");
  }
  /**
   * Specifies a MerchantReturnPolicy that may be applicable.
   */
  @JsonIgnore public Collection<MerchantReturnPolicy> getHasMerchantReturnPolicys() {
    final Object current = myData.get("hasMerchantReturnPolicy");
    if (current == null) return Collections.emptyList();
    if (current instanceof Collection) {
      return (Collection<MerchantReturnPolicy>) current;
    }
    return Arrays.asList((MerchantReturnPolicy) current);
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
   * For an [[Organization]] (e.g. [[NewsMediaOrganization]]), a statement describing (in news media, the newsroom&rsquo;s) disclosure and correction policy for errors.
   */
  @JsonIgnore public PublishingPrinciples getCorrectionsPolicy() {
    return (PublishingPrinciples) getValue("correctionsPolicy");
  }
  /**
   * For an [[Organization]] (e.g. [[NewsMediaOrganization]]), a statement describing (in news media, the newsroom&rsquo;s) disclosure and correction policy for errors.
   */
  @JsonIgnore public Collection<PublishingPrinciples> getCorrectionsPolicys() {
    final Object current = myData.get("correctionsPolicy");
    if (current == null) return Collections.emptyList();
    if (current instanceof Collection) {
      return (Collection<PublishingPrinciples>) current;
    }
    return Arrays.asList((PublishingPrinciples) current);
  }
  /**
   * For a [[NewsMediaOrganization]] or other news-related [[Organization]], a statement about public engagement activities (for news media, the newsroom&rsquo;s), including involving the public - digitally or otherwise -- in coverage decisions, reporting and activities after publication.
   */
  @JsonIgnore public PublishingPrinciples getActionableFeedbackPolicy() {
    return (PublishingPrinciples) getValue("actionableFeedbackPolicy");
  }
  /**
   * For a [[NewsMediaOrganization]] or other news-related [[Organization]], a statement about public engagement activities (for news media, the newsroom&rsquo;s), including involving the public - digitally or otherwise -- in coverage decisions, reporting and activities after publication.
   */
  @JsonIgnore public Collection<PublishingPrinciples> getActionableFeedbackPolicys() {
    final Object current = myData.get("actionableFeedbackPolicy");
    if (current == null) return Collections.emptyList();
    if (current instanceof Collection) {
      return (Collection<PublishingPrinciples>) current;
    }
    return Arrays.asList((PublishingPrinciples) current);
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
  @JsonIgnore public Collection<OfferCatalog> getHasOfferCatalogs() {
    final Object current = myData.get("hasOfferCatalog");
    if (current == null) return Collections.emptyList();
    if (current instanceof Collection) {
      return (Collection<OfferCatalog>) current;
    }
    return Arrays.asList((OfferCatalog) current);
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
  @JsonIgnore public Collection<Identifier> getGlobalLocationNumbers() {
    final Object current = myData.get("globalLocationNumber");
    if (current == null) return Collections.emptyList();
    if (current instanceof Collection) {
      return (Collection<Identifier>) current;
    }
    return Arrays.asList((Identifier) current);
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
  @JsonIgnore public Collection<Sponsor> getSponsors() {
    final Object current = myData.get("sponsor");
    if (current == null) return Collections.emptyList();
    if (current instanceof Collection) {
      return (Collection<Sponsor>) current;
    }
    return Arrays.asList((Sponsor) current);
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
  @JsonIgnore public Collection<Sponsor> getFunders() {
    final Object current = myData.get("funder");
    if (current == null) return Collections.emptyList();
    if (current instanceof Collection) {
      return (Collection<Sponsor>) current;
    }
    return Arrays.asList((Sponsor) current);
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
   * The number of interactions for the CreativeWork using the WebSite or SoftwareApplication. The most specific child type of InteractionCounter should be used.
   */
  @JsonIgnore public InteractionCounter getInteractionStatistic() {
    return (InteractionCounter) getValue("interactionStatistic");
  }
  /**
   * The number of interactions for the CreativeWork using the WebSite or SoftwareApplication. The most specific child type of InteractionCounter should be used.
   */
  @JsonIgnore public Collection<InteractionCounter> getInteractionStatistics() {
    final Object current = myData.get("interactionStatistic");
    if (current == null) return Collections.emptyList();
    if (current instanceof Collection) {
      return (Collection<InteractionCounter>) current;
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
  @JsonIgnore public Collection<String> getFaxNumbers() {
    final Object current = myData.get("faxNumber");
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
   * Statement about ethics policy, e.g. of a [[NewsMediaOrganization]] regarding journalistic and publishing practices, or of a [[Restaurant]], a page describing food source policies. In the case of a [[NewsMediaOrganization]], an ethicsPolicy is typically a statement describing the personal, organizational, and corporate standards of behavior expected by the organization.
   */
  @JsonIgnore public CreativeWork getEthicsPolicyCreativeWork() {
    return (CreativeWork) getValue("ethicsPolicy");
  }
  /**
   * Statement about ethics policy, e.g. of a [[NewsMediaOrganization]] regarding journalistic and publishing practices, or of a [[Restaurant]], a page describing food source policies. In the case of a [[NewsMediaOrganization]], an ethicsPolicy is typically a statement describing the personal, organizational, and corporate standards of behavior expected by the organization.
   */
  @JsonIgnore public Collection<CreativeWork> getEthicsPolicyCreativeWorks() {
    final Object current = myData.get("ethicsPolicy");
    if (current == null) return Collections.emptyList();
    if (current instanceof Collection) {
      return (Collection<CreativeWork>) current;
    }
    return Arrays.asList((CreativeWork) current);
  }
  /**
   * Statement about ethics policy, e.g. of a [[NewsMediaOrganization]] regarding journalistic and publishing practices, or of a [[Restaurant]], a page describing food source policies. In the case of a [[NewsMediaOrganization]], an ethicsPolicy is typically a statement describing the personal, organizational, and corporate standards of behavior expected by the organization.
   */
  @JsonIgnore public String getEthicsPolicyString() {
    return (String) getValue("ethicsPolicy");
  }
  /**
   * Statement about ethics policy, e.g. of a [[NewsMediaOrganization]] regarding journalistic and publishing practices, or of a [[Restaurant]], a page describing food source policies. In the case of a [[NewsMediaOrganization]], an ethicsPolicy is typically a statement describing the personal, organizational, and corporate standards of behavior expected by the organization.
   */
  @JsonIgnore public Collection<String> getEthicsPolicyStrings() {
    final Object current = myData.get("ethicsPolicy");
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
     * Statement on diversity policy by an [[Organization]] e.g. a [[NewsMediaOrganization]]. For a [[NewsMediaOrganization]], a statement describing the newsroom&rsquo;s diversity policy on both staffing and sources, typically providing staffing data.
     */
    @NotNull public Builder diversityPolicy(@NotNull CreativeWork creativeWork) {
      putValue("diversityPolicy", creativeWork);
      return this;
    }
    /**
     * Statement on diversity policy by an [[Organization]] e.g. a [[NewsMediaOrganization]]. For a [[NewsMediaOrganization]], a statement describing the newsroom&rsquo;s diversity policy on both staffing and sources, typically providing staffing data.
     */
    @NotNull public Builder diversityPolicy(@NotNull CreativeWork.Builder creativeWork) {
      putValue("diversityPolicy", creativeWork.build());
      return this;
    }
    /**
     * Statement on diversity policy by an [[Organization]] e.g. a [[NewsMediaOrganization]]. For a [[NewsMediaOrganization]], a statement describing the newsroom&rsquo;s diversity policy on both staffing and sources, typically providing staffing data.
     */
    @NotNull public Builder diversityPolicy(@NotNull String diversityPolicy) {
      putValue("diversityPolicy", diversityPolicy);
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
     * For an [[Organization]] (typically a [[NewsMediaOrganization]]), a statement about policy on use of unnamed sources and the decision process required.
     */
    @NotNull public Builder unnamedSourcesPolicy(@NotNull PublishingPrinciples publishingPrinciples) {
      putValue("unnamedSourcesPolicy", publishingPrinciples);
      return this;
    }
    /**
     * The Dun &amp; Bradstreet DUNS number for identifying an organization or business person.
     */
    @NotNull public Builder duns(@NotNull String duns) {
      putValue("duns", duns);
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
     * The official name of the organization, e.g. the registered company name.
     */
    @NotNull public Builder legalName(@NotNull String legalName) {
      putValue("legalName", legalName);
      return this;
    }
    /**
     * nonprofit Status indicates the legal status of a non-profit organization in its primary place of business.
     */
    @NotNull public Builder nonprofitStatus(@NotNull NonprofitType nonprofitType) {
      putValue("nonprofitStatus", nonprofitType);
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
     * An organization identifier that uniquely identifies a legal entity as defined in ISO 17442.
     */
    @NotNull public Builder leiCode(@NotNull Identifier identifier) {
      putValue("leiCode", identifier);
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
     * For an [[Organization]] (often but not necessarily a [[NewsMediaOrganization]]), a description of organizational ownership structure; funding and grants. In a news/media setting, this is with particular reference to editorial independence.   Note that the [[funder]] is also available and can be used to make basic funder information machine-readable.
     */
    @NotNull public Builder ownershipFundingInfo(@NotNull PublishingPrinciples publishingPrinciples) {
      putValue("ownershipFundingInfo", publishingPrinciples);
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
     * For an [[Organization]] (often but not necessarily a [[NewsMediaOrganization]]), a report on staffing diversity issues. In a news context this might be for example ASNE or RTDNA (US) reports, or self-reported.
     */
    @NotNull public Builder diversityStaffingReport(@NotNull PublishingPrinciples publishingPrinciples) {
      putValue("diversityStaffingReport", publishingPrinciples);
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
     * The date that this organization was dissolved.
     */
    @NotNull public Builder dissolutionDate(@NotNull java.util.Date date) {
      putValue("dissolutionDate", date);
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
     * Specifies a MerchantReturnPolicy that may be applicable.
     */
    @NotNull public Builder hasMerchantReturnPolicy(@NotNull MerchantReturnPolicy merchantReturnPolicy) {
      putValue("hasMerchantReturnPolicy", merchantReturnPolicy);
      return this;
    }
    /**
     * Specifies a MerchantReturnPolicy that may be applicable.
     */
    @NotNull public Builder hasMerchantReturnPolicy(@NotNull MerchantReturnPolicy.Builder merchantReturnPolicy) {
      putValue("hasMerchantReturnPolicy", merchantReturnPolicy.build());
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
     * For an [[Organization]] (e.g. [[NewsMediaOrganization]]), a statement describing (in news media, the newsroom&rsquo;s) disclosure and correction policy for errors.
     */
    @NotNull public Builder correctionsPolicy(@NotNull PublishingPrinciples publishingPrinciples) {
      putValue("correctionsPolicy", publishingPrinciples);
      return this;
    }
    /**
     * For a [[NewsMediaOrganization]] or other news-related [[Organization]], a statement about public engagement activities (for news media, the newsroom&rsquo;s), including involving the public - digitally or otherwise -- in coverage decisions, reporting and activities after publication.
     */
    @NotNull public Builder actionableFeedbackPolicy(@NotNull PublishingPrinciples publishingPrinciples) {
      putValue("actionableFeedbackPolicy", publishingPrinciples);
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
     * The [Global Location Number](http://www.gs1.org/gln) (GLN, sometimes also referred to as International Location Number or ILN) of the respective organization, person, or place. The GLN is a 13-digit number used to identify parties and physical locations.
     */
    @NotNull public Builder globalLocationNumber(@NotNull Identifier identifier) {
      putValue("globalLocationNumber", identifier);
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
     * A person or organization that supports (sponsors) something through some kind of financial contribution.
     */
    @NotNull public Builder funder(@NotNull Sponsor sponsor) {
      putValue("funder", sponsor);
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
     * An award won by or for this item.
     */
    @NotNull public Builder award(@NotNull String award) {
      putValue("award", award);
      return this;
    }
    /**
     * Statement about ethics policy, e.g. of a [[NewsMediaOrganization]] regarding journalistic and publishing practices, or of a [[Restaurant]], a page describing food source policies. In the case of a [[NewsMediaOrganization]], an ethicsPolicy is typically a statement describing the personal, organizational, and corporate standards of behavior expected by the organization.
     */
    @NotNull public Builder ethicsPolicy(@NotNull CreativeWork creativeWork) {
      putValue("ethicsPolicy", creativeWork);
      return this;
    }
    /**
     * Statement about ethics policy, e.g. of a [[NewsMediaOrganization]] regarding journalistic and publishing practices, or of a [[Restaurant]], a page describing food source policies. In the case of a [[NewsMediaOrganization]], an ethicsPolicy is typically a statement describing the personal, organizational, and corporate standards of behavior expected by the organization.
     */
    @NotNull public Builder ethicsPolicy(@NotNull CreativeWork.Builder creativeWork) {
      putValue("ethicsPolicy", creativeWork.build());
      return this;
    }
    /**
     * Statement about ethics policy, e.g. of a [[NewsMediaOrganization]] regarding journalistic and publishing practices, or of a [[Restaurant]], a page describing food source policies. In the case of a [[NewsMediaOrganization]], an ethicsPolicy is typically a statement describing the personal, organizational, and corporate standards of behavior expected by the organization.
     */
    @NotNull public Builder ethicsPolicy(@NotNull String ethicsPolicy) {
      putValue("ethicsPolicy", ethicsPolicy);
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
     * A slogan or motto associated with the item.
     */
    @NotNull public Builder slogan(@NotNull String slogan) {
      putValue("slogan", slogan);
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
      if ("numberOfEmployees".equals(key) && value instanceof QuantitativeValue) { this.numberOfEmployees((QuantitativeValue)value); return; }
      if ("numberOfEmployeess".equals(key) && value instanceof QuantitativeValue) { this.numberOfEmployees((QuantitativeValue)value); return; }
      if ("knowsAbout".equals(key) && value instanceof String) { this.knowsAbout((String)value); return; }
      if ("knowsAbouts".equals(key) && value instanceof String) { this.knowsAbout((String)value); return; }
      if ("knowsAbout".equals(key) && value instanceof Thing) { this.knowsAbout((Thing)value); return; }
      if ("knowsAbouts".equals(key) && value instanceof Thing) { this.knowsAbout((Thing)value); return; }
      if ("event".equals(key) && value instanceof Event) { this.event((Event)value); return; }
      if ("events".equals(key) && value instanceof Event) { this.event((Event)value); return; }
      if ("diversityPolicy".equals(key) && value instanceof CreativeWork) { this.diversityPolicy((CreativeWork)value); return; }
      if ("diversityPolicys".equals(key) && value instanceof CreativeWork) { this.diversityPolicy((CreativeWork)value); return; }
      if ("diversityPolicy".equals(key) && value instanceof String) { this.diversityPolicy((String)value); return; }
      if ("diversityPolicys".equals(key) && value instanceof String) { this.diversityPolicy((String)value); return; }
      if ("seeks".equals(key) && value instanceof Demand) { this.seeks((Demand)value); return; }
      if ("seekss".equals(key) && value instanceof Demand) { this.seeks((Demand)value); return; }
      if ("unnamedSourcesPolicy".equals(key) && value instanceof PublishingPrinciples) { this.unnamedSourcesPolicy((PublishingPrinciples)value); return; }
      if ("unnamedSourcesPolicys".equals(key) && value instanceof PublishingPrinciples) { this.unnamedSourcesPolicy((PublishingPrinciples)value); return; }
      if ("duns".equals(key) && value instanceof String) { this.duns((String)value); return; }
      if ("dunss".equals(key) && value instanceof String) { this.duns((String)value); return; }
      if ("contactPoint".equals(key) && value instanceof ContactPoint) { this.contactPoint((ContactPoint)value); return; }
      if ("contactPoints".equals(key) && value instanceof ContactPoint) { this.contactPoint((ContactPoint)value); return; }
      if ("legalName".equals(key) && value instanceof String) { this.legalName((String)value); return; }
      if ("legalNames".equals(key) && value instanceof String) { this.legalName((String)value); return; }
      if ("nonprofitStatus".equals(key) && value instanceof NonprofitType) { this.nonprofitStatus((NonprofitType)value); return; }
      if ("nonprofitStatuss".equals(key) && value instanceof NonprofitType) { this.nonprofitStatus((NonprofitType)value); return; }
      if ("aggregateRating".equals(key) && value instanceof AggregateRating) { this.aggregateRating((AggregateRating)value); return; }
      if ("aggregateRatings".equals(key) && value instanceof AggregateRating) { this.aggregateRating((AggregateRating)value); return; }
      if ("leiCode".equals(key) && value instanceof Identifier) { this.leiCode((Identifier)value); return; }
      if ("leiCodes".equals(key) && value instanceof Identifier) { this.leiCode((Identifier)value); return; }
      if ("foundingDate".equals(key) && value instanceof java.util.Date) { this.foundingDate((java.util.Date)value); return; }
      if ("foundingDates".equals(key) && value instanceof java.util.Date) { this.foundingDate((java.util.Date)value); return; }
      if ("ownershipFundingInfo".equals(key) && value instanceof PublishingPrinciples) { this.ownershipFundingInfo((PublishingPrinciples)value); return; }
      if ("ownershipFundingInfos".equals(key) && value instanceof PublishingPrinciples) { this.ownershipFundingInfo((PublishingPrinciples)value); return; }
      if ("member".equals(key) && value instanceof Organization) { this.member((Organization)value); return; }
      if ("members".equals(key) && value instanceof Organization) { this.member((Organization)value); return; }
      if ("member".equals(key) && value instanceof Person) { this.member((Person)value); return; }
      if ("members".equals(key) && value instanceof Person) { this.member((Person)value); return; }
      if ("email".equals(key) && value instanceof String) { this.email((String)value); return; }
      if ("emails".equals(key) && value instanceof String) { this.email((String)value); return; }
      if ("telephone".equals(key) && value instanceof String) { this.telephone((String)value); return; }
      if ("telephones".equals(key) && value instanceof String) { this.telephone((String)value); return; }
      if ("logo".equals(key) && value instanceof Image) { this.logo((Image)value); return; }
      if ("logos".equals(key) && value instanceof Image) { this.logo((Image)value); return; }
      if ("isicV4".equals(key) && value instanceof String) { this.isicV4((String)value); return; }
      if ("isicV4s".equals(key) && value instanceof String) { this.isicV4((String)value); return; }
      if ("diversityStaffingReport".equals(key) && value instanceof PublishingPrinciples) { this.diversityStaffingReport((PublishingPrinciples)value); return; }
      if ("diversityStaffingReports".equals(key) && value instanceof PublishingPrinciples) { this.diversityStaffingReport((PublishingPrinciples)value); return; }
      if ("hasCredential".equals(key) && value instanceof EducationalOccupationalCredential) { this.hasCredential((EducationalOccupationalCredential)value); return; }
      if ("hasCredentials".equals(key) && value instanceof EducationalOccupationalCredential) { this.hasCredential((EducationalOccupationalCredential)value); return; }
      if ("dissolutionDate".equals(key) && value instanceof java.util.Date) { this.dissolutionDate((java.util.Date)value); return; }
      if ("dissolutionDates".equals(key) && value instanceof java.util.Date) { this.dissolutionDate((java.util.Date)value); return; }
      if ("taxID".equals(key) && value instanceof Identifier) { this.taxID((Identifier)value); return; }
      if ("taxIDs".equals(key) && value instanceof Identifier) { this.taxID((Identifier)value); return; }
      if ("foundingLocation".equals(key) && value instanceof Place) { this.foundingLocation((Place)value); return; }
      if ("foundingLocations".equals(key) && value instanceof Place) { this.foundingLocation((Place)value); return; }
      if ("knowsLanguage".equals(key) && value instanceof Language) { this.knowsLanguage((Language)value); return; }
      if ("knowsLanguages".equals(key) && value instanceof Language) { this.knowsLanguage((Language)value); return; }
      if ("knowsLanguage".equals(key) && value instanceof String) { this.knowsLanguage((String)value); return; }
      if ("knowsLanguages".equals(key) && value instanceof String) { this.knowsLanguage((String)value); return; }
      if ("memberOf".equals(key) && value instanceof MemberOf) { this.memberOf((MemberOf)value); return; }
      if ("memberOfs".equals(key) && value instanceof MemberOf) { this.memberOf((MemberOf)value); return; }
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
      if ("hasMerchantReturnPolicy".equals(key) && value instanceof MerchantReturnPolicy) { this.hasMerchantReturnPolicy((MerchantReturnPolicy)value); return; }
      if ("hasMerchantReturnPolicys".equals(key) && value instanceof MerchantReturnPolicy) { this.hasMerchantReturnPolicy((MerchantReturnPolicy)value); return; }
      if ("parentOrganization".equals(key) && value instanceof Organization) { this.parentOrganization((Organization)value); return; }
      if ("parentOrganizations".equals(key) && value instanceof Organization) { this.parentOrganization((Organization)value); return; }
      if ("owns".equals(key) && value instanceof OwnershipInfo) { this.owns((OwnershipInfo)value); return; }
      if ("ownss".equals(key) && value instanceof OwnershipInfo) { this.owns((OwnershipInfo)value); return; }
      if ("owns".equals(key) && value instanceof Product) { this.owns((Product)value); return; }
      if ("ownss".equals(key) && value instanceof Product) { this.owns((Product)value); return; }
      if ("naics".equals(key) && value instanceof String) { this.naics((String)value); return; }
      if ("naicss".equals(key) && value instanceof String) { this.naics((String)value); return; }
      if ("correctionsPolicy".equals(key) && value instanceof PublishingPrinciples) { this.correctionsPolicy((PublishingPrinciples)value); return; }
      if ("correctionsPolicys".equals(key) && value instanceof PublishingPrinciples) { this.correctionsPolicy((PublishingPrinciples)value); return; }
      if ("actionableFeedbackPolicy".equals(key) && value instanceof PublishingPrinciples) { this.actionableFeedbackPolicy((PublishingPrinciples)value); return; }
      if ("actionableFeedbackPolicys".equals(key) && value instanceof PublishingPrinciples) { this.actionableFeedbackPolicy((PublishingPrinciples)value); return; }
      if ("hasOfferCatalog".equals(key) && value instanceof OfferCatalog) { this.hasOfferCatalog((OfferCatalog)value); return; }
      if ("hasOfferCatalogs".equals(key) && value instanceof OfferCatalog) { this.hasOfferCatalog((OfferCatalog)value); return; }
      if ("globalLocationNumber".equals(key) && value instanceof Identifier) { this.globalLocationNumber((Identifier)value); return; }
      if ("globalLocationNumbers".equals(key) && value instanceof Identifier) { this.globalLocationNumber((Identifier)value); return; }
      if ("sponsor".equals(key) && value instanceof Sponsor) { this.sponsor((Sponsor)value); return; }
      if ("sponsors".equals(key) && value instanceof Sponsor) { this.sponsor((Sponsor)value); return; }
      if ("funder".equals(key) && value instanceof Sponsor) { this.funder((Sponsor)value); return; }
      if ("funders".equals(key) && value instanceof Sponsor) { this.funder((Sponsor)value); return; }
      if ("review".equals(key) && value instanceof Review) { this.review((Review)value); return; }
      if ("reviews".equals(key) && value instanceof Review) { this.review((Review)value); return; }
      if ("interactionStatistic".equals(key) && value instanceof InteractionCounter) { this.interactionStatistic((InteractionCounter)value); return; }
      if ("interactionStatistics".equals(key) && value instanceof InteractionCounter) { this.interactionStatistic((InteractionCounter)value); return; }
      if ("faxNumber".equals(key) && value instanceof String) { this.faxNumber((String)value); return; }
      if ("faxNumbers".equals(key) && value instanceof String) { this.faxNumber((String)value); return; }
      if ("employee".equals(key) && value instanceof Person) { this.employee((Person)value); return; }
      if ("employees".equals(key) && value instanceof Person) { this.employee((Person)value); return; }
      if ("award".equals(key) && value instanceof String) { this.award((String)value); return; }
      if ("awards".equals(key) && value instanceof String) { this.award((String)value); return; }
      if ("ethicsPolicy".equals(key) && value instanceof CreativeWork) { this.ethicsPolicy((CreativeWork)value); return; }
      if ("ethicsPolicys".equals(key) && value instanceof CreativeWork) { this.ethicsPolicy((CreativeWork)value); return; }
      if ("ethicsPolicy".equals(key) && value instanceof String) { this.ethicsPolicy((String)value); return; }
      if ("ethicsPolicys".equals(key) && value instanceof String) { this.ethicsPolicy((String)value); return; }
      if ("founder".equals(key) && value instanceof Person) { this.founder((Person)value); return; }
      if ("founders".equals(key) && value instanceof Person) { this.founder((Person)value); return; }
      if ("department".equals(key) && value instanceof Organization) { this.department((Organization)value); return; }
      if ("departments".equals(key) && value instanceof Organization) { this.department((Organization)value); return; }
      if ("hasPOS".equals(key) && value instanceof Place) { this.hasPOS((Place)value); return; }
      if ("hasPOSs".equals(key) && value instanceof Place) { this.hasPOS((Place)value); return; }
      if ("slogan".equals(key) && value instanceof String) { this.slogan((String)value); return; }
      if ("slogans".equals(key) && value instanceof String) { this.slogan((String)value); return; }
      if ("makesOffer".equals(key) && value instanceof Offer) { this.makesOffer((Offer)value); return; }
      if ("makesOffers".equals(key) && value instanceof Offer) { this.makesOffer((Offer)value); return; }
      if ("alumni".equals(key) && value instanceof Person) { this.alumni((Person)value); return; }
      if ("alumnis".equals(key) && value instanceof Person) { this.alumni((Person)value); return; }
      if ("subOrganization".equals(key) && value instanceof Organization) { this.subOrganization((Organization)value); return; }
      if ("subOrganizations".equals(key) && value instanceof Organization) { this.subOrganization((Organization)value); return; }
      super.fromMap(key, value);
    }
  }
  
}
