/*
 * This file was automatically generated by EvoSuite
 * Sat Apr 12 03:07:06 GMT 2025
 */

package sqlancer.evosuite.sqlite3;

import static org.junit.jupiter.api.Assertions.*;
import java.util.LinkedList;
import java.util.List;
import java.util.regex.Pattern;
import org.junit.jupiter.api.Test;
import sqlancer.common.query.ExpectedErrors;
import sqlancer.sqlite3.SQLite3Errors;

public class SQLite3Errors_ESTest {

    private void verifyException(String s, Exception e) {
    }

    @Test
    public void test00() throws Throwable {
        List<String> list0 = SQLite3Errors.getMatchQueryErrors();
        LinkedList<Pattern> linkedList0 = new LinkedList<Pattern>();
        ExpectedErrors expectedErrors0 = new ExpectedErrors(list0, linkedList0);
        SQLite3Errors.addTableManipulationErrors(expectedErrors0);
    }

    @Test
    public void test01() throws Throwable {
        // Undeclared exception!
        try {
            SQLite3Errors.addInsertUpdateErrors((ExpectedErrors) null);
            fail("Expecting exception: NullPointerException");

        } catch (NullPointerException e) {
            //
            // no message in exception (getMessage() returned null)
            //
            verifyException("sqlancer.sqlite3.SQLite3Errors", e);
        }
    }

    @Test
    public void test02() throws Throwable {
        // Undeclared exception!
        try {
            SQLite3Errors.addInsertNowErrors((ExpectedErrors) null);
            fail("Expecting exception: NullPointerException");

        } catch (NullPointerException e) {
            //
            // no message in exception (getMessage() returned null)
            //
            verifyException("sqlancer.sqlite3.SQLite3Errors", e);
        }
    }

    @Test
    public void test03() throws Throwable {
        // Undeclared exception!
        try {
            SQLite3Errors.addExpectedExpressionErrors((ExpectedErrors) null);
            fail("Expecting exception: NullPointerException");

        } catch (NullPointerException e) {
            //
            // no message in exception (getMessage() returned null)
            //
            verifyException("sqlancer.sqlite3.SQLite3Errors", e);
        }
    }

    @Test
    public void test04() throws Throwable {
        List<String> list0 = SQLite3Errors.getQueryErrors();
        assertFalse(list0.isEmpty());
    }

    @Test
    public void test05() throws Throwable {
        List<String> list0 = SQLite3Errors.getExpectedExpressionErrors();
        assertFalse(list0.isEmpty());
    }

    @Test
    public void test06() throws Throwable {
        List<String> list0 = SQLite3Errors.getInsertUpdateErrors();
        assertFalse(list0.isEmpty());
    }

    @Test
    public void test07() throws Throwable {
        List<String> list0 = SQLite3Errors.getTableManipulationErrors();
        assertEquals(5, list0.size());
    }

    @Test
    public void test08() throws Throwable {
        ExpectedErrors expectedErrors0 = new ExpectedErrors();
        SQLite3Errors.addInsertUpdateErrors(expectedErrors0);
    }

    @Test
    public void test09() throws Throwable {
        ExpectedErrors expectedErrors0 = new ExpectedErrors();
        SQLite3Errors.addMatchQueryErrors(expectedErrors0);
    }

    @Test
    public void test10() throws Throwable {
        List<String> list0 = SQLite3Errors.getDeleteErrors();
        LinkedList<Pattern> linkedList0 = new LinkedList<Pattern>();
        ExpectedErrors expectedErrors0 = new ExpectedErrors(list0, linkedList0);
        SQLite3Errors.addDeleteErrors(expectedErrors0);
    }

    @Test
    public void test11() throws Throwable {
        List<String> list0 = SQLite3Errors.getInsertNowErrors();
        assertEquals(5, list0.size());
    }

    @Test
    public void test12() throws Throwable {
        ExpectedErrors expectedErrors0 = new ExpectedErrors();
        SQLite3Errors.addExpectedExpressionErrors(expectedErrors0);
    }

    @Test
    public void test13() throws Throwable {
        // Undeclared exception!
        try {
            SQLite3Errors.addTableManipulationErrors((ExpectedErrors) null);
            fail("Expecting exception: NullPointerException");

        } catch (NullPointerException e) {
            //
            // no message in exception (getMessage() returned null)
            //
            verifyException("sqlancer.sqlite3.SQLite3Errors", e);
        }
    }

    @Test
    public void test14() throws Throwable {
        List<String> list0 = SQLite3Errors.getMatchQueryErrors();
        LinkedList<Pattern> linkedList0 = new LinkedList<Pattern>();
        ExpectedErrors expectedErrors0 = new ExpectedErrors(list0, linkedList0);
        SQLite3Errors.addInsertNowErrors(expectedErrors0);
    }

    @Test
    public void test15() throws Throwable {
        String[] stringArray0 = new String[0];
        ExpectedErrors expectedErrors0 = ExpectedErrors.from(stringArray0);
        SQLite3Errors.addQueryErrors(expectedErrors0);
    }
}
