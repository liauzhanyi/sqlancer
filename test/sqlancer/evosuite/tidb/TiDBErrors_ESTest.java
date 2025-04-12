/*
 * This file was automatically generated by EvoSuite
 * Fri Apr 11 22:28:41 GMT 2025
 */

package sqlancer.evosuite.tidb;

import static org.junit.jupiter.api.Assertions.*;
import java.util.List;

import org.junit.jupiter.api.Test;
import sqlancer.common.query.ExpectedErrors;
import sqlancer.tidb.TiDBErrors;

public class TiDBErrors_ESTest {

    private void verifyException(String s, Exception e) {
    }

    @Test
    public void test0() throws Throwable {
        String[] stringArray0 = new String[4];
        ExpectedErrors expectedErrors0 = ExpectedErrors.from(stringArray0);
        TiDBErrors.addExpressionHavingErrors(expectedErrors0);
    }

    @Test
    public void test1() throws Throwable {
        // Undeclared exception!
        try {
            TiDBErrors.addInsertErrors((ExpectedErrors) null);
            fail("Expecting exception: NullPointerException");

        } catch (NullPointerException e) {
            //
            // no message in exception (getMessage() returned null)
            //
            verifyException("sqlancer.tidb.TiDBErrors", e);
        }
    }

    @Test
    public void test2() throws Throwable {
        // Undeclared exception!
        try {
            TiDBErrors.addExpressionErrors((ExpectedErrors) null);
            fail("Expecting exception: NullPointerException");

        } catch (NullPointerException e) {
            //
            // no message in exception (getMessage() returned null)
            //
            verifyException("sqlancer.tidb.TiDBErrors", e);
        }
    }

    @Test
    public void test3() throws Throwable {
        List<String> list0 = TiDBErrors.getExpressionErrors();
        assertEquals(33, list0.size());
    }

    @Test
    public void test4() throws Throwable {
        List<String> list0 = TiDBErrors.getInsertErrors();
        assertEquals(20, list0.size());
    }

    @Test
    public void test5() throws Throwable {
        // Undeclared exception!
        try {
            TiDBErrors.addExpressionHavingErrors((ExpectedErrors) null);
            fail("Expecting exception: NullPointerException");

        } catch (NullPointerException e) {
            //
            // no message in exception (getMessage() returned null)
            //
            verifyException("sqlancer.tidb.TiDBErrors", e);
        }
    }

    @Test
    public void test6() throws Throwable {
        String[] stringArray0 = new String[9];
        ExpectedErrors expectedErrors0 = ExpectedErrors.from(stringArray0);
        TiDBErrors.addExpressionErrors(expectedErrors0);
    }

    @Test
    public void test7() throws Throwable {
        String[] stringArray0 = new String[9];
        ExpectedErrors expectedErrors0 = ExpectedErrors.from(stringArray0);
        TiDBErrors.addInsertErrors(expectedErrors0);
    }

    @Test
    public void test8() throws Throwable {
        List<String> list0 = TiDBErrors.getExpressionHavingErrors();
        assertFalse(list0.isEmpty());
    }
}
