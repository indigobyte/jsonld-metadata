package org.schema.kotlin
import org.schema.*
class MutableAirline {
  private val map = HashMap<String,Any>()
  var boardingPolicy: BoardingPolicyType
    get() = map["boardingPolicy"] as BoardingPolicyType
    set(value) { map["boardingPolicy"] = value }
  var iataCode: String
    get() = map["iataCode"] as String
    set(value) { map["iataCode"] = value }
  var hasOfferCatalog: OfferCatalog
    get() = map["hasOfferCatalog"] as OfferCatalog
    set(value) { map["hasOfferCatalog"] = value }
  fun hasOfferCatalog(builder: MutableOfferCatalog.() -> Unit) { map["hasOfferCatalog"] = MutableOfferCatalog().apply(builder).build() }
  var address: Any
    get() = map["address"]!!
    set(value) { map["address"] = value }
  fun addressPostalAddress(builder: MutablePostalAddress.() -> Unit) { map["address"] = MutablePostalAddress().apply(builder).build() }
  var aggregateRating: AggregateRating
    get() = map["aggregateRating"] as AggregateRating
    set(value) { map["aggregateRating"] = value }
  fun aggregateRating(builder: MutableAggregateRating.() -> Unit) { map["aggregateRating"] = MutableAggregateRating().apply(builder).build() }
  var alumni: Person
    get() = map["alumni"] as Person
    set(value) { map["alumni"] = value }
  fun alumni(builder: MutablePerson.() -> Unit) { map["alumni"] = MutablePerson().apply(builder).build() }
  var areaServed: AvailableAtOrFrom
    get() = map["areaServed"] as AvailableAtOrFrom
    set(value) { map["areaServed"] = value }
  var award: String
    get() = map["award"] as String
    set(value) { map["award"] = value }
  var parentOrganization: Organization
    get() = map["parentOrganization"] as Organization
    set(value) { map["parentOrganization"] = value }
  fun parentOrganization(builder: MutableOrganization.() -> Unit) { map["parentOrganization"] = MutableOrganization().apply(builder).build() }
  var brand: Any
    get() = map["brand"]!!
    set(value) { map["brand"] = value }
  fun brandBrand(builder: MutableBrand.() -> Unit) { map["brand"] = MutableBrand().apply(builder).build() }
  fun brandOrganization(builder: MutableOrganization.() -> Unit) { map["brand"] = MutableOrganization().apply(builder).build() }
  var contactPoint: ContactPoint
    get() = map["contactPoint"] as ContactPoint
    set(value) { map["contactPoint"] = value }
  fun contactPoint(builder: MutableContactPoint.() -> Unit) { map["contactPoint"] = MutableContactPoint().apply(builder).build() }
  var department: Organization
    get() = map["department"] as Organization
    set(value) { map["department"] = value }
  fun department(builder: MutableOrganization.() -> Unit) { map["department"] = MutableOrganization().apply(builder).build() }
  var email: String
    get() = map["email"] as String
    set(value) { map["email"] = value }
  var employee: Person
    get() = map["employee"] as Person
    set(value) { map["employee"] = value }
  fun employee(builder: MutablePerson.() -> Unit) { map["employee"] = MutablePerson().apply(builder).build() }
  var event: Event
    get() = map["event"] as Event
    set(value) { map["event"] = value }
  fun event(builder: MutableEvent.() -> Unit) { map["event"] = MutableEvent().apply(builder).build() }
  var faxNumber: String
    get() = map["faxNumber"] as String
    set(value) { map["faxNumber"] = value }
  var founder: Person
    get() = map["founder"] as Person
    set(value) { map["founder"] = value }
  fun founder(builder: MutablePerson.() -> Unit) { map["founder"] = MutablePerson().apply(builder).build() }
  var dissolutionDate: java.util.Date
    get() = map["dissolutionDate"] as java.util.Date
    set(value) { map["dissolutionDate"] = value }
  var foundingDate: java.util.Date
    get() = map["foundingDate"] as java.util.Date
    set(value) { map["foundingDate"] = value }
  var hasPOS: Place
    get() = map["hasPOS"] as Place
    set(value) { map["hasPOS"] = value }
  fun hasPOS(builder: MutablePlace.() -> Unit) { map["hasPOS"] = MutablePlace().apply(builder).build() }
  var isicV4: String
    get() = map["isicV4"] as String
    set(value) { map["isicV4"] = value }
  var legalName: String
    get() = map["legalName"] as String
    set(value) { map["legalName"] = value }
  var location: SportsActivityLocation
    get() = map["location"] as SportsActivityLocation
    set(value) { map["location"] = value }
  fun location(builder: MutableSportsActivityLocation.() -> Unit) { map["location"] = MutableSportsActivityLocation().apply(builder).build() }
  var logo: Logo
    get() = map["logo"] as Logo
    set(value) { map["logo"] = value }
  var makesOffer: Offer
    get() = map["makesOffer"] as Offer
    set(value) { map["makesOffer"] = value }
  fun makesOffer(builder: MutableOffer.() -> Unit) { map["makesOffer"] = MutableOffer().apply(builder).build() }
  var member: Any
    get() = map["member"]!!
    set(value) { map["member"] = value }
  fun memberOrganization(builder: MutableOrganization.() -> Unit) { map["member"] = MutableOrganization().apply(builder).build() }
  fun memberPerson(builder: MutablePerson.() -> Unit) { map["member"] = MutablePerson().apply(builder).build() }
  var memberOf: Any
    get() = map["memberOf"]!!
    set(value) { map["memberOf"] = value }
  fun memberOfOrganization(builder: MutableOrganization.() -> Unit) { map["memberOf"] = MutableOrganization().apply(builder).build() }
  fun memberOfProgramMembership(builder: MutableProgramMembership.() -> Unit) { map["memberOf"] = MutableProgramMembership().apply(builder).build() }
  var naics: String
    get() = map["naics"] as String
    set(value) { map["naics"] = value }
  var numberOfEmployees: QuantitativeValue
    get() = map["numberOfEmployees"] as QuantitativeValue
    set(value) { map["numberOfEmployees"] = value }
  fun numberOfEmployees(builder: MutableQuantitativeValue.() -> Unit) { map["numberOfEmployees"] = MutableQuantitativeValue().apply(builder).build() }
  var owns: Any
    get() = map["owns"]!!
    set(value) { map["owns"] = value }
  fun ownsOwnershipInfo(builder: MutableOwnershipInfo.() -> Unit) { map["owns"] = MutableOwnershipInfo().apply(builder).build() }
  fun ownsProduct(builder: MutableProduct.() -> Unit) { map["owns"] = MutableProduct().apply(builder).build() }
  var publishingPrinciples: Any
    get() = map["publishingPrinciples"]!!
    set(value) { map["publishingPrinciples"] = value }
  fun publishingPrinciplesCreativeWork(builder: MutableCreativeWork.() -> Unit) { map["publishingPrinciples"] = MutableCreativeWork().apply(builder).build() }
  var review: Review
    get() = map["review"] as Review
    set(value) { map["review"] = value }
  fun review(builder: MutableReview.() -> Unit) { map["review"] = MutableReview().apply(builder).build() }
  var slogan: String
    get() = map["slogan"] as String
    set(value) { map["slogan"] = value }
  var seeks: Demand
    get() = map["seeks"] as Demand
    set(value) { map["seeks"] = value }
  fun seeks(builder: MutableDemand.() -> Unit) { map["seeks"] = MutableDemand().apply(builder).build() }
  var sponsor: Funder
    get() = map["sponsor"] as Funder
    set(value) { map["sponsor"] = value }
  var funder: Funder
    get() = map["funder"] as Funder
    set(value) { map["funder"] = value }
  var subOrganization: Organization
    get() = map["subOrganization"] as Organization
    set(value) { map["subOrganization"] = value }
  fun subOrganization(builder: MutableOrganization.() -> Unit) { map["subOrganization"] = MutableOrganization().apply(builder).build() }
  var telephone: String
    get() = map["telephone"] as String
    set(value) { map["telephone"] = value }
  var vatID: String
    get() = map["vatID"] as String
    set(value) { map["vatID"] = value }
  var foundingLocation: Place
    get() = map["foundingLocation"] as Place
    set(value) { map["foundingLocation"] = value }
  fun foundingLocation(builder: MutablePlace.() -> Unit) { map["foundingLocation"] = MutablePlace().apply(builder).build() }
  var additionalType: AdditionalType
    get() = map["additionalType"] as AdditionalType
    set(value) { map["additionalType"] = value }
  var alternateName: String
    get() = map["alternateName"] as String
    set(value) { map["alternateName"] = value }
  var description: DisambiguatingDescription
    get() = map["description"] as DisambiguatingDescription
    set(value) { map["description"] = value }
  var disambiguatingDescription: DisambiguatingDescription
    get() = map["disambiguatingDescription"] as DisambiguatingDescription
    set(value) { map["disambiguatingDescription"] = value }
  var image: Logo
    get() = map["image"] as Logo
    set(value) { map["image"] = value }
  var mainEntityOfPage: Any
    get() = map["mainEntityOfPage"]!!
    set(value) { map["mainEntityOfPage"] = value }
  fun mainEntityOfPageCreativeWork(builder: MutableCreativeWork.() -> Unit) { map["mainEntityOfPage"] = MutableCreativeWork().apply(builder).build() }
  var sameAs: String
    get() = map["sameAs"] as String
    set(value) { map["sameAs"] = value }
  var url: String
    get() = map["url"] as String
    set(value) { map["url"] = value }
  var potentialAction: Action
    get() = map["potentialAction"] as Action
    set(value) { map["potentialAction"] = value }
  fun potentialAction(builder: MutableAction.() -> Unit) { map["potentialAction"] = MutableAction().apply(builder).build() }
  var identifier: Isbn
    get() = map["identifier"] as Isbn
    set(value) { map["identifier"] = value }
  var subjectOf: Any
    get() = map["subjectOf"]!!
    set(value) { map["subjectOf"] = value }
  fun subjectOfCreativeWork(builder: MutableCreativeWork.() -> Unit) { map["subjectOf"] = MutableCreativeWork().apply(builder).build() }
  fun subjectOfEvent(builder: MutableEvent.() -> Unit) { map["subjectOf"] = MutableEvent().apply(builder).build() }
  var id: String
    get() = map["id"] as String
    set(value) { map["id"] = value }
  fun build() = org.schema.Airline.Builder(map).build()
}
