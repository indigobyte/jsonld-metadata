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
 * Any offered product or service. For example: a pair of shoes; a concert ticket; the rental of a car; a haircut; or an episode of a TV show streamed online.
 */
public class Product extends Thing implements org.schema.Material {
  /**
   * The width of the item.
   * @return width property set by first invocation of width method or {@code null}.
   */
  @JsonIgnore public Distance getWidthDistance() {
    return (Distance) getValue("width");
  }
  /**
   * The width of the item.
   * @return all width properties as {@link java.util.Collection} or an empty collection 
   * if width was not set.
   */
  @JsonIgnore public java.util.Collection<Distance> getWidthDistances() {
    final java.lang.Object current = myData.get("width");
    if (current == null) return Collections.emptyList();
    if (current instanceof java.util.Collection) {
      return (java.util.Collection<Distance>) current;
    }
    return Arrays.asList((Distance) current);
  }
  /**
   * The width of the item.
   * @return width property set by first invocation of width method or {@code null}.
   */
  @JsonIgnore public QuantitativeValue getWidthQuantitativeValue() {
    return (QuantitativeValue) getValue("width");
  }
  /**
   * The width of the item.
   * @return all width properties as {@link java.util.Collection} or an empty collection 
   * if width was not set.
   */
  @JsonIgnore public java.util.Collection<QuantitativeValue> getWidthQuantitativeValues() {
    final java.lang.Object current = myData.get("width");
    if (current == null) return Collections.emptyList();
    if (current instanceof java.util.Collection) {
      return (java.util.Collection<QuantitativeValue>) current;
    }
    return Arrays.asList((QuantitativeValue) current);
  }
  /**
   * The manufacturer of the product.
   * @return manufacturer property set by first invocation of manufacturer method or {@code null}.
   */
  @JsonIgnore public Organization getManufacturer() {
    return (Organization) getValue("manufacturer");
  }
  /**
   * The manufacturer of the product.
   * @return all manufacturer properties as {@link java.util.Collection} or an empty collection 
   * if manufacturer was not set.
   */
  @JsonIgnore public java.util.Collection<Organization> getManufacturers() {
    final java.lang.Object current = myData.get("manufacturer");
    if (current == null) return Collections.emptyList();
    if (current instanceof java.util.Collection) {
      return (java.util.Collection<Organization>) current;
    }
    return Arrays.asList((Organization) current);
  }
  /**
   * A standardized size of a product or creative work, specified either through a simple textual string (for example 'XL', '32Wx34L'), a  QuantitativeValue with a unitCode, or a comprehensive and structured [[SizeSpecification]]; in other cases, the [[width]], [[height]], [[depth]] and [[weight]] properties may be more applicable. 
   * @return size property set by first invocation of size method or {@code null}.
   */
  @JsonIgnore public DefinedTerm getSizeDefinedTerm() {
    return (DefinedTerm) getValue("size");
  }
  /**
   * A standardized size of a product or creative work, specified either through a simple textual string (for example 'XL', '32Wx34L'), a  QuantitativeValue with a unitCode, or a comprehensive and structured [[SizeSpecification]]; in other cases, the [[width]], [[height]], [[depth]] and [[weight]] properties may be more applicable. 
   * @return all size properties as {@link java.util.Collection} or an empty collection 
   * if size was not set.
   */
  @JsonIgnore public java.util.Collection<DefinedTerm> getSizeDefinedTerms() {
    final java.lang.Object current = myData.get("size");
    if (current == null) return Collections.emptyList();
    if (current instanceof java.util.Collection) {
      return (java.util.Collection<DefinedTerm>) current;
    }
    return Arrays.asList((DefinedTerm) current);
  }
  /**
   * A standardized size of a product or creative work, specified either through a simple textual string (for example 'XL', '32Wx34L'), a  QuantitativeValue with a unitCode, or a comprehensive and structured [[SizeSpecification]]; in other cases, the [[width]], [[height]], [[depth]] and [[weight]] properties may be more applicable. 
   * @return size property set by first invocation of size method or {@code null}.
   */
  @JsonIgnore public QuantitativeValue getSizeQuantitativeValue() {
    return (QuantitativeValue) getValue("size");
  }
  /**
   * A standardized size of a product or creative work, specified either through a simple textual string (for example 'XL', '32Wx34L'), a  QuantitativeValue with a unitCode, or a comprehensive and structured [[SizeSpecification]]; in other cases, the [[width]], [[height]], [[depth]] and [[weight]] properties may be more applicable. 
   * @return all size properties as {@link java.util.Collection} or an empty collection 
   * if size was not set.
   */
  @JsonIgnore public java.util.Collection<QuantitativeValue> getSizeQuantitativeValues() {
    final java.lang.Object current = myData.get("size");
    if (current == null) return Collections.emptyList();
    if (current instanceof java.util.Collection) {
      return (java.util.Collection<QuantitativeValue>) current;
    }
    return Arrays.asList((QuantitativeValue) current);
  }
  /**
   * A standardized size of a product or creative work, specified either through a simple textual string (for example 'XL', '32Wx34L'), a  QuantitativeValue with a unitCode, or a comprehensive and structured [[SizeSpecification]]; in other cases, the [[width]], [[height]], [[depth]] and [[weight]] properties may be more applicable. 
   * @return size property set by first invocation of size method or {@code null}.
   */
  @JsonIgnore public SizeSpecification getSizeSizeSpecification() {
    return (SizeSpecification) getValue("size");
  }
  /**
   * A standardized size of a product or creative work, specified either through a simple textual string (for example 'XL', '32Wx34L'), a  QuantitativeValue with a unitCode, or a comprehensive and structured [[SizeSpecification]]; in other cases, the [[width]], [[height]], [[depth]] and [[weight]] properties may be more applicable. 
   * @return all size properties as {@link java.util.Collection} or an empty collection 
   * if size was not set.
   */
  @JsonIgnore public java.util.Collection<SizeSpecification> getSizeSizeSpecifications() {
    final java.lang.Object current = myData.get("size");
    if (current == null) return Collections.emptyList();
    if (current instanceof java.util.Collection) {
      return (java.util.Collection<SizeSpecification>) current;
    }
    return Arrays.asList((SizeSpecification) current);
  }
  /**
   * A standardized size of a product or creative work, specified either through a simple textual string (for example 'XL', '32Wx34L'), a  QuantitativeValue with a unitCode, or a comprehensive and structured [[SizeSpecification]]; in other cases, the [[width]], [[height]], [[depth]] and [[weight]] properties may be more applicable. 
   * @return size property set by first invocation of size method or {@code null}.
   */
  @JsonIgnore public String getSizeString() {
    return (String) getValue("size");
  }
  /**
   * A standardized size of a product or creative work, specified either through a simple textual string (for example 'XL', '32Wx34L'), a  QuantitativeValue with a unitCode, or a comprehensive and structured [[SizeSpecification]]; in other cases, the [[width]], [[height]], [[depth]] and [[weight]] properties may be more applicable. 
   * @return all size properties as {@link java.util.Collection} or an empty collection 
   * if size was not set.
   */
  @JsonIgnore public java.util.Collection<String> getSizeStrings() {
    final java.lang.Object current = myData.get("size");
    if (current == null) return Collections.emptyList();
    if (current instanceof java.util.Collection) {
      return (java.util.Collection<String>) current;
    }
    return Arrays.asList((String) current);
  }
  /**
   * The date the item e.g. vehicle was purchased by the current owner.
   * @return purchaseDate property set by first invocation of purchaseDate method or {@code null}.
   */
  @JsonIgnore public java.util.Date getPurchaseDate() {
    return (java.util.Date) getValue("purchaseDate");
  }
  /**
   * The date the item e.g. vehicle was purchased by the current owner.
   * @return all purchaseDate properties as {@link java.util.Collection} or an empty collection 
   * if purchaseDate was not set.
   */
  @JsonIgnore public java.util.Collection<java.util.Date> getPurchaseDates() {
    final java.lang.Object current = myData.get("purchaseDate");
    if (current == null) return Collections.emptyList();
    if (current instanceof java.util.Collection) {
      return (java.util.Collection<java.util.Date>) current;
    }
    return Arrays.asList((java.util.Date) current);
  }
  /**
   * Indicates the [[productGroupID]] for a [[ProductGroup]] that this product [[isVariantOf]]. 
   * @return inProductGroupWithID property set by first invocation of inProductGroupWithID method or {@code null}.
   */
  @JsonIgnore public String getInProductGroupWithID() {
    return (String) getValue("inProductGroupWithID");
  }
  /**
   * Indicates the [[productGroupID]] for a [[ProductGroup]] that this product [[isVariantOf]]. 
   * @return all inProductGroupWithID properties as {@link java.util.Collection} or an empty collection 
   * if inProductGroupWithID was not set.
   */
  @JsonIgnore public java.util.Collection<String> getInProductGroupWithIDs() {
    final java.lang.Object current = myData.get("inProductGroupWithID");
    if (current == null) return Collections.emptyList();
    if (current instanceof java.util.Collection) {
      return (java.util.Collection<String>) current;
    }
    return Arrays.asList((String) current);
  }
  /**
   * The GTIN-13 code of the product, or the product to which the offer refers. This is equivalent to 13-digit ISBN codes and EAN UCC-13. Former 12-digit UPC codes can be converted into a GTIN-13 code by simply adding a preceding zero. See [GS1 GTIN Summary](http://www.gs1.org/barcodes/technical/idkeys/gtin) for more details.
   * @return gtin13 property set by first invocation of gtin13 method or {@code null}.
   */
  @JsonIgnore public Gtin getGtin13() {
    return (Gtin) getValue("gtin13");
  }
  /**
   * The GTIN-13 code of the product, or the product to which the offer refers. This is equivalent to 13-digit ISBN codes and EAN UCC-13. Former 12-digit UPC codes can be converted into a GTIN-13 code by simply adding a preceding zero. See [GS1 GTIN Summary](http://www.gs1.org/barcodes/technical/idkeys/gtin) for more details.
   * @return all gtin13 properties as {@link java.util.Collection} or an empty collection 
   * if gtin13 was not set.
   */
  @JsonIgnore public java.util.Collection<Gtin> getGtin13s() {
    final java.lang.Object current = myData.get("gtin13");
    if (current == null) return Collections.emptyList();
    if (current instanceof java.util.Collection) {
      return (java.util.Collection<Gtin>) current;
    }
    return Arrays.asList((Gtin) current);
  }
  /**
   * A Global Trade Item Number ([GTIN](https://www.gs1.org/standards/id-keys/gtin)). GTINs identify trade items, including products and services, using numeric identification codes. The [[gtin]] property generalizes the earlier [[gtin8]], [[gtin12]], [[gtin13]], and [[gtin14]] properties. The GS1 [digital link specifications](https://www.gs1.org/standards/Digital-Link/) express GTINs as URLs. A correct [[gtin]] value should be a valid GTIN, which means that it should be an all-numeric string of either 8, 12, 13 or 14 digits, or a &quot;GS1 Digital Link&quot; URL based on such a string. The numeric component should also have a [valid GS1 check digit](https://www.gs1.org/services/check-digit-calculator) and meet the other rules for valid GTINs. See also [GS1's GTIN Summary](http://www.gs1.org/barcodes/technical/idkeys/gtin) and [Wikipedia](https://en.wikipedia.org/wiki/Global_Trade_Item_Number) for more details. Left-padding of the gtin values is not required or encouraged.
   * 
   * @return gtin property set by first invocation of gtin method or {@code null}.
   */
  @JsonIgnore public Gtin getGtin() {
    return (Gtin) getValue("gtin");
  }
  /**
   * A Global Trade Item Number ([GTIN](https://www.gs1.org/standards/id-keys/gtin)). GTINs identify trade items, including products and services, using numeric identification codes. The [[gtin]] property generalizes the earlier [[gtin8]], [[gtin12]], [[gtin13]], and [[gtin14]] properties. The GS1 [digital link specifications](https://www.gs1.org/standards/Digital-Link/) express GTINs as URLs. A correct [[gtin]] value should be a valid GTIN, which means that it should be an all-numeric string of either 8, 12, 13 or 14 digits, or a &quot;GS1 Digital Link&quot; URL based on such a string. The numeric component should also have a [valid GS1 check digit](https://www.gs1.org/services/check-digit-calculator) and meet the other rules for valid GTINs. See also [GS1's GTIN Summary](http://www.gs1.org/barcodes/technical/idkeys/gtin) and [Wikipedia](https://en.wikipedia.org/wiki/Global_Trade_Item_Number) for more details. Left-padding of the gtin values is not required or encouraged.
   * 
   * @return all gtin properties as {@link java.util.Collection} or an empty collection 
   * if gtin was not set.
   */
  @JsonIgnore public java.util.Collection<Gtin> getGtins() {
    final java.lang.Object current = myData.get("gtin");
    if (current == null) return Collections.emptyList();
    if (current instanceof java.util.Collection) {
      return (java.util.Collection<Gtin>) current;
    }
    return Arrays.asList((Gtin) current);
  }
  /**
   * A material that something is made from, e.g. leather, wool, cotton, paper.
   * @return material property set by first invocation of material method or {@code null}.
   */
  @JsonIgnore public Material getMaterial() {
    return (Material) getValue("material");
  }
  /**
   * A material that something is made from, e.g. leather, wool, cotton, paper.
   * @return all material properties as {@link java.util.Collection} or an empty collection 
   * if material was not set.
   */
  @JsonIgnore public java.util.Collection<Material> getMaterials() {
    final java.lang.Object current = myData.get("material");
    if (current == null) return Collections.emptyList();
    if (current instanceof java.util.Collection) {
      return (java.util.Collection<Material>) current;
    }
    return Arrays.asList((Material) current);
  }
  /**
   * A pattern that something has, for example 'polka dot', 'striped', 'Canadian flag'. Values are typically expressed as text, although links to controlled value schemes are also supported.
   * @return pattern property set by first invocation of pattern method or {@code null}.
   */
  @JsonIgnore public DefinedTerm getPatternDefinedTerm() {
    return (DefinedTerm) getValue("pattern");
  }
  /**
   * A pattern that something has, for example 'polka dot', 'striped', 'Canadian flag'. Values are typically expressed as text, although links to controlled value schemes are also supported.
   * @return all pattern properties as {@link java.util.Collection} or an empty collection 
   * if pattern was not set.
   */
  @JsonIgnore public java.util.Collection<DefinedTerm> getPatternDefinedTerms() {
    final java.lang.Object current = myData.get("pattern");
    if (current == null) return Collections.emptyList();
    if (current instanceof java.util.Collection) {
      return (java.util.Collection<DefinedTerm>) current;
    }
    return Arrays.asList((DefinedTerm) current);
  }
  /**
   * A pattern that something has, for example 'polka dot', 'striped', 'Canadian flag'. Values are typically expressed as text, although links to controlled value schemes are also supported.
   * @return pattern property set by first invocation of pattern method or {@code null}.
   */
  @JsonIgnore public String getPatternString() {
    return (String) getValue("pattern");
  }
  /**
   * A pattern that something has, for example 'polka dot', 'striped', 'Canadian flag'. Values are typically expressed as text, although links to controlled value schemes are also supported.
   * @return all pattern properties as {@link java.util.Collection} or an empty collection 
   * if pattern was not set.
   */
  @JsonIgnore public java.util.Collection<String> getPatternStrings() {
    final java.lang.Object current = myData.get("pattern");
    if (current == null) return Collections.emptyList();
    if (current instanceof java.util.Collection) {
      return (java.util.Collection<String>) current;
    }
    return Arrays.asList((String) current);
  }
  /**
   * The GTIN-14 code of the product, or the product to which the offer refers. See [GS1 GTIN Summary](http://www.gs1.org/barcodes/technical/idkeys/gtin) for more details.
   * @return gtin14 property set by first invocation of gtin14 method or {@code null}.
   */
  @JsonIgnore public Identifier getGtin14() {
    return (Identifier) getValue("gtin14");
  }
  /**
   * The GTIN-14 code of the product, or the product to which the offer refers. See [GS1 GTIN Summary](http://www.gs1.org/barcodes/technical/idkeys/gtin) for more details.
   * @return all gtin14 properties as {@link java.util.Collection} or an empty collection 
   * if gtin14 was not set.
   */
  @JsonIgnore public java.util.Collection<Identifier> getGtin14s() {
    final java.lang.Object current = myData.get("gtin14");
    if (current == null) return Collections.emptyList();
    if (current instanceof java.util.Collection) {
      return (java.util.Collection<Identifier>) current;
    }
    return Arrays.asList((Identifier) current);
  }
  /**
   * A predefined value from OfferItemCondition specifying the condition of the product or service, or the products or services included in the offer. Also used for product return policies to specify the condition of products accepted for returns.
   * @return itemCondition property set by first invocation of itemCondition method or {@code null}.
   */
  @JsonIgnore public OfferItemCondition getItemCondition() {
    return (OfferItemCondition) getValue("itemCondition");
  }
  /**
   * A predefined value from OfferItemCondition specifying the condition of the product or service, or the products or services included in the offer. Also used for product return policies to specify the condition of products accepted for returns.
   * @return all itemCondition properties as {@link java.util.Collection} or an empty collection 
   * if itemCondition was not set.
   */
  @JsonIgnore public java.util.Collection<OfferItemCondition> getItemConditions() {
    final java.lang.Object current = myData.get("itemCondition");
    if (current == null) return Collections.emptyList();
    if (current instanceof java.util.Collection) {
      return (java.util.Collection<OfferItemCondition>) current;
    }
    return Arrays.asList((OfferItemCondition) current);
  }
  /**
   * The overall rating, based on a collection of reviews or ratings, of the item.
   * @return aggregateRating property set by first invocation of aggregateRating method or {@code null}.
   */
  @JsonIgnore public AggregateRating getAggregateRating() {
    return (AggregateRating) getValue("aggregateRating");
  }
  /**
   * The overall rating, based on a collection of reviews or ratings, of the item.
   * @return all aggregateRating properties as {@link java.util.Collection} or an empty collection 
   * if aggregateRating was not set.
   */
  @JsonIgnore public java.util.Collection<AggregateRating> getAggregateRatings() {
    final java.lang.Object current = myData.get("aggregateRating");
    if (current == null) return Collections.emptyList();
    if (current instanceof java.util.Collection) {
      return (java.util.Collection<AggregateRating>) current;
    }
    return Arrays.asList((AggregateRating) current);
  }
  /**
   * The Manufacturer Part Number (MPN) of the product, or the product to which the offer refers.
   * @return mpn property set by first invocation of mpn method or {@code null}.
   */
  @JsonIgnore public String getMpn() {
    return (String) getValue("mpn");
  }
  /**
   * The Manufacturer Part Number (MPN) of the product, or the product to which the offer refers.
   * @return all mpn properties as {@link java.util.Collection} or an empty collection 
   * if mpn was not set.
   */
  @JsonIgnore public java.util.Collection<String> getMpns() {
    final java.lang.Object current = myData.get("mpn");
    if (current == null) return Collections.emptyList();
    if (current instanceof java.util.Collection) {
      return (java.util.Collection<String>) current;
    }
    return Arrays.asList((String) current);
  }
  /**
   * The depth of the item.
   * @return depth property set by first invocation of depth method or {@code null}.
   */
  @JsonIgnore public Distance getDepthDistance() {
    return (Distance) getValue("depth");
  }
  /**
   * The depth of the item.
   * @return all depth properties as {@link java.util.Collection} or an empty collection 
   * if depth was not set.
   */
  @JsonIgnore public java.util.Collection<Distance> getDepthDistances() {
    final java.lang.Object current = myData.get("depth");
    if (current == null) return Collections.emptyList();
    if (current instanceof java.util.Collection) {
      return (java.util.Collection<Distance>) current;
    }
    return Arrays.asList((Distance) current);
  }
  /**
   * The depth of the item.
   * @return depth property set by first invocation of depth method or {@code null}.
   */
  @JsonIgnore public QuantitativeValue getDepthQuantitativeValue() {
    return (QuantitativeValue) getValue("depth");
  }
  /**
   * The depth of the item.
   * @return all depth properties as {@link java.util.Collection} or an empty collection 
   * if depth was not set.
   */
  @JsonIgnore public java.util.Collection<QuantitativeValue> getDepthQuantitativeValues() {
    final java.lang.Object current = myData.get("depth");
    if (current == null) return Collections.emptyList();
    if (current instanceof java.util.Collection) {
      return (java.util.Collection<QuantitativeValue>) current;
    }
    return Arrays.asList((QuantitativeValue) current);
  }
  /**
   * An associated logo.
   * @return logo property set by first invocation of logo method or {@code null}.
   */
  @JsonIgnore public Image getLogo() {
    return (Image) getValue("logo");
  }
  /**
   * An associated logo.
   * @return all logo properties as {@link java.util.Collection} or an empty collection 
   * if logo was not set.
   */
  @JsonIgnore public java.util.Collection<Image> getLogos() {
    final java.lang.Object current = myData.get("logo");
    if (current == null) return Collections.emptyList();
    if (current instanceof java.util.Collection) {
      return (java.util.Collection<Image>) current;
    }
    return Arrays.asList((Image) current);
  }
  /**
   * The GTIN-12 code of the product, or the product to which the offer refers. The GTIN-12 is the 12-digit GS1 Identification Key composed of a U.P.C. Company Prefix, Item Reference, and Check Digit used to identify trade items. See [GS1 GTIN Summary](http://www.gs1.org/barcodes/technical/idkeys/gtin) for more details.
   * @return gtin12 property set by first invocation of gtin12 method or {@code null}.
   */
  @JsonIgnore public Identifier getGtin12() {
    return (Identifier) getValue("gtin12");
  }
  /**
   * The GTIN-12 code of the product, or the product to which the offer refers. The GTIN-12 is the 12-digit GS1 Identification Key composed of a U.P.C. Company Prefix, Item Reference, and Check Digit used to identify trade items. See [GS1 GTIN Summary](http://www.gs1.org/barcodes/technical/idkeys/gtin) for more details.
   * @return all gtin12 properties as {@link java.util.Collection} or an empty collection 
   * if gtin12 was not set.
   */
  @JsonIgnore public java.util.Collection<Identifier> getGtin12s() {
    final java.lang.Object current = myData.get("gtin12");
    if (current == null) return Collections.emptyList();
    if (current instanceof java.util.Collection) {
      return (java.util.Collection<Identifier>) current;
    }
    return Arrays.asList((Identifier) current);
  }
  /**
   * The height of the item.
   * @return height property set by first invocation of height method or {@code null}.
   */
  @JsonIgnore public Distance getHeightDistance() {
    return (Distance) getValue("height");
  }
  /**
   * The height of the item.
   * @return all height properties as {@link java.util.Collection} or an empty collection 
   * if height was not set.
   */
  @JsonIgnore public java.util.Collection<Distance> getHeightDistances() {
    final java.lang.Object current = myData.get("height");
    if (current == null) return Collections.emptyList();
    if (current instanceof java.util.Collection) {
      return (java.util.Collection<Distance>) current;
    }
    return Arrays.asList((Distance) current);
  }
  /**
   * The height of the item.
   * @return height property set by first invocation of height method or {@code null}.
   */
  @JsonIgnore public QuantitativeValue getHeightQuantitativeValue() {
    return (QuantitativeValue) getValue("height");
  }
  /**
   * The height of the item.
   * @return all height properties as {@link java.util.Collection} or an empty collection 
   * if height was not set.
   */
  @JsonIgnore public java.util.Collection<QuantitativeValue> getHeightQuantitativeValues() {
    final java.lang.Object current = myData.get("height");
    if (current == null) return Collections.emptyList();
    if (current instanceof java.util.Collection) {
      return (java.util.Collection<QuantitativeValue>) current;
    }
    return Arrays.asList((QuantitativeValue) current);
  }
  /**
   * The Stock Keeping Unit (SKU), i.e. a merchant-specific identifier for a product or service, or the product to which the offer refers.
   * @return sku property set by first invocation of sku method or {@code null}.
   */
  @JsonIgnore public Identifier getSku() {
    return (Identifier) getValue("sku");
  }
  /**
   * The Stock Keeping Unit (SKU), i.e. a merchant-specific identifier for a product or service, or the product to which the offer refers.
   * @return all sku properties as {@link java.util.Collection} or an empty collection 
   * if sku was not set.
   */
  @JsonIgnore public java.util.Collection<Identifier> getSkus() {
    final java.lang.Object current = myData.get("sku");
    if (current == null) return Collections.emptyList();
    if (current instanceof java.util.Collection) {
      return (java.util.Collection<Identifier>) current;
    }
    return Arrays.asList((Identifier) current);
  }
  /**
   * A pointer to another, functionally similar product (or multiple products).
   * @return isSimilarTo property set by first invocation of isSimilarTo method or {@code null}.
   */
  @JsonIgnore public Product getIsSimilarToProduct() {
    return (Product) getValue("isSimilarTo");
  }
  /**
   * A pointer to another, functionally similar product (or multiple products).
   * @return all isSimilarTo properties as {@link java.util.Collection} or an empty collection 
   * if isSimilarTo was not set.
   */
  @JsonIgnore public java.util.Collection<Product> getIsSimilarToProducts() {
    final java.lang.Object current = myData.get("isSimilarTo");
    if (current == null) return Collections.emptyList();
    if (current instanceof java.util.Collection) {
      return (java.util.Collection<Product>) current;
    }
    return Arrays.asList((Product) current);
  }
  /**
   * A pointer to another, functionally similar product (or multiple products).
   * @return isSimilarTo property set by first invocation of isSimilarTo method or {@code null}.
   */
  @JsonIgnore public Service getIsSimilarToService() {
    return (Service) getValue("isSimilarTo");
  }
  /**
   * A pointer to another, functionally similar product (or multiple products).
   * @return all isSimilarTo properties as {@link java.util.Collection} or an empty collection 
   * if isSimilarTo was not set.
   */
  @JsonIgnore public java.util.Collection<Service> getIsSimilarToServices() {
    final java.lang.Object current = myData.get("isSimilarTo");
    if (current == null) return Collections.emptyList();
    if (current instanceof java.util.Collection) {
      return (java.util.Collection<Service>) current;
    }
    return Arrays.asList((Service) current);
  }
  /**
   * A pointer to another, somehow related product (or multiple products).
   * @return isRelatedTo property set by first invocation of isRelatedTo method or {@code null}.
   */
  @JsonIgnore public Product getIsRelatedToProduct() {
    return (Product) getValue("isRelatedTo");
  }
  /**
   * A pointer to another, somehow related product (or multiple products).
   * @return all isRelatedTo properties as {@link java.util.Collection} or an empty collection 
   * if isRelatedTo was not set.
   */
  @JsonIgnore public java.util.Collection<Product> getIsRelatedToProducts() {
    final java.lang.Object current = myData.get("isRelatedTo");
    if (current == null) return Collections.emptyList();
    if (current instanceof java.util.Collection) {
      return (java.util.Collection<Product>) current;
    }
    return Arrays.asList((Product) current);
  }
  /**
   * A pointer to another, somehow related product (or multiple products).
   * @return isRelatedTo property set by first invocation of isRelatedTo method or {@code null}.
   */
  @JsonIgnore public Service getIsRelatedToService() {
    return (Service) getValue("isRelatedTo");
  }
  /**
   * A pointer to another, somehow related product (or multiple products).
   * @return all isRelatedTo properties as {@link java.util.Collection} or an empty collection 
   * if isRelatedTo was not set.
   */
  @JsonIgnore public java.util.Collection<Service> getIsRelatedToServices() {
    final java.lang.Object current = myData.get("isRelatedTo");
    if (current == null) return Collections.emptyList();
    if (current instanceof java.util.Collection) {
      return (java.util.Collection<Service>) current;
    }
    return Arrays.asList((Service) current);
  }
  /**
   * An intended audience, i.e. a group for whom something was created.
   * @return audience property set by first invocation of audience method or {@code null}.
   */
  @JsonIgnore public Audience getAudience() {
    return (Audience) getValue("audience");
  }
  /**
   * An intended audience, i.e. a group for whom something was created.
   * @return all audience properties as {@link java.util.Collection} or an empty collection 
   * if audience was not set.
   */
  @JsonIgnore public java.util.Collection<Audience> getAudiences() {
    final java.lang.Object current = myData.get("audience");
    if (current == null) return Collections.emptyList();
    if (current instanceof java.util.Collection) {
      return (java.util.Collection<Audience>) current;
    }
    return Arrays.asList((Audience) current);
  }
  /**
   * The brand(s) associated with a product or service, or the brand(s) maintained by an organization or business person.
   * @return brand property set by first invocation of brand method or {@code null}.
   */
  @JsonIgnore public Brand getBrandBrand() {
    return (Brand) getValue("brand");
  }
  /**
   * The brand(s) associated with a product or service, or the brand(s) maintained by an organization or business person.
   * @return all brand properties as {@link java.util.Collection} or an empty collection 
   * if brand was not set.
   */
  @JsonIgnore public java.util.Collection<Brand> getBrandBrands() {
    final java.lang.Object current = myData.get("brand");
    if (current == null) return Collections.emptyList();
    if (current instanceof java.util.Collection) {
      return (java.util.Collection<Brand>) current;
    }
    return Arrays.asList((Brand) current);
  }
  /**
   * The brand(s) associated with a product or service, or the brand(s) maintained by an organization or business person.
   * @return brand property set by first invocation of brand method or {@code null}.
   */
  @JsonIgnore public Organization getBrandOrganization() {
    return (Organization) getValue("brand");
  }
  /**
   * The brand(s) associated with a product or service, or the brand(s) maintained by an organization or business person.
   * @return all brand properties as {@link java.util.Collection} or an empty collection 
   * if brand was not set.
   */
  @JsonIgnore public java.util.Collection<Organization> getBrandOrganizations() {
    final java.lang.Object current = myData.get("brand");
    if (current == null) return Collections.emptyList();
    if (current instanceof java.util.Collection) {
      return (java.util.Collection<Organization>) current;
    }
    return Arrays.asList((Organization) current);
  }
  /**
   * Indicates the [NATO stock number](https://en.wikipedia.org/wiki/NATO_Stock_Number) (nsn) of a [[Product]]. 
   * @return nsn property set by first invocation of nsn method or {@code null}.
   */
  @JsonIgnore public Identifier getNsn() {
    return (Identifier) getValue("nsn");
  }
  /**
   * Indicates the [NATO stock number](https://en.wikipedia.org/wiki/NATO_Stock_Number) (nsn) of a [[Product]]. 
   * @return all nsn properties as {@link java.util.Collection} or an empty collection 
   * if nsn was not set.
   */
  @JsonIgnore public java.util.Collection<Identifier> getNsns() {
    final java.lang.Object current = myData.get("nsn");
    if (current == null) return Collections.emptyList();
    if (current instanceof java.util.Collection) {
      return (java.util.Collection<Identifier>) current;
    }
    return Arrays.asList((Identifier) current);
  }
  /**
   * The product identifier, such as ISBN. For example: ``` meta itemprop=&quot;productID&quot; content=&quot;isbn:123-456-789&quot; ```.
   * @return productID property set by first invocation of productID method or {@code null}.
   */
  @JsonIgnore public Identifier getProductID() {
    return (Identifier) getValue("productID");
  }
  /**
   * The product identifier, such as ISBN. For example: ``` meta itemprop=&quot;productID&quot; content=&quot;isbn:123-456-789&quot; ```.
   * @return all productID properties as {@link java.util.Collection} or an empty collection 
   * if productID was not set.
   */
  @JsonIgnore public java.util.Collection<Identifier> getProductIDs() {
    final java.lang.Object current = myData.get("productID");
    if (current == null) return Collections.emptyList();
    if (current instanceof java.util.Collection) {
      return (java.util.Collection<Identifier>) current;
    }
    return Arrays.asList((Identifier) current);
  }
  /**
   * Specifies a MerchantReturnPolicy that may be applicable.
   * @return hasMerchantReturnPolicy property set by first invocation of hasMerchantReturnPolicy method or {@code null}.
   */
  @JsonIgnore public MerchantReturnPolicy getHasMerchantReturnPolicy() {
    return (MerchantReturnPolicy) getValue("hasMerchantReturnPolicy");
  }
  /**
   * Specifies a MerchantReturnPolicy that may be applicable.
   * @return all hasMerchantReturnPolicy properties as {@link java.util.Collection} or an empty collection 
   * if hasMerchantReturnPolicy was not set.
   */
  @JsonIgnore public java.util.Collection<MerchantReturnPolicy> getHasMerchantReturnPolicys() {
    final java.lang.Object current = myData.get("hasMerchantReturnPolicy");
    if (current == null) return Collections.emptyList();
    if (current instanceof java.util.Collection) {
      return (java.util.Collection<MerchantReturnPolicy>) current;
    }
    return Arrays.asList((MerchantReturnPolicy) current);
  }
  /**
   * The model of the product. Use with the URL of a ProductModel or a textual representation of the model identifier. The URL of the ProductModel can be from an external source. It is recommended to additionally provide strong product identifiers via the gtin8/gtin13/gtin14 and mpn properties.
   * @return model property set by first invocation of model method or {@code null}.
   */
  @JsonIgnore public ProductModel getModelProductModel() {
    return (ProductModel) getValue("model");
  }
  /**
   * The model of the product. Use with the URL of a ProductModel or a textual representation of the model identifier. The URL of the ProductModel can be from an external source. It is recommended to additionally provide strong product identifiers via the gtin8/gtin13/gtin14 and mpn properties.
   * @return all model properties as {@link java.util.Collection} or an empty collection 
   * if model was not set.
   */
  @JsonIgnore public java.util.Collection<ProductModel> getModelProductModels() {
    final java.lang.Object current = myData.get("model");
    if (current == null) return Collections.emptyList();
    if (current instanceof java.util.Collection) {
      return (java.util.Collection<ProductModel>) current;
    }
    return Arrays.asList((ProductModel) current);
  }
  /**
   * The model of the product. Use with the URL of a ProductModel or a textual representation of the model identifier. The URL of the ProductModel can be from an external source. It is recommended to additionally provide strong product identifiers via the gtin8/gtin13/gtin14 and mpn properties.
   * @return model property set by first invocation of model method or {@code null}.
   */
  @JsonIgnore public String getModelString() {
    return (String) getValue("model");
  }
  /**
   * The model of the product. Use with the URL of a ProductModel or a textual representation of the model identifier. The URL of the ProductModel can be from an external source. It is recommended to additionally provide strong product identifiers via the gtin8/gtin13/gtin14 and mpn properties.
   * @return all model properties as {@link java.util.Collection} or an empty collection 
   * if model was not set.
   */
  @JsonIgnore public java.util.Collection<String> getModelStrings() {
    final java.lang.Object current = myData.get("model");
    if (current == null) return Collections.emptyList();
    if (current instanceof java.util.Collection) {
      return (java.util.Collection<String>) current;
    }
    return Arrays.asList((String) current);
  }
  /**
   * The place where the item (typically [[Product]]) was last processed and tested before importation.
   * @return countryOfLastProcessing property set by first invocation of countryOfLastProcessing method or {@code null}.
   */
  @JsonIgnore public String getCountryOfLastProcessing() {
    return (String) getValue("countryOfLastProcessing");
  }
  /**
   * The place where the item (typically [[Product]]) was last processed and tested before importation.
   * @return all countryOfLastProcessing properties as {@link java.util.Collection} or an empty collection 
   * if countryOfLastProcessing was not set.
   */
  @JsonIgnore public java.util.Collection<String> getCountryOfLastProcessings() {
    final java.lang.Object current = myData.get("countryOfLastProcessing");
    if (current == null) return Collections.emptyList();
    if (current instanceof java.util.Collection) {
      return (java.util.Collection<String>) current;
    }
    return Arrays.asList((String) current);
  }
  /**
   * A category for the item. Greater signs or slashes can be used to informally indicate a category hierarchy.
   * @return category property set by first invocation of category method or {@code null}.
   */
  @JsonIgnore public Category getCategory() {
    return (Category) getValue("category");
  }
  /**
   * A category for the item. Greater signs or slashes can be used to informally indicate a category hierarchy.
   * @return all category properties as {@link java.util.Collection} or an empty collection 
   * if category was not set.
   */
  @JsonIgnore public java.util.Collection<Category> getCategorys() {
    final java.lang.Object current = myData.get("category");
    if (current == null) return Collections.emptyList();
    if (current instanceof java.util.Collection) {
      return (java.util.Collection<Category>) current;
    }
    return Arrays.asList((Category) current);
  }
  /**
   * The place where the product was assembled.
   * @return countryOfAssembly property set by first invocation of countryOfAssembly method or {@code null}.
   */
  @JsonIgnore public String getCountryOfAssembly() {
    return (String) getValue("countryOfAssembly");
  }
  /**
   * The place where the product was assembled.
   * @return all countryOfAssembly properties as {@link java.util.Collection} or an empty collection 
   * if countryOfAssembly was not set.
   */
  @JsonIgnore public java.util.Collection<String> getCountryOfAssemblys() {
    final java.lang.Object current = myData.get("countryOfAssembly");
    if (current == null) return Collections.emptyList();
    if (current instanceof java.util.Collection) {
      return (java.util.Collection<String>) current;
    }
    return Arrays.asList((String) current);
  }
  /**
   * A property-value pair representing an additional characteristics of the entitity, e.g. a product feature or another characteristic for which there is no matching property in schema.org.\n\nNote: Publishers should be aware that applications designed to use specific schema.org properties (e.g. http://schema.org/width, http://schema.org/color, http://schema.org/gtin13, ...) will typically expect such data to be provided using those properties, rather than using the generic property/value mechanism.
   * 
   * @return additionalProperty property set by first invocation of additionalProperty method or {@code null}.
   */
  @JsonIgnore public PropertyValue getAdditionalProperty() {
    return (PropertyValue) getValue("additionalProperty");
  }
  /**
   * A property-value pair representing an additional characteristics of the entitity, e.g. a product feature or another characteristic for which there is no matching property in schema.org.\n\nNote: Publishers should be aware that applications designed to use specific schema.org properties (e.g. http://schema.org/width, http://schema.org/color, http://schema.org/gtin13, ...) will typically expect such data to be provided using those properties, rather than using the generic property/value mechanism.
   * 
   * @return all additionalProperty properties as {@link java.util.Collection} or an empty collection 
   * if additionalProperty was not set.
   */
  @JsonIgnore public java.util.Collection<PropertyValue> getAdditionalPropertys() {
    final java.lang.Object current = myData.get("additionalProperty");
    if (current == null) return Collections.emptyList();
    if (current instanceof java.util.Collection) {
      return (java.util.Collection<PropertyValue>) current;
    }
    return Arrays.asList((PropertyValue) current);
  }
  /**
   * A pointer to another product (or multiple products) for which this product is an accessory or spare part.
   * @return isAccessoryOrSparePartFor property set by first invocation of isAccessoryOrSparePartFor method or {@code null}.
   */
  @JsonIgnore public Product getIsAccessoryOrSparePartFor() {
    return (Product) getValue("isAccessoryOrSparePartFor");
  }
  /**
   * A pointer to another product (or multiple products) for which this product is an accessory or spare part.
   * @return all isAccessoryOrSparePartFor properties as {@link java.util.Collection} or an empty collection 
   * if isAccessoryOrSparePartFor was not set.
   */
  @JsonIgnore public java.util.Collection<Product> getIsAccessoryOrSparePartFors() {
    final java.lang.Object current = myData.get("isAccessoryOrSparePartFor");
    if (current == null) return Collections.emptyList();
    if (current instanceof java.util.Collection) {
      return (java.util.Collection<Product>) current;
    }
    return Arrays.asList((Product) current);
  }
  /**
   *                                 The country of origin of something, including products as well as creative  works such as movie and TV content.
   * 
   * In the case of TV and movie, this would be the country of the principle offices of the production company or individual responsible for the movie. For other kinds of [[CreativeWork]] it is difficult to provide fully general guidance, and properties such as [[contentLocation]] and [[locationCreated]] may be more applicable.
   * 
   * In the case of products, the country of origin of the product. The exact interpretation of this may vary by context and product type, and cannot be fully enumerated here.
   *                                 @return countryOfOrigin property set by first invocation of countryOfOrigin method or {@code null}.
   */
  @JsonIgnore public Country getCountryOfOrigin() {
    return (Country) getValue("countryOfOrigin");
  }
  /**
   *                                     The country of origin of something, including products as well as creative  works such as movie and TV content.
   * 
   * In the case of TV and movie, this would be the country of the principle offices of the production company or individual responsible for the movie. For other kinds of [[CreativeWork]] it is difficult to provide fully general guidance, and properties such as [[contentLocation]] and [[locationCreated]] may be more applicable.
   * 
   * In the case of products, the country of origin of the product. The exact interpretation of this may vary by context and product type, and cannot be fully enumerated here.
   *                                     @return all countryOfOrigin properties as {@link java.util.Collection} or an empty collection 
   *                                     if countryOfOrigin was not set.
   */
  @JsonIgnore public java.util.Collection<Country> getCountryOfOrigins() {
    final java.lang.Object current = myData.get("countryOfOrigin");
    if (current == null) return Collections.emptyList();
    if (current instanceof java.util.Collection) {
      return (java.util.Collection<Country>) current;
    }
    return Arrays.asList((Country) current);
  }
  /**
   * The release date of a product or product model. This can be used to distinguish the exact variant of a product.
   * @return releaseDate property set by first invocation of releaseDate method or {@code null}.
   */
  @JsonIgnore public java.util.Date getReleaseDate() {
    return (java.util.Date) getValue("releaseDate");
  }
  /**
   * The release date of a product or product model. This can be used to distinguish the exact variant of a product.
   * @return all releaseDate properties as {@link java.util.Collection} or an empty collection 
   * if releaseDate was not set.
   */
  @JsonIgnore public java.util.Collection<java.util.Date> getReleaseDates() {
    final java.lang.Object current = myData.get("releaseDate");
    if (current == null) return Collections.emptyList();
    if (current instanceof java.util.Collection) {
      return (java.util.Collection<java.util.Date>) current;
    }
    return Arrays.asList((java.util.Date) current);
  }
  /**
   * A review of the item.
   * @return review property set by first invocation of review method or {@code null}.
   */
  @JsonIgnore public Review getReview() {
    return (Review) getValue("review");
  }
  /**
   * A review of the item.
   * @return all review properties as {@link java.util.Collection} or an empty collection 
   * if review was not set.
   */
  @JsonIgnore public java.util.Collection<Review> getReviews() {
    final java.lang.Object current = myData.get("review");
    if (current == null) return Collections.emptyList();
    if (current instanceof java.util.Collection) {
      return (java.util.Collection<Review>) current;
    }
    return Arrays.asList((Review) current);
  }
  /**
   * The date of production of the item, e.g. vehicle.
   * @return productionDate property set by first invocation of productionDate method or {@code null}.
   */
  @JsonIgnore public java.util.Date getProductionDate() {
    return (java.util.Date) getValue("productionDate");
  }
  /**
   * The date of production of the item, e.g. vehicle.
   * @return all productionDate properties as {@link java.util.Collection} or an empty collection 
   * if productionDate was not set.
   */
  @JsonIgnore public java.util.Collection<java.util.Date> getProductionDates() {
    final java.lang.Object current = myData.get("productionDate");
    if (current == null) return Collections.emptyList();
    if (current instanceof java.util.Collection) {
      return (java.util.Collection<java.util.Date>) current;
    }
    return Arrays.asList((java.util.Date) current);
  }
  /**
   * An award won by or for this item.
   * @return award property set by first invocation of award method or {@code null}.
   */
  @JsonIgnore public String getAward() {
    return (String) getValue("award");
  }
  /**
   * An award won by or for this item.
   * @return all award properties as {@link java.util.Collection} or an empty collection 
   * if award was not set.
   */
  @JsonIgnore public java.util.Collection<String> getAwards() {
    final java.lang.Object current = myData.get("award");
    if (current == null) return Collections.emptyList();
    if (current instanceof java.util.Collection) {
      return (java.util.Collection<String>) current;
    }
    return Arrays.asList((String) current);
  }
  /**
   * The GTIN-8 code of the product, or the product to which the offer refers. This code is also known as EAN/UCC-8 or 8-digit EAN. See [GS1 GTIN Summary](http://www.gs1.org/barcodes/technical/idkeys/gtin) for more details.
   * @return gtin8 property set by first invocation of gtin8 method or {@code null}.
   */
  @JsonIgnore public Gtin getGtin8() {
    return (Gtin) getValue("gtin8");
  }
  /**
   * The GTIN-8 code of the product, or the product to which the offer refers. This code is also known as EAN/UCC-8 or 8-digit EAN. See [GS1 GTIN Summary](http://www.gs1.org/barcodes/technical/idkeys/gtin) for more details.
   * @return all gtin8 properties as {@link java.util.Collection} or an empty collection 
   * if gtin8 was not set.
   */
  @JsonIgnore public java.util.Collection<Gtin> getGtin8s() {
    final java.lang.Object current = myData.get("gtin8");
    if (current == null) return Collections.emptyList();
    if (current instanceof java.util.Collection) {
      return (java.util.Collection<Gtin>) current;
    }
    return Arrays.asList((Gtin) current);
  }
  /**
   * The weight of the product or person.
   * @return weight property set by first invocation of weight method or {@code null}.
   */
  @JsonIgnore public QuantitativeValue getWeight() {
    return (QuantitativeValue) getValue("weight");
  }
  /**
   * The weight of the product or person.
   * @return all weight properties as {@link java.util.Collection} or an empty collection 
   * if weight was not set.
   */
  @JsonIgnore public java.util.Collection<QuantitativeValue> getWeights() {
    final java.lang.Object current = myData.get("weight");
    if (current == null) return Collections.emptyList();
    if (current instanceof java.util.Collection) {
      return (java.util.Collection<QuantitativeValue>) current;
    }
    return Arrays.asList((QuantitativeValue) current);
  }
  /**
   * Defines the energy efficiency Category (also known as &quot;class&quot; or &quot;rating&quot;) for a product according to an international energy efficiency standard.
   * @return hasEnergyConsumptionDetails property set by first invocation of hasEnergyConsumptionDetails method or {@code null}.
   */
  @JsonIgnore public EnergyConsumptionDetails getHasEnergyConsumptionDetails() {
    return (EnergyConsumptionDetails) getValue("hasEnergyConsumptionDetails");
  }
  /**
   * Defines the energy efficiency Category (also known as &quot;class&quot; or &quot;rating&quot;) for a product according to an international energy efficiency standard.
   * @return all hasEnergyConsumptionDetails properties as {@link java.util.Collection} or an empty collection 
   * if hasEnergyConsumptionDetails was not set.
   */
  @JsonIgnore public java.util.Collection<EnergyConsumptionDetails> getHasEnergyConsumptionDetailss() {
    final java.lang.Object current = myData.get("hasEnergyConsumptionDetails");
    if (current == null) return Collections.emptyList();
    if (current instanceof java.util.Collection) {
      return (java.util.Collection<EnergyConsumptionDetails>) current;
    }
    return Arrays.asList((EnergyConsumptionDetails) current);
  }
  /**
   * A product measurement, for example the inseam of pants, the wheel size of a bicycle, or the gauge of a screw. Usually an exact measurement, but can also be a range of measurements for adjustable products, for example belts and ski bindings.
   * @return hasMeasurement property set by first invocation of hasMeasurement method or {@code null}.
   */
  @JsonIgnore public QuantitativeValue getHasMeasurement() {
    return (QuantitativeValue) getValue("hasMeasurement");
  }
  /**
   * A product measurement, for example the inseam of pants, the wheel size of a bicycle, or the gauge of a screw. Usually an exact measurement, but can also be a range of measurements for adjustable products, for example belts and ski bindings.
   * @return all hasMeasurement properties as {@link java.util.Collection} or an empty collection 
   * if hasMeasurement was not set.
   */
  @JsonIgnore public java.util.Collection<QuantitativeValue> getHasMeasurements() {
    final java.lang.Object current = myData.get("hasMeasurement");
    if (current == null) return Collections.emptyList();
    if (current instanceof java.util.Collection) {
      return (java.util.Collection<QuantitativeValue>) current;
    }
    return Arrays.asList((QuantitativeValue) current);
  }
  /**
   * A pointer to another product (or multiple products) for which this product is a consumable.
   * @return isConsumableFor property set by first invocation of isConsumableFor method or {@code null}.
   */
  @JsonIgnore public Product getIsConsumableFor() {
    return (Product) getValue("isConsumableFor");
  }
  /**
   * A pointer to another product (or multiple products) for which this product is a consumable.
   * @return all isConsumableFor properties as {@link java.util.Collection} or an empty collection 
   * if isConsumableFor was not set.
   */
  @JsonIgnore public java.util.Collection<Product> getIsConsumableFors() {
    final java.lang.Object current = myData.get("isConsumableFor");
    if (current == null) return Collections.emptyList();
    if (current instanceof java.util.Collection) {
      return (java.util.Collection<Product>) current;
    }
    return Arrays.asList((Product) current);
  }
  /**
   * The color of the product.
   * @return color property set by first invocation of color method or {@code null}.
   */
  @JsonIgnore public String getColor() {
    return (String) getValue("color");
  }
  /**
   * The color of the product.
   * @return all color properties as {@link java.util.Collection} or an empty collection 
   * if color was not set.
   */
  @JsonIgnore public java.util.Collection<String> getColors() {
    final java.lang.Object current = myData.get("color");
    if (current == null) return Collections.emptyList();
    if (current instanceof java.util.Collection) {
      return (java.util.Collection<String>) current;
    }
    return Arrays.asList((String) current);
  }
  /**
   * A slogan or motto associated with the item.
   * @return slogan property set by first invocation of slogan method or {@code null}.
   */
  @JsonIgnore public String getSlogan() {
    return (String) getValue("slogan");
  }
  /**
   * A slogan or motto associated with the item.
   * @return all slogan properties as {@link java.util.Collection} or an empty collection 
   * if slogan was not set.
   */
  @JsonIgnore public java.util.Collection<String> getSlogans() {
    final java.lang.Object current = myData.get("slogan");
    if (current == null) return Collections.emptyList();
    if (current instanceof java.util.Collection) {
      return (java.util.Collection<String>) current;
    }
    return Arrays.asList((String) current);
  }
  /**
   * Indicates the kind of product that this is a variant of. In the case of [[ProductModel]], this is a pointer (from a ProductModel) to a base product from which this product is a variant. It is safe to infer that the variant inherits all product features from the base model, unless defined locally. This is not transitive. In the case of a [[ProductGroup]], the group description also serves as a template, representing a set of Products that vary on explicitly defined, specific dimensions only (so it defines both a set of variants, as well as which values distinguish amongst those variants). When used with [[ProductGroup]], this property can apply to any [[Product]] included in the group.
   * @return isVariantOf property set by first invocation of isVariantOf method or {@code null}.
   */
  @JsonIgnore public ProductGroup getIsVariantOfProductGroup() {
    return (ProductGroup) getValue("isVariantOf");
  }
  /**
   * Indicates the kind of product that this is a variant of. In the case of [[ProductModel]], this is a pointer (from a ProductModel) to a base product from which this product is a variant. It is safe to infer that the variant inherits all product features from the base model, unless defined locally. This is not transitive. In the case of a [[ProductGroup]], the group description also serves as a template, representing a set of Products that vary on explicitly defined, specific dimensions only (so it defines both a set of variants, as well as which values distinguish amongst those variants). When used with [[ProductGroup]], this property can apply to any [[Product]] included in the group.
   * @return all isVariantOf properties as {@link java.util.Collection} or an empty collection 
   * if isVariantOf was not set.
   */
  @JsonIgnore public java.util.Collection<ProductGroup> getIsVariantOfProductGroups() {
    final java.lang.Object current = myData.get("isVariantOf");
    if (current == null) return Collections.emptyList();
    if (current instanceof java.util.Collection) {
      return (java.util.Collection<ProductGroup>) current;
    }
    return Arrays.asList((ProductGroup) current);
  }
  /**
   * Indicates the kind of product that this is a variant of. In the case of [[ProductModel]], this is a pointer (from a ProductModel) to a base product from which this product is a variant. It is safe to infer that the variant inherits all product features from the base model, unless defined locally. This is not transitive. In the case of a [[ProductGroup]], the group description also serves as a template, representing a set of Products that vary on explicitly defined, specific dimensions only (so it defines both a set of variants, as well as which values distinguish amongst those variants). When used with [[ProductGroup]], this property can apply to any [[Product]] included in the group.
   * @return isVariantOf property set by first invocation of isVariantOf method or {@code null}.
   */
  @JsonIgnore public ProductModel getIsVariantOfProductModel() {
    return (ProductModel) getValue("isVariantOf");
  }
  /**
   * Indicates the kind of product that this is a variant of. In the case of [[ProductModel]], this is a pointer (from a ProductModel) to a base product from which this product is a variant. It is safe to infer that the variant inherits all product features from the base model, unless defined locally. This is not transitive. In the case of a [[ProductGroup]], the group description also serves as a template, representing a set of Products that vary on explicitly defined, specific dimensions only (so it defines both a set of variants, as well as which values distinguish amongst those variants). When used with [[ProductGroup]], this property can apply to any [[Product]] included in the group.
   * @return all isVariantOf properties as {@link java.util.Collection} or an empty collection 
   * if isVariantOf was not set.
   */
  @JsonIgnore public java.util.Collection<ProductModel> getIsVariantOfProductModels() {
    final java.lang.Object current = myData.get("isVariantOf");
    if (current == null) return Collections.emptyList();
    if (current instanceof java.util.Collection) {
      return (java.util.Collection<ProductModel>) current;
    }
    return Arrays.asList((ProductModel) current);
  }
  /**
   * An offer to provide this item&amp;#x2014;for example, an offer to sell a product, rent the DVD of a movie, perform a service, or give away tickets to an event. Use [[businessFunction]] to indicate the kind of transaction offered, i.e. sell, lease, etc. This property can also be used to describe a [[Demand]]. While this property is listed as expected on a number of common types, it can be used in others. In that case, using a second type, such as Product or a subtype of Product, can clarify the nature of the offer.
   * 
   * @return offers property set by first invocation of offers method or {@code null}.
   */
  @JsonIgnore public Demand getOffersDemand() {
    return (Demand) getValue("offers");
  }
  /**
   * An offer to provide this item&amp;#x2014;for example, an offer to sell a product, rent the DVD of a movie, perform a service, or give away tickets to an event. Use [[businessFunction]] to indicate the kind of transaction offered, i.e. sell, lease, etc. This property can also be used to describe a [[Demand]]. While this property is listed as expected on a number of common types, it can be used in others. In that case, using a second type, such as Product or a subtype of Product, can clarify the nature of the offer.
   * 
   * @return all offers properties as {@link java.util.Collection} or an empty collection 
   * if offers was not set.
   */
  @JsonIgnore public java.util.Collection<Demand> getOffersDemands() {
    final java.lang.Object current = myData.get("offers");
    if (current == null) return Collections.emptyList();
    if (current instanceof java.util.Collection) {
      return (java.util.Collection<Demand>) current;
    }
    return Arrays.asList((Demand) current);
  }
  /**
   * An offer to provide this item&amp;#x2014;for example, an offer to sell a product, rent the DVD of a movie, perform a service, or give away tickets to an event. Use [[businessFunction]] to indicate the kind of transaction offered, i.e. sell, lease, etc. This property can also be used to describe a [[Demand]]. While this property is listed as expected on a number of common types, it can be used in others. In that case, using a second type, such as Product or a subtype of Product, can clarify the nature of the offer.
   * 
   * @return offers property set by first invocation of offers method or {@code null}.
   */
  @JsonIgnore public Offer getOffersOffer() {
    return (Offer) getValue("offers");
  }
  /**
   * An offer to provide this item&amp;#x2014;for example, an offer to sell a product, rent the DVD of a movie, perform a service, or give away tickets to an event. Use [[businessFunction]] to indicate the kind of transaction offered, i.e. sell, lease, etc. This property can also be used to describe a [[Demand]]. While this property is listed as expected on a number of common types, it can be used in others. In that case, using a second type, such as Product or a subtype of Product, can clarify the nature of the offer.
   * 
   * @return all offers properties as {@link java.util.Collection} or an empty collection 
   * if offers was not set.
   */
  @JsonIgnore public java.util.Collection<Offer> getOffersOffers() {
    final java.lang.Object current = myData.get("offers");
    if (current == null) return Collections.emptyList();
    if (current instanceof java.util.Collection) {
      return (java.util.Collection<Offer>) current;
    }
    return Arrays.asList((Offer) current);
  }
  protected Product(java.util.Map<String,java.lang.Object> data) {
    super(data);
  }
  
  /**
   * Builder for {@link Product}
   */
  public static class Builder extends Thing.Builder {
    public Builder(@NotNull HashMap<String,java.lang.Object> data) {
      super(data);
    }
    @NotNull public Product build() {
      return new Product(myData);
    }
    /**
     * The width of the item.
     * @param distance value to set
     * @return this builder instance
     */
    @NotNull public Builder width(@NotNull Distance distance) {
      putValue("width", distance);
      return this;
    }
    /**
     * The width of the item.
     * @param distance value to set
     * @return this builder instance
     */
    @NotNull public Builder width(@NotNull Distance.Builder distance) {
      putValue("width", distance.build());
      return this;
    }
    /**
     * The width of the item.
     * @param quantitativeValue value to set
     * @return this builder instance
     */
    @NotNull public Builder width(@NotNull QuantitativeValue quantitativeValue) {
      putValue("width", quantitativeValue);
      return this;
    }
    /**
     * The width of the item.
     * @param quantitativeValue value to set
     * @return this builder instance
     */
    @NotNull public Builder width(@NotNull QuantitativeValue.Builder quantitativeValue) {
      putValue("width", quantitativeValue.build());
      return this;
    }
    /**
     * Remove width property from the builder.
     * If this property is repeatable, all instances are removed.
     * @return this builder instance
     */
    @NotNull public Builder removeWidth() {
      removeValue("width");
      return this;
    }
    /**
     * Get currently set value for width property in this builder.
     * @return previously set value or {@code null}. If multiple values have been 
     * set to this property, then {@link java.util.Collection} instance will be 
     * returned.
     */
    @Nullable public java.lang.Object getWidth() {
      return myData.get("width");
    }
    /**
     * The manufacturer of the product.
     * @param organization value to set
     * @return this builder instance
     */
    @NotNull public Builder manufacturer(@NotNull Organization organization) {
      putValue("manufacturer", organization);
      return this;
    }
    /**
     * The manufacturer of the product.
     * @param organization value to set
     * @return this builder instance
     */
    @NotNull public Builder manufacturer(@NotNull Organization.Builder organization) {
      putValue("manufacturer", organization.build());
      return this;
    }
    /**
     * Remove manufacturer property from the builder.
     * If this property is repeatable, all instances are removed.
     * @return this builder instance
     */
    @NotNull public Builder removeManufacturer() {
      removeValue("manufacturer");
      return this;
    }
    /**
     * Get currently set value for manufacturer property in this builder.
     * @return previously set value or {@code null}. If multiple values have been 
     * set to this property, then {@link java.util.Collection} instance will be 
     * returned.
     */
    @Nullable public java.lang.Object getManufacturer() {
      return myData.get("manufacturer");
    }
    /**
     * A standardized size of a product or creative work, specified either through a simple textual string (for example 'XL', '32Wx34L'), a  QuantitativeValue with a unitCode, or a comprehensive and structured [[SizeSpecification]]; in other cases, the [[width]], [[height]], [[depth]] and [[weight]] properties may be more applicable. 
     * @param definedTerm value to set
     * @return this builder instance
     */
    @NotNull public Builder size(@NotNull DefinedTerm definedTerm) {
      putValue("size", definedTerm);
      return this;
    }
    /**
     * A standardized size of a product or creative work, specified either through a simple textual string (for example 'XL', '32Wx34L'), a  QuantitativeValue with a unitCode, or a comprehensive and structured [[SizeSpecification]]; in other cases, the [[width]], [[height]], [[depth]] and [[weight]] properties may be more applicable. 
     * @param definedTerm value to set
     * @return this builder instance
     */
    @NotNull public Builder size(@NotNull DefinedTerm.Builder definedTerm) {
      putValue("size", definedTerm.build());
      return this;
    }
    /**
     * A standardized size of a product or creative work, specified either through a simple textual string (for example 'XL', '32Wx34L'), a  QuantitativeValue with a unitCode, or a comprehensive and structured [[SizeSpecification]]; in other cases, the [[width]], [[height]], [[depth]] and [[weight]] properties may be more applicable. 
     * @param quantitativeValue value to set
     * @return this builder instance
     */
    @NotNull public Builder size(@NotNull QuantitativeValue quantitativeValue) {
      putValue("size", quantitativeValue);
      return this;
    }
    /**
     * A standardized size of a product or creative work, specified either through a simple textual string (for example 'XL', '32Wx34L'), a  QuantitativeValue with a unitCode, or a comprehensive and structured [[SizeSpecification]]; in other cases, the [[width]], [[height]], [[depth]] and [[weight]] properties may be more applicable. 
     * @param quantitativeValue value to set
     * @return this builder instance
     */
    @NotNull public Builder size(@NotNull QuantitativeValue.Builder quantitativeValue) {
      putValue("size", quantitativeValue.build());
      return this;
    }
    /**
     * A standardized size of a product or creative work, specified either through a simple textual string (for example 'XL', '32Wx34L'), a  QuantitativeValue with a unitCode, or a comprehensive and structured [[SizeSpecification]]; in other cases, the [[width]], [[height]], [[depth]] and [[weight]] properties may be more applicable. 
     * @param sizeSpecification value to set
     * @return this builder instance
     */
    @NotNull public Builder size(@NotNull SizeSpecification sizeSpecification) {
      putValue("size", sizeSpecification);
      return this;
    }
    /**
     * A standardized size of a product or creative work, specified either through a simple textual string (for example 'XL', '32Wx34L'), a  QuantitativeValue with a unitCode, or a comprehensive and structured [[SizeSpecification]]; in other cases, the [[width]], [[height]], [[depth]] and [[weight]] properties may be more applicable. 
     * @param sizeSpecification value to set
     * @return this builder instance
     */
    @NotNull public Builder size(@NotNull SizeSpecification.Builder sizeSpecification) {
      putValue("size", sizeSpecification.build());
      return this;
    }
    /**
     * A standardized size of a product or creative work, specified either through a simple textual string (for example 'XL', '32Wx34L'), a  QuantitativeValue with a unitCode, or a comprehensive and structured [[SizeSpecification]]; in other cases, the [[width]], [[height]], [[depth]] and [[weight]] properties may be more applicable. 
     * @param size value to set
     * @return this builder instance
     */
    @NotNull public Builder size(@NotNull String size) {
      putValue("size", size);
      return this;
    }
    /**
     * Remove size property from the builder.
     * If this property is repeatable, all instances are removed.
     * @return this builder instance
     */
    @NotNull public Builder removeSize() {
      removeValue("size");
      return this;
    }
    /**
     * Get currently set value for size property in this builder.
     * @return previously set value or {@code null}. If multiple values have been 
     * set to this property, then {@link java.util.Collection} instance will be 
     * returned.
     */
    @Nullable public java.lang.Object getSize() {
      return myData.get("size");
    }
    /**
     * The date the item e.g. vehicle was purchased by the current owner.
     * @param date value to set
     * @return this builder instance
     */
    @NotNull public Builder purchaseDate(@NotNull java.util.Date date) {
      putValue("purchaseDate", date);
      return this;
    }
    /**
     * Remove purchaseDate property from the builder.
     * If this property is repeatable, all instances are removed.
     * @return this builder instance
     */
    @NotNull public Builder removePurchaseDate() {
      removeValue("purchaseDate");
      return this;
    }
    /**
     * Get currently set value for purchaseDate property in this builder.
     * @return previously set value or {@code null}. If multiple values have been 
     * set to this property, then {@link java.util.Collection} instance will be 
     * returned.
     */
    @Nullable public java.lang.Object getPurchaseDate() {
      return myData.get("purchaseDate");
    }
    /**
     * Indicates the [[productGroupID]] for a [[ProductGroup]] that this product [[isVariantOf]]. 
     * @param inProductGroupWithID value to set
     * @return this builder instance
     */
    @NotNull public Builder inProductGroupWithID(@NotNull String inProductGroupWithID) {
      putValue("inProductGroupWithID", inProductGroupWithID);
      return this;
    }
    /**
     * Remove inProductGroupWithID property from the builder.
     * If this property is repeatable, all instances are removed.
     * @return this builder instance
     */
    @NotNull public Builder removeInProductGroupWithID() {
      removeValue("inProductGroupWithID");
      return this;
    }
    /**
     * Get currently set value for inProductGroupWithID property in this builder.
     * @return previously set value or {@code null}. If multiple values have been 
     * set to this property, then {@link java.util.Collection} instance will be 
     * returned.
     */
    @Nullable public java.lang.Object getInProductGroupWithID() {
      return myData.get("inProductGroupWithID");
    }
    /**
     * The GTIN-13 code of the product, or the product to which the offer refers. This is equivalent to 13-digit ISBN codes and EAN UCC-13. Former 12-digit UPC codes can be converted into a GTIN-13 code by simply adding a preceding zero. See [GS1 GTIN Summary](http://www.gs1.org/barcodes/technical/idkeys/gtin) for more details.
     * @param gtin value to set
     * @return this builder instance
     */
    @NotNull public Builder gtin13(@NotNull Gtin gtin) {
      putValue("gtin13", gtin);
      return this;
    }
    /**
     * Remove gtin13 property from the builder.
     * If this property is repeatable, all instances are removed.
     * @return this builder instance
     */
    @NotNull public Builder removeGtin13() {
      removeValue("gtin13");
      return this;
    }
    /**
     * Get currently set value for gtin13 property in this builder.
     * @return previously set value or {@code null}. If multiple values have been 
     * set to this property, then {@link java.util.Collection} instance will be 
     * returned.
     */
    @Nullable public java.lang.Object getGtin13() {
      return myData.get("gtin13");
    }
    /**
     * A Global Trade Item Number ([GTIN](https://www.gs1.org/standards/id-keys/gtin)). GTINs identify trade items, including products and services, using numeric identification codes. The [[gtin]] property generalizes the earlier [[gtin8]], [[gtin12]], [[gtin13]], and [[gtin14]] properties. The GS1 [digital link specifications](https://www.gs1.org/standards/Digital-Link/) express GTINs as URLs. A correct [[gtin]] value should be a valid GTIN, which means that it should be an all-numeric string of either 8, 12, 13 or 14 digits, or a &quot;GS1 Digital Link&quot; URL based on such a string. The numeric component should also have a [valid GS1 check digit](https://www.gs1.org/services/check-digit-calculator) and meet the other rules for valid GTINs. See also [GS1's GTIN Summary](http://www.gs1.org/barcodes/technical/idkeys/gtin) and [Wikipedia](https://en.wikipedia.org/wiki/Global_Trade_Item_Number) for more details. Left-padding of the gtin values is not required or encouraged.
     * 
     * @param gtin value to set
     * @return this builder instance
     */
    @NotNull public Builder gtin(@NotNull Gtin gtin) {
      putValue("gtin", gtin);
      return this;
    }
    /**
     * Remove gtin property from the builder.
     * If this property is repeatable, all instances are removed.
     * @return this builder instance
     */
    @NotNull public Builder removeGtin() {
      removeValue("gtin");
      return this;
    }
    /**
     * Get currently set value for gtin property in this builder.
     * @return previously set value or {@code null}. If multiple values have been 
     * set to this property, then {@link java.util.Collection} instance will be 
     * returned.
     */
    @Nullable public java.lang.Object getGtin() {
      return myData.get("gtin");
    }
    /**
     * A material that something is made from, e.g. leather, wool, cotton, paper.
     * @param material value to set
     * @return this builder instance
     */
    @NotNull public Builder material(@NotNull Material material) {
      putValue("material", material);
      return this;
    }
    /**
     * Remove material property from the builder.
     * If this property is repeatable, all instances are removed.
     * @return this builder instance
     */
    @NotNull public Builder removeMaterial() {
      removeValue("material");
      return this;
    }
    /**
     * Get currently set value for material property in this builder.
     * @return previously set value or {@code null}. If multiple values have been 
     * set to this property, then {@link java.util.Collection} instance will be 
     * returned.
     */
    @Nullable public java.lang.Object getMaterial() {
      return myData.get("material");
    }
    /**
     * A pattern that something has, for example 'polka dot', 'striped', 'Canadian flag'. Values are typically expressed as text, although links to controlled value schemes are also supported.
     * @param definedTerm value to set
     * @return this builder instance
     */
    @NotNull public Builder pattern(@NotNull DefinedTerm definedTerm) {
      putValue("pattern", definedTerm);
      return this;
    }
    /**
     * A pattern that something has, for example 'polka dot', 'striped', 'Canadian flag'. Values are typically expressed as text, although links to controlled value schemes are also supported.
     * @param definedTerm value to set
     * @return this builder instance
     */
    @NotNull public Builder pattern(@NotNull DefinedTerm.Builder definedTerm) {
      putValue("pattern", definedTerm.build());
      return this;
    }
    /**
     * A pattern that something has, for example 'polka dot', 'striped', 'Canadian flag'. Values are typically expressed as text, although links to controlled value schemes are also supported.
     * @param pattern value to set
     * @return this builder instance
     */
    @NotNull public Builder pattern(@NotNull String pattern) {
      putValue("pattern", pattern);
      return this;
    }
    /**
     * Remove pattern property from the builder.
     * If this property is repeatable, all instances are removed.
     * @return this builder instance
     */
    @NotNull public Builder removePattern() {
      removeValue("pattern");
      return this;
    }
    /**
     * Get currently set value for pattern property in this builder.
     * @return previously set value or {@code null}. If multiple values have been 
     * set to this property, then {@link java.util.Collection} instance will be 
     * returned.
     */
    @Nullable public java.lang.Object getPattern() {
      return myData.get("pattern");
    }
    /**
     * The GTIN-14 code of the product, or the product to which the offer refers. See [GS1 GTIN Summary](http://www.gs1.org/barcodes/technical/idkeys/gtin) for more details.
     * @param identifier value to set
     * @return this builder instance
     */
    @NotNull public Builder gtin14(@NotNull Identifier identifier) {
      putValue("gtin14", identifier);
      return this;
    }
    /**
     * Remove gtin14 property from the builder.
     * If this property is repeatable, all instances are removed.
     * @return this builder instance
     */
    @NotNull public Builder removeGtin14() {
      removeValue("gtin14");
      return this;
    }
    /**
     * Get currently set value for gtin14 property in this builder.
     * @return previously set value or {@code null}. If multiple values have been 
     * set to this property, then {@link java.util.Collection} instance will be 
     * returned.
     */
    @Nullable public java.lang.Object getGtin14() {
      return myData.get("gtin14");
    }
    /**
     * A predefined value from OfferItemCondition specifying the condition of the product or service, or the products or services included in the offer. Also used for product return policies to specify the condition of products accepted for returns.
     * @param offerItemCondition value to set
     * @return this builder instance
     */
    @NotNull public Builder itemCondition(@NotNull OfferItemCondition offerItemCondition) {
      putValue("itemCondition", offerItemCondition);
      return this;
    }
    /**
     * Remove itemCondition property from the builder.
     * If this property is repeatable, all instances are removed.
     * @return this builder instance
     */
    @NotNull public Builder removeItemCondition() {
      removeValue("itemCondition");
      return this;
    }
    /**
     * Get currently set value for itemCondition property in this builder.
     * @return previously set value or {@code null}. If multiple values have been 
     * set to this property, then {@link java.util.Collection} instance will be 
     * returned.
     */
    @Nullable public java.lang.Object getItemCondition() {
      return myData.get("itemCondition");
    }
    /**
     * The overall rating, based on a collection of reviews or ratings, of the item.
     * @param aggregateRating value to set
     * @return this builder instance
     */
    @NotNull public Builder aggregateRating(@NotNull AggregateRating aggregateRating) {
      putValue("aggregateRating", aggregateRating);
      return this;
    }
    /**
     * The overall rating, based on a collection of reviews or ratings, of the item.
     * @param aggregateRating value to set
     * @return this builder instance
     */
    @NotNull public Builder aggregateRating(@NotNull AggregateRating.Builder aggregateRating) {
      putValue("aggregateRating", aggregateRating.build());
      return this;
    }
    /**
     * Remove aggregateRating property from the builder.
     * If this property is repeatable, all instances are removed.
     * @return this builder instance
     */
    @NotNull public Builder removeAggregateRating() {
      removeValue("aggregateRating");
      return this;
    }
    /**
     * Get currently set value for aggregateRating property in this builder.
     * @return previously set value or {@code null}. If multiple values have been 
     * set to this property, then {@link java.util.Collection} instance will be 
     * returned.
     */
    @Nullable public java.lang.Object getAggregateRating() {
      return myData.get("aggregateRating");
    }
    /**
     * The Manufacturer Part Number (MPN) of the product, or the product to which the offer refers.
     * @param mpn value to set
     * @return this builder instance
     */
    @NotNull public Builder mpn(@NotNull String mpn) {
      putValue("mpn", mpn);
      return this;
    }
    /**
     * Remove mpn property from the builder.
     * If this property is repeatable, all instances are removed.
     * @return this builder instance
     */
    @NotNull public Builder removeMpn() {
      removeValue("mpn");
      return this;
    }
    /**
     * Get currently set value for mpn property in this builder.
     * @return previously set value or {@code null}. If multiple values have been 
     * set to this property, then {@link java.util.Collection} instance will be 
     * returned.
     */
    @Nullable public java.lang.Object getMpn() {
      return myData.get("mpn");
    }
    /**
     * The depth of the item.
     * @param distance value to set
     * @return this builder instance
     */
    @NotNull public Builder depth(@NotNull Distance distance) {
      putValue("depth", distance);
      return this;
    }
    /**
     * The depth of the item.
     * @param distance value to set
     * @return this builder instance
     */
    @NotNull public Builder depth(@NotNull Distance.Builder distance) {
      putValue("depth", distance.build());
      return this;
    }
    /**
     * The depth of the item.
     * @param quantitativeValue value to set
     * @return this builder instance
     */
    @NotNull public Builder depth(@NotNull QuantitativeValue quantitativeValue) {
      putValue("depth", quantitativeValue);
      return this;
    }
    /**
     * The depth of the item.
     * @param quantitativeValue value to set
     * @return this builder instance
     */
    @NotNull public Builder depth(@NotNull QuantitativeValue.Builder quantitativeValue) {
      putValue("depth", quantitativeValue.build());
      return this;
    }
    /**
     * Remove depth property from the builder.
     * If this property is repeatable, all instances are removed.
     * @return this builder instance
     */
    @NotNull public Builder removeDepth() {
      removeValue("depth");
      return this;
    }
    /**
     * Get currently set value for depth property in this builder.
     * @return previously set value or {@code null}. If multiple values have been 
     * set to this property, then {@link java.util.Collection} instance will be 
     * returned.
     */
    @Nullable public java.lang.Object getDepth() {
      return myData.get("depth");
    }
    /**
     * An associated logo.
     * @param image value to set
     * @return this builder instance
     */
    @NotNull public Builder logo(@NotNull Image image) {
      putValue("logo", image);
      return this;
    }
    /**
     * Remove logo property from the builder.
     * If this property is repeatable, all instances are removed.
     * @return this builder instance
     */
    @NotNull public Builder removeLogo() {
      removeValue("logo");
      return this;
    }
    /**
     * Get currently set value for logo property in this builder.
     * @return previously set value or {@code null}. If multiple values have been 
     * set to this property, then {@link java.util.Collection} instance will be 
     * returned.
     */
    @Nullable public java.lang.Object getLogo() {
      return myData.get("logo");
    }
    /**
     * The GTIN-12 code of the product, or the product to which the offer refers. The GTIN-12 is the 12-digit GS1 Identification Key composed of a U.P.C. Company Prefix, Item Reference, and Check Digit used to identify trade items. See [GS1 GTIN Summary](http://www.gs1.org/barcodes/technical/idkeys/gtin) for more details.
     * @param identifier value to set
     * @return this builder instance
     */
    @NotNull public Builder gtin12(@NotNull Identifier identifier) {
      putValue("gtin12", identifier);
      return this;
    }
    /**
     * Remove gtin12 property from the builder.
     * If this property is repeatable, all instances are removed.
     * @return this builder instance
     */
    @NotNull public Builder removeGtin12() {
      removeValue("gtin12");
      return this;
    }
    /**
     * Get currently set value for gtin12 property in this builder.
     * @return previously set value or {@code null}. If multiple values have been 
     * set to this property, then {@link java.util.Collection} instance will be 
     * returned.
     */
    @Nullable public java.lang.Object getGtin12() {
      return myData.get("gtin12");
    }
    /**
     * The height of the item.
     * @param distance value to set
     * @return this builder instance
     */
    @NotNull public Builder height(@NotNull Distance distance) {
      putValue("height", distance);
      return this;
    }
    /**
     * The height of the item.
     * @param distance value to set
     * @return this builder instance
     */
    @NotNull public Builder height(@NotNull Distance.Builder distance) {
      putValue("height", distance.build());
      return this;
    }
    /**
     * The height of the item.
     * @param quantitativeValue value to set
     * @return this builder instance
     */
    @NotNull public Builder height(@NotNull QuantitativeValue quantitativeValue) {
      putValue("height", quantitativeValue);
      return this;
    }
    /**
     * The height of the item.
     * @param quantitativeValue value to set
     * @return this builder instance
     */
    @NotNull public Builder height(@NotNull QuantitativeValue.Builder quantitativeValue) {
      putValue("height", quantitativeValue.build());
      return this;
    }
    /**
     * Remove height property from the builder.
     * If this property is repeatable, all instances are removed.
     * @return this builder instance
     */
    @NotNull public Builder removeHeight() {
      removeValue("height");
      return this;
    }
    /**
     * Get currently set value for height property in this builder.
     * @return previously set value or {@code null}. If multiple values have been 
     * set to this property, then {@link java.util.Collection} instance will be 
     * returned.
     */
    @Nullable public java.lang.Object getHeight() {
      return myData.get("height");
    }
    /**
     * The Stock Keeping Unit (SKU), i.e. a merchant-specific identifier for a product or service, or the product to which the offer refers.
     * @param identifier value to set
     * @return this builder instance
     */
    @NotNull public Builder sku(@NotNull Identifier identifier) {
      putValue("sku", identifier);
      return this;
    }
    /**
     * Remove sku property from the builder.
     * If this property is repeatable, all instances are removed.
     * @return this builder instance
     */
    @NotNull public Builder removeSku() {
      removeValue("sku");
      return this;
    }
    /**
     * Get currently set value for sku property in this builder.
     * @return previously set value or {@code null}. If multiple values have been 
     * set to this property, then {@link java.util.Collection} instance will be 
     * returned.
     */
    @Nullable public java.lang.Object getSku() {
      return myData.get("sku");
    }
    /**
     * A pointer to another, functionally similar product (or multiple products).
     * @param product value to set
     * @return this builder instance
     */
    @NotNull public Builder isSimilarTo(@NotNull Product product) {
      putValue("isSimilarTo", product);
      return this;
    }
    /**
     * A pointer to another, functionally similar product (or multiple products).
     * @param product value to set
     * @return this builder instance
     */
    @NotNull public Builder isSimilarTo(@NotNull Product.Builder product) {
      putValue("isSimilarTo", product.build());
      return this;
    }
    /**
     * A pointer to another, functionally similar product (or multiple products).
     * @param service value to set
     * @return this builder instance
     */
    @NotNull public Builder isSimilarTo(@NotNull Service service) {
      putValue("isSimilarTo", service);
      return this;
    }
    /**
     * A pointer to another, functionally similar product (or multiple products).
     * @param service value to set
     * @return this builder instance
     */
    @NotNull public Builder isSimilarTo(@NotNull Service.Builder service) {
      putValue("isSimilarTo", service.build());
      return this;
    }
    /**
     * Remove isSimilarTo property from the builder.
     * If this property is repeatable, all instances are removed.
     * @return this builder instance
     */
    @NotNull public Builder removeIsSimilarTo() {
      removeValue("isSimilarTo");
      return this;
    }
    /**
     * Get currently set value for isSimilarTo property in this builder.
     * @return previously set value or {@code null}. If multiple values have been 
     * set to this property, then {@link java.util.Collection} instance will be 
     * returned.
     */
    @Nullable public java.lang.Object getIsSimilarTo() {
      return myData.get("isSimilarTo");
    }
    /**
     * A pointer to another, somehow related product (or multiple products).
     * @param product value to set
     * @return this builder instance
     */
    @NotNull public Builder isRelatedTo(@NotNull Product product) {
      putValue("isRelatedTo", product);
      return this;
    }
    /**
     * A pointer to another, somehow related product (or multiple products).
     * @param product value to set
     * @return this builder instance
     */
    @NotNull public Builder isRelatedTo(@NotNull Product.Builder product) {
      putValue("isRelatedTo", product.build());
      return this;
    }
    /**
     * A pointer to another, somehow related product (or multiple products).
     * @param service value to set
     * @return this builder instance
     */
    @NotNull public Builder isRelatedTo(@NotNull Service service) {
      putValue("isRelatedTo", service);
      return this;
    }
    /**
     * A pointer to another, somehow related product (or multiple products).
     * @param service value to set
     * @return this builder instance
     */
    @NotNull public Builder isRelatedTo(@NotNull Service.Builder service) {
      putValue("isRelatedTo", service.build());
      return this;
    }
    /**
     * Remove isRelatedTo property from the builder.
     * If this property is repeatable, all instances are removed.
     * @return this builder instance
     */
    @NotNull public Builder removeIsRelatedTo() {
      removeValue("isRelatedTo");
      return this;
    }
    /**
     * Get currently set value for isRelatedTo property in this builder.
     * @return previously set value or {@code null}. If multiple values have been 
     * set to this property, then {@link java.util.Collection} instance will be 
     * returned.
     */
    @Nullable public java.lang.Object getIsRelatedTo() {
      return myData.get("isRelatedTo");
    }
    /**
     * An intended audience, i.e. a group for whom something was created.
     * @param audience value to set
     * @return this builder instance
     */
    @NotNull public Builder audience(@NotNull Audience audience) {
      putValue("audience", audience);
      return this;
    }
    /**
     * An intended audience, i.e. a group for whom something was created.
     * @param audience value to set
     * @return this builder instance
     */
    @NotNull public Builder audience(@NotNull Audience.Builder audience) {
      putValue("audience", audience.build());
      return this;
    }
    /**
     * Remove audience property from the builder.
     * If this property is repeatable, all instances are removed.
     * @return this builder instance
     */
    @NotNull public Builder removeAudience() {
      removeValue("audience");
      return this;
    }
    /**
     * Get currently set value for audience property in this builder.
     * @return previously set value or {@code null}. If multiple values have been 
     * set to this property, then {@link java.util.Collection} instance will be 
     * returned.
     */
    @Nullable public java.lang.Object getAudience() {
      return myData.get("audience");
    }
    /**
     * The brand(s) associated with a product or service, or the brand(s) maintained by an organization or business person.
     * @param brand value to set
     * @return this builder instance
     */
    @NotNull public Builder brand(@NotNull Brand brand) {
      putValue("brand", brand);
      return this;
    }
    /**
     * The brand(s) associated with a product or service, or the brand(s) maintained by an organization or business person.
     * @param brand value to set
     * @return this builder instance
     */
    @NotNull public Builder brand(@NotNull Brand.Builder brand) {
      putValue("brand", brand.build());
      return this;
    }
    /**
     * The brand(s) associated with a product or service, or the brand(s) maintained by an organization or business person.
     * @param organization value to set
     * @return this builder instance
     */
    @NotNull public Builder brand(@NotNull Organization organization) {
      putValue("brand", organization);
      return this;
    }
    /**
     * The brand(s) associated with a product or service, or the brand(s) maintained by an organization or business person.
     * @param organization value to set
     * @return this builder instance
     */
    @NotNull public Builder brand(@NotNull Organization.Builder organization) {
      putValue("brand", organization.build());
      return this;
    }
    /**
     * Remove brand property from the builder.
     * If this property is repeatable, all instances are removed.
     * @return this builder instance
     */
    @NotNull public Builder removeBrand() {
      removeValue("brand");
      return this;
    }
    /**
     * Get currently set value for brand property in this builder.
     * @return previously set value or {@code null}. If multiple values have been 
     * set to this property, then {@link java.util.Collection} instance will be 
     * returned.
     */
    @Nullable public java.lang.Object getBrand() {
      return myData.get("brand");
    }
    /**
     * Indicates the [NATO stock number](https://en.wikipedia.org/wiki/NATO_Stock_Number) (nsn) of a [[Product]]. 
     * @param identifier value to set
     * @return this builder instance
     */
    @NotNull public Builder nsn(@NotNull Identifier identifier) {
      putValue("nsn", identifier);
      return this;
    }
    /**
     * Remove nsn property from the builder.
     * If this property is repeatable, all instances are removed.
     * @return this builder instance
     */
    @NotNull public Builder removeNsn() {
      removeValue("nsn");
      return this;
    }
    /**
     * Get currently set value for nsn property in this builder.
     * @return previously set value or {@code null}. If multiple values have been 
     * set to this property, then {@link java.util.Collection} instance will be 
     * returned.
     */
    @Nullable public java.lang.Object getNsn() {
      return myData.get("nsn");
    }
    /**
     * The product identifier, such as ISBN. For example: ``` meta itemprop=&quot;productID&quot; content=&quot;isbn:123-456-789&quot; ```.
     * @param identifier value to set
     * @return this builder instance
     */
    @NotNull public Builder productID(@NotNull Identifier identifier) {
      putValue("productID", identifier);
      return this;
    }
    /**
     * Remove productID property from the builder.
     * If this property is repeatable, all instances are removed.
     * @return this builder instance
     */
    @NotNull public Builder removeProductID() {
      removeValue("productID");
      return this;
    }
    /**
     * Get currently set value for productID property in this builder.
     * @return previously set value or {@code null}. If multiple values have been 
     * set to this property, then {@link java.util.Collection} instance will be 
     * returned.
     */
    @Nullable public java.lang.Object getProductID() {
      return myData.get("productID");
    }
    /**
     * Specifies a MerchantReturnPolicy that may be applicable.
     * @param merchantReturnPolicy value to set
     * @return this builder instance
     */
    @NotNull public Builder hasMerchantReturnPolicy(@NotNull MerchantReturnPolicy merchantReturnPolicy) {
      putValue("hasMerchantReturnPolicy", merchantReturnPolicy);
      return this;
    }
    /**
     * Specifies a MerchantReturnPolicy that may be applicable.
     * @param merchantReturnPolicy value to set
     * @return this builder instance
     */
    @NotNull public Builder hasMerchantReturnPolicy(@NotNull MerchantReturnPolicy.Builder merchantReturnPolicy) {
      putValue("hasMerchantReturnPolicy", merchantReturnPolicy.build());
      return this;
    }
    /**
     * Remove hasMerchantReturnPolicy property from the builder.
     * If this property is repeatable, all instances are removed.
     * @return this builder instance
     */
    @NotNull public Builder removeHasMerchantReturnPolicy() {
      removeValue("hasMerchantReturnPolicy");
      return this;
    }
    /**
     * Get currently set value for hasMerchantReturnPolicy property in this builder.
     * @return previously set value or {@code null}. If multiple values have been 
     * set to this property, then {@link java.util.Collection} instance will be 
     * returned.
     */
    @Nullable public java.lang.Object getHasMerchantReturnPolicy() {
      return myData.get("hasMerchantReturnPolicy");
    }
    /**
     * The model of the product. Use with the URL of a ProductModel or a textual representation of the model identifier. The URL of the ProductModel can be from an external source. It is recommended to additionally provide strong product identifiers via the gtin8/gtin13/gtin14 and mpn properties.
     * @param productModel value to set
     * @return this builder instance
     */
    @NotNull public Builder model(@NotNull ProductModel productModel) {
      putValue("model", productModel);
      return this;
    }
    /**
     * The model of the product. Use with the URL of a ProductModel or a textual representation of the model identifier. The URL of the ProductModel can be from an external source. It is recommended to additionally provide strong product identifiers via the gtin8/gtin13/gtin14 and mpn properties.
     * @param productModel value to set
     * @return this builder instance
     */
    @NotNull public Builder model(@NotNull ProductModel.Builder productModel) {
      putValue("model", productModel.build());
      return this;
    }
    /**
     * The model of the product. Use with the URL of a ProductModel or a textual representation of the model identifier. The URL of the ProductModel can be from an external source. It is recommended to additionally provide strong product identifiers via the gtin8/gtin13/gtin14 and mpn properties.
     * @param model value to set
     * @return this builder instance
     */
    @NotNull public Builder model(@NotNull String model) {
      putValue("model", model);
      return this;
    }
    /**
     * Remove model property from the builder.
     * If this property is repeatable, all instances are removed.
     * @return this builder instance
     */
    @NotNull public Builder removeModel() {
      removeValue("model");
      return this;
    }
    /**
     * Get currently set value for model property in this builder.
     * @return previously set value or {@code null}. If multiple values have been 
     * set to this property, then {@link java.util.Collection} instance will be 
     * returned.
     */
    @Nullable public java.lang.Object getModel() {
      return myData.get("model");
    }
    /**
     * The place where the item (typically [[Product]]) was last processed and tested before importation.
     * @param countryOfLastProcessing value to set
     * @return this builder instance
     */
    @NotNull public Builder countryOfLastProcessing(@NotNull String countryOfLastProcessing) {
      putValue("countryOfLastProcessing", countryOfLastProcessing);
      return this;
    }
    /**
     * Remove countryOfLastProcessing property from the builder.
     * If this property is repeatable, all instances are removed.
     * @return this builder instance
     */
    @NotNull public Builder removeCountryOfLastProcessing() {
      removeValue("countryOfLastProcessing");
      return this;
    }
    /**
     * Get currently set value for countryOfLastProcessing property in this builder.
     * @return previously set value or {@code null}. If multiple values have been 
     * set to this property, then {@link java.util.Collection} instance will be 
     * returned.
     */
    @Nullable public java.lang.Object getCountryOfLastProcessing() {
      return myData.get("countryOfLastProcessing");
    }
    /**
     * A category for the item. Greater signs or slashes can be used to informally indicate a category hierarchy.
     * @param category value to set
     * @return this builder instance
     */
    @NotNull public Builder category(@NotNull Category category) {
      putValue("category", category);
      return this;
    }
    /**
     * Remove category property from the builder.
     * If this property is repeatable, all instances are removed.
     * @return this builder instance
     */
    @NotNull public Builder removeCategory() {
      removeValue("category");
      return this;
    }
    /**
     * Get currently set value for category property in this builder.
     * @return previously set value or {@code null}. If multiple values have been 
     * set to this property, then {@link java.util.Collection} instance will be 
     * returned.
     */
    @Nullable public java.lang.Object getCategory() {
      return myData.get("category");
    }
    /**
     * The place where the product was assembled.
     * @param countryOfAssembly value to set
     * @return this builder instance
     */
    @NotNull public Builder countryOfAssembly(@NotNull String countryOfAssembly) {
      putValue("countryOfAssembly", countryOfAssembly);
      return this;
    }
    /**
     * Remove countryOfAssembly property from the builder.
     * If this property is repeatable, all instances are removed.
     * @return this builder instance
     */
    @NotNull public Builder removeCountryOfAssembly() {
      removeValue("countryOfAssembly");
      return this;
    }
    /**
     * Get currently set value for countryOfAssembly property in this builder.
     * @return previously set value or {@code null}. If multiple values have been 
     * set to this property, then {@link java.util.Collection} instance will be 
     * returned.
     */
    @Nullable public java.lang.Object getCountryOfAssembly() {
      return myData.get("countryOfAssembly");
    }
    /**
     * A property-value pair representing an additional characteristics of the entitity, e.g. a product feature or another characteristic for which there is no matching property in schema.org.\n\nNote: Publishers should be aware that applications designed to use specific schema.org properties (e.g. http://schema.org/width, http://schema.org/color, http://schema.org/gtin13, ...) will typically expect such data to be provided using those properties, rather than using the generic property/value mechanism.
     * 
     * @param propertyValue value to set
     * @return this builder instance
     */
    @NotNull public Builder additionalProperty(@NotNull PropertyValue propertyValue) {
      putValue("additionalProperty", propertyValue);
      return this;
    }
    /**
     * A property-value pair representing an additional characteristics of the entitity, e.g. a product feature or another characteristic for which there is no matching property in schema.org.\n\nNote: Publishers should be aware that applications designed to use specific schema.org properties (e.g. http://schema.org/width, http://schema.org/color, http://schema.org/gtin13, ...) will typically expect such data to be provided using those properties, rather than using the generic property/value mechanism.
     * 
     * @param propertyValue value to set
     * @return this builder instance
     */
    @NotNull public Builder additionalProperty(@NotNull PropertyValue.Builder propertyValue) {
      putValue("additionalProperty", propertyValue.build());
      return this;
    }
    /**
     * Remove additionalProperty property from the builder.
     * If this property is repeatable, all instances are removed.
     * @return this builder instance
     */
    @NotNull public Builder removeAdditionalProperty() {
      removeValue("additionalProperty");
      return this;
    }
    /**
     * Get currently set value for additionalProperty property in this builder.
     * @return previously set value or {@code null}. If multiple values have been 
     * set to this property, then {@link java.util.Collection} instance will be 
     * returned.
     */
    @Nullable public java.lang.Object getAdditionalProperty() {
      return myData.get("additionalProperty");
    }
    /**
     * A pointer to another product (or multiple products) for which this product is an accessory or spare part.
     * @param product value to set
     * @return this builder instance
     */
    @NotNull public Builder isAccessoryOrSparePartFor(@NotNull Product product) {
      putValue("isAccessoryOrSparePartFor", product);
      return this;
    }
    /**
     * A pointer to another product (or multiple products) for which this product is an accessory or spare part.
     * @param product value to set
     * @return this builder instance
     */
    @NotNull public Builder isAccessoryOrSparePartFor(@NotNull Product.Builder product) {
      putValue("isAccessoryOrSparePartFor", product.build());
      return this;
    }
    /**
     * Remove isAccessoryOrSparePartFor property from the builder.
     * If this property is repeatable, all instances are removed.
     * @return this builder instance
     */
    @NotNull public Builder removeIsAccessoryOrSparePartFor() {
      removeValue("isAccessoryOrSparePartFor");
      return this;
    }
    /**
     * Get currently set value for isAccessoryOrSparePartFor property in this builder.
     * @return previously set value or {@code null}. If multiple values have been 
     * set to this property, then {@link java.util.Collection} instance will be 
     * returned.
     */
    @Nullable public java.lang.Object getIsAccessoryOrSparePartFor() {
      return myData.get("isAccessoryOrSparePartFor");
    }
    /**
     *                                         The country of origin of something, including products as well as creative  works such as movie and TV content.
     * 
     * In the case of TV and movie, this would be the country of the principle offices of the production company or individual responsible for the movie. For other kinds of [[CreativeWork]] it is difficult to provide fully general guidance, and properties such as [[contentLocation]] and [[locationCreated]] may be more applicable.
     * 
     * In the case of products, the country of origin of the product. The exact interpretation of this may vary by context and product type, and cannot be fully enumerated here.
     *                                         @param country value to set
     *                                         @return this builder instance
     */
    @NotNull public Builder countryOfOrigin(@NotNull Country country) {
      putValue("countryOfOrigin", country);
      return this;
    }
    /**
     *                                             The country of origin of something, including products as well as creative  works such as movie and TV content.
     * 
     * In the case of TV and movie, this would be the country of the principle offices of the production company or individual responsible for the movie. For other kinds of [[CreativeWork]] it is difficult to provide fully general guidance, and properties such as [[contentLocation]] and [[locationCreated]] may be more applicable.
     * 
     * In the case of products, the country of origin of the product. The exact interpretation of this may vary by context and product type, and cannot be fully enumerated here.
     *                                             @param country value to set
     *                                             @return this builder instance
     */
    @NotNull public Builder countryOfOrigin(@NotNull Country.Builder country) {
      putValue("countryOfOrigin", country.build());
      return this;
    }
    /**
     * Remove countryOfOrigin property from the builder.
     * If this property is repeatable, all instances are removed.
     * @return this builder instance
     */
    @NotNull public Builder removeCountryOfOrigin() {
      removeValue("countryOfOrigin");
      return this;
    }
    /**
     * Get currently set value for countryOfOrigin property in this builder.
     * @return previously set value or {@code null}. If multiple values have been 
     * set to this property, then {@link java.util.Collection} instance will be 
     * returned.
     */
    @Nullable public java.lang.Object getCountryOfOrigin() {
      return myData.get("countryOfOrigin");
    }
    /**
     * The release date of a product or product model. This can be used to distinguish the exact variant of a product.
     * @param date value to set
     * @return this builder instance
     */
    @NotNull public Builder releaseDate(@NotNull java.util.Date date) {
      putValue("releaseDate", date);
      return this;
    }
    /**
     * Remove releaseDate property from the builder.
     * If this property is repeatable, all instances are removed.
     * @return this builder instance
     */
    @NotNull public Builder removeReleaseDate() {
      removeValue("releaseDate");
      return this;
    }
    /**
     * Get currently set value for releaseDate property in this builder.
     * @return previously set value or {@code null}. If multiple values have been 
     * set to this property, then {@link java.util.Collection} instance will be 
     * returned.
     */
    @Nullable public java.lang.Object getReleaseDate() {
      return myData.get("releaseDate");
    }
    /**
     * A review of the item.
     * @param review value to set
     * @return this builder instance
     */
    @NotNull public Builder review(@NotNull Review review) {
      putValue("review", review);
      return this;
    }
    /**
     * A review of the item.
     * @param review value to set
     * @return this builder instance
     */
    @NotNull public Builder review(@NotNull Review.Builder review) {
      putValue("review", review.build());
      return this;
    }
    /**
     * Remove review property from the builder.
     * If this property is repeatable, all instances are removed.
     * @return this builder instance
     */
    @NotNull public Builder removeReview() {
      removeValue("review");
      return this;
    }
    /**
     * Get currently set value for review property in this builder.
     * @return previously set value or {@code null}. If multiple values have been 
     * set to this property, then {@link java.util.Collection} instance will be 
     * returned.
     */
    @Nullable public java.lang.Object getReview() {
      return myData.get("review");
    }
    /**
     * The date of production of the item, e.g. vehicle.
     * @param date value to set
     * @return this builder instance
     */
    @NotNull public Builder productionDate(@NotNull java.util.Date date) {
      putValue("productionDate", date);
      return this;
    }
    /**
     * Remove productionDate property from the builder.
     * If this property is repeatable, all instances are removed.
     * @return this builder instance
     */
    @NotNull public Builder removeProductionDate() {
      removeValue("productionDate");
      return this;
    }
    /**
     * Get currently set value for productionDate property in this builder.
     * @return previously set value or {@code null}. If multiple values have been 
     * set to this property, then {@link java.util.Collection} instance will be 
     * returned.
     */
    @Nullable public java.lang.Object getProductionDate() {
      return myData.get("productionDate");
    }
    /**
     * An award won by or for this item.
     * @param award value to set
     * @return this builder instance
     */
    @NotNull public Builder award(@NotNull String award) {
      putValue("award", award);
      return this;
    }
    /**
     * Remove award property from the builder.
     * If this property is repeatable, all instances are removed.
     * @return this builder instance
     */
    @NotNull public Builder removeAward() {
      removeValue("award");
      return this;
    }
    /**
     * Get currently set value for award property in this builder.
     * @return previously set value or {@code null}. If multiple values have been 
     * set to this property, then {@link java.util.Collection} instance will be 
     * returned.
     */
    @Nullable public java.lang.Object getAward() {
      return myData.get("award");
    }
    /**
     * The GTIN-8 code of the product, or the product to which the offer refers. This code is also known as EAN/UCC-8 or 8-digit EAN. See [GS1 GTIN Summary](http://www.gs1.org/barcodes/technical/idkeys/gtin) for more details.
     * @param gtin value to set
     * @return this builder instance
     */
    @NotNull public Builder gtin8(@NotNull Gtin gtin) {
      putValue("gtin8", gtin);
      return this;
    }
    /**
     * Remove gtin8 property from the builder.
     * If this property is repeatable, all instances are removed.
     * @return this builder instance
     */
    @NotNull public Builder removeGtin8() {
      removeValue("gtin8");
      return this;
    }
    /**
     * Get currently set value for gtin8 property in this builder.
     * @return previously set value or {@code null}. If multiple values have been 
     * set to this property, then {@link java.util.Collection} instance will be 
     * returned.
     */
    @Nullable public java.lang.Object getGtin8() {
      return myData.get("gtin8");
    }
    /**
     * The weight of the product or person.
     * @param quantitativeValue value to set
     * @return this builder instance
     */
    @NotNull public Builder weight(@NotNull QuantitativeValue quantitativeValue) {
      putValue("weight", quantitativeValue);
      return this;
    }
    /**
     * The weight of the product or person.
     * @param quantitativeValue value to set
     * @return this builder instance
     */
    @NotNull public Builder weight(@NotNull QuantitativeValue.Builder quantitativeValue) {
      putValue("weight", quantitativeValue.build());
      return this;
    }
    /**
     * Remove weight property from the builder.
     * If this property is repeatable, all instances are removed.
     * @return this builder instance
     */
    @NotNull public Builder removeWeight() {
      removeValue("weight");
      return this;
    }
    /**
     * Get currently set value for weight property in this builder.
     * @return previously set value or {@code null}. If multiple values have been 
     * set to this property, then {@link java.util.Collection} instance will be 
     * returned.
     */
    @Nullable public java.lang.Object getWeight() {
      return myData.get("weight");
    }
    /**
     * Defines the energy efficiency Category (also known as &quot;class&quot; or &quot;rating&quot;) for a product according to an international energy efficiency standard.
     * @param energyConsumptionDetails value to set
     * @return this builder instance
     */
    @NotNull public Builder hasEnergyConsumptionDetails(@NotNull EnergyConsumptionDetails energyConsumptionDetails) {
      putValue("hasEnergyConsumptionDetails", energyConsumptionDetails);
      return this;
    }
    /**
     * Defines the energy efficiency Category (also known as &quot;class&quot; or &quot;rating&quot;) for a product according to an international energy efficiency standard.
     * @param energyConsumptionDetails value to set
     * @return this builder instance
     */
    @NotNull public Builder hasEnergyConsumptionDetails(@NotNull EnergyConsumptionDetails.Builder energyConsumptionDetails) {
      putValue("hasEnergyConsumptionDetails", energyConsumptionDetails.build());
      return this;
    }
    /**
     * Remove hasEnergyConsumptionDetails property from the builder.
     * If this property is repeatable, all instances are removed.
     * @return this builder instance
     */
    @NotNull public Builder removeHasEnergyConsumptionDetails() {
      removeValue("hasEnergyConsumptionDetails");
      return this;
    }
    /**
     * Get currently set value for hasEnergyConsumptionDetails property in this builder.
     * @return previously set value or {@code null}. If multiple values have been 
     * set to this property, then {@link java.util.Collection} instance will be 
     * returned.
     */
    @Nullable public java.lang.Object getHasEnergyConsumptionDetails() {
      return myData.get("hasEnergyConsumptionDetails");
    }
    /**
     * A product measurement, for example the inseam of pants, the wheel size of a bicycle, or the gauge of a screw. Usually an exact measurement, but can also be a range of measurements for adjustable products, for example belts and ski bindings.
     * @param quantitativeValue value to set
     * @return this builder instance
     */
    @NotNull public Builder hasMeasurement(@NotNull QuantitativeValue quantitativeValue) {
      putValue("hasMeasurement", quantitativeValue);
      return this;
    }
    /**
     * A product measurement, for example the inseam of pants, the wheel size of a bicycle, or the gauge of a screw. Usually an exact measurement, but can also be a range of measurements for adjustable products, for example belts and ski bindings.
     * @param quantitativeValue value to set
     * @return this builder instance
     */
    @NotNull public Builder hasMeasurement(@NotNull QuantitativeValue.Builder quantitativeValue) {
      putValue("hasMeasurement", quantitativeValue.build());
      return this;
    }
    /**
     * Remove hasMeasurement property from the builder.
     * If this property is repeatable, all instances are removed.
     * @return this builder instance
     */
    @NotNull public Builder removeHasMeasurement() {
      removeValue("hasMeasurement");
      return this;
    }
    /**
     * Get currently set value for hasMeasurement property in this builder.
     * @return previously set value or {@code null}. If multiple values have been 
     * set to this property, then {@link java.util.Collection} instance will be 
     * returned.
     */
    @Nullable public java.lang.Object getHasMeasurement() {
      return myData.get("hasMeasurement");
    }
    /**
     * A pointer to another product (or multiple products) for which this product is a consumable.
     * @param product value to set
     * @return this builder instance
     */
    @NotNull public Builder isConsumableFor(@NotNull Product product) {
      putValue("isConsumableFor", product);
      return this;
    }
    /**
     * A pointer to another product (or multiple products) for which this product is a consumable.
     * @param product value to set
     * @return this builder instance
     */
    @NotNull public Builder isConsumableFor(@NotNull Product.Builder product) {
      putValue("isConsumableFor", product.build());
      return this;
    }
    /**
     * Remove isConsumableFor property from the builder.
     * If this property is repeatable, all instances are removed.
     * @return this builder instance
     */
    @NotNull public Builder removeIsConsumableFor() {
      removeValue("isConsumableFor");
      return this;
    }
    /**
     * Get currently set value for isConsumableFor property in this builder.
     * @return previously set value or {@code null}. If multiple values have been 
     * set to this property, then {@link java.util.Collection} instance will be 
     * returned.
     */
    @Nullable public java.lang.Object getIsConsumableFor() {
      return myData.get("isConsumableFor");
    }
    /**
     * The color of the product.
     * @param color value to set
     * @return this builder instance
     */
    @NotNull public Builder color(@NotNull String color) {
      putValue("color", color);
      return this;
    }
    /**
     * Remove color property from the builder.
     * If this property is repeatable, all instances are removed.
     * @return this builder instance
     */
    @NotNull public Builder removeColor() {
      removeValue("color");
      return this;
    }
    /**
     * Get currently set value for color property in this builder.
     * @return previously set value or {@code null}. If multiple values have been 
     * set to this property, then {@link java.util.Collection} instance will be 
     * returned.
     */
    @Nullable public java.lang.Object getColor() {
      return myData.get("color");
    }
    /**
     * A slogan or motto associated with the item.
     * @param slogan value to set
     * @return this builder instance
     */
    @NotNull public Builder slogan(@NotNull String slogan) {
      putValue("slogan", slogan);
      return this;
    }
    /**
     * Remove slogan property from the builder.
     * If this property is repeatable, all instances are removed.
     * @return this builder instance
     */
    @NotNull public Builder removeSlogan() {
      removeValue("slogan");
      return this;
    }
    /**
     * Get currently set value for slogan property in this builder.
     * @return previously set value or {@code null}. If multiple values have been 
     * set to this property, then {@link java.util.Collection} instance will be 
     * returned.
     */
    @Nullable public java.lang.Object getSlogan() {
      return myData.get("slogan");
    }
    /**
     * Indicates the kind of product that this is a variant of. In the case of [[ProductModel]], this is a pointer (from a ProductModel) to a base product from which this product is a variant. It is safe to infer that the variant inherits all product features from the base model, unless defined locally. This is not transitive. In the case of a [[ProductGroup]], the group description also serves as a template, representing a set of Products that vary on explicitly defined, specific dimensions only (so it defines both a set of variants, as well as which values distinguish amongst those variants). When used with [[ProductGroup]], this property can apply to any [[Product]] included in the group.
     * @param productGroup value to set
     * @return this builder instance
     */
    @NotNull public Builder isVariantOf(@NotNull ProductGroup productGroup) {
      putValue("isVariantOf", productGroup);
      return this;
    }
    /**
     * Indicates the kind of product that this is a variant of. In the case of [[ProductModel]], this is a pointer (from a ProductModel) to a base product from which this product is a variant. It is safe to infer that the variant inherits all product features from the base model, unless defined locally. This is not transitive. In the case of a [[ProductGroup]], the group description also serves as a template, representing a set of Products that vary on explicitly defined, specific dimensions only (so it defines both a set of variants, as well as which values distinguish amongst those variants). When used with [[ProductGroup]], this property can apply to any [[Product]] included in the group.
     * @param productGroup value to set
     * @return this builder instance
     */
    @NotNull public Builder isVariantOf(@NotNull ProductGroup.Builder productGroup) {
      putValue("isVariantOf", productGroup.build());
      return this;
    }
    /**
     * Indicates the kind of product that this is a variant of. In the case of [[ProductModel]], this is a pointer (from a ProductModel) to a base product from which this product is a variant. It is safe to infer that the variant inherits all product features from the base model, unless defined locally. This is not transitive. In the case of a [[ProductGroup]], the group description also serves as a template, representing a set of Products that vary on explicitly defined, specific dimensions only (so it defines both a set of variants, as well as which values distinguish amongst those variants). When used with [[ProductGroup]], this property can apply to any [[Product]] included in the group.
     * @param productModel value to set
     * @return this builder instance
     */
    @NotNull public Builder isVariantOf(@NotNull ProductModel productModel) {
      putValue("isVariantOf", productModel);
      return this;
    }
    /**
     * Indicates the kind of product that this is a variant of. In the case of [[ProductModel]], this is a pointer (from a ProductModel) to a base product from which this product is a variant. It is safe to infer that the variant inherits all product features from the base model, unless defined locally. This is not transitive. In the case of a [[ProductGroup]], the group description also serves as a template, representing a set of Products that vary on explicitly defined, specific dimensions only (so it defines both a set of variants, as well as which values distinguish amongst those variants). When used with [[ProductGroup]], this property can apply to any [[Product]] included in the group.
     * @param productModel value to set
     * @return this builder instance
     */
    @NotNull public Builder isVariantOf(@NotNull ProductModel.Builder productModel) {
      putValue("isVariantOf", productModel.build());
      return this;
    }
    /**
     * Remove isVariantOf property from the builder.
     * If this property is repeatable, all instances are removed.
     * @return this builder instance
     */
    @NotNull public Builder removeIsVariantOf() {
      removeValue("isVariantOf");
      return this;
    }
    /**
     * Get currently set value for isVariantOf property in this builder.
     * @return previously set value or {@code null}. If multiple values have been 
     * set to this property, then {@link java.util.Collection} instance will be 
     * returned.
     */
    @Nullable public java.lang.Object getIsVariantOf() {
      return myData.get("isVariantOf");
    }
    /**
     * An offer to provide this item&amp;#x2014;for example, an offer to sell a product, rent the DVD of a movie, perform a service, or give away tickets to an event. Use [[businessFunction]] to indicate the kind of transaction offered, i.e. sell, lease, etc. This property can also be used to describe a [[Demand]]. While this property is listed as expected on a number of common types, it can be used in others. In that case, using a second type, such as Product or a subtype of Product, can clarify the nature of the offer.
     * 
     * @param demand value to set
     * @return this builder instance
     */
    @NotNull public Builder offers(@NotNull Demand demand) {
      putValue("offers", demand);
      return this;
    }
    /**
     * An offer to provide this item&amp;#x2014;for example, an offer to sell a product, rent the DVD of a movie, perform a service, or give away tickets to an event. Use [[businessFunction]] to indicate the kind of transaction offered, i.e. sell, lease, etc. This property can also be used to describe a [[Demand]]. While this property is listed as expected on a number of common types, it can be used in others. In that case, using a second type, such as Product or a subtype of Product, can clarify the nature of the offer.
     * 
     * @param demand value to set
     * @return this builder instance
     */
    @NotNull public Builder offers(@NotNull Demand.Builder demand) {
      putValue("offers", demand.build());
      return this;
    }
    /**
     * An offer to provide this item&amp;#x2014;for example, an offer to sell a product, rent the DVD of a movie, perform a service, or give away tickets to an event. Use [[businessFunction]] to indicate the kind of transaction offered, i.e. sell, lease, etc. This property can also be used to describe a [[Demand]]. While this property is listed as expected on a number of common types, it can be used in others. In that case, using a second type, such as Product or a subtype of Product, can clarify the nature of the offer.
     * 
     * @param offer value to set
     * @return this builder instance
     */
    @NotNull public Builder offers(@NotNull Offer offer) {
      putValue("offers", offer);
      return this;
    }
    /**
     * An offer to provide this item&amp;#x2014;for example, an offer to sell a product, rent the DVD of a movie, perform a service, or give away tickets to an event. Use [[businessFunction]] to indicate the kind of transaction offered, i.e. sell, lease, etc. This property can also be used to describe a [[Demand]]. While this property is listed as expected on a number of common types, it can be used in others. In that case, using a second type, such as Product or a subtype of Product, can clarify the nature of the offer.
     * 
     * @param offer value to set
     * @return this builder instance
     */
    @NotNull public Builder offers(@NotNull Offer.Builder offer) {
      putValue("offers", offer.build());
      return this;
    }
    /**
     * Remove offers property from the builder.
     * If this property is repeatable, all instances are removed.
     * @return this builder instance
     */
    @NotNull public Builder removeOffers() {
      removeValue("offers");
      return this;
    }
    /**
     * Get currently set value for offers property in this builder.
     * @return previously set value or {@code null}. If multiple values have been 
     * set to this property, then {@link java.util.Collection} instance will be 
     * returned.
     */
    @Nullable public java.lang.Object getOffers() {
      return myData.get("offers");
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
      if ("width".equals(key) && value instanceof Distance) { this.width((Distance)value); return; }
      if ("widths".equals(key) && value instanceof Distance) { this.width((Distance)value); return; }
      if ("width".equals(key) && value instanceof QuantitativeValue) { this.width((QuantitativeValue)value); return; }
      if ("widths".equals(key) && value instanceof QuantitativeValue) { this.width((QuantitativeValue)value); return; }
      if ("manufacturer".equals(key) && value instanceof Organization) { this.manufacturer((Organization)value); return; }
      if ("manufacturers".equals(key) && value instanceof Organization) { this.manufacturer((Organization)value); return; }
      if ("size".equals(key) && value instanceof DefinedTerm) { this.size((DefinedTerm)value); return; }
      if ("sizes".equals(key) && value instanceof DefinedTerm) { this.size((DefinedTerm)value); return; }
      if ("size".equals(key) && value instanceof QuantitativeValue) { this.size((QuantitativeValue)value); return; }
      if ("sizes".equals(key) && value instanceof QuantitativeValue) { this.size((QuantitativeValue)value); return; }
      if ("size".equals(key) && value instanceof SizeSpecification) { this.size((SizeSpecification)value); return; }
      if ("sizes".equals(key) && value instanceof SizeSpecification) { this.size((SizeSpecification)value); return; }
      if ("size".equals(key) && value instanceof String) { this.size((String)value); return; }
      if ("sizes".equals(key) && value instanceof String) { this.size((String)value); return; }
      if ("purchaseDate".equals(key) && value instanceof java.util.Date) { this.purchaseDate((java.util.Date)value); return; }
      if ("purchaseDates".equals(key) && value instanceof java.util.Date) { this.purchaseDate((java.util.Date)value); return; }
      if ("inProductGroupWithID".equals(key) && value instanceof String) { this.inProductGroupWithID((String)value); return; }
      if ("inProductGroupWithIDs".equals(key) && value instanceof String) { this.inProductGroupWithID((String)value); return; }
      if ("gtin13".equals(key) && value instanceof Gtin) { this.gtin13((Gtin)value); return; }
      if ("gtin13s".equals(key) && value instanceof Gtin) { this.gtin13((Gtin)value); return; }
      if ("gtin".equals(key) && value instanceof Gtin) { this.gtin((Gtin)value); return; }
      if ("gtins".equals(key) && value instanceof Gtin) { this.gtin((Gtin)value); return; }
      if ("material".equals(key) && value instanceof Material) { this.material((Material)value); return; }
      if ("materials".equals(key) && value instanceof Material) { this.material((Material)value); return; }
      if ("pattern".equals(key) && value instanceof DefinedTerm) { this.pattern((DefinedTerm)value); return; }
      if ("patterns".equals(key) && value instanceof DefinedTerm) { this.pattern((DefinedTerm)value); return; }
      if ("pattern".equals(key) && value instanceof String) { this.pattern((String)value); return; }
      if ("patterns".equals(key) && value instanceof String) { this.pattern((String)value); return; }
      if ("gtin14".equals(key) && value instanceof Identifier) { this.gtin14((Identifier)value); return; }
      if ("gtin14s".equals(key) && value instanceof Identifier) { this.gtin14((Identifier)value); return; }
      if ("itemCondition".equals(key) && value instanceof OfferItemCondition) { this.itemCondition((OfferItemCondition)value); return; }
      if ("itemConditions".equals(key) && value instanceof OfferItemCondition) { this.itemCondition((OfferItemCondition)value); return; }
      if ("aggregateRating".equals(key) && value instanceof AggregateRating) { this.aggregateRating((AggregateRating)value); return; }
      if ("aggregateRatings".equals(key) && value instanceof AggregateRating) { this.aggregateRating((AggregateRating)value); return; }
      if ("mpn".equals(key) && value instanceof String) { this.mpn((String)value); return; }
      if ("mpns".equals(key) && value instanceof String) { this.mpn((String)value); return; }
      if ("depth".equals(key) && value instanceof Distance) { this.depth((Distance)value); return; }
      if ("depths".equals(key) && value instanceof Distance) { this.depth((Distance)value); return; }
      if ("depth".equals(key) && value instanceof QuantitativeValue) { this.depth((QuantitativeValue)value); return; }
      if ("depths".equals(key) && value instanceof QuantitativeValue) { this.depth((QuantitativeValue)value); return; }
      if ("logo".equals(key) && value instanceof Image) { this.logo((Image)value); return; }
      if ("logos".equals(key) && value instanceof Image) { this.logo((Image)value); return; }
      if ("gtin12".equals(key) && value instanceof Identifier) { this.gtin12((Identifier)value); return; }
      if ("gtin12s".equals(key) && value instanceof Identifier) { this.gtin12((Identifier)value); return; }
      if ("height".equals(key) && value instanceof Distance) { this.height((Distance)value); return; }
      if ("heights".equals(key) && value instanceof Distance) { this.height((Distance)value); return; }
      if ("height".equals(key) && value instanceof QuantitativeValue) { this.height((QuantitativeValue)value); return; }
      if ("heights".equals(key) && value instanceof QuantitativeValue) { this.height((QuantitativeValue)value); return; }
      if ("sku".equals(key) && value instanceof Identifier) { this.sku((Identifier)value); return; }
      if ("skus".equals(key) && value instanceof Identifier) { this.sku((Identifier)value); return; }
      if ("isSimilarTo".equals(key) && value instanceof Product) { this.isSimilarTo((Product)value); return; }
      if ("isSimilarTos".equals(key) && value instanceof Product) { this.isSimilarTo((Product)value); return; }
      if ("isSimilarTo".equals(key) && value instanceof Service) { this.isSimilarTo((Service)value); return; }
      if ("isSimilarTos".equals(key) && value instanceof Service) { this.isSimilarTo((Service)value); return; }
      if ("isRelatedTo".equals(key) && value instanceof Product) { this.isRelatedTo((Product)value); return; }
      if ("isRelatedTos".equals(key) && value instanceof Product) { this.isRelatedTo((Product)value); return; }
      if ("isRelatedTo".equals(key) && value instanceof Service) { this.isRelatedTo((Service)value); return; }
      if ("isRelatedTos".equals(key) && value instanceof Service) { this.isRelatedTo((Service)value); return; }
      if ("audience".equals(key) && value instanceof Audience) { this.audience((Audience)value); return; }
      if ("audiences".equals(key) && value instanceof Audience) { this.audience((Audience)value); return; }
      if ("brand".equals(key) && value instanceof Brand) { this.brand((Brand)value); return; }
      if ("brands".equals(key) && value instanceof Brand) { this.brand((Brand)value); return; }
      if ("brand".equals(key) && value instanceof Organization) { this.brand((Organization)value); return; }
      if ("brands".equals(key) && value instanceof Organization) { this.brand((Organization)value); return; }
      if ("nsn".equals(key) && value instanceof Identifier) { this.nsn((Identifier)value); return; }
      if ("nsns".equals(key) && value instanceof Identifier) { this.nsn((Identifier)value); return; }
      if ("productID".equals(key) && value instanceof Identifier) { this.productID((Identifier)value); return; }
      if ("productIDs".equals(key) && value instanceof Identifier) { this.productID((Identifier)value); return; }
      if ("hasMerchantReturnPolicy".equals(key) && value instanceof MerchantReturnPolicy) { this.hasMerchantReturnPolicy((MerchantReturnPolicy)value); return; }
      if ("hasMerchantReturnPolicys".equals(key) && value instanceof MerchantReturnPolicy) { this.hasMerchantReturnPolicy((MerchantReturnPolicy)value); return; }
      if ("model".equals(key) && value instanceof ProductModel) { this.model((ProductModel)value); return; }
      if ("models".equals(key) && value instanceof ProductModel) { this.model((ProductModel)value); return; }
      if ("model".equals(key) && value instanceof String) { this.model((String)value); return; }
      if ("models".equals(key) && value instanceof String) { this.model((String)value); return; }
      if ("countryOfLastProcessing".equals(key) && value instanceof String) { this.countryOfLastProcessing((String)value); return; }
      if ("countryOfLastProcessings".equals(key) && value instanceof String) { this.countryOfLastProcessing((String)value); return; }
      if ("category".equals(key) && value instanceof Category) { this.category((Category)value); return; }
      if ("categorys".equals(key) && value instanceof Category) { this.category((Category)value); return; }
      if ("countryOfAssembly".equals(key) && value instanceof String) { this.countryOfAssembly((String)value); return; }
      if ("countryOfAssemblys".equals(key) && value instanceof String) { this.countryOfAssembly((String)value); return; }
      if ("additionalProperty".equals(key) && value instanceof PropertyValue) { this.additionalProperty((PropertyValue)value); return; }
      if ("additionalPropertys".equals(key) && value instanceof PropertyValue) { this.additionalProperty((PropertyValue)value); return; }
      if ("isAccessoryOrSparePartFor".equals(key) && value instanceof Product) { this.isAccessoryOrSparePartFor((Product)value); return; }
      if ("isAccessoryOrSparePartFors".equals(key) && value instanceof Product) { this.isAccessoryOrSparePartFor((Product)value); return; }
      if ("countryOfOrigin".equals(key) && value instanceof Country) { this.countryOfOrigin((Country)value); return; }
      if ("countryOfOrigins".equals(key) && value instanceof Country) { this.countryOfOrigin((Country)value); return; }
      if ("releaseDate".equals(key) && value instanceof java.util.Date) { this.releaseDate((java.util.Date)value); return; }
      if ("releaseDates".equals(key) && value instanceof java.util.Date) { this.releaseDate((java.util.Date)value); return; }
      if ("review".equals(key) && value instanceof Review) { this.review((Review)value); return; }
      if ("reviews".equals(key) && value instanceof Review) { this.review((Review)value); return; }
      if ("productionDate".equals(key) && value instanceof java.util.Date) { this.productionDate((java.util.Date)value); return; }
      if ("productionDates".equals(key) && value instanceof java.util.Date) { this.productionDate((java.util.Date)value); return; }
      if ("award".equals(key) && value instanceof String) { this.award((String)value); return; }
      if ("awards".equals(key) && value instanceof String) { this.award((String)value); return; }
      if ("gtin8".equals(key) && value instanceof Gtin) { this.gtin8((Gtin)value); return; }
      if ("gtin8s".equals(key) && value instanceof Gtin) { this.gtin8((Gtin)value); return; }
      if ("weight".equals(key) && value instanceof QuantitativeValue) { this.weight((QuantitativeValue)value); return; }
      if ("weights".equals(key) && value instanceof QuantitativeValue) { this.weight((QuantitativeValue)value); return; }
      if ("hasEnergyConsumptionDetails".equals(key) && value instanceof EnergyConsumptionDetails) { this.hasEnergyConsumptionDetails((EnergyConsumptionDetails)value); return; }
      if ("hasEnergyConsumptionDetailss".equals(key) && value instanceof EnergyConsumptionDetails) { this.hasEnergyConsumptionDetails((EnergyConsumptionDetails)value); return; }
      if ("hasMeasurement".equals(key) && value instanceof QuantitativeValue) { this.hasMeasurement((QuantitativeValue)value); return; }
      if ("hasMeasurements".equals(key) && value instanceof QuantitativeValue) { this.hasMeasurement((QuantitativeValue)value); return; }
      if ("isConsumableFor".equals(key) && value instanceof Product) { this.isConsumableFor((Product)value); return; }
      if ("isConsumableFors".equals(key) && value instanceof Product) { this.isConsumableFor((Product)value); return; }
      if ("color".equals(key) && value instanceof String) { this.color((String)value); return; }
      if ("colors".equals(key) && value instanceof String) { this.color((String)value); return; }
      if ("slogan".equals(key) && value instanceof String) { this.slogan((String)value); return; }
      if ("slogans".equals(key) && value instanceof String) { this.slogan((String)value); return; }
      if ("isVariantOf".equals(key) && value instanceof ProductGroup) { this.isVariantOf((ProductGroup)value); return; }
      if ("isVariantOfs".equals(key) && value instanceof ProductGroup) { this.isVariantOf((ProductGroup)value); return; }
      if ("isVariantOf".equals(key) && value instanceof ProductModel) { this.isVariantOf((ProductModel)value); return; }
      if ("isVariantOfs".equals(key) && value instanceof ProductModel) { this.isVariantOf((ProductModel)value); return; }
      if ("offers".equals(key) && value instanceof Demand) { this.offers((Demand)value); return; }
      if ("offerss".equals(key) && value instanceof Demand) { this.offers((Demand)value); return; }
      if ("offers".equals(key) && value instanceof Offer) { this.offers((Offer)value); return; }
      if ("offerss".equals(key) && value instanceof Offer) { this.offers((Offer)value); return; }
      super.fromMap(key, value);
    }
  }
  
}
