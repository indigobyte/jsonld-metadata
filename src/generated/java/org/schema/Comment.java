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
 * A comment on an item - for example, a comment on a blog post. The comment's content is expressed via the &lt;a class=&quot;localLink&quot; href=&quot;http://schema.org/text&quot;&gt;text&lt;/a&gt; property, and its topic via &lt;a class=&quot;localLink&quot; href=&quot;http://schema.org/about&quot;&gt;about&lt;/a&gt;, properties shared with all CreativeWorks.
 */
public class Comment extends CreativeWork {
  /**
   * The number of upvotes this question, answer or comment has received from the community.
   */
  @JsonIgnore public Integer getUpvoteCount() {
    return (Integer) getValue("upvoteCount");
  }
  /**
   * The number of upvotes this question, answer or comment has received from the community.
   */
  @JsonIgnore public Collection<Integer> getUpvoteCounts() {
    final Object current = myData.get("upvoteCount");
    if (current == null) return Collections.emptyList();
    if (current instanceof Collection) {
      return (Collection<Integer>) current;
    }
    return Arrays.asList((Integer) current);
  }
  /**
   * The parent of a question, answer or item in general.
   */
  @JsonIgnore public Question getParentItem() {
    return (Question) getValue("parentItem");
  }
  /**
   * The parent of a question, answer or item in general.
   */
  @JsonIgnore public Collection<Question> getParentItems() {
    final Object current = myData.get("parentItem");
    if (current == null) return Collections.emptyList();
    if (current instanceof Collection) {
      return (Collection<Question>) current;
    }
    return Arrays.asList((Question) current);
  }
  /**
   * The number of downvotes this question, answer or comment has received from the community.
   */
  @JsonIgnore public Integer getDownvoteCount() {
    return (Integer) getValue("downvoteCount");
  }
  /**
   * The number of downvotes this question, answer or comment has received from the community.
   */
  @JsonIgnore public Collection<Integer> getDownvoteCounts() {
    final Object current = myData.get("downvoteCount");
    if (current == null) return Collections.emptyList();
    if (current instanceof Collection) {
      return (Collection<Integer>) current;
    }
    return Arrays.asList((Integer) current);
  }
  protected Comment(java.util.Map<String,Object> data) {
    super(data);
  }
  
  /**
   * Builder for {@link Comment}
   */
  public static class Builder extends CreativeWork.Builder {
    public Builder(@NotNull HashMap<String,Object> data) {
      super(data);
    }
    @NotNull public Comment build() {
      return new Comment(myData);
    }
    /**
     * The number of upvotes this question, answer or comment has received from the community.
     */
    @NotNull public Builder upvoteCount(@NotNull Integer integer) {
      putValue("upvoteCount", integer);
      return this;
    }
    /**
     * The parent of a question, answer or item in general.
     */
    @NotNull public Builder parentItem(@NotNull Question question) {
      putValue("parentItem", question);
      return this;
    }
    /**
     * The parent of a question, answer or item in general.
     */
    @NotNull public Builder parentItem(@NotNull Question.Builder question) {
      putValue("parentItem", question.build());
      return this;
    }
    /**
     * The number of downvotes this question, answer or comment has received from the community.
     */
    @NotNull public Builder downvoteCount(@NotNull Integer integer) {
      putValue("downvoteCount", integer);
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
     * Date of first broadcast/publication.
     */
    @NotNull public Builder datePublished(@NotNull java.util.Date date) {
      putValue("datePublished", date);
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
     * Media type typically expressed using a MIME format (see &lt;a href=&quot;http://www.iana.org/assignments/media-types/media-types.xhtml&quot;&gt;IANA site&lt;/a&gt; and &lt;a href=&quot;https://developer.mozilla.org/en-US/docs/Web/HTTP/Basics_of_HTTP/MIME_types&quot;&gt;MDN reference&lt;/a&gt;) e.g. application/zip for a SoftwareApplication binary, audio/mpeg for .mp3 etc.).&lt;br/&gt;&lt;br/&gt;
     * 
     * In cases where a &lt;a class=&quot;localLink&quot; href=&quot;http://schema.org/CreativeWork&quot;&gt;CreativeWork&lt;/a&gt; has several media type representations, &lt;a class=&quot;localLink&quot; href=&quot;http://schema.org/encoding&quot;&gt;encoding&lt;/a&gt; can be used to indicate each &lt;a class=&quot;localLink&quot; href=&quot;http://schema.org/MediaObject&quot;&gt;MediaObject&lt;/a&gt; alongside particular &lt;a class=&quot;localLink&quot; href=&quot;http://schema.org/encodingFormat&quot;&gt;encodingFormat&lt;/a&gt; information.&lt;br/&gt;&lt;br/&gt;
     * 
     * Unregistered or niche encoding and file formats can be indicated instead via the most appropriate URL, e.g. defining Web page or a Wikipedia/Wikidata entry.
     */
    @NotNull public Builder encodingFormat(@NotNull String encodingFormat) {
      putValue("encodingFormat", encodingFormat);
      return this;
    }
    /**
     * The human sensory perceptual system or cognitive faculty through which a person may process or perceive information. Expected values include: auditory, tactile, textual, visual, colorDependent, chartOnVisual, chemOnVisual, diagramOnVisual, mathOnVisual, musicOnVisual, textOnVisual.
     */
    @NotNull public Builder accessMode(@NotNull String accessMode) {
      putValue("accessMode", accessMode);
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
     * The schema.org &lt;a class=&quot;localLink&quot; href=&quot;http://schema.org/usageInfo&quot;&gt;usageInfo&lt;/a&gt; property indicates further information about a &lt;a class=&quot;localLink&quot; href=&quot;http://schema.org/CreativeWork&quot;&gt;CreativeWork&lt;/a&gt;. This property is applicable both to works that are freely available and to those that require payment or other transactions. It can reference additional information e.g. community expectations on preferred linking and citation conventions, as well as purchasing details. For something that can be commercially licensed, usageInfo can provide detailed, resource-specific information about licensing options.&lt;br/&gt;&lt;br/&gt;
     * 
     * This property can be used alongside the license property which indicates license(s) applicable to some piece of content. The usageInfo property can provide information about other licensing options, e.g. acquiring commercial usage rights for an image that is also available under non-commercial creative commons licenses.
     */
    @NotNull public Builder usageInfo(@NotNull UsageInfo usageInfo) {
      putValue("usageInfo", usageInfo);
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
     * The creator/author of this CreativeWork. This is the same as the Author property for CreativeWork.
     */
    @NotNull public Builder creator(@NotNull Creator creator) {
      putValue("creator", creator);
      return this;
    }
    /**
     * Identifies input methods that are sufficient to fully control the described resource (&lt;a href=&quot;http://www.w3.org/wiki/WebSchemas/Accessibility&quot;&gt;WebSchemas wiki lists possible values&lt;/a&gt;).
     */
    @NotNull public Builder accessibilityControl(@NotNull String accessibilityControl) {
      putValue("accessibilityControl", accessibilityControl);
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
     * Content features of the resource, such as accessible media, alternatives and supported enhancements for accessibility (&lt;a href=&quot;http://www.w3.org/wiki/WebSchemas/Accessibility&quot;&gt;WebSchemas wiki lists possible values&lt;/a&gt;).
     */
    @NotNull public Builder accessibilityFeature(@NotNull String accessibilityFeature) {
      putValue("accessibilityFeature", accessibilityFeature);
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
     * The date on which the CreativeWork was most recently modified or when the item's entry was modified within a DataFeed.
     */
    @NotNull public Builder dateModified(@NotNull java.util.Date date) {
      putValue("dateModified", date);
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
     * Indicates whether this content is family friendly.
     */
    @NotNull public Builder isFamilyFriendly(@NotNull Boolean isFamilyFriendly) {
      putValue("isFamilyFriendly", isFamilyFriendly);
      return this;
    }
    /**
     * Indicates the party responsible for generating and publishing the current structured data markup, typically in cases where the structured data is derived automatically from existing published content but published on a different site. For example, student projects and open data initiatives often re-publish existing content with more explicitly structured metadata. The
     * &lt;a class=&quot;localLink&quot; href=&quot;http://schema.org/sdPublisher&quot;&gt;sdPublisher&lt;/a&gt; property helps make such practices more explicit.
     */
    @NotNull public Builder sdPublisher(@NotNull Organization organization) {
      putValue("sdPublisher", organization);
      return this;
    }
    /**
     * Indicates the party responsible for generating and publishing the current structured data markup, typically in cases where the structured data is derived automatically from existing published content but published on a different site. For example, student projects and open data initiatives often re-publish existing content with more explicitly structured metadata. The
     * &lt;a class=&quot;localLink&quot; href=&quot;http://schema.org/sdPublisher&quot;&gt;sdPublisher&lt;/a&gt; property helps make such practices more explicit.
     */
    @NotNull public Builder sdPublisher(@NotNull Organization.Builder organization) {
      putValue("sdPublisher", organization.build());
      return this;
    }
    /**
     * Indicates the party responsible for generating and publishing the current structured data markup, typically in cases where the structured data is derived automatically from existing published content but published on a different site. For example, student projects and open data initiatives often re-publish existing content with more explicitly structured metadata. The
     * &lt;a class=&quot;localLink&quot; href=&quot;http://schema.org/sdPublisher&quot;&gt;sdPublisher&lt;/a&gt; property helps make such practices more explicit.
     */
    @NotNull public Builder sdPublisher(@NotNull Person person) {
      putValue("sdPublisher", person);
      return this;
    }
    /**
     * Indicates the party responsible for generating and publishing the current structured data markup, typically in cases where the structured data is derived automatically from existing published content but published on a different site. For example, student projects and open data initiatives often re-publish existing content with more explicitly structured metadata. The
     * &lt;a class=&quot;localLink&quot; href=&quot;http://schema.org/sdPublisher&quot;&gt;sdPublisher&lt;/a&gt; property helps make such practices more explicit.
     */
    @NotNull public Builder sdPublisher(@NotNull Person.Builder person) {
      putValue("sdPublisher", person.build());
      return this;
    }
    /**
     * The language of the content or performance or used in an action. Please use one of the language codes from the &lt;a href=&quot;http://tools.ietf.org/html/bcp47&quot;&gt;IETF BCP 47 standard&lt;/a&gt;. See also &lt;a class=&quot;localLink&quot; href=&quot;http://schema.org/availableLanguage&quot;&gt;availableLanguage&lt;/a&gt;.
     */
    @NotNull public Builder inLanguage(@NotNull Language language) {
      putValue("inLanguage", language);
      return this;
    }
    /**
     * The language of the content or performance or used in an action. Please use one of the language codes from the &lt;a href=&quot;http://tools.ietf.org/html/bcp47&quot;&gt;IETF BCP 47 standard&lt;/a&gt;. See also &lt;a class=&quot;localLink&quot; href=&quot;http://schema.org/availableLanguage&quot;&gt;availableLanguage&lt;/a&gt;.
     */
    @NotNull public Builder inLanguage(@NotNull Language.Builder language) {
      putValue("inLanguage", language.build());
      return this;
    }
    /**
     * The language of the content or performance or used in an action. Please use one of the language codes from the &lt;a href=&quot;http://tools.ietf.org/html/bcp47&quot;&gt;IETF BCP 47 standard&lt;/a&gt;. See also &lt;a class=&quot;localLink&quot; href=&quot;http://schema.org/availableLanguage&quot;&gt;availableLanguage&lt;/a&gt;.
     */
    @NotNull public Builder inLanguage(@NotNull String inLanguage) {
      putValue("inLanguage", inLanguage);
      return this;
    }
    /**
     * Indicates that the resource is compatible with the referenced accessibility API (&lt;a href=&quot;http://www.w3.org/wiki/WebSchemas/Accessibility&quot;&gt;WebSchemas wiki lists possible values&lt;/a&gt;).
     */
    @NotNull public Builder accessibilityAPI(@NotNull String accessibilityAPI) {
      putValue("accessibilityAPI", accessibilityAPI);
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
     * A thumbnail image relevant to the Thing.
     */
    @NotNull public Builder thumbnailUrl(@NotNull String thumbnailUrl) {
      putValue("thumbnailUrl", thumbnailUrl);
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
     * An award won by or for this item.
     */
    @NotNull public Builder award(@NotNull String award) {
      putValue("award", award);
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
     * The &quot;temporal&quot; property can be used in cases where more specific properties
     * (e.g. &lt;a class=&quot;localLink&quot; href=&quot;http://schema.org/temporalCoverage&quot;&gt;temporalCoverage&lt;/a&gt;, &lt;a class=&quot;localLink&quot; href=&quot;http://schema.org/dateCreated&quot;&gt;dateCreated&lt;/a&gt;, &lt;a class=&quot;localLink&quot; href=&quot;http://schema.org/dateModified&quot;&gt;dateModified&lt;/a&gt;, &lt;a class=&quot;localLink&quot; href=&quot;http://schema.org/datePublished&quot;&gt;datePublished&lt;/a&gt;) are not known to be appropriate.
     */
    @NotNull public Builder temporal(@NotNull String temporal) {
      putValue("temporal", temporal);
      return this;
    }
    /**
     * The &quot;temporal&quot; property can be used in cases where more specific properties
     * (e.g. &lt;a class=&quot;localLink&quot; href=&quot;http://schema.org/temporalCoverage&quot;&gt;temporalCoverage&lt;/a&gt;, &lt;a class=&quot;localLink&quot; href=&quot;http://schema.org/dateCreated&quot;&gt;dateCreated&lt;/a&gt;, &lt;a class=&quot;localLink&quot; href=&quot;http://schema.org/dateModified&quot;&gt;dateModified&lt;/a&gt;, &lt;a class=&quot;localLink&quot; href=&quot;http://schema.org/datePublished&quot;&gt;datePublished&lt;/a&gt;) are not known to be appropriate.
     */
    @NotNull public Builder temporal(@NotNull java.util.Date date) {
      putValue("temporal", date);
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
     * The temporalCoverage of a CreativeWork indicates the period that the content applies to, i.e. that it describes, either as a DateTime or as a textual string indicating a time period in &lt;a href=&quot;https://en.wikipedia.org/wiki/ISO_8601#Time_intervals&quot;&gt;ISO 8601 time interval format&lt;/a&gt;. In
     *       the case of a Dataset it will typically indicate the relevant time period in a precise notation (e.g. for a 2011 census dataset, the year 2011 would be written &quot;2011/2012&quot;). Other forms of content e.g. ScholarlyArticle, Book, TVSeries or TVEpisode may indicate their temporalCoverage in broader terms - textually or via well-known URL.
     *       Written works such as books may sometimes have precise temporal coverage too, e.g. a work set in 1939 - 1945 can be indicated in ISO 8601 interval format format via &quot;1939/1945&quot;.&lt;br/&gt;&lt;br/&gt;
     * 
     * Open-ended date ranges can be written with &quot;..&quot; in place of the end date. For example, &quot;2015-11/..&quot; indicates a range beginning in November 2015 and with no specified final date. This is tentative and might be updated in future when ISO 8601 is officially updated.
     */
    @NotNull public Builder temporalCoverage(@NotNull String temporalCoverage) {
      putValue("temporalCoverage", temporalCoverage);
      return this;
    }
    /**
     * The temporalCoverage of a CreativeWork indicates the period that the content applies to, i.e. that it describes, either as a DateTime or as a textual string indicating a time period in &lt;a href=&quot;https://en.wikipedia.org/wiki/ISO_8601#Time_intervals&quot;&gt;ISO 8601 time interval format&lt;/a&gt;. In
     *       the case of a Dataset it will typically indicate the relevant time period in a precise notation (e.g. for a 2011 census dataset, the year 2011 would be written &quot;2011/2012&quot;). Other forms of content e.g. ScholarlyArticle, Book, TVSeries or TVEpisode may indicate their temporalCoverage in broader terms - textually or via well-known URL.
     *       Written works such as books may sometimes have precise temporal coverage too, e.g. a work set in 1939 - 1945 can be indicated in ISO 8601 interval format format via &quot;1939/1945&quot;.&lt;br/&gt;&lt;br/&gt;
     * 
     * Open-ended date ranges can be written with &quot;..&quot; in place of the end date. For example, &quot;2015-11/..&quot; indicates a range beginning in November 2015 and with no specified final date. This is tentative and might be updated in future when ISO 8601 is officially updated.
     */
    @NotNull public Builder temporalCoverage(@NotNull java.util.Date date) {
      putValue("temporalCoverage", date);
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
     * The date on which the CreativeWork was created or the item was added to a DataFeed.
     */
    @NotNull public Builder dateCreated(@NotNull DateCreated dateCreated) {
      putValue("dateCreated", dateCreated);
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
     * Indicates the date on which the current structured data was generated / published. Typically used alongside &lt;a class=&quot;localLink&quot; href=&quot;http://schema.org/sdPublisher&quot;&gt;sdPublisher&lt;/a&gt;
     */
    @NotNull public Builder sdDatePublished(@NotNull java.util.Date date) {
      putValue("sdDatePublished", date);
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
     * A person or organization that supports (sponsors) something through some kind of financial contribution.
     */
    @NotNull public Builder funder(@NotNull Sponsor sponsor) {
      putValue("funder", sponsor);
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
     * An abstract is a short description that summarizes a &lt;a class=&quot;localLink&quot; href=&quot;http://schema.org/CreativeWork&quot;&gt;CreativeWork&lt;/a&gt;.
     */
    @NotNull public Builder abstract(@NotNull String abstract) {
      putValue("abstract", abstract);
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
     * Indicates a correction to a &lt;a class=&quot;localLink&quot; href=&quot;http://schema.org/CreativeWork&quot;&gt;CreativeWork&lt;/a&gt;, either via a &lt;a class=&quot;localLink&quot; href=&quot;http://schema.org/CorrectionComment&quot;&gt;CorrectionComment&lt;/a&gt;, textually or in another document.
     */
    @NotNull public Builder correction(@NotNull CorrectionComment correctionComment) {
      putValue("correction", correctionComment);
      return this;
    }
    /**
     * Indicates a correction to a &lt;a class=&quot;localLink&quot; href=&quot;http://schema.org/CreativeWork&quot;&gt;CreativeWork&lt;/a&gt;, either via a &lt;a class=&quot;localLink&quot; href=&quot;http://schema.org/CorrectionComment&quot;&gt;CorrectionComment&lt;/a&gt;, textually or in another document.
     */
    @NotNull public Builder correction(@NotNull CorrectionComment.Builder correctionComment) {
      putValue("correction", correctionComment.build());
      return this;
    }
    /**
     * Indicates a correction to a &lt;a class=&quot;localLink&quot; href=&quot;http://schema.org/CreativeWork&quot;&gt;CreativeWork&lt;/a&gt;, either via a &lt;a class=&quot;localLink&quot; href=&quot;http://schema.org/CorrectionComment&quot;&gt;CorrectionComment&lt;/a&gt;, textually or in another document.
     */
    @NotNull public Builder correction(@NotNull String correction) {
      putValue("correction", correction);
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
     * Conditions that affect the availability of, or method(s) of access to, an item. Typically used for real world items such as an &lt;a class=&quot;localLink&quot; href=&quot;http://schema.org/ArchiveComponent&quot;&gt;ArchiveComponent&lt;/a&gt; held by an &lt;a class=&quot;localLink&quot; href=&quot;http://schema.org/ArchiveOrganization&quot;&gt;ArchiveOrganization&lt;/a&gt;. This property is not suitable for use as a general Web access control mechanism. It is expressed only in natural language.&lt;br/&gt;&lt;br/&gt;
     * 
     * For example &quot;Available by appointment from the Reading Room&quot; or &quot;Accessible only from logged-in accounts &quot;.
     */
    @NotNull public Builder conditionsOfAccess(@NotNull String conditionsOfAccess) {
      putValue("conditionsOfAccess", conditionsOfAccess);
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
     * A flag to signal that the item, event, or place is accessible for free.
     */
    @NotNull public Builder isAccessibleForFree(@NotNull Boolean isAccessibleForFree) {
      putValue("isAccessibleForFree", isAccessibleForFree);
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
     * The predominant type or kind characterizing the learning resource. For example, 'presentation', 'handout'.
     */
    @NotNull public Builder learningResourceType(@NotNull String learningResourceType) {
      putValue("learningResourceType", learningResourceType);
      return this;
    }
    /**
     * A characteristic of the described resource that is physiologically dangerous to some users. Related to WCAG 2.0 guideline 2.3 (&lt;a href=&quot;http://www.w3.org/wiki/WebSchemas/Accessibility&quot;&gt;WebSchemas wiki lists possible values&lt;/a&gt;).
     */
    @NotNull public Builder accessibilityHazard(@NotNull String accessibilityHazard) {
      putValue("accessibilityHazard", accessibilityHazard);
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
     * Indicates (by URL or string) a particular version of a schema used in some CreativeWork. For example, a document could declare a schemaVersion using an URL such as http://schema.org/version/2.0/ if precise indication of schema version was required by some application.
     */
    @NotNull public Builder schemaVersion(@NotNull String schemaVersion) {
      putValue("schemaVersion", schemaVersion);
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
     * A maintainer of a &lt;a class=&quot;localLink&quot; href=&quot;http://schema.org/Dataset&quot;&gt;Dataset&lt;/a&gt;, software package (&lt;a class=&quot;localLink&quot; href=&quot;http://schema.org/SoftwareApplication&quot;&gt;SoftwareApplication&lt;/a&gt;), or other &lt;a class=&quot;localLink&quot; href=&quot;http://schema.org/Project&quot;&gt;Project&lt;/a&gt;. A maintainer is a &lt;a class=&quot;localLink&quot; href=&quot;http://schema.org/Person&quot;&gt;Person&lt;/a&gt; or &lt;a class=&quot;localLink&quot; href=&quot;http://schema.org/Organization&quot;&gt;Organization&lt;/a&gt; that manages contributions to, and/or publication of, some (typically complex) artifact. It is common for distributions of software and data to be based on &quot;upstream&quot; sources. When &lt;a class=&quot;localLink&quot; href=&quot;http://schema.org/maintainer&quot;&gt;maintainer&lt;/a&gt; is applied to a specific version of something e.g. a particular version or packaging of a &lt;a class=&quot;localLink&quot; href=&quot;http://schema.org/Dataset&quot;&gt;Dataset&lt;/a&gt;, it is always  possible that the upstream source has a different maintainer. The &lt;a class=&quot;localLink&quot; href=&quot;http://schema.org/isBasedOn&quot;&gt;isBasedOn&lt;/a&gt; property can be used to indicate such relationships between datasets to make the different maintenance roles clear. Similarly in the case of software, a package may have dedicated maintainers working on integration into software distributions such as Ubuntu, as well as upstream maintainers of the underlying work.
     */
    @NotNull public Builder maintainer(@NotNull Organization organization) {
      putValue("maintainer", organization);
      return this;
    }
    /**
     * A maintainer of a &lt;a class=&quot;localLink&quot; href=&quot;http://schema.org/Dataset&quot;&gt;Dataset&lt;/a&gt;, software package (&lt;a class=&quot;localLink&quot; href=&quot;http://schema.org/SoftwareApplication&quot;&gt;SoftwareApplication&lt;/a&gt;), or other &lt;a class=&quot;localLink&quot; href=&quot;http://schema.org/Project&quot;&gt;Project&lt;/a&gt;. A maintainer is a &lt;a class=&quot;localLink&quot; href=&quot;http://schema.org/Person&quot;&gt;Person&lt;/a&gt; or &lt;a class=&quot;localLink&quot; href=&quot;http://schema.org/Organization&quot;&gt;Organization&lt;/a&gt; that manages contributions to, and/or publication of, some (typically complex) artifact. It is common for distributions of software and data to be based on &quot;upstream&quot; sources. When &lt;a class=&quot;localLink&quot; href=&quot;http://schema.org/maintainer&quot;&gt;maintainer&lt;/a&gt; is applied to a specific version of something e.g. a particular version or packaging of a &lt;a class=&quot;localLink&quot; href=&quot;http://schema.org/Dataset&quot;&gt;Dataset&lt;/a&gt;, it is always  possible that the upstream source has a different maintainer. The &lt;a class=&quot;localLink&quot; href=&quot;http://schema.org/isBasedOn&quot;&gt;isBasedOn&lt;/a&gt; property can be used to indicate such relationships between datasets to make the different maintenance roles clear. Similarly in the case of software, a package may have dedicated maintainers working on integration into software distributions such as Ubuntu, as well as upstream maintainers of the underlying work.
     */
    @NotNull public Builder maintainer(@NotNull Organization.Builder organization) {
      putValue("maintainer", organization.build());
      return this;
    }
    /**
     * A maintainer of a &lt;a class=&quot;localLink&quot; href=&quot;http://schema.org/Dataset&quot;&gt;Dataset&lt;/a&gt;, software package (&lt;a class=&quot;localLink&quot; href=&quot;http://schema.org/SoftwareApplication&quot;&gt;SoftwareApplication&lt;/a&gt;), or other &lt;a class=&quot;localLink&quot; href=&quot;http://schema.org/Project&quot;&gt;Project&lt;/a&gt;. A maintainer is a &lt;a class=&quot;localLink&quot; href=&quot;http://schema.org/Person&quot;&gt;Person&lt;/a&gt; or &lt;a class=&quot;localLink&quot; href=&quot;http://schema.org/Organization&quot;&gt;Organization&lt;/a&gt; that manages contributions to, and/or publication of, some (typically complex) artifact. It is common for distributions of software and data to be based on &quot;upstream&quot; sources. When &lt;a class=&quot;localLink&quot; href=&quot;http://schema.org/maintainer&quot;&gt;maintainer&lt;/a&gt; is applied to a specific version of something e.g. a particular version or packaging of a &lt;a class=&quot;localLink&quot; href=&quot;http://schema.org/Dataset&quot;&gt;Dataset&lt;/a&gt;, it is always  possible that the upstream source has a different maintainer. The &lt;a class=&quot;localLink&quot; href=&quot;http://schema.org/isBasedOn&quot;&gt;isBasedOn&lt;/a&gt; property can be used to indicate such relationships between datasets to make the different maintenance roles clear. Similarly in the case of software, a package may have dedicated maintainers working on integration into software distributions such as Ubuntu, as well as upstream maintainers of the underlying work.
     */
    @NotNull public Builder maintainer(@NotNull Person person) {
      putValue("maintainer", person);
      return this;
    }
    /**
     * A maintainer of a &lt;a class=&quot;localLink&quot; href=&quot;http://schema.org/Dataset&quot;&gt;Dataset&lt;/a&gt;, software package (&lt;a class=&quot;localLink&quot; href=&quot;http://schema.org/SoftwareApplication&quot;&gt;SoftwareApplication&lt;/a&gt;), or other &lt;a class=&quot;localLink&quot; href=&quot;http://schema.org/Project&quot;&gt;Project&lt;/a&gt;. A maintainer is a &lt;a class=&quot;localLink&quot; href=&quot;http://schema.org/Person&quot;&gt;Person&lt;/a&gt; or &lt;a class=&quot;localLink&quot; href=&quot;http://schema.org/Organization&quot;&gt;Organization&lt;/a&gt; that manages contributions to, and/or publication of, some (typically complex) artifact. It is common for distributions of software and data to be based on &quot;upstream&quot; sources. When &lt;a class=&quot;localLink&quot; href=&quot;http://schema.org/maintainer&quot;&gt;maintainer&lt;/a&gt; is applied to a specific version of something e.g. a particular version or packaging of a &lt;a class=&quot;localLink&quot; href=&quot;http://schema.org/Dataset&quot;&gt;Dataset&lt;/a&gt;, it is always  possible that the upstream source has a different maintainer. The &lt;a class=&quot;localLink&quot; href=&quot;http://schema.org/isBasedOn&quot;&gt;isBasedOn&lt;/a&gt; property can be used to indicate such relationships between datasets to make the different maintenance roles clear. Similarly in the case of software, a package may have dedicated maintainers working on integration into software distributions such as Ubuntu, as well as upstream maintainers of the underlying work.
     */
    @NotNull public Builder maintainer(@NotNull Person.Builder person) {
      putValue("maintainer", person.build());
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
     * Keywords or tags used to describe this content. Multiple entries in a keywords list are typically delimited by commas.
     */
    @NotNull public Builder keywords(@NotNull String keywords) {
      putValue("keywords", keywords);
      return this;
    }
    /**
     * The &quot;spatial&quot; property can be used in cases when more specific properties
     * (e.g. &lt;a class=&quot;localLink&quot; href=&quot;http://schema.org/locationCreated&quot;&gt;locationCreated&lt;/a&gt;, &lt;a class=&quot;localLink&quot; href=&quot;http://schema.org/spatialCoverage&quot;&gt;spatialCoverage&lt;/a&gt;, &lt;a class=&quot;localLink&quot; href=&quot;http://schema.org/contentLocation&quot;&gt;contentLocation&lt;/a&gt;) are not known to be appropriate.
     */
    @NotNull public Builder spatial(@NotNull Place place) {
      putValue("spatial", place);
      return this;
    }
    /**
     * The &quot;spatial&quot; property can be used in cases when more specific properties
     * (e.g. &lt;a class=&quot;localLink&quot; href=&quot;http://schema.org/locationCreated&quot;&gt;locationCreated&lt;/a&gt;, &lt;a class=&quot;localLink&quot; href=&quot;http://schema.org/spatialCoverage&quot;&gt;spatialCoverage&lt;/a&gt;, &lt;a class=&quot;localLink&quot; href=&quot;http://schema.org/contentLocation&quot;&gt;contentLocation&lt;/a&gt;) are not known to be appropriate.
     */
    @NotNull public Builder spatial(@NotNull Place.Builder place) {
      putValue("spatial", place.build());
      return this;
    }
    /**
     * Date the content expires and is no longer useful or available. For example a &lt;a class=&quot;localLink&quot; href=&quot;http://schema.org/VideoObject&quot;&gt;VideoObject&lt;/a&gt; or &lt;a class=&quot;localLink&quot; href=&quot;http://schema.org/NewsArticle&quot;&gt;NewsArticle&lt;/a&gt; whose availability or relevance is time-limited, or a &lt;a class=&quot;localLink&quot; href=&quot;http://schema.org/ClaimReview&quot;&gt;ClaimReview&lt;/a&gt; fact check whose publisher wants to indicate that it may no longer be relevant (or helpful to highlight) after some date.
     */
    @NotNull public Builder expires(@NotNull java.util.Date date) {
      putValue("expires", date);
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
     * The purpose of a work in the context of education; for example, 'assignment', 'group work'.
     */
    @NotNull public Builder educationalUse(@NotNull String educationalUse) {
      putValue("educationalUse", educationalUse);
      return this;
    }
    /**
     * A list of single or combined accessModes that are sufficient to understand all the intellectual content of a resource. Expected values include:  auditory, tactile, textual, visual.
     */
    @NotNull public Builder accessModeSufficient(@NotNull ItemList itemList) {
      putValue("accessModeSufficient", itemList);
      return this;
    }
    /**
     * A list of single or combined accessModes that are sufficient to understand all the intellectual content of a resource. Expected values include:  auditory, tactile, textual, visual.
     */
    @NotNull public Builder accessModeSufficient(@NotNull ItemList.Builder itemList) {
      putValue("accessModeSufficient", itemList.build());
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
     * The subject matter of the content.
     */
    @NotNull public Builder about(@NotNull About about) {
      putValue("about", about);
      return this;
    }
    /**
     * An offer to provide this item&amp;#x2014;for example, an offer to sell a product, rent the DVD of a movie, perform a service, or give away tickets to an event. Use &lt;a class=&quot;localLink&quot; href=&quot;http://schema.org/businessFunction&quot;&gt;businessFunction&lt;/a&gt; to indicate the kind of transaction offered, i.e. sell, lease, etc. This property can also be used to describe a &lt;a class=&quot;localLink&quot; href=&quot;http://schema.org/Demand&quot;&gt;Demand&lt;/a&gt;. While this property is listed as expected on a number of common types, it can be used in others. In that case, using a second type, such as Product or a subtype of Product, can clarify the nature of the offer.
     */
    @NotNull public Builder offers(@NotNull Demand demand) {
      putValue("offers", demand);
      return this;
    }
    /**
     * An offer to provide this item&amp;#x2014;for example, an offer to sell a product, rent the DVD of a movie, perform a service, or give away tickets to an event. Use &lt;a class=&quot;localLink&quot; href=&quot;http://schema.org/businessFunction&quot;&gt;businessFunction&lt;/a&gt; to indicate the kind of transaction offered, i.e. sell, lease, etc. This property can also be used to describe a &lt;a class=&quot;localLink&quot; href=&quot;http://schema.org/Demand&quot;&gt;Demand&lt;/a&gt;. While this property is listed as expected on a number of common types, it can be used in others. In that case, using a second type, such as Product or a subtype of Product, can clarify the nature of the offer.
     */
    @NotNull public Builder offers(@NotNull Demand.Builder demand) {
      putValue("offers", demand.build());
      return this;
    }
    /**
     * An offer to provide this item&amp;#x2014;for example, an offer to sell a product, rent the DVD of a movie, perform a service, or give away tickets to an event. Use &lt;a class=&quot;localLink&quot; href=&quot;http://schema.org/businessFunction&quot;&gt;businessFunction&lt;/a&gt; to indicate the kind of transaction offered, i.e. sell, lease, etc. This property can also be used to describe a &lt;a class=&quot;localLink&quot; href=&quot;http://schema.org/Demand&quot;&gt;Demand&lt;/a&gt;. While this property is listed as expected on a number of common types, it can be used in others. In that case, using a second type, such as Product or a subtype of Product, can clarify the nature of the offer.
     */
    @NotNull public Builder offers(@NotNull Offer offer) {
      putValue("offers", offer);
      return this;
    }
    /**
     * An offer to provide this item&amp;#x2014;for example, an offer to sell a product, rent the DVD of a movie, perform a service, or give away tickets to an event. Use &lt;a class=&quot;localLink&quot; href=&quot;http://schema.org/businessFunction&quot;&gt;businessFunction&lt;/a&gt; to indicate the kind of transaction offered, i.e. sell, lease, etc. This property can also be used to describe a &lt;a class=&quot;localLink&quot; href=&quot;http://schema.org/Demand&quot;&gt;Demand&lt;/a&gt;. While this property is listed as expected on a number of common types, it can be used in others. In that case, using a second type, such as Product or a subtype of Product, can clarify the nature of the offer.
     */
    @NotNull public Builder offers(@NotNull Offer.Builder offer) {
      putValue("offers", offer.build());
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
     * The location depicted or described in the content. For example, the location in a photograph or painting.
     */
    @NotNull public Builder contentLocation(@NotNull ContentLocation contentLocation) {
      putValue("contentLocation", contentLocation);
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
      if ("upvoteCount".equals(key) && value instanceof Integer) { this.upvoteCount((Integer)value); return; }
      if ("upvoteCounts".equals(key) && value instanceof Integer) { this.upvoteCount((Integer)value); return; }
      if ("parentItem".equals(key) && value instanceof Question) { this.parentItem((Question)value); return; }
      if ("parentItems".equals(key) && value instanceof Question) { this.parentItem((Question)value); return; }
      if ("downvoteCount".equals(key) && value instanceof Integer) { this.downvoteCount((Integer)value); return; }
      if ("downvoteCounts".equals(key) && value instanceof Integer) { this.downvoteCount((Integer)value); return; }
      super.fromMap(key, value);
    }
  }
  
}
