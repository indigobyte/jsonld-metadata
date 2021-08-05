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
 * A grant, typically financial or otherwise quantifiable, of resources. Typically a &lt;a class=&quot;localLink&quot; href=&quot;http://schema.org/funder&quot;&gt;funder&lt;/a&gt; sponsors some &lt;a class=&quot;localLink&quot; href=&quot;http://schema.org/MonetaryAmount&quot;&gt;MonetaryAmount&lt;/a&gt; to an &lt;a class=&quot;localLink&quot; href=&quot;http://schema.org/Organization&quot;&gt;Organization&lt;/a&gt; or &lt;a class=&quot;localLink&quot; href=&quot;http://schema.org/Person&quot;&gt;Person&lt;/a&gt;,
 *     sometimes not necessarily via a dedicated or long-lived &lt;a class=&quot;localLink&quot; href=&quot;http://schema.org/Project&quot;&gt;Project&lt;/a&gt;, resulting in one or more outputs, or &lt;a class=&quot;localLink&quot; href=&quot;http://schema.org/fundedItem&quot;&gt;fundedItem&lt;/a&gt;s. For financial sponsorship, indicate the &lt;a class=&quot;localLink&quot; href=&quot;http://schema.org/funder&quot;&gt;funder&lt;/a&gt; of a &lt;a class=&quot;localLink&quot; href=&quot;http://schema.org/MonetaryGrant&quot;&gt;MonetaryGrant&lt;/a&gt;. For non-financial support, indicate &lt;a class=&quot;localLink&quot; href=&quot;http://schema.org/sponsor&quot;&gt;sponsor&lt;/a&gt; of &lt;a class=&quot;localLink&quot; href=&quot;http://schema.org/Grant&quot;&gt;Grant&lt;/a&gt;s of resources (e.g. office space).&lt;br/&gt;&lt;br/&gt;
 * 
 * Grants support  activities directed towards some agreed collective goals, often but not always organized as &lt;a class=&quot;localLink&quot; href=&quot;http://schema.org/Project&quot;&gt;Project&lt;/a&gt;s. Long-lived projects are sometimes sponsored by a variety of grants over time, but it is also common for a project to be associated with a single grant.&lt;br/&gt;&lt;br/&gt;
 * 
 * The amount of a &lt;a class=&quot;localLink&quot; href=&quot;http://schema.org/Grant&quot;&gt;Grant&lt;/a&gt; is represented using &lt;a class=&quot;localLink&quot; href=&quot;http://schema.org/amount&quot;&gt;amount&lt;/a&gt; as a &lt;a class=&quot;localLink&quot; href=&quot;http://schema.org/MonetaryAmount&quot;&gt;MonetaryAmount&lt;/a&gt;.Source: https://www.w3.org/wiki/WebSchemas/SchemaDotOrgSources#FundInfoCollab
 */
public class Grant extends Intangible {
  /**
   * Indicates an item funded or sponsored through a &lt;a class=&quot;localLink&quot; href=&quot;http://schema.org/Grant&quot;&gt;Grant&lt;/a&gt;.
   */
  @JsonIgnore public Thing getFundedItem() {
    return (Thing) getValue("fundedItem");
  }
  /**
   * Indicates an item funded or sponsored through a &lt;a class=&quot;localLink&quot; href=&quot;http://schema.org/Grant&quot;&gt;Grant&lt;/a&gt;.
   */
  @JsonIgnore public Collection<Thing> getFundedItems() {
    final Object current = myData.get("fundedItem");
    if (current == null) return Collections.emptyList();
    if (current instanceof Collection) {
      return (Collection<Thing>) current;
    }
    return Arrays.asList((Thing) current);
  }
  /**
   * A person or organization that supports a thing through a pledge, promise, or financial contribution. e.g. a sponsor of a Medical Study or a corporate sponsor of an event.
   */
  @JsonIgnore public Sponsor getSponsor() {
    return (Sponsor) getValue("sponsor");
  }
  /**
   * A person or organization that supports a thing through a pledge, promise, or financial contribution. e.g. a sponsor of a Medical Study or a corporate sponsor of an event.
   */
  @JsonIgnore public Collection<Sponsor> getSponsors() {
    final Object current = myData.get("sponsor");
    if (current == null) return Collections.emptyList();
    if (current instanceof Collection) {
      return (Collection<Sponsor>) current;
    }
    return Arrays.asList((Sponsor) current);
  }
  protected Grant(java.util.Map<String,Object> data) {
    super(data);
  }
  
  /**
   * Builder for {@link Grant}
   */
  public static class Builder extends Intangible.Builder {
    public Builder(@NotNull HashMap<String,Object> data) {
      super(data);
    }
    @NotNull public Grant build() {
      return new Grant(myData);
    }
    /**
     * Indicates an item funded or sponsored through a &lt;a class=&quot;localLink&quot; href=&quot;http://schema.org/Grant&quot;&gt;Grant&lt;/a&gt;.
     */
    @NotNull public Builder fundedItem(@NotNull Thing thing) {
      putValue("fundedItem", thing);
      return this;
    }
    /**
     * Indicates an item funded or sponsored through a &lt;a class=&quot;localLink&quot; href=&quot;http://schema.org/Grant&quot;&gt;Grant&lt;/a&gt;.
     */
    @NotNull public Builder fundedItem(@NotNull Thing.Builder thing) {
      putValue("fundedItem", thing.build());
      return this;
    }
    /**
     * A person or organization that supports a thing through a pledge, promise, or financial contribution. e.g. a sponsor of a Medical Study or a corporate sponsor of an event.
     */
    @NotNull public Builder sponsor(@NotNull Sponsor sponsor) {
      putValue("sponsor", sponsor);
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
      if ("fundedItem".equals(key) && value instanceof Thing) { this.fundedItem((Thing)value); return; }
      if ("fundedItems".equals(key) && value instanceof Thing) { this.fundedItem((Thing)value); return; }
      if ("sponsor".equals(key) && value instanceof Sponsor) { this.sponsor((Sponsor)value); return; }
      if ("sponsors".equals(key) && value instanceof Sponsor) { this.sponsor((Sponsor)value); return; }
      super.fromMap(key, value);
    }
  }
  
}
