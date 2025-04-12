/*
 * This file was automatically generated by EvoSuite
 * Fri Apr 11 23:21:01 GMT 2025
 */

package sqlancer.evosuite.mysql.gen;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import sqlancer.mysql.gen.MySQLDeleteGenerator;
import sqlancer.mysql.MySQLGlobalState;

public class MySQLDeleteGenerator_ESTest {

    private void verifyException(String s, Exception e) {
    }

    @Test
    public void test0() throws Throwable {
        MySQLGlobalState mySQLGlobalState0 = new MySQLGlobalState();
        // Undeclared exception!
        try {
            MySQLDeleteGenerator.delete(mySQLGlobalState0);
            fail("Expecting exception: AssertionError");

        } catch (AssertionError e) {
            //
            // null
            //
        }
    }

    @Test
    public void test1() throws Throwable {
        MySQLGlobalState mySQLGlobalState0 = new MySQLGlobalState();
        MySQLDeleteGenerator mySQLDeleteGenerator0 = new MySQLDeleteGenerator(mySQLGlobalState0);
    }

    @Test
    public void test2() throws Throwable {
        // Undeclared exception!
        try {
            MySQLDeleteGenerator.delete((MySQLGlobalState) null);
            fail("Expecting exception: NullPointerException");

        } catch (NullPointerException e) {
            //
            // no message in exception (getMessage() returned null)
            //
            verifyException("sqlancer.mysql.gen.MySQLDeleteGenerator", e);
        }
    }
}
