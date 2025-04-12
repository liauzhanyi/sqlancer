/*
 * This file was automatically generated by EvoSuite
 * Fri Apr 11 15:59:29 GMT 2025
 */

package sqlancer.evosuite.postgres.ast;

import static org.junit.jupiter.api.Assertions.*;
import java.util.LinkedList;
import java.util.List;
import org.junit.jupiter.api.Test;
import sqlancer.postgres.ast.PostgresExpression;
import sqlancer.postgres.ast.PostgresJoin;
import sqlancer.postgres.ast.PostgresSelect;
import sqlancer.postgres.PostgresSchema;
import sqlancer.Randomly;

public class PostgresSelect_ESTest {

    private void verifyException(String s, Exception e) {
    }

    @Test
    public void test00() throws Throwable {
        PostgresSelect postgresSelect0 = new PostgresSelect();
        postgresSelect0.setJoinClauses((List<PostgresJoin>) null);
        List<PostgresJoin> list0 = postgresSelect0.getJoinClauses();
        assertNull(list0);
    }

    @Test
    public void test01() throws Throwable {
        PostgresSelect postgresSelect0 = new PostgresSelect();
        PostgresJoin[] postgresJoinArray0 = new PostgresJoin[2];
        List<PostgresJoin> list0 = Randomly.nonEmptySubset(postgresJoinArray0);
        postgresSelect0.setJoinClauses(list0);
        List<PostgresJoin> list1 = postgresSelect0.getJoinClauses();
        assertEquals(1, list1.size());
    }

    @Test
    public void test02() throws Throwable {
        PostgresSelect postgresSelect0 = new PostgresSelect();
        PostgresSelect.ForClause postgresSelect_ForClause0 = PostgresSelect.ForClause.SHARE;
        postgresSelect0.setForClause(postgresSelect_ForClause0);
        PostgresSelect.ForClause postgresSelect_ForClause1 = postgresSelect0.getForClause();
        assertEquals(PostgresSelect.ForClause.SHARE, postgresSelect_ForClause1);
    }

    @Test
    public void test03() throws Throwable {
        PostgresSelect postgresSelect0 = new PostgresSelect();
        PostgresSelect.SelectType postgresSelect_SelectType0 = postgresSelect0.getSelectOption();
        assertEquals(PostgresSelect.SelectType.ALL, postgresSelect_SelectType0);
    }

    @Test
    public void test04() throws Throwable {
        PostgresSelect postgresSelect0 = new PostgresSelect();
        // Undeclared exception!
        try {
            postgresSelect0.setDistinctOnClause(postgresSelect0);
            fail("Expecting exception: IllegalArgumentException");

        } catch (IllegalArgumentException e) {
            //
            // no message in exception (getMessage() returned null)
            //
            verifyException("sqlancer.postgres.ast.PostgresSelect", e);
        }
    }

    @Test
    public void test05() throws Throwable {
        PostgresSelect postgresSelect0 = new PostgresSelect();
        PostgresSelect.SelectType postgresSelect_SelectType0 = PostgresSelect.SelectType.DISTINCT;
        postgresSelect0.setSelectOption(postgresSelect_SelectType0);
        postgresSelect0.setDistinctOnClause((PostgresExpression) null);
        assertNull(postgresSelect0.getExpressionType());
    }

    @Test
    public void test06() throws Throwable {
        PostgresSelect.SelectType postgresSelect_SelectType0 = PostgresSelect.SelectType.getRandom();
        assertEquals(PostgresSelect.SelectType.DISTINCT, postgresSelect_SelectType0);
    }

    @Test
    public void test07() throws Throwable {
        PostgresSelect.ForClause postgresSelect_ForClause0 = PostgresSelect.ForClause.getRandom();
        assertEquals("UPDATE", postgresSelect_ForClause0.getTextRepresentation());
    }

    @Test
    public void test08() throws Throwable {
        PostgresSelect.ForClause postgresSelect_ForClause0 = PostgresSelect.ForClause.SHARE;
        String string0 = postgresSelect_ForClause0.getTextRepresentation();
        assertEquals("SHARE", string0);
    }

    @Test
    public void test09() throws Throwable {
        PostgresSelect postgresSelect0 = new PostgresSelect();
        PostgresSelect.PostgresSubquery postgresSelect_PostgresSubquery0 = new PostgresSelect.PostgresSubquery(
                postgresSelect0, "SHARE");
        postgresSelect_PostgresSubquery0.getExpressionType();
    }

    @Test
    public void test10() throws Throwable {
        PostgresSelect postgresSelect0 = new PostgresSelect();
        PostgresSelect.PostgresSubquery postgresSelect_PostgresSubquery0 = new PostgresSelect.PostgresSubquery(
                postgresSelect0, "");
        String string0 = postgresSelect_PostgresSubquery0.getName();
        assertEquals("", string0);
    }

    @Test
    public void test11() throws Throwable {
        PostgresSelect postgresSelect0 = new PostgresSelect();
        PostgresSelect.PostgresSubquery postgresSelect_PostgresSubquery0 = new PostgresSelect.PostgresSubquery(
                postgresSelect0, "SHARE");
        PostgresSelect postgresSelect1 = postgresSelect_PostgresSubquery0.getSelect();
        assertNull(postgresSelect1.getForClause());
    }

    @Test
    public void test12() throws Throwable {
        PostgresSchema.PostgresColumn postgresSchema_PostgresColumn0 = PostgresSchema.PostgresColumn
                .createDummy("sqlancer.postgres.ast.PostgresSelect$SelectType");
        List<PostgresSchema.PostgresColumn> list0 = List.of(postgresSchema_PostgresColumn0,
                postgresSchema_PostgresColumn0, postgresSchema_PostgresColumn0);
        LinkedList<PostgresSchema.PostgresIndex> linkedList0 = new LinkedList<PostgresSchema.PostgresIndex>();
        PostgresSchema.PostgresTable.TableType postgresSchema_PostgresTable_TableType0 = PostgresSchema.PostgresTable.TableType.TEMPORARY;
        PostgresSchema.PostgresStatisticsObject[] postgresSchema_PostgresStatisticsObjectArray0 = new PostgresSchema.PostgresStatisticsObject[6];
        List<PostgresSchema.PostgresStatisticsObject> list1 = Randomly
                .subset(postgresSchema_PostgresStatisticsObjectArray0);
        PostgresSchema.PostgresTable postgresSchema_PostgresTable0 = new PostgresSchema.PostgresTable(
                "sqlancer.postgres.ast.PostgresSelect$SelectType", list0, linkedList0,
                postgresSchema_PostgresTable_TableType0, list1, false, false);
        PostgresSelect.PostgresFromTable postgresSelect_PostgresFromTable0 = new PostgresSelect.PostgresFromTable(
                postgresSchema_PostgresTable0, true);
        postgresSelect_PostgresFromTable0.getTable();
        assertTrue(postgresSelect_PostgresFromTable0.isOnly());
    }

    @Test
    public void test13() throws Throwable {
        PostgresSelect.PostgresFromTable postgresSelect_PostgresFromTable0 = new PostgresSelect.PostgresFromTable(
                (PostgresSchema.PostgresTable) null, true);
        boolean boolean0 = postgresSelect_PostgresFromTable0.isOnly();
        assertTrue(boolean0);
    }

/*
 * Test disabled because it contains mock() function calls that are not implemented
 *
 * @Test public void test14() throws Throwable { PostgresSchema.PostgresColumn[] postgresSchema_PostgresColumnArray0 =
 * new PostgresSchema.PostgresColumn[5]; List<PostgresSchema.PostgresColumn> list0 =
 * Randomly.nonEmptySubset(postgresSchema_PostgresColumnArray0); PostgresSchema.PostgresIndex[]
 * postgresSchema_PostgresIndexArray0 = new PostgresSchema.PostgresIndex[1]; List<PostgresSchema.PostgresIndex> list1 =
 * Randomly.nonEmptySubset(postgresSchema_PostgresIndexArray0); PostgresSchema.PostgresTable.TableType
 * postgresSchema_PostgresTable_TableType0 = PostgresSchema.PostgresTable.TableType.TEMPORARY;
 * PostgresSchema.PostgresStatisticsObject postgresSchema_PostgresStatisticsObject0 = mock(
 * PostgresSchema.PostgresStatisticsObject.class, new ViolatedAssumptionAnswer());
 * PostgresSchema.PostgresStatisticsObject postgresSchema_PostgresStatisticsObject1 = mock(
 * PostgresSchema.PostgresStatisticsObject.class, new ViolatedAssumptionAnswer());
 * List<PostgresSchema.PostgresStatisticsObject> list2 = List.of(postgresSchema_PostgresStatisticsObject0,
 * postgresSchema_PostgresStatisticsObject0, postgresSchema_PostgresStatisticsObject0,
 * postgresSchema_PostgresStatisticsObject1, postgresSchema_PostgresStatisticsObject0); PostgresSchema.PostgresTable
 * postgresSchema_PostgresTable0 = new PostgresSchema.PostgresTable("u{$lz", list0, list1,
 * postgresSchema_PostgresTable_TableType0, list2, false, false); PostgresSelect.PostgresFromTable
 * postgresSelect_PostgresFromTable0 = new PostgresSelect.PostgresFromTable( postgresSchema_PostgresTable0, false);
 * postgresSelect_PostgresFromTable0.getExpressionType(); assertFalse(postgresSelect_PostgresFromTable0.isOnly()); }
 *
 * @Test public void test15() throws Throwable { PostgresSelect postgresSelect0 = new PostgresSelect();
 * PostgresSelect.SelectType postgresSelect_SelectType0 = PostgresSelect.SelectType.DISTINCT;
 * postgresSelect0.setSelectType(postgresSelect_SelectType0); assertNull(postgresSelect0.getExpressionType()); }
 *
 * @Test public void test16() throws Throwable { PostgresSelect postgresSelect0 = new PostgresSelect();
 * postgresSelect0.getForClause(); }
 *
 * @Test public void test17() throws Throwable { PostgresSelect postgresSelect0 = new PostgresSelect();
 * PostgresExpression postgresExpression0 = postgresSelect0.getDistinctOnClause(); assertNull(postgresExpression0); }
 *
 * @Test public void test18() throws Throwable { PostgresSelect postgresSelect0 = new PostgresSelect(); PostgresJoin[]
 * postgresJoinArray0 = new PostgresJoin[1]; List<PostgresJoin> list0 = Randomly.subset(0, postgresJoinArray0);
 * postgresSelect0.setJoinClauses(list0); List<PostgresJoin> list1 = postgresSelect0.getJoinClauses();
 * assertTrue(list1.isEmpty()); }
 *
 * @Test public void test19() throws Throwable { PostgresSelect postgresSelect0 = new PostgresSelect();
 * postgresSelect0.getExpressionType(); }
 *
 * @Test public void test20() throws Throwable { PostgresSelect postgresSelect0 = new PostgresSelect(); // Undeclared
 * exception! try { postgresSelect0.asString(); fail("Expecting exception: IllegalStateException");
 *
 * } catch (IllegalStateException e) { // // no message in exception (getMessage() returned null) //
 * verifyException("sqlancer.common.ast.SelectBase", e); } } }
 */
