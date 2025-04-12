/*
 * This file was automatically generated by EvoSuite
 * Sat Apr 12 02:34:41 GMT 2025
 */

package sqlancer.evosuite.presto.gen;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import sqlancer.presto.gen.PrestoDeleteGenerator;
import sqlancer.presto.PrestoGlobalState;

public class PrestoDeleteGenerator_ESTest {

    private void verifyException(String s, Exception e) {
    }

    @Test
    public void test0() throws Throwable {
        // Undeclared exception!
        try {
            PrestoDeleteGenerator.generate((PrestoGlobalState) null);
            fail("Expecting exception: NullPointerException");

        } catch (NullPointerException e) {
            //
            // no message in exception (getMessage() returned null)
            //
            verifyException("sqlancer.presto.gen.PrestoDeleteGenerator", e);
        }
    }

    @Test
    public void test1() throws Throwable {
        PrestoGlobalState prestoGlobalState0 = new PrestoGlobalState();
        // Undeclared exception!
        try {
            PrestoDeleteGenerator.generate(prestoGlobalState0);
            fail("Expecting exception: AssertionError");

        } catch (AssertionError e) {
            //
            // null
            //
        }
    }
}
