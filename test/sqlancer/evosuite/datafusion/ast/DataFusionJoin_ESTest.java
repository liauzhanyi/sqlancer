/*
 * This file was automatically generated by EvoSuite
 * Fri Apr 11 20:05:18 GMT 2025
 */

package sqlancer.evosuite.datafusion.ast;

import static org.junit.jupiter.api.Assertions.*;

import java.util.LinkedList;
import java.util.List;
import org.junit.jupiter.api.Test;
import sqlancer.datafusion.ast.DataFusionExpression;
import sqlancer.datafusion.ast.DataFusionJoin;
import sqlancer.datafusion.ast.DataFusionTableReference;
import sqlancer.datafusion.DataFusionProvider;
import sqlancer.datafusion.DataFusionSchema;

public class DataFusionJoin_ESTest {

    @Test
    public void test00() throws Throwable {
        LinkedList<DataFusionSchema.DataFusionColumn> linkedList0 = new LinkedList<DataFusionSchema.DataFusionColumn>();
        DataFusionSchema.DataFusionTable dataFusionSchema_DataFusionTable0 = new DataFusionSchema.DataFusionTable("",
                linkedList0, false);
        DataFusionTableReference dataFusionTableReference0 = new DataFusionTableReference(
                dataFusionSchema_DataFusionTable0);
        DataFusionTableReference dataFusionTableReference1 = new DataFusionTableReference(
                dataFusionSchema_DataFusionTable0);
        DataFusionJoin dataFusionJoin0 = DataFusionJoin.createInnerJoin(dataFusionTableReference0,
                dataFusionTableReference1, dataFusionTableReference1);
        assertEquals(DataFusionJoin.JoinType.INNER, dataFusionJoin0.getJoinType());
    }

    // @Test
    // public void test01() throws Throwable {
    // LinkedList<DataFusionSchema.DataFusionColumn> linkedList0 = new LinkedList<DataFusionSchema.DataFusionColumn>();
    // DataFusionSchema.DataFusionTable dataFusionSchema_DataFusionTable0 = new DataFusionSchema.DataFusionTable("",
    // linkedList0, false);
    // DataFusionTableReference dataFusionTableReference0 = new DataFusionTableReference(
    // dataFusionSchema_DataFusionTable0);
    // DataFusionTableReference dataFusionTableReference1 = new DataFusionTableReference(
    // dataFusionSchema_DataFusionTable0);
    // LinkedList<DataFusionTableReference> linkedList1 = new LinkedList<DataFusionTableReference>();
    // DataFusionProvider.DataFusionGlobalState dataFusionProvider_DataFusionGlobalState0 = new
    // DataFusionProvider.DataFusionGlobalState();
    // linkedList1.add(dataFusionTableReference1);
    // linkedList1.add(dataFusionTableReference0);
    // DataFusionJoin.JoinType.getRandom();
    // // Undeclared exception!
    // try {
    // DataFusionJoin.getJoins(linkedList1, dataFusionProvider_DataFusionGlobalState0);
    // fail("Expecting exception: NullPointerException");
    //
    // } catch (NullPointerException e) {
    // //
    // // no message in exception (getMessage() returned null)
    // //
    // verifyException("sqlancer.datafusion.gen.DataFusionExpressionGenerator", e);
    // }
    // }

    @Test
    public void test02() throws Throwable {
        DataFusionJoin dataFusionJoin0 = DataFusionJoin.createInnerJoin((DataFusionTableReference) null,
                (DataFusionTableReference) null, (DataFusionExpression) null);
        DataFusionTableReference dataFusionTableReference0 = dataFusionJoin0.getRightTable();
        assertNull(dataFusionTableReference0);
    }

    @Test
    public void test03() throws Throwable {
        DataFusionJoin dataFusionJoin0 = DataFusionJoin.createInnerJoin((DataFusionTableReference) null,
                (DataFusionTableReference) null, (DataFusionExpression) null);
        DataFusionExpression dataFusionExpression0 = dataFusionJoin0.getOnCondition();
        assertNull(dataFusionExpression0);
    }

    @Test
    public void test04() throws Throwable {
        DataFusionSchema.DataFusionDataType dataFusionSchema_DataFusionDataType0 = DataFusionSchema.DataFusionDataType.DOUBLE;
        DataFusionSchema.DataFusionColumn dataFusionSchema_DataFusionColumn0 = new DataFusionSchema.DataFusionColumn(
                "e7hCNg#", dataFusionSchema_DataFusionDataType0, false);
        List<DataFusionSchema.DataFusionColumn> list0 = List.of(dataFusionSchema_DataFusionColumn0,
                dataFusionSchema_DataFusionColumn0, dataFusionSchema_DataFusionColumn0,
                dataFusionSchema_DataFusionColumn0, dataFusionSchema_DataFusionColumn0);
        DataFusionSchema.DataFusionTable dataFusionSchema_DataFusionTable0 = new DataFusionSchema.DataFusionTable(
                "e7hCNg#", list0, false);
        DataFusionTableReference dataFusionTableReference0 = new DataFusionTableReference(
                dataFusionSchema_DataFusionTable0);
        DataFusionJoin.JoinType dataFusionJoin_JoinType0 = DataFusionJoin.JoinType.INNER;
        DataFusionJoin dataFusionJoin0 = new DataFusionJoin((DataFusionTableReference) null, dataFusionTableReference0,
                dataFusionJoin_JoinType0, dataFusionTableReference0);
        DataFusionTableReference dataFusionTableReference1 = dataFusionJoin0.getLeftTable();
        assertNull(dataFusionTableReference1);
    }

    @Test
    public void test05() throws Throwable {
        DataFusionJoin dataFusionJoin0 = new DataFusionJoin((DataFusionTableReference) null,
                (DataFusionTableReference) null, (DataFusionJoin.JoinType) null, (DataFusionExpression) null);
        dataFusionJoin0.getJoinType();
    }

    // @Test
    // public void test06() throws Throwable {
    // DataFusionTableReference dataFusionTableReference0 = new DataFusionTableReference(
    // (DataFusionSchema.DataFusionTable) null);
    // DataFusionJoin.JoinType.getRandom();
    // List<DataFusionTableReference> list0 = List.of(dataFusionTableReference0, dataFusionTableReference0,
    // dataFusionTableReference0, dataFusionTableReference0, dataFusionTableReference0,
    // dataFusionTableReference0, dataFusionTableReference0);
    // DataFusionProvider.DataFusionGlobalState dataFusionProvider_DataFusionGlobalState0 = new
    // DataFusionProvider.DataFusionGlobalState();
    // // Undeclared exception!
    // try {
    // DataFusionJoin.getJoins(list0, dataFusionProvider_DataFusionGlobalState0);
    // fail("Expecting exception: UnsupportedOperationException");
    //
    // } catch (UnsupportedOperationException e) {
    // //
    // // no message in exception (getMessage() returned null)
    // //
    // verifyException("java.util.ImmutableCollections", e);
    // }
    // }

    @Test
    public void test07() throws Throwable {
        LinkedList<DataFusionSchema.DataFusionColumn> linkedList0 = new LinkedList<DataFusionSchema.DataFusionColumn>();
        DataFusionSchema.DataFusionTable dataFusionSchema_DataFusionTable0 = new DataFusionSchema.DataFusionTable("",
                linkedList0, false);
        DataFusionTableReference dataFusionTableReference0 = new DataFusionTableReference(
                dataFusionSchema_DataFusionTable0);
        LinkedList<DataFusionTableReference> linkedList1 = new LinkedList<DataFusionTableReference>();
        DataFusionProvider.DataFusionGlobalState dataFusionProvider_DataFusionGlobalState0 = new DataFusionProvider.DataFusionGlobalState();
        linkedList1.add(dataFusionTableReference0);
        linkedList1.add(dataFusionTableReference0);
        List<DataFusionJoin> list0 = DataFusionJoin.getJoins(linkedList1, dataFusionProvider_DataFusionGlobalState0);
        assertEquals(0, list0.size());
    }

    @Test
    public void test08() throws Throwable {
        LinkedList<DataFusionTableReference> linkedList0 = new LinkedList<DataFusionTableReference>();
        DataFusionProvider.DataFusionGlobalState dataFusionProvider_DataFusionGlobalState0 = new DataFusionProvider.DataFusionGlobalState();
        List<DataFusionJoin> list0 = DataFusionJoin.getJoins(linkedList0, dataFusionProvider_DataFusionGlobalState0);
        assertTrue(list0.isEmpty());
    }

    @Test
    public void test09() throws Throwable {
        LinkedList<DataFusionSchema.DataFusionColumn> linkedList0 = new LinkedList<DataFusionSchema.DataFusionColumn>();
        DataFusionSchema.DataFusionTable dataFusionSchema_DataFusionTable0 = new DataFusionSchema.DataFusionTable("",
                linkedList0, false);
        DataFusionTableReference dataFusionTableReference0 = new DataFusionTableReference(
                dataFusionSchema_DataFusionTable0);
        DataFusionJoin dataFusionJoin0 = DataFusionJoin.createInnerJoin(dataFusionTableReference0,
                dataFusionTableReference0, dataFusionTableReference0);
        dataFusionJoin0.setOnClause((DataFusionExpression) dataFusionJoin0);
        assertEquals(DataFusionJoin.JoinType.INNER, dataFusionJoin0.getJoinType());
    }

    @Test
    public void test10() throws Throwable {
        DataFusionJoin.JoinType dataFusionJoin_JoinType0 = DataFusionJoin.JoinType.INNER;
        DataFusionJoin dataFusionJoin0 = new DataFusionJoin((DataFusionTableReference) null,
                (DataFusionTableReference) null, dataFusionJoin_JoinType0, (DataFusionExpression) null);
        DataFusionJoin.JoinType dataFusionJoin_JoinType1 = dataFusionJoin0.getJoinType();
        assertEquals(DataFusionJoin.JoinType.INNER, dataFusionJoin_JoinType1);
    }

    @Test
    public void test11() throws Throwable {
        LinkedList<DataFusionSchema.DataFusionColumn> linkedList0 = new LinkedList<DataFusionSchema.DataFusionColumn>();
        DataFusionSchema.DataFusionTable dataFusionSchema_DataFusionTable0 = new DataFusionSchema.DataFusionTable(
                "TEXT", linkedList0, false);
        DataFusionTableReference dataFusionTableReference0 = new DataFusionTableReference(
                dataFusionSchema_DataFusionTable0);
        DataFusionJoin dataFusionJoin0 = DataFusionJoin.createInnerJoin(dataFusionTableReference0,
                dataFusionTableReference0, dataFusionTableReference0);
        DataFusionTableReference dataFusionTableReference1 = dataFusionJoin0.getRightTable();
        assertSame(dataFusionTableReference1, dataFusionTableReference0);
    }

    @Test
    public void test12() throws Throwable {
        LinkedList<DataFusionSchema.DataFusionColumn> linkedList0 = new LinkedList<DataFusionSchema.DataFusionColumn>();
        DataFusionSchema.DataFusionTable dataFusionSchema_DataFusionTable0 = new DataFusionSchema.DataFusionTable("",
                linkedList0, false);
        DataFusionTableReference dataFusionTableReference0 = new DataFusionTableReference(
                dataFusionSchema_DataFusionTable0);
        DataFusionJoin dataFusionJoin0 = DataFusionJoin.createInnerJoin(dataFusionTableReference0,
                dataFusionTableReference0, dataFusionTableReference0);
        DataFusionTableReference dataFusionTableReference1 = dataFusionJoin0.getLeftTable();
        assertSame(dataFusionTableReference0, dataFusionTableReference1);
    }

    @Test
    public void test13() throws Throwable {
        LinkedList<DataFusionSchema.DataFusionColumn> linkedList0 = new LinkedList<DataFusionSchema.DataFusionColumn>();
        DataFusionSchema.DataFusionTable dataFusionSchema_DataFusionTable0 = new DataFusionSchema.DataFusionTable("",
                linkedList0, false);
        DataFusionTableReference dataFusionTableReference0 = new DataFusionTableReference(
                dataFusionSchema_DataFusionTable0);
        DataFusionJoin dataFusionJoin0 = DataFusionJoin.createInnerJoin(dataFusionTableReference0,
                dataFusionTableReference0, dataFusionTableReference0);
        DataFusionExpression dataFusionExpression0 = dataFusionJoin0.getOnCondition();
        assertSame(dataFusionTableReference0, dataFusionExpression0);
    }
}
