/*
 * This file was automatically generated by EvoSuite
 * Fri Apr 11 17:45:30 GMT 2025
 */

package sqlancer.evosuite.postgres.gen;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import sqlancer.common.query.SQLQueryAdapter;
import sqlancer.postgres.gen.PostgresTransactionGenerator;

public class PostgresTransactionGenerator_ESTest {

    @Test
    public void test0() throws Throwable {
        SQLQueryAdapter sQLQueryAdapter0 = PostgresTransactionGenerator.executeBegin();
        assertEquals("BEGIN;", sQLQueryAdapter0.getLogString());
        assertTrue(sQLQueryAdapter0.couldAffectSchema());
    }
}
