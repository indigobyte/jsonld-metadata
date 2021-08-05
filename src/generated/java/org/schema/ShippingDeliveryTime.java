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
 * ShippingDeliveryTime provides various pieces of information about delivery times for shipping.
 */
public class ShippingDeliveryTime extends StructuredValue {
  /**
   * The typical delay the order has been sent for delivery and the goods reach the final customer. Typical properties: minValue, maxValue, unitCode (d for DAY).
   */
  @JsonIgnore public QuantitativeValue getTransitTime() {
    return (QuantitativeValue) getValue("transitTime");
  }
  /**
   * The typical delay the order has been sent for delivery and the goods reach the final customer. Typical properties: minValue, maxValue, unitCode (d for DAY).
   */
  @JsonIgnore public java.util.Collection<QuantitativeValue> getTransitTimes() {
    final Object current = myData.get("transitTime");
    if (current == null) return Collections.emptyList();
    if (current instanceof java.util.Collection) {
      return (java.util.Collection<QuantitativeValue>) current;
    }
    return Arrays.asList((QuantitativeValue) current);
  }
  /**
   * Order cutoff time allows merchants to describe the time after which they will no longer process orders received on that day. For orders processed after cutoff time, one day gets added to the delivery time estimate. This property is expected to be most typically used via the [[ShippingRateSettings]] publication pattern. The time is indicated using the ISO-8601 Time format, e.g. &quot;23:30:00-05:00&quot; would represent 6:30 pm Eastern Standard Time (EST) which is 5 hours behind Coordinated Universal Time (UTC).
   */
  @JsonIgnore public java.util.Date getCutoffTime() {
    return (java.util.Date) getValue("cutoffTime");
  }
  /**
   * Order cutoff time allows merchants to describe the time after which they will no longer process orders received on that day. For orders processed after cutoff time, one day gets added to the delivery time estimate. This property is expected to be most typically used via the [[ShippingRateSettings]] publication pattern. The time is indicated using the ISO-8601 Time format, e.g. &quot;23:30:00-05:00&quot; would represent 6:30 pm Eastern Standard Time (EST) which is 5 hours behind Coordinated Universal Time (UTC).
   */
  @JsonIgnore public java.util.Collection<java.util.Date> getCutoffTimes() {
    final Object current = myData.get("cutoffTime");
    if (current == null) return Collections.emptyList();
    if (current instanceof java.util.Collection) {
      return (java.util.Collection<java.util.Date>) current;
    }
    return Arrays.asList((java.util.Date) current);
  }
  /**
   * The typical delay between the receipt of the order and the goods either leaving the warehouse or being prepared for pickup, in case the delivery method is on site pickup. Typical properties: minValue, maxValue, unitCode (d for DAY).  This is by common convention assumed to mean business days (if a unitCode is used, coded as &quot;d&quot;), i.e. only counting days when the business normally operates.
   */
  @JsonIgnore public QuantitativeValue getHandlingTime() {
    return (QuantitativeValue) getValue("handlingTime");
  }
  /**
   * The typical delay between the receipt of the order and the goods either leaving the warehouse or being prepared for pickup, in case the delivery method is on site pickup. Typical properties: minValue, maxValue, unitCode (d for DAY).  This is by common convention assumed to mean business days (if a unitCode is used, coded as &quot;d&quot;), i.e. only counting days when the business normally operates.
   */
  @JsonIgnore public java.util.Collection<QuantitativeValue> getHandlingTimes() {
    final Object current = myData.get("handlingTime");
    if (current == null) return Collections.emptyList();
    if (current instanceof java.util.Collection) {
      return (java.util.Collection<QuantitativeValue>) current;
    }
    return Arrays.asList((QuantitativeValue) current);
  }
  /**
   * Days of the week when the merchant typically operates, indicated via opening hours markup.
   */
  @JsonIgnore public OpeningHoursSpecification getBusinessDays() {
    return (OpeningHoursSpecification) getValue("businessDays");
  }
  /**
   * Days of the week when the merchant typically operates, indicated via opening hours markup.
   */
  @JsonIgnore public java.util.Collection<OpeningHoursSpecification> getBusinessDayss() {
    final Object current = myData.get("businessDays");
    if (current == null) return Collections.emptyList();
    if (current instanceof java.util.Collection) {
      return (java.util.Collection<OpeningHoursSpecification>) current;
    }
    return Arrays.asList((OpeningHoursSpecification) current);
  }
  protected ShippingDeliveryTime(java.util.Map<String,Object> data) {
    super(data);
  }
  
  /**
   * Builder for {@link ShippingDeliveryTime}
   */
  public static class Builder extends StructuredValue.Builder {
    public Builder(@NotNull HashMap<String,Object> data) {
      super(data);
    }
    @NotNull public ShippingDeliveryTime build() {
      return new ShippingDeliveryTime(myData);
    }
    /**
     * The typical delay the order has been sent for delivery and the goods reach the final customer. Typical properties: minValue, maxValue, unitCode (d for DAY).
     */
    @NotNull public Builder transitTime(@NotNull QuantitativeValue quantitativeValue) {
      putValue("transitTime", quantitativeValue);
      return this;
    }
    /**
     * The typical delay the order has been sent for delivery and the goods reach the final customer. Typical properties: minValue, maxValue, unitCode (d for DAY).
     */
    @NotNull public Builder transitTime(@NotNull QuantitativeValue.Builder quantitativeValue) {
      putValue("transitTime", quantitativeValue.build());
      return this;
    }
    /**
     * Order cutoff time allows merchants to describe the time after which they will no longer process orders received on that day. For orders processed after cutoff time, one day gets added to the delivery time estimate. This property is expected to be most typically used via the [[ShippingRateSettings]] publication pattern. The time is indicated using the ISO-8601 Time format, e.g. &quot;23:30:00-05:00&quot; would represent 6:30 pm Eastern Standard Time (EST) which is 5 hours behind Coordinated Universal Time (UTC).
     */
    @NotNull public Builder cutoffTime(@NotNull java.util.Date date) {
      putValue("cutoffTime", date);
      return this;
    }
    /**
     * The typical delay between the receipt of the order and the goods either leaving the warehouse or being prepared for pickup, in case the delivery method is on site pickup. Typical properties: minValue, maxValue, unitCode (d for DAY).  This is by common convention assumed to mean business days (if a unitCode is used, coded as &quot;d&quot;), i.e. only counting days when the business normally operates.
     */
    @NotNull public Builder handlingTime(@NotNull QuantitativeValue quantitativeValue) {
      putValue("handlingTime", quantitativeValue);
      return this;
    }
    /**
     * The typical delay between the receipt of the order and the goods either leaving the warehouse or being prepared for pickup, in case the delivery method is on site pickup. Typical properties: minValue, maxValue, unitCode (d for DAY).  This is by common convention assumed to mean business days (if a unitCode is used, coded as &quot;d&quot;), i.e. only counting days when the business normally operates.
     */
    @NotNull public Builder handlingTime(@NotNull QuantitativeValue.Builder quantitativeValue) {
      putValue("handlingTime", quantitativeValue.build());
      return this;
    }
    /**
     * Days of the week when the merchant typically operates, indicated via opening hours markup.
     */
    @NotNull public Builder businessDays(@NotNull OpeningHoursSpecification openingHoursSpecification) {
      putValue("businessDays", openingHoursSpecification);
      return this;
    }
    /**
     * Days of the week when the merchant typically operates, indicated via opening hours markup.
     */
    @NotNull public Builder businessDays(@NotNull OpeningHoursSpecification.Builder openingHoursSpecification) {
      putValue("businessDays", openingHoursSpecification.build());
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
      if ("transitTime".equals(key) && value instanceof QuantitativeValue) { this.transitTime((QuantitativeValue)value); return; }
      if ("transitTimes".equals(key) && value instanceof QuantitativeValue) { this.transitTime((QuantitativeValue)value); return; }
      if ("cutoffTime".equals(key) && value instanceof java.util.Date) { this.cutoffTime((java.util.Date)value); return; }
      if ("cutoffTimes".equals(key) && value instanceof java.util.Date) { this.cutoffTime((java.util.Date)value); return; }
      if ("handlingTime".equals(key) && value instanceof QuantitativeValue) { this.handlingTime((QuantitativeValue)value); return; }
      if ("handlingTimes".equals(key) && value instanceof QuantitativeValue) { this.handlingTime((QuantitativeValue)value); return; }
      if ("businessDays".equals(key) && value instanceof OpeningHoursSpecification) { this.businessDays((OpeningHoursSpecification)value); return; }
      if ("businessDayss".equals(key) && value instanceof OpeningHoursSpecification) { this.businessDays((OpeningHoursSpecification)value); return; }
      super.fromMap(key, value);
    }
  }
  
}
