/*
 * This file was automatically generated by EvoSuite
 * Fri Apr 11 21:54:37 GMT 2025
 */

package sqlancer.evosuite.cnosdb.gen;

import static org.junit.jupiter.api.Assertions.*;
import java.nio.CharBuffer;
import org.junit.jupiter.api.Test;
import sqlancer.cnosdb.CnosDBSchema;
import sqlancer.cnosdb.gen.CnosDBCommon;

public class CnosDBCommon_ESTest {

    private void verifyException(String s, Exception e) {
    }

    @Test
    public void test0() throws Throwable {
        CnosDBSchema.CnosDBDataType cnosDBSchema_CnosDBDataType0 = CnosDBSchema.CnosDBDataType.UINT;
        CharBuffer charBuffer0 = CharBuffer.allocate(0);
        StringBuilder stringBuilder0 = new StringBuilder(charBuffer0);
        CnosDBCommon.appendDataType(cnosDBSchema_CnosDBDataType0, stringBuilder0);
        assertEquals("BIGINT UNSIGNED", stringBuilder0.toString());
    }

    @Test
    public void test1() throws Throwable {
        CnosDBSchema.CnosDBDataType cnosDBSchema_CnosDBDataType0 = CnosDBSchema.CnosDBDataType.DOUBLE;
        StringBuilder stringBuilder0 = new StringBuilder(0);
        CnosDBCommon.appendDataType(cnosDBSchema_CnosDBDataType0, stringBuilder0);
        assertEquals("DOUBLE", stringBuilder0.toString());
    }

    @Test
    public void test2() throws Throwable {
        CnosDBSchema.CnosDBDataType cnosDBSchema_CnosDBDataType0 = CnosDBSchema.CnosDBDataType.STRING;
        StringBuilder stringBuilder0 = new StringBuilder(11);
        CnosDBCommon.appendDataType(cnosDBSchema_CnosDBDataType0, stringBuilder0);
        assertEquals("STRING", stringBuilder0.toString());
    }

    @Test
    public void test3() throws Throwable {
        CharBuffer charBuffer0 = CharBuffer.allocate(0);
        StringBuilder stringBuilder0 = new StringBuilder(charBuffer0);
        CnosDBSchema.CnosDBDataType cnosDBSchema_CnosDBDataType0 = CnosDBSchema.CnosDBDataType.INT;
        CnosDBCommon.appendDataType(cnosDBSchema_CnosDBDataType0, stringBuilder0);
        assertEquals("BIGINT", stringBuilder0.toString());
    }

    @Test
    public void test4() throws Throwable {
        CnosDBSchema.CnosDBDataType cnosDBSchema_CnosDBDataType0 = CnosDBSchema.CnosDBDataType.TIMESTAMP;
        try {
            CnosDBCommon.appendDataType(cnosDBSchema_CnosDBDataType0, (StringBuilder) null);
            fail("Expecting exception: AssertionError");

        } catch (AssertionError e) {
            //
            // TIMESTAMP
            //
        }
    }

    @Test
    public void test5() throws Throwable {
        CnosDBSchema.CnosDBDataType cnosDBSchema_CnosDBDataType0 = CnosDBSchema.CnosDBDataType.UINT;
        // Undeclared exception!
        try {
            CnosDBCommon.appendDataType(cnosDBSchema_CnosDBDataType0, (StringBuilder) null);
            fail("Expecting exception: NullPointerException");

        } catch (NullPointerException e) {
            //
            // no message in exception (getMessage() returned null)
            //
            verifyException("sqlancer.cnosdb.gen.CnosDBCommon", e);
        }
    }

    @Test
    public void test6() throws Throwable {
        CnosDBSchema.CnosDBDataType cnosDBSchema_CnosDBDataType0 = CnosDBSchema.CnosDBDataType.BOOLEAN;
        StringBuilder stringBuilder0 = new StringBuilder(0);
        CnosDBCommon.appendDataType(cnosDBSchema_CnosDBDataType0, stringBuilder0);
        assertEquals("BOOLEAN", stringBuilder0.toString());
    }
}
