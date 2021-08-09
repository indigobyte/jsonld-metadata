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
import org.jetbrains.annotations.Nullable;
import java.util.*;

/**
 * Nutritional information about the recipe.
 */
public class NutritionInformation extends StructuredValue {
  /**
   * The number of milligrams of cholesterol.
   * @return cholesterolContent property set by first invocation of cholesterolContent method or {@code null}.
   */
  @JsonIgnore public Mass getCholesterolContent() {
    return (Mass) getValue("cholesterolContent");
  }
  /**
   * The number of milligrams of cholesterol.
   * @return all cholesterolContent properties as {@link java.util.Collection} or an empty collection 
   * if cholesterolContent was not set.
   */
  @JsonIgnore public java.util.Collection<Mass> getCholesterolContents() {
    final java.lang.Object current = myData.get("cholesterolContent");
    if (current == null) return Collections.emptyList();
    if (current instanceof java.util.Collection) {
      return (java.util.Collection<Mass>) current;
    }
    return Arrays.asList((Mass) current);
  }
  /**
   * The number of grams of trans fat.
   * @return transFatContent property set by first invocation of transFatContent method or {@code null}.
   */
  @JsonIgnore public Mass getTransFatContent() {
    return (Mass) getValue("transFatContent");
  }
  /**
   * The number of grams of trans fat.
   * @return all transFatContent properties as {@link java.util.Collection} or an empty collection 
   * if transFatContent was not set.
   */
  @JsonIgnore public java.util.Collection<Mass> getTransFatContents() {
    final java.lang.Object current = myData.get("transFatContent");
    if (current == null) return Collections.emptyList();
    if (current instanceof java.util.Collection) {
      return (java.util.Collection<Mass>) current;
    }
    return Arrays.asList((Mass) current);
  }
  /**
   * The number of grams of protein.
   * @return proteinContent property set by first invocation of proteinContent method or {@code null}.
   */
  @JsonIgnore public Mass getProteinContent() {
    return (Mass) getValue("proteinContent");
  }
  /**
   * The number of grams of protein.
   * @return all proteinContent properties as {@link java.util.Collection} or an empty collection 
   * if proteinContent was not set.
   */
  @JsonIgnore public java.util.Collection<Mass> getProteinContents() {
    final java.lang.Object current = myData.get("proteinContent");
    if (current == null) return Collections.emptyList();
    if (current instanceof java.util.Collection) {
      return (java.util.Collection<Mass>) current;
    }
    return Arrays.asList((Mass) current);
  }
  /**
   * The number of grams of fiber.
   * @return fiberContent property set by first invocation of fiberContent method or {@code null}.
   */
  @JsonIgnore public Mass getFiberContent() {
    return (Mass) getValue("fiberContent");
  }
  /**
   * The number of grams of fiber.
   * @return all fiberContent properties as {@link java.util.Collection} or an empty collection 
   * if fiberContent was not set.
   */
  @JsonIgnore public java.util.Collection<Mass> getFiberContents() {
    final java.lang.Object current = myData.get("fiberContent");
    if (current == null) return Collections.emptyList();
    if (current instanceof java.util.Collection) {
      return (java.util.Collection<Mass>) current;
    }
    return Arrays.asList((Mass) current);
  }
  /**
   * The number of grams of saturated fat.
   * @return saturatedFatContent property set by first invocation of saturatedFatContent method or {@code null}.
   */
  @JsonIgnore public Mass getSaturatedFatContent() {
    return (Mass) getValue("saturatedFatContent");
  }
  /**
   * The number of grams of saturated fat.
   * @return all saturatedFatContent properties as {@link java.util.Collection} or an empty collection 
   * if saturatedFatContent was not set.
   */
  @JsonIgnore public java.util.Collection<Mass> getSaturatedFatContents() {
    final java.lang.Object current = myData.get("saturatedFatContent");
    if (current == null) return Collections.emptyList();
    if (current instanceof java.util.Collection) {
      return (java.util.Collection<Mass>) current;
    }
    return Arrays.asList((Mass) current);
  }
  /**
   * The serving size, in terms of the number of volume or mass.
   * @return servingSize property set by first invocation of servingSize method or {@code null}.
   */
  @JsonIgnore public String getServingSize() {
    return (String) getValue("servingSize");
  }
  /**
   * The serving size, in terms of the number of volume or mass.
   * @return all servingSize properties as {@link java.util.Collection} or an empty collection 
   * if servingSize was not set.
   */
  @JsonIgnore public java.util.Collection<String> getServingSizes() {
    final java.lang.Object current = myData.get("servingSize");
    if (current == null) return Collections.emptyList();
    if (current instanceof java.util.Collection) {
      return (java.util.Collection<String>) current;
    }
    return Arrays.asList((String) current);
  }
  /**
   * The number of grams of carbohydrates.
   * @return carbohydrateContent property set by first invocation of carbohydrateContent method or {@code null}.
   */
  @JsonIgnore public Mass getCarbohydrateContent() {
    return (Mass) getValue("carbohydrateContent");
  }
  /**
   * The number of grams of carbohydrates.
   * @return all carbohydrateContent properties as {@link java.util.Collection} or an empty collection 
   * if carbohydrateContent was not set.
   */
  @JsonIgnore public java.util.Collection<Mass> getCarbohydrateContents() {
    final java.lang.Object current = myData.get("carbohydrateContent");
    if (current == null) return Collections.emptyList();
    if (current instanceof java.util.Collection) {
      return (java.util.Collection<Mass>) current;
    }
    return Arrays.asList((Mass) current);
  }
  /**
   * The number of calories.
   * @return calories property set by first invocation of calories method or {@code null}.
   */
  @JsonIgnore public Energy getCalories() {
    return (Energy) getValue("calories");
  }
  /**
   * The number of calories.
   * @return all calories properties as {@link java.util.Collection} or an empty collection 
   * if calories was not set.
   */
  @JsonIgnore public java.util.Collection<Energy> getCaloriess() {
    final java.lang.Object current = myData.get("calories");
    if (current == null) return Collections.emptyList();
    if (current instanceof java.util.Collection) {
      return (java.util.Collection<Energy>) current;
    }
    return Arrays.asList((Energy) current);
  }
  /**
   * The number of grams of fat.
   * @return fatContent property set by first invocation of fatContent method or {@code null}.
   */
  @JsonIgnore public Mass getFatContent() {
    return (Mass) getValue("fatContent");
  }
  /**
   * The number of grams of fat.
   * @return all fatContent properties as {@link java.util.Collection} or an empty collection 
   * if fatContent was not set.
   */
  @JsonIgnore public java.util.Collection<Mass> getFatContents() {
    final java.lang.Object current = myData.get("fatContent");
    if (current == null) return Collections.emptyList();
    if (current instanceof java.util.Collection) {
      return (java.util.Collection<Mass>) current;
    }
    return Arrays.asList((Mass) current);
  }
  /**
   * The number of grams of sugar.
   * @return sugarContent property set by first invocation of sugarContent method or {@code null}.
   */
  @JsonIgnore public Mass getSugarContent() {
    return (Mass) getValue("sugarContent");
  }
  /**
   * The number of grams of sugar.
   * @return all sugarContent properties as {@link java.util.Collection} or an empty collection 
   * if sugarContent was not set.
   */
  @JsonIgnore public java.util.Collection<Mass> getSugarContents() {
    final java.lang.Object current = myData.get("sugarContent");
    if (current == null) return Collections.emptyList();
    if (current instanceof java.util.Collection) {
      return (java.util.Collection<Mass>) current;
    }
    return Arrays.asList((Mass) current);
  }
  /**
   * The number of grams of unsaturated fat.
   * @return unsaturatedFatContent property set by first invocation of unsaturatedFatContent method or {@code null}.
   */
  @JsonIgnore public Mass getUnsaturatedFatContent() {
    return (Mass) getValue("unsaturatedFatContent");
  }
  /**
   * The number of grams of unsaturated fat.
   * @return all unsaturatedFatContent properties as {@link java.util.Collection} or an empty collection 
   * if unsaturatedFatContent was not set.
   */
  @JsonIgnore public java.util.Collection<Mass> getUnsaturatedFatContents() {
    final java.lang.Object current = myData.get("unsaturatedFatContent");
    if (current == null) return Collections.emptyList();
    if (current instanceof java.util.Collection) {
      return (java.util.Collection<Mass>) current;
    }
    return Arrays.asList((Mass) current);
  }
  /**
   * The number of milligrams of sodium.
   * @return sodiumContent property set by first invocation of sodiumContent method or {@code null}.
   */
  @JsonIgnore public Mass getSodiumContent() {
    return (Mass) getValue("sodiumContent");
  }
  /**
   * The number of milligrams of sodium.
   * @return all sodiumContent properties as {@link java.util.Collection} or an empty collection 
   * if sodiumContent was not set.
   */
  @JsonIgnore public java.util.Collection<Mass> getSodiumContents() {
    final java.lang.Object current = myData.get("sodiumContent");
    if (current == null) return Collections.emptyList();
    if (current instanceof java.util.Collection) {
      return (java.util.Collection<Mass>) current;
    }
    return Arrays.asList((Mass) current);
  }
  protected NutritionInformation(java.util.Map<String,java.lang.Object> data) {
    super(data);
  }
  
  /**
   * Builder for {@link NutritionInformation}
   */
  public static class Builder extends StructuredValue.Builder {
    public Builder(@NotNull HashMap<String,java.lang.Object> data) {
      super(data);
    }
    @NotNull public NutritionInformation build() {
      return new NutritionInformation(myData);
    }
    /**
     * The number of milligrams of cholesterol.
     * @param mass value to set
     * @return this builder instance
     */
    @NotNull public Builder cholesterolContent(@NotNull Mass mass) {
      putValue("cholesterolContent", mass);
      return this;
    }
    /**
     * The number of milligrams of cholesterol.
     * @param mass value to set
     * @return this builder instance
     */
    @NotNull public Builder cholesterolContent(@NotNull Mass.Builder mass) {
      putValue("cholesterolContent", mass.build());
      return this;
    }
    /**
     * Remove cholesterolContent property from the builder.
     * If this property is repeatable, all instances are removed.
     * @return this builder instance
     */
    @NotNull public Builder removeCholesterolContent() {
      removeValue("cholesterolContent");
      return this;
    }
    /**
     * Get currently set value for cholesterolContent property in this builder.
     * @return previously set value or {@code null}. If multiple values have been 
     * set to this property, then {@link java.util.Collection} instance will be 
     * returned.
     */
    @Nullable public java.lang.Object getCholesterolContent() {
      return myData.get("cholesterolContent");
    }
    /**
     * The number of grams of trans fat.
     * @param mass value to set
     * @return this builder instance
     */
    @NotNull public Builder transFatContent(@NotNull Mass mass) {
      putValue("transFatContent", mass);
      return this;
    }
    /**
     * The number of grams of trans fat.
     * @param mass value to set
     * @return this builder instance
     */
    @NotNull public Builder transFatContent(@NotNull Mass.Builder mass) {
      putValue("transFatContent", mass.build());
      return this;
    }
    /**
     * Remove transFatContent property from the builder.
     * If this property is repeatable, all instances are removed.
     * @return this builder instance
     */
    @NotNull public Builder removeTransFatContent() {
      removeValue("transFatContent");
      return this;
    }
    /**
     * Get currently set value for transFatContent property in this builder.
     * @return previously set value or {@code null}. If multiple values have been 
     * set to this property, then {@link java.util.Collection} instance will be 
     * returned.
     */
    @Nullable public java.lang.Object getTransFatContent() {
      return myData.get("transFatContent");
    }
    /**
     * The number of grams of protein.
     * @param mass value to set
     * @return this builder instance
     */
    @NotNull public Builder proteinContent(@NotNull Mass mass) {
      putValue("proteinContent", mass);
      return this;
    }
    /**
     * The number of grams of protein.
     * @param mass value to set
     * @return this builder instance
     */
    @NotNull public Builder proteinContent(@NotNull Mass.Builder mass) {
      putValue("proteinContent", mass.build());
      return this;
    }
    /**
     * Remove proteinContent property from the builder.
     * If this property is repeatable, all instances are removed.
     * @return this builder instance
     */
    @NotNull public Builder removeProteinContent() {
      removeValue("proteinContent");
      return this;
    }
    /**
     * Get currently set value for proteinContent property in this builder.
     * @return previously set value or {@code null}. If multiple values have been 
     * set to this property, then {@link java.util.Collection} instance will be 
     * returned.
     */
    @Nullable public java.lang.Object getProteinContent() {
      return myData.get("proteinContent");
    }
    /**
     * The number of grams of fiber.
     * @param mass value to set
     * @return this builder instance
     */
    @NotNull public Builder fiberContent(@NotNull Mass mass) {
      putValue("fiberContent", mass);
      return this;
    }
    /**
     * The number of grams of fiber.
     * @param mass value to set
     * @return this builder instance
     */
    @NotNull public Builder fiberContent(@NotNull Mass.Builder mass) {
      putValue("fiberContent", mass.build());
      return this;
    }
    /**
     * Remove fiberContent property from the builder.
     * If this property is repeatable, all instances are removed.
     * @return this builder instance
     */
    @NotNull public Builder removeFiberContent() {
      removeValue("fiberContent");
      return this;
    }
    /**
     * Get currently set value for fiberContent property in this builder.
     * @return previously set value or {@code null}. If multiple values have been 
     * set to this property, then {@link java.util.Collection} instance will be 
     * returned.
     */
    @Nullable public java.lang.Object getFiberContent() {
      return myData.get("fiberContent");
    }
    /**
     * The number of grams of saturated fat.
     * @param mass value to set
     * @return this builder instance
     */
    @NotNull public Builder saturatedFatContent(@NotNull Mass mass) {
      putValue("saturatedFatContent", mass);
      return this;
    }
    /**
     * The number of grams of saturated fat.
     * @param mass value to set
     * @return this builder instance
     */
    @NotNull public Builder saturatedFatContent(@NotNull Mass.Builder mass) {
      putValue("saturatedFatContent", mass.build());
      return this;
    }
    /**
     * Remove saturatedFatContent property from the builder.
     * If this property is repeatable, all instances are removed.
     * @return this builder instance
     */
    @NotNull public Builder removeSaturatedFatContent() {
      removeValue("saturatedFatContent");
      return this;
    }
    /**
     * Get currently set value for saturatedFatContent property in this builder.
     * @return previously set value or {@code null}. If multiple values have been 
     * set to this property, then {@link java.util.Collection} instance will be 
     * returned.
     */
    @Nullable public java.lang.Object getSaturatedFatContent() {
      return myData.get("saturatedFatContent");
    }
    /**
     * The serving size, in terms of the number of volume or mass.
     * @param servingSize value to set
     * @return this builder instance
     */
    @NotNull public Builder servingSize(@NotNull String servingSize) {
      putValue("servingSize", servingSize);
      return this;
    }
    /**
     * Remove servingSize property from the builder.
     * If this property is repeatable, all instances are removed.
     * @return this builder instance
     */
    @NotNull public Builder removeServingSize() {
      removeValue("servingSize");
      return this;
    }
    /**
     * Get currently set value for servingSize property in this builder.
     * @return previously set value or {@code null}. If multiple values have been 
     * set to this property, then {@link java.util.Collection} instance will be 
     * returned.
     */
    @Nullable public java.lang.Object getServingSize() {
      return myData.get("servingSize");
    }
    /**
     * The number of grams of carbohydrates.
     * @param mass value to set
     * @return this builder instance
     */
    @NotNull public Builder carbohydrateContent(@NotNull Mass mass) {
      putValue("carbohydrateContent", mass);
      return this;
    }
    /**
     * The number of grams of carbohydrates.
     * @param mass value to set
     * @return this builder instance
     */
    @NotNull public Builder carbohydrateContent(@NotNull Mass.Builder mass) {
      putValue("carbohydrateContent", mass.build());
      return this;
    }
    /**
     * Remove carbohydrateContent property from the builder.
     * If this property is repeatable, all instances are removed.
     * @return this builder instance
     */
    @NotNull public Builder removeCarbohydrateContent() {
      removeValue("carbohydrateContent");
      return this;
    }
    /**
     * Get currently set value for carbohydrateContent property in this builder.
     * @return previously set value or {@code null}. If multiple values have been 
     * set to this property, then {@link java.util.Collection} instance will be 
     * returned.
     */
    @Nullable public java.lang.Object getCarbohydrateContent() {
      return myData.get("carbohydrateContent");
    }
    /**
     * The number of calories.
     * @param energy value to set
     * @return this builder instance
     */
    @NotNull public Builder calories(@NotNull Energy energy) {
      putValue("calories", energy);
      return this;
    }
    /**
     * The number of calories.
     * @param energy value to set
     * @return this builder instance
     */
    @NotNull public Builder calories(@NotNull Energy.Builder energy) {
      putValue("calories", energy.build());
      return this;
    }
    /**
     * Remove calories property from the builder.
     * If this property is repeatable, all instances are removed.
     * @return this builder instance
     */
    @NotNull public Builder removeCalories() {
      removeValue("calories");
      return this;
    }
    /**
     * Get currently set value for calories property in this builder.
     * @return previously set value or {@code null}. If multiple values have been 
     * set to this property, then {@link java.util.Collection} instance will be 
     * returned.
     */
    @Nullable public java.lang.Object getCalories() {
      return myData.get("calories");
    }
    /**
     * The number of grams of fat.
     * @param mass value to set
     * @return this builder instance
     */
    @NotNull public Builder fatContent(@NotNull Mass mass) {
      putValue("fatContent", mass);
      return this;
    }
    /**
     * The number of grams of fat.
     * @param mass value to set
     * @return this builder instance
     */
    @NotNull public Builder fatContent(@NotNull Mass.Builder mass) {
      putValue("fatContent", mass.build());
      return this;
    }
    /**
     * Remove fatContent property from the builder.
     * If this property is repeatable, all instances are removed.
     * @return this builder instance
     */
    @NotNull public Builder removeFatContent() {
      removeValue("fatContent");
      return this;
    }
    /**
     * Get currently set value for fatContent property in this builder.
     * @return previously set value or {@code null}. If multiple values have been 
     * set to this property, then {@link java.util.Collection} instance will be 
     * returned.
     */
    @Nullable public java.lang.Object getFatContent() {
      return myData.get("fatContent");
    }
    /**
     * The number of grams of sugar.
     * @param mass value to set
     * @return this builder instance
     */
    @NotNull public Builder sugarContent(@NotNull Mass mass) {
      putValue("sugarContent", mass);
      return this;
    }
    /**
     * The number of grams of sugar.
     * @param mass value to set
     * @return this builder instance
     */
    @NotNull public Builder sugarContent(@NotNull Mass.Builder mass) {
      putValue("sugarContent", mass.build());
      return this;
    }
    /**
     * Remove sugarContent property from the builder.
     * If this property is repeatable, all instances are removed.
     * @return this builder instance
     */
    @NotNull public Builder removeSugarContent() {
      removeValue("sugarContent");
      return this;
    }
    /**
     * Get currently set value for sugarContent property in this builder.
     * @return previously set value or {@code null}. If multiple values have been 
     * set to this property, then {@link java.util.Collection} instance will be 
     * returned.
     */
    @Nullable public java.lang.Object getSugarContent() {
      return myData.get("sugarContent");
    }
    /**
     * The number of grams of unsaturated fat.
     * @param mass value to set
     * @return this builder instance
     */
    @NotNull public Builder unsaturatedFatContent(@NotNull Mass mass) {
      putValue("unsaturatedFatContent", mass);
      return this;
    }
    /**
     * The number of grams of unsaturated fat.
     * @param mass value to set
     * @return this builder instance
     */
    @NotNull public Builder unsaturatedFatContent(@NotNull Mass.Builder mass) {
      putValue("unsaturatedFatContent", mass.build());
      return this;
    }
    /**
     * Remove unsaturatedFatContent property from the builder.
     * If this property is repeatable, all instances are removed.
     * @return this builder instance
     */
    @NotNull public Builder removeUnsaturatedFatContent() {
      removeValue("unsaturatedFatContent");
      return this;
    }
    /**
     * Get currently set value for unsaturatedFatContent property in this builder.
     * @return previously set value or {@code null}. If multiple values have been 
     * set to this property, then {@link java.util.Collection} instance will be 
     * returned.
     */
    @Nullable public java.lang.Object getUnsaturatedFatContent() {
      return myData.get("unsaturatedFatContent");
    }
    /**
     * The number of milligrams of sodium.
     * @param mass value to set
     * @return this builder instance
     */
    @NotNull public Builder sodiumContent(@NotNull Mass mass) {
      putValue("sodiumContent", mass);
      return this;
    }
    /**
     * The number of milligrams of sodium.
     * @param mass value to set
     * @return this builder instance
     */
    @NotNull public Builder sodiumContent(@NotNull Mass.Builder mass) {
      putValue("sodiumContent", mass.build());
      return this;
    }
    /**
     * Remove sodiumContent property from the builder.
     * If this property is repeatable, all instances are removed.
     * @return this builder instance
     */
    @NotNull public Builder removeSodiumContent() {
      removeValue("sodiumContent");
      return this;
    }
    /**
     * Get currently set value for sodiumContent property in this builder.
     * @return previously set value or {@code null}. If multiple values have been 
     * set to this property, then {@link java.util.Collection} instance will be 
     * returned.
     */
    @Nullable public java.lang.Object getSodiumContent() {
      return myData.get("sodiumContent");
    }
    /**
     * The identifier property represents any kind of identifier for any kind of [[Thing]], such as ISBNs, GTIN codes, UUIDs etc. Schema.org provides dedicated properties for representing many of these, either as textual strings or as URL (URI) links. See [background notes](/docs/datamodel.html#identifierBg) for more details.
     * 
     * @param identifier value to set
     * @return this builder instance
     */
    @NotNull public Builder identifier(@NotNull Identifier identifier) {
      putValue("identifier", identifier);
      return this;
    }
    /**
     * Remove identifier property from the builder.
     * If this property is repeatable, all instances are removed.
     * @return this builder instance
     */
    @NotNull public Builder removeIdentifier() {
      removeValue("identifier");
      return this;
    }
    /**
     * Get currently set value for identifier property in this builder.
     * @return previously set value or {@code null}. If multiple values have been 
     * set to this property, then {@link java.util.Collection} instance will be 
     * returned.
     */
    @Nullable public java.lang.Object getIdentifier() {
      return myData.get("identifier");
    }
    /**
     * An image of the item. This can be a [[URL]] or a fully described [[ImageObject]].
     * @param image value to set
     * @return this builder instance
     */
    @NotNull public Builder image(@NotNull Image image) {
      putValue("image", image);
      return this;
    }
    /**
     * Remove image property from the builder.
     * If this property is repeatable, all instances are removed.
     * @return this builder instance
     */
    @NotNull public Builder removeImage() {
      removeValue("image");
      return this;
    }
    /**
     * Get currently set value for image property in this builder.
     * @return previously set value or {@code null}. If multiple values have been 
     * set to this property, then {@link java.util.Collection} instance will be 
     * returned.
     */
    @Nullable public java.lang.Object getImage() {
      return myData.get("image");
    }
    /**
     * Indicates a potential Action, which describes an idealized action in which this thing would play an 'object' role.
     * @param action value to set
     * @return this builder instance
     */
    @NotNull public Builder potentialAction(@NotNull Action action) {
      putValue("potentialAction", action);
      return this;
    }
    /**
     * Indicates a potential Action, which describes an idealized action in which this thing would play an 'object' role.
     * @param action value to set
     * @return this builder instance
     */
    @NotNull public Builder potentialAction(@NotNull Action.Builder action) {
      putValue("potentialAction", action.build());
      return this;
    }
    /**
     * Remove potentialAction property from the builder.
     * If this property is repeatable, all instances are removed.
     * @return this builder instance
     */
    @NotNull public Builder removePotentialAction() {
      removeValue("potentialAction");
      return this;
    }
    /**
     * Get currently set value for potentialAction property in this builder.
     * @return previously set value or {@code null}. If multiple values have been 
     * set to this property, then {@link java.util.Collection} instance will be 
     * returned.
     */
    @Nullable public java.lang.Object getPotentialAction() {
      return myData.get("potentialAction");
    }
    /**
     * A sub property of description. A short description of the item used to disambiguate from other, similar items. Information from other properties (in particular, name) may be necessary for the description to be useful for disambiguation.
     * @param disambiguatingDescription value to set
     * @return this builder instance
     */
    @NotNull public Builder disambiguatingDescription(@NotNull String disambiguatingDescription) {
      putValue("disambiguatingDescription", disambiguatingDescription);
      return this;
    }
    /**
     * Remove disambiguatingDescription property from the builder.
     * If this property is repeatable, all instances are removed.
     * @return this builder instance
     */
    @NotNull public Builder removeDisambiguatingDescription() {
      removeValue("disambiguatingDescription");
      return this;
    }
    /**
     * Get currently set value for disambiguatingDescription property in this builder.
     * @return previously set value or {@code null}. If multiple values have been 
     * set to this property, then {@link java.util.Collection} instance will be 
     * returned.
     */
    @Nullable public java.lang.Object getDisambiguatingDescription() {
      return myData.get("disambiguatingDescription");
    }
    /**
     * A description of the item.
     * @param description value to set
     * @return this builder instance
     */
    @NotNull public Builder description(@NotNull String description) {
      putValue("description", description);
      return this;
    }
    /**
     * Remove description property from the builder.
     * If this property is repeatable, all instances are removed.
     * @return this builder instance
     */
    @NotNull public Builder removeDescription() {
      removeValue("description");
      return this;
    }
    /**
     * Get currently set value for description property in this builder.
     * @return previously set value or {@code null}. If multiple values have been 
     * set to this property, then {@link java.util.Collection} instance will be 
     * returned.
     */
    @Nullable public java.lang.Object getDescription() {
      return myData.get("description");
    }
    /**
     * URL of the item.
     * @param url value to set
     * @return this builder instance
     */
    @NotNull public Builder url(@NotNull String url) {
      putValue("url", url);
      return this;
    }
    /**
     * Remove url property from the builder.
     * If this property is repeatable, all instances are removed.
     * @return this builder instance
     */
    @NotNull public Builder removeUrl() {
      removeValue("url");
      return this;
    }
    /**
     * Get currently set value for url property in this builder.
     * @return previously set value or {@code null}. If multiple values have been 
     * set to this property, then {@link java.util.Collection} instance will be 
     * returned.
     */
    @Nullable public java.lang.Object getUrl() {
      return myData.get("url");
    }
    /**
     * An additional type for the item, typically used for adding more specific types from external vocabularies in microdata syntax. This is a relationship between something and a class that the thing is in. In RDFa syntax, it is better to use the native RDFa syntax - the 'typeof' attribute - for multiple types. Schema.org tools may have only weaker understanding of extra types, in particular those defined externally.
     * @param additionalType value to set
     * @return this builder instance
     */
    @NotNull public Builder additionalType(@NotNull String additionalType) {
      putValue("additionalType", additionalType);
      return this;
    }
    /**
     * Remove additionalType property from the builder.
     * If this property is repeatable, all instances are removed.
     * @return this builder instance
     */
    @NotNull public Builder removeAdditionalType() {
      removeValue("additionalType");
      return this;
    }
    /**
     * Get currently set value for additionalType property in this builder.
     * @return previously set value or {@code null}. If multiple values have been 
     * set to this property, then {@link java.util.Collection} instance will be 
     * returned.
     */
    @Nullable public java.lang.Object getAdditionalType() {
      return myData.get("additionalType");
    }
    /**
     * URL of a reference Web page that unambiguously indicates the item's identity. E.g. the URL of the item's Wikipedia page, Wikidata entry, or official website.
     * @param sameAs value to set
     * @return this builder instance
     */
    @NotNull public Builder sameAs(@NotNull String sameAs) {
      putValue("sameAs", sameAs);
      return this;
    }
    /**
     * Remove sameAs property from the builder.
     * If this property is repeatable, all instances are removed.
     * @return this builder instance
     */
    @NotNull public Builder removeSameAs() {
      removeValue("sameAs");
      return this;
    }
    /**
     * Get currently set value for sameAs property in this builder.
     * @return previously set value or {@code null}. If multiple values have been 
     * set to this property, then {@link java.util.Collection} instance will be 
     * returned.
     */
    @Nullable public java.lang.Object getSameAs() {
      return myData.get("sameAs");
    }
    /**
     * An alias for the item.
     * @param alternateName value to set
     * @return this builder instance
     */
    @NotNull public Builder alternateName(@NotNull String alternateName) {
      putValue("alternateName", alternateName);
      return this;
    }
    /**
     * Remove alternateName property from the builder.
     * If this property is repeatable, all instances are removed.
     * @return this builder instance
     */
    @NotNull public Builder removeAlternateName() {
      removeValue("alternateName");
      return this;
    }
    /**
     * Get currently set value for alternateName property in this builder.
     * @return previously set value or {@code null}. If multiple values have been 
     * set to this property, then {@link java.util.Collection} instance will be 
     * returned.
     */
    @Nullable public java.lang.Object getAlternateName() {
      return myData.get("alternateName");
    }
    /**
     * The name of the item.
     * @param name value to set
     * @return this builder instance
     */
    @NotNull public Builder name(@NotNull String name) {
      putValue("name", name);
      return this;
    }
    /**
     * Remove name property from the builder.
     * If this property is repeatable, all instances are removed.
     * @return this builder instance
     */
    @NotNull public Builder removeName() {
      removeValue("name");
      return this;
    }
    /**
     * Get currently set value for name property in this builder.
     * @return previously set value or {@code null}. If multiple values have been 
     * set to this property, then {@link java.util.Collection} instance will be 
     * returned.
     */
    @Nullable public java.lang.Object getName() {
      return myData.get("name");
    }
    /**
     * A CreativeWork or Event about this Thing.
     * @param creativeWork value to set
     * @return this builder instance
     */
    @NotNull public Builder subjectOf(@NotNull CreativeWork creativeWork) {
      putValue("subjectOf", creativeWork);
      return this;
    }
    /**
     * A CreativeWork or Event about this Thing.
     * @param creativeWork value to set
     * @return this builder instance
     */
    @NotNull public Builder subjectOf(@NotNull CreativeWork.Builder creativeWork) {
      putValue("subjectOf", creativeWork.build());
      return this;
    }
    /**
     * A CreativeWork or Event about this Thing.
     * @param event value to set
     * @return this builder instance
     */
    @NotNull public Builder subjectOf(@NotNull Event event) {
      putValue("subjectOf", event);
      return this;
    }
    /**
     * A CreativeWork or Event about this Thing.
     * @param event value to set
     * @return this builder instance
     */
    @NotNull public Builder subjectOf(@NotNull Event.Builder event) {
      putValue("subjectOf", event.build());
      return this;
    }
    /**
     * Remove subjectOf property from the builder.
     * If this property is repeatable, all instances are removed.
     * @return this builder instance
     */
    @NotNull public Builder removeSubjectOf() {
      removeValue("subjectOf");
      return this;
    }
    /**
     * Get currently set value for subjectOf property in this builder.
     * @return previously set value or {@code null}. If multiple values have been 
     * set to this property, then {@link java.util.Collection} instance will be 
     * returned.
     */
    @Nullable public java.lang.Object getSubjectOf() {
      return myData.get("subjectOf");
    }
    /**
     * Indicates a page (or other CreativeWork) for which this thing is the main entity being described. See [background notes](/docs/datamodel.html#mainEntityBackground) for details.
     * @param creativeWork value to set
     * @return this builder instance
     */
    @NotNull public Builder mainEntityOfPage(@NotNull CreativeWork creativeWork) {
      putValue("mainEntityOfPage", creativeWork);
      return this;
    }
    /**
     * Indicates a page (or other CreativeWork) for which this thing is the main entity being described. See [background notes](/docs/datamodel.html#mainEntityBackground) for details.
     * @param creativeWork value to set
     * @return this builder instance
     */
    @NotNull public Builder mainEntityOfPage(@NotNull CreativeWork.Builder creativeWork) {
      putValue("mainEntityOfPage", creativeWork.build());
      return this;
    }
    /**
     * Indicates a page (or other CreativeWork) for which this thing is the main entity being described. See [background notes](/docs/datamodel.html#mainEntityBackground) for details.
     * @param mainEntityOfPage value to set
     * @return this builder instance
     */
    @NotNull public Builder mainEntityOfPage(@NotNull String mainEntityOfPage) {
      putValue("mainEntityOfPage", mainEntityOfPage);
      return this;
    }
    /**
     * Remove mainEntityOfPage property from the builder.
     * If this property is repeatable, all instances are removed.
     * @return this builder instance
     */
    @NotNull public Builder removeMainEntityOfPage() {
      removeValue("mainEntityOfPage");
      return this;
    }
    /**
     * Get currently set value for mainEntityOfPage property in this builder.
     * @return previously set value or {@code null}. If multiple values have been 
     * set to this property, then {@link java.util.Collection} instance will be 
     * returned.
     */
    @Nullable public java.lang.Object getMainEntityOfPage() {
      return myData.get("mainEntityOfPage");
    }
    /**
     * null
     * @param id value to set
     * @return this builder instance
     */
    @NotNull public Builder id(@NotNull String id) {
      myData.put("id", id);
      return this;
    }
    /**
     * Remove id property from the builder.
     * If this property is repeatable, all instances are removed.
     * @return this builder instance
     */
    @NotNull public Builder removeId() {
      removeValue("id");
      return this;
    }
    /**
     * Get currently set value for id property in this builder.
     * @return previously set value or {@code null}. If multiple values have been 
     * set to this property, then {@link java.util.Collection} instance will be 
     * returned.
     */
    @Nullable public java.lang.Object getId() {
      return myData.get("id");
    }
    public Builder id(long id) {
      return id(Long.toString(id));
    }
    @Override protected void fromMap(String key, java.lang.Object value) {
      if ("cholesterolContent".equals(key) && value instanceof Mass) { this.cholesterolContent((Mass)value); return; }
      if ("cholesterolContents".equals(key) && value instanceof Mass) { this.cholesterolContent((Mass)value); return; }
      if ("transFatContent".equals(key) && value instanceof Mass) { this.transFatContent((Mass)value); return; }
      if ("transFatContents".equals(key) && value instanceof Mass) { this.transFatContent((Mass)value); return; }
      if ("proteinContent".equals(key) && value instanceof Mass) { this.proteinContent((Mass)value); return; }
      if ("proteinContents".equals(key) && value instanceof Mass) { this.proteinContent((Mass)value); return; }
      if ("fiberContent".equals(key) && value instanceof Mass) { this.fiberContent((Mass)value); return; }
      if ("fiberContents".equals(key) && value instanceof Mass) { this.fiberContent((Mass)value); return; }
      if ("saturatedFatContent".equals(key) && value instanceof Mass) { this.saturatedFatContent((Mass)value); return; }
      if ("saturatedFatContents".equals(key) && value instanceof Mass) { this.saturatedFatContent((Mass)value); return; }
      if ("servingSize".equals(key) && value instanceof String) { this.servingSize((String)value); return; }
      if ("servingSizes".equals(key) && value instanceof String) { this.servingSize((String)value); return; }
      if ("carbohydrateContent".equals(key) && value instanceof Mass) { this.carbohydrateContent((Mass)value); return; }
      if ("carbohydrateContents".equals(key) && value instanceof Mass) { this.carbohydrateContent((Mass)value); return; }
      if ("calories".equals(key) && value instanceof Energy) { this.calories((Energy)value); return; }
      if ("caloriess".equals(key) && value instanceof Energy) { this.calories((Energy)value); return; }
      if ("fatContent".equals(key) && value instanceof Mass) { this.fatContent((Mass)value); return; }
      if ("fatContents".equals(key) && value instanceof Mass) { this.fatContent((Mass)value); return; }
      if ("sugarContent".equals(key) && value instanceof Mass) { this.sugarContent((Mass)value); return; }
      if ("sugarContents".equals(key) && value instanceof Mass) { this.sugarContent((Mass)value); return; }
      if ("unsaturatedFatContent".equals(key) && value instanceof Mass) { this.unsaturatedFatContent((Mass)value); return; }
      if ("unsaturatedFatContents".equals(key) && value instanceof Mass) { this.unsaturatedFatContent((Mass)value); return; }
      if ("sodiumContent".equals(key) && value instanceof Mass) { this.sodiumContent((Mass)value); return; }
      if ("sodiumContents".equals(key) && value instanceof Mass) { this.sodiumContent((Mass)value); return; }
      super.fromMap(key, value);
    }
  }
  
}
