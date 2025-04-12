/*
 * This file was automatically generated by EvoSuite
 * Fri Apr 11 16:50:45 GMT 2025
 */

package sqlancer.evosuite.postgres.ast;

import static org.junit.jupiter.api.Assertions.*;
import java.util.List;
import org.junit.jupiter.api.Test;
import sqlancer.postgres.ast.PostgresAggregate;
import sqlancer.postgres.ast.PostgresExpression;
import sqlancer.postgres.ast.PostgresSelect;
import sqlancer.postgres.PostgresSchema;

public class PostgresAggregate_ESTest {

    @Test
    public void test0() throws Throwable {
        PostgresAggregate.PostgresAggregateFunction postgresAggregate_PostgresAggregateFunction0 = PostgresAggregate.PostgresAggregateFunction.MIN;
        PostgresSchema.PostgresDataType postgresSchema_PostgresDataType0 = PostgresSchema.PostgresDataType.INT;
        boolean boolean0 = postgresAggregate_PostgresAggregateFunction0
                .supportsReturnType(postgresSchema_PostgresDataType0);
        assertTrue(boolean0);
    }

    @Test
    public void test1() throws Throwable {
        PostgresAggregate.PostgresAggregateFunction postgresAggregate_PostgresAggregateFunction0 = PostgresAggregate.PostgresAggregateFunction.MIN;
        PostgresSchema.PostgresDataType postgresSchema_PostgresDataType0 = postgresAggregate_PostgresAggregateFunction0
                .getRandomReturnType();
        assertEquals(PostgresSchema.PostgresDataType.INT, postgresSchema_PostgresDataType0);
    }

    @Test
    public void test2() throws Throwable {
        PostgresAggregate.PostgresAggregateFunction postgresAggregate_PostgresAggregateFunction0 = PostgresAggregate.PostgresAggregateFunction.BOOL_OR;
        PostgresSchema.PostgresDataType postgresSchema_PostgresDataType0 = postgresAggregate_PostgresAggregateFunction0
                .getRandomReturnType();
        assertEquals(PostgresSchema.PostgresDataType.BOOLEAN, postgresSchema_PostgresDataType0);
    }

    @Test
    public void test3() throws Throwable {
        PostgresAggregate.PostgresAggregateFunction postgresAggregate_PostgresAggregateFunction0 = PostgresAggregate.PostgresAggregateFunction.MIN;
        PostgresSelect postgresSelect0 = new PostgresSelect();
        List<PostgresExpression> list0 = postgresSelect0.getGroupByExpressions();
        PostgresAggregate postgresAggregate0 = new PostgresAggregate(list0,
                postgresAggregate_PostgresAggregateFunction0);
    }

    @Test
    public void test4() throws Throwable {
        PostgresSchema.PostgresDataType postgresSchema_PostgresDataType0 = PostgresSchema.PostgresDataType.BOOLEAN;
        List<PostgresAggregate.PostgresAggregateFunction> list0 = PostgresAggregate.PostgresAggregateFunction
                .getAggregates(postgresSchema_PostgresDataType0);
        assertEquals(5, list0.size());
    }

    @Test
    public void test5() throws Throwable {
        PostgresAggregate.PostgresAggregateFunction postgresAggregate_PostgresAggregateFunction0 = PostgresAggregate.PostgresAggregateFunction.MIN;
        PostgresSchema.PostgresDataType postgresSchema_PostgresDataType0 = PostgresSchema.PostgresDataType.INT;
        List<PostgresSchema.PostgresDataType> list0 = postgresAggregate_PostgresAggregateFunction0
                .getTypes(postgresSchema_PostgresDataType0);
        assertTrue(list0.contains(postgresSchema_PostgresDataType0));
    }
}
