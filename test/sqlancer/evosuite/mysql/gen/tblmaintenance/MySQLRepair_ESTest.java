/*
 * This file was automatically generated by EvoSuite
 * Fri Apr 11 22:22:43 GMT 2025
 */

package sqlancer.evosuite.mysql.gen.tblmaintenance;

import static org.junit.jupiter.api.Assertions.*;
import java.util.List;
import org.junit.jupiter.api.Test;
import sqlancer.mysql.gen.tblmaintenance.MySQLRepair;
import sqlancer.mysql.MySQLGlobalState;
import sqlancer.mysql.MySQLSchema;

public class MySQLRepair_ESTest {

    private void verifyException(String s, Exception e) {
    }

    @Test
    public void test0() throws Throwable {
        // Undeclared exception!
        try {
            MySQLRepair.repair((MySQLGlobalState) null);
            fail("Expecting exception: NullPointerException");

        } catch (NullPointerException e) {
            //
            // no message in exception (getMessage() returned null)
            //
            verifyException("sqlancer.mysql.gen.tblmaintenance.MySQLRepair", e);
        }
    }

    @Test
    public void test1() throws Throwable {
        MySQLGlobalState mySQLGlobalState0 = new MySQLGlobalState();
        // Undeclared exception!
        try {
            MySQLRepair.repair(mySQLGlobalState0);
            fail("Expecting exception: AssertionError");

        } catch (AssertionError e) {
            //
            // null
            //
        }
    }

    @Test
    public void test2() throws Throwable {
        MySQLRepair mySQLRepair0 = new MySQLRepair((List<MySQLSchema.MySQLTable>) null);
    }
}
