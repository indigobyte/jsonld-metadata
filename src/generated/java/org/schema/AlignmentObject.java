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
 * An intangible item that describes an alignment between a learning resource and a node in an educational framework.
 * 
 * Should not be used where the nature of the alignment can be described using a simple property, for example to express that a resource [[teaches]] or [[assesses]] a competency.
 */
public class AlignmentObject extends Intangible {
  /**
   * The description of a node in an established educational framework.
   */
  @JsonIgnore public String getTargetDescription() {
    return (String) getValue("targetDescription");
  }
  /**
   * The description of a node in an established educational framework.
   */
  @JsonIgnore public java.util.Collection<String> getTargetDescriptions() {
    final java.lang.Object current = myData.get("targetDescription");
    if (current == null) return Collections.emptyList();
    if (current instanceof java.util.Collection) {
      return (java.util.Collection<String>) current;
    }
    return Arrays.asList((String) current);
  }
  /**
   * The framework to which the resource being described is aligned.
   */
  @JsonIgnore public String getEducationalFramework() {
    return (String) getValue("educationalFramework");
  }
  /**
   * The framework to which the resource being described is aligned.
   */
  @JsonIgnore public java.util.Collection<String> getEducationalFrameworks() {
    final java.lang.Object current = myData.get("educationalFramework");
    if (current == null) return Collections.emptyList();
    if (current instanceof java.util.Collection) {
      return (java.util.Collection<String>) current;
    }
    return Arrays.asList((String) current);
  }
  /**
   * The name of a node in an established educational framework.
   */
  @JsonIgnore public String getTargetName() {
    return (String) getValue("targetName");
  }
  /**
   * The name of a node in an established educational framework.
   */
  @JsonIgnore public java.util.Collection<String> getTargetNames() {
    final java.lang.Object current = myData.get("targetName");
    if (current == null) return Collections.emptyList();
    if (current instanceof java.util.Collection) {
      return (java.util.Collection<String>) current;
    }
    return Arrays.asList((String) current);
  }
  /**
   * A category of alignment between the learning resource and the framework node. Recommended values include: 'requires', 'textComplexity', 'readingLevel', and 'educationalSubject'.
   */
  @JsonIgnore public String getAlignmentType() {
    return (String) getValue("alignmentType");
  }
  /**
   * A category of alignment between the learning resource and the framework node. Recommended values include: 'requires', 'textComplexity', 'readingLevel', and 'educationalSubject'.
   */
  @JsonIgnore public java.util.Collection<String> getAlignmentTypes() {
    final java.lang.Object current = myData.get("alignmentType");
    if (current == null) return Collections.emptyList();
    if (current instanceof java.util.Collection) {
      return (java.util.Collection<String>) current;
    }
    return Arrays.asList((String) current);
  }
  /**
   * The URL of a node in an established educational framework.
   */
  @JsonIgnore public String getTargetUrl() {
    return (String) getValue("targetUrl");
  }
  /**
   * The URL of a node in an established educational framework.
   */
  @JsonIgnore public java.util.Collection<String> getTargetUrls() {
    final java.lang.Object current = myData.get("targetUrl");
    if (current == null) return Collections.emptyList();
    if (current instanceof java.util.Collection) {
      return (java.util.Collection<String>) current;
    }
    return Arrays.asList((String) current);
  }
  protected AlignmentObject(java.util.Map<String,java.lang.Object> data) {
    super(data);
  }
  
  /**
   * Builder for {@link AlignmentObject}
   */
  public static class Builder extends Intangible.Builder {
    public Builder(@NotNull HashMap<String,java.lang.Object> data) {
      super(data);
    }
    @NotNull public AlignmentObject build() {
      return new AlignmentObject(myData);
    }
    /**
     * The description of a node in an established educational framework.
     */
    @NotNull public Builder targetDescription(@NotNull String targetDescription) {
      putValue("targetDescription", targetDescription);
      return this;
    }
    /**
     * The framework to which the resource being described is aligned.
     */
    @NotNull public Builder educationalFramework(@NotNull String educationalFramework) {
      putValue("educationalFramework", educationalFramework);
      return this;
    }
    /**
     * The name of a node in an established educational framework.
     */
    @NotNull public Builder targetName(@NotNull String targetName) {
      putValue("targetName", targetName);
      return this;
    }
    /**
     * A category of alignment between the learning resource and the framework node. Recommended values include: 'requires', 'textComplexity', 'readingLevel', and 'educationalSubject'.
     */
    @NotNull public Builder alignmentType(@NotNull String alignmentType) {
      putValue("alignmentType", alignmentType);
      return this;
    }
    /**
     * The URL of a node in an established educational framework.
     */
    @NotNull public Builder targetUrl(@NotNull String targetUrl) {
      putValue("targetUrl", targetUrl);
      return this;
    }
    /**
     * The identifier property represents any kind of identifier for any kind of [[Thing]], such as ISBNs, GTIN codes, UUIDs etc. Schema.org provides dedicated properties for representing many of these, either as textual strings or as URL (URI) links. See [background notes](/docs/datamodel.html#identifierBg) for more details.
     *         
     */
    @NotNull public Builder identifier(@NotNull Identifier identifier) {
      putValue("identifier", identifier);
      return this;
    }
    /**
     * An image of the item. This can be a [[URL]] or a fully described [[ImageObject]].
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
     * A sub property of description. A short description of the item used to disambiguate from other, similar items. Information from other properties (in particular, name) may be necessary for the description to be useful for disambiguation.
     */
    @NotNull public Builder disambiguatingDescription(@NotNull String disambiguatingDescription) {
      putValue("disambiguatingDescription", disambiguatingDescription);
      return this;
    }
    /**
     * A description of the item.
     */
    @NotNull public Builder description(@NotNull String description) {
      putValue("description", description);
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
    @Override protected void fromMap(String key, java.lang.Object value) {
      if ("targetDescription".equals(key) && value instanceof String) { this.targetDescription((String)value); return; }
      if ("targetDescriptions".equals(key) && value instanceof String) { this.targetDescription((String)value); return; }
      if ("educationalFramework".equals(key) && value instanceof String) { this.educationalFramework((String)value); return; }
      if ("educationalFrameworks".equals(key) && value instanceof String) { this.educationalFramework((String)value); return; }
      if ("targetName".equals(key) && value instanceof String) { this.targetName((String)value); return; }
      if ("targetNames".equals(key) && value instanceof String) { this.targetName((String)value); return; }
      if ("alignmentType".equals(key) && value instanceof String) { this.alignmentType((String)value); return; }
      if ("alignmentTypes".equals(key) && value instanceof String) { this.alignmentType((String)value); return; }
      if ("targetUrl".equals(key) && value instanceof String) { this.targetUrl((String)value); return; }
      if ("targetUrls".equals(key) && value instanceof String) { this.targetUrl((String)value); return; }
      super.fromMap(key, value);
    }
  }
  
}
