/*
 * This file was automatically generated by EvoSuite
 * Fri Apr 11 23:42:14 GMT 2025
 */

package sqlancer.evosuite.databend.ast;

import static org.junit.jupiter.api.Assertions.*;
import java.util.List;
import org.junit.jupiter.api.Test;
import sqlancer.databend.ast.DatabendExpression;
import sqlancer.databend.ast.DatabendFunctionOperation;
import sqlancer.databend.ast.DatabendSelect;

public class DatabendFunctionOperation_ESTest {

    @Test
    public void test0() throws Throwable {
        DatabendSelect databendSelect0 = new DatabendSelect();
        List<DatabendExpression> list0 = databendSelect0.getOrderByClauses();
        DatabendFunctionOperation<Object> databendFunctionOperation0 = new DatabendFunctionOperation<Object>(list0,
                list0);
    }
}
