/*
 * This file was automatically generated by EvoSuite
 * Fri Apr 11 14:40:27 GMT 2025
 */

package sqlancer.evosuite.hsqldb;

import static org.junit.jupiter.api.Assertions.*;

import java.util.LinkedList;
import java.util.List;
import org.junit.jupiter.api.Test;
import sqlancer.hsqldb.HSQLDBOptions;
import sqlancer.hsqldb.HSQLDBOracleFactory;

public class HSQLDBOptions_ESTest {

    @Test
    public void test0() throws Throwable {
        HSQLDBOptions hSQLDBOptions0 = new HSQLDBOptions();
        hSQLDBOptions0.oracle = hSQLDBOptions0.oracle;
        hSQLDBOptions0.oracle = null;
        List<HSQLDBOracleFactory> list0 = hSQLDBOptions0.getTestOracleFactory();
        assertNull(list0);
    }

    @Test
    public void test1() throws Throwable {
        HSQLDBOptions hSQLDBOptions0 = new HSQLDBOptions();
        LinkedList<HSQLDBOracleFactory> linkedList0 = new LinkedList<HSQLDBOracleFactory>();
        hSQLDBOptions0.oracle = (List<HSQLDBOracleFactory>) linkedList0;
        List<HSQLDBOracleFactory> list0 = hSQLDBOptions0.getTestOracleFactory();
        assertTrue(list0.isEmpty());
    }

    @Test
    public void test2() throws Throwable {
        HSQLDBOptions hSQLDBOptions0 = new HSQLDBOptions();
        LinkedList<HSQLDBOracleFactory> linkedList0 = new LinkedList<HSQLDBOracleFactory>();
        HSQLDBOracleFactory hSQLDBOracleFactory0 = HSQLDBOracleFactory.NOREC;
        linkedList0.add(hSQLDBOracleFactory0);
        hSQLDBOptions0.oracle = (List<HSQLDBOracleFactory>) linkedList0;
        List<HSQLDBOracleFactory> list0 = hSQLDBOptions0.getTestOracleFactory();
        assertFalse(list0.isEmpty());
    }
}
