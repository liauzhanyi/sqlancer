/*
 * This file was automatically generated by EvoSuite
 * Fri Apr 11 17:41:31 GMT 2025
 */

package sqlancer.evosuite.yugabyte.ysql.gen;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import sqlancer.yugabyte.ysql.gen.YSQLTableGenerator;
import sqlancer.yugabyte.ysql.YSQLGlobalState;

public class YSQLTableGenerator_ESTest {

    private void verifyException(String s, Exception e) {
    }

    @Test
    public void test0() throws Throwable {
        YSQLGlobalState ySQLGlobalState0 = new YSQLGlobalState();
        // Undeclared exception!
        try {
            YSQLTableGenerator.generate(") W Ob+zMYdbks]", false, ySQLGlobalState0);
            fail("Expecting exception: NullPointerException");

        } catch (NullPointerException e) {
            //
            // no message in exception (getMessage() returned null)
            //
            verifyException("sqlancer.yugabyte.ysql.gen.YSQLExpressionGenerator", e);
        }
    }

    @Test
    public void test1() throws Throwable {
        YSQLGlobalState ySQLGlobalState0 = new YSQLGlobalState();
        // Undeclared exception!
        try {
            YSQLTableGenerator.generate("~uMo_CxH!_te~pIy", true, ySQLGlobalState0);
            fail("Expecting exception: NullPointerException");

        } catch (NullPointerException e) {
            //
            // no message in exception (getMessage() returned null)
            //
            verifyException("sqlancer.yugabyte.ysql.gen.YSQLExpressionGenerator", e);
        }
    }

    @Test
    public void test2() throws Throwable {
        YSQLGlobalState ySQLGlobalState0 = new YSQLGlobalState();
        YSQLTableGenerator ySQLTableGenerator0 = new YSQLTableGenerator("", false, ySQLGlobalState0);
    }
}
