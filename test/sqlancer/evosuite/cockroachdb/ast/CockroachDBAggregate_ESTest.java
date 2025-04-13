/*
 * This file was automatically generated by EvoSuite
 * Sat Apr 12 01:31:53 GMT 2025
 */

package sqlancer.evosuite.cockroachdb.ast;

import static org.junit.jupiter.api.Assertions.*;

import java.util.LinkedList;
import java.util.List;

import org.junit.jupiter.api.Test;
import sqlancer.cockroachdb.ast.CockroachDBAggregate;
import sqlancer.cockroachdb.ast.CockroachDBExpression;
import sqlancer.cockroachdb.CockroachDBProvider;
import sqlancer.cockroachdb.CockroachDBSchema;
import sqlancer.cockroachdb.gen.CockroachDBExpressionGenerator;

public class CockroachDBAggregate_ESTest {

    private void verifyException(String s, Exception e) {
    }

    @Test
    public void test0() throws Throwable {
        CockroachDBAggregate.CockroachDBAggregateFunction cockroachDBAggregate_CockroachDBAggregateFunction0 = CockroachDBAggregate.CockroachDBAggregateFunction.COUNT_ROWS;
        CockroachDBSchema.CockroachDBDataType cockroachDBSchema_CockroachDBDataType0 = CockroachDBSchema.CockroachDBDataType.ARRAY;
        boolean boolean0 = cockroachDBAggregate_CockroachDBAggregateFunction0
                .supportsReturnType(cockroachDBSchema_CockroachDBDataType0);
        assertFalse(boolean0);
    }

    @Test
    public void test1() throws Throwable {
        CockroachDBAggregate.CockroachDBAggregateFunction cockroachDBAggregate_CockroachDBAggregateFunction0 = CockroachDBAggregate.CockroachDBAggregateFunction.SUM_INT;
        CockroachDBAggregate cockroachDBAggregate0 = new CockroachDBAggregate(
                cockroachDBAggregate_CockroachDBAggregateFunction0, (List<CockroachDBExpression>) null);
        List<CockroachDBExpression> list0 = cockroachDBAggregate0.getExpr();
        assertNull(list0);
    }

    /*
     * Test disabled because it contains mock() function calls that are not implemented
     *
     * @Test public void test2() throws Throwable { CockroachDBAggregate.CockroachDBAggregateFunction
     * cockroachDBAggregate_CockroachDBAggregateFunction0 = CockroachDBAggregate.CockroachDBAggregateFunction.SUM_INT;
     * cockroachDBProvider_CockroachDBGlobalState0 = new CockroachDBProvider.CockroachDBGlobalState();
     * CockroachDBExpressionGenerator cockroachDBExpressionGenerator0 = new CockroachDBExpressionGenerator(
     * cockroachDBProvider_CockroachDBGlobalState0); CockroachDBSchema.CockroachDBTable[]
     * cockroachDBSchema_CockroachDBTableArray0 = new CockroachDBSchema.CockroachDBTable[5];
     * CockroachDBSchema.CockroachDBTable cockroachDBSchema_CockroachDBTable0 = mock(
     * CockroachDBSchema.CockroachDBTable.class, new ViolatedAssumptionAnswer()); doReturn((List)
     * null).when(cockroachDBSchema_CockroachDBTable0).getColumns(); CockroachDBTableReference
     * cockroachDBTableReference0 = new CockroachDBTableReference( cockroachDBSchema_CockroachDBTable0); TableIndex
     * tableIndex0 = TableIndex.create(""); CockroachDBIndexReference cockroachDBIndexReference0 = new
     * CockroachDBIndexReference(cockroachDBTableReference0, tableIndex0); CockroachDBSchema.CockroachDBTable
     * cockroachDBSchema_CockroachDBTable1 = cockroachDBIndexReference0.getTable();
     * cockroachDBSchema_CockroachDBTableArray0[0] = cockroachDBSchema_CockroachDBTable1;
     * cockroachDBSchema_CockroachDBTableArray0[1] = cockroachDBSchema_CockroachDBTableArray0[0];
     * cockroachDBSchema_CockroachDBTableArray0[2] = cockroachDBSchema_CockroachDBTable1;
     * cockroachDBSchema_CockroachDBTableArray0[3] = cockroachDBSchema_CockroachDBTable1;
     * cockroachDBSchema_CockroachDBTableArray0[4] = cockroachDBSchema_CockroachDBTable1;
     * List<CockroachDBSchema.CockroachDBTable> list0 = List.of(cockroachDBSchema_CockroachDBTableArray0);
     * AbstractTables<CockroachDBSchema.CockroachDBTable, CockroachDBSchema.CockroachDBColumn> abstractTables0 = null;
     * try { abstractTables0 = new AbstractTables<CockroachDBSchema.CockroachDBTable,
     * CockroachDBSchema.CockroachDBColumn>( list0); fail("Expecting exception: NullPointerException");
     *
     * } catch (NullPointerException e) { // // no message in exception (getMessage() returned null) //
     * verifyException("java.util.ArrayList", e); } }
     */

    @Test
    public void test3() throws Throwable {
        CockroachDBExpressionGenerator cockroachDBExpressionGenerator0 = new CockroachDBExpressionGenerator(
                (CockroachDBProvider.CockroachDBGlobalState) null);
        CockroachDBSchema.CockroachDBCompositeDataType cockroachDBSchema_CockroachDBCompositeDataType0 = CockroachDBSchema.CockroachDBCompositeDataType
                .getBit(0);
        CockroachDBAggregate.CockroachDBAggregateFunction cockroachDBAggregate_CockroachDBAggregateFunction0 = CockroachDBAggregate.CockroachDBAggregateFunction.COUNT;
        // Undeclared exception!
        try {
            cockroachDBExpressionGenerator0.generateArgsForAggregate(cockroachDBSchema_CockroachDBCompositeDataType0,
                    cockroachDBAggregate_CockroachDBAggregateFunction0);
            fail("Expecting exception: NullPointerException");

        } catch (NullPointerException e) {
            //
            // no message in exception (getMessage() returned null)
            //
            verifyException("sqlancer.cockroachdb.gen.CockroachDBExpressionGenerator", e);
        }
    }

    @Test
    public void test4() throws Throwable {
        CockroachDBAggregate.CockroachDBAggregateFunction cockroachDBAggregate_CockroachDBAggregateFunction0 = CockroachDBAggregate.CockroachDBAggregateFunction.STRING_AGG;
        CockroachDBSchema.CockroachDBDataType cockroachDBSchema_CockroachDBDataType0 = CockroachDBSchema.CockroachDBDataType.INT;
        List<CockroachDBSchema.CockroachDBDataType> list0 = cockroachDBAggregate_CockroachDBAggregateFunction0
                .getTypes(cockroachDBSchema_CockroachDBDataType0);
        assertEquals(2, list0.size());
    }

    @Test
    public void test5() throws Throwable {
        CockroachDBProvider.CockroachDBGlobalState cockroachDBProvider_CockroachDBGlobalState0 = new CockroachDBProvider.CockroachDBGlobalState();
        CockroachDBExpressionGenerator cockroachDBExpressionGenerator0 = new CockroachDBExpressionGenerator(
                cockroachDBProvider_CockroachDBGlobalState0);
        CockroachDBSchema.CockroachDBCompositeDataType cockroachDBSchema_CockroachDBCompositeDataType0 = CockroachDBSchema.CockroachDBCompositeDataType
                .getBit((-1769));
        CockroachDBAggregate.CockroachDBAggregateFunction cockroachDBAggregate_CockroachDBAggregateFunction0 = CockroachDBAggregate.CockroachDBAggregateFunction.COUNT_ROWS;
        CockroachDBAggregate cockroachDBAggregate0 = cockroachDBExpressionGenerator0.generateArgsForAggregate(
                cockroachDBSchema_CockroachDBCompositeDataType0, cockroachDBAggregate_CockroachDBAggregateFunction0);
        List<CockroachDBExpression> list0 = cockroachDBAggregate0.getExpr();
        assertEquals(0, list0.size());
    }

    // @Test
    // public void test6() throws Throwable {
    // CockroachDBAggregate.CockroachDBAggregateFunction cockroachDBAggregate_CockroachDBAggregateFunction0 =
    // CockroachDBAggregate.CockroachDBAggregateFunction.MIN;
    // CockroachDBSchema.CockroachDBDataType cockroachDBSchema_CockroachDBDataType0 =
    // cockroachDBAggregate_CockroachDBAggregateFunction0
    // .getRandomReturnType();
    // List<CockroachDBAggregate.CockroachDBAggregateFunction> list0 = CockroachDBAggregate.CockroachDBAggregateFunction
    // .getAggregates(cockroachDBSchema_CockroachDBDataType0);
    // assertEquals(13, list0.size());
    // }

    @Test
    public void test7() throws Throwable {
        CockroachDBAggregate.CockroachDBAggregateFunction cockroachDBAggregate_CockroachDBAggregateFunction0 = CockroachDBAggregate.CockroachDBAggregateFunction.BOOL_AND;
        LinkedList<CockroachDBExpression> linkedList0 = new LinkedList<CockroachDBExpression>();
        CockroachDBAggregate cockroachDBAggregate0 = new CockroachDBAggregate(
                cockroachDBAggregate_CockroachDBAggregateFunction0, linkedList0);
        CockroachDBAggregate.CockroachDBAggregateFunction cockroachDBAggregate_CockroachDBAggregateFunction1 = cockroachDBAggregate0
                .getFunc();
        CockroachDBSchema.CockroachDBDataType cockroachDBSchema_CockroachDBDataType0 = cockroachDBAggregate_CockroachDBAggregateFunction0
                .getRandomReturnType();
        List<CockroachDBSchema.CockroachDBDataType> list0 = cockroachDBAggregate_CockroachDBAggregateFunction1
                .getTypes(cockroachDBSchema_CockroachDBDataType0);
        assertEquals(1, list0.size());
    }

    // @Test
    // public void test8() throws Throwable {
    // CockroachDBAggregate.CockroachDBAggregateFunction cockroachDBAggregate_CockroachDBAggregateFunction0 =
    // CockroachDBAggregate.CockroachDBAggregateFunction
    // .getRandomMetamorphicOracle();
    // assertEquals(CockroachDBAggregate.CockroachDBAggregateFunction.SUM,
    // cockroachDBAggregate_CockroachDBAggregateFunction0);
    // }
}
