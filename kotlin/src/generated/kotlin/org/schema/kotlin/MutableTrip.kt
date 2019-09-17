package org.schema.kotlin
import org.schema.*
class MutableTrip {
  private val map = HashMap<String,Any>()
  var offers: Offer
    get() = map["offers"] as Offer
    set(value) { map["offers"] = value }
  fun offers(builder: MutableOffer.() -> Unit) { map["offers"] = MutableOffer().apply(builder).build() }
  var provider: Any
    get() = map["provider"]!!
    set(value) { map["provider"] = value }
  fun providerOrganization(builder: MutableOrganization.() -> Unit) { map["provider"] = MutableOrganization().apply(builder).build() }
  fun providerPerson(builder: MutablePerson.() -> Unit) { map["provider"] = MutablePerson().apply(builder).build() }
  var departureTime: java.util.Date
    get() = map["departureTime"] as java.util.Date
    set(value) { map["departureTime"] = value }
  var arrivalTime: java.util.Date
    get() = map["arrivalTime"] as java.util.Date
    set(value) { map["arrivalTime"] = value }
  var additionalType: String
    get() = map["additionalType"] as String
    set(value) { map["additionalType"] = value }
  var alternateName: String
    get() = map["alternateName"] as String
    set(value) { map["alternateName"] = value }
  var description: Description
    get() = map["description"] as Description
    set(value) { map["description"] = value }
  var disambiguatingDescription: String
    get() = map["disambiguatingDescription"] as String
    set(value) { map["disambiguatingDescription"] = value }
  var image: Image
    get() = map["image"] as Image
    set(value) { map["image"] = value }
  var mainEntityOfPage: Any
    get() = map["mainEntityOfPage"]!!
    set(value) { map["mainEntityOfPage"] = value }
  fun mainEntityOfPageCreativeWork(builder: MutableCreativeWork.() -> Unit) { map["mainEntityOfPage"] = MutableCreativeWork().apply(builder).build() }
  var name: String
    get() = map["name"] as String
    set(value) { map["name"] = value }
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
  var identifier: Identifier
    get() = map["identifier"] as Identifier
    set(value) { map["identifier"] = value }
  var subjectOf: Any
    get() = map["subjectOf"]!!
    set(value) { map["subjectOf"] = value }
  fun subjectOfCreativeWork(builder: MutableCreativeWork.() -> Unit) { map["subjectOf"] = MutableCreativeWork().apply(builder).build() }
  fun subjectOfEvent(builder: MutableEvent.() -> Unit) { map["subjectOf"] = MutableEvent().apply(builder).build() }
  var id: String
    get() = map["id"] as String
    set(value) { map["id"] = value }
  fun build() = org.schema.Trip.Builder(map).build()
}
