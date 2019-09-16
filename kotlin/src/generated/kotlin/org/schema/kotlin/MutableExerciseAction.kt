package org.schema.kotlin
import org.schema.*
class MutableExerciseAction {
  private val map = HashMap<String,Any>()
  var course: Course
    get() = map["course"] as Course
    set(value) { map["course"] = value }
  fun course(builder: MutableCourse.() -> Unit) { map["course"] = MutableCourse().apply(builder).build() }
  var exerciseCourse: ExerciseCourse
    get() = map["exerciseCourse"] as ExerciseCourse
    set(value) { map["exerciseCourse"] = value }
  var distance: Distance
    get() = map["distance"] as Distance
    set(value) { map["distance"] = value }
  fun distance(builder: MutableDistance.() -> Unit) { map["distance"] = MutableDistance().apply(builder).build() }
  var fromLocation: FromLocation
    get() = map["fromLocation"] as FromLocation
    set(value) { map["fromLocation"] = value }
  var opponent: Opponent
    get() = map["opponent"] as Opponent
    set(value) { map["opponent"] = value }
  var sportsActivityLocation: SportsActivityLocation
    get() = map["sportsActivityLocation"] as SportsActivityLocation
    set(value) { map["sportsActivityLocation"] = value }
  fun sportsActivityLocation(builder: MutableSportsActivityLocation.() -> Unit) { map["sportsActivityLocation"] = MutableSportsActivityLocation().apply(builder).build() }
  var sportsEvent: SportsEvent
    get() = map["sportsEvent"] as SportsEvent
    set(value) { map["sportsEvent"] = value }
  fun sportsEvent(builder: MutableSportsEvent.() -> Unit) { map["sportsEvent"] = MutableSportsEvent().apply(builder).build() }
  var sportsTeam: SportsTeam
    get() = map["sportsTeam"] as SportsTeam
    set(value) { map["sportsTeam"] = value }
  fun sportsTeam(builder: MutableSportsTeam.() -> Unit) { map["sportsTeam"] = MutableSportsTeam().apply(builder).build() }
  var toLocation: ToLocation
    get() = map["toLocation"] as ToLocation
    set(value) { map["toLocation"] = value }
  var audience: Audience
    get() = map["audience"] as Audience
    set(value) { map["audience"] = value }
  fun audience(builder: MutableAudience.() -> Unit) { map["audience"] = MutableAudience().apply(builder).build() }
  var event: Event
    get() = map["event"] as Event
    set(value) { map["event"] = value }
  fun event(builder: MutableEvent.() -> Unit) { map["event"] = MutableEvent().apply(builder).build() }
  var agent: Any
    get() = map["agent"]!!
    set(value) { map["agent"] = value }
  fun agentOrganization(builder: MutableOrganization.() -> Unit) { map["agent"] = MutableOrganization().apply(builder).build() }
  fun agentPerson(builder: MutablePerson.() -> Unit) { map["agent"] = MutablePerson().apply(builder).build() }
  var endTime: java.util.Date
    get() = map["endTime"] as java.util.Date
    set(value) { map["endTime"] = value }
  var instrument: Language
    get() = map["instrument"] as Language
    set(value) { map["instrument"] = value }
  var location: SportsActivityLocation
    get() = map["location"] as SportsActivityLocation
    set(value) { map["location"] = value }
  fun location(builder: MutableSportsActivityLocation.() -> Unit) { map["location"] = MutableSportsActivityLocation().apply(builder).build() }
  var object: Option
    get() = map["object"] as Option
    set(value) { map["object"] = value }
  var participant: RealEstateAgent
    get() = map["participant"] as RealEstateAgent
    set(value) { map["participant"] = value }
  fun participant(builder: MutableRealEstateAgent.() -> Unit) { map["participant"] = MutableRealEstateAgent().apply(builder).build() }
  var result: ResultComment
    get() = map["result"] as ResultComment
    set(value) { map["result"] = value }
  var startTime: java.util.Date
    get() = map["startTime"] as java.util.Date
    set(value) { map["startTime"] = value }
  var actionStatus: ActionStatusType
    get() = map["actionStatus"] as ActionStatusType
    set(value) { map["actionStatus"] = value }
  var error: Thing
    get() = map["error"] as Thing
    set(value) { map["error"] = value }
  fun error(builder: MutableThing.() -> Unit) { map["error"] = MutableThing().apply(builder).build() }
  var target: EntryPoint
    get() = map["target"] as EntryPoint
    set(value) { map["target"] = value }
  fun target(builder: MutableEntryPoint.() -> Unit) { map["target"] = MutableEntryPoint().apply(builder).build() }
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
  fun build() = org.schema.ExerciseAction.Builder(map).build()
}
