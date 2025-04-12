/*
 * This file was automatically generated by EvoSuite
 * Fri Apr 11 15:26:22 GMT 2025
 */

package sqlancer.evosuite;

import static org.junit.jupiter.api.Assertions.*;

import java.util.List;
import org.junit.jupiter.api.Test;
import sqlancer.clickhouse.ClickHouseProvider;
import sqlancer.common.query.Query;
import sqlancer.common.query.SQLQueryAdapter;
import sqlancer.DatabaseProvider;
import sqlancer.StateToReproduce;

public class StateToReproduce_ESTest {

    private void verifyException(String s, Exception e) {
    }

    @Test
    public void test00() throws Throwable {
        ClickHouseProvider clickHouseProvider0 = new ClickHouseProvider();
        StateToReproduce stateToReproduce0 = clickHouseProvider0.getStateToReproduce("h?jX2'10");
        StateToReproduce.OracleRunReproductionState stateToReproduce_OracleRunReproductionState0 = stateToReproduce0
                .createLocalState();
        stateToReproduce_OracleRunReproductionState0.log("$ =|&4tm~iIMe-R");
    }

    @Test
    public void test01() throws Throwable {
        ClickHouseProvider clickHouseProvider0 = new ClickHouseProvider();
        StateToReproduce stateToReproduce0 = clickHouseProvider0.getStateToReproduce("LS#({f*1\"xB/0F xZ");
        stateToReproduce0.seedValue = 4165L;
        long long0 = stateToReproduce0.getSeedValue();
        assertEquals(4165L, long0);
    }

    @Test
    public void test02() throws Throwable {
        ClickHouseProvider clickHouseProvider0 = new ClickHouseProvider();
        StateToReproduce stateToReproduce0 = new StateToReproduce("sqlancer.StateToReproduce", clickHouseProvider0);
        stateToReproduce0.seedValue = (-682L);
        long long0 = stateToReproduce0.getSeedValue();
        assertEquals((-682L), long0);
    }

    @Test
    public void test03() throws Throwable {
        ClickHouseProvider clickHouseProvider0 = new ClickHouseProvider();
        StateToReproduce stateToReproduce0 = clickHouseProvider0.getStateToReproduce("ud_r~l2U");
        StateToReproduce.OracleRunReproductionState stateToReproduce_OracleRunReproductionState0 = stateToReproduce0
                .createLocalState();
        StateToReproduce.OracleRunReproductionState stateToReproduce_OracleRunReproductionState1 = stateToReproduce0
                .getLocalState();
        assertSame(stateToReproduce_OracleRunReproductionState1, stateToReproduce_OracleRunReproductionState0);
    }

    @Test
    public void test04() throws Throwable {
        ClickHouseProvider clickHouseProvider0 = new ClickHouseProvider();
        StateToReproduce stateToReproduce0 = clickHouseProvider0.getStateToReproduce("-MH&U3SN/m+/YB");
        stateToReproduce0.exception = "RC:eX,^k%V@qh;L%";
        String string0 = stateToReproduce0.getException();
        assertEquals("RC:eX,^k%V@qh;L%", string0);
    }

    @Test
    public void test05() throws Throwable {
        ClickHouseProvider clickHouseProvider0 = new ClickHouseProvider();
        StateToReproduce stateToReproduce0 = clickHouseProvider0.getStateToReproduce("");
        stateToReproduce0.exception = "";
        String string0 = stateToReproduce0.getException();
        assertEquals("", string0);
    }

    @Test
    public void test06() throws Throwable {
        ClickHouseProvider clickHouseProvider0 = new ClickHouseProvider();
        StateToReproduce stateToReproduce0 = clickHouseProvider0.getStateToReproduce("-MH&U3SN/m+/YB");
        stateToReproduce0.databaseVersion = "malformed JSON";
        String string0 = stateToReproduce0.getDatabaseVersion();
        assertEquals("malformed JSON", string0);
    }

    @Test
    public void test07() throws Throwable {
        ClickHouseProvider clickHouseProvider0 = new ClickHouseProvider();
        StateToReproduce stateToReproduce0 = clickHouseProvider0.getStateToReproduce("o5(:z8P@~^R");
        stateToReproduce0.databaseVersion = "";
        String string0 = stateToReproduce0.getDatabaseVersion();
        assertEquals("", string0);
    }

    @Test
    public void test08() throws Throwable {
        ClickHouseProvider clickHouseProvider0 = new ClickHouseProvider();
        StateToReproduce stateToReproduce0 = clickHouseProvider0.getStateToReproduce((String) null);
        String string0 = stateToReproduce0.getDatabaseName();
        assertNull(string0);
    }

    @Test
    public void test09() throws Throwable {
        ClickHouseProvider clickHouseProvider0 = new ClickHouseProvider();
        StateToReproduce stateToReproduce0 = clickHouseProvider0.getStateToReproduce("-MH&U3SN/m+/YB");
        String string0 = stateToReproduce0.getDatabaseName();
        assertEquals("-MH&U3SN/m+/YB", string0);
    }

    @Test
    public void test10() throws Throwable {
        ClickHouseProvider clickHouseProvider0 = new ClickHouseProvider();
        StateToReproduce stateToReproduce0 = new StateToReproduce("sqlancer.StateToReproduce", clickHouseProvider0);
        List<Query<?>> list0 = stateToReproduce0.getStatements();
        stateToReproduce0.setStatements(list0);
        // Undeclared exception!
        try {
            stateToReproduce0.logStatement("sqlancer.StateToReproduce");
            fail("Expecting exception: UnsupportedOperationException");

        } catch (UnsupportedOperationException e) {
            //
            // no message in exception (getMessage() returned null)
            //
            verifyException("java.util.Collections$UnmodifiableCollection", e);
        }
    }

    @Test
    public void test11() throws Throwable {
        StateToReproduce stateToReproduce0 = new StateToReproduce("hS/{^;Wu!DE?u", (DatabaseProvider<?, ?, ?>) null);
        // Undeclared exception!
        try {
            stateToReproduce0.logStatement("hS/{^;Wu!DE?u");
            fail("Expecting exception: NullPointerException");

        } catch (NullPointerException e) {
            //
            // no message in exception (getMessage() returned null)
            //
            verifyException("sqlancer.StateToReproduce", e);
        }
    }

    @Test
    public void test12() throws Throwable {
        ClickHouseProvider clickHouseProvider0 = new ClickHouseProvider();
        StateToReproduce stateToReproduce0 = clickHouseProvider0.getStateToReproduce("");
        List<Query<?>> list0 = stateToReproduce0.getStatements();
        stateToReproduce0.logStatement("");
        stateToReproduce0.setStatements(list0);
        // Undeclared exception!
        try {
            stateToReproduce0.commentStatements();
            fail("Expecting exception: UnsupportedOperationException");

        } catch (UnsupportedOperationException e) {
            //
            // no message in exception (getMessage() returned null)
            //
            verifyException("java.util.Collections$UnmodifiableList", e);
        }
    }

    @Test
    public void test13() throws Throwable {
        ClickHouseProvider clickHouseProvider0 = new ClickHouseProvider();
        StateToReproduce stateToReproduce0 = clickHouseProvider0
                .getStateToReproduce("scrub-fk: column \"t.rowid\" does not exist");
        SQLQueryAdapter sQLQueryAdapter0 = new SQLQueryAdapter("3=@xBJzUS,tuP?U");
        stateToReproduce0.logStatement((Query<?>) sQLQueryAdapter0);
        assertFalse(sQLQueryAdapter0.couldAffectSchema());
    }

    @Test
    public void test14() throws Throwable {
        ClickHouseProvider clickHouseProvider0 = new ClickHouseProvider();
        StateToReproduce stateToReproduce0 = clickHouseProvider0.getStateToReproduce("bit");
        StateToReproduce.OracleRunReproductionState stateToReproduce_OracleRunReproductionState0 = stateToReproduce0
                .createLocalState();
        stateToReproduce_OracleRunReproductionState0.close();
    }

    @Test
    public void test15() throws Throwable {
        ClickHouseProvider clickHouseProvider0 = new ClickHouseProvider();
        StateToReproduce stateToReproduce0 = clickHouseProvider0.getStateToReproduce("bit");
        StateToReproduce.OracleRunReproductionState stateToReproduce_OracleRunReproductionState0 = stateToReproduce0
                .createLocalState();
        stateToReproduce_OracleRunReproductionState0.executedWithoutError();
        stateToReproduce_OracleRunReproductionState0.close();
    }

    @Test
    public void test16() throws Throwable {
        ClickHouseProvider clickHouseProvider0 = new ClickHouseProvider();
        StateToReproduce stateToReproduce0 = clickHouseProvider0.getStateToReproduce("k<t;R[{W9");
        // Undeclared exception!
        try {
            stateToReproduce0.logStatement((String) null);
            fail("Expecting exception: IllegalArgumentException");

        } catch (IllegalArgumentException e) {
            //
            // no message in exception (getMessage() returned null)
            //
            verifyException("sqlancer.StateToReproduce", e);
        }
    }

    @Test
    public void test17() throws Throwable {
        ClickHouseProvider clickHouseProvider0 = new ClickHouseProvider();
        StateToReproduce stateToReproduce0 = clickHouseProvider0.getStateToReproduce("");
        stateToReproduce0.logStatement("");
        stateToReproduce0.commentStatements();
        assertNull(stateToReproduce0.getException());
    }

    @Test
    public void test18() throws Throwable {
        ClickHouseProvider clickHouseProvider0 = new ClickHouseProvider();
        StateToReproduce stateToReproduce0 = new StateToReproduce("ck$@Tx+%-Kw^;/]b4", clickHouseProvider0);
        StateToReproduce.OracleRunReproductionState stateToReproduce_OracleRunReproductionState0 = stateToReproduce0
                .getLocalState();
        assertNull(stateToReproduce_OracleRunReproductionState0);
    }

    @Test
    public void test19() throws Throwable {
        ClickHouseProvider clickHouseProvider0 = new ClickHouseProvider();
        StateToReproduce stateToReproduce0 = clickHouseProvider0.getStateToReproduce((String) null);
        String string0 = stateToReproduce0.getException();
        assertNull(string0);
    }

    @Test
    public void test20() throws Throwable {
        ClickHouseProvider clickHouseProvider0 = new ClickHouseProvider();
        StateToReproduce stateToReproduce0 = clickHouseProvider0.getStateToReproduce("");
        String string0 = stateToReproduce0.getDatabaseName();
        assertEquals("", string0);
    }

    @Test
    public void test21() throws Throwable {
        ClickHouseProvider clickHouseProvider0 = new ClickHouseProvider();
        StateToReproduce stateToReproduce0 = clickHouseProvider0.getStateToReproduce("");
        String string0 = stateToReproduce0.getDatabaseVersion();
        assertNull(string0);
    }

    @Test
    public void test22() throws Throwable {
        ClickHouseProvider clickHouseProvider0 = new ClickHouseProvider();
        StateToReproduce stateToReproduce0 = new StateToReproduce("sqlancer.cnosdb.query.CnosDBQueryAdapter",
                clickHouseProvider0);
        long long0 = stateToReproduce0.getSeedValue();
        assertEquals(0L, long0);
    }

    @Test
    public void test23() throws Throwable {
        ClickHouseProvider clickHouseProvider0 = new ClickHouseProvider();
        StateToReproduce stateToReproduce0 = clickHouseProvider0.getStateToReproduce("");
        StateToReproduce.OracleRunReproductionState stateToReproduce_OracleRunReproductionState0 = stateToReproduce0.new OracleRunReproductionState();
        stateToReproduce_OracleRunReproductionState0.executedWithoutError();
    }
}
