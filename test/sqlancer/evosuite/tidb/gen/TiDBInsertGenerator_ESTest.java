/*
 * This file was automatically generated by EvoSuite
 * Sat Apr 12 02:18:49 GMT 2025
 */

package sqlancer.evosuite.tidb.gen;

import static org.junit.jupiter.api.Assertions.*;
import java.util.LinkedList;
import java.util.List;
import org.junit.jupiter.api.Test;
import sqlancer.common.query.SQLQueryAdapter;
import sqlancer.common.schema.TableIndex;
import sqlancer.tidb.gen.TiDBInsertGenerator;
import sqlancer.tidb.TiDBProvider;
import sqlancer.tidb.TiDBSchema;

public class TiDBInsertGenerator_ESTest {

    private void verifyException(String s, Exception e) {
    }

    @Test
    public void test0() throws Throwable {
        TiDBProvider.TiDBGlobalState tiDBProvider_TiDBGlobalState0 = new TiDBProvider.TiDBGlobalState();
        LinkedList<TiDBSchema.TiDBColumn> linkedList0 = new LinkedList<TiDBSchema.TiDBColumn>();
        LinkedList<TableIndex> linkedList1 = new LinkedList<TableIndex>();
        TiDBSchema.TiDBTable tiDBSchema_TiDBTable0 = new TiDBSchema.TiDBTable("c@rPiZ:#5", linkedList0, linkedList1,
                true);
        // Undeclared exception!
        try {
            TiDBInsertGenerator.getQuery(tiDBProvider_TiDBGlobalState0, tiDBSchema_TiDBTable0);
            fail("Expecting exception: AssertionError");

        } catch (AssertionError e) {
            //
            // [] 1
            //
        }
    }

    @Test
    public void test1() throws Throwable {
        TiDBProvider.TiDBGlobalState tiDBProvider_TiDBGlobalState0 = new TiDBProvider.TiDBGlobalState();
        // Undeclared exception!
        try {
            TiDBInsertGenerator.getQuery(tiDBProvider_TiDBGlobalState0);
            fail("Expecting exception: AssertionError");

        } catch (AssertionError e) {
            //
            // null
            //
        }
    }

    @Test
    public void test2() throws Throwable {
        TiDBProvider.TiDBGlobalState tiDBProvider_TiDBGlobalState0 = new TiDBProvider.TiDBGlobalState();
        TiDBInsertGenerator tiDBInsertGenerator0 = new TiDBInsertGenerator(tiDBProvider_TiDBGlobalState0);
    }

    @Test
    public void test3() throws Throwable {
        TiDBProvider.TiDBGlobalState tiDBProvider_TiDBGlobalState0 = new TiDBProvider.TiDBGlobalState();
        TiDBSchema.TiDBCompositeDataType.getRandom();
        TiDBSchema.TiDBCompositeDataType tiDBSchema_TiDBCompositeDataType0 = TiDBSchema.TiDBCompositeDataType
                .getRandom();
        TiDBSchema.TiDBColumn tiDBSchema_TiDBColumn0 = new TiDBSchema.TiDBColumn("bBzYl|QJwm",
                tiDBSchema_TiDBCompositeDataType0, false, false, false);
        List<TiDBSchema.TiDBColumn> list0 = List.of(tiDBSchema_TiDBColumn0, tiDBSchema_TiDBColumn0,
                tiDBSchema_TiDBColumn0, tiDBSchema_TiDBColumn0, tiDBSchema_TiDBColumn0);
        LinkedList<TableIndex> linkedList0 = new LinkedList<TableIndex>();
        TiDBSchema.TiDBTable tiDBSchema_TiDBTable0 = new TiDBSchema.TiDBTable("bBzYl|QJwm", list0, linkedList0, false);
        SQLQueryAdapter sQLQueryAdapter0 = TiDBInsertGenerator.getQuery(tiDBProvider_TiDBGlobalState0,
                tiDBSchema_TiDBTable0);
        assertFalse(sQLQueryAdapter0.couldAffectSchema());
    }

    @Test
    public void test4() throws Throwable {
        TiDBProvider.TiDBGlobalState tiDBProvider_TiDBGlobalState0 = new TiDBProvider.TiDBGlobalState();
        TiDBSchema.TiDBDataType tiDBSchema_TiDBDataType0 = TiDBSchema.TiDBDataType.CHAR;
        TiDBSchema.TiDBCompositeDataType tiDBSchema_TiDBCompositeDataType0 = new TiDBSchema.TiDBCompositeDataType(
                tiDBSchema_TiDBDataType0, 1);
        TiDBSchema.TiDBColumn tiDBSchema_TiDBColumn0 = new TiDBSchema.TiDBColumn("&`|lb-Sg/)$&m?#r9",
                tiDBSchema_TiDBCompositeDataType0, true, true, false);
        LinkedList<TiDBSchema.TiDBColumn> linkedList0 = new LinkedList<TiDBSchema.TiDBColumn>();
        linkedList0.add(tiDBSchema_TiDBColumn0);
        TiDBSchema.TiDBTable tiDBSchema_TiDBTable0 = new TiDBSchema.TiDBTable("r>2ggm", linkedList0,
                (List<TableIndex>) null, true);
        tiDBSchema_TiDBTable0.getRandomColumn();
        // Undeclared exception!
        try {
            TiDBInsertGenerator.getQuery(tiDBProvider_TiDBGlobalState0, tiDBSchema_TiDBTable0);
            fail("Expecting exception: NullPointerException");

        } catch (NullPointerException e) {
            //
            // no message in exception (getMessage() returned null)
            //
            verifyException("sqlancer.tidb.TiDBExpressionGenerator", e);
        }
    }

    @Test
    public void test5() throws Throwable {
        // Undeclared exception!
        try {
            TiDBInsertGenerator.getQuery((TiDBProvider.TiDBGlobalState) null);
            fail("Expecting exception: NullPointerException");

        } catch (NullPointerException e) {
            //
            // no message in exception (getMessage() returned null)
            //
            verifyException("sqlancer.tidb.gen.TiDBInsertGenerator", e);
        }
    }
}
