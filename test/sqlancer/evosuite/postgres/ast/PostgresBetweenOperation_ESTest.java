/*
 * This file was automatically generated by EvoSuite
 * Fri Apr 11 18:56:22 GMT 2025
 */

package sqlancer.evosuite.postgres.ast;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import sqlancer.postgres.ast.PostgresBetweenOperation;
import sqlancer.postgres.ast.PostgresConstant;
import sqlancer.postgres.ast.PostgresExpression;
import sqlancer.postgres.ast.PostgresFunction;
import sqlancer.postgres.ast.PostgresJoin;
import sqlancer.postgres.ast.PostgresSelect;
import sqlancer.postgres.PostgresSchema;

public class PostgresBetweenOperation_ESTest {

    private void verifyException(String s, Exception e) {
    }

    @Test
    public void test00() throws Throwable {
        PostgresBetweenOperation postgresBetweenOperation0 = new PostgresBetweenOperation((PostgresExpression) null,
                (PostgresExpression) null, (PostgresExpression) null, true);
        boolean boolean0 = postgresBetweenOperation0.isSymmetric();
        assertTrue(boolean0);
    }

    @Test
    public void test01() throws Throwable {
        PostgresSelect postgresSelect0 = new PostgresSelect();
        PostgresBetweenOperation postgresBetweenOperation0 = new PostgresBetweenOperation(postgresSelect0,
                postgresSelect0, postgresSelect0, false);
        postgresBetweenOperation0.getRight();
        assertFalse(postgresBetweenOperation0.isSymmetric());
    }

    @Test
    public void test02() throws Throwable {
        PostgresConstant.BooleanConstant postgresConstant_BooleanConstant0 = new PostgresConstant.BooleanConstant(true);
        PostgresBetweenOperation postgresBetweenOperation0 = new PostgresBetweenOperation(
                postgresConstant_BooleanConstant0, postgresConstant_BooleanConstant0, postgresConstant_BooleanConstant0,
                false);
        postgresBetweenOperation0.getLeft();
        assertFalse(postgresBetweenOperation0.isSymmetric());
    }

    @Test
    public void test03() throws Throwable {
        PostgresBetweenOperation postgresBetweenOperation0 = new PostgresBetweenOperation((PostgresExpression) null,
                (PostgresExpression) null, (PostgresExpression) null, true);
        postgresBetweenOperation0.getExpr();
        assertTrue(postgresBetweenOperation0.isSymmetric());
    }

    @Test
    public void test04() throws Throwable {
        PostgresConstant.PostgresNullConstant postgresConstant_PostgresNullConstant0 = new PostgresConstant.PostgresNullConstant();
        PostgresSelect postgresSelect0 = new PostgresSelect();
        PostgresBetweenOperation postgresBetweenOperation0 = new PostgresBetweenOperation(
                postgresConstant_PostgresNullConstant0, postgresSelect0, postgresSelect0, false);
        postgresBetweenOperation0.getExpectedValue();
        assertFalse(postgresBetweenOperation0.isSymmetric());
    }

    @Test
    public void test05() throws Throwable {
        PostgresConstant.BooleanConstant postgresConstant_BooleanConstant0 = new PostgresConstant.BooleanConstant(true);
        PostgresBetweenOperation postgresBetweenOperation0 = new PostgresBetweenOperation(
                postgresConstant_BooleanConstant0, postgresConstant_BooleanConstant0, postgresConstant_BooleanConstant0,
                false);
        postgresBetweenOperation0.getExpectedValue();
        assertFalse(postgresBetweenOperation0.isSymmetric());
    }

    @Test
    public void test06() throws Throwable {
        PostgresConstant.IntConstant postgresConstant_IntConstant0 = new PostgresConstant.IntConstant(1169L);
        PostgresConstant.PostgresNullConstant postgresConstant_PostgresNullConstant0 = new PostgresConstant.PostgresNullConstant();
        PostgresBetweenOperation postgresBetweenOperation0 = new PostgresBetweenOperation(
                postgresConstant_PostgresNullConstant0, postgresConstant_PostgresNullConstant0,
                postgresConstant_IntConstant0, false);
        postgresBetweenOperation0.getExpectedValue();
        assertFalse(postgresBetweenOperation0.isSymmetric());
    }

    @Test
    public void test07() throws Throwable {
        PostgresConstant postgresConstant0 = PostgresConstant.createIntConstant(874L);
        PostgresConstant.BitConstant postgresConstant_BitConstant0 = new PostgresConstant.BitConstant(874L);
        PostgresBetweenOperation postgresBetweenOperation0 = new PostgresBetweenOperation(postgresConstant0,
                postgresConstant0, postgresConstant_BitConstant0, true);
        // Undeclared exception!
        try {
            postgresBetweenOperation0.getExpectedValue();
            fail("Expecting exception: RuntimeException");

        } catch (RuntimeException e) {
            //
            // no message in exception (getMessage() returned null)
            //
            verifyException("sqlancer.postgres.ast.PostgresConstant$IntConstant", e);
        }
    }

    @Test
    public void test08() throws Throwable {
        PostgresConstant.IntConstant postgresConstant_IntConstant0 = new PostgresConstant.IntConstant(0L);
        PostgresConstant.BooleanConstant postgresConstant_BooleanConstant0 = new PostgresConstant.BooleanConstant(
                false);
        PostgresBetweenOperation postgresBetweenOperation0 = new PostgresBetweenOperation(postgresConstant_IntConstant0,
                postgresConstant_BooleanConstant0, postgresConstant_BooleanConstant0, false);
        // Undeclared exception!
        try {
            postgresBetweenOperation0.getExpectedValue();
            fail("Expecting exception: UnsupportedOperationException");

        } catch (UnsupportedOperationException e) {
            //
            // 0
            //
            verifyException("sqlancer.postgres.ast.PostgresConstant", e);
        }
    }

    @Test
    public void test09() throws Throwable {
        PostgresJoin.PostgresJoinType postgresJoin_PostgresJoinType0 = PostgresJoin.PostgresJoinType.INNER;
        PostgresJoin postgresJoin0 = PostgresJoin.createJoin((PostgresExpression) null, (PostgresExpression) null,
                postgresJoin_PostgresJoinType0, (PostgresExpression) null);
        PostgresBetweenOperation postgresBetweenOperation0 = new PostgresBetweenOperation((PostgresExpression) null,
                postgresJoin0, postgresJoin0, false);
        // Undeclared exception!
        try {
            postgresBetweenOperation0.getExpectedValue();
            fail("Expecting exception: AssertionError");

        } catch (AssertionError e) {
            //
            // no message in exception (getMessage() returned null)
            //
        }
    }

    @Test
    public void test10() throws Throwable {
        PostgresFunction.PostgresFunctionWithResult postgresFunction_PostgresFunctionWithResult0 = PostgresFunction.PostgresFunctionWithResult.LENGTH;
        PostgresSchema.PostgresDataType postgresSchema_PostgresDataType0 = PostgresSchema.PostgresDataType.BIT;
        PostgresExpression[] postgresExpressionArray0 = new PostgresExpression[0];
        PostgresFunction postgresFunction0 = new PostgresFunction(postgresFunction_PostgresFunctionWithResult0,
                postgresSchema_PostgresDataType0, postgresExpressionArray0);
        PostgresBetweenOperation postgresBetweenOperation0 = new PostgresBetweenOperation(postgresFunction0,
                postgresFunction0, postgresFunction0, false);
        // Undeclared exception!
        try {
            postgresBetweenOperation0.getExpectedValue();
            fail("Expecting exception: ArrayIndexOutOfBoundsException");

        } catch (ArrayIndexOutOfBoundsException e) {
            //
            // Index 0 out of bounds for length 0
            //
            verifyException("sqlancer.postgres.ast.PostgresFunction$PostgresFunctionWithResult$3", e);
        }
    }

    @Test
    public void test11() throws Throwable {
        PostgresBetweenOperation postgresBetweenOperation0 = new PostgresBetweenOperation((PostgresExpression) null,
                (PostgresExpression) null, (PostgresExpression) null, true);
        // Undeclared exception!
        try {
            postgresBetweenOperation0.getExpectedValue();
            fail("Expecting exception: NullPointerException");

        } catch (NullPointerException e) {
            //
            // no message in exception (getMessage() returned null)
            //
            verifyException("sqlancer.postgres.ast.PostgresBinaryComparisonOperation", e);
        }
    }

    @Test
    public void test12() throws Throwable {
        PostgresBetweenOperation postgresBetweenOperation0 = new PostgresBetweenOperation((PostgresExpression) null,
                (PostgresExpression) null, (PostgresExpression) null, false);
        postgresBetweenOperation0.getRight();
        assertFalse(postgresBetweenOperation0.isSymmetric());
    }

    @Test
    public void test13() throws Throwable {
        PostgresBetweenOperation postgresBetweenOperation0 = new PostgresBetweenOperation((PostgresExpression) null,
                (PostgresExpression) null, (PostgresExpression) null, false);
        boolean boolean0 = postgresBetweenOperation0.isSymmetric();
        assertFalse(boolean0);
    }

    @Test
    public void test14() throws Throwable {
        PostgresBetweenOperation postgresBetweenOperation0 = new PostgresBetweenOperation((PostgresExpression) null,
                (PostgresExpression) null, (PostgresExpression) null, false);
        postgresBetweenOperation0.getExpressionType();
        assertFalse(postgresBetweenOperation0.isSymmetric());
    }

    @Test
    public void test15() throws Throwable {
        PostgresConstant postgresConstant0 = PostgresConstant.createFalse();
        PostgresBetweenOperation postgresBetweenOperation0 = new PostgresBetweenOperation(postgresConstant0,
                postgresConstant0, postgresConstant0, true);
        postgresBetweenOperation0.getExpr();
        assertTrue(postgresBetweenOperation0.isSymmetric());
    }

    @Test
    public void test16() throws Throwable {
        PostgresBetweenOperation postgresBetweenOperation0 = new PostgresBetweenOperation((PostgresExpression) null,
                (PostgresExpression) null, (PostgresExpression) null, false);
        postgresBetweenOperation0.getLeft();
        assertFalse(postgresBetweenOperation0.isSymmetric());
    }
}
