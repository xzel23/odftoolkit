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
package org.odftoolkit.odfdom.dom.element.style;

import org.odftoolkit.odfdom.dom.DefaultElementVisitor;
import org.odftoolkit.odfdom.dom.OdfDocumentNamespace;
import org.odftoolkit.odfdom.dom.attribute.style.StyleDistanceAttribute;
import org.odftoolkit.odfdom.dom.attribute.style.StyleLengthAttribute;
import org.odftoolkit.odfdom.dom.attribute.style.StyleLinesAttribute;
import org.odftoolkit.odfdom.dom.attribute.style.StyleStyleNameAttribute;
import org.odftoolkit.odfdom.dom.element.OdfStylableElement;
import org.odftoolkit.odfdom.dom.style.OdfStyleFamily;
import org.odftoolkit.odfdom.pkg.ElementVisitor;
import org.odftoolkit.odfdom.pkg.OdfFileDom;
import org.odftoolkit.odfdom.pkg.OdfName;

/** DOM implementation of OpenDocument element {@odf.element style:drop-cap}. */
public class StyleDropCapElement extends OdfStylableElement {

  public static final OdfName ELEMENT_NAME =
      OdfName.newName(OdfDocumentNamespace.STYLE, "drop-cap");

  /**
   * Create the instance of <code>StyleDropCapElement</code>
   *
   * @param ownerDoc The type is <code>OdfFileDom</code>
   */
  public StyleDropCapElement(OdfFileDom ownerDoc) {
    super(
        ownerDoc,
        ELEMENT_NAME,
        OdfStyleFamily.Text,
        OdfName.newName(OdfDocumentNamespace.STYLE, "style-name"));
  }

  /**
   * Get the element name
   *
   * @return return <code>OdfName</code> the name of element {@odf.element style:drop-cap}.
   */
  public OdfName getOdfName() {
    return ELEMENT_NAME;
  }

  /**
   * Receives the value of the ODFDOM attribute representation <code>StyleDistanceAttribute</code> ,
   * See {@odf.attribute style:distance}
   *
   * @return - the <code>String</code> , the value or <code>null</code>, if the attribute is not set
   *     and no default value defined.
   */
  public String getStyleDistanceAttribute() {
    StyleDistanceAttribute attr =
        (StyleDistanceAttribute) getOdfAttribute(OdfDocumentNamespace.STYLE, "distance");
    if (attr != null) {
      return String.valueOf(attr.getValue());
    }
    return StyleDistanceAttribute.DEFAULT_VALUE;
  }

  /**
   * Sets the value of ODFDOM attribute representation <code>StyleDistanceAttribute</code> , See
   * {@odf.attribute style:distance}
   *
   * @param styleDistanceValue The type is <code>String</code>
   */
  public void setStyleDistanceAttribute(String styleDistanceValue) {
    StyleDistanceAttribute attr = new StyleDistanceAttribute((OdfFileDom) this.ownerDocument);
    setOdfAttribute(attr);
    attr.setValue(styleDistanceValue);
  }

  /**
   * Receives the value of the ODFDOM attribute representation <code>StyleLengthAttribute</code> ,
   * See {@odf.attribute style:length}
   *
   * @return - the <code>Integer</code> , the value or <code>null</code>, if the attribute is not
   *     set and no default value defined.
   */
  public Integer getStyleLengthAttribute() {
    StyleLengthAttribute attr =
        (StyleLengthAttribute) getOdfAttribute(OdfDocumentNamespace.STYLE, "length");
    if (attr != null && !attr.getValue().isEmpty()) {
      return attr.intValue();
    }
    return Integer.valueOf(StyleLengthAttribute.DEFAULT_VALUE);
  }

  /**
   * Sets the value of ODFDOM attribute representation <code>StyleLengthAttribute</code> , See
   * {@odf.attribute style:length}
   *
   * @param styleLengthValue The type is <code>Integer</code>
   */
  public void setStyleLengthAttribute(Integer styleLengthValue) {
    StyleLengthAttribute attr = new StyleLengthAttribute((OdfFileDom) this.ownerDocument);
    setOdfAttribute(attr);
    attr.setIntValue(styleLengthValue);
  }

  /**
   * Receives the value of the ODFDOM attribute representation <code>StyleLinesAttribute</code> ,
   * See {@odf.attribute style:lines}
   *
   * @return - the <code>Integer</code> , the value or <code>null</code>, if the attribute is not
   *     set and no default value defined.
   */
  public Integer getStyleLinesAttribute() {
    StyleLinesAttribute attr =
        (StyleLinesAttribute) getOdfAttribute(OdfDocumentNamespace.STYLE, "lines");
    if (attr != null && !attr.getValue().isEmpty()) {
      return attr.intValue();
    }
    return Integer.valueOf(StyleLinesAttribute.DEFAULT_VALUE);
  }

  /**
   * Sets the value of ODFDOM attribute representation <code>StyleLinesAttribute</code> , See
   * {@odf.attribute style:lines}
   *
   * @param styleLinesValue The type is <code>Integer</code>
   */
  public void setStyleLinesAttribute(Integer styleLinesValue) {
    StyleLinesAttribute attr = new StyleLinesAttribute((OdfFileDom) this.ownerDocument);
    setOdfAttribute(attr);
    attr.setIntValue(styleLinesValue);
  }

  /**
   * Receives the value of the ODFDOM attribute representation <code>StyleStyleNameAttribute</code>
   * , See {@odf.attribute style:style-name}
   *
   * @return - the <code>String</code> , the value or <code>null</code>, if the attribute is not set
   *     and no default value defined.
   */
  public String getStyleStyleNameAttribute() {
    StyleStyleNameAttribute attr =
        (StyleStyleNameAttribute) getOdfAttribute(OdfDocumentNamespace.STYLE, "style-name");
    if (attr != null) {
      return String.valueOf(attr.getValue());
    }
    return null;
  }

  /**
   * Sets the value of ODFDOM attribute representation <code>StyleStyleNameAttribute</code> , See
   * {@odf.attribute style:style-name}
   *
   * @param styleStyleNameValue The type is <code>String</code>
   */
  public void setStyleStyleNameAttribute(String styleStyleNameValue) {
    StyleStyleNameAttribute attr = new StyleStyleNameAttribute((OdfFileDom) this.ownerDocument);
    setOdfAttribute(attr);
    attr.setValue(styleStyleNameValue);
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
