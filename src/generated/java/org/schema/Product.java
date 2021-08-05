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
 * Any offered product or service. For example: a pair of shoes; a concert ticket; the rental of a car; a haircut; or an episode of a TV show streamed online.
 */
public class Product extends Thing {
  /**
   * The width of the item.
   */
  @JsonIgnore public Distance getWidthDistance() {
    return (Distance) getValue("width");
  }
  /**
   * The width of the item.
   */
  @JsonIgnore public java.util.Collection<Distance> getWidthDistances() {
    final Object current = myData.get("width");
    if (current == null) return Collections.emptyList();
    if (current instanceof java.util.Collection) {
      return (java.util.Collection<Distance>) current;
    }
    return Arrays.asList((Distance) current);
  }
  /**
   * The width of the item.
   */
  @JsonIgnore public QuantitativeValue getWidthQuantitativeValue() {
    return (QuantitativeValue) getValue("width");
  }
  /**
   * The width of the item.
   */
  @JsonIgnore public java.util.Collection<QuantitativeValue> getWidthQuantitativeValues() {
    final Object current = myData.get("width");
    if (current == null) return Collections.emptyList();
    if (current instanceof java.util.Collection) {
      return (java.util.Collection<QuantitativeValue>) current;
    }
    return Arrays.asList((QuantitativeValue) current);
  }
  /**
   * The manufacturer of the product.
   */
  @JsonIgnore public Organization getManufacturer() {
    return (Organization) getValue("manufacturer");
  }
  /**
   * The manufacturer of the product.
   */
  @JsonIgnore public java.util.Collection<Organization> getManufacturers() {
    final Object current = myData.get("manufacturer");
    if (current == null) return Collections.emptyList();
    if (current instanceof java.util.Collection) {
      return (java.util.Collection<Organization>) current;
    }
    return Arrays.asList((Organization) current);
  }
  /**
   * A standardized size of a product or creative work, specified either through a simple textual string (for example 'XL', '32Wx34L'), a  QuantitativeValue with a unitCode, or a comprehensive and structured [[SizeSpecification]]; in other cases, the [[width]], [[height]], [[depth]] and [[weight]] properties may be more applicable. 
   */
  @JsonIgnore public DefinedTerm getSizeDefinedTerm() {
    return (DefinedTerm) getValue("size");
  }
  /**
   * A standardized size of a product or creative work, specified either through a simple textual string (for example 'XL', '32Wx34L'), a  QuantitativeValue with a unitCode, or a comprehensive and structured [[SizeSpecification]]; in other cases, the [[width]], [[height]], [[depth]] and [[weight]] properties may be more applicable. 
   */
  @JsonIgnore public java.util.Collection<DefinedTerm> getSizeDefinedTerms() {
    final Object current = myData.get("size");
    if (current == null) return Collections.emptyList();
    if (current instanceof java.util.Collection) {
      return (java.util.Collection<DefinedTerm>) current;
    }
    return Arrays.asList((DefinedTerm) current);
  }
  /**
   * A standardized size of a product or creative work, specified either through a simple textual string (for example 'XL', '32Wx34L'), a  QuantitativeValue with a unitCode, or a comprehensive and structured [[SizeSpecification]]; in other cases, the [[width]], [[height]], [[depth]] and [[weight]] properties may be more applicable. 
   */
  @JsonIgnore public QuantitativeValue getSizeQuantitativeValue() {
    return (QuantitativeValue) getValue("size");
  }
  /**
   * A standardized size of a product or creative work, specified either through a simple textual string (for example 'XL', '32Wx34L'), a  QuantitativeValue with a unitCode, or a comprehensive and structured [[SizeSpecification]]; in other cases, the [[width]], [[height]], [[depth]] and [[weight]] properties may be more applicable. 
   */
  @JsonIgnore public java.util.Collection<QuantitativeValue> getSizeQuantitativeValues() {
    final Object current = myData.get("size");
    if (current == null) return Collections.emptyList();
    if (current instanceof java.util.Collection) {
      return (java.util.Collection<QuantitativeValue>) current;
    }
    return Arrays.asList((QuantitativeValue) current);
  }
  /**
   * A standardized size of a product or creative work, specified either through a simple textual string (for example 'XL', '32Wx34L'), a  QuantitativeValue with a unitCode, or a comprehensive and structured [[SizeSpecification]]; in other cases, the [[width]], [[height]], [[depth]] and [[weight]] properties may be more applicable. 
   */
  @JsonIgnore public SizeSpecification getSizeSizeSpecification() {
    return (SizeSpecification) getValue("size");
  }
  /**
   * A standardized size of a product or creative work, specified either through a simple textual string (for example 'XL', '32Wx34L'), a  QuantitativeValue with a unitCode, or a comprehensive and structured [[SizeSpecification]]; in other cases, the [[width]], [[height]], [[depth]] and [[weight]] properties may be more applicable. 
   */
  @JsonIgnore public java.util.Collection<SizeSpecification> getSizeSizeSpecifications() {
    final Object current = myData.get("size");
    if (current == null) return Collections.emptyList();
    if (current instanceof java.util.Collection) {
      return (java.util.Collection<SizeSpecification>) current;
    }
    return Arrays.asList((SizeSpecification) current);
  }
  /**
   * A standardized size of a product or creative work, specified either through a simple textual string (for example 'XL', '32Wx34L'), a  QuantitativeValue with a unitCode, or a comprehensive and structured [[SizeSpecification]]; in other cases, the [[width]], [[height]], [[depth]] and [[weight]] properties may be more applicable. 
   */
  @JsonIgnore public String getSizeString() {
    return (String) getValue("size");
  }
  /**
   * A standardized size of a product or creative work, specified either through a simple textual string (for example 'XL', '32Wx34L'), a  QuantitativeValue with a unitCode, or a comprehensive and structured [[SizeSpecification]]; in other cases, the [[width]], [[height]], [[depth]] and [[weight]] properties may be more applicable. 
   */
  @JsonIgnore public java.util.Collection<String> getSizeStrings() {
    final Object current = myData.get("size");
    if (current == null) return Collections.emptyList();
    if (current instanceof java.util.Collection) {
      return (java.util.Collection<String>) current;
    }
    return Arrays.asList((String) current);
  }
  /**
   * The date the item e.g. vehicle was purchased by the current owner.
   */
  @JsonIgnore public java.util.Date getPurchaseDate() {
    return (java.util.Date) getValue("purchaseDate");
  }
  /**
   * The date the item e.g. vehicle was purchased by the current owner.
   */
  @JsonIgnore public java.util.Collection<java.util.Date> getPurchaseDates() {
    final Object current = myData.get("purchaseDate");
    if (current == null) return Collections.emptyList();
    if (current instanceof java.util.Collection) {
      return (java.util.Collection<java.util.Date>) current;
    }
    return Arrays.asList((java.util.Date) current);
  }
  /**
   * Indicates the [[productGroupID]] for a [[ProductGroup]] that this product [[isVariantOf]]. 
   */
  @JsonIgnore public String getInProductGroupWithID() {
    return (String) getValue("inProductGroupWithID");
  }
  /**
   * Indicates the [[productGroupID]] for a [[ProductGroup]] that this product [[isVariantOf]]. 
   */
  @JsonIgnore public java.util.Collection<String> getInProductGroupWithIDs() {
    final Object current = myData.get("inProductGroupWithID");
    if (current == null) return Collections.emptyList();
    if (current instanceof java.util.Collection) {
      return (java.util.Collection<String>) current;
    }
    return Arrays.asList((String) current);
  }
  /**
   * The GTIN-13 code of the product, or the product to which the offer refers. This is equivalent to 13-digit ISBN codes and EAN UCC-13. Former 12-digit UPC codes can be converted into a GTIN-13 code by simply adding a preceding zero. See [GS1 GTIN Summary](http://www.gs1.org/barcodes/technical/idkeys/gtin) for more details.
   */
  @JsonIgnore public Gtin getGtin13() {
    return (Gtin) getValue("gtin13");
  }
  /**
   * The GTIN-13 code of the product, or the product to which the offer refers. This is equivalent to 13-digit ISBN codes and EAN UCC-13. Former 12-digit UPC codes can be converted into a GTIN-13 code by simply adding a preceding zero. See [GS1 GTIN Summary](http://www.gs1.org/barcodes/technical/idkeys/gtin) for more details.
   */
  @JsonIgnore public java.util.Collection<Gtin> getGtin13s() {
    final Object current = myData.get("gtin13");
    if (current == null) return Collections.emptyList();
    if (current instanceof java.util.Collection) {
      return (java.util.Collection<Gtin>) current;
    }
    return Arrays.asList((Gtin) current);
  }
  /**
   * A pattern that something has, for example 'polka dot', 'striped', 'Canadian flag'. Values are typically expressed as text, although links to controlled value schemes are also supported.
   */
  @JsonIgnore public DefinedTerm getPatternDefinedTerm() {
    return (DefinedTerm) getValue("pattern");
  }
  /**
   * A pattern that something has, for example 'polka dot', 'striped', 'Canadian flag'. Values are typically expressed as text, although links to controlled value schemes are also supported.
   */
  @JsonIgnore public java.util.Collection<DefinedTerm> getPatternDefinedTerms() {
    final Object current = myData.get("pattern");
    if (current == null) return Collections.emptyList();
    if (current instanceof java.util.Collection) {
      return (java.util.Collection<DefinedTerm>) current;
    }
    return Arrays.asList((DefinedTerm) current);
  }
  /**
   * A pattern that something has, for example 'polka dot', 'striped', 'Canadian flag'. Values are typically expressed as text, although links to controlled value schemes are also supported.
   */
  @JsonIgnore public String getPatternString() {
    return (String) getValue("pattern");
  }
  /**
   * A pattern that something has, for example 'polka dot', 'striped', 'Canadian flag'. Values are typically expressed as text, although links to controlled value schemes are also supported.
   */
  @JsonIgnore public java.util.Collection<String> getPatternStrings() {
    final Object current = myData.get("pattern");
    if (current == null) return Collections.emptyList();
    if (current instanceof java.util.Collection) {
      return (java.util.Collection<String>) current;
    }
    return Arrays.asList((String) current);
  }
  /**
   * The GTIN-14 code of the product, or the product to which the offer refers. See [GS1 GTIN Summary](http://www.gs1.org/barcodes/technical/idkeys/gtin) for more details.
   */
  @JsonIgnore public Identifier getGtin14() {
    return (Identifier) getValue("gtin14");
  }
  /**
   * The GTIN-14 code of the product, or the product to which the offer refers. See [GS1 GTIN Summary](http://www.gs1.org/barcodes/technical/idkeys/gtin) for more details.
   */
  @JsonIgnore public java.util.Collection<Identifier> getGtin14s() {
    final Object current = myData.get("gtin14");
    if (current == null) return Collections.emptyList();
    if (current instanceof java.util.Collection) {
      return (java.util.Collection<Identifier>) current;
    }
    return Arrays.asList((Identifier) current);
  }
  /**
   * A predefined value from OfferItemCondition specifying the condition of the product or service, or the products or services included in the offer. Also used for product return policies to specify the condition of products accepted for returns.
   */
  @JsonIgnore public OfferItemCondition getItemCondition() {
    return (OfferItemCondition) getValue("itemCondition");
  }
  /**
   * A predefined value from OfferItemCondition specifying the condition of the product or service, or the products or services included in the offer. Also used for product return policies to specify the condition of products accepted for returns.
   */
  @JsonIgnore public java.util.Collection<OfferItemCondition> getItemConditions() {
    final Object current = myData.get("itemCondition");
    if (current == null) return Collections.emptyList();
    if (current instanceof java.util.Collection) {
      return (java.util.Collection<OfferItemCondition>) current;
    }
    return Arrays.asList((OfferItemCondition) current);
  }
  /**
   * The overall rating, based on a collection of reviews or ratings, of the item.
   */
  @JsonIgnore public AggregateRating getAggregateRating() {
    return (AggregateRating) getValue("aggregateRating");
  }
  /**
   * The overall rating, based on a collection of reviews or ratings, of the item.
   */
  @JsonIgnore public java.util.Collection<AggregateRating> getAggregateRatings() {
    final Object current = myData.get("aggregateRating");
    if (current == null) return Collections.emptyList();
    if (current instanceof java.util.Collection) {
      return (java.util.Collection<AggregateRating>) current;
    }
    return Arrays.asList((AggregateRating) current);
  }
  /**
   * The Manufacturer Part Number (MPN) of the product, or the product to which the offer refers.
   */
  @JsonIgnore public String getMpn() {
    return (String) getValue("mpn");
  }
  /**
   * The Manufacturer Part Number (MPN) of the product, or the product to which the offer refers.
   */
  @JsonIgnore public java.util.Collection<String> getMpns() {
    final Object current = myData.get("mpn");
    if (current == null) return Collections.emptyList();
    if (current instanceof java.util.Collection) {
      return (java.util.Collection<String>) current;
    }
    return Arrays.asList((String) current);
  }
  /**
   * The depth of the item.
   */
  @JsonIgnore public Distance getDepthDistance() {
    return (Distance) getValue("depth");
  }
  /**
   * The depth of the item.
   */
  @JsonIgnore public java.util.Collection<Distance> getDepthDistances() {
    final Object current = myData.get("depth");
    if (current == null) return Collections.emptyList();
    if (current instanceof java.util.Collection) {
      return (java.util.Collection<Distance>) current;
    }
    return Arrays.asList((Distance) current);
  }
  /**
   * The depth of the item.
   */
  @JsonIgnore public QuantitativeValue getDepthQuantitativeValue() {
    return (QuantitativeValue) getValue("depth");
  }
  /**
   * The depth of the item.
   */
  @JsonIgnore public java.util.Collection<QuantitativeValue> getDepthQuantitativeValues() {
    final Object current = myData.get("depth");
    if (current == null) return Collections.emptyList();
    if (current instanceof java.util.Collection) {
      return (java.util.Collection<QuantitativeValue>) current;
    }
    return Arrays.asList((QuantitativeValue) current);
  }
  /**
   * An associated logo.
   */
  @JsonIgnore public Image getLogo() {
    return (Image) getValue("logo");
  }
  /**
   * An associated logo.
   */
  @JsonIgnore public java.util.Collection<Image> getLogos() {
    final Object current = myData.get("logo");
    if (current == null) return Collections.emptyList();
    if (current instanceof java.util.Collection) {
      return (java.util.Collection<Image>) current;
    }
    return Arrays.asList((Image) current);
  }
  /**
   * The GTIN-12 code of the product, or the product to which the offer refers. The GTIN-12 is the 12-digit GS1 Identification Key composed of a U.P.C. Company Prefix, Item Reference, and Check Digit used to identify trade items. See [GS1 GTIN Summary](http://www.gs1.org/barcodes/technical/idkeys/gtin) for more details.
   */
  @JsonIgnore public Identifier getGtin12() {
    return (Identifier) getValue("gtin12");
  }
  /**
   * The GTIN-12 code of the product, or the product to which the offer refers. The GTIN-12 is the 12-digit GS1 Identification Key composed of a U.P.C. Company Prefix, Item Reference, and Check Digit used to identify trade items. See [GS1 GTIN Summary](http://www.gs1.org/barcodes/technical/idkeys/gtin) for more details.
   */
  @JsonIgnore public java.util.Collection<Identifier> getGtin12s() {
    final Object current = myData.get("gtin12");
    if (current == null) return Collections.emptyList();
    if (current instanceof java.util.Collection) {
      return (java.util.Collection<Identifier>) current;
    }
    return Arrays.asList((Identifier) current);
  }
  /**
   * The height of the item.
   */
  @JsonIgnore public Distance getHeightDistance() {
    return (Distance) getValue("height");
  }
  /**
   * The height of the item.
   */
  @JsonIgnore public java.util.Collection<Distance> getHeightDistances() {
    final Object current = myData.get("height");
    if (current == null) return Collections.emptyList();
    if (current instanceof java.util.Collection) {
      return (java.util.Collection<Distance>) current;
    }
    return Arrays.asList((Distance) current);
  }
  /**
   * The height of the item.
   */
  @JsonIgnore public QuantitativeValue getHeightQuantitativeValue() {
    return (QuantitativeValue) getValue("height");
  }
  /**
   * The height of the item.
   */
  @JsonIgnore public java.util.Collection<QuantitativeValue> getHeightQuantitativeValues() {
    final Object current = myData.get("height");
    if (current == null) return Collections.emptyList();
    if (current instanceof java.util.Collection) {
      return (java.util.Collection<QuantitativeValue>) current;
    }
    return Arrays.asList((QuantitativeValue) current);
  }
  /**
   * The Stock Keeping Unit (SKU), i.e. a merchant-specific identifier for a product or service, or the product to which the offer refers.
   */
  @JsonIgnore public Identifier getSku() {
    return (Identifier) getValue("sku");
  }
  /**
   * The Stock Keeping Unit (SKU), i.e. a merchant-specific identifier for a product or service, or the product to which the offer refers.
   */
  @JsonIgnore public java.util.Collection<Identifier> getSkus() {
    final Object current = myData.get("sku");
    if (current == null) return Collections.emptyList();
    if (current instanceof java.util.Collection) {
      return (java.util.Collection<Identifier>) current;
    }
    return Arrays.asList((Identifier) current);
  }
  /**
   * A pointer to another, functionally similar product (or multiple products).
   */
  @JsonIgnore public Product getIsSimilarToProduct() {
    return (Product) getValue("isSimilarTo");
  }
  /**
   * A pointer to another, functionally similar product (or multiple products).
   */
  @JsonIgnore public java.util.Collection<Product> getIsSimilarToProducts() {
    final Object current = myData.get("isSimilarTo");
    if (current == null) return Collections.emptyList();
    if (current instanceof java.util.Collection) {
      return (java.util.Collection<Product>) current;
    }
    return Arrays.asList((Product) current);
  }
  /**
   * A pointer to another, functionally similar product (or multiple products).
   */
  @JsonIgnore public Service getIsSimilarToService() {
    return (Service) getValue("isSimilarTo");
  }
  /**
   * A pointer to another, functionally similar product (or multiple products).
   */
  @JsonIgnore public java.util.Collection<Service> getIsSimilarToServices() {
    final Object current = myData.get("isSimilarTo");
    if (current == null) return Collections.emptyList();
    if (current instanceof java.util.Collection) {
      return (java.util.Collection<Service>) current;
    }
    return Arrays.asList((Service) current);
  }
  /**
   * A pointer to another, somehow related product (or multiple products).
   */
  @JsonIgnore public Product getIsRelatedToProduct() {
    return (Product) getValue("isRelatedTo");
  }
  /**
   * A pointer to another, somehow related product (or multiple products).
   */
  @JsonIgnore public java.util.Collection<Product> getIsRelatedToProducts() {
    final Object current = myData.get("isRelatedTo");
    if (current == null) return Collections.emptyList();
    if (current instanceof java.util.Collection) {
      return (java.util.Collection<Product>) current;
    }
    return Arrays.asList((Product) current);
  }
  /**
   * A pointer to another, somehow related product (or multiple products).
   */
  @JsonIgnore public Service getIsRelatedToService() {
    return (Service) getValue("isRelatedTo");
  }
  /**
   * A pointer to another, somehow related product (or multiple products).
   */
  @JsonIgnore public java.util.Collection<Service> getIsRelatedToServices() {
    final Object current = myData.get("isRelatedTo");
    if (current == null) return Collections.emptyList();
    if (current instanceof java.util.Collection) {
      return (java.util.Collection<Service>) current;
    }
    return Arrays.asList((Service) current);
  }
  /**
   * An intended audience, i.e. a group for whom something was created.
   */
  @JsonIgnore public Audience getAudience() {
    return (Audience) getValue("audience");
  }
  /**
   * An intended audience, i.e. a group for whom something was created.
   */
  @JsonIgnore public java.util.Collection<Audience> getAudiences() {
    final Object current = myData.get("audience");
    if (current == null) return Collections.emptyList();
    if (current instanceof java.util.Collection) {
      return (java.util.Collection<Audience>) current;
    }
    return Arrays.asList((Audience) current);
  }
  /**
   * The brand(s) associated with a product or service, or the brand(s) maintained by an organization or business person.
   */
  @JsonIgnore public Brand getBrandBrand() {
    return (Brand) getValue("brand");
  }
  /**
   * The brand(s) associated with a product or service, or the brand(s) maintained by an organization or business person.
   */
  @JsonIgnore public java.util.Collection<Brand> getBrandBrands() {
    final Object current = myData.get("brand");
    if (current == null) return Collections.emptyList();
    if (current instanceof java.util.Collection) {
      return (java.util.Collection<Brand>) current;
    }
    return Arrays.asList((Brand) current);
  }
  /**
   * The brand(s) associated with a product or service, or the brand(s) maintained by an organization or business person.
   */
  @JsonIgnore public Organization getBrandOrganization() {
    return (Organization) getValue("brand");
  }
  /**
   * The brand(s) associated with a product or service, or the brand(s) maintained by an organization or business person.
   */
  @JsonIgnore public java.util.Collection<Organization> getBrandOrganizations() {
    final Object current = myData.get("brand");
    if (current == null) return Collections.emptyList();
    if (current instanceof java.util.Collection) {
      return (java.util.Collection<Organization>) current;
    }
    return Arrays.asList((Organization) current);
  }
  /**
   * Indicates the [NATO stock number](https://en.wikipedia.org/wiki/NATO_Stock_Number) (nsn) of a [[Product]]. 
   */
  @JsonIgnore public String getNsn() {
    return (String) getValue("nsn");
  }
  /**
   * Indicates the [NATO stock number](https://en.wikipedia.org/wiki/NATO_Stock_Number) (nsn) of a [[Product]]. 
   */
  @JsonIgnore public java.util.Collection<String> getNsns() {
    final Object current = myData.get("nsn");
    if (current == null) return Collections.emptyList();
    if (current instanceof java.util.Collection) {
      return (java.util.Collection<String>) current;
    }
    return Arrays.asList((String) current);
  }
  /**
   * The product identifier, such as ISBN. For example: ``` meta itemprop=&quot;productID&quot; content=&quot;isbn:123-456-789&quot; ```.
   */
  @JsonIgnore public Identifier getProductID() {
    return (Identifier) getValue("productID");
  }
  /**
   * The product identifier, such as ISBN. For example: ``` meta itemprop=&quot;productID&quot; content=&quot;isbn:123-456-789&quot; ```.
   */
  @JsonIgnore public java.util.Collection<Identifier> getProductIDs() {
    final Object current = myData.get("productID");
    if (current == null) return Collections.emptyList();
    if (current instanceof java.util.Collection) {
      return (java.util.Collection<Identifier>) current;
    }
    return Arrays.asList((Identifier) current);
  }
  /**
   * Specifies a MerchantReturnPolicy that may be applicable.
   */
  @JsonIgnore public MerchantReturnPolicy getHasMerchantReturnPolicy() {
    return (MerchantReturnPolicy) getValue("hasMerchantReturnPolicy");
  }
  /**
   * Specifies a MerchantReturnPolicy that may be applicable.
   */
  @JsonIgnore public java.util.Collection<MerchantReturnPolicy> getHasMerchantReturnPolicys() {
    final Object current = myData.get("hasMerchantReturnPolicy");
    if (current == null) return Collections.emptyList();
    if (current instanceof java.util.Collection) {
      return (java.util.Collection<MerchantReturnPolicy>) current;
    }
    return Arrays.asList((MerchantReturnPolicy) current);
  }
  /**
   * The model of the product. Use with the URL of a ProductModel or a textual representation of the model identifier. The URL of the ProductModel can be from an external source. It is recommended to additionally provide strong product identifiers via the gtin8/gtin13/gtin14 and mpn properties.
   */
  @JsonIgnore public ProductModel getModelProductModel() {
    return (ProductModel) getValue("model");
  }
  /**
   * The model of the product. Use with the URL of a ProductModel or a textual representation of the model identifier. The URL of the ProductModel can be from an external source. It is recommended to additionally provide strong product identifiers via the gtin8/gtin13/gtin14 and mpn properties.
   */
  @JsonIgnore public java.util.Collection<ProductModel> getModelProductModels() {
    final Object current = myData.get("model");
    if (current == null) return Collections.emptyList();
    if (current instanceof java.util.Collection) {
      return (java.util.Collection<ProductModel>) current;
    }
    return Arrays.asList((ProductModel) current);
  }
  /**
   * The model of the product. Use with the URL of a ProductModel or a textual representation of the model identifier. The URL of the ProductModel can be from an external source. It is recommended to additionally provide strong product identifiers via the gtin8/gtin13/gtin14 and mpn properties.
   */
  @JsonIgnore public String getModelString() {
    return (String) getValue("model");
  }
  /**
   * The model of the product. Use with the URL of a ProductModel or a textual representation of the model identifier. The URL of the ProductModel can be from an external source. It is recommended to additionally provide strong product identifiers via the gtin8/gtin13/gtin14 and mpn properties.
   */
  @JsonIgnore public java.util.Collection<String> getModelStrings() {
    final Object current = myData.get("model");
    if (current == null) return Collections.emptyList();
    if (current instanceof java.util.Collection) {
      return (java.util.Collection<String>) current;
    }
    return Arrays.asList((String) current);
  }
  /**
   * The place where the item (typically [[Product]]) was last processed and tested before importation.
   */
  @JsonIgnore public String getCountryOfLastProcessing() {
    return (String) getValue("countryOfLastProcessing");
  }
  /**
   * The place where the item (typically [[Product]]) was last processed and tested before importation.
   */
  @JsonIgnore public java.util.Collection<String> getCountryOfLastProcessings() {
    final Object current = myData.get("countryOfLastProcessing");
    if (current == null) return Collections.emptyList();
    if (current instanceof java.util.Collection) {
      return (java.util.Collection<String>) current;
    }
    return Arrays.asList((String) current);
  }
  /**
   * A category for the item. Greater signs or slashes can be used to informally indicate a category hierarchy.
   */
  @JsonIgnore public Category getCategory() {
    return (Category) getValue("category");
  }
  /**
   * A category for the item. Greater signs or slashes can be used to informally indicate a category hierarchy.
   */
  @JsonIgnore public java.util.Collection<Category> getCategorys() {
    final Object current = myData.get("category");
    if (current == null) return Collections.emptyList();
    if (current instanceof java.util.Collection) {
      return (java.util.Collection<Category>) current;
    }
    return Arrays.asList((Category) current);
  }
  /**
   * The place where the product was assembled.
   */
  @JsonIgnore public String getCountryOfAssembly() {
    return (String) getValue("countryOfAssembly");
  }
  /**
   * The place where the product was assembled.
   */
  @JsonIgnore public java.util.Collection<String> getCountryOfAssemblys() {
    final Object current = myData.get("countryOfAssembly");
    if (current == null) return Collections.emptyList();
    if (current instanceof java.util.Collection) {
      return (java.util.Collection<String>) current;
    }
    return Arrays.asList((String) current);
  }
  /**
   * A property-value pair representing an additional characteristics of the entitity, e.g. a product feature or another characteristic for which there is no matching property in schema.org.\n\nNote: Publishers should be aware that applications designed to use specific schema.org properties (e.g. http://schema.org/width, http://schema.org/color, http://schema.org/gtin13, ...) will typically expect such data to be provided using those properties, rather than using the generic property/value mechanism.
   * 
   */
  @JsonIgnore public PropertyValue getAdditionalProperty() {
    return (PropertyValue) getValue("additionalProperty");
  }
  /**
   * A property-value pair representing an additional characteristics of the entitity, e.g. a product feature or another characteristic for which there is no matching property in schema.org.\n\nNote: Publishers should be aware that applications designed to use specific schema.org properties (e.g. http://schema.org/width, http://schema.org/color, http://schema.org/gtin13, ...) will typically expect such data to be provided using those properties, rather than using the generic property/value mechanism.
   * 
   */
  @JsonIgnore public java.util.Collection<PropertyValue> getAdditionalPropertys() {
    final Object current = myData.get("additionalProperty");
    if (current == null) return Collections.emptyList();
    if (current instanceof java.util.Collection) {
      return (java.util.Collection<PropertyValue>) current;
    }
    return Arrays.asList((PropertyValue) current);
  }
  /**
   * A pointer to another product (or multiple products) for which this product is an accessory or spare part.
   */
  @JsonIgnore public Product getIsAccessoryOrSparePartFor() {
    return (Product) getValue("isAccessoryOrSparePartFor");
  }
  /**
   * A pointer to another product (or multiple products) for which this product is an accessory or spare part.
   */
  @JsonIgnore public java.util.Collection<Product> getIsAccessoryOrSparePartFors() {
    final Object current = myData.get("isAccessoryOrSparePartFor");
    if (current == null) return Collections.emptyList();
    if (current instanceof java.util.Collection) {
      return (java.util.Collection<Product>) current;
    }
    return Arrays.asList((Product) current);
  }
  /**
   * The country of origin of something, including products as well as creative  works such as movie and TV content.
   * 
   * In the case of TV and movie, this would be the country of the principle offices of the production company or individual responsible for the movie. For other kinds of [[CreativeWork]] it is difficult to provide fully general guidance, and properties such as [[contentLocation]] and [[locationCreated]] may be more applicable.
   * 
   * In the case of products, the country of origin of the product. The exact interpretation of this may vary by context and product type, and cannot be fully enumerated here.
   */
  @JsonIgnore public Country getCountryOfOrigin() {
    return (Country) getValue("countryOfOrigin");
  }
  /**
   * The country of origin of something, including products as well as creative  works such as movie and TV content.
   * 
   * In the case of TV and movie, this would be the country of the principle offices of the production company or individual responsible for the movie. For other kinds of [[CreativeWork]] it is difficult to provide fully general guidance, and properties such as [[contentLocation]] and [[locationCreated]] may be more applicable.
   * 
   * In the case of products, the country of origin of the product. The exact interpretation of this may vary by context and product type, and cannot be fully enumerated here.
   */
  @JsonIgnore public java.util.Collection<Country> getCountryOfOrigins() {
    final Object current = myData.get("countryOfOrigin");
    if (current == null) return Collections.emptyList();
    if (current instanceof java.util.Collection) {
      return (java.util.Collection<Country>) current;
    }
    return Arrays.asList((Country) current);
  }
  /**
   * The release date of a product or product model. This can be used to distinguish the exact variant of a product.
   */
  @JsonIgnore public java.util.Date getReleaseDate() {
    return (java.util.Date) getValue("releaseDate");
  }
  /**
   * The release date of a product or product model. This can be used to distinguish the exact variant of a product.
   */
  @JsonIgnore public java.util.Collection<java.util.Date> getReleaseDates() {
    final Object current = myData.get("releaseDate");
    if (current == null) return Collections.emptyList();
    if (current instanceof java.util.Collection) {
      return (java.util.Collection<java.util.Date>) current;
    }
    return Arrays.asList((java.util.Date) current);
  }
  /**
   * A review of the item.
   */
  @JsonIgnore public Review getReview() {
    return (Review) getValue("review");
  }
  /**
   * A review of the item.
   */
  @JsonIgnore public java.util.Collection<Review> getReviews() {
    final Object current = myData.get("review");
    if (current == null) return Collections.emptyList();
    if (current instanceof java.util.Collection) {
      return (java.util.Collection<Review>) current;
    }
    return Arrays.asList((Review) current);
  }
  /**
   * The date of production of the item, e.g. vehicle.
   */
  @JsonIgnore public java.util.Date getProductionDate() {
    return (java.util.Date) getValue("productionDate");
  }
  /**
   * The date of production of the item, e.g. vehicle.
   */
  @JsonIgnore public java.util.Collection<java.util.Date> getProductionDates() {
    final Object current = myData.get("productionDate");
    if (current == null) return Collections.emptyList();
    if (current instanceof java.util.Collection) {
      return (java.util.Collection<java.util.Date>) current;
    }
    return Arrays.asList((java.util.Date) current);
  }
  /**
   * An award won by or for this item.
   */
  @JsonIgnore public String getAward() {
    return (String) getValue("award");
  }
  /**
   * An award won by or for this item.
   */
  @JsonIgnore public java.util.Collection<String> getAwards() {
    final Object current = myData.get("award");
    if (current == null) return Collections.emptyList();
    if (current instanceof java.util.Collection) {
      return (java.util.Collection<String>) current;
    }
    return Arrays.asList((String) current);
  }
  /**
   * The GTIN-8 code of the product, or the product to which the offer refers. This code is also known as EAN/UCC-8 or 8-digit EAN. See [GS1 GTIN Summary](http://www.gs1.org/barcodes/technical/idkeys/gtin) for more details.
   */
  @JsonIgnore public Gtin getGtin8() {
    return (Gtin) getValue("gtin8");
  }
  /**
   * The GTIN-8 code of the product, or the product to which the offer refers. This code is also known as EAN/UCC-8 or 8-digit EAN. See [GS1 GTIN Summary](http://www.gs1.org/barcodes/technical/idkeys/gtin) for more details.
   */
  @JsonIgnore public java.util.Collection<Gtin> getGtin8s() {
    final Object current = myData.get("gtin8");
    if (current == null) return Collections.emptyList();
    if (current instanceof java.util.Collection) {
      return (java.util.Collection<Gtin>) current;
    }
    return Arrays.asList((Gtin) current);
  }
  /**
   * The weight of the product or person.
   */
  @JsonIgnore public QuantitativeValue getWeight() {
    return (QuantitativeValue) getValue("weight");
  }
  /**
   * The weight of the product or person.
   */
  @JsonIgnore public java.util.Collection<QuantitativeValue> getWeights() {
    final Object current = myData.get("weight");
    if (current == null) return Collections.emptyList();
    if (current instanceof java.util.Collection) {
      return (java.util.Collection<QuantitativeValue>) current;
    }
    return Arrays.asList((QuantitativeValue) current);
  }
  /**
   * Defines the energy efficiency Category (also known as &quot;class&quot; or &quot;rating&quot;) for a product according to an international energy efficiency standard.
   */
  @JsonIgnore public EnergyConsumptionDetails getHasEnergyConsumptionDetails() {
    return (EnergyConsumptionDetails) getValue("hasEnergyConsumptionDetails");
  }
  /**
   * Defines the energy efficiency Category (also known as &quot;class&quot; or &quot;rating&quot;) for a product according to an international energy efficiency standard.
   */
  @JsonIgnore public java.util.Collection<EnergyConsumptionDetails> getHasEnergyConsumptionDetailss() {
    final Object current = myData.get("hasEnergyConsumptionDetails");
    if (current == null) return Collections.emptyList();
    if (current instanceof java.util.Collection) {
      return (java.util.Collection<EnergyConsumptionDetails>) current;
    }
    return Arrays.asList((EnergyConsumptionDetails) current);
  }
  /**
   * A product measurement, for example the inseam of pants, the wheel size of a bicycle, or the gauge of a screw. Usually an exact measurement, but can also be a range of measurements for adjustable products, for example belts and ski bindings.
   */
  @JsonIgnore public QuantitativeValue getHasMeasurement() {
    return (QuantitativeValue) getValue("hasMeasurement");
  }
  /**
   * A product measurement, for example the inseam of pants, the wheel size of a bicycle, or the gauge of a screw. Usually an exact measurement, but can also be a range of measurements for adjustable products, for example belts and ski bindings.
   */
  @JsonIgnore public java.util.Collection<QuantitativeValue> getHasMeasurements() {
    final Object current = myData.get("hasMeasurement");
    if (current == null) return Collections.emptyList();
    if (current instanceof java.util.Collection) {
      return (java.util.Collection<QuantitativeValue>) current;
    }
    return Arrays.asList((QuantitativeValue) current);
  }
  /**
   * A pointer to another product (or multiple products) for which this product is a consumable.
   */
  @JsonIgnore public Product getIsConsumableFor() {
    return (Product) getValue("isConsumableFor");
  }
  /**
   * A pointer to another product (or multiple products) for which this product is a consumable.
   */
  @JsonIgnore public java.util.Collection<Product> getIsConsumableFors() {
    final Object current = myData.get("isConsumableFor");
    if (current == null) return Collections.emptyList();
    if (current instanceof java.util.Collection) {
      return (java.util.Collection<Product>) current;
    }
    return Arrays.asList((Product) current);
  }
  /**
   * The color of the product.
   */
  @JsonIgnore public String getColor() {
    return (String) getValue("color");
  }
  /**
   * The color of the product.
   */
  @JsonIgnore public java.util.Collection<String> getColors() {
    final Object current = myData.get("color");
    if (current == null) return Collections.emptyList();
    if (current instanceof java.util.Collection) {
      return (java.util.Collection<String>) current;
    }
    return Arrays.asList((String) current);
  }
  /**
   * A slogan or motto associated with the item.
   */
  @JsonIgnore public String getSlogan() {
    return (String) getValue("slogan");
  }
  /**
   * A slogan or motto associated with the item.
   */
  @JsonIgnore public java.util.Collection<String> getSlogans() {
    final Object current = myData.get("slogan");
    if (current == null) return Collections.emptyList();
    if (current instanceof java.util.Collection) {
      return (java.util.Collection<String>) current;
    }
    return Arrays.asList((String) current);
  }
  /**
   * Indicates the kind of product that this is a variant of. In the case of [[ProductModel]], this is a pointer (from a ProductModel) to a base product from which this product is a variant. It is safe to infer that the variant inherits all product features from the base model, unless defined locally. This is not transitive. In the case of a [[ProductGroup]], the group description also serves as a template, representing a set of Products that vary on explicitly defined, specific dimensions only (so it defines both a set of variants, as well as which values distinguish amongst those variants). When used with [[ProductGroup]], this property can apply to any [[Product]] included in the group.
   */
  @JsonIgnore public ProductGroup getIsVariantOfProductGroup() {
    return (ProductGroup) getValue("isVariantOf");
  }
  /**
   * Indicates the kind of product that this is a variant of. In the case of [[ProductModel]], this is a pointer (from a ProductModel) to a base product from which this product is a variant. It is safe to infer that the variant inherits all product features from the base model, unless defined locally. This is not transitive. In the case of a [[ProductGroup]], the group description also serves as a template, representing a set of Products that vary on explicitly defined, specific dimensions only (so it defines both a set of variants, as well as which values distinguish amongst those variants). When used with [[ProductGroup]], this property can apply to any [[Product]] included in the group.
   */
  @JsonIgnore public java.util.Collection<ProductGroup> getIsVariantOfProductGroups() {
    final Object current = myData.get("isVariantOf");
    if (current == null) return Collections.emptyList();
    if (current instanceof java.util.Collection) {
      return (java.util.Collection<ProductGroup>) current;
    }
    return Arrays.asList((ProductGroup) current);
  }
  /**
   * Indicates the kind of product that this is a variant of. In the case of [[ProductModel]], this is a pointer (from a ProductModel) to a base product from which this product is a variant. It is safe to infer that the variant inherits all product features from the base model, unless defined locally. This is not transitive. In the case of a [[ProductGroup]], the group description also serves as a template, representing a set of Products that vary on explicitly defined, specific dimensions only (so it defines both a set of variants, as well as which values distinguish amongst those variants). When used with [[ProductGroup]], this property can apply to any [[Product]] included in the group.
   */
  @JsonIgnore public ProductModel getIsVariantOfProductModel() {
    return (ProductModel) getValue("isVariantOf");
  }
  /**
   * Indicates the kind of product that this is a variant of. In the case of [[ProductModel]], this is a pointer (from a ProductModel) to a base product from which this product is a variant. It is safe to infer that the variant inherits all product features from the base model, unless defined locally. This is not transitive. In the case of a [[ProductGroup]], the group description also serves as a template, representing a set of Products that vary on explicitly defined, specific dimensions only (so it defines both a set of variants, as well as which values distinguish amongst those variants). When used with [[ProductGroup]], this property can apply to any [[Product]] included in the group.
   */
  @JsonIgnore public java.util.Collection<ProductModel> getIsVariantOfProductModels() {
    final Object current = myData.get("isVariantOf");
    if (current == null) return Collections.emptyList();
    if (current instanceof java.util.Collection) {
      return (java.util.Collection<ProductModel>) current;
    }
    return Arrays.asList((ProductModel) current);
  }
  /**
   * An offer to provide this item&amp;#x2014;for example, an offer to sell a product, rent the DVD of a movie, perform a service, or give away tickets to an event. Use [[businessFunction]] to indicate the kind of transaction offered, i.e. sell, lease, etc. This property can also be used to describe a [[Demand]]. While this property is listed as expected on a number of common types, it can be used in others. In that case, using a second type, such as Product or a subtype of Product, can clarify the nature of the offer.
   *       
   */
  @JsonIgnore public Demand getOffersDemand() {
    return (Demand) getValue("offers");
  }
  /**
   * An offer to provide this item&amp;#x2014;for example, an offer to sell a product, rent the DVD of a movie, perform a service, or give away tickets to an event. Use [[businessFunction]] to indicate the kind of transaction offered, i.e. sell, lease, etc. This property can also be used to describe a [[Demand]]. While this property is listed as expected on a number of common types, it can be used in others. In that case, using a second type, such as Product or a subtype of Product, can clarify the nature of the offer.
   *       
   */
  @JsonIgnore public java.util.Collection<Demand> getOffersDemands() {
    final Object current = myData.get("offers");
    if (current == null) return Collections.emptyList();
    if (current instanceof java.util.Collection) {
      return (java.util.Collection<Demand>) current;
    }
    return Arrays.asList((Demand) current);
  }
  /**
   * An offer to provide this item&amp;#x2014;for example, an offer to sell a product, rent the DVD of a movie, perform a service, or give away tickets to an event. Use [[businessFunction]] to indicate the kind of transaction offered, i.e. sell, lease, etc. This property can also be used to describe a [[Demand]]. While this property is listed as expected on a number of common types, it can be used in others. In that case, using a second type, such as Product or a subtype of Product, can clarify the nature of the offer.
   *       
   */
  @JsonIgnore public Offer getOffersOffer() {
    return (Offer) getValue("offers");
  }
  /**
   * An offer to provide this item&amp;#x2014;for example, an offer to sell a product, rent the DVD of a movie, perform a service, or give away tickets to an event. Use [[businessFunction]] to indicate the kind of transaction offered, i.e. sell, lease, etc. This property can also be used to describe a [[Demand]]. While this property is listed as expected on a number of common types, it can be used in others. In that case, using a second type, such as Product or a subtype of Product, can clarify the nature of the offer.
   *       
   */
  @JsonIgnore public java.util.Collection<Offer> getOffersOffers() {
    final Object current = myData.get("offers");
    if (current == null) return Collections.emptyList();
    if (current instanceof java.util.Collection) {
      return (java.util.Collection<Offer>) current;
    }
    return Arrays.asList((Offer) current);
  }
  protected Product(java.util.Map<String,Object> data) {
    super(data);
  }
  
  /**
   * Builder for {@link Product}
   */
  public static class Builder extends Thing.Builder {
    public Builder(@NotNull HashMap<String,Object> data) {
      super(data);
    }
    @NotNull public Product build() {
      return new Product(myData);
    }
    /**
     * The width of the item.
     */
    @NotNull public Builder width(@NotNull Distance distance) {
      putValue("width", distance);
      return this;
    }
    /**
     * The width of the item.
     */
    @NotNull public Builder width(@NotNull Distance.Builder distance) {
      putValue("width", distance.build());
      return this;
    }
    /**
     * The width of the item.
     */
    @NotNull public Builder width(@NotNull QuantitativeValue quantitativeValue) {
      putValue("width", quantitativeValue);
      return this;
    }
    /**
     * The width of the item.
     */
    @NotNull public Builder width(@NotNull QuantitativeValue.Builder quantitativeValue) {
      putValue("width", quantitativeValue.build());
      return this;
    }
    /**
     * The manufacturer of the product.
     */
    @NotNull public Builder manufacturer(@NotNull Organization organization) {
      putValue("manufacturer", organization);
      return this;
    }
    /**
     * The manufacturer of the product.
     */
    @NotNull public Builder manufacturer(@NotNull Organization.Builder organization) {
      putValue("manufacturer", organization.build());
      return this;
    }
    /**
     * A standardized size of a product or creative work, specified either through a simple textual string (for example 'XL', '32Wx34L'), a  QuantitativeValue with a unitCode, or a comprehensive and structured [[SizeSpecification]]; in other cases, the [[width]], [[height]], [[depth]] and [[weight]] properties may be more applicable. 
     */
    @NotNull public Builder size(@NotNull DefinedTerm definedTerm) {
      putValue("size", definedTerm);
      return this;
    }
    /**
     * A standardized size of a product or creative work, specified either through a simple textual string (for example 'XL', '32Wx34L'), a  QuantitativeValue with a unitCode, or a comprehensive and structured [[SizeSpecification]]; in other cases, the [[width]], [[height]], [[depth]] and [[weight]] properties may be more applicable. 
     */
    @NotNull public Builder size(@NotNull DefinedTerm.Builder definedTerm) {
      putValue("size", definedTerm.build());
      return this;
    }
    /**
     * A standardized size of a product or creative work, specified either through a simple textual string (for example 'XL', '32Wx34L'), a  QuantitativeValue with a unitCode, or a comprehensive and structured [[SizeSpecification]]; in other cases, the [[width]], [[height]], [[depth]] and [[weight]] properties may be more applicable. 
     */
    @NotNull public Builder size(@NotNull QuantitativeValue quantitativeValue) {
      putValue("size", quantitativeValue);
      return this;
    }
    /**
     * A standardized size of a product or creative work, specified either through a simple textual string (for example 'XL', '32Wx34L'), a  QuantitativeValue with a unitCode, or a comprehensive and structured [[SizeSpecification]]; in other cases, the [[width]], [[height]], [[depth]] and [[weight]] properties may be more applicable. 
     */
    @NotNull public Builder size(@NotNull QuantitativeValue.Builder quantitativeValue) {
      putValue("size", quantitativeValue.build());
      return this;
    }
    /**
     * A standardized size of a product or creative work, specified either through a simple textual string (for example 'XL', '32Wx34L'), a  QuantitativeValue with a unitCode, or a comprehensive and structured [[SizeSpecification]]; in other cases, the [[width]], [[height]], [[depth]] and [[weight]] properties may be more applicable. 
     */
    @NotNull public Builder size(@NotNull SizeSpecification sizeSpecification) {
      putValue("size", sizeSpecification);
      return this;
    }
    /**
     * A standardized size of a product or creative work, specified either through a simple textual string (for example 'XL', '32Wx34L'), a  QuantitativeValue with a unitCode, or a comprehensive and structured [[SizeSpecification]]; in other cases, the [[width]], [[height]], [[depth]] and [[weight]] properties may be more applicable. 
     */
    @NotNull public Builder size(@NotNull SizeSpecification.Builder sizeSpecification) {
      putValue("size", sizeSpecification.build());
      return this;
    }
    /**
     * A standardized size of a product or creative work, specified either through a simple textual string (for example 'XL', '32Wx34L'), a  QuantitativeValue with a unitCode, or a comprehensive and structured [[SizeSpecification]]; in other cases, the [[width]], [[height]], [[depth]] and [[weight]] properties may be more applicable. 
     */
    @NotNull public Builder size(@NotNull String size) {
      putValue("size", size);
      return this;
    }
    /**
     * The date the item e.g. vehicle was purchased by the current owner.
     */
    @NotNull public Builder purchaseDate(@NotNull java.util.Date date) {
      putValue("purchaseDate", date);
      return this;
    }
    /**
     * Indicates the [[productGroupID]] for a [[ProductGroup]] that this product [[isVariantOf]]. 
     */
    @NotNull public Builder inProductGroupWithID(@NotNull String inProductGroupWithID) {
      putValue("inProductGroupWithID", inProductGroupWithID);
      return this;
    }
    /**
     * The GTIN-13 code of the product, or the product to which the offer refers. This is equivalent to 13-digit ISBN codes and EAN UCC-13. Former 12-digit UPC codes can be converted into a GTIN-13 code by simply adding a preceding zero. See [GS1 GTIN Summary](http://www.gs1.org/barcodes/technical/idkeys/gtin) for more details.
     */
    @NotNull public Builder gtin13(@NotNull Gtin gtin) {
      putValue("gtin13", gtin);
      return this;
    }
    /**
     * A pattern that something has, for example 'polka dot', 'striped', 'Canadian flag'. Values are typically expressed as text, although links to controlled value schemes are also supported.
     */
    @NotNull public Builder pattern(@NotNull DefinedTerm definedTerm) {
      putValue("pattern", definedTerm);
      return this;
    }
    /**
     * A pattern that something has, for example 'polka dot', 'striped', 'Canadian flag'. Values are typically expressed as text, although links to controlled value schemes are also supported.
     */
    @NotNull public Builder pattern(@NotNull DefinedTerm.Builder definedTerm) {
      putValue("pattern", definedTerm.build());
      return this;
    }
    /**
     * A pattern that something has, for example 'polka dot', 'striped', 'Canadian flag'. Values are typically expressed as text, although links to controlled value schemes are also supported.
     */
    @NotNull public Builder pattern(@NotNull String pattern) {
      putValue("pattern", pattern);
      return this;
    }
    /**
     * The GTIN-14 code of the product, or the product to which the offer refers. See [GS1 GTIN Summary](http://www.gs1.org/barcodes/technical/idkeys/gtin) for more details.
     */
    @NotNull public Builder gtin14(@NotNull Identifier identifier) {
      putValue("gtin14", identifier);
      return this;
    }
    /**
     * A predefined value from OfferItemCondition specifying the condition of the product or service, or the products or services included in the offer. Also used for product return policies to specify the condition of products accepted for returns.
     */
    @NotNull public Builder itemCondition(@NotNull OfferItemCondition offerItemCondition) {
      putValue("itemCondition", offerItemCondition);
      return this;
    }
    /**
     * The overall rating, based on a collection of reviews or ratings, of the item.
     */
    @NotNull public Builder aggregateRating(@NotNull AggregateRating aggregateRating) {
      putValue("aggregateRating", aggregateRating);
      return this;
    }
    /**
     * The overall rating, based on a collection of reviews or ratings, of the item.
     */
    @NotNull public Builder aggregateRating(@NotNull AggregateRating.Builder aggregateRating) {
      putValue("aggregateRating", aggregateRating.build());
      return this;
    }
    /**
     * The Manufacturer Part Number (MPN) of the product, or the product to which the offer refers.
     */
    @NotNull public Builder mpn(@NotNull String mpn) {
      putValue("mpn", mpn);
      return this;
    }
    /**
     * The depth of the item.
     */
    @NotNull public Builder depth(@NotNull Distance distance) {
      putValue("depth", distance);
      return this;
    }
    /**
     * The depth of the item.
     */
    @NotNull public Builder depth(@NotNull Distance.Builder distance) {
      putValue("depth", distance.build());
      return this;
    }
    /**
     * The depth of the item.
     */
    @NotNull public Builder depth(@NotNull QuantitativeValue quantitativeValue) {
      putValue("depth", quantitativeValue);
      return this;
    }
    /**
     * The depth of the item.
     */
    @NotNull public Builder depth(@NotNull QuantitativeValue.Builder quantitativeValue) {
      putValue("depth", quantitativeValue.build());
      return this;
    }
    /**
     * An associated logo.
     */
    @NotNull public Builder logo(@NotNull Image image) {
      putValue("logo", image);
      return this;
    }
    /**
     * The GTIN-12 code of the product, or the product to which the offer refers. The GTIN-12 is the 12-digit GS1 Identification Key composed of a U.P.C. Company Prefix, Item Reference, and Check Digit used to identify trade items. See [GS1 GTIN Summary](http://www.gs1.org/barcodes/technical/idkeys/gtin) for more details.
     */
    @NotNull public Builder gtin12(@NotNull Identifier identifier) {
      putValue("gtin12", identifier);
      return this;
    }
    /**
     * The height of the item.
     */
    @NotNull public Builder height(@NotNull Distance distance) {
      putValue("height", distance);
      return this;
    }
    /**
     * The height of the item.
     */
    @NotNull public Builder height(@NotNull Distance.Builder distance) {
      putValue("height", distance.build());
      return this;
    }
    /**
     * The height of the item.
     */
    @NotNull public Builder height(@NotNull QuantitativeValue quantitativeValue) {
      putValue("height", quantitativeValue);
      return this;
    }
    /**
     * The height of the item.
     */
    @NotNull public Builder height(@NotNull QuantitativeValue.Builder quantitativeValue) {
      putValue("height", quantitativeValue.build());
      return this;
    }
    /**
     * The Stock Keeping Unit (SKU), i.e. a merchant-specific identifier for a product or service, or the product to which the offer refers.
     */
    @NotNull public Builder sku(@NotNull Identifier identifier) {
      putValue("sku", identifier);
      return this;
    }
    /**
     * A pointer to another, functionally similar product (or multiple products).
     */
    @NotNull public Builder isSimilarTo(@NotNull Product product) {
      putValue("isSimilarTo", product);
      return this;
    }
    /**
     * A pointer to another, functionally similar product (or multiple products).
     */
    @NotNull public Builder isSimilarTo(@NotNull Product.Builder product) {
      putValue("isSimilarTo", product.build());
      return this;
    }
    /**
     * A pointer to another, functionally similar product (or multiple products).
     */
    @NotNull public Builder isSimilarTo(@NotNull Service service) {
      putValue("isSimilarTo", service);
      return this;
    }
    /**
     * A pointer to another, functionally similar product (or multiple products).
     */
    @NotNull public Builder isSimilarTo(@NotNull Service.Builder service) {
      putValue("isSimilarTo", service.build());
      return this;
    }
    /**
     * A pointer to another, somehow related product (or multiple products).
     */
    @NotNull public Builder isRelatedTo(@NotNull Product product) {
      putValue("isRelatedTo", product);
      return this;
    }
    /**
     * A pointer to another, somehow related product (or multiple products).
     */
    @NotNull public Builder isRelatedTo(@NotNull Product.Builder product) {
      putValue("isRelatedTo", product.build());
      return this;
    }
    /**
     * A pointer to another, somehow related product (or multiple products).
     */
    @NotNull public Builder isRelatedTo(@NotNull Service service) {
      putValue("isRelatedTo", service);
      return this;
    }
    /**
     * A pointer to another, somehow related product (or multiple products).
     */
    @NotNull public Builder isRelatedTo(@NotNull Service.Builder service) {
      putValue("isRelatedTo", service.build());
      return this;
    }
    /**
     * An intended audience, i.e. a group for whom something was created.
     */
    @NotNull public Builder audience(@NotNull Audience audience) {
      putValue("audience", audience);
      return this;
    }
    /**
     * An intended audience, i.e. a group for whom something was created.
     */
    @NotNull public Builder audience(@NotNull Audience.Builder audience) {
      putValue("audience", audience.build());
      return this;
    }
    /**
     * The brand(s) associated with a product or service, or the brand(s) maintained by an organization or business person.
     */
    @NotNull public Builder brand(@NotNull Brand brand) {
      putValue("brand", brand);
      return this;
    }
    /**
     * The brand(s) associated with a product or service, or the brand(s) maintained by an organization or business person.
     */
    @NotNull public Builder brand(@NotNull Brand.Builder brand) {
      putValue("brand", brand.build());
      return this;
    }
    /**
     * The brand(s) associated with a product or service, or the brand(s) maintained by an organization or business person.
     */
    @NotNull public Builder brand(@NotNull Organization organization) {
      putValue("brand", organization);
      return this;
    }
    /**
     * The brand(s) associated with a product or service, or the brand(s) maintained by an organization or business person.
     */
    @NotNull public Builder brand(@NotNull Organization.Builder organization) {
      putValue("brand", organization.build());
      return this;
    }
    /**
     * Indicates the [NATO stock number](https://en.wikipedia.org/wiki/NATO_Stock_Number) (nsn) of a [[Product]]. 
     */
    @NotNull public Builder nsn(@NotNull String nsn) {
      putValue("nsn", nsn);
      return this;
    }
    /**
     * The product identifier, such as ISBN. For example: ``` meta itemprop=&quot;productID&quot; content=&quot;isbn:123-456-789&quot; ```.
     */
    @NotNull public Builder productID(@NotNull Identifier identifier) {
      putValue("productID", identifier);
      return this;
    }
    /**
     * Specifies a MerchantReturnPolicy that may be applicable.
     */
    @NotNull public Builder hasMerchantReturnPolicy(@NotNull MerchantReturnPolicy merchantReturnPolicy) {
      putValue("hasMerchantReturnPolicy", merchantReturnPolicy);
      return this;
    }
    /**
     * Specifies a MerchantReturnPolicy that may be applicable.
     */
    @NotNull public Builder hasMerchantReturnPolicy(@NotNull MerchantReturnPolicy.Builder merchantReturnPolicy) {
      putValue("hasMerchantReturnPolicy", merchantReturnPolicy.build());
      return this;
    }
    /**
     * The model of the product. Use with the URL of a ProductModel or a textual representation of the model identifier. The URL of the ProductModel can be from an external source. It is recommended to additionally provide strong product identifiers via the gtin8/gtin13/gtin14 and mpn properties.
     */
    @NotNull public Builder model(@NotNull ProductModel productModel) {
      putValue("model", productModel);
      return this;
    }
    /**
     * The model of the product. Use with the URL of a ProductModel or a textual representation of the model identifier. The URL of the ProductModel can be from an external source. It is recommended to additionally provide strong product identifiers via the gtin8/gtin13/gtin14 and mpn properties.
     */
    @NotNull public Builder model(@NotNull ProductModel.Builder productModel) {
      putValue("model", productModel.build());
      return this;
    }
    /**
     * The model of the product. Use with the URL of a ProductModel or a textual representation of the model identifier. The URL of the ProductModel can be from an external source. It is recommended to additionally provide strong product identifiers via the gtin8/gtin13/gtin14 and mpn properties.
     */
    @NotNull public Builder model(@NotNull String model) {
      putValue("model", model);
      return this;
    }
    /**
     * The place where the item (typically [[Product]]) was last processed and tested before importation.
     */
    @NotNull public Builder countryOfLastProcessing(@NotNull String countryOfLastProcessing) {
      putValue("countryOfLastProcessing", countryOfLastProcessing);
      return this;
    }
    /**
     * A category for the item. Greater signs or slashes can be used to informally indicate a category hierarchy.
     */
    @NotNull public Builder category(@NotNull Category category) {
      putValue("category", category);
      return this;
    }
    /**
     * The place where the product was assembled.
     */
    @NotNull public Builder countryOfAssembly(@NotNull String countryOfAssembly) {
      putValue("countryOfAssembly", countryOfAssembly);
      return this;
    }
    /**
     * A property-value pair representing an additional characteristics of the entitity, e.g. a product feature or another characteristic for which there is no matching property in schema.org.\n\nNote: Publishers should be aware that applications designed to use specific schema.org properties (e.g. http://schema.org/width, http://schema.org/color, http://schema.org/gtin13, ...) will typically expect such data to be provided using those properties, rather than using the generic property/value mechanism.
     * 
     */
    @NotNull public Builder additionalProperty(@NotNull PropertyValue propertyValue) {
      putValue("additionalProperty", propertyValue);
      return this;
    }
    /**
     * A property-value pair representing an additional characteristics of the entitity, e.g. a product feature or another characteristic for which there is no matching property in schema.org.\n\nNote: Publishers should be aware that applications designed to use specific schema.org properties (e.g. http://schema.org/width, http://schema.org/color, http://schema.org/gtin13, ...) will typically expect such data to be provided using those properties, rather than using the generic property/value mechanism.
     * 
     */
    @NotNull public Builder additionalProperty(@NotNull PropertyValue.Builder propertyValue) {
      putValue("additionalProperty", propertyValue.build());
      return this;
    }
    /**
     * A pointer to another product (or multiple products) for which this product is an accessory or spare part.
     */
    @NotNull public Builder isAccessoryOrSparePartFor(@NotNull Product product) {
      putValue("isAccessoryOrSparePartFor", product);
      return this;
    }
    /**
     * A pointer to another product (or multiple products) for which this product is an accessory or spare part.
     */
    @NotNull public Builder isAccessoryOrSparePartFor(@NotNull Product.Builder product) {
      putValue("isAccessoryOrSparePartFor", product.build());
      return this;
    }
    /**
     * The country of origin of something, including products as well as creative  works such as movie and TV content.
     * 
     * In the case of TV and movie, this would be the country of the principle offices of the production company or individual responsible for the movie. For other kinds of [[CreativeWork]] it is difficult to provide fully general guidance, and properties such as [[contentLocation]] and [[locationCreated]] may be more applicable.
     * 
     * In the case of products, the country of origin of the product. The exact interpretation of this may vary by context and product type, and cannot be fully enumerated here.
     */
    @NotNull public Builder countryOfOrigin(@NotNull Country country) {
      putValue("countryOfOrigin", country);
      return this;
    }
    /**
     * The country of origin of something, including products as well as creative  works such as movie and TV content.
     * 
     * In the case of TV and movie, this would be the country of the principle offices of the production company or individual responsible for the movie. For other kinds of [[CreativeWork]] it is difficult to provide fully general guidance, and properties such as [[contentLocation]] and [[locationCreated]] may be more applicable.
     * 
     * In the case of products, the country of origin of the product. The exact interpretation of this may vary by context and product type, and cannot be fully enumerated here.
     */
    @NotNull public Builder countryOfOrigin(@NotNull Country.Builder country) {
      putValue("countryOfOrigin", country.build());
      return this;
    }
    /**
     * The release date of a product or product model. This can be used to distinguish the exact variant of a product.
     */
    @NotNull public Builder releaseDate(@NotNull java.util.Date date) {
      putValue("releaseDate", date);
      return this;
    }
    /**
     * A review of the item.
     */
    @NotNull public Builder review(@NotNull Review review) {
      putValue("review", review);
      return this;
    }
    /**
     * A review of the item.
     */
    @NotNull public Builder review(@NotNull Review.Builder review) {
      putValue("review", review.build());
      return this;
    }
    /**
     * The date of production of the item, e.g. vehicle.
     */
    @NotNull public Builder productionDate(@NotNull java.util.Date date) {
      putValue("productionDate", date);
      return this;
    }
    /**
     * An award won by or for this item.
     */
    @NotNull public Builder award(@NotNull String award) {
      putValue("award", award);
      return this;
    }
    /**
     * The GTIN-8 code of the product, or the product to which the offer refers. This code is also known as EAN/UCC-8 or 8-digit EAN. See [GS1 GTIN Summary](http://www.gs1.org/barcodes/technical/idkeys/gtin) for more details.
     */
    @NotNull public Builder gtin8(@NotNull Gtin gtin) {
      putValue("gtin8", gtin);
      return this;
    }
    /**
     * The weight of the product or person.
     */
    @NotNull public Builder weight(@NotNull QuantitativeValue quantitativeValue) {
      putValue("weight", quantitativeValue);
      return this;
    }
    /**
     * The weight of the product or person.
     */
    @NotNull public Builder weight(@NotNull QuantitativeValue.Builder quantitativeValue) {
      putValue("weight", quantitativeValue.build());
      return this;
    }
    /**
     * Defines the energy efficiency Category (also known as &quot;class&quot; or &quot;rating&quot;) for a product according to an international energy efficiency standard.
     */
    @NotNull public Builder hasEnergyConsumptionDetails(@NotNull EnergyConsumptionDetails energyConsumptionDetails) {
      putValue("hasEnergyConsumptionDetails", energyConsumptionDetails);
      return this;
    }
    /**
     * Defines the energy efficiency Category (also known as &quot;class&quot; or &quot;rating&quot;) for a product according to an international energy efficiency standard.
     */
    @NotNull public Builder hasEnergyConsumptionDetails(@NotNull EnergyConsumptionDetails.Builder energyConsumptionDetails) {
      putValue("hasEnergyConsumptionDetails", energyConsumptionDetails.build());
      return this;
    }
    /**
     * A product measurement, for example the inseam of pants, the wheel size of a bicycle, or the gauge of a screw. Usually an exact measurement, but can also be a range of measurements for adjustable products, for example belts and ski bindings.
     */
    @NotNull public Builder hasMeasurement(@NotNull QuantitativeValue quantitativeValue) {
      putValue("hasMeasurement", quantitativeValue);
      return this;
    }
    /**
     * A product measurement, for example the inseam of pants, the wheel size of a bicycle, or the gauge of a screw. Usually an exact measurement, but can also be a range of measurements for adjustable products, for example belts and ski bindings.
     */
    @NotNull public Builder hasMeasurement(@NotNull QuantitativeValue.Builder quantitativeValue) {
      putValue("hasMeasurement", quantitativeValue.build());
      return this;
    }
    /**
     * A pointer to another product (or multiple products) for which this product is a consumable.
     */
    @NotNull public Builder isConsumableFor(@NotNull Product product) {
      putValue("isConsumableFor", product);
      return this;
    }
    /**
     * A pointer to another product (or multiple products) for which this product is a consumable.
     */
    @NotNull public Builder isConsumableFor(@NotNull Product.Builder product) {
      putValue("isConsumableFor", product.build());
      return this;
    }
    /**
     * The color of the product.
     */
    @NotNull public Builder color(@NotNull String color) {
      putValue("color", color);
      return this;
    }
    /**
     * A slogan or motto associated with the item.
     */
    @NotNull public Builder slogan(@NotNull String slogan) {
      putValue("slogan", slogan);
      return this;
    }
    /**
     * Indicates the kind of product that this is a variant of. In the case of [[ProductModel]], this is a pointer (from a ProductModel) to a base product from which this product is a variant. It is safe to infer that the variant inherits all product features from the base model, unless defined locally. This is not transitive. In the case of a [[ProductGroup]], the group description also serves as a template, representing a set of Products that vary on explicitly defined, specific dimensions only (so it defines both a set of variants, as well as which values distinguish amongst those variants). When used with [[ProductGroup]], this property can apply to any [[Product]] included in the group.
     */
    @NotNull public Builder isVariantOf(@NotNull ProductGroup productGroup) {
      putValue("isVariantOf", productGroup);
      return this;
    }
    /**
     * Indicates the kind of product that this is a variant of. In the case of [[ProductModel]], this is a pointer (from a ProductModel) to a base product from which this product is a variant. It is safe to infer that the variant inherits all product features from the base model, unless defined locally. This is not transitive. In the case of a [[ProductGroup]], the group description also serves as a template, representing a set of Products that vary on explicitly defined, specific dimensions only (so it defines both a set of variants, as well as which values distinguish amongst those variants). When used with [[ProductGroup]], this property can apply to any [[Product]] included in the group.
     */
    @NotNull public Builder isVariantOf(@NotNull ProductGroup.Builder productGroup) {
      putValue("isVariantOf", productGroup.build());
      return this;
    }
    /**
     * Indicates the kind of product that this is a variant of. In the case of [[ProductModel]], this is a pointer (from a ProductModel) to a base product from which this product is a variant. It is safe to infer that the variant inherits all product features from the base model, unless defined locally. This is not transitive. In the case of a [[ProductGroup]], the group description also serves as a template, representing a set of Products that vary on explicitly defined, specific dimensions only (so it defines both a set of variants, as well as which values distinguish amongst those variants). When used with [[ProductGroup]], this property can apply to any [[Product]] included in the group.
     */
    @NotNull public Builder isVariantOf(@NotNull ProductModel productModel) {
      putValue("isVariantOf", productModel);
      return this;
    }
    /**
     * Indicates the kind of product that this is a variant of. In the case of [[ProductModel]], this is a pointer (from a ProductModel) to a base product from which this product is a variant. It is safe to infer that the variant inherits all product features from the base model, unless defined locally. This is not transitive. In the case of a [[ProductGroup]], the group description also serves as a template, representing a set of Products that vary on explicitly defined, specific dimensions only (so it defines both a set of variants, as well as which values distinguish amongst those variants). When used with [[ProductGroup]], this property can apply to any [[Product]] included in the group.
     */
    @NotNull public Builder isVariantOf(@NotNull ProductModel.Builder productModel) {
      putValue("isVariantOf", productModel.build());
      return this;
    }
    /**
     * An offer to provide this item&amp;#x2014;for example, an offer to sell a product, rent the DVD of a movie, perform a service, or give away tickets to an event. Use [[businessFunction]] to indicate the kind of transaction offered, i.e. sell, lease, etc. This property can also be used to describe a [[Demand]]. While this property is listed as expected on a number of common types, it can be used in others. In that case, using a second type, such as Product or a subtype of Product, can clarify the nature of the offer.
     *       
     */
    @NotNull public Builder offers(@NotNull Demand demand) {
      putValue("offers", demand);
      return this;
    }
    /**
     * An offer to provide this item&amp;#x2014;for example, an offer to sell a product, rent the DVD of a movie, perform a service, or give away tickets to an event. Use [[businessFunction]] to indicate the kind of transaction offered, i.e. sell, lease, etc. This property can also be used to describe a [[Demand]]. While this property is listed as expected on a number of common types, it can be used in others. In that case, using a second type, such as Product or a subtype of Product, can clarify the nature of the offer.
     *       
     */
    @NotNull public Builder offers(@NotNull Demand.Builder demand) {
      putValue("offers", demand.build());
      return this;
    }
    /**
     * An offer to provide this item&amp;#x2014;for example, an offer to sell a product, rent the DVD of a movie, perform a service, or give away tickets to an event. Use [[businessFunction]] to indicate the kind of transaction offered, i.e. sell, lease, etc. This property can also be used to describe a [[Demand]]. While this property is listed as expected on a number of common types, it can be used in others. In that case, using a second type, such as Product or a subtype of Product, can clarify the nature of the offer.
     *       
     */
    @NotNull public Builder offers(@NotNull Offer offer) {
      putValue("offers", offer);
      return this;
    }
    /**
     * An offer to provide this item&amp;#x2014;for example, an offer to sell a product, rent the DVD of a movie, perform a service, or give away tickets to an event. Use [[businessFunction]] to indicate the kind of transaction offered, i.e. sell, lease, etc. This property can also be used to describe a [[Demand]]. While this property is listed as expected on a number of common types, it can be used in others. In that case, using a second type, such as Product or a subtype of Product, can clarify the nature of the offer.
     *       
     */
    @NotNull public Builder offers(@NotNull Offer.Builder offer) {
      putValue("offers", offer.build());
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
      if ("nsn".equals(key) && value instanceof String) { this.nsn((String)value); return; }
      if ("nsns".equals(key) && value instanceof String) { this.nsn((String)value); return; }
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
