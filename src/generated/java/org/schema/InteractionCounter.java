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
   * The WebSite or SoftwareApplication where the interactions took place.
   */
  @JsonIgnore public SoftwareApplication getInteractionServiceSoftwareApplication() {
    return (SoftwareApplication) getValue("interactionService");
  }
  /**
   * The WebSite or SoftwareApplication where the interactions took place.
   */
  @JsonIgnore public Collection<SoftwareApplication> getInteractionServiceSoftwareApplications() {
    final Object current = myData.get("interactionService");
    if (current == null) return Collections.emptyList();
    if (current instanceof Collection) {
      return (Collection<SoftwareApplication>) current;
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
  @JsonIgnore public Collection<WebSite> getInteractionServiceWebSites() {
    final Object current = myData.get("interactionService");
    if (current == null) return Collections.emptyList();
    if (current instanceof Collection) {
      return (Collection<WebSite>) current;
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
  @JsonIgnore public Collection<Action> getInteractionTypes() {
    final Object current = myData.get("interactionType");
    if (current == null) return Collections.emptyList();
    if (current instanceof Collection) {
      return (Collection<Action>) current;
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
  @JsonIgnore public Collection<Integer> getUserInteractionCounts() {
    final Object current = myData.get("userInteractionCount");
    if (current == null) return Collections.emptyList();
    if (current instanceof Collection) {
      return (Collection<Integer>) current;
    }
    return Arrays.asList((Integer) current);
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
    @NotNull public Builder additionalType(@NotNull AdditionalType additionalType) {
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
     * A description of the item.
     */
    @NotNull public Builder description(@NotNull DisambiguatingDescription disambiguatingDescription) {
      putValue("description", disambiguatingDescription);
      return this;
    }
    @NotNull public Builder disambiguatingDescription(@NotNull DisambiguatingDescription disambiguatingDescription) {
      putValue("disambiguatingDescription", disambiguatingDescription);
      return this;
    }
    /**
     * An image of the item. This can be a [[URL]] or a fully described [[ImageObject]].
     */
    @NotNull public Builder image(@NotNull Logo logo) {
      putValue("image", logo);
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
     * The identifier property represents any kind of identifier for any kind of [[Thing]], such as ISBNs, GTIN codes, UUIDs etc. Schema.org provides dedicated properties for representing many of these, either as textual strings or as URL (URI) links. See [background notes](/docs/datamodel.html#identifierBg) for more details.
     *         
     */
    @NotNull public Builder identifier(@NotNull Isbn isbn) {
      putValue("identifier", isbn);
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
      if ("interactionService".equals(key) && value instanceof SoftwareApplication) { interactionService((SoftwareApplication)value); return; }
      if ("interactionServices".equals(key) && value instanceof SoftwareApplication) { interactionService((SoftwareApplication)value); return; }
      if ("interactionService".equals(key) && value instanceof WebSite) { interactionService((WebSite)value); return; }
      if ("interactionServices".equals(key) && value instanceof WebSite) { interactionService((WebSite)value); return; }
      if ("interactionType".equals(key) && value instanceof Action) { interactionType((Action)value); return; }
      if ("interactionTypes".equals(key) && value instanceof Action) { interactionType((Action)value); return; }
      if ("userInteractionCount".equals(key) && value instanceof Integer) { userInteractionCount((Integer)value); return; }
      if ("userInteractionCounts".equals(key) && value instanceof Integer) { userInteractionCount((Integer)value); return; }
      super.fromMap(key, value);
    }
  }
  
}
