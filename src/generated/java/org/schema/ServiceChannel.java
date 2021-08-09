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
 * A means for accessing a service, e.g. a government office location, web site, or phone number.
 */
public class ServiceChannel extends Intangible {
  /**
   * The service provided by this channel.
   * @return providesService property set by first invocation of providesService method or {@code null}.
   */
  @JsonIgnore public Service getProvidesService() {
    return (Service) getValue("providesService");
  }
  /**
   * The service provided by this channel.
   * @return all providesService properties as {@link java.util.Collection} or an empty collection 
   * if providesService was not set.
   */
  @JsonIgnore public java.util.Collection<Service> getProvidesServices() {
    final java.lang.Object current = myData.get("providesService");
    if (current == null) return Collections.emptyList();
    if (current instanceof java.util.Collection) {
      return (java.util.Collection<Service>) current;
    }
    return Arrays.asList((Service) current);
  }
  /**
   * Estimated processing time for the service using this channel.
   * @return processingTime property set by first invocation of processingTime method or {@code null}.
   */
  @JsonIgnore public Duration getProcessingTime() {
    return (Duration) getValue("processingTime");
  }
  /**
   * Estimated processing time for the service using this channel.
   * @return all processingTime properties as {@link java.util.Collection} or an empty collection 
   * if processingTime was not set.
   */
  @JsonIgnore public java.util.Collection<Duration> getProcessingTimes() {
    final java.lang.Object current = myData.get("processingTime");
    if (current == null) return Collections.emptyList();
    if (current instanceof java.util.Collection) {
      return (java.util.Collection<Duration>) current;
    }
    return Arrays.asList((Duration) current);
  }
  /**
   * The website to access the service.
   * @return serviceUrl property set by first invocation of serviceUrl method or {@code null}.
   */
  @JsonIgnore public String getServiceUrl() {
    return (String) getValue("serviceUrl");
  }
  /**
   * The website to access the service.
   * @return all serviceUrl properties as {@link java.util.Collection} or an empty collection 
   * if serviceUrl was not set.
   */
  @JsonIgnore public java.util.Collection<String> getServiceUrls() {
    final java.lang.Object current = myData.get("serviceUrl");
    if (current == null) return Collections.emptyList();
    if (current instanceof java.util.Collection) {
      return (java.util.Collection<String>) current;
    }
    return Arrays.asList((String) current);
  }
  /**
   * The number to access the service by text message.
   * @return serviceSmsNumber property set by first invocation of serviceSmsNumber method or {@code null}.
   */
  @JsonIgnore public ContactPoint getServiceSmsNumber() {
    return (ContactPoint) getValue("serviceSmsNumber");
  }
  /**
   * The number to access the service by text message.
   * @return all serviceSmsNumber properties as {@link java.util.Collection} or an empty collection 
   * if serviceSmsNumber was not set.
   */
  @JsonIgnore public java.util.Collection<ContactPoint> getServiceSmsNumbers() {
    final java.lang.Object current = myData.get("serviceSmsNumber");
    if (current == null) return Collections.emptyList();
    if (current instanceof java.util.Collection) {
      return (java.util.Collection<ContactPoint>) current;
    }
    return Arrays.asList((ContactPoint) current);
  }
  /**
   * The address for accessing the service by mail.
   * @return servicePostalAddress property set by first invocation of servicePostalAddress method or {@code null}.
   */
  @JsonIgnore public PostalAddress getServicePostalAddress() {
    return (PostalAddress) getValue("servicePostalAddress");
  }
  /**
   * The address for accessing the service by mail.
   * @return all servicePostalAddress properties as {@link java.util.Collection} or an empty collection 
   * if servicePostalAddress was not set.
   */
  @JsonIgnore public java.util.Collection<PostalAddress> getServicePostalAddresss() {
    final java.lang.Object current = myData.get("servicePostalAddress");
    if (current == null) return Collections.emptyList();
    if (current instanceof java.util.Collection) {
      return (java.util.Collection<PostalAddress>) current;
    }
    return Arrays.asList((PostalAddress) current);
  }
  /**
   * A language someone may use with or at the item, service or place. Please use one of the language codes from the [IETF BCP 47 standard](http://tools.ietf.org/html/bcp47). See also [[inLanguage]]
   * @return availableLanguage property set by first invocation of availableLanguage method or {@code null}.
   */
  @JsonIgnore public Language getAvailableLanguageLanguage() {
    return (Language) getValue("availableLanguage");
  }
  /**
   * A language someone may use with or at the item, service or place. Please use one of the language codes from the [IETF BCP 47 standard](http://tools.ietf.org/html/bcp47). See also [[inLanguage]]
   * @return all availableLanguage properties as {@link java.util.Collection} or an empty collection 
   * if availableLanguage was not set.
   */
  @JsonIgnore public java.util.Collection<Language> getAvailableLanguageLanguages() {
    final java.lang.Object current = myData.get("availableLanguage");
    if (current == null) return Collections.emptyList();
    if (current instanceof java.util.Collection) {
      return (java.util.Collection<Language>) current;
    }
    return Arrays.asList((Language) current);
  }
  /**
   * A language someone may use with or at the item, service or place. Please use one of the language codes from the [IETF BCP 47 standard](http://tools.ietf.org/html/bcp47). See also [[inLanguage]]
   * @return availableLanguage property set by first invocation of availableLanguage method or {@code null}.
   */
  @JsonIgnore public String getAvailableLanguageString() {
    return (String) getValue("availableLanguage");
  }
  /**
   * A language someone may use with or at the item, service or place. Please use one of the language codes from the [IETF BCP 47 standard](http://tools.ietf.org/html/bcp47). See also [[inLanguage]]
   * @return all availableLanguage properties as {@link java.util.Collection} or an empty collection 
   * if availableLanguage was not set.
   */
  @JsonIgnore public java.util.Collection<String> getAvailableLanguageStrings() {
    final java.lang.Object current = myData.get("availableLanguage");
    if (current == null) return Collections.emptyList();
    if (current instanceof java.util.Collection) {
      return (java.util.Collection<String>) current;
    }
    return Arrays.asList((String) current);
  }
  /**
   * The phone number to use to access the service.
   * @return servicePhone property set by first invocation of servicePhone method or {@code null}.
   */
  @JsonIgnore public ContactPoint getServicePhone() {
    return (ContactPoint) getValue("servicePhone");
  }
  /**
   * The phone number to use to access the service.
   * @return all servicePhone properties as {@link java.util.Collection} or an empty collection 
   * if servicePhone was not set.
   */
  @JsonIgnore public java.util.Collection<ContactPoint> getServicePhones() {
    final java.lang.Object current = myData.get("servicePhone");
    if (current == null) return Collections.emptyList();
    if (current instanceof java.util.Collection) {
      return (java.util.Collection<ContactPoint>) current;
    }
    return Arrays.asList((ContactPoint) current);
  }
  /**
   * The location (e.g. civic structure, local business, etc.) where a person can go to access the service.
   * @return serviceLocation property set by first invocation of serviceLocation method or {@code null}.
   */
  @JsonIgnore public Place getServiceLocation() {
    return (Place) getValue("serviceLocation");
  }
  /**
   * The location (e.g. civic structure, local business, etc.) where a person can go to access the service.
   * @return all serviceLocation properties as {@link java.util.Collection} or an empty collection 
   * if serviceLocation was not set.
   */
  @JsonIgnore public java.util.Collection<Place> getServiceLocations() {
    final java.lang.Object current = myData.get("serviceLocation");
    if (current == null) return Collections.emptyList();
    if (current instanceof java.util.Collection) {
      return (java.util.Collection<Place>) current;
    }
    return Arrays.asList((Place) current);
  }
  protected ServiceChannel(java.util.Map<String,java.lang.Object> data) {
    super(data);
  }
  /**
   * @return new {@link Builder} initialized with this instance's data
   */
  @NotNull public Builder toBuilder() {
    return new Builder(new HashMap<>(this.myData));
  }
  
  /**
   * Builder for {@link ServiceChannel}
   */
  public static class Builder extends Intangible.Builder {
    public Builder(@NotNull HashMap<String,java.lang.Object> data) {
      super(data);
    }
    @NotNull public ServiceChannel build() {
      return new ServiceChannel(myData);
    }
    /**
     * The service provided by this channel.
     * @param service value to set
     * @return this builder instance
     */
    @NotNull public Builder providesService(@NotNull Service service) {
      putValue("providesService", service);
      return this;
    }
    /**
     * The service provided by this channel.
     * @param service value to set
     * @return this builder instance
     */
    @NotNull public Builder providesService(@NotNull Service.Builder service) {
      putValue("providesService", service.build());
      return this;
    }
    /**
     * Remove providesService property from the builder.
     * If this property is repeatable, all instances are removed.
     * @return this builder instance
     */
    @NotNull public Builder removeProvidesService() {
      removeValue("providesService");
      return this;
    }
    /**
     * Get currently set value for providesService property in this builder.
     * @return previously set value or {@code null}. If multiple values have been 
     * set to this property, then {@link java.util.Collection} instance will be 
     * returned.
     */
    @Nullable public java.lang.Object getProvidesService() {
      return myData.get("providesService");
    }
    /**
     * Estimated processing time for the service using this channel.
     * @param duration value to set
     * @return this builder instance
     */
    @NotNull public Builder processingTime(@NotNull Duration duration) {
      putValue("processingTime", duration);
      return this;
    }
    /**
     * Remove processingTime property from the builder.
     * If this property is repeatable, all instances are removed.
     * @return this builder instance
     */
    @NotNull public Builder removeProcessingTime() {
      removeValue("processingTime");
      return this;
    }
    /**
     * Get currently set value for processingTime property in this builder.
     * @return previously set value or {@code null}. If multiple values have been 
     * set to this property, then {@link java.util.Collection} instance will be 
     * returned.
     */
    @Nullable public java.lang.Object getProcessingTime() {
      return myData.get("processingTime");
    }
    /**
     * The website to access the service.
     * @param serviceUrl value to set
     * @return this builder instance
     */
    @NotNull public Builder serviceUrl(@NotNull String serviceUrl) {
      putValue("serviceUrl", serviceUrl);
      return this;
    }
    /**
     * Remove serviceUrl property from the builder.
     * If this property is repeatable, all instances are removed.
     * @return this builder instance
     */
    @NotNull public Builder removeServiceUrl() {
      removeValue("serviceUrl");
      return this;
    }
    /**
     * Get currently set value for serviceUrl property in this builder.
     * @return previously set value or {@code null}. If multiple values have been 
     * set to this property, then {@link java.util.Collection} instance will be 
     * returned.
     */
    @Nullable public java.lang.Object getServiceUrl() {
      return myData.get("serviceUrl");
    }
    /**
     * The number to access the service by text message.
     * @param contactPoint value to set
     * @return this builder instance
     */
    @NotNull public Builder serviceSmsNumber(@NotNull ContactPoint contactPoint) {
      putValue("serviceSmsNumber", contactPoint);
      return this;
    }
    /**
     * The number to access the service by text message.
     * @param contactPoint value to set
     * @return this builder instance
     */
    @NotNull public Builder serviceSmsNumber(@NotNull ContactPoint.Builder contactPoint) {
      putValue("serviceSmsNumber", contactPoint.build());
      return this;
    }
    /**
     * Remove serviceSmsNumber property from the builder.
     * If this property is repeatable, all instances are removed.
     * @return this builder instance
     */
    @NotNull public Builder removeServiceSmsNumber() {
      removeValue("serviceSmsNumber");
      return this;
    }
    /**
     * Get currently set value for serviceSmsNumber property in this builder.
     * @return previously set value or {@code null}. If multiple values have been 
     * set to this property, then {@link java.util.Collection} instance will be 
     * returned.
     */
    @Nullable public java.lang.Object getServiceSmsNumber() {
      return myData.get("serviceSmsNumber");
    }
    /**
     * The address for accessing the service by mail.
     * @param postalAddress value to set
     * @return this builder instance
     */
    @NotNull public Builder servicePostalAddress(@NotNull PostalAddress postalAddress) {
      putValue("servicePostalAddress", postalAddress);
      return this;
    }
    /**
     * The address for accessing the service by mail.
     * @param postalAddress value to set
     * @return this builder instance
     */
    @NotNull public Builder servicePostalAddress(@NotNull PostalAddress.Builder postalAddress) {
      putValue("servicePostalAddress", postalAddress.build());
      return this;
    }
    /**
     * Remove servicePostalAddress property from the builder.
     * If this property is repeatable, all instances are removed.
     * @return this builder instance
     */
    @NotNull public Builder removeServicePostalAddress() {
      removeValue("servicePostalAddress");
      return this;
    }
    /**
     * Get currently set value for servicePostalAddress property in this builder.
     * @return previously set value or {@code null}. If multiple values have been 
     * set to this property, then {@link java.util.Collection} instance will be 
     * returned.
     */
    @Nullable public java.lang.Object getServicePostalAddress() {
      return myData.get("servicePostalAddress");
    }
    /**
     * A language someone may use with or at the item, service or place. Please use one of the language codes from the [IETF BCP 47 standard](http://tools.ietf.org/html/bcp47). See also [[inLanguage]]
     * @param language value to set
     * @return this builder instance
     */
    @NotNull public Builder availableLanguage(@NotNull Language language) {
      putValue("availableLanguage", language);
      return this;
    }
    /**
     * A language someone may use with or at the item, service or place. Please use one of the language codes from the [IETF BCP 47 standard](http://tools.ietf.org/html/bcp47). See also [[inLanguage]]
     * @param language value to set
     * @return this builder instance
     */
    @NotNull public Builder availableLanguage(@NotNull Language.Builder language) {
      putValue("availableLanguage", language.build());
      return this;
    }
    /**
     * A language someone may use with or at the item, service or place. Please use one of the language codes from the [IETF BCP 47 standard](http://tools.ietf.org/html/bcp47). See also [[inLanguage]]
     * @param availableLanguage value to set
     * @return this builder instance
     */
    @NotNull public Builder availableLanguage(@NotNull String availableLanguage) {
      putValue("availableLanguage", availableLanguage);
      return this;
    }
    /**
     * Remove availableLanguage property from the builder.
     * If this property is repeatable, all instances are removed.
     * @return this builder instance
     */
    @NotNull public Builder removeAvailableLanguage() {
      removeValue("availableLanguage");
      return this;
    }
    /**
     * Get currently set value for availableLanguage property in this builder.
     * @return previously set value or {@code null}. If multiple values have been 
     * set to this property, then {@link java.util.Collection} instance will be 
     * returned.
     */
    @Nullable public java.lang.Object getAvailableLanguage() {
      return myData.get("availableLanguage");
    }
    /**
     * The phone number to use to access the service.
     * @param contactPoint value to set
     * @return this builder instance
     */
    @NotNull public Builder servicePhone(@NotNull ContactPoint contactPoint) {
      putValue("servicePhone", contactPoint);
      return this;
    }
    /**
     * The phone number to use to access the service.
     * @param contactPoint value to set
     * @return this builder instance
     */
    @NotNull public Builder servicePhone(@NotNull ContactPoint.Builder contactPoint) {
      putValue("servicePhone", contactPoint.build());
      return this;
    }
    /**
     * Remove servicePhone property from the builder.
     * If this property is repeatable, all instances are removed.
     * @return this builder instance
     */
    @NotNull public Builder removeServicePhone() {
      removeValue("servicePhone");
      return this;
    }
    /**
     * Get currently set value for servicePhone property in this builder.
     * @return previously set value or {@code null}. If multiple values have been 
     * set to this property, then {@link java.util.Collection} instance will be 
     * returned.
     */
    @Nullable public java.lang.Object getServicePhone() {
      return myData.get("servicePhone");
    }
    /**
     * The location (e.g. civic structure, local business, etc.) where a person can go to access the service.
     * @param place value to set
     * @return this builder instance
     */
    @NotNull public Builder serviceLocation(@NotNull Place place) {
      putValue("serviceLocation", place);
      return this;
    }
    /**
     * The location (e.g. civic structure, local business, etc.) where a person can go to access the service.
     * @param place value to set
     * @return this builder instance
     */
    @NotNull public Builder serviceLocation(@NotNull Place.Builder place) {
      putValue("serviceLocation", place.build());
      return this;
    }
    /**
     * Remove serviceLocation property from the builder.
     * If this property is repeatable, all instances are removed.
     * @return this builder instance
     */
    @NotNull public Builder removeServiceLocation() {
      removeValue("serviceLocation");
      return this;
    }
    /**
     * Get currently set value for serviceLocation property in this builder.
     * @return previously set value or {@code null}. If multiple values have been 
     * set to this property, then {@link java.util.Collection} instance will be 
     * returned.
     */
    @Nullable public java.lang.Object getServiceLocation() {
      return myData.get("serviceLocation");
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
      if ("providesService".equals(key) && value instanceof Service) { this.providesService((Service)value); return; }
      if ("providesServices".equals(key) && value instanceof Service) { this.providesService((Service)value); return; }
      if ("processingTime".equals(key) && value instanceof Duration) { this.processingTime((Duration)value); return; }
      if ("processingTimes".equals(key) && value instanceof Duration) { this.processingTime((Duration)value); return; }
      if ("serviceUrl".equals(key) && value instanceof String) { this.serviceUrl((String)value); return; }
      if ("serviceUrls".equals(key) && value instanceof String) { this.serviceUrl((String)value); return; }
      if ("serviceSmsNumber".equals(key) && value instanceof ContactPoint) { this.serviceSmsNumber((ContactPoint)value); return; }
      if ("serviceSmsNumbers".equals(key) && value instanceof ContactPoint) { this.serviceSmsNumber((ContactPoint)value); return; }
      if ("servicePostalAddress".equals(key) && value instanceof PostalAddress) { this.servicePostalAddress((PostalAddress)value); return; }
      if ("servicePostalAddresss".equals(key) && value instanceof PostalAddress) { this.servicePostalAddress((PostalAddress)value); return; }
      if ("availableLanguage".equals(key) && value instanceof Language) { this.availableLanguage((Language)value); return; }
      if ("availableLanguages".equals(key) && value instanceof Language) { this.availableLanguage((Language)value); return; }
      if ("availableLanguage".equals(key) && value instanceof String) { this.availableLanguage((String)value); return; }
      if ("availableLanguages".equals(key) && value instanceof String) { this.availableLanguage((String)value); return; }
      if ("servicePhone".equals(key) && value instanceof ContactPoint) { this.servicePhone((ContactPoint)value); return; }
      if ("servicePhones".equals(key) && value instanceof ContactPoint) { this.servicePhone((ContactPoint)value); return; }
      if ("serviceLocation".equals(key) && value instanceof Place) { this.serviceLocation((Place)value); return; }
      if ("serviceLocations".equals(key) && value instanceof Place) { this.serviceLocation((Place)value); return; }
      super.fromMap(key, value);
    }
  }
  
}
