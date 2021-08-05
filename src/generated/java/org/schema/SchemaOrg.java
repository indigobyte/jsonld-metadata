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

import java.util.HashMap;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.jetbrains.annotations.NotNull;

public class SchemaOrg {
  /**
   * A college, university, or other third-level educational institution.
   */
  @NotNull public static CollegeOrUniversity.Builder collegeOrUniversity() { return new CollegeOrUniversity.Builder(new HashMap<String,Object>()); }
  /**
   * A delivery service through which radio content is provided via broadcast over the air or online.
   */
  @NotNull public static RadioBroadcastService.Builder radioBroadcastService() { return new RadioBroadcastService.Builder(new HashMap<String,Object>()); }
  /**
   * The act of authoring written creative content.
   */
  @NotNull public static WriteAction.Builder writeAction() { return new WriteAction.Builder(new HashMap<String,Object>()); }
  /**
   * A program with both an educational and employment component. Typically based at a workplace and structured around work-based learning, with the aim of instilling competencies related to an occupation. WorkBasedProgram is used to distinguish programs such as apprenticeships from school, college or other classroom based educational programs.
   */
  @NotNull public static WorkBasedProgram.Builder workBasedProgram() { return new WorkBasedProgram.Builder(new HashMap<String,Object>()); }
  /**
   * A dentist.
   */
  @NotNull public static Dentist.Builder dentist() { return new Dentist.Builder(new HashMap<String,Object>()); }
  /**
   * The act of asserting that a future event/action is no longer going to happen.&lt;br/&gt;&lt;br/&gt;

Related actions:&lt;br/&gt;&lt;br/&gt;

&lt;ul&gt;
&lt;li&gt;&lt;a class=&quot;localLink&quot; href=&quot;http://schema.org/ConfirmAction&quot;&gt;ConfirmAction&lt;/a&gt;: The antonym of CancelAction.&lt;/li&gt;
&lt;/ul&gt;

   */
  @NotNull public static CancelAction.Builder cancelAction() { return new CancelAction.Builder(new HashMap<String,Object>()); }
  /**
   * A file composed primarily of text.
   */
  @NotNull public static TextDigitalDocument.Builder textDigitalDocument() { return new TextDigitalDocument.Builder(new HashMap<String,Object>()); }
  /**
   * A bus stop.
   */
  @NotNull public static BusStop.Builder busStop() { return new BusStop.Builder(new HashMap<String,Object>()); }
  /**
   * A &lt;a class=&quot;localLink&quot; href=&quot;http://schema.org/NewsArticle&quot;&gt;NewsArticle&lt;/a&gt; providing historical context, definition and detail on a specific topic (aka &quot;explainer&quot; or &quot;backgrounder&quot;). For example, an in-depth article or frequently-asked-questions (&lt;a href=&quot;https://en.wikipedia.org/wiki/FAQ&quot;&gt;FAQ&lt;/a&gt;) document on topics such as Climate Change or the European Union. Other kinds of background material from a non-news setting are often described using &lt;a class=&quot;localLink&quot; href=&quot;http://schema.org/Book&quot;&gt;Book&lt;/a&gt; or &lt;a class=&quot;localLink&quot; href=&quot;http://schema.org/Article&quot;&gt;Article&lt;/a&gt;, in particular &lt;a class=&quot;localLink&quot; href=&quot;http://schema.org/ScholarlyArticle&quot;&gt;ScholarlyArticle&lt;/a&gt;. See also &lt;a class=&quot;localLink&quot; href=&quot;http://schema.org/NewsArticle&quot;&gt;NewsArticle&lt;/a&gt; for related vocabulary from a learning/education perspective.
   */
  @NotNull public static BackgroundNewsArticle.Builder backgroundNewsArticle() { return new BackgroundNewsArticle.Builder(new HashMap<String,Object>()); }
  /**
   * A sub-grouping of food or drink items in a menu. E.g. courses (such as 'Dinner', 'Breakfast', etc.), specific type of dishes (such as 'Meat', 'Vegan', 'Drinks', etc.), or some other classification made by the menu provider.
   */
  @NotNull public static MenuSection.Builder menuSection() { return new MenuSection.Builder(new HashMap<String,Object>()); }
  /**
   * Any bodily activity that enhances or maintains physical fitness and overall health and wellness. Includes activity that is part of daily living and routine, structured exercise, and exercise prescribed as part of a medical treatment or recovery plan.
   */
  @NotNull public static PhysicalActivity.Builder physicalActivity() { return new PhysicalActivity.Builder(new HashMap<String,Object>()); }
  /**
   * The act of transferring/moving (abstract or concrete) animate or inanimate objects from one place to another.
   */
  @NotNull public static TransferAction.Builder transferAction() { return new TransferAction.Builder(new HashMap<String,Object>()); }
  /**
   * A computer store.
   */
  @NotNull public static ComputerStore.Builder computerStore() { return new ComputerStore.Builder(new HashMap<String,Object>()); }
  /**
   * Podiatry is the care of the human foot, especially the diagnosis and treatment of foot disorders.
   */
  @NotNull public static Podiatric.Builder podiatric() { return new Podiatric.Builder(new HashMap<String,Object>()); }
  /**
   * A &lt;a class=&quot;localLink&quot; href=&quot;http://schema.org/CampingPitch&quot;&gt;CampingPitch&lt;/a&gt; is an individual place for overnight stay in the outdoors, typically being part of a larger camping site, or &lt;a class=&quot;localLink&quot; href=&quot;http://schema.org/Campground&quot;&gt;Campground&lt;/a&gt;.&lt;br/&gt;&lt;br/&gt;

In British English a campsite, or campground, is an area, usually divided into a number of pitches, where people can camp overnight using tents or camper vans or caravans; this British English use of the word is synonymous with the American English expression campground. In American English the term campsite generally means an area where an individual, family, group, or military unit can pitch a tent or park a camper; a campground may contain many campsites.
(Source: Wikipedia see &lt;a href=&quot;https://en.wikipedia.org/wiki/Campsite&quot;&gt;https://en.wikipedia.org/wiki/Campsite&lt;/a&gt;).&lt;br/&gt;&lt;br/&gt;

See also the dedicated &lt;a href=&quot;/docs/hotels.html&quot;&gt;document on the use of schema.org for marking up hotels and other forms of accommodations&lt;/a&gt;.
   */
  @NotNull public static CampingPitch.Builder campingPitch() { return new CampingPitch.Builder(new HashMap<String,Object>()); }
  /**
   * A specific branch of medical science that deals with the evaluation and initial treatment of medical conditions caused by trauma or sudden illness.
   */
  @NotNull public static Emergency.Builder emergency() { return new Emergency.Builder(new HashMap<String,Object>()); }
  /**
   * A short TV program or a segment/part of a TV program.
   */
  @NotNull public static TVClip.Builder tVClip() { return new TVClip.Builder(new HashMap<String,Object>()); }
  /**
   * A garden store.
   */
  @NotNull public static GardenStore.Builder gardenStore() { return new GardenStore.Builder(new HashMap<String,Object>()); }
  /**
   * Web page type: Media gallery page. A mixed-media page that can contains media such as images, videos, and other multimedia.
   */
  @NotNull public static MediaGallery.Builder mediaGallery() { return new MediaGallery.Builder(new HashMap<String,Object>()); }
  /**
   * A resort is a place used for relaxation or recreation, attracting visitors for holidays or vacations. Resorts are places, towns or sometimes commercial establishment operated by a single company (Source: Wikipedia, the free encyclopedia, see &lt;a href=&quot;http://en.wikipedia.org/wiki/Resort&quot;&gt;http://en.wikipedia.org/wiki/Resort&lt;/a&gt;).
&lt;br /&gt;&lt;br /&gt;
See also the &lt;a href=&quot;/docs/hotels.html&quot;&gt;dedicated document on the use of schema.org for marking up hotels and other forms of accommodations&lt;/a&gt;.
   */
  @NotNull public static Resort.Builder resort() { return new Resort.Builder(new HashMap<String,Object>()); }
  /**
   * The act of dressing oneself in clothing.
   */
  @NotNull public static WearAction.Builder wearAction() { return new WearAction.Builder(new HashMap<String,Object>()); }
  /**
   * Vital signs are measures of various physiological functions in order to assess the most basic body functions.
   */
  @NotNull public static VitalSign.Builder vitalSign() { return new VitalSign.Builder(new HashMap<String,Object>()); }
  /**
   * A fact-checking review of claims made (or reported) in some creative work (referenced via itemReviewed).
   */
  @NotNull public static ClaimReview.Builder claimReview() { return new ClaimReview.Builder(new HashMap<String,Object>()); }
  /**
   * Branch of medicine that pertains to the health services to improve and protect community health, especially epidemiology, sanitation, immunization, and preventive medicine.
   */
  @NotNull public static PublicHealth.Builder publicHealth() { return new PublicHealth.Builder(new HashMap<String,Object>()); }
  /**
   * OfferShippingDetails represents information about shipping destinations.&lt;br/&gt;&lt;br/&gt;

Multiple of these entities can be used to represent different shipping rates for different destinations:&lt;br/&gt;&lt;br/&gt;

One entity for Alaska/Hawaii. A different one for continental US.A different one for all France.&lt;br/&gt;&lt;br/&gt;

Multiple of these entities can be used to represent different shipping costs and delivery times.&lt;br/&gt;&lt;br/&gt;

Two entities that are identical but differ in rate and time:&lt;br/&gt;&lt;br/&gt;

e.g. Cheaper and slower: $5 in 5-7days
or Fast and expensive: $15 in 1-2 days
   */
  @NotNull public static OfferShippingDetails.Builder offerShippingDetails() { return new OfferShippingDetails.Builder(new HashMap<String,Object>()); }
  /**
   * A comedy club.
   */
  @NotNull public static ComedyClub.Builder comedyClub() { return new ComedyClub.Builder(new HashMap<String,Object>()); }
  /**
   * The most generic kind of creative work, including books, movies, photographs, software programs, etc.
   */
  @NotNull public static CreativeWork.Builder creativeWork() { return new CreativeWork.Builder(new HashMap<String,Object>()); }
  /**
   * A demand entity represents the public, not necessarily binding, not necessarily exclusive, announcement by an organization or person to seek a certain type of goods or services. For describing demand using this type, the very same properties used for Offer apply.
   */
  @NotNull public static Demand.Builder demand() { return new Demand.Builder(new HashMap<String,Object>()); }
  /**
   * A &lt;a class=&quot;localLink&quot; href=&quot;http://schema.org/NewsArticle&quot;&gt;NewsArticle&lt;/a&gt; expressing an open call by a &lt;a class=&quot;localLink&quot; href=&quot;http://schema.org/NewsMediaOrganization&quot;&gt;NewsMediaOrganization&lt;/a&gt; asking the public for input, insights, clarifications, anecdotes, documentation, etc., on an issue, for reporting purposes.
   */
  @NotNull public static AskPublicNewsArticle.Builder askPublicNewsArticle() { return new AskPublicNewsArticle.Builder(new HashMap<String,Object>()); }
  /**
   * Web page type: Image gallery page.
   */
  @NotNull public static ImageGallery.Builder imageGallery() { return new ImageGallery.Builder(new HashMap<String,Object>()); }
  /**
   * An anatomical system is a group of anatomical structures that work together to perform a certain task. Anatomical systems, such as organ systems, are one organizing principle of anatomy, and can includes circulatory, digestive, endocrine, integumentary, immune, lymphatic, muscular, nervous, reproductive, respiratory, skeletal, urinary, vestibular, and other systems.
   */
  @NotNull public static AnatomicalSystem.Builder anatomicalSystem() { return new AnatomicalSystem.Builder(new HashMap<String,Object>()); }
  /**
   * The act of adding at a specific location in an ordered collection.
   */
  @NotNull public static InsertAction.Builder insertAction() { return new InsertAction.Builder(new HashMap<String,Object>()); }
  /**
   * A video game series.
   */
  @NotNull public static VideoGameSeries.Builder videoGameSeries() { return new VideoGameSeries.Builder(new HashMap<String,Object>()); }
  /**
   * A radio channel that uses AM.
   */
  @NotNull public static AMRadioChannel.Builder aMRadioChannel() { return new AMRadioChannel.Builder(new HashMap<String,Object>()); }
  /**
   * A home goods store.
   */
  @NotNull public static HomeGoodsStore.Builder homeGoodsStore() { return new HomeGoodsStore.Builder(new HashMap<String,Object>()); }
  /**
   * A mosque.
   */
  @NotNull public static Mosque.Builder mosque() { return new Mosque.Builder(new HashMap<String,Object>()); }
  /**
   * A structured value providing information about the opening hours of a place or a certain service inside a place.&lt;br/&gt;&lt;br/&gt;

The place is &lt;strong&gt;open&lt;/strong&gt; if the &lt;a class=&quot;localLink&quot; href=&quot;http://schema.org/opens&quot;&gt;opens&lt;/a&gt; property is specified, and &lt;strong&gt;closed&lt;/strong&gt; otherwise.&lt;br/&gt;&lt;br/&gt;

If the value for the &lt;a class=&quot;localLink&quot; href=&quot;http://schema.org/closes&quot;&gt;closes&lt;/a&gt; property is less than the value for the &lt;a class=&quot;localLink&quot; href=&quot;http://schema.org/opens&quot;&gt;opens&lt;/a&gt; property then the hour range is assumed to span over the next day.
   */
  @NotNull public static OpeningHoursSpecification.Builder openingHoursSpecification() { return new OpeningHoursSpecification.Builder(new HashMap<String,Object>()); }
  /**
   * A &lt;a class=&quot;localLink&quot; href=&quot;http://schema.org/NewsArticle&quot;&gt;NewsArticle&lt;/a&gt; and &lt;a class=&quot;localLink&quot; href=&quot;http://schema.org/CriticReview&quot;&gt;CriticReview&lt;/a&gt; providing a professional critic's assessment of a service, product, performance, or artistic or literary work.
   */
  @NotNull public static ReviewNewsArticle.Builder reviewNewsArticle() { return new ReviewNewsArticle.Builder(new HashMap<String,Object>()); }
  /**
   * A set of requirements that a must be fulfilled in order to perform an Action.
   */
  @NotNull public static ActionAccessSpecification.Builder actionAccessSpecification() { return new ActionAccessSpecification.Builder(new HashMap<String,Object>()); }
  /**
   * A Consortium is a membership &lt;a class=&quot;localLink&quot; href=&quot;http://schema.org/Organization&quot;&gt;Organization&lt;/a&gt; whose members are typically Organizations.
   */
  @NotNull public static Consortium.Builder consortium() { return new Consortium.Builder(new HashMap<String,Object>()); }
  /**
   * An &lt;a class=&quot;localLink&quot; href=&quot;http://schema.org/Article&quot;&gt;Article&lt;/a&gt; whose content is primarily &lt;a href=&quot;https://en.wikipedia.org/wiki/Satire&quot;&gt;[satirical]&lt;/a&gt; in nature, i.e. unlikely to be literally true. A satirical article is sometimes but not necessarily also a &lt;a class=&quot;localLink&quot; href=&quot;http://schema.org/NewsArticle&quot;&gt;NewsArticle&lt;/a&gt;. &lt;a class=&quot;localLink&quot; href=&quot;http://schema.org/ScholarlyArticle&quot;&gt;ScholarlyArticle&lt;/a&gt;s are also sometimes satirized.
   */
  @NotNull public static SatiricalArticle.Builder satiricalArticle() { return new SatiricalArticle.Builder(new HashMap<String,Object>()); }
  /**
   * A church.
   */
  @NotNull public static Church.Builder church() { return new Church.Builder(new HashMap<String,Object>()); }
  /**
   * A painting.
   */
  @NotNull public static Painting.Builder painting() { return new Painting.Builder(new HashMap<String,Object>()); }
  /**
   * A car is a wheeled, self-powered motor vehicle used for transportation.
   */
  @NotNull public static Car.Builder car() { return new Car.Builder(new HashMap<String,Object>()); }
  /**
   * A post office.
   */
  @NotNull public static PostOffice.Builder postOffice() { return new PostOffice.Builder(new HashMap<String,Object>()); }
  /**
   * The act of participating in exertive activity for the purposes of improving health and fitness.
   */
  @NotNull public static ExerciseAction.Builder exerciseAction() { return new ExerciseAction.Builder(new HashMap<String,Object>()); }
  /**
   * A volcano, like Fuji san.
   */
  @NotNull public static Volcano.Builder volcano() { return new Volcano.Builder(new HashMap<String,Object>()); }
  /**
   * Web page type: Collection page.
   */
  @NotNull public static CollectionPage.Builder collectionPage() { return new CollectionPage.Builder(new HashMap<String,Object>()); }
  /**
   * A WebSite is a set of related web pages and other items typically served from a single web domain and accessible via URLs.
   */
  @NotNull public static WebSite.Builder webSite() { return new WebSite.Builder(new HashMap<String,Object>()); }
  /**
   * An agent inspects, determines, investigates, inquires, or examines an object's accuracy, quality, condition, or state.
   */
  @NotNull public static CheckAction.Builder checkAction() { return new CheckAction.Builder(new HashMap<String,Object>()); }
  /**
   * A medical procedure intended primarily for diagnostic, as opposed to therapeutic, purposes.
   */
  @NotNull public static DiagnosticProcedure.Builder diagnosticProcedure() { return new DiagnosticProcedure.Builder(new HashMap<String,Object>()); }
  /**
   * A reservation for an event like a concert, sporting event, or lecture.&lt;br/&gt;&lt;br/&gt;

Note: This type is for information about actual reservations, e.g. in confirmation emails or HTML pages with individual confirmations of reservations. For offers of tickets, use &lt;a class=&quot;localLink&quot; href=&quot;http://schema.org/Offer&quot;&gt;Offer&lt;/a&gt;.
   */
  @NotNull public static EventReservation.Builder eventReservation() { return new EventReservation.Builder(new HashMap<String,Object>()); }
  /**
   * The geographic coordinates of a place or event.
   */
  @NotNull public static GeoCoordinates.Builder geoCoordinates() { return new GeoCoordinates.Builder(new HashMap<String,Object>()); }
  /**
   * A utility class that serves as the umbrella for a number of 'intangible' things in the medical space.
   */
  @NotNull public static MedicalIntangible.Builder medicalIntangible() { return new MedicalIntangible.Builder(new HashMap<String,Object>()); }
  /**
   * An Insurance agency.
   */
  @NotNull public static InsuranceAgency.Builder insuranceAgency() { return new InsuranceAgency.Builder(new HashMap<String,Object>()); }
  /**
   * The artwork on the outer surface of a CreativeWork.
   */
  @NotNull public static CoverArt.Builder coverArt() { return new CoverArt.Builder(new HashMap<String,Object>()); }
  /**
   * A permission for a particular person or group to access a particular file.
   */
  @NotNull public static DigitalDocumentPermission.Builder digitalDocumentPermission() { return new DigitalDocumentPermission.Builder(new HashMap<String,Object>()); }
  /**
   * UserInteraction and its subtypes is an old way of talking about users interacting with pages. It is generally better to use &lt;a class=&quot;localLink&quot; href=&quot;http://schema.org/Action&quot;&gt;Action&lt;/a&gt;-based vocabulary, alongside types such as &lt;a class=&quot;localLink&quot; href=&quot;http://schema.org/Comment&quot;&gt;Comment&lt;/a&gt;.
   */
  @NotNull public static UserDownloads.Builder userDownloads() { return new UserDownloads.Builder(new HashMap<String,Object>()); }
  /**
   * One of the continents (for example, Europe or Africa).
   */
  @NotNull public static Continent.Builder continent() { return new Continent.Builder(new HashMap<String,Object>()); }
  /**
   * The legal availability status of a medical drug.
   */
  @NotNull public static DrugLegalStatus.Builder drugLegalStatus() { return new DrugLegalStatus.Builder(new HashMap<String,Object>()); }
  /**
   * A PublicationEvent corresponds indifferently to the event of publication for a CreativeWork of any type e.g. a broadcast event, an on-demand event, a book/journal publication via a variety of delivery media.
   */
  @NotNull public static PublicationEvent.Builder publicationEvent() { return new PublicationEvent.Builder(new HashMap<String,Object>()); }
  /**
   * An enterprise (potentially individual but typically collaborative), planned to achieve a particular aim.
Use properties from &lt;a class=&quot;localLink&quot; href=&quot;http://schema.org/Organization&quot;&gt;Organization&lt;/a&gt;, &lt;a class=&quot;localLink&quot; href=&quot;http://schema.org/subOrganization&quot;&gt;subOrganization&lt;/a&gt;/&lt;a class=&quot;localLink&quot; href=&quot;http://schema.org/parentOrganization&quot;&gt;parentOrganization&lt;/a&gt; to indicate project sub-structures.
   */
  @NotNull public static Project.Builder project() { return new Project.Builder(new HashMap<String,Object>()); }
  /**
   * The footer section of the page.
   */
  @NotNull public static WPFooter.Builder wPFooter() { return new WPFooter.Builder(new HashMap<String,Object>()); }
  /**
   * One or more messages between organizations or people on a particular topic. Individual messages can be linked to the conversation with isPartOf or hasPart properties.
   */
  @NotNull public static Conversation.Builder conversation() { return new Conversation.Builder(new HashMap<String,Object>()); }
  /**
   * This type covers computer programming languages such as Scheme and Lisp, as well as other language-like computer representations. Natural languages are best represented with the &lt;a class=&quot;localLink&quot; href=&quot;http://schema.org/Language&quot;&gt;Language&lt;/a&gt; type.
   */
  @NotNull public static ComputerLanguage.Builder computerLanguage() { return new ComputerLanguage.Builder(new HashMap<String,Object>()); }
  /**
   * Any matter of defined composition that has discrete existence, whose origin may be biological, mineral or chemical.
   */
  @NotNull public static Substance.Builder substance() { return new Substance.Builder(new HashMap<String,Object>()); }
  /**
   * A collection of music tracks in playlist form.
   */
  @NotNull public static MusicPlaylist.Builder musicPlaylist() { return new MusicPlaylist.Builder(new HashMap<String,Object>()); }
  /**
   * A car rental business.
   */
  @NotNull public static AutoRental.Builder autoRental() { return new AutoRental.Builder(new HashMap<String,Object>()); }
  /**
   * A blog post.
   */
  @NotNull public static BlogPosting.Builder blogPosting() { return new BlogPosting.Builder(new HashMap<String,Object>()); }
  /**
   * DefinedRegion is a DefinedRegion
   */
  @NotNull public static DefinedRegion.Builder definedRegion() { return new DefinedRegion.Builder(new HashMap<String,Object>()); }
  /**
   * Financial services business.
   */
  @NotNull public static FinancialService.Builder financialService() { return new FinancialService.Builder(new HashMap<String,Object>()); }
  /**
   * The act of inserting at the beginning if an ordered collection.
   */
  @NotNull public static PrependAction.Builder prependAction() { return new PrependAction.Builder(new HashMap<String,Object>()); }
  /**
   * A police station.
   */
  @NotNull public static PoliceStation.Builder policeStation() { return new PoliceStation.Builder(new HashMap<String,Object>()); }
  /**
   * A StupidType for testing.
   */
  @NotNull public static StupidType.Builder stupidType() { return new StupidType.Builder(new HashMap<String,Object>()); }
  /**
   * A shopping center or mall.
   */
  @NotNull public static ShoppingCenter.Builder shoppingCenter() { return new ShoppingCenter.Builder(new HashMap<String,Object>()); }
  /**
   * A complex mathematical calculation requiring an online calculator, used to assess prognosis. Note: use the url property of Thing to record any URLs for online calculators.
   */
  @NotNull public static MedicalRiskCalculator.Builder medicalRiskCalculator() { return new MedicalRiskCalculator.Builder(new HashMap<String,Object>()); }
  /**
   * Represents additional information about a relationship or property. For example a Role can be used to say that a 'member' role linking some SportsTeam to a player occurred during a particular time period. Or that a Person's 'actor' role in a Movie was for some particular characterName. Such properties can be attached to a Role entity, which is then associated with the main entities using ordinary properties like 'member' or 'actor'.&lt;br/&gt;&lt;br/&gt;

See also &lt;a href=&quot;http://blog.schema.org/2014/06/introducing-role.html&quot;&gt;blog post&lt;/a&gt;.
   */
  @NotNull public static Role.Builder role() { return new Role.Builder(new HashMap<String,Object>()); }
  /**
   * A museum.
   */
  @NotNull public static Museum.Builder museum() { return new Museum.Builder(new HashMap<String,Object>()); }
  /**
   * A movie.
   */
  @NotNull public static Movie.Builder movie() { return new Movie.Builder(new HashMap<String,Object>()); }
  /**
   * A nurse-like health profession that deals with pregnancy, childbirth, and the postpartum period (including care of the newborn), besides sexual and reproductive health of women throughout their lives.
   */
  @NotNull public static Midwifery.Builder midwifery() { return new Midwifery.Builder(new HashMap<String,Object>()); }
  /**
   * The act of rejecting to/adopting an object.&lt;br/&gt;&lt;br/&gt;

Related actions:&lt;br/&gt;&lt;br/&gt;

&lt;ul&gt;
&lt;li&gt;&lt;a class=&quot;localLink&quot; href=&quot;http://schema.org/AcceptAction&quot;&gt;AcceptAction&lt;/a&gt;: The antonym of RejectAction.&lt;/li&gt;
&lt;/ul&gt;

   */
  @NotNull public static RejectAction.Builder rejectAction() { return new RejectAction.Builder(new HashMap<String,Object>()); }
  /**
   * An entity holding detailed information about the available bed types, e.g. the quantity of twin beds for a hotel room. For the single case of just one bed of a certain type, you can use bed directly with a text. See also &lt;a class=&quot;localLink&quot; href=&quot;http://schema.org/BedType&quot;&gt;BedType&lt;/a&gt; (under development).
   */
  @NotNull public static BedDetails.Builder bedDetails() { return new BedDetails.Builder(new HashMap<String,Object>()); }
  /**
   * A clothing store.
   */
  @NotNull public static ClothingStore.Builder clothingStore() { return new ClothingStore.Builder(new HashMap<String,Object>()); }
  /**
   * A medical trial is a type of medical study that uses scientific process used to compare the safety and efficacy of medical therapies or medical procedures. In general, medical trials are controlled and subjects are allocated at random to the different treatment and/or control groups.
   */
  @NotNull public static MedicalTrial.Builder medicalTrial() { return new MedicalTrial.Builder(new HashMap<String,Object>()); }
  /**
   * Fitness-related activity designed for a specific health-related purpose, including defined exercise routines as well as activity prescribed by a clinician.
   */
  @NotNull public static ExercisePlan.Builder exercisePlan() { return new ExercisePlan.Builder(new HashMap<String,Object>()); }
  /**
   * A theater group or company, for example, the Royal Shakespeare Company or Druid Theatre.
   */
  @NotNull public static TheaterGroup.Builder theaterGroup() { return new TheaterGroup.Builder(new HashMap<String,Object>()); }
  /**
   * A reservation for a taxi.&lt;br/&gt;&lt;br/&gt;

Note: This type is for information about actual reservations, e.g. in confirmation emails or HTML pages with individual confirmations of reservations. For offers of tickets, use &lt;a class=&quot;localLink&quot; href=&quot;http://schema.org/Offer&quot;&gt;Offer&lt;/a&gt;.
   */
  @NotNull public static TaxiReservation.Builder taxiReservation() { return new TaxiReservation.Builder(new HashMap<String,Object>()); }
  /**
   * A public swimming pool.
   */
  @NotNull public static PublicSwimmingPool.Builder publicSwimmingPool() { return new PublicSwimmingPool.Builder(new HashMap<String,Object>()); }
  /**
   * The act of returning to the origin that which was previously received (concrete objects) or taken (ownership).
   */
  @NotNull public static ReturnAction.Builder returnAction() { return new ReturnAction.Builder(new HashMap<String,Object>()); }
  /**
   * The act of managing by changing/editing the state of the object.
   */
  @NotNull public static UpdateAction.Builder updateAction() { return new UpdateAction.Builder(new HashMap<String,Object>()); }
  /**
   * A men's clothing store.
   */
  @NotNull public static MensClothingStore.Builder mensClothingStore() { return new MensClothingStore.Builder(new HashMap<String,Object>()); }
  /**
   * Event type: Food event.
   */
  @NotNull public static FoodEvent.Builder foodEvent() { return new FoodEvent.Builder(new HashMap<String,Object>()); }
  /**
   * A DatedMoneySpecification represents monetary values with optional start and end dates. For example, this could represent an employee's salary over a specific period of time. &lt;strong&gt;Note:&lt;/strong&gt; This type has been superseded by &lt;a class=&quot;localLink&quot; href=&quot;http://schema.org/MonetaryAmount&quot;&gt;MonetaryAmount&lt;/a&gt; use of that type is recommended
   */
  @NotNull public static DatedMoneySpecification.Builder datedMoneySpecification() { return new DatedMoneySpecification.Builder(new HashMap<String,Object>()); }
  /**
   * A FundingScheme combines organizational, project and policy aspects of grant-based funding
    that sets guidelines, principles and mechanisms to support other kinds of projects and activities.
    Funding is typically organized via &lt;a class=&quot;localLink&quot; href=&quot;http://schema.org/Grant&quot;&gt;Grant&lt;/a&gt; funding. Examples of funding schemes: Swiss Priority Programmes (SPPs); EU Framework 7 (FP7); Horizon 2020; the NIH-R01 Grant Program; Wellcome institutional strategic support fund. For large scale public sector funding, the management and administration of grant awards is often handled by other, dedicated, organizations - &lt;a class=&quot;localLink&quot; href=&quot;http://schema.org/FundingAgency&quot;&gt;FundingAgency&lt;/a&gt;s such as ERC, REA, ...
   */
  @NotNull public static FundingScheme.Builder fundingScheme() { return new FundingScheme.Builder(new HashMap<String,Object>()); }
  /**
   * The act of ingesting information/resources/food.
   */
  @NotNull public static ConsumeAction.Builder consumeAction() { return new ConsumeAction.Builder(new HashMap<String,Object>()); }
  /**
   * A web page that provides medical information.
   */
  @NotNull public static MedicalWebPage.Builder medicalWebPage() { return new MedicalWebPage.Builder(new HashMap<String,Object>()); }
  /**
   * A movie rental store.
   */
  @NotNull public static MovieRentalStore.Builder movieRentalStore() { return new MovieRentalStore.Builder(new HashMap<String,Object>()); }
  /**
   * An image of a visual machine-readable code such as a barcode or QR code.
   */
  @NotNull public static Barcode.Builder barcode() { return new Barcode.Builder(new HashMap<String,Object>()); }
  /**
   * A hair salon.
   */
  @NotNull public static HairSalon.Builder hairSalon() { return new HairSalon.Builder(new HashMap<String,Object>()); }
  /**
   * A room is a distinguishable space within a structure, usually separated from other spaces by interior walls. (Source: Wikipedia, the free encyclopedia, see &lt;a href=&quot;http://en.wikipedia.org/wiki/Room&quot;&gt;http://en.wikipedia.org/wiki/Room&lt;/a&gt;).
&lt;br /&gt;&lt;br /&gt;
See also the &lt;a href=&quot;/docs/hotels.html&quot;&gt;dedicated document on the use of schema.org for marking up hotels and other forms of accommodations&lt;/a&gt;.
   */
  @NotNull public static Room.Builder room() { return new Room.Builder(new HashMap<String,Object>()); }
  /**
   * A cafe or coffee shop.
   */
  @NotNull public static CafeOrCoffeeShop.Builder cafeOrCoffeeShop() { return new CafeOrCoffeeShop.Builder(new HashMap<String,Object>()); }
  /**
   * The act of consuming static visual content.
   */
  @NotNull public static ViewAction.Builder viewAction() { return new ViewAction.Builder(new HashMap<String,Object>()); }
  /**
   * A summary of how users have interacted with this CreativeWork. In most cases, authors will use a subtype to specify the specific type of interaction.
   */
  @NotNull public static InteractionCounter.Builder interactionCounter() { return new InteractionCounter.Builder(new HashMap<String,Object>()); }
  /**
   * A subclass of Role used to describe roles within organizations.
   */
  @NotNull public static OrganizationRole.Builder organizationRole() { return new OrganizationRole.Builder(new HashMap<String,Object>()); }
  /**
   * The act of interacting with another person or organization.
   */
  @NotNull public static InteractAction.Builder interactAction() { return new InteractAction.Builder(new HashMap<String,Object>()); }
  /**
   * A house painting service.
   */
  @NotNull public static HousePainter.Builder housePainter() { return new HousePainter.Builder(new HashMap<String,Object>()); }
  /**
   * A medical study is an umbrella type covering all kinds of research studies relating to human medicine or health, including observational studies and interventional trials and registries, randomized, controlled or not. When the specific type of study is known, use one of the extensions of this type, such as MedicalTrial or MedicalObservationalStudy. Also, note that this type should be used to mark up data that describes the study itself; to tag an article that publishes the results of a study, use MedicalScholarlyArticle. Note: use the code property of MedicalEntity to store study IDs, e.g. clinicaltrials.gov ID.
   */
  @NotNull public static MedicalStudy.Builder medicalStudy() { return new MedicalStudy.Builder(new HashMap<String,Object>()); }
  /**
   * A reservation for train travel.&lt;br/&gt;&lt;br/&gt;

Note: This type is for information about actual reservations, e.g. in confirmation emails or HTML pages with individual confirmations of reservations. For offers of tickets, use &lt;a class=&quot;localLink&quot; href=&quot;http://schema.org/Offer&quot;&gt;Offer&lt;/a&gt;.
   */
  @NotNull public static TrainReservation.Builder trainReservation() { return new TrainReservation.Builder(new HashMap<String,Object>()); }
  /**
   * A subway station.
   */
  @NotNull public static SubwayStation.Builder subwayStation() { return new SubwayStation.Builder(new HashMap<String,Object>()); }
  /**
   * A product provided to consumers and businesses by financial institutions such as banks, insurance companies, brokerage firms, consumer finance companies, and investment companies which comprise the financial services industry.
   */
  @NotNull public static FinancialProduct.Builder financialProduct() { return new FinancialProduct.Builder(new HashMap<String,Object>()); }
  /**
   * A chemical or biologic substance, used as a medical therapy, that has a physiological effect on an organism. Here the term drug is used interchangeably with the term medicine although clinical knowledge make a clear difference between them.
   */
  @NotNull public static Drug.Builder drug() { return new Drug.Builder(new HashMap<String,Object>()); }
  /**
   * A blog.
   */
  @NotNull public static Blog.Builder blog() { return new Blog.Builder(new HashMap<String,Object>()); }
  /**
   * A gym.
   */
  @NotNull public static ExerciseGym.Builder exerciseGym() { return new ExerciseGym.Builder(new HashMap<String,Object>()); }
  /**
   * A city hall.
   */
  @NotNull public static CityHall.Builder cityHall() { return new CityHall.Builder(new HashMap<String,Object>()); }
  /**
   * A point value or interval for product characteristics and other purposes.
   */
  @NotNull public static QuantitativeValue.Builder quantitativeValue() { return new QuantitativeValue.Builder(new HashMap<String,Object>()); }
  /**
   * The act of conveying information to another person via a communication medium (instrument) such as speech, email, or telephone conversation.
   */
  @NotNull public static CommunicateAction.Builder communicateAction() { return new CommunicateAction.Builder(new HashMap<String,Object>()); }
  /**
   * An apartment (in American English) or flat (in British English) is a self-contained housing unit (a type of residential real estate) that occupies only part of a building (Source: Wikipedia, the free encyclopedia, see &lt;a href=&quot;http://en.wikipedia.org/wiki/Apartment&quot;&gt;http://en.wikipedia.org/wiki/Apartment&lt;/a&gt;).
   */
  @NotNull public static Apartment.Builder apartment() { return new Apartment.Builder(new HashMap<String,Object>()); }
  /**
   * A company or fund that gathers capital from a number of investors to create a pool of money that is then re-invested into stocks, bonds and other assets.
   */
  @NotNull public static InvestmentFund.Builder investmentFund() { return new InvestmentFund.Builder(new HashMap<String,Object>()); }
  /**
   * A Research project.
   */
  @NotNull public static ResearchProject.Builder researchProject() { return new ResearchProject.Builder(new HashMap<String,Object>()); }
  /**
   * The act of un-registering from a service.&lt;br/&gt;&lt;br/&gt;

Related actions:&lt;br/&gt;&lt;br/&gt;

&lt;ul&gt;
&lt;li&gt;&lt;a class=&quot;localLink&quot; href=&quot;http://schema.org/RegisterAction&quot;&gt;RegisterAction&lt;/a&gt;: antonym of UnRegisterAction.&lt;/li&gt;
&lt;li&gt;&lt;a class=&quot;localLink&quot; href=&quot;http://schema.org/LeaveAction&quot;&gt;LeaveAction&lt;/a&gt;: Unlike LeaveAction, UnRegisterAction implies that you are unregistering from a service you werer previously registered, rather than leaving a team/group of people.&lt;/li&gt;
&lt;/ul&gt;

   */
  @NotNull public static UnRegisterAction.Builder unRegisterAction() { return new UnRegisterAction.Builder(new HashMap<String,Object>()); }
  /**
   * An employment agency.
   */
  @NotNull public static EmploymentAgency.Builder employmentAgency() { return new EmploymentAgency.Builder(new HashMap<String,Object>()); }
  /**
   * A statement of the money due for goods or services; a bill.
   */
  @NotNull public static Invoice.Builder invoice() { return new Invoice.Builder(new HashMap<String,Object>()); }
  /**
   * A collection of music tracks.
   */
  @NotNull public static MusicAlbum.Builder musicAlbum() { return new MusicAlbum.Builder(new HashMap<String,Object>()); }
  /**
   * A furniture store.
   */
  @NotNull public static FurnitureStore.Builder furnitureStore() { return new FurnitureStore.Builder(new HashMap<String,Object>()); }
  /**
   * A Buddhist temple.
   */
  @NotNull public static BuddhistTemple.Builder buddhistTemple() { return new BuddhistTemple.Builder(new HashMap<String,Object>()); }
  /**
   * A large, usually printed placard, bill, or announcement, often illustrated, that is posted to advertise or publicize something.
   */
  @NotNull public static Poster.Builder poster() { return new Poster.Builder(new HashMap<String,Object>()); }
  /**
   * The act of producing a balanced opinion about the object for an audience. An agent reviews an object with participants resulting in a review.
   */
  @NotNull public static ReviewAction.Builder reviewAction() { return new ReviewAction.Builder(new HashMap<String,Object>()); }
  /**
   * The act of giving money in return for temporary use, but not ownership, of an object such as a vehicle or property. For example, an agent rents a property from a landlord in exchange for a periodic payment.
   */
  @NotNull public static RentAction.Builder rentAction() { return new RentAction.Builder(new HashMap<String,Object>()); }
  /**
   * A risk factor is anything that increases a person's likelihood of developing or contracting a disease, medical condition, or complication.
   */
  @NotNull public static MedicalRiskFactor.Builder medicalRiskFactor() { return new MedicalRiskFactor.Builder(new HashMap<String,Object>()); }
  /**
   * A ProductReturnPolicy provides information about product return policies associated with an &lt;a class=&quot;localLink&quot; href=&quot;http://schema.org/Organization&quot;&gt;Organization&lt;/a&gt; or &lt;a class=&quot;localLink&quot; href=&quot;http://schema.org/Product&quot;&gt;Product&lt;/a&gt;.
   */
  @NotNull public static ProductReturnPolicy.Builder productReturnPolicy() { return new ProductReturnPolicy.Builder(new HashMap<String,Object>()); }
  /**
   * Car repair business.
   */
  @NotNull public static AutoRepair.Builder autoRepair() { return new AutoRepair.Builder(new HashMap<String,Object>()); }
  /**
   * A river (for example, the broad majestic Shannon).
   */
  @NotNull public static RiverBodyOfWater.Builder riverBodyOfWater() { return new RiverBodyOfWater.Builder(new HashMap<String,Object>()); }
  /**
   * A specific branch of medical science that specializes in the care of women during the prenatal and postnatal care and with the delivery of the child.
   */
  @NotNull public static Obstetric.Builder obstetric() { return new Obstetric.Builder(new HashMap<String,Object>()); }
  /**
   * The act of momentarily pausing a device or application (e.g. pause music playback or pause a timer).
   */
  @NotNull public static SuspendAction.Builder suspendAction() { return new SuspendAction.Builder(new HashMap<String,Object>()); }
  /**
   * A means for accessing a service, e.g. a government office location, web site, or phone number.
   */
  @NotNull public static ServiceChannel.Builder serviceChannel() { return new ServiceChannel.Builder(new HashMap<String,Object>()); }
  /**
   * A medical organization (physical or not), such as hospital, institution or clinic.
   */
  @NotNull public static MedicalOrganization.Builder medicalOrganization() { return new MedicalOrganization.Builder(new HashMap<String,Object>()); }
  /**
   * The act of taking money from a buyer in exchange for goods or services rendered. An agent sells an object, product, or service to a buyer for a price. Reciprocal of BuyAction.
   */
  @NotNull public static SellAction.Builder sellAction() { return new SellAction.Builder(new HashMap<String,Object>()); }
  /**
   * UserInteraction and its subtypes is an old way of talking about users interacting with pages. It is generally better to use &lt;a class=&quot;localLink&quot; href=&quot;http://schema.org/Action&quot;&gt;Action&lt;/a&gt;-based vocabulary, alongside types such as &lt;a class=&quot;localLink&quot; href=&quot;http://schema.org/Comment&quot;&gt;Comment&lt;/a&gt;.
   */
  @NotNull public static UserPlays.Builder userPlays() { return new UserPlays.Builder(new HashMap<String,Object>()); }
  /**
   * A wholesale store.
   */
  @NotNull public static WholesaleStore.Builder wholesaleStore() { return new WholesaleStore.Builder(new HashMap<String,Object>()); }
  /**
   * A permit issued by a government agency.
   */
  @NotNull public static GovernmentPermit.Builder governmentPermit() { return new GovernmentPermit.Builder(new HashMap<String,Object>()); }
  /**
   * A recycling center.
   */
  @NotNull public static RecyclingCenter.Builder recyclingCenter() { return new RecyclingCenter.Builder(new HashMap<String,Object>()); }
  /**
   * A fast-food restaurant.
   */
  @NotNull public static FastFoodRestaurant.Builder fastFoodRestaurant() { return new FastFoodRestaurant.Builder(new HashMap<String,Object>()); }
  /**
   * The maximum dosing schedule considered safe for a drug or supplement as recommended by an authority or by the drug/supplement's manufacturer. Capture the recommending authority in the recognizingAuthority property of MedicalEntity.
   */
  @NotNull public static MaximumDoseSchedule.Builder maximumDoseSchedule() { return new MaximumDoseSchedule.Builder(new HashMap<String,Object>()); }
  /**
   * Any condition of the human body that affects the normal functioning of a person, whether physically or mentally. Includes diseases, injuries, disabilities, disorders, syndromes, etc.
   */
  @NotNull public static MedicalCondition.Builder medicalCondition() { return new MedicalCondition.Builder(new HashMap<String,Object>()); }
  /**
   * Computer programming source code. Example: Full (compile ready) solutions, code snippet samples, scripts, templates.
   */
  @NotNull public static SoftwareSourceCode.Builder softwareSourceCode() { return new SoftwareSourceCode.Builder(new HashMap<String,Object>()); }
  /**
   * A hospital.
   */
  @NotNull public static Hospital.Builder hospital() { return new Hospital.Builder(new HashMap<String,Object>()); }
  /**
   * A single, identifiable product instance (e.g. a laptop with a particular serial number).
   */
  @NotNull public static IndividualProduct.Builder individualProduct() { return new IndividualProduct.Builder(new HashMap<String,Object>()); }
  /**
   * Season dedicated to radio broadcast and associated online delivery.
   */
  @NotNull public static RadioSeason.Builder radioSeason() { return new RadioSeason.Builder(new HashMap<String,Object>()); }
  /**
   * A television station.
   */
  @NotNull public static TelevisionStation.Builder televisionStation() { return new TelevisionStation.Builder(new HashMap<String,Object>()); }
  /**
   * A waterfall, like Niagara.
   */
  @NotNull public static Waterfall.Builder waterfall() { return new Waterfall.Builder(new HashMap<String,Object>()); }
  /**
   * A delivery service through which content is provided via broadcast over the air or online.
   */
  @NotNull public static BroadcastService.Builder broadcastService() { return new BroadcastService.Builder(new HashMap<String,Object>()); }
  /**
   * The act of an agent communicating (service provider, social media, etc) their arrival by registering/confirming for a previously reserved service (e.g. flight check in) or at a place (e.g. hotel), possibly resulting in a result (boarding pass, etc).&lt;br/&gt;&lt;br/&gt;

Related actions:&lt;br/&gt;&lt;br/&gt;

&lt;ul&gt;
&lt;li&gt;&lt;a class=&quot;localLink&quot; href=&quot;http://schema.org/CheckOutAction&quot;&gt;CheckOutAction&lt;/a&gt;: The antonym of CheckInAction.&lt;/li&gt;
&lt;li&gt;&lt;a class=&quot;localLink&quot; href=&quot;http://schema.org/ArriveAction&quot;&gt;ArriveAction&lt;/a&gt;: Unlike ArriveAction, CheckInAction implies that the agent is informing/confirming the start of a previously reserved service.&lt;/li&gt;
&lt;li&gt;&lt;a class=&quot;localLink&quot; href=&quot;http://schema.org/ConfirmAction&quot;&gt;ConfirmAction&lt;/a&gt;: Unlike ConfirmAction, CheckInAction implies that the agent is informing/confirming the &lt;em&gt;start&lt;/em&gt; of a previously reserved service rather than its validity/existence.&lt;/li&gt;
&lt;/ul&gt;

   */
  @NotNull public static CheckInAction.Builder checkInAction() { return new CheckInAction.Builder(new HashMap<String,Object>()); }
  /**
   * The act of marrying a person.
   */
  @NotNull public static MarryAction.Builder marryAction() { return new MarryAction.Builder(new HashMap<String,Object>()); }
  /**
   * A graveyard.
   */
  @NotNull public static Cemetery.Builder cemetery() { return new Cemetery.Builder(new HashMap<String,Object>()); }
  /**
   * A public toilet is a room or small building containing one or more toilets (and possibly also urinals) which is available for use by the general public, or by customers or employees of certain businesses.
   */
  @NotNull public static PublicToilet.Builder publicToilet() { return new PublicToilet.Builder(new HashMap<String,Object>()); }
  /**
   * A performance group, such as a band, an orchestra, or a circus.
   */
  @NotNull public static PerformingGroup.Builder performingGroup() { return new PerformingGroup.Builder(new HashMap<String,Object>()); }
  /**
   * A specific branch of medical science that pertains to diagnosis and treatment of disorders of skin.
   */
  @NotNull public static Dermatology.Builder dermatology() { return new Dermatology.Builder(new HashMap<String,Object>()); }
  /**
   * A piece of sculpture.
   */
  @NotNull public static Sculpture.Builder sculpture() { return new Sculpture.Builder(new HashMap<String,Object>()); }
  /**
   * The act of deliberately creating/producing/generating/building a result out of the agent.
   */
  @NotNull public static CreateAction.Builder createAction() { return new CreateAction.Builder(new HashMap<String,Object>()); }
  /**
   * A file containing a note, primarily for the author.
   */
  @NotNull public static NoteDigitalDocument.Builder noteDigitalDocument() { return new NoteDigitalDocument.Builder(new HashMap<String,Object>()); }
  /**
   * A sequential publication of comic stories under a
    unifying title, for example &quot;The Amazing Spider-Man&quot; or &quot;Groo the
    Wanderer&quot;.
   */
  @NotNull public static ComicSeries.Builder comicSeries() { return new ComicSeries.Builder(new HashMap<String,Object>()); }
  /**
   * A geographical region, typically under the jurisdiction of a particular government.
   */
  @NotNull public static AdministrativeArea.Builder administrativeArea() { return new AdministrativeArea.Builder(new HashMap<String,Object>()); }
  /**
   * A property-value pair, e.g. representing a feature of a product or place. Use the 'name' property for the name of the property. If there is an additional human-readable version of the value, put that into the 'description' property.&lt;br/&gt;&lt;br/&gt;

Always use specific schema.org properties when a) they exist and b) you can populate them. Using PropertyValue as a substitute will typically not trigger the same effect as using the original, specific property.
   */
  @NotNull public static PropertyValue.Builder propertyValue() { return new PropertyValue.Builder(new HashMap<String,Object>()); }
  /**
   * A publication in any medium issued in successive parts bearing numerical or chronological designations and intended, such as a magazine, scholarly journal, or newspaper to continue indefinitely.&lt;br/&gt;&lt;br/&gt;

See also &lt;a href=&quot;http://blog.schema.org/2014/09/schemaorg-support-for-bibliographic_2.html&quot;&gt;blog post&lt;/a&gt;.
   */
  @NotNull public static Periodical.Builder periodical() { return new Periodical.Builder(new HashMap<String,Object>()); }
  /**
   * A medical procedure intended primarily for therapeutic purposes, aimed at improving a health condition.
   */
  @NotNull public static TherapeuticProcedure.Builder therapeuticProcedure() { return new TherapeuticProcedure.Builder(new HashMap<String,Object>()); }
  /**
   * A type of blood vessel that specifically carries lymph fluid unidirectionally toward the heart.
   */
  @NotNull public static LymphaticVessel.Builder lymphaticVessel() { return new LymphaticVessel.Builder(new HashMap<String,Object>()); }
  /**
   * A specific object or file containing a Legislation. Note that the same Legislation can be published in multiple files. For example, a digitally signed PDF, a plain PDF and an HTML version.
   */
  @NotNull public static LegislationObject.Builder legislationObject() { return new LegislationObject.Builder(new HashMap<String,Object>()); }
  /**
   * An agent approves/certifies/likes/supports/sanction an object.
   */
  @NotNull public static EndorseAction.Builder endorseAction() { return new EndorseAction.Builder(new HashMap<String,Object>()); }
  /**
   * A rating is an evaluation on a numeric scale, such as 1 to 5 stars.
   */
  @NotNull public static Rating.Builder rating() { return new Rating.Builder(new HashMap<String,Object>()); }
  /**
   * A short band of tough, flexible, fibrous connective tissue that functions to connect multiple bones, cartilages, and structurally support joints.
   */
  @NotNull public static Ligament.Builder ligament() { return new Ligament.Builder(new HashMap<String,Object>()); }
  /**
   * A lake (for example, Lake Pontrachain).
   */
  @NotNull public static LakeBodyOfWater.Builder lakeBodyOfWater() { return new LakeBodyOfWater.Builder(new HashMap<String,Object>()); }
  /**
   * A gas station.
   */
  @NotNull public static GasStation.Builder gasStation() { return new GasStation.Builder(new HashMap<String,Object>()); }
  /**
   * A government office&amp;#x2014;for example, an IRS or DMV office.
   */
  @NotNull public static GovernmentOffice.Builder governmentOffice() { return new GovernmentOffice.Builder(new HashMap<String,Object>()); }
  /**
   * A lodging business, such as a motel, hotel, or inn.
   */
  @NotNull public static LodgingBusiness.Builder lodgingBusiness() { return new LodgingBusiness.Builder(new HashMap<String,Object>()); }
  /**
   * A general contractor.
   */
  @NotNull public static GeneralContractor.Builder generalContractor() { return new GeneralContractor.Builder(new HashMap<String,Object>()); }
  /**
   * Anatomical features that can be observed by sight (without dissection), including the form and proportions of the human body as well as surface landmarks that correspond to deeper subcutaneous structures. Superficial anatomy plays an important role in sports medicine, phlebotomy, and other medical specialties as underlying anatomical structures can be identified through surface palpation. For example, during back surgery, superficial anatomy can be used to palpate and count vertebrae to find the site of incision. Or in phlebotomy, superficial anatomy can be used to locate an underlying vein; for example, the median cubital vein can be located by palpating the borders of the cubital fossa (such as the epicondyles of the humerus) and then looking for the superficial signs of the vein, such as size, prominence, ability to refill after depression, and feel of surrounding tissue support. As another example, in a subluxation (dislocation) of the glenohumeral joint, the bony structure becomes pronounced with the deltoid muscle failing to cover the glenohumeral joint allowing the edges of the scapula to be superficially visible. Here, the superficial anatomy is the visible edges of the scapula, implying the underlying dislocation of the joint (the related anatomical structure).
   */
  @NotNull public static SuperficialAnatomy.Builder superficialAnatomy() { return new SuperficialAnatomy.Builder(new HashMap<String,Object>()); }
  /**
   * An art gallery.
   */
  @NotNull public static ArtGallery.Builder artGallery() { return new ArtGallery.Builder(new HashMap<String,Object>()); }
  /**
   * The act of downloading an object.
   */
  @NotNull public static DownloadAction.Builder downloadAction() { return new DownloadAction.Builder(new HashMap<String,Object>()); }
  /**
   * The delivery of a parcel either via the postal service or a commercial service.
   */
  @NotNull public static ParcelDelivery.Builder parcelDelivery() { return new ParcelDelivery.Builder(new HashMap<String,Object>()); }
  /**
   * Natural languages such as Spanish, Tamil, Hindi, English, etc. Formal language code tags expressed in &lt;a href=&quot;https://en.wikipedia.org/wiki/IETF_language_tag&quot;&gt;BCP 47&lt;/a&gt; can be used via the &lt;a class=&quot;localLink&quot; href=&quot;http://schema.org/alternateName&quot;&gt;alternateName&lt;/a&gt; property. The Language type previously also covered programming languages such as Scheme and Lisp, which are now best represented using &lt;a class=&quot;localLink&quot; href=&quot;http://schema.org/ComputerLanguage&quot;&gt;ComputerLanguage&lt;/a&gt;.
   */
  @NotNull public static Language.Builder language() { return new Language.Builder(new HashMap<String,Object>()); }
  /**
   * Event type: Visual arts event.
   */
  @NotNull public static VisualArtsEvent.Builder visualArtsEvent() { return new VisualArtsEvent.Builder(new HashMap<String,Object>()); }
  /**
   * A review created by an end-user (e.g. consumer, purchaser, attendee etc.), in contrast with &lt;a class=&quot;localLink&quot; href=&quot;http://schema.org/CriticReview&quot;&gt;CriticReview&lt;/a&gt;.
   */
  @NotNull public static UserReview.Builder userReview() { return new UserReview.Builder(new HashMap<String,Object>()); }
  /**
   * A single episode of a podcast series.
   */
  @NotNull public static PodcastEpisode.Builder podcastEpisode() { return new PodcastEpisode.Builder(new HashMap<String,Object>()); }
  /**
   * A library.
   */
  @NotNull public static Library.Builder library() { return new Library.Builder(new HashMap<String,Object>()); }
  /**
   * An agent tracks an object for updates.&lt;br/&gt;&lt;br/&gt;

Related actions:&lt;br/&gt;&lt;br/&gt;

&lt;ul&gt;
&lt;li&gt;&lt;a class=&quot;localLink&quot; href=&quot;http://schema.org/FollowAction&quot;&gt;FollowAction&lt;/a&gt;: Unlike FollowAction, TrackAction refers to the interest on the location of innanimates objects.&lt;/li&gt;
&lt;li&gt;&lt;a class=&quot;localLink&quot; href=&quot;http://schema.org/SubscribeAction&quot;&gt;SubscribeAction&lt;/a&gt;: Unlike SubscribeAction, TrackAction refers to  the interest on the location of innanimate objects.&lt;/li&gt;
&lt;/ul&gt;

   */
  @NotNull public static TrackAction.Builder trackAction() { return new TrackAction.Builder(new HashMap<String,Object>()); }
  /**
   * A common pathway for the electrochemical nerve impulses that are transmitted along each of the axons.
   */
  @NotNull public static Nerve.Builder nerve() { return new Nerve.Builder(new HashMap<String,Object>()); }
  /**
   * The act of an agent relocating to a place.&lt;br/&gt;&lt;br/&gt;

Related actions:&lt;br/&gt;&lt;br/&gt;

&lt;ul&gt;
&lt;li&gt;&lt;a class=&quot;localLink&quot; href=&quot;http://schema.org/TransferAction&quot;&gt;TransferAction&lt;/a&gt;: Unlike TransferAction, the subject of the move is a living Person or Organization rather than an inanimate object.&lt;/li&gt;
&lt;/ul&gt;

   */
  @NotNull public static MoveAction.Builder moveAction() { return new MoveAction.Builder(new HashMap<String,Object>()); }
  /**
   * Residence type: Apartment complex.
   */
  @NotNull public static ApartmentComplex.Builder apartmentComplex() { return new ApartmentComplex.Builder(new HashMap<String,Object>()); }
  /**
   * A locksmith.
   */
  @NotNull public static Locksmith.Builder locksmith() { return new Locksmith.Builder(new HashMap<String,Object>()); }
  /**
   * A specific branch of medical science that specializes in the care of infants, children and adolescents.
   */
  @NotNull public static Pediatric.Builder pediatric() { return new Pediatric.Builder(new HashMap<String,Object>()); }
  /**
   * A unique instance of a television BroadcastService on a CableOrSatelliteService lineup.
   */
  @NotNull public static TelevisionChannel.Builder televisionChannel() { return new TelevisionChannel.Builder(new HashMap<String,Object>()); }
  /**
   * A QAPage is a WebPage focussed on a specific Question and its Answer(s), e.g. in a question answering site or documenting Frequently Asked Questions (FAQs).
   */
  @NotNull public static QAPage.Builder qAPage() { return new QAPage.Builder(new HashMap<String,Object>()); }
  /**
   * A &lt;a class=&quot;localLink&quot; href=&quot;http://schema.org/CompleteDataFeed&quot;&gt;CompleteDataFeed&lt;/a&gt; is a &lt;a class=&quot;localLink&quot; href=&quot;http://schema.org/DataFeed&quot;&gt;DataFeed&lt;/a&gt; whose standard representation includes content for every item currently in the feed.&lt;br/&gt;&lt;br/&gt;

This is the equivalent of Atom's element as defined in Feed Paging and Archiving &lt;a href=&quot;https://tools.ietf.org/html/rfc5005&quot;&gt;RFC 5005&lt;/a&gt;, For example (and as defined for Atom), when using data from a feed that represents a collection of items that varies over time (e.g. &quot;Top Twenty Records&quot;) there is no need to have newer entries mixed in alongside older, obsolete entries. By marking this feed as a CompleteDataFeed, old entries can be safely discarded when the feed is refreshed, since we can assume the feed has provided descriptions for all current items.
   */
  @NotNull public static CompleteDataFeed.Builder completeDataFeed() { return new CompleteDataFeed.Builder(new HashMap<String,Object>()); }
  /**
   * Used to describe membership in a loyalty programs (e.g. &quot;StarAliance&quot;), traveler clubs (e.g. &quot;AAA&quot;), purchase clubs (&quot;Safeway Club&quot;), etc.
   */
  @NotNull public static ProgramMembership.Builder programMembership() { return new ProgramMembership.Builder(new HashMap<String,Object>()); }
  /**
   * A step in the instructions for how to achieve a result. It is an ordered list with HowToDirection and/or HowToTip items.
   */
  @NotNull public static HowToStep.Builder howToStep() { return new HowToStep.Builder(new HashMap<String,Object>()); }
  /**
   * An agent controls a device or application.
   */
  @NotNull public static ControlAction.Builder controlAction() { return new ControlAction.Builder(new HashMap<String,Object>()); }
  /**
   * A mountain, like Mount Whitney or Mount Everest.
   */
  @NotNull public static Mountain.Builder mountain() { return new Mountain.Builder(new HashMap<String,Object>()); }
  /**
   * A part of a successively published publication such as a periodical or multi-volume work, often numbered. It may represent a time span, such as a year.&lt;br/&gt;&lt;br/&gt;

See also &lt;a href=&quot;http://blog.schema.org/2014/09/schemaorg-support-for-bibliographic_2.html&quot;&gt;blog post&lt;/a&gt;.
   */
  @NotNull public static PublicationVolume.Builder publicationVolume() { return new PublicationVolume.Builder(new HashMap<String,Object>()); }
  /**
   * A tire shop.
   */
  @NotNull public static TireShop.Builder tireShop() { return new TireShop.Builder(new HashMap<String,Object>()); }
  /**
   * An over the air or online broadcast event.
   */
  @NotNull public static BroadcastEvent.Builder broadcastEvent() { return new BroadcastEvent.Builder(new HashMap<String,Object>()); }
  /**
   * A trip on a commercial bus line.
   */
  @NotNull public static BusTrip.Builder busTrip() { return new BusTrip.Builder(new HashMap<String,Object>()); }
  /**
   * A bar or pub.
   */
  @NotNull public static BarOrPub.Builder barOrPub() { return new BarOrPub.Builder(new HashMap<String,Object>()); }
  /**
   * An &lt;a class=&quot;localLink&quot; href=&quot;http://schema.org/OfferForPurchase&quot;&gt;OfferForPurchase&lt;/a&gt; in Schema.org represents an &lt;a class=&quot;localLink&quot; href=&quot;http://schema.org/Offer&quot;&gt;Offer&lt;/a&gt; to sell something, i.e. an &lt;a class=&quot;localLink&quot; href=&quot;http://schema.org/Offer&quot;&gt;Offer&lt;/a&gt; whose
  &lt;a class=&quot;localLink&quot; href=&quot;http://schema.org/businessFunction&quot;&gt;businessFunction&lt;/a&gt; is &lt;a href=&quot;http://purl.org/goodrelations/v1#Sell.&quot;&gt;sell&lt;/a&gt;. See &lt;a href=&quot;https://en.wikipedia.org/wiki/GoodRelations&quot;&gt;Good Relations&lt;/a&gt; for
  background on the underlying concepts.
   */
  @NotNull public static OfferForPurchase.Builder offerForPurchase() { return new OfferForPurchase.Builder(new HashMap<String,Object>()); }
  /**
   * The act of transferring ownership of an object to a destination. Reciprocal of TakeAction.&lt;br/&gt;&lt;br/&gt;

Related actions:&lt;br/&gt;&lt;br/&gt;

&lt;ul&gt;
&lt;li&gt;&lt;a class=&quot;localLink&quot; href=&quot;http://schema.org/TakeAction&quot;&gt;TakeAction&lt;/a&gt;: Reciprocal of GiveAction.&lt;/li&gt;
&lt;li&gt;&lt;a class=&quot;localLink&quot; href=&quot;http://schema.org/SendAction&quot;&gt;SendAction&lt;/a&gt;: Unlike SendAction, GiveAction implies that ownership is being transferred (e.g. I may send my laptop to you, but that doesn't mean I'm giving it to you).&lt;/li&gt;
&lt;/ul&gt;

   */
  @NotNull public static GiveAction.Builder giveAction() { return new GiveAction.Builder(new HashMap<String,Object>()); }
  /**
   * A ski resort.
   */
  @NotNull public static SkiResort.Builder skiResort() { return new SkiResort.Builder(new HashMap<String,Object>()); }
  /**
   * A specific branch of medical science that pertains to therapeutic or cosmetic repair or re-formation of missing, injured or malformed tissues or body parts by manual and instrumental means.
   */
  @NotNull public static PlasticSurgery.Builder plasticSurgery() { return new PlasticSurgery.Builder(new HashMap<String,Object>()); }
  /**
   * Scheduling future actions, events, or tasks.&lt;br/&gt;&lt;br/&gt;

Related actions:&lt;br/&gt;&lt;br/&gt;

&lt;ul&gt;
&lt;li&gt;&lt;a class=&quot;localLink&quot; href=&quot;http://schema.org/ReserveAction&quot;&gt;ReserveAction&lt;/a&gt;: Unlike ReserveAction, ScheduleAction allocates future actions (e.g. an event, a task, etc) towards a time slot / spatial allocation.&lt;/li&gt;
&lt;/ul&gt;

   */
  @NotNull public static ScheduleAction.Builder scheduleAction() { return new ScheduleAction.Builder(new HashMap<String,Object>()); }
  /**
   * A food service, like breakfast, lunch, or dinner.
   */
  @NotNull public static FoodService.Builder foodService() { return new FoodService.Builder(new HashMap<String,Object>()); }
  /**
   * An article, such as a news article or piece of investigative report. Newspapers and magazines have articles of many different types and this is intended to cover them all.&lt;br/&gt;&lt;br/&gt;

See also &lt;a href=&quot;http://blog.schema.org/2014/09/schemaorg-support-for-bibliographic_2.html&quot;&gt;blog post&lt;/a&gt;.
   */
  @NotNull public static Article.Builder article() { return new Article.Builder(new HashMap<String,Object>()); }
  /**
   * An agent bookmarks/flags/labels/tags/marks an object.
   */
  @NotNull public static BookmarkAction.Builder bookmarkAction() { return new BookmarkAction.Builder(new HashMap<String,Object>()); }
  /**
   * Place of worship, such as a church, synagogue, or mosque.
   */
  @NotNull public static PlaceOfWorship.Builder placeOfWorship() { return new PlaceOfWorship.Builder(new HashMap<String,Object>()); }
  /**
   * A state or province of a country.
   */
  @NotNull public static State.Builder state() { return new State.Builder(new HashMap<String,Object>()); }
  /**
   * Original definition: &quot;provider of professional services.&quot;&lt;br/&gt;&lt;br/&gt;

The general &lt;a class=&quot;localLink&quot; href=&quot;http://schema.org/ProfessionalService&quot;&gt;ProfessionalService&lt;/a&gt; type for local businesses was deprecated due to confusion with &lt;a class=&quot;localLink&quot; href=&quot;http://schema.org/Service&quot;&gt;Service&lt;/a&gt;. For reference, the types that it included were: &lt;a class=&quot;localLink&quot; href=&quot;http://schema.org/Dentist&quot;&gt;Dentist&lt;/a&gt;,
        &lt;a class=&quot;localLink&quot; href=&quot;http://schema.org/AccountingService&quot;&gt;AccountingService&lt;/a&gt;, &lt;a class=&quot;localLink&quot; href=&quot;http://schema.org/Attorney&quot;&gt;Attorney&lt;/a&gt;, &lt;a class=&quot;localLink&quot; href=&quot;http://schema.org/Notary&quot;&gt;Notary&lt;/a&gt;, as well as types for several kinds of &lt;a class=&quot;localLink&quot; href=&quot;http://schema.org/HomeAndConstructionBusiness&quot;&gt;HomeAndConstructionBusiness&lt;/a&gt;: &lt;a class=&quot;localLink&quot; href=&quot;http://schema.org/Electrician&quot;&gt;Electrician&lt;/a&gt;, &lt;a class=&quot;localLink&quot; href=&quot;http://schema.org/GeneralContractor&quot;&gt;GeneralContractor&lt;/a&gt;,
        &lt;a class=&quot;localLink&quot; href=&quot;http://schema.org/HousePainter&quot;&gt;HousePainter&lt;/a&gt;, &lt;a class=&quot;localLink&quot; href=&quot;http://schema.org/Locksmith&quot;&gt;Locksmith&lt;/a&gt;, &lt;a class=&quot;localLink&quot; href=&quot;http://schema.org/Plumber&quot;&gt;Plumber&lt;/a&gt;, &lt;a class=&quot;localLink&quot; href=&quot;http://schema.org/RoofingContractor&quot;&gt;RoofingContractor&lt;/a&gt;. &lt;a class=&quot;localLink&quot; href=&quot;http://schema.org/LegalService&quot;&gt;LegalService&lt;/a&gt; was introduced as a more inclusive supertype of &lt;a class=&quot;localLink&quot; href=&quot;http://schema.org/Attorney&quot;&gt;Attorney&lt;/a&gt;.
   */
  @NotNull public static ProfessionalService.Builder professionalService() { return new ProfessionalService.Builder(new HashMap<String,Object>()); }
  /**
   * A compound price specification is one that bundles multiple prices that all apply in combination for different dimensions of consumption. Use the name property of the attached unit price specification for indicating the dimension of a price component (e.g. &quot;electricity&quot; or &quot;final cleaning&quot;).
   */
  @NotNull public static CompoundPriceSpecification.Builder compoundPriceSpecification() { return new CompoundPriceSpecification.Builder(new HashMap<String,Object>()); }
  /**
   * A distillery.
   */
  @NotNull public static Distillery.Builder distillery() { return new Distillery.Builder(new HashMap<String,Object>()); }
  /**
   * The artwork on the cover of a comic.
   */
  @NotNull public static ComicCoverArt.Builder comicCoverArt() { return new ComicCoverArt.Builder(new HashMap<String,Object>()); }
  /**
   * A navigation element of the page.
   */
  @NotNull public static SiteNavigationElement.Builder siteNavigationElement() { return new SiteNavigationElement.Builder(new HashMap<String,Object>()); }
  /**
   * The act of producing/preparing food.
   */
  @NotNull public static CookAction.Builder cookAction() { return new CookAction.Builder(new HashMap<String,Object>()); }
  /**
   * Printed music, as opposed to performed or recorded music.
   */
  @NotNull public static SheetMusic.Builder sheetMusic() { return new SheetMusic.Builder(new HashMap<String,Object>()); }
  /**
   * A direction indicating a single action to do in the instructions for how to achieve a result.
   */
  @NotNull public static HowToDirection.Builder howToDirection() { return new HowToDirection.Builder(new HashMap<String,Object>()); }
  /**
   * An audiobook.
   */
  @NotNull public static Audiobook.Builder audiobook() { return new Audiobook.Builder(new HashMap<String,Object>()); }
  /**
   * The most generic type of item.
   */
  @NotNull public static Thing.Builder thing() { return new Thing.Builder(new HashMap<String,Object>()); }
  /**
   * An image file.
   */
  @NotNull public static ImageObject.Builder imageObject() { return new ImageObject.Builder(new HashMap<String,Object>()); }
  /**
   * The act of starting or activating a device or application (e.g. starting a timer or turning on a flashlight).
   */
  @NotNull public static ActivateAction.Builder activateAction() { return new ActivateAction.Builder(new HashMap<String,Object>()); }
  /**
   * A loan in which property or real estate is used as collateral. (A loan securitized against some real estate.)
   */
  @NotNull public static MortgageLoan.Builder mortgageLoan() { return new MortgageLoan.Builder(new HashMap<String,Object>()); }
  /**
   * Organization: Sports team.
   */
  @NotNull public static SportsTeam.Builder sportsTeam() { return new SportsTeam.Builder(new HashMap<String,Object>()); }
  /**
   * An event venue.
   */
  @NotNull public static EventVenue.Builder eventVenue() { return new EventVenue.Builder(new HashMap<String,Object>()); }
  /**
   * An instance of a &lt;a class=&quot;localLink&quot; href=&quot;http://schema.org/Course&quot;&gt;Course&lt;/a&gt; which is distinct from other instances because it is offered at a different time or location or through different media or modes of study or to a specific section of students.
   */
  @NotNull public static CourseInstance.Builder courseInstance() { return new CourseInstance.Builder(new HashMap<String,Object>()); }
  /**
   * The science or practice of testing visual acuity and prescribing corrective lenses.
   */
  @NotNull public static Optometric.Builder optometric() { return new Optometric.Builder(new HashMap<String,Object>()); }
  /**
   * A NewsArticle is an article whose content reports news, or provides background context and supporting materials for understanding the news.&lt;br/&gt;&lt;br/&gt;

A more detailed overview of &lt;a href=&quot;/docs/news.html&quot;&gt;schema.org News markup&lt;/a&gt; is also available.
   */
  @NotNull public static NewsArticle.Builder newsArticle() { return new NewsArticle.Builder(new HashMap<String,Object>()); }
  /**
   * A statistical distribution of monetary amounts.
   */
  @NotNull public static MonetaryAmountDistribution.Builder monetaryAmountDistribution() { return new MonetaryAmountDistribution.Builder(new HashMap<String,Object>()); }
  /**
   * Organization: A business corporation.
   */
  @NotNull public static Corporation.Builder corporation() { return new Corporation.Builder(new HashMap<String,Object>()); }
  /**
   * A sports location, such as a playing field.
   */
  @NotNull public static SportsActivityLocation.Builder sportsActivityLocation() { return new SportsActivityLocation.Builder(new HashMap<String,Object>()); }
  /**
   * Text representing a CSS selector.
   */
  @NotNull public static CssSelectorType.Builder cssSelectorType() { return new CssSelectorType.Builder(new HashMap<String,Object>()); }
  /**
   * An airport.
   */
  @NotNull public static Airport.Builder airport() { return new Airport.Builder(new HashMap<String,Object>()); }
  /**
   * Any medical intervention designed to prevent, treat, and cure human diseases and medical conditions, including both curative and palliative therapies. Medical therapies are typically processes of care relying upon pharmacotherapy, behavioral therapy, supportive therapy (with fluid or nutrition for example), or detoxification (e.g. hemodialysis) aimed at improving or preventing a health condition.
   */
  @NotNull public static MedicalTherapy.Builder medicalTherapy() { return new MedicalTherapy.Builder(new HashMap<String,Object>()); }
  /**
   * Used to describe a seat, such as a reserved seat in an event reservation.
   */
  @NotNull public static Seat.Builder seat() { return new Seat.Builder(new HashMap<String,Object>()); }
  /**
   * A created collection of Creative Works or other artefacts.
   */
  @NotNull public static Collection.Builder collection() { return new Collection.Builder(new HashMap<String,Object>()); }
  /**
   * An office equipment store.
   */
  @NotNull public static OfficeEquipmentStore.Builder officeEquipmentStore() { return new OfficeEquipmentStore.Builder(new HashMap<String,Object>()); }
  /**
   * Any feature associated or not with a medical condition. In medicine a symptom is generally subjective while a sign is objective.
   */
  @NotNull public static MedicalSignOrSymptom.Builder medicalSignOrSymptom() { return new MedicalSignOrSymptom.Builder(new HashMap<String,Object>()); }
  /**
   * Any medical test, typically performed for diagnostic purposes.
   */
  @NotNull public static MedicalTest.Builder medicalTest() { return new MedicalTest.Builder(new HashMap<String,Object>()); }
  /**
   * A Service to transfer funds from a person or organization to a beneficiary person or organization.
   */
  @NotNull public static PaymentService.Builder paymentService() { return new PaymentService.Builder(new HashMap<String,Object>()); }
  /**
   * A type of Bank Account with a main purpose of depositing funds to gain interest or other benefits.
   */
  @NotNull public static DepositAccount.Builder depositAccount() { return new DepositAccount.Builder(new HashMap<String,Object>()); }
  /**
   * A monetary value or range. This type can be used to describe an amount of money such as $50 USD, or a range as in describing a bank account being suitable for a balance between &pound;1,000 and &pound;1,000,000 GBP, or the value of a salary, etc. It is recommended to use &lt;a class=&quot;localLink&quot; href=&quot;http://schema.org/PriceSpecification&quot;&gt;PriceSpecification&lt;/a&gt; Types to describe the price of an Offer, Invoice, etc.
   */
  @NotNull public static MonetaryAmount.Builder monetaryAmount() { return new MonetaryAmount.Builder(new HashMap<String,Object>()); }
  /**
   * The act of arriving at a place. An agent arrives at a destination from a fromLocation, optionally with participants.
   */
  @NotNull public static ArriveAction.Builder arriveAction() { return new ArriveAction.Builder(new HashMap<String,Object>()); }
  /**
   * Computer programming source code. Example: Full (compile ready) solutions, code snippet samples, scripts, templates.
   */
  @NotNull public static Code.Builder code() { return new Code.Builder(new HashMap<String,Object>()); }
  /**
   * A structured value providing information about when a certain organization or person owned a certain product.
   */
  @NotNull public static OwnershipInfo.Builder ownershipInfo() { return new OwnershipInfo.Builder(new HashMap<String,Object>()); }
  /**
   * (editorial work in progress, this definition is incomplete and unreviewed)
    A &lt;a class=&quot;localLink&quot; href=&quot;http://schema.org/MediaReview&quot;&gt;MediaReview&lt;/a&gt; is a more specialized form of Review dedicated to the evaluation of media content online, typically in the context of fact-checking and misinformation.
    For more general reviews of media in the broader sense, use &lt;a class=&quot;localLink&quot; href=&quot;http://schema.org/UserReview&quot;&gt;UserReview&lt;/a&gt;, &lt;a class=&quot;localLink&quot; href=&quot;http://schema.org/CriticReview&quot;&gt;CriticReview&lt;/a&gt; or other &lt;a class=&quot;localLink&quot; href=&quot;http://schema.org/Review&quot;&gt;Review&lt;/a&gt; types.
   */
  @NotNull public static MediaReview.Builder mediaReview() { return new MediaReview.Builder(new HashMap<String,Object>()); }
  /**
   * An amusement park.
   */
  @NotNull public static AmusementPark.Builder amusementPark() { return new AmusementPark.Builder(new HashMap<String,Object>()); }
  /**
   * An accommodation is a place that can accommodate human beings, e.g. a hotel room, a camping pitch, or a meeting room. Many accommodations are for overnight stays, but this is not a mandatory requirement.
For more specific types of accommodations not defined in schema.org, one can use additionalType with external vocabularies.
&lt;br /&gt;&lt;br /&gt;
See also the &lt;a href=&quot;/docs/hotels.html&quot;&gt;dedicated document on the use of schema.org for marking up hotels and other forms of accommodations&lt;/a&gt;.
   */
  @NotNull public static Accommodation.Builder accommodation() { return new Accommodation.Builder(new HashMap<String,Object>()); }
  /**
   * A &lt;a class=&quot;localLink&quot; href=&quot;http://schema.org/RealEstateListing&quot;&gt;RealEstateListing&lt;/a&gt; is a listing that describes one or more real-estate &lt;a class=&quot;localLink&quot; href=&quot;http://schema.org/Offer&quot;&gt;Offer&lt;/a&gt;s (whose &lt;a class=&quot;localLink&quot; href=&quot;http://schema.org/businessFunction&quot;&gt;businessFunction&lt;/a&gt; is typically to lease out, or to sell).
  The &lt;a class=&quot;localLink&quot; href=&quot;http://schema.org/RealEstateListing&quot;&gt;RealEstateListing&lt;/a&gt; type itself represents the overall listing, as manifested in some &lt;a class=&quot;localLink&quot; href=&quot;http://schema.org/WebPage&quot;&gt;WebPage&lt;/a&gt;.
   */
  @NotNull public static RealEstateListing.Builder realEstateListing() { return new RealEstateListing.Builder(new HashMap<String,Object>()); }
  /**
   * A statistical distribution of values.
   */
  @NotNull public static QuantitativeValueDistribution.Builder quantitativeValueDistribution() { return new QuantitativeValueDistribution.Builder(new HashMap<String,Object>()); }
  /**
   * A restaurant.
   */
  @NotNull public static Restaurant.Builder restaurant() { return new Restaurant.Builder(new HashMap<String,Object>()); }
  /**
   * A facility, often associated with a hospital or medical school, that is devoted to the specific diagnosis and/or healthcare. Previously limited to outpatients but with evolution it may be open to inpatients as well.
   */
  @NotNull public static MedicalClinic.Builder medicalClinic() { return new MedicalClinic.Builder(new HashMap<String,Object>()); }
  /**
   * A SpeakableSpecification indicates (typically via &lt;a class=&quot;localLink&quot; href=&quot;http://schema.org/xpath&quot;&gt;xpath&lt;/a&gt; or &lt;a class=&quot;localLink&quot; href=&quot;http://schema.org/cssSelector&quot;&gt;cssSelector&lt;/a&gt;) sections of a document that are highlighted as particularly &lt;a class=&quot;localLink&quot; href=&quot;http://schema.org/speakable&quot;&gt;speakable&lt;/a&gt;. Instances of this type are expected to be used primarily as values of the &lt;a class=&quot;localLink&quot; href=&quot;http://schema.org/speakable&quot;&gt;speakable&lt;/a&gt; property.
   */
  @NotNull public static SpeakableSpecification.Builder speakableSpecification() { return new SpeakableSpecification.Builder(new HashMap<String,Object>()); }
  /**
   * CreativeWorkSeries dedicated to radio broadcast and associated online delivery.
   */
  @NotNull public static RadioSeries.Builder radioSeries() { return new RadioSeries.Builder(new HashMap<String,Object>()); }
  /**
   * A publication containing information about varied topics that are pertinent to general information, a geographic area, or a specific subject matter (i.e. business, culture, education). Often published daily.
   */
  @NotNull public static Newspaper.Builder newspaper() { return new Newspaper.Builder(new HashMap<String,Object>()); }
  /**
   * A movie theater.
   */
  @NotNull public static MovieTheater.Builder movieTheater() { return new MovieTheater.Builder(new HashMap<String,Object>()); }
  /**
   * A convenience store.
   */
  @NotNull public static ConvenienceStore.Builder convenienceStore() { return new ConvenienceStore.Builder(new HashMap<String,Object>()); }
  /**
   * A reservoir of water, typically an artificially created lake, like the Lake Kariba reservoir.
   */
  @NotNull public static Reservoir.Builder reservoir() { return new Reservoir.Builder(new HashMap<String,Object>()); }
  /**
   * The act of manipulating/administering/supervising/controlling one or more objects.
   */
  @NotNull public static OrganizeAction.Builder organizeAction() { return new OrganizeAction.Builder(new HashMap<String,Object>()); }
  /**
   * A collection or bound volume of maps, charts, plates or tables, physical or in media form illustrating any subject.
   */
  @NotNull public static Atlas.Builder atlas() { return new Atlas.Builder(new HashMap<String,Object>()); }
  /**
   * Used to describe a ticket to an event, a flight, a bus ride, etc.
   */
  @NotNull public static Ticket.Builder ticket() { return new Ticket.Builder(new HashMap<String,Object>()); }
  /**
   * The act of  departing from a place. An agent departs from an fromLocation for a destination, optionally with participants.
   */
  @NotNull public static DepartAction.Builder departAction() { return new DepartAction.Builder(new HashMap<String,Object>()); }
  /**
   * A hardware store.
   */
  @NotNull public static HardwareStore.Builder hardwareStore() { return new HardwareStore.Builder(new HashMap<String,Object>()); }
  /**
   * A value indicating a special usage of a car, e.g. commercial rental, driving school, or as a taxi.
   */
  @NotNull public static CarUsageType.Builder carUsageType() { return new CarUsageType.Builder(new HashMap<String,Object>()); }
  /**
   * A post to a social media platform, including blog posts, tweets, Facebook posts, etc.
   */
  @NotNull public static SocialMediaPosting.Builder socialMediaPosting() { return new SocialMediaPosting.Builder(new HashMap<String,Object>()); }
  /**
   * A thesis or dissertation document submitted in support of candidature for an academic degree or professional qualification.
   */
  @NotNull public static Thesis.Builder thesis() { return new Thesis.Builder(new HashMap<String,Object>()); }
  /**
   * A file containing slides or used for a presentation.
   */
  @NotNull public static PresentationDigitalDocument.Builder presentationDigitalDocument() { return new PresentationDigitalDocument.Builder(new HashMap<String,Object>()); }
  /**
   * The act of physically/electronically dispatching an object for transfer from an origin to a destination.Related actions:&lt;br/&gt;&lt;br/&gt;

&lt;ul&gt;
&lt;li&gt;&lt;a class=&quot;localLink&quot; href=&quot;http://schema.org/ReceiveAction&quot;&gt;ReceiveAction&lt;/a&gt;: The reciprocal of SendAction.&lt;/li&gt;
&lt;li&gt;&lt;a class=&quot;localLink&quot; href=&quot;http://schema.org/GiveAction&quot;&gt;GiveAction&lt;/a&gt;: Unlike GiveAction, SendAction does not imply the transfer of ownership (e.g. I can send you my laptop, but I'm not necessarily giving it to you).&lt;/li&gt;
&lt;/ul&gt;

   */
  @NotNull public static SendAction.Builder sendAction() { return new SendAction.Builder(new HashMap<String,Object>()); }
  /**
   * A posting to a discussion forum.
   */
  @NotNull public static DiscussionForumPosting.Builder discussionForumPosting() { return new DiscussionForumPosting.Builder(new HashMap<String,Object>()); }
  /**
   * A publication event e.g. catch-up TV or radio podcast, during which a program is available on-demand.
   */
  @NotNull public static OnDemandEvent.Builder onDemandEvent() { return new OnDemandEvent.Builder(new HashMap<String,Object>()); }
  /**
   * An account that allows an investor to deposit funds and place investment orders with a licensed broker or brokerage firm.
   */
  @NotNull public static BrokerageAccount.Builder brokerageAccount() { return new BrokerageAccount.Builder(new HashMap<String,Object>()); }
  /**
   * Any object used in a medical capacity, such as to diagnose or treat a patient.
   */
  @NotNull public static MedicalDevice.Builder medicalDevice() { return new MedicalDevice.Builder(new HashMap<String,Object>()); }
  /**
   * A medical test performed on a sample of a patient's blood.
   */
  @NotNull public static BloodTest.Builder bloodTest() { return new BloodTest.Builder(new HashMap<String,Object>()); }
  /**
   * A pharmacy or drugstore.
   */
  @NotNull public static Pharmacy.Builder pharmacy() { return new Pharmacy.Builder(new HashMap<String,Object>()); }
  /**
   * A series of movies. Included movies can be indicated with the hasPart property.
   */
  @NotNull public static MovieSeries.Builder movieSeries() { return new MovieSeries.Builder(new HashMap<String,Object>()); }
  /**
   * An electronic file or document.
   */
  @NotNull public static DigitalDocument.Builder digitalDocument() { return new DigitalDocument.Builder(new HashMap<String,Object>()); }
  /**
   * A Category Code.
   */
  @NotNull public static CategoryCode.Builder categoryCode() { return new CategoryCode.Builder(new HashMap<String,Object>()); }
  /**
   * The act of registering to be a user of a service, product or web page.&lt;br/&gt;&lt;br/&gt;

Related actions:&lt;br/&gt;&lt;br/&gt;

&lt;ul&gt;
&lt;li&gt;&lt;a class=&quot;localLink&quot; href=&quot;http://schema.org/JoinAction&quot;&gt;JoinAction&lt;/a&gt;: Unlike JoinAction, RegisterAction implies you are registering to be a user of a service, &lt;em&gt;not&lt;/em&gt; a group/team of people.&lt;/li&gt;
&lt;li&gt;[FollowAction]]: Unlike FollowAction, RegisterAction doesn't imply that the agent is expecting to poll for updates from the object.&lt;/li&gt;
&lt;li&gt;&lt;a class=&quot;localLink&quot; href=&quot;http://schema.org/SubscribeAction&quot;&gt;SubscribeAction&lt;/a&gt;: Unlike SubscribeAction, RegisterAction doesn't imply that the agent is expecting updates from the object.&lt;/li&gt;
&lt;/ul&gt;

   */
  @NotNull public static RegisterAction.Builder registerAction() { return new RegisterAction.Builder(new HashMap<String,Object>()); }
  /**
   * A specific dosing schedule for a drug or supplement.
   */
  @NotNull public static DoseSchedule.Builder doseSchedule() { return new DoseSchedule.Builder(new HashMap<String,Object>()); }
  /**
   * An historical landmark or building.
   */
  @NotNull public static LandmarksOrHistoricalBuildings.Builder landmarksOrHistoricalBuildings() { return new LandmarksOrHistoricalBuildings.Builder(new HashMap<String,Object>()); }
  /**
   * Event type: Exhibition event, e.g. at a museum, library, archive, tradeshow, ...
   */
  @NotNull public static ExhibitionEvent.Builder exhibitionEvent() { return new ExhibitionEvent.Builder(new HashMap<String,Object>()); }
  /**
   * A web page. Every web page is implicitly assumed to be declared to be of type WebPage, so the various properties about that webpage, such as &lt;code&gt;breadcrumb&lt;/code&gt; may be used. We recommend explicit declaration if these properties are specified, but if they are found outside of an itemscope, they will be assumed to be about the page.
   */
  @NotNull public static WebPage.Builder webPage() { return new WebPage.Builder(new HashMap<String,Object>()); }
  /**
   * An EndorsementRating is a rating that expresses some level of endorsement, for example inclusion in a &quot;critic's pick&quot; blog, a
&quot;Like&quot; or &quot;+1&quot; on a social network. It can be considered the &lt;a class=&quot;localLink&quot; href=&quot;http://schema.org/result&quot;&gt;result&lt;/a&gt; of an &lt;a class=&quot;localLink&quot; href=&quot;http://schema.org/EndorseAction&quot;&gt;EndorseAction&lt;/a&gt; in which the &lt;a class=&quot;localLink&quot; href=&quot;http://schema.org/object&quot;&gt;object&lt;/a&gt; of the action is rated positively by
some &lt;a class=&quot;localLink&quot; href=&quot;http://schema.org/agent&quot;&gt;agent&lt;/a&gt;. As is common elsewhere in schema.org, it is sometimes more useful to describe the results of such an action without explicitly describing the &lt;a class=&quot;localLink&quot; href=&quot;http://schema.org/Action&quot;&gt;Action&lt;/a&gt;.&lt;br/&gt;&lt;br/&gt;

An &lt;a class=&quot;localLink&quot; href=&quot;http://schema.org/EndorsementRating&quot;&gt;EndorsementRating&lt;/a&gt; may be part of a numeric scale or organized system, but this is not required: having an explicit type for indicating a positive,
endorsement rating is particularly useful in the absence of numeric scales as it helps consumers understand that the rating is broadly positive.
   */
  @NotNull public static EndorsementRating.Builder endorsementRating() { return new EndorsementRating.Builder(new HashMap<String,Object>()); }
  /**
   * An list item, e.g. a step in a checklist or how-to description.
   */
  @NotNull public static ListItem.Builder listItem() { return new ListItem.Builder(new HashMap<String,Object>()); }
  /**
   * The act of notifying an event organizer as to whether you expect to attend the event.
   */
  @NotNull public static RsvpAction.Builder rsvpAction() { return new RsvpAction.Builder(new HashMap<String,Object>()); }
  /**
   * Animal shelter.
   */
  @NotNull public static AnimalShelter.Builder animalShelter() { return new AnimalShelter.Builder(new HashMap<String,Object>()); }
  /**
   * A crematorium.
   */
  @NotNull public static Crematorium.Builder crematorium() { return new Crematorium.Builder(new HashMap<String,Object>()); }
  /**
   * (Eventually to be defined as) a supertype of GeoShape designed to accommodate definitions from Geo-Spatial best practices.
   */
  @NotNull public static GeospatialGeometry.Builder geospatialGeometry() { return new GeospatialGeometry.Builder(new HashMap<String,Object>()); }
  /**
   * UserInteraction and its subtypes is an old way of talking about users interacting with pages. It is generally better to use &lt;a class=&quot;localLink&quot; href=&quot;http://schema.org/Action&quot;&gt;Action&lt;/a&gt;-based vocabulary, alongside types such as &lt;a class=&quot;localLink&quot; href=&quot;http://schema.org/Comment&quot;&gt;Comment&lt;/a&gt;.
   */
  @NotNull public static UserCheckins.Builder userCheckins() { return new UserCheckins.Builder(new HashMap<String,Object>()); }
  /**
   * A sub-grouping of steps in the instructions for how to achieve a result (e.g. steps for making a pie crust within a pie recipe).
   */
  @NotNull public static HowToSection.Builder howToSection() { return new HowToSection.Builder(new HashMap<String,Object>()); }
  /**
   * A web page element, like a table or an image.
   */
  @NotNull public static WebPageElement.Builder webPageElement() { return new WebPageElement.Builder(new HashMap<String,Object>()); }
  /**
   * A monetary grant.
   */
  @NotNull public static MonetaryGrant.Builder monetaryGrant() { return new MonetaryGrant.Builder(new HashMap<String,Object>()); }
  /**
   * A field of public health focusing on improving health characteristics of a defined population in relation with their geographical or environment areas
   */
  @NotNull public static CommunityHealth.Builder communityHealth() { return new CommunityHealth.Builder(new HashMap<String,Object>()); }
  /**
   * Reserving a concrete object.&lt;br/&gt;&lt;br/&gt;

Related actions:&lt;br/&gt;&lt;br/&gt;

&lt;ul&gt;
&lt;li&gt;&lt;a class=&quot;localLink&quot; href=&quot;http://schema.org/ScheduleAction&quot;&gt;ScheduleAction&lt;/a&gt;&lt;/a&gt;: Unlike ScheduleAction, ReserveAction reserves concrete objects (e.g. a table, a hotel) towards a time slot / spatial allocation.&lt;/li&gt;
&lt;/ul&gt;

   */
  @NotNull public static ReserveAction.Builder reserveAction() { return new ReserveAction.Builder(new HashMap<String,Object>()); }
  /**
   * A set of defined terms for example a set of categories or a classification scheme, a glossary, dictionary or enumeration.
   */
  @NotNull public static DefinedTermSet.Builder definedTermSet() { return new DefinedTermSet.Builder(new HashMap<String,Object>()); }
  /**
   * A short segment/part of a movie.
   */
  @NotNull public static MovieClip.Builder movieClip() { return new MovieClip.Builder(new HashMap<String,Object>()); }
  /**
   * An agent orders an object/product/service to be delivered/sent.
   */
  @NotNull public static OrderAction.Builder orderAction() { return new OrderAction.Builder(new HashMap<String,Object>()); }
  /**
   * The act of discovering/finding an object.
   */
  @NotNull public static DiscoverAction.Builder discoverAction() { return new DiscoverAction.Builder(new HashMap<String,Object>()); }
  /**
   * Web page type: Contact page.
   */
  @NotNull public static ContactPage.Builder contactPage() { return new ContactPage.Builder(new HashMap<String,Object>()); }
  /**
   * The act of organizing tasks/objects/events by associating resources to it.
   */
  @NotNull public static AllocateAction.Builder allocateAction() { return new AllocateAction.Builder(new HashMap<String,Object>()); }
  /**
   * A book, document, or piece of music written by hand rather than typed or printed.
   */
  @NotNull public static Manuscript.Builder manuscript() { return new Manuscript.Builder(new HashMap<String,Object>()); }
  /**
   * A country.
   */
  @NotNull public static Country.Builder country() { return new Country.Builder(new HashMap<String,Object>()); }
  /**
   * Auto body shop.
   */
  @NotNull public static AutoBodyShop.Builder autoBodyShop() { return new AutoBodyShop.Builder(new HashMap<String,Object>()); }
  /**
   * A collection of datasets.
   */
  @NotNull public static DataCatalog.Builder dataCatalog() { return new DataCatalog.Builder(new HashMap<String,Object>()); }
  /**
   * An order item is a line of an order. It includes the quantity and shipping details of a bought offer.
   */
  @NotNull public static OrderItem.Builder orderItem() { return new OrderItem.Builder(new HashMap<String,Object>()); }
  /**
   * Structured values are used when the value of a property has a more complex structure than simply being a textual value or a reference to another thing.
   */
  @NotNull public static StructuredValue.Builder structuredValue() { return new StructuredValue.Builder(new HashMap<String,Object>()); }
  /**
   * A type of financial product that typically requires the client to transfer funds to a financial service in return for potential beneficial financial return.
   */
  @NotNull public static InvestmentOrDeposit.Builder investmentOrDeposit() { return new InvestmentOrDeposit.Builder(new HashMap<String,Object>()); }
  /**
   * For a given health insurance plan, the specification for costs and coverage of prescription drugs.
   */
  @NotNull public static HealthPlanFormulary.Builder healthPlanFormulary() { return new HealthPlanFormulary.Builder(new HashMap<String,Object>()); }
  /**
   * A word, name, acronym, phrase, etc. with a formal definition. Often used in the context of category or subject classification, glossaries or dictionaries, product or creative work types, etc. Use the name property for the term being defined, use termCode if the term has an alpha-numeric code allocated, use description to provide the definition of the term.
   */
  @NotNull public static DefinedTerm.Builder definedTerm() { return new DefinedTerm.Builder(new HashMap<String,Object>()); }
  /**
   * A landform or physical feature.  Landform elements include mountains, plains, lakes, rivers, seascape and oceanic waterbody interface features such as bays, peninsulas, seas and so forth, including sub-aqueous terrain features such as submersed mountain ranges, volcanoes, and the great ocean basins.
   */
  @NotNull public static Landform.Builder landform() { return new Landform.Builder(new HashMap<String,Object>()); }
  /**
   * A CreativeWorkSeries in schema.org is a group of related items, typically but not necessarily of the same kind. CreativeWorkSeries are usually organized into some order, often chronological. Unlike &lt;a class=&quot;localLink&quot; href=&quot;http://schema.org/ItemList&quot;&gt;ItemList&lt;/a&gt; which is a general purpose data structure for lists of things, the emphasis with CreativeWorkSeries is on published materials (written e.g. books and periodicals, or media such as tv, radio and games).&lt;br/&gt;&lt;br/&gt;

Specific subtypes are available for describing &lt;a class=&quot;localLink&quot; href=&quot;http://schema.org/TVSeries&quot;&gt;TVSeries&lt;/a&gt;, &lt;a class=&quot;localLink&quot; href=&quot;http://schema.org/RadioSeries&quot;&gt;RadioSeries&lt;/a&gt;, &lt;a class=&quot;localLink&quot; href=&quot;http://schema.org/MovieSeries&quot;&gt;MovieSeries&lt;/a&gt;, &lt;a class=&quot;localLink&quot; href=&quot;http://schema.org/BookSeries&quot;&gt;BookSeries&lt;/a&gt;, &lt;a class=&quot;localLink&quot; href=&quot;http://schema.org/Periodical&quot;&gt;Periodical&lt;/a&gt; and &lt;a class=&quot;localLink&quot; href=&quot;http://schema.org/VideoGameSeries&quot;&gt;VideoGameSeries&lt;/a&gt;. In each case, the &lt;a class=&quot;localLink&quot; href=&quot;http://schema.org/hasPart&quot;&gt;hasPart&lt;/a&gt; / &lt;a class=&quot;localLink&quot; href=&quot;http://schema.org/isPartOf&quot;&gt;isPartOf&lt;/a&gt; properties can be used to relate the CreativeWorkSeries to its parts. The general CreativeWorkSeries type serves largely just to organize these more specific and practical subtypes.&lt;br/&gt;&lt;br/&gt;

It is common for properties applicable to an item from the series to be usefully applied to the containing group. Schema.org attempts to anticipate some of these cases, but publishers should be free to apply properties of the series parts to the series as a whole wherever they seem appropriate.
   */
  @NotNull public static CreativeWorkSeries.Builder creativeWorkSeries() { return new CreativeWorkSeries.Builder(new HashMap<String,Object>()); }
  /**
   * A software application.
   */
  @NotNull public static SoftwareApplication.Builder softwareApplication() { return new SoftwareApplication.Builder(new HashMap<String,Object>()); }
  /**
   * A Catholic church.
   */
  @NotNull public static CatholicChurch.Builder catholicChurch() { return new CatholicChurch.Builder(new HashMap<String,Object>()); }
  /**
   * The act of granting permission to an object.
   */
  @NotNull public static AuthorizeAction.Builder authorizeAction() { return new AuthorizeAction.Builder(new HashMap<String,Object>()); }
  /**
   * Season dedicated to TV broadcast and associated online delivery.
   */
  @NotNull public static TVSeason.Builder tVSeason() { return new TVSeason.Builder(new HashMap<String,Object>()); }
  /**
   * The act of achieving victory in a competitive activity.
   */
  @NotNull public static WinAction.Builder winAction() { return new WinAction.Builder(new HashMap<String,Object>()); }
  /**
   * A type of blood vessel that specifically carries blood to the heart.
   */
  @NotNull public static Vein.Builder vein() { return new Vein.Builder(new HashMap<String,Object>()); }
  /**
   * Instances of the class &lt;a class=&quot;localLink&quot; href=&quot;http://schema.org/Observation&quot;&gt;Observation&lt;/a&gt; are used to specify observations about an entity (which may or may not be an instance of a &lt;a class=&quot;localLink&quot; href=&quot;http://schema.org/StatisticalPopulation&quot;&gt;StatisticalPopulation&lt;/a&gt;), at a particular time. The principal properties of an &lt;a class=&quot;localLink&quot; href=&quot;http://schema.org/Observation&quot;&gt;Observation&lt;/a&gt; are &lt;a class=&quot;localLink&quot; href=&quot;http://schema.org/observedNode&quot;&gt;observedNode&lt;/a&gt;, &lt;a class=&quot;localLink&quot; href=&quot;http://schema.org/measuredProperty&quot;&gt;measuredProperty&lt;/a&gt;, &lt;a class=&quot;localLink&quot; href=&quot;http://schema.org/measuredValue&quot;&gt;measuredValue&lt;/a&gt; (or &lt;a class=&quot;localLink&quot; href=&quot;http://schema.org/median&quot;&gt;median&lt;/a&gt;, etc.) and &lt;a class=&quot;localLink&quot; href=&quot;http://schema.org/observationDate&quot;&gt;observationDate&lt;/a&gt; (&lt;a class=&quot;localLink&quot; href=&quot;http://schema.org/measuredProperty&quot;&gt;measuredProperty&lt;/a&gt; properties can, but need not always, be W3C RDF Data Cube &quot;measure properties&quot;, as in the &lt;a href=&quot;https://www.w3.org/TR/vocab-data-cube/#dsd-example&quot;&gt;lifeExpectancy example&lt;/a&gt;).
See also &lt;a class=&quot;localLink&quot; href=&quot;http://schema.org/StatisticalPopulation&quot;&gt;StatisticalPopulation&lt;/a&gt;, and the &lt;a href=&quot;/docs/data-and-datasets.html&quot;&gt;data and datasets&lt;/a&gt; overview for more details.
   */
  @NotNull public static Observation.Builder observation() { return new Observation.Builder(new HashMap<String,Object>()); }
  /**
   * A structured value representing exchange rate.
   */
  @NotNull public static ExchangeRateSpecification.Builder exchangeRateSpecification() { return new ExchangeRateSpecification.Builder(new HashMap<String,Object>()); }
  /**
   * A business providing entertainment.
   */
  @NotNull public static EntertainmentBusiness.Builder entertainmentBusiness() { return new EntertainmentBusiness.Builder(new HashMap<String,Object>()); }
  /**
   * A media episode (e.g. TV, radio, video game) which can be part of a series or season.
   */
  @NotNull public static Episode.Builder episode() { return new Episode.Builder(new HashMap<String,Object>()); }
  /**
   * A simple system that adds up the number of risk factors to yield a score that is associated with prognosis, e.g. CHAD score, TIMI risk score.
   */
  @NotNull public static MedicalRiskScore.Builder medicalRiskScore() { return new MedicalRiskScore.Builder(new HashMap<String,Object>()); }
  /**
   * An &lt;a class=&quot;localLink&quot; href=&quot;http://schema.org/EmployerReview&quot;&gt;EmployerReview&lt;/a&gt; is a review of an &lt;a class=&quot;localLink&quot; href=&quot;http://schema.org/Organization&quot;&gt;Organization&lt;/a&gt; regarding its role as an employer, written by a current or former employee of that organization.
   */
  @NotNull public static EmployerReview.Builder employerReview() { return new EmployerReview.Builder(new HashMap<String,Object>()); }
  /**
   * Residence type: Gated community.
   */
  @NotNull public static GatedResidenceCommunity.Builder gatedResidenceCommunity() { return new GatedResidenceCommunity.Builder(new HashMap<String,Object>()); }
  /**
   * A store that sells materials useful or necessary for various hobbies.
   */
  @NotNull public static HobbyShop.Builder hobbyShop() { return new HobbyShop.Builder(new HashMap<String,Object>()); }
  /**
   * An adult entertainment establishment.
   */
  @NotNull public static AdultEntertainment.Builder adultEntertainment() { return new AdultEntertainment.Builder(new HashMap<String,Object>()); }
  /**
   * The act of an agent communicating (service provider, social media, etc) their departure of a previously reserved service (e.g. flight check in) or place (e.g. hotel).&lt;br/&gt;&lt;br/&gt;

Related actions:&lt;br/&gt;&lt;br/&gt;

&lt;ul&gt;
&lt;li&gt;&lt;a class=&quot;localLink&quot; href=&quot;http://schema.org/CheckInAction&quot;&gt;CheckInAction&lt;/a&gt;: The antonym of CheckOutAction.&lt;/li&gt;
&lt;li&gt;&lt;a class=&quot;localLink&quot; href=&quot;http://schema.org/DepartAction&quot;&gt;DepartAction&lt;/a&gt;: Unlike DepartAction, CheckOutAction implies that the agent is informing/confirming the end of a previously reserved service.&lt;/li&gt;
&lt;li&gt;&lt;a class=&quot;localLink&quot; href=&quot;http://schema.org/CancelAction&quot;&gt;CancelAction&lt;/a&gt;: Unlike CancelAction, CheckOutAction implies that the agent is informing/confirming the end of a previously reserved service.&lt;/li&gt;
&lt;/ul&gt;

   */
  @NotNull public static CheckOutAction.Builder checkOutAction() { return new CheckOutAction.Builder(new HashMap<String,Object>()); }
  /**
   * The therapy that is concerned with the maintenance or improvement of respiratory function (as in patients with pulmonary disease).
   */
  @NotNull public static RespiratoryTherapy.Builder respiratoryTherapy() { return new RespiratoryTherapy.Builder(new HashMap<String,Object>()); }
  /**
   * Web page type: Video gallery page.
   */
  @NotNull public static VideoGallery.Builder videoGallery() { return new VideoGallery.Builder(new HashMap<String,Object>()); }
  /**
   * A parking lot or other parking facility.
   */
  @NotNull public static ParkingFacility.Builder parkingFacility() { return new ParkingFacility.Builder(new HashMap<String,Object>()); }
  /**
   * Car repair, sales, or parts.
   */
  @NotNull public static AutomotiveBusiness.Builder automotiveBusiness() { return new AutomotiveBusiness.Builder(new HashMap<String,Object>()); }
  /**
   * Organization: Non-governmental Organization.
   */
  @NotNull public static NGO.Builder nGO() { return new NGO.Builder(new HashMap<String,Object>()); }
  /**
   * A US-style health insurance plan, including PPOs, EPOs, and HMOs.
   */
  @NotNull public static HealthInsurancePlan.Builder healthInsurancePlan() { return new HealthInsurancePlan.Builder(new HashMap<String,Object>()); }
  /**
   * A radio episode which can be part of a series or season.
   */
  @NotNull public static RadioEpisode.Builder radioEpisode() { return new RadioEpisode.Builder(new HashMap<String,Object>()); }
  /**
   * A tourist information center.
   */
  @NotNull public static TouristInformationCenter.Builder touristInformationCenter() { return new TouristInformationCenter.Builder(new HashMap<String,Object>()); }
  /**
   * A radio station.
   */
  @NotNull public static RadioStation.Builder radioStation() { return new RadioStation.Builder(new HashMap<String,Object>()); }
  /**
   * The Game type represents things which are games. These are typically rule-governed recreational activities, e.g. role-playing games in which players assume the role of characters in a fictional setting.
   */
  @NotNull public static Game.Builder game() { return new Game.Builder(new HashMap<String,Object>()); }
  /**
   * A strategy of regulating the intake of food to achieve or maintain a specific health-related goal.
   */
  @NotNull public static Diet.Builder diet() { return new Diet.Builder(new HashMap<String,Object>()); }
  /**
   * A grant, typically financial or otherwise quantifiable, of resources. Typically a &lt;a class=&quot;localLink&quot; href=&quot;http://schema.org/funder&quot;&gt;funder&lt;/a&gt; sponsors some &lt;a class=&quot;localLink&quot; href=&quot;http://schema.org/MonetaryAmount&quot;&gt;MonetaryAmount&lt;/a&gt; to an &lt;a class=&quot;localLink&quot; href=&quot;http://schema.org/Organization&quot;&gt;Organization&lt;/a&gt; or &lt;a class=&quot;localLink&quot; href=&quot;http://schema.org/Person&quot;&gt;Person&lt;/a&gt;,
    sometimes not necessarily via a dedicated or long-lived &lt;a class=&quot;localLink&quot; href=&quot;http://schema.org/Project&quot;&gt;Project&lt;/a&gt;, resulting in one or more outputs, or &lt;a class=&quot;localLink&quot; href=&quot;http://schema.org/fundedItem&quot;&gt;fundedItem&lt;/a&gt;s. For financial sponsorship, indicate the &lt;a class=&quot;localLink&quot; href=&quot;http://schema.org/funder&quot;&gt;funder&lt;/a&gt; of a &lt;a class=&quot;localLink&quot; href=&quot;http://schema.org/MonetaryGrant&quot;&gt;MonetaryGrant&lt;/a&gt;. For non-financial support, indicate &lt;a class=&quot;localLink&quot; href=&quot;http://schema.org/sponsor&quot;&gt;sponsor&lt;/a&gt; of &lt;a class=&quot;localLink&quot; href=&quot;http://schema.org/Grant&quot;&gt;Grant&lt;/a&gt;s of resources (e.g. office space).&lt;br/&gt;&lt;br/&gt;

Grants support  activities directed towards some agreed collective goals, often but not always organized as &lt;a class=&quot;localLink&quot; href=&quot;http://schema.org/Project&quot;&gt;Project&lt;/a&gt;s. Long-lived projects are sometimes sponsored by a variety of grants over time, but it is also common for a project to be associated with a single grant.&lt;br/&gt;&lt;br/&gt;

The amount of a &lt;a class=&quot;localLink&quot; href=&quot;http://schema.org/Grant&quot;&gt;Grant&lt;/a&gt; is represented using &lt;a class=&quot;localLink&quot; href=&quot;http://schema.org/amount&quot;&gt;amount&lt;/a&gt; as a &lt;a class=&quot;localLink&quot; href=&quot;http://schema.org/MonetaryAmount&quot;&gt;MonetaryAmount&lt;/a&gt;.
   */
  @NotNull public static Grant.Builder grant() { return new Grant.Builder(new HashMap<String,Object>()); }
  /**
   * Beach.
   */
  @NotNull public static Beach.Builder beach() { return new Beach.Builder(new HashMap<String,Object>()); }
  /**
   * UserInteraction and its subtypes is an old way of talking about users interacting with pages. It is generally better to use &lt;a class=&quot;localLink&quot; href=&quot;http://schema.org/Action&quot;&gt;Action&lt;/a&gt;-based vocabulary, alongside types such as &lt;a class=&quot;localLink&quot; href=&quot;http://schema.org/Comment&quot;&gt;Comment&lt;/a&gt;.
   */
  @NotNull public static UserBlocks.Builder userBlocks() { return new UserBlocks.Builder(new HashMap<String,Object>()); }
  /**
   * A photograph.
   */
  @NotNull public static Photograph.Builder photograph() { return new Photograph.Builder(new HashMap<String,Object>()); }
  /**
   * An EducationalAudience.
   */
  @NotNull public static EducationalAudience.Builder educationalAudience() { return new EducationalAudience.Builder(new HashMap<String,Object>()); }
  /**
   * A vehicle is a device that is designed or used to transport people or cargo over land, water, air, or through space.
   */
  @NotNull public static Vehicle.Builder vehicle() { return new Vehicle.Builder(new HashMap<String,Object>()); }
  /**
   * A structured value representing repayment.
   */
  @NotNull public static RepaymentSpecification.Builder repaymentSpecification() { return new RepaymentSpecification.Builder(new HashMap<String,Object>()); }
  /**
   * An emergency service, such as a fire station or ER.
   */
  @NotNull public static EmergencyService.Builder emergencyService() { return new EmergencyService.Builder(new HashMap<String,Object>()); }
  /**
   * The act of forming a personal connection with someone (object) mutually/bidirectionally/symmetrically.&lt;br/&gt;&lt;br/&gt;

Related actions:&lt;br/&gt;&lt;br/&gt;

&lt;ul&gt;
&lt;li&gt;&lt;a class=&quot;localLink&quot; href=&quot;http://schema.org/FollowAction&quot;&gt;FollowAction&lt;/a&gt;: Unlike FollowAction, BefriendAction implies that the connection is reciprocal.&lt;/li&gt;
&lt;/ul&gt;

   */
  @NotNull public static BefriendAction.Builder befriendAction() { return new BefriendAction.Builder(new HashMap<String,Object>()); }
  /**
   * A News/Media organization such as a newspaper or TV station.
   */
  @NotNull public static NewsMediaOrganization.Builder newsMediaOrganization() { return new NewsMediaOrganization.Builder(new HashMap<String,Object>()); }
  /**
   * A CDCPMDRecord is a data structure representing a record in a CDC tabular data format
      used for hospital data reporting. See &lt;a href=&quot;/docs/cdc-covid.html&quot;&gt;documentation&lt;/a&gt; for details, and the linked CDC materials for authoritative
      definitions used as the source here.
   */
  @NotNull public static CDCPMDRecord.Builder cDCPMDRecord() { return new CDCPMDRecord.Builder(new HashMap<String,Object>()); }
  /**
   * The act of editing by adding an object to a collection.
   */
  @NotNull public static AddAction.Builder addAction() { return new AddAction.Builder(new HashMap<String,Object>()); }
  /**
   * A construction business.&lt;br/&gt;&lt;br/&gt;

A HomeAndConstructionBusiness is a &lt;a class=&quot;localLink&quot; href=&quot;http://schema.org/LocalBusiness&quot;&gt;LocalBusiness&lt;/a&gt; that provides services around homes and buildings.&lt;br/&gt;&lt;br/&gt;

As a &lt;a class=&quot;localLink&quot; href=&quot;http://schema.org/LocalBusiness&quot;&gt;LocalBusiness&lt;/a&gt; it can be described as a &lt;a class=&quot;localLink&quot; href=&quot;http://schema.org/provider&quot;&gt;provider&lt;/a&gt; of one or more &lt;a class=&quot;localLink&quot; href=&quot;http://schema.org/Service&quot;&gt;Service&lt;/a&gt;(s).
   */
  @NotNull public static HomeAndConstructionBusiness.Builder homeAndConstructionBusiness() { return new HomeAndConstructionBusiness.Builder(new HashMap<String,Object>()); }
  /**
   * A structured value representing the duration and scope of services that will be provided to a customer free of charge in case of a defect or malfunction of a product.
   */
  @NotNull public static WarrantyPromise.Builder warrantyPromise() { return new WarrantyPromise.Builder(new HashMap<String,Object>()); }
  /**
   * Individual comic issues are serially published as
    part of a larger series. For the sake of consistency, even one-shot issues
    belong to a series comprised of a single issue. All comic issues can be
    uniquely identified by: the combination of the name and volume number of the
    series to which the issue belongs; the issue number; and the variant
    description of the issue (if any).
   */
  @NotNull public static ComicIssue.Builder comicIssue() { return new ComicIssue.Builder(new HashMap<String,Object>()); }
  /**
   * Web page type: Profile page.
   */
  @NotNull public static ProfilePage.Builder profilePage() { return new ProfilePage.Builder(new HashMap<String,Object>()); }
  /**
   * The price for the delivery of an offer using a particular delivery method.
   */
  @NotNull public static DeliveryChargeSpecification.Builder deliveryChargeSpecification() { return new DeliveryChargeSpecification.Builder(new HashMap<String,Object>()); }
  /**
   * A music recording (track), usually a single song.
   */
  @NotNull public static MusicRecording.Builder musicRecording() { return new MusicRecording.Builder(new HashMap<String,Object>()); }
  /**
   * A health club.
   */
  @NotNull public static HealthClub.Builder healthClub() { return new HealthClub.Builder(new HashMap<String,Object>()); }
  /**
   * Professional service: Attorney. &lt;br/&gt;&lt;br/&gt;

This type is deprecated - &lt;a class=&quot;localLink&quot; href=&quot;http://schema.org/LegalService&quot;&gt;LegalService&lt;/a&gt; is more inclusive and less ambiguous.
   */
  @NotNull public static Attorney.Builder attorney() { return new Attorney.Builder(new HashMap<String,Object>()); }
  /**
   * An intangible type to be applied to any archive content, carrying with it a set of properties required to describe archival items and collections.
   */
  @NotNull public static ArchiveComponent.Builder archiveComponent() { return new ArchiveComponent.Builder(new HashMap<String,Object>()); }
  /**
   * A stadium.
   */
  @NotNull public static StadiumOrArena.Builder stadiumOrArena() { return new StadiumOrArena.Builder(new HashMap<String,Object>()); }
  /**
   * The act of swallowing solid objects.
   */
  @NotNull public static EatAction.Builder eatAction() { return new EatAction.Builder(new HashMap<String,Object>()); }
  /**
   * A map.
   */
  @NotNull public static Map.Builder map() { return new Map.Builder(new HashMap<String,Object>()); }
  /**
   * A motorized bicycle is a bicycle with an attached motor used to power the vehicle, or to assist with pedaling.
   */
  @NotNull public static MotorizedBicycle.Builder motorizedBicycle() { return new MotorizedBicycle.Builder(new HashMap<String,Object>()); }
  /**
   * A reservation for air travel.&lt;br/&gt;&lt;br/&gt;

Note: This type is for information about actual reservations, e.g. in confirmation emails or HTML pages with individual confirmations of reservations. For offers of tickets, use &lt;a class=&quot;localLink&quot; href=&quot;http://schema.org/Offer&quot;&gt;Offer&lt;/a&gt;.
   */
  @NotNull public static FlightReservation.Builder flightReservation() { return new FlightReservation.Builder(new HashMap<String,Object>()); }
  /**
   * A media season e.g. tv, radio, video game etc.
   */
  @NotNull public static Season.Builder season() { return new Season.Builder(new HashMap<String,Object>()); }
  /**
   * A Role that represents a Web link e.g. as expressed via the 'url' property. Its linkRelationship property can indicate URL-based and plain textual link types e.g. those in IANA link registry or others such as 'amphtml'. This structure provides a placeholder where details from HTML's link element can be represented outside of HTML, e.g. in JSON-LD feeds.
   */
  @NotNull public static LinkRole.Builder linkRole() { return new LinkRole.Builder(new HashMap<String,Object>()); }
  /**
   * A part of a successively published publication such as a periodical or publication volume, often numbered, usually containing a grouping of works such as articles.&lt;br/&gt;&lt;br/&gt;

See also &lt;a href=&quot;http://blog.schema.org/2014/09/schemaorg-support-for-bibliographic_2.html&quot;&gt;blog post&lt;/a&gt;.
   */
  @NotNull public static PublicationIssue.Builder publicationIssue() { return new PublicationIssue.Builder(new HashMap<String,Object>()); }
  /**
   * An indication for preventing an underlying condition, symptom, etc.
   */
  @NotNull public static PreventionIndication.Builder preventionIndication() { return new PreventionIndication.Builder(new HashMap<String,Object>()); }
  /**
   * A shoe store.
   */
  @NotNull public static ShoeStore.Builder shoeStore() { return new ShoeStore.Builder(new HashMap<String,Object>()); }
  /**
   * Event type: Social event.
   */
  @NotNull public static SocialEvent.Builder socialEvent() { return new SocialEvent.Builder(new HashMap<String,Object>()); }
  /**
   * A shop that will buy, or lend money against the security of, personal possessions.
   */
  @NotNull public static PawnShop.Builder pawnShop() { return new PawnShop.Builder(new HashMap<String,Object>()); }
  /**
   * An event happening at a certain time and location, such as a concert, lecture, or festival. Ticketing information may be added via the &lt;a class=&quot;localLink&quot; href=&quot;http://schema.org/offers&quot;&gt;offers&lt;/a&gt; property. Repeated events may be structured as separate Event objects.
   */
  @NotNull public static Event.Builder event() { return new Event.Builder(new HashMap<String,Object>()); }
  /**
   * A CovidTestingFacility is a &lt;a class=&quot;localLink&quot; href=&quot;http://schema.org/MedicalClinic&quot;&gt;MedicalClinic&lt;/a&gt; where testing for the COVID-19 Coronavirus
      disease is available. If the facility is being made available from an established &lt;a class=&quot;localLink&quot; href=&quot;http://schema.org/Pharmacy&quot;&gt;Pharmacy&lt;/a&gt;, &lt;a class=&quot;localLink&quot; href=&quot;http://schema.org/Hotel&quot;&gt;Hotel&lt;/a&gt;, or other
      non-medical organization, multiple types can be listed. This makes it easier to re-use existing schema.org information
      about that place e.g. contact info, address, opening hours. Note that in an emergency, such information may not always be reliable.
   */
  @NotNull public static CovidTestingFacility.Builder covidTestingFacility() { return new CovidTestingFacility.Builder(new HashMap<String,Object>()); }
  /**
   * A body of water, such as a sea, ocean, or lake.
   */
  @NotNull public static BodyOfWater.Builder bodyOfWater() { return new BodyOfWater.Builder(new HashMap<String,Object>()); }
  /**
   * A datasheet or vendor specification of a product (in the sense of a prototypical description).
   */
  @NotNull public static ProductModel.Builder productModel() { return new ProductModel.Builder(new HashMap<String,Object>()); }
  /**
   * Event type: Music event.
   */
  @NotNull public static MusicEvent.Builder musicEvent() { return new MusicEvent.Builder(new HashMap<String,Object>()); }
  /**
   * A unique instance of a BroadcastService on a CableOrSatelliteService lineup.
   */
  @NotNull public static BroadcastChannel.Builder broadcastChannel() { return new BroadcastChannel.Builder(new HashMap<String,Object>()); }
  /**
   * A single feed providing structured information about one or more entities or topics.
   */
  @NotNull public static DataFeed.Builder dataFeed() { return new DataFeed.Builder(new HashMap<String,Object>()); }
  /**
   * The act of being defeated in a competitive activity.
   */
  @NotNull public static LoseAction.Builder loseAction() { return new LoseAction.Builder(new HashMap<String,Object>()); }
  /**
   * A card payment method of a particular brand or name.  Used to mark up a particular payment method and/or the financial product/service that supplies the card account.&lt;br/&gt;&lt;br/&gt;

Commonly used values:&lt;br/&gt;&lt;br/&gt;

&lt;ul&gt;
&lt;li&gt;http://purl.org/goodrelations/v1#AmericanExpress&lt;/li&gt;
&lt;li&gt;http://purl.org/goodrelations/v1#DinersClub&lt;/li&gt;
&lt;li&gt;http://purl.org/goodrelations/v1#Discover&lt;/li&gt;
&lt;li&gt;http://purl.org/goodrelations/v1#JCB&lt;/li&gt;
&lt;li&gt;http://purl.org/goodrelations/v1#MasterCard&lt;/li&gt;
&lt;li&gt;http://purl.org/goodrelations/v1#VISA&lt;/li&gt;
&lt;/ul&gt;

   */
  @NotNull public static CreditCard.Builder creditCard() { return new CreditCard.Builder(new HashMap<String,Object>()); }
  /**
   * A dataset in downloadable form.
   */
  @NotNull public static DataDownload.Builder dataDownload() { return new DataDownload.Builder(new HashMap<String,Object>()); }
  /**
   * The act of responding instinctively and emotionally to an object, expressing a sentiment.
   */
  @NotNull public static ReactAction.Builder reactAction() { return new ReactAction.Builder(new HashMap<String,Object>()); }
  /**
   * Text representing an XPath (typically but not necessarily version 1.0).
   */
  @NotNull public static XPathType.Builder xPathType() { return new XPathType.Builder(new HashMap<String,Object>()); }
  /**
   * A hotel is an establishment that provides lodging paid on a short-term basis (Source: Wikipedia, the free encyclopedia, see http://en.wikipedia.org/wiki/Hotel).
&lt;br /&gt;&lt;br /&gt;
See also the &lt;a href=&quot;/docs/hotels.html&quot;&gt;dedicated document on the use of schema.org for marking up hotels and other forms of accommodations&lt;/a&gt;.
   */
  @NotNull public static Hotel.Builder hotel() { return new Hotel.Builder(new HashMap<String,Object>()); }
  /**
   * A store that sells reading glasses and similar devices for improving vision.
   */
  @NotNull public static Optician.Builder optician() { return new Optician.Builder(new HashMap<String,Object>()); }
  /**
   * The act of resuming a device or application which was formerly paused (e.g. resume music playback or resume a timer).
   */
  @NotNull public static ResumeAction.Builder resumeAction() { return new ResumeAction.Builder(new HashMap<String,Object>()); }
  /**
   * A department store.
   */
  @NotNull public static DepartmentStore.Builder departmentStore() { return new DepartmentStore.Builder(new HashMap<String,Object>()); }
  /**
   * A process of progressive physical care and rehabilitation aimed at improving a health condition.
   */
  @NotNull public static PhysicalTherapy.Builder physicalTherapy() { return new PhysicalTherapy.Builder(new HashMap<String,Object>()); }
  /**
   * An ocean (for example, the Pacific).
   */
  @NotNull public static OceanBodyOfWater.Builder oceanBodyOfWater() { return new OceanBodyOfWater.Builder(new HashMap<String,Object>()); }
  /**
   * A play is a form of literature, usually consisting of dialogue between characters, intended for theatrical performance rather than just reading. Note the peformance of a Play would be a &lt;a class=&quot;localLink&quot; href=&quot;http://schema.org/TheaterEvent&quot;&gt;TheaterEvent&lt;/a&gt; - the &lt;em&gt;Play&lt;/em&gt; being the &lt;a class=&quot;localLink&quot; href=&quot;http://schema.org/workPerformed&quot;&gt;workPerformed&lt;/a&gt;.
   */
  @NotNull public static Play.Builder play() { return new Play.Builder(new HashMap<String,Object>()); }
  /**
   * A set of Category Code values.
   */
  @NotNull public static CategoryCodeSet.Builder categoryCodeSet() { return new CategoryCodeSet.Builder(new HashMap<String,Object>()); }
  /**
   * A bowling alley.
   */
  @NotNull public static BowlingAlley.Builder bowlingAlley() { return new BowlingAlley.Builder(new HashMap<String,Object>()); }
  /**
   * Any anatomical structure which pertains to the soft nervous tissue functioning as the coordinating center of sensation and intellectual and nervous activity.
   */
  @NotNull public static BrainStructure.Builder brainStructure() { return new BrainStructure.Builder(new HashMap<String,Object>()); }
  /**
   * Aquarium.
   */
  @NotNull public static Aquarium.Builder aquarium() { return new Aquarium.Builder(new HashMap<String,Object>()); }
  /**
   * A pet store.
   */
  @NotNull public static PetStore.Builder petStore() { return new PetStore.Builder(new HashMap<String,Object>()); }
  /**
   * The act of editing a recipient by removing one of its objects.
   */
  @NotNull public static DeleteAction.Builder deleteAction() { return new DeleteAction.Builder(new HashMap<String,Object>()); }
  /**
   * A FloorPlan is an explicit representation of a collection of similar accommodations, allowing the provision of common information (room counts, sizes, layout diagrams) and offers for rental or sale. In typical use, some &lt;a class=&quot;localLink&quot; href=&quot;http://schema.org/ApartmentComplex&quot;&gt;ApartmentComplex&lt;/a&gt; has an &lt;a class=&quot;localLink&quot; href=&quot;http://schema.org/accommodationFloorPlan&quot;&gt;accommodationFloorPlan&lt;/a&gt; which is a &lt;a class=&quot;localLink&quot; href=&quot;http://schema.org/FloorPlan&quot;&gt;FloorPlan&lt;/a&gt;.  A FloorPlan is always in the context of a particular place, either a larger &lt;a class=&quot;localLink&quot; href=&quot;http://schema.org/ApartmentComplex&quot;&gt;ApartmentComplex&lt;/a&gt; or a single &lt;a class=&quot;localLink&quot; href=&quot;http://schema.org/Apartment&quot;&gt;Apartment&lt;/a&gt;. The visual/spatial aspects of a floor plan (i.e. room layout, &lt;a href=&quot;https://en.wikipedia.org/wiki/Floor_plan&quot;&gt;see wikipedia&lt;/a&gt;) can be indicated using &lt;a class=&quot;localLink&quot; href=&quot;http://schema.org/image&quot;&gt;image&lt;/a&gt;.
   */
  @NotNull public static FloorPlan.Builder floorPlan() { return new FloorPlan.Builder(new HashMap<String,Object>()); }
  /**
   * Rigid connective tissue that comprises up the skeletal structure of the human body.
   */
  @NotNull public static Bone.Builder bone() { return new Bone.Builder(new HashMap<String,Object>()); }
  /**
   * Properties that take Energy as values are of the form '&amp;lt;Number&amp;gt; &amp;lt;Energy unit of measure&amp;gt;'.
   */
  @NotNull public static Energy.Builder energy() { return new Energy.Builder(new HashMap<String,Object>()); }
  /**
   * A school.
   */
  @NotNull public static School.Builder school() { return new School.Builder(new HashMap<String,Object>()); }
  /**
   * The frequency in MHz and the modulation used for a particular BroadcastService.
   */
  @NotNull public static BroadcastFrequencySpecification.Builder broadcastFrequencySpecification() { return new BroadcastFrequencySpecification.Builder(new HashMap<String,Object>()); }
  /**
   * A condition or factor that indicates use of a medical therapy, including signs, symptoms, risk factors, anatomical states, etc.
   */
  @NotNull public static MedicalIndication.Builder medicalIndication() { return new MedicalIndication.Builder(new HashMap<String,Object>()); }
  /**
   * A book.
   */
  @NotNull public static Book.Builder book() { return new Book.Builder(new HashMap<String,Object>()); }
  /**
   * The act of expressing a preference from a set of options or a large or unbounded set of choices/options.
   */
  @NotNull public static ChooseAction.Builder chooseAction() { return new ChooseAction.Builder(new HashMap<String,Object>()); }
  /**
   * An car dealership.
   */
  @NotNull public static AutoDealer.Builder autoDealer() { return new AutoDealer.Builder(new HashMap<String,Object>()); }
  /**
   * Web applications.
   */
  @NotNull public static WebApplication.Builder webApplication() { return new WebApplication.Builder(new HashMap<String,Object>()); }
  /**
   * Event type: Literary event.
   */
  @NotNull public static LiteraryEvent.Builder literaryEvent() { return new LiteraryEvent.Builder(new HashMap<String,Object>()); }
  /**
   * A grocery store.
   */
  @NotNull public static GroceryStore.Builder groceryStore() { return new GroceryStore.Builder(new HashMap<String,Object>()); }
  /**
   * A nail salon.
   */
  @NotNull public static NailSalon.Builder nailSalon() { return new NailSalon.Builder(new HashMap<String,Object>()); }
  /**
   * Target audiences for medical web pages. Enumerated type.
   */
  @NotNull public static MedicalAudience.Builder medicalAudience() { return new MedicalAudience.Builder(new HashMap<String,Object>()); }
  /**
   * The act of capturing sound and moving images on film, video, or digitally.
   */
  @NotNull public static FilmAction.Builder filmAction() { return new FilmAction.Builder(new HashMap<String,Object>()); }
  /**
   * The act of accomplishing something via previous efforts. It is an instantaneous action rather than an ongoing process.
   */
  @NotNull public static AchieveAction.Builder achieveAction() { return new AchieveAction.Builder(new HashMap<String,Object>()); }
  /**
   * The act of registering to an organization/service without the guarantee to receive it.&lt;br/&gt;&lt;br/&gt;

Related actions:&lt;br/&gt;&lt;br/&gt;

&lt;ul&gt;
&lt;li&gt;&lt;a class=&quot;localLink&quot; href=&quot;http://schema.org/RegisterAction&quot;&gt;RegisterAction&lt;/a&gt;: Unlike RegisterAction, ApplyAction has no guarantees that the application will be accepted.&lt;/li&gt;
&lt;/ul&gt;

   */
  @NotNull public static ApplyAction.Builder applyAction() { return new ApplyAction.Builder(new HashMap<String,Object>()); }
  /**
   * A canal, like the Panama Canal.
   */
  @NotNull public static Canal.Builder canal() { return new Canal.Builder(new HashMap<String,Object>()); }
  /**
   * The place where a person lives.
   */
  @NotNull public static Residence.Builder residence() { return new Residence.Builder(new HashMap<String,Object>()); }
  /**
   * A legal document such as an act, decree, bill, etc. (enforceable or not) or a component of a legal act (like an article).
   */
  @NotNull public static Legislation.Builder legislation() { return new Legislation.Builder(new HashMap<String,Object>()); }
  /**
   * A description of costs to the patient under a given network or formulary.
   */
  @NotNull public static HealthPlanCostSharingSpecification.Builder healthPlanCostSharingSpecification() { return new HealthPlanCostSharingSpecification.Builder(new HashMap<String,Object>()); }
  /**
   * A city or town.
   */
  @NotNull public static City.Builder city() { return new City.Builder(new HashMap<String,Object>()); }
  /**
   * UserInteraction and its subtypes is an old way of talking about users interacting with pages. It is generally better to use &lt;a class=&quot;localLink&quot; href=&quot;http://schema.org/Action&quot;&gt;Action&lt;/a&gt;-based vocabulary, alongside types such as &lt;a class=&quot;localLink&quot; href=&quot;http://schema.org/Comment&quot;&gt;Comment&lt;/a&gt;.
   */
  @NotNull public static UserPageVisits.Builder userPageVisits() { return new UserPageVisits.Builder(new HashMap<String,Object>()); }
  /**
   * The act of distributing content to people for their amusement or edification.
   */
  @NotNull public static ShareAction.Builder shareAction() { return new ShareAction.Builder(new HashMap<String,Object>()); }
  /**
   * A retail good store.
   */
  @NotNull public static Store.Builder store() { return new Store.Builder(new HashMap<String,Object>()); }
  /**
   * A governmental organization or agency.
   */
  @NotNull public static GovernmentOrganization.Builder governmentOrganization() { return new GovernmentOrganization.Builder(new HashMap<String,Object>()); }
  /**
   * An aggregate rating of an Organization related to its role as an employer.
   */
  @NotNull public static EmployerAggregateRating.Builder employerAggregateRating() { return new EmployerAggregateRating.Builder(new HashMap<String,Object>()); }
  /**
   * The most generic type of entity related to health and the practice of medicine.
   */
  @NotNull public static MedicalEntity.Builder medicalEntity() { return new MedicalEntity.Builder(new HashMap<String,Object>()); }
  /**
   * A reservation for lodging at a hotel, motel, inn, etc.&lt;br/&gt;&lt;br/&gt;

Note: This type is for information about actual reservations, e.g. in confirmation emails or HTML pages with individual confirmations of reservations.
   */
  @NotNull public static LodgingReservation.Builder lodgingReservation() { return new LodgingReservation.Builder(new HashMap<String,Object>()); }
  /**
   * The anatomical location at which two or more bones make contact.
   */
  @NotNull public static Joint.Builder joint() { return new Joint.Builder(new HashMap<String,Object>()); }
  /**
   * An entry point, within some Web-based protocol.
   */
  @NotNull public static EntryPoint.Builder entryPoint() { return new EntryPoint.Builder(new HashMap<String,Object>()); }
  /**
   * A work of art that is primarily visual in character.
   */
  @NotNull public static VisualArtwork.Builder visualArtwork() { return new VisualArtwork.Builder(new HashMap<String,Object>()); }
  /**
   * An agent pays a price to a participant.
   */
  @NotNull public static PayAction.Builder payAction() { return new PayAction.Builder(new HashMap<String,Object>()); }
  /**
   * Event type: Children's event.
   */
  @NotNull public static ChildrensEvent.Builder childrensEvent() { return new ChildrensEvent.Builder(new HashMap<String,Object>()); }
  /**
   * An OfferCatalog is an ItemList that contains related Offers and/or further OfferCatalogs that are offeredBy the same provider.
   */
  @NotNull public static OfferCatalog.Builder offerCatalog() { return new OfferCatalog.Builder(new HashMap<String,Object>()); }
  /**
   * A music venue.
   */
  @NotNull public static MusicVenue.Builder musicVenue() { return new MusicVenue.Builder(new HashMap<String,Object>()); }
  /**
   * A MerchantReturnPolicy provides information about product return policies associated with an &lt;a class=&quot;localLink&quot; href=&quot;http://schema.org/Organization&quot;&gt;Organization&lt;/a&gt; or &lt;a class=&quot;localLink&quot; href=&quot;http://schema.org/Product&quot;&gt;Product&lt;/a&gt;.
   */
  @NotNull public static MerchantReturnPolicy.Builder merchantReturnPolicy() { return new MerchantReturnPolicy.Builder(new HashMap<String,Object>()); }
  /**
   * The act of expressing a consistency of opinion with the object. An agent agrees to/about an object (a proposition, topic or theme) with participants.
   */
  @NotNull public static AgreeAction.Builder agreeAction() { return new AgreeAction.Builder(new HashMap<String,Object>()); }
  /**
   * A service to convert funds from one currency to another currency.
   */
  @NotNull public static CurrencyConversionService.Builder currencyConversionService() { return new CurrencyConversionService.Builder(new HashMap<String,Object>()); }
  /**
   * A Childcare center.
   */
  @NotNull public static ChildCare.Builder childCare() { return new ChildCare.Builder(new HashMap<String,Object>()); }
  /**
   * A &lt;a class=&quot;localLink&quot; href=&quot;http://schema.org/CriticReview&quot;&gt;CriticReview&lt;/a&gt; is a more specialized form of Review written or published by a source that is recognized for its reviewing activities. These can include online columns, travel and food guides, TV and radio shows, blogs and other independent Web sites. &lt;a class=&quot;localLink&quot; href=&quot;http://schema.org/CriticReview&quot;&gt;CriticReview&lt;/a&gt;s are typically more in-depth and professionally written. For simpler, casually written user/visitor/viewer/customer reviews, it is more appropriate to use the &lt;a class=&quot;localLink&quot; href=&quot;http://schema.org/UserReview&quot;&gt;UserReview&lt;/a&gt; type. Review aggregator sites such as Metacritic already separate out the site's user reviews from selected critic reviews that originate from third-party sources.
   */
  @NotNull public static CriticReview.Builder criticReview() { return new CriticReview.Builder(new HashMap<String,Object>()); }
  /**
   * A radio channel that uses FM.
   */
  @NotNull public static FMRadioChannel.Builder fMRadioChannel() { return new FMRadioChannel.Builder(new HashMap<String,Object>()); }
  /**
   * Dietetic and nutrition as a medical speciality.
   */
  @NotNull public static DietNutrition.Builder dietNutrition() { return new DietNutrition.Builder(new HashMap<String,Object>()); }
  /**
   * A type of bed. This is used for indicating the bed or beds available in an accommodation.
   */
  @NotNull public static BedType.Builder bedType() { return new BedType.Builder(new HashMap<String,Object>()); }
  /**
   * Web page type: Checkout page.
   */
  @NotNull public static CheckoutPage.Builder checkoutPage() { return new CheckoutPage.Builder(new HashMap<String,Object>()); }
  /**
   * Brewery.
   */
  @NotNull public static Brewery.Builder brewery() { return new Brewery.Builder(new HashMap<String,Object>()); }
  /**
   * A zoo.
   */
  @NotNull public static Zoo.Builder zoo() { return new Zoo.Builder(new HashMap<String,Object>()); }
  /**
   * The term &quot;story&quot; is any indivisible, re-printable
    unit of a comic, including the interior stories, covers, and backmatter. Most
    comics have at least two stories: a cover (ComicCoverArt) and an interior story.
   */
  @NotNull public static ComicStory.Builder comicStory() { return new ComicStory.Builder(new HashMap<String,Object>()); }
  /**
   * Event type: Sports event.
   */
  @NotNull public static SportsEvent.Builder sportsEvent() { return new SportsEvent.Builder(new HashMap<String,Object>()); }
  /**
   * The act of editing a recipient by replacing an old object with a new object.
   */
  @NotNull public static ReplaceAction.Builder replaceAction() { return new ReplaceAction.Builder(new HashMap<String,Object>()); }
  /**
   * A stage of a medical condition, such as 'Stage IIIa'.
   */
  @NotNull public static MedicalConditionStage.Builder medicalConditionStage() { return new MedicalConditionStage.Builder(new HashMap<String,Object>()); }
  /**
   * A motorcycle or motorbike is a single-track, two-wheeled motor vehicle.
   */
  @NotNull public static Motorcycle.Builder motorcycle() { return new Motorcycle.Builder(new HashMap<String,Object>()); }
  /**
   * A product or service offered by a bank whereby one may deposit, withdraw or transfer money and in some cases be paid interest.
   */
  @NotNull public static BankAccount.Builder bankAccount() { return new BankAccount.Builder(new HashMap<String,Object>()); }
  /**
   * The act of consuming written content.
   */
  @NotNull public static ReadAction.Builder readAction() { return new ReadAction.Builder(new HashMap<String,Object>()); }
  /**
   * A musical composition.
   */
  @NotNull public static MusicComposition.Builder musicComposition() { return new MusicComposition.Builder(new HashMap<String,Object>()); }
  /**
   * A scholarly article in the medical domain.
   */
  @NotNull public static MedicalScholarlyArticle.Builder medicalScholarlyArticle() { return new MedicalScholarlyArticle.Builder(new HashMap<String,Object>()); }
  /**
   * A house is a building or structure that has the ability to be occupied for habitation by humans or other creatures (Source: Wikipedia, the free encyclopedia, see &lt;a href=&quot;http://en.wikipedia.org/wiki/House&quot;&gt;http://en.wikipedia.org/wiki/House&lt;/a&gt;).
   */
  @NotNull public static House.Builder house() { return new House.Builder(new HashMap<String,Object>()); }
  /**
   * Any collection of tests commonly ordered together.
   */
  @NotNull public static MedicalTestPanel.Builder medicalTestPanel() { return new MedicalTestPanel.Builder(new HashMap<String,Object>()); }
  /**
   * The act of searching for an object.&lt;br/&gt;&lt;br/&gt;

Related actions:&lt;br/&gt;&lt;br/&gt;

&lt;ul&gt;
&lt;li&gt;&lt;a class=&quot;localLink&quot; href=&quot;http://schema.org/FindAction&quot;&gt;FindAction&lt;/a&gt;: SearchAction generally leads to a FindAction, but not necessarily.&lt;/li&gt;
&lt;/ul&gt;

   */
  @NotNull public static SearchAction.Builder searchAction() { return new SearchAction.Builder(new HashMap<String,Object>()); }
  /**
   * A roofing contractor.
   */
  @NotNull public static RoofingContractor.Builder roofingContractor() { return new RoofingContractor.Builder(new HashMap<String,Object>()); }
  /**
   * An application programming interface accessible over Web/Internet technologies.
   */
  @NotNull public static WebAPI.Builder webAPI() { return new WebAPI.Builder(new HashMap<String,Object>()); }
  /**
   * An order is a confirmation of a transaction (a receipt), which can contain multiple line items, each represented by an Offer that has been accepted by the customer.
   */
  @NotNull public static Order.Builder order() { return new Order.Builder(new HashMap<String,Object>()); }
  /**
   * An embassy.
   */
  @NotNull public static Embassy.Builder embassy() { return new Embassy.Builder(new HashMap<String,Object>()); }
  /**
   * A schedule defines a repeating time period used to describe a regularly occurring &lt;a class=&quot;localLink&quot; href=&quot;http://schema.org/Event&quot;&gt;Event&lt;/a&gt;. At a minimum a schedule will specify &lt;a class=&quot;localLink&quot; href=&quot;http://schema.org/repeatFrequency&quot;&gt;repeatFrequency&lt;/a&gt; which describes the interval between occurences of the event. Additional information can be provided to specify the schedule more precisely.
      This includes identifying the day(s) of the week or month when the recurring event will take place, in addition to its start and end time. Schedules may also
      have start and end dates to indicate when they are active, e.g. to define a limited calendar of events.
   */
  @NotNull public static Schedule.Builder schedule() { return new Schedule.Builder(new HashMap<String,Object>()); }
  /**
   * A bus (also omnibus or autobus) is a road vehicle designed to carry passengers. Coaches are luxury busses, usually in service for long distance travel.
   */
  @NotNull public static BusOrCoach.Builder busOrCoach() { return new BusOrCoach.Builder(new HashMap<String,Object>()); }
  /**
   * A sporting goods store.
   */
  @NotNull public static SportingGoodsStore.Builder sportingGoodsStore() { return new SportingGoodsStore.Builder(new HashMap<String,Object>()); }
  /**
   * The act of traveling from an fromLocation to a destination by a specified mode of transport, optionally with participants.
   */
  @NotNull public static TravelAction.Builder travelAction() { return new TravelAction.Builder(new HashMap<String,Object>()); }
  /**
   * A hotel room is a single room in a hotel.
&lt;br /&gt;&lt;br /&gt;
See also the &lt;a href=&quot;/docs/hotels.html&quot;&gt;dedicated document on the use of schema.org for marking up hotels and other forms of accommodations&lt;/a&gt;.
   */
  @NotNull public static HotelRoom.Builder hotelRoom() { return new HotelRoom.Builder(new HashMap<String,Object>()); }
  /**
   * Any rule set or interactive tool for estimating the risk of developing a complication or condition.
   */
  @NotNull public static MedicalRiskEstimator.Builder medicalRiskEstimator() { return new MedicalRiskEstimator.Builder(new HashMap<String,Object>()); }
  /**
   * The header section of the page.
   */
  @NotNull public static WPHeader.Builder wPHeader() { return new WPHeader.Builder(new HashMap<String,Object>()); }
  /**
   * A set of characteristics belonging to businesses, e.g. who compose an item's target audience.
   */
  @NotNull public static BusinessAudience.Builder businessAudience() { return new BusinessAudience.Builder(new HashMap<String,Object>()); }
  /**
   * A &lt;a href=&quot;https://en.wikipedia.org/wiki/Hackathon&quot;&gt;hackathon&lt;/a&gt; event.
   */
  @NotNull public static Hackathon.Builder hackathon() { return new Hackathon.Builder(new HashMap<String,Object>()); }
  /**
   * A listing that describes a job opening in a certain organization.
   */
  @NotNull public static JobPosting.Builder jobPosting() { return new JobPosting.Builder(new HashMap<String,Object>()); }
  /**
   * A motel.
&lt;br /&gt;&lt;br /&gt;
See also the &lt;a href=&quot;/docs/hotels.html&quot;&gt;dedicated document on the use of schema.org for marking up hotels and other forms of accommodations&lt;/a&gt;.
   */
  @NotNull public static Motel.Builder motel() { return new Motel.Builder(new HashMap<String,Object>()); }
  /**
   * Represents the collection of all sports organizations, including sports teams, governing bodies, and sports associations.
   */
  @NotNull public static SportsOrganization.Builder sportsOrganization() { return new SportsOrganization.Builder(new HashMap<String,Object>()); }
  /**
   * The act of stopping or deactivating a device or application (e.g. stopping a timer or turning off a flashlight).
   */
  @NotNull public static DeactivateAction.Builder deactivateAction() { return new DeactivateAction.Builder(new HashMap<String,Object>()); }
  /**
   * UserInteraction and its subtypes is an old way of talking about users interacting with pages. It is generally better to use &lt;a class=&quot;localLink&quot; href=&quot;http://schema.org/Action&quot;&gt;Action&lt;/a&gt;-based vocabulary, alongside types such as &lt;a class=&quot;localLink&quot; href=&quot;http://schema.org/Comment&quot;&gt;Comment&lt;/a&gt;.
   */
  @NotNull public static UserLikes.Builder userLikes() { return new UserLikes.Builder(new HashMap<String,Object>()); }
  /**
   * A set of characteristics describing parents, who can be interested in viewing some content.
   */
  @NotNull public static ParentAudience.Builder parentAudience() { return new ParentAudience.Builder(new HashMap<String,Object>()); }
  /**
   * &lt;a class=&quot;localLink&quot; href=&quot;http://schema.org/Recommendation&quot;&gt;Recommendation&lt;/a&gt; is a type of &lt;a class=&quot;localLink&quot; href=&quot;http://schema.org/Review&quot;&gt;Review&lt;/a&gt; that suggests or proposes something as the best option or best course of action. Recommendations may be for products or services, or other concrete things, as in the case of a ranked list or product guide. A &lt;a class=&quot;localLink&quot; href=&quot;http://schema.org/Guide&quot;&gt;Guide&lt;/a&gt; may list multiple recommendations for different categories. For example, in a &lt;a class=&quot;localLink&quot; href=&quot;http://schema.org/Guide&quot;&gt;Guide&lt;/a&gt; about which TVs to buy, the author may have several &lt;a class=&quot;localLink&quot; href=&quot;http://schema.org/Recommendation&quot;&gt;Recommendation&lt;/a&gt;s.
   */
  @NotNull public static Recommendation.Builder recommendation() { return new Recommendation.Builder(new HashMap<String,Object>()); }
  /**
   * A process of care using radiation aimed at improving a health condition.
   */
  @NotNull public static RadiationTherapy.Builder radiationTherapy() { return new RadiationTherapy.Builder(new HashMap<String,Object>()); }
  /**
   * An agent orders a (not yet released) object/product/service to be delivered/sent.
   */
  @NotNull public static PreOrderAction.Builder preOrderAction() { return new PreOrderAction.Builder(new HashMap<String,Object>()); }
  /**
   * A high school.
   */
  @NotNull public static HighSchool.Builder highSchool() { return new HighSchool.Builder(new HashMap<String,Object>()); }
  /**
   * The act of providing goods, services, or money without compensation, often for philanthropic reasons.
   */
  @NotNull public static DonateAction.Builder donateAction() { return new DonateAction.Builder(new HashMap<String,Object>()); }
  /**
   * Properties that take Distances as values are of the form '&amp;lt;Number&amp;gt; &amp;lt;Length unit of measure&amp;gt;'. E.g., '7 ft'.
   */
  @NotNull public static Distance.Builder distance() { return new Distance.Builder(new HashMap<String,Object>()); }
  /**
   * A golf course.
   */
  @NotNull public static GolfCourse.Builder golfCourse() { return new GolfCourse.Builder(new HashMap<String,Object>()); }
  /**
   * A quotation. Often but not necessarily from some written work, attributable to a real world author and - if associated with a fictional character - to any fictional Person. Use &lt;a class=&quot;localLink&quot; href=&quot;http://schema.org/isBasedOn&quot;&gt;isBasedOn&lt;/a&gt; to link to source/origin. The &lt;a class=&quot;localLink&quot; href=&quot;http://schema.org/recordedIn&quot;&gt;recordedIn&lt;/a&gt; property can be used to reference a Quotation from an &lt;a class=&quot;localLink&quot; href=&quot;http://schema.org/Event&quot;&gt;Event&lt;/a&gt;.
   */
  @NotNull public static Quotation.Builder quotation() { return new Quotation.Builder(new HashMap<String,Object>()); }
  /**
   * A store that sells mobile phones and related accessories.
   */
  @NotNull public static MobilePhoneStore.Builder mobilePhoneStore() { return new MobilePhoneStore.Builder(new HashMap<String,Object>()); }
  /**
   * A placeholder for multiple similar products of the same kind.
   */
  @NotNull public static SomeProducts.Builder someProducts() { return new SomeProducts.Builder(new HashMap<String,Object>()); }
  /**
   * A contact point&amp;#x2014;for example, a Customer Complaints department.
   */
  @NotNull public static ContactPoint.Builder contactPoint() { return new ContactPoint.Builder(new HashMap<String,Object>()); }
  /**
   * A sports club.
   */
  @NotNull public static SportsClub.Builder sportsClub() { return new SportsClub.Builder(new HashMap<String,Object>()); }
  /**
   * A US-style health insurance plan network.
   */
  @NotNull public static HealthPlanNetwork.Builder healthPlanNetwork() { return new HealthPlanNetwork.Builder(new HashMap<String,Object>()); }
  /**
   * The act of participating in performance arts.
   */
  @NotNull public static PerformAction.Builder performAction() { return new PerformAction.Builder(new HashMap<String,Object>()); }
  /**
   * A dance group&amp;#x2014;for example, the Alvin Ailey Dance Theater or Riverdance.
   */
  @NotNull public static DanceGroup.Builder danceGroup() { return new DanceGroup.Builder(new HashMap<String,Object>()); }
  /**
   * A legislative building&amp;#x2014;for example, the state capitol.
   */
  @NotNull public static LegislativeBuilding.Builder legislativeBuilding() { return new LegislativeBuilding.Builder(new HashMap<String,Object>()); }
  /**
   * A description of an educational course which may be offered as distinct instances at which take place at different times or take place at different locations, or be offered through different media or modes of study. An educational course is a sequence of one or more educational events and/or creative works which aims to build knowledge, competence or ability of learners.
   */
  @NotNull public static Course.Builder course() { return new Course.Builder(new HashMap<String,Object>()); }
  /**
   * A profession, may involve prolonged training and/or a formal qualification.
   */
  @NotNull public static Occupation.Builder occupation() { return new Occupation.Builder(new HashMap<String,Object>()); }
  /**
   * A &lt;a class=&quot;localLink&quot; href=&quot;http://schema.org/Claim&quot;&gt;Claim&lt;/a&gt; in Schema.org represents a specific, factually-oriented claim that could be the &lt;a class=&quot;localLink&quot; href=&quot;http://schema.org/itemReviewed&quot;&gt;itemReviewed&lt;/a&gt; in a &lt;a class=&quot;localLink&quot; href=&quot;http://schema.org/ClaimReview&quot;&gt;ClaimReview&lt;/a&gt;. The content of a claim can be summarized with the &lt;a class=&quot;localLink&quot; href=&quot;http://schema.org/text&quot;&gt;text&lt;/a&gt; property. Variations on well known claims can have their common identity indicated via &lt;a class=&quot;localLink&quot; href=&quot;http://schema.org/sameAs&quot;&gt;sameAs&lt;/a&gt; links, and summarized with a &lt;a class=&quot;localLink&quot; href=&quot;http://schema.org/name&quot;&gt;name&lt;/a&gt;. Ideally, a &lt;a class=&quot;localLink&quot; href=&quot;http://schema.org/Claim&quot;&gt;Claim&lt;/a&gt; description includes enough contextual information to minimize the risk of ambiguity or inclarity. In practice, many claims are better understood in the context in which they appear or the interpretations provided by claim reviews.&lt;br/&gt;&lt;br/&gt;

Beyond &lt;a class=&quot;localLink&quot; href=&quot;http://schema.org/ClaimReview&quot;&gt;ClaimReview&lt;/a&gt;, the Claim type can be associated with related creative works - for example a &lt;a class=&quot;localLink&quot; href=&quot;http://schema.org/ScholaryArticle&quot;&gt;ScholaryArticle&lt;/a&gt; or &lt;a class=&quot;localLink&quot; href=&quot;http://schema.org/Question&quot;&gt;Question&lt;/a&gt; might be &lt;a class=&quot;localLink&quot; href=&quot;http://schema.org/about&quot;&gt;about&lt;/a&gt; some &lt;a class=&quot;localLink&quot; href=&quot;http://schema.org/Claim&quot;&gt;Claim&lt;/a&gt;.&lt;br/&gt;&lt;br/&gt;

At this time, Schema.org does not define any types of relationship between claims. This is a natural area for future exploration.
   */
  @NotNull public static Claim.Builder claim() { return new Claim.Builder(new HashMap<String,Object>()); }
  /**
   * A FundingAgency is an organization that implements one or more &lt;a class=&quot;localLink&quot; href=&quot;http://schema.org/FundingScheme&quot;&gt;FundingScheme&lt;/a&gt;s and manages
    the granting process (via &lt;a class=&quot;localLink&quot; href=&quot;http://schema.org/Grant&quot;&gt;Grant&lt;/a&gt;s, typically &lt;a class=&quot;localLink&quot; href=&quot;http://schema.org/MonetaryGrant&quot;&gt;MonetaryGrant&lt;/a&gt;s).
    A funding agency is not always required for grant funding, e.g. philanthropic giving, corporate sponsorship etc.&lt;br/&gt;&lt;br/&gt;

&lt;pre&gt;&lt;code&gt;Examples of funding agencies include ERC, REA, NIH, Bill and Melinda Gates Foundation...
&lt;/code&gt;&lt;/pre&gt;

   */
  @NotNull public static FundingAgency.Builder fundingAgency() { return new FundingAgency.Builder(new HashMap<String,Object>()); }
  /**
   * The act of notifying someone of information pertinent to them, with no expectation of a response.
   */
  @NotNull public static InformAction.Builder informAction() { return new InformAction.Builder(new HashMap<String,Object>()); }
  /**
   * Event type: Education event.
   */
  @NotNull public static EducationEvent.Builder educationEvent() { return new EducationEvent.Builder(new HashMap<String,Object>()); }
  /**
   * A fire station. With firemen.
   */
  @NotNull public static FireStation.Builder fireStation() { return new FireStation.Builder(new HashMap<String,Object>()); }
  /**
   * Information about the engine of the vehicle. A vehicle can have multiple engines represented by multiple engine specification entities.
   */
  @NotNull public static EngineSpecification.Builder engineSpecification() { return new EngineSpecification.Builder(new HashMap<String,Object>()); }
  /**
   * A specific branch of medical science that deals with benign and malignant tumors, including the study of their development, diagnosis, treatment and prevention.
   */
  @NotNull public static Oncologic.Builder oncologic() { return new Oncologic.Builder(new HashMap<String,Object>()); }
  /**
   * An airline flight.
   */
  @NotNull public static Flight.Builder flight() { return new Flight.Builder(new HashMap<String,Object>()); }
  /**
   * A utility class that serves as the umbrella for a number of 'intangible' things such as quantities, structured values, etc.
   */
  @NotNull public static Intangible.Builder intangible() { return new Intangible.Builder(new HashMap<String,Object>()); }
  /**
   * A Workers Union (also known as a Labor Union, Labour Union, or Trade Union) is an organization that promotes the interests of its worker members by collectively bargaining with management, organizing, and political lobbying.
   */
  @NotNull public static WorkersUnion.Builder workersUnion() { return new WorkersUnion.Builder(new HashMap<String,Object>()); }
  /**
   * The act of responding to a question/message asked/sent by the object. Related to &lt;a class=&quot;localLink&quot; href=&quot;http://schema.org/AskAction&quot;&gt;AskAction&lt;/a&gt;&lt;br/&gt;&lt;br/&gt;

Related actions:&lt;br/&gt;&lt;br/&gt;

&lt;ul&gt;
&lt;li&gt;&lt;a class=&quot;localLink&quot; href=&quot;http://schema.org/AskAction&quot;&gt;AskAction&lt;/a&gt;: Appears generally as an origin of a ReplyAction.&lt;/li&gt;
&lt;/ul&gt;

   */
  @NotNull public static ReplyAction.Builder replyAction() { return new ReplyAction.Builder(new HashMap<String,Object>()); }
  /**
   * The act of forming a personal connection with someone/something (object) unidirectionally/asymmetrically to get updates pushed to.&lt;br/&gt;&lt;br/&gt;

Related actions:&lt;br/&gt;&lt;br/&gt;

&lt;ul&gt;
&lt;li&gt;&lt;a class=&quot;localLink&quot; href=&quot;http://schema.org/FollowAction&quot;&gt;FollowAction&lt;/a&gt;: Unlike FollowAction, SubscribeAction implies that the subscriber acts as a passive agent being constantly/actively pushed for updates.&lt;/li&gt;
&lt;li&gt;&lt;a class=&quot;localLink&quot; href=&quot;http://schema.org/RegisterAction&quot;&gt;RegisterAction&lt;/a&gt;: Unlike RegisterAction, SubscribeAction implies that the agent is interested in continuing receiving updates from the object.&lt;/li&gt;
&lt;li&gt;&lt;a class=&quot;localLink&quot; href=&quot;http://schema.org/JoinAction&quot;&gt;JoinAction&lt;/a&gt;: Unlike JoinAction, SubscribeAction implies that the agent is interested in continuing receiving updates from the object.&lt;/li&gt;
&lt;/ul&gt;

   */
  @NotNull public static SubscribeAction.Builder subscribeAction() { return new SubscribeAction.Builder(new HashMap<String,Object>()); }
  /**
   * A doctor's office.
   */
  @NotNull public static Physician.Builder physician() { return new Physician.Builder(new HashMap<String,Object>()); }
  /**
   * Reference documentation for application programming interfaces (APIs).
   */
  @NotNull public static APIReference.Builder aPIReference() { return new APIReference.Builder(new HashMap<String,Object>()); }
  /**
   * A property, used to indicate attributes and relationships of some Thing; equivalent to rdf:Property.
   */
  @NotNull public static Property.Builder property() { return new Property.Builder(new HashMap<String,Object>()); }
  /**
   * Any complaint sensed and expressed by the patient (therefore defined as subjective)  like stomachache, lower-back pain, or fatigue.
   */
  @NotNull public static MedicalSymptom.Builder medicalSymptom() { return new MedicalSymptom.Builder(new HashMap<String,Object>()); }
  /**
   * An email message.
   */
  @NotNull public static EmailMessage.Builder emailMessage() { return new EmailMessage.Builder(new HashMap<String,Object>()); }
  /**
   * A suite in a hotel or other public accommodation, denotes a class of luxury accommodations, the key feature of which is multiple rooms (Source: Wikipedia, the free encyclopedia, see &lt;a href=&quot;http://en.wikipedia.org/wiki/Suite_(hotel)&quot;&gt;http://en.wikipedia.org/wiki/Suite_(hotel)&lt;/a&gt;).
&lt;br /&gt;&lt;br /&gt;
See also the &lt;a href=&quot;/docs/hotels.html&quot;&gt;dedicated document on the use of schema.org for marking up hotels and other forms of accommodations&lt;/a&gt;.
   */
  @NotNull public static Suite.Builder suite() { return new Suite.Builder(new HashMap<String,Object>()); }
  /**
   * A Property value specification.
   */
  @NotNull public static PropertyValueSpecification.Builder propertyValueSpecification() { return new PropertyValueSpecification.Builder(new HashMap<String,Object>()); }
  /**
   * Data type: PronounceableText.
   */
  @NotNull public static PronounceableText.Builder pronounceableText() { return new PronounceableText.Builder(new HashMap<String,Object>()); }
  /**
   * A screening of a movie or other video.
   */
  @NotNull public static ScreeningEvent.Builder screeningEvent() { return new ScreeningEvent.Builder(new HashMap<String,Object>()); }
  /**
   * A picture or diagram made with a pencil, pen, or crayon rather than paint.
   */
  @NotNull public static Drawing.Builder drawing() { return new Drawing.Builder(new HashMap<String,Object>()); }
  /**
   * Any recommendation made by a standard society (e.g. ACC/AHA) or consensus statement that denotes how to diagnose and treat a particular condition. Note: this type should be used to tag the actual guideline recommendation; if the guideline recommendation occurs in a larger scholarly article, use MedicalScholarlyArticle to tag the overall article, not this type. Note also: the organization making the recommendation should be captured in the recognizingAuthority base property of MedicalEntity.
   */
  @NotNull public static MedicalGuideline.Builder medicalGuideline() { return new MedicalGuideline.Builder(new HashMap<String,Object>()); }
  /**
   * An outlet store.
   */
  @NotNull public static OutletStore.Builder outletStore() { return new OutletStore.Builder(new HashMap<String,Object>()); }
  /**
   * A treatment of people with physical, emotional, or social problems, using purposeful activity to help them overcome or learn to deal with their problems.
   */
  @NotNull public static OccupationalTherapy.Builder occupationalTherapy() { return new OccupationalTherapy.Builder(new HashMap<String,Object>()); }
  /**
   * The act of consuming dynamic/moving visual content.
   */
  @NotNull public static WatchAction.Builder watchAction() { return new WatchAction.Builder(new HashMap<String,Object>()); }
  /**
   * The act of intentionally disregarding the object. An agent ignores an object.
   */
  @NotNull public static IgnoreAction.Builder ignoreAction() { return new IgnoreAction.Builder(new HashMap<String,Object>()); }
  /**
   * The causative agent(s) that are responsible for the pathophysiologic process that eventually results in a medical condition, symptom or sign. In this schema, unless otherwise specified this is meant to be the proximate cause of the medical condition, symptom or sign. The proximate cause is defined as the causative agent that most directly results in the medical condition, symptom or sign. For example, the HIV virus could be considered a cause of AIDS. Or in a diagnostic context, if a patient fell and sustained a hip fracture and two days later sustained a pulmonary embolism which eventuated in a cardiac arrest, the cause of the cardiac arrest (the proximate cause) would be the pulmonary embolism and not the fall. Medical causes can include cardiovascular, chemical, dermatologic, endocrine, environmental, gastroenterologic, genetic, hematologic, gynecologic, iatrogenic, infectious, musculoskeletal, neurologic, nutritional, obstetric, oncologic, otolaryngologic, pharmacologic, psychiatric, pulmonary, renal, rheumatologic, toxic, traumatic, or urologic causes; medical conditions can be causes as well.
   */
  @NotNull public static MedicalCause.Builder medicalCause() { return new MedicalCause.Builder(new HashMap<String,Object>()); }
  /**
   * An observational study is a type of medical study that attempts to infer the possible effect of a treatment through observation of a cohort of subjects over a period of time. In an observational study, the assignment of subjects into treatment groups versus control groups is outside the control of the investigator. This is in contrast with controlled studies, such as the randomized controlled trials represented by MedicalTrial, where each subject is randomly assigned to a treatment group or a control group before the start of the treatment.
   */
  @NotNull public static MedicalObservationalStudy.Builder medicalObservationalStudy() { return new MedicalObservationalStudy.Builder(new HashMap<String,Object>()); }
  /**
   * A muscle is an anatomical structure consisting of a contractile form of tissue that animals use to effect movement.
   */
  @NotNull public static Muscle.Builder muscle() { return new Muscle.Builder(new HashMap<String,Object>()); }
  /**
   * The price asked for a given offer by the respective organization or person.
   */
  @NotNull public static UnitPriceSpecification.Builder unitPriceSpecification() { return new UnitPriceSpecification.Builder(new HashMap<String,Object>()); }
  /**
   * A process of care used in either a diagnostic, therapeutic, preventive or palliative capacity that relies on invasive (surgical), non-invasive, or other techniques.
   */
  @NotNull public static MedicalProcedure.Builder medicalProcedure() { return new MedicalProcedure.Builder(new HashMap<String,Object>()); }
  /**
   * An AnalysisNewsArticle is a &lt;a class=&quot;localLink&quot; href=&quot;http://schema.org/NewsArticle&quot;&gt;NewsArticle&lt;/a&gt; that, while based on factual reporting, incorporates the expertise of the author/producer, offering interpretations and conclusions.
   */
  @NotNull public static AnalysisNewsArticle.Builder analysisNewsArticle() { return new AnalysisNewsArticle.Builder(new HashMap<String,Object>()); }
  /**
   * A Series in schema.org is a group of related items, typically but not necessarily of the same kind. See also &lt;a class=&quot;localLink&quot; href=&quot;http://schema.org/CreativeWorkSeries&quot;&gt;CreativeWorkSeries&lt;/a&gt;, &lt;a class=&quot;localLink&quot; href=&quot;http://schema.org/EventSeries&quot;&gt;EventSeries&lt;/a&gt;.
   */
  @NotNull public static Series.Builder series() { return new Series.Builder(new HashMap<String,Object>()); }
  /**
   * A &lt;a class=&quot;localLink&quot; href=&quot;http://schema.org/comment&quot;&gt;comment&lt;/a&gt; that corrects &lt;a class=&quot;localLink&quot; href=&quot;http://schema.org/CreativeWork&quot;&gt;CreativeWork&lt;/a&gt;.
   */
  @NotNull public static CorrectionComment.Builder correctionComment() { return new CorrectionComment.Builder(new HashMap<String,Object>()); }
  /**
   * A value indicating which roadwheels will receive torque.
   */
  @NotNull public static DriveWheelConfigurationValue.Builder driveWheelConfigurationValue() { return new DriveWheelConfigurationValue.Builder(new HashMap<String,Object>()); }
  /**
   * A hostel - cheap accommodation, often in shared dormitories.
&lt;br /&gt;&lt;br /&gt;
See also the &lt;a href=&quot;/docs/hotels.html&quot;&gt;dedicated document on the use of schema.org for marking up hotels and other forms of accommodations&lt;/a&gt;.
   */
  @NotNull public static Hostel.Builder hostel() { return new Hostel.Builder(new HashMap<String,Object>()); }
  /**
   * A vet's office.
   */
  @NotNull public static VeterinaryCare.Builder veterinaryCare() { return new VeterinaryCare.Builder(new HashMap<String,Object>()); }
  /**
   * An advertising section of the page.
   */
  @NotNull public static WPAdBlock.Builder wPAdBlock() { return new WPAdBlock.Builder(new HashMap<String,Object>()); }
  /**
   * A scholarly article.
   */
  @NotNull public static ScholarlyArticle.Builder scholarlyArticle() { return new ScholarlyArticle.Builder(new HashMap<String,Object>()); }
  /**
   * A bike store.
   */
  @NotNull public static BikeStore.Builder bikeStore() { return new BikeStore.Builder(new HashMap<String,Object>()); }
  /**
   * A nightclub or discotheque.
   */
  @NotNull public static NightClub.Builder nightClub() { return new NightClub.Builder(new HashMap<String,Object>()); }
  /**
   * A pond.
   */
  @NotNull public static Pond.Builder pond() { return new Pond.Builder(new HashMap<String,Object>()); }
  /**
   * CreativeWorkSeries dedicated to TV broadcast and associated online delivery.
   */
  @NotNull public static TVSeries.Builder tVSeries() { return new TVSeries.Builder(new HashMap<String,Object>()); }
  /**
   * A media season e.g. tv, radio, video game etc.
   */
  @NotNull public static CreativeWorkSeason.Builder creativeWorkSeason() { return new CreativeWorkSeason.Builder(new HashMap<String,Object>()); }
  /**
   * Bank or credit union.
   */
  @NotNull public static BankOrCreditUnion.Builder bankOrCreditUnion() { return new BankOrCreditUnion.Builder(new HashMap<String,Object>()); }
  /**
   * A real-estate agent.
   */
  @NotNull public static RealEstateAgent.Builder realEstateAgent() { return new RealEstateAgent.Builder(new HashMap<String,Object>()); }
  /**
   * An electronics store.
   */
  @NotNull public static ElectronicsStore.Builder electronicsStore() { return new ElectronicsStore.Builder(new HashMap<String,Object>()); }
  /**
   * Health and beauty.
   */
  @NotNull public static HealthAndBeautyBusiness.Builder healthAndBeautyBusiness() { return new HealthAndBeautyBusiness.Builder(new HashMap<String,Object>()); }
  /**
   * A health profession of a person formally educated and trained in the care of the sick or infirm person.
   */
  @NotNull public static Nursing.Builder nursing() { return new Nursing.Builder(new HashMap<String,Object>()); }
  /**
   * Researchers.
   */
  @NotNull public static Researcher.Builder researcher() { return new Researcher.Builder(new HashMap<String,Object>()); }
  /**
   * The act of expressing a preference from a fixed/finite/structured set of choices/options.
   */
  @NotNull public static VoteAction.Builder voteAction() { return new VoteAction.Builder(new HashMap<String,Object>()); }
  /**
   * A short radio program or a segment/part of a radio program.
   */
  @NotNull public static RadioClip.Builder radioClip() { return new RadioClip.Builder(new HashMap<String,Object>()); }
  /**
   * A video file.
   */
  @NotNull public static VideoObject.Builder videoObject() { return new VideoObject.Builder(new HashMap<String,Object>()); }
  /**
   * A permit issued by an organization, e.g. a parking pass.
   */
  @NotNull public static Permit.Builder permit() { return new Permit.Builder(new HashMap<String,Object>()); }
  /**
   * A comment on an item - for example, a comment on a blog post. The comment's content is expressed via the &lt;a class=&quot;localLink&quot; href=&quot;http://schema.org/text&quot;&gt;text&lt;/a&gt; property, and its topic via &lt;a class=&quot;localLink&quot; href=&quot;http://schema.org/about&quot;&gt;about&lt;/a&gt;, properties shared with all CreativeWorks.
   */
  @NotNull public static Comment.Builder comment() { return new Comment.Builder(new HashMap<String,Object>()); }
  /**
   * A GeoCircle is a GeoShape representing a circular geographic area. As it is a GeoShape
          it provides the simple textual property 'circle', but also allows the combination of postalCode alongside geoRadius.
          The center of the circle can be indicated via the 'geoMidpoint' property, or more approximately using 'address', 'postalCode'.
   */
  @NotNull public static GeoCircle.Builder geoCircle() { return new GeoCircle.Builder(new HashMap<String,Object>()); }
  /**
   * A supply consumed when performing the instructions for how to achieve a result.
   */
  @NotNull public static HowToSupply.Builder howToSupply() { return new HowToSupply.Builder(new HashMap<String,Object>()); }
  /**
   * An event involving the delivery of an item.
   */
  @NotNull public static DeliveryEvent.Builder deliveryEvent() { return new DeliveryEvent.Builder(new HashMap<String,Object>()); }
  /**
   * The act of finding an object.&lt;br/&gt;&lt;br/&gt;

Related actions:&lt;br/&gt;&lt;br/&gt;

&lt;ul&gt;
&lt;li&gt;&lt;a class=&quot;localLink&quot; href=&quot;http://schema.org/SearchAction&quot;&gt;SearchAction&lt;/a&gt;: FindAction is generally lead by a SearchAction, but not necessarily.&lt;/li&gt;
&lt;/ul&gt;

   */
  @NotNull public static FindAction.Builder findAction() { return new FindAction.Builder(new HashMap<String,Object>()); }
  /**
   * Beauty salon.
   */
  @NotNull public static BeautySalon.Builder beautySalon() { return new BeautySalon.Builder(new HashMap<String,Object>()); }
  /**
   * Bed and breakfast.
&lt;br /&gt;&lt;br /&gt;
See also the &lt;a href=&quot;/docs/hotels.html&quot;&gt;dedicated document on the use of schema.org for marking up hotels and other forms of accommodations&lt;/a&gt;.
   */
  @NotNull public static BedAndBreakfast.Builder bedAndBreakfast() { return new BedAndBreakfast.Builder(new HashMap<String,Object>()); }
  /**
   * Web page type: About page.
   */
  @NotNull public static AboutPage.Builder aboutPage() { return new AboutPage.Builder(new HashMap<String,Object>()); }
  /**
   * An online or virtual location for attending events. For example, one may attend an online seminar or educational event. While a virtual location may be used as the location of an event, virtual locations should not be confused with physical locations in the real world.
   */
  @NotNull public static VirtualLocation.Builder virtualLocation() { return new VirtualLocation.Builder(new HashMap<String,Object>()); }
  /**
   * A middle school (typically for children aged around 11-14, although this varies somewhat).
   */
  @NotNull public static MiddleSchool.Builder middleSchool() { return new MiddleSchool.Builder(new HashMap<String,Object>()); }
  /**
   * An organization such as a school, NGO, corporation, club, etc.
   */
  @NotNull public static Organization.Builder organization() { return new Organization.Builder(new HashMap<String,Object>()); }
  /**
   * A synagogue.
   */
  @NotNull public static Synagogue.Builder synagogue() { return new Synagogue.Builder(new HashMap<String,Object>()); }
  /**
   * ATM/cash machine.
   */
  @NotNull public static AutomatedTeller.Builder automatedTeller() { return new AutomatedTeller.Builder(new HashMap<String,Object>()); }
  /**
   * A single item within a larger data feed.
   */
  @NotNull public static DataFeedItem.Builder dataFeedItem() { return new DataFeedItem.Builder(new HashMap<String,Object>()); }
  /**
   * A predefined value for a product characteristic, e.g. the power cord plug type 'US' or the garment sizes 'S', 'M', 'L', and 'XL'.
   */
  @NotNull public static QualitativeValue.Builder qualitativeValue() { return new QualitativeValue.Builder(new HashMap<String,Object>()); }
  /**
   * A specific branch of medical science that is concerned with the ear, nose and throat and their respective disease states.
   */
  @NotNull public static Otolaryngologic.Builder otolaryngologic() { return new Otolaryngologic.Builder(new HashMap<String,Object>()); }
  /**
   * The average rating based on multiple ratings or reviews.
   */
  @NotNull public static AggregateRating.Builder aggregateRating() { return new AggregateRating.Builder(new HashMap<String,Object>()); }
  /**
   * WebContent is a type representing all &lt;a class=&quot;localLink&quot; href=&quot;http://schema.org/WebPage&quot;&gt;WebPage&lt;/a&gt;, &lt;a class=&quot;localLink&quot; href=&quot;http://schema.org/WebSite&quot;&gt;WebSite&lt;/a&gt; and &lt;a class=&quot;localLink&quot; href=&quot;http://schema.org/WebPageElement&quot;&gt;WebPageElement&lt;/a&gt; content. It is sometimes the case that detailed distinctions between Web pages, sites and their parts is not always important or obvious. The  &lt;a class=&quot;localLink&quot; href=&quot;http://schema.org/WebContent&quot;&gt;WebContent&lt;/a&gt; type makes it easier to describe Web-addressable content without requiring such distinctions to always be stated. (The intent is that the existing types &lt;a class=&quot;localLink&quot; href=&quot;http://schema.org/WebPage&quot;&gt;WebPage&lt;/a&gt;, &lt;a class=&quot;localLink&quot; href=&quot;http://schema.org/WebSite&quot;&gt;WebSite&lt;/a&gt; and &lt;a class=&quot;localLink&quot; href=&quot;http://schema.org/WebPageElement&quot;&gt;WebPageElement&lt;/a&gt; will eventually be declared as subtypes of &lt;a class=&quot;localLink&quot; href=&quot;http://schema.org/WebContent&quot;&gt;WebContent&lt;/a&gt;.)
   */
  @NotNull public static WebContent.Builder webContent() { return new WebContent.Builder(new HashMap<String,Object>()); }
  /**
   * An intangible item that describes an alignment between a learning resource and a node in an educational framework.
   */
  @NotNull public static AlignmentObject.Builder alignmentObject() { return new AlignmentObject.Builder(new HashMap<String,Object>()); }
  /**
   * A theater or other performing art center.
   */
  @NotNull public static PerformingArtsTheater.Builder performingArtsTheater() { return new PerformingArtsTheater.Builder(new HashMap<String,Object>()); }
  /**
   * A reservation for a rental car.&lt;br/&gt;&lt;br/&gt;

Note: This type is for information about actual reservations, e.g. in confirmation emails or HTML pages with individual confirmations of reservations.
   */
  @NotNull public static RentalCarReservation.Builder rentalCarReservation() { return new RentalCarReservation.Builder(new HashMap<String,Object>()); }
  /**
   * A motorcycle repair shop.
   */
  @NotNull public static MotorcycleRepair.Builder motorcycleRepair() { return new MotorcycleRepair.Builder(new HashMap<String,Object>()); }
  /**
   * An elementary school.
   */
  @NotNull public static ElementarySchool.Builder elementarySchool() { return new ElementarySchool.Builder(new HashMap<String,Object>()); }
  /**
   * Web page type: Search results page.
   */
  @NotNull public static SearchResultsPage.Builder searchResultsPage() { return new SearchResultsPage.Builder(new HashMap<String,Object>()); }
  /**
   * A winery.
   */
  @NotNull public static Winery.Builder winery() { return new Winery.Builder(new HashMap<String,Object>()); }
  /**
   * When a single product is associated with multiple offers (for example, the same pair of shoes is offered by different merchants), then AggregateOffer can be used.&lt;br/&gt;&lt;br/&gt;

Note: AggregateOffers are normally expected to associate multiple offers that all share the same defined &lt;a class=&quot;localLink&quot; href=&quot;http://schema.org/businessFunction&quot;&gt;businessFunction&lt;/a&gt; value, or default to http://purl.org/goodrelations/v1#Sell if businessFunction is not explicitly defined.
   */
  @NotNull public static AggregateOffer.Builder aggregateOffer() { return new AggregateOffer.Builder(new HashMap<String,Object>()); }
  /**
   * An organization with archival holdings. An organization which keeps and preserves archival material and typically makes it accessible to the public.
   */
  @NotNull public static ArchiveOrganization.Builder archiveOrganization() { return new ArchiveOrganization.Builder(new HashMap<String,Object>()); }
  /**
   * An action performed by a direct agent and indirect participants upon a direct object. Optionally happens at a location with the help of an inanimate instrument. The execution of the action may produce a result. Specific action sub-type documentation specifies the exact expectation of each argument/role.&lt;br/&gt;&lt;br/&gt;

See also &lt;a href=&quot;http://blog.schema.org/2014/04/announcing-schemaorg-actions.html&quot;&gt;blog post&lt;/a&gt; and &lt;a href=&quot;http://schema.org/docs/actions.html&quot;&gt;Actions overview document&lt;/a&gt;.
   */
  @NotNull public static Action.Builder action() { return new Action.Builder(new HashMap<String,Object>()); }
  /**
   * The act of producing a visual/graphical representation of an object, typically with a pen/pencil and paper as instruments.
   */
  @NotNull public static DrawAction.Builder drawAction() { return new DrawAction.Builder(new HashMap<String,Object>()); }
  /**
   * The act of expressing a negative sentiment about the object. An agent dislikes an object (a proposition, topic or theme) with participants.
   */
  @NotNull public static DislikeAction.Builder dislikeAction() { return new DislikeAction.Builder(new HashMap<String,Object>()); }
  /**
   * A component of the human body circulatory system comprised of an intricate network of hollow tubes that transport blood throughout the entire body.
   */
  @NotNull public static Vessel.Builder vessel() { return new Vessel.Builder(new HashMap<String,Object>()); }
  /**
   * A bridge.
   */
  @NotNull public static Bridge.Builder bridge() { return new Bridge.Builder(new HashMap<String,Object>()); }
  /**
   * Any medical imaging modality typically used for diagnostic purposes.
   */
  @NotNull public static ImagingTest.Builder imagingTest() { return new ImagingTest.Builder(new HashMap<String,Object>()); }
  /**
   * Properties that take Mass as values are of the form '&amp;lt;Number&amp;gt; &amp;lt;Mass unit of measure&amp;gt;'. E.g., '7 kg'.
   */
  @NotNull public static Mass.Builder mass() { return new Mass.Builder(new HashMap<String,Object>()); }
  /**
   * A LegalService is a business that provides legally-oriented services, advice and representation, e.g. law firms.&lt;br/&gt;&lt;br/&gt;

As a &lt;a class=&quot;localLink&quot; href=&quot;http://schema.org/LocalBusiness&quot;&gt;LocalBusiness&lt;/a&gt; it can be described as a &lt;a class=&quot;localLink&quot; href=&quot;http://schema.org/provider&quot;&gt;provider&lt;/a&gt; of one or more &lt;a class=&quot;localLink&quot; href=&quot;http://schema.org/Service&quot;&gt;Service&lt;/a&gt;(s).
   */
  @NotNull public static LegalService.Builder legalService() { return new LegalService.Builder(new HashMap<String,Object>()); }
  /**
   * A musical group, such as a band, an orchestra, or a choir. Can also be a solo musician.
   */
  @NotNull public static MusicGroup.Builder musicGroup() { return new MusicGroup.Builder(new HashMap<String,Object>()); }
  /**
   * An educational or occupational credential. A diploma, academic degree, certification, qualification, badge, etc., that may be awarded to a person or other entity that meets the requirements defined by the credentialer.
   */
  @NotNull public static EducationalOccupationalCredential.Builder educationalOccupationalCredential() { return new EducationalOccupationalCredential.Builder(new HashMap<String,Object>()); }
  /**
   * A meeting room, conference room, or conference hall is a room provided for singular events such as business conferences and meetings (Source: Wikipedia, the free encyclopedia, see &lt;a href=&quot;http://en.wikipedia.org/wiki/Conference_hall&quot;&gt;http://en.wikipedia.org/wiki/Conference_hall&lt;/a&gt;).
&lt;br /&gt;&lt;br /&gt;
See also the &lt;a href=&quot;/docs/hotels.html&quot;&gt;dedicated document on the use of schema.org for marking up hotels and other forms of accommodations&lt;/a&gt;.
   */
  @NotNull public static MeetingRoom.Builder meetingRoom() { return new MeetingRoom.Builder(new HashMap<String,Object>()); }
  /**
   * A jewelry store.
   */
  @NotNull public static JewelryStore.Builder jewelryStore() { return new JewelryStore.Builder(new HashMap<String,Object>()); }
  /**
   * Nutritional information about the recipe.
   */
  @NotNull public static NutritionInformation.Builder nutritionInformation() { return new NutritionInformation.Builder(new HashMap<String,Object>()); }
  /**
   * A self-storage facility.
   */
  @NotNull public static SelfStorage.Builder selfStorage() { return new SelfStorage.Builder(new HashMap<String,Object>()); }
  /**
   * A service for a vehicle for hire with a driver for local travel. Fares are usually calculated based on distance traveled.
   */
  @NotNull public static TaxiService.Builder taxiService() { return new TaxiService.Builder(new HashMap<String,Object>()); }
  /**
   * A StatisticalPopulation is a set of instances of a certain given type that satisfy some set of constraints. The property &lt;a class=&quot;localLink&quot; href=&quot;http://schema.org/populationType&quot;&gt;populationType&lt;/a&gt; is used to specify the type. Any property that can be used on instances of that type can appear on the statistical population. For example, a &lt;a class=&quot;localLink&quot; href=&quot;http://schema.org/StatisticalPopulation&quot;&gt;StatisticalPopulation&lt;/a&gt; representing all &lt;a class=&quot;localLink&quot; href=&quot;http://schema.org/Person&quot;&gt;Person&lt;/a&gt;s with a &lt;a class=&quot;localLink&quot; href=&quot;http://schema.org/homeLocation&quot;&gt;homeLocation&lt;/a&gt; of East Podunk California, would be described by applying the appropriate &lt;a class=&quot;localLink&quot; href=&quot;http://schema.org/homeLocation&quot;&gt;homeLocation&lt;/a&gt; and &lt;a class=&quot;localLink&quot; href=&quot;http://schema.org/populationType&quot;&gt;populationType&lt;/a&gt; properties to a &lt;a class=&quot;localLink&quot; href=&quot;http://schema.org/StatisticalPopulation&quot;&gt;StatisticalPopulation&lt;/a&gt; item that stands for that set of people.
The properties &lt;a class=&quot;localLink&quot; href=&quot;http://schema.org/numConstraints&quot;&gt;numConstraints&lt;/a&gt; and &lt;a class=&quot;localLink&quot; href=&quot;http://schema.org/constrainingProperties&quot;&gt;constrainingProperties&lt;/a&gt; are used to specify which of the populations properties are used to specify the population. Note that the sense of &quot;population&quot; used here is the general sense of a statistical
population, and does not imply that the population consists of people. For example, a &lt;a class=&quot;localLink&quot; href=&quot;http://schema.org/populationType&quot;&gt;populationType&lt;/a&gt; of &lt;a class=&quot;localLink&quot; href=&quot;http://schema.org/Event&quot;&gt;Event&lt;/a&gt; or &lt;a class=&quot;localLink&quot; href=&quot;http://schema.org/NewsArticle&quot;&gt;NewsArticle&lt;/a&gt; could be used. See also &lt;a class=&quot;localLink&quot; href=&quot;http://schema.org/Observation&quot;&gt;Observation&lt;/a&gt;, and the &lt;a href=&quot;/docs/data-and-datasets.html&quot;&gt;data and datasets&lt;/a&gt; overview for more details.
   */
  @NotNull public static StatisticalPopulation.Builder statisticalPopulation() { return new StatisticalPopulation.Builder(new HashMap<String,Object>()); }
  /**
   * A service provided by an organization, e.g. delivery service, print services, etc.
   */
  @NotNull public static Service.Builder service() { return new Service.Builder(new HashMap<String,Object>()); }
  /**
   * A PerformanceRole is a Role that some entity places with regard to a theatrical performance, e.g. in a Movie, TVSeries etc.
   */
  @NotNull public static PerformanceRole.Builder performanceRole() { return new PerformanceRole.Builder(new HashMap<String,Object>()); }
  /**
   * A courthouse.
   */
  @NotNull public static Courthouse.Builder courthouse() { return new Courthouse.Builder(new HashMap<String,Object>()); }
  /**
   * A service which provides access to media programming like TV or radio. Access may be via cable or satellite.
   */
  @NotNull public static CableOrSatelliteService.Builder cableOrSatelliteService() { return new CableOrSatelliteService.Builder(new HashMap<String,Object>()); }
  /**
   * A brand is a name used by an organization or business person for labeling a product, product group, or similar.
   */
  @NotNull public static Brand.Builder brand() { return new Brand.Builder(new HashMap<String,Object>()); }
  /**
   * An agent quotes/estimates/appraises an object/product/service with a price at a location/store.
   */
  @NotNull public static QuoteAction.Builder quoteAction() { return new QuoteAction.Builder(new HashMap<String,Object>()); }
  /**
   * A MusicRelease is a specific release of a music album.
   */
  @NotNull public static MusicRelease.Builder musicRelease() { return new MusicRelease.Builder(new HashMap<String,Object>()); }
  /**
   * A guideline recommendation that is regarded as efficacious and where quality of the data supporting the recommendation is sound.
   */
  @NotNull public static MedicalGuidelineRecommendation.Builder medicalGuidelineRecommendation() { return new MedicalGuidelineRecommendation.Builder(new HashMap<String,Object>()); }
  /**
   * A tennis complex.
   */
  @NotNull public static TennisComplex.Builder tennisComplex() { return new TennisComplex.Builder(new HashMap<String,Object>()); }
  /**
   * An &lt;a class=&quot;localLink&quot; href=&quot;http://schema.org/Article&quot;&gt;Article&lt;/a&gt; that an external entity has paid to place or to produce to its specifications. Includes &lt;a href=&quot;https://en.wikipedia.org/wiki/Advertorial&quot;&gt;advertorials&lt;/a&gt;, sponsored content, native advertising and other paid content.
   */
  @NotNull public static AdvertiserContentArticle.Builder advertiserContentArticle() { return new AdvertiserContentArticle.Builder(new HashMap<String,Object>()); }
  /**
   * &lt;a class=&quot;localLink&quot; href=&quot;http://schema.org/HealthTopicContent&quot;&gt;HealthTopicContent&lt;/a&gt; is &lt;a class=&quot;localLink&quot; href=&quot;http://schema.org/WebContent&quot;&gt;WebContent&lt;/a&gt; that is about some aspect of a health topic, e.g. a condition, its symptoms or treatments. Such content may be comprised of several parts or sections and use different types of media. Multiple instances of &lt;a class=&quot;localLink&quot; href=&quot;http://schema.org/WebContent&quot;&gt;WebContent&lt;/a&gt; (and hence &lt;a class=&quot;localLink&quot; href=&quot;http://schema.org/HealthTopicContent&quot;&gt;HealthTopicContent&lt;/a&gt;) can be related using &lt;a class=&quot;localLink&quot; href=&quot;http://schema.org/hasPart&quot;&gt;hasPart&lt;/a&gt; / &lt;a class=&quot;localLink&quot; href=&quot;http://schema.org/isPartOf&quot;&gt;isPartOf&lt;/a&gt; where there is some kind of content hierarchy, and their content described with &lt;a class=&quot;localLink&quot; href=&quot;http://schema.org/about&quot;&gt;about&lt;/a&gt; and &lt;a class=&quot;localLink&quot; href=&quot;http://schema.org/mentions&quot;&gt;mentions&lt;/a&gt; e.g. building upon the existing &lt;a class=&quot;localLink&quot; href=&quot;http://schema.org/MedicalCondition&quot;&gt;MedicalCondition&lt;/a&gt; vocabulary.
   */
  @NotNull public static HealthTopicContent.Builder healthTopicContent() { return new HealthTopicContent.Builder(new HashMap<String,Object>()); }
  /**
   * The act of generating a comment about a subject.
   */
  @NotNull public static CommentAction.Builder commentAction() { return new CommentAction.Builder(new HashMap<String,Object>()); }
  /**
   * A sidebar section of the page.
   */
  @NotNull public static WPSideBar.Builder wPSideBar() { return new WPSideBar.Builder(new HashMap<String,Object>()); }
  /**
   * A patient-reported or observed dosing schedule for a drug or supplement.
   */
  @NotNull public static ReportedDoseSchedule.Builder reportedDoseSchedule() { return new ReportedDoseSchedule.Builder(new HashMap<String,Object>()); }
  /**
   * A particular physical or virtual business of an organization for medical purposes. Examples of MedicalBusiness include differents business run by health professionals.
   */
  @NotNull public static MedicalBusiness.Builder medicalBusiness() { return new MedicalBusiness.Builder(new HashMap<String,Object>()); }
  /**
   * A florist.
   */
  @NotNull public static Florist.Builder florist() { return new Florist.Builder(new HashMap<String,Object>()); }
  /**
   * The act of installing an application.
   */
  @NotNull public static InstallAction.Builder installAction() { return new InstallAction.Builder(new HashMap<String,Object>()); }
  /**
   * A structured representation of food or drink items available from a FoodEstablishment.
   */
  @NotNull public static Menu.Builder menu() { return new Menu.Builder(new HashMap<String,Object>()); }
  /**
   * A car wash business.
   */
  @NotNull public static AutoWash.Builder autoWash() { return new AutoWash.Builder(new HashMap<String,Object>()); }
  /**
   * The act of capturing still images of objects using a camera.
   */
  @NotNull public static PhotographAction.Builder photographAction() { return new PhotographAction.Builder(new HashMap<String,Object>()); }
  /**
   * A BreadcrumbList is an ItemList consisting of a chain of linked Web pages, typically described using at least their URL and their name, and typically ending with the current page.&lt;br/&gt;&lt;br/&gt;

The &lt;a class=&quot;localLink&quot; href=&quot;http://schema.org/position&quot;&gt;position&lt;/a&gt; property is used to reconstruct the order of the items in a BreadcrumbList The convention is that a breadcrumb list has an &lt;a class=&quot;localLink&quot; href=&quot;http://schema.org/itemListOrder&quot;&gt;itemListOrder&lt;/a&gt; of &lt;a class=&quot;localLink&quot; href=&quot;http://schema.org/ItemListOrderAscending&quot;&gt;ItemListOrderAscending&lt;/a&gt; (lower values listed first), and that the first items in this list correspond to the &quot;top&quot; or beginning of the breadcrumb trail, e.g. with a site or section homepage. The specific values of 'position' are not assigned meaning for a BreadcrumbList, but they should be integers, e.g. beginning with '1' for the first item in the list.
   */
  @NotNull public static BreadcrumbList.Builder breadcrumbList() { return new BreadcrumbList.Builder(new HashMap<String,Object>()); }
  /**
   * A playground.
   */
  @NotNull public static Playground.Builder playground() { return new Playground.Builder(new HashMap<String,Object>()); }
  /**
   * A public structure, such as a town hall or concert hall.
   */
  @NotNull public static CivicStructure.Builder civicStructure() { return new CivicStructure.Builder(new HashMap<String,Object>()); }
  /**
   * The act of reaching a draw in a competitive activity.
   */
  @NotNull public static TieAction.Builder tieAction() { return new TieAction.Builder(new HashMap<String,Object>()); }
  /**
   * A process of care involving exercise, changes to diet, fitness routines, and other lifestyle changes aimed at improving a health condition.
   */
  @NotNull public static LifestyleModification.Builder lifestyleModification() { return new LifestyleModification.Builder(new HashMap<String,Object>()); }
  /**
   * A tool used (but not consumed) when performing instructions for how to achieve a result.
   */
  @NotNull public static HowToTool.Builder howToTool() { return new HowToTool.Builder(new HashMap<String,Object>()); }
  /**
   * Server that provides game interaction in a multiplayer game.
   */
  @NotNull public static GameServer.Builder gameServer() { return new GameServer.Builder(new HashMap<String,Object>()); }
  /**
   * A tourist destination. In principle any &lt;a class=&quot;localLink&quot; href=&quot;http://schema.org/Place&quot;&gt;Place&lt;/a&gt; can be a &lt;a class=&quot;localLink&quot; href=&quot;http://schema.org/TouristDestination&quot;&gt;TouristDestination&lt;/a&gt; from a &lt;a class=&quot;localLink&quot; href=&quot;http://schema.org/City&quot;&gt;City&lt;/a&gt;, &lt;a class=&quot;localLink&quot; href=&quot;http://schema.org/Region&quot;&gt;Region&lt;/a&gt; or &lt;a class=&quot;localLink&quot; href=&quot;http://schema.org/Country&quot;&gt;Country&lt;/a&gt; to an &lt;a class=&quot;localLink&quot; href=&quot;http://schema.org/AmusementPark&quot;&gt;AmusementPark&lt;/a&gt; or &lt;a class=&quot;localLink&quot; href=&quot;http://schema.org/Hotel&quot;&gt;Hotel&lt;/a&gt;. This Type can be used on its own to describe a general &lt;a class=&quot;localLink&quot; href=&quot;http://schema.org/TouristDestination&quot;&gt;TouristDestination&lt;/a&gt;, or be used as an &lt;a class=&quot;localLink&quot; href=&quot;http://schema.org/additionalType&quot;&gt;additionalType&lt;/a&gt; to add tourist relevant properties to any other &lt;a class=&quot;localLink&quot; href=&quot;http://schema.org/Place&quot;&gt;Place&lt;/a&gt;.  A &lt;a class=&quot;localLink&quot; href=&quot;http://schema.org/TouristDestination&quot;&gt;TouristDestination&lt;/a&gt; is defined as a &lt;a class=&quot;localLink&quot; href=&quot;http://schema.org/Place&quot;&gt;Place&lt;/a&gt; that contains, or is colocated with, one or more &lt;a class=&quot;localLink&quot; href=&quot;http://schema.org/TouristAttraction&quot;&gt;TouristAttraction&lt;/a&gt;s, often linked by a similar theme or interest to a particular &lt;a class=&quot;localLink&quot; href=&quot;http://schema.org/touristType&quot;&gt;touristType&lt;/a&gt;. The &lt;a href=&quot;http://www2.unwto.org/&quot;&gt;UNWTO&lt;/a&gt; defines Destination (main destination of a tourism trip) as the place visited that is central to the decision to take the trip.
  (See examples below).
   */
  @NotNull public static TouristDestination.Builder touristDestination() { return new TouristDestination.Builder(new HashMap<String,Object>()); }
  /**
   * The act of asking someone to attend an event. Reciprocal of RsvpAction.
   */
  @NotNull public static InviteAction.Builder inviteAction() { return new InviteAction.Builder(new HashMap<String,Object>()); }
  /**
   * A particular physical business or branch of an organization. Examples of LocalBusiness include a restaurant, a particular branch of a restaurant chain, a branch of a bank, a medical practice, a club, a bowling alley, etc.
   */
  @NotNull public static LocalBusiness.Builder localBusiness() { return new LocalBusiness.Builder(new HashMap<String,Object>()); }
  /**
   * A group of multiple reservations with common values for all sub-reservations.
   */
  @NotNull public static ReservationPackage.Builder reservationPackage() { return new ReservationPackage.Builder(new HashMap<String,Object>()); }
  /**
   * A taxi.
   */
  @NotNull public static Taxi.Builder taxi() { return new Taxi.Builder(new HashMap<String,Object>()); }
  /**
   * A tattoo parlor.
   */
  @NotNull public static TattooParlor.Builder tattooParlor() { return new TattooParlor.Builder(new HashMap<String,Object>()); }
  /**
   * A casino.
   */
  @NotNull public static Casino.Builder casino() { return new Casino.Builder(new HashMap<String,Object>()); }
  /**
   * A person (alive, dead, undead, or fictional).
   */
  @NotNull public static Person.Builder person() { return new Person.Builder(new HashMap<String,Object>()); }
  /**
   * A motorcycle dealer.
   */
  @NotNull public static MotorcycleDealer.Builder motorcycleDealer() { return new MotorcycleDealer.Builder(new HashMap<String,Object>()); }
  /**
   * An &lt;a class=&quot;localLink&quot; href=&quot;http://schema.org/OpinionNewsArticle&quot;&gt;OpinionNewsArticle&lt;/a&gt; is a &lt;a class=&quot;localLink&quot; href=&quot;http://schema.org/NewsArticle&quot;&gt;NewsArticle&lt;/a&gt; that primarily expresses opinions rather than journalistic reporting of news and events. For example, a &lt;a class=&quot;localLink&quot; href=&quot;http://schema.org/NewsArticle&quot;&gt;NewsArticle&lt;/a&gt; consisting of a column or &lt;a class=&quot;localLink&quot; href=&quot;http://schema.org/Blog&quot;&gt;Blog&lt;/a&gt;/&lt;a class=&quot;localLink&quot; href=&quot;http://schema.org/BlogPosting&quot;&gt;BlogPosting&lt;/a&gt; entry in the Opinions section of a news publication.
   */
  @NotNull public static OpinionNewsArticle.Builder opinionNewsArticle() { return new OpinionNewsArticle.Builder(new HashMap<String,Object>()); }
  /**
   * Short story or tale. A brief work of literature, usually written in narrative prose.
   */
  @NotNull public static ShortStory.Builder shortStory() { return new ShortStory.Builder(new HashMap<String,Object>()); }
  /**
   * Residence type: Single-family home.
   */
  @NotNull public static SingleFamilyResidence.Builder singleFamilyResidence() { return new SingleFamilyResidence.Builder(new HashMap<String,Object>()); }
  /**
   * A trip on a commercial train line.
   */
  @NotNull public static TrainTrip.Builder trainTrip() { return new TrainTrip.Builder(new HashMap<String,Object>()); }
  /**
   * A tourist attraction.  In principle any Thing can be a &lt;a class=&quot;localLink&quot; href=&quot;http://schema.org/TouristAttraction&quot;&gt;TouristAttraction&lt;/a&gt;, from a &lt;a class=&quot;localLink&quot; href=&quot;http://schema.org/Mountain&quot;&gt;Mountain&lt;/a&gt; and &lt;a class=&quot;localLink&quot; href=&quot;http://schema.org/LandmarksOrHistoricalBuildings&quot;&gt;LandmarksOrHistoricalBuildings&lt;/a&gt; to a &lt;a class=&quot;localLink&quot; href=&quot;http://schema.org/LocalBusiness&quot;&gt;LocalBusiness&lt;/a&gt;.  This Type can be used on its own to describe a general &lt;a class=&quot;localLink&quot; href=&quot;http://schema.org/TouristAttraction&quot;&gt;TouristAttraction&lt;/a&gt;, or be used as an &lt;a class=&quot;localLink&quot; href=&quot;http://schema.org/additionalType&quot;&gt;additionalType&lt;/a&gt; to add tourist attraction properties to any other type.  (See examples below)
   */
  @NotNull public static TouristAttraction.Builder touristAttraction() { return new TouristAttraction.Builder(new HashMap<String,Object>()); }
  /**
   * Intended audience for an item, i.e. the group for whom the item was created.
   */
  @NotNull public static Audience.Builder audience() { return new Audience.Builder(new HashMap<String,Object>()); }
  /**
   * A single season of a podcast. Many podcasts do not break down into separate seasons. In that case, PodcastSeries should be used.
   */
  @NotNull public static PodcastSeason.Builder podcastSeason() { return new PodcastSeason.Builder(new HashMap<String,Object>()); }
  /**
   * The costs of settling the payment using a particular payment method.
   */
  @NotNull public static PaymentChargeSpecification.Builder paymentChargeSpecification() { return new PaymentChargeSpecification.Builder(new HashMap<String,Object>()); }
  /**
   * A moving company.
   */
  @NotNull public static MovingCompany.Builder movingCompany() { return new MovingCompany.Builder(new HashMap<String,Object>()); }
  /**
   * A bus station.
   */
  @NotNull public static BusStation.Builder busStation() { return new BusStation.Builder(new HashMap<String,Object>()); }
  /**
   * A bakery.
   */
  @NotNull public static Bakery.Builder bakery() { return new Bakery.Builder(new HashMap<String,Object>()); }
  /**
   * A blog post intended to provide a rolling textual coverage of an ongoing event through continuous updates.
   */
  @NotNull public static LiveBlogPosting.Builder liveBlogPosting() { return new LiveBlogPosting.Builder(new HashMap<String,Object>()); }
  /**
   * A list of items of any sort&amp;#x2014;for example, Top 10 Movies About Weathermen, or Top 100 Party Songs. Not to be confused with HTML lists, which are often used only for formatting.
   */
  @NotNull public static ItemList.Builder itemList() { return new ItemList.Builder(new HashMap<String,Object>()); }
  /**
   * The act of notifying someone that a future event/action is going to happen as expected.&lt;br/&gt;&lt;br/&gt;

Related actions:&lt;br/&gt;&lt;br/&gt;

&lt;ul&gt;
&lt;li&gt;&lt;a class=&quot;localLink&quot; href=&quot;http://schema.org/CancelAction&quot;&gt;CancelAction&lt;/a&gt;: The antonym of ConfirmAction.&lt;/li&gt;
&lt;/ul&gt;

   */
  @NotNull public static ConfirmAction.Builder confirmAction() { return new ConfirmAction.Builder(new HashMap<String,Object>()); }
  /**
   * An agent leaves an event / group with participants/friends at a location.&lt;br/&gt;&lt;br/&gt;

Related actions:&lt;br/&gt;&lt;br/&gt;

&lt;ul&gt;
&lt;li&gt;&lt;a class=&quot;localLink&quot; href=&quot;http://schema.org/JoinAction&quot;&gt;JoinAction&lt;/a&gt;: The antonym of LeaveAction.&lt;/li&gt;
&lt;li&gt;&lt;a class=&quot;localLink&quot; href=&quot;http://schema.org/UnRegisterAction&quot;&gt;UnRegisterAction&lt;/a&gt;: Unlike UnRegisterAction, LeaveAction implies leaving a group/team of people rather than a service.&lt;/li&gt;
&lt;/ul&gt;

   */
  @NotNull public static LeaveAction.Builder leaveAction() { return new LeaveAction.Builder(new HashMap<String,Object>()); }
  /**
   * UserInteraction and its subtypes is an old way of talking about users interacting with pages. It is generally better to use &lt;a class=&quot;localLink&quot; href=&quot;http://schema.org/Action&quot;&gt;Action&lt;/a&gt;-based vocabulary, alongside types such as &lt;a class=&quot;localLink&quot; href=&quot;http://schema.org/Comment&quot;&gt;Comment&lt;/a&gt;.
   */
  @NotNull public static UserComments.Builder userComments() { return new UserComments.Builder(new HashMap<String,Object>()); }
  /**
   * The &lt;a class=&quot;localLink&quot; href=&quot;http://schema.org/ReportageNewsArticle&quot;&gt;ReportageNewsArticle&lt;/a&gt; type is a subtype of &lt;a class=&quot;localLink&quot; href=&quot;http://schema.org/NewsArticle&quot;&gt;NewsArticle&lt;/a&gt; representing
 news articles which are the result of journalistic news reporting conventions.&lt;br/&gt;&lt;br/&gt;

In practice many news publishers produce a wide variety of article types, many of which might be considered a &lt;a class=&quot;localLink&quot; href=&quot;http://schema.org/NewsArticle&quot;&gt;NewsArticle&lt;/a&gt; but not a &lt;a class=&quot;localLink&quot; href=&quot;http://schema.org/ReportageNewsArticle&quot;&gt;ReportageNewsArticle&lt;/a&gt;. For example, opinion pieces, reviews, analysis, sponsored or satirical articles, or articles that combine several of these elements.&lt;br/&gt;&lt;br/&gt;

The &lt;a class=&quot;localLink&quot; href=&quot;http://schema.org/ReportageNewsArticle&quot;&gt;ReportageNewsArticle&lt;/a&gt; type is based on a stricter ideal for &quot;news&quot; as a work of journalism, with articles based on factual information either observed or verified by the author, or reported and verified from knowledgeable sources.  This often includes perspectives from multiple viewpoints on a particular issue (distinguishing news reports from public relations or propaganda).  News reports in the &lt;a class=&quot;localLink&quot; href=&quot;http://schema.org/ReportageNewsArticle&quot;&gt;ReportageNewsArticle&lt;/a&gt; sense de-emphasize the opinion of the author, with commentary and value judgements typically expressed elsewhere.&lt;br/&gt;&lt;br/&gt;

A &lt;a class=&quot;localLink&quot; href=&quot;http://schema.org/ReportageNewsArticle&quot;&gt;ReportageNewsArticle&lt;/a&gt; which goes deeper into analysis can also be marked with an additional type of &lt;a class=&quot;localLink&quot; href=&quot;http://schema.org/AnalysisNewsArticle&quot;&gt;AnalysisNewsArticle&lt;/a&gt;.
   */
  @NotNull public static ReportageNewsArticle.Builder reportageNewsArticle() { return new ReportageNewsArticle.Builder(new HashMap<String,Object>()); }
  /**
   * A SpecialAnnouncement combines a simple date-stamped textual information update
      with contextualized Web links and other structured data.  It represents an information update made by a
      locally-oriented organization, for example schools, pharmacies, healthcare providers,  community groups, police,
      local government.&lt;br/&gt;&lt;br/&gt;

For work in progress guidelines on Coronavirus-related markup see &lt;a href=&quot;https://docs.google.com/document/d/14ikaGCKxo50rRM7nvKSlbUpjyIk2WMQd3IkB1lItlrM/edit#&quot;&gt;this doc&lt;/a&gt;.&lt;br/&gt;&lt;br/&gt;

The motivating scenario for SpecialAnnouncement is the &lt;a href=&quot;https://en.wikipedia.org/wiki/2019%E2%80%9320_coronavirus_pandemic&quot;&gt;Coronavirus pandemic&lt;/a&gt;, and the initial vocabulary is oriented to this urgent situation. Schema.org
expect to improve the markup iteratively as it is deployed and as feedback emerges from use. In addition to our
usual &lt;a href=&quot;https://github.com/schemaorg/schemaorg/issues/2490&quot;&gt;Github entry&lt;/a&gt;, feedback comments can also be provided in &lt;a href=&quot;https://docs.google.com/document/d/1fpdFFxk8s87CWwACs53SGkYv3aafSxz_DTtOQxMrBJQ/edit#&quot;&gt;this document&lt;/a&gt;.&lt;br/&gt;&lt;br/&gt;

While this schema is designed to communicate urgent crisis-related information, it is not the same as an emergency warning technology like &lt;a href=&quot;https://en.wikipedia.org/wiki/Common_Alerting_Protocol&quot;&gt;CAP&lt;/a&gt;, although there may be overlaps. The intent is to cover
the kinds of everyday practical information being posted to existing websites during an emergency situation.&lt;br/&gt;&lt;br/&gt;

Several kinds of information can be provided:&lt;br/&gt;&lt;br/&gt;

We encourage the provision of &quot;name&quot;, &quot;text&quot;, &quot;datePosted&quot;, &quot;expires&quot; (if appropriate), &quot;category&quot; and
&quot;url&quot; as a simple baseline. It is important to provide a value for &quot;category&quot; where possible, most ideally as a well known
URL from Wikipedia or Wikidata. In the case of the 2019-2020 Coronavirus pandemic, this should be &quot;https://en.wikipedia.org/w/index.php?title=2019-20_coronavirus_pandemic&quot; or &quot;https://www.wikidata.org/wiki/Q81068910&quot;.&lt;br/&gt;&lt;br/&gt;

For many of the possible properties, values can either be simple links or an inline description, depending on whether a summary is available. For a link, provide just the URL of the appropriate page as the property's value. For an inline description, use a &lt;a class=&quot;localLink&quot; href=&quot;http://schema.org/WebContent&quot;&gt;WebContent&lt;/a&gt; type, and provide the url as a property of that, alongside at least a simple &quot;&lt;a class=&quot;localLink&quot; href=&quot;http://schema.org/text&quot;&gt;text&lt;/a&gt;&quot; summary of the page. It is
unlikely that a single SpecialAnnouncement will need all of the possible properties simultaneously.&lt;br/&gt;&lt;br/&gt;

We expect that in many cases the page referenced might contain more specialized structured data, e.g. contact info, &lt;a class=&quot;localLink&quot; href=&quot;http://schema.org/openingHours&quot;&gt;openingHours&lt;/a&gt;, &lt;a class=&quot;localLink&quot; href=&quot;http://schema.org/Event&quot;&gt;Event&lt;/a&gt;, &lt;a class=&quot;localLink&quot; href=&quot;http://schema.org/FAQPage&quot;&gt;FAQPage&lt;/a&gt; etc. By linking to those pages from a &lt;a class=&quot;localLink&quot; href=&quot;http://schema.org/SpecialAnnouncement&quot;&gt;SpecialAnnouncement&lt;/a&gt; you can help make it clearer that the events are related to the situation (e.g. Coronavirus) indicated by the &lt;a class=&quot;localLink&quot; href=&quot;http://schema.org/category&quot;&gt;category&lt;/a&gt; property of the &lt;a class=&quot;localLink&quot; href=&quot;http://schema.org/SpecialAnnouncement&quot;&gt;SpecialAnnouncement&lt;/a&gt;.&lt;br/&gt;&lt;br/&gt;

Many &lt;a class=&quot;localLink&quot; href=&quot;http://schema.org/SpecialAnnouncement&quot;&gt;SpecialAnnouncement&lt;/a&gt;s will relate to particular regions and to identifiable local organizations. Use &lt;a class=&quot;localLink&quot; href=&quot;http://schema.org/spatialCoverage&quot;&gt;spatialCoverage&lt;/a&gt; for the region, and &lt;a class=&quot;localLink&quot; href=&quot;http://schema.org/announcementLocation&quot;&gt;announcementLocation&lt;/a&gt; to indicate specific &lt;a class=&quot;localLink&quot; href=&quot;http://schema.org/LocalBusiness&quot;&gt;LocalBusiness&lt;/a&gt;es and &lt;a class=&quot;localLink&quot; href=&quot;http://schema.org/CivicStructures&quot;&gt;CivicStructures&lt;/a&gt;. If the announcement affects both a particular region and a specific location (for example, a library closure that serves an entire region), use both &lt;a class=&quot;localLink&quot; href=&quot;http://schema.org/spatialCoverage&quot;&gt;spatialCoverage&lt;/a&gt; and &lt;a class=&quot;localLink&quot; href=&quot;http://schema.org/announcementLocation&quot;&gt;announcementLocation&lt;/a&gt;.&lt;br/&gt;&lt;br/&gt;

The &lt;a class=&quot;localLink&quot; href=&quot;http://schema.org/about&quot;&gt;about&lt;/a&gt; property can be used to indicate entities that are the focus of the announcement. We now recommend using &lt;a class=&quot;localLink&quot; href=&quot;http://schema.org/about&quot;&gt;about&lt;/a&gt; only
for representing non-location entities (e.g. a &lt;a class=&quot;localLink&quot; href=&quot;http://schema.org/Course&quot;&gt;Course&lt;/a&gt; or a &lt;a class=&quot;localLink&quot; href=&quot;http://schema.org/RadioStation&quot;&gt;RadioStation&lt;/a&gt;). For places, use &lt;a class=&quot;localLink&quot; href=&quot;http://schema.org/announcementLocation&quot;&gt;announcementLocation&lt;/a&gt; and &lt;a class=&quot;localLink&quot; href=&quot;http://schema.org/spatialCoverage&quot;&gt;spatialCoverage&lt;/a&gt;. Consumers of this markup should be aware that the initial design encouraged the use of /about for locations too.&lt;br/&gt;&lt;br/&gt;

The basic content of &lt;a class=&quot;localLink&quot; href=&quot;http://schema.org/SpecialAnnouncement&quot;&gt;SpecialAnnouncement&lt;/a&gt; is similar to that of an &lt;a href=&quot;https://en.wikipedia.org/wiki/RSS&quot;&gt;RSS&lt;/a&gt; or &lt;a href=&quot;https://en.wikipedia.org/wiki/Atom_(Web_standard)&quot;&gt;Atom&lt;/a&gt; feed. For publishers without such feeds, basic feed-like information can be shared by posting
&lt;a class=&quot;localLink&quot; href=&quot;http://schema.org/SpecialAnnouncement&quot;&gt;SpecialAnnouncement&lt;/a&gt; updates in a page, e.g. using JSON-LD. For sites with Atom/RSS functionality, you can point to a feed
with the &lt;a class=&quot;localLink&quot; href=&quot;http://schema.org/webFeed&quot;&gt;webFeed&lt;/a&gt; property. This can be a simple URL, or an inline &lt;a class=&quot;localLink&quot; href=&quot;http://schema.org/DataFeed&quot;&gt;DataFeed&lt;/a&gt; object, with &lt;a class=&quot;localLink&quot; href=&quot;http://schema.org/encodingFormat&quot;&gt;encodingFormat&lt;/a&gt; providing
media type information e.g. &quot;application/rss+xml&quot; or &quot;application/atom+xml&quot;.
   */
  @NotNull public static SpecialAnnouncement.Builder specialAnnouncement() { return new SpecialAnnouncement.Builder(new HashMap<String,Object>()); }
  /**
   * Any part of the human body, typically a component of an anatomical system. Organs, tissues, and cells are all anatomical structures.
   */
  @NotNull public static AnatomicalStructure.Builder anatomicalStructure() { return new AnatomicalStructure.Builder(new HashMap<String,Object>()); }
  /**
   * An explanation in the instructions for how to achieve a result. It provides supplementary information about a technique, supply, author's preference, etc. It can explain what could be done, or what should not be done, but doesn't specify what should be done (see HowToDirection).
   */
  @NotNull public static HowToTip.Builder howToTip() { return new HowToTip.Builder(new HashMap<String,Object>()); }
  /**
   * The act of allocating an action/event/task to some destination (someone or something).
   */
  @NotNull public static AssignAction.Builder assignAction() { return new AssignAction.Builder(new HashMap<String,Object>()); }
  /**
   * The act of expressing a positive sentiment about the object. An agent likes an object (a proposition, topic or theme) with participants.
   */
  @NotNull public static LikeAction.Builder likeAction() { return new LikeAction.Builder(new HashMap<String,Object>()); }
  /**
   * A review of an item - for example, of a restaurant, movie, or store.
   */
  @NotNull public static Review.Builder review() { return new Review.Builder(new HashMap<String,Object>()); }
  /**
   * An ice cream shop.
   */
  @NotNull public static IceCreamShop.Builder iceCreamShop() { return new IceCreamShop.Builder(new HashMap<String,Object>()); }
  /**
   * A set of characteristics belonging to people, e.g. who compose an item's target audience.
   */
  @NotNull public static PeopleAudience.Builder peopleAudience() { return new PeopleAudience.Builder(new HashMap<String,Object>()); }
  /**
   * A recommended dosing schedule for a drug or supplement as prescribed or recommended by an authority or by the drug/supplement's manufacturer. Capture the recommending authority in the recognizingAuthority property of MedicalEntity.
   */
  @NotNull public static RecommendedDoseSchedule.Builder recommendedDoseSchedule() { return new RecommendedDoseSchedule.Builder(new HashMap<String,Object>()); }
  /**
   * An organization that provides flights for passengers.
   */
  @NotNull public static Airline.Builder airline() { return new Airline.Builder(new HashMap<String,Object>()); }
  /**
   * A single message from a sender to one or more organizations or people.
   */
  @NotNull public static Message.Builder message() { return new Message.Builder(new HashMap<String,Object>()); }
  /**
   * A table on a Web page.
   */
  @NotNull public static Table.Builder table() { return new Table.Builder(new HashMap<String,Object>()); }
  /**
   * An electrician.
   */
  @NotNull public static Electrician.Builder electrician() { return new Electrician.Builder(new HashMap<String,Object>()); }
  /**
   * A code for a medical entity.
   */
  @NotNull public static MedicalCode.Builder medicalCode() { return new MedicalCode.Builder(new HashMap<String,Object>()); }
  /**
   * UserInteraction and its subtypes is an old way of talking about users interacting with pages. It is generally better to use &lt;a class=&quot;localLink&quot; href=&quot;http://schema.org/Action&quot;&gt;Action&lt;/a&gt;-based vocabulary, alongside types such as &lt;a class=&quot;localLink&quot; href=&quot;http://schema.org/Comment&quot;&gt;Comment&lt;/a&gt;.
   */
  @NotNull public static UserPlusOnes.Builder userPlusOnes() { return new UserPlusOnes.Builder(new HashMap<String,Object>()); }
  /**
   * Event type: Comedy event.
   */
  @NotNull public static ComedyEvent.Builder comedyEvent() { return new ComedyEvent.Builder(new HashMap<String,Object>()); }
  /**
   * Lists or enumerations&mdash;for example, a list of cuisines or music genres, etc.
   */
  @NotNull public static Enumeration.Builder enumeration() { return new Enumeration.Builder(new HashMap<String,Object>()); }
  /**
   * A program offered by an institution which determines the learning progress to achieve an outcome, usually a credential like a degree or certificate. This would define a discrete set of opportunities (e.g., job, courses) that together constitute a program with a clear start, end, set of requirements, and transition to a new occupational opportunity (e.g., a job), or sometimes a higher educational opportunity (e.g., an advanced degree).
   */
  @NotNull public static EducationalOccupationalProgram.Builder educationalOccupationalProgram() { return new EducationalOccupationalProgram.Builder(new HashMap<String,Object>()); }
  /**
   * A place offering space for &quot;Recreational Vehicles&quot;, Caravans, mobile homes and the like.
   */
  @NotNull public static RVPark.Builder rVPark() { return new RVPark.Builder(new HashMap<String,Object>()); }
  /**
   * Any physical manifestation of a person's medical condition discoverable by objective diagnostic tests or physical examination.
   */
  @NotNull public static MedicalSign.Builder medicalSign() { return new MedicalSign.Builder(new HashMap<String,Object>()); }
  /**
   * A dry-cleaning business.
   */
  @NotNull public static DryCleaningOrLaundry.Builder dryCleaningOrLaundry() { return new DryCleaningOrLaundry.Builder(new HashMap<String,Object>()); }
  /**
   * A process of care relying upon counseling, dialogue and communication  aimed at improving a mental health condition without use of drugs.
   */
  @NotNull public static PsychologicalTreatment.Builder psychologicalTreatment() { return new PsychologicalTreatment.Builder(new HashMap<String,Object>()); }
  /**
   * A TV episode which can be part of a series or season.
   */
  @NotNull public static TVEpisode.Builder tVEpisode() { return new TVEpisode.Builder(new HashMap<String,Object>()); }
  /**
   * The medical care by a physician, or other health-care professional, who is the patient's first contact with the health-care system and who may recommend a specialist if necessary.
   */
  @NotNull public static PrimaryCare.Builder primaryCare() { return new PrimaryCare.Builder(new HashMap<String,Object>()); }
  /**
   * The act of inserting at the end if an ordered collection.
   */
  @NotNull public static AppendAction.Builder appendAction() { return new AppendAction.Builder(new HashMap<String,Object>()); }
  /**
   * A condition or factor that serves as a reason to withhold a certain medical therapy. Contraindications can be absolute (there are no reasonable circumstances for undertaking a course of action) or relative (the patient is at higher risk of complications, but that these risks may be outweighed by other considerations or mitigated by other measures).
   */
  @NotNull public static MedicalContraindication.Builder medicalContraindication() { return new MedicalContraindication.Builder(new HashMap<String,Object>()); }
  /**
   * A software application designed specifically to work well on a mobile device such as a telephone.
   */
  @NotNull public static MobileApplication.Builder mobileApplication() { return new MobileApplication.Builder(new HashMap<String,Object>()); }
  /**
   * A train station.
   */
  @NotNull public static TrainStation.Builder trainStation() { return new TrainStation.Builder(new HashMap<String,Object>()); }
  /**
   * A guideline contraindication that designates a process as harmful and where quality of the data supporting the contraindication is sound.
   */
  @NotNull public static MedicalGuidelineContraindication.Builder medicalGuidelineContraindication() { return new MedicalGuidelineContraindication.Builder(new HashMap<String,Object>()); }
  /**
   * One of the sections into which a book is divided. A chapter usually has a section number or a name.
   */
  @NotNull public static Chapter.Builder chapter() { return new Chapter.Builder(new HashMap<String,Object>()); }
  /**
   * A specific branch of medical science that pertains to the health care of women, particularly in the diagnosis and treatment of disorders affecting the female reproductive system.
   */
  @NotNull public static Gynecologic.Builder gynecologic() { return new Gynecologic.Builder(new HashMap<String,Object>()); }
  /**
   * Event type: Theater performance.
   */
  @NotNull public static TheaterEvent.Builder theaterEvent() { return new TheaterEvent.Builder(new HashMap<String,Object>()); }
  /**
   * A food or drink item listed in a menu or menu section.
   */
  @NotNull public static MenuItem.Builder menuItem() { return new MenuItem.Builder(new HashMap<String,Object>()); }
  /**
   * The act of physically/electronically taking delivery of an object thathas been transferred from an origin to a destination. Reciprocal of SendAction.&lt;br/&gt;&lt;br/&gt;

Related actions:&lt;br/&gt;&lt;br/&gt;

&lt;ul&gt;
&lt;li&gt;&lt;a class=&quot;localLink&quot; href=&quot;http://schema.org/SendAction&quot;&gt;SendAction&lt;/a&gt;: The reciprocal of ReceiveAction.&lt;/li&gt;
&lt;li&gt;&lt;a class=&quot;localLink&quot; href=&quot;http://schema.org/TakeAction&quot;&gt;TakeAction&lt;/a&gt;: Unlike TakeAction, ReceiveAction does not imply that the ownership has been transfered (e.g. I can receive a package, but it does not mean the package is now mine).&lt;/li&gt;
&lt;/ul&gt;

   */
  @NotNull public static ReceiveAction.Builder receiveAction() { return new ReceiveAction.Builder(new HashMap<String,Object>()); }
  /**
   * A tourist trip. A created itinerary of visits to one or more places of interest (&lt;a class=&quot;localLink&quot; href=&quot;http://schema.org/TouristAttraction&quot;&gt;TouristAttraction&lt;/a&gt;/&lt;a class=&quot;localLink&quot; href=&quot;http://schema.org/TouristDestination&quot;&gt;TouristDestination&lt;/a&gt;) often linked by a similar theme, geographic area, or interest to a particular &lt;a class=&quot;localLink&quot; href=&quot;http://schema.org/touristType&quot;&gt;touristType&lt;/a&gt;. The &lt;a href=&quot;http://www2.unwto.org/&quot;&gt;UNWTO&lt;/a&gt; defines tourism trip as the Trip taken by visitors.
  (See examples below).
   */
  @NotNull public static TouristTrip.Builder touristTrip() { return new TouristTrip.Builder(new HashMap<String,Object>()); }
  /**
   * A medical procedure involving an incision with instruments; performed for diagnose, or therapeutic purposes.
   */
  @NotNull public static SurgicalProcedure.Builder surgicalProcedure() { return new SurgicalProcedure.Builder(new HashMap<String,Object>()); }
  /**
   * A financial product for the loaning of an amount of money under agreed terms and charges.
   */
  @NotNull public static LoanOrCredit.Builder loanOrCredit() { return new LoanOrCredit.Builder(new HashMap<String,Object>()); }
  /**
   * Event type: A social dance.
   */
  @NotNull public static DanceEvent.Builder danceEvent() { return new DanceEvent.Builder(new HashMap<String,Object>()); }
  /**
   * A day spa.
   */
  @NotNull public static DaySpa.Builder daySpa() { return new DaySpa.Builder(new HashMap<String,Object>()); }
  /**
   * An &lt;a class=&quot;localLink&quot; href=&quot;http://schema.org/OfferForLease&quot;&gt;OfferForLease&lt;/a&gt; in Schema.org represents an &lt;a class=&quot;localLink&quot; href=&quot;http://schema.org/Offer&quot;&gt;Offer&lt;/a&gt; to lease out something, i.e. an &lt;a class=&quot;localLink&quot; href=&quot;http://schema.org/Offer&quot;&gt;Offer&lt;/a&gt; whose
  &lt;a class=&quot;localLink&quot; href=&quot;http://schema.org/businessFunction&quot;&gt;businessFunction&lt;/a&gt; is &lt;a href=&quot;http://purl.org/goodrelations/v1#LeaseOut.&quot;&gt;lease out&lt;/a&gt;. See &lt;a href=&quot;https://en.wikipedia.org/wiki/GoodRelations&quot;&gt;Good Relations&lt;/a&gt; for
  background on the underlying concepts.
   */
  @NotNull public static OfferForLease.Builder offerForLease() { return new OfferForLease.Builder(new HashMap<String,Object>()); }
  /**
   * An infectious disease is a clinically evident human disease resulting from the presence of pathogenic microbial agents, like pathogenic viruses, pathogenic bacteria, fungi, protozoa, multicellular parasites, and prions. To be considered an infectious disease, such pathogens are known to be able to cause this disease.
   */
  @NotNull public static InfectiousDisease.Builder infectiousDisease() { return new InfectiousDisease.Builder(new HashMap<String,Object>()); }
  /**
   * The act of gaining ownership of an object from an origin. Reciprocal of GiveAction.&lt;br/&gt;&lt;br/&gt;

Related actions:&lt;br/&gt;&lt;br/&gt;

&lt;ul&gt;
&lt;li&gt;&lt;a class=&quot;localLink&quot; href=&quot;http://schema.org/GiveAction&quot;&gt;GiveAction&lt;/a&gt;: The reciprocal of TakeAction.&lt;/li&gt;
&lt;li&gt;&lt;a class=&quot;localLink&quot; href=&quot;http://schema.org/ReceiveAction&quot;&gt;ReceiveAction&lt;/a&gt;: Unlike ReceiveAction, TakeAction implies that ownership has been transfered.&lt;/li&gt;
&lt;/ul&gt;

   */
  @NotNull public static TakeAction.Builder takeAction() { return new TakeAction.Builder(new HashMap<String,Object>()); }
  /**
   * The act of expressing a difference of opinion with the object. An agent disagrees to/about an object (a proposition, topic or theme) with participants.
   */
  @NotNull public static DisagreeAction.Builder disagreeAction() { return new DisagreeAction.Builder(new HashMap<String,Object>()); }
  /**
   * A body of structured information describing some topic(s) of interest.
   */
  @NotNull public static Dataset.Builder dataset() { return new Dataset.Builder(new HashMap<String,Object>()); }
  /**
   * A type of blood vessel that specifically carries blood away from the heart.
   */
  @NotNull public static Artery.Builder artery() { return new Artery.Builder(new HashMap<String,Object>()); }
  /**
   * A specific question - e.g. from a user seeking answers online, or collected in a Frequently Asked Questions (FAQ) document.
   */
  @NotNull public static Question.Builder question() { return new Question.Builder(new HashMap<String,Object>()); }
  /**
   * The act of playing/exercising/training/performing for enjoyment, leisure, recreation, Competition or exercise.&lt;br/&gt;&lt;br/&gt;

Related actions:&lt;br/&gt;&lt;br/&gt;

&lt;ul&gt;
&lt;li&gt;&lt;a class=&quot;localLink&quot; href=&quot;http://schema.org/ListenAction&quot;&gt;ListenAction&lt;/a&gt;: Unlike ListenAction (which is under ConsumeAction), PlayAction refers to performing for an audience or at an event, rather than consuming music.&lt;/li&gt;
&lt;li&gt;&lt;a class=&quot;localLink&quot; href=&quot;http://schema.org/WatchAction&quot;&gt;WatchAction&lt;/a&gt;: Unlike WatchAction (which is under ConsumeAction), PlayAction refers to showing/displaying for an audience or at an event, rather than consuming visual content.&lt;/li&gt;
&lt;/ul&gt;

   */
  @NotNull public static PlayAction.Builder playAction() { return new PlayAction.Builder(new HashMap<String,Object>()); }
  /**
   * A specific branch of medical science that is concerned with the diagnosis and treatment of diseases, debilities and provision of care to the aged.
   */
  @NotNull public static Geriatric.Builder geriatric() { return new Geriatric.Builder(new HashMap<String,Object>()); }
  /**
   * An offer to transfer some rights to an item or to provide a service &mdash; for example, an offer to sell tickets to an event, to rent the DVD of a movie, to stream a TV show over the internet, to repair a motorcycle, or to loan a book.&lt;br/&gt;&lt;br/&gt;

Note: As the &lt;a class=&quot;localLink&quot; href=&quot;http://schema.org/businessFunction&quot;&gt;businessFunction&lt;/a&gt; property, which identifies the form of offer (e.g. sell, lease, repair, dispose), defaults to http://purl.org/goodrelations/v1#Sell; an Offer without a defined businessFunction value can be assumed to be an offer to sell.&lt;br/&gt;&lt;br/&gt;

For &lt;a href=&quot;http://www.gs1.org/barcodes/technical/idkeys/gtin&quot;&gt;GTIN&lt;/a&gt;-related fields, see &lt;a href=&quot;http://www.gs1.org/barcodes/support/check_digit_calculator&quot;&gt;Check Digit calculator&lt;/a&gt; and &lt;a href=&quot;http://www.gs1us.org/resources/standards/gtin-validation-guide&quot;&gt;validation guide&lt;/a&gt; from &lt;a href=&quot;http://www.gs1.org/&quot;&gt;GS1&lt;/a&gt;.
   */
  @NotNull public static Offer.Builder offer() { return new Offer.Builder(new HashMap<String,Object>()); }
  /**
   * Quantities such as distance, time, mass, weight, etc. Particular instances of say Mass are entities like '3 Kg' or '4 milligrams'.
   */
  @NotNull public static Quantity.Builder quantity() { return new Quantity.Builder(new HashMap<String,Object>()); }
  /**
   * An answer offered to a question; perhaps correct, perhaps opinionated or wrong.
   */
  @NotNull public static Answer.Builder answer() { return new Answer.Builder(new HashMap<String,Object>()); }
  /**
   * A series of &lt;a class=&quot;localLink&quot; href=&quot;http://schema.org/Event&quot;&gt;Event&lt;/a&gt;s. Included events can relate with the series using the &lt;a class=&quot;localLink&quot; href=&quot;http://schema.org/superEvent&quot;&gt;superEvent&lt;/a&gt; property.&lt;br/&gt;&lt;br/&gt;

An EventSeries is a collection of events that share some unifying characteristic. For example, &quot;The Olympic Games&quot; is a series, which
is repeated regularly. The &quot;2012 London Olympics&quot; can be presented both as an &lt;a class=&quot;localLink&quot; href=&quot;http://schema.org/Event&quot;&gt;Event&lt;/a&gt; in the series &quot;Olympic Games&quot;, and as an
&lt;a class=&quot;localLink&quot; href=&quot;http://schema.org/EventSeries&quot;&gt;EventSeries&lt;/a&gt; that included a number of sporting competitions as Events.&lt;br/&gt;&lt;br/&gt;

The nature of the association between the events in an &lt;a class=&quot;localLink&quot; href=&quot;http://schema.org/EventSeries&quot;&gt;EventSeries&lt;/a&gt; can vary, but typical examples could
include a thematic event series (e.g. topical meetups or classes), or a series of regular events that share a location, attendee group and/or organizers.&lt;br/&gt;&lt;br/&gt;

EventSeries has been defined as a kind of Event to make it easy for publishers to use it in an Event context without
worrying about which kinds of series are really event-like enough to call an Event. In general an EventSeries
may seem more Event-like when the period of time is compact and when aspects such as location are fixed, but
it may also sometimes prove useful to describe a longer-term series as an Event.
   */
  @NotNull public static EventSeries.Builder eventSeries() { return new EventSeries.Builder(new HashMap<String,Object>()); }
  /**
   * A short TV or radio program or a segment/part of a program.
   */
  @NotNull public static Clip.Builder clip() { return new Clip.Builder(new HashMap<String,Object>()); }
  /**
   * A preschool.
   */
  @NotNull public static Preschool.Builder preschool() { return new Preschool.Builder(new HashMap<String,Object>()); }
  /**
   * The practice of treatment of disease, injury, or deformity by physical methods such as massage, heat treatment, and exercise rather than by drugs or surgery..
   */
  @NotNull public static Physiotherapy.Builder physiotherapy() { return new Physiotherapy.Builder(new HashMap<String,Object>()); }
  /**
   * An audio file.
   */
  @NotNull public static AudioObject.Builder audioObject() { return new AudioObject.Builder(new HashMap<String,Object>()); }
  /**
   * A subclass of OrganizationRole used to describe employee relationships.
   */
  @NotNull public static EmployeeRole.Builder employeeRole() { return new EmployeeRole.Builder(new HashMap<String,Object>()); }
  /**
   * A reservation to dine at a food-related business.&lt;br/&gt;&lt;br/&gt;

Note: This type is for information about actual reservations, e.g. in confirmation emails or HTML pages with individual confirmations of reservations.
   */
  @NotNull public static FoodEstablishmentReservation.Builder foodEstablishmentReservation() { return new FoodEstablishmentReservation.Builder(new HashMap<String,Object>()); }
  /**
   * A plumbing service.
   */
  @NotNull public static Plumber.Builder plumber() { return new Plumber.Builder(new HashMap<String,Object>()); }
  /**
   * A media object, such as an image, video, or audio object embedded in a web page or a downloadable dataset i.e. DataDownload. Note that a creative work may have many media objects associated with it on the same web page. For example, a page about a single song (MusicRecording) may have a music video (VideoObject), and a high and low bandwidth audio stream (2 AudioObject's).
   */
  @NotNull public static MediaObject.Builder mediaObject() { return new MediaObject.Builder(new HashMap<String,Object>()); }
  /**
   * A short segment/part of a video game.
   */
  @NotNull public static VideoGameClip.Builder videoGameClip() { return new VideoGameClip.Builder(new HashMap<String,Object>()); }
  /**
   * A food-related business.
   */
  @NotNull public static FoodEstablishment.Builder foodEstablishment() { return new FoodEstablishment.Builder(new HashMap<String,Object>()); }
  /**
   * The act of forming a personal connection with someone/something (object) unidirectionally/asymmetrically to get updates polled from.&lt;br/&gt;&lt;br/&gt;

Related actions:&lt;br/&gt;&lt;br/&gt;

&lt;ul&gt;
&lt;li&gt;&lt;a class=&quot;localLink&quot; href=&quot;http://schema.org/BefriendAction&quot;&gt;BefriendAction&lt;/a&gt;: Unlike BefriendAction, FollowAction implies that the connection is &lt;em&gt;not&lt;/em&gt; necessarily reciprocal.&lt;/li&gt;
&lt;li&gt;&lt;a class=&quot;localLink&quot; href=&quot;http://schema.org/SubscribeAction&quot;&gt;SubscribeAction&lt;/a&gt;: Unlike SubscribeAction, FollowAction implies that the follower acts as an active agent constantly/actively polling for updates.&lt;/li&gt;
&lt;li&gt;&lt;a class=&quot;localLink&quot; href=&quot;http://schema.org/RegisterAction&quot;&gt;RegisterAction&lt;/a&gt;: Unlike RegisterAction, FollowAction implies that the agent is interested in continuing receiving updates from the object.&lt;/li&gt;
&lt;li&gt;&lt;a class=&quot;localLink&quot; href=&quot;http://schema.org/JoinAction&quot;&gt;JoinAction&lt;/a&gt;: Unlike JoinAction, FollowAction implies that the agent is interested in getting updates from the object.&lt;/li&gt;
&lt;li&gt;&lt;a class=&quot;localLink&quot; href=&quot;http://schema.org/TrackAction&quot;&gt;TrackAction&lt;/a&gt;: Unlike TrackAction, FollowAction refers to the polling of updates of all aspects of animate objects rather than the location of inanimate objects (e.g. you track a package, but you don't follow it).&lt;/li&gt;
&lt;/ul&gt;

   */
  @NotNull public static FollowAction.Builder followAction() { return new FollowAction.Builder(new HashMap<String,Object>()); }
  /**
   * The act of giving money to a seller in exchange for goods or services rendered. An agent buys an object, product, or service from a seller for a price. Reciprocal of SellAction.
   */
  @NotNull public static BuyAction.Builder buyAction() { return new BuyAction.Builder(new HashMap<String,Object>()); }
  /**
   * The act of transferring money from one place to another place. This may occur electronically or physically.
   */
  @NotNull public static MoneyTransfer.Builder moneyTransfer() { return new MoneyTransfer.Builder(new HashMap<String,Object>()); }
  /**
   * A structured value representing a price or price range. Typically, only the subclasses of this type are used for markup. It is recommended to use &lt;a class=&quot;localLink&quot; href=&quot;http://schema.org/MonetaryAmount&quot;&gt;MonetaryAmount&lt;/a&gt; to describe independent amounts of money such as a salary, credit card limits, etc.
   */
  @NotNull public static PriceSpecification.Builder priceSpecification() { return new PriceSpecification.Builder(new HashMap<String,Object>()); }
  /**
   * A sea (for example, the Caspian sea).
   */
  @NotNull public static SeaBodyOfWater.Builder seaBodyOfWater() { return new SeaBodyOfWater.Builder(new HashMap<String,Object>()); }
  /**
   * A notary.
   */
  @NotNull public static Notary.Builder notary() { return new Notary.Builder(new HashMap<String,Object>()); }
  /**
   * The mailing address.
   */
  @NotNull public static PostalAddress.Builder postalAddress() { return new PostalAddress.Builder(new HashMap<String,Object>()); }
  /**
   * A music video file.
   */
  @NotNull public static MusicVideoObject.Builder musicVideoObject() { return new MusicVideoObject.Builder(new HashMap<String,Object>()); }
  /**
   * An indication for a medical therapy that has been formally specified or approved by a regulatory body that regulates use of the therapy; for example, the US FDA approves indications for most drugs in the US.
   */
  @NotNull public static ApprovedIndication.Builder approvedIndication() { return new ApprovedIndication.Builder(new HashMap<String,Object>()); }
  /**
   * An alternative, closely-related condition typically considered later in the differential diagnosis process along with the signs that are used to distinguish it.
   */
  @NotNull public static DDxElement.Builder dDxElement() { return new DDxElement.Builder(new HashMap<String,Object>()); }
  /**
   * A trip or journey. An itinerary of visits to one or more places.
   */
  @NotNull public static Trip.Builder trip() { return new Trip.Builder(new HashMap<String,Object>()); }
  /**
   * A patient is any person recipient of health care services.
   */
  @NotNull public static Patient.Builder patient() { return new Patient.Builder(new HashMap<String,Object>()); }
  /**
   * A structured value indicating the quantity, unit of measurement, and business function of goods included in a bundle offer.
   */
  @NotNull public static TypeAndQuantityNode.Builder typeAndQuantityNode() { return new TypeAndQuantityNode.Builder(new HashMap<String,Object>()); }
  /**
   * A Hindu temple.
   */
  @NotNull public static HinduTemple.Builder hinduTemple() { return new HinduTemple.Builder(new HashMap<String,Object>()); }
  /**
   * A reservation for bus travel. &lt;br/&gt;&lt;br/&gt;

Note: This type is for information about actual reservations, e.g. in confirmation emails or HTML pages with individual confirmations of reservations. For offers of tickets, use &lt;a class=&quot;localLink&quot; href=&quot;http://schema.org/Offer&quot;&gt;Offer&lt;/a&gt;.
   */
  @NotNull public static BusReservation.Builder busReservation() { return new BusReservation.Builder(new HashMap<String,Object>()); }
  /**
   * The act of producing a painting, typically with paint and canvas as instruments.
   */
  @NotNull public static PaintAction.Builder paintAction() { return new PaintAction.Builder(new HashMap<String,Object>()); }
  /**
   * A medical procedure intended primarily for palliative purposes, aimed at relieving the symptoms of an underlying health condition.
   */
  @NotNull public static PalliativeProcedure.Builder palliativeProcedure() { return new PalliativeProcedure.Builder(new HashMap<String,Object>()); }
  /**
   * A park.
   */
  @NotNull public static Park.Builder park() { return new Park.Builder(new HashMap<String,Object>()); }
  /**
   * Instructions that explain how to achieve a result by performing a sequence of steps.
   */
  @NotNull public static HowTo.Builder howTo() { return new HowTo.Builder(new HashMap<String,Object>()); }
  /**
   * The act of giving money voluntarily to a beneficiary in recognition of services rendered.
   */
  @NotNull public static TipAction.Builder tipAction() { return new TipAction.Builder(new HashMap<String,Object>()); }
  /**
   * UserInteraction and its subtypes is an old way of talking about users interacting with pages. It is generally better to use &lt;a class=&quot;localLink&quot; href=&quot;http://schema.org/Action&quot;&gt;Action&lt;/a&gt;-based vocabulary, alongside types such as &lt;a class=&quot;localLink&quot; href=&quot;http://schema.org/Comment&quot;&gt;Comment&lt;/a&gt;.
   */
  @NotNull public static UserTweets.Builder userTweets() { return new UserTweets.Builder(new HashMap<String,Object>()); }
  /**
   * A government building.
   */
  @NotNull public static GovernmentBuilding.Builder governmentBuilding() { return new GovernmentBuilding.Builder(new HashMap<String,Object>()); }
  /**
   * The act of forming one's opinion, reaction or sentiment.
   */
  @NotNull public static AssessAction.Builder assessAction() { return new AssessAction.Builder(new HashMap<String,Object>()); }
  /**
   * A shop that sells alcoholic drinks such as wine, beer, whisky and other spirits.
   */
  @NotNull public static LiquorStore.Builder liquorStore() { return new LiquorStore.Builder(new HashMap<String,Object>()); }
  /**
   * A music store.
   */
  @NotNull public static MusicStore.Builder musicStore() { return new MusicStore.Builder(new HashMap<String,Object>()); }
  /**
   * A &lt;a class=&quot;localLink&quot; href=&quot;http://schema.org/FAQPage&quot;&gt;FAQPage&lt;/a&gt; is a &lt;a class=&quot;localLink&quot; href=&quot;http://schema.org/WebPage&quot;&gt;WebPage&lt;/a&gt; presenting one or more &quot;&lt;a href=&quot;https://en.wikipedia.org/wiki/FAQ&quot;&gt;Frequently asked questions&lt;/a&gt;&quot; (see also &lt;a class=&quot;localLink&quot; href=&quot;http://schema.org/QAPage&quot;&gt;QAPage&lt;/a&gt;).
   */
  @NotNull public static FAQPage.Builder fAQPage() { return new FAQPage.Builder(new HashMap<String,Object>()); }
  /**
   * Specifies a location feature by providing a structured value representing a feature of an accommodation as a property-value pair of varying degrees of formality.
   */
  @NotNull public static LocationFeatureSpecification.Builder locationFeatureSpecification() { return new LocationFeatureSpecification.Builder(new HashMap<String,Object>()); }
  /**
   * &lt;a class=&quot;localLink&quot; href=&quot;http://schema.org/Guide&quot;&gt;Guide&lt;/a&gt; is a page or article that recommend specific products or services, or aspects of a thing for a user to consider. A &lt;a class=&quot;localLink&quot; href=&quot;http://schema.org/Guide&quot;&gt;Guide&lt;/a&gt; may represent a Buying Guide and detail aspects of products or services for a user to consider. A &lt;a class=&quot;localLink&quot; href=&quot;http://schema.org/Guide&quot;&gt;Guide&lt;/a&gt; may represent a Product Guide and recommend specific products or services. A &lt;a class=&quot;localLink&quot; href=&quot;http://schema.org/Guide&quot;&gt;Guide&lt;/a&gt; may represent a Ranked List and recommend specific products or services with ranking.
   */
  @NotNull public static Guide.Builder guide() { return new Guide.Builder(new HashMap<String,Object>()); }
  /**
   * A technical article - Example: How-to (task) topics, step-by-step, procedural troubleshooting, specifications, etc.
   */
  @NotNull public static TechArticle.Builder techArticle() { return new TechArticle.Builder(new HashMap<String,Object>()); }
  /**
   * The act of applying an object to its intended purpose.
   */
  @NotNull public static UseAction.Builder useAction() { return new UseAction.Builder(new HashMap<String,Object>()); }
  /**
   * Quantity: Duration (use &lt;a href=&quot;http://en.wikipedia.org/wiki/ISO_8601&quot;&gt;ISO 8601 duration format&lt;/a&gt;).
   */
  @NotNull public static Duration.Builder duration() { return new Duration.Builder(new HashMap<String,Object>()); }
  /**
   * A recipe. For dietary restrictions covered by the recipe, a few common restrictions are enumerated via &lt;a class=&quot;localLink&quot; href=&quot;http://schema.org/suitableForDiet&quot;&gt;suitableForDiet&lt;/a&gt;. The &lt;a class=&quot;localLink&quot; href=&quot;http://schema.org/keywords&quot;&gt;keywords&lt;/a&gt; property can also be used to add more detail.
   */
  @NotNull public static Recipe.Builder recipe() { return new Recipe.Builder(new HashMap<String,Object>()); }
  /**
   * A video game is an electronic game that involves human interaction with a user interface to generate visual feedback on a video device.
   */
  @NotNull public static VideoGame.Builder videoGame() { return new VideoGame.Builder(new HashMap<String,Object>()); }
  /**
   * An item used as either a tool or supply when performing the instructions for how to to achieve a result.
   */
  @NotNull public static HowToItem.Builder howToItem() { return new HowToItem.Builder(new HashMap<String,Object>()); }
  /**
   * The act of providing an object under an agreement that it will be returned at a later date. Reciprocal of BorrowAction.&lt;br/&gt;&lt;br/&gt;

Related actions:&lt;br/&gt;&lt;br/&gt;

&lt;ul&gt;
&lt;li&gt;&lt;a class=&quot;localLink&quot; href=&quot;http://schema.org/BorrowAction&quot;&gt;BorrowAction&lt;/a&gt;: Reciprocal of LendAction.&lt;/li&gt;
&lt;/ul&gt;

   */
  @NotNull public static LendAction.Builder lendAction() { return new LendAction.Builder(new HashMap<String,Object>()); }
  /**
   * A School District is an administrative area for the administration of schools.
   */
  @NotNull public static SchoolDistrict.Builder schoolDistrict() { return new SchoolDistrict.Builder(new HashMap<String,Object>()); }
  /**
   * UserInteraction and its subtypes is an old way of talking about users interacting with pages. It is generally better to use &lt;a class=&quot;localLink&quot; href=&quot;http://schema.org/Action&quot;&gt;Action&lt;/a&gt;-based vocabulary, alongside types such as &lt;a class=&quot;localLink&quot; href=&quot;http://schema.org/Comment&quot;&gt;Comment&lt;/a&gt;.
   */
  @NotNull public static UserInteraction.Builder userInteraction() { return new UserInteraction.Builder(new HashMap<String,Object>()); }
  /**
   * A series of books. Included books can be indicated with the hasPart property.
   */
  @NotNull public static BookSeries.Builder bookSeries() { return new BookSeries.Builder(new HashMap<String,Object>()); }
  /**
   * The geographic shape of a place. A GeoShape can be described using several properties whose values are based on latitude/longitude pairs. Either whitespace or commas can be used to separate latitude and longitude; whitespace should be used when writing a list of several such points.
   */
  @NotNull public static GeoShape.Builder geoShape() { return new GeoShape.Builder(new HashMap<String,Object>()); }
  /**
   * A page devoted to a single item, such as a particular product or hotel.
   */
  @NotNull public static ItemPage.Builder itemPage() { return new ItemPage.Builder(new HashMap<String,Object>()); }
  /**
   * A travel agency.
   */
  @NotNull public static TravelAgency.Builder travelAgency() { return new TravelAgency.Builder(new HashMap<String,Object>()); }
  /**
   * An educational organization.
   */
  @NotNull public static EducationalOrganization.Builder educationalOrganization() { return new EducationalOrganization.Builder(new HashMap<String,Object>()); }
  /**
   * A &lt;a class=&quot;localLink&quot; href=&quot;http://schema.org/LibrarySystem&quot;&gt;LibrarySystem&lt;/a&gt; is a collaborative system amongst several libraries.
   */
  @NotNull public static LibrarySystem.Builder librarySystem() { return new LibrarySystem.Builder(new HashMap<String,Object>()); }
  /**
   * A subscription which allows a user to access media including audio, video, books, etc.
   */
  @NotNull public static MediaSubscription.Builder mediaSubscription() { return new MediaSubscription.Builder(new HashMap<String,Object>()); }
  /**
   * The act of expressing a desire about the object. An agent wants an object.
   */
  @NotNull public static WantAction.Builder wantAction() { return new WantAction.Builder(new HashMap<String,Object>()); }
  /**
   * The act of participating in an exchange of goods and services for monetary compensation. An agent trades an object, product or service with a participant in exchange for a one time or periodic payment.
   */
  @NotNull public static TradeAction.Builder tradeAction() { return new TradeAction.Builder(new HashMap<String,Object>()); }
  /**
   * A service provided by a government organization, e.g. food stamps, veterans benefits, etc.
   */
  @NotNull public static GovernmentService.Builder governmentService() { return new GovernmentService.Builder(new HashMap<String,Object>()); }
  /**
   * Event type: Festival.
   */
  @NotNull public static Festival.Builder festival() { return new Festival.Builder(new HashMap<String,Object>()); }
  /**
   * An agent joins an event/group with participants/friends at a location.&lt;br/&gt;&lt;br/&gt;

Related actions:&lt;br/&gt;&lt;br/&gt;

&lt;ul&gt;
&lt;li&gt;&lt;a class=&quot;localLink&quot; href=&quot;http://schema.org/RegisterAction&quot;&gt;RegisterAction&lt;/a&gt;: Unlike RegisterAction, JoinAction refers to joining a group/team of people.&lt;/li&gt;
&lt;li&gt;&lt;a class=&quot;localLink&quot; href=&quot;http://schema.org/SubscribeAction&quot;&gt;SubscribeAction&lt;/a&gt;: Unlike SubscribeAction, JoinAction does not imply that you'll be receiving updates.&lt;/li&gt;
&lt;li&gt;&lt;a class=&quot;localLink&quot; href=&quot;http://schema.org/FollowAction&quot;&gt;FollowAction&lt;/a&gt;: Unlike FollowAction, JoinAction does not imply that you'll be polling for updates.&lt;/li&gt;
&lt;/ul&gt;

   */
  @NotNull public static JoinAction.Builder joinAction() { return new JoinAction.Builder(new HashMap<String,Object>()); }
  /**
   * A podcast is an episodic series of digital audio or video files which a user can download and listen to.
   */
  @NotNull public static PodcastSeries.Builder podcastSeries() { return new PodcastSeries.Builder(new HashMap<String,Object>()); }
  /**
   * A business that provide Heating, Ventilation and Air Conditioning services.
   */
  @NotNull public static HVACBusiness.Builder hVACBusiness() { return new HVACBusiness.Builder(new HashMap<String,Object>()); }
  /**
   * Accountancy business.&lt;br/&gt;&lt;br/&gt;

As a &lt;a class=&quot;localLink&quot; href=&quot;http://schema.org/LocalBusiness&quot;&gt;LocalBusiness&lt;/a&gt; it can be described as a &lt;a class=&quot;localLink&quot; href=&quot;http://schema.org/provider&quot;&gt;provider&lt;/a&gt; of one or more &lt;a class=&quot;localLink&quot; href=&quot;http://schema.org/Service&quot;&gt;Service&lt;/a&gt;(s).
   */
  @NotNull public static AccountingService.Builder accountingService() { return new AccountingService.Builder(new HashMap<String,Object>()); }
  /**
   * An indication for treating an underlying condition, symptom, etc.
   */
  @NotNull public static TreatmentIndication.Builder treatmentIndication() { return new TreatmentIndication.Builder(new HashMap<String,Object>()); }
  /**
   * Entities that have a somewhat fixed, physical extension.
   */
  @NotNull public static Place.Builder place() { return new Place.Builder(new HashMap<String,Object>()); }
  /**
   * A value indicating a steering position.
   */
  @NotNull public static SteeringPositionValue.Builder steeringPositionValue() { return new SteeringPositionValue.Builder(new HashMap<String,Object>()); }
  /**
   * An internet cafe.
   */
  @NotNull public static InternetCafe.Builder internetCafe() { return new InternetCafe.Builder(new HashMap<String,Object>()); }
  /**
   * A specific strength in which a medical drug is available in a specific country.
   */
  @NotNull public static DrugStrength.Builder drugStrength() { return new DrugStrength.Builder(new HashMap<String,Object>()); }
  /**
   * The act of obtaining an object under an agreement to return it at a later date. Reciprocal of LendAction.&lt;br/&gt;&lt;br/&gt;

Related actions:&lt;br/&gt;&lt;br/&gt;

&lt;ul&gt;
&lt;li&gt;&lt;a class=&quot;localLink&quot; href=&quot;http://schema.org/LendAction&quot;&gt;LendAction&lt;/a&gt;: Reciprocal of BorrowAction.&lt;/li&gt;
&lt;/ul&gt;

   */
  @NotNull public static BorrowAction.Builder borrowAction() { return new BorrowAction.Builder(new HashMap<String,Object>()); }
  /**
   * The act of posing a question / favor to someone.&lt;br/&gt;&lt;br/&gt;

Related actions:&lt;br/&gt;&lt;br/&gt;

&lt;ul&gt;
&lt;li&gt;&lt;a class=&quot;localLink&quot; href=&quot;http://schema.org/ReplyAction&quot;&gt;ReplyAction&lt;/a&gt;: Appears generally as a response to AskAction.&lt;/li&gt;
&lt;/ul&gt;

   */
  @NotNull public static AskAction.Builder askAction() { return new AskAction.Builder(new HashMap<String,Object>()); }
  /**
   * Event type: Business event.
   */
  @NotNull public static BusinessEvent.Builder businessEvent() { return new BusinessEvent.Builder(new HashMap<String,Object>()); }
  /**
   * A defence establishment, such as an army or navy base.
   */
  @NotNull public static DefenceEstablishment.Builder defenceEstablishment() { return new DefenceEstablishment.Builder(new HashMap<String,Object>()); }
  /**
   * Event type: Sales event.
   */
  @NotNull public static SaleEvent.Builder saleEvent() { return new SaleEvent.Builder(new HashMap<String,Object>()); }
  /**
   * A specific branch of medical science that is concerned with the study, treatment, and prevention of mental illness, using both medical and psychological therapies.
   */
  @NotNull public static Psychiatric.Builder psychiatric() { return new Psychiatric.Builder(new HashMap<String,Object>()); }
  /**
   * A taxi stand.
   */
  @NotNull public static TaxiStand.Builder taxiStand() { return new TaxiStand.Builder(new HashMap<String,Object>()); }
  /**
   * A Report generated by governmental or non-governmental organization.
   */
  @NotNull public static Report.Builder report() { return new Report.Builder(new HashMap<String,Object>()); }
  /**
   * A product taken by mouth that contains a dietary ingredient intended to supplement the diet. Dietary ingredients may include vitamins, minerals, herbs or other botanicals, amino acids, and substances such as enzymes, organ tissues, glandulars and metabolites.
   */
  @NotNull public static DietarySupplement.Builder dietarySupplement() { return new DietarySupplement.Builder(new HashMap<String,Object>()); }
  /**
   * The act of consuming audio content.
   */
  @NotNull public static ListenAction.Builder listenAction() { return new ListenAction.Builder(new HashMap<String,Object>()); }
  /**
   * A 3D model represents some kind of 3D content, which may have &lt;a class=&quot;localLink&quot; href=&quot;http://schema.org/encoding&quot;&gt;encoding&lt;/a&gt;s in one or more &lt;a class=&quot;localLink&quot; href=&quot;http://schema.org/MediaObject&quot;&gt;MediaObject&lt;/a&gt;s. Many 3D formats are available (e.g. see &lt;a href=&quot;https://en.wikipedia.org/wiki/Category:3D_graphics_file_formats&quot;&gt;Wikipedia&lt;/a&gt;); specific encoding formats can be represented using the &lt;a class=&quot;localLink&quot; href=&quot;http://schema.org/encodingFormat&quot;&gt;encodingFormat&lt;/a&gt; property applied to the relevant &lt;a class=&quot;localLink&quot; href=&quot;http://schema.org/MediaObject&quot;&gt;MediaObject&lt;/a&gt;. For the
case of a single file published after Zip compression, the convention of appending '+zip' to the &lt;a class=&quot;localLink&quot; href=&quot;http://schema.org/encodingFormat&quot;&gt;encodingFormat&lt;/a&gt; can be used. Geospatial, AR/VR, artistic/animation, gaming, engineering and scientific content can all be represented using &lt;a class=&quot;localLink&quot; href=&quot;http://schema.org/3DModel&quot;&gt;3DModel&lt;/a&gt;.
   */
  @NotNull public static 3DModel.Builder 3DModel() { return new 3DModel.Builder(new HashMap<String,Object>()); }
  /**
   * A bookstore.
   */
  @NotNull public static BookStore.Builder bookStore() { return new BookStore.Builder(new HashMap<String,Object>()); }
  /**
   * A medical laboratory that offers on-site or off-site diagnostic services.
   */
  @NotNull public static DiagnosticLab.Builder diagnosticLab() { return new DiagnosticLab.Builder(new HashMap<String,Object>()); }
  /**
   * A toy store.
   */
  @NotNull public static ToyStore.Builder toyStore() { return new ToyStore.Builder(new HashMap<String,Object>()); }
  /**
   * A camping site, campsite, or &lt;a class=&quot;localLink&quot; href=&quot;http://schema.org/Campground&quot;&gt;Campground&lt;/a&gt; is a place used for overnight stay in the outdoors, typically containing individual &lt;a class=&quot;localLink&quot; href=&quot;http://schema.org/CampingPitch&quot;&gt;CampingPitch&lt;/a&gt; locations. &lt;br/&gt;&lt;br/&gt;

In British English a campsite is an area, usually divided into a number of pitches, where people can camp overnight using tents or camper vans or caravans; this British English use of the word is synonymous with the American English expression campground. In American English the term campsite generally means an area where an individual, family, group, or military unit can pitch a tent or park a camper; a campground may contain many campsites (Source: Wikipedia see &lt;a href=&quot;https://en.wikipedia.org/wiki/Campsite&quot;&gt;https://en.wikipedia.org/wiki/Campsite&lt;/a&gt;).&lt;br/&gt;&lt;br/&gt;

See also the dedicated &lt;a href=&quot;/docs/hotels.html&quot;&gt;document on the use of schema.org for marking up hotels and other forms of accommodations&lt;/a&gt;.
   */
  @NotNull public static Campground.Builder campground() { return new Campground.Builder(new HashMap<String,Object>()); }
  /**
   * An auto parts store.
   */
  @NotNull public static AutoPartsStore.Builder autoPartsStore() { return new AutoPartsStore.Builder(new HashMap<String,Object>()); }
  /**
   * A spreadsheet file.
   */
  @NotNull public static SpreadsheetDigitalDocument.Builder spreadsheetDigitalDocument() { return new SpreadsheetDigitalDocument.Builder(new HashMap<String,Object>()); }
  /**
   * Describes a reservation for travel, dining or an event. Some reservations require tickets. &lt;br/&gt;&lt;br/&gt;

Note: This type is for information about actual reservations, e.g. in confirmation emails or HTML pages with individual confirmations of reservations. For offers of tickets, restaurant reservations, flights, or rental cars, use &lt;a class=&quot;localLink&quot; href=&quot;http://schema.org/Offer&quot;&gt;Offer&lt;/a&gt;.
   */
  @NotNull public static Reservation.Builder reservation() { return new Reservation.Builder(new HashMap<String,Object>()); }
  /**
   * Any offered product or service. For example: a pair of shoes; a concert ticket; the rental of a car; a haircut; or an episode of a TV show streamed online.
   */
  @NotNull public static Product.Builder product() { return new Product.Builder(new HashMap<String,Object>()); }
  /**
   * The act of swallowing liquids.
   */
  @NotNull public static DrinkAction.Builder drinkAction() { return new DrinkAction.Builder(new HashMap<String,Object>()); }
  /**
   * A medical test performed by a laboratory that typically involves examination of a tissue sample by a pathologist.
   */
  @NotNull public static PathologyTest.Builder pathologyTest() { return new PathologyTest.Builder(new HashMap<String,Object>()); }
  /**
   * A unique instance of a radio BroadcastService on a CableOrSatelliteService lineup.
   */
  @NotNull public static RadioChannel.Builder radioChannel() { return new RadioChannel.Builder(new HashMap<String,Object>()); }
  /**
   * The act of planning the execution of an event/task/action/reservation/plan to a future date.
   */
  @NotNull public static PlanAction.Builder planAction() { return new PlanAction.Builder(new HashMap<String,Object>()); }
  /**
   * The act of committing to/adopting an object.&lt;br/&gt;&lt;br/&gt;

Related actions:&lt;br/&gt;&lt;br/&gt;

&lt;ul&gt;
&lt;li&gt;&lt;a class=&quot;localLink&quot; href=&quot;http://schema.org/RejectAction&quot;&gt;RejectAction&lt;/a&gt;: The antonym of AcceptAction.&lt;/li&gt;
&lt;/ul&gt;

   */
  @NotNull public static AcceptAction.Builder acceptAction() { return new AcceptAction.Builder(new HashMap<String,Object>()); }

  public static ThingBuilder getBuilder(@NotNull String type) {
    if ("CollegeOrUniversity".equals(type)) { return new CollegeOrUniversity.Builder(new HashMap<String,Object>()); }
    if ("RadioBroadcastService".equals(type)) { return new RadioBroadcastService.Builder(new HashMap<String,Object>()); }
    if ("WriteAction".equals(type)) { return new WriteAction.Builder(new HashMap<String,Object>()); }
    if ("WorkBasedProgram".equals(type)) { return new WorkBasedProgram.Builder(new HashMap<String,Object>()); }
    if ("Dentist".equals(type)) { return new Dentist.Builder(new HashMap<String,Object>()); }
    if ("CancelAction".equals(type)) { return new CancelAction.Builder(new HashMap<String,Object>()); }
    if ("TextDigitalDocument".equals(type)) { return new TextDigitalDocument.Builder(new HashMap<String,Object>()); }
    if ("BusStop".equals(type)) { return new BusStop.Builder(new HashMap<String,Object>()); }
    if ("BackgroundNewsArticle".equals(type)) { return new BackgroundNewsArticle.Builder(new HashMap<String,Object>()); }
    if ("MenuSection".equals(type)) { return new MenuSection.Builder(new HashMap<String,Object>()); }
    if ("PhysicalActivity".equals(type)) { return new PhysicalActivity.Builder(new HashMap<String,Object>()); }
    if ("TransferAction".equals(type)) { return new TransferAction.Builder(new HashMap<String,Object>()); }
    if ("ComputerStore".equals(type)) { return new ComputerStore.Builder(new HashMap<String,Object>()); }
    if ("Podiatric".equals(type)) { return new Podiatric.Builder(new HashMap<String,Object>()); }
    if ("CampingPitch".equals(type)) { return new CampingPitch.Builder(new HashMap<String,Object>()); }
    if ("Emergency".equals(type)) { return new Emergency.Builder(new HashMap<String,Object>()); }
    if ("TVClip".equals(type)) { return new TVClip.Builder(new HashMap<String,Object>()); }
    if ("GardenStore".equals(type)) { return new GardenStore.Builder(new HashMap<String,Object>()); }
    if ("MediaGallery".equals(type)) { return new MediaGallery.Builder(new HashMap<String,Object>()); }
    if ("Resort".equals(type)) { return new Resort.Builder(new HashMap<String,Object>()); }
    if ("WearAction".equals(type)) { return new WearAction.Builder(new HashMap<String,Object>()); }
    if ("VitalSign".equals(type)) { return new VitalSign.Builder(new HashMap<String,Object>()); }
    if ("ClaimReview".equals(type)) { return new ClaimReview.Builder(new HashMap<String,Object>()); }
    if ("PublicHealth".equals(type)) { return new PublicHealth.Builder(new HashMap<String,Object>()); }
    if ("OfferShippingDetails".equals(type)) { return new OfferShippingDetails.Builder(new HashMap<String,Object>()); }
    if ("ComedyClub".equals(type)) { return new ComedyClub.Builder(new HashMap<String,Object>()); }
    if ("CreativeWork".equals(type)) { return new CreativeWork.Builder(new HashMap<String,Object>()); }
    if ("Demand".equals(type)) { return new Demand.Builder(new HashMap<String,Object>()); }
    if ("AskPublicNewsArticle".equals(type)) { return new AskPublicNewsArticle.Builder(new HashMap<String,Object>()); }
    if ("ImageGallery".equals(type)) { return new ImageGallery.Builder(new HashMap<String,Object>()); }
    if ("AnatomicalSystem".equals(type)) { return new AnatomicalSystem.Builder(new HashMap<String,Object>()); }
    if ("InsertAction".equals(type)) { return new InsertAction.Builder(new HashMap<String,Object>()); }
    if ("VideoGameSeries".equals(type)) { return new VideoGameSeries.Builder(new HashMap<String,Object>()); }
    if ("AMRadioChannel".equals(type)) { return new AMRadioChannel.Builder(new HashMap<String,Object>()); }
    if ("HomeGoodsStore".equals(type)) { return new HomeGoodsStore.Builder(new HashMap<String,Object>()); }
    if ("Mosque".equals(type)) { return new Mosque.Builder(new HashMap<String,Object>()); }
    if ("OpeningHoursSpecification".equals(type)) { return new OpeningHoursSpecification.Builder(new HashMap<String,Object>()); }
    if ("ReviewNewsArticle".equals(type)) { return new ReviewNewsArticle.Builder(new HashMap<String,Object>()); }
    if ("ActionAccessSpecification".equals(type)) { return new ActionAccessSpecification.Builder(new HashMap<String,Object>()); }
    if ("Consortium".equals(type)) { return new Consortium.Builder(new HashMap<String,Object>()); }
    if ("SatiricalArticle".equals(type)) { return new SatiricalArticle.Builder(new HashMap<String,Object>()); }
    if ("Church".equals(type)) { return new Church.Builder(new HashMap<String,Object>()); }
    if ("Painting".equals(type)) { return new Painting.Builder(new HashMap<String,Object>()); }
    if ("Car".equals(type)) { return new Car.Builder(new HashMap<String,Object>()); }
    if ("PostOffice".equals(type)) { return new PostOffice.Builder(new HashMap<String,Object>()); }
    if ("ExerciseAction".equals(type)) { return new ExerciseAction.Builder(new HashMap<String,Object>()); }
    if ("Volcano".equals(type)) { return new Volcano.Builder(new HashMap<String,Object>()); }
    if ("CollectionPage".equals(type)) { return new CollectionPage.Builder(new HashMap<String,Object>()); }
    if ("WebSite".equals(type)) { return new WebSite.Builder(new HashMap<String,Object>()); }
    if ("CheckAction".equals(type)) { return new CheckAction.Builder(new HashMap<String,Object>()); }
    if ("DiagnosticProcedure".equals(type)) { return new DiagnosticProcedure.Builder(new HashMap<String,Object>()); }
    if ("EventReservation".equals(type)) { return new EventReservation.Builder(new HashMap<String,Object>()); }
    if ("GeoCoordinates".equals(type)) { return new GeoCoordinates.Builder(new HashMap<String,Object>()); }
    if ("MedicalIntangible".equals(type)) { return new MedicalIntangible.Builder(new HashMap<String,Object>()); }
    if ("InsuranceAgency".equals(type)) { return new InsuranceAgency.Builder(new HashMap<String,Object>()); }
    if ("CoverArt".equals(type)) { return new CoverArt.Builder(new HashMap<String,Object>()); }
    if ("DigitalDocumentPermission".equals(type)) { return new DigitalDocumentPermission.Builder(new HashMap<String,Object>()); }
    if ("UserDownloads".equals(type)) { return new UserDownloads.Builder(new HashMap<String,Object>()); }
    if ("Continent".equals(type)) { return new Continent.Builder(new HashMap<String,Object>()); }
    if ("DrugLegalStatus".equals(type)) { return new DrugLegalStatus.Builder(new HashMap<String,Object>()); }
    if ("PublicationEvent".equals(type)) { return new PublicationEvent.Builder(new HashMap<String,Object>()); }
    if ("Project".equals(type)) { return new Project.Builder(new HashMap<String,Object>()); }
    if ("WPFooter".equals(type)) { return new WPFooter.Builder(new HashMap<String,Object>()); }
    if ("Conversation".equals(type)) { return new Conversation.Builder(new HashMap<String,Object>()); }
    if ("ComputerLanguage".equals(type)) { return new ComputerLanguage.Builder(new HashMap<String,Object>()); }
    if ("Substance".equals(type)) { return new Substance.Builder(new HashMap<String,Object>()); }
    if ("MusicPlaylist".equals(type)) { return new MusicPlaylist.Builder(new HashMap<String,Object>()); }
    if ("AutoRental".equals(type)) { return new AutoRental.Builder(new HashMap<String,Object>()); }
    if ("BlogPosting".equals(type)) { return new BlogPosting.Builder(new HashMap<String,Object>()); }
    if ("DefinedRegion".equals(type)) { return new DefinedRegion.Builder(new HashMap<String,Object>()); }
    if ("FinancialService".equals(type)) { return new FinancialService.Builder(new HashMap<String,Object>()); }
    if ("PrependAction".equals(type)) { return new PrependAction.Builder(new HashMap<String,Object>()); }
    if ("PoliceStation".equals(type)) { return new PoliceStation.Builder(new HashMap<String,Object>()); }
    if ("StupidType".equals(type)) { return new StupidType.Builder(new HashMap<String,Object>()); }
    if ("ShoppingCenter".equals(type)) { return new ShoppingCenter.Builder(new HashMap<String,Object>()); }
    if ("MedicalRiskCalculator".equals(type)) { return new MedicalRiskCalculator.Builder(new HashMap<String,Object>()); }
    if ("Role".equals(type)) { return new Role.Builder(new HashMap<String,Object>()); }
    if ("Museum".equals(type)) { return new Museum.Builder(new HashMap<String,Object>()); }
    if ("Movie".equals(type)) { return new Movie.Builder(new HashMap<String,Object>()); }
    if ("Midwifery".equals(type)) { return new Midwifery.Builder(new HashMap<String,Object>()); }
    if ("RejectAction".equals(type)) { return new RejectAction.Builder(new HashMap<String,Object>()); }
    if ("BedDetails".equals(type)) { return new BedDetails.Builder(new HashMap<String,Object>()); }
    if ("ClothingStore".equals(type)) { return new ClothingStore.Builder(new HashMap<String,Object>()); }
    if ("MedicalTrial".equals(type)) { return new MedicalTrial.Builder(new HashMap<String,Object>()); }
    if ("ExercisePlan".equals(type)) { return new ExercisePlan.Builder(new HashMap<String,Object>()); }
    if ("TheaterGroup".equals(type)) { return new TheaterGroup.Builder(new HashMap<String,Object>()); }
    if ("TaxiReservation".equals(type)) { return new TaxiReservation.Builder(new HashMap<String,Object>()); }
    if ("PublicSwimmingPool".equals(type)) { return new PublicSwimmingPool.Builder(new HashMap<String,Object>()); }
    if ("ReturnAction".equals(type)) { return new ReturnAction.Builder(new HashMap<String,Object>()); }
    if ("UpdateAction".equals(type)) { return new UpdateAction.Builder(new HashMap<String,Object>()); }
    if ("MensClothingStore".equals(type)) { return new MensClothingStore.Builder(new HashMap<String,Object>()); }
    if ("FoodEvent".equals(type)) { return new FoodEvent.Builder(new HashMap<String,Object>()); }
    if ("DatedMoneySpecification".equals(type)) { return new DatedMoneySpecification.Builder(new HashMap<String,Object>()); }
    if ("FundingScheme".equals(type)) { return new FundingScheme.Builder(new HashMap<String,Object>()); }
    if ("ConsumeAction".equals(type)) { return new ConsumeAction.Builder(new HashMap<String,Object>()); }
    if ("MedicalWebPage".equals(type)) { return new MedicalWebPage.Builder(new HashMap<String,Object>()); }
    if ("MovieRentalStore".equals(type)) { return new MovieRentalStore.Builder(new HashMap<String,Object>()); }
    if ("Barcode".equals(type)) { return new Barcode.Builder(new HashMap<String,Object>()); }
    if ("HairSalon".equals(type)) { return new HairSalon.Builder(new HashMap<String,Object>()); }
    if ("Room".equals(type)) { return new Room.Builder(new HashMap<String,Object>()); }
    if ("CafeOrCoffeeShop".equals(type)) { return new CafeOrCoffeeShop.Builder(new HashMap<String,Object>()); }
    if ("ViewAction".equals(type)) { return new ViewAction.Builder(new HashMap<String,Object>()); }
    if ("InteractionCounter".equals(type)) { return new InteractionCounter.Builder(new HashMap<String,Object>()); }
    if ("OrganizationRole".equals(type)) { return new OrganizationRole.Builder(new HashMap<String,Object>()); }
    if ("InteractAction".equals(type)) { return new InteractAction.Builder(new HashMap<String,Object>()); }
    if ("HousePainter".equals(type)) { return new HousePainter.Builder(new HashMap<String,Object>()); }
    if ("MedicalStudy".equals(type)) { return new MedicalStudy.Builder(new HashMap<String,Object>()); }
    if ("TrainReservation".equals(type)) { return new TrainReservation.Builder(new HashMap<String,Object>()); }
    if ("SubwayStation".equals(type)) { return new SubwayStation.Builder(new HashMap<String,Object>()); }
    if ("FinancialProduct".equals(type)) { return new FinancialProduct.Builder(new HashMap<String,Object>()); }
    if ("Drug".equals(type)) { return new Drug.Builder(new HashMap<String,Object>()); }
    if ("Blog".equals(type)) { return new Blog.Builder(new HashMap<String,Object>()); }
    if ("ExerciseGym".equals(type)) { return new ExerciseGym.Builder(new HashMap<String,Object>()); }
    if ("CityHall".equals(type)) { return new CityHall.Builder(new HashMap<String,Object>()); }
    if ("QuantitativeValue".equals(type)) { return new QuantitativeValue.Builder(new HashMap<String,Object>()); }
    if ("CommunicateAction".equals(type)) { return new CommunicateAction.Builder(new HashMap<String,Object>()); }
    if ("Apartment".equals(type)) { return new Apartment.Builder(new HashMap<String,Object>()); }
    if ("InvestmentFund".equals(type)) { return new InvestmentFund.Builder(new HashMap<String,Object>()); }
    if ("ResearchProject".equals(type)) { return new ResearchProject.Builder(new HashMap<String,Object>()); }
    if ("UnRegisterAction".equals(type)) { return new UnRegisterAction.Builder(new HashMap<String,Object>()); }
    if ("EmploymentAgency".equals(type)) { return new EmploymentAgency.Builder(new HashMap<String,Object>()); }
    if ("Invoice".equals(type)) { return new Invoice.Builder(new HashMap<String,Object>()); }
    if ("MusicAlbum".equals(type)) { return new MusicAlbum.Builder(new HashMap<String,Object>()); }
    if ("FurnitureStore".equals(type)) { return new FurnitureStore.Builder(new HashMap<String,Object>()); }
    if ("BuddhistTemple".equals(type)) { return new BuddhistTemple.Builder(new HashMap<String,Object>()); }
    if ("Poster".equals(type)) { return new Poster.Builder(new HashMap<String,Object>()); }
    if ("ReviewAction".equals(type)) { return new ReviewAction.Builder(new HashMap<String,Object>()); }
    if ("RentAction".equals(type)) { return new RentAction.Builder(new HashMap<String,Object>()); }
    if ("MedicalRiskFactor".equals(type)) { return new MedicalRiskFactor.Builder(new HashMap<String,Object>()); }
    if ("ProductReturnPolicy".equals(type)) { return new ProductReturnPolicy.Builder(new HashMap<String,Object>()); }
    if ("AutoRepair".equals(type)) { return new AutoRepair.Builder(new HashMap<String,Object>()); }
    if ("RiverBodyOfWater".equals(type)) { return new RiverBodyOfWater.Builder(new HashMap<String,Object>()); }
    if ("Obstetric".equals(type)) { return new Obstetric.Builder(new HashMap<String,Object>()); }
    if ("SuspendAction".equals(type)) { return new SuspendAction.Builder(new HashMap<String,Object>()); }
    if ("ServiceChannel".equals(type)) { return new ServiceChannel.Builder(new HashMap<String,Object>()); }
    if ("MedicalOrganization".equals(type)) { return new MedicalOrganization.Builder(new HashMap<String,Object>()); }
    if ("SellAction".equals(type)) { return new SellAction.Builder(new HashMap<String,Object>()); }
    if ("UserPlays".equals(type)) { return new UserPlays.Builder(new HashMap<String,Object>()); }
    if ("WholesaleStore".equals(type)) { return new WholesaleStore.Builder(new HashMap<String,Object>()); }
    if ("GovernmentPermit".equals(type)) { return new GovernmentPermit.Builder(new HashMap<String,Object>()); }
    if ("RecyclingCenter".equals(type)) { return new RecyclingCenter.Builder(new HashMap<String,Object>()); }
    if ("FastFoodRestaurant".equals(type)) { return new FastFoodRestaurant.Builder(new HashMap<String,Object>()); }
    if ("MaximumDoseSchedule".equals(type)) { return new MaximumDoseSchedule.Builder(new HashMap<String,Object>()); }
    if ("MedicalCondition".equals(type)) { return new MedicalCondition.Builder(new HashMap<String,Object>()); }
    if ("SoftwareSourceCode".equals(type)) { return new SoftwareSourceCode.Builder(new HashMap<String,Object>()); }
    if ("Hospital".equals(type)) { return new Hospital.Builder(new HashMap<String,Object>()); }
    if ("IndividualProduct".equals(type)) { return new IndividualProduct.Builder(new HashMap<String,Object>()); }
    if ("RadioSeason".equals(type)) { return new RadioSeason.Builder(new HashMap<String,Object>()); }
    if ("TelevisionStation".equals(type)) { return new TelevisionStation.Builder(new HashMap<String,Object>()); }
    if ("Waterfall".equals(type)) { return new Waterfall.Builder(new HashMap<String,Object>()); }
    if ("BroadcastService".equals(type)) { return new BroadcastService.Builder(new HashMap<String,Object>()); }
    if ("CheckInAction".equals(type)) { return new CheckInAction.Builder(new HashMap<String,Object>()); }
    if ("MarryAction".equals(type)) { return new MarryAction.Builder(new HashMap<String,Object>()); }
    if ("Cemetery".equals(type)) { return new Cemetery.Builder(new HashMap<String,Object>()); }
    if ("PublicToilet".equals(type)) { return new PublicToilet.Builder(new HashMap<String,Object>()); }
    if ("PerformingGroup".equals(type)) { return new PerformingGroup.Builder(new HashMap<String,Object>()); }
    if ("Dermatology".equals(type)) { return new Dermatology.Builder(new HashMap<String,Object>()); }
    if ("Sculpture".equals(type)) { return new Sculpture.Builder(new HashMap<String,Object>()); }
    if ("CreateAction".equals(type)) { return new CreateAction.Builder(new HashMap<String,Object>()); }
    if ("NoteDigitalDocument".equals(type)) { return new NoteDigitalDocument.Builder(new HashMap<String,Object>()); }
    if ("ComicSeries".equals(type)) { return new ComicSeries.Builder(new HashMap<String,Object>()); }
    if ("AdministrativeArea".equals(type)) { return new AdministrativeArea.Builder(new HashMap<String,Object>()); }
    if ("PropertyValue".equals(type)) { return new PropertyValue.Builder(new HashMap<String,Object>()); }
    if ("Periodical".equals(type)) { return new Periodical.Builder(new HashMap<String,Object>()); }
    if ("TherapeuticProcedure".equals(type)) { return new TherapeuticProcedure.Builder(new HashMap<String,Object>()); }
    if ("LymphaticVessel".equals(type)) { return new LymphaticVessel.Builder(new HashMap<String,Object>()); }
    if ("LegislationObject".equals(type)) { return new LegislationObject.Builder(new HashMap<String,Object>()); }
    if ("EndorseAction".equals(type)) { return new EndorseAction.Builder(new HashMap<String,Object>()); }
    if ("Rating".equals(type)) { return new Rating.Builder(new HashMap<String,Object>()); }
    if ("Ligament".equals(type)) { return new Ligament.Builder(new HashMap<String,Object>()); }
    if ("LakeBodyOfWater".equals(type)) { return new LakeBodyOfWater.Builder(new HashMap<String,Object>()); }
    if ("GasStation".equals(type)) { return new GasStation.Builder(new HashMap<String,Object>()); }
    if ("GovernmentOffice".equals(type)) { return new GovernmentOffice.Builder(new HashMap<String,Object>()); }
    if ("LodgingBusiness".equals(type)) { return new LodgingBusiness.Builder(new HashMap<String,Object>()); }
    if ("GeneralContractor".equals(type)) { return new GeneralContractor.Builder(new HashMap<String,Object>()); }
    if ("SuperficialAnatomy".equals(type)) { return new SuperficialAnatomy.Builder(new HashMap<String,Object>()); }
    if ("ArtGallery".equals(type)) { return new ArtGallery.Builder(new HashMap<String,Object>()); }
    if ("DownloadAction".equals(type)) { return new DownloadAction.Builder(new HashMap<String,Object>()); }
    if ("ParcelDelivery".equals(type)) { return new ParcelDelivery.Builder(new HashMap<String,Object>()); }
    if ("Language".equals(type)) { return new Language.Builder(new HashMap<String,Object>()); }
    if ("VisualArtsEvent".equals(type)) { return new VisualArtsEvent.Builder(new HashMap<String,Object>()); }
    if ("UserReview".equals(type)) { return new UserReview.Builder(new HashMap<String,Object>()); }
    if ("PodcastEpisode".equals(type)) { return new PodcastEpisode.Builder(new HashMap<String,Object>()); }
    if ("Library".equals(type)) { return new Library.Builder(new HashMap<String,Object>()); }
    if ("TrackAction".equals(type)) { return new TrackAction.Builder(new HashMap<String,Object>()); }
    if ("Nerve".equals(type)) { return new Nerve.Builder(new HashMap<String,Object>()); }
    if ("MoveAction".equals(type)) { return new MoveAction.Builder(new HashMap<String,Object>()); }
    if ("ApartmentComplex".equals(type)) { return new ApartmentComplex.Builder(new HashMap<String,Object>()); }
    if ("Locksmith".equals(type)) { return new Locksmith.Builder(new HashMap<String,Object>()); }
    if ("Pediatric".equals(type)) { return new Pediatric.Builder(new HashMap<String,Object>()); }
    if ("TelevisionChannel".equals(type)) { return new TelevisionChannel.Builder(new HashMap<String,Object>()); }
    if ("QAPage".equals(type)) { return new QAPage.Builder(new HashMap<String,Object>()); }
    if ("CompleteDataFeed".equals(type)) { return new CompleteDataFeed.Builder(new HashMap<String,Object>()); }
    if ("ProgramMembership".equals(type)) { return new ProgramMembership.Builder(new HashMap<String,Object>()); }
    if ("HowToStep".equals(type)) { return new HowToStep.Builder(new HashMap<String,Object>()); }
    if ("ControlAction".equals(type)) { return new ControlAction.Builder(new HashMap<String,Object>()); }
    if ("Mountain".equals(type)) { return new Mountain.Builder(new HashMap<String,Object>()); }
    if ("PublicationVolume".equals(type)) { return new PublicationVolume.Builder(new HashMap<String,Object>()); }
    if ("TireShop".equals(type)) { return new TireShop.Builder(new HashMap<String,Object>()); }
    if ("BroadcastEvent".equals(type)) { return new BroadcastEvent.Builder(new HashMap<String,Object>()); }
    if ("BusTrip".equals(type)) { return new BusTrip.Builder(new HashMap<String,Object>()); }
    if ("BarOrPub".equals(type)) { return new BarOrPub.Builder(new HashMap<String,Object>()); }
    if ("OfferForPurchase".equals(type)) { return new OfferForPurchase.Builder(new HashMap<String,Object>()); }
    if ("GiveAction".equals(type)) { return new GiveAction.Builder(new HashMap<String,Object>()); }
    if ("SkiResort".equals(type)) { return new SkiResort.Builder(new HashMap<String,Object>()); }
    if ("PlasticSurgery".equals(type)) { return new PlasticSurgery.Builder(new HashMap<String,Object>()); }
    if ("ScheduleAction".equals(type)) { return new ScheduleAction.Builder(new HashMap<String,Object>()); }
    if ("FoodService".equals(type)) { return new FoodService.Builder(new HashMap<String,Object>()); }
    if ("Article".equals(type)) { return new Article.Builder(new HashMap<String,Object>()); }
    if ("BookmarkAction".equals(type)) { return new BookmarkAction.Builder(new HashMap<String,Object>()); }
    if ("PlaceOfWorship".equals(type)) { return new PlaceOfWorship.Builder(new HashMap<String,Object>()); }
    if ("State".equals(type)) { return new State.Builder(new HashMap<String,Object>()); }
    if ("ProfessionalService".equals(type)) { return new ProfessionalService.Builder(new HashMap<String,Object>()); }
    if ("CompoundPriceSpecification".equals(type)) { return new CompoundPriceSpecification.Builder(new HashMap<String,Object>()); }
    if ("Distillery".equals(type)) { return new Distillery.Builder(new HashMap<String,Object>()); }
    if ("ComicCoverArt".equals(type)) { return new ComicCoverArt.Builder(new HashMap<String,Object>()); }
    if ("SiteNavigationElement".equals(type)) { return new SiteNavigationElement.Builder(new HashMap<String,Object>()); }
    if ("CookAction".equals(type)) { return new CookAction.Builder(new HashMap<String,Object>()); }
    if ("SheetMusic".equals(type)) { return new SheetMusic.Builder(new HashMap<String,Object>()); }
    if ("HowToDirection".equals(type)) { return new HowToDirection.Builder(new HashMap<String,Object>()); }
    if ("Audiobook".equals(type)) { return new Audiobook.Builder(new HashMap<String,Object>()); }
    if ("Thing".equals(type)) { return new Thing.Builder(new HashMap<String,Object>()); }
    if ("ImageObject".equals(type)) { return new ImageObject.Builder(new HashMap<String,Object>()); }
    if ("ActivateAction".equals(type)) { return new ActivateAction.Builder(new HashMap<String,Object>()); }
    if ("MortgageLoan".equals(type)) { return new MortgageLoan.Builder(new HashMap<String,Object>()); }
    if ("SportsTeam".equals(type)) { return new SportsTeam.Builder(new HashMap<String,Object>()); }
    if ("EventVenue".equals(type)) { return new EventVenue.Builder(new HashMap<String,Object>()); }
    if ("CourseInstance".equals(type)) { return new CourseInstance.Builder(new HashMap<String,Object>()); }
    if ("Optometric".equals(type)) { return new Optometric.Builder(new HashMap<String,Object>()); }
    if ("NewsArticle".equals(type)) { return new NewsArticle.Builder(new HashMap<String,Object>()); }
    if ("MonetaryAmountDistribution".equals(type)) { return new MonetaryAmountDistribution.Builder(new HashMap<String,Object>()); }
    if ("Corporation".equals(type)) { return new Corporation.Builder(new HashMap<String,Object>()); }
    if ("SportsActivityLocation".equals(type)) { return new SportsActivityLocation.Builder(new HashMap<String,Object>()); }
    if ("CssSelectorType".equals(type)) { return new CssSelectorType.Builder(new HashMap<String,Object>()); }
    if ("Airport".equals(type)) { return new Airport.Builder(new HashMap<String,Object>()); }
    if ("MedicalTherapy".equals(type)) { return new MedicalTherapy.Builder(new HashMap<String,Object>()); }
    if ("Seat".equals(type)) { return new Seat.Builder(new HashMap<String,Object>()); }
    if ("Collection".equals(type)) { return new Collection.Builder(new HashMap<String,Object>()); }
    if ("OfficeEquipmentStore".equals(type)) { return new OfficeEquipmentStore.Builder(new HashMap<String,Object>()); }
    if ("MedicalSignOrSymptom".equals(type)) { return new MedicalSignOrSymptom.Builder(new HashMap<String,Object>()); }
    if ("MedicalTest".equals(type)) { return new MedicalTest.Builder(new HashMap<String,Object>()); }
    if ("PaymentService".equals(type)) { return new PaymentService.Builder(new HashMap<String,Object>()); }
    if ("DepositAccount".equals(type)) { return new DepositAccount.Builder(new HashMap<String,Object>()); }
    if ("MonetaryAmount".equals(type)) { return new MonetaryAmount.Builder(new HashMap<String,Object>()); }
    if ("ArriveAction".equals(type)) { return new ArriveAction.Builder(new HashMap<String,Object>()); }
    if ("Code".equals(type)) { return new Code.Builder(new HashMap<String,Object>()); }
    if ("OwnershipInfo".equals(type)) { return new OwnershipInfo.Builder(new HashMap<String,Object>()); }
    if ("MediaReview".equals(type)) { return new MediaReview.Builder(new HashMap<String,Object>()); }
    if ("AmusementPark".equals(type)) { return new AmusementPark.Builder(new HashMap<String,Object>()); }
    if ("Accommodation".equals(type)) { return new Accommodation.Builder(new HashMap<String,Object>()); }
    if ("RealEstateListing".equals(type)) { return new RealEstateListing.Builder(new HashMap<String,Object>()); }
    if ("QuantitativeValueDistribution".equals(type)) { return new QuantitativeValueDistribution.Builder(new HashMap<String,Object>()); }
    if ("Restaurant".equals(type)) { return new Restaurant.Builder(new HashMap<String,Object>()); }
    if ("MedicalClinic".equals(type)) { return new MedicalClinic.Builder(new HashMap<String,Object>()); }
    if ("SpeakableSpecification".equals(type)) { return new SpeakableSpecification.Builder(new HashMap<String,Object>()); }
    if ("RadioSeries".equals(type)) { return new RadioSeries.Builder(new HashMap<String,Object>()); }
    if ("Newspaper".equals(type)) { return new Newspaper.Builder(new HashMap<String,Object>()); }
    if ("MovieTheater".equals(type)) { return new MovieTheater.Builder(new HashMap<String,Object>()); }
    if ("ConvenienceStore".equals(type)) { return new ConvenienceStore.Builder(new HashMap<String,Object>()); }
    if ("Reservoir".equals(type)) { return new Reservoir.Builder(new HashMap<String,Object>()); }
    if ("OrganizeAction".equals(type)) { return new OrganizeAction.Builder(new HashMap<String,Object>()); }
    if ("Atlas".equals(type)) { return new Atlas.Builder(new HashMap<String,Object>()); }
    if ("Ticket".equals(type)) { return new Ticket.Builder(new HashMap<String,Object>()); }
    if ("DepartAction".equals(type)) { return new DepartAction.Builder(new HashMap<String,Object>()); }
    if ("HardwareStore".equals(type)) { return new HardwareStore.Builder(new HashMap<String,Object>()); }
    if ("CarUsageType".equals(type)) { return new CarUsageType.Builder(new HashMap<String,Object>()); }
    if ("SocialMediaPosting".equals(type)) { return new SocialMediaPosting.Builder(new HashMap<String,Object>()); }
    if ("Thesis".equals(type)) { return new Thesis.Builder(new HashMap<String,Object>()); }
    if ("PresentationDigitalDocument".equals(type)) { return new PresentationDigitalDocument.Builder(new HashMap<String,Object>()); }
    if ("SendAction".equals(type)) { return new SendAction.Builder(new HashMap<String,Object>()); }
    if ("DiscussionForumPosting".equals(type)) { return new DiscussionForumPosting.Builder(new HashMap<String,Object>()); }
    if ("OnDemandEvent".equals(type)) { return new OnDemandEvent.Builder(new HashMap<String,Object>()); }
    if ("BrokerageAccount".equals(type)) { return new BrokerageAccount.Builder(new HashMap<String,Object>()); }
    if ("MedicalDevice".equals(type)) { return new MedicalDevice.Builder(new HashMap<String,Object>()); }
    if ("BloodTest".equals(type)) { return new BloodTest.Builder(new HashMap<String,Object>()); }
    if ("Pharmacy".equals(type)) { return new Pharmacy.Builder(new HashMap<String,Object>()); }
    if ("MovieSeries".equals(type)) { return new MovieSeries.Builder(new HashMap<String,Object>()); }
    if ("DigitalDocument".equals(type)) { return new DigitalDocument.Builder(new HashMap<String,Object>()); }
    if ("CategoryCode".equals(type)) { return new CategoryCode.Builder(new HashMap<String,Object>()); }
    if ("RegisterAction".equals(type)) { return new RegisterAction.Builder(new HashMap<String,Object>()); }
    if ("DoseSchedule".equals(type)) { return new DoseSchedule.Builder(new HashMap<String,Object>()); }
    if ("LandmarksOrHistoricalBuildings".equals(type)) { return new LandmarksOrHistoricalBuildings.Builder(new HashMap<String,Object>()); }
    if ("ExhibitionEvent".equals(type)) { return new ExhibitionEvent.Builder(new HashMap<String,Object>()); }
    if ("WebPage".equals(type)) { return new WebPage.Builder(new HashMap<String,Object>()); }
    if ("EndorsementRating".equals(type)) { return new EndorsementRating.Builder(new HashMap<String,Object>()); }
    if ("ListItem".equals(type)) { return new ListItem.Builder(new HashMap<String,Object>()); }
    if ("RsvpAction".equals(type)) { return new RsvpAction.Builder(new HashMap<String,Object>()); }
    if ("AnimalShelter".equals(type)) { return new AnimalShelter.Builder(new HashMap<String,Object>()); }
    if ("Crematorium".equals(type)) { return new Crematorium.Builder(new HashMap<String,Object>()); }
    if ("GeospatialGeometry".equals(type)) { return new GeospatialGeometry.Builder(new HashMap<String,Object>()); }
    if ("UserCheckins".equals(type)) { return new UserCheckins.Builder(new HashMap<String,Object>()); }
    if ("HowToSection".equals(type)) { return new HowToSection.Builder(new HashMap<String,Object>()); }
    if ("WebPageElement".equals(type)) { return new WebPageElement.Builder(new HashMap<String,Object>()); }
    if ("MonetaryGrant".equals(type)) { return new MonetaryGrant.Builder(new HashMap<String,Object>()); }
    if ("CommunityHealth".equals(type)) { return new CommunityHealth.Builder(new HashMap<String,Object>()); }
    if ("ReserveAction".equals(type)) { return new ReserveAction.Builder(new HashMap<String,Object>()); }
    if ("DefinedTermSet".equals(type)) { return new DefinedTermSet.Builder(new HashMap<String,Object>()); }
    if ("MovieClip".equals(type)) { return new MovieClip.Builder(new HashMap<String,Object>()); }
    if ("OrderAction".equals(type)) { return new OrderAction.Builder(new HashMap<String,Object>()); }
    if ("DiscoverAction".equals(type)) { return new DiscoverAction.Builder(new HashMap<String,Object>()); }
    if ("ContactPage".equals(type)) { return new ContactPage.Builder(new HashMap<String,Object>()); }
    if ("AllocateAction".equals(type)) { return new AllocateAction.Builder(new HashMap<String,Object>()); }
    if ("Manuscript".equals(type)) { return new Manuscript.Builder(new HashMap<String,Object>()); }
    if ("Country".equals(type)) { return new Country.Builder(new HashMap<String,Object>()); }
    if ("AutoBodyShop".equals(type)) { return new AutoBodyShop.Builder(new HashMap<String,Object>()); }
    if ("DataCatalog".equals(type)) { return new DataCatalog.Builder(new HashMap<String,Object>()); }
    if ("OrderItem".equals(type)) { return new OrderItem.Builder(new HashMap<String,Object>()); }
    if ("StructuredValue".equals(type)) { return new StructuredValue.Builder(new HashMap<String,Object>()); }
    if ("InvestmentOrDeposit".equals(type)) { return new InvestmentOrDeposit.Builder(new HashMap<String,Object>()); }
    if ("HealthPlanFormulary".equals(type)) { return new HealthPlanFormulary.Builder(new HashMap<String,Object>()); }
    if ("DefinedTerm".equals(type)) { return new DefinedTerm.Builder(new HashMap<String,Object>()); }
    if ("Landform".equals(type)) { return new Landform.Builder(new HashMap<String,Object>()); }
    if ("CreativeWorkSeries".equals(type)) { return new CreativeWorkSeries.Builder(new HashMap<String,Object>()); }
    if ("SoftwareApplication".equals(type)) { return new SoftwareApplication.Builder(new HashMap<String,Object>()); }
    if ("CatholicChurch".equals(type)) { return new CatholicChurch.Builder(new HashMap<String,Object>()); }
    if ("AuthorizeAction".equals(type)) { return new AuthorizeAction.Builder(new HashMap<String,Object>()); }
    if ("TVSeason".equals(type)) { return new TVSeason.Builder(new HashMap<String,Object>()); }
    if ("WinAction".equals(type)) { return new WinAction.Builder(new HashMap<String,Object>()); }
    if ("Vein".equals(type)) { return new Vein.Builder(new HashMap<String,Object>()); }
    if ("Observation".equals(type)) { return new Observation.Builder(new HashMap<String,Object>()); }
    if ("ExchangeRateSpecification".equals(type)) { return new ExchangeRateSpecification.Builder(new HashMap<String,Object>()); }
    if ("EntertainmentBusiness".equals(type)) { return new EntertainmentBusiness.Builder(new HashMap<String,Object>()); }
    if ("Episode".equals(type)) { return new Episode.Builder(new HashMap<String,Object>()); }
    if ("MedicalRiskScore".equals(type)) { return new MedicalRiskScore.Builder(new HashMap<String,Object>()); }
    if ("EmployerReview".equals(type)) { return new EmployerReview.Builder(new HashMap<String,Object>()); }
    if ("GatedResidenceCommunity".equals(type)) { return new GatedResidenceCommunity.Builder(new HashMap<String,Object>()); }
    if ("HobbyShop".equals(type)) { return new HobbyShop.Builder(new HashMap<String,Object>()); }
    if ("AdultEntertainment".equals(type)) { return new AdultEntertainment.Builder(new HashMap<String,Object>()); }
    if ("CheckOutAction".equals(type)) { return new CheckOutAction.Builder(new HashMap<String,Object>()); }
    if ("RespiratoryTherapy".equals(type)) { return new RespiratoryTherapy.Builder(new HashMap<String,Object>()); }
    if ("VideoGallery".equals(type)) { return new VideoGallery.Builder(new HashMap<String,Object>()); }
    if ("ParkingFacility".equals(type)) { return new ParkingFacility.Builder(new HashMap<String,Object>()); }
    if ("AutomotiveBusiness".equals(type)) { return new AutomotiveBusiness.Builder(new HashMap<String,Object>()); }
    if ("NGO".equals(type)) { return new NGO.Builder(new HashMap<String,Object>()); }
    if ("HealthInsurancePlan".equals(type)) { return new HealthInsurancePlan.Builder(new HashMap<String,Object>()); }
    if ("RadioEpisode".equals(type)) { return new RadioEpisode.Builder(new HashMap<String,Object>()); }
    if ("TouristInformationCenter".equals(type)) { return new TouristInformationCenter.Builder(new HashMap<String,Object>()); }
    if ("RadioStation".equals(type)) { return new RadioStation.Builder(new HashMap<String,Object>()); }
    if ("Game".equals(type)) { return new Game.Builder(new HashMap<String,Object>()); }
    if ("Diet".equals(type)) { return new Diet.Builder(new HashMap<String,Object>()); }
    if ("Grant".equals(type)) { return new Grant.Builder(new HashMap<String,Object>()); }
    if ("Beach".equals(type)) { return new Beach.Builder(new HashMap<String,Object>()); }
    if ("UserBlocks".equals(type)) { return new UserBlocks.Builder(new HashMap<String,Object>()); }
    if ("Photograph".equals(type)) { return new Photograph.Builder(new HashMap<String,Object>()); }
    if ("EducationalAudience".equals(type)) { return new EducationalAudience.Builder(new HashMap<String,Object>()); }
    if ("Vehicle".equals(type)) { return new Vehicle.Builder(new HashMap<String,Object>()); }
    if ("RepaymentSpecification".equals(type)) { return new RepaymentSpecification.Builder(new HashMap<String,Object>()); }
    if ("EmergencyService".equals(type)) { return new EmergencyService.Builder(new HashMap<String,Object>()); }
    if ("BefriendAction".equals(type)) { return new BefriendAction.Builder(new HashMap<String,Object>()); }
    if ("NewsMediaOrganization".equals(type)) { return new NewsMediaOrganization.Builder(new HashMap<String,Object>()); }
    if ("CDCPMDRecord".equals(type)) { return new CDCPMDRecord.Builder(new HashMap<String,Object>()); }
    if ("AddAction".equals(type)) { return new AddAction.Builder(new HashMap<String,Object>()); }
    if ("HomeAndConstructionBusiness".equals(type)) { return new HomeAndConstructionBusiness.Builder(new HashMap<String,Object>()); }
    if ("WarrantyPromise".equals(type)) { return new WarrantyPromise.Builder(new HashMap<String,Object>()); }
    if ("ComicIssue".equals(type)) { return new ComicIssue.Builder(new HashMap<String,Object>()); }
    if ("ProfilePage".equals(type)) { return new ProfilePage.Builder(new HashMap<String,Object>()); }
    if ("DeliveryChargeSpecification".equals(type)) { return new DeliveryChargeSpecification.Builder(new HashMap<String,Object>()); }
    if ("MusicRecording".equals(type)) { return new MusicRecording.Builder(new HashMap<String,Object>()); }
    if ("HealthClub".equals(type)) { return new HealthClub.Builder(new HashMap<String,Object>()); }
    if ("Attorney".equals(type)) { return new Attorney.Builder(new HashMap<String,Object>()); }
    if ("ArchiveComponent".equals(type)) { return new ArchiveComponent.Builder(new HashMap<String,Object>()); }
    if ("StadiumOrArena".equals(type)) { return new StadiumOrArena.Builder(new HashMap<String,Object>()); }
    if ("EatAction".equals(type)) { return new EatAction.Builder(new HashMap<String,Object>()); }
    if ("Map".equals(type)) { return new Map.Builder(new HashMap<String,Object>()); }
    if ("MotorizedBicycle".equals(type)) { return new MotorizedBicycle.Builder(new HashMap<String,Object>()); }
    if ("FlightReservation".equals(type)) { return new FlightReservation.Builder(new HashMap<String,Object>()); }
    if ("Season".equals(type)) { return new Season.Builder(new HashMap<String,Object>()); }
    if ("LinkRole".equals(type)) { return new LinkRole.Builder(new HashMap<String,Object>()); }
    if ("PublicationIssue".equals(type)) { return new PublicationIssue.Builder(new HashMap<String,Object>()); }
    if ("PreventionIndication".equals(type)) { return new PreventionIndication.Builder(new HashMap<String,Object>()); }
    if ("ShoeStore".equals(type)) { return new ShoeStore.Builder(new HashMap<String,Object>()); }
    if ("SocialEvent".equals(type)) { return new SocialEvent.Builder(new HashMap<String,Object>()); }
    if ("PawnShop".equals(type)) { return new PawnShop.Builder(new HashMap<String,Object>()); }
    if ("Event".equals(type)) { return new Event.Builder(new HashMap<String,Object>()); }
    if ("CovidTestingFacility".equals(type)) { return new CovidTestingFacility.Builder(new HashMap<String,Object>()); }
    if ("BodyOfWater".equals(type)) { return new BodyOfWater.Builder(new HashMap<String,Object>()); }
    if ("ProductModel".equals(type)) { return new ProductModel.Builder(new HashMap<String,Object>()); }
    if ("MusicEvent".equals(type)) { return new MusicEvent.Builder(new HashMap<String,Object>()); }
    if ("BroadcastChannel".equals(type)) { return new BroadcastChannel.Builder(new HashMap<String,Object>()); }
    if ("DataFeed".equals(type)) { return new DataFeed.Builder(new HashMap<String,Object>()); }
    if ("LoseAction".equals(type)) { return new LoseAction.Builder(new HashMap<String,Object>()); }
    if ("CreditCard".equals(type)) { return new CreditCard.Builder(new HashMap<String,Object>()); }
    if ("DataDownload".equals(type)) { return new DataDownload.Builder(new HashMap<String,Object>()); }
    if ("ReactAction".equals(type)) { return new ReactAction.Builder(new HashMap<String,Object>()); }
    if ("XPathType".equals(type)) { return new XPathType.Builder(new HashMap<String,Object>()); }
    if ("Hotel".equals(type)) { return new Hotel.Builder(new HashMap<String,Object>()); }
    if ("Optician".equals(type)) { return new Optician.Builder(new HashMap<String,Object>()); }
    if ("ResumeAction".equals(type)) { return new ResumeAction.Builder(new HashMap<String,Object>()); }
    if ("DepartmentStore".equals(type)) { return new DepartmentStore.Builder(new HashMap<String,Object>()); }
    if ("PhysicalTherapy".equals(type)) { return new PhysicalTherapy.Builder(new HashMap<String,Object>()); }
    if ("OceanBodyOfWater".equals(type)) { return new OceanBodyOfWater.Builder(new HashMap<String,Object>()); }
    if ("Play".equals(type)) { return new Play.Builder(new HashMap<String,Object>()); }
    if ("CategoryCodeSet".equals(type)) { return new CategoryCodeSet.Builder(new HashMap<String,Object>()); }
    if ("BowlingAlley".equals(type)) { return new BowlingAlley.Builder(new HashMap<String,Object>()); }
    if ("BrainStructure".equals(type)) { return new BrainStructure.Builder(new HashMap<String,Object>()); }
    if ("Aquarium".equals(type)) { return new Aquarium.Builder(new HashMap<String,Object>()); }
    if ("PetStore".equals(type)) { return new PetStore.Builder(new HashMap<String,Object>()); }
    if ("DeleteAction".equals(type)) { return new DeleteAction.Builder(new HashMap<String,Object>()); }
    if ("FloorPlan".equals(type)) { return new FloorPlan.Builder(new HashMap<String,Object>()); }
    if ("Bone".equals(type)) { return new Bone.Builder(new HashMap<String,Object>()); }
    if ("Energy".equals(type)) { return new Energy.Builder(new HashMap<String,Object>()); }
    if ("School".equals(type)) { return new School.Builder(new HashMap<String,Object>()); }
    if ("BroadcastFrequencySpecification".equals(type)) { return new BroadcastFrequencySpecification.Builder(new HashMap<String,Object>()); }
    if ("MedicalIndication".equals(type)) { return new MedicalIndication.Builder(new HashMap<String,Object>()); }
    if ("Book".equals(type)) { return new Book.Builder(new HashMap<String,Object>()); }
    if ("ChooseAction".equals(type)) { return new ChooseAction.Builder(new HashMap<String,Object>()); }
    if ("AutoDealer".equals(type)) { return new AutoDealer.Builder(new HashMap<String,Object>()); }
    if ("WebApplication".equals(type)) { return new WebApplication.Builder(new HashMap<String,Object>()); }
    if ("LiteraryEvent".equals(type)) { return new LiteraryEvent.Builder(new HashMap<String,Object>()); }
    if ("GroceryStore".equals(type)) { return new GroceryStore.Builder(new HashMap<String,Object>()); }
    if ("NailSalon".equals(type)) { return new NailSalon.Builder(new HashMap<String,Object>()); }
    if ("MedicalAudience".equals(type)) { return new MedicalAudience.Builder(new HashMap<String,Object>()); }
    if ("FilmAction".equals(type)) { return new FilmAction.Builder(new HashMap<String,Object>()); }
    if ("AchieveAction".equals(type)) { return new AchieveAction.Builder(new HashMap<String,Object>()); }
    if ("ApplyAction".equals(type)) { return new ApplyAction.Builder(new HashMap<String,Object>()); }
    if ("Canal".equals(type)) { return new Canal.Builder(new HashMap<String,Object>()); }
    if ("Residence".equals(type)) { return new Residence.Builder(new HashMap<String,Object>()); }
    if ("Legislation".equals(type)) { return new Legislation.Builder(new HashMap<String,Object>()); }
    if ("HealthPlanCostSharingSpecification".equals(type)) { return new HealthPlanCostSharingSpecification.Builder(new HashMap<String,Object>()); }
    if ("City".equals(type)) { return new City.Builder(new HashMap<String,Object>()); }
    if ("UserPageVisits".equals(type)) { return new UserPageVisits.Builder(new HashMap<String,Object>()); }
    if ("ShareAction".equals(type)) { return new ShareAction.Builder(new HashMap<String,Object>()); }
    if ("Store".equals(type)) { return new Store.Builder(new HashMap<String,Object>()); }
    if ("GovernmentOrganization".equals(type)) { return new GovernmentOrganization.Builder(new HashMap<String,Object>()); }
    if ("EmployerAggregateRating".equals(type)) { return new EmployerAggregateRating.Builder(new HashMap<String,Object>()); }
    if ("MedicalEntity".equals(type)) { return new MedicalEntity.Builder(new HashMap<String,Object>()); }
    if ("LodgingReservation".equals(type)) { return new LodgingReservation.Builder(new HashMap<String,Object>()); }
    if ("Joint".equals(type)) { return new Joint.Builder(new HashMap<String,Object>()); }
    if ("EntryPoint".equals(type)) { return new EntryPoint.Builder(new HashMap<String,Object>()); }
    if ("VisualArtwork".equals(type)) { return new VisualArtwork.Builder(new HashMap<String,Object>()); }
    if ("PayAction".equals(type)) { return new PayAction.Builder(new HashMap<String,Object>()); }
    if ("ChildrensEvent".equals(type)) { return new ChildrensEvent.Builder(new HashMap<String,Object>()); }
    if ("OfferCatalog".equals(type)) { return new OfferCatalog.Builder(new HashMap<String,Object>()); }
    if ("MusicVenue".equals(type)) { return new MusicVenue.Builder(new HashMap<String,Object>()); }
    if ("MerchantReturnPolicy".equals(type)) { return new MerchantReturnPolicy.Builder(new HashMap<String,Object>()); }
    if ("AgreeAction".equals(type)) { return new AgreeAction.Builder(new HashMap<String,Object>()); }
    if ("CurrencyConversionService".equals(type)) { return new CurrencyConversionService.Builder(new HashMap<String,Object>()); }
    if ("ChildCare".equals(type)) { return new ChildCare.Builder(new HashMap<String,Object>()); }
    if ("CriticReview".equals(type)) { return new CriticReview.Builder(new HashMap<String,Object>()); }
    if ("FMRadioChannel".equals(type)) { return new FMRadioChannel.Builder(new HashMap<String,Object>()); }
    if ("DietNutrition".equals(type)) { return new DietNutrition.Builder(new HashMap<String,Object>()); }
    if ("BedType".equals(type)) { return new BedType.Builder(new HashMap<String,Object>()); }
    if ("CheckoutPage".equals(type)) { return new CheckoutPage.Builder(new HashMap<String,Object>()); }
    if ("Brewery".equals(type)) { return new Brewery.Builder(new HashMap<String,Object>()); }
    if ("Zoo".equals(type)) { return new Zoo.Builder(new HashMap<String,Object>()); }
    if ("ComicStory".equals(type)) { return new ComicStory.Builder(new HashMap<String,Object>()); }
    if ("SportsEvent".equals(type)) { return new SportsEvent.Builder(new HashMap<String,Object>()); }
    if ("ReplaceAction".equals(type)) { return new ReplaceAction.Builder(new HashMap<String,Object>()); }
    if ("MedicalConditionStage".equals(type)) { return new MedicalConditionStage.Builder(new HashMap<String,Object>()); }
    if ("Motorcycle".equals(type)) { return new Motorcycle.Builder(new HashMap<String,Object>()); }
    if ("BankAccount".equals(type)) { return new BankAccount.Builder(new HashMap<String,Object>()); }
    if ("ReadAction".equals(type)) { return new ReadAction.Builder(new HashMap<String,Object>()); }
    if ("MusicComposition".equals(type)) { return new MusicComposition.Builder(new HashMap<String,Object>()); }
    if ("MedicalScholarlyArticle".equals(type)) { return new MedicalScholarlyArticle.Builder(new HashMap<String,Object>()); }
    if ("House".equals(type)) { return new House.Builder(new HashMap<String,Object>()); }
    if ("MedicalTestPanel".equals(type)) { return new MedicalTestPanel.Builder(new HashMap<String,Object>()); }
    if ("SearchAction".equals(type)) { return new SearchAction.Builder(new HashMap<String,Object>()); }
    if ("RoofingContractor".equals(type)) { return new RoofingContractor.Builder(new HashMap<String,Object>()); }
    if ("WebAPI".equals(type)) { return new WebAPI.Builder(new HashMap<String,Object>()); }
    if ("Order".equals(type)) { return new Order.Builder(new HashMap<String,Object>()); }
    if ("Embassy".equals(type)) { return new Embassy.Builder(new HashMap<String,Object>()); }
    if ("Schedule".equals(type)) { return new Schedule.Builder(new HashMap<String,Object>()); }
    if ("BusOrCoach".equals(type)) { return new BusOrCoach.Builder(new HashMap<String,Object>()); }
    if ("SportingGoodsStore".equals(type)) { return new SportingGoodsStore.Builder(new HashMap<String,Object>()); }
    if ("TravelAction".equals(type)) { return new TravelAction.Builder(new HashMap<String,Object>()); }
    if ("HotelRoom".equals(type)) { return new HotelRoom.Builder(new HashMap<String,Object>()); }
    if ("MedicalRiskEstimator".equals(type)) { return new MedicalRiskEstimator.Builder(new HashMap<String,Object>()); }
    if ("WPHeader".equals(type)) { return new WPHeader.Builder(new HashMap<String,Object>()); }
    if ("BusinessAudience".equals(type)) { return new BusinessAudience.Builder(new HashMap<String,Object>()); }
    if ("Hackathon".equals(type)) { return new Hackathon.Builder(new HashMap<String,Object>()); }
    if ("JobPosting".equals(type)) { return new JobPosting.Builder(new HashMap<String,Object>()); }
    if ("Motel".equals(type)) { return new Motel.Builder(new HashMap<String,Object>()); }
    if ("SportsOrganization".equals(type)) { return new SportsOrganization.Builder(new HashMap<String,Object>()); }
    if ("DeactivateAction".equals(type)) { return new DeactivateAction.Builder(new HashMap<String,Object>()); }
    if ("UserLikes".equals(type)) { return new UserLikes.Builder(new HashMap<String,Object>()); }
    if ("ParentAudience".equals(type)) { return new ParentAudience.Builder(new HashMap<String,Object>()); }
    if ("Recommendation".equals(type)) { return new Recommendation.Builder(new HashMap<String,Object>()); }
    if ("RadiationTherapy".equals(type)) { return new RadiationTherapy.Builder(new HashMap<String,Object>()); }
    if ("PreOrderAction".equals(type)) { return new PreOrderAction.Builder(new HashMap<String,Object>()); }
    if ("HighSchool".equals(type)) { return new HighSchool.Builder(new HashMap<String,Object>()); }
    if ("DonateAction".equals(type)) { return new DonateAction.Builder(new HashMap<String,Object>()); }
    if ("Distance".equals(type)) { return new Distance.Builder(new HashMap<String,Object>()); }
    if ("GolfCourse".equals(type)) { return new GolfCourse.Builder(new HashMap<String,Object>()); }
    if ("Quotation".equals(type)) { return new Quotation.Builder(new HashMap<String,Object>()); }
    if ("MobilePhoneStore".equals(type)) { return new MobilePhoneStore.Builder(new HashMap<String,Object>()); }
    if ("SomeProducts".equals(type)) { return new SomeProducts.Builder(new HashMap<String,Object>()); }
    if ("ContactPoint".equals(type)) { return new ContactPoint.Builder(new HashMap<String,Object>()); }
    if ("SportsClub".equals(type)) { return new SportsClub.Builder(new HashMap<String,Object>()); }
    if ("HealthPlanNetwork".equals(type)) { return new HealthPlanNetwork.Builder(new HashMap<String,Object>()); }
    if ("PerformAction".equals(type)) { return new PerformAction.Builder(new HashMap<String,Object>()); }
    if ("DanceGroup".equals(type)) { return new DanceGroup.Builder(new HashMap<String,Object>()); }
    if ("LegislativeBuilding".equals(type)) { return new LegislativeBuilding.Builder(new HashMap<String,Object>()); }
    if ("Course".equals(type)) { return new Course.Builder(new HashMap<String,Object>()); }
    if ("Occupation".equals(type)) { return new Occupation.Builder(new HashMap<String,Object>()); }
    if ("Claim".equals(type)) { return new Claim.Builder(new HashMap<String,Object>()); }
    if ("FundingAgency".equals(type)) { return new FundingAgency.Builder(new HashMap<String,Object>()); }
    if ("InformAction".equals(type)) { return new InformAction.Builder(new HashMap<String,Object>()); }
    if ("EducationEvent".equals(type)) { return new EducationEvent.Builder(new HashMap<String,Object>()); }
    if ("FireStation".equals(type)) { return new FireStation.Builder(new HashMap<String,Object>()); }
    if ("EngineSpecification".equals(type)) { return new EngineSpecification.Builder(new HashMap<String,Object>()); }
    if ("Oncologic".equals(type)) { return new Oncologic.Builder(new HashMap<String,Object>()); }
    if ("Flight".equals(type)) { return new Flight.Builder(new HashMap<String,Object>()); }
    if ("Intangible".equals(type)) { return new Intangible.Builder(new HashMap<String,Object>()); }
    if ("WorkersUnion".equals(type)) { return new WorkersUnion.Builder(new HashMap<String,Object>()); }
    if ("ReplyAction".equals(type)) { return new ReplyAction.Builder(new HashMap<String,Object>()); }
    if ("SubscribeAction".equals(type)) { return new SubscribeAction.Builder(new HashMap<String,Object>()); }
    if ("Physician".equals(type)) { return new Physician.Builder(new HashMap<String,Object>()); }
    if ("APIReference".equals(type)) { return new APIReference.Builder(new HashMap<String,Object>()); }
    if ("Property".equals(type)) { return new Property.Builder(new HashMap<String,Object>()); }
    if ("MedicalSymptom".equals(type)) { return new MedicalSymptom.Builder(new HashMap<String,Object>()); }
    if ("EmailMessage".equals(type)) { return new EmailMessage.Builder(new HashMap<String,Object>()); }
    if ("Suite".equals(type)) { return new Suite.Builder(new HashMap<String,Object>()); }
    if ("PropertyValueSpecification".equals(type)) { return new PropertyValueSpecification.Builder(new HashMap<String,Object>()); }
    if ("PronounceableText".equals(type)) { return new PronounceableText.Builder(new HashMap<String,Object>()); }
    if ("ScreeningEvent".equals(type)) { return new ScreeningEvent.Builder(new HashMap<String,Object>()); }
    if ("Drawing".equals(type)) { return new Drawing.Builder(new HashMap<String,Object>()); }
    if ("MedicalGuideline".equals(type)) { return new MedicalGuideline.Builder(new HashMap<String,Object>()); }
    if ("OutletStore".equals(type)) { return new OutletStore.Builder(new HashMap<String,Object>()); }
    if ("OccupationalTherapy".equals(type)) { return new OccupationalTherapy.Builder(new HashMap<String,Object>()); }
    if ("WatchAction".equals(type)) { return new WatchAction.Builder(new HashMap<String,Object>()); }
    if ("IgnoreAction".equals(type)) { return new IgnoreAction.Builder(new HashMap<String,Object>()); }
    if ("MedicalCause".equals(type)) { return new MedicalCause.Builder(new HashMap<String,Object>()); }
    if ("MedicalObservationalStudy".equals(type)) { return new MedicalObservationalStudy.Builder(new HashMap<String,Object>()); }
    if ("Muscle".equals(type)) { return new Muscle.Builder(new HashMap<String,Object>()); }
    if ("UnitPriceSpecification".equals(type)) { return new UnitPriceSpecification.Builder(new HashMap<String,Object>()); }
    if ("MedicalProcedure".equals(type)) { return new MedicalProcedure.Builder(new HashMap<String,Object>()); }
    if ("AnalysisNewsArticle".equals(type)) { return new AnalysisNewsArticle.Builder(new HashMap<String,Object>()); }
    if ("Series".equals(type)) { return new Series.Builder(new HashMap<String,Object>()); }
    if ("CorrectionComment".equals(type)) { return new CorrectionComment.Builder(new HashMap<String,Object>()); }
    if ("DriveWheelConfigurationValue".equals(type)) { return new DriveWheelConfigurationValue.Builder(new HashMap<String,Object>()); }
    if ("Hostel".equals(type)) { return new Hostel.Builder(new HashMap<String,Object>()); }
    if ("VeterinaryCare".equals(type)) { return new VeterinaryCare.Builder(new HashMap<String,Object>()); }
    if ("WPAdBlock".equals(type)) { return new WPAdBlock.Builder(new HashMap<String,Object>()); }
    if ("ScholarlyArticle".equals(type)) { return new ScholarlyArticle.Builder(new HashMap<String,Object>()); }
    if ("BikeStore".equals(type)) { return new BikeStore.Builder(new HashMap<String,Object>()); }
    if ("NightClub".equals(type)) { return new NightClub.Builder(new HashMap<String,Object>()); }
    if ("Pond".equals(type)) { return new Pond.Builder(new HashMap<String,Object>()); }
    if ("TVSeries".equals(type)) { return new TVSeries.Builder(new HashMap<String,Object>()); }
    if ("CreativeWorkSeason".equals(type)) { return new CreativeWorkSeason.Builder(new HashMap<String,Object>()); }
    if ("BankOrCreditUnion".equals(type)) { return new BankOrCreditUnion.Builder(new HashMap<String,Object>()); }
    if ("RealEstateAgent".equals(type)) { return new RealEstateAgent.Builder(new HashMap<String,Object>()); }
    if ("ElectronicsStore".equals(type)) { return new ElectronicsStore.Builder(new HashMap<String,Object>()); }
    if ("HealthAndBeautyBusiness".equals(type)) { return new HealthAndBeautyBusiness.Builder(new HashMap<String,Object>()); }
    if ("Nursing".equals(type)) { return new Nursing.Builder(new HashMap<String,Object>()); }
    if ("Researcher".equals(type)) { return new Researcher.Builder(new HashMap<String,Object>()); }
    if ("VoteAction".equals(type)) { return new VoteAction.Builder(new HashMap<String,Object>()); }
    if ("RadioClip".equals(type)) { return new RadioClip.Builder(new HashMap<String,Object>()); }
    if ("VideoObject".equals(type)) { return new VideoObject.Builder(new HashMap<String,Object>()); }
    if ("Permit".equals(type)) { return new Permit.Builder(new HashMap<String,Object>()); }
    if ("Comment".equals(type)) { return new Comment.Builder(new HashMap<String,Object>()); }
    if ("GeoCircle".equals(type)) { return new GeoCircle.Builder(new HashMap<String,Object>()); }
    if ("HowToSupply".equals(type)) { return new HowToSupply.Builder(new HashMap<String,Object>()); }
    if ("DeliveryEvent".equals(type)) { return new DeliveryEvent.Builder(new HashMap<String,Object>()); }
    if ("FindAction".equals(type)) { return new FindAction.Builder(new HashMap<String,Object>()); }
    if ("BeautySalon".equals(type)) { return new BeautySalon.Builder(new HashMap<String,Object>()); }
    if ("BedAndBreakfast".equals(type)) { return new BedAndBreakfast.Builder(new HashMap<String,Object>()); }
    if ("AboutPage".equals(type)) { return new AboutPage.Builder(new HashMap<String,Object>()); }
    if ("VirtualLocation".equals(type)) { return new VirtualLocation.Builder(new HashMap<String,Object>()); }
    if ("MiddleSchool".equals(type)) { return new MiddleSchool.Builder(new HashMap<String,Object>()); }
    if ("Organization".equals(type)) { return new Organization.Builder(new HashMap<String,Object>()); }
    if ("Synagogue".equals(type)) { return new Synagogue.Builder(new HashMap<String,Object>()); }
    if ("AutomatedTeller".equals(type)) { return new AutomatedTeller.Builder(new HashMap<String,Object>()); }
    if ("DataFeedItem".equals(type)) { return new DataFeedItem.Builder(new HashMap<String,Object>()); }
    if ("QualitativeValue".equals(type)) { return new QualitativeValue.Builder(new HashMap<String,Object>()); }
    if ("Otolaryngologic".equals(type)) { return new Otolaryngologic.Builder(new HashMap<String,Object>()); }
    if ("AggregateRating".equals(type)) { return new AggregateRating.Builder(new HashMap<String,Object>()); }
    if ("WebContent".equals(type)) { return new WebContent.Builder(new HashMap<String,Object>()); }
    if ("AlignmentObject".equals(type)) { return new AlignmentObject.Builder(new HashMap<String,Object>()); }
    if ("PerformingArtsTheater".equals(type)) { return new PerformingArtsTheater.Builder(new HashMap<String,Object>()); }
    if ("RentalCarReservation".equals(type)) { return new RentalCarReservation.Builder(new HashMap<String,Object>()); }
    if ("MotorcycleRepair".equals(type)) { return new MotorcycleRepair.Builder(new HashMap<String,Object>()); }
    if ("ElementarySchool".equals(type)) { return new ElementarySchool.Builder(new HashMap<String,Object>()); }
    if ("SearchResultsPage".equals(type)) { return new SearchResultsPage.Builder(new HashMap<String,Object>()); }
    if ("Winery".equals(type)) { return new Winery.Builder(new HashMap<String,Object>()); }
    if ("AggregateOffer".equals(type)) { return new AggregateOffer.Builder(new HashMap<String,Object>()); }
    if ("ArchiveOrganization".equals(type)) { return new ArchiveOrganization.Builder(new HashMap<String,Object>()); }
    if ("Action".equals(type)) { return new Action.Builder(new HashMap<String,Object>()); }
    if ("DrawAction".equals(type)) { return new DrawAction.Builder(new HashMap<String,Object>()); }
    if ("DislikeAction".equals(type)) { return new DislikeAction.Builder(new HashMap<String,Object>()); }
    if ("Vessel".equals(type)) { return new Vessel.Builder(new HashMap<String,Object>()); }
    if ("Bridge".equals(type)) { return new Bridge.Builder(new HashMap<String,Object>()); }
    if ("ImagingTest".equals(type)) { return new ImagingTest.Builder(new HashMap<String,Object>()); }
    if ("Mass".equals(type)) { return new Mass.Builder(new HashMap<String,Object>()); }
    if ("LegalService".equals(type)) { return new LegalService.Builder(new HashMap<String,Object>()); }
    if ("MusicGroup".equals(type)) { return new MusicGroup.Builder(new HashMap<String,Object>()); }
    if ("EducationalOccupationalCredential".equals(type)) { return new EducationalOccupationalCredential.Builder(new HashMap<String,Object>()); }
    if ("MeetingRoom".equals(type)) { return new MeetingRoom.Builder(new HashMap<String,Object>()); }
    if ("JewelryStore".equals(type)) { return new JewelryStore.Builder(new HashMap<String,Object>()); }
    if ("NutritionInformation".equals(type)) { return new NutritionInformation.Builder(new HashMap<String,Object>()); }
    if ("SelfStorage".equals(type)) { return new SelfStorage.Builder(new HashMap<String,Object>()); }
    if ("TaxiService".equals(type)) { return new TaxiService.Builder(new HashMap<String,Object>()); }
    if ("StatisticalPopulation".equals(type)) { return new StatisticalPopulation.Builder(new HashMap<String,Object>()); }
    if ("Service".equals(type)) { return new Service.Builder(new HashMap<String,Object>()); }
    if ("PerformanceRole".equals(type)) { return new PerformanceRole.Builder(new HashMap<String,Object>()); }
    if ("Courthouse".equals(type)) { return new Courthouse.Builder(new HashMap<String,Object>()); }
    if ("CableOrSatelliteService".equals(type)) { return new CableOrSatelliteService.Builder(new HashMap<String,Object>()); }
    if ("Brand".equals(type)) { return new Brand.Builder(new HashMap<String,Object>()); }
    if ("QuoteAction".equals(type)) { return new QuoteAction.Builder(new HashMap<String,Object>()); }
    if ("MusicRelease".equals(type)) { return new MusicRelease.Builder(new HashMap<String,Object>()); }
    if ("MedicalGuidelineRecommendation".equals(type)) { return new MedicalGuidelineRecommendation.Builder(new HashMap<String,Object>()); }
    if ("TennisComplex".equals(type)) { return new TennisComplex.Builder(new HashMap<String,Object>()); }
    if ("AdvertiserContentArticle".equals(type)) { return new AdvertiserContentArticle.Builder(new HashMap<String,Object>()); }
    if ("HealthTopicContent".equals(type)) { return new HealthTopicContent.Builder(new HashMap<String,Object>()); }
    if ("CommentAction".equals(type)) { return new CommentAction.Builder(new HashMap<String,Object>()); }
    if ("WPSideBar".equals(type)) { return new WPSideBar.Builder(new HashMap<String,Object>()); }
    if ("ReportedDoseSchedule".equals(type)) { return new ReportedDoseSchedule.Builder(new HashMap<String,Object>()); }
    if ("MedicalBusiness".equals(type)) { return new MedicalBusiness.Builder(new HashMap<String,Object>()); }
    if ("Florist".equals(type)) { return new Florist.Builder(new HashMap<String,Object>()); }
    if ("InstallAction".equals(type)) { return new InstallAction.Builder(new HashMap<String,Object>()); }
    if ("Menu".equals(type)) { return new Menu.Builder(new HashMap<String,Object>()); }
    if ("AutoWash".equals(type)) { return new AutoWash.Builder(new HashMap<String,Object>()); }
    if ("PhotographAction".equals(type)) { return new PhotographAction.Builder(new HashMap<String,Object>()); }
    if ("BreadcrumbList".equals(type)) { return new BreadcrumbList.Builder(new HashMap<String,Object>()); }
    if ("Playground".equals(type)) { return new Playground.Builder(new HashMap<String,Object>()); }
    if ("CivicStructure".equals(type)) { return new CivicStructure.Builder(new HashMap<String,Object>()); }
    if ("TieAction".equals(type)) { return new TieAction.Builder(new HashMap<String,Object>()); }
    if ("LifestyleModification".equals(type)) { return new LifestyleModification.Builder(new HashMap<String,Object>()); }
    if ("HowToTool".equals(type)) { return new HowToTool.Builder(new HashMap<String,Object>()); }
    if ("GameServer".equals(type)) { return new GameServer.Builder(new HashMap<String,Object>()); }
    if ("TouristDestination".equals(type)) { return new TouristDestination.Builder(new HashMap<String,Object>()); }
    if ("InviteAction".equals(type)) { return new InviteAction.Builder(new HashMap<String,Object>()); }
    if ("LocalBusiness".equals(type)) { return new LocalBusiness.Builder(new HashMap<String,Object>()); }
    if ("ReservationPackage".equals(type)) { return new ReservationPackage.Builder(new HashMap<String,Object>()); }
    if ("Taxi".equals(type)) { return new Taxi.Builder(new HashMap<String,Object>()); }
    if ("TattooParlor".equals(type)) { return new TattooParlor.Builder(new HashMap<String,Object>()); }
    if ("Casino".equals(type)) { return new Casino.Builder(new HashMap<String,Object>()); }
    if ("Person".equals(type)) { return new Person.Builder(new HashMap<String,Object>()); }
    if ("MotorcycleDealer".equals(type)) { return new MotorcycleDealer.Builder(new HashMap<String,Object>()); }
    if ("OpinionNewsArticle".equals(type)) { return new OpinionNewsArticle.Builder(new HashMap<String,Object>()); }
    if ("ShortStory".equals(type)) { return new ShortStory.Builder(new HashMap<String,Object>()); }
    if ("SingleFamilyResidence".equals(type)) { return new SingleFamilyResidence.Builder(new HashMap<String,Object>()); }
    if ("TrainTrip".equals(type)) { return new TrainTrip.Builder(new HashMap<String,Object>()); }
    if ("TouristAttraction".equals(type)) { return new TouristAttraction.Builder(new HashMap<String,Object>()); }
    if ("Audience".equals(type)) { return new Audience.Builder(new HashMap<String,Object>()); }
    if ("PodcastSeason".equals(type)) { return new PodcastSeason.Builder(new HashMap<String,Object>()); }
    if ("PaymentChargeSpecification".equals(type)) { return new PaymentChargeSpecification.Builder(new HashMap<String,Object>()); }
    if ("MovingCompany".equals(type)) { return new MovingCompany.Builder(new HashMap<String,Object>()); }
    if ("BusStation".equals(type)) { return new BusStation.Builder(new HashMap<String,Object>()); }
    if ("Bakery".equals(type)) { return new Bakery.Builder(new HashMap<String,Object>()); }
    if ("LiveBlogPosting".equals(type)) { return new LiveBlogPosting.Builder(new HashMap<String,Object>()); }
    if ("ItemList".equals(type)) { return new ItemList.Builder(new HashMap<String,Object>()); }
    if ("ConfirmAction".equals(type)) { return new ConfirmAction.Builder(new HashMap<String,Object>()); }
    if ("LeaveAction".equals(type)) { return new LeaveAction.Builder(new HashMap<String,Object>()); }
    if ("UserComments".equals(type)) { return new UserComments.Builder(new HashMap<String,Object>()); }
    if ("ReportageNewsArticle".equals(type)) { return new ReportageNewsArticle.Builder(new HashMap<String,Object>()); }
    if ("SpecialAnnouncement".equals(type)) { return new SpecialAnnouncement.Builder(new HashMap<String,Object>()); }
    if ("AnatomicalStructure".equals(type)) { return new AnatomicalStructure.Builder(new HashMap<String,Object>()); }
    if ("HowToTip".equals(type)) { return new HowToTip.Builder(new HashMap<String,Object>()); }
    if ("AssignAction".equals(type)) { return new AssignAction.Builder(new HashMap<String,Object>()); }
    if ("LikeAction".equals(type)) { return new LikeAction.Builder(new HashMap<String,Object>()); }
    if ("Review".equals(type)) { return new Review.Builder(new HashMap<String,Object>()); }
    if ("IceCreamShop".equals(type)) { return new IceCreamShop.Builder(new HashMap<String,Object>()); }
    if ("PeopleAudience".equals(type)) { return new PeopleAudience.Builder(new HashMap<String,Object>()); }
    if ("RecommendedDoseSchedule".equals(type)) { return new RecommendedDoseSchedule.Builder(new HashMap<String,Object>()); }
    if ("Airline".equals(type)) { return new Airline.Builder(new HashMap<String,Object>()); }
    if ("Message".equals(type)) { return new Message.Builder(new HashMap<String,Object>()); }
    if ("Table".equals(type)) { return new Table.Builder(new HashMap<String,Object>()); }
    if ("Electrician".equals(type)) { return new Electrician.Builder(new HashMap<String,Object>()); }
    if ("MedicalCode".equals(type)) { return new MedicalCode.Builder(new HashMap<String,Object>()); }
    if ("UserPlusOnes".equals(type)) { return new UserPlusOnes.Builder(new HashMap<String,Object>()); }
    if ("ComedyEvent".equals(type)) { return new ComedyEvent.Builder(new HashMap<String,Object>()); }
    if ("Enumeration".equals(type)) { return new Enumeration.Builder(new HashMap<String,Object>()); }
    if ("EducationalOccupationalProgram".equals(type)) { return new EducationalOccupationalProgram.Builder(new HashMap<String,Object>()); }
    if ("RVPark".equals(type)) { return new RVPark.Builder(new HashMap<String,Object>()); }
    if ("MedicalSign".equals(type)) { return new MedicalSign.Builder(new HashMap<String,Object>()); }
    if ("DryCleaningOrLaundry".equals(type)) { return new DryCleaningOrLaundry.Builder(new HashMap<String,Object>()); }
    if ("PsychologicalTreatment".equals(type)) { return new PsychologicalTreatment.Builder(new HashMap<String,Object>()); }
    if ("TVEpisode".equals(type)) { return new TVEpisode.Builder(new HashMap<String,Object>()); }
    if ("PrimaryCare".equals(type)) { return new PrimaryCare.Builder(new HashMap<String,Object>()); }
    if ("AppendAction".equals(type)) { return new AppendAction.Builder(new HashMap<String,Object>()); }
    if ("MedicalContraindication".equals(type)) { return new MedicalContraindication.Builder(new HashMap<String,Object>()); }
    if ("MobileApplication".equals(type)) { return new MobileApplication.Builder(new HashMap<String,Object>()); }
    if ("TrainStation".equals(type)) { return new TrainStation.Builder(new HashMap<String,Object>()); }
    if ("MedicalGuidelineContraindication".equals(type)) { return new MedicalGuidelineContraindication.Builder(new HashMap<String,Object>()); }
    if ("Chapter".equals(type)) { return new Chapter.Builder(new HashMap<String,Object>()); }
    if ("Gynecologic".equals(type)) { return new Gynecologic.Builder(new HashMap<String,Object>()); }
    if ("TheaterEvent".equals(type)) { return new TheaterEvent.Builder(new HashMap<String,Object>()); }
    if ("MenuItem".equals(type)) { return new MenuItem.Builder(new HashMap<String,Object>()); }
    if ("ReceiveAction".equals(type)) { return new ReceiveAction.Builder(new HashMap<String,Object>()); }
    if ("TouristTrip".equals(type)) { return new TouristTrip.Builder(new HashMap<String,Object>()); }
    if ("SurgicalProcedure".equals(type)) { return new SurgicalProcedure.Builder(new HashMap<String,Object>()); }
    if ("LoanOrCredit".equals(type)) { return new LoanOrCredit.Builder(new HashMap<String,Object>()); }
    if ("DanceEvent".equals(type)) { return new DanceEvent.Builder(new HashMap<String,Object>()); }
    if ("DaySpa".equals(type)) { return new DaySpa.Builder(new HashMap<String,Object>()); }
    if ("OfferForLease".equals(type)) { return new OfferForLease.Builder(new HashMap<String,Object>()); }
    if ("InfectiousDisease".equals(type)) { return new InfectiousDisease.Builder(new HashMap<String,Object>()); }
    if ("TakeAction".equals(type)) { return new TakeAction.Builder(new HashMap<String,Object>()); }
    if ("DisagreeAction".equals(type)) { return new DisagreeAction.Builder(new HashMap<String,Object>()); }
    if ("Dataset".equals(type)) { return new Dataset.Builder(new HashMap<String,Object>()); }
    if ("Artery".equals(type)) { return new Artery.Builder(new HashMap<String,Object>()); }
    if ("Question".equals(type)) { return new Question.Builder(new HashMap<String,Object>()); }
    if ("PlayAction".equals(type)) { return new PlayAction.Builder(new HashMap<String,Object>()); }
    if ("Geriatric".equals(type)) { return new Geriatric.Builder(new HashMap<String,Object>()); }
    if ("Offer".equals(type)) { return new Offer.Builder(new HashMap<String,Object>()); }
    if ("Quantity".equals(type)) { return new Quantity.Builder(new HashMap<String,Object>()); }
    if ("Answer".equals(type)) { return new Answer.Builder(new HashMap<String,Object>()); }
    if ("EventSeries".equals(type)) { return new EventSeries.Builder(new HashMap<String,Object>()); }
    if ("Clip".equals(type)) { return new Clip.Builder(new HashMap<String,Object>()); }
    if ("Preschool".equals(type)) { return new Preschool.Builder(new HashMap<String,Object>()); }
    if ("Physiotherapy".equals(type)) { return new Physiotherapy.Builder(new HashMap<String,Object>()); }
    if ("AudioObject".equals(type)) { return new AudioObject.Builder(new HashMap<String,Object>()); }
    if ("EmployeeRole".equals(type)) { return new EmployeeRole.Builder(new HashMap<String,Object>()); }
    if ("FoodEstablishmentReservation".equals(type)) { return new FoodEstablishmentReservation.Builder(new HashMap<String,Object>()); }
    if ("Plumber".equals(type)) { return new Plumber.Builder(new HashMap<String,Object>()); }
    if ("MediaObject".equals(type)) { return new MediaObject.Builder(new HashMap<String,Object>()); }
    if ("VideoGameClip".equals(type)) { return new VideoGameClip.Builder(new HashMap<String,Object>()); }
    if ("FoodEstablishment".equals(type)) { return new FoodEstablishment.Builder(new HashMap<String,Object>()); }
    if ("FollowAction".equals(type)) { return new FollowAction.Builder(new HashMap<String,Object>()); }
    if ("BuyAction".equals(type)) { return new BuyAction.Builder(new HashMap<String,Object>()); }
    if ("MoneyTransfer".equals(type)) { return new MoneyTransfer.Builder(new HashMap<String,Object>()); }
    if ("PriceSpecification".equals(type)) { return new PriceSpecification.Builder(new HashMap<String,Object>()); }
    if ("SeaBodyOfWater".equals(type)) { return new SeaBodyOfWater.Builder(new HashMap<String,Object>()); }
    if ("Notary".equals(type)) { return new Notary.Builder(new HashMap<String,Object>()); }
    if ("PostalAddress".equals(type)) { return new PostalAddress.Builder(new HashMap<String,Object>()); }
    if ("MusicVideoObject".equals(type)) { return new MusicVideoObject.Builder(new HashMap<String,Object>()); }
    if ("ApprovedIndication".equals(type)) { return new ApprovedIndication.Builder(new HashMap<String,Object>()); }
    if ("DDxElement".equals(type)) { return new DDxElement.Builder(new HashMap<String,Object>()); }
    if ("Trip".equals(type)) { return new Trip.Builder(new HashMap<String,Object>()); }
    if ("Patient".equals(type)) { return new Patient.Builder(new HashMap<String,Object>()); }
    if ("TypeAndQuantityNode".equals(type)) { return new TypeAndQuantityNode.Builder(new HashMap<String,Object>()); }
    if ("HinduTemple".equals(type)) { return new HinduTemple.Builder(new HashMap<String,Object>()); }
    if ("BusReservation".equals(type)) { return new BusReservation.Builder(new HashMap<String,Object>()); }
    if ("PaintAction".equals(type)) { return new PaintAction.Builder(new HashMap<String,Object>()); }
    if ("PalliativeProcedure".equals(type)) { return new PalliativeProcedure.Builder(new HashMap<String,Object>()); }
    if ("Park".equals(type)) { return new Park.Builder(new HashMap<String,Object>()); }
    if ("HowTo".equals(type)) { return new HowTo.Builder(new HashMap<String,Object>()); }
    if ("TipAction".equals(type)) { return new TipAction.Builder(new HashMap<String,Object>()); }
    if ("UserTweets".equals(type)) { return new UserTweets.Builder(new HashMap<String,Object>()); }
    if ("GovernmentBuilding".equals(type)) { return new GovernmentBuilding.Builder(new HashMap<String,Object>()); }
    if ("AssessAction".equals(type)) { return new AssessAction.Builder(new HashMap<String,Object>()); }
    if ("LiquorStore".equals(type)) { return new LiquorStore.Builder(new HashMap<String,Object>()); }
    if ("MusicStore".equals(type)) { return new MusicStore.Builder(new HashMap<String,Object>()); }
    if ("FAQPage".equals(type)) { return new FAQPage.Builder(new HashMap<String,Object>()); }
    if ("LocationFeatureSpecification".equals(type)) { return new LocationFeatureSpecification.Builder(new HashMap<String,Object>()); }
    if ("Guide".equals(type)) { return new Guide.Builder(new HashMap<String,Object>()); }
    if ("TechArticle".equals(type)) { return new TechArticle.Builder(new HashMap<String,Object>()); }
    if ("UseAction".equals(type)) { return new UseAction.Builder(new HashMap<String,Object>()); }
    if ("Duration".equals(type)) { return new Duration.Builder(new HashMap<String,Object>()); }
    if ("Recipe".equals(type)) { return new Recipe.Builder(new HashMap<String,Object>()); }
    if ("VideoGame".equals(type)) { return new VideoGame.Builder(new HashMap<String,Object>()); }
    if ("HowToItem".equals(type)) { return new HowToItem.Builder(new HashMap<String,Object>()); }
    if ("LendAction".equals(type)) { return new LendAction.Builder(new HashMap<String,Object>()); }
    if ("SchoolDistrict".equals(type)) { return new SchoolDistrict.Builder(new HashMap<String,Object>()); }
    if ("UserInteraction".equals(type)) { return new UserInteraction.Builder(new HashMap<String,Object>()); }
    if ("BookSeries".equals(type)) { return new BookSeries.Builder(new HashMap<String,Object>()); }
    if ("GeoShape".equals(type)) { return new GeoShape.Builder(new HashMap<String,Object>()); }
    if ("ItemPage".equals(type)) { return new ItemPage.Builder(new HashMap<String,Object>()); }
    if ("TravelAgency".equals(type)) { return new TravelAgency.Builder(new HashMap<String,Object>()); }
    if ("EducationalOrganization".equals(type)) { return new EducationalOrganization.Builder(new HashMap<String,Object>()); }
    if ("LibrarySystem".equals(type)) { return new LibrarySystem.Builder(new HashMap<String,Object>()); }
    if ("MediaSubscription".equals(type)) { return new MediaSubscription.Builder(new HashMap<String,Object>()); }
    if ("WantAction".equals(type)) { return new WantAction.Builder(new HashMap<String,Object>()); }
    if ("TradeAction".equals(type)) { return new TradeAction.Builder(new HashMap<String,Object>()); }
    if ("GovernmentService".equals(type)) { return new GovernmentService.Builder(new HashMap<String,Object>()); }
    if ("Festival".equals(type)) { return new Festival.Builder(new HashMap<String,Object>()); }
    if ("JoinAction".equals(type)) { return new JoinAction.Builder(new HashMap<String,Object>()); }
    if ("PodcastSeries".equals(type)) { return new PodcastSeries.Builder(new HashMap<String,Object>()); }
    if ("HVACBusiness".equals(type)) { return new HVACBusiness.Builder(new HashMap<String,Object>()); }
    if ("AccountingService".equals(type)) { return new AccountingService.Builder(new HashMap<String,Object>()); }
    if ("TreatmentIndication".equals(type)) { return new TreatmentIndication.Builder(new HashMap<String,Object>()); }
    if ("Place".equals(type)) { return new Place.Builder(new HashMap<String,Object>()); }
    if ("SteeringPositionValue".equals(type)) { return new SteeringPositionValue.Builder(new HashMap<String,Object>()); }
    if ("InternetCafe".equals(type)) { return new InternetCafe.Builder(new HashMap<String,Object>()); }
    if ("DrugStrength".equals(type)) { return new DrugStrength.Builder(new HashMap<String,Object>()); }
    if ("BorrowAction".equals(type)) { return new BorrowAction.Builder(new HashMap<String,Object>()); }
    if ("AskAction".equals(type)) { return new AskAction.Builder(new HashMap<String,Object>()); }
    if ("BusinessEvent".equals(type)) { return new BusinessEvent.Builder(new HashMap<String,Object>()); }
    if ("DefenceEstablishment".equals(type)) { return new DefenceEstablishment.Builder(new HashMap<String,Object>()); }
    if ("SaleEvent".equals(type)) { return new SaleEvent.Builder(new HashMap<String,Object>()); }
    if ("Psychiatric".equals(type)) { return new Psychiatric.Builder(new HashMap<String,Object>()); }
    if ("TaxiStand".equals(type)) { return new TaxiStand.Builder(new HashMap<String,Object>()); }
    if ("Report".equals(type)) { return new Report.Builder(new HashMap<String,Object>()); }
    if ("DietarySupplement".equals(type)) { return new DietarySupplement.Builder(new HashMap<String,Object>()); }
    if ("ListenAction".equals(type)) { return new ListenAction.Builder(new HashMap<String,Object>()); }
    if ("3DModel".equals(type)) { return new 3DModel.Builder(new HashMap<String,Object>()); }
    if ("BookStore".equals(type)) { return new BookStore.Builder(new HashMap<String,Object>()); }
    if ("DiagnosticLab".equals(type)) { return new DiagnosticLab.Builder(new HashMap<String,Object>()); }
    if ("ToyStore".equals(type)) { return new ToyStore.Builder(new HashMap<String,Object>()); }
    if ("Campground".equals(type)) { return new Campground.Builder(new HashMap<String,Object>()); }
    if ("AutoPartsStore".equals(type)) { return new AutoPartsStore.Builder(new HashMap<String,Object>()); }
    if ("SpreadsheetDigitalDocument".equals(type)) { return new SpreadsheetDigitalDocument.Builder(new HashMap<String,Object>()); }
    if ("Reservation".equals(type)) { return new Reservation.Builder(new HashMap<String,Object>()); }
    if ("Product".equals(type)) { return new Product.Builder(new HashMap<String,Object>()); }
    if ("DrinkAction".equals(type)) { return new DrinkAction.Builder(new HashMap<String,Object>()); }
    if ("PathologyTest".equals(type)) { return new PathologyTest.Builder(new HashMap<String,Object>()); }
    if ("RadioChannel".equals(type)) { return new RadioChannel.Builder(new HashMap<String,Object>()); }
    if ("PlanAction".equals(type)) { return new PlanAction.Builder(new HashMap<String,Object>()); }
    if ("AcceptAction".equals(type)) { return new AcceptAction.Builder(new HashMap<String,Object>()); }
    return null;
  }

  private static final ObjectMapper objectMapper = new ObjectMapper();
  static {
    objectMapper.registerModule(new JsonLdModule());
  }
  @NotNull public static String writeJson(@NotNull Thing thing) throws JsonProcessingException {
    return objectMapper.writeValueAsString(thing);
  }
  public static Thing readJson(@NotNull String json) throws java.io.IOException {
    return objectMapper.readValue(json, Thing.class);
  }
  public static Thing readJson(@NotNull JsonNode node) {
    return ThingDeserializer.fromMap(objectMapper.convertValue(node, java.util.Map.class));
  }
  public static Thing fromMap(@NotNull java.util.Map<String, Object> map) {
    return ThingDeserializer.fromMap(map);
  }
  public static java.util.Map<String, Object> toMap(@NotNull Thing thing) {
    final HashMap<String, Object> result = new HashMap<String, Object>();
    if (thing.getId() != null) {
      result.put("@id", thing.getId());
    }
    result.put("@type", thing.getJsonLdType());
    result.put("@context", thing.getJsonLdContext());
    for (java.util.Map.Entry<String, Object> entry : thing.myData.entrySet()) {
    if (entry.getValue() instanceof Thing) {
        result.put(entry.getKey(), toMap((Thing) entry.getValue()));
      } else if (entry.getValue() instanceof java.util.List) {
        final java.util.ArrayList<Object> list = new java.util.ArrayList<Object>();
        for (Object o : ((java.util.List) entry.getValue())) {
          if (o instanceof Thing) {
            list.add(toMap((Thing) o));
          } else {
            list.add(o);
          }
        }
        result.put(entry.getKey(), list);
      } else if (entry.getValue() instanceof java.util.Date) {
        result.put(entry.getKey(), ThingDeserializer.dateFormat.format(entry.getValue()));
      } else {
        result.put(entry.getKey(), entry.getValue());
      }
    }
    return result;
  }
}
