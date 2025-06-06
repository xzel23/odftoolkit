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
package org.odftoolkit.odfdom.dom.element.form;

import org.odftoolkit.odfdom.dom.DefaultElementVisitor;
import org.odftoolkit.odfdom.dom.OdfDocumentNamespace;
import org.odftoolkit.odfdom.dom.attribute.form.FormControlImplementationAttribute;
import org.odftoolkit.odfdom.dom.attribute.form.FormConvertEmptyToNullAttribute;
import org.odftoolkit.odfdom.dom.attribute.form.FormCurrentValueAttribute;
import org.odftoolkit.odfdom.dom.attribute.form.FormDataFieldAttribute;
import org.odftoolkit.odfdom.dom.attribute.form.FormDelayForRepeatAttribute;
import org.odftoolkit.odfdom.dom.attribute.form.FormDisabledAttribute;
import org.odftoolkit.odfdom.dom.attribute.form.FormIdAttribute;
import org.odftoolkit.odfdom.dom.attribute.form.FormLinkedCellAttribute;
import org.odftoolkit.odfdom.dom.attribute.form.FormMaxLengthAttribute;
import org.odftoolkit.odfdom.dom.attribute.form.FormMaxValueAttribute;
import org.odftoolkit.odfdom.dom.attribute.form.FormMinValueAttribute;
import org.odftoolkit.odfdom.dom.attribute.form.FormNameAttribute;
import org.odftoolkit.odfdom.dom.attribute.form.FormPrintableAttribute;
import org.odftoolkit.odfdom.dom.attribute.form.FormReadonlyAttribute;
import org.odftoolkit.odfdom.dom.attribute.form.FormRepeatAttribute;
import org.odftoolkit.odfdom.dom.attribute.form.FormSpinButtonAttribute;
import org.odftoolkit.odfdom.dom.attribute.form.FormTabIndexAttribute;
import org.odftoolkit.odfdom.dom.attribute.form.FormTabStopAttribute;
import org.odftoolkit.odfdom.dom.attribute.form.FormTitleAttribute;
import org.odftoolkit.odfdom.dom.attribute.form.FormValueAttribute;
import org.odftoolkit.odfdom.dom.attribute.xforms.XformsBindAttribute;
import org.odftoolkit.odfdom.dom.attribute.xml.XmlIdAttribute;
import org.odftoolkit.odfdom.dom.element.office.OfficeEventListenersElement;
import org.odftoolkit.odfdom.pkg.ElementVisitor;
import org.odftoolkit.odfdom.pkg.OdfElement;
import org.odftoolkit.odfdom.pkg.OdfFileDom;
import org.odftoolkit.odfdom.pkg.OdfName;

/** DOM implementation of OpenDocument element {@odf.element form:number}. */
public class FormNumberElement extends OdfElement {

  public static final OdfName ELEMENT_NAME = OdfName.newName(OdfDocumentNamespace.FORM, "number");

  /**
   * Create the instance of <code>FormNumberElement</code>
   *
   * @param ownerDoc The type is <code>OdfFileDom</code>
   */
  public FormNumberElement(OdfFileDom ownerDoc) {
    super(ownerDoc, ELEMENT_NAME);
  }

  /**
   * Get the element name
   *
   * @return return <code>OdfName</code> the name of element {@odf.element form:number}.
   */
  public OdfName getOdfName() {
    return ELEMENT_NAME;
  }

  /**
   * Receives the value of the ODFDOM attribute representation <code>
   * FormControlImplementationAttribute</code> , See {@odf.attribute form:control-implementation}
   *
   * @return - the <code>String</code> , the value or <code>null</code>, if the attribute is not set
   *     and no default value defined.
   */
  public String getFormControlImplementationAttribute() {
    FormControlImplementationAttribute attr =
        (FormControlImplementationAttribute)
            getOdfAttribute(OdfDocumentNamespace.FORM, "control-implementation");
    if (attr != null) {
      return String.valueOf(attr.getValue());
    }
    return null;
  }

  /**
   * Sets the value of ODFDOM attribute representation <code>FormControlImplementationAttribute
   * </code> , See {@odf.attribute form:control-implementation}
   *
   * @param formControlImplementationValue The type is <code>String</code>
   */
  public void setFormControlImplementationAttribute(String formControlImplementationValue) {
    FormControlImplementationAttribute attr =
        new FormControlImplementationAttribute((OdfFileDom) this.ownerDocument);
    setOdfAttribute(attr);
    attr.setValue(formControlImplementationValue);
  }

  /**
   * Receives the value of the ODFDOM attribute representation <code>FormConvertEmptyToNullAttribute
   * </code> , See {@odf.attribute form:convert-empty-to-null}
   *
   * @return - the <code>Boolean</code> , the value or <code>null</code>, if the attribute is not
   *     set and no default value defined.
   */
  public Boolean getFormConvertEmptyToNullAttribute() {
    FormConvertEmptyToNullAttribute attr =
        (FormConvertEmptyToNullAttribute)
            getOdfAttribute(OdfDocumentNamespace.FORM, "convert-empty-to-null");
    if (attr != null && !attr.getValue().isEmpty()) {
      return attr.booleanValue();
    }
    return Boolean.valueOf(FormConvertEmptyToNullAttribute.DEFAULT_VALUE);
  }

  /**
   * Sets the value of ODFDOM attribute representation <code>FormConvertEmptyToNullAttribute</code>
   * , See {@odf.attribute form:convert-empty-to-null}
   *
   * @param formConvertEmptyToNullValue The type is <code>Boolean</code>
   */
  public void setFormConvertEmptyToNullAttribute(Boolean formConvertEmptyToNullValue) {
    FormConvertEmptyToNullAttribute attr =
        new FormConvertEmptyToNullAttribute((OdfFileDom) this.ownerDocument);
    setOdfAttribute(attr);
    attr.setBooleanValue(formConvertEmptyToNullValue);
  }

  /**
   * Receives the value of the ODFDOM attribute representation <code>FormCurrentValueAttribute
   * </code> , See {@odf.attribute form:current-value}
   *
   * @return - the <code>String</code> , the value or <code>null</code>, if the attribute is not set
   *     and no default value defined.
   */
  public String getFormCurrentValueAttribute() {
    FormCurrentValueAttribute attr =
        (FormCurrentValueAttribute) getOdfAttribute(OdfDocumentNamespace.FORM, "current-value");
    if (attr != null) {
      return String.valueOf(attr.getValue());
    }
    return null;
  }

  /**
   * Sets the value of ODFDOM attribute representation <code>FormCurrentValueAttribute</code> , See
   * {@odf.attribute form:current-value}
   *
   * @param formCurrentValueValue The type is <code>String</code>
   */
  public void setFormCurrentValueAttribute(String formCurrentValueValue) {
    FormCurrentValueAttribute attr = new FormCurrentValueAttribute((OdfFileDom) this.ownerDocument);
    setOdfAttribute(attr);
    attr.setValue(formCurrentValueValue);
  }

  /**
   * Receives the value of the ODFDOM attribute representation <code>FormDataFieldAttribute</code> ,
   * See {@odf.attribute form:data-field}
   *
   * @return - the <code>String</code> , the value or <code>null</code>, if the attribute is not set
   *     and no default value defined.
   */
  public String getFormDataFieldAttribute() {
    FormDataFieldAttribute attr =
        (FormDataFieldAttribute) getOdfAttribute(OdfDocumentNamespace.FORM, "data-field");
    if (attr != null) {
      return String.valueOf(attr.getValue());
    }
    return null;
  }

  /**
   * Sets the value of ODFDOM attribute representation <code>FormDataFieldAttribute</code> , See
   * {@odf.attribute form:data-field}
   *
   * @param formDataFieldValue The type is <code>String</code>
   */
  public void setFormDataFieldAttribute(String formDataFieldValue) {
    FormDataFieldAttribute attr = new FormDataFieldAttribute((OdfFileDom) this.ownerDocument);
    setOdfAttribute(attr);
    attr.setValue(formDataFieldValue);
  }

  /**
   * Receives the value of the ODFDOM attribute representation <code>FormDelayForRepeatAttribute
   * </code> , See {@odf.attribute form:delay-for-repeat}
   *
   * @return - the <code>String</code> , the value or <code>null</code>, if the attribute is not set
   *     and no default value defined.
   */
  public String getFormDelayForRepeatAttribute() {
    FormDelayForRepeatAttribute attr =
        (FormDelayForRepeatAttribute)
            getOdfAttribute(OdfDocumentNamespace.FORM, "delay-for-repeat");
    if (attr != null) {
      return String.valueOf(attr.getValue());
    }
    return FormDelayForRepeatAttribute.DEFAULT_VALUE;
  }

  /**
   * Sets the value of ODFDOM attribute representation <code>FormDelayForRepeatAttribute</code> ,
   * See {@odf.attribute form:delay-for-repeat}
   *
   * @param formDelayForRepeatValue The type is <code>String</code>
   */
  public void setFormDelayForRepeatAttribute(String formDelayForRepeatValue) {
    FormDelayForRepeatAttribute attr =
        new FormDelayForRepeatAttribute((OdfFileDom) this.ownerDocument);
    setOdfAttribute(attr);
    attr.setValue(formDelayForRepeatValue);
  }

  /**
   * Receives the value of the ODFDOM attribute representation <code>FormDisabledAttribute</code> ,
   * See {@odf.attribute form:disabled}
   *
   * @return - the <code>Boolean</code> , the value or <code>null</code>, if the attribute is not
   *     set and no default value defined.
   */
  public Boolean getFormDisabledAttribute() {
    FormDisabledAttribute attr =
        (FormDisabledAttribute) getOdfAttribute(OdfDocumentNamespace.FORM, "disabled");
    if (attr != null && !attr.getValue().isEmpty()) {
      return attr.booleanValue();
    }
    return Boolean.valueOf(FormDisabledAttribute.DEFAULT_VALUE);
  }

  /**
   * Sets the value of ODFDOM attribute representation <code>FormDisabledAttribute</code> , See
   * {@odf.attribute form:disabled}
   *
   * @param formDisabledValue The type is <code>Boolean</code>
   */
  public void setFormDisabledAttribute(Boolean formDisabledValue) {
    FormDisabledAttribute attr = new FormDisabledAttribute((OdfFileDom) this.ownerDocument);
    setOdfAttribute(attr);
    attr.setBooleanValue(formDisabledValue);
  }

  /**
   * Receives the value of the ODFDOM attribute representation <code>FormIdAttribute</code> , See
   * {@odf.attribute form:id}
   *
   * @return - the <code>String</code> , the value or <code>null</code>, if the attribute is not set
   *     and no default value defined.
   */
  public String getFormIdAttribute() {
    FormIdAttribute attr = (FormIdAttribute) getOdfAttribute(OdfDocumentNamespace.FORM, "id");
    if (attr != null) {
      return String.valueOf(attr.getValue());
    }
    return null;
  }

  /**
   * Sets the value of ODFDOM attribute representation <code>FormIdAttribute</code> , See
   * {@odf.attribute form:id}
   *
   * @param formIdValue The type is <code>String</code>
   */
  public void setFormIdAttribute(String formIdValue) {
    FormIdAttribute attr = new FormIdAttribute((OdfFileDom) this.ownerDocument);
    setOdfAttribute(attr);
    attr.setValue(formIdValue);
  }

  /**
   * Receives the value of the ODFDOM attribute representation <code>FormLinkedCellAttribute</code>
   * , See {@odf.attribute form:linked-cell}
   *
   * @return - the <code>String</code> , the value or <code>null</code>, if the attribute is not set
   *     and no default value defined.
   */
  public String getFormLinkedCellAttribute() {
    FormLinkedCellAttribute attr =
        (FormLinkedCellAttribute) getOdfAttribute(OdfDocumentNamespace.FORM, "linked-cell");
    if (attr != null) {
      return String.valueOf(attr.getValue());
    }
    return null;
  }

  /**
   * Sets the value of ODFDOM attribute representation <code>FormLinkedCellAttribute</code> , See
   * {@odf.attribute form:linked-cell}
   *
   * @param formLinkedCellValue The type is <code>String</code>
   */
  public void setFormLinkedCellAttribute(String formLinkedCellValue) {
    FormLinkedCellAttribute attr = new FormLinkedCellAttribute((OdfFileDom) this.ownerDocument);
    setOdfAttribute(attr);
    attr.setValue(formLinkedCellValue);
  }

  /**
   * Receives the value of the ODFDOM attribute representation <code>FormMaxLengthAttribute</code> ,
   * See {@odf.attribute form:max-length}
   *
   * @return - the <code>Integer</code> , the value or <code>null</code>, if the attribute is not
   *     set and no default value defined.
   */
  public Integer getFormMaxLengthAttribute() {
    FormMaxLengthAttribute attr =
        (FormMaxLengthAttribute) getOdfAttribute(OdfDocumentNamespace.FORM, "max-length");
    if (attr != null && !attr.getValue().isEmpty()) {
      return attr.intValue();
    }
    return null;
  }

  /**
   * Sets the value of ODFDOM attribute representation <code>FormMaxLengthAttribute</code> , See
   * {@odf.attribute form:max-length}
   *
   * @param formMaxLengthValue The type is <code>Integer</code>
   */
  public void setFormMaxLengthAttribute(Integer formMaxLengthValue) {
    FormMaxLengthAttribute attr = new FormMaxLengthAttribute((OdfFileDom) this.ownerDocument);
    setOdfAttribute(attr);
    attr.setIntValue(formMaxLengthValue);
  }

  /**
   * Receives the value of the ODFDOM attribute representation <code>FormMaxValueAttribute</code> ,
   * See {@odf.attribute form:max-value}
   *
   * @return - the <code>String</code> , the value or <code>null</code>, if the attribute is not set
   *     and no default value defined.
   */
  public String getFormMaxValueAttribute() {
    FormMaxValueAttribute attr =
        (FormMaxValueAttribute) getOdfAttribute(OdfDocumentNamespace.FORM, "max-value");
    if (attr != null) {
      return String.valueOf(attr.getValue());
    }
    return null;
  }

  /**
   * Sets the value of ODFDOM attribute representation <code>FormMaxValueAttribute</code> , See
   * {@odf.attribute form:max-value}
   *
   * @param formMaxValueValue The type is <code>String</code>
   */
  public void setFormMaxValueAttribute(String formMaxValueValue) {
    FormMaxValueAttribute attr = new FormMaxValueAttribute((OdfFileDom) this.ownerDocument);
    setOdfAttribute(attr);
    attr.setValue(formMaxValueValue);
  }

  /**
   * Receives the value of the ODFDOM attribute representation <code>FormMinValueAttribute</code> ,
   * See {@odf.attribute form:min-value}
   *
   * @return - the <code>String</code> , the value or <code>null</code>, if the attribute is not set
   *     and no default value defined.
   */
  public String getFormMinValueAttribute() {
    FormMinValueAttribute attr =
        (FormMinValueAttribute) getOdfAttribute(OdfDocumentNamespace.FORM, "min-value");
    if (attr != null) {
      return String.valueOf(attr.getValue());
    }
    return null;
  }

  /**
   * Sets the value of ODFDOM attribute representation <code>FormMinValueAttribute</code> , See
   * {@odf.attribute form:min-value}
   *
   * @param formMinValueValue The type is <code>String</code>
   */
  public void setFormMinValueAttribute(String formMinValueValue) {
    FormMinValueAttribute attr = new FormMinValueAttribute((OdfFileDom) this.ownerDocument);
    setOdfAttribute(attr);
    attr.setValue(formMinValueValue);
  }

  /**
   * Receives the value of the ODFDOM attribute representation <code>FormNameAttribute</code> , See
   * {@odf.attribute form:name}
   *
   * @return - the <code>String</code> , the value or <code>null</code>, if the attribute is not set
   *     and no default value defined.
   */
  public String getFormNameAttribute() {
    FormNameAttribute attr = (FormNameAttribute) getOdfAttribute(OdfDocumentNamespace.FORM, "name");
    if (attr != null) {
      return String.valueOf(attr.getValue());
    }
    return null;
  }

  /**
   * Sets the value of ODFDOM attribute representation <code>FormNameAttribute</code> , See
   * {@odf.attribute form:name}
   *
   * @param formNameValue The type is <code>String</code>
   */
  public void setFormNameAttribute(String formNameValue) {
    FormNameAttribute attr = new FormNameAttribute((OdfFileDom) this.ownerDocument);
    setOdfAttribute(attr);
    attr.setValue(formNameValue);
  }

  /**
   * Receives the value of the ODFDOM attribute representation <code>FormPrintableAttribute</code> ,
   * See {@odf.attribute form:printable}
   *
   * @return - the <code>Boolean</code> , the value or <code>null</code>, if the attribute is not
   *     set and no default value defined.
   */
  public Boolean getFormPrintableAttribute() {
    FormPrintableAttribute attr =
        (FormPrintableAttribute) getOdfAttribute(OdfDocumentNamespace.FORM, "printable");
    if (attr != null && !attr.getValue().isEmpty()) {
      return attr.booleanValue();
    }
    return Boolean.valueOf(FormPrintableAttribute.DEFAULT_VALUE);
  }

  /**
   * Sets the value of ODFDOM attribute representation <code>FormPrintableAttribute</code> , See
   * {@odf.attribute form:printable}
   *
   * @param formPrintableValue The type is <code>Boolean</code>
   */
  public void setFormPrintableAttribute(Boolean formPrintableValue) {
    FormPrintableAttribute attr = new FormPrintableAttribute((OdfFileDom) this.ownerDocument);
    setOdfAttribute(attr);
    attr.setBooleanValue(formPrintableValue);
  }

  /**
   * Receives the value of the ODFDOM attribute representation <code>FormReadonlyAttribute</code> ,
   * See {@odf.attribute form:readonly}
   *
   * @return - the <code>Boolean</code> , the value or <code>null</code>, if the attribute is not
   *     set and no default value defined.
   */
  public Boolean getFormReadonlyAttribute() {
    FormReadonlyAttribute attr =
        (FormReadonlyAttribute) getOdfAttribute(OdfDocumentNamespace.FORM, "readonly");
    if (attr != null && !attr.getValue().isEmpty()) {
      return attr.booleanValue();
    }
    return Boolean.valueOf(FormReadonlyAttribute.DEFAULT_VALUE);
  }

  /**
   * Sets the value of ODFDOM attribute representation <code>FormReadonlyAttribute</code> , See
   * {@odf.attribute form:readonly}
   *
   * @param formReadonlyValue The type is <code>Boolean</code>
   */
  public void setFormReadonlyAttribute(Boolean formReadonlyValue) {
    FormReadonlyAttribute attr = new FormReadonlyAttribute((OdfFileDom) this.ownerDocument);
    setOdfAttribute(attr);
    attr.setBooleanValue(formReadonlyValue);
  }

  /**
   * Receives the value of the ODFDOM attribute representation <code>FormRepeatAttribute</code> ,
   * See {@odf.attribute form:repeat}
   *
   * @return - the <code>Boolean</code> , the value or <code>null</code>, if the attribute is not
   *     set and no default value defined.
   */
  public Boolean getFormRepeatAttribute() {
    FormRepeatAttribute attr =
        (FormRepeatAttribute) getOdfAttribute(OdfDocumentNamespace.FORM, "repeat");
    if (attr != null && !attr.getValue().isEmpty()) {
      return attr.booleanValue();
    }
    return null;
  }

  /**
   * Sets the value of ODFDOM attribute representation <code>FormRepeatAttribute</code> , See
   * {@odf.attribute form:repeat}
   *
   * @param formRepeatValue The type is <code>Boolean</code>
   */
  public void setFormRepeatAttribute(Boolean formRepeatValue) {
    FormRepeatAttribute attr = new FormRepeatAttribute((OdfFileDom) this.ownerDocument);
    setOdfAttribute(attr);
    attr.setBooleanValue(formRepeatValue);
  }

  /**
   * Receives the value of the ODFDOM attribute representation <code>FormSpinButtonAttribute</code>
   * , See {@odf.attribute form:spin-button}
   *
   * @return - the <code>Boolean</code> , the value or <code>null</code>, if the attribute is not
   *     set and no default value defined.
   */
  public Boolean getFormSpinButtonAttribute() {
    FormSpinButtonAttribute attr =
        (FormSpinButtonAttribute) getOdfAttribute(OdfDocumentNamespace.FORM, "spin-button");
    if (attr != null && !attr.getValue().isEmpty()) {
      return attr.booleanValue();
    }
    return Boolean.valueOf(FormSpinButtonAttribute.DEFAULT_VALUE);
  }

  /**
   * Sets the value of ODFDOM attribute representation <code>FormSpinButtonAttribute</code> , See
   * {@odf.attribute form:spin-button}
   *
   * @param formSpinButtonValue The type is <code>Boolean</code>
   */
  public void setFormSpinButtonAttribute(Boolean formSpinButtonValue) {
    FormSpinButtonAttribute attr = new FormSpinButtonAttribute((OdfFileDom) this.ownerDocument);
    setOdfAttribute(attr);
    attr.setBooleanValue(formSpinButtonValue);
  }

  /**
   * Receives the value of the ODFDOM attribute representation <code>FormTabIndexAttribute</code> ,
   * See {@odf.attribute form:tab-index}
   *
   * @return - the <code>Integer</code> , the value or <code>null</code>, if the attribute is not
   *     set and no default value defined.
   */
  public Integer getFormTabIndexAttribute() {
    FormTabIndexAttribute attr =
        (FormTabIndexAttribute) getOdfAttribute(OdfDocumentNamespace.FORM, "tab-index");
    if (attr != null && !attr.getValue().isEmpty()) {
      return attr.intValue();
    }
    return Integer.valueOf(FormTabIndexAttribute.DEFAULT_VALUE);
  }

  /**
   * Sets the value of ODFDOM attribute representation <code>FormTabIndexAttribute</code> , See
   * {@odf.attribute form:tab-index}
   *
   * @param formTabIndexValue The type is <code>Integer</code>
   */
  public void setFormTabIndexAttribute(Integer formTabIndexValue) {
    FormTabIndexAttribute attr = new FormTabIndexAttribute((OdfFileDom) this.ownerDocument);
    setOdfAttribute(attr);
    attr.setIntValue(formTabIndexValue);
  }

  /**
   * Receives the value of the ODFDOM attribute representation <code>FormTabStopAttribute</code> ,
   * See {@odf.attribute form:tab-stop}
   *
   * @return - the <code>Boolean</code> , the value or <code>null</code>, if the attribute is not
   *     set and no default value defined.
   */
  public Boolean getFormTabStopAttribute() {
    FormTabStopAttribute attr =
        (FormTabStopAttribute) getOdfAttribute(OdfDocumentNamespace.FORM, "tab-stop");
    if (attr != null && !attr.getValue().isEmpty()) {
      return attr.booleanValue();
    }
    return Boolean.valueOf(FormTabStopAttribute.DEFAULT_VALUE);
  }

  /**
   * Sets the value of ODFDOM attribute representation <code>FormTabStopAttribute</code> , See
   * {@odf.attribute form:tab-stop}
   *
   * @param formTabStopValue The type is <code>Boolean</code>
   */
  public void setFormTabStopAttribute(Boolean formTabStopValue) {
    FormTabStopAttribute attr = new FormTabStopAttribute((OdfFileDom) this.ownerDocument);
    setOdfAttribute(attr);
    attr.setBooleanValue(formTabStopValue);
  }

  /**
   * Receives the value of the ODFDOM attribute representation <code>FormTitleAttribute</code> , See
   * {@odf.attribute form:title}
   *
   * @return - the <code>String</code> , the value or <code>null</code>, if the attribute is not set
   *     and no default value defined.
   */
  public String getFormTitleAttribute() {
    FormTitleAttribute attr =
        (FormTitleAttribute) getOdfAttribute(OdfDocumentNamespace.FORM, "title");
    if (attr != null) {
      return String.valueOf(attr.getValue());
    }
    return null;
  }

  /**
   * Sets the value of ODFDOM attribute representation <code>FormTitleAttribute</code> , See
   * {@odf.attribute form:title}
   *
   * @param formTitleValue The type is <code>String</code>
   */
  public void setFormTitleAttribute(String formTitleValue) {
    FormTitleAttribute attr = new FormTitleAttribute((OdfFileDom) this.ownerDocument);
    setOdfAttribute(attr);
    attr.setValue(formTitleValue);
  }

  /**
   * Receives the value of the ODFDOM attribute representation <code>FormValueAttribute</code> , See
   * {@odf.attribute form:value}
   *
   * @return - the <code>String</code> , the value or <code>null</code>, if the attribute is not set
   *     and no default value defined.
   */
  public String getFormValueAttribute() {
    FormValueAttribute attr =
        (FormValueAttribute) getOdfAttribute(OdfDocumentNamespace.FORM, "value");
    if (attr != null) {
      return String.valueOf(attr.getValue());
    }
    return null;
  }

  /**
   * Sets the value of ODFDOM attribute representation <code>FormValueAttribute</code> , See
   * {@odf.attribute form:value}
   *
   * @param formValueValue The type is <code>String</code>
   */
  public void setFormValueAttribute(String formValueValue) {
    FormValueAttribute attr = new FormValueAttribute((OdfFileDom) this.ownerDocument);
    setOdfAttribute(attr);
    attr.setValue(formValueValue);
  }

  /**
   * Receives the value of the ODFDOM attribute representation <code>XformsBindAttribute</code> ,
   * See {@odf.attribute xforms:bind}
   *
   * @return - the <code>String</code> , the value or <code>null</code>, if the attribute is not set
   *     and no default value defined.
   */
  public String getXformsBindAttribute() {
    XformsBindAttribute attr =
        (XformsBindAttribute) getOdfAttribute(OdfDocumentNamespace.XFORMS, "bind");
    if (attr != null) {
      return String.valueOf(attr.getValue());
    }
    return null;
  }

  /**
   * Sets the value of ODFDOM attribute representation <code>XformsBindAttribute</code> , See
   * {@odf.attribute xforms:bind}
   *
   * @param xformsBindValue The type is <code>String</code>
   */
  public void setXformsBindAttribute(String xformsBindValue) {
    XformsBindAttribute attr = new XformsBindAttribute((OdfFileDom) this.ownerDocument);
    setOdfAttribute(attr);
    attr.setValue(xformsBindValue);
  }

  /**
   * Receives the value of the ODFDOM attribute representation <code>XmlIdAttribute</code> , See
   * {@odf.attribute xml:id}
   *
   * <p>Attribute is mandatory.
   *
   * @return - the <code>String</code> , the value or <code>null</code>, if the attribute is not set
   *     and no default value defined.
   */
  public String getXmlIdAttribute() {
    XmlIdAttribute attr = (XmlIdAttribute) getOdfAttribute(OdfDocumentNamespace.XML, "id");
    if (attr != null) {
      return String.valueOf(attr.getValue());
    }
    return null;
  }

  /**
   * Sets the value of ODFDOM attribute representation <code>XmlIdAttribute</code> , See
   * {@odf.attribute xml:id}
   *
   * @param xmlIdValue The type is <code>String</code>
   */
  public void setXmlIdAttribute(String xmlIdValue) {
    XmlIdAttribute attr = new XmlIdAttribute((OdfFileDom) this.ownerDocument);
    setOdfAttribute(attr);
    attr.setValue(xmlIdValue);
  }

  /**
   * Create child element {@odf.element form:properties}.
   *
   * @return the element {@odf.element form:properties}
   */
  public FormPropertiesElement newFormPropertiesElement() {
    FormPropertiesElement formProperties =
        ((OdfFileDom) this.ownerDocument).newOdfElement(FormPropertiesElement.class);
    this.appendChild(formProperties);
    return formProperties;
  }

  /**
   * Create child element {@odf.element office:event-listeners}.
   *
   * @return the element {@odf.element office:event-listeners}
   */
  public OfficeEventListenersElement newOfficeEventListenersElement() {
    OfficeEventListenersElement officeEventListeners =
        ((OdfFileDom) this.ownerDocument).newOdfElement(OfficeEventListenersElement.class);
    this.appendChild(officeEventListeners);
    return officeEventListeners;
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
