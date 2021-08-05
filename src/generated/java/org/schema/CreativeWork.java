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
 * The most generic kind of creative work, including books, movies, photographs, software programs, etc.Source: http://www.w3.org/wiki/WebSchemas/SchemaDotOrgSources#source_rNews
 */
public class CreativeWork extends Thing implements WorkFeatured, Step {
  /**
   * Indicates (by URL or string) a particular version of a schema used in some CreativeWork. For example, a document could declare a schemaVersion using an URL such as http://schema.org/version/2.0/ if precise indication of schema version was required by some application. 
   */
  @JsonIgnore public String getSchemaVersion() {
    return (String) getValue("schemaVersion");
  }
  /**
   * Indicates (by URL or string) a particular version of a schema used in some CreativeWork. For example, a document could declare a schemaVersion using an URL such as http://schema.org/version/2.0/ if precise indication of schema version was required by some application. 
   */
  @JsonIgnore public Collection<String> getSchemaVersions() {
    final Object current = myData.get("schemaVersion");
    if (current == null) return Collections.emptyList();
    if (current instanceof Collection) {
      return (Collection<String>) current;
    }
    return Arrays.asList((String) current);
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
  @JsonIgnore public Collection<String> getAccessibilityAPIs() {
    final Object current = myData.get("accessibilityAPI");
    if (current == null) return Collections.emptyList();
    if (current instanceof Collection) {
      return (Collection<String>) current;
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
  @JsonIgnore public Collection<String> getAccessibilityControls() {
    final Object current = myData.get("accessibilityControl");
    if (current == null) return Collections.emptyList();
    if (current instanceof Collection) {
      return (Collection<String>) current;
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
  @JsonIgnore public Collection<String> getAccessibilityFeatures() {
    final Object current = myData.get("accessibilityFeature");
    if (current == null) return Collections.emptyList();
    if (current instanceof Collection) {
      return (Collection<String>) current;
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
  @JsonIgnore public Collection<String> getAccessibilityHazards() {
    final Object current = myData.get("accessibilityHazard");
    if (current == null) return Collections.emptyList();
    if (current instanceof Collection) {
      return (Collection<String>) current;
    }
    return Arrays.asList((String) current);
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
  @JsonIgnore public Collection<Person> getAccountablePersons() {
    final Object current = myData.get("accountablePerson");
    if (current == null) return Collections.emptyList();
    if (current instanceof Collection) {
      return (Collection<Person>) current;
    }
    return Arrays.asList((Person) current);
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
  @JsonIgnore public Collection<AggregateRating> getAggregateRatings() {
    final Object current = myData.get("aggregateRating");
    if (current == null) return Collections.emptyList();
    if (current instanceof Collection) {
      return (Collection<AggregateRating>) current;
    }
    return Arrays.asList((AggregateRating) current);
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
  @JsonIgnore public Collection<String> getAlternativeHeadlines() {
    final Object current = myData.get("alternativeHeadline");
    if (current == null) return Collections.emptyList();
    if (current instanceof Collection) {
      return (Collection<String>) current;
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
  @JsonIgnore public Collection<MediaObject> getAssociatedMedias() {
    final Object current = myData.get("associatedMedia");
    if (current == null) return Collections.emptyList();
    if (current instanceof Collection) {
      return (Collection<MediaObject>) current;
    }
    return Arrays.asList((MediaObject) current);
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
  @JsonIgnore public Collection<Audience> getAudiences() {
    final Object current = myData.get("audience");
    if (current == null) return Collections.emptyList();
    if (current instanceof Collection) {
      return (Collection<Audience>) current;
    }
    return Arrays.asList((Audience) current);
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
  @JsonIgnore public Collection<AudioObject> getAudioAudioObjects() {
    final Object current = myData.get("audio");
    if (current == null) return Collections.emptyList();
    if (current instanceof Collection) {
      return (Collection<AudioObject>) current;
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
  @JsonIgnore public Collection<Clip> getAudioClips() {
    final Object current = myData.get("audio");
    if (current == null) return Collections.emptyList();
    if (current instanceof Collection) {
      return (Collection<Clip>) current;
    }
    return Arrays.asList((Clip) current);
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
  @JsonIgnore public Collection<Organization> getAuthorOrganizations() {
    final Object current = myData.get("author");
    if (current == null) return Collections.emptyList();
    if (current instanceof Collection) {
      return (Collection<Organization>) current;
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
  @JsonIgnore public Collection<Person> getAuthorPersons() {
    final Object current = myData.get("author");
    if (current == null) return Collections.emptyList();
    if (current instanceof Collection) {
      return (Collection<Person>) current;
    }
    return Arrays.asList((Person) current);
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
  @JsonIgnore public Collection<String> getAwards() {
    final Object current = myData.get("award");
    if (current == null) return Collections.emptyList();
    if (current instanceof Collection) {
      return (Collection<String>) current;
    }
    return Arrays.asList((String) current);
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
  @JsonIgnore public Collection<CreativeWork> getCitationCreativeWorks() {
    final Object current = myData.get("citation");
    if (current == null) return Collections.emptyList();
    if (current instanceof Collection) {
      return (Collection<CreativeWork>) current;
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
  @JsonIgnore public Collection<String> getCitationStrings() {
    final Object current = myData.get("citation");
    if (current == null) return Collections.emptyList();
    if (current instanceof Collection) {
      return (Collection<String>) current;
    }
    return Arrays.asList((String) current);
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
  @JsonIgnore public Collection<Comment> getComments() {
    final Object current = myData.get("comment");
    if (current == null) return Collections.emptyList();
    if (current instanceof Collection) {
      return (Collection<Comment>) current;
    }
    return Arrays.asList((Comment) current);
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
  @JsonIgnore public Collection<Place> getLocationCreateds() {
    final Object current = myData.get("locationCreated");
    if (current == null) return Collections.emptyList();
    if (current instanceof Collection) {
      return (Collection<Place>) current;
    }
    return Arrays.asList((Place) current);
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
  @JsonIgnore public Collection<Rating> getContentRatingRatings() {
    final Object current = myData.get("contentRating");
    if (current == null) return Collections.emptyList();
    if (current instanceof Collection) {
      return (Collection<Rating>) current;
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
  @JsonIgnore public Collection<String> getContentRatingStrings() {
    final Object current = myData.get("contentRating");
    if (current == null) return Collections.emptyList();
    if (current instanceof Collection) {
      return (Collection<String>) current;
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
  @JsonIgnore public Collection<Organization> getContributorOrganizations() {
    final Object current = myData.get("contributor");
    if (current == null) return Collections.emptyList();
    if (current instanceof Collection) {
      return (Collection<Organization>) current;
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
  @JsonIgnore public Collection<Person> getContributorPersons() {
    final Object current = myData.get("contributor");
    if (current == null) return Collections.emptyList();
    if (current instanceof Collection) {
      return (Collection<Person>) current;
    }
    return Arrays.asList((Person) current);
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
  @JsonIgnore public Collection<Organization> getCopyrightHolderOrganizations() {
    final Object current = myData.get("copyrightHolder");
    if (current == null) return Collections.emptyList();
    if (current instanceof Collection) {
      return (Collection<Organization>) current;
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
  @JsonIgnore public Collection<Person> getCopyrightHolderPersons() {
    final Object current = myData.get("copyrightHolder");
    if (current == null) return Collections.emptyList();
    if (current instanceof Collection) {
      return (Collection<Person>) current;
    }
    return Arrays.asList((Person) current);
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
  @JsonIgnore public Collection<Integer> getCopyrightYearIntegers() {
    final Object current = myData.get("copyrightYear");
    if (current == null) return Collections.emptyList();
    if (current instanceof Collection) {
      return (Collection<Integer>) current;
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
  @JsonIgnore public Collection<Long> getCopyrightYearLongs() {
    final Object current = myData.get("copyrightYear");
    if (current == null) return Collections.emptyList();
    if (current instanceof Collection) {
      return (Collection<Long>) current;
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
  @JsonIgnore public Collection<Float> getCopyrightYearFloats() {
    final Object current = myData.get("copyrightYear");
    if (current == null) return Collections.emptyList();
    if (current instanceof Collection) {
      return (Collection<Float>) current;
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
  @JsonIgnore public Collection<Double> getCopyrightYearDoubles() {
    final Object current = myData.get("copyrightYear");
    if (current == null) return Collections.emptyList();
    if (current instanceof Collection) {
      return (Collection<Double>) current;
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
  @JsonIgnore public Collection<String> getCopyrightYearStrings() {
    final Object current = myData.get("copyrightYear");
    if (current == null) return Collections.emptyList();
    if (current instanceof Collection) {
      return (Collection<String>) current;
    }
    return Arrays.asList((String) current);
  }
  /**
   * The creator/author of this CreativeWork. This is the same as the Author property for CreativeWork.
   */
  @JsonIgnore public Organization getCreatorOrganization() {
    return (Organization) getValue("creator");
  }
  /**
   * The creator/author of this CreativeWork. This is the same as the Author property for CreativeWork.
   */
  @JsonIgnore public Collection<Organization> getCreatorOrganizations() {
    final Object current = myData.get("creator");
    if (current == null) return Collections.emptyList();
    if (current instanceof Collection) {
      return (Collection<Organization>) current;
    }
    return Arrays.asList((Organization) current);
  }
  /**
   * The creator/author of this CreativeWork. This is the same as the Author property for CreativeWork.
   */
  @JsonIgnore public Person getCreatorPerson() {
    return (Person) getValue("creator");
  }
  /**
   * The creator/author of this CreativeWork. This is the same as the Author property for CreativeWork.
   */
  @JsonIgnore public Collection<Person> getCreatorPersons() {
    final Object current = myData.get("creator");
    if (current == null) return Collections.emptyList();
    if (current instanceof Collection) {
      return (Collection<Person>) current;
    }
    return Arrays.asList((Person) current);
  }
  /**
   * The date on which the CreativeWork was created or the item was added to a DataFeed.
   */
  @JsonIgnore public java.util.Date getDateCreated() {
    return (java.util.Date) getValue("dateCreated");
  }
  /**
   * The date on which the CreativeWork was created or the item was added to a DataFeed.
   */
  @JsonIgnore public Collection<java.util.Date> getDateCreateds() {
    final Object current = myData.get("dateCreated");
    if (current == null) return Collections.emptyList();
    if (current instanceof Collection) {
      return (Collection<java.util.Date>) current;
    }
    return Arrays.asList((java.util.Date) current);
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
  @JsonIgnore public Collection<java.util.Date> getDateModifieds() {
    final Object current = myData.get("dateModified");
    if (current == null) return Collections.emptyList();
    if (current instanceof Collection) {
      return (Collection<java.util.Date>) current;
    }
    return Arrays.asList((java.util.Date) current);
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
  @JsonIgnore public Collection<java.util.Date> getDatePublisheds() {
    final Object current = myData.get("datePublished");
    if (current == null) return Collections.emptyList();
    if (current instanceof Collection) {
      return (Collection<java.util.Date>) current;
    }
    return Arrays.asList((java.util.Date) current);
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
  @JsonIgnore public Collection<String> getDiscussionUrls() {
    final Object current = myData.get("discussionUrl");
    if (current == null) return Collections.emptyList();
    if (current instanceof Collection) {
      return (Collection<String>) current;
    }
    return Arrays.asList((String) current);
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
  @JsonIgnore public Collection<Person> getEditors() {
    final Object current = myData.get("editor");
    if (current == null) return Collections.emptyList();
    if (current instanceof Collection) {
      return (Collection<Person>) current;
    }
    return Arrays.asList((Person) current);
  }
  /**
   * An alignment to an established educational framework.
   */
  @JsonIgnore public AlignmentObject getEducationalAlignment() {
    return (AlignmentObject) getValue("educationalAlignment");
  }
  /**
   * An alignment to an established educational framework.
   */
  @JsonIgnore public Collection<AlignmentObject> getEducationalAlignments() {
    final Object current = myData.get("educationalAlignment");
    if (current == null) return Collections.emptyList();
    if (current instanceof Collection) {
      return (Collection<AlignmentObject>) current;
    }
    return Arrays.asList((AlignmentObject) current);
  }
  /**
   * The purpose of a work in the context of education; for example, 'assignment', 'group work'.
   */
  @JsonIgnore public String getEducationalUse() {
    return (String) getValue("educationalUse");
  }
  /**
   * The purpose of a work in the context of education; for example, 'assignment', 'group work'.
   */
  @JsonIgnore public Collection<String> getEducationalUses() {
    final Object current = myData.get("educationalUse");
    if (current == null) return Collections.emptyList();
    if (current instanceof Collection) {
      return (Collection<String>) current;
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
  @JsonIgnore public Collection<MediaObject> getEncodings() {
    final Object current = myData.get("encoding");
    if (current == null) return Collections.emptyList();
    if (current instanceof Collection) {
      return (Collection<MediaObject>) current;
    }
    return Arrays.asList((MediaObject) current);
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
  @JsonIgnore public Collection<String> getEncodingFormats() {
    final Object current = myData.get("encodingFormat");
    if (current == null) return Collections.emptyList();
    if (current instanceof Collection) {
      return (Collection<String>) current;
    }
    return Arrays.asList((String) current);
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
  @JsonIgnore public Collection<java.util.Date> getExpiress() {
    final Object current = myData.get("expires");
    if (current == null) return Collections.emptyList();
    if (current instanceof Collection) {
      return (Collection<java.util.Date>) current;
    }
    return Arrays.asList((java.util.Date) current);
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
  @JsonIgnore public Collection<Boolean> getIsAccessibleForFrees() {
    final Object current = myData.get("isAccessibleForFree");
    if (current == null) return Collections.emptyList();
    if (current instanceof Collection) {
      return (Collection<Boolean>) current;
    }
    return Arrays.asList((Boolean) current);
  }
  /**
   * Genre of the creative work, broadcast channel or group.
   */
  @JsonIgnore public String getGenre() {
    return (String) getValue("genre");
  }
  /**
   * Genre of the creative work, broadcast channel or group.
   */
  @JsonIgnore public Collection<String> getGenres() {
    final Object current = myData.get("genre");
    if (current == null) return Collections.emptyList();
    if (current instanceof Collection) {
      return (Collection<String>) current;
    }
    return Arrays.asList((String) current);
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
  @JsonIgnore public Collection<String> getHeadlines() {
    final Object current = myData.get("headline");
    if (current == null) return Collections.emptyList();
    if (current instanceof Collection) {
      return (Collection<String>) current;
    }
    return Arrays.asList((String) current);
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
  @JsonIgnore public Collection<Language> getInLanguageLanguages() {
    final Object current = myData.get("inLanguage");
    if (current == null) return Collections.emptyList();
    if (current instanceof Collection) {
      return (Collection<Language>) current;
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
  @JsonIgnore public Collection<String> getInLanguageStrings() {
    final Object current = myData.get("inLanguage");
    if (current == null) return Collections.emptyList();
    if (current instanceof Collection) {
      return (Collection<String>) current;
    }
    return Arrays.asList((String) current);
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
  @JsonIgnore public Collection<String> getInteractivityTypes() {
    final Object current = myData.get("interactivityType");
    if (current == null) return Collections.emptyList();
    if (current instanceof Collection) {
      return (Collection<String>) current;
    }
    return Arrays.asList((String) current);
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
  @JsonIgnore public Collection<CreativeWork> getIsBasedOnCreativeWorks() {
    final Object current = myData.get("isBasedOn");
    if (current == null) return Collections.emptyList();
    if (current instanceof Collection) {
      return (Collection<CreativeWork>) current;
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
  @JsonIgnore public Collection<Product> getIsBasedOnProducts() {
    final Object current = myData.get("isBasedOn");
    if (current == null) return Collections.emptyList();
    if (current instanceof Collection) {
      return (Collection<Product>) current;
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
  @JsonIgnore public Collection<String> getIsBasedOnStrings() {
    final Object current = myData.get("isBasedOn");
    if (current == null) return Collections.emptyList();
    if (current instanceof Collection) {
      return (Collection<String>) current;
    }
    return Arrays.asList((String) current);
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
  @JsonIgnore public Collection<Boolean> getIsFamilyFriendlys() {
    final Object current = myData.get("isFamilyFriendly");
    if (current == null) return Collections.emptyList();
    if (current instanceof Collection) {
      return (Collection<Boolean>) current;
    }
    return Arrays.asList((Boolean) current);
  }
  /**
   * Keywords or tags used to describe this content. Multiple entries in a keywords list are typically delimited by commas.
   */
  @JsonIgnore public String getKeywords() {
    return (String) getValue("keywords");
  }
  /**
   * Keywords or tags used to describe this content. Multiple entries in a keywords list are typically delimited by commas.
   */
  @JsonIgnore public Collection<String> getKeywordss() {
    final Object current = myData.get("keywords");
    if (current == null) return Collections.emptyList();
    if (current instanceof Collection) {
      return (Collection<String>) current;
    }
    return Arrays.asList((String) current);
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
  @JsonIgnore public Collection<CreativeWork> getLicenseCreativeWorks() {
    final Object current = myData.get("license");
    if (current == null) return Collections.emptyList();
    if (current instanceof Collection) {
      return (Collection<CreativeWork>) current;
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
  @JsonIgnore public Collection<String> getLicenseStrings() {
    final Object current = myData.get("license");
    if (current == null) return Collections.emptyList();
    if (current instanceof Collection) {
      return (Collection<String>) current;
    }
    return Arrays.asList((String) current);
  }
  /**
   * The predominant type or kind characterizing the learning resource. For example, 'presentation', 'handout'.
   */
  @JsonIgnore public String getLearningResourceType() {
    return (String) getValue("learningResourceType");
  }
  /**
   * The predominant type or kind characterizing the learning resource. For example, 'presentation', 'handout'.
   */
  @JsonIgnore public Collection<String> getLearningResourceTypes() {
    final Object current = myData.get("learningResourceType");
    if (current == null) return Collections.emptyList();
    if (current instanceof Collection) {
      return (Collection<String>) current;
    }
    return Arrays.asList((String) current);
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
  @JsonIgnore public Collection<About> getMainEntityAbouts() {
    final Object current = myData.get("mainEntity");
    if (current == null) return Collections.emptyList();
    if (current instanceof Collection) {
      return (Collection<About>) current;
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
  @JsonIgnore public Collection<Thing> getMainEntityThings() {
    final Object current = myData.get("mainEntity");
    if (current == null) return Collections.emptyList();
    if (current instanceof Collection) {
      return (Collection<Thing>) current;
    }
    return Arrays.asList((Thing) current);
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
  @JsonIgnore public Collection<Thing> getMentionss() {
    final Object current = myData.get("mentions");
    if (current == null) return Collections.emptyList();
    if (current instanceof Collection) {
      return (Collection<Thing>) current;
    }
    return Arrays.asList((Thing) current);
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
  @JsonIgnore public Collection<Demand> getOffersDemands() {
    final Object current = myData.get("offers");
    if (current == null) return Collections.emptyList();
    if (current instanceof Collection) {
      return (Collection<Demand>) current;
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
  @JsonIgnore public Collection<Offer> getOffersOffers() {
    final Object current = myData.get("offers");
    if (current == null) return Collections.emptyList();
    if (current instanceof Collection) {
      return (Collection<Offer>) current;
    }
    return Arrays.asList((Offer) current);
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
  @JsonIgnore public Collection<Organization> getProducerOrganizations() {
    final Object current = myData.get("producer");
    if (current == null) return Collections.emptyList();
    if (current instanceof Collection) {
      return (Collection<Organization>) current;
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
  @JsonIgnore public Collection<Person> getProducerPersons() {
    final Object current = myData.get("producer");
    if (current == null) return Collections.emptyList();
    if (current instanceof Collection) {
      return (Collection<Person>) current;
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
  @JsonIgnore public Collection<PublicationEvent> getPublications() {
    final Object current = myData.get("publication");
    if (current == null) return Collections.emptyList();
    if (current instanceof Collection) {
      return (Collection<PublicationEvent>) current;
    }
    return Arrays.asList((PublicationEvent) current);
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
  @JsonIgnore public Collection<Organization> getPublisherOrganizations() {
    final Object current = myData.get("publisher");
    if (current == null) return Collections.emptyList();
    if (current instanceof Collection) {
      return (Collection<Organization>) current;
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
  @JsonIgnore public Collection<Person> getPublisherPersons() {
    final Object current = myData.get("publisher");
    if (current == null) return Collections.emptyList();
    if (current instanceof Collection) {
      return (Collection<Person>) current;
    }
    return Arrays.asList((Person) current);
  }
  /**
   * The publishingPrinciples property indicates (typically via [[URL]]) a document describing the editorial principles of an [[Organization]] (or individual e.g. a [[Person]] writing a blog) that relate to their activities as a publisher, e.g. ethics or diversity policies. When applied to a [[CreativeWork]] (e.g. [[NewsArticle]]) the principles are those of the party primarily responsible for the creation of the [[CreativeWork]].
   * 
   * While such policies are most typically expressed in natural language, sometimes related information (e.g. indicating a [[funder]]) can be expressed using schema.org terminology.
   * 
   */
  @JsonIgnore public CreativeWork getPublishingPrinciplesCreativeWork() {
    return (CreativeWork) getValue("publishingPrinciples");
  }
  /**
   * The publishingPrinciples property indicates (typically via [[URL]]) a document describing the editorial principles of an [[Organization]] (or individual e.g. a [[Person]] writing a blog) that relate to their activities as a publisher, e.g. ethics or diversity policies. When applied to a [[CreativeWork]] (e.g. [[NewsArticle]]) the principles are those of the party primarily responsible for the creation of the [[CreativeWork]].
   * 
   * While such policies are most typically expressed in natural language, sometimes related information (e.g. indicating a [[funder]]) can be expressed using schema.org terminology.
   * 
   */
  @JsonIgnore public Collection<CreativeWork> getPublishingPrinciplesCreativeWorks() {
    final Object current = myData.get("publishingPrinciples");
    if (current == null) return Collections.emptyList();
    if (current instanceof Collection) {
      return (Collection<CreativeWork>) current;
    }
    return Arrays.asList((CreativeWork) current);
  }
  /**
   * The publishingPrinciples property indicates (typically via [[URL]]) a document describing the editorial principles of an [[Organization]] (or individual e.g. a [[Person]] writing a blog) that relate to their activities as a publisher, e.g. ethics or diversity policies. When applied to a [[CreativeWork]] (e.g. [[NewsArticle]]) the principles are those of the party primarily responsible for the creation of the [[CreativeWork]].
   * 
   * While such policies are most typically expressed in natural language, sometimes related information (e.g. indicating a [[funder]]) can be expressed using schema.org terminology.
   * 
   */
  @JsonIgnore public String getPublishingPrinciplesString() {
    return (String) getValue("publishingPrinciples");
  }
  /**
   * The publishingPrinciples property indicates (typically via [[URL]]) a document describing the editorial principles of an [[Organization]] (or individual e.g. a [[Person]] writing a blog) that relate to their activities as a publisher, e.g. ethics or diversity policies. When applied to a [[CreativeWork]] (e.g. [[NewsArticle]]) the principles are those of the party primarily responsible for the creation of the [[CreativeWork]].
   * 
   * While such policies are most typically expressed in natural language, sometimes related information (e.g. indicating a [[funder]]) can be expressed using schema.org terminology.
   * 
   */
  @JsonIgnore public Collection<String> getPublishingPrinciplesStrings() {
    final Object current = myData.get("publishingPrinciples");
    if (current == null) return Collections.emptyList();
    if (current instanceof Collection) {
      return (Collection<String>) current;
    }
    return Arrays.asList((String) current);
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
  @JsonIgnore public Collection<Event> getRecordedAts() {
    final Object current = myData.get("recordedAt");
    if (current == null) return Collections.emptyList();
    if (current instanceof Collection) {
      return (Collection<Event>) current;
    }
    return Arrays.asList((Event) current);
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
  @JsonIgnore public Collection<Review> getReviews() {
    final Object current = myData.get("review");
    if (current == null) return Collections.emptyList();
    if (current instanceof Collection) {
      return (Collection<Review>) current;
    }
    return Arrays.asList((Review) current);
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
  @JsonIgnore public Collection<Organization> getSourceOrganizations() {
    final Object current = myData.get("sourceOrganization");
    if (current == null) return Collections.emptyList();
    if (current instanceof Collection) {
      return (Collection<Organization>) current;
    }
    return Arrays.asList((Organization) current);
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
  @JsonIgnore public Collection<Place> getSpatials() {
    final Object current = myData.get("spatial");
    if (current == null) return Collections.emptyList();
    if (current instanceof Collection) {
      return (Collection<Place>) current;
    }
    return Arrays.asList((Place) current);
  }
  /**
   * The spatialCoverage of a CreativeWork indicates the place(s) which are the focus of the content. It is a subproperty of
   *       contentLocation intended primarily for more technical and detailed materials. For example with a Dataset, it indicates
   *       areas that the dataset describes: a dataset of New York weather would have spatialCoverage which was the place: the state of New York.
   */
  @JsonIgnore public Place getSpatialCoverage() {
    return (Place) getValue("spatialCoverage");
  }
  /**
   * The spatialCoverage of a CreativeWork indicates the place(s) which are the focus of the content. It is a subproperty of
   *       contentLocation intended primarily for more technical and detailed materials. For example with a Dataset, it indicates
   *       areas that the dataset describes: a dataset of New York weather would have spatialCoverage which was the place: the state of New York.
   */
  @JsonIgnore public Collection<Place> getSpatialCoverages() {
    final Object current = myData.get("spatialCoverage");
    if (current == null) return Collections.emptyList();
    if (current instanceof Collection) {
      return (Collection<Place>) current;
    }
    return Arrays.asList((Place) current);
  }
  /**
   * A person or organization that supports (sponsors) something through some kind of financial contribution.
   */
  @JsonIgnore public Organization getFunderOrganization() {
    return (Organization) getValue("funder");
  }
  /**
   * A person or organization that supports (sponsors) something through some kind of financial contribution.
   */
  @JsonIgnore public Collection<Organization> getFunderOrganizations() {
    final Object current = myData.get("funder");
    if (current == null) return Collections.emptyList();
    if (current instanceof Collection) {
      return (Collection<Organization>) current;
    }
    return Arrays.asList((Organization) current);
  }
  /**
   * A person or organization that supports (sponsors) something through some kind of financial contribution.
   */
  @JsonIgnore public Person getFunderPerson() {
    return (Person) getValue("funder");
  }
  /**
   * A person or organization that supports (sponsors) something through some kind of financial contribution.
   */
  @JsonIgnore public Collection<Person> getFunderPersons() {
    final Object current = myData.get("funder");
    if (current == null) return Collections.emptyList();
    if (current instanceof Collection) {
      return (Collection<Person>) current;
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
  @JsonIgnore public Collection<String> getTemporalCoverageStrings() {
    final Object current = myData.get("temporalCoverage");
    if (current == null) return Collections.emptyList();
    if (current instanceof Collection) {
      return (Collection<String>) current;
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
  @JsonIgnore public Collection<java.util.Date> getTemporalCoverageDates() {
    final Object current = myData.get("temporalCoverage");
    if (current == null) return Collections.emptyList();
    if (current instanceof Collection) {
      return (Collection<java.util.Date>) current;
    }
    return Arrays.asList((java.util.Date) current);
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
  @JsonIgnore public Collection<String> getTemporalStrings() {
    final Object current = myData.get("temporal");
    if (current == null) return Collections.emptyList();
    if (current instanceof Collection) {
      return (Collection<String>) current;
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
  @JsonIgnore public Collection<java.util.Date> getTemporalDates() {
    final Object current = myData.get("temporal");
    if (current == null) return Collections.emptyList();
    if (current instanceof Collection) {
      return (Collection<java.util.Date>) current;
    }
    return Arrays.asList((java.util.Date) current);
  }
  /**
   * The textual content of this CreativeWork.
   */
  @JsonIgnore public String getText() {
    return (String) getValue("text");
  }
  /**
   * The textual content of this CreativeWork.
   */
  @JsonIgnore public Collection<String> getTexts() {
    final Object current = myData.get("text");
    if (current == null) return Collections.emptyList();
    if (current instanceof Collection) {
      return (Collection<String>) current;
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
  @JsonIgnore public Collection<String> getThumbnailUrls() {
    final Object current = myData.get("thumbnailUrl");
    if (current == null) return Collections.emptyList();
    if (current instanceof Collection) {
      return (Collection<String>) current;
    }
    return Arrays.asList((String) current);
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
  @JsonIgnore public Collection<Duration> getTimeRequireds() {
    final Object current = myData.get("timeRequired");
    if (current == null) return Collections.emptyList();
    if (current instanceof Collection) {
      return (Collection<Duration>) current;
    }
    return Arrays.asList((Duration) current);
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
  @JsonIgnore public Collection<String> getTypicalAgeRanges() {
    final Object current = myData.get("typicalAgeRange");
    if (current == null) return Collections.emptyList();
    if (current instanceof Collection) {
      return (Collection<String>) current;
    }
    return Arrays.asList((String) current);
  }
  /**
   * The version of the CreativeWork embodied by a specified resource.
   */
  @JsonIgnore public Integer getVersionInteger() {
    return (Integer) getValue("version");
  }
  /**
   * The version of the CreativeWork embodied by a specified resource.
   */
  @JsonIgnore public Collection<Integer> getVersionIntegers() {
    final Object current = myData.get("version");
    if (current == null) return Collections.emptyList();
    if (current instanceof Collection) {
      return (Collection<Integer>) current;
    }
    return Arrays.asList((Integer) current);
  }
  /**
   * The version of the CreativeWork embodied by a specified resource.
   */
  @JsonIgnore public Long getVersionLong() {
    return (Long) getValue("version");
  }
  /**
   * The version of the CreativeWork embodied by a specified resource.
   */
  @JsonIgnore public Collection<Long> getVersionLongs() {
    final Object current = myData.get("version");
    if (current == null) return Collections.emptyList();
    if (current instanceof Collection) {
      return (Collection<Long>) current;
    }
    return Arrays.asList((Long) current);
  }
  /**
   * The version of the CreativeWork embodied by a specified resource.
   */
  @JsonIgnore public Float getVersionFloat() {
    return (Float) getValue("version");
  }
  /**
   * The version of the CreativeWork embodied by a specified resource.
   */
  @JsonIgnore public Collection<Float> getVersionFloats() {
    final Object current = myData.get("version");
    if (current == null) return Collections.emptyList();
    if (current instanceof Collection) {
      return (Collection<Float>) current;
    }
    return Arrays.asList((Float) current);
  }
  /**
   * The version of the CreativeWork embodied by a specified resource.
   */
  @JsonIgnore public Double getVersionDouble() {
    return (Double) getValue("version");
  }
  /**
   * The version of the CreativeWork embodied by a specified resource.
   */
  @JsonIgnore public Collection<Double> getVersionDoubles() {
    final Object current = myData.get("version");
    if (current == null) return Collections.emptyList();
    if (current instanceof Collection) {
      return (Collection<Double>) current;
    }
    return Arrays.asList((Double) current);
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
  @JsonIgnore public Collection<String> getVersionStrings() {
    final Object current = myData.get("version");
    if (current == null) return Collections.emptyList();
    if (current instanceof Collection) {
      return (Collection<String>) current;
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
  @JsonIgnore public Collection<Clip> getVideoClips() {
    final Object current = myData.get("video");
    if (current == null) return Collections.emptyList();
    if (current instanceof Collection) {
      return (Collection<Clip>) current;
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
  @JsonIgnore public Collection<VideoObject> getVideoVideoObjects() {
    final Object current = myData.get("video");
    if (current == null) return Collections.emptyList();
    if (current instanceof Collection) {
      return (Collection<VideoObject>) current;
    }
    return Arrays.asList((VideoObject) current);
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
  @JsonIgnore public Collection<Organization> getProviderOrganizations() {
    final Object current = myData.get("provider");
    if (current == null) return Collections.emptyList();
    if (current instanceof Collection) {
      return (Collection<Organization>) current;
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
  @JsonIgnore public Collection<Person> getProviderPersons() {
    final Object current = myData.get("provider");
    if (current == null) return Collections.emptyList();
    if (current instanceof Collection) {
      return (Collection<Person>) current;
    }
    return Arrays.asList((Person) current);
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
  @JsonIgnore public Collection<Integer> getCommentCounts() {
    final Object current = myData.get("commentCount");
    if (current == null) return Collections.emptyList();
    if (current instanceof Collection) {
      return (Collection<Integer>) current;
    }
    return Arrays.asList((Integer) current);
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
  @JsonIgnore public Collection<HasPart> getHasParts() {
    final Object current = myData.get("hasPart");
    if (current == null) return Collections.emptyList();
    if (current instanceof Collection) {
      return (Collection<HasPart>) current;
    }
    return Arrays.asList((HasPart) current);
  }
  /**
   * Example/instance/realization/derivation of the concept of this creative work. eg. The paperback edition, first edition, or eBook.
   */
  @JsonIgnore public CreativeWork getWorkExample() {
    return (CreativeWork) getValue("workExample");
  }
  /**
   * Example/instance/realization/derivation of the concept of this creative work. eg. The paperback edition, first edition, or eBook.
   */
  @JsonIgnore public Collection<CreativeWork> getWorkExamples() {
    final Object current = myData.get("workExample");
    if (current == null) return Collections.emptyList();
    if (current instanceof Collection) {
      return (Collection<CreativeWork>) current;
    }
    return Arrays.asList((CreativeWork) current);
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
  @JsonIgnore public Collection<CreativeWork> getExampleOfWorks() {
    final Object current = myData.get("exampleOfWork");
    if (current == null) return Collections.emptyList();
    if (current instanceof Collection) {
      return (Collection<CreativeWork>) current;
    }
    return Arrays.asList((CreativeWork) current);
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
  @JsonIgnore public Collection<Person> getCharacters() {
    final Object current = myData.get("character");
    if (current == null) return Collections.emptyList();
    if (current instanceof Collection) {
      return (Collection<Person>) current;
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
  @JsonIgnore public Collection<Organization> getTranslatorOrganizations() {
    final Object current = myData.get("translator");
    if (current == null) return Collections.emptyList();
    if (current instanceof Collection) {
      return (Collection<Organization>) current;
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
  @JsonIgnore public Collection<Person> getTranslatorPersons() {
    final Object current = myData.get("translator");
    if (current == null) return Collections.emptyList();
    if (current instanceof Collection) {
      return (Collection<Person>) current;
    }
    return Arrays.asList((Person) current);
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
  @JsonIgnore public Collection<PublicationEvent> getReleasedEvents() {
    final Object current = myData.get("releasedEvent");
    if (current == null) return Collections.emptyList();
    if (current instanceof Collection) {
      return (Collection<PublicationEvent>) current;
    }
    return Arrays.asList((PublicationEvent) current);
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
  @JsonIgnore public Collection<InteractionCounter> getInteractionStatistics() {
    final Object current = myData.get("interactionStatistic");
    if (current == null) return Collections.emptyList();
    if (current instanceof Collection) {
      return (Collection<InteractionCounter>) current;
    }
    return Arrays.asList((InteractionCounter) current);
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
  @JsonIgnore public Collection<String> getAccessModes() {
    final Object current = myData.get("accessMode");
    if (current == null) return Collections.emptyList();
    if (current instanceof Collection) {
      return (Collection<String>) current;
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
  @JsonIgnore public Collection<ItemList> getAccessModeSufficients() {
    final Object current = myData.get("accessModeSufficient");
    if (current == null) return Collections.emptyList();
    if (current instanceof Collection) {
      return (Collection<ItemList>) current;
    }
    return Arrays.asList((ItemList) current);
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
  @JsonIgnore public Collection<String> getAccessibilitySummarys() {
    final Object current = myData.get("accessibilitySummary");
    if (current == null) return Collections.emptyList();
    if (current instanceof Collection) {
      return (Collection<String>) current;
    }
    return Arrays.asList((String) current);
  }
  protected CreativeWork(java.util.Map<String,Object> data) {
    super(data);
  }
  
  /**
   * Builder for {@link CreativeWork}
   */
  public static class Builder extends Thing.Builder {
    public Builder(@NotNull HashMap<String,Object> data) {
      super(data);
    }
    @NotNull public CreativeWork build() {
      return new CreativeWork(myData);
    }
    /**
     * Indicates (by URL or string) a particular version of a schema used in some CreativeWork. For example, a document could declare a schemaVersion using an URL such as http://schema.org/version/2.0/ if precise indication of schema version was required by some application. 
     */
    @NotNull public Builder schemaVersion(@NotNull String schemaVersion) {
      putValue("schemaVersion", schemaVersion);
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
     * Identifies input methods that are sufficient to fully control the described resource ([WebSchemas wiki lists possible values](http://www.w3.org/wiki/WebSchemas/Accessibility)).
     */
    @NotNull public Builder accessibilityControl(@NotNull String accessibilityControl) {
      putValue("accessibilityControl", accessibilityControl);
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
     * A secondary title of the CreativeWork.
     */
    @NotNull public Builder alternativeHeadline(@NotNull String alternativeHeadline) {
      putValue("alternativeHeadline", alternativeHeadline);
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
     * An award won by or for this item.
     */
    @NotNull public Builder award(@NotNull String award) {
      putValue("award", award);
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
     * The creator/author of this CreativeWork. This is the same as the Author property for CreativeWork.
     */
    @NotNull public Builder creator(@NotNull Organization organization) {
      putValue("creator", organization);
      return this;
    }
    /**
     * The creator/author of this CreativeWork. This is the same as the Author property for CreativeWork.
     */
    @NotNull public Builder creator(@NotNull Organization.Builder organization) {
      putValue("creator", organization.build());
      return this;
    }
    /**
     * The creator/author of this CreativeWork. This is the same as the Author property for CreativeWork.
     */
    @NotNull public Builder creator(@NotNull Person person) {
      putValue("creator", person);
      return this;
    }
    /**
     * The creator/author of this CreativeWork. This is the same as the Author property for CreativeWork.
     */
    @NotNull public Builder creator(@NotNull Person.Builder person) {
      putValue("creator", person.build());
      return this;
    }
    /**
     * The date on which the CreativeWork was created or the item was added to a DataFeed.
     */
    @NotNull public Builder dateCreated(@NotNull java.util.Date date) {
      putValue("dateCreated", date);
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
     * Date of first broadcast/publication.
     */
    @NotNull public Builder datePublished(@NotNull java.util.Date date) {
      putValue("datePublished", date);
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
     * An alignment to an established educational framework.
     */
    @NotNull public Builder educationalAlignment(@NotNull AlignmentObject alignmentObject) {
      putValue("educationalAlignment", alignmentObject);
      return this;
    }
    /**
     * An alignment to an established educational framework.
     */
    @NotNull public Builder educationalAlignment(@NotNull AlignmentObject.Builder alignmentObject) {
      putValue("educationalAlignment", alignmentObject.build());
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
     * Date the content expires and is no longer useful or available. For example a [[VideoObject]] or [[NewsArticle]] whose availability or relevance is time-limited, or a [[ClaimReview]] fact check whose publisher wants to indicate that it may no longer be relevant (or helpful to highlight) after some date.
     */
    @NotNull public Builder expires(@NotNull java.util.Date date) {
      putValue("expires", date);
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
     * Genre of the creative work, broadcast channel or group.
     */
    @NotNull public Builder genre(@NotNull String genre) {
      putValue("genre", genre);
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
     * The predominant mode of learning supported by the learning resource. Acceptable values are 'active', 'expositive', or 'mixed'.
     */
    @NotNull public Builder interactivityType(@NotNull String interactivityType) {
      putValue("interactivityType", interactivityType);
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
     * Indicates whether this content is family friendly.
     */
    @NotNull public Builder isFamilyFriendly(@NotNull Boolean isFamilyFriendly) {
      putValue("isFamilyFriendly", isFamilyFriendly);
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
     * The predominant type or kind characterizing the learning resource. For example, 'presentation', 'handout'.
     */
    @NotNull public Builder learningResourceType(@NotNull String learningResourceType) {
      putValue("learningResourceType", learningResourceType);
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
     * The publishingPrinciples property indicates (typically via [[URL]]) a document describing the editorial principles of an [[Organization]] (or individual e.g. a [[Person]] writing a blog) that relate to their activities as a publisher, e.g. ethics or diversity policies. When applied to a [[CreativeWork]] (e.g. [[NewsArticle]]) the principles are those of the party primarily responsible for the creation of the [[CreativeWork]].
     * 
     * While such policies are most typically expressed in natural language, sometimes related information (e.g. indicating a [[funder]]) can be expressed using schema.org terminology.
     * 
     */
    @NotNull public Builder publishingPrinciples(@NotNull CreativeWork creativeWork) {
      putValue("publishingPrinciples", creativeWork);
      return this;
    }
    /**
     * The publishingPrinciples property indicates (typically via [[URL]]) a document describing the editorial principles of an [[Organization]] (or individual e.g. a [[Person]] writing a blog) that relate to their activities as a publisher, e.g. ethics or diversity policies. When applied to a [[CreativeWork]] (e.g. [[NewsArticle]]) the principles are those of the party primarily responsible for the creation of the [[CreativeWork]].
     * 
     * While such policies are most typically expressed in natural language, sometimes related information (e.g. indicating a [[funder]]) can be expressed using schema.org terminology.
     * 
     */
    @NotNull public Builder publishingPrinciples(@NotNull CreativeWork.Builder creativeWork) {
      putValue("publishingPrinciples", creativeWork.build());
      return this;
    }
    /**
     * The publishingPrinciples property indicates (typically via [[URL]]) a document describing the editorial principles of an [[Organization]] (or individual e.g. a [[Person]] writing a blog) that relate to their activities as a publisher, e.g. ethics or diversity policies. When applied to a [[CreativeWork]] (e.g. [[NewsArticle]]) the principles are those of the party primarily responsible for the creation of the [[CreativeWork]].
     * 
     * While such policies are most typically expressed in natural language, sometimes related information (e.g. indicating a [[funder]]) can be expressed using schema.org terminology.
     * 
     */
    @NotNull public Builder publishingPrinciples(@NotNull String publishingPrinciples) {
      putValue("publishingPrinciples", publishingPrinciples);
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
     * The spatialCoverage of a CreativeWork indicates the place(s) which are the focus of the content. It is a subproperty of
     *       contentLocation intended primarily for more technical and detailed materials. For example with a Dataset, it indicates
     *       areas that the dataset describes: a dataset of New York weather would have spatialCoverage which was the place: the state of New York.
     */
    @NotNull public Builder spatialCoverage(@NotNull Place place) {
      putValue("spatialCoverage", place);
      return this;
    }
    /**
     * The spatialCoverage of a CreativeWork indicates the place(s) which are the focus of the content. It is a subproperty of
     *       contentLocation intended primarily for more technical and detailed materials. For example with a Dataset, it indicates
     *       areas that the dataset describes: a dataset of New York weather would have spatialCoverage which was the place: the state of New York.
     */
    @NotNull public Builder spatialCoverage(@NotNull Place.Builder place) {
      putValue("spatialCoverage", place.build());
      return this;
    }
    /**
     * A person or organization that supports (sponsors) something through some kind of financial contribution.
     */
    @NotNull public Builder funder(@NotNull Organization organization) {
      putValue("funder", organization);
      return this;
    }
    /**
     * A person or organization that supports (sponsors) something through some kind of financial contribution.
     */
    @NotNull public Builder funder(@NotNull Organization.Builder organization) {
      putValue("funder", organization.build());
      return this;
    }
    /**
     * A person or organization that supports (sponsors) something through some kind of financial contribution.
     */
    @NotNull public Builder funder(@NotNull Person person) {
      putValue("funder", person);
      return this;
    }
    /**
     * A person or organization that supports (sponsors) something through some kind of financial contribution.
     */
    @NotNull public Builder funder(@NotNull Person.Builder person) {
      putValue("funder", person.build());
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
     * The textual content of this CreativeWork.
     */
    @NotNull public Builder text(@NotNull String text) {
      putValue("text", text);
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
     * Approximate or typical time it takes to work with or through this learning resource for the typical intended target audience, e.g. 'PT30M', 'PT1H25M'.
     */
    @NotNull public Builder timeRequired(@NotNull Duration duration) {
      putValue("timeRequired", duration);
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
     * The version of the CreativeWork embodied by a specified resource.
     */
    @NotNull public Builder version(@NotNull Integer integer) {
      putValue("version", integer);
      return this;
    }
    /**
     * The version of the CreativeWork embodied by a specified resource.
     */
    @NotNull public Builder version(@NotNull Long version) {
      putValue("version", version);
      return this;
    }
    /**
     * The version of the CreativeWork embodied by a specified resource.
     */
    @NotNull public Builder version(@NotNull Float version) {
      putValue("version", version);
      return this;
    }
    /**
     * The version of the CreativeWork embodied by a specified resource.
     */
    @NotNull public Builder version(@NotNull Double version) {
      putValue("version", version);
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
     * The number of comments this CreativeWork (e.g. Article, Question or Answer) has received. This is most applicable to works published in Web sites with commenting system; additional comments may exist elsewhere.
     */
    @NotNull public Builder commentCount(@NotNull Integer integer) {
      putValue("commentCount", integer);
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
     * Example/instance/realization/derivation of the concept of this creative work. eg. The paperback edition, first edition, or eBook.
     */
    @NotNull public Builder workExample(@NotNull CreativeWork creativeWork) {
      putValue("workExample", creativeWork);
      return this;
    }
    /**
     * Example/instance/realization/derivation of the concept of this creative work. eg. The paperback edition, first edition, or eBook.
     */
    @NotNull public Builder workExample(@NotNull CreativeWork.Builder creativeWork) {
      putValue("workExample", creativeWork.build());
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
     * The human sensory perceptual system or cognitive faculty through which a person may process or perceive information. Expected values include: auditory, tactile, textual, visual, colorDependent, chartOnVisual, chemOnVisual, diagramOnVisual, mathOnVisual, musicOnVisual, textOnVisual.
     *       
     */
    @NotNull public Builder accessMode(@NotNull String accessMode) {
      putValue("accessMode", accessMode);
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
     * A human-readable summary of specific accessibility features or deficiencies, consistent with the other accessibility metadata but expressing subtleties such as &quot;short descriptions are present but long descriptions will be needed for non-visual users&quot; or &quot;short descriptions are present and no long descriptions are needed.&quot;
     */
    @NotNull public Builder accessibilitySummary(@NotNull String accessibilitySummary) {
      putValue("accessibilitySummary", accessibilitySummary);
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
     * An alias for the item.
     */
    @NotNull public Builder alternateName(@NotNull String alternateName) {
      putValue("alternateName", alternateName);
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
    /**
     * The name of the item.
     */
    @NotNull public Builder name(@NotNull String name) {
      putValue("name", name);
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
     * URL of the item.
     */
    @NotNull public Builder url(@NotNull String url) {
      putValue("url", url);
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
      if ("schemaVersion".equals(key) && value instanceof String) { this.schemaVersion((String)value); return; }
      if ("schemaVersions".equals(key) && value instanceof String) { this.schemaVersion((String)value); return; }
      if ("accessibilityAPI".equals(key) && value instanceof String) { this.accessibilityAPI((String)value); return; }
      if ("accessibilityAPIs".equals(key) && value instanceof String) { this.accessibilityAPI((String)value); return; }
      if ("accessibilityControl".equals(key) && value instanceof String) { this.accessibilityControl((String)value); return; }
      if ("accessibilityControls".equals(key) && value instanceof String) { this.accessibilityControl((String)value); return; }
      if ("accessibilityFeature".equals(key) && value instanceof String) { this.accessibilityFeature((String)value); return; }
      if ("accessibilityFeatures".equals(key) && value instanceof String) { this.accessibilityFeature((String)value); return; }
      if ("accessibilityHazard".equals(key) && value instanceof String) { this.accessibilityHazard((String)value); return; }
      if ("accessibilityHazards".equals(key) && value instanceof String) { this.accessibilityHazard((String)value); return; }
      if ("accountablePerson".equals(key) && value instanceof Person) { this.accountablePerson((Person)value); return; }
      if ("accountablePersons".equals(key) && value instanceof Person) { this.accountablePerson((Person)value); return; }
      if ("aggregateRating".equals(key) && value instanceof AggregateRating) { this.aggregateRating((AggregateRating)value); return; }
      if ("aggregateRatings".equals(key) && value instanceof AggregateRating) { this.aggregateRating((AggregateRating)value); return; }
      if ("alternativeHeadline".equals(key) && value instanceof String) { this.alternativeHeadline((String)value); return; }
      if ("alternativeHeadlines".equals(key) && value instanceof String) { this.alternativeHeadline((String)value); return; }
      if ("associatedMedia".equals(key) && value instanceof MediaObject) { this.associatedMedia((MediaObject)value); return; }
      if ("associatedMedias".equals(key) && value instanceof MediaObject) { this.associatedMedia((MediaObject)value); return; }
      if ("audience".equals(key) && value instanceof Audience) { this.audience((Audience)value); return; }
      if ("audiences".equals(key) && value instanceof Audience) { this.audience((Audience)value); return; }
      if ("audio".equals(key) && value instanceof AudioObject) { this.audio((AudioObject)value); return; }
      if ("audios".equals(key) && value instanceof AudioObject) { this.audio((AudioObject)value); return; }
      if ("audio".equals(key) && value instanceof Clip) { this.audio((Clip)value); return; }
      if ("audios".equals(key) && value instanceof Clip) { this.audio((Clip)value); return; }
      if ("author".equals(key) && value instanceof Organization) { this.author((Organization)value); return; }
      if ("authors".equals(key) && value instanceof Organization) { this.author((Organization)value); return; }
      if ("author".equals(key) && value instanceof Person) { this.author((Person)value); return; }
      if ("authors".equals(key) && value instanceof Person) { this.author((Person)value); return; }
      if ("award".equals(key) && value instanceof String) { this.award((String)value); return; }
      if ("awards".equals(key) && value instanceof String) { this.award((String)value); return; }
      if ("citation".equals(key) && value instanceof CreativeWork) { this.citation((CreativeWork)value); return; }
      if ("citations".equals(key) && value instanceof CreativeWork) { this.citation((CreativeWork)value); return; }
      if ("citation".equals(key) && value instanceof String) { this.citation((String)value); return; }
      if ("citations".equals(key) && value instanceof String) { this.citation((String)value); return; }
      if ("comment".equals(key) && value instanceof Comment) { this.comment((Comment)value); return; }
      if ("comments".equals(key) && value instanceof Comment) { this.comment((Comment)value); return; }
      if ("locationCreated".equals(key) && value instanceof Place) { this.locationCreated((Place)value); return; }
      if ("locationCreateds".equals(key) && value instanceof Place) { this.locationCreated((Place)value); return; }
      if ("contentRating".equals(key) && value instanceof Rating) { this.contentRating((Rating)value); return; }
      if ("contentRatings".equals(key) && value instanceof Rating) { this.contentRating((Rating)value); return; }
      if ("contentRating".equals(key) && value instanceof String) { this.contentRating((String)value); return; }
      if ("contentRatings".equals(key) && value instanceof String) { this.contentRating((String)value); return; }
      if ("contributor".equals(key) && value instanceof Organization) { this.contributor((Organization)value); return; }
      if ("contributors".equals(key) && value instanceof Organization) { this.contributor((Organization)value); return; }
      if ("contributor".equals(key) && value instanceof Person) { this.contributor((Person)value); return; }
      if ("contributors".equals(key) && value instanceof Person) { this.contributor((Person)value); return; }
      if ("copyrightHolder".equals(key) && value instanceof Organization) { this.copyrightHolder((Organization)value); return; }
      if ("copyrightHolders".equals(key) && value instanceof Organization) { this.copyrightHolder((Organization)value); return; }
      if ("copyrightHolder".equals(key) && value instanceof Person) { this.copyrightHolder((Person)value); return; }
      if ("copyrightHolders".equals(key) && value instanceof Person) { this.copyrightHolder((Person)value); return; }
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
      if ("creator".equals(key) && value instanceof Organization) { this.creator((Organization)value); return; }
      if ("creators".equals(key) && value instanceof Organization) { this.creator((Organization)value); return; }
      if ("creator".equals(key) && value instanceof Person) { this.creator((Person)value); return; }
      if ("creators".equals(key) && value instanceof Person) { this.creator((Person)value); return; }
      if ("dateCreated".equals(key) && value instanceof java.util.Date) { this.dateCreated((java.util.Date)value); return; }
      if ("dateCreateds".equals(key) && value instanceof java.util.Date) { this.dateCreated((java.util.Date)value); return; }
      if ("dateModified".equals(key) && value instanceof java.util.Date) { this.dateModified((java.util.Date)value); return; }
      if ("dateModifieds".equals(key) && value instanceof java.util.Date) { this.dateModified((java.util.Date)value); return; }
      if ("datePublished".equals(key) && value instanceof java.util.Date) { this.datePublished((java.util.Date)value); return; }
      if ("datePublisheds".equals(key) && value instanceof java.util.Date) { this.datePublished((java.util.Date)value); return; }
      if ("discussionUrl".equals(key) && value instanceof String) { this.discussionUrl((String)value); return; }
      if ("discussionUrls".equals(key) && value instanceof String) { this.discussionUrl((String)value); return; }
      if ("editor".equals(key) && value instanceof Person) { this.editor((Person)value); return; }
      if ("editors".equals(key) && value instanceof Person) { this.editor((Person)value); return; }
      if ("educationalAlignment".equals(key) && value instanceof AlignmentObject) { this.educationalAlignment((AlignmentObject)value); return; }
      if ("educationalAlignments".equals(key) && value instanceof AlignmentObject) { this.educationalAlignment((AlignmentObject)value); return; }
      if ("educationalUse".equals(key) && value instanceof String) { this.educationalUse((String)value); return; }
      if ("educationalUses".equals(key) && value instanceof String) { this.educationalUse((String)value); return; }
      if ("encoding".equals(key) && value instanceof MediaObject) { this.encoding((MediaObject)value); return; }
      if ("encodings".equals(key) && value instanceof MediaObject) { this.encoding((MediaObject)value); return; }
      if ("encodingFormat".equals(key) && value instanceof String) { this.encodingFormat((String)value); return; }
      if ("encodingFormats".equals(key) && value instanceof String) { this.encodingFormat((String)value); return; }
      if ("expires".equals(key) && value instanceof java.util.Date) { this.expires((java.util.Date)value); return; }
      if ("expiress".equals(key) && value instanceof java.util.Date) { this.expires((java.util.Date)value); return; }
      if ("isAccessibleForFree".equals(key) && value instanceof Boolean) { this.isAccessibleForFree((Boolean)value); return; }
      if ("isAccessibleForFrees".equals(key) && value instanceof Boolean) { this.isAccessibleForFree((Boolean)value); return; }
      if ("genre".equals(key) && value instanceof String) { this.genre((String)value); return; }
      if ("genres".equals(key) && value instanceof String) { this.genre((String)value); return; }
      if ("headline".equals(key) && value instanceof String) { this.headline((String)value); return; }
      if ("headlines".equals(key) && value instanceof String) { this.headline((String)value); return; }
      if ("inLanguage".equals(key) && value instanceof Language) { this.inLanguage((Language)value); return; }
      if ("inLanguages".equals(key) && value instanceof Language) { this.inLanguage((Language)value); return; }
      if ("inLanguage".equals(key) && value instanceof String) { this.inLanguage((String)value); return; }
      if ("inLanguages".equals(key) && value instanceof String) { this.inLanguage((String)value); return; }
      if ("interactivityType".equals(key) && value instanceof String) { this.interactivityType((String)value); return; }
      if ("interactivityTypes".equals(key) && value instanceof String) { this.interactivityType((String)value); return; }
      if ("isBasedOn".equals(key) && value instanceof CreativeWork) { this.isBasedOn((CreativeWork)value); return; }
      if ("isBasedOns".equals(key) && value instanceof CreativeWork) { this.isBasedOn((CreativeWork)value); return; }
      if ("isBasedOn".equals(key) && value instanceof Product) { this.isBasedOn((Product)value); return; }
      if ("isBasedOns".equals(key) && value instanceof Product) { this.isBasedOn((Product)value); return; }
      if ("isBasedOn".equals(key) && value instanceof String) { this.isBasedOn((String)value); return; }
      if ("isBasedOns".equals(key) && value instanceof String) { this.isBasedOn((String)value); return; }
      if ("isFamilyFriendly".equals(key) && value instanceof Boolean) { this.isFamilyFriendly((Boolean)value); return; }
      if ("isFamilyFriendlys".equals(key) && value instanceof Boolean) { this.isFamilyFriendly((Boolean)value); return; }
      if ("keywords".equals(key) && value instanceof String) { this.keywords((String)value); return; }
      if ("keywordss".equals(key) && value instanceof String) { this.keywords((String)value); return; }
      if ("license".equals(key) && value instanceof CreativeWork) { this.license((CreativeWork)value); return; }
      if ("licenses".equals(key) && value instanceof CreativeWork) { this.license((CreativeWork)value); return; }
      if ("license".equals(key) && value instanceof String) { this.license((String)value); return; }
      if ("licenses".equals(key) && value instanceof String) { this.license((String)value); return; }
      if ("learningResourceType".equals(key) && value instanceof String) { this.learningResourceType((String)value); return; }
      if ("learningResourceTypes".equals(key) && value instanceof String) { this.learningResourceType((String)value); return; }
      if ("mainEntity".equals(key) && value instanceof About) { this.mainEntity((About)value); return; }
      if ("mainEntitys".equals(key) && value instanceof About) { this.mainEntity((About)value); return; }
      if ("mainEntity".equals(key) && value instanceof Thing) { this.mainEntity((Thing)value); return; }
      if ("mainEntitys".equals(key) && value instanceof Thing) { this.mainEntity((Thing)value); return; }
      if ("mentions".equals(key) && value instanceof Thing) { this.mentions((Thing)value); return; }
      if ("mentionss".equals(key) && value instanceof Thing) { this.mentions((Thing)value); return; }
      if ("offers".equals(key) && value instanceof Demand) { this.offers((Demand)value); return; }
      if ("offerss".equals(key) && value instanceof Demand) { this.offers((Demand)value); return; }
      if ("offers".equals(key) && value instanceof Offer) { this.offers((Offer)value); return; }
      if ("offerss".equals(key) && value instanceof Offer) { this.offers((Offer)value); return; }
      if ("producer".equals(key) && value instanceof Organization) { this.producer((Organization)value); return; }
      if ("producers".equals(key) && value instanceof Organization) { this.producer((Organization)value); return; }
      if ("producer".equals(key) && value instanceof Person) { this.producer((Person)value); return; }
      if ("producers".equals(key) && value instanceof Person) { this.producer((Person)value); return; }
      if ("publication".equals(key) && value instanceof PublicationEvent) { this.publication((PublicationEvent)value); return; }
      if ("publications".equals(key) && value instanceof PublicationEvent) { this.publication((PublicationEvent)value); return; }
      if ("publisher".equals(key) && value instanceof Organization) { this.publisher((Organization)value); return; }
      if ("publishers".equals(key) && value instanceof Organization) { this.publisher((Organization)value); return; }
      if ("publisher".equals(key) && value instanceof Person) { this.publisher((Person)value); return; }
      if ("publishers".equals(key) && value instanceof Person) { this.publisher((Person)value); return; }
      if ("publishingPrinciples".equals(key) && value instanceof CreativeWork) { this.publishingPrinciples((CreativeWork)value); return; }
      if ("publishingPrincipless".equals(key) && value instanceof CreativeWork) { this.publishingPrinciples((CreativeWork)value); return; }
      if ("publishingPrinciples".equals(key) && value instanceof String) { this.publishingPrinciples((String)value); return; }
      if ("publishingPrincipless".equals(key) && value instanceof String) { this.publishingPrinciples((String)value); return; }
      if ("recordedAt".equals(key) && value instanceof Event) { this.recordedAt((Event)value); return; }
      if ("recordedAts".equals(key) && value instanceof Event) { this.recordedAt((Event)value); return; }
      if ("review".equals(key) && value instanceof Review) { this.review((Review)value); return; }
      if ("reviews".equals(key) && value instanceof Review) { this.review((Review)value); return; }
      if ("sourceOrganization".equals(key) && value instanceof Organization) { this.sourceOrganization((Organization)value); return; }
      if ("sourceOrganizations".equals(key) && value instanceof Organization) { this.sourceOrganization((Organization)value); return; }
      if ("spatial".equals(key) && value instanceof Place) { this.spatial((Place)value); return; }
      if ("spatials".equals(key) && value instanceof Place) { this.spatial((Place)value); return; }
      if ("spatialCoverage".equals(key) && value instanceof Place) { this.spatialCoverage((Place)value); return; }
      if ("spatialCoverages".equals(key) && value instanceof Place) { this.spatialCoverage((Place)value); return; }
      if ("funder".equals(key) && value instanceof Organization) { this.funder((Organization)value); return; }
      if ("funders".equals(key) && value instanceof Organization) { this.funder((Organization)value); return; }
      if ("funder".equals(key) && value instanceof Person) { this.funder((Person)value); return; }
      if ("funders".equals(key) && value instanceof Person) { this.funder((Person)value); return; }
      if ("temporalCoverage".equals(key) && value instanceof String) { this.temporalCoverage((String)value); return; }
      if ("temporalCoverages".equals(key) && value instanceof String) { this.temporalCoverage((String)value); return; }
      if ("temporalCoverage".equals(key) && value instanceof java.util.Date) { this.temporalCoverage((java.util.Date)value); return; }
      if ("temporalCoverages".equals(key) && value instanceof java.util.Date) { this.temporalCoverage((java.util.Date)value); return; }
      if ("temporal".equals(key) && value instanceof String) { this.temporal((String)value); return; }
      if ("temporals".equals(key) && value instanceof String) { this.temporal((String)value); return; }
      if ("temporal".equals(key) && value instanceof java.util.Date) { this.temporal((java.util.Date)value); return; }
      if ("temporals".equals(key) && value instanceof java.util.Date) { this.temporal((java.util.Date)value); return; }
      if ("text".equals(key) && value instanceof String) { this.text((String)value); return; }
      if ("texts".equals(key) && value instanceof String) { this.text((String)value); return; }
      if ("thumbnailUrl".equals(key) && value instanceof String) { this.thumbnailUrl((String)value); return; }
      if ("thumbnailUrls".equals(key) && value instanceof String) { this.thumbnailUrl((String)value); return; }
      if ("timeRequired".equals(key) && value instanceof Duration) { this.timeRequired((Duration)value); return; }
      if ("timeRequireds".equals(key) && value instanceof Duration) { this.timeRequired((Duration)value); return; }
      if ("typicalAgeRange".equals(key) && value instanceof String) { this.typicalAgeRange((String)value); return; }
      if ("typicalAgeRanges".equals(key) && value instanceof String) { this.typicalAgeRange((String)value); return; }
      if ("version".equals(key) && value instanceof Integer) { this.version((Integer)value); return; }
      if ("versions".equals(key) && value instanceof Integer) { this.version((Integer)value); return; }
      if ("version".equals(key) && value instanceof Long) { this.version((Long)value); return; }
      if ("versions".equals(key) && value instanceof Long) { this.version((Long)value); return; }
      if ("version".equals(key) && value instanceof Float) { this.version((Float)value); return; }
      if ("versions".equals(key) && value instanceof Float) { this.version((Float)value); return; }
      if ("version".equals(key) && value instanceof Double) { this.version((Double)value); return; }
      if ("versions".equals(key) && value instanceof Double) { this.version((Double)value); return; }
      if ("version".equals(key) && value instanceof String) { this.version((String)value); return; }
      if ("versions".equals(key) && value instanceof String) { this.version((String)value); return; }
      if ("video".equals(key) && value instanceof Clip) { this.video((Clip)value); return; }
      if ("videos".equals(key) && value instanceof Clip) { this.video((Clip)value); return; }
      if ("video".equals(key) && value instanceof VideoObject) { this.video((VideoObject)value); return; }
      if ("videos".equals(key) && value instanceof VideoObject) { this.video((VideoObject)value); return; }
      if ("provider".equals(key) && value instanceof Organization) { this.provider((Organization)value); return; }
      if ("providers".equals(key) && value instanceof Organization) { this.provider((Organization)value); return; }
      if ("provider".equals(key) && value instanceof Person) { this.provider((Person)value); return; }
      if ("providers".equals(key) && value instanceof Person) { this.provider((Person)value); return; }
      if ("commentCount".equals(key) && value instanceof Integer) { this.commentCount((Integer)value); return; }
      if ("commentCounts".equals(key) && value instanceof Integer) { this.commentCount((Integer)value); return; }
      if ("hasPart".equals(key) && value instanceof HasPart) { this.hasPart((HasPart)value); return; }
      if ("hasParts".equals(key) && value instanceof HasPart) { this.hasPart((HasPart)value); return; }
      if ("workExample".equals(key) && value instanceof CreativeWork) { this.workExample((CreativeWork)value); return; }
      if ("workExamples".equals(key) && value instanceof CreativeWork) { this.workExample((CreativeWork)value); return; }
      if ("exampleOfWork".equals(key) && value instanceof CreativeWork) { this.exampleOfWork((CreativeWork)value); return; }
      if ("exampleOfWorks".equals(key) && value instanceof CreativeWork) { this.exampleOfWork((CreativeWork)value); return; }
      if ("character".equals(key) && value instanceof Person) { this.character((Person)value); return; }
      if ("characters".equals(key) && value instanceof Person) { this.character((Person)value); return; }
      if ("translator".equals(key) && value instanceof Organization) { this.translator((Organization)value); return; }
      if ("translators".equals(key) && value instanceof Organization) { this.translator((Organization)value); return; }
      if ("translator".equals(key) && value instanceof Person) { this.translator((Person)value); return; }
      if ("translators".equals(key) && value instanceof Person) { this.translator((Person)value); return; }
      if ("releasedEvent".equals(key) && value instanceof PublicationEvent) { this.releasedEvent((PublicationEvent)value); return; }
      if ("releasedEvents".equals(key) && value instanceof PublicationEvent) { this.releasedEvent((PublicationEvent)value); return; }
      if ("interactionStatistic".equals(key) && value instanceof InteractionCounter) { this.interactionStatistic((InteractionCounter)value); return; }
      if ("interactionStatistics".equals(key) && value instanceof InteractionCounter) { this.interactionStatistic((InteractionCounter)value); return; }
      if ("accessMode".equals(key) && value instanceof String) { this.accessMode((String)value); return; }
      if ("accessModes".equals(key) && value instanceof String) { this.accessMode((String)value); return; }
      if ("accessModeSufficient".equals(key) && value instanceof ItemList) { this.accessModeSufficient((ItemList)value); return; }
      if ("accessModeSufficients".equals(key) && value instanceof ItemList) { this.accessModeSufficient((ItemList)value); return; }
      if ("accessibilitySummary".equals(key) && value instanceof String) { this.accessibilitySummary((String)value); return; }
      if ("accessibilitySummarys".equals(key) && value instanceof String) { this.accessibilitySummary((String)value); return; }
      super.fromMap(key, value);
    }
  }
  
}
