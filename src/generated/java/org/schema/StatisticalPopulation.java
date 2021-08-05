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
 * A StatisticalPopulation is a set of instances of a certain given type that satisfy some set of constraints. The property &lt;a class=&quot;localLink&quot; href=&quot;http://schema.org/populationType&quot;&gt;populationType&lt;/a&gt; is used to specify the type. Any property that can be used on instances of that type can appear on the statistical population. For example, a &lt;a class=&quot;localLink&quot; href=&quot;http://schema.org/StatisticalPopulation&quot;&gt;StatisticalPopulation&lt;/a&gt; representing all &lt;a class=&quot;localLink&quot; href=&quot;http://schema.org/Person&quot;&gt;Person&lt;/a&gt;s with a &lt;a class=&quot;localLink&quot; href=&quot;http://schema.org/homeLocation&quot;&gt;homeLocation&lt;/a&gt; of East Podunk California, would be described by applying the appropriate &lt;a class=&quot;localLink&quot; href=&quot;http://schema.org/homeLocation&quot;&gt;homeLocation&lt;/a&gt; and &lt;a class=&quot;localLink&quot; href=&quot;http://schema.org/populationType&quot;&gt;populationType&lt;/a&gt; properties to a &lt;a class=&quot;localLink&quot; href=&quot;http://schema.org/StatisticalPopulation&quot;&gt;StatisticalPopulation&lt;/a&gt; item that stands for that set of people.
 * The properties &lt;a class=&quot;localLink&quot; href=&quot;http://schema.org/numConstraints&quot;&gt;numConstraints&lt;/a&gt; and &lt;a class=&quot;localLink&quot; href=&quot;http://schema.org/constrainingProperties&quot;&gt;constrainingProperties&lt;/a&gt; are used to specify which of the populations properties are used to specify the population. Note that the sense of &quot;population&quot; used here is the general sense of a statistical
 * population, and does not imply that the population consists of people. For example, a &lt;a class=&quot;localLink&quot; href=&quot;http://schema.org/populationType&quot;&gt;populationType&lt;/a&gt; of &lt;a class=&quot;localLink&quot; href=&quot;http://schema.org/Event&quot;&gt;Event&lt;/a&gt; or &lt;a class=&quot;localLink&quot; href=&quot;http://schema.org/NewsArticle&quot;&gt;NewsArticle&lt;/a&gt; could be used. See also &lt;a class=&quot;localLink&quot; href=&quot;http://schema.org/Observation&quot;&gt;Observation&lt;/a&gt;, and the &lt;a href=&quot;/docs/data-and-datasets.html&quot;&gt;data and datasets&lt;/a&gt; overview for more details.Source: https://github.com/schemaorg/schemaorg/issues/2291
 */
public class StatisticalPopulation extends Intangible {
  /**
   * Indicates a property used as a constraint to define a &lt;a class=&quot;localLink&quot; href=&quot;http://schema.org/StatisticalPopulation&quot;&gt;StatisticalPopulation&lt;/a&gt; with respect to the set of entities
   *   corresponding to an indicated type (via &lt;a class=&quot;localLink&quot; href=&quot;http://schema.org/populationType&quot;&gt;populationType&lt;/a&gt;).
   */
  @JsonIgnore public Integer getConstrainingProperty() {
    return (Integer) getValue("constrainingProperty");
  }
  /**
   * Indicates a property used as a constraint to define a &lt;a class=&quot;localLink&quot; href=&quot;http://schema.org/StatisticalPopulation&quot;&gt;StatisticalPopulation&lt;/a&gt; with respect to the set of entities
   *   corresponding to an indicated type (via &lt;a class=&quot;localLink&quot; href=&quot;http://schema.org/populationType&quot;&gt;populationType&lt;/a&gt;).
   */
  @JsonIgnore public Collection<Integer> getConstrainingPropertys() {
    final Object current = myData.get("constrainingProperty");
    if (current == null) return Collections.emptyList();
    if (current instanceof Collection) {
      return (Collection<Integer>) current;
    }
    return Arrays.asList((Integer) current);
  }
  /**
   * Indicates the number of constraints (not counting &lt;a class=&quot;localLink&quot; href=&quot;http://schema.org/populationType&quot;&gt;populationType&lt;/a&gt;) defined for a particular &lt;a class=&quot;localLink&quot; href=&quot;http://schema.org/StatisticalPopulation&quot;&gt;StatisticalPopulation&lt;/a&gt;. This helps applications understand if they have access to a sufficiently complete description of a &lt;a class=&quot;localLink&quot; href=&quot;http://schema.org/StatisticalPopulation&quot;&gt;StatisticalPopulation&lt;/a&gt;.
   */
  @JsonIgnore public Integer getNumConstraints() {
    return (Integer) getValue("numConstraints");
  }
  /**
   * Indicates the number of constraints (not counting &lt;a class=&quot;localLink&quot; href=&quot;http://schema.org/populationType&quot;&gt;populationType&lt;/a&gt;) defined for a particular &lt;a class=&quot;localLink&quot; href=&quot;http://schema.org/StatisticalPopulation&quot;&gt;StatisticalPopulation&lt;/a&gt;. This helps applications understand if they have access to a sufficiently complete description of a &lt;a class=&quot;localLink&quot; href=&quot;http://schema.org/StatisticalPopulation&quot;&gt;StatisticalPopulation&lt;/a&gt;.
   */
  @JsonIgnore public Collection<Integer> getNumConstraintss() {
    final Object current = myData.get("numConstraints");
    if (current == null) return Collections.emptyList();
    if (current instanceof Collection) {
      return (Collection<Integer>) current;
    }
    return Arrays.asList((Integer) current);
  }
  protected StatisticalPopulation(java.util.Map<String,Object> data) {
    super(data);
  }
  
  /**
   * Builder for {@link StatisticalPopulation}
   */
  public static class Builder extends Intangible.Builder {
    public Builder(@NotNull HashMap<String,Object> data) {
      super(data);
    }
    @NotNull public StatisticalPopulation build() {
      return new StatisticalPopulation(myData);
    }
    /**
     * Indicates a property used as a constraint to define a &lt;a class=&quot;localLink&quot; href=&quot;http://schema.org/StatisticalPopulation&quot;&gt;StatisticalPopulation&lt;/a&gt; with respect to the set of entities
     *   corresponding to an indicated type (via &lt;a class=&quot;localLink&quot; href=&quot;http://schema.org/populationType&quot;&gt;populationType&lt;/a&gt;).
     */
    @NotNull public Builder constrainingProperty(@NotNull Integer integer) {
      putValue("constrainingProperty", integer);
      return this;
    }
    /**
     * Indicates the number of constraints (not counting &lt;a class=&quot;localLink&quot; href=&quot;http://schema.org/populationType&quot;&gt;populationType&lt;/a&gt;) defined for a particular &lt;a class=&quot;localLink&quot; href=&quot;http://schema.org/StatisticalPopulation&quot;&gt;StatisticalPopulation&lt;/a&gt;. This helps applications understand if they have access to a sufficiently complete description of a &lt;a class=&quot;localLink&quot; href=&quot;http://schema.org/StatisticalPopulation&quot;&gt;StatisticalPopulation&lt;/a&gt;.
     */
    @NotNull public Builder numConstraints(@NotNull Integer integer) {
      putValue("numConstraints", integer);
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
      if ("constrainingProperty".equals(key) && value instanceof Integer) { this.constrainingProperty((Integer)value); return; }
      if ("constrainingPropertys".equals(key) && value instanceof Integer) { this.constrainingProperty((Integer)value); return; }
      if ("numConstraints".equals(key) && value instanceof Integer) { this.numConstraints((Integer)value); return; }
      if ("numConstraintss".equals(key) && value instanceof Integer) { this.numConstraints((Integer)value); return; }
      super.fromMap(key, value);
    }
  }
  
}
