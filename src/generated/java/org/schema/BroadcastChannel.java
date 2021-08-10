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
 * A unique instance of a BroadcastService on a CableOrSatelliteService lineup.
 */
public class BroadcastChannel extends Intangible {
  /**
   * Genre of the creative work, broadcast channel or group.
   * @return genre property set by first invocation of genre method or {@code null}.
   */
  @JsonIgnore public Genre getGenre() {
    return (Genre) getValue("genre");
  }
  /**
   * Genre of the creative work, broadcast channel or group.
   * @return all genre properties as {@link java.util.Collection} or an empty collection 
   * if genre was not set.
   */
  @JsonIgnore public java.util.Collection<Genre> getGenres() {
    final java.lang.Object current = myData.get("genre");
    if (current == null) return Collections.emptyList();
    if (current instanceof java.util.Collection) {
      return (java.util.Collection<Genre>) current;
    }
    return Arrays.asList((Genre) current);
  }
  /**
   * The unique address by which the BroadcastService can be identified in a provider lineup. In US, this is typically a number.
   * @return broadcastChannelId property set by first invocation of broadcastChannelId method or {@code null}.
   */
  @JsonIgnore public String getBroadcastChannelId() {
    return (String) getValue("broadcastChannelId");
  }
  /**
   * The unique address by which the BroadcastService can be identified in a provider lineup. In US, this is typically a number.
   * @return all broadcastChannelId properties as {@link java.util.Collection} or an empty collection 
   * if broadcastChannelId was not set.
   */
  @JsonIgnore public java.util.Collection<String> getBroadcastChannelIds() {
    final java.lang.Object current = myData.get("broadcastChannelId");
    if (current == null) return Collections.emptyList();
    if (current instanceof java.util.Collection) {
      return (java.util.Collection<String>) current;
    }
    return Arrays.asList((String) current);
  }
  /**
   * The frequency used for over-the-air broadcasts. Numeric values or simple ranges e.g. 87-99. In addition a shortcut idiom is supported for frequences of AM and FM radio channels, e.g. &quot;87 FM&quot;.
   * @return broadcastFrequency property set by first invocation of broadcastFrequency method or {@code null}.
   */
  @JsonIgnore public BroadcastFrequencySpecification getBroadcastFrequencyBroadcastFrequencySpecification() {
    return (BroadcastFrequencySpecification) getValue("broadcastFrequency");
  }
  /**
   * The frequency used for over-the-air broadcasts. Numeric values or simple ranges e.g. 87-99. In addition a shortcut idiom is supported for frequences of AM and FM radio channels, e.g. &quot;87 FM&quot;.
   * @return all broadcastFrequency properties as {@link java.util.Collection} or an empty collection 
   * if broadcastFrequency was not set.
   */
  @JsonIgnore public java.util.Collection<BroadcastFrequencySpecification> getBroadcastFrequencyBroadcastFrequencySpecifications() {
    final java.lang.Object current = myData.get("broadcastFrequency");
    if (current == null) return Collections.emptyList();
    if (current instanceof java.util.Collection) {
      return (java.util.Collection<BroadcastFrequencySpecification>) current;
    }
    return Arrays.asList((BroadcastFrequencySpecification) current);
  }
  /**
   * The frequency used for over-the-air broadcasts. Numeric values or simple ranges e.g. 87-99. In addition a shortcut idiom is supported for frequences of AM and FM radio channels, e.g. &quot;87 FM&quot;.
   * @return broadcastFrequency property set by first invocation of broadcastFrequency method or {@code null}.
   */
  @JsonIgnore public String getBroadcastFrequencyString() {
    return (String) getValue("broadcastFrequency");
  }
  /**
   * The frequency used for over-the-air broadcasts. Numeric values or simple ranges e.g. 87-99. In addition a shortcut idiom is supported for frequences of AM and FM radio channels, e.g. &quot;87 FM&quot;.
   * @return all broadcastFrequency properties as {@link java.util.Collection} or an empty collection 
   * if broadcastFrequency was not set.
   */
  @JsonIgnore public java.util.Collection<String> getBroadcastFrequencyStrings() {
    final java.lang.Object current = myData.get("broadcastFrequency");
    if (current == null) return Collections.emptyList();
    if (current instanceof java.util.Collection) {
      return (java.util.Collection<String>) current;
    }
    return Arrays.asList((String) current);
  }
  /**
   * The type of service required to have access to the channel (e.g. Standard or Premium).
   * @return broadcastServiceTier property set by first invocation of broadcastServiceTier method or {@code null}.
   */
  @JsonIgnore public String getBroadcastServiceTier() {
    return (String) getValue("broadcastServiceTier");
  }
  /**
   * The type of service required to have access to the channel (e.g. Standard or Premium).
   * @return all broadcastServiceTier properties as {@link java.util.Collection} or an empty collection 
   * if broadcastServiceTier was not set.
   */
  @JsonIgnore public java.util.Collection<String> getBroadcastServiceTiers() {
    final java.lang.Object current = myData.get("broadcastServiceTier");
    if (current == null) return Collections.emptyList();
    if (current instanceof java.util.Collection) {
      return (java.util.Collection<String>) current;
    }
    return Arrays.asList((String) current);
  }
  /**
   * The CableOrSatelliteService offering the channel.
   * @return inBroadcastLineup property set by first invocation of inBroadcastLineup method or {@code null}.
   */
  @JsonIgnore public CableOrSatelliteService getInBroadcastLineup() {
    return (CableOrSatelliteService) getValue("inBroadcastLineup");
  }
  /**
   * The CableOrSatelliteService offering the channel.
   * @return all inBroadcastLineup properties as {@link java.util.Collection} or an empty collection 
   * if inBroadcastLineup was not set.
   */
  @JsonIgnore public java.util.Collection<CableOrSatelliteService> getInBroadcastLineups() {
    final java.lang.Object current = myData.get("inBroadcastLineup");
    if (current == null) return Collections.emptyList();
    if (current instanceof java.util.Collection) {
      return (java.util.Collection<CableOrSatelliteService>) current;
    }
    return Arrays.asList((CableOrSatelliteService) current);
  }
  /**
   * The BroadcastService offered on this channel.
   * @return providesBroadcastService property set by first invocation of providesBroadcastService method or {@code null}.
   */
  @JsonIgnore public BroadcastService getProvidesBroadcastService() {
    return (BroadcastService) getValue("providesBroadcastService");
  }
  /**
   * The BroadcastService offered on this channel.
   * @return all providesBroadcastService properties as {@link java.util.Collection} or an empty collection 
   * if providesBroadcastService was not set.
   */
  @JsonIgnore public java.util.Collection<BroadcastService> getProvidesBroadcastServices() {
    final java.lang.Object current = myData.get("providesBroadcastService");
    if (current == null) return Collections.emptyList();
    if (current instanceof java.util.Collection) {
      return (java.util.Collection<BroadcastService>) current;
    }
    return Arrays.asList((BroadcastService) current);
  }
  protected BroadcastChannel(java.util.Map<String,java.lang.Object> data) {
    super(data);
  }
  /**
   * @return new {@link Builder} initialized with this instance's data
   */
  @NotNull public Builder toBuilder() {
    return new Builder(new HashMap<>(this.myData));
  }
  
  /**
   * Builder for {@link BroadcastChannel}
   */
  public static class Builder extends Intangible.Builder {
    public Builder(@NotNull HashMap<String,java.lang.Object> data) {
      super(data);
    }
    @NotNull public BroadcastChannel build() {
      return new BroadcastChannel(myData);
    }
    /**
     * Genre of the creative work, broadcast channel or group.
     * @param genre value to set
     * @return this builder instance
     */
    @NotNull public Builder genre(@NotNull Genre genre) {
      putValue("genre", genre);
      return this;
    }
    /**
     * Remove genre property from the builder.
     * If this property is repeatable, all instances are removed.
     * @return this builder instance
     */
    @NotNull public Builder removeGenre() {
      removeValue("genre");
      return this;
    }
    /**
     * Get currently set value for genre property in this builder.
     * @return previously set value or {@code null}. If multiple values have been 
     * set to this property, then {@link java.util.Collection} instance will be 
     * returned.
     */
    @Nullable public java.lang.Object getGenre() {
      return myData.get("genre");
    }
    /**
     * The unique address by which the BroadcastService can be identified in a provider lineup. In US, this is typically a number.
     * @param broadcastChannelId value to set
     * @return this builder instance
     */
    @NotNull public Builder broadcastChannelId(@NotNull String broadcastChannelId) {
      putValue("broadcastChannelId", broadcastChannelId);
      return this;
    }
    /**
     * Remove broadcastChannelId property from the builder.
     * If this property is repeatable, all instances are removed.
     * @return this builder instance
     */
    @NotNull public Builder removeBroadcastChannelId() {
      removeValue("broadcastChannelId");
      return this;
    }
    /**
     * Get currently set value for broadcastChannelId property in this builder.
     * @return previously set value or {@code null}. If multiple values have been 
     * set to this property, then {@link java.util.Collection} instance will be 
     * returned.
     */
    @Nullable public java.lang.Object getBroadcastChannelId() {
      return myData.get("broadcastChannelId");
    }
    /**
     * The frequency used for over-the-air broadcasts. Numeric values or simple ranges e.g. 87-99. In addition a shortcut idiom is supported for frequences of AM and FM radio channels, e.g. &quot;87 FM&quot;.
     * @param broadcastFrequencySpecification value to set
     * @return this builder instance
     */
    @NotNull public Builder broadcastFrequency(@NotNull BroadcastFrequencySpecification broadcastFrequencySpecification) {
      putValue("broadcastFrequency", broadcastFrequencySpecification);
      return this;
    }
    /**
     * The frequency used for over-the-air broadcasts. Numeric values or simple ranges e.g. 87-99. In addition a shortcut idiom is supported for frequences of AM and FM radio channels, e.g. &quot;87 FM&quot;.
     * @param broadcastFrequencySpecification value to set
     * @return this builder instance
     */
    @NotNull public Builder broadcastFrequency(@NotNull BroadcastFrequencySpecification.Builder broadcastFrequencySpecification) {
      putValue("broadcastFrequency", broadcastFrequencySpecification.build());
      return this;
    }
    /**
     * The frequency used for over-the-air broadcasts. Numeric values or simple ranges e.g. 87-99. In addition a shortcut idiom is supported for frequences of AM and FM radio channels, e.g. &quot;87 FM&quot;.
     * @param broadcastFrequency value to set
     * @return this builder instance
     */
    @NotNull public Builder broadcastFrequency(@NotNull String broadcastFrequency) {
      putValue("broadcastFrequency", broadcastFrequency);
      return this;
    }
    /**
     * Remove broadcastFrequency property from the builder.
     * If this property is repeatable, all instances are removed.
     * @return this builder instance
     */
    @NotNull public Builder removeBroadcastFrequency() {
      removeValue("broadcastFrequency");
      return this;
    }
    /**
     * Get currently set value for broadcastFrequency property in this builder.
     * @return previously set value or {@code null}. If multiple values have been 
     * set to this property, then {@link java.util.Collection} instance will be 
     * returned.
     */
    @Nullable public java.lang.Object getBroadcastFrequency() {
      return myData.get("broadcastFrequency");
    }
    /**
     * The type of service required to have access to the channel (e.g. Standard or Premium).
     * @param broadcastServiceTier value to set
     * @return this builder instance
     */
    @NotNull public Builder broadcastServiceTier(@NotNull String broadcastServiceTier) {
      putValue("broadcastServiceTier", broadcastServiceTier);
      return this;
    }
    /**
     * Remove broadcastServiceTier property from the builder.
     * If this property is repeatable, all instances are removed.
     * @return this builder instance
     */
    @NotNull public Builder removeBroadcastServiceTier() {
      removeValue("broadcastServiceTier");
      return this;
    }
    /**
     * Get currently set value for broadcastServiceTier property in this builder.
     * @return previously set value or {@code null}. If multiple values have been 
     * set to this property, then {@link java.util.Collection} instance will be 
     * returned.
     */
    @Nullable public java.lang.Object getBroadcastServiceTier() {
      return myData.get("broadcastServiceTier");
    }
    /**
     * The CableOrSatelliteService offering the channel.
     * @param cableOrSatelliteService value to set
     * @return this builder instance
     */
    @NotNull public Builder inBroadcastLineup(@NotNull CableOrSatelliteService cableOrSatelliteService) {
      putValue("inBroadcastLineup", cableOrSatelliteService);
      return this;
    }
    /**
     * The CableOrSatelliteService offering the channel.
     * @param cableOrSatelliteService value to set
     * @return this builder instance
     */
    @NotNull public Builder inBroadcastLineup(@NotNull CableOrSatelliteService.Builder cableOrSatelliteService) {
      putValue("inBroadcastLineup", cableOrSatelliteService.build());
      return this;
    }
    /**
     * Remove inBroadcastLineup property from the builder.
     * If this property is repeatable, all instances are removed.
     * @return this builder instance
     */
    @NotNull public Builder removeInBroadcastLineup() {
      removeValue("inBroadcastLineup");
      return this;
    }
    /**
     * Get currently set value for inBroadcastLineup property in this builder.
     * @return previously set value or {@code null}. If multiple values have been 
     * set to this property, then {@link java.util.Collection} instance will be 
     * returned.
     */
    @Nullable public java.lang.Object getInBroadcastLineup() {
      return myData.get("inBroadcastLineup");
    }
    /**
     * The BroadcastService offered on this channel.
     * @param broadcastService value to set
     * @return this builder instance
     */
    @NotNull public Builder providesBroadcastService(@NotNull BroadcastService broadcastService) {
      putValue("providesBroadcastService", broadcastService);
      return this;
    }
    /**
     * The BroadcastService offered on this channel.
     * @param broadcastService value to set
     * @return this builder instance
     */
    @NotNull public Builder providesBroadcastService(@NotNull BroadcastService.Builder broadcastService) {
      putValue("providesBroadcastService", broadcastService.build());
      return this;
    }
    /**
     * Remove providesBroadcastService property from the builder.
     * If this property is repeatable, all instances are removed.
     * @return this builder instance
     */
    @NotNull public Builder removeProvidesBroadcastService() {
      removeValue("providesBroadcastService");
      return this;
    }
    /**
     * Get currently set value for providesBroadcastService property in this builder.
     * @return previously set value or {@code null}. If multiple values have been 
     * set to this property, then {@link java.util.Collection} instance will be 
     * returned.
     */
    @Nullable public java.lang.Object getProvidesBroadcastService() {
      return myData.get("providesBroadcastService");
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
      if ("genre".equals(key) && value instanceof Genre) { this.genre((Genre)value); return; }
      if ("genres".equals(key) && value instanceof Genre) { this.genre((Genre)value); return; }
      if ("broadcastChannelId".equals(key) && value instanceof String) { this.broadcastChannelId((String)value); return; }
      if ("broadcastChannelIds".equals(key) && value instanceof String) { this.broadcastChannelId((String)value); return; }
      if ("broadcastFrequency".equals(key) && value instanceof BroadcastFrequencySpecification) { this.broadcastFrequency((BroadcastFrequencySpecification)value); return; }
      if ("broadcastFrequencys".equals(key) && value instanceof BroadcastFrequencySpecification) { this.broadcastFrequency((BroadcastFrequencySpecification)value); return; }
      if ("broadcastFrequency".equals(key) && value instanceof String) { this.broadcastFrequency((String)value); return; }
      if ("broadcastFrequencys".equals(key) && value instanceof String) { this.broadcastFrequency((String)value); return; }
      if ("broadcastServiceTier".equals(key) && value instanceof String) { this.broadcastServiceTier((String)value); return; }
      if ("broadcastServiceTiers".equals(key) && value instanceof String) { this.broadcastServiceTier((String)value); return; }
      if ("inBroadcastLineup".equals(key) && value instanceof CableOrSatelliteService) { this.inBroadcastLineup((CableOrSatelliteService)value); return; }
      if ("inBroadcastLineups".equals(key) && value instanceof CableOrSatelliteService) { this.inBroadcastLineup((CableOrSatelliteService)value); return; }
      if ("providesBroadcastService".equals(key) && value instanceof BroadcastService) { this.providesBroadcastService((BroadcastService)value); return; }
      if ("providesBroadcastServices".equals(key) && value instanceof BroadcastService) { this.providesBroadcastService((BroadcastService)value); return; }
      super.fromMap(key, value);
    }
  }
  
}
