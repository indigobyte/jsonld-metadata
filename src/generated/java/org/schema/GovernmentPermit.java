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
 * A permit issued by a government agency.
 */
public class GovernmentPermit extends Permit {
  protected GovernmentPermit(java.util.Map<String,Object> data) {
    super(data);
  }
  
  /**
   * Builder for {@link GovernmentPermit}
   */
  public static class Builder extends Permit.Builder {
    public Builder(@NotNull HashMap<String,Object> data) {
      super(data);
    }
    @NotNull public GovernmentPermit build() {
      return new GovernmentPermit(myData);
    }
    /**
     * The service through with the permit was granted.
     */
    @NotNull public Builder issuedThrough(@NotNull Service service) {
      putValue("issuedThrough", service);
      return this;
    }
    /**
     * The service through with the permit was granted.
     */
    @NotNull public Builder issuedThrough(@NotNull Service.Builder service) {
      putValue("issuedThrough", service.build());
      return this;
    }
    /**
     * The target audience for this permit.
     */
    @NotNull public Builder permitAudience(@NotNull Audience audience) {
      putValue("permitAudience", audience);
      return this;
    }
    /**
     * The target audience for this permit.
     */
    @NotNull public Builder permitAudience(@NotNull Audience.Builder audience) {
      putValue("permitAudience", audience.build());
      return this;
    }
    /**
     * The duration of validity of a permit or similar thing.
     */
    @NotNull public Builder validFor(@NotNull Duration duration) {
      putValue("validFor", duration);
      return this;
    }
    /**
     * The duration of validity of a permit or similar thing.
     */
    @NotNull public Builder validFor(@NotNull Duration.Builder duration) {
      putValue("validFor", duration.build());
      return this;
    }
    /**
     * The date when the item becomes valid.
     */
    @NotNull public Builder validFrom(@NotNull java.util.Date date) {
      putValue("validFrom", date);
      return this;
    }
    /**
     * The geographic area where a permit or similar thing is valid.
     */
    @NotNull public Builder validIn(@NotNull AdministrativeArea administrativeArea) {
      putValue("validIn", administrativeArea);
      return this;
    }
    /**
     * The geographic area where a permit or similar thing is valid.
     */
    @NotNull public Builder validIn(@NotNull AdministrativeArea.Builder administrativeArea) {
      putValue("validIn", administrativeArea.build());
      return this;
    }
    /**
     * The date when the item is no longer valid.
     */
    @NotNull public Builder validUntil(@NotNull java.util.Date date) {
      putValue("validUntil", date);
      return this;
    }
    /**
     * The organization issuing the ticket or permit.
     */
    @NotNull public Builder issuedBy(@NotNull Organization organization) {
      putValue("issuedBy", organization);
      return this;
    }
    /**
     * The organization issuing the ticket or permit.
     */
    @NotNull public Builder issuedBy(@NotNull Organization.Builder organization) {
      putValue("issuedBy", organization.build());
      return this;
    }
    @NotNull public Builder additionalType(@NotNull AdditionalType additionalType) {
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
     * A description of the item.
     */
    @NotNull public Builder description(@NotNull DisambiguatingDescription disambiguatingDescription) {
      putValue("description", disambiguatingDescription);
      return this;
    }
    @NotNull public Builder disambiguatingDescription(@NotNull DisambiguatingDescription disambiguatingDescription) {
      putValue("disambiguatingDescription", disambiguatingDescription);
      return this;
    }
    /**
     * An image of the item. This can be a [[URL]] or a fully described [[ImageObject]].
     */
    @NotNull public Builder image(@NotNull Logo logo) {
      putValue("image", logo);
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
     * The identifier property represents any kind of identifier for any kind of [[Thing]], such as ISBNs, GTIN codes, UUIDs etc. Schema.org provides dedicated properties for representing many of these, either as textual strings or as URL (URI) links. See [background notes](/docs/datamodel.html#identifierBg) for more details.
     *         
     */
    @NotNull public Builder identifier(@NotNull Isbn isbn) {
      putValue("identifier", isbn);
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
      super.fromMap(key, value);
    }
  }
  
}
