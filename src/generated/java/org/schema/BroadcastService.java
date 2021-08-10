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
 * A delivery service through which content is provided via broadcast over the air or online.
 */
public class BroadcastService extends Service {
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
   * A [callsign](https://en.wikipedia.org/wiki/Call_sign), as used in broadcasting and radio communications to identify people, radio and TV stations, or vehicles.
   * @return callSign property set by first invocation of callSign method or {@code null}.
   */
  @JsonIgnore public Identifier getCallSign() {
    return (Identifier) getValue("callSign");
  }
  /**
   * A [callsign](https://en.wikipedia.org/wiki/Call_sign), as used in broadcasting and radio communications to identify people, radio and TV stations, or vehicles.
   * @return all callSign properties as {@link java.util.Collection} or an empty collection 
   * if callSign was not set.
   */
  @JsonIgnore public java.util.Collection<Identifier> getCallSigns() {
    final java.lang.Object current = myData.get("callSign");
    if (current == null) return Collections.emptyList();
    if (current instanceof java.util.Collection) {
      return (java.util.Collection<Identifier>) current;
    }
    return Arrays.asList((Identifier) current);
  }
  /**
   * A broadcast service to which the broadcast service may belong to such as regional variations of a national channel.
   * @return parentService property set by first invocation of parentService method or {@code null}.
   */
  @JsonIgnore public BroadcastService getParentService() {
    return (BroadcastService) getValue("parentService");
  }
  /**
   * A broadcast service to which the broadcast service may belong to such as regional variations of a national channel.
   * @return all parentService properties as {@link java.util.Collection} or an empty collection 
   * if parentService was not set.
   */
  @JsonIgnore public java.util.Collection<BroadcastService> getParentServices() {
    final java.lang.Object current = myData.get("parentService");
    if (current == null) return Collections.emptyList();
    if (current instanceof java.util.Collection) {
      return (java.util.Collection<BroadcastService>) current;
    }
    return Arrays.asList((BroadcastService) current);
  }
  /**
   * The name displayed in the channel guide. For many US affiliates, it is the network name.
   * @return broadcastDisplayName property set by first invocation of broadcastDisplayName method or {@code null}.
   */
  @JsonIgnore public String getBroadcastDisplayName() {
    return (String) getValue("broadcastDisplayName");
  }
  /**
   * The name displayed in the channel guide. For many US affiliates, it is the network name.
   * @return all broadcastDisplayName properties as {@link java.util.Collection} or an empty collection 
   * if broadcastDisplayName was not set.
   */
  @JsonIgnore public java.util.Collection<String> getBroadcastDisplayNames() {
    final java.lang.Object current = myData.get("broadcastDisplayName");
    if (current == null) return Collections.emptyList();
    if (current instanceof java.util.Collection) {
      return (java.util.Collection<String>) current;
    }
    return Arrays.asList((String) current);
  }
  /**
   * The media network(s) whose content is broadcast on this station.
   * @return broadcastAffiliateOf property set by first invocation of broadcastAffiliateOf method or {@code null}.
   */
  @JsonIgnore public Organization getBroadcastAffiliateOf() {
    return (Organization) getValue("broadcastAffiliateOf");
  }
  /**
   * The media network(s) whose content is broadcast on this station.
   * @return all broadcastAffiliateOf properties as {@link java.util.Collection} or an empty collection 
   * if broadcastAffiliateOf was not set.
   */
  @JsonIgnore public java.util.Collection<Organization> getBroadcastAffiliateOfs() {
    final java.lang.Object current = myData.get("broadcastAffiliateOf");
    if (current == null) return Collections.emptyList();
    if (current instanceof java.util.Collection) {
      return (java.util.Collection<Organization>) current;
    }
    return Arrays.asList((Organization) current);
  }
  /**
   * The organization owning or operating the broadcast service.
   * @return broadcaster property set by first invocation of broadcaster method or {@code null}.
   */
  @JsonIgnore public Organization getBroadcaster() {
    return (Organization) getValue("broadcaster");
  }
  /**
   * The organization owning or operating the broadcast service.
   * @return all broadcaster properties as {@link java.util.Collection} or an empty collection 
   * if broadcaster was not set.
   */
  @JsonIgnore public java.util.Collection<Organization> getBroadcasters() {
    final java.lang.Object current = myData.get("broadcaster");
    if (current == null) return Collections.emptyList();
    if (current instanceof java.util.Collection) {
      return (java.util.Collection<Organization>) current;
    }
    return Arrays.asList((Organization) current);
  }
  /**
   * The timezone in [ISO 8601 format](http://en.wikipedia.org/wiki/ISO_8601) for which the service bases its broadcasts
   * @return broadcastTimezone property set by first invocation of broadcastTimezone method or {@code null}.
   */
  @JsonIgnore public String getBroadcastTimezone() {
    return (String) getValue("broadcastTimezone");
  }
  /**
   * The timezone in [ISO 8601 format](http://en.wikipedia.org/wiki/ISO_8601) for which the service bases its broadcasts
   * @return all broadcastTimezone properties as {@link java.util.Collection} or an empty collection 
   * if broadcastTimezone was not set.
   */
  @JsonIgnore public java.util.Collection<String> getBroadcastTimezones() {
    final java.lang.Object current = myData.get("broadcastTimezone");
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
   * The type of screening or video broadcast used (e.g. IMAX, 3D, SD, HD, etc.).
   * @return videoFormat property set by first invocation of videoFormat method or {@code null}.
   */
  @JsonIgnore public String getVideoFormat() {
    return (String) getValue("videoFormat");
  }
  /**
   * The type of screening or video broadcast used (e.g. IMAX, 3D, SD, HD, etc.).
   * @return all videoFormat properties as {@link java.util.Collection} or an empty collection 
   * if videoFormat was not set.
   */
  @JsonIgnore public java.util.Collection<String> getVideoFormats() {
    final java.lang.Object current = myData.get("videoFormat");
    if (current == null) return Collections.emptyList();
    if (current instanceof java.util.Collection) {
      return (java.util.Collection<String>) current;
    }
    return Arrays.asList((String) current);
  }
  /**
   * A broadcast channel of a broadcast service.
   * @return hasBroadcastChannel property set by first invocation of hasBroadcastChannel method or {@code null}.
   */
  @JsonIgnore public BroadcastChannel getHasBroadcastChannel() {
    return (BroadcastChannel) getValue("hasBroadcastChannel");
  }
  /**
   * A broadcast channel of a broadcast service.
   * @return all hasBroadcastChannel properties as {@link java.util.Collection} or an empty collection 
   * if hasBroadcastChannel was not set.
   */
  @JsonIgnore public java.util.Collection<BroadcastChannel> getHasBroadcastChannels() {
    final java.lang.Object current = myData.get("hasBroadcastChannel");
    if (current == null) return Collections.emptyList();
    if (current instanceof java.util.Collection) {
      return (java.util.Collection<BroadcastChannel>) current;
    }
    return Arrays.asList((BroadcastChannel) current);
  }
  protected BroadcastService(java.util.Map<String,java.lang.Object> data) {
    super(data);
  }
  /**
   * @return new {@link Builder} initialized with this instance's data
   */
  @NotNull public Builder toBuilder() {
    return new Builder(new HashMap<>(this.myData));
  }
  
  /**
   * Builder for {@link BroadcastService}
   */
  public static class Builder extends Service.Builder {
    public Builder(@NotNull HashMap<String,java.lang.Object> data) {
      super(data);
    }
    @NotNull public BroadcastService build() {
      return new BroadcastService(myData);
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
     * A [callsign](https://en.wikipedia.org/wiki/Call_sign), as used in broadcasting and radio communications to identify people, radio and TV stations, or vehicles.
     * @param identifier value to set
     * @return this builder instance
     */
    @NotNull public Builder callSign(@NotNull Identifier identifier) {
      putValue("callSign", identifier);
      return this;
    }
    /**
     * Remove callSign property from the builder.
     * If this property is repeatable, all instances are removed.
     * @return this builder instance
     */
    @NotNull public Builder removeCallSign() {
      removeValue("callSign");
      return this;
    }
    /**
     * Get currently set value for callSign property in this builder.
     * @return previously set value or {@code null}. If multiple values have been 
     * set to this property, then {@link java.util.Collection} instance will be 
     * returned.
     */
    @Nullable public java.lang.Object getCallSign() {
      return myData.get("callSign");
    }
    /**
     * A broadcast service to which the broadcast service may belong to such as regional variations of a national channel.
     * @param broadcastService value to set
     * @return this builder instance
     */
    @NotNull public Builder parentService(@NotNull BroadcastService broadcastService) {
      putValue("parentService", broadcastService);
      return this;
    }
    /**
     * A broadcast service to which the broadcast service may belong to such as regional variations of a national channel.
     * @param broadcastService value to set
     * @return this builder instance
     */
    @NotNull public Builder parentService(@NotNull BroadcastService.Builder broadcastService) {
      putValue("parentService", broadcastService.build());
      return this;
    }
    /**
     * Remove parentService property from the builder.
     * If this property is repeatable, all instances are removed.
     * @return this builder instance
     */
    @NotNull public Builder removeParentService() {
      removeValue("parentService");
      return this;
    }
    /**
     * Get currently set value for parentService property in this builder.
     * @return previously set value or {@code null}. If multiple values have been 
     * set to this property, then {@link java.util.Collection} instance will be 
     * returned.
     */
    @Nullable public java.lang.Object getParentService() {
      return myData.get("parentService");
    }
    /**
     * The name displayed in the channel guide. For many US affiliates, it is the network name.
     * @param broadcastDisplayName value to set
     * @return this builder instance
     */
    @NotNull public Builder broadcastDisplayName(@NotNull String broadcastDisplayName) {
      putValue("broadcastDisplayName", broadcastDisplayName);
      return this;
    }
    /**
     * Remove broadcastDisplayName property from the builder.
     * If this property is repeatable, all instances are removed.
     * @return this builder instance
     */
    @NotNull public Builder removeBroadcastDisplayName() {
      removeValue("broadcastDisplayName");
      return this;
    }
    /**
     * Get currently set value for broadcastDisplayName property in this builder.
     * @return previously set value or {@code null}. If multiple values have been 
     * set to this property, then {@link java.util.Collection} instance will be 
     * returned.
     */
    @Nullable public java.lang.Object getBroadcastDisplayName() {
      return myData.get("broadcastDisplayName");
    }
    /**
     * The media network(s) whose content is broadcast on this station.
     * @param organization value to set
     * @return this builder instance
     */
    @NotNull public Builder broadcastAffiliateOf(@NotNull Organization organization) {
      putValue("broadcastAffiliateOf", organization);
      return this;
    }
    /**
     * The media network(s) whose content is broadcast on this station.
     * @param organization value to set
     * @return this builder instance
     */
    @NotNull public Builder broadcastAffiliateOf(@NotNull Organization.Builder organization) {
      putValue("broadcastAffiliateOf", organization.build());
      return this;
    }
    /**
     * Remove broadcastAffiliateOf property from the builder.
     * If this property is repeatable, all instances are removed.
     * @return this builder instance
     */
    @NotNull public Builder removeBroadcastAffiliateOf() {
      removeValue("broadcastAffiliateOf");
      return this;
    }
    /**
     * Get currently set value for broadcastAffiliateOf property in this builder.
     * @return previously set value or {@code null}. If multiple values have been 
     * set to this property, then {@link java.util.Collection} instance will be 
     * returned.
     */
    @Nullable public java.lang.Object getBroadcastAffiliateOf() {
      return myData.get("broadcastAffiliateOf");
    }
    /**
     * The organization owning or operating the broadcast service.
     * @param organization value to set
     * @return this builder instance
     */
    @NotNull public Builder broadcaster(@NotNull Organization organization) {
      putValue("broadcaster", organization);
      return this;
    }
    /**
     * The organization owning or operating the broadcast service.
     * @param organization value to set
     * @return this builder instance
     */
    @NotNull public Builder broadcaster(@NotNull Organization.Builder organization) {
      putValue("broadcaster", organization.build());
      return this;
    }
    /**
     * Remove broadcaster property from the builder.
     * If this property is repeatable, all instances are removed.
     * @return this builder instance
     */
    @NotNull public Builder removeBroadcaster() {
      removeValue("broadcaster");
      return this;
    }
    /**
     * Get currently set value for broadcaster property in this builder.
     * @return previously set value or {@code null}. If multiple values have been 
     * set to this property, then {@link java.util.Collection} instance will be 
     * returned.
     */
    @Nullable public java.lang.Object getBroadcaster() {
      return myData.get("broadcaster");
    }
    /**
     * The timezone in [ISO 8601 format](http://en.wikipedia.org/wiki/ISO_8601) for which the service bases its broadcasts
     * @param broadcastTimezone value to set
     * @return this builder instance
     */
    @NotNull public Builder broadcastTimezone(@NotNull String broadcastTimezone) {
      putValue("broadcastTimezone", broadcastTimezone);
      return this;
    }
    /**
     * Remove broadcastTimezone property from the builder.
     * If this property is repeatable, all instances are removed.
     * @return this builder instance
     */
    @NotNull public Builder removeBroadcastTimezone() {
      removeValue("broadcastTimezone");
      return this;
    }
    /**
     * Get currently set value for broadcastTimezone property in this builder.
     * @return previously set value or {@code null}. If multiple values have been 
     * set to this property, then {@link java.util.Collection} instance will be 
     * returned.
     */
    @Nullable public java.lang.Object getBroadcastTimezone() {
      return myData.get("broadcastTimezone");
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
     * The type of screening or video broadcast used (e.g. IMAX, 3D, SD, HD, etc.).
     * @param videoFormat value to set
     * @return this builder instance
     */
    @NotNull public Builder videoFormat(@NotNull String videoFormat) {
      putValue("videoFormat", videoFormat);
      return this;
    }
    /**
     * Remove videoFormat property from the builder.
     * If this property is repeatable, all instances are removed.
     * @return this builder instance
     */
    @NotNull public Builder removeVideoFormat() {
      removeValue("videoFormat");
      return this;
    }
    /**
     * Get currently set value for videoFormat property in this builder.
     * @return previously set value or {@code null}. If multiple values have been 
     * set to this property, then {@link java.util.Collection} instance will be 
     * returned.
     */
    @Nullable public java.lang.Object getVideoFormat() {
      return myData.get("videoFormat");
    }
    /**
     * A broadcast channel of a broadcast service.
     * @param broadcastChannel value to set
     * @return this builder instance
     */
    @NotNull public Builder hasBroadcastChannel(@NotNull BroadcastChannel broadcastChannel) {
      putValue("hasBroadcastChannel", broadcastChannel);
      return this;
    }
    /**
     * A broadcast channel of a broadcast service.
     * @param broadcastChannel value to set
     * @return this builder instance
     */
    @NotNull public Builder hasBroadcastChannel(@NotNull BroadcastChannel.Builder broadcastChannel) {
      putValue("hasBroadcastChannel", broadcastChannel.build());
      return this;
    }
    /**
     * Remove hasBroadcastChannel property from the builder.
     * If this property is repeatable, all instances are removed.
     * @return this builder instance
     */
    @NotNull public Builder removeHasBroadcastChannel() {
      removeValue("hasBroadcastChannel");
      return this;
    }
    /**
     * Get currently set value for hasBroadcastChannel property in this builder.
     * @return previously set value or {@code null}. If multiple values have been 
     * set to this property, then {@link java.util.Collection} instance will be 
     * returned.
     */
    @Nullable public java.lang.Object getHasBroadcastChannel() {
      return myData.get("hasBroadcastChannel");
    }
    /**
     * The service provider, service operator, or service performer; the goods producer. Another party (a seller) may offer those services or goods on behalf of the provider. A provider may also serve as the seller.
     * @param organization value to set
     * @return this builder instance
     */
    @NotNull public Builder provider(@NotNull Organization organization) {
      putValue("provider", organization);
      return this;
    }
    /**
     * The service provider, service operator, or service performer; the goods producer. Another party (a seller) may offer those services or goods on behalf of the provider. A provider may also serve as the seller.
     * @param organization value to set
     * @return this builder instance
     */
    @NotNull public Builder provider(@NotNull Organization.Builder organization) {
      putValue("provider", organization.build());
      return this;
    }
    /**
     * The service provider, service operator, or service performer; the goods producer. Another party (a seller) may offer those services or goods on behalf of the provider. A provider may also serve as the seller.
     * @param person value to set
     * @return this builder instance
     */
    @NotNull public Builder provider(@NotNull Person person) {
      putValue("provider", person);
      return this;
    }
    /**
     * The service provider, service operator, or service performer; the goods producer. Another party (a seller) may offer those services or goods on behalf of the provider. A provider may also serve as the seller.
     * @param person value to set
     * @return this builder instance
     */
    @NotNull public Builder provider(@NotNull Person.Builder person) {
      putValue("provider", person.build());
      return this;
    }
    /**
     * Remove provider property from the builder.
     * If this property is repeatable, all instances are removed.
     * @return this builder instance
     */
    @NotNull public Builder removeProvider() {
      removeValue("provider");
      return this;
    }
    /**
     * Get currently set value for provider property in this builder.
     * @return previously set value or {@code null}. If multiple values have been 
     * set to this property, then {@link java.util.Collection} instance will be 
     * returned.
     */
    @Nullable public java.lang.Object getProvider() {
      return myData.get("provider");
    }
    /**
     * A means of accessing the service (e.g. a phone bank, a web site, a location, etc.).
     * @param serviceChannel value to set
     * @return this builder instance
     */
    @NotNull public Builder availableChannel(@NotNull ServiceChannel serviceChannel) {
      putValue("availableChannel", serviceChannel);
      return this;
    }
    /**
     * A means of accessing the service (e.g. a phone bank, a web site, a location, etc.).
     * @param serviceChannel value to set
     * @return this builder instance
     */
    @NotNull public Builder availableChannel(@NotNull ServiceChannel.Builder serviceChannel) {
      putValue("availableChannel", serviceChannel.build());
      return this;
    }
    /**
     * Remove availableChannel property from the builder.
     * If this property is repeatable, all instances are removed.
     * @return this builder instance
     */
    @NotNull public Builder removeAvailableChannel() {
      removeValue("availableChannel");
      return this;
    }
    /**
     * Get currently set value for availableChannel property in this builder.
     * @return previously set value or {@code null}. If multiple values have been 
     * set to this property, then {@link java.util.Collection} instance will be 
     * returned.
     */
    @Nullable public java.lang.Object getAvailableChannel() {
      return myData.get("availableChannel");
    }
    /**
     * The tangible thing generated by the service, e.g. a passport, permit, etc.
     * @param thing value to set
     * @return this builder instance
     */
    @NotNull public Builder serviceOutput(@NotNull Thing thing) {
      putValue("serviceOutput", thing);
      return this;
    }
    /**
     * The tangible thing generated by the service, e.g. a passport, permit, etc.
     * @param thing value to set
     * @return this builder instance
     */
    @NotNull public Builder serviceOutput(@NotNull Thing.Builder thing) {
      putValue("serviceOutput", thing.build());
      return this;
    }
    /**
     * Remove serviceOutput property from the builder.
     * If this property is repeatable, all instances are removed.
     * @return this builder instance
     */
    @NotNull public Builder removeServiceOutput() {
      removeValue("serviceOutput");
      return this;
    }
    /**
     * Get currently set value for serviceOutput property in this builder.
     * @return previously set value or {@code null}. If multiple values have been 
     * set to this property, then {@link java.util.Collection} instance will be 
     * returned.
     */
    @Nullable public java.lang.Object getServiceOutput() {
      return myData.get("serviceOutput");
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
     * An associated logo.
     * @param image value to set
     * @return this builder instance
     */
    @NotNull public Builder logo(@NotNull Image image) {
      putValue("logo", image);
      return this;
    }
    /**
     * Remove logo property from the builder.
     * If this property is repeatable, all instances are removed.
     * @return this builder instance
     */
    @NotNull public Builder removeLogo() {
      removeValue("logo");
      return this;
    }
    /**
     * Get currently set value for logo property in this builder.
     * @return previously set value or {@code null}. If multiple values have been 
     * set to this property, then {@link java.util.Collection} instance will be 
     * returned.
     */
    @Nullable public java.lang.Object getLogo() {
      return myData.get("logo");
    }
    /**
     * A pointer to another, functionally similar product (or multiple products).
     * @param product value to set
     * @return this builder instance
     */
    @NotNull public Builder isSimilarTo(@NotNull Product product) {
      putValue("isSimilarTo", product);
      return this;
    }
    /**
     * A pointer to another, functionally similar product (or multiple products).
     * @param product value to set
     * @return this builder instance
     */
    @NotNull public Builder isSimilarTo(@NotNull Product.Builder product) {
      putValue("isSimilarTo", product.build());
      return this;
    }
    /**
     * A pointer to another, functionally similar product (or multiple products).
     * @param service value to set
     * @return this builder instance
     */
    @NotNull public Builder isSimilarTo(@NotNull Service service) {
      putValue("isSimilarTo", service);
      return this;
    }
    /**
     * A pointer to another, functionally similar product (or multiple products).
     * @param service value to set
     * @return this builder instance
     */
    @NotNull public Builder isSimilarTo(@NotNull Service.Builder service) {
      putValue("isSimilarTo", service.build());
      return this;
    }
    /**
     * Remove isSimilarTo property from the builder.
     * If this property is repeatable, all instances are removed.
     * @return this builder instance
     */
    @NotNull public Builder removeIsSimilarTo() {
      removeValue("isSimilarTo");
      return this;
    }
    /**
     * Get currently set value for isSimilarTo property in this builder.
     * @return previously set value or {@code null}. If multiple values have been 
     * set to this property, then {@link java.util.Collection} instance will be 
     * returned.
     */
    @Nullable public java.lang.Object getIsSimilarTo() {
      return myData.get("isSimilarTo");
    }
    /**
     * A pointer to another, somehow related product (or multiple products).
     * @param product value to set
     * @return this builder instance
     */
    @NotNull public Builder isRelatedTo(@NotNull Product product) {
      putValue("isRelatedTo", product);
      return this;
    }
    /**
     * A pointer to another, somehow related product (or multiple products).
     * @param product value to set
     * @return this builder instance
     */
    @NotNull public Builder isRelatedTo(@NotNull Product.Builder product) {
      putValue("isRelatedTo", product.build());
      return this;
    }
    /**
     * A pointer to another, somehow related product (or multiple products).
     * @param service value to set
     * @return this builder instance
     */
    @NotNull public Builder isRelatedTo(@NotNull Service service) {
      putValue("isRelatedTo", service);
      return this;
    }
    /**
     * A pointer to another, somehow related product (or multiple products).
     * @param service value to set
     * @return this builder instance
     */
    @NotNull public Builder isRelatedTo(@NotNull Service.Builder service) {
      putValue("isRelatedTo", service.build());
      return this;
    }
    /**
     * Remove isRelatedTo property from the builder.
     * If this property is repeatable, all instances are removed.
     * @return this builder instance
     */
    @NotNull public Builder removeIsRelatedTo() {
      removeValue("isRelatedTo");
      return this;
    }
    /**
     * Get currently set value for isRelatedTo property in this builder.
     * @return previously set value or {@code null}. If multiple values have been 
     * set to this property, then {@link java.util.Collection} instance will be 
     * returned.
     */
    @Nullable public java.lang.Object getIsRelatedTo() {
      return myData.get("isRelatedTo");
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
     * The brand(s) associated with a product or service, or the brand(s) maintained by an organization or business person.
     * @param brand value to set
     * @return this builder instance
     */
    @NotNull public Builder brand(@NotNull Brand brand) {
      putValue("brand", brand);
      return this;
    }
    /**
     * The brand(s) associated with a product or service, or the brand(s) maintained by an organization or business person.
     * @param brand value to set
     * @return this builder instance
     */
    @NotNull public Builder brand(@NotNull Brand.Builder brand) {
      putValue("brand", brand.build());
      return this;
    }
    /**
     * The brand(s) associated with a product or service, or the brand(s) maintained by an organization or business person.
     * @param organization value to set
     * @return this builder instance
     */
    @NotNull public Builder brand(@NotNull Organization organization) {
      putValue("brand", organization);
      return this;
    }
    /**
     * The brand(s) associated with a product or service, or the brand(s) maintained by an organization or business person.
     * @param organization value to set
     * @return this builder instance
     */
    @NotNull public Builder brand(@NotNull Organization.Builder organization) {
      putValue("brand", organization.build());
      return this;
    }
    /**
     * Remove brand property from the builder.
     * If this property is repeatable, all instances are removed.
     * @return this builder instance
     */
    @NotNull public Builder removeBrand() {
      removeValue("brand");
      return this;
    }
    /**
     * Get currently set value for brand property in this builder.
     * @return previously set value or {@code null}. If multiple values have been 
     * set to this property, then {@link java.util.Collection} instance will be 
     * returned.
     */
    @Nullable public java.lang.Object getBrand() {
      return myData.get("brand");
    }
    /**
     * The geographic area where a service or offered item is provided.
     * @param areaServed value to set
     * @return this builder instance
     */
    @NotNull public Builder areaServed(@NotNull AreaServed areaServed) {
      putValue("areaServed", areaServed);
      return this;
    }
    /**
     * Remove areaServed property from the builder.
     * If this property is repeatable, all instances are removed.
     * @return this builder instance
     */
    @NotNull public Builder removeAreaServed() {
      removeValue("areaServed");
      return this;
    }
    /**
     * Get currently set value for areaServed property in this builder.
     * @return previously set value or {@code null}. If multiple values have been 
     * set to this property, then {@link java.util.Collection} instance will be 
     * returned.
     */
    @Nullable public java.lang.Object getAreaServed() {
      return myData.get("areaServed");
    }
    /**
     * A category for the item. Greater signs or slashes can be used to informally indicate a category hierarchy.
     * @param category value to set
     * @return this builder instance
     */
    @NotNull public Builder category(@NotNull Category category) {
      putValue("category", category);
      return this;
    }
    /**
     * Remove category property from the builder.
     * If this property is repeatable, all instances are removed.
     * @return this builder instance
     */
    @NotNull public Builder removeCategory() {
      removeValue("category");
      return this;
    }
    /**
     * Get currently set value for category property in this builder.
     * @return previously set value or {@code null}. If multiple values have been 
     * set to this property, then {@link java.util.Collection} instance will be 
     * returned.
     */
    @Nullable public java.lang.Object getCategory() {
      return myData.get("category");
    }
    /**
     * Human-readable terms of service documentation.
     * @param termsOfService value to set
     * @return this builder instance
     */
    @NotNull public Builder termsOfService(@NotNull String termsOfService) {
      putValue("termsOfService", termsOfService);
      return this;
    }
    /**
     * Remove termsOfService property from the builder.
     * If this property is repeatable, all instances are removed.
     * @return this builder instance
     */
    @NotNull public Builder removeTermsOfService() {
      removeValue("termsOfService");
      return this;
    }
    /**
     * Get currently set value for termsOfService property in this builder.
     * @return previously set value or {@code null}. If multiple values have been 
     * set to this property, then {@link java.util.Collection} instance will be 
     * returned.
     */
    @Nullable public java.lang.Object getTermsOfService() {
      return myData.get("termsOfService");
    }
    /**
     * Indicates an OfferCatalog listing for this Organization, Person, or Service.
     * @param offerCatalog value to set
     * @return this builder instance
     */
    @NotNull public Builder hasOfferCatalog(@NotNull OfferCatalog offerCatalog) {
      putValue("hasOfferCatalog", offerCatalog);
      return this;
    }
    /**
     * Indicates an OfferCatalog listing for this Organization, Person, or Service.
     * @param offerCatalog value to set
     * @return this builder instance
     */
    @NotNull public Builder hasOfferCatalog(@NotNull OfferCatalog.Builder offerCatalog) {
      putValue("hasOfferCatalog", offerCatalog.build());
      return this;
    }
    /**
     * Remove hasOfferCatalog property from the builder.
     * If this property is repeatable, all instances are removed.
     * @return this builder instance
     */
    @NotNull public Builder removeHasOfferCatalog() {
      removeValue("hasOfferCatalog");
      return this;
    }
    /**
     * Get currently set value for hasOfferCatalog property in this builder.
     * @return previously set value or {@code null}. If multiple values have been 
     * set to this property, then {@link java.util.Collection} instance will be 
     * returned.
     */
    @Nullable public java.lang.Object getHasOfferCatalog() {
      return myData.get("hasOfferCatalog");
    }
    /**
     * The type of service being offered, e.g. veterans' benefits, emergency relief, etc.
     * @param governmentBenefitsType value to set
     * @return this builder instance
     */
    @NotNull public Builder serviceType(@NotNull GovernmentBenefitsType governmentBenefitsType) {
      putValue("serviceType", governmentBenefitsType);
      return this;
    }
    /**
     * The type of service being offered, e.g. veterans' benefits, emergency relief, etc.
     * @param serviceType value to set
     * @return this builder instance
     */
    @NotNull public Builder serviceType(@NotNull String serviceType) {
      putValue("serviceType", serviceType);
      return this;
    }
    /**
     * Remove serviceType property from the builder.
     * If this property is repeatable, all instances are removed.
     * @return this builder instance
     */
    @NotNull public Builder removeServiceType() {
      removeValue("serviceType");
      return this;
    }
    /**
     * Get currently set value for serviceType property in this builder.
     * @return previously set value or {@code null}. If multiple values have been 
     * set to this property, then {@link java.util.Collection} instance will be 
     * returned.
     */
    @Nullable public java.lang.Object getServiceType() {
      return myData.get("serviceType");
    }
    /**
     * Indicates the mobility of a provided service (e.g. 'static', 'dynamic').
     * @param providerMobility value to set
     * @return this builder instance
     */
    @NotNull public Builder providerMobility(@NotNull String providerMobility) {
      putValue("providerMobility", providerMobility);
      return this;
    }
    /**
     * Remove providerMobility property from the builder.
     * If this property is repeatable, all instances are removed.
     * @return this builder instance
     */
    @NotNull public Builder removeProviderMobility() {
      removeValue("providerMobility");
      return this;
    }
    /**
     * Get currently set value for providerMobility property in this builder.
     * @return previously set value or {@code null}. If multiple values have been 
     * set to this property, then {@link java.util.Collection} instance will be 
     * returned.
     */
    @Nullable public java.lang.Object getProviderMobility() {
      return myData.get("providerMobility");
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
     * An award won by or for this item.
     * @param award value to set
     * @return this builder instance
     */
    @NotNull public Builder award(@NotNull String award) {
      putValue("award", award);
      return this;
    }
    /**
     * Remove award property from the builder.
     * If this property is repeatable, all instances are removed.
     * @return this builder instance
     */
    @NotNull public Builder removeAward() {
      removeValue("award");
      return this;
    }
    /**
     * Get currently set value for award property in this builder.
     * @return previously set value or {@code null}. If multiple values have been 
     * set to this property, then {@link java.util.Collection} instance will be 
     * returned.
     */
    @Nullable public java.lang.Object getAward() {
      return myData.get("award");
    }
    /**
     * The hours during which this service or contact is available.
     * @param openingHoursSpecification value to set
     * @return this builder instance
     */
    @NotNull public Builder hoursAvailable(@NotNull OpeningHoursSpecification openingHoursSpecification) {
      putValue("hoursAvailable", openingHoursSpecification);
      return this;
    }
    /**
     * The hours during which this service or contact is available.
     * @param openingHoursSpecification value to set
     * @return this builder instance
     */
    @NotNull public Builder hoursAvailable(@NotNull OpeningHoursSpecification.Builder openingHoursSpecification) {
      putValue("hoursAvailable", openingHoursSpecification.build());
      return this;
    }
    /**
     * Remove hoursAvailable property from the builder.
     * If this property is repeatable, all instances are removed.
     * @return this builder instance
     */
    @NotNull public Builder removeHoursAvailable() {
      removeValue("hoursAvailable");
      return this;
    }
    /**
     * Get currently set value for hoursAvailable property in this builder.
     * @return previously set value or {@code null}. If multiple values have been 
     * set to this property, then {@link java.util.Collection} instance will be 
     * returned.
     */
    @Nullable public java.lang.Object getHoursAvailable() {
      return myData.get("hoursAvailable");
    }
    /**
     * A slogan or motto associated with the item.
     * @param slogan value to set
     * @return this builder instance
     */
    @NotNull public Builder slogan(@NotNull String slogan) {
      putValue("slogan", slogan);
      return this;
    }
    /**
     * Remove slogan property from the builder.
     * If this property is repeatable, all instances are removed.
     * @return this builder instance
     */
    @NotNull public Builder removeSlogan() {
      removeValue("slogan");
      return this;
    }
    /**
     * Get currently set value for slogan property in this builder.
     * @return previously set value or {@code null}. If multiple values have been 
     * set to this property, then {@link java.util.Collection} instance will be 
     * returned.
     */
    @Nullable public java.lang.Object getSlogan() {
      return myData.get("slogan");
    }
    /**
     * An entity that arranges for an exchange between a buyer and a seller.  In most cases a broker never acquires or releases ownership of a product or service involved in an exchange.  If it is not clear whether an entity is a broker, seller, or buyer, the latter two terms are preferred.
     * @param organization value to set
     * @return this builder instance
     */
    @NotNull public Builder broker(@NotNull Organization organization) {
      putValue("broker", organization);
      return this;
    }
    /**
     * An entity that arranges for an exchange between a buyer and a seller.  In most cases a broker never acquires or releases ownership of a product or service involved in an exchange.  If it is not clear whether an entity is a broker, seller, or buyer, the latter two terms are preferred.
     * @param organization value to set
     * @return this builder instance
     */
    @NotNull public Builder broker(@NotNull Organization.Builder organization) {
      putValue("broker", organization.build());
      return this;
    }
    /**
     * An entity that arranges for an exchange between a buyer and a seller.  In most cases a broker never acquires or releases ownership of a product or service involved in an exchange.  If it is not clear whether an entity is a broker, seller, or buyer, the latter two terms are preferred.
     * @param person value to set
     * @return this builder instance
     */
    @NotNull public Builder broker(@NotNull Person person) {
      putValue("broker", person);
      return this;
    }
    /**
     * An entity that arranges for an exchange between a buyer and a seller.  In most cases a broker never acquires or releases ownership of a product or service involved in an exchange.  If it is not clear whether an entity is a broker, seller, or buyer, the latter two terms are preferred.
     * @param person value to set
     * @return this builder instance
     */
    @NotNull public Builder broker(@NotNull Person.Builder person) {
      putValue("broker", person.build());
      return this;
    }
    /**
     * Remove broker property from the builder.
     * If this property is repeatable, all instances are removed.
     * @return this builder instance
     */
    @NotNull public Builder removeBroker() {
      removeValue("broker");
      return this;
    }
    /**
     * Get currently set value for broker property in this builder.
     * @return previously set value or {@code null}. If multiple values have been 
     * set to this property, then {@link java.util.Collection} instance will be 
     * returned.
     */
    @Nullable public java.lang.Object getBroker() {
      return myData.get("broker");
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
      if ("inLanguage".equals(key) && value instanceof Language) { this.inLanguage((Language)value); return; }
      if ("inLanguages".equals(key) && value instanceof Language) { this.inLanguage((Language)value); return; }
      if ("inLanguage".equals(key) && value instanceof String) { this.inLanguage((String)value); return; }
      if ("inLanguages".equals(key) && value instanceof String) { this.inLanguage((String)value); return; }
      if ("callSign".equals(key) && value instanceof Identifier) { this.callSign((Identifier)value); return; }
      if ("callSigns".equals(key) && value instanceof Identifier) { this.callSign((Identifier)value); return; }
      if ("parentService".equals(key) && value instanceof BroadcastService) { this.parentService((BroadcastService)value); return; }
      if ("parentServices".equals(key) && value instanceof BroadcastService) { this.parentService((BroadcastService)value); return; }
      if ("broadcastDisplayName".equals(key) && value instanceof String) { this.broadcastDisplayName((String)value); return; }
      if ("broadcastDisplayNames".equals(key) && value instanceof String) { this.broadcastDisplayName((String)value); return; }
      if ("broadcastAffiliateOf".equals(key) && value instanceof Organization) { this.broadcastAffiliateOf((Organization)value); return; }
      if ("broadcastAffiliateOfs".equals(key) && value instanceof Organization) { this.broadcastAffiliateOf((Organization)value); return; }
      if ("broadcaster".equals(key) && value instanceof Organization) { this.broadcaster((Organization)value); return; }
      if ("broadcasters".equals(key) && value instanceof Organization) { this.broadcaster((Organization)value); return; }
      if ("broadcastTimezone".equals(key) && value instanceof String) { this.broadcastTimezone((String)value); return; }
      if ("broadcastTimezones".equals(key) && value instanceof String) { this.broadcastTimezone((String)value); return; }
      if ("broadcastFrequency".equals(key) && value instanceof BroadcastFrequencySpecification) { this.broadcastFrequency((BroadcastFrequencySpecification)value); return; }
      if ("broadcastFrequencys".equals(key) && value instanceof BroadcastFrequencySpecification) { this.broadcastFrequency((BroadcastFrequencySpecification)value); return; }
      if ("broadcastFrequency".equals(key) && value instanceof String) { this.broadcastFrequency((String)value); return; }
      if ("broadcastFrequencys".equals(key) && value instanceof String) { this.broadcastFrequency((String)value); return; }
      if ("videoFormat".equals(key) && value instanceof String) { this.videoFormat((String)value); return; }
      if ("videoFormats".equals(key) && value instanceof String) { this.videoFormat((String)value); return; }
      if ("hasBroadcastChannel".equals(key) && value instanceof BroadcastChannel) { this.hasBroadcastChannel((BroadcastChannel)value); return; }
      if ("hasBroadcastChannels".equals(key) && value instanceof BroadcastChannel) { this.hasBroadcastChannel((BroadcastChannel)value); return; }
      super.fromMap(key, value);
    }
  }
  
}
