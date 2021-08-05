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
public class Thing implements About, Category {
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
   * An additional type for the item, typically used for adding more specific types from external vocabularies in microdata syntax. This is a relationship between something and a class that the thing is in. In RDFa syntax, it is better to use the native RDFa syntax - the 'typeof' attribute - for multiple types. Schema.org tools may have only weaker understanding of extra types, in particular those defined externally.
   */
  @JsonIgnore public String getAdditionalType() {
    return (String) getValue("additionalType");
  }
  /**
   * An additional type for the item, typically used for adding more specific types from external vocabularies in microdata syntax. This is a relationship between something and a class that the thing is in. In RDFa syntax, it is better to use the native RDFa syntax - the 'typeof' attribute - for multiple types. Schema.org tools may have only weaker understanding of extra types, in particular those defined externally.
   */
  @JsonIgnore public Collection<String> getAdditionalTypes() {
    final Object current = myData.get("additionalType");
    if (current == null) return Collections.emptyList();
    if (current instanceof Collection) {
      return (Collection<String>) current;
    }
    return Arrays.asList((String) current);
  }
  /**
   * A sub property of description. A short description of the item used to disambiguate from other, similar items. Information from other properties (in particular, name) may be necessary for the description to be useful for disambiguation.
   */
  @JsonIgnore public Description getDisambiguatingDescription() {
    return (Description) getValue("disambiguatingDescription");
  }
  /**
   * A sub property of description. A short description of the item used to disambiguate from other, similar items. Information from other properties (in particular, name) may be necessary for the description to be useful for disambiguation.
   */
  @JsonIgnore public Collection<Description> getDisambiguatingDescriptions() {
    final Object current = myData.get("disambiguatingDescription");
    if (current == null) return Collections.emptyList();
    if (current instanceof Collection) {
      return (Collection<Description>) current;
    }
    return Arrays.asList((Description) current);
  }
  /**
   * A description of the item.
   */
  @JsonIgnore public Description getDescription() {
    return (Description) getValue("description");
  }
  /**
   * A description of the item.
   */
  @JsonIgnore public Collection<Description> getDescriptions() {
    final Object current = myData.get("description");
    if (current == null) return Collections.emptyList();
    if (current instanceof Collection) {
      return (Collection<Description>) current;
    }
    return Arrays.asList((Description) current);
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
   * The name of the item.
   */
  @JsonIgnore public String getName() {
    return (String) getValue("name");
  }
  /**
   * The name of the item.
   */
  @JsonIgnore public Collection<String> getNames() {
    final Object current = myData.get("name");
    if (current == null) return Collections.emptyList();
    if (current instanceof Collection) {
      return (Collection<String>) current;
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
  @JsonIgnore public Collection<String> getAlternateNames() {
    final Object current = myData.get("alternateName");
    if (current == null) return Collections.emptyList();
    if (current instanceof Collection) {
      return (Collection<String>) current;
    }
    return Arrays.asList((String) current);
  }
  /**
   * An image of the item. This can be a &lt;a class=&quot;localLink&quot; href=&quot;http://schema.org/URL&quot;&gt;URL&lt;/a&gt; or a fully described &lt;a class=&quot;localLink&quot; href=&quot;http://schema.org/ImageObject&quot;&gt;ImageObject&lt;/a&gt;.
   */
  @JsonIgnore public Image getImage() {
    return (Image) getValue("image");
  }
  /**
   * An image of the item. This can be a &lt;a class=&quot;localLink&quot; href=&quot;http://schema.org/URL&quot;&gt;URL&lt;/a&gt; or a fully described &lt;a class=&quot;localLink&quot; href=&quot;http://schema.org/ImageObject&quot;&gt;ImageObject&lt;/a&gt;.
   */
  @JsonIgnore public Collection<Image> getImages() {
    final Object current = myData.get("image");
    if (current == null) return Collections.emptyList();
    if (current instanceof Collection) {
      return (Collection<Image>) current;
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
  @JsonIgnore public Collection<Action> getPotentialActions() {
    final Object current = myData.get("potentialAction");
    if (current == null) return Collections.emptyList();
    if (current instanceof Collection) {
      return (Collection<Action>) current;
    }
    return Arrays.asList((Action) current);
  }
  /**
   * Indicates a page (or other CreativeWork) for which this thing is the main entity being described. See &lt;a href=&quot;/docs/datamodel.html#mainEntityBackground&quot;&gt;background notes&lt;/a&gt; for details.
   */
  @JsonIgnore public CreativeWork getMainEntityOfPageCreativeWork() {
    return (CreativeWork) getValue("mainEntityOfPage");
  }
  /**
   * Indicates a page (or other CreativeWork) for which this thing is the main entity being described. See &lt;a href=&quot;/docs/datamodel.html#mainEntityBackground&quot;&gt;background notes&lt;/a&gt; for details.
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
   * Indicates a page (or other CreativeWork) for which this thing is the main entity being described. See &lt;a href=&quot;/docs/datamodel.html#mainEntityBackground&quot;&gt;background notes&lt;/a&gt; for details.
   */
  @JsonIgnore public String getMainEntityOfPageString() {
    return (String) getValue("mainEntityOfPage");
  }
  /**
   * Indicates a page (or other CreativeWork) for which this thing is the main entity being described. See &lt;a href=&quot;/docs/datamodel.html#mainEntityBackground&quot;&gt;background notes&lt;/a&gt; for details.
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
      if ("url".equals(key) && value instanceof String) { this.url((String)value); return; }
      if ("urls".equals(key) && value instanceof String) { this.url((String)value); return; }
      if ("additionalType".equals(key) && value instanceof String) { this.additionalType((String)value); return; }
      if ("additionalTypes".equals(key) && value instanceof String) { this.additionalType((String)value); return; }
      if ("disambiguatingDescription".equals(key) && value instanceof Description) { this.disambiguatingDescription((Description)value); return; }
      if ("disambiguatingDescriptions".equals(key) && value instanceof Description) { this.disambiguatingDescription((Description)value); return; }
      if ("description".equals(key) && value instanceof Description) { this.description((Description)value); return; }
      if ("descriptions".equals(key) && value instanceof Description) { this.description((Description)value); return; }
      if ("sameAs".equals(key) && value instanceof String) { this.sameAs((String)value); return; }
      if ("sameAss".equals(key) && value instanceof String) { this.sameAs((String)value); return; }
      if ("name".equals(key) && value instanceof String) { this.name((String)value); return; }
      if ("names".equals(key) && value instanceof String) { this.name((String)value); return; }
      if ("alternateName".equals(key) && value instanceof String) { this.alternateName((String)value); return; }
      if ("alternateNames".equals(key) && value instanceof String) { this.alternateName((String)value); return; }
      if ("image".equals(key) && value instanceof Image) { this.image((Image)value); return; }
      if ("images".equals(key) && value instanceof Image) { this.image((Image)value); return; }
      if ("potentialAction".equals(key) && value instanceof Action) { this.potentialAction((Action)value); return; }
      if ("potentialActions".equals(key) && value instanceof Action) { this.potentialAction((Action)value); return; }
      if ("mainEntityOfPage".equals(key) && value instanceof CreativeWork) { this.mainEntityOfPage((CreativeWork)value); return; }
      if ("mainEntityOfPages".equals(key) && value instanceof CreativeWork) { this.mainEntityOfPage((CreativeWork)value); return; }
      if ("mainEntityOfPage".equals(key) && value instanceof String) { this.mainEntityOfPage((String)value); return; }
      if ("mainEntityOfPages".equals(key) && value instanceof String) { this.mainEntityOfPage((String)value); return; }
      if ("subjectOf".equals(key) && value instanceof CreativeWork) { this.subjectOf((CreativeWork)value); return; }
      if ("subjectOfs".equals(key) && value instanceof CreativeWork) { this.subjectOf((CreativeWork)value); return; }
      if ("subjectOf".equals(key) && value instanceof Event) { this.subjectOf((Event)value); return; }
      if ("subjectOfs".equals(key) && value instanceof Event) { this.subjectOf((Event)value); return; }
      if ("id".equals(key) && value instanceof String) { this.id((String)value); return; }
      if ("ids".equals(key) && value instanceof String) { this.id((String)value); return; }
      if ("@id".equals(key) && value instanceof String) { id((String)value); return; }
    }
    protected HashMap<String,Object> myData;
  }
  
  protected java.util.Map<String,Object> myData;
}
