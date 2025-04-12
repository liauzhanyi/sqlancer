/*
 * This file was automatically generated by EvoSuite
 * Fri Apr 11 23:12:18 GMT 2025
 */

package sqlancer.evosuite.yugabyte.ycql.gen;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import sqlancer.yugabyte.ycql.gen.YCQLUpdateGenerator;
import sqlancer.yugabyte.ycql.YCQLProvider;

public class YCQLUpdateGenerator_ESTest {

    private void verifyException(String s, Exception e) {
    }

    @Test
    public void test0() throws Throwable {
        YCQLProvider.YCQLGlobalState yCQLProvider_YCQLGlobalState0 = new YCQLProvider.YCQLGlobalState();
        // Undeclared exception!
        try {
            YCQLUpdateGenerator.getQuery(yCQLProvider_YCQLGlobalState0);
            fail("Expecting exception: AssertionError");

        } catch (AssertionError e) {
            //
            // null
            //
        }
    }

    @Test
    public void test1() throws Throwable {
        // Undeclared exception!
        try {
            YCQLUpdateGenerator.getQuery((YCQLProvider.YCQLGlobalState) null);
            fail("Expecting exception: NullPointerException");

        } catch (NullPointerException e) {
            //
            // no message in exception (getMessage() returned null)
            //
            verifyException("sqlancer.yugabyte.ycql.gen.YCQLUpdateGenerator", e);
        }
    }
}
