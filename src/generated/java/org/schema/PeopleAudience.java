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
 * A set of characteristics belonging to people, e.g. who compose an item's target audience.
 */
public class PeopleAudience extends Audience {
  /**
   * The gender of the person or audience.
   */
  @JsonIgnore public String getSuggestedGender() {
    return (String) getValue("suggestedGender");
  }
  /**
   * The gender of the person or audience.
   */
  @JsonIgnore public Collection<String> getSuggestedGenders() {
    final Object current = myData.get("suggestedGender");
    if (current == null) return Collections.emptyList();
    if (current instanceof Collection) {
      return (Collection<String>) current;
    }
    return Arrays.asList((String) current);
  }
  /**
   * Maximal age recommended for viewing content.
   */
  @JsonIgnore public Integer getSuggestedMaxAgeInteger() {
    return (Integer) getValue("suggestedMaxAge");
  }
  /**
   * Maximal age recommended for viewing content.
   */
  @JsonIgnore public Collection<Integer> getSuggestedMaxAgeIntegers() {
    final Object current = myData.get("suggestedMaxAge");
    if (current == null) return Collections.emptyList();
    if (current instanceof Collection) {
      return (Collection<Integer>) current;
    }
    return Arrays.asList((Integer) current);
  }
  /**
   * Maximal age recommended for viewing content.
   */
  @JsonIgnore public Long getSuggestedMaxAgeLong() {
    return (Long) getValue("suggestedMaxAge");
  }
  /**
   * Maximal age recommended for viewing content.
   */
  @JsonIgnore public Collection<Long> getSuggestedMaxAgeLongs() {
    final Object current = myData.get("suggestedMaxAge");
    if (current == null) return Collections.emptyList();
    if (current instanceof Collection) {
      return (Collection<Long>) current;
    }
    return Arrays.asList((Long) current);
  }
  /**
   * Maximal age recommended for viewing content.
   */
  @JsonIgnore public Float getSuggestedMaxAgeFloat() {
    return (Float) getValue("suggestedMaxAge");
  }
  /**
   * Maximal age recommended for viewing content.
   */
  @JsonIgnore public Collection<Float> getSuggestedMaxAgeFloats() {
    final Object current = myData.get("suggestedMaxAge");
    if (current == null) return Collections.emptyList();
    if (current instanceof Collection) {
      return (Collection<Float>) current;
    }
    return Arrays.asList((Float) current);
  }
  /**
   * Maximal age recommended for viewing content.
   */
  @JsonIgnore public Double getSuggestedMaxAgeDouble() {
    return (Double) getValue("suggestedMaxAge");
  }
  /**
   * Maximal age recommended for viewing content.
   */
  @JsonIgnore public Collection<Double> getSuggestedMaxAgeDoubles() {
    final Object current = myData.get("suggestedMaxAge");
    if (current == null) return Collections.emptyList();
    if (current instanceof Collection) {
      return (Collection<Double>) current;
    }
    return Arrays.asList((Double) current);
  }
  /**
   * Maximal age recommended for viewing content.
   */
  @JsonIgnore public String getSuggestedMaxAgeString() {
    return (String) getValue("suggestedMaxAge");
  }
  /**
   * Maximal age recommended for viewing content.
   */
  @JsonIgnore public Collection<String> getSuggestedMaxAgeStrings() {
    final Object current = myData.get("suggestedMaxAge");
    if (current == null) return Collections.emptyList();
    if (current instanceof Collection) {
      return (Collection<String>) current;
    }
    return Arrays.asList((String) current);
  }
  /**
   * Audiences defined by a person's minimum age.
   */
  @JsonIgnore public Integer getRequiredMinAge() {
    return (Integer) getValue("requiredMinAge");
  }
  /**
   * Audiences defined by a person's minimum age.
   */
  @JsonIgnore public Collection<Integer> getRequiredMinAges() {
    final Object current = myData.get("requiredMinAge");
    if (current == null) return Collections.emptyList();
    if (current instanceof Collection) {
      return (Collection<Integer>) current;
    }
    return Arrays.asList((Integer) current);
  }
  /**
   * Audiences defined by a person's maximum age.
   */
  @JsonIgnore public Integer getRequiredMaxAge() {
    return (Integer) getValue("requiredMaxAge");
  }
  /**
   * Audiences defined by a person's maximum age.
   */
  @JsonIgnore public Collection<Integer> getRequiredMaxAges() {
    final Object current = myData.get("requiredMaxAge");
    if (current == null) return Collections.emptyList();
    if (current instanceof Collection) {
      return (Collection<Integer>) current;
    }
    return Arrays.asList((Integer) current);
  }
  /**
   * Audiences defined by a person's gender.
   */
  @JsonIgnore public String getRequiredGender() {
    return (String) getValue("requiredGender");
  }
  /**
   * Audiences defined by a person's gender.
   */
  @JsonIgnore public Collection<String> getRequiredGenders() {
    final Object current = myData.get("requiredGender");
    if (current == null) return Collections.emptyList();
    if (current instanceof Collection) {
      return (Collection<String>) current;
    }
    return Arrays.asList((String) current);
  }
  /**
   * Specifying the health condition(s) of a patient, medical study, or other target audience.
   */
  @JsonIgnore public MedicalCondition getHealthCondition() {
    return (MedicalCondition) getValue("healthCondition");
  }
  /**
   * Specifying the health condition(s) of a patient, medical study, or other target audience.
   */
  @JsonIgnore public Collection<MedicalCondition> getHealthConditions() {
    final Object current = myData.get("healthCondition");
    if (current == null) return Collections.emptyList();
    if (current instanceof Collection) {
      return (Collection<MedicalCondition>) current;
    }
    return Arrays.asList((MedicalCondition) current);
  }
  /**
   * Minimal age recommended for viewing content.
   */
  @JsonIgnore public Integer getSuggestedMinAgeInteger() {
    return (Integer) getValue("suggestedMinAge");
  }
  /**
   * Minimal age recommended for viewing content.
   */
  @JsonIgnore public Collection<Integer> getSuggestedMinAgeIntegers() {
    final Object current = myData.get("suggestedMinAge");
    if (current == null) return Collections.emptyList();
    if (current instanceof Collection) {
      return (Collection<Integer>) current;
    }
    return Arrays.asList((Integer) current);
  }
  /**
   * Minimal age recommended for viewing content.
   */
  @JsonIgnore public Long getSuggestedMinAgeLong() {
    return (Long) getValue("suggestedMinAge");
  }
  /**
   * Minimal age recommended for viewing content.
   */
  @JsonIgnore public Collection<Long> getSuggestedMinAgeLongs() {
    final Object current = myData.get("suggestedMinAge");
    if (current == null) return Collections.emptyList();
    if (current instanceof Collection) {
      return (Collection<Long>) current;
    }
    return Arrays.asList((Long) current);
  }
  /**
   * Minimal age recommended for viewing content.
   */
  @JsonIgnore public Float getSuggestedMinAgeFloat() {
    return (Float) getValue("suggestedMinAge");
  }
  /**
   * Minimal age recommended for viewing content.
   */
  @JsonIgnore public Collection<Float> getSuggestedMinAgeFloats() {
    final Object current = myData.get("suggestedMinAge");
    if (current == null) return Collections.emptyList();
    if (current instanceof Collection) {
      return (Collection<Float>) current;
    }
    return Arrays.asList((Float) current);
  }
  /**
   * Minimal age recommended for viewing content.
   */
  @JsonIgnore public Double getSuggestedMinAgeDouble() {
    return (Double) getValue("suggestedMinAge");
  }
  /**
   * Minimal age recommended for viewing content.
   */
  @JsonIgnore public Collection<Double> getSuggestedMinAgeDoubles() {
    final Object current = myData.get("suggestedMinAge");
    if (current == null) return Collections.emptyList();
    if (current instanceof Collection) {
      return (Collection<Double>) current;
    }
    return Arrays.asList((Double) current);
  }
  /**
   * Minimal age recommended for viewing content.
   */
  @JsonIgnore public String getSuggestedMinAgeString() {
    return (String) getValue("suggestedMinAge");
  }
  /**
   * Minimal age recommended for viewing content.
   */
  @JsonIgnore public Collection<String> getSuggestedMinAgeStrings() {
    final Object current = myData.get("suggestedMinAge");
    if (current == null) return Collections.emptyList();
    if (current instanceof Collection) {
      return (Collection<String>) current;
    }
    return Arrays.asList((String) current);
  }
  protected PeopleAudience(java.util.Map<String,Object> data) {
    super(data);
  }
  
  /**
   * Builder for {@link PeopleAudience}
   */
  public static class Builder extends Audience.Builder {
    public Builder(@NotNull HashMap<String,Object> data) {
      super(data);
    }
    @NotNull public PeopleAudience build() {
      return new PeopleAudience(myData);
    }
    /**
     * The gender of the person or audience.
     */
    @NotNull public Builder suggestedGender(@NotNull String suggestedGender) {
      putValue("suggestedGender", suggestedGender);
      return this;
    }
    /**
     * Maximal age recommended for viewing content.
     */
    @NotNull public Builder suggestedMaxAge(@NotNull Integer integer) {
      putValue("suggestedMaxAge", integer);
      return this;
    }
    /**
     * Maximal age recommended for viewing content.
     */
    @NotNull public Builder suggestedMaxAge(@NotNull Long suggestedMaxAge) {
      putValue("suggestedMaxAge", suggestedMaxAge);
      return this;
    }
    /**
     * Maximal age recommended for viewing content.
     */
    @NotNull public Builder suggestedMaxAge(@NotNull Float suggestedMaxAge) {
      putValue("suggestedMaxAge", suggestedMaxAge);
      return this;
    }
    /**
     * Maximal age recommended for viewing content.
     */
    @NotNull public Builder suggestedMaxAge(@NotNull Double suggestedMaxAge) {
      putValue("suggestedMaxAge", suggestedMaxAge);
      return this;
    }
    /**
     * Maximal age recommended for viewing content.
     */
    @NotNull public Builder suggestedMaxAge(@NotNull String suggestedMaxAge) {
      putValue("suggestedMaxAge", suggestedMaxAge);
      return this;
    }
    /**
     * Audiences defined by a person's minimum age.
     */
    @NotNull public Builder requiredMinAge(@NotNull Integer integer) {
      putValue("requiredMinAge", integer);
      return this;
    }
    /**
     * Audiences defined by a person's maximum age.
     */
    @NotNull public Builder requiredMaxAge(@NotNull Integer integer) {
      putValue("requiredMaxAge", integer);
      return this;
    }
    /**
     * Audiences defined by a person's gender.
     */
    @NotNull public Builder requiredGender(@NotNull String requiredGender) {
      putValue("requiredGender", requiredGender);
      return this;
    }
    /**
     * Specifying the health condition(s) of a patient, medical study, or other target audience.
     */
    @NotNull public Builder healthCondition(@NotNull MedicalCondition medicalCondition) {
      putValue("healthCondition", medicalCondition);
      return this;
    }
    /**
     * Specifying the health condition(s) of a patient, medical study, or other target audience.
     */
    @NotNull public Builder healthCondition(@NotNull MedicalCondition.Builder medicalCondition) {
      putValue("healthCondition", medicalCondition.build());
      return this;
    }
    /**
     * Minimal age recommended for viewing content.
     */
    @NotNull public Builder suggestedMinAge(@NotNull Integer integer) {
      putValue("suggestedMinAge", integer);
      return this;
    }
    /**
     * Minimal age recommended for viewing content.
     */
    @NotNull public Builder suggestedMinAge(@NotNull Long suggestedMinAge) {
      putValue("suggestedMinAge", suggestedMinAge);
      return this;
    }
    /**
     * Minimal age recommended for viewing content.
     */
    @NotNull public Builder suggestedMinAge(@NotNull Float suggestedMinAge) {
      putValue("suggestedMinAge", suggestedMinAge);
      return this;
    }
    /**
     * Minimal age recommended for viewing content.
     */
    @NotNull public Builder suggestedMinAge(@NotNull Double suggestedMinAge) {
      putValue("suggestedMinAge", suggestedMinAge);
      return this;
    }
    /**
     * Minimal age recommended for viewing content.
     */
    @NotNull public Builder suggestedMinAge(@NotNull String suggestedMinAge) {
      putValue("suggestedMinAge", suggestedMinAge);
      return this;
    }
    /**
     * The target group associated with a given audience (e.g. veterans, car owners, musicians, etc.).
     */
    @NotNull public Builder audienceType(@NotNull String audienceType) {
      putValue("audienceType", audienceType);
      return this;
    }
    /**
     * The geographic area associated with the audience.
     */
    @NotNull public Builder geographicArea(@NotNull AdministrativeArea administrativeArea) {
      putValue("geographicArea", administrativeArea);
      return this;
    }
    /**
     * The geographic area associated with the audience.
     */
    @NotNull public Builder geographicArea(@NotNull AdministrativeArea.Builder administrativeArea) {
      putValue("geographicArea", administrativeArea.build());
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
     * A sub property of description. A short description of the item used to disambiguate from other, similar items. Information from other properties (in particular, name) may be necessary for the description to be useful for disambiguation.
     */
    @NotNull public Builder disambiguatingDescription(@NotNull Description description) {
      putValue("disambiguatingDescription", description);
      return this;
    }
    /**
     * A description of the item.
     */
    @NotNull public Builder description(@NotNull Description description) {
      putValue("description", description);
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
     * The name of the item.
     */
    @NotNull public Builder name(@NotNull String name) {
      putValue("name", name);
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
     * An image of the item. This can be a &lt;a class=&quot;localLink&quot; href=&quot;http://schema.org/URL&quot;&gt;URL&lt;/a&gt; or a fully described &lt;a class=&quot;localLink&quot; href=&quot;http://schema.org/ImageObject&quot;&gt;ImageObject&lt;/a&gt;.
     */
    @NotNull public Builder image(@NotNull Image image) {
      putValue("image", image);
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
     * Indicates a page (or other CreativeWork) for which this thing is the main entity being described. See &lt;a href=&quot;/docs/datamodel.html#mainEntityBackground&quot;&gt;background notes&lt;/a&gt; for details.
     */
    @NotNull public Builder mainEntityOfPage(@NotNull CreativeWork creativeWork) {
      putValue("mainEntityOfPage", creativeWork);
      return this;
    }
    /**
     * Indicates a page (or other CreativeWork) for which this thing is the main entity being described. See &lt;a href=&quot;/docs/datamodel.html#mainEntityBackground&quot;&gt;background notes&lt;/a&gt; for details.
     */
    @NotNull public Builder mainEntityOfPage(@NotNull CreativeWork.Builder creativeWork) {
      putValue("mainEntityOfPage", creativeWork.build());
      return this;
    }
    /**
     * Indicates a page (or other CreativeWork) for which this thing is the main entity being described. See &lt;a href=&quot;/docs/datamodel.html#mainEntityBackground&quot;&gt;background notes&lt;/a&gt; for details.
     */
    @NotNull public Builder mainEntityOfPage(@NotNull String mainEntityOfPage) {
      putValue("mainEntityOfPage", mainEntityOfPage);
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
      if ("suggestedGender".equals(key) && value instanceof String) { this.suggestedGender((String)value); return; }
      if ("suggestedGenders".equals(key) && value instanceof String) { this.suggestedGender((String)value); return; }
      if ("suggestedMaxAge".equals(key) && value instanceof Integer) { this.suggestedMaxAge((Integer)value); return; }
      if ("suggestedMaxAges".equals(key) && value instanceof Integer) { this.suggestedMaxAge((Integer)value); return; }
      if ("suggestedMaxAge".equals(key) && value instanceof Long) { this.suggestedMaxAge((Long)value); return; }
      if ("suggestedMaxAges".equals(key) && value instanceof Long) { this.suggestedMaxAge((Long)value); return; }
      if ("suggestedMaxAge".equals(key) && value instanceof Float) { this.suggestedMaxAge((Float)value); return; }
      if ("suggestedMaxAges".equals(key) && value instanceof Float) { this.suggestedMaxAge((Float)value); return; }
      if ("suggestedMaxAge".equals(key) && value instanceof Double) { this.suggestedMaxAge((Double)value); return; }
      if ("suggestedMaxAges".equals(key) && value instanceof Double) { this.suggestedMaxAge((Double)value); return; }
      if ("suggestedMaxAge".equals(key) && value instanceof String) { this.suggestedMaxAge((String)value); return; }
      if ("suggestedMaxAges".equals(key) && value instanceof String) { this.suggestedMaxAge((String)value); return; }
      if ("requiredMinAge".equals(key) && value instanceof Integer) { this.requiredMinAge((Integer)value); return; }
      if ("requiredMinAges".equals(key) && value instanceof Integer) { this.requiredMinAge((Integer)value); return; }
      if ("requiredMaxAge".equals(key) && value instanceof Integer) { this.requiredMaxAge((Integer)value); return; }
      if ("requiredMaxAges".equals(key) && value instanceof Integer) { this.requiredMaxAge((Integer)value); return; }
      if ("requiredGender".equals(key) && value instanceof String) { this.requiredGender((String)value); return; }
      if ("requiredGenders".equals(key) && value instanceof String) { this.requiredGender((String)value); return; }
      if ("healthCondition".equals(key) && value instanceof MedicalCondition) { this.healthCondition((MedicalCondition)value); return; }
      if ("healthConditions".equals(key) && value instanceof MedicalCondition) { this.healthCondition((MedicalCondition)value); return; }
      if ("suggestedMinAge".equals(key) && value instanceof Integer) { this.suggestedMinAge((Integer)value); return; }
      if ("suggestedMinAges".equals(key) && value instanceof Integer) { this.suggestedMinAge((Integer)value); return; }
      if ("suggestedMinAge".equals(key) && value instanceof Long) { this.suggestedMinAge((Long)value); return; }
      if ("suggestedMinAges".equals(key) && value instanceof Long) { this.suggestedMinAge((Long)value); return; }
      if ("suggestedMinAge".equals(key) && value instanceof Float) { this.suggestedMinAge((Float)value); return; }
      if ("suggestedMinAges".equals(key) && value instanceof Float) { this.suggestedMinAge((Float)value); return; }
      if ("suggestedMinAge".equals(key) && value instanceof Double) { this.suggestedMinAge((Double)value); return; }
      if ("suggestedMinAges".equals(key) && value instanceof Double) { this.suggestedMinAge((Double)value); return; }
      if ("suggestedMinAge".equals(key) && value instanceof String) { this.suggestedMinAge((String)value); return; }
      if ("suggestedMinAges".equals(key) && value instanceof String) { this.suggestedMinAge((String)value); return; }
      super.fromMap(key, value);
    }
  }
  
}
