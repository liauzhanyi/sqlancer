/*
 * This file was automatically generated by EvoSuite
 * Fri Apr 11 17:27:51 GMT 2025
 */

package sqlancer.evosuite.cockroachdb.ast;

import static org.junit.jupiter.api.Assertions.*;
import java.util.LinkedList;
import org.junit.jupiter.api.Test;
import sqlancer.cockroachdb.ast.CockroachDBTableReference;
import sqlancer.cockroachdb.CockroachDBSchema;
import sqlancer.common.schema.TableIndex;

public class CockroachDBTableReference_ESTest {

    @Test
    public void test0() throws Throwable {
        CockroachDBTableReference cockroachDBTableReference0 = new CockroachDBTableReference(
                (CockroachDBSchema.CockroachDBTable) null);
        CockroachDBSchema.CockroachDBTable cockroachDBSchema_CockroachDBTable0 = cockroachDBTableReference0.getTable();
        assertNull(cockroachDBSchema_CockroachDBTable0);
    }

    @Test
    public void test1() throws Throwable {
        LinkedList<CockroachDBSchema.CockroachDBColumn> linkedList0 = new LinkedList<CockroachDBSchema.CockroachDBColumn>();
        LinkedList<TableIndex> linkedList1 = new LinkedList<TableIndex>();
        CockroachDBSchema.CockroachDBTable cockroachDBSchema_CockroachDBTable0 = new CockroachDBSchema.CockroachDBTable(
                "%rOw,:j", linkedList0, linkedList1, true);
        CockroachDBTableReference cockroachDBTableReference0 = new CockroachDBTableReference(
                cockroachDBSchema_CockroachDBTable0);
        CockroachDBSchema.CockroachDBTable cockroachDBSchema_CockroachDBTable1 = cockroachDBTableReference0.getTable();
        assertEquals("%rOw,:j", cockroachDBSchema_CockroachDBTable1.getName());
    }

    @Test
    public void test2() throws Throwable {
        LinkedList<CockroachDBSchema.CockroachDBColumn> linkedList0 = new LinkedList<CockroachDBSchema.CockroachDBColumn>();
        LinkedList<TableIndex> linkedList1 = new LinkedList<TableIndex>();
        linkedList1.add((TableIndex) null);
        CockroachDBSchema.CockroachDBTable cockroachDBSchema_CockroachDBTable0 = new CockroachDBSchema.CockroachDBTable(
                "", linkedList0, linkedList1, false);
        CockroachDBTableReference cockroachDBTableReference0 = new CockroachDBTableReference(
                cockroachDBSchema_CockroachDBTable0);
        CockroachDBSchema.CockroachDBTable cockroachDBSchema_CockroachDBTable1 = cockroachDBTableReference0.getTable();
        assertTrue(cockroachDBSchema_CockroachDBTable1.hasIndexes());
    }
}
