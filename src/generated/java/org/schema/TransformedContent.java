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
 * Content coded 'transformed content' in a [[MediaReview]], considered in the context of how it was published or shared.
 * 
 * For a [[VideoObject]] to be 'transformed content':  or all of the video has been manipulated to transform the footage itself. This category includes using tools like the Adobe Suite to change the speed of the video, add or remove visual elements or dub audio. Deepfakes are also a subset of transformation.
 * 
 * For an [[ImageObject]] to be transformed content': Adding or deleting visual elements to give the image a different meaning with the intention to mislead.
 * 
 * For an [[ImageObject]] with embedded text to be 'transformed content': Adding or deleting visual elements to give the image a different meaning with the intention to mislead.
 * 
 * For an [[AudioObject]] to be 'transformed content': Part or all of the audio has been manipulated to alter the words or sounds, or the audio has been synthetically generated, such as to create a sound-alike voice.
 * 
 */
public enum TransformedContent {
  ;
  TransformedContent(String value) {
    myValue = value;
  }
  @JsonValue
  public String getValue() { return myValue; }
  private String myValue;
}
