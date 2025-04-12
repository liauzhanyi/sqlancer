/*
 * This file was automatically generated by EvoSuite
 * Fri Apr 11 15:58:09 GMT 2025
 */

package sqlancer.evosuite.mysql.oracle;

import static org.junit.jupiter.api.Assertions.*;
import java.sql.ResultSet;
import java.util.function.Consumer;
import org.junit.jupiter.api.Test;
import sqlancer.common.query.SQLQueryResultCheckAdapter;
import sqlancer.mysql.ast.MySQLBinaryComparisonOperation;
import sqlancer.mysql.ast.MySQLBinaryOperation;
import sqlancer.mysql.ast.MySQLComputableFunction;
import sqlancer.mysql.ast.MySQLConstant;
import sqlancer.mysql.ast.MySQLExpression;
import sqlancer.mysql.ast.MySQLSelect;
import sqlancer.mysql.MySQLGlobalState;
import sqlancer.mysql.oracle.MySQLPivotedQuerySynthesisOracle;

public class MySQLPivotedQuerySynthesisOracle_ESTest {

    private void verifyException(String s, Exception e) {
    }

    @Test
    public void test0() throws Throwable {
        MySQLGlobalState mySQLGlobalState0 = new MySQLGlobalState();
        MySQLPivotedQuerySynthesisOracle mySQLPivotedQuerySynthesisOracle0 = new MySQLPivotedQuerySynthesisOracle(
                mySQLGlobalState0);
        MySQLConstant mySQLConstant0 = MySQLConstant.createFalse();
        String string0 = mySQLPivotedQuerySynthesisOracle0.getExpectedValues(mySQLConstant0);
        assertEquals("\t0 -- 0\n", string0);
    }

    @Test
    public void test1() throws Throwable {
        MySQLGlobalState mySQLGlobalState0 = new MySQLGlobalState();
        MySQLPivotedQuerySynthesisOracle mySQLPivotedQuerySynthesisOracle0 = new MySQLPivotedQuerySynthesisOracle(
                mySQLGlobalState0);
        MySQLSelect mySQLSelect0 = new MySQLSelect();
        String string0 = mySQLPivotedQuerySynthesisOracle0.getExpectedValues(mySQLSelect0);
        assertEquals("", string0);
    }

    @Test
    public void test2() throws Throwable {
        MySQLGlobalState mySQLGlobalState0 = new MySQLGlobalState();
        MySQLPivotedQuerySynthesisOracle mySQLPivotedQuerySynthesisOracle0 = new MySQLPivotedQuerySynthesisOracle(
                mySQLGlobalState0);
        // Undeclared exception!
        try {
            mySQLPivotedQuerySynthesisOracle0.getRectifiedQuery();
            fail("Expecting exception: AssertionError");

        } catch (AssertionError e) {
            //
            // null
            //
        }
    }

    @Test
    public void test3() throws Throwable {
        MySQLGlobalState mySQLGlobalState0 = new MySQLGlobalState();
        MySQLPivotedQuerySynthesisOracle mySQLPivotedQuerySynthesisOracle0 = new MySQLPivotedQuerySynthesisOracle(
                mySQLGlobalState0);
        MySQLConstant.MySQLDoubleConstant mySQLConstant_MySQLDoubleConstant0 = new MySQLConstant.MySQLDoubleConstant(
                (-1482.80681354765));
        MySQLBinaryComparisonOperation.BinaryComparisonOperator mySQLBinaryComparisonOperation_BinaryComparisonOperator0 = MySQLBinaryComparisonOperation.BinaryComparisonOperator.LIKE;
        MySQLBinaryComparisonOperation mySQLBinaryComparisonOperation0 = new MySQLBinaryComparisonOperation(
                mySQLConstant_MySQLDoubleConstant0, mySQLConstant_MySQLDoubleConstant0,
                mySQLBinaryComparisonOperation_BinaryComparisonOperator0);
        // Undeclared exception!
        try {
            mySQLPivotedQuerySynthesisOracle0.getExpectedValues(mySQLBinaryComparisonOperation0);
            fail("Expecting exception: UnsupportedOperationException");

        } catch (UnsupportedOperationException e) {
            //
            // not applicable for PQS evaluation!
            //
            verifyException("sqlancer.mysql.ast.MySQLConstant$MySQLNoPQSConstant", e);
        }
    }

    @Test
    public void test4() throws Throwable {
        MySQLGlobalState mySQLGlobalState0 = new MySQLGlobalState();
        MySQLPivotedQuerySynthesisOracle mySQLPivotedQuerySynthesisOracle0 = new MySQLPivotedQuerySynthesisOracle(
                mySQLGlobalState0);
        MySQLSelect mySQLSelect0 = new MySQLSelect();
        MySQLBinaryOperation.MySQLBinaryOperator mySQLBinaryOperation_MySQLBinaryOperator0 = MySQLBinaryOperation.MySQLBinaryOperator.OR;
        MySQLBinaryOperation mySQLBinaryOperation0 = new MySQLBinaryOperation(mySQLSelect0, mySQLSelect0,
                mySQLBinaryOperation_MySQLBinaryOperator0);
        // Undeclared exception!
        try {
            mySQLPivotedQuerySynthesisOracle0.getExpectedValues(mySQLBinaryOperation0);
            fail("Expecting exception: IllegalStateException");

        } catch (IllegalStateException e) {
            //
            // no message in exception (getMessage() returned null)
            //
            verifyException("sqlancer.common.ast.SelectBase", e);
        }
    }

    @Test
    public void test5() throws Throwable {
        MySQLGlobalState mySQLGlobalState0 = new MySQLGlobalState();
        MySQLPivotedQuerySynthesisOracle mySQLPivotedQuerySynthesisOracle0 = new MySQLPivotedQuerySynthesisOracle(
                mySQLGlobalState0);
        // Undeclared exception!
        try {
            mySQLPivotedQuerySynthesisOracle0.getExpectedValues((MySQLExpression) null);
            fail("Expecting exception: AssertionError");

        } catch (AssertionError e) {
            //
            // null
            //
        }
    }

    @Test
    public void test6() throws Throwable {
        MySQLGlobalState mySQLGlobalState0 = new MySQLGlobalState();
        MySQLPivotedQuerySynthesisOracle mySQLPivotedQuerySynthesisOracle0 = new MySQLPivotedQuerySynthesisOracle(
                mySQLGlobalState0);
        MySQLComputableFunction.MySQLFunction mySQLComputableFunction_MySQLFunction0 = MySQLComputableFunction.MySQLFunction.IF;
        MySQLExpression[] mySQLExpressionArray0 = new MySQLExpression[0];
        MySQLComputableFunction mySQLComputableFunction0 = new MySQLComputableFunction(
                mySQLComputableFunction_MySQLFunction0, mySQLExpressionArray0);
        // Undeclared exception!
        try {
            mySQLPivotedQuerySynthesisOracle0.getExpectedValues(mySQLComputableFunction0);
            fail("Expecting exception: ArrayIndexOutOfBoundsException");

        } catch (ArrayIndexOutOfBoundsException e) {
            //
            // Index 0 out of bounds for length 0
            //
            verifyException("sqlancer.mysql.ast.MySQLComputableFunction$MySQLFunction$3", e);
        }
    }

    @Test
    public void test7() throws Throwable {
        MySQLGlobalState mySQLGlobalState0 = new MySQLGlobalState();
        SQLQueryResultCheckAdapter sQLQueryResultCheckAdapter0 = new SQLQueryResultCheckAdapter("ISNULL",
                (Consumer<ResultSet>) null);
        MySQLPivotedQuerySynthesisOracle mySQLPivotedQuerySynthesisOracle0 = new MySQLPivotedQuerySynthesisOracle(
                mySQLGlobalState0);
        // Undeclared exception!
        try {
            mySQLPivotedQuerySynthesisOracle0.getContainmentCheckQuery(sQLQueryResultCheckAdapter0);
            fail("Expecting exception: NullPointerException");

        } catch (NullPointerException e) {
            //
            // no message in exception (getMessage() returned null)
            //
            verifyException("sqlancer.mysql.oracle.MySQLPivotedQuerySynthesisOracle", e);
        }
    }

    @Test
    public void test8() throws Throwable {
        MySQLGlobalState mySQLGlobalState0 = new MySQLGlobalState();
        MySQLPivotedQuerySynthesisOracle mySQLPivotedQuerySynthesisOracle0 = new MySQLPivotedQuerySynthesisOracle(
                mySQLGlobalState0);
        MySQLConstant mySQLConstant0 = MySQLConstant.createStringConstant((String) null);
        // Undeclared exception!
        try {
            mySQLPivotedQuerySynthesisOracle0.getExpectedValues(mySQLConstant0);
            fail("Expecting exception: NullPointerException");

        } catch (NullPointerException e) {
            //
            // no message in exception (getMessage() returned null)
            //
            verifyException("sqlancer.mysql.ast.MySQLConstant$MySQLTextConstant", e);
        }
    }

    @Test
    public void test9() throws Throwable {
        MySQLPivotedQuerySynthesisOracle mySQLPivotedQuerySynthesisOracle0 = new MySQLPivotedQuerySynthesisOracle(
                (MySQLGlobalState) null);
        // Undeclared exception!
        try {
            mySQLPivotedQuerySynthesisOracle0.getRectifiedQuery();
            fail("Expecting exception: NullPointerException");

        } catch (NullPointerException e) {
            //
            // no message in exception (getMessage() returned null)
            //
            verifyException("sqlancer.mysql.oracle.MySQLPivotedQuerySynthesisOracle", e);
        }
    }
}
