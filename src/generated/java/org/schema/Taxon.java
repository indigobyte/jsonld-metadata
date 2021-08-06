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
 * A set of organisms asserted to represent a natural cohesive biological unit.Source: http://bioschemas.org
 */
public class Taxon extends Thing {
  /**
   * The taxonomic rank of this taxon given preferably as a URI from a controlled vocabulary &ndash; (typically the ranks from TDWG TaxonRank ontology or equivalent Wikidata URIs).
   */
  @JsonIgnore public PropertyValue getTaxonRankPropertyValue() {
    return (PropertyValue) getValue("taxonRank");
  }
  /**
   * The taxonomic rank of this taxon given preferably as a URI from a controlled vocabulary &ndash; (typically the ranks from TDWG TaxonRank ontology or equivalent Wikidata URIs).
   */
  @JsonIgnore public java.util.Collection<PropertyValue> getTaxonRankPropertyValues() {
    final java.lang.Object current = myData.get("taxonRank");
    if (current == null) return Collections.emptyList();
    if (current instanceof java.util.Collection) {
      return (java.util.Collection<PropertyValue>) current;
    }
    return Arrays.asList((PropertyValue) current);
  }
  /**
   * The taxonomic rank of this taxon given preferably as a URI from a controlled vocabulary &ndash; (typically the ranks from TDWG TaxonRank ontology or equivalent Wikidata URIs).
   */
  @JsonIgnore public String getTaxonRankString() {
    return (String) getValue("taxonRank");
  }
  /**
   * The taxonomic rank of this taxon given preferably as a URI from a controlled vocabulary &ndash; (typically the ranks from TDWG TaxonRank ontology or equivalent Wikidata URIs).
   */
  @JsonIgnore public java.util.Collection<String> getTaxonRankStrings() {
    final java.lang.Object current = myData.get("taxonRank");
    if (current == null) return Collections.emptyList();
    if (current instanceof java.util.Collection) {
      return (java.util.Collection<String>) current;
    }
    return Arrays.asList((String) current);
  }
  /**
   * A Defined Term contained in this term set.
   */
  @JsonIgnore public HasDefinedTerm getHasDefinedTerm() {
    return (HasDefinedTerm) getValue("hasDefinedTerm");
  }
  /**
   * A Defined Term contained in this term set.
   */
  @JsonIgnore public java.util.Collection<HasDefinedTerm> getHasDefinedTerms() {
    final java.lang.Object current = myData.get("hasDefinedTerm");
    if (current == null) return Collections.emptyList();
    if (current instanceof java.util.Collection) {
      return (java.util.Collection<HasDefinedTerm>) current;
    }
    return Arrays.asList((HasDefinedTerm) current);
  }
  /**
   * Closest parent taxon of the taxon in question.
   */
  @JsonIgnore public String getParentTaxonString() {
    return (String) getValue("parentTaxon");
  }
  /**
   * Closest parent taxon of the taxon in question.
   */
  @JsonIgnore public java.util.Collection<String> getParentTaxonStrings() {
    final java.lang.Object current = myData.get("parentTaxon");
    if (current == null) return Collections.emptyList();
    if (current instanceof java.util.Collection) {
      return (java.util.Collection<String>) current;
    }
    return Arrays.asList((String) current);
  }
  /**
   * Closest parent taxon of the taxon in question.
   */
  @JsonIgnore public Taxon getParentTaxonTaxon() {
    return (Taxon) getValue("parentTaxon");
  }
  /**
   * Closest parent taxon of the taxon in question.
   */
  @JsonIgnore public java.util.Collection<Taxon> getParentTaxonTaxons() {
    final java.lang.Object current = myData.get("parentTaxon");
    if (current == null) return Collections.emptyList();
    if (current instanceof java.util.Collection) {
      return (java.util.Collection<Taxon>) current;
    }
    return Arrays.asList((Taxon) current);
  }
  /**
   * Closest child taxa of the taxon in question.
   */
  @JsonIgnore public String getChildTaxonString() {
    return (String) getValue("childTaxon");
  }
  /**
   * Closest child taxa of the taxon in question.
   */
  @JsonIgnore public java.util.Collection<String> getChildTaxonStrings() {
    final java.lang.Object current = myData.get("childTaxon");
    if (current == null) return Collections.emptyList();
    if (current instanceof java.util.Collection) {
      return (java.util.Collection<String>) current;
    }
    return Arrays.asList((String) current);
  }
  /**
   * Closest child taxa of the taxon in question.
   */
  @JsonIgnore public Taxon getChildTaxonTaxon() {
    return (Taxon) getValue("childTaxon");
  }
  /**
   * Closest child taxa of the taxon in question.
   */
  @JsonIgnore public java.util.Collection<Taxon> getChildTaxonTaxons() {
    final java.lang.Object current = myData.get("childTaxon");
    if (current == null) return Collections.emptyList();
    if (current instanceof java.util.Collection) {
      return (java.util.Collection<Taxon>) current;
    }
    return Arrays.asList((Taxon) current);
  }
  protected Taxon(java.util.Map<String,java.lang.Object> data) {
    super(data);
  }
  
  /**
   * Builder for {@link Taxon}
   */
  public static class Builder extends Thing.Builder {
    public Builder(@NotNull HashMap<String,java.lang.Object> data) {
      super(data);
    }
    @NotNull public Taxon build() {
      return new Taxon(myData);
    }
    /**
     * The taxonomic rank of this taxon given preferably as a URI from a controlled vocabulary &ndash; (typically the ranks from TDWG TaxonRank ontology or equivalent Wikidata URIs).
     */
    @NotNull public Builder taxonRank(@NotNull PropertyValue propertyValue) {
      putValue("taxonRank", propertyValue);
      return this;
    }
    /**
     * The taxonomic rank of this taxon given preferably as a URI from a controlled vocabulary &ndash; (typically the ranks from TDWG TaxonRank ontology or equivalent Wikidata URIs).
     */
    @NotNull public Builder taxonRank(@NotNull PropertyValue.Builder propertyValue) {
      putValue("taxonRank", propertyValue.build());
      return this;
    }
    /**
     * The taxonomic rank of this taxon given preferably as a URI from a controlled vocabulary &ndash; (typically the ranks from TDWG TaxonRank ontology or equivalent Wikidata URIs).
     */
    @NotNull public Builder taxonRank(@NotNull String taxonRank) {
      putValue("taxonRank", taxonRank);
      return this;
    }
    /**
     * A Defined Term contained in this term set.
     */
    @NotNull public Builder hasDefinedTerm(@NotNull HasDefinedTerm hasDefinedTerm) {
      putValue("hasDefinedTerm", hasDefinedTerm);
      return this;
    }
    /**
     * Closest parent taxon of the taxon in question.
     */
    @NotNull public Builder parentTaxon(@NotNull String parentTaxon) {
      putValue("parentTaxon", parentTaxon);
      return this;
    }
    /**
     * Closest parent taxon of the taxon in question.
     */
    @NotNull public Builder parentTaxon(@NotNull Taxon taxon) {
      putValue("parentTaxon", taxon);
      return this;
    }
    /**
     * Closest parent taxon of the taxon in question.
     */
    @NotNull public Builder parentTaxon(@NotNull Taxon.Builder taxon) {
      putValue("parentTaxon", taxon.build());
      return this;
    }
    /**
     * Closest child taxa of the taxon in question.
     */
    @NotNull public Builder childTaxon(@NotNull String childTaxon) {
      putValue("childTaxon", childTaxon);
      return this;
    }
    /**
     * Closest child taxa of the taxon in question.
     */
    @NotNull public Builder childTaxon(@NotNull Taxon taxon) {
      putValue("childTaxon", taxon);
      return this;
    }
    /**
     * Closest child taxa of the taxon in question.
     */
    @NotNull public Builder childTaxon(@NotNull Taxon.Builder taxon) {
      putValue("childTaxon", taxon.build());
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
      if ("taxonRank".equals(key) && value instanceof PropertyValue) { this.taxonRank((PropertyValue)value); return; }
      if ("taxonRanks".equals(key) && value instanceof PropertyValue) { this.taxonRank((PropertyValue)value); return; }
      if ("taxonRank".equals(key) && value instanceof String) { this.taxonRank((String)value); return; }
      if ("taxonRanks".equals(key) && value instanceof String) { this.taxonRank((String)value); return; }
      if ("hasDefinedTerm".equals(key) && value instanceof HasDefinedTerm) { this.hasDefinedTerm((HasDefinedTerm)value); return; }
      if ("hasDefinedTerms".equals(key) && value instanceof HasDefinedTerm) { this.hasDefinedTerm((HasDefinedTerm)value); return; }
      if ("parentTaxon".equals(key) && value instanceof String) { this.parentTaxon((String)value); return; }
      if ("parentTaxons".equals(key) && value instanceof String) { this.parentTaxon((String)value); return; }
      if ("parentTaxon".equals(key) && value instanceof Taxon) { this.parentTaxon((Taxon)value); return; }
      if ("parentTaxons".equals(key) && value instanceof Taxon) { this.parentTaxon((Taxon)value); return; }
      if ("childTaxon".equals(key) && value instanceof String) { this.childTaxon((String)value); return; }
      if ("childTaxons".equals(key) && value instanceof String) { this.childTaxon((String)value); return; }
      if ("childTaxon".equals(key) && value instanceof Taxon) { this.childTaxon((Taxon)value); return; }
      if ("childTaxons".equals(key) && value instanceof Taxon) { this.childTaxon((Taxon)value); return; }
      super.fromMap(key, value);
    }
  }
  
}
