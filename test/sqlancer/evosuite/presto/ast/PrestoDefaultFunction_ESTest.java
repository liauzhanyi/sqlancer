/*
 * This file was automatically generated by EvoSuite
 * Fri Apr 11 18:34:11 GMT 2025
 */

package sqlancer.evosuite.presto.ast;

import static org.junit.jupiter.api.Assertions.*;
import java.util.List;
import org.junit.jupiter.api.Test;
import sqlancer.presto.ast.PrestoAggregateFunction;
import sqlancer.presto.ast.PrestoDefaultFunction;
import sqlancer.presto.ast.PrestoExpression;
import sqlancer.presto.gen.PrestoTypedExpressionGenerator;
import sqlancer.presto.PrestoSchema;

public class PrestoDefaultFunction_ESTest {

    private void verifyException(String s, Exception e) {
    }

    @Test
    public void test00() throws Throwable {
        PrestoDefaultFunction[] prestoDefaultFunctionArray0 = PrestoDefaultFunction.values();
        assertEquals(6, prestoDefaultFunctionArray0.length);
    }

    @Test
    public void test01() throws Throwable {
        PrestoDefaultFunction prestoDefaultFunction0 = PrestoDefaultFunction.LEAST;
        PrestoSchema.PrestoDataType prestoSchema_PrestoDataType0 = PrestoSchema.PrestoDataType.INT;
        PrestoSchema.PrestoCompositeDataType prestoSchema_PrestoCompositeDataType0 = new PrestoSchema.PrestoCompositeDataType(
                prestoSchema_PrestoDataType0, 2266, 2266);
        boolean boolean0 = prestoDefaultFunction0.isCompatibleWithReturnType(prestoSchema_PrestoCompositeDataType0);
        assertTrue(boolean0);
    }

    @Test
    public void test02() throws Throwable {
        PrestoDefaultFunction prestoDefaultFunction0 = PrestoDefaultFunction.GREATEST;
        PrestoSchema.PrestoDataType prestoSchema_PrestoDataType0 = PrestoSchema.PrestoDataType.JSON;
        PrestoSchema.PrestoCompositeDataType prestoSchema_PrestoCompositeDataType0 = prestoSchema_PrestoDataType0.get();
        boolean boolean0 = prestoDefaultFunction0.isCompatibleWithReturnType(prestoSchema_PrestoCompositeDataType0);
        assertFalse(boolean0);
    }

    @Test
    public void test03() throws Throwable {
        PrestoDefaultFunction prestoDefaultFunction0 = PrestoDefaultFunction.GREATEST;
        // Undeclared exception!
        try {
            prestoDefaultFunction0.isCompatibleWithReturnType((PrestoSchema.PrestoCompositeDataType) null);
            fail("Expecting exception: NullPointerException");

        } catch (NullPointerException e) {
            //
            // no message in exception (getMessage() returned null)
            //
            verifyException("sqlancer.presto.ast.PrestoDefaultFunction$5", e);
        }
    }

    @Test
    public void test04() throws Throwable {
        // Undeclared exception!
        try {
            PrestoDefaultFunction.getFunctionsCompatibleWith((PrestoSchema.PrestoCompositeDataType) null);
            fail("Expecting exception: NullPointerException");

        } catch (NullPointerException e) {
            //
            // no message in exception (getMessage() returned null)
            //
            verifyException("sqlancer.presto.ast.PrestoDefaultFunction$5", e);
        }
    }

    @Test
    public void test05() throws Throwable {
        PrestoSchema.PrestoDataType prestoSchema_PrestoDataType0 = PrestoSchema.PrestoDataType.NULL;
        PrestoSchema.PrestoDataType[] prestoSchema_PrestoDataTypeArray0 = PrestoSchema.PrestoDataType.values();
        PrestoDefaultFunction prestoDefaultFunction0 = PrestoDefaultFunction.COALESCE;
        PrestoSchema.PrestoCompositeDataType prestoSchema_PrestoCompositeDataType0 = new PrestoSchema.PrestoCompositeDataType(
                prestoSchema_PrestoDataType0, (-1073741823), (-1073741823));
        // Undeclared exception!
        try {
            prestoDefaultFunction0.getArgumentsForReturnType((PrestoTypedExpressionGenerator) null, (-1073741823),
                    prestoSchema_PrestoDataTypeArray0, prestoSchema_PrestoCompositeDataType0);
            fail("Expecting exception: AssertionError");

        } catch (AssertionError e) {
            //
            // NULL
            //
        }
    }

    @Test
    public void test06() throws Throwable {
        PrestoDefaultFunction prestoDefaultFunction0 = PrestoDefaultFunction.LEAST;
        // Undeclared exception!
        try {
            prestoDefaultFunction0.getArgumentTypes((PrestoSchema.PrestoCompositeDataType) null);
            fail("Expecting exception: NullPointerException");

        } catch (NullPointerException e) {
            //
            // no message in exception (getMessage() returned null)
            //
            verifyException("sqlancer.presto.ast.PrestoDefaultFunction$6", e);
        }
    }

    @Test
    public void test07() throws Throwable {
        PrestoDefaultFunction prestoDefaultFunction0 = PrestoDefaultFunction.LEAST;
        PrestoSchema.PrestoDataType[] prestoSchema_PrestoDataTypeArray0 = new PrestoSchema.PrestoDataType[5];
        PrestoAggregateFunction prestoAggregateFunction0 = PrestoAggregateFunction.MIN;
        PrestoSchema.PrestoCompositeDataType prestoSchema_PrestoCompositeDataType0 = prestoAggregateFunction0
                .getCompositeReturnType();
        // Undeclared exception!
        try {
            prestoDefaultFunction0.getArgumentsForReturnType((PrestoTypedExpressionGenerator) null, 0,
                    prestoSchema_PrestoDataTypeArray0, prestoSchema_PrestoCompositeDataType0);
            fail("Expecting exception: NullPointerException");

        } catch (NullPointerException e) {
            //
            // no message in exception (getMessage() returned null)
            //
            verifyException("sqlancer.presto.ast.PrestoDefaultFunction", e);
        }
    }

    @Test
    public void test08() throws Throwable {
        PrestoDefaultFunction prestoDefaultFunction0 = PrestoDefaultFunction.IF_TRUE_FALSE;
        int int0 = prestoDefaultFunction0.getNumberOfArguments();
        assertEquals(0, int0);
    }

    @Test
    public void test09() throws Throwable {
        PrestoDefaultFunction prestoDefaultFunction0 = PrestoDefaultFunction.IF_TRUE_FALSE;
        String string0 = prestoDefaultFunction0.toString();
        assertEquals("if", string0);
    }

    @Test
    public void test10() throws Throwable {
        PrestoSchema.PrestoDataType prestoSchema_PrestoDataType0 = PrestoSchema.PrestoDataType.ARRAY;
        PrestoDefaultFunction prestoDefaultFunction0 = PrestoDefaultFunction.IF_TRUE_FALSE;
        PrestoSchema.PrestoDataType[] prestoSchema_PrestoDataTypeArray0 = new PrestoSchema.PrestoDataType[1];
        prestoSchema_PrestoDataTypeArray0[0] = prestoSchema_PrestoDataType0;
        PrestoSchema.PrestoDataType prestoSchema_PrestoDataType1 = PrestoSchema.PrestoDataType.VARBINARY;
        PrestoSchema.PrestoCompositeDataType prestoSchema_PrestoCompositeDataType0 = prestoSchema_PrestoDataType1.get();
        // Undeclared exception!
        try {
            prestoDefaultFunction0.getArgumentsForReturnType((PrestoTypedExpressionGenerator) null, 6,
                    prestoSchema_PrestoDataTypeArray0, prestoSchema_PrestoCompositeDataType0);
            fail("Expecting exception: NullPointerException");

        } catch (NullPointerException e) {
            //
            // no message in exception (getMessage() returned null)
            //
            verifyException("sqlancer.presto.ast.PrestoDefaultFunction", e);
        }
    }

    @Test
    public void test11() throws Throwable {
        PrestoSchema.PrestoDataType prestoSchema_PrestoDataType0 = PrestoSchema.PrestoDataType.ARRAY;
        PrestoSchema.PrestoCompositeDataType prestoSchema_PrestoCompositeDataType0 = new PrestoSchema.PrestoCompositeDataType(
                prestoSchema_PrestoDataType0, (-1073741785), (-1073741785));
        PrestoDefaultFunction prestoDefaultFunction0 = PrestoDefaultFunction.NULLIF;
        PrestoSchema.PrestoDataType[] prestoSchema_PrestoDataTypeArray0 = new PrestoSchema.PrestoDataType[1];
        prestoSchema_PrestoDataTypeArray0[0] = prestoSchema_PrestoDataType0;
        // Undeclared exception!
        try {
            prestoDefaultFunction0.getArgumentsForReturnType((PrestoTypedExpressionGenerator) null, (-1073741785),
                    prestoSchema_PrestoDataTypeArray0, prestoSchema_PrestoCompositeDataType0);
            fail("Expecting exception: NullPointerException");

        } catch (NullPointerException e) {
            //
            // no message in exception (getMessage() returned null)
            //
            verifyException("sqlancer.presto.ast.PrestoDefaultFunction", e);
        }
    }

    @Test
    public void test12() throws Throwable {
        PrestoSchema.PrestoCompositeDataType prestoSchema_PrestoCompositeDataType0 = PrestoSchema.PrestoCompositeDataType
                .getRandomWithoutNull();
        PrestoDefaultFunction prestoDefaultFunction0 = PrestoDefaultFunction.IF_TRUE_FALSE;
        PrestoSchema.PrestoDataType[] prestoSchema_PrestoDataTypeArray0 = new PrestoSchema.PrestoDataType[0];
        List<PrestoExpression> list0 = prestoDefaultFunction0.getArgumentsForReturnType(
                (PrestoTypedExpressionGenerator) null, 1110, prestoSchema_PrestoDataTypeArray0,
                prestoSchema_PrestoCompositeDataType0);
        assertTrue(list0.isEmpty());
    }

    @Test
    public void test13() throws Throwable {
        PrestoSchema.PrestoDataType[] prestoSchema_PrestoDataTypeArray0 = PrestoSchema.PrestoDataType.values();
        PrestoSchema.PrestoCompositeDataType prestoSchema_PrestoCompositeDataType0 = PrestoSchema.PrestoCompositeDataType
                .getRandomWithoutNull();
        PrestoDefaultFunction prestoDefaultFunction0 = PrestoDefaultFunction.NULLIF;
        // Undeclared exception!
        try {
            prestoDefaultFunction0.getArgumentsForReturnType((PrestoTypedExpressionGenerator) null, 3,
                    prestoSchema_PrestoDataTypeArray0, prestoSchema_PrestoCompositeDataType0);
            fail("Expecting exception: NullPointerException");

        } catch (NullPointerException e) {
            //
            // no message in exception (getMessage() returned null)
            //
            verifyException("sqlancer.presto.ast.PrestoDefaultFunction", e);
        }
    }

    @Test
    public void test14() throws Throwable {
        PrestoSchema.PrestoCompositeDataType prestoSchema_PrestoCompositeDataType0 = PrestoSchema.PrestoCompositeDataType
                .getRandomWithoutNull();
        PrestoDefaultFunction prestoDefaultFunction0 = PrestoDefaultFunction.LEAST;
        PrestoSchema.PrestoDataType[] prestoSchema_PrestoDataTypeArray0 = prestoDefaultFunction0
                .getArgumentTypes(prestoSchema_PrestoCompositeDataType0);
        assertEquals(3, prestoSchema_PrestoDataTypeArray0.length);
    }

    @Test
    public void test15() throws Throwable {
        PrestoSchema.PrestoDataType prestoSchema_PrestoDataType0 = PrestoSchema.PrestoDataType.JSON;
        PrestoSchema.PrestoCompositeDataType prestoSchema_PrestoCompositeDataType0 = prestoSchema_PrestoDataType0.get();
        List<PrestoDefaultFunction> list0 = PrestoDefaultFunction
                .getFunctionsCompatibleWith(prestoSchema_PrestoCompositeDataType0);
        assertEquals(4, list0.size());
    }

    @Test
    public void test16() throws Throwable {
        PrestoSchema.PrestoCompositeDataType prestoSchema_PrestoCompositeDataType0 = PrestoSchema.PrestoCompositeDataType
                .getRandomWithoutNull();
        PrestoDefaultFunction prestoDefaultFunction0 = PrestoDefaultFunction.IF_TRUE;
        PrestoSchema.PrestoDataType[] prestoSchema_PrestoDataTypeArray0 = prestoDefaultFunction0
                .getArgumentTypes(prestoSchema_PrestoCompositeDataType0);
        assertEquals(2, prestoSchema_PrestoDataTypeArray0.length);
    }

    @Test
    public void test17() throws Throwable {
        PrestoDefaultFunction prestoDefaultFunction0 = PrestoDefaultFunction.NULLIF;
        PrestoSchema.PrestoCompositeDataType prestoSchema_PrestoCompositeDataType0 = PrestoSchema.PrestoCompositeDataType
                .getRandomWithoutNull();
        PrestoSchema.PrestoDataType[] prestoSchema_PrestoDataTypeArray0 = prestoDefaultFunction0
                .getArgumentTypes(prestoSchema_PrestoCompositeDataType0);
        assertEquals(2, prestoSchema_PrestoDataTypeArray0.length);
    }

    @Test
    public void test18() throws Throwable {
        PrestoSchema.PrestoDataType prestoSchema_PrestoDataType0 = PrestoSchema.PrestoDataType.INT;
        PrestoSchema.PrestoCompositeDataType prestoSchema_PrestoCompositeDataType0 = prestoSchema_PrestoDataType0.get();
        PrestoDefaultFunction prestoDefaultFunction0 = PrestoDefaultFunction.IF_TRUE_FALSE;
        PrestoSchema.PrestoDataType[] prestoSchema_PrestoDataTypeArray0 = prestoDefaultFunction0
                .getArgumentTypes(prestoSchema_PrestoCompositeDataType0);
        assertEquals(3, prestoSchema_PrestoDataTypeArray0.length);
    }

    @Test
    public void test19() throws Throwable {
        PrestoDefaultFunction prestoDefaultFunction0 = PrestoDefaultFunction.GREATEST;
        PrestoSchema.PrestoDataType prestoSchema_PrestoDataType0 = PrestoSchema.PrestoDataType.ARRAY;
        PrestoSchema.PrestoCompositeDataType prestoSchema_PrestoCompositeDataType0 = PrestoSchema.PrestoCompositeDataType
                .fromDataType(prestoSchema_PrestoDataType0);
        PrestoSchema.PrestoDataType[] prestoSchema_PrestoDataTypeArray0 = prestoDefaultFunction0
                .getArgumentTypes(prestoSchema_PrestoCompositeDataType0);
        // Undeclared exception!
        try {
            prestoDefaultFunction0.getArgumentsForReturnType((PrestoTypedExpressionGenerator) null, 3,
                    prestoSchema_PrestoDataTypeArray0, prestoSchema_PrestoCompositeDataType0);
            fail("Expecting exception: NullPointerException");

        } catch (NullPointerException e) {
            //
            // no message in exception (getMessage() returned null)
            //
            verifyException("sqlancer.presto.ast.PrestoDefaultFunction", e);
        }
    }

    @Test
    public void test20() throws Throwable {
        PrestoDefaultFunction prestoDefaultFunction0 = PrestoDefaultFunction.LEAST;
        int int0 = prestoDefaultFunction0.getNumberOfArguments();
        assertEquals((-1), int0);
    }

    @Test
    public void test21() throws Throwable {
        PrestoDefaultFunction prestoDefaultFunction0 = PrestoDefaultFunction.IF_TRUE_FALSE;
        String string0 = prestoDefaultFunction0.getFunctionName();
        assertEquals("if", string0);
    }

    @Test
    public void test22() throws Throwable {
        PrestoSchema.PrestoDataType prestoSchema_PrestoDataType0 = PrestoSchema.PrestoDataType.ARRAY;
        PrestoSchema.PrestoCompositeDataType prestoSchema_PrestoCompositeDataType0 = PrestoSchema.PrestoCompositeDataType
                .fromDataType(prestoSchema_PrestoDataType0);
        List<PrestoDefaultFunction> list0 = PrestoDefaultFunction
                .getFunctionsCompatibleWith(prestoSchema_PrestoCompositeDataType0);
        assertEquals(6, list0.size());
    }
}
