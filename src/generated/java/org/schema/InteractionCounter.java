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
 * A summary of how users have interacted with this CreativeWork. In most cases, authors will use a subtype to specify the specific type of interaction.
 */
public class InteractionCounter extends StructuredValue {
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
    final Object current = myData.get("startTime");
    if (current == null) return Collections.emptyList();
    if (current instanceof java.util.Collection) {
      return (java.util.Collection<java.util.Date>) current;
    }
    return Arrays.asList((java.util.Date) current);
  }
  /**
   * The WebSite or SoftwareApplication where the interactions took place.
   */
  @JsonIgnore public SoftwareApplication getInteractionServiceSoftwareApplication() {
    return (SoftwareApplication) getValue("interactionService");
  }
  /**
   * The WebSite or SoftwareApplication where the interactions took place.
   */
  @JsonIgnore public java.util.Collection<SoftwareApplication> getInteractionServiceSoftwareApplications() {
    final Object current = myData.get("interactionService");
    if (current == null) return Collections.emptyList();
    if (current instanceof java.util.Collection) {
      return (java.util.Collection<SoftwareApplication>) current;
    }
    return Arrays.asList((SoftwareApplication) current);
  }
  /**
   * The WebSite or SoftwareApplication where the interactions took place.
   */
  @JsonIgnore public WebSite getInteractionServiceWebSite() {
    return (WebSite) getValue("interactionService");
  }
  /**
   * The WebSite or SoftwareApplication where the interactions took place.
   */
  @JsonIgnore public java.util.Collection<WebSite> getInteractionServiceWebSites() {
    final Object current = myData.get("interactionService");
    if (current == null) return Collections.emptyList();
    if (current instanceof java.util.Collection) {
      return (java.util.Collection<WebSite>) current;
    }
    return Arrays.asList((WebSite) current);
  }
  /**
   * The Action representing the type of interaction. For up votes, +1s, etc. use [[LikeAction]]. For down votes use [[DislikeAction]]. Otherwise, use the most specific Action.
   */
  @JsonIgnore public Action getInteractionType() {
    return (Action) getValue("interactionType");
  }
  /**
   * The Action representing the type of interaction. For up votes, +1s, etc. use [[LikeAction]]. For down votes use [[DislikeAction]]. Otherwise, use the most specific Action.
   */
  @JsonIgnore public java.util.Collection<Action> getInteractionTypes() {
    final Object current = myData.get("interactionType");
    if (current == null) return Collections.emptyList();
    if (current instanceof java.util.Collection) {
      return (java.util.Collection<Action>) current;
    }
    return Arrays.asList((Action) current);
  }
  /**
   * The number of interactions for the CreativeWork using the WebSite or SoftwareApplication.
   */
  @JsonIgnore public Integer getUserInteractionCount() {
    return (Integer) getValue("userInteractionCount");
  }
  /**
   * The number of interactions for the CreativeWork using the WebSite or SoftwareApplication.
   */
  @JsonIgnore public java.util.Collection<Integer> getUserInteractionCounts() {
    final Object current = myData.get("userInteractionCount");
    if (current == null) return Collections.emptyList();
    if (current instanceof java.util.Collection) {
      return (java.util.Collection<Integer>) current;
    }
    return Arrays.asList((Integer) current);
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
    final Object current = myData.get("endTime");
    if (current == null) return Collections.emptyList();
    if (current instanceof java.util.Collection) {
      return (java.util.Collection<java.util.Date>) current;
    }
    return Arrays.asList((java.util.Date) current);
  }
  protected InteractionCounter(java.util.Map<String,Object> data) {
    super(data);
  }
  
  /**
   * Builder for {@link InteractionCounter}
   */
  public static class Builder extends StructuredValue.Builder {
    public Builder(@NotNull HashMap<String,Object> data) {
      super(data);
    }
    @NotNull public InteractionCounter build() {
      return new InteractionCounter(myData);
    }
    /**
     * The startTime of something. For a reserved event or service (e.g. FoodEstablishmentReservation), the time that it is expected to start. For actions that span a period of time, when the action was performed. e.g. John wrote a book from *January* to December. For media, including audio and video, it's the time offset of the start of a clip within a larger file.\n\nNote that Event uses startDate/endDate instead of startTime/endTime, even when describing dates with times. This situation may be clarified in future revisions.
     */
    @NotNull public Builder startTime(@NotNull java.util.Date date) {
      putValue("startTime", date);
      return this;
    }
    /**
     * The WebSite or SoftwareApplication where the interactions took place.
     */
    @NotNull public Builder interactionService(@NotNull SoftwareApplication softwareApplication) {
      putValue("interactionService", softwareApplication);
      return this;
    }
    /**
     * The WebSite or SoftwareApplication where the interactions took place.
     */
    @NotNull public Builder interactionService(@NotNull SoftwareApplication.Builder softwareApplication) {
      putValue("interactionService", softwareApplication.build());
      return this;
    }
    /**
     * The WebSite or SoftwareApplication where the interactions took place.
     */
    @NotNull public Builder interactionService(@NotNull WebSite webSite) {
      putValue("interactionService", webSite);
      return this;
    }
    /**
     * The WebSite or SoftwareApplication where the interactions took place.
     */
    @NotNull public Builder interactionService(@NotNull WebSite.Builder webSite) {
      putValue("interactionService", webSite.build());
      return this;
    }
    /**
     * The Action representing the type of interaction. For up votes, +1s, etc. use [[LikeAction]]. For down votes use [[DislikeAction]]. Otherwise, use the most specific Action.
     */
    @NotNull public Builder interactionType(@NotNull Action action) {
      putValue("interactionType", action);
      return this;
    }
    /**
     * The Action representing the type of interaction. For up votes, +1s, etc. use [[LikeAction]]. For down votes use [[DislikeAction]]. Otherwise, use the most specific Action.
     */
    @NotNull public Builder interactionType(@NotNull Action.Builder action) {
      putValue("interactionType", action.build());
      return this;
    }
    /**
     * The number of interactions for the CreativeWork using the WebSite or SoftwareApplication.
     */
    @NotNull public Builder userInteractionCount(@NotNull Integer integer) {
      putValue("userInteractionCount", integer);
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
      if ("startTime".equals(key) && value instanceof java.util.Date) { this.startTime((java.util.Date)value); return; }
      if ("startTimes".equals(key) && value instanceof java.util.Date) { this.startTime((java.util.Date)value); return; }
      if ("interactionService".equals(key) && value instanceof SoftwareApplication) { this.interactionService((SoftwareApplication)value); return; }
      if ("interactionServices".equals(key) && value instanceof SoftwareApplication) { this.interactionService((SoftwareApplication)value); return; }
      if ("interactionService".equals(key) && value instanceof WebSite) { this.interactionService((WebSite)value); return; }
      if ("interactionServices".equals(key) && value instanceof WebSite) { this.interactionService((WebSite)value); return; }
      if ("interactionType".equals(key) && value instanceof Action) { this.interactionType((Action)value); return; }
      if ("interactionTypes".equals(key) && value instanceof Action) { this.interactionType((Action)value); return; }
      if ("userInteractionCount".equals(key) && value instanceof Integer) { this.userInteractionCount((Integer)value); return; }
      if ("userInteractionCounts".equals(key) && value instanceof Integer) { this.userInteractionCount((Integer)value); return; }
      if ("endTime".equals(key) && value instanceof java.util.Date) { this.endTime((java.util.Date)value); return; }
      if ("endTimes".equals(key) && value instanceof java.util.Date) { this.endTime((java.util.Date)value); return; }
      super.fromMap(key, value);
    }
  }
  
}
