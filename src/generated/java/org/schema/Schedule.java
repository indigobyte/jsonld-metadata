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
 * A schedule defines a repeating time period used to describe a regularly occurring &lt;a class=&quot;localLink&quot; href=&quot;http://schema.org/Event&quot;&gt;Event&lt;/a&gt;. At a minimum a schedule will specify &lt;a class=&quot;localLink&quot; href=&quot;http://schema.org/repeatFrequency&quot;&gt;repeatFrequency&lt;/a&gt; which describes the interval between occurences of the event. Additional information can be provided to specify the schedule more precisely.
 *       This includes identifying the day(s) of the week or month when the recurring event will take place, in addition to its start and end time. Schedules may also
 *       have start and end dates to indicate when they are active, e.g. to define a limited calendar of events.Source: https://github.com/schemaorg/schemaorg/issues/1457
 */
public class Schedule extends Intangible {
  /**
   * The start date and time of the item (in &lt;a href=&quot;http://en.wikipedia.org/wiki/ISO_8601&quot;&gt;ISO 8601 date format&lt;/a&gt;).
   */
  @JsonIgnore public java.util.Date getStartDate() {
    return (java.util.Date) getValue("startDate");
  }
  /**
   * The start date and time of the item (in &lt;a href=&quot;http://en.wikipedia.org/wiki/ISO_8601&quot;&gt;ISO 8601 date format&lt;/a&gt;).
   */
  @JsonIgnore public Collection<java.util.Date> getStartDates() {
    final Object current = myData.get("startDate");
    if (current == null) return Collections.emptyList();
    if (current instanceof Collection) {
      return (Collection<java.util.Date>) current;
    }
    return Arrays.asList((java.util.Date) current);
  }
  /**
   * The startTime of something. For a reserved event or service (e.g. FoodEstablishmentReservation), the time that it is expected to start. For actions that span a period of time, when the action was performed. e.g. John wrote a book from &lt;em&gt;January&lt;/em&gt; to December. For media, including audio and video, it's the time offset of the start of a clip within a larger file.&lt;br/&gt;&lt;br/&gt;
   * 
   * Note that Event uses startDate/endDate instead of startTime/endTime, even when describing dates with times. This situation may be clarified in future revisions.
   */
  @JsonIgnore public java.util.Date getStartTime() {
    return (java.util.Date) getValue("startTime");
  }
  /**
   * The startTime of something. For a reserved event or service (e.g. FoodEstablishmentReservation), the time that it is expected to start. For actions that span a period of time, when the action was performed. e.g. John wrote a book from &lt;em&gt;January&lt;/em&gt; to December. For media, including audio and video, it's the time offset of the start of a clip within a larger file.&lt;br/&gt;&lt;br/&gt;
   * 
   * Note that Event uses startDate/endDate instead of startTime/endTime, even when describing dates with times. This situation may be clarified in future revisions.
   */
  @JsonIgnore public Collection<java.util.Date> getStartTimes() {
    final Object current = myData.get("startTime");
    if (current == null) return Collections.emptyList();
    if (current instanceof Collection) {
      return (Collection<java.util.Date>) current;
    }
    return Arrays.asList((java.util.Date) current);
  }
  /**
   * Defines the day(s) of the week on which a recurring &lt;a class=&quot;localLink&quot; href=&quot;http://schema.org/Event&quot;&gt;Event&lt;/a&gt; takes place. May be specified using either &lt;a class=&quot;localLink&quot; href=&quot;http://schema.org/DayOfWeek&quot;&gt;DayOfWeek&lt;/a&gt;, or alternatively &lt;a class=&quot;localLink&quot; href=&quot;http://schema.org/Text&quot;&gt;Text&lt;/a&gt; conforming to iCal's syntax for byDay recurrence rules
   */
  @JsonIgnore public DayOfWeek getByDayDayOfWeek() {
    return (DayOfWeek) getValue("byDay");
  }
  /**
   * Defines the day(s) of the week on which a recurring &lt;a class=&quot;localLink&quot; href=&quot;http://schema.org/Event&quot;&gt;Event&lt;/a&gt; takes place. May be specified using either &lt;a class=&quot;localLink&quot; href=&quot;http://schema.org/DayOfWeek&quot;&gt;DayOfWeek&lt;/a&gt;, or alternatively &lt;a class=&quot;localLink&quot; href=&quot;http://schema.org/Text&quot;&gt;Text&lt;/a&gt; conforming to iCal's syntax for byDay recurrence rules
   */
  @JsonIgnore public Collection<DayOfWeek> getByDayDayOfWeeks() {
    final Object current = myData.get("byDay");
    if (current == null) return Collections.emptyList();
    if (current instanceof Collection) {
      return (Collection<DayOfWeek>) current;
    }
    return Arrays.asList((DayOfWeek) current);
  }
  /**
   * Defines the day(s) of the week on which a recurring &lt;a class=&quot;localLink&quot; href=&quot;http://schema.org/Event&quot;&gt;Event&lt;/a&gt; takes place. May be specified using either &lt;a class=&quot;localLink&quot; href=&quot;http://schema.org/DayOfWeek&quot;&gt;DayOfWeek&lt;/a&gt;, or alternatively &lt;a class=&quot;localLink&quot; href=&quot;http://schema.org/Text&quot;&gt;Text&lt;/a&gt; conforming to iCal's syntax for byDay recurrence rules
   */
  @JsonIgnore public String getByDayString() {
    return (String) getValue("byDay");
  }
  /**
   * Defines the day(s) of the week on which a recurring &lt;a class=&quot;localLink&quot; href=&quot;http://schema.org/Event&quot;&gt;Event&lt;/a&gt; takes place. May be specified using either &lt;a class=&quot;localLink&quot; href=&quot;http://schema.org/DayOfWeek&quot;&gt;DayOfWeek&lt;/a&gt;, or alternatively &lt;a class=&quot;localLink&quot; href=&quot;http://schema.org/Text&quot;&gt;Text&lt;/a&gt; conforming to iCal's syntax for byDay recurrence rules
   */
  @JsonIgnore public Collection<String> getByDayStrings() {
    final Object current = myData.get("byDay");
    if (current == null) return Collections.emptyList();
    if (current instanceof Collection) {
      return (Collection<String>) current;
    }
    return Arrays.asList((String) current);
  }
  /**
   * Defines a &lt;a class=&quot;localLink&quot; href=&quot;http://schema.org/Date&quot;&gt;Date&lt;/a&gt; or &lt;a class=&quot;localLink&quot; href=&quot;http://schema.org/DateTime&quot;&gt;DateTime&lt;/a&gt; during which a scheduled &lt;a class=&quot;localLink&quot; href=&quot;http://schema.org/Event&quot;&gt;Event&lt;/a&gt; will not take place. The property allows exceptions to
   *       a &lt;a class=&quot;localLink&quot; href=&quot;http://schema.org/Schedule&quot;&gt;Schedule&lt;/a&gt; to be specified. If an exception is specified as a &lt;a class=&quot;localLink&quot; href=&quot;http://schema.org/DateTime&quot;&gt;DateTime&lt;/a&gt; then only the event that would have started at that specific date and time
   *       should be excluded from the schedule. If an exception is specified as a &lt;a class=&quot;localLink&quot; href=&quot;http://schema.org/Date&quot;&gt;Date&lt;/a&gt; then any event that is scheduled for that 24 hour period should be
   *       excluded from the schedule. This allows a whole day to be excluded from the schedule without having to itemise every scheduled event.
   */
  @JsonIgnore public java.util.Date getExceptDate() {
    return (java.util.Date) getValue("exceptDate");
  }
  /**
   * Defines a &lt;a class=&quot;localLink&quot; href=&quot;http://schema.org/Date&quot;&gt;Date&lt;/a&gt; or &lt;a class=&quot;localLink&quot; href=&quot;http://schema.org/DateTime&quot;&gt;DateTime&lt;/a&gt; during which a scheduled &lt;a class=&quot;localLink&quot; href=&quot;http://schema.org/Event&quot;&gt;Event&lt;/a&gt; will not take place. The property allows exceptions to
   *       a &lt;a class=&quot;localLink&quot; href=&quot;http://schema.org/Schedule&quot;&gt;Schedule&lt;/a&gt; to be specified. If an exception is specified as a &lt;a class=&quot;localLink&quot; href=&quot;http://schema.org/DateTime&quot;&gt;DateTime&lt;/a&gt; then only the event that would have started at that specific date and time
   *       should be excluded from the schedule. If an exception is specified as a &lt;a class=&quot;localLink&quot; href=&quot;http://schema.org/Date&quot;&gt;Date&lt;/a&gt; then any event that is scheduled for that 24 hour period should be
   *       excluded from the schedule. This allows a whole day to be excluded from the schedule without having to itemise every scheduled event.
   */
  @JsonIgnore public Collection<java.util.Date> getExceptDates() {
    final Object current = myData.get("exceptDate");
    if (current == null) return Collections.emptyList();
    if (current instanceof Collection) {
      return (Collection<java.util.Date>) current;
    }
    return Arrays.asList((java.util.Date) current);
  }
  /**
   * The end date and time of the item (in &lt;a href=&quot;http://en.wikipedia.org/wiki/ISO_8601&quot;&gt;ISO 8601 date format&lt;/a&gt;).
   */
  @JsonIgnore public java.util.Date getEndDate() {
    return (java.util.Date) getValue("endDate");
  }
  /**
   * The end date and time of the item (in &lt;a href=&quot;http://en.wikipedia.org/wiki/ISO_8601&quot;&gt;ISO 8601 date format&lt;/a&gt;).
   */
  @JsonIgnore public Collection<java.util.Date> getEndDates() {
    final Object current = myData.get("endDate");
    if (current == null) return Collections.emptyList();
    if (current instanceof Collection) {
      return (Collection<java.util.Date>) current;
    }
    return Arrays.asList((java.util.Date) current);
  }
  /**
   * Defines the number of times a recurring &lt;a class=&quot;localLink&quot; href=&quot;http://schema.org/Event&quot;&gt;Event&lt;/a&gt; will take place
   */
  @JsonIgnore public Integer getRepeatCount() {
    return (Integer) getValue("repeatCount");
  }
  /**
   * Defines the number of times a recurring &lt;a class=&quot;localLink&quot; href=&quot;http://schema.org/Event&quot;&gt;Event&lt;/a&gt; will take place
   */
  @JsonIgnore public Collection<Integer> getRepeatCounts() {
    final Object current = myData.get("repeatCount");
    if (current == null) return Collections.emptyList();
    if (current instanceof Collection) {
      return (Collection<Integer>) current;
    }
    return Arrays.asList((Integer) current);
  }
  /**
   * The duration of the item (movie, audio recording, event, etc.) in &lt;a href=&quot;http://en.wikipedia.org/wiki/ISO_8601&quot;&gt;ISO 8601 date format&lt;/a&gt;.
   */
  @JsonIgnore public Duration getDuration() {
    return (Duration) getValue("duration");
  }
  /**
   * The duration of the item (movie, audio recording, event, etc.) in &lt;a href=&quot;http://en.wikipedia.org/wiki/ISO_8601&quot;&gt;ISO 8601 date format&lt;/a&gt;.
   */
  @JsonIgnore public Collection<Duration> getDurations() {
    final Object current = myData.get("duration");
    if (current == null) return Collections.emptyList();
    if (current instanceof Collection) {
      return (Collection<Duration>) current;
    }
    return Arrays.asList((Duration) current);
  }
  /**
   * Defines the frequency at which &lt;a class=&quot;localLink&quot; href=&quot;http://schema.org/Events&quot;&gt;Events&lt;/a&gt; will occur according to a schedule &lt;a class=&quot;localLink&quot; href=&quot;http://schema.org/Schedule&quot;&gt;Schedule&lt;/a&gt;. The intervals between
   *       events should be defined as a &lt;a class=&quot;localLink&quot; href=&quot;http://schema.org/Duration&quot;&gt;Duration&lt;/a&gt; of time.
   */
  @JsonIgnore public Duration getRepeatFrequencyDuration() {
    return (Duration) getValue("repeatFrequency");
  }
  /**
   * Defines the frequency at which &lt;a class=&quot;localLink&quot; href=&quot;http://schema.org/Events&quot;&gt;Events&lt;/a&gt; will occur according to a schedule &lt;a class=&quot;localLink&quot; href=&quot;http://schema.org/Schedule&quot;&gt;Schedule&lt;/a&gt;. The intervals between
   *       events should be defined as a &lt;a class=&quot;localLink&quot; href=&quot;http://schema.org/Duration&quot;&gt;Duration&lt;/a&gt; of time.
   */
  @JsonIgnore public Collection<Duration> getRepeatFrequencyDurations() {
    final Object current = myData.get("repeatFrequency");
    if (current == null) return Collections.emptyList();
    if (current instanceof Collection) {
      return (Collection<Duration>) current;
    }
    return Arrays.asList((Duration) current);
  }
  /**
   * Defines the frequency at which &lt;a class=&quot;localLink&quot; href=&quot;http://schema.org/Events&quot;&gt;Events&lt;/a&gt; will occur according to a schedule &lt;a class=&quot;localLink&quot; href=&quot;http://schema.org/Schedule&quot;&gt;Schedule&lt;/a&gt;. The intervals between
   *       events should be defined as a &lt;a class=&quot;localLink&quot; href=&quot;http://schema.org/Duration&quot;&gt;Duration&lt;/a&gt; of time.
   */
  @JsonIgnore public String getRepeatFrequencyString() {
    return (String) getValue("repeatFrequency");
  }
  /**
   * Defines the frequency at which &lt;a class=&quot;localLink&quot; href=&quot;http://schema.org/Events&quot;&gt;Events&lt;/a&gt; will occur according to a schedule &lt;a class=&quot;localLink&quot; href=&quot;http://schema.org/Schedule&quot;&gt;Schedule&lt;/a&gt;. The intervals between
   *       events should be defined as a &lt;a class=&quot;localLink&quot; href=&quot;http://schema.org/Duration&quot;&gt;Duration&lt;/a&gt; of time.
   */
  @JsonIgnore public Collection<String> getRepeatFrequencyStrings() {
    final Object current = myData.get("repeatFrequency");
    if (current == null) return Collections.emptyList();
    if (current instanceof Collection) {
      return (Collection<String>) current;
    }
    return Arrays.asList((String) current);
  }
  /**
   * Defines the day(s) of the month on which a recurring &lt;a class=&quot;localLink&quot; href=&quot;http://schema.org/Event&quot;&gt;Event&lt;/a&gt; takes place. Specified as an &lt;a class=&quot;localLink&quot; href=&quot;http://schema.org/Integer&quot;&gt;Integer&lt;/a&gt; between 1-31.
   */
  @JsonIgnore public Integer getByMonthDay() {
    return (Integer) getValue("byMonthDay");
  }
  /**
   * Defines the day(s) of the month on which a recurring &lt;a class=&quot;localLink&quot; href=&quot;http://schema.org/Event&quot;&gt;Event&lt;/a&gt; takes place. Specified as an &lt;a class=&quot;localLink&quot; href=&quot;http://schema.org/Integer&quot;&gt;Integer&lt;/a&gt; between 1-31.
   */
  @JsonIgnore public Collection<Integer> getByMonthDays() {
    final Object current = myData.get("byMonthDay");
    if (current == null) return Collections.emptyList();
    if (current instanceof Collection) {
      return (Collection<Integer>) current;
    }
    return Arrays.asList((Integer) current);
  }
  /**
   * The endTime of something. For a reserved event or service (e.g. FoodEstablishmentReservation), the time that it is expected to end. For actions that span a period of time, when the action was performed. e.g. John wrote a book from January to &lt;em&gt;December&lt;/em&gt;. For media, including audio and video, it's the time offset of the end of a clip within a larger file.&lt;br/&gt;&lt;br/&gt;
   * 
   * Note that Event uses startDate/endDate instead of startTime/endTime, even when describing dates with times. This situation may be clarified in future revisions.
   */
  @JsonIgnore public java.util.Date getEndTime() {
    return (java.util.Date) getValue("endTime");
  }
  /**
   * The endTime of something. For a reserved event or service (e.g. FoodEstablishmentReservation), the time that it is expected to end. For actions that span a period of time, when the action was performed. e.g. John wrote a book from January to &lt;em&gt;December&lt;/em&gt;. For media, including audio and video, it's the time offset of the end of a clip within a larger file.&lt;br/&gt;&lt;br/&gt;
   * 
   * Note that Event uses startDate/endDate instead of startTime/endTime, even when describing dates with times. This situation may be clarified in future revisions.
   */
  @JsonIgnore public Collection<java.util.Date> getEndTimes() {
    final Object current = myData.get("endTime");
    if (current == null) return Collections.emptyList();
    if (current instanceof Collection) {
      return (Collection<java.util.Date>) current;
    }
    return Arrays.asList((java.util.Date) current);
  }
  /**
   * Defines the month(s) of the year on which a recurring &lt;a class=&quot;localLink&quot; href=&quot;http://schema.org/Event&quot;&gt;Event&lt;/a&gt; takes place. Specified as an &lt;a class=&quot;localLink&quot; href=&quot;http://schema.org/Integer&quot;&gt;Integer&lt;/a&gt; between 1-12. January is 1.
   */
  @JsonIgnore public Integer getByMonth() {
    return (Integer) getValue("byMonth");
  }
  /**
   * Defines the month(s) of the year on which a recurring &lt;a class=&quot;localLink&quot; href=&quot;http://schema.org/Event&quot;&gt;Event&lt;/a&gt; takes place. Specified as an &lt;a class=&quot;localLink&quot; href=&quot;http://schema.org/Integer&quot;&gt;Integer&lt;/a&gt; between 1-12. January is 1.
   */
  @JsonIgnore public Collection<Integer> getByMonths() {
    final Object current = myData.get("byMonth");
    if (current == null) return Collections.emptyList();
    if (current instanceof Collection) {
      return (Collection<Integer>) current;
    }
    return Arrays.asList((Integer) current);
  }
  /**
   * Indicates the timezone for which the time(s) indicated in the &lt;a class=&quot;localLink&quot; href=&quot;http://schema.org/Schedule&quot;&gt;Schedule&lt;/a&gt; are given. The value provided should be among those listed in the IANA Time Zone Database.
   */
  @JsonIgnore public String getScheduleTimezone() {
    return (String) getValue("scheduleTimezone");
  }
  /**
   * Indicates the timezone for which the time(s) indicated in the &lt;a class=&quot;localLink&quot; href=&quot;http://schema.org/Schedule&quot;&gt;Schedule&lt;/a&gt; are given. The value provided should be among those listed in the IANA Time Zone Database.
   */
  @JsonIgnore public Collection<String> getScheduleTimezones() {
    final Object current = myData.get("scheduleTimezone");
    if (current == null) return Collections.emptyList();
    if (current instanceof Collection) {
      return (Collection<String>) current;
    }
    return Arrays.asList((String) current);
  }
  protected Schedule(java.util.Map<String,Object> data) {
    super(data);
  }
  
  /**
   * Builder for {@link Schedule}
   */
  public static class Builder extends Intangible.Builder {
    public Builder(@NotNull HashMap<String,Object> data) {
      super(data);
    }
    @NotNull public Schedule build() {
      return new Schedule(myData);
    }
    /**
     * The start date and time of the item (in &lt;a href=&quot;http://en.wikipedia.org/wiki/ISO_8601&quot;&gt;ISO 8601 date format&lt;/a&gt;).
     */
    @NotNull public Builder startDate(@NotNull java.util.Date date) {
      putValue("startDate", date);
      return this;
    }
    /**
     * The startTime of something. For a reserved event or service (e.g. FoodEstablishmentReservation), the time that it is expected to start. For actions that span a period of time, when the action was performed. e.g. John wrote a book from &lt;em&gt;January&lt;/em&gt; to December. For media, including audio and video, it's the time offset of the start of a clip within a larger file.&lt;br/&gt;&lt;br/&gt;
     * 
     * Note that Event uses startDate/endDate instead of startTime/endTime, even when describing dates with times. This situation may be clarified in future revisions.
     */
    @NotNull public Builder startTime(@NotNull java.util.Date date) {
      putValue("startTime", date);
      return this;
    }
    /**
     * Defines the day(s) of the week on which a recurring &lt;a class=&quot;localLink&quot; href=&quot;http://schema.org/Event&quot;&gt;Event&lt;/a&gt; takes place. May be specified using either &lt;a class=&quot;localLink&quot; href=&quot;http://schema.org/DayOfWeek&quot;&gt;DayOfWeek&lt;/a&gt;, or alternatively &lt;a class=&quot;localLink&quot; href=&quot;http://schema.org/Text&quot;&gt;Text&lt;/a&gt; conforming to iCal's syntax for byDay recurrence rules
     */
    @NotNull public Builder byDay(@NotNull DayOfWeek dayOfWeek) {
      putValue("byDay", dayOfWeek);
      return this;
    }
    /**
     * Defines the day(s) of the week on which a recurring &lt;a class=&quot;localLink&quot; href=&quot;http://schema.org/Event&quot;&gt;Event&lt;/a&gt; takes place. May be specified using either &lt;a class=&quot;localLink&quot; href=&quot;http://schema.org/DayOfWeek&quot;&gt;DayOfWeek&lt;/a&gt;, or alternatively &lt;a class=&quot;localLink&quot; href=&quot;http://schema.org/Text&quot;&gt;Text&lt;/a&gt; conforming to iCal's syntax for byDay recurrence rules
     */
    @NotNull public Builder byDay(@NotNull String byDay) {
      putValue("byDay", byDay);
      return this;
    }
    /**
     * Defines a &lt;a class=&quot;localLink&quot; href=&quot;http://schema.org/Date&quot;&gt;Date&lt;/a&gt; or &lt;a class=&quot;localLink&quot; href=&quot;http://schema.org/DateTime&quot;&gt;DateTime&lt;/a&gt; during which a scheduled &lt;a class=&quot;localLink&quot; href=&quot;http://schema.org/Event&quot;&gt;Event&lt;/a&gt; will not take place. The property allows exceptions to
     *       a &lt;a class=&quot;localLink&quot; href=&quot;http://schema.org/Schedule&quot;&gt;Schedule&lt;/a&gt; to be specified. If an exception is specified as a &lt;a class=&quot;localLink&quot; href=&quot;http://schema.org/DateTime&quot;&gt;DateTime&lt;/a&gt; then only the event that would have started at that specific date and time
     *       should be excluded from the schedule. If an exception is specified as a &lt;a class=&quot;localLink&quot; href=&quot;http://schema.org/Date&quot;&gt;Date&lt;/a&gt; then any event that is scheduled for that 24 hour period should be
     *       excluded from the schedule. This allows a whole day to be excluded from the schedule without having to itemise every scheduled event.
     */
    @NotNull public Builder exceptDate(@NotNull java.util.Date date) {
      putValue("exceptDate", date);
      return this;
    }
    /**
     * The end date and time of the item (in &lt;a href=&quot;http://en.wikipedia.org/wiki/ISO_8601&quot;&gt;ISO 8601 date format&lt;/a&gt;).
     */
    @NotNull public Builder endDate(@NotNull java.util.Date date) {
      putValue("endDate", date);
      return this;
    }
    /**
     * Defines the number of times a recurring &lt;a class=&quot;localLink&quot; href=&quot;http://schema.org/Event&quot;&gt;Event&lt;/a&gt; will take place
     */
    @NotNull public Builder repeatCount(@NotNull Integer integer) {
      putValue("repeatCount", integer);
      return this;
    }
    /**
     * The duration of the item (movie, audio recording, event, etc.) in &lt;a href=&quot;http://en.wikipedia.org/wiki/ISO_8601&quot;&gt;ISO 8601 date format&lt;/a&gt;.
     */
    @NotNull public Builder duration(@NotNull Duration duration) {
      putValue("duration", duration);
      return this;
    }
    /**
     * Defines the frequency at which &lt;a class=&quot;localLink&quot; href=&quot;http://schema.org/Events&quot;&gt;Events&lt;/a&gt; will occur according to a schedule &lt;a class=&quot;localLink&quot; href=&quot;http://schema.org/Schedule&quot;&gt;Schedule&lt;/a&gt;. The intervals between
     *       events should be defined as a &lt;a class=&quot;localLink&quot; href=&quot;http://schema.org/Duration&quot;&gt;Duration&lt;/a&gt; of time.
     */
    @NotNull public Builder repeatFrequency(@NotNull Duration duration) {
      putValue("repeatFrequency", duration);
      return this;
    }
    /**
     * Defines the frequency at which &lt;a class=&quot;localLink&quot; href=&quot;http://schema.org/Events&quot;&gt;Events&lt;/a&gt; will occur according to a schedule &lt;a class=&quot;localLink&quot; href=&quot;http://schema.org/Schedule&quot;&gt;Schedule&lt;/a&gt;. The intervals between
     *       events should be defined as a &lt;a class=&quot;localLink&quot; href=&quot;http://schema.org/Duration&quot;&gt;Duration&lt;/a&gt; of time.
     */
    @NotNull public Builder repeatFrequency(@NotNull String repeatFrequency) {
      putValue("repeatFrequency", repeatFrequency);
      return this;
    }
    /**
     * Defines the day(s) of the month on which a recurring &lt;a class=&quot;localLink&quot; href=&quot;http://schema.org/Event&quot;&gt;Event&lt;/a&gt; takes place. Specified as an &lt;a class=&quot;localLink&quot; href=&quot;http://schema.org/Integer&quot;&gt;Integer&lt;/a&gt; between 1-31.
     */
    @NotNull public Builder byMonthDay(@NotNull Integer integer) {
      putValue("byMonthDay", integer);
      return this;
    }
    /**
     * The endTime of something. For a reserved event or service (e.g. FoodEstablishmentReservation), the time that it is expected to end. For actions that span a period of time, when the action was performed. e.g. John wrote a book from January to &lt;em&gt;December&lt;/em&gt;. For media, including audio and video, it's the time offset of the end of a clip within a larger file.&lt;br/&gt;&lt;br/&gt;
     * 
     * Note that Event uses startDate/endDate instead of startTime/endTime, even when describing dates with times. This situation may be clarified in future revisions.
     */
    @NotNull public Builder endTime(@NotNull java.util.Date date) {
      putValue("endTime", date);
      return this;
    }
    /**
     * Defines the month(s) of the year on which a recurring &lt;a class=&quot;localLink&quot; href=&quot;http://schema.org/Event&quot;&gt;Event&lt;/a&gt; takes place. Specified as an &lt;a class=&quot;localLink&quot; href=&quot;http://schema.org/Integer&quot;&gt;Integer&lt;/a&gt; between 1-12. January is 1.
     */
    @NotNull public Builder byMonth(@NotNull Integer integer) {
      putValue("byMonth", integer);
      return this;
    }
    /**
     * Indicates the timezone for which the time(s) indicated in the &lt;a class=&quot;localLink&quot; href=&quot;http://schema.org/Schedule&quot;&gt;Schedule&lt;/a&gt; are given. The value provided should be among those listed in the IANA Time Zone Database.
     */
    @NotNull public Builder scheduleTimezone(@NotNull String scheduleTimezone) {
      putValue("scheduleTimezone", scheduleTimezone);
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
    @Override protected void fromMap(String key, Object value) {
      if ("startDate".equals(key) && value instanceof java.util.Date) { this.startDate((java.util.Date)value); return; }
      if ("startDates".equals(key) && value instanceof java.util.Date) { this.startDate((java.util.Date)value); return; }
      if ("startTime".equals(key) && value instanceof java.util.Date) { this.startTime((java.util.Date)value); return; }
      if ("startTimes".equals(key) && value instanceof java.util.Date) { this.startTime((java.util.Date)value); return; }
      if ("byDay".equals(key) && value instanceof DayOfWeek) { this.byDay((DayOfWeek)value); return; }
      if ("byDays".equals(key) && value instanceof DayOfWeek) { this.byDay((DayOfWeek)value); return; }
      if ("byDay".equals(key) && value instanceof String) { this.byDay((String)value); return; }
      if ("byDays".equals(key) && value instanceof String) { this.byDay((String)value); return; }
      if ("exceptDate".equals(key) && value instanceof java.util.Date) { this.exceptDate((java.util.Date)value); return; }
      if ("exceptDates".equals(key) && value instanceof java.util.Date) { this.exceptDate((java.util.Date)value); return; }
      if ("endDate".equals(key) && value instanceof java.util.Date) { this.endDate((java.util.Date)value); return; }
      if ("endDates".equals(key) && value instanceof java.util.Date) { this.endDate((java.util.Date)value); return; }
      if ("repeatCount".equals(key) && value instanceof Integer) { this.repeatCount((Integer)value); return; }
      if ("repeatCounts".equals(key) && value instanceof Integer) { this.repeatCount((Integer)value); return; }
      if ("duration".equals(key) && value instanceof Duration) { this.duration((Duration)value); return; }
      if ("durations".equals(key) && value instanceof Duration) { this.duration((Duration)value); return; }
      if ("repeatFrequency".equals(key) && value instanceof Duration) { this.repeatFrequency((Duration)value); return; }
      if ("repeatFrequencys".equals(key) && value instanceof Duration) { this.repeatFrequency((Duration)value); return; }
      if ("repeatFrequency".equals(key) && value instanceof String) { this.repeatFrequency((String)value); return; }
      if ("repeatFrequencys".equals(key) && value instanceof String) { this.repeatFrequency((String)value); return; }
      if ("byMonthDay".equals(key) && value instanceof Integer) { this.byMonthDay((Integer)value); return; }
      if ("byMonthDays".equals(key) && value instanceof Integer) { this.byMonthDay((Integer)value); return; }
      if ("endTime".equals(key) && value instanceof java.util.Date) { this.endTime((java.util.Date)value); return; }
      if ("endTimes".equals(key) && value instanceof java.util.Date) { this.endTime((java.util.Date)value); return; }
      if ("byMonth".equals(key) && value instanceof Integer) { this.byMonth((Integer)value); return; }
      if ("byMonths".equals(key) && value instanceof Integer) { this.byMonth((Integer)value); return; }
      if ("scheduleTimezone".equals(key) && value instanceof String) { this.scheduleTimezone((String)value); return; }
      if ("scheduleTimezones".equals(key) && value instanceof String) { this.scheduleTimezone((String)value); return; }
      super.fromMap(key, value);
    }
  }
  
}
