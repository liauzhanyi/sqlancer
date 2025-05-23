/*
 * This file was automatically generated by EvoSuite
 * Fri Apr 11 14:29:27 GMT 2025
 */

package sqlancer.evosuite.databend.ast;

import static org.junit.jupiter.api.Assertions.*;

import java.util.LinkedList;
import java.util.List;
import org.junit.jupiter.api.Test;
import sqlancer.common.ast.newast.TableReferenceNode;
import sqlancer.common.schema.AbstractTables;
import sqlancer.databend.ast.DatabendExpression;
import sqlancer.databend.ast.DatabendJoin;
import sqlancer.databend.ast.DatabendTableReference;
import sqlancer.databend.DatabendProvider;
import sqlancer.databend.DatabendSchema;

public class DatabendJoin_ESTest {

    @Test
    public void test00() throws Throwable {
        LinkedList<DatabendSchema.DatabendTable> linkedList0 = new LinkedList<DatabendSchema.DatabendTable>();
        AbstractTables<DatabendSchema.DatabendTable, DatabendSchema.DatabendColumn> abstractTables0 = new AbstractTables<DatabendSchema.DatabendTable, DatabendSchema.DatabendColumn>(
                linkedList0);
        List<DatabendSchema.DatabendColumn> list0 = abstractTables0.getColumns();
        DatabendSchema.DatabendTable databendSchema_DatabendTable0 = new DatabendSchema.DatabendTable("", list0, false);
        DatabendTableReference databendTableReference0 = new DatabendTableReference(databendSchema_DatabendTable0);
        DatabendJoin.OuterType databendJoin_OuterType0 = DatabendJoin.OuterType.LEFT;
        DatabendJoin databendJoin0 = DatabendJoin.createNaturalJoin(databendTableReference0,
                (DatabendTableReference) null, databendJoin_OuterType0);
        assertEquals(DatabendJoin.OuterType.LEFT, databendJoin0.getOuterType());
    }

    @Test
    public void test01() throws Throwable {
        DatabendTableReference databendTableReference0 = new DatabendTableReference(
                (DatabendSchema.DatabendTable) null);
        LinkedList<DatabendSchema.DatabendTable> linkedList0 = new LinkedList<DatabendSchema.DatabendTable>();
        AbstractTables<DatabendSchema.DatabendTable, DatabendSchema.DatabendColumn> abstractTables0 = new AbstractTables<DatabendSchema.DatabendTable, DatabendSchema.DatabendColumn>(
                linkedList0);
        List<DatabendSchema.DatabendColumn> list0 = abstractTables0.getColumns();
        DatabendSchema.DatabendTable databendSchema_DatabendTable0 = new DatabendSchema.DatabendTable((String) null,
                list0, true);
        DatabendTableReference databendTableReference1 = new DatabendTableReference(databendSchema_DatabendTable0);
        DatabendJoin databendJoin0 = DatabendJoin.createInnerJoin(databendTableReference0, databendTableReference1,
                databendTableReference1);
        assertNull(databendJoin0.getOuterType());
    }

    @Test
    public void test02() throws Throwable {
        DatabendTableReference databendTableReference0 = new DatabendTableReference(
                (DatabendSchema.DatabendTable) null);
        LinkedList<DatabendSchema.DatabendTable> linkedList0 = new LinkedList<DatabendSchema.DatabendTable>();
        AbstractTables<DatabendSchema.DatabendTable, DatabendSchema.DatabendColumn> abstractTables0 = new AbstractTables<DatabendSchema.DatabendTable, DatabendSchema.DatabendColumn>(
                linkedList0);
        List<DatabendSchema.DatabendColumn> list0 = abstractTables0.getColumns();
        DatabendSchema.DatabendTable databendSchema_DatabendTable0 = new DatabendSchema.DatabendTable((String) null,
                list0, true);
        DatabendTableReference databendTableReference1 = new DatabendTableReference(databendSchema_DatabendTable0);
        DatabendJoin databendJoin0 = DatabendJoin.createLeftOuterJoin(databendTableReference1, databendTableReference1,
                databendTableReference0);
        DatabendJoin databendJoin1 = DatabendJoin.createRightOuterJoin(databendTableReference0, databendTableReference1,
                databendJoin0);
        assertEquals(DatabendJoin.JoinType.RIGHT, databendJoin1.getJoinType());
    }

    // @Test
    // public void test03() throws Throwable {
    // DatabendTableReference databendTableReference0 = new DatabendTableReference(
    // (DatabendSchema.DatabendTable) null);
    // DatabendTableReference databendTableReference1 = new DatabendTableReference(
    // (DatabendSchema.DatabendTable) null);
    // List<DatabendTableReference> list0 = List.of(databendTableReference0, databendTableReference1,
    // databendTableReference1);
    // LinkedList<DatabendTableReference> linkedList0 = new LinkedList<DatabendTableReference>();
    // linkedList0.addAll(0, (Collection<? extends DatabendTableReference>) list0);
    // DatabendProvider.DatabendGlobalState databendProvider_DatabendGlobalState0 = new
    // DatabendProvider.DatabendGlobalState();
    // DatabendJoin.OuterType.getRandom();
    // // Undeclared exception!
    // try {
    // DatabendJoin.getJoins(linkedList0, databendProvider_DatabendGlobalState0);
    // fail("Expecting exception: NullPointerException");
    //
    // } catch (NullPointerException e) {
    // //
    // // no message in exception (getMessage() returned null)
    // //
    // verifyException("sqlancer.databend.ast.DatabendJoin", e);
    // }
    // }

    @Test
    public void test04() throws Throwable {
        LinkedList<DatabendSchema.DatabendTable> linkedList0 = new LinkedList<DatabendSchema.DatabendTable>();
        AbstractTables<DatabendSchema.DatabendTable, DatabendSchema.DatabendColumn> abstractTables0 = new AbstractTables<DatabendSchema.DatabendTable, DatabendSchema.DatabendColumn>(
                linkedList0);
        List<DatabendSchema.DatabendColumn> list0 = abstractTables0.getColumns();
        DatabendSchema.DatabendTable databendSchema_DatabendTable0 = new DatabendSchema.DatabendTable("t~#", list0,
                false);
        DatabendTableReference databendTableReference0 = new DatabendTableReference(databendSchema_DatabendTable0);
        DatabendTableReference databendTableReference1 = new DatabendTableReference(databendSchema_DatabendTable0);
        DatabendJoin databendJoin0 = DatabendJoin.createLeftOuterJoin(databendTableReference0, databendTableReference1,
                (DatabendExpression) null);
        assertNull(databendJoin0.getOuterType());
    }

    @Test
    public void test05() throws Throwable {
        DatabendJoin.JoinType databendJoin_JoinType0 = DatabendJoin.JoinType.INNER;
        DatabendJoin databendJoin0 = new DatabendJoin((DatabendTableReference) null, (DatabendTableReference) null,
                databendJoin_JoinType0, (DatabendExpression) null);
        TableReferenceNode<DatabendExpression, DatabendSchema.DatabendTable> tableReferenceNode0 = databendJoin0
                .getRightTable();
        assertNull(tableReferenceNode0);
    }

    @Test
    public void test06() throws Throwable {
        DatabendSchema.DatabendColumn databendSchema_DatabendColumn0 = new DatabendSchema.DatabendColumn("",
                (DatabendSchema.DatabendCompositeDataType) null, true, false);
        List<DatabendSchema.DatabendColumn> list0 = List.of(databendSchema_DatabendColumn0,
                databendSchema_DatabendColumn0, databendSchema_DatabendColumn0);
        DatabendSchema.DatabendTable databendSchema_DatabendTable0 = new DatabendSchema.DatabendTable("NOT", list0,
                true);
        DatabendTableReference databendTableReference0 = new DatabendTableReference(databendSchema_DatabendTable0);
        DatabendJoin.JoinType databendJoin_JoinType0 = DatabendJoin.JoinType.RIGHT;
        DatabendJoin databendJoin0 = new DatabendJoin(databendTableReference0, databendTableReference0,
                databendJoin_JoinType0, databendTableReference0);
        DatabendExpression databendExpression0 = databendJoin0.getOnCondition();
        assertSame(databendTableReference0, databendExpression0);
    }

    @Test
    public void test07() throws Throwable {
        DatabendJoin.JoinType databendJoin_JoinType0 = DatabendJoin.JoinType.INNER;
        DatabendJoin databendJoin0 = new DatabendJoin((DatabendTableReference) null, (DatabendTableReference) null,
                databendJoin_JoinType0, (DatabendExpression) null);
        TableReferenceNode<DatabendExpression, DatabendSchema.DatabendTable> tableReferenceNode0 = databendJoin0
                .getLeftTable();
        assertNull(tableReferenceNode0);
    }

    // @Test
    // public void test08() throws Throwable {
    // DatabendTableReference databendTableReference0 = new DatabendTableReference(
    // (DatabendSchema.DatabendTable) null);
    // DatabendJoin.OuterType.getRandom();
    // List<DatabendTableReference> list0 = List.of(databendTableReference0, databendTableReference0,
    // databendTableReference0);
    // DatabendProvider.DatabendGlobalState databendProvider_DatabendGlobalState0 = new
    // DatabendProvider.DatabendGlobalState();
    // // Undeclared exception!
    // try {
    // DatabendJoin.getJoins(list0, databendProvider_DatabendGlobalState0);
    // fail("Expecting exception: UnsupportedOperationException");
    //
    // } catch (UnsupportedOperationException e) {
    // //
    // // no message in exception (getMessage() returned null)
    // //
    // verifyException("java.util.ImmutableCollections", e);
    // }
    // }

    // @Test
    // public void test09() throws Throwable {
    // DatabendTableReference databendTableReference0 = new DatabendTableReference(
    // (DatabendSchema.DatabendTable) null);
    // List<DatabendTableReference> list0 = List.of(databendTableReference0, databendTableReference0,
    // databendTableReference0);
    // DatabendProvider.DatabendGlobalState databendProvider_DatabendGlobalState0 = new
    // DatabendProvider.DatabendGlobalState();
    // List<DatabendJoin> list1 = DatabendJoin.getJoins(list0, databendProvider_DatabendGlobalState0);
    // assertTrue(list1.isEmpty());
    // }

    @Test
    public void test10() throws Throwable {
        LinkedList<DatabendTableReference> linkedList0 = new LinkedList<DatabendTableReference>();
        DatabendProvider.DatabendGlobalState databendProvider_DatabendGlobalState0 = new DatabendProvider.DatabendGlobalState();
        List<DatabendJoin> list0 = DatabendJoin.getJoins(linkedList0, databendProvider_DatabendGlobalState0);
        assertEquals(0, list0.size());
    }

    @Test
    public void test11() throws Throwable {
        DatabendJoin.OuterType databendJoin_OuterType0 = DatabendJoin.OuterType.getRandom();
        LinkedList<DatabendSchema.DatabendTable> linkedList0 = new LinkedList<DatabendSchema.DatabendTable>();
        AbstractTables<DatabendSchema.DatabendTable, DatabendSchema.DatabendColumn> abstractTables0 = new AbstractTables<DatabendSchema.DatabendTable, DatabendSchema.DatabendColumn>(
                linkedList0);
        List<DatabendSchema.DatabendColumn> list0 = abstractTables0.getColumns();
        DatabendSchema.DatabendTable databendSchema_DatabendTable0 = new DatabendSchema.DatabendTable("t~#", list0,
                false);
        DatabendTableReference databendTableReference0 = new DatabendTableReference(databendSchema_DatabendTable0);
        DatabendJoin databendJoin0 = DatabendJoin.createNaturalJoin(databendTableReference0, databendTableReference0,
                databendJoin_OuterType0);
        DatabendJoin.OuterType databendJoin_OuterType1 = databendJoin0.getOuterType();
        assertSame(databendJoin_OuterType0, databendJoin_OuterType1);
    }

    // @Test
    // public void test12() throws Throwable {
    // DatabendJoin.JoinType databendJoin_JoinType0 = DatabendJoin.JoinType.getRandom();
    // assertEquals(DatabendJoin.JoinType.INNER, databendJoin_JoinType0);
    // }

    @Test
    public void test13() throws Throwable {
        DatabendTableReference databendTableReference0 = new DatabendTableReference(
                (DatabendSchema.DatabendTable) null);
        DatabendJoin databendJoin0 = DatabendJoin.createLeftOuterJoin(databendTableReference0, databendTableReference0,
                databendTableReference0);
        databendJoin0.getOuterType();
    }

    @Test
    public void test14() throws Throwable {
        DatabendTableReference databendTableReference0 = new DatabendTableReference(
                (DatabendSchema.DatabendTable) null);
        DatabendJoin databendJoin0 = DatabendJoin.createRightOuterJoin(databendTableReference0, databendTableReference0,
                databendTableReference0);
        TableReferenceNode<DatabendExpression, DatabendSchema.DatabendTable> tableReferenceNode0 = databendJoin0
                .getLeftTable();
        assertSame(databendTableReference0, tableReferenceNode0);
    }

    @Test
    public void test15() throws Throwable {
        DatabendJoin databendJoin0 = DatabendJoin.createInnerJoin((DatabendTableReference) null,
                (DatabendTableReference) null, (DatabendExpression) null);
        DatabendJoin.JoinType databendJoin_JoinType0 = databendJoin0.getJoinType();
        assertEquals(DatabendJoin.JoinType.INNER, databendJoin_JoinType0);
    }

    @Test
    public void test16() throws Throwable {
        DatabendJoin databendJoin0 = DatabendJoin.createInnerJoin((DatabendTableReference) null,
                (DatabendTableReference) null, (DatabendExpression) null);
        DatabendExpression databendExpression0 = databendJoin0.getOnCondition();
        assertNull(databendExpression0);
    }

    @Test
    public void test17() throws Throwable {
        DatabendTableReference databendTableReference0 = new DatabendTableReference(
                (DatabendSchema.DatabendTable) null);
        DatabendJoin databendJoin0 = DatabendJoin.createLeftOuterJoin(databendTableReference0, databendTableReference0,
                databendTableReference0);
        TableReferenceNode<DatabendExpression, DatabendSchema.DatabendTable> tableReferenceNode0 = databendJoin0
                .getRightTable();
        assertSame(databendTableReference0, tableReferenceNode0);
    }

    @Test
    public void test18() throws Throwable {
        DatabendTableReference databendTableReference0 = new DatabendTableReference(
                (DatabendSchema.DatabendTable) null);
        DatabendJoin databendJoin0 = DatabendJoin.createRightOuterJoin(databendTableReference0, databendTableReference0,
                databendTableReference0);
        databendJoin0.setOnClause((DatabendExpression) null);
        assertNull(databendJoin0.getOuterType());
    }
}
