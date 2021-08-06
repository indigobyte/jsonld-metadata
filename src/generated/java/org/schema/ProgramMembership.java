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
 * Used to describe membership in a loyalty programs (e.g. &quot;StarAliance&quot;), traveler clubs (e.g. &quot;AAA&quot;), purchase clubs (&quot;Safeway Club&quot;), etc.
 */
public class ProgramMembership extends Intangible implements org.schema.MemberOf {
  /**
   * The program providing the membership.
   */
  @JsonIgnore public String getProgramName() {
    return (String) getValue("programName");
  }
  /**
   * The program providing the membership.
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
   */
  @JsonIgnore public Organization getMemberOrganization() {
    return (Organization) getValue("member");
  }
  /**
   * A member of an Organization or a ProgramMembership. Organizations can be members of organizations; ProgramMembership is typically for individuals.
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
   */
  @JsonIgnore public Person getMemberPerson() {
    return (Person) getValue("member");
  }
  /**
   * A member of an Organization or a ProgramMembership. Organizations can be members of organizations; ProgramMembership is typically for individuals.
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
   */
  @JsonIgnore public Organization getHostingOrganization() {
    return (Organization) getValue("hostingOrganization");
  }
  /**
   * The organization (airline, travelers' club, etc.) the membership is made with.
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
   */
  @JsonIgnore public String getMembershipNumber() {
    return (String) getValue("membershipNumber");
  }
  /**
   * A unique identifier for the membership.
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
   */
  @JsonIgnore public Integer getMembershipPointsEarnedInteger() {
    return (Integer) getValue("membershipPointsEarned");
  }
  /**
   * The number of membership points earned by the member. If necessary, the unitText can be used to express the units the points are issued in. (e.g. stars, miles, etc.)
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
   */
  @JsonIgnore public Long getMembershipPointsEarnedLong() {
    return (Long) getValue("membershipPointsEarned");
  }
  /**
   * The number of membership points earned by the member. If necessary, the unitText can be used to express the units the points are issued in. (e.g. stars, miles, etc.)
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
   */
  @JsonIgnore public Float getMembershipPointsEarnedFloat() {
    return (Float) getValue("membershipPointsEarned");
  }
  /**
   * The number of membership points earned by the member. If necessary, the unitText can be used to express the units the points are issued in. (e.g. stars, miles, etc.)
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
   */
  @JsonIgnore public Double getMembershipPointsEarnedDouble() {
    return (Double) getValue("membershipPointsEarned");
  }
  /**
   * The number of membership points earned by the member. If necessary, the unitText can be used to express the units the points are issued in. (e.g. stars, miles, etc.)
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
   */
  @JsonIgnore public String getMembershipPointsEarnedString() {
    return (String) getValue("membershipPointsEarned");
  }
  /**
   * The number of membership points earned by the member. If necessary, the unitText can be used to express the units the points are issued in. (e.g. stars, miles, etc.)
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
     */
    @NotNull public Builder programName(@NotNull String programName) {
      putValue("programName", programName);
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
     * The organization (airline, travelers' club, etc.) the membership is made with.
     */
    @NotNull public Builder hostingOrganization(@NotNull Organization organization) {
      putValue("hostingOrganization", organization);
      return this;
    }
    /**
     * The organization (airline, travelers' club, etc.) the membership is made with.
     */
    @NotNull public Builder hostingOrganization(@NotNull Organization.Builder organization) {
      putValue("hostingOrganization", organization.build());
      return this;
    }
    /**
     * A unique identifier for the membership.
     */
    @NotNull public Builder membershipNumber(@NotNull String membershipNumber) {
      putValue("membershipNumber", membershipNumber);
      return this;
    }
    /**
     * The number of membership points earned by the member. If necessary, the unitText can be used to express the units the points are issued in. (e.g. stars, miles, etc.)
     */
    @NotNull public Builder membershipPointsEarned(@NotNull Integer integer) {
      putValue("membershipPointsEarned", integer);
      return this;
    }
    /**
     * The number of membership points earned by the member. If necessary, the unitText can be used to express the units the points are issued in. (e.g. stars, miles, etc.)
     */
    @NotNull public Builder membershipPointsEarned(@NotNull Long membershipPointsEarned) {
      putValue("membershipPointsEarned", membershipPointsEarned);
      return this;
    }
    /**
     * The number of membership points earned by the member. If necessary, the unitText can be used to express the units the points are issued in. (e.g. stars, miles, etc.)
     */
    @NotNull public Builder membershipPointsEarned(@NotNull Float membershipPointsEarned) {
      putValue("membershipPointsEarned", membershipPointsEarned);
      return this;
    }
    /**
     * The number of membership points earned by the member. If necessary, the unitText can be used to express the units the points are issued in. (e.g. stars, miles, etc.)
     */
    @NotNull public Builder membershipPointsEarned(@NotNull Double membershipPointsEarned) {
      putValue("membershipPointsEarned", membershipPointsEarned);
      return this;
    }
    /**
     * The number of membership points earned by the member. If necessary, the unitText can be used to express the units the points are issued in. (e.g. stars, miles, etc.)
     */
    @NotNull public Builder membershipPointsEarned(@NotNull String membershipPointsEarned) {
      putValue("membershipPointsEarned", membershipPointsEarned);
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
