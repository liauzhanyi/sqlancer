/*
 * This file was automatically generated by EvoSuite
 * Fri Apr 11 17:29:04 GMT 2025
 */

package sqlancer.evosuite.tidb.gen;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import sqlancer.tidb.gen.TiDBTableGenerator;
import sqlancer.tidb.TiDBProvider;
import sqlancer.tidb.TiDBSchema;

public class TiDBTableGenerator_ESTest {

    private void verifyException(String s, Exception e) {
    }

    @Test
    public void test0() throws Throwable {
        TiDBTableGenerator tiDBTableGenerator0 = new TiDBTableGenerator();
        // Undeclared exception!
        try {
            tiDBTableGenerator0.getQuery((TiDBProvider.TiDBGlobalState) null);
            fail("Expecting exception: NullPointerException");

        } catch (NullPointerException e) {
            //
            // no message in exception (getMessage() returned null)
            //
            verifyException("sqlancer.tidb.gen.TiDBTableGenerator", e);
        }
    }

    @Test
    public void test1() throws Throwable {
        // Undeclared exception!
        try {
            TiDBTableGenerator.createRandomTableStatement((TiDBProvider.TiDBGlobalState) null);
            fail("Expecting exception: NullPointerException");

        } catch (NullPointerException e) {
            //
            // no message in exception (getMessage() returned null)
            //
            verifyException("sqlancer.tidb.gen.TiDBTableGenerator", e);
        }
    }

    @Test
    public void test2() throws Throwable {
        TiDBProvider.TiDBGlobalState tiDBProvider_TiDBGlobalState0 = new TiDBProvider.TiDBGlobalState();
        // Undeclared exception!
        try {
            TiDBTableGenerator.createRandomTableStatement(tiDBProvider_TiDBGlobalState0);
            fail("Expecting exception: AssertionError");

        } catch (AssertionError e) {
            //
            // null
            //
        }
    }

    @Test
    public void test3() throws Throwable {
        TiDBSchema.TiDBDataType tiDBSchema_TiDBDataType0 = TiDBSchema.TiDBDataType.BLOB;
        // Undeclared exception!
        try {
            TiDBTableGenerator.appendSpecifiers((StringBuilder) null, tiDBSchema_TiDBDataType0);
            fail("Expecting exception: NullPointerException");

        } catch (NullPointerException e) {
            //
            // no message in exception (getMessage() returned null)
            //
            verifyException("sqlancer.tidb.gen.TiDBTableGenerator", e);
        }
    }

    @Test
    public void test4() throws Throwable {
        TiDBSchema.TiDBDataType tiDBSchema_TiDBDataType0 = TiDBSchema.TiDBDataType.CHAR;
        TiDBTableGenerator.appendSpecifiers((StringBuilder) null, tiDBSchema_TiDBDataType0);
    }

    @Test
    public void test5() throws Throwable {
        StringBuilder stringBuilder0 = new StringBuilder(3685);
        TiDBSchema.TiDBDataType tiDBSchema_TiDBDataType0 = TiDBSchema.TiDBDataType.TEXT;
        TiDBTableGenerator.appendSpecifiers(stringBuilder0, tiDBSchema_TiDBDataType0);
        assertEquals("(1)", stringBuilder0.toString());
    }

    @Test
    public void test6() throws Throwable {
        TiDBTableGenerator tiDBTableGenerator0 = new TiDBTableGenerator();
        TiDBProvider.TiDBGlobalState tiDBProvider_TiDBGlobalState0 = new TiDBProvider.TiDBGlobalState();
        // Undeclared exception!
        try {
            tiDBTableGenerator0.getQuery(tiDBProvider_TiDBGlobalState0);
            fail("Expecting exception: AssertionError");

        } catch (AssertionError e) {
            //
            // null
            //
        }
    }
}
