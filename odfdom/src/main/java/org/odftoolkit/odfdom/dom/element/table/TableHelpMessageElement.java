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
import org.odftoolkit.odfdom.dom.attribute.table.TableDisplayAttribute;
import org.odftoolkit.odfdom.dom.attribute.table.TableTitleAttribute;
import org.odftoolkit.odfdom.dom.element.text.TextPElement;
import org.odftoolkit.odfdom.pkg.ElementVisitor;
import org.odftoolkit.odfdom.pkg.OdfElement;
import org.odftoolkit.odfdom.pkg.OdfFileDom;
import org.odftoolkit.odfdom.pkg.OdfName;

/** DOM implementation of OpenDocument element {@odf.element table:help-message}. */
public class TableHelpMessageElement extends OdfElement {

  public static final OdfName ELEMENT_NAME =
      OdfName.newName(OdfDocumentNamespace.TABLE, "help-message");

  /**
   * Create the instance of <code>TableHelpMessageElement</code>
   *
   * @param ownerDoc The type is <code>OdfFileDom</code>
   */
  public TableHelpMessageElement(OdfFileDom ownerDoc) {
    super(ownerDoc, ELEMENT_NAME);
  }

  /**
   * Get the element name
   *
   * @return return <code>OdfName</code> the name of element {@odf.element table:help-message}.
   */
  public OdfName getOdfName() {
    return ELEMENT_NAME;
  }

  /**
   * Receives the value of the ODFDOM attribute representation <code>TableDisplayAttribute</code> ,
   * See {@odf.attribute table:display}
   *
   * @return - the <code>Boolean</code> , the value or <code>null</code>, if the attribute is not
   *     set and no default value defined.
   */
  public Boolean getTableDisplayAttribute() {
    TableDisplayAttribute attr =
        (TableDisplayAttribute) getOdfAttribute(OdfDocumentNamespace.TABLE, "display");
    if (attr != null && !attr.getValue().isEmpty()) {
      return attr.booleanValue();
    }
    return Boolean.valueOf(TableDisplayAttribute.DEFAULT_VALUE_FALSE);
  }

  /**
   * Sets the value of ODFDOM attribute representation <code>TableDisplayAttribute</code> , See
   * {@odf.attribute table:display}
   *
   * @param tableDisplayValue The type is <code>Boolean</code>
   */
  public void setTableDisplayAttribute(Boolean tableDisplayValue) {
    TableDisplayAttribute attr = new TableDisplayAttribute((OdfFileDom) this.ownerDocument);
    setOdfAttribute(attr);
    attr.setBooleanValue(tableDisplayValue);
  }

  /**
   * Receives the value of the ODFDOM attribute representation <code>TableTitleAttribute</code> ,
   * See {@odf.attribute table:title}
   *
   * @return - the <code>String</code> , the value or <code>null</code>, if the attribute is not set
   *     and no default value defined.
   */
  public String getTableTitleAttribute() {
    TableTitleAttribute attr =
        (TableTitleAttribute) getOdfAttribute(OdfDocumentNamespace.TABLE, "title");
    if (attr != null) {
      return String.valueOf(attr.getValue());
    }
    return null;
  }

  /**
   * Sets the value of ODFDOM attribute representation <code>TableTitleAttribute</code> , See
   * {@odf.attribute table:title}
   *
   * @param tableTitleValue The type is <code>String</code>
   */
  public void setTableTitleAttribute(String tableTitleValue) {
    TableTitleAttribute attr = new TableTitleAttribute((OdfFileDom) this.ownerDocument);
    setOdfAttribute(attr);
    attr.setValue(tableTitleValue);
  }

  /**
   * Create child element {@odf.element text:p}.
   *
   * @return the element {@odf.element text:p}
   */
  public TextPElement newTextPElement() {
    TextPElement textP = ((OdfFileDom) this.ownerDocument).newOdfElement(TextPElement.class);
    this.appendChild(textP);
    return textP;
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
