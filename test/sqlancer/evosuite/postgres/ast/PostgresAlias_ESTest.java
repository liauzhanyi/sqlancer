/*
 * This file was automatically generated by EvoSuite
 * Fri Apr 11 21:47:35 GMT 2025
 */

package sqlancer.evosuite.postgres.ast;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import sqlancer.common.visitor.UnaryOperation;
import sqlancer.postgres.ast.PostgresAlias;
import sqlancer.postgres.ast.PostgresConstant;
import sqlancer.postgres.ast.PostgresExpression;
import sqlancer.postgres.PostgresSchema;

public class PostgresAlias_ESTest {

    @Test
    public void test0() throws Throwable {
        PostgresConstant.BooleanConstant postgresConstant_BooleanConstant0 = new PostgresConstant.BooleanConstant(true);
        PostgresSchema.PostgresDataType postgresSchema_PostgresDataType0 = PostgresSchema.PostgresDataType.INT;
        PostgresConstant postgresConstant0 = postgresConstant_BooleanConstant0.cast(postgresSchema_PostgresDataType0);
        PostgresAlias postgresAlias0 = new PostgresAlias(postgresConstant0, "Y(j.OT3G");
        PostgresConstant.IntConstant postgresConstant_IntConstant0 = (PostgresConstant.IntConstant) postgresAlias0
                .getExpression();
        assertEquals("1", postgresConstant_IntConstant0.getUnquotedTextRepresentation());
    }

    @Test
    public void test1() throws Throwable {
        PostgresAlias postgresAlias0 = new PostgresAlias((PostgresExpression) null,
                "sqlancer.postgres.ast.PostgresAlias");
        boolean boolean0 = postgresAlias0.omitBracketsWhenPrinting();
        assertTrue(boolean0);
    }

    @Test
    public void test2() throws Throwable {
        PostgresAlias postgresAlias0 = new PostgresAlias((PostgresExpression) null,
                "sqlancer.postgres.ast.PostgresAlias");
        UnaryOperation.OperatorKind unaryOperation_OperatorKind0 = postgresAlias0.getOperatorKind();
        assertEquals(UnaryOperation.OperatorKind.POSTFIX, unaryOperation_OperatorKind0);
    }

    @Test
    public void test3() throws Throwable {
        PostgresAlias postgresAlias0 = new PostgresAlias((PostgresExpression) null,
                "sqlancer.postgres.ast.PostgresAlias");
        String string0 = postgresAlias0.getOperatorRepresentation();
        assertEquals(" as sqlancer.postgres.ast.PostgresAlias", string0);
    }

    @Test
    public void test4() throws Throwable {
        PostgresAlias postgresAlias0 = new PostgresAlias((PostgresExpression) null, "/D\u0004Jng");
        PostgresExpression postgresExpression0 = postgresAlias0.getExpression();
        assertNull(postgresExpression0);
    }
}
