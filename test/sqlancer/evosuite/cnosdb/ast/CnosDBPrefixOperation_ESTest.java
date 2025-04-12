/*
 * This file was automatically generated by EvoSuite
 * Fri Apr 11 17:58:02 GMT 2025
 */

package sqlancer.evosuite.cnosdb.ast;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import sqlancer.cnosdb.ast.CnosDBConstant;
import sqlancer.cnosdb.ast.CnosDBExpression;
import sqlancer.cnosdb.ast.CnosDBPrefixOperation;
import sqlancer.cnosdb.CnosDBSchema;

public class CnosDBPrefixOperation_ESTest {

    private void verifyException(String s, Exception e) {
    }

    @Test
    public void test00() throws Throwable {
        CnosDBPrefixOperation.PrefixOperator cnosDBPrefixOperation_PrefixOperator0 = CnosDBPrefixOperation.PrefixOperator.UNARY_MINUS;
        CnosDBPrefixOperation cnosDBPrefixOperation0 = new CnosDBPrefixOperation((CnosDBExpression) null,
                cnosDBPrefixOperation_PrefixOperator0);
        CnosDBSchema.CnosDBDataType[] cnosDBSchema_CnosDBDataTypeArray0 = cnosDBPrefixOperation0.getInputDataTypes();
        assertEquals(1, cnosDBSchema_CnosDBDataTypeArray0.length);
    }

    @Test
    public void test01() throws Throwable {
        CnosDBPrefixOperation.PrefixOperator cnosDBPrefixOperation_PrefixOperator0 = CnosDBPrefixOperation.PrefixOperator.UNARY_PLUS;
        CnosDBPrefixOperation cnosDBPrefixOperation0 = new CnosDBPrefixOperation((CnosDBExpression) null,
                cnosDBPrefixOperation_PrefixOperator0);
        CnosDBExpression cnosDBExpression0 = cnosDBPrefixOperation0.getExpression();
        assertNull(cnosDBExpression0);
    }

    @Test
    public void test02() throws Throwable {
        CnosDBPrefixOperation cnosDBPrefixOperation0 = new CnosDBPrefixOperation((CnosDBExpression) null,
                (CnosDBPrefixOperation.PrefixOperator) null);
        // Undeclared exception!
        try {
            cnosDBPrefixOperation0.getTextRepresentation();
            fail("Expecting exception: NullPointerException");

        } catch (NullPointerException e) {
            //
            // no message in exception (getMessage() returned null)
            //
            verifyException("sqlancer.cnosdb.ast.CnosDBPrefixOperation$PrefixOperator", e);
        }
    }

    @Test
    public void test03() throws Throwable {
        CnosDBPrefixOperation cnosDBPrefixOperation0 = new CnosDBPrefixOperation((CnosDBExpression) null,
                (CnosDBPrefixOperation.PrefixOperator) null);
        // Undeclared exception!
        try {
            cnosDBPrefixOperation0.getExpressionType();
            fail("Expecting exception: NullPointerException");

        } catch (NullPointerException e) {
            //
            // no message in exception (getMessage() returned null)
            //
            verifyException("sqlancer.cnosdb.ast.CnosDBPrefixOperation", e);
        }
    }

    @Test
    public void test04() throws Throwable {
        CnosDBPrefixOperation.PrefixOperator cnosDBPrefixOperation_PrefixOperator0 = CnosDBPrefixOperation.PrefixOperator.UNARY_MINUS;
        String string0 = cnosDBPrefixOperation_PrefixOperator0.getTextRepresentation();
        assertEquals("UNARY_MINUS", string0);
    }

    @Test
    public void test05() throws Throwable {
        CnosDBConstant.CnosDBNullConstant cnosDBConstant_CnosDBNullConstant0 = new CnosDBConstant.CnosDBNullConstant();
        CnosDBPrefixOperation.PrefixOperator cnosDBPrefixOperation_PrefixOperator0 = CnosDBPrefixOperation.PrefixOperator.NOT;
        CnosDBPrefixOperation cnosDBPrefixOperation0 = new CnosDBPrefixOperation(cnosDBConstant_CnosDBNullConstant0,
                cnosDBPrefixOperation_PrefixOperator0);
        CnosDBSchema.CnosDBDataType cnosDBSchema_CnosDBDataType0 = cnosDBPrefixOperation0.getExpressionType();
        assertEquals(CnosDBSchema.CnosDBDataType.BOOLEAN, cnosDBSchema_CnosDBDataType0);
    }

    @Test
    public void test06() throws Throwable {
        CnosDBConstant.CnosDBNullConstant cnosDBConstant_CnosDBNullConstant0 = new CnosDBConstant.CnosDBNullConstant();
        CnosDBPrefixOperation.PrefixOperator cnosDBPrefixOperation_PrefixOperator0 = CnosDBPrefixOperation.PrefixOperator.NOT;
        CnosDBPrefixOperation cnosDBPrefixOperation0 = new CnosDBPrefixOperation(cnosDBConstant_CnosDBNullConstant0,
                cnosDBPrefixOperation_PrefixOperator0);
        String string0 = cnosDBPrefixOperation0.getTextRepresentation();
        assertEquals("NOT", string0);
    }

    @Test
    public void test07() throws Throwable {
        CnosDBPrefixOperation cnosDBPrefixOperation0 = new CnosDBPrefixOperation((CnosDBExpression) null,
                (CnosDBPrefixOperation.PrefixOperator) null);
        // Undeclared exception!
        try {
            cnosDBPrefixOperation0.getInputDataTypes();
            fail("Expecting exception: NullPointerException");

        } catch (NullPointerException e) {
            //
            // no message in exception (getMessage() returned null)
            //
            verifyException("sqlancer.cnosdb.ast.CnosDBPrefixOperation$PrefixOperator", e);
        }
    }

    @Test
    public void test08() throws Throwable {
        CnosDBConstant.CnosDBNullConstant cnosDBConstant_CnosDBNullConstant0 = new CnosDBConstant.CnosDBNullConstant();
        CnosDBPrefixOperation.PrefixOperator cnosDBPrefixOperation_PrefixOperator0 = CnosDBPrefixOperation.PrefixOperator.NOT;
        CnosDBPrefixOperation cnosDBPrefixOperation0 = new CnosDBPrefixOperation(cnosDBConstant_CnosDBNullConstant0,
                cnosDBPrefixOperation_PrefixOperator0);
        CnosDBConstant.CnosDBNullConstant cnosDBConstant_CnosDBNullConstant1 = (CnosDBConstant.CnosDBNullConstant) cnosDBPrefixOperation0
                .getExpression();
        assertFalse(cnosDBConstant_CnosDBNullConstant1.isBoolean());
    }

    @Test
    public void test09() throws Throwable {
        CnosDBPrefixOperation.PrefixOperator cnosDBPrefixOperation_PrefixOperator0 = CnosDBPrefixOperation.PrefixOperator.UNARY_MINUS;
        CnosDBSchema.CnosDBDataType cnosDBSchema_CnosDBDataType0 = cnosDBPrefixOperation_PrefixOperator0
                .getExpressionType();
        assertEquals(CnosDBSchema.CnosDBDataType.INT, cnosDBSchema_CnosDBDataType0);
    }

    @Test
    public void test10() throws Throwable {
        CnosDBPrefixOperation.PrefixOperator cnosDBPrefixOperation_PrefixOperator0 = CnosDBPrefixOperation.PrefixOperator.UNARY_PLUS;
        CnosDBSchema.CnosDBDataType cnosDBSchema_CnosDBDataType0 = cnosDBPrefixOperation_PrefixOperator0
                .getExpressionType();
        assertEquals(CnosDBSchema.CnosDBDataType.INT, cnosDBSchema_CnosDBDataType0);
    }
}
