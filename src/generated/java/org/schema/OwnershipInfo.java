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
 * A structured value providing information about when a certain organization or person owned a certain product.
 */
public class OwnershipInfo extends StructuredValue {
  /**
   * The organization or person from which the product was acquired.
   * @return acquiredFrom property set by first invocation of acquiredFrom method or {@code null}.
   */
  @JsonIgnore public Organization getAcquiredFromOrganization() {
    return (Organization) getValue("acquiredFrom");
  }
  /**
   * The organization or person from which the product was acquired.
   * @return all acquiredFrom properties as {@link java.util.Collection} or an empty collection 
   * if acquiredFrom was not set.
   */
  @JsonIgnore public java.util.Collection<Organization> getAcquiredFromOrganizations() {
    final java.lang.Object current = myData.get("acquiredFrom");
    if (current == null) return Collections.emptyList();
    if (current instanceof java.util.Collection) {
      return (java.util.Collection<Organization>) current;
    }
    return Arrays.asList((Organization) current);
  }
  /**
   * The organization or person from which the product was acquired.
   * @return acquiredFrom property set by first invocation of acquiredFrom method or {@code null}.
   */
  @JsonIgnore public Person getAcquiredFromPerson() {
    return (Person) getValue("acquiredFrom");
  }
  /**
   * The organization or person from which the product was acquired.
   * @return all acquiredFrom properties as {@link java.util.Collection} or an empty collection 
   * if acquiredFrom was not set.
   */
  @JsonIgnore public java.util.Collection<Person> getAcquiredFromPersons() {
    final java.lang.Object current = myData.get("acquiredFrom");
    if (current == null) return Collections.emptyList();
    if (current instanceof java.util.Collection) {
      return (java.util.Collection<Person>) current;
    }
    return Arrays.asList((Person) current);
  }
  /**
   * The date and time of giving up ownership on the product.
   * @return ownedThrough property set by first invocation of ownedThrough method or {@code null}.
   */
  @JsonIgnore public java.util.Date getOwnedThrough() {
    return (java.util.Date) getValue("ownedThrough");
  }
  /**
   * The date and time of giving up ownership on the product.
   * @return all ownedThrough properties as {@link java.util.Collection} or an empty collection 
   * if ownedThrough was not set.
   */
  @JsonIgnore public java.util.Collection<java.util.Date> getOwnedThroughs() {
    final java.lang.Object current = myData.get("ownedThrough");
    if (current == null) return Collections.emptyList();
    if (current instanceof java.util.Collection) {
      return (java.util.Collection<java.util.Date>) current;
    }
    return Arrays.asList((java.util.Date) current);
  }
  /**
   * The product that this structured value is referring to.
   * @return typeOfGood property set by first invocation of typeOfGood method or {@code null}.
   */
  @JsonIgnore public Product getTypeOfGoodProduct() {
    return (Product) getValue("typeOfGood");
  }
  /**
   * The product that this structured value is referring to.
   * @return all typeOfGood properties as {@link java.util.Collection} or an empty collection 
   * if typeOfGood was not set.
   */
  @JsonIgnore public java.util.Collection<Product> getTypeOfGoodProducts() {
    final java.lang.Object current = myData.get("typeOfGood");
    if (current == null) return Collections.emptyList();
    if (current instanceof java.util.Collection) {
      return (java.util.Collection<Product>) current;
    }
    return Arrays.asList((Product) current);
  }
  /**
   * The product that this structured value is referring to.
   * @return typeOfGood property set by first invocation of typeOfGood method or {@code null}.
   */
  @JsonIgnore public Service getTypeOfGoodService() {
    return (Service) getValue("typeOfGood");
  }
  /**
   * The product that this structured value is referring to.
   * @return all typeOfGood properties as {@link java.util.Collection} or an empty collection 
   * if typeOfGood was not set.
   */
  @JsonIgnore public java.util.Collection<Service> getTypeOfGoodServices() {
    final java.lang.Object current = myData.get("typeOfGood");
    if (current == null) return Collections.emptyList();
    if (current instanceof java.util.Collection) {
      return (java.util.Collection<Service>) current;
    }
    return Arrays.asList((Service) current);
  }
  /**
   * The date and time of obtaining the product.
   * @return ownedFrom property set by first invocation of ownedFrom method or {@code null}.
   */
  @JsonIgnore public java.util.Date getOwnedFrom() {
    return (java.util.Date) getValue("ownedFrom");
  }
  /**
   * The date and time of obtaining the product.
   * @return all ownedFrom properties as {@link java.util.Collection} or an empty collection 
   * if ownedFrom was not set.
   */
  @JsonIgnore public java.util.Collection<java.util.Date> getOwnedFroms() {
    final java.lang.Object current = myData.get("ownedFrom");
    if (current == null) return Collections.emptyList();
    if (current instanceof java.util.Collection) {
      return (java.util.Collection<java.util.Date>) current;
    }
    return Arrays.asList((java.util.Date) current);
  }
  protected OwnershipInfo(java.util.Map<String,java.lang.Object> data) {
    super(data);
  }
  /**
   * @return new {@link Builder} initialized with this instance's data
   */
  @NotNull public Builder toBuilder() {
    return new Builder(new HashMap<>(this.myData));
  }
  
  /**
   * Builder for {@link OwnershipInfo}
   */
  public static class Builder extends StructuredValue.Builder {
    public Builder(@NotNull HashMap<String,java.lang.Object> data) {
      super(data);
    }
    @NotNull public OwnershipInfo build() {
      return new OwnershipInfo(myData);
    }
    /**
     * The organization or person from which the product was acquired.
     * @param organization value to set
     * @return this builder instance
     */
    @NotNull public Builder acquiredFrom(@NotNull Organization organization) {
      putValue("acquiredFrom", organization);
      return this;
    }
    /**
     * The organization or person from which the product was acquired.
     * @param organization value to set
     * @return this builder instance
     */
    @NotNull public Builder acquiredFrom(@NotNull Organization.Builder organization) {
      putValue("acquiredFrom", organization.build());
      return this;
    }
    /**
     * The organization or person from which the product was acquired.
     * @param person value to set
     * @return this builder instance
     */
    @NotNull public Builder acquiredFrom(@NotNull Person person) {
      putValue("acquiredFrom", person);
      return this;
    }
    /**
     * The organization or person from which the product was acquired.
     * @param person value to set
     * @return this builder instance
     */
    @NotNull public Builder acquiredFrom(@NotNull Person.Builder person) {
      putValue("acquiredFrom", person.build());
      return this;
    }
    /**
     * Remove acquiredFrom property from the builder.
     * If this property is repeatable, all instances are removed.
     * @return this builder instance
     */
    @NotNull public Builder removeAcquiredFrom() {
      removeValue("acquiredFrom");
      return this;
    }
    /**
     * Get currently set value for acquiredFrom property in this builder.
     * @return previously set value or {@code null}. If multiple values have been 
     * set to this property, then {@link java.util.Collection} instance will be 
     * returned.
     */
    @Nullable public java.lang.Object getAcquiredFrom() {
      return myData.get("acquiredFrom");
    }
    /**
     * The date and time of giving up ownership on the product.
     * @param date value to set
     * @return this builder instance
     */
    @NotNull public Builder ownedThrough(@NotNull java.util.Date date) {
      putValue("ownedThrough", date);
      return this;
    }
    /**
     * Remove ownedThrough property from the builder.
     * If this property is repeatable, all instances are removed.
     * @return this builder instance
     */
    @NotNull public Builder removeOwnedThrough() {
      removeValue("ownedThrough");
      return this;
    }
    /**
     * Get currently set value for ownedThrough property in this builder.
     * @return previously set value or {@code null}. If multiple values have been 
     * set to this property, then {@link java.util.Collection} instance will be 
     * returned.
     */
    @Nullable public java.lang.Object getOwnedThrough() {
      return myData.get("ownedThrough");
    }
    /**
     * The product that this structured value is referring to.
     * @param product value to set
     * @return this builder instance
     */
    @NotNull public Builder typeOfGood(@NotNull Product product) {
      putValue("typeOfGood", product);
      return this;
    }
    /**
     * The product that this structured value is referring to.
     * @param product value to set
     * @return this builder instance
     */
    @NotNull public Builder typeOfGood(@NotNull Product.Builder product) {
      putValue("typeOfGood", product.build());
      return this;
    }
    /**
     * The product that this structured value is referring to.
     * @param service value to set
     * @return this builder instance
     */
    @NotNull public Builder typeOfGood(@NotNull Service service) {
      putValue("typeOfGood", service);
      return this;
    }
    /**
     * The product that this structured value is referring to.
     * @param service value to set
     * @return this builder instance
     */
    @NotNull public Builder typeOfGood(@NotNull Service.Builder service) {
      putValue("typeOfGood", service.build());
      return this;
    }
    /**
     * Remove typeOfGood property from the builder.
     * If this property is repeatable, all instances are removed.
     * @return this builder instance
     */
    @NotNull public Builder removeTypeOfGood() {
      removeValue("typeOfGood");
      return this;
    }
    /**
     * Get currently set value for typeOfGood property in this builder.
     * @return previously set value or {@code null}. If multiple values have been 
     * set to this property, then {@link java.util.Collection} instance will be 
     * returned.
     */
    @Nullable public java.lang.Object getTypeOfGood() {
      return myData.get("typeOfGood");
    }
    /**
     * The date and time of obtaining the product.
     * @param date value to set
     * @return this builder instance
     */
    @NotNull public Builder ownedFrom(@NotNull java.util.Date date) {
      putValue("ownedFrom", date);
      return this;
    }
    /**
     * Remove ownedFrom property from the builder.
     * If this property is repeatable, all instances are removed.
     * @return this builder instance
     */
    @NotNull public Builder removeOwnedFrom() {
      removeValue("ownedFrom");
      return this;
    }
    /**
     * Get currently set value for ownedFrom property in this builder.
     * @return previously set value or {@code null}. If multiple values have been 
     * set to this property, then {@link java.util.Collection} instance will be 
     * returned.
     */
    @Nullable public java.lang.Object getOwnedFrom() {
      return myData.get("ownedFrom");
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
      if ("acquiredFrom".equals(key) && value instanceof Organization) { this.acquiredFrom((Organization)value); return; }
      if ("acquiredFroms".equals(key) && value instanceof Organization) { this.acquiredFrom((Organization)value); return; }
      if ("acquiredFrom".equals(key) && value instanceof Person) { this.acquiredFrom((Person)value); return; }
      if ("acquiredFroms".equals(key) && value instanceof Person) { this.acquiredFrom((Person)value); return; }
      if ("ownedThrough".equals(key) && value instanceof java.util.Date) { this.ownedThrough((java.util.Date)value); return; }
      if ("ownedThroughs".equals(key) && value instanceof java.util.Date) { this.ownedThrough((java.util.Date)value); return; }
      if ("typeOfGood".equals(key) && value instanceof Product) { this.typeOfGood((Product)value); return; }
      if ("typeOfGoods".equals(key) && value instanceof Product) { this.typeOfGood((Product)value); return; }
      if ("typeOfGood".equals(key) && value instanceof Service) { this.typeOfGood((Service)value); return; }
      if ("typeOfGoods".equals(key) && value instanceof Service) { this.typeOfGood((Service)value); return; }
      if ("ownedFrom".equals(key) && value instanceof java.util.Date) { this.ownedFrom((java.util.Date)value); return; }
      if ("ownedFroms".equals(key) && value instanceof java.util.Date) { this.ownedFrom((java.util.Date)value); return; }
      super.fromMap(key, value);
    }
  }
  
}
