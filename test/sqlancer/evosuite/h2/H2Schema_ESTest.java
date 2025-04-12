/*
 * This file was automatically generated by EvoSuite
 * Fri Apr 11 20:40:22 GMT 2025
 */

package sqlancer.evosuite.h2;

import static org.junit.jupiter.api.Assertions.*;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.LinkedList;
import java.util.List;
import org.junit.jupiter.api.Test;
import sqlancer.h2.H2Schema;
import sqlancer.SQLConnection;

public class H2Schema_ESTest {

    private void verifyException(String s, Exception e) {
    }

    @Test
    public void test00() throws Throwable {
        LinkedList<H2Schema.H2Table> linkedList0 = new LinkedList<H2Schema.H2Table>();
        List<H2Schema.H2Column> list0 = List.of();
        H2Schema.H2Table h2Schema_H2Table0 = new H2Schema.H2Table("s", list0);
        linkedList0.add(h2Schema_H2Table0);
        H2Schema h2Schema0 = new H2Schema(linkedList0);
        h2Schema0.getRandomTableNonEmptyTables();
    }

/*
 * Test disabled because it contains mock() function calls that are not implemented
 *
 * @Test public void test01() throws Throwable { H2Schema.H2DataType h2Schema_H2DataType0 = H2Schema.H2DataType.DOUBLE;
 * H2Schema.H2CompositeDataType h2Schema_H2CompositeDataType0 = new H2Schema.H2CompositeDataType( h2Schema_H2DataType0,
 * 4, 0); H2Schema.H2CompositeDataType h2Schema_H2CompositeDataType1 = H2Schema.H2CompositeDataType.getRandom();
 * H2Schema.H2CompositeDataType.getRandom(); h2Schema_H2CompositeDataType1.toString(); H2Schema.H2CompositeDataType
 * h2Schema_H2CompositeDataType2 = new H2Schema.H2CompositeDataType( h2Schema_H2DataType0, 0, 0);
 * H2Schema.H2CompositeDataType.getRandom(); h2Schema_H2CompositeDataType0.toString(); ResultSet resultSet0 =
 * mock(ResultSet.class, new ViolatedAssumptionAnswer()); doReturn((String)
 * null).when(resultSet0).getString(anyString()); doReturn(true, false).when(resultSet0).next(); PreparedStatement
 * preparedStatement0 = mock(PreparedStatement.class, new ViolatedAssumptionAnswer()); doReturn(resultSet0, (ResultSet)
 * null).when(preparedStatement0).executeQuery(anyString()); Connection connection0 = mock(Connection.class, new
 * ViolatedAssumptionAnswer()); doReturn(preparedStatement0, preparedStatement0).when(connection0).createStatement();
 * SQLConnection sQLConnection0 = new SQLConnection(connection0); // Undeclared exception! try {
 * H2Schema.fromConnection(sQLConnection0, "{`lN2H8'\"&J"); fail("Expecting exception: NullPointerException");
 *
 * } catch (NullPointerException e) { // // no message in exception (getMessage() returned null) //
 * verifyException("sqlancer.h2.H2Schema", e); } }
 *
 * @Test public void test02() throws Throwable { H2Schema h2Schema0 = null; try { h2Schema0 = new
 * H2Schema((List<H2Schema.H2Table>) null); fail("Expecting exception: NullPointerException");
 *
 * } catch (NullPointerException e) { // // no message in exception (getMessage() returned null) //
 * verifyException("java.util.Collections$UnmodifiableCollection", e); } }
 *
 * @Test public void test03() throws Throwable { H2Schema.H2DataType h2Schema_H2DataType0 = H2Schema.H2DataType.BINARY;
 * H2Schema.H2CompositeDataType h2Schema_H2CompositeDataType0 = new H2Schema.H2CompositeDataType( h2Schema_H2DataType0,
 * 6, 6); H2Schema.H2Column[] h2Schema_H2ColumnArray0 = new H2Schema.H2Column[1]; H2Schema.H2Column h2Schema_H2Column0 =
 * new H2Schema.H2Column("nWN)@-?|WU;MrV;", h2Schema_H2CompositeDataType0); h2Schema_H2ColumnArray0[0] =
 * h2Schema_H2Column0; List<H2Schema.H2Column> list0 = List.of(h2Schema_H2ColumnArray0); H2Schema.H2Table
 * h2Schema_H2Table0 = new H2Schema.H2Table("bXzS\"E^Y0SD'k", list0); }
 *
 * @Test public void test04() throws Throwable { ResultSet resultSet0 = mock(ResultSet.class, new
 * ViolatedAssumptionAnswer()); doReturn("M!t-%_)").when(resultSet0).getString(anyString()); doReturn(true,
 * false).when(resultSet0).next(); Statement statement0 = mock(Statement.class, new ViolatedAssumptionAnswer());
 * doReturn(resultSet0).when(statement0).executeQuery(anyString()); Connection connection0 = mock(Connection.class, new
 * ViolatedAssumptionAnswer()); doReturn(statement0, (Statement) null).when(connection0).createStatement();
 * SQLConnection sQLConnection0 = new SQLConnection(connection0); // Undeclared exception! try {
 * H2Schema.fromConnection(sQLConnection0, "Z"); fail("Expecting exception: NullPointerException");
 *
 * } catch (NullPointerException e) { // // no message in exception (getMessage() returned null) //
 * verifyException("sqlancer.h2.H2Schema", e); } }
 *
 * @Test public void test05() throws Throwable { ResultSet resultSet0 = mock(ResultSet.class, new
 * ViolatedAssumptionAnswer()); doReturn("M!t-%_)").when(resultSet0).getString(anyString()); doReturn(true,
 * false).when(resultSet0).next(); ResultSet resultSet1 = mock(ResultSet.class, new ViolatedAssumptionAnswer());
 * doReturn("M!t-%_)", "W").when(resultSet1).getString(anyString()); doReturn(true).when(resultSet1).next(); Statement
 * statement0 = mock(Statement.class, new ViolatedAssumptionAnswer());
 * doReturn(resultSet0).when(statement0).executeQuery(anyString()); Statement statement1 = mock(Statement.class, new
 * ViolatedAssumptionAnswer()); doReturn(resultSet1).when(statement1).executeQuery(anyString()); Connection connection0
 * = mock(Connection.class, new ViolatedAssumptionAnswer()); doReturn(statement0,
 * statement1).when(connection0).createStatement(); SQLConnection sQLConnection0 = new SQLConnection(connection0); //
 * Undeclared exception! try { H2Schema.fromConnection(sQLConnection0, "ML\\$tR");
 * fail("Expecting exception: AssertionError");
 *
 * } catch (AssertionError e) { // // W // } }
 *
 * @Test public void test06() throws Throwable { // Undeclared exception! try { H2Schema.fromConnection((SQLConnection)
 * null, "V"); fail("Expecting exception: NullPointerException");
 *
 * } catch (NullPointerException e) { // // no message in exception (getMessage() returned null) //
 * verifyException("sqlancer.h2.H2Schema", e); } }
 *
 * @Test public void test07() throws Throwable { Connection connection0 = mock(Connection.class, new
 * ViolatedAssumptionAnswer()); doReturn((Statement) null).when(connection0).createStatement(); SQLConnection
 * sQLConnection0 = new SQLConnection(connection0); // Undeclared exception! try {
 * H2Schema.fromConnection(sQLConnection0, "SMALLINT"); fail("Expecting exception: NullPointerException");
 *
 * } catch (NullPointerException e) { // // no message in exception (getMessage() returned null) //
 * verifyException("sqlancer.h2.H2Schema", e); } }
 *
 * @Test public void test08() throws Throwable { ResultSet resultSet0 = mock(ResultSet.class, new
 * ViolatedAssumptionAnswer()); doReturn((String) null).when(resultSet0).getString(anyString()); doReturn(true,
 * false).when(resultSet0).next(); Statement statement0 = mock(Statement.class, new ViolatedAssumptionAnswer());
 * doReturn(resultSet0).when(statement0).executeQuery(anyString()); Connection connection0 = mock(Connection.class, new
 * ViolatedAssumptionAnswer()); doReturn(statement0, (Statement) null).when(connection0).createStatement();
 * SQLConnection sQLConnection0 = new SQLConnection(connection0); // Undeclared exception! try {
 * H2Schema.fromConnection(sQLConnection0, "L"); fail("Expecting exception: NullPointerException");
 *
 * } catch (NullPointerException e) { // // no message in exception (getMessage() returned null) //
 * verifyException("sqlancer.h2.H2Schema", e); } }
 *
 * @Test public void test09() throws Throwable { PreparedStatement preparedStatement0 = mock(PreparedStatement.class,
 * new ViolatedAssumptionAnswer()); doReturn((ResultSet) null).when(preparedStatement0).executeQuery(anyString());
 * Connection connection0 = mock(Connection.class, new ViolatedAssumptionAnswer());
 * doReturn(preparedStatement0).when(connection0).prepareStatement(anyString()); SQLConnection sQLConnection0 = new
 * SQLConnection(connection0); Statement statement0 = sQLConnection0.prepareStatement("INT2"); Connection connection1 =
 * mock(Connection.class, new ViolatedAssumptionAnswer()); doReturn(statement0).when(connection1).createStatement();
 * SQLConnection sQLConnection1 = new SQLConnection(connection1); // Undeclared exception! try {
 * H2Schema.fromConnection(sQLConnection1, "INT2"); fail("Expecting exception: NullPointerException");
 *
 * } catch (NullPointerException e) { // // no message in exception (getMessage() returned null) //
 * verifyException("sqlancer.h2.H2Schema", e); } }
 *
 * @Test public void test10() throws Throwable { H2Schema.H2DataType h2Schema_H2DataType0 = H2Schema.H2DataType.DOUBLE;
 * H2Schema.H2CompositeDataType h2Schema_H2CompositeDataType0 = new H2Schema.H2CompositeDataType( h2Schema_H2DataType0,
 * 8, 8); // Undeclared exception! try { h2Schema_H2CompositeDataType0.toString();
 * fail("Expecting exception: AssertionError");
 *
 * } catch (AssertionError e) { // // no message in exception (getMessage() returned null) // } }
 *
 * @Test public void test11() throws Throwable { H2Schema.H2CompositeDataType h2Schema_H2CompositeDataType0 =
 * H2Schema.H2CompositeDataType.getRandom(); String string0 = h2Schema_H2CompositeDataType0.toString(); // // Unstable
 * assertion: assertEquals("INT2", string0);
 *
 * H2Schema.H2CompositeDataType h2Schema_H2CompositeDataType1 = H2Schema.H2CompositeDataType.getRandom(); // // Unstable
 * assertion: assertEquals(H2Schema.H2DataType.INT, // h2Schema_H2CompositeDataType1.getPrimitiveDataType());
 *
 * H2Schema.H2CompositeDataType.getRandom(); H2Schema.H2CompositeDataType.getRandom();
 * H2Schema.H2CompositeDataType.getRandom(); String string1 = h2Schema_H2CompositeDataType0.toString(); // // Unstable
 * assertion: assertEquals("INT2", string1); // // Unstable assertion: assertNotNull(string1);
 *
 * H2Schema.H2CompositeDataType h2Schema_H2CompositeDataType2 = H2Schema.H2CompositeDataType.getRandom(); String string2
 * = h2Schema_H2CompositeDataType2.toString(); // // Unstable assertion: assertEquals("DOUBLE PRECISION", string2); }
 *
 * @Test public void test12() throws Throwable { H2Schema.H2DataType h2Schema_H2DataType0 = H2Schema.H2DataType.DOUBLE;
 * H2Schema.H2CompositeDataType h2Schema_H2CompositeDataType0 = new H2Schema.H2CompositeDataType( h2Schema_H2DataType0,
 * 4, 1414); // Undeclared exception! try { h2Schema_H2CompositeDataType0.toString();
 * fail("Expecting exception: AssertionError");
 *
 * } catch (AssertionError e) { // // no message in exception (getMessage() returned null) // } }
 *
 * @Test public void test13() throws Throwable { H2Schema.H2DataType h2Schema_H2DataType0 = H2Schema.H2DataType.DOUBLE;
 * H2Schema.H2CompositeDataType h2Schema_H2CompositeDataType0 = new H2Schema.H2CompositeDataType( h2Schema_H2DataType0,
 * 4, (-8)); // Undeclared exception! try { h2Schema_H2CompositeDataType0.toString();
 * fail("Expecting exception: AssertionError");
 *
 * } catch (AssertionError e) { // // no message in exception (getMessage() returned null) // } }
 *
 * @Test public void test14() throws Throwable { H2Schema.H2DataType h2Schema_H2DataType0 = H2Schema.H2DataType.DOUBLE;
 * H2Schema.H2CompositeDataType h2Schema_H2CompositeDataType0 = new H2Schema.H2CompositeDataType( h2Schema_H2DataType0,
 * (-2233), (-2233)); // Undeclared exception! try { h2Schema_H2CompositeDataType0.toString();
 * fail("Expecting exception: AssertionError");
 *
 * } catch (AssertionError e) { // // -2233 // } }
 *
 * @Test public void test15() throws Throwable { H2Schema.H2DataType h2Schema_H2DataType0 = H2Schema.H2DataType.DOUBLE;
 * H2Schema.H2CompositeDataType h2Schema_H2CompositeDataType0 = new H2Schema.H2CompositeDataType( h2Schema_H2DataType0,
 * 7, 7); // Undeclared exception! try { h2Schema_H2CompositeDataType0.toString();
 * fail("Expecting exception: AssertionError");
 *
 * } catch (AssertionError e) { // // 7 // } }
 *
 * @Test public void test16() throws Throwable { H2Schema.H2DataType h2Schema_H2DataType0 = H2Schema.H2DataType.DOUBLE;
 * H2Schema.H2CompositeDataType h2Schema_H2CompositeDataType0 = new H2Schema.H2CompositeDataType( h2Schema_H2DataType0,
 * 6, 0); // Undeclared exception! try { h2Schema_H2CompositeDataType0.toString();
 * fail("Expecting exception: AssertionError");
 *
 * } catch (AssertionError e) { // // 6 // } }
 *
 * @Test public void test17() throws Throwable { H2Schema.H2DataType h2Schema_H2DataType0 = H2Schema.H2DataType.DOUBLE;
 * H2Schema.H2CompositeDataType h2Schema_H2CompositeDataType0 = new H2Schema.H2CompositeDataType( h2Schema_H2DataType0,
 * 5, 5); // Undeclared exception! try { h2Schema_H2CompositeDataType0.toString();
 * fail("Expecting exception: AssertionError");
 *
 * } catch (AssertionError e) { // // 5 // } }
 *
 * @Test public void test18() throws Throwable { H2Schema.H2CompositeDataType h2Schema_H2CompositeDataType0 =
 * H2Schema.H2CompositeDataType.getRandom(); H2Schema.H2DataType h2Schema_H2DataType0 =
 * h2Schema_H2CompositeDataType0.getPrimitiveDataType(); H2Schema.H2CompositeDataType h2Schema_H2CompositeDataType1 =
 * new H2Schema.H2CompositeDataType( h2Schema_H2DataType0, (-4286), 0); // Undeclared exception! try {
 * h2Schema_H2CompositeDataType1.toString(); fail("Expecting exception: AssertionError");
 *
 * } catch (AssertionError e) { // // -4286 // } }
 *
 * @Test public void test19() throws Throwable { H2Schema.H2DataType h2Schema_H2DataType0 = H2Schema.H2DataType.INT;
 * H2Schema.H2CompositeDataType h2Schema_H2CompositeDataType0 = new H2Schema.H2CompositeDataType( h2Schema_H2DataType0,
 * 8, 0); String string0 = h2Schema_H2CompositeDataType0.toString(); assertEquals("BIGINT", string0);
 * assertNotNull(string0); }
 *
 * @Test public void test20() throws Throwable { H2Schema.H2DataType h2Schema_H2DataType0 = H2Schema.H2DataType.INT;
 * H2Schema.H2CompositeDataType h2Schema_H2CompositeDataType0 = new H2Schema.H2CompositeDataType( h2Schema_H2DataType0,
 * 7, 7); // Undeclared exception! try { h2Schema_H2CompositeDataType0.toString();
 * fail("Expecting exception: AssertionError");
 *
 * } catch (AssertionError e) { // // 7 // } }
 *
 * @Test public void test21() throws Throwable { H2Schema.H2DataType h2Schema_H2DataType0 = H2Schema.H2DataType.INT;
 * H2Schema.H2CompositeDataType h2Schema_H2CompositeDataType0 = new H2Schema.H2CompositeDataType( h2Schema_H2DataType0,
 * 6, 784); // Undeclared exception! try { h2Schema_H2CompositeDataType0.toString();
 * fail("Expecting exception: AssertionError");
 *
 * } catch (AssertionError e) { // // 6 // } }
 *
 * @Test public void test22() throws Throwable { H2Schema.H2DataType h2Schema_H2DataType0 = H2Schema.H2DataType.INT;
 * H2Schema.H2CompositeDataType h2Schema_H2CompositeDataType0 = new H2Schema.H2CompositeDataType( h2Schema_H2DataType0,
 * 5, (-1134)); // Undeclared exception! try { h2Schema_H2CompositeDataType0.toString();
 * fail("Expecting exception: AssertionError");
 *
 * } catch (AssertionError e) { // // 5 // } }
 *
 * @Test public void test23() throws Throwable { H2Schema.H2DataType h2Schema_H2DataType0 = H2Schema.H2DataType.INT;
 * H2Schema.H2CompositeDataType h2Schema_H2CompositeDataType0 = new H2Schema.H2CompositeDataType( h2Schema_H2DataType0,
 * 4, (-9)); String string0 = h2Schema_H2CompositeDataType0.toString(); assertEquals("INT", string0);
 * assertNotNull(string0); }
 *
 * @Test public void test24() throws Throwable { H2Schema.H2DataType h2Schema_H2DataType0 = H2Schema.H2DataType.INT;
 * H2Schema.H2CompositeDataType h2Schema_H2CompositeDataType0 = new H2Schema.H2CompositeDataType( h2Schema_H2DataType0,
 * 3, 3); // Undeclared exception! try { h2Schema_H2CompositeDataType0.toString();
 * fail("Expecting exception: AssertionError");
 *
 * } catch (AssertionError e) { // // 3 // } }
 *
 * @Test public void test25() throws Throwable { H2Schema.H2DataType h2Schema_H2DataType0 = H2Schema.H2DataType.INT;
 * H2Schema.H2CompositeDataType h2Schema_H2CompositeDataType0 = new H2Schema.H2CompositeDataType( h2Schema_H2DataType0,
 * 1, 1); String string0 = h2Schema_H2CompositeDataType0.toString(); assertEquals("TINYINT", string0); }
 *
 * @Test public void test26() throws Throwable { H2Schema.H2DataType h2Schema_H2DataType0 = H2Schema.H2DataType.BINARY;
 * H2Schema.H2CompositeDataType h2Schema_H2CompositeDataType0 = new H2Schema.H2CompositeDataType( h2Schema_H2DataType0,
 * 672, (-3255)); String string0 = h2Schema_H2CompositeDataType0.toString(); assertEquals("BINARY", string0); }
 *
 * @Test public void test27() throws Throwable { H2Schema.H2DataType h2Schema_H2DataType0 = H2Schema.H2DataType.VARCHAR;
 * H2Schema.H2CompositeDataType h2Schema_H2CompositeDataType0 = new H2Schema.H2CompositeDataType( h2Schema_H2DataType0,
 * (-2171), (-2171)); String string0 = h2Schema_H2CompositeDataType0.toString(); assertEquals("VARCHAR", string0); }
 *
 * @Test public void test28() throws Throwable { H2Schema.H2DataType h2Schema_H2DataType0 = H2Schema.H2DataType.BOOL;
 * H2Schema.H2CompositeDataType h2Schema_H2CompositeDataType0 = new H2Schema.H2CompositeDataType( h2Schema_H2DataType0,
 * 4, 8); String string0 = h2Schema_H2CompositeDataType0.toString(); assertEquals("BOOL", string0); }
 *
 * @Test public void test29() throws Throwable { H2Schema.H2DataType h2Schema_H2DataType0 = H2Schema.H2DataType.DOUBLE;
 * H2Schema.H2CompositeDataType h2Schema_H2CompositeDataType0 = new H2Schema.H2CompositeDataType( h2Schema_H2DataType0,
 * 8, 569); // Undeclared exception! try { h2Schema_H2CompositeDataType0.toString();
 * fail("Expecting exception: AssertionError");
 *
 * } catch (AssertionError e) { // // no message in exception (getMessage() returned null) // } }
 *
 * @Test public void test30() throws Throwable { H2Schema.H2DataType h2Schema_H2DataType0 =
 * H2Schema.H2DataType.getRandom(); assertEquals(H2Schema.H2DataType.INT, h2Schema_H2DataType0); }
 *
 * @Test public void test31() throws Throwable { LinkedList<H2Schema.H2Table> linkedList0 = new
 * LinkedList<H2Schema.H2Table>(); H2Schema.H2Tables h2Schema_H2Tables0 = new H2Schema.H2Tables(linkedList0); }
 *
 * @Test public void test32() throws Throwable { LinkedList<H2Schema.H2Table> linkedList0 = new
 * LinkedList<H2Schema.H2Table>(); H2Schema h2Schema0 = new H2Schema(linkedList0); // Undeclared exception! try {
 * h2Schema0.getRandomTableNonEmptyTables(); fail("Expecting exception: AssertionError");
 *
 * } catch (AssertionError e) { // // [] 1 // } } }
 */
