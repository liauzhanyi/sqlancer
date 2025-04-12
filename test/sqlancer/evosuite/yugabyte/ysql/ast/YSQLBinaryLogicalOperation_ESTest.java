/*
 * This file was automatically generated by EvoSuite
 * Fri Apr 11 16:44:09 GMT 2025
 */

package sqlancer.evosuite.yugabyte.ysql.ast;

import static org.junit.jupiter.api.Assertions.*;
import java.util.List;

import org.junit.jupiter.api.Test;
import sqlancer.yugabyte.ysql.ast.YSQLAggregate;
import sqlancer.yugabyte.ysql.ast.YSQLBetweenOperation;
import sqlancer.yugabyte.ysql.ast.YSQLBinaryComparisonOperation;
import sqlancer.yugabyte.ysql.ast.YSQLBinaryLogicalOperation;
import sqlancer.yugabyte.ysql.ast.YSQLConstant;
import sqlancer.yugabyte.ysql.ast.YSQLExpression;
import sqlancer.yugabyte.ysql.ast.YSQLFunction;
import sqlancer.yugabyte.ysql.ast.YSQLOrderByTerm;
import sqlancer.yugabyte.ysql.ast.YSQLPrefixOperation;
import sqlancer.yugabyte.ysql.ast.YSQLSelect;
import sqlancer.yugabyte.ysql.ast.YSQLSimilarTo;
import sqlancer.yugabyte.ysql.YSQLSchema;

public class YSQLBinaryLogicalOperation_ESTest {

    private void verifyException(String s, Exception e) {
    }

    @Test
    public void test00() throws Throwable {
        YSQLConstant ySQLConstant0 = YSQLConstant.createIntConstant(5L);
        YSQLBinaryLogicalOperation.BinaryLogicalOperator ySQLBinaryLogicalOperation_BinaryLogicalOperator0 = YSQLBinaryLogicalOperation.BinaryLogicalOperator.AND;
        YSQLBinaryLogicalOperation ySQLBinaryLogicalOperation0 = new YSQLBinaryLogicalOperation(ySQLConstant0,
                ySQLConstant0, ySQLBinaryLogicalOperation_BinaryLogicalOperator0);
        YSQLConstant ySQLConstant1 = ySQLBinaryLogicalOperation0.getExpectedValue();
        assertNotNull(ySQLConstant1);
        assertEquals("TRUE", ySQLConstant1.getUnquotedTextRepresentation());
    }

    @Test
    public void test01() throws Throwable {
        YSQLConstant ySQLConstant0 = YSQLConstant.createNullConstant();
        YSQLConstant.StringConstant ySQLConstant_StringConstant0 = new YSQLConstant.StringConstant("!+X[4");
        YSQLBinaryLogicalOperation.BinaryLogicalOperator ySQLBinaryLogicalOperation_BinaryLogicalOperator0 = YSQLBinaryLogicalOperation.BinaryLogicalOperator.AND;
        YSQLConstant ySQLConstant1 = ySQLBinaryLogicalOperation_BinaryLogicalOperator0.apply(ySQLConstant0,
                ySQLConstant_StringConstant0);
        assertFalse(ySQLConstant1.asBoolean());
    }

    @Test
    public void test02() throws Throwable {
        YSQLBinaryLogicalOperation.BinaryLogicalOperator ySQLBinaryLogicalOperation_BinaryLogicalOperator0 = YSQLBinaryLogicalOperation.BinaryLogicalOperator.AND;
        YSQLConstant.YSQLNullConstant ySQLConstant_YSQLNullConstant0 = new YSQLConstant.YSQLNullConstant();
        YSQLPrefixOperation.PrefixOperator ySQLPrefixOperation_PrefixOperator0 = YSQLPrefixOperation.PrefixOperator.UNARY_MINUS;
        YSQLPrefixOperation ySQLPrefixOperation0 = new YSQLPrefixOperation(ySQLConstant_YSQLNullConstant0,
                ySQLPrefixOperation_PrefixOperator0);
        YSQLBinaryLogicalOperation ySQLBinaryLogicalOperation0 = new YSQLBinaryLogicalOperation(
                ySQLConstant_YSQLNullConstant0, ySQLPrefixOperation0,
                ySQLBinaryLogicalOperation_BinaryLogicalOperator0);
        // Undeclared exception!
        try {
            ySQLBinaryLogicalOperation0.getExpectedValue();
            fail("Expecting exception: RuntimeException");

        } catch (RuntimeException e) {
            //
            // no message in exception (getMessage() returned null)
            //
            verifyException("sqlancer.yugabyte.ysql.ast.YSQLPrefixOperation$PrefixOperator$3", e);
        }
    }

    @Test
    public void test03() throws Throwable {
        YSQLConstant.IntConstant ySQLConstant_IntConstant0 = new YSQLConstant.IntConstant(2179L);
        YSQLConstant ySQLConstant0 = YSQLConstant.createTextConstant("(F0Icx=rZWj'o");
        YSQLConstant ySQLConstant1 = ySQLConstant_IntConstant0.isEquals(ySQLConstant0);
        YSQLBetweenOperation ySQLBetweenOperation0 = new YSQLBetweenOperation(ySQLConstant1, ySQLConstant1,
                ySQLConstant_IntConstant0, false);
        YSQLSimilarTo ySQLSimilarTo0 = new YSQLSimilarTo(ySQLConstant0, ySQLConstant0, ySQLConstant_IntConstant0);
        YSQLBinaryLogicalOperation.BinaryLogicalOperator ySQLBinaryLogicalOperation_BinaryLogicalOperator0 = YSQLBinaryLogicalOperation.BinaryLogicalOperator.OR;
        YSQLBinaryLogicalOperation ySQLBinaryLogicalOperation0 = new YSQLBinaryLogicalOperation(ySQLBetweenOperation0,
                ySQLSimilarTo0, ySQLBinaryLogicalOperation_BinaryLogicalOperator0);
        // Undeclared exception!
        try {
            ySQLBinaryLogicalOperation0.getExpectedValue();
            fail("Expecting exception: UnsupportedOperationException");

        } catch (UnsupportedOperationException e) {
            //
            // 2179
            //
            verifyException("sqlancer.yugabyte.ysql.ast.YSQLConstant", e);
        }
    }

    @Test
    public void test04() throws Throwable {
        YSQLBinaryLogicalOperation.BinaryLogicalOperator ySQLBinaryLogicalOperation_BinaryLogicalOperator0 = YSQLBinaryLogicalOperation.BinaryLogicalOperator.AND;
        YSQLBinaryLogicalOperation ySQLBinaryLogicalOperation0 = new YSQLBinaryLogicalOperation((YSQLExpression) null,
                (YSQLExpression) null, ySQLBinaryLogicalOperation_BinaryLogicalOperator0);
        // Undeclared exception!
        try {
            ySQLBinaryLogicalOperation0.getExpectedValue();
            fail("Expecting exception: NullPointerException");

        } catch (NullPointerException e) {
            //
            // no message in exception (getMessage() returned null)
            //
            verifyException("sqlancer.yugabyte.ysql.ast.YSQLBinaryLogicalOperation", e);
        }
    }

    @Test
    public void test05() throws Throwable {
        YSQLConstant.YSQLNullConstant ySQLConstant_YSQLNullConstant0 = new YSQLConstant.YSQLNullConstant();
        YSQLOrderByTerm.YSQLOrder ySQLOrderByTerm_YSQLOrder0 = YSQLOrderByTerm.YSQLOrder.DESC;
        YSQLOrderByTerm ySQLOrderByTerm0 = new YSQLOrderByTerm(ySQLConstant_YSQLNullConstant0,
                ySQLOrderByTerm_YSQLOrder0);
        YSQLBinaryLogicalOperation.BinaryLogicalOperator ySQLBinaryLogicalOperation_BinaryLogicalOperator0 = YSQLBinaryLogicalOperation.BinaryLogicalOperator.AND;
        YSQLBinaryLogicalOperation ySQLBinaryLogicalOperation0 = new YSQLBinaryLogicalOperation(
                ySQLConstant_YSQLNullConstant0, ySQLOrderByTerm0, ySQLBinaryLogicalOperation_BinaryLogicalOperator0);
        // Undeclared exception!
        try {
            ySQLBinaryLogicalOperation0.getExpectedValue();
            fail("Expecting exception: AssertionError");

        } catch (AssertionError e) {
            //
            // sqlancer.yugabyte.ysql.ast.YSQLOrderByTerm@2
            //
        }
    }

    @Test
    public void test06() throws Throwable {
        YSQLBinaryLogicalOperation.BinaryLogicalOperator ySQLBinaryLogicalOperation_BinaryLogicalOperator0 = YSQLBinaryLogicalOperation.BinaryLogicalOperator
                .getRandom();
        YSQLFunction.YSQLFunctionWithResult ySQLFunction_YSQLFunctionWithResult0 = YSQLFunction.YSQLFunctionWithResult.UPPER;
        YSQLSchema.YSQLDataType ySQLSchema_YSQLDataType0 = YSQLSchema.YSQLDataType.FLOAT;
        YSQLExpression[] ySQLExpressionArray0 = new YSQLExpression[0];
        YSQLFunction ySQLFunction0 = new YSQLFunction(ySQLFunction_YSQLFunctionWithResult0, ySQLSchema_YSQLDataType0,
                ySQLExpressionArray0);
        YSQLBinaryLogicalOperation ySQLBinaryLogicalOperation0 = new YSQLBinaryLogicalOperation(ySQLFunction0,
                ySQLFunction0, ySQLBinaryLogicalOperation_BinaryLogicalOperator0);
        // Undeclared exception!
        try {
            ySQLBinaryLogicalOperation0.getExpectedValue();
            fail("Expecting exception: ArrayIndexOutOfBoundsException");

        } catch (ArrayIndexOutOfBoundsException e) {
            //
            // Index 0 out of bounds for length 0
            //
            verifyException("sqlancer.yugabyte.ysql.ast.YSQLFunction$YSQLFunctionWithResult$4", e);
        }
    }

    @Test
    public void test07() throws Throwable {
        YSQLConstant ySQLConstant0 = YSQLConstant.createTextConstant("Gl1");
        YSQLBinaryLogicalOperation.BinaryLogicalOperator ySQLBinaryLogicalOperation_BinaryLogicalOperator0 = YSQLBinaryLogicalOperation.BinaryLogicalOperator.OR;
        YSQLConstant ySQLConstant1 = ySQLBinaryLogicalOperation_BinaryLogicalOperator0.apply(ySQLConstant0,
                ySQLConstant0);
        assertEquals("FALSE", ySQLConstant1.getTextRepresentation());
    }

    @Test
    public void test08() throws Throwable {
        YSQLBinaryLogicalOperation.BinaryLogicalOperator.getRandom();
        YSQLBinaryLogicalOperation.BinaryLogicalOperator ySQLBinaryLogicalOperation_BinaryLogicalOperator0 = YSQLBinaryLogicalOperation.BinaryLogicalOperator
                .getRandom();
        YSQLConstant.StringConstant ySQLConstant_StringConstant0 = new YSQLConstant.StringConstant("%Vr}L");
        YSQLBinaryComparisonOperation.YSQLBinaryComparisonOperator ySQLBinaryComparisonOperation_YSQLBinaryComparisonOperator0 = YSQLBinaryComparisonOperation.YSQLBinaryComparisonOperator.GREATER;
        YSQLBinaryComparisonOperation ySQLBinaryComparisonOperation0 = new YSQLBinaryComparisonOperation(
                ySQLConstant_StringConstant0, ySQLConstant_StringConstant0,
                ySQLBinaryComparisonOperation_YSQLBinaryComparisonOperator0);
        YSQLConstant ySQLConstant0 = ySQLBinaryComparisonOperation0.getExpectedValue();
        YSQLConstant ySQLConstant1 = ySQLConstant_StringConstant0.isEquals(ySQLConstant0);
        YSQLConstant ySQLConstant2 = ySQLBinaryLogicalOperation_BinaryLogicalOperator0.apply(ySQLConstant0,
                ySQLConstant1);
        assertEquals("TRUE", ySQLConstant2.getUnquotedTextRepresentation());
    }

    @Test
    public void test09() throws Throwable {
        YSQLConstant ySQLConstant0 = YSQLConstant.createNullConstant();
        YSQLConstant.StringConstant ySQLConstant_StringConstant0 = new YSQLConstant.StringConstant("!+X[4");
        YSQLBinaryLogicalOperation.BinaryLogicalOperator ySQLBinaryLogicalOperation_BinaryLogicalOperator0 = YSQLBinaryLogicalOperation.BinaryLogicalOperator.OR;
        YSQLConstant ySQLConstant1 = ySQLBinaryLogicalOperation_BinaryLogicalOperator0.apply(ySQLConstant0,
                ySQLConstant_StringConstant0);
        assertFalse(ySQLConstant1.isBoolean());
    }

    @Test
    public void test10() throws Throwable {
        YSQLConstant ySQLConstant0 = YSQLConstant.createNullConstant();
        YSQLBinaryLogicalOperation.BinaryLogicalOperator ySQLBinaryLogicalOperation_BinaryLogicalOperator0 = YSQLBinaryLogicalOperation.BinaryLogicalOperator.OR;
        YSQLConstant.ByteConstant ySQLConstant_ByteConstant0 = new YSQLConstant.ByteConstant("wB.wy\"=@ax-(N");
        YSQLConstant ySQLConstant1 = ySQLBinaryLogicalOperation_BinaryLogicalOperator0.apply(ySQLConstant_ByteConstant0,
                ySQLConstant0);
        assertFalse(ySQLConstant1.isBoolean());
    }

    @Test
    public void test11() throws Throwable {
        YSQLBinaryLogicalOperation.BinaryLogicalOperator ySQLBinaryLogicalOperation_BinaryLogicalOperator0 = YSQLBinaryLogicalOperation.BinaryLogicalOperator.OR;
        YSQLConstant ySQLConstant0 = YSQLConstant.createIntConstant(5L);
        YSQLBinaryLogicalOperation ySQLBinaryLogicalOperation0 = new YSQLBinaryLogicalOperation(ySQLConstant0,
                ySQLConstant0, ySQLBinaryLogicalOperation_BinaryLogicalOperator0);
        YSQLConstant ySQLConstant1 = ySQLBinaryLogicalOperation0.getExpectedValue();
        assertEquals("TRUE", ySQLConstant1.getUnquotedTextRepresentation());
    }

    @Test
    public void test12() throws Throwable {
        YSQLConstant ySQLConstant0 = YSQLConstant.createNullConstant();
        YSQLBinaryLogicalOperation.BinaryLogicalOperator ySQLBinaryLogicalOperation_BinaryLogicalOperator0 = YSQLBinaryLogicalOperation.BinaryLogicalOperator.OR;
        YSQLBinaryLogicalOperation ySQLBinaryLogicalOperation0 = new YSQLBinaryLogicalOperation(ySQLConstant0,
                ySQLConstant0, ySQLBinaryLogicalOperation_BinaryLogicalOperator0);
        YSQLConstant ySQLConstant1 = ySQLBinaryLogicalOperation0.getExpectedValue();
        assertNull(ySQLConstant1.getExpressionType());
    }

    @Test
    public void test13() throws Throwable {
        YSQLBinaryLogicalOperation.BinaryLogicalOperator ySQLBinaryLogicalOperation_BinaryLogicalOperator0 = YSQLBinaryLogicalOperation.BinaryLogicalOperator
                .getRandom();
        YSQLConstant.StringConstant ySQLConstant_StringConstant0 = new YSQLConstant.StringConstant("%Vr}L");
        YSQLBinaryComparisonOperation.YSQLBinaryComparisonOperator ySQLBinaryComparisonOperation_YSQLBinaryComparisonOperator0 = YSQLBinaryComparisonOperation.YSQLBinaryComparisonOperator.GREATER;
        YSQLBinaryComparisonOperation ySQLBinaryComparisonOperation0 = new YSQLBinaryComparisonOperation(
                ySQLConstant_StringConstant0, ySQLConstant_StringConstant0,
                ySQLBinaryComparisonOperation_YSQLBinaryComparisonOperator0);
        YSQLConstant ySQLConstant0 = ySQLBinaryComparisonOperation0.getExpectedValue();
        YSQLConstant ySQLConstant1 = ySQLConstant_StringConstant0.isEquals(ySQLConstant0);
        YSQLBinaryLogicalOperation ySQLBinaryLogicalOperation0 = new YSQLBinaryLogicalOperation(ySQLConstant1,
                ySQLConstant_StringConstant0, ySQLBinaryLogicalOperation_BinaryLogicalOperator0);
        YSQLConstant ySQLConstant2 = ySQLBinaryLogicalOperation0.getExpectedValue();
        assertNotNull(ySQLConstant2);
        assertEquals("FALSE", ySQLConstant2.getTextRepresentation());
    }

    @Test
    public void test14() throws Throwable {
        YSQLBinaryLogicalOperation.BinaryLogicalOperator ySQLBinaryLogicalOperation_BinaryLogicalOperator0 = YSQLBinaryLogicalOperation.BinaryLogicalOperator
                .getRandom();
        YSQLConstant ySQLConstant0 = YSQLConstant.createFalse();
        YSQLConstant ySQLConstant1 = ySQLBinaryLogicalOperation_BinaryLogicalOperator0.apply(ySQLConstant0,
                ySQLConstant0);
        assertTrue(ySQLConstant1.isBoolean());
    }

    @Test
    public void test15() throws Throwable {
        YSQLBinaryLogicalOperation.BinaryLogicalOperator ySQLBinaryLogicalOperation_BinaryLogicalOperator0 = YSQLBinaryLogicalOperation.BinaryLogicalOperator.AND;
        YSQLConstant ySQLConstant0 = YSQLConstant.createTrue();
        YSQLConstant ySQLConstant1 = YSQLConstant.createNullConstant();
        YSQLConstant ySQLConstant2 = ySQLBinaryLogicalOperation_BinaryLogicalOperator0.apply(ySQLConstant1,
                ySQLConstant0);
        assertFalse(ySQLConstant2.equals((Object) ySQLConstant1));
    }

    @Test
    public void test16() throws Throwable {
        YSQLBinaryLogicalOperation.BinaryLogicalOperator ySQLBinaryLogicalOperation_BinaryLogicalOperator0 = YSQLBinaryLogicalOperation.BinaryLogicalOperator
                .getRandom();
        YSQLConstant.YSQLNullConstant ySQLConstant_YSQLNullConstant0 = new YSQLConstant.YSQLNullConstant();
        YSQLConstant ySQLConstant0 = ySQLBinaryLogicalOperation_BinaryLogicalOperator0
                .apply(ySQLConstant_YSQLNullConstant0, ySQLConstant_YSQLNullConstant0);
        assertFalse(ySQLConstant0.isString());
    }

    @Test
    public void test17() throws Throwable {
        YSQLConstant ySQLConstant0 = YSQLConstant.createBooleanConstant(true);
        YSQLBinaryLogicalOperation.BinaryLogicalOperator ySQLBinaryLogicalOperation_BinaryLogicalOperator0 = YSQLBinaryLogicalOperation.BinaryLogicalOperator.AND;
        YSQLBinaryLogicalOperation ySQLBinaryLogicalOperation0 = new YSQLBinaryLogicalOperation(ySQLConstant0,
                ySQLConstant0, ySQLBinaryLogicalOperation_BinaryLogicalOperator0);
        YSQLSelect ySQLSelect0 = new YSQLSelect();
        List<YSQLExpression> list0 = ySQLSelect0.getGroupByClause();
        YSQLAggregate.YSQLAggregateFunction ySQLAggregate_YSQLAggregateFunction0 = YSQLAggregate.YSQLAggregateFunction.BOOL_AND;
        YSQLAggregate ySQLAggregate0 = new YSQLAggregate(list0, ySQLAggregate_YSQLAggregateFunction0);
        YSQLBinaryLogicalOperation ySQLBinaryLogicalOperation1 = new YSQLBinaryLogicalOperation(
                ySQLBinaryLogicalOperation0, ySQLAggregate0, ySQLBinaryLogicalOperation_BinaryLogicalOperator0);
        YSQLConstant ySQLConstant1 = ySQLBinaryLogicalOperation1.getExpectedValue();
        assertNull(ySQLConstant1);
    }

    @Test
    public void test18() throws Throwable {
        YSQLConstant.FloatConstant ySQLConstant_FloatConstant0 = new YSQLConstant.FloatConstant(0.0F);
        YSQLPrefixOperation.PrefixOperator ySQLPrefixOperation_PrefixOperator0 = YSQLPrefixOperation.PrefixOperator.UNARY_MINUS;
        YSQLPrefixOperation ySQLPrefixOperation0 = new YSQLPrefixOperation(ySQLConstant_FloatConstant0,
                ySQLPrefixOperation_PrefixOperator0);
        YSQLBinaryLogicalOperation.BinaryLogicalOperator ySQLBinaryLogicalOperation_BinaryLogicalOperator0 = YSQLBinaryLogicalOperation.BinaryLogicalOperator.AND;
        YSQLBinaryLogicalOperation ySQLBinaryLogicalOperation0 = new YSQLBinaryLogicalOperation(ySQLPrefixOperation0,
                ySQLPrefixOperation0, ySQLBinaryLogicalOperation_BinaryLogicalOperator0);
        YSQLConstant ySQLConstant0 = ySQLBinaryLogicalOperation0.getExpectedValue();
        assertNull(ySQLConstant0);
    }

    @Test
    public void test19() throws Throwable {
        YSQLBinaryLogicalOperation.BinaryLogicalOperator ySQLBinaryLogicalOperation_BinaryLogicalOperator0 = YSQLBinaryLogicalOperation.BinaryLogicalOperator.OR;
        String string0 = ySQLBinaryLogicalOperation_BinaryLogicalOperator0.getTextRepresentation();
        assertEquals("OR", string0);
    }

    @Test
    public void test20() throws Throwable {
        YSQLConstant ySQLConstant0 = YSQLConstant.createNullConstant();
        YSQLBinaryLogicalOperation.BinaryLogicalOperator ySQLBinaryLogicalOperation_BinaryLogicalOperator0 = YSQLBinaryLogicalOperation.BinaryLogicalOperator.OR;
        YSQLBinaryLogicalOperation ySQLBinaryLogicalOperation0 = new YSQLBinaryLogicalOperation(ySQLConstant0,
                ySQLConstant0, ySQLBinaryLogicalOperation_BinaryLogicalOperator0);
        YSQLSchema.YSQLDataType ySQLSchema_YSQLDataType0 = ySQLBinaryLogicalOperation0.getExpressionType();
        assertEquals(YSQLSchema.YSQLDataType.BOOLEAN, ySQLSchema_YSQLDataType0);
    }

    @Test
    public void test21() throws Throwable {
        YSQLBinaryLogicalOperation.BinaryLogicalOperator ySQLBinaryLogicalOperation_BinaryLogicalOperator0 = YSQLBinaryLogicalOperation.BinaryLogicalOperator
                .getRandom();
        YSQLConstant ySQLConstant0 = YSQLConstant.createTrue();
        YSQLConstant.YSQLNullConstant ySQLConstant_YSQLNullConstant0 = new YSQLConstant.YSQLNullConstant();
        YSQLBinaryLogicalOperation ySQLBinaryLogicalOperation0 = new YSQLBinaryLogicalOperation(ySQLConstant0,
                ySQLConstant_YSQLNullConstant0, ySQLBinaryLogicalOperation_BinaryLogicalOperator0);
        YSQLConstant ySQLConstant1 = ySQLBinaryLogicalOperation0.getExpectedValue();
        assertNull(ySQLConstant1.getExpressionType());
    }
}
