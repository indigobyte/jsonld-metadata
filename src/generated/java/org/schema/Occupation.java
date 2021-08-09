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
 * A profession, may involve prolonged training and/or a formal qualification.
 */
public class Occupation extends Intangible {
  /**
   * A statement of knowledge, skill, ability, task or any other assertion expressing a competency that is desired or required to fulfill this role or to work in this occupation.
   * @return skills property set by first invocation of skills method or {@code null}.
   */
  @JsonIgnore public DefinedTerm getSkillsDefinedTerm() {
    return (DefinedTerm) getValue("skills");
  }
  /**
   * A statement of knowledge, skill, ability, task or any other assertion expressing a competency that is desired or required to fulfill this role or to work in this occupation.
   * @return all skills properties as {@link java.util.Collection} or an empty collection 
   * if skills was not set.
   */
  @JsonIgnore public java.util.Collection<DefinedTerm> getSkillsDefinedTerms() {
    final java.lang.Object current = myData.get("skills");
    if (current == null) return Collections.emptyList();
    if (current instanceof java.util.Collection) {
      return (java.util.Collection<DefinedTerm>) current;
    }
    return Arrays.asList((DefinedTerm) current);
  }
  /**
   * A statement of knowledge, skill, ability, task or any other assertion expressing a competency that is desired or required to fulfill this role or to work in this occupation.
   * @return skills property set by first invocation of skills method or {@code null}.
   */
  @JsonIgnore public String getSkillsString() {
    return (String) getValue("skills");
  }
  /**
   * A statement of knowledge, skill, ability, task or any other assertion expressing a competency that is desired or required to fulfill this role or to work in this occupation.
   * @return all skills properties as {@link java.util.Collection} or an empty collection 
   * if skills was not set.
   */
  @JsonIgnore public java.util.Collection<String> getSkillsStrings() {
    final java.lang.Object current = myData.get("skills");
    if (current == null) return Collections.emptyList();
    if (current instanceof java.util.Collection) {
      return (java.util.Collection<String>) current;
    }
    return Arrays.asList((String) current);
  }
  /**
   * An estimated salary for a job posting or occupation, based on a variety of variables including, but not limited to industry, job title, and location. Estimated salaries  are often computed by outside organizations rather than the hiring organization, who may not have committed to the estimated value.
   * @return estimatedSalary property set by first invocation of estimatedSalary method or {@code null}.
   */
  @JsonIgnore public MonetaryAmount getEstimatedSalaryMonetaryAmount() {
    return (MonetaryAmount) getValue("estimatedSalary");
  }
  /**
   * An estimated salary for a job posting or occupation, based on a variety of variables including, but not limited to industry, job title, and location. Estimated salaries  are often computed by outside organizations rather than the hiring organization, who may not have committed to the estimated value.
   * @return all estimatedSalary properties as {@link java.util.Collection} or an empty collection 
   * if estimatedSalary was not set.
   */
  @JsonIgnore public java.util.Collection<MonetaryAmount> getEstimatedSalaryMonetaryAmounts() {
    final java.lang.Object current = myData.get("estimatedSalary");
    if (current == null) return Collections.emptyList();
    if (current instanceof java.util.Collection) {
      return (java.util.Collection<MonetaryAmount>) current;
    }
    return Arrays.asList((MonetaryAmount) current);
  }
  /**
   * An estimated salary for a job posting or occupation, based on a variety of variables including, but not limited to industry, job title, and location. Estimated salaries  are often computed by outside organizations rather than the hiring organization, who may not have committed to the estimated value.
   * @return estimatedSalary property set by first invocation of estimatedSalary method or {@code null}.
   */
  @JsonIgnore public MonetaryAmountDistribution getEstimatedSalaryMonetaryAmountDistribution() {
    return (MonetaryAmountDistribution) getValue("estimatedSalary");
  }
  /**
   * An estimated salary for a job posting or occupation, based on a variety of variables including, but not limited to industry, job title, and location. Estimated salaries  are often computed by outside organizations rather than the hiring organization, who may not have committed to the estimated value.
   * @return all estimatedSalary properties as {@link java.util.Collection} or an empty collection 
   * if estimatedSalary was not set.
   */
  @JsonIgnore public java.util.Collection<MonetaryAmountDistribution> getEstimatedSalaryMonetaryAmountDistributions() {
    final java.lang.Object current = myData.get("estimatedSalary");
    if (current == null) return Collections.emptyList();
    if (current instanceof java.util.Collection) {
      return (java.util.Collection<MonetaryAmountDistribution>) current;
    }
    return Arrays.asList((MonetaryAmountDistribution) current);
  }
  /**
   * An estimated salary for a job posting or occupation, based on a variety of variables including, but not limited to industry, job title, and location. Estimated salaries  are often computed by outside organizations rather than the hiring organization, who may not have committed to the estimated value.
   * @return estimatedSalary property set by first invocation of estimatedSalary method or {@code null}.
   */
  @JsonIgnore public Number getEstimatedSalaryNumber() {
    return (Number) getValue("estimatedSalary");
  }
  /**
   * An estimated salary for a job posting or occupation, based on a variety of variables including, but not limited to industry, job title, and location. Estimated salaries  are often computed by outside organizations rather than the hiring organization, who may not have committed to the estimated value.
   * @return all estimatedSalary properties as {@link java.util.Collection} or an empty collection 
   * if estimatedSalary was not set.
   */
  @JsonIgnore public java.util.Collection<Number> getEstimatedSalaryNumbers() {
    final java.lang.Object current = myData.get("estimatedSalary");
    if (current == null) return Collections.emptyList();
    if (current instanceof java.util.Collection) {
      return (java.util.Collection<Number>) current;
    }
    return Arrays.asList((Number) current);
  }
  /**
   *                                 A category describing the job, preferably using a term from a taxonomy such as [BLS O*NET-SOC](http://www.onetcenter.org/taxonomy.html), [ISCO-08](https://www.ilo.org/public/english/bureau/stat/isco/isco08/) or similar, with the property repeated for each applicable value. Ideally the taxonomy should be identified, and both the textual label and formal code for the category should be provided.\n
   * Note: for historical reasons, any textual label and formal code provided as a literal may be assumed to be from O*NET-SOC.
   *                                 @return occupationalCategory property set by first invocation of occupationalCategory method or {@code null}.
   */
  @JsonIgnore public CategoryCode getOccupationalCategoryCategoryCode() {
    return (CategoryCode) getValue("occupationalCategory");
  }
  /**
   *                                     A category describing the job, preferably using a term from a taxonomy such as [BLS O*NET-SOC](http://www.onetcenter.org/taxonomy.html), [ISCO-08](https://www.ilo.org/public/english/bureau/stat/isco/isco08/) or similar, with the property repeated for each applicable value. Ideally the taxonomy should be identified, and both the textual label and formal code for the category should be provided.\n
   * Note: for historical reasons, any textual label and formal code provided as a literal may be assumed to be from O*NET-SOC.
   *                                     @return all occupationalCategory properties as {@link java.util.Collection} or an empty collection 
   *                                     if occupationalCategory was not set.
   */
  @JsonIgnore public java.util.Collection<CategoryCode> getOccupationalCategoryCategoryCodes() {
    final java.lang.Object current = myData.get("occupationalCategory");
    if (current == null) return Collections.emptyList();
    if (current instanceof java.util.Collection) {
      return (java.util.Collection<CategoryCode>) current;
    }
    return Arrays.asList((CategoryCode) current);
  }
  /**
   *                                 A category describing the job, preferably using a term from a taxonomy such as [BLS O*NET-SOC](http://www.onetcenter.org/taxonomy.html), [ISCO-08](https://www.ilo.org/public/english/bureau/stat/isco/isco08/) or similar, with the property repeated for each applicable value. Ideally the taxonomy should be identified, and both the textual label and formal code for the category should be provided.\n
   * Note: for historical reasons, any textual label and formal code provided as a literal may be assumed to be from O*NET-SOC.
   *                                 @return occupationalCategory property set by first invocation of occupationalCategory method or {@code null}.
   */
  @JsonIgnore public String getOccupationalCategoryString() {
    return (String) getValue("occupationalCategory");
  }
  /**
   *                                     A category describing the job, preferably using a term from a taxonomy such as [BLS O*NET-SOC](http://www.onetcenter.org/taxonomy.html), [ISCO-08](https://www.ilo.org/public/english/bureau/stat/isco/isco08/) or similar, with the property repeated for each applicable value. Ideally the taxonomy should be identified, and both the textual label and formal code for the category should be provided.\n
   * Note: for historical reasons, any textual label and formal code provided as a literal may be assumed to be from O*NET-SOC.
   *                                     @return all occupationalCategory properties as {@link java.util.Collection} or an empty collection 
   *                                     if occupationalCategory was not set.
   */
  @JsonIgnore public java.util.Collection<String> getOccupationalCategoryStrings() {
    final java.lang.Object current = myData.get("occupationalCategory");
    if (current == null) return Collections.emptyList();
    if (current instanceof java.util.Collection) {
      return (java.util.Collection<String>) current;
    }
    return Arrays.asList((String) current);
  }
  /**
   * Description of skills and experience needed for the position or Occupation.
   * @return experienceRequirements property set by first invocation of experienceRequirements method or {@code null}.
   */
  @JsonIgnore public OccupationalExperienceRequirements getExperienceRequirementsOccupationalExperienceRequirements() {
    return (OccupationalExperienceRequirements) getValue("experienceRequirements");
  }
  /**
   * Description of skills and experience needed for the position or Occupation.
   * @return all experienceRequirements properties as {@link java.util.Collection} or an empty collection 
   * if experienceRequirements was not set.
   */
  @JsonIgnore public java.util.Collection<OccupationalExperienceRequirements> getExperienceRequirementsOccupationalExperienceRequirementss() {
    final java.lang.Object current = myData.get("experienceRequirements");
    if (current == null) return Collections.emptyList();
    if (current instanceof java.util.Collection) {
      return (java.util.Collection<OccupationalExperienceRequirements>) current;
    }
    return Arrays.asList((OccupationalExperienceRequirements) current);
  }
  /**
   * Description of skills and experience needed for the position or Occupation.
   * @return experienceRequirements property set by first invocation of experienceRequirements method or {@code null}.
   */
  @JsonIgnore public String getExperienceRequirementsString() {
    return (String) getValue("experienceRequirements");
  }
  /**
   * Description of skills and experience needed for the position or Occupation.
   * @return all experienceRequirements properties as {@link java.util.Collection} or an empty collection 
   * if experienceRequirements was not set.
   */
  @JsonIgnore public java.util.Collection<String> getExperienceRequirementsStrings() {
    final java.lang.Object current = myData.get("experienceRequirements");
    if (current == null) return Collections.emptyList();
    if (current instanceof java.util.Collection) {
      return (java.util.Collection<String>) current;
    }
    return Arrays.asList((String) current);
  }
  /**
   * Educational background needed for the position or Occupation.
   * @return educationRequirements property set by first invocation of educationRequirements method or {@code null}.
   */
  @JsonIgnore public EducationalOccupationalCredential getEducationRequirementsEducationalOccupationalCredential() {
    return (EducationalOccupationalCredential) getValue("educationRequirements");
  }
  /**
   * Educational background needed for the position or Occupation.
   * @return all educationRequirements properties as {@link java.util.Collection} or an empty collection 
   * if educationRequirements was not set.
   */
  @JsonIgnore public java.util.Collection<EducationalOccupationalCredential> getEducationRequirementsEducationalOccupationalCredentials() {
    final java.lang.Object current = myData.get("educationRequirements");
    if (current == null) return Collections.emptyList();
    if (current instanceof java.util.Collection) {
      return (java.util.Collection<EducationalOccupationalCredential>) current;
    }
    return Arrays.asList((EducationalOccupationalCredential) current);
  }
  /**
   * Educational background needed for the position or Occupation.
   * @return educationRequirements property set by first invocation of educationRequirements method or {@code null}.
   */
  @JsonIgnore public String getEducationRequirementsString() {
    return (String) getValue("educationRequirements");
  }
  /**
   * Educational background needed for the position or Occupation.
   * @return all educationRequirements properties as {@link java.util.Collection} or an empty collection 
   * if educationRequirements was not set.
   */
  @JsonIgnore public java.util.Collection<String> getEducationRequirementsStrings() {
    final java.lang.Object current = myData.get("educationRequirements");
    if (current == null) return Collections.emptyList();
    if (current instanceof java.util.Collection) {
      return (java.util.Collection<String>) current;
    }
    return Arrays.asList((String) current);
  }
  /**
   * Responsibilities associated with this role or Occupation.
   * @return responsibilities property set by first invocation of responsibilities method or {@code null}.
   */
  @JsonIgnore public String getResponsibilities() {
    return (String) getValue("responsibilities");
  }
  /**
   * Responsibilities associated with this role or Occupation.
   * @return all responsibilities properties as {@link java.util.Collection} or an empty collection 
   * if responsibilities was not set.
   */
  @JsonIgnore public java.util.Collection<String> getResponsibilitiess() {
    final java.lang.Object current = myData.get("responsibilities");
    if (current == null) return Collections.emptyList();
    if (current instanceof java.util.Collection) {
      return (java.util.Collection<String>) current;
    }
    return Arrays.asList((String) current);
  }
  /**
   * Specific qualifications required for this role or Occupation.
   * @return qualifications property set by first invocation of qualifications method or {@code null}.
   */
  @JsonIgnore public EducationalOccupationalCredential getQualificationsEducationalOccupationalCredential() {
    return (EducationalOccupationalCredential) getValue("qualifications");
  }
  /**
   * Specific qualifications required for this role or Occupation.
   * @return all qualifications properties as {@link java.util.Collection} or an empty collection 
   * if qualifications was not set.
   */
  @JsonIgnore public java.util.Collection<EducationalOccupationalCredential> getQualificationsEducationalOccupationalCredentials() {
    final java.lang.Object current = myData.get("qualifications");
    if (current == null) return Collections.emptyList();
    if (current instanceof java.util.Collection) {
      return (java.util.Collection<EducationalOccupationalCredential>) current;
    }
    return Arrays.asList((EducationalOccupationalCredential) current);
  }
  /**
   * Specific qualifications required for this role or Occupation.
   * @return qualifications property set by first invocation of qualifications method or {@code null}.
   */
  @JsonIgnore public String getQualificationsString() {
    return (String) getValue("qualifications");
  }
  /**
   * Specific qualifications required for this role or Occupation.
   * @return all qualifications properties as {@link java.util.Collection} or an empty collection 
   * if qualifications was not set.
   */
  @JsonIgnore public java.util.Collection<String> getQualificationsStrings() {
    final java.lang.Object current = myData.get("qualifications");
    if (current == null) return Collections.emptyList();
    if (current instanceof java.util.Collection) {
      return (java.util.Collection<String>) current;
    }
    return Arrays.asList((String) current);
  }
  /**
   *  The region/country for which this occupational description is appropriate. Note that educational requirements and qualifications can vary between jurisdictions.
   * @return occupationLocation property set by first invocation of occupationLocation method or {@code null}.
   */
  @JsonIgnore public AdministrativeArea getOccupationLocation() {
    return (AdministrativeArea) getValue("occupationLocation");
  }
  /**
   *  The region/country for which this occupational description is appropriate. Note that educational requirements and qualifications can vary between jurisdictions.
   * @return all occupationLocation properties as {@link java.util.Collection} or an empty collection 
   * if occupationLocation was not set.
   */
  @JsonIgnore public java.util.Collection<AdministrativeArea> getOccupationLocations() {
    final java.lang.Object current = myData.get("occupationLocation");
    if (current == null) return Collections.emptyList();
    if (current instanceof java.util.Collection) {
      return (java.util.Collection<AdministrativeArea>) current;
    }
    return Arrays.asList((AdministrativeArea) current);
  }
  protected Occupation(java.util.Map<String,java.lang.Object> data) {
    super(data);
  }
  
  /**
   * Builder for {@link Occupation}
   */
  public static class Builder extends Intangible.Builder {
    public Builder(@NotNull HashMap<String,java.lang.Object> data) {
      super(data);
    }
    @NotNull public Occupation build() {
      return new Occupation(myData);
    }
    /**
     * A statement of knowledge, skill, ability, task or any other assertion expressing a competency that is desired or required to fulfill this role or to work in this occupation.
     * @param definedTerm value to set
     * @return this builder instance
     */
    @NotNull public Builder skills(@NotNull DefinedTerm definedTerm) {
      putValue("skills", definedTerm);
      return this;
    }
    /**
     * A statement of knowledge, skill, ability, task or any other assertion expressing a competency that is desired or required to fulfill this role or to work in this occupation.
     * @param definedTerm value to set
     * @return this builder instance
     */
    @NotNull public Builder skills(@NotNull DefinedTerm.Builder definedTerm) {
      putValue("skills", definedTerm.build());
      return this;
    }
    /**
     * A statement of knowledge, skill, ability, task or any other assertion expressing a competency that is desired or required to fulfill this role or to work in this occupation.
     * @param skills value to set
     * @return this builder instance
     */
    @NotNull public Builder skills(@NotNull String skills) {
      putValue("skills", skills);
      return this;
    }
    /**
     * Remove skills property from the builder.
     * If this property is repeatable, all instances are removed.
     * @return this builder instance
     */
    @NotNull public Builder removeSkills() {
      removeValue("skills");
      return this;
    }
    /**
     * Get currently set value for skills property in this builder.
     * @return previously set value or {@code null}. If multiple values have been 
     * set to this property, then {@link java.util.Collection} instance will be 
     * returned.
     */
    @Nullable public java.lang.Object getSkills() {
      return myData.get("skills");
    }
    /**
     * An estimated salary for a job posting or occupation, based on a variety of variables including, but not limited to industry, job title, and location. Estimated salaries  are often computed by outside organizations rather than the hiring organization, who may not have committed to the estimated value.
     * @param monetaryAmount value to set
     * @return this builder instance
     */
    @NotNull public Builder estimatedSalary(@NotNull MonetaryAmount monetaryAmount) {
      putValue("estimatedSalary", monetaryAmount);
      return this;
    }
    /**
     * An estimated salary for a job posting or occupation, based on a variety of variables including, but not limited to industry, job title, and location. Estimated salaries  are often computed by outside organizations rather than the hiring organization, who may not have committed to the estimated value.
     * @param monetaryAmount value to set
     * @return this builder instance
     */
    @NotNull public Builder estimatedSalary(@NotNull MonetaryAmount.Builder monetaryAmount) {
      putValue("estimatedSalary", monetaryAmount.build());
      return this;
    }
    /**
     * An estimated salary for a job posting or occupation, based on a variety of variables including, but not limited to industry, job title, and location. Estimated salaries  are often computed by outside organizations rather than the hiring organization, who may not have committed to the estimated value.
     * @param monetaryAmountDistribution value to set
     * @return this builder instance
     */
    @NotNull public Builder estimatedSalary(@NotNull MonetaryAmountDistribution monetaryAmountDistribution) {
      putValue("estimatedSalary", monetaryAmountDistribution);
      return this;
    }
    /**
     * An estimated salary for a job posting or occupation, based on a variety of variables including, but not limited to industry, job title, and location. Estimated salaries  are often computed by outside organizations rather than the hiring organization, who may not have committed to the estimated value.
     * @param monetaryAmountDistribution value to set
     * @return this builder instance
     */
    @NotNull public Builder estimatedSalary(@NotNull MonetaryAmountDistribution.Builder monetaryAmountDistribution) {
      putValue("estimatedSalary", monetaryAmountDistribution.build());
      return this;
    }
    /**
     * An estimated salary for a job posting or occupation, based on a variety of variables including, but not limited to industry, job title, and location. Estimated salaries  are often computed by outside organizations rather than the hiring organization, who may not have committed to the estimated value.
     * @param number value to set
     * @return this builder instance
     */
    @NotNull public Builder estimatedSalary(@NotNull Number number) {
      putValue("estimatedSalary", number);
      return this;
    }
    /**
     * Remove estimatedSalary property from the builder.
     * If this property is repeatable, all instances are removed.
     * @return this builder instance
     */
    @NotNull public Builder removeEstimatedSalary() {
      removeValue("estimatedSalary");
      return this;
    }
    /**
     * Get currently set value for estimatedSalary property in this builder.
     * @return previously set value or {@code null}. If multiple values have been 
     * set to this property, then {@link java.util.Collection} instance will be 
     * returned.
     */
    @Nullable public java.lang.Object getEstimatedSalary() {
      return myData.get("estimatedSalary");
    }
    /**
     *                                         A category describing the job, preferably using a term from a taxonomy such as [BLS O*NET-SOC](http://www.onetcenter.org/taxonomy.html), [ISCO-08](https://www.ilo.org/public/english/bureau/stat/isco/isco08/) or similar, with the property repeated for each applicable value. Ideally the taxonomy should be identified, and both the textual label and formal code for the category should be provided.\n
     * Note: for historical reasons, any textual label and formal code provided as a literal may be assumed to be from O*NET-SOC.
     *                                         @param categoryCode value to set
     *                                         @return this builder instance
     */
    @NotNull public Builder occupationalCategory(@NotNull CategoryCode categoryCode) {
      putValue("occupationalCategory", categoryCode);
      return this;
    }
    /**
     *                                             A category describing the job, preferably using a term from a taxonomy such as [BLS O*NET-SOC](http://www.onetcenter.org/taxonomy.html), [ISCO-08](https://www.ilo.org/public/english/bureau/stat/isco/isco08/) or similar, with the property repeated for each applicable value. Ideally the taxonomy should be identified, and both the textual label and formal code for the category should be provided.\n
     * Note: for historical reasons, any textual label and formal code provided as a literal may be assumed to be from O*NET-SOC.
     *                                             @param categoryCode value to set
     *                                             @return this builder instance
     */
    @NotNull public Builder occupationalCategory(@NotNull CategoryCode.Builder categoryCode) {
      putValue("occupationalCategory", categoryCode.build());
      return this;
    }
    /**
     *                                         A category describing the job, preferably using a term from a taxonomy such as [BLS O*NET-SOC](http://www.onetcenter.org/taxonomy.html), [ISCO-08](https://www.ilo.org/public/english/bureau/stat/isco/isco08/) or similar, with the property repeated for each applicable value. Ideally the taxonomy should be identified, and both the textual label and formal code for the category should be provided.\n
     * Note: for historical reasons, any textual label and formal code provided as a literal may be assumed to be from O*NET-SOC.
     *                                         @param occupationalCategory value to set
     *                                         @return this builder instance
     */
    @NotNull public Builder occupationalCategory(@NotNull String occupationalCategory) {
      putValue("occupationalCategory", occupationalCategory);
      return this;
    }
    /**
     * Remove occupationalCategory property from the builder.
     * If this property is repeatable, all instances are removed.
     * @return this builder instance
     */
    @NotNull public Builder removeOccupationalCategory() {
      removeValue("occupationalCategory");
      return this;
    }
    /**
     * Get currently set value for occupationalCategory property in this builder.
     * @return previously set value or {@code null}. If multiple values have been 
     * set to this property, then {@link java.util.Collection} instance will be 
     * returned.
     */
    @Nullable public java.lang.Object getOccupationalCategory() {
      return myData.get("occupationalCategory");
    }
    /**
     * Description of skills and experience needed for the position or Occupation.
     * @param occupationalExperienceRequirements value to set
     * @return this builder instance
     */
    @NotNull public Builder experienceRequirements(@NotNull OccupationalExperienceRequirements occupationalExperienceRequirements) {
      putValue("experienceRequirements", occupationalExperienceRequirements);
      return this;
    }
    /**
     * Description of skills and experience needed for the position or Occupation.
     * @param occupationalExperienceRequirements value to set
     * @return this builder instance
     */
    @NotNull public Builder experienceRequirements(@NotNull OccupationalExperienceRequirements.Builder occupationalExperienceRequirements) {
      putValue("experienceRequirements", occupationalExperienceRequirements.build());
      return this;
    }
    /**
     * Description of skills and experience needed for the position or Occupation.
     * @param experienceRequirements value to set
     * @return this builder instance
     */
    @NotNull public Builder experienceRequirements(@NotNull String experienceRequirements) {
      putValue("experienceRequirements", experienceRequirements);
      return this;
    }
    /**
     * Remove experienceRequirements property from the builder.
     * If this property is repeatable, all instances are removed.
     * @return this builder instance
     */
    @NotNull public Builder removeExperienceRequirements() {
      removeValue("experienceRequirements");
      return this;
    }
    /**
     * Get currently set value for experienceRequirements property in this builder.
     * @return previously set value or {@code null}. If multiple values have been 
     * set to this property, then {@link java.util.Collection} instance will be 
     * returned.
     */
    @Nullable public java.lang.Object getExperienceRequirements() {
      return myData.get("experienceRequirements");
    }
    /**
     * Educational background needed for the position or Occupation.
     * @param educationalOccupationalCredential value to set
     * @return this builder instance
     */
    @NotNull public Builder educationRequirements(@NotNull EducationalOccupationalCredential educationalOccupationalCredential) {
      putValue("educationRequirements", educationalOccupationalCredential);
      return this;
    }
    /**
     * Educational background needed for the position or Occupation.
     * @param educationalOccupationalCredential value to set
     * @return this builder instance
     */
    @NotNull public Builder educationRequirements(@NotNull EducationalOccupationalCredential.Builder educationalOccupationalCredential) {
      putValue("educationRequirements", educationalOccupationalCredential.build());
      return this;
    }
    /**
     * Educational background needed for the position or Occupation.
     * @param educationRequirements value to set
     * @return this builder instance
     */
    @NotNull public Builder educationRequirements(@NotNull String educationRequirements) {
      putValue("educationRequirements", educationRequirements);
      return this;
    }
    /**
     * Remove educationRequirements property from the builder.
     * If this property is repeatable, all instances are removed.
     * @return this builder instance
     */
    @NotNull public Builder removeEducationRequirements() {
      removeValue("educationRequirements");
      return this;
    }
    /**
     * Get currently set value for educationRequirements property in this builder.
     * @return previously set value or {@code null}. If multiple values have been 
     * set to this property, then {@link java.util.Collection} instance will be 
     * returned.
     */
    @Nullable public java.lang.Object getEducationRequirements() {
      return myData.get("educationRequirements");
    }
    /**
     * Responsibilities associated with this role or Occupation.
     * @param responsibilities value to set
     * @return this builder instance
     */
    @NotNull public Builder responsibilities(@NotNull String responsibilities) {
      putValue("responsibilities", responsibilities);
      return this;
    }
    /**
     * Remove responsibilities property from the builder.
     * If this property is repeatable, all instances are removed.
     * @return this builder instance
     */
    @NotNull public Builder removeResponsibilities() {
      removeValue("responsibilities");
      return this;
    }
    /**
     * Get currently set value for responsibilities property in this builder.
     * @return previously set value or {@code null}. If multiple values have been 
     * set to this property, then {@link java.util.Collection} instance will be 
     * returned.
     */
    @Nullable public java.lang.Object getResponsibilities() {
      return myData.get("responsibilities");
    }
    /**
     * Specific qualifications required for this role or Occupation.
     * @param educationalOccupationalCredential value to set
     * @return this builder instance
     */
    @NotNull public Builder qualifications(@NotNull EducationalOccupationalCredential educationalOccupationalCredential) {
      putValue("qualifications", educationalOccupationalCredential);
      return this;
    }
    /**
     * Specific qualifications required for this role or Occupation.
     * @param educationalOccupationalCredential value to set
     * @return this builder instance
     */
    @NotNull public Builder qualifications(@NotNull EducationalOccupationalCredential.Builder educationalOccupationalCredential) {
      putValue("qualifications", educationalOccupationalCredential.build());
      return this;
    }
    /**
     * Specific qualifications required for this role or Occupation.
     * @param qualifications value to set
     * @return this builder instance
     */
    @NotNull public Builder qualifications(@NotNull String qualifications) {
      putValue("qualifications", qualifications);
      return this;
    }
    /**
     * Remove qualifications property from the builder.
     * If this property is repeatable, all instances are removed.
     * @return this builder instance
     */
    @NotNull public Builder removeQualifications() {
      removeValue("qualifications");
      return this;
    }
    /**
     * Get currently set value for qualifications property in this builder.
     * @return previously set value or {@code null}. If multiple values have been 
     * set to this property, then {@link java.util.Collection} instance will be 
     * returned.
     */
    @Nullable public java.lang.Object getQualifications() {
      return myData.get("qualifications");
    }
    /**
     *  The region/country for which this occupational description is appropriate. Note that educational requirements and qualifications can vary between jurisdictions.
     * @param administrativeArea value to set
     * @return this builder instance
     */
    @NotNull public Builder occupationLocation(@NotNull AdministrativeArea administrativeArea) {
      putValue("occupationLocation", administrativeArea);
      return this;
    }
    /**
     *  The region/country for which this occupational description is appropriate. Note that educational requirements and qualifications can vary between jurisdictions.
     * @param administrativeArea value to set
     * @return this builder instance
     */
    @NotNull public Builder occupationLocation(@NotNull AdministrativeArea.Builder administrativeArea) {
      putValue("occupationLocation", administrativeArea.build());
      return this;
    }
    /**
     * Remove occupationLocation property from the builder.
     * If this property is repeatable, all instances are removed.
     * @return this builder instance
     */
    @NotNull public Builder removeOccupationLocation() {
      removeValue("occupationLocation");
      return this;
    }
    /**
     * Get currently set value for occupationLocation property in this builder.
     * @return previously set value or {@code null}. If multiple values have been 
     * set to this property, then {@link java.util.Collection} instance will be 
     * returned.
     */
    @Nullable public java.lang.Object getOccupationLocation() {
      return myData.get("occupationLocation");
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
