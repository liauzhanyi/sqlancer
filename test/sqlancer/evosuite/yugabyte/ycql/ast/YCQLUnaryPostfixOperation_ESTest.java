/*
 * This file was automatically generated by EvoSuite
 * Fri Apr 11 17:07:06 GMT 2025
 */

package sqlancer.evosuite.yugabyte.ycql.ast;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import sqlancer.h2.H2ExpressionGenerator;
import sqlancer.yugabyte.ycql.ast.YCQLConstant;
import sqlancer.yugabyte.ycql.ast.YCQLUnaryPostfixOperation;

public class YCQLUnaryPostfixOperation_ESTest {

    @Test
    public void test0() throws Throwable {
        YCQLConstant.YCQLDoubleConstant yCQLConstant_YCQLDoubleConstant0 = new YCQLConstant.YCQLDoubleConstant(
                (-3582.008));
        H2ExpressionGenerator.H2UnaryPostfixOperator h2ExpressionGenerator_H2UnaryPostfixOperator0 = H2ExpressionGenerator.H2UnaryPostfixOperator.IS_NULL;
        YCQLUnaryPostfixOperation yCQLUnaryPostfixOperation0 = new YCQLUnaryPostfixOperation(
                yCQLConstant_YCQLDoubleConstant0, h2ExpressionGenerator_H2UnaryPostfixOperator0);
    }
}
