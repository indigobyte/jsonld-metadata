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
 * A subclass of OrganizationRole used to describe employee relationships.
 */
public class EmployeeRole extends OrganizationRole {
  /**
   * The currency (coded using [ISO 4217](http://en.wikipedia.org/wiki/ISO_4217) ) used for the main salary information in this job posting or for this employee.
   */
  @JsonIgnore public String getSalaryCurrency() {
    return (String) getValue("salaryCurrency");
  }
  /**
   * The currency (coded using [ISO 4217](http://en.wikipedia.org/wiki/ISO_4217) ) used for the main salary information in this job posting or for this employee.
   */
  @JsonIgnore public Collection<String> getSalaryCurrencys() {
    final Object current = myData.get("salaryCurrency");
    if (current == null) return Collections.emptyList();
    if (current instanceof Collection) {
      return (Collection<String>) current;
    }
    return Arrays.asList((String) current);
  }
  /**
   * The base salary of the job or of an employee in an EmployeeRole.
   */
  @JsonIgnore public MonetaryAmount getBaseSalaryMonetaryAmount() {
    return (MonetaryAmount) getValue("baseSalary");
  }
  /**
   * The base salary of the job or of an employee in an EmployeeRole.
   */
  @JsonIgnore public Collection<MonetaryAmount> getBaseSalaryMonetaryAmounts() {
    final Object current = myData.get("baseSalary");
    if (current == null) return Collections.emptyList();
    if (current instanceof Collection) {
      return (Collection<MonetaryAmount>) current;
    }
    return Arrays.asList((MonetaryAmount) current);
  }
  /**
   * The base salary of the job or of an employee in an EmployeeRole.
   */
  @JsonIgnore public Number getBaseSalaryNumber() {
    return (Number) getValue("baseSalary");
  }
  /**
   * The base salary of the job or of an employee in an EmployeeRole.
   */
  @JsonIgnore public Collection<Number> getBaseSalaryNumbers() {
    final Object current = myData.get("baseSalary");
    if (current == null) return Collections.emptyList();
    if (current instanceof Collection) {
      return (Collection<Number>) current;
    }
    return Arrays.asList((Number) current);
  }
  /**
   * The base salary of the job or of an employee in an EmployeeRole.
   */
  @JsonIgnore public PriceSpecification getBaseSalaryPriceSpecification() {
    return (PriceSpecification) getValue("baseSalary");
  }
  /**
   * The base salary of the job or of an employee in an EmployeeRole.
   */
  @JsonIgnore public Collection<PriceSpecification> getBaseSalaryPriceSpecifications() {
    final Object current = myData.get("baseSalary");
    if (current == null) return Collections.emptyList();
    if (current instanceof Collection) {
      return (Collection<PriceSpecification>) current;
    }
    return Arrays.asList((PriceSpecification) current);
  }
  protected EmployeeRole(java.util.Map<String,Object> data) {
    super(data);
  }
  
  /**
   * Builder for {@link EmployeeRole}
   */
  public static class Builder extends OrganizationRole.Builder {
    public Builder(@NotNull HashMap<String,Object> data) {
      super(data);
    }
    @NotNull public EmployeeRole build() {
      return new EmployeeRole(myData);
    }
    /**
     * The currency (coded using [ISO 4217](http://en.wikipedia.org/wiki/ISO_4217) ) used for the main salary information in this job posting or for this employee.
     */
    @NotNull public Builder salaryCurrency(@NotNull String salaryCurrency) {
      putValue("salaryCurrency", salaryCurrency);
      return this;
    }
    /**
     * The base salary of the job or of an employee in an EmployeeRole.
     */
    @NotNull public Builder baseSalary(@NotNull MonetaryAmount monetaryAmount) {
      putValue("baseSalary", monetaryAmount);
      return this;
    }
    /**
     * The base salary of the job or of an employee in an EmployeeRole.
     */
    @NotNull public Builder baseSalary(@NotNull MonetaryAmount.Builder monetaryAmount) {
      putValue("baseSalary", monetaryAmount.build());
      return this;
    }
    /**
     * The base salary of the job or of an employee in an EmployeeRole.
     */
    @NotNull public Builder baseSalary(@NotNull Number number) {
      putValue("baseSalary", number);
      return this;
    }
    /**
     * The base salary of the job or of an employee in an EmployeeRole.
     */
    @NotNull public Builder baseSalary(@NotNull PriceSpecification priceSpecification) {
      putValue("baseSalary", priceSpecification);
      return this;
    }
    /**
     * The base salary of the job or of an employee in an EmployeeRole.
     */
    @NotNull public Builder baseSalary(@NotNull PriceSpecification.Builder priceSpecification) {
      putValue("baseSalary", priceSpecification.build());
      return this;
    }
    /**
     * A number associated with a role in an organization, for example, the number on an athlete's jersey.
     */
    @NotNull public Builder numberedPosition(@NotNull Integer integer) {
      putValue("numberedPosition", integer);
      return this;
    }
    /**
     * A number associated with a role in an organization, for example, the number on an athlete's jersey.
     */
    @NotNull public Builder numberedPosition(@NotNull Long numberedPosition) {
      putValue("numberedPosition", numberedPosition);
      return this;
    }
    /**
     * A number associated with a role in an organization, for example, the number on an athlete's jersey.
     */
    @NotNull public Builder numberedPosition(@NotNull Float numberedPosition) {
      putValue("numberedPosition", numberedPosition);
      return this;
    }
    /**
     * A number associated with a role in an organization, for example, the number on an athlete's jersey.
     */
    @NotNull public Builder numberedPosition(@NotNull Double numberedPosition) {
      putValue("numberedPosition", numberedPosition);
      return this;
    }
    /**
     * A number associated with a role in an organization, for example, the number on an athlete's jersey.
     */
    @NotNull public Builder numberedPosition(@NotNull String numberedPosition) {
      putValue("numberedPosition", numberedPosition);
      return this;
    }
    /**
     * The start date and time of the item (in [ISO 8601 date format](http://en.wikipedia.org/wiki/ISO_8601)).
     */
    @NotNull public Builder startDate(@NotNull java.util.Date date) {
      putValue("startDate", date);
      return this;
    }
    /**
     * A role played, performed or filled by a person or organization. For example, the team of creators for a comic book might fill the roles named 'inker', 'penciller', and 'letterer'; or an athlete in a SportsTeam might play in the position named 'Quarterback'.
     */
    @NotNull public Builder roleName(@NotNull String roleName) {
      putValue("roleName", roleName);
      return this;
    }
    /**
     * The end date and time of the item (in [ISO 8601 date format](http://en.wikipedia.org/wiki/ISO_8601)).
     */
    @NotNull public Builder endDate(@NotNull java.util.Date date) {
      putValue("endDate", date);
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
