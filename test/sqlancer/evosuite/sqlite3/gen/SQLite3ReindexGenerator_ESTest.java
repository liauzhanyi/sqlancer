/*
 * This file was automatically generated by EvoSuite
 * Fri Apr 11 14:00:28 GMT 2025
 */

package sqlancer.evosuite.sqlite3.gen;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import sqlancer.sqlite3.gen.SQLite3ReindexGenerator;
import sqlancer.sqlite3.SQLite3GlobalState;

public class SQLite3ReindexGenerator_ESTest {

    private void verifyException(String s, Exception e) {
    }

    @Test
    public void test0() throws Throwable {
        // Undeclared exception!
        try {
            SQLite3ReindexGenerator.executeReindex((SQLite3GlobalState) null);
            fail("Expecting exception: NullPointerException");

        } catch (NullPointerException e) {
            //
            // no message in exception (getMessage() returned null)
            //
            verifyException("sqlancer.sqlite3.gen.SQLite3ReindexGenerator", e);
        }
    }

    @Test
    public void test1() throws Throwable {
        SQLite3GlobalState sQLite3GlobalState0 = new SQLite3GlobalState();
        // Undeclared exception!
        try {
            SQLite3ReindexGenerator.executeReindex(sQLite3GlobalState0);
            fail("Expecting exception: AssertionError");

        } catch (AssertionError e) {
            //
            // null
            //
        }
    }
}
