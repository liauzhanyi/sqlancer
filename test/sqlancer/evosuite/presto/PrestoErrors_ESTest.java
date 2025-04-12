/*
 * This file was automatically generated by EvoSuite
 * Sat Apr 12 01:45:50 GMT 2025
 */

package sqlancer.evosuite.presto;

import static org.junit.jupiter.api.Assertions.*;
import java.util.List;
import org.junit.jupiter.api.Test;
import sqlancer.common.query.ExpectedErrors;
import sqlancer.presto.PrestoErrors;

public class PrestoErrors_ESTest {

    private void verifyException(String s, Exception e) {
    }

    @Test
    public void test0() throws Throwable {
        // Undeclared exception!
        try {
            PrestoErrors.addInsertErrors((ExpectedErrors) null);
            fail("Expecting exception: NullPointerException");

        } catch (NullPointerException e) {
            //
            // no message in exception (getMessage() returned null)
            //
            verifyException("sqlancer.presto.PrestoErrors", e);
        }
    }

    @Test
    public void test1() throws Throwable {
        // Undeclared exception!
        try {
            PrestoErrors.addGroupByErrors((ExpectedErrors) null);
            fail("Expecting exception: NullPointerException");

        } catch (NullPointerException e) {
            //
            // no message in exception (getMessage() returned null)
            //
            verifyException("sqlancer.presto.PrestoErrors", e);
        }
    }

    @Test
    public void test2() throws Throwable {
        // Undeclared exception!
        try {
            PrestoErrors.addExpressionErrors((ExpectedErrors) null);
            fail("Expecting exception: NullPointerException");

        } catch (NullPointerException e) {
            //
            // no message in exception (getMessage() returned null)
            //
            verifyException("sqlancer.presto.PrestoErrors", e);
        }
    }

    @Test
    public void test3() throws Throwable {
        List<String> list0 = PrestoErrors.getExpressionErrors();
        assertEquals(65, list0.size());
    }

    @Test
    public void test4() throws Throwable {
        List<String> list0 = PrestoErrors.getGroupByErrors();
        assertFalse(list0.isEmpty());
    }

    @Test
    public void test5() throws Throwable {
        ExpectedErrors expectedErrors0 = new ExpectedErrors();
        PrestoErrors.addInsertErrors(expectedErrors0);
    }

    @Test
    public void test6() throws Throwable {
        ExpectedErrors expectedErrors0 = new ExpectedErrors();
        PrestoErrors.addGroupByErrors(expectedErrors0);
    }

    @Test
    public void test7() throws Throwable {
        ExpectedErrors expectedErrors0 = new ExpectedErrors();
        PrestoErrors.addExpressionErrors(expectedErrors0);
    }

    @Test
    public void test8() throws Throwable {
        List<String> list0 = PrestoErrors.getInsertErrors();
        assertEquals(92, list0.size());
    }
}
