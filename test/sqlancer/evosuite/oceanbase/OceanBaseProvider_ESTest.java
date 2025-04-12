/*
 * This file was automatically generated by EvoSuite
 * Sat Apr 12 01:52:54 GMT 2025
 */

package sqlancer.evosuite.oceanbase;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import sqlancer.common.query.SQLQueryAdapter;
import sqlancer.oceanbase.OceanBaseGlobalState;
import sqlancer.oceanbase.OceanBaseProvider;

public class OceanBaseProvider_ESTest {

    private void verifyException(String s, Exception e) {
    }

    @Test
    public void test0() throws Throwable {
        OceanBaseGlobalState oceanBaseGlobalState0 = new OceanBaseGlobalState();
        OceanBaseProvider.Action oceanBaseProvider_Action0 = OceanBaseProvider.Action.SHOW_TABLES;
        SQLQueryAdapter sQLQueryAdapter0 = oceanBaseProvider_Action0.getQuery(oceanBaseGlobalState0);
        assertEquals("SHOW TABLES;", sQLQueryAdapter0.getQueryString());
    }

    @Test
    public void test1() throws Throwable {
        OceanBaseProvider oceanBaseProvider0 = new OceanBaseProvider();
        try {
            oceanBaseProvider0.generateDatabase((OceanBaseGlobalState) null);
            fail("Expecting exception: NullPointerException");

        } catch (NullPointerException e) {
            //
            // no message in exception (getMessage() returned null)
            //
            verifyException("sqlancer.oceanbase.OceanBaseProvider", e);
        }
    }

    @Test
    public void test2() throws Throwable {
        OceanBaseProvider oceanBaseProvider0 = new OceanBaseProvider();
        OceanBaseGlobalState oceanBaseGlobalState0 = new OceanBaseGlobalState();
        // Undeclared exception!
        try {
            oceanBaseProvider0.generateDatabase(oceanBaseGlobalState0);
            fail("Expecting exception: AssertionError");

        } catch (AssertionError e) {
            //
            // null
            //
        }
    }

    @Test
    public void test3() throws Throwable {
        OceanBaseProvider oceanBaseProvider0 = new OceanBaseProvider();
        OceanBaseGlobalState oceanBaseGlobalState0 = new OceanBaseGlobalState();
        try {
            oceanBaseProvider0.createDatabase(oceanBaseGlobalState0);
            fail("Expecting exception: NullPointerException");

        } catch (NullPointerException e) {
            //
            // no message in exception (getMessage() returned null)
            //
            verifyException("sqlancer.oceanbase.OceanBaseProvider", e);
        }
    }

    @Test
    public void test4() throws Throwable {
        OceanBaseGlobalState oceanBaseGlobalState0 = new OceanBaseGlobalState();
        OceanBaseProvider.Action oceanBaseProvider_Action0 = OceanBaseProvider.Action.SELECT_INFO;
        SQLQueryAdapter sQLQueryAdapter0 = oceanBaseProvider_Action0.getQuery(oceanBaseGlobalState0);
        assertEquals("select TABLE_NAME, ENGINE from information_schema.TABLES where table_schema = 'null';",
                sQLQueryAdapter0.getLogString());
    }

    @Test
    public void test5() throws Throwable {
        OceanBaseProvider oceanBaseProvider0 = new OceanBaseProvider();
        String string0 = oceanBaseProvider0.getDBMSName();
        assertEquals("oceanbase", string0);
    }
}
