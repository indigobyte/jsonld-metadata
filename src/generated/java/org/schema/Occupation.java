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
 * A profession, may involve prolonged training and/or a formal qualification.
 */
public class Occupation extends Intangible {
  /**
   * A statement of knowledge, skill, ability, task or any other assertion expressing a competency that is desired or required to fulfill this role or to work in this occupation.
   */
  @JsonIgnore public DefinedTerm getSkillsDefinedTerm() {
    return (DefinedTerm) getValue("skills");
  }
  /**
   * A statement of knowledge, skill, ability, task or any other assertion expressing a competency that is desired or required to fulfill this role or to work in this occupation.
   */
  @JsonIgnore public Collection<DefinedTerm> getSkillsDefinedTerms() {
    final Object current = myData.get("skills");
    if (current == null) return Collections.emptyList();
    if (current instanceof Collection) {
      return (Collection<DefinedTerm>) current;
    }
    return Arrays.asList((DefinedTerm) current);
  }
  /**
   * A statement of knowledge, skill, ability, task or any other assertion expressing a competency that is desired or required to fulfill this role or to work in this occupation.
   */
  @JsonIgnore public String getSkillsString() {
    return (String) getValue("skills");
  }
  /**
   * A statement of knowledge, skill, ability, task or any other assertion expressing a competency that is desired or required to fulfill this role or to work in this occupation.
   */
  @JsonIgnore public Collection<String> getSkillsStrings() {
    final Object current = myData.get("skills");
    if (current == null) return Collections.emptyList();
    if (current instanceof Collection) {
      return (Collection<String>) current;
    }
    return Arrays.asList((String) current);
  }
  /**
   * An estimated salary for a job posting or occupation, based on a variety of variables including, but not limited to industry, job title, and location. Estimated salaries  are often computed by outside organizations rather than the hiring organization, who may not have committed to the estimated value.
   */
  @JsonIgnore public MonetaryAmount getEstimatedSalaryMonetaryAmount() {
    return (MonetaryAmount) getValue("estimatedSalary");
  }
  /**
   * An estimated salary for a job posting or occupation, based on a variety of variables including, but not limited to industry, job title, and location. Estimated salaries  are often computed by outside organizations rather than the hiring organization, who may not have committed to the estimated value.
   */
  @JsonIgnore public Collection<MonetaryAmount> getEstimatedSalaryMonetaryAmounts() {
    final Object current = myData.get("estimatedSalary");
    if (current == null) return Collections.emptyList();
    if (current instanceof Collection) {
      return (Collection<MonetaryAmount>) current;
    }
    return Arrays.asList((MonetaryAmount) current);
  }
  /**
   * An estimated salary for a job posting or occupation, based on a variety of variables including, but not limited to industry, job title, and location. Estimated salaries  are often computed by outside organizations rather than the hiring organization, who may not have committed to the estimated value.
   */
  @JsonIgnore public MonetaryAmountDistribution getEstimatedSalaryMonetaryAmountDistribution() {
    return (MonetaryAmountDistribution) getValue("estimatedSalary");
  }
  /**
   * An estimated salary for a job posting or occupation, based on a variety of variables including, but not limited to industry, job title, and location. Estimated salaries  are often computed by outside organizations rather than the hiring organization, who may not have committed to the estimated value.
   */
  @JsonIgnore public Collection<MonetaryAmountDistribution> getEstimatedSalaryMonetaryAmountDistributions() {
    final Object current = myData.get("estimatedSalary");
    if (current == null) return Collections.emptyList();
    if (current instanceof Collection) {
      return (Collection<MonetaryAmountDistribution>) current;
    }
    return Arrays.asList((MonetaryAmountDistribution) current);
  }
  /**
   * An estimated salary for a job posting or occupation, based on a variety of variables including, but not limited to industry, job title, and location. Estimated salaries  are often computed by outside organizations rather than the hiring organization, who may not have committed to the estimated value.
   */
  @JsonIgnore public Number getEstimatedSalaryNumber() {
    return (Number) getValue("estimatedSalary");
  }
  /**
   * An estimated salary for a job posting or occupation, based on a variety of variables including, but not limited to industry, job title, and location. Estimated salaries  are often computed by outside organizations rather than the hiring organization, who may not have committed to the estimated value.
   */
  @JsonIgnore public Collection<Number> getEstimatedSalaryNumbers() {
    final Object current = myData.get("estimatedSalary");
    if (current == null) return Collections.emptyList();
    if (current instanceof Collection) {
      return (Collection<Number>) current;
    }
    return Arrays.asList((Number) current);
  }
  /**
   * A category describing the job, preferably using a term from a taxonomy such as [BLS O*NET-SOC](http://www.onetcenter.org/taxonomy.html), [ISCO-08](https://www.ilo.org/public/english/bureau/stat/isco/isco08/) or similar, with the property repeated for each applicable value. Ideally the taxonomy should be identified, and both the textual label and formal code for the category should be provided.\n
   * Note: for historical reasons, any textual label and formal code provided as a literal may be assumed to be from O*NET-SOC.
   */
  @JsonIgnore public CategoryCode getOccupationalCategoryCategoryCode() {
    return (CategoryCode) getValue("occupationalCategory");
  }
  /**
   * A category describing the job, preferably using a term from a taxonomy such as [BLS O*NET-SOC](http://www.onetcenter.org/taxonomy.html), [ISCO-08](https://www.ilo.org/public/english/bureau/stat/isco/isco08/) or similar, with the property repeated for each applicable value. Ideally the taxonomy should be identified, and both the textual label and formal code for the category should be provided.\n
   * Note: for historical reasons, any textual label and formal code provided as a literal may be assumed to be from O*NET-SOC.
   */
  @JsonIgnore public Collection<CategoryCode> getOccupationalCategoryCategoryCodes() {
    final Object current = myData.get("occupationalCategory");
    if (current == null) return Collections.emptyList();
    if (current instanceof Collection) {
      return (Collection<CategoryCode>) current;
    }
    return Arrays.asList((CategoryCode) current);
  }
  /**
   * A category describing the job, preferably using a term from a taxonomy such as [BLS O*NET-SOC](http://www.onetcenter.org/taxonomy.html), [ISCO-08](https://www.ilo.org/public/english/bureau/stat/isco/isco08/) or similar, with the property repeated for each applicable value. Ideally the taxonomy should be identified, and both the textual label and formal code for the category should be provided.\n
   * Note: for historical reasons, any textual label and formal code provided as a literal may be assumed to be from O*NET-SOC.
   */
  @JsonIgnore public String getOccupationalCategoryString() {
    return (String) getValue("occupationalCategory");
  }
  /**
   * A category describing the job, preferably using a term from a taxonomy such as [BLS O*NET-SOC](http://www.onetcenter.org/taxonomy.html), [ISCO-08](https://www.ilo.org/public/english/bureau/stat/isco/isco08/) or similar, with the property repeated for each applicable value. Ideally the taxonomy should be identified, and both the textual label and formal code for the category should be provided.\n
   * Note: for historical reasons, any textual label and formal code provided as a literal may be assumed to be from O*NET-SOC.
   */
  @JsonIgnore public Collection<String> getOccupationalCategoryStrings() {
    final Object current = myData.get("occupationalCategory");
    if (current == null) return Collections.emptyList();
    if (current instanceof Collection) {
      return (Collection<String>) current;
    }
    return Arrays.asList((String) current);
  }
  /**
   * Description of skills and experience needed for the position or Occupation.
   */
  @JsonIgnore public OccupationalExperienceRequirements getExperienceRequirementsOccupationalExperienceRequirements() {
    return (OccupationalExperienceRequirements) getValue("experienceRequirements");
  }
  /**
   * Description of skills and experience needed for the position or Occupation.
   */
  @JsonIgnore public Collection<OccupationalExperienceRequirements> getExperienceRequirementsOccupationalExperienceRequirementss() {
    final Object current = myData.get("experienceRequirements");
    if (current == null) return Collections.emptyList();
    if (current instanceof Collection) {
      return (Collection<OccupationalExperienceRequirements>) current;
    }
    return Arrays.asList((OccupationalExperienceRequirements) current);
  }
  /**
   * Description of skills and experience needed for the position or Occupation.
   */
  @JsonIgnore public String getExperienceRequirementsString() {
    return (String) getValue("experienceRequirements");
  }
  /**
   * Description of skills and experience needed for the position or Occupation.
   */
  @JsonIgnore public Collection<String> getExperienceRequirementsStrings() {
    final Object current = myData.get("experienceRequirements");
    if (current == null) return Collections.emptyList();
    if (current instanceof Collection) {
      return (Collection<String>) current;
    }
    return Arrays.asList((String) current);
  }
  /**
   * Educational background needed for the position or Occupation.
   */
  @JsonIgnore public EducationalOccupationalCredential getEducationRequirementsEducationalOccupationalCredential() {
    return (EducationalOccupationalCredential) getValue("educationRequirements");
  }
  /**
   * Educational background needed for the position or Occupation.
   */
  @JsonIgnore public Collection<EducationalOccupationalCredential> getEducationRequirementsEducationalOccupationalCredentials() {
    final Object current = myData.get("educationRequirements");
    if (current == null) return Collections.emptyList();
    if (current instanceof Collection) {
      return (Collection<EducationalOccupationalCredential>) current;
    }
    return Arrays.asList((EducationalOccupationalCredential) current);
  }
  /**
   * Educational background needed for the position or Occupation.
   */
  @JsonIgnore public String getEducationRequirementsString() {
    return (String) getValue("educationRequirements");
  }
  /**
   * Educational background needed for the position or Occupation.
   */
  @JsonIgnore public Collection<String> getEducationRequirementsStrings() {
    final Object current = myData.get("educationRequirements");
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
   * Specific qualifications required for this role or Occupation.
   */
  @JsonIgnore public EducationalOccupationalCredential getQualificationsEducationalOccupationalCredential() {
    return (EducationalOccupationalCredential) getValue("qualifications");
  }
  /**
   * Specific qualifications required for this role or Occupation.
   */
  @JsonIgnore public Collection<EducationalOccupationalCredential> getQualificationsEducationalOccupationalCredentials() {
    final Object current = myData.get("qualifications");
    if (current == null) return Collections.emptyList();
    if (current instanceof Collection) {
      return (Collection<EducationalOccupationalCredential>) current;
    }
    return Arrays.asList((EducationalOccupationalCredential) current);
  }
  /**
   * Specific qualifications required for this role or Occupation.
   */
  @JsonIgnore public String getQualificationsString() {
    return (String) getValue("qualifications");
  }
  /**
   * Specific qualifications required for this role or Occupation.
   */
  @JsonIgnore public Collection<String> getQualificationsStrings() {
    final Object current = myData.get("qualifications");
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
     * A statement of knowledge, skill, ability, task or any other assertion expressing a competency that is desired or required to fulfill this role or to work in this occupation.
     */
    @NotNull public Builder skills(@NotNull DefinedTerm definedTerm) {
      putValue("skills", definedTerm);
      return this;
    }
    /**
     * A statement of knowledge, skill, ability, task or any other assertion expressing a competency that is desired or required to fulfill this role or to work in this occupation.
     */
    @NotNull public Builder skills(@NotNull DefinedTerm.Builder definedTerm) {
      putValue("skills", definedTerm.build());
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
     * An estimated salary for a job posting or occupation, based on a variety of variables including, but not limited to industry, job title, and location. Estimated salaries  are often computed by outside organizations rather than the hiring organization, who may not have committed to the estimated value.
     */
    @NotNull public Builder estimatedSalary(@NotNull MonetaryAmount monetaryAmount) {
      putValue("estimatedSalary", monetaryAmount);
      return this;
    }
    /**
     * An estimated salary for a job posting or occupation, based on a variety of variables including, but not limited to industry, job title, and location. Estimated salaries  are often computed by outside organizations rather than the hiring organization, who may not have committed to the estimated value.
     */
    @NotNull public Builder estimatedSalary(@NotNull MonetaryAmount.Builder monetaryAmount) {
      putValue("estimatedSalary", monetaryAmount.build());
      return this;
    }
    /**
     * An estimated salary for a job posting or occupation, based on a variety of variables including, but not limited to industry, job title, and location. Estimated salaries  are often computed by outside organizations rather than the hiring organization, who may not have committed to the estimated value.
     */
    @NotNull public Builder estimatedSalary(@NotNull MonetaryAmountDistribution monetaryAmountDistribution) {
      putValue("estimatedSalary", monetaryAmountDistribution);
      return this;
    }
    /**
     * An estimated salary for a job posting or occupation, based on a variety of variables including, but not limited to industry, job title, and location. Estimated salaries  are often computed by outside organizations rather than the hiring organization, who may not have committed to the estimated value.
     */
    @NotNull public Builder estimatedSalary(@NotNull MonetaryAmountDistribution.Builder monetaryAmountDistribution) {
      putValue("estimatedSalary", monetaryAmountDistribution.build());
      return this;
    }
    /**
     * An estimated salary for a job posting or occupation, based on a variety of variables including, but not limited to industry, job title, and location. Estimated salaries  are often computed by outside organizations rather than the hiring organization, who may not have committed to the estimated value.
     */
    @NotNull public Builder estimatedSalary(@NotNull Number number) {
      putValue("estimatedSalary", number);
      return this;
    }
    /**
     * A category describing the job, preferably using a term from a taxonomy such as [BLS O*NET-SOC](http://www.onetcenter.org/taxonomy.html), [ISCO-08](https://www.ilo.org/public/english/bureau/stat/isco/isco08/) or similar, with the property repeated for each applicable value. Ideally the taxonomy should be identified, and both the textual label and formal code for the category should be provided.\n
     * Note: for historical reasons, any textual label and formal code provided as a literal may be assumed to be from O*NET-SOC.
     */
    @NotNull public Builder occupationalCategory(@NotNull CategoryCode categoryCode) {
      putValue("occupationalCategory", categoryCode);
      return this;
    }
    /**
     * A category describing the job, preferably using a term from a taxonomy such as [BLS O*NET-SOC](http://www.onetcenter.org/taxonomy.html), [ISCO-08](https://www.ilo.org/public/english/bureau/stat/isco/isco08/) or similar, with the property repeated for each applicable value. Ideally the taxonomy should be identified, and both the textual label and formal code for the category should be provided.\n
     * Note: for historical reasons, any textual label and formal code provided as a literal may be assumed to be from O*NET-SOC.
     */
    @NotNull public Builder occupationalCategory(@NotNull CategoryCode.Builder categoryCode) {
      putValue("occupationalCategory", categoryCode.build());
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
     * Description of skills and experience needed for the position or Occupation.
     */
    @NotNull public Builder experienceRequirements(@NotNull OccupationalExperienceRequirements occupationalExperienceRequirements) {
      putValue("experienceRequirements", occupationalExperienceRequirements);
      return this;
    }
    /**
     * Description of skills and experience needed for the position or Occupation.
     */
    @NotNull public Builder experienceRequirements(@NotNull OccupationalExperienceRequirements.Builder occupationalExperienceRequirements) {
      putValue("experienceRequirements", occupationalExperienceRequirements.build());
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
     * Educational background needed for the position or Occupation.
     */
    @NotNull public Builder educationRequirements(@NotNull EducationalOccupationalCredential educationalOccupationalCredential) {
      putValue("educationRequirements", educationalOccupationalCredential);
      return this;
    }
    /**
     * Educational background needed for the position or Occupation.
     */
    @NotNull public Builder educationRequirements(@NotNull EducationalOccupationalCredential.Builder educationalOccupationalCredential) {
      putValue("educationRequirements", educationalOccupationalCredential.build());
      return this;
    }
    /**
     * Educational background needed for the position or Occupation.
     */
    @NotNull public Builder educationRequirements(@NotNull String educationRequirements) {
      putValue("educationRequirements", educationRequirements);
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
     * Specific qualifications required for this role or Occupation.
     */
    @NotNull public Builder qualifications(@NotNull EducationalOccupationalCredential educationalOccupationalCredential) {
      putValue("qualifications", educationalOccupationalCredential);
      return this;
    }
    /**
     * Specific qualifications required for this role or Occupation.
     */
    @NotNull public Builder qualifications(@NotNull EducationalOccupationalCredential.Builder educationalOccupationalCredential) {
      putValue("qualifications", educationalOccupationalCredential.build());
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
      if ("skills".equals(key) && value instanceof DefinedTerm) { this.skills((DefinedTerm)value); return; }
      if ("skillss".equals(key) && value instanceof DefinedTerm) { this.skills((DefinedTerm)value); return; }
      if ("skills".equals(key) && value instanceof String) { this.skills((String)value); return; }
      if ("skillss".equals(key) && value instanceof String) { this.skills((String)value); return; }
      if ("estimatedSalary".equals(key) && value instanceof MonetaryAmount) { this.estimatedSalary((MonetaryAmount)value); return; }
      if ("estimatedSalarys".equals(key) && value instanceof MonetaryAmount) { this.estimatedSalary((MonetaryAmount)value); return; }
      if ("estimatedSalary".equals(key) && value instanceof MonetaryAmountDistribution) { this.estimatedSalary((MonetaryAmountDistribution)value); return; }
      if ("estimatedSalarys".equals(key) && value instanceof MonetaryAmountDistribution) { this.estimatedSalary((MonetaryAmountDistribution)value); return; }
      if ("estimatedSalary".equals(key) && value instanceof Number) { this.estimatedSalary((Number)value); return; }
      if ("estimatedSalarys".equals(key) && value instanceof Number) { this.estimatedSalary((Number)value); return; }
      if ("occupationalCategory".equals(key) && value instanceof CategoryCode) { this.occupationalCategory((CategoryCode)value); return; }
      if ("occupationalCategorys".equals(key) && value instanceof CategoryCode) { this.occupationalCategory((CategoryCode)value); return; }
      if ("occupationalCategory".equals(key) && value instanceof String) { this.occupationalCategory((String)value); return; }
      if ("occupationalCategorys".equals(key) && value instanceof String) { this.occupationalCategory((String)value); return; }
      if ("experienceRequirements".equals(key) && value instanceof OccupationalExperienceRequirements) { this.experienceRequirements((OccupationalExperienceRequirements)value); return; }
      if ("experienceRequirementss".equals(key) && value instanceof OccupationalExperienceRequirements) { this.experienceRequirements((OccupationalExperienceRequirements)value); return; }
      if ("experienceRequirements".equals(key) && value instanceof String) { this.experienceRequirements((String)value); return; }
      if ("experienceRequirementss".equals(key) && value instanceof String) { this.experienceRequirements((String)value); return; }
      if ("educationRequirements".equals(key) && value instanceof EducationalOccupationalCredential) { this.educationRequirements((EducationalOccupationalCredential)value); return; }
      if ("educationRequirementss".equals(key) && value instanceof EducationalOccupationalCredential) { this.educationRequirements((EducationalOccupationalCredential)value); return; }
      if ("educationRequirements".equals(key) && value instanceof String) { this.educationRequirements((String)value); return; }
      if ("educationRequirementss".equals(key) && value instanceof String) { this.educationRequirements((String)value); return; }
      if ("responsibilities".equals(key) && value instanceof String) { this.responsibilities((String)value); return; }
      if ("responsibilitiess".equals(key) && value instanceof String) { this.responsibilities((String)value); return; }
      if ("qualifications".equals(key) && value instanceof EducationalOccupationalCredential) { this.qualifications((EducationalOccupationalCredential)value); return; }
      if ("qualificationss".equals(key) && value instanceof EducationalOccupationalCredential) { this.qualifications((EducationalOccupationalCredential)value); return; }
      if ("qualifications".equals(key) && value instanceof String) { this.qualifications((String)value); return; }
      if ("qualificationss".equals(key) && value instanceof String) { this.qualifications((String)value); return; }
      if ("occupationLocation".equals(key) && value instanceof AdministrativeArea) { this.occupationLocation((AdministrativeArea)value); return; }
      if ("occupationLocations".equals(key) && value instanceof AdministrativeArea) { this.occupationLocation((AdministrativeArea)value); return; }
      super.fromMap(key, value);
    }
  }
  
}
