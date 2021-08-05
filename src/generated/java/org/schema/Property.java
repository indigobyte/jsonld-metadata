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
 * A property, used to indicate attributes and relationships of some Thing; equivalent to rdf:Property.Equivalent class: http://www.w3.org/1999/02/22-rdf-syntax-ns#Property
 */
public class Property extends Intangible {
  /**
   * Relates a term (i.e. a property, class or enumeration) to one that supersedes it.
   */
  @JsonIgnore public Enumeration getSupersededByEnumeration() {
    return (Enumeration) getValue("supersededBy");
  }
  /**
   * Relates a term (i.e. a property, class or enumeration) to one that supersedes it.
   */
  @JsonIgnore public Collection<Enumeration> getSupersededByEnumerations() {
    final Object current = myData.get("supersededBy");
    if (current == null) return Collections.emptyList();
    if (current instanceof Collection) {
      return (Collection<Enumeration>) current;
    }
    return Arrays.asList((Enumeration) current);
  }
  /**
   * Relates a term (i.e. a property, class or enumeration) to one that supersedes it.
   */
  @JsonIgnore public Property getSupersededByProperty() {
    return (Property) getValue("supersededBy");
  }
  /**
   * Relates a term (i.e. a property, class or enumeration) to one that supersedes it.
   */
  @JsonIgnore public Collection<Property> getSupersededByPropertys() {
    final Object current = myData.get("supersededBy");
    if (current == null) return Collections.emptyList();
    if (current instanceof Collection) {
      return (Collection<Property>) current;
    }
    return Arrays.asList((Property) current);
  }
  /**
   * Relates a property to a property that is its inverse. Inverse properties relate the same pairs of items to each other, but in reversed direction. For example, the 'alumni' and 'alumniOf' properties are inverseOf each other. Some properties don't have explicit inverses; in these situations RDFa and JSON-LD syntax for reverse properties can be used.
   */
  @JsonIgnore public Property getInverseOf() {
    return (Property) getValue("inverseOf");
  }
  /**
   * Relates a property to a property that is its inverse. Inverse properties relate the same pairs of items to each other, but in reversed direction. For example, the 'alumni' and 'alumniOf' properties are inverseOf each other. Some properties don't have explicit inverses; in these situations RDFa and JSON-LD syntax for reverse properties can be used.
   */
  @JsonIgnore public Collection<Property> getInverseOfs() {
    final Object current = myData.get("inverseOf");
    if (current == null) return Collections.emptyList();
    if (current instanceof Collection) {
      return (Collection<Property>) current;
    }
    return Arrays.asList((Property) current);
  }
  protected Property(java.util.Map<String,Object> data) {
    super(data);
  }
  
  /**
   * Builder for {@link Property}
   */
  public static class Builder extends Intangible.Builder {
    public Builder(@NotNull HashMap<String,Object> data) {
      super(data);
    }
    @NotNull public Property build() {
      return new Property(myData);
    }
    /**
     * Relates a term (i.e. a property, class or enumeration) to one that supersedes it.
     */
    @NotNull public Builder supersededBy(@NotNull Enumeration enumeration) {
      putValue("supersededBy", enumeration);
      return this;
    }
    /**
     * Relates a term (i.e. a property, class or enumeration) to one that supersedes it.
     */
    @NotNull public Builder supersededBy(@NotNull Enumeration.Builder enumeration) {
      putValue("supersededBy", enumeration.build());
      return this;
    }
    /**
     * Relates a term (i.e. a property, class or enumeration) to one that supersedes it.
     */
    @NotNull public Builder supersededBy(@NotNull Property property) {
      putValue("supersededBy", property);
      return this;
    }
    /**
     * Relates a term (i.e. a property, class or enumeration) to one that supersedes it.
     */
    @NotNull public Builder supersededBy(@NotNull Property.Builder property) {
      putValue("supersededBy", property.build());
      return this;
    }
    /**
     * Relates a property to a property that is its inverse. Inverse properties relate the same pairs of items to each other, but in reversed direction. For example, the 'alumni' and 'alumniOf' properties are inverseOf each other. Some properties don't have explicit inverses; in these situations RDFa and JSON-LD syntax for reverse properties can be used.
     */
    @NotNull public Builder inverseOf(@NotNull Property property) {
      putValue("inverseOf", property);
      return this;
    }
    /**
     * Relates a property to a property that is its inverse. Inverse properties relate the same pairs of items to each other, but in reversed direction. For example, the 'alumni' and 'alumniOf' properties are inverseOf each other. Some properties don't have explicit inverses; in these situations RDFa and JSON-LD syntax for reverse properties can be used.
     */
    @NotNull public Builder inverseOf(@NotNull Property.Builder property) {
      putValue("inverseOf", property.build());
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
      if ("supersededBy".equals(key) && value instanceof Enumeration) { this.supersededBy((Enumeration)value); return; }
      if ("supersededBys".equals(key) && value instanceof Enumeration) { this.supersededBy((Enumeration)value); return; }
      if ("supersededBy".equals(key) && value instanceof Property) { this.supersededBy((Property)value); return; }
      if ("supersededBys".equals(key) && value instanceof Property) { this.supersededBy((Property)value); return; }
      if ("inverseOf".equals(key) && value instanceof Property) { this.inverseOf((Property)value); return; }
      if ("inverseOfs".equals(key) && value instanceof Property) { this.inverseOf((Property)value); return; }
      super.fromMap(key, value);
    }
  }
  
}
