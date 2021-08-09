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
 * A subclass of OrganizationRole used to describe employee relationships.
 */
public class EmployeeRole extends OrganizationRole {
  /**
   * The currency (coded using [ISO 4217](http://en.wikipedia.org/wiki/ISO_4217) ) used for the main salary information in this job posting or for this employee.
   * @return salaryCurrency property set by first invocation of salaryCurrency method or {@code null}.
   */
  @JsonIgnore public String getSalaryCurrency() {
    return (String) getValue("salaryCurrency");
  }
  /**
   * The currency (coded using [ISO 4217](http://en.wikipedia.org/wiki/ISO_4217) ) used for the main salary information in this job posting or for this employee.
   * @return all salaryCurrency properties as {@link java.util.Collection} or an empty collection 
   * if salaryCurrency was not set.
   */
  @JsonIgnore public java.util.Collection<String> getSalaryCurrencys() {
    final java.lang.Object current = myData.get("salaryCurrency");
    if (current == null) return Collections.emptyList();
    if (current instanceof java.util.Collection) {
      return (java.util.Collection<String>) current;
    }
    return Arrays.asList((String) current);
  }
  /**
   * The base salary of the job or of an employee in an EmployeeRole.
   * @return baseSalary property set by first invocation of baseSalary method or {@code null}.
   */
  @JsonIgnore public MonetaryAmount getBaseSalaryMonetaryAmount() {
    return (MonetaryAmount) getValue("baseSalary");
  }
  /**
   * The base salary of the job or of an employee in an EmployeeRole.
   * @return all baseSalary properties as {@link java.util.Collection} or an empty collection 
   * if baseSalary was not set.
   */
  @JsonIgnore public java.util.Collection<MonetaryAmount> getBaseSalaryMonetaryAmounts() {
    final java.lang.Object current = myData.get("baseSalary");
    if (current == null) return Collections.emptyList();
    if (current instanceof java.util.Collection) {
      return (java.util.Collection<MonetaryAmount>) current;
    }
    return Arrays.asList((MonetaryAmount) current);
  }
  /**
   * The base salary of the job or of an employee in an EmployeeRole.
   * @return baseSalary property set by first invocation of baseSalary method or {@code null}.
   */
  @JsonIgnore public Number getBaseSalaryNumber() {
    return (Number) getValue("baseSalary");
  }
  /**
   * The base salary of the job or of an employee in an EmployeeRole.
   * @return all baseSalary properties as {@link java.util.Collection} or an empty collection 
   * if baseSalary was not set.
   */
  @JsonIgnore public java.util.Collection<Number> getBaseSalaryNumbers() {
    final java.lang.Object current = myData.get("baseSalary");
    if (current == null) return Collections.emptyList();
    if (current instanceof java.util.Collection) {
      return (java.util.Collection<Number>) current;
    }
    return Arrays.asList((Number) current);
  }
  /**
   * The base salary of the job or of an employee in an EmployeeRole.
   * @return baseSalary property set by first invocation of baseSalary method or {@code null}.
   */
  @JsonIgnore public PriceSpecification getBaseSalaryPriceSpecification() {
    return (PriceSpecification) getValue("baseSalary");
  }
  /**
   * The base salary of the job or of an employee in an EmployeeRole.
   * @return all baseSalary properties as {@link java.util.Collection} or an empty collection 
   * if baseSalary was not set.
   */
  @JsonIgnore public java.util.Collection<PriceSpecification> getBaseSalaryPriceSpecifications() {
    final java.lang.Object current = myData.get("baseSalary");
    if (current == null) return Collections.emptyList();
    if (current instanceof java.util.Collection) {
      return (java.util.Collection<PriceSpecification>) current;
    }
    return Arrays.asList((PriceSpecification) current);
  }
  protected EmployeeRole(java.util.Map<String,java.lang.Object> data) {
    super(data);
  }
  /**
   * @return new {@link Builder} initialized with this instance's data
   */
  @NotNull public Builder toBuilder() {
    return new Builder(new HashMap<>(this.myData));
  }
  
  /**
   * Builder for {@link EmployeeRole}
   */
  public static class Builder extends OrganizationRole.Builder {
    public Builder(@NotNull HashMap<String,java.lang.Object> data) {
      super(data);
    }
    @NotNull public EmployeeRole build() {
      return new EmployeeRole(myData);
    }
    /**
     * The currency (coded using [ISO 4217](http://en.wikipedia.org/wiki/ISO_4217) ) used for the main salary information in this job posting or for this employee.
     * @param salaryCurrency value to set
     * @return this builder instance
     */
    @NotNull public Builder salaryCurrency(@NotNull String salaryCurrency) {
      putValue("salaryCurrency", salaryCurrency);
      return this;
    }
    /**
     * Remove salaryCurrency property from the builder.
     * If this property is repeatable, all instances are removed.
     * @return this builder instance
     */
    @NotNull public Builder removeSalaryCurrency() {
      removeValue("salaryCurrency");
      return this;
    }
    /**
     * Get currently set value for salaryCurrency property in this builder.
     * @return previously set value or {@code null}. If multiple values have been 
     * set to this property, then {@link java.util.Collection} instance will be 
     * returned.
     */
    @Nullable public java.lang.Object getSalaryCurrency() {
      return myData.get("salaryCurrency");
    }
    /**
     * The base salary of the job or of an employee in an EmployeeRole.
     * @param monetaryAmount value to set
     * @return this builder instance
     */
    @NotNull public Builder baseSalary(@NotNull MonetaryAmount monetaryAmount) {
      putValue("baseSalary", monetaryAmount);
      return this;
    }
    /**
     * The base salary of the job or of an employee in an EmployeeRole.
     * @param monetaryAmount value to set
     * @return this builder instance
     */
    @NotNull public Builder baseSalary(@NotNull MonetaryAmount.Builder monetaryAmount) {
      putValue("baseSalary", monetaryAmount.build());
      return this;
    }
    /**
     * The base salary of the job or of an employee in an EmployeeRole.
     * @param number value to set
     * @return this builder instance
     */
    @NotNull public Builder baseSalary(@NotNull Number number) {
      putValue("baseSalary", number);
      return this;
    }
    /**
     * The base salary of the job or of an employee in an EmployeeRole.
     * @param priceSpecification value to set
     * @return this builder instance
     */
    @NotNull public Builder baseSalary(@NotNull PriceSpecification priceSpecification) {
      putValue("baseSalary", priceSpecification);
      return this;
    }
    /**
     * The base salary of the job or of an employee in an EmployeeRole.
     * @param priceSpecification value to set
     * @return this builder instance
     */
    @NotNull public Builder baseSalary(@NotNull PriceSpecification.Builder priceSpecification) {
      putValue("baseSalary", priceSpecification.build());
      return this;
    }
    /**
     * Remove baseSalary property from the builder.
     * If this property is repeatable, all instances are removed.
     * @return this builder instance
     */
    @NotNull public Builder removeBaseSalary() {
      removeValue("baseSalary");
      return this;
    }
    /**
     * Get currently set value for baseSalary property in this builder.
     * @return previously set value or {@code null}. If multiple values have been 
     * set to this property, then {@link java.util.Collection} instance will be 
     * returned.
     */
    @Nullable public java.lang.Object getBaseSalary() {
      return myData.get("baseSalary");
    }
    /**
     * A number associated with a role in an organization, for example, the number on an athlete's jersey.
     * @param integer value to set
     * @return this builder instance
     */
    @NotNull public Builder numberedPosition(@NotNull Integer integer) {
      putValue("numberedPosition", integer);
      return this;
    }
    /**
     * A number associated with a role in an organization, for example, the number on an athlete's jersey.
     * @param numberedPosition value to set
     * @return this builder instance
     */
    @NotNull public Builder numberedPosition(@NotNull Long numberedPosition) {
      putValue("numberedPosition", numberedPosition);
      return this;
    }
    /**
     * A number associated with a role in an organization, for example, the number on an athlete's jersey.
     * @param numberedPosition value to set
     * @return this builder instance
     */
    @NotNull public Builder numberedPosition(@NotNull Float numberedPosition) {
      putValue("numberedPosition", numberedPosition);
      return this;
    }
    /**
     * A number associated with a role in an organization, for example, the number on an athlete's jersey.
     * @param numberedPosition value to set
     * @return this builder instance
     */
    @NotNull public Builder numberedPosition(@NotNull Double numberedPosition) {
      putValue("numberedPosition", numberedPosition);
      return this;
    }
    /**
     * A number associated with a role in an organization, for example, the number on an athlete's jersey.
     * @param numberedPosition value to set
     * @return this builder instance
     */
    @NotNull public Builder numberedPosition(@NotNull String numberedPosition) {
      putValue("numberedPosition", numberedPosition);
      return this;
    }
    /**
     * Remove numberedPosition property from the builder.
     * If this property is repeatable, all instances are removed.
     * @return this builder instance
     */
    @NotNull public Builder removeNumberedPosition() {
      removeValue("numberedPosition");
      return this;
    }
    /**
     * Get currently set value for numberedPosition property in this builder.
     * @return previously set value or {@code null}. If multiple values have been 
     * set to this property, then {@link java.util.Collection} instance will be 
     * returned.
     */
    @Nullable public java.lang.Object getNumberedPosition() {
      return myData.get("numberedPosition");
    }
    /**
     * The start date and time of the item (in [ISO 8601 date format](http://en.wikipedia.org/wiki/ISO_8601)).
     * @param date value to set
     * @return this builder instance
     */
    @NotNull public Builder startDate(@NotNull java.util.Date date) {
      putValue("startDate", date);
      return this;
    }
    /**
     * Remove startDate property from the builder.
     * If this property is repeatable, all instances are removed.
     * @return this builder instance
     */
    @NotNull public Builder removeStartDate() {
      removeValue("startDate");
      return this;
    }
    /**
     * Get currently set value for startDate property in this builder.
     * @return previously set value or {@code null}. If multiple values have been 
     * set to this property, then {@link java.util.Collection} instance will be 
     * returned.
     */
    @Nullable public java.lang.Object getStartDate() {
      return myData.get("startDate");
    }
    /**
     * A role played, performed or filled by a person or organization. For example, the team of creators for a comic book might fill the roles named 'inker', 'penciller', and 'letterer'; or an athlete in a SportsTeam might play in the position named 'Quarterback'.
     * @param roleName value to set
     * @return this builder instance
     */
    @NotNull public Builder roleName(@NotNull String roleName) {
      putValue("roleName", roleName);
      return this;
    }
    /**
     * Remove roleName property from the builder.
     * If this property is repeatable, all instances are removed.
     * @return this builder instance
     */
    @NotNull public Builder removeRoleName() {
      removeValue("roleName");
      return this;
    }
    /**
     * Get currently set value for roleName property in this builder.
     * @return previously set value or {@code null}. If multiple values have been 
     * set to this property, then {@link java.util.Collection} instance will be 
     * returned.
     */
    @Nullable public java.lang.Object getRoleName() {
      return myData.get("roleName");
    }
    /**
     * The end date and time of the item (in [ISO 8601 date format](http://en.wikipedia.org/wiki/ISO_8601)).
     * @param date value to set
     * @return this builder instance
     */
    @NotNull public Builder endDate(@NotNull java.util.Date date) {
      putValue("endDate", date);
      return this;
    }
    /**
     * Remove endDate property from the builder.
     * If this property is repeatable, all instances are removed.
     * @return this builder instance
     */
    @NotNull public Builder removeEndDate() {
      removeValue("endDate");
      return this;
    }
    /**
     * Get currently set value for endDate property in this builder.
     * @return previously set value or {@code null}. If multiple values have been 
     * set to this property, then {@link java.util.Collection} instance will be 
     * returned.
     */
    @Nullable public java.lang.Object getEndDate() {
      return myData.get("endDate");
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
      if ("salaryCurrency".equals(key) && value instanceof String) { this.salaryCurrency((String)value); return; }
      if ("salaryCurrencys".equals(key) && value instanceof String) { this.salaryCurrency((String)value); return; }
      if ("baseSalary".equals(key) && value instanceof MonetaryAmount) { this.baseSalary((MonetaryAmount)value); return; }
      if ("baseSalarys".equals(key) && value instanceof MonetaryAmount) { this.baseSalary((MonetaryAmount)value); return; }
      if ("baseSalary".equals(key) && value instanceof Number) { this.baseSalary((Number)value); return; }
      if ("baseSalarys".equals(key) && value instanceof Number) { this.baseSalary((Number)value); return; }
      if ("baseSalary".equals(key) && value instanceof PriceSpecification) { this.baseSalary((PriceSpecification)value); return; }
      if ("baseSalarys".equals(key) && value instanceof PriceSpecification) { this.baseSalary((PriceSpecification)value); return; }
      super.fromMap(key, value);
    }
  }
  
}
