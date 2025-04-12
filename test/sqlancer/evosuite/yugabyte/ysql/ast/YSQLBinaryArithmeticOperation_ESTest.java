/*
 * This file was automatically generated by EvoSuite
 * Fri Apr 11 15:53:13 GMT 2025
 */

package sqlancer.evosuite.yugabyte.ysql.ast;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import sqlancer.yugabyte.ysql.ast.YSQLBinaryArithmeticOperation;
import sqlancer.yugabyte.ysql.ast.YSQLConstant;
import sqlancer.yugabyte.ysql.ast.YSQLExpression;
import sqlancer.yugabyte.ysql.ast.YSQLFunction;
import sqlancer.yugabyte.ysql.ast.YSQLOrderByTerm;
import sqlancer.yugabyte.ysql.ast.YSQLSelect;
import sqlancer.yugabyte.ysql.ast.YSQLSimilarTo;
import sqlancer.yugabyte.ysql.YSQLSchema;

public class YSQLBinaryArithmeticOperation_ESTest {

    private void verifyException(String s, Exception e) {
    }

    @Test
    public void test00() throws Throwable {
        YSQLBinaryArithmeticOperation.YSQLBinaryOperator ySQLBinaryArithmeticOperation_YSQLBinaryOperator0 = YSQLBinaryArithmeticOperation.YSQLBinaryOperator.MODULO;
        YSQLConstant ySQLConstant0 = YSQLConstant.createByteConstant("86,qLfcrR\"ZMGg0Opm");
        YSQLConstant ySQLConstant1 = ySQLBinaryArithmeticOperation_YSQLBinaryOperator0.apply(ySQLConstant0,
                ySQLConstant0);
        assertEquals(0L, ySQLConstant1.asInt());
    }

    @Test
    public void test01() throws Throwable {
        YSQLConstant ySQLConstant0 = YSQLConstant.createTrue();
        YSQLBinaryArithmeticOperation.YSQLBinaryOperator ySQLBinaryArithmeticOperation_YSQLBinaryOperator0 = YSQLBinaryArithmeticOperation.YSQLBinaryOperator.MODULO;
        YSQLConstant ySQLConstant1 = YSQLConstant.createTextConstant("");
        YSQLBinaryArithmeticOperation ySQLBinaryArithmeticOperation0 = new YSQLBinaryArithmeticOperation(ySQLConstant1,
                ySQLConstant0, ySQLBinaryArithmeticOperation_YSQLBinaryOperator0);
        YSQLConstant ySQLConstant2 = ySQLBinaryArithmeticOperation0.getExpectedValue();
        assertEquals("0", ySQLConstant2.getTextRepresentation());
        assertNotNull(ySQLConstant2);
    }

    @Test
    public void test02() throws Throwable {
        YSQLConstant.IntConstant ySQLConstant_IntConstant0 = new YSQLConstant.IntConstant((-2776L));
        YSQLBinaryArithmeticOperation.YSQLBinaryOperator ySQLBinaryArithmeticOperation_YSQLBinaryOperator0 = YSQLBinaryArithmeticOperation.YSQLBinaryOperator.DIVISION;
        YSQLBinaryArithmeticOperation ySQLBinaryArithmeticOperation0 = new YSQLBinaryArithmeticOperation(
                ySQLConstant_IntConstant0, ySQLConstant_IntConstant0,
                ySQLBinaryArithmeticOperation_YSQLBinaryOperator0);
        YSQLConstant ySQLConstant0 = ySQLBinaryArithmeticOperation0.getExpectedValue();
        assertNotNull(ySQLConstant0);
        assertEquals(1L, ySQLConstant0.asInt());
    }

    @Test
    public void test03() throws Throwable {
        YSQLConstant ySQLConstant0 = YSQLConstant.createTrue();
        YSQLConstant.IntConstant ySQLConstant_IntConstant0 = new YSQLConstant.IntConstant(34L);
        YSQLBinaryArithmeticOperation.YSQLBinaryOperator ySQLBinaryArithmeticOperation_YSQLBinaryOperator0 = YSQLBinaryArithmeticOperation.YSQLBinaryOperator.MULTIPLICATION;
        YSQLConstant ySQLConstant1 = ySQLBinaryArithmeticOperation_YSQLBinaryOperator0.apply(ySQLConstant0,
                ySQLConstant_IntConstant0);
        assertEquals(34L, ySQLConstant1.asInt());
    }

    @Test
    public void test04() throws Throwable {
        YSQLConstant ySQLConstant0 = YSQLConstant.createTrue();
        YSQLConstant ySQLConstant1 = YSQLConstant.createNullConstant();
        YSQLBinaryArithmeticOperation.YSQLBinaryOperator ySQLBinaryArithmeticOperation_YSQLBinaryOperator0 = YSQLBinaryArithmeticOperation.YSQLBinaryOperator.MULTIPLICATION;
        YSQLConstant ySQLConstant2 = ySQLBinaryArithmeticOperation_YSQLBinaryOperator0.apply(ySQLConstant1,
                ySQLConstant0);
        assertFalse(ySQLConstant2.isInt());
    }

    @Test
    public void test05() throws Throwable {
        YSQLConstant ySQLConstant0 = YSQLConstant.createTrue();
        YSQLConstant ySQLConstant1 = YSQLConstant.createFalse();
        YSQLBinaryArithmeticOperation.YSQLBinaryOperator ySQLBinaryArithmeticOperation_YSQLBinaryOperator0 = YSQLBinaryArithmeticOperation.YSQLBinaryOperator.SUBTRACTION;
        YSQLConstant ySQLConstant2 = ySQLBinaryArithmeticOperation_YSQLBinaryOperator0.apply(ySQLConstant1,
                ySQLConstant0);
        assertEquals("-1", ySQLConstant2.getTextRepresentation());
    }

    @Test
    public void test06() throws Throwable {
        YSQLConstant ySQLConstant0 = YSQLConstant.createNullConstant();
        YSQLBinaryArithmeticOperation.YSQLBinaryOperator ySQLBinaryArithmeticOperation_YSQLBinaryOperator0 = YSQLBinaryArithmeticOperation.YSQLBinaryOperator.DIVISION;
        YSQLBinaryArithmeticOperation ySQLBinaryArithmeticOperation0 = new YSQLBinaryArithmeticOperation(ySQLConstant0,
                ySQLConstant0, ySQLBinaryArithmeticOperation_YSQLBinaryOperator0);
        YSQLConstant ySQLConstant1 = ySQLBinaryArithmeticOperation0.getExpectedValue();
        assertEquals("NULL", ySQLConstant1.getUnquotedTextRepresentation());
    }

    @Test
    public void test07() throws Throwable {
        YSQLBinaryArithmeticOperation.YSQLBinaryOperator ySQLBinaryArithmeticOperation_YSQLBinaryOperator0 = YSQLBinaryArithmeticOperation.YSQLBinaryOperator
                .getRandom();
        YSQLBinaryArithmeticOperation ySQLBinaryArithmeticOperation0 = new YSQLBinaryArithmeticOperation(
                (YSQLExpression) null, (YSQLExpression) null, ySQLBinaryArithmeticOperation_YSQLBinaryOperator0);
        // Undeclared exception!
        try {
            ySQLBinaryArithmeticOperation0.getExpectedValue();
            fail("Expecting exception: NullPointerException");

        } catch (NullPointerException e) {
            //
            // no message in exception (getMessage() returned null)
            //
            verifyException("sqlancer.yugabyte.ysql.ast.YSQLBinaryArithmeticOperation", e);
        }
    }

    @Test
    public void test08() throws Throwable {
        YSQLSelect ySQLSelect0 = new YSQLSelect();
        YSQLOrderByTerm.YSQLOrder ySQLOrderByTerm_YSQLOrder0 = YSQLOrderByTerm.YSQLOrder.ASC;
        YSQLOrderByTerm ySQLOrderByTerm0 = new YSQLOrderByTerm(ySQLSelect0, ySQLOrderByTerm_YSQLOrder0);
        YSQLBinaryArithmeticOperation.YSQLBinaryOperator ySQLBinaryArithmeticOperation_YSQLBinaryOperator0 = YSQLBinaryArithmeticOperation.YSQLBinaryOperator.EXPONENTIATION;
        YSQLBinaryArithmeticOperation ySQLBinaryArithmeticOperation0 = new YSQLBinaryArithmeticOperation(
                ySQLOrderByTerm0, ySQLSelect0, ySQLBinaryArithmeticOperation_YSQLBinaryOperator0);
        // Undeclared exception!
        try {
            ySQLBinaryArithmeticOperation0.getExpectedValue();
            fail("Expecting exception: AssertionError");

        } catch (AssertionError e) {
            //
            // sqlancer.yugabyte.ysql.ast.YSQLOrderByTerm@2
            //
        }
    }

    @Test
    public void test09() throws Throwable {
        YSQLFunction.YSQLFunctionWithResult ySQLFunction_YSQLFunctionWithResult0 = YSQLFunction.YSQLFunctionWithResult.UPPER;
        YSQLSchema.YSQLDataType ySQLSchema_YSQLDataType0 = YSQLSchema.YSQLDataType.DECIMAL;
        YSQLExpression[] ySQLExpressionArray0 = new YSQLExpression[0];
        YSQLFunction ySQLFunction0 = new YSQLFunction(ySQLFunction_YSQLFunctionWithResult0, ySQLSchema_YSQLDataType0,
                ySQLExpressionArray0);
        YSQLBinaryArithmeticOperation.YSQLBinaryOperator ySQLBinaryArithmeticOperation_YSQLBinaryOperator0 = YSQLBinaryArithmeticOperation.YSQLBinaryOperator.SUBTRACTION;
        YSQLBinaryArithmeticOperation ySQLBinaryArithmeticOperation0 = new YSQLBinaryArithmeticOperation(ySQLFunction0,
                ySQLFunction0, ySQLBinaryArithmeticOperation_YSQLBinaryOperator0);
        // Undeclared exception!
        try {
            ySQLBinaryArithmeticOperation0.getExpectedValue();
            fail("Expecting exception: ArrayIndexOutOfBoundsException");

        } catch (ArrayIndexOutOfBoundsException e) {
            //
            // Index 0 out of bounds for length 0
            //
            verifyException("sqlancer.yugabyte.ysql.ast.YSQLFunction$YSQLFunctionWithResult$4", e);
        }
    }

    @Test
    public void test10() throws Throwable {
        YSQLBinaryArithmeticOperation.YSQLBinaryOperator ySQLBinaryArithmeticOperation_YSQLBinaryOperator0 = YSQLBinaryArithmeticOperation.YSQLBinaryOperator
                .getRandom();
        YSQLConstant ySQLConstant0 = YSQLConstant.createDoubleConstant((-1718.202));
        YSQLConstant.YSQLNullConstant ySQLConstant_YSQLNullConstant0 = new YSQLConstant.YSQLNullConstant();
        YSQLConstant ySQLConstant1 = ySQLBinaryArithmeticOperation_YSQLBinaryOperator0.apply(ySQLConstant0,
                ySQLConstant_YSQLNullConstant0);
        assertFalse(ySQLConstant1.equals((Object) ySQLConstant_YSQLNullConstant0));
    }

    @Test
    public void test11() throws Throwable {
        YSQLBinaryArithmeticOperation.YSQLBinaryOperator ySQLBinaryArithmeticOperation_YSQLBinaryOperator0 = YSQLBinaryArithmeticOperation.YSQLBinaryOperator.MODULO;
        YSQLConstant ySQLConstant0 = YSQLConstant.createFalse();
        YSQLBinaryArithmeticOperation ySQLBinaryArithmeticOperation0 = new YSQLBinaryArithmeticOperation(ySQLConstant0,
                ySQLConstant0, ySQLBinaryArithmeticOperation_YSQLBinaryOperator0);
        YSQLConstant ySQLConstant1 = ySQLBinaryArithmeticOperation0.getExpectedValue();
        assertNotNull(ySQLConstant1);
        assertEquals("-1", ySQLConstant1.getUnquotedTextRepresentation());
    }

    @Test
    public void test12() throws Throwable {
        YSQLConstant ySQLConstant0 = YSQLConstant.createFalse();
        YSQLBinaryArithmeticOperation.YSQLBinaryOperator ySQLBinaryArithmeticOperation_YSQLBinaryOperator0 = YSQLBinaryArithmeticOperation.YSQLBinaryOperator.DIVISION;
        YSQLBinaryArithmeticOperation ySQLBinaryArithmeticOperation0 = new YSQLBinaryArithmeticOperation(ySQLConstant0,
                ySQLConstant0, ySQLBinaryArithmeticOperation_YSQLBinaryOperator0);
        YSQLConstant ySQLConstant1 = ySQLBinaryArithmeticOperation0.getExpectedValue();
        assertNotNull(ySQLConstant1);
        assertEquals("-1", ySQLConstant1.getUnquotedTextRepresentation());
    }

    @Test
    public void test13() throws Throwable {
        YSQLBinaryArithmeticOperation.YSQLBinaryOperator ySQLBinaryArithmeticOperation_YSQLBinaryOperator0 = YSQLBinaryArithmeticOperation.YSQLBinaryOperator.SUBTRACTION;
        YSQLConstant ySQLConstant0 = YSQLConstant.createNullConstant();
        YSQLSimilarTo ySQLSimilarTo0 = new YSQLSimilarTo((YSQLExpression) null, (YSQLExpression) null,
                (YSQLExpression) null);
        YSQLBinaryArithmeticOperation ySQLBinaryArithmeticOperation0 = new YSQLBinaryArithmeticOperation(ySQLConstant0,
                ySQLSimilarTo0, ySQLBinaryArithmeticOperation_YSQLBinaryOperator0);
        YSQLConstant ySQLConstant1 = ySQLBinaryArithmeticOperation0.getExpectedValue();
        assertNull(ySQLConstant1);
    }

    @Test
    public void test14() throws Throwable {
        YSQLBinaryArithmeticOperation.YSQLBinaryOperator ySQLBinaryArithmeticOperation_YSQLBinaryOperator0 = YSQLBinaryArithmeticOperation.YSQLBinaryOperator
                .getRandom();
        YSQLSelect ySQLSelect0 = new YSQLSelect();
        YSQLBinaryArithmeticOperation ySQLBinaryArithmeticOperation0 = new YSQLBinaryArithmeticOperation(ySQLSelect0,
                ySQLSelect0, ySQLBinaryArithmeticOperation_YSQLBinaryOperator0);
        YSQLConstant ySQLConstant0 = ySQLBinaryArithmeticOperation0.getExpectedValue();
        assertNull(ySQLConstant0);
    }

    @Test
    public void test15() throws Throwable {
        YSQLBinaryArithmeticOperation.YSQLBinaryOperator ySQLBinaryArithmeticOperation_YSQLBinaryOperator0 = YSQLBinaryArithmeticOperation.YSQLBinaryOperator.EXPONENTIATION;
        YSQLConstant ySQLConstant0 = ySQLBinaryArithmeticOperation_YSQLBinaryOperator0.apply((YSQLConstant) null,
                (YSQLConstant) null);
        assertNull(ySQLConstant0);
    }

    @Test
    public void test16() throws Throwable {
        YSQLConstant ySQLConstant0 = YSQLConstant.createTrue();
        YSQLBinaryArithmeticOperation.YSQLBinaryOperator ySQLBinaryArithmeticOperation_YSQLBinaryOperator0 = YSQLBinaryArithmeticOperation.YSQLBinaryOperator.DIVISION;
        YSQLConstant ySQLConstant1 = ySQLBinaryArithmeticOperation_YSQLBinaryOperator0.apply(ySQLConstant0,
                ySQLConstant0);
        YSQLBinaryArithmeticOperation ySQLBinaryArithmeticOperation0 = new YSQLBinaryArithmeticOperation(ySQLConstant0,
                ySQLConstant1, ySQLBinaryArithmeticOperation_YSQLBinaryOperator0);
        YSQLConstant ySQLConstant2 = ySQLBinaryArithmeticOperation0.getExpectedValue();
        assertNotNull(ySQLConstant2);
        assertEquals("1", ySQLConstant1.getUnquotedTextRepresentation());
        assertEquals(1L, ySQLConstant1.asInt());
    }

    @Test
    public void test17() throws Throwable {
        YSQLBinaryArithmeticOperation.YSQLBinaryOperator ySQLBinaryArithmeticOperation_YSQLBinaryOperator0 = YSQLBinaryArithmeticOperation.YSQLBinaryOperator
                .getRandom();
        YSQLBinaryArithmeticOperation ySQLBinaryArithmeticOperation0 = new YSQLBinaryArithmeticOperation(
                (YSQLExpression) null, (YSQLExpression) null, ySQLBinaryArithmeticOperation_YSQLBinaryOperator0);
        YSQLSchema.YSQLDataType ySQLSchema_YSQLDataType0 = ySQLBinaryArithmeticOperation0.getExpressionType();
        assertEquals(YSQLSchema.YSQLDataType.INT, ySQLSchema_YSQLDataType0);
    }

    @Test
    public void test18() throws Throwable {
        YSQLBinaryArithmeticOperation.YSQLBinaryOperator ySQLBinaryArithmeticOperation_YSQLBinaryOperator0 = YSQLBinaryArithmeticOperation.YSQLBinaryOperator.DIVISION;
        String string0 = ySQLBinaryArithmeticOperation_YSQLBinaryOperator0.getTextRepresentation();
        assertEquals("/", string0);
    }
}
