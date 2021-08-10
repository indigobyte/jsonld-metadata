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
 * The act of participating in exertive activity for the purposes of improving health and fitness.
 */
public class ExerciseAction extends PlayAction {
  /**
   * A sub property of participant. The sports team that participated on this action.
   * @return sportsTeam property set by first invocation of sportsTeam method or {@code null}.
   */
  @JsonIgnore public Participant getSportsTeam() {
    return (Participant) getValue("sportsTeam");
  }
  /**
   * A sub property of participant. The sports team that participated on this action.
   * @return all sportsTeam properties as {@link java.util.Collection} or an empty collection 
   * if sportsTeam was not set.
   */
  @JsonIgnore public java.util.Collection<Participant> getSportsTeams() {
    final java.lang.Object current = myData.get("sportsTeam");
    if (current == null) return Collections.emptyList();
    if (current instanceof java.util.Collection) {
      return (java.util.Collection<Participant>) current;
    }
    return Arrays.asList((Participant) current);
  }
  /**
   * A sub property of location. The sports event where this action occurred.
   * @return sportsEvent property set by first invocation of sportsEvent method or {@code null}.
   */
  @JsonIgnore public Location getSportsEvent() {
    return (Location) getValue("sportsEvent");
  }
  /**
   * A sub property of location. The sports event where this action occurred.
   * @return all sportsEvent properties as {@link java.util.Collection} or an empty collection 
   * if sportsEvent was not set.
   */
  @JsonIgnore public java.util.Collection<Location> getSportsEvents() {
    final java.lang.Object current = myData.get("sportsEvent");
    if (current == null) return Collections.emptyList();
    if (current instanceof java.util.Collection) {
      return (java.util.Collection<Location>) current;
    }
    return Arrays.asList((Location) current);
  }
  /**
   * A sub property of location. The course where this action was taken.
   * @return exerciseCourse property set by first invocation of exerciseCourse method or {@code null}.
   */
  @JsonIgnore public Location getExerciseCourse() {
    return (Location) getValue("exerciseCourse");
  }
  /**
   * A sub property of location. The course where this action was taken.
   * @return all exerciseCourse properties as {@link java.util.Collection} or an empty collection 
   * if exerciseCourse was not set.
   */
  @JsonIgnore public java.util.Collection<Location> getExerciseCourses() {
    final java.lang.Object current = myData.get("exerciseCourse");
    if (current == null) return Collections.emptyList();
    if (current instanceof java.util.Collection) {
      return (java.util.Collection<Location>) current;
    }
    return Arrays.asList((Location) current);
  }
  /**
   * A sub property of location. The final location of the object or the agent after the action.
   * @return toLocation property set by first invocation of toLocation method or {@code null}.
   */
  @JsonIgnore public Location getToLocation() {
    return (Location) getValue("toLocation");
  }
  /**
   * A sub property of location. The final location of the object or the agent after the action.
   * @return all toLocation properties as {@link java.util.Collection} or an empty collection 
   * if toLocation was not set.
   */
  @JsonIgnore public java.util.Collection<Location> getToLocations() {
    final java.lang.Object current = myData.get("toLocation");
    if (current == null) return Collections.emptyList();
    if (current instanceof java.util.Collection) {
      return (java.util.Collection<Location>) current;
    }
    return Arrays.asList((Location) current);
  }
  /**
   * The distance travelled, e.g. exercising or travelling.
   * @return distance property set by first invocation of distance method or {@code null}.
   */
  @JsonIgnore public Distance getDistance() {
    return (Distance) getValue("distance");
  }
  /**
   * The distance travelled, e.g. exercising or travelling.
   * @return all distance properties as {@link java.util.Collection} or an empty collection 
   * if distance was not set.
   */
  @JsonIgnore public java.util.Collection<Distance> getDistances() {
    final java.lang.Object current = myData.get("distance");
    if (current == null) return Collections.emptyList();
    if (current instanceof java.util.Collection) {
      return (java.util.Collection<Distance>) current;
    }
    return Arrays.asList((Distance) current);
  }
  /**
   * Type(s) of exercise or activity, such as strength training, flexibility training, aerobics, cardiac rehabilitation, etc.
   * @return exerciseType property set by first invocation of exerciseType method or {@code null}.
   */
  @JsonIgnore public String getExerciseType() {
    return (String) getValue("exerciseType");
  }
  /**
   * Type(s) of exercise or activity, such as strength training, flexibility training, aerobics, cardiac rehabilitation, etc.
   * @return all exerciseType properties as {@link java.util.Collection} or an empty collection 
   * if exerciseType was not set.
   */
  @JsonIgnore public java.util.Collection<String> getExerciseTypes() {
    final java.lang.Object current = myData.get("exerciseType");
    if (current == null) return Collections.emptyList();
    if (current instanceof java.util.Collection) {
      return (java.util.Collection<String>) current;
    }
    return Arrays.asList((String) current);
  }
  /**
   * A sub property of instrument. The diet used in this action.
   * @return diet property set by first invocation of diet method or {@code null}.
   */
  @JsonIgnore public Instrument getDiet() {
    return (Instrument) getValue("diet");
  }
  /**
   * A sub property of instrument. The diet used in this action.
   * @return all diet properties as {@link java.util.Collection} or an empty collection 
   * if diet was not set.
   */
  @JsonIgnore public java.util.Collection<Instrument> getDiets() {
    final java.lang.Object current = myData.get("diet");
    if (current == null) return Collections.emptyList();
    if (current instanceof java.util.Collection) {
      return (java.util.Collection<Instrument>) current;
    }
    return Arrays.asList((Instrument) current);
  }
  /**
   * A sub property of location. The original location of the object or the agent before the action.
   * @return fromLocation property set by first invocation of fromLocation method or {@code null}.
   */
  @JsonIgnore public Location getFromLocation() {
    return (Location) getValue("fromLocation");
  }
  /**
   * A sub property of location. The original location of the object or the agent before the action.
   * @return all fromLocation properties as {@link java.util.Collection} or an empty collection 
   * if fromLocation was not set.
   */
  @JsonIgnore public java.util.Collection<Location> getFromLocations() {
    final java.lang.Object current = myData.get("fromLocation");
    if (current == null) return Collections.emptyList();
    if (current instanceof java.util.Collection) {
      return (java.util.Collection<Location>) current;
    }
    return Arrays.asList((Location) current);
  }
  /**
   * A sub property of participant. The opponent on this action.
   * @return opponent property set by first invocation of opponent method or {@code null}.
   */
  @JsonIgnore public Participant getOpponent() {
    return (Participant) getValue("opponent");
  }
  /**
   * A sub property of participant. The opponent on this action.
   * @return all opponent properties as {@link java.util.Collection} or an empty collection 
   * if opponent was not set.
   */
  @JsonIgnore public java.util.Collection<Participant> getOpponents() {
    final java.lang.Object current = myData.get("opponent");
    if (current == null) return Collections.emptyList();
    if (current instanceof java.util.Collection) {
      return (java.util.Collection<Participant>) current;
    }
    return Arrays.asList((Participant) current);
  }
  /**
   * A sub property of instrument. The diet used in this action.
   * @return exerciseRelatedDiet property set by first invocation of exerciseRelatedDiet method or {@code null}.
   */
  @JsonIgnore public Instrument getExerciseRelatedDiet() {
    return (Instrument) getValue("exerciseRelatedDiet");
  }
  /**
   * A sub property of instrument. The diet used in this action.
   * @return all exerciseRelatedDiet properties as {@link java.util.Collection} or an empty collection 
   * if exerciseRelatedDiet was not set.
   */
  @JsonIgnore public java.util.Collection<Instrument> getExerciseRelatedDiets() {
    final java.lang.Object current = myData.get("exerciseRelatedDiet");
    if (current == null) return Collections.emptyList();
    if (current instanceof java.util.Collection) {
      return (java.util.Collection<Instrument>) current;
    }
    return Arrays.asList((Instrument) current);
  }
  /**
   * A sub property of instrument. The exercise plan used on this action.
   * @return exercisePlan property set by first invocation of exercisePlan method or {@code null}.
   */
  @JsonIgnore public Instrument getExercisePlan() {
    return (Instrument) getValue("exercisePlan");
  }
  /**
   * A sub property of instrument. The exercise plan used on this action.
   * @return all exercisePlan properties as {@link java.util.Collection} or an empty collection 
   * if exercisePlan was not set.
   */
  @JsonIgnore public java.util.Collection<Instrument> getExercisePlans() {
    final java.lang.Object current = myData.get("exercisePlan");
    if (current == null) return Collections.emptyList();
    if (current instanceof java.util.Collection) {
      return (java.util.Collection<Instrument>) current;
    }
    return Arrays.asList((Instrument) current);
  }
  /**
   * A sub property of location. The sports activity location where this action occurred.
   * @return sportsActivityLocation property set by first invocation of sportsActivityLocation method or {@code null}.
   */
  @JsonIgnore public Location getSportsActivityLocation() {
    return (Location) getValue("sportsActivityLocation");
  }
  /**
   * A sub property of location. The sports activity location where this action occurred.
   * @return all sportsActivityLocation properties as {@link java.util.Collection} or an empty collection 
   * if sportsActivityLocation was not set.
   */
  @JsonIgnore public java.util.Collection<Location> getSportsActivityLocations() {
    final java.lang.Object current = myData.get("sportsActivityLocation");
    if (current == null) return Collections.emptyList();
    if (current instanceof java.util.Collection) {
      return (java.util.Collection<Location>) current;
    }
    return Arrays.asList((Location) current);
  }
  protected ExerciseAction(java.util.Map<String,java.lang.Object> data) {
    super(data);
  }
  /**
   * @return new {@link Builder} initialized with this instance's data
   */
  @NotNull public Builder toBuilder() {
    return new Builder(new HashMap<>(this.myData));
  }
  
  /**
   * Builder for {@link ExerciseAction}
   */
  public static class Builder extends PlayAction.Builder {
    public Builder(@NotNull HashMap<String,java.lang.Object> data) {
      super(data);
    }
    @NotNull public ExerciseAction build() {
      return new ExerciseAction(myData);
    }
    /**
     * A sub property of participant. The sports team that participated on this action.
     * @param participant value to set
     * @return this builder instance
     */
    @NotNull public Builder sportsTeam(@NotNull Participant participant) {
      putValue("sportsTeam", participant);
      return this;
    }
    /**
     * Remove sportsTeam property from the builder.
     * If this property is repeatable, all instances are removed.
     * @return this builder instance
     */
    @NotNull public Builder removeSportsTeam() {
      removeValue("sportsTeam");
      return this;
    }
    /**
     * Get currently set value for sportsTeam property in this builder.
     * @return previously set value or {@code null}. If multiple values have been 
     * set to this property, then {@link java.util.Collection} instance will be 
     * returned.
     */
    @Nullable public java.lang.Object getSportsTeam() {
      return myData.get("sportsTeam");
    }
    /**
     * A sub property of location. The sports event where this action occurred.
     * @param location value to set
     * @return this builder instance
     */
    @NotNull public Builder sportsEvent(@NotNull Location location) {
      putValue("sportsEvent", location);
      return this;
    }
    /**
     * Remove sportsEvent property from the builder.
     * If this property is repeatable, all instances are removed.
     * @return this builder instance
     */
    @NotNull public Builder removeSportsEvent() {
      removeValue("sportsEvent");
      return this;
    }
    /**
     * Get currently set value for sportsEvent property in this builder.
     * @return previously set value or {@code null}. If multiple values have been 
     * set to this property, then {@link java.util.Collection} instance will be 
     * returned.
     */
    @Nullable public java.lang.Object getSportsEvent() {
      return myData.get("sportsEvent");
    }
    /**
     * A sub property of location. The course where this action was taken.
     * @param location value to set
     * @return this builder instance
     */
    @NotNull public Builder exerciseCourse(@NotNull Location location) {
      putValue("exerciseCourse", location);
      return this;
    }
    /**
     * Remove exerciseCourse property from the builder.
     * If this property is repeatable, all instances are removed.
     * @return this builder instance
     */
    @NotNull public Builder removeExerciseCourse() {
      removeValue("exerciseCourse");
      return this;
    }
    /**
     * Get currently set value for exerciseCourse property in this builder.
     * @return previously set value or {@code null}. If multiple values have been 
     * set to this property, then {@link java.util.Collection} instance will be 
     * returned.
     */
    @Nullable public java.lang.Object getExerciseCourse() {
      return myData.get("exerciseCourse");
    }
    /**
     * A sub property of location. The final location of the object or the agent after the action.
     * @param location value to set
     * @return this builder instance
     */
    @NotNull public Builder toLocation(@NotNull Location location) {
      putValue("toLocation", location);
      return this;
    }
    /**
     * Remove toLocation property from the builder.
     * If this property is repeatable, all instances are removed.
     * @return this builder instance
     */
    @NotNull public Builder removeToLocation() {
      removeValue("toLocation");
      return this;
    }
    /**
     * Get currently set value for toLocation property in this builder.
     * @return previously set value or {@code null}. If multiple values have been 
     * set to this property, then {@link java.util.Collection} instance will be 
     * returned.
     */
    @Nullable public java.lang.Object getToLocation() {
      return myData.get("toLocation");
    }
    /**
     * The distance travelled, e.g. exercising or travelling.
     * @param distance value to set
     * @return this builder instance
     */
    @NotNull public Builder distance(@NotNull Distance distance) {
      putValue("distance", distance);
      return this;
    }
    /**
     * The distance travelled, e.g. exercising or travelling.
     * @param distance value to set
     * @return this builder instance
     */
    @NotNull public Builder distance(@NotNull Distance.Builder distance) {
      putValue("distance", distance.build());
      return this;
    }
    /**
     * Remove distance property from the builder.
     * If this property is repeatable, all instances are removed.
     * @return this builder instance
     */
    @NotNull public Builder removeDistance() {
      removeValue("distance");
      return this;
    }
    /**
     * Get currently set value for distance property in this builder.
     * @return previously set value or {@code null}. If multiple values have been 
     * set to this property, then {@link java.util.Collection} instance will be 
     * returned.
     */
    @Nullable public java.lang.Object getDistance() {
      return myData.get("distance");
    }
    /**
     * Type(s) of exercise or activity, such as strength training, flexibility training, aerobics, cardiac rehabilitation, etc.
     * @param exerciseType value to set
     * @return this builder instance
     */
    @NotNull public Builder exerciseType(@NotNull String exerciseType) {
      putValue("exerciseType", exerciseType);
      return this;
    }
    /**
     * Remove exerciseType property from the builder.
     * If this property is repeatable, all instances are removed.
     * @return this builder instance
     */
    @NotNull public Builder removeExerciseType() {
      removeValue("exerciseType");
      return this;
    }
    /**
     * Get currently set value for exerciseType property in this builder.
     * @return previously set value or {@code null}. If multiple values have been 
     * set to this property, then {@link java.util.Collection} instance will be 
     * returned.
     */
    @Nullable public java.lang.Object getExerciseType() {
      return myData.get("exerciseType");
    }
    /**
     * A sub property of instrument. The diet used in this action.
     * @param instrument value to set
     * @return this builder instance
     */
    @NotNull public Builder diet(@NotNull Instrument instrument) {
      putValue("diet", instrument);
      return this;
    }
    /**
     * Remove diet property from the builder.
     * If this property is repeatable, all instances are removed.
     * @return this builder instance
     */
    @NotNull public Builder removeDiet() {
      removeValue("diet");
      return this;
    }
    /**
     * Get currently set value for diet property in this builder.
     * @return previously set value or {@code null}. If multiple values have been 
     * set to this property, then {@link java.util.Collection} instance will be 
     * returned.
     */
    @Nullable public java.lang.Object getDiet() {
      return myData.get("diet");
    }
    /**
     * A sub property of location. The original location of the object or the agent before the action.
     * @param location value to set
     * @return this builder instance
     */
    @NotNull public Builder fromLocation(@NotNull Location location) {
      putValue("fromLocation", location);
      return this;
    }
    /**
     * Remove fromLocation property from the builder.
     * If this property is repeatable, all instances are removed.
     * @return this builder instance
     */
    @NotNull public Builder removeFromLocation() {
      removeValue("fromLocation");
      return this;
    }
    /**
     * Get currently set value for fromLocation property in this builder.
     * @return previously set value or {@code null}. If multiple values have been 
     * set to this property, then {@link java.util.Collection} instance will be 
     * returned.
     */
    @Nullable public java.lang.Object getFromLocation() {
      return myData.get("fromLocation");
    }
    /**
     * A sub property of participant. The opponent on this action.
     * @param participant value to set
     * @return this builder instance
     */
    @NotNull public Builder opponent(@NotNull Participant participant) {
      putValue("opponent", participant);
      return this;
    }
    /**
     * Remove opponent property from the builder.
     * If this property is repeatable, all instances are removed.
     * @return this builder instance
     */
    @NotNull public Builder removeOpponent() {
      removeValue("opponent");
      return this;
    }
    /**
     * Get currently set value for opponent property in this builder.
     * @return previously set value or {@code null}. If multiple values have been 
     * set to this property, then {@link java.util.Collection} instance will be 
     * returned.
     */
    @Nullable public java.lang.Object getOpponent() {
      return myData.get("opponent");
    }
    /**
     * A sub property of instrument. The diet used in this action.
     * @param instrument value to set
     * @return this builder instance
     */
    @NotNull public Builder exerciseRelatedDiet(@NotNull Instrument instrument) {
      putValue("exerciseRelatedDiet", instrument);
      return this;
    }
    /**
     * Remove exerciseRelatedDiet property from the builder.
     * If this property is repeatable, all instances are removed.
     * @return this builder instance
     */
    @NotNull public Builder removeExerciseRelatedDiet() {
      removeValue("exerciseRelatedDiet");
      return this;
    }
    /**
     * Get currently set value for exerciseRelatedDiet property in this builder.
     * @return previously set value or {@code null}. If multiple values have been 
     * set to this property, then {@link java.util.Collection} instance will be 
     * returned.
     */
    @Nullable public java.lang.Object getExerciseRelatedDiet() {
      return myData.get("exerciseRelatedDiet");
    }
    /**
     * A sub property of instrument. The exercise plan used on this action.
     * @param instrument value to set
     * @return this builder instance
     */
    @NotNull public Builder exercisePlan(@NotNull Instrument instrument) {
      putValue("exercisePlan", instrument);
      return this;
    }
    /**
     * Remove exercisePlan property from the builder.
     * If this property is repeatable, all instances are removed.
     * @return this builder instance
     */
    @NotNull public Builder removeExercisePlan() {
      removeValue("exercisePlan");
      return this;
    }
    /**
     * Get currently set value for exercisePlan property in this builder.
     * @return previously set value or {@code null}. If multiple values have been 
     * set to this property, then {@link java.util.Collection} instance will be 
     * returned.
     */
    @Nullable public java.lang.Object getExercisePlan() {
      return myData.get("exercisePlan");
    }
    /**
     * A sub property of location. The sports activity location where this action occurred.
     * @param location value to set
     * @return this builder instance
     */
    @NotNull public Builder sportsActivityLocation(@NotNull Location location) {
      putValue("sportsActivityLocation", location);
      return this;
    }
    /**
     * Remove sportsActivityLocation property from the builder.
     * If this property is repeatable, all instances are removed.
     * @return this builder instance
     */
    @NotNull public Builder removeSportsActivityLocation() {
      removeValue("sportsActivityLocation");
      return this;
    }
    /**
     * Get currently set value for sportsActivityLocation property in this builder.
     * @return previously set value or {@code null}. If multiple values have been 
     * set to this property, then {@link java.util.Collection} instance will be 
     * returned.
     */
    @Nullable public java.lang.Object getSportsActivityLocation() {
      return myData.get("sportsActivityLocation");
    }
    /**
     * Upcoming or past event associated with this place, organization, or action.
     * @param event value to set
     * @return this builder instance
     */
    @NotNull public Builder event(@NotNull Event event) {
      putValue("event", event);
      return this;
    }
    /**
     * Upcoming or past event associated with this place, organization, or action.
     * @param event value to set
     * @return this builder instance
     */
    @NotNull public Builder event(@NotNull Event.Builder event) {
      putValue("event", event.build());
      return this;
    }
    /**
     * Remove event property from the builder.
     * If this property is repeatable, all instances are removed.
     * @return this builder instance
     */
    @NotNull public Builder removeEvent() {
      removeValue("event");
      return this;
    }
    /**
     * Get currently set value for event property in this builder.
     * @return previously set value or {@code null}. If multiple values have been 
     * set to this property, then {@link java.util.Collection} instance will be 
     * returned.
     */
    @Nullable public java.lang.Object getEvent() {
      return myData.get("event");
    }
    /**
     * An intended audience, i.e. a group for whom something was created.
     * @param audience value to set
     * @return this builder instance
     */
    @NotNull public Builder audience(@NotNull Audience audience) {
      putValue("audience", audience);
      return this;
    }
    /**
     * An intended audience, i.e. a group for whom something was created.
     * @param audience value to set
     * @return this builder instance
     */
    @NotNull public Builder audience(@NotNull Audience.Builder audience) {
      putValue("audience", audience.build());
      return this;
    }
    /**
     * Remove audience property from the builder.
     * If this property is repeatable, all instances are removed.
     * @return this builder instance
     */
    @NotNull public Builder removeAudience() {
      removeValue("audience");
      return this;
    }
    /**
     * Get currently set value for audience property in this builder.
     * @return previously set value or {@code null}. If multiple values have been 
     * set to this property, then {@link java.util.Collection} instance will be 
     * returned.
     */
    @Nullable public java.lang.Object getAudience() {
      return myData.get("audience");
    }
    /**
     * The startTime of something. For a reserved event or service (e.g. FoodEstablishmentReservation), the time that it is expected to start. For actions that span a period of time, when the action was performed. e.g. John wrote a book from *January* to December. For media, including audio and video, it's the time offset of the start of a clip within a larger file.\n\nNote that Event uses startDate/endDate instead of startTime/endTime, even when describing dates with times. This situation may be clarified in future revisions.
     * @param date value to set
     * @return this builder instance
     */
    @NotNull public Builder startTime(@NotNull java.util.Date date) {
      putValue("startTime", date);
      return this;
    }
    /**
     * Remove startTime property from the builder.
     * If this property is repeatable, all instances are removed.
     * @return this builder instance
     */
    @NotNull public Builder removeStartTime() {
      removeValue("startTime");
      return this;
    }
    /**
     * Get currently set value for startTime property in this builder.
     * @return previously set value or {@code null}. If multiple values have been 
     * set to this property, then {@link java.util.Collection} instance will be 
     * returned.
     */
    @Nullable public java.lang.Object getStartTime() {
      return myData.get("startTime");
    }
    /**
     * The object that helped the agent perform the action. e.g. John wrote a book with *a pen*.
     * @param instrument value to set
     * @return this builder instance
     */
    @NotNull public Builder instrument(@NotNull Instrument instrument) {
      putValue("instrument", instrument);
      return this;
    }
    /**
     * Remove instrument property from the builder.
     * If this property is repeatable, all instances are removed.
     * @return this builder instance
     */
    @NotNull public Builder removeInstrument() {
      removeValue("instrument");
      return this;
    }
    /**
     * Get currently set value for instrument property in this builder.
     * @return previously set value or {@code null}. If multiple values have been 
     * set to this property, then {@link java.util.Collection} instance will be 
     * returned.
     */
    @Nullable public java.lang.Object getInstrument() {
      return myData.get("instrument");
    }
    /**
     * Other co-agents that participated in the action indirectly. e.g. John wrote a book with *Steve*.
     * @param participant value to set
     * @return this builder instance
     */
    @NotNull public Builder participant(@NotNull Participant participant) {
      putValue("participant", participant);
      return this;
    }
    /**
     * Remove participant property from the builder.
     * If this property is repeatable, all instances are removed.
     * @return this builder instance
     */
    @NotNull public Builder removeParticipant() {
      removeValue("participant");
      return this;
    }
    /**
     * Get currently set value for participant property in this builder.
     * @return previously set value or {@code null}. If multiple values have been 
     * set to this property, then {@link java.util.Collection} instance will be 
     * returned.
     */
    @Nullable public java.lang.Object getParticipant() {
      return myData.get("participant");
    }
    /**
     * Indicates a target EntryPoint for an Action.
     * @param entryPoint value to set
     * @return this builder instance
     */
    @NotNull public Builder target(@NotNull EntryPoint entryPoint) {
      putValue("target", entryPoint);
      return this;
    }
    /**
     * Indicates a target EntryPoint for an Action.
     * @param entryPoint value to set
     * @return this builder instance
     */
    @NotNull public Builder target(@NotNull EntryPoint.Builder entryPoint) {
      putValue("target", entryPoint.build());
      return this;
    }
    /**
     * Remove target property from the builder.
     * If this property is repeatable, all instances are removed.
     * @return this builder instance
     */
    @NotNull public Builder removeTarget() {
      removeValue("target");
      return this;
    }
    /**
     * Get currently set value for target property in this builder.
     * @return previously set value or {@code null}. If multiple values have been 
     * set to this property, then {@link java.util.Collection} instance will be 
     * returned.
     */
    @Nullable public java.lang.Object getTarget() {
      return myData.get("target");
    }
    /**
     * The location of, for example, where an event is happening, where an organization is located, or where an action takes place.
     * @param location value to set
     * @return this builder instance
     */
    @NotNull public Builder location(@NotNull Location location) {
      putValue("location", location);
      return this;
    }
    /**
     * Remove location property from the builder.
     * If this property is repeatable, all instances are removed.
     * @return this builder instance
     */
    @NotNull public Builder removeLocation() {
      removeValue("location");
      return this;
    }
    /**
     * Get currently set value for location property in this builder.
     * @return previously set value or {@code null}. If multiple values have been 
     * set to this property, then {@link java.util.Collection} instance will be 
     * returned.
     */
    @Nullable public java.lang.Object getLocation() {
      return myData.get("location");
    }
    /**
     * The object upon which the action is carried out, whose state is kept intact or changed. Also known as the semantic roles patient, affected or undergoer (which change their state) or theme (which doesn't). e.g. John read *a book*.
     * @param thing value to set
     * @return this builder instance
     */
    @NotNull public Builder object(@NotNull Thing thing) {
      putValue("object", thing);
      return this;
    }
    /**
     * The object upon which the action is carried out, whose state is kept intact or changed. Also known as the semantic roles patient, affected or undergoer (which change their state) or theme (which doesn't). e.g. John read *a book*.
     * @param thing value to set
     * @return this builder instance
     */
    @NotNull public Builder object(@NotNull Thing.Builder thing) {
      putValue("object", thing.build());
      return this;
    }
    /**
     * Remove object property from the builder.
     * If this property is repeatable, all instances are removed.
     * @return this builder instance
     */
    @NotNull public Builder removeObject() {
      removeValue("object");
      return this;
    }
    /**
     * Get currently set value for object property in this builder.
     * @return previously set value or {@code null}. If multiple values have been 
     * set to this property, then {@link java.util.Collection} instance will be 
     * returned.
     */
    @Nullable public java.lang.Object getObject() {
      return myData.get("object");
    }
    /**
     * Indicates the current disposition of the Action.
     * @param actionStatusType value to set
     * @return this builder instance
     */
    @NotNull public Builder actionStatus(@NotNull ActionStatusType actionStatusType) {
      putValue("actionStatus", actionStatusType);
      return this;
    }
    /**
     * Remove actionStatus property from the builder.
     * If this property is repeatable, all instances are removed.
     * @return this builder instance
     */
    @NotNull public Builder removeActionStatus() {
      removeValue("actionStatus");
      return this;
    }
    /**
     * Get currently set value for actionStatus property in this builder.
     * @return previously set value or {@code null}. If multiple values have been 
     * set to this property, then {@link java.util.Collection} instance will be 
     * returned.
     */
    @Nullable public java.lang.Object getActionStatus() {
      return myData.get("actionStatus");
    }
    /**
     * The direct performer or driver of the action (animate or inanimate). e.g. *John* wrote a book.
     * @param organization value to set
     * @return this builder instance
     */
    @NotNull public Builder agent(@NotNull Organization organization) {
      putValue("agent", organization);
      return this;
    }
    /**
     * The direct performer or driver of the action (animate or inanimate). e.g. *John* wrote a book.
     * @param organization value to set
     * @return this builder instance
     */
    @NotNull public Builder agent(@NotNull Organization.Builder organization) {
      putValue("agent", organization.build());
      return this;
    }
    /**
     * The direct performer or driver of the action (animate or inanimate). e.g. *John* wrote a book.
     * @param person value to set
     * @return this builder instance
     */
    @NotNull public Builder agent(@NotNull Person person) {
      putValue("agent", person);
      return this;
    }
    /**
     * The direct performer or driver of the action (animate or inanimate). e.g. *John* wrote a book.
     * @param person value to set
     * @return this builder instance
     */
    @NotNull public Builder agent(@NotNull Person.Builder person) {
      putValue("agent", person.build());
      return this;
    }
    /**
     * Remove agent property from the builder.
     * If this property is repeatable, all instances are removed.
     * @return this builder instance
     */
    @NotNull public Builder removeAgent() {
      removeValue("agent");
      return this;
    }
    /**
     * Get currently set value for agent property in this builder.
     * @return previously set value or {@code null}. If multiple values have been 
     * set to this property, then {@link java.util.Collection} instance will be 
     * returned.
     */
    @Nullable public java.lang.Object getAgent() {
      return myData.get("agent");
    }
    /**
     * The endTime of something. For a reserved event or service (e.g. FoodEstablishmentReservation), the time that it is expected to end. For actions that span a period of time, when the action was performed. e.g. John wrote a book from January to *December*. For media, including audio and video, it's the time offset of the end of a clip within a larger file.\n\nNote that Event uses startDate/endDate instead of startTime/endTime, even when describing dates with times. This situation may be clarified in future revisions.
     * @param date value to set
     * @return this builder instance
     */
    @NotNull public Builder endTime(@NotNull java.util.Date date) {
      putValue("endTime", date);
      return this;
    }
    /**
     * Remove endTime property from the builder.
     * If this property is repeatable, all instances are removed.
     * @return this builder instance
     */
    @NotNull public Builder removeEndTime() {
      removeValue("endTime");
      return this;
    }
    /**
     * Get currently set value for endTime property in this builder.
     * @return previously set value or {@code null}. If multiple values have been 
     * set to this property, then {@link java.util.Collection} instance will be 
     * returned.
     */
    @Nullable public java.lang.Object getEndTime() {
      return myData.get("endTime");
    }
    /**
     * For failed actions, more information on the cause of the failure.
     * @param thing value to set
     * @return this builder instance
     */
    @NotNull public Builder error(@NotNull Thing thing) {
      putValue("error", thing);
      return this;
    }
    /**
     * For failed actions, more information on the cause of the failure.
     * @param thing value to set
     * @return this builder instance
     */
    @NotNull public Builder error(@NotNull Thing.Builder thing) {
      putValue("error", thing.build());
      return this;
    }
    /**
     * Remove error property from the builder.
     * If this property is repeatable, all instances are removed.
     * @return this builder instance
     */
    @NotNull public Builder removeError() {
      removeValue("error");
      return this;
    }
    /**
     * Get currently set value for error property in this builder.
     * @return previously set value or {@code null}. If multiple values have been 
     * set to this property, then {@link java.util.Collection} instance will be 
     * returned.
     */
    @Nullable public java.lang.Object getError() {
      return myData.get("error");
    }
    /**
     * The result produced in the action. e.g. John wrote *a book*.
     * @param result value to set
     * @return this builder instance
     */
    @NotNull public Builder result(@NotNull Result result) {
      putValue("result", result);
      return this;
    }
    /**
     * Remove result property from the builder.
     * If this property is repeatable, all instances are removed.
     * @return this builder instance
     */
    @NotNull public Builder removeResult() {
      removeValue("result");
      return this;
    }
    /**
     * Get currently set value for result property in this builder.
     * @return previously set value or {@code null}. If multiple values have been 
     * set to this property, then {@link java.util.Collection} instance will be 
     * returned.
     */
    @Nullable public java.lang.Object getResult() {
      return myData.get("result");
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
    @Override protected void fromMap(String key, java.lang.Object value) {
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
