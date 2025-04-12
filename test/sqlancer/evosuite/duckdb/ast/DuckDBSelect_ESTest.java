/*
 * This file was automatically generated by EvoSuite
 * Fri Apr 11 14:30:44 GMT 2025
 */

package sqlancer.evosuite.duckdb.ast;

import static org.junit.jupiter.api.Assertions.*;
import java.util.LinkedList;
import java.util.List;
import org.junit.jupiter.api.Test;
import sqlancer.duckdb.ast.DuckDBExpression;
import sqlancer.duckdb.ast.DuckDBJoin;
import sqlancer.duckdb.ast.DuckDBSelect;
import sqlancer.duckdb.ast.DuckDBTableReference;
import sqlancer.duckdb.DuckDBSchema;
import sqlancer.Randomly;

public class DuckDBSelect_ESTest {

    private void verifyException(String s, Exception e) {
    }

    @Test
    public void test0() throws Throwable {
        DuckDBSelect duckDBSelect0 = new DuckDBSelect();
        LinkedList<DuckDBJoin> linkedList0 = new LinkedList<DuckDBJoin>();
        DuckDBSchema.DuckDBColumn[] duckDBSchema_DuckDBColumnArray0 = new DuckDBSchema.DuckDBColumn[3];
        List<DuckDBSchema.DuckDBColumn> list0 = Randomly.nonEmptySubset(duckDBSchema_DuckDBColumnArray0);
        DuckDBSchema.DuckDBTable duckDBSchema_DuckDBTable0 = new DuckDBSchema.DuckDBTable((String) null, list0, false);
        DuckDBTableReference duckDBTableReference0 = new DuckDBTableReference(duckDBSchema_DuckDBTable0);
        DuckDBJoin duckDBJoin0 = DuckDBJoin.createRightOuterJoin(duckDBTableReference0, duckDBTableReference0,
                duckDBSelect0);
        linkedList0.add(duckDBJoin0);
        duckDBSelect0.setJoinClauses(linkedList0);
        List<DuckDBJoin> list1 = duckDBSelect0.getJoinClauses();
        assertFalse(list1.isEmpty());
    }

    @Test
    public void test1() throws Throwable {
        DuckDBSelect duckDBSelect0 = new DuckDBSelect();
        // Undeclared exception!
        try {
            duckDBSelect0.setJoinClauses((List<DuckDBJoin>) null);
            fail("Expecting exception: NullPointerException");

        } catch (NullPointerException e) {
            //
            // no message in exception (getMessage() returned null)
            //
            verifyException("sqlancer.duckdb.ast.DuckDBSelect", e);
        }
    }

    @Test
    public void test2() throws Throwable {
        DuckDBSelect duckDBSelect0 = new DuckDBSelect();
        duckDBSelect0.setJoinList((List<DuckDBExpression>) null);
        // Undeclared exception!
        try {
            duckDBSelect0.getJoinClauses();
            fail("Expecting exception: NullPointerException");

        } catch (NullPointerException e) {
            //
            // no message in exception (getMessage() returned null)
            //
            verifyException("sqlancer.duckdb.ast.DuckDBSelect", e);
        }
    }

    @Test
    public void test3() throws Throwable {
        DuckDBSelect duckDBSelect0 = new DuckDBSelect();
        List<DuckDBExpression> list0 = List.of((DuckDBExpression) duckDBSelect0);
        duckDBSelect0.setJoinList(list0);
        // Undeclared exception!
        try {
            duckDBSelect0.getJoinClauses();
            fail("Expecting exception: ClassCastException");

        } catch (ClassCastException e) {
            //
            // class sqlancer.duckdb.ast.DuckDBSelect cannot be cast to class sqlancer.duckdb.ast.DuckDBJoin
            // (sqlancer.duckdb.ast.DuckDBSelect and sqlancer.duckdb.ast.DuckDBJoin are in unnamed module of loader
            // org.evosuite.instrumentation.InstrumentingClassLoader @6392de94)
            //
            verifyException("sqlancer.duckdb.ast.DuckDBSelect", e);
        }
    }

    @Test
    public void test4() throws Throwable {
        DuckDBSelect duckDBSelect0 = new DuckDBSelect();
        List<DuckDBExpression> list0 = List.of((DuckDBExpression) duckDBSelect0, (DuckDBExpression) duckDBSelect0,
                (DuckDBExpression) duckDBSelect0);
        duckDBSelect0.setFetchColumns(list0);
        // Undeclared exception!
        try {
            duckDBSelect0.asString();
            fail("Expecting exception: StackOverflowError");

        } catch (StackOverflowError e) {
            //
            // no message in exception (getMessage() returned null)
            //
        }
    }

    @Test
    public void test5() throws Throwable {
        DuckDBSelect duckDBSelect0 = new DuckDBSelect();
        boolean boolean0 = duckDBSelect0.isDistinct();
        assertFalse(boolean0);
    }

    @Test
    public void test6() throws Throwable {
        DuckDBSelect duckDBSelect0 = new DuckDBSelect();
        List<DuckDBJoin> list0 = duckDBSelect0.getJoinClauses();
        assertEquals(0, list0.size());
    }

    @Test
    public void test7() throws Throwable {
        DuckDBSelect duckDBSelect0 = new DuckDBSelect();
        duckDBSelect0.setDistinct(true);
        boolean boolean0 = duckDBSelect0.isDistinct();
        assertTrue(boolean0);
    }

    @Test
    public void test8() throws Throwable {
        DuckDBSelect duckDBSelect0 = new DuckDBSelect();
        // Undeclared exception!
        try {
            duckDBSelect0.asString();
            fail("Expecting exception: IllegalStateException");

        } catch (IllegalStateException e) {
            //
            // no message in exception (getMessage() returned null)
            //
            verifyException("sqlancer.common.ast.SelectBase", e);
        }
    }
}
