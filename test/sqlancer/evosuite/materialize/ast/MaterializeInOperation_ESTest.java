/*
 * This file was automatically generated by EvoSuite
 * Fri Apr 11 18:39:49 GMT 2025
 */

package sqlancer.evosuite.materialize.ast;

import static org.junit.jupiter.api.Assertions.*;

import java.util.LinkedList;
import java.util.List;
import org.junit.jupiter.api.Test;
import sqlancer.materialize.ast.MaterializeBinaryBitOperation;
import sqlancer.materialize.ast.MaterializeConstant;
import sqlancer.materialize.ast.MaterializeExpression;
import sqlancer.materialize.ast.MaterializeInOperation;
import sqlancer.materialize.ast.MaterializeLikeOperation;
import sqlancer.materialize.ast.MaterializeOrderByTerm;
import sqlancer.materialize.ast.MaterializePostfixOperation;
import sqlancer.materialize.ast.MaterializeSelect;
import sqlancer.materialize.MaterializeSchema;
import sqlancer.Randomly;

public class MaterializeInOperation_ESTest {

    private void verifyException(String s, Exception e) {
    }

    @Test
    public void test00() throws Throwable {
        MaterializeSelect materializeSelect0 = new MaterializeSelect();
        List<MaterializeExpression> list0 = materializeSelect0.getGroupByExpressions();
        MaterializeInOperation materializeInOperation0 = new MaterializeInOperation(materializeSelect0, list0, false);
        boolean boolean0 = materializeInOperation0.isTrue();
        assertFalse(boolean0);
    }

    @Test
    public void test01() throws Throwable {
        MaterializeConstant.StringConstant materializeConstant_StringConstant0 = new MaterializeConstant.StringConstant(
                "yWnq3Z*lXGXe?");
        MaterializeSchema.MaterializeDataType materializeSchema_MaterializeDataType0 = MaterializeSchema.MaterializeDataType.INT;
        MaterializeConstant materializeConstant0 = materializeConstant_StringConstant0
                .cast(materializeSchema_MaterializeDataType0);
        MaterializeInOperation materializeInOperation0 = new MaterializeInOperation(materializeConstant0,
                (List<MaterializeExpression>) null, false);
        materializeInOperation0.getListElements();
        assertFalse(materializeInOperation0.isTrue());
    }

    @Test
    public void test02() throws Throwable {
        MaterializeConstant.BooleanConstant materializeConstant_BooleanConstant0 = new MaterializeConstant.BooleanConstant(
                true);
        MaterializeExpression[] materializeExpressionArray0 = new MaterializeExpression[8];
        List<MaterializeExpression> list0 = Randomly.nonEmptySubset(materializeExpressionArray0);
        List<MaterializeExpression> list1 = Randomly.subset(list0);
        MaterializeInOperation materializeInOperation0 = new MaterializeInOperation(
                materializeConstant_BooleanConstant0, list1, true);
        materializeInOperation0.getListElements();
        assertTrue(materializeInOperation0.isTrue());
    }

    @Test
    public void test03() throws Throwable {
        MaterializeExpression[] materializeExpressionArray0 = new MaterializeExpression[2];
        List<MaterializeExpression> list0 = Randomly.subset(materializeExpressionArray0);
        MaterializeInOperation materializeInOperation0 = new MaterializeInOperation((MaterializeExpression) null, list0,
                true);
        materializeInOperation0.getExpr();
        assertTrue(materializeInOperation0.isTrue());
    }

    @Test
    public void test04() throws Throwable {
        MaterializeConstant materializeConstant0 = MaterializeConstant.createFalse();
        LinkedList<MaterializeExpression> linkedList0 = new LinkedList<MaterializeExpression>();
        MaterializeLikeOperation materializeLikeOperation0 = new MaterializeLikeOperation(materializeConstant0,
                materializeConstant0);
        MaterializeInOperation materializeInOperation0 = new MaterializeInOperation(materializeLikeOperation0,
                linkedList0, false);
        // Undeclared exception!
        try {
            materializeInOperation0.getExpectedValue();
            fail("Expecting exception: UnsupportedOperationException");

        } catch (UnsupportedOperationException e) {
            //
            // FALSE
            //
            verifyException("sqlancer.materialize.ast.MaterializeConstant", e);
        }
    }

    @Test
    public void test05() throws Throwable {
        MaterializeConstant.StringConstant materializeConstant_StringConstant0 = new MaterializeConstant.StringConstant(
                "yWnq3Z*lXGXe?");
        MaterializeSchema.MaterializeDataType materializeSchema_MaterializeDataType0 = MaterializeSchema.MaterializeDataType.INT;
        MaterializeConstant materializeConstant0 = materializeConstant_StringConstant0
                .cast(materializeSchema_MaterializeDataType0);
        MaterializeInOperation materializeInOperation0 = new MaterializeInOperation(materializeConstant0,
                (List<MaterializeExpression>) null, false);
        // Undeclared exception!
        try {
            materializeInOperation0.getExpectedValue();
            fail("Expecting exception: NullPointerException");

        } catch (NullPointerException e) {
            //
            // no message in exception (getMessage() returned null)
            //
            verifyException("sqlancer.materialize.ast.MaterializeInOperation", e);
        }
    }

    @Test
    public void test06() throws Throwable {
        MaterializeConstant materializeConstant0 = MaterializeConstant.createFalse();
        LinkedList<MaterializeExpression> linkedList0 = new LinkedList<MaterializeExpression>();
        MaterializeOrderByTerm.MaterializeOrder materializeOrderByTerm_MaterializeOrder0 = MaterializeOrderByTerm.MaterializeOrder.DESC;
        MaterializeOrderByTerm materializeOrderByTerm0 = new MaterializeOrderByTerm(materializeConstant0,
                materializeOrderByTerm_MaterializeOrder0);
        MaterializeInOperation materializeInOperation0 = new MaterializeInOperation(materializeOrderByTerm0,
                linkedList0, true);
        // Undeclared exception!
        try {
            materializeInOperation0.getExpectedValue();
            fail("Expecting exception: AssertionError");

        } catch (AssertionError e) {
            //
            // sqlancer.materialize.ast.MaterializeOrderByTerm@2
            //
        }
    }

    @Test
    public void test07() throws Throwable {
        MaterializeConstant materializeConstant0 = MaterializeConstant.createFalse();
        MaterializePostfixOperation.PostfixOperator materializePostfixOperation_PostfixOperator0 = MaterializePostfixOperation.PostfixOperator.IS_NOT_NULL;
        MaterializeExpression materializeExpression0 = MaterializePostfixOperation.create(materializeConstant0,
                materializePostfixOperation_PostfixOperator0);
        MaterializeExpression[] materializeExpressionArray0 = new MaterializeExpression[2];
        List<MaterializeExpression> list0 = Randomly.subset(1, materializeExpressionArray0);
        MaterializeInOperation materializeInOperation0 = new MaterializeInOperation(materializeExpression0, list0,
                false);
        materializeInOperation0.getListElements();
        assertFalse(materializeInOperation0.isTrue());
    }

    @Test
    public void test08() throws Throwable {
        MaterializeConstant materializeConstant0 = MaterializeConstant.createFalse();
        MaterializePostfixOperation.PostfixOperator materializePostfixOperation_PostfixOperator0 = MaterializePostfixOperation.PostfixOperator.IS_NOT_NULL;
        MaterializeExpression materializeExpression0 = MaterializePostfixOperation.create(materializeConstant0,
                materializePostfixOperation_PostfixOperator0);
        MaterializeExpression[] materializeExpressionArray0 = new MaterializeExpression[2];
        materializeExpressionArray0[1] = (MaterializeExpression) materializeConstant0;
        List<MaterializeExpression> list0 = Randomly.subset(1, materializeExpressionArray0);
        MaterializeInOperation materializeInOperation0 = new MaterializeInOperation(materializeExpression0, list0,
                false);
        MaterializeConstant materializeConstant1 = materializeInOperation0.getExpectedValue();
        assertEquals("TRUE", materializeConstant1.getTextRepresentation());
    }

    @Test
    public void test09() throws Throwable {
        MaterializeConstant materializeConstant0 = MaterializeConstant.createFalse();
        LinkedList<MaterializeExpression> linkedList0 = new LinkedList<MaterializeExpression>();
        linkedList0.add((MaterializeExpression) materializeConstant0);
        MaterializeConstant materializeConstant1 = MaterializeConstant.createTrue();
        MaterializeInOperation materializeInOperation0 = new MaterializeInOperation(materializeConstant1, linkedList0,
                true);
        MaterializeConstant materializeConstant2 = materializeInOperation0.getExpectedValue();
        assertEquals("FALSE", materializeConstant2.getTextRepresentation());
    }

    @Test
    public void test10() throws Throwable {
        MaterializeConstant materializeConstant0 = MaterializeConstant.createFalse();
        LinkedList<MaterializeExpression> linkedList0 = new LinkedList<MaterializeExpression>();
        MaterializeConstant materializeConstant1 = MaterializeConstant.createNullConstant();
        linkedList0.add((MaterializeExpression) materializeConstant1);
        MaterializeInOperation materializeInOperation0 = new MaterializeInOperation(materializeConstant0, linkedList0,
                true);
        materializeInOperation0.getExpectedValue();
        assertTrue(materializeInOperation0.isTrue());
    }

    @Test
    public void test11() throws Throwable {
        MaterializeConstant materializeConstant0 = MaterializeConstant.createFalse();
        LinkedList<MaterializeExpression> linkedList0 = new LinkedList<MaterializeExpression>();
        MaterializeBinaryBitOperation.MaterializeBinaryBitOperator materializeBinaryBitOperation_MaterializeBinaryBitOperator0 = MaterializeBinaryBitOperation.MaterializeBinaryBitOperator.BITWISE_SHIFT_LEFT;
        MaterializeBinaryBitOperation materializeBinaryBitOperation0 = new MaterializeBinaryBitOperation(
                materializeBinaryBitOperation_MaterializeBinaryBitOperator0, materializeConstant0,
                materializeConstant0);
        linkedList0.add((MaterializeExpression) materializeBinaryBitOperation0);
        MaterializeInOperation materializeInOperation0 = new MaterializeInOperation(materializeConstant0, linkedList0,
                true);
        MaterializeConstant materializeConstant1 = materializeInOperation0.getExpectedValue();
        assertNull(materializeConstant1);
        assertTrue(materializeInOperation0.isTrue());
    }

    @Test
    public void test12() throws Throwable {
        MaterializeConstant materializeConstant0 = MaterializeConstant.createFalse();
        LinkedList<MaterializeExpression> linkedList0 = new LinkedList<MaterializeExpression>();
        linkedList0.add((MaterializeExpression) materializeConstant0);
        MaterializeInOperation materializeInOperation0 = new MaterializeInOperation(materializeConstant0, linkedList0,
                true);
        MaterializeConstant materializeConstant1 = materializeInOperation0.getExpectedValue();
        assertTrue(materializeConstant1.asBoolean());
        assertNotNull(materializeConstant1);
    }

    @Test
    public void test13() throws Throwable {
        LinkedList<MaterializeExpression> linkedList0 = new LinkedList<MaterializeExpression>();
        MaterializeConstant materializeConstant0 = MaterializeConstant.createNullConstant();
        MaterializeInOperation materializeInOperation0 = new MaterializeInOperation(materializeConstant0, linkedList0,
                true);
        materializeInOperation0.getExpectedValue();
        assertTrue(materializeInOperation0.isTrue());
    }

    @Test
    public void test14() throws Throwable {
        MaterializeSelect materializeSelect0 = new MaterializeSelect();
        MaterializeExpression[] materializeExpressionArray0 = new MaterializeExpression[5];
        materializeExpressionArray0[3] = (MaterializeExpression) materializeSelect0;
        List<MaterializeExpression> list0 = Randomly.nonEmptySubset(materializeExpressionArray0);
        MaterializeInOperation materializeInOperation0 = new MaterializeInOperation(materializeExpressionArray0[3],
                list0, true);
        materializeInOperation0.getExpectedValue();
        assertTrue(materializeInOperation0.isTrue());
    }

    @Test
    public void test15() throws Throwable {
        MaterializeExpression[] materializeExpressionArray0 = new MaterializeExpression[8];
        List<MaterializeExpression> list0 = Randomly.nonEmptySubset(materializeExpressionArray0);
        MaterializeInOperation materializeInOperation0 = new MaterializeInOperation(materializeExpressionArray0[2],
                list0, true);
        boolean boolean0 = materializeInOperation0.isTrue();
        assertTrue(boolean0);
    }

    @Test
    public void test16() throws Throwable {
        MaterializeConstant materializeConstant0 = MaterializeConstant.createFalse();
        LinkedList<MaterializeExpression> linkedList0 = new LinkedList<MaterializeExpression>();
        MaterializeInOperation materializeInOperation0 = new MaterializeInOperation(materializeConstant0, linkedList0,
                true);
        materializeInOperation0.getExpr();
        assertTrue(materializeInOperation0.isTrue());
    }

    @Test
    public void test17() throws Throwable {
        MaterializeConstant materializeConstant0 = MaterializeConstant.createFalse();
        MaterializePostfixOperation.PostfixOperator materializePostfixOperation_PostfixOperator0 = MaterializePostfixOperation.PostfixOperator.IS_NOT_NULL;
        MaterializeExpression materializeExpression0 = MaterializePostfixOperation.create(materializeConstant0,
                materializePostfixOperation_PostfixOperator0);
        MaterializeExpression[] materializeExpressionArray0 = new MaterializeExpression[2];
        List<MaterializeExpression> list0 = Randomly.subset(1, materializeExpressionArray0);
        MaterializeInOperation materializeInOperation0 = new MaterializeInOperation(materializeExpression0, list0,
                false);
        materializeInOperation0.getExpressionType();
        assertFalse(materializeInOperation0.isTrue());
    }
}
