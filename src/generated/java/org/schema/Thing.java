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
 * The most generic type of item.
 */
@JsonSerialize(include = JsonSerialize.Inclusion.NON_NULL)
public class Thing implements org.schema.Instrument, Result, Category {
  @JsonProperty("@type") public String getJsonLdType() {
    return getClass().getSimpleName();
  }
  @JsonProperty("@context") public String getJsonLdContext() {
    return "http://schema.org/";
  }
  @JsonAnyGetter
  public java.util.Map<String,java.lang.Object> getData() { return myData; }
  protected java.lang.Object getValue(String key) {
    final java.lang.Object current = myData.get(key);
    if (current instanceof java.util.Collection) {
      return ((java.util.Collection) current).iterator().next();
    }
    return current;
  }
  /**
   * The identifier property represents any kind of identifier for any kind of [[Thing]], such as ISBNs, GTIN codes, UUIDs etc. Schema.org provides dedicated properties for representing many of these, either as textual strings or as URL (URI) links. See [background notes](/docs/datamodel.html#identifierBg) for more details.
   *         
   */
  @JsonIgnore public Identifier getIdentifier() {
    return (Identifier) getValue("identifier");
  }
  /**
   * The identifier property represents any kind of identifier for any kind of [[Thing]], such as ISBNs, GTIN codes, UUIDs etc. Schema.org provides dedicated properties for representing many of these, either as textual strings or as URL (URI) links. See [background notes](/docs/datamodel.html#identifierBg) for more details.
   *         
   */
  @JsonIgnore public java.util.Collection<Identifier> getIdentifiers() {
    final java.lang.Object current = myData.get("identifier");
    if (current == null) return Collections.emptyList();
    if (current instanceof java.util.Collection) {
      return (java.util.Collection<Identifier>) current;
    }
    return Arrays.asList((Identifier) current);
  }
  /**
   * An image of the item. This can be a [[URL]] or a fully described [[ImageObject]].
   */
  @JsonIgnore public Image getImage() {
    return (Image) getValue("image");
  }
  /**
   * An image of the item. This can be a [[URL]] or a fully described [[ImageObject]].
   */
  @JsonIgnore public java.util.Collection<Image> getImages() {
    final java.lang.Object current = myData.get("image");
    if (current == null) return Collections.emptyList();
    if (current instanceof java.util.Collection) {
      return (java.util.Collection<Image>) current;
    }
    return Arrays.asList((Image) current);
  }
  /**
   * Indicates a potential Action, which describes an idealized action in which this thing would play an 'object' role.
   */
  @JsonIgnore public Action getPotentialAction() {
    return (Action) getValue("potentialAction");
  }
  /**
   * Indicates a potential Action, which describes an idealized action in which this thing would play an 'object' role.
   */
  @JsonIgnore public java.util.Collection<Action> getPotentialActions() {
    final java.lang.Object current = myData.get("potentialAction");
    if (current == null) return Collections.emptyList();
    if (current instanceof java.util.Collection) {
      return (java.util.Collection<Action>) current;
    }
    return Arrays.asList((Action) current);
  }
  /**
   * A sub property of description. A short description of the item used to disambiguate from other, similar items. Information from other properties (in particular, name) may be necessary for the description to be useful for disambiguation.
   */
  @JsonIgnore public String getDisambiguatingDescription() {
    return (String) getValue("disambiguatingDescription");
  }
  /**
   * A sub property of description. A short description of the item used to disambiguate from other, similar items. Information from other properties (in particular, name) may be necessary for the description to be useful for disambiguation.
   */
  @JsonIgnore public java.util.Collection<String> getDisambiguatingDescriptions() {
    final java.lang.Object current = myData.get("disambiguatingDescription");
    if (current == null) return Collections.emptyList();
    if (current instanceof java.util.Collection) {
      return (java.util.Collection<String>) current;
    }
    return Arrays.asList((String) current);
  }
  /**
   * A description of the item.
   */
  @JsonIgnore public String getDescription() {
    return (String) getValue("description");
  }
  /**
   * A description of the item.
   */
  @JsonIgnore public java.util.Collection<String> getDescriptions() {
    final java.lang.Object current = myData.get("description");
    if (current == null) return Collections.emptyList();
    if (current instanceof java.util.Collection) {
      return (java.util.Collection<String>) current;
    }
    return Arrays.asList((String) current);
  }
  /**
   * URL of the item.
   */
  @JsonIgnore public String getUrl() {
    return (String) getValue("url");
  }
  /**
   * URL of the item.
   */
  @JsonIgnore public java.util.Collection<String> getUrls() {
    final java.lang.Object current = myData.get("url");
    if (current == null) return Collections.emptyList();
    if (current instanceof java.util.Collection) {
      return (java.util.Collection<String>) current;
    }
    return Arrays.asList((String) current);
  }
  /**
   * An additional type for the item, typically used for adding more specific types from external vocabularies in microdata syntax. This is a relationship between something and a class that the thing is in. In RDFa syntax, it is better to use the native RDFa syntax - the 'typeof' attribute - for multiple types. Schema.org tools may have only weaker understanding of extra types, in particular those defined externally.
   */
  @JsonIgnore public String getAdditionalType() {
    return (String) getValue("additionalType");
  }
  /**
   * An additional type for the item, typically used for adding more specific types from external vocabularies in microdata syntax. This is a relationship between something and a class that the thing is in. In RDFa syntax, it is better to use the native RDFa syntax - the 'typeof' attribute - for multiple types. Schema.org tools may have only weaker understanding of extra types, in particular those defined externally.
   */
  @JsonIgnore public java.util.Collection<String> getAdditionalTypes() {
    final java.lang.Object current = myData.get("additionalType");
    if (current == null) return Collections.emptyList();
    if (current instanceof java.util.Collection) {
      return (java.util.Collection<String>) current;
    }
    return Arrays.asList((String) current);
  }
  /**
   * URL of a reference Web page that unambiguously indicates the item's identity. E.g. the URL of the item's Wikipedia page, Wikidata entry, or official website.
   */
  @JsonIgnore public String getSameAs() {
    return (String) getValue("sameAs");
  }
  /**
   * URL of a reference Web page that unambiguously indicates the item's identity. E.g. the URL of the item's Wikipedia page, Wikidata entry, or official website.
   */
  @JsonIgnore public java.util.Collection<String> getSameAss() {
    final java.lang.Object current = myData.get("sameAs");
    if (current == null) return Collections.emptyList();
    if (current instanceof java.util.Collection) {
      return (java.util.Collection<String>) current;
    }
    return Arrays.asList((String) current);
  }
  /**
   * An alias for the item.
   */
  @JsonIgnore public String getAlternateName() {
    return (String) getValue("alternateName");
  }
  /**
   * An alias for the item.
   */
  @JsonIgnore public java.util.Collection<String> getAlternateNames() {
    final java.lang.Object current = myData.get("alternateName");
    if (current == null) return Collections.emptyList();
    if (current instanceof java.util.Collection) {
      return (java.util.Collection<String>) current;
    }
    return Arrays.asList((String) current);
  }
  /**
   * The name of the item.
   */
  @JsonIgnore public String getName() {
    return (String) getValue("name");
  }
  /**
   * The name of the item.
   */
  @JsonIgnore public java.util.Collection<String> getNames() {
    final java.lang.Object current = myData.get("name");
    if (current == null) return Collections.emptyList();
    if (current instanceof java.util.Collection) {
      return (java.util.Collection<String>) current;
    }
    return Arrays.asList((String) current);
  }
  /**
   * A CreativeWork or Event about this Thing.
   */
  @JsonIgnore public CreativeWork getSubjectOfCreativeWork() {
    return (CreativeWork) getValue("subjectOf");
  }
  /**
   * A CreativeWork or Event about this Thing.
   */
  @JsonIgnore public java.util.Collection<CreativeWork> getSubjectOfCreativeWorks() {
    final java.lang.Object current = myData.get("subjectOf");
    if (current == null) return Collections.emptyList();
    if (current instanceof java.util.Collection) {
      return (java.util.Collection<CreativeWork>) current;
    }
    return Arrays.asList((CreativeWork) current);
  }
  /**
   * A CreativeWork or Event about this Thing.
   */
  @JsonIgnore public Event getSubjectOfEvent() {
    return (Event) getValue("subjectOf");
  }
  /**
   * A CreativeWork or Event about this Thing.
   */
  @JsonIgnore public java.util.Collection<Event> getSubjectOfEvents() {
    final java.lang.Object current = myData.get("subjectOf");
    if (current == null) return Collections.emptyList();
    if (current instanceof java.util.Collection) {
      return (java.util.Collection<Event>) current;
    }
    return Arrays.asList((Event) current);
  }
  /**
   * Indicates a page (or other CreativeWork) for which this thing is the main entity being described. See [background notes](/docs/datamodel.html#mainEntityBackground) for details.
   */
  @JsonIgnore public CreativeWork getMainEntityOfPageCreativeWork() {
    return (CreativeWork) getValue("mainEntityOfPage");
  }
  /**
   * Indicates a page (or other CreativeWork) for which this thing is the main entity being described. See [background notes](/docs/datamodel.html#mainEntityBackground) for details.
   */
  @JsonIgnore public java.util.Collection<CreativeWork> getMainEntityOfPageCreativeWorks() {
    final java.lang.Object current = myData.get("mainEntityOfPage");
    if (current == null) return Collections.emptyList();
    if (current instanceof java.util.Collection) {
      return (java.util.Collection<CreativeWork>) current;
    }
    return Arrays.asList((CreativeWork) current);
  }
  /**
   * Indicates a page (or other CreativeWork) for which this thing is the main entity being described. See [background notes](/docs/datamodel.html#mainEntityBackground) for details.
   */
  @JsonIgnore public String getMainEntityOfPageString() {
    return (String) getValue("mainEntityOfPage");
  }
  /**
   * Indicates a page (or other CreativeWork) for which this thing is the main entity being described. See [background notes](/docs/datamodel.html#mainEntityBackground) for details.
   */
  @JsonIgnore public java.util.Collection<String> getMainEntityOfPageStrings() {
    final java.lang.Object current = myData.get("mainEntityOfPage");
    if (current == null) return Collections.emptyList();
    if (current instanceof java.util.Collection) {
      return (java.util.Collection<String>) current;
    }
    return Arrays.asList((String) current);
  }
  @JsonProperty("@id") public String getId() {
    return (String) getValue("id");
  }
  protected Thing(java.util.Map<String,java.lang.Object> data) {
    myData = data;
  }
  @Override public int hashCode() {
    int result = 0;
    result = 31 * result + (myData != null ? myData.hashCode() : 0);
    return result;
  }
  @Override public boolean equals(java.lang.Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    Thing thing = (Thing) o;
    if (myData != null ? !myData.equals(thing.myData) : thing.myData != null) return false;
    return true;
  }
  
  /**
   * Builder for {@link Thing}
   */
  public static class Builder implements org.schema.ThingBuilder<Thing> {
    public void putValue(String key, java.lang.Object value) {
      if (myData.containsKey(key)) {
        final java.lang.Object current = myData.get(key);
        final java.util.Collection list;
        if (current instanceof java.util.Collection) {
          list = (java.util.Collection) current;
        } else {
          list = new ArrayList<java.lang.Object>();
          list.add(current);
          myData.put(key, list);
        }
        list.add(value);
      } else {
        myData.put(key, value);
      }
    }
    public Builder(@NotNull HashMap<String,java.lang.Object> data) {
      myData = data;
    }
    @NotNull public Thing build() {
      return new Thing(myData);
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
    public void fromMap(java.util.Map<String, java.lang.Object> map) {
      for (java.util.Map.Entry<String, java.lang.Object> entry : map.entrySet()) {
        final String key = entry.getKey();
        java.lang.Object value = entry.getValue();
        if (value instanceof java.util.List) {
          final java.util.List list = (java.util.List) value;
          for (java.lang.Object o : list) {
            if (o instanceof java.util.Map) {
              fromMap(key, ThingDeserializer.fromMap((java.util.Map<String, java.lang.Object>)o));
            } else {
              fromMap(key, o);
            }
          }
        } else {
          if (value instanceof java.util.Map) { value = ThingDeserializer.fromMap((java.util.Map<String,java.lang.Object>)value); }
          fromMap(key, value);
        }
      }
    }
    protected void fromMap(String key, java.lang.Object value) {
      if ("identifier".equals(key) && value instanceof Identifier) { this.identifier((Identifier)value); return; }
      if ("identifiers".equals(key) && value instanceof Identifier) { this.identifier((Identifier)value); return; }
      if ("image".equals(key) && value instanceof Image) { this.image((Image)value); return; }
      if ("images".equals(key) && value instanceof Image) { this.image((Image)value); return; }
      if ("potentialAction".equals(key) && value instanceof Action) { this.potentialAction((Action)value); return; }
      if ("potentialActions".equals(key) && value instanceof Action) { this.potentialAction((Action)value); return; }
      if ("disambiguatingDescription".equals(key) && value instanceof String) { this.disambiguatingDescription((String)value); return; }
      if ("disambiguatingDescriptions".equals(key) && value instanceof String) { this.disambiguatingDescription((String)value); return; }
      if ("description".equals(key) && value instanceof String) { this.description((String)value); return; }
      if ("descriptions".equals(key) && value instanceof String) { this.description((String)value); return; }
      if ("url".equals(key) && value instanceof String) { this.url((String)value); return; }
      if ("urls".equals(key) && value instanceof String) { this.url((String)value); return; }
      if ("additionalType".equals(key) && value instanceof String) { this.additionalType((String)value); return; }
      if ("additionalTypes".equals(key) && value instanceof String) { this.additionalType((String)value); return; }
      if ("sameAs".equals(key) && value instanceof String) { this.sameAs((String)value); return; }
      if ("sameAss".equals(key) && value instanceof String) { this.sameAs((String)value); return; }
      if ("alternateName".equals(key) && value instanceof String) { this.alternateName((String)value); return; }
      if ("alternateNames".equals(key) && value instanceof String) { this.alternateName((String)value); return; }
      if ("name".equals(key) && value instanceof String) { this.name((String)value); return; }
      if ("names".equals(key) && value instanceof String) { this.name((String)value); return; }
      if ("subjectOf".equals(key) && value instanceof CreativeWork) { this.subjectOf((CreativeWork)value); return; }
      if ("subjectOfs".equals(key) && value instanceof CreativeWork) { this.subjectOf((CreativeWork)value); return; }
      if ("subjectOf".equals(key) && value instanceof Event) { this.subjectOf((Event)value); return; }
      if ("subjectOfs".equals(key) && value instanceof Event) { this.subjectOf((Event)value); return; }
      if ("mainEntityOfPage".equals(key) && value instanceof CreativeWork) { this.mainEntityOfPage((CreativeWork)value); return; }
      if ("mainEntityOfPages".equals(key) && value instanceof CreativeWork) { this.mainEntityOfPage((CreativeWork)value); return; }
      if ("mainEntityOfPage".equals(key) && value instanceof String) { this.mainEntityOfPage((String)value); return; }
      if ("mainEntityOfPages".equals(key) && value instanceof String) { this.mainEntityOfPage((String)value); return; }
      if ("id".equals(key) && value instanceof String) { this.id((String)value); return; }
      if ("ids".equals(key) && value instanceof String) { this.id((String)value); return; }
      if ("@id".equals(key) && value instanceof String) { id((String)value); return; }
    }
    protected HashMap<String,java.lang.Object> myData;
  }
  
  protected java.util.Map<String,java.lang.Object> myData;
}
