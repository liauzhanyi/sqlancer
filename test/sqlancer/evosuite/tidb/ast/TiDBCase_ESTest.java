/*
 * This file was automatically generated by EvoSuite
 * Fri Apr 11 21:03:37 GMT 2025
 */

package sqlancer.evosuite.tidb.ast;

import static org.junit.jupiter.api.Assertions.*;
import java.util.LinkedList;
import java.util.List;
import org.junit.jupiter.api.Test;
import sqlancer.tidb.ast.TiDBBinaryBitOperation;
import sqlancer.tidb.ast.TiDBBinaryLogicalOperation;
import sqlancer.tidb.ast.TiDBCase;
import sqlancer.tidb.ast.TiDBConstant;
import sqlancer.tidb.ast.TiDBExpression;
import sqlancer.tidb.ast.TiDBJoin;
import sqlancer.tidb.ast.TiDBSelect;
import sqlancer.tidb.TiDBProvider;

public class TiDBCase_ESTest {

    private void verifyException(String s, Exception e) {
    }

    @Test
    public void test00() throws Throwable {
        TiDBConstant.TiDBBooleanConstant tiDBConstant_TiDBBooleanConstant0 = new TiDBConstant.TiDBBooleanConstant(
                false);
        TiDBBinaryLogicalOperation.TiDBBinaryLogicalOperator tiDBBinaryLogicalOperation_TiDBBinaryLogicalOperator0 = TiDBBinaryLogicalOperation.TiDBBinaryLogicalOperator.OR;
        TiDBBinaryLogicalOperation tiDBBinaryLogicalOperation0 = new TiDBBinaryLogicalOperation(
                tiDBConstant_TiDBBooleanConstant0, tiDBConstant_TiDBBooleanConstant0,
                tiDBBinaryLogicalOperation_TiDBBinaryLogicalOperator0);
        TiDBSelect tiDBSelect0 = new TiDBSelect();
        List<TiDBExpression> list0 = tiDBSelect0.getGroupByClause();
        TiDBCase tiDBCase0 = new TiDBCase(tiDBBinaryLogicalOperation0, list0, list0, (TiDBExpression) null);
        List<TiDBExpression> list1 = List.of((TiDBExpression) tiDBConstant_TiDBBooleanConstant0,
                (TiDBExpression) tiDBConstant_TiDBBooleanConstant0, (TiDBExpression) tiDBBinaryLogicalOperation0,
                (TiDBExpression) tiDBConstant_TiDBBooleanConstant0, (TiDBExpression) tiDBBinaryLogicalOperation0,
                (TiDBExpression) tiDBConstant_TiDBBooleanConstant0, (TiDBExpression) tiDBBinaryLogicalOperation0,
                (TiDBExpression) tiDBCase0, (TiDBExpression) tiDBBinaryLogicalOperation0);
        TiDBCase tiDBCase1 = null;
        try {
            tiDBCase1 = new TiDBCase(tiDBConstant_TiDBBooleanConstant0, list1, list0, tiDBSelect0);
            fail("Expecting exception: IllegalArgumentException");

        } catch (IllegalArgumentException e) {
            //
            // no message in exception (getMessage() returned null)
            //
            verifyException("sqlancer.tidb.ast.TiDBCase", e);
        }
    }

    @Test
    public void test01() throws Throwable {
        TiDBConstant.TiDBDoubleConstant tiDBConstant_TiDBDoubleConstant0 = new TiDBConstant.TiDBDoubleConstant(0.0);
        TiDBBinaryBitOperation.TiDBBinaryBitOperator tiDBBinaryBitOperation_TiDBBinaryBitOperator0 = TiDBBinaryBitOperation.TiDBBinaryBitOperator.XOR;
        TiDBBinaryBitOperation tiDBBinaryBitOperation0 = new TiDBBinaryBitOperation(tiDBConstant_TiDBDoubleConstant0,
                tiDBConstant_TiDBDoubleConstant0, tiDBBinaryBitOperation_TiDBBinaryBitOperator0);
        TiDBJoin tiDBJoin0 = TiDBJoin.createLeftOuterJoin(tiDBBinaryBitOperation0, tiDBBinaryBitOperation0,
                tiDBBinaryBitOperation0);
        LinkedList<TiDBExpression> linkedList0 = new LinkedList<TiDBExpression>();
        TiDBCase tiDBCase0 = new TiDBCase(tiDBJoin0, linkedList0, linkedList0, tiDBJoin0);
        TiDBExpression tiDBExpression0 = tiDBCase0.getSwitchCondition();
        assertSame(tiDBJoin0, tiDBExpression0);
    }

    @Test
    public void test02() throws Throwable {
        TiDBConstant.TiDBDoubleConstant tiDBConstant_TiDBDoubleConstant0 = new TiDBConstant.TiDBDoubleConstant(0.0);
        TiDBBinaryBitOperation.TiDBBinaryBitOperator tiDBBinaryBitOperation_TiDBBinaryBitOperator0 = TiDBBinaryBitOperation.TiDBBinaryBitOperator.XOR;
        TiDBBinaryBitOperation tiDBBinaryBitOperation0 = new TiDBBinaryBitOperation(tiDBConstant_TiDBDoubleConstant0,
                tiDBConstant_TiDBDoubleConstant0, tiDBBinaryBitOperation_TiDBBinaryBitOperator0);
        TiDBJoin tiDBJoin0 = TiDBJoin.createLeftOuterJoin(tiDBBinaryBitOperation0, tiDBBinaryBitOperation0,
                tiDBBinaryBitOperation0);
        LinkedList<TiDBExpression> linkedList0 = new LinkedList<TiDBExpression>();
        linkedList0.add((TiDBExpression) null);
        TiDBCase tiDBCase0 = new TiDBCase(tiDBJoin0, linkedList0, linkedList0, tiDBJoin0);
        List<TiDBExpression> list0 = tiDBCase0.getExpressions();
        assertEquals(1, list0.size());
    }

    @Test
    public void test03() throws Throwable {
        TiDBSelect tiDBSelect0 = new TiDBSelect();
        List<TiDBExpression> list0 = tiDBSelect0.getJoinList();
        TiDBProvider.TiDBGlobalState tiDBProvider_TiDBGlobalState0 = new TiDBProvider.TiDBGlobalState();
        List<TiDBExpression> list1 = TiDBJoin.getJoinsWithoutNature(list0, tiDBProvider_TiDBGlobalState0);
        TiDBCase tiDBCase0 = new TiDBCase((TiDBExpression) null, list1, list1, (TiDBExpression) null);
        List<TiDBExpression> list2 = tiDBCase0.getExpressions();
        assertEquals(0, list2.size());
    }

    @Test
    public void test04() throws Throwable {
        TiDBSelect tiDBSelect0 = new TiDBSelect();
        LinkedList<TiDBExpression> linkedList0 = new LinkedList<TiDBExpression>();
        TiDBCase tiDBCase0 = new TiDBCase(tiDBSelect0, linkedList0, linkedList0, tiDBSelect0);
        TiDBExpression tiDBExpression0 = tiDBCase0.getElseExpr();
        assertSame(tiDBExpression0, tiDBSelect0);
    }

    @Test
    public void test05() throws Throwable {
        TiDBConstant.TiDBDoubleConstant tiDBConstant_TiDBDoubleConstant0 = new TiDBConstant.TiDBDoubleConstant(0.0);
        TiDBBinaryBitOperation.TiDBBinaryBitOperator tiDBBinaryBitOperation_TiDBBinaryBitOperator0 = TiDBBinaryBitOperation.TiDBBinaryBitOperator.XOR;
        TiDBBinaryBitOperation tiDBBinaryBitOperation0 = new TiDBBinaryBitOperation(tiDBConstant_TiDBDoubleConstant0,
                tiDBConstant_TiDBDoubleConstant0, tiDBBinaryBitOperation_TiDBBinaryBitOperator0);
        TiDBJoin tiDBJoin0 = TiDBJoin.createLeftOuterJoin(tiDBBinaryBitOperation0, tiDBBinaryBitOperation0,
                tiDBBinaryBitOperation0);
        LinkedList<TiDBExpression> linkedList0 = new LinkedList<TiDBExpression>();
        linkedList0.add((TiDBExpression) null);
        TiDBCase tiDBCase0 = new TiDBCase(tiDBJoin0, linkedList0, linkedList0, tiDBJoin0);
        List<TiDBExpression> list0 = tiDBCase0.getConditions();
        assertFalse(list0.isEmpty());
    }

    @Test
    public void test06() throws Throwable {
        TiDBSelect tiDBSelect0 = new TiDBSelect();
        List<TiDBExpression> list0 = tiDBSelect0.getJoinList();
        TiDBProvider.TiDBGlobalState tiDBProvider_TiDBGlobalState0 = new TiDBProvider.TiDBGlobalState();
        List<TiDBExpression> list1 = TiDBJoin.getJoinsWithoutNature(list0, tiDBProvider_TiDBGlobalState0);
        TiDBCase tiDBCase0 = new TiDBCase((TiDBExpression) null, list1, list1, (TiDBExpression) null);
        List<TiDBExpression> list2 = tiDBCase0.getConditions();
        assertSame(list1, list2);
    }

    @Test
    public void test07() throws Throwable {
        TiDBSelect tiDBSelect0 = new TiDBSelect();
        TiDBCase tiDBCase0 = null;
        try {
            tiDBCase0 = new TiDBCase(tiDBSelect0, (List<TiDBExpression>) null, (List<TiDBExpression>) null,
                    tiDBSelect0);
            fail("Expecting exception: NullPointerException");

        } catch (NullPointerException e) {
            //
            // no message in exception (getMessage() returned null)
            //
            verifyException("sqlancer.tidb.ast.TiDBCase", e);
        }
    }

    @Test
    public void test08() throws Throwable {
        TiDBSelect tiDBSelect0 = new TiDBSelect();
        LinkedList<TiDBExpression> linkedList0 = new LinkedList<TiDBExpression>();
        List<TiDBExpression> list0 = List.of((TiDBExpression) tiDBSelect0, (TiDBExpression) tiDBSelect0);
        TiDBCase tiDBCase0 = null;
        try {
            tiDBCase0 = new TiDBCase(tiDBSelect0, linkedList0, list0, tiDBSelect0);
            fail("Expecting exception: IllegalArgumentException");

        } catch (IllegalArgumentException e) {
            //
            // no message in exception (getMessage() returned null)
            //
            verifyException("sqlancer.tidb.ast.TiDBCase", e);
        }
    }

    @Test
    public void test09() throws Throwable {
        TiDBSelect tiDBSelect0 = new TiDBSelect();
        List<TiDBExpression> list0 = tiDBSelect0.getJoinList();
        TiDBCase tiDBCase0 = new TiDBCase((TiDBExpression) null, list0, list0, (TiDBExpression) null);
        TiDBExpression tiDBExpression0 = tiDBCase0.getElseExpr();
        assertNull(tiDBExpression0);
    }

    @Test
    public void test10() throws Throwable {
        LinkedList<TiDBExpression> linkedList0 = new LinkedList<TiDBExpression>();
        TiDBCase tiDBCase0 = new TiDBCase((TiDBExpression) null, linkedList0, linkedList0, (TiDBExpression) null);
        TiDBExpression tiDBExpression0 = tiDBCase0.getSwitchCondition();
        assertNull(tiDBExpression0);
    }
}
