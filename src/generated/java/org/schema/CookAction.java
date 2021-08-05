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
 * The act of producing/preparing food.
 */
public class CookAction extends CreateAction {
  /**
   * A sub property of location. The specific food establishment where the action occurred.
   */
  @JsonIgnore public FoodEstablishment getFoodEstablishmentFoodEstablishment() {
    return (FoodEstablishment) getValue("foodEstablishment");
  }
  /**
   * A sub property of location. The specific food establishment where the action occurred.
   */
  @JsonIgnore public Collection<FoodEstablishment> getFoodEstablishmentFoodEstablishments() {
    final Object current = myData.get("foodEstablishment");
    if (current == null) return Collections.emptyList();
    if (current instanceof Collection) {
      return (Collection<FoodEstablishment>) current;
    }
    return Arrays.asList((FoodEstablishment) current);
  }
  /**
   * A sub property of location. The specific food establishment where the action occurred.
   */
  @JsonIgnore public Location getFoodEstablishmentLocation() {
    return (Location) getValue("foodEstablishment");
  }
  /**
   * A sub property of location. The specific food establishment where the action occurred.
   */
  @JsonIgnore public Collection<Location> getFoodEstablishmentLocations() {
    final Object current = myData.get("foodEstablishment");
    if (current == null) return Collections.emptyList();
    if (current instanceof Collection) {
      return (Collection<Location>) current;
    }
    return Arrays.asList((Location) current);
  }
  /**
   * A sub property of location. The specific food establishment where the action occurred.
   */
  @JsonIgnore public Place getFoodEstablishmentPlace() {
    return (Place) getValue("foodEstablishment");
  }
  /**
   * A sub property of location. The specific food establishment where the action occurred.
   */
  @JsonIgnore public Collection<Place> getFoodEstablishmentPlaces() {
    final Object current = myData.get("foodEstablishment");
    if (current == null) return Collections.emptyList();
    if (current instanceof Collection) {
      return (Collection<Place>) current;
    }
    return Arrays.asList((Place) current);
  }
  /**
   * A sub property of location. The specific food event where the action occurred.
   */
  @JsonIgnore public FoodEvent getFoodEventFoodEvent() {
    return (FoodEvent) getValue("foodEvent");
  }
  /**
   * A sub property of location. The specific food event where the action occurred.
   */
  @JsonIgnore public Collection<FoodEvent> getFoodEventFoodEvents() {
    final Object current = myData.get("foodEvent");
    if (current == null) return Collections.emptyList();
    if (current instanceof Collection) {
      return (Collection<FoodEvent>) current;
    }
    return Arrays.asList((FoodEvent) current);
  }
  /**
   * A sub property of location. The specific food event where the action occurred.
   */
  @JsonIgnore public Location getFoodEventLocation() {
    return (Location) getValue("foodEvent");
  }
  /**
   * A sub property of location. The specific food event where the action occurred.
   */
  @JsonIgnore public Collection<Location> getFoodEventLocations() {
    final Object current = myData.get("foodEvent");
    if (current == null) return Collections.emptyList();
    if (current instanceof Collection) {
      return (Collection<Location>) current;
    }
    return Arrays.asList((Location) current);
  }
  /**
   * A sub property of instrument. The recipe/instructions used to perform the action.
   */
  @JsonIgnore public Instrument getRecipeInstrument() {
    return (Instrument) getValue("recipe");
  }
  /**
   * A sub property of instrument. The recipe/instructions used to perform the action.
   */
  @JsonIgnore public Collection<Instrument> getRecipeInstruments() {
    final Object current = myData.get("recipe");
    if (current == null) return Collections.emptyList();
    if (current instanceof Collection) {
      return (Collection<Instrument>) current;
    }
    return Arrays.asList((Instrument) current);
  }
  /**
   * A sub property of instrument. The recipe/instructions used to perform the action.
   */
  @JsonIgnore public Recipe getRecipeRecipe() {
    return (Recipe) getValue("recipe");
  }
  /**
   * A sub property of instrument. The recipe/instructions used to perform the action.
   */
  @JsonIgnore public Collection<Recipe> getRecipeRecipes() {
    final Object current = myData.get("recipe");
    if (current == null) return Collections.emptyList();
    if (current instanceof Collection) {
      return (Collection<Recipe>) current;
    }
    return Arrays.asList((Recipe) current);
  }
  protected CookAction(java.util.Map<String,Object> data) {
    super(data);
  }
  
  /**
   * Builder for {@link CookAction}
   */
  public static class Builder extends CreateAction.Builder {
    public Builder(@NotNull HashMap<String,Object> data) {
      super(data);
    }
    @NotNull public CookAction build() {
      return new CookAction(myData);
    }
    /**
     * A sub property of location. The specific food establishment where the action occurred.
     */
    @NotNull public Builder foodEstablishment(@NotNull FoodEstablishment foodEstablishment) {
      putValue("foodEstablishment", foodEstablishment);
      return this;
    }
    /**
     * A sub property of location. The specific food establishment where the action occurred.
     */
    @NotNull public Builder foodEstablishment(@NotNull FoodEstablishment.Builder foodEstablishment) {
      putValue("foodEstablishment", foodEstablishment.build());
      return this;
    }
    /**
     * A sub property of location. The specific food establishment where the action occurred.
     */
    @NotNull public Builder foodEstablishment(@NotNull Location location) {
      putValue("foodEstablishment", location);
      return this;
    }
    /**
     * A sub property of location. The specific food establishment where the action occurred.
     */
    @NotNull public Builder foodEstablishment(@NotNull Place place) {
      putValue("foodEstablishment", place);
      return this;
    }
    /**
     * A sub property of location. The specific food establishment where the action occurred.
     */
    @NotNull public Builder foodEstablishment(@NotNull Place.Builder place) {
      putValue("foodEstablishment", place.build());
      return this;
    }
    /**
     * A sub property of location. The specific food event where the action occurred.
     */
    @NotNull public Builder foodEvent(@NotNull FoodEvent foodEvent) {
      putValue("foodEvent", foodEvent);
      return this;
    }
    /**
     * A sub property of location. The specific food event where the action occurred.
     */
    @NotNull public Builder foodEvent(@NotNull FoodEvent.Builder foodEvent) {
      putValue("foodEvent", foodEvent.build());
      return this;
    }
    /**
     * A sub property of location. The specific food event where the action occurred.
     */
    @NotNull public Builder foodEvent(@NotNull Location location) {
      putValue("foodEvent", location);
      return this;
    }
    /**
     * A sub property of instrument. The recipe/instructions used to perform the action.
     */
    @NotNull public Builder recipe(@NotNull Instrument instrument) {
      putValue("recipe", instrument);
      return this;
    }
    /**
     * A sub property of instrument. The recipe/instructions used to perform the action.
     */
    @NotNull public Builder recipe(@NotNull Recipe recipe) {
      putValue("recipe", recipe);
      return this;
    }
    /**
     * A sub property of instrument. The recipe/instructions used to perform the action.
     */
    @NotNull public Builder recipe(@NotNull Recipe.Builder recipe) {
      putValue("recipe", recipe.build());
      return this;
    }
    /**
     * The direct performer or driver of the action (animate or inanimate). e.g. *John* wrote a book.
     */
    @NotNull public Builder agent(@NotNull Organization organization) {
      putValue("agent", organization);
      return this;
    }
    /**
     * The direct performer or driver of the action (animate or inanimate). e.g. *John* wrote a book.
     */
    @NotNull public Builder agent(@NotNull Organization.Builder organization) {
      putValue("agent", organization.build());
      return this;
    }
    /**
     * The direct performer or driver of the action (animate or inanimate). e.g. *John* wrote a book.
     */
    @NotNull public Builder agent(@NotNull Person person) {
      putValue("agent", person);
      return this;
    }
    /**
     * The direct performer or driver of the action (animate or inanimate). e.g. *John* wrote a book.
     */
    @NotNull public Builder agent(@NotNull Person.Builder person) {
      putValue("agent", person.build());
      return this;
    }
    /**
     * The endTime of something. For a reserved event or service (e.g. FoodEstablishmentReservation), the time that it is expected to end. For actions that span a period of time, when the action was performed. e.g. John wrote a book from January to *December*. For media, including audio and video, it's the time offset of the end of a clip within a larger file.\n\nNote that Event uses startDate/endDate instead of startTime/endTime, even when describing dates with times. This situation may be clarified in future revisions.
     */
    @NotNull public Builder endTime(@NotNull java.util.Date date) {
      putValue("endTime", date);
      return this;
    }
    /**
     * The startTime of something. For a reserved event or service (e.g. FoodEstablishmentReservation), the time that it is expected to start. For actions that span a period of time, when the action was performed. e.g. John wrote a book from *January* to December. For media, including audio and video, it's the time offset of the start of a clip within a larger file.\n\nNote that Event uses startDate/endDate instead of startTime/endTime, even when describing dates with times. This situation may be clarified in future revisions.
     */
    @NotNull public Builder startTime(@NotNull java.util.Date date) {
      putValue("startTime", date);
      return this;
    }
    /**
     * Indicates the current disposition of the Action.
     */
    @NotNull public Builder actionStatus(@NotNull ActionStatusType actionStatusType) {
      putValue("actionStatus", actionStatusType);
      return this;
    }
    /**
     * For failed actions, more information on the cause of the failure.
     */
    @NotNull public Builder error(@NotNull Thing thing) {
      putValue("error", thing);
      return this;
    }
    /**
     * For failed actions, more information on the cause of the failure.
     */
    @NotNull public Builder error(@NotNull Thing.Builder thing) {
      putValue("error", thing.build());
      return this;
    }
    /**
     * Indicates a target EntryPoint for an Action.
     */
    @NotNull public Builder target(@NotNull EntryPoint entryPoint) {
      putValue("target", entryPoint);
      return this;
    }
    /**
     * Indicates a target EntryPoint for an Action.
     */
    @NotNull public Builder target(@NotNull EntryPoint.Builder entryPoint) {
      putValue("target", entryPoint.build());
      return this;
    }
    /**
     * An additional type for the item, typically used for adding more specific types from external vocabularies in microdata syntax. This is a relationship between something and a class that the thing is in. In RDFa syntax, it is better to use the native RDFa syntax - the 'typeof' attribute - for multiple types. Schema.org tools may have only weaker understanding of extra types, in particular those defined externally.
     */
    @NotNull public Builder additionalType(@NotNull String additionalType) {
      putValue("additionalType", additionalType);
      return this;
    }
    /**
     * An alias for the item.
     */
    @NotNull public Builder alternateName(@NotNull String alternateName) {
      putValue("alternateName", alternateName);
      return this;
    }
    /**
     * A sub property of description. A short description of the item used to disambiguate from other, similar items. Information from other properties (in particular, name) may be necessary for the description to be useful for disambiguation.
     */
    @NotNull public Builder disambiguatingDescription(@NotNull String disambiguatingDescription) {
      putValue("disambiguatingDescription", disambiguatingDescription);
      return this;
    }
    /**
     * Indicates a page (or other CreativeWork) for which this thing is the main entity being described. See [background notes](/docs/datamodel.html#mainEntityBackground) for details.
     */
    @NotNull public Builder mainEntityOfPage(@NotNull CreativeWork creativeWork) {
      putValue("mainEntityOfPage", creativeWork);
      return this;
    }
    /**
     * Indicates a page (or other CreativeWork) for which this thing is the main entity being described. See [background notes](/docs/datamodel.html#mainEntityBackground) for details.
     */
    @NotNull public Builder mainEntityOfPage(@NotNull CreativeWork.Builder creativeWork) {
      putValue("mainEntityOfPage", creativeWork.build());
      return this;
    }
    /**
     * Indicates a page (or other CreativeWork) for which this thing is the main entity being described. See [background notes](/docs/datamodel.html#mainEntityBackground) for details.
     */
    @NotNull public Builder mainEntityOfPage(@NotNull String mainEntityOfPage) {
      putValue("mainEntityOfPage", mainEntityOfPage);
      return this;
    }
    /**
     * The name of the item.
     */
    @NotNull public Builder name(@NotNull String name) {
      putValue("name", name);
      return this;
    }
    /**
     * URL of a reference Web page that unambiguously indicates the item's identity. E.g. the URL of the item's Wikipedia page, Wikidata entry, or official website.
     */
    @NotNull public Builder sameAs(@NotNull String sameAs) {
      putValue("sameAs", sameAs);
      return this;
    }
    /**
     * URL of the item.
     */
    @NotNull public Builder url(@NotNull String url) {
      putValue("url", url);
      return this;
    }
    /**
     * Indicates a potential Action, which describes an idealized action in which this thing would play an 'object' role.
     */
    @NotNull public Builder potentialAction(@NotNull Action action) {
      putValue("potentialAction", action);
      return this;
    }
    /**
     * Indicates a potential Action, which describes an idealized action in which this thing would play an 'object' role.
     */
    @NotNull public Builder potentialAction(@NotNull Action.Builder action) {
      putValue("potentialAction", action.build());
      return this;
    }
    /**
     * A CreativeWork or Event about this Thing.
     */
    @NotNull public Builder subjectOf(@NotNull CreativeWork creativeWork) {
      putValue("subjectOf", creativeWork);
      return this;
    }
    /**
     * A CreativeWork or Event about this Thing.
     */
    @NotNull public Builder subjectOf(@NotNull CreativeWork.Builder creativeWork) {
      putValue("subjectOf", creativeWork.build());
      return this;
    }
    /**
     * A CreativeWork or Event about this Thing.
     */
    @NotNull public Builder subjectOf(@NotNull Event event) {
      putValue("subjectOf", event);
      return this;
    }
    /**
     * A CreativeWork or Event about this Thing.
     */
    @NotNull public Builder subjectOf(@NotNull Event.Builder event) {
      putValue("subjectOf", event.build());
      return this;
    }
    @NotNull public Builder id(@NotNull String id) {
      myData.put("id", id);
      return this;
    }
    public Builder id(long id) {
      return id(Long.toString(id));
    }
    @Override protected void fromMap(String key, Object value) {
      if ("foodEstablishment".equals(key) && value instanceof FoodEstablishment) { foodEstablishment((FoodEstablishment)value); return; }
      if ("foodEstablishments".equals(key) && value instanceof FoodEstablishment) { foodEstablishment((FoodEstablishment)value); return; }
      if ("foodEstablishment".equals(key) && value instanceof Location) { foodEstablishment((Location)value); return; }
      if ("foodEstablishments".equals(key) && value instanceof Location) { foodEstablishment((Location)value); return; }
      if ("foodEstablishment".equals(key) && value instanceof Place) { foodEstablishment((Place)value); return; }
      if ("foodEstablishments".equals(key) && value instanceof Place) { foodEstablishment((Place)value); return; }
      if ("foodEvent".equals(key) && value instanceof FoodEvent) { foodEvent((FoodEvent)value); return; }
      if ("foodEvents".equals(key) && value instanceof FoodEvent) { foodEvent((FoodEvent)value); return; }
      if ("foodEvent".equals(key) && value instanceof Location) { foodEvent((Location)value); return; }
      if ("foodEvents".equals(key) && value instanceof Location) { foodEvent((Location)value); return; }
      if ("recipe".equals(key) && value instanceof Instrument) { recipe((Instrument)value); return; }
      if ("recipes".equals(key) && value instanceof Instrument) { recipe((Instrument)value); return; }
      if ("recipe".equals(key) && value instanceof Recipe) { recipe((Recipe)value); return; }
      if ("recipes".equals(key) && value instanceof Recipe) { recipe((Recipe)value); return; }
      super.fromMap(key, value);
    }
  }
  
}
