/*
 * This file was automatically generated by EvoSuite
 * Fri Apr 11 19:14:25 GMT 2025
 */

package sqlancer.evosuite.mysql.ast;

import static org.junit.jupiter.api.Assertions.*;
import java.util.List;
import org.junit.jupiter.api.Test;
import sqlancer.mysql.ast.MySQLConstant;
import sqlancer.mysql.ast.MySQLExpression;
import sqlancer.mysql.ast.MySQLJoin;
import sqlancer.mysql.ast.MySQLSelect;
import sqlancer.mysql.ast.MySQLText;
import sqlancer.Randomly;

public class MySQLSelect_ESTest {

    private void verifyException(String s, Exception e) {
    }

    @Test
    public void test00() throws Throwable {
        MySQLSelect mySQLSelect0 = new MySQLSelect();
        mySQLSelect0.setModifiers((List<String>) null);
        List<String> list0 = mySQLSelect0.getModifiers();
        assertNull(list0);
    }

    @Test
    public void test01() throws Throwable {
        MySQLSelect mySQLSelect0 = new MySQLSelect();
        String[] stringArray0 = new String[26];
        List<String> list0 = Randomly.subset(0, stringArray0);
        mySQLSelect0.setModifiers(list0);
        List<String> list1 = mySQLSelect0.getModifiers();
        assertSame(list1, list0);
    }

    @Test
    public void test02() throws Throwable {
        MySQLSelect mySQLSelect0 = new MySQLSelect();
        MySQLText mySQLText0 = new MySQLText("");
        mySQLSelect0.setHint(mySQLText0);
        MySQLText mySQLText1 = mySQLSelect0.getHint();
        assertEquals("", mySQLText1.getText());
    }

    @Test
    public void test03() throws Throwable {
        MySQLSelect mySQLSelect0 = new MySQLSelect();
        // Undeclared exception!
        try {
            mySQLSelect0.setJoinClauses((List<MySQLJoin>) null);
            fail("Expecting exception: NullPointerException");

        } catch (NullPointerException e) {
            //
            // no message in exception (getMessage() returned null)
            //
            verifyException("sqlancer.mysql.ast.MySQLSelect", e);
        }
    }

    @Test
    public void test04() throws Throwable {
        MySQLSelect mySQLSelect0 = new MySQLSelect();
        mySQLSelect0.setJoinList((List<MySQLExpression>) null);
        // Undeclared exception!
        try {
            mySQLSelect0.getJoinClauses();
            fail("Expecting exception: NullPointerException");

        } catch (NullPointerException e) {
            //
            // no message in exception (getMessage() returned null)
            //
            verifyException("sqlancer.mysql.ast.MySQLSelect", e);
        }
    }

    @Test
    public void test05() throws Throwable {
        MySQLSelect mySQLSelect0 = new MySQLSelect();
        List<MySQLExpression> list0 = List.of((MySQLExpression) mySQLSelect0, (MySQLExpression) mySQLSelect0);
        mySQLSelect0.setJoinList(list0);
        // Undeclared exception!
        try {
            mySQLSelect0.getJoinClauses();
            fail("Expecting exception: ClassCastException");

        } catch (ClassCastException e) {
            //
            // class sqlancer.mysql.ast.MySQLSelect cannot be cast to class sqlancer.mysql.ast.MySQLJoin
            // (sqlancer.mysql.ast.MySQLSelect and sqlancer.mysql.ast.MySQLJoin are in unnamed module of loader
            // org.evosuite.instrumentation.InstrumentingClassLoader @5718d20e)
            //
            verifyException("sqlancer.mysql.ast.MySQLSelect", e);
        }
    }

    @Test
    public void test06() throws Throwable {
        MySQLSelect mySQLSelect0 = new MySQLSelect();
        List<MySQLExpression> list0 = List.of((MySQLExpression) mySQLSelect0);
        mySQLSelect0.setFetchColumns(list0);
        // Undeclared exception!
        try {
            mySQLSelect0.asString();
            fail("Expecting exception: StackOverflowError");

        } catch (StackOverflowError e) {
            //
            // no message in exception (getMessage() returned null)
            //
        }
    }

    @Test
    public void test07() throws Throwable {
        MySQLSelect mySQLSelect0 = new MySQLSelect();
        mySQLSelect0.setModifiers((List<String>) null);
        // Undeclared exception!
        try {
            mySQLSelect0.asString();
            fail("Expecting exception: NullPointerException");

        } catch (NullPointerException e) {
            //
            // no message in exception (getMessage() returned null)
            //
            verifyException("sqlancer.mysql.MySQLToStringVisitor", e);
        }
    }

    @Test
    public void test08() throws Throwable {
        MySQLSelect mySQLSelect0 = new MySQLSelect();
        MySQLExpression[] mySQLExpressionArray0 = new MySQLExpression[16];
        List<MySQLExpression> list0 = Randomly.nonEmptySubset(mySQLExpressionArray0);
        mySQLSelect0.setFetchColumns(list0);
        // Undeclared exception!
        try {
            mySQLSelect0.asString();
            fail("Expecting exception: AssertionError");

        } catch (AssertionError e) {
            //
            // null
            //
        }
    }

    @Test
    public void test09() throws Throwable {
        MySQLSelect mySQLSelect0 = new MySQLSelect();
        MySQLSelect.SelectType mySQLSelect_SelectType0 = mySQLSelect0.getFromOptions();
        assertEquals(MySQLSelect.SelectType.ALL, mySQLSelect_SelectType0);
    }

    @Test
    public void test10() throws Throwable {
        MySQLSelect mySQLSelect0 = new MySQLSelect();
        MySQLText mySQLText0 = mySQLSelect0.getHint();
        assertNull(mySQLText0);
    }

    @Test
    public void test11() throws Throwable {
        MySQLSelect mySQLSelect0 = new MySQLSelect();
        String[] stringArray0 = new String[1];
        List<String> list0 = Randomly.nonEmptySubset(stringArray0);
        mySQLSelect0.setModifiers(list0);
        List<String> list1 = mySQLSelect0.getModifiers();
        assertFalse(list1.isEmpty());
    }

    @Test
    public void test12() throws Throwable {
        MySQLSelect mySQLSelect0 = new MySQLSelect();
        List<MySQLJoin> list0 = mySQLSelect0.getJoinClauses();
        assertEquals(0, list0.size());
    }

    @Test
    public void test13() throws Throwable {
        MySQLSelect mySQLSelect0 = new MySQLSelect();
        MySQLSelect.SelectType mySQLSelect_SelectType0 = MySQLSelect.SelectType.ALL;
        mySQLSelect0.setSelectType(mySQLSelect_SelectType0);
        assertEquals(MySQLSelect.SelectType.ALL, mySQLSelect0.getFromOptions());
    }

    @Test
    public void test14() throws Throwable {
        MySQLSelect mySQLSelect0 = new MySQLSelect();
        MySQLSelect.SelectType mySQLSelect_SelectType0 = MySQLSelect.SelectType.DISTINCT;
        mySQLSelect0.setFromOptions(mySQLSelect_SelectType0);
        assertEquals(MySQLSelect.SelectType.DISTINCT, mySQLSelect0.getFromOptions());
    }

    @Test
    public void test15() throws Throwable {
        MySQLSelect mySQLSelect0 = new MySQLSelect();
        MySQLConstant mySQLConstant0 = mySQLSelect0.getExpectedValue();
        assertNull(mySQLConstant0);
    }

    @Test
    public void test16() throws Throwable {
        MySQLSelect mySQLSelect0 = new MySQLSelect();
        MySQLJoin[] mySQLJoinArray0 = new MySQLJoin[2];
        List<MySQLJoin> list0 = Randomly.nonEmptySubset(mySQLJoinArray0);
        mySQLSelect0.setJoinClauses(list0);
        List<MySQLJoin> list1 = mySQLSelect0.getJoinClauses();
        assertTrue(list1.equals((Object) list0));
    }

    @Test
    public void test17() throws Throwable {
        MySQLSelect mySQLSelect0 = new MySQLSelect();
        // Undeclared exception!
        try {
            mySQLSelect0.asString();
            fail("Expecting exception: IllegalStateException");

        } catch (IllegalStateException e) {
            //
            // no message in exception (getMessage() returned null)
            //
            verifyException("sqlancer.common.ast.SelectBase", e);
        }
    }
}
