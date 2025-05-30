/**
 * **********************************************************************
 *
 * <p>Licensed to the Apache Software Foundation (ASF) under one or more contributor license
 * agreements. See the NOTICE file distributed with this work for additional information regarding
 * copyright ownership. The ASF licenses this file to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance with the License. You may obtain a
 * copy of the License at
 *
 * <p>http://www.apache.org/licenses/LICENSE-2.0
 *
 * <p>Unless required by applicable law or agreed to in writing, software distributed under the
 * License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either
 * express or implied. See the License for the specific language governing permissions and
 * limitations under the License.
 *
 * <p>**********************************************************************
 */
package org.odftoolkit.odfdom.type;

import java.util.logging.Level;
import java.util.logging.Logger;
import javax.xml.datatype.DatatypeFactory;
import javax.xml.datatype.XMLGregorianCalendar;

/**
 * This class represents the in OpenDocument format used data type {@odf.datatype timeOrDateTime}
 */
public class TimeOrDateTime implements OdfDataType {

  private static final Logger LOG = Logger.getLogger(TimeOrDateTime.class.getName());
  private XMLGregorianCalendar mTimeOrDateTime;

  /**
   * Construct an newly TimeOrDateTime object that represents the specified XMLGregorianCalendar
   * value
   *
   * @param timeOrDateTime the value to be represented by the TimeOrDateTime Object
   * @throws IllegalArgumentException if the given argument is not a valid TimeOrDateTime
   */
  public TimeOrDateTime(XMLGregorianCalendar timeOrDateTime) throws IllegalArgumentException {
    if (TimeOrDateTime.isValid(timeOrDateTime)) {
      mTimeOrDateTime = timeOrDateTime;
    } else {
      throw new IllegalArgumentException("parameter is invalid for datatype TimeorDateTime");
    }
  }

  /**
   * Returns a String Object representing this TimeOrDateTime value
   *
   * @return return a string representation of the value of this TimeOrDateTime object
   */
  @Override
  public String toString() {
    return mTimeOrDateTime.toXMLFormat();
  }

  /**
   * Returns a TimeOrDateTime instance representing the specified String value
   *
   * @param stringValue a String value
   * @return return a TimeOrDateTime instance representing stringValue
   * @throws IllegalArgumentException if the given argument is not a valid TimeOrDateTime
   */
  public static TimeOrDateTime valueOf(String stringValue) throws IllegalArgumentException {
    try {
      DatatypeFactory aFactory = new org.apache.xerces.jaxp.datatype.DatatypeFactoryImpl();
      return new TimeOrDateTime(aFactory.newXMLGregorianCalendar(stringValue));
    } catch (IllegalArgumentException ex) {
      LOG.log(Level.SEVERE, "parameter is invalid for datatype TimeOrDateTime", ex);
      throw new IllegalArgumentException("parameter is invalid for datatype TimeOrDateTime");
    }
  }

  /**
   * Returns the value of this TimeOrDateTime object as an XMLGregorianCalendar
   *
   * @return the XMLGregorianCalendar value of this TimeOrDateTime object.
   */
  public XMLGregorianCalendar getXMLGregorianCalendar() {
    return mTimeOrDateTime;
  }

  /**
   * check if the specified XMLGregorianCalendar instance is a valid {@odf.datatype timeOrDateTime}
   * data type
   *
   * @param timeOrDateTime the value to be tested
   * @return true if the value of argument is valid for {@odf.datatype timeOrDateTime} data type
   *     false otherwise
   */
  public static boolean isValid(XMLGregorianCalendar timeOrDateTime) {
    return (Time.isValid(timeOrDateTime) || DateTime.isValid(timeOrDateTime));
  }
}
