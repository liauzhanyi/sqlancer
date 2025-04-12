/*
 * This file was automatically generated by EvoSuite
 * Sat Apr 12 02:36:01 GMT 2025
 */

package sqlancer.evosuite.yugabyte.ycql;

import static org.junit.jupiter.api.Assertions.*;
import java.util.List;
import org.junit.jupiter.api.Test;
import sqlancer.common.query.ExpectedErrors;
import sqlancer.yugabyte.ycql.YCQLErrors;

public class YCQLErrors_ESTest {

    private void verifyException(String s, Exception e) {
    }

    @Test
    public void test0() throws Throwable {
        ExpectedErrors expectedErrors0 = new ExpectedErrors();
        YCQLErrors.addExpressionErrors(expectedErrors0);
    }

    @Test
    public void test1() throws Throwable {
        List<String> list0 = YCQLErrors.getExpressionErrors();
        assertEquals(8, list0.size());
    }

    @Test
    public void test2() throws Throwable {
        // Undeclared exception!
        try {
            YCQLErrors.addExpressionErrors((ExpectedErrors) null);
            fail("Expecting exception: NullPointerException");

        } catch (NullPointerException e) {
            //
            // no message in exception (getMessage() returned null)
            //
            verifyException("sqlancer.yugabyte.ycql.YCQLErrors", e);
        }
    }
}
