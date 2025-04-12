/*
 * This file was automatically generated by EvoSuite
 * Fri Apr 11 20:06:48 GMT 2025
 */

package sqlancer.evosuite.tidb.ast;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import sqlancer.tidb.ast.TiDBColumnReference;
import sqlancer.tidb.TiDBSchema;

public class TiDBColumnReference_ESTest {

    @Test
    public void test0() throws Throwable {
        TiDBColumnReference tiDBColumnReference0 = new TiDBColumnReference((TiDBSchema.TiDBColumn) null);
        TiDBSchema.TiDBColumn tiDBSchema_TiDBColumn0 = tiDBColumnReference0.getColumn();
        assertNull(tiDBSchema_TiDBColumn0);
    }

    @Test
    public void test1() throws Throwable {
        TiDBSchema.TiDBDataType tiDBSchema_TiDBDataType0 = TiDBSchema.TiDBDataType.BLOB;
        TiDBSchema.TiDBCompositeDataType tiDBSchema_TiDBCompositeDataType0 = new TiDBSchema.TiDBCompositeDataType(
                tiDBSchema_TiDBDataType0, 4890);
        TiDBSchema.TiDBColumn tiDBSchema_TiDBColumn0 = new TiDBSchema.TiDBColumn("sXOi",
                tiDBSchema_TiDBCompositeDataType0, false, false, false);
        TiDBColumnReference tiDBColumnReference0 = new TiDBColumnReference(tiDBSchema_TiDBColumn0);
        TiDBSchema.TiDBColumn tiDBSchema_TiDBColumn1 = tiDBColumnReference0.getColumn();
        assertFalse(tiDBSchema_TiDBColumn1.hasDefault());
    }

    @Test
    public void test2() throws Throwable {
        TiDBSchema.TiDBColumn tiDBSchema_TiDBColumn0 = new TiDBSchema.TiDBColumn("",
                (TiDBSchema.TiDBCompositeDataType) null, true, true, true);
        TiDBColumnReference tiDBColumnReference0 = new TiDBColumnReference(tiDBSchema_TiDBColumn0);
        TiDBSchema.TiDBColumn tiDBSchema_TiDBColumn1 = tiDBColumnReference0.getColumn();
        assertEquals("", tiDBSchema_TiDBColumn1.getName());
    }
}
