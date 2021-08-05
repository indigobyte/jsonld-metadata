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
 * A patient is any person recipient of health care services.Equivalent class: http://purl.bioontology.org/ontology/SNOMEDCT/116154003
 */
public class Patient extends Person {
  /**
   * One or more alternative conditions considered in the differential diagnosis process as output of a diagnosis process.
   */
  @JsonIgnore public MedicalCondition getDiagnosis() {
    return (MedicalCondition) getValue("diagnosis");
  }
  /**
   * One or more alternative conditions considered in the differential diagnosis process as output of a diagnosis process.
   */
  @JsonIgnore public Collection<MedicalCondition> getDiagnosiss() {
    final Object current = myData.get("diagnosis");
    if (current == null) return Collections.emptyList();
    if (current instanceof Collection) {
      return (Collection<MedicalCondition>) current;
    }
    return Arrays.asList((MedicalCondition) current);
  }
  /**
   * Specifying a drug or medicine used in a medication procedure
   */
  @JsonIgnore public Drug getDrug() {
    return (Drug) getValue("drug");
  }
  /**
   * Specifying a drug or medicine used in a medication procedure
   */
  @JsonIgnore public Collection<Drug> getDrugs() {
    final Object current = myData.get("drug");
    if (current == null) return Collections.emptyList();
    if (current instanceof Collection) {
      return (Collection<Drug>) current;
    }
    return Arrays.asList((Drug) current);
  }
  /**
   * Specifying the health condition(s) of a patient, medical study, or other target audience.
   */
  @JsonIgnore public MedicalCondition getHealthCondition() {
    return (MedicalCondition) getValue("healthCondition");
  }
  /**
   * Specifying the health condition(s) of a patient, medical study, or other target audience.
   */
  @JsonIgnore public Collection<MedicalCondition> getHealthConditions() {
    final Object current = myData.get("healthCondition");
    if (current == null) return Collections.emptyList();
    if (current instanceof Collection) {
      return (Collection<MedicalCondition>) current;
    }
    return Arrays.asList((MedicalCondition) current);
  }
  protected Patient(java.util.Map<String,Object> data) {
    super(data);
  }
  
  /**
   * Builder for {@link Patient}
   */
  public static class Builder extends Person.Builder {
    public Builder(@NotNull HashMap<String,Object> data) {
      super(data);
    }
    @NotNull public Patient build() {
      return new Patient(myData);
    }
    /**
     * One or more alternative conditions considered in the differential diagnosis process as output of a diagnosis process.
     */
    @NotNull public Builder diagnosis(@NotNull MedicalCondition medicalCondition) {
      putValue("diagnosis", medicalCondition);
      return this;
    }
    /**
     * One or more alternative conditions considered in the differential diagnosis process as output of a diagnosis process.
     */
    @NotNull public Builder diagnosis(@NotNull MedicalCondition.Builder medicalCondition) {
      putValue("diagnosis", medicalCondition.build());
      return this;
    }
    /**
     * Specifying a drug or medicine used in a medication procedure
     */
    @NotNull public Builder drug(@NotNull Drug drug) {
      putValue("drug", drug);
      return this;
    }
    /**
     * Specifying a drug or medicine used in a medication procedure
     */
    @NotNull public Builder drug(@NotNull Drug.Builder drug) {
      putValue("drug", drug.build());
      return this;
    }
    /**
     * Specifying the health condition(s) of a patient, medical study, or other target audience.
     */
    @NotNull public Builder healthCondition(@NotNull MedicalCondition medicalCondition) {
      putValue("healthCondition", medicalCondition);
      return this;
    }
    /**
     * Specifying the health condition(s) of a patient, medical study, or other target audience.
     */
    @NotNull public Builder healthCondition(@NotNull MedicalCondition.Builder medicalCondition) {
      putValue("healthCondition", medicalCondition.build());
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
     * The fax number.
     */
    @NotNull public Builder faxNumber(@NotNull String faxNumber) {
      putValue("faxNumber", faxNumber);
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
     * The &lt;a href=&quot;http://www.gs1.org/gln&quot;&gt;Global Location Number&lt;/a&gt; (GLN, sometimes also referred to as International Location Number or ILN) of the respective organization, person, or place. The GLN is a 13-digit number used to identify parties and physical locations.
     */
    @NotNull public Builder globalLocationNumber(@NotNull String globalLocationNumber) {
      putValue("globalLocationNumber", globalLocationNumber);
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
     * Of a &lt;a class=&quot;localLink&quot; href=&quot;http://schema.org/Person&quot;&gt;Person&lt;/a&gt;, and less typically of an &lt;a class=&quot;localLink&quot; href=&quot;http://schema.org/Organization&quot;&gt;Organization&lt;/a&gt;, to indicate a topic that is known about - suggesting possible expertise but not implying it. We do not distinguish skill levels here, or relate this to educational content, events, objectives or &lt;a class=&quot;localLink&quot; href=&quot;http://schema.org/JobPosting&quot;&gt;JobPosting&lt;/a&gt; descriptions.
     */
    @NotNull public Builder knowsAbout(@NotNull String knowsAbout) {
      putValue("knowsAbout", knowsAbout);
      return this;
    }
    /**
     * Of a &lt;a class=&quot;localLink&quot; href=&quot;http://schema.org/Person&quot;&gt;Person&lt;/a&gt;, and less typically of an &lt;a class=&quot;localLink&quot; href=&quot;http://schema.org/Organization&quot;&gt;Organization&lt;/a&gt;, to indicate a topic that is known about - suggesting possible expertise but not implying it. We do not distinguish skill levels here, or relate this to educational content, events, objectives or &lt;a class=&quot;localLink&quot; href=&quot;http://schema.org/JobPosting&quot;&gt;JobPosting&lt;/a&gt; descriptions.
     */
    @NotNull public Builder knowsAbout(@NotNull Thing thing) {
      putValue("knowsAbout", thing);
      return this;
    }
    /**
     * Of a &lt;a class=&quot;localLink&quot; href=&quot;http://schema.org/Person&quot;&gt;Person&lt;/a&gt;, and less typically of an &lt;a class=&quot;localLink&quot; href=&quot;http://schema.org/Organization&quot;&gt;Organization&lt;/a&gt;, to indicate a topic that is known about - suggesting possible expertise but not implying it. We do not distinguish skill levels here, or relate this to educational content, events, objectives or &lt;a class=&quot;localLink&quot; href=&quot;http://schema.org/JobPosting&quot;&gt;JobPosting&lt;/a&gt; descriptions.
     */
    @NotNull public Builder knowsAbout(@NotNull Thing.Builder thing) {
      putValue("knowsAbout", thing.build());
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
     * The Value-added Tax ID of the organization or person.
     */
    @NotNull public Builder vatID(@NotNull String vatID) {
      putValue("vatID", vatID);
      return this;
    }
    /**
     * Gender of something, typically a &lt;a class=&quot;localLink&quot; href=&quot;http://schema.org/Person&quot;&gt;Person&lt;/a&gt;, but possibly also fictional characters, animals, etc. While http://schema.org/Male and http://schema.org/Female may be used, text strings are also acceptable for people who do not identify as a binary gender. The &lt;a class=&quot;localLink&quot; href=&quot;http://schema.org/gender&quot;&gt;gender&lt;/a&gt; property can also be used in an extended sense to cover e.g. the gender of sports teams. As with the gender of individuals, we do not try to enumerate all possibilities. A mixed-gender &lt;a class=&quot;localLink&quot; href=&quot;http://schema.org/SportsTeam&quot;&gt;SportsTeam&lt;/a&gt; can be indicated with a text value of &quot;Mixed&quot;.
     */
    @NotNull public Builder gender(@NotNull GenderType genderType) {
      putValue("gender", genderType);
      return this;
    }
    /**
     * Gender of something, typically a &lt;a class=&quot;localLink&quot; href=&quot;http://schema.org/Person&quot;&gt;Person&lt;/a&gt;, but possibly also fictional characters, animals, etc. While http://schema.org/Male and http://schema.org/Female may be used, text strings are also acceptable for people who do not identify as a binary gender. The &lt;a class=&quot;localLink&quot; href=&quot;http://schema.org/gender&quot;&gt;gender&lt;/a&gt; property can also be used in an extended sense to cover e.g. the gender of sports teams. As with the gender of individuals, we do not try to enumerate all possibilities. A mixed-gender &lt;a class=&quot;localLink&quot; href=&quot;http://schema.org/SportsTeam&quot;&gt;SportsTeam&lt;/a&gt; can be indicated with a text value of &quot;Mixed&quot;.
     */
    @NotNull public Builder gender(@NotNull String gender) {
      putValue("gender", gender);
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
     * An award won by or for this item.
     */
    @NotNull public Builder award(@NotNull String award) {
      putValue("award", award);
      return this;
    }
    /**
     * The Dun &amp;amp; Bradstreet DUNS number for identifying an organization or business person.
     */
    @NotNull public Builder duns(@NotNull String duns) {
      putValue("duns", duns);
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
     * Of a &lt;a class=&quot;localLink&quot; href=&quot;http://schema.org/Person&quot;&gt;Person&lt;/a&gt;, and less typically of an &lt;a class=&quot;localLink&quot; href=&quot;http://schema.org/Organization&quot;&gt;Organization&lt;/a&gt;, to indicate a known language. We do not distinguish skill levels or reading/writing/speaking/signing here. Use language codes from the &lt;a href=&quot;http://tools.ietf.org/html/bcp47&quot;&gt;IETF BCP 47 standard&lt;/a&gt;.
     */
    @NotNull public Builder knowsLanguage(@NotNull Language language) {
      putValue("knowsLanguage", language);
      return this;
    }
    /**
     * Of a &lt;a class=&quot;localLink&quot; href=&quot;http://schema.org/Person&quot;&gt;Person&lt;/a&gt;, and less typically of an &lt;a class=&quot;localLink&quot; href=&quot;http://schema.org/Organization&quot;&gt;Organization&lt;/a&gt;, to indicate a known language. We do not distinguish skill levels or reading/writing/speaking/signing here. Use language codes from the &lt;a href=&quot;http://tools.ietf.org/html/bcp47&quot;&gt;IETF BCP 47 standard&lt;/a&gt;.
     */
    @NotNull public Builder knowsLanguage(@NotNull Language.Builder language) {
      putValue("knowsLanguage", language.build());
      return this;
    }
    /**
     * Of a &lt;a class=&quot;localLink&quot; href=&quot;http://schema.org/Person&quot;&gt;Person&lt;/a&gt;, and less typically of an &lt;a class=&quot;localLink&quot; href=&quot;http://schema.org/Organization&quot;&gt;Organization&lt;/a&gt;, to indicate a known language. We do not distinguish skill levels or reading/writing/speaking/signing here. Use language codes from the &lt;a href=&quot;http://tools.ietf.org/html/bcp47&quot;&gt;IETF BCP 47 standard&lt;/a&gt;.
     */
    @NotNull public Builder knowsLanguage(@NotNull String knowsLanguage) {
      putValue("knowsLanguage", knowsLanguage);
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
     * An honorific prefix preceding a Person's name such as Dr/Mrs/Mr.
     */
    @NotNull public Builder honorificPrefix(@NotNull String honorificPrefix) {
      putValue("honorificPrefix", honorificPrefix);
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
     * Family name. In the U.S., the last name of an Person. This can be used along with givenName instead of the name property.
     */
    @NotNull public Builder familyName(@NotNull String familyName) {
      putValue("familyName", familyName);
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
     * Date of death.
     */
    @NotNull public Builder deathDate(@NotNull java.util.Date date) {
      putValue("deathDate", date);
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
     * A &lt;a href=&quot;https://en.wikipedia.org/wiki/Call_sign&quot;&gt;callsign&lt;/a&gt;, as used in broadcasting and radio communications to identify people, radio and TV stations, or vehicles.
     */
    @NotNull public Builder callSign(@NotNull Identifier identifier) {
      putValue("callSign", identifier);
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
     * The International Standard of Industrial Classification of All Economic Activities (ISIC), Revision 4 code for a particular organization, business person, or place.
     */
    @NotNull public Builder isicV4(@NotNull String isicV4) {
      putValue("isicV4", isicV4);
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
     * Given name. In the U.S., the first name of a Person. This can be used along with familyName instead of the name property.
     */
    @NotNull public Builder givenName(@NotNull String givenName) {
      putValue("givenName", givenName);
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
     * An additional name for a Person, can be used for a middle name.
     */
    @NotNull public Builder additionalName(@NotNull String additionalName) {
      putValue("additionalName", additionalName);
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
     * An Organization (or ProgramMembership) to which this Person or Organization belongs.
     */
    @NotNull public Builder memberOf(@NotNull MemberOf memberOf) {
      putValue("memberOf", memberOf);
      return this;
    }
    /**
     * An honorific suffix preceding a Person's name such as M.D. /PhD/MSCSW.
     */
    @NotNull public Builder honorificSuffix(@NotNull String honorificSuffix) {
      putValue("honorificSuffix", honorificSuffix);
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
     * A contact location for a person's place of work.
     */
    @NotNull public Builder workLocation(@NotNull Location location) {
      putValue("workLocation", location);
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
      if ("diagnosis".equals(key) && value instanceof MedicalCondition) { this.diagnosis((MedicalCondition)value); return; }
      if ("diagnosiss".equals(key) && value instanceof MedicalCondition) { this.diagnosis((MedicalCondition)value); return; }
      if ("drug".equals(key) && value instanceof Drug) { this.drug((Drug)value); return; }
      if ("drugs".equals(key) && value instanceof Drug) { this.drug((Drug)value); return; }
      if ("healthCondition".equals(key) && value instanceof MedicalCondition) { this.healthCondition((MedicalCondition)value); return; }
      if ("healthConditions".equals(key) && value instanceof MedicalCondition) { this.healthCondition((MedicalCondition)value); return; }
      super.fromMap(key, value);
    }
  }
  
}
