/*
 * This file was automatically generated by EvoSuite
 * Fri Apr 11 19:49:18 GMT 2025
 */

package sqlancer.evosuite.presto.ast;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import sqlancer.presto.ast.PrestoDateFunction;
import sqlancer.presto.ast.PrestoTernary;

public class PrestoTernary_ESTest {

    @Test
    public void test0() throws Throwable {
        PrestoDateFunction prestoDateFunction0 = PrestoDateFunction.CURRENT_TIMEZONE;
        PrestoTernary prestoTernary0 = new PrestoTernary(prestoDateFunction0, prestoDateFunction0, prestoDateFunction0,
                ".~C#l@>b}krs", (String) null);
        assertNull(prestoTernary0.getRightStr());
    }
}
