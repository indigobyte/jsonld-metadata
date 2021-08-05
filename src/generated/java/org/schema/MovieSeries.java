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
 * A series of movies. Included movies can be indicated with the hasPart property.
 */
public class MovieSeries extends CreativeWorkSeries {
  /**
   * An actor, e.g. in tv, radio, movie, video games etc., or in an event. Actors can be associated with individual items or with a series, episode, clip.
   */
  @JsonIgnore public Person getActor() {
    return (Person) getValue("actor");
  }
  /**
   * An actor, e.g. in tv, radio, movie, video games etc., or in an event. Actors can be associated with individual items or with a series, episode, clip.
   */
  @JsonIgnore public Collection<Person> getActors() {
    final Object current = myData.get("actor");
    if (current == null) return Collections.emptyList();
    if (current instanceof Collection) {
      return (Collection<Person>) current;
    }
    return Arrays.asList((Person) current);
  }
  /**
   * A director of e.g. tv, radio, movie, video gaming etc. content, or of an event. Directors can be associated with individual items or with a series, episode, clip.
   */
  @JsonIgnore public Person getDirector() {
    return (Person) getValue("director");
  }
  /**
   * A director of e.g. tv, radio, movie, video gaming etc. content, or of an event. Directors can be associated with individual items or with a series, episode, clip.
   */
  @JsonIgnore public Collection<Person> getDirectors() {
    final Object current = myData.get("director");
    if (current == null) return Collections.emptyList();
    if (current instanceof Collection) {
      return (Collection<Person>) current;
    }
    return Arrays.asList((Person) current);
  }
  /**
   * The composer of the soundtrack.
   */
  @JsonIgnore public MusicGroup getMusicByMusicGroup() {
    return (MusicGroup) getValue("musicBy");
  }
  /**
   * The composer of the soundtrack.
   */
  @JsonIgnore public Collection<MusicGroup> getMusicByMusicGroups() {
    final Object current = myData.get("musicBy");
    if (current == null) return Collections.emptyList();
    if (current instanceof Collection) {
      return (Collection<MusicGroup>) current;
    }
    return Arrays.asList((MusicGroup) current);
  }
  /**
   * The composer of the soundtrack.
   */
  @JsonIgnore public Person getMusicByPerson() {
    return (Person) getValue("musicBy");
  }
  /**
   * The composer of the soundtrack.
   */
  @JsonIgnore public Collection<Person> getMusicByPersons() {
    final Object current = myData.get("musicBy");
    if (current == null) return Collections.emptyList();
    if (current instanceof Collection) {
      return (Collection<Person>) current;
    }
    return Arrays.asList((Person) current);
  }
  /**
   * The production company or studio responsible for the item e.g. series, video game, episode etc.
   */
  @JsonIgnore public Organization getProductionCompany() {
    return (Organization) getValue("productionCompany");
  }
  /**
   * The production company or studio responsible for the item e.g. series, video game, episode etc.
   */
  @JsonIgnore public Collection<Organization> getProductionCompanys() {
    final Object current = myData.get("productionCompany");
    if (current == null) return Collections.emptyList();
    if (current instanceof Collection) {
      return (Collection<Organization>) current;
    }
    return Arrays.asList((Organization) current);
  }
  /**
   * The trailer of a movie or tv/radio series, season, episode, etc.
   */
  @JsonIgnore public VideoObject getTrailer() {
    return (VideoObject) getValue("trailer");
  }
  /**
   * The trailer of a movie or tv/radio series, season, episode, etc.
   */
  @JsonIgnore public Collection<VideoObject> getTrailers() {
    final Object current = myData.get("trailer");
    if (current == null) return Collections.emptyList();
    if (current instanceof Collection) {
      return (Collection<VideoObject>) current;
    }
    return Arrays.asList((VideoObject) current);
  }
  protected MovieSeries(java.util.Map<String,Object> data) {
    super(data);
  }
  
  /**
   * Builder for {@link MovieSeries}
   */
  public static class Builder extends CreativeWorkSeries.Builder {
    public Builder(@NotNull HashMap<String,Object> data) {
      super(data);
    }
    @NotNull public MovieSeries build() {
      return new MovieSeries(myData);
    }
    /**
     * An actor, e.g. in tv, radio, movie, video games etc., or in an event. Actors can be associated with individual items or with a series, episode, clip.
     */
    @NotNull public Builder actor(@NotNull Person person) {
      putValue("actor", person);
      return this;
    }
    /**
     * An actor, e.g. in tv, radio, movie, video games etc., or in an event. Actors can be associated with individual items or with a series, episode, clip.
     */
    @NotNull public Builder actor(@NotNull Person.Builder person) {
      putValue("actor", person.build());
      return this;
    }
    /**
     * A director of e.g. tv, radio, movie, video gaming etc. content, or of an event. Directors can be associated with individual items or with a series, episode, clip.
     */
    @NotNull public Builder director(@NotNull Person person) {
      putValue("director", person);
      return this;
    }
    /**
     * A director of e.g. tv, radio, movie, video gaming etc. content, or of an event. Directors can be associated with individual items or with a series, episode, clip.
     */
    @NotNull public Builder director(@NotNull Person.Builder person) {
      putValue("director", person.build());
      return this;
    }
    /**
     * The composer of the soundtrack.
     */
    @NotNull public Builder musicBy(@NotNull MusicGroup musicGroup) {
      putValue("musicBy", musicGroup);
      return this;
    }
    /**
     * The composer of the soundtrack.
     */
    @NotNull public Builder musicBy(@NotNull MusicGroup.Builder musicGroup) {
      putValue("musicBy", musicGroup.build());
      return this;
    }
    /**
     * The composer of the soundtrack.
     */
    @NotNull public Builder musicBy(@NotNull Person person) {
      putValue("musicBy", person);
      return this;
    }
    /**
     * The composer of the soundtrack.
     */
    @NotNull public Builder musicBy(@NotNull Person.Builder person) {
      putValue("musicBy", person.build());
      return this;
    }
    /**
     * The production company or studio responsible for the item e.g. series, video game, episode etc.
     */
    @NotNull public Builder productionCompany(@NotNull Organization organization) {
      putValue("productionCompany", organization);
      return this;
    }
    /**
     * The production company or studio responsible for the item e.g. series, video game, episode etc.
     */
    @NotNull public Builder productionCompany(@NotNull Organization.Builder organization) {
      putValue("productionCompany", organization.build());
      return this;
    }
    /**
     * The trailer of a movie or tv/radio series, season, episode, etc.
     */
    @NotNull public Builder trailer(@NotNull VideoObject videoObject) {
      putValue("trailer", videoObject);
      return this;
    }
    /**
     * The trailer of a movie or tv/radio series, season, episode, etc.
     */
    @NotNull public Builder trailer(@NotNull VideoObject.Builder videoObject) {
      putValue("trailer", videoObject.build());
      return this;
    }
    /**
     * The end date and time of the item (in [ISO 8601 date format](http://en.wikipedia.org/wiki/ISO_8601)).
     */
    @NotNull public Builder endDate(@NotNull java.util.Date date) {
      putValue("endDate", date);
      return this;
    }
    /**
     * The start date and time of the item (in [ISO 8601 date format](http://en.wikipedia.org/wiki/ISO_8601)).
     */
    @NotNull public Builder startDate(@NotNull java.util.Date date) {
      putValue("startDate", date);
      return this;
    }
    /**
     * The International Standard Serial Number (ISSN) that identifies this serial publication. You can repeat this property to identify different formats of, or the linking ISSN (ISSN-L) for, this serial publication.
     */
    @NotNull public Builder issn(@NotNull Identifier identifier) {
      putValue("issn", identifier);
      return this;
    }
    /**
     * The International Standard Serial Number (ISSN) that identifies this serial publication. You can repeat this property to identify different formats of, or the linking ISSN (ISSN-L) for, this serial publication.
     */
    @NotNull public Builder issn(@NotNull String issn) {
      putValue("issn", issn);
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
     * An alias for the item.
     */
    @NotNull public Builder alternateName(@NotNull String alternateName) {
      putValue("alternateName", alternateName);
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
     * The name of the item.
     */
    @NotNull public Builder name(@NotNull String name) {
      putValue("name", name);
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
      if ("actor".equals(key) && value instanceof Person) { actor((Person)value); return; }
      if ("actors".equals(key) && value instanceof Person) { actor((Person)value); return; }
      if ("director".equals(key) && value instanceof Person) { director((Person)value); return; }
      if ("directors".equals(key) && value instanceof Person) { director((Person)value); return; }
      if ("musicBy".equals(key) && value instanceof MusicGroup) { musicBy((MusicGroup)value); return; }
      if ("musicBys".equals(key) && value instanceof MusicGroup) { musicBy((MusicGroup)value); return; }
      if ("musicBy".equals(key) && value instanceof Person) { musicBy((Person)value); return; }
      if ("musicBys".equals(key) && value instanceof Person) { musicBy((Person)value); return; }
      if ("productionCompany".equals(key) && value instanceof Organization) { productionCompany((Organization)value); return; }
      if ("productionCompanys".equals(key) && value instanceof Organization) { productionCompany((Organization)value); return; }
      if ("trailer".equals(key) && value instanceof VideoObject) { trailer((VideoObject)value); return; }
      if ("trailers".equals(key) && value instanceof VideoObject) { trailer((VideoObject)value); return; }
      super.fromMap(key, value);
    }
  }
  
}
