/*
 * This file was automatically generated by EvoSuite
 * Fri Apr 11 19:04:13 GMT 2025
 */

package sqlancer.evosuite.yugabyte.ycql.ast;

import org.junit.jupiter.api.Test;
import sqlancer.yugabyte.ycql.ast.YCQLColumnReference;
import sqlancer.yugabyte.ycql.YCQLSchema;

public class YCQLColumnReference_ESTest {

    @Test
    public void test0() throws Throwable {
        YCQLSchema.YCQLCompositeDataType yCQLSchema_YCQLCompositeDataType0 = YCQLSchema.YCQLCompositeDataType
                .getRandom();
        YCQLSchema.YCQLColumn yCQLSchema_YCQLColumn0 = new YCQLSchema.YCQLColumn((String) null,
                yCQLSchema_YCQLCompositeDataType0, false, false);
        YCQLColumnReference yCQLColumnReference0 = new YCQLColumnReference(yCQLSchema_YCQLColumn0);
    }
}
