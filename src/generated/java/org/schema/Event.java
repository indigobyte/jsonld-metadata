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
 * An event happening at a certain time and location, such as a concert, lecture, or festival. Ticketing information may be added via the [[offers]] property. Repeated events may be structured as separate Event objects.Equivalent class: http://purl.org/dc/dcmitype/Event
 */
public class Event extends Thing {
  /**
   * An organizer of an Event.
   */
  @JsonIgnore public Organization getOrganizerOrganization() {
    return (Organization) getValue("organizer");
  }
  /**
   * An organizer of an Event.
   */
  @JsonIgnore public java.util.Collection<Organization> getOrganizerOrganizations() {
    final Object current = myData.get("organizer");
    if (current == null) return Collections.emptyList();
    if (current instanceof java.util.Collection) {
      return (java.util.Collection<Organization>) current;
    }
    return Arrays.asList((Organization) current);
  }
  /**
   * An organizer of an Event.
   */
  @JsonIgnore public Person getOrganizerPerson() {
    return (Person) getValue("organizer");
  }
  /**
   * An organizer of an Event.
   */
  @JsonIgnore public java.util.Collection<Person> getOrganizerPersons() {
    final Object current = myData.get("organizer");
    if (current == null) return Collections.emptyList();
    if (current instanceof java.util.Collection) {
      return (java.util.Collection<Person>) current;
    }
    return Arrays.asList((Person) current);
  }
  /**
   * The language of the content or performance or used in an action. Please use one of the language codes from the [IETF BCP 47 standard](http://tools.ietf.org/html/bcp47). See also [[availableLanguage]].
   */
  @JsonIgnore public Language getInLanguageLanguage() {
    return (Language) getValue("inLanguage");
  }
  /**
   * The language of the content or performance or used in an action. Please use one of the language codes from the [IETF BCP 47 standard](http://tools.ietf.org/html/bcp47). See also [[availableLanguage]].
   */
  @JsonIgnore public java.util.Collection<Language> getInLanguageLanguages() {
    final Object current = myData.get("inLanguage");
    if (current == null) return Collections.emptyList();
    if (current instanceof java.util.Collection) {
      return (java.util.Collection<Language>) current;
    }
    return Arrays.asList((Language) current);
  }
  /**
   * The language of the content or performance or used in an action. Please use one of the language codes from the [IETF BCP 47 standard](http://tools.ietf.org/html/bcp47). See also [[availableLanguage]].
   */
  @JsonIgnore public String getInLanguageString() {
    return (String) getValue("inLanguage");
  }
  /**
   * The language of the content or performance or used in an action. Please use one of the language codes from the [IETF BCP 47 standard](http://tools.ietf.org/html/bcp47). See also [[availableLanguage]].
   */
  @JsonIgnore public java.util.Collection<String> getInLanguageStrings() {
    final Object current = myData.get("inLanguage");
    if (current == null) return Collections.emptyList();
    if (current instanceof java.util.Collection) {
      return (java.util.Collection<String>) current;
    }
    return Arrays.asList((String) current);
  }
  /**
   * A work performed in some event, for example a play performed in a TheaterEvent.
   */
  @JsonIgnore public WorkFeatured getWorkPerformed() {
    return (WorkFeatured) getValue("workPerformed");
  }
  /**
   * A work performed in some event, for example a play performed in a TheaterEvent.
   */
  @JsonIgnore public java.util.Collection<WorkFeatured> getWorkPerformeds() {
    final Object current = myData.get("workPerformed");
    if (current == null) return Collections.emptyList();
    if (current instanceof java.util.Collection) {
      return (java.util.Collection<WorkFeatured>) current;
    }
    return Arrays.asList((WorkFeatured) current);
  }
  /**
   * The person or organization who wrote a composition, or who is the composer of a work performed at some event.
   */
  @JsonIgnore public Organization getComposerOrganization() {
    return (Organization) getValue("composer");
  }
  /**
   * The person or organization who wrote a composition, or who is the composer of a work performed at some event.
   */
  @JsonIgnore public java.util.Collection<Organization> getComposerOrganizations() {
    final Object current = myData.get("composer");
    if (current == null) return Collections.emptyList();
    if (current instanceof java.util.Collection) {
      return (java.util.Collection<Organization>) current;
    }
    return Arrays.asList((Organization) current);
  }
  /**
   * The person or organization who wrote a composition, or who is the composer of a work performed at some event.
   */
  @JsonIgnore public Person getComposerPerson() {
    return (Person) getValue("composer");
  }
  /**
   * The person or organization who wrote a composition, or who is the composer of a work performed at some event.
   */
  @JsonIgnore public java.util.Collection<Person> getComposerPersons() {
    final Object current = myData.get("composer");
    if (current == null) return Collections.emptyList();
    if (current instanceof java.util.Collection) {
      return (java.util.Collection<Person>) current;
    }
    return Arrays.asList((Person) current);
  }
  /**
   * A person or organization attending the event.
   */
  @JsonIgnore public Organization getAttendeeOrganization() {
    return (Organization) getValue("attendee");
  }
  /**
   * A person or organization attending the event.
   */
  @JsonIgnore public java.util.Collection<Organization> getAttendeeOrganizations() {
    final Object current = myData.get("attendee");
    if (current == null) return Collections.emptyList();
    if (current instanceof java.util.Collection) {
      return (java.util.Collection<Organization>) current;
    }
    return Arrays.asList((Organization) current);
  }
  /**
   * A person or organization attending the event.
   */
  @JsonIgnore public Person getAttendeePerson() {
    return (Person) getValue("attendee");
  }
  /**
   * A person or organization attending the event.
   */
  @JsonIgnore public java.util.Collection<Person> getAttendeePersons() {
    final Object current = myData.get("attendee");
    if (current == null) return Collections.emptyList();
    if (current instanceof java.util.Collection) {
      return (java.util.Collection<Person>) current;
    }
    return Arrays.asList((Person) current);
  }
  /**
   * An actor, e.g. in tv, radio, movie, video games etc., or in an event. Actors can be associated with individual items or with a series, episode, clip.
   */
  @JsonIgnore public Actor getActor() {
    return (Actor) getValue("actor");
  }
  /**
   * An actor, e.g. in tv, radio, movie, video games etc., or in an event. Actors can be associated with individual items or with a series, episode, clip.
   */
  @JsonIgnore public java.util.Collection<Actor> getActors() {
    final Object current = myData.get("actor");
    if (current == null) return Collections.emptyList();
    if (current instanceof java.util.Collection) {
      return (java.util.Collection<Actor>) current;
    }
    return Arrays.asList((Actor) current);
  }
  /**
   * The overall rating, based on a collection of reviews or ratings, of the item.
   */
  @JsonIgnore public AggregateRating getAggregateRating() {
    return (AggregateRating) getValue("aggregateRating");
  }
  /**
   * The overall rating, based on a collection of reviews or ratings, of the item.
   */
  @JsonIgnore public java.util.Collection<AggregateRating> getAggregateRatings() {
    final Object current = myData.get("aggregateRating");
    if (current == null) return Collections.emptyList();
    if (current instanceof java.util.Collection) {
      return (java.util.Collection<AggregateRating>) current;
    }
    return Arrays.asList((AggregateRating) current);
  }
  /**
   * A performer at the event&amp;#x2014;for example, a presenter, musician, musical group or actor.
   */
  @JsonIgnore public Organization getPerformerOrganization() {
    return (Organization) getValue("performer");
  }
  /**
   * A performer at the event&amp;#x2014;for example, a presenter, musician, musical group or actor.
   */
  @JsonIgnore public java.util.Collection<Organization> getPerformerOrganizations() {
    final Object current = myData.get("performer");
    if (current == null) return Collections.emptyList();
    if (current instanceof java.util.Collection) {
      return (java.util.Collection<Organization>) current;
    }
    return Arrays.asList((Organization) current);
  }
  /**
   * A performer at the event&amp;#x2014;for example, a presenter, musician, musical group or actor.
   */
  @JsonIgnore public Person getPerformerPerson() {
    return (Person) getValue("performer");
  }
  /**
   * A performer at the event&amp;#x2014;for example, a presenter, musician, musical group or actor.
   */
  @JsonIgnore public java.util.Collection<Person> getPerformerPersons() {
    final Object current = myData.get("performer");
    if (current == null) return Collections.emptyList();
    if (current instanceof java.util.Collection) {
      return (java.util.Collection<Person>) current;
    }
    return Arrays.asList((Person) current);
  }
  /**
   * An eventStatus of an event represents its status; particularly useful when an event is cancelled or rescheduled.
   */
  @JsonIgnore public EventStatusType getEventStatus() {
    return (EventStatusType) getValue("eventStatus");
  }
  /**
   * An eventStatus of an event represents its status; particularly useful when an event is cancelled or rescheduled.
   */
  @JsonIgnore public java.util.Collection<EventStatusType> getEventStatuss() {
    final Object current = myData.get("eventStatus");
    if (current == null) return Collections.emptyList();
    if (current instanceof java.util.Collection) {
      return (java.util.Collection<EventStatusType>) current;
    }
    return Arrays.asList((EventStatusType) current);
  }
  /**
   * The duration of the item (movie, audio recording, event, etc.) in [ISO 8601 date format](http://en.wikipedia.org/wiki/ISO_8601).
   */
  @JsonIgnore public Duration getDuration() {
    return (Duration) getValue("duration");
  }
  /**
   * The duration of the item (movie, audio recording, event, etc.) in [ISO 8601 date format](http://en.wikipedia.org/wiki/ISO_8601).
   */
  @JsonIgnore public java.util.Collection<Duration> getDurations() {
    final Object current = myData.get("duration");
    if (current == null) return Collections.emptyList();
    if (current instanceof java.util.Collection) {
      return (java.util.Collection<Duration>) current;
    }
    return Arrays.asList((Duration) current);
  }
  /**
   * The maximum physical attendee capacity of an [[Event]] whose [[eventAttendanceMode]] is [[OnlineEventAttendanceMode]] (or the online aspects, in the case of a [[MixedEventAttendanceMode]]). 
   */
  @JsonIgnore public Integer getMaximumVirtualAttendeeCapacity() {
    return (Integer) getValue("maximumVirtualAttendeeCapacity");
  }
  /**
   * The maximum physical attendee capacity of an [[Event]] whose [[eventAttendanceMode]] is [[OnlineEventAttendanceMode]] (or the online aspects, in the case of a [[MixedEventAttendanceMode]]). 
   */
  @JsonIgnore public java.util.Collection<Integer> getMaximumVirtualAttendeeCapacitys() {
    final Object current = myData.get("maximumVirtualAttendeeCapacity");
    if (current == null) return Collections.emptyList();
    if (current instanceof java.util.Collection) {
      return (java.util.Collection<Integer>) current;
    }
    return Arrays.asList((Integer) current);
  }
  /**
   * The eventAttendanceMode of an event indicates whether it occurs online, offline, or a mix.
   */
  @JsonIgnore public EventAttendanceModeEnumeration getEventAttendanceMode() {
    return (EventAttendanceModeEnumeration) getValue("eventAttendanceMode");
  }
  /**
   * The eventAttendanceMode of an event indicates whether it occurs online, offline, or a mix.
   */
  @JsonIgnore public java.util.Collection<EventAttendanceModeEnumeration> getEventAttendanceModes() {
    final Object current = myData.get("eventAttendanceMode");
    if (current == null) return Collections.emptyList();
    if (current instanceof java.util.Collection) {
      return (java.util.Collection<EventAttendanceModeEnumeration>) current;
    }
    return Arrays.asList((EventAttendanceModeEnumeration) current);
  }
  /**
   * The start date and time of the item (in [ISO 8601 date format](http://en.wikipedia.org/wiki/ISO_8601)).
   */
  @JsonIgnore public java.util.Date getStartDate() {
    return (java.util.Date) getValue("startDate");
  }
  /**
   * The start date and time of the item (in [ISO 8601 date format](http://en.wikipedia.org/wiki/ISO_8601)).
   */
  @JsonIgnore public java.util.Collection<java.util.Date> getStartDates() {
    final Object current = myData.get("startDate");
    if (current == null) return Collections.emptyList();
    if (current instanceof java.util.Collection) {
      return (java.util.Collection<java.util.Date>) current;
    }
    return Arrays.asList((java.util.Date) current);
  }
  /**
   * A flag to signal that the item, event, or place is accessible for free.
   */
  @JsonIgnore public Boolean getIsAccessibleForFree() {
    return (Boolean) getValue("isAccessibleForFree");
  }
  /**
   * A flag to signal that the item, event, or place is accessible for free.
   */
  @JsonIgnore public java.util.Collection<Boolean> getIsAccessibleForFrees() {
    final Object current = myData.get("isAccessibleForFree");
    if (current == null) return Collections.emptyList();
    if (current instanceof java.util.Collection) {
      return (java.util.Collection<Boolean>) current;
    }
    return Arrays.asList((Boolean) current);
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
  @JsonIgnore public java.util.Collection<Person> getDirectors() {
    final Object current = myData.get("director");
    if (current == null) return Collections.emptyList();
    if (current instanceof java.util.Collection) {
      return (java.util.Collection<Person>) current;
    }
    return Arrays.asList((Person) current);
  }
  /**
   * Used in conjunction with eventStatus for rescheduled or cancelled events. This property contains the previously scheduled start date. For rescheduled events, the startDate property should be used for the newly scheduled start date. In the (rare) case of an event that has been postponed and rescheduled multiple times, this field may be repeated.
   */
  @JsonIgnore public java.util.Date getPreviousStartDate() {
    return (java.util.Date) getValue("previousStartDate");
  }
  /**
   * Used in conjunction with eventStatus for rescheduled or cancelled events. This property contains the previously scheduled start date. For rescheduled events, the startDate property should be used for the newly scheduled start date. In the (rare) case of an event that has been postponed and rescheduled multiple times, this field may be repeated.
   */
  @JsonIgnore public java.util.Collection<java.util.Date> getPreviousStartDates() {
    final Object current = myData.get("previousStartDate");
    if (current == null) return Collections.emptyList();
    if (current instanceof java.util.Collection) {
      return (java.util.Collection<java.util.Date>) current;
    }
    return Arrays.asList((java.util.Date) current);
  }
  /**
   * The number of attendee places for an event that remain unallocated.
   */
  @JsonIgnore public Integer getRemainingAttendeeCapacity() {
    return (Integer) getValue("remainingAttendeeCapacity");
  }
  /**
   * The number of attendee places for an event that remain unallocated.
   */
  @JsonIgnore public java.util.Collection<Integer> getRemainingAttendeeCapacitys() {
    final Object current = myData.get("remainingAttendeeCapacity");
    if (current == null) return Collections.emptyList();
    if (current instanceof java.util.Collection) {
      return (java.util.Collection<Integer>) current;
    }
    return Arrays.asList((Integer) current);
  }
  /**
   * A secondary contributor to the CreativeWork or Event.
   */
  @JsonIgnore public Organization getContributorOrganization() {
    return (Organization) getValue("contributor");
  }
  /**
   * A secondary contributor to the CreativeWork or Event.
   */
  @JsonIgnore public java.util.Collection<Organization> getContributorOrganizations() {
    final Object current = myData.get("contributor");
    if (current == null) return Collections.emptyList();
    if (current instanceof java.util.Collection) {
      return (java.util.Collection<Organization>) current;
    }
    return Arrays.asList((Organization) current);
  }
  /**
   * A secondary contributor to the CreativeWork or Event.
   */
  @JsonIgnore public Person getContributorPerson() {
    return (Person) getValue("contributor");
  }
  /**
   * A secondary contributor to the CreativeWork or Event.
   */
  @JsonIgnore public java.util.Collection<Person> getContributorPersons() {
    final Object current = myData.get("contributor");
    if (current == null) return Collections.emptyList();
    if (current instanceof java.util.Collection) {
      return (java.util.Collection<Person>) current;
    }
    return Arrays.asList((Person) current);
  }
  /**
   * An intended audience, i.e. a group for whom something was created.
   */
  @JsonIgnore public Audience getAudience() {
    return (Audience) getValue("audience");
  }
  /**
   * An intended audience, i.e. a group for whom something was created.
   */
  @JsonIgnore public java.util.Collection<Audience> getAudiences() {
    final Object current = myData.get("audience");
    if (current == null) return Collections.emptyList();
    if (current instanceof java.util.Collection) {
      return (java.util.Collection<Audience>) current;
    }
    return Arrays.asList((Audience) current);
  }
  /**
   * The maximum physical attendee capacity of an [[Event]] whose [[eventAttendanceMode]] is [[OfflineEventAttendanceMode]] (or the offline aspects, in the case of a [[MixedEventAttendanceMode]]). 
   */
  @JsonIgnore public Integer getMaximumPhysicalAttendeeCapacity() {
    return (Integer) getValue("maximumPhysicalAttendeeCapacity");
  }
  /**
   * The maximum physical attendee capacity of an [[Event]] whose [[eventAttendanceMode]] is [[OfflineEventAttendanceMode]] (or the offline aspects, in the case of a [[MixedEventAttendanceMode]]). 
   */
  @JsonIgnore public java.util.Collection<Integer> getMaximumPhysicalAttendeeCapacitys() {
    final Object current = myData.get("maximumPhysicalAttendeeCapacity");
    if (current == null) return Collections.emptyList();
    if (current instanceof java.util.Collection) {
      return (java.util.Collection<Integer>) current;
    }
    return Arrays.asList((Integer) current);
  }
  /**
   * Associates an [[Event]] with a [[Schedule]]. There are circumstances where it is preferable to share a schedule for a series of
   *       repeating events rather than data on the individual events themselves. For example, a website or application might prefer to publish a schedule for a weekly
   *       gym class rather than provide data on every event. A schedule could be processed by applications to add forthcoming events to a calendar. An [[Event]] that
   *       is associated with a [[Schedule]] using this property should not have [[startDate]] or [[endDate]] properties. These are instead defined within the associated
   *       [[Schedule]], this avoids any ambiguity for clients using the data. The property might have repeated values to specify different schedules, e.g. for different months
   *       or seasons.
   */
  @JsonIgnore public Schedule getEventSchedule() {
    return (Schedule) getValue("eventSchedule");
  }
  /**
   * Associates an [[Event]] with a [[Schedule]]. There are circumstances where it is preferable to share a schedule for a series of
   *       repeating events rather than data on the individual events themselves. For example, a website or application might prefer to publish a schedule for a weekly
   *       gym class rather than provide data on every event. A schedule could be processed by applications to add forthcoming events to a calendar. An [[Event]] that
   *       is associated with a [[Schedule]] using this property should not have [[startDate]] or [[endDate]] properties. These are instead defined within the associated
   *       [[Schedule]], this avoids any ambiguity for clients using the data. The property might have repeated values to specify different schedules, e.g. for different months
   *       or seasons.
   */
  @JsonIgnore public java.util.Collection<Schedule> getEventSchedules() {
    final Object current = myData.get("eventSchedule");
    if (current == null) return Collections.emptyList();
    if (current instanceof java.util.Collection) {
      return (java.util.Collection<Schedule>) current;
    }
    return Arrays.asList((Schedule) current);
  }
  /**
   * The time admission will commence.
   */
  @JsonIgnore public java.util.Date getDoorTime() {
    return (java.util.Date) getValue("doorTime");
  }
  /**
   * The time admission will commence.
   */
  @JsonIgnore public java.util.Collection<java.util.Date> getDoorTimes() {
    final Object current = myData.get("doorTime");
    if (current == null) return Collections.emptyList();
    if (current instanceof java.util.Collection) {
      return (java.util.Collection<java.util.Date>) current;
    }
    return Arrays.asList((java.util.Date) current);
  }
  /**
   * Organization or person who adapts a creative work to different languages, regional differences and technical requirements of a target market, or that translates during some event.
   */
  @JsonIgnore public Organization getTranslatorOrganization() {
    return (Organization) getValue("translator");
  }
  /**
   * Organization or person who adapts a creative work to different languages, regional differences and technical requirements of a target market, or that translates during some event.
   */
  @JsonIgnore public java.util.Collection<Organization> getTranslatorOrganizations() {
    final Object current = myData.get("translator");
    if (current == null) return Collections.emptyList();
    if (current instanceof java.util.Collection) {
      return (java.util.Collection<Organization>) current;
    }
    return Arrays.asList((Organization) current);
  }
  /**
   * Organization or person who adapts a creative work to different languages, regional differences and technical requirements of a target market, or that translates during some event.
   */
  @JsonIgnore public Person getTranslatorPerson() {
    return (Person) getValue("translator");
  }
  /**
   * Organization or person who adapts a creative work to different languages, regional differences and technical requirements of a target market, or that translates during some event.
   */
  @JsonIgnore public java.util.Collection<Person> getTranslatorPersons() {
    final Object current = myData.get("translator");
    if (current == null) return Collections.emptyList();
    if (current instanceof java.util.Collection) {
      return (java.util.Collection<Person>) current;
    }
    return Arrays.asList((Person) current);
  }
  /**
   * A person or organization that supports a thing through a pledge, promise, or financial contribution. e.g. a sponsor of a Medical Study or a corporate sponsor of an event.
   */
  @JsonIgnore public Sponsor getSponsor() {
    return (Sponsor) getValue("sponsor");
  }
  /**
   * A person or organization that supports a thing through a pledge, promise, or financial contribution. e.g. a sponsor of a Medical Study or a corporate sponsor of an event.
   */
  @JsonIgnore public java.util.Collection<Sponsor> getSponsors() {
    final Object current = myData.get("sponsor");
    if (current == null) return Collections.emptyList();
    if (current instanceof java.util.Collection) {
      return (java.util.Collection<Sponsor>) current;
    }
    return Arrays.asList((Sponsor) current);
  }
  /**
   * A person or organization that supports (sponsors) something through some kind of financial contribution.
   */
  @JsonIgnore public Sponsor getFunder() {
    return (Sponsor) getValue("funder");
  }
  /**
   * A person or organization that supports (sponsors) something through some kind of financial contribution.
   */
  @JsonIgnore public java.util.Collection<Sponsor> getFunders() {
    final Object current = myData.get("funder");
    if (current == null) return Collections.emptyList();
    if (current instanceof java.util.Collection) {
      return (java.util.Collection<Sponsor>) current;
    }
    return Arrays.asList((Sponsor) current);
  }
  /**
   * A review of the item.
   */
  @JsonIgnore public Review getReview() {
    return (Review) getValue("review");
  }
  /**
   * A review of the item.
   */
  @JsonIgnore public java.util.Collection<Review> getReviews() {
    final Object current = myData.get("review");
    if (current == null) return Collections.emptyList();
    if (current instanceof java.util.Collection) {
      return (java.util.Collection<Review>) current;
    }
    return Arrays.asList((Review) current);
  }
  /**
   * The typical expected age range, e.g. '7-9', '11-'.
   */
  @JsonIgnore public String getTypicalAgeRange() {
    return (String) getValue("typicalAgeRange");
  }
  /**
   * The typical expected age range, e.g. '7-9', '11-'.
   */
  @JsonIgnore public java.util.Collection<String> getTypicalAgeRanges() {
    final Object current = myData.get("typicalAgeRange");
    if (current == null) return Collections.emptyList();
    if (current instanceof java.util.Collection) {
      return (java.util.Collection<String>) current;
    }
    return Arrays.asList((String) current);
  }
  /**
   * The total number of individuals that may attend an event or venue.
   */
  @JsonIgnore public Integer getMaximumAttendeeCapacity() {
    return (Integer) getValue("maximumAttendeeCapacity");
  }
  /**
   * The total number of individuals that may attend an event or venue.
   */
  @JsonIgnore public java.util.Collection<Integer> getMaximumAttendeeCapacitys() {
    final Object current = myData.get("maximumAttendeeCapacity");
    if (current == null) return Collections.emptyList();
    if (current instanceof java.util.Collection) {
      return (java.util.Collection<Integer>) current;
    }
    return Arrays.asList((Integer) current);
  }
  /**
   * The end date and time of the item (in [ISO 8601 date format](http://en.wikipedia.org/wiki/ISO_8601)).
   */
  @JsonIgnore public java.util.Date getEndDate() {
    return (java.util.Date) getValue("endDate");
  }
  /**
   * The end date and time of the item (in [ISO 8601 date format](http://en.wikipedia.org/wiki/ISO_8601)).
   */
  @JsonIgnore public java.util.Collection<java.util.Date> getEndDates() {
    final Object current = myData.get("endDate");
    if (current == null) return Collections.emptyList();
    if (current instanceof java.util.Collection) {
      return (java.util.Collection<java.util.Date>) current;
    }
    return Arrays.asList((java.util.Date) current);
  }
  /**
   * An Event that is part of this event. For example, a conference event includes many presentations, each of which is a subEvent of the conference.
   */
  @JsonIgnore public Event getSubEvent() {
    return (Event) getValue("subEvent");
  }
  /**
   * An Event that is part of this event. For example, a conference event includes many presentations, each of which is a subEvent of the conference.
   */
  @JsonIgnore public java.util.Collection<Event> getSubEvents() {
    final Object current = myData.get("subEvent");
    if (current == null) return Collections.emptyList();
    if (current instanceof java.util.Collection) {
      return (java.util.Collection<Event>) current;
    }
    return Arrays.asList((Event) current);
  }
  /**
   * An offer to provide this item&amp;#x2014;for example, an offer to sell a product, rent the DVD of a movie, perform a service, or give away tickets to an event. Use [[businessFunction]] to indicate the kind of transaction offered, i.e. sell, lease, etc. This property can also be used to describe a [[Demand]]. While this property is listed as expected on a number of common types, it can be used in others. In that case, using a second type, such as Product or a subtype of Product, can clarify the nature of the offer.
   *       
   */
  @JsonIgnore public Demand getOffersDemand() {
    return (Demand) getValue("offers");
  }
  /**
   * An offer to provide this item&amp;#x2014;for example, an offer to sell a product, rent the DVD of a movie, perform a service, or give away tickets to an event. Use [[businessFunction]] to indicate the kind of transaction offered, i.e. sell, lease, etc. This property can also be used to describe a [[Demand]]. While this property is listed as expected on a number of common types, it can be used in others. In that case, using a second type, such as Product or a subtype of Product, can clarify the nature of the offer.
   *       
   */
  @JsonIgnore public java.util.Collection<Demand> getOffersDemands() {
    final Object current = myData.get("offers");
    if (current == null) return Collections.emptyList();
    if (current instanceof java.util.Collection) {
      return (java.util.Collection<Demand>) current;
    }
    return Arrays.asList((Demand) current);
  }
  /**
   * An offer to provide this item&amp;#x2014;for example, an offer to sell a product, rent the DVD of a movie, perform a service, or give away tickets to an event. Use [[businessFunction]] to indicate the kind of transaction offered, i.e. sell, lease, etc. This property can also be used to describe a [[Demand]]. While this property is listed as expected on a number of common types, it can be used in others. In that case, using a second type, such as Product or a subtype of Product, can clarify the nature of the offer.
   *       
   */
  @JsonIgnore public Offer getOffersOffer() {
    return (Offer) getValue("offers");
  }
  /**
   * An offer to provide this item&amp;#x2014;for example, an offer to sell a product, rent the DVD of a movie, perform a service, or give away tickets to an event. Use [[businessFunction]] to indicate the kind of transaction offered, i.e. sell, lease, etc. This property can also be used to describe a [[Demand]]. While this property is listed as expected on a number of common types, it can be used in others. In that case, using a second type, such as Product or a subtype of Product, can clarify the nature of the offer.
   *       
   */
  @JsonIgnore public java.util.Collection<Offer> getOffersOffers() {
    final Object current = myData.get("offers");
    if (current == null) return Collections.emptyList();
    if (current instanceof java.util.Collection) {
      return (java.util.Collection<Offer>) current;
    }
    return Arrays.asList((Offer) current);
  }
  /**
   * An event that this event is a part of. For example, a collection of individual music performances might each have a music festival as their superEvent.
   */
  @JsonIgnore public Event getSuperEvent() {
    return (Event) getValue("superEvent");
  }
  /**
   * An event that this event is a part of. For example, a collection of individual music performances might each have a music festival as their superEvent.
   */
  @JsonIgnore public java.util.Collection<Event> getSuperEvents() {
    final Object current = myData.get("superEvent");
    if (current == null) return Collections.emptyList();
    if (current instanceof java.util.Collection) {
      return (java.util.Collection<Event>) current;
    }
    return Arrays.asList((Event) current);
  }
  /**
   * The CreativeWork that captured all or part of this Event.
   */
  @JsonIgnore public CreativeWork getRecordedIn() {
    return (CreativeWork) getValue("recordedIn");
  }
  /**
   * The CreativeWork that captured all or part of this Event.
   */
  @JsonIgnore public java.util.Collection<CreativeWork> getRecordedIns() {
    final Object current = myData.get("recordedIn");
    if (current == null) return Collections.emptyList();
    if (current instanceof java.util.Collection) {
      return (java.util.Collection<CreativeWork>) current;
    }
    return Arrays.asList((CreativeWork) current);
  }
  protected Event(java.util.Map<String,Object> data) {
    super(data);
  }
  
  /**
   * Builder for {@link Event}
   */
  public static class Builder extends Thing.Builder {
    public Builder(@NotNull HashMap<String,Object> data) {
      super(data);
    }
    @NotNull public Event build() {
      return new Event(myData);
    }
    /**
     * An organizer of an Event.
     */
    @NotNull public Builder organizer(@NotNull Organization organization) {
      putValue("organizer", organization);
      return this;
    }
    /**
     * An organizer of an Event.
     */
    @NotNull public Builder organizer(@NotNull Organization.Builder organization) {
      putValue("organizer", organization.build());
      return this;
    }
    /**
     * An organizer of an Event.
     */
    @NotNull public Builder organizer(@NotNull Person person) {
      putValue("organizer", person);
      return this;
    }
    /**
     * An organizer of an Event.
     */
    @NotNull public Builder organizer(@NotNull Person.Builder person) {
      putValue("organizer", person.build());
      return this;
    }
    /**
     * The language of the content or performance or used in an action. Please use one of the language codes from the [IETF BCP 47 standard](http://tools.ietf.org/html/bcp47). See also [[availableLanguage]].
     */
    @NotNull public Builder inLanguage(@NotNull Language language) {
      putValue("inLanguage", language);
      return this;
    }
    /**
     * The language of the content or performance or used in an action. Please use one of the language codes from the [IETF BCP 47 standard](http://tools.ietf.org/html/bcp47). See also [[availableLanguage]].
     */
    @NotNull public Builder inLanguage(@NotNull Language.Builder language) {
      putValue("inLanguage", language.build());
      return this;
    }
    /**
     * The language of the content or performance or used in an action. Please use one of the language codes from the [IETF BCP 47 standard](http://tools.ietf.org/html/bcp47). See also [[availableLanguage]].
     */
    @NotNull public Builder inLanguage(@NotNull String inLanguage) {
      putValue("inLanguage", inLanguage);
      return this;
    }
    /**
     * A work performed in some event, for example a play performed in a TheaterEvent.
     */
    @NotNull public Builder workPerformed(@NotNull WorkFeatured workFeatured) {
      putValue("workPerformed", workFeatured);
      return this;
    }
    /**
     * The person or organization who wrote a composition, or who is the composer of a work performed at some event.
     */
    @NotNull public Builder composer(@NotNull Organization organization) {
      putValue("composer", organization);
      return this;
    }
    /**
     * The person or organization who wrote a composition, or who is the composer of a work performed at some event.
     */
    @NotNull public Builder composer(@NotNull Organization.Builder organization) {
      putValue("composer", organization.build());
      return this;
    }
    /**
     * The person or organization who wrote a composition, or who is the composer of a work performed at some event.
     */
    @NotNull public Builder composer(@NotNull Person person) {
      putValue("composer", person);
      return this;
    }
    /**
     * The person or organization who wrote a composition, or who is the composer of a work performed at some event.
     */
    @NotNull public Builder composer(@NotNull Person.Builder person) {
      putValue("composer", person.build());
      return this;
    }
    /**
     * A person or organization attending the event.
     */
    @NotNull public Builder attendee(@NotNull Organization organization) {
      putValue("attendee", organization);
      return this;
    }
    /**
     * A person or organization attending the event.
     */
    @NotNull public Builder attendee(@NotNull Organization.Builder organization) {
      putValue("attendee", organization.build());
      return this;
    }
    /**
     * A person or organization attending the event.
     */
    @NotNull public Builder attendee(@NotNull Person person) {
      putValue("attendee", person);
      return this;
    }
    /**
     * A person or organization attending the event.
     */
    @NotNull public Builder attendee(@NotNull Person.Builder person) {
      putValue("attendee", person.build());
      return this;
    }
    /**
     * An actor, e.g. in tv, radio, movie, video games etc., or in an event. Actors can be associated with individual items or with a series, episode, clip.
     */
    @NotNull public Builder actor(@NotNull Actor actor) {
      putValue("actor", actor);
      return this;
    }
    /**
     * The overall rating, based on a collection of reviews or ratings, of the item.
     */
    @NotNull public Builder aggregateRating(@NotNull AggregateRating aggregateRating) {
      putValue("aggregateRating", aggregateRating);
      return this;
    }
    /**
     * The overall rating, based on a collection of reviews or ratings, of the item.
     */
    @NotNull public Builder aggregateRating(@NotNull AggregateRating.Builder aggregateRating) {
      putValue("aggregateRating", aggregateRating.build());
      return this;
    }
    /**
     * A performer at the event&amp;#x2014;for example, a presenter, musician, musical group or actor.
     */
    @NotNull public Builder performer(@NotNull Organization organization) {
      putValue("performer", organization);
      return this;
    }
    /**
     * A performer at the event&amp;#x2014;for example, a presenter, musician, musical group or actor.
     */
    @NotNull public Builder performer(@NotNull Organization.Builder organization) {
      putValue("performer", organization.build());
      return this;
    }
    /**
     * A performer at the event&amp;#x2014;for example, a presenter, musician, musical group or actor.
     */
    @NotNull public Builder performer(@NotNull Person person) {
      putValue("performer", person);
      return this;
    }
    /**
     * A performer at the event&amp;#x2014;for example, a presenter, musician, musical group or actor.
     */
    @NotNull public Builder performer(@NotNull Person.Builder person) {
      putValue("performer", person.build());
      return this;
    }
    /**
     * An eventStatus of an event represents its status; particularly useful when an event is cancelled or rescheduled.
     */
    @NotNull public Builder eventStatus(@NotNull EventStatusType eventStatusType) {
      putValue("eventStatus", eventStatusType);
      return this;
    }
    /**
     * The duration of the item (movie, audio recording, event, etc.) in [ISO 8601 date format](http://en.wikipedia.org/wiki/ISO_8601).
     */
    @NotNull public Builder duration(@NotNull Duration duration) {
      putValue("duration", duration);
      return this;
    }
    /**
     * The maximum physical attendee capacity of an [[Event]] whose [[eventAttendanceMode]] is [[OnlineEventAttendanceMode]] (or the online aspects, in the case of a [[MixedEventAttendanceMode]]). 
     */
    @NotNull public Builder maximumVirtualAttendeeCapacity(@NotNull Integer integer) {
      putValue("maximumVirtualAttendeeCapacity", integer);
      return this;
    }
    /**
     * The eventAttendanceMode of an event indicates whether it occurs online, offline, or a mix.
     */
    @NotNull public Builder eventAttendanceMode(@NotNull EventAttendanceModeEnumeration eventAttendanceModeEnumeration) {
      putValue("eventAttendanceMode", eventAttendanceModeEnumeration);
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
     * A flag to signal that the item, event, or place is accessible for free.
     */
    @NotNull public Builder isAccessibleForFree(@NotNull Boolean isAccessibleForFree) {
      putValue("isAccessibleForFree", isAccessibleForFree);
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
     * Used in conjunction with eventStatus for rescheduled or cancelled events. This property contains the previously scheduled start date. For rescheduled events, the startDate property should be used for the newly scheduled start date. In the (rare) case of an event that has been postponed and rescheduled multiple times, this field may be repeated.
     */
    @NotNull public Builder previousStartDate(@NotNull java.util.Date date) {
      putValue("previousStartDate", date);
      return this;
    }
    /**
     * The number of attendee places for an event that remain unallocated.
     */
    @NotNull public Builder remainingAttendeeCapacity(@NotNull Integer integer) {
      putValue("remainingAttendeeCapacity", integer);
      return this;
    }
    /**
     * A secondary contributor to the CreativeWork or Event.
     */
    @NotNull public Builder contributor(@NotNull Organization organization) {
      putValue("contributor", organization);
      return this;
    }
    /**
     * A secondary contributor to the CreativeWork or Event.
     */
    @NotNull public Builder contributor(@NotNull Organization.Builder organization) {
      putValue("contributor", organization.build());
      return this;
    }
    /**
     * A secondary contributor to the CreativeWork or Event.
     */
    @NotNull public Builder contributor(@NotNull Person person) {
      putValue("contributor", person);
      return this;
    }
    /**
     * A secondary contributor to the CreativeWork or Event.
     */
    @NotNull public Builder contributor(@NotNull Person.Builder person) {
      putValue("contributor", person.build());
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
     * The maximum physical attendee capacity of an [[Event]] whose [[eventAttendanceMode]] is [[OfflineEventAttendanceMode]] (or the offline aspects, in the case of a [[MixedEventAttendanceMode]]). 
     */
    @NotNull public Builder maximumPhysicalAttendeeCapacity(@NotNull Integer integer) {
      putValue("maximumPhysicalAttendeeCapacity", integer);
      return this;
    }
    /**
     * Associates an [[Event]] with a [[Schedule]]. There are circumstances where it is preferable to share a schedule for a series of
     *       repeating events rather than data on the individual events themselves. For example, a website or application might prefer to publish a schedule for a weekly
     *       gym class rather than provide data on every event. A schedule could be processed by applications to add forthcoming events to a calendar. An [[Event]] that
     *       is associated with a [[Schedule]] using this property should not have [[startDate]] or [[endDate]] properties. These are instead defined within the associated
     *       [[Schedule]], this avoids any ambiguity for clients using the data. The property might have repeated values to specify different schedules, e.g. for different months
     *       or seasons.
     */
    @NotNull public Builder eventSchedule(@NotNull Schedule schedule) {
      putValue("eventSchedule", schedule);
      return this;
    }
    /**
     * Associates an [[Event]] with a [[Schedule]]. There are circumstances where it is preferable to share a schedule for a series of
     *       repeating events rather than data on the individual events themselves. For example, a website or application might prefer to publish a schedule for a weekly
     *       gym class rather than provide data on every event. A schedule could be processed by applications to add forthcoming events to a calendar. An [[Event]] that
     *       is associated with a [[Schedule]] using this property should not have [[startDate]] or [[endDate]] properties. These are instead defined within the associated
     *       [[Schedule]], this avoids any ambiguity for clients using the data. The property might have repeated values to specify different schedules, e.g. for different months
     *       or seasons.
     */
    @NotNull public Builder eventSchedule(@NotNull Schedule.Builder schedule) {
      putValue("eventSchedule", schedule.build());
      return this;
    }
    /**
     * The time admission will commence.
     */
    @NotNull public Builder doorTime(@NotNull java.util.Date date) {
      putValue("doorTime", date);
      return this;
    }
    /**
     * Organization or person who adapts a creative work to different languages, regional differences and technical requirements of a target market, or that translates during some event.
     */
    @NotNull public Builder translator(@NotNull Organization organization) {
      putValue("translator", organization);
      return this;
    }
    /**
     * Organization or person who adapts a creative work to different languages, regional differences and technical requirements of a target market, or that translates during some event.
     */
    @NotNull public Builder translator(@NotNull Organization.Builder organization) {
      putValue("translator", organization.build());
      return this;
    }
    /**
     * Organization or person who adapts a creative work to different languages, regional differences and technical requirements of a target market, or that translates during some event.
     */
    @NotNull public Builder translator(@NotNull Person person) {
      putValue("translator", person);
      return this;
    }
    /**
     * Organization or person who adapts a creative work to different languages, regional differences and technical requirements of a target market, or that translates during some event.
     */
    @NotNull public Builder translator(@NotNull Person.Builder person) {
      putValue("translator", person.build());
      return this;
    }
    /**
     * A person or organization that supports a thing through a pledge, promise, or financial contribution. e.g. a sponsor of a Medical Study or a corporate sponsor of an event.
     */
    @NotNull public Builder sponsor(@NotNull Sponsor sponsor) {
      putValue("sponsor", sponsor);
      return this;
    }
    /**
     * A person or organization that supports (sponsors) something through some kind of financial contribution.
     */
    @NotNull public Builder funder(@NotNull Sponsor sponsor) {
      putValue("funder", sponsor);
      return this;
    }
    /**
     * A review of the item.
     */
    @NotNull public Builder review(@NotNull Review review) {
      putValue("review", review);
      return this;
    }
    /**
     * A review of the item.
     */
    @NotNull public Builder review(@NotNull Review.Builder review) {
      putValue("review", review.build());
      return this;
    }
    /**
     * The typical expected age range, e.g. '7-9', '11-'.
     */
    @NotNull public Builder typicalAgeRange(@NotNull String typicalAgeRange) {
      putValue("typicalAgeRange", typicalAgeRange);
      return this;
    }
    /**
     * The total number of individuals that may attend an event or venue.
     */
    @NotNull public Builder maximumAttendeeCapacity(@NotNull Integer integer) {
      putValue("maximumAttendeeCapacity", integer);
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
     * An Event that is part of this event. For example, a conference event includes many presentations, each of which is a subEvent of the conference.
     */
    @NotNull public Builder subEvent(@NotNull Event event) {
      putValue("subEvent", event);
      return this;
    }
    /**
     * An Event that is part of this event. For example, a conference event includes many presentations, each of which is a subEvent of the conference.
     */
    @NotNull public Builder subEvent(@NotNull Event.Builder event) {
      putValue("subEvent", event.build());
      return this;
    }
    /**
     * An offer to provide this item&amp;#x2014;for example, an offer to sell a product, rent the DVD of a movie, perform a service, or give away tickets to an event. Use [[businessFunction]] to indicate the kind of transaction offered, i.e. sell, lease, etc. This property can also be used to describe a [[Demand]]. While this property is listed as expected on a number of common types, it can be used in others. In that case, using a second type, such as Product or a subtype of Product, can clarify the nature of the offer.
     *       
     */
    @NotNull public Builder offers(@NotNull Demand demand) {
      putValue("offers", demand);
      return this;
    }
    /**
     * An offer to provide this item&amp;#x2014;for example, an offer to sell a product, rent the DVD of a movie, perform a service, or give away tickets to an event. Use [[businessFunction]] to indicate the kind of transaction offered, i.e. sell, lease, etc. This property can also be used to describe a [[Demand]]. While this property is listed as expected on a number of common types, it can be used in others. In that case, using a second type, such as Product or a subtype of Product, can clarify the nature of the offer.
     *       
     */
    @NotNull public Builder offers(@NotNull Demand.Builder demand) {
      putValue("offers", demand.build());
      return this;
    }
    /**
     * An offer to provide this item&amp;#x2014;for example, an offer to sell a product, rent the DVD of a movie, perform a service, or give away tickets to an event. Use [[businessFunction]] to indicate the kind of transaction offered, i.e. sell, lease, etc. This property can also be used to describe a [[Demand]]. While this property is listed as expected on a number of common types, it can be used in others. In that case, using a second type, such as Product or a subtype of Product, can clarify the nature of the offer.
     *       
     */
    @NotNull public Builder offers(@NotNull Offer offer) {
      putValue("offers", offer);
      return this;
    }
    /**
     * An offer to provide this item&amp;#x2014;for example, an offer to sell a product, rent the DVD of a movie, perform a service, or give away tickets to an event. Use [[businessFunction]] to indicate the kind of transaction offered, i.e. sell, lease, etc. This property can also be used to describe a [[Demand]]. While this property is listed as expected on a number of common types, it can be used in others. In that case, using a second type, such as Product or a subtype of Product, can clarify the nature of the offer.
     *       
     */
    @NotNull public Builder offers(@NotNull Offer.Builder offer) {
      putValue("offers", offer.build());
      return this;
    }
    /**
     * An event that this event is a part of. For example, a collection of individual music performances might each have a music festival as their superEvent.
     */
    @NotNull public Builder superEvent(@NotNull Event event) {
      putValue("superEvent", event);
      return this;
    }
    /**
     * An event that this event is a part of. For example, a collection of individual music performances might each have a music festival as their superEvent.
     */
    @NotNull public Builder superEvent(@NotNull Event.Builder event) {
      putValue("superEvent", event.build());
      return this;
    }
    /**
     * The CreativeWork that captured all or part of this Event.
     */
    @NotNull public Builder recordedIn(@NotNull CreativeWork creativeWork) {
      putValue("recordedIn", creativeWork);
      return this;
    }
    /**
     * The CreativeWork that captured all or part of this Event.
     */
    @NotNull public Builder recordedIn(@NotNull CreativeWork.Builder creativeWork) {
      putValue("recordedIn", creativeWork.build());
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
      if ("organizer".equals(key) && value instanceof Organization) { this.organizer((Organization)value); return; }
      if ("organizers".equals(key) && value instanceof Organization) { this.organizer((Organization)value); return; }
      if ("organizer".equals(key) && value instanceof Person) { this.organizer((Person)value); return; }
      if ("organizers".equals(key) && value instanceof Person) { this.organizer((Person)value); return; }
      if ("inLanguage".equals(key) && value instanceof Language) { this.inLanguage((Language)value); return; }
      if ("inLanguages".equals(key) && value instanceof Language) { this.inLanguage((Language)value); return; }
      if ("inLanguage".equals(key) && value instanceof String) { this.inLanguage((String)value); return; }
      if ("inLanguages".equals(key) && value instanceof String) { this.inLanguage((String)value); return; }
      if ("workPerformed".equals(key) && value instanceof WorkFeatured) { this.workPerformed((WorkFeatured)value); return; }
      if ("workPerformeds".equals(key) && value instanceof WorkFeatured) { this.workPerformed((WorkFeatured)value); return; }
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
      if ("superEvent".equals(key) && value instanceof Event) { this.superEvent((Event)value); return; }
      if ("superEvents".equals(key) && value instanceof Event) { this.superEvent((Event)value); return; }
      if ("recordedIn".equals(key) && value instanceof CreativeWork) { this.recordedIn((CreativeWork)value); return; }
      if ("recordedIns".equals(key) && value instanceof CreativeWork) { this.recordedIn((CreativeWork)value); return; }
      super.fromMap(key, value);
    }
  }
  
}
