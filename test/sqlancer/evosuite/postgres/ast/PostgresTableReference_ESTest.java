/*
 * This file was automatically generated by EvoSuite
 * Sat Apr 12 03:34:58 GMT 2025
 */

package sqlancer.evosuite.postgres.ast;

import static org.junit.jupiter.api.Assertions.*;
import java.util.Collection;
import java.util.LinkedList;
import java.util.List;
import org.junit.jupiter.api.Test;
import sqlancer.postgres.ast.PostgresTableReference;
import sqlancer.postgres.PostgresSchema;

public class PostgresTableReference_ESTest {

    @Test
    public void test0() throws Throwable {
        PostgresTableReference postgresTableReference0 = new PostgresTableReference(
                (PostgresSchema.PostgresTable) null);
        PostgresSchema.PostgresTable postgresSchema_PostgresTable0 = postgresTableReference0.getTable();
        assertNull(postgresSchema_PostgresTable0);
    }

/*
 * Test disabled because it contains mock() function calls that are not implemented
 *
 * @Test public void test1() throws Throwable { LinkedList<PostgresSchema.PostgresColumn> linkedList0 = new
 * LinkedList<PostgresSchema.PostgresColumn>(); LinkedList<PostgresSchema.PostgresIndex> linkedList1 = new
 * LinkedList<PostgresSchema.PostgresIndex>(); PostgresSchema.PostgresTable.TableType
 * postgresSchema_PostgresTable_TableType0 = PostgresSchema.PostgresTable.TableType.TEMPORARY;
 * PostgresSchema.PostgresIndex postgresSchema_PostgresIndex0 = mock(PostgresSchema.PostgresIndex.class, new
 * ViolatedAssumptionAnswer()); PostgresSchema.PostgresIndex postgresSchema_PostgresIndex1 =
 * mock(PostgresSchema.PostgresIndex.class, new ViolatedAssumptionAnswer()); List<PostgresSchema.PostgresIndex> list0 =
 * List.of(postgresSchema_PostgresIndex0, postgresSchema_PostgresIndex0, postgresSchema_PostgresIndex0,
 * postgresSchema_PostgresIndex0, postgresSchema_PostgresIndex1, postgresSchema_PostgresIndex1,
 * postgresSchema_PostgresIndex0, postgresSchema_PostgresIndex1, postgresSchema_PostgresIndex1,
 * postgresSchema_PostgresIndex0); linkedList1.addAll(0, (Collection<? extends PostgresSchema.PostgresIndex>) list0);
 * LinkedList<PostgresSchema.PostgresStatisticsObject> linkedList2 = new
 * LinkedList<PostgresSchema.PostgresStatisticsObject>(); PostgresSchema.PostgresTable postgresSchema_PostgresTable0 =
 * new PostgresSchema.PostgresTable("BoVw&<|UNva", linkedList0, linkedList1, postgresSchema_PostgresTable_TableType0,
 * linkedList2, false, false); PostgresTableReference postgresTableReference0 = new
 * PostgresTableReference(postgresSchema_PostgresTable0); PostgresSchema.PostgresTable postgresSchema_PostgresTable1 =
 * postgresTableReference0.getTable(); assertEquals(PostgresSchema.PostgresTable.TableType.TEMPORARY,
 * postgresSchema_PostgresTable1.getTableType()); }
 */

/*
 * Test disabled because it contains mock() function calls that are not implemented
 *
 * @Test public void test2() throws Throwable { PostgresSchema.PostgresColumn postgresSchema_PostgresColumn0 =
 * mock(PostgresSchema.PostgresColumn.class, new ViolatedAssumptionAnswer()); doReturn((String)
 * null).when(postgresSchema_PostgresColumn0).toString(); List<PostgresSchema.PostgresColumn> list0 =
 * List.of(postgresSchema_PostgresColumn0); LinkedList<PostgresSchema.PostgresIndex> linkedList0 = new
 * LinkedList<PostgresSchema.PostgresIndex>(); PostgresSchema.PostgresTable.TableType
 * postgresSchema_PostgresTable_TableType0 = PostgresSchema.PostgresTable.TableType.TEMPORARY;
 * PostgresSchema.PostgresTable postgresSchema_PostgresTable0 = new PostgresSchema.PostgresTable("`r{)~Q3r", list0,
 * linkedList0, postgresSchema_PostgresTable_TableType0, (List<PostgresSchema.PostgresStatisticsObject>) null, true,
 * true); PostgresTableReference postgresTableReference0 = new PostgresTableReference(postgresSchema_PostgresTable0);
 * PostgresSchema.PostgresTable postgresSchema_PostgresTable1 = postgresTableReference0.getTable();
 * assertTrue(postgresSchema_PostgresTable1.isInsertable()); } }
 */
