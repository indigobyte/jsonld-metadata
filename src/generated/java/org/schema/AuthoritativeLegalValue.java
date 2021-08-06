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
 * Indicates that the publisher gives some special status to the publication of the document. (&quot;The Queens Printer&quot; version of a UK Act of Parliament, or the PDF version of a Directive published by the EU Office of Publications). Something &quot;Authoritative&quot; is considered to be also [[OfficialLegalValue]]&quot;.
 */
public enum AuthoritativeLegalValue {
  ;
  AuthoritativeLegalValue(String value) {
    myValue = value;
  }
  @JsonValue
  public String getValue() { return myValue; }
  private String myValue;
}
