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
 * A listing that describes a job opening in a certain organization.
 */
public class JobPosting extends Intangible {
  /**
   * The base salary of the job or of an employee in an EmployeeRole.
   */
  @JsonIgnore public Integer getBaseSalaryInteger() {
    return (Integer) getValue("baseSalary");
  }
  /**
   * The base salary of the job or of an employee in an EmployeeRole.
   */
  @JsonIgnore public Collection<Integer> getBaseSalaryIntegers() {
    final Object current = myData.get("baseSalary");
    if (current == null) return Collections.emptyList();
    if (current instanceof Collection) {
      return (Collection<Integer>) current;
    }
    return Arrays.asList((Integer) current);
  }
  /**
   * The base salary of the job or of an employee in an EmployeeRole.
   */
  @JsonIgnore public Long getBaseSalaryLong() {
    return (Long) getValue("baseSalary");
  }
  /**
   * The base salary of the job or of an employee in an EmployeeRole.
   */
  @JsonIgnore public Collection<Long> getBaseSalaryLongs() {
    final Object current = myData.get("baseSalary");
    if (current == null) return Collections.emptyList();
    if (current instanceof Collection) {
      return (Collection<Long>) current;
    }
    return Arrays.asList((Long) current);
  }
  /**
   * The base salary of the job or of an employee in an EmployeeRole.
   */
  @JsonIgnore public Float getBaseSalaryFloat() {
    return (Float) getValue("baseSalary");
  }
  /**
   * The base salary of the job or of an employee in an EmployeeRole.
   */
  @JsonIgnore public Collection<Float> getBaseSalaryFloats() {
    final Object current = myData.get("baseSalary");
    if (current == null) return Collections.emptyList();
    if (current instanceof Collection) {
      return (Collection<Float>) current;
    }
    return Arrays.asList((Float) current);
  }
  /**
   * The base salary of the job or of an employee in an EmployeeRole.
   */
  @JsonIgnore public Double getBaseSalaryDouble() {
    return (Double) getValue("baseSalary");
  }
  /**
   * The base salary of the job or of an employee in an EmployeeRole.
   */
  @JsonIgnore public Collection<Double> getBaseSalaryDoubles() {
    final Object current = myData.get("baseSalary");
    if (current == null) return Collections.emptyList();
    if (current instanceof Collection) {
      return (Collection<Double>) current;
    }
    return Arrays.asList((Double) current);
  }
  /**
   * The base salary of the job or of an employee in an EmployeeRole.
   */
  @JsonIgnore public String getBaseSalaryString() {
    return (String) getValue("baseSalary");
  }
  /**
   * The base salary of the job or of an employee in an EmployeeRole.
   */
  @JsonIgnore public Collection<String> getBaseSalaryStrings() {
    final Object current = myData.get("baseSalary");
    if (current == null) return Collections.emptyList();
    if (current instanceof Collection) {
      return (Collection<String>) current;
    }
    return Arrays.asList((String) current);
  }
  /**
   * Description of benefits associated with the job.
   */
  @JsonIgnore public String getJobBenefits() {
    return (String) getValue("jobBenefits");
  }
  /**
   * Description of benefits associated with the job.
   */
  @JsonIgnore public Collection<String> getJobBenefitss() {
    final Object current = myData.get("jobBenefits");
    if (current == null) return Collections.emptyList();
    if (current instanceof Collection) {
      return (Collection<String>) current;
    }
    return Arrays.asList((String) current);
  }
  /**
   * Publication date of an online listing.
   */
  @JsonIgnore public java.util.Date getDatePosted() {
    return (java.util.Date) getValue("datePosted");
  }
  /**
   * Publication date of an online listing.
   */
  @JsonIgnore public Collection<java.util.Date> getDatePosteds() {
    final Object current = myData.get("datePosted");
    if (current == null) return Collections.emptyList();
    if (current instanceof Collection) {
      return (Collection<java.util.Date>) current;
    }
    return Arrays.asList((java.util.Date) current);
  }
  /**
   * Type of employment (e.g. full-time, part-time, contract, temporary, seasonal, internship).
   */
  @JsonIgnore public String getEmploymentType() {
    return (String) getValue("employmentType");
  }
  /**
   * Type of employment (e.g. full-time, part-time, contract, temporary, seasonal, internship).
   */
  @JsonIgnore public Collection<String> getEmploymentTypes() {
    final Object current = myData.get("employmentType");
    if (current == null) return Collections.emptyList();
    if (current instanceof Collection) {
      return (Collection<String>) current;
    }
    return Arrays.asList((String) current);
  }
  /**
   * Organization offering the job position.
   */
  @JsonIgnore public Organization getHiringOrganization() {
    return (Organization) getValue("hiringOrganization");
  }
  /**
   * Organization offering the job position.
   */
  @JsonIgnore public Collection<Organization> getHiringOrganizations() {
    final Object current = myData.get("hiringOrganization");
    if (current == null) return Collections.emptyList();
    if (current instanceof Collection) {
      return (Collection<Organization>) current;
    }
    return Arrays.asList((Organization) current);
  }
  /**
   * Description of bonus and commission compensation aspects of the job.
   */
  @JsonIgnore public String getIncentiveCompensation() {
    return (String) getValue("incentiveCompensation");
  }
  /**
   * Description of bonus and commission compensation aspects of the job.
   */
  @JsonIgnore public Collection<String> getIncentiveCompensations() {
    final Object current = myData.get("incentiveCompensation");
    if (current == null) return Collections.emptyList();
    if (current instanceof Collection) {
      return (Collection<String>) current;
    }
    return Arrays.asList((String) current);
  }
  /**
   * The industry associated with the job position.
   */
  @JsonIgnore public String getIndustry() {
    return (String) getValue("industry");
  }
  /**
   * The industry associated with the job position.
   */
  @JsonIgnore public Collection<String> getIndustrys() {
    final Object current = myData.get("industry");
    if (current == null) return Collections.emptyList();
    if (current instanceof Collection) {
      return (Collection<String>) current;
    }
    return Arrays.asList((String) current);
  }
  /**
   * A (typically single) geographic location associated with the job position.
   */
  @JsonIgnore public Place getJobLocation() {
    return (Place) getValue("jobLocation");
  }
  /**
   * A (typically single) geographic location associated with the job position.
   */
  @JsonIgnore public Collection<Place> getJobLocations() {
    final Object current = myData.get("jobLocation");
    if (current == null) return Collections.emptyList();
    if (current instanceof Collection) {
      return (Collection<Place>) current;
    }
    return Arrays.asList((Place) current);
  }
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
   * Any special commitments associated with this job posting. Valid entries include VeteranCommit, MilitarySpouseCommit, etc.
   */
  @JsonIgnore public String getSpecialCommitments() {
    return (String) getValue("specialCommitments");
  }
  /**
   * Any special commitments associated with this job posting. Valid entries include VeteranCommit, MilitarySpouseCommit, etc.
   */
  @JsonIgnore public Collection<String> getSpecialCommitmentss() {
    final Object current = myData.get("specialCommitments");
    if (current == null) return Collections.emptyList();
    if (current instanceof Collection) {
      return (Collection<String>) current;
    }
    return Arrays.asList((String) current);
  }
  /**
   * The title of the job.
   */
  @JsonIgnore public String getTitle() {
    return (String) getValue("title");
  }
  /**
   * The title of the job.
   */
  @JsonIgnore public Collection<String> getTitles() {
    final Object current = myData.get("title");
    if (current == null) return Collections.emptyList();
    if (current instanceof Collection) {
      return (Collection<String>) current;
    }
    return Arrays.asList((String) current);
  }
  /**
   * The date after when the item is not valid. For example the end of an offer, salary period, or a period of opening hours.
   */
  @JsonIgnore public java.util.Date getValidThrough() {
    return (java.util.Date) getValue("validThrough");
  }
  /**
   * The date after when the item is not valid. For example the end of an offer, salary period, or a period of opening hours.
   */
  @JsonIgnore public Collection<java.util.Date> getValidThroughs() {
    final Object current = myData.get("validThrough");
    if (current == null) return Collections.emptyList();
    if (current instanceof Collection) {
      return (Collection<java.util.Date>) current;
    }
    return Arrays.asList((java.util.Date) current);
  }
  /**
   * The typical working hours for this job (e.g. 1st shift, night shift, 8am-5pm).
   */
  @JsonIgnore public String getWorkHours() {
    return (String) getValue("workHours");
  }
  /**
   * The typical working hours for this job (e.g. 1st shift, night shift, 8am-5pm).
   */
  @JsonIgnore public Collection<String> getWorkHourss() {
    final Object current = myData.get("workHours");
    if (current == null) return Collections.emptyList();
    if (current instanceof Collection) {
      return (Collection<String>) current;
    }
    return Arrays.asList((String) current);
  }
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
  /**
   * The Occupation for the JobPosting.
   */
  @JsonIgnore public Occupation getRelevantOccupation() {
    return (Occupation) getValue("relevantOccupation");
  }
  /**
   * The Occupation for the JobPosting.
   */
  @JsonIgnore public Collection<Occupation> getRelevantOccupations() {
    final Object current = myData.get("relevantOccupation");
    if (current == null) return Collections.emptyList();
    if (current instanceof Collection) {
      return (Collection<Occupation>) current;
    }
    return Arrays.asList((Occupation) current);
  }
  protected JobPosting(java.util.Map<String,Object> data) {
    super(data);
  }
  
  /**
   * Builder for {@link JobPosting}
   */
  public static class Builder extends Intangible.Builder {
    public Builder(@NotNull HashMap<String,Object> data) {
      super(data);
    }
    @NotNull public JobPosting build() {
      return new JobPosting(myData);
    }
    /**
     * The base salary of the job or of an employee in an EmployeeRole.
     */
    @NotNull public Builder baseSalary(@NotNull Integer integer) {
      putValue("baseSalary", integer);
      return this;
    }
    /**
     * The base salary of the job or of an employee in an EmployeeRole.
     */
    @NotNull public Builder baseSalary(@NotNull Long baseSalary) {
      putValue("baseSalary", baseSalary);
      return this;
    }
    /**
     * The base salary of the job or of an employee in an EmployeeRole.
     */
    @NotNull public Builder baseSalary(@NotNull Float baseSalary) {
      putValue("baseSalary", baseSalary);
      return this;
    }
    /**
     * The base salary of the job or of an employee in an EmployeeRole.
     */
    @NotNull public Builder baseSalary(@NotNull Double baseSalary) {
      putValue("baseSalary", baseSalary);
      return this;
    }
    /**
     * The base salary of the job or of an employee in an EmployeeRole.
     */
    @NotNull public Builder baseSalary(@NotNull String baseSalary) {
      putValue("baseSalary", baseSalary);
      return this;
    }
    /**
     * Description of benefits associated with the job.
     */
    @NotNull public Builder jobBenefits(@NotNull String jobBenefits) {
      putValue("jobBenefits", jobBenefits);
      return this;
    }
    /**
     * Publication date of an online listing.
     */
    @NotNull public Builder datePosted(@NotNull java.util.Date date) {
      putValue("datePosted", date);
      return this;
    }
    /**
     * Type of employment (e.g. full-time, part-time, contract, temporary, seasonal, internship).
     */
    @NotNull public Builder employmentType(@NotNull String employmentType) {
      putValue("employmentType", employmentType);
      return this;
    }
    /**
     * Organization offering the job position.
     */
    @NotNull public Builder hiringOrganization(@NotNull Organization organization) {
      putValue("hiringOrganization", organization);
      return this;
    }
    /**
     * Organization offering the job position.
     */
    @NotNull public Builder hiringOrganization(@NotNull Organization.Builder organization) {
      putValue("hiringOrganization", organization.build());
      return this;
    }
    /**
     * Description of bonus and commission compensation aspects of the job.
     */
    @NotNull public Builder incentiveCompensation(@NotNull String incentiveCompensation) {
      putValue("incentiveCompensation", incentiveCompensation);
      return this;
    }
    /**
     * The industry associated with the job position.
     */
    @NotNull public Builder industry(@NotNull String industry) {
      putValue("industry", industry);
      return this;
    }
    /**
     * A (typically single) geographic location associated with the job position.
     */
    @NotNull public Builder jobLocation(@NotNull Place place) {
      putValue("jobLocation", place);
      return this;
    }
    /**
     * A (typically single) geographic location associated with the job position.
     */
    @NotNull public Builder jobLocation(@NotNull Place.Builder place) {
      putValue("jobLocation", place.build());
      return this;
    }
    /**
     * The currency (coded using [ISO 4217](http://en.wikipedia.org/wiki/ISO_4217) ) used for the main salary information in this job posting or for this employee.
     */
    @NotNull public Builder salaryCurrency(@NotNull String salaryCurrency) {
      putValue("salaryCurrency", salaryCurrency);
      return this;
    }
    /**
     * Any special commitments associated with this job posting. Valid entries include VeteranCommit, MilitarySpouseCommit, etc.
     */
    @NotNull public Builder specialCommitments(@NotNull String specialCommitments) {
      putValue("specialCommitments", specialCommitments);
      return this;
    }
    /**
     * The title of the job.
     */
    @NotNull public Builder title(@NotNull String title) {
      putValue("title", title);
      return this;
    }
    /**
     * The date after when the item is not valid. For example the end of an offer, salary period, or a period of opening hours.
     */
    @NotNull public Builder validThrough(@NotNull java.util.Date date) {
      putValue("validThrough", date);
      return this;
    }
    /**
     * The typical working hours for this job (e.g. 1st shift, night shift, 8am-5pm).
     */
    @NotNull public Builder workHours(@NotNull String workHours) {
      putValue("workHours", workHours);
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
     * The Occupation for the JobPosting.
     */
    @NotNull public Builder relevantOccupation(@NotNull Occupation occupation) {
      putValue("relevantOccupation", occupation);
      return this;
    }
    /**
     * The Occupation for the JobPosting.
     */
    @NotNull public Builder relevantOccupation(@NotNull Occupation.Builder occupation) {
      putValue("relevantOccupation", occupation.build());
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
      if ("baseSalary".equals(key) && value instanceof Integer) { this.baseSalary((Integer)value); return; }
      if ("baseSalarys".equals(key) && value instanceof Integer) { this.baseSalary((Integer)value); return; }
      if ("baseSalary".equals(key) && value instanceof Long) { this.baseSalary((Long)value); return; }
      if ("baseSalarys".equals(key) && value instanceof Long) { this.baseSalary((Long)value); return; }
      if ("baseSalary".equals(key) && value instanceof Float) { this.baseSalary((Float)value); return; }
      if ("baseSalarys".equals(key) && value instanceof Float) { this.baseSalary((Float)value); return; }
      if ("baseSalary".equals(key) && value instanceof Double) { this.baseSalary((Double)value); return; }
      if ("baseSalarys".equals(key) && value instanceof Double) { this.baseSalary((Double)value); return; }
      if ("baseSalary".equals(key) && value instanceof String) { this.baseSalary((String)value); return; }
      if ("baseSalarys".equals(key) && value instanceof String) { this.baseSalary((String)value); return; }
      if ("jobBenefits".equals(key) && value instanceof String) { this.jobBenefits((String)value); return; }
      if ("jobBenefitss".equals(key) && value instanceof String) { this.jobBenefits((String)value); return; }
      if ("datePosted".equals(key) && value instanceof java.util.Date) { this.datePosted((java.util.Date)value); return; }
      if ("datePosteds".equals(key) && value instanceof java.util.Date) { this.datePosted((java.util.Date)value); return; }
      if ("employmentType".equals(key) && value instanceof String) { this.employmentType((String)value); return; }
      if ("employmentTypes".equals(key) && value instanceof String) { this.employmentType((String)value); return; }
      if ("hiringOrganization".equals(key) && value instanceof Organization) { this.hiringOrganization((Organization)value); return; }
      if ("hiringOrganizations".equals(key) && value instanceof Organization) { this.hiringOrganization((Organization)value); return; }
      if ("incentiveCompensation".equals(key) && value instanceof String) { this.incentiveCompensation((String)value); return; }
      if ("incentiveCompensations".equals(key) && value instanceof String) { this.incentiveCompensation((String)value); return; }
      if ("industry".equals(key) && value instanceof String) { this.industry((String)value); return; }
      if ("industrys".equals(key) && value instanceof String) { this.industry((String)value); return; }
      if ("jobLocation".equals(key) && value instanceof Place) { this.jobLocation((Place)value); return; }
      if ("jobLocations".equals(key) && value instanceof Place) { this.jobLocation((Place)value); return; }
      if ("salaryCurrency".equals(key) && value instanceof String) { this.salaryCurrency((String)value); return; }
      if ("salaryCurrencys".equals(key) && value instanceof String) { this.salaryCurrency((String)value); return; }
      if ("specialCommitments".equals(key) && value instanceof String) { this.specialCommitments((String)value); return; }
      if ("specialCommitmentss".equals(key) && value instanceof String) { this.specialCommitments((String)value); return; }
      if ("title".equals(key) && value instanceof String) { this.title((String)value); return; }
      if ("titles".equals(key) && value instanceof String) { this.title((String)value); return; }
      if ("validThrough".equals(key) && value instanceof java.util.Date) { this.validThrough((java.util.Date)value); return; }
      if ("validThroughs".equals(key) && value instanceof java.util.Date) { this.validThrough((java.util.Date)value); return; }
      if ("workHours".equals(key) && value instanceof String) { this.workHours((String)value); return; }
      if ("workHourss".equals(key) && value instanceof String) { this.workHours((String)value); return; }
      if ("educationRequirements".equals(key) && value instanceof String) { this.educationRequirements((String)value); return; }
      if ("educationRequirementss".equals(key) && value instanceof String) { this.educationRequirements((String)value); return; }
      if ("estimatedSalary".equals(key) && value instanceof Integer) { this.estimatedSalary((Integer)value); return; }
      if ("estimatedSalarys".equals(key) && value instanceof Integer) { this.estimatedSalary((Integer)value); return; }
      if ("estimatedSalary".equals(key) && value instanceof Long) { this.estimatedSalary((Long)value); return; }
      if ("estimatedSalarys".equals(key) && value instanceof Long) { this.estimatedSalary((Long)value); return; }
      if ("estimatedSalary".equals(key) && value instanceof Float) { this.estimatedSalary((Float)value); return; }
      if ("estimatedSalarys".equals(key) && value instanceof Float) { this.estimatedSalary((Float)value); return; }
      if ("estimatedSalary".equals(key) && value instanceof Double) { this.estimatedSalary((Double)value); return; }
      if ("estimatedSalarys".equals(key) && value instanceof Double) { this.estimatedSalary((Double)value); return; }
      if ("estimatedSalary".equals(key) && value instanceof String) { this.estimatedSalary((String)value); return; }
      if ("estimatedSalarys".equals(key) && value instanceof String) { this.estimatedSalary((String)value); return; }
      if ("experienceRequirements".equals(key) && value instanceof String) { this.experienceRequirements((String)value); return; }
      if ("experienceRequirementss".equals(key) && value instanceof String) { this.experienceRequirements((String)value); return; }
      if ("occupationalCategory".equals(key) && value instanceof String) { this.occupationalCategory((String)value); return; }
      if ("occupationalCategorys".equals(key) && value instanceof String) { this.occupationalCategory((String)value); return; }
      if ("qualifications".equals(key) && value instanceof String) { this.qualifications((String)value); return; }
      if ("qualificationss".equals(key) && value instanceof String) { this.qualifications((String)value); return; }
      if ("responsibilities".equals(key) && value instanceof String) { this.responsibilities((String)value); return; }
      if ("responsibilitiess".equals(key) && value instanceof String) { this.responsibilities((String)value); return; }
      if ("skills".equals(key) && value instanceof String) { this.skills((String)value); return; }
      if ("skillss".equals(key) && value instanceof String) { this.skills((String)value); return; }
      if ("relevantOccupation".equals(key) && value instanceof Occupation) { this.relevantOccupation((Occupation)value); return; }
      if ("relevantOccupations".equals(key) && value instanceof Occupation) { this.relevantOccupation((Occupation)value); return; }
      super.fromMap(key, value);
    }
  }
  
}
