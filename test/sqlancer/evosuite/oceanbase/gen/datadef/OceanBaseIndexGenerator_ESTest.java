/*
 * This file was automatically generated by EvoSuite
 * Sat Apr 12 02:43:56 GMT 2025
 */

package sqlancer.evosuite.oceanbase.gen.datadef;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import sqlancer.oceanbase.gen.datadef.OceanBaseIndexGenerator;
import sqlancer.oceanbase.OceanBaseGlobalState;
import sqlancer.oceanbase.OceanBaseSchema;
import sqlancer.Randomly;

public class OceanBaseIndexGenerator_ESTest {

    private void verifyException(String s, Exception e) {
    }

    @Test
    public void test0() throws Throwable {
        OceanBaseGlobalState oceanBaseGlobalState0 = new OceanBaseGlobalState();
        // Undeclared exception!
        try {
            OceanBaseIndexGenerator.create(oceanBaseGlobalState0);
            fail("Expecting exception: AssertionError");

        } catch (AssertionError e) {
            //
            // null
            //
        }
    }

    @Test
    public void test1() throws Throwable {
        Randomly randomly0 = new Randomly();
        OceanBaseIndexGenerator oceanBaseIndexGenerator0 = new OceanBaseIndexGenerator((OceanBaseSchema) null,
                randomly0, (OceanBaseGlobalState) null);
        // Undeclared exception!
        try {
            oceanBaseIndexGenerator0.create();
            fail("Expecting exception: NullPointerException");

        } catch (NullPointerException e) {
            //
            // no message in exception (getMessage() returned null)
            //
            verifyException("sqlancer.oceanbase.gen.datadef.OceanBaseIndexGenerator", e);
        }
    }

    @Test
    public void test2() throws Throwable {
        OceanBaseGlobalState oceanBaseGlobalState0 = new OceanBaseGlobalState();
        Randomly randomly0 = new Randomly();
        OceanBaseIndexGenerator oceanBaseIndexGenerator0 = new OceanBaseIndexGenerator((OceanBaseSchema) null,
                randomly0, oceanBaseGlobalState0);
        // Undeclared exception!
        try {
            oceanBaseIndexGenerator0.create();
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
            OceanBaseIndexGenerator.create((OceanBaseGlobalState) null);
            fail("Expecting exception: NullPointerException");

        } catch (NullPointerException e) {
            //
            // no message in exception (getMessage() returned null)
            //
            verifyException("sqlancer.oceanbase.gen.datadef.OceanBaseIndexGenerator", e);
        }
    }

    @Test
    public void test4() throws Throwable {
        Randomly randomly0 = new Randomly();
        OceanBaseGlobalState oceanBaseGlobalState0 = new OceanBaseGlobalState();
        OceanBaseIndexGenerator oceanBaseIndexGenerator0 = new OceanBaseIndexGenerator((OceanBaseSchema) null,
                randomly0, oceanBaseGlobalState0);
        oceanBaseIndexGenerator0.setNewSchema((OceanBaseSchema) null);
    }
}
