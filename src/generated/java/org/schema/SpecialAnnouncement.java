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
 * A SpecialAnnouncement combines a simple date-stamped textual information update
 *       with contextualized Web links and other structured data.  It represents an information update made by a
 *       locally-oriented organization, for example schools, pharmacies, healthcare providers,  community groups, police,
 *       local government.&lt;br/&gt;&lt;br/&gt;
 * 
 * For work in progress guidelines on Coronavirus-related markup see &lt;a href=&quot;https://docs.google.com/document/d/14ikaGCKxo50rRM7nvKSlbUpjyIk2WMQd3IkB1lItlrM/edit#&quot;&gt;this doc&lt;/a&gt;.&lt;br/&gt;&lt;br/&gt;
 * 
 * The motivating scenario for SpecialAnnouncement is the &lt;a href=&quot;https://en.wikipedia.org/wiki/2019%E2%80%9320_coronavirus_pandemic&quot;&gt;Coronavirus pandemic&lt;/a&gt;, and the initial vocabulary is oriented to this urgent situation. Schema.org
 * expect to improve the markup iteratively as it is deployed and as feedback emerges from use. In addition to our
 * usual &lt;a href=&quot;https://github.com/schemaorg/schemaorg/issues/2490&quot;&gt;Github entry&lt;/a&gt;, feedback comments can also be provided in &lt;a href=&quot;https://docs.google.com/document/d/1fpdFFxk8s87CWwACs53SGkYv3aafSxz_DTtOQxMrBJQ/edit#&quot;&gt;this document&lt;/a&gt;.&lt;br/&gt;&lt;br/&gt;
 * 
 * While this schema is designed to communicate urgent crisis-related information, it is not the same as an emergency warning technology like &lt;a href=&quot;https://en.wikipedia.org/wiki/Common_Alerting_Protocol&quot;&gt;CAP&lt;/a&gt;, although there may be overlaps. The intent is to cover
 * the kinds of everyday practical information being posted to existing websites during an emergency situation.&lt;br/&gt;&lt;br/&gt;
 * 
 * Several kinds of information can be provided:&lt;br/&gt;&lt;br/&gt;
 * 
 * We encourage the provision of &quot;name&quot;, &quot;text&quot;, &quot;datePosted&quot;, &quot;expires&quot; (if appropriate), &quot;category&quot; and
 * &quot;url&quot; as a simple baseline. It is important to provide a value for &quot;category&quot; where possible, most ideally as a well known
 * URL from Wikipedia or Wikidata. In the case of the 2019-2020 Coronavirus pandemic, this should be &quot;https://en.wikipedia.org/w/index.php?title=2019-20_coronavirus_pandemic&quot; or &quot;https://www.wikidata.org/wiki/Q81068910&quot;.&lt;br/&gt;&lt;br/&gt;
 * 
 * For many of the possible properties, values can either be simple links or an inline description, depending on whether a summary is available. For a link, provide just the URL of the appropriate page as the property's value. For an inline description, use a &lt;a class=&quot;localLink&quot; href=&quot;http://schema.org/WebContent&quot;&gt;WebContent&lt;/a&gt; type, and provide the url as a property of that, alongside at least a simple &quot;&lt;a class=&quot;localLink&quot; href=&quot;http://schema.org/text&quot;&gt;text&lt;/a&gt;&quot; summary of the page. It is
 * unlikely that a single SpecialAnnouncement will need all of the possible properties simultaneously.&lt;br/&gt;&lt;br/&gt;
 * 
 * We expect that in many cases the page referenced might contain more specialized structured data, e.g. contact info, &lt;a class=&quot;localLink&quot; href=&quot;http://schema.org/openingHours&quot;&gt;openingHours&lt;/a&gt;, &lt;a class=&quot;localLink&quot; href=&quot;http://schema.org/Event&quot;&gt;Event&lt;/a&gt;, &lt;a class=&quot;localLink&quot; href=&quot;http://schema.org/FAQPage&quot;&gt;FAQPage&lt;/a&gt; etc. By linking to those pages from a &lt;a class=&quot;localLink&quot; href=&quot;http://schema.org/SpecialAnnouncement&quot;&gt;SpecialAnnouncement&lt;/a&gt; you can help make it clearer that the events are related to the situation (e.g. Coronavirus) indicated by the &lt;a class=&quot;localLink&quot; href=&quot;http://schema.org/category&quot;&gt;category&lt;/a&gt; property of the &lt;a class=&quot;localLink&quot; href=&quot;http://schema.org/SpecialAnnouncement&quot;&gt;SpecialAnnouncement&lt;/a&gt;.&lt;br/&gt;&lt;br/&gt;
 * 
 * Many &lt;a class=&quot;localLink&quot; href=&quot;http://schema.org/SpecialAnnouncement&quot;&gt;SpecialAnnouncement&lt;/a&gt;s will relate to particular regions and to identifiable local organizations. Use &lt;a class=&quot;localLink&quot; href=&quot;http://schema.org/spatialCoverage&quot;&gt;spatialCoverage&lt;/a&gt; for the region, and &lt;a class=&quot;localLink&quot; href=&quot;http://schema.org/announcementLocation&quot;&gt;announcementLocation&lt;/a&gt; to indicate specific &lt;a class=&quot;localLink&quot; href=&quot;http://schema.org/LocalBusiness&quot;&gt;LocalBusiness&lt;/a&gt;es and &lt;a class=&quot;localLink&quot; href=&quot;http://schema.org/CivicStructures&quot;&gt;CivicStructures&lt;/a&gt;. If the announcement affects both a particular region and a specific location (for example, a library closure that serves an entire region), use both &lt;a class=&quot;localLink&quot; href=&quot;http://schema.org/spatialCoverage&quot;&gt;spatialCoverage&lt;/a&gt; and &lt;a class=&quot;localLink&quot; href=&quot;http://schema.org/announcementLocation&quot;&gt;announcementLocation&lt;/a&gt;.&lt;br/&gt;&lt;br/&gt;
 * 
 * The &lt;a class=&quot;localLink&quot; href=&quot;http://schema.org/about&quot;&gt;about&lt;/a&gt; property can be used to indicate entities that are the focus of the announcement. We now recommend using &lt;a class=&quot;localLink&quot; href=&quot;http://schema.org/about&quot;&gt;about&lt;/a&gt; only
 * for representing non-location entities (e.g. a &lt;a class=&quot;localLink&quot; href=&quot;http://schema.org/Course&quot;&gt;Course&lt;/a&gt; or a &lt;a class=&quot;localLink&quot; href=&quot;http://schema.org/RadioStation&quot;&gt;RadioStation&lt;/a&gt;). For places, use &lt;a class=&quot;localLink&quot; href=&quot;http://schema.org/announcementLocation&quot;&gt;announcementLocation&lt;/a&gt; and &lt;a class=&quot;localLink&quot; href=&quot;http://schema.org/spatialCoverage&quot;&gt;spatialCoverage&lt;/a&gt;. Consumers of this markup should be aware that the initial design encouraged the use of /about for locations too.&lt;br/&gt;&lt;br/&gt;
 * 
 * The basic content of &lt;a class=&quot;localLink&quot; href=&quot;http://schema.org/SpecialAnnouncement&quot;&gt;SpecialAnnouncement&lt;/a&gt; is similar to that of an &lt;a href=&quot;https://en.wikipedia.org/wiki/RSS&quot;&gt;RSS&lt;/a&gt; or &lt;a href=&quot;https://en.wikipedia.org/wiki/Atom_(Web_standard)&quot;&gt;Atom&lt;/a&gt; feed. For publishers without such feeds, basic feed-like information can be shared by posting
 * &lt;a class=&quot;localLink&quot; href=&quot;http://schema.org/SpecialAnnouncement&quot;&gt;SpecialAnnouncement&lt;/a&gt; updates in a page, e.g. using JSON-LD. For sites with Atom/RSS functionality, you can point to a feed
 * with the &lt;a class=&quot;localLink&quot; href=&quot;http://schema.org/webFeed&quot;&gt;webFeed&lt;/a&gt; property. This can be a simple URL, or an inline &lt;a class=&quot;localLink&quot; href=&quot;http://schema.org/DataFeed&quot;&gt;DataFeed&lt;/a&gt; object, with &lt;a class=&quot;localLink&quot; href=&quot;http://schema.org/encodingFormat&quot;&gt;encodingFormat&lt;/a&gt; providing
 * media type information e.g. &quot;application/rss+xml&quot; or &quot;application/atom+xml&quot;.Source: https://github.com/schemaorg/schemaorg/issues/2490
 */
public class SpecialAnnouncement extends CreativeWork {
  /**
   * Indicates a page with news updates and guidelines. This could often be (but is not required to be) the main page containing &lt;a class=&quot;localLink&quot; href=&quot;http://schema.org/SpecialAnnouncement&quot;&gt;SpecialAnnouncement&lt;/a&gt; markup on a site.
   */
  @JsonIgnore public String getNewsUpdatesAndGuidelinesString() {
    return (String) getValue("newsUpdatesAndGuidelines");
  }
  /**
   * Indicates a page with news updates and guidelines. This could often be (but is not required to be) the main page containing &lt;a class=&quot;localLink&quot; href=&quot;http://schema.org/SpecialAnnouncement&quot;&gt;SpecialAnnouncement&lt;/a&gt; markup on a site.
   */
  @JsonIgnore public Collection<String> getNewsUpdatesAndGuidelinesStrings() {
    final Object current = myData.get("newsUpdatesAndGuidelines");
    if (current == null) return Collections.emptyList();
    if (current instanceof Collection) {
      return (Collection<String>) current;
    }
    return Arrays.asList((String) current);
  }
  /**
   * Indicates a page with news updates and guidelines. This could often be (but is not required to be) the main page containing &lt;a class=&quot;localLink&quot; href=&quot;http://schema.org/SpecialAnnouncement&quot;&gt;SpecialAnnouncement&lt;/a&gt; markup on a site.
   */
  @JsonIgnore public WebContent getNewsUpdatesAndGuidelinesWebContent() {
    return (WebContent) getValue("newsUpdatesAndGuidelines");
  }
  /**
   * Indicates a page with news updates and guidelines. This could often be (but is not required to be) the main page containing &lt;a class=&quot;localLink&quot; href=&quot;http://schema.org/SpecialAnnouncement&quot;&gt;SpecialAnnouncement&lt;/a&gt; markup on a site.
   */
  @JsonIgnore public Collection<WebContent> getNewsUpdatesAndGuidelinesWebContents() {
    final Object current = myData.get("newsUpdatesAndGuidelines");
    if (current == null) return Collections.emptyList();
    if (current instanceof Collection) {
      return (Collection<WebContent>) current;
    }
    return Arrays.asList((WebContent) current);
  }
  /**
   * Publication date of an online listing.
   */
  @JsonIgnore public java.util.Date getDatePosted() {
    return (java.util.Date) getValue("datePosted");
  }
  /**
   * Publication date of an online listing.
   */
  @JsonIgnore public Collection<java.util.Date> getDatePosteds() {
    final Object current = myData.get("datePosted");
    if (current == null) return Collections.emptyList();
    if (current instanceof Collection) {
      return (Collection<java.util.Date>) current;
    }
    return Arrays.asList((java.util.Date) current);
  }
  /**
   * Statistical information about the spread of a disease, either as &lt;a class=&quot;localLink&quot; href=&quot;http://schema.org/WebContent&quot;&gt;WebContent&lt;/a&gt;, or
   *   described directly as a &lt;a class=&quot;localLink&quot; href=&quot;http://schema.org/Dataset&quot;&gt;Dataset&lt;/a&gt;, or the specific &lt;a class=&quot;localLink&quot; href=&quot;http://schema.org/Observation&quot;&gt;Observation&lt;/a&gt;s in the dataset. When a &lt;a class=&quot;localLink&quot; href=&quot;http://schema.org/WebContent&quot;&gt;WebContent&lt;/a&gt; URL is
   *   provided, the page indicated might also contain more such markup.
   */
  @JsonIgnore public Dataset getDiseaseSpreadStatisticsDataset() {
    return (Dataset) getValue("diseaseSpreadStatistics");
  }
  /**
   * Statistical information about the spread of a disease, either as &lt;a class=&quot;localLink&quot; href=&quot;http://schema.org/WebContent&quot;&gt;WebContent&lt;/a&gt;, or
   *   described directly as a &lt;a class=&quot;localLink&quot; href=&quot;http://schema.org/Dataset&quot;&gt;Dataset&lt;/a&gt;, or the specific &lt;a class=&quot;localLink&quot; href=&quot;http://schema.org/Observation&quot;&gt;Observation&lt;/a&gt;s in the dataset. When a &lt;a class=&quot;localLink&quot; href=&quot;http://schema.org/WebContent&quot;&gt;WebContent&lt;/a&gt; URL is
   *   provided, the page indicated might also contain more such markup.
   */
  @JsonIgnore public Collection<Dataset> getDiseaseSpreadStatisticsDatasets() {
    final Object current = myData.get("diseaseSpreadStatistics");
    if (current == null) return Collections.emptyList();
    if (current instanceof Collection) {
      return (Collection<Dataset>) current;
    }
    return Arrays.asList((Dataset) current);
  }
  /**
   * Statistical information about the spread of a disease, either as &lt;a class=&quot;localLink&quot; href=&quot;http://schema.org/WebContent&quot;&gt;WebContent&lt;/a&gt;, or
   *   described directly as a &lt;a class=&quot;localLink&quot; href=&quot;http://schema.org/Dataset&quot;&gt;Dataset&lt;/a&gt;, or the specific &lt;a class=&quot;localLink&quot; href=&quot;http://schema.org/Observation&quot;&gt;Observation&lt;/a&gt;s in the dataset. When a &lt;a class=&quot;localLink&quot; href=&quot;http://schema.org/WebContent&quot;&gt;WebContent&lt;/a&gt; URL is
   *   provided, the page indicated might also contain more such markup.
   */
  @JsonIgnore public Observation getDiseaseSpreadStatisticsObservation() {
    return (Observation) getValue("diseaseSpreadStatistics");
  }
  /**
   * Statistical information about the spread of a disease, either as &lt;a class=&quot;localLink&quot; href=&quot;http://schema.org/WebContent&quot;&gt;WebContent&lt;/a&gt;, or
   *   described directly as a &lt;a class=&quot;localLink&quot; href=&quot;http://schema.org/Dataset&quot;&gt;Dataset&lt;/a&gt;, or the specific &lt;a class=&quot;localLink&quot; href=&quot;http://schema.org/Observation&quot;&gt;Observation&lt;/a&gt;s in the dataset. When a &lt;a class=&quot;localLink&quot; href=&quot;http://schema.org/WebContent&quot;&gt;WebContent&lt;/a&gt; URL is
   *   provided, the page indicated might also contain more such markup.
   */
  @JsonIgnore public Collection<Observation> getDiseaseSpreadStatisticsObservations() {
    final Object current = myData.get("diseaseSpreadStatistics");
    if (current == null) return Collections.emptyList();
    if (current instanceof Collection) {
      return (Collection<Observation>) current;
    }
    return Arrays.asList((Observation) current);
  }
  /**
   * Statistical information about the spread of a disease, either as &lt;a class=&quot;localLink&quot; href=&quot;http://schema.org/WebContent&quot;&gt;WebContent&lt;/a&gt;, or
   *   described directly as a &lt;a class=&quot;localLink&quot; href=&quot;http://schema.org/Dataset&quot;&gt;Dataset&lt;/a&gt;, or the specific &lt;a class=&quot;localLink&quot; href=&quot;http://schema.org/Observation&quot;&gt;Observation&lt;/a&gt;s in the dataset. When a &lt;a class=&quot;localLink&quot; href=&quot;http://schema.org/WebContent&quot;&gt;WebContent&lt;/a&gt; URL is
   *   provided, the page indicated might also contain more such markup.
   */
  @JsonIgnore public String getDiseaseSpreadStatisticsString() {
    return (String) getValue("diseaseSpreadStatistics");
  }
  /**
   * Statistical information about the spread of a disease, either as &lt;a class=&quot;localLink&quot; href=&quot;http://schema.org/WebContent&quot;&gt;WebContent&lt;/a&gt;, or
   *   described directly as a &lt;a class=&quot;localLink&quot; href=&quot;http://schema.org/Dataset&quot;&gt;Dataset&lt;/a&gt;, or the specific &lt;a class=&quot;localLink&quot; href=&quot;http://schema.org/Observation&quot;&gt;Observation&lt;/a&gt;s in the dataset. When a &lt;a class=&quot;localLink&quot; href=&quot;http://schema.org/WebContent&quot;&gt;WebContent&lt;/a&gt; URL is
   *   provided, the page indicated might also contain more such markup.
   */
  @JsonIgnore public Collection<String> getDiseaseSpreadStatisticsStrings() {
    final Object current = myData.get("diseaseSpreadStatistics");
    if (current == null) return Collections.emptyList();
    if (current instanceof Collection) {
      return (Collection<String>) current;
    }
    return Arrays.asList((String) current);
  }
  /**
   * Statistical information about the spread of a disease, either as &lt;a class=&quot;localLink&quot; href=&quot;http://schema.org/WebContent&quot;&gt;WebContent&lt;/a&gt;, or
   *   described directly as a &lt;a class=&quot;localLink&quot; href=&quot;http://schema.org/Dataset&quot;&gt;Dataset&lt;/a&gt;, or the specific &lt;a class=&quot;localLink&quot; href=&quot;http://schema.org/Observation&quot;&gt;Observation&lt;/a&gt;s in the dataset. When a &lt;a class=&quot;localLink&quot; href=&quot;http://schema.org/WebContent&quot;&gt;WebContent&lt;/a&gt; URL is
   *   provided, the page indicated might also contain more such markup.
   */
  @JsonIgnore public WebContent getDiseaseSpreadStatisticsWebContent() {
    return (WebContent) getValue("diseaseSpreadStatistics");
  }
  /**
   * Statistical information about the spread of a disease, either as &lt;a class=&quot;localLink&quot; href=&quot;http://schema.org/WebContent&quot;&gt;WebContent&lt;/a&gt;, or
   *   described directly as a &lt;a class=&quot;localLink&quot; href=&quot;http://schema.org/Dataset&quot;&gt;Dataset&lt;/a&gt;, or the specific &lt;a class=&quot;localLink&quot; href=&quot;http://schema.org/Observation&quot;&gt;Observation&lt;/a&gt;s in the dataset. When a &lt;a class=&quot;localLink&quot; href=&quot;http://schema.org/WebContent&quot;&gt;WebContent&lt;/a&gt; URL is
   *   provided, the page indicated might also contain more such markup.
   */
  @JsonIgnore public Collection<WebContent> getDiseaseSpreadStatisticsWebContents() {
    final Object current = myData.get("diseaseSpreadStatistics");
    if (current == null) return Collections.emptyList();
    if (current instanceof Collection) {
      return (Collection<WebContent>) current;
    }
    return Arrays.asList((WebContent) current);
  }
  /**
   * Information about travel bans, e.g. in the context of a pandemic.
   */
  @JsonIgnore public String getTravelBansString() {
    return (String) getValue("travelBans");
  }
  /**
   * Information about travel bans, e.g. in the context of a pandemic.
   */
  @JsonIgnore public Collection<String> getTravelBansStrings() {
    final Object current = myData.get("travelBans");
    if (current == null) return Collections.emptyList();
    if (current instanceof Collection) {
      return (Collection<String>) current;
    }
    return Arrays.asList((String) current);
  }
  /**
   * Information about travel bans, e.g. in the context of a pandemic.
   */
  @JsonIgnore public WebContent getTravelBansWebContent() {
    return (WebContent) getValue("travelBans");
  }
  /**
   * Information about travel bans, e.g. in the context of a pandemic.
   */
  @JsonIgnore public Collection<WebContent> getTravelBansWebContents() {
    final Object current = myData.get("travelBans");
    if (current == null) return Collections.emptyList();
    if (current instanceof Collection) {
      return (Collection<WebContent>) current;
    }
    return Arrays.asList((WebContent) current);
  }
  /**
   * governmentBenefitsInfo provides information about government benefits associated with a SpecialAnnouncement.
   */
  @JsonIgnore public GovernmentService getGovernmentBenefitsInfo() {
    return (GovernmentService) getValue("governmentBenefitsInfo");
  }
  /**
   * governmentBenefitsInfo provides information about government benefits associated with a SpecialAnnouncement.
   */
  @JsonIgnore public Collection<GovernmentService> getGovernmentBenefitsInfos() {
    final Object current = myData.get("governmentBenefitsInfo");
    if (current == null) return Collections.emptyList();
    if (current instanceof Collection) {
      return (Collection<GovernmentService>) current;
    }
    return Arrays.asList((GovernmentService) current);
  }
  /**
   * Guidelines about quarantine rules, e.g. in the context of a pandemic.
   */
  @JsonIgnore public String getQuarantineGuidelinesString() {
    return (String) getValue("quarantineGuidelines");
  }
  /**
   * Guidelines about quarantine rules, e.g. in the context of a pandemic.
   */
  @JsonIgnore public Collection<String> getQuarantineGuidelinesStrings() {
    final Object current = myData.get("quarantineGuidelines");
    if (current == null) return Collections.emptyList();
    if (current instanceof Collection) {
      return (Collection<String>) current;
    }
    return Arrays.asList((String) current);
  }
  /**
   * Guidelines about quarantine rules, e.g. in the context of a pandemic.
   */
  @JsonIgnore public WebContent getQuarantineGuidelinesWebContent() {
    return (WebContent) getValue("quarantineGuidelines");
  }
  /**
   * Guidelines about quarantine rules, e.g. in the context of a pandemic.
   */
  @JsonIgnore public Collection<WebContent> getQuarantineGuidelinesWebContents() {
    final Object current = myData.get("quarantineGuidelines");
    if (current == null) return Collections.emptyList();
    if (current instanceof Collection) {
      return (Collection<WebContent>) current;
    }
    return Arrays.asList((WebContent) current);
  }
  /**
   * The URL for a feed, e.g. associated with a podcast series, blog, or series of date-stamped updates. This is usually RSS or Atom.
   */
  @JsonIgnore public DataFeed getWebFeedDataFeed() {
    return (DataFeed) getValue("webFeed");
  }
  /**
   * The URL for a feed, e.g. associated with a podcast series, blog, or series of date-stamped updates. This is usually RSS or Atom.
   */
  @JsonIgnore public Collection<DataFeed> getWebFeedDataFeeds() {
    final Object current = myData.get("webFeed");
    if (current == null) return Collections.emptyList();
    if (current instanceof Collection) {
      return (Collection<DataFeed>) current;
    }
    return Arrays.asList((DataFeed) current);
  }
  /**
   * The URL for a feed, e.g. associated with a podcast series, blog, or series of date-stamped updates. This is usually RSS or Atom.
   */
  @JsonIgnore public String getWebFeedString() {
    return (String) getValue("webFeed");
  }
  /**
   * The URL for a feed, e.g. associated with a podcast series, blog, or series of date-stamped updates. This is usually RSS or Atom.
   */
  @JsonIgnore public Collection<String> getWebFeedStrings() {
    final Object current = myData.get("webFeed");
    if (current == null) return Collections.emptyList();
    if (current instanceof Collection) {
      return (Collection<String>) current;
    }
    return Arrays.asList((String) current);
  }
  /**
   * Information about public transport closures.
   */
  @JsonIgnore public String getPublicTransportClosuresInfoString() {
    return (String) getValue("publicTransportClosuresInfo");
  }
  /**
   * Information about public transport closures.
   */
  @JsonIgnore public Collection<String> getPublicTransportClosuresInfoStrings() {
    final Object current = myData.get("publicTransportClosuresInfo");
    if (current == null) return Collections.emptyList();
    if (current instanceof Collection) {
      return (Collection<String>) current;
    }
    return Arrays.asList((String) current);
  }
  /**
   * Information about public transport closures.
   */
  @JsonIgnore public WebContent getPublicTransportClosuresInfoWebContent() {
    return (WebContent) getValue("publicTransportClosuresInfo");
  }
  /**
   * Information about public transport closures.
   */
  @JsonIgnore public Collection<WebContent> getPublicTransportClosuresInfoWebContents() {
    final Object current = myData.get("publicTransportClosuresInfo");
    if (current == null) return Collections.emptyList();
    if (current instanceof Collection) {
      return (Collection<WebContent>) current;
    }
    return Arrays.asList((WebContent) current);
  }
  /**
   * Indicates a specific &lt;a class=&quot;localLink&quot; href=&quot;http://schema.org/CivicStructure&quot;&gt;CivicStructure&lt;/a&gt; or &lt;a class=&quot;localLink&quot; href=&quot;http://schema.org/LocalBusiness&quot;&gt;LocalBusiness&lt;/a&gt; associated with the SpecialAnnouncement. For example, a specific testing facility or business with special opening hours. For a larger geographic region like a quarantine of an entire region, use &lt;a class=&quot;localLink&quot; href=&quot;http://schema.org/spatialCoverage&quot;&gt;spatialCoverage&lt;/a&gt;.
   */
  @JsonIgnore public CivicStructure getAnnouncementLocationCivicStructure() {
    return (CivicStructure) getValue("announcementLocation");
  }
  /**
   * Indicates a specific &lt;a class=&quot;localLink&quot; href=&quot;http://schema.org/CivicStructure&quot;&gt;CivicStructure&lt;/a&gt; or &lt;a class=&quot;localLink&quot; href=&quot;http://schema.org/LocalBusiness&quot;&gt;LocalBusiness&lt;/a&gt; associated with the SpecialAnnouncement. For example, a specific testing facility or business with special opening hours. For a larger geographic region like a quarantine of an entire region, use &lt;a class=&quot;localLink&quot; href=&quot;http://schema.org/spatialCoverage&quot;&gt;spatialCoverage&lt;/a&gt;.
   */
  @JsonIgnore public Collection<CivicStructure> getAnnouncementLocationCivicStructures() {
    final Object current = myData.get("announcementLocation");
    if (current == null) return Collections.emptyList();
    if (current instanceof Collection) {
      return (Collection<CivicStructure>) current;
    }
    return Arrays.asList((CivicStructure) current);
  }
  /**
   * Indicates a specific &lt;a class=&quot;localLink&quot; href=&quot;http://schema.org/CivicStructure&quot;&gt;CivicStructure&lt;/a&gt; or &lt;a class=&quot;localLink&quot; href=&quot;http://schema.org/LocalBusiness&quot;&gt;LocalBusiness&lt;/a&gt; associated with the SpecialAnnouncement. For example, a specific testing facility or business with special opening hours. For a larger geographic region like a quarantine of an entire region, use &lt;a class=&quot;localLink&quot; href=&quot;http://schema.org/spatialCoverage&quot;&gt;spatialCoverage&lt;/a&gt;.
   */
  @JsonIgnore public LocalBusiness getAnnouncementLocationLocalBusiness() {
    return (LocalBusiness) getValue("announcementLocation");
  }
  /**
   * Indicates a specific &lt;a class=&quot;localLink&quot; href=&quot;http://schema.org/CivicStructure&quot;&gt;CivicStructure&lt;/a&gt; or &lt;a class=&quot;localLink&quot; href=&quot;http://schema.org/LocalBusiness&quot;&gt;LocalBusiness&lt;/a&gt; associated with the SpecialAnnouncement. For example, a specific testing facility or business with special opening hours. For a larger geographic region like a quarantine of an entire region, use &lt;a class=&quot;localLink&quot; href=&quot;http://schema.org/spatialCoverage&quot;&gt;spatialCoverage&lt;/a&gt;.
   */
  @JsonIgnore public Collection<LocalBusiness> getAnnouncementLocationLocalBusinesss() {
    final Object current = myData.get("announcementLocation");
    if (current == null) return Collections.emptyList();
    if (current instanceof Collection) {
      return (Collection<LocalBusiness>) current;
    }
    return Arrays.asList((LocalBusiness) current);
  }
  /**
   * Information about getting tested (for a &lt;a class=&quot;localLink&quot; href=&quot;http://schema.org/MedicalCondition&quot;&gt;MedicalCondition&lt;/a&gt;), e.g. in the context of a pandemic.
   */
  @JsonIgnore public String getGettingTestedInfoString() {
    return (String) getValue("gettingTestedInfo");
  }
  /**
   * Information about getting tested (for a &lt;a class=&quot;localLink&quot; href=&quot;http://schema.org/MedicalCondition&quot;&gt;MedicalCondition&lt;/a&gt;), e.g. in the context of a pandemic.
   */
  @JsonIgnore public Collection<String> getGettingTestedInfoStrings() {
    final Object current = myData.get("gettingTestedInfo");
    if (current == null) return Collections.emptyList();
    if (current instanceof Collection) {
      return (Collection<String>) current;
    }
    return Arrays.asList((String) current);
  }
  /**
   * Information about getting tested (for a &lt;a class=&quot;localLink&quot; href=&quot;http://schema.org/MedicalCondition&quot;&gt;MedicalCondition&lt;/a&gt;), e.g. in the context of a pandemic.
   */
  @JsonIgnore public WebContent getGettingTestedInfoWebContent() {
    return (WebContent) getValue("gettingTestedInfo");
  }
  /**
   * Information about getting tested (for a &lt;a class=&quot;localLink&quot; href=&quot;http://schema.org/MedicalCondition&quot;&gt;MedicalCondition&lt;/a&gt;), e.g. in the context of a pandemic.
   */
  @JsonIgnore public Collection<WebContent> getGettingTestedInfoWebContents() {
    final Object current = myData.get("gettingTestedInfo");
    if (current == null) return Collections.emptyList();
    if (current instanceof Collection) {
      return (Collection<WebContent>) current;
    }
    return Arrays.asList((WebContent) current);
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
  @JsonIgnore public Collection<Category> getCategorys() {
    final Object current = myData.get("category");
    if (current == null) return Collections.emptyList();
    if (current instanceof Collection) {
      return (Collection<Category>) current;
    }
    return Arrays.asList((Category) current);
  }
  /**
   * Information about disease prevention.
   */
  @JsonIgnore public String getDiseasePreventionInfoString() {
    return (String) getValue("diseasePreventionInfo");
  }
  /**
   * Information about disease prevention.
   */
  @JsonIgnore public Collection<String> getDiseasePreventionInfoStrings() {
    final Object current = myData.get("diseasePreventionInfo");
    if (current == null) return Collections.emptyList();
    if (current instanceof Collection) {
      return (Collection<String>) current;
    }
    return Arrays.asList((String) current);
  }
  /**
   * Information about disease prevention.
   */
  @JsonIgnore public WebContent getDiseasePreventionInfoWebContent() {
    return (WebContent) getValue("diseasePreventionInfo");
  }
  /**
   * Information about disease prevention.
   */
  @JsonIgnore public Collection<WebContent> getDiseasePreventionInfoWebContents() {
    final Object current = myData.get("diseasePreventionInfo");
    if (current == null) return Collections.emptyList();
    if (current instanceof Collection) {
      return (Collection<WebContent>) current;
    }
    return Arrays.asList((WebContent) current);
  }
  /**
   * Information about school closures.
   */
  @JsonIgnore public String getSchoolClosuresInfoString() {
    return (String) getValue("schoolClosuresInfo");
  }
  /**
   * Information about school closures.
   */
  @JsonIgnore public Collection<String> getSchoolClosuresInfoStrings() {
    final Object current = myData.get("schoolClosuresInfo");
    if (current == null) return Collections.emptyList();
    if (current instanceof Collection) {
      return (Collection<String>) current;
    }
    return Arrays.asList((String) current);
  }
  /**
   * Information about school closures.
   */
  @JsonIgnore public WebContent getSchoolClosuresInfoWebContent() {
    return (WebContent) getValue("schoolClosuresInfo");
  }
  /**
   * Information about school closures.
   */
  @JsonIgnore public Collection<WebContent> getSchoolClosuresInfoWebContents() {
    final Object current = myData.get("schoolClosuresInfo");
    if (current == null) return Collections.emptyList();
    if (current instanceof Collection) {
      return (Collection<WebContent>) current;
    }
    return Arrays.asList((WebContent) current);
  }
  protected SpecialAnnouncement(java.util.Map<String,Object> data) {
    super(data);
  }
  
  /**
   * Builder for {@link SpecialAnnouncement}
   */
  public static class Builder extends CreativeWork.Builder {
    public Builder(@NotNull HashMap<String,Object> data) {
      super(data);
    }
    @NotNull public SpecialAnnouncement build() {
      return new SpecialAnnouncement(myData);
    }
    /**
     * Indicates a page with news updates and guidelines. This could often be (but is not required to be) the main page containing &lt;a class=&quot;localLink&quot; href=&quot;http://schema.org/SpecialAnnouncement&quot;&gt;SpecialAnnouncement&lt;/a&gt; markup on a site.
     */
    @NotNull public Builder newsUpdatesAndGuidelines(@NotNull String newsUpdatesAndGuidelines) {
      putValue("newsUpdatesAndGuidelines", newsUpdatesAndGuidelines);
      return this;
    }
    /**
     * Indicates a page with news updates and guidelines. This could often be (but is not required to be) the main page containing &lt;a class=&quot;localLink&quot; href=&quot;http://schema.org/SpecialAnnouncement&quot;&gt;SpecialAnnouncement&lt;/a&gt; markup on a site.
     */
    @NotNull public Builder newsUpdatesAndGuidelines(@NotNull WebContent webContent) {
      putValue("newsUpdatesAndGuidelines", webContent);
      return this;
    }
    /**
     * Indicates a page with news updates and guidelines. This could often be (but is not required to be) the main page containing &lt;a class=&quot;localLink&quot; href=&quot;http://schema.org/SpecialAnnouncement&quot;&gt;SpecialAnnouncement&lt;/a&gt; markup on a site.
     */
    @NotNull public Builder newsUpdatesAndGuidelines(@NotNull WebContent.Builder webContent) {
      putValue("newsUpdatesAndGuidelines", webContent.build());
      return this;
    }
    /**
     * Publication date of an online listing.
     */
    @NotNull public Builder datePosted(@NotNull java.util.Date date) {
      putValue("datePosted", date);
      return this;
    }
    /**
     * Statistical information about the spread of a disease, either as &lt;a class=&quot;localLink&quot; href=&quot;http://schema.org/WebContent&quot;&gt;WebContent&lt;/a&gt;, or
     *   described directly as a &lt;a class=&quot;localLink&quot; href=&quot;http://schema.org/Dataset&quot;&gt;Dataset&lt;/a&gt;, or the specific &lt;a class=&quot;localLink&quot; href=&quot;http://schema.org/Observation&quot;&gt;Observation&lt;/a&gt;s in the dataset. When a &lt;a class=&quot;localLink&quot; href=&quot;http://schema.org/WebContent&quot;&gt;WebContent&lt;/a&gt; URL is
     *   provided, the page indicated might also contain more such markup.
     */
    @NotNull public Builder diseaseSpreadStatistics(@NotNull Dataset dataset) {
      putValue("diseaseSpreadStatistics", dataset);
      return this;
    }
    /**
     * Statistical information about the spread of a disease, either as &lt;a class=&quot;localLink&quot; href=&quot;http://schema.org/WebContent&quot;&gt;WebContent&lt;/a&gt;, or
     *   described directly as a &lt;a class=&quot;localLink&quot; href=&quot;http://schema.org/Dataset&quot;&gt;Dataset&lt;/a&gt;, or the specific &lt;a class=&quot;localLink&quot; href=&quot;http://schema.org/Observation&quot;&gt;Observation&lt;/a&gt;s in the dataset. When a &lt;a class=&quot;localLink&quot; href=&quot;http://schema.org/WebContent&quot;&gt;WebContent&lt;/a&gt; URL is
     *   provided, the page indicated might also contain more such markup.
     */
    @NotNull public Builder diseaseSpreadStatistics(@NotNull Dataset.Builder dataset) {
      putValue("diseaseSpreadStatistics", dataset.build());
      return this;
    }
    /**
     * Statistical information about the spread of a disease, either as &lt;a class=&quot;localLink&quot; href=&quot;http://schema.org/WebContent&quot;&gt;WebContent&lt;/a&gt;, or
     *   described directly as a &lt;a class=&quot;localLink&quot; href=&quot;http://schema.org/Dataset&quot;&gt;Dataset&lt;/a&gt;, or the specific &lt;a class=&quot;localLink&quot; href=&quot;http://schema.org/Observation&quot;&gt;Observation&lt;/a&gt;s in the dataset. When a &lt;a class=&quot;localLink&quot; href=&quot;http://schema.org/WebContent&quot;&gt;WebContent&lt;/a&gt; URL is
     *   provided, the page indicated might also contain more such markup.
     */
    @NotNull public Builder diseaseSpreadStatistics(@NotNull Observation observation) {
      putValue("diseaseSpreadStatistics", observation);
      return this;
    }
    /**
     * Statistical information about the spread of a disease, either as &lt;a class=&quot;localLink&quot; href=&quot;http://schema.org/WebContent&quot;&gt;WebContent&lt;/a&gt;, or
     *   described directly as a &lt;a class=&quot;localLink&quot; href=&quot;http://schema.org/Dataset&quot;&gt;Dataset&lt;/a&gt;, or the specific &lt;a class=&quot;localLink&quot; href=&quot;http://schema.org/Observation&quot;&gt;Observation&lt;/a&gt;s in the dataset. When a &lt;a class=&quot;localLink&quot; href=&quot;http://schema.org/WebContent&quot;&gt;WebContent&lt;/a&gt; URL is
     *   provided, the page indicated might also contain more such markup.
     */
    @NotNull public Builder diseaseSpreadStatistics(@NotNull Observation.Builder observation) {
      putValue("diseaseSpreadStatistics", observation.build());
      return this;
    }
    /**
     * Statistical information about the spread of a disease, either as &lt;a class=&quot;localLink&quot; href=&quot;http://schema.org/WebContent&quot;&gt;WebContent&lt;/a&gt;, or
     *   described directly as a &lt;a class=&quot;localLink&quot; href=&quot;http://schema.org/Dataset&quot;&gt;Dataset&lt;/a&gt;, or the specific &lt;a class=&quot;localLink&quot; href=&quot;http://schema.org/Observation&quot;&gt;Observation&lt;/a&gt;s in the dataset. When a &lt;a class=&quot;localLink&quot; href=&quot;http://schema.org/WebContent&quot;&gt;WebContent&lt;/a&gt; URL is
     *   provided, the page indicated might also contain more such markup.
     */
    @NotNull public Builder diseaseSpreadStatistics(@NotNull String diseaseSpreadStatistics) {
      putValue("diseaseSpreadStatistics", diseaseSpreadStatistics);
      return this;
    }
    /**
     * Statistical information about the spread of a disease, either as &lt;a class=&quot;localLink&quot; href=&quot;http://schema.org/WebContent&quot;&gt;WebContent&lt;/a&gt;, or
     *   described directly as a &lt;a class=&quot;localLink&quot; href=&quot;http://schema.org/Dataset&quot;&gt;Dataset&lt;/a&gt;, or the specific &lt;a class=&quot;localLink&quot; href=&quot;http://schema.org/Observation&quot;&gt;Observation&lt;/a&gt;s in the dataset. When a &lt;a class=&quot;localLink&quot; href=&quot;http://schema.org/WebContent&quot;&gt;WebContent&lt;/a&gt; URL is
     *   provided, the page indicated might also contain more such markup.
     */
    @NotNull public Builder diseaseSpreadStatistics(@NotNull WebContent webContent) {
      putValue("diseaseSpreadStatistics", webContent);
      return this;
    }
    /**
     * Statistical information about the spread of a disease, either as &lt;a class=&quot;localLink&quot; href=&quot;http://schema.org/WebContent&quot;&gt;WebContent&lt;/a&gt;, or
     *   described directly as a &lt;a class=&quot;localLink&quot; href=&quot;http://schema.org/Dataset&quot;&gt;Dataset&lt;/a&gt;, or the specific &lt;a class=&quot;localLink&quot; href=&quot;http://schema.org/Observation&quot;&gt;Observation&lt;/a&gt;s in the dataset. When a &lt;a class=&quot;localLink&quot; href=&quot;http://schema.org/WebContent&quot;&gt;WebContent&lt;/a&gt; URL is
     *   provided, the page indicated might also contain more such markup.
     */
    @NotNull public Builder diseaseSpreadStatistics(@NotNull WebContent.Builder webContent) {
      putValue("diseaseSpreadStatistics", webContent.build());
      return this;
    }
    /**
     * Information about travel bans, e.g. in the context of a pandemic.
     */
    @NotNull public Builder travelBans(@NotNull String travelBans) {
      putValue("travelBans", travelBans);
      return this;
    }
    /**
     * Information about travel bans, e.g. in the context of a pandemic.
     */
    @NotNull public Builder travelBans(@NotNull WebContent webContent) {
      putValue("travelBans", webContent);
      return this;
    }
    /**
     * Information about travel bans, e.g. in the context of a pandemic.
     */
    @NotNull public Builder travelBans(@NotNull WebContent.Builder webContent) {
      putValue("travelBans", webContent.build());
      return this;
    }
    /**
     * governmentBenefitsInfo provides information about government benefits associated with a SpecialAnnouncement.
     */
    @NotNull public Builder governmentBenefitsInfo(@NotNull GovernmentService governmentService) {
      putValue("governmentBenefitsInfo", governmentService);
      return this;
    }
    /**
     * governmentBenefitsInfo provides information about government benefits associated with a SpecialAnnouncement.
     */
    @NotNull public Builder governmentBenefitsInfo(@NotNull GovernmentService.Builder governmentService) {
      putValue("governmentBenefitsInfo", governmentService.build());
      return this;
    }
    /**
     * Guidelines about quarantine rules, e.g. in the context of a pandemic.
     */
    @NotNull public Builder quarantineGuidelines(@NotNull String quarantineGuidelines) {
      putValue("quarantineGuidelines", quarantineGuidelines);
      return this;
    }
    /**
     * Guidelines about quarantine rules, e.g. in the context of a pandemic.
     */
    @NotNull public Builder quarantineGuidelines(@NotNull WebContent webContent) {
      putValue("quarantineGuidelines", webContent);
      return this;
    }
    /**
     * Guidelines about quarantine rules, e.g. in the context of a pandemic.
     */
    @NotNull public Builder quarantineGuidelines(@NotNull WebContent.Builder webContent) {
      putValue("quarantineGuidelines", webContent.build());
      return this;
    }
    /**
     * The URL for a feed, e.g. associated with a podcast series, blog, or series of date-stamped updates. This is usually RSS or Atom.
     */
    @NotNull public Builder webFeed(@NotNull DataFeed dataFeed) {
      putValue("webFeed", dataFeed);
      return this;
    }
    /**
     * The URL for a feed, e.g. associated with a podcast series, blog, or series of date-stamped updates. This is usually RSS or Atom.
     */
    @NotNull public Builder webFeed(@NotNull DataFeed.Builder dataFeed) {
      putValue("webFeed", dataFeed.build());
      return this;
    }
    /**
     * The URL for a feed, e.g. associated with a podcast series, blog, or series of date-stamped updates. This is usually RSS or Atom.
     */
    @NotNull public Builder webFeed(@NotNull String webFeed) {
      putValue("webFeed", webFeed);
      return this;
    }
    /**
     * Information about public transport closures.
     */
    @NotNull public Builder publicTransportClosuresInfo(@NotNull String publicTransportClosuresInfo) {
      putValue("publicTransportClosuresInfo", publicTransportClosuresInfo);
      return this;
    }
    /**
     * Information about public transport closures.
     */
    @NotNull public Builder publicTransportClosuresInfo(@NotNull WebContent webContent) {
      putValue("publicTransportClosuresInfo", webContent);
      return this;
    }
    /**
     * Information about public transport closures.
     */
    @NotNull public Builder publicTransportClosuresInfo(@NotNull WebContent.Builder webContent) {
      putValue("publicTransportClosuresInfo", webContent.build());
      return this;
    }
    /**
     * Indicates a specific &lt;a class=&quot;localLink&quot; href=&quot;http://schema.org/CivicStructure&quot;&gt;CivicStructure&lt;/a&gt; or &lt;a class=&quot;localLink&quot; href=&quot;http://schema.org/LocalBusiness&quot;&gt;LocalBusiness&lt;/a&gt; associated with the SpecialAnnouncement. For example, a specific testing facility or business with special opening hours. For a larger geographic region like a quarantine of an entire region, use &lt;a class=&quot;localLink&quot; href=&quot;http://schema.org/spatialCoverage&quot;&gt;spatialCoverage&lt;/a&gt;.
     */
    @NotNull public Builder announcementLocation(@NotNull CivicStructure civicStructure) {
      putValue("announcementLocation", civicStructure);
      return this;
    }
    /**
     * Indicates a specific &lt;a class=&quot;localLink&quot; href=&quot;http://schema.org/CivicStructure&quot;&gt;CivicStructure&lt;/a&gt; or &lt;a class=&quot;localLink&quot; href=&quot;http://schema.org/LocalBusiness&quot;&gt;LocalBusiness&lt;/a&gt; associated with the SpecialAnnouncement. For example, a specific testing facility or business with special opening hours. For a larger geographic region like a quarantine of an entire region, use &lt;a class=&quot;localLink&quot; href=&quot;http://schema.org/spatialCoverage&quot;&gt;spatialCoverage&lt;/a&gt;.
     */
    @NotNull public Builder announcementLocation(@NotNull CivicStructure.Builder civicStructure) {
      putValue("announcementLocation", civicStructure.build());
      return this;
    }
    /**
     * Indicates a specific &lt;a class=&quot;localLink&quot; href=&quot;http://schema.org/CivicStructure&quot;&gt;CivicStructure&lt;/a&gt; or &lt;a class=&quot;localLink&quot; href=&quot;http://schema.org/LocalBusiness&quot;&gt;LocalBusiness&lt;/a&gt; associated with the SpecialAnnouncement. For example, a specific testing facility or business with special opening hours. For a larger geographic region like a quarantine of an entire region, use &lt;a class=&quot;localLink&quot; href=&quot;http://schema.org/spatialCoverage&quot;&gt;spatialCoverage&lt;/a&gt;.
     */
    @NotNull public Builder announcementLocation(@NotNull LocalBusiness localBusiness) {
      putValue("announcementLocation", localBusiness);
      return this;
    }
    /**
     * Indicates a specific &lt;a class=&quot;localLink&quot; href=&quot;http://schema.org/CivicStructure&quot;&gt;CivicStructure&lt;/a&gt; or &lt;a class=&quot;localLink&quot; href=&quot;http://schema.org/LocalBusiness&quot;&gt;LocalBusiness&lt;/a&gt; associated with the SpecialAnnouncement. For example, a specific testing facility or business with special opening hours. For a larger geographic region like a quarantine of an entire region, use &lt;a class=&quot;localLink&quot; href=&quot;http://schema.org/spatialCoverage&quot;&gt;spatialCoverage&lt;/a&gt;.
     */
    @NotNull public Builder announcementLocation(@NotNull LocalBusiness.Builder localBusiness) {
      putValue("announcementLocation", localBusiness.build());
      return this;
    }
    /**
     * Information about getting tested (for a &lt;a class=&quot;localLink&quot; href=&quot;http://schema.org/MedicalCondition&quot;&gt;MedicalCondition&lt;/a&gt;), e.g. in the context of a pandemic.
     */
    @NotNull public Builder gettingTestedInfo(@NotNull String gettingTestedInfo) {
      putValue("gettingTestedInfo", gettingTestedInfo);
      return this;
    }
    /**
     * Information about getting tested (for a &lt;a class=&quot;localLink&quot; href=&quot;http://schema.org/MedicalCondition&quot;&gt;MedicalCondition&lt;/a&gt;), e.g. in the context of a pandemic.
     */
    @NotNull public Builder gettingTestedInfo(@NotNull WebContent webContent) {
      putValue("gettingTestedInfo", webContent);
      return this;
    }
    /**
     * Information about getting tested (for a &lt;a class=&quot;localLink&quot; href=&quot;http://schema.org/MedicalCondition&quot;&gt;MedicalCondition&lt;/a&gt;), e.g. in the context of a pandemic.
     */
    @NotNull public Builder gettingTestedInfo(@NotNull WebContent.Builder webContent) {
      putValue("gettingTestedInfo", webContent.build());
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
     * Information about disease prevention.
     */
    @NotNull public Builder diseasePreventionInfo(@NotNull String diseasePreventionInfo) {
      putValue("diseasePreventionInfo", diseasePreventionInfo);
      return this;
    }
    /**
     * Information about disease prevention.
     */
    @NotNull public Builder diseasePreventionInfo(@NotNull WebContent webContent) {
      putValue("diseasePreventionInfo", webContent);
      return this;
    }
    /**
     * Information about disease prevention.
     */
    @NotNull public Builder diseasePreventionInfo(@NotNull WebContent.Builder webContent) {
      putValue("diseasePreventionInfo", webContent.build());
      return this;
    }
    /**
     * Information about school closures.
     */
    @NotNull public Builder schoolClosuresInfo(@NotNull String schoolClosuresInfo) {
      putValue("schoolClosuresInfo", schoolClosuresInfo);
      return this;
    }
    /**
     * Information about school closures.
     */
    @NotNull public Builder schoolClosuresInfo(@NotNull WebContent webContent) {
      putValue("schoolClosuresInfo", webContent);
      return this;
    }
    /**
     * Information about school closures.
     */
    @NotNull public Builder schoolClosuresInfo(@NotNull WebContent.Builder webContent) {
      putValue("schoolClosuresInfo", webContent.build());
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
      if ("newsUpdatesAndGuidelines".equals(key) && value instanceof String) { this.newsUpdatesAndGuidelines((String)value); return; }
      if ("newsUpdatesAndGuideliness".equals(key) && value instanceof String) { this.newsUpdatesAndGuidelines((String)value); return; }
      if ("newsUpdatesAndGuidelines".equals(key) && value instanceof WebContent) { this.newsUpdatesAndGuidelines((WebContent)value); return; }
      if ("newsUpdatesAndGuideliness".equals(key) && value instanceof WebContent) { this.newsUpdatesAndGuidelines((WebContent)value); return; }
      if ("datePosted".equals(key) && value instanceof java.util.Date) { this.datePosted((java.util.Date)value); return; }
      if ("datePosteds".equals(key) && value instanceof java.util.Date) { this.datePosted((java.util.Date)value); return; }
      if ("diseaseSpreadStatistics".equals(key) && value instanceof Dataset) { this.diseaseSpreadStatistics((Dataset)value); return; }
      if ("diseaseSpreadStatisticss".equals(key) && value instanceof Dataset) { this.diseaseSpreadStatistics((Dataset)value); return; }
      if ("diseaseSpreadStatistics".equals(key) && value instanceof Observation) { this.diseaseSpreadStatistics((Observation)value); return; }
      if ("diseaseSpreadStatisticss".equals(key) && value instanceof Observation) { this.diseaseSpreadStatistics((Observation)value); return; }
      if ("diseaseSpreadStatistics".equals(key) && value instanceof String) { this.diseaseSpreadStatistics((String)value); return; }
      if ("diseaseSpreadStatisticss".equals(key) && value instanceof String) { this.diseaseSpreadStatistics((String)value); return; }
      if ("diseaseSpreadStatistics".equals(key) && value instanceof WebContent) { this.diseaseSpreadStatistics((WebContent)value); return; }
      if ("diseaseSpreadStatisticss".equals(key) && value instanceof WebContent) { this.diseaseSpreadStatistics((WebContent)value); return; }
      if ("travelBans".equals(key) && value instanceof String) { this.travelBans((String)value); return; }
      if ("travelBanss".equals(key) && value instanceof String) { this.travelBans((String)value); return; }
      if ("travelBans".equals(key) && value instanceof WebContent) { this.travelBans((WebContent)value); return; }
      if ("travelBanss".equals(key) && value instanceof WebContent) { this.travelBans((WebContent)value); return; }
      if ("governmentBenefitsInfo".equals(key) && value instanceof GovernmentService) { this.governmentBenefitsInfo((GovernmentService)value); return; }
      if ("governmentBenefitsInfos".equals(key) && value instanceof GovernmentService) { this.governmentBenefitsInfo((GovernmentService)value); return; }
      if ("quarantineGuidelines".equals(key) && value instanceof String) { this.quarantineGuidelines((String)value); return; }
      if ("quarantineGuideliness".equals(key) && value instanceof String) { this.quarantineGuidelines((String)value); return; }
      if ("quarantineGuidelines".equals(key) && value instanceof WebContent) { this.quarantineGuidelines((WebContent)value); return; }
      if ("quarantineGuideliness".equals(key) && value instanceof WebContent) { this.quarantineGuidelines((WebContent)value); return; }
      if ("webFeed".equals(key) && value instanceof DataFeed) { this.webFeed((DataFeed)value); return; }
      if ("webFeeds".equals(key) && value instanceof DataFeed) { this.webFeed((DataFeed)value); return; }
      if ("webFeed".equals(key) && value instanceof String) { this.webFeed((String)value); return; }
      if ("webFeeds".equals(key) && value instanceof String) { this.webFeed((String)value); return; }
      if ("publicTransportClosuresInfo".equals(key) && value instanceof String) { this.publicTransportClosuresInfo((String)value); return; }
      if ("publicTransportClosuresInfos".equals(key) && value instanceof String) { this.publicTransportClosuresInfo((String)value); return; }
      if ("publicTransportClosuresInfo".equals(key) && value instanceof WebContent) { this.publicTransportClosuresInfo((WebContent)value); return; }
      if ("publicTransportClosuresInfos".equals(key) && value instanceof WebContent) { this.publicTransportClosuresInfo((WebContent)value); return; }
      if ("announcementLocation".equals(key) && value instanceof CivicStructure) { this.announcementLocation((CivicStructure)value); return; }
      if ("announcementLocations".equals(key) && value instanceof CivicStructure) { this.announcementLocation((CivicStructure)value); return; }
      if ("announcementLocation".equals(key) && value instanceof LocalBusiness) { this.announcementLocation((LocalBusiness)value); return; }
      if ("announcementLocations".equals(key) && value instanceof LocalBusiness) { this.announcementLocation((LocalBusiness)value); return; }
      if ("gettingTestedInfo".equals(key) && value instanceof String) { this.gettingTestedInfo((String)value); return; }
      if ("gettingTestedInfos".equals(key) && value instanceof String) { this.gettingTestedInfo((String)value); return; }
      if ("gettingTestedInfo".equals(key) && value instanceof WebContent) { this.gettingTestedInfo((WebContent)value); return; }
      if ("gettingTestedInfos".equals(key) && value instanceof WebContent) { this.gettingTestedInfo((WebContent)value); return; }
      if ("category".equals(key) && value instanceof Category) { this.category((Category)value); return; }
      if ("categorys".equals(key) && value instanceof Category) { this.category((Category)value); return; }
      if ("diseasePreventionInfo".equals(key) && value instanceof String) { this.diseasePreventionInfo((String)value); return; }
      if ("diseasePreventionInfos".equals(key) && value instanceof String) { this.diseasePreventionInfo((String)value); return; }
      if ("diseasePreventionInfo".equals(key) && value instanceof WebContent) { this.diseasePreventionInfo((WebContent)value); return; }
      if ("diseasePreventionInfos".equals(key) && value instanceof WebContent) { this.diseasePreventionInfo((WebContent)value); return; }
      if ("schoolClosuresInfo".equals(key) && value instanceof String) { this.schoolClosuresInfo((String)value); return; }
      if ("schoolClosuresInfos".equals(key) && value instanceof String) { this.schoolClosuresInfo((String)value); return; }
      if ("schoolClosuresInfo".equals(key) && value instanceof WebContent) { this.schoolClosuresInfo((WebContent)value); return; }
      if ("schoolClosuresInfos".equals(key) && value instanceof WebContent) { this.schoolClosuresInfo((WebContent)value); return; }
      super.fromMap(key, value);
    }
  }
  
}
