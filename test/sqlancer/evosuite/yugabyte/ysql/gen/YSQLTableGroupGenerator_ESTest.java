/*
 * This file was automatically generated by EvoSuite
 * Fri Apr 11 14:04:08 GMT 2025
 */

package sqlancer.evosuite.yugabyte.ysql.gen;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import sqlancer.common.query.SQLQueryAdapter;
import sqlancer.yugabyte.ysql.gen.YSQLTableGroupGenerator;
import sqlancer.yugabyte.ysql.YSQLGlobalState;

public class YSQLTableGroupGenerator_ESTest {

    @Test
    public void test0() throws Throwable {
        YSQLGlobalState ySQLGlobalState0 = new YSQLGlobalState();
        SQLQueryAdapter sQLQueryAdapter0 = YSQLTableGroupGenerator.create(ySQLGlobalState0);
        assertEquals("CREATE TABLEGROUP tg2;", sQLQueryAdapter0.getQueryString());
    }
}
