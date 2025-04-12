/*
 * This file was automatically generated by EvoSuite
 * Fri Apr 11 20:59:54 GMT 2025
 */

package sqlancer.evosuite.tidb.gen;

import static org.junit.jupiter.api.Assertions.*;
import org.evosuite.runtime.Random;
import org.junit.jupiter.api.Test;
import sqlancer.common.query.SQLQueryAdapter;
import sqlancer.tidb.gen.TiDBSetGenerator;
import sqlancer.tidb.TiDBProvider;

public class TiDBSetGenerator_ESTest {

    private void verifyException(String s, Exception e) {
    }

    @Test
    public void test00() throws Throwable {
        TiDBProvider.TiDBGlobalState tiDBProvider_TiDBGlobalState0 = new TiDBProvider.TiDBGlobalState();
        Random.setNextRandom(198);
        SQLQueryAdapter sQLQueryAdapter0 = TiDBSetGenerator.getQuery(tiDBProvider_TiDBGlobalState0);
        assertEquals("set @@tidb_enable_chunk_rpc=1;", sQLQueryAdapter0.getQueryString());
    }

    @Test
    public void test01() throws Throwable {
        Random.setNextRandom(1956181297);
        TiDBProvider.TiDBGlobalState tiDBProvider_TiDBGlobalState0 = new TiDBProvider.TiDBGlobalState();
        SQLQueryAdapter sQLQueryAdapter0 = TiDBSetGenerator.getQuery(tiDBProvider_TiDBGlobalState0);
        assertEquals("set @@global.tidb_enable_stmt_summary=0;", sQLQueryAdapter0.getLogString());
    }

    @Test
    public void test02() throws Throwable {
        Random.setNextRandom(1545);
        TiDBProvider.TiDBGlobalState tiDBProvider_TiDBGlobalState0 = new TiDBProvider.TiDBGlobalState();
        SQLQueryAdapter sQLQueryAdapter0 = TiDBSetGenerator.getQuery(tiDBProvider_TiDBGlobalState0);
        assertEquals("set @@global.tidb_scatter_region=0;", sQLQueryAdapter0.getQueryString());
    }

    @Test
    public void test03() throws Throwable {
        TiDBProvider.TiDBGlobalState tiDBProvider_TiDBGlobalState0 = new TiDBProvider.TiDBGlobalState();
        Random.setNextRandom(893);
        SQLQueryAdapter sQLQueryAdapter0 = TiDBSetGenerator.getQuery(tiDBProvider_TiDBGlobalState0);
        assertEquals("set @@tidb_wait_split_region_finish=0;", sQLQueryAdapter0.getLogString());
    }

    @Test
    public void test04() throws Throwable {
        Random.setNextRandom(1890);
        TiDBProvider.TiDBGlobalState tiDBProvider_TiDBGlobalState0 = new TiDBProvider.TiDBGlobalState();
        SQLQueryAdapter sQLQueryAdapter0 = TiDBSetGenerator.getQuery(tiDBProvider_TiDBGlobalState0);
        assertEquals("set @@tidb_enable_window_function=1;", sQLQueryAdapter0.getQueryString());
    }

    @Test
    public void test05() throws Throwable {
        TiDBProvider.TiDBGlobalState tiDBProvider_TiDBGlobalState0 = new TiDBProvider.TiDBGlobalState();
        Random.setNextRandom(2289);
        SQLQueryAdapter sQLQueryAdapter0 = TiDBSetGenerator.getQuery(tiDBProvider_TiDBGlobalState0);
        assertEquals("set @@tidb_opt_correlation_exp_factor=1145;", sQLQueryAdapter0.getLogString());
    }

    @Test
    public void test06() throws Throwable {
        Random.setNextRandom((-1535));
        TiDBProvider.TiDBGlobalState tiDBProvider_TiDBGlobalState0 = new TiDBProvider.TiDBGlobalState();
        SQLQueryAdapter sQLQueryAdapter0 = TiDBSetGenerator.getQuery(tiDBProvider_TiDBGlobalState0);
        assertEquals("set @@tidb_opt_insubq_to_join_and_agg=0;", sQLQueryAdapter0.getLogString());

        SQLQueryAdapter sQLQueryAdapter1 = TiDBSetGenerator.getQuery(tiDBProvider_TiDBGlobalState0);
        assertEquals("set @@tidb_opt_correlation_threshold=0.5;", sQLQueryAdapter1.getLogString());
    }

    @Test
    public void test07() throws Throwable {
        Random.setNextRandom((-2180));
        TiDBProvider.TiDBGlobalState tiDBProvider_TiDBGlobalState0 = new TiDBProvider.TiDBGlobalState();
        SQLQueryAdapter sQLQueryAdapter0 = TiDBSetGenerator.getQuery(tiDBProvider_TiDBGlobalState0);
        assertEquals("set @@tidb_max_chunk_size=1122;", sQLQueryAdapter0.getQueryString());

        SQLQueryAdapter sQLQueryAdapter1 = TiDBSetGenerator.getQuery(tiDBProvider_TiDBGlobalState0);
        assertEquals("set @@tidb_constraint_check_in_place=1;", sQLQueryAdapter1.getQueryString());
    }

    @Test
    public void test08() throws Throwable {
        Random.setNextRandom(678);
        TiDBProvider.TiDBGlobalState tiDBProvider_TiDBGlobalState0 = new TiDBProvider.TiDBGlobalState();
        SQLQueryAdapter sQLQueryAdapter0 = TiDBSetGenerator.getQuery(tiDBProvider_TiDBGlobalState0);
        assertEquals("set @@tidb_init_chunk_size=30;", sQLQueryAdapter0.getLogString());
    }

    @Test
    public void test09() throws Throwable {
        Random.setNextRandom((-1626));
        TiDBProvider.TiDBGlobalState tiDBProvider_TiDBGlobalState0 = new TiDBProvider.TiDBGlobalState();
        SQLQueryAdapter sQLQueryAdapter0 = TiDBSetGenerator.getQuery(tiDBProvider_TiDBGlobalState0);
        assertEquals("set @@tidb_skip_utf8_check=1;", sQLQueryAdapter0.getLogString());
    }

    @Test
    public void test10() throws Throwable {
        TiDBProvider.TiDBGlobalState tiDBProvider_TiDBGlobalState0 = new TiDBProvider.TiDBGlobalState();
        Random.setNextRandom(974);
        SQLQueryAdapter sQLQueryAdapter0 = TiDBSetGenerator.getQuery(tiDBProvider_TiDBGlobalState0);
        assertEquals("set @@tidb_index_join_batch_size=488;", sQLQueryAdapter0.getQueryString());
    }

    @Test
    public void test11() throws Throwable {
        TiDBProvider.TiDBGlobalState tiDBProvider_TiDBGlobalState0 = new TiDBProvider.TiDBGlobalState();
        Random.setNextRandom((-2520));
        SQLQueryAdapter sQLQueryAdapter0 = TiDBSetGenerator.getQuery(tiDBProvider_TiDBGlobalState0);
        assertEquals("set @@tidb_hashagg_partial_concurrency=73;", sQLQueryAdapter0.getQueryString());

        SQLQueryAdapter sQLQueryAdapter1 = TiDBSetGenerator.getQuery(tiDBProvider_TiDBGlobalState0);
        assertEquals("set @@tidb_hashagg_final_concurrency=74;", sQLQueryAdapter1.getLogString());
    }

    @Test
    public void test12() throws Throwable {
        // Undeclared exception!
        try {
            TiDBSetGenerator.getQuery((TiDBProvider.TiDBGlobalState) null);
            fail("Expecting exception: NullPointerException");

        } catch (NullPointerException e) {
            //
            // no message in exception (getMessage() returned null)
            //
            verifyException("sqlancer.tidb.gen.TiDBSetGenerator", e);
        }
    }

    @Test
    public void test13() throws Throwable {
        TiDBProvider.TiDBGlobalState tiDBProvider_TiDBGlobalState0 = new TiDBProvider.TiDBGlobalState();
        SQLQueryAdapter sQLQueryAdapter0 = TiDBSetGenerator.getQuery(tiDBProvider_TiDBGlobalState0);
        assertEquals("set @@tidb_opt_agg_push_down=1;", sQLQueryAdapter0.getLogString());

        SQLQueryAdapter sQLQueryAdapter1 = TiDBSetGenerator.getQuery(tiDBProvider_TiDBGlobalState0);
        assertEquals("set @@tidb_build_stats_concurrency=1;", sQLQueryAdapter1.getQueryString());

        SQLQueryAdapter sQLQueryAdapter2 = TiDBSetGenerator.getQuery(tiDBProvider_TiDBGlobalState0);
        assertEquals("set @@tidb_checksum_table_concurrency=2;", sQLQueryAdapter2.getQueryString());

        SQLQueryAdapter sQLQueryAdapter3 = TiDBSetGenerator.getQuery(tiDBProvider_TiDBGlobalState0);
        assertEquals("set @@tidb_distsql_scan_concurrency=4;", sQLQueryAdapter3.getLogString());

        SQLQueryAdapter sQLQueryAdapter4 = TiDBSetGenerator.getQuery(tiDBProvider_TiDBGlobalState0);
        assertEquals("set @@tidb_index_lookup_size=5;", sQLQueryAdapter4.getLogString());

        SQLQueryAdapter sQLQueryAdapter5 = TiDBSetGenerator.getQuery(tiDBProvider_TiDBGlobalState0);
        assertEquals("set @@tidb_index_lookup_concurrency=6;", sQLQueryAdapter5.getLogString());

        SQLQueryAdapter sQLQueryAdapter6 = TiDBSetGenerator.getQuery(tiDBProvider_TiDBGlobalState0);
        assertEquals("set @@tidb_index_lookup_join_concurrency=7;", sQLQueryAdapter6.getLogString());

        SQLQueryAdapter sQLQueryAdapter7 = TiDBSetGenerator.getQuery(tiDBProvider_TiDBGlobalState0);
        assertEquals("set @@tidb_hash_join_concurrency=8;", sQLQueryAdapter7.getQueryString());

        SQLQueryAdapter sQLQueryAdapter8 = TiDBSetGenerator.getQuery(tiDBProvider_TiDBGlobalState0);
        assertEquals("set @@tidb_index_serial_scan_concurrency=9;", sQLQueryAdapter8.getQueryString());

        SQLQueryAdapter sQLQueryAdapter9 = TiDBSetGenerator.getQuery(tiDBProvider_TiDBGlobalState0);
        assertEquals("set @@tidb_projection_concurrency=10;", sQLQueryAdapter9.getLogString());
    }
}
