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
import org.odftoolkit.odfdom.dom.attribute.table.TableTrackChangesAttribute;
import org.odftoolkit.odfdom.pkg.ElementVisitor;
import org.odftoolkit.odfdom.pkg.OdfElement;
import org.odftoolkit.odfdom.pkg.OdfFileDom;
import org.odftoolkit.odfdom.pkg.OdfName;

/** DOM implementation of OpenDocument element {@odf.element table:tracked-changes}. */
public class TableTrackedChangesElement extends OdfElement {

  public static final OdfName ELEMENT_NAME =
      OdfName.newName(OdfDocumentNamespace.TABLE, "tracked-changes");

  /**
   * Create the instance of <code>TableTrackedChangesElement</code>
   *
   * @param ownerDoc The type is <code>OdfFileDom</code>
   */
  public TableTrackedChangesElement(OdfFileDom ownerDoc) {
    super(ownerDoc, ELEMENT_NAME);
  }

  /**
   * Get the element name
   *
   * @return return <code>OdfName</code> the name of element {@odf.element table:tracked-changes}.
   */
  public OdfName getOdfName() {
    return ELEMENT_NAME;
  }

  /**
   * Receives the value of the ODFDOM attribute representation <code>TableTrackChangesAttribute
   * </code> , See {@odf.attribute table:track-changes}
   *
   * @return - the <code>Boolean</code> , the value or <code>null</code>, if the attribute is not
   *     set and no default value defined.
   */
  public Boolean getTableTrackChangesAttribute() {
    TableTrackChangesAttribute attr =
        (TableTrackChangesAttribute) getOdfAttribute(OdfDocumentNamespace.TABLE, "track-changes");
    if (attr != null && !attr.getValue().isEmpty()) {
      return attr.booleanValue();
    }
    return Boolean.valueOf(TableTrackChangesAttribute.DEFAULT_VALUE);
  }

  /**
   * Sets the value of ODFDOM attribute representation <code>TableTrackChangesAttribute</code> , See
   * {@odf.attribute table:track-changes}
   *
   * @param tableTrackChangesValue The type is <code>Boolean</code>
   */
  public void setTableTrackChangesAttribute(Boolean tableTrackChangesValue) {
    TableTrackChangesAttribute attr =
        new TableTrackChangesAttribute((OdfFileDom) this.ownerDocument);
    setOdfAttribute(attr);
    attr.setBooleanValue(tableTrackChangesValue);
  }

  /**
   * Create child element {@odf.element table:cell-content-change}.
   *
   * @param tableIdValue the <code>String</code> value of <code>TableIdAttribute</code>, see
   *     {@odf.attribute table:id} at specification
   * @return the element {@odf.element table:cell-content-change}
   */
  public TableCellContentChangeElement newTableCellContentChangeElement(String tableIdValue) {
    TableCellContentChangeElement tableCellContentChange =
        ((OdfFileDom) this.ownerDocument).newOdfElement(TableCellContentChangeElement.class);
    tableCellContentChange.setTableIdAttribute(tableIdValue);
    this.appendChild(tableCellContentChange);
    return tableCellContentChange;
  }

  /**
   * Create child element {@odf.element table:deletion}.
   *
   * @param tableIdValue the <code>String</code> value of <code>TableIdAttribute</code>, see
   *     {@odf.attribute table:id} at specification
   * @param tablePositionValue the <code>Integer</code> value of <code>TablePositionAttribute</code>
   *     , see {@odf.attribute table:position} at specification
   * @param tableTypeValue the <code>String</code> value of <code>TableTypeAttribute</code>, see
   *     {@odf.attribute table:type} at specification
   * @return the element {@odf.element table:deletion}
   */
  public TableDeletionElement newTableDeletionElement(
      String tableIdValue, int tablePositionValue, String tableTypeValue) {
    TableDeletionElement tableDeletion =
        ((OdfFileDom) this.ownerDocument).newOdfElement(TableDeletionElement.class);
    tableDeletion.setTableIdAttribute(tableIdValue);
    tableDeletion.setTablePositionAttribute(tablePositionValue);
    tableDeletion.setTableTypeAttribute(tableTypeValue);
    this.appendChild(tableDeletion);
    return tableDeletion;
  }

  /**
   * Create child element {@odf.element table:insertion}.
   *
   * @param tableIdValue the <code>String</code> value of <code>TableIdAttribute</code>, see
   *     {@odf.attribute table:id} at specification
   * @param tablePositionValue the <code>Integer</code> value of <code>TablePositionAttribute</code>
   *     , see {@odf.attribute table:position} at specification
   * @param tableTypeValue the <code>String</code> value of <code>TableTypeAttribute</code>, see
   *     {@odf.attribute table:type} at specification
   * @return the element {@odf.element table:insertion}
   */
  public TableInsertionElement newTableInsertionElement(
      String tableIdValue, int tablePositionValue, String tableTypeValue) {
    TableInsertionElement tableInsertion =
        ((OdfFileDom) this.ownerDocument).newOdfElement(TableInsertionElement.class);
    tableInsertion.setTableIdAttribute(tableIdValue);
    tableInsertion.setTablePositionAttribute(tablePositionValue);
    tableInsertion.setTableTypeAttribute(tableTypeValue);
    this.appendChild(tableInsertion);
    return tableInsertion;
  }

  /**
   * Create child element {@odf.element table:movement}.
   *
   * @param tableIdValue the <code>String</code> value of <code>TableIdAttribute</code>, see
   *     {@odf.attribute table:id} at specification
   * @return the element {@odf.element table:movement}
   */
  public TableMovementElement newTableMovementElement(String tableIdValue) {
    TableMovementElement tableMovement =
        ((OdfFileDom) this.ownerDocument).newOdfElement(TableMovementElement.class);
    tableMovement.setTableIdAttribute(tableIdValue);
    this.appendChild(tableMovement);
    return tableMovement;
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
