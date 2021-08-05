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
 * A program with both an educational and employment component. Typically based at a workplace and structured around work-based learning, with the aim of instilling competencies related to an occupation. WorkBasedProgram is used to distinguish programs such as apprenticeships from school, college or other classroom based educational programs.
 */
public class WorkBasedProgram extends EducationalOccupationalProgram {
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
  @JsonIgnore public java.util.Collection<CategoryCode> getOccupationalCategoryCategoryCodes() {
    final Object current = myData.get("occupationalCategory");
    if (current == null) return Collections.emptyList();
    if (current instanceof java.util.Collection) {
      return (java.util.Collection<CategoryCode>) current;
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
  @JsonIgnore public java.util.Collection<String> getOccupationalCategoryStrings() {
    final Object current = myData.get("occupationalCategory");
    if (current == null) return Collections.emptyList();
    if (current instanceof java.util.Collection) {
      return (java.util.Collection<String>) current;
    }
    return Arrays.asList((String) current);
  }
  /**
   * The estimated salary earned while in the program.
   */
  @JsonIgnore public MonetaryAmountDistribution getTrainingSalary() {
    return (MonetaryAmountDistribution) getValue("trainingSalary");
  }
  /**
   * The estimated salary earned while in the program.
   */
  @JsonIgnore public java.util.Collection<MonetaryAmountDistribution> getTrainingSalarys() {
    final Object current = myData.get("trainingSalary");
    if (current == null) return Collections.emptyList();
    if (current instanceof java.util.Collection) {
      return (java.util.Collection<MonetaryAmountDistribution>) current;
    }
    return Arrays.asList((MonetaryAmountDistribution) current);
  }
  protected WorkBasedProgram(java.util.Map<String,Object> data) {
    super(data);
  }
  
  /**
   * Builder for {@link WorkBasedProgram}
   */
  public static class Builder extends EducationalOccupationalProgram.Builder {
    public Builder(@NotNull HashMap<String,Object> data) {
      super(data);
    }
    @NotNull public WorkBasedProgram build() {
      return new WorkBasedProgram(myData);
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
     * The estimated salary earned while in the program.
     */
    @NotNull public Builder trainingSalary(@NotNull MonetaryAmountDistribution monetaryAmountDistribution) {
      putValue("trainingSalary", monetaryAmountDistribution);
      return this;
    }
    /**
     * The estimated salary earned while in the program.
     */
    @NotNull public Builder trainingSalary(@NotNull MonetaryAmountDistribution.Builder monetaryAmountDistribution) {
      putValue("trainingSalary", monetaryAmountDistribution.build());
      return this;
    }
    /**
     * The number of credits or units awarded by a Course or required to complete an EducationalOccupationalProgram.
     */
    @NotNull public Builder numberOfCredits(@NotNull Integer integer) {
      putValue("numberOfCredits", integer);
      return this;
    }
    /**
     * The number of credits or units awarded by a Course or required to complete an EducationalOccupationalProgram.
     */
    @NotNull public Builder numberOfCredits(@NotNull StructuredValue structuredValue) {
      putValue("numberOfCredits", structuredValue);
      return this;
    }
    /**
     * The number of credits or units awarded by a Course or required to complete an EducationalOccupationalProgram.
     */
    @NotNull public Builder numberOfCredits(@NotNull StructuredValue.Builder structuredValue) {
      putValue("numberOfCredits", structuredValue.build());
      return this;
    }
    /**
     * The time of day the program normally runs. For example, &quot;evenings&quot;.
     */
    @NotNull public Builder timeOfDay(@NotNull String timeOfDay) {
      putValue("timeOfDay", timeOfDay);
      return this;
    }
    /**
     * The number of credits or units a full-time student would be expected to take in 1 term however 'term' is defined by the institution.
     */
    @NotNull public Builder typicalCreditsPerTerm(@NotNull Integer integer) {
      putValue("typicalCreditsPerTerm", integer);
      return this;
    }
    /**
     * The number of credits or units a full-time student would be expected to take in 1 term however 'term' is defined by the institution.
     */
    @NotNull public Builder typicalCreditsPerTerm(@NotNull StructuredValue structuredValue) {
      putValue("typicalCreditsPerTerm", structuredValue);
      return this;
    }
    /**
     * The number of credits or units a full-time student would be expected to take in 1 term however 'term' is defined by the institution.
     */
    @NotNull public Builder typicalCreditsPerTerm(@NotNull StructuredValue.Builder structuredValue) {
      putValue("typicalCreditsPerTerm", structuredValue.build());
      return this;
    }
    /**
     * The expected length of time to complete the program if attending full-time.
     */
    @NotNull public Builder timeToComplete(@NotNull Duration duration) {
      putValue("timeToComplete", duration);
      return this;
    }
    /**
     * The service provider, service operator, or service performer; the goods producer. Another party (a seller) may offer those services or goods on behalf of the provider. A provider may also serve as the seller.
     */
    @NotNull public Builder provider(@NotNull Organization organization) {
      putValue("provider", organization);
      return this;
    }
    /**
     * The service provider, service operator, or service performer; the goods producer. Another party (a seller) may offer those services or goods on behalf of the provider. A provider may also serve as the seller.
     */
    @NotNull public Builder provider(@NotNull Organization.Builder organization) {
      putValue("provider", organization.build());
      return this;
    }
    /**
     * The service provider, service operator, or service performer; the goods producer. Another party (a seller) may offer those services or goods on behalf of the provider. A provider may also serve as the seller.
     */
    @NotNull public Builder provider(@NotNull Person person) {
      putValue("provider", person);
      return this;
    }
    /**
     * The service provider, service operator, or service performer; the goods producer. Another party (a seller) may offer those services or goods on behalf of the provider. A provider may also serve as the seller.
     */
    @NotNull public Builder provider(@NotNull Person.Builder person) {
      putValue("provider", person.build());
      return this;
    }
    /**
     * A financial aid type or program which students may use to pay for tuition or fees associated with the program.
     */
    @NotNull public Builder financialAidEligible(@NotNull DefinedTerm definedTerm) {
      putValue("financialAidEligible", definedTerm);
      return this;
    }
    /**
     * A financial aid type or program which students may use to pay for tuition or fees associated with the program.
     */
    @NotNull public Builder financialAidEligible(@NotNull DefinedTerm.Builder definedTerm) {
      putValue("financialAidEligible", definedTerm.build());
      return this;
    }
    /**
     * A financial aid type or program which students may use to pay for tuition or fees associated with the program.
     */
    @NotNull public Builder financialAidEligible(@NotNull String financialAidEligible) {
      putValue("financialAidEligible", financialAidEligible);
      return this;
    }
    /**
     * A description of the qualification, award, certificate, diploma or other educational credential awarded as a consequence of successful completion of this course or program.
     */
    @NotNull public Builder educationalCredentialAwarded(@NotNull EducationalOccupationalCredential educationalOccupationalCredential) {
      putValue("educationalCredentialAwarded", educationalOccupationalCredential);
      return this;
    }
    /**
     * A description of the qualification, award, certificate, diploma or other educational credential awarded as a consequence of successful completion of this course or program.
     */
    @NotNull public Builder educationalCredentialAwarded(@NotNull EducationalOccupationalCredential.Builder educationalOccupationalCredential) {
      putValue("educationalCredentialAwarded", educationalOccupationalCredential.build());
      return this;
    }
    /**
     * A description of the qualification, award, certificate, diploma or other educational credential awarded as a consequence of successful completion of this course or program.
     */
    @NotNull public Builder educationalCredentialAwarded(@NotNull String educationalCredentialAwarded) {
      putValue("educationalCredentialAwarded", educationalCredentialAwarded);
      return this;
    }
    /**
     * Prerequisites for enrolling in the program.
     */
    @NotNull public Builder programPrerequisites(@NotNull AlignmentObject alignmentObject) {
      putValue("programPrerequisites", alignmentObject);
      return this;
    }
    /**
     * Prerequisites for enrolling in the program.
     */
    @NotNull public Builder programPrerequisites(@NotNull AlignmentObject.Builder alignmentObject) {
      putValue("programPrerequisites", alignmentObject.build());
      return this;
    }
    /**
     * Prerequisites for enrolling in the program.
     */
    @NotNull public Builder programPrerequisites(@NotNull Course course) {
      putValue("programPrerequisites", course);
      return this;
    }
    /**
     * Prerequisites for enrolling in the program.
     */
    @NotNull public Builder programPrerequisites(@NotNull Course.Builder course) {
      putValue("programPrerequisites", course.build());
      return this;
    }
    /**
     * Prerequisites for enrolling in the program.
     */
    @NotNull public Builder programPrerequisites(@NotNull EducationalOccupationalCredential educationalOccupationalCredential) {
      putValue("programPrerequisites", educationalOccupationalCredential);
      return this;
    }
    /**
     * Prerequisites for enrolling in the program.
     */
    @NotNull public Builder programPrerequisites(@NotNull EducationalOccupationalCredential.Builder educationalOccupationalCredential) {
      putValue("programPrerequisites", educationalOccupationalCredential.build());
      return this;
    }
    /**
     * Prerequisites for enrolling in the program.
     */
    @NotNull public Builder programPrerequisites(@NotNull String programPrerequisites) {
      putValue("programPrerequisites", programPrerequisites);
      return this;
    }
    /**
     * The type of educational or occupational program. For example, classroom, internship, alternance, etc..
     */
    @NotNull public Builder programType(@NotNull DefinedTerm definedTerm) {
      putValue("programType", definedTerm);
      return this;
    }
    /**
     * The type of educational or occupational program. For example, classroom, internship, alternance, etc..
     */
    @NotNull public Builder programType(@NotNull DefinedTerm.Builder definedTerm) {
      putValue("programType", definedTerm.build());
      return this;
    }
    /**
     * The type of educational or occupational program. For example, classroom, internship, alternance, etc..
     */
    @NotNull public Builder programType(@NotNull String programType) {
      putValue("programType", programType);
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
     * The expected salary upon completing the training.
     */
    @NotNull public Builder salaryUponCompletion(@NotNull MonetaryAmountDistribution monetaryAmountDistribution) {
      putValue("salaryUponCompletion", monetaryAmountDistribution);
      return this;
    }
    /**
     * The expected salary upon completing the training.
     */
    @NotNull public Builder salaryUponCompletion(@NotNull MonetaryAmountDistribution.Builder monetaryAmountDistribution) {
      putValue("salaryUponCompletion", monetaryAmountDistribution.build());
      return this;
    }
    /**
     * Similar to courseMode, The medium or means of delivery of the program as a whole. The value may either be a text label (e.g. &quot;online&quot;, &quot;onsite&quot; or &quot;blended&quot;; &quot;synchronous&quot; or &quot;asynchronous&quot;; &quot;full-time&quot; or &quot;part-time&quot;) or a URL reference to a term from a controlled vocabulary (e.g. https://ceds.ed.gov/element/001311#Asynchronous ).
     */
    @NotNull public Builder educationalProgramMode(@NotNull String educationalProgramMode) {
      putValue("educationalProgramMode", educationalProgramMode);
      return this;
    }
    /**
     * The date at which the program begins collecting applications for the next enrollment cycle.
     */
    @NotNull public Builder applicationStartDate(@NotNull java.util.Date date) {
      putValue("applicationStartDate", date);
      return this;
    }
    /**
     * The date at which the program stops collecting applications for the next enrollment cycle.
     */
    @NotNull public Builder applicationDeadline(@NotNull java.util.Date date) {
      putValue("applicationDeadline", date);
      return this;
    }
    /**
     * The maximum number of students who may be enrolled in the program.
     */
    @NotNull public Builder maximumEnrollment(@NotNull Integer integer) {
      putValue("maximumEnrollment", integer);
      return this;
    }
    /**
     * The number of times terms of study are offered per year. Semesters and quarters are common units for term. For example, if the student can only take 2 semesters for the program in one year, then termsPerYear should be 2.
     */
    @NotNull public Builder termsPerYear(@NotNull Integer integer) {
      putValue("termsPerYear", integer);
      return this;
    }
    /**
     * The number of times terms of study are offered per year. Semesters and quarters are common units for term. For example, if the student can only take 2 semesters for the program in one year, then termsPerYear should be 2.
     */
    @NotNull public Builder termsPerYear(@NotNull Long termsPerYear) {
      putValue("termsPerYear", termsPerYear);
      return this;
    }
    /**
     * The number of times terms of study are offered per year. Semesters and quarters are common units for term. For example, if the student can only take 2 semesters for the program in one year, then termsPerYear should be 2.
     */
    @NotNull public Builder termsPerYear(@NotNull Float termsPerYear) {
      putValue("termsPerYear", termsPerYear);
      return this;
    }
    /**
     * The number of times terms of study are offered per year. Semesters and quarters are common units for term. For example, if the student can only take 2 semesters for the program in one year, then termsPerYear should be 2.
     */
    @NotNull public Builder termsPerYear(@NotNull Double termsPerYear) {
      putValue("termsPerYear", termsPerYear);
      return this;
    }
    /**
     * The number of times terms of study are offered per year. Semesters and quarters are common units for term. For example, if the student can only take 2 semesters for the program in one year, then termsPerYear should be 2.
     */
    @NotNull public Builder termsPerYear(@NotNull String termsPerYear) {
      putValue("termsPerYear", termsPerYear);
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
     * A description of the qualification, award, certificate, diploma or other occupational credential awarded as a consequence of successful completion of this course or program.
     */
    @NotNull public Builder occupationalCredentialAwarded(@NotNull EducationalOccupationalCredential educationalOccupationalCredential) {
      putValue("occupationalCredentialAwarded", educationalOccupationalCredential);
      return this;
    }
    /**
     * A description of the qualification, award, certificate, diploma or other occupational credential awarded as a consequence of successful completion of this course or program.
     */
    @NotNull public Builder occupationalCredentialAwarded(@NotNull EducationalOccupationalCredential.Builder educationalOccupationalCredential) {
      putValue("occupationalCredentialAwarded", educationalOccupationalCredential.build());
      return this;
    }
    /**
     * A description of the qualification, award, certificate, diploma or other occupational credential awarded as a consequence of successful completion of this course or program.
     */
    @NotNull public Builder occupationalCredentialAwarded(@NotNull String occupationalCredentialAwarded) {
      putValue("occupationalCredentialAwarded", occupationalCredentialAwarded);
      return this;
    }
    /**
     * A course or class that is one of the learning opportunities that constitute an educational / occupational program. No information is implied about whether the course is mandatory or optional; no guarantee is implied about whether the course will be available to everyone on the program.
     */
    @NotNull public Builder hasCourse(@NotNull Course course) {
      putValue("hasCourse", course);
      return this;
    }
    /**
     * A course or class that is one of the learning opportunities that constitute an educational / occupational program. No information is implied about whether the course is mandatory or optional; no guarantee is implied about whether the course will be available to everyone on the program.
     */
    @NotNull public Builder hasCourse(@NotNull Course.Builder course) {
      putValue("hasCourse", course.build());
      return this;
    }
    /**
     * The day of the week for which these opening hours are valid.
     */
    @NotNull public Builder dayOfWeek(@NotNull DayOfWeek dayOfWeek) {
      putValue("dayOfWeek", dayOfWeek);
      return this;
    }
    /**
     * The amount of time in a term as defined by the institution. A term is a length of time where students take one or more classes. Semesters and quarters are common units for term.
     */
    @NotNull public Builder termDuration(@NotNull Duration duration) {
      putValue("termDuration", duration);
      return this;
    }
    /**
     * An offer to provide this item&amp;#x2014;for example, an offer to sell a product, rent the DVD of a movie, perform a service, or give away tickets to an event. Use [[businessFunction]] to indicate the kind of transaction offered, i.e. sell, lease, etc. This property can also be used to describe a [[Demand]]. While this property is listed as expected on a number of common types, it can be used in others. In that case, using a second type, such as Product or a subtype of Product, can clarify the nature of the offer.
     *       
     */
    @NotNull public Builder offers(@NotNull Demand demand) {
      putValue("offers", demand);
      return this;
    }
    /**
     * An offer to provide this item&amp;#x2014;for example, an offer to sell a product, rent the DVD of a movie, perform a service, or give away tickets to an event. Use [[businessFunction]] to indicate the kind of transaction offered, i.e. sell, lease, etc. This property can also be used to describe a [[Demand]]. While this property is listed as expected on a number of common types, it can be used in others. In that case, using a second type, such as Product or a subtype of Product, can clarify the nature of the offer.
     *       
     */
    @NotNull public Builder offers(@NotNull Demand.Builder demand) {
      putValue("offers", demand.build());
      return this;
    }
    /**
     * An offer to provide this item&amp;#x2014;for example, an offer to sell a product, rent the DVD of a movie, perform a service, or give away tickets to an event. Use [[businessFunction]] to indicate the kind of transaction offered, i.e. sell, lease, etc. This property can also be used to describe a [[Demand]]. While this property is listed as expected on a number of common types, it can be used in others. In that case, using a second type, such as Product or a subtype of Product, can clarify the nature of the offer.
     *       
     */
    @NotNull public Builder offers(@NotNull Offer offer) {
      putValue("offers", offer);
      return this;
    }
    /**
     * An offer to provide this item&amp;#x2014;for example, an offer to sell a product, rent the DVD of a movie, perform a service, or give away tickets to an event. Use [[businessFunction]] to indicate the kind of transaction offered, i.e. sell, lease, etc. This property can also be used to describe a [[Demand]]. While this property is listed as expected on a number of common types, it can be used in others. In that case, using a second type, such as Product or a subtype of Product, can clarify the nature of the offer.
     *       
     */
    @NotNull public Builder offers(@NotNull Offer.Builder offer) {
      putValue("offers", offer.build());
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
