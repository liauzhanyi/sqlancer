/*
 * This file was automatically generated by EvoSuite
 * Sat Apr 12 01:54:11 GMT 2025
 */

package sqlancer.evosuite.mysql.ast;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import sqlancer.mysql.ast.MySQLBinaryOperation;
import sqlancer.mysql.ast.MySQLCastOperation;
import sqlancer.mysql.ast.MySQLComputableFunction;
import sqlancer.mysql.ast.MySQLConstant;
import sqlancer.mysql.ast.MySQLExpression;
import sqlancer.mysql.ast.MySQLOrderByTerm;
import sqlancer.mysql.ast.MySQLSelect;
import sqlancer.mysql.ast.MySQLText;

public class MySQLBinaryOperation_ESTest {

    private void verifyException(String s, Exception e) {
    }

    @Test
    public void test00() throws Throwable {
        MySQLBinaryOperation.MySQLBinaryOperator mySQLBinaryOperation_MySQLBinaryOperator0 = MySQLBinaryOperation.MySQLBinaryOperator.XOR;
        MySQLConstant.MySQLIntConstant mySQLConstant_MySQLIntConstant0 = new MySQLConstant.MySQLIntConstant((-486L),
                "  inet_minmax_ops");
        MySQLBinaryOperation mySQLBinaryOperation0 = new MySQLBinaryOperation(mySQLConstant_MySQLIntConstant0,
                mySQLConstant_MySQLIntConstant0, mySQLBinaryOperation_MySQLBinaryOperator0);
        MySQLConstant mySQLConstant0 = mySQLBinaryOperation0.getExpectedValue();
        assertEquals("0", mySQLConstant0.getTextRepresentation());
    }

    @Test
    public void test01() throws Throwable {
        MySQLConstant.MySQLIntConstant mySQLConstant_MySQLIntConstant0 = new MySQLConstant.MySQLIntConstant(0L,
                "SELECT name, type as category, sql FROM sqlite_master UNION SELECT name, 'temp_table' as category, sql FROM sqlite_temp_master WHERE type='table' UNION SELECT name, 'view' as category, sql FROM sqlite_temp_master WHERE type='view' GROUP BY name;");
        MySQLConstant mySQLConstant0 = MySQLConstant.createNullConstant();
        MySQLBinaryOperation.MySQLBinaryOperator mySQLBinaryOperation_MySQLBinaryOperator0 = MySQLBinaryOperation.MySQLBinaryOperator.XOR;
        MySQLBinaryOperation mySQLBinaryOperation0 = new MySQLBinaryOperation(mySQLConstant_MySQLIntConstant0,
                mySQLConstant0, mySQLBinaryOperation_MySQLBinaryOperator0);
        MySQLConstant mySQLConstant1 = mySQLBinaryOperation0.getExpectedValue();
        assertFalse(mySQLConstant1.isSigned());
    }

    @Test
    public void test02() throws Throwable {
        MySQLConstant.MySQLIntConstant mySQLConstant_MySQLIntConstant0 = new MySQLConstant.MySQLIntConstant(
                9223372036854775807L, "zL:NoP");
        MySQLConstant.MySQLTextConstant mySQLConstant_MySQLTextConstant0 = new MySQLConstant.MySQLTextConstant(
                "zL:NoP");
        MySQLCastOperation.CastType mySQLCastOperation_CastType0 = MySQLCastOperation.CastType.UNSIGNED;
        MySQLConstant mySQLConstant0 = mySQLConstant_MySQLTextConstant0.castAs(mySQLCastOperation_CastType0);
        MySQLBinaryOperation.MySQLBinaryOperator mySQLBinaryOperation_MySQLBinaryOperator0 = MySQLBinaryOperation.MySQLBinaryOperator.OR;
        MySQLBinaryOperation mySQLBinaryOperation0 = new MySQLBinaryOperation(mySQLConstant0,
                mySQLConstant_MySQLIntConstant0, mySQLBinaryOperation_MySQLBinaryOperator0);
        MySQLConstant mySQLConstant1 = mySQLBinaryOperation0.getExpectedValue();
        assertEquals(9223372036854775807L, mySQLConstant1.getInt());
    }

    @Test
    public void test03() throws Throwable {
        MySQLConstant.MySQLIntConstant mySQLConstant_MySQLIntConstant0 = new MySQLConstant.MySQLIntConstant(
                9223372036854775807L, "zL:NoP");
        MySQLBinaryOperation.MySQLBinaryOperator mySQLBinaryOperation_MySQLBinaryOperator0 = MySQLBinaryOperation.MySQLBinaryOperator.OR;
        MySQLBinaryOperation mySQLBinaryOperation0 = new MySQLBinaryOperation(mySQLConstant_MySQLIntConstant0,
                mySQLConstant_MySQLIntConstant0, mySQLBinaryOperation_MySQLBinaryOperator0);
        MySQLConstant mySQLConstant0 = mySQLBinaryOperation0.getExpectedValue();
        assertEquals(9223372036854775807L, mySQLConstant0.getInt());
    }

    @Test
    public void test04() throws Throwable {
        MySQLConstant.MySQLTextConstant mySQLConstant_MySQLTextConstant0 = new MySQLConstant.MySQLTextConstant("OR");
        MySQLConstant mySQLConstant0 = MySQLConstant.createUnsignedIntConstant(1667L);
        MySQLBinaryOperation.MySQLBinaryOperator mySQLBinaryOperation_MySQLBinaryOperator0 = MySQLBinaryOperation.MySQLBinaryOperator.AND;
        MySQLBinaryOperation mySQLBinaryOperation0 = new MySQLBinaryOperation(mySQLConstant0,
                mySQLConstant_MySQLTextConstant0, mySQLBinaryOperation_MySQLBinaryOperator0);
        MySQLConstant mySQLConstant1 = mySQLBinaryOperation0.getExpectedValue();
        assertFalse(mySQLConstant1.asBooleanNotNull());
    }

    @Test
    public void test05() throws Throwable {
        MySQLBinaryOperation.MySQLBinaryOperator mySQLBinaryOperation_MySQLBinaryOperator0 = MySQLBinaryOperation.MySQLBinaryOperator.OR;
        MySQLConstant.MySQLNullConstant mySQLConstant_MySQLNullConstant0 = new MySQLConstant.MySQLNullConstant();
        MySQLConstant mySQLConstant0 = mySQLBinaryOperation_MySQLBinaryOperator0.apply(mySQLConstant_MySQLNullConstant0,
                mySQLConstant_MySQLNullConstant0);
        assertEquals("NULL", mySQLConstant0.castAsString());
    }

    @Test
    public void test06() throws Throwable {
        MySQLOrderByTerm.MySQLOrder mySQLOrderByTerm_MySQLOrder0 = MySQLOrderByTerm.MySQLOrder.ASC;
        MySQLOrderByTerm mySQLOrderByTerm0 = new MySQLOrderByTerm((MySQLExpression) null, mySQLOrderByTerm_MySQLOrder0);
        MySQLBinaryOperation.MySQLBinaryOperator mySQLBinaryOperation_MySQLBinaryOperator0 = MySQLBinaryOperation.MySQLBinaryOperator.XOR;
        MySQLBinaryOperation mySQLBinaryOperation0 = new MySQLBinaryOperation(mySQLOrderByTerm0, (MySQLExpression) null,
                mySQLBinaryOperation_MySQLBinaryOperator0);
        MySQLExpression mySQLExpression0 = mySQLBinaryOperation0.getRight();
        assertNull(mySQLExpression0);
    }

    @Test
    public void test07() throws Throwable {
        MySQLSelect mySQLSelect0 = new MySQLSelect();
        MySQLBinaryOperation.MySQLBinaryOperator mySQLBinaryOperation_MySQLBinaryOperator0 = MySQLBinaryOperation.MySQLBinaryOperator.AND;
        MySQLBinaryOperation mySQLBinaryOperation0 = new MySQLBinaryOperation((MySQLExpression) null, mySQLSelect0,
                mySQLBinaryOperation_MySQLBinaryOperator0);
        MySQLExpression mySQLExpression0 = mySQLBinaryOperation0.getLeft();
        assertNull(mySQLExpression0);
    }

    @Test
    public void test08() throws Throwable {
        MySQLConstant.MySQLDoubleConstant mySQLConstant_MySQLDoubleConstant0 = new MySQLConstant.MySQLDoubleConstant(
                1649.521);
        MySQLBinaryOperation.MySQLBinaryOperator mySQLBinaryOperation_MySQLBinaryOperator0 = MySQLBinaryOperation.MySQLBinaryOperator.XOR;
        MySQLBinaryOperation mySQLBinaryOperation0 = new MySQLBinaryOperation(mySQLConstant_MySQLDoubleConstant0,
                mySQLConstant_MySQLDoubleConstant0, mySQLBinaryOperation_MySQLBinaryOperator0);
        // Undeclared exception!
        try {
            mySQLBinaryOperation0.getExpectedValue();
            fail("Expecting exception: UnsupportedOperationException");

        } catch (UnsupportedOperationException e) {
            //
            // not applicable for PQS evaluation!
            //
            verifyException("sqlancer.mysql.ast.MySQLConstant$MySQLNoPQSConstant", e);
        }
    }

    @Test
    public void test09() throws Throwable {
        MySQLBinaryOperation.MySQLBinaryOperator mySQLBinaryOperation_MySQLBinaryOperator0 = MySQLBinaryOperation.MySQLBinaryOperator.AND;
        MySQLBinaryOperation mySQLBinaryOperation0 = new MySQLBinaryOperation((MySQLExpression) null,
                (MySQLExpression) null, mySQLBinaryOperation_MySQLBinaryOperator0);
        // Undeclared exception!
        try {
            mySQLBinaryOperation0.getExpectedValue();
            fail("Expecting exception: NullPointerException");

        } catch (NullPointerException e) {
            //
            // no message in exception (getMessage() returned null)
            //
            verifyException("sqlancer.mysql.ast.MySQLBinaryOperation", e);
        }
    }

    @Test
    public void test10() throws Throwable {
        MySQLText mySQLText0 = new MySQLText("binary");
        MySQLBinaryOperation.MySQLBinaryOperator mySQLBinaryOperation_MySQLBinaryOperator0 = MySQLBinaryOperation.MySQLBinaryOperator.OR;
        MySQLBinaryOperation mySQLBinaryOperation0 = new MySQLBinaryOperation(mySQLText0, mySQLText0,
                mySQLBinaryOperation_MySQLBinaryOperator0);
        // Undeclared exception!
        try {
            mySQLBinaryOperation0.getExpectedValue();
            fail("Expecting exception: AssertionError");

        } catch (AssertionError e) {
            //
            // PQS not supported for this operator
            //
        }
    }

    @Test
    public void test11() throws Throwable {
        MySQLConstant.MySQLTextConstant mySQLConstant_MySQLTextConstant0 = new MySQLConstant.MySQLTextConstant("5R");
        MySQLConstant mySQLConstant0 = MySQLConstant.createStringConstant(".=/\"RWT");
        MySQLBinaryOperation.MySQLBinaryOperator mySQLBinaryOperation_MySQLBinaryOperator0 = MySQLBinaryOperation.MySQLBinaryOperator.AND;
        MySQLBinaryOperation mySQLBinaryOperation0 = new MySQLBinaryOperation(mySQLConstant_MySQLTextConstant0,
                mySQLConstant0, mySQLBinaryOperation_MySQLBinaryOperator0);
        // Undeclared exception!
        try {
            mySQLBinaryOperation0.getExpectedValue();
            fail("Expecting exception: RuntimeException");

        } catch (RuntimeException e) {
            //
            // no message in exception (getMessage() returned null)
            //
            verifyException("sqlancer.mysql.ast.MySQLBinaryOperation", e);
        }
    }

    @Test
    public void test12() throws Throwable {
        MySQLConstant.MySQLTextConstant mySQLConstant_MySQLTextConstant0 = new MySQLConstant.MySQLTextConstant(" \n");
        MySQLBinaryOperation.MySQLBinaryOperator mySQLBinaryOperation_MySQLBinaryOperator0 = MySQLBinaryOperation.MySQLBinaryOperator.AND;
        MySQLConstant.MySQLNullConstant mySQLConstant_MySQLNullConstant0 = new MySQLConstant.MySQLNullConstant();
        MySQLBinaryOperation mySQLBinaryOperation0 = new MySQLBinaryOperation(mySQLConstant_MySQLNullConstant0,
                mySQLConstant_MySQLTextConstant0, mySQLBinaryOperation_MySQLBinaryOperator0);
        // Undeclared exception!
        try {
            mySQLBinaryOperation0.getExpectedValue();
            fail("Expecting exception: RuntimeException");

        } catch (RuntimeException e) {
            //
            // no message in exception (getMessage() returned null)
            //
            verifyException("sqlancer.mysql.ast.MySQLBinaryOperation", e);
        }
    }

    @Test
    public void test13() throws Throwable {
        MySQLConstant.MySQLTextConstant mySQLConstant_MySQLTextConstant0 = new MySQLConstant.MySQLTextConstant(".");
        MySQLBinaryOperation.MySQLBinaryOperator mySQLBinaryOperation_MySQLBinaryOperator0 = MySQLBinaryOperation.MySQLBinaryOperator.XOR;
        MySQLBinaryOperation mySQLBinaryOperation0 = new MySQLBinaryOperation(mySQLConstant_MySQLTextConstant0,
                mySQLConstant_MySQLTextConstant0, mySQLBinaryOperation_MySQLBinaryOperator0);
        // Undeclared exception!
        try {
            mySQLBinaryOperation0.getExpectedValue();
            fail("Expecting exception: RuntimeException");

        } catch (RuntimeException e) {
            //
            // no message in exception (getMessage() returned null)
            //
            verifyException("sqlancer.mysql.ast.MySQLBinaryOperation", e);
        }
    }

    @Test
    public void test14() throws Throwable {
        MySQLConstant.MySQLTextConstant mySQLConstant_MySQLTextConstant0 = new MySQLConstant.MySQLTextConstant(
                "\n!+\"wNS!V*M:MV");
        MySQLBinaryOperation.MySQLBinaryOperator mySQLBinaryOperation_MySQLBinaryOperator0 = MySQLBinaryOperation.MySQLBinaryOperator.XOR;
        MySQLBinaryOperation mySQLBinaryOperation0 = new MySQLBinaryOperation(mySQLConstant_MySQLTextConstant0,
                mySQLConstant_MySQLTextConstant0, mySQLBinaryOperation_MySQLBinaryOperator0);
        // Undeclared exception!
        try {
            mySQLBinaryOperation0.getExpectedValue();
            fail("Expecting exception: RuntimeException");

        } catch (RuntimeException e) {
            //
            // no message in exception (getMessage() returned null)
            //
            verifyException("sqlancer.mysql.ast.MySQLBinaryOperation", e);
        }
    }

    @Test
    public void test15() throws Throwable {
        MySQLConstant.MySQLTextConstant mySQLConstant_MySQLTextConstant0 = new MySQLConstant.MySQLTextConstant(" ");
        MySQLBinaryOperation.MySQLBinaryOperator mySQLBinaryOperation_MySQLBinaryOperator0 = MySQLBinaryOperation.MySQLBinaryOperator.OR;
        MySQLConstant.MySQLNullConstant mySQLConstant_MySQLNullConstant0 = new MySQLConstant.MySQLNullConstant();
        MySQLBinaryOperation mySQLBinaryOperation0 = new MySQLBinaryOperation(mySQLConstant_MySQLTextConstant0,
                mySQLConstant_MySQLNullConstant0, mySQLBinaryOperation_MySQLBinaryOperator0);
        MySQLConstant mySQLConstant0 = mySQLBinaryOperation0.getExpectedValue();
        assertFalse(mySQLConstant0.isSigned());
    }

    @Test
    public void test16() throws Throwable {
        MySQLConstant.MySQLTextConstant mySQLConstant_MySQLTextConstant0 = new MySQLConstant.MySQLTextConstant("\to");
        MySQLBinaryOperation.MySQLBinaryOperator mySQLBinaryOperation_MySQLBinaryOperator0 = MySQLBinaryOperation.MySQLBinaryOperator.OR;
        MySQLBinaryOperation mySQLBinaryOperation0 = new MySQLBinaryOperation(mySQLConstant_MySQLTextConstant0,
                mySQLConstant_MySQLTextConstant0, mySQLBinaryOperation_MySQLBinaryOperator0);
        MySQLConstant mySQLConstant0 = mySQLBinaryOperation0.getExpectedValue();
        assertEquals(0L, mySQLConstant0.getInt());
    }

    @Test
    public void test17() throws Throwable {
        MySQLConstant.MySQLTextConstant mySQLConstant_MySQLTextConstant0 = new MySQLConstant.MySQLTextConstant(" ");
        MySQLBinaryOperation.MySQLBinaryOperator mySQLBinaryOperation_MySQLBinaryOperator0 = MySQLBinaryOperation.MySQLBinaryOperator.XOR;
        MySQLBinaryOperation mySQLBinaryOperation0 = new MySQLBinaryOperation(mySQLConstant_MySQLTextConstant0,
                mySQLConstant_MySQLTextConstant0, mySQLBinaryOperation_MySQLBinaryOperator0);
        MySQLConstant mySQLConstant0 = mySQLBinaryOperation0.getExpectedValue();
        assertEquals("0", mySQLConstant0.getTextRepresentation());
    }

    @Test
    public void test18() throws Throwable {
        MySQLBinaryOperation.MySQLBinaryOperator mySQLBinaryOperation_MySQLBinaryOperator0 = MySQLBinaryOperation.MySQLBinaryOperator
                .getRandom();
        MySQLComputableFunction.MySQLFunction mySQLComputableFunction_MySQLFunction0 = MySQLComputableFunction.MySQLFunction.IF;
        MySQLExpression[] mySQLExpressionArray0 = new MySQLExpression[0];
        MySQLComputableFunction mySQLComputableFunction0 = new MySQLComputableFunction(
                mySQLComputableFunction_MySQLFunction0, mySQLExpressionArray0);
        MySQLBinaryOperation mySQLBinaryOperation0 = new MySQLBinaryOperation(mySQLComputableFunction0,
                mySQLComputableFunction0, mySQLBinaryOperation_MySQLBinaryOperator0);
        // Undeclared exception!
        try {
            mySQLBinaryOperation0.getExpectedValue();
            fail("Expecting exception: ArrayIndexOutOfBoundsException");

        } catch (ArrayIndexOutOfBoundsException e) {
            //
            // Index 0 out of bounds for length 0
            //
            verifyException("sqlancer.mysql.ast.MySQLComputableFunction$MySQLFunction$3", e);
        }
    }

    @Test
    public void test19() throws Throwable {
        MySQLConstant.MySQLTextConstant mySQLConstant_MySQLTextConstant0 = new MySQLConstant.MySQLTextConstant(" ");
        MySQLBinaryOperation.MySQLBinaryOperator mySQLBinaryOperation_MySQLBinaryOperator0 = MySQLBinaryOperation.MySQLBinaryOperator.XOR;
        MySQLBinaryOperation mySQLBinaryOperation0 = new MySQLBinaryOperation(mySQLConstant_MySQLTextConstant0,
                mySQLConstant_MySQLTextConstant0, mySQLBinaryOperation_MySQLBinaryOperator0);
        MySQLBinaryOperation.MySQLBinaryOperator mySQLBinaryOperation_MySQLBinaryOperator1 = mySQLBinaryOperation0
                .getOp();
        String string0 = mySQLBinaryOperation_MySQLBinaryOperator1.getTextRepresentation();
        assertEquals("^", string0);
    }

    @Test
    public void test20() throws Throwable {
        MySQLConstant.MySQLTextConstant mySQLConstant_MySQLTextConstant0 = new MySQLConstant.MySQLTextConstant(" ");
        MySQLBinaryOperation.MySQLBinaryOperator mySQLBinaryOperation_MySQLBinaryOperator0 = MySQLBinaryOperation.MySQLBinaryOperator.XOR;
        MySQLBinaryOperation mySQLBinaryOperation0 = new MySQLBinaryOperation(mySQLConstant_MySQLTextConstant0,
                mySQLConstant_MySQLTextConstant0, mySQLBinaryOperation_MySQLBinaryOperator0);
        MySQLConstant.MySQLTextConstant mySQLConstant_MySQLTextConstant1 = (MySQLConstant.MySQLTextConstant) mySQLBinaryOperation0
                .getLeft();
        assertEquals(" ", mySQLConstant_MySQLTextConstant1.getString());
    }

    @Test
    public void test21() throws Throwable {
        MySQLConstant.MySQLTextConstant mySQLConstant_MySQLTextConstant0 = new MySQLConstant.MySQLTextConstant("OR");
        MySQLConstant mySQLConstant0 = MySQLConstant.createUnsignedIntConstant(1667L);
        MySQLBinaryOperation.MySQLBinaryOperator mySQLBinaryOperation_MySQLBinaryOperator0 = MySQLBinaryOperation.MySQLBinaryOperator.AND;
        MySQLBinaryOperation mySQLBinaryOperation0 = new MySQLBinaryOperation(mySQLConstant0,
                mySQLConstant_MySQLTextConstant0, mySQLBinaryOperation_MySQLBinaryOperator0);
        MySQLConstant.MySQLTextConstant mySQLConstant_MySQLTextConstant1 = (MySQLConstant.MySQLTextConstant) mySQLBinaryOperation0
                .getRight();
        assertFalse(mySQLConstant_MySQLTextConstant1.isInt());
    }
}
