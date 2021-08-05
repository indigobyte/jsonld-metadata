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
 * A radio channel that uses FM.
 */
public class FMRadioChannel extends RadioChannel {
  protected FMRadioChannel(java.util.Map<String,Object> data) {
    super(data);
  }
  
  /**
   * Builder for {@link FMRadioChannel}
   */
  public static class Builder extends RadioChannel.Builder {
    public Builder(@NotNull HashMap<String,Object> data) {
      super(data);
    }
    @NotNull public FMRadioChannel build() {
      return new FMRadioChannel(myData);
    }
    /**
     * Genre of the creative work, broadcast channel or group.
     */
    @NotNull public Builder genre(@NotNull Genre genre) {
      putValue("genre", genre);
      return this;
    }
    /**
     * The unique address by which the BroadcastService can be identified in a provider lineup. In US, this is typically a number.
     */
    @NotNull public Builder broadcastChannelId(@NotNull String broadcastChannelId) {
      putValue("broadcastChannelId", broadcastChannelId);
      return this;
    }
    /**
     * The frequency used for over-the-air broadcasts. Numeric values or simple ranges e.g. 87-99. In addition a shortcut idiom is supported for frequences of AM and FM radio channels, e.g. &quot;87 FM&quot;.
     */
    @NotNull public Builder broadcastFrequency(@NotNull BroadcastFrequencySpecification broadcastFrequencySpecification) {
      putValue("broadcastFrequency", broadcastFrequencySpecification);
      return this;
    }
    /**
     * The frequency used for over-the-air broadcasts. Numeric values or simple ranges e.g. 87-99. In addition a shortcut idiom is supported for frequences of AM and FM radio channels, e.g. &quot;87 FM&quot;.
     */
    @NotNull public Builder broadcastFrequency(@NotNull BroadcastFrequencySpecification.Builder broadcastFrequencySpecification) {
      putValue("broadcastFrequency", broadcastFrequencySpecification.build());
      return this;
    }
    /**
     * The frequency used for over-the-air broadcasts. Numeric values or simple ranges e.g. 87-99. In addition a shortcut idiom is supported for frequences of AM and FM radio channels, e.g. &quot;87 FM&quot;.
     */
    @NotNull public Builder broadcastFrequency(@NotNull String broadcastFrequency) {
      putValue("broadcastFrequency", broadcastFrequency);
      return this;
    }
    /**
     * The type of service required to have access to the channel (e.g. Standard or Premium).
     */
    @NotNull public Builder broadcastServiceTier(@NotNull String broadcastServiceTier) {
      putValue("broadcastServiceTier", broadcastServiceTier);
      return this;
    }
    /**
     * The CableOrSatelliteService offering the channel.
     */
    @NotNull public Builder inBroadcastLineup(@NotNull CableOrSatelliteService cableOrSatelliteService) {
      putValue("inBroadcastLineup", cableOrSatelliteService);
      return this;
    }
    /**
     * The CableOrSatelliteService offering the channel.
     */
    @NotNull public Builder inBroadcastLineup(@NotNull CableOrSatelliteService.Builder cableOrSatelliteService) {
      putValue("inBroadcastLineup", cableOrSatelliteService.build());
      return this;
    }
    /**
     * The BroadcastService offered on this channel.
     */
    @NotNull public Builder providesBroadcastService(@NotNull BroadcastService broadcastService) {
      putValue("providesBroadcastService", broadcastService);
      return this;
    }
    /**
     * The BroadcastService offered on this channel.
     */
    @NotNull public Builder providesBroadcastService(@NotNull BroadcastService.Builder broadcastService) {
      putValue("providesBroadcastService", broadcastService.build());
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
      super.fromMap(key, value);
    }
  }
  
}
