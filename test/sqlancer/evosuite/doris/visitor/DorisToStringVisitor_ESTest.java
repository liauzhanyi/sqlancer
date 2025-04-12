/*
 * This file was automatically generated by EvoSuite
 * Sat Apr 12 00:21:52 GMT 2025
 */

package sqlancer.evosuite.doris.visitor;

import static org.junit.jupiter.api.Assertions.*;
import java.util.LinkedList;
import java.util.List;
import org.junit.jupiter.api.Test;
import sqlancer.doris.ast.DorisCaseOperation;
import sqlancer.doris.ast.DorisCastOperation;
import sqlancer.doris.ast.DorisColumnValue;
import sqlancer.doris.ast.DorisConstant;
import sqlancer.doris.ast.DorisExpression;
import sqlancer.doris.ast.DorisFunctionOperation;
import sqlancer.doris.ast.DorisJoin;
import sqlancer.doris.ast.DorisSelect;
import sqlancer.doris.ast.DorisTableReference;
import sqlancer.doris.DorisSchema;
import sqlancer.doris.visitor.DorisToStringVisitor;

public class DorisToStringVisitor_ESTest {

    private void verifyException(String s, Exception e) {
    }

    @Test
    public void test00() throws Throwable {
        DorisSchema.DorisCompositeDataType dorisSchema_DorisCompositeDataType0 = DorisSchema.DorisCompositeDataType
                .getRandomWithoutNull();
        DorisSchema.DorisColumn dorisSchema_DorisColumn0 = new DorisSchema.DorisColumn("",
                dorisSchema_DorisCompositeDataType0, false, false);
        DorisColumnValue dorisColumnValue0 = new DorisColumnValue(dorisSchema_DorisColumn0, (DorisConstant) null);
        String string0 = DorisToStringVisitor.asString(dorisColumnValue0);
        assertEquals("", string0);
    }

    @Test
    public void test01() throws Throwable {
        DorisToStringVisitor dorisToStringVisitor0 = new DorisToStringVisitor();
        // Undeclared exception!
        try {
            dorisToStringVisitor0.visitSpecific((DorisExpression) null);
            fail("Expecting exception: NullPointerException");

        } catch (NullPointerException e) {
            //
            // no message in exception (getMessage() returned null)
            //
            verifyException("sqlancer.doris.visitor.DorisToStringVisitor", e);
        }
    }

    @Test
    public void test02() throws Throwable {
        LinkedList<DorisExpression> linkedList0 = new LinkedList<DorisExpression>();
        DorisConstant.DorisBooleanConstant dorisConstant_DorisBooleanConstant0 = new DorisConstant.DorisBooleanConstant(
                true);
        LinkedList<DorisExpression> linkedList1 = new LinkedList<DorisExpression>();
        linkedList1.add((DorisExpression) dorisConstant_DorisBooleanConstant0);
        DorisCaseOperation dorisCaseOperation0 = new DorisCaseOperation(dorisConstant_DorisBooleanConstant0,
                linkedList1, linkedList0, dorisConstant_DorisBooleanConstant0);
        // Undeclared exception!
        try {
            DorisToStringVisitor.asString(dorisCaseOperation0);
            fail("Expecting exception: IndexOutOfBoundsException");

        } catch (IndexOutOfBoundsException e) {
            //
            // Index: 0, Size: 0
            //
            verifyException("java.util.LinkedList", e);
        }
    }

    @Test
    public void test03() throws Throwable {
        LinkedList<DorisSchema.DorisColumn> linkedList0 = new LinkedList<DorisSchema.DorisColumn>();
        DorisSchema.DorisTable dorisSchema_DorisTable0 = new DorisSchema.DorisTable(
                "sqlancer.doris.visitor.DorisToStringVisitor", linkedList0, false);
        DorisTableReference dorisTableReference0 = new DorisTableReference(dorisSchema_DorisTable0);
        DorisToStringVisitor dorisToStringVisitor0 = new DorisToStringVisitor();
        // Undeclared exception!
        try {
            dorisToStringVisitor0.visitSpecific((DorisExpression) dorisTableReference0);
            fail("Expecting exception: AssertionError");

        } catch (AssertionError e) {
            //
            // class sqlancer.doris.ast.DorisTableReference
            //
        }
    }

    @Test
    public void test04() throws Throwable {
        LinkedList<DorisSchema.DorisColumn> linkedList0 = new LinkedList<DorisSchema.DorisColumn>();
        DorisSchema.DorisTable dorisSchema_DorisTable0 = new DorisSchema.DorisTable(
                "sqlancer.doris.visitor.DorisToStringVisitor", linkedList0, false);
        DorisTableReference dorisTableReference0 = new DorisTableReference(dorisSchema_DorisTable0);
        LinkedList<DorisExpression> linkedList1 = new LinkedList<DorisExpression>();
        DorisCaseOperation dorisCaseOperation0 = new DorisCaseOperation(dorisTableReference0, linkedList1, linkedList1,
                dorisTableReference0);
        DorisToStringVisitor dorisToStringVisitor0 = new DorisToStringVisitor();
        dorisToStringVisitor0.visitSpecific((DorisExpression) dorisCaseOperation0);
        assertEquals(
                "CASE sqlancer.doris.visitor.DorisToStringVisitor ELSE sqlancer.doris.visitor.DorisToStringVisitor END ",
                dorisToStringVisitor0.get());
    }

    @Test
    public void test05() throws Throwable {
        LinkedList<DorisSchema.DorisColumn> linkedList0 = new LinkedList<DorisSchema.DorisColumn>();
        DorisSchema.DorisTable dorisSchema_DorisTable0 = new DorisSchema.DorisTable("SELECT ", linkedList0, false);
        DorisTableReference dorisTableReference0 = new DorisTableReference(dorisSchema_DorisTable0);
        DorisToStringVisitor dorisToStringVisitor0 = new DorisToStringVisitor();
        DorisSchema.DorisDataType dorisSchema_DorisDataType0 = DorisSchema.DorisDataType.DECIMAL;
        DorisSchema.DorisCompositeDataType dorisSchema_DorisCompositeDataType0 = new DorisSchema.DorisCompositeDataType(
                dorisSchema_DorisDataType0, 3);
        DorisCastOperation dorisCastOperation0 = new DorisCastOperation(dorisTableReference0,
                dorisSchema_DorisCompositeDataType0);
        dorisToStringVisitor0.visitSpecific((DorisExpression) dorisCastOperation0);
        assertEquals("CAST(SELECT  AS DECIMAL) ", dorisToStringVisitor0.get());
    }

    @Test
    public void test06() throws Throwable {
        DorisSelect dorisSelect0 = new DorisSelect();
        DorisToStringVisitor dorisToStringVisitor0 = new DorisToStringVisitor();
        // Undeclared exception!
        try {
            dorisToStringVisitor0.visitSpecific((DorisExpression) dorisSelect0);
            fail("Expecting exception: IllegalStateException");

        } catch (IllegalStateException e) {
            //
            // no message in exception (getMessage() returned null)
            //
            verifyException("sqlancer.common.ast.SelectBase", e);
        }
    }

    @Test
    public void test07() throws Throwable {
        LinkedList<DorisExpression> linkedList0 = new LinkedList<DorisExpression>();
        DorisFunctionOperation.DorisFunction dorisFunctionOperation_DorisFunction0 = DorisFunctionOperation.DorisFunction.TIME_TO_SEC;
        DorisFunctionOperation dorisFunctionOperation0 = new DorisFunctionOperation(
                dorisFunctionOperation_DorisFunction0, linkedList0);
        DorisToStringVisitor dorisToStringVisitor0 = new DorisToStringVisitor();
        dorisToStringVisitor0.visitSpecific((DorisExpression) dorisFunctionOperation0);
        assertEquals("TIME_TO_SEC() ", dorisToStringVisitor0.get());
    }

    @Test
    public void test08() throws Throwable {
        DorisConstant.DorisFloatConstant dorisConstant_DorisFloatConstant0 = new DorisConstant.DorisFloatConstant(
                817.2083122);
        DorisToStringVisitor dorisToStringVisitor0 = new DorisToStringVisitor();
        dorisToStringVisitor0.visitSpecific((DorisExpression) dorisConstant_DorisFloatConstant0);
        assertFalse(dorisConstant_DorisFloatConstant0.isBoolean());
    }

    @Test
    public void test09() throws Throwable {
        DorisToStringVisitor dorisToStringVisitor0 = new DorisToStringVisitor();
        LinkedList<DorisSchema.DorisColumn> linkedList0 = new LinkedList<DorisSchema.DorisColumn>();
        DorisSchema.DorisTable dorisSchema_DorisTable0 = new DorisSchema.DorisTable("SELECT ", linkedList0, false);
        DorisTableReference dorisTableReference0 = new DorisTableReference(dorisSchema_DorisTable0);
        DorisJoin dorisJoin0 = DorisJoin.createRightOuterJoin(dorisTableReference0, dorisTableReference0,
                dorisTableReference0);
        dorisToStringVisitor0.visitSpecific((DorisExpression) dorisJoin0);
        assertEquals(" SELECT  RIGHT JOIN SELECT  ON SELECT ", dorisToStringVisitor0.get());
    }

    @Test
    public void test10() throws Throwable {
        DorisSelect dorisSelect0 = new DorisSelect();
        dorisSelect0.setDistinct(true);
        // Undeclared exception!
        try {
            DorisToStringVisitor.asString(dorisSelect0);
            fail("Expecting exception: IllegalStateException");

        } catch (IllegalStateException e) {
            //
            // no message in exception (getMessage() returned null)
            //
            verifyException("sqlancer.common.ast.SelectBase", e);
        }
    }

    @Test
    public void test11() throws Throwable {
        LinkedList<DorisSchema.DorisColumn> linkedList0 = new LinkedList<DorisSchema.DorisColumn>();
        DorisSchema.DorisTable dorisSchema_DorisTable0 = new DorisSchema.DorisTable("[ti", linkedList0, false);
        DorisTableReference dorisTableReference0 = new DorisTableReference(dorisSchema_DorisTable0);
        LinkedList<DorisExpression> linkedList1 = new LinkedList<DorisExpression>();
        linkedList1.add((DorisExpression) dorisTableReference0);
        DorisCaseOperation dorisCaseOperation0 = new DorisCaseOperation(dorisTableReference0, linkedList1, linkedList1,
                (DorisExpression) null);
        String string0 = DorisToStringVisitor.asString(dorisCaseOperation0);
        assertEquals("CASE [ti  WHEN [ti THEN [ti END ", string0);
    }

    @Test
    public void test12() throws Throwable {
        LinkedList<DorisExpression> linkedList0 = new LinkedList<DorisExpression>();
        DorisConstant.DorisNullConstant dorisConstant_DorisNullConstant0 = new DorisConstant.DorisNullConstant();
        linkedList0.add((DorisExpression) dorisConstant_DorisNullConstant0);
        DorisFunctionOperation.DorisFunction dorisFunctionOperation_DorisFunction0 = DorisFunctionOperation.DorisFunction.ABS;
        linkedList0.add((DorisExpression) dorisConstant_DorisNullConstant0);
        DorisFunctionOperation dorisFunctionOperation0 = new DorisFunctionOperation(
                dorisFunctionOperation_DorisFunction0, linkedList0);
        String string0 = DorisToStringVisitor.asString(dorisFunctionOperation0);
        assertNotNull(string0);
    }

    @Test
    public void test13() throws Throwable {
        DorisFunctionOperation.DorisFunction dorisFunctionOperation_DorisFunction0 = DorisFunctionOperation.DorisFunction.YEARWEEK;
        DorisFunctionOperation dorisFunctionOperation0 = new DorisFunctionOperation(
                dorisFunctionOperation_DorisFunction0, (List<DorisExpression>) null);
        String string0 = DorisToStringVisitor.asString(dorisFunctionOperation0);
        assertEquals("YEARWEEK() ", string0);
    }

    @Test
    public void test14() throws Throwable {
        LinkedList<DorisSchema.DorisColumn> linkedList0 = new LinkedList<DorisSchema.DorisColumn>();
        DorisSchema.DorisTable dorisSchema_DorisTable0 = new DorisSchema.DorisTable("SELECT ", linkedList0, true);
        DorisTableReference dorisTableReference0 = new DorisTableReference(dorisSchema_DorisTable0);
        DorisJoin dorisJoin0 = DorisJoin.createInnerJoin(dorisTableReference0, dorisTableReference0,
                (DorisExpression) null);
        String string0 = DorisToStringVisitor.asString(dorisJoin0);
        assertEquals(" SELECT  CROSS JOIN SELECT  ", string0);
    }

    @Test
    public void test15() throws Throwable {
        LinkedList<DorisSchema.DorisColumn> linkedList0 = new LinkedList<DorisSchema.DorisColumn>();
        DorisSchema.DorisTable dorisSchema_DorisTable0 = new DorisSchema.DorisTable("SELECT ", linkedList0, false);
        DorisTableReference dorisTableReference0 = new DorisTableReference(dorisSchema_DorisTable0);
        DorisJoin.JoinType dorisJoin_JoinType0 = DorisJoin.JoinType.LEFT;
        DorisJoin dorisJoin0 = new DorisJoin(dorisTableReference0, dorisTableReference0, dorisJoin_JoinType0,
                dorisTableReference0);
        String string0 = DorisToStringVisitor.asString(dorisJoin0);
        assertEquals(" SELECT  LEFT JOIN SELECT  ON SELECT ", string0);
    }

    @Test
    public void test16() throws Throwable {
        LinkedList<DorisSchema.DorisColumn> linkedList0 = new LinkedList<DorisSchema.DorisColumn>();
        DorisSchema.DorisTable dorisSchema_DorisTable0 = new DorisSchema.DorisTable("SELEC ", linkedList0, false);
        DorisTableReference dorisTableReference0 = new DorisTableReference(dorisSchema_DorisTable0);
        DorisJoin.JoinType dorisJoin_JoinType0 = DorisJoin.JoinType.STRAIGHT;
        DorisJoin dorisJoin0 = new DorisJoin(dorisTableReference0, dorisTableReference0, dorisJoin_JoinType0,
                dorisTableReference0);
        String string0 = DorisToStringVisitor.asString(dorisJoin0);
        assertEquals(" SELEC  STRAIGHT_JOIN SELEC  ON SELEC ", string0);
    }

    @Test
    public void test17() throws Throwable {
        DorisJoin dorisJoin0 = DorisJoin.createInnerJoin((DorisTableReference) null, (DorisTableReference) null,
                (DorisExpression) null);
        // Undeclared exception!
        try {
            DorisToStringVisitor.asString(dorisJoin0);
            fail("Expecting exception: NullPointerException");

        } catch (NullPointerException e) {
            //
            // no message in exception (getMessage() returned null)
            //
            verifyException("sqlancer.doris.visitor.DorisToStringVisitor", e);
        }
    }
}
