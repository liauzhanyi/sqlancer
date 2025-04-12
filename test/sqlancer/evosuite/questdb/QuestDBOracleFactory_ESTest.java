/*
 * This file was automatically generated by EvoSuite
 * Fri Apr 11 15:27:31 GMT 2025
 */

package sqlancer.evosuite.questdb;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import sqlancer.common.oracle.TestOracle;
import sqlancer.questdb.QuestDBOracleFactory;
import sqlancer.questdb.QuestDBProvider;

public class QuestDBOracleFactory_ESTest {

    @Test
    public void test0() throws Throwable {
        QuestDBOracleFactory questDBOracleFactory0 = QuestDBOracleFactory.valueOf("WHERE");
        QuestDBProvider.QuestDBGlobalState questDBProvider_QuestDBGlobalState0 = new QuestDBProvider.QuestDBGlobalState();
        TestOracle<QuestDBProvider.QuestDBGlobalState> testOracle0 = questDBOracleFactory0
                .create(questDBProvider_QuestDBGlobalState0);
        assertNotNull(testOracle0);
    }
}
