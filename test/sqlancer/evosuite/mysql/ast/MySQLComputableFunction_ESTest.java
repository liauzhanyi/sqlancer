/*
 * This file was automatically generated by EvoSuite
 * Fri Apr 11 15:37:24 GMT 2025
 */

package sqlancer.evosuite.mysql.ast;

import static org.junit.jupiter.api.Assertions.*;
import java.util.List;
import org.junit.jupiter.api.Test;
import sqlancer.mysql.ast.MySQLBinaryComparisonOperation;
import sqlancer.mysql.ast.MySQLBinaryOperation;
import sqlancer.mysql.ast.MySQLCastOperation;
import sqlancer.mysql.ast.MySQLColumnReference;
import sqlancer.mysql.ast.MySQLComputableFunction;
import sqlancer.mysql.ast.MySQLConstant;
import sqlancer.mysql.ast.MySQLExpression;
import sqlancer.mysql.ast.MySQLInOperation;
import sqlancer.mysql.ast.MySQLSelect;
import sqlancer.mysql.ast.MySQLText;
import sqlancer.mysql.MySQLSchema;

public class MySQLComputableFunction_ESTest {

    private void verifyException(String s, Exception e) {
    }

    @Test
    public void test00() throws Throwable {
        MySQLConstant mySQLConstant0 = MySQLConstant.createTrue();
        MySQLComputableFunction.MySQLFunction mySQLComputableFunction_MySQLFunction0 = MySQLComputableFunction.MySQLFunction.IF;
        MySQLConstant[] mySQLConstantArray0 = new MySQLConstant[6];
        mySQLConstantArray0[0] = mySQLConstant0;
        mySQLConstantArray0[1] = mySQLConstant0;
        // Undeclared exception!
        try {
            mySQLComputableFunction_MySQLFunction0.apply(mySQLConstantArray0, mySQLConstantArray0);
            fail("Expecting exception: NullPointerException");

        } catch (NullPointerException e) {
            //
            // no message in exception (getMessage() returned null)
            //
            verifyException("sqlancer.mysql.ast.MySQLComputableFunction", e);
        }
    }

    @Test
    public void test01() throws Throwable {
        MySQLConstant mySQLConstant0 = MySQLConstant.createTrue();
        MySQLComputableFunction.MySQLFunction mySQLComputableFunction_MySQLFunction0 = MySQLComputableFunction.MySQLFunction.IF;
        MySQLConstant[] mySQLConstantArray0 = new MySQLConstant[6];
        mySQLConstantArray0[0] = mySQLConstant0;
        // Undeclared exception!
        try {
            mySQLComputableFunction_MySQLFunction0.apply(mySQLConstantArray0, mySQLConstantArray0);
            fail("Expecting exception: NullPointerException");

        } catch (NullPointerException e) {
            //
            // no message in exception (getMessage() returned null)
            //
            verifyException("sqlancer.mysql.ast.MySQLComputableFunction", e);
        }
    }

    @Test
    public void test02() throws Throwable {
        MySQLComputableFunction.MySQLFunction mySQLComputableFunction_MySQLFunction0 = MySQLComputableFunction.MySQLFunction.IF;
        MySQLExpression[] mySQLExpressionArray0 = new MySQLExpression[3];
        MySQLConstant.MySQLIntConstant mySQLConstant_MySQLIntConstant0 = new MySQLConstant.MySQLIntConstant(0L, false);
        mySQLExpressionArray0[0] = (MySQLExpression) mySQLConstant_MySQLIntConstant0;
        mySQLExpressionArray0[1] = (MySQLExpression) mySQLConstant_MySQLIntConstant0;
        MySQLConstant.MySQLTextConstant mySQLConstant_MySQLTextConstant0 = new MySQLConstant.MySQLTextConstant(
                "Jj-}.m;/i,L");
        MySQLBinaryOperation.MySQLBinaryOperator mySQLBinaryOperation_MySQLBinaryOperator0 = MySQLBinaryOperation.MySQLBinaryOperator.AND;
        MySQLBinaryOperation mySQLBinaryOperation0 = new MySQLBinaryOperation(mySQLConstant_MySQLTextConstant0,
                mySQLExpressionArray0[1], mySQLBinaryOperation_MySQLBinaryOperator0);
        mySQLExpressionArray0[2] = (MySQLExpression) mySQLBinaryOperation0;
        MySQLComputableFunction mySQLComputableFunction0 = new MySQLComputableFunction(
                mySQLComputableFunction_MySQLFunction0, mySQLExpressionArray0);
        MySQLConstant mySQLConstant0 = mySQLComputableFunction0.getExpectedValue();
        assertNotNull(mySQLConstant0);
        assertNotSame(mySQLConstant0, mySQLConstant_MySQLIntConstant0);
        assertFalse(mySQLConstant0.isSigned());
    }

    @Test
    public void test03() throws Throwable {
        MySQLExpression[] mySQLExpressionArray0 = new MySQLExpression[6];
        MySQLConstant.MySQLNullConstant mySQLConstant_MySQLNullConstant0 = new MySQLConstant.MySQLNullConstant();
        MySQLComputableFunction.MySQLFunction mySQLComputableFunction_MySQLFunction0 = MySQLComputableFunction.MySQLFunction.IFNULL;
        MySQLConstant[] mySQLConstantArray0 = new MySQLConstant[8];
        mySQLConstantArray0[0] = (MySQLConstant) mySQLConstant_MySQLNullConstant0;
        // Undeclared exception!
        try {
            mySQLComputableFunction_MySQLFunction0.apply(mySQLConstantArray0, mySQLExpressionArray0);
            fail("Expecting exception: NullPointerException");

        } catch (NullPointerException e) {
            //
            // no message in exception (getMessage() returned null)
            //
            verifyException("sqlancer.mysql.ast.MySQLComputableFunction", e);
        }
    }

    @Test
    public void test04() throws Throwable {
        MySQLConstant mySQLConstant0 = MySQLConstant.createTrue();
        MySQLExpression[] mySQLExpressionArray0 = new MySQLExpression[1];
        mySQLExpressionArray0[0] = (MySQLExpression) mySQLConstant0;
        MySQLComputableFunction.MySQLFunction mySQLComputableFunction_MySQLFunction0 = MySQLComputableFunction.MySQLFunction.BIT_COUNT;
        MySQLComputableFunction mySQLComputableFunction0 = new MySQLComputableFunction(
                mySQLComputableFunction_MySQLFunction0, mySQLExpressionArray0);
        MySQLConstant mySQLConstant1 = mySQLComputableFunction0.getExpectedValue();
        assertNotNull(mySQLConstant1);
        assertEquals(1L, mySQLConstant1.getInt());
    }

    @Test
    public void test05() throws Throwable {
        MySQLConstant mySQLConstant0 = MySQLConstant.createTrue();
        MySQLExpression[] mySQLExpressionArray0 = new MySQLExpression[1];
        mySQLExpressionArray0[0] = (MySQLExpression) mySQLConstant0;
        MySQLSchema.MySQLDataType mySQLSchema_MySQLDataType0 = MySQLComputableFunction
                .getMostGeneralType(mySQLExpressionArray0);
        assertEquals(MySQLSchema.MySQLDataType.INT, mySQLSchema_MySQLDataType0);
    }

    @Test
    public void test06() throws Throwable {
        MySQLConstant mySQLConstant0 = MySQLConstant.createTrue();
        MySQLComputableFunction.MySQLFunction mySQLComputableFunction_MySQLFunction0 = MySQLComputableFunction.MySQLFunction.COALESCE;
        MySQLConstant.MySQLTextConstant mySQLConstant_MySQLTextConstant0 = new MySQLConstant.MySQLTextConstant("6{y");
        MySQLConstant[] mySQLConstantArray0 = new MySQLConstant[7];
        mySQLConstantArray0[0] = mySQLConstant0;
        mySQLConstantArray0[1] = (MySQLConstant) mySQLConstant_MySQLTextConstant0;
        mySQLConstantArray0[2] = mySQLConstant0;
        mySQLConstantArray0[3] = mySQLConstant0;
        mySQLConstantArray0[4] = mySQLConstant0;
        mySQLConstantArray0[5] = mySQLConstant0;
        mySQLConstantArray0[6] = mySQLConstant0;
        MySQLComputableFunction mySQLComputableFunction0 = new MySQLComputableFunction(
                mySQLComputableFunction_MySQLFunction0, mySQLConstantArray0);
        MySQLConstant mySQLConstant1 = mySQLComputableFunction0.getExpectedValue();
        assertNotNull(mySQLConstant1);
        assertEquals("1", mySQLConstant1.getString());
    }

    @Test
    public void test07() throws Throwable {
        MySQLExpression[] mySQLExpressionArray0 = new MySQLExpression[0];
        MySQLComputableFunction.MySQLFunction mySQLComputableFunction_MySQLFunction0 = MySQLComputableFunction.MySQLFunction.BIT_COUNT;
        MySQLComputableFunction mySQLComputableFunction0 = new MySQLComputableFunction(
                mySQLComputableFunction_MySQLFunction0, mySQLExpressionArray0);
        MySQLExpression[] mySQLExpressionArray1 = mySQLComputableFunction0.getArguments();
        assertFalse(mySQLExpressionArray1.equals((Object) mySQLExpressionArray0));
    }

    @Test
    public void test08() throws Throwable {
        MySQLConstant mySQLConstant0 = MySQLConstant.createUnsignedIntConstant(0L);
        MySQLExpression[] mySQLExpressionArray0 = new MySQLExpression[1];
        MySQLSelect mySQLSelect0 = new MySQLSelect();
        List<MySQLExpression> list0 = mySQLSelect0.getOrderByClauses();
        MySQLInOperation mySQLInOperation0 = new MySQLInOperation(mySQLConstant0, list0, false);
        mySQLExpressionArray0[0] = (MySQLExpression) mySQLInOperation0;
        // Undeclared exception!
        try {
            MySQLComputableFunction.getMostGeneralType(mySQLExpressionArray0);
            fail("Expecting exception: RuntimeException");

        } catch (RuntimeException e) {
            //
            // no message in exception (getMessage() returned null)
            //
            verifyException("sqlancer.mysql.ast.MySQLInOperation", e);
        }
    }

    @Test
    public void test09() throws Throwable {
        MySQLExpression[] mySQLExpressionArray0 = new MySQLExpression[2];
        MySQLConstant.MySQLDoubleConstant mySQLConstant_MySQLDoubleConstant0 = new MySQLConstant.MySQLDoubleConstant(
                0.0);
        mySQLExpressionArray0[0] = (MySQLExpression) mySQLConstant_MySQLDoubleConstant0;
        // Undeclared exception!
        try {
            MySQLComputableFunction.getMostGeneralType(mySQLExpressionArray0);
            fail("Expecting exception: UnsupportedOperationException");

        } catch (UnsupportedOperationException e) {
            //
            // not applicable for PQS evaluation!
            //
            verifyException("sqlancer.mysql.ast.MySQLConstant$MySQLNoPQSConstant", e);
        }
    }

    @Test
    public void test10() throws Throwable {
        MySQLExpression[] mySQLExpressionArray0 = new MySQLExpression[1];
        MySQLText mySQLText0 = new MySQLText("");
        mySQLExpressionArray0[0] = (MySQLExpression) mySQLText0;
        // Undeclared exception!
        try {
            MySQLComputableFunction.getMostGeneralType(mySQLExpressionArray0);
            fail("Expecting exception: AssertionError");

        } catch (AssertionError e) {
            //
            // PQS not supported for this operator
            //
        }
    }

    @Test
    public void test11() throws Throwable {
        MySQLExpression[] mySQLExpressionArray0 = new MySQLExpression[0];
        MySQLComputableFunction.MySQLFunction mySQLComputableFunction_MySQLFunction0 = MySQLComputableFunction.MySQLFunction.BIT_COUNT;
        MySQLComputableFunction mySQLComputableFunction0 = new MySQLComputableFunction(
                mySQLComputableFunction_MySQLFunction0, mySQLExpressionArray0);
        MySQLExpression[] mySQLExpressionArray1 = new MySQLExpression[1];
        mySQLExpressionArray1[0] = (MySQLExpression) mySQLComputableFunction0;
        // Undeclared exception!
        try {
            MySQLComputableFunction.getMostGeneralType(mySQLExpressionArray1);
            fail("Expecting exception: ArrayIndexOutOfBoundsException");

        } catch (ArrayIndexOutOfBoundsException e) {
            //
            // Index 0 out of bounds for length 0
            //
            verifyException("sqlancer.mysql.ast.MySQLComputableFunction$MySQLFunction$1", e);
        }
    }

    @Test
    public void test12() throws Throwable {
        MySQLExpression[] mySQLExpressionArray0 = new MySQLExpression[4];
        MySQLComputableFunction.MySQLFunction mySQLComputableFunction_MySQLFunction0 = MySQLComputableFunction.MySQLFunction.IF;
        MySQLComputableFunction mySQLComputableFunction0 = new MySQLComputableFunction(
                mySQLComputableFunction_MySQLFunction0, mySQLExpressionArray0);
        // Undeclared exception!
        try {
            mySQLComputableFunction0.getExpectedValue();
            fail("Expecting exception: NullPointerException");

        } catch (NullPointerException e) {
            //
            // no message in exception (getMessage() returned null)
            //
            verifyException("sqlancer.mysql.ast.MySQLComputableFunction", e);
        }
    }

    @Test
    public void test13() throws Throwable {
        MySQLExpression[] mySQLExpressionArray0 = new MySQLExpression[7];
        MySQLConstant.MySQLTextConstant mySQLConstant_MySQLTextConstant0 = new MySQLConstant.MySQLTextConstant(
                "BIT_COUNT");
        MySQLCastOperation.CastType mySQLCastOperation_CastType0 = MySQLCastOperation.CastType.SIGNED;
        MySQLConstant mySQLConstant0 = mySQLConstant_MySQLTextConstant0.castAs(mySQLCastOperation_CastType0);
        mySQLExpressionArray0[0] = (MySQLExpression) mySQLConstant0;
        mySQLExpressionArray0[1] = (MySQLExpression) mySQLConstant0;
        MySQLBinaryComparisonOperation.BinaryComparisonOperator mySQLBinaryComparisonOperation_BinaryComparisonOperator0 = MySQLBinaryComparisonOperation.BinaryComparisonOperator.LESS_EQUALS;
        MySQLBinaryComparisonOperation mySQLBinaryComparisonOperation0 = new MySQLBinaryComparisonOperation(
                mySQLConstant_MySQLTextConstant0, mySQLConstant_MySQLTextConstant0,
                mySQLBinaryComparisonOperation_BinaryComparisonOperator0);
        mySQLExpressionArray0[2] = (MySQLExpression) mySQLBinaryComparisonOperation0;
        // Undeclared exception!
        try {
            MySQLComputableFunction.castToMostGeneralType(mySQLConstant_MySQLTextConstant0, mySQLExpressionArray0);
            fail("Expecting exception: RuntimeException");

        } catch (RuntimeException e) {
            //
            // no message in exception (getMessage() returned null)
            //
            verifyException("sqlancer.mysql.ast.MySQLConstant$MySQLTextConstant", e);
        }
    }

    @Test
    public void test14() throws Throwable {
        MySQLConstant.MySQLDoubleConstant mySQLConstant_MySQLDoubleConstant0 = new MySQLConstant.MySQLDoubleConstant(
                (-2015.4550757));
        MySQLExpression[] mySQLExpressionArray0 = new MySQLExpression[3];
        mySQLExpressionArray0[0] = (MySQLExpression) mySQLConstant_MySQLDoubleConstant0;
        // Undeclared exception!
        try {
            MySQLComputableFunction.castToMostGeneralType(mySQLConstant_MySQLDoubleConstant0, mySQLExpressionArray0);
            fail("Expecting exception: UnsupportedOperationException");

        } catch (UnsupportedOperationException e) {
            //
            // not applicable for PQS evaluation!
            //
            verifyException("sqlancer.mysql.ast.MySQLConstant$MySQLNoPQSConstant", e);
        }
    }

    @Test
    public void test15() throws Throwable {
        MySQLExpression[] mySQLExpressionArray0 = new MySQLExpression[0];
        MySQLComputableFunction.MySQLFunction mySQLComputableFunction_MySQLFunction0 = MySQLComputableFunction.MySQLFunction.IFNULL;
        MySQLComputableFunction mySQLComputableFunction0 = new MySQLComputableFunction(
                mySQLComputableFunction_MySQLFunction0, mySQLExpressionArray0);
        MySQLConstant mySQLConstant0 = MySQLConstant.createIntConstantNotAsBoolean(193L);
        MySQLExpression[] mySQLExpressionArray1 = new MySQLExpression[1];
        mySQLExpressionArray1[0] = (MySQLExpression) mySQLComputableFunction0;
        // Undeclared exception!
        try {
            MySQLComputableFunction.castToMostGeneralType(mySQLConstant0, mySQLExpressionArray1);
            fail("Expecting exception: ArrayIndexOutOfBoundsException");

        } catch (ArrayIndexOutOfBoundsException e) {
            //
            // Index 0 out of bounds for length 0
            //
            verifyException("sqlancer.mysql.ast.MySQLComputableFunction$MySQLFunction$4", e);
        }
    }

    @Test
    public void test16() throws Throwable {
        MySQLComputableFunction.MySQLFunction mySQLComputableFunction_MySQLFunction0 = MySQLComputableFunction.MySQLFunction.GREATEST;
        MySQLComputableFunction mySQLComputableFunction0 = null;
        try {
            mySQLComputableFunction0 = new MySQLComputableFunction(mySQLComputableFunction_MySQLFunction0,
                    (MySQLExpression[]) null);
            fail("Expecting exception: NullPointerException");

        } catch (NullPointerException e) {
            //
            // no message in exception (getMessage() returned null)
            //
            verifyException("sqlancer.mysql.ast.MySQLComputableFunction", e);
        }
    }

    @Test
    public void test17() throws Throwable {
        MySQLConstant mySQLConstant0 = MySQLConstant.createTrue();
        MySQLExpression[] mySQLExpressionArray0 = new MySQLExpression[9];
        mySQLExpressionArray0[0] = (MySQLExpression) mySQLConstant0;
        mySQLExpressionArray0[1] = (MySQLExpression) mySQLConstant0;
        // Undeclared exception!
        try {
            MySQLComputableFunction.getMostGeneralType(mySQLExpressionArray0);
            fail("Expecting exception: NullPointerException");

        } catch (NullPointerException e) {
            //
            // no message in exception (getMessage() returned null)
            //
            verifyException("sqlancer.mysql.ast.MySQLComputableFunction", e);
        }
    }

    @Test
    public void test18() throws Throwable {
        MySQLConstant mySQLConstant0 = MySQLConstant.createTrue();
        MySQLExpression[] mySQLExpressionArray0 = new MySQLExpression[5];
        mySQLExpressionArray0[0] = (MySQLExpression) mySQLConstant0;
        MySQLSchema.MySQLDataType mySQLSchema_MySQLDataType0 = MySQLSchema.MySQLDataType.VARCHAR;
        MySQLSchema.MySQLColumn mySQLSchema_MySQLColumn0 = new MySQLSchema.MySQLColumn("", mySQLSchema_MySQLDataType0,
                false, (-1));
        MySQLColumnReference mySQLColumnReference0 = MySQLColumnReference.create(mySQLSchema_MySQLColumn0,
                mySQLConstant0);
        mySQLExpressionArray0[1] = (MySQLExpression) mySQLColumnReference0;
        // Undeclared exception!
        try {
            MySQLComputableFunction.getMostGeneralType(mySQLExpressionArray0);
            fail("Expecting exception: NullPointerException");

        } catch (NullPointerException e) {
            //
            // no message in exception (getMessage() returned null)
            //
            verifyException("sqlancer.mysql.ast.MySQLComputableFunction", e);
        }
    }

    @Test
    public void test19() throws Throwable {
        MySQLExpression[] mySQLExpressionArray0 = new MySQLExpression[0];
        MySQLComputableFunction.getMostGeneralType(mySQLExpressionArray0);
    }

    @Test
    public void test20() throws Throwable {
        MySQLConstant.MySQLTextConstant mySQLConstant_MySQLTextConstant0 = new MySQLConstant.MySQLTextConstant("");
        MySQLBinaryComparisonOperation.BinaryComparisonOperator mySQLBinaryComparisonOperation_BinaryComparisonOperator0 = MySQLBinaryComparisonOperation.BinaryComparisonOperator.EQUALS;
        MySQLBinaryComparisonOperation mySQLBinaryComparisonOperation0 = new MySQLBinaryComparisonOperation(
                mySQLConstant_MySQLTextConstant0, mySQLConstant_MySQLTextConstant0,
                mySQLBinaryComparisonOperation_BinaryComparisonOperator0);
        MySQLConstant mySQLConstant0 = mySQLBinaryComparisonOperation0.getExpectedValue();
        MySQLExpression[] mySQLExpressionArray0 = new MySQLExpression[3];
        MySQLConstant.MySQLNullConstant mySQLConstant_MySQLNullConstant0 = new MySQLConstant.MySQLNullConstant();
        mySQLExpressionArray0[0] = (MySQLExpression) mySQLConstant_MySQLNullConstant0;
        mySQLExpressionArray0[1] = (MySQLExpression) mySQLConstant0;
        mySQLExpressionArray0[2] = (MySQLExpression) mySQLConstant0;
        MySQLConstant mySQLConstant1 = MySQLComputableFunction.castToMostGeneralType(mySQLConstant_MySQLTextConstant0,
                mySQLExpressionArray0);
        assertEquals(0L, mySQLConstant1.getInt());
    }

    @Test
    public void test21() throws Throwable {
        MySQLSchema.MySQLDataType mySQLSchema_MySQLDataType0 = MySQLSchema.MySQLDataType.FLOAT;
        MySQLSchema.MySQLColumn mySQLSchema_MySQLColumn0 = new MySQLSchema.MySQLColumn("Wv:VW%c;Ar",
                mySQLSchema_MySQLDataType0, false, 3556653);
        MySQLConstant mySQLConstant0 = MySQLConstant.createIntConstant((long) 3556653, false);
        MySQLColumnReference mySQLColumnReference0 = new MySQLColumnReference(mySQLSchema_MySQLColumn0, mySQLConstant0);
        MySQLCastOperation.CastType mySQLCastOperation_CastType0 = MySQLCastOperation.CastType.SIGNED;
        MySQLCastOperation mySQLCastOperation0 = new MySQLCastOperation(mySQLColumnReference0,
                mySQLCastOperation_CastType0);
        MySQLExpression[] mySQLExpressionArray0 = new MySQLExpression[8];
        MySQLConstant.MySQLNullConstant mySQLConstant_MySQLNullConstant0 = new MySQLConstant.MySQLNullConstant();
        mySQLExpressionArray0[0] = (MySQLExpression) mySQLConstant_MySQLNullConstant0;
        mySQLExpressionArray0[1] = (MySQLExpression) mySQLColumnReference0;
        mySQLExpressionArray0[2] = (MySQLExpression) mySQLCastOperation0;
        mySQLExpressionArray0[3] = (MySQLExpression) mySQLConstant0;
        mySQLExpressionArray0[4] = (MySQLExpression) mySQLConstant0;
        mySQLExpressionArray0[5] = (MySQLExpression) mySQLConstant0;
        mySQLExpressionArray0[6] = (MySQLExpression) mySQLConstant0;
        mySQLExpressionArray0[7] = (MySQLExpression) mySQLConstant0;
        // Undeclared exception!
        try {
            MySQLComputableFunction.castToMostGeneralType(mySQLConstant0, mySQLExpressionArray0);
            fail("Expecting exception: AssertionError");

        } catch (AssertionError e) {
            //
            // FLOAT
            //
        }
    }

    @Test
    public void test22() throws Throwable {
        MySQLConstant.MySQLTextConstant mySQLConstant_MySQLTextConstant0 = new MySQLConstant.MySQLTextConstant("");
        MySQLExpression[] mySQLExpressionArray0 = new MySQLExpression[1];
        mySQLExpressionArray0[0] = (MySQLExpression) mySQLConstant_MySQLTextConstant0;
        MySQLConstant mySQLConstant0 = MySQLComputableFunction.castToMostGeneralType(mySQLConstant_MySQLTextConstant0,
                mySQLExpressionArray0);
        assertFalse(mySQLConstant0.isNull());
    }

    @Test
    public void test23() throws Throwable {
        MySQLConstant mySQLConstant0 = MySQLConstant.createTrue();
        MySQLExpression[] mySQLExpressionArray0 = new MySQLExpression[1];
        mySQLExpressionArray0[0] = (MySQLExpression) mySQLConstant0;
        MySQLConstant mySQLConstant1 = MySQLComputableFunction.castToMostGeneralType(mySQLConstant0,
                mySQLExpressionArray0);
        assertSame(mySQLConstant1, mySQLConstant0);
    }

    @Test
    public void test24() throws Throwable {
        MySQLExpression[] mySQLExpressionArray0 = new MySQLExpression[2];
        MySQLConstant mySQLConstant0 = MySQLConstant.createTrue();
        // Undeclared exception!
        try {
            MySQLComputableFunction.castToMostGeneralType(mySQLConstant0, mySQLExpressionArray0);
            fail("Expecting exception: NullPointerException");

        } catch (NullPointerException e) {
            //
            // no message in exception (getMessage() returned null)
            //
            verifyException("sqlancer.mysql.ast.MySQLComputableFunction", e);
        }
    }

    @Test
    public void test25() throws Throwable {
        MySQLExpression[] mySQLExpressionArray0 = new MySQLExpression[2];
        MySQLConstant mySQLConstant0 = MySQLConstant.createNullConstant();
        MySQLConstant mySQLConstant1 = MySQLComputableFunction.castToMostGeneralType(mySQLConstant0,
                mySQLExpressionArray0);
        assertEquals("NULL", mySQLConstant1.getTextRepresentation());
    }

    @Test
    public void test26() throws Throwable {
        MySQLExpression[] mySQLExpressionArray0 = new MySQLExpression[1];
        MySQLConstant mySQLConstant0 = MySQLConstant.createNullConstant();
        mySQLExpressionArray0[0] = (MySQLExpression) mySQLConstant0;
        MySQLComputableFunction.MySQLFunction mySQLComputableFunction_MySQLFunction0 = MySQLComputableFunction.MySQLFunction.LEAST;
        MySQLComputableFunction mySQLComputableFunction0 = new MySQLComputableFunction(
                mySQLComputableFunction_MySQLFunction0, mySQLExpressionArray0);
        MySQLConstant mySQLConstant1 = mySQLComputableFunction0.getExpectedValue();
        assertEquals("NULL", mySQLConstant1.castAsString());
    }

    @Test
    public void test27() throws Throwable {
        MySQLConstant.MySQLIntConstant mySQLConstant_MySQLIntConstant0 = (MySQLConstant.MySQLIntConstant) MySQLConstant
                .createTrue();
        MySQLExpression[] mySQLExpressionArray0 = new MySQLExpression[2];
        MySQLComputableFunction.MySQLFunction mySQLComputableFunction_MySQLFunction0 = MySQLComputableFunction.MySQLFunction.GREATEST;
        MySQLConstant[] mySQLConstantArray0 = new MySQLConstant[3];
        mySQLConstantArray0[0] = (MySQLConstant) mySQLConstant_MySQLIntConstant0;
        MySQLConstant.MySQLIntConstant mySQLConstant_MySQLIntConstant1 = (MySQLConstant.MySQLIntConstant) mySQLConstant_MySQLIntConstant0
                .isLessThan(mySQLConstant_MySQLIntConstant0);
        mySQLConstantArray0[1] = (MySQLConstant) mySQLConstant_MySQLIntConstant1;
        mySQLConstantArray0[2] = (MySQLConstant) mySQLConstant_MySQLIntConstant0;
        MySQLConstant.MySQLIntConstant mySQLConstant_MySQLIntConstant2 = (MySQLConstant.MySQLIntConstant) mySQLComputableFunction_MySQLFunction0
                .apply(mySQLConstantArray0, mySQLExpressionArray0);
        assertSame(mySQLConstant_MySQLIntConstant2, mySQLConstant_MySQLIntConstant0);
    }

    @Test
    public void test28() throws Throwable {
        MySQLConstant mySQLConstant0 = MySQLConstant.createTrue();
        MySQLComputableFunction.MySQLFunction mySQLComputableFunction_MySQLFunction0 = MySQLComputableFunction.MySQLFunction.LEAST;
        MySQLExpression[] mySQLExpressionArray0 = new MySQLExpression[3];
        MySQLConstant.MySQLTextConstant mySQLConstant_MySQLTextConstant0 = new MySQLConstant.MySQLTextConstant(
                "IaG6xo1D");
        MySQLConstant mySQLConstant1 = mySQLConstant_MySQLTextConstant0.isEquals(mySQLConstant0);
        mySQLExpressionArray0[0] = (MySQLExpression) mySQLConstant1;
        mySQLExpressionArray0[1] = (MySQLExpression) mySQLConstant0;
        mySQLExpressionArray0[2] = (MySQLExpression) mySQLConstant0;
        MySQLComputableFunction mySQLComputableFunction0 = new MySQLComputableFunction(
                mySQLComputableFunction_MySQLFunction0, mySQLExpressionArray0);
        MySQLConstant mySQLConstant2 = mySQLComputableFunction0.getExpectedValue();
        assertSame(mySQLConstant2, mySQLConstant1);
        assertNotNull(mySQLConstant2);
    }

    @Test
    public void test29() throws Throwable {
        MySQLExpression[] mySQLExpressionArray0 = new MySQLExpression[1];
        MySQLConstant mySQLConstant0 = MySQLConstant.createNullConstant();
        mySQLExpressionArray0[0] = (MySQLExpression) mySQLConstant0;
        MySQLComputableFunction.MySQLFunction mySQLComputableFunction_MySQLFunction0 = MySQLComputableFunction.MySQLFunction.IFNULL;
        MySQLComputableFunction mySQLComputableFunction0 = new MySQLComputableFunction(
                mySQLComputableFunction_MySQLFunction0, mySQLExpressionArray0);
        // Undeclared exception!
        try {
            mySQLComputableFunction0.getExpectedValue();
            fail("Expecting exception: ArrayIndexOutOfBoundsException");

        } catch (ArrayIndexOutOfBoundsException e) {
            //
            // Index 1 out of bounds for length 1
            //
            verifyException("sqlancer.mysql.ast.MySQLComputableFunction$MySQLFunction$4", e);
        }
    }

    @Test
    public void test30() throws Throwable {
        MySQLComputableFunction.MySQLFunction mySQLComputableFunction_MySQLFunction0 = MySQLComputableFunction.MySQLFunction.IFNULL;
        MySQLExpression[] mySQLExpressionArray0 = new MySQLExpression[1];
        MySQLSchema.MySQLDataType mySQLSchema_MySQLDataType0 = MySQLSchema.MySQLDataType.DECIMAL;
        MySQLSchema.MySQLColumn mySQLSchema_MySQLColumn0 = new MySQLSchema.MySQLColumn("", mySQLSchema_MySQLDataType0,
                false, 1008);
        MySQLConstant.MySQLTextConstant mySQLConstant_MySQLTextConstant0 = new MySQLConstant.MySQLTextConstant("");
        MySQLColumnReference mySQLColumnReference0 = new MySQLColumnReference(mySQLSchema_MySQLColumn0,
                mySQLConstant_MySQLTextConstant0);
        mySQLExpressionArray0[0] = (MySQLExpression) mySQLColumnReference0;
        MySQLComputableFunction mySQLComputableFunction0 = new MySQLComputableFunction(
                mySQLComputableFunction_MySQLFunction0, mySQLExpressionArray0);
        // Undeclared exception!
        try {
            mySQLComputableFunction0.getExpectedValue();
            fail("Expecting exception: AssertionError");

        } catch (AssertionError e) {
            //
            // DECIMAL
            //
        }
    }

    @Test
    public void test31() throws Throwable {
        MySQLConstant mySQLConstant0 = MySQLConstant.createTrue();
        MySQLComputableFunction.MySQLFunction mySQLComputableFunction_MySQLFunction0 = MySQLComputableFunction.MySQLFunction.IF;
        MySQLExpression[] mySQLExpressionArray0 = new MySQLExpression[3];
        MySQLConstant.MySQLNullConstant mySQLConstant_MySQLNullConstant0 = new MySQLConstant.MySQLNullConstant();
        mySQLExpressionArray0[0] = (MySQLExpression) mySQLConstant_MySQLNullConstant0;
        mySQLExpressionArray0[1] = (MySQLExpression) mySQLConstant0;
        mySQLExpressionArray0[2] = (MySQLExpression) mySQLConstant0;
        MySQLComputableFunction mySQLComputableFunction0 = new MySQLComputableFunction(
                mySQLComputableFunction_MySQLFunction0, mySQLExpressionArray0);
        MySQLConstant mySQLConstant1 = mySQLComputableFunction0.getExpectedValue();
        assertSame(mySQLConstant1, mySQLConstant0);
        assertNotNull(mySQLConstant1);
    }

    @Test
    public void test32() throws Throwable {
        MySQLComputableFunction.MySQLFunction mySQLComputableFunction_MySQLFunction0 = MySQLComputableFunction.MySQLFunction.COALESCE;
        MySQLExpression[] mySQLExpressionArray0 = new MySQLExpression[1];
        MySQLConstant mySQLConstant0 = MySQLConstant.createNullConstant();
        mySQLExpressionArray0[0] = (MySQLExpression) mySQLConstant0;
        MySQLComputableFunction mySQLComputableFunction0 = new MySQLComputableFunction(
                mySQLComputableFunction_MySQLFunction0, mySQLExpressionArray0);
        MySQLConstant mySQLConstant1 = mySQLComputableFunction0.getExpectedValue();
        assertEquals("NULL", mySQLConstant1.castAsString());
    }

    @Test
    public void test33() throws Throwable {
        MySQLComputableFunction.MySQLFunction mySQLComputableFunction_MySQLFunction0 = MySQLComputableFunction.MySQLFunction.BIT_COUNT;
        MySQLExpression[] mySQLExpressionArray0 = new MySQLExpression[1];
        MySQLConstant.MySQLNullConstant mySQLConstant_MySQLNullConstant0 = new MySQLConstant.MySQLNullConstant();
        mySQLExpressionArray0[0] = (MySQLExpression) mySQLConstant_MySQLNullConstant0;
        MySQLComputableFunction mySQLComputableFunction0 = new MySQLComputableFunction(
                mySQLComputableFunction_MySQLFunction0, mySQLExpressionArray0);
        MySQLConstant mySQLConstant0 = mySQLComputableFunction0.getExpectedValue();
        assertEquals("NULL", mySQLConstant0.castAsString());
    }

    @Test
    public void test34() throws Throwable {
        MySQLComputableFunction.MySQLFunction mySQLComputableFunction_MySQLFunction0 = MySQLComputableFunction.MySQLFunction.BIT_COUNT;
        MySQLExpression[] mySQLExpressionArray0 = new MySQLExpression[1];
        MySQLConstant.MySQLDoubleConstant mySQLConstant_MySQLDoubleConstant0 = new MySQLConstant.MySQLDoubleConstant(
                1857.354);
        mySQLExpressionArray0[0] = (MySQLExpression) mySQLConstant_MySQLDoubleConstant0;
        MySQLComputableFunction mySQLComputableFunction0 = new MySQLComputableFunction(
                mySQLComputableFunction_MySQLFunction0, mySQLExpressionArray0);
        // Undeclared exception!
        try {
            mySQLComputableFunction0.getExpectedValue();
            fail("Expecting exception: UnsupportedOperationException");

        } catch (UnsupportedOperationException e) {
            //
            // not applicable for PQS evaluation!
            //
            verifyException("sqlancer.mysql.ast.MySQLConstant$MySQLNoPQSConstant", e);
        }
    }

    @Test
    public void test35() throws Throwable {
        MySQLComputableFunction.MySQLFunction mySQLComputableFunction_MySQLFunction0 = MySQLComputableFunction.MySQLFunction.BIT_COUNT;
        String string0 = mySQLComputableFunction_MySQLFunction0.toString();
        assertEquals("BIT_COUNT", string0);
    }

    @Test
    public void test36() throws Throwable {
        MySQLComputableFunction.MySQLFunction mySQLComputableFunction_MySQLFunction0 = MySQLComputableFunction.MySQLFunction.IF;
        String string0 = mySQLComputableFunction_MySQLFunction0.getName();
        assertEquals("IF", string0);
    }

    @Test
    public void test37() throws Throwable {
        MySQLComputableFunction.MySQLFunction mySQLComputableFunction_MySQLFunction0 = MySQLComputableFunction.MySQLFunction.COALESCE;
        int int0 = mySQLComputableFunction_MySQLFunction0.getNrArgs();
        assertEquals(2, int0);
    }

    @Test
    public void test38() throws Throwable {
        MySQLComputableFunction.MySQLFunction mySQLComputableFunction_MySQLFunction0 = MySQLComputableFunction.MySQLFunction
                .getRandomFunction();
        boolean boolean0 = mySQLComputableFunction_MySQLFunction0.isVariadic();
        assertFalse(boolean0);
    }

    @Test
    public void test39() throws Throwable {
        MySQLComputableFunction.MySQLFunction mySQLComputableFunction_MySQLFunction0 = MySQLComputableFunction.MySQLFunction.COALESCE;
        boolean boolean0 = mySQLComputableFunction_MySQLFunction0.isVariadic();
        assertTrue(boolean0);
    }

    @Test
    public void test40() throws Throwable {
        MySQLComputableFunction.MySQLFunction mySQLComputableFunction_MySQLFunction0 = MySQLComputableFunction.MySQLFunction.GREATEST;
        MySQLExpression[] mySQLExpressionArray0 = new MySQLExpression[2];
        MySQLConstant mySQLConstant0 = MySQLConstant.createTrue();
        mySQLExpressionArray0[0] = (MySQLExpression) mySQLConstant0;
        MySQLConstant.MySQLTextConstant mySQLConstant_MySQLTextConstant0 = new MySQLConstant.MySQLTextConstant(
                "sqlancer.mysql.MySQLGlobalState");
        mySQLExpressionArray0[1] = (MySQLExpression) mySQLConstant_MySQLTextConstant0;
        MySQLComputableFunction mySQLComputableFunction0 = new MySQLComputableFunction(
                mySQLComputableFunction_MySQLFunction0, mySQLExpressionArray0);
        // Undeclared exception!
        try {
            mySQLComputableFunction0.getExpectedValue();
            fail("Expecting exception: RuntimeException");

        } catch (RuntimeException e) {
            //
            // no message in exception (getMessage() returned null)
            //
            verifyException("sqlancer.mysql.ast.MySQLConstant$MySQLTextConstant", e);
        }
    }

    @Test
    public void test41() throws Throwable {
        MySQLExpression[] mySQLExpressionArray0 = new MySQLExpression[4];
        MySQLComputableFunction.MySQLFunction mySQLComputableFunction_MySQLFunction0 = MySQLComputableFunction.MySQLFunction.GREATEST;
        MySQLComputableFunction mySQLComputableFunction0 = new MySQLComputableFunction(
                mySQLComputableFunction_MySQLFunction0, mySQLExpressionArray0);
        MySQLExpression[] mySQLExpressionArray1 = mySQLComputableFunction0.getArguments();
        assertEquals(4, mySQLExpressionArray1.length);
    }

    @Test
    public void test42() throws Throwable {
        MySQLComputableFunction.MySQLFunction mySQLComputableFunction_MySQLFunction0 = MySQLComputableFunction.MySQLFunction
                .getRandomFunction();
        MySQLConstant[] mySQLConstantArray0 = new MySQLConstant[6];
        MySQLComputableFunction mySQLComputableFunction0 = new MySQLComputableFunction(
                mySQLComputableFunction_MySQLFunction0, mySQLConstantArray0);
        MySQLComputableFunction.MySQLFunction mySQLComputableFunction_MySQLFunction1 = mySQLComputableFunction0
                .getFunction();
        assertSame(mySQLComputableFunction_MySQLFunction1, mySQLComputableFunction_MySQLFunction0);
    }
}
