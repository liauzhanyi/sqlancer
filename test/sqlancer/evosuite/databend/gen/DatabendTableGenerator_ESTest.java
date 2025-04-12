/*
 * This file was automatically generated by EvoSuite
 * Fri Apr 11 16:19:36 GMT 2025
 */

package sqlancer.evosuite.databend.gen;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import sqlancer.databend.DatabendProvider;
import sqlancer.databend.gen.DatabendTableGenerator;

public class DatabendTableGenerator_ESTest {

    private void verifyException(String s, Exception e) {
    }

    @Test
    public void test0() throws Throwable {
        DatabendTableGenerator databendTableGenerator0 = new DatabendTableGenerator();
        // Undeclared exception!
        try {
            databendTableGenerator0.getQuery((DatabendProvider.DatabendGlobalState) null);
            fail("Expecting exception: NullPointerException");

        } catch (NullPointerException e) {
            //
            // no message in exception (getMessage() returned null)
            //
            verifyException("sqlancer.databend.gen.DatabendTableGenerator", e);
        }
    }

    @Test
    public void test1() throws Throwable {
        DatabendTableGenerator databendTableGenerator0 = new DatabendTableGenerator();
        DatabendProvider.DatabendGlobalState databendProvider_DatabendGlobalState0 = new DatabendProvider.DatabendGlobalState();
        // Undeclared exception!
        try {
            databendTableGenerator0.getQuery(databendProvider_DatabendGlobalState0);
            fail("Expecting exception: AssertionError");

        } catch (AssertionError e) {
            //
            // null
            //
        }
    }
}
