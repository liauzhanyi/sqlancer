/*
 * This file was automatically generated by EvoSuite
 * Fri Apr 11 20:14:23 GMT 2025
 */

package sqlancer.evosuite.sqlite3.oracle;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import sqlancer.sqlite3.oracle.SQLite3Fuzzer;
import sqlancer.sqlite3.SQLite3GlobalState;

public class SQLite3Fuzzer_ESTest {

    private void verifyException(String s, Exception e) {
    }

    @Test
    public void test0() throws Throwable {
        SQLite3GlobalState sQLite3GlobalState0 = new SQLite3GlobalState();
        SQLite3Fuzzer sQLite3Fuzzer0 = new SQLite3Fuzzer(sQLite3GlobalState0);
        // Undeclared exception!
        try {
            sQLite3Fuzzer0.check();
            fail("Expecting exception: AssertionError");

        } catch (AssertionError e) {
            //
            // null
            //
        }
    }

    @Test
    public void test1() throws Throwable {
        SQLite3Fuzzer sQLite3Fuzzer0 = new SQLite3Fuzzer((SQLite3GlobalState) null);
        try {
            sQLite3Fuzzer0.check();
            fail("Expecting exception: NullPointerException");

        } catch (NullPointerException e) {
            //
            // no message in exception (getMessage() returned null)
            //
            verifyException("sqlancer.sqlite3.oracle.SQLite3RandomQuerySynthesizer", e);
        }
    }
}
