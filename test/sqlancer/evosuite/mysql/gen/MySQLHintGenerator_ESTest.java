/*
 * This file was automatically generated by EvoSuite
 * Fri Apr 11 19:18:05 GMT 2025
 */

package sqlancer.evosuite.mysql.gen;

import static org.junit.jupiter.api.Assertions.*;

import java.util.LinkedList;
import java.util.List;
import org.junit.jupiter.api.Test;
import sqlancer.mysql.ast.MySQLSelect;
import sqlancer.mysql.ast.MySQLText;
import sqlancer.mysql.gen.MySQLHintGenerator;
import sqlancer.mysql.MySQLSchema;

public class MySQLHintGenerator_ESTest {

    private void verifyException(String s, Exception e) {
    }

    @Test
    public void test0() throws Throwable {
        MySQLSelect mySQLSelect0 = new MySQLSelect();
        LinkedList<MySQLSchema.MySQLTable> linkedList0 = new LinkedList<MySQLSchema.MySQLTable>();
        LinkedList<MySQLSchema.MySQLColumn> linkedList1 = new LinkedList<MySQLSchema.MySQLColumn>();
        LinkedList<MySQLSchema.MySQLIndex> linkedList2 = new LinkedList<MySQLSchema.MySQLIndex>();
        MySQLSchema.MySQLTable.MySQLEngine mySQLSchema_MySQLTable_MySQLEngine0 = MySQLSchema.MySQLTable.MySQLEngine.ARCHIVE;
        MySQLSchema.MySQLTable mySQLSchema_MySQLTable0 = new MySQLSchema.MySQLTable("17m7XwoB&-sizREqN", linkedList1,
                linkedList2, mySQLSchema_MySQLTable_MySQLEngine0);
        linkedList0.add(mySQLSchema_MySQLTable0);
        MySQLHintGenerator.generateHints(mySQLSelect0, linkedList0);
        assertEquals(1, linkedList0.size());
    }

    @Test
    public void test1() throws Throwable {
        // Undeclared exception!
        try {
            MySQLHintGenerator.generateHints((MySQLSelect) null, (List<MySQLSchema.MySQLTable>) null);
            fail("Expecting exception: NullPointerException");

        } catch (NullPointerException e) {
            //
            // no message in exception (getMessage() returned null)
            //
            verifyException("sqlancer.Randomly", e);
        }
    }

    // @Test
    // public void test2() throws Throwable {
    // LinkedList<MySQLSchema.MySQLTable> linkedList0 = new LinkedList<MySQLSchema.MySQLTable>();
    // // Undeclared exception!
    // try {
    // MySQLHintGenerator.generateHints((MySQLSelect) null, linkedList0);
    // fail("Expecting exception: IndexOutOfBoundsException");
    //
    // } catch (IndexOutOfBoundsException e) {
    // //
    // // Index: 0, Size: 0
    // //
    // verifyException("java.util.LinkedList", e);
    // }
    // }

    @Test
    public void test3() throws Throwable {
        MySQLSelect mySQLSelect0 = new MySQLSelect();
        LinkedList<MySQLSchema.MySQLTable> linkedList0 = new LinkedList<MySQLSchema.MySQLTable>();
        // Undeclared exception!
        try {
            MySQLHintGenerator.generateAllHints(mySQLSelect0, linkedList0);
            fail("Expecting exception: AssertionError");

        } catch (AssertionError e) {
            //
            // [] 1
            //
        }
    }

    @Test
    public void test4() throws Throwable {
        MySQLSelect mySQLSelect0 = new MySQLSelect();
        LinkedList<MySQLSchema.MySQLTable> linkedList0 = new LinkedList<MySQLSchema.MySQLTable>();
        MySQLHintGenerator mySQLHintGenerator0 = new MySQLHintGenerator(mySQLSelect0, linkedList0);
    }

    @Test
    public void test5() throws Throwable {
        MySQLSelect mySQLSelect0 = new MySQLSelect();
        MySQLSchema.MySQLTable.MySQLEngine mySQLSchema_MySQLTable_MySQLEngine0 = MySQLSchema.MySQLTable.MySQLEngine.INNO_DB;
        LinkedList<MySQLSchema.MySQLColumn> linkedList0 = new LinkedList<MySQLSchema.MySQLColumn>();
        LinkedList<MySQLSchema.MySQLIndex> linkedList1 = new LinkedList<MySQLSchema.MySQLIndex>();
        MySQLSchema.MySQLTable mySQLSchema_MySQLTable0 = new MySQLSchema.MySQLTable("", linkedList0, linkedList1,
                mySQLSchema_MySQLTable_MySQLEngine0);
        linkedList1.add((MySQLSchema.MySQLIndex) null);
        List<MySQLSchema.MySQLTable> list0 = List.of(mySQLSchema_MySQLTable0, mySQLSchema_MySQLTable0,
                mySQLSchema_MySQLTable0, mySQLSchema_MySQLTable0, mySQLSchema_MySQLTable0, mySQLSchema_MySQLTable0,
                mySQLSchema_MySQLTable0, mySQLSchema_MySQLTable0, mySQLSchema_MySQLTable0);
        // Undeclared exception!
        try {
            MySQLHintGenerator.generateAllHints(mySQLSelect0, list0);
            fail("Expecting exception: NullPointerException");

        } catch (NullPointerException e) {
            //
            // no message in exception (getMessage() returned null)
            //
            verifyException("sqlancer.mysql.gen.MySQLHintGenerator", e);
        }
    }

    @Test
    public void test6() throws Throwable {
        MySQLSelect mySQLSelect0 = new MySQLSelect();
        LinkedList<MySQLSchema.MySQLTable> linkedList0 = new LinkedList<MySQLSchema.MySQLTable>();
        // Undeclared exception!
        try {
            MySQLHintGenerator.generateHints(mySQLSelect0, linkedList0);
            fail("Expecting exception: AssertionError");

        } catch (AssertionError e) {
            //
            // [] 1
            //
        }
    }

    @Test
    public void test7() throws Throwable {
        MySQLSelect mySQLSelect0 = new MySQLSelect();
        MySQLSchema.MySQLTable.MySQLEngine mySQLSchema_MySQLTable_MySQLEngine0 = MySQLSchema.MySQLTable.MySQLEngine.INNO_DB;
        LinkedList<MySQLSchema.MySQLColumn> linkedList0 = new LinkedList<MySQLSchema.MySQLColumn>();
        LinkedList<MySQLSchema.MySQLIndex> linkedList1 = new LinkedList<MySQLSchema.MySQLIndex>();
        MySQLSchema.MySQLTable mySQLSchema_MySQLTable0 = new MySQLSchema.MySQLTable("", linkedList0, linkedList1,
                mySQLSchema_MySQLTable_MySQLEngine0);
        List<MySQLSchema.MySQLTable> list0 = List.of(mySQLSchema_MySQLTable0, mySQLSchema_MySQLTable0,
                mySQLSchema_MySQLTable0, mySQLSchema_MySQLTable0, mySQLSchema_MySQLTable0, mySQLSchema_MySQLTable0,
                mySQLSchema_MySQLTable0, mySQLSchema_MySQLTable0, mySQLSchema_MySQLTable0);
        List<MySQLText> list1 = MySQLHintGenerator.generateAllHints(mySQLSelect0, list0);
        assertEquals(32, list1.size());
    }
}
