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
 * A sports club.
 */
public class SportsClub extends SportsActivityLocation {
  protected SportsClub(java.util.Map<String,Object> data) {
    super(data);
  }
  
  /**
   * Builder for {@link SportsClub}
   */
  public static class Builder extends SportsActivityLocation.Builder {
    public Builder(@NotNull HashMap<String,Object> data) {
      super(data);
    }
    @NotNull public SportsClub build() {
      return new SportsClub(myData);
    }
    /**
     * The currency accepted.&lt;br/&gt;&lt;br/&gt;
     * 
     * Use standard formats: &lt;a href=&quot;http://en.wikipedia.org/wiki/ISO_4217&quot;&gt;ISO 4217 currency format&lt;/a&gt; e.g. &quot;USD&quot;; &lt;a href=&quot;https://en.wikipedia.org/wiki/List_of_cryptocurrencies&quot;&gt;Ticker symbol&lt;/a&gt; for cryptocurrencies e.g. &quot;BTC&quot;; well known names for &lt;a href=&quot;https://en.wikipedia.org/wiki/Local_exchange_trading_system&quot;&gt;Local Exchange Tradings Systems&lt;/a&gt; (LETS) and other currency types e.g. &quot;Ithaca HOUR&quot;.
     */
    @NotNull public Builder currenciesAccepted(@NotNull String currenciesAccepted) {
      putValue("currenciesAccepted", currenciesAccepted);
      return this;
    }
    /**
     * The price range of the business, for example &lt;code&gt;$$$&lt;/code&gt;.
     */
    @NotNull public Builder priceRange(@NotNull String priceRange) {
      putValue("priceRange", priceRange);
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
     * The general opening hours for a business. Opening hours can be specified as a weekly time range, starting with days, then times per day. Multiple days can be listed with commas ',' separating each day. Day or time ranges are specified using a hyphen '-'.&lt;br/&gt;&lt;br/&gt;
     * 
     * &lt;ul&gt;
     * &lt;li&gt;Days are specified using the following two-letter combinations: &lt;code&gt;Mo&lt;/code&gt;, &lt;code&gt;Tu&lt;/code&gt;, &lt;code&gt;We&lt;/code&gt;, &lt;code&gt;Th&lt;/code&gt;, &lt;code&gt;Fr&lt;/code&gt;, &lt;code&gt;Sa&lt;/code&gt;, &lt;code&gt;Su&lt;/code&gt;.&lt;/li&gt;
     * &lt;li&gt;Times are specified using 24:00 time. For example, 3pm is specified as &lt;code&gt;15:00&lt;/code&gt;. &lt;/li&gt;
     * &lt;li&gt;Here is an example: &lt;code&gt;&amp;lt;time itemprop=&quot;openingHours&quot; datetime=&amp;quot;Tu,Th 16:00-20:00&amp;quot;&amp;gt;Tuesdays and Thursdays 4-8pm&amp;lt;/time&amp;gt;&lt;/code&gt;.&lt;/li&gt;
     * &lt;li&gt;If a business is open 7 days a week, then it can be specified as &lt;code&gt;&amp;lt;time itemprop=&amp;quot;openingHours&amp;quot; datetime=&amp;quot;Mo-Su&amp;quot;&amp;gt;Monday through Sunday, all day&amp;lt;/time&amp;gt;&lt;/code&gt;.&lt;/li&gt;
     * &lt;/ul&gt;
     * 
     */
    @NotNull public Builder openingHours(@NotNull String openingHours) {
      putValue("openingHours", openingHours);
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
     * For a &lt;a class=&quot;localLink&quot; href=&quot;http://schema.org/NewsMediaOrganization&quot;&gt;NewsMediaOrganization&lt;/a&gt; or other news-related &lt;a class=&quot;localLink&quot; href=&quot;http://schema.org/Organization&quot;&gt;Organization&lt;/a&gt;, a statement about public engagement activities (for news media, the newsroom&rsquo;s), including involving the public - digitally or otherwise -- in coverage decisions, reporting and activities after publication.
     */
    @NotNull public Builder actionableFeedbackPolicy(@NotNull PublishingPrinciples publishingPrinciples) {
      putValue("actionableFeedbackPolicy", publishingPrinciples);
      return this;
    }
    /**
     * Indicates a MerchantReturnPolicy that may be applicable.
     */
    @NotNull public Builder hasMerchantReturnPolicy(@NotNull MerchantReturnPolicy merchantReturnPolicy) {
      putValue("hasMerchantReturnPolicy", merchantReturnPolicy);
      return this;
    }
    /**
     * Indicates a MerchantReturnPolicy that may be applicable.
     */
    @NotNull public Builder hasMerchantReturnPolicy(@NotNull MerchantReturnPolicy.Builder merchantReturnPolicy) {
      putValue("hasMerchantReturnPolicy", merchantReturnPolicy.build());
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
     * The &lt;a href=&quot;http://www.gs1.org/gln&quot;&gt;Global Location Number&lt;/a&gt; (GLN, sometimes also referred to as International Location Number or ILN) of the respective organization, person, or place. The GLN is a 13-digit number used to identify parties and physical locations.
     */
    @NotNull public Builder globalLocationNumber(@NotNull String globalLocationNumber) {
      putValue("globalLocationNumber", globalLocationNumber);
      return this;
    }
    /**
     * For an &lt;a class=&quot;localLink&quot; href=&quot;http://schema.org/Organization&quot;&gt;Organization&lt;/a&gt; (typically a &lt;a class=&quot;localLink&quot; href=&quot;http://schema.org/NewsMediaOrganization&quot;&gt;NewsMediaOrganization&lt;/a&gt;), a statement about policy on use of unnamed sources and the decision process required.
     */
    @NotNull public Builder unnamedSourcesPolicy(@NotNull PublishingPrinciples publishingPrinciples) {
      putValue("unnamedSourcesPolicy", publishingPrinciples);
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
     * For an &lt;a class=&quot;localLink&quot; href=&quot;http://schema.org/Organization&quot;&gt;Organization&lt;/a&gt; (e.g. &lt;a class=&quot;localLink&quot; href=&quot;http://schema.org/NewsMediaOrganization&quot;&gt;NewsMediaOrganization&lt;/a&gt;), a statement describing (in news media, the newsroom&rsquo;s) disclosure and correction policy for errors.
     */
    @NotNull public Builder correctionsPolicy(@NotNull PublishingPrinciples publishingPrinciples) {
      putValue("correctionsPolicy", publishingPrinciples);
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
     * The Value-added Tax ID of the organization or person.
     */
    @NotNull public Builder vatID(@NotNull String vatID) {
      putValue("vatID", vatID);
      return this;
    }
    /**
     * For an &lt;a class=&quot;localLink&quot; href=&quot;http://schema.org/Organization&quot;&gt;Organization&lt;/a&gt; (often but not necessarily a &lt;a class=&quot;localLink&quot; href=&quot;http://schema.org/NewsMediaOrganization&quot;&gt;NewsMediaOrganization&lt;/a&gt;), a description of organizational ownership structure; funding and grants. In a news/media setting, this is with particular reference to editorial independence.   Note that the &lt;a class=&quot;localLink&quot; href=&quot;http://schema.org/funder&quot;&gt;funder&lt;/a&gt; is also available and can be used to make basic funder information machine-readable.
     */
    @NotNull public Builder ownershipFundingInfo(@NotNull PublishingPrinciples publishingPrinciples) {
      putValue("ownershipFundingInfo", publishingPrinciples);
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
     * The Dun &amp;amp; Bradstreet DUNS number for identifying an organization or business person.
     */
    @NotNull public Builder duns(@NotNull String duns) {
      putValue("duns", duns);
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
     * For an &lt;a class=&quot;localLink&quot; href=&quot;http://schema.org/Organization&quot;&gt;Organization&lt;/a&gt; (often but not necessarily a &lt;a class=&quot;localLink&quot; href=&quot;http://schema.org/NewsMediaOrganization&quot;&gt;NewsMediaOrganization&lt;/a&gt;), a report on staffing diversity issues. In a news context this might be for example ASNE or RTDNA (US) reports, or self-reported.
     */
    @NotNull public Builder diversityStaffingReport(@NotNull PublishingPrinciples publishingPrinciples) {
      putValue("diversityStaffingReport", publishingPrinciples);
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
     * The Tax / Fiscal ID of the organization or person, e.g. the TIN in the US or the CIF/NIF in Spain.
     */
    @NotNull public Builder taxID(@NotNull Identifier identifier) {
      putValue("taxID", identifier);
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
     * The date that this organization was founded.
     */
    @NotNull public Builder foundingDate(@NotNull java.util.Date date) {
      putValue("foundingDate", date);
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
     * A slogan or motto associated with the item.
     */
    @NotNull public Builder slogan(@NotNull String slogan) {
      putValue("slogan", slogan);
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
     * Statement about ethics policy, e.g. of a &lt;a class=&quot;localLink&quot; href=&quot;http://schema.org/NewsMediaOrganization&quot;&gt;NewsMediaOrganization&lt;/a&gt; regarding journalistic and publishing practices, or of a &lt;a class=&quot;localLink&quot; href=&quot;http://schema.org/Restaurant&quot;&gt;Restaurant&lt;/a&gt;, a page describing food source policies. In the case of a &lt;a class=&quot;localLink&quot; href=&quot;http://schema.org/NewsMediaOrganization&quot;&gt;NewsMediaOrganization&lt;/a&gt;, an ethicsPolicy is typically a statement describing the personal, organizational, and corporate standards of behavior expected by the organization.
     */
    @NotNull public Builder ethicsPolicy(@NotNull CreativeWork creativeWork) {
      putValue("ethicsPolicy", creativeWork);
      return this;
    }
    /**
     * Statement about ethics policy, e.g. of a &lt;a class=&quot;localLink&quot; href=&quot;http://schema.org/NewsMediaOrganization&quot;&gt;NewsMediaOrganization&lt;/a&gt; regarding journalistic and publishing practices, or of a &lt;a class=&quot;localLink&quot; href=&quot;http://schema.org/Restaurant&quot;&gt;Restaurant&lt;/a&gt;, a page describing food source policies. In the case of a &lt;a class=&quot;localLink&quot; href=&quot;http://schema.org/NewsMediaOrganization&quot;&gt;NewsMediaOrganization&lt;/a&gt;, an ethicsPolicy is typically a statement describing the personal, organizational, and corporate standards of behavior expected by the organization.
     */
    @NotNull public Builder ethicsPolicy(@NotNull CreativeWork.Builder creativeWork) {
      putValue("ethicsPolicy", creativeWork.build());
      return this;
    }
    /**
     * Statement about ethics policy, e.g. of a &lt;a class=&quot;localLink&quot; href=&quot;http://schema.org/NewsMediaOrganization&quot;&gt;NewsMediaOrganization&lt;/a&gt; regarding journalistic and publishing practices, or of a &lt;a class=&quot;localLink&quot; href=&quot;http://schema.org/Restaurant&quot;&gt;Restaurant&lt;/a&gt;, a page describing food source policies. In the case of a &lt;a class=&quot;localLink&quot; href=&quot;http://schema.org/NewsMediaOrganization&quot;&gt;NewsMediaOrganization&lt;/a&gt;, an ethicsPolicy is typically a statement describing the personal, organizational, and corporate standards of behavior expected by the organization.
     */
    @NotNull public Builder ethicsPolicy(@NotNull String ethicsPolicy) {
      putValue("ethicsPolicy", ethicsPolicy);
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
     * Statement on diversity policy by an &lt;a class=&quot;localLink&quot; href=&quot;http://schema.org/Organization&quot;&gt;Organization&lt;/a&gt; e.g. a &lt;a class=&quot;localLink&quot; href=&quot;http://schema.org/NewsMediaOrganization&quot;&gt;NewsMediaOrganization&lt;/a&gt;. For a &lt;a class=&quot;localLink&quot; href=&quot;http://schema.org/NewsMediaOrganization&quot;&gt;NewsMediaOrganization&lt;/a&gt;, a statement describing the newsroom&rsquo;s diversity policy on both staffing and sources, typically providing staffing data.
     */
    @NotNull public Builder diversityPolicy(@NotNull CreativeWork creativeWork) {
      putValue("diversityPolicy", creativeWork);
      return this;
    }
    /**
     * Statement on diversity policy by an &lt;a class=&quot;localLink&quot; href=&quot;http://schema.org/Organization&quot;&gt;Organization&lt;/a&gt; e.g. a &lt;a class=&quot;localLink&quot; href=&quot;http://schema.org/NewsMediaOrganization&quot;&gt;NewsMediaOrganization&lt;/a&gt;. For a &lt;a class=&quot;localLink&quot; href=&quot;http://schema.org/NewsMediaOrganization&quot;&gt;NewsMediaOrganization&lt;/a&gt;, a statement describing the newsroom&rsquo;s diversity policy on both staffing and sources, typically providing staffing data.
     */
    @NotNull public Builder diversityPolicy(@NotNull CreativeWork.Builder creativeWork) {
      putValue("diversityPolicy", creativeWork.build());
      return this;
    }
    /**
     * Statement on diversity policy by an &lt;a class=&quot;localLink&quot; href=&quot;http://schema.org/Organization&quot;&gt;Organization&lt;/a&gt; e.g. a &lt;a class=&quot;localLink&quot; href=&quot;http://schema.org/NewsMediaOrganization&quot;&gt;NewsMediaOrganization&lt;/a&gt;. For a &lt;a class=&quot;localLink&quot; href=&quot;http://schema.org/NewsMediaOrganization&quot;&gt;NewsMediaOrganization&lt;/a&gt;, a statement describing the newsroom&rsquo;s diversity policy on both staffing and sources, typically providing staffing data.
     */
    @NotNull public Builder diversityPolicy(@NotNull String diversityPolicy) {
      putValue("diversityPolicy", diversityPolicy);
      return this;
    }
    /**
     * The larger organization that this organization is a &lt;a class=&quot;localLink&quot; href=&quot;http://schema.org/subOrganization&quot;&gt;subOrganization&lt;/a&gt; of, if any.
     */
    @NotNull public Builder parentOrganization(@NotNull Organization organization) {
      putValue("parentOrganization", organization);
      return this;
    }
    /**
     * The larger organization that this organization is a &lt;a class=&quot;localLink&quot; href=&quot;http://schema.org/subOrganization&quot;&gt;subOrganization&lt;/a&gt; of, if any.
     */
    @NotNull public Builder parentOrganization(@NotNull Organization.Builder organization) {
      putValue("parentOrganization", organization.build());
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
      super.fromMap(key, value);
    }
  }
  
}
