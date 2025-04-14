/*
 * This file was automatically generated by EvoSuite
 * Fri Apr 11 18:25:03 GMT 2025
 */

package sqlancer.evosuite.common.visitor;

import static org.junit.jupiter.api.Assertions.*;

import java.math.BigInteger;
import java.util.List;
import org.junit.jupiter.api.Test;
import sqlancer.clickhouse.ast.ClickHouseBinaryLogicalOperation;
import sqlancer.clickhouse.ast.ClickHousePostfixText;
import sqlancer.clickhouse.ast.constant.ClickHouseUInt128Constant;
import sqlancer.clickhouse.ast.constant.ClickHouseUInt256Constant;
import sqlancer.clickhouse.ClickHouseToStringVisitor;
import sqlancer.common.visitor.BinaryOperation;
import sqlancer.common.visitor.UnaryOperation;
import sqlancer.materialize.ast.MaterializeAlias;
import sqlancer.materialize.ast.MaterializeBinaryBitOperation;
import sqlancer.materialize.ast.MaterializeBinaryLogicalOperation;
import sqlancer.materialize.ast.MaterializeColumnValue;
import sqlancer.materialize.ast.MaterializeConstant;
import sqlancer.materialize.ast.MaterializeExpression;
import sqlancer.materialize.ast.MaterializePOSIXRegularExpression;
import sqlancer.materialize.ast.MaterializeSelect;
import sqlancer.materialize.MaterializeSchema;
import sqlancer.materialize.MaterializeToStringVisitor;
import sqlancer.mysql.ast.MySQLExpression;
import sqlancer.mysql.MySQLToStringVisitor;
import sqlancer.oceanbase.ast.OceanBaseCastOperation;
import sqlancer.oceanbase.ast.OceanBaseConstant;
import sqlancer.oceanbase.ast.OceanBaseExpression;
import sqlancer.oceanbase.ast.OceanBaseSelect;
import sqlancer.oceanbase.ast.OceanBaseUnaryPrefixOperation;
import sqlancer.oceanbase.OceanBaseToStringVisitor;
import sqlancer.postgres.ast.PostgresAggregate;
import sqlancer.postgres.ast.PostgresExpression;
import sqlancer.postgres.PostgresToStringVisitor;
import sqlancer.sqlite3.ast.SQLite3Constant;
import sqlancer.sqlite3.ast.SQLite3Expression;
import sqlancer.sqlite3.ast.SQLite3Function;
import sqlancer.sqlite3.ast.SQLite3Select;
import sqlancer.sqlite3.ast.SQLite3WindowFunctionExpression;
import sqlancer.sqlite3.SQLite3ToStringVisitor;

public class ToStringVisitor_ESTest {

    private void verifyException(String s, Exception e) {
    }

    @Test
    public void test00() throws Throwable {
        SQLite3ToStringVisitor sQLite3ToStringVisitor0 = new SQLite3ToStringVisitor();
        SQLite3Select sQLite3Select0 = new SQLite3Select();
        SQLite3WindowFunctionExpression sQLite3WindowFunctionExpression0 = new SQLite3WindowFunctionExpression(
                sQLite3Select0);
        List<SQLite3Expression> list0 = sQLite3WindowFunctionExpression0.getPartitionBy();
        sQLite3ToStringVisitor0.visit(list0);
        assertTrue(list0.isEmpty());
    }

    @Test
    public void test01() throws Throwable {
        SQLite3ToStringVisitor sQLite3ToStringVisitor0 = new SQLite3ToStringVisitor();
        SQLite3Constant sQLite3Constant0 = SQLite3Constant.createFalse();
        sQLite3ToStringVisitor0.visit((SQLite3Expression) sQLite3Constant0);
        assertFalse(sQLite3Constant0.isHex());
    }

    @Test
    public void test02() throws Throwable {
        MaterializeToStringVisitor materializeToStringVisitor0 = new MaterializeToStringVisitor();
        // Undeclared exception!
        try {
            materializeToStringVisitor0.visit((UnaryOperation<MaterializeExpression>) null);
            fail("Expecting exception: NullPointerException");

        } catch (NullPointerException e) {
            //
            // no message in exception (getMessage() returned null)
            //
            verifyException("sqlancer.common.visitor.ToStringVisitor", e);
        }
    }

    @Test
    public void test03() throws Throwable {
        MaterializeSelect materializeSelect0 = new MaterializeSelect();
        MaterializeAlias materializeAlias0 = new MaterializeAlias(materializeSelect0, "#Fh4oT[h<F(U`*");
        MaterializeToStringVisitor materializeToStringVisitor0 = new MaterializeToStringVisitor();
        // Undeclared exception!
        try {
            materializeToStringVisitor0.visit((UnaryOperation<MaterializeExpression>) materializeAlias0);
            fail("Expecting exception: IllegalStateException");

        } catch (IllegalStateException e) {
            //
            // no message in exception (getMessage() returned null)
            //
            verifyException("sqlancer.common.ast.SelectBase", e);
        }
    }

    @Test
    public void test04() throws Throwable {
        MaterializeAlias materializeAlias0 = new MaterializeAlias((MaterializeExpression) null, "");
        MaterializeToStringVisitor materializeToStringVisitor0 = new MaterializeToStringVisitor();
        // Undeclared exception!
        try {
            materializeToStringVisitor0.visit((UnaryOperation<MaterializeExpression>) materializeAlias0);
            fail("Expecting exception: AssertionError");

        } catch (AssertionError e) {
            //
            // no message in exception (getMessage() returned null)
            //
        }
    }

    @Test
    public void test05() throws Throwable {
        MySQLToStringVisitor mySQLToStringVisitor0 = new MySQLToStringVisitor();
        // Undeclared exception!
        try {
            mySQLToStringVisitor0.visit((List<MySQLExpression>) null);
            fail("Expecting exception: NullPointerException");

        } catch (NullPointerException e) {
            //
            // no message in exception (getMessage() returned null)
            //
            verifyException("sqlancer.common.visitor.ToStringVisitor", e);
        }
    }

    @Test
    public void test06() throws Throwable {
        PostgresToStringVisitor postgresToStringVisitor0 = new PostgresToStringVisitor();
        PostgresAggregate.PostgresAggregateFunction postgresAggregate_PostgresAggregateFunction0 = PostgresAggregate.PostgresAggregateFunction.SUM;
        PostgresAggregate postgresAggregate0 = new PostgresAggregate((List<PostgresExpression>) null,
                postgresAggregate_PostgresAggregateFunction0);
        // Undeclared exception!
        try {
            postgresToStringVisitor0.visit((PostgresExpression) postgresAggregate0);
            fail("Expecting exception: NullPointerException");

        } catch (NullPointerException e) {
            //
            // no message in exception (getMessage() returned null)
            //
            verifyException("sqlancer.common.visitor.ToStringVisitor", e);
        }
    }

    @Test
    public void test07() throws Throwable {
        OceanBaseToStringVisitor oceanBaseToStringVisitor0 = new OceanBaseToStringVisitor();
        OceanBaseSelect oceanBaseSelect0 = new OceanBaseSelect();
        // Undeclared exception!
        try {
            oceanBaseToStringVisitor0.visit((OceanBaseExpression) oceanBaseSelect0);
            fail("Expecting exception: IllegalStateException");

        } catch (IllegalStateException e) {
            //
            // no message in exception (getMessage() returned null)
            //
            verifyException("sqlancer.common.ast.SelectBase", e);
        }
    }

    @Test
    public void test08() throws Throwable {
        PostgresToStringVisitor postgresToStringVisitor0 = new PostgresToStringVisitor();
        // Undeclared exception!
        try {
            postgresToStringVisitor0.visit((PostgresExpression) null);
            fail("Expecting exception: AssertionError");

        } catch (AssertionError e) {
            //
            // no message in exception (getMessage() returned null)
            //
        }
    }

    @Test
    public void test09() throws Throwable {
        SQLite3ToStringVisitor sQLite3ToStringVisitor0 = new SQLite3ToStringVisitor();
        SQLite3Select sQLite3Select0 = new SQLite3Select();
        SQLite3Function.ComputableFunction sQLite3Function_ComputableFunction0 = SQLite3Function.ComputableFunction.TYPEOF;
        SQLite3Expression[] sQLite3ExpressionArray0 = new SQLite3Expression[6];
        sQLite3ExpressionArray0[0] = (SQLite3Expression) sQLite3Select0;
        SQLite3Function sQLite3Function0 = new SQLite3Function(sQLite3Function_ComputableFunction0,
                sQLite3ExpressionArray0);
        // Undeclared exception!
        try {
            sQLite3ToStringVisitor0.visit(sQLite3Function0);
            fail("Expecting exception: AssertionError");

        } catch (AssertionError e) {
            //
            // no message in exception (getMessage() returned null)
            //
        }
    }

    @Test
    public void test10() throws Throwable {
        MaterializeToStringVisitor materializeToStringVisitor0 = new MaterializeToStringVisitor();
        MaterializeSchema.MaterializeColumn materializeSchema_MaterializeColumn0 = MaterializeSchema.MaterializeColumn
                .createDummy("");
        MaterializeConstant materializeConstant0 = MaterializeConstant.createBooleanConstant(true);
        MaterializeColumnValue materializeColumnValue0 = new MaterializeColumnValue(
                materializeSchema_MaterializeColumn0, materializeConstant0);
        MaterializeBinaryLogicalOperation.BinaryLogicalOperator materializeBinaryLogicalOperation_BinaryLogicalOperator0 = MaterializeBinaryLogicalOperation.BinaryLogicalOperator.AND;
        MaterializeBinaryLogicalOperation materializeBinaryLogicalOperation0 = new MaterializeBinaryLogicalOperation(
                materializeColumnValue0, materializeConstant0,
                materializeBinaryLogicalOperation_BinaryLogicalOperator0);
        MaterializePOSIXRegularExpression.POSIXRegex materializePOSIXRegularExpression_POSIXRegex0 = MaterializePOSIXRegularExpression.POSIXRegex.MATCH_CASE_INSENSITIVE;
        MaterializePOSIXRegularExpression materializePOSIXRegularExpression0 = new MaterializePOSIXRegularExpression(
                materializeBinaryLogicalOperation0, materializeColumnValue0,
                materializePOSIXRegularExpression_POSIXRegex0);
        materializeToStringVisitor0.visit(materializePOSIXRegularExpression0);
        assertEquals("(()AND(TRUE))~*", materializeToStringVisitor0.get());
    }

    @Test
    public void test11() throws Throwable {
        ClickHouseToStringVisitor clickHouseToStringVisitor0 = new ClickHouseToStringVisitor();
        BigInteger bigInteger0 = BigInteger.TEN;
        ClickHouseUInt256Constant clickHouseUInt256Constant0 = new ClickHouseUInt256Constant(bigInteger0);
        ClickHousePostfixText clickHouseExpression_ClickHousePostfixText0 = new ClickHousePostfixText("varbit_ops",
                clickHouseUInt256Constant0);
        ClickHouseBinaryLogicalOperation.ClickHouseBinaryLogicalOperator clickHouseBinaryLogicalOperation_ClickHouseBinaryLogicalOperator0 = ClickHouseBinaryLogicalOperation.ClickHouseBinaryLogicalOperator.OR;
        ClickHouseBinaryLogicalOperation clickHouseBinaryLogicalOperation0 = new ClickHouseBinaryLogicalOperation(
                clickHouseExpression_ClickHousePostfixText0, clickHouseExpression_ClickHousePostfixText0,
                clickHouseBinaryLogicalOperation_ClickHouseBinaryLogicalOperator0);
        // Undeclared exception!
        try {
            clickHouseToStringVisitor0.visit(clickHouseBinaryLogicalOperation0);
            fail("Expecting exception: AssertionError");

        } catch (AssertionError e) {
            //
            // no message in exception (getMessage() returned null)
            //
        }
    }

    @Test
    public void test12() throws Throwable {
        OceanBaseToStringVisitor oceanBaseToStringVisitor0 = new OceanBaseToStringVisitor();
        OceanBaseConstant.OceanBaseDoubleConstant oceanBaseConstant_OceanBaseDoubleConstant0 = new OceanBaseConstant.OceanBaseDoubleConstant(
                1692.050573);
        OceanBaseUnaryPrefixOperation.OceanBaseUnaryPrefixOperator oceanBaseUnaryPrefixOperation_OceanBaseUnaryPrefixOperator0 = OceanBaseUnaryPrefixOperation.OceanBaseUnaryPrefixOperator.MINUS;
        OceanBaseUnaryPrefixOperation oceanBaseUnaryPrefixOperation0 = new OceanBaseUnaryPrefixOperation(
                oceanBaseConstant_OceanBaseDoubleConstant0,
                oceanBaseUnaryPrefixOperation_OceanBaseUnaryPrefixOperator0);
        OceanBaseCastOperation.CastType oceanBaseCastOperation_CastType0 = OceanBaseCastOperation.CastType.UNSIGNED;
        OceanBaseCastOperation oceanBaseCastOperation0 = new OceanBaseCastOperation(oceanBaseUnaryPrefixOperation0,
                oceanBaseCastOperation_CastType0);
        oceanBaseToStringVisitor0.visit(oceanBaseCastOperation0);
        assertEquals("CAST((- (1692.050573)) AS UNSIGNED)", oceanBaseToStringVisitor0.get());
    }

    @Test
    public void test13() throws Throwable {
        MaterializeToStringVisitor materializeToStringVisitor0 = new MaterializeToStringVisitor();
        MaterializeConstant materializeConstant0 = MaterializeConstant.createTrue();
        MaterializeAlias materializeAlias0 = new MaterializeAlias(materializeConstant0, " u@CnIuz");
        materializeToStringVisitor0.visit((UnaryOperation<MaterializeExpression>) materializeAlias0);
        assertEquals("TRUE  as  u@CnIuz", materializeToStringVisitor0.get());
    }

    @Test
    public void test14() throws Throwable {
        MaterializeToStringVisitor materializeToStringVisitor0 = new MaterializeToStringVisitor();
        MaterializeBinaryBitOperation.MaterializeBinaryBitOperator materializeBinaryBitOperation_MaterializeBinaryBitOperator0 = MaterializeBinaryBitOperation.MaterializeBinaryBitOperator.BITWISE_AND;
        MaterializeConstant.DoubleConstant materializeConstant_DoubleConstant0 = new MaterializeConstant.DoubleConstant(
                1.7976931348623157E308);
        MaterializeBinaryBitOperation materializeBinaryBitOperation0 = new MaterializeBinaryBitOperation(
                materializeBinaryBitOperation_MaterializeBinaryBitOperator0, materializeConstant_DoubleConstant0,
                materializeConstant_DoubleConstant0);
        materializeToStringVisitor0.visit((BinaryOperation<MaterializeExpression>) materializeBinaryBitOperation0);
        assertEquals("((1.7976931348623157E308)&(1.7976931348623157E308))", materializeToStringVisitor0.get());
    }

    @Test
    public void test15() throws Throwable {
        ClickHouseUInt128Constant clickHouseUInt128Constant0 = new ClickHouseUInt128Constant((BigInteger) null);
        ClickHouseToStringVisitor.asString(clickHouseUInt128Constant0);
    }
}
