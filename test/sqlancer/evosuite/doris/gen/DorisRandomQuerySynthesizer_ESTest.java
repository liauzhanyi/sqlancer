/*
 * This file was automatically generated by EvoSuite
 * Fri Apr 11 16:35:36 GMT 2025
 */

package sqlancer.evosuite.doris.gen;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import sqlancer.doris.DorisProvider;
import sqlancer.doris.gen.DorisRandomQuerySynthesizer;

public class DorisRandomQuerySynthesizer_ESTest {

    private void verifyException(String s, Exception e) {
    }

    @Test
    public void test0() throws Throwable {
        // Undeclared exception!
        try {
            DorisRandomQuerySynthesizer.generateSelect((DorisProvider.DorisGlobalState) null, (-3292));
            fail("Expecting exception: NullPointerException");

        } catch (NullPointerException e) {
            //
            // no message in exception (getMessage() returned null)
            //
            verifyException("sqlancer.doris.gen.DorisRandomQuerySynthesizer", e);
        }
    }

    @Test
    public void test1() throws Throwable {
        DorisProvider.DorisGlobalState dorisProvider_DorisGlobalState0 = new DorisProvider.DorisGlobalState();
        // Undeclared exception!
        try {
            DorisRandomQuerySynthesizer.generateSelect(dorisProvider_DorisGlobalState0, (-488));
            fail("Expecting exception: AssertionError");

        } catch (AssertionError e) {
            //
            // null
            //
        }
    }
}
