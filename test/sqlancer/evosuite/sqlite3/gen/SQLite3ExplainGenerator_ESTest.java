/*
 * This file was automatically generated by EvoSuite
 * Fri Apr 11 23:40:52 GMT 2025
 */

package sqlancer.evosuite.sqlite3.gen;

import static org.junit.jupiter.api.Assertions.*;
import org.evosuite.runtime.Random;
import org.junit.jupiter.api.Test;
import sqlancer.common.query.SQLQueryAdapter;
import sqlancer.sqlite3.gen.SQLite3ExplainGenerator;
import sqlancer.sqlite3.SQLite3GlobalState;

public class SQLite3ExplainGenerator_ESTest {

    private void verifyException(String s, Exception e) {
    }

    @Test
    public void test0() throws Throwable {
        try {
            SQLite3ExplainGenerator.explain((SQLite3GlobalState) null);
            fail("Expecting exception: NullPointerException");

        } catch (NullPointerException e) {
            //
            // no message in exception (getMessage() returned null)
            //
            verifyException("sqlancer.sqlite3.gen.SQLite3PragmaGenerator", e);
        }
    }

    @Test
    public void test1() throws Throwable {
        Random.setNextRandom(1042);
        SQLite3GlobalState sQLite3GlobalState0 = new SQLite3GlobalState();
        // Undeclared exception!
        try {
            SQLite3ExplainGenerator.explain(sQLite3GlobalState0);
            fail("Expecting exception: AssertionError");

        } catch (AssertionError e) {
            //
            // null
            //
        }
    }

    @Test
    public void test2() throws Throwable {
        SQLite3GlobalState sQLite3GlobalState0 = new SQLite3GlobalState();
        SQLQueryAdapter sQLQueryAdapter0 = SQLite3ExplainGenerator.explain(sQLite3GlobalState0);
        assertEquals("EXPLAIN PRAGMA application_id;", sQLQueryAdapter0.getQueryString());
    }

    @Test
    public void test3() throws Throwable {
        String string0 = SQLite3ExplainGenerator.explain("EXPLAIN QUERY PLAN ");
        assertEquals("EXPLAIN QUERY PLAN EXPLAIN QUERY PLAN ", string0);
    }
}
