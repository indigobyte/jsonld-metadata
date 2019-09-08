package org.schema.kotlin
import org.schema.*
class MutableOccupation {
  private val map = HashMap<String,Any>()
  var educationRequirements: String
    get() = map["educationRequirements"] as String
    set(value) { map["educationRequirements"] = value }
  var estimatedSalary: Any
    get() = map["estimatedSalary"]!!
    set(value) { map["estimatedSalary"] = value }
  var experienceRequirements: String
    get() = map["experienceRequirements"] as String
    set(value) { map["experienceRequirements"] = value }
  var occupationalCategory: String
    get() = map["occupationalCategory"] as String
    set(value) { map["occupationalCategory"] = value }
  var occupationLocation: AdministrativeArea
    get() = map["occupationLocation"] as AdministrativeArea
    set(value) { map["occupationLocation"] = value }
  fun occupationLocation(builder: MutableAdministrativeArea.() -> Unit) { map["occupationLocation"] = MutableAdministrativeArea().apply(builder).build() }
  var qualifications: String
    get() = map["qualifications"] as String
    set(value) { map["qualifications"] = value }
  var responsibilities: String
    get() = map["responsibilities"] as String
    set(value) { map["responsibilities"] = value }
  var skills: String
    get() = map["skills"] as String
    set(value) { map["skills"] = value }
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
  fun build() = org.schema.Occupation.Builder(map).build()
}
