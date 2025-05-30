/*
 * This file was automatically generated by EvoSuite
 * Fri Apr 11 20:34:20 GMT 2025
 */

package sqlancer.evosuite.postgres.gen;

import static org.junit.jupiter.api.Assertions.*;

import java.util.LinkedList;
import org.junit.jupiter.api.Test;
import sqlancer.citus.CitusGlobalState;
import sqlancer.common.query.ExpectedErrors;
import sqlancer.postgres.gen.PostgresAlterTableGenerator;
import sqlancer.postgres.PostgresGlobalState;
import sqlancer.postgres.PostgresSchema;

public class PostgresAlterTableGenerator_ESTest {

    private void verifyException(String s, Exception e) {
    }

    @Test
    public void test0() throws Throwable {
        PostgresGlobalState postgresGlobalState0 = new PostgresGlobalState();
        PostgresAlterTableGenerator postgresAlterTableGenerator0 = new PostgresAlterTableGenerator(
                (PostgresSchema.PostgresTable) null, postgresGlobalState0, false);
        // Undeclared exception!
        try {
            postgresAlterTableGenerator0.getActions((ExpectedErrors) null);
            fail("Expecting exception: NullPointerException");

        } catch (NullPointerException e) {
            //
            // no message in exception (getMessage() returned null)
            //
            verifyException("sqlancer.postgres.gen.PostgresCommon", e);
        }
    }

    @Test
    public void test1() throws Throwable {
        CitusGlobalState citusGlobalState0 = new CitusGlobalState();
        PostgresAlterTableGenerator postgresAlterTableGenerator0 = new PostgresAlterTableGenerator(
                (PostgresSchema.PostgresTable) null, citusGlobalState0, true);
        // Undeclared exception!
        try {
            postgresAlterTableGenerator0.generate();
            fail("Expecting exception: NullPointerException");

        } catch (NullPointerException e) {
            //
            // no message in exception (getMessage() returned null)
            //
            verifyException("sqlancer.postgres.gen.PostgresAlterTableGenerator", e);
        }
    }

    @Test
    public void test2() throws Throwable {
        CitusGlobalState citusGlobalState0 = new CitusGlobalState();
        // Undeclared exception!
        try {
            PostgresAlterTableGenerator.create((PostgresSchema.PostgresTable) null, citusGlobalState0, false);
            fail("Expecting exception: NullPointerException");

        } catch (NullPointerException e) {
            //
            // no message in exception (getMessage() returned null)
            //
            verifyException("sqlancer.postgres.gen.PostgresAlterTableGenerator", e);
        }
    }

    // @Test
    // public void test3() throws Throwable {
    // PostgresAlterTableGenerator postgresAlterTableGenerator0 = null;
    // try {
    // postgresAlterTableGenerator0 = new PostgresAlterTableGenerator((PostgresSchema.PostgresTable) null,
    // (PostgresGlobalState) null, false);
    // fail("Expecting exception: NullPointerException");
    //
    // } catch (NullPointerException e) {
    // //
    // // no message in exception (getMessage() returned null)
    // //
    // verifyException("sqlancer.postgres.gen.PostgresAlterTableGenerator", e);
    // }
    // }

    /*
     * Test disabled because it contains mock() function calls that are not implemented
     *
     * @Test public void test4() throws Throwable { LinkedList<PostgresSchema.PostgresColumn> linkedList0 = new
     * LinkedList<PostgresSchema.PostgresColumn>(); PostgresSchema.PostgresIndex postgresSchema_PostgresIndex0 =
     * mock(PostgresSchema.PostgresIndex.class, new ViolatedAssumptionAnswer()); PostgresSchema.PostgresIndex
     * postgresSchema_PostgresIndex1 = mock(PostgresSchema.PostgresIndex.class, new ViolatedAssumptionAnswer());
     * List<PostgresSchema.PostgresIndex> list0 = List.of(postgresSchema_PostgresIndex0, postgresSchema_PostgresIndex0,
     * postgresSchema_PostgresIndex0, postgresSchema_PostgresIndex0, postgresSchema_PostgresIndex0,
     * postgresSchema_PostgresIndex0, postgresSchema_PostgresIndex0, postgresSchema_PostgresIndex1,
     * postgresSchema_PostgresIndex1); PostgresSchema.PostgresTable.TableType postgresSchema_PostgresTable_TableType0 =
     * PostgresSchema.PostgresTable.TableType.STANDARD; PostgresSchema.PostgresTable postgresSchema_PostgresTable0 = new
     * PostgresSchema.PostgresTable( "9TP9amDynK`S? mbg", linkedList0, list0, postgresSchema_PostgresTable_TableType0,
     * (List<PostgresSchema.PostgresStatisticsObject>) null, true, true); PostgresSchema.PostgresColumn
     * postgresSchema_PostgresColumn0 = PostgresSchema.PostgresColumn .createDummy("9TP9amDynK`S? mbg");
     * linkedList0.addLast(postgresSchema_PostgresColumn0); CitusGlobalState citusGlobalState0 = new CitusGlobalState();
     * PostgresAlterTableGenerator postgresAlterTableGenerator0 = new PostgresAlterTableGenerator(
     * postgresSchema_PostgresTable0, citusGlobalState0, true); List<String> list1 = List.of("9TP9amDynK`S? mbg");
     * LinkedList<Pattern> linkedList1 = new LinkedList<Pattern>(); ExpectedErrors expectedErrors0 = new
     * ExpectedErrors(list1, linkedList1); // Undeclared exception! try {
     * postgresAlterTableGenerator0.getActions(expectedErrors0); fail("Expecting exception: RuntimeException");
     *
     * } catch (RuntimeException e) { // // no message in exception (getMessage() returned null) //
     * verifyException("sqlancer.postgres.gen.PostgresAlterTableGenerator", e); } }
     */

    // @Test
    // public void test5() throws Throwable {
    // LinkedList<PostgresSchema.PostgresColumn> linkedList0 = new LinkedList<PostgresSchema.PostgresColumn>();
    // LinkedList<PostgresSchema.PostgresIndex> linkedList1 = new LinkedList<PostgresSchema.PostgresIndex>();
    // PostgresSchema.PostgresTable.TableType postgresSchema_PostgresTable_TableType0 =
    // PostgresSchema.PostgresTable.TableType.TEMPORARY;
    // PostgresSchema.PostgresTable postgresSchema_PostgresTable0 = new PostgresSchema.PostgresTable("must be type",
    // linkedList0, linkedList1, postgresSchema_PostgresTable_TableType0, null, true, true);
    // CitusGlobalState citusGlobalState0 = new CitusGlobalState();
    // PostgresAlterTableGenerator postgresAlterTableGenerator0 = new PostgresAlterTableGenerator(
    // postgresSchema_PostgresTable0, citusGlobalState0, true);
    // ExpectedErrors expectedErrors0 = new ExpectedErrors();
    // // Undeclared exception!
    // try {
    // postgresAlterTableGenerator0.getActions(expectedErrors0);
    // fail("Expecting exception: RuntimeException");
    //
    // } catch (RuntimeException e) {
    // //
    // // no message in exception (getMessage() returned null)
    // //
    // verifyException("sqlancer.postgres.gen.PostgresAlterTableGenerator", e);
    // }
    // }

    // @Test
    // public void test6() throws Throwable {
    // LinkedList<PostgresSchema.PostgresColumn> linkedList0 = new LinkedList<PostgresSchema.PostgresColumn>();
    // LinkedList<PostgresSchema.PostgresIndex> linkedList1 = new LinkedList<PostgresSchema.PostgresIndex>();
    // PostgresGlobalState postgresGlobalState0 = new PostgresGlobalState();
    // PostgresSchema.PostgresTable.TableType postgresSchema_PostgresTable_TableType0 =
    // PostgresSchema.PostgresTable.TableType.TEMPORARY;
    // LinkedList<PostgresSchema.PostgresStatisticsObject> linkedList2 = new
    // LinkedList<PostgresSchema.PostgresStatisticsObject>();
    // PostgresSchema.PostgresTable postgresSchema_PostgresTable0 = new PostgresSchema.PostgresTable(":", linkedList0,
    // linkedList1, postgresSchema_PostgresTable_TableType0, linkedList2, true, true);
    // PostgresAlterTableGenerator postgresAlterTableGenerator0 = new PostgresAlterTableGenerator(
    // postgresSchema_PostgresTable0, postgresGlobalState0, true);
    // // Undeclared exception!
    // try {
    // postgresAlterTableGenerator0.generate();
    // fail("Expecting exception: RuntimeException");
    //
    // } catch (RuntimeException e) {
    // //
    // // no message in exception (getMessage() returned null)
    // //
    // verifyException("sqlancer.postgres.gen.PostgresAlterTableGenerator", e);
    // }
    // }

    @Test
    public void test7() throws Throwable {
        LinkedList<PostgresSchema.PostgresColumn> linkedList0 = new LinkedList<PostgresSchema.PostgresColumn>();
        LinkedList<PostgresSchema.PostgresIndex> linkedList1 = new LinkedList<PostgresSchema.PostgresIndex>();
        linkedList1.add((PostgresSchema.PostgresIndex) null);
        PostgresSchema.PostgresTable.TableType postgresSchema_PostgresTable_TableType0 = PostgresSchema.PostgresTable.TableType.TEMPORARY;
        PostgresSchema.PostgresTable postgresSchema_PostgresTable0 = new PostgresSchema.PostgresTable((String) null,
                linkedList0, linkedList1, postgresSchema_PostgresTable_TableType0, null, true, true);
        PostgresGlobalState postgresGlobalState0 = new PostgresGlobalState();
        // Undeclared exception!
        try {
            PostgresAlterTableGenerator.create(postgresSchema_PostgresTable0, postgresGlobalState0, true);
            fail("Expecting exception: RuntimeException");

        } catch (RuntimeException e) {
            //
            // no message in exception (getMessage() returned null)
            //
            verifyException("sqlancer.postgres.gen.PostgresAlterTableGenerator", e);
        }
    }
}
