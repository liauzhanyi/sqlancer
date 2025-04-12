/*
 * This file was automatically generated by EvoSuite
 * Fri Apr 11 21:04:47 GMT 2025
 */

package sqlancer.evosuite.tidb.gen;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import sqlancer.tidb.gen.TiDBIndexGenerator;
import sqlancer.tidb.TiDBProvider;

public class TiDBIndexGenerator_ESTest {

    private void verifyException(String s, Exception e) {
    }

    @Test
    public void test0() throws Throwable {
        // Undeclared exception!
        try {
            TiDBIndexGenerator.getQuery((TiDBProvider.TiDBGlobalState) null);
            fail("Expecting exception: NullPointerException");

        } catch (NullPointerException e) {
            //
            // no message in exception (getMessage() returned null)
            //
            verifyException("sqlancer.tidb.gen.TiDBIndexGenerator", e);
        }
    }

    @Test
    public void test1() throws Throwable {
        TiDBProvider.TiDBGlobalState tiDBProvider_TiDBGlobalState0 = new TiDBProvider.TiDBGlobalState();
        // Undeclared exception!
        try {
            TiDBIndexGenerator.getQuery(tiDBProvider_TiDBGlobalState0);
            fail("Expecting exception: AssertionError");

        } catch (AssertionError e) {
            //
            // null
            //
        }
    }
}
