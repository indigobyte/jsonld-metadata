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
 * Content coded 'satire or parody content' in a [[MediaReview]], considered in the context of how it was published or shared.
 * 
 * For a [[VideoObject]] to be 'satire or parody content': A video that was created as political or humorous commentary and is presented in that context. (Reshares of satire/parody content that do not include relevant context are more likely to fall under the &ldquo;missing context&rdquo; rating.)
 * 
 * For an [[ImageObject]] to be 'satire or parody content': An image that was created as political or humorous commentary and is presented in that context. (Reshares of satire/parody content that do not include relevant context are more likely to fall under the &ldquo;missing context&rdquo; rating.)
 * 
 * For an [[ImageObject]] with embedded text to be 'satire or parody content': An image that was created as political or humorous commentary and is presented in that context. (Reshares of satire/parody content that do not include relevant context are more likely to fall under the &ldquo;missing context&rdquo; rating.)
 * 
 * For an [[AudioObject]] to be 'satire or parody content': Audio that was created as political or humorous commentary and is presented in that context. (Reshares of satire/parody content that do not include relevant context are more likely to fall under the &ldquo;missing context&rdquo; rating.)
 * 
 */
public enum SatireOrParodyContent {
  ;
  SatireOrParodyContent(String value) {
    myValue = value;
  }
  @JsonValue
  public String getValue() { return myValue; }
  private String myValue;
}
