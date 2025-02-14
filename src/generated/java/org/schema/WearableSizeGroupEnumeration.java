/*
 * Copyright 2015-2017 JetBrains s.r.o.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 *
 * This is auto-generated file. Do not edit.
 */

package org.schema;

import com.fasterxml.jackson.annotation.JsonValue;

/**
 * Enumerates common size groups (also known as &quot;size types&quot;) for wearable products.
 */
public enum WearableSizeGroupEnumeration {
  WearableSizeGroupBoys("http://schema.org/WearableSizeGroupBoys"), WearableSizeGroupExtraShort("http://schema.org/WearableSizeGroupExtraShort"), WearableSizeGroupPlus("http://schema.org/WearableSizeGroupPlus"), WearableSizeGroupPetite("http://schema.org/WearableSizeGroupPetite"), WearableSizeGroupMaternity("http://schema.org/WearableSizeGroupMaternity"), WearableSizeGroupJuniors("http://schema.org/WearableSizeGroupJuniors"), WearableSizeGroupBig("http://schema.org/WearableSizeGroupBig"), WearableSizeGroupWomens("http://schema.org/WearableSizeGroupWomens"), WearableSizeGroupExtraTall("http://schema.org/WearableSizeGroupExtraTall"), WearableSizeGroupInfants("http://schema.org/WearableSizeGroupInfants"), WearableSizeGroupTall("http://schema.org/WearableSizeGroupTall"), WearableSizeGroupRegular("http://schema.org/WearableSizeGroupRegular"), WearableSizeGroupMens("http://schema.org/WearableSizeGroupMens"), WearableSizeGroupGirls("http://schema.org/WearableSizeGroupGirls"), WearableSizeGroupHusky("http://schema.org/WearableSizeGroupHusky"), WearableSizeGroupMisses("http://schema.org/WearableSizeGroupMisses"), WearableSizeGroupShort("http://schema.org/WearableSizeGroupShort");
  WearableSizeGroupEnumeration(String value) {
    myValue = value;
  }
  @JsonValue
  public String getValue() { return myValue; }
  private String myValue;
}
