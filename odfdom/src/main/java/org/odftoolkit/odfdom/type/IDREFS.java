/**
 * **********************************************************************
 *
 * <p>DO NOT ALTER OR REMOVE COPYRIGHT NOTICES OR THIS FILE HEADER
 *
 * <p>Copyright 2008, 2010 Oracle and/or its affiliates. All rights reserved.
 *
 * <p>Use is subject to license terms.
 *
 * <p>Licensed under the Apache License, Version 2.0 (the "License"); you may not use this file
 * except in compliance with the License. You may obtain a copy of the License at
 * http://www.apache.org/licenses/LICENSE-2.0. You can also obtain a copy of the License at
 * http://odftoolkit.org/docs/license.txt
 *
 * <p>Unless required by applicable law or agreed to in writing, software distributed under the
 * License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either
 * express or implied.
 *
 * <p>See the License for the specific language governing permissions and limitations under the
 * License.
 *
 * <p>**********************************************************************
 */
package org.odftoolkit.odfdom.type;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

/** This class represents the in OpenDocument format used data type {@odf.datatype IDREFS} */
public class IDREFS implements OdfDataType {

  private String mIdRefs;

  /**
   * Construct IDREFS by the parsing the given IDREF list
   *
   * @param idRefList The String to be parsed into IDREFS
   * @throws IllegalArgumentException if the given argument is not a valid IDREFS
   */
  public IDREFS(List<IDREF> idRefList) throws IllegalArgumentException {
    if ((idRefList == null) || (idRefList.size() == 0)) {
      throw new IllegalArgumentException("parameter can not be null for IDREFS");
    }
    mIdRefs = idRefList.stream().map(IDREF::toString).collect(Collectors.joining(" "));
  }

  /**
   * Returns a String Object representing this IDREFS's value
   *
   * @return return a string representation of the value of this IDREFS object
   */
  @Override
  public String toString() {
    return mIdRefs;
  }

  /**
   * Returns an IDREFS instance representing the specified String value
   *
   * @param stringValue a String value
   * @return return an IDREFS instance representing stringValue
   * @throws IllegalArgumentException if the given argument is not a valid IDREFS
   */
  public static IDREFS valueOf(String stringValue) throws IllegalArgumentException {
    if ((stringValue == null) || (stringValue.length() == 0)) {
      throw new IllegalArgumentException("parameter is invalid for datatype IDREFS");
    }

    List<IDREF> aRet = new ArrayList<>();
    String[] names = stringValue.split(" ");
    for (String name : names) {
      aRet.add(new IDREF(name));
    }
    return new IDREFS(aRet);
  }

  /**
   * Returns a list of IDREF from the IDREFS Object
   *
   * @return a list of IDREF
   */
  public List<IDREF> getIDREFList() {
    List<IDREF> aRet = new ArrayList<>();
    String[] names = mIdRefs.split(" ");
    for (String name : names) {
      aRet.add(new IDREF(name));
    }
    return aRet;
  }

  /**
   * check if the specified String instance is a valid {@odf.datatype IDREFS} data type
   *
   * @param stringValue the value to be tested
   * @return true if the value of argument is valid for {@odf.datatype IDREFS} data type false
   *     otherwise
   */
  public static boolean isValid(String stringValue) {
    if (stringValue == null) {
      return false;
    }
    if (stringValue.length() == 0) {
      return false;
    }

    String[] names = stringValue.split(" ");
    for (String name : names) {
      if (!IDREF.isValid(name)) {
        return false;
      }
    }
    return true;
  }
}
