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
 * The act of participating in exertive activity for the purposes of improving health and fitness.
 */
public class ExerciseAction extends PlayAction {
  /**
   * A sub property of participant. The sports team that participated on this action.
   */
  @JsonIgnore public Participant getSportsTeam() {
    return (Participant) getValue("sportsTeam");
  }
  /**
   * A sub property of participant. The sports team that participated on this action.
   */
  @JsonIgnore public java.util.Collection<Participant> getSportsTeams() {
    final Object current = myData.get("sportsTeam");
    if (current == null) return Collections.emptyList();
    if (current instanceof java.util.Collection) {
      return (java.util.Collection<Participant>) current;
    }
    return Arrays.asList((Participant) current);
  }
  /**
   * A sub property of location. The sports event where this action occurred.
   */
  @JsonIgnore public Location getSportsEvent() {
    return (Location) getValue("sportsEvent");
  }
  /**
   * A sub property of location. The sports event where this action occurred.
   */
  @JsonIgnore public java.util.Collection<Location> getSportsEvents() {
    final Object current = myData.get("sportsEvent");
    if (current == null) return Collections.emptyList();
    if (current instanceof java.util.Collection) {
      return (java.util.Collection<Location>) current;
    }
    return Arrays.asList((Location) current);
  }
  /**
   * A sub property of location. The course where this action was taken.
   */
  @JsonIgnore public Location getExerciseCourse() {
    return (Location) getValue("exerciseCourse");
  }
  /**
   * A sub property of location. The course where this action was taken.
   */
  @JsonIgnore public java.util.Collection<Location> getExerciseCourses() {
    final Object current = myData.get("exerciseCourse");
    if (current == null) return Collections.emptyList();
    if (current instanceof java.util.Collection) {
      return (java.util.Collection<Location>) current;
    }
    return Arrays.asList((Location) current);
  }
  /**
   * A sub property of location. The final location of the object or the agent after the action.
   */
  @JsonIgnore public Location getToLocation() {
    return (Location) getValue("toLocation");
  }
  /**
   * A sub property of location. The final location of the object or the agent after the action.
   */
  @JsonIgnore public java.util.Collection<Location> getToLocations() {
    final Object current = myData.get("toLocation");
    if (current == null) return Collections.emptyList();
    if (current instanceof java.util.Collection) {
      return (java.util.Collection<Location>) current;
    }
    return Arrays.asList((Location) current);
  }
  /**
   * The distance travelled, e.g. exercising or travelling.
   */
  @JsonIgnore public Distance getDistance() {
    return (Distance) getValue("distance");
  }
  /**
   * The distance travelled, e.g. exercising or travelling.
   */
  @JsonIgnore public java.util.Collection<Distance> getDistances() {
    final Object current = myData.get("distance");
    if (current == null) return Collections.emptyList();
    if (current instanceof java.util.Collection) {
      return (java.util.Collection<Distance>) current;
    }
    return Arrays.asList((Distance) current);
  }
  /**
   * Type(s) of exercise or activity, such as strength training, flexibility training, aerobics, cardiac rehabilitation, etc.
   */
  @JsonIgnore public String getExerciseType() {
    return (String) getValue("exerciseType");
  }
  /**
   * Type(s) of exercise or activity, such as strength training, flexibility training, aerobics, cardiac rehabilitation, etc.
   */
  @JsonIgnore public java.util.Collection<String> getExerciseTypes() {
    final Object current = myData.get("exerciseType");
    if (current == null) return Collections.emptyList();
    if (current instanceof java.util.Collection) {
      return (java.util.Collection<String>) current;
    }
    return Arrays.asList((String) current);
  }
  /**
   * A sub property of instrument. The diet used in this action.
   */
  @JsonIgnore public Instrument getDiet() {
    return (Instrument) getValue("diet");
  }
  /**
   * A sub property of instrument. The diet used in this action.
   */
  @JsonIgnore public java.util.Collection<Instrument> getDiets() {
    final Object current = myData.get("diet");
    if (current == null) return Collections.emptyList();
    if (current instanceof java.util.Collection) {
      return (java.util.Collection<Instrument>) current;
    }
    return Arrays.asList((Instrument) current);
  }
  /**
   * A sub property of location. The original location of the object or the agent before the action.
   */
  @JsonIgnore public Location getFromLocation() {
    return (Location) getValue("fromLocation");
  }
  /**
   * A sub property of location. The original location of the object or the agent before the action.
   */
  @JsonIgnore public java.util.Collection<Location> getFromLocations() {
    final Object current = myData.get("fromLocation");
    if (current == null) return Collections.emptyList();
    if (current instanceof java.util.Collection) {
      return (java.util.Collection<Location>) current;
    }
    return Arrays.asList((Location) current);
  }
  /**
   * A sub property of participant. The opponent on this action.
   */
  @JsonIgnore public Participant getOpponent() {
    return (Participant) getValue("opponent");
  }
  /**
   * A sub property of participant. The opponent on this action.
   */
  @JsonIgnore public java.util.Collection<Participant> getOpponents() {
    final Object current = myData.get("opponent");
    if (current == null) return Collections.emptyList();
    if (current instanceof java.util.Collection) {
      return (java.util.Collection<Participant>) current;
    }
    return Arrays.asList((Participant) current);
  }
  /**
   * A sub property of instrument. The diet used in this action.
   */
  @JsonIgnore public Instrument getExerciseRelatedDiet() {
    return (Instrument) getValue("exerciseRelatedDiet");
  }
  /**
   * A sub property of instrument. The diet used in this action.
   */
  @JsonIgnore public java.util.Collection<Instrument> getExerciseRelatedDiets() {
    final Object current = myData.get("exerciseRelatedDiet");
    if (current == null) return Collections.emptyList();
    if (current instanceof java.util.Collection) {
      return (java.util.Collection<Instrument>) current;
    }
    return Arrays.asList((Instrument) current);
  }
  /**
   * A sub property of instrument. The exercise plan used on this action.
   */
  @JsonIgnore public Instrument getExercisePlan() {
    return (Instrument) getValue("exercisePlan");
  }
  /**
   * A sub property of instrument. The exercise plan used on this action.
   */
  @JsonIgnore public java.util.Collection<Instrument> getExercisePlans() {
    final Object current = myData.get("exercisePlan");
    if (current == null) return Collections.emptyList();
    if (current instanceof java.util.Collection) {
      return (java.util.Collection<Instrument>) current;
    }
    return Arrays.asList((Instrument) current);
  }
  /**
   * A sub property of location. The sports activity location where this action occurred.
   */
  @JsonIgnore public Location getSportsActivityLocation() {
    return (Location) getValue("sportsActivityLocation");
  }
  /**
   * A sub property of location. The sports activity location where this action occurred.
   */
  @JsonIgnore public java.util.Collection<Location> getSportsActivityLocations() {
    final Object current = myData.get("sportsActivityLocation");
    if (current == null) return Collections.emptyList();
    if (current instanceof java.util.Collection) {
      return (java.util.Collection<Location>) current;
    }
    return Arrays.asList((Location) current);
  }
  protected ExerciseAction(java.util.Map<String,Object> data) {
    super(data);
  }
  
  /**
   * Builder for {@link ExerciseAction}
   */
  public static class Builder extends PlayAction.Builder {
    public Builder(@NotNull HashMap<String,Object> data) {
      super(data);
    }
    @NotNull public ExerciseAction build() {
      return new ExerciseAction(myData);
    }
    /**
     * A sub property of participant. The sports team that participated on this action.
     */
    @NotNull public Builder sportsTeam(@NotNull Participant participant) {
      putValue("sportsTeam", participant);
      return this;
    }
    /**
     * A sub property of location. The sports event where this action occurred.
     */
    @NotNull public Builder sportsEvent(@NotNull Location location) {
      putValue("sportsEvent", location);
      return this;
    }
    /**
     * A sub property of location. The course where this action was taken.
     */
    @NotNull public Builder exerciseCourse(@NotNull Location location) {
      putValue("exerciseCourse", location);
      return this;
    }
    /**
     * A sub property of location. The final location of the object or the agent after the action.
     */
    @NotNull public Builder toLocation(@NotNull Location location) {
      putValue("toLocation", location);
      return this;
    }
    /**
     * The distance travelled, e.g. exercising or travelling.
     */
    @NotNull public Builder distance(@NotNull Distance distance) {
      putValue("distance", distance);
      return this;
    }
    /**
     * The distance travelled, e.g. exercising or travelling.
     */
    @NotNull public Builder distance(@NotNull Distance.Builder distance) {
      putValue("distance", distance.build());
      return this;
    }
    /**
     * Type(s) of exercise or activity, such as strength training, flexibility training, aerobics, cardiac rehabilitation, etc.
     */
    @NotNull public Builder exerciseType(@NotNull String exerciseType) {
      putValue("exerciseType", exerciseType);
      return this;
    }
    /**
     * A sub property of instrument. The diet used in this action.
     */
    @NotNull public Builder diet(@NotNull Instrument instrument) {
      putValue("diet", instrument);
      return this;
    }
    /**
     * A sub property of location. The original location of the object or the agent before the action.
     */
    @NotNull public Builder fromLocation(@NotNull Location location) {
      putValue("fromLocation", location);
      return this;
    }
    /**
     * A sub property of participant. The opponent on this action.
     */
    @NotNull public Builder opponent(@NotNull Participant participant) {
      putValue("opponent", participant);
      return this;
    }
    /**
     * A sub property of instrument. The diet used in this action.
     */
    @NotNull public Builder exerciseRelatedDiet(@NotNull Instrument instrument) {
      putValue("exerciseRelatedDiet", instrument);
      return this;
    }
    /**
     * A sub property of instrument. The exercise plan used on this action.
     */
    @NotNull public Builder exercisePlan(@NotNull Instrument instrument) {
      putValue("exercisePlan", instrument);
      return this;
    }
    /**
     * A sub property of location. The sports activity location where this action occurred.
     */
    @NotNull public Builder sportsActivityLocation(@NotNull Location location) {
      putValue("sportsActivityLocation", location);
      return this;
    }
    /**
     * Upcoming or past event associated with this place, organization, or action.
     */
    @NotNull public Builder event(@NotNull Event event) {
      putValue("event", event);
      return this;
    }
    /**
     * Upcoming or past event associated with this place, organization, or action.
     */
    @NotNull public Builder event(@NotNull Event.Builder event) {
      putValue("event", event.build());
      return this;
    }
    /**
     * An intended audience, i.e. a group for whom something was created.
     */
    @NotNull public Builder audience(@NotNull Audience audience) {
      putValue("audience", audience);
      return this;
    }
    /**
     * An intended audience, i.e. a group for whom something was created.
     */
    @NotNull public Builder audience(@NotNull Audience.Builder audience) {
      putValue("audience", audience.build());
      return this;
    }
    /**
     * The startTime of something. For a reserved event or service (e.g. FoodEstablishmentReservation), the time that it is expected to start. For actions that span a period of time, when the action was performed. e.g. John wrote a book from *January* to December. For media, including audio and video, it's the time offset of the start of a clip within a larger file.\n\nNote that Event uses startDate/endDate instead of startTime/endTime, even when describing dates with times. This situation may be clarified in future revisions.
     */
    @NotNull public Builder startTime(@NotNull java.util.Date date) {
      putValue("startTime", date);
      return this;
    }
    /**
     * Indicates a target EntryPoint for an Action.
     */
    @NotNull public Builder target(@NotNull EntryPoint entryPoint) {
      putValue("target", entryPoint);
      return this;
    }
    /**
     * Indicates a target EntryPoint for an Action.
     */
    @NotNull public Builder target(@NotNull EntryPoint.Builder entryPoint) {
      putValue("target", entryPoint.build());
      return this;
    }
    /**
     * Indicates the current disposition of the Action.
     */
    @NotNull public Builder actionStatus(@NotNull ActionStatusType actionStatusType) {
      putValue("actionStatus", actionStatusType);
      return this;
    }
    /**
     * The direct performer or driver of the action (animate or inanimate). e.g. *John* wrote a book.
     */
    @NotNull public Builder agent(@NotNull Organization organization) {
      putValue("agent", organization);
      return this;
    }
    /**
     * The direct performer or driver of the action (animate or inanimate). e.g. *John* wrote a book.
     */
    @NotNull public Builder agent(@NotNull Organization.Builder organization) {
      putValue("agent", organization.build());
      return this;
    }
    /**
     * The direct performer or driver of the action (animate or inanimate). e.g. *John* wrote a book.
     */
    @NotNull public Builder agent(@NotNull Person person) {
      putValue("agent", person);
      return this;
    }
    /**
     * The direct performer or driver of the action (animate or inanimate). e.g. *John* wrote a book.
     */
    @NotNull public Builder agent(@NotNull Person.Builder person) {
      putValue("agent", person.build());
      return this;
    }
    /**
     * The endTime of something. For a reserved event or service (e.g. FoodEstablishmentReservation), the time that it is expected to end. For actions that span a period of time, when the action was performed. e.g. John wrote a book from January to *December*. For media, including audio and video, it's the time offset of the end of a clip within a larger file.\n\nNote that Event uses startDate/endDate instead of startTime/endTime, even when describing dates with times. This situation may be clarified in future revisions.
     */
    @NotNull public Builder endTime(@NotNull java.util.Date date) {
      putValue("endTime", date);
      return this;
    }
    /**
     * For failed actions, more information on the cause of the failure.
     */
    @NotNull public Builder error(@NotNull Thing thing) {
      putValue("error", thing);
      return this;
    }
    /**
     * For failed actions, more information on the cause of the failure.
     */
    @NotNull public Builder error(@NotNull Thing.Builder thing) {
      putValue("error", thing.build());
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
      if ("sportsTeam".equals(key) && value instanceof Participant) { this.sportsTeam((Participant)value); return; }
      if ("sportsTeams".equals(key) && value instanceof Participant) { this.sportsTeam((Participant)value); return; }
      if ("sportsEvent".equals(key) && value instanceof Location) { this.sportsEvent((Location)value); return; }
      if ("sportsEvents".equals(key) && value instanceof Location) { this.sportsEvent((Location)value); return; }
      if ("exerciseCourse".equals(key) && value instanceof Location) { this.exerciseCourse((Location)value); return; }
      if ("exerciseCourses".equals(key) && value instanceof Location) { this.exerciseCourse((Location)value); return; }
      if ("toLocation".equals(key) && value instanceof Location) { this.toLocation((Location)value); return; }
      if ("toLocations".equals(key) && value instanceof Location) { this.toLocation((Location)value); return; }
      if ("distance".equals(key) && value instanceof Distance) { this.distance((Distance)value); return; }
      if ("distances".equals(key) && value instanceof Distance) { this.distance((Distance)value); return; }
      if ("exerciseType".equals(key) && value instanceof String) { this.exerciseType((String)value); return; }
      if ("exerciseTypes".equals(key) && value instanceof String) { this.exerciseType((String)value); return; }
      if ("diet".equals(key) && value instanceof Instrument) { this.diet((Instrument)value); return; }
      if ("diets".equals(key) && value instanceof Instrument) { this.diet((Instrument)value); return; }
      if ("fromLocation".equals(key) && value instanceof Location) { this.fromLocation((Location)value); return; }
      if ("fromLocations".equals(key) && value instanceof Location) { this.fromLocation((Location)value); return; }
      if ("opponent".equals(key) && value instanceof Participant) { this.opponent((Participant)value); return; }
      if ("opponents".equals(key) && value instanceof Participant) { this.opponent((Participant)value); return; }
      if ("exerciseRelatedDiet".equals(key) && value instanceof Instrument) { this.exerciseRelatedDiet((Instrument)value); return; }
      if ("exerciseRelatedDiets".equals(key) && value instanceof Instrument) { this.exerciseRelatedDiet((Instrument)value); return; }
      if ("exercisePlan".equals(key) && value instanceof Instrument) { this.exercisePlan((Instrument)value); return; }
      if ("exercisePlans".equals(key) && value instanceof Instrument) { this.exercisePlan((Instrument)value); return; }
      if ("sportsActivityLocation".equals(key) && value instanceof Location) { this.sportsActivityLocation((Location)value); return; }
      if ("sportsActivityLocations".equals(key) && value instanceof Location) { this.sportsActivityLocation((Location)value); return; }
      super.fromMap(key, value);
    }
  }
  
}
