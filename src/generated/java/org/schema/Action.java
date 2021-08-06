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
 * An action performed by a direct agent and indirect participants upon a direct object. Optionally happens at a location with the help of an inanimate instrument. The execution of the action may produce a result. Specific action sub-type documentation specifies the exact expectation of each argument/role.\n\nSee also [blog post](http://blog.schema.org/2014/04/announcing-schemaorg-actions.html) and [Actions overview document](http://schema.org/docs/actions.html).
 */
public class Action extends Thing {
  /**
   * The startTime of something. For a reserved event or service (e.g. FoodEstablishmentReservation), the time that it is expected to start. For actions that span a period of time, when the action was performed. e.g. John wrote a book from *January* to December. For media, including audio and video, it's the time offset of the start of a clip within a larger file.\n\nNote that Event uses startDate/endDate instead of startTime/endTime, even when describing dates with times. This situation may be clarified in future revisions.
   */
  @JsonIgnore public java.util.Date getStartTime() {
    return (java.util.Date) getValue("startTime");
  }
  /**
   * The startTime of something. For a reserved event or service (e.g. FoodEstablishmentReservation), the time that it is expected to start. For actions that span a period of time, when the action was performed. e.g. John wrote a book from *January* to December. For media, including audio and video, it's the time offset of the start of a clip within a larger file.\n\nNote that Event uses startDate/endDate instead of startTime/endTime, even when describing dates with times. This situation may be clarified in future revisions.
   */
  @JsonIgnore public java.util.Collection<java.util.Date> getStartTimes() {
    final java.lang.Object current = myData.get("startTime");
    if (current == null) return Collections.emptyList();
    if (current instanceof java.util.Collection) {
      return (java.util.Collection<java.util.Date>) current;
    }
    return Arrays.asList((java.util.Date) current);
  }
  /**
   * The object that helped the agent perform the action. e.g. John wrote a book with *a pen*.
   */
  @JsonIgnore public Instrument getInstrument() {
    return (Instrument) getValue("instrument");
  }
  /**
   * The object that helped the agent perform the action. e.g. John wrote a book with *a pen*.
   */
  @JsonIgnore public java.util.Collection<Instrument> getInstruments() {
    final java.lang.Object current = myData.get("instrument");
    if (current == null) return Collections.emptyList();
    if (current instanceof java.util.Collection) {
      return (java.util.Collection<Instrument>) current;
    }
    return Arrays.asList((Instrument) current);
  }
  /**
   * Other co-agents that participated in the action indirectly. e.g. John wrote a book with *Steve*.
   */
  @JsonIgnore public Participant getParticipant() {
    return (Participant) getValue("participant");
  }
  /**
   * Other co-agents that participated in the action indirectly. e.g. John wrote a book with *Steve*.
   */
  @JsonIgnore public java.util.Collection<Participant> getParticipants() {
    final java.lang.Object current = myData.get("participant");
    if (current == null) return Collections.emptyList();
    if (current instanceof java.util.Collection) {
      return (java.util.Collection<Participant>) current;
    }
    return Arrays.asList((Participant) current);
  }
  /**
   * Indicates a target EntryPoint for an Action.
   */
  @JsonIgnore public EntryPoint getTarget() {
    return (EntryPoint) getValue("target");
  }
  /**
   * Indicates a target EntryPoint for an Action.
   */
  @JsonIgnore public java.util.Collection<EntryPoint> getTargets() {
    final java.lang.Object current = myData.get("target");
    if (current == null) return Collections.emptyList();
    if (current instanceof java.util.Collection) {
      return (java.util.Collection<EntryPoint>) current;
    }
    return Arrays.asList((EntryPoint) current);
  }
  /**
   * The location of, for example, where an event is happening, where an organization is located, or where an action takes place.
   */
  @JsonIgnore public Location getLocation() {
    return (Location) getValue("location");
  }
  /**
   * The location of, for example, where an event is happening, where an organization is located, or where an action takes place.
   */
  @JsonIgnore public java.util.Collection<Location> getLocations() {
    final java.lang.Object current = myData.get("location");
    if (current == null) return Collections.emptyList();
    if (current instanceof java.util.Collection) {
      return (java.util.Collection<Location>) current;
    }
    return Arrays.asList((Location) current);
  }
  /**
   * The object upon which the action is carried out, whose state is kept intact or changed. Also known as the semantic roles patient, affected or undergoer (which change their state) or theme (which doesn't). e.g. John read *a book*.
   */
  @JsonIgnore public Object getObject() {
    return (Object) getValue("object");
  }
  /**
   * The object upon which the action is carried out, whose state is kept intact or changed. Also known as the semantic roles patient, affected or undergoer (which change their state) or theme (which doesn't). e.g. John read *a book*.
   */
  @JsonIgnore public java.util.Collection<Object> getObjects() {
    final java.lang.Object current = myData.get("object");
    if (current == null) return Collections.emptyList();
    if (current instanceof java.util.Collection) {
      return (java.util.Collection<Object>) current;
    }
    return Arrays.asList((Object) current);
  }
  /**
   * Indicates the current disposition of the Action.
   */
  @JsonIgnore public ActionStatusType getActionStatus() {
    return (ActionStatusType) getValue("actionStatus");
  }
  /**
   * Indicates the current disposition of the Action.
   */
  @JsonIgnore public java.util.Collection<ActionStatusType> getActionStatuss() {
    final java.lang.Object current = myData.get("actionStatus");
    if (current == null) return Collections.emptyList();
    if (current instanceof java.util.Collection) {
      return (java.util.Collection<ActionStatusType>) current;
    }
    return Arrays.asList((ActionStatusType) current);
  }
  /**
   * The direct performer or driver of the action (animate or inanimate). e.g. *John* wrote a book.
   */
  @JsonIgnore public Organization getAgentOrganization() {
    return (Organization) getValue("agent");
  }
  /**
   * The direct performer or driver of the action (animate or inanimate). e.g. *John* wrote a book.
   */
  @JsonIgnore public java.util.Collection<Organization> getAgentOrganizations() {
    final java.lang.Object current = myData.get("agent");
    if (current == null) return Collections.emptyList();
    if (current instanceof java.util.Collection) {
      return (java.util.Collection<Organization>) current;
    }
    return Arrays.asList((Organization) current);
  }
  /**
   * The direct performer or driver of the action (animate or inanimate). e.g. *John* wrote a book.
   */
  @JsonIgnore public Person getAgentPerson() {
    return (Person) getValue("agent");
  }
  /**
   * The direct performer or driver of the action (animate or inanimate). e.g. *John* wrote a book.
   */
  @JsonIgnore public java.util.Collection<Person> getAgentPersons() {
    final java.lang.Object current = myData.get("agent");
    if (current == null) return Collections.emptyList();
    if (current instanceof java.util.Collection) {
      return (java.util.Collection<Person>) current;
    }
    return Arrays.asList((Person) current);
  }
  /**
   * The endTime of something. For a reserved event or service (e.g. FoodEstablishmentReservation), the time that it is expected to end. For actions that span a period of time, when the action was performed. e.g. John wrote a book from January to *December*. For media, including audio and video, it's the time offset of the end of a clip within a larger file.\n\nNote that Event uses startDate/endDate instead of startTime/endTime, even when describing dates with times. This situation may be clarified in future revisions.
   */
  @JsonIgnore public java.util.Date getEndTime() {
    return (java.util.Date) getValue("endTime");
  }
  /**
   * The endTime of something. For a reserved event or service (e.g. FoodEstablishmentReservation), the time that it is expected to end. For actions that span a period of time, when the action was performed. e.g. John wrote a book from January to *December*. For media, including audio and video, it's the time offset of the end of a clip within a larger file.\n\nNote that Event uses startDate/endDate instead of startTime/endTime, even when describing dates with times. This situation may be clarified in future revisions.
   */
  @JsonIgnore public java.util.Collection<java.util.Date> getEndTimes() {
    final java.lang.Object current = myData.get("endTime");
    if (current == null) return Collections.emptyList();
    if (current instanceof java.util.Collection) {
      return (java.util.Collection<java.util.Date>) current;
    }
    return Arrays.asList((java.util.Date) current);
  }
  /**
   * For failed actions, more information on the cause of the failure.
   */
  @JsonIgnore public Thing getError() {
    return (Thing) getValue("error");
  }
  /**
   * For failed actions, more information on the cause of the failure.
   */
  @JsonIgnore public java.util.Collection<Thing> getErrors() {
    final java.lang.Object current = myData.get("error");
    if (current == null) return Collections.emptyList();
    if (current instanceof java.util.Collection) {
      return (java.util.Collection<Thing>) current;
    }
    return Arrays.asList((Thing) current);
  }
  /**
   * The result produced in the action. e.g. John wrote *a book*.
   */
  @JsonIgnore public Result getResult() {
    return (Result) getValue("result");
  }
  /**
   * The result produced in the action. e.g. John wrote *a book*.
   */
  @JsonIgnore public java.util.Collection<Result> getResults() {
    final java.lang.Object current = myData.get("result");
    if (current == null) return Collections.emptyList();
    if (current instanceof java.util.Collection) {
      return (java.util.Collection<Result>) current;
    }
    return Arrays.asList((Result) current);
  }
  protected Action(java.util.Map<String,java.lang.Object> data) {
    super(data);
  }
  
  /**
   * Builder for {@link Action}
   */
  public static class Builder extends Thing.Builder {
    public Builder(@NotNull HashMap<String,java.lang.Object> data) {
      super(data);
    }
    @NotNull public Action build() {
      return new Action(myData);
    }
    /**
     * The startTime of something. For a reserved event or service (e.g. FoodEstablishmentReservation), the time that it is expected to start. For actions that span a period of time, when the action was performed. e.g. John wrote a book from *January* to December. For media, including audio and video, it's the time offset of the start of a clip within a larger file.\n\nNote that Event uses startDate/endDate instead of startTime/endTime, even when describing dates with times. This situation may be clarified in future revisions.
     */
    @NotNull public Builder startTime(@NotNull java.util.Date date) {
      putValue("startTime", date);
      return this;
    }
    /**
     * The object that helped the agent perform the action. e.g. John wrote a book with *a pen*.
     */
    @NotNull public Builder instrument(@NotNull Instrument instrument) {
      putValue("instrument", instrument);
      return this;
    }
    /**
     * Other co-agents that participated in the action indirectly. e.g. John wrote a book with *Steve*.
     */
    @NotNull public Builder participant(@NotNull Participant participant) {
      putValue("participant", participant);
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
     * The location of, for example, where an event is happening, where an organization is located, or where an action takes place.
     */
    @NotNull public Builder location(@NotNull Location location) {
      putValue("location", location);
      return this;
    }
    /**
     * The object upon which the action is carried out, whose state is kept intact or changed. Also known as the semantic roles patient, affected or undergoer (which change their state) or theme (which doesn't). e.g. John read *a book*.
     */
    @NotNull public Builder object(@NotNull Object object) {
      putValue("object", object);
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
     * The result produced in the action. e.g. John wrote *a book*.
     */
    @NotNull public Builder result(@NotNull Result result) {
      putValue("result", result);
      return this;
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
    @Override protected void fromMap(String key, java.lang.Object value) {
      if ("startTime".equals(key) && value instanceof java.util.Date) { this.startTime((java.util.Date)value); return; }
      if ("startTimes".equals(key) && value instanceof java.util.Date) { this.startTime((java.util.Date)value); return; }
      if ("instrument".equals(key) && value instanceof Instrument) { this.instrument((Instrument)value); return; }
      if ("instruments".equals(key) && value instanceof Instrument) { this.instrument((Instrument)value); return; }
      if ("participant".equals(key) && value instanceof Participant) { this.participant((Participant)value); return; }
      if ("participants".equals(key) && value instanceof Participant) { this.participant((Participant)value); return; }
      if ("target".equals(key) && value instanceof EntryPoint) { this.target((EntryPoint)value); return; }
      if ("targets".equals(key) && value instanceof EntryPoint) { this.target((EntryPoint)value); return; }
      if ("location".equals(key) && value instanceof Location) { this.location((Location)value); return; }
      if ("locations".equals(key) && value instanceof Location) { this.location((Location)value); return; }
      if ("object".equals(key) && value instanceof Object) { this.object((Object)value); return; }
      if ("objects".equals(key) && value instanceof Object) { this.object((Object)value); return; }
      if ("actionStatus".equals(key) && value instanceof ActionStatusType) { this.actionStatus((ActionStatusType)value); return; }
      if ("actionStatuss".equals(key) && value instanceof ActionStatusType) { this.actionStatus((ActionStatusType)value); return; }
      if ("agent".equals(key) && value instanceof Organization) { this.agent((Organization)value); return; }
      if ("agents".equals(key) && value instanceof Organization) { this.agent((Organization)value); return; }
      if ("agent".equals(key) && value instanceof Person) { this.agent((Person)value); return; }
      if ("agents".equals(key) && value instanceof Person) { this.agent((Person)value); return; }
      if ("endTime".equals(key) && value instanceof java.util.Date) { this.endTime((java.util.Date)value); return; }
      if ("endTimes".equals(key) && value instanceof java.util.Date) { this.endTime((java.util.Date)value); return; }
      if ("error".equals(key) && value instanceof Thing) { this.error((Thing)value); return; }
      if ("errors".equals(key) && value instanceof Thing) { this.error((Thing)value); return; }
      if ("result".equals(key) && value instanceof Result) { this.result((Result)value); return; }
      if ("results".equals(key) && value instanceof Result) { this.result((Result)value); return; }
      super.fromMap(key, value);
    }
  }
  
}
