/*
 * This file was automatically generated by EvoSuite
 * Fri Apr 11 22:02:57 GMT 2025
 */

package sqlancer.evosuite.datafusion;

import static org.junit.jupiter.api.Assertions.*;
import java.util.List;
import org.junit.jupiter.api.Test;
import sqlancer.datafusion.DataFusionOptions;
import sqlancer.datafusion.DataFusionOracleFactory;

public class DataFusionOptions_ESTest {

    @Test
    public void test0() throws Throwable {
        DataFusionOptions dataFusionOptions0 = new DataFusionOptions();
        List<DataFusionOracleFactory> list0 = dataFusionOptions0.getTestOracleFactory();
        assertEquals(2, list0.size());
    }
}
