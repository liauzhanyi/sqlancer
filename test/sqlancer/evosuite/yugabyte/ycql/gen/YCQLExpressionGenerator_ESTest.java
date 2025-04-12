/*
 * This file was automatically generated by EvoSuite
 * Fri Apr 11 17:21:15 GMT 2025
 */

package sqlancer.evosuite.yugabyte.ycql.gen;

import static org.junit.jupiter.api.Assertions.*;
import java.util.LinkedList;
import java.util.List;

import org.junit.jupiter.api.Test;
import sqlancer.common.ast.BinaryOperatorNode;
import sqlancer.yugabyte.ycql.ast.YCQLConstant;
import sqlancer.yugabyte.ycql.ast.YCQLExpression;
import sqlancer.yugabyte.ycql.gen.YCQLExpressionGenerator;
import sqlancer.yugabyte.ycql.YCQLProvider;
import sqlancer.yugabyte.ycql.YCQLSchema;
import sqlancer.yugabyte.YugabyteBugs;

public class YCQLExpressionGenerator_ESTest {

    private void verifyException(String s, Exception e) {
    }

    @Test
    public void test00() throws Throwable {
        YCQLProvider.YCQLGlobalState yCQLProvider_YCQLGlobalState0 = new YCQLProvider.YCQLGlobalState();
        YCQLExpressionGenerator yCQLExpressionGenerator0 = new YCQLExpressionGenerator(yCQLProvider_YCQLGlobalState0);
        LinkedList<YCQLSchema.YCQLColumn> linkedList0 = new LinkedList<YCQLSchema.YCQLColumn>();
        YCQLSchema.YCQLDataType yCQLSchema_YCQLDataType0 = YCQLSchema.YCQLDataType.INT;
        YCQLSchema.YCQLCompositeDataType yCQLSchema_YCQLCompositeDataType0 = new YCQLSchema.YCQLCompositeDataType(
                yCQLSchema_YCQLDataType0, (-3490));
        YCQLSchema.YCQLColumn yCQLSchema_YCQLColumn0 = new YCQLSchema.YCQLColumn("I5yX$}0iJOum",
                yCQLSchema_YCQLCompositeDataType0, false, false);
        linkedList0.add(yCQLSchema_YCQLColumn0);
        yCQLExpressionGenerator0.setColumns((List<YCQLSchema.YCQLColumn>) linkedList0);
        YCQLExpression yCQLExpression0 = yCQLExpressionGenerator0.generateColumn();
        assertNotNull(yCQLExpression0);
    }

    @Test
    public void test01() throws Throwable {
        YCQLProvider.YCQLGlobalState yCQLProvider_YCQLGlobalState0 = new YCQLProvider.YCQLGlobalState();
        YCQLExpressionGenerator yCQLExpressionGenerator0 = new YCQLExpressionGenerator(yCQLProvider_YCQLGlobalState0);
        // Undeclared exception!
        try {
            yCQLExpressionGenerator0.generateOrderBys();
            fail("Expecting exception: NullPointerException");

        } catch (NullPointerException e) {
            //
            // no message in exception (getMessage() returned null)
            //
            verifyException("sqlancer.yugabyte.ycql.gen.YCQLExpressionGenerator", e);
        }
    }

    @Test
    public void test02() throws Throwable {
        YCQLProvider.YCQLGlobalState yCQLProvider_YCQLGlobalState0 = new YCQLProvider.YCQLGlobalState();
        YCQLExpressionGenerator yCQLExpressionGenerator0 = new YCQLExpressionGenerator(yCQLProvider_YCQLGlobalState0);
        // Undeclared exception!
        try {
            yCQLExpressionGenerator0.generateExpression(9042);
            fail("Expecting exception: NullPointerException");

        } catch (NullPointerException e) {
            //
            // no message in exception (getMessage() returned null)
            //
            verifyException("sqlancer.yugabyte.ycql.gen.YCQLExpressionGenerator", e);
        }
    }

    @Test
    public void test03() throws Throwable {
        YCQLProvider.YCQLGlobalState yCQLProvider_YCQLGlobalState0 = new YCQLProvider.YCQLGlobalState();
        YCQLExpressionGenerator yCQLExpressionGenerator0 = new YCQLExpressionGenerator(yCQLProvider_YCQLGlobalState0);
        LinkedList<YCQLSchema.YCQLColumn> linkedList0 = new LinkedList<YCQLSchema.YCQLColumn>();
        yCQLExpressionGenerator0.setColumns((List<YCQLSchema.YCQLColumn>) linkedList0);
        // Undeclared exception!
        try {
            yCQLExpressionGenerator0.generateColumn();
            fail("Expecting exception: IndexOutOfBoundsException");

        } catch (IndexOutOfBoundsException e) {
            //
            // Index: 0, Size: 0
            //
            verifyException("java.util.LinkedList", e);
        }
    }

    @Test
    public void test04() throws Throwable {
        YCQLExpressionGenerator.YCQLAggregateFunction yCQLExpressionGenerator_YCQLAggregateFunction0 = YCQLExpressionGenerator.YCQLAggregateFunction
                .getRandom();
        int int0 = yCQLExpressionGenerator_YCQLAggregateFunction0.getNrArgs();
        assertEquals(1, int0);
    }

    @Test
    public void test05() throws Throwable {
        YCQLExpressionGenerator.DBFunction yCQLExpressionGenerator_DBFunction0 = YCQLExpressionGenerator.DBFunction.DATE;
        int int0 = yCQLExpressionGenerator_DBFunction0.getNrArgs();
        assertEquals(0, int0);
    }

    @Test
    public void test06() throws Throwable {
        YCQLProvider.YCQLGlobalState yCQLProvider_YCQLGlobalState0 = new YCQLProvider.YCQLGlobalState();
        YCQLExpressionGenerator yCQLExpressionGenerator0 = new YCQLExpressionGenerator(yCQLProvider_YCQLGlobalState0);
        // Undeclared exception!
        try {
            yCQLExpressionGenerator0.generateConstant();
            fail("Expecting exception: NullPointerException");

        } catch (NullPointerException e) {
            //
            // no message in exception (getMessage() returned null)
            //
            verifyException("sqlancer.yugabyte.ycql.gen.YCQLExpressionGenerator", e);
        }
    }

    @Test
    public void test07() throws Throwable {
        YCQLProvider.YCQLGlobalState yCQLProvider_YCQLGlobalState0 = new YCQLProvider.YCQLGlobalState();
        YCQLExpressionGenerator yCQLExpressionGenerator0 = new YCQLExpressionGenerator(yCQLProvider_YCQLGlobalState0);
        // Undeclared exception!
        try {
            yCQLExpressionGenerator0.generateConstant();
            fail("Expecting exception: NullPointerException");

        } catch (NullPointerException e) {
            //
            // no message in exception (getMessage() returned null)
            //
            verifyException("sqlancer.yugabyte.ycql.gen.YCQLExpressionGenerator", e);
        }
    }

    @Test
    public void test08() throws Throwable {
        YCQLProvider.YCQLGlobalState yCQLProvider_YCQLGlobalState0 = new YCQLProvider.YCQLGlobalState();
        YCQLExpressionGenerator yCQLExpressionGenerator0 = new YCQLExpressionGenerator(yCQLProvider_YCQLGlobalState0);
        // Undeclared exception!
        try {
            yCQLExpressionGenerator0.generateConstant();
            fail("Expecting exception: NullPointerException");

        } catch (NullPointerException e) {
            //
            // no message in exception (getMessage() returned null)
            //
            verifyException("sqlancer.yugabyte.ycql.gen.YCQLExpressionGenerator", e);
        }
    }

    @Test
    public void test09() throws Throwable {
        YCQLProvider.YCQLGlobalState yCQLProvider_YCQLGlobalState0 = new YCQLProvider.YCQLGlobalState();
        YCQLExpressionGenerator yCQLExpressionGenerator0 = new YCQLExpressionGenerator(yCQLProvider_YCQLGlobalState0);
        YCQLConstant.YCQLBooleanConstant yCQLConstant_YCQLBooleanConstant0 = (YCQLConstant.YCQLBooleanConstant) yCQLExpressionGenerator0
                .generateConstant();
        assertFalse(yCQLConstant_YCQLBooleanConstant0.getValue());
    }

    @Test
    public void test10() throws Throwable {
        YCQLExpressionGenerator.YCQLUnaryPostfixOperator.getRandom();
        YCQLProvider.YCQLGlobalState yCQLProvider_YCQLGlobalState0 = new YCQLProvider.YCQLGlobalState();
        YCQLExpressionGenerator yCQLExpressionGenerator0 = new YCQLExpressionGenerator(yCQLProvider_YCQLGlobalState0);
        YugabyteBugs.bug14330 = false;
        YCQLConstant.YCQLNullConstant yCQLConstant_YCQLNullConstant0 = (YCQLConstant.YCQLNullConstant) yCQLExpressionGenerator0
                .generateConstant();
        assertEquals("NULL", yCQLConstant_YCQLNullConstant0.toString());
    }

    @Test
    public void test11() throws Throwable {
        YCQLExpressionGenerator.YCQLUnaryPostfixOperator.getRandom();
        YCQLProvider.YCQLGlobalState yCQLProvider_YCQLGlobalState0 = new YCQLProvider.YCQLGlobalState();
        YCQLExpressionGenerator yCQLExpressionGenerator0 = new YCQLExpressionGenerator(yCQLProvider_YCQLGlobalState0);
        // Undeclared exception!
        try {
            yCQLExpressionGenerator0.generateConstant();
            fail("Expecting exception: RuntimeException");

        } catch (RuntimeException e) {
            //
            // no message in exception (getMessage() returned null)
            //
            verifyException("sqlancer.yugabyte.ycql.gen.YCQLExpressionGenerator", e);
        }
    }

    @Test
    public void test12() throws Throwable {
        YCQLProvider.YCQLGlobalState yCQLProvider_YCQLGlobalState0 = new YCQLProvider.YCQLGlobalState();
        YCQLExpressionGenerator yCQLExpressionGenerator0 = new YCQLExpressionGenerator(yCQLProvider_YCQLGlobalState0);
        // Undeclared exception!
        try {
            yCQLExpressionGenerator0.generateConstant();
            fail("Expecting exception: NullPointerException");

        } catch (NullPointerException e) {
            //
            // no message in exception (getMessage() returned null)
            //
            verifyException("sqlancer.yugabyte.ycql.gen.YCQLExpressionGenerator", e);
        }
    }

    @Test
    public void test13() throws Throwable {
        YCQLExpressionGenerator.YCQLBinaryArithmeticOperator yCQLExpressionGenerator_YCQLBinaryArithmeticOperator0 = YCQLExpressionGenerator.YCQLBinaryArithmeticOperator.DIV;
        String string0 = yCQLExpressionGenerator_YCQLBinaryArithmeticOperator0.getTextRepresentation();
        assertEquals("/", string0);
    }

    @Test
    public void test14() throws Throwable {
        BinaryOperatorNode.Operator binaryOperatorNode_Operator0 = YCQLExpressionGenerator.YCQLBinaryArithmeticOperator
                .getRandom();
        assertEquals(YCQLExpressionGenerator.YCQLBinaryArithmeticOperator.ADD, binaryOperatorNode_Operator0);
    }

    @Test
    public void test15() throws Throwable {
        YCQLExpressionGenerator.YCQLBinaryLogicalOperator yCQLExpressionGenerator_YCQLBinaryLogicalOperator0 = YCQLExpressionGenerator.YCQLBinaryLogicalOperator.AND;
        String string0 = yCQLExpressionGenerator_YCQLBinaryLogicalOperator0.getTextRepresentation();
        assertEquals("AND", string0);
    }

    @Test
    public void test16() throws Throwable {
        YCQLExpressionGenerator.YCQLBinaryLogicalOperator.getRandom();
        YCQLExpressionGenerator.YCQLUnaryPrefixOperator.getRandom();
        YCQLProvider.YCQLGlobalState yCQLProvider_YCQLGlobalState0 = new YCQLProvider.YCQLGlobalState();
        YCQLExpressionGenerator yCQLExpressionGenerator0 = new YCQLExpressionGenerator(yCQLProvider_YCQLGlobalState0);
        // Undeclared exception!
        try {
            yCQLExpressionGenerator0.generateConstant();
            fail("Expecting exception: NullPointerException");

        } catch (NullPointerException e) {
            //
            // no message in exception (getMessage() returned null)
            //
            verifyException("sqlancer.yugabyte.ycql.gen.YCQLExpressionGenerator", e);
        }
    }

    @Test
    public void test17() throws Throwable {
        BinaryOperatorNode.Operator binaryOperatorNode_Operator0 = YCQLExpressionGenerator.YCQLBinaryComparisonOperator
                .getRandom();
        assertEquals(YCQLExpressionGenerator.YCQLBinaryComparisonOperator.EQUALS, binaryOperatorNode_Operator0);
    }

    @Test
    public void test18() throws Throwable {
        YCQLExpressionGenerator.YCQLBinaryComparisonOperator yCQLExpressionGenerator_YCQLBinaryComparisonOperator0 = YCQLExpressionGenerator.YCQLBinaryComparisonOperator.GREATER;
        String string0 = yCQLExpressionGenerator_YCQLBinaryComparisonOperator0.getTextRepresentation();
        assertEquals(">", string0);
    }

    @Test
    public void test19() throws Throwable {
        YCQLExpressionGenerator.YCQLUnaryPrefixOperator yCQLExpressionGenerator_YCQLUnaryPrefixOperator0 = YCQLExpressionGenerator.YCQLUnaryPrefixOperator
                .getRandom();
        String string0 = yCQLExpressionGenerator_YCQLUnaryPrefixOperator0.getTextRepresentation();
        assertEquals("NOT", string0);
    }

    @Test
    public void test20() throws Throwable {
        YCQLExpressionGenerator.YCQLUnaryPostfixOperator yCQLExpressionGenerator_YCQLUnaryPostfixOperator0 = YCQLExpressionGenerator.YCQLUnaryPostfixOperator
                .getRandom();
        String string0 = yCQLExpressionGenerator_YCQLUnaryPostfixOperator0.getTextRepresentation();
        assertEquals("IS NULL", string0);
    }

    @Test
    public void test21() throws Throwable {
        YCQLProvider.YCQLGlobalState yCQLProvider_YCQLGlobalState0 = new YCQLProvider.YCQLGlobalState();
        YCQLExpressionGenerator yCQLExpressionGenerator0 = new YCQLExpressionGenerator(yCQLProvider_YCQLGlobalState0);
        // Undeclared exception!
        try {
            yCQLExpressionGenerator0.generateAggregate();
            fail("Expecting exception: NullPointerException");

        } catch (NullPointerException e) {
            //
            // no message in exception (getMessage() returned null)
            //
            verifyException("sqlancer.yugabyte.ycql.gen.YCQLExpressionGenerator", e);
        }
    }

    @Test
    public void test22() throws Throwable {
        YCQLProvider.YCQLGlobalState yCQLProvider_YCQLGlobalState0 = new YCQLProvider.YCQLGlobalState();
        YCQLExpressionGenerator yCQLExpressionGenerator0 = new YCQLExpressionGenerator(yCQLProvider_YCQLGlobalState0);
        YCQLExpression yCQLExpression0 = yCQLExpressionGenerator0.isNull((YCQLExpression) null);
        assertNotNull(yCQLExpression0);
    }

    @Test
    public void test23() throws Throwable {
        YCQLProvider.YCQLGlobalState yCQLProvider_YCQLGlobalState0 = new YCQLProvider.YCQLGlobalState();
        YCQLExpressionGenerator yCQLExpressionGenerator0 = new YCQLExpressionGenerator(yCQLProvider_YCQLGlobalState0);
        // Undeclared exception!
        try {
            yCQLExpressionGenerator0.generateColumn();
            fail("Expecting exception: NullPointerException");

        } catch (NullPointerException e) {
            //
            // no message in exception (getMessage() returned null)
            //
            verifyException("sqlancer.Randomly", e);
        }
    }

    @Test
    public void test24() throws Throwable {
        YCQLExpressionGenerator yCQLExpressionGenerator0 = new YCQLExpressionGenerator(
                (YCQLProvider.YCQLGlobalState) null);
        YCQLExpression yCQLExpression0 = yCQLExpressionGenerator0.negatePredicate((YCQLExpression) null);
        assertNotNull(yCQLExpression0);
    }

    @Test
    public void test25() throws Throwable {
        YCQLProvider.YCQLGlobalState yCQLProvider_YCQLGlobalState0 = new YCQLProvider.YCQLGlobalState();
        YCQLExpressionGenerator yCQLExpressionGenerator0 = new YCQLExpressionGenerator(yCQLProvider_YCQLGlobalState0);
        YCQLExpressionGenerator.YCQLAggregateFunction yCQLExpressionGenerator_YCQLAggregateFunction0 = YCQLExpressionGenerator.YCQLAggregateFunction.MAX;
        // Undeclared exception!
        try {
            yCQLExpressionGenerator0.generateArgsForAggregate(yCQLExpressionGenerator_YCQLAggregateFunction0);
            fail("Expecting exception: NullPointerException");

        } catch (NullPointerException e) {
            //
            // no message in exception (getMessage() returned null)
            //
            verifyException("sqlancer.yugabyte.ycql.gen.YCQLExpressionGenerator", e);
        }
    }

    @Test
    public void test26() throws Throwable {
        YCQLExpressionGenerator.DBFunction yCQLExpressionGenerator_DBFunction0 = YCQLExpressionGenerator.DBFunction
                .getRandom();
        assertEquals(YCQLExpressionGenerator.DBFunction.BLOB, yCQLExpressionGenerator_DBFunction0);
    }
}
