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
public class Thing implements Collection, ActionOption, TargetCollection, Option, Replacee, Replacer {
  @JsonProperty("@type") public String getJsonLdType() {
    return getClass().getSimpleName();
  }
  @JsonProperty("@context") public String getJsonLdContext() {
    return "http://schema.org/";
  }
  @JsonAnyGetter
  public java.util.Map<String,Object> getData() { return myData; }
  protected Object getValue(String key) {
    final Object current = myData.get(key);
    if (current instanceof Collection) {
      return ((Collection) current).iterator().next();
    }
    return current;
  }
  @JsonIgnore public AdditionalType getAdditionalType() {
    return (AdditionalType) getValue("additionalType");
  }
  @JsonIgnore public Collection<AdditionalType> getAdditionalTypes() {
    final Object current = myData.get("additionalType");
    if (current == null) return Collections.emptyList();
    if (current instanceof Collection) {
      return (Collection<AdditionalType>) current;
    }
    return Arrays.asList((AdditionalType) current);
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
  @JsonIgnore public Collection<String> getAlternateNames() {
    final Object current = myData.get("alternateName");
    if (current == null) return Collections.emptyList();
    if (current instanceof Collection) {
      return (Collection<String>) current;
    }
    return Arrays.asList((String) current);
  }
  /**
   * A description of the item.
   */
  @JsonIgnore public DisambiguatingDescription getDescription() {
    return (DisambiguatingDescription) getValue("description");
  }
  /**
   * A description of the item.
   */
  @JsonIgnore public Collection<DisambiguatingDescription> getDescriptions() {
    final Object current = myData.get("description");
    if (current == null) return Collections.emptyList();
    if (current instanceof Collection) {
      return (Collection<DisambiguatingDescription>) current;
    }
    return Arrays.asList((DisambiguatingDescription) current);
  }
  @JsonIgnore public DisambiguatingDescription getDisambiguatingDescription() {
    return (DisambiguatingDescription) getValue("disambiguatingDescription");
  }
  @JsonIgnore public Collection<DisambiguatingDescription> getDisambiguatingDescriptions() {
    final Object current = myData.get("disambiguatingDescription");
    if (current == null) return Collections.emptyList();
    if (current instanceof Collection) {
      return (Collection<DisambiguatingDescription>) current;
    }
    return Arrays.asList((DisambiguatingDescription) current);
  }
  /**
   * An image of the item. This can be a [[URL]] or a fully described [[ImageObject]].
   */
  @JsonIgnore public Logo getImage() {
    return (Logo) getValue("image");
  }
  /**
   * An image of the item. This can be a [[URL]] or a fully described [[ImageObject]].
   */
  @JsonIgnore public Collection<Logo> getImages() {
    final Object current = myData.get("image");
    if (current == null) return Collections.emptyList();
    if (current instanceof Collection) {
      return (Collection<Logo>) current;
    }
    return Arrays.asList((Logo) current);
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
  @JsonIgnore public Collection<CreativeWork> getMainEntityOfPageCreativeWorks() {
    final Object current = myData.get("mainEntityOfPage");
    if (current == null) return Collections.emptyList();
    if (current instanceof Collection) {
      return (Collection<CreativeWork>) current;
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
  @JsonIgnore public Collection<String> getMainEntityOfPageStrings() {
    final Object current = myData.get("mainEntityOfPage");
    if (current == null) return Collections.emptyList();
    if (current instanceof Collection) {
      return (Collection<String>) current;
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
  @JsonIgnore public Collection<String> getSameAss() {
    final Object current = myData.get("sameAs");
    if (current == null) return Collections.emptyList();
    if (current instanceof Collection) {
      return (Collection<String>) current;
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
  @JsonIgnore public Collection<String> getUrls() {
    final Object current = myData.get("url");
    if (current == null) return Collections.emptyList();
    if (current instanceof Collection) {
      return (Collection<String>) current;
    }
    return Arrays.asList((String) current);
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
  @JsonIgnore public Collection<Action> getPotentialActions() {
    final Object current = myData.get("potentialAction");
    if (current == null) return Collections.emptyList();
    if (current instanceof Collection) {
      return (Collection<Action>) current;
    }
    return Arrays.asList((Action) current);
  }
  /**
   * The identifier property represents any kind of identifier for any kind of [[Thing]], such as ISBNs, GTIN codes, UUIDs etc. Schema.org provides dedicated properties for representing many of these, either as textual strings or as URL (URI) links. See [background notes](/docs/datamodel.html#identifierBg) for more details.
   *         
   */
  @JsonIgnore public Isbn getIdentifier() {
    return (Isbn) getValue("identifier");
  }
  /**
   * The identifier property represents any kind of identifier for any kind of [[Thing]], such as ISBNs, GTIN codes, UUIDs etc. Schema.org provides dedicated properties for representing many of these, either as textual strings or as URL (URI) links. See [background notes](/docs/datamodel.html#identifierBg) for more details.
   *         
   */
  @JsonIgnore public Collection<Isbn> getIdentifiers() {
    final Object current = myData.get("identifier");
    if (current == null) return Collections.emptyList();
    if (current instanceof Collection) {
      return (Collection<Isbn>) current;
    }
    return Arrays.asList((Isbn) current);
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
  @JsonIgnore public Collection<CreativeWork> getSubjectOfCreativeWorks() {
    final Object current = myData.get("subjectOf");
    if (current == null) return Collections.emptyList();
    if (current instanceof Collection) {
      return (Collection<CreativeWork>) current;
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
  @JsonIgnore public Collection<Event> getSubjectOfEvents() {
    final Object current = myData.get("subjectOf");
    if (current == null) return Collections.emptyList();
    if (current instanceof Collection) {
      return (Collection<Event>) current;
    }
    return Arrays.asList((Event) current);
  }
  @JsonProperty("@id") public String getId() {
    return (String) getValue("id");
  }
  protected Thing(java.util.Map<String,Object> data) {
    myData = data;
  }
  @Override public int hashCode() {
    int result = 0;
    result = 31 * result + (myData != null ? myData.hashCode() : 0);
    return result;
  }
  @Override public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    Thing thing = (Thing) o;
    if (myData != null ? !myData.equals(thing.myData) : thing.myData != null) return false;
    return true;
  }
  
  /**
   * Builder for {@link Thing}
   */
  public static class Builder implements ThingBuilder<Thing> {
    public void putValue(String key, Object value) {
      if (myData.containsKey(key)) {
        final Object current = myData.get(key);
        final Collection list;
        if (current instanceof Collection) {
          list = (Collection) current;
        } else {
          list = new ArrayList<Object>();
          list.add(current);
          myData.put(key, list);
        }
        list.add(value);
      } else {
        myData.put(key, value);
      }
    }
    public Builder(@NotNull HashMap<String,Object> data) {
      myData = data;
    }
    @NotNull public Thing build() {
      return new Thing(myData);
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
    public void fromMap(java.util.Map<String, Object> map) {
      for (java.util.Map.Entry<String, Object> entry : map.entrySet()) {
        final String key = entry.getKey();
        Object value = entry.getValue();
        if (value instanceof java.util.List) {
          final java.util.List list = (java.util.List) value;
          for (Object o : list) {
            if (o instanceof java.util.Map) {
              fromMap(key, ThingDeserializer.fromMap((java.util.Map<String, Object>)o));
            } else {
              fromMap(key, o);
            }
          }
        } else {
          if (value instanceof java.util.Map) { value = ThingDeserializer.fromMap((java.util.Map<String,Object>)value); }
          fromMap(key, value);
        }
      }
    }
    protected void fromMap(String key, Object value) {
      if ("additionalType".equals(key) && value instanceof AdditionalType) { additionalType((AdditionalType)value); return; }
      if ("additionalTypes".equals(key) && value instanceof AdditionalType) { additionalType((AdditionalType)value); return; }
      if ("alternateName".equals(key) && value instanceof String) { alternateName((String)value); return; }
      if ("alternateNames".equals(key) && value instanceof String) { alternateName((String)value); return; }
      if ("description".equals(key) && value instanceof DisambiguatingDescription) { description((DisambiguatingDescription)value); return; }
      if ("descriptions".equals(key) && value instanceof DisambiguatingDescription) { description((DisambiguatingDescription)value); return; }
      if ("disambiguatingDescription".equals(key) && value instanceof DisambiguatingDescription) { disambiguatingDescription((DisambiguatingDescription)value); return; }
      if ("disambiguatingDescriptions".equals(key) && value instanceof DisambiguatingDescription) { disambiguatingDescription((DisambiguatingDescription)value); return; }
      if ("image".equals(key) && value instanceof Logo) { image((Logo)value); return; }
      if ("images".equals(key) && value instanceof Logo) { image((Logo)value); return; }
      if ("mainEntityOfPage".equals(key) && value instanceof CreativeWork) { mainEntityOfPage((CreativeWork)value); return; }
      if ("mainEntityOfPages".equals(key) && value instanceof CreativeWork) { mainEntityOfPage((CreativeWork)value); return; }
      if ("mainEntityOfPage".equals(key) && value instanceof String) { mainEntityOfPage((String)value); return; }
      if ("mainEntityOfPages".equals(key) && value instanceof String) { mainEntityOfPage((String)value); return; }
      if ("sameAs".equals(key) && value instanceof String) { sameAs((String)value); return; }
      if ("sameAss".equals(key) && value instanceof String) { sameAs((String)value); return; }
      if ("url".equals(key) && value instanceof String) { url((String)value); return; }
      if ("urls".equals(key) && value instanceof String) { url((String)value); return; }
      if ("potentialAction".equals(key) && value instanceof Action) { potentialAction((Action)value); return; }
      if ("potentialActions".equals(key) && value instanceof Action) { potentialAction((Action)value); return; }
      if ("identifier".equals(key) && value instanceof Isbn) { identifier((Isbn)value); return; }
      if ("identifiers".equals(key) && value instanceof Isbn) { identifier((Isbn)value); return; }
      if ("subjectOf".equals(key) && value instanceof CreativeWork) { subjectOf((CreativeWork)value); return; }
      if ("subjectOfs".equals(key) && value instanceof CreativeWork) { subjectOf((CreativeWork)value); return; }
      if ("subjectOf".equals(key) && value instanceof Event) { subjectOf((Event)value); return; }
      if ("subjectOfs".equals(key) && value instanceof Event) { subjectOf((Event)value); return; }
      if ("id".equals(key) && value instanceof String) { id((String)value); return; }
      if ("ids".equals(key) && value instanceof String) { id((String)value); return; }
      if ("@id".equals(key) && value instanceof String) { id((String)value); return; }
    }
    protected HashMap<String,Object> myData;
  }
  
  protected java.util.Map<String,Object> myData;
}
