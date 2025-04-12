/*
 * This file was automatically generated by EvoSuite
 * Fri Apr 11 22:57:55 GMT 2025
 */

package sqlancer.evosuite.postgres.ast;

import static org.junit.jupiter.api.Assertions.*;
import java.math.BigDecimal;
import java.math.BigInteger;
import org.junit.jupiter.api.Test;
import sqlancer.postgres.ast.PostgresConstant;
import sqlancer.postgres.ast.PostgresExpression;
import sqlancer.postgres.ast.PostgresFunction;
import sqlancer.postgres.ast.PostgresJoin;
import sqlancer.postgres.ast.PostgresLikeOperation;
import sqlancer.postgres.ast.PostgresPostfixOperation;
import sqlancer.postgres.ast.PostgresSelect;
import sqlancer.postgres.PostgresSchema;

public class PostgresPostfixOperation_ESTest {

    private void verifyException(String s, Exception e) {
    }

    @Test
    public void test00() throws Throwable {
        PostgresPostfixOperation.PostfixOperator postgresPostfixOperation_PostfixOperator0 = PostgresPostfixOperation.PostfixOperator.IS_NOT_UNKNOWN;
        PostgresPostfixOperation postgresPostfixOperation0 = new PostgresPostfixOperation((PostgresExpression) null,
                postgresPostfixOperation_PostfixOperator0);
        PostgresExpression postgresExpression0 = postgresPostfixOperation0.getExpression();
        assertNull(postgresExpression0);
    }

    @Test
    public void test01() throws Throwable {
        PostgresConstant postgresConstant0 = PostgresConstant.createDoubleConstant(0.0);
        PostgresLikeOperation postgresLikeOperation0 = new PostgresLikeOperation(postgresConstant0, postgresConstant0);
        PostgresPostfixOperation.PostfixOperator postgresPostfixOperation_PostfixOperator0 = PostgresPostfixOperation.PostfixOperator.IS_UNKNOWN;
        PostgresPostfixOperation postgresPostfixOperation0 = new PostgresPostfixOperation(postgresLikeOperation0,
                postgresPostfixOperation_PostfixOperator0);
        // Undeclared exception!
        try {
            postgresPostfixOperation0.getExpectedValue();
            fail("Expecting exception: UnsupportedOperationException");

        } catch (UnsupportedOperationException e) {
            //
            // 0.0
            //
            verifyException("sqlancer.postgres.ast.PostgresConstant", e);
        }
    }

    @Test
    public void test02() throws Throwable {
        PostgresPostfixOperation.PostfixOperator postgresPostfixOperation_PostfixOperator0 = PostgresPostfixOperation.PostfixOperator.IS_FALSE;
        PostgresPostfixOperation postgresPostfixOperation0 = new PostgresPostfixOperation((PostgresExpression) null,
                postgresPostfixOperation_PostfixOperator0);
        // Undeclared exception!
        try {
            postgresPostfixOperation0.getExpectedValue();
            fail("Expecting exception: NullPointerException");

        } catch (NullPointerException e) {
            //
            // no message in exception (getMessage() returned null)
            //
            verifyException("sqlancer.postgres.ast.PostgresPostfixOperation", e);
        }
    }

    @Test
    public void test03() throws Throwable {
        PostgresPostfixOperation.PostfixOperator postgresPostfixOperation_PostfixOperator0 = PostgresPostfixOperation.PostfixOperator.IS_FALSE;
        PostgresJoin.PostgresJoinType postgresJoin_PostgresJoinType0 = PostgresJoin.PostgresJoinType.INNER;
        PostgresJoin postgresJoin0 = new PostgresJoin((PostgresExpression) null, (PostgresExpression) null,
                postgresJoin_PostgresJoinType0, (PostgresExpression) null);
        PostgresPostfixOperation postgresPostfixOperation0 = new PostgresPostfixOperation(postgresJoin0,
                postgresPostfixOperation_PostfixOperator0);
        // Undeclared exception!
        try {
            postgresPostfixOperation0.getExpectedValue();
            fail("Expecting exception: AssertionError");

        } catch (AssertionError e) {
            //
            // no message in exception (getMessage() returned null)
            //
        }
    }

    @Test
    public void test04() throws Throwable {
        PostgresPostfixOperation.PostfixOperator postgresPostfixOperation_PostfixOperator0 = PostgresPostfixOperation.PostfixOperator.IS_FALSE;
        PostgresFunction.PostgresFunctionWithResult postgresFunction_PostgresFunctionWithResult0 = PostgresFunction.PostgresFunctionWithResult.UPPER;
        PostgresSchema.PostgresDataType postgresSchema_PostgresDataType0 = PostgresSchema.PostgresDataType.INT;
        PostgresExpression[] postgresExpressionArray0 = new PostgresExpression[0];
        PostgresFunction postgresFunction0 = new PostgresFunction(postgresFunction_PostgresFunctionWithResult0,
                postgresSchema_PostgresDataType0, postgresExpressionArray0);
        PostgresPostfixOperation postgresPostfixOperation0 = new PostgresPostfixOperation(postgresFunction0,
                postgresPostfixOperation_PostfixOperator0);
        // Undeclared exception!
        try {
            postgresPostfixOperation0.getExpectedValue();
            fail("Expecting exception: ArrayIndexOutOfBoundsException");

        } catch (ArrayIndexOutOfBoundsException e) {
            //
            // Index 0 out of bounds for length 0
            //
            verifyException("sqlancer.postgres.ast.PostgresFunction$PostgresFunctionWithResult$4", e);
        }
    }

    @Test
    public void test05() throws Throwable {
        BigInteger bigInteger0 = BigInteger.ONE;
        BigDecimal bigDecimal0 = new BigDecimal(bigInteger0);
        PostgresConstant.DecimalConstant postgresConstant_DecimalConstant0 = new PostgresConstant.DecimalConstant(
                bigDecimal0);
        // Undeclared exception!
        try {
            PostgresPostfixOperation.create(postgresConstant_DecimalConstant0,
                    (PostgresPostfixOperation.PostfixOperator) null);
            fail("Expecting exception: NullPointerException");

        } catch (NullPointerException e) {
            //
            // no message in exception (getMessage() returned null)
            //
            verifyException("sqlancer.postgres.ast.PostgresPostfixOperation$PostfixOperator", e);
        }
    }

    @Test
    public void test06() throws Throwable {
        PostgresConstant postgresConstant0 = PostgresConstant.createFalse();
        PostgresPostfixOperation postgresPostfixOperation0 = null;
        try {
            postgresPostfixOperation0 = new PostgresPostfixOperation(postgresConstant0,
                    (PostgresPostfixOperation.PostfixOperator) null);
            fail("Expecting exception: NullPointerException");

        } catch (NullPointerException e) {
            //
            // no message in exception (getMessage() returned null)
            //
            verifyException("sqlancer.postgres.ast.PostgresPostfixOperation$PostfixOperator", e);
        }
    }

    @Test
    public void test07() throws Throwable {
        PostgresPostfixOperation.PostfixOperator postgresPostfixOperation_PostfixOperator0 = PostgresPostfixOperation.PostfixOperator.IS_FALSE;
        PostgresSelect postgresSelect0 = new PostgresSelect();
        PostgresPostfixOperation postgresPostfixOperation0 = new PostgresPostfixOperation(postgresSelect0,
                postgresPostfixOperation_PostfixOperator0);
        PostgresConstant postgresConstant0 = postgresPostfixOperation0.getExpectedValue();
        assertNull(postgresConstant0);
    }

    @Test
    public void test08() throws Throwable {
        PostgresConstant postgresConstant0 = PostgresConstant.createTrue();
        PostgresPostfixOperation.PostfixOperator postgresPostfixOperation_PostfixOperator0 = PostgresPostfixOperation.PostfixOperator.IS_FALSE;
        PostgresPostfixOperation postgresPostfixOperation0 = new PostgresPostfixOperation(postgresConstant0,
                postgresPostfixOperation_PostfixOperator0);
        PostgresConstant postgresConstant1 = postgresPostfixOperation0.getExpectedValue();
        assertNotNull(postgresConstant1);

        PostgresPostfixOperation postgresPostfixOperation1 = new PostgresPostfixOperation(postgresConstant1,
                postgresPostfixOperation_PostfixOperator0);
        PostgresConstant postgresConstant2 = postgresPostfixOperation1.getExpectedValue();
        assertEquals("TRUE", postgresConstant2.getUnquotedTextRepresentation());
        assertEquals("FALSE", postgresConstant1.getUnquotedTextRepresentation());
    }

    @Test
    public void test09() throws Throwable {
        PostgresPostfixOperation.PostfixOperator postgresPostfixOperation_PostfixOperator0 = PostgresPostfixOperation.PostfixOperator.IS_FALSE;
        PostgresConstant postgresConstant0 = PostgresConstant.createNullConstant();
        PostgresConstant postgresConstant1 = postgresPostfixOperation_PostfixOperator0.apply(postgresConstant0);
        assertFalse(postgresConstant1.isNull());
    }

    @Test
    public void test10() throws Throwable {
        PostgresPostfixOperation.PostfixOperator postgresPostfixOperation_PostfixOperator0 = PostgresPostfixOperation.PostfixOperator.IS_TRUE;
        PostgresConstant.PostgresNullConstant postgresConstant_PostgresNullConstant0 = new PostgresConstant.PostgresNullConstant();
        PostgresConstant postgresConstant0 = postgresPostfixOperation_PostfixOperator0
                .apply(postgresConstant_PostgresNullConstant0);
        assertEquals(PostgresSchema.PostgresDataType.BOOLEAN, postgresConstant0.getExpressionType());
    }

    @Test
    public void test11() throws Throwable {
        PostgresPostfixOperation.PostfixOperator postgresPostfixOperation_PostfixOperator0 = PostgresPostfixOperation.PostfixOperator.IS_TRUE;
        PostgresConstant postgresConstant0 = PostgresConstant.createTrue();
        PostgresConstant postgresConstant1 = postgresPostfixOperation_PostfixOperator0.apply(postgresConstant0);
        assertEquals("TRUE", postgresConstant1.getTextRepresentation());
    }

    @Test
    public void test12() throws Throwable {
        PostgresConstant postgresConstant0 = PostgresConstant.createNullConstant();
        PostgresPostfixOperation.PostfixOperator postgresPostfixOperation_PostfixOperator0 = PostgresPostfixOperation.PostfixOperator.IS_NOT_UNKNOWN;
        PostgresPostfixOperation postgresPostfixOperation0 = new PostgresPostfixOperation(postgresConstant0,
                postgresPostfixOperation_PostfixOperator0);
        PostgresConstant postgresConstant1 = postgresPostfixOperation0.getExpectedValue();
        assertNotNull(postgresConstant1);
        assertEquals("FALSE", postgresConstant1.getTextRepresentation());
    }

    @Test
    public void test13() throws Throwable {
        PostgresPostfixOperation.PostfixOperator postgresPostfixOperation_PostfixOperator0 = PostgresPostfixOperation.PostfixOperator.IS_NOT_UNKNOWN;
        PostgresConstant postgresConstant0 = PostgresConstant.createFalse();
        PostgresPostfixOperation postgresPostfixOperation0 = new PostgresPostfixOperation(postgresConstant0,
                postgresPostfixOperation_PostfixOperator0);
        PostgresConstant postgresConstant1 = postgresPostfixOperation0.getExpectedValue();
        assertNotNull(postgresConstant1);
        assertEquals("TRUE", postgresConstant1.getTextRepresentation());
    }

    @Test
    public void test14() throws Throwable {
        PostgresPostfixOperation.PostfixOperator postgresPostfixOperation_PostfixOperator0 = PostgresPostfixOperation.PostfixOperator.IS_NOT_NULL;
        PostgresConstant postgresConstant0 = PostgresConstant.createNullConstant();
        PostgresConstant postgresConstant1 = postgresPostfixOperation_PostfixOperator0.apply(postgresConstant0);
        assertFalse(postgresConstant1.asBoolean());
    }

    @Test
    public void test15() throws Throwable {
        PostgresPostfixOperation.PostfixOperator postgresPostfixOperation_PostfixOperator0 = PostgresPostfixOperation.PostfixOperator.IS_NOT_NULL;
        PostgresConstant postgresConstant0 = PostgresConstant.createTrue();
        PostgresConstant postgresConstant1 = postgresPostfixOperation_PostfixOperator0.apply(postgresConstant0);
        assertEquals("TRUE", postgresConstant1.getUnquotedTextRepresentation());
    }

    @Test
    public void test16() throws Throwable {
        PostgresPostfixOperation.PostfixOperator postgresPostfixOperation_PostfixOperator0 = PostgresPostfixOperation.PostfixOperator
                .getRandom();
        // Undeclared exception!
        try {
            postgresPostfixOperation_PostfixOperator0.apply((PostgresConstant) null);
            fail("Expecting exception: NullPointerException");

        } catch (NullPointerException e) {
            //
            // no message in exception (getMessage() returned null)
            //
            verifyException("sqlancer.postgres.ast.PostgresPostfixOperation$PostfixOperator$1", e);
        }
    }

    @Test
    public void test17() throws Throwable {
        PostgresPostfixOperation.PostfixOperator postgresPostfixOperation_PostfixOperator0 = PostgresPostfixOperation.PostfixOperator.IS_UNKNOWN;
        PostgresSchema.PostgresDataType[] postgresSchema_PostgresDataTypeArray0 = postgresPostfixOperation_PostfixOperator0
                .getInputDataTypes();
        assertEquals(1, postgresSchema_PostgresDataTypeArray0.length);
    }

    @Test
    public void test18() throws Throwable {
        PostgresPostfixOperation.PostfixOperator postgresPostfixOperation_PostfixOperator0 = PostgresPostfixOperation.PostfixOperator.IS_UNKNOWN;
        // Undeclared exception!
        try {
            postgresPostfixOperation_PostfixOperator0.apply((PostgresConstant) null);
            fail("Expecting exception: NullPointerException");

        } catch (NullPointerException e) {
            //
            // no message in exception (getMessage() returned null)
            //
            verifyException("sqlancer.postgres.ast.PostgresPostfixOperation$PostfixOperator$2", e);
        }
    }

    @Test
    public void test19() throws Throwable {
        PostgresPostfixOperation.PostfixOperator postgresPostfixOperation_PostfixOperator0 = PostgresPostfixOperation.PostfixOperator.IS_FALSE;
        String string0 = postgresPostfixOperation_PostfixOperator0.getTextRepresentation();
        assertEquals("IS_FALSE", string0);
    }

    @Test
    public void test20() throws Throwable {
        PostgresPostfixOperation.PostfixOperator postgresPostfixOperation_PostfixOperator0 = PostgresPostfixOperation.PostfixOperator
                .getRandom();
        PostgresSchema.PostgresDataType[] postgresSchema_PostgresDataTypeArray0 = postgresPostfixOperation_PostfixOperator0
                .getInputDataTypes();
        assertEquals(10, postgresSchema_PostgresDataTypeArray0.length);
    }

    @Test
    public void test21() throws Throwable {
        PostgresPostfixOperation.PostfixOperator postgresPostfixOperation_PostfixOperator0 = PostgresPostfixOperation.PostfixOperator.IS_NOT_NULL;
        PostgresSchema.PostgresDataType[] postgresSchema_PostgresDataTypeArray0 = postgresPostfixOperation_PostfixOperator0
                .getInputDataTypes();
        assertEquals(10, postgresSchema_PostgresDataTypeArray0.length);
    }

    @Test
    public void test22() throws Throwable {
        PostgresPostfixOperation.PostfixOperator postgresPostfixOperation_PostfixOperator0 = PostgresPostfixOperation.PostfixOperator.IS_TRUE;
        PostgresSchema.PostgresDataType[] postgresSchema_PostgresDataTypeArray0 = postgresPostfixOperation_PostfixOperator0
                .getInputDataTypes();
        assertEquals(1, postgresSchema_PostgresDataTypeArray0.length);
    }

    @Test
    public void test23() throws Throwable {
        PostgresPostfixOperation.PostfixOperator postgresPostfixOperation_PostfixOperator0 = PostgresPostfixOperation.PostfixOperator.IS_NOT_UNKNOWN;
        PostgresSchema.PostgresDataType[] postgresSchema_PostgresDataTypeArray0 = postgresPostfixOperation_PostfixOperator0
                .getInputDataTypes();
        assertEquals(1, postgresSchema_PostgresDataTypeArray0.length);
    }

    @Test
    public void test24() throws Throwable {
        PostgresPostfixOperation.PostfixOperator postgresPostfixOperation_PostfixOperator0 = PostgresPostfixOperation.PostfixOperator.IS_FALSE;
        PostgresConstant.BooleanConstant postgresConstant_BooleanConstant0 = new PostgresConstant.BooleanConstant(true);
        PostgresPostfixOperation postgresPostfixOperation0 = new PostgresPostfixOperation(
                postgresConstant_BooleanConstant0, postgresPostfixOperation_PostfixOperator0);
        PostgresExpression postgresExpression0 = postgresPostfixOperation0.getExpression();
        assertSame(postgresExpression0, postgresConstant_BooleanConstant0);
    }

    @Test
    public void test25() throws Throwable {
        PostgresConstant postgresConstant0 = PostgresConstant.createFalse();
        PostgresPostfixOperation.PostfixOperator postgresPostfixOperation_PostfixOperator0 = PostgresPostfixOperation.PostfixOperator.IS_NOT_NULL;
        PostgresPostfixOperation postgresPostfixOperation0 = new PostgresPostfixOperation(postgresConstant0,
                postgresPostfixOperation_PostfixOperator0);
        PostgresSchema.PostgresDataType postgresSchema_PostgresDataType0 = postgresPostfixOperation0
                .getExpressionType();
        assertEquals(PostgresSchema.PostgresDataType.BOOLEAN, postgresSchema_PostgresDataType0);
    }

    @Test
    public void test26() throws Throwable {
        PostgresPostfixOperation.PostfixOperator postgresPostfixOperation_PostfixOperator0 = PostgresPostfixOperation.PostfixOperator.IS_NOT_UNKNOWN;
        PostgresConstant postgresConstant0 = PostgresConstant.createFalse();
        PostgresPostfixOperation postgresPostfixOperation0 = new PostgresPostfixOperation(postgresConstant0,
                postgresPostfixOperation_PostfixOperator0);
        String string0 = postgresPostfixOperation0.getOperatorTextRepresentation();
        assertEquals("IS NOT UNKNOWN", string0);
    }

    @Test
    public void test27() throws Throwable {
        PostgresConstant postgresConstant0 = PostgresConstant.createFalse();
        PostgresPostfixOperation.PostfixOperator postgresPostfixOperation_PostfixOperator0 = PostgresPostfixOperation.PostfixOperator.IS_FALSE;
        PostgresExpression postgresExpression0 = PostgresPostfixOperation.create(postgresConstant0,
                postgresPostfixOperation_PostfixOperator0);
        assertEquals(PostgresSchema.PostgresDataType.BOOLEAN, postgresExpression0.getExpressionType());
    }

    @Test
    public void test28() throws Throwable {
        PostgresPostfixOperation.PostfixOperator postgresPostfixOperation_PostfixOperator0 = PostgresPostfixOperation.PostfixOperator.IS_FALSE;
        PostgresSchema.PostgresDataType[] postgresSchema_PostgresDataTypeArray0 = postgresPostfixOperation_PostfixOperator0
                .getInputDataTypes();
        assertEquals(1, postgresSchema_PostgresDataTypeArray0.length);
    }
}
