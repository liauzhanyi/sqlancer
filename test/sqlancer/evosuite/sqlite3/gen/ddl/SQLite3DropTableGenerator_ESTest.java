/*
 * This file was automatically generated by EvoSuite
 * Fri Apr 11 16:28:26 GMT 2025
 */

package sqlancer.evosuite.sqlite3.gen.ddl;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import sqlancer.sqlite3.gen.ddl.SQLite3DropTableGenerator;
import sqlancer.sqlite3.SQLite3GlobalState;

public class SQLite3DropTableGenerator_ESTest {

    private void verifyException(String s, Exception e) {
    }

    @Test
    public void test0() throws Throwable {
        // Undeclared exception!
        try {
            SQLite3DropTableGenerator.dropTable((SQLite3GlobalState) null);
            fail("Expecting exception: NullPointerException");

        } catch (NullPointerException e) {
            //
            // no message in exception (getMessage() returned null)
            //
            verifyException("sqlancer.sqlite3.gen.ddl.SQLite3DropTableGenerator", e);
        }
    }

    @Test
    public void test1() throws Throwable {
        SQLite3GlobalState sQLite3GlobalState0 = new SQLite3GlobalState();
        // Undeclared exception!
        try {
            SQLite3DropTableGenerator.dropTable(sQLite3GlobalState0);
            fail("Expecting exception: AssertionError");

        } catch (AssertionError e) {
            //
            // null
            //
        }
    }
}
