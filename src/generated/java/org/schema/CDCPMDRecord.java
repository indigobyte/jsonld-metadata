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
 * A CDCPMDRecord is a data structure representing a record in a CDC tabular data format
 *       used for hospital data reporting. See [documentation](/docs/cdc-covid.html) for details, and the linked CDC materials for authoritative
 *       definitions used as the source here.
 *       
 */
public class CDCPMDRecord extends StructuredValue {
  /**
   * numicubeds - ICU BEDS: Total number of staffed inpatient intensive care unit (ICU) beds.
   */
  @JsonIgnore public Integer getCvdNumICUBedsInteger() {
    return (Integer) getValue("cvdNumICUBeds");
  }
  /**
   * numicubeds - ICU BEDS: Total number of staffed inpatient intensive care unit (ICU) beds.
   */
  @JsonIgnore public Collection<Integer> getCvdNumICUBedsIntegers() {
    final Object current = myData.get("cvdNumICUBeds");
    if (current == null) return Collections.emptyList();
    if (current instanceof Collection) {
      return (Collection<Integer>) current;
    }
    return Arrays.asList((Integer) current);
  }
  /**
   * numicubeds - ICU BEDS: Total number of staffed inpatient intensive care unit (ICU) beds.
   */
  @JsonIgnore public Long getCvdNumICUBedsLong() {
    return (Long) getValue("cvdNumICUBeds");
  }
  /**
   * numicubeds - ICU BEDS: Total number of staffed inpatient intensive care unit (ICU) beds.
   */
  @JsonIgnore public Collection<Long> getCvdNumICUBedsLongs() {
    final Object current = myData.get("cvdNumICUBeds");
    if (current == null) return Collections.emptyList();
    if (current instanceof Collection) {
      return (Collection<Long>) current;
    }
    return Arrays.asList((Long) current);
  }
  /**
   * numicubeds - ICU BEDS: Total number of staffed inpatient intensive care unit (ICU) beds.
   */
  @JsonIgnore public Float getCvdNumICUBedsFloat() {
    return (Float) getValue("cvdNumICUBeds");
  }
  /**
   * numicubeds - ICU BEDS: Total number of staffed inpatient intensive care unit (ICU) beds.
   */
  @JsonIgnore public Collection<Float> getCvdNumICUBedsFloats() {
    final Object current = myData.get("cvdNumICUBeds");
    if (current == null) return Collections.emptyList();
    if (current instanceof Collection) {
      return (Collection<Float>) current;
    }
    return Arrays.asList((Float) current);
  }
  /**
   * numicubeds - ICU BEDS: Total number of staffed inpatient intensive care unit (ICU) beds.
   */
  @JsonIgnore public Double getCvdNumICUBedsDouble() {
    return (Double) getValue("cvdNumICUBeds");
  }
  /**
   * numicubeds - ICU BEDS: Total number of staffed inpatient intensive care unit (ICU) beds.
   */
  @JsonIgnore public Collection<Double> getCvdNumICUBedsDoubles() {
    final Object current = myData.get("cvdNumICUBeds");
    if (current == null) return Collections.emptyList();
    if (current instanceof Collection) {
      return (Collection<Double>) current;
    }
    return Arrays.asList((Double) current);
  }
  /**
   * numicubeds - ICU BEDS: Total number of staffed inpatient intensive care unit (ICU) beds.
   */
  @JsonIgnore public String getCvdNumICUBedsString() {
    return (String) getValue("cvdNumICUBeds");
  }
  /**
   * numicubeds - ICU BEDS: Total number of staffed inpatient intensive care unit (ICU) beds.
   */
  @JsonIgnore public Collection<String> getCvdNumICUBedsStrings() {
    final Object current = myData.get("cvdNumICUBeds");
    if (current == null) return Collections.emptyList();
    if (current instanceof Collection) {
      return (Collection<String>) current;
    }
    return Arrays.asList((String) current);
  }
  /**
   * collectiondate - Date for which patient counts are reported.
   */
  @JsonIgnore public String getCvdCollectionDateString() {
    return (String) getValue("cvdCollectionDate");
  }
  /**
   * collectiondate - Date for which patient counts are reported.
   */
  @JsonIgnore public Collection<String> getCvdCollectionDateStrings() {
    final Object current = myData.get("cvdCollectionDate");
    if (current == null) return Collections.emptyList();
    if (current instanceof Collection) {
      return (Collection<String>) current;
    }
    return Arrays.asList((String) current);
  }
  /**
   * collectiondate - Date for which patient counts are reported.
   */
  @JsonIgnore public java.util.Date getCvdCollectionDateDate() {
    return (java.util.Date) getValue("cvdCollectionDate");
  }
  /**
   * collectiondate - Date for which patient counts are reported.
   */
  @JsonIgnore public Collection<java.util.Date> getCvdCollectionDateDates() {
    final Object current = myData.get("cvdCollectionDate");
    if (current == null) return Collections.emptyList();
    if (current instanceof Collection) {
      return (Collection<java.util.Date>) current;
    }
    return Arrays.asList((java.util.Date) current);
  }
  /**
   * Publication date of an online listing.
   */
  @JsonIgnore public java.util.Date getDatePosted() {
    return (java.util.Date) getValue("datePosted");
  }
  /**
   * Publication date of an online listing.
   */
  @JsonIgnore public Collection<java.util.Date> getDatePosteds() {
    final Object current = myData.get("datePosted");
    if (current == null) return Collections.emptyList();
    if (current instanceof Collection) {
      return (Collection<java.util.Date>) current;
    }
    return Arrays.asList((java.util.Date) current);
  }
  /**
   * numbeds - HOSPITAL INPATIENT BEDS: Inpatient beds, including all staffed, licensed, and overflow (surge) beds used for inpatients.
   */
  @JsonIgnore public Integer getCvdNumBedsInteger() {
    return (Integer) getValue("cvdNumBeds");
  }
  /**
   * numbeds - HOSPITAL INPATIENT BEDS: Inpatient beds, including all staffed, licensed, and overflow (surge) beds used for inpatients.
   */
  @JsonIgnore public Collection<Integer> getCvdNumBedsIntegers() {
    final Object current = myData.get("cvdNumBeds");
    if (current == null) return Collections.emptyList();
    if (current instanceof Collection) {
      return (Collection<Integer>) current;
    }
    return Arrays.asList((Integer) current);
  }
  /**
   * numbeds - HOSPITAL INPATIENT BEDS: Inpatient beds, including all staffed, licensed, and overflow (surge) beds used for inpatients.
   */
  @JsonIgnore public Long getCvdNumBedsLong() {
    return (Long) getValue("cvdNumBeds");
  }
  /**
   * numbeds - HOSPITAL INPATIENT BEDS: Inpatient beds, including all staffed, licensed, and overflow (surge) beds used for inpatients.
   */
  @JsonIgnore public Collection<Long> getCvdNumBedsLongs() {
    final Object current = myData.get("cvdNumBeds");
    if (current == null) return Collections.emptyList();
    if (current instanceof Collection) {
      return (Collection<Long>) current;
    }
    return Arrays.asList((Long) current);
  }
  /**
   * numbeds - HOSPITAL INPATIENT BEDS: Inpatient beds, including all staffed, licensed, and overflow (surge) beds used for inpatients.
   */
  @JsonIgnore public Float getCvdNumBedsFloat() {
    return (Float) getValue("cvdNumBeds");
  }
  /**
   * numbeds - HOSPITAL INPATIENT BEDS: Inpatient beds, including all staffed, licensed, and overflow (surge) beds used for inpatients.
   */
  @JsonIgnore public Collection<Float> getCvdNumBedsFloats() {
    final Object current = myData.get("cvdNumBeds");
    if (current == null) return Collections.emptyList();
    if (current instanceof Collection) {
      return (Collection<Float>) current;
    }
    return Arrays.asList((Float) current);
  }
  /**
   * numbeds - HOSPITAL INPATIENT BEDS: Inpatient beds, including all staffed, licensed, and overflow (surge) beds used for inpatients.
   */
  @JsonIgnore public Double getCvdNumBedsDouble() {
    return (Double) getValue("cvdNumBeds");
  }
  /**
   * numbeds - HOSPITAL INPATIENT BEDS: Inpatient beds, including all staffed, licensed, and overflow (surge) beds used for inpatients.
   */
  @JsonIgnore public Collection<Double> getCvdNumBedsDoubles() {
    final Object current = myData.get("cvdNumBeds");
    if (current == null) return Collections.emptyList();
    if (current instanceof Collection) {
      return (Collection<Double>) current;
    }
    return Arrays.asList((Double) current);
  }
  /**
   * numbeds - HOSPITAL INPATIENT BEDS: Inpatient beds, including all staffed, licensed, and overflow (surge) beds used for inpatients.
   */
  @JsonIgnore public String getCvdNumBedsString() {
    return (String) getValue("cvdNumBeds");
  }
  /**
   * numbeds - HOSPITAL INPATIENT BEDS: Inpatient beds, including all staffed, licensed, and overflow (surge) beds used for inpatients.
   */
  @JsonIgnore public Collection<String> getCvdNumBedsStrings() {
    final Object current = myData.get("cvdNumBeds");
    if (current == null) return Collections.emptyList();
    if (current instanceof Collection) {
      return (Collection<String>) current;
    }
    return Arrays.asList((String) current);
  }
  /**
   * numc19mechventpats - HOSPITALIZED and VENTILATED: Patients hospitalized in an NHSN inpatient care location who have suspected or confirmed COVID-19 and are on a mechanical ventilator.
   */
  @JsonIgnore public Integer getCvdNumC19MechVentPatsInteger() {
    return (Integer) getValue("cvdNumC19MechVentPats");
  }
  /**
   * numc19mechventpats - HOSPITALIZED and VENTILATED: Patients hospitalized in an NHSN inpatient care location who have suspected or confirmed COVID-19 and are on a mechanical ventilator.
   */
  @JsonIgnore public Collection<Integer> getCvdNumC19MechVentPatsIntegers() {
    final Object current = myData.get("cvdNumC19MechVentPats");
    if (current == null) return Collections.emptyList();
    if (current instanceof Collection) {
      return (Collection<Integer>) current;
    }
    return Arrays.asList((Integer) current);
  }
  /**
   * numc19mechventpats - HOSPITALIZED and VENTILATED: Patients hospitalized in an NHSN inpatient care location who have suspected or confirmed COVID-19 and are on a mechanical ventilator.
   */
  @JsonIgnore public Long getCvdNumC19MechVentPatsLong() {
    return (Long) getValue("cvdNumC19MechVentPats");
  }
  /**
   * numc19mechventpats - HOSPITALIZED and VENTILATED: Patients hospitalized in an NHSN inpatient care location who have suspected or confirmed COVID-19 and are on a mechanical ventilator.
   */
  @JsonIgnore public Collection<Long> getCvdNumC19MechVentPatsLongs() {
    final Object current = myData.get("cvdNumC19MechVentPats");
    if (current == null) return Collections.emptyList();
    if (current instanceof Collection) {
      return (Collection<Long>) current;
    }
    return Arrays.asList((Long) current);
  }
  /**
   * numc19mechventpats - HOSPITALIZED and VENTILATED: Patients hospitalized in an NHSN inpatient care location who have suspected or confirmed COVID-19 and are on a mechanical ventilator.
   */
  @JsonIgnore public Float getCvdNumC19MechVentPatsFloat() {
    return (Float) getValue("cvdNumC19MechVentPats");
  }
  /**
   * numc19mechventpats - HOSPITALIZED and VENTILATED: Patients hospitalized in an NHSN inpatient care location who have suspected or confirmed COVID-19 and are on a mechanical ventilator.
   */
  @JsonIgnore public Collection<Float> getCvdNumC19MechVentPatsFloats() {
    final Object current = myData.get("cvdNumC19MechVentPats");
    if (current == null) return Collections.emptyList();
    if (current instanceof Collection) {
      return (Collection<Float>) current;
    }
    return Arrays.asList((Float) current);
  }
  /**
   * numc19mechventpats - HOSPITALIZED and VENTILATED: Patients hospitalized in an NHSN inpatient care location who have suspected or confirmed COVID-19 and are on a mechanical ventilator.
   */
  @JsonIgnore public Double getCvdNumC19MechVentPatsDouble() {
    return (Double) getValue("cvdNumC19MechVentPats");
  }
  /**
   * numc19mechventpats - HOSPITALIZED and VENTILATED: Patients hospitalized in an NHSN inpatient care location who have suspected or confirmed COVID-19 and are on a mechanical ventilator.
   */
  @JsonIgnore public Collection<Double> getCvdNumC19MechVentPatsDoubles() {
    final Object current = myData.get("cvdNumC19MechVentPats");
    if (current == null) return Collections.emptyList();
    if (current instanceof Collection) {
      return (Collection<Double>) current;
    }
    return Arrays.asList((Double) current);
  }
  /**
   * numc19mechventpats - HOSPITALIZED and VENTILATED: Patients hospitalized in an NHSN inpatient care location who have suspected or confirmed COVID-19 and are on a mechanical ventilator.
   */
  @JsonIgnore public String getCvdNumC19MechVentPatsString() {
    return (String) getValue("cvdNumC19MechVentPats");
  }
  /**
   * numc19mechventpats - HOSPITALIZED and VENTILATED: Patients hospitalized in an NHSN inpatient care location who have suspected or confirmed COVID-19 and are on a mechanical ventilator.
   */
  @JsonIgnore public Collection<String> getCvdNumC19MechVentPatsStrings() {
    final Object current = myData.get("cvdNumC19MechVentPats");
    if (current == null) return Collections.emptyList();
    if (current instanceof Collection) {
      return (Collection<String>) current;
    }
    return Arrays.asList((String) current);
  }
  /**
   * numvent - MECHANICAL VENTILATORS: Total number of ventilators available.
   */
  @JsonIgnore public Integer getCvdNumVentInteger() {
    return (Integer) getValue("cvdNumVent");
  }
  /**
   * numvent - MECHANICAL VENTILATORS: Total number of ventilators available.
   */
  @JsonIgnore public Collection<Integer> getCvdNumVentIntegers() {
    final Object current = myData.get("cvdNumVent");
    if (current == null) return Collections.emptyList();
    if (current instanceof Collection) {
      return (Collection<Integer>) current;
    }
    return Arrays.asList((Integer) current);
  }
  /**
   * numvent - MECHANICAL VENTILATORS: Total number of ventilators available.
   */
  @JsonIgnore public Long getCvdNumVentLong() {
    return (Long) getValue("cvdNumVent");
  }
  /**
   * numvent - MECHANICAL VENTILATORS: Total number of ventilators available.
   */
  @JsonIgnore public Collection<Long> getCvdNumVentLongs() {
    final Object current = myData.get("cvdNumVent");
    if (current == null) return Collections.emptyList();
    if (current instanceof Collection) {
      return (Collection<Long>) current;
    }
    return Arrays.asList((Long) current);
  }
  /**
   * numvent - MECHANICAL VENTILATORS: Total number of ventilators available.
   */
  @JsonIgnore public Float getCvdNumVentFloat() {
    return (Float) getValue("cvdNumVent");
  }
  /**
   * numvent - MECHANICAL VENTILATORS: Total number of ventilators available.
   */
  @JsonIgnore public Collection<Float> getCvdNumVentFloats() {
    final Object current = myData.get("cvdNumVent");
    if (current == null) return Collections.emptyList();
    if (current instanceof Collection) {
      return (Collection<Float>) current;
    }
    return Arrays.asList((Float) current);
  }
  /**
   * numvent - MECHANICAL VENTILATORS: Total number of ventilators available.
   */
  @JsonIgnore public Double getCvdNumVentDouble() {
    return (Double) getValue("cvdNumVent");
  }
  /**
   * numvent - MECHANICAL VENTILATORS: Total number of ventilators available.
   */
  @JsonIgnore public Collection<Double> getCvdNumVentDoubles() {
    final Object current = myData.get("cvdNumVent");
    if (current == null) return Collections.emptyList();
    if (current instanceof Collection) {
      return (Collection<Double>) current;
    }
    return Arrays.asList((Double) current);
  }
  /**
   * numvent - MECHANICAL VENTILATORS: Total number of ventilators available.
   */
  @JsonIgnore public String getCvdNumVentString() {
    return (String) getValue("cvdNumVent");
  }
  /**
   * numvent - MECHANICAL VENTILATORS: Total number of ventilators available.
   */
  @JsonIgnore public Collection<String> getCvdNumVentStrings() {
    final Object current = myData.get("cvdNumVent");
    if (current == null) return Collections.emptyList();
    if (current instanceof Collection) {
      return (Collection<String>) current;
    }
    return Arrays.asList((String) current);
  }
  /**
   * numc19overflowpats - ED/OVERFLOW: Patients with suspected or confirmed COVID-19 who are in the ED or any overflow location awaiting an inpatient bed.
   */
  @JsonIgnore public Integer getCvdNumC19OverflowPatsInteger() {
    return (Integer) getValue("cvdNumC19OverflowPats");
  }
  /**
   * numc19overflowpats - ED/OVERFLOW: Patients with suspected or confirmed COVID-19 who are in the ED or any overflow location awaiting an inpatient bed.
   */
  @JsonIgnore public Collection<Integer> getCvdNumC19OverflowPatsIntegers() {
    final Object current = myData.get("cvdNumC19OverflowPats");
    if (current == null) return Collections.emptyList();
    if (current instanceof Collection) {
      return (Collection<Integer>) current;
    }
    return Arrays.asList((Integer) current);
  }
  /**
   * numc19overflowpats - ED/OVERFLOW: Patients with suspected or confirmed COVID-19 who are in the ED or any overflow location awaiting an inpatient bed.
   */
  @JsonIgnore public Long getCvdNumC19OverflowPatsLong() {
    return (Long) getValue("cvdNumC19OverflowPats");
  }
  /**
   * numc19overflowpats - ED/OVERFLOW: Patients with suspected or confirmed COVID-19 who are in the ED or any overflow location awaiting an inpatient bed.
   */
  @JsonIgnore public Collection<Long> getCvdNumC19OverflowPatsLongs() {
    final Object current = myData.get("cvdNumC19OverflowPats");
    if (current == null) return Collections.emptyList();
    if (current instanceof Collection) {
      return (Collection<Long>) current;
    }
    return Arrays.asList((Long) current);
  }
  /**
   * numc19overflowpats - ED/OVERFLOW: Patients with suspected or confirmed COVID-19 who are in the ED or any overflow location awaiting an inpatient bed.
   */
  @JsonIgnore public Float getCvdNumC19OverflowPatsFloat() {
    return (Float) getValue("cvdNumC19OverflowPats");
  }
  /**
   * numc19overflowpats - ED/OVERFLOW: Patients with suspected or confirmed COVID-19 who are in the ED or any overflow location awaiting an inpatient bed.
   */
  @JsonIgnore public Collection<Float> getCvdNumC19OverflowPatsFloats() {
    final Object current = myData.get("cvdNumC19OverflowPats");
    if (current == null) return Collections.emptyList();
    if (current instanceof Collection) {
      return (Collection<Float>) current;
    }
    return Arrays.asList((Float) current);
  }
  /**
   * numc19overflowpats - ED/OVERFLOW: Patients with suspected or confirmed COVID-19 who are in the ED or any overflow location awaiting an inpatient bed.
   */
  @JsonIgnore public Double getCvdNumC19OverflowPatsDouble() {
    return (Double) getValue("cvdNumC19OverflowPats");
  }
  /**
   * numc19overflowpats - ED/OVERFLOW: Patients with suspected or confirmed COVID-19 who are in the ED or any overflow location awaiting an inpatient bed.
   */
  @JsonIgnore public Collection<Double> getCvdNumC19OverflowPatsDoubles() {
    final Object current = myData.get("cvdNumC19OverflowPats");
    if (current == null) return Collections.emptyList();
    if (current instanceof Collection) {
      return (Collection<Double>) current;
    }
    return Arrays.asList((Double) current);
  }
  /**
   * numc19overflowpats - ED/OVERFLOW: Patients with suspected or confirmed COVID-19 who are in the ED or any overflow location awaiting an inpatient bed.
   */
  @JsonIgnore public String getCvdNumC19OverflowPatsString() {
    return (String) getValue("cvdNumC19OverflowPats");
  }
  /**
   * numc19overflowpats - ED/OVERFLOW: Patients with suspected or confirmed COVID-19 who are in the ED or any overflow location awaiting an inpatient bed.
   */
  @JsonIgnore public Collection<String> getCvdNumC19OverflowPatsStrings() {
    final Object current = myData.get("cvdNumC19OverflowPats");
    if (current == null) return Collections.emptyList();
    if (current instanceof Collection) {
      return (Collection<String>) current;
    }
    return Arrays.asList((String) current);
  }
  /**
   * numc19died - DEATHS: Patients with suspected or confirmed COVID-19 who died in the hospital, ED, or any overflow location.
   */
  @JsonIgnore public Integer getCvdNumC19DiedInteger() {
    return (Integer) getValue("cvdNumC19Died");
  }
  /**
   * numc19died - DEATHS: Patients with suspected or confirmed COVID-19 who died in the hospital, ED, or any overflow location.
   */
  @JsonIgnore public Collection<Integer> getCvdNumC19DiedIntegers() {
    final Object current = myData.get("cvdNumC19Died");
    if (current == null) return Collections.emptyList();
    if (current instanceof Collection) {
      return (Collection<Integer>) current;
    }
    return Arrays.asList((Integer) current);
  }
  /**
   * numc19died - DEATHS: Patients with suspected or confirmed COVID-19 who died in the hospital, ED, or any overflow location.
   */
  @JsonIgnore public Long getCvdNumC19DiedLong() {
    return (Long) getValue("cvdNumC19Died");
  }
  /**
   * numc19died - DEATHS: Patients with suspected or confirmed COVID-19 who died in the hospital, ED, or any overflow location.
   */
  @JsonIgnore public Collection<Long> getCvdNumC19DiedLongs() {
    final Object current = myData.get("cvdNumC19Died");
    if (current == null) return Collections.emptyList();
    if (current instanceof Collection) {
      return (Collection<Long>) current;
    }
    return Arrays.asList((Long) current);
  }
  /**
   * numc19died - DEATHS: Patients with suspected or confirmed COVID-19 who died in the hospital, ED, or any overflow location.
   */
  @JsonIgnore public Float getCvdNumC19DiedFloat() {
    return (Float) getValue("cvdNumC19Died");
  }
  /**
   * numc19died - DEATHS: Patients with suspected or confirmed COVID-19 who died in the hospital, ED, or any overflow location.
   */
  @JsonIgnore public Collection<Float> getCvdNumC19DiedFloats() {
    final Object current = myData.get("cvdNumC19Died");
    if (current == null) return Collections.emptyList();
    if (current instanceof Collection) {
      return (Collection<Float>) current;
    }
    return Arrays.asList((Float) current);
  }
  /**
   * numc19died - DEATHS: Patients with suspected or confirmed COVID-19 who died in the hospital, ED, or any overflow location.
   */
  @JsonIgnore public Double getCvdNumC19DiedDouble() {
    return (Double) getValue("cvdNumC19Died");
  }
  /**
   * numc19died - DEATHS: Patients with suspected or confirmed COVID-19 who died in the hospital, ED, or any overflow location.
   */
  @JsonIgnore public Collection<Double> getCvdNumC19DiedDoubles() {
    final Object current = myData.get("cvdNumC19Died");
    if (current == null) return Collections.emptyList();
    if (current instanceof Collection) {
      return (Collection<Double>) current;
    }
    return Arrays.asList((Double) current);
  }
  /**
   * numc19died - DEATHS: Patients with suspected or confirmed COVID-19 who died in the hospital, ED, or any overflow location.
   */
  @JsonIgnore public String getCvdNumC19DiedString() {
    return (String) getValue("cvdNumC19Died");
  }
  /**
   * numc19died - DEATHS: Patients with suspected or confirmed COVID-19 who died in the hospital, ED, or any overflow location.
   */
  @JsonIgnore public Collection<String> getCvdNumC19DiedStrings() {
    final Object current = myData.get("cvdNumC19Died");
    if (current == null) return Collections.emptyList();
    if (current instanceof Collection) {
      return (Collection<String>) current;
    }
    return Arrays.asList((String) current);
  }
  /**
   * numc19hopats - HOSPITAL ONSET: Patients hospitalized in an NHSN inpatient care location with onset of suspected or confirmed COVID-19 14 or more days after hospitalization.
   */
  @JsonIgnore public Integer getCvdNumC19HOPatsInteger() {
    return (Integer) getValue("cvdNumC19HOPats");
  }
  /**
   * numc19hopats - HOSPITAL ONSET: Patients hospitalized in an NHSN inpatient care location with onset of suspected or confirmed COVID-19 14 or more days after hospitalization.
   */
  @JsonIgnore public Collection<Integer> getCvdNumC19HOPatsIntegers() {
    final Object current = myData.get("cvdNumC19HOPats");
    if (current == null) return Collections.emptyList();
    if (current instanceof Collection) {
      return (Collection<Integer>) current;
    }
    return Arrays.asList((Integer) current);
  }
  /**
   * numc19hopats - HOSPITAL ONSET: Patients hospitalized in an NHSN inpatient care location with onset of suspected or confirmed COVID-19 14 or more days after hospitalization.
   */
  @JsonIgnore public Long getCvdNumC19HOPatsLong() {
    return (Long) getValue("cvdNumC19HOPats");
  }
  /**
   * numc19hopats - HOSPITAL ONSET: Patients hospitalized in an NHSN inpatient care location with onset of suspected or confirmed COVID-19 14 or more days after hospitalization.
   */
  @JsonIgnore public Collection<Long> getCvdNumC19HOPatsLongs() {
    final Object current = myData.get("cvdNumC19HOPats");
    if (current == null) return Collections.emptyList();
    if (current instanceof Collection) {
      return (Collection<Long>) current;
    }
    return Arrays.asList((Long) current);
  }
  /**
   * numc19hopats - HOSPITAL ONSET: Patients hospitalized in an NHSN inpatient care location with onset of suspected or confirmed COVID-19 14 or more days after hospitalization.
   */
  @JsonIgnore public Float getCvdNumC19HOPatsFloat() {
    return (Float) getValue("cvdNumC19HOPats");
  }
  /**
   * numc19hopats - HOSPITAL ONSET: Patients hospitalized in an NHSN inpatient care location with onset of suspected or confirmed COVID-19 14 or more days after hospitalization.
   */
  @JsonIgnore public Collection<Float> getCvdNumC19HOPatsFloats() {
    final Object current = myData.get("cvdNumC19HOPats");
    if (current == null) return Collections.emptyList();
    if (current instanceof Collection) {
      return (Collection<Float>) current;
    }
    return Arrays.asList((Float) current);
  }
  /**
   * numc19hopats - HOSPITAL ONSET: Patients hospitalized in an NHSN inpatient care location with onset of suspected or confirmed COVID-19 14 or more days after hospitalization.
   */
  @JsonIgnore public Double getCvdNumC19HOPatsDouble() {
    return (Double) getValue("cvdNumC19HOPats");
  }
  /**
   * numc19hopats - HOSPITAL ONSET: Patients hospitalized in an NHSN inpatient care location with onset of suspected or confirmed COVID-19 14 or more days after hospitalization.
   */
  @JsonIgnore public Collection<Double> getCvdNumC19HOPatsDoubles() {
    final Object current = myData.get("cvdNumC19HOPats");
    if (current == null) return Collections.emptyList();
    if (current instanceof Collection) {
      return (Collection<Double>) current;
    }
    return Arrays.asList((Double) current);
  }
  /**
   * numc19hopats - HOSPITAL ONSET: Patients hospitalized in an NHSN inpatient care location with onset of suspected or confirmed COVID-19 14 or more days after hospitalization.
   */
  @JsonIgnore public String getCvdNumC19HOPatsString() {
    return (String) getValue("cvdNumC19HOPats");
  }
  /**
   * numc19hopats - HOSPITAL ONSET: Patients hospitalized in an NHSN inpatient care location with onset of suspected or confirmed COVID-19 14 or more days after hospitalization.
   */
  @JsonIgnore public Collection<String> getCvdNumC19HOPatsStrings() {
    final Object current = myData.get("cvdNumC19HOPats");
    if (current == null) return Collections.emptyList();
    if (current instanceof Collection) {
      return (Collection<String>) current;
    }
    return Arrays.asList((String) current);
  }
  /**
   * numventuse - MECHANICAL VENTILATORS IN USE: Total number of ventilators in use.
   */
  @JsonIgnore public Integer getCvdNumVentUseInteger() {
    return (Integer) getValue("cvdNumVentUse");
  }
  /**
   * numventuse - MECHANICAL VENTILATORS IN USE: Total number of ventilators in use.
   */
  @JsonIgnore public Collection<Integer> getCvdNumVentUseIntegers() {
    final Object current = myData.get("cvdNumVentUse");
    if (current == null) return Collections.emptyList();
    if (current instanceof Collection) {
      return (Collection<Integer>) current;
    }
    return Arrays.asList((Integer) current);
  }
  /**
   * numventuse - MECHANICAL VENTILATORS IN USE: Total number of ventilators in use.
   */
  @JsonIgnore public Long getCvdNumVentUseLong() {
    return (Long) getValue("cvdNumVentUse");
  }
  /**
   * numventuse - MECHANICAL VENTILATORS IN USE: Total number of ventilators in use.
   */
  @JsonIgnore public Collection<Long> getCvdNumVentUseLongs() {
    final Object current = myData.get("cvdNumVentUse");
    if (current == null) return Collections.emptyList();
    if (current instanceof Collection) {
      return (Collection<Long>) current;
    }
    return Arrays.asList((Long) current);
  }
  /**
   * numventuse - MECHANICAL VENTILATORS IN USE: Total number of ventilators in use.
   */
  @JsonIgnore public Float getCvdNumVentUseFloat() {
    return (Float) getValue("cvdNumVentUse");
  }
  /**
   * numventuse - MECHANICAL VENTILATORS IN USE: Total number of ventilators in use.
   */
  @JsonIgnore public Collection<Float> getCvdNumVentUseFloats() {
    final Object current = myData.get("cvdNumVentUse");
    if (current == null) return Collections.emptyList();
    if (current instanceof Collection) {
      return (Collection<Float>) current;
    }
    return Arrays.asList((Float) current);
  }
  /**
   * numventuse - MECHANICAL VENTILATORS IN USE: Total number of ventilators in use.
   */
  @JsonIgnore public Double getCvdNumVentUseDouble() {
    return (Double) getValue("cvdNumVentUse");
  }
  /**
   * numventuse - MECHANICAL VENTILATORS IN USE: Total number of ventilators in use.
   */
  @JsonIgnore public Collection<Double> getCvdNumVentUseDoubles() {
    final Object current = myData.get("cvdNumVentUse");
    if (current == null) return Collections.emptyList();
    if (current instanceof Collection) {
      return (Collection<Double>) current;
    }
    return Arrays.asList((Double) current);
  }
  /**
   * numventuse - MECHANICAL VENTILATORS IN USE: Total number of ventilators in use.
   */
  @JsonIgnore public String getCvdNumVentUseString() {
    return (String) getValue("cvdNumVentUse");
  }
  /**
   * numventuse - MECHANICAL VENTILATORS IN USE: Total number of ventilators in use.
   */
  @JsonIgnore public Collection<String> getCvdNumVentUseStrings() {
    final Object current = myData.get("cvdNumVentUse");
    if (current == null) return Collections.emptyList();
    if (current instanceof Collection) {
      return (Collection<String>) current;
    }
    return Arrays.asList((String) current);
  }
  /**
   * numc19ofmechventpats - ED/OVERFLOW and VENTILATED: Patients with suspected or confirmed COVID-19 who are in the ED or any overflow location awaiting an inpatient bed and on a mechanical ventilator.
   */
  @JsonIgnore public Integer getCvdNumC19OFMechVentPatsInteger() {
    return (Integer) getValue("cvdNumC19OFMechVentPats");
  }
  /**
   * numc19ofmechventpats - ED/OVERFLOW and VENTILATED: Patients with suspected or confirmed COVID-19 who are in the ED or any overflow location awaiting an inpatient bed and on a mechanical ventilator.
   */
  @JsonIgnore public Collection<Integer> getCvdNumC19OFMechVentPatsIntegers() {
    final Object current = myData.get("cvdNumC19OFMechVentPats");
    if (current == null) return Collections.emptyList();
    if (current instanceof Collection) {
      return (Collection<Integer>) current;
    }
    return Arrays.asList((Integer) current);
  }
  /**
   * numc19ofmechventpats - ED/OVERFLOW and VENTILATED: Patients with suspected or confirmed COVID-19 who are in the ED or any overflow location awaiting an inpatient bed and on a mechanical ventilator.
   */
  @JsonIgnore public Long getCvdNumC19OFMechVentPatsLong() {
    return (Long) getValue("cvdNumC19OFMechVentPats");
  }
  /**
   * numc19ofmechventpats - ED/OVERFLOW and VENTILATED: Patients with suspected or confirmed COVID-19 who are in the ED or any overflow location awaiting an inpatient bed and on a mechanical ventilator.
   */
  @JsonIgnore public Collection<Long> getCvdNumC19OFMechVentPatsLongs() {
    final Object current = myData.get("cvdNumC19OFMechVentPats");
    if (current == null) return Collections.emptyList();
    if (current instanceof Collection) {
      return (Collection<Long>) current;
    }
    return Arrays.asList((Long) current);
  }
  /**
   * numc19ofmechventpats - ED/OVERFLOW and VENTILATED: Patients with suspected or confirmed COVID-19 who are in the ED or any overflow location awaiting an inpatient bed and on a mechanical ventilator.
   */
  @JsonIgnore public Float getCvdNumC19OFMechVentPatsFloat() {
    return (Float) getValue("cvdNumC19OFMechVentPats");
  }
  /**
   * numc19ofmechventpats - ED/OVERFLOW and VENTILATED: Patients with suspected or confirmed COVID-19 who are in the ED or any overflow location awaiting an inpatient bed and on a mechanical ventilator.
   */
  @JsonIgnore public Collection<Float> getCvdNumC19OFMechVentPatsFloats() {
    final Object current = myData.get("cvdNumC19OFMechVentPats");
    if (current == null) return Collections.emptyList();
    if (current instanceof Collection) {
      return (Collection<Float>) current;
    }
    return Arrays.asList((Float) current);
  }
  /**
   * numc19ofmechventpats - ED/OVERFLOW and VENTILATED: Patients with suspected or confirmed COVID-19 who are in the ED or any overflow location awaiting an inpatient bed and on a mechanical ventilator.
   */
  @JsonIgnore public Double getCvdNumC19OFMechVentPatsDouble() {
    return (Double) getValue("cvdNumC19OFMechVentPats");
  }
  /**
   * numc19ofmechventpats - ED/OVERFLOW and VENTILATED: Patients with suspected or confirmed COVID-19 who are in the ED or any overflow location awaiting an inpatient bed and on a mechanical ventilator.
   */
  @JsonIgnore public Collection<Double> getCvdNumC19OFMechVentPatsDoubles() {
    final Object current = myData.get("cvdNumC19OFMechVentPats");
    if (current == null) return Collections.emptyList();
    if (current instanceof Collection) {
      return (Collection<Double>) current;
    }
    return Arrays.asList((Double) current);
  }
  /**
   * numc19ofmechventpats - ED/OVERFLOW and VENTILATED: Patients with suspected or confirmed COVID-19 who are in the ED or any overflow location awaiting an inpatient bed and on a mechanical ventilator.
   */
  @JsonIgnore public String getCvdNumC19OFMechVentPatsString() {
    return (String) getValue("cvdNumC19OFMechVentPats");
  }
  /**
   * numc19ofmechventpats - ED/OVERFLOW and VENTILATED: Patients with suspected or confirmed COVID-19 who are in the ED or any overflow location awaiting an inpatient bed and on a mechanical ventilator.
   */
  @JsonIgnore public Collection<String> getCvdNumC19OFMechVentPatsStrings() {
    final Object current = myData.get("cvdNumC19OFMechVentPats");
    if (current == null) return Collections.emptyList();
    if (current instanceof Collection) {
      return (Collection<String>) current;
    }
    return Arrays.asList((String) current);
  }
  /**
   * Name of the County of the NHSN facility that this data record applies to. Use [[cvdFacilityId]] to identify the facility. To provide other details, [[healthcareReportingData]] can be used on a [[Hospital]] entry.
   */
  @JsonIgnore public String getCvdFacilityCounty() {
    return (String) getValue("cvdFacilityCounty");
  }
  /**
   * Name of the County of the NHSN facility that this data record applies to. Use [[cvdFacilityId]] to identify the facility. To provide other details, [[healthcareReportingData]] can be used on a [[Hospital]] entry.
   */
  @JsonIgnore public Collection<String> getCvdFacilityCountys() {
    final Object current = myData.get("cvdFacilityCounty");
    if (current == null) return Collections.emptyList();
    if (current instanceof Collection) {
      return (Collection<String>) current;
    }
    return Arrays.asList((String) current);
  }
  /**
   * numbedsocc - HOSPITAL INPATIENT BED OCCUPANCY: Total number of staffed inpatient beds that are occupied.
   */
  @JsonIgnore public Integer getCvdNumBedsOccInteger() {
    return (Integer) getValue("cvdNumBedsOcc");
  }
  /**
   * numbedsocc - HOSPITAL INPATIENT BED OCCUPANCY: Total number of staffed inpatient beds that are occupied.
   */
  @JsonIgnore public Collection<Integer> getCvdNumBedsOccIntegers() {
    final Object current = myData.get("cvdNumBedsOcc");
    if (current == null) return Collections.emptyList();
    if (current instanceof Collection) {
      return (Collection<Integer>) current;
    }
    return Arrays.asList((Integer) current);
  }
  /**
   * numbedsocc - HOSPITAL INPATIENT BED OCCUPANCY: Total number of staffed inpatient beds that are occupied.
   */
  @JsonIgnore public Long getCvdNumBedsOccLong() {
    return (Long) getValue("cvdNumBedsOcc");
  }
  /**
   * numbedsocc - HOSPITAL INPATIENT BED OCCUPANCY: Total number of staffed inpatient beds that are occupied.
   */
  @JsonIgnore public Collection<Long> getCvdNumBedsOccLongs() {
    final Object current = myData.get("cvdNumBedsOcc");
    if (current == null) return Collections.emptyList();
    if (current instanceof Collection) {
      return (Collection<Long>) current;
    }
    return Arrays.asList((Long) current);
  }
  /**
   * numbedsocc - HOSPITAL INPATIENT BED OCCUPANCY: Total number of staffed inpatient beds that are occupied.
   */
  @JsonIgnore public Float getCvdNumBedsOccFloat() {
    return (Float) getValue("cvdNumBedsOcc");
  }
  /**
   * numbedsocc - HOSPITAL INPATIENT BED OCCUPANCY: Total number of staffed inpatient beds that are occupied.
   */
  @JsonIgnore public Collection<Float> getCvdNumBedsOccFloats() {
    final Object current = myData.get("cvdNumBedsOcc");
    if (current == null) return Collections.emptyList();
    if (current instanceof Collection) {
      return (Collection<Float>) current;
    }
    return Arrays.asList((Float) current);
  }
  /**
   * numbedsocc - HOSPITAL INPATIENT BED OCCUPANCY: Total number of staffed inpatient beds that are occupied.
   */
  @JsonIgnore public Double getCvdNumBedsOccDouble() {
    return (Double) getValue("cvdNumBedsOcc");
  }
  /**
   * numbedsocc - HOSPITAL INPATIENT BED OCCUPANCY: Total number of staffed inpatient beds that are occupied.
   */
  @JsonIgnore public Collection<Double> getCvdNumBedsOccDoubles() {
    final Object current = myData.get("cvdNumBedsOcc");
    if (current == null) return Collections.emptyList();
    if (current instanceof Collection) {
      return (Collection<Double>) current;
    }
    return Arrays.asList((Double) current);
  }
  /**
   * numbedsocc - HOSPITAL INPATIENT BED OCCUPANCY: Total number of staffed inpatient beds that are occupied.
   */
  @JsonIgnore public String getCvdNumBedsOccString() {
    return (String) getValue("cvdNumBedsOcc");
  }
  /**
   * numbedsocc - HOSPITAL INPATIENT BED OCCUPANCY: Total number of staffed inpatient beds that are occupied.
   */
  @JsonIgnore public Collection<String> getCvdNumBedsOccStrings() {
    final Object current = myData.get("cvdNumBedsOcc");
    if (current == null) return Collections.emptyList();
    if (current instanceof Collection) {
      return (Collection<String>) current;
    }
    return Arrays.asList((String) current);
  }
  /**
   * numtotbeds - ALL HOSPITAL BEDS: Total number of all Inpatient and outpatient beds, including all staffed,ICU, licensed, and overflow (surge) beds used for inpatients or outpatients.
   */
  @JsonIgnore public Integer getCvdNumTotBedsInteger() {
    return (Integer) getValue("cvdNumTotBeds");
  }
  /**
   * numtotbeds - ALL HOSPITAL BEDS: Total number of all Inpatient and outpatient beds, including all staffed,ICU, licensed, and overflow (surge) beds used for inpatients or outpatients.
   */
  @JsonIgnore public Collection<Integer> getCvdNumTotBedsIntegers() {
    final Object current = myData.get("cvdNumTotBeds");
    if (current == null) return Collections.emptyList();
    if (current instanceof Collection) {
      return (Collection<Integer>) current;
    }
    return Arrays.asList((Integer) current);
  }
  /**
   * numtotbeds - ALL HOSPITAL BEDS: Total number of all Inpatient and outpatient beds, including all staffed,ICU, licensed, and overflow (surge) beds used for inpatients or outpatients.
   */
  @JsonIgnore public Long getCvdNumTotBedsLong() {
    return (Long) getValue("cvdNumTotBeds");
  }
  /**
   * numtotbeds - ALL HOSPITAL BEDS: Total number of all Inpatient and outpatient beds, including all staffed,ICU, licensed, and overflow (surge) beds used for inpatients or outpatients.
   */
  @JsonIgnore public Collection<Long> getCvdNumTotBedsLongs() {
    final Object current = myData.get("cvdNumTotBeds");
    if (current == null) return Collections.emptyList();
    if (current instanceof Collection) {
      return (Collection<Long>) current;
    }
    return Arrays.asList((Long) current);
  }
  /**
   * numtotbeds - ALL HOSPITAL BEDS: Total number of all Inpatient and outpatient beds, including all staffed,ICU, licensed, and overflow (surge) beds used for inpatients or outpatients.
   */
  @JsonIgnore public Float getCvdNumTotBedsFloat() {
    return (Float) getValue("cvdNumTotBeds");
  }
  /**
   * numtotbeds - ALL HOSPITAL BEDS: Total number of all Inpatient and outpatient beds, including all staffed,ICU, licensed, and overflow (surge) beds used for inpatients or outpatients.
   */
  @JsonIgnore public Collection<Float> getCvdNumTotBedsFloats() {
    final Object current = myData.get("cvdNumTotBeds");
    if (current == null) return Collections.emptyList();
    if (current instanceof Collection) {
      return (Collection<Float>) current;
    }
    return Arrays.asList((Float) current);
  }
  /**
   * numtotbeds - ALL HOSPITAL BEDS: Total number of all Inpatient and outpatient beds, including all staffed,ICU, licensed, and overflow (surge) beds used for inpatients or outpatients.
   */
  @JsonIgnore public Double getCvdNumTotBedsDouble() {
    return (Double) getValue("cvdNumTotBeds");
  }
  /**
   * numtotbeds - ALL HOSPITAL BEDS: Total number of all Inpatient and outpatient beds, including all staffed,ICU, licensed, and overflow (surge) beds used for inpatients or outpatients.
   */
  @JsonIgnore public Collection<Double> getCvdNumTotBedsDoubles() {
    final Object current = myData.get("cvdNumTotBeds");
    if (current == null) return Collections.emptyList();
    if (current instanceof Collection) {
      return (Collection<Double>) current;
    }
    return Arrays.asList((Double) current);
  }
  /**
   * numtotbeds - ALL HOSPITAL BEDS: Total number of all Inpatient and outpatient beds, including all staffed,ICU, licensed, and overflow (surge) beds used for inpatients or outpatients.
   */
  @JsonIgnore public String getCvdNumTotBedsString() {
    return (String) getValue("cvdNumTotBeds");
  }
  /**
   * numtotbeds - ALL HOSPITAL BEDS: Total number of all Inpatient and outpatient beds, including all staffed,ICU, licensed, and overflow (surge) beds used for inpatients or outpatients.
   */
  @JsonIgnore public Collection<String> getCvdNumTotBedsStrings() {
    final Object current = myData.get("cvdNumTotBeds");
    if (current == null) return Collections.emptyList();
    if (current instanceof Collection) {
      return (Collection<String>) current;
    }
    return Arrays.asList((String) current);
  }
  /**
   * numc19hosppats - HOSPITALIZED: Patients currently hospitalized in an inpatient care location who have suspected or confirmed COVID-19.
   */
  @JsonIgnore public Integer getCvdNumC19HospPatsInteger() {
    return (Integer) getValue("cvdNumC19HospPats");
  }
  /**
   * numc19hosppats - HOSPITALIZED: Patients currently hospitalized in an inpatient care location who have suspected or confirmed COVID-19.
   */
  @JsonIgnore public Collection<Integer> getCvdNumC19HospPatsIntegers() {
    final Object current = myData.get("cvdNumC19HospPats");
    if (current == null) return Collections.emptyList();
    if (current instanceof Collection) {
      return (Collection<Integer>) current;
    }
    return Arrays.asList((Integer) current);
  }
  /**
   * numc19hosppats - HOSPITALIZED: Patients currently hospitalized in an inpatient care location who have suspected or confirmed COVID-19.
   */
  @JsonIgnore public Long getCvdNumC19HospPatsLong() {
    return (Long) getValue("cvdNumC19HospPats");
  }
  /**
   * numc19hosppats - HOSPITALIZED: Patients currently hospitalized in an inpatient care location who have suspected or confirmed COVID-19.
   */
  @JsonIgnore public Collection<Long> getCvdNumC19HospPatsLongs() {
    final Object current = myData.get("cvdNumC19HospPats");
    if (current == null) return Collections.emptyList();
    if (current instanceof Collection) {
      return (Collection<Long>) current;
    }
    return Arrays.asList((Long) current);
  }
  /**
   * numc19hosppats - HOSPITALIZED: Patients currently hospitalized in an inpatient care location who have suspected or confirmed COVID-19.
   */
  @JsonIgnore public Float getCvdNumC19HospPatsFloat() {
    return (Float) getValue("cvdNumC19HospPats");
  }
  /**
   * numc19hosppats - HOSPITALIZED: Patients currently hospitalized in an inpatient care location who have suspected or confirmed COVID-19.
   */
  @JsonIgnore public Collection<Float> getCvdNumC19HospPatsFloats() {
    final Object current = myData.get("cvdNumC19HospPats");
    if (current == null) return Collections.emptyList();
    if (current instanceof Collection) {
      return (Collection<Float>) current;
    }
    return Arrays.asList((Float) current);
  }
  /**
   * numc19hosppats - HOSPITALIZED: Patients currently hospitalized in an inpatient care location who have suspected or confirmed COVID-19.
   */
  @JsonIgnore public Double getCvdNumC19HospPatsDouble() {
    return (Double) getValue("cvdNumC19HospPats");
  }
  /**
   * numc19hosppats - HOSPITALIZED: Patients currently hospitalized in an inpatient care location who have suspected or confirmed COVID-19.
   */
  @JsonIgnore public Collection<Double> getCvdNumC19HospPatsDoubles() {
    final Object current = myData.get("cvdNumC19HospPats");
    if (current == null) return Collections.emptyList();
    if (current instanceof Collection) {
      return (Collection<Double>) current;
    }
    return Arrays.asList((Double) current);
  }
  /**
   * numc19hosppats - HOSPITALIZED: Patients currently hospitalized in an inpatient care location who have suspected or confirmed COVID-19.
   */
  @JsonIgnore public String getCvdNumC19HospPatsString() {
    return (String) getValue("cvdNumC19HospPats");
  }
  /**
   * numc19hosppats - HOSPITALIZED: Patients currently hospitalized in an inpatient care location who have suspected or confirmed COVID-19.
   */
  @JsonIgnore public Collection<String> getCvdNumC19HospPatsStrings() {
    final Object current = myData.get("cvdNumC19HospPats");
    if (current == null) return Collections.emptyList();
    if (current instanceof Collection) {
      return (Collection<String>) current;
    }
    return Arrays.asList((String) current);
  }
  /**
   * Identifier of the NHSN facility that this data record applies to. Use [[cvdFacilityCounty]] to indicate the county. To provide other details, [[healthcareReportingData]] can be used on a [[Hospital]] entry.
   */
  @JsonIgnore public String getCvdFacilityId() {
    return (String) getValue("cvdFacilityId");
  }
  /**
   * Identifier of the NHSN facility that this data record applies to. Use [[cvdFacilityCounty]] to indicate the county. To provide other details, [[healthcareReportingData]] can be used on a [[Hospital]] entry.
   */
  @JsonIgnore public Collection<String> getCvdFacilityIds() {
    final Object current = myData.get("cvdFacilityId");
    if (current == null) return Collections.emptyList();
    if (current instanceof Collection) {
      return (Collection<String>) current;
    }
    return Arrays.asList((String) current);
  }
  /**
   * numicubedsocc - ICU BED OCCUPANCY: Total number of staffed inpatient ICU beds that are occupied.
   */
  @JsonIgnore public Integer getCvdNumICUBedsOccInteger() {
    return (Integer) getValue("cvdNumICUBedsOcc");
  }
  /**
   * numicubedsocc - ICU BED OCCUPANCY: Total number of staffed inpatient ICU beds that are occupied.
   */
  @JsonIgnore public Collection<Integer> getCvdNumICUBedsOccIntegers() {
    final Object current = myData.get("cvdNumICUBedsOcc");
    if (current == null) return Collections.emptyList();
    if (current instanceof Collection) {
      return (Collection<Integer>) current;
    }
    return Arrays.asList((Integer) current);
  }
  /**
   * numicubedsocc - ICU BED OCCUPANCY: Total number of staffed inpatient ICU beds that are occupied.
   */
  @JsonIgnore public Long getCvdNumICUBedsOccLong() {
    return (Long) getValue("cvdNumICUBedsOcc");
  }
  /**
   * numicubedsocc - ICU BED OCCUPANCY: Total number of staffed inpatient ICU beds that are occupied.
   */
  @JsonIgnore public Collection<Long> getCvdNumICUBedsOccLongs() {
    final Object current = myData.get("cvdNumICUBedsOcc");
    if (current == null) return Collections.emptyList();
    if (current instanceof Collection) {
      return (Collection<Long>) current;
    }
    return Arrays.asList((Long) current);
  }
  /**
   * numicubedsocc - ICU BED OCCUPANCY: Total number of staffed inpatient ICU beds that are occupied.
   */
  @JsonIgnore public Float getCvdNumICUBedsOccFloat() {
    return (Float) getValue("cvdNumICUBedsOcc");
  }
  /**
   * numicubedsocc - ICU BED OCCUPANCY: Total number of staffed inpatient ICU beds that are occupied.
   */
  @JsonIgnore public Collection<Float> getCvdNumICUBedsOccFloats() {
    final Object current = myData.get("cvdNumICUBedsOcc");
    if (current == null) return Collections.emptyList();
    if (current instanceof Collection) {
      return (Collection<Float>) current;
    }
    return Arrays.asList((Float) current);
  }
  /**
   * numicubedsocc - ICU BED OCCUPANCY: Total number of staffed inpatient ICU beds that are occupied.
   */
  @JsonIgnore public Double getCvdNumICUBedsOccDouble() {
    return (Double) getValue("cvdNumICUBedsOcc");
  }
  /**
   * numicubedsocc - ICU BED OCCUPANCY: Total number of staffed inpatient ICU beds that are occupied.
   */
  @JsonIgnore public Collection<Double> getCvdNumICUBedsOccDoubles() {
    final Object current = myData.get("cvdNumICUBedsOcc");
    if (current == null) return Collections.emptyList();
    if (current instanceof Collection) {
      return (Collection<Double>) current;
    }
    return Arrays.asList((Double) current);
  }
  /**
   * numicubedsocc - ICU BED OCCUPANCY: Total number of staffed inpatient ICU beds that are occupied.
   */
  @JsonIgnore public String getCvdNumICUBedsOccString() {
    return (String) getValue("cvdNumICUBedsOcc");
  }
  /**
   * numicubedsocc - ICU BED OCCUPANCY: Total number of staffed inpatient ICU beds that are occupied.
   */
  @JsonIgnore public Collection<String> getCvdNumICUBedsOccStrings() {
    final Object current = myData.get("cvdNumICUBedsOcc");
    if (current == null) return Collections.emptyList();
    if (current instanceof Collection) {
      return (Collection<String>) current;
    }
    return Arrays.asList((String) current);
  }
  protected CDCPMDRecord(java.util.Map<String,Object> data) {
    super(data);
  }
  
  /**
   * Builder for {@link CDCPMDRecord}
   */
  public static class Builder extends StructuredValue.Builder {
    public Builder(@NotNull HashMap<String,Object> data) {
      super(data);
    }
    @NotNull public CDCPMDRecord build() {
      return new CDCPMDRecord(myData);
    }
    /**
     * numicubeds - ICU BEDS: Total number of staffed inpatient intensive care unit (ICU) beds.
     */
    @NotNull public Builder cvdNumICUBeds(@NotNull Integer integer) {
      putValue("cvdNumICUBeds", integer);
      return this;
    }
    /**
     * numicubeds - ICU BEDS: Total number of staffed inpatient intensive care unit (ICU) beds.
     */
    @NotNull public Builder cvdNumICUBeds(@NotNull Long cvdNumICUBeds) {
      putValue("cvdNumICUBeds", cvdNumICUBeds);
      return this;
    }
    /**
     * numicubeds - ICU BEDS: Total number of staffed inpatient intensive care unit (ICU) beds.
     */
    @NotNull public Builder cvdNumICUBeds(@NotNull Float cvdNumICUBeds) {
      putValue("cvdNumICUBeds", cvdNumICUBeds);
      return this;
    }
    /**
     * numicubeds - ICU BEDS: Total number of staffed inpatient intensive care unit (ICU) beds.
     */
    @NotNull public Builder cvdNumICUBeds(@NotNull Double cvdNumICUBeds) {
      putValue("cvdNumICUBeds", cvdNumICUBeds);
      return this;
    }
    /**
     * numicubeds - ICU BEDS: Total number of staffed inpatient intensive care unit (ICU) beds.
     */
    @NotNull public Builder cvdNumICUBeds(@NotNull String cvdNumICUBeds) {
      putValue("cvdNumICUBeds", cvdNumICUBeds);
      return this;
    }
    /**
     * collectiondate - Date for which patient counts are reported.
     */
    @NotNull public Builder cvdCollectionDate(@NotNull String cvdCollectionDate) {
      putValue("cvdCollectionDate", cvdCollectionDate);
      return this;
    }
    /**
     * collectiondate - Date for which patient counts are reported.
     */
    @NotNull public Builder cvdCollectionDate(@NotNull java.util.Date date) {
      putValue("cvdCollectionDate", date);
      return this;
    }
    /**
     * Publication date of an online listing.
     */
    @NotNull public Builder datePosted(@NotNull java.util.Date date) {
      putValue("datePosted", date);
      return this;
    }
    /**
     * numbeds - HOSPITAL INPATIENT BEDS: Inpatient beds, including all staffed, licensed, and overflow (surge) beds used for inpatients.
     */
    @NotNull public Builder cvdNumBeds(@NotNull Integer integer) {
      putValue("cvdNumBeds", integer);
      return this;
    }
    /**
     * numbeds - HOSPITAL INPATIENT BEDS: Inpatient beds, including all staffed, licensed, and overflow (surge) beds used for inpatients.
     */
    @NotNull public Builder cvdNumBeds(@NotNull Long cvdNumBeds) {
      putValue("cvdNumBeds", cvdNumBeds);
      return this;
    }
    /**
     * numbeds - HOSPITAL INPATIENT BEDS: Inpatient beds, including all staffed, licensed, and overflow (surge) beds used for inpatients.
     */
    @NotNull public Builder cvdNumBeds(@NotNull Float cvdNumBeds) {
      putValue("cvdNumBeds", cvdNumBeds);
      return this;
    }
    /**
     * numbeds - HOSPITAL INPATIENT BEDS: Inpatient beds, including all staffed, licensed, and overflow (surge) beds used for inpatients.
     */
    @NotNull public Builder cvdNumBeds(@NotNull Double cvdNumBeds) {
      putValue("cvdNumBeds", cvdNumBeds);
      return this;
    }
    /**
     * numbeds - HOSPITAL INPATIENT BEDS: Inpatient beds, including all staffed, licensed, and overflow (surge) beds used for inpatients.
     */
    @NotNull public Builder cvdNumBeds(@NotNull String cvdNumBeds) {
      putValue("cvdNumBeds", cvdNumBeds);
      return this;
    }
    /**
     * numc19mechventpats - HOSPITALIZED and VENTILATED: Patients hospitalized in an NHSN inpatient care location who have suspected or confirmed COVID-19 and are on a mechanical ventilator.
     */
    @NotNull public Builder cvdNumC19MechVentPats(@NotNull Integer integer) {
      putValue("cvdNumC19MechVentPats", integer);
      return this;
    }
    /**
     * numc19mechventpats - HOSPITALIZED and VENTILATED: Patients hospitalized in an NHSN inpatient care location who have suspected or confirmed COVID-19 and are on a mechanical ventilator.
     */
    @NotNull public Builder cvdNumC19MechVentPats(@NotNull Long cvdNumC19MechVentPats) {
      putValue("cvdNumC19MechVentPats", cvdNumC19MechVentPats);
      return this;
    }
    /**
     * numc19mechventpats - HOSPITALIZED and VENTILATED: Patients hospitalized in an NHSN inpatient care location who have suspected or confirmed COVID-19 and are on a mechanical ventilator.
     */
    @NotNull public Builder cvdNumC19MechVentPats(@NotNull Float cvdNumC19MechVentPats) {
      putValue("cvdNumC19MechVentPats", cvdNumC19MechVentPats);
      return this;
    }
    /**
     * numc19mechventpats - HOSPITALIZED and VENTILATED: Patients hospitalized in an NHSN inpatient care location who have suspected or confirmed COVID-19 and are on a mechanical ventilator.
     */
    @NotNull public Builder cvdNumC19MechVentPats(@NotNull Double cvdNumC19MechVentPats) {
      putValue("cvdNumC19MechVentPats", cvdNumC19MechVentPats);
      return this;
    }
    /**
     * numc19mechventpats - HOSPITALIZED and VENTILATED: Patients hospitalized in an NHSN inpatient care location who have suspected or confirmed COVID-19 and are on a mechanical ventilator.
     */
    @NotNull public Builder cvdNumC19MechVentPats(@NotNull String cvdNumC19MechVentPats) {
      putValue("cvdNumC19MechVentPats", cvdNumC19MechVentPats);
      return this;
    }
    /**
     * numvent - MECHANICAL VENTILATORS: Total number of ventilators available.
     */
    @NotNull public Builder cvdNumVent(@NotNull Integer integer) {
      putValue("cvdNumVent", integer);
      return this;
    }
    /**
     * numvent - MECHANICAL VENTILATORS: Total number of ventilators available.
     */
    @NotNull public Builder cvdNumVent(@NotNull Long cvdNumVent) {
      putValue("cvdNumVent", cvdNumVent);
      return this;
    }
    /**
     * numvent - MECHANICAL VENTILATORS: Total number of ventilators available.
     */
    @NotNull public Builder cvdNumVent(@NotNull Float cvdNumVent) {
      putValue("cvdNumVent", cvdNumVent);
      return this;
    }
    /**
     * numvent - MECHANICAL VENTILATORS: Total number of ventilators available.
     */
    @NotNull public Builder cvdNumVent(@NotNull Double cvdNumVent) {
      putValue("cvdNumVent", cvdNumVent);
      return this;
    }
    /**
     * numvent - MECHANICAL VENTILATORS: Total number of ventilators available.
     */
    @NotNull public Builder cvdNumVent(@NotNull String cvdNumVent) {
      putValue("cvdNumVent", cvdNumVent);
      return this;
    }
    /**
     * numc19overflowpats - ED/OVERFLOW: Patients with suspected or confirmed COVID-19 who are in the ED or any overflow location awaiting an inpatient bed.
     */
    @NotNull public Builder cvdNumC19OverflowPats(@NotNull Integer integer) {
      putValue("cvdNumC19OverflowPats", integer);
      return this;
    }
    /**
     * numc19overflowpats - ED/OVERFLOW: Patients with suspected or confirmed COVID-19 who are in the ED or any overflow location awaiting an inpatient bed.
     */
    @NotNull public Builder cvdNumC19OverflowPats(@NotNull Long cvdNumC19OverflowPats) {
      putValue("cvdNumC19OverflowPats", cvdNumC19OverflowPats);
      return this;
    }
    /**
     * numc19overflowpats - ED/OVERFLOW: Patients with suspected or confirmed COVID-19 who are in the ED or any overflow location awaiting an inpatient bed.
     */
    @NotNull public Builder cvdNumC19OverflowPats(@NotNull Float cvdNumC19OverflowPats) {
      putValue("cvdNumC19OverflowPats", cvdNumC19OverflowPats);
      return this;
    }
    /**
     * numc19overflowpats - ED/OVERFLOW: Patients with suspected or confirmed COVID-19 who are in the ED or any overflow location awaiting an inpatient bed.
     */
    @NotNull public Builder cvdNumC19OverflowPats(@NotNull Double cvdNumC19OverflowPats) {
      putValue("cvdNumC19OverflowPats", cvdNumC19OverflowPats);
      return this;
    }
    /**
     * numc19overflowpats - ED/OVERFLOW: Patients with suspected or confirmed COVID-19 who are in the ED or any overflow location awaiting an inpatient bed.
     */
    @NotNull public Builder cvdNumC19OverflowPats(@NotNull String cvdNumC19OverflowPats) {
      putValue("cvdNumC19OverflowPats", cvdNumC19OverflowPats);
      return this;
    }
    /**
     * numc19died - DEATHS: Patients with suspected or confirmed COVID-19 who died in the hospital, ED, or any overflow location.
     */
    @NotNull public Builder cvdNumC19Died(@NotNull Integer integer) {
      putValue("cvdNumC19Died", integer);
      return this;
    }
    /**
     * numc19died - DEATHS: Patients with suspected or confirmed COVID-19 who died in the hospital, ED, or any overflow location.
     */
    @NotNull public Builder cvdNumC19Died(@NotNull Long cvdNumC19Died) {
      putValue("cvdNumC19Died", cvdNumC19Died);
      return this;
    }
    /**
     * numc19died - DEATHS: Patients with suspected or confirmed COVID-19 who died in the hospital, ED, or any overflow location.
     */
    @NotNull public Builder cvdNumC19Died(@NotNull Float cvdNumC19Died) {
      putValue("cvdNumC19Died", cvdNumC19Died);
      return this;
    }
    /**
     * numc19died - DEATHS: Patients with suspected or confirmed COVID-19 who died in the hospital, ED, or any overflow location.
     */
    @NotNull public Builder cvdNumC19Died(@NotNull Double cvdNumC19Died) {
      putValue("cvdNumC19Died", cvdNumC19Died);
      return this;
    }
    /**
     * numc19died - DEATHS: Patients with suspected or confirmed COVID-19 who died in the hospital, ED, or any overflow location.
     */
    @NotNull public Builder cvdNumC19Died(@NotNull String cvdNumC19Died) {
      putValue("cvdNumC19Died", cvdNumC19Died);
      return this;
    }
    /**
     * numc19hopats - HOSPITAL ONSET: Patients hospitalized in an NHSN inpatient care location with onset of suspected or confirmed COVID-19 14 or more days after hospitalization.
     */
    @NotNull public Builder cvdNumC19HOPats(@NotNull Integer integer) {
      putValue("cvdNumC19HOPats", integer);
      return this;
    }
    /**
     * numc19hopats - HOSPITAL ONSET: Patients hospitalized in an NHSN inpatient care location with onset of suspected or confirmed COVID-19 14 or more days after hospitalization.
     */
    @NotNull public Builder cvdNumC19HOPats(@NotNull Long cvdNumC19HOPats) {
      putValue("cvdNumC19HOPats", cvdNumC19HOPats);
      return this;
    }
    /**
     * numc19hopats - HOSPITAL ONSET: Patients hospitalized in an NHSN inpatient care location with onset of suspected or confirmed COVID-19 14 or more days after hospitalization.
     */
    @NotNull public Builder cvdNumC19HOPats(@NotNull Float cvdNumC19HOPats) {
      putValue("cvdNumC19HOPats", cvdNumC19HOPats);
      return this;
    }
    /**
     * numc19hopats - HOSPITAL ONSET: Patients hospitalized in an NHSN inpatient care location with onset of suspected or confirmed COVID-19 14 or more days after hospitalization.
     */
    @NotNull public Builder cvdNumC19HOPats(@NotNull Double cvdNumC19HOPats) {
      putValue("cvdNumC19HOPats", cvdNumC19HOPats);
      return this;
    }
    /**
     * numc19hopats - HOSPITAL ONSET: Patients hospitalized in an NHSN inpatient care location with onset of suspected or confirmed COVID-19 14 or more days after hospitalization.
     */
    @NotNull public Builder cvdNumC19HOPats(@NotNull String cvdNumC19HOPats) {
      putValue("cvdNumC19HOPats", cvdNumC19HOPats);
      return this;
    }
    /**
     * numventuse - MECHANICAL VENTILATORS IN USE: Total number of ventilators in use.
     */
    @NotNull public Builder cvdNumVentUse(@NotNull Integer integer) {
      putValue("cvdNumVentUse", integer);
      return this;
    }
    /**
     * numventuse - MECHANICAL VENTILATORS IN USE: Total number of ventilators in use.
     */
    @NotNull public Builder cvdNumVentUse(@NotNull Long cvdNumVentUse) {
      putValue("cvdNumVentUse", cvdNumVentUse);
      return this;
    }
    /**
     * numventuse - MECHANICAL VENTILATORS IN USE: Total number of ventilators in use.
     */
    @NotNull public Builder cvdNumVentUse(@NotNull Float cvdNumVentUse) {
      putValue("cvdNumVentUse", cvdNumVentUse);
      return this;
    }
    /**
     * numventuse - MECHANICAL VENTILATORS IN USE: Total number of ventilators in use.
     */
    @NotNull public Builder cvdNumVentUse(@NotNull Double cvdNumVentUse) {
      putValue("cvdNumVentUse", cvdNumVentUse);
      return this;
    }
    /**
     * numventuse - MECHANICAL VENTILATORS IN USE: Total number of ventilators in use.
     */
    @NotNull public Builder cvdNumVentUse(@NotNull String cvdNumVentUse) {
      putValue("cvdNumVentUse", cvdNumVentUse);
      return this;
    }
    /**
     * numc19ofmechventpats - ED/OVERFLOW and VENTILATED: Patients with suspected or confirmed COVID-19 who are in the ED or any overflow location awaiting an inpatient bed and on a mechanical ventilator.
     */
    @NotNull public Builder cvdNumC19OFMechVentPats(@NotNull Integer integer) {
      putValue("cvdNumC19OFMechVentPats", integer);
      return this;
    }
    /**
     * numc19ofmechventpats - ED/OVERFLOW and VENTILATED: Patients with suspected or confirmed COVID-19 who are in the ED or any overflow location awaiting an inpatient bed and on a mechanical ventilator.
     */
    @NotNull public Builder cvdNumC19OFMechVentPats(@NotNull Long cvdNumC19OFMechVentPats) {
      putValue("cvdNumC19OFMechVentPats", cvdNumC19OFMechVentPats);
      return this;
    }
    /**
     * numc19ofmechventpats - ED/OVERFLOW and VENTILATED: Patients with suspected or confirmed COVID-19 who are in the ED or any overflow location awaiting an inpatient bed and on a mechanical ventilator.
     */
    @NotNull public Builder cvdNumC19OFMechVentPats(@NotNull Float cvdNumC19OFMechVentPats) {
      putValue("cvdNumC19OFMechVentPats", cvdNumC19OFMechVentPats);
      return this;
    }
    /**
     * numc19ofmechventpats - ED/OVERFLOW and VENTILATED: Patients with suspected or confirmed COVID-19 who are in the ED or any overflow location awaiting an inpatient bed and on a mechanical ventilator.
     */
    @NotNull public Builder cvdNumC19OFMechVentPats(@NotNull Double cvdNumC19OFMechVentPats) {
      putValue("cvdNumC19OFMechVentPats", cvdNumC19OFMechVentPats);
      return this;
    }
    /**
     * numc19ofmechventpats - ED/OVERFLOW and VENTILATED: Patients with suspected or confirmed COVID-19 who are in the ED or any overflow location awaiting an inpatient bed and on a mechanical ventilator.
     */
    @NotNull public Builder cvdNumC19OFMechVentPats(@NotNull String cvdNumC19OFMechVentPats) {
      putValue("cvdNumC19OFMechVentPats", cvdNumC19OFMechVentPats);
      return this;
    }
    /**
     * Name of the County of the NHSN facility that this data record applies to. Use [[cvdFacilityId]] to identify the facility. To provide other details, [[healthcareReportingData]] can be used on a [[Hospital]] entry.
     */
    @NotNull public Builder cvdFacilityCounty(@NotNull String cvdFacilityCounty) {
      putValue("cvdFacilityCounty", cvdFacilityCounty);
      return this;
    }
    /**
     * numbedsocc - HOSPITAL INPATIENT BED OCCUPANCY: Total number of staffed inpatient beds that are occupied.
     */
    @NotNull public Builder cvdNumBedsOcc(@NotNull Integer integer) {
      putValue("cvdNumBedsOcc", integer);
      return this;
    }
    /**
     * numbedsocc - HOSPITAL INPATIENT BED OCCUPANCY: Total number of staffed inpatient beds that are occupied.
     */
    @NotNull public Builder cvdNumBedsOcc(@NotNull Long cvdNumBedsOcc) {
      putValue("cvdNumBedsOcc", cvdNumBedsOcc);
      return this;
    }
    /**
     * numbedsocc - HOSPITAL INPATIENT BED OCCUPANCY: Total number of staffed inpatient beds that are occupied.
     */
    @NotNull public Builder cvdNumBedsOcc(@NotNull Float cvdNumBedsOcc) {
      putValue("cvdNumBedsOcc", cvdNumBedsOcc);
      return this;
    }
    /**
     * numbedsocc - HOSPITAL INPATIENT BED OCCUPANCY: Total number of staffed inpatient beds that are occupied.
     */
    @NotNull public Builder cvdNumBedsOcc(@NotNull Double cvdNumBedsOcc) {
      putValue("cvdNumBedsOcc", cvdNumBedsOcc);
      return this;
    }
    /**
     * numbedsocc - HOSPITAL INPATIENT BED OCCUPANCY: Total number of staffed inpatient beds that are occupied.
     */
    @NotNull public Builder cvdNumBedsOcc(@NotNull String cvdNumBedsOcc) {
      putValue("cvdNumBedsOcc", cvdNumBedsOcc);
      return this;
    }
    /**
     * numtotbeds - ALL HOSPITAL BEDS: Total number of all Inpatient and outpatient beds, including all staffed,ICU, licensed, and overflow (surge) beds used for inpatients or outpatients.
     */
    @NotNull public Builder cvdNumTotBeds(@NotNull Integer integer) {
      putValue("cvdNumTotBeds", integer);
      return this;
    }
    /**
     * numtotbeds - ALL HOSPITAL BEDS: Total number of all Inpatient and outpatient beds, including all staffed,ICU, licensed, and overflow (surge) beds used for inpatients or outpatients.
     */
    @NotNull public Builder cvdNumTotBeds(@NotNull Long cvdNumTotBeds) {
      putValue("cvdNumTotBeds", cvdNumTotBeds);
      return this;
    }
    /**
     * numtotbeds - ALL HOSPITAL BEDS: Total number of all Inpatient and outpatient beds, including all staffed,ICU, licensed, and overflow (surge) beds used for inpatients or outpatients.
     */
    @NotNull public Builder cvdNumTotBeds(@NotNull Float cvdNumTotBeds) {
      putValue("cvdNumTotBeds", cvdNumTotBeds);
      return this;
    }
    /**
     * numtotbeds - ALL HOSPITAL BEDS: Total number of all Inpatient and outpatient beds, including all staffed,ICU, licensed, and overflow (surge) beds used for inpatients or outpatients.
     */
    @NotNull public Builder cvdNumTotBeds(@NotNull Double cvdNumTotBeds) {
      putValue("cvdNumTotBeds", cvdNumTotBeds);
      return this;
    }
    /**
     * numtotbeds - ALL HOSPITAL BEDS: Total number of all Inpatient and outpatient beds, including all staffed,ICU, licensed, and overflow (surge) beds used for inpatients or outpatients.
     */
    @NotNull public Builder cvdNumTotBeds(@NotNull String cvdNumTotBeds) {
      putValue("cvdNumTotBeds", cvdNumTotBeds);
      return this;
    }
    /**
     * numc19hosppats - HOSPITALIZED: Patients currently hospitalized in an inpatient care location who have suspected or confirmed COVID-19.
     */
    @NotNull public Builder cvdNumC19HospPats(@NotNull Integer integer) {
      putValue("cvdNumC19HospPats", integer);
      return this;
    }
    /**
     * numc19hosppats - HOSPITALIZED: Patients currently hospitalized in an inpatient care location who have suspected or confirmed COVID-19.
     */
    @NotNull public Builder cvdNumC19HospPats(@NotNull Long cvdNumC19HospPats) {
      putValue("cvdNumC19HospPats", cvdNumC19HospPats);
      return this;
    }
    /**
     * numc19hosppats - HOSPITALIZED: Patients currently hospitalized in an inpatient care location who have suspected or confirmed COVID-19.
     */
    @NotNull public Builder cvdNumC19HospPats(@NotNull Float cvdNumC19HospPats) {
      putValue("cvdNumC19HospPats", cvdNumC19HospPats);
      return this;
    }
    /**
     * numc19hosppats - HOSPITALIZED: Patients currently hospitalized in an inpatient care location who have suspected or confirmed COVID-19.
     */
    @NotNull public Builder cvdNumC19HospPats(@NotNull Double cvdNumC19HospPats) {
      putValue("cvdNumC19HospPats", cvdNumC19HospPats);
      return this;
    }
    /**
     * numc19hosppats - HOSPITALIZED: Patients currently hospitalized in an inpatient care location who have suspected or confirmed COVID-19.
     */
    @NotNull public Builder cvdNumC19HospPats(@NotNull String cvdNumC19HospPats) {
      putValue("cvdNumC19HospPats", cvdNumC19HospPats);
      return this;
    }
    /**
     * Identifier of the NHSN facility that this data record applies to. Use [[cvdFacilityCounty]] to indicate the county. To provide other details, [[healthcareReportingData]] can be used on a [[Hospital]] entry.
     */
    @NotNull public Builder cvdFacilityId(@NotNull String cvdFacilityId) {
      putValue("cvdFacilityId", cvdFacilityId);
      return this;
    }
    /**
     * numicubedsocc - ICU BED OCCUPANCY: Total number of staffed inpatient ICU beds that are occupied.
     */
    @NotNull public Builder cvdNumICUBedsOcc(@NotNull Integer integer) {
      putValue("cvdNumICUBedsOcc", integer);
      return this;
    }
    /**
     * numicubedsocc - ICU BED OCCUPANCY: Total number of staffed inpatient ICU beds that are occupied.
     */
    @NotNull public Builder cvdNumICUBedsOcc(@NotNull Long cvdNumICUBedsOcc) {
      putValue("cvdNumICUBedsOcc", cvdNumICUBedsOcc);
      return this;
    }
    /**
     * numicubedsocc - ICU BED OCCUPANCY: Total number of staffed inpatient ICU beds that are occupied.
     */
    @NotNull public Builder cvdNumICUBedsOcc(@NotNull Float cvdNumICUBedsOcc) {
      putValue("cvdNumICUBedsOcc", cvdNumICUBedsOcc);
      return this;
    }
    /**
     * numicubedsocc - ICU BED OCCUPANCY: Total number of staffed inpatient ICU beds that are occupied.
     */
    @NotNull public Builder cvdNumICUBedsOcc(@NotNull Double cvdNumICUBedsOcc) {
      putValue("cvdNumICUBedsOcc", cvdNumICUBedsOcc);
      return this;
    }
    /**
     * numicubedsocc - ICU BED OCCUPANCY: Total number of staffed inpatient ICU beds that are occupied.
     */
    @NotNull public Builder cvdNumICUBedsOcc(@NotNull String cvdNumICUBedsOcc) {
      putValue("cvdNumICUBedsOcc", cvdNumICUBedsOcc);
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
