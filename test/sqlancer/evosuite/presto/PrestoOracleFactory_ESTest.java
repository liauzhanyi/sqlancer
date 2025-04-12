/*
 * This file was automatically generated by EvoSuite
 * Fri Apr 11 21:12:08 GMT 2025
 */

package sqlancer.evosuite.presto;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import sqlancer.common.oracle.TestOracle;
import sqlancer.presto.PrestoGlobalState;
import sqlancer.presto.PrestoOracleFactory;

public class PrestoOracleFactory_ESTest {

    private void verifyException(String s, Exception e) {
    }

    @Test
    public void test0() throws Throwable {
        PrestoGlobalState prestoGlobalState0 = new PrestoGlobalState();
        PrestoOracleFactory prestoOracleFactory0 = PrestoOracleFactory.DISTINCT;
        TestOracle<PrestoGlobalState> testOracle0 = prestoOracleFactory0.create(prestoGlobalState0);
        assertNotNull(testOracle0);
    }

    @Test
    public void test1() throws Throwable {
        PrestoGlobalState prestoGlobalState0 = new PrestoGlobalState();
        PrestoOracleFactory prestoOracleFactory0 = PrestoOracleFactory.AGGREGATE;
        TestOracle<PrestoGlobalState> testOracle0 = prestoOracleFactory0.create(prestoGlobalState0);
        assertNotNull(testOracle0);
    }

    @Test
    public void test2() throws Throwable {
        PrestoGlobalState prestoGlobalState0 = new PrestoGlobalState();
        PrestoOracleFactory prestoOracleFactory0 = PrestoOracleFactory.HAVING;
        TestOracle<PrestoGlobalState> testOracle0 = prestoOracleFactory0.create(prestoGlobalState0);
        assertNotNull(testOracle0);
    }

    @Test
    public void test3() throws Throwable {
        PrestoGlobalState prestoGlobalState0 = new PrestoGlobalState();
        PrestoOracleFactory prestoOracleFactory0 = PrestoOracleFactory.NOREC;
        try {
            prestoOracleFactory0.create(prestoGlobalState0);
            fail("Expecting exception: NullPointerException");

        } catch (NullPointerException e) {
            //
            // no message in exception (getMessage() returned null)
            //
            verifyException("sqlancer.presto.gen.PrestoTypedExpressionGenerator", e);
        }
    }

    @Test
    public void test4() throws Throwable {
        PrestoGlobalState prestoGlobalState0 = new PrestoGlobalState();
        PrestoOracleFactory prestoOracleFactory0 = PrestoOracleFactory.GROUP_BY;
        TestOracle<PrestoGlobalState> testOracle0 = prestoOracleFactory0.create(prestoGlobalState0);
        assertNotNull(testOracle0);
    }

    @Test
    public void test5() throws Throwable {
        PrestoGlobalState prestoGlobalState0 = new PrestoGlobalState();
        PrestoOracleFactory prestoOracleFactory0 = PrestoOracleFactory.QUERY_PARTITIONING;
        try {
            prestoOracleFactory0.create(prestoGlobalState0);
            fail("Expecting exception: NullPointerException");

        } catch (NullPointerException e) {
            //
            // no message in exception (getMessage() returned null)
            //
            verifyException("sqlancer.presto.gen.PrestoTypedExpressionGenerator", e);
        }
    }
}
