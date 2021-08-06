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
 * Enumerates common size systems specific for wearable products
 */
public enum WearableSizeSystemEnumeration {
  WearableSizeSystemEurope("http://schema.org/WearableSizeSystemEurope"), WearableSizeSystemContinental("http://schema.org/WearableSizeSystemContinental"), WearableSizeSystemEN13402("http://schema.org/WearableSizeSystemEN13402"), WearableSizeSystemMX("http://schema.org/WearableSizeSystemMX"), WearableSizeSystemJP("http://schema.org/WearableSizeSystemJP"), WearableSizeSystemIT("http://schema.org/WearableSizeSystemIT"), WearableSizeSystemFR("http://schema.org/WearableSizeSystemFR"), WearableSizeSystemUK("http://schema.org/WearableSizeSystemUK"), WearableSizeSystemUS("http://schema.org/WearableSizeSystemUS"), WearableSizeSystemDE("http://schema.org/WearableSizeSystemDE"), WearableSizeSystemCN("http://schema.org/WearableSizeSystemCN"), WearableSizeSystemGS1("http://schema.org/WearableSizeSystemGS1"), WearableSizeSystemAU("http://schema.org/WearableSizeSystemAU"), WearableSizeSystemBR("http://schema.org/WearableSizeSystemBR");
  WearableSizeSystemEnumeration(String value) {
    myValue = value;
  }
  @JsonValue
  public String getValue() { return myValue; }
  private String myValue;
}
