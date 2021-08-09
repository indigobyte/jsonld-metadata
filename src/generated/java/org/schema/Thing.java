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
   * @return identifier property set by first invocation of identifier method or {@code null}.
   */
  @JsonIgnore public Identifier getIdentifier() {
    return (Identifier) getValue("identifier");
  }
  /**
   * The identifier property represents any kind of identifier for any kind of [[Thing]], such as ISBNs, GTIN codes, UUIDs etc. Schema.org provides dedicated properties for representing many of these, either as textual strings or as URL (URI) links. See [background notes](/docs/datamodel.html#identifierBg) for more details.
   * 
   * @return all identifier properties as {@link java.util.Collection} or an empty collection 
   * if identifier was not set.
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
   * @return image property set by first invocation of image method or {@code null}.
   */
  @JsonIgnore public Image getImage() {
    return (Image) getValue("image");
  }
  /**
   * An image of the item. This can be a [[URL]] or a fully described [[ImageObject]].
   * @return all image properties as {@link java.util.Collection} or an empty collection 
   * if image was not set.
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
   * @return potentialAction property set by first invocation of potentialAction method or {@code null}.
   */
  @JsonIgnore public Action getPotentialAction() {
    return (Action) getValue("potentialAction");
  }
  /**
   * Indicates a potential Action, which describes an idealized action in which this thing would play an 'object' role.
   * @return all potentialAction properties as {@link java.util.Collection} or an empty collection 
   * if potentialAction was not set.
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
   * @return disambiguatingDescription property set by first invocation of disambiguatingDescription method or {@code null}.
   */
  @JsonIgnore public String getDisambiguatingDescription() {
    return (String) getValue("disambiguatingDescription");
  }
  /**
   * A sub property of description. A short description of the item used to disambiguate from other, similar items. Information from other properties (in particular, name) may be necessary for the description to be useful for disambiguation.
   * @return all disambiguatingDescription properties as {@link java.util.Collection} or an empty collection 
   * if disambiguatingDescription was not set.
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
   * @return description property set by first invocation of description method or {@code null}.
   */
  @JsonIgnore public String getDescription() {
    return (String) getValue("description");
  }
  /**
   * A description of the item.
   * @return all description properties as {@link java.util.Collection} or an empty collection 
   * if description was not set.
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
   * @return url property set by first invocation of url method or {@code null}.
   */
  @JsonIgnore public String getUrl() {
    return (String) getValue("url");
  }
  /**
   * URL of the item.
   * @return all url properties as {@link java.util.Collection} or an empty collection 
   * if url was not set.
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
   * @return additionalType property set by first invocation of additionalType method or {@code null}.
   */
  @JsonIgnore public String getAdditionalType() {
    return (String) getValue("additionalType");
  }
  /**
   * An additional type for the item, typically used for adding more specific types from external vocabularies in microdata syntax. This is a relationship between something and a class that the thing is in. In RDFa syntax, it is better to use the native RDFa syntax - the 'typeof' attribute - for multiple types. Schema.org tools may have only weaker understanding of extra types, in particular those defined externally.
   * @return all additionalType properties as {@link java.util.Collection} or an empty collection 
   * if additionalType was not set.
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
   * @return sameAs property set by first invocation of sameAs method or {@code null}.
   */
  @JsonIgnore public String getSameAs() {
    return (String) getValue("sameAs");
  }
  /**
   * URL of a reference Web page that unambiguously indicates the item's identity. E.g. the URL of the item's Wikipedia page, Wikidata entry, or official website.
   * @return all sameAs properties as {@link java.util.Collection} or an empty collection 
   * if sameAs was not set.
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
   * @return alternateName property set by first invocation of alternateName method or {@code null}.
   */
  @JsonIgnore public String getAlternateName() {
    return (String) getValue("alternateName");
  }
  /**
   * An alias for the item.
   * @return all alternateName properties as {@link java.util.Collection} or an empty collection 
   * if alternateName was not set.
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
   * @return name property set by first invocation of name method or {@code null}.
   */
  @JsonIgnore public String getName() {
    return (String) getValue("name");
  }
  /**
   * The name of the item.
   * @return all name properties as {@link java.util.Collection} or an empty collection 
   * if name was not set.
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
   * @return subjectOf property set by first invocation of subjectOf method or {@code null}.
   */
  @JsonIgnore public CreativeWork getSubjectOfCreativeWork() {
    return (CreativeWork) getValue("subjectOf");
  }
  /**
   * A CreativeWork or Event about this Thing.
   * @return all subjectOf properties as {@link java.util.Collection} or an empty collection 
   * if subjectOf was not set.
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
   * @return subjectOf property set by first invocation of subjectOf method or {@code null}.
   */
  @JsonIgnore public Event getSubjectOfEvent() {
    return (Event) getValue("subjectOf");
  }
  /**
   * A CreativeWork or Event about this Thing.
   * @return all subjectOf properties as {@link java.util.Collection} or an empty collection 
   * if subjectOf was not set.
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
   * @return mainEntityOfPage property set by first invocation of mainEntityOfPage method or {@code null}.
   */
  @JsonIgnore public CreativeWork getMainEntityOfPageCreativeWork() {
    return (CreativeWork) getValue("mainEntityOfPage");
  }
  /**
   * Indicates a page (or other CreativeWork) for which this thing is the main entity being described. See [background notes](/docs/datamodel.html#mainEntityBackground) for details.
   * @return all mainEntityOfPage properties as {@link java.util.Collection} or an empty collection 
   * if mainEntityOfPage was not set.
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
   * @return mainEntityOfPage property set by first invocation of mainEntityOfPage method or {@code null}.
   */
  @JsonIgnore public String getMainEntityOfPageString() {
    return (String) getValue("mainEntityOfPage");
  }
  /**
   * Indicates a page (or other CreativeWork) for which this thing is the main entity being described. See [background notes](/docs/datamodel.html#mainEntityBackground) for details.
   * @return all mainEntityOfPage properties as {@link java.util.Collection} or an empty collection 
   * if mainEntityOfPage was not set.
   */
  @JsonIgnore public java.util.Collection<String> getMainEntityOfPageStrings() {
    final java.lang.Object current = myData.get("mainEntityOfPage");
    if (current == null) return Collections.emptyList();
    if (current instanceof java.util.Collection) {
      return (java.util.Collection<String>) current;
    }
    return Arrays.asList((String) current);
  }
  /**
   * null
   * @return id property set by first invocation of id method or {@code null}.
   */
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
    public void removeValue(@NotNull String key) {
      myData.remove(key);
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
