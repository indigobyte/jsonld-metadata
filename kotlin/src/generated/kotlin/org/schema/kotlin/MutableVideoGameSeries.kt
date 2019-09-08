package org.schema.kotlin
import org.schema.*
class MutableVideoGameSeries {
  private val map = HashMap<String,Any>()
  var actor: Person
    get() = map["actor"] as Person
    set(value) { map["actor"] = value }
  fun actor(builder: MutablePerson.() -> Unit) { map["actor"] = MutablePerson().apply(builder).build() }
  var director: Person
    get() = map["director"] as Person
    set(value) { map["director"] = value }
  fun director(builder: MutablePerson.() -> Unit) { map["director"] = MutablePerson().apply(builder).build() }
  var episode: HasPart
    get() = map["episode"] as HasPart
    set(value) { map["episode"] = value }
  var musicBy: Any
    get() = map["musicBy"]!!
    set(value) { map["musicBy"] = value }
  fun musicByMusicGroup(builder: MutableMusicGroup.() -> Unit) { map["musicBy"] = MutableMusicGroup().apply(builder).build() }
  fun musicByPerson(builder: MutablePerson.() -> Unit) { map["musicBy"] = MutablePerson().apply(builder).build() }
  var numberOfEpisodes: Int
    get() = map["numberOfEpisodes"] as Int
    set(value) { map["numberOfEpisodes"] = value }
  var numberOfSeasons: Int
    get() = map["numberOfSeasons"] as Int
    set(value) { map["numberOfSeasons"] = value }
  var productionCompany: Organization
    get() = map["productionCompany"] as Organization
    set(value) { map["productionCompany"] = value }
  fun productionCompany(builder: MutableOrganization.() -> Unit) { map["productionCompany"] = MutableOrganization().apply(builder).build() }
  var containsSeason: HasPart
    get() = map["containsSeason"] as HasPart
    set(value) { map["containsSeason"] = value }
  var trailer: VideoObject
    get() = map["trailer"] as VideoObject
    set(value) { map["trailer"] = value }
  fun trailer(builder: MutableVideoObject.() -> Unit) { map["trailer"] = MutableVideoObject().apply(builder).build() }
  var numberOfPlayers: QuantitativeValue
    get() = map["numberOfPlayers"] as QuantitativeValue
    set(value) { map["numberOfPlayers"] = value }
  fun numberOfPlayers(builder: MutableQuantitativeValue.() -> Unit) { map["numberOfPlayers"] = MutableQuantitativeValue().apply(builder).build() }
  var quest: Thing
    get() = map["quest"] as Thing
    set(value) { map["quest"] = value }
  fun quest(builder: MutableThing.() -> Unit) { map["quest"] = MutableThing().apply(builder).build() }
  var gameItem: Thing
    get() = map["gameItem"] as Thing
    set(value) { map["gameItem"] = value }
  fun gameItem(builder: MutableThing.() -> Unit) { map["gameItem"] = MutableThing().apply(builder).build() }
  var characterAttribute: Thing
    get() = map["characterAttribute"] as Thing
    set(value) { map["characterAttribute"] = value }
  fun characterAttribute(builder: MutableThing.() -> Unit) { map["characterAttribute"] = MutableThing().apply(builder).build() }
  var playMode: GamePlayMode
    get() = map["playMode"] as GamePlayMode
    set(value) { map["playMode"] = value }
  var cheatCode: CreativeWork
    get() = map["cheatCode"] as CreativeWork
    set(value) { map["cheatCode"] = value }
  fun cheatCode(builder: MutableCreativeWork.() -> Unit) { map["cheatCode"] = MutableCreativeWork().apply(builder).build() }
  var gamePlatform: Any
    get() = map["gamePlatform"]!!
    set(value) { map["gamePlatform"] = value }
  fun gamePlatformThing(builder: MutableThing.() -> Unit) { map["gamePlatform"] = MutableThing().apply(builder).build() }
  var gameLocation: Any
    get() = map["gameLocation"]!!
    set(value) { map["gameLocation"] = value }
  fun gameLocationPlace(builder: MutablePlace.() -> Unit) { map["gameLocation"] = MutablePlace().apply(builder).build() }
  fun gameLocationPostalAddress(builder: MutablePostalAddress.() -> Unit) { map["gameLocation"] = MutablePostalAddress().apply(builder).build() }
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
  var disambiguatingDescription: String
    get() = map["disambiguatingDescription"] as String
    set(value) { map["disambiguatingDescription"] = value }
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
  var subjectOf: Any
    get() = map["subjectOf"]!!
    set(value) { map["subjectOf"] = value }
  fun subjectOfCreativeWork(builder: MutableCreativeWork.() -> Unit) { map["subjectOf"] = MutableCreativeWork().apply(builder).build() }
  fun subjectOfEvent(builder: MutableEvent.() -> Unit) { map["subjectOf"] = MutableEvent().apply(builder).build() }
  var id: String
    get() = map["id"] as String
    set(value) { map["id"] = value }
  fun build() = org.schema.VideoGameSeries.Builder(map).build()
}
