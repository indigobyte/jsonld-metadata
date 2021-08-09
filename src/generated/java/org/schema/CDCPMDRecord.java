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
 * A CDCPMDRecord is a data structure representing a record in a CDC tabular data format
 *       used for hospital data reporting. See [documentation](/docs/cdc-covid.html) for details, and the linked CDC materials for authoritative
 *       definitions used as the source here.
 *       
 */
public class CDCPMDRecord extends StructuredValue {
  /**
   * numicubeds - ICU BEDS: Total number of staffed inpatient intensive care unit (ICU) beds.
   * @return cvdNumICUBeds property set by first invocation of cvdNumICUBeds method or {@code null}.
   */
  @JsonIgnore public Integer getCvdNumICUBedsInteger() {
    return (Integer) getValue("cvdNumICUBeds");
  }
  /**
   * numicubeds - ICU BEDS: Total number of staffed inpatient intensive care unit (ICU) beds.
   * @return all cvdNumICUBeds properties as {@link java.util.Collection} or an empty collection 
   * if cvdNumICUBeds was not set.
   */
  @JsonIgnore public java.util.Collection<Integer> getCvdNumICUBedsIntegers() {
    final java.lang.Object current = myData.get("cvdNumICUBeds");
    if (current == null) return Collections.emptyList();
    if (current instanceof java.util.Collection) {
      return (java.util.Collection<Integer>) current;
    }
    return Arrays.asList((Integer) current);
  }
  /**
   * numicubeds - ICU BEDS: Total number of staffed inpatient intensive care unit (ICU) beds.
   * @return cvdNumICUBeds property set by first invocation of cvdNumICUBeds method or {@code null}.
   */
  @JsonIgnore public Long getCvdNumICUBedsLong() {
    return (Long) getValue("cvdNumICUBeds");
  }
  /**
   * numicubeds - ICU BEDS: Total number of staffed inpatient intensive care unit (ICU) beds.
   * @return all cvdNumICUBeds properties as {@link java.util.Collection} or an empty collection 
   * if cvdNumICUBeds was not set.
   */
  @JsonIgnore public java.util.Collection<Long> getCvdNumICUBedsLongs() {
    final java.lang.Object current = myData.get("cvdNumICUBeds");
    if (current == null) return Collections.emptyList();
    if (current instanceof java.util.Collection) {
      return (java.util.Collection<Long>) current;
    }
    return Arrays.asList((Long) current);
  }
  /**
   * numicubeds - ICU BEDS: Total number of staffed inpatient intensive care unit (ICU) beds.
   * @return cvdNumICUBeds property set by first invocation of cvdNumICUBeds method or {@code null}.
   */
  @JsonIgnore public Float getCvdNumICUBedsFloat() {
    return (Float) getValue("cvdNumICUBeds");
  }
  /**
   * numicubeds - ICU BEDS: Total number of staffed inpatient intensive care unit (ICU) beds.
   * @return all cvdNumICUBeds properties as {@link java.util.Collection} or an empty collection 
   * if cvdNumICUBeds was not set.
   */
  @JsonIgnore public java.util.Collection<Float> getCvdNumICUBedsFloats() {
    final java.lang.Object current = myData.get("cvdNumICUBeds");
    if (current == null) return Collections.emptyList();
    if (current instanceof java.util.Collection) {
      return (java.util.Collection<Float>) current;
    }
    return Arrays.asList((Float) current);
  }
  /**
   * numicubeds - ICU BEDS: Total number of staffed inpatient intensive care unit (ICU) beds.
   * @return cvdNumICUBeds property set by first invocation of cvdNumICUBeds method or {@code null}.
   */
  @JsonIgnore public Double getCvdNumICUBedsDouble() {
    return (Double) getValue("cvdNumICUBeds");
  }
  /**
   * numicubeds - ICU BEDS: Total number of staffed inpatient intensive care unit (ICU) beds.
   * @return all cvdNumICUBeds properties as {@link java.util.Collection} or an empty collection 
   * if cvdNumICUBeds was not set.
   */
  @JsonIgnore public java.util.Collection<Double> getCvdNumICUBedsDoubles() {
    final java.lang.Object current = myData.get("cvdNumICUBeds");
    if (current == null) return Collections.emptyList();
    if (current instanceof java.util.Collection) {
      return (java.util.Collection<Double>) current;
    }
    return Arrays.asList((Double) current);
  }
  /**
   * numicubeds - ICU BEDS: Total number of staffed inpatient intensive care unit (ICU) beds.
   * @return cvdNumICUBeds property set by first invocation of cvdNumICUBeds method or {@code null}.
   */
  @JsonIgnore public String getCvdNumICUBedsString() {
    return (String) getValue("cvdNumICUBeds");
  }
  /**
   * numicubeds - ICU BEDS: Total number of staffed inpatient intensive care unit (ICU) beds.
   * @return all cvdNumICUBeds properties as {@link java.util.Collection} or an empty collection 
   * if cvdNumICUBeds was not set.
   */
  @JsonIgnore public java.util.Collection<String> getCvdNumICUBedsStrings() {
    final java.lang.Object current = myData.get("cvdNumICUBeds");
    if (current == null) return Collections.emptyList();
    if (current instanceof java.util.Collection) {
      return (java.util.Collection<String>) current;
    }
    return Arrays.asList((String) current);
  }
  /**
   * collectiondate - Date for which patient counts are reported.
   * @return cvdCollectionDate property set by first invocation of cvdCollectionDate method or {@code null}.
   */
  @JsonIgnore public String getCvdCollectionDateString() {
    return (String) getValue("cvdCollectionDate");
  }
  /**
   * collectiondate - Date for which patient counts are reported.
   * @return all cvdCollectionDate properties as {@link java.util.Collection} or an empty collection 
   * if cvdCollectionDate was not set.
   */
  @JsonIgnore public java.util.Collection<String> getCvdCollectionDateStrings() {
    final java.lang.Object current = myData.get("cvdCollectionDate");
    if (current == null) return Collections.emptyList();
    if (current instanceof java.util.Collection) {
      return (java.util.Collection<String>) current;
    }
    return Arrays.asList((String) current);
  }
  /**
   * collectiondate - Date for which patient counts are reported.
   * @return cvdCollectionDate property set by first invocation of cvdCollectionDate method or {@code null}.
   */
  @JsonIgnore public java.util.Date getCvdCollectionDateDate() {
    return (java.util.Date) getValue("cvdCollectionDate");
  }
  /**
   * collectiondate - Date for which patient counts are reported.
   * @return all cvdCollectionDate properties as {@link java.util.Collection} or an empty collection 
   * if cvdCollectionDate was not set.
   */
  @JsonIgnore public java.util.Collection<java.util.Date> getCvdCollectionDateDates() {
    final java.lang.Object current = myData.get("cvdCollectionDate");
    if (current == null) return Collections.emptyList();
    if (current instanceof java.util.Collection) {
      return (java.util.Collection<java.util.Date>) current;
    }
    return Arrays.asList((java.util.Date) current);
  }
  /**
   * Publication date of an online listing.
   * @return datePosted property set by first invocation of datePosted method or {@code null}.
   */
  @JsonIgnore public java.util.Date getDatePosted() {
    return (java.util.Date) getValue("datePosted");
  }
  /**
   * Publication date of an online listing.
   * @return all datePosted properties as {@link java.util.Collection} or an empty collection 
   * if datePosted was not set.
   */
  @JsonIgnore public java.util.Collection<java.util.Date> getDatePosteds() {
    final java.lang.Object current = myData.get("datePosted");
    if (current == null) return Collections.emptyList();
    if (current instanceof java.util.Collection) {
      return (java.util.Collection<java.util.Date>) current;
    }
    return Arrays.asList((java.util.Date) current);
  }
  /**
   * numbeds - HOSPITAL INPATIENT BEDS: Inpatient beds, including all staffed, licensed, and overflow (surge) beds used for inpatients.
   * @return cvdNumBeds property set by first invocation of cvdNumBeds method or {@code null}.
   */
  @JsonIgnore public Integer getCvdNumBedsInteger() {
    return (Integer) getValue("cvdNumBeds");
  }
  /**
   * numbeds - HOSPITAL INPATIENT BEDS: Inpatient beds, including all staffed, licensed, and overflow (surge) beds used for inpatients.
   * @return all cvdNumBeds properties as {@link java.util.Collection} or an empty collection 
   * if cvdNumBeds was not set.
   */
  @JsonIgnore public java.util.Collection<Integer> getCvdNumBedsIntegers() {
    final java.lang.Object current = myData.get("cvdNumBeds");
    if (current == null) return Collections.emptyList();
    if (current instanceof java.util.Collection) {
      return (java.util.Collection<Integer>) current;
    }
    return Arrays.asList((Integer) current);
  }
  /**
   * numbeds - HOSPITAL INPATIENT BEDS: Inpatient beds, including all staffed, licensed, and overflow (surge) beds used for inpatients.
   * @return cvdNumBeds property set by first invocation of cvdNumBeds method or {@code null}.
   */
  @JsonIgnore public Long getCvdNumBedsLong() {
    return (Long) getValue("cvdNumBeds");
  }
  /**
   * numbeds - HOSPITAL INPATIENT BEDS: Inpatient beds, including all staffed, licensed, and overflow (surge) beds used for inpatients.
   * @return all cvdNumBeds properties as {@link java.util.Collection} or an empty collection 
   * if cvdNumBeds was not set.
   */
  @JsonIgnore public java.util.Collection<Long> getCvdNumBedsLongs() {
    final java.lang.Object current = myData.get("cvdNumBeds");
    if (current == null) return Collections.emptyList();
    if (current instanceof java.util.Collection) {
      return (java.util.Collection<Long>) current;
    }
    return Arrays.asList((Long) current);
  }
  /**
   * numbeds - HOSPITAL INPATIENT BEDS: Inpatient beds, including all staffed, licensed, and overflow (surge) beds used for inpatients.
   * @return cvdNumBeds property set by first invocation of cvdNumBeds method or {@code null}.
   */
  @JsonIgnore public Float getCvdNumBedsFloat() {
    return (Float) getValue("cvdNumBeds");
  }
  /**
   * numbeds - HOSPITAL INPATIENT BEDS: Inpatient beds, including all staffed, licensed, and overflow (surge) beds used for inpatients.
   * @return all cvdNumBeds properties as {@link java.util.Collection} or an empty collection 
   * if cvdNumBeds was not set.
   */
  @JsonIgnore public java.util.Collection<Float> getCvdNumBedsFloats() {
    final java.lang.Object current = myData.get("cvdNumBeds");
    if (current == null) return Collections.emptyList();
    if (current instanceof java.util.Collection) {
      return (java.util.Collection<Float>) current;
    }
    return Arrays.asList((Float) current);
  }
  /**
   * numbeds - HOSPITAL INPATIENT BEDS: Inpatient beds, including all staffed, licensed, and overflow (surge) beds used for inpatients.
   * @return cvdNumBeds property set by first invocation of cvdNumBeds method or {@code null}.
   */
  @JsonIgnore public Double getCvdNumBedsDouble() {
    return (Double) getValue("cvdNumBeds");
  }
  /**
   * numbeds - HOSPITAL INPATIENT BEDS: Inpatient beds, including all staffed, licensed, and overflow (surge) beds used for inpatients.
   * @return all cvdNumBeds properties as {@link java.util.Collection} or an empty collection 
   * if cvdNumBeds was not set.
   */
  @JsonIgnore public java.util.Collection<Double> getCvdNumBedsDoubles() {
    final java.lang.Object current = myData.get("cvdNumBeds");
    if (current == null) return Collections.emptyList();
    if (current instanceof java.util.Collection) {
      return (java.util.Collection<Double>) current;
    }
    return Arrays.asList((Double) current);
  }
  /**
   * numbeds - HOSPITAL INPATIENT BEDS: Inpatient beds, including all staffed, licensed, and overflow (surge) beds used for inpatients.
   * @return cvdNumBeds property set by first invocation of cvdNumBeds method or {@code null}.
   */
  @JsonIgnore public String getCvdNumBedsString() {
    return (String) getValue("cvdNumBeds");
  }
  /**
   * numbeds - HOSPITAL INPATIENT BEDS: Inpatient beds, including all staffed, licensed, and overflow (surge) beds used for inpatients.
   * @return all cvdNumBeds properties as {@link java.util.Collection} or an empty collection 
   * if cvdNumBeds was not set.
   */
  @JsonIgnore public java.util.Collection<String> getCvdNumBedsStrings() {
    final java.lang.Object current = myData.get("cvdNumBeds");
    if (current == null) return Collections.emptyList();
    if (current instanceof java.util.Collection) {
      return (java.util.Collection<String>) current;
    }
    return Arrays.asList((String) current);
  }
  /**
   * numc19mechventpats - HOSPITALIZED and VENTILATED: Patients hospitalized in an NHSN inpatient care location who have suspected or confirmed COVID-19 and are on a mechanical ventilator.
   * @return cvdNumC19MechVentPats property set by first invocation of cvdNumC19MechVentPats method or {@code null}.
   */
  @JsonIgnore public Integer getCvdNumC19MechVentPatsInteger() {
    return (Integer) getValue("cvdNumC19MechVentPats");
  }
  /**
   * numc19mechventpats - HOSPITALIZED and VENTILATED: Patients hospitalized in an NHSN inpatient care location who have suspected or confirmed COVID-19 and are on a mechanical ventilator.
   * @return all cvdNumC19MechVentPats properties as {@link java.util.Collection} or an empty collection 
   * if cvdNumC19MechVentPats was not set.
   */
  @JsonIgnore public java.util.Collection<Integer> getCvdNumC19MechVentPatsIntegers() {
    final java.lang.Object current = myData.get("cvdNumC19MechVentPats");
    if (current == null) return Collections.emptyList();
    if (current instanceof java.util.Collection) {
      return (java.util.Collection<Integer>) current;
    }
    return Arrays.asList((Integer) current);
  }
  /**
   * numc19mechventpats - HOSPITALIZED and VENTILATED: Patients hospitalized in an NHSN inpatient care location who have suspected or confirmed COVID-19 and are on a mechanical ventilator.
   * @return cvdNumC19MechVentPats property set by first invocation of cvdNumC19MechVentPats method or {@code null}.
   */
  @JsonIgnore public Long getCvdNumC19MechVentPatsLong() {
    return (Long) getValue("cvdNumC19MechVentPats");
  }
  /**
   * numc19mechventpats - HOSPITALIZED and VENTILATED: Patients hospitalized in an NHSN inpatient care location who have suspected or confirmed COVID-19 and are on a mechanical ventilator.
   * @return all cvdNumC19MechVentPats properties as {@link java.util.Collection} or an empty collection 
   * if cvdNumC19MechVentPats was not set.
   */
  @JsonIgnore public java.util.Collection<Long> getCvdNumC19MechVentPatsLongs() {
    final java.lang.Object current = myData.get("cvdNumC19MechVentPats");
    if (current == null) return Collections.emptyList();
    if (current instanceof java.util.Collection) {
      return (java.util.Collection<Long>) current;
    }
    return Arrays.asList((Long) current);
  }
  /**
   * numc19mechventpats - HOSPITALIZED and VENTILATED: Patients hospitalized in an NHSN inpatient care location who have suspected or confirmed COVID-19 and are on a mechanical ventilator.
   * @return cvdNumC19MechVentPats property set by first invocation of cvdNumC19MechVentPats method or {@code null}.
   */
  @JsonIgnore public Float getCvdNumC19MechVentPatsFloat() {
    return (Float) getValue("cvdNumC19MechVentPats");
  }
  /**
   * numc19mechventpats - HOSPITALIZED and VENTILATED: Patients hospitalized in an NHSN inpatient care location who have suspected or confirmed COVID-19 and are on a mechanical ventilator.
   * @return all cvdNumC19MechVentPats properties as {@link java.util.Collection} or an empty collection 
   * if cvdNumC19MechVentPats was not set.
   */
  @JsonIgnore public java.util.Collection<Float> getCvdNumC19MechVentPatsFloats() {
    final java.lang.Object current = myData.get("cvdNumC19MechVentPats");
    if (current == null) return Collections.emptyList();
    if (current instanceof java.util.Collection) {
      return (java.util.Collection<Float>) current;
    }
    return Arrays.asList((Float) current);
  }
  /**
   * numc19mechventpats - HOSPITALIZED and VENTILATED: Patients hospitalized in an NHSN inpatient care location who have suspected or confirmed COVID-19 and are on a mechanical ventilator.
   * @return cvdNumC19MechVentPats property set by first invocation of cvdNumC19MechVentPats method or {@code null}.
   */
  @JsonIgnore public Double getCvdNumC19MechVentPatsDouble() {
    return (Double) getValue("cvdNumC19MechVentPats");
  }
  /**
   * numc19mechventpats - HOSPITALIZED and VENTILATED: Patients hospitalized in an NHSN inpatient care location who have suspected or confirmed COVID-19 and are on a mechanical ventilator.
   * @return all cvdNumC19MechVentPats properties as {@link java.util.Collection} or an empty collection 
   * if cvdNumC19MechVentPats was not set.
   */
  @JsonIgnore public java.util.Collection<Double> getCvdNumC19MechVentPatsDoubles() {
    final java.lang.Object current = myData.get("cvdNumC19MechVentPats");
    if (current == null) return Collections.emptyList();
    if (current instanceof java.util.Collection) {
      return (java.util.Collection<Double>) current;
    }
    return Arrays.asList((Double) current);
  }
  /**
   * numc19mechventpats - HOSPITALIZED and VENTILATED: Patients hospitalized in an NHSN inpatient care location who have suspected or confirmed COVID-19 and are on a mechanical ventilator.
   * @return cvdNumC19MechVentPats property set by first invocation of cvdNumC19MechVentPats method or {@code null}.
   */
  @JsonIgnore public String getCvdNumC19MechVentPatsString() {
    return (String) getValue("cvdNumC19MechVentPats");
  }
  /**
   * numc19mechventpats - HOSPITALIZED and VENTILATED: Patients hospitalized in an NHSN inpatient care location who have suspected or confirmed COVID-19 and are on a mechanical ventilator.
   * @return all cvdNumC19MechVentPats properties as {@link java.util.Collection} or an empty collection 
   * if cvdNumC19MechVentPats was not set.
   */
  @JsonIgnore public java.util.Collection<String> getCvdNumC19MechVentPatsStrings() {
    final java.lang.Object current = myData.get("cvdNumC19MechVentPats");
    if (current == null) return Collections.emptyList();
    if (current instanceof java.util.Collection) {
      return (java.util.Collection<String>) current;
    }
    return Arrays.asList((String) current);
  }
  /**
   * numvent - MECHANICAL VENTILATORS: Total number of ventilators available.
   * @return cvdNumVent property set by first invocation of cvdNumVent method or {@code null}.
   */
  @JsonIgnore public Integer getCvdNumVentInteger() {
    return (Integer) getValue("cvdNumVent");
  }
  /**
   * numvent - MECHANICAL VENTILATORS: Total number of ventilators available.
   * @return all cvdNumVent properties as {@link java.util.Collection} or an empty collection 
   * if cvdNumVent was not set.
   */
  @JsonIgnore public java.util.Collection<Integer> getCvdNumVentIntegers() {
    final java.lang.Object current = myData.get("cvdNumVent");
    if (current == null) return Collections.emptyList();
    if (current instanceof java.util.Collection) {
      return (java.util.Collection<Integer>) current;
    }
    return Arrays.asList((Integer) current);
  }
  /**
   * numvent - MECHANICAL VENTILATORS: Total number of ventilators available.
   * @return cvdNumVent property set by first invocation of cvdNumVent method or {@code null}.
   */
  @JsonIgnore public Long getCvdNumVentLong() {
    return (Long) getValue("cvdNumVent");
  }
  /**
   * numvent - MECHANICAL VENTILATORS: Total number of ventilators available.
   * @return all cvdNumVent properties as {@link java.util.Collection} or an empty collection 
   * if cvdNumVent was not set.
   */
  @JsonIgnore public java.util.Collection<Long> getCvdNumVentLongs() {
    final java.lang.Object current = myData.get("cvdNumVent");
    if (current == null) return Collections.emptyList();
    if (current instanceof java.util.Collection) {
      return (java.util.Collection<Long>) current;
    }
    return Arrays.asList((Long) current);
  }
  /**
   * numvent - MECHANICAL VENTILATORS: Total number of ventilators available.
   * @return cvdNumVent property set by first invocation of cvdNumVent method or {@code null}.
   */
  @JsonIgnore public Float getCvdNumVentFloat() {
    return (Float) getValue("cvdNumVent");
  }
  /**
   * numvent - MECHANICAL VENTILATORS: Total number of ventilators available.
   * @return all cvdNumVent properties as {@link java.util.Collection} or an empty collection 
   * if cvdNumVent was not set.
   */
  @JsonIgnore public java.util.Collection<Float> getCvdNumVentFloats() {
    final java.lang.Object current = myData.get("cvdNumVent");
    if (current == null) return Collections.emptyList();
    if (current instanceof java.util.Collection) {
      return (java.util.Collection<Float>) current;
    }
    return Arrays.asList((Float) current);
  }
  /**
   * numvent - MECHANICAL VENTILATORS: Total number of ventilators available.
   * @return cvdNumVent property set by first invocation of cvdNumVent method or {@code null}.
   */
  @JsonIgnore public Double getCvdNumVentDouble() {
    return (Double) getValue("cvdNumVent");
  }
  /**
   * numvent - MECHANICAL VENTILATORS: Total number of ventilators available.
   * @return all cvdNumVent properties as {@link java.util.Collection} or an empty collection 
   * if cvdNumVent was not set.
   */
  @JsonIgnore public java.util.Collection<Double> getCvdNumVentDoubles() {
    final java.lang.Object current = myData.get("cvdNumVent");
    if (current == null) return Collections.emptyList();
    if (current instanceof java.util.Collection) {
      return (java.util.Collection<Double>) current;
    }
    return Arrays.asList((Double) current);
  }
  /**
   * numvent - MECHANICAL VENTILATORS: Total number of ventilators available.
   * @return cvdNumVent property set by first invocation of cvdNumVent method or {@code null}.
   */
  @JsonIgnore public String getCvdNumVentString() {
    return (String) getValue("cvdNumVent");
  }
  /**
   * numvent - MECHANICAL VENTILATORS: Total number of ventilators available.
   * @return all cvdNumVent properties as {@link java.util.Collection} or an empty collection 
   * if cvdNumVent was not set.
   */
  @JsonIgnore public java.util.Collection<String> getCvdNumVentStrings() {
    final java.lang.Object current = myData.get("cvdNumVent");
    if (current == null) return Collections.emptyList();
    if (current instanceof java.util.Collection) {
      return (java.util.Collection<String>) current;
    }
    return Arrays.asList((String) current);
  }
  /**
   * numc19overflowpats - ED/OVERFLOW: Patients with suspected or confirmed COVID-19 who are in the ED or any overflow location awaiting an inpatient bed.
   * @return cvdNumC19OverflowPats property set by first invocation of cvdNumC19OverflowPats method or {@code null}.
   */
  @JsonIgnore public Integer getCvdNumC19OverflowPatsInteger() {
    return (Integer) getValue("cvdNumC19OverflowPats");
  }
  /**
   * numc19overflowpats - ED/OVERFLOW: Patients with suspected or confirmed COVID-19 who are in the ED or any overflow location awaiting an inpatient bed.
   * @return all cvdNumC19OverflowPats properties as {@link java.util.Collection} or an empty collection 
   * if cvdNumC19OverflowPats was not set.
   */
  @JsonIgnore public java.util.Collection<Integer> getCvdNumC19OverflowPatsIntegers() {
    final java.lang.Object current = myData.get("cvdNumC19OverflowPats");
    if (current == null) return Collections.emptyList();
    if (current instanceof java.util.Collection) {
      return (java.util.Collection<Integer>) current;
    }
    return Arrays.asList((Integer) current);
  }
  /**
   * numc19overflowpats - ED/OVERFLOW: Patients with suspected or confirmed COVID-19 who are in the ED or any overflow location awaiting an inpatient bed.
   * @return cvdNumC19OverflowPats property set by first invocation of cvdNumC19OverflowPats method or {@code null}.
   */
  @JsonIgnore public Long getCvdNumC19OverflowPatsLong() {
    return (Long) getValue("cvdNumC19OverflowPats");
  }
  /**
   * numc19overflowpats - ED/OVERFLOW: Patients with suspected or confirmed COVID-19 who are in the ED or any overflow location awaiting an inpatient bed.
   * @return all cvdNumC19OverflowPats properties as {@link java.util.Collection} or an empty collection 
   * if cvdNumC19OverflowPats was not set.
   */
  @JsonIgnore public java.util.Collection<Long> getCvdNumC19OverflowPatsLongs() {
    final java.lang.Object current = myData.get("cvdNumC19OverflowPats");
    if (current == null) return Collections.emptyList();
    if (current instanceof java.util.Collection) {
      return (java.util.Collection<Long>) current;
    }
    return Arrays.asList((Long) current);
  }
  /**
   * numc19overflowpats - ED/OVERFLOW: Patients with suspected or confirmed COVID-19 who are in the ED or any overflow location awaiting an inpatient bed.
   * @return cvdNumC19OverflowPats property set by first invocation of cvdNumC19OverflowPats method or {@code null}.
   */
  @JsonIgnore public Float getCvdNumC19OverflowPatsFloat() {
    return (Float) getValue("cvdNumC19OverflowPats");
  }
  /**
   * numc19overflowpats - ED/OVERFLOW: Patients with suspected or confirmed COVID-19 who are in the ED or any overflow location awaiting an inpatient bed.
   * @return all cvdNumC19OverflowPats properties as {@link java.util.Collection} or an empty collection 
   * if cvdNumC19OverflowPats was not set.
   */
  @JsonIgnore public java.util.Collection<Float> getCvdNumC19OverflowPatsFloats() {
    final java.lang.Object current = myData.get("cvdNumC19OverflowPats");
    if (current == null) return Collections.emptyList();
    if (current instanceof java.util.Collection) {
      return (java.util.Collection<Float>) current;
    }
    return Arrays.asList((Float) current);
  }
  /**
   * numc19overflowpats - ED/OVERFLOW: Patients with suspected or confirmed COVID-19 who are in the ED or any overflow location awaiting an inpatient bed.
   * @return cvdNumC19OverflowPats property set by first invocation of cvdNumC19OverflowPats method or {@code null}.
   */
  @JsonIgnore public Double getCvdNumC19OverflowPatsDouble() {
    return (Double) getValue("cvdNumC19OverflowPats");
  }
  /**
   * numc19overflowpats - ED/OVERFLOW: Patients with suspected or confirmed COVID-19 who are in the ED or any overflow location awaiting an inpatient bed.
   * @return all cvdNumC19OverflowPats properties as {@link java.util.Collection} or an empty collection 
   * if cvdNumC19OverflowPats was not set.
   */
  @JsonIgnore public java.util.Collection<Double> getCvdNumC19OverflowPatsDoubles() {
    final java.lang.Object current = myData.get("cvdNumC19OverflowPats");
    if (current == null) return Collections.emptyList();
    if (current instanceof java.util.Collection) {
      return (java.util.Collection<Double>) current;
    }
    return Arrays.asList((Double) current);
  }
  /**
   * numc19overflowpats - ED/OVERFLOW: Patients with suspected or confirmed COVID-19 who are in the ED or any overflow location awaiting an inpatient bed.
   * @return cvdNumC19OverflowPats property set by first invocation of cvdNumC19OverflowPats method or {@code null}.
   */
  @JsonIgnore public String getCvdNumC19OverflowPatsString() {
    return (String) getValue("cvdNumC19OverflowPats");
  }
  /**
   * numc19overflowpats - ED/OVERFLOW: Patients with suspected or confirmed COVID-19 who are in the ED or any overflow location awaiting an inpatient bed.
   * @return all cvdNumC19OverflowPats properties as {@link java.util.Collection} or an empty collection 
   * if cvdNumC19OverflowPats was not set.
   */
  @JsonIgnore public java.util.Collection<String> getCvdNumC19OverflowPatsStrings() {
    final java.lang.Object current = myData.get("cvdNumC19OverflowPats");
    if (current == null) return Collections.emptyList();
    if (current instanceof java.util.Collection) {
      return (java.util.Collection<String>) current;
    }
    return Arrays.asList((String) current);
  }
  /**
   * numc19died - DEATHS: Patients with suspected or confirmed COVID-19 who died in the hospital, ED, or any overflow location.
   * @return cvdNumC19Died property set by first invocation of cvdNumC19Died method or {@code null}.
   */
  @JsonIgnore public Integer getCvdNumC19DiedInteger() {
    return (Integer) getValue("cvdNumC19Died");
  }
  /**
   * numc19died - DEATHS: Patients with suspected or confirmed COVID-19 who died in the hospital, ED, or any overflow location.
   * @return all cvdNumC19Died properties as {@link java.util.Collection} or an empty collection 
   * if cvdNumC19Died was not set.
   */
  @JsonIgnore public java.util.Collection<Integer> getCvdNumC19DiedIntegers() {
    final java.lang.Object current = myData.get("cvdNumC19Died");
    if (current == null) return Collections.emptyList();
    if (current instanceof java.util.Collection) {
      return (java.util.Collection<Integer>) current;
    }
    return Arrays.asList((Integer) current);
  }
  /**
   * numc19died - DEATHS: Patients with suspected or confirmed COVID-19 who died in the hospital, ED, or any overflow location.
   * @return cvdNumC19Died property set by first invocation of cvdNumC19Died method or {@code null}.
   */
  @JsonIgnore public Long getCvdNumC19DiedLong() {
    return (Long) getValue("cvdNumC19Died");
  }
  /**
   * numc19died - DEATHS: Patients with suspected or confirmed COVID-19 who died in the hospital, ED, or any overflow location.
   * @return all cvdNumC19Died properties as {@link java.util.Collection} or an empty collection 
   * if cvdNumC19Died was not set.
   */
  @JsonIgnore public java.util.Collection<Long> getCvdNumC19DiedLongs() {
    final java.lang.Object current = myData.get("cvdNumC19Died");
    if (current == null) return Collections.emptyList();
    if (current instanceof java.util.Collection) {
      return (java.util.Collection<Long>) current;
    }
    return Arrays.asList((Long) current);
  }
  /**
   * numc19died - DEATHS: Patients with suspected or confirmed COVID-19 who died in the hospital, ED, or any overflow location.
   * @return cvdNumC19Died property set by first invocation of cvdNumC19Died method or {@code null}.
   */
  @JsonIgnore public Float getCvdNumC19DiedFloat() {
    return (Float) getValue("cvdNumC19Died");
  }
  /**
   * numc19died - DEATHS: Patients with suspected or confirmed COVID-19 who died in the hospital, ED, or any overflow location.
   * @return all cvdNumC19Died properties as {@link java.util.Collection} or an empty collection 
   * if cvdNumC19Died was not set.
   */
  @JsonIgnore public java.util.Collection<Float> getCvdNumC19DiedFloats() {
    final java.lang.Object current = myData.get("cvdNumC19Died");
    if (current == null) return Collections.emptyList();
    if (current instanceof java.util.Collection) {
      return (java.util.Collection<Float>) current;
    }
    return Arrays.asList((Float) current);
  }
  /**
   * numc19died - DEATHS: Patients with suspected or confirmed COVID-19 who died in the hospital, ED, or any overflow location.
   * @return cvdNumC19Died property set by first invocation of cvdNumC19Died method or {@code null}.
   */
  @JsonIgnore public Double getCvdNumC19DiedDouble() {
    return (Double) getValue("cvdNumC19Died");
  }
  /**
   * numc19died - DEATHS: Patients with suspected or confirmed COVID-19 who died in the hospital, ED, or any overflow location.
   * @return all cvdNumC19Died properties as {@link java.util.Collection} or an empty collection 
   * if cvdNumC19Died was not set.
   */
  @JsonIgnore public java.util.Collection<Double> getCvdNumC19DiedDoubles() {
    final java.lang.Object current = myData.get("cvdNumC19Died");
    if (current == null) return Collections.emptyList();
    if (current instanceof java.util.Collection) {
      return (java.util.Collection<Double>) current;
    }
    return Arrays.asList((Double) current);
  }
  /**
   * numc19died - DEATHS: Patients with suspected or confirmed COVID-19 who died in the hospital, ED, or any overflow location.
   * @return cvdNumC19Died property set by first invocation of cvdNumC19Died method or {@code null}.
   */
  @JsonIgnore public String getCvdNumC19DiedString() {
    return (String) getValue("cvdNumC19Died");
  }
  /**
   * numc19died - DEATHS: Patients with suspected or confirmed COVID-19 who died in the hospital, ED, or any overflow location.
   * @return all cvdNumC19Died properties as {@link java.util.Collection} or an empty collection 
   * if cvdNumC19Died was not set.
   */
  @JsonIgnore public java.util.Collection<String> getCvdNumC19DiedStrings() {
    final java.lang.Object current = myData.get("cvdNumC19Died");
    if (current == null) return Collections.emptyList();
    if (current instanceof java.util.Collection) {
      return (java.util.Collection<String>) current;
    }
    return Arrays.asList((String) current);
  }
  /**
   * numc19hopats - HOSPITAL ONSET: Patients hospitalized in an NHSN inpatient care location with onset of suspected or confirmed COVID-19 14 or more days after hospitalization.
   * @return cvdNumC19HOPats property set by first invocation of cvdNumC19HOPats method or {@code null}.
   */
  @JsonIgnore public Integer getCvdNumC19HOPatsInteger() {
    return (Integer) getValue("cvdNumC19HOPats");
  }
  /**
   * numc19hopats - HOSPITAL ONSET: Patients hospitalized in an NHSN inpatient care location with onset of suspected or confirmed COVID-19 14 or more days after hospitalization.
   * @return all cvdNumC19HOPats properties as {@link java.util.Collection} or an empty collection 
   * if cvdNumC19HOPats was not set.
   */
  @JsonIgnore public java.util.Collection<Integer> getCvdNumC19HOPatsIntegers() {
    final java.lang.Object current = myData.get("cvdNumC19HOPats");
    if (current == null) return Collections.emptyList();
    if (current instanceof java.util.Collection) {
      return (java.util.Collection<Integer>) current;
    }
    return Arrays.asList((Integer) current);
  }
  /**
   * numc19hopats - HOSPITAL ONSET: Patients hospitalized in an NHSN inpatient care location with onset of suspected or confirmed COVID-19 14 or more days after hospitalization.
   * @return cvdNumC19HOPats property set by first invocation of cvdNumC19HOPats method or {@code null}.
   */
  @JsonIgnore public Long getCvdNumC19HOPatsLong() {
    return (Long) getValue("cvdNumC19HOPats");
  }
  /**
   * numc19hopats - HOSPITAL ONSET: Patients hospitalized in an NHSN inpatient care location with onset of suspected or confirmed COVID-19 14 or more days after hospitalization.
   * @return all cvdNumC19HOPats properties as {@link java.util.Collection} or an empty collection 
   * if cvdNumC19HOPats was not set.
   */
  @JsonIgnore public java.util.Collection<Long> getCvdNumC19HOPatsLongs() {
    final java.lang.Object current = myData.get("cvdNumC19HOPats");
    if (current == null) return Collections.emptyList();
    if (current instanceof java.util.Collection) {
      return (java.util.Collection<Long>) current;
    }
    return Arrays.asList((Long) current);
  }
  /**
   * numc19hopats - HOSPITAL ONSET: Patients hospitalized in an NHSN inpatient care location with onset of suspected or confirmed COVID-19 14 or more days after hospitalization.
   * @return cvdNumC19HOPats property set by first invocation of cvdNumC19HOPats method or {@code null}.
   */
  @JsonIgnore public Float getCvdNumC19HOPatsFloat() {
    return (Float) getValue("cvdNumC19HOPats");
  }
  /**
   * numc19hopats - HOSPITAL ONSET: Patients hospitalized in an NHSN inpatient care location with onset of suspected or confirmed COVID-19 14 or more days after hospitalization.
   * @return all cvdNumC19HOPats properties as {@link java.util.Collection} or an empty collection 
   * if cvdNumC19HOPats was not set.
   */
  @JsonIgnore public java.util.Collection<Float> getCvdNumC19HOPatsFloats() {
    final java.lang.Object current = myData.get("cvdNumC19HOPats");
    if (current == null) return Collections.emptyList();
    if (current instanceof java.util.Collection) {
      return (java.util.Collection<Float>) current;
    }
    return Arrays.asList((Float) current);
  }
  /**
   * numc19hopats - HOSPITAL ONSET: Patients hospitalized in an NHSN inpatient care location with onset of suspected or confirmed COVID-19 14 or more days after hospitalization.
   * @return cvdNumC19HOPats property set by first invocation of cvdNumC19HOPats method or {@code null}.
   */
  @JsonIgnore public Double getCvdNumC19HOPatsDouble() {
    return (Double) getValue("cvdNumC19HOPats");
  }
  /**
   * numc19hopats - HOSPITAL ONSET: Patients hospitalized in an NHSN inpatient care location with onset of suspected or confirmed COVID-19 14 or more days after hospitalization.
   * @return all cvdNumC19HOPats properties as {@link java.util.Collection} or an empty collection 
   * if cvdNumC19HOPats was not set.
   */
  @JsonIgnore public java.util.Collection<Double> getCvdNumC19HOPatsDoubles() {
    final java.lang.Object current = myData.get("cvdNumC19HOPats");
    if (current == null) return Collections.emptyList();
    if (current instanceof java.util.Collection) {
      return (java.util.Collection<Double>) current;
    }
    return Arrays.asList((Double) current);
  }
  /**
   * numc19hopats - HOSPITAL ONSET: Patients hospitalized in an NHSN inpatient care location with onset of suspected or confirmed COVID-19 14 or more days after hospitalization.
   * @return cvdNumC19HOPats property set by first invocation of cvdNumC19HOPats method or {@code null}.
   */
  @JsonIgnore public String getCvdNumC19HOPatsString() {
    return (String) getValue("cvdNumC19HOPats");
  }
  /**
   * numc19hopats - HOSPITAL ONSET: Patients hospitalized in an NHSN inpatient care location with onset of suspected or confirmed COVID-19 14 or more days after hospitalization.
   * @return all cvdNumC19HOPats properties as {@link java.util.Collection} or an empty collection 
   * if cvdNumC19HOPats was not set.
   */
  @JsonIgnore public java.util.Collection<String> getCvdNumC19HOPatsStrings() {
    final java.lang.Object current = myData.get("cvdNumC19HOPats");
    if (current == null) return Collections.emptyList();
    if (current instanceof java.util.Collection) {
      return (java.util.Collection<String>) current;
    }
    return Arrays.asList((String) current);
  }
  /**
   * numventuse - MECHANICAL VENTILATORS IN USE: Total number of ventilators in use.
   * @return cvdNumVentUse property set by first invocation of cvdNumVentUse method or {@code null}.
   */
  @JsonIgnore public Integer getCvdNumVentUseInteger() {
    return (Integer) getValue("cvdNumVentUse");
  }
  /**
   * numventuse - MECHANICAL VENTILATORS IN USE: Total number of ventilators in use.
   * @return all cvdNumVentUse properties as {@link java.util.Collection} or an empty collection 
   * if cvdNumVentUse was not set.
   */
  @JsonIgnore public java.util.Collection<Integer> getCvdNumVentUseIntegers() {
    final java.lang.Object current = myData.get("cvdNumVentUse");
    if (current == null) return Collections.emptyList();
    if (current instanceof java.util.Collection) {
      return (java.util.Collection<Integer>) current;
    }
    return Arrays.asList((Integer) current);
  }
  /**
   * numventuse - MECHANICAL VENTILATORS IN USE: Total number of ventilators in use.
   * @return cvdNumVentUse property set by first invocation of cvdNumVentUse method or {@code null}.
   */
  @JsonIgnore public Long getCvdNumVentUseLong() {
    return (Long) getValue("cvdNumVentUse");
  }
  /**
   * numventuse - MECHANICAL VENTILATORS IN USE: Total number of ventilators in use.
   * @return all cvdNumVentUse properties as {@link java.util.Collection} or an empty collection 
   * if cvdNumVentUse was not set.
   */
  @JsonIgnore public java.util.Collection<Long> getCvdNumVentUseLongs() {
    final java.lang.Object current = myData.get("cvdNumVentUse");
    if (current == null) return Collections.emptyList();
    if (current instanceof java.util.Collection) {
      return (java.util.Collection<Long>) current;
    }
    return Arrays.asList((Long) current);
  }
  /**
   * numventuse - MECHANICAL VENTILATORS IN USE: Total number of ventilators in use.
   * @return cvdNumVentUse property set by first invocation of cvdNumVentUse method or {@code null}.
   */
  @JsonIgnore public Float getCvdNumVentUseFloat() {
    return (Float) getValue("cvdNumVentUse");
  }
  /**
   * numventuse - MECHANICAL VENTILATORS IN USE: Total number of ventilators in use.
   * @return all cvdNumVentUse properties as {@link java.util.Collection} or an empty collection 
   * if cvdNumVentUse was not set.
   */
  @JsonIgnore public java.util.Collection<Float> getCvdNumVentUseFloats() {
    final java.lang.Object current = myData.get("cvdNumVentUse");
    if (current == null) return Collections.emptyList();
    if (current instanceof java.util.Collection) {
      return (java.util.Collection<Float>) current;
    }
    return Arrays.asList((Float) current);
  }
  /**
   * numventuse - MECHANICAL VENTILATORS IN USE: Total number of ventilators in use.
   * @return cvdNumVentUse property set by first invocation of cvdNumVentUse method or {@code null}.
   */
  @JsonIgnore public Double getCvdNumVentUseDouble() {
    return (Double) getValue("cvdNumVentUse");
  }
  /**
   * numventuse - MECHANICAL VENTILATORS IN USE: Total number of ventilators in use.
   * @return all cvdNumVentUse properties as {@link java.util.Collection} or an empty collection 
   * if cvdNumVentUse was not set.
   */
  @JsonIgnore public java.util.Collection<Double> getCvdNumVentUseDoubles() {
    final java.lang.Object current = myData.get("cvdNumVentUse");
    if (current == null) return Collections.emptyList();
    if (current instanceof java.util.Collection) {
      return (java.util.Collection<Double>) current;
    }
    return Arrays.asList((Double) current);
  }
  /**
   * numventuse - MECHANICAL VENTILATORS IN USE: Total number of ventilators in use.
   * @return cvdNumVentUse property set by first invocation of cvdNumVentUse method or {@code null}.
   */
  @JsonIgnore public String getCvdNumVentUseString() {
    return (String) getValue("cvdNumVentUse");
  }
  /**
   * numventuse - MECHANICAL VENTILATORS IN USE: Total number of ventilators in use.
   * @return all cvdNumVentUse properties as {@link java.util.Collection} or an empty collection 
   * if cvdNumVentUse was not set.
   */
  @JsonIgnore public java.util.Collection<String> getCvdNumVentUseStrings() {
    final java.lang.Object current = myData.get("cvdNumVentUse");
    if (current == null) return Collections.emptyList();
    if (current instanceof java.util.Collection) {
      return (java.util.Collection<String>) current;
    }
    return Arrays.asList((String) current);
  }
  /**
   * numc19ofmechventpats - ED/OVERFLOW and VENTILATED: Patients with suspected or confirmed COVID-19 who are in the ED or any overflow location awaiting an inpatient bed and on a mechanical ventilator.
   * @return cvdNumC19OFMechVentPats property set by first invocation of cvdNumC19OFMechVentPats method or {@code null}.
   */
  @JsonIgnore public Integer getCvdNumC19OFMechVentPatsInteger() {
    return (Integer) getValue("cvdNumC19OFMechVentPats");
  }
  /**
   * numc19ofmechventpats - ED/OVERFLOW and VENTILATED: Patients with suspected or confirmed COVID-19 who are in the ED or any overflow location awaiting an inpatient bed and on a mechanical ventilator.
   * @return all cvdNumC19OFMechVentPats properties as {@link java.util.Collection} or an empty collection 
   * if cvdNumC19OFMechVentPats was not set.
   */
  @JsonIgnore public java.util.Collection<Integer> getCvdNumC19OFMechVentPatsIntegers() {
    final java.lang.Object current = myData.get("cvdNumC19OFMechVentPats");
    if (current == null) return Collections.emptyList();
    if (current instanceof java.util.Collection) {
      return (java.util.Collection<Integer>) current;
    }
    return Arrays.asList((Integer) current);
  }
  /**
   * numc19ofmechventpats - ED/OVERFLOW and VENTILATED: Patients with suspected or confirmed COVID-19 who are in the ED or any overflow location awaiting an inpatient bed and on a mechanical ventilator.
   * @return cvdNumC19OFMechVentPats property set by first invocation of cvdNumC19OFMechVentPats method or {@code null}.
   */
  @JsonIgnore public Long getCvdNumC19OFMechVentPatsLong() {
    return (Long) getValue("cvdNumC19OFMechVentPats");
  }
  /**
   * numc19ofmechventpats - ED/OVERFLOW and VENTILATED: Patients with suspected or confirmed COVID-19 who are in the ED or any overflow location awaiting an inpatient bed and on a mechanical ventilator.
   * @return all cvdNumC19OFMechVentPats properties as {@link java.util.Collection} or an empty collection 
   * if cvdNumC19OFMechVentPats was not set.
   */
  @JsonIgnore public java.util.Collection<Long> getCvdNumC19OFMechVentPatsLongs() {
    final java.lang.Object current = myData.get("cvdNumC19OFMechVentPats");
    if (current == null) return Collections.emptyList();
    if (current instanceof java.util.Collection) {
      return (java.util.Collection<Long>) current;
    }
    return Arrays.asList((Long) current);
  }
  /**
   * numc19ofmechventpats - ED/OVERFLOW and VENTILATED: Patients with suspected or confirmed COVID-19 who are in the ED or any overflow location awaiting an inpatient bed and on a mechanical ventilator.
   * @return cvdNumC19OFMechVentPats property set by first invocation of cvdNumC19OFMechVentPats method or {@code null}.
   */
  @JsonIgnore public Float getCvdNumC19OFMechVentPatsFloat() {
    return (Float) getValue("cvdNumC19OFMechVentPats");
  }
  /**
   * numc19ofmechventpats - ED/OVERFLOW and VENTILATED: Patients with suspected or confirmed COVID-19 who are in the ED or any overflow location awaiting an inpatient bed and on a mechanical ventilator.
   * @return all cvdNumC19OFMechVentPats properties as {@link java.util.Collection} or an empty collection 
   * if cvdNumC19OFMechVentPats was not set.
   */
  @JsonIgnore public java.util.Collection<Float> getCvdNumC19OFMechVentPatsFloats() {
    final java.lang.Object current = myData.get("cvdNumC19OFMechVentPats");
    if (current == null) return Collections.emptyList();
    if (current instanceof java.util.Collection) {
      return (java.util.Collection<Float>) current;
    }
    return Arrays.asList((Float) current);
  }
  /**
   * numc19ofmechventpats - ED/OVERFLOW and VENTILATED: Patients with suspected or confirmed COVID-19 who are in the ED or any overflow location awaiting an inpatient bed and on a mechanical ventilator.
   * @return cvdNumC19OFMechVentPats property set by first invocation of cvdNumC19OFMechVentPats method or {@code null}.
   */
  @JsonIgnore public Double getCvdNumC19OFMechVentPatsDouble() {
    return (Double) getValue("cvdNumC19OFMechVentPats");
  }
  /**
   * numc19ofmechventpats - ED/OVERFLOW and VENTILATED: Patients with suspected or confirmed COVID-19 who are in the ED or any overflow location awaiting an inpatient bed and on a mechanical ventilator.
   * @return all cvdNumC19OFMechVentPats properties as {@link java.util.Collection} or an empty collection 
   * if cvdNumC19OFMechVentPats was not set.
   */
  @JsonIgnore public java.util.Collection<Double> getCvdNumC19OFMechVentPatsDoubles() {
    final java.lang.Object current = myData.get("cvdNumC19OFMechVentPats");
    if (current == null) return Collections.emptyList();
    if (current instanceof java.util.Collection) {
      return (java.util.Collection<Double>) current;
    }
    return Arrays.asList((Double) current);
  }
  /**
   * numc19ofmechventpats - ED/OVERFLOW and VENTILATED: Patients with suspected or confirmed COVID-19 who are in the ED or any overflow location awaiting an inpatient bed and on a mechanical ventilator.
   * @return cvdNumC19OFMechVentPats property set by first invocation of cvdNumC19OFMechVentPats method or {@code null}.
   */
  @JsonIgnore public String getCvdNumC19OFMechVentPatsString() {
    return (String) getValue("cvdNumC19OFMechVentPats");
  }
  /**
   * numc19ofmechventpats - ED/OVERFLOW and VENTILATED: Patients with suspected or confirmed COVID-19 who are in the ED or any overflow location awaiting an inpatient bed and on a mechanical ventilator.
   * @return all cvdNumC19OFMechVentPats properties as {@link java.util.Collection} or an empty collection 
   * if cvdNumC19OFMechVentPats was not set.
   */
  @JsonIgnore public java.util.Collection<String> getCvdNumC19OFMechVentPatsStrings() {
    final java.lang.Object current = myData.get("cvdNumC19OFMechVentPats");
    if (current == null) return Collections.emptyList();
    if (current instanceof java.util.Collection) {
      return (java.util.Collection<String>) current;
    }
    return Arrays.asList((String) current);
  }
  /**
   * Name of the County of the NHSN facility that this data record applies to. Use [[cvdFacilityId]] to identify the facility. To provide other details, [[healthcareReportingData]] can be used on a [[Hospital]] entry.
   * @return cvdFacilityCounty property set by first invocation of cvdFacilityCounty method or {@code null}.
   */
  @JsonIgnore public String getCvdFacilityCounty() {
    return (String) getValue("cvdFacilityCounty");
  }
  /**
   * Name of the County of the NHSN facility that this data record applies to. Use [[cvdFacilityId]] to identify the facility. To provide other details, [[healthcareReportingData]] can be used on a [[Hospital]] entry.
   * @return all cvdFacilityCounty properties as {@link java.util.Collection} or an empty collection 
   * if cvdFacilityCounty was not set.
   */
  @JsonIgnore public java.util.Collection<String> getCvdFacilityCountys() {
    final java.lang.Object current = myData.get("cvdFacilityCounty");
    if (current == null) return Collections.emptyList();
    if (current instanceof java.util.Collection) {
      return (java.util.Collection<String>) current;
    }
    return Arrays.asList((String) current);
  }
  /**
   * numbedsocc - HOSPITAL INPATIENT BED OCCUPANCY: Total number of staffed inpatient beds that are occupied.
   * @return cvdNumBedsOcc property set by first invocation of cvdNumBedsOcc method or {@code null}.
   */
  @JsonIgnore public Integer getCvdNumBedsOccInteger() {
    return (Integer) getValue("cvdNumBedsOcc");
  }
  /**
   * numbedsocc - HOSPITAL INPATIENT BED OCCUPANCY: Total number of staffed inpatient beds that are occupied.
   * @return all cvdNumBedsOcc properties as {@link java.util.Collection} or an empty collection 
   * if cvdNumBedsOcc was not set.
   */
  @JsonIgnore public java.util.Collection<Integer> getCvdNumBedsOccIntegers() {
    final java.lang.Object current = myData.get("cvdNumBedsOcc");
    if (current == null) return Collections.emptyList();
    if (current instanceof java.util.Collection) {
      return (java.util.Collection<Integer>) current;
    }
    return Arrays.asList((Integer) current);
  }
  /**
   * numbedsocc - HOSPITAL INPATIENT BED OCCUPANCY: Total number of staffed inpatient beds that are occupied.
   * @return cvdNumBedsOcc property set by first invocation of cvdNumBedsOcc method or {@code null}.
   */
  @JsonIgnore public Long getCvdNumBedsOccLong() {
    return (Long) getValue("cvdNumBedsOcc");
  }
  /**
   * numbedsocc - HOSPITAL INPATIENT BED OCCUPANCY: Total number of staffed inpatient beds that are occupied.
   * @return all cvdNumBedsOcc properties as {@link java.util.Collection} or an empty collection 
   * if cvdNumBedsOcc was not set.
   */
  @JsonIgnore public java.util.Collection<Long> getCvdNumBedsOccLongs() {
    final java.lang.Object current = myData.get("cvdNumBedsOcc");
    if (current == null) return Collections.emptyList();
    if (current instanceof java.util.Collection) {
      return (java.util.Collection<Long>) current;
    }
    return Arrays.asList((Long) current);
  }
  /**
   * numbedsocc - HOSPITAL INPATIENT BED OCCUPANCY: Total number of staffed inpatient beds that are occupied.
   * @return cvdNumBedsOcc property set by first invocation of cvdNumBedsOcc method or {@code null}.
   */
  @JsonIgnore public Float getCvdNumBedsOccFloat() {
    return (Float) getValue("cvdNumBedsOcc");
  }
  /**
   * numbedsocc - HOSPITAL INPATIENT BED OCCUPANCY: Total number of staffed inpatient beds that are occupied.
   * @return all cvdNumBedsOcc properties as {@link java.util.Collection} or an empty collection 
   * if cvdNumBedsOcc was not set.
   */
  @JsonIgnore public java.util.Collection<Float> getCvdNumBedsOccFloats() {
    final java.lang.Object current = myData.get("cvdNumBedsOcc");
    if (current == null) return Collections.emptyList();
    if (current instanceof java.util.Collection) {
      return (java.util.Collection<Float>) current;
    }
    return Arrays.asList((Float) current);
  }
  /**
   * numbedsocc - HOSPITAL INPATIENT BED OCCUPANCY: Total number of staffed inpatient beds that are occupied.
   * @return cvdNumBedsOcc property set by first invocation of cvdNumBedsOcc method or {@code null}.
   */
  @JsonIgnore public Double getCvdNumBedsOccDouble() {
    return (Double) getValue("cvdNumBedsOcc");
  }
  /**
   * numbedsocc - HOSPITAL INPATIENT BED OCCUPANCY: Total number of staffed inpatient beds that are occupied.
   * @return all cvdNumBedsOcc properties as {@link java.util.Collection} or an empty collection 
   * if cvdNumBedsOcc was not set.
   */
  @JsonIgnore public java.util.Collection<Double> getCvdNumBedsOccDoubles() {
    final java.lang.Object current = myData.get("cvdNumBedsOcc");
    if (current == null) return Collections.emptyList();
    if (current instanceof java.util.Collection) {
      return (java.util.Collection<Double>) current;
    }
    return Arrays.asList((Double) current);
  }
  /**
   * numbedsocc - HOSPITAL INPATIENT BED OCCUPANCY: Total number of staffed inpatient beds that are occupied.
   * @return cvdNumBedsOcc property set by first invocation of cvdNumBedsOcc method or {@code null}.
   */
  @JsonIgnore public String getCvdNumBedsOccString() {
    return (String) getValue("cvdNumBedsOcc");
  }
  /**
   * numbedsocc - HOSPITAL INPATIENT BED OCCUPANCY: Total number of staffed inpatient beds that are occupied.
   * @return all cvdNumBedsOcc properties as {@link java.util.Collection} or an empty collection 
   * if cvdNumBedsOcc was not set.
   */
  @JsonIgnore public java.util.Collection<String> getCvdNumBedsOccStrings() {
    final java.lang.Object current = myData.get("cvdNumBedsOcc");
    if (current == null) return Collections.emptyList();
    if (current instanceof java.util.Collection) {
      return (java.util.Collection<String>) current;
    }
    return Arrays.asList((String) current);
  }
  /**
   * numtotbeds - ALL HOSPITAL BEDS: Total number of all Inpatient and outpatient beds, including all staffed,ICU, licensed, and overflow (surge) beds used for inpatients or outpatients.
   * @return cvdNumTotBeds property set by first invocation of cvdNumTotBeds method or {@code null}.
   */
  @JsonIgnore public Integer getCvdNumTotBedsInteger() {
    return (Integer) getValue("cvdNumTotBeds");
  }
  /**
   * numtotbeds - ALL HOSPITAL BEDS: Total number of all Inpatient and outpatient beds, including all staffed,ICU, licensed, and overflow (surge) beds used for inpatients or outpatients.
   * @return all cvdNumTotBeds properties as {@link java.util.Collection} or an empty collection 
   * if cvdNumTotBeds was not set.
   */
  @JsonIgnore public java.util.Collection<Integer> getCvdNumTotBedsIntegers() {
    final java.lang.Object current = myData.get("cvdNumTotBeds");
    if (current == null) return Collections.emptyList();
    if (current instanceof java.util.Collection) {
      return (java.util.Collection<Integer>) current;
    }
    return Arrays.asList((Integer) current);
  }
  /**
   * numtotbeds - ALL HOSPITAL BEDS: Total number of all Inpatient and outpatient beds, including all staffed,ICU, licensed, and overflow (surge) beds used for inpatients or outpatients.
   * @return cvdNumTotBeds property set by first invocation of cvdNumTotBeds method or {@code null}.
   */
  @JsonIgnore public Long getCvdNumTotBedsLong() {
    return (Long) getValue("cvdNumTotBeds");
  }
  /**
   * numtotbeds - ALL HOSPITAL BEDS: Total number of all Inpatient and outpatient beds, including all staffed,ICU, licensed, and overflow (surge) beds used for inpatients or outpatients.
   * @return all cvdNumTotBeds properties as {@link java.util.Collection} or an empty collection 
   * if cvdNumTotBeds was not set.
   */
  @JsonIgnore public java.util.Collection<Long> getCvdNumTotBedsLongs() {
    final java.lang.Object current = myData.get("cvdNumTotBeds");
    if (current == null) return Collections.emptyList();
    if (current instanceof java.util.Collection) {
      return (java.util.Collection<Long>) current;
    }
    return Arrays.asList((Long) current);
  }
  /**
   * numtotbeds - ALL HOSPITAL BEDS: Total number of all Inpatient and outpatient beds, including all staffed,ICU, licensed, and overflow (surge) beds used for inpatients or outpatients.
   * @return cvdNumTotBeds property set by first invocation of cvdNumTotBeds method or {@code null}.
   */
  @JsonIgnore public Float getCvdNumTotBedsFloat() {
    return (Float) getValue("cvdNumTotBeds");
  }
  /**
   * numtotbeds - ALL HOSPITAL BEDS: Total number of all Inpatient and outpatient beds, including all staffed,ICU, licensed, and overflow (surge) beds used for inpatients or outpatients.
   * @return all cvdNumTotBeds properties as {@link java.util.Collection} or an empty collection 
   * if cvdNumTotBeds was not set.
   */
  @JsonIgnore public java.util.Collection<Float> getCvdNumTotBedsFloats() {
    final java.lang.Object current = myData.get("cvdNumTotBeds");
    if (current == null) return Collections.emptyList();
    if (current instanceof java.util.Collection) {
      return (java.util.Collection<Float>) current;
    }
    return Arrays.asList((Float) current);
  }
  /**
   * numtotbeds - ALL HOSPITAL BEDS: Total number of all Inpatient and outpatient beds, including all staffed,ICU, licensed, and overflow (surge) beds used for inpatients or outpatients.
   * @return cvdNumTotBeds property set by first invocation of cvdNumTotBeds method or {@code null}.
   */
  @JsonIgnore public Double getCvdNumTotBedsDouble() {
    return (Double) getValue("cvdNumTotBeds");
  }
  /**
   * numtotbeds - ALL HOSPITAL BEDS: Total number of all Inpatient and outpatient beds, including all staffed,ICU, licensed, and overflow (surge) beds used for inpatients or outpatients.
   * @return all cvdNumTotBeds properties as {@link java.util.Collection} or an empty collection 
   * if cvdNumTotBeds was not set.
   */
  @JsonIgnore public java.util.Collection<Double> getCvdNumTotBedsDoubles() {
    final java.lang.Object current = myData.get("cvdNumTotBeds");
    if (current == null) return Collections.emptyList();
    if (current instanceof java.util.Collection) {
      return (java.util.Collection<Double>) current;
    }
    return Arrays.asList((Double) current);
  }
  /**
   * numtotbeds - ALL HOSPITAL BEDS: Total number of all Inpatient and outpatient beds, including all staffed,ICU, licensed, and overflow (surge) beds used for inpatients or outpatients.
   * @return cvdNumTotBeds property set by first invocation of cvdNumTotBeds method or {@code null}.
   */
  @JsonIgnore public String getCvdNumTotBedsString() {
    return (String) getValue("cvdNumTotBeds");
  }
  /**
   * numtotbeds - ALL HOSPITAL BEDS: Total number of all Inpatient and outpatient beds, including all staffed,ICU, licensed, and overflow (surge) beds used for inpatients or outpatients.
   * @return all cvdNumTotBeds properties as {@link java.util.Collection} or an empty collection 
   * if cvdNumTotBeds was not set.
   */
  @JsonIgnore public java.util.Collection<String> getCvdNumTotBedsStrings() {
    final java.lang.Object current = myData.get("cvdNumTotBeds");
    if (current == null) return Collections.emptyList();
    if (current instanceof java.util.Collection) {
      return (java.util.Collection<String>) current;
    }
    return Arrays.asList((String) current);
  }
  /**
   * numc19hosppats - HOSPITALIZED: Patients currently hospitalized in an inpatient care location who have suspected or confirmed COVID-19.
   * @return cvdNumC19HospPats property set by first invocation of cvdNumC19HospPats method or {@code null}.
   */
  @JsonIgnore public Integer getCvdNumC19HospPatsInteger() {
    return (Integer) getValue("cvdNumC19HospPats");
  }
  /**
   * numc19hosppats - HOSPITALIZED: Patients currently hospitalized in an inpatient care location who have suspected or confirmed COVID-19.
   * @return all cvdNumC19HospPats properties as {@link java.util.Collection} or an empty collection 
   * if cvdNumC19HospPats was not set.
   */
  @JsonIgnore public java.util.Collection<Integer> getCvdNumC19HospPatsIntegers() {
    final java.lang.Object current = myData.get("cvdNumC19HospPats");
    if (current == null) return Collections.emptyList();
    if (current instanceof java.util.Collection) {
      return (java.util.Collection<Integer>) current;
    }
    return Arrays.asList((Integer) current);
  }
  /**
   * numc19hosppats - HOSPITALIZED: Patients currently hospitalized in an inpatient care location who have suspected or confirmed COVID-19.
   * @return cvdNumC19HospPats property set by first invocation of cvdNumC19HospPats method or {@code null}.
   */
  @JsonIgnore public Long getCvdNumC19HospPatsLong() {
    return (Long) getValue("cvdNumC19HospPats");
  }
  /**
   * numc19hosppats - HOSPITALIZED: Patients currently hospitalized in an inpatient care location who have suspected or confirmed COVID-19.
   * @return all cvdNumC19HospPats properties as {@link java.util.Collection} or an empty collection 
   * if cvdNumC19HospPats was not set.
   */
  @JsonIgnore public java.util.Collection<Long> getCvdNumC19HospPatsLongs() {
    final java.lang.Object current = myData.get("cvdNumC19HospPats");
    if (current == null) return Collections.emptyList();
    if (current instanceof java.util.Collection) {
      return (java.util.Collection<Long>) current;
    }
    return Arrays.asList((Long) current);
  }
  /**
   * numc19hosppats - HOSPITALIZED: Patients currently hospitalized in an inpatient care location who have suspected or confirmed COVID-19.
   * @return cvdNumC19HospPats property set by first invocation of cvdNumC19HospPats method or {@code null}.
   */
  @JsonIgnore public Float getCvdNumC19HospPatsFloat() {
    return (Float) getValue("cvdNumC19HospPats");
  }
  /**
   * numc19hosppats - HOSPITALIZED: Patients currently hospitalized in an inpatient care location who have suspected or confirmed COVID-19.
   * @return all cvdNumC19HospPats properties as {@link java.util.Collection} or an empty collection 
   * if cvdNumC19HospPats was not set.
   */
  @JsonIgnore public java.util.Collection<Float> getCvdNumC19HospPatsFloats() {
    final java.lang.Object current = myData.get("cvdNumC19HospPats");
    if (current == null) return Collections.emptyList();
    if (current instanceof java.util.Collection) {
      return (java.util.Collection<Float>) current;
    }
    return Arrays.asList((Float) current);
  }
  /**
   * numc19hosppats - HOSPITALIZED: Patients currently hospitalized in an inpatient care location who have suspected or confirmed COVID-19.
   * @return cvdNumC19HospPats property set by first invocation of cvdNumC19HospPats method or {@code null}.
   */
  @JsonIgnore public Double getCvdNumC19HospPatsDouble() {
    return (Double) getValue("cvdNumC19HospPats");
  }
  /**
   * numc19hosppats - HOSPITALIZED: Patients currently hospitalized in an inpatient care location who have suspected or confirmed COVID-19.
   * @return all cvdNumC19HospPats properties as {@link java.util.Collection} or an empty collection 
   * if cvdNumC19HospPats was not set.
   */
  @JsonIgnore public java.util.Collection<Double> getCvdNumC19HospPatsDoubles() {
    final java.lang.Object current = myData.get("cvdNumC19HospPats");
    if (current == null) return Collections.emptyList();
    if (current instanceof java.util.Collection) {
      return (java.util.Collection<Double>) current;
    }
    return Arrays.asList((Double) current);
  }
  /**
   * numc19hosppats - HOSPITALIZED: Patients currently hospitalized in an inpatient care location who have suspected or confirmed COVID-19.
   * @return cvdNumC19HospPats property set by first invocation of cvdNumC19HospPats method or {@code null}.
   */
  @JsonIgnore public String getCvdNumC19HospPatsString() {
    return (String) getValue("cvdNumC19HospPats");
  }
  /**
   * numc19hosppats - HOSPITALIZED: Patients currently hospitalized in an inpatient care location who have suspected or confirmed COVID-19.
   * @return all cvdNumC19HospPats properties as {@link java.util.Collection} or an empty collection 
   * if cvdNumC19HospPats was not set.
   */
  @JsonIgnore public java.util.Collection<String> getCvdNumC19HospPatsStrings() {
    final java.lang.Object current = myData.get("cvdNumC19HospPats");
    if (current == null) return Collections.emptyList();
    if (current instanceof java.util.Collection) {
      return (java.util.Collection<String>) current;
    }
    return Arrays.asList((String) current);
  }
  /**
   * Identifier of the NHSN facility that this data record applies to. Use [[cvdFacilityCounty]] to indicate the county. To provide other details, [[healthcareReportingData]] can be used on a [[Hospital]] entry.
   * @return cvdFacilityId property set by first invocation of cvdFacilityId method or {@code null}.
   */
  @JsonIgnore public String getCvdFacilityId() {
    return (String) getValue("cvdFacilityId");
  }
  /**
   * Identifier of the NHSN facility that this data record applies to. Use [[cvdFacilityCounty]] to indicate the county. To provide other details, [[healthcareReportingData]] can be used on a [[Hospital]] entry.
   * @return all cvdFacilityId properties as {@link java.util.Collection} or an empty collection 
   * if cvdFacilityId was not set.
   */
  @JsonIgnore public java.util.Collection<String> getCvdFacilityIds() {
    final java.lang.Object current = myData.get("cvdFacilityId");
    if (current == null) return Collections.emptyList();
    if (current instanceof java.util.Collection) {
      return (java.util.Collection<String>) current;
    }
    return Arrays.asList((String) current);
  }
  /**
   * numicubedsocc - ICU BED OCCUPANCY: Total number of staffed inpatient ICU beds that are occupied.
   * @return cvdNumICUBedsOcc property set by first invocation of cvdNumICUBedsOcc method or {@code null}.
   */
  @JsonIgnore public Integer getCvdNumICUBedsOccInteger() {
    return (Integer) getValue("cvdNumICUBedsOcc");
  }
  /**
   * numicubedsocc - ICU BED OCCUPANCY: Total number of staffed inpatient ICU beds that are occupied.
   * @return all cvdNumICUBedsOcc properties as {@link java.util.Collection} or an empty collection 
   * if cvdNumICUBedsOcc was not set.
   */
  @JsonIgnore public java.util.Collection<Integer> getCvdNumICUBedsOccIntegers() {
    final java.lang.Object current = myData.get("cvdNumICUBedsOcc");
    if (current == null) return Collections.emptyList();
    if (current instanceof java.util.Collection) {
      return (java.util.Collection<Integer>) current;
    }
    return Arrays.asList((Integer) current);
  }
  /**
   * numicubedsocc - ICU BED OCCUPANCY: Total number of staffed inpatient ICU beds that are occupied.
   * @return cvdNumICUBedsOcc property set by first invocation of cvdNumICUBedsOcc method or {@code null}.
   */
  @JsonIgnore public Long getCvdNumICUBedsOccLong() {
    return (Long) getValue("cvdNumICUBedsOcc");
  }
  /**
   * numicubedsocc - ICU BED OCCUPANCY: Total number of staffed inpatient ICU beds that are occupied.
   * @return all cvdNumICUBedsOcc properties as {@link java.util.Collection} or an empty collection 
   * if cvdNumICUBedsOcc was not set.
   */
  @JsonIgnore public java.util.Collection<Long> getCvdNumICUBedsOccLongs() {
    final java.lang.Object current = myData.get("cvdNumICUBedsOcc");
    if (current == null) return Collections.emptyList();
    if (current instanceof java.util.Collection) {
      return (java.util.Collection<Long>) current;
    }
    return Arrays.asList((Long) current);
  }
  /**
   * numicubedsocc - ICU BED OCCUPANCY: Total number of staffed inpatient ICU beds that are occupied.
   * @return cvdNumICUBedsOcc property set by first invocation of cvdNumICUBedsOcc method or {@code null}.
   */
  @JsonIgnore public Float getCvdNumICUBedsOccFloat() {
    return (Float) getValue("cvdNumICUBedsOcc");
  }
  /**
   * numicubedsocc - ICU BED OCCUPANCY: Total number of staffed inpatient ICU beds that are occupied.
   * @return all cvdNumICUBedsOcc properties as {@link java.util.Collection} or an empty collection 
   * if cvdNumICUBedsOcc was not set.
   */
  @JsonIgnore public java.util.Collection<Float> getCvdNumICUBedsOccFloats() {
    final java.lang.Object current = myData.get("cvdNumICUBedsOcc");
    if (current == null) return Collections.emptyList();
    if (current instanceof java.util.Collection) {
      return (java.util.Collection<Float>) current;
    }
    return Arrays.asList((Float) current);
  }
  /**
   * numicubedsocc - ICU BED OCCUPANCY: Total number of staffed inpatient ICU beds that are occupied.
   * @return cvdNumICUBedsOcc property set by first invocation of cvdNumICUBedsOcc method or {@code null}.
   */
  @JsonIgnore public Double getCvdNumICUBedsOccDouble() {
    return (Double) getValue("cvdNumICUBedsOcc");
  }
  /**
   * numicubedsocc - ICU BED OCCUPANCY: Total number of staffed inpatient ICU beds that are occupied.
   * @return all cvdNumICUBedsOcc properties as {@link java.util.Collection} or an empty collection 
   * if cvdNumICUBedsOcc was not set.
   */
  @JsonIgnore public java.util.Collection<Double> getCvdNumICUBedsOccDoubles() {
    final java.lang.Object current = myData.get("cvdNumICUBedsOcc");
    if (current == null) return Collections.emptyList();
    if (current instanceof java.util.Collection) {
      return (java.util.Collection<Double>) current;
    }
    return Arrays.asList((Double) current);
  }
  /**
   * numicubedsocc - ICU BED OCCUPANCY: Total number of staffed inpatient ICU beds that are occupied.
   * @return cvdNumICUBedsOcc property set by first invocation of cvdNumICUBedsOcc method or {@code null}.
   */
  @JsonIgnore public String getCvdNumICUBedsOccString() {
    return (String) getValue("cvdNumICUBedsOcc");
  }
  /**
   * numicubedsocc - ICU BED OCCUPANCY: Total number of staffed inpatient ICU beds that are occupied.
   * @return all cvdNumICUBedsOcc properties as {@link java.util.Collection} or an empty collection 
   * if cvdNumICUBedsOcc was not set.
   */
  @JsonIgnore public java.util.Collection<String> getCvdNumICUBedsOccStrings() {
    final java.lang.Object current = myData.get("cvdNumICUBedsOcc");
    if (current == null) return Collections.emptyList();
    if (current instanceof java.util.Collection) {
      return (java.util.Collection<String>) current;
    }
    return Arrays.asList((String) current);
  }
  protected CDCPMDRecord(java.util.Map<String,java.lang.Object> data) {
    super(data);
  }
  
  /**
   * Builder for {@link CDCPMDRecord}
   */
  public static class Builder extends StructuredValue.Builder {
    public Builder(@NotNull HashMap<String,java.lang.Object> data) {
      super(data);
    }
    @NotNull public CDCPMDRecord build() {
      return new CDCPMDRecord(myData);
    }
    /**
     * numicubeds - ICU BEDS: Total number of staffed inpatient intensive care unit (ICU) beds.
     * @param integer value to set
     * @return this builder instance
     */
    @NotNull public Builder cvdNumICUBeds(@NotNull Integer integer) {
      putValue("cvdNumICUBeds", integer);
      return this;
    }
    /**
     * numicubeds - ICU BEDS: Total number of staffed inpatient intensive care unit (ICU) beds.
     * @param cvdNumICUBeds value to set
     * @return this builder instance
     */
    @NotNull public Builder cvdNumICUBeds(@NotNull Long cvdNumICUBeds) {
      putValue("cvdNumICUBeds", cvdNumICUBeds);
      return this;
    }
    /**
     * numicubeds - ICU BEDS: Total number of staffed inpatient intensive care unit (ICU) beds.
     * @param cvdNumICUBeds value to set
     * @return this builder instance
     */
    @NotNull public Builder cvdNumICUBeds(@NotNull Float cvdNumICUBeds) {
      putValue("cvdNumICUBeds", cvdNumICUBeds);
      return this;
    }
    /**
     * numicubeds - ICU BEDS: Total number of staffed inpatient intensive care unit (ICU) beds.
     * @param cvdNumICUBeds value to set
     * @return this builder instance
     */
    @NotNull public Builder cvdNumICUBeds(@NotNull Double cvdNumICUBeds) {
      putValue("cvdNumICUBeds", cvdNumICUBeds);
      return this;
    }
    /**
     * numicubeds - ICU BEDS: Total number of staffed inpatient intensive care unit (ICU) beds.
     * @param cvdNumICUBeds value to set
     * @return this builder instance
     */
    @NotNull public Builder cvdNumICUBeds(@NotNull String cvdNumICUBeds) {
      putValue("cvdNumICUBeds", cvdNumICUBeds);
      return this;
    }
    /**
     * Remove cvdNumICUBeds property from the builder.
     * If this property is repeatable, all instances are removed.
     * @return this builder instance
     */
    @NotNull public Builder removeCvdNumICUBeds() {
      removeValue("cvdNumICUBeds");
      return this;
    }
    /**
     * Get currently set value for cvdNumICUBeds property in this builder.
     * @return previously set value or {@code null}. If multiple values have been 
     * set to this property, then {@link java.util.Collection} instance will be 
     * returned.
     */
    @Nullable public java.lang.Object getCvdNumICUBeds() {
      return myData.get("cvdNumICUBeds");
    }
    /**
     * collectiondate - Date for which patient counts are reported.
     * @param cvdCollectionDate value to set
     * @return this builder instance
     */
    @NotNull public Builder cvdCollectionDate(@NotNull String cvdCollectionDate) {
      putValue("cvdCollectionDate", cvdCollectionDate);
      return this;
    }
    /**
     * collectiondate - Date for which patient counts are reported.
     * @param date value to set
     * @return this builder instance
     */
    @NotNull public Builder cvdCollectionDate(@NotNull java.util.Date date) {
      putValue("cvdCollectionDate", date);
      return this;
    }
    /**
     * Remove cvdCollectionDate property from the builder.
     * If this property is repeatable, all instances are removed.
     * @return this builder instance
     */
    @NotNull public Builder removeCvdCollectionDate() {
      removeValue("cvdCollectionDate");
      return this;
    }
    /**
     * Get currently set value for cvdCollectionDate property in this builder.
     * @return previously set value or {@code null}. If multiple values have been 
     * set to this property, then {@link java.util.Collection} instance will be 
     * returned.
     */
    @Nullable public java.lang.Object getCvdCollectionDate() {
      return myData.get("cvdCollectionDate");
    }
    /**
     * Publication date of an online listing.
     * @param date value to set
     * @return this builder instance
     */
    @NotNull public Builder datePosted(@NotNull java.util.Date date) {
      putValue("datePosted", date);
      return this;
    }
    /**
     * Remove datePosted property from the builder.
     * If this property is repeatable, all instances are removed.
     * @return this builder instance
     */
    @NotNull public Builder removeDatePosted() {
      removeValue("datePosted");
      return this;
    }
    /**
     * Get currently set value for datePosted property in this builder.
     * @return previously set value or {@code null}. If multiple values have been 
     * set to this property, then {@link java.util.Collection} instance will be 
     * returned.
     */
    @Nullable public java.lang.Object getDatePosted() {
      return myData.get("datePosted");
    }
    /**
     * numbeds - HOSPITAL INPATIENT BEDS: Inpatient beds, including all staffed, licensed, and overflow (surge) beds used for inpatients.
     * @param integer value to set
     * @return this builder instance
     */
    @NotNull public Builder cvdNumBeds(@NotNull Integer integer) {
      putValue("cvdNumBeds", integer);
      return this;
    }
    /**
     * numbeds - HOSPITAL INPATIENT BEDS: Inpatient beds, including all staffed, licensed, and overflow (surge) beds used for inpatients.
     * @param cvdNumBeds value to set
     * @return this builder instance
     */
    @NotNull public Builder cvdNumBeds(@NotNull Long cvdNumBeds) {
      putValue("cvdNumBeds", cvdNumBeds);
      return this;
    }
    /**
     * numbeds - HOSPITAL INPATIENT BEDS: Inpatient beds, including all staffed, licensed, and overflow (surge) beds used for inpatients.
     * @param cvdNumBeds value to set
     * @return this builder instance
     */
    @NotNull public Builder cvdNumBeds(@NotNull Float cvdNumBeds) {
      putValue("cvdNumBeds", cvdNumBeds);
      return this;
    }
    /**
     * numbeds - HOSPITAL INPATIENT BEDS: Inpatient beds, including all staffed, licensed, and overflow (surge) beds used for inpatients.
     * @param cvdNumBeds value to set
     * @return this builder instance
     */
    @NotNull public Builder cvdNumBeds(@NotNull Double cvdNumBeds) {
      putValue("cvdNumBeds", cvdNumBeds);
      return this;
    }
    /**
     * numbeds - HOSPITAL INPATIENT BEDS: Inpatient beds, including all staffed, licensed, and overflow (surge) beds used for inpatients.
     * @param cvdNumBeds value to set
     * @return this builder instance
     */
    @NotNull public Builder cvdNumBeds(@NotNull String cvdNumBeds) {
      putValue("cvdNumBeds", cvdNumBeds);
      return this;
    }
    /**
     * Remove cvdNumBeds property from the builder.
     * If this property is repeatable, all instances are removed.
     * @return this builder instance
     */
    @NotNull public Builder removeCvdNumBeds() {
      removeValue("cvdNumBeds");
      return this;
    }
    /**
     * Get currently set value for cvdNumBeds property in this builder.
     * @return previously set value or {@code null}. If multiple values have been 
     * set to this property, then {@link java.util.Collection} instance will be 
     * returned.
     */
    @Nullable public java.lang.Object getCvdNumBeds() {
      return myData.get("cvdNumBeds");
    }
    /**
     * numc19mechventpats - HOSPITALIZED and VENTILATED: Patients hospitalized in an NHSN inpatient care location who have suspected or confirmed COVID-19 and are on a mechanical ventilator.
     * @param integer value to set
     * @return this builder instance
     */
    @NotNull public Builder cvdNumC19MechVentPats(@NotNull Integer integer) {
      putValue("cvdNumC19MechVentPats", integer);
      return this;
    }
    /**
     * numc19mechventpats - HOSPITALIZED and VENTILATED: Patients hospitalized in an NHSN inpatient care location who have suspected or confirmed COVID-19 and are on a mechanical ventilator.
     * @param cvdNumC19MechVentPats value to set
     * @return this builder instance
     */
    @NotNull public Builder cvdNumC19MechVentPats(@NotNull Long cvdNumC19MechVentPats) {
      putValue("cvdNumC19MechVentPats", cvdNumC19MechVentPats);
      return this;
    }
    /**
     * numc19mechventpats - HOSPITALIZED and VENTILATED: Patients hospitalized in an NHSN inpatient care location who have suspected or confirmed COVID-19 and are on a mechanical ventilator.
     * @param cvdNumC19MechVentPats value to set
     * @return this builder instance
     */
    @NotNull public Builder cvdNumC19MechVentPats(@NotNull Float cvdNumC19MechVentPats) {
      putValue("cvdNumC19MechVentPats", cvdNumC19MechVentPats);
      return this;
    }
    /**
     * numc19mechventpats - HOSPITALIZED and VENTILATED: Patients hospitalized in an NHSN inpatient care location who have suspected or confirmed COVID-19 and are on a mechanical ventilator.
     * @param cvdNumC19MechVentPats value to set
     * @return this builder instance
     */
    @NotNull public Builder cvdNumC19MechVentPats(@NotNull Double cvdNumC19MechVentPats) {
      putValue("cvdNumC19MechVentPats", cvdNumC19MechVentPats);
      return this;
    }
    /**
     * numc19mechventpats - HOSPITALIZED and VENTILATED: Patients hospitalized in an NHSN inpatient care location who have suspected or confirmed COVID-19 and are on a mechanical ventilator.
     * @param cvdNumC19MechVentPats value to set
     * @return this builder instance
     */
    @NotNull public Builder cvdNumC19MechVentPats(@NotNull String cvdNumC19MechVentPats) {
      putValue("cvdNumC19MechVentPats", cvdNumC19MechVentPats);
      return this;
    }
    /**
     * Remove cvdNumC19MechVentPats property from the builder.
     * If this property is repeatable, all instances are removed.
     * @return this builder instance
     */
    @NotNull public Builder removeCvdNumC19MechVentPats() {
      removeValue("cvdNumC19MechVentPats");
      return this;
    }
    /**
     * Get currently set value for cvdNumC19MechVentPats property in this builder.
     * @return previously set value or {@code null}. If multiple values have been 
     * set to this property, then {@link java.util.Collection} instance will be 
     * returned.
     */
    @Nullable public java.lang.Object getCvdNumC19MechVentPats() {
      return myData.get("cvdNumC19MechVentPats");
    }
    /**
     * numvent - MECHANICAL VENTILATORS: Total number of ventilators available.
     * @param integer value to set
     * @return this builder instance
     */
    @NotNull public Builder cvdNumVent(@NotNull Integer integer) {
      putValue("cvdNumVent", integer);
      return this;
    }
    /**
     * numvent - MECHANICAL VENTILATORS: Total number of ventilators available.
     * @param cvdNumVent value to set
     * @return this builder instance
     */
    @NotNull public Builder cvdNumVent(@NotNull Long cvdNumVent) {
      putValue("cvdNumVent", cvdNumVent);
      return this;
    }
    /**
     * numvent - MECHANICAL VENTILATORS: Total number of ventilators available.
     * @param cvdNumVent value to set
     * @return this builder instance
     */
    @NotNull public Builder cvdNumVent(@NotNull Float cvdNumVent) {
      putValue("cvdNumVent", cvdNumVent);
      return this;
    }
    /**
     * numvent - MECHANICAL VENTILATORS: Total number of ventilators available.
     * @param cvdNumVent value to set
     * @return this builder instance
     */
    @NotNull public Builder cvdNumVent(@NotNull Double cvdNumVent) {
      putValue("cvdNumVent", cvdNumVent);
      return this;
    }
    /**
     * numvent - MECHANICAL VENTILATORS: Total number of ventilators available.
     * @param cvdNumVent value to set
     * @return this builder instance
     */
    @NotNull public Builder cvdNumVent(@NotNull String cvdNumVent) {
      putValue("cvdNumVent", cvdNumVent);
      return this;
    }
    /**
     * Remove cvdNumVent property from the builder.
     * If this property is repeatable, all instances are removed.
     * @return this builder instance
     */
    @NotNull public Builder removeCvdNumVent() {
      removeValue("cvdNumVent");
      return this;
    }
    /**
     * Get currently set value for cvdNumVent property in this builder.
     * @return previously set value or {@code null}. If multiple values have been 
     * set to this property, then {@link java.util.Collection} instance will be 
     * returned.
     */
    @Nullable public java.lang.Object getCvdNumVent() {
      return myData.get("cvdNumVent");
    }
    /**
     * numc19overflowpats - ED/OVERFLOW: Patients with suspected or confirmed COVID-19 who are in the ED or any overflow location awaiting an inpatient bed.
     * @param integer value to set
     * @return this builder instance
     */
    @NotNull public Builder cvdNumC19OverflowPats(@NotNull Integer integer) {
      putValue("cvdNumC19OverflowPats", integer);
      return this;
    }
    /**
     * numc19overflowpats - ED/OVERFLOW: Patients with suspected or confirmed COVID-19 who are in the ED or any overflow location awaiting an inpatient bed.
     * @param cvdNumC19OverflowPats value to set
     * @return this builder instance
     */
    @NotNull public Builder cvdNumC19OverflowPats(@NotNull Long cvdNumC19OverflowPats) {
      putValue("cvdNumC19OverflowPats", cvdNumC19OverflowPats);
      return this;
    }
    /**
     * numc19overflowpats - ED/OVERFLOW: Patients with suspected or confirmed COVID-19 who are in the ED or any overflow location awaiting an inpatient bed.
     * @param cvdNumC19OverflowPats value to set
     * @return this builder instance
     */
    @NotNull public Builder cvdNumC19OverflowPats(@NotNull Float cvdNumC19OverflowPats) {
      putValue("cvdNumC19OverflowPats", cvdNumC19OverflowPats);
      return this;
    }
    /**
     * numc19overflowpats - ED/OVERFLOW: Patients with suspected or confirmed COVID-19 who are in the ED or any overflow location awaiting an inpatient bed.
     * @param cvdNumC19OverflowPats value to set
     * @return this builder instance
     */
    @NotNull public Builder cvdNumC19OverflowPats(@NotNull Double cvdNumC19OverflowPats) {
      putValue("cvdNumC19OverflowPats", cvdNumC19OverflowPats);
      return this;
    }
    /**
     * numc19overflowpats - ED/OVERFLOW: Patients with suspected or confirmed COVID-19 who are in the ED or any overflow location awaiting an inpatient bed.
     * @param cvdNumC19OverflowPats value to set
     * @return this builder instance
     */
    @NotNull public Builder cvdNumC19OverflowPats(@NotNull String cvdNumC19OverflowPats) {
      putValue("cvdNumC19OverflowPats", cvdNumC19OverflowPats);
      return this;
    }
    /**
     * Remove cvdNumC19OverflowPats property from the builder.
     * If this property is repeatable, all instances are removed.
     * @return this builder instance
     */
    @NotNull public Builder removeCvdNumC19OverflowPats() {
      removeValue("cvdNumC19OverflowPats");
      return this;
    }
    /**
     * Get currently set value for cvdNumC19OverflowPats property in this builder.
     * @return previously set value or {@code null}. If multiple values have been 
     * set to this property, then {@link java.util.Collection} instance will be 
     * returned.
     */
    @Nullable public java.lang.Object getCvdNumC19OverflowPats() {
      return myData.get("cvdNumC19OverflowPats");
    }
    /**
     * numc19died - DEATHS: Patients with suspected or confirmed COVID-19 who died in the hospital, ED, or any overflow location.
     * @param integer value to set
     * @return this builder instance
     */
    @NotNull public Builder cvdNumC19Died(@NotNull Integer integer) {
      putValue("cvdNumC19Died", integer);
      return this;
    }
    /**
     * numc19died - DEATHS: Patients with suspected or confirmed COVID-19 who died in the hospital, ED, or any overflow location.
     * @param cvdNumC19Died value to set
     * @return this builder instance
     */
    @NotNull public Builder cvdNumC19Died(@NotNull Long cvdNumC19Died) {
      putValue("cvdNumC19Died", cvdNumC19Died);
      return this;
    }
    /**
     * numc19died - DEATHS: Patients with suspected or confirmed COVID-19 who died in the hospital, ED, or any overflow location.
     * @param cvdNumC19Died value to set
     * @return this builder instance
     */
    @NotNull public Builder cvdNumC19Died(@NotNull Float cvdNumC19Died) {
      putValue("cvdNumC19Died", cvdNumC19Died);
      return this;
    }
    /**
     * numc19died - DEATHS: Patients with suspected or confirmed COVID-19 who died in the hospital, ED, or any overflow location.
     * @param cvdNumC19Died value to set
     * @return this builder instance
     */
    @NotNull public Builder cvdNumC19Died(@NotNull Double cvdNumC19Died) {
      putValue("cvdNumC19Died", cvdNumC19Died);
      return this;
    }
    /**
     * numc19died - DEATHS: Patients with suspected or confirmed COVID-19 who died in the hospital, ED, or any overflow location.
     * @param cvdNumC19Died value to set
     * @return this builder instance
     */
    @NotNull public Builder cvdNumC19Died(@NotNull String cvdNumC19Died) {
      putValue("cvdNumC19Died", cvdNumC19Died);
      return this;
    }
    /**
     * Remove cvdNumC19Died property from the builder.
     * If this property is repeatable, all instances are removed.
     * @return this builder instance
     */
    @NotNull public Builder removeCvdNumC19Died() {
      removeValue("cvdNumC19Died");
      return this;
    }
    /**
     * Get currently set value for cvdNumC19Died property in this builder.
     * @return previously set value or {@code null}. If multiple values have been 
     * set to this property, then {@link java.util.Collection} instance will be 
     * returned.
     */
    @Nullable public java.lang.Object getCvdNumC19Died() {
      return myData.get("cvdNumC19Died");
    }
    /**
     * numc19hopats - HOSPITAL ONSET: Patients hospitalized in an NHSN inpatient care location with onset of suspected or confirmed COVID-19 14 or more days after hospitalization.
     * @param integer value to set
     * @return this builder instance
     */
    @NotNull public Builder cvdNumC19HOPats(@NotNull Integer integer) {
      putValue("cvdNumC19HOPats", integer);
      return this;
    }
    /**
     * numc19hopats - HOSPITAL ONSET: Patients hospitalized in an NHSN inpatient care location with onset of suspected or confirmed COVID-19 14 or more days after hospitalization.
     * @param cvdNumC19HOPats value to set
     * @return this builder instance
     */
    @NotNull public Builder cvdNumC19HOPats(@NotNull Long cvdNumC19HOPats) {
      putValue("cvdNumC19HOPats", cvdNumC19HOPats);
      return this;
    }
    /**
     * numc19hopats - HOSPITAL ONSET: Patients hospitalized in an NHSN inpatient care location with onset of suspected or confirmed COVID-19 14 or more days after hospitalization.
     * @param cvdNumC19HOPats value to set
     * @return this builder instance
     */
    @NotNull public Builder cvdNumC19HOPats(@NotNull Float cvdNumC19HOPats) {
      putValue("cvdNumC19HOPats", cvdNumC19HOPats);
      return this;
    }
    /**
     * numc19hopats - HOSPITAL ONSET: Patients hospitalized in an NHSN inpatient care location with onset of suspected or confirmed COVID-19 14 or more days after hospitalization.
     * @param cvdNumC19HOPats value to set
     * @return this builder instance
     */
    @NotNull public Builder cvdNumC19HOPats(@NotNull Double cvdNumC19HOPats) {
      putValue("cvdNumC19HOPats", cvdNumC19HOPats);
      return this;
    }
    /**
     * numc19hopats - HOSPITAL ONSET: Patients hospitalized in an NHSN inpatient care location with onset of suspected or confirmed COVID-19 14 or more days after hospitalization.
     * @param cvdNumC19HOPats value to set
     * @return this builder instance
     */
    @NotNull public Builder cvdNumC19HOPats(@NotNull String cvdNumC19HOPats) {
      putValue("cvdNumC19HOPats", cvdNumC19HOPats);
      return this;
    }
    /**
     * Remove cvdNumC19HOPats property from the builder.
     * If this property is repeatable, all instances are removed.
     * @return this builder instance
     */
    @NotNull public Builder removeCvdNumC19HOPats() {
      removeValue("cvdNumC19HOPats");
      return this;
    }
    /**
     * Get currently set value for cvdNumC19HOPats property in this builder.
     * @return previously set value or {@code null}. If multiple values have been 
     * set to this property, then {@link java.util.Collection} instance will be 
     * returned.
     */
    @Nullable public java.lang.Object getCvdNumC19HOPats() {
      return myData.get("cvdNumC19HOPats");
    }
    /**
     * numventuse - MECHANICAL VENTILATORS IN USE: Total number of ventilators in use.
     * @param integer value to set
     * @return this builder instance
     */
    @NotNull public Builder cvdNumVentUse(@NotNull Integer integer) {
      putValue("cvdNumVentUse", integer);
      return this;
    }
    /**
     * numventuse - MECHANICAL VENTILATORS IN USE: Total number of ventilators in use.
     * @param cvdNumVentUse value to set
     * @return this builder instance
     */
    @NotNull public Builder cvdNumVentUse(@NotNull Long cvdNumVentUse) {
      putValue("cvdNumVentUse", cvdNumVentUse);
      return this;
    }
    /**
     * numventuse - MECHANICAL VENTILATORS IN USE: Total number of ventilators in use.
     * @param cvdNumVentUse value to set
     * @return this builder instance
     */
    @NotNull public Builder cvdNumVentUse(@NotNull Float cvdNumVentUse) {
      putValue("cvdNumVentUse", cvdNumVentUse);
      return this;
    }
    /**
     * numventuse - MECHANICAL VENTILATORS IN USE: Total number of ventilators in use.
     * @param cvdNumVentUse value to set
     * @return this builder instance
     */
    @NotNull public Builder cvdNumVentUse(@NotNull Double cvdNumVentUse) {
      putValue("cvdNumVentUse", cvdNumVentUse);
      return this;
    }
    /**
     * numventuse - MECHANICAL VENTILATORS IN USE: Total number of ventilators in use.
     * @param cvdNumVentUse value to set
     * @return this builder instance
     */
    @NotNull public Builder cvdNumVentUse(@NotNull String cvdNumVentUse) {
      putValue("cvdNumVentUse", cvdNumVentUse);
      return this;
    }
    /**
     * Remove cvdNumVentUse property from the builder.
     * If this property is repeatable, all instances are removed.
     * @return this builder instance
     */
    @NotNull public Builder removeCvdNumVentUse() {
      removeValue("cvdNumVentUse");
      return this;
    }
    /**
     * Get currently set value for cvdNumVentUse property in this builder.
     * @return previously set value or {@code null}. If multiple values have been 
     * set to this property, then {@link java.util.Collection} instance will be 
     * returned.
     */
    @Nullable public java.lang.Object getCvdNumVentUse() {
      return myData.get("cvdNumVentUse");
    }
    /**
     * numc19ofmechventpats - ED/OVERFLOW and VENTILATED: Patients with suspected or confirmed COVID-19 who are in the ED or any overflow location awaiting an inpatient bed and on a mechanical ventilator.
     * @param integer value to set
     * @return this builder instance
     */
    @NotNull public Builder cvdNumC19OFMechVentPats(@NotNull Integer integer) {
      putValue("cvdNumC19OFMechVentPats", integer);
      return this;
    }
    /**
     * numc19ofmechventpats - ED/OVERFLOW and VENTILATED: Patients with suspected or confirmed COVID-19 who are in the ED or any overflow location awaiting an inpatient bed and on a mechanical ventilator.
     * @param cvdNumC19OFMechVentPats value to set
     * @return this builder instance
     */
    @NotNull public Builder cvdNumC19OFMechVentPats(@NotNull Long cvdNumC19OFMechVentPats) {
      putValue("cvdNumC19OFMechVentPats", cvdNumC19OFMechVentPats);
      return this;
    }
    /**
     * numc19ofmechventpats - ED/OVERFLOW and VENTILATED: Patients with suspected or confirmed COVID-19 who are in the ED or any overflow location awaiting an inpatient bed and on a mechanical ventilator.
     * @param cvdNumC19OFMechVentPats value to set
     * @return this builder instance
     */
    @NotNull public Builder cvdNumC19OFMechVentPats(@NotNull Float cvdNumC19OFMechVentPats) {
      putValue("cvdNumC19OFMechVentPats", cvdNumC19OFMechVentPats);
      return this;
    }
    /**
     * numc19ofmechventpats - ED/OVERFLOW and VENTILATED: Patients with suspected or confirmed COVID-19 who are in the ED or any overflow location awaiting an inpatient bed and on a mechanical ventilator.
     * @param cvdNumC19OFMechVentPats value to set
     * @return this builder instance
     */
    @NotNull public Builder cvdNumC19OFMechVentPats(@NotNull Double cvdNumC19OFMechVentPats) {
      putValue("cvdNumC19OFMechVentPats", cvdNumC19OFMechVentPats);
      return this;
    }
    /**
     * numc19ofmechventpats - ED/OVERFLOW and VENTILATED: Patients with suspected or confirmed COVID-19 who are in the ED or any overflow location awaiting an inpatient bed and on a mechanical ventilator.
     * @param cvdNumC19OFMechVentPats value to set
     * @return this builder instance
     */
    @NotNull public Builder cvdNumC19OFMechVentPats(@NotNull String cvdNumC19OFMechVentPats) {
      putValue("cvdNumC19OFMechVentPats", cvdNumC19OFMechVentPats);
      return this;
    }
    /**
     * Remove cvdNumC19OFMechVentPats property from the builder.
     * If this property is repeatable, all instances are removed.
     * @return this builder instance
     */
    @NotNull public Builder removeCvdNumC19OFMechVentPats() {
      removeValue("cvdNumC19OFMechVentPats");
      return this;
    }
    /**
     * Get currently set value for cvdNumC19OFMechVentPats property in this builder.
     * @return previously set value or {@code null}. If multiple values have been 
     * set to this property, then {@link java.util.Collection} instance will be 
     * returned.
     */
    @Nullable public java.lang.Object getCvdNumC19OFMechVentPats() {
      return myData.get("cvdNumC19OFMechVentPats");
    }
    /**
     * Name of the County of the NHSN facility that this data record applies to. Use [[cvdFacilityId]] to identify the facility. To provide other details, [[healthcareReportingData]] can be used on a [[Hospital]] entry.
     * @param cvdFacilityCounty value to set
     * @return this builder instance
     */
    @NotNull public Builder cvdFacilityCounty(@NotNull String cvdFacilityCounty) {
      putValue("cvdFacilityCounty", cvdFacilityCounty);
      return this;
    }
    /**
     * Remove cvdFacilityCounty property from the builder.
     * If this property is repeatable, all instances are removed.
     * @return this builder instance
     */
    @NotNull public Builder removeCvdFacilityCounty() {
      removeValue("cvdFacilityCounty");
      return this;
    }
    /**
     * Get currently set value for cvdFacilityCounty property in this builder.
     * @return previously set value or {@code null}. If multiple values have been 
     * set to this property, then {@link java.util.Collection} instance will be 
     * returned.
     */
    @Nullable public java.lang.Object getCvdFacilityCounty() {
      return myData.get("cvdFacilityCounty");
    }
    /**
     * numbedsocc - HOSPITAL INPATIENT BED OCCUPANCY: Total number of staffed inpatient beds that are occupied.
     * @param integer value to set
     * @return this builder instance
     */
    @NotNull public Builder cvdNumBedsOcc(@NotNull Integer integer) {
      putValue("cvdNumBedsOcc", integer);
      return this;
    }
    /**
     * numbedsocc - HOSPITAL INPATIENT BED OCCUPANCY: Total number of staffed inpatient beds that are occupied.
     * @param cvdNumBedsOcc value to set
     * @return this builder instance
     */
    @NotNull public Builder cvdNumBedsOcc(@NotNull Long cvdNumBedsOcc) {
      putValue("cvdNumBedsOcc", cvdNumBedsOcc);
      return this;
    }
    /**
     * numbedsocc - HOSPITAL INPATIENT BED OCCUPANCY: Total number of staffed inpatient beds that are occupied.
     * @param cvdNumBedsOcc value to set
     * @return this builder instance
     */
    @NotNull public Builder cvdNumBedsOcc(@NotNull Float cvdNumBedsOcc) {
      putValue("cvdNumBedsOcc", cvdNumBedsOcc);
      return this;
    }
    /**
     * numbedsocc - HOSPITAL INPATIENT BED OCCUPANCY: Total number of staffed inpatient beds that are occupied.
     * @param cvdNumBedsOcc value to set
     * @return this builder instance
     */
    @NotNull public Builder cvdNumBedsOcc(@NotNull Double cvdNumBedsOcc) {
      putValue("cvdNumBedsOcc", cvdNumBedsOcc);
      return this;
    }
    /**
     * numbedsocc - HOSPITAL INPATIENT BED OCCUPANCY: Total number of staffed inpatient beds that are occupied.
     * @param cvdNumBedsOcc value to set
     * @return this builder instance
     */
    @NotNull public Builder cvdNumBedsOcc(@NotNull String cvdNumBedsOcc) {
      putValue("cvdNumBedsOcc", cvdNumBedsOcc);
      return this;
    }
    /**
     * Remove cvdNumBedsOcc property from the builder.
     * If this property is repeatable, all instances are removed.
     * @return this builder instance
     */
    @NotNull public Builder removeCvdNumBedsOcc() {
      removeValue("cvdNumBedsOcc");
      return this;
    }
    /**
     * Get currently set value for cvdNumBedsOcc property in this builder.
     * @return previously set value or {@code null}. If multiple values have been 
     * set to this property, then {@link java.util.Collection} instance will be 
     * returned.
     */
    @Nullable public java.lang.Object getCvdNumBedsOcc() {
      return myData.get("cvdNumBedsOcc");
    }
    /**
     * numtotbeds - ALL HOSPITAL BEDS: Total number of all Inpatient and outpatient beds, including all staffed,ICU, licensed, and overflow (surge) beds used for inpatients or outpatients.
     * @param integer value to set
     * @return this builder instance
     */
    @NotNull public Builder cvdNumTotBeds(@NotNull Integer integer) {
      putValue("cvdNumTotBeds", integer);
      return this;
    }
    /**
     * numtotbeds - ALL HOSPITAL BEDS: Total number of all Inpatient and outpatient beds, including all staffed,ICU, licensed, and overflow (surge) beds used for inpatients or outpatients.
     * @param cvdNumTotBeds value to set
     * @return this builder instance
     */
    @NotNull public Builder cvdNumTotBeds(@NotNull Long cvdNumTotBeds) {
      putValue("cvdNumTotBeds", cvdNumTotBeds);
      return this;
    }
    /**
     * numtotbeds - ALL HOSPITAL BEDS: Total number of all Inpatient and outpatient beds, including all staffed,ICU, licensed, and overflow (surge) beds used for inpatients or outpatients.
     * @param cvdNumTotBeds value to set
     * @return this builder instance
     */
    @NotNull public Builder cvdNumTotBeds(@NotNull Float cvdNumTotBeds) {
      putValue("cvdNumTotBeds", cvdNumTotBeds);
      return this;
    }
    /**
     * numtotbeds - ALL HOSPITAL BEDS: Total number of all Inpatient and outpatient beds, including all staffed,ICU, licensed, and overflow (surge) beds used for inpatients or outpatients.
     * @param cvdNumTotBeds value to set
     * @return this builder instance
     */
    @NotNull public Builder cvdNumTotBeds(@NotNull Double cvdNumTotBeds) {
      putValue("cvdNumTotBeds", cvdNumTotBeds);
      return this;
    }
    /**
     * numtotbeds - ALL HOSPITAL BEDS: Total number of all Inpatient and outpatient beds, including all staffed,ICU, licensed, and overflow (surge) beds used for inpatients or outpatients.
     * @param cvdNumTotBeds value to set
     * @return this builder instance
     */
    @NotNull public Builder cvdNumTotBeds(@NotNull String cvdNumTotBeds) {
      putValue("cvdNumTotBeds", cvdNumTotBeds);
      return this;
    }
    /**
     * Remove cvdNumTotBeds property from the builder.
     * If this property is repeatable, all instances are removed.
     * @return this builder instance
     */
    @NotNull public Builder removeCvdNumTotBeds() {
      removeValue("cvdNumTotBeds");
      return this;
    }
    /**
     * Get currently set value for cvdNumTotBeds property in this builder.
     * @return previously set value or {@code null}. If multiple values have been 
     * set to this property, then {@link java.util.Collection} instance will be 
     * returned.
     */
    @Nullable public java.lang.Object getCvdNumTotBeds() {
      return myData.get("cvdNumTotBeds");
    }
    /**
     * numc19hosppats - HOSPITALIZED: Patients currently hospitalized in an inpatient care location who have suspected or confirmed COVID-19.
     * @param integer value to set
     * @return this builder instance
     */
    @NotNull public Builder cvdNumC19HospPats(@NotNull Integer integer) {
      putValue("cvdNumC19HospPats", integer);
      return this;
    }
    /**
     * numc19hosppats - HOSPITALIZED: Patients currently hospitalized in an inpatient care location who have suspected or confirmed COVID-19.
     * @param cvdNumC19HospPats value to set
     * @return this builder instance
     */
    @NotNull public Builder cvdNumC19HospPats(@NotNull Long cvdNumC19HospPats) {
      putValue("cvdNumC19HospPats", cvdNumC19HospPats);
      return this;
    }
    /**
     * numc19hosppats - HOSPITALIZED: Patients currently hospitalized in an inpatient care location who have suspected or confirmed COVID-19.
     * @param cvdNumC19HospPats value to set
     * @return this builder instance
     */
    @NotNull public Builder cvdNumC19HospPats(@NotNull Float cvdNumC19HospPats) {
      putValue("cvdNumC19HospPats", cvdNumC19HospPats);
      return this;
    }
    /**
     * numc19hosppats - HOSPITALIZED: Patients currently hospitalized in an inpatient care location who have suspected or confirmed COVID-19.
     * @param cvdNumC19HospPats value to set
     * @return this builder instance
     */
    @NotNull public Builder cvdNumC19HospPats(@NotNull Double cvdNumC19HospPats) {
      putValue("cvdNumC19HospPats", cvdNumC19HospPats);
      return this;
    }
    /**
     * numc19hosppats - HOSPITALIZED: Patients currently hospitalized in an inpatient care location who have suspected or confirmed COVID-19.
     * @param cvdNumC19HospPats value to set
     * @return this builder instance
     */
    @NotNull public Builder cvdNumC19HospPats(@NotNull String cvdNumC19HospPats) {
      putValue("cvdNumC19HospPats", cvdNumC19HospPats);
      return this;
    }
    /**
     * Remove cvdNumC19HospPats property from the builder.
     * If this property is repeatable, all instances are removed.
     * @return this builder instance
     */
    @NotNull public Builder removeCvdNumC19HospPats() {
      removeValue("cvdNumC19HospPats");
      return this;
    }
    /**
     * Get currently set value for cvdNumC19HospPats property in this builder.
     * @return previously set value or {@code null}. If multiple values have been 
     * set to this property, then {@link java.util.Collection} instance will be 
     * returned.
     */
    @Nullable public java.lang.Object getCvdNumC19HospPats() {
      return myData.get("cvdNumC19HospPats");
    }
    /**
     * Identifier of the NHSN facility that this data record applies to. Use [[cvdFacilityCounty]] to indicate the county. To provide other details, [[healthcareReportingData]] can be used on a [[Hospital]] entry.
     * @param cvdFacilityId value to set
     * @return this builder instance
     */
    @NotNull public Builder cvdFacilityId(@NotNull String cvdFacilityId) {
      putValue("cvdFacilityId", cvdFacilityId);
      return this;
    }
    /**
     * Remove cvdFacilityId property from the builder.
     * If this property is repeatable, all instances are removed.
     * @return this builder instance
     */
    @NotNull public Builder removeCvdFacilityId() {
      removeValue("cvdFacilityId");
      return this;
    }
    /**
     * Get currently set value for cvdFacilityId property in this builder.
     * @return previously set value or {@code null}. If multiple values have been 
     * set to this property, then {@link java.util.Collection} instance will be 
     * returned.
     */
    @Nullable public java.lang.Object getCvdFacilityId() {
      return myData.get("cvdFacilityId");
    }
    /**
     * numicubedsocc - ICU BED OCCUPANCY: Total number of staffed inpatient ICU beds that are occupied.
     * @param integer value to set
     * @return this builder instance
     */
    @NotNull public Builder cvdNumICUBedsOcc(@NotNull Integer integer) {
      putValue("cvdNumICUBedsOcc", integer);
      return this;
    }
    /**
     * numicubedsocc - ICU BED OCCUPANCY: Total number of staffed inpatient ICU beds that are occupied.
     * @param cvdNumICUBedsOcc value to set
     * @return this builder instance
     */
    @NotNull public Builder cvdNumICUBedsOcc(@NotNull Long cvdNumICUBedsOcc) {
      putValue("cvdNumICUBedsOcc", cvdNumICUBedsOcc);
      return this;
    }
    /**
     * numicubedsocc - ICU BED OCCUPANCY: Total number of staffed inpatient ICU beds that are occupied.
     * @param cvdNumICUBedsOcc value to set
     * @return this builder instance
     */
    @NotNull public Builder cvdNumICUBedsOcc(@NotNull Float cvdNumICUBedsOcc) {
      putValue("cvdNumICUBedsOcc", cvdNumICUBedsOcc);
      return this;
    }
    /**
     * numicubedsocc - ICU BED OCCUPANCY: Total number of staffed inpatient ICU beds that are occupied.
     * @param cvdNumICUBedsOcc value to set
     * @return this builder instance
     */
    @NotNull public Builder cvdNumICUBedsOcc(@NotNull Double cvdNumICUBedsOcc) {
      putValue("cvdNumICUBedsOcc", cvdNumICUBedsOcc);
      return this;
    }
    /**
     * numicubedsocc - ICU BED OCCUPANCY: Total number of staffed inpatient ICU beds that are occupied.
     * @param cvdNumICUBedsOcc value to set
     * @return this builder instance
     */
    @NotNull public Builder cvdNumICUBedsOcc(@NotNull String cvdNumICUBedsOcc) {
      putValue("cvdNumICUBedsOcc", cvdNumICUBedsOcc);
      return this;
    }
    /**
     * Remove cvdNumICUBedsOcc property from the builder.
     * If this property is repeatable, all instances are removed.
     * @return this builder instance
     */
    @NotNull public Builder removeCvdNumICUBedsOcc() {
      removeValue("cvdNumICUBedsOcc");
      return this;
    }
    /**
     * Get currently set value for cvdNumICUBedsOcc property in this builder.
     * @return previously set value or {@code null}. If multiple values have been 
     * set to this property, then {@link java.util.Collection} instance will be 
     * returned.
     */
    @Nullable public java.lang.Object getCvdNumICUBedsOcc() {
      return myData.get("cvdNumICUBedsOcc");
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
      if ("cvdNumICUBeds".equals(key) && value instanceof Integer) { this.cvdNumICUBeds((Integer)value); return; }
      if ("cvdNumICUBedss".equals(key) && value instanceof Integer) { this.cvdNumICUBeds((Integer)value); return; }
      if ("cvdNumICUBeds".equals(key) && value instanceof Long) { this.cvdNumICUBeds((Long)value); return; }
      if ("cvdNumICUBedss".equals(key) && value instanceof Long) { this.cvdNumICUBeds((Long)value); return; }
      if ("cvdNumICUBeds".equals(key) && value instanceof Float) { this.cvdNumICUBeds((Float)value); return; }
      if ("cvdNumICUBedss".equals(key) && value instanceof Float) { this.cvdNumICUBeds((Float)value); return; }
      if ("cvdNumICUBeds".equals(key) && value instanceof Double) { this.cvdNumICUBeds((Double)value); return; }
      if ("cvdNumICUBedss".equals(key) && value instanceof Double) { this.cvdNumICUBeds((Double)value); return; }
      if ("cvdNumICUBeds".equals(key) && value instanceof String) { this.cvdNumICUBeds((String)value); return; }
      if ("cvdNumICUBedss".equals(key) && value instanceof String) { this.cvdNumICUBeds((String)value); return; }
      if ("cvdCollectionDate".equals(key) && value instanceof String) { this.cvdCollectionDate((String)value); return; }
      if ("cvdCollectionDates".equals(key) && value instanceof String) { this.cvdCollectionDate((String)value); return; }
      if ("cvdCollectionDate".equals(key) && value instanceof java.util.Date) { this.cvdCollectionDate((java.util.Date)value); return; }
      if ("cvdCollectionDates".equals(key) && value instanceof java.util.Date) { this.cvdCollectionDate((java.util.Date)value); return; }
      if ("datePosted".equals(key) && value instanceof java.util.Date) { this.datePosted((java.util.Date)value); return; }
      if ("datePosteds".equals(key) && value instanceof java.util.Date) { this.datePosted((java.util.Date)value); return; }
      if ("cvdNumBeds".equals(key) && value instanceof Integer) { this.cvdNumBeds((Integer)value); return; }
      if ("cvdNumBedss".equals(key) && value instanceof Integer) { this.cvdNumBeds((Integer)value); return; }
      if ("cvdNumBeds".equals(key) && value instanceof Long) { this.cvdNumBeds((Long)value); return; }
      if ("cvdNumBedss".equals(key) && value instanceof Long) { this.cvdNumBeds((Long)value); return; }
      if ("cvdNumBeds".equals(key) && value instanceof Float) { this.cvdNumBeds((Float)value); return; }
      if ("cvdNumBedss".equals(key) && value instanceof Float) { this.cvdNumBeds((Float)value); return; }
      if ("cvdNumBeds".equals(key) && value instanceof Double) { this.cvdNumBeds((Double)value); return; }
      if ("cvdNumBedss".equals(key) && value instanceof Double) { this.cvdNumBeds((Double)value); return; }
      if ("cvdNumBeds".equals(key) && value instanceof String) { this.cvdNumBeds((String)value); return; }
      if ("cvdNumBedss".equals(key) && value instanceof String) { this.cvdNumBeds((String)value); return; }
      if ("cvdNumC19MechVentPats".equals(key) && value instanceof Integer) { this.cvdNumC19MechVentPats((Integer)value); return; }
      if ("cvdNumC19MechVentPatss".equals(key) && value instanceof Integer) { this.cvdNumC19MechVentPats((Integer)value); return; }
      if ("cvdNumC19MechVentPats".equals(key) && value instanceof Long) { this.cvdNumC19MechVentPats((Long)value); return; }
      if ("cvdNumC19MechVentPatss".equals(key) && value instanceof Long) { this.cvdNumC19MechVentPats((Long)value); return; }
      if ("cvdNumC19MechVentPats".equals(key) && value instanceof Float) { this.cvdNumC19MechVentPats((Float)value); return; }
      if ("cvdNumC19MechVentPatss".equals(key) && value instanceof Float) { this.cvdNumC19MechVentPats((Float)value); return; }
      if ("cvdNumC19MechVentPats".equals(key) && value instanceof Double) { this.cvdNumC19MechVentPats((Double)value); return; }
      if ("cvdNumC19MechVentPatss".equals(key) && value instanceof Double) { this.cvdNumC19MechVentPats((Double)value); return; }
      if ("cvdNumC19MechVentPats".equals(key) && value instanceof String) { this.cvdNumC19MechVentPats((String)value); return; }
      if ("cvdNumC19MechVentPatss".equals(key) && value instanceof String) { this.cvdNumC19MechVentPats((String)value); return; }
      if ("cvdNumVent".equals(key) && value instanceof Integer) { this.cvdNumVent((Integer)value); return; }
      if ("cvdNumVents".equals(key) && value instanceof Integer) { this.cvdNumVent((Integer)value); return; }
      if ("cvdNumVent".equals(key) && value instanceof Long) { this.cvdNumVent((Long)value); return; }
      if ("cvdNumVents".equals(key) && value instanceof Long) { this.cvdNumVent((Long)value); return; }
      if ("cvdNumVent".equals(key) && value instanceof Float) { this.cvdNumVent((Float)value); return; }
      if ("cvdNumVents".equals(key) && value instanceof Float) { this.cvdNumVent((Float)value); return; }
      if ("cvdNumVent".equals(key) && value instanceof Double) { this.cvdNumVent((Double)value); return; }
      if ("cvdNumVents".equals(key) && value instanceof Double) { this.cvdNumVent((Double)value); return; }
      if ("cvdNumVent".equals(key) && value instanceof String) { this.cvdNumVent((String)value); return; }
      if ("cvdNumVents".equals(key) && value instanceof String) { this.cvdNumVent((String)value); return; }
      if ("cvdNumC19OverflowPats".equals(key) && value instanceof Integer) { this.cvdNumC19OverflowPats((Integer)value); return; }
      if ("cvdNumC19OverflowPatss".equals(key) && value instanceof Integer) { this.cvdNumC19OverflowPats((Integer)value); return; }
      if ("cvdNumC19OverflowPats".equals(key) && value instanceof Long) { this.cvdNumC19OverflowPats((Long)value); return; }
      if ("cvdNumC19OverflowPatss".equals(key) && value instanceof Long) { this.cvdNumC19OverflowPats((Long)value); return; }
      if ("cvdNumC19OverflowPats".equals(key) && value instanceof Float) { this.cvdNumC19OverflowPats((Float)value); return; }
      if ("cvdNumC19OverflowPatss".equals(key) && value instanceof Float) { this.cvdNumC19OverflowPats((Float)value); return; }
      if ("cvdNumC19OverflowPats".equals(key) && value instanceof Double) { this.cvdNumC19OverflowPats((Double)value); return; }
      if ("cvdNumC19OverflowPatss".equals(key) && value instanceof Double) { this.cvdNumC19OverflowPats((Double)value); return; }
      if ("cvdNumC19OverflowPats".equals(key) && value instanceof String) { this.cvdNumC19OverflowPats((String)value); return; }
      if ("cvdNumC19OverflowPatss".equals(key) && value instanceof String) { this.cvdNumC19OverflowPats((String)value); return; }
      if ("cvdNumC19Died".equals(key) && value instanceof Integer) { this.cvdNumC19Died((Integer)value); return; }
      if ("cvdNumC19Dieds".equals(key) && value instanceof Integer) { this.cvdNumC19Died((Integer)value); return; }
      if ("cvdNumC19Died".equals(key) && value instanceof Long) { this.cvdNumC19Died((Long)value); return; }
      if ("cvdNumC19Dieds".equals(key) && value instanceof Long) { this.cvdNumC19Died((Long)value); return; }
      if ("cvdNumC19Died".equals(key) && value instanceof Float) { this.cvdNumC19Died((Float)value); return; }
      if ("cvdNumC19Dieds".equals(key) && value instanceof Float) { this.cvdNumC19Died((Float)value); return; }
      if ("cvdNumC19Died".equals(key) && value instanceof Double) { this.cvdNumC19Died((Double)value); return; }
      if ("cvdNumC19Dieds".equals(key) && value instanceof Double) { this.cvdNumC19Died((Double)value); return; }
      if ("cvdNumC19Died".equals(key) && value instanceof String) { this.cvdNumC19Died((String)value); return; }
      if ("cvdNumC19Dieds".equals(key) && value instanceof String) { this.cvdNumC19Died((String)value); return; }
      if ("cvdNumC19HOPats".equals(key) && value instanceof Integer) { this.cvdNumC19HOPats((Integer)value); return; }
      if ("cvdNumC19HOPatss".equals(key) && value instanceof Integer) { this.cvdNumC19HOPats((Integer)value); return; }
      if ("cvdNumC19HOPats".equals(key) && value instanceof Long) { this.cvdNumC19HOPats((Long)value); return; }
      if ("cvdNumC19HOPatss".equals(key) && value instanceof Long) { this.cvdNumC19HOPats((Long)value); return; }
      if ("cvdNumC19HOPats".equals(key) && value instanceof Float) { this.cvdNumC19HOPats((Float)value); return; }
      if ("cvdNumC19HOPatss".equals(key) && value instanceof Float) { this.cvdNumC19HOPats((Float)value); return; }
      if ("cvdNumC19HOPats".equals(key) && value instanceof Double) { this.cvdNumC19HOPats((Double)value); return; }
      if ("cvdNumC19HOPatss".equals(key) && value instanceof Double) { this.cvdNumC19HOPats((Double)value); return; }
      if ("cvdNumC19HOPats".equals(key) && value instanceof String) { this.cvdNumC19HOPats((String)value); return; }
      if ("cvdNumC19HOPatss".equals(key) && value instanceof String) { this.cvdNumC19HOPats((String)value); return; }
      if ("cvdNumVentUse".equals(key) && value instanceof Integer) { this.cvdNumVentUse((Integer)value); return; }
      if ("cvdNumVentUses".equals(key) && value instanceof Integer) { this.cvdNumVentUse((Integer)value); return; }
      if ("cvdNumVentUse".equals(key) && value instanceof Long) { this.cvdNumVentUse((Long)value); return; }
      if ("cvdNumVentUses".equals(key) && value instanceof Long) { this.cvdNumVentUse((Long)value); return; }
      if ("cvdNumVentUse".equals(key) && value instanceof Float) { this.cvdNumVentUse((Float)value); return; }
      if ("cvdNumVentUses".equals(key) && value instanceof Float) { this.cvdNumVentUse((Float)value); return; }
      if ("cvdNumVentUse".equals(key) && value instanceof Double) { this.cvdNumVentUse((Double)value); return; }
      if ("cvdNumVentUses".equals(key) && value instanceof Double) { this.cvdNumVentUse((Double)value); return; }
      if ("cvdNumVentUse".equals(key) && value instanceof String) { this.cvdNumVentUse((String)value); return; }
      if ("cvdNumVentUses".equals(key) && value instanceof String) { this.cvdNumVentUse((String)value); return; }
      if ("cvdNumC19OFMechVentPats".equals(key) && value instanceof Integer) { this.cvdNumC19OFMechVentPats((Integer)value); return; }
      if ("cvdNumC19OFMechVentPatss".equals(key) && value instanceof Integer) { this.cvdNumC19OFMechVentPats((Integer)value); return; }
      if ("cvdNumC19OFMechVentPats".equals(key) && value instanceof Long) { this.cvdNumC19OFMechVentPats((Long)value); return; }
      if ("cvdNumC19OFMechVentPatss".equals(key) && value instanceof Long) { this.cvdNumC19OFMechVentPats((Long)value); return; }
      if ("cvdNumC19OFMechVentPats".equals(key) && value instanceof Float) { this.cvdNumC19OFMechVentPats((Float)value); return; }
      if ("cvdNumC19OFMechVentPatss".equals(key) && value instanceof Float) { this.cvdNumC19OFMechVentPats((Float)value); return; }
      if ("cvdNumC19OFMechVentPats".equals(key) && value instanceof Double) { this.cvdNumC19OFMechVentPats((Double)value); return; }
      if ("cvdNumC19OFMechVentPatss".equals(key) && value instanceof Double) { this.cvdNumC19OFMechVentPats((Double)value); return; }
      if ("cvdNumC19OFMechVentPats".equals(key) && value instanceof String) { this.cvdNumC19OFMechVentPats((String)value); return; }
      if ("cvdNumC19OFMechVentPatss".equals(key) && value instanceof String) { this.cvdNumC19OFMechVentPats((String)value); return; }
      if ("cvdFacilityCounty".equals(key) && value instanceof String) { this.cvdFacilityCounty((String)value); return; }
      if ("cvdFacilityCountys".equals(key) && value instanceof String) { this.cvdFacilityCounty((String)value); return; }
      if ("cvdNumBedsOcc".equals(key) && value instanceof Integer) { this.cvdNumBedsOcc((Integer)value); return; }
      if ("cvdNumBedsOccs".equals(key) && value instanceof Integer) { this.cvdNumBedsOcc((Integer)value); return; }
      if ("cvdNumBedsOcc".equals(key) && value instanceof Long) { this.cvdNumBedsOcc((Long)value); return; }
      if ("cvdNumBedsOccs".equals(key) && value instanceof Long) { this.cvdNumBedsOcc((Long)value); return; }
      if ("cvdNumBedsOcc".equals(key) && value instanceof Float) { this.cvdNumBedsOcc((Float)value); return; }
      if ("cvdNumBedsOccs".equals(key) && value instanceof Float) { this.cvdNumBedsOcc((Float)value); return; }
      if ("cvdNumBedsOcc".equals(key) && value instanceof Double) { this.cvdNumBedsOcc((Double)value); return; }
      if ("cvdNumBedsOccs".equals(key) && value instanceof Double) { this.cvdNumBedsOcc((Double)value); return; }
      if ("cvdNumBedsOcc".equals(key) && value instanceof String) { this.cvdNumBedsOcc((String)value); return; }
      if ("cvdNumBedsOccs".equals(key) && value instanceof String) { this.cvdNumBedsOcc((String)value); return; }
      if ("cvdNumTotBeds".equals(key) && value instanceof Integer) { this.cvdNumTotBeds((Integer)value); return; }
      if ("cvdNumTotBedss".equals(key) && value instanceof Integer) { this.cvdNumTotBeds((Integer)value); return; }
      if ("cvdNumTotBeds".equals(key) && value instanceof Long) { this.cvdNumTotBeds((Long)value); return; }
      if ("cvdNumTotBedss".equals(key) && value instanceof Long) { this.cvdNumTotBeds((Long)value); return; }
      if ("cvdNumTotBeds".equals(key) && value instanceof Float) { this.cvdNumTotBeds((Float)value); return; }
      if ("cvdNumTotBedss".equals(key) && value instanceof Float) { this.cvdNumTotBeds((Float)value); return; }
      if ("cvdNumTotBeds".equals(key) && value instanceof Double) { this.cvdNumTotBeds((Double)value); return; }
      if ("cvdNumTotBedss".equals(key) && value instanceof Double) { this.cvdNumTotBeds((Double)value); return; }
      if ("cvdNumTotBeds".equals(key) && value instanceof String) { this.cvdNumTotBeds((String)value); return; }
      if ("cvdNumTotBedss".equals(key) && value instanceof String) { this.cvdNumTotBeds((String)value); return; }
      if ("cvdNumC19HospPats".equals(key) && value instanceof Integer) { this.cvdNumC19HospPats((Integer)value); return; }
      if ("cvdNumC19HospPatss".equals(key) && value instanceof Integer) { this.cvdNumC19HospPats((Integer)value); return; }
      if ("cvdNumC19HospPats".equals(key) && value instanceof Long) { this.cvdNumC19HospPats((Long)value); return; }
      if ("cvdNumC19HospPatss".equals(key) && value instanceof Long) { this.cvdNumC19HospPats((Long)value); return; }
      if ("cvdNumC19HospPats".equals(key) && value instanceof Float) { this.cvdNumC19HospPats((Float)value); return; }
      if ("cvdNumC19HospPatss".equals(key) && value instanceof Float) { this.cvdNumC19HospPats((Float)value); return; }
      if ("cvdNumC19HospPats".equals(key) && value instanceof Double) { this.cvdNumC19HospPats((Double)value); return; }
      if ("cvdNumC19HospPatss".equals(key) && value instanceof Double) { this.cvdNumC19HospPats((Double)value); return; }
      if ("cvdNumC19HospPats".equals(key) && value instanceof String) { this.cvdNumC19HospPats((String)value); return; }
      if ("cvdNumC19HospPatss".equals(key) && value instanceof String) { this.cvdNumC19HospPats((String)value); return; }
      if ("cvdFacilityId".equals(key) && value instanceof String) { this.cvdFacilityId((String)value); return; }
      if ("cvdFacilityIds".equals(key) && value instanceof String) { this.cvdFacilityId((String)value); return; }
      if ("cvdNumICUBedsOcc".equals(key) && value instanceof Integer) { this.cvdNumICUBedsOcc((Integer)value); return; }
      if ("cvdNumICUBedsOccs".equals(key) && value instanceof Integer) { this.cvdNumICUBedsOcc((Integer)value); return; }
      if ("cvdNumICUBedsOcc".equals(key) && value instanceof Long) { this.cvdNumICUBedsOcc((Long)value); return; }
      if ("cvdNumICUBedsOccs".equals(key) && value instanceof Long) { this.cvdNumICUBedsOcc((Long)value); return; }
      if ("cvdNumICUBedsOcc".equals(key) && value instanceof Float) { this.cvdNumICUBedsOcc((Float)value); return; }
      if ("cvdNumICUBedsOccs".equals(key) && value instanceof Float) { this.cvdNumICUBedsOcc((Float)value); return; }
      if ("cvdNumICUBedsOcc".equals(key) && value instanceof Double) { this.cvdNumICUBedsOcc((Double)value); return; }
      if ("cvdNumICUBedsOccs".equals(key) && value instanceof Double) { this.cvdNumICUBedsOcc((Double)value); return; }
      if ("cvdNumICUBedsOcc".equals(key) && value instanceof String) { this.cvdNumICUBedsOcc((String)value); return; }
      if ("cvdNumICUBedsOccs".equals(key) && value instanceof String) { this.cvdNumICUBedsOcc((String)value); return; }
      super.fromMap(key, value);
    }
  }
  
}
