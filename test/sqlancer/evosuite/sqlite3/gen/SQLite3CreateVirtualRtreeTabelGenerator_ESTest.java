/*
 * This file was automatically generated by EvoSuite
 * Fri Apr 11 19:05:29 GMT 2025
 */

package sqlancer.evosuite.sqlite3.gen;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import sqlancer.common.query.SQLQueryAdapter;
import sqlancer.sqlite3.gen.SQLite3CreateVirtualRtreeTabelGenerator;
import sqlancer.sqlite3.SQLite3GlobalState;

public class SQLite3CreateVirtualRtreeTabelGenerator_ESTest {

    private void verifyException(String s, Exception e) {
    }

    @Test
    public void test0() throws Throwable {
        // Undeclared exception!
        try {
            SQLite3CreateVirtualRtreeTabelGenerator.createRandomTableStatement((SQLite3GlobalState) null);
            fail("Expecting exception: NullPointerException");

        } catch (NullPointerException e) {
            //
            // no message in exception (getMessage() returned null)
            //
            verifyException("sqlancer.sqlite3.gen.SQLite3CreateVirtualRtreeTabelGenerator", e);
        }
    }

    @Test
    public void test1() throws Throwable {
        SQLite3GlobalState sQLite3GlobalState0 = new SQLite3GlobalState();
        // Undeclared exception!
        try {
            SQLite3CreateVirtualRtreeTabelGenerator.createRandomTableStatement(sQLite3GlobalState0);
            fail("Expecting exception: AssertionError");

        } catch (AssertionError e) {
            //
            // null
            //
        }
    }

    // @Test
    // public void test2() throws Throwable {
    // SQLQueryAdapter sQLQueryAdapter0 = SQLite3CreateVirtualRtreeTabelGenerator
    // .createTableStatement("Iv$YH~u|vG~g-!)G", (SQLite3GlobalState) null);
    // assertEquals("CREATE VIRTUAL TABLE Iv$YH~u|vG~g-!)G USING rtree_i32(c0, c1, c2);",
    // sQLQueryAdapter0.getQueryString());
    // }
}
