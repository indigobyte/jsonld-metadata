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
 * Enumerates types (or dimensions) of a person's body measurements, for example for fitting of clothes.
 */
public enum BodyMeasurementTypeEnumeration {
  BodyMeasurementUnderbust("http://schema.org/BodyMeasurementUnderbust"), BodyMeasurementWaist("http://schema.org/BodyMeasurementWaist"), BodyMeasurementChest("http://schema.org/BodyMeasurementChest"), BodyMeasurementNeck("http://schema.org/BodyMeasurementNeck"), BodyMeasurementInsideLeg("http://schema.org/BodyMeasurementInsideLeg"), BodyMeasurementWeight("http://schema.org/BodyMeasurementWeight"), BodyMeasurementFoot("http://schema.org/BodyMeasurementFoot"), BodyMeasurementArm("http://schema.org/BodyMeasurementArm"), BodyMeasurementHead("http://schema.org/BodyMeasurementHead"), BodyMeasurementHand("http://schema.org/BodyMeasurementHand"), BodyMeasurementHips("http://schema.org/BodyMeasurementHips"), BodyMeasurementBust("http://schema.org/BodyMeasurementBust"), BodyMeasurementHeight("http://schema.org/BodyMeasurementHeight");
  BodyMeasurementTypeEnumeration(String value) {
    myValue = value;
  }
  @JsonValue
  public String getValue() { return myValue; }
  private String myValue;
}
