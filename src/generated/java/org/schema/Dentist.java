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
import org.jetbrains.annotations.Nullable;
import java.util.*;

/**
 * A dentist.
 */
public class Dentist extends MedicalOrganization {
  protected Dentist(java.util.Map<String,java.lang.Object> data) {
    super(data);
  }
  /**
   * @return new {@link Builder} initialized with this instance's data
   */
  @NotNull public Builder toBuilder() {
    return new Builder(new HashMap<>(this.myData));
  }
  
  /**
   * Builder for {@link Dentist}
   */
  public static class Builder extends MedicalOrganization.Builder {
    public Builder(@NotNull HashMap<String,java.lang.Object> data) {
      super(data);
    }
    @NotNull public Dentist build() {
      return new Dentist(myData);
    }
    /**
     * Whether the provider is accepting new patients.
     * @param isAcceptingNewPatients value to set
     * @return this builder instance
     */
    @NotNull public Builder isAcceptingNewPatients(@NotNull Boolean isAcceptingNewPatients) {
      putValue("isAcceptingNewPatients", isAcceptingNewPatients);
      return this;
    }
    /**
     * Remove isAcceptingNewPatients property from the builder.
     * If this property is repeatable, all instances are removed.
     * @return this builder instance
     */
    @NotNull public Builder removeIsAcceptingNewPatients() {
      removeValue("isAcceptingNewPatients");
      return this;
    }
    /**
     * Get currently set value for isAcceptingNewPatients property in this builder.
     * @return previously set value or {@code null}. If multiple values have been 
     * set to this property, then {@link java.util.Collection} instance will be 
     * returned.
     */
    @Nullable public java.lang.Object getIsAcceptingNewPatients() {
      return myData.get("isAcceptingNewPatients");
    }
    /**
     * Name or unique ID of network. (Networks are often reused across different insurance plans).
     * @param healthPlanNetworkId value to set
     * @return this builder instance
     */
    @NotNull public Builder healthPlanNetworkId(@NotNull String healthPlanNetworkId) {
      putValue("healthPlanNetworkId", healthPlanNetworkId);
      return this;
    }
    /**
     * Remove healthPlanNetworkId property from the builder.
     * If this property is repeatable, all instances are removed.
     * @return this builder instance
     */
    @NotNull public Builder removeHealthPlanNetworkId() {
      removeValue("healthPlanNetworkId");
      return this;
    }
    /**
     * Get currently set value for healthPlanNetworkId property in this builder.
     * @return previously set value or {@code null}. If multiple values have been 
     * set to this property, then {@link java.util.Collection} instance will be 
     * returned.
     */
    @Nullable public java.lang.Object getHealthPlanNetworkId() {
      return myData.get("healthPlanNetworkId");
    }
    /**
     * A medical specialty of the provider.
     * @param medicalSpecialty value to set
     * @return this builder instance
     */
    @NotNull public Builder medicalSpecialty(@NotNull MedicalSpecialty medicalSpecialty) {
      putValue("medicalSpecialty", medicalSpecialty);
      return this;
    }
    /**
     * Remove medicalSpecialty property from the builder.
     * If this property is repeatable, all instances are removed.
     * @return this builder instance
     */
    @NotNull public Builder removeMedicalSpecialty() {
      removeValue("medicalSpecialty");
      return this;
    }
    /**
     * Get currently set value for medicalSpecialty property in this builder.
     * @return previously set value or {@code null}. If multiple values have been 
     * set to this property, then {@link java.util.Collection} instance will be 
     * returned.
     */
    @Nullable public java.lang.Object getMedicalSpecialty() {
      return myData.get("medicalSpecialty");
    }
    /**
     *                                         The publishingPrinciples property indicates (typically via [[URL]]) a document describing the editorial principles of an [[Organization]] (or individual e.g. a [[Person]] writing a blog) that relate to their activities as a publisher, e.g. ethics or diversity policies. When applied to a [[CreativeWork]] (e.g. [[NewsArticle]]) the principles are those of the party primarily responsible for the creation of the [[CreativeWork]].
     * 
     * While such policies are most typically expressed in natural language, sometimes related information (e.g. indicating a [[funder]]) can be expressed using schema.org terminology.
     * 
     *                                         @param publishingPrinciples value to set
     *                                         @return this builder instance
     */
    @NotNull public Builder publishingPrinciples(@NotNull PublishingPrinciples publishingPrinciples) {
      putValue("publishingPrinciples", publishingPrinciples);
      return this;
    }
    /**
     * Remove publishingPrinciples property from the builder.
     * If this property is repeatable, all instances are removed.
     * @return this builder instance
     */
    @NotNull public Builder removePublishingPrinciples() {
      removeValue("publishingPrinciples");
      return this;
    }
    /**
     * Get currently set value for publishingPrinciples property in this builder.
     * @return previously set value or {@code null}. If multiple values have been 
     * set to this property, then {@link java.util.Collection} instance will be 
     * returned.
     */
    @Nullable public java.lang.Object getPublishingPrinciples() {
      return myData.get("publishingPrinciples");
    }
    /**
     * The number of employees in an organization e.g. business.
     * @param quantitativeValue value to set
     * @return this builder instance
     */
    @NotNull public Builder numberOfEmployees(@NotNull QuantitativeValue quantitativeValue) {
      putValue("numberOfEmployees", quantitativeValue);
      return this;
    }
    /**
     * The number of employees in an organization e.g. business.
     * @param quantitativeValue value to set
     * @return this builder instance
     */
    @NotNull public Builder numberOfEmployees(@NotNull QuantitativeValue.Builder quantitativeValue) {
      putValue("numberOfEmployees", quantitativeValue.build());
      return this;
    }
    /**
     * Remove numberOfEmployees property from the builder.
     * If this property is repeatable, all instances are removed.
     * @return this builder instance
     */
    @NotNull public Builder removeNumberOfEmployees() {
      removeValue("numberOfEmployees");
      return this;
    }
    /**
     * Get currently set value for numberOfEmployees property in this builder.
     * @return previously set value or {@code null}. If multiple values have been 
     * set to this property, then {@link java.util.Collection} instance will be 
     * returned.
     */
    @Nullable public java.lang.Object getNumberOfEmployees() {
      return myData.get("numberOfEmployees");
    }
    /**
     * Of a [[Person]], and less typically of an [[Organization]], to indicate a topic that is known about - suggesting possible expertise but not implying it. We do not distinguish skill levels here, or relate this to educational content, events, objectives or [[JobPosting]] descriptions.
     * @param knowsAbout value to set
     * @return this builder instance
     */
    @NotNull public Builder knowsAbout(@NotNull String knowsAbout) {
      putValue("knowsAbout", knowsAbout);
      return this;
    }
    /**
     * Of a [[Person]], and less typically of an [[Organization]], to indicate a topic that is known about - suggesting possible expertise but not implying it. We do not distinguish skill levels here, or relate this to educational content, events, objectives or [[JobPosting]] descriptions.
     * @param thing value to set
     * @return this builder instance
     */
    @NotNull public Builder knowsAbout(@NotNull Thing thing) {
      putValue("knowsAbout", thing);
      return this;
    }
    /**
     * Of a [[Person]], and less typically of an [[Organization]], to indicate a topic that is known about - suggesting possible expertise but not implying it. We do not distinguish skill levels here, or relate this to educational content, events, objectives or [[JobPosting]] descriptions.
     * @param thing value to set
     * @return this builder instance
     */
    @NotNull public Builder knowsAbout(@NotNull Thing.Builder thing) {
      putValue("knowsAbout", thing.build());
      return this;
    }
    /**
     * Remove knowsAbout property from the builder.
     * If this property is repeatable, all instances are removed.
     * @return this builder instance
     */
    @NotNull public Builder removeKnowsAbout() {
      removeValue("knowsAbout");
      return this;
    }
    /**
     * Get currently set value for knowsAbout property in this builder.
     * @return previously set value or {@code null}. If multiple values have been 
     * set to this property, then {@link java.util.Collection} instance will be 
     * returned.
     */
    @Nullable public java.lang.Object getKnowsAbout() {
      return myData.get("knowsAbout");
    }
    /**
     * Upcoming or past event associated with this place, organization, or action.
     * @param event value to set
     * @return this builder instance
     */
    @NotNull public Builder event(@NotNull Event event) {
      putValue("event", event);
      return this;
    }
    /**
     * Upcoming or past event associated with this place, organization, or action.
     * @param event value to set
     * @return this builder instance
     */
    @NotNull public Builder event(@NotNull Event.Builder event) {
      putValue("event", event.build());
      return this;
    }
    /**
     * Remove event property from the builder.
     * If this property is repeatable, all instances are removed.
     * @return this builder instance
     */
    @NotNull public Builder removeEvent() {
      removeValue("event");
      return this;
    }
    /**
     * Get currently set value for event property in this builder.
     * @return previously set value or {@code null}. If multiple values have been 
     * set to this property, then {@link java.util.Collection} instance will be 
     * returned.
     */
    @Nullable public java.lang.Object getEvent() {
      return myData.get("event");
    }
    /**
     * Statement on diversity policy by an [[Organization]] e.g. a [[NewsMediaOrganization]]. For a [[NewsMediaOrganization]], a statement describing the newsroom&rsquo;s diversity policy on both staffing and sources, typically providing staffing data.
     * @param creativeWork value to set
     * @return this builder instance
     */
    @NotNull public Builder diversityPolicy(@NotNull CreativeWork creativeWork) {
      putValue("diversityPolicy", creativeWork);
      return this;
    }
    /**
     * Statement on diversity policy by an [[Organization]] e.g. a [[NewsMediaOrganization]]. For a [[NewsMediaOrganization]], a statement describing the newsroom&rsquo;s diversity policy on both staffing and sources, typically providing staffing data.
     * @param creativeWork value to set
     * @return this builder instance
     */
    @NotNull public Builder diversityPolicy(@NotNull CreativeWork.Builder creativeWork) {
      putValue("diversityPolicy", creativeWork.build());
      return this;
    }
    /**
     * Statement on diversity policy by an [[Organization]] e.g. a [[NewsMediaOrganization]]. For a [[NewsMediaOrganization]], a statement describing the newsroom&rsquo;s diversity policy on both staffing and sources, typically providing staffing data.
     * @param diversityPolicy value to set
     * @return this builder instance
     */
    @NotNull public Builder diversityPolicy(@NotNull String diversityPolicy) {
      putValue("diversityPolicy", diversityPolicy);
      return this;
    }
    /**
     * Remove diversityPolicy property from the builder.
     * If this property is repeatable, all instances are removed.
     * @return this builder instance
     */
    @NotNull public Builder removeDiversityPolicy() {
      removeValue("diversityPolicy");
      return this;
    }
    /**
     * Get currently set value for diversityPolicy property in this builder.
     * @return previously set value or {@code null}. If multiple values have been 
     * set to this property, then {@link java.util.Collection} instance will be 
     * returned.
     */
    @Nullable public java.lang.Object getDiversityPolicy() {
      return myData.get("diversityPolicy");
    }
    /**
     * A pointer to products or services sought by the organization or person (demand).
     * @param demand value to set
     * @return this builder instance
     */
    @NotNull public Builder seeks(@NotNull Demand demand) {
      putValue("seeks", demand);
      return this;
    }
    /**
     * A pointer to products or services sought by the organization or person (demand).
     * @param demand value to set
     * @return this builder instance
     */
    @NotNull public Builder seeks(@NotNull Demand.Builder demand) {
      putValue("seeks", demand.build());
      return this;
    }
    /**
     * Remove seeks property from the builder.
     * If this property is repeatable, all instances are removed.
     * @return this builder instance
     */
    @NotNull public Builder removeSeeks() {
      removeValue("seeks");
      return this;
    }
    /**
     * Get currently set value for seeks property in this builder.
     * @return previously set value or {@code null}. If multiple values have been 
     * set to this property, then {@link java.util.Collection} instance will be 
     * returned.
     */
    @Nullable public java.lang.Object getSeeks() {
      return myData.get("seeks");
    }
    /**
     * The location of, for example, where an event is happening, where an organization is located, or where an action takes place.
     * @param location value to set
     * @return this builder instance
     */
    @NotNull public Builder location(@NotNull Location location) {
      putValue("location", location);
      return this;
    }
    /**
     * Remove location property from the builder.
     * If this property is repeatable, all instances are removed.
     * @return this builder instance
     */
    @NotNull public Builder removeLocation() {
      removeValue("location");
      return this;
    }
    /**
     * Get currently set value for location property in this builder.
     * @return previously set value or {@code null}. If multiple values have been 
     * set to this property, then {@link java.util.Collection} instance will be 
     * returned.
     */
    @Nullable public java.lang.Object getLocation() {
      return myData.get("location");
    }
    /**
     * For an [[Organization]] (typically a [[NewsMediaOrganization]]), a statement about policy on use of unnamed sources and the decision process required.
     * @param publishingPrinciples value to set
     * @return this builder instance
     */
    @NotNull public Builder unnamedSourcesPolicy(@NotNull PublishingPrinciples publishingPrinciples) {
      putValue("unnamedSourcesPolicy", publishingPrinciples);
      return this;
    }
    /**
     * Remove unnamedSourcesPolicy property from the builder.
     * If this property is repeatable, all instances are removed.
     * @return this builder instance
     */
    @NotNull public Builder removeUnnamedSourcesPolicy() {
      removeValue("unnamedSourcesPolicy");
      return this;
    }
    /**
     * Get currently set value for unnamedSourcesPolicy property in this builder.
     * @return previously set value or {@code null}. If multiple values have been 
     * set to this property, then {@link java.util.Collection} instance will be 
     * returned.
     */
    @Nullable public java.lang.Object getUnnamedSourcesPolicy() {
      return myData.get("unnamedSourcesPolicy");
    }
    /**
     * The Dun &amp; Bradstreet DUNS number for identifying an organization or business person.
     * @param identifier value to set
     * @return this builder instance
     */
    @NotNull public Builder duns(@NotNull Identifier identifier) {
      putValue("duns", identifier);
      return this;
    }
    /**
     * Remove duns property from the builder.
     * If this property is repeatable, all instances are removed.
     * @return this builder instance
     */
    @NotNull public Builder removeDuns() {
      removeValue("duns");
      return this;
    }
    /**
     * Get currently set value for duns property in this builder.
     * @return previously set value or {@code null}. If multiple values have been 
     * set to this property, then {@link java.util.Collection} instance will be 
     * returned.
     */
    @Nullable public java.lang.Object getDuns() {
      return myData.get("duns");
    }
    /**
     * A contact point for a person or organization.
     * @param contactPoint value to set
     * @return this builder instance
     */
    @NotNull public Builder contactPoint(@NotNull ContactPoint contactPoint) {
      putValue("contactPoint", contactPoint);
      return this;
    }
    /**
     * A contact point for a person or organization.
     * @param contactPoint value to set
     * @return this builder instance
     */
    @NotNull public Builder contactPoint(@NotNull ContactPoint.Builder contactPoint) {
      putValue("contactPoint", contactPoint.build());
      return this;
    }
    /**
     * Remove contactPoint property from the builder.
     * If this property is repeatable, all instances are removed.
     * @return this builder instance
     */
    @NotNull public Builder removeContactPoint() {
      removeValue("contactPoint");
      return this;
    }
    /**
     * Get currently set value for contactPoint property in this builder.
     * @return previously set value or {@code null}. If multiple values have been 
     * set to this property, then {@link java.util.Collection} instance will be 
     * returned.
     */
    @Nullable public java.lang.Object getContactPoint() {
      return myData.get("contactPoint");
    }
    /**
     * The official name of the organization, e.g. the registered company name.
     * @param legalName value to set
     * @return this builder instance
     */
    @NotNull public Builder legalName(@NotNull String legalName) {
      putValue("legalName", legalName);
      return this;
    }
    /**
     * Remove legalName property from the builder.
     * If this property is repeatable, all instances are removed.
     * @return this builder instance
     */
    @NotNull public Builder removeLegalName() {
      removeValue("legalName");
      return this;
    }
    /**
     * Get currently set value for legalName property in this builder.
     * @return previously set value or {@code null}. If multiple values have been 
     * set to this property, then {@link java.util.Collection} instance will be 
     * returned.
     */
    @Nullable public java.lang.Object getLegalName() {
      return myData.get("legalName");
    }
    /**
     * nonprofit Status indicates the legal status of a non-profit organization in its primary place of business.
     * @param nonprofitType value to set
     * @return this builder instance
     */
    @NotNull public Builder nonprofitStatus(@NotNull NonprofitType nonprofitType) {
      putValue("nonprofitStatus", nonprofitType);
      return this;
    }
    /**
     * Remove nonprofitStatus property from the builder.
     * If this property is repeatable, all instances are removed.
     * @return this builder instance
     */
    @NotNull public Builder removeNonprofitStatus() {
      removeValue("nonprofitStatus");
      return this;
    }
    /**
     * Get currently set value for nonprofitStatus property in this builder.
     * @return previously set value or {@code null}. If multiple values have been 
     * set to this property, then {@link java.util.Collection} instance will be 
     * returned.
     */
    @Nullable public java.lang.Object getNonprofitStatus() {
      return myData.get("nonprofitStatus");
    }
    /**
     * The overall rating, based on a collection of reviews or ratings, of the item.
     * @param aggregateRating value to set
     * @return this builder instance
     */
    @NotNull public Builder aggregateRating(@NotNull AggregateRating aggregateRating) {
      putValue("aggregateRating", aggregateRating);
      return this;
    }
    /**
     * The overall rating, based on a collection of reviews or ratings, of the item.
     * @param aggregateRating value to set
     * @return this builder instance
     */
    @NotNull public Builder aggregateRating(@NotNull AggregateRating.Builder aggregateRating) {
      putValue("aggregateRating", aggregateRating.build());
      return this;
    }
    /**
     * Remove aggregateRating property from the builder.
     * If this property is repeatable, all instances are removed.
     * @return this builder instance
     */
    @NotNull public Builder removeAggregateRating() {
      removeValue("aggregateRating");
      return this;
    }
    /**
     * Get currently set value for aggregateRating property in this builder.
     * @return previously set value or {@code null}. If multiple values have been 
     * set to this property, then {@link java.util.Collection} instance will be 
     * returned.
     */
    @Nullable public java.lang.Object getAggregateRating() {
      return myData.get("aggregateRating");
    }
    /**
     * An organization identifier that uniquely identifies a legal entity as defined in ISO 17442.
     * @param identifier value to set
     * @return this builder instance
     */
    @NotNull public Builder leiCode(@NotNull Identifier identifier) {
      putValue("leiCode", identifier);
      return this;
    }
    /**
     * Remove leiCode property from the builder.
     * If this property is repeatable, all instances are removed.
     * @return this builder instance
     */
    @NotNull public Builder removeLeiCode() {
      removeValue("leiCode");
      return this;
    }
    /**
     * Get currently set value for leiCode property in this builder.
     * @return previously set value or {@code null}. If multiple values have been 
     * set to this property, then {@link java.util.Collection} instance will be 
     * returned.
     */
    @Nullable public java.lang.Object getLeiCode() {
      return myData.get("leiCode");
    }
    /**
     * The date that this organization was founded.
     * @param date value to set
     * @return this builder instance
     */
    @NotNull public Builder foundingDate(@NotNull java.util.Date date) {
      putValue("foundingDate", date);
      return this;
    }
    /**
     * Remove foundingDate property from the builder.
     * If this property is repeatable, all instances are removed.
     * @return this builder instance
     */
    @NotNull public Builder removeFoundingDate() {
      removeValue("foundingDate");
      return this;
    }
    /**
     * Get currently set value for foundingDate property in this builder.
     * @return previously set value or {@code null}. If multiple values have been 
     * set to this property, then {@link java.util.Collection} instance will be 
     * returned.
     */
    @Nullable public java.lang.Object getFoundingDate() {
      return myData.get("foundingDate");
    }
    /**
     * For an [[Organization]] (often but not necessarily a [[NewsMediaOrganization]]), a description of organizational ownership structure; funding and grants. In a news/media setting, this is with particular reference to editorial independence.   Note that the [[funder]] is also available and can be used to make basic funder information machine-readable.
     * @param publishingPrinciples value to set
     * @return this builder instance
     */
    @NotNull public Builder ownershipFundingInfo(@NotNull PublishingPrinciples publishingPrinciples) {
      putValue("ownershipFundingInfo", publishingPrinciples);
      return this;
    }
    /**
     * Remove ownershipFundingInfo property from the builder.
     * If this property is repeatable, all instances are removed.
     * @return this builder instance
     */
    @NotNull public Builder removeOwnershipFundingInfo() {
      removeValue("ownershipFundingInfo");
      return this;
    }
    /**
     * Get currently set value for ownershipFundingInfo property in this builder.
     * @return previously set value or {@code null}. If multiple values have been 
     * set to this property, then {@link java.util.Collection} instance will be 
     * returned.
     */
    @Nullable public java.lang.Object getOwnershipFundingInfo() {
      return myData.get("ownershipFundingInfo");
    }
    /**
     * A member of an Organization or a ProgramMembership. Organizations can be members of organizations; ProgramMembership is typically for individuals.
     * @param organization value to set
     * @return this builder instance
     */
    @NotNull public Builder member(@NotNull Organization organization) {
      putValue("member", organization);
      return this;
    }
    /**
     * A member of an Organization or a ProgramMembership. Organizations can be members of organizations; ProgramMembership is typically for individuals.
     * @param organization value to set
     * @return this builder instance
     */
    @NotNull public Builder member(@NotNull Organization.Builder organization) {
      putValue("member", organization.build());
      return this;
    }
    /**
     * A member of an Organization or a ProgramMembership. Organizations can be members of organizations; ProgramMembership is typically for individuals.
     * @param person value to set
     * @return this builder instance
     */
    @NotNull public Builder member(@NotNull Person person) {
      putValue("member", person);
      return this;
    }
    /**
     * A member of an Organization or a ProgramMembership. Organizations can be members of organizations; ProgramMembership is typically for individuals.
     * @param person value to set
     * @return this builder instance
     */
    @NotNull public Builder member(@NotNull Person.Builder person) {
      putValue("member", person.build());
      return this;
    }
    /**
     * Remove member property from the builder.
     * If this property is repeatable, all instances are removed.
     * @return this builder instance
     */
    @NotNull public Builder removeMember() {
      removeValue("member");
      return this;
    }
    /**
     * Get currently set value for member property in this builder.
     * @return previously set value or {@code null}. If multiple values have been 
     * set to this property, then {@link java.util.Collection} instance will be 
     * returned.
     */
    @Nullable public java.lang.Object getMember() {
      return myData.get("member");
    }
    /**
     * Email address.
     * @param email value to set
     * @return this builder instance
     */
    @NotNull public Builder email(@NotNull String email) {
      putValue("email", email);
      return this;
    }
    /**
     * Remove email property from the builder.
     * If this property is repeatable, all instances are removed.
     * @return this builder instance
     */
    @NotNull public Builder removeEmail() {
      removeValue("email");
      return this;
    }
    /**
     * Get currently set value for email property in this builder.
     * @return previously set value or {@code null}. If multiple values have been 
     * set to this property, then {@link java.util.Collection} instance will be 
     * returned.
     */
    @Nullable public java.lang.Object getEmail() {
      return myData.get("email");
    }
    /**
     * The telephone number.
     * @param telephone value to set
     * @return this builder instance
     */
    @NotNull public Builder telephone(@NotNull String telephone) {
      putValue("telephone", telephone);
      return this;
    }
    /**
     * Remove telephone property from the builder.
     * If this property is repeatable, all instances are removed.
     * @return this builder instance
     */
    @NotNull public Builder removeTelephone() {
      removeValue("telephone");
      return this;
    }
    /**
     * Get currently set value for telephone property in this builder.
     * @return previously set value or {@code null}. If multiple values have been 
     * set to this property, then {@link java.util.Collection} instance will be 
     * returned.
     */
    @Nullable public java.lang.Object getTelephone() {
      return myData.get("telephone");
    }
    /**
     * An associated logo.
     * @param image value to set
     * @return this builder instance
     */
    @NotNull public Builder logo(@NotNull Image image) {
      putValue("logo", image);
      return this;
    }
    /**
     * Remove logo property from the builder.
     * If this property is repeatable, all instances are removed.
     * @return this builder instance
     */
    @NotNull public Builder removeLogo() {
      removeValue("logo");
      return this;
    }
    /**
     * Get currently set value for logo property in this builder.
     * @return previously set value or {@code null}. If multiple values have been 
     * set to this property, then {@link java.util.Collection} instance will be 
     * returned.
     */
    @Nullable public java.lang.Object getLogo() {
      return myData.get("logo");
    }
    /**
     * The International Standard of Industrial Classification of All Economic Activities (ISIC), Revision 4 code for a particular organization, business person, or place.
     * @param isicV4 value to set
     * @return this builder instance
     */
    @NotNull public Builder isicV4(@NotNull String isicV4) {
      putValue("isicV4", isicV4);
      return this;
    }
    /**
     * Remove isicV4 property from the builder.
     * If this property is repeatable, all instances are removed.
     * @return this builder instance
     */
    @NotNull public Builder removeIsicV4() {
      removeValue("isicV4");
      return this;
    }
    /**
     * Get currently set value for isicV4 property in this builder.
     * @return previously set value or {@code null}. If multiple values have been 
     * set to this property, then {@link java.util.Collection} instance will be 
     * returned.
     */
    @Nullable public java.lang.Object getIsicV4() {
      return myData.get("isicV4");
    }
    /**
     * For an [[Organization]] (often but not necessarily a [[NewsMediaOrganization]]), a report on staffing diversity issues. In a news context this might be for example ASNE or RTDNA (US) reports, or self-reported.
     * @param publishingPrinciples value to set
     * @return this builder instance
     */
    @NotNull public Builder diversityStaffingReport(@NotNull PublishingPrinciples publishingPrinciples) {
      putValue("diversityStaffingReport", publishingPrinciples);
      return this;
    }
    /**
     * Remove diversityStaffingReport property from the builder.
     * If this property is repeatable, all instances are removed.
     * @return this builder instance
     */
    @NotNull public Builder removeDiversityStaffingReport() {
      removeValue("diversityStaffingReport");
      return this;
    }
    /**
     * Get currently set value for diversityStaffingReport property in this builder.
     * @return previously set value or {@code null}. If multiple values have been 
     * set to this property, then {@link java.util.Collection} instance will be 
     * returned.
     */
    @Nullable public java.lang.Object getDiversityStaffingReport() {
      return myData.get("diversityStaffingReport");
    }
    /**
     * A credential awarded to the Person or Organization.
     * @param educationalOccupationalCredential value to set
     * @return this builder instance
     */
    @NotNull public Builder hasCredential(@NotNull EducationalOccupationalCredential educationalOccupationalCredential) {
      putValue("hasCredential", educationalOccupationalCredential);
      return this;
    }
    /**
     * A credential awarded to the Person or Organization.
     * @param educationalOccupationalCredential value to set
     * @return this builder instance
     */
    @NotNull public Builder hasCredential(@NotNull EducationalOccupationalCredential.Builder educationalOccupationalCredential) {
      putValue("hasCredential", educationalOccupationalCredential.build());
      return this;
    }
    /**
     * Remove hasCredential property from the builder.
     * If this property is repeatable, all instances are removed.
     * @return this builder instance
     */
    @NotNull public Builder removeHasCredential() {
      removeValue("hasCredential");
      return this;
    }
    /**
     * Get currently set value for hasCredential property in this builder.
     * @return previously set value or {@code null}. If multiple values have been 
     * set to this property, then {@link java.util.Collection} instance will be 
     * returned.
     */
    @Nullable public java.lang.Object getHasCredential() {
      return myData.get("hasCredential");
    }
    /**
     * The date that this organization was dissolved.
     * @param date value to set
     * @return this builder instance
     */
    @NotNull public Builder dissolutionDate(@NotNull java.util.Date date) {
      putValue("dissolutionDate", date);
      return this;
    }
    /**
     * Remove dissolutionDate property from the builder.
     * If this property is repeatable, all instances are removed.
     * @return this builder instance
     */
    @NotNull public Builder removeDissolutionDate() {
      removeValue("dissolutionDate");
      return this;
    }
    /**
     * Get currently set value for dissolutionDate property in this builder.
     * @return previously set value or {@code null}. If multiple values have been 
     * set to this property, then {@link java.util.Collection} instance will be 
     * returned.
     */
    @Nullable public java.lang.Object getDissolutionDate() {
      return myData.get("dissolutionDate");
    }
    /**
     * The Tax / Fiscal ID of the organization or person, e.g. the TIN in the US or the CIF/NIF in Spain.
     * @param identifier value to set
     * @return this builder instance
     */
    @NotNull public Builder taxID(@NotNull Identifier identifier) {
      putValue("taxID", identifier);
      return this;
    }
    /**
     * Remove taxID property from the builder.
     * If this property is repeatable, all instances are removed.
     * @return this builder instance
     */
    @NotNull public Builder removeTaxID() {
      removeValue("taxID");
      return this;
    }
    /**
     * Get currently set value for taxID property in this builder.
     * @return previously set value or {@code null}. If multiple values have been 
     * set to this property, then {@link java.util.Collection} instance will be 
     * returned.
     */
    @Nullable public java.lang.Object getTaxID() {
      return myData.get("taxID");
    }
    /**
     * The place where the Organization was founded.
     * @param place value to set
     * @return this builder instance
     */
    @NotNull public Builder foundingLocation(@NotNull Place place) {
      putValue("foundingLocation", place);
      return this;
    }
    /**
     * The place where the Organization was founded.
     * @param place value to set
     * @return this builder instance
     */
    @NotNull public Builder foundingLocation(@NotNull Place.Builder place) {
      putValue("foundingLocation", place.build());
      return this;
    }
    /**
     * Remove foundingLocation property from the builder.
     * If this property is repeatable, all instances are removed.
     * @return this builder instance
     */
    @NotNull public Builder removeFoundingLocation() {
      removeValue("foundingLocation");
      return this;
    }
    /**
     * Get currently set value for foundingLocation property in this builder.
     * @return previously set value or {@code null}. If multiple values have been 
     * set to this property, then {@link java.util.Collection} instance will be 
     * returned.
     */
    @Nullable public java.lang.Object getFoundingLocation() {
      return myData.get("foundingLocation");
    }
    /**
     * Of a [[Person]], and less typically of an [[Organization]], to indicate a known language. We do not distinguish skill levels or reading/writing/speaking/signing here. Use language codes from the [IETF BCP 47 standard](http://tools.ietf.org/html/bcp47).
     * @param language value to set
     * @return this builder instance
     */
    @NotNull public Builder knowsLanguage(@NotNull Language language) {
      putValue("knowsLanguage", language);
      return this;
    }
    /**
     * Of a [[Person]], and less typically of an [[Organization]], to indicate a known language. We do not distinguish skill levels or reading/writing/speaking/signing here. Use language codes from the [IETF BCP 47 standard](http://tools.ietf.org/html/bcp47).
     * @param language value to set
     * @return this builder instance
     */
    @NotNull public Builder knowsLanguage(@NotNull Language.Builder language) {
      putValue("knowsLanguage", language.build());
      return this;
    }
    /**
     * Of a [[Person]], and less typically of an [[Organization]], to indicate a known language. We do not distinguish skill levels or reading/writing/speaking/signing here. Use language codes from the [IETF BCP 47 standard](http://tools.ietf.org/html/bcp47).
     * @param knowsLanguage value to set
     * @return this builder instance
     */
    @NotNull public Builder knowsLanguage(@NotNull String knowsLanguage) {
      putValue("knowsLanguage", knowsLanguage);
      return this;
    }
    /**
     * Remove knowsLanguage property from the builder.
     * If this property is repeatable, all instances are removed.
     * @return this builder instance
     */
    @NotNull public Builder removeKnowsLanguage() {
      removeValue("knowsLanguage");
      return this;
    }
    /**
     * Get currently set value for knowsLanguage property in this builder.
     * @return previously set value or {@code null}. If multiple values have been 
     * set to this property, then {@link java.util.Collection} instance will be 
     * returned.
     */
    @Nullable public java.lang.Object getKnowsLanguage() {
      return myData.get("knowsLanguage");
    }
    /**
     * An Organization (or ProgramMembership) to which this Person or Organization belongs.
     * @param memberOf value to set
     * @return this builder instance
     */
    @NotNull public Builder memberOf(@NotNull MemberOf memberOf) {
      putValue("memberOf", memberOf);
      return this;
    }
    /**
     * Remove memberOf property from the builder.
     * If this property is repeatable, all instances are removed.
     * @return this builder instance
     */
    @NotNull public Builder removeMemberOf() {
      removeValue("memberOf");
      return this;
    }
    /**
     * Get currently set value for memberOf property in this builder.
     * @return previously set value or {@code null}. If multiple values have been 
     * set to this property, then {@link java.util.Collection} instance will be 
     * returned.
     */
    @Nullable public java.lang.Object getMemberOf() {
      return myData.get("memberOf");
    }
    /**
     * The brand(s) associated with a product or service, or the brand(s) maintained by an organization or business person.
     * @param brand value to set
     * @return this builder instance
     */
    @NotNull public Builder brand(@NotNull Brand brand) {
      putValue("brand", brand);
      return this;
    }
    /**
     * The brand(s) associated with a product or service, or the brand(s) maintained by an organization or business person.
     * @param brand value to set
     * @return this builder instance
     */
    @NotNull public Builder brand(@NotNull Brand.Builder brand) {
      putValue("brand", brand.build());
      return this;
    }
    /**
     * The brand(s) associated with a product or service, or the brand(s) maintained by an organization or business person.
     * @param organization value to set
     * @return this builder instance
     */
    @NotNull public Builder brand(@NotNull Organization organization) {
      putValue("brand", organization);
      return this;
    }
    /**
     * The brand(s) associated with a product or service, or the brand(s) maintained by an organization or business person.
     * @param organization value to set
     * @return this builder instance
     */
    @NotNull public Builder brand(@NotNull Organization.Builder organization) {
      putValue("brand", organization.build());
      return this;
    }
    /**
     * Remove brand property from the builder.
     * If this property is repeatable, all instances are removed.
     * @return this builder instance
     */
    @NotNull public Builder removeBrand() {
      removeValue("brand");
      return this;
    }
    /**
     * Get currently set value for brand property in this builder.
     * @return previously set value or {@code null}. If multiple values have been 
     * set to this property, then {@link java.util.Collection} instance will be 
     * returned.
     */
    @Nullable public java.lang.Object getBrand() {
      return myData.get("brand");
    }
    /**
     * The Value-added Tax ID of the organization or person.
     * @param vatID value to set
     * @return this builder instance
     */
    @NotNull public Builder vatID(@NotNull String vatID) {
      putValue("vatID", vatID);
      return this;
    }
    /**
     * Remove vatID property from the builder.
     * If this property is repeatable, all instances are removed.
     * @return this builder instance
     */
    @NotNull public Builder removeVatID() {
      removeValue("vatID");
      return this;
    }
    /**
     * Get currently set value for vatID property in this builder.
     * @return previously set value or {@code null}. If multiple values have been 
     * set to this property, then {@link java.util.Collection} instance will be 
     * returned.
     */
    @Nullable public java.lang.Object getVatID() {
      return myData.get("vatID");
    }
    /**
     * The geographic area where a service or offered item is provided.
     * @param areaServed value to set
     * @return this builder instance
     */
    @NotNull public Builder areaServed(@NotNull AreaServed areaServed) {
      putValue("areaServed", areaServed);
      return this;
    }
    /**
     * Remove areaServed property from the builder.
     * If this property is repeatable, all instances are removed.
     * @return this builder instance
     */
    @NotNull public Builder removeAreaServed() {
      removeValue("areaServed");
      return this;
    }
    /**
     * Get currently set value for areaServed property in this builder.
     * @return previously set value or {@code null}. If multiple values have been 
     * set to this property, then {@link java.util.Collection} instance will be 
     * returned.
     */
    @Nullable public java.lang.Object getAreaServed() {
      return myData.get("areaServed");
    }
    /**
     * Physical address of the item.
     * @param postalAddress value to set
     * @return this builder instance
     */
    @NotNull public Builder address(@NotNull PostalAddress postalAddress) {
      putValue("address", postalAddress);
      return this;
    }
    /**
     * Physical address of the item.
     * @param postalAddress value to set
     * @return this builder instance
     */
    @NotNull public Builder address(@NotNull PostalAddress.Builder postalAddress) {
      putValue("address", postalAddress.build());
      return this;
    }
    /**
     * Physical address of the item.
     * @param address value to set
     * @return this builder instance
     */
    @NotNull public Builder address(@NotNull String address) {
      putValue("address", address);
      return this;
    }
    /**
     * Remove address property from the builder.
     * If this property is repeatable, all instances are removed.
     * @return this builder instance
     */
    @NotNull public Builder removeAddress() {
      removeValue("address");
      return this;
    }
    /**
     * Get currently set value for address property in this builder.
     * @return previously set value or {@code null}. If multiple values have been 
     * set to this property, then {@link java.util.Collection} instance will be 
     * returned.
     */
    @Nullable public java.lang.Object getAddress() {
      return myData.get("address");
    }
    /**
     * Specifies a MerchantReturnPolicy that may be applicable.
     * @param merchantReturnPolicy value to set
     * @return this builder instance
     */
    @NotNull public Builder hasMerchantReturnPolicy(@NotNull MerchantReturnPolicy merchantReturnPolicy) {
      putValue("hasMerchantReturnPolicy", merchantReturnPolicy);
      return this;
    }
    /**
     * Specifies a MerchantReturnPolicy that may be applicable.
     * @param merchantReturnPolicy value to set
     * @return this builder instance
     */
    @NotNull public Builder hasMerchantReturnPolicy(@NotNull MerchantReturnPolicy.Builder merchantReturnPolicy) {
      putValue("hasMerchantReturnPolicy", merchantReturnPolicy.build());
      return this;
    }
    /**
     * Remove hasMerchantReturnPolicy property from the builder.
     * If this property is repeatable, all instances are removed.
     * @return this builder instance
     */
    @NotNull public Builder removeHasMerchantReturnPolicy() {
      removeValue("hasMerchantReturnPolicy");
      return this;
    }
    /**
     * Get currently set value for hasMerchantReturnPolicy property in this builder.
     * @return previously set value or {@code null}. If multiple values have been 
     * set to this property, then {@link java.util.Collection} instance will be 
     * returned.
     */
    @Nullable public java.lang.Object getHasMerchantReturnPolicy() {
      return myData.get("hasMerchantReturnPolicy");
    }
    /**
     * The larger organization that this organization is a [[subOrganization]] of, if any.
     * @param organization value to set
     * @return this builder instance
     */
    @NotNull public Builder parentOrganization(@NotNull Organization organization) {
      putValue("parentOrganization", organization);
      return this;
    }
    /**
     * The larger organization that this organization is a [[subOrganization]] of, if any.
     * @param organization value to set
     * @return this builder instance
     */
    @NotNull public Builder parentOrganization(@NotNull Organization.Builder organization) {
      putValue("parentOrganization", organization.build());
      return this;
    }
    /**
     * Remove parentOrganization property from the builder.
     * If this property is repeatable, all instances are removed.
     * @return this builder instance
     */
    @NotNull public Builder removeParentOrganization() {
      removeValue("parentOrganization");
      return this;
    }
    /**
     * Get currently set value for parentOrganization property in this builder.
     * @return previously set value or {@code null}. If multiple values have been 
     * set to this property, then {@link java.util.Collection} instance will be 
     * returned.
     */
    @Nullable public java.lang.Object getParentOrganization() {
      return myData.get("parentOrganization");
    }
    /**
     * Products owned by the organization or person.
     * @param ownershipInfo value to set
     * @return this builder instance
     */
    @NotNull public Builder owns(@NotNull OwnershipInfo ownershipInfo) {
      putValue("owns", ownershipInfo);
      return this;
    }
    /**
     * Products owned by the organization or person.
     * @param ownershipInfo value to set
     * @return this builder instance
     */
    @NotNull public Builder owns(@NotNull OwnershipInfo.Builder ownershipInfo) {
      putValue("owns", ownershipInfo.build());
      return this;
    }
    /**
     * Products owned by the organization or person.
     * @param product value to set
     * @return this builder instance
     */
    @NotNull public Builder owns(@NotNull Product product) {
      putValue("owns", product);
      return this;
    }
    /**
     * Products owned by the organization or person.
     * @param product value to set
     * @return this builder instance
     */
    @NotNull public Builder owns(@NotNull Product.Builder product) {
      putValue("owns", product.build());
      return this;
    }
    /**
     * Remove owns property from the builder.
     * If this property is repeatable, all instances are removed.
     * @return this builder instance
     */
    @NotNull public Builder removeOwns() {
      removeValue("owns");
      return this;
    }
    /**
     * Get currently set value for owns property in this builder.
     * @return previously set value or {@code null}. If multiple values have been 
     * set to this property, then {@link java.util.Collection} instance will be 
     * returned.
     */
    @Nullable public java.lang.Object getOwns() {
      return myData.get("owns");
    }
    /**
     * The North American Industry Classification System (NAICS) code for a particular organization or business person.
     * @param naics value to set
     * @return this builder instance
     */
    @NotNull public Builder naics(@NotNull String naics) {
      putValue("naics", naics);
      return this;
    }
    /**
     * Remove naics property from the builder.
     * If this property is repeatable, all instances are removed.
     * @return this builder instance
     */
    @NotNull public Builder removeNaics() {
      removeValue("naics");
      return this;
    }
    /**
     * Get currently set value for naics property in this builder.
     * @return previously set value or {@code null}. If multiple values have been 
     * set to this property, then {@link java.util.Collection} instance will be 
     * returned.
     */
    @Nullable public java.lang.Object getNaics() {
      return myData.get("naics");
    }
    /**
     * For an [[Organization]] (e.g. [[NewsMediaOrganization]]), a statement describing (in news media, the newsroom&rsquo;s) disclosure and correction policy for errors.
     * @param publishingPrinciples value to set
     * @return this builder instance
     */
    @NotNull public Builder correctionsPolicy(@NotNull PublishingPrinciples publishingPrinciples) {
      putValue("correctionsPolicy", publishingPrinciples);
      return this;
    }
    /**
     * Remove correctionsPolicy property from the builder.
     * If this property is repeatable, all instances are removed.
     * @return this builder instance
     */
    @NotNull public Builder removeCorrectionsPolicy() {
      removeValue("correctionsPolicy");
      return this;
    }
    /**
     * Get currently set value for correctionsPolicy property in this builder.
     * @return previously set value or {@code null}. If multiple values have been 
     * set to this property, then {@link java.util.Collection} instance will be 
     * returned.
     */
    @Nullable public java.lang.Object getCorrectionsPolicy() {
      return myData.get("correctionsPolicy");
    }
    /**
     * For a [[NewsMediaOrganization]] or other news-related [[Organization]], a statement about public engagement activities (for news media, the newsroom&rsquo;s), including involving the public - digitally or otherwise -- in coverage decisions, reporting and activities after publication.
     * @param publishingPrinciples value to set
     * @return this builder instance
     */
    @NotNull public Builder actionableFeedbackPolicy(@NotNull PublishingPrinciples publishingPrinciples) {
      putValue("actionableFeedbackPolicy", publishingPrinciples);
      return this;
    }
    /**
     * Remove actionableFeedbackPolicy property from the builder.
     * If this property is repeatable, all instances are removed.
     * @return this builder instance
     */
    @NotNull public Builder removeActionableFeedbackPolicy() {
      removeValue("actionableFeedbackPolicy");
      return this;
    }
    /**
     * Get currently set value for actionableFeedbackPolicy property in this builder.
     * @return previously set value or {@code null}. If multiple values have been 
     * set to this property, then {@link java.util.Collection} instance will be 
     * returned.
     */
    @Nullable public java.lang.Object getActionableFeedbackPolicy() {
      return myData.get("actionableFeedbackPolicy");
    }
    /**
     * Indicates an OfferCatalog listing for this Organization, Person, or Service.
     * @param offerCatalog value to set
     * @return this builder instance
     */
    @NotNull public Builder hasOfferCatalog(@NotNull OfferCatalog offerCatalog) {
      putValue("hasOfferCatalog", offerCatalog);
      return this;
    }
    /**
     * Indicates an OfferCatalog listing for this Organization, Person, or Service.
     * @param offerCatalog value to set
     * @return this builder instance
     */
    @NotNull public Builder hasOfferCatalog(@NotNull OfferCatalog.Builder offerCatalog) {
      putValue("hasOfferCatalog", offerCatalog.build());
      return this;
    }
    /**
     * Remove hasOfferCatalog property from the builder.
     * If this property is repeatable, all instances are removed.
     * @return this builder instance
     */
    @NotNull public Builder removeHasOfferCatalog() {
      removeValue("hasOfferCatalog");
      return this;
    }
    /**
     * Get currently set value for hasOfferCatalog property in this builder.
     * @return previously set value or {@code null}. If multiple values have been 
     * set to this property, then {@link java.util.Collection} instance will be 
     * returned.
     */
    @Nullable public java.lang.Object getHasOfferCatalog() {
      return myData.get("hasOfferCatalog");
    }
    /**
     * The [Global Location Number](http://www.gs1.org/gln) (GLN, sometimes also referred to as International Location Number or ILN) of the respective organization, person, or place. The GLN is a 13-digit number used to identify parties and physical locations.
     * @param identifier value to set
     * @return this builder instance
     */
    @NotNull public Builder globalLocationNumber(@NotNull Identifier identifier) {
      putValue("globalLocationNumber", identifier);
      return this;
    }
    /**
     * Remove globalLocationNumber property from the builder.
     * If this property is repeatable, all instances are removed.
     * @return this builder instance
     */
    @NotNull public Builder removeGlobalLocationNumber() {
      removeValue("globalLocationNumber");
      return this;
    }
    /**
     * Get currently set value for globalLocationNumber property in this builder.
     * @return previously set value or {@code null}. If multiple values have been 
     * set to this property, then {@link java.util.Collection} instance will be 
     * returned.
     */
    @Nullable public java.lang.Object getGlobalLocationNumber() {
      return myData.get("globalLocationNumber");
    }
    /**
     * A person or organization that supports a thing through a pledge, promise, or financial contribution. e.g. a sponsor of a Medical Study or a corporate sponsor of an event.
     * @param sponsor value to set
     * @return this builder instance
     */
    @NotNull public Builder sponsor(@NotNull Sponsor sponsor) {
      putValue("sponsor", sponsor);
      return this;
    }
    /**
     * Remove sponsor property from the builder.
     * If this property is repeatable, all instances are removed.
     * @return this builder instance
     */
    @NotNull public Builder removeSponsor() {
      removeValue("sponsor");
      return this;
    }
    /**
     * Get currently set value for sponsor property in this builder.
     * @return previously set value or {@code null}. If multiple values have been 
     * set to this property, then {@link java.util.Collection} instance will be 
     * returned.
     */
    @Nullable public java.lang.Object getSponsor() {
      return myData.get("sponsor");
    }
    /**
     * A person or organization that supports (sponsors) something through some kind of financial contribution.
     * @param sponsor value to set
     * @return this builder instance
     */
    @NotNull public Builder funder(@NotNull Sponsor sponsor) {
      putValue("funder", sponsor);
      return this;
    }
    /**
     * Remove funder property from the builder.
     * If this property is repeatable, all instances are removed.
     * @return this builder instance
     */
    @NotNull public Builder removeFunder() {
      removeValue("funder");
      return this;
    }
    /**
     * Get currently set value for funder property in this builder.
     * @return previously set value or {@code null}. If multiple values have been 
     * set to this property, then {@link java.util.Collection} instance will be 
     * returned.
     */
    @Nullable public java.lang.Object getFunder() {
      return myData.get("funder");
    }
    /**
     * A review of the item.
     * @param review value to set
     * @return this builder instance
     */
    @NotNull public Builder review(@NotNull Review review) {
      putValue("review", review);
      return this;
    }
    /**
     * A review of the item.
     * @param review value to set
     * @return this builder instance
     */
    @NotNull public Builder review(@NotNull Review.Builder review) {
      putValue("review", review.build());
      return this;
    }
    /**
     * Remove review property from the builder.
     * If this property is repeatable, all instances are removed.
     * @return this builder instance
     */
    @NotNull public Builder removeReview() {
      removeValue("review");
      return this;
    }
    /**
     * Get currently set value for review property in this builder.
     * @return previously set value or {@code null}. If multiple values have been 
     * set to this property, then {@link java.util.Collection} instance will be 
     * returned.
     */
    @Nullable public java.lang.Object getReview() {
      return myData.get("review");
    }
    /**
     * The number of interactions for the CreativeWork using the WebSite or SoftwareApplication. The most specific child type of InteractionCounter should be used.
     * @param interactionCounter value to set
     * @return this builder instance
     */
    @NotNull public Builder interactionStatistic(@NotNull InteractionCounter interactionCounter) {
      putValue("interactionStatistic", interactionCounter);
      return this;
    }
    /**
     * The number of interactions for the CreativeWork using the WebSite or SoftwareApplication. The most specific child type of InteractionCounter should be used.
     * @param interactionCounter value to set
     * @return this builder instance
     */
    @NotNull public Builder interactionStatistic(@NotNull InteractionCounter.Builder interactionCounter) {
      putValue("interactionStatistic", interactionCounter.build());
      return this;
    }
    /**
     * Remove interactionStatistic property from the builder.
     * If this property is repeatable, all instances are removed.
     * @return this builder instance
     */
    @NotNull public Builder removeInteractionStatistic() {
      removeValue("interactionStatistic");
      return this;
    }
    /**
     * Get currently set value for interactionStatistic property in this builder.
     * @return previously set value or {@code null}. If multiple values have been 
     * set to this property, then {@link java.util.Collection} instance will be 
     * returned.
     */
    @Nullable public java.lang.Object getInteractionStatistic() {
      return myData.get("interactionStatistic");
    }
    /**
     * The fax number.
     * @param faxNumber value to set
     * @return this builder instance
     */
    @NotNull public Builder faxNumber(@NotNull String faxNumber) {
      putValue("faxNumber", faxNumber);
      return this;
    }
    /**
     * Remove faxNumber property from the builder.
     * If this property is repeatable, all instances are removed.
     * @return this builder instance
     */
    @NotNull public Builder removeFaxNumber() {
      removeValue("faxNumber");
      return this;
    }
    /**
     * Get currently set value for faxNumber property in this builder.
     * @return previously set value or {@code null}. If multiple values have been 
     * set to this property, then {@link java.util.Collection} instance will be 
     * returned.
     */
    @Nullable public java.lang.Object getFaxNumber() {
      return myData.get("faxNumber");
    }
    /**
     * Someone working for this organization.
     * @param person value to set
     * @return this builder instance
     */
    @NotNull public Builder employee(@NotNull Person person) {
      putValue("employee", person);
      return this;
    }
    /**
     * Someone working for this organization.
     * @param person value to set
     * @return this builder instance
     */
    @NotNull public Builder employee(@NotNull Person.Builder person) {
      putValue("employee", person.build());
      return this;
    }
    /**
     * Remove employee property from the builder.
     * If this property is repeatable, all instances are removed.
     * @return this builder instance
     */
    @NotNull public Builder removeEmployee() {
      removeValue("employee");
      return this;
    }
    /**
     * Get currently set value for employee property in this builder.
     * @return previously set value or {@code null}. If multiple values have been 
     * set to this property, then {@link java.util.Collection} instance will be 
     * returned.
     */
    @Nullable public java.lang.Object getEmployee() {
      return myData.get("employee");
    }
    /**
     * An award won by or for this item.
     * @param award value to set
     * @return this builder instance
     */
    @NotNull public Builder award(@NotNull String award) {
      putValue("award", award);
      return this;
    }
    /**
     * Remove award property from the builder.
     * If this property is repeatable, all instances are removed.
     * @return this builder instance
     */
    @NotNull public Builder removeAward() {
      removeValue("award");
      return this;
    }
    /**
     * Get currently set value for award property in this builder.
     * @return previously set value or {@code null}. If multiple values have been 
     * set to this property, then {@link java.util.Collection} instance will be 
     * returned.
     */
    @Nullable public java.lang.Object getAward() {
      return myData.get("award");
    }
    /**
     * Statement about ethics policy, e.g. of a [[NewsMediaOrganization]] regarding journalistic and publishing practices, or of a [[Restaurant]], a page describing food source policies. In the case of a [[NewsMediaOrganization]], an ethicsPolicy is typically a statement describing the personal, organizational, and corporate standards of behavior expected by the organization.
     * @param creativeWork value to set
     * @return this builder instance
     */
    @NotNull public Builder ethicsPolicy(@NotNull CreativeWork creativeWork) {
      putValue("ethicsPolicy", creativeWork);
      return this;
    }
    /**
     * Statement about ethics policy, e.g. of a [[NewsMediaOrganization]] regarding journalistic and publishing practices, or of a [[Restaurant]], a page describing food source policies. In the case of a [[NewsMediaOrganization]], an ethicsPolicy is typically a statement describing the personal, organizational, and corporate standards of behavior expected by the organization.
     * @param creativeWork value to set
     * @return this builder instance
     */
    @NotNull public Builder ethicsPolicy(@NotNull CreativeWork.Builder creativeWork) {
      putValue("ethicsPolicy", creativeWork.build());
      return this;
    }
    /**
     * Statement about ethics policy, e.g. of a [[NewsMediaOrganization]] regarding journalistic and publishing practices, or of a [[Restaurant]], a page describing food source policies. In the case of a [[NewsMediaOrganization]], an ethicsPolicy is typically a statement describing the personal, organizational, and corporate standards of behavior expected by the organization.
     * @param ethicsPolicy value to set
     * @return this builder instance
     */
    @NotNull public Builder ethicsPolicy(@NotNull String ethicsPolicy) {
      putValue("ethicsPolicy", ethicsPolicy);
      return this;
    }
    /**
     * Remove ethicsPolicy property from the builder.
     * If this property is repeatable, all instances are removed.
     * @return this builder instance
     */
    @NotNull public Builder removeEthicsPolicy() {
      removeValue("ethicsPolicy");
      return this;
    }
    /**
     * Get currently set value for ethicsPolicy property in this builder.
     * @return previously set value or {@code null}. If multiple values have been 
     * set to this property, then {@link java.util.Collection} instance will be 
     * returned.
     */
    @Nullable public java.lang.Object getEthicsPolicy() {
      return myData.get("ethicsPolicy");
    }
    /**
     * A person who founded this organization.
     * @param person value to set
     * @return this builder instance
     */
    @NotNull public Builder founder(@NotNull Person person) {
      putValue("founder", person);
      return this;
    }
    /**
     * A person who founded this organization.
     * @param person value to set
     * @return this builder instance
     */
    @NotNull public Builder founder(@NotNull Person.Builder person) {
      putValue("founder", person.build());
      return this;
    }
    /**
     * Remove founder property from the builder.
     * If this property is repeatable, all instances are removed.
     * @return this builder instance
     */
    @NotNull public Builder removeFounder() {
      removeValue("founder");
      return this;
    }
    /**
     * Get currently set value for founder property in this builder.
     * @return previously set value or {@code null}. If multiple values have been 
     * set to this property, then {@link java.util.Collection} instance will be 
     * returned.
     */
    @Nullable public java.lang.Object getFounder() {
      return myData.get("founder");
    }
    /**
     * A relationship between an organization and a department of that organization, also described as an organization (allowing different urls, logos, opening hours). For example: a store with a pharmacy, or a bakery with a cafe.
     * @param organization value to set
     * @return this builder instance
     */
    @NotNull public Builder department(@NotNull Organization organization) {
      putValue("department", organization);
      return this;
    }
    /**
     * A relationship between an organization and a department of that organization, also described as an organization (allowing different urls, logos, opening hours). For example: a store with a pharmacy, or a bakery with a cafe.
     * @param organization value to set
     * @return this builder instance
     */
    @NotNull public Builder department(@NotNull Organization.Builder organization) {
      putValue("department", organization.build());
      return this;
    }
    /**
     * Remove department property from the builder.
     * If this property is repeatable, all instances are removed.
     * @return this builder instance
     */
    @NotNull public Builder removeDepartment() {
      removeValue("department");
      return this;
    }
    /**
     * Get currently set value for department property in this builder.
     * @return previously set value or {@code null}. If multiple values have been 
     * set to this property, then {@link java.util.Collection} instance will be 
     * returned.
     */
    @Nullable public java.lang.Object getDepartment() {
      return myData.get("department");
    }
    /**
     * Points-of-Sales operated by the organization or person.
     * @param place value to set
     * @return this builder instance
     */
    @NotNull public Builder hasPOS(@NotNull Place place) {
      putValue("hasPOS", place);
      return this;
    }
    /**
     * Points-of-Sales operated by the organization or person.
     * @param place value to set
     * @return this builder instance
     */
    @NotNull public Builder hasPOS(@NotNull Place.Builder place) {
      putValue("hasPOS", place.build());
      return this;
    }
    /**
     * Remove hasPOS property from the builder.
     * If this property is repeatable, all instances are removed.
     * @return this builder instance
     */
    @NotNull public Builder removeHasPOS() {
      removeValue("hasPOS");
      return this;
    }
    /**
     * Get currently set value for hasPOS property in this builder.
     * @return previously set value or {@code null}. If multiple values have been 
     * set to this property, then {@link java.util.Collection} instance will be 
     * returned.
     */
    @Nullable public java.lang.Object getHasPOS() {
      return myData.get("hasPOS");
    }
    /**
     * A slogan or motto associated with the item.
     * @param slogan value to set
     * @return this builder instance
     */
    @NotNull public Builder slogan(@NotNull String slogan) {
      putValue("slogan", slogan);
      return this;
    }
    /**
     * Remove slogan property from the builder.
     * If this property is repeatable, all instances are removed.
     * @return this builder instance
     */
    @NotNull public Builder removeSlogan() {
      removeValue("slogan");
      return this;
    }
    /**
     * Get currently set value for slogan property in this builder.
     * @return previously set value or {@code null}. If multiple values have been 
     * set to this property, then {@link java.util.Collection} instance will be 
     * returned.
     */
    @Nullable public java.lang.Object getSlogan() {
      return myData.get("slogan");
    }
    /**
     * A pointer to products or services offered by the organization or person.
     * @param offer value to set
     * @return this builder instance
     */
    @NotNull public Builder makesOffer(@NotNull Offer offer) {
      putValue("makesOffer", offer);
      return this;
    }
    /**
     * A pointer to products or services offered by the organization or person.
     * @param offer value to set
     * @return this builder instance
     */
    @NotNull public Builder makesOffer(@NotNull Offer.Builder offer) {
      putValue("makesOffer", offer.build());
      return this;
    }
    /**
     * Remove makesOffer property from the builder.
     * If this property is repeatable, all instances are removed.
     * @return this builder instance
     */
    @NotNull public Builder removeMakesOffer() {
      removeValue("makesOffer");
      return this;
    }
    /**
     * Get currently set value for makesOffer property in this builder.
     * @return previously set value or {@code null}. If multiple values have been 
     * set to this property, then {@link java.util.Collection} instance will be 
     * returned.
     */
    @Nullable public java.lang.Object getMakesOffer() {
      return myData.get("makesOffer");
    }
    /**
     * Alumni of an organization.
     * @param person value to set
     * @return this builder instance
     */
    @NotNull public Builder alumni(@NotNull Person person) {
      putValue("alumni", person);
      return this;
    }
    /**
     * Alumni of an organization.
     * @param person value to set
     * @return this builder instance
     */
    @NotNull public Builder alumni(@NotNull Person.Builder person) {
      putValue("alumni", person.build());
      return this;
    }
    /**
     * Remove alumni property from the builder.
     * If this property is repeatable, all instances are removed.
     * @return this builder instance
     */
    @NotNull public Builder removeAlumni() {
      removeValue("alumni");
      return this;
    }
    /**
     * Get currently set value for alumni property in this builder.
     * @return previously set value or {@code null}. If multiple values have been 
     * set to this property, then {@link java.util.Collection} instance will be 
     * returned.
     */
    @Nullable public java.lang.Object getAlumni() {
      return myData.get("alumni");
    }
    /**
     * A relationship between two organizations where the first includes the second, e.g., as a subsidiary. See also: the more specific 'department' property.
     * @param organization value to set
     * @return this builder instance
     */
    @NotNull public Builder subOrganization(@NotNull Organization organization) {
      putValue("subOrganization", organization);
      return this;
    }
    /**
     * A relationship between two organizations where the first includes the second, e.g., as a subsidiary. See also: the more specific 'department' property.
     * @param organization value to set
     * @return this builder instance
     */
    @NotNull public Builder subOrganization(@NotNull Organization.Builder organization) {
      putValue("subOrganization", organization.build());
      return this;
    }
    /**
     * Remove subOrganization property from the builder.
     * If this property is repeatable, all instances are removed.
     * @return this builder instance
     */
    @NotNull public Builder removeSubOrganization() {
      removeValue("subOrganization");
      return this;
    }
    /**
     * Get currently set value for subOrganization property in this builder.
     * @return previously set value or {@code null}. If multiple values have been 
     * set to this property, then {@link java.util.Collection} instance will be 
     * returned.
     */
    @Nullable public java.lang.Object getSubOrganization() {
      return myData.get("subOrganization");
    }
    /**
     * The identifier property represents any kind of identifier for any kind of [[Thing]], such as ISBNs, GTIN codes, UUIDs etc. Schema.org provides dedicated properties for representing many of these, either as textual strings or as URL (URI) links. See [background notes](/docs/datamodel.html#identifierBg) for more details.
     * 
     * @param identifier value to set
     * @return this builder instance
     */
    @NotNull public Builder identifier(@NotNull Identifier identifier) {
      putValue("identifier", identifier);
      return this;
    }
    /**
     * Remove identifier property from the builder.
     * If this property is repeatable, all instances are removed.
     * @return this builder instance
     */
    @NotNull public Builder removeIdentifier() {
      removeValue("identifier");
      return this;
    }
    /**
     * Get currently set value for identifier property in this builder.
     * @return previously set value or {@code null}. If multiple values have been 
     * set to this property, then {@link java.util.Collection} instance will be 
     * returned.
     */
    @Nullable public java.lang.Object getIdentifier() {
      return myData.get("identifier");
    }
    /**
     * An image of the item. This can be a [[URL]] or a fully described [[ImageObject]].
     * @param image value to set
     * @return this builder instance
     */
    @NotNull public Builder image(@NotNull Image image) {
      putValue("image", image);
      return this;
    }
    /**
     * Remove image property from the builder.
     * If this property is repeatable, all instances are removed.
     * @return this builder instance
     */
    @NotNull public Builder removeImage() {
      removeValue("image");
      return this;
    }
    /**
     * Get currently set value for image property in this builder.
     * @return previously set value or {@code null}. If multiple values have been 
     * set to this property, then {@link java.util.Collection} instance will be 
     * returned.
     */
    @Nullable public java.lang.Object getImage() {
      return myData.get("image");
    }
    /**
     * Indicates a potential Action, which describes an idealized action in which this thing would play an 'object' role.
     * @param action value to set
     * @return this builder instance
     */
    @NotNull public Builder potentialAction(@NotNull Action action) {
      putValue("potentialAction", action);
      return this;
    }
    /**
     * Indicates a potential Action, which describes an idealized action in which this thing would play an 'object' role.
     * @param action value to set
     * @return this builder instance
     */
    @NotNull public Builder potentialAction(@NotNull Action.Builder action) {
      putValue("potentialAction", action.build());
      return this;
    }
    /**
     * Remove potentialAction property from the builder.
     * If this property is repeatable, all instances are removed.
     * @return this builder instance
     */
    @NotNull public Builder removePotentialAction() {
      removeValue("potentialAction");
      return this;
    }
    /**
     * Get currently set value for potentialAction property in this builder.
     * @return previously set value or {@code null}. If multiple values have been 
     * set to this property, then {@link java.util.Collection} instance will be 
     * returned.
     */
    @Nullable public java.lang.Object getPotentialAction() {
      return myData.get("potentialAction");
    }
    /**
     * A sub property of description. A short description of the item used to disambiguate from other, similar items. Information from other properties (in particular, name) may be necessary for the description to be useful for disambiguation.
     * @param disambiguatingDescription value to set
     * @return this builder instance
     */
    @NotNull public Builder disambiguatingDescription(@NotNull String disambiguatingDescription) {
      putValue("disambiguatingDescription", disambiguatingDescription);
      return this;
    }
    /**
     * Remove disambiguatingDescription property from the builder.
     * If this property is repeatable, all instances are removed.
     * @return this builder instance
     */
    @NotNull public Builder removeDisambiguatingDescription() {
      removeValue("disambiguatingDescription");
      return this;
    }
    /**
     * Get currently set value for disambiguatingDescription property in this builder.
     * @return previously set value or {@code null}. If multiple values have been 
     * set to this property, then {@link java.util.Collection} instance will be 
     * returned.
     */
    @Nullable public java.lang.Object getDisambiguatingDescription() {
      return myData.get("disambiguatingDescription");
    }
    /**
     * A description of the item.
     * @param description value to set
     * @return this builder instance
     */
    @NotNull public Builder description(@NotNull String description) {
      putValue("description", description);
      return this;
    }
    /**
     * Remove description property from the builder.
     * If this property is repeatable, all instances are removed.
     * @return this builder instance
     */
    @NotNull public Builder removeDescription() {
      removeValue("description");
      return this;
    }
    /**
     * Get currently set value for description property in this builder.
     * @return previously set value or {@code null}. If multiple values have been 
     * set to this property, then {@link java.util.Collection} instance will be 
     * returned.
     */
    @Nullable public java.lang.Object getDescription() {
      return myData.get("description");
    }
    /**
     * URL of the item.
     * @param url value to set
     * @return this builder instance
     */
    @NotNull public Builder url(@NotNull String url) {
      putValue("url", url);
      return this;
    }
    /**
     * Remove url property from the builder.
     * If this property is repeatable, all instances are removed.
     * @return this builder instance
     */
    @NotNull public Builder removeUrl() {
      removeValue("url");
      return this;
    }
    /**
     * Get currently set value for url property in this builder.
     * @return previously set value or {@code null}. If multiple values have been 
     * set to this property, then {@link java.util.Collection} instance will be 
     * returned.
     */
    @Nullable public java.lang.Object getUrl() {
      return myData.get("url");
    }
    /**
     * An additional type for the item, typically used for adding more specific types from external vocabularies in microdata syntax. This is a relationship between something and a class that the thing is in. In RDFa syntax, it is better to use the native RDFa syntax - the 'typeof' attribute - for multiple types. Schema.org tools may have only weaker understanding of extra types, in particular those defined externally.
     * @param additionalType value to set
     * @return this builder instance
     */
    @NotNull public Builder additionalType(@NotNull String additionalType) {
      putValue("additionalType", additionalType);
      return this;
    }
    /**
     * Remove additionalType property from the builder.
     * If this property is repeatable, all instances are removed.
     * @return this builder instance
     */
    @NotNull public Builder removeAdditionalType() {
      removeValue("additionalType");
      return this;
    }
    /**
     * Get currently set value for additionalType property in this builder.
     * @return previously set value or {@code null}. If multiple values have been 
     * set to this property, then {@link java.util.Collection} instance will be 
     * returned.
     */
    @Nullable public java.lang.Object getAdditionalType() {
      return myData.get("additionalType");
    }
    /**
     * URL of a reference Web page that unambiguously indicates the item's identity. E.g. the URL of the item's Wikipedia page, Wikidata entry, or official website.
     * @param sameAs value to set
     * @return this builder instance
     */
    @NotNull public Builder sameAs(@NotNull String sameAs) {
      putValue("sameAs", sameAs);
      return this;
    }
    /**
     * Remove sameAs property from the builder.
     * If this property is repeatable, all instances are removed.
     * @return this builder instance
     */
    @NotNull public Builder removeSameAs() {
      removeValue("sameAs");
      return this;
    }
    /**
     * Get currently set value for sameAs property in this builder.
     * @return previously set value or {@code null}. If multiple values have been 
     * set to this property, then {@link java.util.Collection} instance will be 
     * returned.
     */
    @Nullable public java.lang.Object getSameAs() {
      return myData.get("sameAs");
    }
    /**
     * An alias for the item.
     * @param alternateName value to set
     * @return this builder instance
     */
    @NotNull public Builder alternateName(@NotNull String alternateName) {
      putValue("alternateName", alternateName);
      return this;
    }
    /**
     * Remove alternateName property from the builder.
     * If this property is repeatable, all instances are removed.
     * @return this builder instance
     */
    @NotNull public Builder removeAlternateName() {
      removeValue("alternateName");
      return this;
    }
    /**
     * Get currently set value for alternateName property in this builder.
     * @return previously set value or {@code null}. If multiple values have been 
     * set to this property, then {@link java.util.Collection} instance will be 
     * returned.
     */
    @Nullable public java.lang.Object getAlternateName() {
      return myData.get("alternateName");
    }
    /**
     * The name of the item.
     * @param name value to set
     * @return this builder instance
     */
    @NotNull public Builder name(@NotNull String name) {
      putValue("name", name);
      return this;
    }
    /**
     * Remove name property from the builder.
     * If this property is repeatable, all instances are removed.
     * @return this builder instance
     */
    @NotNull public Builder removeName() {
      removeValue("name");
      return this;
    }
    /**
     * Get currently set value for name property in this builder.
     * @return previously set value or {@code null}. If multiple values have been 
     * set to this property, then {@link java.util.Collection} instance will be 
     * returned.
     */
    @Nullable public java.lang.Object getName() {
      return myData.get("name");
    }
    /**
     * A CreativeWork or Event about this Thing.
     * @param creativeWork value to set
     * @return this builder instance
     */
    @NotNull public Builder subjectOf(@NotNull CreativeWork creativeWork) {
      putValue("subjectOf", creativeWork);
      return this;
    }
    /**
     * A CreativeWork or Event about this Thing.
     * @param creativeWork value to set
     * @return this builder instance
     */
    @NotNull public Builder subjectOf(@NotNull CreativeWork.Builder creativeWork) {
      putValue("subjectOf", creativeWork.build());
      return this;
    }
    /**
     * A CreativeWork or Event about this Thing.
     * @param event value to set
     * @return this builder instance
     */
    @NotNull public Builder subjectOf(@NotNull Event event) {
      putValue("subjectOf", event);
      return this;
    }
    /**
     * A CreativeWork or Event about this Thing.
     * @param event value to set
     * @return this builder instance
     */
    @NotNull public Builder subjectOf(@NotNull Event.Builder event) {
      putValue("subjectOf", event.build());
      return this;
    }
    /**
     * Remove subjectOf property from the builder.
     * If this property is repeatable, all instances are removed.
     * @return this builder instance
     */
    @NotNull public Builder removeSubjectOf() {
      removeValue("subjectOf");
      return this;
    }
    /**
     * Get currently set value for subjectOf property in this builder.
     * @return previously set value or {@code null}. If multiple values have been 
     * set to this property, then {@link java.util.Collection} instance will be 
     * returned.
     */
    @Nullable public java.lang.Object getSubjectOf() {
      return myData.get("subjectOf");
    }
    /**
     * Indicates a page (or other CreativeWork) for which this thing is the main entity being described. See [background notes](/docs/datamodel.html#mainEntityBackground) for details.
     * @param creativeWork value to set
     * @return this builder instance
     */
    @NotNull public Builder mainEntityOfPage(@NotNull CreativeWork creativeWork) {
      putValue("mainEntityOfPage", creativeWork);
      return this;
    }
    /**
     * Indicates a page (or other CreativeWork) for which this thing is the main entity being described. See [background notes](/docs/datamodel.html#mainEntityBackground) for details.
     * @param creativeWork value to set
     * @return this builder instance
     */
    @NotNull public Builder mainEntityOfPage(@NotNull CreativeWork.Builder creativeWork) {
      putValue("mainEntityOfPage", creativeWork.build());
      return this;
    }
    /**
     * Indicates a page (or other CreativeWork) for which this thing is the main entity being described. See [background notes](/docs/datamodel.html#mainEntityBackground) for details.
     * @param mainEntityOfPage value to set
     * @return this builder instance
     */
    @NotNull public Builder mainEntityOfPage(@NotNull String mainEntityOfPage) {
      putValue("mainEntityOfPage", mainEntityOfPage);
      return this;
    }
    /**
     * Remove mainEntityOfPage property from the builder.
     * If this property is repeatable, all instances are removed.
     * @return this builder instance
     */
    @NotNull public Builder removeMainEntityOfPage() {
      removeValue("mainEntityOfPage");
      return this;
    }
    /**
     * Get currently set value for mainEntityOfPage property in this builder.
     * @return previously set value or {@code null}. If multiple values have been 
     * set to this property, then {@link java.util.Collection} instance will be 
     * returned.
     */
    @Nullable public java.lang.Object getMainEntityOfPage() {
      return myData.get("mainEntityOfPage");
    }
    /**
     * null
     * @param id value to set
     * @return this builder instance
     */
    @NotNull public Builder id(@NotNull String id) {
      myData.put("id", id);
      return this;
    }
    /**
     * Remove id property from the builder.
     * If this property is repeatable, all instances are removed.
     * @return this builder instance
     */
    @NotNull public Builder removeId() {
      removeValue("id");
      return this;
    }
    /**
     * Get currently set value for id property in this builder.
     * @return previously set value or {@code null}. If multiple values have been 
     * set to this property, then {@link java.util.Collection} instance will be 
     * returned.
     */
    @Nullable public java.lang.Object getId() {
      return myData.get("id");
    }
    public Builder id(long id) {
      return id(Long.toString(id));
    }
    @Override protected void fromMap(String key, java.lang.Object value) {
      super.fromMap(key, value);
    }
  }
  
}
