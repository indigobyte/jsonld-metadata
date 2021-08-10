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
 * A contact point&amp;#x2014;for example, a Customer Complaints department.
 */
public class ContactPoint extends StructuredValue implements org.schema.Recipient {
  /**
   * The product or service this support contact point is related to (such as product support for a particular product line). This can be a specific product or product line (e.g. &quot;iPhone&quot;) or a general category of products or services (e.g. &quot;smartphones&quot;).
   * @return productSupported property set by first invocation of productSupported method or {@code null}.
   */
  @JsonIgnore public Product getProductSupportedProduct() {
    return (Product) getValue("productSupported");
  }
  /**
   * The product or service this support contact point is related to (such as product support for a particular product line). This can be a specific product or product line (e.g. &quot;iPhone&quot;) or a general category of products or services (e.g. &quot;smartphones&quot;).
   * @return all productSupported properties as {@link java.util.Collection} or an empty collection 
   * if productSupported was not set.
   */
  @JsonIgnore public java.util.Collection<Product> getProductSupportedProducts() {
    final java.lang.Object current = myData.get("productSupported");
    if (current == null) return Collections.emptyList();
    if (current instanceof java.util.Collection) {
      return (java.util.Collection<Product>) current;
    }
    return Arrays.asList((Product) current);
  }
  /**
   * The product or service this support contact point is related to (such as product support for a particular product line). This can be a specific product or product line (e.g. &quot;iPhone&quot;) or a general category of products or services (e.g. &quot;smartphones&quot;).
   * @return productSupported property set by first invocation of productSupported method or {@code null}.
   */
  @JsonIgnore public String getProductSupportedString() {
    return (String) getValue("productSupported");
  }
  /**
   * The product or service this support contact point is related to (such as product support for a particular product line). This can be a specific product or product line (e.g. &quot;iPhone&quot;) or a general category of products or services (e.g. &quot;smartphones&quot;).
   * @return all productSupported properties as {@link java.util.Collection} or an empty collection 
   * if productSupported was not set.
   */
  @JsonIgnore public java.util.Collection<String> getProductSupportedStrings() {
    final java.lang.Object current = myData.get("productSupported");
    if (current == null) return Collections.emptyList();
    if (current instanceof java.util.Collection) {
      return (java.util.Collection<String>) current;
    }
    return Arrays.asList((String) current);
  }
  /**
   * Email address.
   * @return email property set by first invocation of email method or {@code null}.
   */
  @JsonIgnore public String getEmail() {
    return (String) getValue("email");
  }
  /**
   * Email address.
   * @return all email properties as {@link java.util.Collection} or an empty collection 
   * if email was not set.
   */
  @JsonIgnore public java.util.Collection<String> getEmails() {
    final java.lang.Object current = myData.get("email");
    if (current == null) return Collections.emptyList();
    if (current instanceof java.util.Collection) {
      return (java.util.Collection<String>) current;
    }
    return Arrays.asList((String) current);
  }
  /**
   * The telephone number.
   * @return telephone property set by first invocation of telephone method or {@code null}.
   */
  @JsonIgnore public String getTelephone() {
    return (String) getValue("telephone");
  }
  /**
   * The telephone number.
   * @return all telephone properties as {@link java.util.Collection} or an empty collection 
   * if telephone was not set.
   */
  @JsonIgnore public java.util.Collection<String> getTelephones() {
    final java.lang.Object current = myData.get("telephone");
    if (current == null) return Collections.emptyList();
    if (current instanceof java.util.Collection) {
      return (java.util.Collection<String>) current;
    }
    return Arrays.asList((String) current);
  }
  /**
   * A person or organization can have different contact points, for different purposes. For example, a sales contact point, a PR contact point and so on. This property is used to specify the kind of contact point.
   * @return contactType property set by first invocation of contactType method or {@code null}.
   */
  @JsonIgnore public String getContactType() {
    return (String) getValue("contactType");
  }
  /**
   * A person or organization can have different contact points, for different purposes. For example, a sales contact point, a PR contact point and so on. This property is used to specify the kind of contact point.
   * @return all contactType properties as {@link java.util.Collection} or an empty collection 
   * if contactType was not set.
   */
  @JsonIgnore public java.util.Collection<String> getContactTypes() {
    final java.lang.Object current = myData.get("contactType");
    if (current == null) return Collections.emptyList();
    if (current instanceof java.util.Collection) {
      return (java.util.Collection<String>) current;
    }
    return Arrays.asList((String) current);
  }
  /**
   * The geographic area where a service or offered item is provided.
   * @return areaServed property set by first invocation of areaServed method or {@code null}.
   */
  @JsonIgnore public AreaServed getAreaServed() {
    return (AreaServed) getValue("areaServed");
  }
  /**
   * The geographic area where a service or offered item is provided.
   * @return all areaServed properties as {@link java.util.Collection} or an empty collection 
   * if areaServed was not set.
   */
  @JsonIgnore public java.util.Collection<AreaServed> getAreaServeds() {
    final java.lang.Object current = myData.get("areaServed");
    if (current == null) return Collections.emptyList();
    if (current instanceof java.util.Collection) {
      return (java.util.Collection<AreaServed>) current;
    }
    return Arrays.asList((AreaServed) current);
  }
  /**
   * An option available on this contact point (e.g. a toll-free number or support for hearing-impaired callers).
   * @return contactOption property set by first invocation of contactOption method or {@code null}.
   */
  @JsonIgnore public ContactPointOption getContactOption() {
    return (ContactPointOption) getValue("contactOption");
  }
  /**
   * An option available on this contact point (e.g. a toll-free number or support for hearing-impaired callers).
   * @return all contactOption properties as {@link java.util.Collection} or an empty collection 
   * if contactOption was not set.
   */
  @JsonIgnore public java.util.Collection<ContactPointOption> getContactOptions() {
    final java.lang.Object current = myData.get("contactOption");
    if (current == null) return Collections.emptyList();
    if (current instanceof java.util.Collection) {
      return (java.util.Collection<ContactPointOption>) current;
    }
    return Arrays.asList((ContactPointOption) current);
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
   * The fax number.
   * @return faxNumber property set by first invocation of faxNumber method or {@code null}.
   */
  @JsonIgnore public String getFaxNumber() {
    return (String) getValue("faxNumber");
  }
  /**
   * The fax number.
   * @return all faxNumber properties as {@link java.util.Collection} or an empty collection 
   * if faxNumber was not set.
   */
  @JsonIgnore public java.util.Collection<String> getFaxNumbers() {
    final java.lang.Object current = myData.get("faxNumber");
    if (current == null) return Collections.emptyList();
    if (current instanceof java.util.Collection) {
      return (java.util.Collection<String>) current;
    }
    return Arrays.asList((String) current);
  }
  /**
   * The hours during which this service or contact is available.
   * @return hoursAvailable property set by first invocation of hoursAvailable method or {@code null}.
   */
  @JsonIgnore public OpeningHoursSpecification getHoursAvailable() {
    return (OpeningHoursSpecification) getValue("hoursAvailable");
  }
  /**
   * The hours during which this service or contact is available.
   * @return all hoursAvailable properties as {@link java.util.Collection} or an empty collection 
   * if hoursAvailable was not set.
   */
  @JsonIgnore public java.util.Collection<OpeningHoursSpecification> getHoursAvailables() {
    final java.lang.Object current = myData.get("hoursAvailable");
    if (current == null) return Collections.emptyList();
    if (current instanceof java.util.Collection) {
      return (java.util.Collection<OpeningHoursSpecification>) current;
    }
    return Arrays.asList((OpeningHoursSpecification) current);
  }
  protected ContactPoint(java.util.Map<String,java.lang.Object> data) {
    super(data);
  }
  /**
   * @return new {@link Builder} initialized with this instance's data
   */
  @NotNull public Builder toBuilder() {
    return new Builder(new HashMap<>(this.myData));
  }
  
  /**
   * Builder for {@link ContactPoint}
   */
  public static class Builder extends StructuredValue.Builder {
    public Builder(@NotNull HashMap<String,java.lang.Object> data) {
      super(data);
    }
    @NotNull public ContactPoint build() {
      return new ContactPoint(myData);
    }
    /**
     * The product or service this support contact point is related to (such as product support for a particular product line). This can be a specific product or product line (e.g. &quot;iPhone&quot;) or a general category of products or services (e.g. &quot;smartphones&quot;).
     * @param product value to set
     * @return this builder instance
     */
    @NotNull public Builder productSupported(@NotNull Product product) {
      putValue("productSupported", product);
      return this;
    }
    /**
     * The product or service this support contact point is related to (such as product support for a particular product line). This can be a specific product or product line (e.g. &quot;iPhone&quot;) or a general category of products or services (e.g. &quot;smartphones&quot;).
     * @param product value to set
     * @return this builder instance
     */
    @NotNull public Builder productSupported(@NotNull Product.Builder product) {
      putValue("productSupported", product.build());
      return this;
    }
    /**
     * The product or service this support contact point is related to (such as product support for a particular product line). This can be a specific product or product line (e.g. &quot;iPhone&quot;) or a general category of products or services (e.g. &quot;smartphones&quot;).
     * @param productSupported value to set
     * @return this builder instance
     */
    @NotNull public Builder productSupported(@NotNull String productSupported) {
      putValue("productSupported", productSupported);
      return this;
    }
    /**
     * Remove productSupported property from the builder.
     * If this property is repeatable, all instances are removed.
     * @return this builder instance
     */
    @NotNull public Builder removeProductSupported() {
      removeValue("productSupported");
      return this;
    }
    /**
     * Get currently set value for productSupported property in this builder.
     * @return previously set value or {@code null}. If multiple values have been 
     * set to this property, then {@link java.util.Collection} instance will be 
     * returned.
     */
    @Nullable public java.lang.Object getProductSupported() {
      return myData.get("productSupported");
    }
    /**
     * Email address.
     * @param email value to set
     * @return this builder instance
     */
    @NotNull public Builder email(@NotNull String email) {
      putValue("email", email);
      return this;
    }
    /**
     * Remove email property from the builder.
     * If this property is repeatable, all instances are removed.
     * @return this builder instance
     */
    @NotNull public Builder removeEmail() {
      removeValue("email");
      return this;
    }
    /**
     * Get currently set value for email property in this builder.
     * @return previously set value or {@code null}. If multiple values have been 
     * set to this property, then {@link java.util.Collection} instance will be 
     * returned.
     */
    @Nullable public java.lang.Object getEmail() {
      return myData.get("email");
    }
    /**
     * The telephone number.
     * @param telephone value to set
     * @return this builder instance
     */
    @NotNull public Builder telephone(@NotNull String telephone) {
      putValue("telephone", telephone);
      return this;
    }
    /**
     * Remove telephone property from the builder.
     * If this property is repeatable, all instances are removed.
     * @return this builder instance
     */
    @NotNull public Builder removeTelephone() {
      removeValue("telephone");
      return this;
    }
    /**
     * Get currently set value for telephone property in this builder.
     * @return previously set value or {@code null}. If multiple values have been 
     * set to this property, then {@link java.util.Collection} instance will be 
     * returned.
     */
    @Nullable public java.lang.Object getTelephone() {
      return myData.get("telephone");
    }
    /**
     * A person or organization can have different contact points, for different purposes. For example, a sales contact point, a PR contact point and so on. This property is used to specify the kind of contact point.
     * @param contactType value to set
     * @return this builder instance
     */
    @NotNull public Builder contactType(@NotNull String contactType) {
      putValue("contactType", contactType);
      return this;
    }
    /**
     * Remove contactType property from the builder.
     * If this property is repeatable, all instances are removed.
     * @return this builder instance
     */
    @NotNull public Builder removeContactType() {
      removeValue("contactType");
      return this;
    }
    /**
     * Get currently set value for contactType property in this builder.
     * @return previously set value or {@code null}. If multiple values have been 
     * set to this property, then {@link java.util.Collection} instance will be 
     * returned.
     */
    @Nullable public java.lang.Object getContactType() {
      return myData.get("contactType");
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
     * An option available on this contact point (e.g. a toll-free number or support for hearing-impaired callers).
     * @param contactPointOption value to set
     * @return this builder instance
     */
    @NotNull public Builder contactOption(@NotNull ContactPointOption contactPointOption) {
      putValue("contactOption", contactPointOption);
      return this;
    }
    /**
     * Remove contactOption property from the builder.
     * If this property is repeatable, all instances are removed.
     * @return this builder instance
     */
    @NotNull public Builder removeContactOption() {
      removeValue("contactOption");
      return this;
    }
    /**
     * Get currently set value for contactOption property in this builder.
     * @return previously set value or {@code null}. If multiple values have been 
     * set to this property, then {@link java.util.Collection} instance will be 
     * returned.
     */
    @Nullable public java.lang.Object getContactOption() {
      return myData.get("contactOption");
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
     * The fax number.
     * @param faxNumber value to set
     * @return this builder instance
     */
    @NotNull public Builder faxNumber(@NotNull String faxNumber) {
      putValue("faxNumber", faxNumber);
      return this;
    }
    /**
     * Remove faxNumber property from the builder.
     * If this property is repeatable, all instances are removed.
     * @return this builder instance
     */
    @NotNull public Builder removeFaxNumber() {
      removeValue("faxNumber");
      return this;
    }
    /**
     * Get currently set value for faxNumber property in this builder.
     * @return previously set value or {@code null}. If multiple values have been 
     * set to this property, then {@link java.util.Collection} instance will be 
     * returned.
     */
    @Nullable public java.lang.Object getFaxNumber() {
      return myData.get("faxNumber");
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
      if ("productSupported".equals(key) && value instanceof Product) { this.productSupported((Product)value); return; }
      if ("productSupporteds".equals(key) && value instanceof Product) { this.productSupported((Product)value); return; }
      if ("productSupported".equals(key) && value instanceof String) { this.productSupported((String)value); return; }
      if ("productSupporteds".equals(key) && value instanceof String) { this.productSupported((String)value); return; }
      if ("email".equals(key) && value instanceof String) { this.email((String)value); return; }
      if ("emails".equals(key) && value instanceof String) { this.email((String)value); return; }
      if ("telephone".equals(key) && value instanceof String) { this.telephone((String)value); return; }
      if ("telephones".equals(key) && value instanceof String) { this.telephone((String)value); return; }
      if ("contactType".equals(key) && value instanceof String) { this.contactType((String)value); return; }
      if ("contactTypes".equals(key) && value instanceof String) { this.contactType((String)value); return; }
      if ("areaServed".equals(key) && value instanceof AreaServed) { this.areaServed((AreaServed)value); return; }
      if ("areaServeds".equals(key) && value instanceof AreaServed) { this.areaServed((AreaServed)value); return; }
      if ("contactOption".equals(key) && value instanceof ContactPointOption) { this.contactOption((ContactPointOption)value); return; }
      if ("contactOptions".equals(key) && value instanceof ContactPointOption) { this.contactOption((ContactPointOption)value); return; }
      if ("availableLanguage".equals(key) && value instanceof Language) { this.availableLanguage((Language)value); return; }
      if ("availableLanguages".equals(key) && value instanceof Language) { this.availableLanguage((Language)value); return; }
      if ("availableLanguage".equals(key) && value instanceof String) { this.availableLanguage((String)value); return; }
      if ("availableLanguages".equals(key) && value instanceof String) { this.availableLanguage((String)value); return; }
      if ("faxNumber".equals(key) && value instanceof String) { this.faxNumber((String)value); return; }
      if ("faxNumbers".equals(key) && value instanceof String) { this.faxNumber((String)value); return; }
      if ("hoursAvailable".equals(key) && value instanceof OpeningHoursSpecification) { this.hoursAvailable((OpeningHoursSpecification)value); return; }
      if ("hoursAvailables".equals(key) && value instanceof OpeningHoursSpecification) { this.hoursAvailable((OpeningHoursSpecification)value); return; }
      super.fromMap(key, value);
    }
  }
  
}
