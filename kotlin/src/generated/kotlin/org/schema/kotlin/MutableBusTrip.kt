package org.schema.kotlin
import org.schema.*
class MutableBusTrip {
  private val map = HashMap<String,Any>()
  var busNumber: String
    get() = map["busNumber"] as String
    set(value) { map["busNumber"] = value }
  var busName: String
    get() = map["busName"] as String
    set(value) { map["busName"] = value }
  var departureBusStop: Any
    get() = map["departureBusStop"]!!
    set(value) { map["departureBusStop"] = value }
  fun departureBusStopBusStation(builder: MutableBusStation.() -> Unit) { map["departureBusStop"] = MutableBusStation().apply(builder).build() }
  fun departureBusStopBusStop(builder: MutableBusStop.() -> Unit) { map["departureBusStop"] = MutableBusStop().apply(builder).build() }
  var arrivalBusStop: Any
    get() = map["arrivalBusStop"]!!
    set(value) { map["arrivalBusStop"] = value }
  fun arrivalBusStopBusStation(builder: MutableBusStation.() -> Unit) { map["arrivalBusStop"] = MutableBusStation().apply(builder).build() }
  fun arrivalBusStopBusStop(builder: MutableBusStop.() -> Unit) { map["arrivalBusStop"] = MutableBusStop().apply(builder).build() }
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
  fun build() = org.schema.BusTrip.Builder(map).build()
}
