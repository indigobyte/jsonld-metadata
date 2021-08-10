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
 * A listing that describes a job opening in a certain organization.
 */
public class JobPosting extends Intangible {
  /**
   * A description of the employer, career opportunities and work environment for this position.
   * @return employerOverview property set by first invocation of employerOverview method or {@code null}.
   */
  @JsonIgnore public String getEmployerOverview() {
    return (String) getValue("employerOverview");
  }
  /**
   * A description of the employer, career opportunities and work environment for this position.
   * @return all employerOverview properties as {@link java.util.Collection} or an empty collection 
   * if employerOverview was not set.
   */
  @JsonIgnore public java.util.Collection<String> getEmployerOverviews() {
    final java.lang.Object current = myData.get("employerOverview");
    if (current == null) return Collections.emptyList();
    if (current instanceof java.util.Collection) {
      return (java.util.Collection<String>) current;
    }
    return Arrays.asList((String) current);
  }
  /**
   * The typical working hours for this job (e.g. 1st shift, night shift, 8am-5pm).
   * @return workHours property set by first invocation of workHours method or {@code null}.
   */
  @JsonIgnore public String getWorkHours() {
    return (String) getValue("workHours");
  }
  /**
   * The typical working hours for this job (e.g. 1st shift, night shift, 8am-5pm).
   * @return all workHours properties as {@link java.util.Collection} or an empty collection 
   * if workHours was not set.
   */
  @JsonIgnore public java.util.Collection<String> getWorkHourss() {
    final java.lang.Object current = myData.get("workHours");
    if (current == null) return Collections.emptyList();
    if (current instanceof java.util.Collection) {
      return (java.util.Collection<String>) current;
    }
    return Arrays.asList((String) current);
  }
  /**
   * A description of any sensory requirements and levels necessary to function on the job, including hearing and vision. Defined terms such as those in O*net may be used, but note that there is no way to specify the level of ability as well as its nature when using a defined term.
   * @return sensoryRequirement property set by first invocation of sensoryRequirement method or {@code null}.
   */
  @JsonIgnore public DefinedTerm getSensoryRequirementDefinedTerm() {
    return (DefinedTerm) getValue("sensoryRequirement");
  }
  /**
   * A description of any sensory requirements and levels necessary to function on the job, including hearing and vision. Defined terms such as those in O*net may be used, but note that there is no way to specify the level of ability as well as its nature when using a defined term.
   * @return all sensoryRequirement properties as {@link java.util.Collection} or an empty collection 
   * if sensoryRequirement was not set.
   */
  @JsonIgnore public java.util.Collection<DefinedTerm> getSensoryRequirementDefinedTerms() {
    final java.lang.Object current = myData.get("sensoryRequirement");
    if (current == null) return Collections.emptyList();
    if (current instanceof java.util.Collection) {
      return (java.util.Collection<DefinedTerm>) current;
    }
    return Arrays.asList((DefinedTerm) current);
  }
  /**
   * A description of any sensory requirements and levels necessary to function on the job, including hearing and vision. Defined terms such as those in O*net may be used, but note that there is no way to specify the level of ability as well as its nature when using a defined term.
   * @return sensoryRequirement property set by first invocation of sensoryRequirement method or {@code null}.
   */
  @JsonIgnore public String getSensoryRequirementString() {
    return (String) getValue("sensoryRequirement");
  }
  /**
   * A description of any sensory requirements and levels necessary to function on the job, including hearing and vision. Defined terms such as those in O*net may be used, but note that there is no way to specify the level of ability as well as its nature when using a defined term.
   * @return all sensoryRequirement properties as {@link java.util.Collection} or an empty collection 
   * if sensoryRequirement was not set.
   */
  @JsonIgnore public java.util.Collection<String> getSensoryRequirementStrings() {
    final java.lang.Object current = myData.get("sensoryRequirement");
    if (current == null) return Collections.emptyList();
    if (current instanceof java.util.Collection) {
      return (java.util.Collection<String>) current;
    }
    return Arrays.asList((String) current);
  }
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
   * The legal requirements such as citizenship, visa and other documentation required for an applicant to this job.
   * @return eligibilityToWorkRequirement property set by first invocation of eligibilityToWorkRequirement method or {@code null}.
   */
  @JsonIgnore public String getEligibilityToWorkRequirement() {
    return (String) getValue("eligibilityToWorkRequirement");
  }
  /**
   * The legal requirements such as citizenship, visa and other documentation required for an applicant to this job.
   * @return all eligibilityToWorkRequirement properties as {@link java.util.Collection} or an empty collection 
   * if eligibilityToWorkRequirement was not set.
   */
  @JsonIgnore public java.util.Collection<String> getEligibilityToWorkRequirements() {
    final java.lang.Object current = myData.get("eligibilityToWorkRequirement");
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
   * An indicator as to whether a position is available for an immediate start.
   * @return jobImmediateStart property set by first invocation of jobImmediateStart method or {@code null}.
   */
  @JsonIgnore public Boolean getJobImmediateStart() {
    return (Boolean) getValue("jobImmediateStart");
  }
  /**
   * An indicator as to whether a position is available for an immediate start.
   * @return all jobImmediateStart properties as {@link java.util.Collection} or an empty collection 
   * if jobImmediateStart was not set.
   */
  @JsonIgnore public java.util.Collection<Boolean> getJobImmediateStarts() {
    final java.lang.Object current = myData.get("jobImmediateStart");
    if (current == null) return Collections.emptyList();
    if (current instanceof java.util.Collection) {
      return (java.util.Collection<Boolean>) current;
    }
    return Arrays.asList((Boolean) current);
  }
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
   * A (typically single) geographic location associated with the job position.
   * @return jobLocation property set by first invocation of jobLocation method or {@code null}.
   */
  @JsonIgnore public Place getJobLocation() {
    return (Place) getValue("jobLocation");
  }
  /**
   * A (typically single) geographic location associated with the job position.
   * @return all jobLocation properties as {@link java.util.Collection} or an empty collection 
   * if jobLocation was not set.
   */
  @JsonIgnore public java.util.Collection<Place> getJobLocations() {
    final java.lang.Object current = myData.get("jobLocation");
    if (current == null) return Collections.emptyList();
    if (current instanceof java.util.Collection) {
      return (java.util.Collection<Place>) current;
    }
    return Arrays.asList((Place) current);
  }
  /**
   * Publication date of an online listing.
   * @return datePosted property set by first invocation of datePosted method or {@code null}.
   */
  @JsonIgnore public java.util.Date getDatePosted() {
    return (java.util.Date) getValue("datePosted");
  }
  /**
   * Publication date of an online listing.
   * @return all datePosted properties as {@link java.util.Collection} or an empty collection 
   * if datePosted was not set.
   */
  @JsonIgnore public java.util.Collection<java.util.Date> getDatePosteds() {
    final java.lang.Object current = myData.get("datePosted");
    if (current == null) return Collections.emptyList();
    if (current instanceof java.util.Collection) {
      return (java.util.Collection<java.util.Date>) current;
    }
    return Arrays.asList((java.util.Date) current);
  }
  /**
   * Any special commitments associated with this job posting. Valid entries include VeteranCommit, MilitarySpouseCommit, etc.
   * @return specialCommitments property set by first invocation of specialCommitments method or {@code null}.
   */
  @JsonIgnore public String getSpecialCommitments() {
    return (String) getValue("specialCommitments");
  }
  /**
   * Any special commitments associated with this job posting. Valid entries include VeteranCommit, MilitarySpouseCommit, etc.
   * @return all specialCommitments properties as {@link java.util.Collection} or an empty collection 
   * if specialCommitments was not set.
   */
  @JsonIgnore public java.util.Collection<String> getSpecialCommitmentss() {
    final java.lang.Object current = myData.get("specialCommitments");
    if (current == null) return Collections.emptyList();
    if (current instanceof java.util.Collection) {
      return (java.util.Collection<String>) current;
    }
    return Arrays.asList((String) current);
  }
  /**
   * Contact details for further information relevant to this job posting.
   * @return applicationContact property set by first invocation of applicationContact method or {@code null}.
   */
  @JsonIgnore public ContactPoint getApplicationContact() {
    return (ContactPoint) getValue("applicationContact");
  }
  /**
   * Contact details for further information relevant to this job posting.
   * @return all applicationContact properties as {@link java.util.Collection} or an empty collection 
   * if applicationContact was not set.
   */
  @JsonIgnore public java.util.Collection<ContactPoint> getApplicationContacts() {
    final java.lang.Object current = myData.get("applicationContact");
    if (current == null) return Collections.emptyList();
    if (current instanceof java.util.Collection) {
      return (java.util.Collection<ContactPoint>) current;
    }
    return Arrays.asList((ContactPoint) current);
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
   * Indicates whether an [[url]] that is associated with a [[JobPosting]] enables direct application for the job, via the posting website. A job posting is considered to have directApply of [[True]] if an application process for the specified job can be directly initiated via the url(s) given (noting that e.g. multiple internet domains might nevertheless be involved at an implementation level). A value of [[False]] is appropriate if there is no clear path to applying directly online for the specified job, navigating directly from the JobPosting url(s) supplied.
   * @return directApply property set by first invocation of directApply method or {@code null}.
   */
  @JsonIgnore public Boolean getDirectApply() {
    return (Boolean) getValue("directApply");
  }
  /**
   * Indicates whether an [[url]] that is associated with a [[JobPosting]] enables direct application for the job, via the posting website. A job posting is considered to have directApply of [[True]] if an application process for the specified job can be directly initiated via the url(s) given (noting that e.g. multiple internet domains might nevertheless be involved at an implementation level). A value of [[False]] is appropriate if there is no clear path to applying directly online for the specified job, navigating directly from the JobPosting url(s) supplied.
   * @return all directApply properties as {@link java.util.Collection} or an empty collection 
   * if directApply was not set.
   */
  @JsonIgnore public java.util.Collection<Boolean> getDirectApplys() {
    final java.lang.Object current = myData.get("directApply");
    if (current == null) return Collections.emptyList();
    if (current instanceof java.util.Collection) {
      return (java.util.Collection<Boolean>) current;
    }
    return Arrays.asList((Boolean) current);
  }
  /**
   * A description of the job location (e.g TELECOMMUTE for telecommute jobs).
   * @return jobLocationType property set by first invocation of jobLocationType method or {@code null}.
   */
  @JsonIgnore public String getJobLocationType() {
    return (String) getValue("jobLocationType");
  }
  /**
   * A description of the job location (e.g TELECOMMUTE for telecommute jobs).
   * @return all jobLocationType properties as {@link java.util.Collection} or an empty collection 
   * if jobLocationType was not set.
   */
  @JsonIgnore public java.util.Collection<String> getJobLocationTypes() {
    final java.lang.Object current = myData.get("jobLocationType");
    if (current == null) return Collections.emptyList();
    if (current instanceof java.util.Collection) {
      return (java.util.Collection<String>) current;
    }
    return Arrays.asList((String) current);
  }
  /**
   * The location(s) applicants can apply from. This is usually used for telecommuting jobs where the applicant does not need to be in a physical office. Note: This should not be used for citizenship or work visa requirements.
   * @return applicantLocationRequirements property set by first invocation of applicantLocationRequirements method or {@code null}.
   */
  @JsonIgnore public AdministrativeArea getApplicantLocationRequirements() {
    return (AdministrativeArea) getValue("applicantLocationRequirements");
  }
  /**
   * The location(s) applicants can apply from. This is usually used for telecommuting jobs where the applicant does not need to be in a physical office. Note: This should not be used for citizenship or work visa requirements.
   * @return all applicantLocationRequirements properties as {@link java.util.Collection} or an empty collection 
   * if applicantLocationRequirements was not set.
   */
  @JsonIgnore public java.util.Collection<AdministrativeArea> getApplicantLocationRequirementss() {
    final java.lang.Object current = myData.get("applicantLocationRequirements");
    if (current == null) return Collections.emptyList();
    if (current instanceof java.util.Collection) {
      return (java.util.Collection<AdministrativeArea>) current;
    }
    return Arrays.asList((AdministrativeArea) current);
  }
  /**
   * Description of bonus and commission compensation aspects of the job.
   * @return incentiveCompensation property set by first invocation of incentiveCompensation method or {@code null}.
   */
  @JsonIgnore public String getIncentiveCompensation() {
    return (String) getValue("incentiveCompensation");
  }
  /**
   * Description of bonus and commission compensation aspects of the job.
   * @return all incentiveCompensation properties as {@link java.util.Collection} or an empty collection 
   * if incentiveCompensation was not set.
   */
  @JsonIgnore public java.util.Collection<String> getIncentiveCompensations() {
    final java.lang.Object current = myData.get("incentiveCompensation");
    if (current == null) return Collections.emptyList();
    if (current instanceof java.util.Collection) {
      return (java.util.Collection<String>) current;
    }
    return Arrays.asList((String) current);
  }
  /**
   * The industry associated with the job position.
   * @return industry property set by first invocation of industry method or {@code null}.
   */
  @JsonIgnore public DefinedTerm getIndustryDefinedTerm() {
    return (DefinedTerm) getValue("industry");
  }
  /**
   * The industry associated with the job position.
   * @return all industry properties as {@link java.util.Collection} or an empty collection 
   * if industry was not set.
   */
  @JsonIgnore public java.util.Collection<DefinedTerm> getIndustryDefinedTerms() {
    final java.lang.Object current = myData.get("industry");
    if (current == null) return Collections.emptyList();
    if (current instanceof java.util.Collection) {
      return (java.util.Collection<DefinedTerm>) current;
    }
    return Arrays.asList((DefinedTerm) current);
  }
  /**
   * The industry associated with the job position.
   * @return industry property set by first invocation of industry method or {@code null}.
   */
  @JsonIgnore public String getIndustryString() {
    return (String) getValue("industry");
  }
  /**
   * The industry associated with the job position.
   * @return all industry properties as {@link java.util.Collection} or an empty collection 
   * if industry was not set.
   */
  @JsonIgnore public java.util.Collection<String> getIndustryStrings() {
    final java.lang.Object current = myData.get("industry");
    if (current == null) return Collections.emptyList();
    if (current instanceof java.util.Collection) {
      return (java.util.Collection<String>) current;
    }
    return Arrays.asList((String) current);
  }
  /**
   * Indicates the department, unit and/or facility where the employee reports and/or in which the job is to be performed.
   * @return employmentUnit property set by first invocation of employmentUnit method or {@code null}.
   */
  @JsonIgnore public Organization getEmploymentUnit() {
    return (Organization) getValue("employmentUnit");
  }
  /**
   * Indicates the department, unit and/or facility where the employee reports and/or in which the job is to be performed.
   * @return all employmentUnit properties as {@link java.util.Collection} or an empty collection 
   * if employmentUnit was not set.
   */
  @JsonIgnore public java.util.Collection<Organization> getEmploymentUnits() {
    final java.lang.Object current = myData.get("employmentUnit");
    if (current == null) return Collections.emptyList();
    if (current instanceof java.util.Collection) {
      return (java.util.Collection<Organization>) current;
    }
    return Arrays.asList((Organization) current);
  }
  /**
   * Organization offering the job position.
   * @return hiringOrganization property set by first invocation of hiringOrganization method or {@code null}.
   */
  @JsonIgnore public Organization getHiringOrganization() {
    return (Organization) getValue("hiringOrganization");
  }
  /**
   * Organization offering the job position.
   * @return all hiringOrganization properties as {@link java.util.Collection} or an empty collection 
   * if hiringOrganization was not set.
   */
  @JsonIgnore public java.util.Collection<Organization> getHiringOrganizations() {
    final java.lang.Object current = myData.get("hiringOrganization");
    if (current == null) return Collections.emptyList();
    if (current instanceof java.util.Collection) {
      return (java.util.Collection<Organization>) current;
    }
    return Arrays.asList((Organization) current);
  }
  /**
   * A description of the types of physical activity associated with the job. Defined terms such as those in O*net may be used, but note that there is no way to specify the level of ability as well as its nature when using a defined term.
   * @return physicalRequirement property set by first invocation of physicalRequirement method or {@code null}.
   */
  @JsonIgnore public DefinedTerm getPhysicalRequirementDefinedTerm() {
    return (DefinedTerm) getValue("physicalRequirement");
  }
  /**
   * A description of the types of physical activity associated with the job. Defined terms such as those in O*net may be used, but note that there is no way to specify the level of ability as well as its nature when using a defined term.
   * @return all physicalRequirement properties as {@link java.util.Collection} or an empty collection 
   * if physicalRequirement was not set.
   */
  @JsonIgnore public java.util.Collection<DefinedTerm> getPhysicalRequirementDefinedTerms() {
    final java.lang.Object current = myData.get("physicalRequirement");
    if (current == null) return Collections.emptyList();
    if (current instanceof java.util.Collection) {
      return (java.util.Collection<DefinedTerm>) current;
    }
    return Arrays.asList((DefinedTerm) current);
  }
  /**
   * A description of the types of physical activity associated with the job. Defined terms such as those in O*net may be used, but note that there is no way to specify the level of ability as well as its nature when using a defined term.
   * @return physicalRequirement property set by first invocation of physicalRequirement method or {@code null}.
   */
  @JsonIgnore public String getPhysicalRequirementString() {
    return (String) getValue("physicalRequirement");
  }
  /**
   * A description of the types of physical activity associated with the job. Defined terms such as those in O*net may be used, but note that there is no way to specify the level of ability as well as its nature when using a defined term.
   * @return all physicalRequirement properties as {@link java.util.Collection} or an empty collection 
   * if physicalRequirement was not set.
   */
  @JsonIgnore public java.util.Collection<String> getPhysicalRequirementStrings() {
    final java.lang.Object current = myData.get("physicalRequirement");
    if (current == null) return Collections.emptyList();
    if (current instanceof java.util.Collection) {
      return (java.util.Collection<String>) current;
    }
    return Arrays.asList((String) current);
  }
  /**
   * A description of any security clearance requirements of the job.
   * @return securityClearanceRequirement property set by first invocation of securityClearanceRequirement method or {@code null}.
   */
  @JsonIgnore public String getSecurityClearanceRequirement() {
    return (String) getValue("securityClearanceRequirement");
  }
  /**
   * A description of any security clearance requirements of the job.
   * @return all securityClearanceRequirement properties as {@link java.util.Collection} or an empty collection 
   * if securityClearanceRequirement was not set.
   */
  @JsonIgnore public java.util.Collection<String> getSecurityClearanceRequirements() {
    final java.lang.Object current = myData.get("securityClearanceRequirement");
    if (current == null) return Collections.emptyList();
    if (current instanceof java.util.Collection) {
      return (java.util.Collection<String>) current;
    }
    return Arrays.asList((String) current);
  }
  /**
   * The date after when the item is not valid. For example the end of an offer, salary period, or a period of opening hours.
   * @return validThrough property set by first invocation of validThrough method or {@code null}.
   */
  @JsonIgnore public java.util.Date getValidThrough() {
    return (java.util.Date) getValue("validThrough");
  }
  /**
   * The date after when the item is not valid. For example the end of an offer, salary period, or a period of opening hours.
   * @return all validThrough properties as {@link java.util.Collection} or an empty collection 
   * if validThrough was not set.
   */
  @JsonIgnore public java.util.Collection<java.util.Date> getValidThroughs() {
    final java.lang.Object current = myData.get("validThrough");
    if (current == null) return Collections.emptyList();
    if (current instanceof java.util.Collection) {
      return (java.util.Collection<java.util.Date>) current;
    }
    return Arrays.asList((java.util.Date) current);
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
   * Indicates whether a [[JobPosting]] will accept experience (as indicated by [[OccupationalExperienceRequirements]]) in place of its formal educational qualifications (as indicated by [[educationRequirements]]). If true, indicates that satisfying one of these requirements is sufficient.
   * @return experienceInPlaceOfEducation property set by first invocation of experienceInPlaceOfEducation method or {@code null}.
   */
  @JsonIgnore public Boolean getExperienceInPlaceOfEducation() {
    return (Boolean) getValue("experienceInPlaceOfEducation");
  }
  /**
   * Indicates whether a [[JobPosting]] will accept experience (as indicated by [[OccupationalExperienceRequirements]]) in place of its formal educational qualifications (as indicated by [[educationRequirements]]). If true, indicates that satisfying one of these requirements is sufficient.
   * @return all experienceInPlaceOfEducation properties as {@link java.util.Collection} or an empty collection 
   * if experienceInPlaceOfEducation was not set.
   */
  @JsonIgnore public java.util.Collection<Boolean> getExperienceInPlaceOfEducations() {
    final java.lang.Object current = myData.get("experienceInPlaceOfEducation");
    if (current == null) return Collections.emptyList();
    if (current instanceof java.util.Collection) {
      return (java.util.Collection<Boolean>) current;
    }
    return Arrays.asList((Boolean) current);
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
   * The title of the job.
   * @return title property set by first invocation of title method or {@code null}.
   */
  @JsonIgnore public String getTitle() {
    return (String) getValue("title");
  }
  /**
   * The title of the job.
   * @return all title properties as {@link java.util.Collection} or an empty collection 
   * if title was not set.
   */
  @JsonIgnore public java.util.Collection<String> getTitles() {
    final java.lang.Object current = myData.get("title");
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
   * Type of employment (e.g. full-time, part-time, contract, temporary, seasonal, internship).
   * @return employmentType property set by first invocation of employmentType method or {@code null}.
   */
  @JsonIgnore public String getEmploymentType() {
    return (String) getValue("employmentType");
  }
  /**
   * Type of employment (e.g. full-time, part-time, contract, temporary, seasonal, internship).
   * @return all employmentType properties as {@link java.util.Collection} or an empty collection 
   * if employmentType was not set.
   */
  @JsonIgnore public java.util.Collection<String> getEmploymentTypes() {
    final java.lang.Object current = myData.get("employmentType");
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
  /**
   * The Occupation for the JobPosting.
   * @return relevantOccupation property set by first invocation of relevantOccupation method or {@code null}.
   */
  @JsonIgnore public Occupation getRelevantOccupation() {
    return (Occupation) getValue("relevantOccupation");
  }
  /**
   * The Occupation for the JobPosting.
   * @return all relevantOccupation properties as {@link java.util.Collection} or an empty collection 
   * if relevantOccupation was not set.
   */
  @JsonIgnore public java.util.Collection<Occupation> getRelevantOccupations() {
    final java.lang.Object current = myData.get("relevantOccupation");
    if (current == null) return Collections.emptyList();
    if (current instanceof java.util.Collection) {
      return (java.util.Collection<Occupation>) current;
    }
    return Arrays.asList((Occupation) current);
  }
  /**
   * Description of benefits associated with the job.
   * @return jobBenefits property set by first invocation of jobBenefits method or {@code null}.
   */
  @JsonIgnore public String getJobBenefits() {
    return (String) getValue("jobBenefits");
  }
  /**
   * Description of benefits associated with the job.
   * @return all jobBenefits properties as {@link java.util.Collection} or an empty collection 
   * if jobBenefits was not set.
   */
  @JsonIgnore public java.util.Collection<String> getJobBenefitss() {
    final java.lang.Object current = myData.get("jobBenefits");
    if (current == null) return Collections.emptyList();
    if (current instanceof java.util.Collection) {
      return (java.util.Collection<String>) current;
    }
    return Arrays.asList((String) current);
  }
  /**
   * The date on which a successful applicant for this job would be expected to start work. Choose a specific date in the future or use the jobImmediateStart property to indicate the position is to be filled as soon as possible.
   * @return jobStartDate property set by first invocation of jobStartDate method or {@code null}.
   */
  @JsonIgnore public String getJobStartDateString() {
    return (String) getValue("jobStartDate");
  }
  /**
   * The date on which a successful applicant for this job would be expected to start work. Choose a specific date in the future or use the jobImmediateStart property to indicate the position is to be filled as soon as possible.
   * @return all jobStartDate properties as {@link java.util.Collection} or an empty collection 
   * if jobStartDate was not set.
   */
  @JsonIgnore public java.util.Collection<String> getJobStartDateStrings() {
    final java.lang.Object current = myData.get("jobStartDate");
    if (current == null) return Collections.emptyList();
    if (current instanceof java.util.Collection) {
      return (java.util.Collection<String>) current;
    }
    return Arrays.asList((String) current);
  }
  /**
   * The date on which a successful applicant for this job would be expected to start work. Choose a specific date in the future or use the jobImmediateStart property to indicate the position is to be filled as soon as possible.
   * @return jobStartDate property set by first invocation of jobStartDate method or {@code null}.
   */
  @JsonIgnore public java.util.Date getJobStartDateDate() {
    return (java.util.Date) getValue("jobStartDate");
  }
  /**
   * The date on which a successful applicant for this job would be expected to start work. Choose a specific date in the future or use the jobImmediateStart property to indicate the position is to be filled as soon as possible.
   * @return all jobStartDate properties as {@link java.util.Collection} or an empty collection 
   * if jobStartDate was not set.
   */
  @JsonIgnore public java.util.Collection<java.util.Date> getJobStartDateDates() {
    final java.lang.Object current = myData.get("jobStartDate");
    if (current == null) return Collections.emptyList();
    if (current instanceof java.util.Collection) {
      return (java.util.Collection<java.util.Date>) current;
    }
    return Arrays.asList((java.util.Date) current);
  }
  /**
   * The number of positions open for this job posting. Use a positive integer. Do not use if the number of positions is unclear or not known.
   * @return totalJobOpenings property set by first invocation of totalJobOpenings method or {@code null}.
   */
  @JsonIgnore public Integer getTotalJobOpenings() {
    return (Integer) getValue("totalJobOpenings");
  }
  /**
   * The number of positions open for this job posting. Use a positive integer. Do not use if the number of positions is unclear or not known.
   * @return all totalJobOpenings properties as {@link java.util.Collection} or an empty collection 
   * if totalJobOpenings was not set.
   */
  @JsonIgnore public java.util.Collection<Integer> getTotalJobOpeningss() {
    final java.lang.Object current = myData.get("totalJobOpenings");
    if (current == null) return Collections.emptyList();
    if (current instanceof java.util.Collection) {
      return (java.util.Collection<Integer>) current;
    }
    return Arrays.asList((Integer) current);
  }
  protected JobPosting(java.util.Map<String,java.lang.Object> data) {
    super(data);
  }
  /**
   * @return new {@link Builder} initialized with this instance's data
   */
  @NotNull public Builder toBuilder() {
    return new Builder(new HashMap<>(this.myData));
  }
  
  /**
   * Builder for {@link JobPosting}
   */
  public static class Builder extends Intangible.Builder {
    public Builder(@NotNull HashMap<String,java.lang.Object> data) {
      super(data);
    }
    @NotNull public JobPosting build() {
      return new JobPosting(myData);
    }
    /**
     * A description of the employer, career opportunities and work environment for this position.
     * @param employerOverview value to set
     * @return this builder instance
     */
    @NotNull public Builder employerOverview(@NotNull String employerOverview) {
      putValue("employerOverview", employerOverview);
      return this;
    }
    /**
     * Remove employerOverview property from the builder.
     * If this property is repeatable, all instances are removed.
     * @return this builder instance
     */
    @NotNull public Builder removeEmployerOverview() {
      removeValue("employerOverview");
      return this;
    }
    /**
     * Get currently set value for employerOverview property in this builder.
     * @return previously set value or {@code null}. If multiple values have been 
     * set to this property, then {@link java.util.Collection} instance will be 
     * returned.
     */
    @Nullable public java.lang.Object getEmployerOverview() {
      return myData.get("employerOverview");
    }
    /**
     * The typical working hours for this job (e.g. 1st shift, night shift, 8am-5pm).
     * @param workHours value to set
     * @return this builder instance
     */
    @NotNull public Builder workHours(@NotNull String workHours) {
      putValue("workHours", workHours);
      return this;
    }
    /**
     * Remove workHours property from the builder.
     * If this property is repeatable, all instances are removed.
     * @return this builder instance
     */
    @NotNull public Builder removeWorkHours() {
      removeValue("workHours");
      return this;
    }
    /**
     * Get currently set value for workHours property in this builder.
     * @return previously set value or {@code null}. If multiple values have been 
     * set to this property, then {@link java.util.Collection} instance will be 
     * returned.
     */
    @Nullable public java.lang.Object getWorkHours() {
      return myData.get("workHours");
    }
    /**
     * A description of any sensory requirements and levels necessary to function on the job, including hearing and vision. Defined terms such as those in O*net may be used, but note that there is no way to specify the level of ability as well as its nature when using a defined term.
     * @param definedTerm value to set
     * @return this builder instance
     */
    @NotNull public Builder sensoryRequirement(@NotNull DefinedTerm definedTerm) {
      putValue("sensoryRequirement", definedTerm);
      return this;
    }
    /**
     * A description of any sensory requirements and levels necessary to function on the job, including hearing and vision. Defined terms such as those in O*net may be used, but note that there is no way to specify the level of ability as well as its nature when using a defined term.
     * @param definedTerm value to set
     * @return this builder instance
     */
    @NotNull public Builder sensoryRequirement(@NotNull DefinedTerm.Builder definedTerm) {
      putValue("sensoryRequirement", definedTerm.build());
      return this;
    }
    /**
     * A description of any sensory requirements and levels necessary to function on the job, including hearing and vision. Defined terms such as those in O*net may be used, but note that there is no way to specify the level of ability as well as its nature when using a defined term.
     * @param sensoryRequirement value to set
     * @return this builder instance
     */
    @NotNull public Builder sensoryRequirement(@NotNull String sensoryRequirement) {
      putValue("sensoryRequirement", sensoryRequirement);
      return this;
    }
    /**
     * Remove sensoryRequirement property from the builder.
     * If this property is repeatable, all instances are removed.
     * @return this builder instance
     */
    @NotNull public Builder removeSensoryRequirement() {
      removeValue("sensoryRequirement");
      return this;
    }
    /**
     * Get currently set value for sensoryRequirement property in this builder.
     * @return previously set value or {@code null}. If multiple values have been 
     * set to this property, then {@link java.util.Collection} instance will be 
     * returned.
     */
    @Nullable public java.lang.Object getSensoryRequirement() {
      return myData.get("sensoryRequirement");
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
     * The legal requirements such as citizenship, visa and other documentation required for an applicant to this job.
     * @param eligibilityToWorkRequirement value to set
     * @return this builder instance
     */
    @NotNull public Builder eligibilityToWorkRequirement(@NotNull String eligibilityToWorkRequirement) {
      putValue("eligibilityToWorkRequirement", eligibilityToWorkRequirement);
      return this;
    }
    /**
     * Remove eligibilityToWorkRequirement property from the builder.
     * If this property is repeatable, all instances are removed.
     * @return this builder instance
     */
    @NotNull public Builder removeEligibilityToWorkRequirement() {
      removeValue("eligibilityToWorkRequirement");
      return this;
    }
    /**
     * Get currently set value for eligibilityToWorkRequirement property in this builder.
     * @return previously set value or {@code null}. If multiple values have been 
     * set to this property, then {@link java.util.Collection} instance will be 
     * returned.
     */
    @Nullable public java.lang.Object getEligibilityToWorkRequirement() {
      return myData.get("eligibilityToWorkRequirement");
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
     * An indicator as to whether a position is available for an immediate start.
     * @param jobImmediateStart value to set
     * @return this builder instance
     */
    @NotNull public Builder jobImmediateStart(@NotNull Boolean jobImmediateStart) {
      putValue("jobImmediateStart", jobImmediateStart);
      return this;
    }
    /**
     * Remove jobImmediateStart property from the builder.
     * If this property is repeatable, all instances are removed.
     * @return this builder instance
     */
    @NotNull public Builder removeJobImmediateStart() {
      removeValue("jobImmediateStart");
      return this;
    }
    /**
     * Get currently set value for jobImmediateStart property in this builder.
     * @return previously set value or {@code null}. If multiple values have been 
     * set to this property, then {@link java.util.Collection} instance will be 
     * returned.
     */
    @Nullable public java.lang.Object getJobImmediateStart() {
      return myData.get("jobImmediateStart");
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
     * A (typically single) geographic location associated with the job position.
     * @param place value to set
     * @return this builder instance
     */
    @NotNull public Builder jobLocation(@NotNull Place place) {
      putValue("jobLocation", place);
      return this;
    }
    /**
     * A (typically single) geographic location associated with the job position.
     * @param place value to set
     * @return this builder instance
     */
    @NotNull public Builder jobLocation(@NotNull Place.Builder place) {
      putValue("jobLocation", place.build());
      return this;
    }
    /**
     * Remove jobLocation property from the builder.
     * If this property is repeatable, all instances are removed.
     * @return this builder instance
     */
    @NotNull public Builder removeJobLocation() {
      removeValue("jobLocation");
      return this;
    }
    /**
     * Get currently set value for jobLocation property in this builder.
     * @return previously set value or {@code null}. If multiple values have been 
     * set to this property, then {@link java.util.Collection} instance will be 
     * returned.
     */
    @Nullable public java.lang.Object getJobLocation() {
      return myData.get("jobLocation");
    }
    /**
     * Publication date of an online listing.
     * @param date value to set
     * @return this builder instance
     */
    @NotNull public Builder datePosted(@NotNull java.util.Date date) {
      putValue("datePosted", date);
      return this;
    }
    /**
     * Remove datePosted property from the builder.
     * If this property is repeatable, all instances are removed.
     * @return this builder instance
     */
    @NotNull public Builder removeDatePosted() {
      removeValue("datePosted");
      return this;
    }
    /**
     * Get currently set value for datePosted property in this builder.
     * @return previously set value or {@code null}. If multiple values have been 
     * set to this property, then {@link java.util.Collection} instance will be 
     * returned.
     */
    @Nullable public java.lang.Object getDatePosted() {
      return myData.get("datePosted");
    }
    /**
     * Any special commitments associated with this job posting. Valid entries include VeteranCommit, MilitarySpouseCommit, etc.
     * @param specialCommitments value to set
     * @return this builder instance
     */
    @NotNull public Builder specialCommitments(@NotNull String specialCommitments) {
      putValue("specialCommitments", specialCommitments);
      return this;
    }
    /**
     * Remove specialCommitments property from the builder.
     * If this property is repeatable, all instances are removed.
     * @return this builder instance
     */
    @NotNull public Builder removeSpecialCommitments() {
      removeValue("specialCommitments");
      return this;
    }
    /**
     * Get currently set value for specialCommitments property in this builder.
     * @return previously set value or {@code null}. If multiple values have been 
     * set to this property, then {@link java.util.Collection} instance will be 
     * returned.
     */
    @Nullable public java.lang.Object getSpecialCommitments() {
      return myData.get("specialCommitments");
    }
    /**
     * Contact details for further information relevant to this job posting.
     * @param contactPoint value to set
     * @return this builder instance
     */
    @NotNull public Builder applicationContact(@NotNull ContactPoint contactPoint) {
      putValue("applicationContact", contactPoint);
      return this;
    }
    /**
     * Contact details for further information relevant to this job posting.
     * @param contactPoint value to set
     * @return this builder instance
     */
    @NotNull public Builder applicationContact(@NotNull ContactPoint.Builder contactPoint) {
      putValue("applicationContact", contactPoint.build());
      return this;
    }
    /**
     * Remove applicationContact property from the builder.
     * If this property is repeatable, all instances are removed.
     * @return this builder instance
     */
    @NotNull public Builder removeApplicationContact() {
      removeValue("applicationContact");
      return this;
    }
    /**
     * Get currently set value for applicationContact property in this builder.
     * @return previously set value or {@code null}. If multiple values have been 
     * set to this property, then {@link java.util.Collection} instance will be 
     * returned.
     */
    @Nullable public java.lang.Object getApplicationContact() {
      return myData.get("applicationContact");
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
     * Indicates whether an [[url]] that is associated with a [[JobPosting]] enables direct application for the job, via the posting website. A job posting is considered to have directApply of [[True]] if an application process for the specified job can be directly initiated via the url(s) given (noting that e.g. multiple internet domains might nevertheless be involved at an implementation level). A value of [[False]] is appropriate if there is no clear path to applying directly online for the specified job, navigating directly from the JobPosting url(s) supplied.
     * @param directApply value to set
     * @return this builder instance
     */
    @NotNull public Builder directApply(@NotNull Boolean directApply) {
      putValue("directApply", directApply);
      return this;
    }
    /**
     * Remove directApply property from the builder.
     * If this property is repeatable, all instances are removed.
     * @return this builder instance
     */
    @NotNull public Builder removeDirectApply() {
      removeValue("directApply");
      return this;
    }
    /**
     * Get currently set value for directApply property in this builder.
     * @return previously set value or {@code null}. If multiple values have been 
     * set to this property, then {@link java.util.Collection} instance will be 
     * returned.
     */
    @Nullable public java.lang.Object getDirectApply() {
      return myData.get("directApply");
    }
    /**
     * A description of the job location (e.g TELECOMMUTE for telecommute jobs).
     * @param jobLocationType value to set
     * @return this builder instance
     */
    @NotNull public Builder jobLocationType(@NotNull String jobLocationType) {
      putValue("jobLocationType", jobLocationType);
      return this;
    }
    /**
     * Remove jobLocationType property from the builder.
     * If this property is repeatable, all instances are removed.
     * @return this builder instance
     */
    @NotNull public Builder removeJobLocationType() {
      removeValue("jobLocationType");
      return this;
    }
    /**
     * Get currently set value for jobLocationType property in this builder.
     * @return previously set value or {@code null}. If multiple values have been 
     * set to this property, then {@link java.util.Collection} instance will be 
     * returned.
     */
    @Nullable public java.lang.Object getJobLocationType() {
      return myData.get("jobLocationType");
    }
    /**
     * The location(s) applicants can apply from. This is usually used for telecommuting jobs where the applicant does not need to be in a physical office. Note: This should not be used for citizenship or work visa requirements.
     * @param administrativeArea value to set
     * @return this builder instance
     */
    @NotNull public Builder applicantLocationRequirements(@NotNull AdministrativeArea administrativeArea) {
      putValue("applicantLocationRequirements", administrativeArea);
      return this;
    }
    /**
     * The location(s) applicants can apply from. This is usually used for telecommuting jobs where the applicant does not need to be in a physical office. Note: This should not be used for citizenship or work visa requirements.
     * @param administrativeArea value to set
     * @return this builder instance
     */
    @NotNull public Builder applicantLocationRequirements(@NotNull AdministrativeArea.Builder administrativeArea) {
      putValue("applicantLocationRequirements", administrativeArea.build());
      return this;
    }
    /**
     * Remove applicantLocationRequirements property from the builder.
     * If this property is repeatable, all instances are removed.
     * @return this builder instance
     */
    @NotNull public Builder removeApplicantLocationRequirements() {
      removeValue("applicantLocationRequirements");
      return this;
    }
    /**
     * Get currently set value for applicantLocationRequirements property in this builder.
     * @return previously set value or {@code null}. If multiple values have been 
     * set to this property, then {@link java.util.Collection} instance will be 
     * returned.
     */
    @Nullable public java.lang.Object getApplicantLocationRequirements() {
      return myData.get("applicantLocationRequirements");
    }
    /**
     * Description of bonus and commission compensation aspects of the job.
     * @param incentiveCompensation value to set
     * @return this builder instance
     */
    @NotNull public Builder incentiveCompensation(@NotNull String incentiveCompensation) {
      putValue("incentiveCompensation", incentiveCompensation);
      return this;
    }
    /**
     * Remove incentiveCompensation property from the builder.
     * If this property is repeatable, all instances are removed.
     * @return this builder instance
     */
    @NotNull public Builder removeIncentiveCompensation() {
      removeValue("incentiveCompensation");
      return this;
    }
    /**
     * Get currently set value for incentiveCompensation property in this builder.
     * @return previously set value or {@code null}. If multiple values have been 
     * set to this property, then {@link java.util.Collection} instance will be 
     * returned.
     */
    @Nullable public java.lang.Object getIncentiveCompensation() {
      return myData.get("incentiveCompensation");
    }
    /**
     * The industry associated with the job position.
     * @param definedTerm value to set
     * @return this builder instance
     */
    @NotNull public Builder industry(@NotNull DefinedTerm definedTerm) {
      putValue("industry", definedTerm);
      return this;
    }
    /**
     * The industry associated with the job position.
     * @param definedTerm value to set
     * @return this builder instance
     */
    @NotNull public Builder industry(@NotNull DefinedTerm.Builder definedTerm) {
      putValue("industry", definedTerm.build());
      return this;
    }
    /**
     * The industry associated with the job position.
     * @param industry value to set
     * @return this builder instance
     */
    @NotNull public Builder industry(@NotNull String industry) {
      putValue("industry", industry);
      return this;
    }
    /**
     * Remove industry property from the builder.
     * If this property is repeatable, all instances are removed.
     * @return this builder instance
     */
    @NotNull public Builder removeIndustry() {
      removeValue("industry");
      return this;
    }
    /**
     * Get currently set value for industry property in this builder.
     * @return previously set value or {@code null}. If multiple values have been 
     * set to this property, then {@link java.util.Collection} instance will be 
     * returned.
     */
    @Nullable public java.lang.Object getIndustry() {
      return myData.get("industry");
    }
    /**
     * Indicates the department, unit and/or facility where the employee reports and/or in which the job is to be performed.
     * @param organization value to set
     * @return this builder instance
     */
    @NotNull public Builder employmentUnit(@NotNull Organization organization) {
      putValue("employmentUnit", organization);
      return this;
    }
    /**
     * Indicates the department, unit and/or facility where the employee reports and/or in which the job is to be performed.
     * @param organization value to set
     * @return this builder instance
     */
    @NotNull public Builder employmentUnit(@NotNull Organization.Builder organization) {
      putValue("employmentUnit", organization.build());
      return this;
    }
    /**
     * Remove employmentUnit property from the builder.
     * If this property is repeatable, all instances are removed.
     * @return this builder instance
     */
    @NotNull public Builder removeEmploymentUnit() {
      removeValue("employmentUnit");
      return this;
    }
    /**
     * Get currently set value for employmentUnit property in this builder.
     * @return previously set value or {@code null}. If multiple values have been 
     * set to this property, then {@link java.util.Collection} instance will be 
     * returned.
     */
    @Nullable public java.lang.Object getEmploymentUnit() {
      return myData.get("employmentUnit");
    }
    /**
     * Organization offering the job position.
     * @param organization value to set
     * @return this builder instance
     */
    @NotNull public Builder hiringOrganization(@NotNull Organization organization) {
      putValue("hiringOrganization", organization);
      return this;
    }
    /**
     * Organization offering the job position.
     * @param organization value to set
     * @return this builder instance
     */
    @NotNull public Builder hiringOrganization(@NotNull Organization.Builder organization) {
      putValue("hiringOrganization", organization.build());
      return this;
    }
    /**
     * Remove hiringOrganization property from the builder.
     * If this property is repeatable, all instances are removed.
     * @return this builder instance
     */
    @NotNull public Builder removeHiringOrganization() {
      removeValue("hiringOrganization");
      return this;
    }
    /**
     * Get currently set value for hiringOrganization property in this builder.
     * @return previously set value or {@code null}. If multiple values have been 
     * set to this property, then {@link java.util.Collection} instance will be 
     * returned.
     */
    @Nullable public java.lang.Object getHiringOrganization() {
      return myData.get("hiringOrganization");
    }
    /**
     * A description of the types of physical activity associated with the job. Defined terms such as those in O*net may be used, but note that there is no way to specify the level of ability as well as its nature when using a defined term.
     * @param definedTerm value to set
     * @return this builder instance
     */
    @NotNull public Builder physicalRequirement(@NotNull DefinedTerm definedTerm) {
      putValue("physicalRequirement", definedTerm);
      return this;
    }
    /**
     * A description of the types of physical activity associated with the job. Defined terms such as those in O*net may be used, but note that there is no way to specify the level of ability as well as its nature when using a defined term.
     * @param definedTerm value to set
     * @return this builder instance
     */
    @NotNull public Builder physicalRequirement(@NotNull DefinedTerm.Builder definedTerm) {
      putValue("physicalRequirement", definedTerm.build());
      return this;
    }
    /**
     * A description of the types of physical activity associated with the job. Defined terms such as those in O*net may be used, but note that there is no way to specify the level of ability as well as its nature when using a defined term.
     * @param physicalRequirement value to set
     * @return this builder instance
     */
    @NotNull public Builder physicalRequirement(@NotNull String physicalRequirement) {
      putValue("physicalRequirement", physicalRequirement);
      return this;
    }
    /**
     * Remove physicalRequirement property from the builder.
     * If this property is repeatable, all instances are removed.
     * @return this builder instance
     */
    @NotNull public Builder removePhysicalRequirement() {
      removeValue("physicalRequirement");
      return this;
    }
    /**
     * Get currently set value for physicalRequirement property in this builder.
     * @return previously set value or {@code null}. If multiple values have been 
     * set to this property, then {@link java.util.Collection} instance will be 
     * returned.
     */
    @Nullable public java.lang.Object getPhysicalRequirement() {
      return myData.get("physicalRequirement");
    }
    /**
     * A description of any security clearance requirements of the job.
     * @param securityClearanceRequirement value to set
     * @return this builder instance
     */
    @NotNull public Builder securityClearanceRequirement(@NotNull String securityClearanceRequirement) {
      putValue("securityClearanceRequirement", securityClearanceRequirement);
      return this;
    }
    /**
     * Remove securityClearanceRequirement property from the builder.
     * If this property is repeatable, all instances are removed.
     * @return this builder instance
     */
    @NotNull public Builder removeSecurityClearanceRequirement() {
      removeValue("securityClearanceRequirement");
      return this;
    }
    /**
     * Get currently set value for securityClearanceRequirement property in this builder.
     * @return previously set value or {@code null}. If multiple values have been 
     * set to this property, then {@link java.util.Collection} instance will be 
     * returned.
     */
    @Nullable public java.lang.Object getSecurityClearanceRequirement() {
      return myData.get("securityClearanceRequirement");
    }
    /**
     * The date after when the item is not valid. For example the end of an offer, salary period, or a period of opening hours.
     * @param date value to set
     * @return this builder instance
     */
    @NotNull public Builder validThrough(@NotNull java.util.Date date) {
      putValue("validThrough", date);
      return this;
    }
    /**
     * Remove validThrough property from the builder.
     * If this property is repeatable, all instances are removed.
     * @return this builder instance
     */
    @NotNull public Builder removeValidThrough() {
      removeValue("validThrough");
      return this;
    }
    /**
     * Get currently set value for validThrough property in this builder.
     * @return previously set value or {@code null}. If multiple values have been 
     * set to this property, then {@link java.util.Collection} instance will be 
     * returned.
     */
    @Nullable public java.lang.Object getValidThrough() {
      return myData.get("validThrough");
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
     * Indicates whether a [[JobPosting]] will accept experience (as indicated by [[OccupationalExperienceRequirements]]) in place of its formal educational qualifications (as indicated by [[educationRequirements]]). If true, indicates that satisfying one of these requirements is sufficient.
     * @param experienceInPlaceOfEducation value to set
     * @return this builder instance
     */
    @NotNull public Builder experienceInPlaceOfEducation(@NotNull Boolean experienceInPlaceOfEducation) {
      putValue("experienceInPlaceOfEducation", experienceInPlaceOfEducation);
      return this;
    }
    /**
     * Remove experienceInPlaceOfEducation property from the builder.
     * If this property is repeatable, all instances are removed.
     * @return this builder instance
     */
    @NotNull public Builder removeExperienceInPlaceOfEducation() {
      removeValue("experienceInPlaceOfEducation");
      return this;
    }
    /**
     * Get currently set value for experienceInPlaceOfEducation property in this builder.
     * @return previously set value or {@code null}. If multiple values have been 
     * set to this property, then {@link java.util.Collection} instance will be 
     * returned.
     */
    @Nullable public java.lang.Object getExperienceInPlaceOfEducation() {
      return myData.get("experienceInPlaceOfEducation");
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
     * The title of the job.
     * @param title value to set
     * @return this builder instance
     */
    @NotNull public Builder title(@NotNull String title) {
      putValue("title", title);
      return this;
    }
    /**
     * Remove title property from the builder.
     * If this property is repeatable, all instances are removed.
     * @return this builder instance
     */
    @NotNull public Builder removeTitle() {
      removeValue("title");
      return this;
    }
    /**
     * Get currently set value for title property in this builder.
     * @return previously set value or {@code null}. If multiple values have been 
     * set to this property, then {@link java.util.Collection} instance will be 
     * returned.
     */
    @Nullable public java.lang.Object getTitle() {
      return myData.get("title");
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
     * Type of employment (e.g. full-time, part-time, contract, temporary, seasonal, internship).
     * @param employmentType value to set
     * @return this builder instance
     */
    @NotNull public Builder employmentType(@NotNull String employmentType) {
      putValue("employmentType", employmentType);
      return this;
    }
    /**
     * Remove employmentType property from the builder.
     * If this property is repeatable, all instances are removed.
     * @return this builder instance
     */
    @NotNull public Builder removeEmploymentType() {
      removeValue("employmentType");
      return this;
    }
    /**
     * Get currently set value for employmentType property in this builder.
     * @return previously set value or {@code null}. If multiple values have been 
     * set to this property, then {@link java.util.Collection} instance will be 
     * returned.
     */
    @Nullable public java.lang.Object getEmploymentType() {
      return myData.get("employmentType");
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
     * The Occupation for the JobPosting.
     * @param occupation value to set
     * @return this builder instance
     */
    @NotNull public Builder relevantOccupation(@NotNull Occupation occupation) {
      putValue("relevantOccupation", occupation);
      return this;
    }
    /**
     * The Occupation for the JobPosting.
     * @param occupation value to set
     * @return this builder instance
     */
    @NotNull public Builder relevantOccupation(@NotNull Occupation.Builder occupation) {
      putValue("relevantOccupation", occupation.build());
      return this;
    }
    /**
     * Remove relevantOccupation property from the builder.
     * If this property is repeatable, all instances are removed.
     * @return this builder instance
     */
    @NotNull public Builder removeRelevantOccupation() {
      removeValue("relevantOccupation");
      return this;
    }
    /**
     * Get currently set value for relevantOccupation property in this builder.
     * @return previously set value or {@code null}. If multiple values have been 
     * set to this property, then {@link java.util.Collection} instance will be 
     * returned.
     */
    @Nullable public java.lang.Object getRelevantOccupation() {
      return myData.get("relevantOccupation");
    }
    /**
     * Description of benefits associated with the job.
     * @param jobBenefits value to set
     * @return this builder instance
     */
    @NotNull public Builder jobBenefits(@NotNull String jobBenefits) {
      putValue("jobBenefits", jobBenefits);
      return this;
    }
    /**
     * Remove jobBenefits property from the builder.
     * If this property is repeatable, all instances are removed.
     * @return this builder instance
     */
    @NotNull public Builder removeJobBenefits() {
      removeValue("jobBenefits");
      return this;
    }
    /**
     * Get currently set value for jobBenefits property in this builder.
     * @return previously set value or {@code null}. If multiple values have been 
     * set to this property, then {@link java.util.Collection} instance will be 
     * returned.
     */
    @Nullable public java.lang.Object getJobBenefits() {
      return myData.get("jobBenefits");
    }
    /**
     * The date on which a successful applicant for this job would be expected to start work. Choose a specific date in the future or use the jobImmediateStart property to indicate the position is to be filled as soon as possible.
     * @param jobStartDate value to set
     * @return this builder instance
     */
    @NotNull public Builder jobStartDate(@NotNull String jobStartDate) {
      putValue("jobStartDate", jobStartDate);
      return this;
    }
    /**
     * The date on which a successful applicant for this job would be expected to start work. Choose a specific date in the future or use the jobImmediateStart property to indicate the position is to be filled as soon as possible.
     * @param date value to set
     * @return this builder instance
     */
    @NotNull public Builder jobStartDate(@NotNull java.util.Date date) {
      putValue("jobStartDate", date);
      return this;
    }
    /**
     * Remove jobStartDate property from the builder.
     * If this property is repeatable, all instances are removed.
     * @return this builder instance
     */
    @NotNull public Builder removeJobStartDate() {
      removeValue("jobStartDate");
      return this;
    }
    /**
     * Get currently set value for jobStartDate property in this builder.
     * @return previously set value or {@code null}. If multiple values have been 
     * set to this property, then {@link java.util.Collection} instance will be 
     * returned.
     */
    @Nullable public java.lang.Object getJobStartDate() {
      return myData.get("jobStartDate");
    }
    /**
     * The number of positions open for this job posting. Use a positive integer. Do not use if the number of positions is unclear or not known.
     * @param integer value to set
     * @return this builder instance
     */
    @NotNull public Builder totalJobOpenings(@NotNull Integer integer) {
      putValue("totalJobOpenings", integer);
      return this;
    }
    /**
     * Remove totalJobOpenings property from the builder.
     * If this property is repeatable, all instances are removed.
     * @return this builder instance
     */
    @NotNull public Builder removeTotalJobOpenings() {
      removeValue("totalJobOpenings");
      return this;
    }
    /**
     * Get currently set value for totalJobOpenings property in this builder.
     * @return previously set value or {@code null}. If multiple values have been 
     * set to this property, then {@link java.util.Collection} instance will be 
     * returned.
     */
    @Nullable public java.lang.Object getTotalJobOpenings() {
      return myData.get("totalJobOpenings");
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
      if ("employerOverview".equals(key) && value instanceof String) { this.employerOverview((String)value); return; }
      if ("employerOverviews".equals(key) && value instanceof String) { this.employerOverview((String)value); return; }
      if ("workHours".equals(key) && value instanceof String) { this.workHours((String)value); return; }
      if ("workHourss".equals(key) && value instanceof String) { this.workHours((String)value); return; }
      if ("sensoryRequirement".equals(key) && value instanceof DefinedTerm) { this.sensoryRequirement((DefinedTerm)value); return; }
      if ("sensoryRequirements".equals(key) && value instanceof DefinedTerm) { this.sensoryRequirement((DefinedTerm)value); return; }
      if ("sensoryRequirement".equals(key) && value instanceof String) { this.sensoryRequirement((String)value); return; }
      if ("sensoryRequirements".equals(key) && value instanceof String) { this.sensoryRequirement((String)value); return; }
      if ("skills".equals(key) && value instanceof DefinedTerm) { this.skills((DefinedTerm)value); return; }
      if ("skillss".equals(key) && value instanceof DefinedTerm) { this.skills((DefinedTerm)value); return; }
      if ("skills".equals(key) && value instanceof String) { this.skills((String)value); return; }
      if ("skillss".equals(key) && value instanceof String) { this.skills((String)value); return; }
      if ("eligibilityToWorkRequirement".equals(key) && value instanceof String) { this.eligibilityToWorkRequirement((String)value); return; }
      if ("eligibilityToWorkRequirements".equals(key) && value instanceof String) { this.eligibilityToWorkRequirement((String)value); return; }
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
      if ("jobImmediateStart".equals(key) && value instanceof Boolean) { this.jobImmediateStart((Boolean)value); return; }
      if ("jobImmediateStarts".equals(key) && value instanceof Boolean) { this.jobImmediateStart((Boolean)value); return; }
      if ("salaryCurrency".equals(key) && value instanceof String) { this.salaryCurrency((String)value); return; }
      if ("salaryCurrencys".equals(key) && value instanceof String) { this.salaryCurrency((String)value); return; }
      if ("jobLocation".equals(key) && value instanceof Place) { this.jobLocation((Place)value); return; }
      if ("jobLocations".equals(key) && value instanceof Place) { this.jobLocation((Place)value); return; }
      if ("datePosted".equals(key) && value instanceof java.util.Date) { this.datePosted((java.util.Date)value); return; }
      if ("datePosteds".equals(key) && value instanceof java.util.Date) { this.datePosted((java.util.Date)value); return; }
      if ("specialCommitments".equals(key) && value instanceof String) { this.specialCommitments((String)value); return; }
      if ("specialCommitmentss".equals(key) && value instanceof String) { this.specialCommitments((String)value); return; }
      if ("applicationContact".equals(key) && value instanceof ContactPoint) { this.applicationContact((ContactPoint)value); return; }
      if ("applicationContacts".equals(key) && value instanceof ContactPoint) { this.applicationContact((ContactPoint)value); return; }
      if ("experienceRequirements".equals(key) && value instanceof OccupationalExperienceRequirements) { this.experienceRequirements((OccupationalExperienceRequirements)value); return; }
      if ("experienceRequirementss".equals(key) && value instanceof OccupationalExperienceRequirements) { this.experienceRequirements((OccupationalExperienceRequirements)value); return; }
      if ("experienceRequirements".equals(key) && value instanceof String) { this.experienceRequirements((String)value); return; }
      if ("experienceRequirementss".equals(key) && value instanceof String) { this.experienceRequirements((String)value); return; }
      if ("directApply".equals(key) && value instanceof Boolean) { this.directApply((Boolean)value); return; }
      if ("directApplys".equals(key) && value instanceof Boolean) { this.directApply((Boolean)value); return; }
      if ("jobLocationType".equals(key) && value instanceof String) { this.jobLocationType((String)value); return; }
      if ("jobLocationTypes".equals(key) && value instanceof String) { this.jobLocationType((String)value); return; }
      if ("applicantLocationRequirements".equals(key) && value instanceof AdministrativeArea) { this.applicantLocationRequirements((AdministrativeArea)value); return; }
      if ("applicantLocationRequirementss".equals(key) && value instanceof AdministrativeArea) { this.applicantLocationRequirements((AdministrativeArea)value); return; }
      if ("incentiveCompensation".equals(key) && value instanceof String) { this.incentiveCompensation((String)value); return; }
      if ("incentiveCompensations".equals(key) && value instanceof String) { this.incentiveCompensation((String)value); return; }
      if ("industry".equals(key) && value instanceof DefinedTerm) { this.industry((DefinedTerm)value); return; }
      if ("industrys".equals(key) && value instanceof DefinedTerm) { this.industry((DefinedTerm)value); return; }
      if ("industry".equals(key) && value instanceof String) { this.industry((String)value); return; }
      if ("industrys".equals(key) && value instanceof String) { this.industry((String)value); return; }
      if ("employmentUnit".equals(key) && value instanceof Organization) { this.employmentUnit((Organization)value); return; }
      if ("employmentUnits".equals(key) && value instanceof Organization) { this.employmentUnit((Organization)value); return; }
      if ("hiringOrganization".equals(key) && value instanceof Organization) { this.hiringOrganization((Organization)value); return; }
      if ("hiringOrganizations".equals(key) && value instanceof Organization) { this.hiringOrganization((Organization)value); return; }
      if ("physicalRequirement".equals(key) && value instanceof DefinedTerm) { this.physicalRequirement((DefinedTerm)value); return; }
      if ("physicalRequirements".equals(key) && value instanceof DefinedTerm) { this.physicalRequirement((DefinedTerm)value); return; }
      if ("physicalRequirement".equals(key) && value instanceof String) { this.physicalRequirement((String)value); return; }
      if ("physicalRequirements".equals(key) && value instanceof String) { this.physicalRequirement((String)value); return; }
      if ("securityClearanceRequirement".equals(key) && value instanceof String) { this.securityClearanceRequirement((String)value); return; }
      if ("securityClearanceRequirements".equals(key) && value instanceof String) { this.securityClearanceRequirement((String)value); return; }
      if ("validThrough".equals(key) && value instanceof java.util.Date) { this.validThrough((java.util.Date)value); return; }
      if ("validThroughs".equals(key) && value instanceof java.util.Date) { this.validThrough((java.util.Date)value); return; }
      if ("educationRequirements".equals(key) && value instanceof EducationalOccupationalCredential) { this.educationRequirements((EducationalOccupationalCredential)value); return; }
      if ("educationRequirementss".equals(key) && value instanceof EducationalOccupationalCredential) { this.educationRequirements((EducationalOccupationalCredential)value); return; }
      if ("educationRequirements".equals(key) && value instanceof String) { this.educationRequirements((String)value); return; }
      if ("educationRequirementss".equals(key) && value instanceof String) { this.educationRequirements((String)value); return; }
      if ("experienceInPlaceOfEducation".equals(key) && value instanceof Boolean) { this.experienceInPlaceOfEducation((Boolean)value); return; }
      if ("experienceInPlaceOfEducations".equals(key) && value instanceof Boolean) { this.experienceInPlaceOfEducation((Boolean)value); return; }
      if ("responsibilities".equals(key) && value instanceof String) { this.responsibilities((String)value); return; }
      if ("responsibilitiess".equals(key) && value instanceof String) { this.responsibilities((String)value); return; }
      if ("title".equals(key) && value instanceof String) { this.title((String)value); return; }
      if ("titles".equals(key) && value instanceof String) { this.title((String)value); return; }
      if ("qualifications".equals(key) && value instanceof EducationalOccupationalCredential) { this.qualifications((EducationalOccupationalCredential)value); return; }
      if ("qualificationss".equals(key) && value instanceof EducationalOccupationalCredential) { this.qualifications((EducationalOccupationalCredential)value); return; }
      if ("qualifications".equals(key) && value instanceof String) { this.qualifications((String)value); return; }
      if ("qualificationss".equals(key) && value instanceof String) { this.qualifications((String)value); return; }
      if ("employmentType".equals(key) && value instanceof String) { this.employmentType((String)value); return; }
      if ("employmentTypes".equals(key) && value instanceof String) { this.employmentType((String)value); return; }
      if ("baseSalary".equals(key) && value instanceof MonetaryAmount) { this.baseSalary((MonetaryAmount)value); return; }
      if ("baseSalarys".equals(key) && value instanceof MonetaryAmount) { this.baseSalary((MonetaryAmount)value); return; }
      if ("baseSalary".equals(key) && value instanceof Number) { this.baseSalary((Number)value); return; }
      if ("baseSalarys".equals(key) && value instanceof Number) { this.baseSalary((Number)value); return; }
      if ("baseSalary".equals(key) && value instanceof PriceSpecification) { this.baseSalary((PriceSpecification)value); return; }
      if ("baseSalarys".equals(key) && value instanceof PriceSpecification) { this.baseSalary((PriceSpecification)value); return; }
      if ("relevantOccupation".equals(key) && value instanceof Occupation) { this.relevantOccupation((Occupation)value); return; }
      if ("relevantOccupations".equals(key) && value instanceof Occupation) { this.relevantOccupation((Occupation)value); return; }
      if ("jobBenefits".equals(key) && value instanceof String) { this.jobBenefits((String)value); return; }
      if ("jobBenefitss".equals(key) && value instanceof String) { this.jobBenefits((String)value); return; }
      if ("jobStartDate".equals(key) && value instanceof String) { this.jobStartDate((String)value); return; }
      if ("jobStartDates".equals(key) && value instanceof String) { this.jobStartDate((String)value); return; }
      if ("jobStartDate".equals(key) && value instanceof java.util.Date) { this.jobStartDate((java.util.Date)value); return; }
      if ("jobStartDates".equals(key) && value instanceof java.util.Date) { this.jobStartDate((java.util.Date)value); return; }
      if ("totalJobOpenings".equals(key) && value instanceof Integer) { this.totalJobOpenings((Integer)value); return; }
      if ("totalJobOpeningss".equals(key) && value instanceof Integer) { this.totalJobOpenings((Integer)value); return; }
      super.fromMap(key, value);
    }
  }
  
}
