/*
 * This file was automatically generated by EvoSuite
 * Fri Apr 11 17:42:43 GMT 2025
 */

package sqlancer.evosuite.doris.oracle.tlp;

import static org.junit.jupiter.api.Assertions.*;

import java.util.LinkedList;
import org.junit.jupiter.api.Test;
import sqlancer.doris.DorisProvider;
import sqlancer.doris.DorisSchema;
import sqlancer.doris.oracle.tlp.DorisQueryPartitioningGroupByTester;

public class DorisQueryPartitioningGroupByTester_ESTest {

    private void verifyException(String s, Exception e) {
    }

    @Test
    public void test0() throws Throwable {
        DorisQueryPartitioningGroupByTester dorisQueryPartitioningGroupByTester0 = new DorisQueryPartitioningGroupByTester(
                (DorisProvider.DorisGlobalState) null);
        LinkedList<DorisSchema.DorisTable> linkedList0 = new LinkedList<DorisSchema.DorisTable>();
        DorisSchema.DorisTables dorisSchema_DorisTables0 = new DorisSchema.DorisTables(linkedList0);
        dorisQueryPartitioningGroupByTester0.targetTables = dorisSchema_DorisTables0;
        // Undeclared exception!
        try {
            dorisQueryPartitioningGroupByTester0.generateFetchColumns();
            fail("Expecting exception: AssertionError");

        } catch (AssertionError e) {
            //
            // [] 1
            //
        }
    }

    @Test
    public void test1() throws Throwable {
        DorisProvider.DorisGlobalState dorisProvider_DorisGlobalState0 = new DorisProvider.DorisGlobalState();
        DorisQueryPartitioningGroupByTester dorisQueryPartitioningGroupByTester0 = new DorisQueryPartitioningGroupByTester(
                dorisProvider_DorisGlobalState0);
        // Undeclared exception!
        try {
            dorisQueryPartitioningGroupByTester0.check();
            fail("Expecting exception: AssertionError");

        } catch (AssertionError e) {
            //
            // null
            //
        }
    }

    @Test
    public void test2() throws Throwable {
        DorisProvider.DorisGlobalState dorisProvider_DorisGlobalState0 = new DorisProvider.DorisGlobalState();
        DorisQueryPartitioningGroupByTester dorisQueryPartitioningGroupByTester0 = new DorisQueryPartitioningGroupByTester(
                dorisProvider_DorisGlobalState0);
        // Undeclared exception!
        try {
            dorisQueryPartitioningGroupByTester0.generateFetchColumns();
            fail("Expecting exception: NullPointerException");

        } catch (NullPointerException e) {
            //
            // no message in exception (getMessage() returned null)
            //
            verifyException("sqlancer.doris.oracle.tlp.DorisQueryPartitioningGroupByTester", e);
        }
    }

    @Test
    public void test3() throws Throwable {
        DorisQueryPartitioningGroupByTester dorisQueryPartitioningGroupByTester0 = new DorisQueryPartitioningGroupByTester(
                (DorisProvider.DorisGlobalState) null);
        // Undeclared exception!
        try {
            dorisQueryPartitioningGroupByTester0.check();
            fail("Expecting exception: NullPointerException");

        } catch (NullPointerException e) {
            //
            // no message in exception (getMessage() returned null)
            //
            verifyException("sqlancer.doris.oracle.tlp.DorisQueryPartitioningBase", e);
        }
    }
}
