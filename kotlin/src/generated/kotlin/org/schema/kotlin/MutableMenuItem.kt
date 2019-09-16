package org.schema.kotlin
import org.schema.*
class MutableMenuItem {
  private val map = HashMap<String,Any>()
  var suitableForDiet: RestrictedDiet
    get() = map["suitableForDiet"] as RestrictedDiet
    set(value) { map["suitableForDiet"] = value }
  var nutrition: NutritionInformation
    get() = map["nutrition"] as NutritionInformation
    set(value) { map["nutrition"] = value }
  fun nutrition(builder: MutableNutritionInformation.() -> Unit) { map["nutrition"] = MutableNutritionInformation().apply(builder).build() }
  var menuAddOn: Any
    get() = map["menuAddOn"]!!
    set(value) { map["menuAddOn"] = value }
  fun menuAddOnMenuItem(builder: MutableMenuItem.() -> Unit) { map["menuAddOn"] = MutableMenuItem().apply(builder).build() }
  fun menuAddOnMenuSection(builder: MutableMenuSection.() -> Unit) { map["menuAddOn"] = MutableMenuSection().apply(builder).build() }
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
  fun build() = org.schema.MenuItem.Builder(map).build()
}
