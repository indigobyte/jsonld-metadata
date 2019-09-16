package org.schema.kotlin
import org.schema.*
class MutableAMRadioChannel {
  private val map = HashMap<String,Any>()
  var broadcastChannelId: String
    get() = map["broadcastChannelId"] as String
    set(value) { map["broadcastChannelId"] = value }
  var inBroadcastLineup: CableOrSatelliteService
    get() = map["inBroadcastLineup"] as CableOrSatelliteService
    set(value) { map["inBroadcastLineup"] = value }
  fun inBroadcastLineup(builder: MutableCableOrSatelliteService.() -> Unit) { map["inBroadcastLineup"] = MutableCableOrSatelliteService().apply(builder).build() }
  var broadcastServiceTier: String
    get() = map["broadcastServiceTier"] as String
    set(value) { map["broadcastServiceTier"] = value }
  var providesBroadcastService: BroadcastService
    get() = map["providesBroadcastService"] as BroadcastService
    set(value) { map["providesBroadcastService"] = value }
  fun providesBroadcastService(builder: MutableBroadcastService.() -> Unit) { map["providesBroadcastService"] = MutableBroadcastService().apply(builder).build() }
  var broadcastFrequency: Any
    get() = map["broadcastFrequency"]!!
    set(value) { map["broadcastFrequency"] = value }
  fun broadcastFrequencyBroadcastFrequencySpecification(builder: MutableBroadcastFrequencySpecification.() -> Unit) { map["broadcastFrequency"] = MutableBroadcastFrequencySpecification().apply(builder).build() }
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
  fun build() = org.schema.AMRadioChannel.Builder(map).build()
}
