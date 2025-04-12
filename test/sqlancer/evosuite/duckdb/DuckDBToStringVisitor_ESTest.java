/*
 * This file was automatically generated by EvoSuite
 * Fri Apr 11 17:50:22 GMT 2025
 */

package sqlancer.evosuite.duckdb;

import static org.junit.jupiter.api.Assertions.*;
import java.util.LinkedList;
import java.util.List;
import org.junit.jupiter.api.Test;
import sqlancer.duckdb.ast.DuckDBColumnReference;
import sqlancer.duckdb.ast.DuckDBConstant;
import sqlancer.duckdb.ast.DuckDBExpression;
import sqlancer.duckdb.ast.DuckDBFunction;
import sqlancer.duckdb.ast.DuckDBJoin;
import sqlancer.duckdb.ast.DuckDBSelect;
import sqlancer.duckdb.ast.DuckDBTableReference;
import sqlancer.duckdb.DuckDBSchema;
import sqlancer.duckdb.DuckDBToStringVisitor;

public class DuckDBToStringVisitor_ESTest {

    private void verifyException(String s, Exception e) {
    }

    @Test
    public void test0() throws Throwable {
        DuckDBSchema.DuckDBDataType duckDBSchema_DuckDBDataType0 = DuckDBSchema.DuckDBDataType.FLOAT;
        DuckDBSchema.DuckDBCompositeDataType duckDBSchema_DuckDBCompositeDataType0 = new DuckDBSchema.DuckDBCompositeDataType(
                duckDBSchema_DuckDBDataType0, (-979));
        DuckDBSchema.DuckDBColumn duckDBSchema_DuckDBColumn0 = new DuckDBSchema.DuckDBColumn("",
                duckDBSchema_DuckDBCompositeDataType0, false, true);
        DuckDBColumnReference duckDBColumnReference0 = new DuckDBColumnReference(duckDBSchema_DuckDBColumn0);
        String string0 = DuckDBToStringVisitor.asString(duckDBColumnReference0);
        assertEquals("", string0);
    }

    @Test
    public void test1() throws Throwable {
        DuckDBToStringVisitor duckDBToStringVisitor0 = new DuckDBToStringVisitor();
        LinkedList<DuckDBExpression> linkedList0 = new LinkedList<DuckDBExpression>();
        DuckDBFunction<Object> duckDBFunction0 = new DuckDBFunction<Object>(linkedList0, duckDBToStringVisitor0);
        // Undeclared exception!
        try {
            duckDBToStringVisitor0.visitSpecific((DuckDBExpression) duckDBFunction0);
            fail("Expecting exception: AssertionError");

        } catch (AssertionError e) {
            //
            // class sqlancer.duckdb.ast.DuckDBFunction
            //
        }
    }

    @Test
    public void test2() throws Throwable {
        List<DuckDBSchema.DuckDBColumn> list0 = List.of();
        DuckDBSchema.DuckDBTable duckDBSchema_DuckDBTable0 = new DuckDBSchema.DuckDBTable("", list0, true);
        DuckDBTableReference duckDBTableReference0 = new DuckDBTableReference(duckDBSchema_DuckDBTable0);
        DuckDBJoin duckDBJoin0 = DuckDBJoin.createLeftOuterJoin(duckDBTableReference0, duckDBTableReference0,
                duckDBTableReference0);
        String string0 = DuckDBToStringVisitor.asString(duckDBJoin0);
        assertEquals(" LEFT  JOIN  ON ", string0);
    }

    @Test
    public void test3() throws Throwable {
        DuckDBToStringVisitor duckDBToStringVisitor0 = new DuckDBToStringVisitor();
        // Undeclared exception!
        try {
            duckDBToStringVisitor0.visitSpecific((DuckDBExpression) null);
            fail("Expecting exception: NullPointerException");

        } catch (NullPointerException e) {
            //
            // no message in exception (getMessage() returned null)
            //
            verifyException("sqlancer.duckdb.DuckDBToStringVisitor", e);
        }
    }

    @Test
    public void test4() throws Throwable {
        List<DuckDBSchema.DuckDBColumn> list0 = List.of();
        DuckDBSchema.DuckDBTable duckDBSchema_DuckDBTable0 = new DuckDBSchema.DuckDBTable("", list0, true);
        DuckDBTableReference duckDBTableReference0 = new DuckDBTableReference(duckDBSchema_DuckDBTable0);
        DuckDBJoin.OuterType duckDBJoin_OuterType0 = DuckDBJoin.OuterType.FULL;
        DuckDBJoin duckDBJoin0 = DuckDBJoin.createNaturalJoin(duckDBTableReference0, duckDBTableReference0,
                duckDBJoin_OuterType0);
        DuckDBToStringVisitor duckDBToStringVisitor0 = new DuckDBToStringVisitor();
        duckDBToStringVisitor0.visitSpecific((DuckDBExpression) duckDBJoin0);
        assertEquals(" NATURAL FULL JOIN ", duckDBToStringVisitor0.get());
    }

    @Test
    public void test5() throws Throwable {
        DuckDBSelect duckDBSelect0 = new DuckDBSelect();
        DuckDBToStringVisitor duckDBToStringVisitor0 = new DuckDBToStringVisitor();
        // Undeclared exception!
        try {
            duckDBToStringVisitor0.visitSpecific((DuckDBExpression) duckDBSelect0);
            fail("Expecting exception: IllegalStateException");

        } catch (IllegalStateException e) {
            //
            // no message in exception (getMessage() returned null)
            //
            verifyException("sqlancer.common.ast.SelectBase", e);
        }
    }

    @Test
    public void test6() throws Throwable {
        DuckDBSelect duckDBSelect0 = new DuckDBSelect();
        duckDBSelect0.setDistinct(true);
        // Undeclared exception!
        try {
            DuckDBToStringVisitor.asString(duckDBSelect0);
            fail("Expecting exception: IllegalStateException");

        } catch (IllegalStateException e) {
            //
            // no message in exception (getMessage() returned null)
            //
            verifyException("sqlancer.common.ast.SelectBase", e);
        }
    }

    @Test
    public void test7() throws Throwable {
        // Undeclared exception!
        try {
            DuckDBToStringVisitor.asString((DuckDBExpression) null);
            fail("Expecting exception: NullPointerException");

        } catch (NullPointerException e) {
            //
            // no message in exception (getMessage() returned null)
            //
            verifyException("sqlancer.duckdb.DuckDBToStringVisitor", e);
        }
    }

    @Test
    public void test8() throws Throwable {
        DuckDBExpression duckDBExpression0 = DuckDBConstant.createNullConstant();
        String string0 = DuckDBToStringVisitor.asString(duckDBExpression0);
        assertNotNull(string0);
    }

    @Test
    public void test9() throws Throwable {
        DuckDBToStringVisitor duckDBToStringVisitor0 = new DuckDBToStringVisitor();
        DuckDBConstant.DuckDBIntConstant duckDBConstant_DuckDBIntConstant0 = (DuckDBConstant.DuckDBIntConstant) DuckDBConstant
                .createIntConstant((-149L));
        duckDBToStringVisitor0.visitSpecific((DuckDBExpression) duckDBConstant_DuckDBIntConstant0);
        assertEquals("-149", duckDBConstant_DuckDBIntConstant0.toString());
    }
}
