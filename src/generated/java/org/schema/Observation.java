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
 * Instances of the class [[Observation]] are used to specify observations about an entity (which may or may not be an instance of a [[StatisticalPopulation]]), at a particular time. The principal properties of an [[Observation]] are [[observedNode]], [[measuredProperty]], [[measuredValue]] (or [[median]], etc.) and [[observationDate]] ([[measuredProperty]] properties can, but need not always, be W3C RDF Data Cube &quot;measure properties&quot;, as in the [lifeExpectancy example](https://www.w3.org/TR/vocab-data-cube/#dsd-example)).
 * See also [[StatisticalPopulation]], and the [data and datasets](/docs/data-and-datasets.html) overview for more details.
 *   
 */
public class Observation extends Intangible {
  /**
   * The observedNode of an [[Observation]], often a [[StatisticalPopulation]].
   */
  @JsonIgnore public StatisticalPopulation getObservedNode() {
    return (StatisticalPopulation) getValue("observedNode");
  }
  /**
   * The observedNode of an [[Observation]], often a [[StatisticalPopulation]].
   */
  @JsonIgnore public java.util.Collection<StatisticalPopulation> getObservedNodes() {
    final Object current = myData.get("observedNode");
    if (current == null) return Collections.emptyList();
    if (current instanceof java.util.Collection) {
      return (java.util.Collection<StatisticalPopulation>) current;
    }
    return Arrays.asList((StatisticalPopulation) current);
  }
  /**
   * The measuredProperty of an [[Observation]], either a schema.org property, a property from other RDF-compatible systems e.g. W3C RDF Data Cube, or schema.org extensions such as [GS1's](https://www.gs1.org/voc/?show=properties).
   */
  @JsonIgnore public Property getMeasuredProperty() {
    return (Property) getValue("measuredProperty");
  }
  /**
   * The measuredProperty of an [[Observation]], either a schema.org property, a property from other RDF-compatible systems e.g. W3C RDF Data Cube, or schema.org extensions such as [GS1's](https://www.gs1.org/voc/?show=properties).
   */
  @JsonIgnore public java.util.Collection<Property> getMeasuredPropertys() {
    final Object current = myData.get("measuredProperty");
    if (current == null) return Collections.emptyList();
    if (current instanceof java.util.Collection) {
      return (java.util.Collection<Property>) current;
    }
    return Arrays.asList((Property) current);
  }
  /**
   * The observationDate of an [[Observation]].
   */
  @JsonIgnore public java.util.Date getObservationDate() {
    return (java.util.Date) getValue("observationDate");
  }
  /**
   * The observationDate of an [[Observation]].
   */
  @JsonIgnore public java.util.Collection<java.util.Date> getObservationDates() {
    final Object current = myData.get("observationDate");
    if (current == null) return Collections.emptyList();
    if (current instanceof java.util.Collection) {
      return (java.util.Collection<java.util.Date>) current;
    }
    return Arrays.asList((java.util.Date) current);
  }
  /**
   * A marginOfError for an [[Observation]].
   */
  @JsonIgnore public QuantitativeValue getMarginOfError() {
    return (QuantitativeValue) getValue("marginOfError");
  }
  /**
   * A marginOfError for an [[Observation]].
   */
  @JsonIgnore public java.util.Collection<QuantitativeValue> getMarginOfErrors() {
    final Object current = myData.get("marginOfError");
    if (current == null) return Collections.emptyList();
    if (current instanceof java.util.Collection) {
      return (java.util.Collection<QuantitativeValue>) current;
    }
    return Arrays.asList((QuantitativeValue) current);
  }
  /**
   * The measuredValue of an [[Observation]].
   */
  @JsonIgnore public DataType getMeasuredValue() {
    return (DataType) getValue("measuredValue");
  }
  /**
   * The measuredValue of an [[Observation]].
   */
  @JsonIgnore public java.util.Collection<DataType> getMeasuredValues() {
    final Object current = myData.get("measuredValue");
    if (current == null) return Collections.emptyList();
    if (current instanceof java.util.Collection) {
      return (java.util.Collection<DataType>) current;
    }
    return Arrays.asList((DataType) current);
  }
  protected Observation(java.util.Map<String,Object> data) {
    super(data);
  }
  
  /**
   * Builder for {@link Observation}
   */
  public static class Builder extends Intangible.Builder {
    public Builder(@NotNull HashMap<String,Object> data) {
      super(data);
    }
    @NotNull public Observation build() {
      return new Observation(myData);
    }
    /**
     * The observedNode of an [[Observation]], often a [[StatisticalPopulation]].
     */
    @NotNull public Builder observedNode(@NotNull StatisticalPopulation statisticalPopulation) {
      putValue("observedNode", statisticalPopulation);
      return this;
    }
    /**
     * The observedNode of an [[Observation]], often a [[StatisticalPopulation]].
     */
    @NotNull public Builder observedNode(@NotNull StatisticalPopulation.Builder statisticalPopulation) {
      putValue("observedNode", statisticalPopulation.build());
      return this;
    }
    /**
     * The measuredProperty of an [[Observation]], either a schema.org property, a property from other RDF-compatible systems e.g. W3C RDF Data Cube, or schema.org extensions such as [GS1's](https://www.gs1.org/voc/?show=properties).
     */
    @NotNull public Builder measuredProperty(@NotNull Property property) {
      putValue("measuredProperty", property);
      return this;
    }
    /**
     * The measuredProperty of an [[Observation]], either a schema.org property, a property from other RDF-compatible systems e.g. W3C RDF Data Cube, or schema.org extensions such as [GS1's](https://www.gs1.org/voc/?show=properties).
     */
    @NotNull public Builder measuredProperty(@NotNull Property.Builder property) {
      putValue("measuredProperty", property.build());
      return this;
    }
    /**
     * The observationDate of an [[Observation]].
     */
    @NotNull public Builder observationDate(@NotNull java.util.Date date) {
      putValue("observationDate", date);
      return this;
    }
    /**
     * A marginOfError for an [[Observation]].
     */
    @NotNull public Builder marginOfError(@NotNull QuantitativeValue quantitativeValue) {
      putValue("marginOfError", quantitativeValue);
      return this;
    }
    /**
     * A marginOfError for an [[Observation]].
     */
    @NotNull public Builder marginOfError(@NotNull QuantitativeValue.Builder quantitativeValue) {
      putValue("marginOfError", quantitativeValue.build());
      return this;
    }
    /**
     * The measuredValue of an [[Observation]].
     */
    @NotNull public Builder measuredValue(@NotNull DataType dataType) {
      putValue("measuredValue", dataType);
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
      if ("observedNode".equals(key) && value instanceof StatisticalPopulation) { this.observedNode((StatisticalPopulation)value); return; }
      if ("observedNodes".equals(key) && value instanceof StatisticalPopulation) { this.observedNode((StatisticalPopulation)value); return; }
      if ("measuredProperty".equals(key) && value instanceof Property) { this.measuredProperty((Property)value); return; }
      if ("measuredPropertys".equals(key) && value instanceof Property) { this.measuredProperty((Property)value); return; }
      if ("observationDate".equals(key) && value instanceof java.util.Date) { this.observationDate((java.util.Date)value); return; }
      if ("observationDates".equals(key) && value instanceof java.util.Date) { this.observationDate((java.util.Date)value); return; }
      if ("marginOfError".equals(key) && value instanceof QuantitativeValue) { this.marginOfError((QuantitativeValue)value); return; }
      if ("marginOfErrors".equals(key) && value instanceof QuantitativeValue) { this.marginOfError((QuantitativeValue)value); return; }
      if ("measuredValue".equals(key) && value instanceof DataType) { this.measuredValue((DataType)value); return; }
      if ("measuredValues".equals(key) && value instanceof DataType) { this.measuredValue((DataType)value); return; }
      super.fromMap(key, value);
    }
  }
  
}
