/*
 * This file was automatically generated by EvoSuite
 * Fri Apr 11 14:25:55 GMT 2025
 */

package sqlancer.evosuite.cockroachdb.gen;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import sqlancer.cockroachdb.CockroachDBProvider;
import sqlancer.cockroachdb.gen.CockroachDBRandomQuerySynthesizer;

public class CockroachDBRandomQuerySynthesizer_ESTest {

    private void verifyException(String s, Exception e) {
    }

    @Test
    public void test0() throws Throwable {
        // Undeclared exception!
        try {
            CockroachDBRandomQuerySynthesizer.generateSelect((CockroachDBProvider.CockroachDBGlobalState) null, 0);
            fail("Expecting exception: NullPointerException");

        } catch (NullPointerException e) {
            //
            // no message in exception (getMessage() returned null)
            //
            verifyException("sqlancer.cockroachdb.gen.CockroachDBRandomQuerySynthesizer", e);
        }
    }

    @Test
    public void test1() throws Throwable {
        CockroachDBProvider.CockroachDBGlobalState cockroachDBProvider_CockroachDBGlobalState0 = new CockroachDBProvider.CockroachDBGlobalState();
        // Undeclared exception!
        try {
            CockroachDBRandomQuerySynthesizer.generateSelect(cockroachDBProvider_CockroachDBGlobalState0, (-1328));
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
        // Undeclared exception!
        try {
            CockroachDBRandomQuerySynthesizer.generate(cockroachDBProvider_CockroachDBGlobalState0, (-1328));
            fail("Expecting exception: AssertionError");

        } catch (AssertionError e) {
            //
            // null
            //
        }
    }

    @Test
    public void test3() throws Throwable {
        // Undeclared exception!
        try {
            CockroachDBRandomQuerySynthesizer.generate((CockroachDBProvider.CockroachDBGlobalState) null, 0);
            fail("Expecting exception: NullPointerException");

        } catch (NullPointerException e) {
            //
            // no message in exception (getMessage() returned null)
            //
            verifyException("sqlancer.cockroachdb.gen.CockroachDBRandomQuerySynthesizer", e);
        }
    }
}
