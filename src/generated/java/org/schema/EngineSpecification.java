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
 * Information about the engine of the vehicle. A vehicle can have multiple engines represented by multiple engine specification entities.Source: http://www.w3.org/wiki/WebSchemas/SchemaDotOrgSources#Automotive_Ontology_Working_Group
 */
public class EngineSpecification extends StructuredValue {
  /**
   * The type of fuel suitable for the engine or engines of the vehicle. If the vehicle has only one engine, this property can be attached directly to the vehicle.
   */
  @JsonIgnore public QualitativeValue getFuelTypeQualitativeValue() {
    return (QualitativeValue) getValue("fuelType");
  }
  /**
   * The type of fuel suitable for the engine or engines of the vehicle. If the vehicle has only one engine, this property can be attached directly to the vehicle.
   */
  @JsonIgnore public Collection<QualitativeValue> getFuelTypeQualitativeValues() {
    final Object current = myData.get("fuelType");
    if (current == null) return Collections.emptyList();
    if (current instanceof Collection) {
      return (Collection<QualitativeValue>) current;
    }
    return Arrays.asList((QualitativeValue) current);
  }
  /**
   * The type of fuel suitable for the engine or engines of the vehicle. If the vehicle has only one engine, this property can be attached directly to the vehicle.
   */
  @JsonIgnore public String getFuelTypeString() {
    return (String) getValue("fuelType");
  }
  /**
   * The type of fuel suitable for the engine or engines of the vehicle. If the vehicle has only one engine, this property can be attached directly to the vehicle.
   */
  @JsonIgnore public Collection<String> getFuelTypeStrings() {
    final Object current = myData.get("fuelType");
    if (current == null) return Collections.emptyList();
    if (current instanceof Collection) {
      return (Collection<String>) current;
    }
    return Arrays.asList((String) current);
  }
  /**
   * The torque (turning force) of the vehicle's engine.&lt;br/&gt;&lt;br/&gt;
   * 
   * Typical unit code(s): NU for newton metre (N m), F17 for pound-force per foot, or F48 for pound-force per inch&lt;br/&gt;&lt;br/&gt;
   * 
   * &lt;ul&gt;
   * &lt;li&gt;Note 1: You can link to information about how the given value has been determined (e.g. reference RPM) using the &lt;a class=&quot;localLink&quot; href=&quot;http://schema.org/valueReference&quot;&gt;valueReference&lt;/a&gt; property.&lt;/li&gt;
   * &lt;li&gt;Note 2: You can use &lt;a class=&quot;localLink&quot; href=&quot;http://schema.org/minValue&quot;&gt;minValue&lt;/a&gt; and &lt;a class=&quot;localLink&quot; href=&quot;http://schema.org/maxValue&quot;&gt;maxValue&lt;/a&gt; to indicate ranges.&lt;/li&gt;
   * &lt;/ul&gt;
   * 
   */
  @JsonIgnore public QuantitativeValue getTorque() {
    return (QuantitativeValue) getValue("torque");
  }
  /**
   * The torque (turning force) of the vehicle's engine.&lt;br/&gt;&lt;br/&gt;
   * 
   * Typical unit code(s): NU for newton metre (N m), F17 for pound-force per foot, or F48 for pound-force per inch&lt;br/&gt;&lt;br/&gt;
   * 
   * &lt;ul&gt;
   * &lt;li&gt;Note 1: You can link to information about how the given value has been determined (e.g. reference RPM) using the &lt;a class=&quot;localLink&quot; href=&quot;http://schema.org/valueReference&quot;&gt;valueReference&lt;/a&gt; property.&lt;/li&gt;
   * &lt;li&gt;Note 2: You can use &lt;a class=&quot;localLink&quot; href=&quot;http://schema.org/minValue&quot;&gt;minValue&lt;/a&gt; and &lt;a class=&quot;localLink&quot; href=&quot;http://schema.org/maxValue&quot;&gt;maxValue&lt;/a&gt; to indicate ranges.&lt;/li&gt;
   * &lt;/ul&gt;
   * 
   */
  @JsonIgnore public Collection<QuantitativeValue> getTorques() {
    final Object current = myData.get("torque");
    if (current == null) return Collections.emptyList();
    if (current instanceof Collection) {
      return (Collection<QuantitativeValue>) current;
    }
    return Arrays.asList((QuantitativeValue) current);
  }
  /**
   * The power of the vehicle's engine.
   *     Typical unit code(s): KWT for kilowatt, BHP for brake horsepower, N12 for metric horsepower (PS, with 1 PS = 735,49875 W)&lt;br/&gt;&lt;br/&gt;
   * 
   * &lt;ul&gt;
   * &lt;li&gt;Note 1: There are many different ways of measuring an engine's power. For an overview, see  &lt;a href=&quot;http://en.wikipedia.org/wiki/Horsepower#Engine_power_test_codes&quot;&gt;http://en.wikipedia.org/wiki/Horsepower#Engine&lt;em&gt;power&lt;/em&gt;test_codes&lt;/a&gt;.&lt;/li&gt;
   * &lt;li&gt;Note 2: You can link to information about how the given value has been determined using the &lt;a class=&quot;localLink&quot; href=&quot;http://schema.org/valueReference&quot;&gt;valueReference&lt;/a&gt; property.&lt;/li&gt;
   * &lt;li&gt;Note 3: You can use &lt;a class=&quot;localLink&quot; href=&quot;http://schema.org/minValue&quot;&gt;minValue&lt;/a&gt; and &lt;a class=&quot;localLink&quot; href=&quot;http://schema.org/maxValue&quot;&gt;maxValue&lt;/a&gt; to indicate ranges.&lt;/li&gt;
   * &lt;/ul&gt;
   * 
   */
  @JsonIgnore public QuantitativeValue getEnginePower() {
    return (QuantitativeValue) getValue("enginePower");
  }
  /**
   * The power of the vehicle's engine.
   *     Typical unit code(s): KWT for kilowatt, BHP for brake horsepower, N12 for metric horsepower (PS, with 1 PS = 735,49875 W)&lt;br/&gt;&lt;br/&gt;
   * 
   * &lt;ul&gt;
   * &lt;li&gt;Note 1: There are many different ways of measuring an engine's power. For an overview, see  &lt;a href=&quot;http://en.wikipedia.org/wiki/Horsepower#Engine_power_test_codes&quot;&gt;http://en.wikipedia.org/wiki/Horsepower#Engine&lt;em&gt;power&lt;/em&gt;test_codes&lt;/a&gt;.&lt;/li&gt;
   * &lt;li&gt;Note 2: You can link to information about how the given value has been determined using the &lt;a class=&quot;localLink&quot; href=&quot;http://schema.org/valueReference&quot;&gt;valueReference&lt;/a&gt; property.&lt;/li&gt;
   * &lt;li&gt;Note 3: You can use &lt;a class=&quot;localLink&quot; href=&quot;http://schema.org/minValue&quot;&gt;minValue&lt;/a&gt; and &lt;a class=&quot;localLink&quot; href=&quot;http://schema.org/maxValue&quot;&gt;maxValue&lt;/a&gt; to indicate ranges.&lt;/li&gt;
   * &lt;/ul&gt;
   * 
   */
  @JsonIgnore public Collection<QuantitativeValue> getEnginePowers() {
    final Object current = myData.get("enginePower");
    if (current == null) return Collections.emptyList();
    if (current instanceof Collection) {
      return (Collection<QuantitativeValue>) current;
    }
    return Arrays.asList((QuantitativeValue) current);
  }
  /**
   * The type of engine or engines powering the vehicle.
   */
  @JsonIgnore public QualitativeValue getEngineTypeQualitativeValue() {
    return (QualitativeValue) getValue("engineType");
  }
  /**
   * The type of engine or engines powering the vehicle.
   */
  @JsonIgnore public Collection<QualitativeValue> getEngineTypeQualitativeValues() {
    final Object current = myData.get("engineType");
    if (current == null) return Collections.emptyList();
    if (current instanceof Collection) {
      return (Collection<QualitativeValue>) current;
    }
    return Arrays.asList((QualitativeValue) current);
  }
  /**
   * The type of engine or engines powering the vehicle.
   */
  @JsonIgnore public String getEngineTypeString() {
    return (String) getValue("engineType");
  }
  /**
   * The type of engine or engines powering the vehicle.
   */
  @JsonIgnore public Collection<String> getEngineTypeStrings() {
    final Object current = myData.get("engineType");
    if (current == null) return Collections.emptyList();
    if (current instanceof Collection) {
      return (Collection<String>) current;
    }
    return Arrays.asList((String) current);
  }
  /**
   * The volume swept by all of the pistons inside the cylinders of an internal combustion engine in a single movement. &lt;br/&gt;&lt;br/&gt;
   * 
   * Typical unit code(s): CMQ for cubic centimeter, LTR for liters, INQ for cubic inches
   * * Note 1: You can link to information about how the given value has been determined using the &lt;a class=&quot;localLink&quot; href=&quot;http://schema.org/valueReference&quot;&gt;valueReference&lt;/a&gt; property.
   * * Note 2: You can use &lt;a class=&quot;localLink&quot; href=&quot;http://schema.org/minValue&quot;&gt;minValue&lt;/a&gt; and &lt;a class=&quot;localLink&quot; href=&quot;http://schema.org/maxValue&quot;&gt;maxValue&lt;/a&gt; to indicate ranges.
   */
  @JsonIgnore public QuantitativeValue getEngineDisplacement() {
    return (QuantitativeValue) getValue("engineDisplacement");
  }
  /**
   * The volume swept by all of the pistons inside the cylinders of an internal combustion engine in a single movement. &lt;br/&gt;&lt;br/&gt;
   * 
   * Typical unit code(s): CMQ for cubic centimeter, LTR for liters, INQ for cubic inches
   * * Note 1: You can link to information about how the given value has been determined using the &lt;a class=&quot;localLink&quot; href=&quot;http://schema.org/valueReference&quot;&gt;valueReference&lt;/a&gt; property.
   * * Note 2: You can use &lt;a class=&quot;localLink&quot; href=&quot;http://schema.org/minValue&quot;&gt;minValue&lt;/a&gt; and &lt;a class=&quot;localLink&quot; href=&quot;http://schema.org/maxValue&quot;&gt;maxValue&lt;/a&gt; to indicate ranges.
   */
  @JsonIgnore public Collection<QuantitativeValue> getEngineDisplacements() {
    final Object current = myData.get("engineDisplacement");
    if (current == null) return Collections.emptyList();
    if (current instanceof Collection) {
      return (Collection<QuantitativeValue>) current;
    }
    return Arrays.asList((QuantitativeValue) current);
  }
  protected EngineSpecification(java.util.Map<String,Object> data) {
    super(data);
  }
  
  /**
   * Builder for {@link EngineSpecification}
   */
  public static class Builder extends StructuredValue.Builder {
    public Builder(@NotNull HashMap<String,Object> data) {
      super(data);
    }
    @NotNull public EngineSpecification build() {
      return new EngineSpecification(myData);
    }
    /**
     * The type of fuel suitable for the engine or engines of the vehicle. If the vehicle has only one engine, this property can be attached directly to the vehicle.
     */
    @NotNull public Builder fuelType(@NotNull QualitativeValue qualitativeValue) {
      putValue("fuelType", qualitativeValue);
      return this;
    }
    /**
     * The type of fuel suitable for the engine or engines of the vehicle. If the vehicle has only one engine, this property can be attached directly to the vehicle.
     */
    @NotNull public Builder fuelType(@NotNull QualitativeValue.Builder qualitativeValue) {
      putValue("fuelType", qualitativeValue.build());
      return this;
    }
    /**
     * The type of fuel suitable for the engine or engines of the vehicle. If the vehicle has only one engine, this property can be attached directly to the vehicle.
     */
    @NotNull public Builder fuelType(@NotNull String fuelType) {
      putValue("fuelType", fuelType);
      return this;
    }
    /**
     * The torque (turning force) of the vehicle's engine.&lt;br/&gt;&lt;br/&gt;
     * 
     * Typical unit code(s): NU for newton metre (N m), F17 for pound-force per foot, or F48 for pound-force per inch&lt;br/&gt;&lt;br/&gt;
     * 
     * &lt;ul&gt;
     * &lt;li&gt;Note 1: You can link to information about how the given value has been determined (e.g. reference RPM) using the &lt;a class=&quot;localLink&quot; href=&quot;http://schema.org/valueReference&quot;&gt;valueReference&lt;/a&gt; property.&lt;/li&gt;
     * &lt;li&gt;Note 2: You can use &lt;a class=&quot;localLink&quot; href=&quot;http://schema.org/minValue&quot;&gt;minValue&lt;/a&gt; and &lt;a class=&quot;localLink&quot; href=&quot;http://schema.org/maxValue&quot;&gt;maxValue&lt;/a&gt; to indicate ranges.&lt;/li&gt;
     * &lt;/ul&gt;
     * 
     */
    @NotNull public Builder torque(@NotNull QuantitativeValue quantitativeValue) {
      putValue("torque", quantitativeValue);
      return this;
    }
    /**
     * The torque (turning force) of the vehicle's engine.&lt;br/&gt;&lt;br/&gt;
     * 
     * Typical unit code(s): NU for newton metre (N m), F17 for pound-force per foot, or F48 for pound-force per inch&lt;br/&gt;&lt;br/&gt;
     * 
     * &lt;ul&gt;
     * &lt;li&gt;Note 1: You can link to information about how the given value has been determined (e.g. reference RPM) using the &lt;a class=&quot;localLink&quot; href=&quot;http://schema.org/valueReference&quot;&gt;valueReference&lt;/a&gt; property.&lt;/li&gt;
     * &lt;li&gt;Note 2: You can use &lt;a class=&quot;localLink&quot; href=&quot;http://schema.org/minValue&quot;&gt;minValue&lt;/a&gt; and &lt;a class=&quot;localLink&quot; href=&quot;http://schema.org/maxValue&quot;&gt;maxValue&lt;/a&gt; to indicate ranges.&lt;/li&gt;
     * &lt;/ul&gt;
     * 
     */
    @NotNull public Builder torque(@NotNull QuantitativeValue.Builder quantitativeValue) {
      putValue("torque", quantitativeValue.build());
      return this;
    }
    /**
     * The power of the vehicle's engine.
     *     Typical unit code(s): KWT for kilowatt, BHP for brake horsepower, N12 for metric horsepower (PS, with 1 PS = 735,49875 W)&lt;br/&gt;&lt;br/&gt;
     * 
     * &lt;ul&gt;
     * &lt;li&gt;Note 1: There are many different ways of measuring an engine's power. For an overview, see  &lt;a href=&quot;http://en.wikipedia.org/wiki/Horsepower#Engine_power_test_codes&quot;&gt;http://en.wikipedia.org/wiki/Horsepower#Engine&lt;em&gt;power&lt;/em&gt;test_codes&lt;/a&gt;.&lt;/li&gt;
     * &lt;li&gt;Note 2: You can link to information about how the given value has been determined using the &lt;a class=&quot;localLink&quot; href=&quot;http://schema.org/valueReference&quot;&gt;valueReference&lt;/a&gt; property.&lt;/li&gt;
     * &lt;li&gt;Note 3: You can use &lt;a class=&quot;localLink&quot; href=&quot;http://schema.org/minValue&quot;&gt;minValue&lt;/a&gt; and &lt;a class=&quot;localLink&quot; href=&quot;http://schema.org/maxValue&quot;&gt;maxValue&lt;/a&gt; to indicate ranges.&lt;/li&gt;
     * &lt;/ul&gt;
     * 
     */
    @NotNull public Builder enginePower(@NotNull QuantitativeValue quantitativeValue) {
      putValue("enginePower", quantitativeValue);
      return this;
    }
    /**
     * The power of the vehicle's engine.
     *     Typical unit code(s): KWT for kilowatt, BHP for brake horsepower, N12 for metric horsepower (PS, with 1 PS = 735,49875 W)&lt;br/&gt;&lt;br/&gt;
     * 
     * &lt;ul&gt;
     * &lt;li&gt;Note 1: There are many different ways of measuring an engine's power. For an overview, see  &lt;a href=&quot;http://en.wikipedia.org/wiki/Horsepower#Engine_power_test_codes&quot;&gt;http://en.wikipedia.org/wiki/Horsepower#Engine&lt;em&gt;power&lt;/em&gt;test_codes&lt;/a&gt;.&lt;/li&gt;
     * &lt;li&gt;Note 2: You can link to information about how the given value has been determined using the &lt;a class=&quot;localLink&quot; href=&quot;http://schema.org/valueReference&quot;&gt;valueReference&lt;/a&gt; property.&lt;/li&gt;
     * &lt;li&gt;Note 3: You can use &lt;a class=&quot;localLink&quot; href=&quot;http://schema.org/minValue&quot;&gt;minValue&lt;/a&gt; and &lt;a class=&quot;localLink&quot; href=&quot;http://schema.org/maxValue&quot;&gt;maxValue&lt;/a&gt; to indicate ranges.&lt;/li&gt;
     * &lt;/ul&gt;
     * 
     */
    @NotNull public Builder enginePower(@NotNull QuantitativeValue.Builder quantitativeValue) {
      putValue("enginePower", quantitativeValue.build());
      return this;
    }
    /**
     * The type of engine or engines powering the vehicle.
     */
    @NotNull public Builder engineType(@NotNull QualitativeValue qualitativeValue) {
      putValue("engineType", qualitativeValue);
      return this;
    }
    /**
     * The type of engine or engines powering the vehicle.
     */
    @NotNull public Builder engineType(@NotNull QualitativeValue.Builder qualitativeValue) {
      putValue("engineType", qualitativeValue.build());
      return this;
    }
    /**
     * The type of engine or engines powering the vehicle.
     */
    @NotNull public Builder engineType(@NotNull String engineType) {
      putValue("engineType", engineType);
      return this;
    }
    /**
     * The volume swept by all of the pistons inside the cylinders of an internal combustion engine in a single movement. &lt;br/&gt;&lt;br/&gt;
     * 
     * Typical unit code(s): CMQ for cubic centimeter, LTR for liters, INQ for cubic inches
     * * Note 1: You can link to information about how the given value has been determined using the &lt;a class=&quot;localLink&quot; href=&quot;http://schema.org/valueReference&quot;&gt;valueReference&lt;/a&gt; property.
     * * Note 2: You can use &lt;a class=&quot;localLink&quot; href=&quot;http://schema.org/minValue&quot;&gt;minValue&lt;/a&gt; and &lt;a class=&quot;localLink&quot; href=&quot;http://schema.org/maxValue&quot;&gt;maxValue&lt;/a&gt; to indicate ranges.
     */
    @NotNull public Builder engineDisplacement(@NotNull QuantitativeValue quantitativeValue) {
      putValue("engineDisplacement", quantitativeValue);
      return this;
    }
    /**
     * The volume swept by all of the pistons inside the cylinders of an internal combustion engine in a single movement. &lt;br/&gt;&lt;br/&gt;
     * 
     * Typical unit code(s): CMQ for cubic centimeter, LTR for liters, INQ for cubic inches
     * * Note 1: You can link to information about how the given value has been determined using the &lt;a class=&quot;localLink&quot; href=&quot;http://schema.org/valueReference&quot;&gt;valueReference&lt;/a&gt; property.
     * * Note 2: You can use &lt;a class=&quot;localLink&quot; href=&quot;http://schema.org/minValue&quot;&gt;minValue&lt;/a&gt; and &lt;a class=&quot;localLink&quot; href=&quot;http://schema.org/maxValue&quot;&gt;maxValue&lt;/a&gt; to indicate ranges.
     */
    @NotNull public Builder engineDisplacement(@NotNull QuantitativeValue.Builder quantitativeValue) {
      putValue("engineDisplacement", quantitativeValue.build());
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
      if ("fuelType".equals(key) && value instanceof QualitativeValue) { this.fuelType((QualitativeValue)value); return; }
      if ("fuelTypes".equals(key) && value instanceof QualitativeValue) { this.fuelType((QualitativeValue)value); return; }
      if ("fuelType".equals(key) && value instanceof String) { this.fuelType((String)value); return; }
      if ("fuelTypes".equals(key) && value instanceof String) { this.fuelType((String)value); return; }
      if ("torque".equals(key) && value instanceof QuantitativeValue) { this.torque((QuantitativeValue)value); return; }
      if ("torques".equals(key) && value instanceof QuantitativeValue) { this.torque((QuantitativeValue)value); return; }
      if ("enginePower".equals(key) && value instanceof QuantitativeValue) { this.enginePower((QuantitativeValue)value); return; }
      if ("enginePowers".equals(key) && value instanceof QuantitativeValue) { this.enginePower((QuantitativeValue)value); return; }
      if ("engineType".equals(key) && value instanceof QualitativeValue) { this.engineType((QualitativeValue)value); return; }
      if ("engineTypes".equals(key) && value instanceof QualitativeValue) { this.engineType((QualitativeValue)value); return; }
      if ("engineType".equals(key) && value instanceof String) { this.engineType((String)value); return; }
      if ("engineTypes".equals(key) && value instanceof String) { this.engineType((String)value); return; }
      if ("engineDisplacement".equals(key) && value instanceof QuantitativeValue) { this.engineDisplacement((QuantitativeValue)value); return; }
      if ("engineDisplacements".equals(key) && value instanceof QuantitativeValue) { this.engineDisplacement((QuantitativeValue)value); return; }
      super.fromMap(key, value);
    }
  }
  
}
