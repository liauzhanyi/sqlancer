/*
 * This file was automatically generated by EvoSuite
 * Fri Apr 11 23:36:44 GMT 2025
 */

package sqlancer.evosuite.postgres.gen;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import sqlancer.common.query.SQLQueryAdapter;
import sqlancer.postgres.gen.PostgresSequenceGenerator;
import sqlancer.postgres.PostgresGlobalState;

public class PostgresSequenceGenerator_ESTest {

    @Test
    public void test0() throws Throwable {
        PostgresGlobalState postgresGlobalState0 = new PostgresGlobalState();
        SQLQueryAdapter sQLQueryAdapter0 = PostgresSequenceGenerator.createSequence(postgresGlobalState0);
        assertEquals("CREATE SEQUENCE IF NOT EXISTS seq;", sQLQueryAdapter0.getLogString());
    }
}
