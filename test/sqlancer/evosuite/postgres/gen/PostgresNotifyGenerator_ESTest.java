/*
 * This file was automatically generated by EvoSuite
 * Sat Apr 12 00:40:21 GMT 2025
 */

package sqlancer.evosuite.postgres.gen;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import sqlancer.common.query.SQLQueryAdapter;
import sqlancer.postgres.gen.PostgresNotifyGenerator;
import sqlancer.postgres.PostgresGlobalState;

public class PostgresNotifyGenerator_ESTest {

    @Test
    public void test0() throws Throwable {
        SQLQueryAdapter sQLQueryAdapter0 = PostgresNotifyGenerator.createUnlisten();
        assertEquals("UNLISTEN *;", sQLQueryAdapter0.getQueryString());
    }

    @Test
    public void test1() throws Throwable {
        SQLQueryAdapter sQLQueryAdapter0 = PostgresNotifyGenerator.createListen();
        assertEquals("LISTEN asdf;", sQLQueryAdapter0.getQueryString());
    }

    @Test
    public void test2() throws Throwable {
        PostgresGlobalState postgresGlobalState0 = new PostgresGlobalState();
        SQLQueryAdapter sQLQueryAdapter0 = PostgresNotifyGenerator.createNotify(postgresGlobalState0);
        assertEquals("NOTIFY asdf;", sQLQueryAdapter0.getLogString());
    }
}
