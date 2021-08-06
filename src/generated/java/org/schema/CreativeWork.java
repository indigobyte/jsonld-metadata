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
 * The most generic kind of creative work, including books, movies, photographs, software programs, etc.
 */
public class CreativeWork extends Thing implements org.schema.IsPartOf, WorkFeatured, PublishingPrinciples, UsageInfo, WorkExample, Step {
  /**
   * The textual content of this CreativeWork.
   */
  @JsonIgnore public String getText() {
    return (String) getValue("text");
  }
  /**
   * The textual content of this CreativeWork.
   */
  @JsonIgnore public java.util.Collection<String> getTexts() {
    final java.lang.Object current = myData.get("text");
    if (current == null) return Collections.emptyList();
    if (current instanceof java.util.Collection) {
      return (java.util.Collection<String>) current;
    }
    return Arrays.asList((String) current);
  }
  /**
   * The &quot;spatial&quot; property can be used in cases when more specific properties
   * (e.g. [[locationCreated]], [[spatialCoverage]], [[contentLocation]]) are not known to be appropriate.
   */
  @JsonIgnore public Place getSpatial() {
    return (Place) getValue("spatial");
  }
  /**
   * The &quot;spatial&quot; property can be used in cases when more specific properties
   * (e.g. [[locationCreated]], [[spatialCoverage]], [[contentLocation]]) are not known to be appropriate.
   */
  @JsonIgnore public java.util.Collection<Place> getSpatials() {
    final java.lang.Object current = myData.get("spatial");
    if (current == null) return Collections.emptyList();
    if (current instanceof java.util.Collection) {
      return (java.util.Collection<Place>) current;
    }
    return Arrays.asList((Place) current);
  }
  /**
   * The publishingPrinciples property indicates (typically via [[URL]]) a document describing the editorial principles of an [[Organization]] (or individual e.g. a [[Person]] writing a blog) that relate to their activities as a publisher, e.g. ethics or diversity policies. When applied to a [[CreativeWork]] (e.g. [[NewsArticle]]) the principles are those of the party primarily responsible for the creation of the [[CreativeWork]].
   * 
   * While such policies are most typically expressed in natural language, sometimes related information (e.g. indicating a [[funder]]) can be expressed using schema.org terminology.
   * 
   */
  @JsonIgnore public PublishingPrinciples getPublishingPrinciples() {
    return (PublishingPrinciples) getValue("publishingPrinciples");
  }
  /**
   * The publishingPrinciples property indicates (typically via [[URL]]) a document describing the editorial principles of an [[Organization]] (or individual e.g. a [[Person]] writing a blog) that relate to their activities as a publisher, e.g. ethics or diversity policies. When applied to a [[CreativeWork]] (e.g. [[NewsArticle]]) the principles are those of the party primarily responsible for the creation of the [[CreativeWork]].
   * 
   * While such policies are most typically expressed in natural language, sometimes related information (e.g. indicating a [[funder]]) can be expressed using schema.org terminology.
   * 
   */
  @JsonIgnore public java.util.Collection<PublishingPrinciples> getPublishingPrincipless() {
    final java.lang.Object current = myData.get("publishingPrinciples");
    if (current == null) return Collections.emptyList();
    if (current instanceof java.util.Collection) {
      return (java.util.Collection<PublishingPrinciples>) current;
    }
    return Arrays.asList((PublishingPrinciples) current);
  }
  /**
   * The language of the content or performance or used in an action. Please use one of the language codes from the [IETF BCP 47 standard](http://tools.ietf.org/html/bcp47). See also [[availableLanguage]].
   */
  @JsonIgnore public Language getInLanguageLanguage() {
    return (Language) getValue("inLanguage");
  }
  /**
   * The language of the content or performance or used in an action. Please use one of the language codes from the [IETF BCP 47 standard](http://tools.ietf.org/html/bcp47). See also [[availableLanguage]].
   */
  @JsonIgnore public java.util.Collection<Language> getInLanguageLanguages() {
    final java.lang.Object current = myData.get("inLanguage");
    if (current == null) return Collections.emptyList();
    if (current instanceof java.util.Collection) {
      return (java.util.Collection<Language>) current;
    }
    return Arrays.asList((Language) current);
  }
  /**
   * The language of the content or performance or used in an action. Please use one of the language codes from the [IETF BCP 47 standard](http://tools.ietf.org/html/bcp47). See also [[availableLanguage]].
   */
  @JsonIgnore public String getInLanguageString() {
    return (String) getValue("inLanguage");
  }
  /**
   * The language of the content or performance or used in an action. Please use one of the language codes from the [IETF BCP 47 standard](http://tools.ietf.org/html/bcp47). See also [[availableLanguage]].
   */
  @JsonIgnore public java.util.Collection<String> getInLanguageStrings() {
    final java.lang.Object current = myData.get("inLanguage");
    if (current == null) return Collections.emptyList();
    if (current instanceof java.util.Collection) {
      return (java.util.Collection<String>) current;
    }
    return Arrays.asList((String) current);
  }
  /**
   * A thumbnail image relevant to the Thing.
   */
  @JsonIgnore public String getThumbnailUrl() {
    return (String) getValue("thumbnailUrl");
  }
  /**
   * A thumbnail image relevant to the Thing.
   */
  @JsonIgnore public java.util.Collection<String> getThumbnailUrls() {
    final java.lang.Object current = myData.get("thumbnailUrl");
    if (current == null) return Collections.emptyList();
    if (current instanceof java.util.Collection) {
      return (java.util.Collection<String>) current;
    }
    return Arrays.asList((String) current);
  }
  /**
   * Indicates an item or CreativeWork that is part of this item, or CreativeWork (in some sense).
   */
  @JsonIgnore public HasPart getHasPart() {
    return (HasPart) getValue("hasPart");
  }
  /**
   * Indicates an item or CreativeWork that is part of this item, or CreativeWork (in some sense).
   */
  @JsonIgnore public java.util.Collection<HasPart> getHasParts() {
    final java.lang.Object current = myData.get("hasPart");
    if (current == null) return Collections.emptyList();
    if (current instanceof java.util.Collection) {
      return (java.util.Collection<HasPart>) current;
    }
    return Arrays.asList((HasPart) current);
  }
  /**
   * Official rating of a piece of content&amp;#x2014;for example,'MPAA PG-13'.
   */
  @JsonIgnore public Rating getContentRatingRating() {
    return (Rating) getValue("contentRating");
  }
  /**
   * Official rating of a piece of content&amp;#x2014;for example,'MPAA PG-13'.
   */
  @JsonIgnore public java.util.Collection<Rating> getContentRatingRatings() {
    final java.lang.Object current = myData.get("contentRating");
    if (current == null) return Collections.emptyList();
    if (current instanceof java.util.Collection) {
      return (java.util.Collection<Rating>) current;
    }
    return Arrays.asList((Rating) current);
  }
  /**
   * Official rating of a piece of content&amp;#x2014;for example,'MPAA PG-13'.
   */
  @JsonIgnore public String getContentRatingString() {
    return (String) getValue("contentRating");
  }
  /**
   * Official rating of a piece of content&amp;#x2014;for example,'MPAA PG-13'.
   */
  @JsonIgnore public java.util.Collection<String> getContentRatingStrings() {
    final java.lang.Object current = myData.get("contentRating");
    if (current == null) return Collections.emptyList();
    if (current instanceof java.util.Collection) {
      return (java.util.Collection<String>) current;
    }
    return Arrays.asList((String) current);
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
    final java.lang.Object current = myData.get("size");
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
    final java.lang.Object current = myData.get("size");
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
    final java.lang.Object current = myData.get("size");
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
    final java.lang.Object current = myData.get("size");
    if (current == null) return Collections.emptyList();
    if (current instanceof java.util.Collection) {
      return (java.util.Collection<String>) current;
    }
    return Arrays.asList((String) current);
  }
  /**
   * A material that something is made from, e.g. leather, wool, cotton, paper.
   */
  @JsonIgnore public Material getMaterial() {
    return (Material) getValue("material");
  }
  /**
   * A material that something is made from, e.g. leather, wool, cotton, paper.
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
   * Conditions that affect the availability of, or method(s) of access to, an item. Typically used for real world items such as an [[ArchiveComponent]] held by an [[ArchiveOrganization]]. This property is not suitable for use as a general Web access control mechanism. It is expressed only in natural language.\n\nFor example &quot;Available by appointment from the Reading Room&quot; or &quot;Accessible only from logged-in accounts &quot;. 
   */
  @JsonIgnore public String getConditionsOfAccess() {
    return (String) getValue("conditionsOfAccess");
  }
  /**
   * Conditions that affect the availability of, or method(s) of access to, an item. Typically used for real world items such as an [[ArchiveComponent]] held by an [[ArchiveOrganization]]. This property is not suitable for use as a general Web access control mechanism. It is expressed only in natural language.\n\nFor example &quot;Available by appointment from the Reading Room&quot; or &quot;Accessible only from logged-in accounts &quot;. 
   */
  @JsonIgnore public java.util.Collection<String> getConditionsOfAccesss() {
    final java.lang.Object current = myData.get("conditionsOfAccess");
    if (current == null) return Collections.emptyList();
    if (current instanceof java.util.Collection) {
      return (java.util.Collection<String>) current;
    }
    return Arrays.asList((String) current);
  }
  /**
   * The service provider, service operator, or service performer; the goods producer. Another party (a seller) may offer those services or goods on behalf of the provider. A provider may also serve as the seller.
   */
  @JsonIgnore public Organization getProviderOrganization() {
    return (Organization) getValue("provider");
  }
  /**
   * The service provider, service operator, or service performer; the goods producer. Another party (a seller) may offer those services or goods on behalf of the provider. A provider may also serve as the seller.
   */
  @JsonIgnore public java.util.Collection<Organization> getProviderOrganizations() {
    final java.lang.Object current = myData.get("provider");
    if (current == null) return Collections.emptyList();
    if (current instanceof java.util.Collection) {
      return (java.util.Collection<Organization>) current;
    }
    return Arrays.asList((Organization) current);
  }
  /**
   * The service provider, service operator, or service performer; the goods producer. Another party (a seller) may offer those services or goods on behalf of the provider. A provider may also serve as the seller.
   */
  @JsonIgnore public Person getProviderPerson() {
    return (Person) getValue("provider");
  }
  /**
   * The service provider, service operator, or service performer; the goods producer. Another party (a seller) may offer those services or goods on behalf of the provider. A provider may also serve as the seller.
   */
  @JsonIgnore public java.util.Collection<Person> getProviderPersons() {
    final java.lang.Object current = myData.get("provider");
    if (current == null) return Collections.emptyList();
    if (current instanceof java.util.Collection) {
      return (java.util.Collection<Person>) current;
    }
    return Arrays.asList((Person) current);
  }
  /**
   * The date on which the CreativeWork was created or the item was added to a DataFeed.
   */
  @JsonIgnore public DateCreated getDateCreated() {
    return (DateCreated) getValue("dateCreated");
  }
  /**
   * The date on which the CreativeWork was created or the item was added to a DataFeed.
   */
  @JsonIgnore public java.util.Collection<DateCreated> getDateCreateds() {
    final java.lang.Object current = myData.get("dateCreated");
    if (current == null) return Collections.emptyList();
    if (current instanceof java.util.Collection) {
      return (java.util.Collection<DateCreated>) current;
    }
    return Arrays.asList((DateCreated) current);
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
    final java.lang.Object current = myData.get("pattern");
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
    final java.lang.Object current = myData.get("pattern");
    if (current == null) return Collections.emptyList();
    if (current instanceof java.util.Collection) {
      return (java.util.Collection<String>) current;
    }
    return Arrays.asList((String) current);
  }
  /**
   * Indicates a correction to a [[CreativeWork]], either via a [[CorrectionComment]], textually or in another document.
   */
  @JsonIgnore public CorrectionComment getCorrectionCorrectionComment() {
    return (CorrectionComment) getValue("correction");
  }
  /**
   * Indicates a correction to a [[CreativeWork]], either via a [[CorrectionComment]], textually or in another document.
   */
  @JsonIgnore public java.util.Collection<CorrectionComment> getCorrectionCorrectionComments() {
    final java.lang.Object current = myData.get("correction");
    if (current == null) return Collections.emptyList();
    if (current instanceof java.util.Collection) {
      return (java.util.Collection<CorrectionComment>) current;
    }
    return Arrays.asList((CorrectionComment) current);
  }
  /**
   * Indicates a correction to a [[CreativeWork]], either via a [[CorrectionComment]], textually or in another document.
   */
  @JsonIgnore public String getCorrectionString() {
    return (String) getValue("correction");
  }
  /**
   * Indicates a correction to a [[CreativeWork]], either via a [[CorrectionComment]], textually or in another document.
   */
  @JsonIgnore public java.util.Collection<String> getCorrectionStrings() {
    final java.lang.Object current = myData.get("correction");
    if (current == null) return Collections.emptyList();
    if (current instanceof java.util.Collection) {
      return (java.util.Collection<String>) current;
    }
    return Arrays.asList((String) current);
  }
  /**
   * The number of comments this CreativeWork (e.g. Article, Question or Answer) has received. This is most applicable to works published in Web sites with commenting system; additional comments may exist elsewhere.
   */
  @JsonIgnore public Integer getCommentCount() {
    return (Integer) getValue("commentCount");
  }
  /**
   * The number of comments this CreativeWork (e.g. Article, Question or Answer) has received. This is most applicable to works published in Web sites with commenting system; additional comments may exist elsewhere.
   */
  @JsonIgnore public java.util.Collection<Integer> getCommentCounts() {
    final java.lang.Object current = myData.get("commentCount");
    if (current == null) return Collections.emptyList();
    if (current instanceof java.util.Collection) {
      return (java.util.Collection<Integer>) current;
    }
    return Arrays.asList((Integer) current);
  }
  /**
   * The spatialCoverage of a CreativeWork indicates the place(s) which are the focus of the content. It is a subproperty of
   *       contentLocation intended primarily for more technical and detailed materials. For example with a Dataset, it indicates
   *       areas that the dataset describes: a dataset of New York weather would have spatialCoverage which was the place: the state of New York.
   */
  @JsonIgnore public SpatialCoverage getSpatialCoverage() {
    return (SpatialCoverage) getValue("spatialCoverage");
  }
  /**
   * The spatialCoverage of a CreativeWork indicates the place(s) which are the focus of the content. It is a subproperty of
   *       contentLocation intended primarily for more technical and detailed materials. For example with a Dataset, it indicates
   *       areas that the dataset describes: a dataset of New York weather would have spatialCoverage which was the place: the state of New York.
   */
  @JsonIgnore public java.util.Collection<SpatialCoverage> getSpatialCoverages() {
    final java.lang.Object current = myData.get("spatialCoverage");
    if (current == null) return Collections.emptyList();
    if (current instanceof java.util.Collection) {
      return (java.util.Collection<SpatialCoverage>) current;
    }
    return Arrays.asList((SpatialCoverage) current);
  }
  /**
   * Indicates a page or other link involved in archival of a [[CreativeWork]]. In the case of [[MediaReview]], the items in a [[MediaReviewItem]] may often become inaccessible, but be archived by archival, journalistic, activist, or law enforcement organizations. In such cases, the referenced page may not directly publish the content.
   */
  @JsonIgnore public String getArchivedAtString() {
    return (String) getValue("archivedAt");
  }
  /**
   * Indicates a page or other link involved in archival of a [[CreativeWork]]. In the case of [[MediaReview]], the items in a [[MediaReviewItem]] may often become inaccessible, but be archived by archival, journalistic, activist, or law enforcement organizations. In such cases, the referenced page may not directly publish the content.
   */
  @JsonIgnore public java.util.Collection<String> getArchivedAtStrings() {
    final java.lang.Object current = myData.get("archivedAt");
    if (current == null) return Collections.emptyList();
    if (current instanceof java.util.Collection) {
      return (java.util.Collection<String>) current;
    }
    return Arrays.asList((String) current);
  }
  /**
   * Indicates a page or other link involved in archival of a [[CreativeWork]]. In the case of [[MediaReview]], the items in a [[MediaReviewItem]] may often become inaccessible, but be archived by archival, journalistic, activist, or law enforcement organizations. In such cases, the referenced page may not directly publish the content.
   */
  @JsonIgnore public WebPage getArchivedAtWebPage() {
    return (WebPage) getValue("archivedAt");
  }
  /**
   * Indicates a page or other link involved in archival of a [[CreativeWork]]. In the case of [[MediaReview]], the items in a [[MediaReviewItem]] may often become inaccessible, but be archived by archival, journalistic, activist, or law enforcement organizations. In such cases, the referenced page may not directly publish the content.
   */
  @JsonIgnore public java.util.Collection<WebPage> getArchivedAtWebPages() {
    final java.lang.Object current = myData.get("archivedAt");
    if (current == null) return Collections.emptyList();
    if (current instanceof java.util.Collection) {
      return (java.util.Collection<WebPage>) current;
    }
    return Arrays.asList((WebPage) current);
  }
  /**
   * Indicates that the CreativeWork contains a reference to, but is not necessarily about a concept.
   */
  @JsonIgnore public Thing getMentions() {
    return (Thing) getValue("mentions");
  }
  /**
   * Indicates that the CreativeWork contains a reference to, but is not necessarily about a concept.
   */
  @JsonIgnore public java.util.Collection<Thing> getMentionss() {
    final java.lang.Object current = myData.get("mentions");
    if (current == null) return Collections.emptyList();
    if (current instanceof java.util.Collection) {
      return (java.util.Collection<Thing>) current;
    }
    return Arrays.asList((Thing) current);
  }
  /**
   * The level in terms of progression through an educational or training context. Examples of educational levels include 'beginner', 'intermediate' or 'advanced', and formal sets of level indicators.
   */
  @JsonIgnore public DefinedTerm getEducationalLevelDefinedTerm() {
    return (DefinedTerm) getValue("educationalLevel");
  }
  /**
   * The level in terms of progression through an educational or training context. Examples of educational levels include 'beginner', 'intermediate' or 'advanced', and formal sets of level indicators.
   */
  @JsonIgnore public java.util.Collection<DefinedTerm> getEducationalLevelDefinedTerms() {
    final java.lang.Object current = myData.get("educationalLevel");
    if (current == null) return Collections.emptyList();
    if (current instanceof java.util.Collection) {
      return (java.util.Collection<DefinedTerm>) current;
    }
    return Arrays.asList((DefinedTerm) current);
  }
  /**
   * The level in terms of progression through an educational or training context. Examples of educational levels include 'beginner', 'intermediate' or 'advanced', and formal sets of level indicators.
   */
  @JsonIgnore public String getEducationalLevelString() {
    return (String) getValue("educationalLevel");
  }
  /**
   * The level in terms of progression through an educational or training context. Examples of educational levels include 'beginner', 'intermediate' or 'advanced', and formal sets of level indicators.
   */
  @JsonIgnore public java.util.Collection<String> getEducationalLevelStrings() {
    final java.lang.Object current = myData.get("educationalLevel");
    if (current == null) return Collections.emptyList();
    if (current instanceof java.util.Collection) {
      return (java.util.Collection<String>) current;
    }
    return Arrays.asList((String) current);
  }
  /**
   * The &quot;temporal&quot; property can be used in cases where more specific properties
   * (e.g. [[temporalCoverage]], [[dateCreated]], [[dateModified]], [[datePublished]]) are not known to be appropriate.
   */
  @JsonIgnore public String getTemporalString() {
    return (String) getValue("temporal");
  }
  /**
   * The &quot;temporal&quot; property can be used in cases where more specific properties
   * (e.g. [[temporalCoverage]], [[dateCreated]], [[dateModified]], [[datePublished]]) are not known to be appropriate.
   */
  @JsonIgnore public java.util.Collection<String> getTemporalStrings() {
    final java.lang.Object current = myData.get("temporal");
    if (current == null) return Collections.emptyList();
    if (current instanceof java.util.Collection) {
      return (java.util.Collection<String>) current;
    }
    return Arrays.asList((String) current);
  }
  /**
   * The &quot;temporal&quot; property can be used in cases where more specific properties
   * (e.g. [[temporalCoverage]], [[dateCreated]], [[dateModified]], [[datePublished]]) are not known to be appropriate.
   */
  @JsonIgnore public java.util.Date getTemporalDate() {
    return (java.util.Date) getValue("temporal");
  }
  /**
   * The &quot;temporal&quot; property can be used in cases where more specific properties
   * (e.g. [[temporalCoverage]], [[dateCreated]], [[dateModified]], [[datePublished]]) are not known to be appropriate.
   */
  @JsonIgnore public java.util.Collection<java.util.Date> getTemporalDates() {
    final java.lang.Object current = myData.get("temporal");
    if (current == null) return Collections.emptyList();
    if (current instanceof java.util.Collection) {
      return (java.util.Collection<java.util.Date>) current;
    }
    return Arrays.asList((java.util.Date) current);
  }
  /**
   * Indicates the party responsible for generating and publishing the current structured data markup, typically in cases where the structured data is derived automatically from existing published content but published on a different site. For example, student projects and open data initiatives often re-publish existing content with more explicitly structured metadata. The
   * [[sdPublisher]] property helps make such practices more explicit.
   */
  @JsonIgnore public Organization getSdPublisherOrganization() {
    return (Organization) getValue("sdPublisher");
  }
  /**
   * Indicates the party responsible for generating and publishing the current structured data markup, typically in cases where the structured data is derived automatically from existing published content but published on a different site. For example, student projects and open data initiatives often re-publish existing content with more explicitly structured metadata. The
   * [[sdPublisher]] property helps make such practices more explicit.
   */
  @JsonIgnore public java.util.Collection<Organization> getSdPublisherOrganizations() {
    final java.lang.Object current = myData.get("sdPublisher");
    if (current == null) return Collections.emptyList();
    if (current instanceof java.util.Collection) {
      return (java.util.Collection<Organization>) current;
    }
    return Arrays.asList((Organization) current);
  }
  /**
   * Indicates the party responsible for generating and publishing the current structured data markup, typically in cases where the structured data is derived automatically from existing published content but published on a different site. For example, student projects and open data initiatives often re-publish existing content with more explicitly structured metadata. The
   * [[sdPublisher]] property helps make such practices more explicit.
   */
  @JsonIgnore public Person getSdPublisherPerson() {
    return (Person) getValue("sdPublisher");
  }
  /**
   * Indicates the party responsible for generating and publishing the current structured data markup, typically in cases where the structured data is derived automatically from existing published content but published on a different site. For example, student projects and open data initiatives often re-publish existing content with more explicitly structured metadata. The
   * [[sdPublisher]] property helps make such practices more explicit.
   */
  @JsonIgnore public java.util.Collection<Person> getSdPublisherPersons() {
    final java.lang.Object current = myData.get("sdPublisher");
    if (current == null) return Collections.emptyList();
    if (current instanceof java.util.Collection) {
      return (java.util.Collection<Person>) current;
    }
    return Arrays.asList((Person) current);
  }
  /**
   * The predominant type or kind characterizing the learning resource. For example, 'presentation', 'handout'.
   */
  @JsonIgnore public DefinedTerm getLearningResourceTypeDefinedTerm() {
    return (DefinedTerm) getValue("learningResourceType");
  }
  /**
   * The predominant type or kind characterizing the learning resource. For example, 'presentation', 'handout'.
   */
  @JsonIgnore public java.util.Collection<DefinedTerm> getLearningResourceTypeDefinedTerms() {
    final java.lang.Object current = myData.get("learningResourceType");
    if (current == null) return Collections.emptyList();
    if (current instanceof java.util.Collection) {
      return (java.util.Collection<DefinedTerm>) current;
    }
    return Arrays.asList((DefinedTerm) current);
  }
  /**
   * The predominant type or kind characterizing the learning resource. For example, 'presentation', 'handout'.
   */
  @JsonIgnore public String getLearningResourceTypeString() {
    return (String) getValue("learningResourceType");
  }
  /**
   * The predominant type or kind characterizing the learning resource. For example, 'presentation', 'handout'.
   */
  @JsonIgnore public java.util.Collection<String> getLearningResourceTypeStrings() {
    final java.lang.Object current = myData.get("learningResourceType");
    if (current == null) return Collections.emptyList();
    if (current instanceof java.util.Collection) {
      return (java.util.Collection<String>) current;
    }
    return Arrays.asList((String) current);
  }
  /**
   * The specific time described by a creative work, for works (e.g. articles, video objects etc.) that emphasise a particular moment within an Event.
   */
  @JsonIgnore public java.util.Date getContentReferenceTime() {
    return (java.util.Date) getValue("contentReferenceTime");
  }
  /**
   * The specific time described by a creative work, for works (e.g. articles, video objects etc.) that emphasise a particular moment within an Event.
   */
  @JsonIgnore public java.util.Collection<java.util.Date> getContentReferenceTimes() {
    final java.lang.Object current = myData.get("contentReferenceTime");
    if (current == null) return Collections.emptyList();
    if (current instanceof java.util.Collection) {
      return (java.util.Collection<java.util.Date>) current;
    }
    return Arrays.asList((java.util.Date) current);
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
    final java.lang.Object current = myData.get("aggregateRating");
    if (current == null) return Collections.emptyList();
    if (current instanceof java.util.Collection) {
      return (java.util.Collection<AggregateRating>) current;
    }
    return Arrays.asList((AggregateRating) current);
  }
  /**
   * Genre of the creative work, broadcast channel or group.
   */
  @JsonIgnore public Genre getGenre() {
    return (Genre) getValue("genre");
  }
  /**
   * Genre of the creative work, broadcast channel or group.
   */
  @JsonIgnore public java.util.Collection<Genre> getGenres() {
    final java.lang.Object current = myData.get("genre");
    if (current == null) return Collections.emptyList();
    if (current instanceof java.util.Collection) {
      return (java.util.Collection<Genre>) current;
    }
    return Arrays.asList((Genre) current);
  }
  /**
   * A link to the page containing the comments of the CreativeWork.
   */
  @JsonIgnore public String getDiscussionUrl() {
    return (String) getValue("discussionUrl");
  }
  /**
   * A link to the page containing the comments of the CreativeWork.
   */
  @JsonIgnore public java.util.Collection<String> getDiscussionUrls() {
    final java.lang.Object current = myData.get("discussionUrl");
    if (current == null) return Collections.emptyList();
    if (current instanceof java.util.Collection) {
      return (java.util.Collection<String>) current;
    }
    return Arrays.asList((String) current);
  }
  /**
   * An alignment to an established educational framework.
   * 
   * This property should not be used where the nature of the alignment can be described using a simple property, for example to express that a resource [[teaches]] or [[assesses]] a competency.
   */
  @JsonIgnore public AlignmentObject getEducationalAlignment() {
    return (AlignmentObject) getValue("educationalAlignment");
  }
  /**
   * An alignment to an established educational framework.
   * 
   * This property should not be used where the nature of the alignment can be described using a simple property, for example to express that a resource [[teaches]] or [[assesses]] a competency.
   */
  @JsonIgnore public java.util.Collection<AlignmentObject> getEducationalAlignments() {
    final java.lang.Object current = myData.get("educationalAlignment");
    if (current == null) return Collections.emptyList();
    if (current instanceof java.util.Collection) {
      return (java.util.Collection<AlignmentObject>) current;
    }
    return Arrays.asList((AlignmentObject) current);
  }
  /**
   * The date on which the CreativeWork was most recently modified or when the item's entry was modified within a DataFeed.
   */
  @JsonIgnore public java.util.Date getDateModified() {
    return (java.util.Date) getValue("dateModified");
  }
  /**
   * The date on which the CreativeWork was most recently modified or when the item's entry was modified within a DataFeed.
   */
  @JsonIgnore public java.util.Collection<java.util.Date> getDateModifieds() {
    final java.lang.Object current = myData.get("dateModified");
    if (current == null) return Collections.emptyList();
    if (current instanceof java.util.Collection) {
      return (java.util.Collection<java.util.Date>) current;
    }
    return Arrays.asList((java.util.Date) current);
  }
  /**
   * Comments, typically from users.
   */
  @JsonIgnore public Comment getComment() {
    return (Comment) getValue("comment");
  }
  /**
   * Comments, typically from users.
   */
  @JsonIgnore public java.util.Collection<Comment> getComments() {
    final java.lang.Object current = myData.get("comment");
    if (current == null) return Collections.emptyList();
    if (current instanceof java.util.Collection) {
      return (java.util.Collection<Comment>) current;
    }
    return Arrays.asList((Comment) current);
  }
  /**
   * A license document that applies to this structured data, typically indicated by URL.
   */
  @JsonIgnore public CreativeWork getSdLicenseCreativeWork() {
    return (CreativeWork) getValue("sdLicense");
  }
  /**
   * A license document that applies to this structured data, typically indicated by URL.
   */
  @JsonIgnore public java.util.Collection<CreativeWork> getSdLicenseCreativeWorks() {
    final java.lang.Object current = myData.get("sdLicense");
    if (current == null) return Collections.emptyList();
    if (current instanceof java.util.Collection) {
      return (java.util.Collection<CreativeWork>) current;
    }
    return Arrays.asList((CreativeWork) current);
  }
  /**
   * A license document that applies to this structured data, typically indicated by URL.
   */
  @JsonIgnore public String getSdLicenseString() {
    return (String) getValue("sdLicense");
  }
  /**
   * A license document that applies to this structured data, typically indicated by URL.
   */
  @JsonIgnore public java.util.Collection<String> getSdLicenseStrings() {
    final java.lang.Object current = myData.get("sdLicense");
    if (current == null) return Collections.emptyList();
    if (current instanceof java.util.Collection) {
      return (java.util.Collection<String>) current;
    }
    return Arrays.asList((String) current);
  }
  /**
   * The position of an item in a series or sequence of items.
   */
  @JsonIgnore public Integer getPositionInteger() {
    return (Integer) getValue("position");
  }
  /**
   * The position of an item in a series or sequence of items.
   */
  @JsonIgnore public java.util.Collection<Integer> getPositionIntegers() {
    final java.lang.Object current = myData.get("position");
    if (current == null) return Collections.emptyList();
    if (current instanceof java.util.Collection) {
      return (java.util.Collection<Integer>) current;
    }
    return Arrays.asList((Integer) current);
  }
  /**
   * The position of an item in a series or sequence of items.
   */
  @JsonIgnore public String getPositionString() {
    return (String) getValue("position");
  }
  /**
   * The position of an item in a series or sequence of items.
   */
  @JsonIgnore public java.util.Collection<String> getPositionStrings() {
    final java.lang.Object current = myData.get("position");
    if (current == null) return Collections.emptyList();
    if (current instanceof java.util.Collection) {
      return (java.util.Collection<String>) current;
    }
    return Arrays.asList((String) current);
  }
  /**
   * A media object that encodes this CreativeWork. This property is a synonym for encoding.
   */
  @JsonIgnore public MediaObject getAssociatedMedia() {
    return (MediaObject) getValue("associatedMedia");
  }
  /**
   * A media object that encodes this CreativeWork. This property is a synonym for encoding.
   */
  @JsonIgnore public java.util.Collection<MediaObject> getAssociatedMedias() {
    final java.lang.Object current = myData.get("associatedMedia");
    if (current == null) return Collections.emptyList();
    if (current instanceof java.util.Collection) {
      return (java.util.Collection<MediaObject>) current;
    }
    return Arrays.asList((MediaObject) current);
  }
  /**
   * Headline of the article.
   */
  @JsonIgnore public String getHeadline() {
    return (String) getValue("headline");
  }
  /**
   * Headline of the article.
   */
  @JsonIgnore public java.util.Collection<String> getHeadlines() {
    final java.lang.Object current = myData.get("headline");
    if (current == null) return Collections.emptyList();
    if (current instanceof java.util.Collection) {
      return (java.util.Collection<String>) current;
    }
    return Arrays.asList((String) current);
  }
  /**
   * An embedded audio object.
   */
  @JsonIgnore public AudioObject getAudioAudioObject() {
    return (AudioObject) getValue("audio");
  }
  /**
   * An embedded audio object.
   */
  @JsonIgnore public java.util.Collection<AudioObject> getAudioAudioObjects() {
    final java.lang.Object current = myData.get("audio");
    if (current == null) return Collections.emptyList();
    if (current instanceof java.util.Collection) {
      return (java.util.Collection<AudioObject>) current;
    }
    return Arrays.asList((AudioObject) current);
  }
  /**
   * An embedded audio object.
   */
  @JsonIgnore public Clip getAudioClip() {
    return (Clip) getValue("audio");
  }
  /**
   * An embedded audio object.
   */
  @JsonIgnore public java.util.Collection<Clip> getAudioClips() {
    final java.lang.Object current = myData.get("audio");
    if (current == null) return Collections.emptyList();
    if (current instanceof java.util.Collection) {
      return (java.util.Collection<Clip>) current;
    }
    return Arrays.asList((Clip) current);
  }
  /**
   * An embedded audio object.
   */
  @JsonIgnore public MusicRecording getAudioMusicRecording() {
    return (MusicRecording) getValue("audio");
  }
  /**
   * An embedded audio object.
   */
  @JsonIgnore public java.util.Collection<MusicRecording> getAudioMusicRecordings() {
    final java.lang.Object current = myData.get("audio");
    if (current == null) return Collections.emptyList();
    if (current instanceof java.util.Collection) {
      return (java.util.Collection<MusicRecording>) current;
    }
    return Arrays.asList((MusicRecording) current);
  }
  /**
   * The status of a creative work in terms of its stage in a lifecycle. Example terms include Incomplete, Draft, Published, Obsolete. Some organizations define a set of terms for the stages of their publication lifecycle.
   */
  @JsonIgnore public DefinedTerm getCreativeWorkStatusDefinedTerm() {
    return (DefinedTerm) getValue("creativeWorkStatus");
  }
  /**
   * The status of a creative work in terms of its stage in a lifecycle. Example terms include Incomplete, Draft, Published, Obsolete. Some organizations define a set of terms for the stages of their publication lifecycle.
   */
  @JsonIgnore public java.util.Collection<DefinedTerm> getCreativeWorkStatusDefinedTerms() {
    final java.lang.Object current = myData.get("creativeWorkStatus");
    if (current == null) return Collections.emptyList();
    if (current instanceof java.util.Collection) {
      return (java.util.Collection<DefinedTerm>) current;
    }
    return Arrays.asList((DefinedTerm) current);
  }
  /**
   * The status of a creative work in terms of its stage in a lifecycle. Example terms include Incomplete, Draft, Published, Obsolete. Some organizations define a set of terms for the stages of their publication lifecycle.
   */
  @JsonIgnore public String getCreativeWorkStatusString() {
    return (String) getValue("creativeWorkStatus");
  }
  /**
   * The status of a creative work in terms of its stage in a lifecycle. Example terms include Incomplete, Draft, Published, Obsolete. Some organizations define a set of terms for the stages of their publication lifecycle.
   */
  @JsonIgnore public java.util.Collection<String> getCreativeWorkStatusStrings() {
    final java.lang.Object current = myData.get("creativeWorkStatus");
    if (current == null) return Collections.emptyList();
    if (current instanceof java.util.Collection) {
      return (java.util.Collection<String>) current;
    }
    return Arrays.asList((String) current);
  }
  /**
   * Text of a notice appropriate for describing the copyright aspects of this Creative Work, ideally indicating the owner of the copyright for the Work.
   */
  @JsonIgnore public String getCopyrightNotice() {
    return (String) getValue("copyrightNotice");
  }
  /**
   * Text of a notice appropriate for describing the copyright aspects of this Creative Work, ideally indicating the owner of the copyright for the Work.
   */
  @JsonIgnore public java.util.Collection<String> getCopyrightNotices() {
    final java.lang.Object current = myData.get("copyrightNotice");
    if (current == null) return Collections.emptyList();
    if (current instanceof java.util.Collection) {
      return (java.util.Collection<String>) current;
    }
    return Arrays.asList((String) current);
  }
  /**
   * The creator/author of this CreativeWork. This is the same as the Author property for CreativeWork.
   */
  @JsonIgnore public Creator getCreator() {
    return (Creator) getValue("creator");
  }
  /**
   * The creator/author of this CreativeWork. This is the same as the Author property for CreativeWork.
   */
  @JsonIgnore public java.util.Collection<Creator> getCreators() {
    final java.lang.Object current = myData.get("creator");
    if (current == null) return Collections.emptyList();
    if (current instanceof java.util.Collection) {
      return (java.util.Collection<Creator>) current;
    }
    return Arrays.asList((Creator) current);
  }
  /**
   * The schema.org [[usageInfo]] property indicates further information about a [[CreativeWork]]. This property is applicable both to works that are freely available and to those that require payment or other transactions. It can reference additional information e.g. community expectations on preferred linking and citation conventions, as well as purchasing details. For something that can be commercially licensed, usageInfo can provide detailed, resource-specific information about licensing options.
   * 
   * This property can be used alongside the license property which indicates license(s) applicable to some piece of content. The usageInfo property can provide information about other licensing options, e.g. acquiring commercial usage rights for an image that is also available under non-commercial creative commons licenses.
   */
  @JsonIgnore public UsageInfo getUsageInfo() {
    return (UsageInfo) getValue("usageInfo");
  }
  /**
   * The schema.org [[usageInfo]] property indicates further information about a [[CreativeWork]]. This property is applicable both to works that are freely available and to those that require payment or other transactions. It can reference additional information e.g. community expectations on preferred linking and citation conventions, as well as purchasing details. For something that can be commercially licensed, usageInfo can provide detailed, resource-specific information about licensing options.
   * 
   * This property can be used alongside the license property which indicates license(s) applicable to some piece of content. The usageInfo property can provide information about other licensing options, e.g. acquiring commercial usage rights for an image that is also available under non-commercial creative commons licenses.
   */
  @JsonIgnore public java.util.Collection<UsageInfo> getUsageInfos() {
    final java.lang.Object current = myData.get("usageInfo");
    if (current == null) return Collections.emptyList();
    if (current instanceof java.util.Collection) {
      return (java.util.Collection<UsageInfo>) current;
    }
    return Arrays.asList((UsageInfo) current);
  }
  /**
   * Indicates a page documenting how licenses can be purchased or otherwise acquired, for the current item.
   */
  @JsonIgnore public UsageInfo getAcquireLicensePage() {
    return (UsageInfo) getValue("acquireLicensePage");
  }
  /**
   * Indicates a page documenting how licenses can be purchased or otherwise acquired, for the current item.
   */
  @JsonIgnore public java.util.Collection<UsageInfo> getAcquireLicensePages() {
    final java.lang.Object current = myData.get("acquireLicensePage");
    if (current == null) return Collections.emptyList();
    if (current instanceof java.util.Collection) {
      return (java.util.Collection<UsageInfo>) current;
    }
    return Arrays.asList((UsageInfo) current);
  }
  /**
   * A flag to signal that the item, event, or place is accessible for free.
   */
  @JsonIgnore public Boolean getIsAccessibleForFree() {
    return (Boolean) getValue("isAccessibleForFree");
  }
  /**
   * A flag to signal that the item, event, or place is accessible for free.
   */
  @JsonIgnore public java.util.Collection<Boolean> getIsAccessibleForFrees() {
    final java.lang.Object current = myData.get("isAccessibleForFree");
    if (current == null) return Collections.emptyList();
    if (current instanceof java.util.Collection) {
      return (java.util.Collection<Boolean>) current;
    }
    return Arrays.asList((Boolean) current);
  }
  /**
   * An [EIDR](https://eidr.org/) (Entertainment Identifier Registry) [[identifier]] representing a specific edit / edition for a work of film or television.
   * 
   * For example, the motion picture known as &quot;Ghostbusters&quot; whose [[titleEIDR]] is &quot;10.5240/7EC7-228A-510A-053E-CBB8-J&quot;, has several edits e.g. &quot;10.5240/1F2A-E1C5-680A-14C6-E76B-I&quot; and &quot;10.5240/8A35-3BEE-6497-5D12-9E4F-3&quot;.
   * 
   * Since schema.org types like [[Movie]] and [[TVEpisode]] can be used for both works and their multiple expressions, it is possible to use [[titleEIDR]] alone (for a general description), or alongside [[editEIDR]] for a more edit-specific description.
   * 
   */
  @JsonIgnore public Identifier getEditEIDR() {
    return (Identifier) getValue("editEIDR");
  }
  /**
   * An [EIDR](https://eidr.org/) (Entertainment Identifier Registry) [[identifier]] representing a specific edit / edition for a work of film or television.
   * 
   * For example, the motion picture known as &quot;Ghostbusters&quot; whose [[titleEIDR]] is &quot;10.5240/7EC7-228A-510A-053E-CBB8-J&quot;, has several edits e.g. &quot;10.5240/1F2A-E1C5-680A-14C6-E76B-I&quot; and &quot;10.5240/8A35-3BEE-6497-5D12-9E4F-3&quot;.
   * 
   * Since schema.org types like [[Movie]] and [[TVEpisode]] can be used for both works and their multiple expressions, it is possible to use [[titleEIDR]] alone (for a general description), or alongside [[editEIDR]] for a more edit-specific description.
   * 
   */
  @JsonIgnore public java.util.Collection<Identifier> getEditEIDRs() {
    final java.lang.Object current = myData.get("editEIDR");
    if (current == null) return Collections.emptyList();
    if (current instanceof java.util.Collection) {
      return (java.util.Collection<Identifier>) current;
    }
    return Arrays.asList((Identifier) current);
  }
  /**
   * The version of the CreativeWork embodied by a specified resource.
   */
  @JsonIgnore public Number getVersionNumber() {
    return (Number) getValue("version");
  }
  /**
   * The version of the CreativeWork embodied by a specified resource.
   */
  @JsonIgnore public java.util.Collection<Number> getVersionNumbers() {
    final java.lang.Object current = myData.get("version");
    if (current == null) return Collections.emptyList();
    if (current instanceof java.util.Collection) {
      return (java.util.Collection<Number>) current;
    }
    return Arrays.asList((Number) current);
  }
  /**
   * The version of the CreativeWork embodied by a specified resource.
   */
  @JsonIgnore public String getVersionString() {
    return (String) getValue("version");
  }
  /**
   * The version of the CreativeWork embodied by a specified resource.
   */
  @JsonIgnore public java.util.Collection<String> getVersionStrings() {
    final java.lang.Object current = myData.get("version");
    if (current == null) return Collections.emptyList();
    if (current instanceof java.util.Collection) {
      return (java.util.Collection<String>) current;
    }
    return Arrays.asList((String) current);
  }
  /**
   * A list of single or combined accessModes that are sufficient to understand all the intellectual content of a resource. Expected values include:  auditory, tactile, textual, visual.
   *       
   */
  @JsonIgnore public ItemList getAccessModeSufficient() {
    return (ItemList) getValue("accessModeSufficient");
  }
  /**
   * A list of single or combined accessModes that are sufficient to understand all the intellectual content of a resource. Expected values include:  auditory, tactile, textual, visual.
   *       
   */
  @JsonIgnore public java.util.Collection<ItemList> getAccessModeSufficients() {
    final java.lang.Object current = myData.get("accessModeSufficient");
    if (current == null) return Collections.emptyList();
    if (current instanceof java.util.Collection) {
      return (java.util.Collection<ItemList>) current;
    }
    return Arrays.asList((ItemList) current);
  }
  /**
   * A resource from which this work is derived or from which it is a modification or adaption.
   */
  @JsonIgnore public CreativeWork getIsBasedOnCreativeWork() {
    return (CreativeWork) getValue("isBasedOn");
  }
  /**
   * A resource from which this work is derived or from which it is a modification or adaption.
   */
  @JsonIgnore public java.util.Collection<CreativeWork> getIsBasedOnCreativeWorks() {
    final java.lang.Object current = myData.get("isBasedOn");
    if (current == null) return Collections.emptyList();
    if (current instanceof java.util.Collection) {
      return (java.util.Collection<CreativeWork>) current;
    }
    return Arrays.asList((CreativeWork) current);
  }
  /**
   * A resource from which this work is derived or from which it is a modification or adaption.
   */
  @JsonIgnore public Product getIsBasedOnProduct() {
    return (Product) getValue("isBasedOn");
  }
  /**
   * A resource from which this work is derived or from which it is a modification or adaption.
   */
  @JsonIgnore public java.util.Collection<Product> getIsBasedOnProducts() {
    final java.lang.Object current = myData.get("isBasedOn");
    if (current == null) return Collections.emptyList();
    if (current instanceof java.util.Collection) {
      return (java.util.Collection<Product>) current;
    }
    return Arrays.asList((Product) current);
  }
  /**
   * A resource from which this work is derived or from which it is a modification or adaption.
   */
  @JsonIgnore public String getIsBasedOnString() {
    return (String) getValue("isBasedOn");
  }
  /**
   * A resource from which this work is derived or from which it is a modification or adaption.
   */
  @JsonIgnore public java.util.Collection<String> getIsBasedOnStrings() {
    final java.lang.Object current = myData.get("isBasedOn");
    if (current == null) return Collections.emptyList();
    if (current instanceof java.util.Collection) {
      return (java.util.Collection<String>) current;
    }
    return Arrays.asList((String) current);
  }
  /**
   * An embedded video object.
   */
  @JsonIgnore public Clip getVideoClip() {
    return (Clip) getValue("video");
  }
  /**
   * An embedded video object.
   */
  @JsonIgnore public java.util.Collection<Clip> getVideoClips() {
    final java.lang.Object current = myData.get("video");
    if (current == null) return Collections.emptyList();
    if (current instanceof java.util.Collection) {
      return (java.util.Collection<Clip>) current;
    }
    return Arrays.asList((Clip) current);
  }
  /**
   * An embedded video object.
   */
  @JsonIgnore public VideoObject getVideoVideoObject() {
    return (VideoObject) getValue("video");
  }
  /**
   * An embedded video object.
   */
  @JsonIgnore public java.util.Collection<VideoObject> getVideoVideoObjects() {
    final java.lang.Object current = myData.get("video");
    if (current == null) return Collections.emptyList();
    if (current instanceof java.util.Collection) {
      return (java.util.Collection<VideoObject>) current;
    }
    return Arrays.asList((VideoObject) current);
  }
  /**
   * Date the content expires and is no longer useful or available. For example a [[VideoObject]] or [[NewsArticle]] whose availability or relevance is time-limited, or a [[ClaimReview]] fact check whose publisher wants to indicate that it may no longer be relevant (or helpful to highlight) after some date.
   */
  @JsonIgnore public java.util.Date getExpires() {
    return (java.util.Date) getValue("expires");
  }
  /**
   * Date the content expires and is no longer useful or available. For example a [[VideoObject]] or [[NewsArticle]] whose availability or relevance is time-limited, or a [[ClaimReview]] fact check whose publisher wants to indicate that it may no longer be relevant (or helpful to highlight) after some date.
   */
  @JsonIgnore public java.util.Collection<java.util.Date> getExpiress() {
    final java.lang.Object current = myData.get("expires");
    if (current == null) return Collections.emptyList();
    if (current instanceof java.util.Collection) {
      return (java.util.Collection<java.util.Date>) current;
    }
    return Arrays.asList((java.util.Date) current);
  }
  /**
   * Text that can be used to credit person(s) and/or organization(s) associated with a published Creative Work.
   */
  @JsonIgnore public String getCreditText() {
    return (String) getValue("creditText");
  }
  /**
   * Text that can be used to credit person(s) and/or organization(s) associated with a published Creative Work.
   */
  @JsonIgnore public java.util.Collection<String> getCreditTexts() {
    final java.lang.Object current = myData.get("creditText");
    if (current == null) return Collections.emptyList();
    if (current instanceof java.util.Collection) {
      return (java.util.Collection<String>) current;
    }
    return Arrays.asList((String) current);
  }
  /**
   * A secondary contributor to the CreativeWork or Event.
   */
  @JsonIgnore public Organization getContributorOrganization() {
    return (Organization) getValue("contributor");
  }
  /**
   * A secondary contributor to the CreativeWork or Event.
   */
  @JsonIgnore public java.util.Collection<Organization> getContributorOrganizations() {
    final java.lang.Object current = myData.get("contributor");
    if (current == null) return Collections.emptyList();
    if (current instanceof java.util.Collection) {
      return (java.util.Collection<Organization>) current;
    }
    return Arrays.asList((Organization) current);
  }
  /**
   * A secondary contributor to the CreativeWork or Event.
   */
  @JsonIgnore public Person getContributorPerson() {
    return (Person) getValue("contributor");
  }
  /**
   * A secondary contributor to the CreativeWork or Event.
   */
  @JsonIgnore public java.util.Collection<Person> getContributorPersons() {
    final java.lang.Object current = myData.get("contributor");
    if (current == null) return Collections.emptyList();
    if (current instanceof java.util.Collection) {
      return (java.util.Collection<Person>) current;
    }
    return Arrays.asList((Person) current);
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
    final java.lang.Object current = myData.get("audience");
    if (current == null) return Collections.emptyList();
    if (current instanceof java.util.Collection) {
      return (java.util.Collection<Audience>) current;
    }
    return Arrays.asList((Audience) current);
  }
  /**
   * Date of first broadcast/publication.
   */
  @JsonIgnore public java.util.Date getDatePublished() {
    return (java.util.Date) getValue("datePublished");
  }
  /**
   * Date of first broadcast/publication.
   */
  @JsonIgnore public java.util.Collection<java.util.Date> getDatePublisheds() {
    final java.lang.Object current = myData.get("datePublished");
    if (current == null) return Collections.emptyList();
    if (current instanceof java.util.Collection) {
      return (java.util.Collection<java.util.Date>) current;
    }
    return Arrays.asList((java.util.Date) current);
  }
  /**
   * The party holding the legal copyright to the CreativeWork.
   */
  @JsonIgnore public Organization getCopyrightHolderOrganization() {
    return (Organization) getValue("copyrightHolder");
  }
  /**
   * The party holding the legal copyright to the CreativeWork.
   */
  @JsonIgnore public java.util.Collection<Organization> getCopyrightHolderOrganizations() {
    final java.lang.Object current = myData.get("copyrightHolder");
    if (current == null) return Collections.emptyList();
    if (current instanceof java.util.Collection) {
      return (java.util.Collection<Organization>) current;
    }
    return Arrays.asList((Organization) current);
  }
  /**
   * The party holding the legal copyright to the CreativeWork.
   */
  @JsonIgnore public Person getCopyrightHolderPerson() {
    return (Person) getValue("copyrightHolder");
  }
  /**
   * The party holding the legal copyright to the CreativeWork.
   */
  @JsonIgnore public java.util.Collection<Person> getCopyrightHolderPersons() {
    final java.lang.Object current = myData.get("copyrightHolder");
    if (current == null) return Collections.emptyList();
    if (current instanceof java.util.Collection) {
      return (java.util.Collection<Person>) current;
    }
    return Arrays.asList((Person) current);
  }
  /**
   * The author of this content or rating. Please note that author is special in that HTML 5 provides a special mechanism for indicating authorship via the rel tag. That is equivalent to this and may be used interchangeably.
   */
  @JsonIgnore public Organization getAuthorOrganization() {
    return (Organization) getValue("author");
  }
  /**
   * The author of this content or rating. Please note that author is special in that HTML 5 provides a special mechanism for indicating authorship via the rel tag. That is equivalent to this and may be used interchangeably.
   */
  @JsonIgnore public java.util.Collection<Organization> getAuthorOrganizations() {
    final java.lang.Object current = myData.get("author");
    if (current == null) return Collections.emptyList();
    if (current instanceof java.util.Collection) {
      return (java.util.Collection<Organization>) current;
    }
    return Arrays.asList((Organization) current);
  }
  /**
   * The author of this content or rating. Please note that author is special in that HTML 5 provides a special mechanism for indicating authorship via the rel tag. That is equivalent to this and may be used interchangeably.
   */
  @JsonIgnore public Person getAuthorPerson() {
    return (Person) getValue("author");
  }
  /**
   * The author of this content or rating. Please note that author is special in that HTML 5 provides a special mechanism for indicating authorship via the rel tag. That is equivalent to this and may be used interchangeably.
   */
  @JsonIgnore public java.util.Collection<Person> getAuthorPersons() {
    final java.lang.Object current = myData.get("author");
    if (current == null) return Collections.emptyList();
    if (current instanceof java.util.Collection) {
      return (java.util.Collection<Person>) current;
    }
    return Arrays.asList((Person) current);
  }
  /**
   * A publication event associated with the item.
   */
  @JsonIgnore public PublicationEvent getPublication() {
    return (PublicationEvent) getValue("publication");
  }
  /**
   * A publication event associated with the item.
   */
  @JsonIgnore public java.util.Collection<PublicationEvent> getPublications() {
    final java.lang.Object current = myData.get("publication");
    if (current == null) return Collections.emptyList();
    if (current instanceof java.util.Collection) {
      return (java.util.Collection<PublicationEvent>) current;
    }
    return Arrays.asList((PublicationEvent) current);
  }
  /**
   * A license document that applies to this content, typically indicated by URL.
   */
  @JsonIgnore public CreativeWork getLicenseCreativeWork() {
    return (CreativeWork) getValue("license");
  }
  /**
   * A license document that applies to this content, typically indicated by URL.
   */
  @JsonIgnore public java.util.Collection<CreativeWork> getLicenseCreativeWorks() {
    final java.lang.Object current = myData.get("license");
    if (current == null) return Collections.emptyList();
    if (current instanceof java.util.Collection) {
      return (java.util.Collection<CreativeWork>) current;
    }
    return Arrays.asList((CreativeWork) current);
  }
  /**
   * A license document that applies to this content, typically indicated by URL.
   */
  @JsonIgnore public String getLicenseString() {
    return (String) getValue("license");
  }
  /**
   * A license document that applies to this content, typically indicated by URL.
   */
  @JsonIgnore public java.util.Collection<String> getLicenseStrings() {
    final java.lang.Object current = myData.get("license");
    if (current == null) return Collections.emptyList();
    if (current instanceof java.util.Collection) {
      return (java.util.Collection<String>) current;
    }
    return Arrays.asList((String) current);
  }
  /**
   * Media type typically expressed using a MIME format (see [IANA site](http://www.iana.org/assignments/media-types/media-types.xhtml) and [MDN reference](https://developer.mozilla.org/en-US/docs/Web/HTTP/Basics_of_HTTP/MIME_types)) e.g. application/zip for a SoftwareApplication binary, audio/mpeg for .mp3 etc.).
   * 
   * In cases where a [[CreativeWork]] has several media type representations, [[encoding]] can be used to indicate each [[MediaObject]] alongside particular [[encodingFormat]] information.
   * 
   * Unregistered or niche encoding and file formats can be indicated instead via the most appropriate URL, e.g. defining Web page or a Wikipedia/Wikidata entry.
   */
  @JsonIgnore public String getEncodingFormat() {
    return (String) getValue("encodingFormat");
  }
  /**
   * Media type typically expressed using a MIME format (see [IANA site](http://www.iana.org/assignments/media-types/media-types.xhtml) and [MDN reference](https://developer.mozilla.org/en-US/docs/Web/HTTP/Basics_of_HTTP/MIME_types)) e.g. application/zip for a SoftwareApplication binary, audio/mpeg for .mp3 etc.).
   * 
   * In cases where a [[CreativeWork]] has several media type representations, [[encoding]] can be used to indicate each [[MediaObject]] alongside particular [[encodingFormat]] information.
   * 
   * Unregistered or niche encoding and file formats can be indicated instead via the most appropriate URL, e.g. defining Web page or a Wikipedia/Wikidata entry.
   */
  @JsonIgnore public java.util.Collection<String> getEncodingFormats() {
    final java.lang.Object current = myData.get("encodingFormat");
    if (current == null) return Collections.emptyList();
    if (current instanceof java.util.Collection) {
      return (java.util.Collection<String>) current;
    }
    return Arrays.asList((String) current);
  }
  /**
   * Fictional person connected with a creative work.
   */
  @JsonIgnore public Person getCharacter() {
    return (Person) getValue("character");
  }
  /**
   * Fictional person connected with a creative work.
   */
  @JsonIgnore public java.util.Collection<Person> getCharacters() {
    final java.lang.Object current = myData.get("character");
    if (current == null) return Collections.emptyList();
    if (current instanceof java.util.Collection) {
      return (java.util.Collection<Person>) current;
    }
    return Arrays.asList((Person) current);
  }
  /**
   * The quantity of the materials being described or an expression of the physical space they occupy.
   */
  @JsonIgnore public QuantitativeValue getMaterialExtentQuantitativeValue() {
    return (QuantitativeValue) getValue("materialExtent");
  }
  /**
   * The quantity of the materials being described or an expression of the physical space they occupy.
   */
  @JsonIgnore public java.util.Collection<QuantitativeValue> getMaterialExtentQuantitativeValues() {
    final java.lang.Object current = myData.get("materialExtent");
    if (current == null) return Collections.emptyList();
    if (current instanceof java.util.Collection) {
      return (java.util.Collection<QuantitativeValue>) current;
    }
    return Arrays.asList((QuantitativeValue) current);
  }
  /**
   * The quantity of the materials being described or an expression of the physical space they occupy.
   */
  @JsonIgnore public String getMaterialExtentString() {
    return (String) getValue("materialExtent");
  }
  /**
   * The quantity of the materials being described or an expression of the physical space they occupy.
   */
  @JsonIgnore public java.util.Collection<String> getMaterialExtentStrings() {
    final java.lang.Object current = myData.get("materialExtent");
    if (current == null) return Collections.emptyList();
    if (current instanceof java.util.Collection) {
      return (java.util.Collection<String>) current;
    }
    return Arrays.asList((String) current);
  }
  /**
   * Content features of the resource, such as accessible media, alternatives and supported enhancements for accessibility ([WebSchemas wiki lists possible values](http://www.w3.org/wiki/WebSchemas/Accessibility)).
   */
  @JsonIgnore public String getAccessibilityFeature() {
    return (String) getValue("accessibilityFeature");
  }
  /**
   * Content features of the resource, such as accessible media, alternatives and supported enhancements for accessibility ([WebSchemas wiki lists possible values](http://www.w3.org/wiki/WebSchemas/Accessibility)).
   */
  @JsonIgnore public java.util.Collection<String> getAccessibilityFeatures() {
    final java.lang.Object current = myData.get("accessibilityFeature");
    if (current == null) return Collections.emptyList();
    if (current instanceof java.util.Collection) {
      return (java.util.Collection<String>) current;
    }
    return Arrays.asList((String) current);
  }
  /**
   * A characteristic of the described resource that is physiologically dangerous to some users. Related to WCAG 2.0 guideline 2.3 ([WebSchemas wiki lists possible values](http://www.w3.org/wiki/WebSchemas/Accessibility)).
   */
  @JsonIgnore public String getAccessibilityHazard() {
    return (String) getValue("accessibilityHazard");
  }
  /**
   * A characteristic of the described resource that is physiologically dangerous to some users. Related to WCAG 2.0 guideline 2.3 ([WebSchemas wiki lists possible values](http://www.w3.org/wiki/WebSchemas/Accessibility)).
   */
  @JsonIgnore public java.util.Collection<String> getAccessibilityHazards() {
    final java.lang.Object current = myData.get("accessibilityHazard");
    if (current == null) return Collections.emptyList();
    if (current instanceof java.util.Collection) {
      return (java.util.Collection<String>) current;
    }
    return Arrays.asList((String) current);
  }
  /**
   * Indicates an item or CreativeWork that this item, or CreativeWork (in some sense), is part of.
   */
  @JsonIgnore public IsPartOf getIsPartOf() {
    return (IsPartOf) getValue("isPartOf");
  }
  /**
   * Indicates an item or CreativeWork that this item, or CreativeWork (in some sense), is part of.
   */
  @JsonIgnore public java.util.Collection<IsPartOf> getIsPartOfs() {
    final java.lang.Object current = myData.get("isPartOf");
    if (current == null) return Collections.emptyList();
    if (current instanceof java.util.Collection) {
      return (java.util.Collection<IsPartOf>) current;
    }
    return Arrays.asList((IsPartOf) current);
  }
  /**
   * Indicates that the resource is compatible with the referenced accessibility API ([WebSchemas wiki lists possible values](http://www.w3.org/wiki/WebSchemas/Accessibility)).
   */
  @JsonIgnore public String getAccessibilityAPI() {
    return (String) getValue("accessibilityAPI");
  }
  /**
   * Indicates that the resource is compatible with the referenced accessibility API ([WebSchemas wiki lists possible values](http://www.w3.org/wiki/WebSchemas/Accessibility)).
   */
  @JsonIgnore public java.util.Collection<String> getAccessibilityAPIs() {
    final java.lang.Object current = myData.get("accessibilityAPI");
    if (current == null) return Collections.emptyList();
    if (current instanceof java.util.Collection) {
      return (java.util.Collection<String>) current;
    }
    return Arrays.asList((String) current);
  }
  /**
   * Example/instance/realization/derivation of the concept of this creative work. eg. The paperback edition, first edition, or eBook.
   */
  @JsonIgnore public WorkExample getWorkExample() {
    return (WorkExample) getValue("workExample");
  }
  /**
   * Example/instance/realization/derivation of the concept of this creative work. eg. The paperback edition, first edition, or eBook.
   */
  @JsonIgnore public java.util.Collection<WorkExample> getWorkExamples() {
    final java.lang.Object current = myData.get("workExample");
    if (current == null) return Collections.emptyList();
    if (current instanceof java.util.Collection) {
      return (java.util.Collection<WorkExample>) current;
    }
    return Arrays.asList((WorkExample) current);
  }
  /**
   * The item being described is intended to help a person learn the competency or learning outcome defined by the referenced term.
   */
  @JsonIgnore public DefinedTerm getTeachesDefinedTerm() {
    return (DefinedTerm) getValue("teaches");
  }
  /**
   * The item being described is intended to help a person learn the competency or learning outcome defined by the referenced term.
   */
  @JsonIgnore public java.util.Collection<DefinedTerm> getTeachesDefinedTerms() {
    final java.lang.Object current = myData.get("teaches");
    if (current == null) return Collections.emptyList();
    if (current instanceof java.util.Collection) {
      return (java.util.Collection<DefinedTerm>) current;
    }
    return Arrays.asList((DefinedTerm) current);
  }
  /**
   * The item being described is intended to help a person learn the competency or learning outcome defined by the referenced term.
   */
  @JsonIgnore public String getTeachesString() {
    return (String) getValue("teaches");
  }
  /**
   * The item being described is intended to help a person learn the competency or learning outcome defined by the referenced term.
   */
  @JsonIgnore public java.util.Collection<String> getTeachesStrings() {
    final java.lang.Object current = myData.get("teaches");
    if (current == null) return Collections.emptyList();
    if (current instanceof java.util.Collection) {
      return (java.util.Collection<String>) current;
    }
    return Arrays.asList((String) current);
  }
  /**
   * The publisher of the creative work.
   */
  @JsonIgnore public Organization getPublisherOrganization() {
    return (Organization) getValue("publisher");
  }
  /**
   * The publisher of the creative work.
   */
  @JsonIgnore public java.util.Collection<Organization> getPublisherOrganizations() {
    final java.lang.Object current = myData.get("publisher");
    if (current == null) return Collections.emptyList();
    if (current instanceof java.util.Collection) {
      return (java.util.Collection<Organization>) current;
    }
    return Arrays.asList((Organization) current);
  }
  /**
   * The publisher of the creative work.
   */
  @JsonIgnore public Person getPublisherPerson() {
    return (Person) getValue("publisher");
  }
  /**
   * The publisher of the creative work.
   */
  @JsonIgnore public java.util.Collection<Person> getPublisherPersons() {
    final java.lang.Object current = myData.get("publisher");
    if (current == null) return Collections.emptyList();
    if (current instanceof java.util.Collection) {
      return (java.util.Collection<Person>) current;
    }
    return Arrays.asList((Person) current);
  }
  /**
   * The temporalCoverage of a CreativeWork indicates the period that the content applies to, i.e. that it describes, either as a DateTime or as a textual string indicating a time period in [ISO 8601 time interval format](https://en.wikipedia.org/wiki/ISO_8601#Time_intervals). In
   *       the case of a Dataset it will typically indicate the relevant time period in a precise notation (e.g. for a 2011 census dataset, the year 2011 would be written &quot;2011/2012&quot;). Other forms of content e.g. ScholarlyArticle, Book, TVSeries or TVEpisode may indicate their temporalCoverage in broader terms - textually or via well-known URL.
   *       Written works such as books may sometimes have precise temporal coverage too, e.g. a work set in 1939 - 1945 can be indicated in ISO 8601 interval format format via &quot;1939/1945&quot;.
   * 
   * Open-ended date ranges can be written with &quot;..&quot; in place of the end date. For example, &quot;2015-11/..&quot; indicates a range beginning in November 2015 and with no specified final date. This is tentative and might be updated in future when ISO 8601 is officially updated.
   */
  @JsonIgnore public String getTemporalCoverageString() {
    return (String) getValue("temporalCoverage");
  }
  /**
   * The temporalCoverage of a CreativeWork indicates the period that the content applies to, i.e. that it describes, either as a DateTime or as a textual string indicating a time period in [ISO 8601 time interval format](https://en.wikipedia.org/wiki/ISO_8601#Time_intervals). In
   *       the case of a Dataset it will typically indicate the relevant time period in a precise notation (e.g. for a 2011 census dataset, the year 2011 would be written &quot;2011/2012&quot;). Other forms of content e.g. ScholarlyArticle, Book, TVSeries or TVEpisode may indicate their temporalCoverage in broader terms - textually or via well-known URL.
   *       Written works such as books may sometimes have precise temporal coverage too, e.g. a work set in 1939 - 1945 can be indicated in ISO 8601 interval format format via &quot;1939/1945&quot;.
   * 
   * Open-ended date ranges can be written with &quot;..&quot; in place of the end date. For example, &quot;2015-11/..&quot; indicates a range beginning in November 2015 and with no specified final date. This is tentative and might be updated in future when ISO 8601 is officially updated.
   */
  @JsonIgnore public java.util.Collection<String> getTemporalCoverageStrings() {
    final java.lang.Object current = myData.get("temporalCoverage");
    if (current == null) return Collections.emptyList();
    if (current instanceof java.util.Collection) {
      return (java.util.Collection<String>) current;
    }
    return Arrays.asList((String) current);
  }
  /**
   * The temporalCoverage of a CreativeWork indicates the period that the content applies to, i.e. that it describes, either as a DateTime or as a textual string indicating a time period in [ISO 8601 time interval format](https://en.wikipedia.org/wiki/ISO_8601#Time_intervals). In
   *       the case of a Dataset it will typically indicate the relevant time period in a precise notation (e.g. for a 2011 census dataset, the year 2011 would be written &quot;2011/2012&quot;). Other forms of content e.g. ScholarlyArticle, Book, TVSeries or TVEpisode may indicate their temporalCoverage in broader terms - textually or via well-known URL.
   *       Written works such as books may sometimes have precise temporal coverage too, e.g. a work set in 1939 - 1945 can be indicated in ISO 8601 interval format format via &quot;1939/1945&quot;.
   * 
   * Open-ended date ranges can be written with &quot;..&quot; in place of the end date. For example, &quot;2015-11/..&quot; indicates a range beginning in November 2015 and with no specified final date. This is tentative and might be updated in future when ISO 8601 is officially updated.
   */
  @JsonIgnore public java.util.Date getTemporalCoverageDate() {
    return (java.util.Date) getValue("temporalCoverage");
  }
  /**
   * The temporalCoverage of a CreativeWork indicates the period that the content applies to, i.e. that it describes, either as a DateTime or as a textual string indicating a time period in [ISO 8601 time interval format](https://en.wikipedia.org/wiki/ISO_8601#Time_intervals). In
   *       the case of a Dataset it will typically indicate the relevant time period in a precise notation (e.g. for a 2011 census dataset, the year 2011 would be written &quot;2011/2012&quot;). Other forms of content e.g. ScholarlyArticle, Book, TVSeries or TVEpisode may indicate their temporalCoverage in broader terms - textually or via well-known URL.
   *       Written works such as books may sometimes have precise temporal coverage too, e.g. a work set in 1939 - 1945 can be indicated in ISO 8601 interval format format via &quot;1939/1945&quot;.
   * 
   * Open-ended date ranges can be written with &quot;..&quot; in place of the end date. For example, &quot;2015-11/..&quot; indicates a range beginning in November 2015 and with no specified final date. This is tentative and might be updated in future when ISO 8601 is officially updated.
   */
  @JsonIgnore public java.util.Collection<java.util.Date> getTemporalCoverageDates() {
    final java.lang.Object current = myData.get("temporalCoverage");
    if (current == null) return Collections.emptyList();
    if (current instanceof java.util.Collection) {
      return (java.util.Collection<java.util.Date>) current;
    }
    return Arrays.asList((java.util.Date) current);
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
    final java.lang.Object current = myData.get("countryOfOrigin");
    if (current == null) return Collections.emptyList();
    if (current instanceof java.util.Collection) {
      return (java.util.Collection<Country>) current;
    }
    return Arrays.asList((Country) current);
  }
  /**
   * A citation or reference to another creative work, such as another publication, web page, scholarly article, etc.
   */
  @JsonIgnore public CreativeWork getCitationCreativeWork() {
    return (CreativeWork) getValue("citation");
  }
  /**
   * A citation or reference to another creative work, such as another publication, web page, scholarly article, etc.
   */
  @JsonIgnore public java.util.Collection<CreativeWork> getCitationCreativeWorks() {
    final java.lang.Object current = myData.get("citation");
    if (current == null) return Collections.emptyList();
    if (current instanceof java.util.Collection) {
      return (java.util.Collection<CreativeWork>) current;
    }
    return Arrays.asList((CreativeWork) current);
  }
  /**
   * A citation or reference to another creative work, such as another publication, web page, scholarly article, etc.
   */
  @JsonIgnore public String getCitationString() {
    return (String) getValue("citation");
  }
  /**
   * A citation or reference to another creative work, such as another publication, web page, scholarly article, etc.
   */
  @JsonIgnore public java.util.Collection<String> getCitationStrings() {
    final java.lang.Object current = myData.get("citation");
    if (current == null) return Collections.emptyList();
    if (current instanceof java.util.Collection) {
      return (java.util.Collection<String>) current;
    }
    return Arrays.asList((String) current);
  }
  /**
   * The person or organization who produced the work (e.g. music album, movie, tv/radio series etc.).
   */
  @JsonIgnore public Organization getProducerOrganization() {
    return (Organization) getValue("producer");
  }
  /**
   * The person or organization who produced the work (e.g. music album, movie, tv/radio series etc.).
   */
  @JsonIgnore public java.util.Collection<Organization> getProducerOrganizations() {
    final java.lang.Object current = myData.get("producer");
    if (current == null) return Collections.emptyList();
    if (current instanceof java.util.Collection) {
      return (java.util.Collection<Organization>) current;
    }
    return Arrays.asList((Organization) current);
  }
  /**
   * The person or organization who produced the work (e.g. music album, movie, tv/radio series etc.).
   */
  @JsonIgnore public Person getProducerPerson() {
    return (Person) getValue("producer");
  }
  /**
   * The person or organization who produced the work (e.g. music album, movie, tv/radio series etc.).
   */
  @JsonIgnore public java.util.Collection<Person> getProducerPersons() {
    final java.lang.Object current = myData.get("producer");
    if (current == null) return Collections.emptyList();
    if (current instanceof java.util.Collection) {
      return (java.util.Collection<Person>) current;
    }
    return Arrays.asList((Person) current);
  }
  /**
   * A maintainer of a [[Dataset]], software package ([[SoftwareApplication]]), or other [[Project]]. A maintainer is a [[Person]] or [[Organization]] that manages contributions to, and/or publication of, some (typically complex) artifact. It is common for distributions of software and data to be based on &quot;upstream&quot; sources. When [[maintainer]] is applied to a specific version of something e.g. a particular version or packaging of a [[Dataset]], it is always  possible that the upstream source has a different maintainer. The [[isBasedOn]] property can be used to indicate such relationships between datasets to make the different maintenance roles clear. Similarly in the case of software, a package may have dedicated maintainers working on integration into software distributions such as Ubuntu, as well as upstream maintainers of the underlying work.
   *       
   */
  @JsonIgnore public Organization getMaintainerOrganization() {
    return (Organization) getValue("maintainer");
  }
  /**
   * A maintainer of a [[Dataset]], software package ([[SoftwareApplication]]), or other [[Project]]. A maintainer is a [[Person]] or [[Organization]] that manages contributions to, and/or publication of, some (typically complex) artifact. It is common for distributions of software and data to be based on &quot;upstream&quot; sources. When [[maintainer]] is applied to a specific version of something e.g. a particular version or packaging of a [[Dataset]], it is always  possible that the upstream source has a different maintainer. The [[isBasedOn]] property can be used to indicate such relationships between datasets to make the different maintenance roles clear. Similarly in the case of software, a package may have dedicated maintainers working on integration into software distributions such as Ubuntu, as well as upstream maintainers of the underlying work.
   *       
   */
  @JsonIgnore public java.util.Collection<Organization> getMaintainerOrganizations() {
    final java.lang.Object current = myData.get("maintainer");
    if (current == null) return Collections.emptyList();
    if (current instanceof java.util.Collection) {
      return (java.util.Collection<Organization>) current;
    }
    return Arrays.asList((Organization) current);
  }
  /**
   * A maintainer of a [[Dataset]], software package ([[SoftwareApplication]]), or other [[Project]]. A maintainer is a [[Person]] or [[Organization]] that manages contributions to, and/or publication of, some (typically complex) artifact. It is common for distributions of software and data to be based on &quot;upstream&quot; sources. When [[maintainer]] is applied to a specific version of something e.g. a particular version or packaging of a [[Dataset]], it is always  possible that the upstream source has a different maintainer. The [[isBasedOn]] property can be used to indicate such relationships between datasets to make the different maintenance roles clear. Similarly in the case of software, a package may have dedicated maintainers working on integration into software distributions such as Ubuntu, as well as upstream maintainers of the underlying work.
   *       
   */
  @JsonIgnore public Person getMaintainerPerson() {
    return (Person) getValue("maintainer");
  }
  /**
   * A maintainer of a [[Dataset]], software package ([[SoftwareApplication]]), or other [[Project]]. A maintainer is a [[Person]] or [[Organization]] that manages contributions to, and/or publication of, some (typically complex) artifact. It is common for distributions of software and data to be based on &quot;upstream&quot; sources. When [[maintainer]] is applied to a specific version of something e.g. a particular version or packaging of a [[Dataset]], it is always  possible that the upstream source has a different maintainer. The [[isBasedOn]] property can be used to indicate such relationships between datasets to make the different maintenance roles clear. Similarly in the case of software, a package may have dedicated maintainers working on integration into software distributions such as Ubuntu, as well as upstream maintainers of the underlying work.
   *       
   */
  @JsonIgnore public java.util.Collection<Person> getMaintainerPersons() {
    final java.lang.Object current = myData.get("maintainer");
    if (current == null) return Collections.emptyList();
    if (current instanceof java.util.Collection) {
      return (java.util.Collection<Person>) current;
    }
    return Arrays.asList((Person) current);
  }
  /**
   * Organization or person who adapts a creative work to different languages, regional differences and technical requirements of a target market, or that translates during some event.
   */
  @JsonIgnore public Organization getTranslatorOrganization() {
    return (Organization) getValue("translator");
  }
  /**
   * Organization or person who adapts a creative work to different languages, regional differences and technical requirements of a target market, or that translates during some event.
   */
  @JsonIgnore public java.util.Collection<Organization> getTranslatorOrganizations() {
    final java.lang.Object current = myData.get("translator");
    if (current == null) return Collections.emptyList();
    if (current instanceof java.util.Collection) {
      return (java.util.Collection<Organization>) current;
    }
    return Arrays.asList((Organization) current);
  }
  /**
   * Organization or person who adapts a creative work to different languages, regional differences and technical requirements of a target market, or that translates during some event.
   */
  @JsonIgnore public Person getTranslatorPerson() {
    return (Person) getValue("translator");
  }
  /**
   * Organization or person who adapts a creative work to different languages, regional differences and technical requirements of a target market, or that translates during some event.
   */
  @JsonIgnore public java.util.Collection<Person> getTranslatorPersons() {
    final java.lang.Object current = myData.get("translator");
    if (current == null) return Collections.emptyList();
    if (current instanceof java.util.Collection) {
      return (java.util.Collection<Person>) current;
    }
    return Arrays.asList((Person) current);
  }
  /**
   * A human-readable summary of specific accessibility features or deficiencies, consistent with the other accessibility metadata but expressing subtleties such as &quot;short descriptions are present but long descriptions will be needed for non-visual users&quot; or &quot;short descriptions are present and no long descriptions are needed.&quot;
   */
  @JsonIgnore public String getAccessibilitySummary() {
    return (String) getValue("accessibilitySummary");
  }
  /**
   * A human-readable summary of specific accessibility features or deficiencies, consistent with the other accessibility metadata but expressing subtleties such as &quot;short descriptions are present but long descriptions will be needed for non-visual users&quot; or &quot;short descriptions are present and no long descriptions are needed.&quot;
   */
  @JsonIgnore public java.util.Collection<String> getAccessibilitySummarys() {
    final java.lang.Object current = myData.get("accessibilitySummary");
    if (current == null) return Collections.emptyList();
    if (current instanceof java.util.Collection) {
      return (java.util.Collection<String>) current;
    }
    return Arrays.asList((String) current);
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
  @JsonIgnore public java.util.Collection<Sponsor> getSponsors() {
    final java.lang.Object current = myData.get("sponsor");
    if (current == null) return Collections.emptyList();
    if (current instanceof java.util.Collection) {
      return (java.util.Collection<Sponsor>) current;
    }
    return Arrays.asList((Sponsor) current);
  }
  /**
   * A person or organization that supports (sponsors) something through some kind of financial contribution.
   */
  @JsonIgnore public Sponsor getFunder() {
    return (Sponsor) getValue("funder");
  }
  /**
   * A person or organization that supports (sponsors) something through some kind of financial contribution.
   */
  @JsonIgnore public java.util.Collection<Sponsor> getFunders() {
    final java.lang.Object current = myData.get("funder");
    if (current == null) return Collections.emptyList();
    if (current instanceof java.util.Collection) {
      return (java.util.Collection<Sponsor>) current;
    }
    return Arrays.asList((Sponsor) current);
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
    final java.lang.Object current = myData.get("review");
    if (current == null) return Collections.emptyList();
    if (current instanceof java.util.Collection) {
      return (java.util.Collection<Review>) current;
    }
    return Arrays.asList((Review) current);
  }
  /**
   * The number of interactions for the CreativeWork using the WebSite or SoftwareApplication. The most specific child type of InteractionCounter should be used.
   */
  @JsonIgnore public InteractionCounter getInteractionStatistic() {
    return (InteractionCounter) getValue("interactionStatistic");
  }
  /**
   * The number of interactions for the CreativeWork using the WebSite or SoftwareApplication. The most specific child type of InteractionCounter should be used.
   */
  @JsonIgnore public java.util.Collection<InteractionCounter> getInteractionStatistics() {
    final java.lang.Object current = myData.get("interactionStatistic");
    if (current == null) return Collections.emptyList();
    if (current instanceof java.util.Collection) {
      return (java.util.Collection<InteractionCounter>) current;
    }
    return Arrays.asList((InteractionCounter) current);
  }
  /**
   * The typical expected age range, e.g. '7-9', '11-'.
   */
  @JsonIgnore public String getTypicalAgeRange() {
    return (String) getValue("typicalAgeRange");
  }
  /**
   * The typical expected age range, e.g. '7-9', '11-'.
   */
  @JsonIgnore public java.util.Collection<String> getTypicalAgeRanges() {
    final java.lang.Object current = myData.get("typicalAgeRange");
    if (current == null) return Collections.emptyList();
    if (current instanceof java.util.Collection) {
      return (java.util.Collection<String>) current;
    }
    return Arrays.asList((String) current);
  }
  /**
   * A media object that encodes this CreativeWork. This property is a synonym for associatedMedia.
   */
  @JsonIgnore public MediaObject getEncoding() {
    return (MediaObject) getValue("encoding");
  }
  /**
   * A media object that encodes this CreativeWork. This property is a synonym for associatedMedia.
   */
  @JsonIgnore public java.util.Collection<MediaObject> getEncodings() {
    final java.lang.Object current = myData.get("encoding");
    if (current == null) return Collections.emptyList();
    if (current instanceof java.util.Collection) {
      return (java.util.Collection<MediaObject>) current;
    }
    return Arrays.asList((MediaObject) current);
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
    final java.lang.Object current = myData.get("award");
    if (current == null) return Collections.emptyList();
    if (current instanceof java.util.Collection) {
      return (java.util.Collection<String>) current;
    }
    return Arrays.asList((String) current);
  }
  /**
   * Keywords or tags used to describe this content. Multiple entries in a keywords list are typically delimited by commas.
   */
  @JsonIgnore public DefinedTerm getKeywordsDefinedTerm() {
    return (DefinedTerm) getValue("keywords");
  }
  /**
   * Keywords or tags used to describe this content. Multiple entries in a keywords list are typically delimited by commas.
   */
  @JsonIgnore public java.util.Collection<DefinedTerm> getKeywordsDefinedTerms() {
    final java.lang.Object current = myData.get("keywords");
    if (current == null) return Collections.emptyList();
    if (current instanceof java.util.Collection) {
      return (java.util.Collection<DefinedTerm>) current;
    }
    return Arrays.asList((DefinedTerm) current);
  }
  /**
   * Keywords or tags used to describe this content. Multiple entries in a keywords list are typically delimited by commas.
   */
  @JsonIgnore public String getKeywordsString() {
    return (String) getValue("keywords");
  }
  /**
   * Keywords or tags used to describe this content. Multiple entries in a keywords list are typically delimited by commas.
   */
  @JsonIgnore public java.util.Collection<String> getKeywordsStrings() {
    final java.lang.Object current = myData.get("keywords");
    if (current == null) return Collections.emptyList();
    if (current instanceof java.util.Collection) {
      return (java.util.Collection<String>) current;
    }
    return Arrays.asList((String) current);
  }
  /**
   * The place and time the release was issued, expressed as a PublicationEvent.
   */
  @JsonIgnore public PublicationEvent getReleasedEvent() {
    return (PublicationEvent) getValue("releasedEvent");
  }
  /**
   * The place and time the release was issued, expressed as a PublicationEvent.
   */
  @JsonIgnore public java.util.Collection<PublicationEvent> getReleasedEvents() {
    final java.lang.Object current = myData.get("releasedEvent");
    if (current == null) return Collections.emptyList();
    if (current instanceof java.util.Collection) {
      return (java.util.Collection<PublicationEvent>) current;
    }
    return Arrays.asList((PublicationEvent) current);
  }
  /**
   * Indicates whether this content is family friendly.
   */
  @JsonIgnore public Boolean getIsFamilyFriendly() {
    return (Boolean) getValue("isFamilyFriendly");
  }
  /**
   * Indicates whether this content is family friendly.
   */
  @JsonIgnore public java.util.Collection<Boolean> getIsFamilyFriendlys() {
    final java.lang.Object current = myData.get("isFamilyFriendly");
    if (current == null) return Collections.emptyList();
    if (current instanceof java.util.Collection) {
      return (java.util.Collection<Boolean>) current;
    }
    return Arrays.asList((Boolean) current);
  }
  /**
   * A secondary title of the CreativeWork.
   */
  @JsonIgnore public String getAlternativeHeadline() {
    return (String) getValue("alternativeHeadline");
  }
  /**
   * A secondary title of the CreativeWork.
   */
  @JsonIgnore public java.util.Collection<String> getAlternativeHeadlines() {
    final java.lang.Object current = myData.get("alternativeHeadline");
    if (current == null) return Collections.emptyList();
    if (current instanceof java.util.Collection) {
      return (java.util.Collection<String>) current;
    }
    return Arrays.asList((String) current);
  }
  /**
   * Indicates (by URL or string) a particular version of a schema used in some CreativeWork. This property was created primarily to
   *     indicate the use of a specific schema.org release, e.g. ```10.0``` as a simple string, or more explicitly via URL, ```http://schema.org/docs/releases.html#v10.0```. There may be situations in which other schemas might usefully be referenced this way, e.g. ```http://dublincore.org/specifications/dublin-core/dces/1999-07-02/``` but this has not been carefully explored in the community.
   */
  @JsonIgnore public String getSchemaVersion() {
    return (String) getValue("schemaVersion");
  }
  /**
   * Indicates (by URL or string) a particular version of a schema used in some CreativeWork. This property was created primarily to
   *     indicate the use of a specific schema.org release, e.g. ```10.0``` as a simple string, or more explicitly via URL, ```http://schema.org/docs/releases.html#v10.0```. There may be situations in which other schemas might usefully be referenced this way, e.g. ```http://dublincore.org/specifications/dublin-core/dces/1999-07-02/``` but this has not been carefully explored in the community.
   */
  @JsonIgnore public java.util.Collection<String> getSchemaVersions() {
    final java.lang.Object current = myData.get("schemaVersion");
    if (current == null) return Collections.emptyList();
    if (current instanceof java.util.Collection) {
      return (java.util.Collection<String>) current;
    }
    return Arrays.asList((String) current);
  }
  /**
   * The item being described is intended to assess the competency or learning outcome defined by the referenced term.
   */
  @JsonIgnore public DefinedTerm getAssessesDefinedTerm() {
    return (DefinedTerm) getValue("assesses");
  }
  /**
   * The item being described is intended to assess the competency or learning outcome defined by the referenced term.
   */
  @JsonIgnore public java.util.Collection<DefinedTerm> getAssessesDefinedTerms() {
    final java.lang.Object current = myData.get("assesses");
    if (current == null) return Collections.emptyList();
    if (current instanceof java.util.Collection) {
      return (java.util.Collection<DefinedTerm>) current;
    }
    return Arrays.asList((DefinedTerm) current);
  }
  /**
   * The item being described is intended to assess the competency or learning outcome defined by the referenced term.
   */
  @JsonIgnore public String getAssessesString() {
    return (String) getValue("assesses");
  }
  /**
   * The item being described is intended to assess the competency or learning outcome defined by the referenced term.
   */
  @JsonIgnore public java.util.Collection<String> getAssessesStrings() {
    final java.lang.Object current = myData.get("assesses");
    if (current == null) return Collections.emptyList();
    if (current instanceof java.util.Collection) {
      return (java.util.Collection<String>) current;
    }
    return Arrays.asList((String) current);
  }
  /**
   * The publishing division which published the comic.
   */
  @JsonIgnore public Organization getPublisherImprint() {
    return (Organization) getValue("publisherImprint");
  }
  /**
   * The publishing division which published the comic.
   */
  @JsonIgnore public java.util.Collection<Organization> getPublisherImprints() {
    final java.lang.Object current = myData.get("publisherImprint");
    if (current == null) return Collections.emptyList();
    if (current instanceof java.util.Collection) {
      return (java.util.Collection<Organization>) current;
    }
    return Arrays.asList((Organization) current);
  }
  /**
   * The human sensory perceptual system or cognitive faculty through which a person may process or perceive information. Expected values include: auditory, tactile, textual, visual, colorDependent, chartOnVisual, chemOnVisual, diagramOnVisual, mathOnVisual, musicOnVisual, textOnVisual.
   *       
   */
  @JsonIgnore public String getAccessMode() {
    return (String) getValue("accessMode");
  }
  /**
   * The human sensory perceptual system or cognitive faculty through which a person may process or perceive information. Expected values include: auditory, tactile, textual, visual, colorDependent, chartOnVisual, chemOnVisual, diagramOnVisual, mathOnVisual, musicOnVisual, textOnVisual.
   *       
   */
  @JsonIgnore public java.util.Collection<String> getAccessModes() {
    final java.lang.Object current = myData.get("accessMode");
    if (current == null) return Collections.emptyList();
    if (current instanceof java.util.Collection) {
      return (java.util.Collection<String>) current;
    }
    return Arrays.asList((String) current);
  }
  /**
   * Indicates the date on which the current structured data was generated / published. Typically used alongside [[sdPublisher]]
   */
  @JsonIgnore public java.util.Date getSdDatePublished() {
    return (java.util.Date) getValue("sdDatePublished");
  }
  /**
   * Indicates the date on which the current structured data was generated / published. Typically used alongside [[sdPublisher]]
   */
  @JsonIgnore public java.util.Collection<java.util.Date> getSdDatePublisheds() {
    final java.lang.Object current = myData.get("sdDatePublished");
    if (current == null) return Collections.emptyList();
    if (current instanceof java.util.Collection) {
      return (java.util.Collection<java.util.Date>) current;
    }
    return Arrays.asList((java.util.Date) current);
  }
  /**
   * Used to indicate a specific claim contained, implied, translated or refined from the content of a [[MediaObject]] or other [[CreativeWork]]. The interpreting party can be indicated using [[claimInterpreter]].
   */
  @JsonIgnore public Claim getInterpretedAsClaim() {
    return (Claim) getValue("interpretedAsClaim");
  }
  /**
   * Used to indicate a specific claim contained, implied, translated or refined from the content of a [[MediaObject]] or other [[CreativeWork]]. The interpreting party can be indicated using [[claimInterpreter]].
   */
  @JsonIgnore public java.util.Collection<Claim> getInterpretedAsClaims() {
    final java.lang.Object current = myData.get("interpretedAsClaim");
    if (current == null) return Collections.emptyList();
    if (current instanceof java.util.Collection) {
      return (java.util.Collection<Claim>) current;
    }
    return Arrays.asList((Claim) current);
  }
  /**
   * Approximate or typical time it takes to work with or through this learning resource for the typical intended target audience, e.g. 'PT30M', 'PT1H25M'.
   */
  @JsonIgnore public Duration getTimeRequired() {
    return (Duration) getValue("timeRequired");
  }
  /**
   * Approximate or typical time it takes to work with or through this learning resource for the typical intended target audience, e.g. 'PT30M', 'PT1H25M'.
   */
  @JsonIgnore public java.util.Collection<Duration> getTimeRequireds() {
    final java.lang.Object current = myData.get("timeRequired");
    if (current == null) return Collections.emptyList();
    if (current instanceof java.util.Collection) {
      return (java.util.Collection<Duration>) current;
    }
    return Arrays.asList((Duration) current);
  }
  /**
   * The location where the CreativeWork was created, which may not be the same as the location depicted in the CreativeWork.
   */
  @JsonIgnore public Place getLocationCreated() {
    return (Place) getValue("locationCreated");
  }
  /**
   * The location where the CreativeWork was created, which may not be the same as the location depicted in the CreativeWork.
   */
  @JsonIgnore public java.util.Collection<Place> getLocationCreateds() {
    final java.lang.Object current = myData.get("locationCreated");
    if (current == null) return Collections.emptyList();
    if (current instanceof java.util.Collection) {
      return (java.util.Collection<Place>) current;
    }
    return Arrays.asList((Place) current);
  }
  /**
   * Specifies the Person who edited the CreativeWork.
   */
  @JsonIgnore public Person getEditor() {
    return (Person) getValue("editor");
  }
  /**
   * Specifies the Person who edited the CreativeWork.
   */
  @JsonIgnore public java.util.Collection<Person> getEditors() {
    final java.lang.Object current = myData.get("editor");
    if (current == null) return Collections.emptyList();
    if (current instanceof java.util.Collection) {
      return (java.util.Collection<Person>) current;
    }
    return Arrays.asList((Person) current);
  }
  /**
   * The purpose of a work in the context of education; for example, 'assignment', 'group work'.
   */
  @JsonIgnore public DefinedTerm getEducationalUseDefinedTerm() {
    return (DefinedTerm) getValue("educationalUse");
  }
  /**
   * The purpose of a work in the context of education; for example, 'assignment', 'group work'.
   */
  @JsonIgnore public java.util.Collection<DefinedTerm> getEducationalUseDefinedTerms() {
    final java.lang.Object current = myData.get("educationalUse");
    if (current == null) return Collections.emptyList();
    if (current instanceof java.util.Collection) {
      return (java.util.Collection<DefinedTerm>) current;
    }
    return Arrays.asList((DefinedTerm) current);
  }
  /**
   * The purpose of a work in the context of education; for example, 'assignment', 'group work'.
   */
  @JsonIgnore public String getEducationalUseString() {
    return (String) getValue("educationalUse");
  }
  /**
   * The purpose of a work in the context of education; for example, 'assignment', 'group work'.
   */
  @JsonIgnore public java.util.Collection<String> getEducationalUseStrings() {
    final java.lang.Object current = myData.get("educationalUse");
    if (current == null) return Collections.emptyList();
    if (current instanceof java.util.Collection) {
      return (java.util.Collection<String>) current;
    }
    return Arrays.asList((String) current);
  }
  /**
   * The year during which the claimed copyright for the CreativeWork was first asserted.
   */
  @JsonIgnore public Integer getCopyrightYearInteger() {
    return (Integer) getValue("copyrightYear");
  }
  /**
   * The year during which the claimed copyright for the CreativeWork was first asserted.
   */
  @JsonIgnore public java.util.Collection<Integer> getCopyrightYearIntegers() {
    final java.lang.Object current = myData.get("copyrightYear");
    if (current == null) return Collections.emptyList();
    if (current instanceof java.util.Collection) {
      return (java.util.Collection<Integer>) current;
    }
    return Arrays.asList((Integer) current);
  }
  /**
   * The year during which the claimed copyright for the CreativeWork was first asserted.
   */
  @JsonIgnore public Long getCopyrightYearLong() {
    return (Long) getValue("copyrightYear");
  }
  /**
   * The year during which the claimed copyright for the CreativeWork was first asserted.
   */
  @JsonIgnore public java.util.Collection<Long> getCopyrightYearLongs() {
    final java.lang.Object current = myData.get("copyrightYear");
    if (current == null) return Collections.emptyList();
    if (current instanceof java.util.Collection) {
      return (java.util.Collection<Long>) current;
    }
    return Arrays.asList((Long) current);
  }
  /**
   * The year during which the claimed copyright for the CreativeWork was first asserted.
   */
  @JsonIgnore public Float getCopyrightYearFloat() {
    return (Float) getValue("copyrightYear");
  }
  /**
   * The year during which the claimed copyright for the CreativeWork was first asserted.
   */
  @JsonIgnore public java.util.Collection<Float> getCopyrightYearFloats() {
    final java.lang.Object current = myData.get("copyrightYear");
    if (current == null) return Collections.emptyList();
    if (current instanceof java.util.Collection) {
      return (java.util.Collection<Float>) current;
    }
    return Arrays.asList((Float) current);
  }
  /**
   * The year during which the claimed copyright for the CreativeWork was first asserted.
   */
  @JsonIgnore public Double getCopyrightYearDouble() {
    return (Double) getValue("copyrightYear");
  }
  /**
   * The year during which the claimed copyright for the CreativeWork was first asserted.
   */
  @JsonIgnore public java.util.Collection<Double> getCopyrightYearDoubles() {
    final java.lang.Object current = myData.get("copyrightYear");
    if (current == null) return Collections.emptyList();
    if (current instanceof java.util.Collection) {
      return (java.util.Collection<Double>) current;
    }
    return Arrays.asList((Double) current);
  }
  /**
   * The year during which the claimed copyright for the CreativeWork was first asserted.
   */
  @JsonIgnore public String getCopyrightYearString() {
    return (String) getValue("copyrightYear");
  }
  /**
   * The year during which the claimed copyright for the CreativeWork was first asserted.
   */
  @JsonIgnore public java.util.Collection<String> getCopyrightYearStrings() {
    final java.lang.Object current = myData.get("copyrightYear");
    if (current == null) return Collections.emptyList();
    if (current instanceof java.util.Collection) {
      return (java.util.Collection<String>) current;
    }
    return Arrays.asList((String) current);
  }
  /**
   * The Organization on whose behalf the creator was working.
   */
  @JsonIgnore public Organization getSourceOrganization() {
    return (Organization) getValue("sourceOrganization");
  }
  /**
   * The Organization on whose behalf the creator was working.
   */
  @JsonIgnore public java.util.Collection<Organization> getSourceOrganizations() {
    final java.lang.Object current = myData.get("sourceOrganization");
    if (current == null) return Collections.emptyList();
    if (current instanceof java.util.Collection) {
      return (java.util.Collection<Organization>) current;
    }
    return Arrays.asList((Organization) current);
  }
  /**
   * Specifies the Person that is legally accountable for the CreativeWork.
   */
  @JsonIgnore public Person getAccountablePerson() {
    return (Person) getValue("accountablePerson");
  }
  /**
   * Specifies the Person that is legally accountable for the CreativeWork.
   */
  @JsonIgnore public java.util.Collection<Person> getAccountablePersons() {
    final java.lang.Object current = myData.get("accountablePerson");
    if (current == null) return Collections.emptyList();
    if (current instanceof java.util.Collection) {
      return (java.util.Collection<Person>) current;
    }
    return Arrays.asList((Person) current);
  }
  /**
   * The predominant mode of learning supported by the learning resource. Acceptable values are 'active', 'expositive', or 'mixed'.
   */
  @JsonIgnore public String getInteractivityType() {
    return (String) getValue("interactivityType");
  }
  /**
   * The predominant mode of learning supported by the learning resource. Acceptable values are 'active', 'expositive', or 'mixed'.
   */
  @JsonIgnore public java.util.Collection<String> getInteractivityTypes() {
    final java.lang.Object current = myData.get("interactivityType");
    if (current == null) return Collections.emptyList();
    if (current instanceof java.util.Collection) {
      return (java.util.Collection<String>) current;
    }
    return Arrays.asList((String) current);
  }
  /**
   * An abstract is a short description that summarizes a [[CreativeWork]].
   */
  @JsonIgnore public String getAbstract() {
    return (String) getValue("abstract");
  }
  /**
   * An abstract is a short description that summarizes a [[CreativeWork]].
   */
  @JsonIgnore public java.util.Collection<String> getAbstracts() {
    final java.lang.Object current = myData.get("abstract");
    if (current == null) return Collections.emptyList();
    if (current instanceof java.util.Collection) {
      return (java.util.Collection<String>) current;
    }
    return Arrays.asList((String) current);
  }
  /**
   * Identifies input methods that are sufficient to fully control the described resource ([WebSchemas wiki lists possible values](http://www.w3.org/wiki/WebSchemas/Accessibility)).
   */
  @JsonIgnore public String getAccessibilityControl() {
    return (String) getValue("accessibilityControl");
  }
  /**
   * Identifies input methods that are sufficient to fully control the described resource ([WebSchemas wiki lists possible values](http://www.w3.org/wiki/WebSchemas/Accessibility)).
   */
  @JsonIgnore public java.util.Collection<String> getAccessibilityControls() {
    final java.lang.Object current = myData.get("accessibilityControl");
    if (current == null) return Collections.emptyList();
    if (current instanceof java.util.Collection) {
      return (java.util.Collection<String>) current;
    }
    return Arrays.asList((String) current);
  }
  /**
   * The work that this work has been translated from. e.g. 物种起源 is a translationOf &ldquo;On the Origin of Species&rdquo;
   */
  @JsonIgnore public CreativeWork getTranslationOfWork() {
    return (CreativeWork) getValue("translationOfWork");
  }
  /**
   * The work that this work has been translated from. e.g. 物种起源 is a translationOf &ldquo;On the Origin of Species&rdquo;
   */
  @JsonIgnore public java.util.Collection<CreativeWork> getTranslationOfWorks() {
    final java.lang.Object current = myData.get("translationOfWork");
    if (current == null) return Collections.emptyList();
    if (current instanceof java.util.Collection) {
      return (java.util.Collection<CreativeWork>) current;
    }
    return Arrays.asList((CreativeWork) current);
  }
  /**
   * A work that is a translation of the content of this work. e.g. 西遊記 has an English workTranslation &ldquo;Journey to the West&rdquo;,a German workTranslation &ldquo;Monkeys Pilgerfahrt&rdquo; and a Vietnamese  translation T&acirc;y du k&yacute; b&igrave;nh khảo.
   */
  @JsonIgnore public CreativeWork getWorkTranslation() {
    return (CreativeWork) getValue("workTranslation");
  }
  /**
   * A work that is a translation of the content of this work. e.g. 西遊記 has an English workTranslation &ldquo;Journey to the West&rdquo;,a German workTranslation &ldquo;Monkeys Pilgerfahrt&rdquo; and a Vietnamese  translation T&acirc;y du k&yacute; b&igrave;nh khảo.
   */
  @JsonIgnore public java.util.Collection<CreativeWork> getWorkTranslations() {
    final java.lang.Object current = myData.get("workTranslation");
    if (current == null) return Collections.emptyList();
    if (current instanceof java.util.Collection) {
      return (java.util.Collection<CreativeWork>) current;
    }
    return Arrays.asList((CreativeWork) current);
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
   */
  @JsonIgnore public Offer getOffersOffer() {
    return (Offer) getValue("offers");
  }
  /**
   * An offer to provide this item&amp;#x2014;for example, an offer to sell a product, rent the DVD of a movie, perform a service, or give away tickets to an event. Use [[businessFunction]] to indicate the kind of transaction offered, i.e. sell, lease, etc. This property can also be used to describe a [[Demand]]. While this property is listed as expected on a number of common types, it can be used in others. In that case, using a second type, such as Product or a subtype of Product, can clarify the nature of the offer.
   *       
   */
  @JsonIgnore public java.util.Collection<Offer> getOffersOffers() {
    final java.lang.Object current = myData.get("offers");
    if (current == null) return Collections.emptyList();
    if (current instanceof java.util.Collection) {
      return (java.util.Collection<Offer>) current;
    }
    return Arrays.asList((Offer) current);
  }
  /**
   * The subject matter of the content.
   */
  @JsonIgnore public Thing getAbout() {
    return (Thing) getValue("about");
  }
  /**
   * The subject matter of the content.
   */
  @JsonIgnore public java.util.Collection<Thing> getAbouts() {
    final java.lang.Object current = myData.get("about");
    if (current == null) return Collections.emptyList();
    if (current instanceof java.util.Collection) {
      return (java.util.Collection<Thing>) current;
    }
    return Arrays.asList((Thing) current);
  }
  /**
   * Indicates the primary entity described in some page or other CreativeWork.
   */
  @JsonIgnore public About getMainEntityAbout() {
    return (About) getValue("mainEntity");
  }
  /**
   * Indicates the primary entity described in some page or other CreativeWork.
   */
  @JsonIgnore public java.util.Collection<About> getMainEntityAbouts() {
    final java.lang.Object current = myData.get("mainEntity");
    if (current == null) return Collections.emptyList();
    if (current instanceof java.util.Collection) {
      return (java.util.Collection<About>) current;
    }
    return Arrays.asList((About) current);
  }
  /**
   * Indicates the primary entity described in some page or other CreativeWork.
   */
  @JsonIgnore public Thing getMainEntityThing() {
    return (Thing) getValue("mainEntity");
  }
  /**
   * Indicates the primary entity described in some page or other CreativeWork.
   */
  @JsonIgnore public java.util.Collection<Thing> getMainEntityThings() {
    final java.lang.Object current = myData.get("mainEntity");
    if (current == null) return Collections.emptyList();
    if (current instanceof java.util.Collection) {
      return (java.util.Collection<Thing>) current;
    }
    return Arrays.asList((Thing) current);
  }
  /**
   * The Event where the CreativeWork was recorded. The CreativeWork may capture all or part of the event.
   */
  @JsonIgnore public Event getRecordedAt() {
    return (Event) getValue("recordedAt");
  }
  /**
   * The Event where the CreativeWork was recorded. The CreativeWork may capture all or part of the event.
   */
  @JsonIgnore public java.util.Collection<Event> getRecordedAts() {
    final java.lang.Object current = myData.get("recordedAt");
    if (current == null) return Collections.emptyList();
    if (current instanceof java.util.Collection) {
      return (java.util.Collection<Event>) current;
    }
    return Arrays.asList((Event) current);
  }
  /**
   * A creative work that this work is an example/instance/realization/derivation of.
   */
  @JsonIgnore public CreativeWork getExampleOfWork() {
    return (CreativeWork) getValue("exampleOfWork");
  }
  /**
   * A creative work that this work is an example/instance/realization/derivation of.
   */
  @JsonIgnore public java.util.Collection<CreativeWork> getExampleOfWorks() {
    final java.lang.Object current = myData.get("exampleOfWork");
    if (current == null) return Collections.emptyList();
    if (current instanceof java.util.Collection) {
      return (java.util.Collection<CreativeWork>) current;
    }
    return Arrays.asList((CreativeWork) current);
  }
  /**
   * The location depicted or described in the content. For example, the location in a photograph or painting.
   */
  @JsonIgnore public ContentLocation getContentLocation() {
    return (ContentLocation) getValue("contentLocation");
  }
  /**
   * The location depicted or described in the content. For example, the location in a photograph or painting.
   */
  @JsonIgnore public java.util.Collection<ContentLocation> getContentLocations() {
    final java.lang.Object current = myData.get("contentLocation");
    if (current == null) return Collections.emptyList();
    if (current instanceof java.util.Collection) {
      return (java.util.Collection<ContentLocation>) current;
    }
    return Arrays.asList((ContentLocation) current);
  }
  protected CreativeWork(java.util.Map<String,java.lang.Object> data) {
    super(data);
  }
  
  /**
   * Builder for {@link CreativeWork}
   */
  public static class Builder extends Thing.Builder {
    public Builder(@NotNull HashMap<String,java.lang.Object> data) {
      super(data);
    }
    @NotNull public CreativeWork build() {
      return new CreativeWork(myData);
    }
    /**
     * The textual content of this CreativeWork.
     */
    @NotNull public Builder text(@NotNull String text) {
      putValue("text", text);
      return this;
    }
    /**
     * The &quot;spatial&quot; property can be used in cases when more specific properties
     * (e.g. [[locationCreated]], [[spatialCoverage]], [[contentLocation]]) are not known to be appropriate.
     */
    @NotNull public Builder spatial(@NotNull Place place) {
      putValue("spatial", place);
      return this;
    }
    /**
     * The &quot;spatial&quot; property can be used in cases when more specific properties
     * (e.g. [[locationCreated]], [[spatialCoverage]], [[contentLocation]]) are not known to be appropriate.
     */
    @NotNull public Builder spatial(@NotNull Place.Builder place) {
      putValue("spatial", place.build());
      return this;
    }
    /**
     * The publishingPrinciples property indicates (typically via [[URL]]) a document describing the editorial principles of an [[Organization]] (or individual e.g. a [[Person]] writing a blog) that relate to their activities as a publisher, e.g. ethics or diversity policies. When applied to a [[CreativeWork]] (e.g. [[NewsArticle]]) the principles are those of the party primarily responsible for the creation of the [[CreativeWork]].
     * 
     * While such policies are most typically expressed in natural language, sometimes related information (e.g. indicating a [[funder]]) can be expressed using schema.org terminology.
     * 
     */
    @NotNull public Builder publishingPrinciples(@NotNull PublishingPrinciples publishingPrinciples) {
      putValue("publishingPrinciples", publishingPrinciples);
      return this;
    }
    /**
     * The language of the content or performance or used in an action. Please use one of the language codes from the [IETF BCP 47 standard](http://tools.ietf.org/html/bcp47). See also [[availableLanguage]].
     */
    @NotNull public Builder inLanguage(@NotNull Language language) {
      putValue("inLanguage", language);
      return this;
    }
    /**
     * The language of the content or performance or used in an action. Please use one of the language codes from the [IETF BCP 47 standard](http://tools.ietf.org/html/bcp47). See also [[availableLanguage]].
     */
    @NotNull public Builder inLanguage(@NotNull Language.Builder language) {
      putValue("inLanguage", language.build());
      return this;
    }
    /**
     * The language of the content or performance or used in an action. Please use one of the language codes from the [IETF BCP 47 standard](http://tools.ietf.org/html/bcp47). See also [[availableLanguage]].
     */
    @NotNull public Builder inLanguage(@NotNull String inLanguage) {
      putValue("inLanguage", inLanguage);
      return this;
    }
    /**
     * A thumbnail image relevant to the Thing.
     */
    @NotNull public Builder thumbnailUrl(@NotNull String thumbnailUrl) {
      putValue("thumbnailUrl", thumbnailUrl);
      return this;
    }
    /**
     * Indicates an item or CreativeWork that is part of this item, or CreativeWork (in some sense).
     */
    @NotNull public Builder hasPart(@NotNull HasPart hasPart) {
      putValue("hasPart", hasPart);
      return this;
    }
    /**
     * Official rating of a piece of content&amp;#x2014;for example,'MPAA PG-13'.
     */
    @NotNull public Builder contentRating(@NotNull Rating rating) {
      putValue("contentRating", rating);
      return this;
    }
    /**
     * Official rating of a piece of content&amp;#x2014;for example,'MPAA PG-13'.
     */
    @NotNull public Builder contentRating(@NotNull Rating.Builder rating) {
      putValue("contentRating", rating.build());
      return this;
    }
    /**
     * Official rating of a piece of content&amp;#x2014;for example,'MPAA PG-13'.
     */
    @NotNull public Builder contentRating(@NotNull String contentRating) {
      putValue("contentRating", contentRating);
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
     * A material that something is made from, e.g. leather, wool, cotton, paper.
     */
    @NotNull public Builder material(@NotNull Material material) {
      putValue("material", material);
      return this;
    }
    /**
     * Conditions that affect the availability of, or method(s) of access to, an item. Typically used for real world items such as an [[ArchiveComponent]] held by an [[ArchiveOrganization]]. This property is not suitable for use as a general Web access control mechanism. It is expressed only in natural language.\n\nFor example &quot;Available by appointment from the Reading Room&quot; or &quot;Accessible only from logged-in accounts &quot;. 
     */
    @NotNull public Builder conditionsOfAccess(@NotNull String conditionsOfAccess) {
      putValue("conditionsOfAccess", conditionsOfAccess);
      return this;
    }
    /**
     * The service provider, service operator, or service performer; the goods producer. Another party (a seller) may offer those services or goods on behalf of the provider. A provider may also serve as the seller.
     */
    @NotNull public Builder provider(@NotNull Organization organization) {
      putValue("provider", organization);
      return this;
    }
    /**
     * The service provider, service operator, or service performer; the goods producer. Another party (a seller) may offer those services or goods on behalf of the provider. A provider may also serve as the seller.
     */
    @NotNull public Builder provider(@NotNull Organization.Builder organization) {
      putValue("provider", organization.build());
      return this;
    }
    /**
     * The service provider, service operator, or service performer; the goods producer. Another party (a seller) may offer those services or goods on behalf of the provider. A provider may also serve as the seller.
     */
    @NotNull public Builder provider(@NotNull Person person) {
      putValue("provider", person);
      return this;
    }
    /**
     * The service provider, service operator, or service performer; the goods producer. Another party (a seller) may offer those services or goods on behalf of the provider. A provider may also serve as the seller.
     */
    @NotNull public Builder provider(@NotNull Person.Builder person) {
      putValue("provider", person.build());
      return this;
    }
    /**
     * The date on which the CreativeWork was created or the item was added to a DataFeed.
     */
    @NotNull public Builder dateCreated(@NotNull DateCreated dateCreated) {
      putValue("dateCreated", dateCreated);
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
     * Indicates a correction to a [[CreativeWork]], either via a [[CorrectionComment]], textually or in another document.
     */
    @NotNull public Builder correction(@NotNull CorrectionComment correctionComment) {
      putValue("correction", correctionComment);
      return this;
    }
    /**
     * Indicates a correction to a [[CreativeWork]], either via a [[CorrectionComment]], textually or in another document.
     */
    @NotNull public Builder correction(@NotNull CorrectionComment.Builder correctionComment) {
      putValue("correction", correctionComment.build());
      return this;
    }
    /**
     * Indicates a correction to a [[CreativeWork]], either via a [[CorrectionComment]], textually or in another document.
     */
    @NotNull public Builder correction(@NotNull String correction) {
      putValue("correction", correction);
      return this;
    }
    /**
     * The number of comments this CreativeWork (e.g. Article, Question or Answer) has received. This is most applicable to works published in Web sites with commenting system; additional comments may exist elsewhere.
     */
    @NotNull public Builder commentCount(@NotNull Integer integer) {
      putValue("commentCount", integer);
      return this;
    }
    /**
     * The spatialCoverage of a CreativeWork indicates the place(s) which are the focus of the content. It is a subproperty of
     *       contentLocation intended primarily for more technical and detailed materials. For example with a Dataset, it indicates
     *       areas that the dataset describes: a dataset of New York weather would have spatialCoverage which was the place: the state of New York.
     */
    @NotNull public Builder spatialCoverage(@NotNull SpatialCoverage spatialCoverage) {
      putValue("spatialCoverage", spatialCoverage);
      return this;
    }
    /**
     * Indicates a page or other link involved in archival of a [[CreativeWork]]. In the case of [[MediaReview]], the items in a [[MediaReviewItem]] may often become inaccessible, but be archived by archival, journalistic, activist, or law enforcement organizations. In such cases, the referenced page may not directly publish the content.
     */
    @NotNull public Builder archivedAt(@NotNull String archivedAt) {
      putValue("archivedAt", archivedAt);
      return this;
    }
    /**
     * Indicates a page or other link involved in archival of a [[CreativeWork]]. In the case of [[MediaReview]], the items in a [[MediaReviewItem]] may often become inaccessible, but be archived by archival, journalistic, activist, or law enforcement organizations. In such cases, the referenced page may not directly publish the content.
     */
    @NotNull public Builder archivedAt(@NotNull WebPage webPage) {
      putValue("archivedAt", webPage);
      return this;
    }
    /**
     * Indicates a page or other link involved in archival of a [[CreativeWork]]. In the case of [[MediaReview]], the items in a [[MediaReviewItem]] may often become inaccessible, but be archived by archival, journalistic, activist, or law enforcement organizations. In such cases, the referenced page may not directly publish the content.
     */
    @NotNull public Builder archivedAt(@NotNull WebPage.Builder webPage) {
      putValue("archivedAt", webPage.build());
      return this;
    }
    /**
     * Indicates that the CreativeWork contains a reference to, but is not necessarily about a concept.
     */
    @NotNull public Builder mentions(@NotNull Thing thing) {
      putValue("mentions", thing);
      return this;
    }
    /**
     * Indicates that the CreativeWork contains a reference to, but is not necessarily about a concept.
     */
    @NotNull public Builder mentions(@NotNull Thing.Builder thing) {
      putValue("mentions", thing.build());
      return this;
    }
    /**
     * The level in terms of progression through an educational or training context. Examples of educational levels include 'beginner', 'intermediate' or 'advanced', and formal sets of level indicators.
     */
    @NotNull public Builder educationalLevel(@NotNull DefinedTerm definedTerm) {
      putValue("educationalLevel", definedTerm);
      return this;
    }
    /**
     * The level in terms of progression through an educational or training context. Examples of educational levels include 'beginner', 'intermediate' or 'advanced', and formal sets of level indicators.
     */
    @NotNull public Builder educationalLevel(@NotNull DefinedTerm.Builder definedTerm) {
      putValue("educationalLevel", definedTerm.build());
      return this;
    }
    /**
     * The level in terms of progression through an educational or training context. Examples of educational levels include 'beginner', 'intermediate' or 'advanced', and formal sets of level indicators.
     */
    @NotNull public Builder educationalLevel(@NotNull String educationalLevel) {
      putValue("educationalLevel", educationalLevel);
      return this;
    }
    /**
     * The &quot;temporal&quot; property can be used in cases where more specific properties
     * (e.g. [[temporalCoverage]], [[dateCreated]], [[dateModified]], [[datePublished]]) are not known to be appropriate.
     */
    @NotNull public Builder temporal(@NotNull String temporal) {
      putValue("temporal", temporal);
      return this;
    }
    /**
     * The &quot;temporal&quot; property can be used in cases where more specific properties
     * (e.g. [[temporalCoverage]], [[dateCreated]], [[dateModified]], [[datePublished]]) are not known to be appropriate.
     */
    @NotNull public Builder temporal(@NotNull java.util.Date date) {
      putValue("temporal", date);
      return this;
    }
    /**
     * Indicates the party responsible for generating and publishing the current structured data markup, typically in cases where the structured data is derived automatically from existing published content but published on a different site. For example, student projects and open data initiatives often re-publish existing content with more explicitly structured metadata. The
     * [[sdPublisher]] property helps make such practices more explicit.
     */
    @NotNull public Builder sdPublisher(@NotNull Organization organization) {
      putValue("sdPublisher", organization);
      return this;
    }
    /**
     * Indicates the party responsible for generating and publishing the current structured data markup, typically in cases where the structured data is derived automatically from existing published content but published on a different site. For example, student projects and open data initiatives often re-publish existing content with more explicitly structured metadata. The
     * [[sdPublisher]] property helps make such practices more explicit.
     */
    @NotNull public Builder sdPublisher(@NotNull Organization.Builder organization) {
      putValue("sdPublisher", organization.build());
      return this;
    }
    /**
     * Indicates the party responsible for generating and publishing the current structured data markup, typically in cases where the structured data is derived automatically from existing published content but published on a different site. For example, student projects and open data initiatives often re-publish existing content with more explicitly structured metadata. The
     * [[sdPublisher]] property helps make such practices more explicit.
     */
    @NotNull public Builder sdPublisher(@NotNull Person person) {
      putValue("sdPublisher", person);
      return this;
    }
    /**
     * Indicates the party responsible for generating and publishing the current structured data markup, typically in cases where the structured data is derived automatically from existing published content but published on a different site. For example, student projects and open data initiatives often re-publish existing content with more explicitly structured metadata. The
     * [[sdPublisher]] property helps make such practices more explicit.
     */
    @NotNull public Builder sdPublisher(@NotNull Person.Builder person) {
      putValue("sdPublisher", person.build());
      return this;
    }
    /**
     * The predominant type or kind characterizing the learning resource. For example, 'presentation', 'handout'.
     */
    @NotNull public Builder learningResourceType(@NotNull DefinedTerm definedTerm) {
      putValue("learningResourceType", definedTerm);
      return this;
    }
    /**
     * The predominant type or kind characterizing the learning resource. For example, 'presentation', 'handout'.
     */
    @NotNull public Builder learningResourceType(@NotNull DefinedTerm.Builder definedTerm) {
      putValue("learningResourceType", definedTerm.build());
      return this;
    }
    /**
     * The predominant type or kind characterizing the learning resource. For example, 'presentation', 'handout'.
     */
    @NotNull public Builder learningResourceType(@NotNull String learningResourceType) {
      putValue("learningResourceType", learningResourceType);
      return this;
    }
    /**
     * The specific time described by a creative work, for works (e.g. articles, video objects etc.) that emphasise a particular moment within an Event.
     */
    @NotNull public Builder contentReferenceTime(@NotNull java.util.Date date) {
      putValue("contentReferenceTime", date);
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
     * Genre of the creative work, broadcast channel or group.
     */
    @NotNull public Builder genre(@NotNull Genre genre) {
      putValue("genre", genre);
      return this;
    }
    /**
     * A link to the page containing the comments of the CreativeWork.
     */
    @NotNull public Builder discussionUrl(@NotNull String discussionUrl) {
      putValue("discussionUrl", discussionUrl);
      return this;
    }
    /**
     * An alignment to an established educational framework.
     * 
     * This property should not be used where the nature of the alignment can be described using a simple property, for example to express that a resource [[teaches]] or [[assesses]] a competency.
     */
    @NotNull public Builder educationalAlignment(@NotNull AlignmentObject alignmentObject) {
      putValue("educationalAlignment", alignmentObject);
      return this;
    }
    /**
     * An alignment to an established educational framework.
     * 
     * This property should not be used where the nature of the alignment can be described using a simple property, for example to express that a resource [[teaches]] or [[assesses]] a competency.
     */
    @NotNull public Builder educationalAlignment(@NotNull AlignmentObject.Builder alignmentObject) {
      putValue("educationalAlignment", alignmentObject.build());
      return this;
    }
    /**
     * The date on which the CreativeWork was most recently modified or when the item's entry was modified within a DataFeed.
     */
    @NotNull public Builder dateModified(@NotNull java.util.Date date) {
      putValue("dateModified", date);
      return this;
    }
    /**
     * Comments, typically from users.
     */
    @NotNull public Builder comment(@NotNull Comment comment) {
      putValue("comment", comment);
      return this;
    }
    /**
     * Comments, typically from users.
     */
    @NotNull public Builder comment(@NotNull Comment.Builder comment) {
      putValue("comment", comment.build());
      return this;
    }
    /**
     * A license document that applies to this structured data, typically indicated by URL.
     */
    @NotNull public Builder sdLicense(@NotNull CreativeWork creativeWork) {
      putValue("sdLicense", creativeWork);
      return this;
    }
    /**
     * A license document that applies to this structured data, typically indicated by URL.
     */
    @NotNull public Builder sdLicense(@NotNull CreativeWork.Builder creativeWork) {
      putValue("sdLicense", creativeWork.build());
      return this;
    }
    /**
     * A license document that applies to this structured data, typically indicated by URL.
     */
    @NotNull public Builder sdLicense(@NotNull String sdLicense) {
      putValue("sdLicense", sdLicense);
      return this;
    }
    /**
     * The position of an item in a series or sequence of items.
     */
    @NotNull public Builder position(@NotNull Integer integer) {
      putValue("position", integer);
      return this;
    }
    /**
     * The position of an item in a series or sequence of items.
     */
    @NotNull public Builder position(@NotNull String position) {
      putValue("position", position);
      return this;
    }
    /**
     * A media object that encodes this CreativeWork. This property is a synonym for encoding.
     */
    @NotNull public Builder associatedMedia(@NotNull MediaObject mediaObject) {
      putValue("associatedMedia", mediaObject);
      return this;
    }
    /**
     * A media object that encodes this CreativeWork. This property is a synonym for encoding.
     */
    @NotNull public Builder associatedMedia(@NotNull MediaObject.Builder mediaObject) {
      putValue("associatedMedia", mediaObject.build());
      return this;
    }
    /**
     * Headline of the article.
     */
    @NotNull public Builder headline(@NotNull String headline) {
      putValue("headline", headline);
      return this;
    }
    /**
     * An embedded audio object.
     */
    @NotNull public Builder audio(@NotNull AudioObject audioObject) {
      putValue("audio", audioObject);
      return this;
    }
    /**
     * An embedded audio object.
     */
    @NotNull public Builder audio(@NotNull AudioObject.Builder audioObject) {
      putValue("audio", audioObject.build());
      return this;
    }
    /**
     * An embedded audio object.
     */
    @NotNull public Builder audio(@NotNull Clip clip) {
      putValue("audio", clip);
      return this;
    }
    /**
     * An embedded audio object.
     */
    @NotNull public Builder audio(@NotNull Clip.Builder clip) {
      putValue("audio", clip.build());
      return this;
    }
    /**
     * An embedded audio object.
     */
    @NotNull public Builder audio(@NotNull MusicRecording musicRecording) {
      putValue("audio", musicRecording);
      return this;
    }
    /**
     * An embedded audio object.
     */
    @NotNull public Builder audio(@NotNull MusicRecording.Builder musicRecording) {
      putValue("audio", musicRecording.build());
      return this;
    }
    /**
     * The status of a creative work in terms of its stage in a lifecycle. Example terms include Incomplete, Draft, Published, Obsolete. Some organizations define a set of terms for the stages of their publication lifecycle.
     */
    @NotNull public Builder creativeWorkStatus(@NotNull DefinedTerm definedTerm) {
      putValue("creativeWorkStatus", definedTerm);
      return this;
    }
    /**
     * The status of a creative work in terms of its stage in a lifecycle. Example terms include Incomplete, Draft, Published, Obsolete. Some organizations define a set of terms for the stages of their publication lifecycle.
     */
    @NotNull public Builder creativeWorkStatus(@NotNull DefinedTerm.Builder definedTerm) {
      putValue("creativeWorkStatus", definedTerm.build());
      return this;
    }
    /**
     * The status of a creative work in terms of its stage in a lifecycle. Example terms include Incomplete, Draft, Published, Obsolete. Some organizations define a set of terms for the stages of their publication lifecycle.
     */
    @NotNull public Builder creativeWorkStatus(@NotNull String creativeWorkStatus) {
      putValue("creativeWorkStatus", creativeWorkStatus);
      return this;
    }
    /**
     * Text of a notice appropriate for describing the copyright aspects of this Creative Work, ideally indicating the owner of the copyright for the Work.
     */
    @NotNull public Builder copyrightNotice(@NotNull String copyrightNotice) {
      putValue("copyrightNotice", copyrightNotice);
      return this;
    }
    /**
     * The creator/author of this CreativeWork. This is the same as the Author property for CreativeWork.
     */
    @NotNull public Builder creator(@NotNull Creator creator) {
      putValue("creator", creator);
      return this;
    }
    /**
     * The schema.org [[usageInfo]] property indicates further information about a [[CreativeWork]]. This property is applicable both to works that are freely available and to those that require payment or other transactions. It can reference additional information e.g. community expectations on preferred linking and citation conventions, as well as purchasing details. For something that can be commercially licensed, usageInfo can provide detailed, resource-specific information about licensing options.
     * 
     * This property can be used alongside the license property which indicates license(s) applicable to some piece of content. The usageInfo property can provide information about other licensing options, e.g. acquiring commercial usage rights for an image that is also available under non-commercial creative commons licenses.
     */
    @NotNull public Builder usageInfo(@NotNull UsageInfo usageInfo) {
      putValue("usageInfo", usageInfo);
      return this;
    }
    /**
     * Indicates a page documenting how licenses can be purchased or otherwise acquired, for the current item.
     */
    @NotNull public Builder acquireLicensePage(@NotNull UsageInfo usageInfo) {
      putValue("acquireLicensePage", usageInfo);
      return this;
    }
    /**
     * A flag to signal that the item, event, or place is accessible for free.
     */
    @NotNull public Builder isAccessibleForFree(@NotNull Boolean isAccessibleForFree) {
      putValue("isAccessibleForFree", isAccessibleForFree);
      return this;
    }
    /**
     * An [EIDR](https://eidr.org/) (Entertainment Identifier Registry) [[identifier]] representing a specific edit / edition for a work of film or television.
     * 
     * For example, the motion picture known as &quot;Ghostbusters&quot; whose [[titleEIDR]] is &quot;10.5240/7EC7-228A-510A-053E-CBB8-J&quot;, has several edits e.g. &quot;10.5240/1F2A-E1C5-680A-14C6-E76B-I&quot; and &quot;10.5240/8A35-3BEE-6497-5D12-9E4F-3&quot;.
     * 
     * Since schema.org types like [[Movie]] and [[TVEpisode]] can be used for both works and their multiple expressions, it is possible to use [[titleEIDR]] alone (for a general description), or alongside [[editEIDR]] for a more edit-specific description.
     * 
     */
    @NotNull public Builder editEIDR(@NotNull Identifier identifier) {
      putValue("editEIDR", identifier);
      return this;
    }
    /**
     * The version of the CreativeWork embodied by a specified resource.
     */
    @NotNull public Builder version(@NotNull Number number) {
      putValue("version", number);
      return this;
    }
    /**
     * The version of the CreativeWork embodied by a specified resource.
     */
    @NotNull public Builder version(@NotNull String version) {
      putValue("version", version);
      return this;
    }
    /**
     * A list of single or combined accessModes that are sufficient to understand all the intellectual content of a resource. Expected values include:  auditory, tactile, textual, visual.
     *       
     */
    @NotNull public Builder accessModeSufficient(@NotNull ItemList itemList) {
      putValue("accessModeSufficient", itemList);
      return this;
    }
    /**
     * A list of single or combined accessModes that are sufficient to understand all the intellectual content of a resource. Expected values include:  auditory, tactile, textual, visual.
     *       
     */
    @NotNull public Builder accessModeSufficient(@NotNull ItemList.Builder itemList) {
      putValue("accessModeSufficient", itemList.build());
      return this;
    }
    /**
     * A resource from which this work is derived or from which it is a modification or adaption.
     */
    @NotNull public Builder isBasedOn(@NotNull CreativeWork creativeWork) {
      putValue("isBasedOn", creativeWork);
      return this;
    }
    /**
     * A resource from which this work is derived or from which it is a modification or adaption.
     */
    @NotNull public Builder isBasedOn(@NotNull CreativeWork.Builder creativeWork) {
      putValue("isBasedOn", creativeWork.build());
      return this;
    }
    /**
     * A resource from which this work is derived or from which it is a modification or adaption.
     */
    @NotNull public Builder isBasedOn(@NotNull Product product) {
      putValue("isBasedOn", product);
      return this;
    }
    /**
     * A resource from which this work is derived or from which it is a modification or adaption.
     */
    @NotNull public Builder isBasedOn(@NotNull Product.Builder product) {
      putValue("isBasedOn", product.build());
      return this;
    }
    /**
     * A resource from which this work is derived or from which it is a modification or adaption.
     */
    @NotNull public Builder isBasedOn(@NotNull String isBasedOn) {
      putValue("isBasedOn", isBasedOn);
      return this;
    }
    /**
     * An embedded video object.
     */
    @NotNull public Builder video(@NotNull Clip clip) {
      putValue("video", clip);
      return this;
    }
    /**
     * An embedded video object.
     */
    @NotNull public Builder video(@NotNull Clip.Builder clip) {
      putValue("video", clip.build());
      return this;
    }
    /**
     * An embedded video object.
     */
    @NotNull public Builder video(@NotNull VideoObject videoObject) {
      putValue("video", videoObject);
      return this;
    }
    /**
     * An embedded video object.
     */
    @NotNull public Builder video(@NotNull VideoObject.Builder videoObject) {
      putValue("video", videoObject.build());
      return this;
    }
    /**
     * Date the content expires and is no longer useful or available. For example a [[VideoObject]] or [[NewsArticle]] whose availability or relevance is time-limited, or a [[ClaimReview]] fact check whose publisher wants to indicate that it may no longer be relevant (or helpful to highlight) after some date.
     */
    @NotNull public Builder expires(@NotNull java.util.Date date) {
      putValue("expires", date);
      return this;
    }
    /**
     * Text that can be used to credit person(s) and/or organization(s) associated with a published Creative Work.
     */
    @NotNull public Builder creditText(@NotNull String creditText) {
      putValue("creditText", creditText);
      return this;
    }
    /**
     * A secondary contributor to the CreativeWork or Event.
     */
    @NotNull public Builder contributor(@NotNull Organization organization) {
      putValue("contributor", organization);
      return this;
    }
    /**
     * A secondary contributor to the CreativeWork or Event.
     */
    @NotNull public Builder contributor(@NotNull Organization.Builder organization) {
      putValue("contributor", organization.build());
      return this;
    }
    /**
     * A secondary contributor to the CreativeWork or Event.
     */
    @NotNull public Builder contributor(@NotNull Person person) {
      putValue("contributor", person);
      return this;
    }
    /**
     * A secondary contributor to the CreativeWork or Event.
     */
    @NotNull public Builder contributor(@NotNull Person.Builder person) {
      putValue("contributor", person.build());
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
     * Date of first broadcast/publication.
     */
    @NotNull public Builder datePublished(@NotNull java.util.Date date) {
      putValue("datePublished", date);
      return this;
    }
    /**
     * The party holding the legal copyright to the CreativeWork.
     */
    @NotNull public Builder copyrightHolder(@NotNull Organization organization) {
      putValue("copyrightHolder", organization);
      return this;
    }
    /**
     * The party holding the legal copyright to the CreativeWork.
     */
    @NotNull public Builder copyrightHolder(@NotNull Organization.Builder organization) {
      putValue("copyrightHolder", organization.build());
      return this;
    }
    /**
     * The party holding the legal copyright to the CreativeWork.
     */
    @NotNull public Builder copyrightHolder(@NotNull Person person) {
      putValue("copyrightHolder", person);
      return this;
    }
    /**
     * The party holding the legal copyright to the CreativeWork.
     */
    @NotNull public Builder copyrightHolder(@NotNull Person.Builder person) {
      putValue("copyrightHolder", person.build());
      return this;
    }
    /**
     * The author of this content or rating. Please note that author is special in that HTML 5 provides a special mechanism for indicating authorship via the rel tag. That is equivalent to this and may be used interchangeably.
     */
    @NotNull public Builder author(@NotNull Organization organization) {
      putValue("author", organization);
      return this;
    }
    /**
     * The author of this content or rating. Please note that author is special in that HTML 5 provides a special mechanism for indicating authorship via the rel tag. That is equivalent to this and may be used interchangeably.
     */
    @NotNull public Builder author(@NotNull Organization.Builder organization) {
      putValue("author", organization.build());
      return this;
    }
    /**
     * The author of this content or rating. Please note that author is special in that HTML 5 provides a special mechanism for indicating authorship via the rel tag. That is equivalent to this and may be used interchangeably.
     */
    @NotNull public Builder author(@NotNull Person person) {
      putValue("author", person);
      return this;
    }
    /**
     * The author of this content or rating. Please note that author is special in that HTML 5 provides a special mechanism for indicating authorship via the rel tag. That is equivalent to this and may be used interchangeably.
     */
    @NotNull public Builder author(@NotNull Person.Builder person) {
      putValue("author", person.build());
      return this;
    }
    /**
     * A publication event associated with the item.
     */
    @NotNull public Builder publication(@NotNull PublicationEvent publicationEvent) {
      putValue("publication", publicationEvent);
      return this;
    }
    /**
     * A publication event associated with the item.
     */
    @NotNull public Builder publication(@NotNull PublicationEvent.Builder publicationEvent) {
      putValue("publication", publicationEvent.build());
      return this;
    }
    /**
     * A license document that applies to this content, typically indicated by URL.
     */
    @NotNull public Builder license(@NotNull CreativeWork creativeWork) {
      putValue("license", creativeWork);
      return this;
    }
    /**
     * A license document that applies to this content, typically indicated by URL.
     */
    @NotNull public Builder license(@NotNull CreativeWork.Builder creativeWork) {
      putValue("license", creativeWork.build());
      return this;
    }
    /**
     * A license document that applies to this content, typically indicated by URL.
     */
    @NotNull public Builder license(@NotNull String license) {
      putValue("license", license);
      return this;
    }
    /**
     * Media type typically expressed using a MIME format (see [IANA site](http://www.iana.org/assignments/media-types/media-types.xhtml) and [MDN reference](https://developer.mozilla.org/en-US/docs/Web/HTTP/Basics_of_HTTP/MIME_types)) e.g. application/zip for a SoftwareApplication binary, audio/mpeg for .mp3 etc.).
     * 
     * In cases where a [[CreativeWork]] has several media type representations, [[encoding]] can be used to indicate each [[MediaObject]] alongside particular [[encodingFormat]] information.
     * 
     * Unregistered or niche encoding and file formats can be indicated instead via the most appropriate URL, e.g. defining Web page or a Wikipedia/Wikidata entry.
     */
    @NotNull public Builder encodingFormat(@NotNull String encodingFormat) {
      putValue("encodingFormat", encodingFormat);
      return this;
    }
    /**
     * Fictional person connected with a creative work.
     */
    @NotNull public Builder character(@NotNull Person person) {
      putValue("character", person);
      return this;
    }
    /**
     * Fictional person connected with a creative work.
     */
    @NotNull public Builder character(@NotNull Person.Builder person) {
      putValue("character", person.build());
      return this;
    }
    /**
     * The quantity of the materials being described or an expression of the physical space they occupy.
     */
    @NotNull public Builder materialExtent(@NotNull QuantitativeValue quantitativeValue) {
      putValue("materialExtent", quantitativeValue);
      return this;
    }
    /**
     * The quantity of the materials being described or an expression of the physical space they occupy.
     */
    @NotNull public Builder materialExtent(@NotNull QuantitativeValue.Builder quantitativeValue) {
      putValue("materialExtent", quantitativeValue.build());
      return this;
    }
    /**
     * The quantity of the materials being described or an expression of the physical space they occupy.
     */
    @NotNull public Builder materialExtent(@NotNull String materialExtent) {
      putValue("materialExtent", materialExtent);
      return this;
    }
    /**
     * Content features of the resource, such as accessible media, alternatives and supported enhancements for accessibility ([WebSchemas wiki lists possible values](http://www.w3.org/wiki/WebSchemas/Accessibility)).
     */
    @NotNull public Builder accessibilityFeature(@NotNull String accessibilityFeature) {
      putValue("accessibilityFeature", accessibilityFeature);
      return this;
    }
    /**
     * A characteristic of the described resource that is physiologically dangerous to some users. Related to WCAG 2.0 guideline 2.3 ([WebSchemas wiki lists possible values](http://www.w3.org/wiki/WebSchemas/Accessibility)).
     */
    @NotNull public Builder accessibilityHazard(@NotNull String accessibilityHazard) {
      putValue("accessibilityHazard", accessibilityHazard);
      return this;
    }
    /**
     * Indicates an item or CreativeWork that this item, or CreativeWork (in some sense), is part of.
     */
    @NotNull public Builder isPartOf(@NotNull IsPartOf isPartOf) {
      putValue("isPartOf", isPartOf);
      return this;
    }
    /**
     * Indicates that the resource is compatible with the referenced accessibility API ([WebSchemas wiki lists possible values](http://www.w3.org/wiki/WebSchemas/Accessibility)).
     */
    @NotNull public Builder accessibilityAPI(@NotNull String accessibilityAPI) {
      putValue("accessibilityAPI", accessibilityAPI);
      return this;
    }
    /**
     * Example/instance/realization/derivation of the concept of this creative work. eg. The paperback edition, first edition, or eBook.
     */
    @NotNull public Builder workExample(@NotNull WorkExample workExample) {
      putValue("workExample", workExample);
      return this;
    }
    /**
     * The item being described is intended to help a person learn the competency or learning outcome defined by the referenced term.
     */
    @NotNull public Builder teaches(@NotNull DefinedTerm definedTerm) {
      putValue("teaches", definedTerm);
      return this;
    }
    /**
     * The item being described is intended to help a person learn the competency or learning outcome defined by the referenced term.
     */
    @NotNull public Builder teaches(@NotNull DefinedTerm.Builder definedTerm) {
      putValue("teaches", definedTerm.build());
      return this;
    }
    /**
     * The item being described is intended to help a person learn the competency or learning outcome defined by the referenced term.
     */
    @NotNull public Builder teaches(@NotNull String teaches) {
      putValue("teaches", teaches);
      return this;
    }
    /**
     * The publisher of the creative work.
     */
    @NotNull public Builder publisher(@NotNull Organization organization) {
      putValue("publisher", organization);
      return this;
    }
    /**
     * The publisher of the creative work.
     */
    @NotNull public Builder publisher(@NotNull Organization.Builder organization) {
      putValue("publisher", organization.build());
      return this;
    }
    /**
     * The publisher of the creative work.
     */
    @NotNull public Builder publisher(@NotNull Person person) {
      putValue("publisher", person);
      return this;
    }
    /**
     * The publisher of the creative work.
     */
    @NotNull public Builder publisher(@NotNull Person.Builder person) {
      putValue("publisher", person.build());
      return this;
    }
    /**
     * The temporalCoverage of a CreativeWork indicates the period that the content applies to, i.e. that it describes, either as a DateTime or as a textual string indicating a time period in [ISO 8601 time interval format](https://en.wikipedia.org/wiki/ISO_8601#Time_intervals). In
     *       the case of a Dataset it will typically indicate the relevant time period in a precise notation (e.g. for a 2011 census dataset, the year 2011 would be written &quot;2011/2012&quot;). Other forms of content e.g. ScholarlyArticle, Book, TVSeries or TVEpisode may indicate their temporalCoverage in broader terms - textually or via well-known URL.
     *       Written works such as books may sometimes have precise temporal coverage too, e.g. a work set in 1939 - 1945 can be indicated in ISO 8601 interval format format via &quot;1939/1945&quot;.
     * 
     * Open-ended date ranges can be written with &quot;..&quot; in place of the end date. For example, &quot;2015-11/..&quot; indicates a range beginning in November 2015 and with no specified final date. This is tentative and might be updated in future when ISO 8601 is officially updated.
     */
    @NotNull public Builder temporalCoverage(@NotNull String temporalCoverage) {
      putValue("temporalCoverage", temporalCoverage);
      return this;
    }
    /**
     * The temporalCoverage of a CreativeWork indicates the period that the content applies to, i.e. that it describes, either as a DateTime or as a textual string indicating a time period in [ISO 8601 time interval format](https://en.wikipedia.org/wiki/ISO_8601#Time_intervals). In
     *       the case of a Dataset it will typically indicate the relevant time period in a precise notation (e.g. for a 2011 census dataset, the year 2011 would be written &quot;2011/2012&quot;). Other forms of content e.g. ScholarlyArticle, Book, TVSeries or TVEpisode may indicate their temporalCoverage in broader terms - textually or via well-known URL.
     *       Written works such as books may sometimes have precise temporal coverage too, e.g. a work set in 1939 - 1945 can be indicated in ISO 8601 interval format format via &quot;1939/1945&quot;.
     * 
     * Open-ended date ranges can be written with &quot;..&quot; in place of the end date. For example, &quot;2015-11/..&quot; indicates a range beginning in November 2015 and with no specified final date. This is tentative and might be updated in future when ISO 8601 is officially updated.
     */
    @NotNull public Builder temporalCoverage(@NotNull java.util.Date date) {
      putValue("temporalCoverage", date);
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
     * A citation or reference to another creative work, such as another publication, web page, scholarly article, etc.
     */
    @NotNull public Builder citation(@NotNull CreativeWork creativeWork) {
      putValue("citation", creativeWork);
      return this;
    }
    /**
     * A citation or reference to another creative work, such as another publication, web page, scholarly article, etc.
     */
    @NotNull public Builder citation(@NotNull CreativeWork.Builder creativeWork) {
      putValue("citation", creativeWork.build());
      return this;
    }
    /**
     * A citation or reference to another creative work, such as another publication, web page, scholarly article, etc.
     */
    @NotNull public Builder citation(@NotNull String citation) {
      putValue("citation", citation);
      return this;
    }
    /**
     * The person or organization who produced the work (e.g. music album, movie, tv/radio series etc.).
     */
    @NotNull public Builder producer(@NotNull Organization organization) {
      putValue("producer", organization);
      return this;
    }
    /**
     * The person or organization who produced the work (e.g. music album, movie, tv/radio series etc.).
     */
    @NotNull public Builder producer(@NotNull Organization.Builder organization) {
      putValue("producer", organization.build());
      return this;
    }
    /**
     * The person or organization who produced the work (e.g. music album, movie, tv/radio series etc.).
     */
    @NotNull public Builder producer(@NotNull Person person) {
      putValue("producer", person);
      return this;
    }
    /**
     * The person or organization who produced the work (e.g. music album, movie, tv/radio series etc.).
     */
    @NotNull public Builder producer(@NotNull Person.Builder person) {
      putValue("producer", person.build());
      return this;
    }
    /**
     * A maintainer of a [[Dataset]], software package ([[SoftwareApplication]]), or other [[Project]]. A maintainer is a [[Person]] or [[Organization]] that manages contributions to, and/or publication of, some (typically complex) artifact. It is common for distributions of software and data to be based on &quot;upstream&quot; sources. When [[maintainer]] is applied to a specific version of something e.g. a particular version or packaging of a [[Dataset]], it is always  possible that the upstream source has a different maintainer. The [[isBasedOn]] property can be used to indicate such relationships between datasets to make the different maintenance roles clear. Similarly in the case of software, a package may have dedicated maintainers working on integration into software distributions such as Ubuntu, as well as upstream maintainers of the underlying work.
     *       
     */
    @NotNull public Builder maintainer(@NotNull Organization organization) {
      putValue("maintainer", organization);
      return this;
    }
    /**
     * A maintainer of a [[Dataset]], software package ([[SoftwareApplication]]), or other [[Project]]. A maintainer is a [[Person]] or [[Organization]] that manages contributions to, and/or publication of, some (typically complex) artifact. It is common for distributions of software and data to be based on &quot;upstream&quot; sources. When [[maintainer]] is applied to a specific version of something e.g. a particular version or packaging of a [[Dataset]], it is always  possible that the upstream source has a different maintainer. The [[isBasedOn]] property can be used to indicate such relationships between datasets to make the different maintenance roles clear. Similarly in the case of software, a package may have dedicated maintainers working on integration into software distributions such as Ubuntu, as well as upstream maintainers of the underlying work.
     *       
     */
    @NotNull public Builder maintainer(@NotNull Organization.Builder organization) {
      putValue("maintainer", organization.build());
      return this;
    }
    /**
     * A maintainer of a [[Dataset]], software package ([[SoftwareApplication]]), or other [[Project]]. A maintainer is a [[Person]] or [[Organization]] that manages contributions to, and/or publication of, some (typically complex) artifact. It is common for distributions of software and data to be based on &quot;upstream&quot; sources. When [[maintainer]] is applied to a specific version of something e.g. a particular version or packaging of a [[Dataset]], it is always  possible that the upstream source has a different maintainer. The [[isBasedOn]] property can be used to indicate such relationships between datasets to make the different maintenance roles clear. Similarly in the case of software, a package may have dedicated maintainers working on integration into software distributions such as Ubuntu, as well as upstream maintainers of the underlying work.
     *       
     */
    @NotNull public Builder maintainer(@NotNull Person person) {
      putValue("maintainer", person);
      return this;
    }
    /**
     * A maintainer of a [[Dataset]], software package ([[SoftwareApplication]]), or other [[Project]]. A maintainer is a [[Person]] or [[Organization]] that manages contributions to, and/or publication of, some (typically complex) artifact. It is common for distributions of software and data to be based on &quot;upstream&quot; sources. When [[maintainer]] is applied to a specific version of something e.g. a particular version or packaging of a [[Dataset]], it is always  possible that the upstream source has a different maintainer. The [[isBasedOn]] property can be used to indicate such relationships between datasets to make the different maintenance roles clear. Similarly in the case of software, a package may have dedicated maintainers working on integration into software distributions such as Ubuntu, as well as upstream maintainers of the underlying work.
     *       
     */
    @NotNull public Builder maintainer(@NotNull Person.Builder person) {
      putValue("maintainer", person.build());
      return this;
    }
    /**
     * Organization or person who adapts a creative work to different languages, regional differences and technical requirements of a target market, or that translates during some event.
     */
    @NotNull public Builder translator(@NotNull Organization organization) {
      putValue("translator", organization);
      return this;
    }
    /**
     * Organization or person who adapts a creative work to different languages, regional differences and technical requirements of a target market, or that translates during some event.
     */
    @NotNull public Builder translator(@NotNull Organization.Builder organization) {
      putValue("translator", organization.build());
      return this;
    }
    /**
     * Organization or person who adapts a creative work to different languages, regional differences and technical requirements of a target market, or that translates during some event.
     */
    @NotNull public Builder translator(@NotNull Person person) {
      putValue("translator", person);
      return this;
    }
    /**
     * Organization or person who adapts a creative work to different languages, regional differences and technical requirements of a target market, or that translates during some event.
     */
    @NotNull public Builder translator(@NotNull Person.Builder person) {
      putValue("translator", person.build());
      return this;
    }
    /**
     * A human-readable summary of specific accessibility features or deficiencies, consistent with the other accessibility metadata but expressing subtleties such as &quot;short descriptions are present but long descriptions will be needed for non-visual users&quot; or &quot;short descriptions are present and no long descriptions are needed.&quot;
     */
    @NotNull public Builder accessibilitySummary(@NotNull String accessibilitySummary) {
      putValue("accessibilitySummary", accessibilitySummary);
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
     * A person or organization that supports (sponsors) something through some kind of financial contribution.
     */
    @NotNull public Builder funder(@NotNull Sponsor sponsor) {
      putValue("funder", sponsor);
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
     * The number of interactions for the CreativeWork using the WebSite or SoftwareApplication. The most specific child type of InteractionCounter should be used.
     */
    @NotNull public Builder interactionStatistic(@NotNull InteractionCounter interactionCounter) {
      putValue("interactionStatistic", interactionCounter);
      return this;
    }
    /**
     * The number of interactions for the CreativeWork using the WebSite or SoftwareApplication. The most specific child type of InteractionCounter should be used.
     */
    @NotNull public Builder interactionStatistic(@NotNull InteractionCounter.Builder interactionCounter) {
      putValue("interactionStatistic", interactionCounter.build());
      return this;
    }
    /**
     * The typical expected age range, e.g. '7-9', '11-'.
     */
    @NotNull public Builder typicalAgeRange(@NotNull String typicalAgeRange) {
      putValue("typicalAgeRange", typicalAgeRange);
      return this;
    }
    /**
     * A media object that encodes this CreativeWork. This property is a synonym for associatedMedia.
     */
    @NotNull public Builder encoding(@NotNull MediaObject mediaObject) {
      putValue("encoding", mediaObject);
      return this;
    }
    /**
     * A media object that encodes this CreativeWork. This property is a synonym for associatedMedia.
     */
    @NotNull public Builder encoding(@NotNull MediaObject.Builder mediaObject) {
      putValue("encoding", mediaObject.build());
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
     * Keywords or tags used to describe this content. Multiple entries in a keywords list are typically delimited by commas.
     */
    @NotNull public Builder keywords(@NotNull DefinedTerm definedTerm) {
      putValue("keywords", definedTerm);
      return this;
    }
    /**
     * Keywords or tags used to describe this content. Multiple entries in a keywords list are typically delimited by commas.
     */
    @NotNull public Builder keywords(@NotNull DefinedTerm.Builder definedTerm) {
      putValue("keywords", definedTerm.build());
      return this;
    }
    /**
     * Keywords or tags used to describe this content. Multiple entries in a keywords list are typically delimited by commas.
     */
    @NotNull public Builder keywords(@NotNull String keywords) {
      putValue("keywords", keywords);
      return this;
    }
    /**
     * The place and time the release was issued, expressed as a PublicationEvent.
     */
    @NotNull public Builder releasedEvent(@NotNull PublicationEvent publicationEvent) {
      putValue("releasedEvent", publicationEvent);
      return this;
    }
    /**
     * The place and time the release was issued, expressed as a PublicationEvent.
     */
    @NotNull public Builder releasedEvent(@NotNull PublicationEvent.Builder publicationEvent) {
      putValue("releasedEvent", publicationEvent.build());
      return this;
    }
    /**
     * Indicates whether this content is family friendly.
     */
    @NotNull public Builder isFamilyFriendly(@NotNull Boolean isFamilyFriendly) {
      putValue("isFamilyFriendly", isFamilyFriendly);
      return this;
    }
    /**
     * A secondary title of the CreativeWork.
     */
    @NotNull public Builder alternativeHeadline(@NotNull String alternativeHeadline) {
      putValue("alternativeHeadline", alternativeHeadline);
      return this;
    }
    /**
     * Indicates (by URL or string) a particular version of a schema used in some CreativeWork. This property was created primarily to
     *     indicate the use of a specific schema.org release, e.g. ```10.0``` as a simple string, or more explicitly via URL, ```http://schema.org/docs/releases.html#v10.0```. There may be situations in which other schemas might usefully be referenced this way, e.g. ```http://dublincore.org/specifications/dublin-core/dces/1999-07-02/``` but this has not been carefully explored in the community.
     */
    @NotNull public Builder schemaVersion(@NotNull String schemaVersion) {
      putValue("schemaVersion", schemaVersion);
      return this;
    }
    /**
     * The item being described is intended to assess the competency or learning outcome defined by the referenced term.
     */
    @NotNull public Builder assesses(@NotNull DefinedTerm definedTerm) {
      putValue("assesses", definedTerm);
      return this;
    }
    /**
     * The item being described is intended to assess the competency or learning outcome defined by the referenced term.
     */
    @NotNull public Builder assesses(@NotNull DefinedTerm.Builder definedTerm) {
      putValue("assesses", definedTerm.build());
      return this;
    }
    /**
     * The item being described is intended to assess the competency or learning outcome defined by the referenced term.
     */
    @NotNull public Builder assesses(@NotNull String assesses) {
      putValue("assesses", assesses);
      return this;
    }
    /**
     * The publishing division which published the comic.
     */
    @NotNull public Builder publisherImprint(@NotNull Organization organization) {
      putValue("publisherImprint", organization);
      return this;
    }
    /**
     * The publishing division which published the comic.
     */
    @NotNull public Builder publisherImprint(@NotNull Organization.Builder organization) {
      putValue("publisherImprint", organization.build());
      return this;
    }
    /**
     * The human sensory perceptual system or cognitive faculty through which a person may process or perceive information. Expected values include: auditory, tactile, textual, visual, colorDependent, chartOnVisual, chemOnVisual, diagramOnVisual, mathOnVisual, musicOnVisual, textOnVisual.
     *       
     */
    @NotNull public Builder accessMode(@NotNull String accessMode) {
      putValue("accessMode", accessMode);
      return this;
    }
    /**
     * Indicates the date on which the current structured data was generated / published. Typically used alongside [[sdPublisher]]
     */
    @NotNull public Builder sdDatePublished(@NotNull java.util.Date date) {
      putValue("sdDatePublished", date);
      return this;
    }
    /**
     * Used to indicate a specific claim contained, implied, translated or refined from the content of a [[MediaObject]] or other [[CreativeWork]]. The interpreting party can be indicated using [[claimInterpreter]].
     */
    @NotNull public Builder interpretedAsClaim(@NotNull Claim claim) {
      putValue("interpretedAsClaim", claim);
      return this;
    }
    /**
     * Used to indicate a specific claim contained, implied, translated or refined from the content of a [[MediaObject]] or other [[CreativeWork]]. The interpreting party can be indicated using [[claimInterpreter]].
     */
    @NotNull public Builder interpretedAsClaim(@NotNull Claim.Builder claim) {
      putValue("interpretedAsClaim", claim.build());
      return this;
    }
    /**
     * Approximate or typical time it takes to work with or through this learning resource for the typical intended target audience, e.g. 'PT30M', 'PT1H25M'.
     */
    @NotNull public Builder timeRequired(@NotNull Duration duration) {
      putValue("timeRequired", duration);
      return this;
    }
    /**
     * The location where the CreativeWork was created, which may not be the same as the location depicted in the CreativeWork.
     */
    @NotNull public Builder locationCreated(@NotNull Place place) {
      putValue("locationCreated", place);
      return this;
    }
    /**
     * The location where the CreativeWork was created, which may not be the same as the location depicted in the CreativeWork.
     */
    @NotNull public Builder locationCreated(@NotNull Place.Builder place) {
      putValue("locationCreated", place.build());
      return this;
    }
    /**
     * Specifies the Person who edited the CreativeWork.
     */
    @NotNull public Builder editor(@NotNull Person person) {
      putValue("editor", person);
      return this;
    }
    /**
     * Specifies the Person who edited the CreativeWork.
     */
    @NotNull public Builder editor(@NotNull Person.Builder person) {
      putValue("editor", person.build());
      return this;
    }
    /**
     * The purpose of a work in the context of education; for example, 'assignment', 'group work'.
     */
    @NotNull public Builder educationalUse(@NotNull DefinedTerm definedTerm) {
      putValue("educationalUse", definedTerm);
      return this;
    }
    /**
     * The purpose of a work in the context of education; for example, 'assignment', 'group work'.
     */
    @NotNull public Builder educationalUse(@NotNull DefinedTerm.Builder definedTerm) {
      putValue("educationalUse", definedTerm.build());
      return this;
    }
    /**
     * The purpose of a work in the context of education; for example, 'assignment', 'group work'.
     */
    @NotNull public Builder educationalUse(@NotNull String educationalUse) {
      putValue("educationalUse", educationalUse);
      return this;
    }
    /**
     * The year during which the claimed copyright for the CreativeWork was first asserted.
     */
    @NotNull public Builder copyrightYear(@NotNull Integer integer) {
      putValue("copyrightYear", integer);
      return this;
    }
    /**
     * The year during which the claimed copyright for the CreativeWork was first asserted.
     */
    @NotNull public Builder copyrightYear(@NotNull Long copyrightYear) {
      putValue("copyrightYear", copyrightYear);
      return this;
    }
    /**
     * The year during which the claimed copyright for the CreativeWork was first asserted.
     */
    @NotNull public Builder copyrightYear(@NotNull Float copyrightYear) {
      putValue("copyrightYear", copyrightYear);
      return this;
    }
    /**
     * The year during which the claimed copyright for the CreativeWork was first asserted.
     */
    @NotNull public Builder copyrightYear(@NotNull Double copyrightYear) {
      putValue("copyrightYear", copyrightYear);
      return this;
    }
    /**
     * The year during which the claimed copyright for the CreativeWork was first asserted.
     */
    @NotNull public Builder copyrightYear(@NotNull String copyrightYear) {
      putValue("copyrightYear", copyrightYear);
      return this;
    }
    /**
     * The Organization on whose behalf the creator was working.
     */
    @NotNull public Builder sourceOrganization(@NotNull Organization organization) {
      putValue("sourceOrganization", organization);
      return this;
    }
    /**
     * The Organization on whose behalf the creator was working.
     */
    @NotNull public Builder sourceOrganization(@NotNull Organization.Builder organization) {
      putValue("sourceOrganization", organization.build());
      return this;
    }
    /**
     * Specifies the Person that is legally accountable for the CreativeWork.
     */
    @NotNull public Builder accountablePerson(@NotNull Person person) {
      putValue("accountablePerson", person);
      return this;
    }
    /**
     * Specifies the Person that is legally accountable for the CreativeWork.
     */
    @NotNull public Builder accountablePerson(@NotNull Person.Builder person) {
      putValue("accountablePerson", person.build());
      return this;
    }
    /**
     * The predominant mode of learning supported by the learning resource. Acceptable values are 'active', 'expositive', or 'mixed'.
     */
    @NotNull public Builder interactivityType(@NotNull String interactivityType) {
      putValue("interactivityType", interactivityType);
      return this;
    }
    /**
     * An abstract is a short description that summarizes a [[CreativeWork]].
     */
    @NotNull public Builder _abstract(@NotNull String _abstract) {
      putValue("abstract", _abstract);
      return this;
    }
    /**
     * Identifies input methods that are sufficient to fully control the described resource ([WebSchemas wiki lists possible values](http://www.w3.org/wiki/WebSchemas/Accessibility)).
     */
    @NotNull public Builder accessibilityControl(@NotNull String accessibilityControl) {
      putValue("accessibilityControl", accessibilityControl);
      return this;
    }
    /**
     * The work that this work has been translated from. e.g. 物种起源 is a translationOf &ldquo;On the Origin of Species&rdquo;
     */
    @NotNull public Builder translationOfWork(@NotNull CreativeWork creativeWork) {
      putValue("translationOfWork", creativeWork);
      return this;
    }
    /**
     * The work that this work has been translated from. e.g. 物种起源 is a translationOf &ldquo;On the Origin of Species&rdquo;
     */
    @NotNull public Builder translationOfWork(@NotNull CreativeWork.Builder creativeWork) {
      putValue("translationOfWork", creativeWork.build());
      return this;
    }
    /**
     * A work that is a translation of the content of this work. e.g. 西遊記 has an English workTranslation &ldquo;Journey to the West&rdquo;,a German workTranslation &ldquo;Monkeys Pilgerfahrt&rdquo; and a Vietnamese  translation T&acirc;y du k&yacute; b&igrave;nh khảo.
     */
    @NotNull public Builder workTranslation(@NotNull CreativeWork creativeWork) {
      putValue("workTranslation", creativeWork);
      return this;
    }
    /**
     * A work that is a translation of the content of this work. e.g. 西遊記 has an English workTranslation &ldquo;Journey to the West&rdquo;,a German workTranslation &ldquo;Monkeys Pilgerfahrt&rdquo; and a Vietnamese  translation T&acirc;y du k&yacute; b&igrave;nh khảo.
     */
    @NotNull public Builder workTranslation(@NotNull CreativeWork.Builder creativeWork) {
      putValue("workTranslation", creativeWork.build());
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
     * The subject matter of the content.
     */
    @NotNull public Builder about(@NotNull Thing thing) {
      putValue("about", thing);
      return this;
    }
    /**
     * The subject matter of the content.
     */
    @NotNull public Builder about(@NotNull Thing.Builder thing) {
      putValue("about", thing.build());
      return this;
    }
    /**
     * Indicates the primary entity described in some page or other CreativeWork.
     */
    @NotNull public Builder mainEntity(@NotNull About about) {
      putValue("mainEntity", about);
      return this;
    }
    /**
     * Indicates the primary entity described in some page or other CreativeWork.
     */
    @NotNull public Builder mainEntity(@NotNull About.Builder about) {
      putValue("mainEntity", about.build());
      return this;
    }
    /**
     * Indicates the primary entity described in some page or other CreativeWork.
     */
    @NotNull public Builder mainEntity(@NotNull Thing thing) {
      putValue("mainEntity", thing);
      return this;
    }
    /**
     * Indicates the primary entity described in some page or other CreativeWork.
     */
    @NotNull public Builder mainEntity(@NotNull Thing.Builder thing) {
      putValue("mainEntity", thing.build());
      return this;
    }
    /**
     * The Event where the CreativeWork was recorded. The CreativeWork may capture all or part of the event.
     */
    @NotNull public Builder recordedAt(@NotNull Event event) {
      putValue("recordedAt", event);
      return this;
    }
    /**
     * The Event where the CreativeWork was recorded. The CreativeWork may capture all or part of the event.
     */
    @NotNull public Builder recordedAt(@NotNull Event.Builder event) {
      putValue("recordedAt", event.build());
      return this;
    }
    /**
     * A creative work that this work is an example/instance/realization/derivation of.
     */
    @NotNull public Builder exampleOfWork(@NotNull CreativeWork creativeWork) {
      putValue("exampleOfWork", creativeWork);
      return this;
    }
    /**
     * A creative work that this work is an example/instance/realization/derivation of.
     */
    @NotNull public Builder exampleOfWork(@NotNull CreativeWork.Builder creativeWork) {
      putValue("exampleOfWork", creativeWork.build());
      return this;
    }
    /**
     * The location depicted or described in the content. For example, the location in a photograph or painting.
     */
    @NotNull public Builder contentLocation(@NotNull ContentLocation contentLocation) {
      putValue("contentLocation", contentLocation);
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
      if ("text".equals(key) && value instanceof String) { this.text((String)value); return; }
      if ("texts".equals(key) && value instanceof String) { this.text((String)value); return; }
      if ("spatial".equals(key) && value instanceof Place) { this.spatial((Place)value); return; }
      if ("spatials".equals(key) && value instanceof Place) { this.spatial((Place)value); return; }
      if ("publishingPrinciples".equals(key) && value instanceof PublishingPrinciples) { this.publishingPrinciples((PublishingPrinciples)value); return; }
      if ("publishingPrincipless".equals(key) && value instanceof PublishingPrinciples) { this.publishingPrinciples((PublishingPrinciples)value); return; }
      if ("inLanguage".equals(key) && value instanceof Language) { this.inLanguage((Language)value); return; }
      if ("inLanguages".equals(key) && value instanceof Language) { this.inLanguage((Language)value); return; }
      if ("inLanguage".equals(key) && value instanceof String) { this.inLanguage((String)value); return; }
      if ("inLanguages".equals(key) && value instanceof String) { this.inLanguage((String)value); return; }
      if ("thumbnailUrl".equals(key) && value instanceof String) { this.thumbnailUrl((String)value); return; }
      if ("thumbnailUrls".equals(key) && value instanceof String) { this.thumbnailUrl((String)value); return; }
      if ("hasPart".equals(key) && value instanceof HasPart) { this.hasPart((HasPart)value); return; }
      if ("hasParts".equals(key) && value instanceof HasPart) { this.hasPart((HasPart)value); return; }
      if ("contentRating".equals(key) && value instanceof Rating) { this.contentRating((Rating)value); return; }
      if ("contentRatings".equals(key) && value instanceof Rating) { this.contentRating((Rating)value); return; }
      if ("contentRating".equals(key) && value instanceof String) { this.contentRating((String)value); return; }
      if ("contentRatings".equals(key) && value instanceof String) { this.contentRating((String)value); return; }
      if ("size".equals(key) && value instanceof DefinedTerm) { this.size((DefinedTerm)value); return; }
      if ("sizes".equals(key) && value instanceof DefinedTerm) { this.size((DefinedTerm)value); return; }
      if ("size".equals(key) && value instanceof QuantitativeValue) { this.size((QuantitativeValue)value); return; }
      if ("sizes".equals(key) && value instanceof QuantitativeValue) { this.size((QuantitativeValue)value); return; }
      if ("size".equals(key) && value instanceof SizeSpecification) { this.size((SizeSpecification)value); return; }
      if ("sizes".equals(key) && value instanceof SizeSpecification) { this.size((SizeSpecification)value); return; }
      if ("size".equals(key) && value instanceof String) { this.size((String)value); return; }
      if ("sizes".equals(key) && value instanceof String) { this.size((String)value); return; }
      if ("material".equals(key) && value instanceof Material) { this.material((Material)value); return; }
      if ("materials".equals(key) && value instanceof Material) { this.material((Material)value); return; }
      if ("conditionsOfAccess".equals(key) && value instanceof String) { this.conditionsOfAccess((String)value); return; }
      if ("conditionsOfAccesss".equals(key) && value instanceof String) { this.conditionsOfAccess((String)value); return; }
      if ("provider".equals(key) && value instanceof Organization) { this.provider((Organization)value); return; }
      if ("providers".equals(key) && value instanceof Organization) { this.provider((Organization)value); return; }
      if ("provider".equals(key) && value instanceof Person) { this.provider((Person)value); return; }
      if ("providers".equals(key) && value instanceof Person) { this.provider((Person)value); return; }
      if ("dateCreated".equals(key) && value instanceof DateCreated) { this.dateCreated((DateCreated)value); return; }
      if ("dateCreateds".equals(key) && value instanceof DateCreated) { this.dateCreated((DateCreated)value); return; }
      if ("pattern".equals(key) && value instanceof DefinedTerm) { this.pattern((DefinedTerm)value); return; }
      if ("patterns".equals(key) && value instanceof DefinedTerm) { this.pattern((DefinedTerm)value); return; }
      if ("pattern".equals(key) && value instanceof String) { this.pattern((String)value); return; }
      if ("patterns".equals(key) && value instanceof String) { this.pattern((String)value); return; }
      if ("correction".equals(key) && value instanceof CorrectionComment) { this.correction((CorrectionComment)value); return; }
      if ("corrections".equals(key) && value instanceof CorrectionComment) { this.correction((CorrectionComment)value); return; }
      if ("correction".equals(key) && value instanceof String) { this.correction((String)value); return; }
      if ("corrections".equals(key) && value instanceof String) { this.correction((String)value); return; }
      if ("commentCount".equals(key) && value instanceof Integer) { this.commentCount((Integer)value); return; }
      if ("commentCounts".equals(key) && value instanceof Integer) { this.commentCount((Integer)value); return; }
      if ("spatialCoverage".equals(key) && value instanceof SpatialCoverage) { this.spatialCoverage((SpatialCoverage)value); return; }
      if ("spatialCoverages".equals(key) && value instanceof SpatialCoverage) { this.spatialCoverage((SpatialCoverage)value); return; }
      if ("archivedAt".equals(key) && value instanceof String) { this.archivedAt((String)value); return; }
      if ("archivedAts".equals(key) && value instanceof String) { this.archivedAt((String)value); return; }
      if ("archivedAt".equals(key) && value instanceof WebPage) { this.archivedAt((WebPage)value); return; }
      if ("archivedAts".equals(key) && value instanceof WebPage) { this.archivedAt((WebPage)value); return; }
      if ("mentions".equals(key) && value instanceof Thing) { this.mentions((Thing)value); return; }
      if ("mentionss".equals(key) && value instanceof Thing) { this.mentions((Thing)value); return; }
      if ("educationalLevel".equals(key) && value instanceof DefinedTerm) { this.educationalLevel((DefinedTerm)value); return; }
      if ("educationalLevels".equals(key) && value instanceof DefinedTerm) { this.educationalLevel((DefinedTerm)value); return; }
      if ("educationalLevel".equals(key) && value instanceof String) { this.educationalLevel((String)value); return; }
      if ("educationalLevels".equals(key) && value instanceof String) { this.educationalLevel((String)value); return; }
      if ("temporal".equals(key) && value instanceof String) { this.temporal((String)value); return; }
      if ("temporals".equals(key) && value instanceof String) { this.temporal((String)value); return; }
      if ("temporal".equals(key) && value instanceof java.util.Date) { this.temporal((java.util.Date)value); return; }
      if ("temporals".equals(key) && value instanceof java.util.Date) { this.temporal((java.util.Date)value); return; }
      if ("sdPublisher".equals(key) && value instanceof Organization) { this.sdPublisher((Organization)value); return; }
      if ("sdPublishers".equals(key) && value instanceof Organization) { this.sdPublisher((Organization)value); return; }
      if ("sdPublisher".equals(key) && value instanceof Person) { this.sdPublisher((Person)value); return; }
      if ("sdPublishers".equals(key) && value instanceof Person) { this.sdPublisher((Person)value); return; }
      if ("learningResourceType".equals(key) && value instanceof DefinedTerm) { this.learningResourceType((DefinedTerm)value); return; }
      if ("learningResourceTypes".equals(key) && value instanceof DefinedTerm) { this.learningResourceType((DefinedTerm)value); return; }
      if ("learningResourceType".equals(key) && value instanceof String) { this.learningResourceType((String)value); return; }
      if ("learningResourceTypes".equals(key) && value instanceof String) { this.learningResourceType((String)value); return; }
      if ("contentReferenceTime".equals(key) && value instanceof java.util.Date) { this.contentReferenceTime((java.util.Date)value); return; }
      if ("contentReferenceTimes".equals(key) && value instanceof java.util.Date) { this.contentReferenceTime((java.util.Date)value); return; }
      if ("aggregateRating".equals(key) && value instanceof AggregateRating) { this.aggregateRating((AggregateRating)value); return; }
      if ("aggregateRatings".equals(key) && value instanceof AggregateRating) { this.aggregateRating((AggregateRating)value); return; }
      if ("genre".equals(key) && value instanceof Genre) { this.genre((Genre)value); return; }
      if ("genres".equals(key) && value instanceof Genre) { this.genre((Genre)value); return; }
      if ("discussionUrl".equals(key) && value instanceof String) { this.discussionUrl((String)value); return; }
      if ("discussionUrls".equals(key) && value instanceof String) { this.discussionUrl((String)value); return; }
      if ("educationalAlignment".equals(key) && value instanceof AlignmentObject) { this.educationalAlignment((AlignmentObject)value); return; }
      if ("educationalAlignments".equals(key) && value instanceof AlignmentObject) { this.educationalAlignment((AlignmentObject)value); return; }
      if ("dateModified".equals(key) && value instanceof java.util.Date) { this.dateModified((java.util.Date)value); return; }
      if ("dateModifieds".equals(key) && value instanceof java.util.Date) { this.dateModified((java.util.Date)value); return; }
      if ("comment".equals(key) && value instanceof Comment) { this.comment((Comment)value); return; }
      if ("comments".equals(key) && value instanceof Comment) { this.comment((Comment)value); return; }
      if ("sdLicense".equals(key) && value instanceof CreativeWork) { this.sdLicense((CreativeWork)value); return; }
      if ("sdLicenses".equals(key) && value instanceof CreativeWork) { this.sdLicense((CreativeWork)value); return; }
      if ("sdLicense".equals(key) && value instanceof String) { this.sdLicense((String)value); return; }
      if ("sdLicenses".equals(key) && value instanceof String) { this.sdLicense((String)value); return; }
      if ("position".equals(key) && value instanceof Integer) { this.position((Integer)value); return; }
      if ("positions".equals(key) && value instanceof Integer) { this.position((Integer)value); return; }
      if ("position".equals(key) && value instanceof String) { this.position((String)value); return; }
      if ("positions".equals(key) && value instanceof String) { this.position((String)value); return; }
      if ("associatedMedia".equals(key) && value instanceof MediaObject) { this.associatedMedia((MediaObject)value); return; }
      if ("associatedMedias".equals(key) && value instanceof MediaObject) { this.associatedMedia((MediaObject)value); return; }
      if ("headline".equals(key) && value instanceof String) { this.headline((String)value); return; }
      if ("headlines".equals(key) && value instanceof String) { this.headline((String)value); return; }
      if ("audio".equals(key) && value instanceof AudioObject) { this.audio((AudioObject)value); return; }
      if ("audios".equals(key) && value instanceof AudioObject) { this.audio((AudioObject)value); return; }
      if ("audio".equals(key) && value instanceof Clip) { this.audio((Clip)value); return; }
      if ("audios".equals(key) && value instanceof Clip) { this.audio((Clip)value); return; }
      if ("audio".equals(key) && value instanceof MusicRecording) { this.audio((MusicRecording)value); return; }
      if ("audios".equals(key) && value instanceof MusicRecording) { this.audio((MusicRecording)value); return; }
      if ("creativeWorkStatus".equals(key) && value instanceof DefinedTerm) { this.creativeWorkStatus((DefinedTerm)value); return; }
      if ("creativeWorkStatuss".equals(key) && value instanceof DefinedTerm) { this.creativeWorkStatus((DefinedTerm)value); return; }
      if ("creativeWorkStatus".equals(key) && value instanceof String) { this.creativeWorkStatus((String)value); return; }
      if ("creativeWorkStatuss".equals(key) && value instanceof String) { this.creativeWorkStatus((String)value); return; }
      if ("copyrightNotice".equals(key) && value instanceof String) { this.copyrightNotice((String)value); return; }
      if ("copyrightNotices".equals(key) && value instanceof String) { this.copyrightNotice((String)value); return; }
      if ("creator".equals(key) && value instanceof Creator) { this.creator((Creator)value); return; }
      if ("creators".equals(key) && value instanceof Creator) { this.creator((Creator)value); return; }
      if ("usageInfo".equals(key) && value instanceof UsageInfo) { this.usageInfo((UsageInfo)value); return; }
      if ("usageInfos".equals(key) && value instanceof UsageInfo) { this.usageInfo((UsageInfo)value); return; }
      if ("acquireLicensePage".equals(key) && value instanceof UsageInfo) { this.acquireLicensePage((UsageInfo)value); return; }
      if ("acquireLicensePages".equals(key) && value instanceof UsageInfo) { this.acquireLicensePage((UsageInfo)value); return; }
      if ("isAccessibleForFree".equals(key) && value instanceof Boolean) { this.isAccessibleForFree((Boolean)value); return; }
      if ("isAccessibleForFrees".equals(key) && value instanceof Boolean) { this.isAccessibleForFree((Boolean)value); return; }
      if ("editEIDR".equals(key) && value instanceof Identifier) { this.editEIDR((Identifier)value); return; }
      if ("editEIDRs".equals(key) && value instanceof Identifier) { this.editEIDR((Identifier)value); return; }
      if ("version".equals(key) && value instanceof Number) { this.version((Number)value); return; }
      if ("versions".equals(key) && value instanceof Number) { this.version((Number)value); return; }
      if ("version".equals(key) && value instanceof String) { this.version((String)value); return; }
      if ("versions".equals(key) && value instanceof String) { this.version((String)value); return; }
      if ("accessModeSufficient".equals(key) && value instanceof ItemList) { this.accessModeSufficient((ItemList)value); return; }
      if ("accessModeSufficients".equals(key) && value instanceof ItemList) { this.accessModeSufficient((ItemList)value); return; }
      if ("isBasedOn".equals(key) && value instanceof CreativeWork) { this.isBasedOn((CreativeWork)value); return; }
      if ("isBasedOns".equals(key) && value instanceof CreativeWork) { this.isBasedOn((CreativeWork)value); return; }
      if ("isBasedOn".equals(key) && value instanceof Product) { this.isBasedOn((Product)value); return; }
      if ("isBasedOns".equals(key) && value instanceof Product) { this.isBasedOn((Product)value); return; }
      if ("isBasedOn".equals(key) && value instanceof String) { this.isBasedOn((String)value); return; }
      if ("isBasedOns".equals(key) && value instanceof String) { this.isBasedOn((String)value); return; }
      if ("video".equals(key) && value instanceof Clip) { this.video((Clip)value); return; }
      if ("videos".equals(key) && value instanceof Clip) { this.video((Clip)value); return; }
      if ("video".equals(key) && value instanceof VideoObject) { this.video((VideoObject)value); return; }
      if ("videos".equals(key) && value instanceof VideoObject) { this.video((VideoObject)value); return; }
      if ("expires".equals(key) && value instanceof java.util.Date) { this.expires((java.util.Date)value); return; }
      if ("expiress".equals(key) && value instanceof java.util.Date) { this.expires((java.util.Date)value); return; }
      if ("creditText".equals(key) && value instanceof String) { this.creditText((String)value); return; }
      if ("creditTexts".equals(key) && value instanceof String) { this.creditText((String)value); return; }
      if ("contributor".equals(key) && value instanceof Organization) { this.contributor((Organization)value); return; }
      if ("contributors".equals(key) && value instanceof Organization) { this.contributor((Organization)value); return; }
      if ("contributor".equals(key) && value instanceof Person) { this.contributor((Person)value); return; }
      if ("contributors".equals(key) && value instanceof Person) { this.contributor((Person)value); return; }
      if ("audience".equals(key) && value instanceof Audience) { this.audience((Audience)value); return; }
      if ("audiences".equals(key) && value instanceof Audience) { this.audience((Audience)value); return; }
      if ("datePublished".equals(key) && value instanceof java.util.Date) { this.datePublished((java.util.Date)value); return; }
      if ("datePublisheds".equals(key) && value instanceof java.util.Date) { this.datePublished((java.util.Date)value); return; }
      if ("copyrightHolder".equals(key) && value instanceof Organization) { this.copyrightHolder((Organization)value); return; }
      if ("copyrightHolders".equals(key) && value instanceof Organization) { this.copyrightHolder((Organization)value); return; }
      if ("copyrightHolder".equals(key) && value instanceof Person) { this.copyrightHolder((Person)value); return; }
      if ("copyrightHolders".equals(key) && value instanceof Person) { this.copyrightHolder((Person)value); return; }
      if ("author".equals(key) && value instanceof Organization) { this.author((Organization)value); return; }
      if ("authors".equals(key) && value instanceof Organization) { this.author((Organization)value); return; }
      if ("author".equals(key) && value instanceof Person) { this.author((Person)value); return; }
      if ("authors".equals(key) && value instanceof Person) { this.author((Person)value); return; }
      if ("publication".equals(key) && value instanceof PublicationEvent) { this.publication((PublicationEvent)value); return; }
      if ("publications".equals(key) && value instanceof PublicationEvent) { this.publication((PublicationEvent)value); return; }
      if ("license".equals(key) && value instanceof CreativeWork) { this.license((CreativeWork)value); return; }
      if ("licenses".equals(key) && value instanceof CreativeWork) { this.license((CreativeWork)value); return; }
      if ("license".equals(key) && value instanceof String) { this.license((String)value); return; }
      if ("licenses".equals(key) && value instanceof String) { this.license((String)value); return; }
      if ("encodingFormat".equals(key) && value instanceof String) { this.encodingFormat((String)value); return; }
      if ("encodingFormats".equals(key) && value instanceof String) { this.encodingFormat((String)value); return; }
      if ("character".equals(key) && value instanceof Person) { this.character((Person)value); return; }
      if ("characters".equals(key) && value instanceof Person) { this.character((Person)value); return; }
      if ("materialExtent".equals(key) && value instanceof QuantitativeValue) { this.materialExtent((QuantitativeValue)value); return; }
      if ("materialExtents".equals(key) && value instanceof QuantitativeValue) { this.materialExtent((QuantitativeValue)value); return; }
      if ("materialExtent".equals(key) && value instanceof String) { this.materialExtent((String)value); return; }
      if ("materialExtents".equals(key) && value instanceof String) { this.materialExtent((String)value); return; }
      if ("accessibilityFeature".equals(key) && value instanceof String) { this.accessibilityFeature((String)value); return; }
      if ("accessibilityFeatures".equals(key) && value instanceof String) { this.accessibilityFeature((String)value); return; }
      if ("accessibilityHazard".equals(key) && value instanceof String) { this.accessibilityHazard((String)value); return; }
      if ("accessibilityHazards".equals(key) && value instanceof String) { this.accessibilityHazard((String)value); return; }
      if ("isPartOf".equals(key) && value instanceof IsPartOf) { this.isPartOf((IsPartOf)value); return; }
      if ("isPartOfs".equals(key) && value instanceof IsPartOf) { this.isPartOf((IsPartOf)value); return; }
      if ("accessibilityAPI".equals(key) && value instanceof String) { this.accessibilityAPI((String)value); return; }
      if ("accessibilityAPIs".equals(key) && value instanceof String) { this.accessibilityAPI((String)value); return; }
      if ("workExample".equals(key) && value instanceof WorkExample) { this.workExample((WorkExample)value); return; }
      if ("workExamples".equals(key) && value instanceof WorkExample) { this.workExample((WorkExample)value); return; }
      if ("teaches".equals(key) && value instanceof DefinedTerm) { this.teaches((DefinedTerm)value); return; }
      if ("teachess".equals(key) && value instanceof DefinedTerm) { this.teaches((DefinedTerm)value); return; }
      if ("teaches".equals(key) && value instanceof String) { this.teaches((String)value); return; }
      if ("teachess".equals(key) && value instanceof String) { this.teaches((String)value); return; }
      if ("publisher".equals(key) && value instanceof Organization) { this.publisher((Organization)value); return; }
      if ("publishers".equals(key) && value instanceof Organization) { this.publisher((Organization)value); return; }
      if ("publisher".equals(key) && value instanceof Person) { this.publisher((Person)value); return; }
      if ("publishers".equals(key) && value instanceof Person) { this.publisher((Person)value); return; }
      if ("temporalCoverage".equals(key) && value instanceof String) { this.temporalCoverage((String)value); return; }
      if ("temporalCoverages".equals(key) && value instanceof String) { this.temporalCoverage((String)value); return; }
      if ("temporalCoverage".equals(key) && value instanceof java.util.Date) { this.temporalCoverage((java.util.Date)value); return; }
      if ("temporalCoverages".equals(key) && value instanceof java.util.Date) { this.temporalCoverage((java.util.Date)value); return; }
      if ("countryOfOrigin".equals(key) && value instanceof Country) { this.countryOfOrigin((Country)value); return; }
      if ("countryOfOrigins".equals(key) && value instanceof Country) { this.countryOfOrigin((Country)value); return; }
      if ("citation".equals(key) && value instanceof CreativeWork) { this.citation((CreativeWork)value); return; }
      if ("citations".equals(key) && value instanceof CreativeWork) { this.citation((CreativeWork)value); return; }
      if ("citation".equals(key) && value instanceof String) { this.citation((String)value); return; }
      if ("citations".equals(key) && value instanceof String) { this.citation((String)value); return; }
      if ("producer".equals(key) && value instanceof Organization) { this.producer((Organization)value); return; }
      if ("producers".equals(key) && value instanceof Organization) { this.producer((Organization)value); return; }
      if ("producer".equals(key) && value instanceof Person) { this.producer((Person)value); return; }
      if ("producers".equals(key) && value instanceof Person) { this.producer((Person)value); return; }
      if ("maintainer".equals(key) && value instanceof Organization) { this.maintainer((Organization)value); return; }
      if ("maintainers".equals(key) && value instanceof Organization) { this.maintainer((Organization)value); return; }
      if ("maintainer".equals(key) && value instanceof Person) { this.maintainer((Person)value); return; }
      if ("maintainers".equals(key) && value instanceof Person) { this.maintainer((Person)value); return; }
      if ("translator".equals(key) && value instanceof Organization) { this.translator((Organization)value); return; }
      if ("translators".equals(key) && value instanceof Organization) { this.translator((Organization)value); return; }
      if ("translator".equals(key) && value instanceof Person) { this.translator((Person)value); return; }
      if ("translators".equals(key) && value instanceof Person) { this.translator((Person)value); return; }
      if ("accessibilitySummary".equals(key) && value instanceof String) { this.accessibilitySummary((String)value); return; }
      if ("accessibilitySummarys".equals(key) && value instanceof String) { this.accessibilitySummary((String)value); return; }
      if ("sponsor".equals(key) && value instanceof Sponsor) { this.sponsor((Sponsor)value); return; }
      if ("sponsors".equals(key) && value instanceof Sponsor) { this.sponsor((Sponsor)value); return; }
      if ("funder".equals(key) && value instanceof Sponsor) { this.funder((Sponsor)value); return; }
      if ("funders".equals(key) && value instanceof Sponsor) { this.funder((Sponsor)value); return; }
      if ("review".equals(key) && value instanceof Review) { this.review((Review)value); return; }
      if ("reviews".equals(key) && value instanceof Review) { this.review((Review)value); return; }
      if ("interactionStatistic".equals(key) && value instanceof InteractionCounter) { this.interactionStatistic((InteractionCounter)value); return; }
      if ("interactionStatistics".equals(key) && value instanceof InteractionCounter) { this.interactionStatistic((InteractionCounter)value); return; }
      if ("typicalAgeRange".equals(key) && value instanceof String) { this.typicalAgeRange((String)value); return; }
      if ("typicalAgeRanges".equals(key) && value instanceof String) { this.typicalAgeRange((String)value); return; }
      if ("encoding".equals(key) && value instanceof MediaObject) { this.encoding((MediaObject)value); return; }
      if ("encodings".equals(key) && value instanceof MediaObject) { this.encoding((MediaObject)value); return; }
      if ("award".equals(key) && value instanceof String) { this.award((String)value); return; }
      if ("awards".equals(key) && value instanceof String) { this.award((String)value); return; }
      if ("keywords".equals(key) && value instanceof DefinedTerm) { this.keywords((DefinedTerm)value); return; }
      if ("keywordss".equals(key) && value instanceof DefinedTerm) { this.keywords((DefinedTerm)value); return; }
      if ("keywords".equals(key) && value instanceof String) { this.keywords((String)value); return; }
      if ("keywordss".equals(key) && value instanceof String) { this.keywords((String)value); return; }
      if ("releasedEvent".equals(key) && value instanceof PublicationEvent) { this.releasedEvent((PublicationEvent)value); return; }
      if ("releasedEvents".equals(key) && value instanceof PublicationEvent) { this.releasedEvent((PublicationEvent)value); return; }
      if ("isFamilyFriendly".equals(key) && value instanceof Boolean) { this.isFamilyFriendly((Boolean)value); return; }
      if ("isFamilyFriendlys".equals(key) && value instanceof Boolean) { this.isFamilyFriendly((Boolean)value); return; }
      if ("alternativeHeadline".equals(key) && value instanceof String) { this.alternativeHeadline((String)value); return; }
      if ("alternativeHeadlines".equals(key) && value instanceof String) { this.alternativeHeadline((String)value); return; }
      if ("schemaVersion".equals(key) && value instanceof String) { this.schemaVersion((String)value); return; }
      if ("schemaVersions".equals(key) && value instanceof String) { this.schemaVersion((String)value); return; }
      if ("assesses".equals(key) && value instanceof DefinedTerm) { this.assesses((DefinedTerm)value); return; }
      if ("assessess".equals(key) && value instanceof DefinedTerm) { this.assesses((DefinedTerm)value); return; }
      if ("assesses".equals(key) && value instanceof String) { this.assesses((String)value); return; }
      if ("assessess".equals(key) && value instanceof String) { this.assesses((String)value); return; }
      if ("publisherImprint".equals(key) && value instanceof Organization) { this.publisherImprint((Organization)value); return; }
      if ("publisherImprints".equals(key) && value instanceof Organization) { this.publisherImprint((Organization)value); return; }
      if ("accessMode".equals(key) && value instanceof String) { this.accessMode((String)value); return; }
      if ("accessModes".equals(key) && value instanceof String) { this.accessMode((String)value); return; }
      if ("sdDatePublished".equals(key) && value instanceof java.util.Date) { this.sdDatePublished((java.util.Date)value); return; }
      if ("sdDatePublisheds".equals(key) && value instanceof java.util.Date) { this.sdDatePublished((java.util.Date)value); return; }
      if ("interpretedAsClaim".equals(key) && value instanceof Claim) { this.interpretedAsClaim((Claim)value); return; }
      if ("interpretedAsClaims".equals(key) && value instanceof Claim) { this.interpretedAsClaim((Claim)value); return; }
      if ("timeRequired".equals(key) && value instanceof Duration) { this.timeRequired((Duration)value); return; }
      if ("timeRequireds".equals(key) && value instanceof Duration) { this.timeRequired((Duration)value); return; }
      if ("locationCreated".equals(key) && value instanceof Place) { this.locationCreated((Place)value); return; }
      if ("locationCreateds".equals(key) && value instanceof Place) { this.locationCreated((Place)value); return; }
      if ("editor".equals(key) && value instanceof Person) { this.editor((Person)value); return; }
      if ("editors".equals(key) && value instanceof Person) { this.editor((Person)value); return; }
      if ("educationalUse".equals(key) && value instanceof DefinedTerm) { this.educationalUse((DefinedTerm)value); return; }
      if ("educationalUses".equals(key) && value instanceof DefinedTerm) { this.educationalUse((DefinedTerm)value); return; }
      if ("educationalUse".equals(key) && value instanceof String) { this.educationalUse((String)value); return; }
      if ("educationalUses".equals(key) && value instanceof String) { this.educationalUse((String)value); return; }
      if ("copyrightYear".equals(key) && value instanceof Integer) { this.copyrightYear((Integer)value); return; }
      if ("copyrightYears".equals(key) && value instanceof Integer) { this.copyrightYear((Integer)value); return; }
      if ("copyrightYear".equals(key) && value instanceof Long) { this.copyrightYear((Long)value); return; }
      if ("copyrightYears".equals(key) && value instanceof Long) { this.copyrightYear((Long)value); return; }
      if ("copyrightYear".equals(key) && value instanceof Float) { this.copyrightYear((Float)value); return; }
      if ("copyrightYears".equals(key) && value instanceof Float) { this.copyrightYear((Float)value); return; }
      if ("copyrightYear".equals(key) && value instanceof Double) { this.copyrightYear((Double)value); return; }
      if ("copyrightYears".equals(key) && value instanceof Double) { this.copyrightYear((Double)value); return; }
      if ("copyrightYear".equals(key) && value instanceof String) { this.copyrightYear((String)value); return; }
      if ("copyrightYears".equals(key) && value instanceof String) { this.copyrightYear((String)value); return; }
      if ("sourceOrganization".equals(key) && value instanceof Organization) { this.sourceOrganization((Organization)value); return; }
      if ("sourceOrganizations".equals(key) && value instanceof Organization) { this.sourceOrganization((Organization)value); return; }
      if ("accountablePerson".equals(key) && value instanceof Person) { this.accountablePerson((Person)value); return; }
      if ("accountablePersons".equals(key) && value instanceof Person) { this.accountablePerson((Person)value); return; }
      if ("interactivityType".equals(key) && value instanceof String) { this.interactivityType((String)value); return; }
      if ("interactivityTypes".equals(key) && value instanceof String) { this.interactivityType((String)value); return; }
      if ("abstract".equals(key) && value instanceof String) { this._abstract((String)value); return; }
      if ("abstracts".equals(key) && value instanceof String) { this._abstract((String)value); return; }
      if ("accessibilityControl".equals(key) && value instanceof String) { this.accessibilityControl((String)value); return; }
      if ("accessibilityControls".equals(key) && value instanceof String) { this.accessibilityControl((String)value); return; }
      if ("translationOfWork".equals(key) && value instanceof CreativeWork) { this.translationOfWork((CreativeWork)value); return; }
      if ("translationOfWorks".equals(key) && value instanceof CreativeWork) { this.translationOfWork((CreativeWork)value); return; }
      if ("workTranslation".equals(key) && value instanceof CreativeWork) { this.workTranslation((CreativeWork)value); return; }
      if ("workTranslations".equals(key) && value instanceof CreativeWork) { this.workTranslation((CreativeWork)value); return; }
      if ("offers".equals(key) && value instanceof Demand) { this.offers((Demand)value); return; }
      if ("offerss".equals(key) && value instanceof Demand) { this.offers((Demand)value); return; }
      if ("offers".equals(key) && value instanceof Offer) { this.offers((Offer)value); return; }
      if ("offerss".equals(key) && value instanceof Offer) { this.offers((Offer)value); return; }
      if ("about".equals(key) && value instanceof Thing) { this.about((Thing)value); return; }
      if ("abouts".equals(key) && value instanceof Thing) { this.about((Thing)value); return; }
      if ("mainEntity".equals(key) && value instanceof About) { this.mainEntity((About)value); return; }
      if ("mainEntitys".equals(key) && value instanceof About) { this.mainEntity((About)value); return; }
      if ("mainEntity".equals(key) && value instanceof Thing) { this.mainEntity((Thing)value); return; }
      if ("mainEntitys".equals(key) && value instanceof Thing) { this.mainEntity((Thing)value); return; }
      if ("recordedAt".equals(key) && value instanceof Event) { this.recordedAt((Event)value); return; }
      if ("recordedAts".equals(key) && value instanceof Event) { this.recordedAt((Event)value); return; }
      if ("exampleOfWork".equals(key) && value instanceof CreativeWork) { this.exampleOfWork((CreativeWork)value); return; }
      if ("exampleOfWorks".equals(key) && value instanceof CreativeWork) { this.exampleOfWork((CreativeWork)value); return; }
      if ("contentLocation".equals(key) && value instanceof ContentLocation) { this.contentLocation((ContentLocation)value); return; }
      if ("contentLocations".equals(key) && value instanceof ContentLocation) { this.contentLocation((ContentLocation)value); return; }
      super.fromMap(key, value);
    }
  }
  
}
