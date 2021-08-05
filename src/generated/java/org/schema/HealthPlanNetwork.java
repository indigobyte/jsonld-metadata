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
 * A US-style health insurance plan network.Source: https://github.com/schemaorg/schemaorg/issues/1062
 */
public class HealthPlanNetwork extends Intangible {
  /**
   * Whether The costs to the patient for services under this network or formulary.
   */
  @JsonIgnore public Boolean getHealthPlanCostSharing() {
    return (Boolean) getValue("healthPlanCostSharing");
  }
  /**
   * Whether The costs to the patient for services under this network or formulary.
   */
  @JsonIgnore public Collection<Boolean> getHealthPlanCostSharings() {
    final Object current = myData.get("healthPlanCostSharing");
    if (current == null) return Collections.emptyList();
    if (current instanceof Collection) {
      return (Collection<Boolean>) current;
    }
    return Arrays.asList((Boolean) current);
  }
  /**
   * Name or unique ID of network. (Networks are often reused across different insurance plans).
   */
  @JsonIgnore public String getHealthPlanNetworkId() {
    return (String) getValue("healthPlanNetworkId");
  }
  /**
   * Name or unique ID of network. (Networks are often reused across different insurance plans).
   */
  @JsonIgnore public Collection<String> getHealthPlanNetworkIds() {
    final Object current = myData.get("healthPlanNetworkId");
    if (current == null) return Collections.emptyList();
    if (current instanceof Collection) {
      return (Collection<String>) current;
    }
    return Arrays.asList((String) current);
  }
  /**
   * The tier(s) for this network.
   */
  @JsonIgnore public String getHealthPlanNetworkTier() {
    return (String) getValue("healthPlanNetworkTier");
  }
  /**
   * The tier(s) for this network.
   */
  @JsonIgnore public Collection<String> getHealthPlanNetworkTiers() {
    final Object current = myData.get("healthPlanNetworkTier");
    if (current == null) return Collections.emptyList();
    if (current instanceof Collection) {
      return (Collection<String>) current;
    }
    return Arrays.asList((String) current);
  }
  protected HealthPlanNetwork(java.util.Map<String,Object> data) {
    super(data);
  }
  
  /**
   * Builder for {@link HealthPlanNetwork}
   */
  public static class Builder extends Intangible.Builder {
    public Builder(@NotNull HashMap<String,Object> data) {
      super(data);
    }
    @NotNull public HealthPlanNetwork build() {
      return new HealthPlanNetwork(myData);
    }
    /**
     * Whether The costs to the patient for services under this network or formulary.
     */
    @NotNull public Builder healthPlanCostSharing(@NotNull Boolean healthPlanCostSharing) {
      putValue("healthPlanCostSharing", healthPlanCostSharing);
      return this;
    }
    /**
     * Name or unique ID of network. (Networks are often reused across different insurance plans).
     */
    @NotNull public Builder healthPlanNetworkId(@NotNull String healthPlanNetworkId) {
      putValue("healthPlanNetworkId", healthPlanNetworkId);
      return this;
    }
    /**
     * The tier(s) for this network.
     */
    @NotNull public Builder healthPlanNetworkTier(@NotNull String healthPlanNetworkTier) {
      putValue("healthPlanNetworkTier", healthPlanNetworkTier);
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
      if ("healthPlanCostSharing".equals(key) && value instanceof Boolean) { this.healthPlanCostSharing((Boolean)value); return; }
      if ("healthPlanCostSharings".equals(key) && value instanceof Boolean) { this.healthPlanCostSharing((Boolean)value); return; }
      if ("healthPlanNetworkId".equals(key) && value instanceof String) { this.healthPlanNetworkId((String)value); return; }
      if ("healthPlanNetworkIds".equals(key) && value instanceof String) { this.healthPlanNetworkId((String)value); return; }
      if ("healthPlanNetworkTier".equals(key) && value instanceof String) { this.healthPlanNetworkTier((String)value); return; }
      if ("healthPlanNetworkTiers".equals(key) && value instanceof String) { this.healthPlanNetworkTier((String)value); return; }
      super.fromMap(key, value);
    }
  }
  
}
