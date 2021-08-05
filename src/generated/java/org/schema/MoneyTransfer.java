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
 * The act of transferring money from one place to another place. This may occur electronically or physically.Source: http://www.w3.org/wiki/WebSchemas/SchemaDotOrgSources#FIBO
 */
public class MoneyTransfer extends TransferAction {
  /**
   * The amount of money.
   */
  @JsonIgnore public Integer getAmountInteger() {
    return (Integer) getValue("amount");
  }
  /**
   * The amount of money.
   */
  @JsonIgnore public Collection<Integer> getAmountIntegers() {
    final Object current = myData.get("amount");
    if (current == null) return Collections.emptyList();
    if (current instanceof Collection) {
      return (Collection<Integer>) current;
    }
    return Arrays.asList((Integer) current);
  }
  /**
   * The amount of money.
   */
  @JsonIgnore public Long getAmountLong() {
    return (Long) getValue("amount");
  }
  /**
   * The amount of money.
   */
  @JsonIgnore public Collection<Long> getAmountLongs() {
    final Object current = myData.get("amount");
    if (current == null) return Collections.emptyList();
    if (current instanceof Collection) {
      return (Collection<Long>) current;
    }
    return Arrays.asList((Long) current);
  }
  /**
   * The amount of money.
   */
  @JsonIgnore public Float getAmountFloat() {
    return (Float) getValue("amount");
  }
  /**
   * The amount of money.
   */
  @JsonIgnore public Collection<Float> getAmountFloats() {
    final Object current = myData.get("amount");
    if (current == null) return Collections.emptyList();
    if (current instanceof Collection) {
      return (Collection<Float>) current;
    }
    return Arrays.asList((Float) current);
  }
  /**
   * The amount of money.
   */
  @JsonIgnore public Double getAmountDouble() {
    return (Double) getValue("amount");
  }
  /**
   * The amount of money.
   */
  @JsonIgnore public Collection<Double> getAmountDoubles() {
    final Object current = myData.get("amount");
    if (current == null) return Collections.emptyList();
    if (current instanceof Collection) {
      return (Collection<Double>) current;
    }
    return Arrays.asList((Double) current);
  }
  /**
   * The amount of money.
   */
  @JsonIgnore public String getAmountString() {
    return (String) getValue("amount");
  }
  /**
   * The amount of money.
   */
  @JsonIgnore public Collection<String> getAmountStrings() {
    final Object current = myData.get("amount");
    if (current == null) return Collections.emptyList();
    if (current instanceof Collection) {
      return (Collection<String>) current;
    }
    return Arrays.asList((String) current);
  }
  /**
   * A bank or bank&rsquo;s branch, financial institution or international financial institution operating the beneficiary&rsquo;s bank account or releasing funds for the beneficiary
   */
  @JsonIgnore public BankOrCreditUnion getBeneficiaryBankBankOrCreditUnion() {
    return (BankOrCreditUnion) getValue("beneficiaryBank");
  }
  /**
   * A bank or bank&rsquo;s branch, financial institution or international financial institution operating the beneficiary&rsquo;s bank account or releasing funds for the beneficiary
   */
  @JsonIgnore public Collection<BankOrCreditUnion> getBeneficiaryBankBankOrCreditUnions() {
    final Object current = myData.get("beneficiaryBank");
    if (current == null) return Collections.emptyList();
    if (current instanceof Collection) {
      return (Collection<BankOrCreditUnion>) current;
    }
    return Arrays.asList((BankOrCreditUnion) current);
  }
  /**
   * A bank or bank&rsquo;s branch, financial institution or international financial institution operating the beneficiary&rsquo;s bank account or releasing funds for the beneficiary
   */
  @JsonIgnore public String getBeneficiaryBankString() {
    return (String) getValue("beneficiaryBank");
  }
  /**
   * A bank or bank&rsquo;s branch, financial institution or international financial institution operating the beneficiary&rsquo;s bank account or releasing funds for the beneficiary
   */
  @JsonIgnore public Collection<String> getBeneficiaryBankStrings() {
    final Object current = myData.get("beneficiaryBank");
    if (current == null) return Collections.emptyList();
    if (current instanceof Collection) {
      return (Collection<String>) current;
    }
    return Arrays.asList((String) current);
  }
  protected MoneyTransfer(java.util.Map<String,Object> data) {
    super(data);
  }
  
  /**
   * Builder for {@link MoneyTransfer}
   */
  public static class Builder extends TransferAction.Builder {
    public Builder(@NotNull HashMap<String,Object> data) {
      super(data);
    }
    @NotNull public MoneyTransfer build() {
      return new MoneyTransfer(myData);
    }
    /**
     * The amount of money.
     */
    @NotNull public Builder amount(@NotNull Integer integer) {
      putValue("amount", integer);
      return this;
    }
    /**
     * The amount of money.
     */
    @NotNull public Builder amount(@NotNull Long amount) {
      putValue("amount", amount);
      return this;
    }
    /**
     * The amount of money.
     */
    @NotNull public Builder amount(@NotNull Float amount) {
      putValue("amount", amount);
      return this;
    }
    /**
     * The amount of money.
     */
    @NotNull public Builder amount(@NotNull Double amount) {
      putValue("amount", amount);
      return this;
    }
    /**
     * The amount of money.
     */
    @NotNull public Builder amount(@NotNull String amount) {
      putValue("amount", amount);
      return this;
    }
    /**
     * A bank or bank&rsquo;s branch, financial institution or international financial institution operating the beneficiary&rsquo;s bank account or releasing funds for the beneficiary
     */
    @NotNull public Builder beneficiaryBank(@NotNull BankOrCreditUnion bankOrCreditUnion) {
      putValue("beneficiaryBank", bankOrCreditUnion);
      return this;
    }
    /**
     * A bank or bank&rsquo;s branch, financial institution or international financial institution operating the beneficiary&rsquo;s bank account or releasing funds for the beneficiary
     */
    @NotNull public Builder beneficiaryBank(@NotNull BankOrCreditUnion.Builder bankOrCreditUnion) {
      putValue("beneficiaryBank", bankOrCreditUnion.build());
      return this;
    }
    /**
     * A bank or bank&rsquo;s branch, financial institution or international financial institution operating the beneficiary&rsquo;s bank account or releasing funds for the beneficiary
     */
    @NotNull public Builder beneficiaryBank(@NotNull String beneficiaryBank) {
      putValue("beneficiaryBank", beneficiaryBank);
      return this;
    }
    /**
     * A sub property of location. The original location of the object or the agent before the action.
     */
    @NotNull public Builder fromLocation(@NotNull Location location) {
      putValue("fromLocation", location);
      return this;
    }
    /**
     * A sub property of location. The final location of the object or the agent after the action.
     */
    @NotNull public Builder toLocation(@NotNull Location location) {
      putValue("toLocation", location);
      return this;
    }
    /**
     * The startTime of something. For a reserved event or service (e.g. FoodEstablishmentReservation), the time that it is expected to start. For actions that span a period of time, when the action was performed. e.g. John wrote a book from &lt;em&gt;January&lt;/em&gt; to December. For media, including audio and video, it's the time offset of the start of a clip within a larger file.&lt;br/&gt;&lt;br/&gt;
     * 
     * Note that Event uses startDate/endDate instead of startTime/endTime, even when describing dates with times. This situation may be clarified in future revisions.
     */
    @NotNull public Builder startTime(@NotNull java.util.Date date) {
      putValue("startTime", date);
      return this;
    }
    /**
     * For failed actions, more information on the cause of the failure.
     */
    @NotNull public Builder error(@NotNull Thing thing) {
      putValue("error", thing);
      return this;
    }
    /**
     * For failed actions, more information on the cause of the failure.
     */
    @NotNull public Builder error(@NotNull Thing.Builder thing) {
      putValue("error", thing.build());
      return this;
    }
    /**
     * The endTime of something. For a reserved event or service (e.g. FoodEstablishmentReservation), the time that it is expected to end. For actions that span a period of time, when the action was performed. e.g. John wrote a book from January to &lt;em&gt;December&lt;/em&gt;. For media, including audio and video, it's the time offset of the end of a clip within a larger file.&lt;br/&gt;&lt;br/&gt;
     * 
     * Note that Event uses startDate/endDate instead of startTime/endTime, even when describing dates with times. This situation may be clarified in future revisions.
     */
    @NotNull public Builder endTime(@NotNull java.util.Date date) {
      putValue("endTime", date);
      return this;
    }
    /**
     * Indicates a target EntryPoint for an Action.
     */
    @NotNull public Builder target(@NotNull EntryPoint entryPoint) {
      putValue("target", entryPoint);
      return this;
    }
    /**
     * Indicates a target EntryPoint for an Action.
     */
    @NotNull public Builder target(@NotNull EntryPoint.Builder entryPoint) {
      putValue("target", entryPoint.build());
      return this;
    }
    /**
     * The direct performer or driver of the action (animate or inanimate). e.g. &lt;em&gt;John&lt;/em&gt; wrote a book.
     */
    @NotNull public Builder agent(@NotNull Organization organization) {
      putValue("agent", organization);
      return this;
    }
    /**
     * The direct performer or driver of the action (animate or inanimate). e.g. &lt;em&gt;John&lt;/em&gt; wrote a book.
     */
    @NotNull public Builder agent(@NotNull Organization.Builder organization) {
      putValue("agent", organization.build());
      return this;
    }
    /**
     * The direct performer or driver of the action (animate or inanimate). e.g. &lt;em&gt;John&lt;/em&gt; wrote a book.
     */
    @NotNull public Builder agent(@NotNull Person person) {
      putValue("agent", person);
      return this;
    }
    /**
     * The direct performer or driver of the action (animate or inanimate). e.g. &lt;em&gt;John&lt;/em&gt; wrote a book.
     */
    @NotNull public Builder agent(@NotNull Person.Builder person) {
      putValue("agent", person.build());
      return this;
    }
    /**
     * Indicates the current disposition of the Action.
     */
    @NotNull public Builder actionStatus(@NotNull ActionStatusType actionStatusType) {
      putValue("actionStatus", actionStatusType);
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
      if ("amount".equals(key) && value instanceof Integer) { this.amount((Integer)value); return; }
      if ("amounts".equals(key) && value instanceof Integer) { this.amount((Integer)value); return; }
      if ("amount".equals(key) && value instanceof Long) { this.amount((Long)value); return; }
      if ("amounts".equals(key) && value instanceof Long) { this.amount((Long)value); return; }
      if ("amount".equals(key) && value instanceof Float) { this.amount((Float)value); return; }
      if ("amounts".equals(key) && value instanceof Float) { this.amount((Float)value); return; }
      if ("amount".equals(key) && value instanceof Double) { this.amount((Double)value); return; }
      if ("amounts".equals(key) && value instanceof Double) { this.amount((Double)value); return; }
      if ("amount".equals(key) && value instanceof String) { this.amount((String)value); return; }
      if ("amounts".equals(key) && value instanceof String) { this.amount((String)value); return; }
      if ("beneficiaryBank".equals(key) && value instanceof BankOrCreditUnion) { this.beneficiaryBank((BankOrCreditUnion)value); return; }
      if ("beneficiaryBanks".equals(key) && value instanceof BankOrCreditUnion) { this.beneficiaryBank((BankOrCreditUnion)value); return; }
      if ("beneficiaryBank".equals(key) && value instanceof String) { this.beneficiaryBank((String)value); return; }
      if ("beneficiaryBanks".equals(key) && value instanceof String) { this.beneficiaryBank((String)value); return; }
      super.fromMap(key, value);
    }
  }
  
}
