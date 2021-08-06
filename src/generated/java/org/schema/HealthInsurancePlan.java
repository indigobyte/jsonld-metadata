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
 * A US-style health insurance plan, including PPOs, EPOs, and HMOs. 
 */
public class HealthInsurancePlan extends Intangible {
  /**
   * Formularies covered by this plan.
   */
  @JsonIgnore public HealthPlanFormulary getIncludesHealthPlanFormulary() {
    return (HealthPlanFormulary) getValue("includesHealthPlanFormulary");
  }
  /**
   * Formularies covered by this plan.
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
   */
  @JsonIgnore public ContactPoint getContactPoint() {
    return (ContactPoint) getValue("contactPoint");
  }
  /**
   * A contact point for a person or organization.
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
   */
  @JsonIgnore public String getHealthPlanId() {
    return (String) getValue("healthPlanId");
  }
  /**
   * The 14-character, HIOS-generated Plan ID number. (Plan IDs must be unique, even across different markets.)
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
   */
  @JsonIgnore public String getHealthPlanDrugTier() {
    return (String) getValue("healthPlanDrugTier");
  }
  /**
   * The tier(s) of drugs offered by this formulary or insurance plan.
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
   */
  @JsonIgnore public String getHealthPlanMarketingUrl() {
    return (String) getValue("healthPlanMarketingUrl");
  }
  /**
   * The URL that goes directly to the plan brochure for the specific standard plan or plan variation.
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
   */
  @JsonIgnore public String getHealthPlanDrugOption() {
    return (String) getValue("healthPlanDrugOption");
  }
  /**
   * TODO.
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
   */
  @JsonIgnore public HealthPlanNetwork getIncludesHealthPlanNetwork() {
    return (HealthPlanNetwork) getValue("includesHealthPlanNetwork");
  }
  /**
   * Networks covered by this plan.
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
   */
  @JsonIgnore public String getBenefitsSummaryUrl() {
    return (String) getValue("benefitsSummaryUrl");
  }
  /**
   * The URL that goes directly to the summary of benefits and coverage for the specific standard plan or plan variation.
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
   */
  @JsonIgnore public String getUsesHealthPlanIdStandard() {
    return (String) getValue("usesHealthPlanIdStandard");
  }
  /**
   * The standard for interpreting thePlan ID. The preferred is &quot;HIOS&quot;. See the Centers for Medicare &amp; Medicaid Services for more details.
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
     */
    @NotNull public Builder includesHealthPlanFormulary(@NotNull HealthPlanFormulary healthPlanFormulary) {
      putValue("includesHealthPlanFormulary", healthPlanFormulary);
      return this;
    }
    /**
     * Formularies covered by this plan.
     */
    @NotNull public Builder includesHealthPlanFormulary(@NotNull HealthPlanFormulary.Builder healthPlanFormulary) {
      putValue("includesHealthPlanFormulary", healthPlanFormulary.build());
      return this;
    }
    /**
     * A contact point for a person or organization.
     */
    @NotNull public Builder contactPoint(@NotNull ContactPoint contactPoint) {
      putValue("contactPoint", contactPoint);
      return this;
    }
    /**
     * A contact point for a person or organization.
     */
    @NotNull public Builder contactPoint(@NotNull ContactPoint.Builder contactPoint) {
      putValue("contactPoint", contactPoint.build());
      return this;
    }
    /**
     * The 14-character, HIOS-generated Plan ID number. (Plan IDs must be unique, even across different markets.)
     */
    @NotNull public Builder healthPlanId(@NotNull String healthPlanId) {
      putValue("healthPlanId", healthPlanId);
      return this;
    }
    /**
     * The tier(s) of drugs offered by this formulary or insurance plan.
     */
    @NotNull public Builder healthPlanDrugTier(@NotNull String healthPlanDrugTier) {
      putValue("healthPlanDrugTier", healthPlanDrugTier);
      return this;
    }
    /**
     * The URL that goes directly to the plan brochure for the specific standard plan or plan variation.
     */
    @NotNull public Builder healthPlanMarketingUrl(@NotNull String healthPlanMarketingUrl) {
      putValue("healthPlanMarketingUrl", healthPlanMarketingUrl);
      return this;
    }
    /**
     * TODO.
     */
    @NotNull public Builder healthPlanDrugOption(@NotNull String healthPlanDrugOption) {
      putValue("healthPlanDrugOption", healthPlanDrugOption);
      return this;
    }
    /**
     * Networks covered by this plan.
     */
    @NotNull public Builder includesHealthPlanNetwork(@NotNull HealthPlanNetwork healthPlanNetwork) {
      putValue("includesHealthPlanNetwork", healthPlanNetwork);
      return this;
    }
    /**
     * Networks covered by this plan.
     */
    @NotNull public Builder includesHealthPlanNetwork(@NotNull HealthPlanNetwork.Builder healthPlanNetwork) {
      putValue("includesHealthPlanNetwork", healthPlanNetwork.build());
      return this;
    }
    /**
     * The URL that goes directly to the summary of benefits and coverage for the specific standard plan or plan variation.
     */
    @NotNull public Builder benefitsSummaryUrl(@NotNull String benefitsSummaryUrl) {
      putValue("benefitsSummaryUrl", benefitsSummaryUrl);
      return this;
    }
    /**
     * The standard for interpreting thePlan ID. The preferred is &quot;HIOS&quot;. See the Centers for Medicare &amp; Medicaid Services for more details.
     */
    @NotNull public Builder usesHealthPlanIdStandard(@NotNull String usesHealthPlanIdStandard) {
      putValue("usesHealthPlanIdStandard", usesHealthPlanIdStandard);
      return this;
    }
    /**
     * The identifier property represents any kind of identifier for any kind of [[Thing]], such as ISBNs, GTIN codes, UUIDs etc. Schema.org provides dedicated properties for representing many of these, either as textual strings or as URL (URI) links. See [background notes](/docs/datamodel.html#identifierBg) for more details.
     *         
     */
    @NotNull public Builder identifier(@NotNull Identifier identifier) {
      putValue("identifier", identifier);
      return this;
    }
    /**
     * An image of the item. This can be a [[URL]] or a fully described [[ImageObject]].
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
     * A sub property of description. A short description of the item used to disambiguate from other, similar items. Information from other properties (in particular, name) may be necessary for the description to be useful for disambiguation.
     */
    @NotNull public Builder disambiguatingDescription(@NotNull String disambiguatingDescription) {
      putValue("disambiguatingDescription", disambiguatingDescription);
      return this;
    }
    /**
     * A description of the item.
     */
    @NotNull public Builder description(@NotNull String description) {
      putValue("description", description);
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
