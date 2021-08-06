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
 * Enumerates different price components that together make up the total price for an offered product.
 */
public enum PriceComponentTypeEnumeration {
  DistanceFee("http://schema.org/DistanceFee"), ActivationFee("http://schema.org/ActivationFee"), Downpayment("http://schema.org/Downpayment"), Subscription("http://schema.org/Subscription"), Installment("http://schema.org/Installment"), CleaningFee("http://schema.org/CleaningFee");
  PriceComponentTypeEnumeration(String value) {
    myValue = value;
  }
  @JsonValue
  public String getValue() { return myValue; }
  private String myValue;
}
