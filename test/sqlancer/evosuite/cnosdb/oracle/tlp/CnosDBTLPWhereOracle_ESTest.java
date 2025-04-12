/*
 * This file was automatically generated by EvoSuite
 * Sat Apr 12 00:12:27 GMT 2025
 */

package sqlancer.evosuite.cnosdb.oracle.tlp;

import static org.junit.jupiter.api.Assertions.*;
import org.evosuite.runtime.Random;
import org.junit.jupiter.api.Test;
import sqlancer.cnosdb.ast.CnosDBSelect;
import sqlancer.cnosdb.CnosDBGlobalState;
import sqlancer.cnosdb.oracle.tlp.CnosDBTLPWhereOracle;

public class CnosDBTLPWhereOracle_ESTest {

    private void verifyException(String s, Exception e) {
    }

    @Test
    public void test0() throws Throwable {
        CnosDBGlobalState cnosDBGlobalState0 = new CnosDBGlobalState();
        CnosDBTLPWhereOracle cnosDBTLPWhereOracle0 = new CnosDBTLPWhereOracle(cnosDBGlobalState0);
        CnosDBSelect cnosDBSelect0 = new CnosDBSelect();
        cnosDBTLPWhereOracle0.select = cnosDBSelect0;
        try {
            cnosDBTLPWhereOracle0.whereCheck();
            fail("Expecting exception: IllegalStateException");

        } catch (IllegalStateException e) {
            //
            // no message in exception (getMessage() returned null)
            //
            verifyException("sqlancer.common.ast.SelectBase", e);
        }
    }

    @Test
    public void test1() throws Throwable {
        CnosDBGlobalState cnosDBGlobalState0 = new CnosDBGlobalState();
        CnosDBTLPWhereOracle cnosDBTLPWhereOracle0 = new CnosDBTLPWhereOracle(cnosDBGlobalState0);
        // Undeclared exception!
        try {
            cnosDBTLPWhereOracle0.check();
            fail("Expecting exception: AssertionError");

        } catch (AssertionError e) {
            //
            // null
            //
        }
    }

    @Test
    public void test2() throws Throwable {
        Random.setNextRandom(1341);
        CnosDBGlobalState cnosDBGlobalState0 = new CnosDBGlobalState();
        CnosDBTLPWhereOracle cnosDBTLPWhereOracle0 = new CnosDBTLPWhereOracle(cnosDBGlobalState0);
        try {
            cnosDBTLPWhereOracle0.whereCheck();
            fail("Expecting exception: NullPointerException");

        } catch (NullPointerException e) {
            //
            // no message in exception (getMessage() returned null)
            //
            verifyException("sqlancer.cnosdb.oracle.tlp.CnosDBTLPWhereOracle", e);
        }
    }

    @Test
    public void test3() throws Throwable {
        CnosDBGlobalState cnosDBGlobalState0 = new CnosDBGlobalState();
        CnosDBTLPWhereOracle cnosDBTLPWhereOracle0 = new CnosDBTLPWhereOracle(cnosDBGlobalState0);
        // Undeclared exception!
        try {
            cnosDBTLPWhereOracle0.whereCheck();
            fail("Expecting exception: AssertionError");

        } catch (AssertionError e) {
            //
            // null
            //
        }
    }

    @Test
    public void test4() throws Throwable {
        CnosDBTLPWhereOracle cnosDBTLPWhereOracle0 = new CnosDBTLPWhereOracle((CnosDBGlobalState) null);
        try {
            cnosDBTLPWhereOracle0.check();
            fail("Expecting exception: NullPointerException");

        } catch (NullPointerException e) {
            //
            // no message in exception (getMessage() returned null)
            //
            verifyException("sqlancer.cnosdb.oracle.tlp.CnosDBTLPBase", e);
        }
    }
}
