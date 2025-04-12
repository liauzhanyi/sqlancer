/*
 * This file was automatically generated by EvoSuite
 * Fri Apr 11 21:28:10 GMT 2025
 */

package sqlancer.evosuite.sqlite3;

import static org.junit.jupiter.api.Assertions.*;
import java.sql.SQLException;
import org.evosuite.runtime.testdata.EvoSuiteFile;
import org.evosuite.runtime.testdata.FileSystemHandling;
import org.junit.jupiter.api.Test;
import sqlancer.sqlite3.SQLite3GlobalState;
import sqlancer.sqlite3.SQLite3Provider;

public class SQLite3Provider_ESTest {

    private void verifyException(String s, Exception e) {
    }

    @Test
    public void test00() throws Throwable {
        SQLite3Provider sQLite3Provider0 = new SQLite3Provider();
        SQLite3GlobalState sQLite3GlobalState0 = new SQLite3GlobalState();
        try {
            sQLite3Provider0.getQueryPlan("", sQLite3GlobalState0);
            fail("Expecting exception: NullPointerException");

        } catch (NullPointerException e) {
            //
            // no message in exception (getMessage() returned null)
            //
            verifyException("sqlancer.sqlite3.SQLite3Provider", e);
        }
    }

    @Test
    public void test01() throws Throwable {
        SQLite3Provider sQLite3Provider0 = new SQLite3Provider();
        SQLite3GlobalState sQLite3GlobalState0 = new SQLite3GlobalState();
        try {
            sQLite3Provider0.generateDatabase(sQLite3GlobalState0);
            fail("Expecting exception: NullPointerException");

        } catch (NullPointerException e) {
            //
            // no message in exception (getMessage() returned null)
            //
            verifyException("sqlancer.sqlite3.SQLite3Provider", e);
        }
    }

    @Test
    public void test02() throws Throwable {
        SQLite3Provider sQLite3Provider0 = new SQLite3Provider();
        SQLite3GlobalState sQLite3GlobalState0 = new SQLite3GlobalState();
        // Undeclared exception!
        try {
            sQLite3Provider0.executeMutator(19, sQLite3GlobalState0);
            fail("Expecting exception: AssertionError");

        } catch (AssertionError e) {
            //
            // null
            //
        }
    }

    @Test
    public void test03() throws Throwable {
        SQLite3Provider sQLite3Provider0 = new SQLite3Provider();
        try {
            sQLite3Provider0.addRowsToAllTables((SQLite3GlobalState) null);
            fail("Expecting exception: NullPointerException");

        } catch (NullPointerException e) {
            //
            // no message in exception (getMessage() returned null)
            //
            verifyException("sqlancer.sqlite3.SQLite3Provider", e);
        }
    }

    @Test
    public void test04() throws Throwable {
        SQLite3Provider sQLite3Provider0 = new SQLite3Provider();
        SQLite3GlobalState sQLite3GlobalState0 = new SQLite3GlobalState();
        // Undeclared exception!
        try {
            sQLite3Provider0.addRowsToAllTables(sQLite3GlobalState0);
            fail("Expecting exception: AssertionError");

        } catch (AssertionError e) {
            //
            // null
            //
        }
    }

    @Test
    public void test05() throws Throwable {
        SQLite3Provider.Action sQLite3Provider_Action0 = SQLite3Provider.Action.CREATE_TRIGGER;
        SQLite3GlobalState sQLite3GlobalState0 = new SQLite3GlobalState();
        // Undeclared exception!
        try {
            sQLite3Provider_Action0.getQuery(sQLite3GlobalState0);
            fail("Expecting exception: AssertionError");

        } catch (AssertionError e) {
            //
            // null
            //
        }
    }

    @Test
    public void test06() throws Throwable {
        SQLite3Provider sQLite3Provider0 = new SQLite3Provider();
        SQLite3GlobalState sQLite3GlobalState0 = new SQLite3GlobalState();
        try {
            sQLite3Provider0.createDatabase(sQLite3GlobalState0);
            fail("Expecting exception: SQLException");

        } catch (SQLException e) {
            //
            // No suitable driver found for
            // jdbc:sqlite:C:\\Users\\yewjo\\OneDrive\\Desktop\\NUS\\y4s2\\cs3213\\sqlancer-test\\sqlancer-test\\.\\databases\\null.db
            //
            verifyException("java.sql.DriverManager", e);
        }
    }

    @Test
    public void test07() throws Throwable {
        EvoSuiteFile evoSuiteFile0 = new EvoSuiteFile(".\\databases\\null.db");
        FileSystemHandling.createFolder(evoSuiteFile0);
        SQLite3Provider sQLite3Provider0 = new SQLite3Provider();
        SQLite3GlobalState sQLite3GlobalState0 = new SQLite3GlobalState();
        // Undeclared exception!
        try {
            sQLite3Provider0.createDatabase(sQLite3GlobalState0);
            fail("Expecting exception: NullPointerException");

        } catch (NullPointerException e) {
            //
            // no message in exception (getMessage() returned null)
            //
            verifyException("sqlancer.sqlite3.SQLite3Provider", e);
        }
    }

    @Test
    public void test08() throws Throwable {
        SQLite3Provider sQLite3Provider0 = new SQLite3Provider();
        SQLite3GlobalState sQLite3GlobalState0 = new SQLite3GlobalState();
        try {
            sQLite3Provider0.executeMutator(0, sQLite3GlobalState0);
            fail("Expecting exception: NullPointerException");

        } catch (NullPointerException e) {
            //
            // no message in exception (getMessage() returned null)
            //
            verifyException("sqlancer.GlobalState", e);
        }
    }

    @Test
    public void test09() throws Throwable {
        SQLite3Provider sQLite3Provider0 = new SQLite3Provider();
        String string0 = sQLite3Provider0.getDBMSName();
        assertEquals("sqlite3", string0);
    }

    @Test
    public void test10() throws Throwable {
        SQLite3Provider sQLite3Provider0 = new SQLite3Provider();
        SQLite3GlobalState sQLite3GlobalState0 = new SQLite3GlobalState();
        try {
            sQLite3Provider0.executeMutator((-55), sQLite3GlobalState0);
            fail("Expecting exception: ArrayIndexOutOfBoundsException");

        } catch (ArrayIndexOutOfBoundsException e) {
            //
            // Index -55 out of bounds for length 24
            //
            verifyException("sqlancer.sqlite3.SQLite3Provider", e);
        }
    }

    @Test
    public void test11() throws Throwable {
        SQLite3Provider sQLite3Provider0 = new SQLite3Provider();
        double[] doubleArray0 = sQLite3Provider0.initializeWeightedAverageReward();
        assertEquals(24, doubleArray0.length);
    }
}
