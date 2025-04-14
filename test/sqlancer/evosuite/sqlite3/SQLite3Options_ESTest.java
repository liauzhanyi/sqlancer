/*
 * This file was automatically generated by EvoSuite
 * Sat Apr 12 00:24:18 GMT 2025
 */

package sqlancer.evosuite.sqlite3;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import sqlancer.sqlite3.SQLite3Options;

public class SQLite3Options_ESTest {

    @Test
    public void test0() throws Throwable {
        SQLite3Options sQLite3Options0 = new SQLite3Options();
        sQLite3Options0.getTestOracleFactory();
        assertTrue(sQLite3Options0.testRtree);
        assertTrue(sQLite3Options0.deleteIfExists);
        assertTrue(sQLite3Options0.generateDatabase);
        assertEquals(10, sQLite3Options0.maxNumTables);
        assertTrue(sQLite3Options0.testNullsFirstLast);
        assertTrue(sQLite3Options0.testIn);
        assertTrue(sQLite3Options0.testGeneratedColumns);
        assertTrue(sQLite3Options0.testForeignKeys);
        assertTrue(sQLite3Options0.testWithoutRowids);
        assertTrue(sQLite3Options0.testTempTables);
        assertTrue(sQLite3Options0.testFts);
        assertTrue(sQLite3Options0.testFunctions);
        assertEquals(20, sQLite3Options0.maxNumIndexes);
        assertTrue(sQLite3Options0.testCheckConstraints);
        assertTrue(sQLite3Options0.testMatch);
        assertTrue(sQLite3Options0.testJoins);
    }
}
