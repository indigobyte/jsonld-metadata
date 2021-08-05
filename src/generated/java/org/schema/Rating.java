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
 * A rating is an evaluation on a numeric scale, such as 1 to 5 stars.
 */
public class Rating extends Intangible {
  /**
   * A short explanation (e.g. one to two sentences) providing background context and other information that led to the conclusion expressed in the rating. This is particularly applicable to ratings associated with &quot;fact check&quot; markup using [[ClaimReview]].
   */
  @JsonIgnore public String getRatingExplanation() {
    return (String) getValue("ratingExplanation");
  }
  /**
   * A short explanation (e.g. one to two sentences) providing background context and other information that led to the conclusion expressed in the rating. This is particularly applicable to ratings associated with &quot;fact check&quot; markup using [[ClaimReview]].
   */
  @JsonIgnore public java.util.Collection<String> getRatingExplanations() {
    final Object current = myData.get("ratingExplanation");
    if (current == null) return Collections.emptyList();
    if (current instanceof java.util.Collection) {
      return (java.util.Collection<String>) current;
    }
    return Arrays.asList((String) current);
  }
  /**
   * The author of this content or rating. Please note that author is special in that HTML 5 provides a special mechanism for indicating authorship via the rel tag. That is equivalent to this and may be used interchangeably.
   */
  @JsonIgnore public Organization getAuthorOrganization() {
    return (Organization) getValue("author");
  }
  /**
   * The author of this content or rating. Please note that author is special in that HTML 5 provides a special mechanism for indicating authorship via the rel tag. That is equivalent to this and may be used interchangeably.
   */
  @JsonIgnore public java.util.Collection<Organization> getAuthorOrganizations() {
    final Object current = myData.get("author");
    if (current == null) return Collections.emptyList();
    if (current instanceof java.util.Collection) {
      return (java.util.Collection<Organization>) current;
    }
    return Arrays.asList((Organization) current);
  }
  /**
   * The author of this content or rating. Please note that author is special in that HTML 5 provides a special mechanism for indicating authorship via the rel tag. That is equivalent to this and may be used interchangeably.
   */
  @JsonIgnore public Person getAuthorPerson() {
    return (Person) getValue("author");
  }
  /**
   * The author of this content or rating. Please note that author is special in that HTML 5 provides a special mechanism for indicating authorship via the rel tag. That is equivalent to this and may be used interchangeably.
   */
  @JsonIgnore public java.util.Collection<Person> getAuthorPersons() {
    final Object current = myData.get("author");
    if (current == null) return Collections.emptyList();
    if (current instanceof java.util.Collection) {
      return (java.util.Collection<Person>) current;
    }
    return Arrays.asList((Person) current);
  }
  /**
   * The lowest value allowed in this rating system. If worstRating is omitted, 1 is assumed.
   */
  @JsonIgnore public Number getWorstRatingNumber() {
    return (Number) getValue("worstRating");
  }
  /**
   * The lowest value allowed in this rating system. If worstRating is omitted, 1 is assumed.
   */
  @JsonIgnore public java.util.Collection<Number> getWorstRatingNumbers() {
    final Object current = myData.get("worstRating");
    if (current == null) return Collections.emptyList();
    if (current instanceof java.util.Collection) {
      return (java.util.Collection<Number>) current;
    }
    return Arrays.asList((Number) current);
  }
  /**
   * The lowest value allowed in this rating system. If worstRating is omitted, 1 is assumed.
   */
  @JsonIgnore public String getWorstRatingString() {
    return (String) getValue("worstRating");
  }
  /**
   * The lowest value allowed in this rating system. If worstRating is omitted, 1 is assumed.
   */
  @JsonIgnore public java.util.Collection<String> getWorstRatingStrings() {
    final Object current = myData.get("worstRating");
    if (current == null) return Collections.emptyList();
    if (current instanceof java.util.Collection) {
      return (java.util.Collection<String>) current;
    }
    return Arrays.asList((String) current);
  }
  /**
   * This Review or Rating is relevant to this part or facet of the itemReviewed.
   */
  @JsonIgnore public String getReviewAspect() {
    return (String) getValue("reviewAspect");
  }
  /**
   * This Review or Rating is relevant to this part or facet of the itemReviewed.
   */
  @JsonIgnore public java.util.Collection<String> getReviewAspects() {
    final Object current = myData.get("reviewAspect");
    if (current == null) return Collections.emptyList();
    if (current instanceof java.util.Collection) {
      return (java.util.Collection<String>) current;
    }
    return Arrays.asList((String) current);
  }
  /**
   * The highest value allowed in this rating system. If bestRating is omitted, 5 is assumed.
   */
  @JsonIgnore public Integer getBestRatingInteger() {
    return (Integer) getValue("bestRating");
  }
  /**
   * The highest value allowed in this rating system. If bestRating is omitted, 5 is assumed.
   */
  @JsonIgnore public java.util.Collection<Integer> getBestRatingIntegers() {
    final Object current = myData.get("bestRating");
    if (current == null) return Collections.emptyList();
    if (current instanceof java.util.Collection) {
      return (java.util.Collection<Integer>) current;
    }
    return Arrays.asList((Integer) current);
  }
  /**
   * The highest value allowed in this rating system. If bestRating is omitted, 5 is assumed.
   */
  @JsonIgnore public Long getBestRatingLong() {
    return (Long) getValue("bestRating");
  }
  /**
   * The highest value allowed in this rating system. If bestRating is omitted, 5 is assumed.
   */
  @JsonIgnore public java.util.Collection<Long> getBestRatingLongs() {
    final Object current = myData.get("bestRating");
    if (current == null) return Collections.emptyList();
    if (current instanceof java.util.Collection) {
      return (java.util.Collection<Long>) current;
    }
    return Arrays.asList((Long) current);
  }
  /**
   * The highest value allowed in this rating system. If bestRating is omitted, 5 is assumed.
   */
  @JsonIgnore public Float getBestRatingFloat() {
    return (Float) getValue("bestRating");
  }
  /**
   * The highest value allowed in this rating system. If bestRating is omitted, 5 is assumed.
   */
  @JsonIgnore public java.util.Collection<Float> getBestRatingFloats() {
    final Object current = myData.get("bestRating");
    if (current == null) return Collections.emptyList();
    if (current instanceof java.util.Collection) {
      return (java.util.Collection<Float>) current;
    }
    return Arrays.asList((Float) current);
  }
  /**
   * The highest value allowed in this rating system. If bestRating is omitted, 5 is assumed.
   */
  @JsonIgnore public Double getBestRatingDouble() {
    return (Double) getValue("bestRating");
  }
  /**
   * The highest value allowed in this rating system. If bestRating is omitted, 5 is assumed.
   */
  @JsonIgnore public java.util.Collection<Double> getBestRatingDoubles() {
    final Object current = myData.get("bestRating");
    if (current == null) return Collections.emptyList();
    if (current instanceof java.util.Collection) {
      return (java.util.Collection<Double>) current;
    }
    return Arrays.asList((Double) current);
  }
  /**
   * The highest value allowed in this rating system. If bestRating is omitted, 5 is assumed.
   */
  @JsonIgnore public String getBestRatingString() {
    return (String) getValue("bestRating");
  }
  /**
   * The highest value allowed in this rating system. If bestRating is omitted, 5 is assumed.
   */
  @JsonIgnore public java.util.Collection<String> getBestRatingStrings() {
    final Object current = myData.get("bestRating");
    if (current == null) return Collections.emptyList();
    if (current instanceof java.util.Collection) {
      return (java.util.Collection<String>) current;
    }
    return Arrays.asList((String) current);
  }
  /**
   * The rating for the content.\n\nUsage guidelines:\n\n* Use values from 0123456789 (Unicode 'DIGIT ZERO' (U+0030) to 'DIGIT NINE' (U+0039)) rather than superficially similiar Unicode symbols.\n* Use '.' (Unicode 'FULL STOP' (U+002E)) rather than ',' to indicate a decimal point. Avoid using these symbols as a readability separator.
   */
  @JsonIgnore public Integer getRatingValueInteger() {
    return (Integer) getValue("ratingValue");
  }
  /**
   * The rating for the content.\n\nUsage guidelines:\n\n* Use values from 0123456789 (Unicode 'DIGIT ZERO' (U+0030) to 'DIGIT NINE' (U+0039)) rather than superficially similiar Unicode symbols.\n* Use '.' (Unicode 'FULL STOP' (U+002E)) rather than ',' to indicate a decimal point. Avoid using these symbols as a readability separator.
   */
  @JsonIgnore public java.util.Collection<Integer> getRatingValueIntegers() {
    final Object current = myData.get("ratingValue");
    if (current == null) return Collections.emptyList();
    if (current instanceof java.util.Collection) {
      return (java.util.Collection<Integer>) current;
    }
    return Arrays.asList((Integer) current);
  }
  /**
   * The rating for the content.\n\nUsage guidelines:\n\n* Use values from 0123456789 (Unicode 'DIGIT ZERO' (U+0030) to 'DIGIT NINE' (U+0039)) rather than superficially similiar Unicode symbols.\n* Use '.' (Unicode 'FULL STOP' (U+002E)) rather than ',' to indicate a decimal point. Avoid using these symbols as a readability separator.
   */
  @JsonIgnore public Long getRatingValueLong() {
    return (Long) getValue("ratingValue");
  }
  /**
   * The rating for the content.\n\nUsage guidelines:\n\n* Use values from 0123456789 (Unicode 'DIGIT ZERO' (U+0030) to 'DIGIT NINE' (U+0039)) rather than superficially similiar Unicode symbols.\n* Use '.' (Unicode 'FULL STOP' (U+002E)) rather than ',' to indicate a decimal point. Avoid using these symbols as a readability separator.
   */
  @JsonIgnore public java.util.Collection<Long> getRatingValueLongs() {
    final Object current = myData.get("ratingValue");
    if (current == null) return Collections.emptyList();
    if (current instanceof java.util.Collection) {
      return (java.util.Collection<Long>) current;
    }
    return Arrays.asList((Long) current);
  }
  /**
   * The rating for the content.\n\nUsage guidelines:\n\n* Use values from 0123456789 (Unicode 'DIGIT ZERO' (U+0030) to 'DIGIT NINE' (U+0039)) rather than superficially similiar Unicode symbols.\n* Use '.' (Unicode 'FULL STOP' (U+002E)) rather than ',' to indicate a decimal point. Avoid using these symbols as a readability separator.
   */
  @JsonIgnore public Float getRatingValueFloat() {
    return (Float) getValue("ratingValue");
  }
  /**
   * The rating for the content.\n\nUsage guidelines:\n\n* Use values from 0123456789 (Unicode 'DIGIT ZERO' (U+0030) to 'DIGIT NINE' (U+0039)) rather than superficially similiar Unicode symbols.\n* Use '.' (Unicode 'FULL STOP' (U+002E)) rather than ',' to indicate a decimal point. Avoid using these symbols as a readability separator.
   */
  @JsonIgnore public java.util.Collection<Float> getRatingValueFloats() {
    final Object current = myData.get("ratingValue");
    if (current == null) return Collections.emptyList();
    if (current instanceof java.util.Collection) {
      return (java.util.Collection<Float>) current;
    }
    return Arrays.asList((Float) current);
  }
  /**
   * The rating for the content.\n\nUsage guidelines:\n\n* Use values from 0123456789 (Unicode 'DIGIT ZERO' (U+0030) to 'DIGIT NINE' (U+0039)) rather than superficially similiar Unicode symbols.\n* Use '.' (Unicode 'FULL STOP' (U+002E)) rather than ',' to indicate a decimal point. Avoid using these symbols as a readability separator.
   */
  @JsonIgnore public Double getRatingValueDouble() {
    return (Double) getValue("ratingValue");
  }
  /**
   * The rating for the content.\n\nUsage guidelines:\n\n* Use values from 0123456789 (Unicode 'DIGIT ZERO' (U+0030) to 'DIGIT NINE' (U+0039)) rather than superficially similiar Unicode symbols.\n* Use '.' (Unicode 'FULL STOP' (U+002E)) rather than ',' to indicate a decimal point. Avoid using these symbols as a readability separator.
   */
  @JsonIgnore public java.util.Collection<Double> getRatingValueDoubles() {
    final Object current = myData.get("ratingValue");
    if (current == null) return Collections.emptyList();
    if (current instanceof java.util.Collection) {
      return (java.util.Collection<Double>) current;
    }
    return Arrays.asList((Double) current);
  }
  /**
   * The rating for the content.\n\nUsage guidelines:\n\n* Use values from 0123456789 (Unicode 'DIGIT ZERO' (U+0030) to 'DIGIT NINE' (U+0039)) rather than superficially similiar Unicode symbols.\n* Use '.' (Unicode 'FULL STOP' (U+002E)) rather than ',' to indicate a decimal point. Avoid using these symbols as a readability separator.
   */
  @JsonIgnore public String getRatingValueString() {
    return (String) getValue("ratingValue");
  }
  /**
   * The rating for the content.\n\nUsage guidelines:\n\n* Use values from 0123456789 (Unicode 'DIGIT ZERO' (U+0030) to 'DIGIT NINE' (U+0039)) rather than superficially similiar Unicode symbols.\n* Use '.' (Unicode 'FULL STOP' (U+002E)) rather than ',' to indicate a decimal point. Avoid using these symbols as a readability separator.
   */
  @JsonIgnore public java.util.Collection<String> getRatingValueStrings() {
    final Object current = myData.get("ratingValue");
    if (current == null) return Collections.emptyList();
    if (current instanceof java.util.Collection) {
      return (java.util.Collection<String>) current;
    }
    return Arrays.asList((String) current);
  }
  protected Rating(java.util.Map<String,Object> data) {
    super(data);
  }
  
  /**
   * Builder for {@link Rating}
   */
  public static class Builder extends Intangible.Builder {
    public Builder(@NotNull HashMap<String,Object> data) {
      super(data);
    }
    @NotNull public Rating build() {
      return new Rating(myData);
    }
    /**
     * A short explanation (e.g. one to two sentences) providing background context and other information that led to the conclusion expressed in the rating. This is particularly applicable to ratings associated with &quot;fact check&quot; markup using [[ClaimReview]].
     */
    @NotNull public Builder ratingExplanation(@NotNull String ratingExplanation) {
      putValue("ratingExplanation", ratingExplanation);
      return this;
    }
    /**
     * The author of this content or rating. Please note that author is special in that HTML 5 provides a special mechanism for indicating authorship via the rel tag. That is equivalent to this and may be used interchangeably.
     */
    @NotNull public Builder author(@NotNull Organization organization) {
      putValue("author", organization);
      return this;
    }
    /**
     * The author of this content or rating. Please note that author is special in that HTML 5 provides a special mechanism for indicating authorship via the rel tag. That is equivalent to this and may be used interchangeably.
     */
    @NotNull public Builder author(@NotNull Organization.Builder organization) {
      putValue("author", organization.build());
      return this;
    }
    /**
     * The author of this content or rating. Please note that author is special in that HTML 5 provides a special mechanism for indicating authorship via the rel tag. That is equivalent to this and may be used interchangeably.
     */
    @NotNull public Builder author(@NotNull Person person) {
      putValue("author", person);
      return this;
    }
    /**
     * The author of this content or rating. Please note that author is special in that HTML 5 provides a special mechanism for indicating authorship via the rel tag. That is equivalent to this and may be used interchangeably.
     */
    @NotNull public Builder author(@NotNull Person.Builder person) {
      putValue("author", person.build());
      return this;
    }
    /**
     * The lowest value allowed in this rating system. If worstRating is omitted, 1 is assumed.
     */
    @NotNull public Builder worstRating(@NotNull Number number) {
      putValue("worstRating", number);
      return this;
    }
    /**
     * The lowest value allowed in this rating system. If worstRating is omitted, 1 is assumed.
     */
    @NotNull public Builder worstRating(@NotNull String worstRating) {
      putValue("worstRating", worstRating);
      return this;
    }
    /**
     * This Review or Rating is relevant to this part or facet of the itemReviewed.
     */
    @NotNull public Builder reviewAspect(@NotNull String reviewAspect) {
      putValue("reviewAspect", reviewAspect);
      return this;
    }
    /**
     * The highest value allowed in this rating system. If bestRating is omitted, 5 is assumed.
     */
    @NotNull public Builder bestRating(@NotNull Integer integer) {
      putValue("bestRating", integer);
      return this;
    }
    /**
     * The highest value allowed in this rating system. If bestRating is omitted, 5 is assumed.
     */
    @NotNull public Builder bestRating(@NotNull Long bestRating) {
      putValue("bestRating", bestRating);
      return this;
    }
    /**
     * The highest value allowed in this rating system. If bestRating is omitted, 5 is assumed.
     */
    @NotNull public Builder bestRating(@NotNull Float bestRating) {
      putValue("bestRating", bestRating);
      return this;
    }
    /**
     * The highest value allowed in this rating system. If bestRating is omitted, 5 is assumed.
     */
    @NotNull public Builder bestRating(@NotNull Double bestRating) {
      putValue("bestRating", bestRating);
      return this;
    }
    /**
     * The highest value allowed in this rating system. If bestRating is omitted, 5 is assumed.
     */
    @NotNull public Builder bestRating(@NotNull String bestRating) {
      putValue("bestRating", bestRating);
      return this;
    }
    /**
     * The rating for the content.\n\nUsage guidelines:\n\n* Use values from 0123456789 (Unicode 'DIGIT ZERO' (U+0030) to 'DIGIT NINE' (U+0039)) rather than superficially similiar Unicode symbols.\n* Use '.' (Unicode 'FULL STOP' (U+002E)) rather than ',' to indicate a decimal point. Avoid using these symbols as a readability separator.
     */
    @NotNull public Builder ratingValue(@NotNull Integer integer) {
      putValue("ratingValue", integer);
      return this;
    }
    /**
     * The rating for the content.\n\nUsage guidelines:\n\n* Use values from 0123456789 (Unicode 'DIGIT ZERO' (U+0030) to 'DIGIT NINE' (U+0039)) rather than superficially similiar Unicode symbols.\n* Use '.' (Unicode 'FULL STOP' (U+002E)) rather than ',' to indicate a decimal point. Avoid using these symbols as a readability separator.
     */
    @NotNull public Builder ratingValue(@NotNull Long ratingValue) {
      putValue("ratingValue", ratingValue);
      return this;
    }
    /**
     * The rating for the content.\n\nUsage guidelines:\n\n* Use values from 0123456789 (Unicode 'DIGIT ZERO' (U+0030) to 'DIGIT NINE' (U+0039)) rather than superficially similiar Unicode symbols.\n* Use '.' (Unicode 'FULL STOP' (U+002E)) rather than ',' to indicate a decimal point. Avoid using these symbols as a readability separator.
     */
    @NotNull public Builder ratingValue(@NotNull Float ratingValue) {
      putValue("ratingValue", ratingValue);
      return this;
    }
    /**
     * The rating for the content.\n\nUsage guidelines:\n\n* Use values from 0123456789 (Unicode 'DIGIT ZERO' (U+0030) to 'DIGIT NINE' (U+0039)) rather than superficially similiar Unicode symbols.\n* Use '.' (Unicode 'FULL STOP' (U+002E)) rather than ',' to indicate a decimal point. Avoid using these symbols as a readability separator.
     */
    @NotNull public Builder ratingValue(@NotNull Double ratingValue) {
      putValue("ratingValue", ratingValue);
      return this;
    }
    /**
     * The rating for the content.\n\nUsage guidelines:\n\n* Use values from 0123456789 (Unicode 'DIGIT ZERO' (U+0030) to 'DIGIT NINE' (U+0039)) rather than superficially similiar Unicode symbols.\n* Use '.' (Unicode 'FULL STOP' (U+002E)) rather than ',' to indicate a decimal point. Avoid using these symbols as a readability separator.
     */
    @NotNull public Builder ratingValue(@NotNull String ratingValue) {
      putValue("ratingValue", ratingValue);
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
      if ("ratingExplanation".equals(key) && value instanceof String) { this.ratingExplanation((String)value); return; }
      if ("ratingExplanations".equals(key) && value instanceof String) { this.ratingExplanation((String)value); return; }
      if ("author".equals(key) && value instanceof Organization) { this.author((Organization)value); return; }
      if ("authors".equals(key) && value instanceof Organization) { this.author((Organization)value); return; }
      if ("author".equals(key) && value instanceof Person) { this.author((Person)value); return; }
      if ("authors".equals(key) && value instanceof Person) { this.author((Person)value); return; }
      if ("worstRating".equals(key) && value instanceof Number) { this.worstRating((Number)value); return; }
      if ("worstRatings".equals(key) && value instanceof Number) { this.worstRating((Number)value); return; }
      if ("worstRating".equals(key) && value instanceof String) { this.worstRating((String)value); return; }
      if ("worstRatings".equals(key) && value instanceof String) { this.worstRating((String)value); return; }
      if ("reviewAspect".equals(key) && value instanceof String) { this.reviewAspect((String)value); return; }
      if ("reviewAspects".equals(key) && value instanceof String) { this.reviewAspect((String)value); return; }
      if ("bestRating".equals(key) && value instanceof Integer) { this.bestRating((Integer)value); return; }
      if ("bestRatings".equals(key) && value instanceof Integer) { this.bestRating((Integer)value); return; }
      if ("bestRating".equals(key) && value instanceof Long) { this.bestRating((Long)value); return; }
      if ("bestRatings".equals(key) && value instanceof Long) { this.bestRating((Long)value); return; }
      if ("bestRating".equals(key) && value instanceof Float) { this.bestRating((Float)value); return; }
      if ("bestRatings".equals(key) && value instanceof Float) { this.bestRating((Float)value); return; }
      if ("bestRating".equals(key) && value instanceof Double) { this.bestRating((Double)value); return; }
      if ("bestRatings".equals(key) && value instanceof Double) { this.bestRating((Double)value); return; }
      if ("bestRating".equals(key) && value instanceof String) { this.bestRating((String)value); return; }
      if ("bestRatings".equals(key) && value instanceof String) { this.bestRating((String)value); return; }
      if ("ratingValue".equals(key) && value instanceof Integer) { this.ratingValue((Integer)value); return; }
      if ("ratingValues".equals(key) && value instanceof Integer) { this.ratingValue((Integer)value); return; }
      if ("ratingValue".equals(key) && value instanceof Long) { this.ratingValue((Long)value); return; }
      if ("ratingValues".equals(key) && value instanceof Long) { this.ratingValue((Long)value); return; }
      if ("ratingValue".equals(key) && value instanceof Float) { this.ratingValue((Float)value); return; }
      if ("ratingValues".equals(key) && value instanceof Float) { this.ratingValue((Float)value); return; }
      if ("ratingValue".equals(key) && value instanceof Double) { this.ratingValue((Double)value); return; }
      if ("ratingValues".equals(key) && value instanceof Double) { this.ratingValue((Double)value); return; }
      if ("ratingValue".equals(key) && value instanceof String) { this.ratingValue((String)value); return; }
      if ("ratingValues".equals(key) && value instanceof String) { this.ratingValue((String)value); return; }
      super.fromMap(key, value);
    }
  }
  
}
