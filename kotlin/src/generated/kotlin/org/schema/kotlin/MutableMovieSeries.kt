package org.schema.kotlin
import org.schema.*
class MutableMovieSeries {
  private val map = HashMap<String,Any>()
  var actor: Person
    get() = map["actor"] as Person
    set(value) { map["actor"] = value }
  fun actor(builder: MutablePerson.() -> Unit) { map["actor"] = MutablePerson().apply(builder).build() }
  var director: Person
    get() = map["director"] as Person
    set(value) { map["director"] = value }
  fun director(builder: MutablePerson.() -> Unit) { map["director"] = MutablePerson().apply(builder).build() }
  var musicBy: Any
    get() = map["musicBy"]!!
    set(value) { map["musicBy"] = value }
  fun musicByMusicGroup(builder: MutableMusicGroup.() -> Unit) { map["musicBy"] = MutableMusicGroup().apply(builder).build() }
  fun musicByPerson(builder: MutablePerson.() -> Unit) { map["musicBy"] = MutablePerson().apply(builder).build() }
  var productionCompany: Organization
    get() = map["productionCompany"] as Organization
    set(value) { map["productionCompany"] = value }
  fun productionCompany(builder: MutableOrganization.() -> Unit) { map["productionCompany"] = MutableOrganization().apply(builder).build() }
  var trailer: VideoObject
    get() = map["trailer"] as VideoObject
    set(value) { map["trailer"] = value }
  fun trailer(builder: MutableVideoObject.() -> Unit) { map["trailer"] = MutableVideoObject().apply(builder).build() }
  var endDate: java.util.Date
    get() = map["endDate"] as java.util.Date
    set(value) { map["endDate"] = value }
  var startDate: java.util.Date
    get() = map["startDate"] as java.util.Date
    set(value) { map["startDate"] = value }
  var issn: Identifier
    get() = map["issn"] as Identifier
    set(value) { map["issn"] = value }
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
  fun build() = org.schema.MovieSeries.Builder(map).build()
}
