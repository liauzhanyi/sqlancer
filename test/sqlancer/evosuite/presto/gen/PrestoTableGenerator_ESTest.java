/*
 * This file was automatically generated by EvoSuite
 * Fri Apr 11 18:58:44 GMT 2025
 */

package sqlancer.evosuite.presto.gen;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import sqlancer.presto.gen.PrestoTableGenerator;
import sqlancer.presto.PrestoGlobalState;

public class PrestoTableGenerator_ESTest {

    private void verifyException(String s, Exception e) {
    }

    @Test
    public void test0() throws Throwable {
        PrestoTableGenerator prestoTableGenerator0 = new PrestoTableGenerator();
        // Undeclared exception!
        try {
            prestoTableGenerator0.getQuery((PrestoGlobalState) null);
            fail("Expecting exception: NullPointerException");

        } catch (NullPointerException e) {
            //
            // no message in exception (getMessage() returned null)
            //
            verifyException("sqlancer.presto.gen.PrestoTableGenerator", e);
        }
    }

    @Test
    public void test1() throws Throwable {
        PrestoTableGenerator prestoTableGenerator0 = new PrestoTableGenerator();
        PrestoGlobalState prestoGlobalState0 = new PrestoGlobalState();
        // Undeclared exception!
        try {
            prestoTableGenerator0.getQuery(prestoGlobalState0);
            fail("Expecting exception: AssertionError");

        } catch (AssertionError e) {
            //
            // null
            //
        }
    }
}
