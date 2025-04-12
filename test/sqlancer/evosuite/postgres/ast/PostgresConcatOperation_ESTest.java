/*
 * This file was automatically generated by EvoSuite
 * Fri Apr 11 22:41:59 GMT 2025
 */

package sqlancer.evosuite.postgres.ast;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import sqlancer.common.ast.JoinBase;
import sqlancer.postgres.ast.PostgresConcatOperation;
import sqlancer.postgres.ast.PostgresConstant;
import sqlancer.postgres.ast.PostgresExpression;
import sqlancer.postgres.ast.PostgresFunction;
import sqlancer.postgres.ast.PostgresJoin;
import sqlancer.postgres.ast.PostgresLikeOperation;
import sqlancer.postgres.ast.PostgresSelect;
import sqlancer.postgres.PostgresSchema;

public class PostgresConcatOperation_ESTest {

    private void verifyException(String s, Exception e) {
    }

    @Test
    public void test00() throws Throwable {
        PostgresConstant.IntConstant postgresConstant_IntConstant0 = new PostgresConstant.IntConstant(1217L);
        PostgresConstant postgresConstant0 = PostgresConstant.createTrue();
        PostgresConcatOperation postgresConcatOperation0 = new PostgresConcatOperation(postgresConstant0,
                postgresConstant_IntConstant0);
        PostgresConstant postgresConstant1 = postgresConcatOperation0.getExpectedValue();
        assertEquals("true1217", postgresConstant1.getUnquotedTextRepresentation());
        assertNotNull(postgresConstant1);
    }

    @Test
    public void test01() throws Throwable {
        PostgresConstant postgresConstant0 = PostgresConstant.createBooleanConstant(false);
        PostgresLikeOperation postgresLikeOperation0 = new PostgresLikeOperation(postgresConstant0, postgresConstant0);
        PostgresConcatOperation postgresConcatOperation0 = new PostgresConcatOperation(postgresLikeOperation0,
                postgresConstant0);
        // Undeclared exception!
        try {
            postgresConcatOperation0.getExpectedValue();
            fail("Expecting exception: UnsupportedOperationException");

        } catch (UnsupportedOperationException e) {
            //
            // FALSE
            //
            verifyException("sqlancer.postgres.ast.PostgresConstant", e);
        }
    }

    @Test
    public void test02() throws Throwable {
        PostgresConcatOperation postgresConcatOperation0 = new PostgresConcatOperation((PostgresExpression) null,
                (PostgresExpression) null);
        // Undeclared exception!
        try {
            postgresConcatOperation0.getExpectedValue();
            fail("Expecting exception: NullPointerException");

        } catch (NullPointerException e) {
            //
            // no message in exception (getMessage() returned null)
            //
            verifyException("sqlancer.postgres.ast.PostgresConcatOperation", e);
        }
    }

    @Test
    public void test03() throws Throwable {
        PostgresSelect postgresSelect0 = new PostgresSelect();
        JoinBase.JoinType postgresJoin_PostgresJoinType0 = JoinBase.JoinType.FULL;
        PostgresJoin postgresJoin0 = new PostgresJoin(postgresSelect0, postgresSelect0, postgresJoin_PostgresJoinType0,
                postgresSelect0);
        PostgresConcatOperation postgresConcatOperation0 = new PostgresConcatOperation(postgresSelect0, postgresJoin0);
        // Undeclared exception!
        try {
            postgresConcatOperation0.getExpectedValue();
            fail("Expecting exception: AssertionError");

        } catch (AssertionError e) {
            //
            // no message in exception (getMessage() returned null)
            //
        }
    }

    @Test
    public void test04() throws Throwable {
        PostgresFunction.PostgresFunctionWithResult postgresFunction_PostgresFunctionWithResult0 = PostgresFunction.PostgresFunctionWithResult.LOWER;
        PostgresSchema.PostgresDataType postgresSchema_PostgresDataType0 = PostgresSchema.PostgresDataType.INT;
        PostgresExpression[] postgresExpressionArray0 = new PostgresExpression[0];
        PostgresFunction postgresFunction0 = new PostgresFunction(postgresFunction_PostgresFunctionWithResult0,
                postgresSchema_PostgresDataType0, postgresExpressionArray0);
        PostgresConcatOperation postgresConcatOperation0 = new PostgresConcatOperation(postgresFunction0,
                postgresFunction0);
        // Undeclared exception!
        try {
            postgresConcatOperation0.getExpectedValue();
            fail("Expecting exception: ArrayIndexOutOfBoundsException");

        } catch (ArrayIndexOutOfBoundsException e) {
            //
            // Index 0 out of bounds for length 0
            //
            verifyException("sqlancer.postgres.ast.PostgresFunction$PostgresFunctionWithResult$2", e);
        }
    }

    @Test
    public void test05() throws Throwable {
        PostgresConstant postgresConstant0 = PostgresConstant.createFalse();
        PostgresConstant.PostgresNullConstant postgresConstant_PostgresNullConstant0 = new PostgresConstant.PostgresNullConstant();
        PostgresConcatOperation postgresConcatOperation0 = new PostgresConcatOperation(postgresConstant0,
                postgresConstant_PostgresNullConstant0);
        PostgresConstant postgresConstant1 = postgresConcatOperation0.getExpectedValue();
        assertTrue(postgresConstant1.isNull());
    }

    @Test
    public void test06() throws Throwable {
        PostgresConstant.PostgresNullConstant postgresConstant_PostgresNullConstant0 = new PostgresConstant.PostgresNullConstant();
        PostgresConcatOperation postgresConcatOperation0 = new PostgresConcatOperation(
                postgresConstant_PostgresNullConstant0, postgresConstant_PostgresNullConstant0);
        PostgresConstant postgresConstant0 = postgresConcatOperation0.getExpectedValue();
        assertNotSame(postgresConstant_PostgresNullConstant0, postgresConstant0);
    }

    @Test
    public void test07() throws Throwable {
        PostgresConstant.PostgresNullConstant postgresConstant_PostgresNullConstant0 = new PostgresConstant.PostgresNullConstant();
        PostgresSelect postgresSelect0 = new PostgresSelect();
        PostgresConcatOperation postgresConcatOperation0 = new PostgresConcatOperation(
                postgresConstant_PostgresNullConstant0, postgresSelect0);
        PostgresConstant postgresConstant0 = postgresConcatOperation0.getExpectedValue();
        assertNull(postgresConstant0);
    }

    @Test
    public void test08() throws Throwable {
        PostgresSelect postgresSelect0 = new PostgresSelect();
        PostgresConcatOperation postgresConcatOperation0 = new PostgresConcatOperation(postgresSelect0,
                postgresSelect0);
        PostgresConstant postgresConstant0 = postgresConcatOperation0.getExpectedValue();
        assertNull(postgresConstant0);
    }

    @Test
    public void test09() throws Throwable {
        PostgresSelect postgresSelect0 = new PostgresSelect();
        PostgresConcatOperation postgresConcatOperation0 = new PostgresConcatOperation(postgresSelect0,
                postgresSelect0);
        PostgresSchema.PostgresDataType postgresSchema_PostgresDataType0 = postgresConcatOperation0.getExpressionType();
        assertEquals(PostgresSchema.PostgresDataType.TEXT, postgresSchema_PostgresDataType0);
    }

    @Test
    public void test10() throws Throwable {
        PostgresConcatOperation postgresConcatOperation0 = new PostgresConcatOperation((PostgresExpression) null,
                (PostgresExpression) null);
        String string0 = postgresConcatOperation0.getOperatorRepresentation();
        assertEquals("||", string0);
    }
}
