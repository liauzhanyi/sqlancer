/*
 * This file was automatically generated by EvoSuite
 * Sat Apr 12 03:23:45 GMT 2025
 */

package sqlancer.evosuite.sqlite3.gen;

import static org.junit.jupiter.api.Assertions.*;
import java.util.function.Supplier;
import org.junit.jupiter.api.Test;
import sqlancer.Randomly;
import sqlancer.sqlite3.gen.SQLite3VirtualFTSTableCommandGenerator;
import sqlancer.sqlite3.schema.SQLite3Schema;
import sqlancer.sqlite3.SQLite3GlobalState;

public class SQLite3VirtualFTSTableCommandGenerator_ESTest {

    private void verifyException(String s, Exception e) {
    }

    @Test
    public void test0() throws Throwable {
        SQLite3GlobalState sQLite3GlobalState0 = new SQLite3GlobalState();
        // Undeclared exception!
        try {
            SQLite3VirtualFTSTableCommandGenerator.create(sQLite3GlobalState0);
            fail("Expecting exception: AssertionError");

        } catch (AssertionError e) {
            //
            // null
            //
        }
    }

    /*
     * Test disabled because it contains mock() function calls that are not implemented
     *
     * @Test public void test1() throws Throwable { Supplier<String> supplier0 = (Supplier<String>) mock(Supplier.class,
     * new ViolatedAssumptionAnswer()); Randomly randomly0 = new Randomly(supplier0);
     * SQLite3VirtualFTSTableCommandGenerator sQLite3VirtualFTSTableCommandGenerator0 = new
     * SQLite3VirtualFTSTableCommandGenerator( (SQLite3Schema) null, randomly0); }
     */

    @Test
    public void test2() throws Throwable {
        // Undeclared exception!
        try {
            SQLite3VirtualFTSTableCommandGenerator.create((SQLite3GlobalState) null);
            fail("Expecting exception: NullPointerException");

        } catch (NullPointerException e) {
            //
            // no message in exception (getMessage() returned null)
            //
            verifyException("sqlancer.sqlite3.gen.SQLite3VirtualFTSTableCommandGenerator", e);
        }
    }
}
