/*
 * This file was automatically generated by EvoSuite
 * Fri Apr 11 22:19:04 GMT 2025
 */

package sqlancer.evosuite.hsqldb;

import static org.junit.jupiter.api.Assertions.*;
import java.util.List;
import org.junit.jupiter.api.Test;
import sqlancer.common.query.ExpectedErrors;
import sqlancer.hsqldb.HSQLDBErrors;

public class HSQLDBErrors_ESTest {

    private void verifyException(String s, Exception e) {
    }

    @Test
    public void test0() throws Throwable {
        ExpectedErrors expectedErrors0 = new ExpectedErrors();
        HSQLDBErrors.addInsertErrors(expectedErrors0);
    }

    @Test
    public void test1() throws Throwable {
        // Undeclared exception!
        try {
            HSQLDBErrors.addExpressionErrors((ExpectedErrors) null);
            fail("Expecting exception: NullPointerException");

        } catch (NullPointerException e) {
            //
            // no message in exception (getMessage() returned null)
            //
            verifyException("sqlancer.hsqldb.HSQLDBErrors", e);
        }
    }

    @Test
    public void test2() throws Throwable {
        List<String> list0 = HSQLDBErrors.getExpressionErrors();
        assertFalse(list0.isEmpty());
    }

    @Test
    public void test3() throws Throwable {
        List<String> list0 = HSQLDBErrors.getInsertErrors();
        assertEquals(7, list0.size());
    }

    @Test
    public void test4() throws Throwable {
        ExpectedErrors expectedErrors0 = new ExpectedErrors();
        HSQLDBErrors.addExpressionErrors(expectedErrors0);
    }

    @Test
    public void test5() throws Throwable {
        // Undeclared exception!
        try {
            HSQLDBErrors.addInsertErrors((ExpectedErrors) null);
            fail("Expecting exception: NullPointerException");

        } catch (NullPointerException e) {
            //
            // no message in exception (getMessage() returned null)
            //
            verifyException("sqlancer.hsqldb.HSQLDBErrors", e);
        }
    }
}
