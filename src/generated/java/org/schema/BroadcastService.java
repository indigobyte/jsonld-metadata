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
 * A delivery service through which content is provided via broadcast over the air or online.
 */
public class BroadcastService extends Service {
  /**
   * The frequency used for over-the-air broadcasts. Numeric values or simple ranges e.g. 87-99. In addition a shortcut idiom is supported for frequences of AM and FM radio channels, e.g. &quot;87 FM&quot;.
   */
  @JsonIgnore public BroadcastFrequencySpecification getBroadcastFrequencyBroadcastFrequencySpecification() {
    return (BroadcastFrequencySpecification) getValue("broadcastFrequency");
  }
  /**
   * The frequency used for over-the-air broadcasts. Numeric values or simple ranges e.g. 87-99. In addition a shortcut idiom is supported for frequences of AM and FM radio channels, e.g. &quot;87 FM&quot;.
   */
  @JsonIgnore public Collection<BroadcastFrequencySpecification> getBroadcastFrequencyBroadcastFrequencySpecifications() {
    final Object current = myData.get("broadcastFrequency");
    if (current == null) return Collections.emptyList();
    if (current instanceof Collection) {
      return (Collection<BroadcastFrequencySpecification>) current;
    }
    return Arrays.asList((BroadcastFrequencySpecification) current);
  }
  /**
   * The frequency used for over-the-air broadcasts. Numeric values or simple ranges e.g. 87-99. In addition a shortcut idiom is supported for frequences of AM and FM radio channels, e.g. &quot;87 FM&quot;.
   */
  @JsonIgnore public String getBroadcastFrequencyString() {
    return (String) getValue("broadcastFrequency");
  }
  /**
   * The frequency used for over-the-air broadcasts. Numeric values or simple ranges e.g. 87-99. In addition a shortcut idiom is supported for frequences of AM and FM radio channels, e.g. &quot;87 FM&quot;.
   */
  @JsonIgnore public Collection<String> getBroadcastFrequencyStrings() {
    final Object current = myData.get("broadcastFrequency");
    if (current == null) return Collections.emptyList();
    if (current instanceof Collection) {
      return (Collection<String>) current;
    }
    return Arrays.asList((String) current);
  }
  /**
   * The language of the content or performance or used in an action. Please use one of the language codes from the &lt;a href=&quot;http://tools.ietf.org/html/bcp47&quot;&gt;IETF BCP 47 standard&lt;/a&gt;. See also &lt;a class=&quot;localLink&quot; href=&quot;http://schema.org/availableLanguage&quot;&gt;availableLanguage&lt;/a&gt;.
   */
  @JsonIgnore public Language getInLanguageLanguage() {
    return (Language) getValue("inLanguage");
  }
  /**
   * The language of the content or performance or used in an action. Please use one of the language codes from the &lt;a href=&quot;http://tools.ietf.org/html/bcp47&quot;&gt;IETF BCP 47 standard&lt;/a&gt;. See also &lt;a class=&quot;localLink&quot; href=&quot;http://schema.org/availableLanguage&quot;&gt;availableLanguage&lt;/a&gt;.
   */
  @JsonIgnore public Collection<Language> getInLanguageLanguages() {
    final Object current = myData.get("inLanguage");
    if (current == null) return Collections.emptyList();
    if (current instanceof Collection) {
      return (Collection<Language>) current;
    }
    return Arrays.asList((Language) current);
  }
  /**
   * The language of the content or performance or used in an action. Please use one of the language codes from the &lt;a href=&quot;http://tools.ietf.org/html/bcp47&quot;&gt;IETF BCP 47 standard&lt;/a&gt;. See also &lt;a class=&quot;localLink&quot; href=&quot;http://schema.org/availableLanguage&quot;&gt;availableLanguage&lt;/a&gt;.
   */
  @JsonIgnore public String getInLanguageString() {
    return (String) getValue("inLanguage");
  }
  /**
   * The language of the content or performance or used in an action. Please use one of the language codes from the &lt;a href=&quot;http://tools.ietf.org/html/bcp47&quot;&gt;IETF BCP 47 standard&lt;/a&gt;. See also &lt;a class=&quot;localLink&quot; href=&quot;http://schema.org/availableLanguage&quot;&gt;availableLanguage&lt;/a&gt;.
   */
  @JsonIgnore public Collection<String> getInLanguageStrings() {
    final Object current = myData.get("inLanguage");
    if (current == null) return Collections.emptyList();
    if (current instanceof Collection) {
      return (Collection<String>) current;
    }
    return Arrays.asList((String) current);
  }
  /**
   * The type of screening or video broadcast used (e.g. IMAX, 3D, SD, HD, etc.).
   */
  @JsonIgnore public String getVideoFormat() {
    return (String) getValue("videoFormat");
  }
  /**
   * The type of screening or video broadcast used (e.g. IMAX, 3D, SD, HD, etc.).
   */
  @JsonIgnore public Collection<String> getVideoFormats() {
    final Object current = myData.get("videoFormat");
    if (current == null) return Collections.emptyList();
    if (current instanceof Collection) {
      return (Collection<String>) current;
    }
    return Arrays.asList((String) current);
  }
  /**
   * The media network(s) whose content is broadcast on this station.
   */
  @JsonIgnore public Organization getBroadcastAffiliateOf() {
    return (Organization) getValue("broadcastAffiliateOf");
  }
  /**
   * The media network(s) whose content is broadcast on this station.
   */
  @JsonIgnore public Collection<Organization> getBroadcastAffiliateOfs() {
    final Object current = myData.get("broadcastAffiliateOf");
    if (current == null) return Collections.emptyList();
    if (current instanceof Collection) {
      return (Collection<Organization>) current;
    }
    return Arrays.asList((Organization) current);
  }
  /**
   * A &lt;a href=&quot;https://en.wikipedia.org/wiki/Call_sign&quot;&gt;callsign&lt;/a&gt;, as used in broadcasting and radio communications to identify people, radio and TV stations, or vehicles.
   */
  @JsonIgnore public Identifier getCallSign() {
    return (Identifier) getValue("callSign");
  }
  /**
   * A &lt;a href=&quot;https://en.wikipedia.org/wiki/Call_sign&quot;&gt;callsign&lt;/a&gt;, as used in broadcasting and radio communications to identify people, radio and TV stations, or vehicles.
   */
  @JsonIgnore public Collection<Identifier> getCallSigns() {
    final Object current = myData.get("callSign");
    if (current == null) return Collections.emptyList();
    if (current instanceof Collection) {
      return (Collection<Identifier>) current;
    }
    return Arrays.asList((Identifier) current);
  }
  /**
   * The timezone in &lt;a href=&quot;http://en.wikipedia.org/wiki/ISO_8601&quot;&gt;ISO 8601 format&lt;/a&gt; for which the service bases its broadcasts
   */
  @JsonIgnore public String getBroadcastTimezone() {
    return (String) getValue("broadcastTimezone");
  }
  /**
   * The timezone in &lt;a href=&quot;http://en.wikipedia.org/wiki/ISO_8601&quot;&gt;ISO 8601 format&lt;/a&gt; for which the service bases its broadcasts
   */
  @JsonIgnore public Collection<String> getBroadcastTimezones() {
    final Object current = myData.get("broadcastTimezone");
    if (current == null) return Collections.emptyList();
    if (current instanceof Collection) {
      return (Collection<String>) current;
    }
    return Arrays.asList((String) current);
  }
  /**
   * The organization owning or operating the broadcast service.
   */
  @JsonIgnore public Organization getBroadcaster() {
    return (Organization) getValue("broadcaster");
  }
  /**
   * The organization owning or operating the broadcast service.
   */
  @JsonIgnore public Collection<Organization> getBroadcasters() {
    final Object current = myData.get("broadcaster");
    if (current == null) return Collections.emptyList();
    if (current instanceof Collection) {
      return (Collection<Organization>) current;
    }
    return Arrays.asList((Organization) current);
  }
  /**
   * The name displayed in the channel guide. For many US affiliates, it is the network name.
   */
  @JsonIgnore public String getBroadcastDisplayName() {
    return (String) getValue("broadcastDisplayName");
  }
  /**
   * The name displayed in the channel guide. For many US affiliates, it is the network name.
   */
  @JsonIgnore public Collection<String> getBroadcastDisplayNames() {
    final Object current = myData.get("broadcastDisplayName");
    if (current == null) return Collections.emptyList();
    if (current instanceof Collection) {
      return (Collection<String>) current;
    }
    return Arrays.asList((String) current);
  }
  /**
   * A broadcast service to which the broadcast service may belong to such as regional variations of a national channel.
   */
  @JsonIgnore public BroadcastService getParentService() {
    return (BroadcastService) getValue("parentService");
  }
  /**
   * A broadcast service to which the broadcast service may belong to such as regional variations of a national channel.
   */
  @JsonIgnore public Collection<BroadcastService> getParentServices() {
    final Object current = myData.get("parentService");
    if (current == null) return Collections.emptyList();
    if (current instanceof Collection) {
      return (Collection<BroadcastService>) current;
    }
    return Arrays.asList((BroadcastService) current);
  }
  /**
   * A broadcast channel of a broadcast service.
   */
  @JsonIgnore public BroadcastChannel getHasBroadcastChannel() {
    return (BroadcastChannel) getValue("hasBroadcastChannel");
  }
  /**
   * A broadcast channel of a broadcast service.
   */
  @JsonIgnore public Collection<BroadcastChannel> getHasBroadcastChannels() {
    final Object current = myData.get("hasBroadcastChannel");
    if (current == null) return Collections.emptyList();
    if (current instanceof Collection) {
      return (Collection<BroadcastChannel>) current;
    }
    return Arrays.asList((BroadcastChannel) current);
  }
  protected BroadcastService(java.util.Map<String,Object> data) {
    super(data);
  }
  
  /**
   * Builder for {@link BroadcastService}
   */
  public static class Builder extends Service.Builder {
    public Builder(@NotNull HashMap<String,Object> data) {
      super(data);
    }
    @NotNull public BroadcastService build() {
      return new BroadcastService(myData);
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
     * The language of the content or performance or used in an action. Please use one of the language codes from the &lt;a href=&quot;http://tools.ietf.org/html/bcp47&quot;&gt;IETF BCP 47 standard&lt;/a&gt;. See also &lt;a class=&quot;localLink&quot; href=&quot;http://schema.org/availableLanguage&quot;&gt;availableLanguage&lt;/a&gt;.
     */
    @NotNull public Builder inLanguage(@NotNull Language language) {
      putValue("inLanguage", language);
      return this;
    }
    /**
     * The language of the content or performance or used in an action. Please use one of the language codes from the &lt;a href=&quot;http://tools.ietf.org/html/bcp47&quot;&gt;IETF BCP 47 standard&lt;/a&gt;. See also &lt;a class=&quot;localLink&quot; href=&quot;http://schema.org/availableLanguage&quot;&gt;availableLanguage&lt;/a&gt;.
     */
    @NotNull public Builder inLanguage(@NotNull Language.Builder language) {
      putValue("inLanguage", language.build());
      return this;
    }
    /**
     * The language of the content or performance or used in an action. Please use one of the language codes from the &lt;a href=&quot;http://tools.ietf.org/html/bcp47&quot;&gt;IETF BCP 47 standard&lt;/a&gt;. See also &lt;a class=&quot;localLink&quot; href=&quot;http://schema.org/availableLanguage&quot;&gt;availableLanguage&lt;/a&gt;.
     */
    @NotNull public Builder inLanguage(@NotNull String inLanguage) {
      putValue("inLanguage", inLanguage);
      return this;
    }
    /**
     * The type of screening or video broadcast used (e.g. IMAX, 3D, SD, HD, etc.).
     */
    @NotNull public Builder videoFormat(@NotNull String videoFormat) {
      putValue("videoFormat", videoFormat);
      return this;
    }
    /**
     * The media network(s) whose content is broadcast on this station.
     */
    @NotNull public Builder broadcastAffiliateOf(@NotNull Organization organization) {
      putValue("broadcastAffiliateOf", organization);
      return this;
    }
    /**
     * The media network(s) whose content is broadcast on this station.
     */
    @NotNull public Builder broadcastAffiliateOf(@NotNull Organization.Builder organization) {
      putValue("broadcastAffiliateOf", organization.build());
      return this;
    }
    /**
     * A &lt;a href=&quot;https://en.wikipedia.org/wiki/Call_sign&quot;&gt;callsign&lt;/a&gt;, as used in broadcasting and radio communications to identify people, radio and TV stations, or vehicles.
     */
    @NotNull public Builder callSign(@NotNull Identifier identifier) {
      putValue("callSign", identifier);
      return this;
    }
    /**
     * The timezone in &lt;a href=&quot;http://en.wikipedia.org/wiki/ISO_8601&quot;&gt;ISO 8601 format&lt;/a&gt; for which the service bases its broadcasts
     */
    @NotNull public Builder broadcastTimezone(@NotNull String broadcastTimezone) {
      putValue("broadcastTimezone", broadcastTimezone);
      return this;
    }
    /**
     * The organization owning or operating the broadcast service.
     */
    @NotNull public Builder broadcaster(@NotNull Organization organization) {
      putValue("broadcaster", organization);
      return this;
    }
    /**
     * The organization owning or operating the broadcast service.
     */
    @NotNull public Builder broadcaster(@NotNull Organization.Builder organization) {
      putValue("broadcaster", organization.build());
      return this;
    }
    /**
     * The name displayed in the channel guide. For many US affiliates, it is the network name.
     */
    @NotNull public Builder broadcastDisplayName(@NotNull String broadcastDisplayName) {
      putValue("broadcastDisplayName", broadcastDisplayName);
      return this;
    }
    /**
     * A broadcast service to which the broadcast service may belong to such as regional variations of a national channel.
     */
    @NotNull public Builder parentService(@NotNull BroadcastService broadcastService) {
      putValue("parentService", broadcastService);
      return this;
    }
    /**
     * A broadcast service to which the broadcast service may belong to such as regional variations of a national channel.
     */
    @NotNull public Builder parentService(@NotNull BroadcastService.Builder broadcastService) {
      putValue("parentService", broadcastService.build());
      return this;
    }
    /**
     * A broadcast channel of a broadcast service.
     */
    @NotNull public Builder hasBroadcastChannel(@NotNull BroadcastChannel broadcastChannel) {
      putValue("hasBroadcastChannel", broadcastChannel);
      return this;
    }
    /**
     * A broadcast channel of a broadcast service.
     */
    @NotNull public Builder hasBroadcastChannel(@NotNull BroadcastChannel.Builder broadcastChannel) {
      putValue("hasBroadcastChannel", broadcastChannel.build());
      return this;
    }
    /**
     * The tangible thing generated by the service, e.g. a passport, permit, etc.
     */
    @NotNull public Builder serviceOutput(@NotNull Thing thing) {
      putValue("serviceOutput", thing);
      return this;
    }
    /**
     * The tangible thing generated by the service, e.g. a passport, permit, etc.
     */
    @NotNull public Builder serviceOutput(@NotNull Thing.Builder thing) {
      putValue("serviceOutput", thing.build());
      return this;
    }
    /**
     * The type of service being offered, e.g. veterans' benefits, emergency relief, etc.
     */
    @NotNull public Builder serviceType(@NotNull GovernmentBenefitsType governmentBenefitsType) {
      putValue("serviceType", governmentBenefitsType);
      return this;
    }
    /**
     * The type of service being offered, e.g. veterans' benefits, emergency relief, etc.
     */
    @NotNull public Builder serviceType(@NotNull String serviceType) {
      putValue("serviceType", serviceType);
      return this;
    }
    /**
     * A pointer to another, functionally similar product (or multiple products).
     */
    @NotNull public Builder isSimilarTo(@NotNull Product product) {
      putValue("isSimilarTo", product);
      return this;
    }
    /**
     * A pointer to another, functionally similar product (or multiple products).
     */
    @NotNull public Builder isSimilarTo(@NotNull Product.Builder product) {
      putValue("isSimilarTo", product.build());
      return this;
    }
    /**
     * A pointer to another, functionally similar product (or multiple products).
     */
    @NotNull public Builder isSimilarTo(@NotNull Service service) {
      putValue("isSimilarTo", service);
      return this;
    }
    /**
     * A pointer to another, functionally similar product (or multiple products).
     */
    @NotNull public Builder isSimilarTo(@NotNull Service.Builder service) {
      putValue("isSimilarTo", service.build());
      return this;
    }
    /**
     * An award won by or for this item.
     */
    @NotNull public Builder award(@NotNull String award) {
      putValue("award", award);
      return this;
    }
    /**
     * The brand(s) associated with a product or service, or the brand(s) maintained by an organization or business person.
     */
    @NotNull public Builder brand(@NotNull Brand brand) {
      putValue("brand", brand);
      return this;
    }
    /**
     * The brand(s) associated with a product or service, or the brand(s) maintained by an organization or business person.
     */
    @NotNull public Builder brand(@NotNull Brand.Builder brand) {
      putValue("brand", brand.build());
      return this;
    }
    /**
     * The brand(s) associated with a product or service, or the brand(s) maintained by an organization or business person.
     */
    @NotNull public Builder brand(@NotNull Organization organization) {
      putValue("brand", organization);
      return this;
    }
    /**
     * The brand(s) associated with a product or service, or the brand(s) maintained by an organization or business person.
     */
    @NotNull public Builder brand(@NotNull Organization.Builder organization) {
      putValue("brand", organization.build());
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
     * Indicates an OfferCatalog listing for this Organization, Person, or Service.
     */
    @NotNull public Builder hasOfferCatalog(@NotNull OfferCatalog offerCatalog) {
      putValue("hasOfferCatalog", offerCatalog);
      return this;
    }
    /**
     * Indicates an OfferCatalog listing for this Organization, Person, or Service.
     */
    @NotNull public Builder hasOfferCatalog(@NotNull OfferCatalog.Builder offerCatalog) {
      putValue("hasOfferCatalog", offerCatalog.build());
      return this;
    }
    /**
     * A pointer to another, somehow related product (or multiple products).
     */
    @NotNull public Builder isRelatedTo(@NotNull Product product) {
      putValue("isRelatedTo", product);
      return this;
    }
    /**
     * A pointer to another, somehow related product (or multiple products).
     */
    @NotNull public Builder isRelatedTo(@NotNull Product.Builder product) {
      putValue("isRelatedTo", product.build());
      return this;
    }
    /**
     * A pointer to another, somehow related product (or multiple products).
     */
    @NotNull public Builder isRelatedTo(@NotNull Service service) {
      putValue("isRelatedTo", service);
      return this;
    }
    /**
     * A pointer to another, somehow related product (or multiple products).
     */
    @NotNull public Builder isRelatedTo(@NotNull Service.Builder service) {
      putValue("isRelatedTo", service.build());
      return this;
    }
    /**
     * The service provider, service operator, or service performer; the goods producer. Another party (a seller) may offer those services or goods on behalf of the provider. A provider may also serve as the seller.
     */
    @NotNull public Builder provider(@NotNull Organization organization) {
      putValue("provider", organization);
      return this;
    }
    /**
     * The service provider, service operator, or service performer; the goods producer. Another party (a seller) may offer those services or goods on behalf of the provider. A provider may also serve as the seller.
     */
    @NotNull public Builder provider(@NotNull Organization.Builder organization) {
      putValue("provider", organization.build());
      return this;
    }
    /**
     * The service provider, service operator, or service performer; the goods producer. Another party (a seller) may offer those services or goods on behalf of the provider. A provider may also serve as the seller.
     */
    @NotNull public Builder provider(@NotNull Person person) {
      putValue("provider", person);
      return this;
    }
    /**
     * The service provider, service operator, or service performer; the goods producer. Another party (a seller) may offer those services or goods on behalf of the provider. A provider may also serve as the seller.
     */
    @NotNull public Builder provider(@NotNull Person.Builder person) {
      putValue("provider", person.build());
      return this;
    }
    /**
     * A means of accessing the service (e.g. a phone bank, a web site, a location, etc.).
     */
    @NotNull public Builder availableChannel(@NotNull ServiceChannel serviceChannel) {
      putValue("availableChannel", serviceChannel);
      return this;
    }
    /**
     * A means of accessing the service (e.g. a phone bank, a web site, a location, etc.).
     */
    @NotNull public Builder availableChannel(@NotNull ServiceChannel.Builder serviceChannel) {
      putValue("availableChannel", serviceChannel.build());
      return this;
    }
    /**
     * A category for the item. Greater signs or slashes can be used to informally indicate a category hierarchy.
     */
    @NotNull public Builder category(@NotNull Category category) {
      putValue("category", category);
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
     * The hours during which this service or contact is available.
     */
    @NotNull public Builder hoursAvailable(@NotNull OpeningHoursSpecification openingHoursSpecification) {
      putValue("hoursAvailable", openingHoursSpecification);
      return this;
    }
    /**
     * The hours during which this service or contact is available.
     */
    @NotNull public Builder hoursAvailable(@NotNull OpeningHoursSpecification.Builder openingHoursSpecification) {
      putValue("hoursAvailable", openingHoursSpecification.build());
      return this;
    }
    /**
     * A slogan or motto associated with the item.
     */
    @NotNull public Builder slogan(@NotNull String slogan) {
      putValue("slogan", slogan);
      return this;
    }
    /**
     * Indicates the mobility of a provided service (e.g. 'static', 'dynamic').
     */
    @NotNull public Builder providerMobility(@NotNull String providerMobility) {
      putValue("providerMobility", providerMobility);
      return this;
    }
    /**
     * An associated logo.
     */
    @NotNull public Builder logo(@NotNull Image image) {
      putValue("logo", image);
      return this;
    }
    /**
     * Human-readable terms of service documentation.
     */
    @NotNull public Builder termsOfService(@NotNull String termsOfService) {
      putValue("termsOfService", termsOfService);
      return this;
    }
    /**
     * An entity that arranges for an exchange between a buyer and a seller.  In most cases a broker never acquires or releases ownership of a product or service involved in an exchange.  If it is not clear whether an entity is a broker, seller, or buyer, the latter two terms are preferred.
     */
    @NotNull public Builder broker(@NotNull Organization organization) {
      putValue("broker", organization);
      return this;
    }
    /**
     * An entity that arranges for an exchange between a buyer and a seller.  In most cases a broker never acquires or releases ownership of a product or service involved in an exchange.  If it is not clear whether an entity is a broker, seller, or buyer, the latter two terms are preferred.
     */
    @NotNull public Builder broker(@NotNull Organization.Builder organization) {
      putValue("broker", organization.build());
      return this;
    }
    /**
     * An entity that arranges for an exchange between a buyer and a seller.  In most cases a broker never acquires or releases ownership of a product or service involved in an exchange.  If it is not clear whether an entity is a broker, seller, or buyer, the latter two terms are preferred.
     */
    @NotNull public Builder broker(@NotNull Person person) {
      putValue("broker", person);
      return this;
    }
    /**
     * An entity that arranges for an exchange between a buyer and a seller.  In most cases a broker never acquires or releases ownership of a product or service involved in an exchange.  If it is not clear whether an entity is a broker, seller, or buyer, the latter two terms are preferred.
     */
    @NotNull public Builder broker(@NotNull Person.Builder person) {
      putValue("broker", person.build());
      return this;
    }
    /**
     * An offer to provide this item&amp;#x2014;for example, an offer to sell a product, rent the DVD of a movie, perform a service, or give away tickets to an event. Use &lt;a class=&quot;localLink&quot; href=&quot;http://schema.org/businessFunction&quot;&gt;businessFunction&lt;/a&gt; to indicate the kind of transaction offered, i.e. sell, lease, etc. This property can also be used to describe a &lt;a class=&quot;localLink&quot; href=&quot;http://schema.org/Demand&quot;&gt;Demand&lt;/a&gt;. While this property is listed as expected on a number of common types, it can be used in others. In that case, using a second type, such as Product or a subtype of Product, can clarify the nature of the offer.
     */
    @NotNull public Builder offers(@NotNull Demand demand) {
      putValue("offers", demand);
      return this;
    }
    /**
     * An offer to provide this item&amp;#x2014;for example, an offer to sell a product, rent the DVD of a movie, perform a service, or give away tickets to an event. Use &lt;a class=&quot;localLink&quot; href=&quot;http://schema.org/businessFunction&quot;&gt;businessFunction&lt;/a&gt; to indicate the kind of transaction offered, i.e. sell, lease, etc. This property can also be used to describe a &lt;a class=&quot;localLink&quot; href=&quot;http://schema.org/Demand&quot;&gt;Demand&lt;/a&gt;. While this property is listed as expected on a number of common types, it can be used in others. In that case, using a second type, such as Product or a subtype of Product, can clarify the nature of the offer.
     */
    @NotNull public Builder offers(@NotNull Demand.Builder demand) {
      putValue("offers", demand.build());
      return this;
    }
    /**
     * An offer to provide this item&amp;#x2014;for example, an offer to sell a product, rent the DVD of a movie, perform a service, or give away tickets to an event. Use &lt;a class=&quot;localLink&quot; href=&quot;http://schema.org/businessFunction&quot;&gt;businessFunction&lt;/a&gt; to indicate the kind of transaction offered, i.e. sell, lease, etc. This property can also be used to describe a &lt;a class=&quot;localLink&quot; href=&quot;http://schema.org/Demand&quot;&gt;Demand&lt;/a&gt;. While this property is listed as expected on a number of common types, it can be used in others. In that case, using a second type, such as Product or a subtype of Product, can clarify the nature of the offer.
     */
    @NotNull public Builder offers(@NotNull Offer offer) {
      putValue("offers", offer);
      return this;
    }
    /**
     * An offer to provide this item&amp;#x2014;for example, an offer to sell a product, rent the DVD of a movie, perform a service, or give away tickets to an event. Use &lt;a class=&quot;localLink&quot; href=&quot;http://schema.org/businessFunction&quot;&gt;businessFunction&lt;/a&gt; to indicate the kind of transaction offered, i.e. sell, lease, etc. This property can also be used to describe a &lt;a class=&quot;localLink&quot; href=&quot;http://schema.org/Demand&quot;&gt;Demand&lt;/a&gt;. While this property is listed as expected on a number of common types, it can be used in others. In that case, using a second type, such as Product or a subtype of Product, can clarify the nature of the offer.
     */
    @NotNull public Builder offers(@NotNull Offer.Builder offer) {
      putValue("offers", offer.build());
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
      if ("broadcastFrequency".equals(key) && value instanceof BroadcastFrequencySpecification) { this.broadcastFrequency((BroadcastFrequencySpecification)value); return; }
      if ("broadcastFrequencys".equals(key) && value instanceof BroadcastFrequencySpecification) { this.broadcastFrequency((BroadcastFrequencySpecification)value); return; }
      if ("broadcastFrequency".equals(key) && value instanceof String) { this.broadcastFrequency((String)value); return; }
      if ("broadcastFrequencys".equals(key) && value instanceof String) { this.broadcastFrequency((String)value); return; }
      if ("inLanguage".equals(key) && value instanceof Language) { this.inLanguage((Language)value); return; }
      if ("inLanguages".equals(key) && value instanceof Language) { this.inLanguage((Language)value); return; }
      if ("inLanguage".equals(key) && value instanceof String) { this.inLanguage((String)value); return; }
      if ("inLanguages".equals(key) && value instanceof String) { this.inLanguage((String)value); return; }
      if ("videoFormat".equals(key) && value instanceof String) { this.videoFormat((String)value); return; }
      if ("videoFormats".equals(key) && value instanceof String) { this.videoFormat((String)value); return; }
      if ("broadcastAffiliateOf".equals(key) && value instanceof Organization) { this.broadcastAffiliateOf((Organization)value); return; }
      if ("broadcastAffiliateOfs".equals(key) && value instanceof Organization) { this.broadcastAffiliateOf((Organization)value); return; }
      if ("callSign".equals(key) && value instanceof Identifier) { this.callSign((Identifier)value); return; }
      if ("callSigns".equals(key) && value instanceof Identifier) { this.callSign((Identifier)value); return; }
      if ("broadcastTimezone".equals(key) && value instanceof String) { this.broadcastTimezone((String)value); return; }
      if ("broadcastTimezones".equals(key) && value instanceof String) { this.broadcastTimezone((String)value); return; }
      if ("broadcaster".equals(key) && value instanceof Organization) { this.broadcaster((Organization)value); return; }
      if ("broadcasters".equals(key) && value instanceof Organization) { this.broadcaster((Organization)value); return; }
      if ("broadcastDisplayName".equals(key) && value instanceof String) { this.broadcastDisplayName((String)value); return; }
      if ("broadcastDisplayNames".equals(key) && value instanceof String) { this.broadcastDisplayName((String)value); return; }
      if ("parentService".equals(key) && value instanceof BroadcastService) { this.parentService((BroadcastService)value); return; }
      if ("parentServices".equals(key) && value instanceof BroadcastService) { this.parentService((BroadcastService)value); return; }
      if ("hasBroadcastChannel".equals(key) && value instanceof BroadcastChannel) { this.hasBroadcastChannel((BroadcastChannel)value); return; }
      if ("hasBroadcastChannels".equals(key) && value instanceof BroadcastChannel) { this.hasBroadcastChannel((BroadcastChannel)value); return; }
      super.fromMap(key, value);
    }
  }
  
}
