/*
 * This file was automatically generated by EvoSuite
 * Fri Apr 11 17:03:12 GMT 2025
 */

package sqlancer.evosuite.materialize.ast;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import sqlancer.common.visitor.UnaryOperation;
import sqlancer.materialize.ast.MaterializeAlias;
import sqlancer.materialize.ast.MaterializeExpression;
import sqlancer.materialize.ast.MaterializePOSIXRegularExpression;
import sqlancer.materialize.ast.MaterializePostfixOperation;
import sqlancer.materialize.ast.MaterializeSelect;

public class MaterializeAlias_ESTest {

    @Test
    public void test0() throws Throwable {
        MaterializePostfixOperation.PostfixOperator materializePostfixOperation_PostfixOperator0 = MaterializePostfixOperation.PostfixOperator.IS_TRUE;
        MaterializeExpression materializeExpression0 = MaterializePostfixOperation.create((MaterializeExpression) null,
                materializePostfixOperation_PostfixOperator0);
        MaterializePOSIXRegularExpression.POSIXRegex materializePOSIXRegularExpression_POSIXRegex0 = MaterializePOSIXRegularExpression.POSIXRegex.MATCH_CASE_SENSITIVE;
        MaterializePOSIXRegularExpression materializePOSIXRegularExpression0 = new MaterializePOSIXRegularExpression(
                materializeExpression0, materializeExpression0, materializePOSIXRegularExpression_POSIXRegex0);
        MaterializeAlias materializeAlias0 = new MaterializeAlias(materializePOSIXRegularExpression0, (String) null);
        MaterializeExpression materializeExpression1 = materializeAlias0.getExpression();
        assertSame(materializePOSIXRegularExpression0, materializeExpression1);
    }

    @Test
    public void test1() throws Throwable {
        MaterializeAlias materializeAlias0 = new MaterializeAlias((MaterializeExpression) null, "E|>-{,3Erg");
        MaterializeExpression materializeExpression0 = materializeAlias0.getExpression();
        assertNull(materializeExpression0);
    }

    @Test
    public void test2() throws Throwable {
        MaterializePostfixOperation.PostfixOperator materializePostfixOperation_PostfixOperator0 = MaterializePostfixOperation.PostfixOperator.IS_TRUE;
        MaterializeExpression materializeExpression0 = MaterializePostfixOperation.create((MaterializeExpression) null,
                materializePostfixOperation_PostfixOperator0);
        MaterializePOSIXRegularExpression.POSIXRegex materializePOSIXRegularExpression_POSIXRegex0 = MaterializePOSIXRegularExpression.POSIXRegex.MATCH_CASE_SENSITIVE;
        MaterializePOSIXRegularExpression materializePOSIXRegularExpression0 = new MaterializePOSIXRegularExpression(
                materializeExpression0, materializeExpression0, materializePOSIXRegularExpression_POSIXRegex0);
        MaterializeAlias materializeAlias0 = new MaterializeAlias(materializePOSIXRegularExpression0, (String) null);
        UnaryOperation.OperatorKind unaryOperation_OperatorKind0 = materializeAlias0.getOperatorKind();
        assertEquals(UnaryOperation.OperatorKind.POSTFIX, unaryOperation_OperatorKind0);
    }

    @Test
    public void test3() throws Throwable {
        MaterializeAlias materializeAlias0 = new MaterializeAlias((MaterializeExpression) null, "E|>-{,3Erg");
        String string0 = materializeAlias0.getOperatorRepresentation();
        assertEquals(" as E|>-{,3Erg", string0);
    }

    @Test
    public void test4() throws Throwable {
        MaterializeSelect materializeSelect0 = new MaterializeSelect();
        MaterializeAlias materializeAlias0 = new MaterializeAlias(materializeSelect0, ":wk3s%.kdZ2l");
        boolean boolean0 = materializeAlias0.omitBracketsWhenPrinting();
        assertTrue(boolean0);
    }
}
