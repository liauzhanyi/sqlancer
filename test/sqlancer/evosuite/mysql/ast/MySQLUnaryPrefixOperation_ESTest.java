/*
 * This file was automatically generated by EvoSuite
 * Fri Apr 11 15:08:14 GMT 2025
 */

package sqlancer.evosuite.mysql.ast;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import sqlancer.common.visitor.UnaryOperation;
import sqlancer.mysql.ast.MySQLComputableFunction;
import sqlancer.mysql.ast.MySQLConstant;
import sqlancer.mysql.ast.MySQLExpression;
import sqlancer.mysql.ast.MySQLText;
import sqlancer.mysql.ast.MySQLUnaryPrefixOperation;

public class MySQLUnaryPrefixOperation_ESTest {

    private void verifyException(String s, Exception e) {
    }

    @Test
    public void test00() throws Throwable {
        MySQLConstant mySQLConstant0 = MySQLConstant.createFalse();
        MySQLUnaryPrefixOperation.MySQLUnaryPrefixOperator mySQLUnaryPrefixOperation_MySQLUnaryPrefixOperator0 = MySQLUnaryPrefixOperation.MySQLUnaryPrefixOperator.NOT;
        MySQLUnaryPrefixOperation mySQLUnaryPrefixOperation0 = new MySQLUnaryPrefixOperation(mySQLConstant0,
                mySQLUnaryPrefixOperation_MySQLUnaryPrefixOperator0);
        MySQLConstant mySQLConstant1 = mySQLUnaryPrefixOperation0.getExpectedValue();
        assertTrue(mySQLConstant1.asBooleanNotNull());
    }

    @Test
    public void test01() throws Throwable {
        MySQLUnaryPrefixOperation.MySQLUnaryPrefixOperator mySQLUnaryPrefixOperation_MySQLUnaryPrefixOperator0 = MySQLUnaryPrefixOperation.MySQLUnaryPrefixOperator
                .getRandom();
        MySQLConstant.MySQLDoubleConstant mySQLConstant_MySQLDoubleConstant0 = new MySQLConstant.MySQLDoubleConstant(
                1453.72250628137);
        MySQLUnaryPrefixOperation mySQLUnaryPrefixOperation0 = new MySQLUnaryPrefixOperation(
                mySQLConstant_MySQLDoubleConstant0, mySQLUnaryPrefixOperation_MySQLUnaryPrefixOperator0);
        // Undeclared exception!
        try {
            mySQLUnaryPrefixOperation0.getExpectedValue();
            fail("Expecting exception: UnsupportedOperationException");

        } catch (UnsupportedOperationException e) {
            //
            // not applicable for PQS evaluation!
            //
            verifyException("sqlancer.mysql.ast.MySQLConstant$MySQLNoPQSConstant", e);
        }
    }

    @Test
    public void test02() throws Throwable {
        MySQLText mySQLText0 = new MySQLText((String) null);
        MySQLUnaryPrefixOperation.MySQLUnaryPrefixOperator mySQLUnaryPrefixOperation_MySQLUnaryPrefixOperator0 = MySQLUnaryPrefixOperation.MySQLUnaryPrefixOperator.PLUS;
        MySQLUnaryPrefixOperation mySQLUnaryPrefixOperation0 = new MySQLUnaryPrefixOperation(mySQLText0,
                mySQLUnaryPrefixOperation_MySQLUnaryPrefixOperator0);
        // Undeclared exception!
        try {
            mySQLUnaryPrefixOperation0.getExpectedValue();
            fail("Expecting exception: AssertionError");

        } catch (AssertionError e) {
            //
            // PQS not supported for this operator
            //
        }
    }

    @Test
    public void test03() throws Throwable {
        MySQLComputableFunction.MySQLFunction mySQLComputableFunction_MySQLFunction0 = MySQLComputableFunction.MySQLFunction.IF;
        MySQLExpression[] mySQLExpressionArray0 = new MySQLExpression[0];
        MySQLComputableFunction mySQLComputableFunction0 = new MySQLComputableFunction(
                mySQLComputableFunction_MySQLFunction0, mySQLExpressionArray0);
        MySQLUnaryPrefixOperation.MySQLUnaryPrefixOperator mySQLUnaryPrefixOperation_MySQLUnaryPrefixOperator0 = MySQLUnaryPrefixOperation.MySQLUnaryPrefixOperator.PLUS;
        MySQLUnaryPrefixOperation mySQLUnaryPrefixOperation0 = new MySQLUnaryPrefixOperation(mySQLComputableFunction0,
                mySQLUnaryPrefixOperation_MySQLUnaryPrefixOperator0);
        // Undeclared exception!
        try {
            mySQLUnaryPrefixOperation0.getExpectedValue();
            fail("Expecting exception: ArrayIndexOutOfBoundsException");

        } catch (ArrayIndexOutOfBoundsException e) {
            //
            // Index 0 out of bounds for length 0
            //
            verifyException("sqlancer.mysql.ast.MySQLComputableFunction$MySQLFunction$3", e);
        }
    }

    @Test
    public void test04() throws Throwable {
        MySQLUnaryPrefixOperation.MySQLUnaryPrefixOperator mySQLUnaryPrefixOperation_MySQLUnaryPrefixOperator0 = MySQLUnaryPrefixOperation.MySQLUnaryPrefixOperator
                .getRandom();
        MySQLConstant.MySQLNullConstant mySQLConstant_MySQLNullConstant0 = new MySQLConstant.MySQLNullConstant();
        MySQLUnaryPrefixOperation mySQLUnaryPrefixOperation0 = new MySQLUnaryPrefixOperation(
                mySQLConstant_MySQLNullConstant0, mySQLUnaryPrefixOperation_MySQLUnaryPrefixOperator0);
        MySQLConstant mySQLConstant0 = mySQLUnaryPrefixOperation0.getExpectedValue();
        assertNotSame(mySQLConstant_MySQLNullConstant0, mySQLConstant0);
    }

    @Test
    public void test05() throws Throwable {
        MySQLUnaryPrefixOperation.MySQLUnaryPrefixOperator mySQLUnaryPrefixOperation_MySQLUnaryPrefixOperator0 = MySQLUnaryPrefixOperation.MySQLUnaryPrefixOperator.MINUS;
        MySQLConstant mySQLConstant0 = MySQLConstant.createFalse();
        MySQLConstant mySQLConstant1 = mySQLUnaryPrefixOperation_MySQLUnaryPrefixOperator0.applyNotNull(mySQLConstant0);
        assertFalse(mySQLConstant1.asBooleanNotNull());
    }

    @Test
    public void test06() throws Throwable {
        MySQLUnaryPrefixOperation.MySQLUnaryPrefixOperator mySQLUnaryPrefixOperation_MySQLUnaryPrefixOperator0 = MySQLUnaryPrefixOperation.MySQLUnaryPrefixOperator.MINUS;
        MySQLConstant.MySQLNullConstant mySQLConstant_MySQLNullConstant0 = new MySQLConstant.MySQLNullConstant();
        // Undeclared exception!
        try {
            mySQLUnaryPrefixOperation_MySQLUnaryPrefixOperator0.applyNotNull(mySQLConstant_MySQLNullConstant0);
            fail("Expecting exception: AssertionError");

        } catch (AssertionError e) {
            //
            // NULL
            //
        }
    }

    @Test
    public void test07() throws Throwable {
        MySQLConstant.MySQLTextConstant mySQLConstant_MySQLTextConstant0 = new MySQLConstant.MySQLTextConstant("");
        MySQLUnaryPrefixOperation.MySQLUnaryPrefixOperator mySQLUnaryPrefixOperation_MySQLUnaryPrefixOperator0 = MySQLUnaryPrefixOperation.MySQLUnaryPrefixOperator.MINUS;
        MySQLUnaryPrefixOperation mySQLUnaryPrefixOperation0 = new MySQLUnaryPrefixOperation(
                mySQLConstant_MySQLTextConstant0, mySQLUnaryPrefixOperation_MySQLUnaryPrefixOperator0);
        // Undeclared exception!
        try {
            mySQLUnaryPrefixOperation0.getExpectedValue();
            fail("Expecting exception: RuntimeException");

        } catch (RuntimeException e) {
            //
            // no message in exception (getMessage() returned null)
            //
            verifyException("sqlancer.mysql.ast.MySQLUnaryPrefixOperation$MySQLUnaryPrefixOperator$3", e);
        }
    }

    @Test
    public void test08() throws Throwable {
        MySQLConstant mySQLConstant0 = MySQLConstant.createUnsignedIntConstant(0L);
        MySQLUnaryPrefixOperation.MySQLUnaryPrefixOperator mySQLUnaryPrefixOperation_MySQLUnaryPrefixOperator0 = MySQLUnaryPrefixOperation.MySQLUnaryPrefixOperator.MINUS;
        MySQLUnaryPrefixOperation mySQLUnaryPrefixOperation0 = new MySQLUnaryPrefixOperation(mySQLConstant0,
                mySQLUnaryPrefixOperation_MySQLUnaryPrefixOperator0);
        // Undeclared exception!
        try {
            mySQLUnaryPrefixOperation0.getExpectedValue();
            fail("Expecting exception: RuntimeException");

        } catch (RuntimeException e) {
            //
            // no message in exception (getMessage() returned null)
            //
            verifyException("sqlancer.mysql.ast.MySQLUnaryPrefixOperation$MySQLUnaryPrefixOperator$3", e);
        }
    }

    @Test
    public void test09() throws Throwable {
        MySQLUnaryPrefixOperation.MySQLUnaryPrefixOperator mySQLUnaryPrefixOperation_MySQLUnaryPrefixOperator0 = MySQLUnaryPrefixOperation.MySQLUnaryPrefixOperator
                .getRandom();
        MySQLConstant mySQLConstant0 = MySQLConstant.createTrue();
        MySQLConstant mySQLConstant1 = mySQLUnaryPrefixOperation_MySQLUnaryPrefixOperator0.applyNotNull(mySQLConstant0);
        assertFalse(mySQLConstant1.asBooleanNotNull());
    }

    @Test
    public void test10() throws Throwable {
        MySQLConstant.MySQLTextConstant mySQLConstant_MySQLTextConstant0 = new MySQLConstant.MySQLTextConstant("");
        MySQLUnaryPrefixOperation.MySQLUnaryPrefixOperator mySQLUnaryPrefixOperation_MySQLUnaryPrefixOperator0 = MySQLUnaryPrefixOperation.MySQLUnaryPrefixOperator.PLUS;
        MySQLUnaryPrefixOperation mySQLUnaryPrefixOperation0 = new MySQLUnaryPrefixOperation(
                mySQLConstant_MySQLTextConstant0, mySQLUnaryPrefixOperation_MySQLUnaryPrefixOperator0);
        MySQLConstant mySQLConstant0 = mySQLUnaryPrefixOperation0.getExpectedValue();
        assertSame(mySQLConstant0, mySQLConstant_MySQLTextConstant0);
    }

    @Test
    public void test11() throws Throwable {
        MySQLUnaryPrefixOperation.MySQLUnaryPrefixOperator mySQLUnaryPrefixOperation_MySQLUnaryPrefixOperator0 = MySQLUnaryPrefixOperation.MySQLUnaryPrefixOperator.MINUS;
        String string0 = mySQLUnaryPrefixOperation_MySQLUnaryPrefixOperator0.getTextRepresentation();
        assertEquals("-", string0);
    }

    @Test
    public void test12() throws Throwable {
        MySQLUnaryPrefixOperation.MySQLUnaryPrefixOperator mySQLUnaryPrefixOperation_MySQLUnaryPrefixOperator0 = MySQLUnaryPrefixOperation.MySQLUnaryPrefixOperator.NOT;
        MySQLConstant.MySQLNullConstant mySQLConstant_MySQLNullConstant0 = new MySQLConstant.MySQLNullConstant();
        MySQLUnaryPrefixOperation mySQLUnaryPrefixOperation0 = new MySQLUnaryPrefixOperation(
                mySQLConstant_MySQLNullConstant0, mySQLUnaryPrefixOperation_MySQLUnaryPrefixOperator0);
        UnaryOperation.OperatorKind unaryOperation_OperatorKind0 = mySQLUnaryPrefixOperation0.getOperatorKind();
        assertEquals(UnaryOperation.OperatorKind.PREFIX, unaryOperation_OperatorKind0);
    }

    @Test
    public void test13() throws Throwable {
        MySQLUnaryPrefixOperation.MySQLUnaryPrefixOperator mySQLUnaryPrefixOperation_MySQLUnaryPrefixOperator0 = MySQLUnaryPrefixOperation.MySQLUnaryPrefixOperator.MINUS;
        MySQLUnaryPrefixOperation mySQLUnaryPrefixOperation0 = new MySQLUnaryPrefixOperation((MySQLExpression) null,
                mySQLUnaryPrefixOperation_MySQLUnaryPrefixOperator0);
        // Undeclared exception!
        try {
            mySQLUnaryPrefixOperation0.getExpectedValue();
            fail("Expecting exception: NullPointerException");

        } catch (NullPointerException e) {
            //
            // no message in exception (getMessage() returned null)
            //
            verifyException("sqlancer.mysql.ast.MySQLUnaryPrefixOperation", e);
        }
    }
}
