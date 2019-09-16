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
  var eligibleRegion: EligibleRegion
    get() = map["eligibleRegion"] as EligibleRegion
    set(value) { map["eligibleRegion"] = value }
  var expectsAcceptanceOf: Offer
    get() = map["expectsAcceptanceOf"] as Offer
    set(value) { map["expectsAcceptanceOf"] = value }
  fun expectsAcceptanceOf(builder: MutableOffer.() -> Unit) { map["expectsAcceptanceOf"] = MutableOffer().apply(builder).build() }
  var requiresSubscription: Any
    get() = map["requiresSubscription"]!!
    set(value) { map["requiresSubscription"] = value }
  fun requiresSubscriptionMediaSubscription(builder: MutableMediaSubscription.() -> Unit) { map["requiresSubscription"] = MutableMediaSubscription().apply(builder).build() }
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
  fun build() = org.schema.ActionAccessSpecification.Builder(map).build()
}
