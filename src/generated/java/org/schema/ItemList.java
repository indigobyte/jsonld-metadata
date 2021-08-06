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
 * A list of items of any sort&amp;#x2014;for example, Top 10 Movies About Weathermen, or Top 100 Party Songs. Not to be confused with HTML lists, which are often used only for formatting.
 */
public class ItemList extends Intangible implements org.schema.SuggestedAnswer {
  /**
   * Type of ordering (e.g. Ascending, Descending, Unordered).
   */
  @JsonIgnore public ItemListOrderType getItemListOrderItemListOrderType() {
    return (ItemListOrderType) getValue("itemListOrder");
  }
  /**
   * Type of ordering (e.g. Ascending, Descending, Unordered).
   */
  @JsonIgnore public java.util.Collection<ItemListOrderType> getItemListOrderItemListOrderTypes() {
    final java.lang.Object current = myData.get("itemListOrder");
    if (current == null) return Collections.emptyList();
    if (current instanceof java.util.Collection) {
      return (java.util.Collection<ItemListOrderType>) current;
    }
    return Arrays.asList((ItemListOrderType) current);
  }
  /**
   * Type of ordering (e.g. Ascending, Descending, Unordered).
   */
  @JsonIgnore public String getItemListOrderString() {
    return (String) getValue("itemListOrder");
  }
  /**
   * Type of ordering (e.g. Ascending, Descending, Unordered).
   */
  @JsonIgnore public java.util.Collection<String> getItemListOrderStrings() {
    final java.lang.Object current = myData.get("itemListOrder");
    if (current == null) return Collections.emptyList();
    if (current instanceof java.util.Collection) {
      return (java.util.Collection<String>) current;
    }
    return Arrays.asList((String) current);
  }
  /**
   * For itemListElement values, you can use simple strings (e.g. &quot;Peter&quot;, &quot;Paul&quot;, &quot;Mary&quot;), existing entities, or use ListItem.\n\nText values are best if the elements in the list are plain strings. Existing entities are best for a simple, unordered list of existing things in your data. ListItem is used with ordered lists when you want to provide additional context about the element in that list or when the same item might be in different places in different lists.\n\nNote: The order of elements in your mark-up is not sufficient for indicating the order or elements.  Use ListItem with a 'position' property in such cases.
   */
  @JsonIgnore public ListItem getItemListElementListItem() {
    return (ListItem) getValue("itemListElement");
  }
  /**
   * For itemListElement values, you can use simple strings (e.g. &quot;Peter&quot;, &quot;Paul&quot;, &quot;Mary&quot;), existing entities, or use ListItem.\n\nText values are best if the elements in the list are plain strings. Existing entities are best for a simple, unordered list of existing things in your data. ListItem is used with ordered lists when you want to provide additional context about the element in that list or when the same item might be in different places in different lists.\n\nNote: The order of elements in your mark-up is not sufficient for indicating the order or elements.  Use ListItem with a 'position' property in such cases.
   */
  @JsonIgnore public java.util.Collection<ListItem> getItemListElementListItems() {
    final java.lang.Object current = myData.get("itemListElement");
    if (current == null) return Collections.emptyList();
    if (current instanceof java.util.Collection) {
      return (java.util.Collection<ListItem>) current;
    }
    return Arrays.asList((ListItem) current);
  }
  /**
   * For itemListElement values, you can use simple strings (e.g. &quot;Peter&quot;, &quot;Paul&quot;, &quot;Mary&quot;), existing entities, or use ListItem.\n\nText values are best if the elements in the list are plain strings. Existing entities are best for a simple, unordered list of existing things in your data. ListItem is used with ordered lists when you want to provide additional context about the element in that list or when the same item might be in different places in different lists.\n\nNote: The order of elements in your mark-up is not sufficient for indicating the order or elements.  Use ListItem with a 'position' property in such cases.
   */
  @JsonIgnore public String getItemListElementString() {
    return (String) getValue("itemListElement");
  }
  /**
   * For itemListElement values, you can use simple strings (e.g. &quot;Peter&quot;, &quot;Paul&quot;, &quot;Mary&quot;), existing entities, or use ListItem.\n\nText values are best if the elements in the list are plain strings. Existing entities are best for a simple, unordered list of existing things in your data. ListItem is used with ordered lists when you want to provide additional context about the element in that list or when the same item might be in different places in different lists.\n\nNote: The order of elements in your mark-up is not sufficient for indicating the order or elements.  Use ListItem with a 'position' property in such cases.
   */
  @JsonIgnore public java.util.Collection<String> getItemListElementStrings() {
    final java.lang.Object current = myData.get("itemListElement");
    if (current == null) return Collections.emptyList();
    if (current instanceof java.util.Collection) {
      return (java.util.Collection<String>) current;
    }
    return Arrays.asList((String) current);
  }
  /**
   * For itemListElement values, you can use simple strings (e.g. &quot;Peter&quot;, &quot;Paul&quot;, &quot;Mary&quot;), existing entities, or use ListItem.\n\nText values are best if the elements in the list are plain strings. Existing entities are best for a simple, unordered list of existing things in your data. ListItem is used with ordered lists when you want to provide additional context about the element in that list or when the same item might be in different places in different lists.\n\nNote: The order of elements in your mark-up is not sufficient for indicating the order or elements.  Use ListItem with a 'position' property in such cases.
   */
  @JsonIgnore public Thing getItemListElementThing() {
    return (Thing) getValue("itemListElement");
  }
  /**
   * For itemListElement values, you can use simple strings (e.g. &quot;Peter&quot;, &quot;Paul&quot;, &quot;Mary&quot;), existing entities, or use ListItem.\n\nText values are best if the elements in the list are plain strings. Existing entities are best for a simple, unordered list of existing things in your data. ListItem is used with ordered lists when you want to provide additional context about the element in that list or when the same item might be in different places in different lists.\n\nNote: The order of elements in your mark-up is not sufficient for indicating the order or elements.  Use ListItem with a 'position' property in such cases.
   */
  @JsonIgnore public java.util.Collection<Thing> getItemListElementThings() {
    final java.lang.Object current = myData.get("itemListElement");
    if (current == null) return Collections.emptyList();
    if (current instanceof java.util.Collection) {
      return (java.util.Collection<Thing>) current;
    }
    return Arrays.asList((Thing) current);
  }
  /**
   * The number of items in an ItemList. Note that some descriptions might not fully describe all items in a list (e.g., multi-page pagination); in such cases, the numberOfItems would be for the entire list.
   */
  @JsonIgnore public Integer getNumberOfItems() {
    return (Integer) getValue("numberOfItems");
  }
  /**
   * The number of items in an ItemList. Note that some descriptions might not fully describe all items in a list (e.g., multi-page pagination); in such cases, the numberOfItems would be for the entire list.
   */
  @JsonIgnore public java.util.Collection<Integer> getNumberOfItemss() {
    final java.lang.Object current = myData.get("numberOfItems");
    if (current == null) return Collections.emptyList();
    if (current instanceof java.util.Collection) {
      return (java.util.Collection<Integer>) current;
    }
    return Arrays.asList((Integer) current);
  }
  protected ItemList(java.util.Map<String,java.lang.Object> data) {
    super(data);
  }
  
  /**
   * Builder for {@link ItemList}
   */
  public static class Builder extends Intangible.Builder {
    public Builder(@NotNull HashMap<String,java.lang.Object> data) {
      super(data);
    }
    @NotNull public ItemList build() {
      return new ItemList(myData);
    }
    /**
     * Type of ordering (e.g. Ascending, Descending, Unordered).
     */
    @NotNull public Builder itemListOrder(@NotNull ItemListOrderType itemListOrderType) {
      putValue("itemListOrder", itemListOrderType);
      return this;
    }
    /**
     * Type of ordering (e.g. Ascending, Descending, Unordered).
     */
    @NotNull public Builder itemListOrder(@NotNull String itemListOrder) {
      putValue("itemListOrder", itemListOrder);
      return this;
    }
    /**
     * For itemListElement values, you can use simple strings (e.g. &quot;Peter&quot;, &quot;Paul&quot;, &quot;Mary&quot;), existing entities, or use ListItem.\n\nText values are best if the elements in the list are plain strings. Existing entities are best for a simple, unordered list of existing things in your data. ListItem is used with ordered lists when you want to provide additional context about the element in that list or when the same item might be in different places in different lists.\n\nNote: The order of elements in your mark-up is not sufficient for indicating the order or elements.  Use ListItem with a 'position' property in such cases.
     */
    @NotNull public Builder itemListElement(@NotNull ListItem listItem) {
      putValue("itemListElement", listItem);
      return this;
    }
    /**
     * For itemListElement values, you can use simple strings (e.g. &quot;Peter&quot;, &quot;Paul&quot;, &quot;Mary&quot;), existing entities, or use ListItem.\n\nText values are best if the elements in the list are plain strings. Existing entities are best for a simple, unordered list of existing things in your data. ListItem is used with ordered lists when you want to provide additional context about the element in that list or when the same item might be in different places in different lists.\n\nNote: The order of elements in your mark-up is not sufficient for indicating the order or elements.  Use ListItem with a 'position' property in such cases.
     */
    @NotNull public Builder itemListElement(@NotNull ListItem.Builder listItem) {
      putValue("itemListElement", listItem.build());
      return this;
    }
    /**
     * For itemListElement values, you can use simple strings (e.g. &quot;Peter&quot;, &quot;Paul&quot;, &quot;Mary&quot;), existing entities, or use ListItem.\n\nText values are best if the elements in the list are plain strings. Existing entities are best for a simple, unordered list of existing things in your data. ListItem is used with ordered lists when you want to provide additional context about the element in that list or when the same item might be in different places in different lists.\n\nNote: The order of elements in your mark-up is not sufficient for indicating the order or elements.  Use ListItem with a 'position' property in such cases.
     */
    @NotNull public Builder itemListElement(@NotNull String itemListElement) {
      putValue("itemListElement", itemListElement);
      return this;
    }
    /**
     * For itemListElement values, you can use simple strings (e.g. &quot;Peter&quot;, &quot;Paul&quot;, &quot;Mary&quot;), existing entities, or use ListItem.\n\nText values are best if the elements in the list are plain strings. Existing entities are best for a simple, unordered list of existing things in your data. ListItem is used with ordered lists when you want to provide additional context about the element in that list or when the same item might be in different places in different lists.\n\nNote: The order of elements in your mark-up is not sufficient for indicating the order or elements.  Use ListItem with a 'position' property in such cases.
     */
    @NotNull public Builder itemListElement(@NotNull Thing thing) {
      putValue("itemListElement", thing);
      return this;
    }
    /**
     * For itemListElement values, you can use simple strings (e.g. &quot;Peter&quot;, &quot;Paul&quot;, &quot;Mary&quot;), existing entities, or use ListItem.\n\nText values are best if the elements in the list are plain strings. Existing entities are best for a simple, unordered list of existing things in your data. ListItem is used with ordered lists when you want to provide additional context about the element in that list or when the same item might be in different places in different lists.\n\nNote: The order of elements in your mark-up is not sufficient for indicating the order or elements.  Use ListItem with a 'position' property in such cases.
     */
    @NotNull public Builder itemListElement(@NotNull Thing.Builder thing) {
      putValue("itemListElement", thing.build());
      return this;
    }
    /**
     * The number of items in an ItemList. Note that some descriptions might not fully describe all items in a list (e.g., multi-page pagination); in such cases, the numberOfItems would be for the entire list.
     */
    @NotNull public Builder numberOfItems(@NotNull Integer integer) {
      putValue("numberOfItems", integer);
      return this;
    }
    /**
     * The identifier property represents any kind of identifier for any kind of [[Thing]], such as ISBNs, GTIN codes, UUIDs etc. Schema.org provides dedicated properties for representing many of these, either as textual strings or as URL (URI) links. See [background notes](/docs/datamodel.html#identifierBg) for more details.
     *         
     */
    @NotNull public Builder identifier(@NotNull Identifier identifier) {
      putValue("identifier", identifier);
      return this;
    }
    /**
     * An image of the item. This can be a [[URL]] or a fully described [[ImageObject]].
     */
    @NotNull public Builder image(@NotNull Image image) {
      putValue("image", image);
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
     * A sub property of description. A short description of the item used to disambiguate from other, similar items. Information from other properties (in particular, name) may be necessary for the description to be useful for disambiguation.
     */
    @NotNull public Builder disambiguatingDescription(@NotNull Description description) {
      putValue("disambiguatingDescription", description);
      return this;
    }
    /**
     * A description of the item.
     */
    @NotNull public Builder description(@NotNull Description description) {
      putValue("description", description);
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
     * An additional type for the item, typically used for adding more specific types from external vocabularies in microdata syntax. This is a relationship between something and a class that the thing is in. In RDFa syntax, it is better to use the native RDFa syntax - the 'typeof' attribute - for multiple types. Schema.org tools may have only weaker understanding of extra types, in particular those defined externally.
     */
    @NotNull public Builder additionalType(@NotNull String additionalType) {
      putValue("additionalType", additionalType);
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
     * An alias for the item.
     */
    @NotNull public Builder alternateName(@NotNull String alternateName) {
      putValue("alternateName", alternateName);
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
    @NotNull public Builder id(@NotNull String id) {
      myData.put("id", id);
      return this;
    }
    public Builder id(long id) {
      return id(Long.toString(id));
    }
    @Override protected void fromMap(String key, java.lang.Object value) {
      if ("itemListOrder".equals(key) && value instanceof ItemListOrderType) { this.itemListOrder((ItemListOrderType)value); return; }
      if ("itemListOrders".equals(key) && value instanceof ItemListOrderType) { this.itemListOrder((ItemListOrderType)value); return; }
      if ("itemListOrder".equals(key) && value instanceof String) { this.itemListOrder((String)value); return; }
      if ("itemListOrders".equals(key) && value instanceof String) { this.itemListOrder((String)value); return; }
      if ("itemListElement".equals(key) && value instanceof ListItem) { this.itemListElement((ListItem)value); return; }
      if ("itemListElements".equals(key) && value instanceof ListItem) { this.itemListElement((ListItem)value); return; }
      if ("itemListElement".equals(key) && value instanceof String) { this.itemListElement((String)value); return; }
      if ("itemListElements".equals(key) && value instanceof String) { this.itemListElement((String)value); return; }
      if ("itemListElement".equals(key) && value instanceof Thing) { this.itemListElement((Thing)value); return; }
      if ("itemListElements".equals(key) && value instanceof Thing) { this.itemListElement((Thing)value); return; }
      if ("numberOfItems".equals(key) && value instanceof Integer) { this.numberOfItems((Integer)value); return; }
      if ("numberOfItemss".equals(key) && value instanceof Integer) { this.numberOfItems((Integer)value); return; }
      super.fromMap(key, value);
    }
  }
  
}
