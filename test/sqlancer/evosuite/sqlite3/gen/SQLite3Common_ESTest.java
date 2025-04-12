/*
 * This file was automatically generated by EvoSuite
 * Fri Apr 11 17:08:23 GMT 2025
 */

package sqlancer.evosuite.sqlite3.gen;

import static org.junit.jupiter.api.Assertions.*;
import java.util.LinkedList;
import java.util.List;
import org.junit.jupiter.api.Test;
import sqlancer.Randomly;
import sqlancer.sqlite3.ast.SQLite3Expression;
import sqlancer.sqlite3.gen.SQLite3Common;
import sqlancer.sqlite3.schema.SQLite3Schema;
import sqlancer.sqlite3.SQLite3GlobalState;

public class SQLite3Common_ESTest {

    private void verifyException(String s, Exception e) {
    }

    @Test
    public void test00() throws Throwable {
        SQLite3Schema.SQLite3Column[] sQLite3Schema_SQLite3ColumnArray0 = new SQLite3Schema.SQLite3Column[2];
        SQLite3Schema.SQLite3Column sQLite3Schema_SQLite3Column0 = SQLite3Common.createColumn((-1));
        assertEquals("c-1", sQLite3Schema_SQLite3Column0.getName());
        assertFalse(sQLite3Schema_SQLite3Column0.isPrimaryKey());

        sQLite3Schema_SQLite3ColumnArray0[0] = sQLite3Schema_SQLite3Column0;
        List<SQLite3Schema.SQLite3Column> list0 = Randomly.subset(1, sQLite3Schema_SQLite3ColumnArray0);
        SQLite3Schema.SQLite3Table.TableKind sQLite3Schema_SQLite3Table_TableKind0 = SQLite3Schema.SQLite3Table.TableKind.MAIN;
        SQLite3Schema.SQLite3Table sQLite3Schema_SQLite3Table0 = new SQLite3Schema.SQLite3Table("N", list0,
                sQLite3Schema_SQLite3Table_TableKind0, true, true, false, true);
        String string0 = SQLite3Common.getFreeColumnName(sQLite3Schema_SQLite3Table0);
        assertEquals("c0", string0);
    }

    @Test
    public void test01() throws Throwable {
        LinkedList<SQLite3Schema.SQLite3Table> linkedList0 = new LinkedList<SQLite3Schema.SQLite3Table>();
        SQLite3Schema.SQLite3Column[] sQLite3Schema_SQLite3ColumnArray0 = new SQLite3Schema.SQLite3Column[0];
        List<SQLite3Schema.SQLite3Column> list0 = Randomly.subset(sQLite3Schema_SQLite3ColumnArray0);
        SQLite3Schema.SQLite3Table.TableKind sQLite3Schema_SQLite3Table_TableKind0 = SQLite3Schema.SQLite3Table.TableKind.TEMP;
        SQLite3Schema.SQLite3Table sQLite3Schema_SQLite3Table0 = new SQLite3Schema.SQLite3Table(" COLLATE RTRIM", list0,
                sQLite3Schema_SQLite3Table_TableKind0, false, false, false, false);
        linkedList0.add(sQLite3Schema_SQLite3Table0);
        LinkedList<String> linkedList1 = new LinkedList<String>();
        SQLite3Schema sQLite3Schema0 = new SQLite3Schema(linkedList0, linkedList1);
        String string0 = SQLite3Common.getFreeViewName(sQLite3Schema0);
        assertEquals("v0", string0);
    }

    @Test
    public void test02() throws Throwable {
        LinkedList<SQLite3Schema.SQLite3Column> linkedList0 = new LinkedList<SQLite3Schema.SQLite3Column>();
        LinkedList<String> linkedList1 = new LinkedList<String>();
        SQLite3Schema.SQLite3Table.TableKind sQLite3Schema_SQLite3Table_TableKind0 = SQLite3Schema.SQLite3Table.TableKind.MAIN;
        SQLite3Schema.SQLite3Table sQLite3Schema_SQLite3Table0 = new SQLite3Schema.SQLite3Table("s;q92D", linkedList0,
                sQLite3Schema_SQLite3Table_TableKind0, true, false, false, true);
        List<SQLite3Schema.SQLite3Table> list0 = List.of(sQLite3Schema_SQLite3Table0, sQLite3Schema_SQLite3Table0,
                sQLite3Schema_SQLite3Table0, sQLite3Schema_SQLite3Table0);
        SQLite3Schema sQLite3Schema0 = new SQLite3Schema(list0, linkedList1);
        String string0 = SQLite3Common.getFreeTableName(sQLite3Schema0);
        assertEquals("t0", string0);
    }

    @Test
    public void test03() throws Throwable {
        SQLite3Schema.SQLite3Column[] sQLite3Schema_SQLite3ColumnArray0 = new SQLite3Schema.SQLite3Column[1];
        List<SQLite3Schema.SQLite3Column> list0 = Randomly.subset(sQLite3Schema_SQLite3ColumnArray0);
        SQLite3GlobalState sQLite3GlobalState0 = new SQLite3GlobalState();
        // Undeclared exception!
        try {
            SQLite3Common.getOrderingTerm(list0, sQLite3GlobalState0);
            fail("Expecting exception: NullPointerException");

        } catch (NullPointerException e) {
            //
            // no message in exception (getMessage() returned null)
            //
            verifyException("sqlancer.sqlite3.gen.SQLite3ExpressionGenerator", e);
        }
    }

    @Test
    public void test04() throws Throwable {
        SQLite3Schema.SQLite3Column[] sQLite3Schema_SQLite3ColumnArray0 = new SQLite3Schema.SQLite3Column[17];
        List<SQLite3Schema.SQLite3Column> list0 = Randomly.subset(sQLite3Schema_SQLite3ColumnArray0);
        SQLite3GlobalState sQLite3GlobalState0 = new SQLite3GlobalState();
        // Undeclared exception!
        try {
            SQLite3Common.getCheckConstraint(sQLite3GlobalState0, list0);
            fail("Expecting exception: NullPointerException");

        } catch (NullPointerException e) {
            //
            // no message in exception (getMessage() returned null)
            //
            verifyException("sqlancer.sqlite3.gen.SQLite3ExpressionGenerator", e);
        }
    }

    @Test
    public void test05() throws Throwable {
        LinkedList<SQLite3Schema.SQLite3Table> linkedList0 = new LinkedList<SQLite3Schema.SQLite3Table>();
        List<SQLite3Expression> list0 = SQLite3Common.getTableRefs(linkedList0, (SQLite3Schema) null);
        assertTrue(list0.isEmpty());
    }

    @Test
    public void test06() throws Throwable {
        LinkedList<SQLite3Schema.SQLite3Table> linkedList0 = new LinkedList<SQLite3Schema.SQLite3Table>();
        LinkedList<String> linkedList1 = new LinkedList<String>();
        SQLite3Schema sQLite3Schema0 = new SQLite3Schema(linkedList0, linkedList1);
        // Undeclared exception!
        try {
            SQLite3Common.getTableRefs((List<SQLite3Schema.SQLite3Table>) null, sQLite3Schema0);
            fail("Expecting exception: NullPointerException");

        } catch (NullPointerException e) {
            //
            // no message in exception (getMessage() returned null)
            //
            verifyException("sqlancer.sqlite3.gen.SQLite3Common", e);
        }
    }

    @Test
    public void test07() throws Throwable {
        // Undeclared exception!
        try {
            SQLite3Common.getFreeViewName((SQLite3Schema) null);
            fail("Expecting exception: NullPointerException");

        } catch (NullPointerException e) {
            //
            // no message in exception (getMessage() returned null)
            //
            verifyException("sqlancer.sqlite3.gen.SQLite3Common", e);
        }
    }

    @Test
    public void test08() throws Throwable {
        // Undeclared exception!
        try {
            SQLite3Common.getFreeTableName((SQLite3Schema) null);
            fail("Expecting exception: NullPointerException");

        } catch (NullPointerException e) {
            //
            // no message in exception (getMessage() returned null)
            //
            verifyException("sqlancer.sqlite3.gen.SQLite3Common", e);
        }
    }

    @Test
    public void test09() throws Throwable {
        // Undeclared exception!
        try {
            SQLite3Common.getFreeIndexName((SQLite3Schema) null);
            fail("Expecting exception: NullPointerException");

        } catch (NullPointerException e) {
            //
            // no message in exception (getMessage() returned null)
            //
            verifyException("sqlancer.sqlite3.gen.SQLite3Common", e);
        }
    }

    @Test
    public void test10() throws Throwable {
        // Undeclared exception!
        try {
            SQLite3Common.getFreeColumnName((SQLite3Schema.SQLite3Table) null);
            fail("Expecting exception: NullPointerException");

        } catch (NullPointerException e) {
            //
            // no message in exception (getMessage() returned null)
            //
            verifyException("sqlancer.sqlite3.gen.SQLite3Common", e);
        }
    }

    @Test
    public void test11() throws Throwable {
        LinkedList<SQLite3Schema.SQLite3Table> linkedList0 = new LinkedList<SQLite3Schema.SQLite3Table>();
        linkedList0.add((SQLite3Schema.SQLite3Table) null);
        List<String> list0 = SQLite3Schema.ROWID_STRINGS;
        SQLite3Schema sQLite3Schema0 = new SQLite3Schema(linkedList0, list0);
        String string0 = SQLite3Common.getFreeIndexName(sQLite3Schema0);
        assertEquals("i0", string0);

        List<SQLite3Expression> list1 = SQLite3Common.getTableRefs(linkedList0, sQLite3Schema0);
        assertFalse(list1.isEmpty());
    }

    @Test
    public void test12() throws Throwable {
        LinkedList<SQLite3Schema.SQLite3Table> linkedList0 = new LinkedList<SQLite3Schema.SQLite3Table>();
        linkedList0.add((SQLite3Schema.SQLite3Table) null);
        LinkedList<String> linkedList1 = new LinkedList<String>();
        SQLite3Schema sQLite3Schema0 = new SQLite3Schema(linkedList0, linkedList1);
        String string0 = SQLite3Common.getFreeIndexName(sQLite3Schema0);
        assertEquals("i0", string0);

        List<SQLite3Expression> list0 = SQLite3Common.getTableRefs(linkedList0, sQLite3Schema0);
        assertEquals(1, list0.size());
    }

    @Test
    public void test13() throws Throwable {
        LinkedList<SQLite3Schema.SQLite3Table> linkedList0 = new LinkedList<SQLite3Schema.SQLite3Table>();
        linkedList0.add((SQLite3Schema.SQLite3Table) null);
        LinkedList<String> linkedList1 = new LinkedList<String>();
        SQLite3Schema sQLite3Schema0 = new SQLite3Schema(linkedList0, linkedList1);
        List<SQLite3Expression> list0 = SQLite3Common.getTableRefs(linkedList0, sQLite3Schema0);
        assertEquals(1, list0.size());
    }

    @Test
    public void test14() throws Throwable {
        LinkedList<SQLite3Schema.SQLite3Column> linkedList0 = new LinkedList<SQLite3Schema.SQLite3Column>();
        SQLite3GlobalState sQLite3GlobalState0 = new SQLite3GlobalState();
        // Undeclared exception!
        try {
            SQLite3Common.getOrderBy(linkedList0, sQLite3GlobalState0);
            fail("Expecting exception: NullPointerException");

        } catch (NullPointerException e) {
            //
            // no message in exception (getMessage() returned null)
            //
            verifyException("sqlancer.sqlite3.gen.SQLite3ExpressionGenerator", e);
        }
    }

    @Test
    public void test15() throws Throwable {
        SQLite3GlobalState sQLite3GlobalState0 = new SQLite3GlobalState();
        LinkedList<SQLite3Schema.SQLite3Column> linkedList0 = new LinkedList<SQLite3Schema.SQLite3Column>();
        // Undeclared exception!
        try {
            SQLite3Common.getOrderByAsString(linkedList0, sQLite3GlobalState0);
            fail("Expecting exception: NullPointerException");

        } catch (NullPointerException e) {
            //
            // no message in exception (getMessage() returned null)
            //
            verifyException("sqlancer.sqlite3.gen.SQLite3ExpressionGenerator", e);
        }
    }

    @Test
    public void test16() throws Throwable {
        LinkedList<SQLite3Schema.SQLite3Table> linkedList0 = new LinkedList<SQLite3Schema.SQLite3Table>();
        LinkedList<String> linkedList1 = new LinkedList<String>();
        linkedList1.add("i0");
        SQLite3Schema sQLite3Schema0 = new SQLite3Schema(linkedList0, linkedList1);
        String string0 = SQLite3Common.getFreeIndexName(sQLite3Schema0);
        assertEquals("i1", string0);
    }

    @Test
    public void test17() throws Throwable {
        String string0 = SQLite3Common.getIndexedClause(" COLLATE BINARY");
        assertEquals("NOT INDEXED", string0);
    }

    @Test
    public void test18() throws Throwable {
        String string0 = SQLite3Common.getRandomCollate();
        assertNotNull(string0);
        assertEquals(" COLLATE BINARY", string0);
    }
}
