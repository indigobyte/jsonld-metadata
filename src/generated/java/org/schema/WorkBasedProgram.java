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
 * A program with both an educational and employment component. Typically based at a workplace and structured around work-based learning, with the aim of instilling competencies related to an occupation. WorkBasedProgram is used to distinguish programs such as apprenticeships from school, college or other classroom based educational programs.
 */
public class WorkBasedProgram extends EducationalOccupationalProgram {
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
   * The estimated salary earned while in the program.
   * @return trainingSalary property set by first invocation of trainingSalary method or {@code null}.
   */
  @JsonIgnore public MonetaryAmountDistribution getTrainingSalary() {
    return (MonetaryAmountDistribution) getValue("trainingSalary");
  }
  /**
   * The estimated salary earned while in the program.
   * @return all trainingSalary properties as {@link java.util.Collection} or an empty collection 
   * if trainingSalary was not set.
   */
  @JsonIgnore public java.util.Collection<MonetaryAmountDistribution> getTrainingSalarys() {
    final java.lang.Object current = myData.get("trainingSalary");
    if (current == null) return Collections.emptyList();
    if (current instanceof java.util.Collection) {
      return (java.util.Collection<MonetaryAmountDistribution>) current;
    }
    return Arrays.asList((MonetaryAmountDistribution) current);
  }
  protected WorkBasedProgram(java.util.Map<String,java.lang.Object> data) {
    super(data);
  }
  /**
   * @return new {@link Builder} initialized with this instance's data
   */
  @NotNull public Builder toBuilder() {
    return new Builder(new HashMap<>(this.myData));
  }
  
  /**
   * Builder for {@link WorkBasedProgram}
   */
  public static class Builder extends EducationalOccupationalProgram.Builder {
    public Builder(@NotNull HashMap<String,java.lang.Object> data) {
      super(data);
    }
    @NotNull public WorkBasedProgram build() {
      return new WorkBasedProgram(myData);
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
     * The estimated salary earned while in the program.
     * @param monetaryAmountDistribution value to set
     * @return this builder instance
     */
    @NotNull public Builder trainingSalary(@NotNull MonetaryAmountDistribution monetaryAmountDistribution) {
      putValue("trainingSalary", monetaryAmountDistribution);
      return this;
    }
    /**
     * The estimated salary earned while in the program.
     * @param monetaryAmountDistribution value to set
     * @return this builder instance
     */
    @NotNull public Builder trainingSalary(@NotNull MonetaryAmountDistribution.Builder monetaryAmountDistribution) {
      putValue("trainingSalary", monetaryAmountDistribution.build());
      return this;
    }
    /**
     * Remove trainingSalary property from the builder.
     * If this property is repeatable, all instances are removed.
     * @return this builder instance
     */
    @NotNull public Builder removeTrainingSalary() {
      removeValue("trainingSalary");
      return this;
    }
    /**
     * Get currently set value for trainingSalary property in this builder.
     * @return previously set value or {@code null}. If multiple values have been 
     * set to this property, then {@link java.util.Collection} instance will be 
     * returned.
     */
    @Nullable public java.lang.Object getTrainingSalary() {
      return myData.get("trainingSalary");
    }
    /**
     * The number of credits or units awarded by a Course or required to complete an EducationalOccupationalProgram.
     * @param integer value to set
     * @return this builder instance
     */
    @NotNull public Builder numberOfCredits(@NotNull Integer integer) {
      putValue("numberOfCredits", integer);
      return this;
    }
    /**
     * The number of credits or units awarded by a Course or required to complete an EducationalOccupationalProgram.
     * @param structuredValue value to set
     * @return this builder instance
     */
    @NotNull public Builder numberOfCredits(@NotNull StructuredValue structuredValue) {
      putValue("numberOfCredits", structuredValue);
      return this;
    }
    /**
     * The number of credits or units awarded by a Course or required to complete an EducationalOccupationalProgram.
     * @param structuredValue value to set
     * @return this builder instance
     */
    @NotNull public Builder numberOfCredits(@NotNull StructuredValue.Builder structuredValue) {
      putValue("numberOfCredits", structuredValue.build());
      return this;
    }
    /**
     * Remove numberOfCredits property from the builder.
     * If this property is repeatable, all instances are removed.
     * @return this builder instance
     */
    @NotNull public Builder removeNumberOfCredits() {
      removeValue("numberOfCredits");
      return this;
    }
    /**
     * Get currently set value for numberOfCredits property in this builder.
     * @return previously set value or {@code null}. If multiple values have been 
     * set to this property, then {@link java.util.Collection} instance will be 
     * returned.
     */
    @Nullable public java.lang.Object getNumberOfCredits() {
      return myData.get("numberOfCredits");
    }
    /**
     * The time of day the program normally runs. For example, &quot;evenings&quot;.
     * @param timeOfDay value to set
     * @return this builder instance
     */
    @NotNull public Builder timeOfDay(@NotNull String timeOfDay) {
      putValue("timeOfDay", timeOfDay);
      return this;
    }
    /**
     * Remove timeOfDay property from the builder.
     * If this property is repeatable, all instances are removed.
     * @return this builder instance
     */
    @NotNull public Builder removeTimeOfDay() {
      removeValue("timeOfDay");
      return this;
    }
    /**
     * Get currently set value for timeOfDay property in this builder.
     * @return previously set value or {@code null}. If multiple values have been 
     * set to this property, then {@link java.util.Collection} instance will be 
     * returned.
     */
    @Nullable public java.lang.Object getTimeOfDay() {
      return myData.get("timeOfDay");
    }
    /**
     * The number of credits or units a full-time student would be expected to take in 1 term however 'term' is defined by the institution.
     * @param integer value to set
     * @return this builder instance
     */
    @NotNull public Builder typicalCreditsPerTerm(@NotNull Integer integer) {
      putValue("typicalCreditsPerTerm", integer);
      return this;
    }
    /**
     * The number of credits or units a full-time student would be expected to take in 1 term however 'term' is defined by the institution.
     * @param structuredValue value to set
     * @return this builder instance
     */
    @NotNull public Builder typicalCreditsPerTerm(@NotNull StructuredValue structuredValue) {
      putValue("typicalCreditsPerTerm", structuredValue);
      return this;
    }
    /**
     * The number of credits or units a full-time student would be expected to take in 1 term however 'term' is defined by the institution.
     * @param structuredValue value to set
     * @return this builder instance
     */
    @NotNull public Builder typicalCreditsPerTerm(@NotNull StructuredValue.Builder structuredValue) {
      putValue("typicalCreditsPerTerm", structuredValue.build());
      return this;
    }
    /**
     * Remove typicalCreditsPerTerm property from the builder.
     * If this property is repeatable, all instances are removed.
     * @return this builder instance
     */
    @NotNull public Builder removeTypicalCreditsPerTerm() {
      removeValue("typicalCreditsPerTerm");
      return this;
    }
    /**
     * Get currently set value for typicalCreditsPerTerm property in this builder.
     * @return previously set value or {@code null}. If multiple values have been 
     * set to this property, then {@link java.util.Collection} instance will be 
     * returned.
     */
    @Nullable public java.lang.Object getTypicalCreditsPerTerm() {
      return myData.get("typicalCreditsPerTerm");
    }
    /**
     * The expected length of time to complete the program if attending full-time.
     * @param duration value to set
     * @return this builder instance
     */
    @NotNull public Builder timeToComplete(@NotNull Duration duration) {
      putValue("timeToComplete", duration);
      return this;
    }
    /**
     * Remove timeToComplete property from the builder.
     * If this property is repeatable, all instances are removed.
     * @return this builder instance
     */
    @NotNull public Builder removeTimeToComplete() {
      removeValue("timeToComplete");
      return this;
    }
    /**
     * Get currently set value for timeToComplete property in this builder.
     * @return previously set value or {@code null}. If multiple values have been 
     * set to this property, then {@link java.util.Collection} instance will be 
     * returned.
     */
    @Nullable public java.lang.Object getTimeToComplete() {
      return myData.get("timeToComplete");
    }
    /**
     * The service provider, service operator, or service performer; the goods producer. Another party (a seller) may offer those services or goods on behalf of the provider. A provider may also serve as the seller.
     * @param organization value to set
     * @return this builder instance
     */
    @NotNull public Builder provider(@NotNull Organization organization) {
      putValue("provider", organization);
      return this;
    }
    /**
     * The service provider, service operator, or service performer; the goods producer. Another party (a seller) may offer those services or goods on behalf of the provider. A provider may also serve as the seller.
     * @param organization value to set
     * @return this builder instance
     */
    @NotNull public Builder provider(@NotNull Organization.Builder organization) {
      putValue("provider", organization.build());
      return this;
    }
    /**
     * The service provider, service operator, or service performer; the goods producer. Another party (a seller) may offer those services or goods on behalf of the provider. A provider may also serve as the seller.
     * @param person value to set
     * @return this builder instance
     */
    @NotNull public Builder provider(@NotNull Person person) {
      putValue("provider", person);
      return this;
    }
    /**
     * The service provider, service operator, or service performer; the goods producer. Another party (a seller) may offer those services or goods on behalf of the provider. A provider may also serve as the seller.
     * @param person value to set
     * @return this builder instance
     */
    @NotNull public Builder provider(@NotNull Person.Builder person) {
      putValue("provider", person.build());
      return this;
    }
    /**
     * Remove provider property from the builder.
     * If this property is repeatable, all instances are removed.
     * @return this builder instance
     */
    @NotNull public Builder removeProvider() {
      removeValue("provider");
      return this;
    }
    /**
     * Get currently set value for provider property in this builder.
     * @return previously set value or {@code null}. If multiple values have been 
     * set to this property, then {@link java.util.Collection} instance will be 
     * returned.
     */
    @Nullable public java.lang.Object getProvider() {
      return myData.get("provider");
    }
    /**
     * A financial aid type or program which students may use to pay for tuition or fees associated with the program.
     * @param definedTerm value to set
     * @return this builder instance
     */
    @NotNull public Builder financialAidEligible(@NotNull DefinedTerm definedTerm) {
      putValue("financialAidEligible", definedTerm);
      return this;
    }
    /**
     * A financial aid type or program which students may use to pay for tuition or fees associated with the program.
     * @param definedTerm value to set
     * @return this builder instance
     */
    @NotNull public Builder financialAidEligible(@NotNull DefinedTerm.Builder definedTerm) {
      putValue("financialAidEligible", definedTerm.build());
      return this;
    }
    /**
     * A financial aid type or program which students may use to pay for tuition or fees associated with the program.
     * @param financialAidEligible value to set
     * @return this builder instance
     */
    @NotNull public Builder financialAidEligible(@NotNull String financialAidEligible) {
      putValue("financialAidEligible", financialAidEligible);
      return this;
    }
    /**
     * Remove financialAidEligible property from the builder.
     * If this property is repeatable, all instances are removed.
     * @return this builder instance
     */
    @NotNull public Builder removeFinancialAidEligible() {
      removeValue("financialAidEligible");
      return this;
    }
    /**
     * Get currently set value for financialAidEligible property in this builder.
     * @return previously set value or {@code null}. If multiple values have been 
     * set to this property, then {@link java.util.Collection} instance will be 
     * returned.
     */
    @Nullable public java.lang.Object getFinancialAidEligible() {
      return myData.get("financialAidEligible");
    }
    /**
     * A description of the qualification, award, certificate, diploma or other educational credential awarded as a consequence of successful completion of this course or program.
     * @param educationalOccupationalCredential value to set
     * @return this builder instance
     */
    @NotNull public Builder educationalCredentialAwarded(@NotNull EducationalOccupationalCredential educationalOccupationalCredential) {
      putValue("educationalCredentialAwarded", educationalOccupationalCredential);
      return this;
    }
    /**
     * A description of the qualification, award, certificate, diploma or other educational credential awarded as a consequence of successful completion of this course or program.
     * @param educationalOccupationalCredential value to set
     * @return this builder instance
     */
    @NotNull public Builder educationalCredentialAwarded(@NotNull EducationalOccupationalCredential.Builder educationalOccupationalCredential) {
      putValue("educationalCredentialAwarded", educationalOccupationalCredential.build());
      return this;
    }
    /**
     * A description of the qualification, award, certificate, diploma or other educational credential awarded as a consequence of successful completion of this course or program.
     * @param educationalCredentialAwarded value to set
     * @return this builder instance
     */
    @NotNull public Builder educationalCredentialAwarded(@NotNull String educationalCredentialAwarded) {
      putValue("educationalCredentialAwarded", educationalCredentialAwarded);
      return this;
    }
    /**
     * Remove educationalCredentialAwarded property from the builder.
     * If this property is repeatable, all instances are removed.
     * @return this builder instance
     */
    @NotNull public Builder removeEducationalCredentialAwarded() {
      removeValue("educationalCredentialAwarded");
      return this;
    }
    /**
     * Get currently set value for educationalCredentialAwarded property in this builder.
     * @return previously set value or {@code null}. If multiple values have been 
     * set to this property, then {@link java.util.Collection} instance will be 
     * returned.
     */
    @Nullable public java.lang.Object getEducationalCredentialAwarded() {
      return myData.get("educationalCredentialAwarded");
    }
    /**
     * Prerequisites for enrolling in the program.
     * @param alignmentObject value to set
     * @return this builder instance
     */
    @NotNull public Builder programPrerequisites(@NotNull AlignmentObject alignmentObject) {
      putValue("programPrerequisites", alignmentObject);
      return this;
    }
    /**
     * Prerequisites for enrolling in the program.
     * @param alignmentObject value to set
     * @return this builder instance
     */
    @NotNull public Builder programPrerequisites(@NotNull AlignmentObject.Builder alignmentObject) {
      putValue("programPrerequisites", alignmentObject.build());
      return this;
    }
    /**
     * Prerequisites for enrolling in the program.
     * @param course value to set
     * @return this builder instance
     */
    @NotNull public Builder programPrerequisites(@NotNull Course course) {
      putValue("programPrerequisites", course);
      return this;
    }
    /**
     * Prerequisites for enrolling in the program.
     * @param course value to set
     * @return this builder instance
     */
    @NotNull public Builder programPrerequisites(@NotNull Course.Builder course) {
      putValue("programPrerequisites", course.build());
      return this;
    }
    /**
     * Prerequisites for enrolling in the program.
     * @param educationalOccupationalCredential value to set
     * @return this builder instance
     */
    @NotNull public Builder programPrerequisites(@NotNull EducationalOccupationalCredential educationalOccupationalCredential) {
      putValue("programPrerequisites", educationalOccupationalCredential);
      return this;
    }
    /**
     * Prerequisites for enrolling in the program.
     * @param educationalOccupationalCredential value to set
     * @return this builder instance
     */
    @NotNull public Builder programPrerequisites(@NotNull EducationalOccupationalCredential.Builder educationalOccupationalCredential) {
      putValue("programPrerequisites", educationalOccupationalCredential.build());
      return this;
    }
    /**
     * Prerequisites for enrolling in the program.
     * @param programPrerequisites value to set
     * @return this builder instance
     */
    @NotNull public Builder programPrerequisites(@NotNull String programPrerequisites) {
      putValue("programPrerequisites", programPrerequisites);
      return this;
    }
    /**
     * Remove programPrerequisites property from the builder.
     * If this property is repeatable, all instances are removed.
     * @return this builder instance
     */
    @NotNull public Builder removeProgramPrerequisites() {
      removeValue("programPrerequisites");
      return this;
    }
    /**
     * Get currently set value for programPrerequisites property in this builder.
     * @return previously set value or {@code null}. If multiple values have been 
     * set to this property, then {@link java.util.Collection} instance will be 
     * returned.
     */
    @Nullable public java.lang.Object getProgramPrerequisites() {
      return myData.get("programPrerequisites");
    }
    /**
     * The type of educational or occupational program. For example, classroom, internship, alternance, etc..
     * @param definedTerm value to set
     * @return this builder instance
     */
    @NotNull public Builder programType(@NotNull DefinedTerm definedTerm) {
      putValue("programType", definedTerm);
      return this;
    }
    /**
     * The type of educational or occupational program. For example, classroom, internship, alternance, etc..
     * @param definedTerm value to set
     * @return this builder instance
     */
    @NotNull public Builder programType(@NotNull DefinedTerm.Builder definedTerm) {
      putValue("programType", definedTerm.build());
      return this;
    }
    /**
     * The type of educational or occupational program. For example, classroom, internship, alternance, etc..
     * @param programType value to set
     * @return this builder instance
     */
    @NotNull public Builder programType(@NotNull String programType) {
      putValue("programType", programType);
      return this;
    }
    /**
     * Remove programType property from the builder.
     * If this property is repeatable, all instances are removed.
     * @return this builder instance
     */
    @NotNull public Builder removeProgramType() {
      removeValue("programType");
      return this;
    }
    /**
     * Get currently set value for programType property in this builder.
     * @return previously set value or {@code null}. If multiple values have been 
     * set to this property, then {@link java.util.Collection} instance will be 
     * returned.
     */
    @Nullable public java.lang.Object getProgramType() {
      return myData.get("programType");
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
     * The expected salary upon completing the training.
     * @param monetaryAmountDistribution value to set
     * @return this builder instance
     */
    @NotNull public Builder salaryUponCompletion(@NotNull MonetaryAmountDistribution monetaryAmountDistribution) {
      putValue("salaryUponCompletion", monetaryAmountDistribution);
      return this;
    }
    /**
     * The expected salary upon completing the training.
     * @param monetaryAmountDistribution value to set
     * @return this builder instance
     */
    @NotNull public Builder salaryUponCompletion(@NotNull MonetaryAmountDistribution.Builder monetaryAmountDistribution) {
      putValue("salaryUponCompletion", monetaryAmountDistribution.build());
      return this;
    }
    /**
     * Remove salaryUponCompletion property from the builder.
     * If this property is repeatable, all instances are removed.
     * @return this builder instance
     */
    @NotNull public Builder removeSalaryUponCompletion() {
      removeValue("salaryUponCompletion");
      return this;
    }
    /**
     * Get currently set value for salaryUponCompletion property in this builder.
     * @return previously set value or {@code null}. If multiple values have been 
     * set to this property, then {@link java.util.Collection} instance will be 
     * returned.
     */
    @Nullable public java.lang.Object getSalaryUponCompletion() {
      return myData.get("salaryUponCompletion");
    }
    /**
     * Similar to courseMode, The medium or means of delivery of the program as a whole. The value may either be a text label (e.g. &quot;online&quot;, &quot;onsite&quot; or &quot;blended&quot;; &quot;synchronous&quot; or &quot;asynchronous&quot;; &quot;full-time&quot; or &quot;part-time&quot;) or a URL reference to a term from a controlled vocabulary (e.g. https://ceds.ed.gov/element/001311#Asynchronous ).
     * @param educationalProgramMode value to set
     * @return this builder instance
     */
    @NotNull public Builder educationalProgramMode(@NotNull String educationalProgramMode) {
      putValue("educationalProgramMode", educationalProgramMode);
      return this;
    }
    /**
     * Remove educationalProgramMode property from the builder.
     * If this property is repeatable, all instances are removed.
     * @return this builder instance
     */
    @NotNull public Builder removeEducationalProgramMode() {
      removeValue("educationalProgramMode");
      return this;
    }
    /**
     * Get currently set value for educationalProgramMode property in this builder.
     * @return previously set value or {@code null}. If multiple values have been 
     * set to this property, then {@link java.util.Collection} instance will be 
     * returned.
     */
    @Nullable public java.lang.Object getEducationalProgramMode() {
      return myData.get("educationalProgramMode");
    }
    /**
     * The date at which the program begins collecting applications for the next enrollment cycle.
     * @param date value to set
     * @return this builder instance
     */
    @NotNull public Builder applicationStartDate(@NotNull java.util.Date date) {
      putValue("applicationStartDate", date);
      return this;
    }
    /**
     * Remove applicationStartDate property from the builder.
     * If this property is repeatable, all instances are removed.
     * @return this builder instance
     */
    @NotNull public Builder removeApplicationStartDate() {
      removeValue("applicationStartDate");
      return this;
    }
    /**
     * Get currently set value for applicationStartDate property in this builder.
     * @return previously set value or {@code null}. If multiple values have been 
     * set to this property, then {@link java.util.Collection} instance will be 
     * returned.
     */
    @Nullable public java.lang.Object getApplicationStartDate() {
      return myData.get("applicationStartDate");
    }
    /**
     * The date at which the program stops collecting applications for the next enrollment cycle.
     * @param date value to set
     * @return this builder instance
     */
    @NotNull public Builder applicationDeadline(@NotNull java.util.Date date) {
      putValue("applicationDeadline", date);
      return this;
    }
    /**
     * Remove applicationDeadline property from the builder.
     * If this property is repeatable, all instances are removed.
     * @return this builder instance
     */
    @NotNull public Builder removeApplicationDeadline() {
      removeValue("applicationDeadline");
      return this;
    }
    /**
     * Get currently set value for applicationDeadline property in this builder.
     * @return previously set value or {@code null}. If multiple values have been 
     * set to this property, then {@link java.util.Collection} instance will be 
     * returned.
     */
    @Nullable public java.lang.Object getApplicationDeadline() {
      return myData.get("applicationDeadline");
    }
    /**
     * The maximum number of students who may be enrolled in the program.
     * @param integer value to set
     * @return this builder instance
     */
    @NotNull public Builder maximumEnrollment(@NotNull Integer integer) {
      putValue("maximumEnrollment", integer);
      return this;
    }
    /**
     * Remove maximumEnrollment property from the builder.
     * If this property is repeatable, all instances are removed.
     * @return this builder instance
     */
    @NotNull public Builder removeMaximumEnrollment() {
      removeValue("maximumEnrollment");
      return this;
    }
    /**
     * Get currently set value for maximumEnrollment property in this builder.
     * @return previously set value or {@code null}. If multiple values have been 
     * set to this property, then {@link java.util.Collection} instance will be 
     * returned.
     */
    @Nullable public java.lang.Object getMaximumEnrollment() {
      return myData.get("maximumEnrollment");
    }
    /**
     * The number of times terms of study are offered per year. Semesters and quarters are common units for term. For example, if the student can only take 2 semesters for the program in one year, then termsPerYear should be 2.
     * @param integer value to set
     * @return this builder instance
     */
    @NotNull public Builder termsPerYear(@NotNull Integer integer) {
      putValue("termsPerYear", integer);
      return this;
    }
    /**
     * The number of times terms of study are offered per year. Semesters and quarters are common units for term. For example, if the student can only take 2 semesters for the program in one year, then termsPerYear should be 2.
     * @param termsPerYear value to set
     * @return this builder instance
     */
    @NotNull public Builder termsPerYear(@NotNull Long termsPerYear) {
      putValue("termsPerYear", termsPerYear);
      return this;
    }
    /**
     * The number of times terms of study are offered per year. Semesters and quarters are common units for term. For example, if the student can only take 2 semesters for the program in one year, then termsPerYear should be 2.
     * @param termsPerYear value to set
     * @return this builder instance
     */
    @NotNull public Builder termsPerYear(@NotNull Float termsPerYear) {
      putValue("termsPerYear", termsPerYear);
      return this;
    }
    /**
     * The number of times terms of study are offered per year. Semesters and quarters are common units for term. For example, if the student can only take 2 semesters for the program in one year, then termsPerYear should be 2.
     * @param termsPerYear value to set
     * @return this builder instance
     */
    @NotNull public Builder termsPerYear(@NotNull Double termsPerYear) {
      putValue("termsPerYear", termsPerYear);
      return this;
    }
    /**
     * The number of times terms of study are offered per year. Semesters and quarters are common units for term. For example, if the student can only take 2 semesters for the program in one year, then termsPerYear should be 2.
     * @param termsPerYear value to set
     * @return this builder instance
     */
    @NotNull public Builder termsPerYear(@NotNull String termsPerYear) {
      putValue("termsPerYear", termsPerYear);
      return this;
    }
    /**
     * Remove termsPerYear property from the builder.
     * If this property is repeatable, all instances are removed.
     * @return this builder instance
     */
    @NotNull public Builder removeTermsPerYear() {
      removeValue("termsPerYear");
      return this;
    }
    /**
     * Get currently set value for termsPerYear property in this builder.
     * @return previously set value or {@code null}. If multiple values have been 
     * set to this property, then {@link java.util.Collection} instance will be 
     * returned.
     */
    @Nullable public java.lang.Object getTermsPerYear() {
      return myData.get("termsPerYear");
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
     * A description of the qualification, award, certificate, diploma or other occupational credential awarded as a consequence of successful completion of this course or program.
     * @param educationalOccupationalCredential value to set
     * @return this builder instance
     */
    @NotNull public Builder occupationalCredentialAwarded(@NotNull EducationalOccupationalCredential educationalOccupationalCredential) {
      putValue("occupationalCredentialAwarded", educationalOccupationalCredential);
      return this;
    }
    /**
     * A description of the qualification, award, certificate, diploma or other occupational credential awarded as a consequence of successful completion of this course or program.
     * @param educationalOccupationalCredential value to set
     * @return this builder instance
     */
    @NotNull public Builder occupationalCredentialAwarded(@NotNull EducationalOccupationalCredential.Builder educationalOccupationalCredential) {
      putValue("occupationalCredentialAwarded", educationalOccupationalCredential.build());
      return this;
    }
    /**
     * A description of the qualification, award, certificate, diploma or other occupational credential awarded as a consequence of successful completion of this course or program.
     * @param occupationalCredentialAwarded value to set
     * @return this builder instance
     */
    @NotNull public Builder occupationalCredentialAwarded(@NotNull String occupationalCredentialAwarded) {
      putValue("occupationalCredentialAwarded", occupationalCredentialAwarded);
      return this;
    }
    /**
     * Remove occupationalCredentialAwarded property from the builder.
     * If this property is repeatable, all instances are removed.
     * @return this builder instance
     */
    @NotNull public Builder removeOccupationalCredentialAwarded() {
      removeValue("occupationalCredentialAwarded");
      return this;
    }
    /**
     * Get currently set value for occupationalCredentialAwarded property in this builder.
     * @return previously set value or {@code null}. If multiple values have been 
     * set to this property, then {@link java.util.Collection} instance will be 
     * returned.
     */
    @Nullable public java.lang.Object getOccupationalCredentialAwarded() {
      return myData.get("occupationalCredentialAwarded");
    }
    /**
     * A course or class that is one of the learning opportunities that constitute an educational / occupational program. No information is implied about whether the course is mandatory or optional; no guarantee is implied about whether the course will be available to everyone on the program.
     * @param course value to set
     * @return this builder instance
     */
    @NotNull public Builder hasCourse(@NotNull Course course) {
      putValue("hasCourse", course);
      return this;
    }
    /**
     * A course or class that is one of the learning opportunities that constitute an educational / occupational program. No information is implied about whether the course is mandatory or optional; no guarantee is implied about whether the course will be available to everyone on the program.
     * @param course value to set
     * @return this builder instance
     */
    @NotNull public Builder hasCourse(@NotNull Course.Builder course) {
      putValue("hasCourse", course.build());
      return this;
    }
    /**
     * Remove hasCourse property from the builder.
     * If this property is repeatable, all instances are removed.
     * @return this builder instance
     */
    @NotNull public Builder removeHasCourse() {
      removeValue("hasCourse");
      return this;
    }
    /**
     * Get currently set value for hasCourse property in this builder.
     * @return previously set value or {@code null}. If multiple values have been 
     * set to this property, then {@link java.util.Collection} instance will be 
     * returned.
     */
    @Nullable public java.lang.Object getHasCourse() {
      return myData.get("hasCourse");
    }
    /**
     * The day of the week for which these opening hours are valid.
     * @param dayOfWeek value to set
     * @return this builder instance
     */
    @NotNull public Builder dayOfWeek(@NotNull DayOfWeek dayOfWeek) {
      putValue("dayOfWeek", dayOfWeek);
      return this;
    }
    /**
     * Remove dayOfWeek property from the builder.
     * If this property is repeatable, all instances are removed.
     * @return this builder instance
     */
    @NotNull public Builder removeDayOfWeek() {
      removeValue("dayOfWeek");
      return this;
    }
    /**
     * Get currently set value for dayOfWeek property in this builder.
     * @return previously set value or {@code null}. If multiple values have been 
     * set to this property, then {@link java.util.Collection} instance will be 
     * returned.
     */
    @Nullable public java.lang.Object getDayOfWeek() {
      return myData.get("dayOfWeek");
    }
    /**
     * The amount of time in a term as defined by the institution. A term is a length of time where students take one or more classes. Semesters and quarters are common units for term.
     * @param duration value to set
     * @return this builder instance
     */
    @NotNull public Builder termDuration(@NotNull Duration duration) {
      putValue("termDuration", duration);
      return this;
    }
    /**
     * Remove termDuration property from the builder.
     * If this property is repeatable, all instances are removed.
     * @return this builder instance
     */
    @NotNull public Builder removeTermDuration() {
      removeValue("termDuration");
      return this;
    }
    /**
     * Get currently set value for termDuration property in this builder.
     * @return previously set value or {@code null}. If multiple values have been 
     * set to this property, then {@link java.util.Collection} instance will be 
     * returned.
     */
    @Nullable public java.lang.Object getTermDuration() {
      return myData.get("termDuration");
    }
    /**
     * An offer to provide this item&amp;#x2014;for example, an offer to sell a product, rent the DVD of a movie, perform a service, or give away tickets to an event. Use [[businessFunction]] to indicate the kind of transaction offered, i.e. sell, lease, etc. This property can also be used to describe a [[Demand]]. While this property is listed as expected on a number of common types, it can be used in others. In that case, using a second type, such as Product or a subtype of Product, can clarify the nature of the offer.
     * 
     * @param demand value to set
     * @return this builder instance
     */
    @NotNull public Builder offers(@NotNull Demand demand) {
      putValue("offers", demand);
      return this;
    }
    /**
     * An offer to provide this item&amp;#x2014;for example, an offer to sell a product, rent the DVD of a movie, perform a service, or give away tickets to an event. Use [[businessFunction]] to indicate the kind of transaction offered, i.e. sell, lease, etc. This property can also be used to describe a [[Demand]]. While this property is listed as expected on a number of common types, it can be used in others. In that case, using a second type, such as Product or a subtype of Product, can clarify the nature of the offer.
     * 
     * @param demand value to set
     * @return this builder instance
     */
    @NotNull public Builder offers(@NotNull Demand.Builder demand) {
      putValue("offers", demand.build());
      return this;
    }
    /**
     * An offer to provide this item&amp;#x2014;for example, an offer to sell a product, rent the DVD of a movie, perform a service, or give away tickets to an event. Use [[businessFunction]] to indicate the kind of transaction offered, i.e. sell, lease, etc. This property can also be used to describe a [[Demand]]. While this property is listed as expected on a number of common types, it can be used in others. In that case, using a second type, such as Product or a subtype of Product, can clarify the nature of the offer.
     * 
     * @param offer value to set
     * @return this builder instance
     */
    @NotNull public Builder offers(@NotNull Offer offer) {
      putValue("offers", offer);
      return this;
    }
    /**
     * An offer to provide this item&amp;#x2014;for example, an offer to sell a product, rent the DVD of a movie, perform a service, or give away tickets to an event. Use [[businessFunction]] to indicate the kind of transaction offered, i.e. sell, lease, etc. This property can also be used to describe a [[Demand]]. While this property is listed as expected on a number of common types, it can be used in others. In that case, using a second type, such as Product or a subtype of Product, can clarify the nature of the offer.
     * 
     * @param offer value to set
     * @return this builder instance
     */
    @NotNull public Builder offers(@NotNull Offer.Builder offer) {
      putValue("offers", offer.build());
      return this;
    }
    /**
     * Remove offers property from the builder.
     * If this property is repeatable, all instances are removed.
     * @return this builder instance
     */
    @NotNull public Builder removeOffers() {
      removeValue("offers");
      return this;
    }
    /**
     * Get currently set value for offers property in this builder.
     * @return previously set value or {@code null}. If multiple values have been 
     * set to this property, then {@link java.util.Collection} instance will be 
     * returned.
     */
    @Nullable public java.lang.Object getOffers() {
      return myData.get("offers");
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
      if ("occupationalCategory".equals(key) && value instanceof CategoryCode) { this.occupationalCategory((CategoryCode)value); return; }
      if ("occupationalCategorys".equals(key) && value instanceof CategoryCode) { this.occupationalCategory((CategoryCode)value); return; }
      if ("occupationalCategory".equals(key) && value instanceof String) { this.occupationalCategory((String)value); return; }
      if ("occupationalCategorys".equals(key) && value instanceof String) { this.occupationalCategory((String)value); return; }
      if ("trainingSalary".equals(key) && value instanceof MonetaryAmountDistribution) { this.trainingSalary((MonetaryAmountDistribution)value); return; }
      if ("trainingSalarys".equals(key) && value instanceof MonetaryAmountDistribution) { this.trainingSalary((MonetaryAmountDistribution)value); return; }
      super.fromMap(key, value);
    }
  }
  
}
