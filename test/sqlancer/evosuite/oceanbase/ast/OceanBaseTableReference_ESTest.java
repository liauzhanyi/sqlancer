/*
 * This file was automatically generated by EvoSuite
 * Sat Apr 12 03:26:16 GMT 2025
 */

package sqlancer.evosuite.oceanbase.ast;

import static org.junit.jupiter.api.Assertions.*;
import java.util.LinkedList;
import java.util.List;
import org.junit.jupiter.api.Test;
import sqlancer.oceanbase.ast.OceanBaseTableReference;
import sqlancer.oceanbase.OceanBaseSchema;

public class OceanBaseTableReference_ESTest {

    /*
     * Test disabled because it contains mock() function calls that are not implemented
     *
     * @Test public void test0() throws Throwable { LinkedList<OceanBaseSchema.OceanBaseColumn> linkedList0 = new
     * LinkedList<OceanBaseSchema.OceanBaseColumn>(); LinkedList<OceanBaseSchema.OceanBaseIndex> linkedList1 = new
     * LinkedList<OceanBaseSchema.OceanBaseIndex>(); OceanBaseSchema.OceanBaseIndex oceanBaseSchema_OceanBaseIndex0 =
     * mock(OceanBaseSchema.OceanBaseIndex.class, new ViolatedAssumptionAnswer());
     * linkedList1.add(oceanBaseSchema_OceanBaseIndex0); OceanBaseSchema.OceanBaseTable oceanBaseSchema_OceanBaseTable0
     * = new OceanBaseSchema.OceanBaseTable("", linkedList0, linkedList1); OceanBaseTableReference
     * oceanBaseTableReference0 = new OceanBaseTableReference(oceanBaseSchema_OceanBaseTable0);
     * OceanBaseSchema.OceanBaseTable oceanBaseSchema_OceanBaseTable1 = oceanBaseTableReference0.getTable();
     * assertTrue(oceanBaseSchema_OceanBaseTable1.hasIndexes()); }
     */

    /*
     * Test disabled because it contains mock() function calls that are not implemented
     *
     * @Test public void test1() throws Throwable { OceanBaseSchema.OceanBaseColumn oceanBaseSchema_OceanBaseColumn0 =
     * mock(OceanBaseSchema.OceanBaseColumn.class, new ViolatedAssumptionAnswer()); doReturn((String) null, (String)
     * null, (String) null).when(oceanBaseSchema_OceanBaseColumn0).toString(); OceanBaseSchema.OceanBaseColumn
     * oceanBaseSchema_OceanBaseColumn1 = mock(OceanBaseSchema.OceanBaseColumn.class, new ViolatedAssumptionAnswer());
     * doReturn((String) null, (String) null, (String) null).when(oceanBaseSchema_OceanBaseColumn1).toString();
     * List<OceanBaseSchema.OceanBaseColumn> list0 = List.of(oceanBaseSchema_OceanBaseColumn0,
     * oceanBaseSchema_OceanBaseColumn0, oceanBaseSchema_OceanBaseColumn1, oceanBaseSchema_OceanBaseColumn0,
     * oceanBaseSchema_OceanBaseColumn1, oceanBaseSchema_OceanBaseColumn1); LinkedList<OceanBaseSchema.OceanBaseIndex>
     * linkedList0 = new LinkedList<OceanBaseSchema.OceanBaseIndex>(); OceanBaseSchema.OceanBaseTable
     * oceanBaseSchema_OceanBaseTable0 = new OceanBaseSchema.OceanBaseTable("varchar", list0, linkedList0);
     * OceanBaseTableReference oceanBaseTableReference0 = new OceanBaseTableReference(oceanBaseSchema_OceanBaseTable0);
     * OceanBaseSchema.OceanBaseTable oceanBaseSchema_OceanBaseTable1 = oceanBaseTableReference0.getTable();
     * assertFalse(oceanBaseSchema_OceanBaseTable1.hasIndexes()); }
     */

    @Test
    public void test2() throws Throwable {
        OceanBaseTableReference oceanBaseTableReference0 = new OceanBaseTableReference(
                (OceanBaseSchema.OceanBaseTable) null);
        OceanBaseSchema.OceanBaseTable oceanBaseSchema_OceanBaseTable0 = oceanBaseTableReference0.getTable();
        assertNull(oceanBaseSchema_OceanBaseTable0);
    }
}
