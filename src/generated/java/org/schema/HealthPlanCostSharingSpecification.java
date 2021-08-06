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
 * A description of costs to the patient under a given network or formulary.
 */
public class HealthPlanCostSharingSpecification extends Intangible {
  /**
   * Whether The rate of coinsurance expressed as a number between 0.0 and 1.0.
   */
  @JsonIgnore public Integer getHealthPlanCoinsuranceRateInteger() {
    return (Integer) getValue("healthPlanCoinsuranceRate");
  }
  /**
   * Whether The rate of coinsurance expressed as a number between 0.0 and 1.0.
   */
  @JsonIgnore public java.util.Collection<Integer> getHealthPlanCoinsuranceRateIntegers() {
    final java.lang.Object current = myData.get("healthPlanCoinsuranceRate");
    if (current == null) return Collections.emptyList();
    if (current instanceof java.util.Collection) {
      return (java.util.Collection<Integer>) current;
    }
    return Arrays.asList((Integer) current);
  }
  /**
   * Whether The rate of coinsurance expressed as a number between 0.0 and 1.0.
   */
  @JsonIgnore public Long getHealthPlanCoinsuranceRateLong() {
    return (Long) getValue("healthPlanCoinsuranceRate");
  }
  /**
   * Whether The rate of coinsurance expressed as a number between 0.0 and 1.0.
   */
  @JsonIgnore public java.util.Collection<Long> getHealthPlanCoinsuranceRateLongs() {
    final java.lang.Object current = myData.get("healthPlanCoinsuranceRate");
    if (current == null) return Collections.emptyList();
    if (current instanceof java.util.Collection) {
      return (java.util.Collection<Long>) current;
    }
    return Arrays.asList((Long) current);
  }
  /**
   * Whether The rate of coinsurance expressed as a number between 0.0 and 1.0.
   */
  @JsonIgnore public Float getHealthPlanCoinsuranceRateFloat() {
    return (Float) getValue("healthPlanCoinsuranceRate");
  }
  /**
   * Whether The rate of coinsurance expressed as a number between 0.0 and 1.0.
   */
  @JsonIgnore public java.util.Collection<Float> getHealthPlanCoinsuranceRateFloats() {
    final java.lang.Object current = myData.get("healthPlanCoinsuranceRate");
    if (current == null) return Collections.emptyList();
    if (current instanceof java.util.Collection) {
      return (java.util.Collection<Float>) current;
    }
    return Arrays.asList((Float) current);
  }
  /**
   * Whether The rate of coinsurance expressed as a number between 0.0 and 1.0.
   */
  @JsonIgnore public Double getHealthPlanCoinsuranceRateDouble() {
    return (Double) getValue("healthPlanCoinsuranceRate");
  }
  /**
   * Whether The rate of coinsurance expressed as a number between 0.0 and 1.0.
   */
  @JsonIgnore public java.util.Collection<Double> getHealthPlanCoinsuranceRateDoubles() {
    final java.lang.Object current = myData.get("healthPlanCoinsuranceRate");
    if (current == null) return Collections.emptyList();
    if (current instanceof java.util.Collection) {
      return (java.util.Collection<Double>) current;
    }
    return Arrays.asList((Double) current);
  }
  /**
   * Whether The rate of coinsurance expressed as a number between 0.0 and 1.0.
   */
  @JsonIgnore public String getHealthPlanCoinsuranceRateString() {
    return (String) getValue("healthPlanCoinsuranceRate");
  }
  /**
   * Whether The rate of coinsurance expressed as a number between 0.0 and 1.0.
   */
  @JsonIgnore public java.util.Collection<String> getHealthPlanCoinsuranceRateStrings() {
    final java.lang.Object current = myData.get("healthPlanCoinsuranceRate");
    if (current == null) return Collections.emptyList();
    if (current instanceof java.util.Collection) {
      return (java.util.Collection<String>) current;
    }
    return Arrays.asList((String) current);
  }
  /**
   * Whether the copay is before or after deductible, etc. TODO: Is this a closed set?
   */
  @JsonIgnore public String getHealthPlanCopayOption() {
    return (String) getValue("healthPlanCopayOption");
  }
  /**
   * Whether the copay is before or after deductible, etc. TODO: Is this a closed set?
   */
  @JsonIgnore public java.util.Collection<String> getHealthPlanCopayOptions() {
    final java.lang.Object current = myData.get("healthPlanCopayOption");
    if (current == null) return Collections.emptyList();
    if (current instanceof java.util.Collection) {
      return (java.util.Collection<String>) current;
    }
    return Arrays.asList((String) current);
  }
  /**
   * Whether the coinsurance applies before or after deductible, etc. TODO: Is this a closed set?
   */
  @JsonIgnore public String getHealthPlanCoinsuranceOption() {
    return (String) getValue("healthPlanCoinsuranceOption");
  }
  /**
   * Whether the coinsurance applies before or after deductible, etc. TODO: Is this a closed set?
   */
  @JsonIgnore public java.util.Collection<String> getHealthPlanCoinsuranceOptions() {
    final java.lang.Object current = myData.get("healthPlanCoinsuranceOption");
    if (current == null) return Collections.emptyList();
    if (current instanceof java.util.Collection) {
      return (java.util.Collection<String>) current;
    }
    return Arrays.asList((String) current);
  }
  /**
   * Whether The copay amount.
   */
  @JsonIgnore public PriceSpecification getHealthPlanCopay() {
    return (PriceSpecification) getValue("healthPlanCopay");
  }
  /**
   * Whether The copay amount.
   */
  @JsonIgnore public java.util.Collection<PriceSpecification> getHealthPlanCopays() {
    final java.lang.Object current = myData.get("healthPlanCopay");
    if (current == null) return Collections.emptyList();
    if (current instanceof java.util.Collection) {
      return (java.util.Collection<PriceSpecification>) current;
    }
    return Arrays.asList((PriceSpecification) current);
  }
  /**
   * The category or type of pharmacy associated with this cost sharing.
   */
  @JsonIgnore public String getHealthPlanPharmacyCategory() {
    return (String) getValue("healthPlanPharmacyCategory");
  }
  /**
   * The category or type of pharmacy associated with this cost sharing.
   */
  @JsonIgnore public java.util.Collection<String> getHealthPlanPharmacyCategorys() {
    final java.lang.Object current = myData.get("healthPlanPharmacyCategory");
    if (current == null) return Collections.emptyList();
    if (current instanceof java.util.Collection) {
      return (java.util.Collection<String>) current;
    }
    return Arrays.asList((String) current);
  }
  protected HealthPlanCostSharingSpecification(java.util.Map<String,java.lang.Object> data) {
    super(data);
  }
  
  /**
   * Builder for {@link HealthPlanCostSharingSpecification}
   */
  public static class Builder extends Intangible.Builder {
    public Builder(@NotNull HashMap<String,java.lang.Object> data) {
      super(data);
    }
    @NotNull public HealthPlanCostSharingSpecification build() {
      return new HealthPlanCostSharingSpecification(myData);
    }
    /**
     * Whether The rate of coinsurance expressed as a number between 0.0 and 1.0.
     */
    @NotNull public Builder healthPlanCoinsuranceRate(@NotNull Integer integer) {
      putValue("healthPlanCoinsuranceRate", integer);
      return this;
    }
    /**
     * Whether The rate of coinsurance expressed as a number between 0.0 and 1.0.
     */
    @NotNull public Builder healthPlanCoinsuranceRate(@NotNull Long healthPlanCoinsuranceRate) {
      putValue("healthPlanCoinsuranceRate", healthPlanCoinsuranceRate);
      return this;
    }
    /**
     * Whether The rate of coinsurance expressed as a number between 0.0 and 1.0.
     */
    @NotNull public Builder healthPlanCoinsuranceRate(@NotNull Float healthPlanCoinsuranceRate) {
      putValue("healthPlanCoinsuranceRate", healthPlanCoinsuranceRate);
      return this;
    }
    /**
     * Whether The rate of coinsurance expressed as a number between 0.0 and 1.0.
     */
    @NotNull public Builder healthPlanCoinsuranceRate(@NotNull Double healthPlanCoinsuranceRate) {
      putValue("healthPlanCoinsuranceRate", healthPlanCoinsuranceRate);
      return this;
    }
    /**
     * Whether The rate of coinsurance expressed as a number between 0.0 and 1.0.
     */
    @NotNull public Builder healthPlanCoinsuranceRate(@NotNull String healthPlanCoinsuranceRate) {
      putValue("healthPlanCoinsuranceRate", healthPlanCoinsuranceRate);
      return this;
    }
    /**
     * Whether the copay is before or after deductible, etc. TODO: Is this a closed set?
     */
    @NotNull public Builder healthPlanCopayOption(@NotNull String healthPlanCopayOption) {
      putValue("healthPlanCopayOption", healthPlanCopayOption);
      return this;
    }
    /**
     * Whether the coinsurance applies before or after deductible, etc. TODO: Is this a closed set?
     */
    @NotNull public Builder healthPlanCoinsuranceOption(@NotNull String healthPlanCoinsuranceOption) {
      putValue("healthPlanCoinsuranceOption", healthPlanCoinsuranceOption);
      return this;
    }
    /**
     * Whether The copay amount.
     */
    @NotNull public Builder healthPlanCopay(@NotNull PriceSpecification priceSpecification) {
      putValue("healthPlanCopay", priceSpecification);
      return this;
    }
    /**
     * Whether The copay amount.
     */
    @NotNull public Builder healthPlanCopay(@NotNull PriceSpecification.Builder priceSpecification) {
      putValue("healthPlanCopay", priceSpecification.build());
      return this;
    }
    /**
     * The category or type of pharmacy associated with this cost sharing.
     */
    @NotNull public Builder healthPlanPharmacyCategory(@NotNull String healthPlanPharmacyCategory) {
      putValue("healthPlanPharmacyCategory", healthPlanPharmacyCategory);
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
      if ("healthPlanCoinsuranceRate".equals(key) && value instanceof Integer) { this.healthPlanCoinsuranceRate((Integer)value); return; }
      if ("healthPlanCoinsuranceRates".equals(key) && value instanceof Integer) { this.healthPlanCoinsuranceRate((Integer)value); return; }
      if ("healthPlanCoinsuranceRate".equals(key) && value instanceof Long) { this.healthPlanCoinsuranceRate((Long)value); return; }
      if ("healthPlanCoinsuranceRates".equals(key) && value instanceof Long) { this.healthPlanCoinsuranceRate((Long)value); return; }
      if ("healthPlanCoinsuranceRate".equals(key) && value instanceof Float) { this.healthPlanCoinsuranceRate((Float)value); return; }
      if ("healthPlanCoinsuranceRates".equals(key) && value instanceof Float) { this.healthPlanCoinsuranceRate((Float)value); return; }
      if ("healthPlanCoinsuranceRate".equals(key) && value instanceof Double) { this.healthPlanCoinsuranceRate((Double)value); return; }
      if ("healthPlanCoinsuranceRates".equals(key) && value instanceof Double) { this.healthPlanCoinsuranceRate((Double)value); return; }
      if ("healthPlanCoinsuranceRate".equals(key) && value instanceof String) { this.healthPlanCoinsuranceRate((String)value); return; }
      if ("healthPlanCoinsuranceRates".equals(key) && value instanceof String) { this.healthPlanCoinsuranceRate((String)value); return; }
      if ("healthPlanCopayOption".equals(key) && value instanceof String) { this.healthPlanCopayOption((String)value); return; }
      if ("healthPlanCopayOptions".equals(key) && value instanceof String) { this.healthPlanCopayOption((String)value); return; }
      if ("healthPlanCoinsuranceOption".equals(key) && value instanceof String) { this.healthPlanCoinsuranceOption((String)value); return; }
      if ("healthPlanCoinsuranceOptions".equals(key) && value instanceof String) { this.healthPlanCoinsuranceOption((String)value); return; }
      if ("healthPlanCopay".equals(key) && value instanceof PriceSpecification) { this.healthPlanCopay((PriceSpecification)value); return; }
      if ("healthPlanCopays".equals(key) && value instanceof PriceSpecification) { this.healthPlanCopay((PriceSpecification)value); return; }
      if ("healthPlanPharmacyCategory".equals(key) && value instanceof String) { this.healthPlanPharmacyCategory((String)value); return; }
      if ("healthPlanPharmacyCategorys".equals(key) && value instanceof String) { this.healthPlanPharmacyCategory((String)value); return; }
      super.fromMap(key, value);
    }
  }
  
}
