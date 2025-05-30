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
package org.odftoolkit.odfdom.dom.element.db;

import org.odftoolkit.odfdom.dom.DefaultElementVisitor;
import org.odftoolkit.odfdom.dom.OdfDocumentNamespace;
import org.odftoolkit.odfdom.dom.attribute.db.DbDefaultCellStyleNameAttribute;
import org.odftoolkit.odfdom.dom.attribute.db.DbDescriptionAttribute;
import org.odftoolkit.odfdom.dom.attribute.db.DbNameAttribute;
import org.odftoolkit.odfdom.dom.attribute.db.DbStyleNameAttribute;
import org.odftoolkit.odfdom.dom.attribute.db.DbTitleAttribute;
import org.odftoolkit.odfdom.dom.attribute.db.DbVisibleAttribute;
import org.odftoolkit.odfdom.dom.attribute.office.OfficeBooleanValueAttribute;
import org.odftoolkit.odfdom.dom.attribute.office.OfficeCurrencyAttribute;
import org.odftoolkit.odfdom.dom.attribute.office.OfficeDateValueAttribute;
import org.odftoolkit.odfdom.dom.attribute.office.OfficeStringValueAttribute;
import org.odftoolkit.odfdom.dom.attribute.office.OfficeTimeValueAttribute;
import org.odftoolkit.odfdom.dom.attribute.office.OfficeValueAttribute;
import org.odftoolkit.odfdom.dom.attribute.office.OfficeValueTypeAttribute;
import org.odftoolkit.odfdom.pkg.ElementVisitor;
import org.odftoolkit.odfdom.pkg.OdfElement;
import org.odftoolkit.odfdom.pkg.OdfFileDom;
import org.odftoolkit.odfdom.pkg.OdfName;

/** DOM implementation of OpenDocument element {@odf.element db:column}. */
public class DbColumnElement extends OdfElement {

  public static final OdfName ELEMENT_NAME = OdfName.newName(OdfDocumentNamespace.DB, "column");

  /**
   * Create the instance of <code>DbColumnElement</code>
   *
   * @param ownerDoc The type is <code>OdfFileDom</code>
   */
  public DbColumnElement(OdfFileDom ownerDoc) {
    super(ownerDoc, ELEMENT_NAME);
  }

  /**
   * Get the element name
   *
   * @return return <code>OdfName</code> the name of element {@odf.element db:column}.
   */
  public OdfName getOdfName() {
    return ELEMENT_NAME;
  }

  /**
   * Receives the value of the ODFDOM attribute representation <code>DbDefaultCellStyleNameAttribute
   * </code> , See {@odf.attribute db:default-cell-style-name}
   *
   * @return - the <code>String</code> , the value or <code>null</code>, if the attribute is not set
   *     and no default value defined.
   */
  public String getDbDefaultCellStyleNameAttribute() {
    DbDefaultCellStyleNameAttribute attr =
        (DbDefaultCellStyleNameAttribute)
            getOdfAttribute(OdfDocumentNamespace.DB, "default-cell-style-name");
    if (attr != null) {
      return String.valueOf(attr.getValue());
    }
    return null;
  }

  /**
   * Sets the value of ODFDOM attribute representation <code>DbDefaultCellStyleNameAttribute</code>
   * , See {@odf.attribute db:default-cell-style-name}
   *
   * @param dbDefaultCellStyleNameValue The type is <code>String</code>
   */
  public void setDbDefaultCellStyleNameAttribute(String dbDefaultCellStyleNameValue) {
    DbDefaultCellStyleNameAttribute attr =
        new DbDefaultCellStyleNameAttribute((OdfFileDom) this.ownerDocument);
    setOdfAttribute(attr);
    attr.setValue(dbDefaultCellStyleNameValue);
  }

  /**
   * Receives the value of the ODFDOM attribute representation <code>DbDescriptionAttribute</code> ,
   * See {@odf.attribute db:description}
   *
   * @return - the <code>String</code> , the value or <code>null</code>, if the attribute is not set
   *     and no default value defined.
   */
  public String getDbDescriptionAttribute() {
    DbDescriptionAttribute attr =
        (DbDescriptionAttribute) getOdfAttribute(OdfDocumentNamespace.DB, "description");
    if (attr != null) {
      return String.valueOf(attr.getValue());
    }
    return null;
  }

  /**
   * Sets the value of ODFDOM attribute representation <code>DbDescriptionAttribute</code> , See
   * {@odf.attribute db:description}
   *
   * @param dbDescriptionValue The type is <code>String</code>
   */
  public void setDbDescriptionAttribute(String dbDescriptionValue) {
    DbDescriptionAttribute attr = new DbDescriptionAttribute((OdfFileDom) this.ownerDocument);
    setOdfAttribute(attr);
    attr.setValue(dbDescriptionValue);
  }

  /**
   * Receives the value of the ODFDOM attribute representation <code>DbNameAttribute</code> , See
   * {@odf.attribute db:name}
   *
   * <p>Attribute is mandatory.
   *
   * @return - the <code>String</code> , the value or <code>null</code>, if the attribute is not set
   *     and no default value defined.
   */
  public String getDbNameAttribute() {
    DbNameAttribute attr = (DbNameAttribute) getOdfAttribute(OdfDocumentNamespace.DB, "name");
    if (attr != null) {
      return String.valueOf(attr.getValue());
    }
    return null;
  }

  /**
   * Sets the value of ODFDOM attribute representation <code>DbNameAttribute</code> , See
   * {@odf.attribute db:name}
   *
   * @param dbNameValue The type is <code>String</code>
   */
  public void setDbNameAttribute(String dbNameValue) {
    DbNameAttribute attr = new DbNameAttribute((OdfFileDom) this.ownerDocument);
    setOdfAttribute(attr);
    attr.setValue(dbNameValue);
  }

  /**
   * Receives the value of the ODFDOM attribute representation <code>DbStyleNameAttribute</code> ,
   * See {@odf.attribute db:style-name}
   *
   * @return - the <code>String</code> , the value or <code>null</code>, if the attribute is not set
   *     and no default value defined.
   */
  public String getDbStyleNameAttribute() {
    DbStyleNameAttribute attr =
        (DbStyleNameAttribute) getOdfAttribute(OdfDocumentNamespace.DB, "style-name");
    if (attr != null) {
      return String.valueOf(attr.getValue());
    }
    return null;
  }

  /**
   * Sets the value of ODFDOM attribute representation <code>DbStyleNameAttribute</code> , See
   * {@odf.attribute db:style-name}
   *
   * @param dbStyleNameValue The type is <code>String</code>
   */
  public void setDbStyleNameAttribute(String dbStyleNameValue) {
    DbStyleNameAttribute attr = new DbStyleNameAttribute((OdfFileDom) this.ownerDocument);
    setOdfAttribute(attr);
    attr.setValue(dbStyleNameValue);
  }

  /**
   * Receives the value of the ODFDOM attribute representation <code>DbTitleAttribute</code> , See
   * {@odf.attribute db:title}
   *
   * @return - the <code>String</code> , the value or <code>null</code>, if the attribute is not set
   *     and no default value defined.
   */
  public String getDbTitleAttribute() {
    DbTitleAttribute attr = (DbTitleAttribute) getOdfAttribute(OdfDocumentNamespace.DB, "title");
    if (attr != null) {
      return String.valueOf(attr.getValue());
    }
    return null;
  }

  /**
   * Sets the value of ODFDOM attribute representation <code>DbTitleAttribute</code> , See
   * {@odf.attribute db:title}
   *
   * @param dbTitleValue The type is <code>String</code>
   */
  public void setDbTitleAttribute(String dbTitleValue) {
    DbTitleAttribute attr = new DbTitleAttribute((OdfFileDom) this.ownerDocument);
    setOdfAttribute(attr);
    attr.setValue(dbTitleValue);
  }

  /**
   * Receives the value of the ODFDOM attribute representation <code>DbVisibleAttribute</code> , See
   * {@odf.attribute db:visible}
   *
   * @return - the <code>Boolean</code> , the value or <code>null</code>, if the attribute is not
   *     set and no default value defined.
   */
  public Boolean getDbVisibleAttribute() {
    DbVisibleAttribute attr =
        (DbVisibleAttribute) getOdfAttribute(OdfDocumentNamespace.DB, "visible");
    if (attr != null && !attr.getValue().isEmpty()) {
      return attr.booleanValue();
    }
    return Boolean.valueOf(DbVisibleAttribute.DEFAULT_VALUE);
  }

  /**
   * Sets the value of ODFDOM attribute representation <code>DbVisibleAttribute</code> , See
   * {@odf.attribute db:visible}
   *
   * @param dbVisibleValue The type is <code>Boolean</code>
   */
  public void setDbVisibleAttribute(Boolean dbVisibleValue) {
    DbVisibleAttribute attr = new DbVisibleAttribute((OdfFileDom) this.ownerDocument);
    setOdfAttribute(attr);
    attr.setBooleanValue(dbVisibleValue);
  }

  /**
   * Receives the value of the ODFDOM attribute representation <code>OfficeBooleanValueAttribute
   * </code> , See {@odf.attribute office:boolean-value}
   *
   * @return - the <code>Boolean</code> , the value or <code>null</code>, if the attribute is not
   *     set and no default value defined.
   */
  public Boolean getOfficeBooleanValueAttribute() {
    OfficeBooleanValueAttribute attr =
        (OfficeBooleanValueAttribute) getOdfAttribute(OdfDocumentNamespace.OFFICE, "boolean-value");
    if (attr != null && !attr.getValue().isEmpty()) {
      return attr.booleanValue();
    }
    return null;
  }

  /**
   * Sets the value of ODFDOM attribute representation <code>OfficeBooleanValueAttribute</code> ,
   * See {@odf.attribute office:boolean-value}
   *
   * @param officeBooleanValueValue The type is <code>Boolean</code>
   */
  public void setOfficeBooleanValueAttribute(Boolean officeBooleanValueValue) {
    OfficeBooleanValueAttribute attr =
        new OfficeBooleanValueAttribute((OdfFileDom) this.ownerDocument);
    setOdfAttribute(attr);
    attr.setBooleanValue(officeBooleanValueValue);
  }

  /**
   * Receives the value of the ODFDOM attribute representation <code>OfficeCurrencyAttribute</code>
   * , See {@odf.attribute office:currency}
   *
   * @return - the <code>String</code> , the value or <code>null</code>, if the attribute is not set
   *     and no default value defined.
   */
  public String getOfficeCurrencyAttribute() {
    OfficeCurrencyAttribute attr =
        (OfficeCurrencyAttribute) getOdfAttribute(OdfDocumentNamespace.OFFICE, "currency");
    if (attr != null) {
      return String.valueOf(attr.getValue());
    }
    return null;
  }

  /**
   * Sets the value of ODFDOM attribute representation <code>OfficeCurrencyAttribute</code> , See
   * {@odf.attribute office:currency}
   *
   * @param officeCurrencyValue The type is <code>String</code>
   */
  public void setOfficeCurrencyAttribute(String officeCurrencyValue) {
    OfficeCurrencyAttribute attr = new OfficeCurrencyAttribute((OdfFileDom) this.ownerDocument);
    setOdfAttribute(attr);
    attr.setValue(officeCurrencyValue);
  }

  /**
   * Receives the value of the ODFDOM attribute representation <code>OfficeDateValueAttribute</code>
   * , See {@odf.attribute office:date-value}
   *
   * @return - the <code>String</code> , the value or <code>null</code>, if the attribute is not set
   *     and no default value defined.
   */
  public String getOfficeDateValueAttribute() {
    OfficeDateValueAttribute attr =
        (OfficeDateValueAttribute) getOdfAttribute(OdfDocumentNamespace.OFFICE, "date-value");
    if (attr != null) {
      return String.valueOf(attr.getValue());
    }
    return null;
  }

  /**
   * Sets the value of ODFDOM attribute representation <code>OfficeDateValueAttribute</code> , See
   * {@odf.attribute office:date-value}
   *
   * @param officeDateValueValue The type is <code>String</code>
   */
  public void setOfficeDateValueAttribute(String officeDateValueValue) {
    OfficeDateValueAttribute attr = new OfficeDateValueAttribute((OdfFileDom) this.ownerDocument);
    setOdfAttribute(attr);
    attr.setValue(officeDateValueValue);
  }

  /**
   * Receives the value of the ODFDOM attribute representation <code>OfficeStringValueAttribute
   * </code> , See {@odf.attribute office:string-value}
   *
   * @return - the <code>String</code> , the value or <code>null</code>, if the attribute is not set
   *     and no default value defined.
   */
  public String getOfficeStringValueAttribute() {
    OfficeStringValueAttribute attr =
        (OfficeStringValueAttribute) getOdfAttribute(OdfDocumentNamespace.OFFICE, "string-value");
    if (attr != null) {
      return String.valueOf(attr.getValue());
    }
    return null;
  }

  /**
   * Sets the value of ODFDOM attribute representation <code>OfficeStringValueAttribute</code> , See
   * {@odf.attribute office:string-value}
   *
   * @param officeStringValueValue The type is <code>String</code>
   */
  public void setOfficeStringValueAttribute(String officeStringValueValue) {
    OfficeStringValueAttribute attr =
        new OfficeStringValueAttribute((OdfFileDom) this.ownerDocument);
    setOdfAttribute(attr);
    attr.setValue(officeStringValueValue);
  }

  /**
   * Receives the value of the ODFDOM attribute representation <code>OfficeTimeValueAttribute</code>
   * , See {@odf.attribute office:time-value}
   *
   * @return - the <code>String</code> , the value or <code>null</code>, if the attribute is not set
   *     and no default value defined.
   */
  public String getOfficeTimeValueAttribute() {
    OfficeTimeValueAttribute attr =
        (OfficeTimeValueAttribute) getOdfAttribute(OdfDocumentNamespace.OFFICE, "time-value");
    if (attr != null) {
      return String.valueOf(attr.getValue());
    }
    return null;
  }

  /**
   * Sets the value of ODFDOM attribute representation <code>OfficeTimeValueAttribute</code> , See
   * {@odf.attribute office:time-value}
   *
   * @param officeTimeValueValue The type is <code>String</code>
   */
  public void setOfficeTimeValueAttribute(String officeTimeValueValue) {
    OfficeTimeValueAttribute attr = new OfficeTimeValueAttribute((OdfFileDom) this.ownerDocument);
    setOdfAttribute(attr);
    attr.setValue(officeTimeValueValue);
  }

  /**
   * Receives the value of the ODFDOM attribute representation <code>OfficeValueAttribute</code> ,
   * See {@odf.attribute office:value}
   *
   * <p>Attribute is mandatory.
   *
   * @return - the <code>Double</code> , the value or <code>null</code>, if the attribute is not set
   *     and no default value defined.
   */
  public Double getOfficeValueAttribute() {
    OfficeValueAttribute attr =
        (OfficeValueAttribute) getOdfAttribute(OdfDocumentNamespace.OFFICE, "value");
    if (attr != null && !attr.getValue().isEmpty()) {
      return attr.doubleValue();
    }
    return null;
  }

  /**
   * Sets the value of ODFDOM attribute representation <code>OfficeValueAttribute</code> , See
   * {@odf.attribute office:value}
   *
   * @param officeValueValue The type is <code>Double</code>
   */
  public void setOfficeValueAttribute(Double officeValueValue) {
    OfficeValueAttribute attr = new OfficeValueAttribute((OdfFileDom) this.ownerDocument);
    setOdfAttribute(attr);
    attr.setDoubleValue(officeValueValue);
  }

  /**
   * Receives the value of the ODFDOM attribute representation <code>OfficeValueTypeAttribute</code>
   * , See {@odf.attribute office:value-type}
   *
   * <p>Attribute is mandatory.
   *
   * @return - the <code>String</code> , the value or <code>null</code>, if the attribute is not set
   *     and no default value defined.
   */
  public String getOfficeValueTypeAttribute() {
    OfficeValueTypeAttribute attr =
        (OfficeValueTypeAttribute) getOdfAttribute(OdfDocumentNamespace.OFFICE, "value-type");
    if (attr != null) {
      return String.valueOf(attr.getValue());
    }
    return null;
  }

  /**
   * Sets the value of ODFDOM attribute representation <code>OfficeValueTypeAttribute</code> , See
   * {@odf.attribute office:value-type}
   *
   * @param officeValueTypeValue The type is <code>String</code>
   */
  public void setOfficeValueTypeAttribute(String officeValueTypeValue) {
    OfficeValueTypeAttribute attr = new OfficeValueTypeAttribute((OdfFileDom) this.ownerDocument);
    setOdfAttribute(attr);
    attr.setValue(officeValueTypeValue);
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

  /** Removes all the content from the element */
  @Override
  public void removeContent() {
    super.removeContent();
    this.removeAttributeNS(OdfDocumentNamespace.OFFICE.getUri(), "value");
    this.removeAttributeNS(OdfDocumentNamespace.OFFICE.getUri(), "value-type");
    this.removeAttributeNS(OdfDocumentNamespace.OFFICE.getUri(), "time-value");
    this.removeAttributeNS(OdfDocumentNamespace.OFFICE.getUri(), "date-value");
    this.removeAttributeNS(OdfDocumentNamespace.OFFICE.getUri(), "boolean-value");
    this.removeAttributeNS(
        "urn:org:documentfoundation:names:experimental:calc:xmlns:calcext:1.0", "value-type");
    this.removeAttributeNS(OdfDocumentNamespace.TABLE.getUri(), "formula");
  }
}
