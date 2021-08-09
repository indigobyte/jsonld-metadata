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
 * The most generic kind of creative work, including books, movies, photographs, software programs, etc.
 */
public class CreativeWork extends Thing implements org.schema.IsPartOf, WorkFeatured, PublishingPrinciples, UsageInfo, WorkExample, Step {
  /**
   * The textual content of this CreativeWork.
   * @return text property set by first invocation of text method or {@code null}.
   */
  @JsonIgnore public String getText() {
    return (String) getValue("text");
  }
  /**
   * The textual content of this CreativeWork.
   * @return all text properties as {@link java.util.Collection} or an empty collection 
   * if text was not set.
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
   *                                 The &quot;spatial&quot; property can be used in cases when more specific properties
   * (e.g. [[locationCreated]], [[spatialCoverage]], [[contentLocation]]) are not known to be appropriate.
   *                                 @return spatial property set by first invocation of spatial method or {@code null}.
   */
  @JsonIgnore public Place getSpatial() {
    return (Place) getValue("spatial");
  }
  /**
   *                                     The &quot;spatial&quot; property can be used in cases when more specific properties
   * (e.g. [[locationCreated]], [[spatialCoverage]], [[contentLocation]]) are not known to be appropriate.
   *                                     @return all spatial properties as {@link java.util.Collection} or an empty collection 
   *                                     if spatial was not set.
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
   *                                 The publishingPrinciples property indicates (typically via [[URL]]) a document describing the editorial principles of an [[Organization]] (or individual e.g. a [[Person]] writing a blog) that relate to their activities as a publisher, e.g. ethics or diversity policies. When applied to a [[CreativeWork]] (e.g. [[NewsArticle]]) the principles are those of the party primarily responsible for the creation of the [[CreativeWork]].
   * 
   * While such policies are most typically expressed in natural language, sometimes related information (e.g. indicating a [[funder]]) can be expressed using schema.org terminology.
   * 
   *                                 @return publishingPrinciples property set by first invocation of publishingPrinciples method or {@code null}.
   */
  @JsonIgnore public PublishingPrinciples getPublishingPrinciples() {
    return (PublishingPrinciples) getValue("publishingPrinciples");
  }
  /**
   *                                     The publishingPrinciples property indicates (typically via [[URL]]) a document describing the editorial principles of an [[Organization]] (or individual e.g. a [[Person]] writing a blog) that relate to their activities as a publisher, e.g. ethics or diversity policies. When applied to a [[CreativeWork]] (e.g. [[NewsArticle]]) the principles are those of the party primarily responsible for the creation of the [[CreativeWork]].
   * 
   * While such policies are most typically expressed in natural language, sometimes related information (e.g. indicating a [[funder]]) can be expressed using schema.org terminology.
   * 
   *                                     @return all publishingPrinciples properties as {@link java.util.Collection} or an empty collection 
   *                                     if publishingPrinciples was not set.
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
   * @return inLanguage property set by first invocation of inLanguage method or {@code null}.
   */
  @JsonIgnore public Language getInLanguageLanguage() {
    return (Language) getValue("inLanguage");
  }
  /**
   * The language of the content or performance or used in an action. Please use one of the language codes from the [IETF BCP 47 standard](http://tools.ietf.org/html/bcp47). See also [[availableLanguage]].
   * @return all inLanguage properties as {@link java.util.Collection} or an empty collection 
   * if inLanguage was not set.
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
   * @return inLanguage property set by first invocation of inLanguage method or {@code null}.
   */
  @JsonIgnore public String getInLanguageString() {
    return (String) getValue("inLanguage");
  }
  /**
   * The language of the content or performance or used in an action. Please use one of the language codes from the [IETF BCP 47 standard](http://tools.ietf.org/html/bcp47). See also [[availableLanguage]].
   * @return all inLanguage properties as {@link java.util.Collection} or an empty collection 
   * if inLanguage was not set.
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
   * @return thumbnailUrl property set by first invocation of thumbnailUrl method or {@code null}.
   */
  @JsonIgnore public String getThumbnailUrl() {
    return (String) getValue("thumbnailUrl");
  }
  /**
   * A thumbnail image relevant to the Thing.
   * @return all thumbnailUrl properties as {@link java.util.Collection} or an empty collection 
   * if thumbnailUrl was not set.
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
   * @return hasPart property set by first invocation of hasPart method or {@code null}.
   */
  @JsonIgnore public HasPart getHasPart() {
    return (HasPart) getValue("hasPart");
  }
  /**
   * Indicates an item or CreativeWork that is part of this item, or CreativeWork (in some sense).
   * @return all hasPart properties as {@link java.util.Collection} or an empty collection 
   * if hasPart was not set.
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
   * @return contentRating property set by first invocation of contentRating method or {@code null}.
   */
  @JsonIgnore public Rating getContentRatingRating() {
    return (Rating) getValue("contentRating");
  }
  /**
   * Official rating of a piece of content&amp;#x2014;for example,'MPAA PG-13'.
   * @return all contentRating properties as {@link java.util.Collection} or an empty collection 
   * if contentRating was not set.
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
   * @return contentRating property set by first invocation of contentRating method or {@code null}.
   */
  @JsonIgnore public String getContentRatingString() {
    return (String) getValue("contentRating");
  }
  /**
   * Official rating of a piece of content&amp;#x2014;for example,'MPAA PG-13'.
   * @return all contentRating properties as {@link java.util.Collection} or an empty collection 
   * if contentRating was not set.
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
   * Conditions that affect the availability of, or method(s) of access to, an item. Typically used for real world items such as an [[ArchiveComponent]] held by an [[ArchiveOrganization]]. This property is not suitable for use as a general Web access control mechanism. It is expressed only in natural language.\n\nFor example &quot;Available by appointment from the Reading Room&quot; or &quot;Accessible only from logged-in accounts &quot;. 
   * @return conditionsOfAccess property set by first invocation of conditionsOfAccess method or {@code null}.
   */
  @JsonIgnore public String getConditionsOfAccess() {
    return (String) getValue("conditionsOfAccess");
  }
  /**
   * Conditions that affect the availability of, or method(s) of access to, an item. Typically used for real world items such as an [[ArchiveComponent]] held by an [[ArchiveOrganization]]. This property is not suitable for use as a general Web access control mechanism. It is expressed only in natural language.\n\nFor example &quot;Available by appointment from the Reading Room&quot; or &quot;Accessible only from logged-in accounts &quot;. 
   * @return all conditionsOfAccess properties as {@link java.util.Collection} or an empty collection 
   * if conditionsOfAccess was not set.
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
   * @return provider property set by first invocation of provider method or {@code null}.
   */
  @JsonIgnore public Organization getProviderOrganization() {
    return (Organization) getValue("provider");
  }
  /**
   * The service provider, service operator, or service performer; the goods producer. Another party (a seller) may offer those services or goods on behalf of the provider. A provider may also serve as the seller.
   * @return all provider properties as {@link java.util.Collection} or an empty collection 
   * if provider was not set.
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
   * @return provider property set by first invocation of provider method or {@code null}.
   */
  @JsonIgnore public Person getProviderPerson() {
    return (Person) getValue("provider");
  }
  /**
   * The service provider, service operator, or service performer; the goods producer. Another party (a seller) may offer those services or goods on behalf of the provider. A provider may also serve as the seller.
   * @return all provider properties as {@link java.util.Collection} or an empty collection 
   * if provider was not set.
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
   * @return dateCreated property set by first invocation of dateCreated method or {@code null}.
   */
  @JsonIgnore public DateCreated getDateCreated() {
    return (DateCreated) getValue("dateCreated");
  }
  /**
   * The date on which the CreativeWork was created or the item was added to a DataFeed.
   * @return all dateCreated properties as {@link java.util.Collection} or an empty collection 
   * if dateCreated was not set.
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
   * Indicates a correction to a [[CreativeWork]], either via a [[CorrectionComment]], textually or in another document.
   * @return correction property set by first invocation of correction method or {@code null}.
   */
  @JsonIgnore public CorrectionComment getCorrectionCorrectionComment() {
    return (CorrectionComment) getValue("correction");
  }
  /**
   * Indicates a correction to a [[CreativeWork]], either via a [[CorrectionComment]], textually or in another document.
   * @return all correction properties as {@link java.util.Collection} or an empty collection 
   * if correction was not set.
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
   * @return correction property set by first invocation of correction method or {@code null}.
   */
  @JsonIgnore public String getCorrectionString() {
    return (String) getValue("correction");
  }
  /**
   * Indicates a correction to a [[CreativeWork]], either via a [[CorrectionComment]], textually or in another document.
   * @return all correction properties as {@link java.util.Collection} or an empty collection 
   * if correction was not set.
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
   * @return commentCount property set by first invocation of commentCount method or {@code null}.
   */
  @JsonIgnore public Integer getCommentCount() {
    return (Integer) getValue("commentCount");
  }
  /**
   * The number of comments this CreativeWork (e.g. Article, Question or Answer) has received. This is most applicable to works published in Web sites with commenting system; additional comments may exist elsewhere.
   * @return all commentCount properties as {@link java.util.Collection} or an empty collection 
   * if commentCount was not set.
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
   *                           The spatialCoverage of a CreativeWork indicates the place(s) which are the focus of the content. It is a subproperty of
   * contentLocation intended primarily for more technical and detailed materials. For example with a Dataset, it indicates
   * areas that the dataset describes: a dataset of New York weather would have spatialCoverage which was the place: the state of New York.
   *                           @return spatialCoverage property set by first invocation of spatialCoverage method or {@code null}.
   */
  @JsonIgnore public SpatialCoverage getSpatialCoverage() {
    return (SpatialCoverage) getValue("spatialCoverage");
  }
  /**
   *                               The spatialCoverage of a CreativeWork indicates the place(s) which are the focus of the content. It is a subproperty of
   * contentLocation intended primarily for more technical and detailed materials. For example with a Dataset, it indicates
   * areas that the dataset describes: a dataset of New York weather would have spatialCoverage which was the place: the state of New York.
   *                               @return all spatialCoverage properties as {@link java.util.Collection} or an empty collection 
   *                               if spatialCoverage was not set.
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
   * @return archivedAt property set by first invocation of archivedAt method or {@code null}.
   */
  @JsonIgnore public String getArchivedAtString() {
    return (String) getValue("archivedAt");
  }
  /**
   * Indicates a page or other link involved in archival of a [[CreativeWork]]. In the case of [[MediaReview]], the items in a [[MediaReviewItem]] may often become inaccessible, but be archived by archival, journalistic, activist, or law enforcement organizations. In such cases, the referenced page may not directly publish the content.
   * @return all archivedAt properties as {@link java.util.Collection} or an empty collection 
   * if archivedAt was not set.
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
   * @return archivedAt property set by first invocation of archivedAt method or {@code null}.
   */
  @JsonIgnore public WebPage getArchivedAtWebPage() {
    return (WebPage) getValue("archivedAt");
  }
  /**
   * Indicates a page or other link involved in archival of a [[CreativeWork]]. In the case of [[MediaReview]], the items in a [[MediaReviewItem]] may often become inaccessible, but be archived by archival, journalistic, activist, or law enforcement organizations. In such cases, the referenced page may not directly publish the content.
   * @return all archivedAt properties as {@link java.util.Collection} or an empty collection 
   * if archivedAt was not set.
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
   * @return mentions property set by first invocation of mentions method or {@code null}.
   */
  @JsonIgnore public Thing getMentions() {
    return (Thing) getValue("mentions");
  }
  /**
   * Indicates that the CreativeWork contains a reference to, but is not necessarily about a concept.
   * @return all mentions properties as {@link java.util.Collection} or an empty collection 
   * if mentions was not set.
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
   * @return educationalLevel property set by first invocation of educationalLevel method or {@code null}.
   */
  @JsonIgnore public DefinedTerm getEducationalLevelDefinedTerm() {
    return (DefinedTerm) getValue("educationalLevel");
  }
  /**
   * The level in terms of progression through an educational or training context. Examples of educational levels include 'beginner', 'intermediate' or 'advanced', and formal sets of level indicators.
   * @return all educationalLevel properties as {@link java.util.Collection} or an empty collection 
   * if educationalLevel was not set.
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
   * @return educationalLevel property set by first invocation of educationalLevel method or {@code null}.
   */
  @JsonIgnore public String getEducationalLevelString() {
    return (String) getValue("educationalLevel");
  }
  /**
   * The level in terms of progression through an educational or training context. Examples of educational levels include 'beginner', 'intermediate' or 'advanced', and formal sets of level indicators.
   * @return all educationalLevel properties as {@link java.util.Collection} or an empty collection 
   * if educationalLevel was not set.
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
   *                                 The &quot;temporal&quot; property can be used in cases where more specific properties
   * (e.g. [[temporalCoverage]], [[dateCreated]], [[dateModified]], [[datePublished]]) are not known to be appropriate.
   *                                 @return temporal property set by first invocation of temporal method or {@code null}.
   */
  @JsonIgnore public String getTemporalString() {
    return (String) getValue("temporal");
  }
  /**
   *                                     The &quot;temporal&quot; property can be used in cases where more specific properties
   * (e.g. [[temporalCoverage]], [[dateCreated]], [[dateModified]], [[datePublished]]) are not known to be appropriate.
   *                                     @return all temporal properties as {@link java.util.Collection} or an empty collection 
   *                                     if temporal was not set.
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
   *                                 The &quot;temporal&quot; property can be used in cases where more specific properties
   * (e.g. [[temporalCoverage]], [[dateCreated]], [[dateModified]], [[datePublished]]) are not known to be appropriate.
   *                                 @return temporal property set by first invocation of temporal method or {@code null}.
   */
  @JsonIgnore public java.util.Date getTemporalDate() {
    return (java.util.Date) getValue("temporal");
  }
  /**
   *                                     The &quot;temporal&quot; property can be used in cases where more specific properties
   * (e.g. [[temporalCoverage]], [[dateCreated]], [[dateModified]], [[datePublished]]) are not known to be appropriate.
   *                                     @return all temporal properties as {@link java.util.Collection} or an empty collection 
   *                                     if temporal was not set.
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
   *                                 Indicates the party responsible for generating and publishing the current structured data markup, typically in cases where the structured data is derived automatically from existing published content but published on a different site. For example, student projects and open data initiatives often re-publish existing content with more explicitly structured metadata. The
   * [[sdPublisher]] property helps make such practices more explicit.
   *                                 @return sdPublisher property set by first invocation of sdPublisher method or {@code null}.
   */
  @JsonIgnore public Organization getSdPublisherOrganization() {
    return (Organization) getValue("sdPublisher");
  }
  /**
   *                                     Indicates the party responsible for generating and publishing the current structured data markup, typically in cases where the structured data is derived automatically from existing published content but published on a different site. For example, student projects and open data initiatives often re-publish existing content with more explicitly structured metadata. The
   * [[sdPublisher]] property helps make such practices more explicit.
   *                                     @return all sdPublisher properties as {@link java.util.Collection} or an empty collection 
   *                                     if sdPublisher was not set.
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
   *                                 Indicates the party responsible for generating and publishing the current structured data markup, typically in cases where the structured data is derived automatically from existing published content but published on a different site. For example, student projects and open data initiatives often re-publish existing content with more explicitly structured metadata. The
   * [[sdPublisher]] property helps make such practices more explicit.
   *                                 @return sdPublisher property set by first invocation of sdPublisher method or {@code null}.
   */
  @JsonIgnore public Person getSdPublisherPerson() {
    return (Person) getValue("sdPublisher");
  }
  /**
   *                                     Indicates the party responsible for generating and publishing the current structured data markup, typically in cases where the structured data is derived automatically from existing published content but published on a different site. For example, student projects and open data initiatives often re-publish existing content with more explicitly structured metadata. The
   * [[sdPublisher]] property helps make such practices more explicit.
   *                                     @return all sdPublisher properties as {@link java.util.Collection} or an empty collection 
   *                                     if sdPublisher was not set.
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
   * @return learningResourceType property set by first invocation of learningResourceType method or {@code null}.
   */
  @JsonIgnore public DefinedTerm getLearningResourceTypeDefinedTerm() {
    return (DefinedTerm) getValue("learningResourceType");
  }
  /**
   * The predominant type or kind characterizing the learning resource. For example, 'presentation', 'handout'.
   * @return all learningResourceType properties as {@link java.util.Collection} or an empty collection 
   * if learningResourceType was not set.
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
   * @return learningResourceType property set by first invocation of learningResourceType method or {@code null}.
   */
  @JsonIgnore public String getLearningResourceTypeString() {
    return (String) getValue("learningResourceType");
  }
  /**
   * The predominant type or kind characterizing the learning resource. For example, 'presentation', 'handout'.
   * @return all learningResourceType properties as {@link java.util.Collection} or an empty collection 
   * if learningResourceType was not set.
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
   * @return contentReferenceTime property set by first invocation of contentReferenceTime method or {@code null}.
   */
  @JsonIgnore public java.util.Date getContentReferenceTime() {
    return (java.util.Date) getValue("contentReferenceTime");
  }
  /**
   * The specific time described by a creative work, for works (e.g. articles, video objects etc.) that emphasise a particular moment within an Event.
   * @return all contentReferenceTime properties as {@link java.util.Collection} or an empty collection 
   * if contentReferenceTime was not set.
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
   * Genre of the creative work, broadcast channel or group.
   * @return genre property set by first invocation of genre method or {@code null}.
   */
  @JsonIgnore public Genre getGenre() {
    return (Genre) getValue("genre");
  }
  /**
   * Genre of the creative work, broadcast channel or group.
   * @return all genre properties as {@link java.util.Collection} or an empty collection 
   * if genre was not set.
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
   * @return discussionUrl property set by first invocation of discussionUrl method or {@code null}.
   */
  @JsonIgnore public String getDiscussionUrl() {
    return (String) getValue("discussionUrl");
  }
  /**
   * A link to the page containing the comments of the CreativeWork.
   * @return all discussionUrl properties as {@link java.util.Collection} or an empty collection 
   * if discussionUrl was not set.
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
   *                                 An alignment to an established educational framework.
   * 
   * This property should not be used where the nature of the alignment can be described using a simple property, for example to express that a resource [[teaches]] or [[assesses]] a competency.
   *                                 @return educationalAlignment property set by first invocation of educationalAlignment method or {@code null}.
   */
  @JsonIgnore public AlignmentObject getEducationalAlignment() {
    return (AlignmentObject) getValue("educationalAlignment");
  }
  /**
   *                                     An alignment to an established educational framework.
   * 
   * This property should not be used where the nature of the alignment can be described using a simple property, for example to express that a resource [[teaches]] or [[assesses]] a competency.
   *                                     @return all educationalAlignment properties as {@link java.util.Collection} or an empty collection 
   *                                     if educationalAlignment was not set.
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
   * @return dateModified property set by first invocation of dateModified method or {@code null}.
   */
  @JsonIgnore public java.util.Date getDateModified() {
    return (java.util.Date) getValue("dateModified");
  }
  /**
   * The date on which the CreativeWork was most recently modified or when the item's entry was modified within a DataFeed.
   * @return all dateModified properties as {@link java.util.Collection} or an empty collection 
   * if dateModified was not set.
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
   * @return comment property set by first invocation of comment method or {@code null}.
   */
  @JsonIgnore public Comment getComment() {
    return (Comment) getValue("comment");
  }
  /**
   * Comments, typically from users.
   * @return all comment properties as {@link java.util.Collection} or an empty collection 
   * if comment was not set.
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
   * @return sdLicense property set by first invocation of sdLicense method or {@code null}.
   */
  @JsonIgnore public CreativeWork getSdLicenseCreativeWork() {
    return (CreativeWork) getValue("sdLicense");
  }
  /**
   * A license document that applies to this structured data, typically indicated by URL.
   * @return all sdLicense properties as {@link java.util.Collection} or an empty collection 
   * if sdLicense was not set.
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
   * @return sdLicense property set by first invocation of sdLicense method or {@code null}.
   */
  @JsonIgnore public String getSdLicenseString() {
    return (String) getValue("sdLicense");
  }
  /**
   * A license document that applies to this structured data, typically indicated by URL.
   * @return all sdLicense properties as {@link java.util.Collection} or an empty collection 
   * if sdLicense was not set.
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
   * @return position property set by first invocation of position method or {@code null}.
   */
  @JsonIgnore public Integer getPositionInteger() {
    return (Integer) getValue("position");
  }
  /**
   * The position of an item in a series or sequence of items.
   * @return all position properties as {@link java.util.Collection} or an empty collection 
   * if position was not set.
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
   * @return position property set by first invocation of position method or {@code null}.
   */
  @JsonIgnore public String getPositionString() {
    return (String) getValue("position");
  }
  /**
   * The position of an item in a series or sequence of items.
   * @return all position properties as {@link java.util.Collection} or an empty collection 
   * if position was not set.
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
   * @return associatedMedia property set by first invocation of associatedMedia method or {@code null}.
   */
  @JsonIgnore public MediaObject getAssociatedMedia() {
    return (MediaObject) getValue("associatedMedia");
  }
  /**
   * A media object that encodes this CreativeWork. This property is a synonym for encoding.
   * @return all associatedMedia properties as {@link java.util.Collection} or an empty collection 
   * if associatedMedia was not set.
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
   * @return headline property set by first invocation of headline method or {@code null}.
   */
  @JsonIgnore public String getHeadline() {
    return (String) getValue("headline");
  }
  /**
   * Headline of the article.
   * @return all headline properties as {@link java.util.Collection} or an empty collection 
   * if headline was not set.
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
   * @return audio property set by first invocation of audio method or {@code null}.
   */
  @JsonIgnore public AudioObject getAudioAudioObject() {
    return (AudioObject) getValue("audio");
  }
  /**
   * An embedded audio object.
   * @return all audio properties as {@link java.util.Collection} or an empty collection 
   * if audio was not set.
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
   * @return audio property set by first invocation of audio method or {@code null}.
   */
  @JsonIgnore public Clip getAudioClip() {
    return (Clip) getValue("audio");
  }
  /**
   * An embedded audio object.
   * @return all audio properties as {@link java.util.Collection} or an empty collection 
   * if audio was not set.
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
   * @return audio property set by first invocation of audio method or {@code null}.
   */
  @JsonIgnore public MusicRecording getAudioMusicRecording() {
    return (MusicRecording) getValue("audio");
  }
  /**
   * An embedded audio object.
   * @return all audio properties as {@link java.util.Collection} or an empty collection 
   * if audio was not set.
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
   * @return creativeWorkStatus property set by first invocation of creativeWorkStatus method or {@code null}.
   */
  @JsonIgnore public DefinedTerm getCreativeWorkStatusDefinedTerm() {
    return (DefinedTerm) getValue("creativeWorkStatus");
  }
  /**
   * The status of a creative work in terms of its stage in a lifecycle. Example terms include Incomplete, Draft, Published, Obsolete. Some organizations define a set of terms for the stages of their publication lifecycle.
   * @return all creativeWorkStatus properties as {@link java.util.Collection} or an empty collection 
   * if creativeWorkStatus was not set.
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
   * @return creativeWorkStatus property set by first invocation of creativeWorkStatus method or {@code null}.
   */
  @JsonIgnore public String getCreativeWorkStatusString() {
    return (String) getValue("creativeWorkStatus");
  }
  /**
   * The status of a creative work in terms of its stage in a lifecycle. Example terms include Incomplete, Draft, Published, Obsolete. Some organizations define a set of terms for the stages of their publication lifecycle.
   * @return all creativeWorkStatus properties as {@link java.util.Collection} or an empty collection 
   * if creativeWorkStatus was not set.
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
   * @return copyrightNotice property set by first invocation of copyrightNotice method or {@code null}.
   */
  @JsonIgnore public String getCopyrightNotice() {
    return (String) getValue("copyrightNotice");
  }
  /**
   * Text of a notice appropriate for describing the copyright aspects of this Creative Work, ideally indicating the owner of the copyright for the Work.
   * @return all copyrightNotice properties as {@link java.util.Collection} or an empty collection 
   * if copyrightNotice was not set.
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
   * @return creator property set by first invocation of creator method or {@code null}.
   */
  @JsonIgnore public Creator getCreator() {
    return (Creator) getValue("creator");
  }
  /**
   * The creator/author of this CreativeWork. This is the same as the Author property for CreativeWork.
   * @return all creator properties as {@link java.util.Collection} or an empty collection 
   * if creator was not set.
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
   *                                 The schema.org [[usageInfo]] property indicates further information about a [[CreativeWork]]. This property is applicable both to works that are freely available and to those that require payment or other transactions. It can reference additional information e.g. community expectations on preferred linking and citation conventions, as well as purchasing details. For something that can be commercially licensed, usageInfo can provide detailed, resource-specific information about licensing options.
   * 
   * This property can be used alongside the license property which indicates license(s) applicable to some piece of content. The usageInfo property can provide information about other licensing options, e.g. acquiring commercial usage rights for an image that is also available under non-commercial creative commons licenses.
   *                                 @return usageInfo property set by first invocation of usageInfo method or {@code null}.
   */
  @JsonIgnore public UsageInfo getUsageInfo() {
    return (UsageInfo) getValue("usageInfo");
  }
  /**
   *                                     The schema.org [[usageInfo]] property indicates further information about a [[CreativeWork]]. This property is applicable both to works that are freely available and to those that require payment or other transactions. It can reference additional information e.g. community expectations on preferred linking and citation conventions, as well as purchasing details. For something that can be commercially licensed, usageInfo can provide detailed, resource-specific information about licensing options.
   * 
   * This property can be used alongside the license property which indicates license(s) applicable to some piece of content. The usageInfo property can provide information about other licensing options, e.g. acquiring commercial usage rights for an image that is also available under non-commercial creative commons licenses.
   *                                     @return all usageInfo properties as {@link java.util.Collection} or an empty collection 
   *                                     if usageInfo was not set.
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
   * @return acquireLicensePage property set by first invocation of acquireLicensePage method or {@code null}.
   */
  @JsonIgnore public UsageInfo getAcquireLicensePage() {
    return (UsageInfo) getValue("acquireLicensePage");
  }
  /**
   * Indicates a page documenting how licenses can be purchased or otherwise acquired, for the current item.
   * @return all acquireLicensePage properties as {@link java.util.Collection} or an empty collection 
   * if acquireLicensePage was not set.
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
   * @return isAccessibleForFree property set by first invocation of isAccessibleForFree method or {@code null}.
   */
  @JsonIgnore public Boolean getIsAccessibleForFree() {
    return (Boolean) getValue("isAccessibleForFree");
  }
  /**
   * A flag to signal that the item, event, or place is accessible for free.
   * @return all isAccessibleForFree properties as {@link java.util.Collection} or an empty collection 
   * if isAccessibleForFree was not set.
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
   *                                 An [EIDR](https://eidr.org/) (Entertainment Identifier Registry) [[identifier]] representing a specific edit / edition for a work of film or television.
   * 
   * For example, the motion picture known as &quot;Ghostbusters&quot; whose [[titleEIDR]] is &quot;10.5240/7EC7-228A-510A-053E-CBB8-J&quot;, has several edits e.g. &quot;10.5240/1F2A-E1C5-680A-14C6-E76B-I&quot; and &quot;10.5240/8A35-3BEE-6497-5D12-9E4F-3&quot;.
   * 
   * Since schema.org types like [[Movie]] and [[TVEpisode]] can be used for both works and their multiple expressions, it is possible to use [[titleEIDR]] alone (for a general description), or alongside [[editEIDR]] for a more edit-specific description.
   * 
   *                                 @return editEIDR property set by first invocation of editEIDR method or {@code null}.
   */
  @JsonIgnore public Identifier getEditEIDR() {
    return (Identifier) getValue("editEIDR");
  }
  /**
   *                                     An [EIDR](https://eidr.org/) (Entertainment Identifier Registry) [[identifier]] representing a specific edit / edition for a work of film or television.
   * 
   * For example, the motion picture known as &quot;Ghostbusters&quot; whose [[titleEIDR]] is &quot;10.5240/7EC7-228A-510A-053E-CBB8-J&quot;, has several edits e.g. &quot;10.5240/1F2A-E1C5-680A-14C6-E76B-I&quot; and &quot;10.5240/8A35-3BEE-6497-5D12-9E4F-3&quot;.
   * 
   * Since schema.org types like [[Movie]] and [[TVEpisode]] can be used for both works and their multiple expressions, it is possible to use [[titleEIDR]] alone (for a general description), or alongside [[editEIDR]] for a more edit-specific description.
   * 
   *                                     @return all editEIDR properties as {@link java.util.Collection} or an empty collection 
   *                                     if editEIDR was not set.
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
   * @return version property set by first invocation of version method or {@code null}.
   */
  @JsonIgnore public Number getVersionNumber() {
    return (Number) getValue("version");
  }
  /**
   * The version of the CreativeWork embodied by a specified resource.
   * @return all version properties as {@link java.util.Collection} or an empty collection 
   * if version was not set.
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
   * @return version property set by first invocation of version method or {@code null}.
   */
  @JsonIgnore public String getVersionString() {
    return (String) getValue("version");
  }
  /**
   * The version of the CreativeWork embodied by a specified resource.
   * @return all version properties as {@link java.util.Collection} or an empty collection 
   * if version was not set.
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
   * @return accessModeSufficient property set by first invocation of accessModeSufficient method or {@code null}.
   */
  @JsonIgnore public ItemList getAccessModeSufficient() {
    return (ItemList) getValue("accessModeSufficient");
  }
  /**
   * A list of single or combined accessModes that are sufficient to understand all the intellectual content of a resource. Expected values include:  auditory, tactile, textual, visual.
   * 
   * @return all accessModeSufficient properties as {@link java.util.Collection} or an empty collection 
   * if accessModeSufficient was not set.
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
   * @return isBasedOn property set by first invocation of isBasedOn method or {@code null}.
   */
  @JsonIgnore public CreativeWork getIsBasedOnCreativeWork() {
    return (CreativeWork) getValue("isBasedOn");
  }
  /**
   * A resource from which this work is derived or from which it is a modification or adaption.
   * @return all isBasedOn properties as {@link java.util.Collection} or an empty collection 
   * if isBasedOn was not set.
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
   * @return isBasedOn property set by first invocation of isBasedOn method or {@code null}.
   */
  @JsonIgnore public Product getIsBasedOnProduct() {
    return (Product) getValue("isBasedOn");
  }
  /**
   * A resource from which this work is derived or from which it is a modification or adaption.
   * @return all isBasedOn properties as {@link java.util.Collection} or an empty collection 
   * if isBasedOn was not set.
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
   * @return isBasedOn property set by first invocation of isBasedOn method or {@code null}.
   */
  @JsonIgnore public String getIsBasedOnString() {
    return (String) getValue("isBasedOn");
  }
  /**
   * A resource from which this work is derived or from which it is a modification or adaption.
   * @return all isBasedOn properties as {@link java.util.Collection} or an empty collection 
   * if isBasedOn was not set.
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
   * @return video property set by first invocation of video method or {@code null}.
   */
  @JsonIgnore public Clip getVideoClip() {
    return (Clip) getValue("video");
  }
  /**
   * An embedded video object.
   * @return all video properties as {@link java.util.Collection} or an empty collection 
   * if video was not set.
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
   * @return video property set by first invocation of video method or {@code null}.
   */
  @JsonIgnore public VideoObject getVideoVideoObject() {
    return (VideoObject) getValue("video");
  }
  /**
   * An embedded video object.
   * @return all video properties as {@link java.util.Collection} or an empty collection 
   * if video was not set.
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
   * @return expires property set by first invocation of expires method or {@code null}.
   */
  @JsonIgnore public java.util.Date getExpires() {
    return (java.util.Date) getValue("expires");
  }
  /**
   * Date the content expires and is no longer useful or available. For example a [[VideoObject]] or [[NewsArticle]] whose availability or relevance is time-limited, or a [[ClaimReview]] fact check whose publisher wants to indicate that it may no longer be relevant (or helpful to highlight) after some date.
   * @return all expires properties as {@link java.util.Collection} or an empty collection 
   * if expires was not set.
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
   * @return creditText property set by first invocation of creditText method or {@code null}.
   */
  @JsonIgnore public String getCreditText() {
    return (String) getValue("creditText");
  }
  /**
   * Text that can be used to credit person(s) and/or organization(s) associated with a published Creative Work.
   * @return all creditText properties as {@link java.util.Collection} or an empty collection 
   * if creditText was not set.
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
   * @return contributor property set by first invocation of contributor method or {@code null}.
   */
  @JsonIgnore public Organization getContributorOrganization() {
    return (Organization) getValue("contributor");
  }
  /**
   * A secondary contributor to the CreativeWork or Event.
   * @return all contributor properties as {@link java.util.Collection} or an empty collection 
   * if contributor was not set.
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
   * @return contributor property set by first invocation of contributor method or {@code null}.
   */
  @JsonIgnore public Person getContributorPerson() {
    return (Person) getValue("contributor");
  }
  /**
   * A secondary contributor to the CreativeWork or Event.
   * @return all contributor properties as {@link java.util.Collection} or an empty collection 
   * if contributor was not set.
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
   * Date of first broadcast/publication.
   * @return datePublished property set by first invocation of datePublished method or {@code null}.
   */
  @JsonIgnore public java.util.Date getDatePublished() {
    return (java.util.Date) getValue("datePublished");
  }
  /**
   * Date of first broadcast/publication.
   * @return all datePublished properties as {@link java.util.Collection} or an empty collection 
   * if datePublished was not set.
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
   * @return copyrightHolder property set by first invocation of copyrightHolder method or {@code null}.
   */
  @JsonIgnore public Organization getCopyrightHolderOrganization() {
    return (Organization) getValue("copyrightHolder");
  }
  /**
   * The party holding the legal copyright to the CreativeWork.
   * @return all copyrightHolder properties as {@link java.util.Collection} or an empty collection 
   * if copyrightHolder was not set.
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
   * @return copyrightHolder property set by first invocation of copyrightHolder method or {@code null}.
   */
  @JsonIgnore public Person getCopyrightHolderPerson() {
    return (Person) getValue("copyrightHolder");
  }
  /**
   * The party holding the legal copyright to the CreativeWork.
   * @return all copyrightHolder properties as {@link java.util.Collection} or an empty collection 
   * if copyrightHolder was not set.
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
   * @return author property set by first invocation of author method or {@code null}.
   */
  @JsonIgnore public Organization getAuthorOrganization() {
    return (Organization) getValue("author");
  }
  /**
   * The author of this content or rating. Please note that author is special in that HTML 5 provides a special mechanism for indicating authorship via the rel tag. That is equivalent to this and may be used interchangeably.
   * @return all author properties as {@link java.util.Collection} or an empty collection 
   * if author was not set.
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
   * @return author property set by first invocation of author method or {@code null}.
   */
  @JsonIgnore public Person getAuthorPerson() {
    return (Person) getValue("author");
  }
  /**
   * The author of this content or rating. Please note that author is special in that HTML 5 provides a special mechanism for indicating authorship via the rel tag. That is equivalent to this and may be used interchangeably.
   * @return all author properties as {@link java.util.Collection} or an empty collection 
   * if author was not set.
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
   * @return publication property set by first invocation of publication method or {@code null}.
   */
  @JsonIgnore public PublicationEvent getPublication() {
    return (PublicationEvent) getValue("publication");
  }
  /**
   * A publication event associated with the item.
   * @return all publication properties as {@link java.util.Collection} or an empty collection 
   * if publication was not set.
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
   * @return license property set by first invocation of license method or {@code null}.
   */
  @JsonIgnore public CreativeWork getLicenseCreativeWork() {
    return (CreativeWork) getValue("license");
  }
  /**
   * A license document that applies to this content, typically indicated by URL.
   * @return all license properties as {@link java.util.Collection} or an empty collection 
   * if license was not set.
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
   * @return license property set by first invocation of license method or {@code null}.
   */
  @JsonIgnore public String getLicenseString() {
    return (String) getValue("license");
  }
  /**
   * A license document that applies to this content, typically indicated by URL.
   * @return all license properties as {@link java.util.Collection} or an empty collection 
   * if license was not set.
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
   *                                 Media type typically expressed using a MIME format (see [IANA site](http://www.iana.org/assignments/media-types/media-types.xhtml) and [MDN reference](https://developer.mozilla.org/en-US/docs/Web/HTTP/Basics_of_HTTP/MIME_types)) e.g. application/zip for a SoftwareApplication binary, audio/mpeg for .mp3 etc.).
   * 
   * In cases where a [[CreativeWork]] has several media type representations, [[encoding]] can be used to indicate each [[MediaObject]] alongside particular [[encodingFormat]] information.
   * 
   * Unregistered or niche encoding and file formats can be indicated instead via the most appropriate URL, e.g. defining Web page or a Wikipedia/Wikidata entry.
   *                                 @return encodingFormat property set by first invocation of encodingFormat method or {@code null}.
   */
  @JsonIgnore public String getEncodingFormat() {
    return (String) getValue("encodingFormat");
  }
  /**
   *                                     Media type typically expressed using a MIME format (see [IANA site](http://www.iana.org/assignments/media-types/media-types.xhtml) and [MDN reference](https://developer.mozilla.org/en-US/docs/Web/HTTP/Basics_of_HTTP/MIME_types)) e.g. application/zip for a SoftwareApplication binary, audio/mpeg for .mp3 etc.).
   * 
   * In cases where a [[CreativeWork]] has several media type representations, [[encoding]] can be used to indicate each [[MediaObject]] alongside particular [[encodingFormat]] information.
   * 
   * Unregistered or niche encoding and file formats can be indicated instead via the most appropriate URL, e.g. defining Web page or a Wikipedia/Wikidata entry.
   *                                     @return all encodingFormat properties as {@link java.util.Collection} or an empty collection 
   *                                     if encodingFormat was not set.
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
   * @return character property set by first invocation of character method or {@code null}.
   */
  @JsonIgnore public Person getCharacter() {
    return (Person) getValue("character");
  }
  /**
   * Fictional person connected with a creative work.
   * @return all character properties as {@link java.util.Collection} or an empty collection 
   * if character was not set.
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
   * @return materialExtent property set by first invocation of materialExtent method or {@code null}.
   */
  @JsonIgnore public QuantitativeValue getMaterialExtentQuantitativeValue() {
    return (QuantitativeValue) getValue("materialExtent");
  }
  /**
   * The quantity of the materials being described or an expression of the physical space they occupy.
   * @return all materialExtent properties as {@link java.util.Collection} or an empty collection 
   * if materialExtent was not set.
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
   * @return materialExtent property set by first invocation of materialExtent method or {@code null}.
   */
  @JsonIgnore public String getMaterialExtentString() {
    return (String) getValue("materialExtent");
  }
  /**
   * The quantity of the materials being described or an expression of the physical space they occupy.
   * @return all materialExtent properties as {@link java.util.Collection} or an empty collection 
   * if materialExtent was not set.
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
   * @return accessibilityFeature property set by first invocation of accessibilityFeature method or {@code null}.
   */
  @JsonIgnore public String getAccessibilityFeature() {
    return (String) getValue("accessibilityFeature");
  }
  /**
   * Content features of the resource, such as accessible media, alternatives and supported enhancements for accessibility ([WebSchemas wiki lists possible values](http://www.w3.org/wiki/WebSchemas/Accessibility)).
   * @return all accessibilityFeature properties as {@link java.util.Collection} or an empty collection 
   * if accessibilityFeature was not set.
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
   * @return accessibilityHazard property set by first invocation of accessibilityHazard method or {@code null}.
   */
  @JsonIgnore public String getAccessibilityHazard() {
    return (String) getValue("accessibilityHazard");
  }
  /**
   * A characteristic of the described resource that is physiologically dangerous to some users. Related to WCAG 2.0 guideline 2.3 ([WebSchemas wiki lists possible values](http://www.w3.org/wiki/WebSchemas/Accessibility)).
   * @return all accessibilityHazard properties as {@link java.util.Collection} or an empty collection 
   * if accessibilityHazard was not set.
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
   * @return isPartOf property set by first invocation of isPartOf method or {@code null}.
   */
  @JsonIgnore public IsPartOf getIsPartOf() {
    return (IsPartOf) getValue("isPartOf");
  }
  /**
   * Indicates an item or CreativeWork that this item, or CreativeWork (in some sense), is part of.
   * @return all isPartOf properties as {@link java.util.Collection} or an empty collection 
   * if isPartOf was not set.
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
   * @return accessibilityAPI property set by first invocation of accessibilityAPI method or {@code null}.
   */
  @JsonIgnore public String getAccessibilityAPI() {
    return (String) getValue("accessibilityAPI");
  }
  /**
   * Indicates that the resource is compatible with the referenced accessibility API ([WebSchemas wiki lists possible values](http://www.w3.org/wiki/WebSchemas/Accessibility)).
   * @return all accessibilityAPI properties as {@link java.util.Collection} or an empty collection 
   * if accessibilityAPI was not set.
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
   * @return workExample property set by first invocation of workExample method or {@code null}.
   */
  @JsonIgnore public WorkExample getWorkExample() {
    return (WorkExample) getValue("workExample");
  }
  /**
   * Example/instance/realization/derivation of the concept of this creative work. eg. The paperback edition, first edition, or eBook.
   * @return all workExample properties as {@link java.util.Collection} or an empty collection 
   * if workExample was not set.
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
   * @return teaches property set by first invocation of teaches method or {@code null}.
   */
  @JsonIgnore public DefinedTerm getTeachesDefinedTerm() {
    return (DefinedTerm) getValue("teaches");
  }
  /**
   * The item being described is intended to help a person learn the competency or learning outcome defined by the referenced term.
   * @return all teaches properties as {@link java.util.Collection} or an empty collection 
   * if teaches was not set.
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
   * @return teaches property set by first invocation of teaches method or {@code null}.
   */
  @JsonIgnore public String getTeachesString() {
    return (String) getValue("teaches");
  }
  /**
   * The item being described is intended to help a person learn the competency or learning outcome defined by the referenced term.
   * @return all teaches properties as {@link java.util.Collection} or an empty collection 
   * if teaches was not set.
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
   * @return publisher property set by first invocation of publisher method or {@code null}.
   */
  @JsonIgnore public Organization getPublisherOrganization() {
    return (Organization) getValue("publisher");
  }
  /**
   * The publisher of the creative work.
   * @return all publisher properties as {@link java.util.Collection} or an empty collection 
   * if publisher was not set.
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
   * @return publisher property set by first invocation of publisher method or {@code null}.
   */
  @JsonIgnore public Person getPublisherPerson() {
    return (Person) getValue("publisher");
  }
  /**
   * The publisher of the creative work.
   * @return all publisher properties as {@link java.util.Collection} or an empty collection 
   * if publisher was not set.
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
   *                                 The temporalCoverage of a CreativeWork indicates the period that the content applies to, i.e. that it describes, either as a DateTime or as a textual string indicating a time period in [ISO 8601 time interval format](https://en.wikipedia.org/wiki/ISO_8601#Time_intervals). In
   *       the case of a Dataset it will typically indicate the relevant time period in a precise notation (e.g. for a 2011 census dataset, the year 2011 would be written &quot;2011/2012&quot;). Other forms of content e.g. ScholarlyArticle, Book, TVSeries or TVEpisode may indicate their temporalCoverage in broader terms - textually or via well-known URL.
   *       Written works such as books may sometimes have precise temporal coverage too, e.g. a work set in 1939 - 1945 can be indicated in ISO 8601 interval format format via &quot;1939/1945&quot;.
   * 
   * Open-ended date ranges can be written with &quot;..&quot; in place of the end date. For example, &quot;2015-11/..&quot; indicates a range beginning in November 2015 and with no specified final date. This is tentative and might be updated in future when ISO 8601 is officially updated.
   *                                 @return temporalCoverage property set by first invocation of temporalCoverage method or {@code null}.
   */
  @JsonIgnore public String getTemporalCoverageString() {
    return (String) getValue("temporalCoverage");
  }
  /**
   *                                     The temporalCoverage of a CreativeWork indicates the period that the content applies to, i.e. that it describes, either as a DateTime or as a textual string indicating a time period in [ISO 8601 time interval format](https://en.wikipedia.org/wiki/ISO_8601#Time_intervals). In
   *       the case of a Dataset it will typically indicate the relevant time period in a precise notation (e.g. for a 2011 census dataset, the year 2011 would be written &quot;2011/2012&quot;). Other forms of content e.g. ScholarlyArticle, Book, TVSeries or TVEpisode may indicate their temporalCoverage in broader terms - textually or via well-known URL.
   *       Written works such as books may sometimes have precise temporal coverage too, e.g. a work set in 1939 - 1945 can be indicated in ISO 8601 interval format format via &quot;1939/1945&quot;.
   * 
   * Open-ended date ranges can be written with &quot;..&quot; in place of the end date. For example, &quot;2015-11/..&quot; indicates a range beginning in November 2015 and with no specified final date. This is tentative and might be updated in future when ISO 8601 is officially updated.
   *                                     @return all temporalCoverage properties as {@link java.util.Collection} or an empty collection 
   *                                     if temporalCoverage was not set.
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
   *                                 The temporalCoverage of a CreativeWork indicates the period that the content applies to, i.e. that it describes, either as a DateTime or as a textual string indicating a time period in [ISO 8601 time interval format](https://en.wikipedia.org/wiki/ISO_8601#Time_intervals). In
   *       the case of a Dataset it will typically indicate the relevant time period in a precise notation (e.g. for a 2011 census dataset, the year 2011 would be written &quot;2011/2012&quot;). Other forms of content e.g. ScholarlyArticle, Book, TVSeries or TVEpisode may indicate their temporalCoverage in broader terms - textually or via well-known URL.
   *       Written works such as books may sometimes have precise temporal coverage too, e.g. a work set in 1939 - 1945 can be indicated in ISO 8601 interval format format via &quot;1939/1945&quot;.
   * 
   * Open-ended date ranges can be written with &quot;..&quot; in place of the end date. For example, &quot;2015-11/..&quot; indicates a range beginning in November 2015 and with no specified final date. This is tentative and might be updated in future when ISO 8601 is officially updated.
   *                                 @return temporalCoverage property set by first invocation of temporalCoverage method or {@code null}.
   */
  @JsonIgnore public java.util.Date getTemporalCoverageDate() {
    return (java.util.Date) getValue("temporalCoverage");
  }
  /**
   *                                     The temporalCoverage of a CreativeWork indicates the period that the content applies to, i.e. that it describes, either as a DateTime or as a textual string indicating a time period in [ISO 8601 time interval format](https://en.wikipedia.org/wiki/ISO_8601#Time_intervals). In
   *       the case of a Dataset it will typically indicate the relevant time period in a precise notation (e.g. for a 2011 census dataset, the year 2011 would be written &quot;2011/2012&quot;). Other forms of content e.g. ScholarlyArticle, Book, TVSeries or TVEpisode may indicate their temporalCoverage in broader terms - textually or via well-known URL.
   *       Written works such as books may sometimes have precise temporal coverage too, e.g. a work set in 1939 - 1945 can be indicated in ISO 8601 interval format format via &quot;1939/1945&quot;.
   * 
   * Open-ended date ranges can be written with &quot;..&quot; in place of the end date. For example, &quot;2015-11/..&quot; indicates a range beginning in November 2015 and with no specified final date. This is tentative and might be updated in future when ISO 8601 is officially updated.
   *                                     @return all temporalCoverage properties as {@link java.util.Collection} or an empty collection 
   *                                     if temporalCoverage was not set.
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
   * A citation or reference to another creative work, such as another publication, web page, scholarly article, etc.
   * @return citation property set by first invocation of citation method or {@code null}.
   */
  @JsonIgnore public CreativeWork getCitationCreativeWork() {
    return (CreativeWork) getValue("citation");
  }
  /**
   * A citation or reference to another creative work, such as another publication, web page, scholarly article, etc.
   * @return all citation properties as {@link java.util.Collection} or an empty collection 
   * if citation was not set.
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
   * @return citation property set by first invocation of citation method or {@code null}.
   */
  @JsonIgnore public String getCitationString() {
    return (String) getValue("citation");
  }
  /**
   * A citation or reference to another creative work, such as another publication, web page, scholarly article, etc.
   * @return all citation properties as {@link java.util.Collection} or an empty collection 
   * if citation was not set.
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
   * @return producer property set by first invocation of producer method or {@code null}.
   */
  @JsonIgnore public Organization getProducerOrganization() {
    return (Organization) getValue("producer");
  }
  /**
   * The person or organization who produced the work (e.g. music album, movie, tv/radio series etc.).
   * @return all producer properties as {@link java.util.Collection} or an empty collection 
   * if producer was not set.
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
   * @return producer property set by first invocation of producer method or {@code null}.
   */
  @JsonIgnore public Person getProducerPerson() {
    return (Person) getValue("producer");
  }
  /**
   * The person or organization who produced the work (e.g. music album, movie, tv/radio series etc.).
   * @return all producer properties as {@link java.util.Collection} or an empty collection 
   * if producer was not set.
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
   * @return maintainer property set by first invocation of maintainer method or {@code null}.
   */
  @JsonIgnore public Organization getMaintainerOrganization() {
    return (Organization) getValue("maintainer");
  }
  /**
   * A maintainer of a [[Dataset]], software package ([[SoftwareApplication]]), or other [[Project]]. A maintainer is a [[Person]] or [[Organization]] that manages contributions to, and/or publication of, some (typically complex) artifact. It is common for distributions of software and data to be based on &quot;upstream&quot; sources. When [[maintainer]] is applied to a specific version of something e.g. a particular version or packaging of a [[Dataset]], it is always  possible that the upstream source has a different maintainer. The [[isBasedOn]] property can be used to indicate such relationships between datasets to make the different maintenance roles clear. Similarly in the case of software, a package may have dedicated maintainers working on integration into software distributions such as Ubuntu, as well as upstream maintainers of the underlying work.
   * 
   * @return all maintainer properties as {@link java.util.Collection} or an empty collection 
   * if maintainer was not set.
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
   * @return maintainer property set by first invocation of maintainer method or {@code null}.
   */
  @JsonIgnore public Person getMaintainerPerson() {
    return (Person) getValue("maintainer");
  }
  /**
   * A maintainer of a [[Dataset]], software package ([[SoftwareApplication]]), or other [[Project]]. A maintainer is a [[Person]] or [[Organization]] that manages contributions to, and/or publication of, some (typically complex) artifact. It is common for distributions of software and data to be based on &quot;upstream&quot; sources. When [[maintainer]] is applied to a specific version of something e.g. a particular version or packaging of a [[Dataset]], it is always  possible that the upstream source has a different maintainer. The [[isBasedOn]] property can be used to indicate such relationships between datasets to make the different maintenance roles clear. Similarly in the case of software, a package may have dedicated maintainers working on integration into software distributions such as Ubuntu, as well as upstream maintainers of the underlying work.
   * 
   * @return all maintainer properties as {@link java.util.Collection} or an empty collection 
   * if maintainer was not set.
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
   * @return translator property set by first invocation of translator method or {@code null}.
   */
  @JsonIgnore public Organization getTranslatorOrganization() {
    return (Organization) getValue("translator");
  }
  /**
   * Organization or person who adapts a creative work to different languages, regional differences and technical requirements of a target market, or that translates during some event.
   * @return all translator properties as {@link java.util.Collection} or an empty collection 
   * if translator was not set.
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
   * @return translator property set by first invocation of translator method or {@code null}.
   */
  @JsonIgnore public Person getTranslatorPerson() {
    return (Person) getValue("translator");
  }
  /**
   * Organization or person who adapts a creative work to different languages, regional differences and technical requirements of a target market, or that translates during some event.
   * @return all translator properties as {@link java.util.Collection} or an empty collection 
   * if translator was not set.
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
   * @return accessibilitySummary property set by first invocation of accessibilitySummary method or {@code null}.
   */
  @JsonIgnore public String getAccessibilitySummary() {
    return (String) getValue("accessibilitySummary");
  }
  /**
   * A human-readable summary of specific accessibility features or deficiencies, consistent with the other accessibility metadata but expressing subtleties such as &quot;short descriptions are present but long descriptions will be needed for non-visual users&quot; or &quot;short descriptions are present and no long descriptions are needed.&quot;
   * @return all accessibilitySummary properties as {@link java.util.Collection} or an empty collection 
   * if accessibilitySummary was not set.
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
   * @return sponsor property set by first invocation of sponsor method or {@code null}.
   */
  @JsonIgnore public Sponsor getSponsor() {
    return (Sponsor) getValue("sponsor");
  }
  /**
   * A person or organization that supports a thing through a pledge, promise, or financial contribution. e.g. a sponsor of a Medical Study or a corporate sponsor of an event.
   * @return all sponsor properties as {@link java.util.Collection} or an empty collection 
   * if sponsor was not set.
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
   * @return funder property set by first invocation of funder method or {@code null}.
   */
  @JsonIgnore public Sponsor getFunder() {
    return (Sponsor) getValue("funder");
  }
  /**
   * A person or organization that supports (sponsors) something through some kind of financial contribution.
   * @return all funder properties as {@link java.util.Collection} or an empty collection 
   * if funder was not set.
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
   * The number of interactions for the CreativeWork using the WebSite or SoftwareApplication. The most specific child type of InteractionCounter should be used.
   * @return interactionStatistic property set by first invocation of interactionStatistic method or {@code null}.
   */
  @JsonIgnore public InteractionCounter getInteractionStatistic() {
    return (InteractionCounter) getValue("interactionStatistic");
  }
  /**
   * The number of interactions for the CreativeWork using the WebSite or SoftwareApplication. The most specific child type of InteractionCounter should be used.
   * @return all interactionStatistic properties as {@link java.util.Collection} or an empty collection 
   * if interactionStatistic was not set.
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
   * @return typicalAgeRange property set by first invocation of typicalAgeRange method or {@code null}.
   */
  @JsonIgnore public String getTypicalAgeRange() {
    return (String) getValue("typicalAgeRange");
  }
  /**
   * The typical expected age range, e.g. '7-9', '11-'.
   * @return all typicalAgeRange properties as {@link java.util.Collection} or an empty collection 
   * if typicalAgeRange was not set.
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
   * @return encoding property set by first invocation of encoding method or {@code null}.
   */
  @JsonIgnore public MediaObject getEncoding() {
    return (MediaObject) getValue("encoding");
  }
  /**
   * A media object that encodes this CreativeWork. This property is a synonym for associatedMedia.
   * @return all encoding properties as {@link java.util.Collection} or an empty collection 
   * if encoding was not set.
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
   * Keywords or tags used to describe this content. Multiple entries in a keywords list are typically delimited by commas.
   * @return keywords property set by first invocation of keywords method or {@code null}.
   */
  @JsonIgnore public DefinedTerm getKeywordsDefinedTerm() {
    return (DefinedTerm) getValue("keywords");
  }
  /**
   * Keywords or tags used to describe this content. Multiple entries in a keywords list are typically delimited by commas.
   * @return all keywords properties as {@link java.util.Collection} or an empty collection 
   * if keywords was not set.
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
   * @return keywords property set by first invocation of keywords method or {@code null}.
   */
  @JsonIgnore public String getKeywordsString() {
    return (String) getValue("keywords");
  }
  /**
   * Keywords or tags used to describe this content. Multiple entries in a keywords list are typically delimited by commas.
   * @return all keywords properties as {@link java.util.Collection} or an empty collection 
   * if keywords was not set.
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
   * @return releasedEvent property set by first invocation of releasedEvent method or {@code null}.
   */
  @JsonIgnore public PublicationEvent getReleasedEvent() {
    return (PublicationEvent) getValue("releasedEvent");
  }
  /**
   * The place and time the release was issued, expressed as a PublicationEvent.
   * @return all releasedEvent properties as {@link java.util.Collection} or an empty collection 
   * if releasedEvent was not set.
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
   * @return isFamilyFriendly property set by first invocation of isFamilyFriendly method or {@code null}.
   */
  @JsonIgnore public Boolean getIsFamilyFriendly() {
    return (Boolean) getValue("isFamilyFriendly");
  }
  /**
   * Indicates whether this content is family friendly.
   * @return all isFamilyFriendly properties as {@link java.util.Collection} or an empty collection 
   * if isFamilyFriendly was not set.
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
   * @return alternativeHeadline property set by first invocation of alternativeHeadline method or {@code null}.
   */
  @JsonIgnore public String getAlternativeHeadline() {
    return (String) getValue("alternativeHeadline");
  }
  /**
   * A secondary title of the CreativeWork.
   * @return all alternativeHeadline properties as {@link java.util.Collection} or an empty collection 
   * if alternativeHeadline was not set.
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
   *                             Indicates (by URL or string) a particular version of a schema used in some CreativeWork. This property was created primarily to
   * indicate the use of a specific schema.org release, e.g. ```10.0``` as a simple string, or more explicitly via URL, ```http://schema.org/docs/releases.html#v10.0```. There may be situations in which other schemas might usefully be referenced this way, e.g. ```http://dublincore.org/specifications/dublin-core/dces/1999-07-02/``` but this has not been carefully explored in the community.
   *                             @return schemaVersion property set by first invocation of schemaVersion method or {@code null}.
   */
  @JsonIgnore public String getSchemaVersion() {
    return (String) getValue("schemaVersion");
  }
  /**
   *                                 Indicates (by URL or string) a particular version of a schema used in some CreativeWork. This property was created primarily to
   * indicate the use of a specific schema.org release, e.g. ```10.0``` as a simple string, or more explicitly via URL, ```http://schema.org/docs/releases.html#v10.0```. There may be situations in which other schemas might usefully be referenced this way, e.g. ```http://dublincore.org/specifications/dublin-core/dces/1999-07-02/``` but this has not been carefully explored in the community.
   *                                 @return all schemaVersion properties as {@link java.util.Collection} or an empty collection 
   *                                 if schemaVersion was not set.
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
   * @return assesses property set by first invocation of assesses method or {@code null}.
   */
  @JsonIgnore public DefinedTerm getAssessesDefinedTerm() {
    return (DefinedTerm) getValue("assesses");
  }
  /**
   * The item being described is intended to assess the competency or learning outcome defined by the referenced term.
   * @return all assesses properties as {@link java.util.Collection} or an empty collection 
   * if assesses was not set.
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
   * @return assesses property set by first invocation of assesses method or {@code null}.
   */
  @JsonIgnore public String getAssessesString() {
    return (String) getValue("assesses");
  }
  /**
   * The item being described is intended to assess the competency or learning outcome defined by the referenced term.
   * @return all assesses properties as {@link java.util.Collection} or an empty collection 
   * if assesses was not set.
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
   * @return publisherImprint property set by first invocation of publisherImprint method or {@code null}.
   */
  @JsonIgnore public Organization getPublisherImprint() {
    return (Organization) getValue("publisherImprint");
  }
  /**
   * The publishing division which published the comic.
   * @return all publisherImprint properties as {@link java.util.Collection} or an empty collection 
   * if publisherImprint was not set.
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
   * @return accessMode property set by first invocation of accessMode method or {@code null}.
   */
  @JsonIgnore public String getAccessMode() {
    return (String) getValue("accessMode");
  }
  /**
   * The human sensory perceptual system or cognitive faculty through which a person may process or perceive information. Expected values include: auditory, tactile, textual, visual, colorDependent, chartOnVisual, chemOnVisual, diagramOnVisual, mathOnVisual, musicOnVisual, textOnVisual.
   * 
   * @return all accessMode properties as {@link java.util.Collection} or an empty collection 
   * if accessMode was not set.
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
   * @return sdDatePublished property set by first invocation of sdDatePublished method or {@code null}.
   */
  @JsonIgnore public java.util.Date getSdDatePublished() {
    return (java.util.Date) getValue("sdDatePublished");
  }
  /**
   * Indicates the date on which the current structured data was generated / published. Typically used alongside [[sdPublisher]]
   * @return all sdDatePublished properties as {@link java.util.Collection} or an empty collection 
   * if sdDatePublished was not set.
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
   * @return interpretedAsClaim property set by first invocation of interpretedAsClaim method or {@code null}.
   */
  @JsonIgnore public Claim getInterpretedAsClaim() {
    return (Claim) getValue("interpretedAsClaim");
  }
  /**
   * Used to indicate a specific claim contained, implied, translated or refined from the content of a [[MediaObject]] or other [[CreativeWork]]. The interpreting party can be indicated using [[claimInterpreter]].
   * @return all interpretedAsClaim properties as {@link java.util.Collection} or an empty collection 
   * if interpretedAsClaim was not set.
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
   * @return timeRequired property set by first invocation of timeRequired method or {@code null}.
   */
  @JsonIgnore public Duration getTimeRequired() {
    return (Duration) getValue("timeRequired");
  }
  /**
   * Approximate or typical time it takes to work with or through this learning resource for the typical intended target audience, e.g. 'PT30M', 'PT1H25M'.
   * @return all timeRequired properties as {@link java.util.Collection} or an empty collection 
   * if timeRequired was not set.
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
   * @return locationCreated property set by first invocation of locationCreated method or {@code null}.
   */
  @JsonIgnore public Place getLocationCreated() {
    return (Place) getValue("locationCreated");
  }
  /**
   * The location where the CreativeWork was created, which may not be the same as the location depicted in the CreativeWork.
   * @return all locationCreated properties as {@link java.util.Collection} or an empty collection 
   * if locationCreated was not set.
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
   * @return editor property set by first invocation of editor method or {@code null}.
   */
  @JsonIgnore public Person getEditor() {
    return (Person) getValue("editor");
  }
  /**
   * Specifies the Person who edited the CreativeWork.
   * @return all editor properties as {@link java.util.Collection} or an empty collection 
   * if editor was not set.
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
   * @return educationalUse property set by first invocation of educationalUse method or {@code null}.
   */
  @JsonIgnore public DefinedTerm getEducationalUseDefinedTerm() {
    return (DefinedTerm) getValue("educationalUse");
  }
  /**
   * The purpose of a work in the context of education; for example, 'assignment', 'group work'.
   * @return all educationalUse properties as {@link java.util.Collection} or an empty collection 
   * if educationalUse was not set.
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
   * @return educationalUse property set by first invocation of educationalUse method or {@code null}.
   */
  @JsonIgnore public String getEducationalUseString() {
    return (String) getValue("educationalUse");
  }
  /**
   * The purpose of a work in the context of education; for example, 'assignment', 'group work'.
   * @return all educationalUse properties as {@link java.util.Collection} or an empty collection 
   * if educationalUse was not set.
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
   * @return copyrightYear property set by first invocation of copyrightYear method or {@code null}.
   */
  @JsonIgnore public Integer getCopyrightYearInteger() {
    return (Integer) getValue("copyrightYear");
  }
  /**
   * The year during which the claimed copyright for the CreativeWork was first asserted.
   * @return all copyrightYear properties as {@link java.util.Collection} or an empty collection 
   * if copyrightYear was not set.
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
   * @return copyrightYear property set by first invocation of copyrightYear method or {@code null}.
   */
  @JsonIgnore public Long getCopyrightYearLong() {
    return (Long) getValue("copyrightYear");
  }
  /**
   * The year during which the claimed copyright for the CreativeWork was first asserted.
   * @return all copyrightYear properties as {@link java.util.Collection} or an empty collection 
   * if copyrightYear was not set.
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
   * @return copyrightYear property set by first invocation of copyrightYear method or {@code null}.
   */
  @JsonIgnore public Float getCopyrightYearFloat() {
    return (Float) getValue("copyrightYear");
  }
  /**
   * The year during which the claimed copyright for the CreativeWork was first asserted.
   * @return all copyrightYear properties as {@link java.util.Collection} or an empty collection 
   * if copyrightYear was not set.
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
   * @return copyrightYear property set by first invocation of copyrightYear method or {@code null}.
   */
  @JsonIgnore public Double getCopyrightYearDouble() {
    return (Double) getValue("copyrightYear");
  }
  /**
   * The year during which the claimed copyright for the CreativeWork was first asserted.
   * @return all copyrightYear properties as {@link java.util.Collection} or an empty collection 
   * if copyrightYear was not set.
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
   * @return copyrightYear property set by first invocation of copyrightYear method or {@code null}.
   */
  @JsonIgnore public String getCopyrightYearString() {
    return (String) getValue("copyrightYear");
  }
  /**
   * The year during which the claimed copyright for the CreativeWork was first asserted.
   * @return all copyrightYear properties as {@link java.util.Collection} or an empty collection 
   * if copyrightYear was not set.
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
   * @return sourceOrganization property set by first invocation of sourceOrganization method or {@code null}.
   */
  @JsonIgnore public Organization getSourceOrganization() {
    return (Organization) getValue("sourceOrganization");
  }
  /**
   * The Organization on whose behalf the creator was working.
   * @return all sourceOrganization properties as {@link java.util.Collection} or an empty collection 
   * if sourceOrganization was not set.
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
   * @return accountablePerson property set by first invocation of accountablePerson method or {@code null}.
   */
  @JsonIgnore public Person getAccountablePerson() {
    return (Person) getValue("accountablePerson");
  }
  /**
   * Specifies the Person that is legally accountable for the CreativeWork.
   * @return all accountablePerson properties as {@link java.util.Collection} or an empty collection 
   * if accountablePerson was not set.
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
   * @return interactivityType property set by first invocation of interactivityType method or {@code null}.
   */
  @JsonIgnore public String getInteractivityType() {
    return (String) getValue("interactivityType");
  }
  /**
   * The predominant mode of learning supported by the learning resource. Acceptable values are 'active', 'expositive', or 'mixed'.
   * @return all interactivityType properties as {@link java.util.Collection} or an empty collection 
   * if interactivityType was not set.
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
   * @return abstract property set by first invocation of abstract method or {@code null}.
   */
  @JsonIgnore public String getAbstract() {
    return (String) getValue("abstract");
  }
  /**
   * An abstract is a short description that summarizes a [[CreativeWork]].
   * @return all abstract properties as {@link java.util.Collection} or an empty collection 
   * if abstract was not set.
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
   * @return accessibilityControl property set by first invocation of accessibilityControl method or {@code null}.
   */
  @JsonIgnore public String getAccessibilityControl() {
    return (String) getValue("accessibilityControl");
  }
  /**
   * Identifies input methods that are sufficient to fully control the described resource ([WebSchemas wiki lists possible values](http://www.w3.org/wiki/WebSchemas/Accessibility)).
   * @return all accessibilityControl properties as {@link java.util.Collection} or an empty collection 
   * if accessibilityControl was not set.
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
   * @return translationOfWork property set by first invocation of translationOfWork method or {@code null}.
   */
  @JsonIgnore public CreativeWork getTranslationOfWork() {
    return (CreativeWork) getValue("translationOfWork");
  }
  /**
   * The work that this work has been translated from. e.g. 物种起源 is a translationOf &ldquo;On the Origin of Species&rdquo;
   * @return all translationOfWork properties as {@link java.util.Collection} or an empty collection 
   * if translationOfWork was not set.
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
   * @return workTranslation property set by first invocation of workTranslation method or {@code null}.
   */
  @JsonIgnore public CreativeWork getWorkTranslation() {
    return (CreativeWork) getValue("workTranslation");
  }
  /**
   * A work that is a translation of the content of this work. e.g. 西遊記 has an English workTranslation &ldquo;Journey to the West&rdquo;,a German workTranslation &ldquo;Monkeys Pilgerfahrt&rdquo; and a Vietnamese  translation T&acirc;y du k&yacute; b&igrave;nh khảo.
   * @return all workTranslation properties as {@link java.util.Collection} or an empty collection 
   * if workTranslation was not set.
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
  /**
   * The subject matter of the content.
   * @return about property set by first invocation of about method or {@code null}.
   */
  @JsonIgnore public Thing getAbout() {
    return (Thing) getValue("about");
  }
  /**
   * The subject matter of the content.
   * @return all about properties as {@link java.util.Collection} or an empty collection 
   * if about was not set.
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
   * @return mainEntity property set by first invocation of mainEntity method or {@code null}.
   */
  @JsonIgnore public About getMainEntityAbout() {
    return (About) getValue("mainEntity");
  }
  /**
   * Indicates the primary entity described in some page or other CreativeWork.
   * @return all mainEntity properties as {@link java.util.Collection} or an empty collection 
   * if mainEntity was not set.
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
   * @return mainEntity property set by first invocation of mainEntity method or {@code null}.
   */
  @JsonIgnore public Thing getMainEntityThing() {
    return (Thing) getValue("mainEntity");
  }
  /**
   * Indicates the primary entity described in some page or other CreativeWork.
   * @return all mainEntity properties as {@link java.util.Collection} or an empty collection 
   * if mainEntity was not set.
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
   * @return recordedAt property set by first invocation of recordedAt method or {@code null}.
   */
  @JsonIgnore public Event getRecordedAt() {
    return (Event) getValue("recordedAt");
  }
  /**
   * The Event where the CreativeWork was recorded. The CreativeWork may capture all or part of the event.
   * @return all recordedAt properties as {@link java.util.Collection} or an empty collection 
   * if recordedAt was not set.
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
   * @return exampleOfWork property set by first invocation of exampleOfWork method or {@code null}.
   */
  @JsonIgnore public CreativeWork getExampleOfWork() {
    return (CreativeWork) getValue("exampleOfWork");
  }
  /**
   * A creative work that this work is an example/instance/realization/derivation of.
   * @return all exampleOfWork properties as {@link java.util.Collection} or an empty collection 
   * if exampleOfWork was not set.
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
   * @return contentLocation property set by first invocation of contentLocation method or {@code null}.
   */
  @JsonIgnore public ContentLocation getContentLocation() {
    return (ContentLocation) getValue("contentLocation");
  }
  /**
   * The location depicted or described in the content. For example, the location in a photograph or painting.
   * @return all contentLocation properties as {@link java.util.Collection} or an empty collection 
   * if contentLocation was not set.
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
   * @return new {@link Builder} initialized with this instance's data
   */
  @NotNull public Builder toBuilder() {
    return new Builder(new HashMap<>(this.myData));
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
     * @param text value to set
     * @return this builder instance
     */
    @NotNull public Builder text(@NotNull String text) {
      putValue("text", text);
      return this;
    }
    /**
     * Remove text property from the builder.
     * If this property is repeatable, all instances are removed.
     * @return this builder instance
     */
    @NotNull public Builder removeText() {
      removeValue("text");
      return this;
    }
    /**
     * Get currently set value for text property in this builder.
     * @return previously set value or {@code null}. If multiple values have been 
     * set to this property, then {@link java.util.Collection} instance will be 
     * returned.
     */
    @Nullable public java.lang.Object getText() {
      return myData.get("text");
    }
    /**
     *                                         The &quot;spatial&quot; property can be used in cases when more specific properties
     * (e.g. [[locationCreated]], [[spatialCoverage]], [[contentLocation]]) are not known to be appropriate.
     *                                         @param place value to set
     *                                         @return this builder instance
     */
    @NotNull public Builder spatial(@NotNull Place place) {
      putValue("spatial", place);
      return this;
    }
    /**
     *                                             The &quot;spatial&quot; property can be used in cases when more specific properties
     * (e.g. [[locationCreated]], [[spatialCoverage]], [[contentLocation]]) are not known to be appropriate.
     *                                             @param place value to set
     *                                             @return this builder instance
     */
    @NotNull public Builder spatial(@NotNull Place.Builder place) {
      putValue("spatial", place.build());
      return this;
    }
    /**
     * Remove spatial property from the builder.
     * If this property is repeatable, all instances are removed.
     * @return this builder instance
     */
    @NotNull public Builder removeSpatial() {
      removeValue("spatial");
      return this;
    }
    /**
     * Get currently set value for spatial property in this builder.
     * @return previously set value or {@code null}. If multiple values have been 
     * set to this property, then {@link java.util.Collection} instance will be 
     * returned.
     */
    @Nullable public java.lang.Object getSpatial() {
      return myData.get("spatial");
    }
    /**
     *                                         The publishingPrinciples property indicates (typically via [[URL]]) a document describing the editorial principles of an [[Organization]] (or individual e.g. a [[Person]] writing a blog) that relate to their activities as a publisher, e.g. ethics or diversity policies. When applied to a [[CreativeWork]] (e.g. [[NewsArticle]]) the principles are those of the party primarily responsible for the creation of the [[CreativeWork]].
     * 
     * While such policies are most typically expressed in natural language, sometimes related information (e.g. indicating a [[funder]]) can be expressed using schema.org terminology.
     * 
     *                                         @param publishingPrinciples value to set
     *                                         @return this builder instance
     */
    @NotNull public Builder publishingPrinciples(@NotNull PublishingPrinciples publishingPrinciples) {
      putValue("publishingPrinciples", publishingPrinciples);
      return this;
    }
    /**
     * Remove publishingPrinciples property from the builder.
     * If this property is repeatable, all instances are removed.
     * @return this builder instance
     */
    @NotNull public Builder removePublishingPrinciples() {
      removeValue("publishingPrinciples");
      return this;
    }
    /**
     * Get currently set value for publishingPrinciples property in this builder.
     * @return previously set value or {@code null}. If multiple values have been 
     * set to this property, then {@link java.util.Collection} instance will be 
     * returned.
     */
    @Nullable public java.lang.Object getPublishingPrinciples() {
      return myData.get("publishingPrinciples");
    }
    /**
     * The language of the content or performance or used in an action. Please use one of the language codes from the [IETF BCP 47 standard](http://tools.ietf.org/html/bcp47). See also [[availableLanguage]].
     * @param language value to set
     * @return this builder instance
     */
    @NotNull public Builder inLanguage(@NotNull Language language) {
      putValue("inLanguage", language);
      return this;
    }
    /**
     * The language of the content or performance or used in an action. Please use one of the language codes from the [IETF BCP 47 standard](http://tools.ietf.org/html/bcp47). See also [[availableLanguage]].
     * @param language value to set
     * @return this builder instance
     */
    @NotNull public Builder inLanguage(@NotNull Language.Builder language) {
      putValue("inLanguage", language.build());
      return this;
    }
    /**
     * The language of the content or performance or used in an action. Please use one of the language codes from the [IETF BCP 47 standard](http://tools.ietf.org/html/bcp47). See also [[availableLanguage]].
     * @param inLanguage value to set
     * @return this builder instance
     */
    @NotNull public Builder inLanguage(@NotNull String inLanguage) {
      putValue("inLanguage", inLanguage);
      return this;
    }
    /**
     * Remove inLanguage property from the builder.
     * If this property is repeatable, all instances are removed.
     * @return this builder instance
     */
    @NotNull public Builder removeInLanguage() {
      removeValue("inLanguage");
      return this;
    }
    /**
     * Get currently set value for inLanguage property in this builder.
     * @return previously set value or {@code null}. If multiple values have been 
     * set to this property, then {@link java.util.Collection} instance will be 
     * returned.
     */
    @Nullable public java.lang.Object getInLanguage() {
      return myData.get("inLanguage");
    }
    /**
     * A thumbnail image relevant to the Thing.
     * @param thumbnailUrl value to set
     * @return this builder instance
     */
    @NotNull public Builder thumbnailUrl(@NotNull String thumbnailUrl) {
      putValue("thumbnailUrl", thumbnailUrl);
      return this;
    }
    /**
     * Remove thumbnailUrl property from the builder.
     * If this property is repeatable, all instances are removed.
     * @return this builder instance
     */
    @NotNull public Builder removeThumbnailUrl() {
      removeValue("thumbnailUrl");
      return this;
    }
    /**
     * Get currently set value for thumbnailUrl property in this builder.
     * @return previously set value or {@code null}. If multiple values have been 
     * set to this property, then {@link java.util.Collection} instance will be 
     * returned.
     */
    @Nullable public java.lang.Object getThumbnailUrl() {
      return myData.get("thumbnailUrl");
    }
    /**
     * Indicates an item or CreativeWork that is part of this item, or CreativeWork (in some sense).
     * @param hasPart value to set
     * @return this builder instance
     */
    @NotNull public Builder hasPart(@NotNull HasPart hasPart) {
      putValue("hasPart", hasPart);
      return this;
    }
    /**
     * Remove hasPart property from the builder.
     * If this property is repeatable, all instances are removed.
     * @return this builder instance
     */
    @NotNull public Builder removeHasPart() {
      removeValue("hasPart");
      return this;
    }
    /**
     * Get currently set value for hasPart property in this builder.
     * @return previously set value or {@code null}. If multiple values have been 
     * set to this property, then {@link java.util.Collection} instance will be 
     * returned.
     */
    @Nullable public java.lang.Object getHasPart() {
      return myData.get("hasPart");
    }
    /**
     * Official rating of a piece of content&amp;#x2014;for example,'MPAA PG-13'.
     * @param rating value to set
     * @return this builder instance
     */
    @NotNull public Builder contentRating(@NotNull Rating rating) {
      putValue("contentRating", rating);
      return this;
    }
    /**
     * Official rating of a piece of content&amp;#x2014;for example,'MPAA PG-13'.
     * @param rating value to set
     * @return this builder instance
     */
    @NotNull public Builder contentRating(@NotNull Rating.Builder rating) {
      putValue("contentRating", rating.build());
      return this;
    }
    /**
     * Official rating of a piece of content&amp;#x2014;for example,'MPAA PG-13'.
     * @param contentRating value to set
     * @return this builder instance
     */
    @NotNull public Builder contentRating(@NotNull String contentRating) {
      putValue("contentRating", contentRating);
      return this;
    }
    /**
     * Remove contentRating property from the builder.
     * If this property is repeatable, all instances are removed.
     * @return this builder instance
     */
    @NotNull public Builder removeContentRating() {
      removeValue("contentRating");
      return this;
    }
    /**
     * Get currently set value for contentRating property in this builder.
     * @return previously set value or {@code null}. If multiple values have been 
     * set to this property, then {@link java.util.Collection} instance will be 
     * returned.
     */
    @Nullable public java.lang.Object getContentRating() {
      return myData.get("contentRating");
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
     * Conditions that affect the availability of, or method(s) of access to, an item. Typically used for real world items such as an [[ArchiveComponent]] held by an [[ArchiveOrganization]]. This property is not suitable for use as a general Web access control mechanism. It is expressed only in natural language.\n\nFor example &quot;Available by appointment from the Reading Room&quot; or &quot;Accessible only from logged-in accounts &quot;. 
     * @param conditionsOfAccess value to set
     * @return this builder instance
     */
    @NotNull public Builder conditionsOfAccess(@NotNull String conditionsOfAccess) {
      putValue("conditionsOfAccess", conditionsOfAccess);
      return this;
    }
    /**
     * Remove conditionsOfAccess property from the builder.
     * If this property is repeatable, all instances are removed.
     * @return this builder instance
     */
    @NotNull public Builder removeConditionsOfAccess() {
      removeValue("conditionsOfAccess");
      return this;
    }
    /**
     * Get currently set value for conditionsOfAccess property in this builder.
     * @return previously set value or {@code null}. If multiple values have been 
     * set to this property, then {@link java.util.Collection} instance will be 
     * returned.
     */
    @Nullable public java.lang.Object getConditionsOfAccess() {
      return myData.get("conditionsOfAccess");
    }
    /**
     * The service provider, service operator, or service performer; the goods producer. Another party (a seller) may offer those services or goods on behalf of the provider. A provider may also serve as the seller.
     * @param organization value to set
     * @return this builder instance
     */
    @NotNull public Builder provider(@NotNull Organization organization) {
      putValue("provider", organization);
      return this;
    }
    /**
     * The service provider, service operator, or service performer; the goods producer. Another party (a seller) may offer those services or goods on behalf of the provider. A provider may also serve as the seller.
     * @param organization value to set
     * @return this builder instance
     */
    @NotNull public Builder provider(@NotNull Organization.Builder organization) {
      putValue("provider", organization.build());
      return this;
    }
    /**
     * The service provider, service operator, or service performer; the goods producer. Another party (a seller) may offer those services or goods on behalf of the provider. A provider may also serve as the seller.
     * @param person value to set
     * @return this builder instance
     */
    @NotNull public Builder provider(@NotNull Person person) {
      putValue("provider", person);
      return this;
    }
    /**
     * The service provider, service operator, or service performer; the goods producer. Another party (a seller) may offer those services or goods on behalf of the provider. A provider may also serve as the seller.
     * @param person value to set
     * @return this builder instance
     */
    @NotNull public Builder provider(@NotNull Person.Builder person) {
      putValue("provider", person.build());
      return this;
    }
    /**
     * Remove provider property from the builder.
     * If this property is repeatable, all instances are removed.
     * @return this builder instance
     */
    @NotNull public Builder removeProvider() {
      removeValue("provider");
      return this;
    }
    /**
     * Get currently set value for provider property in this builder.
     * @return previously set value or {@code null}. If multiple values have been 
     * set to this property, then {@link java.util.Collection} instance will be 
     * returned.
     */
    @Nullable public java.lang.Object getProvider() {
      return myData.get("provider");
    }
    /**
     * The date on which the CreativeWork was created or the item was added to a DataFeed.
     * @param dateCreated value to set
     * @return this builder instance
     */
    @NotNull public Builder dateCreated(@NotNull DateCreated dateCreated) {
      putValue("dateCreated", dateCreated);
      return this;
    }
    /**
     * Remove dateCreated property from the builder.
     * If this property is repeatable, all instances are removed.
     * @return this builder instance
     */
    @NotNull public Builder removeDateCreated() {
      removeValue("dateCreated");
      return this;
    }
    /**
     * Get currently set value for dateCreated property in this builder.
     * @return previously set value or {@code null}. If multiple values have been 
     * set to this property, then {@link java.util.Collection} instance will be 
     * returned.
     */
    @Nullable public java.lang.Object getDateCreated() {
      return myData.get("dateCreated");
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
     * Indicates a correction to a [[CreativeWork]], either via a [[CorrectionComment]], textually or in another document.
     * @param correctionComment value to set
     * @return this builder instance
     */
    @NotNull public Builder correction(@NotNull CorrectionComment correctionComment) {
      putValue("correction", correctionComment);
      return this;
    }
    /**
     * Indicates a correction to a [[CreativeWork]], either via a [[CorrectionComment]], textually or in another document.
     * @param correctionComment value to set
     * @return this builder instance
     */
    @NotNull public Builder correction(@NotNull CorrectionComment.Builder correctionComment) {
      putValue("correction", correctionComment.build());
      return this;
    }
    /**
     * Indicates a correction to a [[CreativeWork]], either via a [[CorrectionComment]], textually or in another document.
     * @param correction value to set
     * @return this builder instance
     */
    @NotNull public Builder correction(@NotNull String correction) {
      putValue("correction", correction);
      return this;
    }
    /**
     * Remove correction property from the builder.
     * If this property is repeatable, all instances are removed.
     * @return this builder instance
     */
    @NotNull public Builder removeCorrection() {
      removeValue("correction");
      return this;
    }
    /**
     * Get currently set value for correction property in this builder.
     * @return previously set value or {@code null}. If multiple values have been 
     * set to this property, then {@link java.util.Collection} instance will be 
     * returned.
     */
    @Nullable public java.lang.Object getCorrection() {
      return myData.get("correction");
    }
    /**
     * The number of comments this CreativeWork (e.g. Article, Question or Answer) has received. This is most applicable to works published in Web sites with commenting system; additional comments may exist elsewhere.
     * @param integer value to set
     * @return this builder instance
     */
    @NotNull public Builder commentCount(@NotNull Integer integer) {
      putValue("commentCount", integer);
      return this;
    }
    /**
     * Remove commentCount property from the builder.
     * If this property is repeatable, all instances are removed.
     * @return this builder instance
     */
    @NotNull public Builder removeCommentCount() {
      removeValue("commentCount");
      return this;
    }
    /**
     * Get currently set value for commentCount property in this builder.
     * @return previously set value or {@code null}. If multiple values have been 
     * set to this property, then {@link java.util.Collection} instance will be 
     * returned.
     */
    @Nullable public java.lang.Object getCommentCount() {
      return myData.get("commentCount");
    }
    /**
     *                                   The spatialCoverage of a CreativeWork indicates the place(s) which are the focus of the content. It is a subproperty of
     * contentLocation intended primarily for more technical and detailed materials. For example with a Dataset, it indicates
     * areas that the dataset describes: a dataset of New York weather would have spatialCoverage which was the place: the state of New York.
     *                                   @param spatialCoverage value to set
     *                                   @return this builder instance
     */
    @NotNull public Builder spatialCoverage(@NotNull SpatialCoverage spatialCoverage) {
      putValue("spatialCoverage", spatialCoverage);
      return this;
    }
    /**
     * Remove spatialCoverage property from the builder.
     * If this property is repeatable, all instances are removed.
     * @return this builder instance
     */
    @NotNull public Builder removeSpatialCoverage() {
      removeValue("spatialCoverage");
      return this;
    }
    /**
     * Get currently set value for spatialCoverage property in this builder.
     * @return previously set value or {@code null}. If multiple values have been 
     * set to this property, then {@link java.util.Collection} instance will be 
     * returned.
     */
    @Nullable public java.lang.Object getSpatialCoverage() {
      return myData.get("spatialCoverage");
    }
    /**
     * Indicates a page or other link involved in archival of a [[CreativeWork]]. In the case of [[MediaReview]], the items in a [[MediaReviewItem]] may often become inaccessible, but be archived by archival, journalistic, activist, or law enforcement organizations. In such cases, the referenced page may not directly publish the content.
     * @param archivedAt value to set
     * @return this builder instance
     */
    @NotNull public Builder archivedAt(@NotNull String archivedAt) {
      putValue("archivedAt", archivedAt);
      return this;
    }
    /**
     * Indicates a page or other link involved in archival of a [[CreativeWork]]. In the case of [[MediaReview]], the items in a [[MediaReviewItem]] may often become inaccessible, but be archived by archival, journalistic, activist, or law enforcement organizations. In such cases, the referenced page may not directly publish the content.
     * @param webPage value to set
     * @return this builder instance
     */
    @NotNull public Builder archivedAt(@NotNull WebPage webPage) {
      putValue("archivedAt", webPage);
      return this;
    }
    /**
     * Indicates a page or other link involved in archival of a [[CreativeWork]]. In the case of [[MediaReview]], the items in a [[MediaReviewItem]] may often become inaccessible, but be archived by archival, journalistic, activist, or law enforcement organizations. In such cases, the referenced page may not directly publish the content.
     * @param webPage value to set
     * @return this builder instance
     */
    @NotNull public Builder archivedAt(@NotNull WebPage.Builder webPage) {
      putValue("archivedAt", webPage.build());
      return this;
    }
    /**
     * Remove archivedAt property from the builder.
     * If this property is repeatable, all instances are removed.
     * @return this builder instance
     */
    @NotNull public Builder removeArchivedAt() {
      removeValue("archivedAt");
      return this;
    }
    /**
     * Get currently set value for archivedAt property in this builder.
     * @return previously set value or {@code null}. If multiple values have been 
     * set to this property, then {@link java.util.Collection} instance will be 
     * returned.
     */
    @Nullable public java.lang.Object getArchivedAt() {
      return myData.get("archivedAt");
    }
    /**
     * Indicates that the CreativeWork contains a reference to, but is not necessarily about a concept.
     * @param thing value to set
     * @return this builder instance
     */
    @NotNull public Builder mentions(@NotNull Thing thing) {
      putValue("mentions", thing);
      return this;
    }
    /**
     * Indicates that the CreativeWork contains a reference to, but is not necessarily about a concept.
     * @param thing value to set
     * @return this builder instance
     */
    @NotNull public Builder mentions(@NotNull Thing.Builder thing) {
      putValue("mentions", thing.build());
      return this;
    }
    /**
     * Remove mentions property from the builder.
     * If this property is repeatable, all instances are removed.
     * @return this builder instance
     */
    @NotNull public Builder removeMentions() {
      removeValue("mentions");
      return this;
    }
    /**
     * Get currently set value for mentions property in this builder.
     * @return previously set value or {@code null}. If multiple values have been 
     * set to this property, then {@link java.util.Collection} instance will be 
     * returned.
     */
    @Nullable public java.lang.Object getMentions() {
      return myData.get("mentions");
    }
    /**
     * The level in terms of progression through an educational or training context. Examples of educational levels include 'beginner', 'intermediate' or 'advanced', and formal sets of level indicators.
     * @param definedTerm value to set
     * @return this builder instance
     */
    @NotNull public Builder educationalLevel(@NotNull DefinedTerm definedTerm) {
      putValue("educationalLevel", definedTerm);
      return this;
    }
    /**
     * The level in terms of progression through an educational or training context. Examples of educational levels include 'beginner', 'intermediate' or 'advanced', and formal sets of level indicators.
     * @param definedTerm value to set
     * @return this builder instance
     */
    @NotNull public Builder educationalLevel(@NotNull DefinedTerm.Builder definedTerm) {
      putValue("educationalLevel", definedTerm.build());
      return this;
    }
    /**
     * The level in terms of progression through an educational or training context. Examples of educational levels include 'beginner', 'intermediate' or 'advanced', and formal sets of level indicators.
     * @param educationalLevel value to set
     * @return this builder instance
     */
    @NotNull public Builder educationalLevel(@NotNull String educationalLevel) {
      putValue("educationalLevel", educationalLevel);
      return this;
    }
    /**
     * Remove educationalLevel property from the builder.
     * If this property is repeatable, all instances are removed.
     * @return this builder instance
     */
    @NotNull public Builder removeEducationalLevel() {
      removeValue("educationalLevel");
      return this;
    }
    /**
     * Get currently set value for educationalLevel property in this builder.
     * @return previously set value or {@code null}. If multiple values have been 
     * set to this property, then {@link java.util.Collection} instance will be 
     * returned.
     */
    @Nullable public java.lang.Object getEducationalLevel() {
      return myData.get("educationalLevel");
    }
    /**
     *                                         The &quot;temporal&quot; property can be used in cases where more specific properties
     * (e.g. [[temporalCoverage]], [[dateCreated]], [[dateModified]], [[datePublished]]) are not known to be appropriate.
     *                                         @param temporal value to set
     *                                         @return this builder instance
     */
    @NotNull public Builder temporal(@NotNull String temporal) {
      putValue("temporal", temporal);
      return this;
    }
    /**
     *                                         The &quot;temporal&quot; property can be used in cases where more specific properties
     * (e.g. [[temporalCoverage]], [[dateCreated]], [[dateModified]], [[datePublished]]) are not known to be appropriate.
     *                                         @param date value to set
     *                                         @return this builder instance
     */
    @NotNull public Builder temporal(@NotNull java.util.Date date) {
      putValue("temporal", date);
      return this;
    }
    /**
     * Remove temporal property from the builder.
     * If this property is repeatable, all instances are removed.
     * @return this builder instance
     */
    @NotNull public Builder removeTemporal() {
      removeValue("temporal");
      return this;
    }
    /**
     * Get currently set value for temporal property in this builder.
     * @return previously set value or {@code null}. If multiple values have been 
     * set to this property, then {@link java.util.Collection} instance will be 
     * returned.
     */
    @Nullable public java.lang.Object getTemporal() {
      return myData.get("temporal");
    }
    /**
     *                                         Indicates the party responsible for generating and publishing the current structured data markup, typically in cases where the structured data is derived automatically from existing published content but published on a different site. For example, student projects and open data initiatives often re-publish existing content with more explicitly structured metadata. The
     * [[sdPublisher]] property helps make such practices more explicit.
     *                                         @param organization value to set
     *                                         @return this builder instance
     */
    @NotNull public Builder sdPublisher(@NotNull Organization organization) {
      putValue("sdPublisher", organization);
      return this;
    }
    /**
     *                                             Indicates the party responsible for generating and publishing the current structured data markup, typically in cases where the structured data is derived automatically from existing published content but published on a different site. For example, student projects and open data initiatives often re-publish existing content with more explicitly structured metadata. The
     * [[sdPublisher]] property helps make such practices more explicit.
     *                                             @param organization value to set
     *                                             @return this builder instance
     */
    @NotNull public Builder sdPublisher(@NotNull Organization.Builder organization) {
      putValue("sdPublisher", organization.build());
      return this;
    }
    /**
     *                                         Indicates the party responsible for generating and publishing the current structured data markup, typically in cases where the structured data is derived automatically from existing published content but published on a different site. For example, student projects and open data initiatives often re-publish existing content with more explicitly structured metadata. The
     * [[sdPublisher]] property helps make such practices more explicit.
     *                                         @param person value to set
     *                                         @return this builder instance
     */
    @NotNull public Builder sdPublisher(@NotNull Person person) {
      putValue("sdPublisher", person);
      return this;
    }
    /**
     *                                             Indicates the party responsible for generating and publishing the current structured data markup, typically in cases where the structured data is derived automatically from existing published content but published on a different site. For example, student projects and open data initiatives often re-publish existing content with more explicitly structured metadata. The
     * [[sdPublisher]] property helps make such practices more explicit.
     *                                             @param person value to set
     *                                             @return this builder instance
     */
    @NotNull public Builder sdPublisher(@NotNull Person.Builder person) {
      putValue("sdPublisher", person.build());
      return this;
    }
    /**
     * Remove sdPublisher property from the builder.
     * If this property is repeatable, all instances are removed.
     * @return this builder instance
     */
    @NotNull public Builder removeSdPublisher() {
      removeValue("sdPublisher");
      return this;
    }
    /**
     * Get currently set value for sdPublisher property in this builder.
     * @return previously set value or {@code null}. If multiple values have been 
     * set to this property, then {@link java.util.Collection} instance will be 
     * returned.
     */
    @Nullable public java.lang.Object getSdPublisher() {
      return myData.get("sdPublisher");
    }
    /**
     * The predominant type or kind characterizing the learning resource. For example, 'presentation', 'handout'.
     * @param definedTerm value to set
     * @return this builder instance
     */
    @NotNull public Builder learningResourceType(@NotNull DefinedTerm definedTerm) {
      putValue("learningResourceType", definedTerm);
      return this;
    }
    /**
     * The predominant type or kind characterizing the learning resource. For example, 'presentation', 'handout'.
     * @param definedTerm value to set
     * @return this builder instance
     */
    @NotNull public Builder learningResourceType(@NotNull DefinedTerm.Builder definedTerm) {
      putValue("learningResourceType", definedTerm.build());
      return this;
    }
    /**
     * The predominant type or kind characterizing the learning resource. For example, 'presentation', 'handout'.
     * @param learningResourceType value to set
     * @return this builder instance
     */
    @NotNull public Builder learningResourceType(@NotNull String learningResourceType) {
      putValue("learningResourceType", learningResourceType);
      return this;
    }
    /**
     * Remove learningResourceType property from the builder.
     * If this property is repeatable, all instances are removed.
     * @return this builder instance
     */
    @NotNull public Builder removeLearningResourceType() {
      removeValue("learningResourceType");
      return this;
    }
    /**
     * Get currently set value for learningResourceType property in this builder.
     * @return previously set value or {@code null}. If multiple values have been 
     * set to this property, then {@link java.util.Collection} instance will be 
     * returned.
     */
    @Nullable public java.lang.Object getLearningResourceType() {
      return myData.get("learningResourceType");
    }
    /**
     * The specific time described by a creative work, for works (e.g. articles, video objects etc.) that emphasise a particular moment within an Event.
     * @param date value to set
     * @return this builder instance
     */
    @NotNull public Builder contentReferenceTime(@NotNull java.util.Date date) {
      putValue("contentReferenceTime", date);
      return this;
    }
    /**
     * Remove contentReferenceTime property from the builder.
     * If this property is repeatable, all instances are removed.
     * @return this builder instance
     */
    @NotNull public Builder removeContentReferenceTime() {
      removeValue("contentReferenceTime");
      return this;
    }
    /**
     * Get currently set value for contentReferenceTime property in this builder.
     * @return previously set value or {@code null}. If multiple values have been 
     * set to this property, then {@link java.util.Collection} instance will be 
     * returned.
     */
    @Nullable public java.lang.Object getContentReferenceTime() {
      return myData.get("contentReferenceTime");
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
     * Genre of the creative work, broadcast channel or group.
     * @param genre value to set
     * @return this builder instance
     */
    @NotNull public Builder genre(@NotNull Genre genre) {
      putValue("genre", genre);
      return this;
    }
    /**
     * Remove genre property from the builder.
     * If this property is repeatable, all instances are removed.
     * @return this builder instance
     */
    @NotNull public Builder removeGenre() {
      removeValue("genre");
      return this;
    }
    /**
     * Get currently set value for genre property in this builder.
     * @return previously set value or {@code null}. If multiple values have been 
     * set to this property, then {@link java.util.Collection} instance will be 
     * returned.
     */
    @Nullable public java.lang.Object getGenre() {
      return myData.get("genre");
    }
    /**
     * A link to the page containing the comments of the CreativeWork.
     * @param discussionUrl value to set
     * @return this builder instance
     */
    @NotNull public Builder discussionUrl(@NotNull String discussionUrl) {
      putValue("discussionUrl", discussionUrl);
      return this;
    }
    /**
     * Remove discussionUrl property from the builder.
     * If this property is repeatable, all instances are removed.
     * @return this builder instance
     */
    @NotNull public Builder removeDiscussionUrl() {
      removeValue("discussionUrl");
      return this;
    }
    /**
     * Get currently set value for discussionUrl property in this builder.
     * @return previously set value or {@code null}. If multiple values have been 
     * set to this property, then {@link java.util.Collection} instance will be 
     * returned.
     */
    @Nullable public java.lang.Object getDiscussionUrl() {
      return myData.get("discussionUrl");
    }
    /**
     *                                         An alignment to an established educational framework.
     * 
     * This property should not be used where the nature of the alignment can be described using a simple property, for example to express that a resource [[teaches]] or [[assesses]] a competency.
     *                                         @param alignmentObject value to set
     *                                         @return this builder instance
     */
    @NotNull public Builder educationalAlignment(@NotNull AlignmentObject alignmentObject) {
      putValue("educationalAlignment", alignmentObject);
      return this;
    }
    /**
     *                                             An alignment to an established educational framework.
     * 
     * This property should not be used where the nature of the alignment can be described using a simple property, for example to express that a resource [[teaches]] or [[assesses]] a competency.
     *                                             @param alignmentObject value to set
     *                                             @return this builder instance
     */
    @NotNull public Builder educationalAlignment(@NotNull AlignmentObject.Builder alignmentObject) {
      putValue("educationalAlignment", alignmentObject.build());
      return this;
    }
    /**
     * Remove educationalAlignment property from the builder.
     * If this property is repeatable, all instances are removed.
     * @return this builder instance
     */
    @NotNull public Builder removeEducationalAlignment() {
      removeValue("educationalAlignment");
      return this;
    }
    /**
     * Get currently set value for educationalAlignment property in this builder.
     * @return previously set value or {@code null}. If multiple values have been 
     * set to this property, then {@link java.util.Collection} instance will be 
     * returned.
     */
    @Nullable public java.lang.Object getEducationalAlignment() {
      return myData.get("educationalAlignment");
    }
    /**
     * The date on which the CreativeWork was most recently modified or when the item's entry was modified within a DataFeed.
     * @param date value to set
     * @return this builder instance
     */
    @NotNull public Builder dateModified(@NotNull java.util.Date date) {
      putValue("dateModified", date);
      return this;
    }
    /**
     * Remove dateModified property from the builder.
     * If this property is repeatable, all instances are removed.
     * @return this builder instance
     */
    @NotNull public Builder removeDateModified() {
      removeValue("dateModified");
      return this;
    }
    /**
     * Get currently set value for dateModified property in this builder.
     * @return previously set value or {@code null}. If multiple values have been 
     * set to this property, then {@link java.util.Collection} instance will be 
     * returned.
     */
    @Nullable public java.lang.Object getDateModified() {
      return myData.get("dateModified");
    }
    /**
     * Comments, typically from users.
     * @param comment value to set
     * @return this builder instance
     */
    @NotNull public Builder comment(@NotNull Comment comment) {
      putValue("comment", comment);
      return this;
    }
    /**
     * Comments, typically from users.
     * @param comment value to set
     * @return this builder instance
     */
    @NotNull public Builder comment(@NotNull Comment.Builder comment) {
      putValue("comment", comment.build());
      return this;
    }
    /**
     * Remove comment property from the builder.
     * If this property is repeatable, all instances are removed.
     * @return this builder instance
     */
    @NotNull public Builder removeComment() {
      removeValue("comment");
      return this;
    }
    /**
     * Get currently set value for comment property in this builder.
     * @return previously set value or {@code null}. If multiple values have been 
     * set to this property, then {@link java.util.Collection} instance will be 
     * returned.
     */
    @Nullable public java.lang.Object getComment() {
      return myData.get("comment");
    }
    /**
     * A license document that applies to this structured data, typically indicated by URL.
     * @param creativeWork value to set
     * @return this builder instance
     */
    @NotNull public Builder sdLicense(@NotNull CreativeWork creativeWork) {
      putValue("sdLicense", creativeWork);
      return this;
    }
    /**
     * A license document that applies to this structured data, typically indicated by URL.
     * @param creativeWork value to set
     * @return this builder instance
     */
    @NotNull public Builder sdLicense(@NotNull CreativeWork.Builder creativeWork) {
      putValue("sdLicense", creativeWork.build());
      return this;
    }
    /**
     * A license document that applies to this structured data, typically indicated by URL.
     * @param sdLicense value to set
     * @return this builder instance
     */
    @NotNull public Builder sdLicense(@NotNull String sdLicense) {
      putValue("sdLicense", sdLicense);
      return this;
    }
    /**
     * Remove sdLicense property from the builder.
     * If this property is repeatable, all instances are removed.
     * @return this builder instance
     */
    @NotNull public Builder removeSdLicense() {
      removeValue("sdLicense");
      return this;
    }
    /**
     * Get currently set value for sdLicense property in this builder.
     * @return previously set value or {@code null}. If multiple values have been 
     * set to this property, then {@link java.util.Collection} instance will be 
     * returned.
     */
    @Nullable public java.lang.Object getSdLicense() {
      return myData.get("sdLicense");
    }
    /**
     * The position of an item in a series or sequence of items.
     * @param integer value to set
     * @return this builder instance
     */
    @NotNull public Builder position(@NotNull Integer integer) {
      putValue("position", integer);
      return this;
    }
    /**
     * The position of an item in a series or sequence of items.
     * @param position value to set
     * @return this builder instance
     */
    @NotNull public Builder position(@NotNull String position) {
      putValue("position", position);
      return this;
    }
    /**
     * Remove position property from the builder.
     * If this property is repeatable, all instances are removed.
     * @return this builder instance
     */
    @NotNull public Builder removePosition() {
      removeValue("position");
      return this;
    }
    /**
     * Get currently set value for position property in this builder.
     * @return previously set value or {@code null}. If multiple values have been 
     * set to this property, then {@link java.util.Collection} instance will be 
     * returned.
     */
    @Nullable public java.lang.Object getPosition() {
      return myData.get("position");
    }
    /**
     * A media object that encodes this CreativeWork. This property is a synonym for encoding.
     * @param mediaObject value to set
     * @return this builder instance
     */
    @NotNull public Builder associatedMedia(@NotNull MediaObject mediaObject) {
      putValue("associatedMedia", mediaObject);
      return this;
    }
    /**
     * A media object that encodes this CreativeWork. This property is a synonym for encoding.
     * @param mediaObject value to set
     * @return this builder instance
     */
    @NotNull public Builder associatedMedia(@NotNull MediaObject.Builder mediaObject) {
      putValue("associatedMedia", mediaObject.build());
      return this;
    }
    /**
     * Remove associatedMedia property from the builder.
     * If this property is repeatable, all instances are removed.
     * @return this builder instance
     */
    @NotNull public Builder removeAssociatedMedia() {
      removeValue("associatedMedia");
      return this;
    }
    /**
     * Get currently set value for associatedMedia property in this builder.
     * @return previously set value or {@code null}. If multiple values have been 
     * set to this property, then {@link java.util.Collection} instance will be 
     * returned.
     */
    @Nullable public java.lang.Object getAssociatedMedia() {
      return myData.get("associatedMedia");
    }
    /**
     * Headline of the article.
     * @param headline value to set
     * @return this builder instance
     */
    @NotNull public Builder headline(@NotNull String headline) {
      putValue("headline", headline);
      return this;
    }
    /**
     * Remove headline property from the builder.
     * If this property is repeatable, all instances are removed.
     * @return this builder instance
     */
    @NotNull public Builder removeHeadline() {
      removeValue("headline");
      return this;
    }
    /**
     * Get currently set value for headline property in this builder.
     * @return previously set value or {@code null}. If multiple values have been 
     * set to this property, then {@link java.util.Collection} instance will be 
     * returned.
     */
    @Nullable public java.lang.Object getHeadline() {
      return myData.get("headline");
    }
    /**
     * An embedded audio object.
     * @param audioObject value to set
     * @return this builder instance
     */
    @NotNull public Builder audio(@NotNull AudioObject audioObject) {
      putValue("audio", audioObject);
      return this;
    }
    /**
     * An embedded audio object.
     * @param audioObject value to set
     * @return this builder instance
     */
    @NotNull public Builder audio(@NotNull AudioObject.Builder audioObject) {
      putValue("audio", audioObject.build());
      return this;
    }
    /**
     * An embedded audio object.
     * @param clip value to set
     * @return this builder instance
     */
    @NotNull public Builder audio(@NotNull Clip clip) {
      putValue("audio", clip);
      return this;
    }
    /**
     * An embedded audio object.
     * @param clip value to set
     * @return this builder instance
     */
    @NotNull public Builder audio(@NotNull Clip.Builder clip) {
      putValue("audio", clip.build());
      return this;
    }
    /**
     * An embedded audio object.
     * @param musicRecording value to set
     * @return this builder instance
     */
    @NotNull public Builder audio(@NotNull MusicRecording musicRecording) {
      putValue("audio", musicRecording);
      return this;
    }
    /**
     * An embedded audio object.
     * @param musicRecording value to set
     * @return this builder instance
     */
    @NotNull public Builder audio(@NotNull MusicRecording.Builder musicRecording) {
      putValue("audio", musicRecording.build());
      return this;
    }
    /**
     * Remove audio property from the builder.
     * If this property is repeatable, all instances are removed.
     * @return this builder instance
     */
    @NotNull public Builder removeAudio() {
      removeValue("audio");
      return this;
    }
    /**
     * Get currently set value for audio property in this builder.
     * @return previously set value or {@code null}. If multiple values have been 
     * set to this property, then {@link java.util.Collection} instance will be 
     * returned.
     */
    @Nullable public java.lang.Object getAudio() {
      return myData.get("audio");
    }
    /**
     * The status of a creative work in terms of its stage in a lifecycle. Example terms include Incomplete, Draft, Published, Obsolete. Some organizations define a set of terms for the stages of their publication lifecycle.
     * @param definedTerm value to set
     * @return this builder instance
     */
    @NotNull public Builder creativeWorkStatus(@NotNull DefinedTerm definedTerm) {
      putValue("creativeWorkStatus", definedTerm);
      return this;
    }
    /**
     * The status of a creative work in terms of its stage in a lifecycle. Example terms include Incomplete, Draft, Published, Obsolete. Some organizations define a set of terms for the stages of their publication lifecycle.
     * @param definedTerm value to set
     * @return this builder instance
     */
    @NotNull public Builder creativeWorkStatus(@NotNull DefinedTerm.Builder definedTerm) {
      putValue("creativeWorkStatus", definedTerm.build());
      return this;
    }
    /**
     * The status of a creative work in terms of its stage in a lifecycle. Example terms include Incomplete, Draft, Published, Obsolete. Some organizations define a set of terms for the stages of their publication lifecycle.
     * @param creativeWorkStatus value to set
     * @return this builder instance
     */
    @NotNull public Builder creativeWorkStatus(@NotNull String creativeWorkStatus) {
      putValue("creativeWorkStatus", creativeWorkStatus);
      return this;
    }
    /**
     * Remove creativeWorkStatus property from the builder.
     * If this property is repeatable, all instances are removed.
     * @return this builder instance
     */
    @NotNull public Builder removeCreativeWorkStatus() {
      removeValue("creativeWorkStatus");
      return this;
    }
    /**
     * Get currently set value for creativeWorkStatus property in this builder.
     * @return previously set value or {@code null}. If multiple values have been 
     * set to this property, then {@link java.util.Collection} instance will be 
     * returned.
     */
    @Nullable public java.lang.Object getCreativeWorkStatus() {
      return myData.get("creativeWorkStatus");
    }
    /**
     * Text of a notice appropriate for describing the copyright aspects of this Creative Work, ideally indicating the owner of the copyright for the Work.
     * @param copyrightNotice value to set
     * @return this builder instance
     */
    @NotNull public Builder copyrightNotice(@NotNull String copyrightNotice) {
      putValue("copyrightNotice", copyrightNotice);
      return this;
    }
    /**
     * Remove copyrightNotice property from the builder.
     * If this property is repeatable, all instances are removed.
     * @return this builder instance
     */
    @NotNull public Builder removeCopyrightNotice() {
      removeValue("copyrightNotice");
      return this;
    }
    /**
     * Get currently set value for copyrightNotice property in this builder.
     * @return previously set value or {@code null}. If multiple values have been 
     * set to this property, then {@link java.util.Collection} instance will be 
     * returned.
     */
    @Nullable public java.lang.Object getCopyrightNotice() {
      return myData.get("copyrightNotice");
    }
    /**
     * The creator/author of this CreativeWork. This is the same as the Author property for CreativeWork.
     * @param creator value to set
     * @return this builder instance
     */
    @NotNull public Builder creator(@NotNull Creator creator) {
      putValue("creator", creator);
      return this;
    }
    /**
     * Remove creator property from the builder.
     * If this property is repeatable, all instances are removed.
     * @return this builder instance
     */
    @NotNull public Builder removeCreator() {
      removeValue("creator");
      return this;
    }
    /**
     * Get currently set value for creator property in this builder.
     * @return previously set value or {@code null}. If multiple values have been 
     * set to this property, then {@link java.util.Collection} instance will be 
     * returned.
     */
    @Nullable public java.lang.Object getCreator() {
      return myData.get("creator");
    }
    /**
     *                                         The schema.org [[usageInfo]] property indicates further information about a [[CreativeWork]]. This property is applicable both to works that are freely available and to those that require payment or other transactions. It can reference additional information e.g. community expectations on preferred linking and citation conventions, as well as purchasing details. For something that can be commercially licensed, usageInfo can provide detailed, resource-specific information about licensing options.
     * 
     * This property can be used alongside the license property which indicates license(s) applicable to some piece of content. The usageInfo property can provide information about other licensing options, e.g. acquiring commercial usage rights for an image that is also available under non-commercial creative commons licenses.
     *                                         @param usageInfo value to set
     *                                         @return this builder instance
     */
    @NotNull public Builder usageInfo(@NotNull UsageInfo usageInfo) {
      putValue("usageInfo", usageInfo);
      return this;
    }
    /**
     * Remove usageInfo property from the builder.
     * If this property is repeatable, all instances are removed.
     * @return this builder instance
     */
    @NotNull public Builder removeUsageInfo() {
      removeValue("usageInfo");
      return this;
    }
    /**
     * Get currently set value for usageInfo property in this builder.
     * @return previously set value or {@code null}. If multiple values have been 
     * set to this property, then {@link java.util.Collection} instance will be 
     * returned.
     */
    @Nullable public java.lang.Object getUsageInfo() {
      return myData.get("usageInfo");
    }
    /**
     * Indicates a page documenting how licenses can be purchased or otherwise acquired, for the current item.
     * @param usageInfo value to set
     * @return this builder instance
     */
    @NotNull public Builder acquireLicensePage(@NotNull UsageInfo usageInfo) {
      putValue("acquireLicensePage", usageInfo);
      return this;
    }
    /**
     * Remove acquireLicensePage property from the builder.
     * If this property is repeatable, all instances are removed.
     * @return this builder instance
     */
    @NotNull public Builder removeAcquireLicensePage() {
      removeValue("acquireLicensePage");
      return this;
    }
    /**
     * Get currently set value for acquireLicensePage property in this builder.
     * @return previously set value or {@code null}. If multiple values have been 
     * set to this property, then {@link java.util.Collection} instance will be 
     * returned.
     */
    @Nullable public java.lang.Object getAcquireLicensePage() {
      return myData.get("acquireLicensePage");
    }
    /**
     * A flag to signal that the item, event, or place is accessible for free.
     * @param isAccessibleForFree value to set
     * @return this builder instance
     */
    @NotNull public Builder isAccessibleForFree(@NotNull Boolean isAccessibleForFree) {
      putValue("isAccessibleForFree", isAccessibleForFree);
      return this;
    }
    /**
     * Remove isAccessibleForFree property from the builder.
     * If this property is repeatable, all instances are removed.
     * @return this builder instance
     */
    @NotNull public Builder removeIsAccessibleForFree() {
      removeValue("isAccessibleForFree");
      return this;
    }
    /**
     * Get currently set value for isAccessibleForFree property in this builder.
     * @return previously set value or {@code null}. If multiple values have been 
     * set to this property, then {@link java.util.Collection} instance will be 
     * returned.
     */
    @Nullable public java.lang.Object getIsAccessibleForFree() {
      return myData.get("isAccessibleForFree");
    }
    /**
     *                                         An [EIDR](https://eidr.org/) (Entertainment Identifier Registry) [[identifier]] representing a specific edit / edition for a work of film or television.
     * 
     * For example, the motion picture known as &quot;Ghostbusters&quot; whose [[titleEIDR]] is &quot;10.5240/7EC7-228A-510A-053E-CBB8-J&quot;, has several edits e.g. &quot;10.5240/1F2A-E1C5-680A-14C6-E76B-I&quot; and &quot;10.5240/8A35-3BEE-6497-5D12-9E4F-3&quot;.
     * 
     * Since schema.org types like [[Movie]] and [[TVEpisode]] can be used for both works and their multiple expressions, it is possible to use [[titleEIDR]] alone (for a general description), or alongside [[editEIDR]] for a more edit-specific description.
     * 
     *                                         @param identifier value to set
     *                                         @return this builder instance
     */
    @NotNull public Builder editEIDR(@NotNull Identifier identifier) {
      putValue("editEIDR", identifier);
      return this;
    }
    /**
     * Remove editEIDR property from the builder.
     * If this property is repeatable, all instances are removed.
     * @return this builder instance
     */
    @NotNull public Builder removeEditEIDR() {
      removeValue("editEIDR");
      return this;
    }
    /**
     * Get currently set value for editEIDR property in this builder.
     * @return previously set value or {@code null}. If multiple values have been 
     * set to this property, then {@link java.util.Collection} instance will be 
     * returned.
     */
    @Nullable public java.lang.Object getEditEIDR() {
      return myData.get("editEIDR");
    }
    /**
     * The version of the CreativeWork embodied by a specified resource.
     * @param number value to set
     * @return this builder instance
     */
    @NotNull public Builder version(@NotNull Number number) {
      putValue("version", number);
      return this;
    }
    /**
     * The version of the CreativeWork embodied by a specified resource.
     * @param version value to set
     * @return this builder instance
     */
    @NotNull public Builder version(@NotNull String version) {
      putValue("version", version);
      return this;
    }
    /**
     * Remove version property from the builder.
     * If this property is repeatable, all instances are removed.
     * @return this builder instance
     */
    @NotNull public Builder removeVersion() {
      removeValue("version");
      return this;
    }
    /**
     * Get currently set value for version property in this builder.
     * @return previously set value or {@code null}. If multiple values have been 
     * set to this property, then {@link java.util.Collection} instance will be 
     * returned.
     */
    @Nullable public java.lang.Object getVersion() {
      return myData.get("version");
    }
    /**
     * A list of single or combined accessModes that are sufficient to understand all the intellectual content of a resource. Expected values include:  auditory, tactile, textual, visual.
     * 
     * @param itemList value to set
     * @return this builder instance
     */
    @NotNull public Builder accessModeSufficient(@NotNull ItemList itemList) {
      putValue("accessModeSufficient", itemList);
      return this;
    }
    /**
     * A list of single or combined accessModes that are sufficient to understand all the intellectual content of a resource. Expected values include:  auditory, tactile, textual, visual.
     * 
     * @param itemList value to set
     * @return this builder instance
     */
    @NotNull public Builder accessModeSufficient(@NotNull ItemList.Builder itemList) {
      putValue("accessModeSufficient", itemList.build());
      return this;
    }
    /**
     * Remove accessModeSufficient property from the builder.
     * If this property is repeatable, all instances are removed.
     * @return this builder instance
     */
    @NotNull public Builder removeAccessModeSufficient() {
      removeValue("accessModeSufficient");
      return this;
    }
    /**
     * Get currently set value for accessModeSufficient property in this builder.
     * @return previously set value or {@code null}. If multiple values have been 
     * set to this property, then {@link java.util.Collection} instance will be 
     * returned.
     */
    @Nullable public java.lang.Object getAccessModeSufficient() {
      return myData.get("accessModeSufficient");
    }
    /**
     * A resource from which this work is derived or from which it is a modification or adaption.
     * @param creativeWork value to set
     * @return this builder instance
     */
    @NotNull public Builder isBasedOn(@NotNull CreativeWork creativeWork) {
      putValue("isBasedOn", creativeWork);
      return this;
    }
    /**
     * A resource from which this work is derived or from which it is a modification or adaption.
     * @param creativeWork value to set
     * @return this builder instance
     */
    @NotNull public Builder isBasedOn(@NotNull CreativeWork.Builder creativeWork) {
      putValue("isBasedOn", creativeWork.build());
      return this;
    }
    /**
     * A resource from which this work is derived or from which it is a modification or adaption.
     * @param product value to set
     * @return this builder instance
     */
    @NotNull public Builder isBasedOn(@NotNull Product product) {
      putValue("isBasedOn", product);
      return this;
    }
    /**
     * A resource from which this work is derived or from which it is a modification or adaption.
     * @param product value to set
     * @return this builder instance
     */
    @NotNull public Builder isBasedOn(@NotNull Product.Builder product) {
      putValue("isBasedOn", product.build());
      return this;
    }
    /**
     * A resource from which this work is derived or from which it is a modification or adaption.
     * @param isBasedOn value to set
     * @return this builder instance
     */
    @NotNull public Builder isBasedOn(@NotNull String isBasedOn) {
      putValue("isBasedOn", isBasedOn);
      return this;
    }
    /**
     * Remove isBasedOn property from the builder.
     * If this property is repeatable, all instances are removed.
     * @return this builder instance
     */
    @NotNull public Builder removeIsBasedOn() {
      removeValue("isBasedOn");
      return this;
    }
    /**
     * Get currently set value for isBasedOn property in this builder.
     * @return previously set value or {@code null}. If multiple values have been 
     * set to this property, then {@link java.util.Collection} instance will be 
     * returned.
     */
    @Nullable public java.lang.Object getIsBasedOn() {
      return myData.get("isBasedOn");
    }
    /**
     * An embedded video object.
     * @param clip value to set
     * @return this builder instance
     */
    @NotNull public Builder video(@NotNull Clip clip) {
      putValue("video", clip);
      return this;
    }
    /**
     * An embedded video object.
     * @param clip value to set
     * @return this builder instance
     */
    @NotNull public Builder video(@NotNull Clip.Builder clip) {
      putValue("video", clip.build());
      return this;
    }
    /**
     * An embedded video object.
     * @param videoObject value to set
     * @return this builder instance
     */
    @NotNull public Builder video(@NotNull VideoObject videoObject) {
      putValue("video", videoObject);
      return this;
    }
    /**
     * An embedded video object.
     * @param videoObject value to set
     * @return this builder instance
     */
    @NotNull public Builder video(@NotNull VideoObject.Builder videoObject) {
      putValue("video", videoObject.build());
      return this;
    }
    /**
     * Remove video property from the builder.
     * If this property is repeatable, all instances are removed.
     * @return this builder instance
     */
    @NotNull public Builder removeVideo() {
      removeValue("video");
      return this;
    }
    /**
     * Get currently set value for video property in this builder.
     * @return previously set value or {@code null}. If multiple values have been 
     * set to this property, then {@link java.util.Collection} instance will be 
     * returned.
     */
    @Nullable public java.lang.Object getVideo() {
      return myData.get("video");
    }
    /**
     * Date the content expires and is no longer useful or available. For example a [[VideoObject]] or [[NewsArticle]] whose availability or relevance is time-limited, or a [[ClaimReview]] fact check whose publisher wants to indicate that it may no longer be relevant (or helpful to highlight) after some date.
     * @param date value to set
     * @return this builder instance
     */
    @NotNull public Builder expires(@NotNull java.util.Date date) {
      putValue("expires", date);
      return this;
    }
    /**
     * Remove expires property from the builder.
     * If this property is repeatable, all instances are removed.
     * @return this builder instance
     */
    @NotNull public Builder removeExpires() {
      removeValue("expires");
      return this;
    }
    /**
     * Get currently set value for expires property in this builder.
     * @return previously set value or {@code null}. If multiple values have been 
     * set to this property, then {@link java.util.Collection} instance will be 
     * returned.
     */
    @Nullable public java.lang.Object getExpires() {
      return myData.get("expires");
    }
    /**
     * Text that can be used to credit person(s) and/or organization(s) associated with a published Creative Work.
     * @param creditText value to set
     * @return this builder instance
     */
    @NotNull public Builder creditText(@NotNull String creditText) {
      putValue("creditText", creditText);
      return this;
    }
    /**
     * Remove creditText property from the builder.
     * If this property is repeatable, all instances are removed.
     * @return this builder instance
     */
    @NotNull public Builder removeCreditText() {
      removeValue("creditText");
      return this;
    }
    /**
     * Get currently set value for creditText property in this builder.
     * @return previously set value or {@code null}. If multiple values have been 
     * set to this property, then {@link java.util.Collection} instance will be 
     * returned.
     */
    @Nullable public java.lang.Object getCreditText() {
      return myData.get("creditText");
    }
    /**
     * A secondary contributor to the CreativeWork or Event.
     * @param organization value to set
     * @return this builder instance
     */
    @NotNull public Builder contributor(@NotNull Organization organization) {
      putValue("contributor", organization);
      return this;
    }
    /**
     * A secondary contributor to the CreativeWork or Event.
     * @param organization value to set
     * @return this builder instance
     */
    @NotNull public Builder contributor(@NotNull Organization.Builder organization) {
      putValue("contributor", organization.build());
      return this;
    }
    /**
     * A secondary contributor to the CreativeWork or Event.
     * @param person value to set
     * @return this builder instance
     */
    @NotNull public Builder contributor(@NotNull Person person) {
      putValue("contributor", person);
      return this;
    }
    /**
     * A secondary contributor to the CreativeWork or Event.
     * @param person value to set
     * @return this builder instance
     */
    @NotNull public Builder contributor(@NotNull Person.Builder person) {
      putValue("contributor", person.build());
      return this;
    }
    /**
     * Remove contributor property from the builder.
     * If this property is repeatable, all instances are removed.
     * @return this builder instance
     */
    @NotNull public Builder removeContributor() {
      removeValue("contributor");
      return this;
    }
    /**
     * Get currently set value for contributor property in this builder.
     * @return previously set value or {@code null}. If multiple values have been 
     * set to this property, then {@link java.util.Collection} instance will be 
     * returned.
     */
    @Nullable public java.lang.Object getContributor() {
      return myData.get("contributor");
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
     * Date of first broadcast/publication.
     * @param date value to set
     * @return this builder instance
     */
    @NotNull public Builder datePublished(@NotNull java.util.Date date) {
      putValue("datePublished", date);
      return this;
    }
    /**
     * Remove datePublished property from the builder.
     * If this property is repeatable, all instances are removed.
     * @return this builder instance
     */
    @NotNull public Builder removeDatePublished() {
      removeValue("datePublished");
      return this;
    }
    /**
     * Get currently set value for datePublished property in this builder.
     * @return previously set value or {@code null}. If multiple values have been 
     * set to this property, then {@link java.util.Collection} instance will be 
     * returned.
     */
    @Nullable public java.lang.Object getDatePublished() {
      return myData.get("datePublished");
    }
    /**
     * The party holding the legal copyright to the CreativeWork.
     * @param organization value to set
     * @return this builder instance
     */
    @NotNull public Builder copyrightHolder(@NotNull Organization organization) {
      putValue("copyrightHolder", organization);
      return this;
    }
    /**
     * The party holding the legal copyright to the CreativeWork.
     * @param organization value to set
     * @return this builder instance
     */
    @NotNull public Builder copyrightHolder(@NotNull Organization.Builder organization) {
      putValue("copyrightHolder", organization.build());
      return this;
    }
    /**
     * The party holding the legal copyright to the CreativeWork.
     * @param person value to set
     * @return this builder instance
     */
    @NotNull public Builder copyrightHolder(@NotNull Person person) {
      putValue("copyrightHolder", person);
      return this;
    }
    /**
     * The party holding the legal copyright to the CreativeWork.
     * @param person value to set
     * @return this builder instance
     */
    @NotNull public Builder copyrightHolder(@NotNull Person.Builder person) {
      putValue("copyrightHolder", person.build());
      return this;
    }
    /**
     * Remove copyrightHolder property from the builder.
     * If this property is repeatable, all instances are removed.
     * @return this builder instance
     */
    @NotNull public Builder removeCopyrightHolder() {
      removeValue("copyrightHolder");
      return this;
    }
    /**
     * Get currently set value for copyrightHolder property in this builder.
     * @return previously set value or {@code null}. If multiple values have been 
     * set to this property, then {@link java.util.Collection} instance will be 
     * returned.
     */
    @Nullable public java.lang.Object getCopyrightHolder() {
      return myData.get("copyrightHolder");
    }
    /**
     * The author of this content or rating. Please note that author is special in that HTML 5 provides a special mechanism for indicating authorship via the rel tag. That is equivalent to this and may be used interchangeably.
     * @param organization value to set
     * @return this builder instance
     */
    @NotNull public Builder author(@NotNull Organization organization) {
      putValue("author", organization);
      return this;
    }
    /**
     * The author of this content or rating. Please note that author is special in that HTML 5 provides a special mechanism for indicating authorship via the rel tag. That is equivalent to this and may be used interchangeably.
     * @param organization value to set
     * @return this builder instance
     */
    @NotNull public Builder author(@NotNull Organization.Builder organization) {
      putValue("author", organization.build());
      return this;
    }
    /**
     * The author of this content or rating. Please note that author is special in that HTML 5 provides a special mechanism for indicating authorship via the rel tag. That is equivalent to this and may be used interchangeably.
     * @param person value to set
     * @return this builder instance
     */
    @NotNull public Builder author(@NotNull Person person) {
      putValue("author", person);
      return this;
    }
    /**
     * The author of this content or rating. Please note that author is special in that HTML 5 provides a special mechanism for indicating authorship via the rel tag. That is equivalent to this and may be used interchangeably.
     * @param person value to set
     * @return this builder instance
     */
    @NotNull public Builder author(@NotNull Person.Builder person) {
      putValue("author", person.build());
      return this;
    }
    /**
     * Remove author property from the builder.
     * If this property is repeatable, all instances are removed.
     * @return this builder instance
     */
    @NotNull public Builder removeAuthor() {
      removeValue("author");
      return this;
    }
    /**
     * Get currently set value for author property in this builder.
     * @return previously set value or {@code null}. If multiple values have been 
     * set to this property, then {@link java.util.Collection} instance will be 
     * returned.
     */
    @Nullable public java.lang.Object getAuthor() {
      return myData.get("author");
    }
    /**
     * A publication event associated with the item.
     * @param publicationEvent value to set
     * @return this builder instance
     */
    @NotNull public Builder publication(@NotNull PublicationEvent publicationEvent) {
      putValue("publication", publicationEvent);
      return this;
    }
    /**
     * A publication event associated with the item.
     * @param publicationEvent value to set
     * @return this builder instance
     */
    @NotNull public Builder publication(@NotNull PublicationEvent.Builder publicationEvent) {
      putValue("publication", publicationEvent.build());
      return this;
    }
    /**
     * Remove publication property from the builder.
     * If this property is repeatable, all instances are removed.
     * @return this builder instance
     */
    @NotNull public Builder removePublication() {
      removeValue("publication");
      return this;
    }
    /**
     * Get currently set value for publication property in this builder.
     * @return previously set value or {@code null}. If multiple values have been 
     * set to this property, then {@link java.util.Collection} instance will be 
     * returned.
     */
    @Nullable public java.lang.Object getPublication() {
      return myData.get("publication");
    }
    /**
     * A license document that applies to this content, typically indicated by URL.
     * @param creativeWork value to set
     * @return this builder instance
     */
    @NotNull public Builder license(@NotNull CreativeWork creativeWork) {
      putValue("license", creativeWork);
      return this;
    }
    /**
     * A license document that applies to this content, typically indicated by URL.
     * @param creativeWork value to set
     * @return this builder instance
     */
    @NotNull public Builder license(@NotNull CreativeWork.Builder creativeWork) {
      putValue("license", creativeWork.build());
      return this;
    }
    /**
     * A license document that applies to this content, typically indicated by URL.
     * @param license value to set
     * @return this builder instance
     */
    @NotNull public Builder license(@NotNull String license) {
      putValue("license", license);
      return this;
    }
    /**
     * Remove license property from the builder.
     * If this property is repeatable, all instances are removed.
     * @return this builder instance
     */
    @NotNull public Builder removeLicense() {
      removeValue("license");
      return this;
    }
    /**
     * Get currently set value for license property in this builder.
     * @return previously set value or {@code null}. If multiple values have been 
     * set to this property, then {@link java.util.Collection} instance will be 
     * returned.
     */
    @Nullable public java.lang.Object getLicense() {
      return myData.get("license");
    }
    /**
     *                                         Media type typically expressed using a MIME format (see [IANA site](http://www.iana.org/assignments/media-types/media-types.xhtml) and [MDN reference](https://developer.mozilla.org/en-US/docs/Web/HTTP/Basics_of_HTTP/MIME_types)) e.g. application/zip for a SoftwareApplication binary, audio/mpeg for .mp3 etc.).
     * 
     * In cases where a [[CreativeWork]] has several media type representations, [[encoding]] can be used to indicate each [[MediaObject]] alongside particular [[encodingFormat]] information.
     * 
     * Unregistered or niche encoding and file formats can be indicated instead via the most appropriate URL, e.g. defining Web page or a Wikipedia/Wikidata entry.
     *                                         @param encodingFormat value to set
     *                                         @return this builder instance
     */
    @NotNull public Builder encodingFormat(@NotNull String encodingFormat) {
      putValue("encodingFormat", encodingFormat);
      return this;
    }
    /**
     * Remove encodingFormat property from the builder.
     * If this property is repeatable, all instances are removed.
     * @return this builder instance
     */
    @NotNull public Builder removeEncodingFormat() {
      removeValue("encodingFormat");
      return this;
    }
    /**
     * Get currently set value for encodingFormat property in this builder.
     * @return previously set value or {@code null}. If multiple values have been 
     * set to this property, then {@link java.util.Collection} instance will be 
     * returned.
     */
    @Nullable public java.lang.Object getEncodingFormat() {
      return myData.get("encodingFormat");
    }
    /**
     * Fictional person connected with a creative work.
     * @param person value to set
     * @return this builder instance
     */
    @NotNull public Builder character(@NotNull Person person) {
      putValue("character", person);
      return this;
    }
    /**
     * Fictional person connected with a creative work.
     * @param person value to set
     * @return this builder instance
     */
    @NotNull public Builder character(@NotNull Person.Builder person) {
      putValue("character", person.build());
      return this;
    }
    /**
     * Remove character property from the builder.
     * If this property is repeatable, all instances are removed.
     * @return this builder instance
     */
    @NotNull public Builder removeCharacter() {
      removeValue("character");
      return this;
    }
    /**
     * Get currently set value for character property in this builder.
     * @return previously set value or {@code null}. If multiple values have been 
     * set to this property, then {@link java.util.Collection} instance will be 
     * returned.
     */
    @Nullable public java.lang.Object getCharacter() {
      return myData.get("character");
    }
    /**
     * The quantity of the materials being described or an expression of the physical space they occupy.
     * @param quantitativeValue value to set
     * @return this builder instance
     */
    @NotNull public Builder materialExtent(@NotNull QuantitativeValue quantitativeValue) {
      putValue("materialExtent", quantitativeValue);
      return this;
    }
    /**
     * The quantity of the materials being described or an expression of the physical space they occupy.
     * @param quantitativeValue value to set
     * @return this builder instance
     */
    @NotNull public Builder materialExtent(@NotNull QuantitativeValue.Builder quantitativeValue) {
      putValue("materialExtent", quantitativeValue.build());
      return this;
    }
    /**
     * The quantity of the materials being described or an expression of the physical space they occupy.
     * @param materialExtent value to set
     * @return this builder instance
     */
    @NotNull public Builder materialExtent(@NotNull String materialExtent) {
      putValue("materialExtent", materialExtent);
      return this;
    }
    /**
     * Remove materialExtent property from the builder.
     * If this property is repeatable, all instances are removed.
     * @return this builder instance
     */
    @NotNull public Builder removeMaterialExtent() {
      removeValue("materialExtent");
      return this;
    }
    /**
     * Get currently set value for materialExtent property in this builder.
     * @return previously set value or {@code null}. If multiple values have been 
     * set to this property, then {@link java.util.Collection} instance will be 
     * returned.
     */
    @Nullable public java.lang.Object getMaterialExtent() {
      return myData.get("materialExtent");
    }
    /**
     * Content features of the resource, such as accessible media, alternatives and supported enhancements for accessibility ([WebSchemas wiki lists possible values](http://www.w3.org/wiki/WebSchemas/Accessibility)).
     * @param accessibilityFeature value to set
     * @return this builder instance
     */
    @NotNull public Builder accessibilityFeature(@NotNull String accessibilityFeature) {
      putValue("accessibilityFeature", accessibilityFeature);
      return this;
    }
    /**
     * Remove accessibilityFeature property from the builder.
     * If this property is repeatable, all instances are removed.
     * @return this builder instance
     */
    @NotNull public Builder removeAccessibilityFeature() {
      removeValue("accessibilityFeature");
      return this;
    }
    /**
     * Get currently set value for accessibilityFeature property in this builder.
     * @return previously set value or {@code null}. If multiple values have been 
     * set to this property, then {@link java.util.Collection} instance will be 
     * returned.
     */
    @Nullable public java.lang.Object getAccessibilityFeature() {
      return myData.get("accessibilityFeature");
    }
    /**
     * A characteristic of the described resource that is physiologically dangerous to some users. Related to WCAG 2.0 guideline 2.3 ([WebSchemas wiki lists possible values](http://www.w3.org/wiki/WebSchemas/Accessibility)).
     * @param accessibilityHazard value to set
     * @return this builder instance
     */
    @NotNull public Builder accessibilityHazard(@NotNull String accessibilityHazard) {
      putValue("accessibilityHazard", accessibilityHazard);
      return this;
    }
    /**
     * Remove accessibilityHazard property from the builder.
     * If this property is repeatable, all instances are removed.
     * @return this builder instance
     */
    @NotNull public Builder removeAccessibilityHazard() {
      removeValue("accessibilityHazard");
      return this;
    }
    /**
     * Get currently set value for accessibilityHazard property in this builder.
     * @return previously set value or {@code null}. If multiple values have been 
     * set to this property, then {@link java.util.Collection} instance will be 
     * returned.
     */
    @Nullable public java.lang.Object getAccessibilityHazard() {
      return myData.get("accessibilityHazard");
    }
    /**
     * Indicates an item or CreativeWork that this item, or CreativeWork (in some sense), is part of.
     * @param isPartOf value to set
     * @return this builder instance
     */
    @NotNull public Builder isPartOf(@NotNull IsPartOf isPartOf) {
      putValue("isPartOf", isPartOf);
      return this;
    }
    /**
     * Remove isPartOf property from the builder.
     * If this property is repeatable, all instances are removed.
     * @return this builder instance
     */
    @NotNull public Builder removeIsPartOf() {
      removeValue("isPartOf");
      return this;
    }
    /**
     * Get currently set value for isPartOf property in this builder.
     * @return previously set value or {@code null}. If multiple values have been 
     * set to this property, then {@link java.util.Collection} instance will be 
     * returned.
     */
    @Nullable public java.lang.Object getIsPartOf() {
      return myData.get("isPartOf");
    }
    /**
     * Indicates that the resource is compatible with the referenced accessibility API ([WebSchemas wiki lists possible values](http://www.w3.org/wiki/WebSchemas/Accessibility)).
     * @param accessibilityAPI value to set
     * @return this builder instance
     */
    @NotNull public Builder accessibilityAPI(@NotNull String accessibilityAPI) {
      putValue("accessibilityAPI", accessibilityAPI);
      return this;
    }
    /**
     * Remove accessibilityAPI property from the builder.
     * If this property is repeatable, all instances are removed.
     * @return this builder instance
     */
    @NotNull public Builder removeAccessibilityAPI() {
      removeValue("accessibilityAPI");
      return this;
    }
    /**
     * Get currently set value for accessibilityAPI property in this builder.
     * @return previously set value or {@code null}. If multiple values have been 
     * set to this property, then {@link java.util.Collection} instance will be 
     * returned.
     */
    @Nullable public java.lang.Object getAccessibilityAPI() {
      return myData.get("accessibilityAPI");
    }
    /**
     * Example/instance/realization/derivation of the concept of this creative work. eg. The paperback edition, first edition, or eBook.
     * @param workExample value to set
     * @return this builder instance
     */
    @NotNull public Builder workExample(@NotNull WorkExample workExample) {
      putValue("workExample", workExample);
      return this;
    }
    /**
     * Remove workExample property from the builder.
     * If this property is repeatable, all instances are removed.
     * @return this builder instance
     */
    @NotNull public Builder removeWorkExample() {
      removeValue("workExample");
      return this;
    }
    /**
     * Get currently set value for workExample property in this builder.
     * @return previously set value or {@code null}. If multiple values have been 
     * set to this property, then {@link java.util.Collection} instance will be 
     * returned.
     */
    @Nullable public java.lang.Object getWorkExample() {
      return myData.get("workExample");
    }
    /**
     * The item being described is intended to help a person learn the competency or learning outcome defined by the referenced term.
     * @param definedTerm value to set
     * @return this builder instance
     */
    @NotNull public Builder teaches(@NotNull DefinedTerm definedTerm) {
      putValue("teaches", definedTerm);
      return this;
    }
    /**
     * The item being described is intended to help a person learn the competency or learning outcome defined by the referenced term.
     * @param definedTerm value to set
     * @return this builder instance
     */
    @NotNull public Builder teaches(@NotNull DefinedTerm.Builder definedTerm) {
      putValue("teaches", definedTerm.build());
      return this;
    }
    /**
     * The item being described is intended to help a person learn the competency or learning outcome defined by the referenced term.
     * @param teaches value to set
     * @return this builder instance
     */
    @NotNull public Builder teaches(@NotNull String teaches) {
      putValue("teaches", teaches);
      return this;
    }
    /**
     * Remove teaches property from the builder.
     * If this property is repeatable, all instances are removed.
     * @return this builder instance
     */
    @NotNull public Builder removeTeaches() {
      removeValue("teaches");
      return this;
    }
    /**
     * Get currently set value for teaches property in this builder.
     * @return previously set value or {@code null}. If multiple values have been 
     * set to this property, then {@link java.util.Collection} instance will be 
     * returned.
     */
    @Nullable public java.lang.Object getTeaches() {
      return myData.get("teaches");
    }
    /**
     * The publisher of the creative work.
     * @param organization value to set
     * @return this builder instance
     */
    @NotNull public Builder publisher(@NotNull Organization organization) {
      putValue("publisher", organization);
      return this;
    }
    /**
     * The publisher of the creative work.
     * @param organization value to set
     * @return this builder instance
     */
    @NotNull public Builder publisher(@NotNull Organization.Builder organization) {
      putValue("publisher", organization.build());
      return this;
    }
    /**
     * The publisher of the creative work.
     * @param person value to set
     * @return this builder instance
     */
    @NotNull public Builder publisher(@NotNull Person person) {
      putValue("publisher", person);
      return this;
    }
    /**
     * The publisher of the creative work.
     * @param person value to set
     * @return this builder instance
     */
    @NotNull public Builder publisher(@NotNull Person.Builder person) {
      putValue("publisher", person.build());
      return this;
    }
    /**
     * Remove publisher property from the builder.
     * If this property is repeatable, all instances are removed.
     * @return this builder instance
     */
    @NotNull public Builder removePublisher() {
      removeValue("publisher");
      return this;
    }
    /**
     * Get currently set value for publisher property in this builder.
     * @return previously set value or {@code null}. If multiple values have been 
     * set to this property, then {@link java.util.Collection} instance will be 
     * returned.
     */
    @Nullable public java.lang.Object getPublisher() {
      return myData.get("publisher");
    }
    /**
     *                                         The temporalCoverage of a CreativeWork indicates the period that the content applies to, i.e. that it describes, either as a DateTime or as a textual string indicating a time period in [ISO 8601 time interval format](https://en.wikipedia.org/wiki/ISO_8601#Time_intervals). In
     *       the case of a Dataset it will typically indicate the relevant time period in a precise notation (e.g. for a 2011 census dataset, the year 2011 would be written &quot;2011/2012&quot;). Other forms of content e.g. ScholarlyArticle, Book, TVSeries or TVEpisode may indicate their temporalCoverage in broader terms - textually or via well-known URL.
     *       Written works such as books may sometimes have precise temporal coverage too, e.g. a work set in 1939 - 1945 can be indicated in ISO 8601 interval format format via &quot;1939/1945&quot;.
     * 
     * Open-ended date ranges can be written with &quot;..&quot; in place of the end date. For example, &quot;2015-11/..&quot; indicates a range beginning in November 2015 and with no specified final date. This is tentative and might be updated in future when ISO 8601 is officially updated.
     *                                         @param temporalCoverage value to set
     *                                         @return this builder instance
     */
    @NotNull public Builder temporalCoverage(@NotNull String temporalCoverage) {
      putValue("temporalCoverage", temporalCoverage);
      return this;
    }
    /**
     *                                         The temporalCoverage of a CreativeWork indicates the period that the content applies to, i.e. that it describes, either as a DateTime or as a textual string indicating a time period in [ISO 8601 time interval format](https://en.wikipedia.org/wiki/ISO_8601#Time_intervals). In
     *       the case of a Dataset it will typically indicate the relevant time period in a precise notation (e.g. for a 2011 census dataset, the year 2011 would be written &quot;2011/2012&quot;). Other forms of content e.g. ScholarlyArticle, Book, TVSeries or TVEpisode may indicate their temporalCoverage in broader terms - textually or via well-known URL.
     *       Written works such as books may sometimes have precise temporal coverage too, e.g. a work set in 1939 - 1945 can be indicated in ISO 8601 interval format format via &quot;1939/1945&quot;.
     * 
     * Open-ended date ranges can be written with &quot;..&quot; in place of the end date. For example, &quot;2015-11/..&quot; indicates a range beginning in November 2015 and with no specified final date. This is tentative and might be updated in future when ISO 8601 is officially updated.
     *                                         @param date value to set
     *                                         @return this builder instance
     */
    @NotNull public Builder temporalCoverage(@NotNull java.util.Date date) {
      putValue("temporalCoverage", date);
      return this;
    }
    /**
     * Remove temporalCoverage property from the builder.
     * If this property is repeatable, all instances are removed.
     * @return this builder instance
     */
    @NotNull public Builder removeTemporalCoverage() {
      removeValue("temporalCoverage");
      return this;
    }
    /**
     * Get currently set value for temporalCoverage property in this builder.
     * @return previously set value or {@code null}. If multiple values have been 
     * set to this property, then {@link java.util.Collection} instance will be 
     * returned.
     */
    @Nullable public java.lang.Object getTemporalCoverage() {
      return myData.get("temporalCoverage");
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
     * A citation or reference to another creative work, such as another publication, web page, scholarly article, etc.
     * @param creativeWork value to set
     * @return this builder instance
     */
    @NotNull public Builder citation(@NotNull CreativeWork creativeWork) {
      putValue("citation", creativeWork);
      return this;
    }
    /**
     * A citation or reference to another creative work, such as another publication, web page, scholarly article, etc.
     * @param creativeWork value to set
     * @return this builder instance
     */
    @NotNull public Builder citation(@NotNull CreativeWork.Builder creativeWork) {
      putValue("citation", creativeWork.build());
      return this;
    }
    /**
     * A citation or reference to another creative work, such as another publication, web page, scholarly article, etc.
     * @param citation value to set
     * @return this builder instance
     */
    @NotNull public Builder citation(@NotNull String citation) {
      putValue("citation", citation);
      return this;
    }
    /**
     * Remove citation property from the builder.
     * If this property is repeatable, all instances are removed.
     * @return this builder instance
     */
    @NotNull public Builder removeCitation() {
      removeValue("citation");
      return this;
    }
    /**
     * Get currently set value for citation property in this builder.
     * @return previously set value or {@code null}. If multiple values have been 
     * set to this property, then {@link java.util.Collection} instance will be 
     * returned.
     */
    @Nullable public java.lang.Object getCitation() {
      return myData.get("citation");
    }
    /**
     * The person or organization who produced the work (e.g. music album, movie, tv/radio series etc.).
     * @param organization value to set
     * @return this builder instance
     */
    @NotNull public Builder producer(@NotNull Organization organization) {
      putValue("producer", organization);
      return this;
    }
    /**
     * The person or organization who produced the work (e.g. music album, movie, tv/radio series etc.).
     * @param organization value to set
     * @return this builder instance
     */
    @NotNull public Builder producer(@NotNull Organization.Builder organization) {
      putValue("producer", organization.build());
      return this;
    }
    /**
     * The person or organization who produced the work (e.g. music album, movie, tv/radio series etc.).
     * @param person value to set
     * @return this builder instance
     */
    @NotNull public Builder producer(@NotNull Person person) {
      putValue("producer", person);
      return this;
    }
    /**
     * The person or organization who produced the work (e.g. music album, movie, tv/radio series etc.).
     * @param person value to set
     * @return this builder instance
     */
    @NotNull public Builder producer(@NotNull Person.Builder person) {
      putValue("producer", person.build());
      return this;
    }
    /**
     * Remove producer property from the builder.
     * If this property is repeatable, all instances are removed.
     * @return this builder instance
     */
    @NotNull public Builder removeProducer() {
      removeValue("producer");
      return this;
    }
    /**
     * Get currently set value for producer property in this builder.
     * @return previously set value or {@code null}. If multiple values have been 
     * set to this property, then {@link java.util.Collection} instance will be 
     * returned.
     */
    @Nullable public java.lang.Object getProducer() {
      return myData.get("producer");
    }
    /**
     * A maintainer of a [[Dataset]], software package ([[SoftwareApplication]]), or other [[Project]]. A maintainer is a [[Person]] or [[Organization]] that manages contributions to, and/or publication of, some (typically complex) artifact. It is common for distributions of software and data to be based on &quot;upstream&quot; sources. When [[maintainer]] is applied to a specific version of something e.g. a particular version or packaging of a [[Dataset]], it is always  possible that the upstream source has a different maintainer. The [[isBasedOn]] property can be used to indicate such relationships between datasets to make the different maintenance roles clear. Similarly in the case of software, a package may have dedicated maintainers working on integration into software distributions such as Ubuntu, as well as upstream maintainers of the underlying work.
     * 
     * @param organization value to set
     * @return this builder instance
     */
    @NotNull public Builder maintainer(@NotNull Organization organization) {
      putValue("maintainer", organization);
      return this;
    }
    /**
     * A maintainer of a [[Dataset]], software package ([[SoftwareApplication]]), or other [[Project]]. A maintainer is a [[Person]] or [[Organization]] that manages contributions to, and/or publication of, some (typically complex) artifact. It is common for distributions of software and data to be based on &quot;upstream&quot; sources. When [[maintainer]] is applied to a specific version of something e.g. a particular version or packaging of a [[Dataset]], it is always  possible that the upstream source has a different maintainer. The [[isBasedOn]] property can be used to indicate such relationships between datasets to make the different maintenance roles clear. Similarly in the case of software, a package may have dedicated maintainers working on integration into software distributions such as Ubuntu, as well as upstream maintainers of the underlying work.
     * 
     * @param organization value to set
     * @return this builder instance
     */
    @NotNull public Builder maintainer(@NotNull Organization.Builder organization) {
      putValue("maintainer", organization.build());
      return this;
    }
    /**
     * A maintainer of a [[Dataset]], software package ([[SoftwareApplication]]), or other [[Project]]. A maintainer is a [[Person]] or [[Organization]] that manages contributions to, and/or publication of, some (typically complex) artifact. It is common for distributions of software and data to be based on &quot;upstream&quot; sources. When [[maintainer]] is applied to a specific version of something e.g. a particular version or packaging of a [[Dataset]], it is always  possible that the upstream source has a different maintainer. The [[isBasedOn]] property can be used to indicate such relationships between datasets to make the different maintenance roles clear. Similarly in the case of software, a package may have dedicated maintainers working on integration into software distributions such as Ubuntu, as well as upstream maintainers of the underlying work.
     * 
     * @param person value to set
     * @return this builder instance
     */
    @NotNull public Builder maintainer(@NotNull Person person) {
      putValue("maintainer", person);
      return this;
    }
    /**
     * A maintainer of a [[Dataset]], software package ([[SoftwareApplication]]), or other [[Project]]. A maintainer is a [[Person]] or [[Organization]] that manages contributions to, and/or publication of, some (typically complex) artifact. It is common for distributions of software and data to be based on &quot;upstream&quot; sources. When [[maintainer]] is applied to a specific version of something e.g. a particular version or packaging of a [[Dataset]], it is always  possible that the upstream source has a different maintainer. The [[isBasedOn]] property can be used to indicate such relationships between datasets to make the different maintenance roles clear. Similarly in the case of software, a package may have dedicated maintainers working on integration into software distributions such as Ubuntu, as well as upstream maintainers of the underlying work.
     * 
     * @param person value to set
     * @return this builder instance
     */
    @NotNull public Builder maintainer(@NotNull Person.Builder person) {
      putValue("maintainer", person.build());
      return this;
    }
    /**
     * Remove maintainer property from the builder.
     * If this property is repeatable, all instances are removed.
     * @return this builder instance
     */
    @NotNull public Builder removeMaintainer() {
      removeValue("maintainer");
      return this;
    }
    /**
     * Get currently set value for maintainer property in this builder.
     * @return previously set value or {@code null}. If multiple values have been 
     * set to this property, then {@link java.util.Collection} instance will be 
     * returned.
     */
    @Nullable public java.lang.Object getMaintainer() {
      return myData.get("maintainer");
    }
    /**
     * Organization or person who adapts a creative work to different languages, regional differences and technical requirements of a target market, or that translates during some event.
     * @param organization value to set
     * @return this builder instance
     */
    @NotNull public Builder translator(@NotNull Organization organization) {
      putValue("translator", organization);
      return this;
    }
    /**
     * Organization or person who adapts a creative work to different languages, regional differences and technical requirements of a target market, or that translates during some event.
     * @param organization value to set
     * @return this builder instance
     */
    @NotNull public Builder translator(@NotNull Organization.Builder organization) {
      putValue("translator", organization.build());
      return this;
    }
    /**
     * Organization or person who adapts a creative work to different languages, regional differences and technical requirements of a target market, or that translates during some event.
     * @param person value to set
     * @return this builder instance
     */
    @NotNull public Builder translator(@NotNull Person person) {
      putValue("translator", person);
      return this;
    }
    /**
     * Organization or person who adapts a creative work to different languages, regional differences and technical requirements of a target market, or that translates during some event.
     * @param person value to set
     * @return this builder instance
     */
    @NotNull public Builder translator(@NotNull Person.Builder person) {
      putValue("translator", person.build());
      return this;
    }
    /**
     * Remove translator property from the builder.
     * If this property is repeatable, all instances are removed.
     * @return this builder instance
     */
    @NotNull public Builder removeTranslator() {
      removeValue("translator");
      return this;
    }
    /**
     * Get currently set value for translator property in this builder.
     * @return previously set value or {@code null}. If multiple values have been 
     * set to this property, then {@link java.util.Collection} instance will be 
     * returned.
     */
    @Nullable public java.lang.Object getTranslator() {
      return myData.get("translator");
    }
    /**
     * A human-readable summary of specific accessibility features or deficiencies, consistent with the other accessibility metadata but expressing subtleties such as &quot;short descriptions are present but long descriptions will be needed for non-visual users&quot; or &quot;short descriptions are present and no long descriptions are needed.&quot;
     * @param accessibilitySummary value to set
     * @return this builder instance
     */
    @NotNull public Builder accessibilitySummary(@NotNull String accessibilitySummary) {
      putValue("accessibilitySummary", accessibilitySummary);
      return this;
    }
    /**
     * Remove accessibilitySummary property from the builder.
     * If this property is repeatable, all instances are removed.
     * @return this builder instance
     */
    @NotNull public Builder removeAccessibilitySummary() {
      removeValue("accessibilitySummary");
      return this;
    }
    /**
     * Get currently set value for accessibilitySummary property in this builder.
     * @return previously set value or {@code null}. If multiple values have been 
     * set to this property, then {@link java.util.Collection} instance will be 
     * returned.
     */
    @Nullable public java.lang.Object getAccessibilitySummary() {
      return myData.get("accessibilitySummary");
    }
    /**
     * A person or organization that supports a thing through a pledge, promise, or financial contribution. e.g. a sponsor of a Medical Study or a corporate sponsor of an event.
     * @param sponsor value to set
     * @return this builder instance
     */
    @NotNull public Builder sponsor(@NotNull Sponsor sponsor) {
      putValue("sponsor", sponsor);
      return this;
    }
    /**
     * Remove sponsor property from the builder.
     * If this property is repeatable, all instances are removed.
     * @return this builder instance
     */
    @NotNull public Builder removeSponsor() {
      removeValue("sponsor");
      return this;
    }
    /**
     * Get currently set value for sponsor property in this builder.
     * @return previously set value or {@code null}. If multiple values have been 
     * set to this property, then {@link java.util.Collection} instance will be 
     * returned.
     */
    @Nullable public java.lang.Object getSponsor() {
      return myData.get("sponsor");
    }
    /**
     * A person or organization that supports (sponsors) something through some kind of financial contribution.
     * @param sponsor value to set
     * @return this builder instance
     */
    @NotNull public Builder funder(@NotNull Sponsor sponsor) {
      putValue("funder", sponsor);
      return this;
    }
    /**
     * Remove funder property from the builder.
     * If this property is repeatable, all instances are removed.
     * @return this builder instance
     */
    @NotNull public Builder removeFunder() {
      removeValue("funder");
      return this;
    }
    /**
     * Get currently set value for funder property in this builder.
     * @return previously set value or {@code null}. If multiple values have been 
     * set to this property, then {@link java.util.Collection} instance will be 
     * returned.
     */
    @Nullable public java.lang.Object getFunder() {
      return myData.get("funder");
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
     * The number of interactions for the CreativeWork using the WebSite or SoftwareApplication. The most specific child type of InteractionCounter should be used.
     * @param interactionCounter value to set
     * @return this builder instance
     */
    @NotNull public Builder interactionStatistic(@NotNull InteractionCounter interactionCounter) {
      putValue("interactionStatistic", interactionCounter);
      return this;
    }
    /**
     * The number of interactions for the CreativeWork using the WebSite or SoftwareApplication. The most specific child type of InteractionCounter should be used.
     * @param interactionCounter value to set
     * @return this builder instance
     */
    @NotNull public Builder interactionStatistic(@NotNull InteractionCounter.Builder interactionCounter) {
      putValue("interactionStatistic", interactionCounter.build());
      return this;
    }
    /**
     * Remove interactionStatistic property from the builder.
     * If this property is repeatable, all instances are removed.
     * @return this builder instance
     */
    @NotNull public Builder removeInteractionStatistic() {
      removeValue("interactionStatistic");
      return this;
    }
    /**
     * Get currently set value for interactionStatistic property in this builder.
     * @return previously set value or {@code null}. If multiple values have been 
     * set to this property, then {@link java.util.Collection} instance will be 
     * returned.
     */
    @Nullable public java.lang.Object getInteractionStatistic() {
      return myData.get("interactionStatistic");
    }
    /**
     * The typical expected age range, e.g. '7-9', '11-'.
     * @param typicalAgeRange value to set
     * @return this builder instance
     */
    @NotNull public Builder typicalAgeRange(@NotNull String typicalAgeRange) {
      putValue("typicalAgeRange", typicalAgeRange);
      return this;
    }
    /**
     * Remove typicalAgeRange property from the builder.
     * If this property is repeatable, all instances are removed.
     * @return this builder instance
     */
    @NotNull public Builder removeTypicalAgeRange() {
      removeValue("typicalAgeRange");
      return this;
    }
    /**
     * Get currently set value for typicalAgeRange property in this builder.
     * @return previously set value or {@code null}. If multiple values have been 
     * set to this property, then {@link java.util.Collection} instance will be 
     * returned.
     */
    @Nullable public java.lang.Object getTypicalAgeRange() {
      return myData.get("typicalAgeRange");
    }
    /**
     * A media object that encodes this CreativeWork. This property is a synonym for associatedMedia.
     * @param mediaObject value to set
     * @return this builder instance
     */
    @NotNull public Builder encoding(@NotNull MediaObject mediaObject) {
      putValue("encoding", mediaObject);
      return this;
    }
    /**
     * A media object that encodes this CreativeWork. This property is a synonym for associatedMedia.
     * @param mediaObject value to set
     * @return this builder instance
     */
    @NotNull public Builder encoding(@NotNull MediaObject.Builder mediaObject) {
      putValue("encoding", mediaObject.build());
      return this;
    }
    /**
     * Remove encoding property from the builder.
     * If this property is repeatable, all instances are removed.
     * @return this builder instance
     */
    @NotNull public Builder removeEncoding() {
      removeValue("encoding");
      return this;
    }
    /**
     * Get currently set value for encoding property in this builder.
     * @return previously set value or {@code null}. If multiple values have been 
     * set to this property, then {@link java.util.Collection} instance will be 
     * returned.
     */
    @Nullable public java.lang.Object getEncoding() {
      return myData.get("encoding");
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
     * Keywords or tags used to describe this content. Multiple entries in a keywords list are typically delimited by commas.
     * @param definedTerm value to set
     * @return this builder instance
     */
    @NotNull public Builder keywords(@NotNull DefinedTerm definedTerm) {
      putValue("keywords", definedTerm);
      return this;
    }
    /**
     * Keywords or tags used to describe this content. Multiple entries in a keywords list are typically delimited by commas.
     * @param definedTerm value to set
     * @return this builder instance
     */
    @NotNull public Builder keywords(@NotNull DefinedTerm.Builder definedTerm) {
      putValue("keywords", definedTerm.build());
      return this;
    }
    /**
     * Keywords or tags used to describe this content. Multiple entries in a keywords list are typically delimited by commas.
     * @param keywords value to set
     * @return this builder instance
     */
    @NotNull public Builder keywords(@NotNull String keywords) {
      putValue("keywords", keywords);
      return this;
    }
    /**
     * Remove keywords property from the builder.
     * If this property is repeatable, all instances are removed.
     * @return this builder instance
     */
    @NotNull public Builder removeKeywords() {
      removeValue("keywords");
      return this;
    }
    /**
     * Get currently set value for keywords property in this builder.
     * @return previously set value or {@code null}. If multiple values have been 
     * set to this property, then {@link java.util.Collection} instance will be 
     * returned.
     */
    @Nullable public java.lang.Object getKeywords() {
      return myData.get("keywords");
    }
    /**
     * The place and time the release was issued, expressed as a PublicationEvent.
     * @param publicationEvent value to set
     * @return this builder instance
     */
    @NotNull public Builder releasedEvent(@NotNull PublicationEvent publicationEvent) {
      putValue("releasedEvent", publicationEvent);
      return this;
    }
    /**
     * The place and time the release was issued, expressed as a PublicationEvent.
     * @param publicationEvent value to set
     * @return this builder instance
     */
    @NotNull public Builder releasedEvent(@NotNull PublicationEvent.Builder publicationEvent) {
      putValue("releasedEvent", publicationEvent.build());
      return this;
    }
    /**
     * Remove releasedEvent property from the builder.
     * If this property is repeatable, all instances are removed.
     * @return this builder instance
     */
    @NotNull public Builder removeReleasedEvent() {
      removeValue("releasedEvent");
      return this;
    }
    /**
     * Get currently set value for releasedEvent property in this builder.
     * @return previously set value or {@code null}. If multiple values have been 
     * set to this property, then {@link java.util.Collection} instance will be 
     * returned.
     */
    @Nullable public java.lang.Object getReleasedEvent() {
      return myData.get("releasedEvent");
    }
    /**
     * Indicates whether this content is family friendly.
     * @param isFamilyFriendly value to set
     * @return this builder instance
     */
    @NotNull public Builder isFamilyFriendly(@NotNull Boolean isFamilyFriendly) {
      putValue("isFamilyFriendly", isFamilyFriendly);
      return this;
    }
    /**
     * Remove isFamilyFriendly property from the builder.
     * If this property is repeatable, all instances are removed.
     * @return this builder instance
     */
    @NotNull public Builder removeIsFamilyFriendly() {
      removeValue("isFamilyFriendly");
      return this;
    }
    /**
     * Get currently set value for isFamilyFriendly property in this builder.
     * @return previously set value or {@code null}. If multiple values have been 
     * set to this property, then {@link java.util.Collection} instance will be 
     * returned.
     */
    @Nullable public java.lang.Object getIsFamilyFriendly() {
      return myData.get("isFamilyFriendly");
    }
    /**
     * A secondary title of the CreativeWork.
     * @param alternativeHeadline value to set
     * @return this builder instance
     */
    @NotNull public Builder alternativeHeadline(@NotNull String alternativeHeadline) {
      putValue("alternativeHeadline", alternativeHeadline);
      return this;
    }
    /**
     * Remove alternativeHeadline property from the builder.
     * If this property is repeatable, all instances are removed.
     * @return this builder instance
     */
    @NotNull public Builder removeAlternativeHeadline() {
      removeValue("alternativeHeadline");
      return this;
    }
    /**
     * Get currently set value for alternativeHeadline property in this builder.
     * @return previously set value or {@code null}. If multiple values have been 
     * set to this property, then {@link java.util.Collection} instance will be 
     * returned.
     */
    @Nullable public java.lang.Object getAlternativeHeadline() {
      return myData.get("alternativeHeadline");
    }
    /**
     *                                     Indicates (by URL or string) a particular version of a schema used in some CreativeWork. This property was created primarily to
     * indicate the use of a specific schema.org release, e.g. ```10.0``` as a simple string, or more explicitly via URL, ```http://schema.org/docs/releases.html#v10.0```. There may be situations in which other schemas might usefully be referenced this way, e.g. ```http://dublincore.org/specifications/dublin-core/dces/1999-07-02/``` but this has not been carefully explored in the community.
     *                                     @param schemaVersion value to set
     *                                     @return this builder instance
     */
    @NotNull public Builder schemaVersion(@NotNull String schemaVersion) {
      putValue("schemaVersion", schemaVersion);
      return this;
    }
    /**
     * Remove schemaVersion property from the builder.
     * If this property is repeatable, all instances are removed.
     * @return this builder instance
     */
    @NotNull public Builder removeSchemaVersion() {
      removeValue("schemaVersion");
      return this;
    }
    /**
     * Get currently set value for schemaVersion property in this builder.
     * @return previously set value or {@code null}. If multiple values have been 
     * set to this property, then {@link java.util.Collection} instance will be 
     * returned.
     */
    @Nullable public java.lang.Object getSchemaVersion() {
      return myData.get("schemaVersion");
    }
    /**
     * The item being described is intended to assess the competency or learning outcome defined by the referenced term.
     * @param definedTerm value to set
     * @return this builder instance
     */
    @NotNull public Builder assesses(@NotNull DefinedTerm definedTerm) {
      putValue("assesses", definedTerm);
      return this;
    }
    /**
     * The item being described is intended to assess the competency or learning outcome defined by the referenced term.
     * @param definedTerm value to set
     * @return this builder instance
     */
    @NotNull public Builder assesses(@NotNull DefinedTerm.Builder definedTerm) {
      putValue("assesses", definedTerm.build());
      return this;
    }
    /**
     * The item being described is intended to assess the competency or learning outcome defined by the referenced term.
     * @param assesses value to set
     * @return this builder instance
     */
    @NotNull public Builder assesses(@NotNull String assesses) {
      putValue("assesses", assesses);
      return this;
    }
    /**
     * Remove assesses property from the builder.
     * If this property is repeatable, all instances are removed.
     * @return this builder instance
     */
    @NotNull public Builder removeAssesses() {
      removeValue("assesses");
      return this;
    }
    /**
     * Get currently set value for assesses property in this builder.
     * @return previously set value or {@code null}. If multiple values have been 
     * set to this property, then {@link java.util.Collection} instance will be 
     * returned.
     */
    @Nullable public java.lang.Object getAssesses() {
      return myData.get("assesses");
    }
    /**
     * The publishing division which published the comic.
     * @param organization value to set
     * @return this builder instance
     */
    @NotNull public Builder publisherImprint(@NotNull Organization organization) {
      putValue("publisherImprint", organization);
      return this;
    }
    /**
     * The publishing division which published the comic.
     * @param organization value to set
     * @return this builder instance
     */
    @NotNull public Builder publisherImprint(@NotNull Organization.Builder organization) {
      putValue("publisherImprint", organization.build());
      return this;
    }
    /**
     * Remove publisherImprint property from the builder.
     * If this property is repeatable, all instances are removed.
     * @return this builder instance
     */
    @NotNull public Builder removePublisherImprint() {
      removeValue("publisherImprint");
      return this;
    }
    /**
     * Get currently set value for publisherImprint property in this builder.
     * @return previously set value or {@code null}. If multiple values have been 
     * set to this property, then {@link java.util.Collection} instance will be 
     * returned.
     */
    @Nullable public java.lang.Object getPublisherImprint() {
      return myData.get("publisherImprint");
    }
    /**
     * The human sensory perceptual system or cognitive faculty through which a person may process or perceive information. Expected values include: auditory, tactile, textual, visual, colorDependent, chartOnVisual, chemOnVisual, diagramOnVisual, mathOnVisual, musicOnVisual, textOnVisual.
     * 
     * @param accessMode value to set
     * @return this builder instance
     */
    @NotNull public Builder accessMode(@NotNull String accessMode) {
      putValue("accessMode", accessMode);
      return this;
    }
    /**
     * Remove accessMode property from the builder.
     * If this property is repeatable, all instances are removed.
     * @return this builder instance
     */
    @NotNull public Builder removeAccessMode() {
      removeValue("accessMode");
      return this;
    }
    /**
     * Get currently set value for accessMode property in this builder.
     * @return previously set value or {@code null}. If multiple values have been 
     * set to this property, then {@link java.util.Collection} instance will be 
     * returned.
     */
    @Nullable public java.lang.Object getAccessMode() {
      return myData.get("accessMode");
    }
    /**
     * Indicates the date on which the current structured data was generated / published. Typically used alongside [[sdPublisher]]
     * @param date value to set
     * @return this builder instance
     */
    @NotNull public Builder sdDatePublished(@NotNull java.util.Date date) {
      putValue("sdDatePublished", date);
      return this;
    }
    /**
     * Remove sdDatePublished property from the builder.
     * If this property is repeatable, all instances are removed.
     * @return this builder instance
     */
    @NotNull public Builder removeSdDatePublished() {
      removeValue("sdDatePublished");
      return this;
    }
    /**
     * Get currently set value for sdDatePublished property in this builder.
     * @return previously set value or {@code null}. If multiple values have been 
     * set to this property, then {@link java.util.Collection} instance will be 
     * returned.
     */
    @Nullable public java.lang.Object getSdDatePublished() {
      return myData.get("sdDatePublished");
    }
    /**
     * Used to indicate a specific claim contained, implied, translated or refined from the content of a [[MediaObject]] or other [[CreativeWork]]. The interpreting party can be indicated using [[claimInterpreter]].
     * @param claim value to set
     * @return this builder instance
     */
    @NotNull public Builder interpretedAsClaim(@NotNull Claim claim) {
      putValue("interpretedAsClaim", claim);
      return this;
    }
    /**
     * Used to indicate a specific claim contained, implied, translated or refined from the content of a [[MediaObject]] or other [[CreativeWork]]. The interpreting party can be indicated using [[claimInterpreter]].
     * @param claim value to set
     * @return this builder instance
     */
    @NotNull public Builder interpretedAsClaim(@NotNull Claim.Builder claim) {
      putValue("interpretedAsClaim", claim.build());
      return this;
    }
    /**
     * Remove interpretedAsClaim property from the builder.
     * If this property is repeatable, all instances are removed.
     * @return this builder instance
     */
    @NotNull public Builder removeInterpretedAsClaim() {
      removeValue("interpretedAsClaim");
      return this;
    }
    /**
     * Get currently set value for interpretedAsClaim property in this builder.
     * @return previously set value or {@code null}. If multiple values have been 
     * set to this property, then {@link java.util.Collection} instance will be 
     * returned.
     */
    @Nullable public java.lang.Object getInterpretedAsClaim() {
      return myData.get("interpretedAsClaim");
    }
    /**
     * Approximate or typical time it takes to work with or through this learning resource for the typical intended target audience, e.g. 'PT30M', 'PT1H25M'.
     * @param duration value to set
     * @return this builder instance
     */
    @NotNull public Builder timeRequired(@NotNull Duration duration) {
      putValue("timeRequired", duration);
      return this;
    }
    /**
     * Remove timeRequired property from the builder.
     * If this property is repeatable, all instances are removed.
     * @return this builder instance
     */
    @NotNull public Builder removeTimeRequired() {
      removeValue("timeRequired");
      return this;
    }
    /**
     * Get currently set value for timeRequired property in this builder.
     * @return previously set value or {@code null}. If multiple values have been 
     * set to this property, then {@link java.util.Collection} instance will be 
     * returned.
     */
    @Nullable public java.lang.Object getTimeRequired() {
      return myData.get("timeRequired");
    }
    /**
     * The location where the CreativeWork was created, which may not be the same as the location depicted in the CreativeWork.
     * @param place value to set
     * @return this builder instance
     */
    @NotNull public Builder locationCreated(@NotNull Place place) {
      putValue("locationCreated", place);
      return this;
    }
    /**
     * The location where the CreativeWork was created, which may not be the same as the location depicted in the CreativeWork.
     * @param place value to set
     * @return this builder instance
     */
    @NotNull public Builder locationCreated(@NotNull Place.Builder place) {
      putValue("locationCreated", place.build());
      return this;
    }
    /**
     * Remove locationCreated property from the builder.
     * If this property is repeatable, all instances are removed.
     * @return this builder instance
     */
    @NotNull public Builder removeLocationCreated() {
      removeValue("locationCreated");
      return this;
    }
    /**
     * Get currently set value for locationCreated property in this builder.
     * @return previously set value or {@code null}. If multiple values have been 
     * set to this property, then {@link java.util.Collection} instance will be 
     * returned.
     */
    @Nullable public java.lang.Object getLocationCreated() {
      return myData.get("locationCreated");
    }
    /**
     * Specifies the Person who edited the CreativeWork.
     * @param person value to set
     * @return this builder instance
     */
    @NotNull public Builder editor(@NotNull Person person) {
      putValue("editor", person);
      return this;
    }
    /**
     * Specifies the Person who edited the CreativeWork.
     * @param person value to set
     * @return this builder instance
     */
    @NotNull public Builder editor(@NotNull Person.Builder person) {
      putValue("editor", person.build());
      return this;
    }
    /**
     * Remove editor property from the builder.
     * If this property is repeatable, all instances are removed.
     * @return this builder instance
     */
    @NotNull public Builder removeEditor() {
      removeValue("editor");
      return this;
    }
    /**
     * Get currently set value for editor property in this builder.
     * @return previously set value or {@code null}. If multiple values have been 
     * set to this property, then {@link java.util.Collection} instance will be 
     * returned.
     */
    @Nullable public java.lang.Object getEditor() {
      return myData.get("editor");
    }
    /**
     * The purpose of a work in the context of education; for example, 'assignment', 'group work'.
     * @param definedTerm value to set
     * @return this builder instance
     */
    @NotNull public Builder educationalUse(@NotNull DefinedTerm definedTerm) {
      putValue("educationalUse", definedTerm);
      return this;
    }
    /**
     * The purpose of a work in the context of education; for example, 'assignment', 'group work'.
     * @param definedTerm value to set
     * @return this builder instance
     */
    @NotNull public Builder educationalUse(@NotNull DefinedTerm.Builder definedTerm) {
      putValue("educationalUse", definedTerm.build());
      return this;
    }
    /**
     * The purpose of a work in the context of education; for example, 'assignment', 'group work'.
     * @param educationalUse value to set
     * @return this builder instance
     */
    @NotNull public Builder educationalUse(@NotNull String educationalUse) {
      putValue("educationalUse", educationalUse);
      return this;
    }
    /**
     * Remove educationalUse property from the builder.
     * If this property is repeatable, all instances are removed.
     * @return this builder instance
     */
    @NotNull public Builder removeEducationalUse() {
      removeValue("educationalUse");
      return this;
    }
    /**
     * Get currently set value for educationalUse property in this builder.
     * @return previously set value or {@code null}. If multiple values have been 
     * set to this property, then {@link java.util.Collection} instance will be 
     * returned.
     */
    @Nullable public java.lang.Object getEducationalUse() {
      return myData.get("educationalUse");
    }
    /**
     * The year during which the claimed copyright for the CreativeWork was first asserted.
     * @param integer value to set
     * @return this builder instance
     */
    @NotNull public Builder copyrightYear(@NotNull Integer integer) {
      putValue("copyrightYear", integer);
      return this;
    }
    /**
     * The year during which the claimed copyright for the CreativeWork was first asserted.
     * @param copyrightYear value to set
     * @return this builder instance
     */
    @NotNull public Builder copyrightYear(@NotNull Long copyrightYear) {
      putValue("copyrightYear", copyrightYear);
      return this;
    }
    /**
     * The year during which the claimed copyright for the CreativeWork was first asserted.
     * @param copyrightYear value to set
     * @return this builder instance
     */
    @NotNull public Builder copyrightYear(@NotNull Float copyrightYear) {
      putValue("copyrightYear", copyrightYear);
      return this;
    }
    /**
     * The year during which the claimed copyright for the CreativeWork was first asserted.
     * @param copyrightYear value to set
     * @return this builder instance
     */
    @NotNull public Builder copyrightYear(@NotNull Double copyrightYear) {
      putValue("copyrightYear", copyrightYear);
      return this;
    }
    /**
     * The year during which the claimed copyright for the CreativeWork was first asserted.
     * @param copyrightYear value to set
     * @return this builder instance
     */
    @NotNull public Builder copyrightYear(@NotNull String copyrightYear) {
      putValue("copyrightYear", copyrightYear);
      return this;
    }
    /**
     * Remove copyrightYear property from the builder.
     * If this property is repeatable, all instances are removed.
     * @return this builder instance
     */
    @NotNull public Builder removeCopyrightYear() {
      removeValue("copyrightYear");
      return this;
    }
    /**
     * Get currently set value for copyrightYear property in this builder.
     * @return previously set value or {@code null}. If multiple values have been 
     * set to this property, then {@link java.util.Collection} instance will be 
     * returned.
     */
    @Nullable public java.lang.Object getCopyrightYear() {
      return myData.get("copyrightYear");
    }
    /**
     * The Organization on whose behalf the creator was working.
     * @param organization value to set
     * @return this builder instance
     */
    @NotNull public Builder sourceOrganization(@NotNull Organization organization) {
      putValue("sourceOrganization", organization);
      return this;
    }
    /**
     * The Organization on whose behalf the creator was working.
     * @param organization value to set
     * @return this builder instance
     */
    @NotNull public Builder sourceOrganization(@NotNull Organization.Builder organization) {
      putValue("sourceOrganization", organization.build());
      return this;
    }
    /**
     * Remove sourceOrganization property from the builder.
     * If this property is repeatable, all instances are removed.
     * @return this builder instance
     */
    @NotNull public Builder removeSourceOrganization() {
      removeValue("sourceOrganization");
      return this;
    }
    /**
     * Get currently set value for sourceOrganization property in this builder.
     * @return previously set value or {@code null}. If multiple values have been 
     * set to this property, then {@link java.util.Collection} instance will be 
     * returned.
     */
    @Nullable public java.lang.Object getSourceOrganization() {
      return myData.get("sourceOrganization");
    }
    /**
     * Specifies the Person that is legally accountable for the CreativeWork.
     * @param person value to set
     * @return this builder instance
     */
    @NotNull public Builder accountablePerson(@NotNull Person person) {
      putValue("accountablePerson", person);
      return this;
    }
    /**
     * Specifies the Person that is legally accountable for the CreativeWork.
     * @param person value to set
     * @return this builder instance
     */
    @NotNull public Builder accountablePerson(@NotNull Person.Builder person) {
      putValue("accountablePerson", person.build());
      return this;
    }
    /**
     * Remove accountablePerson property from the builder.
     * If this property is repeatable, all instances are removed.
     * @return this builder instance
     */
    @NotNull public Builder removeAccountablePerson() {
      removeValue("accountablePerson");
      return this;
    }
    /**
     * Get currently set value for accountablePerson property in this builder.
     * @return previously set value or {@code null}. If multiple values have been 
     * set to this property, then {@link java.util.Collection} instance will be 
     * returned.
     */
    @Nullable public java.lang.Object getAccountablePerson() {
      return myData.get("accountablePerson");
    }
    /**
     * The predominant mode of learning supported by the learning resource. Acceptable values are 'active', 'expositive', or 'mixed'.
     * @param interactivityType value to set
     * @return this builder instance
     */
    @NotNull public Builder interactivityType(@NotNull String interactivityType) {
      putValue("interactivityType", interactivityType);
      return this;
    }
    /**
     * Remove interactivityType property from the builder.
     * If this property is repeatable, all instances are removed.
     * @return this builder instance
     */
    @NotNull public Builder removeInteractivityType() {
      removeValue("interactivityType");
      return this;
    }
    /**
     * Get currently set value for interactivityType property in this builder.
     * @return previously set value or {@code null}. If multiple values have been 
     * set to this property, then {@link java.util.Collection} instance will be 
     * returned.
     */
    @Nullable public java.lang.Object getInteractivityType() {
      return myData.get("interactivityType");
    }
    /**
     * An abstract is a short description that summarizes a [[CreativeWork]].
     * @param _abstract value to set
     * @return this builder instance
     */
    @NotNull public Builder _abstract(@NotNull String _abstract) {
      putValue("abstract", _abstract);
      return this;
    }
    /**
     * Remove abstract property from the builder.
     * If this property is repeatable, all instances are removed.
     * @return this builder instance
     */
    @NotNull public Builder removeAbstract() {
      removeValue("abstract");
      return this;
    }
    /**
     * Get currently set value for abstract property in this builder.
     * @return previously set value or {@code null}. If multiple values have been 
     * set to this property, then {@link java.util.Collection} instance will be 
     * returned.
     */
    @Nullable public java.lang.Object getAbstract() {
      return myData.get("abstract");
    }
    /**
     * Identifies input methods that are sufficient to fully control the described resource ([WebSchemas wiki lists possible values](http://www.w3.org/wiki/WebSchemas/Accessibility)).
     * @param accessibilityControl value to set
     * @return this builder instance
     */
    @NotNull public Builder accessibilityControl(@NotNull String accessibilityControl) {
      putValue("accessibilityControl", accessibilityControl);
      return this;
    }
    /**
     * Remove accessibilityControl property from the builder.
     * If this property is repeatable, all instances are removed.
     * @return this builder instance
     */
    @NotNull public Builder removeAccessibilityControl() {
      removeValue("accessibilityControl");
      return this;
    }
    /**
     * Get currently set value for accessibilityControl property in this builder.
     * @return previously set value or {@code null}. If multiple values have been 
     * set to this property, then {@link java.util.Collection} instance will be 
     * returned.
     */
    @Nullable public java.lang.Object getAccessibilityControl() {
      return myData.get("accessibilityControl");
    }
    /**
     * The work that this work has been translated from. e.g. 物种起源 is a translationOf &ldquo;On the Origin of Species&rdquo;
     * @param creativeWork value to set
     * @return this builder instance
     */
    @NotNull public Builder translationOfWork(@NotNull CreativeWork creativeWork) {
      putValue("translationOfWork", creativeWork);
      return this;
    }
    /**
     * The work that this work has been translated from. e.g. 物种起源 is a translationOf &ldquo;On the Origin of Species&rdquo;
     * @param creativeWork value to set
     * @return this builder instance
     */
    @NotNull public Builder translationOfWork(@NotNull CreativeWork.Builder creativeWork) {
      putValue("translationOfWork", creativeWork.build());
      return this;
    }
    /**
     * Remove translationOfWork property from the builder.
     * If this property is repeatable, all instances are removed.
     * @return this builder instance
     */
    @NotNull public Builder removeTranslationOfWork() {
      removeValue("translationOfWork");
      return this;
    }
    /**
     * Get currently set value for translationOfWork property in this builder.
     * @return previously set value or {@code null}. If multiple values have been 
     * set to this property, then {@link java.util.Collection} instance will be 
     * returned.
     */
    @Nullable public java.lang.Object getTranslationOfWork() {
      return myData.get("translationOfWork");
    }
    /**
     * A work that is a translation of the content of this work. e.g. 西遊記 has an English workTranslation &ldquo;Journey to the West&rdquo;,a German workTranslation &ldquo;Monkeys Pilgerfahrt&rdquo; and a Vietnamese  translation T&acirc;y du k&yacute; b&igrave;nh khảo.
     * @param creativeWork value to set
     * @return this builder instance
     */
    @NotNull public Builder workTranslation(@NotNull CreativeWork creativeWork) {
      putValue("workTranslation", creativeWork);
      return this;
    }
    /**
     * A work that is a translation of the content of this work. e.g. 西遊記 has an English workTranslation &ldquo;Journey to the West&rdquo;,a German workTranslation &ldquo;Monkeys Pilgerfahrt&rdquo; and a Vietnamese  translation T&acirc;y du k&yacute; b&igrave;nh khảo.
     * @param creativeWork value to set
     * @return this builder instance
     */
    @NotNull public Builder workTranslation(@NotNull CreativeWork.Builder creativeWork) {
      putValue("workTranslation", creativeWork.build());
      return this;
    }
    /**
     * Remove workTranslation property from the builder.
     * If this property is repeatable, all instances are removed.
     * @return this builder instance
     */
    @NotNull public Builder removeWorkTranslation() {
      removeValue("workTranslation");
      return this;
    }
    /**
     * Get currently set value for workTranslation property in this builder.
     * @return previously set value or {@code null}. If multiple values have been 
     * set to this property, then {@link java.util.Collection} instance will be 
     * returned.
     */
    @Nullable public java.lang.Object getWorkTranslation() {
      return myData.get("workTranslation");
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
     * The subject matter of the content.
     * @param thing value to set
     * @return this builder instance
     */
    @NotNull public Builder about(@NotNull Thing thing) {
      putValue("about", thing);
      return this;
    }
    /**
     * The subject matter of the content.
     * @param thing value to set
     * @return this builder instance
     */
    @NotNull public Builder about(@NotNull Thing.Builder thing) {
      putValue("about", thing.build());
      return this;
    }
    /**
     * Remove about property from the builder.
     * If this property is repeatable, all instances are removed.
     * @return this builder instance
     */
    @NotNull public Builder removeAbout() {
      removeValue("about");
      return this;
    }
    /**
     * Get currently set value for about property in this builder.
     * @return previously set value or {@code null}. If multiple values have been 
     * set to this property, then {@link java.util.Collection} instance will be 
     * returned.
     */
    @Nullable public java.lang.Object getAbout() {
      return myData.get("about");
    }
    /**
     * Indicates the primary entity described in some page or other CreativeWork.
     * @param about value to set
     * @return this builder instance
     */
    @NotNull public Builder mainEntity(@NotNull About about) {
      putValue("mainEntity", about);
      return this;
    }
    /**
     * Indicates the primary entity described in some page or other CreativeWork.
     * @param about value to set
     * @return this builder instance
     */
    @NotNull public Builder mainEntity(@NotNull About.Builder about) {
      putValue("mainEntity", about.build());
      return this;
    }
    /**
     * Indicates the primary entity described in some page or other CreativeWork.
     * @param thing value to set
     * @return this builder instance
     */
    @NotNull public Builder mainEntity(@NotNull Thing thing) {
      putValue("mainEntity", thing);
      return this;
    }
    /**
     * Indicates the primary entity described in some page or other CreativeWork.
     * @param thing value to set
     * @return this builder instance
     */
    @NotNull public Builder mainEntity(@NotNull Thing.Builder thing) {
      putValue("mainEntity", thing.build());
      return this;
    }
    /**
     * Remove mainEntity property from the builder.
     * If this property is repeatable, all instances are removed.
     * @return this builder instance
     */
    @NotNull public Builder removeMainEntity() {
      removeValue("mainEntity");
      return this;
    }
    /**
     * Get currently set value for mainEntity property in this builder.
     * @return previously set value or {@code null}. If multiple values have been 
     * set to this property, then {@link java.util.Collection} instance will be 
     * returned.
     */
    @Nullable public java.lang.Object getMainEntity() {
      return myData.get("mainEntity");
    }
    /**
     * The Event where the CreativeWork was recorded. The CreativeWork may capture all or part of the event.
     * @param event value to set
     * @return this builder instance
     */
    @NotNull public Builder recordedAt(@NotNull Event event) {
      putValue("recordedAt", event);
      return this;
    }
    /**
     * The Event where the CreativeWork was recorded. The CreativeWork may capture all or part of the event.
     * @param event value to set
     * @return this builder instance
     */
    @NotNull public Builder recordedAt(@NotNull Event.Builder event) {
      putValue("recordedAt", event.build());
      return this;
    }
    /**
     * Remove recordedAt property from the builder.
     * If this property is repeatable, all instances are removed.
     * @return this builder instance
     */
    @NotNull public Builder removeRecordedAt() {
      removeValue("recordedAt");
      return this;
    }
    /**
     * Get currently set value for recordedAt property in this builder.
     * @return previously set value or {@code null}. If multiple values have been 
     * set to this property, then {@link java.util.Collection} instance will be 
     * returned.
     */
    @Nullable public java.lang.Object getRecordedAt() {
      return myData.get("recordedAt");
    }
    /**
     * A creative work that this work is an example/instance/realization/derivation of.
     * @param creativeWork value to set
     * @return this builder instance
     */
    @NotNull public Builder exampleOfWork(@NotNull CreativeWork creativeWork) {
      putValue("exampleOfWork", creativeWork);
      return this;
    }
    /**
     * A creative work that this work is an example/instance/realization/derivation of.
     * @param creativeWork value to set
     * @return this builder instance
     */
    @NotNull public Builder exampleOfWork(@NotNull CreativeWork.Builder creativeWork) {
      putValue("exampleOfWork", creativeWork.build());
      return this;
    }
    /**
     * Remove exampleOfWork property from the builder.
     * If this property is repeatable, all instances are removed.
     * @return this builder instance
     */
    @NotNull public Builder removeExampleOfWork() {
      removeValue("exampleOfWork");
      return this;
    }
    /**
     * Get currently set value for exampleOfWork property in this builder.
     * @return previously set value or {@code null}. If multiple values have been 
     * set to this property, then {@link java.util.Collection} instance will be 
     * returned.
     */
    @Nullable public java.lang.Object getExampleOfWork() {
      return myData.get("exampleOfWork");
    }
    /**
     * The location depicted or described in the content. For example, the location in a photograph or painting.
     * @param contentLocation value to set
     * @return this builder instance
     */
    @NotNull public Builder contentLocation(@NotNull ContentLocation contentLocation) {
      putValue("contentLocation", contentLocation);
      return this;
    }
    /**
     * Remove contentLocation property from the builder.
     * If this property is repeatable, all instances are removed.
     * @return this builder instance
     */
    @NotNull public Builder removeContentLocation() {
      removeValue("contentLocation");
      return this;
    }
    /**
     * Get currently set value for contentLocation property in this builder.
     * @return previously set value or {@code null}. If multiple values have been 
     * set to this property, then {@link java.util.Collection} instance will be 
     * returned.
     */
    @Nullable public java.lang.Object getContentLocation() {
      return myData.get("contentLocation");
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
