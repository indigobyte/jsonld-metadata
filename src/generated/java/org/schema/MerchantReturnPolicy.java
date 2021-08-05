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
 * A MerchantReturnPolicy provides information about product return policies associated with an &lt;a class=&quot;localLink&quot; href=&quot;http://schema.org/Organization&quot;&gt;Organization&lt;/a&gt; or &lt;a class=&quot;localLink&quot; href=&quot;http://schema.org/Product&quot;&gt;Product&lt;/a&gt;.Source: https://github.com/schemaorg/schemaorg/issues/2288
 */
public class MerchantReturnPolicy extends Intangible {
  /**
   * The merchantReturnDays property indicates the number of days (from purchase) within which relevant merchant return policy is applicable.
   */
  @JsonIgnore public Integer getMerchantReturnDays() {
    return (Integer) getValue("merchantReturnDays");
  }
  /**
   * The merchantReturnDays property indicates the number of days (from purchase) within which relevant merchant return policy is applicable.
   */
  @JsonIgnore public Collection<Integer> getMerchantReturnDayss() {
    final Object current = myData.get("merchantReturnDays");
    if (current == null) return Collections.emptyList();
    if (current instanceof Collection) {
      return (Collection<Integer>) current;
    }
    return Arrays.asList((Integer) current);
  }
  /**
   * A refundType, from an enumerated list.
   */
  @JsonIgnore public RefundTypeEnumeration getRefundType() {
    return (RefundTypeEnumeration) getValue("refundType");
  }
  /**
   * A refundType, from an enumerated list.
   */
  @JsonIgnore public Collection<RefundTypeEnumeration> getRefundTypes() {
    final Object current = myData.get("refundType");
    if (current == null) return Collections.emptyList();
    if (current instanceof Collection) {
      return (Collection<RefundTypeEnumeration>) current;
    }
    return Arrays.asList((RefundTypeEnumeration) current);
  }
  /**
   * Are in-store returns offered?
   */
  @JsonIgnore public Boolean getInStoreReturnsOffered() {
    return (Boolean) getValue("inStoreReturnsOffered");
  }
  /**
   * Are in-store returns offered?
   */
  @JsonIgnore public Collection<Boolean> getInStoreReturnsOffereds() {
    final Object current = myData.get("inStoreReturnsOffered");
    if (current == null) return Collections.emptyList();
    if (current instanceof Collection) {
      return (Collection<Boolean>) current;
    }
    return Arrays.asList((Boolean) current);
  }
  /**
   * Indicates (via enumerated options) the return fees policy for a MerchantReturnPolicy
   */
  @JsonIgnore public ReturnFeesEnumeration getReturnFees() {
    return (ReturnFeesEnumeration) getValue("returnFees");
  }
  /**
   * Indicates (via enumerated options) the return fees policy for a MerchantReturnPolicy
   */
  @JsonIgnore public Collection<ReturnFeesEnumeration> getReturnFeess() {
    final Object current = myData.get("returnFees");
    if (current == null) return Collections.emptyList();
    if (current instanceof Collection) {
      return (Collection<ReturnFeesEnumeration>) current;
    }
    return Arrays.asList((ReturnFeesEnumeration) current);
  }
  /**
   * Indicates a Web page or service by URL, for product return.
   */
  @JsonIgnore public String getMerchantReturnLink() {
    return (String) getValue("merchantReturnLink");
  }
  /**
   * Indicates a Web page or service by URL, for product return.
   */
  @JsonIgnore public Collection<String> getMerchantReturnLinks() {
    final Object current = myData.get("merchantReturnLink");
    if (current == null) return Collections.emptyList();
    if (current instanceof Collection) {
      return (Collection<String>) current;
    }
    return Arrays.asList((String) current);
  }
  /**
   * A returnPolicyCategory expresses at most one of several enumerated kinds of return.
   */
  @JsonIgnore public MerchantReturnEnumeration getReturnPolicyCategory() {
    return (MerchantReturnEnumeration) getValue("returnPolicyCategory");
  }
  /**
   * A returnPolicyCategory expresses at most one of several enumerated kinds of return.
   */
  @JsonIgnore public Collection<MerchantReturnEnumeration> getReturnPolicyCategorys() {
    final Object current = myData.get("returnPolicyCategory");
    if (current == null) return Collections.emptyList();
    if (current instanceof Collection) {
      return (Collection<MerchantReturnEnumeration>) current;
    }
    return Arrays.asList((MerchantReturnEnumeration) current);
  }
  protected MerchantReturnPolicy(java.util.Map<String,Object> data) {
    super(data);
  }
  
  /**
   * Builder for {@link MerchantReturnPolicy}
   */
  public static class Builder extends Intangible.Builder {
    public Builder(@NotNull HashMap<String,Object> data) {
      super(data);
    }
    @NotNull public MerchantReturnPolicy build() {
      return new MerchantReturnPolicy(myData);
    }
    /**
     * The merchantReturnDays property indicates the number of days (from purchase) within which relevant merchant return policy is applicable.
     */
    @NotNull public Builder merchantReturnDays(@NotNull Integer integer) {
      putValue("merchantReturnDays", integer);
      return this;
    }
    /**
     * A refundType, from an enumerated list.
     */
    @NotNull public Builder refundType(@NotNull RefundTypeEnumeration refundTypeEnumeration) {
      putValue("refundType", refundTypeEnumeration);
      return this;
    }
    /**
     * Are in-store returns offered?
     */
    @NotNull public Builder inStoreReturnsOffered(@NotNull Boolean inStoreReturnsOffered) {
      putValue("inStoreReturnsOffered", inStoreReturnsOffered);
      return this;
    }
    /**
     * Indicates (via enumerated options) the return fees policy for a MerchantReturnPolicy
     */
    @NotNull public Builder returnFees(@NotNull ReturnFeesEnumeration returnFeesEnumeration) {
      putValue("returnFees", returnFeesEnumeration);
      return this;
    }
    /**
     * Indicates a Web page or service by URL, for product return.
     */
    @NotNull public Builder merchantReturnLink(@NotNull String merchantReturnLink) {
      putValue("merchantReturnLink", merchantReturnLink);
      return this;
    }
    /**
     * A returnPolicyCategory expresses at most one of several enumerated kinds of return.
     */
    @NotNull public Builder returnPolicyCategory(@NotNull MerchantReturnEnumeration merchantReturnEnumeration) {
      putValue("returnPolicyCategory", merchantReturnEnumeration);
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
      if ("merchantReturnDays".equals(key) && value instanceof Integer) { this.merchantReturnDays((Integer)value); return; }
      if ("merchantReturnDayss".equals(key) && value instanceof Integer) { this.merchantReturnDays((Integer)value); return; }
      if ("refundType".equals(key) && value instanceof RefundTypeEnumeration) { this.refundType((RefundTypeEnumeration)value); return; }
      if ("refundTypes".equals(key) && value instanceof RefundTypeEnumeration) { this.refundType((RefundTypeEnumeration)value); return; }
      if ("inStoreReturnsOffered".equals(key) && value instanceof Boolean) { this.inStoreReturnsOffered((Boolean)value); return; }
      if ("inStoreReturnsOffereds".equals(key) && value instanceof Boolean) { this.inStoreReturnsOffered((Boolean)value); return; }
      if ("returnFees".equals(key) && value instanceof ReturnFeesEnumeration) { this.returnFees((ReturnFeesEnumeration)value); return; }
      if ("returnFeess".equals(key) && value instanceof ReturnFeesEnumeration) { this.returnFees((ReturnFeesEnumeration)value); return; }
      if ("merchantReturnLink".equals(key) && value instanceof String) { this.merchantReturnLink((String)value); return; }
      if ("merchantReturnLinks".equals(key) && value instanceof String) { this.merchantReturnLink((String)value); return; }
      if ("returnPolicyCategory".equals(key) && value instanceof MerchantReturnEnumeration) { this.returnPolicyCategory((MerchantReturnEnumeration)value); return; }
      if ("returnPolicyCategorys".equals(key) && value instanceof MerchantReturnEnumeration) { this.returnPolicyCategory((MerchantReturnEnumeration)value); return; }
      super.fromMap(key, value);
    }
  }
  
}
