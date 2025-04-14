/*
 * This file was automatically generated by EvoSuite
 * Fri Apr 11 23:10:57 GMT 2025
 */

package sqlancer.evosuite.cockroachdb.oracle.tlp;

import static org.junit.jupiter.api.Assertions.*;

import java.util.LinkedList;
import java.util.List;

import org.junit.jupiter.api.Test;

import sqlancer.cockroachdb.ast.CockroachDBConstant;
import sqlancer.cockroachdb.ast.CockroachDBExpression;
import sqlancer.cockroachdb.CockroachDBProvider;
import sqlancer.cockroachdb.CockroachDBSchema;
import sqlancer.cockroachdb.gen.CockroachDBExpressionGenerator;
import sqlancer.cockroachdb.oracle.tlp.CockroachDBTLPBase;
import sqlancer.common.gen.ExpressionGenerator;

public class CockroachDBTLPBase_ESTest {

    private void verifyException(String s, Exception e) {
    }

    @Test
    public void test0() throws Throwable {
        CockroachDBProvider.CockroachDBGlobalState cockroachDBProvider_CockroachDBGlobalState0 = new CockroachDBProvider.CockroachDBGlobalState();
        CockroachDBTLPBase cockroachDBTLPBase0 = new CockroachDBTLPBase(cockroachDBProvider_CockroachDBGlobalState0);
        CockroachDBExpressionGenerator cockroachDBExpressionGenerator0 = new CockroachDBExpressionGenerator(
                cockroachDBProvider_CockroachDBGlobalState0);
        cockroachDBTLPBase0.gen = cockroachDBExpressionGenerator0;
        ExpressionGenerator<CockroachDBExpression> expressionGenerator0 = cockroachDBTLPBase0.getGen();
        assertNotNull(expressionGenerator0);
    }

    @Test
    public void test1() throws Throwable {
        CockroachDBProvider.CockroachDBGlobalState cockroachDBProvider_CockroachDBGlobalState0 = new CockroachDBProvider.CockroachDBGlobalState();
        // Undeclared exception!
        try {
            CockroachDBTLPBase.getJoins((List<CockroachDBExpression>) null,
                    cockroachDBProvider_CockroachDBGlobalState0);
            fail("Expecting exception: NullPointerException");

        } catch (NullPointerException e) {
            //
            // no message in exception (getMessage() returned null)
            //
            verifyException("sqlancer.cockroachdb.oracle.tlp.CockroachDBTLPBase", e);
        }
    }

    @Test
    public void test2() throws Throwable {
        CockroachDBTLPBase cockroachDBTLPBase0 = new CockroachDBTLPBase(
                (CockroachDBProvider.CockroachDBGlobalState) null);
        // Undeclared exception!
        try {
            cockroachDBTLPBase0.check();
            fail("Expecting exception: NullPointerException");

        } catch (NullPointerException e) {
            //
            // no message in exception (getMessage() returned null)
            //
            verifyException("sqlancer.cockroachdb.oracle.tlp.CockroachDBTLPBase", e);
        }
    }

    // @Test
    // public void test3() throws Throwable {
    // CockroachDBProvider.CockroachDBGlobalState cockroachDBProvider_CockroachDBGlobalState0 = new
    // CockroachDBProvider.CockroachDBGlobalState();
    // CockroachDBConstant.CockroachDBTextConstant cockroachDBConstant_CockroachDBTextConstant0 = new
    // CockroachDBConstant.CockroachDBTextConstant(
    // "A@:2TM_e:NjKRL3");
    // List<CockroachDBExpression> list0 = List.of(
    // (CockroachDBExpression) cockroachDBConstant_CockroachDBTextConstant0,
    // (CockroachDBExpression) cockroachDBConstant_CockroachDBTextConstant0,
    // (CockroachDBExpression) cockroachDBConstant_CockroachDBTextConstant0);
    // List<CockroachDBExpression> list1 = CockroachDBTLPBase.getJoins(list0,
    // cockroachDBProvider_CockroachDBGlobalState0);
    // assertEquals(0, list1.size());
    // }

    @Test
    public void test4() throws Throwable {
        LinkedList<CockroachDBConstant.CockroachDBTextConstant> linkedList0 = new LinkedList<CockroachDBConstant.CockroachDBTextConstant>();
        LinkedList<CockroachDBExpression> linkedList1 = new LinkedList<CockroachDBExpression>(linkedList0);
        CockroachDBProvider.CockroachDBGlobalState cockroachDBProvider_CockroachDBGlobalState0 = new CockroachDBProvider.CockroachDBGlobalState();
        List<CockroachDBExpression> list0 = CockroachDBTLPBase.getJoins(linkedList1,
                cockroachDBProvider_CockroachDBGlobalState0);
        assertTrue(list0.isEmpty());
    }

    @Test
    public void test5() throws Throwable {
        CockroachDBProvider.CockroachDBGlobalState cockroachDBProvider_CockroachDBGlobalState0 = new CockroachDBProvider.CockroachDBGlobalState();
        CockroachDBTLPBase cockroachDBTLPBase0 = new CockroachDBTLPBase(cockroachDBProvider_CockroachDBGlobalState0);
        LinkedList<CockroachDBSchema.CockroachDBTable> linkedList0 = new LinkedList<CockroachDBSchema.CockroachDBTable>();
        CockroachDBSchema.CockroachDBTables cockroachDBSchema_CockroachDBTables0 = new CockroachDBSchema.CockroachDBTables(
                linkedList0);
        cockroachDBTLPBase0.targetTables = cockroachDBSchema_CockroachDBTables0;
        List<CockroachDBExpression> list0 = cockroachDBTLPBase0.generateFetchColumns();
        assertEquals(1, list0.size());
    }

    // @Test
    // public void test6() throws Throwable {
    // CockroachDBProvider.CockroachDBGlobalState cockroachDBProvider_CockroachDBGlobalState0 = new
    // CockroachDBProvider.CockroachDBGlobalState();
    // CockroachDBTLPBase cockroachDBTLPBase0 = new CockroachDBTLPBase(cockroachDBProvider_CockroachDBGlobalState0);
    // // Undeclared exception!
    // try {
    // cockroachDBTLPBase0.generateFetchColumns();
    // fail("Expecting exception: NullPointerException");
    //
    // } catch (NullPointerException e) {
    // //
    // // no message in exception (getMessage() returned null)
    // //
    // verifyException("sqlancer.cockroachdb.oracle.tlp.CockroachDBTLPBase", e);
    // }
    // }

    @Test
    public void test7() throws Throwable {
        CockroachDBProvider.CockroachDBGlobalState cockroachDBProvider_CockroachDBGlobalState0 = new CockroachDBProvider.CockroachDBGlobalState();
        CockroachDBTLPBase cockroachDBTLPBase0 = new CockroachDBTLPBase(cockroachDBProvider_CockroachDBGlobalState0);
        // Undeclared exception!
        try {
            cockroachDBTLPBase0.check();
            fail("Expecting exception: AssertionError");

        } catch (AssertionError e) {
            //
            // null
            //
        }
    }

    @Test
    public void test8() throws Throwable {
        CockroachDBProvider.CockroachDBGlobalState cockroachDBProvider_CockroachDBGlobalState0 = new CockroachDBProvider.CockroachDBGlobalState();
        CockroachDBTLPBase cockroachDBTLPBase0 = new CockroachDBTLPBase(cockroachDBProvider_CockroachDBGlobalState0);
        ExpressionGenerator<CockroachDBExpression> expressionGenerator0 = cockroachDBTLPBase0.getGen();
        assertNull(expressionGenerator0);
    }
}
