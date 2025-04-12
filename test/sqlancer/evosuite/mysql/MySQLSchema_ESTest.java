/*
 * This file was automatically generated by EvoSuite
 * Fri Apr 11 17:44:22 GMT 2025
 */

package sqlancer.evosuite.mysql;

import static org.junit.jupiter.api.Assertions.*;

import java.sql.Connection;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.NoSuchElementException;
import org.junit.jupiter.api.Test;
import sqlancer.mysql.ast.MySQLConstant;
import sqlancer.mysql.MySQLGlobalState;
import sqlancer.mysql.MySQLSchema;
import sqlancer.SQLConnection;

public class MySQLSchema_ESTest {

    private void verifyException(String s, Exception e) {
    }

    @Test
    public void test00() throws Throwable {
        MySQLGlobalState mySQLGlobalState0 = new MySQLGlobalState();
        // Undeclared exception!
        try {
            MySQLSchema.MySQLDataType.getRandom(mySQLGlobalState0);
            fail("Expecting exception: NullPointerException");

        } catch (NullPointerException e) {
            //
            // no message in exception (getMessage() returned null)
            //
            verifyException("sqlancer.mysql.MySQLGlobalState", e);
        }
    }

    @Test
    public void test01() throws Throwable {
        LinkedList<MySQLSchema.MySQLTable> linkedList0 = new LinkedList<MySQLSchema.MySQLTable>();
        MySQLSchema mySQLSchema0 = new MySQLSchema(linkedList0);
        // Undeclared exception!
        try {
            mySQLSchema0.getRandomTableNonEmptyTables();
            fail("Expecting exception: AssertionError");

        } catch (AssertionError e) {
            //
            // [] 1
            //
        }
    }

    /*
     * Test disabled because it contains mock() function calls that are not implemented
     *
     * @Test public void test02() throws Throwable { ResultSet resultSet0 = mock(ResultSet.class, new
     * ViolatedAssumptionAnswer()); doReturn("DOUBLE", "admin").when(resultSet0).getString(anyString());
     * doReturn(true).when(resultSet0).next(); PreparedStatement preparedStatement0 = mock(PreparedStatement.class, new
     * ViolatedAssumptionAnswer()); doReturn(resultSet0).when(preparedStatement0).executeQuery(anyString()); Connection
     * connection0 = mock(Connection.class, new ViolatedAssumptionAnswer());
     * doReturn(preparedStatement0).when(connection0).prepareStatement(anyString()); SQLConnection sQLConnection0 = new
     * SQLConnection(connection0); Statement statement0 = sQLConnection0.prepareStatement("DOUBLE"); Connection
     * connection1 = mock(Connection.class, new ViolatedAssumptionAnswer());
     * doReturn(statement0).when(connection1).createStatement(); SQLConnection sQLConnection1 = new
     * SQLConnection(connection1); // Undeclared exception! try { MySQLSchema.fromConnection(sQLConnection1,
     * "^Xb#^3~tl^b"); fail("Expecting exception: NoSuchElementException");
     *
     * } catch (NoSuchElementException e) { // // No value present // verifyException("java.util.Optional", e); } }
     */

    @Test
    public void test03() throws Throwable {
        MySQLSchema mySQLSchema0 = null;
        try {
            mySQLSchema0 = new MySQLSchema((List<MySQLSchema.MySQLTable>) null);
            fail("Expecting exception: NullPointerException");

        } catch (NullPointerException e) {
            //
            // no message in exception (getMessage() returned null)
            //
            verifyException("java.util.Collections$UnmodifiableCollection", e);
        }
    }

    /*
     * Test disabled because it contains mock() function calls that are not implemented
     *
     * @Test public void test04() throws Throwable { ResultSet resultSet0 = mock(ResultSet.class, new
     * ViolatedAssumptionAnswer()); doReturn("DOUBLE", "innodb").when(resultSet0).getString(anyString());
     * doReturn(true).when(resultSet0).next(); PreparedStatement preparedStatement0 = mock(PreparedStatement.class, new
     * ViolatedAssumptionAnswer()); doReturn(resultSet0).when(preparedStatement0).executeQuery(anyString()); Connection
     * connection0 = mock(Connection.class, new ViolatedAssumptionAnswer());
     * doReturn(preparedStatement0).when(connection0).prepareStatement(anyString()); SQLConnection sQLConnection0 = new
     * SQLConnection(connection0); Statement statement0 = sQLConnection0.prepareStatement("DOUBLE"); Connection
     * connection1 = mock(Connection.class, new ViolatedAssumptionAnswer()); doReturn(statement0, (Statement)
     * null).when(connection1).createStatement(); SQLConnection sQLConnection1 = new SQLConnection(connection1); //
     * Undeclared exception! try { MySQLSchema.fromConnection(sQLConnection1, "sqlancer.mysql.MySQLSchema");
     * fail("Expecting exception: NullPointerException");
     *
     * } catch (NullPointerException e) { // // no message in exception (getMessage() returned null) //
     * verifyException("sqlancer.mysql.MySQLSchema", e); } }
     */

    /*
     * Test disabled because it contains mock() function calls that are not implemented
     *
     * @Test public void test05() throws Throwable { ResultSet resultSet0 = mock(ResultSet.class, new
     * ViolatedAssumptionAnswer()); doReturn("DOUBLE", "innodb").when(resultSet0).getString(anyString());
     * doReturn(true).when(resultSet0).next(); PreparedStatement preparedStatement0 = mock(PreparedStatement.class, new
     * ViolatedAssumptionAnswer()); doReturn(resultSet0, (ResultSet)
     * null).when(preparedStatement0).executeQuery(anyString()); Connection connection0 = mock(Connection.class, new
     * ViolatedAssumptionAnswer()); doReturn(preparedStatement0).when(connection0).prepareStatement(anyString());
     * SQLConnection sQLConnection0 = new SQLConnection(connection0); Statement statement0 =
     * sQLConnection0.prepareStatement("DOUBLE"); Connection connection1 = mock(Connection.class, new
     * ViolatedAssumptionAnswer()); doReturn(statement0, statement0).when(connection1).createStatement(); SQLConnection
     * sQLConnection1 = new SQLConnection(connection1); // Undeclared exception! try {
     * MySQLSchema.fromConnection(sQLConnection1, "sqlancer.mysql.MySQLSchema");
     * fail("Expecting exception: NullPointerException");
     *
     * } catch (NullPointerException e) { // // no message in exception (getMessage() returned null) //
     * verifyException("sqlancer.mysql.MySQLSchema", e); } }
     */

    /*
     * Test disabled because it contains mock() function calls that are not implemented
     *
     * @Test public void test06() throws Throwable { ResultSet resultSet0 = mock(ResultSet.class, new
     * ViolatedAssumptionAnswer()); doReturn("DOUBLE", "innodb").when(resultSet0).getString(anyString());
     * doReturn(true).when(resultSet0).next(); ResultSet resultSet1 = mock(ResultSet.class, new
     * ViolatedAssumptionAnswer()); doReturn(false).when(resultSet1).next(); PreparedStatement preparedStatement0 =
     * mock(PreparedStatement.class, new ViolatedAssumptionAnswer()); doReturn(resultSet0, resultSet1, (ResultSet)
     * null).when(preparedStatement0).executeQuery(anyString()); Connection connection0 = mock(Connection.class, new
     * ViolatedAssumptionAnswer()); doReturn(preparedStatement0).when(connection0).prepareStatement(anyString());
     * SQLConnection sQLConnection0 = new SQLConnection(connection0); Statement statement0 =
     * sQLConnection0.prepareStatement("DOUBLE"); Connection connection1 = mock(Connection.class, new
     * ViolatedAssumptionAnswer()); doReturn(statement0, statement0, statement0).when(connection1).createStatement();
     * SQLConnection sQLConnection1 = new SQLConnection(connection1); // Undeclared exception! try {
     * MySQLSchema.fromConnection(sQLConnection1, "DOUBLE"); fail("Expecting exception: NullPointerException");
     *
     * } catch (NullPointerException e) { // // no message in exception (getMessage() returned null) //
     * verifyException("sqlancer.mysql.MySQLSchema", e); } }
     */

    @Test
    public void test07() throws Throwable {
        // Undeclared exception!
        try {
            MySQLSchema.fromConnection((SQLConnection) null, "TE='zOil}");
            fail("Expecting exception: NullPointerException");

        } catch (NullPointerException e) {
            //
            // no message in exception (getMessage() returned null)
            //
            verifyException("sqlancer.mysql.MySQLSchema", e);
        }
    }

    /*
     * Test disabled because it contains mock() function calls that are not implemented
     *
     * @Test public void test08() throws Throwable { Connection connection0 = mock(Connection.class, new
     * ViolatedAssumptionAnswer()); doReturn((Statement) null).when(connection0).createStatement(); SQLConnection
     * sQLConnection0 = new SQLConnection(connection0); // Undeclared exception! try {
     * MySQLSchema.fromConnection(sQLConnection0, "o(F;+i~H"); fail("Expecting exception: NullPointerException");
     *
     * } catch (NullPointerException e) { // // no message in exception (getMessage() returned null) //
     * verifyException("sqlancer.mysql.MySQLSchema", e); } }
     */

    /*
     * Test disabled because it contains mock() function calls that are not implemented
     *
     * @Test public void test09() throws Throwable { PreparedStatement preparedStatement0 =
     * mock(PreparedStatement.class, new ViolatedAssumptionAnswer()); doReturn((ResultSet)
     * null).when(preparedStatement0).executeQuery(anyString()); Connection connection0 = mock(Connection.class, new
     * ViolatedAssumptionAnswer()); doReturn(preparedStatement0).when(connection0).prepareStatement(anyString());
     * SQLConnection sQLConnection0 = new SQLConnection(connection0); Statement statement0 =
     * sQLConnection0.prepareStatement("MOTUBLE"); Connection connection1 = mock(Connection.class, new
     * ViolatedAssumptionAnswer()); doReturn(statement0).when(connection1).createStatement(); SQLConnection
     * sQLConnection1 = new SQLConnection(connection1); // Undeclared exception! try {
     * MySQLSchema.fromConnection(sQLConnection1, "MOTUBLE"); fail("Expecting exception: NullPointerException");
     *
     * } catch (NullPointerException e) { // // no message in exception (getMessage() returned null) //
     * verifyException("sqlancer.mysql.MySQLSchema", e); } }
     */

    /*
     * Test disabled because it contains mock() function calls that are not implemented
     *
     * @Test public void test10() throws Throwable { String string0 = "DOUBLE"; MySQLSchema.MySQLIndex
     * mySQLSchema_MySQLIndex0 = MySQLSchema.MySQLIndex.create("DOUBLE"); TableIndex.create("DOUBLE");
     * mySQLSchema_MySQLIndex0.getIndexName(); MySQLSchema.MySQLDataType mySQLSchema_MySQLDataType0 =
     * MySQLSchema.MySQLDataType.DOUBLE; mySQLSchema_MySQLDataType0.isNumeric(); mySQLSchema_MySQLDataType0.isNumeric();
     * ResultSet resultSet0 = mock(ResultSet.class, new ViolatedAssumptionAnswer()); doReturn("DOUBLE",
     * "innodb").when(resultSet0).getString(anyString()); doReturn(true).when(resultSet0).next(); ResultSet resultSet1 =
     * mock(ResultSet.class, new ViolatedAssumptionAnswer()); doReturn(44020531,
     * (-2073465431)).when(resultSet1).getInt(anyString()); doReturn("DOUBLE", "tinyint", "tinyint", "yD#85n#E7y&)",
     * "tinyint").when(resultSet1).getString(anyString()); doReturn(true, true, false).when(resultSet1).next();
     * PreparedStatement preparedStatement0 = mock(PreparedStatement.class, new ViolatedAssumptionAnswer());
     * doReturn(resultSet0, resultSet1).when(preparedStatement0).executeQuery(anyString()); Connection connection0 =
     * mock(Connection.class, new ViolatedAssumptionAnswer());
     * doReturn(preparedStatement0).when(connection0).prepareStatement(anyString()); SQLConnection sQLConnection0 = new
     * SQLConnection(connection0); Statement statement0 = sQLConnection0.prepareStatement("DOUBLE"); Connection
     * connection1 = mock(Connection.class, new ViolatedAssumptionAnswer()); doReturn(statement0, statement0,
     * (Statement) null).when(connection1).createStatement(); SQLConnection sQLConnection1 = new
     * SQLConnection(connection1); // Undeclared exception! try { MySQLSchema.fromConnection(sQLConnection1, "DOUBLE");
     * fail("Expecting exception: NullPointerException");
     *
     * } catch (NullPointerException e) { // // no message in exception (getMessage() returned null) //
     * verifyException("sqlancer.mysql.MySQLSchema", e); } }
     */

    /*
     * Test disabled because it contains mock() function calls that are not implemented
     *
     * @Test public void test11() throws Throwable { ResultSet resultSet0 = mock(ResultSet.class, new
     * ViolatedAssumptionAnswer()); doReturn("DOUBLE", "innodb").when(resultSet0).getString(anyString());
     * doReturn(true).when(resultSet0).next(); ResultSet resultSet1 = mock(ResultSet.class, new
     * ViolatedAssumptionAnswer()); doReturn(1836).when(resultSet1).getInt(anyString()); doReturn("innodb", "`PRIMARY`",
     * "innodb").when(resultSet1).getString(anyString()); doReturn(true).when(resultSet1).next(); PreparedStatement
     * preparedStatement0 = mock(PreparedStatement.class, new ViolatedAssumptionAnswer()); doReturn(resultSet0,
     * resultSet1).when(preparedStatement0).executeQuery(anyString()); Connection connection0 = mock(Connection.class,
     * new ViolatedAssumptionAnswer()); doReturn(preparedStatement0).when(connection0).prepareStatement(anyString());
     * SQLConnection sQLConnection0 = new SQLConnection(connection0); Statement statement0 =
     * sQLConnection0.prepareStatement("DOUBLE"); Connection connection1 = mock(Connection.class, new
     * ViolatedAssumptionAnswer()); doReturn(statement0, statement0).when(connection1).createStatement(); SQLConnection
     * sQLConnection1 = new SQLConnection(connection1); // Undeclared exception! try {
     * MySQLSchema.fromConnection(sQLConnection1, "DOUBLE"); fail("Expecting exception: AssertionError");
     *
     * } catch (AssertionError e) { // // `PRIMARY` // } }
     */

    @Test
    public void test12() throws Throwable {
        LinkedList<MySQLSchema.MySQLTable> linkedList0 = new LinkedList<MySQLSchema.MySQLTable>();
        MySQLSchema.MySQLTables mySQLSchema_MySQLTables0 = new MySQLSchema.MySQLTables(linkedList0);
        SQLConnection sQLConnection0 = new SQLConnection((Connection) null);
        // Undeclared exception!
        try {
            mySQLSchema_MySQLTables0.getRandomRowValue(sQLConnection0);
            fail("Expecting exception: NullPointerException");

        } catch (NullPointerException e) {
            //
            // no message in exception (getMessage() returned null)
            //
            verifyException("sqlancer.SQLConnection", e);
        }
    }

    /*
     * Test disabled because it contains mock() function calls that are not implemented
     *
     * @Test public void test13() throws Throwable { LinkedList<MySQLSchema.MySQLTable> linkedList0 = new
     * LinkedList<MySQLSchema.MySQLTable>(); MySQLSchema.MySQLTables mySQLSchema_MySQLTables0 = new
     * MySQLSchema.MySQLTables(linkedList0); Connection connection0 = mock(Connection.class, new
     * ViolatedAssumptionAnswer()); doReturn((Statement) null).when(connection0).createStatement(); SQLConnection
     * sQLConnection0 = new SQLConnection(connection0); // Undeclared exception! try {
     * mySQLSchema_MySQLTables0.getRandomRowValue(sQLConnection0); fail("Expecting exception: NullPointerException");
     *
     * } catch (NullPointerException e) { // // no message in exception (getMessage() returned null) //
     * verifyException("sqlancer.mysql.MySQLSchema$MySQLTables", e); } }
     */

    /*
     * Test disabled because it contains mock() function calls that are not implemented
     *
     * @Test public void test14() throws Throwable { ResultSet resultSet0 = mock(ResultSet.class, new
     * ViolatedAssumptionAnswer()); doReturn(false).when(resultSet0).next(); ResultSet resultSet1 =
     * mock(ResultSet.class, new ViolatedAssumptionAnswer()); doReturn(false).when(resultSet1).next(); PreparedStatement
     * preparedStatement0 = mock(PreparedStatement.class, new ViolatedAssumptionAnswer()); doReturn(resultSet0,
     * resultSet1).when(preparedStatement0).executeQuery(anyString()); Connection connection0 = mock(Connection.class,
     * new ViolatedAssumptionAnswer()); doReturn(preparedStatement0).when(connection0).prepareStatement(anyString());
     * SQLConnection sQLConnection0 = new SQLConnection(connection0); Statement statement0 =
     * sQLConnection0.prepareStatement("DOUBLE"); Connection connection1 = mock(Connection.class, new
     * ViolatedAssumptionAnswer()); doReturn(statement0, statement0).when(connection1).createStatement(); SQLConnection
     * sQLConnection1 = new SQLConnection(connection1); MySQLSchema mySQLSchema0 =
     * MySQLSchema.fromConnection(sQLConnection1, "DOUBLE"); List<MySQLSchema.MySQLTable> list0 =
     * mySQLSchema0.getViews(); MySQLSchema.MySQLTables mySQLSchema_MySQLTables0 = new MySQLSchema.MySQLTables(list0);
     * // Undeclared exception! try { mySQLSchema_MySQLTables0.getRandomRowValue(sQLConnection1);
     * fail("Expecting exception: AssertionError");
     *
     * } catch (AssertionError e) { // // could not find random row! SELECT FROM ORDER BY RAND() LIMIT 1 // } }
     */

    /*
     * Test disabled because it contains mock() function calls that are not implemented
     *
     * @Test public void test15() throws Throwable { ResultSet resultSet0 = mock(ResultSet.class, new
     * ViolatedAssumptionAnswer()); doReturn(false).when(resultSet0).next(); ResultSet resultSet1 =
     * mock(ResultSet.class, new ViolatedAssumptionAnswer()); doReturn(false).when(resultSet1).next(); ResultSet
     * resultSet2 = mock(ResultSet.class, new ViolatedAssumptionAnswer()); doReturn(true,
     * false).when(resultSet2).next(); PreparedStatement preparedStatement0 = mock(PreparedStatement.class, new
     * ViolatedAssumptionAnswer()); doReturn(resultSet0, resultSet1,
     * resultSet2).when(preparedStatement0).executeQuery(anyString()); Connection connection0 = mock(Connection.class,
     * new ViolatedAssumptionAnswer()); doReturn(preparedStatement0).when(connection0).prepareStatement(anyString());
     * SQLConnection sQLConnection0 = new SQLConnection(connection0); Statement statement0 =
     * sQLConnection0.prepareStatement("DOUBLE"); Connection connection1 = mock(Connection.class, new
     * ViolatedAssumptionAnswer()); doReturn(statement0, statement0, statement0).when(connection1).createStatement();
     * SQLConnection sQLConnection1 = new SQLConnection(connection1); MySQLSchema mySQLSchema0 =
     * MySQLSchema.fromConnection(sQLConnection1, "DOUBLE"); List<MySQLSchema.MySQLTable> list0 =
     * mySQLSchema0.getViews(); MySQLSchema.MySQLTables mySQLSchema_MySQLTables0 = new MySQLSchema.MySQLTables(list0);
     * MySQLSchema.fromConnection(sQLConnection1, (String) null); MySQLSchema.MySQLRowValue mySQLSchema_MySQLRowValue0 =
     * mySQLSchema_MySQLTables0 .getRandomRowValue(sQLConnection1); assertNotNull(mySQLSchema_MySQLRowValue0); }
     */

    @Test
    public void test16() throws Throwable {
        MySQLSchema.MySQLDataType mySQLSchema_MySQLDataType0 = MySQLSchema.MySQLDataType.DECIMAL;
        boolean boolean0 = mySQLSchema_MySQLDataType0.isNumeric();
        assertTrue(boolean0);
    }

    @Test
    public void test17() throws Throwable {
        MySQLSchema.MySQLDataType mySQLSchema_MySQLDataType0 = MySQLSchema.MySQLDataType.FLOAT;
        boolean boolean0 = mySQLSchema_MySQLDataType0.isNumeric();
        assertTrue(boolean0);
    }

    @Test
    public void test18() throws Throwable {
        MySQLSchema.MySQLDataType mySQLSchema_MySQLDataType0 = MySQLSchema.MySQLDataType.VARCHAR;
        boolean boolean0 = mySQLSchema_MySQLDataType0.isNumeric();
        assertFalse(boolean0);
    }

    @Test
    public void test19() throws Throwable {
        MySQLSchema.MySQLDataType mySQLSchema_MySQLDataType0 = MySQLSchema.MySQLDataType.INT;
        boolean boolean0 = mySQLSchema_MySQLDataType0.isNumeric();
        assertTrue(boolean0);
    }

    @Test
    public void test20() throws Throwable {
        MySQLSchema.MySQLColumn.CollateSequence mySQLSchema_MySQLColumn_CollateSequence0 = MySQLSchema.MySQLColumn.CollateSequence
                .random();
        assertEquals(MySQLSchema.MySQLColumn.CollateSequence.NOCASE, mySQLSchema_MySQLColumn_CollateSequence0);
    }

    @Test
    public void test21() throws Throwable {
        MySQLSchema.MySQLRowValue mySQLSchema_MySQLRowValue0 = new MySQLSchema.MySQLRowValue(
                (MySQLSchema.MySQLTables) null, (Map<MySQLSchema.MySQLColumn, MySQLConstant>) null);
    }

    @Test
    public void test22() throws Throwable {
        LinkedList<MySQLSchema.MySQLColumn> linkedList0 = new LinkedList<MySQLSchema.MySQLColumn>();
        LinkedList<MySQLSchema.MySQLIndex> linkedList1 = new LinkedList<MySQLSchema.MySQLIndex>();
        MySQLSchema.MySQLTable.MySQLEngine mySQLSchema_MySQLTable_MySQLEngine0 = MySQLSchema.MySQLTable.MySQLEngine.MEMORY;
        MySQLSchema.MySQLTable mySQLSchema_MySQLTable0 = new MySQLSchema.MySQLTable("Jy` mS-,", linkedList0,
                linkedList1, mySQLSchema_MySQLTable_MySQLEngine0);
        MySQLSchema.MySQLTable.MySQLEngine mySQLSchema_MySQLTable_MySQLEngine1 = mySQLSchema_MySQLTable0.getEngine();
        assertSame(mySQLSchema_MySQLTable_MySQLEngine1, mySQLSchema_MySQLTable_MySQLEngine0);
    }

    @Test
    public void test23() throws Throwable {
        LinkedList<MySQLSchema.MySQLColumn> linkedList0 = new LinkedList<MySQLSchema.MySQLColumn>();
        LinkedList<MySQLSchema.MySQLIndex> linkedList1 = new LinkedList<MySQLSchema.MySQLIndex>();
        MySQLSchema.MySQLTable.MySQLEngine mySQLSchema_MySQLTable_MySQLEngine0 = MySQLSchema.MySQLTable.MySQLEngine.ARCHIVE;
        MySQLSchema.MySQLTable mySQLSchema_MySQLTable0 = new MySQLSchema.MySQLTable("innodb", linkedList0, linkedList1,
                mySQLSchema_MySQLTable_MySQLEngine0);
        boolean boolean0 = mySQLSchema_MySQLTable0.hasPrimaryKey();
        assertFalse(boolean0);
    }

    @Test
    public void test24() throws Throwable {
        // Undeclared exception!
        try {
            MySQLSchema.MySQLTable.MySQLEngine.get("");
            fail("Expecting exception: NoSuchElementException");

        } catch (NoSuchElementException e) {
            //
            // No value present
            //
            verifyException("java.util.Optional", e);
        }
    }

    @Test
    public void test25() throws Throwable {
        MySQLSchema.MySQLDataType mySQLSchema_MySQLDataType0 = MySQLSchema.MySQLDataType.VARCHAR;
        MySQLSchema.MySQLColumn mySQLSchema_MySQLColumn0 = new MySQLSchema.MySQLColumn((String) null,
                mySQLSchema_MySQLDataType0, false, (-4685));
        int int0 = mySQLSchema_MySQLColumn0.getPrecision();
        assertEquals((-4685), int0);
        assertFalse(mySQLSchema_MySQLColumn0.isPrimaryKey());
    }

    @Test
    public void test26() throws Throwable {
        MySQLSchema.MySQLDataType mySQLSchema_MySQLDataType0 = MySQLSchema.MySQLDataType.INT;
        MySQLSchema.MySQLColumn mySQLSchema_MySQLColumn0 = new MySQLSchema.MySQLColumn("U^cDJ,!K9QO#uEcE%\"{",
                mySQLSchema_MySQLDataType0, true, 576);
        boolean boolean0 = mySQLSchema_MySQLColumn0.isPrimaryKey();
        assertEquals(576, mySQLSchema_MySQLColumn0.getPrecision());
        assertTrue(boolean0);
    }

    @Test
    public void test27() throws Throwable {
        LinkedList<MySQLSchema.MySQLColumn> linkedList0 = new LinkedList<MySQLSchema.MySQLColumn>();
        LinkedList<MySQLSchema.MySQLIndex> linkedList1 = new LinkedList<MySQLSchema.MySQLIndex>();
        MySQLSchema.MySQLTable.MySQLEngine mySQLSchema_MySQLTable_MySQLEngine0 = MySQLSchema.MySQLTable.MySQLEngine.ARCHIVE;
        MySQLSchema.MySQLTable mySQLSchema_MySQLTable0 = new MySQLSchema.MySQLTable("innodb", linkedList0, linkedList1,
                mySQLSchema_MySQLTable_MySQLEngine0);
        List<MySQLSchema.MySQLTable> list0 = List.of(mySQLSchema_MySQLTable0, mySQLSchema_MySQLTable0,
                mySQLSchema_MySQLTable0);
        MySQLSchema mySQLSchema0 = new MySQLSchema(list0);
        MySQLSchema.MySQLTables mySQLSchema_MySQLTables0 = mySQLSchema0.getRandomTableNonEmptyTables();
        assertNotNull(mySQLSchema_MySQLTables0);
    }
}
