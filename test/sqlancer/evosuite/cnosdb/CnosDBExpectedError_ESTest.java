/*
 * This file was automatically generated by EvoSuite
 * Fri Apr 11 17:47:59 GMT 2025
 */

package sqlancer.evosuite.cnosdb;

import static org.junit.jupiter.api.Assertions.*;
import java.util.List;
import org.junit.jupiter.api.Test;
import sqlancer.cnosdb.CnosDBExpectedError;
import sqlancer.common.query.ExpectedErrors;

public class CnosDBExpectedError_ESTest {

    @Test
    public void test0() throws Throwable {
        List<String> list0 = CnosDBExpectedError.getExpectedErrors();
        assertEquals(58, list0.size());
    }

    @Test
    public void test1() throws Throwable {
        ExpectedErrors expectedErrors0 = CnosDBExpectedError.expectedErrors();
        assertNotNull(expectedErrors0);
    }
}
