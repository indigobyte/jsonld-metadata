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
 * A means for accessing a service, e.g. a government office location, web site, or phone number.
 */
public class ServiceChannel extends Intangible {
  /**
   * The website to access the service.
   */
  @JsonIgnore public String getServiceUrl() {
    return (String) getValue("serviceUrl");
  }
  /**
   * The website to access the service.
   */
  @JsonIgnore public Collection<String> getServiceUrls() {
    final Object current = myData.get("serviceUrl");
    if (current == null) return Collections.emptyList();
    if (current instanceof Collection) {
      return (Collection<String>) current;
    }
    return Arrays.asList((String) current);
  }
  /**
   * A language someone may use with or at the item, service or place. Please use one of the language codes from the &lt;a href=&quot;http://tools.ietf.org/html/bcp47&quot;&gt;IETF BCP 47 standard&lt;/a&gt;. See also &lt;a class=&quot;localLink&quot; href=&quot;http://schema.org/inLanguage&quot;&gt;inLanguage&lt;/a&gt;
   */
  @JsonIgnore public Language getAvailableLanguageLanguage() {
    return (Language) getValue("availableLanguage");
  }
  /**
   * A language someone may use with or at the item, service or place. Please use one of the language codes from the &lt;a href=&quot;http://tools.ietf.org/html/bcp47&quot;&gt;IETF BCP 47 standard&lt;/a&gt;. See also &lt;a class=&quot;localLink&quot; href=&quot;http://schema.org/inLanguage&quot;&gt;inLanguage&lt;/a&gt;
   */
  @JsonIgnore public Collection<Language> getAvailableLanguageLanguages() {
    final Object current = myData.get("availableLanguage");
    if (current == null) return Collections.emptyList();
    if (current instanceof Collection) {
      return (Collection<Language>) current;
    }
    return Arrays.asList((Language) current);
  }
  /**
   * A language someone may use with or at the item, service or place. Please use one of the language codes from the &lt;a href=&quot;http://tools.ietf.org/html/bcp47&quot;&gt;IETF BCP 47 standard&lt;/a&gt;. See also &lt;a class=&quot;localLink&quot; href=&quot;http://schema.org/inLanguage&quot;&gt;inLanguage&lt;/a&gt;
   */
  @JsonIgnore public String getAvailableLanguageString() {
    return (String) getValue("availableLanguage");
  }
  /**
   * A language someone may use with or at the item, service or place. Please use one of the language codes from the &lt;a href=&quot;http://tools.ietf.org/html/bcp47&quot;&gt;IETF BCP 47 standard&lt;/a&gt;. See also &lt;a class=&quot;localLink&quot; href=&quot;http://schema.org/inLanguage&quot;&gt;inLanguage&lt;/a&gt;
   */
  @JsonIgnore public Collection<String> getAvailableLanguageStrings() {
    final Object current = myData.get("availableLanguage");
    if (current == null) return Collections.emptyList();
    if (current instanceof Collection) {
      return (Collection<String>) current;
    }
    return Arrays.asList((String) current);
  }
  /**
   * Estimated processing time for the service using this channel.
   */
  @JsonIgnore public Duration getProcessingTime() {
    return (Duration) getValue("processingTime");
  }
  /**
   * Estimated processing time for the service using this channel.
   */
  @JsonIgnore public Collection<Duration> getProcessingTimes() {
    final Object current = myData.get("processingTime");
    if (current == null) return Collections.emptyList();
    if (current instanceof Collection) {
      return (Collection<Duration>) current;
    }
    return Arrays.asList((Duration) current);
  }
  /**
   * The address for accessing the service by mail.
   */
  @JsonIgnore public PostalAddress getServicePostalAddress() {
    return (PostalAddress) getValue("servicePostalAddress");
  }
  /**
   * The address for accessing the service by mail.
   */
  @JsonIgnore public Collection<PostalAddress> getServicePostalAddresss() {
    final Object current = myData.get("servicePostalAddress");
    if (current == null) return Collections.emptyList();
    if (current instanceof Collection) {
      return (Collection<PostalAddress>) current;
    }
    return Arrays.asList((PostalAddress) current);
  }
  /**
   * The service provided by this channel.
   */
  @JsonIgnore public Service getProvidesService() {
    return (Service) getValue("providesService");
  }
  /**
   * The service provided by this channel.
   */
  @JsonIgnore public Collection<Service> getProvidesServices() {
    final Object current = myData.get("providesService");
    if (current == null) return Collections.emptyList();
    if (current instanceof Collection) {
      return (Collection<Service>) current;
    }
    return Arrays.asList((Service) current);
  }
  /**
   * The phone number to use to access the service.
   */
  @JsonIgnore public ContactPoint getServicePhone() {
    return (ContactPoint) getValue("servicePhone");
  }
  /**
   * The phone number to use to access the service.
   */
  @JsonIgnore public Collection<ContactPoint> getServicePhones() {
    final Object current = myData.get("servicePhone");
    if (current == null) return Collections.emptyList();
    if (current instanceof Collection) {
      return (Collection<ContactPoint>) current;
    }
    return Arrays.asList((ContactPoint) current);
  }
  /**
   * The location (e.g. civic structure, local business, etc.) where a person can go to access the service.
   */
  @JsonIgnore public Place getServiceLocation() {
    return (Place) getValue("serviceLocation");
  }
  /**
   * The location (e.g. civic structure, local business, etc.) where a person can go to access the service.
   */
  @JsonIgnore public Collection<Place> getServiceLocations() {
    final Object current = myData.get("serviceLocation");
    if (current == null) return Collections.emptyList();
    if (current instanceof Collection) {
      return (Collection<Place>) current;
    }
    return Arrays.asList((Place) current);
  }
  /**
   * The number to access the service by text message.
   */
  @JsonIgnore public ContactPoint getServiceSmsNumber() {
    return (ContactPoint) getValue("serviceSmsNumber");
  }
  /**
   * The number to access the service by text message.
   */
  @JsonIgnore public Collection<ContactPoint> getServiceSmsNumbers() {
    final Object current = myData.get("serviceSmsNumber");
    if (current == null) return Collections.emptyList();
    if (current instanceof Collection) {
      return (Collection<ContactPoint>) current;
    }
    return Arrays.asList((ContactPoint) current);
  }
  protected ServiceChannel(java.util.Map<String,Object> data) {
    super(data);
  }
  
  /**
   * Builder for {@link ServiceChannel}
   */
  public static class Builder extends Intangible.Builder {
    public Builder(@NotNull HashMap<String,Object> data) {
      super(data);
    }
    @NotNull public ServiceChannel build() {
      return new ServiceChannel(myData);
    }
    /**
     * The website to access the service.
     */
    @NotNull public Builder serviceUrl(@NotNull String serviceUrl) {
      putValue("serviceUrl", serviceUrl);
      return this;
    }
    /**
     * A language someone may use with or at the item, service or place. Please use one of the language codes from the &lt;a href=&quot;http://tools.ietf.org/html/bcp47&quot;&gt;IETF BCP 47 standard&lt;/a&gt;. See also &lt;a class=&quot;localLink&quot; href=&quot;http://schema.org/inLanguage&quot;&gt;inLanguage&lt;/a&gt;
     */
    @NotNull public Builder availableLanguage(@NotNull Language language) {
      putValue("availableLanguage", language);
      return this;
    }
    /**
     * A language someone may use with or at the item, service or place. Please use one of the language codes from the &lt;a href=&quot;http://tools.ietf.org/html/bcp47&quot;&gt;IETF BCP 47 standard&lt;/a&gt;. See also &lt;a class=&quot;localLink&quot; href=&quot;http://schema.org/inLanguage&quot;&gt;inLanguage&lt;/a&gt;
     */
    @NotNull public Builder availableLanguage(@NotNull Language.Builder language) {
      putValue("availableLanguage", language.build());
      return this;
    }
    /**
     * A language someone may use with or at the item, service or place. Please use one of the language codes from the &lt;a href=&quot;http://tools.ietf.org/html/bcp47&quot;&gt;IETF BCP 47 standard&lt;/a&gt;. See also &lt;a class=&quot;localLink&quot; href=&quot;http://schema.org/inLanguage&quot;&gt;inLanguage&lt;/a&gt;
     */
    @NotNull public Builder availableLanguage(@NotNull String availableLanguage) {
      putValue("availableLanguage", availableLanguage);
      return this;
    }
    /**
     * Estimated processing time for the service using this channel.
     */
    @NotNull public Builder processingTime(@NotNull Duration duration) {
      putValue("processingTime", duration);
      return this;
    }
    /**
     * The address for accessing the service by mail.
     */
    @NotNull public Builder servicePostalAddress(@NotNull PostalAddress postalAddress) {
      putValue("servicePostalAddress", postalAddress);
      return this;
    }
    /**
     * The address for accessing the service by mail.
     */
    @NotNull public Builder servicePostalAddress(@NotNull PostalAddress.Builder postalAddress) {
      putValue("servicePostalAddress", postalAddress.build());
      return this;
    }
    /**
     * The service provided by this channel.
     */
    @NotNull public Builder providesService(@NotNull Service service) {
      putValue("providesService", service);
      return this;
    }
    /**
     * The service provided by this channel.
     */
    @NotNull public Builder providesService(@NotNull Service.Builder service) {
      putValue("providesService", service.build());
      return this;
    }
    /**
     * The phone number to use to access the service.
     */
    @NotNull public Builder servicePhone(@NotNull ContactPoint contactPoint) {
      putValue("servicePhone", contactPoint);
      return this;
    }
    /**
     * The phone number to use to access the service.
     */
    @NotNull public Builder servicePhone(@NotNull ContactPoint.Builder contactPoint) {
      putValue("servicePhone", contactPoint.build());
      return this;
    }
    /**
     * The location (e.g. civic structure, local business, etc.) where a person can go to access the service.
     */
    @NotNull public Builder serviceLocation(@NotNull Place place) {
      putValue("serviceLocation", place);
      return this;
    }
    /**
     * The location (e.g. civic structure, local business, etc.) where a person can go to access the service.
     */
    @NotNull public Builder serviceLocation(@NotNull Place.Builder place) {
      putValue("serviceLocation", place.build());
      return this;
    }
    /**
     * The number to access the service by text message.
     */
    @NotNull public Builder serviceSmsNumber(@NotNull ContactPoint contactPoint) {
      putValue("serviceSmsNumber", contactPoint);
      return this;
    }
    /**
     * The number to access the service by text message.
     */
    @NotNull public Builder serviceSmsNumber(@NotNull ContactPoint.Builder contactPoint) {
      putValue("serviceSmsNumber", contactPoint.build());
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
      if ("serviceUrl".equals(key) && value instanceof String) { this.serviceUrl((String)value); return; }
      if ("serviceUrls".equals(key) && value instanceof String) { this.serviceUrl((String)value); return; }
      if ("availableLanguage".equals(key) && value instanceof Language) { this.availableLanguage((Language)value); return; }
      if ("availableLanguages".equals(key) && value instanceof Language) { this.availableLanguage((Language)value); return; }
      if ("availableLanguage".equals(key) && value instanceof String) { this.availableLanguage((String)value); return; }
      if ("availableLanguages".equals(key) && value instanceof String) { this.availableLanguage((String)value); return; }
      if ("processingTime".equals(key) && value instanceof Duration) { this.processingTime((Duration)value); return; }
      if ("processingTimes".equals(key) && value instanceof Duration) { this.processingTime((Duration)value); return; }
      if ("servicePostalAddress".equals(key) && value instanceof PostalAddress) { this.servicePostalAddress((PostalAddress)value); return; }
      if ("servicePostalAddresss".equals(key) && value instanceof PostalAddress) { this.servicePostalAddress((PostalAddress)value); return; }
      if ("providesService".equals(key) && value instanceof Service) { this.providesService((Service)value); return; }
      if ("providesServices".equals(key) && value instanceof Service) { this.providesService((Service)value); return; }
      if ("servicePhone".equals(key) && value instanceof ContactPoint) { this.servicePhone((ContactPoint)value); return; }
      if ("servicePhones".equals(key) && value instanceof ContactPoint) { this.servicePhone((ContactPoint)value); return; }
      if ("serviceLocation".equals(key) && value instanceof Place) { this.serviceLocation((Place)value); return; }
      if ("serviceLocations".equals(key) && value instanceof Place) { this.serviceLocation((Place)value); return; }
      if ("serviceSmsNumber".equals(key) && value instanceof ContactPoint) { this.serviceSmsNumber((ContactPoint)value); return; }
      if ("serviceSmsNumbers".equals(key) && value instanceof ContactPoint) { this.serviceSmsNumber((ContactPoint)value); return; }
      super.fromMap(key, value);
    }
  }
  
}
