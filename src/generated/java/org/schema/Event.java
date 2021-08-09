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
 * An event happening at a certain time and location, such as a concert, lecture, or festival. Ticketing information may be added via the [[offers]] property. Repeated events may be structured as separate Event objects.Equivalent class: http://purl.org/dc/dcmitype/Event
 */
public class Event extends Thing {
  /**
   * An organizer of an Event.
   * @return organizer property set by first invocation of organizer method or {@code null}.
   */
  @JsonIgnore public Organization getOrganizerOrganization() {
    return (Organization) getValue("organizer");
  }
  /**
   * An organizer of an Event.
   * @return all organizer properties as {@link java.util.Collection} or an empty collection 
   * if organizer was not set.
   */
  @JsonIgnore public java.util.Collection<Organization> getOrganizerOrganizations() {
    final java.lang.Object current = myData.get("organizer");
    if (current == null) return Collections.emptyList();
    if (current instanceof java.util.Collection) {
      return (java.util.Collection<Organization>) current;
    }
    return Arrays.asList((Organization) current);
  }
  /**
   * An organizer of an Event.
   * @return organizer property set by first invocation of organizer method or {@code null}.
   */
  @JsonIgnore public Person getOrganizerPerson() {
    return (Person) getValue("organizer");
  }
  /**
   * An organizer of an Event.
   * @return all organizer properties as {@link java.util.Collection} or an empty collection 
   * if organizer was not set.
   */
  @JsonIgnore public java.util.Collection<Person> getOrganizerPersons() {
    final java.lang.Object current = myData.get("organizer");
    if (current == null) return Collections.emptyList();
    if (current instanceof java.util.Collection) {
      return (java.util.Collection<Person>) current;
    }
    return Arrays.asList((Person) current);
  }
  /**
   * The language of the content or performance or used in an action. Please use one of the language codes from the [IETF BCP 47 standard](http://tools.ietf.org/html/bcp47). See also [[availableLanguage]].
   * @return inLanguage property set by first invocation of inLanguage method or {@code null}.
   */
  @JsonIgnore public Language getInLanguageLanguage() {
    return (Language) getValue("inLanguage");
  }
  /**
   * The language of the content or performance or used in an action. Please use one of the language codes from the [IETF BCP 47 standard](http://tools.ietf.org/html/bcp47). See also [[availableLanguage]].
   * @return all inLanguage properties as {@link java.util.Collection} or an empty collection 
   * if inLanguage was not set.
   */
  @JsonIgnore public java.util.Collection<Language> getInLanguageLanguages() {
    final java.lang.Object current = myData.get("inLanguage");
    if (current == null) return Collections.emptyList();
    if (current instanceof java.util.Collection) {
      return (java.util.Collection<Language>) current;
    }
    return Arrays.asList((Language) current);
  }
  /**
   * The language of the content or performance or used in an action. Please use one of the language codes from the [IETF BCP 47 standard](http://tools.ietf.org/html/bcp47). See also [[availableLanguage]].
   * @return inLanguage property set by first invocation of inLanguage method or {@code null}.
   */
  @JsonIgnore public String getInLanguageString() {
    return (String) getValue("inLanguage");
  }
  /**
   * The language of the content or performance or used in an action. Please use one of the language codes from the [IETF BCP 47 standard](http://tools.ietf.org/html/bcp47). See also [[availableLanguage]].
   * @return all inLanguage properties as {@link java.util.Collection} or an empty collection 
   * if inLanguage was not set.
   */
  @JsonIgnore public java.util.Collection<String> getInLanguageStrings() {
    final java.lang.Object current = myData.get("inLanguage");
    if (current == null) return Collections.emptyList();
    if (current instanceof java.util.Collection) {
      return (java.util.Collection<String>) current;
    }
    return Arrays.asList((String) current);
  }
  /**
   *                          A work featured in some event, e.g. exhibited in an ExhibitionEvent.
   * Specific subproperties are available for workPerformed (e.g. a play), or a workPresented (a Movie at a ScreeningEvent).
   *                          @return workFeatured property set by first invocation of workFeatured method or {@code null}.
   */
  @JsonIgnore public WorkFeatured getWorkFeatured() {
    return (WorkFeatured) getValue("workFeatured");
  }
  /**
   *                              A work featured in some event, e.g. exhibited in an ExhibitionEvent.
   * Specific subproperties are available for workPerformed (e.g. a play), or a workPresented (a Movie at a ScreeningEvent).
   *                              @return all workFeatured properties as {@link java.util.Collection} or an empty collection 
   *                              if workFeatured was not set.
   */
  @JsonIgnore public java.util.Collection<WorkFeatured> getWorkFeatureds() {
    final java.lang.Object current = myData.get("workFeatured");
    if (current == null) return Collections.emptyList();
    if (current instanceof java.util.Collection) {
      return (java.util.Collection<WorkFeatured>) current;
    }
    return Arrays.asList((WorkFeatured) current);
  }
  /**
   * A work performed in some event, for example a play performed in a TheaterEvent.
   * @return workPerformed property set by first invocation of workPerformed method or {@code null}.
   */
  @JsonIgnore public WorkFeatured getWorkPerformed() {
    return (WorkFeatured) getValue("workPerformed");
  }
  /**
   * A work performed in some event, for example a play performed in a TheaterEvent.
   * @return all workPerformed properties as {@link java.util.Collection} or an empty collection 
   * if workPerformed was not set.
   */
  @JsonIgnore public java.util.Collection<WorkFeatured> getWorkPerformeds() {
    final java.lang.Object current = myData.get("workPerformed");
    if (current == null) return Collections.emptyList();
    if (current instanceof java.util.Collection) {
      return (java.util.Collection<WorkFeatured>) current;
    }
    return Arrays.asList((WorkFeatured) current);
  }
  /**
   * The location of, for example, where an event is happening, where an organization is located, or where an action takes place.
   * @return location property set by first invocation of location method or {@code null}.
   */
  @JsonIgnore public Location getLocation() {
    return (Location) getValue("location");
  }
  /**
   * The location of, for example, where an event is happening, where an organization is located, or where an action takes place.
   * @return all location properties as {@link java.util.Collection} or an empty collection 
   * if location was not set.
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
   * The person or organization who wrote a composition, or who is the composer of a work performed at some event.
   * @return composer property set by first invocation of composer method or {@code null}.
   */
  @JsonIgnore public Organization getComposerOrganization() {
    return (Organization) getValue("composer");
  }
  /**
   * The person or organization who wrote a composition, or who is the composer of a work performed at some event.
   * @return all composer properties as {@link java.util.Collection} or an empty collection 
   * if composer was not set.
   */
  @JsonIgnore public java.util.Collection<Organization> getComposerOrganizations() {
    final java.lang.Object current = myData.get("composer");
    if (current == null) return Collections.emptyList();
    if (current instanceof java.util.Collection) {
      return (java.util.Collection<Organization>) current;
    }
    return Arrays.asList((Organization) current);
  }
  /**
   * The person or organization who wrote a composition, or who is the composer of a work performed at some event.
   * @return composer property set by first invocation of composer method or {@code null}.
   */
  @JsonIgnore public Person getComposerPerson() {
    return (Person) getValue("composer");
  }
  /**
   * The person or organization who wrote a composition, or who is the composer of a work performed at some event.
   * @return all composer properties as {@link java.util.Collection} or an empty collection 
   * if composer was not set.
   */
  @JsonIgnore public java.util.Collection<Person> getComposerPersons() {
    final java.lang.Object current = myData.get("composer");
    if (current == null) return Collections.emptyList();
    if (current instanceof java.util.Collection) {
      return (java.util.Collection<Person>) current;
    }
    return Arrays.asList((Person) current);
  }
  /**
   * A person or organization attending the event.
   * @return attendee property set by first invocation of attendee method or {@code null}.
   */
  @JsonIgnore public Organization getAttendeeOrganization() {
    return (Organization) getValue("attendee");
  }
  /**
   * A person or organization attending the event.
   * @return all attendee properties as {@link java.util.Collection} or an empty collection 
   * if attendee was not set.
   */
  @JsonIgnore public java.util.Collection<Organization> getAttendeeOrganizations() {
    final java.lang.Object current = myData.get("attendee");
    if (current == null) return Collections.emptyList();
    if (current instanceof java.util.Collection) {
      return (java.util.Collection<Organization>) current;
    }
    return Arrays.asList((Organization) current);
  }
  /**
   * A person or organization attending the event.
   * @return attendee property set by first invocation of attendee method or {@code null}.
   */
  @JsonIgnore public Person getAttendeePerson() {
    return (Person) getValue("attendee");
  }
  /**
   * A person or organization attending the event.
   * @return all attendee properties as {@link java.util.Collection} or an empty collection 
   * if attendee was not set.
   */
  @JsonIgnore public java.util.Collection<Person> getAttendeePersons() {
    final java.lang.Object current = myData.get("attendee");
    if (current == null) return Collections.emptyList();
    if (current instanceof java.util.Collection) {
      return (java.util.Collection<Person>) current;
    }
    return Arrays.asList((Person) current);
  }
  /**
   * An actor, e.g. in tv, radio, movie, video games etc., or in an event. Actors can be associated with individual items or with a series, episode, clip.
   * @return actor property set by first invocation of actor method or {@code null}.
   */
  @JsonIgnore public Actor getActor() {
    return (Actor) getValue("actor");
  }
  /**
   * An actor, e.g. in tv, radio, movie, video games etc., or in an event. Actors can be associated with individual items or with a series, episode, clip.
   * @return all actor properties as {@link java.util.Collection} or an empty collection 
   * if actor was not set.
   */
  @JsonIgnore public java.util.Collection<Actor> getActors() {
    final java.lang.Object current = myData.get("actor");
    if (current == null) return Collections.emptyList();
    if (current instanceof java.util.Collection) {
      return (java.util.Collection<Actor>) current;
    }
    return Arrays.asList((Actor) current);
  }
  /**
   * The overall rating, based on a collection of reviews or ratings, of the item.
   * @return aggregateRating property set by first invocation of aggregateRating method or {@code null}.
   */
  @JsonIgnore public AggregateRating getAggregateRating() {
    return (AggregateRating) getValue("aggregateRating");
  }
  /**
   * The overall rating, based on a collection of reviews or ratings, of the item.
   * @return all aggregateRating properties as {@link java.util.Collection} or an empty collection 
   * if aggregateRating was not set.
   */
  @JsonIgnore public java.util.Collection<AggregateRating> getAggregateRatings() {
    final java.lang.Object current = myData.get("aggregateRating");
    if (current == null) return Collections.emptyList();
    if (current instanceof java.util.Collection) {
      return (java.util.Collection<AggregateRating>) current;
    }
    return Arrays.asList((AggregateRating) current);
  }
  /**
   * A performer at the event&amp;#x2014;for example, a presenter, musician, musical group or actor.
   * @return performer property set by first invocation of performer method or {@code null}.
   */
  @JsonIgnore public Organization getPerformerOrganization() {
    return (Organization) getValue("performer");
  }
  /**
   * A performer at the event&amp;#x2014;for example, a presenter, musician, musical group or actor.
   * @return all performer properties as {@link java.util.Collection} or an empty collection 
   * if performer was not set.
   */
  @JsonIgnore public java.util.Collection<Organization> getPerformerOrganizations() {
    final java.lang.Object current = myData.get("performer");
    if (current == null) return Collections.emptyList();
    if (current instanceof java.util.Collection) {
      return (java.util.Collection<Organization>) current;
    }
    return Arrays.asList((Organization) current);
  }
  /**
   * A performer at the event&amp;#x2014;for example, a presenter, musician, musical group or actor.
   * @return performer property set by first invocation of performer method or {@code null}.
   */
  @JsonIgnore public Person getPerformerPerson() {
    return (Person) getValue("performer");
  }
  /**
   * A performer at the event&amp;#x2014;for example, a presenter, musician, musical group or actor.
   * @return all performer properties as {@link java.util.Collection} or an empty collection 
   * if performer was not set.
   */
  @JsonIgnore public java.util.Collection<Person> getPerformerPersons() {
    final java.lang.Object current = myData.get("performer");
    if (current == null) return Collections.emptyList();
    if (current instanceof java.util.Collection) {
      return (java.util.Collection<Person>) current;
    }
    return Arrays.asList((Person) current);
  }
  /**
   * An eventStatus of an event represents its status; particularly useful when an event is cancelled or rescheduled.
   * @return eventStatus property set by first invocation of eventStatus method or {@code null}.
   */
  @JsonIgnore public EventStatusType getEventStatus() {
    return (EventStatusType) getValue("eventStatus");
  }
  /**
   * An eventStatus of an event represents its status; particularly useful when an event is cancelled or rescheduled.
   * @return all eventStatus properties as {@link java.util.Collection} or an empty collection 
   * if eventStatus was not set.
   */
  @JsonIgnore public java.util.Collection<EventStatusType> getEventStatuss() {
    final java.lang.Object current = myData.get("eventStatus");
    if (current == null) return Collections.emptyList();
    if (current instanceof java.util.Collection) {
      return (java.util.Collection<EventStatusType>) current;
    }
    return Arrays.asList((EventStatusType) current);
  }
  /**
   * The duration of the item (movie, audio recording, event, etc.) in [ISO 8601 date format](http://en.wikipedia.org/wiki/ISO_8601).
   * @return duration property set by first invocation of duration method or {@code null}.
   */
  @JsonIgnore public Duration getDuration() {
    return (Duration) getValue("duration");
  }
  /**
   * The duration of the item (movie, audio recording, event, etc.) in [ISO 8601 date format](http://en.wikipedia.org/wiki/ISO_8601).
   * @return all duration properties as {@link java.util.Collection} or an empty collection 
   * if duration was not set.
   */
  @JsonIgnore public java.util.Collection<Duration> getDurations() {
    final java.lang.Object current = myData.get("duration");
    if (current == null) return Collections.emptyList();
    if (current instanceof java.util.Collection) {
      return (java.util.Collection<Duration>) current;
    }
    return Arrays.asList((Duration) current);
  }
  /**
   * The maximum physical attendee capacity of an [[Event]] whose [[eventAttendanceMode]] is [[OnlineEventAttendanceMode]] (or the online aspects, in the case of a [[MixedEventAttendanceMode]]). 
   * @return maximumVirtualAttendeeCapacity property set by first invocation of maximumVirtualAttendeeCapacity method or {@code null}.
   */
  @JsonIgnore public Integer getMaximumVirtualAttendeeCapacity() {
    return (Integer) getValue("maximumVirtualAttendeeCapacity");
  }
  /**
   * The maximum physical attendee capacity of an [[Event]] whose [[eventAttendanceMode]] is [[OnlineEventAttendanceMode]] (or the online aspects, in the case of a [[MixedEventAttendanceMode]]). 
   * @return all maximumVirtualAttendeeCapacity properties as {@link java.util.Collection} or an empty collection 
   * if maximumVirtualAttendeeCapacity was not set.
   */
  @JsonIgnore public java.util.Collection<Integer> getMaximumVirtualAttendeeCapacitys() {
    final java.lang.Object current = myData.get("maximumVirtualAttendeeCapacity");
    if (current == null) return Collections.emptyList();
    if (current instanceof java.util.Collection) {
      return (java.util.Collection<Integer>) current;
    }
    return Arrays.asList((Integer) current);
  }
  /**
   * The eventAttendanceMode of an event indicates whether it occurs online, offline, or a mix.
   * @return eventAttendanceMode property set by first invocation of eventAttendanceMode method or {@code null}.
   */
  @JsonIgnore public EventAttendanceModeEnumeration getEventAttendanceMode() {
    return (EventAttendanceModeEnumeration) getValue("eventAttendanceMode");
  }
  /**
   * The eventAttendanceMode of an event indicates whether it occurs online, offline, or a mix.
   * @return all eventAttendanceMode properties as {@link java.util.Collection} or an empty collection 
   * if eventAttendanceMode was not set.
   */
  @JsonIgnore public java.util.Collection<EventAttendanceModeEnumeration> getEventAttendanceModes() {
    final java.lang.Object current = myData.get("eventAttendanceMode");
    if (current == null) return Collections.emptyList();
    if (current instanceof java.util.Collection) {
      return (java.util.Collection<EventAttendanceModeEnumeration>) current;
    }
    return Arrays.asList((EventAttendanceModeEnumeration) current);
  }
  /**
   * The start date and time of the item (in [ISO 8601 date format](http://en.wikipedia.org/wiki/ISO_8601)).
   * @return startDate property set by first invocation of startDate method or {@code null}.
   */
  @JsonIgnore public java.util.Date getStartDate() {
    return (java.util.Date) getValue("startDate");
  }
  /**
   * The start date and time of the item (in [ISO 8601 date format](http://en.wikipedia.org/wiki/ISO_8601)).
   * @return all startDate properties as {@link java.util.Collection} or an empty collection 
   * if startDate was not set.
   */
  @JsonIgnore public java.util.Collection<java.util.Date> getStartDates() {
    final java.lang.Object current = myData.get("startDate");
    if (current == null) return Collections.emptyList();
    if (current instanceof java.util.Collection) {
      return (java.util.Collection<java.util.Date>) current;
    }
    return Arrays.asList((java.util.Date) current);
  }
  /**
   * A flag to signal that the item, event, or place is accessible for free.
   * @return isAccessibleForFree property set by first invocation of isAccessibleForFree method or {@code null}.
   */
  @JsonIgnore public Boolean getIsAccessibleForFree() {
    return (Boolean) getValue("isAccessibleForFree");
  }
  /**
   * A flag to signal that the item, event, or place is accessible for free.
   * @return all isAccessibleForFree properties as {@link java.util.Collection} or an empty collection 
   * if isAccessibleForFree was not set.
   */
  @JsonIgnore public java.util.Collection<Boolean> getIsAccessibleForFrees() {
    final java.lang.Object current = myData.get("isAccessibleForFree");
    if (current == null) return Collections.emptyList();
    if (current instanceof java.util.Collection) {
      return (java.util.Collection<Boolean>) current;
    }
    return Arrays.asList((Boolean) current);
  }
  /**
   * A director of e.g. tv, radio, movie, video gaming etc. content, or of an event. Directors can be associated with individual items or with a series, episode, clip.
   * @return director property set by first invocation of director method or {@code null}.
   */
  @JsonIgnore public Person getDirector() {
    return (Person) getValue("director");
  }
  /**
   * A director of e.g. tv, radio, movie, video gaming etc. content, or of an event. Directors can be associated with individual items or with a series, episode, clip.
   * @return all director properties as {@link java.util.Collection} or an empty collection 
   * if director was not set.
   */
  @JsonIgnore public java.util.Collection<Person> getDirectors() {
    final java.lang.Object current = myData.get("director");
    if (current == null) return Collections.emptyList();
    if (current instanceof java.util.Collection) {
      return (java.util.Collection<Person>) current;
    }
    return Arrays.asList((Person) current);
  }
  /**
   * Used in conjunction with eventStatus for rescheduled or cancelled events. This property contains the previously scheduled start date. For rescheduled events, the startDate property should be used for the newly scheduled start date. In the (rare) case of an event that has been postponed and rescheduled multiple times, this field may be repeated.
   * @return previousStartDate property set by first invocation of previousStartDate method or {@code null}.
   */
  @JsonIgnore public java.util.Date getPreviousStartDate() {
    return (java.util.Date) getValue("previousStartDate");
  }
  /**
   * Used in conjunction with eventStatus for rescheduled or cancelled events. This property contains the previously scheduled start date. For rescheduled events, the startDate property should be used for the newly scheduled start date. In the (rare) case of an event that has been postponed and rescheduled multiple times, this field may be repeated.
   * @return all previousStartDate properties as {@link java.util.Collection} or an empty collection 
   * if previousStartDate was not set.
   */
  @JsonIgnore public java.util.Collection<java.util.Date> getPreviousStartDates() {
    final java.lang.Object current = myData.get("previousStartDate");
    if (current == null) return Collections.emptyList();
    if (current instanceof java.util.Collection) {
      return (java.util.Collection<java.util.Date>) current;
    }
    return Arrays.asList((java.util.Date) current);
  }
  /**
   * The number of attendee places for an event that remain unallocated.
   * @return remainingAttendeeCapacity property set by first invocation of remainingAttendeeCapacity method or {@code null}.
   */
  @JsonIgnore public Integer getRemainingAttendeeCapacity() {
    return (Integer) getValue("remainingAttendeeCapacity");
  }
  /**
   * The number of attendee places for an event that remain unallocated.
   * @return all remainingAttendeeCapacity properties as {@link java.util.Collection} or an empty collection 
   * if remainingAttendeeCapacity was not set.
   */
  @JsonIgnore public java.util.Collection<Integer> getRemainingAttendeeCapacitys() {
    final java.lang.Object current = myData.get("remainingAttendeeCapacity");
    if (current == null) return Collections.emptyList();
    if (current instanceof java.util.Collection) {
      return (java.util.Collection<Integer>) current;
    }
    return Arrays.asList((Integer) current);
  }
  /**
   * A secondary contributor to the CreativeWork or Event.
   * @return contributor property set by first invocation of contributor method or {@code null}.
   */
  @JsonIgnore public Organization getContributorOrganization() {
    return (Organization) getValue("contributor");
  }
  /**
   * A secondary contributor to the CreativeWork or Event.
   * @return all contributor properties as {@link java.util.Collection} or an empty collection 
   * if contributor was not set.
   */
  @JsonIgnore public java.util.Collection<Organization> getContributorOrganizations() {
    final java.lang.Object current = myData.get("contributor");
    if (current == null) return Collections.emptyList();
    if (current instanceof java.util.Collection) {
      return (java.util.Collection<Organization>) current;
    }
    return Arrays.asList((Organization) current);
  }
  /**
   * A secondary contributor to the CreativeWork or Event.
   * @return contributor property set by first invocation of contributor method or {@code null}.
   */
  @JsonIgnore public Person getContributorPerson() {
    return (Person) getValue("contributor");
  }
  /**
   * A secondary contributor to the CreativeWork or Event.
   * @return all contributor properties as {@link java.util.Collection} or an empty collection 
   * if contributor was not set.
   */
  @JsonIgnore public java.util.Collection<Person> getContributorPersons() {
    final java.lang.Object current = myData.get("contributor");
    if (current == null) return Collections.emptyList();
    if (current instanceof java.util.Collection) {
      return (java.util.Collection<Person>) current;
    }
    return Arrays.asList((Person) current);
  }
  /**
   * An intended audience, i.e. a group for whom something was created.
   * @return audience property set by first invocation of audience method or {@code null}.
   */
  @JsonIgnore public Audience getAudience() {
    return (Audience) getValue("audience");
  }
  /**
   * An intended audience, i.e. a group for whom something was created.
   * @return all audience properties as {@link java.util.Collection} or an empty collection 
   * if audience was not set.
   */
  @JsonIgnore public java.util.Collection<Audience> getAudiences() {
    final java.lang.Object current = myData.get("audience");
    if (current == null) return Collections.emptyList();
    if (current instanceof java.util.Collection) {
      return (java.util.Collection<Audience>) current;
    }
    return Arrays.asList((Audience) current);
  }
  /**
   * The maximum physical attendee capacity of an [[Event]] whose [[eventAttendanceMode]] is [[OfflineEventAttendanceMode]] (or the offline aspects, in the case of a [[MixedEventAttendanceMode]]). 
   * @return maximumPhysicalAttendeeCapacity property set by first invocation of maximumPhysicalAttendeeCapacity method or {@code null}.
   */
  @JsonIgnore public Integer getMaximumPhysicalAttendeeCapacity() {
    return (Integer) getValue("maximumPhysicalAttendeeCapacity");
  }
  /**
   * The maximum physical attendee capacity of an [[Event]] whose [[eventAttendanceMode]] is [[OfflineEventAttendanceMode]] (or the offline aspects, in the case of a [[MixedEventAttendanceMode]]). 
   * @return all maximumPhysicalAttendeeCapacity properties as {@link java.util.Collection} or an empty collection 
   * if maximumPhysicalAttendeeCapacity was not set.
   */
  @JsonIgnore public java.util.Collection<Integer> getMaximumPhysicalAttendeeCapacitys() {
    final java.lang.Object current = myData.get("maximumPhysicalAttendeeCapacity");
    if (current == null) return Collections.emptyList();
    if (current instanceof java.util.Collection) {
      return (java.util.Collection<Integer>) current;
    }
    return Arrays.asList((Integer) current);
  }
  /**
   *                           Associates an [[Event]] with a [[Schedule]]. There are circumstances where it is preferable to share a schedule for a series of
   * repeating events rather than data on the individual events themselves. For example, a website or application might prefer to publish a schedule for a weekly
   * gym class rather than provide data on every event. A schedule could be processed by applications to add forthcoming events to a calendar. An [[Event]] that
   * is associated with a [[Schedule]] using this property should not have [[startDate]] or [[endDate]] properties. These are instead defined within the associated
   * [[Schedule]], this avoids any ambiguity for clients using the data. The property might have repeated values to specify different schedules, e.g. for different months
   * or seasons.
   *                           @return eventSchedule property set by first invocation of eventSchedule method or {@code null}.
   */
  @JsonIgnore public Schedule getEventSchedule() {
    return (Schedule) getValue("eventSchedule");
  }
  /**
   *                               Associates an [[Event]] with a [[Schedule]]. There are circumstances where it is preferable to share a schedule for a series of
   * repeating events rather than data on the individual events themselves. For example, a website or application might prefer to publish a schedule for a weekly
   * gym class rather than provide data on every event. A schedule could be processed by applications to add forthcoming events to a calendar. An [[Event]] that
   * is associated with a [[Schedule]] using this property should not have [[startDate]] or [[endDate]] properties. These are instead defined within the associated
   * [[Schedule]], this avoids any ambiguity for clients using the data. The property might have repeated values to specify different schedules, e.g. for different months
   * or seasons.
   *                               @return all eventSchedule properties as {@link java.util.Collection} or an empty collection 
   *                               if eventSchedule was not set.
   */
  @JsonIgnore public java.util.Collection<Schedule> getEventSchedules() {
    final java.lang.Object current = myData.get("eventSchedule");
    if (current == null) return Collections.emptyList();
    if (current instanceof java.util.Collection) {
      return (java.util.Collection<Schedule>) current;
    }
    return Arrays.asList((Schedule) current);
  }
  /**
   * The time admission will commence.
   * @return doorTime property set by first invocation of doorTime method or {@code null}.
   */
  @JsonIgnore public java.util.Date getDoorTime() {
    return (java.util.Date) getValue("doorTime");
  }
  /**
   * The time admission will commence.
   * @return all doorTime properties as {@link java.util.Collection} or an empty collection 
   * if doorTime was not set.
   */
  @JsonIgnore public java.util.Collection<java.util.Date> getDoorTimes() {
    final java.lang.Object current = myData.get("doorTime");
    if (current == null) return Collections.emptyList();
    if (current instanceof java.util.Collection) {
      return (java.util.Collection<java.util.Date>) current;
    }
    return Arrays.asList((java.util.Date) current);
  }
  /**
   * Organization or person who adapts a creative work to different languages, regional differences and technical requirements of a target market, or that translates during some event.
   * @return translator property set by first invocation of translator method or {@code null}.
   */
  @JsonIgnore public Organization getTranslatorOrganization() {
    return (Organization) getValue("translator");
  }
  /**
   * Organization or person who adapts a creative work to different languages, regional differences and technical requirements of a target market, or that translates during some event.
   * @return all translator properties as {@link java.util.Collection} or an empty collection 
   * if translator was not set.
   */
  @JsonIgnore public java.util.Collection<Organization> getTranslatorOrganizations() {
    final java.lang.Object current = myData.get("translator");
    if (current == null) return Collections.emptyList();
    if (current instanceof java.util.Collection) {
      return (java.util.Collection<Organization>) current;
    }
    return Arrays.asList((Organization) current);
  }
  /**
   * Organization or person who adapts a creative work to different languages, regional differences and technical requirements of a target market, or that translates during some event.
   * @return translator property set by first invocation of translator method or {@code null}.
   */
  @JsonIgnore public Person getTranslatorPerson() {
    return (Person) getValue("translator");
  }
  /**
   * Organization or person who adapts a creative work to different languages, regional differences and technical requirements of a target market, or that translates during some event.
   * @return all translator properties as {@link java.util.Collection} or an empty collection 
   * if translator was not set.
   */
  @JsonIgnore public java.util.Collection<Person> getTranslatorPersons() {
    final java.lang.Object current = myData.get("translator");
    if (current == null) return Collections.emptyList();
    if (current instanceof java.util.Collection) {
      return (java.util.Collection<Person>) current;
    }
    return Arrays.asList((Person) current);
  }
  /**
   * A person or organization that supports a thing through a pledge, promise, or financial contribution. e.g. a sponsor of a Medical Study or a corporate sponsor of an event.
   * @return sponsor property set by first invocation of sponsor method or {@code null}.
   */
  @JsonIgnore public Sponsor getSponsor() {
    return (Sponsor) getValue("sponsor");
  }
  /**
   * A person or organization that supports a thing through a pledge, promise, or financial contribution. e.g. a sponsor of a Medical Study or a corporate sponsor of an event.
   * @return all sponsor properties as {@link java.util.Collection} or an empty collection 
   * if sponsor was not set.
   */
  @JsonIgnore public java.util.Collection<Sponsor> getSponsors() {
    final java.lang.Object current = myData.get("sponsor");
    if (current == null) return Collections.emptyList();
    if (current instanceof java.util.Collection) {
      return (java.util.Collection<Sponsor>) current;
    }
    return Arrays.asList((Sponsor) current);
  }
  /**
   * A person or organization that supports (sponsors) something through some kind of financial contribution.
   * @return funder property set by first invocation of funder method or {@code null}.
   */
  @JsonIgnore public Sponsor getFunder() {
    return (Sponsor) getValue("funder");
  }
  /**
   * A person or organization that supports (sponsors) something through some kind of financial contribution.
   * @return all funder properties as {@link java.util.Collection} or an empty collection 
   * if funder was not set.
   */
  @JsonIgnore public java.util.Collection<Sponsor> getFunders() {
    final java.lang.Object current = myData.get("funder");
    if (current == null) return Collections.emptyList();
    if (current instanceof java.util.Collection) {
      return (java.util.Collection<Sponsor>) current;
    }
    return Arrays.asList((Sponsor) current);
  }
  /**
   * A review of the item.
   * @return review property set by first invocation of review method or {@code null}.
   */
  @JsonIgnore public Review getReview() {
    return (Review) getValue("review");
  }
  /**
   * A review of the item.
   * @return all review properties as {@link java.util.Collection} or an empty collection 
   * if review was not set.
   */
  @JsonIgnore public java.util.Collection<Review> getReviews() {
    final java.lang.Object current = myData.get("review");
    if (current == null) return Collections.emptyList();
    if (current instanceof java.util.Collection) {
      return (java.util.Collection<Review>) current;
    }
    return Arrays.asList((Review) current);
  }
  /**
   * The typical expected age range, e.g. '7-9', '11-'.
   * @return typicalAgeRange property set by first invocation of typicalAgeRange method or {@code null}.
   */
  @JsonIgnore public String getTypicalAgeRange() {
    return (String) getValue("typicalAgeRange");
  }
  /**
   * The typical expected age range, e.g. '7-9', '11-'.
   * @return all typicalAgeRange properties as {@link java.util.Collection} or an empty collection 
   * if typicalAgeRange was not set.
   */
  @JsonIgnore public java.util.Collection<String> getTypicalAgeRanges() {
    final java.lang.Object current = myData.get("typicalAgeRange");
    if (current == null) return Collections.emptyList();
    if (current instanceof java.util.Collection) {
      return (java.util.Collection<String>) current;
    }
    return Arrays.asList((String) current);
  }
  /**
   * The total number of individuals that may attend an event or venue.
   * @return maximumAttendeeCapacity property set by first invocation of maximumAttendeeCapacity method or {@code null}.
   */
  @JsonIgnore public Integer getMaximumAttendeeCapacity() {
    return (Integer) getValue("maximumAttendeeCapacity");
  }
  /**
   * The total number of individuals that may attend an event or venue.
   * @return all maximumAttendeeCapacity properties as {@link java.util.Collection} or an empty collection 
   * if maximumAttendeeCapacity was not set.
   */
  @JsonIgnore public java.util.Collection<Integer> getMaximumAttendeeCapacitys() {
    final java.lang.Object current = myData.get("maximumAttendeeCapacity");
    if (current == null) return Collections.emptyList();
    if (current instanceof java.util.Collection) {
      return (java.util.Collection<Integer>) current;
    }
    return Arrays.asList((Integer) current);
  }
  /**
   * The end date and time of the item (in [ISO 8601 date format](http://en.wikipedia.org/wiki/ISO_8601)).
   * @return endDate property set by first invocation of endDate method or {@code null}.
   */
  @JsonIgnore public java.util.Date getEndDate() {
    return (java.util.Date) getValue("endDate");
  }
  /**
   * The end date and time of the item (in [ISO 8601 date format](http://en.wikipedia.org/wiki/ISO_8601)).
   * @return all endDate properties as {@link java.util.Collection} or an empty collection 
   * if endDate was not set.
   */
  @JsonIgnore public java.util.Collection<java.util.Date> getEndDates() {
    final java.lang.Object current = myData.get("endDate");
    if (current == null) return Collections.emptyList();
    if (current instanceof java.util.Collection) {
      return (java.util.Collection<java.util.Date>) current;
    }
    return Arrays.asList((java.util.Date) current);
  }
  /**
   * An Event that is part of this event. For example, a conference event includes many presentations, each of which is a subEvent of the conference.
   * @return subEvent property set by first invocation of subEvent method or {@code null}.
   */
  @JsonIgnore public Event getSubEvent() {
    return (Event) getValue("subEvent");
  }
  /**
   * An Event that is part of this event. For example, a conference event includes many presentations, each of which is a subEvent of the conference.
   * @return all subEvent properties as {@link java.util.Collection} or an empty collection 
   * if subEvent was not set.
   */
  @JsonIgnore public java.util.Collection<Event> getSubEvents() {
    final java.lang.Object current = myData.get("subEvent");
    if (current == null) return Collections.emptyList();
    if (current instanceof java.util.Collection) {
      return (java.util.Collection<Event>) current;
    }
    return Arrays.asList((Event) current);
  }
  /**
   * An offer to provide this item&amp;#x2014;for example, an offer to sell a product, rent the DVD of a movie, perform a service, or give away tickets to an event. Use [[businessFunction]] to indicate the kind of transaction offered, i.e. sell, lease, etc. This property can also be used to describe a [[Demand]]. While this property is listed as expected on a number of common types, it can be used in others. In that case, using a second type, such as Product or a subtype of Product, can clarify the nature of the offer.
   * 
   * @return offers property set by first invocation of offers method or {@code null}.
   */
  @JsonIgnore public Demand getOffersDemand() {
    return (Demand) getValue("offers");
  }
  /**
   * An offer to provide this item&amp;#x2014;for example, an offer to sell a product, rent the DVD of a movie, perform a service, or give away tickets to an event. Use [[businessFunction]] to indicate the kind of transaction offered, i.e. sell, lease, etc. This property can also be used to describe a [[Demand]]. While this property is listed as expected on a number of common types, it can be used in others. In that case, using a second type, such as Product or a subtype of Product, can clarify the nature of the offer.
   * 
   * @return all offers properties as {@link java.util.Collection} or an empty collection 
   * if offers was not set.
   */
  @JsonIgnore public java.util.Collection<Demand> getOffersDemands() {
    final java.lang.Object current = myData.get("offers");
    if (current == null) return Collections.emptyList();
    if (current instanceof java.util.Collection) {
      return (java.util.Collection<Demand>) current;
    }
    return Arrays.asList((Demand) current);
  }
  /**
   * An offer to provide this item&amp;#x2014;for example, an offer to sell a product, rent the DVD of a movie, perform a service, or give away tickets to an event. Use [[businessFunction]] to indicate the kind of transaction offered, i.e. sell, lease, etc. This property can also be used to describe a [[Demand]]. While this property is listed as expected on a number of common types, it can be used in others. In that case, using a second type, such as Product or a subtype of Product, can clarify the nature of the offer.
   * 
   * @return offers property set by first invocation of offers method or {@code null}.
   */
  @JsonIgnore public Offer getOffersOffer() {
    return (Offer) getValue("offers");
  }
  /**
   * An offer to provide this item&amp;#x2014;for example, an offer to sell a product, rent the DVD of a movie, perform a service, or give away tickets to an event. Use [[businessFunction]] to indicate the kind of transaction offered, i.e. sell, lease, etc. This property can also be used to describe a [[Demand]]. While this property is listed as expected on a number of common types, it can be used in others. In that case, using a second type, such as Product or a subtype of Product, can clarify the nature of the offer.
   * 
   * @return all offers properties as {@link java.util.Collection} or an empty collection 
   * if offers was not set.
   */
  @JsonIgnore public java.util.Collection<Offer> getOffersOffers() {
    final java.lang.Object current = myData.get("offers");
    if (current == null) return Collections.emptyList();
    if (current instanceof java.util.Collection) {
      return (java.util.Collection<Offer>) current;
    }
    return Arrays.asList((Offer) current);
  }
  /**
   * The subject matter of the content.
   * @return about property set by first invocation of about method or {@code null}.
   */
  @JsonIgnore public Thing getAbout() {
    return (Thing) getValue("about");
  }
  /**
   * The subject matter of the content.
   * @return all about properties as {@link java.util.Collection} or an empty collection 
   * if about was not set.
   */
  @JsonIgnore public java.util.Collection<Thing> getAbouts() {
    final java.lang.Object current = myData.get("about");
    if (current == null) return Collections.emptyList();
    if (current instanceof java.util.Collection) {
      return (java.util.Collection<Thing>) current;
    }
    return Arrays.asList((Thing) current);
  }
  /**
   * An event that this event is a part of. For example, a collection of individual music performances might each have a music festival as their superEvent.
   * @return superEvent property set by first invocation of superEvent method or {@code null}.
   */
  @JsonIgnore public Event getSuperEvent() {
    return (Event) getValue("superEvent");
  }
  /**
   * An event that this event is a part of. For example, a collection of individual music performances might each have a music festival as their superEvent.
   * @return all superEvent properties as {@link java.util.Collection} or an empty collection 
   * if superEvent was not set.
   */
  @JsonIgnore public java.util.Collection<Event> getSuperEvents() {
    final java.lang.Object current = myData.get("superEvent");
    if (current == null) return Collections.emptyList();
    if (current instanceof java.util.Collection) {
      return (java.util.Collection<Event>) current;
    }
    return Arrays.asList((Event) current);
  }
  /**
   * The CreativeWork that captured all or part of this Event.
   * @return recordedIn property set by first invocation of recordedIn method or {@code null}.
   */
  @JsonIgnore public CreativeWork getRecordedIn() {
    return (CreativeWork) getValue("recordedIn");
  }
  /**
   * The CreativeWork that captured all or part of this Event.
   * @return all recordedIn properties as {@link java.util.Collection} or an empty collection 
   * if recordedIn was not set.
   */
  @JsonIgnore public java.util.Collection<CreativeWork> getRecordedIns() {
    final java.lang.Object current = myData.get("recordedIn");
    if (current == null) return Collections.emptyList();
    if (current instanceof java.util.Collection) {
      return (java.util.Collection<CreativeWork>) current;
    }
    return Arrays.asList((CreativeWork) current);
  }
  protected Event(java.util.Map<String,java.lang.Object> data) {
    super(data);
  }
  
  /**
   * Builder for {@link Event}
   */
  public static class Builder extends Thing.Builder {
    public Builder(@NotNull HashMap<String,java.lang.Object> data) {
      super(data);
    }
    @NotNull public Event build() {
      return new Event(myData);
    }
    /**
     * An organizer of an Event.
     * @param organization value to set
     * @return this builder instance
     */
    @NotNull public Builder organizer(@NotNull Organization organization) {
      putValue("organizer", organization);
      return this;
    }
    /**
     * An organizer of an Event.
     * @param organization value to set
     * @return this builder instance
     */
    @NotNull public Builder organizer(@NotNull Organization.Builder organization) {
      putValue("organizer", organization.build());
      return this;
    }
    /**
     * An organizer of an Event.
     * @param person value to set
     * @return this builder instance
     */
    @NotNull public Builder organizer(@NotNull Person person) {
      putValue("organizer", person);
      return this;
    }
    /**
     * An organizer of an Event.
     * @param person value to set
     * @return this builder instance
     */
    @NotNull public Builder organizer(@NotNull Person.Builder person) {
      putValue("organizer", person.build());
      return this;
    }
    /**
     * Remove organizer property from the builder.
     * If this property is repeatable, all instances are removed.
     * @return this builder instance
     */
    @NotNull public Builder removeOrganizer() {
      removeValue("organizer");
      return this;
    }
    /**
     * Get currently set value for organizer property in this builder.
     * @return previously set value or {@code null}. If multiple values have been 
     * set to this property, then {@link java.util.Collection} instance will be 
     * returned.
     */
    @Nullable public java.lang.Object getOrganizer() {
      return myData.get("organizer");
    }
    /**
     * The language of the content or performance or used in an action. Please use one of the language codes from the [IETF BCP 47 standard](http://tools.ietf.org/html/bcp47). See also [[availableLanguage]].
     * @param language value to set
     * @return this builder instance
     */
    @NotNull public Builder inLanguage(@NotNull Language language) {
      putValue("inLanguage", language);
      return this;
    }
    /**
     * The language of the content or performance or used in an action. Please use one of the language codes from the [IETF BCP 47 standard](http://tools.ietf.org/html/bcp47). See also [[availableLanguage]].
     * @param language value to set
     * @return this builder instance
     */
    @NotNull public Builder inLanguage(@NotNull Language.Builder language) {
      putValue("inLanguage", language.build());
      return this;
    }
    /**
     * The language of the content or performance or used in an action. Please use one of the language codes from the [IETF BCP 47 standard](http://tools.ietf.org/html/bcp47). See also [[availableLanguage]].
     * @param inLanguage value to set
     * @return this builder instance
     */
    @NotNull public Builder inLanguage(@NotNull String inLanguage) {
      putValue("inLanguage", inLanguage);
      return this;
    }
    /**
     * Remove inLanguage property from the builder.
     * If this property is repeatable, all instances are removed.
     * @return this builder instance
     */
    @NotNull public Builder removeInLanguage() {
      removeValue("inLanguage");
      return this;
    }
    /**
     * Get currently set value for inLanguage property in this builder.
     * @return previously set value or {@code null}. If multiple values have been 
     * set to this property, then {@link java.util.Collection} instance will be 
     * returned.
     */
    @Nullable public java.lang.Object getInLanguage() {
      return myData.get("inLanguage");
    }
    /**
     *                                  A work featured in some event, e.g. exhibited in an ExhibitionEvent.
     * Specific subproperties are available for workPerformed (e.g. a play), or a workPresented (a Movie at a ScreeningEvent).
     *                                  @param workFeatured value to set
     *                                  @return this builder instance
     */
    @NotNull public Builder workFeatured(@NotNull WorkFeatured workFeatured) {
      putValue("workFeatured", workFeatured);
      return this;
    }
    /**
     * Remove workFeatured property from the builder.
     * If this property is repeatable, all instances are removed.
     * @return this builder instance
     */
    @NotNull public Builder removeWorkFeatured() {
      removeValue("workFeatured");
      return this;
    }
    /**
     * Get currently set value for workFeatured property in this builder.
     * @return previously set value or {@code null}. If multiple values have been 
     * set to this property, then {@link java.util.Collection} instance will be 
     * returned.
     */
    @Nullable public java.lang.Object getWorkFeatured() {
      return myData.get("workFeatured");
    }
    /**
     * A work performed in some event, for example a play performed in a TheaterEvent.
     * @param workFeatured value to set
     * @return this builder instance
     */
    @NotNull public Builder workPerformed(@NotNull WorkFeatured workFeatured) {
      putValue("workPerformed", workFeatured);
      return this;
    }
    /**
     * Remove workPerformed property from the builder.
     * If this property is repeatable, all instances are removed.
     * @return this builder instance
     */
    @NotNull public Builder removeWorkPerformed() {
      removeValue("workPerformed");
      return this;
    }
    /**
     * Get currently set value for workPerformed property in this builder.
     * @return previously set value or {@code null}. If multiple values have been 
     * set to this property, then {@link java.util.Collection} instance will be 
     * returned.
     */
    @Nullable public java.lang.Object getWorkPerformed() {
      return myData.get("workPerformed");
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
     * The person or organization who wrote a composition, or who is the composer of a work performed at some event.
     * @param organization value to set
     * @return this builder instance
     */
    @NotNull public Builder composer(@NotNull Organization organization) {
      putValue("composer", organization);
      return this;
    }
    /**
     * The person or organization who wrote a composition, or who is the composer of a work performed at some event.
     * @param organization value to set
     * @return this builder instance
     */
    @NotNull public Builder composer(@NotNull Organization.Builder organization) {
      putValue("composer", organization.build());
      return this;
    }
    /**
     * The person or organization who wrote a composition, or who is the composer of a work performed at some event.
     * @param person value to set
     * @return this builder instance
     */
    @NotNull public Builder composer(@NotNull Person person) {
      putValue("composer", person);
      return this;
    }
    /**
     * The person or organization who wrote a composition, or who is the composer of a work performed at some event.
     * @param person value to set
     * @return this builder instance
     */
    @NotNull public Builder composer(@NotNull Person.Builder person) {
      putValue("composer", person.build());
      return this;
    }
    /**
     * Remove composer property from the builder.
     * If this property is repeatable, all instances are removed.
     * @return this builder instance
     */
    @NotNull public Builder removeComposer() {
      removeValue("composer");
      return this;
    }
    /**
     * Get currently set value for composer property in this builder.
     * @return previously set value or {@code null}. If multiple values have been 
     * set to this property, then {@link java.util.Collection} instance will be 
     * returned.
     */
    @Nullable public java.lang.Object getComposer() {
      return myData.get("composer");
    }
    /**
     * A person or organization attending the event.
     * @param organization value to set
     * @return this builder instance
     */
    @NotNull public Builder attendee(@NotNull Organization organization) {
      putValue("attendee", organization);
      return this;
    }
    /**
     * A person or organization attending the event.
     * @param organization value to set
     * @return this builder instance
     */
    @NotNull public Builder attendee(@NotNull Organization.Builder organization) {
      putValue("attendee", organization.build());
      return this;
    }
    /**
     * A person or organization attending the event.
     * @param person value to set
     * @return this builder instance
     */
    @NotNull public Builder attendee(@NotNull Person person) {
      putValue("attendee", person);
      return this;
    }
    /**
     * A person or organization attending the event.
     * @param person value to set
     * @return this builder instance
     */
    @NotNull public Builder attendee(@NotNull Person.Builder person) {
      putValue("attendee", person.build());
      return this;
    }
    /**
     * Remove attendee property from the builder.
     * If this property is repeatable, all instances are removed.
     * @return this builder instance
     */
    @NotNull public Builder removeAttendee() {
      removeValue("attendee");
      return this;
    }
    /**
     * Get currently set value for attendee property in this builder.
     * @return previously set value or {@code null}. If multiple values have been 
     * set to this property, then {@link java.util.Collection} instance will be 
     * returned.
     */
    @Nullable public java.lang.Object getAttendee() {
      return myData.get("attendee");
    }
    /**
     * An actor, e.g. in tv, radio, movie, video games etc., or in an event. Actors can be associated with individual items or with a series, episode, clip.
     * @param actor value to set
     * @return this builder instance
     */
    @NotNull public Builder actor(@NotNull Actor actor) {
      putValue("actor", actor);
      return this;
    }
    /**
     * Remove actor property from the builder.
     * If this property is repeatable, all instances are removed.
     * @return this builder instance
     */
    @NotNull public Builder removeActor() {
      removeValue("actor");
      return this;
    }
    /**
     * Get currently set value for actor property in this builder.
     * @return previously set value or {@code null}. If multiple values have been 
     * set to this property, then {@link java.util.Collection} instance will be 
     * returned.
     */
    @Nullable public java.lang.Object getActor() {
      return myData.get("actor");
    }
    /**
     * The overall rating, based on a collection of reviews or ratings, of the item.
     * @param aggregateRating value to set
     * @return this builder instance
     */
    @NotNull public Builder aggregateRating(@NotNull AggregateRating aggregateRating) {
      putValue("aggregateRating", aggregateRating);
      return this;
    }
    /**
     * The overall rating, based on a collection of reviews or ratings, of the item.
     * @param aggregateRating value to set
     * @return this builder instance
     */
    @NotNull public Builder aggregateRating(@NotNull AggregateRating.Builder aggregateRating) {
      putValue("aggregateRating", aggregateRating.build());
      return this;
    }
    /**
     * Remove aggregateRating property from the builder.
     * If this property is repeatable, all instances are removed.
     * @return this builder instance
     */
    @NotNull public Builder removeAggregateRating() {
      removeValue("aggregateRating");
      return this;
    }
    /**
     * Get currently set value for aggregateRating property in this builder.
     * @return previously set value or {@code null}. If multiple values have been 
     * set to this property, then {@link java.util.Collection} instance will be 
     * returned.
     */
    @Nullable public java.lang.Object getAggregateRating() {
      return myData.get("aggregateRating");
    }
    /**
     * A performer at the event&amp;#x2014;for example, a presenter, musician, musical group or actor.
     * @param organization value to set
     * @return this builder instance
     */
    @NotNull public Builder performer(@NotNull Organization organization) {
      putValue("performer", organization);
      return this;
    }
    /**
     * A performer at the event&amp;#x2014;for example, a presenter, musician, musical group or actor.
     * @param organization value to set
     * @return this builder instance
     */
    @NotNull public Builder performer(@NotNull Organization.Builder organization) {
      putValue("performer", organization.build());
      return this;
    }
    /**
     * A performer at the event&amp;#x2014;for example, a presenter, musician, musical group or actor.
     * @param person value to set
     * @return this builder instance
     */
    @NotNull public Builder performer(@NotNull Person person) {
      putValue("performer", person);
      return this;
    }
    /**
     * A performer at the event&amp;#x2014;for example, a presenter, musician, musical group or actor.
     * @param person value to set
     * @return this builder instance
     */
    @NotNull public Builder performer(@NotNull Person.Builder person) {
      putValue("performer", person.build());
      return this;
    }
    /**
     * Remove performer property from the builder.
     * If this property is repeatable, all instances are removed.
     * @return this builder instance
     */
    @NotNull public Builder removePerformer() {
      removeValue("performer");
      return this;
    }
    /**
     * Get currently set value for performer property in this builder.
     * @return previously set value or {@code null}. If multiple values have been 
     * set to this property, then {@link java.util.Collection} instance will be 
     * returned.
     */
    @Nullable public java.lang.Object getPerformer() {
      return myData.get("performer");
    }
    /**
     * An eventStatus of an event represents its status; particularly useful when an event is cancelled or rescheduled.
     * @param eventStatusType value to set
     * @return this builder instance
     */
    @NotNull public Builder eventStatus(@NotNull EventStatusType eventStatusType) {
      putValue("eventStatus", eventStatusType);
      return this;
    }
    /**
     * Remove eventStatus property from the builder.
     * If this property is repeatable, all instances are removed.
     * @return this builder instance
     */
    @NotNull public Builder removeEventStatus() {
      removeValue("eventStatus");
      return this;
    }
    /**
     * Get currently set value for eventStatus property in this builder.
     * @return previously set value or {@code null}. If multiple values have been 
     * set to this property, then {@link java.util.Collection} instance will be 
     * returned.
     */
    @Nullable public java.lang.Object getEventStatus() {
      return myData.get("eventStatus");
    }
    /**
     * The duration of the item (movie, audio recording, event, etc.) in [ISO 8601 date format](http://en.wikipedia.org/wiki/ISO_8601).
     * @param duration value to set
     * @return this builder instance
     */
    @NotNull public Builder duration(@NotNull Duration duration) {
      putValue("duration", duration);
      return this;
    }
    /**
     * Remove duration property from the builder.
     * If this property is repeatable, all instances are removed.
     * @return this builder instance
     */
    @NotNull public Builder removeDuration() {
      removeValue("duration");
      return this;
    }
    /**
     * Get currently set value for duration property in this builder.
     * @return previously set value or {@code null}. If multiple values have been 
     * set to this property, then {@link java.util.Collection} instance will be 
     * returned.
     */
    @Nullable public java.lang.Object getDuration() {
      return myData.get("duration");
    }
    /**
     * The maximum physical attendee capacity of an [[Event]] whose [[eventAttendanceMode]] is [[OnlineEventAttendanceMode]] (or the online aspects, in the case of a [[MixedEventAttendanceMode]]). 
     * @param integer value to set
     * @return this builder instance
     */
    @NotNull public Builder maximumVirtualAttendeeCapacity(@NotNull Integer integer) {
      putValue("maximumVirtualAttendeeCapacity", integer);
      return this;
    }
    /**
     * Remove maximumVirtualAttendeeCapacity property from the builder.
     * If this property is repeatable, all instances are removed.
     * @return this builder instance
     */
    @NotNull public Builder removeMaximumVirtualAttendeeCapacity() {
      removeValue("maximumVirtualAttendeeCapacity");
      return this;
    }
    /**
     * Get currently set value for maximumVirtualAttendeeCapacity property in this builder.
     * @return previously set value or {@code null}. If multiple values have been 
     * set to this property, then {@link java.util.Collection} instance will be 
     * returned.
     */
    @Nullable public java.lang.Object getMaximumVirtualAttendeeCapacity() {
      return myData.get("maximumVirtualAttendeeCapacity");
    }
    /**
     * The eventAttendanceMode of an event indicates whether it occurs online, offline, or a mix.
     * @param eventAttendanceModeEnumeration value to set
     * @return this builder instance
     */
    @NotNull public Builder eventAttendanceMode(@NotNull EventAttendanceModeEnumeration eventAttendanceModeEnumeration) {
      putValue("eventAttendanceMode", eventAttendanceModeEnumeration);
      return this;
    }
    /**
     * Remove eventAttendanceMode property from the builder.
     * If this property is repeatable, all instances are removed.
     * @return this builder instance
     */
    @NotNull public Builder removeEventAttendanceMode() {
      removeValue("eventAttendanceMode");
      return this;
    }
    /**
     * Get currently set value for eventAttendanceMode property in this builder.
     * @return previously set value or {@code null}. If multiple values have been 
     * set to this property, then {@link java.util.Collection} instance will be 
     * returned.
     */
    @Nullable public java.lang.Object getEventAttendanceMode() {
      return myData.get("eventAttendanceMode");
    }
    /**
     * The start date and time of the item (in [ISO 8601 date format](http://en.wikipedia.org/wiki/ISO_8601)).
     * @param date value to set
     * @return this builder instance
     */
    @NotNull public Builder startDate(@NotNull java.util.Date date) {
      putValue("startDate", date);
      return this;
    }
    /**
     * Remove startDate property from the builder.
     * If this property is repeatable, all instances are removed.
     * @return this builder instance
     */
    @NotNull public Builder removeStartDate() {
      removeValue("startDate");
      return this;
    }
    /**
     * Get currently set value for startDate property in this builder.
     * @return previously set value or {@code null}. If multiple values have been 
     * set to this property, then {@link java.util.Collection} instance will be 
     * returned.
     */
    @Nullable public java.lang.Object getStartDate() {
      return myData.get("startDate");
    }
    /**
     * A flag to signal that the item, event, or place is accessible for free.
     * @param isAccessibleForFree value to set
     * @return this builder instance
     */
    @NotNull public Builder isAccessibleForFree(@NotNull Boolean isAccessibleForFree) {
      putValue("isAccessibleForFree", isAccessibleForFree);
      return this;
    }
    /**
     * Remove isAccessibleForFree property from the builder.
     * If this property is repeatable, all instances are removed.
     * @return this builder instance
     */
    @NotNull public Builder removeIsAccessibleForFree() {
      removeValue("isAccessibleForFree");
      return this;
    }
    /**
     * Get currently set value for isAccessibleForFree property in this builder.
     * @return previously set value or {@code null}. If multiple values have been 
     * set to this property, then {@link java.util.Collection} instance will be 
     * returned.
     */
    @Nullable public java.lang.Object getIsAccessibleForFree() {
      return myData.get("isAccessibleForFree");
    }
    /**
     * A director of e.g. tv, radio, movie, video gaming etc. content, or of an event. Directors can be associated with individual items or with a series, episode, clip.
     * @param person value to set
     * @return this builder instance
     */
    @NotNull public Builder director(@NotNull Person person) {
      putValue("director", person);
      return this;
    }
    /**
     * A director of e.g. tv, radio, movie, video gaming etc. content, or of an event. Directors can be associated with individual items or with a series, episode, clip.
     * @param person value to set
     * @return this builder instance
     */
    @NotNull public Builder director(@NotNull Person.Builder person) {
      putValue("director", person.build());
      return this;
    }
    /**
     * Remove director property from the builder.
     * If this property is repeatable, all instances are removed.
     * @return this builder instance
     */
    @NotNull public Builder removeDirector() {
      removeValue("director");
      return this;
    }
    /**
     * Get currently set value for director property in this builder.
     * @return previously set value or {@code null}. If multiple values have been 
     * set to this property, then {@link java.util.Collection} instance will be 
     * returned.
     */
    @Nullable public java.lang.Object getDirector() {
      return myData.get("director");
    }
    /**
     * Used in conjunction with eventStatus for rescheduled or cancelled events. This property contains the previously scheduled start date. For rescheduled events, the startDate property should be used for the newly scheduled start date. In the (rare) case of an event that has been postponed and rescheduled multiple times, this field may be repeated.
     * @param date value to set
     * @return this builder instance
     */
    @NotNull public Builder previousStartDate(@NotNull java.util.Date date) {
      putValue("previousStartDate", date);
      return this;
    }
    /**
     * Remove previousStartDate property from the builder.
     * If this property is repeatable, all instances are removed.
     * @return this builder instance
     */
    @NotNull public Builder removePreviousStartDate() {
      removeValue("previousStartDate");
      return this;
    }
    /**
     * Get currently set value for previousStartDate property in this builder.
     * @return previously set value or {@code null}. If multiple values have been 
     * set to this property, then {@link java.util.Collection} instance will be 
     * returned.
     */
    @Nullable public java.lang.Object getPreviousStartDate() {
      return myData.get("previousStartDate");
    }
    /**
     * The number of attendee places for an event that remain unallocated.
     * @param integer value to set
     * @return this builder instance
     */
    @NotNull public Builder remainingAttendeeCapacity(@NotNull Integer integer) {
      putValue("remainingAttendeeCapacity", integer);
      return this;
    }
    /**
     * Remove remainingAttendeeCapacity property from the builder.
     * If this property is repeatable, all instances are removed.
     * @return this builder instance
     */
    @NotNull public Builder removeRemainingAttendeeCapacity() {
      removeValue("remainingAttendeeCapacity");
      return this;
    }
    /**
     * Get currently set value for remainingAttendeeCapacity property in this builder.
     * @return previously set value or {@code null}. If multiple values have been 
     * set to this property, then {@link java.util.Collection} instance will be 
     * returned.
     */
    @Nullable public java.lang.Object getRemainingAttendeeCapacity() {
      return myData.get("remainingAttendeeCapacity");
    }
    /**
     * A secondary contributor to the CreativeWork or Event.
     * @param organization value to set
     * @return this builder instance
     */
    @NotNull public Builder contributor(@NotNull Organization organization) {
      putValue("contributor", organization);
      return this;
    }
    /**
     * A secondary contributor to the CreativeWork or Event.
     * @param organization value to set
     * @return this builder instance
     */
    @NotNull public Builder contributor(@NotNull Organization.Builder organization) {
      putValue("contributor", organization.build());
      return this;
    }
    /**
     * A secondary contributor to the CreativeWork or Event.
     * @param person value to set
     * @return this builder instance
     */
    @NotNull public Builder contributor(@NotNull Person person) {
      putValue("contributor", person);
      return this;
    }
    /**
     * A secondary contributor to the CreativeWork or Event.
     * @param person value to set
     * @return this builder instance
     */
    @NotNull public Builder contributor(@NotNull Person.Builder person) {
      putValue("contributor", person.build());
      return this;
    }
    /**
     * Remove contributor property from the builder.
     * If this property is repeatable, all instances are removed.
     * @return this builder instance
     */
    @NotNull public Builder removeContributor() {
      removeValue("contributor");
      return this;
    }
    /**
     * Get currently set value for contributor property in this builder.
     * @return previously set value or {@code null}. If multiple values have been 
     * set to this property, then {@link java.util.Collection} instance will be 
     * returned.
     */
    @Nullable public java.lang.Object getContributor() {
      return myData.get("contributor");
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
     * The maximum physical attendee capacity of an [[Event]] whose [[eventAttendanceMode]] is [[OfflineEventAttendanceMode]] (or the offline aspects, in the case of a [[MixedEventAttendanceMode]]). 
     * @param integer value to set
     * @return this builder instance
     */
    @NotNull public Builder maximumPhysicalAttendeeCapacity(@NotNull Integer integer) {
      putValue("maximumPhysicalAttendeeCapacity", integer);
      return this;
    }
    /**
     * Remove maximumPhysicalAttendeeCapacity property from the builder.
     * If this property is repeatable, all instances are removed.
     * @return this builder instance
     */
    @NotNull public Builder removeMaximumPhysicalAttendeeCapacity() {
      removeValue("maximumPhysicalAttendeeCapacity");
      return this;
    }
    /**
     * Get currently set value for maximumPhysicalAttendeeCapacity property in this builder.
     * @return previously set value or {@code null}. If multiple values have been 
     * set to this property, then {@link java.util.Collection} instance will be 
     * returned.
     */
    @Nullable public java.lang.Object getMaximumPhysicalAttendeeCapacity() {
      return myData.get("maximumPhysicalAttendeeCapacity");
    }
    /**
     *                                   Associates an [[Event]] with a [[Schedule]]. There are circumstances where it is preferable to share a schedule for a series of
     * repeating events rather than data on the individual events themselves. For example, a website or application might prefer to publish a schedule for a weekly
     * gym class rather than provide data on every event. A schedule could be processed by applications to add forthcoming events to a calendar. An [[Event]] that
     * is associated with a [[Schedule]] using this property should not have [[startDate]] or [[endDate]] properties. These are instead defined within the associated
     * [[Schedule]], this avoids any ambiguity for clients using the data. The property might have repeated values to specify different schedules, e.g. for different months
     * or seasons.
     *                                   @param schedule value to set
     *                                   @return this builder instance
     */
    @NotNull public Builder eventSchedule(@NotNull Schedule schedule) {
      putValue("eventSchedule", schedule);
      return this;
    }
    /**
     *                                       Associates an [[Event]] with a [[Schedule]]. There are circumstances where it is preferable to share a schedule for a series of
     * repeating events rather than data on the individual events themselves. For example, a website or application might prefer to publish a schedule for a weekly
     * gym class rather than provide data on every event. A schedule could be processed by applications to add forthcoming events to a calendar. An [[Event]] that
     * is associated with a [[Schedule]] using this property should not have [[startDate]] or [[endDate]] properties. These are instead defined within the associated
     * [[Schedule]], this avoids any ambiguity for clients using the data. The property might have repeated values to specify different schedules, e.g. for different months
     * or seasons.
     *                                       @param schedule value to set
     *                                       @return this builder instance
     */
    @NotNull public Builder eventSchedule(@NotNull Schedule.Builder schedule) {
      putValue("eventSchedule", schedule.build());
      return this;
    }
    /**
     * Remove eventSchedule property from the builder.
     * If this property is repeatable, all instances are removed.
     * @return this builder instance
     */
    @NotNull public Builder removeEventSchedule() {
      removeValue("eventSchedule");
      return this;
    }
    /**
     * Get currently set value for eventSchedule property in this builder.
     * @return previously set value or {@code null}. If multiple values have been 
     * set to this property, then {@link java.util.Collection} instance will be 
     * returned.
     */
    @Nullable public java.lang.Object getEventSchedule() {
      return myData.get("eventSchedule");
    }
    /**
     * The time admission will commence.
     * @param date value to set
     * @return this builder instance
     */
    @NotNull public Builder doorTime(@NotNull java.util.Date date) {
      putValue("doorTime", date);
      return this;
    }
    /**
     * Remove doorTime property from the builder.
     * If this property is repeatable, all instances are removed.
     * @return this builder instance
     */
    @NotNull public Builder removeDoorTime() {
      removeValue("doorTime");
      return this;
    }
    /**
     * Get currently set value for doorTime property in this builder.
     * @return previously set value or {@code null}. If multiple values have been 
     * set to this property, then {@link java.util.Collection} instance will be 
     * returned.
     */
    @Nullable public java.lang.Object getDoorTime() {
      return myData.get("doorTime");
    }
    /**
     * Organization or person who adapts a creative work to different languages, regional differences and technical requirements of a target market, or that translates during some event.
     * @param organization value to set
     * @return this builder instance
     */
    @NotNull public Builder translator(@NotNull Organization organization) {
      putValue("translator", organization);
      return this;
    }
    /**
     * Organization or person who adapts a creative work to different languages, regional differences and technical requirements of a target market, or that translates during some event.
     * @param organization value to set
     * @return this builder instance
     */
    @NotNull public Builder translator(@NotNull Organization.Builder organization) {
      putValue("translator", organization.build());
      return this;
    }
    /**
     * Organization or person who adapts a creative work to different languages, regional differences and technical requirements of a target market, or that translates during some event.
     * @param person value to set
     * @return this builder instance
     */
    @NotNull public Builder translator(@NotNull Person person) {
      putValue("translator", person);
      return this;
    }
    /**
     * Organization or person who adapts a creative work to different languages, regional differences and technical requirements of a target market, or that translates during some event.
     * @param person value to set
     * @return this builder instance
     */
    @NotNull public Builder translator(@NotNull Person.Builder person) {
      putValue("translator", person.build());
      return this;
    }
    /**
     * Remove translator property from the builder.
     * If this property is repeatable, all instances are removed.
     * @return this builder instance
     */
    @NotNull public Builder removeTranslator() {
      removeValue("translator");
      return this;
    }
    /**
     * Get currently set value for translator property in this builder.
     * @return previously set value or {@code null}. If multiple values have been 
     * set to this property, then {@link java.util.Collection} instance will be 
     * returned.
     */
    @Nullable public java.lang.Object getTranslator() {
      return myData.get("translator");
    }
    /**
     * A person or organization that supports a thing through a pledge, promise, or financial contribution. e.g. a sponsor of a Medical Study or a corporate sponsor of an event.
     * @param sponsor value to set
     * @return this builder instance
     */
    @NotNull public Builder sponsor(@NotNull Sponsor sponsor) {
      putValue("sponsor", sponsor);
      return this;
    }
    /**
     * Remove sponsor property from the builder.
     * If this property is repeatable, all instances are removed.
     * @return this builder instance
     */
    @NotNull public Builder removeSponsor() {
      removeValue("sponsor");
      return this;
    }
    /**
     * Get currently set value for sponsor property in this builder.
     * @return previously set value or {@code null}. If multiple values have been 
     * set to this property, then {@link java.util.Collection} instance will be 
     * returned.
     */
    @Nullable public java.lang.Object getSponsor() {
      return myData.get("sponsor");
    }
    /**
     * A person or organization that supports (sponsors) something through some kind of financial contribution.
     * @param sponsor value to set
     * @return this builder instance
     */
    @NotNull public Builder funder(@NotNull Sponsor sponsor) {
      putValue("funder", sponsor);
      return this;
    }
    /**
     * Remove funder property from the builder.
     * If this property is repeatable, all instances are removed.
     * @return this builder instance
     */
    @NotNull public Builder removeFunder() {
      removeValue("funder");
      return this;
    }
    /**
     * Get currently set value for funder property in this builder.
     * @return previously set value or {@code null}. If multiple values have been 
     * set to this property, then {@link java.util.Collection} instance will be 
     * returned.
     */
    @Nullable public java.lang.Object getFunder() {
      return myData.get("funder");
    }
    /**
     * A review of the item.
     * @param review value to set
     * @return this builder instance
     */
    @NotNull public Builder review(@NotNull Review review) {
      putValue("review", review);
      return this;
    }
    /**
     * A review of the item.
     * @param review value to set
     * @return this builder instance
     */
    @NotNull public Builder review(@NotNull Review.Builder review) {
      putValue("review", review.build());
      return this;
    }
    /**
     * Remove review property from the builder.
     * If this property is repeatable, all instances are removed.
     * @return this builder instance
     */
    @NotNull public Builder removeReview() {
      removeValue("review");
      return this;
    }
    /**
     * Get currently set value for review property in this builder.
     * @return previously set value or {@code null}. If multiple values have been 
     * set to this property, then {@link java.util.Collection} instance will be 
     * returned.
     */
    @Nullable public java.lang.Object getReview() {
      return myData.get("review");
    }
    /**
     * The typical expected age range, e.g. '7-9', '11-'.
     * @param typicalAgeRange value to set
     * @return this builder instance
     */
    @NotNull public Builder typicalAgeRange(@NotNull String typicalAgeRange) {
      putValue("typicalAgeRange", typicalAgeRange);
      return this;
    }
    /**
     * Remove typicalAgeRange property from the builder.
     * If this property is repeatable, all instances are removed.
     * @return this builder instance
     */
    @NotNull public Builder removeTypicalAgeRange() {
      removeValue("typicalAgeRange");
      return this;
    }
    /**
     * Get currently set value for typicalAgeRange property in this builder.
     * @return previously set value or {@code null}. If multiple values have been 
     * set to this property, then {@link java.util.Collection} instance will be 
     * returned.
     */
    @Nullable public java.lang.Object getTypicalAgeRange() {
      return myData.get("typicalAgeRange");
    }
    /**
     * The total number of individuals that may attend an event or venue.
     * @param integer value to set
     * @return this builder instance
     */
    @NotNull public Builder maximumAttendeeCapacity(@NotNull Integer integer) {
      putValue("maximumAttendeeCapacity", integer);
      return this;
    }
    /**
     * Remove maximumAttendeeCapacity property from the builder.
     * If this property is repeatable, all instances are removed.
     * @return this builder instance
     */
    @NotNull public Builder removeMaximumAttendeeCapacity() {
      removeValue("maximumAttendeeCapacity");
      return this;
    }
    /**
     * Get currently set value for maximumAttendeeCapacity property in this builder.
     * @return previously set value or {@code null}. If multiple values have been 
     * set to this property, then {@link java.util.Collection} instance will be 
     * returned.
     */
    @Nullable public java.lang.Object getMaximumAttendeeCapacity() {
      return myData.get("maximumAttendeeCapacity");
    }
    /**
     * The end date and time of the item (in [ISO 8601 date format](http://en.wikipedia.org/wiki/ISO_8601)).
     * @param date value to set
     * @return this builder instance
     */
    @NotNull public Builder endDate(@NotNull java.util.Date date) {
      putValue("endDate", date);
      return this;
    }
    /**
     * Remove endDate property from the builder.
     * If this property is repeatable, all instances are removed.
     * @return this builder instance
     */
    @NotNull public Builder removeEndDate() {
      removeValue("endDate");
      return this;
    }
    /**
     * Get currently set value for endDate property in this builder.
     * @return previously set value or {@code null}. If multiple values have been 
     * set to this property, then {@link java.util.Collection} instance will be 
     * returned.
     */
    @Nullable public java.lang.Object getEndDate() {
      return myData.get("endDate");
    }
    /**
     * An Event that is part of this event. For example, a conference event includes many presentations, each of which is a subEvent of the conference.
     * @param event value to set
     * @return this builder instance
     */
    @NotNull public Builder subEvent(@NotNull Event event) {
      putValue("subEvent", event);
      return this;
    }
    /**
     * An Event that is part of this event. For example, a conference event includes many presentations, each of which is a subEvent of the conference.
     * @param event value to set
     * @return this builder instance
     */
    @NotNull public Builder subEvent(@NotNull Event.Builder event) {
      putValue("subEvent", event.build());
      return this;
    }
    /**
     * Remove subEvent property from the builder.
     * If this property is repeatable, all instances are removed.
     * @return this builder instance
     */
    @NotNull public Builder removeSubEvent() {
      removeValue("subEvent");
      return this;
    }
    /**
     * Get currently set value for subEvent property in this builder.
     * @return previously set value or {@code null}. If multiple values have been 
     * set to this property, then {@link java.util.Collection} instance will be 
     * returned.
     */
    @Nullable public java.lang.Object getSubEvent() {
      return myData.get("subEvent");
    }
    /**
     * An offer to provide this item&amp;#x2014;for example, an offer to sell a product, rent the DVD of a movie, perform a service, or give away tickets to an event. Use [[businessFunction]] to indicate the kind of transaction offered, i.e. sell, lease, etc. This property can also be used to describe a [[Demand]]. While this property is listed as expected on a number of common types, it can be used in others. In that case, using a second type, such as Product or a subtype of Product, can clarify the nature of the offer.
     * 
     * @param demand value to set
     * @return this builder instance
     */
    @NotNull public Builder offers(@NotNull Demand demand) {
      putValue("offers", demand);
      return this;
    }
    /**
     * An offer to provide this item&amp;#x2014;for example, an offer to sell a product, rent the DVD of a movie, perform a service, or give away tickets to an event. Use [[businessFunction]] to indicate the kind of transaction offered, i.e. sell, lease, etc. This property can also be used to describe a [[Demand]]. While this property is listed as expected on a number of common types, it can be used in others. In that case, using a second type, such as Product or a subtype of Product, can clarify the nature of the offer.
     * 
     * @param demand value to set
     * @return this builder instance
     */
    @NotNull public Builder offers(@NotNull Demand.Builder demand) {
      putValue("offers", demand.build());
      return this;
    }
    /**
     * An offer to provide this item&amp;#x2014;for example, an offer to sell a product, rent the DVD of a movie, perform a service, or give away tickets to an event. Use [[businessFunction]] to indicate the kind of transaction offered, i.e. sell, lease, etc. This property can also be used to describe a [[Demand]]. While this property is listed as expected on a number of common types, it can be used in others. In that case, using a second type, such as Product or a subtype of Product, can clarify the nature of the offer.
     * 
     * @param offer value to set
     * @return this builder instance
     */
    @NotNull public Builder offers(@NotNull Offer offer) {
      putValue("offers", offer);
      return this;
    }
    /**
     * An offer to provide this item&amp;#x2014;for example, an offer to sell a product, rent the DVD of a movie, perform a service, or give away tickets to an event. Use [[businessFunction]] to indicate the kind of transaction offered, i.e. sell, lease, etc. This property can also be used to describe a [[Demand]]. While this property is listed as expected on a number of common types, it can be used in others. In that case, using a second type, such as Product or a subtype of Product, can clarify the nature of the offer.
     * 
     * @param offer value to set
     * @return this builder instance
     */
    @NotNull public Builder offers(@NotNull Offer.Builder offer) {
      putValue("offers", offer.build());
      return this;
    }
    /**
     * Remove offers property from the builder.
     * If this property is repeatable, all instances are removed.
     * @return this builder instance
     */
    @NotNull public Builder removeOffers() {
      removeValue("offers");
      return this;
    }
    /**
     * Get currently set value for offers property in this builder.
     * @return previously set value or {@code null}. If multiple values have been 
     * set to this property, then {@link java.util.Collection} instance will be 
     * returned.
     */
    @Nullable public java.lang.Object getOffers() {
      return myData.get("offers");
    }
    /**
     * The subject matter of the content.
     * @param thing value to set
     * @return this builder instance
     */
    @NotNull public Builder about(@NotNull Thing thing) {
      putValue("about", thing);
      return this;
    }
    /**
     * The subject matter of the content.
     * @param thing value to set
     * @return this builder instance
     */
    @NotNull public Builder about(@NotNull Thing.Builder thing) {
      putValue("about", thing.build());
      return this;
    }
    /**
     * Remove about property from the builder.
     * If this property is repeatable, all instances are removed.
     * @return this builder instance
     */
    @NotNull public Builder removeAbout() {
      removeValue("about");
      return this;
    }
    /**
     * Get currently set value for about property in this builder.
     * @return previously set value or {@code null}. If multiple values have been 
     * set to this property, then {@link java.util.Collection} instance will be 
     * returned.
     */
    @Nullable public java.lang.Object getAbout() {
      return myData.get("about");
    }
    /**
     * An event that this event is a part of. For example, a collection of individual music performances might each have a music festival as their superEvent.
     * @param event value to set
     * @return this builder instance
     */
    @NotNull public Builder superEvent(@NotNull Event event) {
      putValue("superEvent", event);
      return this;
    }
    /**
     * An event that this event is a part of. For example, a collection of individual music performances might each have a music festival as their superEvent.
     * @param event value to set
     * @return this builder instance
     */
    @NotNull public Builder superEvent(@NotNull Event.Builder event) {
      putValue("superEvent", event.build());
      return this;
    }
    /**
     * Remove superEvent property from the builder.
     * If this property is repeatable, all instances are removed.
     * @return this builder instance
     */
    @NotNull public Builder removeSuperEvent() {
      removeValue("superEvent");
      return this;
    }
    /**
     * Get currently set value for superEvent property in this builder.
     * @return previously set value or {@code null}. If multiple values have been 
     * set to this property, then {@link java.util.Collection} instance will be 
     * returned.
     */
    @Nullable public java.lang.Object getSuperEvent() {
      return myData.get("superEvent");
    }
    /**
     * The CreativeWork that captured all or part of this Event.
     * @param creativeWork value to set
     * @return this builder instance
     */
    @NotNull public Builder recordedIn(@NotNull CreativeWork creativeWork) {
      putValue("recordedIn", creativeWork);
      return this;
    }
    /**
     * The CreativeWork that captured all or part of this Event.
     * @param creativeWork value to set
     * @return this builder instance
     */
    @NotNull public Builder recordedIn(@NotNull CreativeWork.Builder creativeWork) {
      putValue("recordedIn", creativeWork.build());
      return this;
    }
    /**
     * Remove recordedIn property from the builder.
     * If this property is repeatable, all instances are removed.
     * @return this builder instance
     */
    @NotNull public Builder removeRecordedIn() {
      removeValue("recordedIn");
      return this;
    }
    /**
     * Get currently set value for recordedIn property in this builder.
     * @return previously set value or {@code null}. If multiple values have been 
     * set to this property, then {@link java.util.Collection} instance will be 
     * returned.
     */
    @Nullable public java.lang.Object getRecordedIn() {
      return myData.get("recordedIn");
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
      if ("organizer".equals(key) && value instanceof Organization) { this.organizer((Organization)value); return; }
      if ("organizers".equals(key) && value instanceof Organization) { this.organizer((Organization)value); return; }
      if ("organizer".equals(key) && value instanceof Person) { this.organizer((Person)value); return; }
      if ("organizers".equals(key) && value instanceof Person) { this.organizer((Person)value); return; }
      if ("inLanguage".equals(key) && value instanceof Language) { this.inLanguage((Language)value); return; }
      if ("inLanguages".equals(key) && value instanceof Language) { this.inLanguage((Language)value); return; }
      if ("inLanguage".equals(key) && value instanceof String) { this.inLanguage((String)value); return; }
      if ("inLanguages".equals(key) && value instanceof String) { this.inLanguage((String)value); return; }
      if ("workFeatured".equals(key) && value instanceof WorkFeatured) { this.workFeatured((WorkFeatured)value); return; }
      if ("workFeatureds".equals(key) && value instanceof WorkFeatured) { this.workFeatured((WorkFeatured)value); return; }
      if ("workPerformed".equals(key) && value instanceof WorkFeatured) { this.workPerformed((WorkFeatured)value); return; }
      if ("workPerformeds".equals(key) && value instanceof WorkFeatured) { this.workPerformed((WorkFeatured)value); return; }
      if ("location".equals(key) && value instanceof Location) { this.location((Location)value); return; }
      if ("locations".equals(key) && value instanceof Location) { this.location((Location)value); return; }
      if ("composer".equals(key) && value instanceof Organization) { this.composer((Organization)value); return; }
      if ("composers".equals(key) && value instanceof Organization) { this.composer((Organization)value); return; }
      if ("composer".equals(key) && value instanceof Person) { this.composer((Person)value); return; }
      if ("composers".equals(key) && value instanceof Person) { this.composer((Person)value); return; }
      if ("attendee".equals(key) && value instanceof Organization) { this.attendee((Organization)value); return; }
      if ("attendees".equals(key) && value instanceof Organization) { this.attendee((Organization)value); return; }
      if ("attendee".equals(key) && value instanceof Person) { this.attendee((Person)value); return; }
      if ("attendees".equals(key) && value instanceof Person) { this.attendee((Person)value); return; }
      if ("actor".equals(key) && value instanceof Actor) { this.actor((Actor)value); return; }
      if ("actors".equals(key) && value instanceof Actor) { this.actor((Actor)value); return; }
      if ("aggregateRating".equals(key) && value instanceof AggregateRating) { this.aggregateRating((AggregateRating)value); return; }
      if ("aggregateRatings".equals(key) && value instanceof AggregateRating) { this.aggregateRating((AggregateRating)value); return; }
      if ("performer".equals(key) && value instanceof Organization) { this.performer((Organization)value); return; }
      if ("performers".equals(key) && value instanceof Organization) { this.performer((Organization)value); return; }
      if ("performer".equals(key) && value instanceof Person) { this.performer((Person)value); return; }
      if ("performers".equals(key) && value instanceof Person) { this.performer((Person)value); return; }
      if ("eventStatus".equals(key) && value instanceof EventStatusType) { this.eventStatus((EventStatusType)value); return; }
      if ("eventStatuss".equals(key) && value instanceof EventStatusType) { this.eventStatus((EventStatusType)value); return; }
      if ("duration".equals(key) && value instanceof Duration) { this.duration((Duration)value); return; }
      if ("durations".equals(key) && value instanceof Duration) { this.duration((Duration)value); return; }
      if ("maximumVirtualAttendeeCapacity".equals(key) && value instanceof Integer) { this.maximumVirtualAttendeeCapacity((Integer)value); return; }
      if ("maximumVirtualAttendeeCapacitys".equals(key) && value instanceof Integer) { this.maximumVirtualAttendeeCapacity((Integer)value); return; }
      if ("eventAttendanceMode".equals(key) && value instanceof EventAttendanceModeEnumeration) { this.eventAttendanceMode((EventAttendanceModeEnumeration)value); return; }
      if ("eventAttendanceModes".equals(key) && value instanceof EventAttendanceModeEnumeration) { this.eventAttendanceMode((EventAttendanceModeEnumeration)value); return; }
      if ("startDate".equals(key) && value instanceof java.util.Date) { this.startDate((java.util.Date)value); return; }
      if ("startDates".equals(key) && value instanceof java.util.Date) { this.startDate((java.util.Date)value); return; }
      if ("isAccessibleForFree".equals(key) && value instanceof Boolean) { this.isAccessibleForFree((Boolean)value); return; }
      if ("isAccessibleForFrees".equals(key) && value instanceof Boolean) { this.isAccessibleForFree((Boolean)value); return; }
      if ("director".equals(key) && value instanceof Person) { this.director((Person)value); return; }
      if ("directors".equals(key) && value instanceof Person) { this.director((Person)value); return; }
      if ("previousStartDate".equals(key) && value instanceof java.util.Date) { this.previousStartDate((java.util.Date)value); return; }
      if ("previousStartDates".equals(key) && value instanceof java.util.Date) { this.previousStartDate((java.util.Date)value); return; }
      if ("remainingAttendeeCapacity".equals(key) && value instanceof Integer) { this.remainingAttendeeCapacity((Integer)value); return; }
      if ("remainingAttendeeCapacitys".equals(key) && value instanceof Integer) { this.remainingAttendeeCapacity((Integer)value); return; }
      if ("contributor".equals(key) && value instanceof Organization) { this.contributor((Organization)value); return; }
      if ("contributors".equals(key) && value instanceof Organization) { this.contributor((Organization)value); return; }
      if ("contributor".equals(key) && value instanceof Person) { this.contributor((Person)value); return; }
      if ("contributors".equals(key) && value instanceof Person) { this.contributor((Person)value); return; }
      if ("audience".equals(key) && value instanceof Audience) { this.audience((Audience)value); return; }
      if ("audiences".equals(key) && value instanceof Audience) { this.audience((Audience)value); return; }
      if ("maximumPhysicalAttendeeCapacity".equals(key) && value instanceof Integer) { this.maximumPhysicalAttendeeCapacity((Integer)value); return; }
      if ("maximumPhysicalAttendeeCapacitys".equals(key) && value instanceof Integer) { this.maximumPhysicalAttendeeCapacity((Integer)value); return; }
      if ("eventSchedule".equals(key) && value instanceof Schedule) { this.eventSchedule((Schedule)value); return; }
      if ("eventSchedules".equals(key) && value instanceof Schedule) { this.eventSchedule((Schedule)value); return; }
      if ("doorTime".equals(key) && value instanceof java.util.Date) { this.doorTime((java.util.Date)value); return; }
      if ("doorTimes".equals(key) && value instanceof java.util.Date) { this.doorTime((java.util.Date)value); return; }
      if ("translator".equals(key) && value instanceof Organization) { this.translator((Organization)value); return; }
      if ("translators".equals(key) && value instanceof Organization) { this.translator((Organization)value); return; }
      if ("translator".equals(key) && value instanceof Person) { this.translator((Person)value); return; }
      if ("translators".equals(key) && value instanceof Person) { this.translator((Person)value); return; }
      if ("sponsor".equals(key) && value instanceof Sponsor) { this.sponsor((Sponsor)value); return; }
      if ("sponsors".equals(key) && value instanceof Sponsor) { this.sponsor((Sponsor)value); return; }
      if ("funder".equals(key) && value instanceof Sponsor) { this.funder((Sponsor)value); return; }
      if ("funders".equals(key) && value instanceof Sponsor) { this.funder((Sponsor)value); return; }
      if ("review".equals(key) && value instanceof Review) { this.review((Review)value); return; }
      if ("reviews".equals(key) && value instanceof Review) { this.review((Review)value); return; }
      if ("typicalAgeRange".equals(key) && value instanceof String) { this.typicalAgeRange((String)value); return; }
      if ("typicalAgeRanges".equals(key) && value instanceof String) { this.typicalAgeRange((String)value); return; }
      if ("maximumAttendeeCapacity".equals(key) && value instanceof Integer) { this.maximumAttendeeCapacity((Integer)value); return; }
      if ("maximumAttendeeCapacitys".equals(key) && value instanceof Integer) { this.maximumAttendeeCapacity((Integer)value); return; }
      if ("endDate".equals(key) && value instanceof java.util.Date) { this.endDate((java.util.Date)value); return; }
      if ("endDates".equals(key) && value instanceof java.util.Date) { this.endDate((java.util.Date)value); return; }
      if ("subEvent".equals(key) && value instanceof Event) { this.subEvent((Event)value); return; }
      if ("subEvents".equals(key) && value instanceof Event) { this.subEvent((Event)value); return; }
      if ("offers".equals(key) && value instanceof Demand) { this.offers((Demand)value); return; }
      if ("offerss".equals(key) && value instanceof Demand) { this.offers((Demand)value); return; }
      if ("offers".equals(key) && value instanceof Offer) { this.offers((Offer)value); return; }
      if ("offerss".equals(key) && value instanceof Offer) { this.offers((Offer)value); return; }
      if ("about".equals(key) && value instanceof Thing) { this.about((Thing)value); return; }
      if ("abouts".equals(key) && value instanceof Thing) { this.about((Thing)value); return; }
      if ("superEvent".equals(key) && value instanceof Event) { this.superEvent((Event)value); return; }
      if ("superEvents".equals(key) && value instanceof Event) { this.superEvent((Event)value); return; }
      if ("recordedIn".equals(key) && value instanceof CreativeWork) { this.recordedIn((CreativeWork)value); return; }
      if ("recordedIns".equals(key) && value instanceof CreativeWork) { this.recordedIn((CreativeWork)value); return; }
      super.fromMap(key, value);
    }
  }
  
}
