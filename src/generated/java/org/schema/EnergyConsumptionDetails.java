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
 * EnergyConsumptionDetails represents information related to the energy efficiency of a product that consumes energy. The information that can be provided is based on international regulations such as for example [EU directive 2017/1369](https://eur-lex.europa.eu/eli/reg/2017/1369/oj) for energy labeling and the [Energy labeling rule](https://www.ftc.gov/enforcement/rules/rulemaking-regulatory-reform-proceedings/energy-water-use-labeling-consumer) under the Energy Policy and Conservation Act (EPCA) in the US.
 */
public class EnergyConsumptionDetails extends Intangible {
  /**
   * Defines the energy efficiency Category (which could be either a rating out of range of values or a yes/no certification) for a product according to an international energy efficiency standard.
   */
  @JsonIgnore public EnergyEfficiencyEnumeration getHasEnergyEfficiencyCategory() {
    return (EnergyEfficiencyEnumeration) getValue("hasEnergyEfficiencyCategory");
  }
  /**
   * Defines the energy efficiency Category (which could be either a rating out of range of values or a yes/no certification) for a product according to an international energy efficiency standard.
   */
  @JsonIgnore public java.util.Collection<EnergyEfficiencyEnumeration> getHasEnergyEfficiencyCategorys() {
    final Object current = myData.get("hasEnergyEfficiencyCategory");
    if (current == null) return Collections.emptyList();
    if (current instanceof java.util.Collection) {
      return (java.util.Collection<EnergyEfficiencyEnumeration>) current;
    }
    return Arrays.asList((EnergyEfficiencyEnumeration) current);
  }
  /**
   * Specifies the least energy efficient class on the regulated EU energy consumption scale for the product category a product belongs to. For example, energy consumption for televisions placed on the market after January 1, 2020 is scaled from D to A+++.
   */
  @JsonIgnore public EUEnergyEfficiencyEnumeration getEnergyEfficiencyScaleMin() {
    return (EUEnergyEfficiencyEnumeration) getValue("energyEfficiencyScaleMin");
  }
  /**
   * Specifies the least energy efficient class on the regulated EU energy consumption scale for the product category a product belongs to. For example, energy consumption for televisions placed on the market after January 1, 2020 is scaled from D to A+++.
   */
  @JsonIgnore public java.util.Collection<EUEnergyEfficiencyEnumeration> getEnergyEfficiencyScaleMins() {
    final Object current = myData.get("energyEfficiencyScaleMin");
    if (current == null) return Collections.emptyList();
    if (current instanceof java.util.Collection) {
      return (java.util.Collection<EUEnergyEfficiencyEnumeration>) current;
    }
    return Arrays.asList((EUEnergyEfficiencyEnumeration) current);
  }
  /**
   * Specifies the most energy efficient class on the regulated EU energy consumption scale for the product category a product belongs to. For example, energy consumption for televisions placed on the market after January 1, 2020 is scaled from D to A+++.
   */
  @JsonIgnore public EUEnergyEfficiencyEnumeration getEnergyEfficiencyScaleMax() {
    return (EUEnergyEfficiencyEnumeration) getValue("energyEfficiencyScaleMax");
  }
  /**
   * Specifies the most energy efficient class on the regulated EU energy consumption scale for the product category a product belongs to. For example, energy consumption for televisions placed on the market after January 1, 2020 is scaled from D to A+++.
   */
  @JsonIgnore public java.util.Collection<EUEnergyEfficiencyEnumeration> getEnergyEfficiencyScaleMaxs() {
    final Object current = myData.get("energyEfficiencyScaleMax");
    if (current == null) return Collections.emptyList();
    if (current instanceof java.util.Collection) {
      return (java.util.Collection<EUEnergyEfficiencyEnumeration>) current;
    }
    return Arrays.asList((EUEnergyEfficiencyEnumeration) current);
  }
  protected EnergyConsumptionDetails(java.util.Map<String,Object> data) {
    super(data);
  }
  
  /**
   * Builder for {@link EnergyConsumptionDetails}
   */
  public static class Builder extends Intangible.Builder {
    public Builder(@NotNull HashMap<String,Object> data) {
      super(data);
    }
    @NotNull public EnergyConsumptionDetails build() {
      return new EnergyConsumptionDetails(myData);
    }
    /**
     * Defines the energy efficiency Category (which could be either a rating out of range of values or a yes/no certification) for a product according to an international energy efficiency standard.
     */
    @NotNull public Builder hasEnergyEfficiencyCategory(@NotNull EnergyEfficiencyEnumeration energyEfficiencyEnumeration) {
      putValue("hasEnergyEfficiencyCategory", energyEfficiencyEnumeration);
      return this;
    }
    /**
     * Specifies the least energy efficient class on the regulated EU energy consumption scale for the product category a product belongs to. For example, energy consumption for televisions placed on the market after January 1, 2020 is scaled from D to A+++.
     */
    @NotNull public Builder energyEfficiencyScaleMin(@NotNull EUEnergyEfficiencyEnumeration eUEnergyEfficiencyEnumeration) {
      putValue("energyEfficiencyScaleMin", eUEnergyEfficiencyEnumeration);
      return this;
    }
    /**
     * Specifies the most energy efficient class on the regulated EU energy consumption scale for the product category a product belongs to. For example, energy consumption for televisions placed on the market after January 1, 2020 is scaled from D to A+++.
     */
    @NotNull public Builder energyEfficiencyScaleMax(@NotNull EUEnergyEfficiencyEnumeration eUEnergyEfficiencyEnumeration) {
      putValue("energyEfficiencyScaleMax", eUEnergyEfficiencyEnumeration);
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
    @Override protected void fromMap(String key, Object value) {
      if ("hasEnergyEfficiencyCategory".equals(key) && value instanceof EnergyEfficiencyEnumeration) { this.hasEnergyEfficiencyCategory((EnergyEfficiencyEnumeration)value); return; }
      if ("hasEnergyEfficiencyCategorys".equals(key) && value instanceof EnergyEfficiencyEnumeration) { this.hasEnergyEfficiencyCategory((EnergyEfficiencyEnumeration)value); return; }
      if ("energyEfficiencyScaleMin".equals(key) && value instanceof EUEnergyEfficiencyEnumeration) { this.energyEfficiencyScaleMin((EUEnergyEfficiencyEnumeration)value); return; }
      if ("energyEfficiencyScaleMins".equals(key) && value instanceof EUEnergyEfficiencyEnumeration) { this.energyEfficiencyScaleMin((EUEnergyEfficiencyEnumeration)value); return; }
      if ("energyEfficiencyScaleMax".equals(key) && value instanceof EUEnergyEfficiencyEnumeration) { this.energyEfficiencyScaleMax((EUEnergyEfficiencyEnumeration)value); return; }
      if ("energyEfficiencyScaleMaxs".equals(key) && value instanceof EUEnergyEfficiencyEnumeration) { this.energyEfficiencyScaleMax((EUEnergyEfficiencyEnumeration)value); return; }
      super.fromMap(key, value);
    }
  }
  
}
