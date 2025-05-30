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

/*
 * This file is automatically generated.
 * Don't edit manually.
 */
package org.odftoolkit.odfdom.dom.element.table;

import org.odftoolkit.odfdom.dom.DefaultElementVisitor;
import org.odftoolkit.odfdom.dom.OdfDocumentNamespace;
import org.odftoolkit.odfdom.dom.attribute.table.TableFieldNumberAttribute;
import org.odftoolkit.odfdom.dom.attribute.table.TableFunctionAttribute;
import org.odftoolkit.odfdom.pkg.ElementVisitor;
import org.odftoolkit.odfdom.pkg.OdfElement;
import org.odftoolkit.odfdom.pkg.OdfFileDom;
import org.odftoolkit.odfdom.pkg.OdfName;

/** DOM implementation of OpenDocument element {@odf.element table:subtotal-field}. */
public class TableSubtotalFieldElement extends OdfElement {

  public static final OdfName ELEMENT_NAME =
      OdfName.newName(OdfDocumentNamespace.TABLE, "subtotal-field");

  /**
   * Create the instance of <code>TableSubtotalFieldElement</code>
   *
   * @param ownerDoc The type is <code>OdfFileDom</code>
   */
  public TableSubtotalFieldElement(OdfFileDom ownerDoc) {
    super(ownerDoc, ELEMENT_NAME);
  }

  /**
   * Get the element name
   *
   * @return return <code>OdfName</code> the name of element {@odf.element table:subtotal-field}.
   */
  public OdfName getOdfName() {
    return ELEMENT_NAME;
  }

  /**
   * Receives the value of the ODFDOM attribute representation <code>TableFieldNumberAttribute
   * </code> , See {@odf.attribute table:field-number}
   *
   * <p>Attribute is mandatory.
   *
   * @return - the <code>Integer</code> , the value or <code>null</code>, if the attribute is not
   *     set and no default value defined.
   */
  public Integer getTableFieldNumberAttribute() {
    TableFieldNumberAttribute attr =
        (TableFieldNumberAttribute) getOdfAttribute(OdfDocumentNamespace.TABLE, "field-number");
    if (attr != null && !attr.getValue().isEmpty()) {
      return attr.intValue();
    }
    return null;
  }

  /**
   * Sets the value of ODFDOM attribute representation <code>TableFieldNumberAttribute</code> , See
   * {@odf.attribute table:field-number}
   *
   * @param tableFieldNumberValue The type is <code>Integer</code>
   */
  public void setTableFieldNumberAttribute(Integer tableFieldNumberValue) {
    TableFieldNumberAttribute attr = new TableFieldNumberAttribute((OdfFileDom) this.ownerDocument);
    setOdfAttribute(attr);
    attr.setIntValue(tableFieldNumberValue);
  }

  /**
   * Receives the value of the ODFDOM attribute representation <code>TableFunctionAttribute</code> ,
   * See {@odf.attribute table:function}
   *
   * <p>Attribute is mandatory.
   *
   * @return - the <code>String</code> , the value or <code>null</code>, if the attribute is not set
   *     and no default value defined.
   */
  public String getTableFunctionAttribute() {
    TableFunctionAttribute attr =
        (TableFunctionAttribute) getOdfAttribute(OdfDocumentNamespace.TABLE, "function");
    if (attr != null) {
      return String.valueOf(attr.getValue());
    }
    return null;
  }

  /**
   * Sets the value of ODFDOM attribute representation <code>TableFunctionAttribute</code> , See
   * {@odf.attribute table:function}
   *
   * @param tableFunctionValue The type is <code>String</code>
   */
  public void setTableFunctionAttribute(String tableFunctionValue) {
    TableFunctionAttribute attr = new TableFunctionAttribute((OdfFileDom) this.ownerDocument);
    setOdfAttribute(attr);
    attr.setValue(tableFunctionValue);
  }

  /**
   * Accept an visitor instance to allow the visitor to do some operations. Refer to visitor design
   * pattern to get a better understanding.
   *
   * @param visitor an instance of DefaultElementVisitor
   */
  @Override
  public void accept(ElementVisitor visitor) {
    if (visitor instanceof DefaultElementVisitor) {
      DefaultElementVisitor defaultVisitor = (DefaultElementVisitor) visitor;
      defaultVisitor.visit(this);
    } else {
      visitor.visit(this);
    }
  }
}
