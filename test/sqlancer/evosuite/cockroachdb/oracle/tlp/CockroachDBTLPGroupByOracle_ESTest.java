/*
 * This file was automatically generated by EvoSuite
 * Fri Apr 11 13:45:10 GMT 2025
 */

package sqlancer.evosuite.cockroachdb.oracle.tlp;

import static org.junit.jupiter.api.Assertions.*;
import java.util.LinkedList;
import org.junit.jupiter.api.Test;
import sqlancer.cockroachdb.CockroachDBProvider;
import sqlancer.cockroachdb.CockroachDBSchema;
import sqlancer.cockroachdb.oracle.tlp.CockroachDBTLPGroupByOracle;

public class CockroachDBTLPGroupByOracle_ESTest {

    private void verifyException(String s, Exception e) {
    }

    @Test
    public void test0() throws Throwable {
        CockroachDBProvider.CockroachDBGlobalState cockroachDBProvider_CockroachDBGlobalState0 = new CockroachDBProvider.CockroachDBGlobalState();
        CockroachDBTLPGroupByOracle cockroachDBTLPGroupByOracle0 = new CockroachDBTLPGroupByOracle(
                cockroachDBProvider_CockroachDBGlobalState0);
        LinkedList<CockroachDBSchema.CockroachDBTable> linkedList0 = new LinkedList<CockroachDBSchema.CockroachDBTable>();
        CockroachDBSchema.CockroachDBTables cockroachDBSchema_CockroachDBTables0 = new CockroachDBSchema.CockroachDBTables(
                linkedList0);
        cockroachDBTLPGroupByOracle0.targetTables = cockroachDBSchema_CockroachDBTables0;
        // Undeclared exception!
        try {
            cockroachDBTLPGroupByOracle0.generateFetchColumns();
            fail("Expecting exception: AssertionError");

        } catch (AssertionError e) {
            //
            // [] 1
            //
        }
    }

    @Test
    public void test1() throws Throwable {
        CockroachDBProvider.CockroachDBGlobalState cockroachDBProvider_CockroachDBGlobalState0 = new CockroachDBProvider.CockroachDBGlobalState();
        CockroachDBTLPGroupByOracle cockroachDBTLPGroupByOracle0 = new CockroachDBTLPGroupByOracle(
                cockroachDBProvider_CockroachDBGlobalState0);
        // Undeclared exception!
        try {
            cockroachDBTLPGroupByOracle0.check();
            fail("Expecting exception: AssertionError");

        } catch (AssertionError e) {
            //
            // null
            //
        }
    }

    @Test
    public void test2() throws Throwable {
        CockroachDBProvider.CockroachDBGlobalState cockroachDBProvider_CockroachDBGlobalState0 = new CockroachDBProvider.CockroachDBGlobalState();
        CockroachDBTLPGroupByOracle cockroachDBTLPGroupByOracle0 = new CockroachDBTLPGroupByOracle(
                cockroachDBProvider_CockroachDBGlobalState0);
        String string0 = cockroachDBTLPGroupByOracle0.getLastQueryString();
        assertNull(string0);
    }

    @Test
    public void test3() throws Throwable {
        CockroachDBTLPGroupByOracle cockroachDBTLPGroupByOracle0 = new CockroachDBTLPGroupByOracle(
                (CockroachDBProvider.CockroachDBGlobalState) null);
        // Undeclared exception!
        try {
            cockroachDBTLPGroupByOracle0.check();
            fail("Expecting exception: NullPointerException");

        } catch (NullPointerException e) {
            //
            // no message in exception (getMessage() returned null)
            //
            verifyException("sqlancer.cockroachdb.oracle.tlp.CockroachDBTLPBase", e);
        }
    }

    @Test
    public void test4() throws Throwable {
        CockroachDBProvider.CockroachDBGlobalState cockroachDBProvider_CockroachDBGlobalState0 = new CockroachDBProvider.CockroachDBGlobalState();
        CockroachDBTLPGroupByOracle cockroachDBTLPGroupByOracle0 = new CockroachDBTLPGroupByOracle(
                cockroachDBProvider_CockroachDBGlobalState0);
        // Undeclared exception!
        try {
            cockroachDBTLPGroupByOracle0.generateFetchColumns();
            fail("Expecting exception: NullPointerException");

        } catch (NullPointerException e) {
            //
            // no message in exception (getMessage() returned null)
            //
            verifyException("sqlancer.cockroachdb.oracle.tlp.CockroachDBTLPGroupByOracle", e);
        }
    }
}
