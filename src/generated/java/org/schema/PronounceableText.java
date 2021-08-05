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

import com.fasterxml.jackson.databind.annotation.*;
import com.fasterxml.jackson.annotation.*;
import org.jetbrains.annotations.NotNull;
import java.util.*;

/**
 * Data type: PronounceableText.Source: https://github.com/schemaorg/schemaorg/issues/2108
 */
public class PronounceableText extends Text {
  /**
   * Representation of a text &lt;a class=&quot;localLink&quot; href=&quot;http://schema.org/textValue&quot;&gt;textValue&lt;/a&gt; using the specified &lt;a class=&quot;localLink&quot; href=&quot;http://schema.org/speechToTextMarkup&quot;&gt;speechToTextMarkup&lt;/a&gt;. For example the city name of Houston in IPA: /ˈhjuːstən/.
   */
  @JsonIgnore public String getPhoneticText() {
    return (String) getValue("phoneticText");
  }
  /**
   * Representation of a text &lt;a class=&quot;localLink&quot; href=&quot;http://schema.org/textValue&quot;&gt;textValue&lt;/a&gt; using the specified &lt;a class=&quot;localLink&quot; href=&quot;http://schema.org/speechToTextMarkup&quot;&gt;speechToTextMarkup&lt;/a&gt;. For example the city name of Houston in IPA: /ˈhjuːstən/.
   */
  @JsonIgnore public Collection<String> getPhoneticTexts() {
    final Object current = myData.get("phoneticText");
    if (current == null) return Collections.emptyList();
    if (current instanceof Collection) {
      return (Collection<String>) current;
    }
    return Arrays.asList((String) current);
  }
  /**
   * Form of markup used. eg. &lt;a href=&quot;https://www.w3.org/TR/speech-synthesis11&quot;&gt;SSML&lt;/a&gt; or &lt;a href=&quot;https://www.wikidata.org/wiki/Property:P898&quot;&gt;IPA&lt;/a&gt;.
   */
  @JsonIgnore public String getSpeechToTextMarkup() {
    return (String) getValue("speechToTextMarkup");
  }
  /**
   * Form of markup used. eg. &lt;a href=&quot;https://www.w3.org/TR/speech-synthesis11&quot;&gt;SSML&lt;/a&gt; or &lt;a href=&quot;https://www.wikidata.org/wiki/Property:P898&quot;&gt;IPA&lt;/a&gt;.
   */
  @JsonIgnore public Collection<String> getSpeechToTextMarkups() {
    final Object current = myData.get("speechToTextMarkup");
    if (current == null) return Collections.emptyList();
    if (current instanceof Collection) {
      return (Collection<String>) current;
    }
    return Arrays.asList((String) current);
  }
  /**
   * The language of the content or performance or used in an action. Please use one of the language codes from the &lt;a href=&quot;http://tools.ietf.org/html/bcp47&quot;&gt;IETF BCP 47 standard&lt;/a&gt;. See also &lt;a class=&quot;localLink&quot; href=&quot;http://schema.org/availableLanguage&quot;&gt;availableLanguage&lt;/a&gt;.
   */
  @JsonIgnore public Language getInLanguageLanguage() {
    return (Language) getValue("inLanguage");
  }
  /**
   * The language of the content or performance or used in an action. Please use one of the language codes from the &lt;a href=&quot;http://tools.ietf.org/html/bcp47&quot;&gt;IETF BCP 47 standard&lt;/a&gt;. See also &lt;a class=&quot;localLink&quot; href=&quot;http://schema.org/availableLanguage&quot;&gt;availableLanguage&lt;/a&gt;.
   */
  @JsonIgnore public Collection<Language> getInLanguageLanguages() {
    final Object current = myData.get("inLanguage");
    if (current == null) return Collections.emptyList();
    if (current instanceof Collection) {
      return (Collection<Language>) current;
    }
    return Arrays.asList((Language) current);
  }
  /**
   * The language of the content or performance or used in an action. Please use one of the language codes from the &lt;a href=&quot;http://tools.ietf.org/html/bcp47&quot;&gt;IETF BCP 47 standard&lt;/a&gt;. See also &lt;a class=&quot;localLink&quot; href=&quot;http://schema.org/availableLanguage&quot;&gt;availableLanguage&lt;/a&gt;.
   */
  @JsonIgnore public String getInLanguageString() {
    return (String) getValue("inLanguage");
  }
  /**
   * The language of the content or performance or used in an action. Please use one of the language codes from the &lt;a href=&quot;http://tools.ietf.org/html/bcp47&quot;&gt;IETF BCP 47 standard&lt;/a&gt;. See also &lt;a class=&quot;localLink&quot; href=&quot;http://schema.org/availableLanguage&quot;&gt;availableLanguage&lt;/a&gt;.
   */
  @JsonIgnore public Collection<String> getInLanguageStrings() {
    final Object current = myData.get("inLanguage");
    if (current == null) return Collections.emptyList();
    if (current instanceof Collection) {
      return (Collection<String>) current;
    }
    return Arrays.asList((String) current);
  }
  /**
   * Text value being annotated.
   */
  @JsonIgnore public String getTextValue() {
    return (String) getValue("textValue");
  }
  /**
   * Text value being annotated.
   */
  @JsonIgnore public Collection<String> getTextValues() {
    final Object current = myData.get("textValue");
    if (current == null) return Collections.emptyList();
    if (current instanceof Collection) {
      return (Collection<String>) current;
    }
    return Arrays.asList((String) current);
  }
  protected PronounceableText(java.util.Map<String,Object> data) {
    super(data);
  }
  
  /**
   * Builder for {@link PronounceableText}
   */
  public static class Builder extends Text.Builder {
    public Builder(@NotNull HashMap<String,Object> data) {
      super(data);
    }
    @NotNull public PronounceableText build() {
      return new PronounceableText(myData);
    }
    /**
     * Representation of a text &lt;a class=&quot;localLink&quot; href=&quot;http://schema.org/textValue&quot;&gt;textValue&lt;/a&gt; using the specified &lt;a class=&quot;localLink&quot; href=&quot;http://schema.org/speechToTextMarkup&quot;&gt;speechToTextMarkup&lt;/a&gt;. For example the city name of Houston in IPA: /ˈhjuːstən/.
     */
    @NotNull public Builder phoneticText(@NotNull String phoneticText) {
      putValue("phoneticText", phoneticText);
      return this;
    }
    /**
     * Form of markup used. eg. &lt;a href=&quot;https://www.w3.org/TR/speech-synthesis11&quot;&gt;SSML&lt;/a&gt; or &lt;a href=&quot;https://www.wikidata.org/wiki/Property:P898&quot;&gt;IPA&lt;/a&gt;.
     */
    @NotNull public Builder speechToTextMarkup(@NotNull String speechToTextMarkup) {
      putValue("speechToTextMarkup", speechToTextMarkup);
      return this;
    }
    /**
     * The language of the content or performance or used in an action. Please use one of the language codes from the &lt;a href=&quot;http://tools.ietf.org/html/bcp47&quot;&gt;IETF BCP 47 standard&lt;/a&gt;. See also &lt;a class=&quot;localLink&quot; href=&quot;http://schema.org/availableLanguage&quot;&gt;availableLanguage&lt;/a&gt;.
     */
    @NotNull public Builder inLanguage(@NotNull Language language) {
      putValue("inLanguage", language);
      return this;
    }
    /**
     * The language of the content or performance or used in an action. Please use one of the language codes from the &lt;a href=&quot;http://tools.ietf.org/html/bcp47&quot;&gt;IETF BCP 47 standard&lt;/a&gt;. See also &lt;a class=&quot;localLink&quot; href=&quot;http://schema.org/availableLanguage&quot;&gt;availableLanguage&lt;/a&gt;.
     */
    @NotNull public Builder inLanguage(@NotNull Language.Builder language) {
      putValue("inLanguage", language.build());
      return this;
    }
    /**
     * The language of the content or performance or used in an action. Please use one of the language codes from the &lt;a href=&quot;http://tools.ietf.org/html/bcp47&quot;&gt;IETF BCP 47 standard&lt;/a&gt;. See also &lt;a class=&quot;localLink&quot; href=&quot;http://schema.org/availableLanguage&quot;&gt;availableLanguage&lt;/a&gt;.
     */
    @NotNull public Builder inLanguage(@NotNull String inLanguage) {
      putValue("inLanguage", inLanguage);
      return this;
    }
    /**
     * Text value being annotated.
     */
    @NotNull public Builder textValue(@NotNull String textValue) {
      putValue("textValue", textValue);
      return this;
    }
    @Override protected void fromMap(String key, Object value) {
      if ("phoneticText".equals(key) && value instanceof String) { this.phoneticText((String)value); return; }
      if ("phoneticTexts".equals(key) && value instanceof String) { this.phoneticText((String)value); return; }
      if ("speechToTextMarkup".equals(key) && value instanceof String) { this.speechToTextMarkup((String)value); return; }
      if ("speechToTextMarkups".equals(key) && value instanceof String) { this.speechToTextMarkup((String)value); return; }
      if ("inLanguage".equals(key) && value instanceof Language) { this.inLanguage((Language)value); return; }
      if ("inLanguages".equals(key) && value instanceof Language) { this.inLanguage((Language)value); return; }
      if ("inLanguage".equals(key) && value instanceof String) { this.inLanguage((String)value); return; }
      if ("inLanguages".equals(key) && value instanceof String) { this.inLanguage((String)value); return; }
      if ("textValue".equals(key) && value instanceof String) { this.textValue((String)value); return; }
      if ("textValues".equals(key) && value instanceof String) { this.textValue((String)value); return; }
      super.fromMap(key, value);
    }
  }
  
}
