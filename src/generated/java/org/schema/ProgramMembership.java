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
 * Used to describe membership in a loyalty programs (e.g. &quot;StarAliance&quot;), traveler clubs (e.g. &quot;AAA&quot;), purchase clubs (&quot;Safeway Club&quot;), etc.
 */
public class ProgramMembership extends Intangible implements org.schema.MemberOf {
  /**
   * The program providing the membership.
   * @return programName property set by first invocation of programName method or {@code null}.
   */
  @JsonIgnore public String getProgramName() {
    return (String) getValue("programName");
  }
  /**
   * The program providing the membership.
   * @return all programName properties as {@link java.util.Collection} or an empty collection 
   * if programName was not set.
   */
  @JsonIgnore public java.util.Collection<String> getProgramNames() {
    final java.lang.Object current = myData.get("programName");
    if (current == null) return Collections.emptyList();
    if (current instanceof java.util.Collection) {
      return (java.util.Collection<String>) current;
    }
    return Arrays.asList((String) current);
  }
  /**
   * A member of an Organization or a ProgramMembership. Organizations can be members of organizations; ProgramMembership is typically for individuals.
   * @return member property set by first invocation of member method or {@code null}.
   */
  @JsonIgnore public Organization getMemberOrganization() {
    return (Organization) getValue("member");
  }
  /**
   * A member of an Organization or a ProgramMembership. Organizations can be members of organizations; ProgramMembership is typically for individuals.
   * @return all member properties as {@link java.util.Collection} or an empty collection 
   * if member was not set.
   */
  @JsonIgnore public java.util.Collection<Organization> getMemberOrganizations() {
    final java.lang.Object current = myData.get("member");
    if (current == null) return Collections.emptyList();
    if (current instanceof java.util.Collection) {
      return (java.util.Collection<Organization>) current;
    }
    return Arrays.asList((Organization) current);
  }
  /**
   * A member of an Organization or a ProgramMembership. Organizations can be members of organizations; ProgramMembership is typically for individuals.
   * @return member property set by first invocation of member method or {@code null}.
   */
  @JsonIgnore public Person getMemberPerson() {
    return (Person) getValue("member");
  }
  /**
   * A member of an Organization or a ProgramMembership. Organizations can be members of organizations; ProgramMembership is typically for individuals.
   * @return all member properties as {@link java.util.Collection} or an empty collection 
   * if member was not set.
   */
  @JsonIgnore public java.util.Collection<Person> getMemberPersons() {
    final java.lang.Object current = myData.get("member");
    if (current == null) return Collections.emptyList();
    if (current instanceof java.util.Collection) {
      return (java.util.Collection<Person>) current;
    }
    return Arrays.asList((Person) current);
  }
  /**
   * The organization (airline, travelers' club, etc.) the membership is made with.
   * @return hostingOrganization property set by first invocation of hostingOrganization method or {@code null}.
   */
  @JsonIgnore public Organization getHostingOrganization() {
    return (Organization) getValue("hostingOrganization");
  }
  /**
   * The organization (airline, travelers' club, etc.) the membership is made with.
   * @return all hostingOrganization properties as {@link java.util.Collection} or an empty collection 
   * if hostingOrganization was not set.
   */
  @JsonIgnore public java.util.Collection<Organization> getHostingOrganizations() {
    final java.lang.Object current = myData.get("hostingOrganization");
    if (current == null) return Collections.emptyList();
    if (current instanceof java.util.Collection) {
      return (java.util.Collection<Organization>) current;
    }
    return Arrays.asList((Organization) current);
  }
  /**
   * A unique identifier for the membership.
   * @return membershipNumber property set by first invocation of membershipNumber method or {@code null}.
   */
  @JsonIgnore public String getMembershipNumber() {
    return (String) getValue("membershipNumber");
  }
  /**
   * A unique identifier for the membership.
   * @return all membershipNumber properties as {@link java.util.Collection} or an empty collection 
   * if membershipNumber was not set.
   */
  @JsonIgnore public java.util.Collection<String> getMembershipNumbers() {
    final java.lang.Object current = myData.get("membershipNumber");
    if (current == null) return Collections.emptyList();
    if (current instanceof java.util.Collection) {
      return (java.util.Collection<String>) current;
    }
    return Arrays.asList((String) current);
  }
  /**
   * The number of membership points earned by the member. If necessary, the unitText can be used to express the units the points are issued in. (e.g. stars, miles, etc.)
   * @return membershipPointsEarned property set by first invocation of membershipPointsEarned method or {@code null}.
   */
  @JsonIgnore public Integer getMembershipPointsEarnedInteger() {
    return (Integer) getValue("membershipPointsEarned");
  }
  /**
   * The number of membership points earned by the member. If necessary, the unitText can be used to express the units the points are issued in. (e.g. stars, miles, etc.)
   * @return all membershipPointsEarned properties as {@link java.util.Collection} or an empty collection 
   * if membershipPointsEarned was not set.
   */
  @JsonIgnore public java.util.Collection<Integer> getMembershipPointsEarnedIntegers() {
    final java.lang.Object current = myData.get("membershipPointsEarned");
    if (current == null) return Collections.emptyList();
    if (current instanceof java.util.Collection) {
      return (java.util.Collection<Integer>) current;
    }
    return Arrays.asList((Integer) current);
  }
  /**
   * The number of membership points earned by the member. If necessary, the unitText can be used to express the units the points are issued in. (e.g. stars, miles, etc.)
   * @return membershipPointsEarned property set by first invocation of membershipPointsEarned method or {@code null}.
   */
  @JsonIgnore public Long getMembershipPointsEarnedLong() {
    return (Long) getValue("membershipPointsEarned");
  }
  /**
   * The number of membership points earned by the member. If necessary, the unitText can be used to express the units the points are issued in. (e.g. stars, miles, etc.)
   * @return all membershipPointsEarned properties as {@link java.util.Collection} or an empty collection 
   * if membershipPointsEarned was not set.
   */
  @JsonIgnore public java.util.Collection<Long> getMembershipPointsEarnedLongs() {
    final java.lang.Object current = myData.get("membershipPointsEarned");
    if (current == null) return Collections.emptyList();
    if (current instanceof java.util.Collection) {
      return (java.util.Collection<Long>) current;
    }
    return Arrays.asList((Long) current);
  }
  /**
   * The number of membership points earned by the member. If necessary, the unitText can be used to express the units the points are issued in. (e.g. stars, miles, etc.)
   * @return membershipPointsEarned property set by first invocation of membershipPointsEarned method or {@code null}.
   */
  @JsonIgnore public Float getMembershipPointsEarnedFloat() {
    return (Float) getValue("membershipPointsEarned");
  }
  /**
   * The number of membership points earned by the member. If necessary, the unitText can be used to express the units the points are issued in. (e.g. stars, miles, etc.)
   * @return all membershipPointsEarned properties as {@link java.util.Collection} or an empty collection 
   * if membershipPointsEarned was not set.
   */
  @JsonIgnore public java.util.Collection<Float> getMembershipPointsEarnedFloats() {
    final java.lang.Object current = myData.get("membershipPointsEarned");
    if (current == null) return Collections.emptyList();
    if (current instanceof java.util.Collection) {
      return (java.util.Collection<Float>) current;
    }
    return Arrays.asList((Float) current);
  }
  /**
   * The number of membership points earned by the member. If necessary, the unitText can be used to express the units the points are issued in. (e.g. stars, miles, etc.)
   * @return membershipPointsEarned property set by first invocation of membershipPointsEarned method or {@code null}.
   */
  @JsonIgnore public Double getMembershipPointsEarnedDouble() {
    return (Double) getValue("membershipPointsEarned");
  }
  /**
   * The number of membership points earned by the member. If necessary, the unitText can be used to express the units the points are issued in. (e.g. stars, miles, etc.)
   * @return all membershipPointsEarned properties as {@link java.util.Collection} or an empty collection 
   * if membershipPointsEarned was not set.
   */
  @JsonIgnore public java.util.Collection<Double> getMembershipPointsEarnedDoubles() {
    final java.lang.Object current = myData.get("membershipPointsEarned");
    if (current == null) return Collections.emptyList();
    if (current instanceof java.util.Collection) {
      return (java.util.Collection<Double>) current;
    }
    return Arrays.asList((Double) current);
  }
  /**
   * The number of membership points earned by the member. If necessary, the unitText can be used to express the units the points are issued in. (e.g. stars, miles, etc.)
   * @return membershipPointsEarned property set by first invocation of membershipPointsEarned method or {@code null}.
   */
  @JsonIgnore public String getMembershipPointsEarnedString() {
    return (String) getValue("membershipPointsEarned");
  }
  /**
   * The number of membership points earned by the member. If necessary, the unitText can be used to express the units the points are issued in. (e.g. stars, miles, etc.)
   * @return all membershipPointsEarned properties as {@link java.util.Collection} or an empty collection 
   * if membershipPointsEarned was not set.
   */
  @JsonIgnore public java.util.Collection<String> getMembershipPointsEarnedStrings() {
    final java.lang.Object current = myData.get("membershipPointsEarned");
    if (current == null) return Collections.emptyList();
    if (current instanceof java.util.Collection) {
      return (java.util.Collection<String>) current;
    }
    return Arrays.asList((String) current);
  }
  protected ProgramMembership(java.util.Map<String,java.lang.Object> data) {
    super(data);
  }
  /**
   * @return new {@link Builder} initialized with this instance's data
   */
  @NotNull public Builder toBuilder() {
    return new Builder(new HashMap<>(this.myData));
  }
  
  /**
   * Builder for {@link ProgramMembership}
   */
  public static class Builder extends Intangible.Builder {
    public Builder(@NotNull HashMap<String,java.lang.Object> data) {
      super(data);
    }
    @NotNull public ProgramMembership build() {
      return new ProgramMembership(myData);
    }
    /**
     * The program providing the membership.
     * @param programName value to set
     * @return this builder instance
     */
    @NotNull public Builder programName(@NotNull String programName) {
      putValue("programName", programName);
      return this;
    }
    /**
     * Remove programName property from the builder.
     * If this property is repeatable, all instances are removed.
     * @return this builder instance
     */
    @NotNull public Builder removeProgramName() {
      removeValue("programName");
      return this;
    }
    /**
     * Get currently set value for programName property in this builder.
     * @return previously set value or {@code null}. If multiple values have been 
     * set to this property, then {@link java.util.Collection} instance will be 
     * returned.
     */
    @Nullable public java.lang.Object getProgramName() {
      return myData.get("programName");
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
     * The organization (airline, travelers' club, etc.) the membership is made with.
     * @param organization value to set
     * @return this builder instance
     */
    @NotNull public Builder hostingOrganization(@NotNull Organization organization) {
      putValue("hostingOrganization", organization);
      return this;
    }
    /**
     * The organization (airline, travelers' club, etc.) the membership is made with.
     * @param organization value to set
     * @return this builder instance
     */
    @NotNull public Builder hostingOrganization(@NotNull Organization.Builder organization) {
      putValue("hostingOrganization", organization.build());
      return this;
    }
    /**
     * Remove hostingOrganization property from the builder.
     * If this property is repeatable, all instances are removed.
     * @return this builder instance
     */
    @NotNull public Builder removeHostingOrganization() {
      removeValue("hostingOrganization");
      return this;
    }
    /**
     * Get currently set value for hostingOrganization property in this builder.
     * @return previously set value or {@code null}. If multiple values have been 
     * set to this property, then {@link java.util.Collection} instance will be 
     * returned.
     */
    @Nullable public java.lang.Object getHostingOrganization() {
      return myData.get("hostingOrganization");
    }
    /**
     * A unique identifier for the membership.
     * @param membershipNumber value to set
     * @return this builder instance
     */
    @NotNull public Builder membershipNumber(@NotNull String membershipNumber) {
      putValue("membershipNumber", membershipNumber);
      return this;
    }
    /**
     * Remove membershipNumber property from the builder.
     * If this property is repeatable, all instances are removed.
     * @return this builder instance
     */
    @NotNull public Builder removeMembershipNumber() {
      removeValue("membershipNumber");
      return this;
    }
    /**
     * Get currently set value for membershipNumber property in this builder.
     * @return previously set value or {@code null}. If multiple values have been 
     * set to this property, then {@link java.util.Collection} instance will be 
     * returned.
     */
    @Nullable public java.lang.Object getMembershipNumber() {
      return myData.get("membershipNumber");
    }
    /**
     * The number of membership points earned by the member. If necessary, the unitText can be used to express the units the points are issued in. (e.g. stars, miles, etc.)
     * @param integer value to set
     * @return this builder instance
     */
    @NotNull public Builder membershipPointsEarned(@NotNull Integer integer) {
      putValue("membershipPointsEarned", integer);
      return this;
    }
    /**
     * The number of membership points earned by the member. If necessary, the unitText can be used to express the units the points are issued in. (e.g. stars, miles, etc.)
     * @param membershipPointsEarned value to set
     * @return this builder instance
     */
    @NotNull public Builder membershipPointsEarned(@NotNull Long membershipPointsEarned) {
      putValue("membershipPointsEarned", membershipPointsEarned);
      return this;
    }
    /**
     * The number of membership points earned by the member. If necessary, the unitText can be used to express the units the points are issued in. (e.g. stars, miles, etc.)
     * @param membershipPointsEarned value to set
     * @return this builder instance
     */
    @NotNull public Builder membershipPointsEarned(@NotNull Float membershipPointsEarned) {
      putValue("membershipPointsEarned", membershipPointsEarned);
      return this;
    }
    /**
     * The number of membership points earned by the member. If necessary, the unitText can be used to express the units the points are issued in. (e.g. stars, miles, etc.)
     * @param membershipPointsEarned value to set
     * @return this builder instance
     */
    @NotNull public Builder membershipPointsEarned(@NotNull Double membershipPointsEarned) {
      putValue("membershipPointsEarned", membershipPointsEarned);
      return this;
    }
    /**
     * The number of membership points earned by the member. If necessary, the unitText can be used to express the units the points are issued in. (e.g. stars, miles, etc.)
     * @param membershipPointsEarned value to set
     * @return this builder instance
     */
    @NotNull public Builder membershipPointsEarned(@NotNull String membershipPointsEarned) {
      putValue("membershipPointsEarned", membershipPointsEarned);
      return this;
    }
    /**
     * Remove membershipPointsEarned property from the builder.
     * If this property is repeatable, all instances are removed.
     * @return this builder instance
     */
    @NotNull public Builder removeMembershipPointsEarned() {
      removeValue("membershipPointsEarned");
      return this;
    }
    /**
     * Get currently set value for membershipPointsEarned property in this builder.
     * @return previously set value or {@code null}. If multiple values have been 
     * set to this property, then {@link java.util.Collection} instance will be 
     * returned.
     */
    @Nullable public java.lang.Object getMembershipPointsEarned() {
      return myData.get("membershipPointsEarned");
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
      if ("programName".equals(key) && value instanceof String) { this.programName((String)value); return; }
      if ("programNames".equals(key) && value instanceof String) { this.programName((String)value); return; }
      if ("member".equals(key) && value instanceof Organization) { this.member((Organization)value); return; }
      if ("members".equals(key) && value instanceof Organization) { this.member((Organization)value); return; }
      if ("member".equals(key) && value instanceof Person) { this.member((Person)value); return; }
      if ("members".equals(key) && value instanceof Person) { this.member((Person)value); return; }
      if ("hostingOrganization".equals(key) && value instanceof Organization) { this.hostingOrganization((Organization)value); return; }
      if ("hostingOrganizations".equals(key) && value instanceof Organization) { this.hostingOrganization((Organization)value); return; }
      if ("membershipNumber".equals(key) && value instanceof String) { this.membershipNumber((String)value); return; }
      if ("membershipNumbers".equals(key) && value instanceof String) { this.membershipNumber((String)value); return; }
      if ("membershipPointsEarned".equals(key) && value instanceof Integer) { this.membershipPointsEarned((Integer)value); return; }
      if ("membershipPointsEarneds".equals(key) && value instanceof Integer) { this.membershipPointsEarned((Integer)value); return; }
      if ("membershipPointsEarned".equals(key) && value instanceof Long) { this.membershipPointsEarned((Long)value); return; }
      if ("membershipPointsEarneds".equals(key) && value instanceof Long) { this.membershipPointsEarned((Long)value); return; }
      if ("membershipPointsEarned".equals(key) && value instanceof Float) { this.membershipPointsEarned((Float)value); return; }
      if ("membershipPointsEarneds".equals(key) && value instanceof Float) { this.membershipPointsEarned((Float)value); return; }
      if ("membershipPointsEarned".equals(key) && value instanceof Double) { this.membershipPointsEarned((Double)value); return; }
      if ("membershipPointsEarneds".equals(key) && value instanceof Double) { this.membershipPointsEarned((Double)value); return; }
      if ("membershipPointsEarned".equals(key) && value instanceof String) { this.membershipPointsEarned((String)value); return; }
      if ("membershipPointsEarneds".equals(key) && value instanceof String) { this.membershipPointsEarned((String)value); return; }
      super.fromMap(key, value);
    }
  }
  
}
