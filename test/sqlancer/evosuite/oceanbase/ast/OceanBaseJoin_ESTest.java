/*
 * This file was automatically generated by EvoSuite
 * Fri Apr 11 23:43:24 GMT 2025
 */

package sqlancer.evosuite.oceanbase.ast;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import sqlancer.oceanbase.ast.OceanBaseConstant;
import sqlancer.oceanbase.ast.OceanBaseExpression;
import sqlancer.oceanbase.ast.OceanBaseJoin;

public class OceanBaseJoin_ESTest {

    private void verifyException(String s, Exception e) {
    }

    @Test
    public void test0() throws Throwable {
        OceanBaseJoin oceanBaseJoin0 = new OceanBaseJoin();
        OceanBaseConstant.OceanBaseTextConstant oceanBaseConstant_OceanBaseTextConstant0 = new OceanBaseConstant.OceanBaseTextConstant(
                "sqlancer.oceanbase.ast.OceanBaseJoin");
        OceanBaseConstant oceanBaseConstant0 = oceanBaseConstant_OceanBaseTextConstant0.castAsDouble();
        oceanBaseJoin0.setOnClause((OceanBaseExpression) oceanBaseConstant0);
        assertEquals("0", oceanBaseConstant0.getTextRepresentation());
    }

    @Test
    public void test1() throws Throwable {
        OceanBaseJoin oceanBaseJoin0 = new OceanBaseJoin();
        // Undeclared exception!
        try {
            oceanBaseJoin0.getExpectedValue();
            fail("Expecting exception: UnsupportedOperationException");

        } catch (UnsupportedOperationException e) {
            //
            // no message in exception (getMessage() returned null)
            //
            verifyException("sqlancer.oceanbase.ast.OceanBaseJoin", e);
        }
    }
}
