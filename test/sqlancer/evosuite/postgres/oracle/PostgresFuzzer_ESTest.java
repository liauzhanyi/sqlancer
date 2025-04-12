/*
 * This file was automatically generated by EvoSuite
 * Fri Apr 11 20:10:30 GMT 2025
 */

package sqlancer.evosuite.postgres.oracle;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import sqlancer.postgres.oracle.PostgresFuzzer;
import sqlancer.postgres.PostgresGlobalState;

public class PostgresFuzzer_ESTest {

    private void verifyException(String s, Exception e) {
    }

    @Test
    public void test0() throws Throwable {
        PostgresGlobalState postgresGlobalState0 = new PostgresGlobalState();
        PostgresFuzzer postgresFuzzer0 = new PostgresFuzzer(postgresGlobalState0);
        // Undeclared exception!
        try {
            postgresFuzzer0.check();
            fail("Expecting exception: AssertionError");

        } catch (AssertionError e) {
            //
            // null
            //
        }
    }

    @Test
    public void test1() throws Throwable {
        PostgresFuzzer postgresFuzzer0 = new PostgresFuzzer((PostgresGlobalState) null);
        try {
            postgresFuzzer0.check();
            fail("Expecting exception: NullPointerException");

        } catch (NullPointerException e) {
            //
            // no message in exception (getMessage() returned null)
            //
            verifyException("sqlancer.postgres.gen.PostgresRandomQueryGenerator", e);
        }
    }
}
