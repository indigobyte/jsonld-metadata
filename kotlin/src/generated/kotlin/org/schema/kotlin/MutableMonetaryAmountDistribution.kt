package org.schema.kotlin
import org.schema.*
class MutableMonetaryAmountDistribution {
  private val map = HashMap<String,Any>()
  var currency: String
    get() = map["currency"] as String
    set(value) { map["currency"] = value }
  var duration: Duration
    get() = map["duration"] as Duration
    set(value) { map["duration"] = value }
  var percentile10: Any
    get() = map["percentile10"]!!
    set(value) { map["percentile10"] = value }
  var percentile25: Any
    get() = map["percentile25"]!!
    set(value) { map["percentile25"] = value }
  var median: Any
    get() = map["median"]!!
    set(value) { map["median"] = value }
  var percentile75: Any
    get() = map["percentile75"]!!
    set(value) { map["percentile75"] = value }
  var percentile90: Any
    get() = map["percentile90"]!!
    set(value) { map["percentile90"] = value }
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
  fun build() = org.schema.MonetaryAmountDistribution.Builder(map).build()
}
