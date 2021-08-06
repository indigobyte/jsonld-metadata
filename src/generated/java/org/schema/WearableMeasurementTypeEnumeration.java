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
 * Enumerates common types of measurement for wearables products.
 */
public enum WearableMeasurementTypeEnumeration {
  WearableMeasurementCollar("http://schema.org/WearableMeasurementCollar"), WearableMeasurementBack("http://schema.org/WearableMeasurementBack"), WearableMeasurementChestOrBust("http://schema.org/WearableMeasurementChestOrBust"), WearableMeasurementSleeve("http://schema.org/WearableMeasurementSleeve"), WearableMeasurementCup("http://schema.org/WearableMeasurementCup"), WearableMeasurementWaist("http://schema.org/WearableMeasurementWaist"), WearableMeasurementWidth("http://schema.org/WearableMeasurementWidth"), WearableMeasurementHeight("http://schema.org/WearableMeasurementHeight"), WearableMeasurementOutsideLeg("http://schema.org/WearableMeasurementOutsideLeg"), WearableMeasurementInseam("http://schema.org/WearableMeasurementInseam"), WearableMeasurementHips("http://schema.org/WearableMeasurementHips"), WearableMeasurementLength("http://schema.org/WearableMeasurementLength");
  WearableMeasurementTypeEnumeration(String value) {
    myValue = value;
  }
  @JsonValue
  public String getValue() { return myValue; }
  private String myValue;
}
