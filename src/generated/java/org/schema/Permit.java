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
 * A permit issued by an organization, e.g. a parking pass.
 */
public class Permit extends Intangible {
  /**
   * The date when the item becomes valid.
   */
  @JsonIgnore public java.util.Date getValidFrom() {
    return (java.util.Date) getValue("validFrom");
  }
  /**
   * The date when the item becomes valid.
   */
  @JsonIgnore public java.util.Collection<java.util.Date> getValidFroms() {
    final Object current = myData.get("validFrom");
    if (current == null) return Collections.emptyList();
    if (current instanceof java.util.Collection) {
      return (java.util.Collection<java.util.Date>) current;
    }
    return Arrays.asList((java.util.Date) current);
  }
  /**
   * The geographic area where a permit or similar thing is valid.
   */
  @JsonIgnore public AdministrativeArea getValidIn() {
    return (AdministrativeArea) getValue("validIn");
  }
  /**
   * The geographic area where a permit or similar thing is valid.
   */
  @JsonIgnore public java.util.Collection<AdministrativeArea> getValidIns() {
    final Object current = myData.get("validIn");
    if (current == null) return Collections.emptyList();
    if (current instanceof java.util.Collection) {
      return (java.util.Collection<AdministrativeArea>) current;
    }
    return Arrays.asList((AdministrativeArea) current);
  }
  /**
   * The date when the item is no longer valid.
   */
  @JsonIgnore public java.util.Date getValidUntil() {
    return (java.util.Date) getValue("validUntil");
  }
  /**
   * The date when the item is no longer valid.
   */
  @JsonIgnore public java.util.Collection<java.util.Date> getValidUntils() {
    final Object current = myData.get("validUntil");
    if (current == null) return Collections.emptyList();
    if (current instanceof java.util.Collection) {
      return (java.util.Collection<java.util.Date>) current;
    }
    return Arrays.asList((java.util.Date) current);
  }
  /**
   * The target audience for this permit.
   */
  @JsonIgnore public Audience getPermitAudience() {
    return (Audience) getValue("permitAudience");
  }
  /**
   * The target audience for this permit.
   */
  @JsonIgnore public java.util.Collection<Audience> getPermitAudiences() {
    final Object current = myData.get("permitAudience");
    if (current == null) return Collections.emptyList();
    if (current instanceof java.util.Collection) {
      return (java.util.Collection<Audience>) current;
    }
    return Arrays.asList((Audience) current);
  }
  /**
   * The duration of validity of a permit or similar thing.
   */
  @JsonIgnore public Duration getValidFor() {
    return (Duration) getValue("validFor");
  }
  /**
   * The duration of validity of a permit or similar thing.
   */
  @JsonIgnore public java.util.Collection<Duration> getValidFors() {
    final Object current = myData.get("validFor");
    if (current == null) return Collections.emptyList();
    if (current instanceof java.util.Collection) {
      return (java.util.Collection<Duration>) current;
    }
    return Arrays.asList((Duration) current);
  }
  /**
   * The organization issuing the ticket or permit.
   */
  @JsonIgnore public Organization getIssuedBy() {
    return (Organization) getValue("issuedBy");
  }
  /**
   * The organization issuing the ticket or permit.
   */
  @JsonIgnore public java.util.Collection<Organization> getIssuedBys() {
    final Object current = myData.get("issuedBy");
    if (current == null) return Collections.emptyList();
    if (current instanceof java.util.Collection) {
      return (java.util.Collection<Organization>) current;
    }
    return Arrays.asList((Organization) current);
  }
  /**
   * The service through with the permit was granted.
   */
  @JsonIgnore public Service getIssuedThrough() {
    return (Service) getValue("issuedThrough");
  }
  /**
   * The service through with the permit was granted.
   */
  @JsonIgnore public java.util.Collection<Service> getIssuedThroughs() {
    final Object current = myData.get("issuedThrough");
    if (current == null) return Collections.emptyList();
    if (current instanceof java.util.Collection) {
      return (java.util.Collection<Service>) current;
    }
    return Arrays.asList((Service) current);
  }
  protected Permit(java.util.Map<String,Object> data) {
    super(data);
  }
  
  /**
   * Builder for {@link Permit}
   */
  public static class Builder extends Intangible.Builder {
    public Builder(@NotNull HashMap<String,Object> data) {
      super(data);
    }
    @NotNull public Permit build() {
      return new Permit(myData);
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
    @Override protected void fromMap(String key, Object value) {
      if ("validFrom".equals(key) && value instanceof java.util.Date) { this.validFrom((java.util.Date)value); return; }
      if ("validFroms".equals(key) && value instanceof java.util.Date) { this.validFrom((java.util.Date)value); return; }
      if ("validIn".equals(key) && value instanceof AdministrativeArea) { this.validIn((AdministrativeArea)value); return; }
      if ("validIns".equals(key) && value instanceof AdministrativeArea) { this.validIn((AdministrativeArea)value); return; }
      if ("validUntil".equals(key) && value instanceof java.util.Date) { this.validUntil((java.util.Date)value); return; }
      if ("validUntils".equals(key) && value instanceof java.util.Date) { this.validUntil((java.util.Date)value); return; }
      if ("permitAudience".equals(key) && value instanceof Audience) { this.permitAudience((Audience)value); return; }
      if ("permitAudiences".equals(key) && value instanceof Audience) { this.permitAudience((Audience)value); return; }
      if ("validFor".equals(key) && value instanceof Duration) { this.validFor((Duration)value); return; }
      if ("validFors".equals(key) && value instanceof Duration) { this.validFor((Duration)value); return; }
      if ("issuedBy".equals(key) && value instanceof Organization) { this.issuedBy((Organization)value); return; }
      if ("issuedBys".equals(key) && value instanceof Organization) { this.issuedBy((Organization)value); return; }
      if ("issuedThrough".equals(key) && value instanceof Service) { this.issuedThrough((Service)value); return; }
      if ("issuedThroughs".equals(key) && value instanceof Service) { this.issuedThrough((Service)value); return; }
      super.fromMap(key, value);
    }
  }
  
}
