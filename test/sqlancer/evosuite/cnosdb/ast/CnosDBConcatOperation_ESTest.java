/*
 * This file was automatically generated by EvoSuite
 * Sat Apr 12 03:36:16 GMT 2025
 */

package sqlancer.evosuite.cnosdb.ast;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import sqlancer.cnosdb.ast.CnosDBConcatOperation;
import sqlancer.cnosdb.ast.CnosDBConstant;
import sqlancer.cnosdb.ast.CnosDBExpression;
import sqlancer.cnosdb.CnosDBSchema;

public class CnosDBConcatOperation_ESTest {

    @Test
    public void test0() throws Throwable {
        CnosDBConstant cnosDBConstant0 = CnosDBConstant.createBooleanConstant(false);
        CnosDBConcatOperation cnosDBConcatOperation0 = new CnosDBConcatOperation(cnosDBConstant0, cnosDBConstant0);
        String string0 = cnosDBConcatOperation0.getOperatorRepresentation();
        assertEquals("||", string0);
    }

    @Test
    public void test1() throws Throwable {
        CnosDBConcatOperation cnosDBConcatOperation0 = new CnosDBConcatOperation((CnosDBExpression) null,
                (CnosDBExpression) null);
        CnosDBSchema.CnosDBDataType cnosDBSchema_CnosDBDataType0 = cnosDBConcatOperation0.getExpressionType();
        assertEquals(CnosDBSchema.CnosDBDataType.STRING, cnosDBSchema_CnosDBDataType0);
    }
}
