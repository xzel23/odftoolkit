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
package org.odftoolkit.odfdom.dom.element.number;

import org.odftoolkit.odfdom.dom.DefaultElementVisitor;
import org.odftoolkit.odfdom.dom.OdfDocumentNamespace;
import org.odftoolkit.odfdom.dom.attribute.number.NumberDecimalPlacesAttribute;
import org.odftoolkit.odfdom.dom.attribute.number.NumberDecimalReplacementAttribute;
import org.odftoolkit.odfdom.dom.attribute.number.NumberDisplayFactorAttribute;
import org.odftoolkit.odfdom.dom.attribute.number.NumberGroupingAttribute;
import org.odftoolkit.odfdom.dom.attribute.number.NumberMinIntegerDigitsAttribute;
import org.odftoolkit.odfdom.pkg.ElementVisitor;
import org.odftoolkit.odfdom.pkg.OdfElement;
import org.odftoolkit.odfdom.pkg.OdfFileDom;
import org.odftoolkit.odfdom.pkg.OdfName;

/** DOM implementation of OpenDocument element {@odf.element number:number}. */
public class NumberNumberElement extends OdfElement {

  public static final OdfName ELEMENT_NAME = OdfName.newName(OdfDocumentNamespace.NUMBER, "number");

  /**
   * Create the instance of <code>NumberNumberElement</code>
   *
   * @param ownerDoc The type is <code>OdfFileDom</code>
   */
  public NumberNumberElement(OdfFileDom ownerDoc) {
    super(ownerDoc, ELEMENT_NAME);
  }

  /**
   * Get the element name
   *
   * @return return <code>OdfName</code> the name of element {@odf.element number:number}.
   */
  public OdfName getOdfName() {
    return ELEMENT_NAME;
  }

  /**
   * Receives the value of the ODFDOM attribute representation <code>NumberDecimalPlacesAttribute
   * </code> , See {@odf.attribute number:decimal-places}
   *
   * @return - the <code>Integer</code> , the value or <code>null</code>, if the attribute is not
   *     set and no default value defined.
   */
  public Integer getNumberDecimalPlacesAttribute() {
    NumberDecimalPlacesAttribute attr =
        (NumberDecimalPlacesAttribute)
            getOdfAttribute(OdfDocumentNamespace.NUMBER, "decimal-places");
    if (attr != null && !attr.getValue().isEmpty()) {
      return attr.intValue();
    }
    return null;
  }

  /**
   * Sets the value of ODFDOM attribute representation <code>NumberDecimalPlacesAttribute</code> ,
   * See {@odf.attribute number:decimal-places}
   *
   * @param numberDecimalPlacesValue The type is <code>Integer</code>
   */
  public void setNumberDecimalPlacesAttribute(Integer numberDecimalPlacesValue) {
    NumberDecimalPlacesAttribute attr =
        new NumberDecimalPlacesAttribute((OdfFileDom) this.ownerDocument);
    setOdfAttribute(attr);
    attr.setIntValue(numberDecimalPlacesValue);
  }

  /**
   * Receives the value of the ODFDOM attribute representation <code>
   * NumberDecimalReplacementAttribute</code> , See {@odf.attribute number:decimal-replacement}
   *
   * @return - the <code>String</code> , the value or <code>null</code>, if the attribute is not set
   *     and no default value defined.
   */
  public String getNumberDecimalReplacementAttribute() {
    NumberDecimalReplacementAttribute attr =
        (NumberDecimalReplacementAttribute)
            getOdfAttribute(OdfDocumentNamespace.NUMBER, "decimal-replacement");
    if (attr != null) {
      return String.valueOf(attr.getValue());
    }
    return null;
  }

  /**
   * Sets the value of ODFDOM attribute representation <code>NumberDecimalReplacementAttribute
   * </code> , See {@odf.attribute number:decimal-replacement}
   *
   * @param numberDecimalReplacementValue The type is <code>String</code>
   */
  public void setNumberDecimalReplacementAttribute(String numberDecimalReplacementValue) {
    NumberDecimalReplacementAttribute attr =
        new NumberDecimalReplacementAttribute((OdfFileDom) this.ownerDocument);
    setOdfAttribute(attr);
    attr.setValue(numberDecimalReplacementValue);
  }

  /**
   * Receives the value of the ODFDOM attribute representation <code>NumberDisplayFactorAttribute
   * </code> , See {@odf.attribute number:display-factor}
   *
   * @return - the <code>Double</code> , the value or <code>null</code>, if the attribute is not set
   *     and no default value defined.
   */
  public Double getNumberDisplayFactorAttribute() {
    NumberDisplayFactorAttribute attr =
        (NumberDisplayFactorAttribute)
            getOdfAttribute(OdfDocumentNamespace.NUMBER, "display-factor");
    if (attr != null && !attr.getValue().isEmpty()) {
      return attr.doubleValue();
    }
    return Double.valueOf(NumberDisplayFactorAttribute.DEFAULT_VALUE);
  }

  /**
   * Sets the value of ODFDOM attribute representation <code>NumberDisplayFactorAttribute</code> ,
   * See {@odf.attribute number:display-factor}
   *
   * @param numberDisplayFactorValue The type is <code>Double</code>
   */
  public void setNumberDisplayFactorAttribute(Double numberDisplayFactorValue) {
    NumberDisplayFactorAttribute attr =
        new NumberDisplayFactorAttribute((OdfFileDom) this.ownerDocument);
    setOdfAttribute(attr);
    attr.setDoubleValue(numberDisplayFactorValue);
  }

  /**
   * Receives the value of the ODFDOM attribute representation <code>NumberGroupingAttribute</code>
   * , See {@odf.attribute number:grouping}
   *
   * @return - the <code>Boolean</code> , the value or <code>null</code>, if the attribute is not
   *     set and no default value defined.
   */
  public Boolean getNumberGroupingAttribute() {
    NumberGroupingAttribute attr =
        (NumberGroupingAttribute) getOdfAttribute(OdfDocumentNamespace.NUMBER, "grouping");
    if (attr != null && !attr.getValue().isEmpty()) {
      return attr.booleanValue();
    }
    return Boolean.valueOf(NumberGroupingAttribute.DEFAULT_VALUE);
  }

  /**
   * Sets the value of ODFDOM attribute representation <code>NumberGroupingAttribute</code> , See
   * {@odf.attribute number:grouping}
   *
   * @param numberGroupingValue The type is <code>Boolean</code>
   */
  public void setNumberGroupingAttribute(Boolean numberGroupingValue) {
    NumberGroupingAttribute attr = new NumberGroupingAttribute((OdfFileDom) this.ownerDocument);
    setOdfAttribute(attr);
    attr.setBooleanValue(numberGroupingValue);
  }

  /**
   * Receives the value of the ODFDOM attribute representation <code>NumberMinIntegerDigitsAttribute
   * </code> , See {@odf.attribute number:min-integer-digits}
   *
   * @return - the <code>Integer</code> , the value or <code>null</code>, if the attribute is not
   *     set and no default value defined.
   */
  public Integer getNumberMinIntegerDigitsAttribute() {
    NumberMinIntegerDigitsAttribute attr =
        (NumberMinIntegerDigitsAttribute)
            getOdfAttribute(OdfDocumentNamespace.NUMBER, "min-integer-digits");
    if (attr != null && !attr.getValue().isEmpty()) {
      return attr.intValue();
    }
    return null;
  }

  /**
   * Sets the value of ODFDOM attribute representation <code>NumberMinIntegerDigitsAttribute</code>
   * , See {@odf.attribute number:min-integer-digits}
   *
   * @param numberMinIntegerDigitsValue The type is <code>Integer</code>
   */
  public void setNumberMinIntegerDigitsAttribute(Integer numberMinIntegerDigitsValue) {
    NumberMinIntegerDigitsAttribute attr =
        new NumberMinIntegerDigitsAttribute((OdfFileDom) this.ownerDocument);
    setOdfAttribute(attr);
    attr.setIntValue(numberMinIntegerDigitsValue);
  }

  /**
   * Create child element {@odf.element number:embedded-text}.
   *
   * @param numberPositionValue the <code>Integer</code> value of <code>NumberPositionAttribute
   *     </code>, see {@odf.attribute number:position} at specification
   * @return the element {@odf.element number:embedded-text}
   */
  public NumberEmbeddedTextElement newNumberEmbeddedTextElement(int numberPositionValue) {
    NumberEmbeddedTextElement numberEmbeddedText =
        ((OdfFileDom) this.ownerDocument).newOdfElement(NumberEmbeddedTextElement.class);
    numberEmbeddedText.setNumberPositionAttribute(numberPositionValue);
    this.appendChild(numberEmbeddedText);
    return numberEmbeddedText;
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
