/**
 * **********************************************************************
 *
 * <p>DO NOT ALTER OR REMOVE COPYRIGHT NOTICES OR THIS FILE HEADER
 *
 * <p>Copyright 2009, 2010 Oracle and/or its affiliates. All rights reserved.
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
 * <p>*********************************************************************
 */
package schema2template.grammar;

import static schema2template.SchemaToTemplate.DEBUG;

import java.io.File;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.nio.charset.StandardCharsets;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

import com.sun.msv.grammar.DataExp;
import com.sun.msv.grammar.Expression;
import com.sun.msv.grammar.NameClassAndExpression;
import com.sun.msv.grammar.ReferenceExp;
import com.sun.msv.grammar.ValueExp;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 * MSVRunTimeDumpTest is loading each ODF Grammar into the MSV using our PuzzlePiece class and
 * dumping each MSV grammar into a file.
 */
public class MSVRunTimeDumpTest {

  private static final Logger LOG = Logger.getLogger(MSVRunTimeDumpTest.class.getName());

  private static final String MSV_DUMP_DIRECTORY = "msv-dump";

  @Before
  public void intialize() {
    new File(ConstantsBuildEnv.TARGET_BASE_DIR + MSV_DUMP_DIRECTORY).mkdirs();
  }

  /**
   * This test iterates over all ODF grammars loads them into the MSV Validator and dumps the
   * run-time model (ExpressionTree) into a file.
   */
  @Test
  public void testMSVExpressionTree() {
    try {
      for (ConstantsOdf.OdfSpecificationPart specPart :
        ConstantsOdf.OdfSpecificationPart.values()) {
        LOG.info(
          "\n\nNew ODF grammar runtime serialization (MSV dump) for regression test:"
            + "\n\tgrammarVersion "
            + specPart.grammarVersion
            + "\n\tgrammarID: "
            + specPart.grammarID
            + "\n\tgrammarPath: "
            + specPart.grammarPath
            + "\n\ttargetDirPath: "
            + ConstantsBuildEnv.TARGET_BASE_DIR
            + MSV_DUMP_DIRECTORY);
        Expression odfRoot = XMLModel.loadSchema(specPart.grammarPath).getTopLevel();
        String odfDump = dumpMSVExpressionTree(odfRoot);

        String grammarLabel = specPart.grammarID + "-" + specPart.grammarVersion;

        String targetMSVDumpFile =
          ConstantsBuildEnv.TARGET_BASE_DIR
            + MSV_DUMP_DIRECTORY
            + File.separator
            + grammarLabel
            + "-msvtree.txt";
        LOG.log(
          Level.INFO,
          "Writing MSV RelaxNG tree for " + grammarLabel + " + into file: {0}",
          targetMSVDumpFile);
        try (PrintWriter out = new PrintWriter(new FileWriter(targetMSVDumpFile, StandardCharsets.UTF_8))) {
          out.print(odfDump);
        }
      }
      DirectoryCompare.assertDirectoriesEqual(
        ConstantsBuildEnv.REFERENCE_BASE_DIR + MSV_DUMP_DIRECTORY,
        ConstantsBuildEnv.TARGET_BASE_DIR + MSV_DUMP_DIRECTORY
      );
    } catch (Exception ex) {
      LOG.log(Level.SEVERE, null, ex);
      Assert.fail(ex.toString());
    }
  }

  /**
   * Iterates the MSVExpressionTree and dumps it into a string
   *
   * @param rootExpression the root of the MSVExpressionTree to be dumped
   * @return the MSVExpressionTree serialized into a String
   */
  public static String dumpMSVExpressionTree(Expression rootExpression) {
    MSVExpressionIterator iterator = new MSVExpressionIterator(rootExpression);
    StringBuilder builder = new StringBuilder();
    while (iterator.hasNext()) {
      Expression expr = iterator.next();
      builder.append(dumpMSVExpression(expr, iterator.getDepth())).append("\n");
    }
    return builder.toString();
  }

  private static String dumpMSVExpression(Expression expr, int depth) {
    MSVExpressionVisitorType typeVisitor = new MSVExpressionVisitorType();
    MSVNameClassVisitorList nameVisitor = new MSVNameClassVisitorList();
    MSVExpressionType type = (MSVExpressionType) expr.visit(typeVisitor);

    // AttributeExp, ElementExp
    StringBuilder sb = new StringBuilder(depth + ": " + type);
    if (expr instanceof NameClassAndExpression) {
      List<String> names =
          (List<String>) ((NameClassAndExpression) expr).getNameClass().visit(nameVisitor);
      for (String name : names) {
        sb.append(" \"").append(name).append("\",");
        if (DEBUG) System.out.println(sb);
      }
    } else if (expr instanceof ReferenceExp) {
      sb.append(" '").append(((ReferenceExp) expr).name).append("',");
      if (DEBUG) System.out.println(sb);
    } else if (type == MSVExpressionType.VALUE) {
      sb.append(" '").append(((ValueExp) expr).value).append("',");
      if (DEBUG) System.out.println(sb);
    } else if (type == MSVExpressionType.DATA) {
      sb.append(" '").append(((DataExp) expr).getName().localName).append("',");
      if (DEBUG) System.out.println(sb);
    } else {
      if (DEBUG) System.out.println(sb);
    }
    return sb.toString();
  }
}
