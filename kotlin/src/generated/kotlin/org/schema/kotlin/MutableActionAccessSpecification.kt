package org.schema.kotlin
import org.schema.*
class MutableActionAccessSpecification {
  private val map = HashMap<String,Any>()
  var availabilityStarts: java.util.Date
    get() = map["availabilityStarts"] as java.util.Date
    set(value) { map["availabilityStarts"] = value }
  var availabilityEnds: java.util.Date
    get() = map["availabilityEnds"] as java.util.Date
    set(value) { map["availabilityEnds"] = value }
  var category: Any
    get() = map["category"]!!
    set(value) { map["category"] = value }
  fun categoryThing(builder: MutableThing.() -> Unit) { map["category"] = MutableThing().apply(builder).build() }
  var eligibleRegion: Any
    get() = map["eligibleRegion"]!!
    set(value) { map["eligibleRegion"] = value }
  fun eligibleRegionGeoShape(builder: MutableGeoShape.() -> Unit) { map["eligibleRegion"] = MutableGeoShape().apply(builder).build() }
  fun eligibleRegionPlace(builder: MutablePlace.() -> Unit) { map["eligibleRegion"] = MutablePlace().apply(builder).build() }
  var expectsAcceptanceOf: Offer
    get() = map["expectsAcceptanceOf"] as Offer
    set(value) { map["expectsAcceptanceOf"] = value }
  fun expectsAcceptanceOf(builder: MutableOffer.() -> Unit) { map["expectsAcceptanceOf"] = MutableOffer().apply(builder).build() }
  var requiresSubscription: Any
    get() = map["requiresSubscription"]!!
    set(value) { map["requiresSubscription"] = value }
  fun requiresSubscriptionMediaSubscription(builder: MutableMediaSubscription.() -> Unit) { map["requiresSubscription"] = MutableMediaSubscription().apply(builder).build() }
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
  fun build() = org.schema.ActionAccessSpecification.Builder(map).build()
}
