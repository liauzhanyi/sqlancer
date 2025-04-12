/*
 * This file was automatically generated by EvoSuite
 * Fri Apr 11 16:24:56 GMT 2025
 */

package sqlancer.evosuite.cnosdb.ast;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import sqlancer.cnosdb.ast.CnosDBConstant;
import sqlancer.cnosdb.ast.CnosDBExpression;
import sqlancer.cnosdb.ast.CnosDBOrderByTerm;

public class CnosDBOrderByTerm_ESTest {

    @Test
    public void test0() throws Throwable {
        CnosDBOrderByTerm.CnosDBOrder cnosDBOrderByTerm_CnosDBOrder0 = CnosDBOrderByTerm.CnosDBOrder.getRandomOrder();
        CnosDBOrderByTerm cnosDBOrderByTerm0 = new CnosDBOrderByTerm((CnosDBExpression) null,
                cnosDBOrderByTerm_CnosDBOrder0);
        CnosDBOrderByTerm.CnosDBOrder cnosDBOrderByTerm_CnosDBOrder1 = cnosDBOrderByTerm0.getOrder();
        assertEquals(CnosDBOrderByTerm.CnosDBOrder.ASC, cnosDBOrderByTerm_CnosDBOrder1);
    }

    @Test
    public void test1() throws Throwable {
        CnosDBConstant.CnosDBNullConstant cnosDBConstant_CnosDBNullConstant0 = new CnosDBConstant.CnosDBNullConstant();
        CnosDBOrderByTerm.CnosDBOrder cnosDBOrderByTerm_CnosDBOrder0 = CnosDBOrderByTerm.CnosDBOrder.DESC;
        CnosDBOrderByTerm cnosDBOrderByTerm0 = new CnosDBOrderByTerm(cnosDBConstant_CnosDBNullConstant0,
                cnosDBOrderByTerm_CnosDBOrder0);
        CnosDBExpression cnosDBExpression0 = cnosDBOrderByTerm0.getExpr();
        assertNull(cnosDBExpression0.getExpressionType());
    }

    @Test
    public void test2() throws Throwable {
        CnosDBOrderByTerm.CnosDBOrder cnosDBOrderByTerm_CnosDBOrder0 = CnosDBOrderByTerm.CnosDBOrder.ASC;
        CnosDBOrderByTerm cnosDBOrderByTerm0 = new CnosDBOrderByTerm((CnosDBExpression) null,
                cnosDBOrderByTerm_CnosDBOrder0);
        cnosDBOrderByTerm0.getExpressionType();
    }

    @Test
    public void test3() throws Throwable {
        CnosDBOrderByTerm.CnosDBOrder cnosDBOrderByTerm_CnosDBOrder0 = CnosDBOrderByTerm.CnosDBOrder.getRandomOrder();
        CnosDBOrderByTerm cnosDBOrderByTerm0 = new CnosDBOrderByTerm((CnosDBExpression) null,
                cnosDBOrderByTerm_CnosDBOrder0);
        CnosDBExpression cnosDBExpression0 = cnosDBOrderByTerm0.getExpr();
        assertNull(cnosDBExpression0);
    }

    @Test
    public void test4() throws Throwable {
        CnosDBOrderByTerm cnosDBOrderByTerm0 = new CnosDBOrderByTerm((CnosDBExpression) null,
                (CnosDBOrderByTerm.CnosDBOrder) null);
        cnosDBOrderByTerm0.getOrder();
    }
}
