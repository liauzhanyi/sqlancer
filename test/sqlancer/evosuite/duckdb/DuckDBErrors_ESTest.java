/*
 * This file was automatically generated by EvoSuite
 * Fri Apr 11 22:05:20 GMT 2025
 */

package sqlancer.evosuite.duckdb;

import static org.junit.jupiter.api.Assertions.*;
import java.util.LinkedList;
import java.util.List;
import java.util.regex.Pattern;
import org.junit.jupiter.api.Test;
import sqlancer.common.query.ExpectedErrors;
import sqlancer.duckdb.DuckDBErrors;

public class DuckDBErrors_ESTest {

    private void verifyException(String s, Exception e) {
    }

    @Test
    public void test0() throws Throwable {
        // Undeclared exception!
        try {
            DuckDBErrors.addInsertErrors((ExpectedErrors) null);
            fail("Expecting exception: NullPointerException");

        } catch (NullPointerException e) {
            //
            // no message in exception (getMessage() returned null)
            //
            verifyException("sqlancer.duckdb.DuckDBErrors", e);
        }
    }

    @Test
    public void test1() throws Throwable {
        // Undeclared exception!
        try {
            DuckDBErrors.addGroupByErrors((ExpectedErrors) null);
            fail("Expecting exception: NullPointerException");

        } catch (NullPointerException e) {
            //
            // no message in exception (getMessage() returned null)
            //
            verifyException("sqlancer.duckdb.DuckDBErrors", e);
        }
    }

    @Test
    public void test2() throws Throwable {
        // Undeclared exception!
        try {
            DuckDBErrors.addExpressionErrors((ExpectedErrors) null);
            fail("Expecting exception: NullPointerException");

        } catch (NullPointerException e) {
            //
            // no message in exception (getMessage() returned null)
            //
            verifyException("sqlancer.duckdb.DuckDBErrors", e);
        }
    }

    @Test
    public void test3() throws Throwable {
        List<Pattern> list0 = DuckDBErrors.getExpressionErrorsRegex();
        assertEquals(4, list0.size());
    }

    @Test
    public void test4() throws Throwable {
        List<String> list0 = DuckDBErrors.getExpressionErrors();
        LinkedList<Pattern> linkedList0 = new LinkedList<Pattern>();
        ExpectedErrors expectedErrors0 = new ExpectedErrors(list0, linkedList0);
        DuckDBErrors.addInsertErrors(expectedErrors0);
    }

    @Test
    public void test5() throws Throwable {
        List<String> list0 = DuckDBErrors.getExpressionErrors();
        LinkedList<Pattern> linkedList0 = new LinkedList<Pattern>();
        ExpectedErrors expectedErrors0 = new ExpectedErrors(list0, linkedList0);
        DuckDBErrors.addGroupByErrors(expectedErrors0);
    }

    @Test
    public void test6() throws Throwable {
        List<String> list0 = DuckDBErrors.getGroupByErrors();
        assertFalse(list0.isEmpty());
    }

    @Test
    public void test7() throws Throwable {
        List<String> list0 = DuckDBErrors.getExpressionErrors();
        LinkedList<Pattern> linkedList0 = new LinkedList<Pattern>();
        ExpectedErrors expectedErrors0 = new ExpectedErrors(list0, linkedList0);
        DuckDBErrors.addExpressionErrors(expectedErrors0);
    }

    @Test
    public void test8() throws Throwable {
        List<String> list0 = DuckDBErrors.getInsertErrors();
        assertEquals(32, list0.size());
    }
}
