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
 * A video game series.
 */
public class VideoGameSeries extends CreativeWorkSeries {
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
   * An episode of a tv, radio or game media within a series or season.
   */
  @JsonIgnore public Episode getEpisodeEpisode() {
    return (Episode) getValue("episode");
  }
  /**
   * An episode of a tv, radio or game media within a series or season.
   */
  @JsonIgnore public Collection<Episode> getEpisodeEpisodes() {
    final Object current = myData.get("episode");
    if (current == null) return Collections.emptyList();
    if (current instanceof Collection) {
      return (Collection<Episode>) current;
    }
    return Arrays.asList((Episode) current);
  }
  /**
   * An episode of a tv, radio or game media within a series or season.
   */
  @JsonIgnore public HasPart getEpisodeHasPart() {
    return (HasPart) getValue("episode");
  }
  /**
   * An episode of a tv, radio or game media within a series or season.
   */
  @JsonIgnore public Collection<HasPart> getEpisodeHasParts() {
    final Object current = myData.get("episode");
    if (current == null) return Collections.emptyList();
    if (current instanceof Collection) {
      return (Collection<HasPart>) current;
    }
    return Arrays.asList((HasPart) current);
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
   * The number of episodes in this season or series.
   */
  @JsonIgnore public Integer getNumberOfEpisodes() {
    return (Integer) getValue("numberOfEpisodes");
  }
  /**
   * The number of episodes in this season or series.
   */
  @JsonIgnore public Collection<Integer> getNumberOfEpisodess() {
    final Object current = myData.get("numberOfEpisodes");
    if (current == null) return Collections.emptyList();
    if (current instanceof Collection) {
      return (Collection<Integer>) current;
    }
    return Arrays.asList((Integer) current);
  }
  /**
   * The number of seasons in this series.
   */
  @JsonIgnore public Integer getNumberOfSeasons() {
    return (Integer) getValue("numberOfSeasons");
  }
  /**
   * The number of seasons in this series.
   */
  @JsonIgnore public Collection<Integer> getNumberOfSeasonss() {
    final Object current = myData.get("numberOfSeasons");
    if (current == null) return Collections.emptyList();
    if (current instanceof Collection) {
      return (Collection<Integer>) current;
    }
    return Arrays.asList((Integer) current);
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
   * A season that is part of the media series.
   */
  @JsonIgnore public CreativeWorkSeason getContainsSeasonCreativeWorkSeason() {
    return (CreativeWorkSeason) getValue("containsSeason");
  }
  /**
   * A season that is part of the media series.
   */
  @JsonIgnore public Collection<CreativeWorkSeason> getContainsSeasonCreativeWorkSeasons() {
    final Object current = myData.get("containsSeason");
    if (current == null) return Collections.emptyList();
    if (current instanceof Collection) {
      return (Collection<CreativeWorkSeason>) current;
    }
    return Arrays.asList((CreativeWorkSeason) current);
  }
  /**
   * A season that is part of the media series.
   */
  @JsonIgnore public HasPart getContainsSeasonHasPart() {
    return (HasPart) getValue("containsSeason");
  }
  /**
   * A season that is part of the media series.
   */
  @JsonIgnore public Collection<HasPart> getContainsSeasonHasParts() {
    final Object current = myData.get("containsSeason");
    if (current == null) return Collections.emptyList();
    if (current instanceof Collection) {
      return (Collection<HasPart>) current;
    }
    return Arrays.asList((HasPart) current);
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
  /**
   * Indicate how many people can play this game (minimum, maximum, or range).
   */
  @JsonIgnore public QuantitativeValue getNumberOfPlayers() {
    return (QuantitativeValue) getValue("numberOfPlayers");
  }
  /**
   * Indicate how many people can play this game (minimum, maximum, or range).
   */
  @JsonIgnore public Collection<QuantitativeValue> getNumberOfPlayerss() {
    final Object current = myData.get("numberOfPlayers");
    if (current == null) return Collections.emptyList();
    if (current instanceof Collection) {
      return (Collection<QuantitativeValue>) current;
    }
    return Arrays.asList((QuantitativeValue) current);
  }
  /**
   * The task that a player-controlled character, or group of characters may complete in order to gain a reward.
   */
  @JsonIgnore public Thing getQuest() {
    return (Thing) getValue("quest");
  }
  /**
   * The task that a player-controlled character, or group of characters may complete in order to gain a reward.
   */
  @JsonIgnore public Collection<Thing> getQuests() {
    final Object current = myData.get("quest");
    if (current == null) return Collections.emptyList();
    if (current instanceof Collection) {
      return (Collection<Thing>) current;
    }
    return Arrays.asList((Thing) current);
  }
  /**
   * An item is an object within the game world that can be collected by a player or, occasionally, a non-player character.
   */
  @JsonIgnore public Thing getGameItem() {
    return (Thing) getValue("gameItem");
  }
  /**
   * An item is an object within the game world that can be collected by a player or, occasionally, a non-player character.
   */
  @JsonIgnore public Collection<Thing> getGameItems() {
    final Object current = myData.get("gameItem");
    if (current == null) return Collections.emptyList();
    if (current instanceof Collection) {
      return (Collection<Thing>) current;
    }
    return Arrays.asList((Thing) current);
  }
  /**
   * A piece of data that represents a particular aspect of a fictional character (skill, power, character points, advantage, disadvantage).
   */
  @JsonIgnore public Thing getCharacterAttribute() {
    return (Thing) getValue("characterAttribute");
  }
  /**
   * A piece of data that represents a particular aspect of a fictional character (skill, power, character points, advantage, disadvantage).
   */
  @JsonIgnore public Collection<Thing> getCharacterAttributes() {
    final Object current = myData.get("characterAttribute");
    if (current == null) return Collections.emptyList();
    if (current instanceof Collection) {
      return (Collection<Thing>) current;
    }
    return Arrays.asList((Thing) current);
  }
  /**
   * Indicates whether this game is multi-player, co-op or single-player.  The game can be marked as multi-player, co-op and single-player at the same time.
   */
  @JsonIgnore public GamePlayMode getPlayMode() {
    return (GamePlayMode) getValue("playMode");
  }
  /**
   * Indicates whether this game is multi-player, co-op or single-player.  The game can be marked as multi-player, co-op and single-player at the same time.
   */
  @JsonIgnore public Collection<GamePlayMode> getPlayModes() {
    final Object current = myData.get("playMode");
    if (current == null) return Collections.emptyList();
    if (current instanceof Collection) {
      return (Collection<GamePlayMode>) current;
    }
    return Arrays.asList((GamePlayMode) current);
  }
  /**
   * Cheat codes to the game.
   */
  @JsonIgnore public CreativeWork getCheatCode() {
    return (CreativeWork) getValue("cheatCode");
  }
  /**
   * Cheat codes to the game.
   */
  @JsonIgnore public Collection<CreativeWork> getCheatCodes() {
    final Object current = myData.get("cheatCode");
    if (current == null) return Collections.emptyList();
    if (current instanceof Collection) {
      return (Collection<CreativeWork>) current;
    }
    return Arrays.asList((CreativeWork) current);
  }
  /**
   * The electronic systems used to play <a href="http://en.wikipedia.org/wiki/Category:Video_game_platforms">video games</a>.
   */
  @JsonIgnore public String getGamePlatformString() {
    return (String) getValue("gamePlatform");
  }
  /**
   * The electronic systems used to play <a href="http://en.wikipedia.org/wiki/Category:Video_game_platforms">video games</a>.
   */
  @JsonIgnore public Collection<String> getGamePlatformStrings() {
    final Object current = myData.get("gamePlatform");
    if (current == null) return Collections.emptyList();
    if (current instanceof Collection) {
      return (Collection<String>) current;
    }
    return Arrays.asList((String) current);
  }
  /**
   * The electronic systems used to play <a href="http://en.wikipedia.org/wiki/Category:Video_game_platforms">video games</a>.
   */
  @JsonIgnore public Thing getGamePlatformThing() {
    return (Thing) getValue("gamePlatform");
  }
  /**
   * The electronic systems used to play <a href="http://en.wikipedia.org/wiki/Category:Video_game_platforms">video games</a>.
   */
  @JsonIgnore public Collection<Thing> getGamePlatformThings() {
    final Object current = myData.get("gamePlatform");
    if (current == null) return Collections.emptyList();
    if (current instanceof Collection) {
      return (Collection<Thing>) current;
    }
    return Arrays.asList((Thing) current);
  }
  /**
   * Real or fictional location of the game (or part of game).
   */
  @JsonIgnore public Place getGameLocationPlace() {
    return (Place) getValue("gameLocation");
  }
  /**
   * Real or fictional location of the game (or part of game).
   */
  @JsonIgnore public Collection<Place> getGameLocationPlaces() {
    final Object current = myData.get("gameLocation");
    if (current == null) return Collections.emptyList();
    if (current instanceof Collection) {
      return (Collection<Place>) current;
    }
    return Arrays.asList((Place) current);
  }
  /**
   * Real or fictional location of the game (or part of game).
   */
  @JsonIgnore public PostalAddress getGameLocationPostalAddress() {
    return (PostalAddress) getValue("gameLocation");
  }
  /**
   * Real or fictional location of the game (or part of game).
   */
  @JsonIgnore public Collection<PostalAddress> getGameLocationPostalAddresss() {
    final Object current = myData.get("gameLocation");
    if (current == null) return Collections.emptyList();
    if (current instanceof Collection) {
      return (Collection<PostalAddress>) current;
    }
    return Arrays.asList((PostalAddress) current);
  }
  /**
   * Real or fictional location of the game (or part of game).
   */
  @JsonIgnore public String getGameLocationString() {
    return (String) getValue("gameLocation");
  }
  /**
   * Real or fictional location of the game (or part of game).
   */
  @JsonIgnore public Collection<String> getGameLocationStrings() {
    final Object current = myData.get("gameLocation");
    if (current == null) return Collections.emptyList();
    if (current instanceof Collection) {
      return (Collection<String>) current;
    }
    return Arrays.asList((String) current);
  }
  protected VideoGameSeries(java.util.Map<String,Object> data) {
    super(data);
  }
  
  /**
   * Builder for {@link VideoGameSeries}
   */
  public static class Builder extends CreativeWorkSeries.Builder {
    public Builder(@NotNull HashMap<String,Object> data) {
      super(data);
    }
    @NotNull public VideoGameSeries build() {
      return new VideoGameSeries(myData);
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
     * An episode of a tv, radio or game media within a series or season.
     */
    @NotNull public Builder episode(@NotNull Episode episode) {
      putValue("episode", episode);
      return this;
    }
    /**
     * An episode of a tv, radio or game media within a series or season.
     */
    @NotNull public Builder episode(@NotNull Episode.Builder episode) {
      putValue("episode", episode.build());
      return this;
    }
    /**
     * An episode of a tv, radio or game media within a series or season.
     */
    @NotNull public Builder episode(@NotNull HasPart hasPart) {
      putValue("episode", hasPart);
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
     * The number of episodes in this season or series.
     */
    @NotNull public Builder numberOfEpisodes(@NotNull Integer integer) {
      putValue("numberOfEpisodes", integer);
      return this;
    }
    /**
     * The number of seasons in this series.
     */
    @NotNull public Builder numberOfSeasons(@NotNull Integer integer) {
      putValue("numberOfSeasons", integer);
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
     * A season that is part of the media series.
     */
    @NotNull public Builder containsSeason(@NotNull CreativeWorkSeason creativeWorkSeason) {
      putValue("containsSeason", creativeWorkSeason);
      return this;
    }
    /**
     * A season that is part of the media series.
     */
    @NotNull public Builder containsSeason(@NotNull CreativeWorkSeason.Builder creativeWorkSeason) {
      putValue("containsSeason", creativeWorkSeason.build());
      return this;
    }
    /**
     * A season that is part of the media series.
     */
    @NotNull public Builder containsSeason(@NotNull HasPart hasPart) {
      putValue("containsSeason", hasPart);
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
     * Indicate how many people can play this game (minimum, maximum, or range).
     */
    @NotNull public Builder numberOfPlayers(@NotNull QuantitativeValue quantitativeValue) {
      putValue("numberOfPlayers", quantitativeValue);
      return this;
    }
    /**
     * Indicate how many people can play this game (minimum, maximum, or range).
     */
    @NotNull public Builder numberOfPlayers(@NotNull QuantitativeValue.Builder quantitativeValue) {
      putValue("numberOfPlayers", quantitativeValue.build());
      return this;
    }
    /**
     * The task that a player-controlled character, or group of characters may complete in order to gain a reward.
     */
    @NotNull public Builder quest(@NotNull Thing thing) {
      putValue("quest", thing);
      return this;
    }
    /**
     * The task that a player-controlled character, or group of characters may complete in order to gain a reward.
     */
    @NotNull public Builder quest(@NotNull Thing.Builder thing) {
      putValue("quest", thing.build());
      return this;
    }
    /**
     * An item is an object within the game world that can be collected by a player or, occasionally, a non-player character.
     */
    @NotNull public Builder gameItem(@NotNull Thing thing) {
      putValue("gameItem", thing);
      return this;
    }
    /**
     * An item is an object within the game world that can be collected by a player or, occasionally, a non-player character.
     */
    @NotNull public Builder gameItem(@NotNull Thing.Builder thing) {
      putValue("gameItem", thing.build());
      return this;
    }
    /**
     * A piece of data that represents a particular aspect of a fictional character (skill, power, character points, advantage, disadvantage).
     */
    @NotNull public Builder characterAttribute(@NotNull Thing thing) {
      putValue("characterAttribute", thing);
      return this;
    }
    /**
     * A piece of data that represents a particular aspect of a fictional character (skill, power, character points, advantage, disadvantage).
     */
    @NotNull public Builder characterAttribute(@NotNull Thing.Builder thing) {
      putValue("characterAttribute", thing.build());
      return this;
    }
    /**
     * Indicates whether this game is multi-player, co-op or single-player.  The game can be marked as multi-player, co-op and single-player at the same time.
     */
    @NotNull public Builder playMode(@NotNull GamePlayMode gamePlayMode) {
      putValue("playMode", gamePlayMode);
      return this;
    }
    /**
     * Cheat codes to the game.
     */
    @NotNull public Builder cheatCode(@NotNull CreativeWork creativeWork) {
      putValue("cheatCode", creativeWork);
      return this;
    }
    /**
     * Cheat codes to the game.
     */
    @NotNull public Builder cheatCode(@NotNull CreativeWork.Builder creativeWork) {
      putValue("cheatCode", creativeWork.build());
      return this;
    }
    /**
     * The electronic systems used to play <a href="http://en.wikipedia.org/wiki/Category:Video_game_platforms">video games</a>.
     */
    @NotNull public Builder gamePlatform(@NotNull String gamePlatform) {
      putValue("gamePlatform", gamePlatform);
      return this;
    }
    /**
     * The electronic systems used to play <a href="http://en.wikipedia.org/wiki/Category:Video_game_platforms">video games</a>.
     */
    @NotNull public Builder gamePlatform(@NotNull Thing thing) {
      putValue("gamePlatform", thing);
      return this;
    }
    /**
     * The electronic systems used to play <a href="http://en.wikipedia.org/wiki/Category:Video_game_platforms">video games</a>.
     */
    @NotNull public Builder gamePlatform(@NotNull Thing.Builder thing) {
      putValue("gamePlatform", thing.build());
      return this;
    }
    /**
     * Real or fictional location of the game (or part of game).
     */
    @NotNull public Builder gameLocation(@NotNull Place place) {
      putValue("gameLocation", place);
      return this;
    }
    /**
     * Real or fictional location of the game (or part of game).
     */
    @NotNull public Builder gameLocation(@NotNull Place.Builder place) {
      putValue("gameLocation", place.build());
      return this;
    }
    /**
     * Real or fictional location of the game (or part of game).
     */
    @NotNull public Builder gameLocation(@NotNull PostalAddress postalAddress) {
      putValue("gameLocation", postalAddress);
      return this;
    }
    /**
     * Real or fictional location of the game (or part of game).
     */
    @NotNull public Builder gameLocation(@NotNull PostalAddress.Builder postalAddress) {
      putValue("gameLocation", postalAddress.build());
      return this;
    }
    /**
     * Real or fictional location of the game (or part of game).
     */
    @NotNull public Builder gameLocation(@NotNull String gameLocation) {
      putValue("gameLocation", gameLocation);
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
      if ("episode".equals(key) && value instanceof Episode) { episode((Episode)value); return; }
      if ("episodes".equals(key) && value instanceof Episode) { episode((Episode)value); return; }
      if ("episode".equals(key) && value instanceof HasPart) { episode((HasPart)value); return; }
      if ("episodes".equals(key) && value instanceof HasPart) { episode((HasPart)value); return; }
      if ("musicBy".equals(key) && value instanceof MusicGroup) { musicBy((MusicGroup)value); return; }
      if ("musicBys".equals(key) && value instanceof MusicGroup) { musicBy((MusicGroup)value); return; }
      if ("musicBy".equals(key) && value instanceof Person) { musicBy((Person)value); return; }
      if ("musicBys".equals(key) && value instanceof Person) { musicBy((Person)value); return; }
      if ("numberOfEpisodes".equals(key) && value instanceof Integer) { numberOfEpisodes((Integer)value); return; }
      if ("numberOfEpisodess".equals(key) && value instanceof Integer) { numberOfEpisodes((Integer)value); return; }
      if ("numberOfSeasons".equals(key) && value instanceof Integer) { numberOfSeasons((Integer)value); return; }
      if ("numberOfSeasonss".equals(key) && value instanceof Integer) { numberOfSeasons((Integer)value); return; }
      if ("productionCompany".equals(key) && value instanceof Organization) { productionCompany((Organization)value); return; }
      if ("productionCompanys".equals(key) && value instanceof Organization) { productionCompany((Organization)value); return; }
      if ("containsSeason".equals(key) && value instanceof CreativeWorkSeason) { containsSeason((CreativeWorkSeason)value); return; }
      if ("containsSeasons".equals(key) && value instanceof CreativeWorkSeason) { containsSeason((CreativeWorkSeason)value); return; }
      if ("containsSeason".equals(key) && value instanceof HasPart) { containsSeason((HasPart)value); return; }
      if ("containsSeasons".equals(key) && value instanceof HasPart) { containsSeason((HasPart)value); return; }
      if ("trailer".equals(key) && value instanceof VideoObject) { trailer((VideoObject)value); return; }
      if ("trailers".equals(key) && value instanceof VideoObject) { trailer((VideoObject)value); return; }
      if ("numberOfPlayers".equals(key) && value instanceof QuantitativeValue) { numberOfPlayers((QuantitativeValue)value); return; }
      if ("numberOfPlayerss".equals(key) && value instanceof QuantitativeValue) { numberOfPlayers((QuantitativeValue)value); return; }
      if ("quest".equals(key) && value instanceof Thing) { quest((Thing)value); return; }
      if ("quests".equals(key) && value instanceof Thing) { quest((Thing)value); return; }
      if ("gameItem".equals(key) && value instanceof Thing) { gameItem((Thing)value); return; }
      if ("gameItems".equals(key) && value instanceof Thing) { gameItem((Thing)value); return; }
      if ("characterAttribute".equals(key) && value instanceof Thing) { characterAttribute((Thing)value); return; }
      if ("characterAttributes".equals(key) && value instanceof Thing) { characterAttribute((Thing)value); return; }
      if ("playMode".equals(key) && value instanceof GamePlayMode) { playMode((GamePlayMode)value); return; }
      if ("playModes".equals(key) && value instanceof GamePlayMode) { playMode((GamePlayMode)value); return; }
      if ("cheatCode".equals(key) && value instanceof CreativeWork) { cheatCode((CreativeWork)value); return; }
      if ("cheatCodes".equals(key) && value instanceof CreativeWork) { cheatCode((CreativeWork)value); return; }
      if ("gamePlatform".equals(key) && value instanceof String) { gamePlatform((String)value); return; }
      if ("gamePlatforms".equals(key) && value instanceof String) { gamePlatform((String)value); return; }
      if ("gamePlatform".equals(key) && value instanceof Thing) { gamePlatform((Thing)value); return; }
      if ("gamePlatforms".equals(key) && value instanceof Thing) { gamePlatform((Thing)value); return; }
      if ("gameLocation".equals(key) && value instanceof Place) { gameLocation((Place)value); return; }
      if ("gameLocations".equals(key) && value instanceof Place) { gameLocation((Place)value); return; }
      if ("gameLocation".equals(key) && value instanceof PostalAddress) { gameLocation((PostalAddress)value); return; }
      if ("gameLocations".equals(key) && value instanceof PostalAddress) { gameLocation((PostalAddress)value); return; }
      if ("gameLocation".equals(key) && value instanceof String) { gameLocation((String)value); return; }
      if ("gameLocations".equals(key) && value instanceof String) { gameLocation((String)value); return; }
      super.fromMap(key, value);
    }
  }
  
}
