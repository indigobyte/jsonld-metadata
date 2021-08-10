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
 * A US-style health insurance plan, including PPOs, EPOs, and HMOs. 
 */
public class HealthInsurancePlan extends Intangible {
  /**
   * Formularies covered by this plan.
   * @return includesHealthPlanFormulary property set by first invocation of includesHealthPlanFormulary method or {@code null}.
   */
  @JsonIgnore public HealthPlanFormulary getIncludesHealthPlanFormulary() {
    return (HealthPlanFormulary) getValue("includesHealthPlanFormulary");
  }
  /**
   * Formularies covered by this plan.
   * @return all includesHealthPlanFormulary properties as {@link java.util.Collection} or an empty collection 
   * if includesHealthPlanFormulary was not set.
   */
  @JsonIgnore public java.util.Collection<HealthPlanFormulary> getIncludesHealthPlanFormularys() {
    final java.lang.Object current = myData.get("includesHealthPlanFormulary");
    if (current == null) return Collections.emptyList();
    if (current instanceof java.util.Collection) {
      return (java.util.Collection<HealthPlanFormulary>) current;
    }
    return Arrays.asList((HealthPlanFormulary) current);
  }
  /**
   * A contact point for a person or organization.
   * @return contactPoint property set by first invocation of contactPoint method or {@code null}.
   */
  @JsonIgnore public ContactPoint getContactPoint() {
    return (ContactPoint) getValue("contactPoint");
  }
  /**
   * A contact point for a person or organization.
   * @return all contactPoint properties as {@link java.util.Collection} or an empty collection 
   * if contactPoint was not set.
   */
  @JsonIgnore public java.util.Collection<ContactPoint> getContactPoints() {
    final java.lang.Object current = myData.get("contactPoint");
    if (current == null) return Collections.emptyList();
    if (current instanceof java.util.Collection) {
      return (java.util.Collection<ContactPoint>) current;
    }
    return Arrays.asList((ContactPoint) current);
  }
  /**
   * The 14-character, HIOS-generated Plan ID number. (Plan IDs must be unique, even across different markets.)
   * @return healthPlanId property set by first invocation of healthPlanId method or {@code null}.
   */
  @JsonIgnore public String getHealthPlanId() {
    return (String) getValue("healthPlanId");
  }
  /**
   * The 14-character, HIOS-generated Plan ID number. (Plan IDs must be unique, even across different markets.)
   * @return all healthPlanId properties as {@link java.util.Collection} or an empty collection 
   * if healthPlanId was not set.
   */
  @JsonIgnore public java.util.Collection<String> getHealthPlanIds() {
    final java.lang.Object current = myData.get("healthPlanId");
    if (current == null) return Collections.emptyList();
    if (current instanceof java.util.Collection) {
      return (java.util.Collection<String>) current;
    }
    return Arrays.asList((String) current);
  }
  /**
   * The tier(s) of drugs offered by this formulary or insurance plan.
   * @return healthPlanDrugTier property set by first invocation of healthPlanDrugTier method or {@code null}.
   */
  @JsonIgnore public String getHealthPlanDrugTier() {
    return (String) getValue("healthPlanDrugTier");
  }
  /**
   * The tier(s) of drugs offered by this formulary or insurance plan.
   * @return all healthPlanDrugTier properties as {@link java.util.Collection} or an empty collection 
   * if healthPlanDrugTier was not set.
   */
  @JsonIgnore public java.util.Collection<String> getHealthPlanDrugTiers() {
    final java.lang.Object current = myData.get("healthPlanDrugTier");
    if (current == null) return Collections.emptyList();
    if (current instanceof java.util.Collection) {
      return (java.util.Collection<String>) current;
    }
    return Arrays.asList((String) current);
  }
  /**
   * The URL that goes directly to the plan brochure for the specific standard plan or plan variation.
   * @return healthPlanMarketingUrl property set by first invocation of healthPlanMarketingUrl method or {@code null}.
   */
  @JsonIgnore public String getHealthPlanMarketingUrl() {
    return (String) getValue("healthPlanMarketingUrl");
  }
  /**
   * The URL that goes directly to the plan brochure for the specific standard plan or plan variation.
   * @return all healthPlanMarketingUrl properties as {@link java.util.Collection} or an empty collection 
   * if healthPlanMarketingUrl was not set.
   */
  @JsonIgnore public java.util.Collection<String> getHealthPlanMarketingUrls() {
    final java.lang.Object current = myData.get("healthPlanMarketingUrl");
    if (current == null) return Collections.emptyList();
    if (current instanceof java.util.Collection) {
      return (java.util.Collection<String>) current;
    }
    return Arrays.asList((String) current);
  }
  /**
   * TODO.
   * @return healthPlanDrugOption property set by first invocation of healthPlanDrugOption method or {@code null}.
   */
  @JsonIgnore public String getHealthPlanDrugOption() {
    return (String) getValue("healthPlanDrugOption");
  }
  /**
   * TODO.
   * @return all healthPlanDrugOption properties as {@link java.util.Collection} or an empty collection 
   * if healthPlanDrugOption was not set.
   */
  @JsonIgnore public java.util.Collection<String> getHealthPlanDrugOptions() {
    final java.lang.Object current = myData.get("healthPlanDrugOption");
    if (current == null) return Collections.emptyList();
    if (current instanceof java.util.Collection) {
      return (java.util.Collection<String>) current;
    }
    return Arrays.asList((String) current);
  }
  /**
   * Networks covered by this plan.
   * @return includesHealthPlanNetwork property set by first invocation of includesHealthPlanNetwork method or {@code null}.
   */
  @JsonIgnore public HealthPlanNetwork getIncludesHealthPlanNetwork() {
    return (HealthPlanNetwork) getValue("includesHealthPlanNetwork");
  }
  /**
   * Networks covered by this plan.
   * @return all includesHealthPlanNetwork properties as {@link java.util.Collection} or an empty collection 
   * if includesHealthPlanNetwork was not set.
   */
  @JsonIgnore public java.util.Collection<HealthPlanNetwork> getIncludesHealthPlanNetworks() {
    final java.lang.Object current = myData.get("includesHealthPlanNetwork");
    if (current == null) return Collections.emptyList();
    if (current instanceof java.util.Collection) {
      return (java.util.Collection<HealthPlanNetwork>) current;
    }
    return Arrays.asList((HealthPlanNetwork) current);
  }
  /**
   * The URL that goes directly to the summary of benefits and coverage for the specific standard plan or plan variation.
   * @return benefitsSummaryUrl property set by first invocation of benefitsSummaryUrl method or {@code null}.
   */
  @JsonIgnore public String getBenefitsSummaryUrl() {
    return (String) getValue("benefitsSummaryUrl");
  }
  /**
   * The URL that goes directly to the summary of benefits and coverage for the specific standard plan or plan variation.
   * @return all benefitsSummaryUrl properties as {@link java.util.Collection} or an empty collection 
   * if benefitsSummaryUrl was not set.
   */
  @JsonIgnore public java.util.Collection<String> getBenefitsSummaryUrls() {
    final java.lang.Object current = myData.get("benefitsSummaryUrl");
    if (current == null) return Collections.emptyList();
    if (current instanceof java.util.Collection) {
      return (java.util.Collection<String>) current;
    }
    return Arrays.asList((String) current);
  }
  /**
   * The standard for interpreting thePlan ID. The preferred is &quot;HIOS&quot;. See the Centers for Medicare &amp; Medicaid Services for more details.
   * @return usesHealthPlanIdStandard property set by first invocation of usesHealthPlanIdStandard method or {@code null}.
   */
  @JsonIgnore public String getUsesHealthPlanIdStandard() {
    return (String) getValue("usesHealthPlanIdStandard");
  }
  /**
   * The standard for interpreting thePlan ID. The preferred is &quot;HIOS&quot;. See the Centers for Medicare &amp; Medicaid Services for more details.
   * @return all usesHealthPlanIdStandard properties as {@link java.util.Collection} or an empty collection 
   * if usesHealthPlanIdStandard was not set.
   */
  @JsonIgnore public java.util.Collection<String> getUsesHealthPlanIdStandards() {
    final java.lang.Object current = myData.get("usesHealthPlanIdStandard");
    if (current == null) return Collections.emptyList();
    if (current instanceof java.util.Collection) {
      return (java.util.Collection<String>) current;
    }
    return Arrays.asList((String) current);
  }
  protected HealthInsurancePlan(java.util.Map<String,java.lang.Object> data) {
    super(data);
  }
  /**
   * @return new {@link Builder} initialized with this instance's data
   */
  @NotNull public Builder toBuilder() {
    return new Builder(new HashMap<>(this.myData));
  }
  
  /**
   * Builder for {@link HealthInsurancePlan}
   */
  public static class Builder extends Intangible.Builder {
    public Builder(@NotNull HashMap<String,java.lang.Object> data) {
      super(data);
    }
    @NotNull public HealthInsurancePlan build() {
      return new HealthInsurancePlan(myData);
    }
    /**
     * Formularies covered by this plan.
     * @param healthPlanFormulary value to set
     * @return this builder instance
     */
    @NotNull public Builder includesHealthPlanFormulary(@NotNull HealthPlanFormulary healthPlanFormulary) {
      putValue("includesHealthPlanFormulary", healthPlanFormulary);
      return this;
    }
    /**
     * Formularies covered by this plan.
     * @param healthPlanFormulary value to set
     * @return this builder instance
     */
    @NotNull public Builder includesHealthPlanFormulary(@NotNull HealthPlanFormulary.Builder healthPlanFormulary) {
      putValue("includesHealthPlanFormulary", healthPlanFormulary.build());
      return this;
    }
    /**
     * Remove includesHealthPlanFormulary property from the builder.
     * If this property is repeatable, all instances are removed.
     * @return this builder instance
     */
    @NotNull public Builder removeIncludesHealthPlanFormulary() {
      removeValue("includesHealthPlanFormulary");
      return this;
    }
    /**
     * Get currently set value for includesHealthPlanFormulary property in this builder.
     * @return previously set value or {@code null}. If multiple values have been 
     * set to this property, then {@link java.util.Collection} instance will be 
     * returned.
     */
    @Nullable public java.lang.Object getIncludesHealthPlanFormulary() {
      return myData.get("includesHealthPlanFormulary");
    }
    /**
     * A contact point for a person or organization.
     * @param contactPoint value to set
     * @return this builder instance
     */
    @NotNull public Builder contactPoint(@NotNull ContactPoint contactPoint) {
      putValue("contactPoint", contactPoint);
      return this;
    }
    /**
     * A contact point for a person or organization.
     * @param contactPoint value to set
     * @return this builder instance
     */
    @NotNull public Builder contactPoint(@NotNull ContactPoint.Builder contactPoint) {
      putValue("contactPoint", contactPoint.build());
      return this;
    }
    /**
     * Remove contactPoint property from the builder.
     * If this property is repeatable, all instances are removed.
     * @return this builder instance
     */
    @NotNull public Builder removeContactPoint() {
      removeValue("contactPoint");
      return this;
    }
    /**
     * Get currently set value for contactPoint property in this builder.
     * @return previously set value or {@code null}. If multiple values have been 
     * set to this property, then {@link java.util.Collection} instance will be 
     * returned.
     */
    @Nullable public java.lang.Object getContactPoint() {
      return myData.get("contactPoint");
    }
    /**
     * The 14-character, HIOS-generated Plan ID number. (Plan IDs must be unique, even across different markets.)
     * @param healthPlanId value to set
     * @return this builder instance
     */
    @NotNull public Builder healthPlanId(@NotNull String healthPlanId) {
      putValue("healthPlanId", healthPlanId);
      return this;
    }
    /**
     * Remove healthPlanId property from the builder.
     * If this property is repeatable, all instances are removed.
     * @return this builder instance
     */
    @NotNull public Builder removeHealthPlanId() {
      removeValue("healthPlanId");
      return this;
    }
    /**
     * Get currently set value for healthPlanId property in this builder.
     * @return previously set value or {@code null}. If multiple values have been 
     * set to this property, then {@link java.util.Collection} instance will be 
     * returned.
     */
    @Nullable public java.lang.Object getHealthPlanId() {
      return myData.get("healthPlanId");
    }
    /**
     * The tier(s) of drugs offered by this formulary or insurance plan.
     * @param healthPlanDrugTier value to set
     * @return this builder instance
     */
    @NotNull public Builder healthPlanDrugTier(@NotNull String healthPlanDrugTier) {
      putValue("healthPlanDrugTier", healthPlanDrugTier);
      return this;
    }
    /**
     * Remove healthPlanDrugTier property from the builder.
     * If this property is repeatable, all instances are removed.
     * @return this builder instance
     */
    @NotNull public Builder removeHealthPlanDrugTier() {
      removeValue("healthPlanDrugTier");
      return this;
    }
    /**
     * Get currently set value for healthPlanDrugTier property in this builder.
     * @return previously set value or {@code null}. If multiple values have been 
     * set to this property, then {@link java.util.Collection} instance will be 
     * returned.
     */
    @Nullable public java.lang.Object getHealthPlanDrugTier() {
      return myData.get("healthPlanDrugTier");
    }
    /**
     * The URL that goes directly to the plan brochure for the specific standard plan or plan variation.
     * @param healthPlanMarketingUrl value to set
     * @return this builder instance
     */
    @NotNull public Builder healthPlanMarketingUrl(@NotNull String healthPlanMarketingUrl) {
      putValue("healthPlanMarketingUrl", healthPlanMarketingUrl);
      return this;
    }
    /**
     * Remove healthPlanMarketingUrl property from the builder.
     * If this property is repeatable, all instances are removed.
     * @return this builder instance
     */
    @NotNull public Builder removeHealthPlanMarketingUrl() {
      removeValue("healthPlanMarketingUrl");
      return this;
    }
    /**
     * Get currently set value for healthPlanMarketingUrl property in this builder.
     * @return previously set value or {@code null}. If multiple values have been 
     * set to this property, then {@link java.util.Collection} instance will be 
     * returned.
     */
    @Nullable public java.lang.Object getHealthPlanMarketingUrl() {
      return myData.get("healthPlanMarketingUrl");
    }
    /**
     * TODO.
     * @param healthPlanDrugOption value to set
     * @return this builder instance
     */
    @NotNull public Builder healthPlanDrugOption(@NotNull String healthPlanDrugOption) {
      putValue("healthPlanDrugOption", healthPlanDrugOption);
      return this;
    }
    /**
     * Remove healthPlanDrugOption property from the builder.
     * If this property is repeatable, all instances are removed.
     * @return this builder instance
     */
    @NotNull public Builder removeHealthPlanDrugOption() {
      removeValue("healthPlanDrugOption");
      return this;
    }
    /**
     * Get currently set value for healthPlanDrugOption property in this builder.
     * @return previously set value or {@code null}. If multiple values have been 
     * set to this property, then {@link java.util.Collection} instance will be 
     * returned.
     */
    @Nullable public java.lang.Object getHealthPlanDrugOption() {
      return myData.get("healthPlanDrugOption");
    }
    /**
     * Networks covered by this plan.
     * @param healthPlanNetwork value to set
     * @return this builder instance
     */
    @NotNull public Builder includesHealthPlanNetwork(@NotNull HealthPlanNetwork healthPlanNetwork) {
      putValue("includesHealthPlanNetwork", healthPlanNetwork);
      return this;
    }
    /**
     * Networks covered by this plan.
     * @param healthPlanNetwork value to set
     * @return this builder instance
     */
    @NotNull public Builder includesHealthPlanNetwork(@NotNull HealthPlanNetwork.Builder healthPlanNetwork) {
      putValue("includesHealthPlanNetwork", healthPlanNetwork.build());
      return this;
    }
    /**
     * Remove includesHealthPlanNetwork property from the builder.
     * If this property is repeatable, all instances are removed.
     * @return this builder instance
     */
    @NotNull public Builder removeIncludesHealthPlanNetwork() {
      removeValue("includesHealthPlanNetwork");
      return this;
    }
    /**
     * Get currently set value for includesHealthPlanNetwork property in this builder.
     * @return previously set value or {@code null}. If multiple values have been 
     * set to this property, then {@link java.util.Collection} instance will be 
     * returned.
     */
    @Nullable public java.lang.Object getIncludesHealthPlanNetwork() {
      return myData.get("includesHealthPlanNetwork");
    }
    /**
     * The URL that goes directly to the summary of benefits and coverage for the specific standard plan or plan variation.
     * @param benefitsSummaryUrl value to set
     * @return this builder instance
     */
    @NotNull public Builder benefitsSummaryUrl(@NotNull String benefitsSummaryUrl) {
      putValue("benefitsSummaryUrl", benefitsSummaryUrl);
      return this;
    }
    /**
     * Remove benefitsSummaryUrl property from the builder.
     * If this property is repeatable, all instances are removed.
     * @return this builder instance
     */
    @NotNull public Builder removeBenefitsSummaryUrl() {
      removeValue("benefitsSummaryUrl");
      return this;
    }
    /**
     * Get currently set value for benefitsSummaryUrl property in this builder.
     * @return previously set value or {@code null}. If multiple values have been 
     * set to this property, then {@link java.util.Collection} instance will be 
     * returned.
     */
    @Nullable public java.lang.Object getBenefitsSummaryUrl() {
      return myData.get("benefitsSummaryUrl");
    }
    /**
     * The standard for interpreting thePlan ID. The preferred is &quot;HIOS&quot;. See the Centers for Medicare &amp; Medicaid Services for more details.
     * @param usesHealthPlanIdStandard value to set
     * @return this builder instance
     */
    @NotNull public Builder usesHealthPlanIdStandard(@NotNull String usesHealthPlanIdStandard) {
      putValue("usesHealthPlanIdStandard", usesHealthPlanIdStandard);
      return this;
    }
    /**
     * Remove usesHealthPlanIdStandard property from the builder.
     * If this property is repeatable, all instances are removed.
     * @return this builder instance
     */
    @NotNull public Builder removeUsesHealthPlanIdStandard() {
      removeValue("usesHealthPlanIdStandard");
      return this;
    }
    /**
     * Get currently set value for usesHealthPlanIdStandard property in this builder.
     * @return previously set value or {@code null}. If multiple values have been 
     * set to this property, then {@link java.util.Collection} instance will be 
     * returned.
     */
    @Nullable public java.lang.Object getUsesHealthPlanIdStandard() {
      return myData.get("usesHealthPlanIdStandard");
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
      if ("includesHealthPlanFormulary".equals(key) && value instanceof HealthPlanFormulary) { this.includesHealthPlanFormulary((HealthPlanFormulary)value); return; }
      if ("includesHealthPlanFormularys".equals(key) && value instanceof HealthPlanFormulary) { this.includesHealthPlanFormulary((HealthPlanFormulary)value); return; }
      if ("contactPoint".equals(key) && value instanceof ContactPoint) { this.contactPoint((ContactPoint)value); return; }
      if ("contactPoints".equals(key) && value instanceof ContactPoint) { this.contactPoint((ContactPoint)value); return; }
      if ("healthPlanId".equals(key) && value instanceof String) { this.healthPlanId((String)value); return; }
      if ("healthPlanIds".equals(key) && value instanceof String) { this.healthPlanId((String)value); return; }
      if ("healthPlanDrugTier".equals(key) && value instanceof String) { this.healthPlanDrugTier((String)value); return; }
      if ("healthPlanDrugTiers".equals(key) && value instanceof String) { this.healthPlanDrugTier((String)value); return; }
      if ("healthPlanMarketingUrl".equals(key) && value instanceof String) { this.healthPlanMarketingUrl((String)value); return; }
      if ("healthPlanMarketingUrls".equals(key) && value instanceof String) { this.healthPlanMarketingUrl((String)value); return; }
      if ("healthPlanDrugOption".equals(key) && value instanceof String) { this.healthPlanDrugOption((String)value); return; }
      if ("healthPlanDrugOptions".equals(key) && value instanceof String) { this.healthPlanDrugOption((String)value); return; }
      if ("includesHealthPlanNetwork".equals(key) && value instanceof HealthPlanNetwork) { this.includesHealthPlanNetwork((HealthPlanNetwork)value); return; }
      if ("includesHealthPlanNetworks".equals(key) && value instanceof HealthPlanNetwork) { this.includesHealthPlanNetwork((HealthPlanNetwork)value); return; }
      if ("benefitsSummaryUrl".equals(key) && value instanceof String) { this.benefitsSummaryUrl((String)value); return; }
      if ("benefitsSummaryUrls".equals(key) && value instanceof String) { this.benefitsSummaryUrl((String)value); return; }
      if ("usesHealthPlanIdStandard".equals(key) && value instanceof String) { this.usesHealthPlanIdStandard((String)value); return; }
      if ("usesHealthPlanIdStandards".equals(key) && value instanceof String) { this.usesHealthPlanIdStandard((String)value); return; }
      super.fromMap(key, value);
    }
  }
  
}
