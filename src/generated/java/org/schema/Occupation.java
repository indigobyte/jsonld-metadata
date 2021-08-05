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
 * A profession, may involve prolonged training and/or a formal qualification.Source: https://github.com/schemaorg/schemaorg/issues/1698
 */
public class Occupation extends Intangible {
  /**
   * Educational background needed for the position or Occupation.
   */
  @JsonIgnore public String getEducationRequirements() {
    return (String) getValue("educationRequirements");
  }
  /**
   * Educational background needed for the position or Occupation.
   */
  @JsonIgnore public Collection<String> getEducationRequirementss() {
    final Object current = myData.get("educationRequirements");
    if (current == null) return Collections.emptyList();
    if (current instanceof Collection) {
      return (Collection<String>) current;
    }
    return Arrays.asList((String) current);
  }
  /**
   * An estimated salary for a job posting or occupation, based on a variety of variables including, but not limited to industry, job title, and location. Estimated salaries  are often computed by outside organizations rather than the hiring organization, who may not have committed to the estimated value.
   */
  @JsonIgnore public Integer getEstimatedSalaryInteger() {
    return (Integer) getValue("estimatedSalary");
  }
  /**
   * An estimated salary for a job posting or occupation, based on a variety of variables including, but not limited to industry, job title, and location. Estimated salaries  are often computed by outside organizations rather than the hiring organization, who may not have committed to the estimated value.
   */
  @JsonIgnore public Collection<Integer> getEstimatedSalaryIntegers() {
    final Object current = myData.get("estimatedSalary");
    if (current == null) return Collections.emptyList();
    if (current instanceof Collection) {
      return (Collection<Integer>) current;
    }
    return Arrays.asList((Integer) current);
  }
  /**
   * An estimated salary for a job posting or occupation, based on a variety of variables including, but not limited to industry, job title, and location. Estimated salaries  are often computed by outside organizations rather than the hiring organization, who may not have committed to the estimated value.
   */
  @JsonIgnore public Long getEstimatedSalaryLong() {
    return (Long) getValue("estimatedSalary");
  }
  /**
   * An estimated salary for a job posting or occupation, based on a variety of variables including, but not limited to industry, job title, and location. Estimated salaries  are often computed by outside organizations rather than the hiring organization, who may not have committed to the estimated value.
   */
  @JsonIgnore public Collection<Long> getEstimatedSalaryLongs() {
    final Object current = myData.get("estimatedSalary");
    if (current == null) return Collections.emptyList();
    if (current instanceof Collection) {
      return (Collection<Long>) current;
    }
    return Arrays.asList((Long) current);
  }
  /**
   * An estimated salary for a job posting or occupation, based on a variety of variables including, but not limited to industry, job title, and location. Estimated salaries  are often computed by outside organizations rather than the hiring organization, who may not have committed to the estimated value.
   */
  @JsonIgnore public Float getEstimatedSalaryFloat() {
    return (Float) getValue("estimatedSalary");
  }
  /**
   * An estimated salary for a job posting or occupation, based on a variety of variables including, but not limited to industry, job title, and location. Estimated salaries  are often computed by outside organizations rather than the hiring organization, who may not have committed to the estimated value.
   */
  @JsonIgnore public Collection<Float> getEstimatedSalaryFloats() {
    final Object current = myData.get("estimatedSalary");
    if (current == null) return Collections.emptyList();
    if (current instanceof Collection) {
      return (Collection<Float>) current;
    }
    return Arrays.asList((Float) current);
  }
  /**
   * An estimated salary for a job posting or occupation, based on a variety of variables including, but not limited to industry, job title, and location. Estimated salaries  are often computed by outside organizations rather than the hiring organization, who may not have committed to the estimated value.
   */
  @JsonIgnore public Double getEstimatedSalaryDouble() {
    return (Double) getValue("estimatedSalary");
  }
  /**
   * An estimated salary for a job posting or occupation, based on a variety of variables including, but not limited to industry, job title, and location. Estimated salaries  are often computed by outside organizations rather than the hiring organization, who may not have committed to the estimated value.
   */
  @JsonIgnore public Collection<Double> getEstimatedSalaryDoubles() {
    final Object current = myData.get("estimatedSalary");
    if (current == null) return Collections.emptyList();
    if (current instanceof Collection) {
      return (Collection<Double>) current;
    }
    return Arrays.asList((Double) current);
  }
  /**
   * An estimated salary for a job posting or occupation, based on a variety of variables including, but not limited to industry, job title, and location. Estimated salaries  are often computed by outside organizations rather than the hiring organization, who may not have committed to the estimated value.
   */
  @JsonIgnore public String getEstimatedSalaryString() {
    return (String) getValue("estimatedSalary");
  }
  /**
   * An estimated salary for a job posting or occupation, based on a variety of variables including, but not limited to industry, job title, and location. Estimated salaries  are often computed by outside organizations rather than the hiring organization, who may not have committed to the estimated value.
   */
  @JsonIgnore public Collection<String> getEstimatedSalaryStrings() {
    final Object current = myData.get("estimatedSalary");
    if (current == null) return Collections.emptyList();
    if (current instanceof Collection) {
      return (Collection<String>) current;
    }
    return Arrays.asList((String) current);
  }
  /**
   * Description of skills and experience needed for the position or Occupation.
   */
  @JsonIgnore public String getExperienceRequirements() {
    return (String) getValue("experienceRequirements");
  }
  /**
   * Description of skills and experience needed for the position or Occupation.
   */
  @JsonIgnore public Collection<String> getExperienceRequirementss() {
    final Object current = myData.get("experienceRequirements");
    if (current == null) return Collections.emptyList();
    if (current instanceof Collection) {
      return (Collection<String>) current;
    }
    return Arrays.asList((String) current);
  }
  /**
   * A category describing the job, preferably using a term from a taxonomy such as [BLS O*NET-SOC](http://www.onetcenter.org/taxonomy.html), [ISCO-08](https://www.ilo.org/public/english/bureau/stat/isco/isco08/) or similar, with the property repeated for each applicable value. Ideally the taxonomy should be identified, and both the textual label and formal code for the category should be provided.\n
   * Note: for historical reasons, any textual label and formal code provided as a literal may be assumed to be from O*NET-SOC.
   */
  @JsonIgnore public String getOccupationalCategory() {
    return (String) getValue("occupationalCategory");
  }
  /**
   * A category describing the job, preferably using a term from a taxonomy such as [BLS O*NET-SOC](http://www.onetcenter.org/taxonomy.html), [ISCO-08](https://www.ilo.org/public/english/bureau/stat/isco/isco08/) or similar, with the property repeated for each applicable value. Ideally the taxonomy should be identified, and both the textual label and formal code for the category should be provided.\n
   * Note: for historical reasons, any textual label and formal code provided as a literal may be assumed to be from O*NET-SOC.
   */
  @JsonIgnore public Collection<String> getOccupationalCategorys() {
    final Object current = myData.get("occupationalCategory");
    if (current == null) return Collections.emptyList();
    if (current instanceof Collection) {
      return (Collection<String>) current;
    }
    return Arrays.asList((String) current);
  }
  /**
   *  The region/country for which this occupational description is appropriate. Note that educational requirements and qualifications can vary between jurisdictions.
   */
  @JsonIgnore public AdministrativeArea getOccupationLocation() {
    return (AdministrativeArea) getValue("occupationLocation");
  }
  /**
   *  The region/country for which this occupational description is appropriate. Note that educational requirements and qualifications can vary between jurisdictions.
   */
  @JsonIgnore public Collection<AdministrativeArea> getOccupationLocations() {
    final Object current = myData.get("occupationLocation");
    if (current == null) return Collections.emptyList();
    if (current instanceof Collection) {
      return (Collection<AdministrativeArea>) current;
    }
    return Arrays.asList((AdministrativeArea) current);
  }
  /**
   * Specific qualifications required for this role or Occupation.
   */
  @JsonIgnore public String getQualifications() {
    return (String) getValue("qualifications");
  }
  /**
   * Specific qualifications required for this role or Occupation.
   */
  @JsonIgnore public Collection<String> getQualificationss() {
    final Object current = myData.get("qualifications");
    if (current == null) return Collections.emptyList();
    if (current instanceof Collection) {
      return (Collection<String>) current;
    }
    return Arrays.asList((String) current);
  }
  /**
   * Responsibilities associated with this role or Occupation.
   */
  @JsonIgnore public String getResponsibilities() {
    return (String) getValue("responsibilities");
  }
  /**
   * Responsibilities associated with this role or Occupation.
   */
  @JsonIgnore public Collection<String> getResponsibilitiess() {
    final Object current = myData.get("responsibilities");
    if (current == null) return Collections.emptyList();
    if (current instanceof Collection) {
      return (Collection<String>) current;
    }
    return Arrays.asList((String) current);
  }
  /**
   * A statement of knowledge, skill, ability, task or any other assertion expressing a competency that is desired or required to fulfill this role or to work in this occupation.
   */
  @JsonIgnore public String getSkills() {
    return (String) getValue("skills");
  }
  /**
   * A statement of knowledge, skill, ability, task or any other assertion expressing a competency that is desired or required to fulfill this role or to work in this occupation.
   */
  @JsonIgnore public Collection<String> getSkillss() {
    final Object current = myData.get("skills");
    if (current == null) return Collections.emptyList();
    if (current instanceof Collection) {
      return (Collection<String>) current;
    }
    return Arrays.asList((String) current);
  }
  protected Occupation(java.util.Map<String,Object> data) {
    super(data);
  }
  
  /**
   * Builder for {@link Occupation}
   */
  public static class Builder extends Intangible.Builder {
    public Builder(@NotNull HashMap<String,Object> data) {
      super(data);
    }
    @NotNull public Occupation build() {
      return new Occupation(myData);
    }
    /**
     * Educational background needed for the position or Occupation.
     */
    @NotNull public Builder educationRequirements(@NotNull String educationRequirements) {
      putValue("educationRequirements", educationRequirements);
      return this;
    }
    /**
     * An estimated salary for a job posting or occupation, based on a variety of variables including, but not limited to industry, job title, and location. Estimated salaries  are often computed by outside organizations rather than the hiring organization, who may not have committed to the estimated value.
     */
    @NotNull public Builder estimatedSalary(@NotNull Integer integer) {
      putValue("estimatedSalary", integer);
      return this;
    }
    /**
     * An estimated salary for a job posting or occupation, based on a variety of variables including, but not limited to industry, job title, and location. Estimated salaries  are often computed by outside organizations rather than the hiring organization, who may not have committed to the estimated value.
     */
    @NotNull public Builder estimatedSalary(@NotNull Long estimatedSalary) {
      putValue("estimatedSalary", estimatedSalary);
      return this;
    }
    /**
     * An estimated salary for a job posting or occupation, based on a variety of variables including, but not limited to industry, job title, and location. Estimated salaries  are often computed by outside organizations rather than the hiring organization, who may not have committed to the estimated value.
     */
    @NotNull public Builder estimatedSalary(@NotNull Float estimatedSalary) {
      putValue("estimatedSalary", estimatedSalary);
      return this;
    }
    /**
     * An estimated salary for a job posting or occupation, based on a variety of variables including, but not limited to industry, job title, and location. Estimated salaries  are often computed by outside organizations rather than the hiring organization, who may not have committed to the estimated value.
     */
    @NotNull public Builder estimatedSalary(@NotNull Double estimatedSalary) {
      putValue("estimatedSalary", estimatedSalary);
      return this;
    }
    /**
     * An estimated salary for a job posting or occupation, based on a variety of variables including, but not limited to industry, job title, and location. Estimated salaries  are often computed by outside organizations rather than the hiring organization, who may not have committed to the estimated value.
     */
    @NotNull public Builder estimatedSalary(@NotNull String estimatedSalary) {
      putValue("estimatedSalary", estimatedSalary);
      return this;
    }
    /**
     * Description of skills and experience needed for the position or Occupation.
     */
    @NotNull public Builder experienceRequirements(@NotNull String experienceRequirements) {
      putValue("experienceRequirements", experienceRequirements);
      return this;
    }
    /**
     * A category describing the job, preferably using a term from a taxonomy such as [BLS O*NET-SOC](http://www.onetcenter.org/taxonomy.html), [ISCO-08](https://www.ilo.org/public/english/bureau/stat/isco/isco08/) or similar, with the property repeated for each applicable value. Ideally the taxonomy should be identified, and both the textual label and formal code for the category should be provided.\n
     * Note: for historical reasons, any textual label and formal code provided as a literal may be assumed to be from O*NET-SOC.
     */
    @NotNull public Builder occupationalCategory(@NotNull String occupationalCategory) {
      putValue("occupationalCategory", occupationalCategory);
      return this;
    }
    /**
     *  The region/country for which this occupational description is appropriate. Note that educational requirements and qualifications can vary between jurisdictions.
     */
    @NotNull public Builder occupationLocation(@NotNull AdministrativeArea administrativeArea) {
      putValue("occupationLocation", administrativeArea);
      return this;
    }
    /**
     *  The region/country for which this occupational description is appropriate. Note that educational requirements and qualifications can vary between jurisdictions.
     */
    @NotNull public Builder occupationLocation(@NotNull AdministrativeArea.Builder administrativeArea) {
      putValue("occupationLocation", administrativeArea.build());
      return this;
    }
    /**
     * Specific qualifications required for this role or Occupation.
     */
    @NotNull public Builder qualifications(@NotNull String qualifications) {
      putValue("qualifications", qualifications);
      return this;
    }
    /**
     * Responsibilities associated with this role or Occupation.
     */
    @NotNull public Builder responsibilities(@NotNull String responsibilities) {
      putValue("responsibilities", responsibilities);
      return this;
    }
    /**
     * A statement of knowledge, skill, ability, task or any other assertion expressing a competency that is desired or required to fulfill this role or to work in this occupation.
     */
    @NotNull public Builder skills(@NotNull String skills) {
      putValue("skills", skills);
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
     * An alias for the item.
     */
    @NotNull public Builder alternateName(@NotNull String alternateName) {
      putValue("alternateName", alternateName);
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
     * The name of the item.
     */
    @NotNull public Builder name(@NotNull String name) {
      putValue("name", name);
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
      if ("educationRequirements".equals(key) && value instanceof String) { educationRequirements((String)value); return; }
      if ("educationRequirementss".equals(key) && value instanceof String) { educationRequirements((String)value); return; }
      if ("estimatedSalary".equals(key) && value instanceof Integer) { estimatedSalary((Integer)value); return; }
      if ("estimatedSalarys".equals(key) && value instanceof Integer) { estimatedSalary((Integer)value); return; }
      if ("estimatedSalary".equals(key) && value instanceof Long) { estimatedSalary((Long)value); return; }
      if ("estimatedSalarys".equals(key) && value instanceof Long) { estimatedSalary((Long)value); return; }
      if ("estimatedSalary".equals(key) && value instanceof Float) { estimatedSalary((Float)value); return; }
      if ("estimatedSalarys".equals(key) && value instanceof Float) { estimatedSalary((Float)value); return; }
      if ("estimatedSalary".equals(key) && value instanceof Double) { estimatedSalary((Double)value); return; }
      if ("estimatedSalarys".equals(key) && value instanceof Double) { estimatedSalary((Double)value); return; }
      if ("estimatedSalary".equals(key) && value instanceof String) { estimatedSalary((String)value); return; }
      if ("estimatedSalarys".equals(key) && value instanceof String) { estimatedSalary((String)value); return; }
      if ("experienceRequirements".equals(key) && value instanceof String) { experienceRequirements((String)value); return; }
      if ("experienceRequirementss".equals(key) && value instanceof String) { experienceRequirements((String)value); return; }
      if ("occupationalCategory".equals(key) && value instanceof String) { occupationalCategory((String)value); return; }
      if ("occupationalCategorys".equals(key) && value instanceof String) { occupationalCategory((String)value); return; }
      if ("occupationLocation".equals(key) && value instanceof AdministrativeArea) { occupationLocation((AdministrativeArea)value); return; }
      if ("occupationLocations".equals(key) && value instanceof AdministrativeArea) { occupationLocation((AdministrativeArea)value); return; }
      if ("qualifications".equals(key) && value instanceof String) { qualifications((String)value); return; }
      if ("qualificationss".equals(key) && value instanceof String) { qualifications((String)value); return; }
      if ("responsibilities".equals(key) && value instanceof String) { responsibilities((String)value); return; }
      if ("responsibilitiess".equals(key) && value instanceof String) { responsibilities((String)value); return; }
      if ("skills".equals(key) && value instanceof String) { skills((String)value); return; }
      if ("skillss".equals(key) && value instanceof String) { skills((String)value); return; }
      super.fromMap(key, value);
    }
  }
  
}
