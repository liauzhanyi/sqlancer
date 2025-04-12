/*
 * This file was automatically generated by EvoSuite
 * Fri Apr 11 23:03:00 GMT 2025
 */

package sqlancer.evosuite.yugabyte.ysql.ast;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import sqlancer.yugabyte.ysql.ast.YSQLBinaryRangeOperation;
import sqlancer.yugabyte.ysql.ast.YSQLCastOperation;
import sqlancer.yugabyte.ysql.ast.YSQLConstant;
import sqlancer.yugabyte.ysql.ast.YSQLExpression;
import sqlancer.yugabyte.ysql.ast.YSQLFunction;
import sqlancer.yugabyte.ysql.ast.YSQLOrderByTerm;
import sqlancer.yugabyte.ysql.ast.YSQLPOSIXRegularExpression;
import sqlancer.yugabyte.ysql.ast.YSQLSelect;
import sqlancer.yugabyte.ysql.YSQLCompoundDataType;
import sqlancer.yugabyte.ysql.YSQLSchema;

public class YSQLCastOperation_ESTest {

    private void verifyException(String s, Exception e) {
    }

    @Test
    public void test00() throws Throwable {
        YSQLExpression ySQLExpression0 = YSQLConstant.createBitConstant(1L);
        YSQLSchema.YSQLDataType ySQLSchema_YSQLDataType0 = YSQLSchema.YSQLDataType.DECIMAL;
        YSQLCompoundDataType ySQLCompoundDataType0 = YSQLCompoundDataType.create(ySQLSchema_YSQLDataType0, 0);
        YSQLCastOperation ySQLCastOperation0 = new YSQLCastOperation(ySQLExpression0, ySQLCompoundDataType0);
        YSQLSchema.YSQLDataType ySQLSchema_YSQLDataType1 = ySQLCastOperation0.getType();
        assertSame(ySQLSchema_YSQLDataType1, ySQLSchema_YSQLDataType0);
    }

    @Test
    public void test01() throws Throwable {
        YSQLExpression ySQLExpression0 = YSQLConstant.createBitConstant(1L);
        YSQLSchema.YSQLDataType ySQLSchema_YSQLDataType0 = YSQLSchema.YSQLDataType.DECIMAL;
        YSQLCompoundDataType ySQLCompoundDataType0 = YSQLCompoundDataType.create(ySQLSchema_YSQLDataType0, 0);
        YSQLCastOperation ySQLCastOperation0 = new YSQLCastOperation(ySQLExpression0, ySQLCompoundDataType0);
        YSQLSchema.YSQLDataType ySQLSchema_YSQLDataType1 = ySQLCastOperation0.getExpressionType();
        assertSame(ySQLSchema_YSQLDataType1, ySQLSchema_YSQLDataType0);
    }

    @Test
    public void test02() throws Throwable {
        YSQLConstant.YSQLNullConstant ySQLConstant_YSQLNullConstant0 = new YSQLConstant.YSQLNullConstant();
        YSQLSchema.YSQLDataType ySQLSchema_YSQLDataType0 = YSQLSchema.YSQLDataType.TEXT;
        YSQLCompoundDataType ySQLCompoundDataType0 = YSQLCompoundDataType.create(ySQLSchema_YSQLDataType0, 0);
        YSQLCastOperation ySQLCastOperation0 = new YSQLCastOperation(ySQLConstant_YSQLNullConstant0,
                ySQLCompoundDataType0);
        YSQLConstant ySQLConstant0 = ySQLCastOperation0.getExpectedValue();
        assertNull(ySQLConstant0.getExpressionType());
    }

    @Test
    public void test03() throws Throwable {
        YSQLSchema.YSQLDataType ySQLSchema_YSQLDataType0 = YSQLSchema.YSQLDataType.INT;
        YSQLConstant ySQLConstant0 = YSQLConstant.createByteConstant("");
        YSQLCompoundDataType ySQLCompoundDataType0 = YSQLCompoundDataType.create(ySQLSchema_YSQLDataType0);
        YSQLCastOperation ySQLCastOperation0 = new YSQLCastOperation(ySQLConstant0, ySQLCompoundDataType0);
        YSQLConstant ySQLConstant1 = ySQLCastOperation0.getExpectedValue();
        assertEquals("-1", ySQLConstant1.getTextRepresentation());
    }

    @Test
    public void test04() throws Throwable {
        YSQLConstant.IntConstant ySQLConstant_IntConstant0 = new YSQLConstant.IntConstant(1000L);
        YSQLSchema.YSQLDataType ySQLSchema_YSQLDataType0 = YSQLSchema.YSQLDataType.BOOLEAN;
        YSQLConstant ySQLConstant0 = ySQLConstant_IntConstant0.cast(ySQLSchema_YSQLDataType0);
        YSQLCompoundDataType ySQLCompoundDataType0 = YSQLCompoundDataType.create(ySQLSchema_YSQLDataType0, (-2360));
        YSQLCastOperation ySQLCastOperation0 = new YSQLCastOperation(ySQLConstant0, ySQLCompoundDataType0);
        YSQLConstant ySQLConstant1 = ySQLCastOperation0.getExpectedValue();
        assertSame(ySQLConstant0, ySQLConstant1);
    }

    @Test
    public void test05() throws Throwable {
        YSQLConstant.BooleanConstant ySQLConstant_BooleanConstant0 = new YSQLConstant.BooleanConstant(true);
        YSQLPOSIXRegularExpression.POSIXRegex ySQLPOSIXRegularExpression_POSIXRegex0 = YSQLPOSIXRegularExpression.POSIXRegex.MATCH_CASE_SENSITIVE;
        YSQLPOSIXRegularExpression ySQLPOSIXRegularExpression0 = new YSQLPOSIXRegularExpression(
                ySQLConstant_BooleanConstant0, ySQLConstant_BooleanConstant0, ySQLPOSIXRegularExpression_POSIXRegex0);
        YSQLCastOperation ySQLCastOperation0 = new YSQLCastOperation(ySQLPOSIXRegularExpression0,
                (YSQLCompoundDataType) null);
        YSQLCompoundDataType ySQLCompoundDataType0 = ySQLCastOperation0.getCompoundType();
        assertNull(ySQLCompoundDataType0);
    }

    @Test
    public void test06() throws Throwable {
        YSQLConstant.BooleanConstant ySQLConstant_BooleanConstant0 = new YSQLConstant.BooleanConstant(true);
        YSQLPOSIXRegularExpression.POSIXRegex ySQLPOSIXRegularExpression_POSIXRegex0 = YSQLPOSIXRegularExpression.POSIXRegex.MATCH_CASE_SENSITIVE;
        YSQLPOSIXRegularExpression ySQLPOSIXRegularExpression0 = new YSQLPOSIXRegularExpression(
                ySQLConstant_BooleanConstant0, ySQLConstant_BooleanConstant0, ySQLPOSIXRegularExpression_POSIXRegex0);
        YSQLCastOperation ySQLCastOperation0 = new YSQLCastOperation(ySQLPOSIXRegularExpression0,
                (YSQLCompoundDataType) null);
        // Undeclared exception!
        try {
            ySQLCastOperation0.getType();
            fail("Expecting exception: NullPointerException");

        } catch (NullPointerException e) {
            //
            // no message in exception (getMessage() returned null)
            //
            verifyException("sqlancer.yugabyte.ysql.ast.YSQLCastOperation", e);
        }
    }

    @Test
    public void test07() throws Throwable {
        YSQLConstant.YSQLNullConstant ySQLConstant_YSQLNullConstant0 = new YSQLConstant.YSQLNullConstant();
        YSQLCastOperation ySQLCastOperation0 = new YSQLCastOperation(ySQLConstant_YSQLNullConstant0,
                (YSQLCompoundDataType) null);
        // Undeclared exception!
        try {
            ySQLCastOperation0.getExpressionType();
            fail("Expecting exception: NullPointerException");

        } catch (NullPointerException e) {
            //
            // no message in exception (getMessage() returned null)
            //
            verifyException("sqlancer.yugabyte.ysql.ast.YSQLCastOperation", e);
        }
    }

    @Test
    public void test08() throws Throwable {
        YSQLConstant.YSQLNullConstant ySQLConstant_YSQLNullConstant0 = new YSQLConstant.YSQLNullConstant();
        YSQLCastOperation ySQLCastOperation0 = new YSQLCastOperation(ySQLConstant_YSQLNullConstant0,
                (YSQLCompoundDataType) null);
        // Undeclared exception!
        try {
            ySQLCastOperation0.getExpectedValue();
            fail("Expecting exception: NullPointerException");

        } catch (NullPointerException e) {
            //
            // no message in exception (getMessage() returned null)
            //
            verifyException("sqlancer.yugabyte.ysql.ast.YSQLCastOperation", e);
        }
    }

    @Test
    public void test09() throws Throwable {
        YSQLOrderByTerm.YSQLOrder ySQLOrderByTerm_YSQLOrder0 = YSQLOrderByTerm.YSQLOrder.ASC;
        YSQLOrderByTerm ySQLOrderByTerm0 = new YSQLOrderByTerm((YSQLExpression) null, ySQLOrderByTerm_YSQLOrder0);
        YSQLCastOperation ySQLCastOperation0 = new YSQLCastOperation(ySQLOrderByTerm0, (YSQLCompoundDataType) null);
        // Undeclared exception!
        try {
            ySQLCastOperation0.getExpectedValue();
            fail("Expecting exception: AssertionError");

        } catch (AssertionError e) {
            //
            // sqlancer.yugabyte.ysql.ast.YSQLOrderByTerm@1
            //
        }
    }

    @Test
    public void test10() throws Throwable {
        YSQLFunction.YSQLFunctionWithResult ySQLFunction_YSQLFunctionWithResult0 = YSQLFunction.YSQLFunctionWithResult.ABS;
        YSQLSchema.YSQLDataType ySQLSchema_YSQLDataType0 = YSQLSchema.YSQLDataType.REAL;
        YSQLExpression[] ySQLExpressionArray0 = new YSQLExpression[0];
        YSQLFunction ySQLFunction0 = new YSQLFunction(ySQLFunction_YSQLFunctionWithResult0, ySQLSchema_YSQLDataType0,
                ySQLExpressionArray0);
        YSQLCastOperation ySQLCastOperation0 = new YSQLCastOperation(ySQLFunction0, (YSQLCompoundDataType) null);
        // Undeclared exception!
        try {
            ySQLCastOperation0.getExpectedValue();
            fail("Expecting exception: ArrayIndexOutOfBoundsException");

        } catch (ArrayIndexOutOfBoundsException e) {
            //
            // Index 0 out of bounds for length 0
            //
            verifyException("sqlancer.yugabyte.ysql.ast.YSQLFunction$YSQLFunctionWithResult$1", e);
        }
    }

    @Test
    public void test11() throws Throwable {
        YSQLSelect ySQLSelect0 = new YSQLSelect();
        YSQLCastOperation ySQLCastOperation0 = new YSQLCastOperation(ySQLSelect0, (YSQLCompoundDataType) null);
        YSQLConstant ySQLConstant0 = ySQLCastOperation0.getExpectedValue();
        assertNull(ySQLConstant0);
    }

    @Test
    public void test12() throws Throwable {
        YSQLSchema.YSQLDataType ySQLSchema_YSQLDataType0 = YSQLSchema.YSQLDataType.TEXT;
        YSQLConstant ySQLConstant0 = YSQLConstant.createFalse();
        YSQLCompoundDataType ySQLCompoundDataType0 = YSQLCompoundDataType.create(ySQLSchema_YSQLDataType0, 0);
        YSQLCastOperation ySQLCastOperation0 = new YSQLCastOperation(ySQLConstant0, ySQLCompoundDataType0);
        YSQLConstant ySQLConstant1 = ySQLCastOperation0.getExpectedValue();
        assertEquals("false", ySQLConstant1.asString());
    }

    @Test
    public void test13() throws Throwable {
        YSQLCastOperation ySQLCastOperation0 = null;
        try {
            ySQLCastOperation0 = new YSQLCastOperation((YSQLExpression) null, (YSQLCompoundDataType) null);
            fail("Expecting exception: AssertionError");

        } catch (AssertionError e) {
            //
            // no message in exception (getMessage() returned null)
            //
        }
    }

    @Test
    public void test14() throws Throwable {
        YSQLConstant.YSQLNullConstant ySQLConstant_YSQLNullConstant0 = new YSQLConstant.YSQLNullConstant();
        YSQLCompoundDataType ySQLCompoundDataType0 = YSQLCompoundDataType.create((YSQLSchema.YSQLDataType) null);
        YSQLCastOperation ySQLCastOperation0 = new YSQLCastOperation(ySQLConstant_YSQLNullConstant0,
                ySQLCompoundDataType0);
        ySQLCastOperation0.getExpressionType();
    }

    @Test
    public void test15() throws Throwable {
        YSQLSchema.YSQLDataType ySQLSchema_YSQLDataType0 = YSQLSchema.YSQLDataType.BIT;
        YSQLCompoundDataType ySQLCompoundDataType0 = YSQLCompoundDataType.create(ySQLSchema_YSQLDataType0);
        YSQLBinaryRangeOperation.YSQLBinaryRangeComparisonOperator ySQLBinaryRangeOperation_YSQLBinaryRangeComparisonOperator0 = YSQLBinaryRangeOperation.YSQLBinaryRangeComparisonOperator.STRICT_LEFT_OF;
        YSQLBinaryRangeOperation ySQLBinaryRangeOperation0 = new YSQLBinaryRangeOperation(
                ySQLBinaryRangeOperation_YSQLBinaryRangeComparisonOperator0, (YSQLExpression) null,
                (YSQLExpression) null);
        YSQLCastOperation ySQLCastOperation0 = new YSQLCastOperation(ySQLBinaryRangeOperation0, ySQLCompoundDataType0);
        YSQLCompoundDataType ySQLCompoundDataType1 = ySQLCastOperation0.getCompoundType();
        assertEquals(YSQLSchema.YSQLDataType.BIT, ySQLCompoundDataType1.getDataType());
    }

    @Test
    public void test16() throws Throwable {
        YSQLConstant.YSQLNullConstant ySQLConstant_YSQLNullConstant0 = new YSQLConstant.YSQLNullConstant();
        YSQLCastOperation ySQLCastOperation0 = new YSQLCastOperation(ySQLConstant_YSQLNullConstant0,
                (YSQLCompoundDataType) null);
        YSQLConstant.YSQLNullConstant ySQLConstant_YSQLNullConstant1 = (YSQLConstant.YSQLNullConstant) ySQLCastOperation0
                .getExpression();
        assertFalse(ySQLConstant_YSQLNullConstant1.isBoolean());
    }

    @Test
    public void test17() throws Throwable {
        YSQLConstant.YSQLNullConstant ySQLConstant_YSQLNullConstant0 = new YSQLConstant.YSQLNullConstant();
        YSQLCompoundDataType ySQLCompoundDataType0 = YSQLCompoundDataType.create((YSQLSchema.YSQLDataType) null);
        YSQLCastOperation ySQLCastOperation0 = new YSQLCastOperation(ySQLConstant_YSQLNullConstant0,
                ySQLCompoundDataType0);
        ySQLCastOperation0.getType();
    }
}
