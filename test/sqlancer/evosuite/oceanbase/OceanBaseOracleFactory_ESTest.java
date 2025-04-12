/*
 * This file was automatically generated by EvoSuite
 * Fri Apr 11 20:18:07 GMT 2025
 */

package sqlancer.evosuite.oceanbase;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import sqlancer.common.oracle.TestOracle;
import sqlancer.oceanbase.OceanBaseGlobalState;
import sqlancer.oceanbase.OceanBaseOracleFactory;

public class OceanBaseOracleFactory_ESTest {

    @Test
    public void test0() throws Throwable {
        OceanBaseGlobalState oceanBaseGlobalState0 = new OceanBaseGlobalState();
        OceanBaseOracleFactory oceanBaseOracleFactory0 = OceanBaseOracleFactory.PQS;
        TestOracle<OceanBaseGlobalState> testOracle0 = oceanBaseOracleFactory0.create(oceanBaseGlobalState0);
        assertNotNull(testOracle0);
    }

    @Test
    public void test1() throws Throwable {
        OceanBaseGlobalState oceanBaseGlobalState0 = new OceanBaseGlobalState();
        OceanBaseOracleFactory oceanBaseOracleFactory0 = OceanBaseOracleFactory.NoREC;
        TestOracle<OceanBaseGlobalState> testOracle0 = oceanBaseOracleFactory0.create(oceanBaseGlobalState0);
        assertNotNull(testOracle0);
    }

    @Test
    public void test2() throws Throwable {
        OceanBaseGlobalState oceanBaseGlobalState0 = new OceanBaseGlobalState();
        OceanBaseOracleFactory oceanBaseOracleFactory0 = OceanBaseOracleFactory.TLP_WHERE;
        TestOracle<OceanBaseGlobalState> testOracle0 = oceanBaseOracleFactory0.create(oceanBaseGlobalState0);
        assertNotNull(testOracle0);
    }
}
