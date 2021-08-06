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
 * A structured value indicating the quantity, unit of measurement, and business function of goods included in a bundle offer.
 */
public class TypeAndQuantityNode extends StructuredValue {
  /**
   * The quantity of the goods included in the offer.
   */
  @JsonIgnore public Integer getAmountOfThisGoodInteger() {
    return (Integer) getValue("amountOfThisGood");
  }
  /**
   * The quantity of the goods included in the offer.
   */
  @JsonIgnore public java.util.Collection<Integer> getAmountOfThisGoodIntegers() {
    final java.lang.Object current = myData.get("amountOfThisGood");
    if (current == null) return Collections.emptyList();
    if (current instanceof java.util.Collection) {
      return (java.util.Collection<Integer>) current;
    }
    return Arrays.asList((Integer) current);
  }
  /**
   * The quantity of the goods included in the offer.
   */
  @JsonIgnore public Long getAmountOfThisGoodLong() {
    return (Long) getValue("amountOfThisGood");
  }
  /**
   * The quantity of the goods included in the offer.
   */
  @JsonIgnore public java.util.Collection<Long> getAmountOfThisGoodLongs() {
    final java.lang.Object current = myData.get("amountOfThisGood");
    if (current == null) return Collections.emptyList();
    if (current instanceof java.util.Collection) {
      return (java.util.Collection<Long>) current;
    }
    return Arrays.asList((Long) current);
  }
  /**
   * The quantity of the goods included in the offer.
   */
  @JsonIgnore public Float getAmountOfThisGoodFloat() {
    return (Float) getValue("amountOfThisGood");
  }
  /**
   * The quantity of the goods included in the offer.
   */
  @JsonIgnore public java.util.Collection<Float> getAmountOfThisGoodFloats() {
    final java.lang.Object current = myData.get("amountOfThisGood");
    if (current == null) return Collections.emptyList();
    if (current instanceof java.util.Collection) {
      return (java.util.Collection<Float>) current;
    }
    return Arrays.asList((Float) current);
  }
  /**
   * The quantity of the goods included in the offer.
   */
  @JsonIgnore public Double getAmountOfThisGoodDouble() {
    return (Double) getValue("amountOfThisGood");
  }
  /**
   * The quantity of the goods included in the offer.
   */
  @JsonIgnore public java.util.Collection<Double> getAmountOfThisGoodDoubles() {
    final java.lang.Object current = myData.get("amountOfThisGood");
    if (current == null) return Collections.emptyList();
    if (current instanceof java.util.Collection) {
      return (java.util.Collection<Double>) current;
    }
    return Arrays.asList((Double) current);
  }
  /**
   * The quantity of the goods included in the offer.
   */
  @JsonIgnore public String getAmountOfThisGoodString() {
    return (String) getValue("amountOfThisGood");
  }
  /**
   * The quantity of the goods included in the offer.
   */
  @JsonIgnore public java.util.Collection<String> getAmountOfThisGoodStrings() {
    final java.lang.Object current = myData.get("amountOfThisGood");
    if (current == null) return Collections.emptyList();
    if (current instanceof java.util.Collection) {
      return (java.util.Collection<String>) current;
    }
    return Arrays.asList((String) current);
  }
  /**
   * The product that this structured value is referring to.
   */
  @JsonIgnore public Product getTypeOfGoodProduct() {
    return (Product) getValue("typeOfGood");
  }
  /**
   * The product that this structured value is referring to.
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
   */
  @JsonIgnore public Service getTypeOfGoodService() {
    return (Service) getValue("typeOfGood");
  }
  /**
   * The product that this structured value is referring to.
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
   * A string or text indicating the unit of measurement. Useful if you cannot provide a standard unit code for
   * &lt;a href='unitCode'&gt;unitCode&lt;/a&gt;.
   */
  @JsonIgnore public String getUnitText() {
    return (String) getValue("unitText");
  }
  /**
   * A string or text indicating the unit of measurement. Useful if you cannot provide a standard unit code for
   * &lt;a href='unitCode'&gt;unitCode&lt;/a&gt;.
   */
  @JsonIgnore public java.util.Collection<String> getUnitTexts() {
    final java.lang.Object current = myData.get("unitText");
    if (current == null) return Collections.emptyList();
    if (current instanceof java.util.Collection) {
      return (java.util.Collection<String>) current;
    }
    return Arrays.asList((String) current);
  }
  /**
   * The unit of measurement given using the UN/CEFACT Common Code (3 characters) or a URL. Other codes than the UN/CEFACT Common Code may be used with a prefix followed by a colon.
   */
  @JsonIgnore public String getUnitCode() {
    return (String) getValue("unitCode");
  }
  /**
   * The unit of measurement given using the UN/CEFACT Common Code (3 characters) or a URL. Other codes than the UN/CEFACT Common Code may be used with a prefix followed by a colon.
   */
  @JsonIgnore public java.util.Collection<String> getUnitCodes() {
    final java.lang.Object current = myData.get("unitCode");
    if (current == null) return Collections.emptyList();
    if (current instanceof java.util.Collection) {
      return (java.util.Collection<String>) current;
    }
    return Arrays.asList((String) current);
  }
  /**
   * The business function (e.g. sell, lease, repair, dispose) of the offer or component of a bundle (TypeAndQuantityNode). The default is http://purl.org/goodrelations/v1#Sell.
   */
  @JsonIgnore public BusinessFunction getBusinessFunction() {
    return (BusinessFunction) getValue("businessFunction");
  }
  /**
   * The business function (e.g. sell, lease, repair, dispose) of the offer or component of a bundle (TypeAndQuantityNode). The default is http://purl.org/goodrelations/v1#Sell.
   */
  @JsonIgnore public java.util.Collection<BusinessFunction> getBusinessFunctions() {
    final java.lang.Object current = myData.get("businessFunction");
    if (current == null) return Collections.emptyList();
    if (current instanceof java.util.Collection) {
      return (java.util.Collection<BusinessFunction>) current;
    }
    return Arrays.asList((BusinessFunction) current);
  }
  protected TypeAndQuantityNode(java.util.Map<String,java.lang.Object> data) {
    super(data);
  }
  
  /**
   * Builder for {@link TypeAndQuantityNode}
   */
  public static class Builder extends StructuredValue.Builder {
    public Builder(@NotNull HashMap<String,java.lang.Object> data) {
      super(data);
    }
    @NotNull public TypeAndQuantityNode build() {
      return new TypeAndQuantityNode(myData);
    }
    /**
     * The quantity of the goods included in the offer.
     */
    @NotNull public Builder amountOfThisGood(@NotNull Integer integer) {
      putValue("amountOfThisGood", integer);
      return this;
    }
    /**
     * The quantity of the goods included in the offer.
     */
    @NotNull public Builder amountOfThisGood(@NotNull Long amountOfThisGood) {
      putValue("amountOfThisGood", amountOfThisGood);
      return this;
    }
    /**
     * The quantity of the goods included in the offer.
     */
    @NotNull public Builder amountOfThisGood(@NotNull Float amountOfThisGood) {
      putValue("amountOfThisGood", amountOfThisGood);
      return this;
    }
    /**
     * The quantity of the goods included in the offer.
     */
    @NotNull public Builder amountOfThisGood(@NotNull Double amountOfThisGood) {
      putValue("amountOfThisGood", amountOfThisGood);
      return this;
    }
    /**
     * The quantity of the goods included in the offer.
     */
    @NotNull public Builder amountOfThisGood(@NotNull String amountOfThisGood) {
      putValue("amountOfThisGood", amountOfThisGood);
      return this;
    }
    /**
     * The product that this structured value is referring to.
     */
    @NotNull public Builder typeOfGood(@NotNull Product product) {
      putValue("typeOfGood", product);
      return this;
    }
    /**
     * The product that this structured value is referring to.
     */
    @NotNull public Builder typeOfGood(@NotNull Product.Builder product) {
      putValue("typeOfGood", product.build());
      return this;
    }
    /**
     * The product that this structured value is referring to.
     */
    @NotNull public Builder typeOfGood(@NotNull Service service) {
      putValue("typeOfGood", service);
      return this;
    }
    /**
     * The product that this structured value is referring to.
     */
    @NotNull public Builder typeOfGood(@NotNull Service.Builder service) {
      putValue("typeOfGood", service.build());
      return this;
    }
    /**
     * A string or text indicating the unit of measurement. Useful if you cannot provide a standard unit code for
     * &lt;a href='unitCode'&gt;unitCode&lt;/a&gt;.
     */
    @NotNull public Builder unitText(@NotNull String unitText) {
      putValue("unitText", unitText);
      return this;
    }
    /**
     * The unit of measurement given using the UN/CEFACT Common Code (3 characters) or a URL. Other codes than the UN/CEFACT Common Code may be used with a prefix followed by a colon.
     */
    @NotNull public Builder unitCode(@NotNull String unitCode) {
      putValue("unitCode", unitCode);
      return this;
    }
    /**
     * The business function (e.g. sell, lease, repair, dispose) of the offer or component of a bundle (TypeAndQuantityNode). The default is http://purl.org/goodrelations/v1#Sell.
     */
    @NotNull public Builder businessFunction(@NotNull BusinessFunction businessFunction) {
      putValue("businessFunction", businessFunction);
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
      if ("amountOfThisGood".equals(key) && value instanceof Integer) { this.amountOfThisGood((Integer)value); return; }
      if ("amountOfThisGoods".equals(key) && value instanceof Integer) { this.amountOfThisGood((Integer)value); return; }
      if ("amountOfThisGood".equals(key) && value instanceof Long) { this.amountOfThisGood((Long)value); return; }
      if ("amountOfThisGoods".equals(key) && value instanceof Long) { this.amountOfThisGood((Long)value); return; }
      if ("amountOfThisGood".equals(key) && value instanceof Float) { this.amountOfThisGood((Float)value); return; }
      if ("amountOfThisGoods".equals(key) && value instanceof Float) { this.amountOfThisGood((Float)value); return; }
      if ("amountOfThisGood".equals(key) && value instanceof Double) { this.amountOfThisGood((Double)value); return; }
      if ("amountOfThisGoods".equals(key) && value instanceof Double) { this.amountOfThisGood((Double)value); return; }
      if ("amountOfThisGood".equals(key) && value instanceof String) { this.amountOfThisGood((String)value); return; }
      if ("amountOfThisGoods".equals(key) && value instanceof String) { this.amountOfThisGood((String)value); return; }
      if ("typeOfGood".equals(key) && value instanceof Product) { this.typeOfGood((Product)value); return; }
      if ("typeOfGoods".equals(key) && value instanceof Product) { this.typeOfGood((Product)value); return; }
      if ("typeOfGood".equals(key) && value instanceof Service) { this.typeOfGood((Service)value); return; }
      if ("typeOfGoods".equals(key) && value instanceof Service) { this.typeOfGood((Service)value); return; }
      if ("unitText".equals(key) && value instanceof String) { this.unitText((String)value); return; }
      if ("unitTexts".equals(key) && value instanceof String) { this.unitText((String)value); return; }
      if ("unitCode".equals(key) && value instanceof String) { this.unitCode((String)value); return; }
      if ("unitCodes".equals(key) && value instanceof String) { this.unitCode((String)value); return; }
      if ("businessFunction".equals(key) && value instanceof BusinessFunction) { this.businessFunction((BusinessFunction)value); return; }
      if ("businessFunctions".equals(key) && value instanceof BusinessFunction) { this.businessFunction((BusinessFunction)value); return; }
      super.fromMap(key, value);
    }
  }
  
}
