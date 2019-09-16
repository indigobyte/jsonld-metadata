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
 * A set of characteristics describing parents, who can be interested in viewing some content.
 */
public class ParentAudience extends PeopleAudience {
  /**
   * Maximal age of the child.
   */
  @JsonIgnore public Integer getChildMaxAgeInteger() {
    return (Integer) getValue("childMaxAge");
  }
  /**
   * Maximal age of the child.
   */
  @JsonIgnore public Collection<Integer> getChildMaxAgeIntegers() {
    final Object current = myData.get("childMaxAge");
    if (current == null) return Collections.emptyList();
    if (current instanceof Collection) {
      return (Collection<Integer>) current;
    }
    return Arrays.asList((Integer) current);
  }
  /**
   * Maximal age of the child.
   */
  @JsonIgnore public Long getChildMaxAgeLong() {
    return (Long) getValue("childMaxAge");
  }
  /**
   * Maximal age of the child.
   */
  @JsonIgnore public Collection<Long> getChildMaxAgeLongs() {
    final Object current = myData.get("childMaxAge");
    if (current == null) return Collections.emptyList();
    if (current instanceof Collection) {
      return (Collection<Long>) current;
    }
    return Arrays.asList((Long) current);
  }
  /**
   * Maximal age of the child.
   */
  @JsonIgnore public Float getChildMaxAgeFloat() {
    return (Float) getValue("childMaxAge");
  }
  /**
   * Maximal age of the child.
   */
  @JsonIgnore public Collection<Float> getChildMaxAgeFloats() {
    final Object current = myData.get("childMaxAge");
    if (current == null) return Collections.emptyList();
    if (current instanceof Collection) {
      return (Collection<Float>) current;
    }
    return Arrays.asList((Float) current);
  }
  /**
   * Maximal age of the child.
   */
  @JsonIgnore public Double getChildMaxAgeDouble() {
    return (Double) getValue("childMaxAge");
  }
  /**
   * Maximal age of the child.
   */
  @JsonIgnore public Collection<Double> getChildMaxAgeDoubles() {
    final Object current = myData.get("childMaxAge");
    if (current == null) return Collections.emptyList();
    if (current instanceof Collection) {
      return (Collection<Double>) current;
    }
    return Arrays.asList((Double) current);
  }
  /**
   * Maximal age of the child.
   */
  @JsonIgnore public String getChildMaxAgeString() {
    return (String) getValue("childMaxAge");
  }
  /**
   * Maximal age of the child.
   */
  @JsonIgnore public Collection<String> getChildMaxAgeStrings() {
    final Object current = myData.get("childMaxAge");
    if (current == null) return Collections.emptyList();
    if (current instanceof Collection) {
      return (Collection<String>) current;
    }
    return Arrays.asList((String) current);
  }
  /**
   * Minimal age of the child.
   */
  @JsonIgnore public Integer getChildMinAgeInteger() {
    return (Integer) getValue("childMinAge");
  }
  /**
   * Minimal age of the child.
   */
  @JsonIgnore public Collection<Integer> getChildMinAgeIntegers() {
    final Object current = myData.get("childMinAge");
    if (current == null) return Collections.emptyList();
    if (current instanceof Collection) {
      return (Collection<Integer>) current;
    }
    return Arrays.asList((Integer) current);
  }
  /**
   * Minimal age of the child.
   */
  @JsonIgnore public Long getChildMinAgeLong() {
    return (Long) getValue("childMinAge");
  }
  /**
   * Minimal age of the child.
   */
  @JsonIgnore public Collection<Long> getChildMinAgeLongs() {
    final Object current = myData.get("childMinAge");
    if (current == null) return Collections.emptyList();
    if (current instanceof Collection) {
      return (Collection<Long>) current;
    }
    return Arrays.asList((Long) current);
  }
  /**
   * Minimal age of the child.
   */
  @JsonIgnore public Float getChildMinAgeFloat() {
    return (Float) getValue("childMinAge");
  }
  /**
   * Minimal age of the child.
   */
  @JsonIgnore public Collection<Float> getChildMinAgeFloats() {
    final Object current = myData.get("childMinAge");
    if (current == null) return Collections.emptyList();
    if (current instanceof Collection) {
      return (Collection<Float>) current;
    }
    return Arrays.asList((Float) current);
  }
  /**
   * Minimal age of the child.
   */
  @JsonIgnore public Double getChildMinAgeDouble() {
    return (Double) getValue("childMinAge");
  }
  /**
   * Minimal age of the child.
   */
  @JsonIgnore public Collection<Double> getChildMinAgeDoubles() {
    final Object current = myData.get("childMinAge");
    if (current == null) return Collections.emptyList();
    if (current instanceof Collection) {
      return (Collection<Double>) current;
    }
    return Arrays.asList((Double) current);
  }
  /**
   * Minimal age of the child.
   */
  @JsonIgnore public String getChildMinAgeString() {
    return (String) getValue("childMinAge");
  }
  /**
   * Minimal age of the child.
   */
  @JsonIgnore public Collection<String> getChildMinAgeStrings() {
    final Object current = myData.get("childMinAge");
    if (current == null) return Collections.emptyList();
    if (current instanceof Collection) {
      return (Collection<String>) current;
    }
    return Arrays.asList((String) current);
  }
  protected ParentAudience(java.util.Map<String,Object> data) {
    super(data);
  }
  
  /**
   * Builder for {@link ParentAudience}
   */
  public static class Builder extends PeopleAudience.Builder {
    public Builder(@NotNull HashMap<String,Object> data) {
      super(data);
    }
    @NotNull public ParentAudience build() {
      return new ParentAudience(myData);
    }
    /**
     * Maximal age of the child.
     */
    @NotNull public Builder childMaxAge(@NotNull Integer integer) {
      putValue("childMaxAge", integer);
      return this;
    }
    /**
     * Maximal age of the child.
     */
    @NotNull public Builder childMaxAge(@NotNull Long childMaxAge) {
      putValue("childMaxAge", childMaxAge);
      return this;
    }
    /**
     * Maximal age of the child.
     */
    @NotNull public Builder childMaxAge(@NotNull Float childMaxAge) {
      putValue("childMaxAge", childMaxAge);
      return this;
    }
    /**
     * Maximal age of the child.
     */
    @NotNull public Builder childMaxAge(@NotNull Double childMaxAge) {
      putValue("childMaxAge", childMaxAge);
      return this;
    }
    /**
     * Maximal age of the child.
     */
    @NotNull public Builder childMaxAge(@NotNull String childMaxAge) {
      putValue("childMaxAge", childMaxAge);
      return this;
    }
    /**
     * Minimal age of the child.
     */
    @NotNull public Builder childMinAge(@NotNull Integer integer) {
      putValue("childMinAge", integer);
      return this;
    }
    /**
     * Minimal age of the child.
     */
    @NotNull public Builder childMinAge(@NotNull Long childMinAge) {
      putValue("childMinAge", childMinAge);
      return this;
    }
    /**
     * Minimal age of the child.
     */
    @NotNull public Builder childMinAge(@NotNull Float childMinAge) {
      putValue("childMinAge", childMinAge);
      return this;
    }
    /**
     * Minimal age of the child.
     */
    @NotNull public Builder childMinAge(@NotNull Double childMinAge) {
      putValue("childMinAge", childMinAge);
      return this;
    }
    /**
     * Minimal age of the child.
     */
    @NotNull public Builder childMinAge(@NotNull String childMinAge) {
      putValue("childMinAge", childMinAge);
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
     * Audiences defined by a person's maximum age.
     */
    @NotNull public Builder requiredMaxAge(@NotNull Integer integer) {
      putValue("requiredMaxAge", integer);
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
    @NotNull public Builder additionalType(@NotNull AdditionalType additionalType) {
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
     * A description of the item.
     */
    @NotNull public Builder description(@NotNull DisambiguatingDescription disambiguatingDescription) {
      putValue("description", disambiguatingDescription);
      return this;
    }
    @NotNull public Builder disambiguatingDescription(@NotNull DisambiguatingDescription disambiguatingDescription) {
      putValue("disambiguatingDescription", disambiguatingDescription);
      return this;
    }
    /**
     * An image of the item. This can be a [[URL]] or a fully described [[ImageObject]].
     */
    @NotNull public Builder image(@NotNull Logo logo) {
      putValue("image", logo);
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
     * The identifier property represents any kind of identifier for any kind of [[Thing]], such as ISBNs, GTIN codes, UUIDs etc. Schema.org provides dedicated properties for representing many of these, either as textual strings or as URL (URI) links. See [background notes](/docs/datamodel.html#identifierBg) for more details.
     *         
     */
    @NotNull public Builder identifier(@NotNull Isbn isbn) {
      putValue("identifier", isbn);
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
      if ("childMaxAge".equals(key) && value instanceof Integer) { childMaxAge((Integer)value); return; }
      if ("childMaxAges".equals(key) && value instanceof Integer) { childMaxAge((Integer)value); return; }
      if ("childMaxAge".equals(key) && value instanceof Long) { childMaxAge((Long)value); return; }
      if ("childMaxAges".equals(key) && value instanceof Long) { childMaxAge((Long)value); return; }
      if ("childMaxAge".equals(key) && value instanceof Float) { childMaxAge((Float)value); return; }
      if ("childMaxAges".equals(key) && value instanceof Float) { childMaxAge((Float)value); return; }
      if ("childMaxAge".equals(key) && value instanceof Double) { childMaxAge((Double)value); return; }
      if ("childMaxAges".equals(key) && value instanceof Double) { childMaxAge((Double)value); return; }
      if ("childMaxAge".equals(key) && value instanceof String) { childMaxAge((String)value); return; }
      if ("childMaxAges".equals(key) && value instanceof String) { childMaxAge((String)value); return; }
      if ("childMinAge".equals(key) && value instanceof Integer) { childMinAge((Integer)value); return; }
      if ("childMinAges".equals(key) && value instanceof Integer) { childMinAge((Integer)value); return; }
      if ("childMinAge".equals(key) && value instanceof Long) { childMinAge((Long)value); return; }
      if ("childMinAges".equals(key) && value instanceof Long) { childMinAge((Long)value); return; }
      if ("childMinAge".equals(key) && value instanceof Float) { childMinAge((Float)value); return; }
      if ("childMinAges".equals(key) && value instanceof Float) { childMinAge((Float)value); return; }
      if ("childMinAge".equals(key) && value instanceof Double) { childMinAge((Double)value); return; }
      if ("childMinAges".equals(key) && value instanceof Double) { childMinAge((Double)value); return; }
      if ("childMinAge".equals(key) && value instanceof String) { childMinAge((String)value); return; }
      if ("childMinAges".equals(key) && value instanceof String) { childMinAge((String)value); return; }
      super.fromMap(key, value);
    }
  }
  
}
