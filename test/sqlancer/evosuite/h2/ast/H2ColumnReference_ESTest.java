/*
 * This file was automatically generated by EvoSuite
 * Sat Apr 12 02:04:19 GMT 2025
 */

package sqlancer.evosuite.h2.ast;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import sqlancer.h2.ast.H2ColumnReference;
import sqlancer.h2.H2Schema;

public class H2ColumnReference_ESTest {

    @Test
    public void test0() throws Throwable {
        H2Schema.H2CompositeDataType h2Schema_H2CompositeDataType0 = H2Schema.H2CompositeDataType.getRandom();
        H2Schema.H2Column h2Schema_H2Column0 = new H2Schema.H2Column("`4", h2Schema_H2CompositeDataType0);
        H2ColumnReference h2ColumnReference0 = new H2ColumnReference(h2Schema_H2Column0);
    }
}
