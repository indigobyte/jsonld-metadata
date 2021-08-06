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
 * A MerchantReturnPolicy provides information about product return policies associated with an [[Organization]], [[Product]], or [[Offer]].
 */
public class MerchantReturnPolicy extends Intangible {
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
    final java.lang.Object current = myData.get("itemCondition");
    if (current == null) return Collections.emptyList();
    if (current instanceof java.util.Collection) {
      return (java.util.Collection<OfferItemCondition>) current;
    }
    return Arrays.asList((OfferItemCondition) current);
  }
  /**
   * Amount of shipping costs for product returns (for any reason). Applicable when property [[returnFees]] equals [[ReturnShippingFees]].
   */
  @JsonIgnore public MonetaryAmount getReturnShippingFeesAmount() {
    return (MonetaryAmount) getValue("returnShippingFeesAmount");
  }
  /**
   * Amount of shipping costs for product returns (for any reason). Applicable when property [[returnFees]] equals [[ReturnShippingFees]].
   */
  @JsonIgnore public java.util.Collection<MonetaryAmount> getReturnShippingFeesAmounts() {
    final java.lang.Object current = myData.get("returnShippingFeesAmount");
    if (current == null) return Collections.emptyList();
    if (current instanceof java.util.Collection) {
      return (java.util.Collection<MonetaryAmount>) current;
    }
    return Arrays.asList((MonetaryAmount) current);
  }
  /**
   * The type of return fees for returns of defect products.
   */
  @JsonIgnore public ReturnFeesEnumeration getItemDefectReturnFees() {
    return (ReturnFeesEnumeration) getValue("itemDefectReturnFees");
  }
  /**
   * The type of return fees for returns of defect products.
   */
  @JsonIgnore public java.util.Collection<ReturnFeesEnumeration> getItemDefectReturnFeess() {
    final java.lang.Object current = myData.get("itemDefectReturnFees");
    if (current == null) return Collections.emptyList();
    if (current instanceof java.util.Collection) {
      return (java.util.Collection<ReturnFeesEnumeration>) current;
    }
    return Arrays.asList((ReturnFeesEnumeration) current);
  }
  /**
   * Specifies a Web page or service by URL, for product returns.
   */
  @JsonIgnore public String getMerchantReturnLink() {
    return (String) getValue("merchantReturnLink");
  }
  /**
   * Specifies a Web page or service by URL, for product returns.
   */
  @JsonIgnore public java.util.Collection<String> getMerchantReturnLinks() {
    final java.lang.Object current = myData.get("merchantReturnLink");
    if (current == null) return Collections.emptyList();
    if (current instanceof java.util.Collection) {
      return (java.util.Collection<String>) current;
    }
    return Arrays.asList((String) current);
  }
  /**
   * Use [[MonetaryAmount]] to specify a fixed restocking fee for product returns, or use [[Number]] to specify a percentage of the product price paid by the customer.
   */
  @JsonIgnore public MonetaryAmount getRestockingFeeMonetaryAmount() {
    return (MonetaryAmount) getValue("restockingFee");
  }
  /**
   * Use [[MonetaryAmount]] to specify a fixed restocking fee for product returns, or use [[Number]] to specify a percentage of the product price paid by the customer.
   */
  @JsonIgnore public java.util.Collection<MonetaryAmount> getRestockingFeeMonetaryAmounts() {
    final java.lang.Object current = myData.get("restockingFee");
    if (current == null) return Collections.emptyList();
    if (current instanceof java.util.Collection) {
      return (java.util.Collection<MonetaryAmount>) current;
    }
    return Arrays.asList((MonetaryAmount) current);
  }
  /**
   * Use [[MonetaryAmount]] to specify a fixed restocking fee for product returns, or use [[Number]] to specify a percentage of the product price paid by the customer.
   */
  @JsonIgnore public Number getRestockingFeeNumber() {
    return (Number) getValue("restockingFee");
  }
  /**
   * Use [[MonetaryAmount]] to specify a fixed restocking fee for product returns, or use [[Number]] to specify a percentage of the product price paid by the customer.
   */
  @JsonIgnore public java.util.Collection<Number> getRestockingFeeNumbers() {
    final java.lang.Object current = myData.get("restockingFee");
    if (current == null) return Collections.emptyList();
    if (current instanceof java.util.Collection) {
      return (java.util.Collection<Number>) current;
    }
    return Arrays.asList((Number) current);
  }
  /**
   * The country where the product has to be sent to for returns, for example &quot;Ireland&quot; using the [[name]] property of [[Country]]. You can also provide the two-letter [ISO 3166-1 alpha-2 country code](http://en.wikipedia.org/wiki/ISO_3166-1). Note that this can be different from the country where the product was originally shipped from or sent too.
   */
  @JsonIgnore public Country getReturnPolicyCountryCountry() {
    return (Country) getValue("returnPolicyCountry");
  }
  /**
   * The country where the product has to be sent to for returns, for example &quot;Ireland&quot; using the [[name]] property of [[Country]]. You can also provide the two-letter [ISO 3166-1 alpha-2 country code](http://en.wikipedia.org/wiki/ISO_3166-1). Note that this can be different from the country where the product was originally shipped from or sent too.
   */
  @JsonIgnore public java.util.Collection<Country> getReturnPolicyCountryCountrys() {
    final java.lang.Object current = myData.get("returnPolicyCountry");
    if (current == null) return Collections.emptyList();
    if (current instanceof java.util.Collection) {
      return (java.util.Collection<Country>) current;
    }
    return Arrays.asList((Country) current);
  }
  /**
   * The country where the product has to be sent to for returns, for example &quot;Ireland&quot; using the [[name]] property of [[Country]]. You can also provide the two-letter [ISO 3166-1 alpha-2 country code](http://en.wikipedia.org/wiki/ISO_3166-1). Note that this can be different from the country where the product was originally shipped from or sent too.
   */
  @JsonIgnore public String getReturnPolicyCountryString() {
    return (String) getValue("returnPolicyCountry");
  }
  /**
   * The country where the product has to be sent to for returns, for example &quot;Ireland&quot; using the [[name]] property of [[Country]]. You can also provide the two-letter [ISO 3166-1 alpha-2 country code](http://en.wikipedia.org/wiki/ISO_3166-1). Note that this can be different from the country where the product was originally shipped from or sent too.
   */
  @JsonIgnore public java.util.Collection<String> getReturnPolicyCountryStrings() {
    final java.lang.Object current = myData.get("returnPolicyCountry");
    if (current == null) return Collections.emptyList();
    if (current instanceof java.util.Collection) {
      return (java.util.Collection<String>) current;
    }
    return Arrays.asList((String) current);
  }
  /**
   * The method (from an enumeration) by which the customer obtains a return shipping label for a product returned for any reason.
   */
  @JsonIgnore public ReturnLabelSourceEnumeration getReturnLabelSource() {
    return (ReturnLabelSourceEnumeration) getValue("returnLabelSource");
  }
  /**
   * The method (from an enumeration) by which the customer obtains a return shipping label for a product returned for any reason.
   */
  @JsonIgnore public java.util.Collection<ReturnLabelSourceEnumeration> getReturnLabelSources() {
    final java.lang.Object current = myData.get("returnLabelSource");
    if (current == null) return Collections.emptyList();
    if (current instanceof java.util.Collection) {
      return (java.util.Collection<ReturnLabelSourceEnumeration>) current;
    }
    return Arrays.asList((ReturnLabelSourceEnumeration) current);
  }
  /**
   * The type of return fees if the product is returned due to customer remorse.
   */
  @JsonIgnore public ReturnFeesEnumeration getCustomerRemorseReturnFees() {
    return (ReturnFeesEnumeration) getValue("customerRemorseReturnFees");
  }
  /**
   * The type of return fees if the product is returned due to customer remorse.
   */
  @JsonIgnore public java.util.Collection<ReturnFeesEnumeration> getCustomerRemorseReturnFeess() {
    final java.lang.Object current = myData.get("customerRemorseReturnFees");
    if (current == null) return Collections.emptyList();
    if (current instanceof java.util.Collection) {
      return (java.util.Collection<ReturnFeesEnumeration>) current;
    }
    return Arrays.asList((ReturnFeesEnumeration) current);
  }
  /**
   * The method (from an enumeration) by which the customer obtains a return shipping label for a defect product.
   */
  @JsonIgnore public ReturnLabelSourceEnumeration getItemDefectReturnLabelSource() {
    return (ReturnLabelSourceEnumeration) getValue("itemDefectReturnLabelSource");
  }
  /**
   * The method (from an enumeration) by which the customer obtains a return shipping label for a defect product.
   */
  @JsonIgnore public java.util.Collection<ReturnLabelSourceEnumeration> getItemDefectReturnLabelSources() {
    final java.lang.Object current = myData.get("itemDefectReturnLabelSource");
    if (current == null) return Collections.emptyList();
    if (current instanceof java.util.Collection) {
      return (java.util.Collection<ReturnLabelSourceEnumeration>) current;
    }
    return Arrays.asList((ReturnLabelSourceEnumeration) current);
  }
  /**
   * The method (from an enumeration) by which the customer obtains a return shipping label for a product returned due to customer remorse.
   */
  @JsonIgnore public ReturnLabelSourceEnumeration getCustomerRemorseReturnLabelSource() {
    return (ReturnLabelSourceEnumeration) getValue("customerRemorseReturnLabelSource");
  }
  /**
   * The method (from an enumeration) by which the customer obtains a return shipping label for a product returned due to customer remorse.
   */
  @JsonIgnore public java.util.Collection<ReturnLabelSourceEnumeration> getCustomerRemorseReturnLabelSources() {
    final java.lang.Object current = myData.get("customerRemorseReturnLabelSource");
    if (current == null) return Collections.emptyList();
    if (current instanceof java.util.Collection) {
      return (java.util.Collection<ReturnLabelSourceEnumeration>) current;
    }
    return Arrays.asList((ReturnLabelSourceEnumeration) current);
  }
  /**
   * A refund type, from an enumerated list.
   */
  @JsonIgnore public RefundTypeEnumeration getRefundType() {
    return (RefundTypeEnumeration) getValue("refundType");
  }
  /**
   * A refund type, from an enumerated list.
   */
  @JsonIgnore public java.util.Collection<RefundTypeEnumeration> getRefundTypes() {
    final java.lang.Object current = myData.get("refundType");
    if (current == null) return Collections.emptyList();
    if (current instanceof java.util.Collection) {
      return (java.util.Collection<RefundTypeEnumeration>) current;
    }
    return Arrays.asList((RefundTypeEnumeration) current);
  }
  /**
   * Are in-store returns offered? (for more advanced return methods use the [[returnMethod]] property)
   */
  @JsonIgnore public Boolean getInStoreReturnsOffered() {
    return (Boolean) getValue("inStoreReturnsOffered");
  }
  /**
   * Are in-store returns offered? (for more advanced return methods use the [[returnMethod]] property)
   */
  @JsonIgnore public java.util.Collection<Boolean> getInStoreReturnsOffereds() {
    final java.lang.Object current = myData.get("inStoreReturnsOffered");
    if (current == null) return Collections.emptyList();
    if (current instanceof java.util.Collection) {
      return (java.util.Collection<Boolean>) current;
    }
    return Arrays.asList((Boolean) current);
  }
  /**
   * The type of return method offered, specified from an enumeration.
   */
  @JsonIgnore public ReturnMethodEnumeration getReturnMethod() {
    return (ReturnMethodEnumeration) getValue("returnMethod");
  }
  /**
   * The type of return method offered, specified from an enumeration.
   */
  @JsonIgnore public java.util.Collection<ReturnMethodEnumeration> getReturnMethods() {
    final java.lang.Object current = myData.get("returnMethod");
    if (current == null) return Collections.emptyList();
    if (current instanceof java.util.Collection) {
      return (java.util.Collection<ReturnMethodEnumeration>) current;
    }
    return Arrays.asList((ReturnMethodEnumeration) current);
  }
  /**
   * Seasonal override of a return policy.
   */
  @JsonIgnore public MerchantReturnPolicySeasonalOverride getReturnPolicySeasonalOverride() {
    return (MerchantReturnPolicySeasonalOverride) getValue("returnPolicySeasonalOverride");
  }
  /**
   * Seasonal override of a return policy.
   */
  @JsonIgnore public java.util.Collection<MerchantReturnPolicySeasonalOverride> getReturnPolicySeasonalOverrides() {
    final java.lang.Object current = myData.get("returnPolicySeasonalOverride");
    if (current == null) return Collections.emptyList();
    if (current instanceof java.util.Collection) {
      return (java.util.Collection<MerchantReturnPolicySeasonalOverride>) current;
    }
    return Arrays.asList((MerchantReturnPolicySeasonalOverride) current);
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
    final java.lang.Object current = myData.get("additionalProperty");
    if (current == null) return Collections.emptyList();
    if (current instanceof java.util.Collection) {
      return (java.util.Collection<PropertyValue>) current;
    }
    return Arrays.asList((PropertyValue) current);
  }
  /**
   * Specifies either a fixed return date or the number of days (from the delivery date) that a product can be returned. Used when the [[returnPolicyCategory]] property is specified as [[MerchantReturnFiniteReturnWindow]].
   */
  @JsonIgnore public Integer getMerchantReturnDaysInteger() {
    return (Integer) getValue("merchantReturnDays");
  }
  /**
   * Specifies either a fixed return date or the number of days (from the delivery date) that a product can be returned. Used when the [[returnPolicyCategory]] property is specified as [[MerchantReturnFiniteReturnWindow]].
   */
  @JsonIgnore public java.util.Collection<Integer> getMerchantReturnDaysIntegers() {
    final java.lang.Object current = myData.get("merchantReturnDays");
    if (current == null) return Collections.emptyList();
    if (current instanceof java.util.Collection) {
      return (java.util.Collection<Integer>) current;
    }
    return Arrays.asList((Integer) current);
  }
  /**
   * Specifies either a fixed return date or the number of days (from the delivery date) that a product can be returned. Used when the [[returnPolicyCategory]] property is specified as [[MerchantReturnFiniteReturnWindow]].
   */
  @JsonIgnore public java.util.Date getMerchantReturnDaysDate() {
    return (java.util.Date) getValue("merchantReturnDays");
  }
  /**
   * Specifies either a fixed return date or the number of days (from the delivery date) that a product can be returned. Used when the [[returnPolicyCategory]] property is specified as [[MerchantReturnFiniteReturnWindow]].
   */
  @JsonIgnore public java.util.Collection<java.util.Date> getMerchantReturnDaysDates() {
    final java.lang.Object current = myData.get("merchantReturnDays");
    if (current == null) return Collections.emptyList();
    if (current instanceof java.util.Collection) {
      return (java.util.Collection<java.util.Date>) current;
    }
    return Arrays.asList((java.util.Date) current);
  }
  /**
   * The amount of shipping costs if a product is returned due to customer remorse. Applicable when property [[customerRemorseReturnFees]] equals [[ReturnShippingFees]].
   */
  @JsonIgnore public MonetaryAmount getCustomerRemorseReturnShippingFeesAmount() {
    return (MonetaryAmount) getValue("customerRemorseReturnShippingFeesAmount");
  }
  /**
   * The amount of shipping costs if a product is returned due to customer remorse. Applicable when property [[customerRemorseReturnFees]] equals [[ReturnShippingFees]].
   */
  @JsonIgnore public java.util.Collection<MonetaryAmount> getCustomerRemorseReturnShippingFeesAmounts() {
    final java.lang.Object current = myData.get("customerRemorseReturnShippingFeesAmount");
    if (current == null) return Collections.emptyList();
    if (current instanceof java.util.Collection) {
      return (java.util.Collection<MonetaryAmount>) current;
    }
    return Arrays.asList((MonetaryAmount) current);
  }
  /**
   * The type of return fees for purchased products (for any return reason)
   */
  @JsonIgnore public ReturnFeesEnumeration getReturnFees() {
    return (ReturnFeesEnumeration) getValue("returnFees");
  }
  /**
   * The type of return fees for purchased products (for any return reason)
   */
  @JsonIgnore public java.util.Collection<ReturnFeesEnumeration> getReturnFeess() {
    final java.lang.Object current = myData.get("returnFees");
    if (current == null) return Collections.emptyList();
    if (current instanceof java.util.Collection) {
      return (java.util.Collection<ReturnFeesEnumeration>) current;
    }
    return Arrays.asList((ReturnFeesEnumeration) current);
  }
  /**
   * Specifies an applicable return policy (from an enumeration).
   */
  @JsonIgnore public MerchantReturnEnumeration getReturnPolicyCategory() {
    return (MerchantReturnEnumeration) getValue("returnPolicyCategory");
  }
  /**
   * Specifies an applicable return policy (from an enumeration).
   */
  @JsonIgnore public java.util.Collection<MerchantReturnEnumeration> getReturnPolicyCategorys() {
    final java.lang.Object current = myData.get("returnPolicyCategory");
    if (current == null) return Collections.emptyList();
    if (current instanceof java.util.Collection) {
      return (java.util.Collection<MerchantReturnEnumeration>) current;
    }
    return Arrays.asList((MerchantReturnEnumeration) current);
  }
  /**
   * Amount of shipping costs for defect product returns. Applicable when property [[itemDefectReturnFees]] equals [[ReturnShippingFees]].
   */
  @JsonIgnore public MonetaryAmount getItemDefectReturnShippingFeesAmount() {
    return (MonetaryAmount) getValue("itemDefectReturnShippingFeesAmount");
  }
  /**
   * Amount of shipping costs for defect product returns. Applicable when property [[itemDefectReturnFees]] equals [[ReturnShippingFees]].
   */
  @JsonIgnore public java.util.Collection<MonetaryAmount> getItemDefectReturnShippingFeesAmounts() {
    final java.lang.Object current = myData.get("itemDefectReturnShippingFeesAmount");
    if (current == null) return Collections.emptyList();
    if (current instanceof java.util.Collection) {
      return (java.util.Collection<MonetaryAmount>) current;
    }
    return Arrays.asList((MonetaryAmount) current);
  }
  protected MerchantReturnPolicy(java.util.Map<String,java.lang.Object> data) {
    super(data);
  }
  
  /**
   * Builder for {@link MerchantReturnPolicy}
   */
  public static class Builder extends Intangible.Builder {
    public Builder(@NotNull HashMap<String,java.lang.Object> data) {
      super(data);
    }
    @NotNull public MerchantReturnPolicy build() {
      return new MerchantReturnPolicy(myData);
    }
    /**
     * A predefined value from OfferItemCondition specifying the condition of the product or service, or the products or services included in the offer. Also used for product return policies to specify the condition of products accepted for returns.
     */
    @NotNull public Builder itemCondition(@NotNull OfferItemCondition offerItemCondition) {
      putValue("itemCondition", offerItemCondition);
      return this;
    }
    /**
     * Amount of shipping costs for product returns (for any reason). Applicable when property [[returnFees]] equals [[ReturnShippingFees]].
     */
    @NotNull public Builder returnShippingFeesAmount(@NotNull MonetaryAmount monetaryAmount) {
      putValue("returnShippingFeesAmount", monetaryAmount);
      return this;
    }
    /**
     * Amount of shipping costs for product returns (for any reason). Applicable when property [[returnFees]] equals [[ReturnShippingFees]].
     */
    @NotNull public Builder returnShippingFeesAmount(@NotNull MonetaryAmount.Builder monetaryAmount) {
      putValue("returnShippingFeesAmount", monetaryAmount.build());
      return this;
    }
    /**
     * The type of return fees for returns of defect products.
     */
    @NotNull public Builder itemDefectReturnFees(@NotNull ReturnFeesEnumeration returnFeesEnumeration) {
      putValue("itemDefectReturnFees", returnFeesEnumeration);
      return this;
    }
    /**
     * Specifies a Web page or service by URL, for product returns.
     */
    @NotNull public Builder merchantReturnLink(@NotNull String merchantReturnLink) {
      putValue("merchantReturnLink", merchantReturnLink);
      return this;
    }
    /**
     * Use [[MonetaryAmount]] to specify a fixed restocking fee for product returns, or use [[Number]] to specify a percentage of the product price paid by the customer.
     */
    @NotNull public Builder restockingFee(@NotNull MonetaryAmount monetaryAmount) {
      putValue("restockingFee", monetaryAmount);
      return this;
    }
    /**
     * Use [[MonetaryAmount]] to specify a fixed restocking fee for product returns, or use [[Number]] to specify a percentage of the product price paid by the customer.
     */
    @NotNull public Builder restockingFee(@NotNull MonetaryAmount.Builder monetaryAmount) {
      putValue("restockingFee", monetaryAmount.build());
      return this;
    }
    /**
     * Use [[MonetaryAmount]] to specify a fixed restocking fee for product returns, or use [[Number]] to specify a percentage of the product price paid by the customer.
     */
    @NotNull public Builder restockingFee(@NotNull Number number) {
      putValue("restockingFee", number);
      return this;
    }
    /**
     * The country where the product has to be sent to for returns, for example &quot;Ireland&quot; using the [[name]] property of [[Country]]. You can also provide the two-letter [ISO 3166-1 alpha-2 country code](http://en.wikipedia.org/wiki/ISO_3166-1). Note that this can be different from the country where the product was originally shipped from or sent too.
     */
    @NotNull public Builder returnPolicyCountry(@NotNull Country country) {
      putValue("returnPolicyCountry", country);
      return this;
    }
    /**
     * The country where the product has to be sent to for returns, for example &quot;Ireland&quot; using the [[name]] property of [[Country]]. You can also provide the two-letter [ISO 3166-1 alpha-2 country code](http://en.wikipedia.org/wiki/ISO_3166-1). Note that this can be different from the country where the product was originally shipped from or sent too.
     */
    @NotNull public Builder returnPolicyCountry(@NotNull Country.Builder country) {
      putValue("returnPolicyCountry", country.build());
      return this;
    }
    /**
     * The country where the product has to be sent to for returns, for example &quot;Ireland&quot; using the [[name]] property of [[Country]]. You can also provide the two-letter [ISO 3166-1 alpha-2 country code](http://en.wikipedia.org/wiki/ISO_3166-1). Note that this can be different from the country where the product was originally shipped from or sent too.
     */
    @NotNull public Builder returnPolicyCountry(@NotNull String returnPolicyCountry) {
      putValue("returnPolicyCountry", returnPolicyCountry);
      return this;
    }
    /**
     * The method (from an enumeration) by which the customer obtains a return shipping label for a product returned for any reason.
     */
    @NotNull public Builder returnLabelSource(@NotNull ReturnLabelSourceEnumeration returnLabelSourceEnumeration) {
      putValue("returnLabelSource", returnLabelSourceEnumeration);
      return this;
    }
    /**
     * The type of return fees if the product is returned due to customer remorse.
     */
    @NotNull public Builder customerRemorseReturnFees(@NotNull ReturnFeesEnumeration returnFeesEnumeration) {
      putValue("customerRemorseReturnFees", returnFeesEnumeration);
      return this;
    }
    /**
     * The method (from an enumeration) by which the customer obtains a return shipping label for a defect product.
     */
    @NotNull public Builder itemDefectReturnLabelSource(@NotNull ReturnLabelSourceEnumeration returnLabelSourceEnumeration) {
      putValue("itemDefectReturnLabelSource", returnLabelSourceEnumeration);
      return this;
    }
    /**
     * The method (from an enumeration) by which the customer obtains a return shipping label for a product returned due to customer remorse.
     */
    @NotNull public Builder customerRemorseReturnLabelSource(@NotNull ReturnLabelSourceEnumeration returnLabelSourceEnumeration) {
      putValue("customerRemorseReturnLabelSource", returnLabelSourceEnumeration);
      return this;
    }
    /**
     * A refund type, from an enumerated list.
     */
    @NotNull public Builder refundType(@NotNull RefundTypeEnumeration refundTypeEnumeration) {
      putValue("refundType", refundTypeEnumeration);
      return this;
    }
    /**
     * Are in-store returns offered? (for more advanced return methods use the [[returnMethod]] property)
     */
    @NotNull public Builder inStoreReturnsOffered(@NotNull Boolean inStoreReturnsOffered) {
      putValue("inStoreReturnsOffered", inStoreReturnsOffered);
      return this;
    }
    /**
     * The type of return method offered, specified from an enumeration.
     */
    @NotNull public Builder returnMethod(@NotNull ReturnMethodEnumeration returnMethodEnumeration) {
      putValue("returnMethod", returnMethodEnumeration);
      return this;
    }
    /**
     * Seasonal override of a return policy.
     */
    @NotNull public Builder returnPolicySeasonalOverride(@NotNull MerchantReturnPolicySeasonalOverride merchantReturnPolicySeasonalOverride) {
      putValue("returnPolicySeasonalOverride", merchantReturnPolicySeasonalOverride);
      return this;
    }
    /**
     * Seasonal override of a return policy.
     */
    @NotNull public Builder returnPolicySeasonalOverride(@NotNull MerchantReturnPolicySeasonalOverride.Builder merchantReturnPolicySeasonalOverride) {
      putValue("returnPolicySeasonalOverride", merchantReturnPolicySeasonalOverride.build());
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
     * Specifies either a fixed return date or the number of days (from the delivery date) that a product can be returned. Used when the [[returnPolicyCategory]] property is specified as [[MerchantReturnFiniteReturnWindow]].
     */
    @NotNull public Builder merchantReturnDays(@NotNull Integer integer) {
      putValue("merchantReturnDays", integer);
      return this;
    }
    /**
     * Specifies either a fixed return date or the number of days (from the delivery date) that a product can be returned. Used when the [[returnPolicyCategory]] property is specified as [[MerchantReturnFiniteReturnWindow]].
     */
    @NotNull public Builder merchantReturnDays(@NotNull java.util.Date date) {
      putValue("merchantReturnDays", date);
      return this;
    }
    /**
     * The amount of shipping costs if a product is returned due to customer remorse. Applicable when property [[customerRemorseReturnFees]] equals [[ReturnShippingFees]].
     */
    @NotNull public Builder customerRemorseReturnShippingFeesAmount(@NotNull MonetaryAmount monetaryAmount) {
      putValue("customerRemorseReturnShippingFeesAmount", monetaryAmount);
      return this;
    }
    /**
     * The amount of shipping costs if a product is returned due to customer remorse. Applicable when property [[customerRemorseReturnFees]] equals [[ReturnShippingFees]].
     */
    @NotNull public Builder customerRemorseReturnShippingFeesAmount(@NotNull MonetaryAmount.Builder monetaryAmount) {
      putValue("customerRemorseReturnShippingFeesAmount", monetaryAmount.build());
      return this;
    }
    /**
     * The type of return fees for purchased products (for any return reason)
     */
    @NotNull public Builder returnFees(@NotNull ReturnFeesEnumeration returnFeesEnumeration) {
      putValue("returnFees", returnFeesEnumeration);
      return this;
    }
    /**
     * Specifies an applicable return policy (from an enumeration).
     */
    @NotNull public Builder returnPolicyCategory(@NotNull MerchantReturnEnumeration merchantReturnEnumeration) {
      putValue("returnPolicyCategory", merchantReturnEnumeration);
      return this;
    }
    /**
     * Amount of shipping costs for defect product returns. Applicable when property [[itemDefectReturnFees]] equals [[ReturnShippingFees]].
     */
    @NotNull public Builder itemDefectReturnShippingFeesAmount(@NotNull MonetaryAmount monetaryAmount) {
      putValue("itemDefectReturnShippingFeesAmount", monetaryAmount);
      return this;
    }
    /**
     * Amount of shipping costs for defect product returns. Applicable when property [[itemDefectReturnFees]] equals [[ReturnShippingFees]].
     */
    @NotNull public Builder itemDefectReturnShippingFeesAmount(@NotNull MonetaryAmount.Builder monetaryAmount) {
      putValue("itemDefectReturnShippingFeesAmount", monetaryAmount.build());
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
      if ("itemCondition".equals(key) && value instanceof OfferItemCondition) { this.itemCondition((OfferItemCondition)value); return; }
      if ("itemConditions".equals(key) && value instanceof OfferItemCondition) { this.itemCondition((OfferItemCondition)value); return; }
      if ("returnShippingFeesAmount".equals(key) && value instanceof MonetaryAmount) { this.returnShippingFeesAmount((MonetaryAmount)value); return; }
      if ("returnShippingFeesAmounts".equals(key) && value instanceof MonetaryAmount) { this.returnShippingFeesAmount((MonetaryAmount)value); return; }
      if ("itemDefectReturnFees".equals(key) && value instanceof ReturnFeesEnumeration) { this.itemDefectReturnFees((ReturnFeesEnumeration)value); return; }
      if ("itemDefectReturnFeess".equals(key) && value instanceof ReturnFeesEnumeration) { this.itemDefectReturnFees((ReturnFeesEnumeration)value); return; }
      if ("merchantReturnLink".equals(key) && value instanceof String) { this.merchantReturnLink((String)value); return; }
      if ("merchantReturnLinks".equals(key) && value instanceof String) { this.merchantReturnLink((String)value); return; }
      if ("restockingFee".equals(key) && value instanceof MonetaryAmount) { this.restockingFee((MonetaryAmount)value); return; }
      if ("restockingFees".equals(key) && value instanceof MonetaryAmount) { this.restockingFee((MonetaryAmount)value); return; }
      if ("restockingFee".equals(key) && value instanceof Number) { this.restockingFee((Number)value); return; }
      if ("restockingFees".equals(key) && value instanceof Number) { this.restockingFee((Number)value); return; }
      if ("returnPolicyCountry".equals(key) && value instanceof Country) { this.returnPolicyCountry((Country)value); return; }
      if ("returnPolicyCountrys".equals(key) && value instanceof Country) { this.returnPolicyCountry((Country)value); return; }
      if ("returnPolicyCountry".equals(key) && value instanceof String) { this.returnPolicyCountry((String)value); return; }
      if ("returnPolicyCountrys".equals(key) && value instanceof String) { this.returnPolicyCountry((String)value); return; }
      if ("returnLabelSource".equals(key) && value instanceof ReturnLabelSourceEnumeration) { this.returnLabelSource((ReturnLabelSourceEnumeration)value); return; }
      if ("returnLabelSources".equals(key) && value instanceof ReturnLabelSourceEnumeration) { this.returnLabelSource((ReturnLabelSourceEnumeration)value); return; }
      if ("customerRemorseReturnFees".equals(key) && value instanceof ReturnFeesEnumeration) { this.customerRemorseReturnFees((ReturnFeesEnumeration)value); return; }
      if ("customerRemorseReturnFeess".equals(key) && value instanceof ReturnFeesEnumeration) { this.customerRemorseReturnFees((ReturnFeesEnumeration)value); return; }
      if ("itemDefectReturnLabelSource".equals(key) && value instanceof ReturnLabelSourceEnumeration) { this.itemDefectReturnLabelSource((ReturnLabelSourceEnumeration)value); return; }
      if ("itemDefectReturnLabelSources".equals(key) && value instanceof ReturnLabelSourceEnumeration) { this.itemDefectReturnLabelSource((ReturnLabelSourceEnumeration)value); return; }
      if ("customerRemorseReturnLabelSource".equals(key) && value instanceof ReturnLabelSourceEnumeration) { this.customerRemorseReturnLabelSource((ReturnLabelSourceEnumeration)value); return; }
      if ("customerRemorseReturnLabelSources".equals(key) && value instanceof ReturnLabelSourceEnumeration) { this.customerRemorseReturnLabelSource((ReturnLabelSourceEnumeration)value); return; }
      if ("refundType".equals(key) && value instanceof RefundTypeEnumeration) { this.refundType((RefundTypeEnumeration)value); return; }
      if ("refundTypes".equals(key) && value instanceof RefundTypeEnumeration) { this.refundType((RefundTypeEnumeration)value); return; }
      if ("inStoreReturnsOffered".equals(key) && value instanceof Boolean) { this.inStoreReturnsOffered((Boolean)value); return; }
      if ("inStoreReturnsOffereds".equals(key) && value instanceof Boolean) { this.inStoreReturnsOffered((Boolean)value); return; }
      if ("returnMethod".equals(key) && value instanceof ReturnMethodEnumeration) { this.returnMethod((ReturnMethodEnumeration)value); return; }
      if ("returnMethods".equals(key) && value instanceof ReturnMethodEnumeration) { this.returnMethod((ReturnMethodEnumeration)value); return; }
      if ("returnPolicySeasonalOverride".equals(key) && value instanceof MerchantReturnPolicySeasonalOverride) { this.returnPolicySeasonalOverride((MerchantReturnPolicySeasonalOverride)value); return; }
      if ("returnPolicySeasonalOverrides".equals(key) && value instanceof MerchantReturnPolicySeasonalOverride) { this.returnPolicySeasonalOverride((MerchantReturnPolicySeasonalOverride)value); return; }
      if ("additionalProperty".equals(key) && value instanceof PropertyValue) { this.additionalProperty((PropertyValue)value); return; }
      if ("additionalPropertys".equals(key) && value instanceof PropertyValue) { this.additionalProperty((PropertyValue)value); return; }
      if ("merchantReturnDays".equals(key) && value instanceof Integer) { this.merchantReturnDays((Integer)value); return; }
      if ("merchantReturnDayss".equals(key) && value instanceof Integer) { this.merchantReturnDays((Integer)value); return; }
      if ("merchantReturnDays".equals(key) && value instanceof java.util.Date) { this.merchantReturnDays((java.util.Date)value); return; }
      if ("merchantReturnDayss".equals(key) && value instanceof java.util.Date) { this.merchantReturnDays((java.util.Date)value); return; }
      if ("customerRemorseReturnShippingFeesAmount".equals(key) && value instanceof MonetaryAmount) { this.customerRemorseReturnShippingFeesAmount((MonetaryAmount)value); return; }
      if ("customerRemorseReturnShippingFeesAmounts".equals(key) && value instanceof MonetaryAmount) { this.customerRemorseReturnShippingFeesAmount((MonetaryAmount)value); return; }
      if ("returnFees".equals(key) && value instanceof ReturnFeesEnumeration) { this.returnFees((ReturnFeesEnumeration)value); return; }
      if ("returnFeess".equals(key) && value instanceof ReturnFeesEnumeration) { this.returnFees((ReturnFeesEnumeration)value); return; }
      if ("returnPolicyCategory".equals(key) && value instanceof MerchantReturnEnumeration) { this.returnPolicyCategory((MerchantReturnEnumeration)value); return; }
      if ("returnPolicyCategorys".equals(key) && value instanceof MerchantReturnEnumeration) { this.returnPolicyCategory((MerchantReturnEnumeration)value); return; }
      if ("itemDefectReturnShippingFeesAmount".equals(key) && value instanceof MonetaryAmount) { this.itemDefectReturnShippingFeesAmount((MonetaryAmount)value); return; }
      if ("itemDefectReturnShippingFeesAmounts".equals(key) && value instanceof MonetaryAmount) { this.itemDefectReturnShippingFeesAmount((MonetaryAmount)value); return; }
      super.fromMap(key, value);
    }
  }
  
}
