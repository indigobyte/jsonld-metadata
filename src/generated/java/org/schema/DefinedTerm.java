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
 * A word, name, acronym, phrase, etc. with a formal definition. Often used in the context of category or subject classification, glossaries or dictionaries, product or creative work types, etc. Use the name property for the term being defined, use termCode if the term has an alpha-numeric code allocated, use description to provide the definition of the term.
 */
public class DefinedTerm extends Intangible implements HasDefinedTerm {
  /**
   * A code that identifies this [[DefinedTerm]] within a [[DefinedTermSet]]
   */
  @JsonIgnore public TermCode getTermCode() {
    return (TermCode) getValue("termCode");
  }
  /**
   * A code that identifies this [[DefinedTerm]] within a [[DefinedTermSet]]
   */
  @JsonIgnore public Collection<TermCode> getTermCodes() {
    final Object current = myData.get("termCode");
    if (current == null) return Collections.emptyList();
    if (current instanceof Collection) {
      return (Collection<TermCode>) current;
    }
    return Arrays.asList((TermCode) current);
  }
  /**
   * A [[DefinedTermSet]] that contains this term.
   */
  @JsonIgnore public InDefinedTermSet getInDefinedTermSet() {
    return (InDefinedTermSet) getValue("inDefinedTermSet");
  }
  /**
   * A [[DefinedTermSet]] that contains this term.
   */
  @JsonIgnore public Collection<InDefinedTermSet> getInDefinedTermSets() {
    final Object current = myData.get("inDefinedTermSet");
    if (current == null) return Collections.emptyList();
    if (current instanceof Collection) {
      return (Collection<InDefinedTermSet>) current;
    }
    return Arrays.asList((InDefinedTermSet) current);
  }
  protected DefinedTerm(java.util.Map<String,Object> data) {
    super(data);
  }
  
  /**
   * Builder for {@link DefinedTerm}
   */
  public static class Builder extends Intangible.Builder {
    public Builder(@NotNull HashMap<String,Object> data) {
      super(data);
    }
    @NotNull public DefinedTerm build() {
      return new DefinedTerm(myData);
    }
    /**
     * A code that identifies this [[DefinedTerm]] within a [[DefinedTermSet]]
     */
    @NotNull public Builder termCode(@NotNull TermCode termCode) {
      putValue("termCode", termCode);
      return this;
    }
    /**
     * A [[DefinedTermSet]] that contains this term.
     */
    @NotNull public Builder inDefinedTermSet(@NotNull InDefinedTermSet inDefinedTermSet) {
      putValue("inDefinedTermSet", inDefinedTermSet);
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
      if ("termCode".equals(key) && value instanceof TermCode) { this.termCode((TermCode)value); return; }
      if ("termCodes".equals(key) && value instanceof TermCode) { this.termCode((TermCode)value); return; }
      if ("inDefinedTermSet".equals(key) && value instanceof InDefinedTermSet) { this.inDefinedTermSet((InDefinedTermSet)value); return; }
      if ("inDefinedTermSets".equals(key) && value instanceof InDefinedTermSet) { this.inDefinedTermSet((InDefinedTermSet)value); return; }
      super.fromMap(key, value);
    }
  }
  
}
