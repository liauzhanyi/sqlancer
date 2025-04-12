/*
 * This file was automatically generated by EvoSuite
 * Fri Apr 11 13:47:52 GMT 2025
 */

package sqlancer.evosuite.yugabyte.ysql.ast;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import sqlancer.yugabyte.ysql.ast.YSQLColumnValue;
import sqlancer.yugabyte.ysql.ast.YSQLConstant;
import sqlancer.yugabyte.ysql.YSQLSchema;

public class YSQLColumnValue_ESTest {

    private void verifyException(String s, Exception e) {
    }

    @Test
    public void test0() throws Throwable {
        YSQLSchema.YSQLDataType ySQLSchema_YSQLDataType0 = YSQLSchema.YSQLDataType.BIT;
        YSQLSchema.YSQLColumn ySQLSchema_YSQLColumn0 = new YSQLSchema.YSQLColumn("yO#FBmR0.ap{}T1<2",
                ySQLSchema_YSQLDataType0);
        YSQLConstant.StringConstant ySQLConstant_StringConstant0 = new YSQLConstant.StringConstant("yO#FBmR0.ap{}T1<2");
        YSQLColumnValue ySQLColumnValue0 = new YSQLColumnValue(ySQLSchema_YSQLColumn0, ySQLConstant_StringConstant0);
        YSQLSchema.YSQLDataType ySQLSchema_YSQLDataType1 = ySQLColumnValue0.getExpressionType();
        assertSame(ySQLSchema_YSQLDataType1, ySQLSchema_YSQLDataType0);
    }

    @Test
    public void test1() throws Throwable {
        YSQLSchema.YSQLDataType ySQLSchema_YSQLDataType0 = YSQLSchema.YSQLDataType.BIT;
        YSQLSchema.YSQLColumn ySQLSchema_YSQLColumn0 = new YSQLSchema.YSQLColumn("yO#FBmR0.ap{}T1<2",
                ySQLSchema_YSQLDataType0);
        YSQLConstant.StringConstant ySQLConstant_StringConstant0 = new YSQLConstant.StringConstant("yO#FBmR0.ap{}T1<2");
        YSQLColumnValue ySQLColumnValue0 = new YSQLColumnValue(ySQLSchema_YSQLColumn0, ySQLConstant_StringConstant0);
        YSQLConstant ySQLConstant0 = ySQLColumnValue0.getExpectedValue();
        assertSame(ySQLConstant_StringConstant0, ySQLConstant0);
    }

    @Test
    public void test2() throws Throwable {
        YSQLSchema.YSQLDataType ySQLSchema_YSQLDataType0 = YSQLSchema.YSQLDataType.FLOAT;
        YSQLSchema.YSQLColumn ySQLSchema_YSQLColumn0 = new YSQLSchema.YSQLColumn("F%\"8:4a_ZXA,",
                ySQLSchema_YSQLDataType0);
        YSQLConstant ySQLConstant0 = YSQLConstant.createNullConstant();
        YSQLColumnValue ySQLColumnValue0 = YSQLColumnValue.create(ySQLSchema_YSQLColumn0, ySQLConstant0);
        YSQLConstant ySQLConstant1 = ySQLColumnValue0.getExpectedValue();
        assertFalse(ySQLConstant1.isString());
    }

    @Test
    public void test3() throws Throwable {
        YSQLSchema.YSQLDataType ySQLSchema_YSQLDataType0 = YSQLSchema.YSQLDataType.BIT;
        YSQLSchema.YSQLColumn ySQLSchema_YSQLColumn0 = new YSQLSchema.YSQLColumn("yO#FBmR0.ap{}T1<2",
                ySQLSchema_YSQLDataType0);
        YSQLConstant ySQLConstant0 = YSQLConstant.createTrue();
        YSQLColumnValue ySQLColumnValue0 = YSQLColumnValue.create(ySQLSchema_YSQLColumn0, ySQLConstant0);
        YSQLConstant ySQLConstant1 = ySQLColumnValue0.getExpectedValue();
        assertEquals("TRUE", ySQLConstant1.getUnquotedTextRepresentation());
    }

    @Test
    public void test4() throws Throwable {
        YSQLSchema.YSQLColumn ySQLSchema_YSQLColumn0 = new YSQLSchema.YSQLColumn("4?", (YSQLSchema.YSQLDataType) null);
        YSQLConstant ySQLConstant0 = YSQLConstant.createIntConstant((-4L));
        YSQLColumnValue ySQLColumnValue0 = new YSQLColumnValue(ySQLSchema_YSQLColumn0, ySQLConstant0);
        YSQLConstant ySQLConstant1 = ySQLColumnValue0.getExpectedValue();
        assertFalse(ySQLConstant1.isNull());
    }

    @Test
    public void test5() throws Throwable {
        YSQLColumnValue ySQLColumnValue0 = new YSQLColumnValue((YSQLSchema.YSQLColumn) null, (YSQLConstant) null);
        YSQLSchema.YSQLColumn ySQLSchema_YSQLColumn0 = ySQLColumnValue0.getColumn();
        assertNull(ySQLSchema_YSQLColumn0);
    }

    @Test
    public void test6() throws Throwable {
        YSQLSchema.YSQLColumn ySQLSchema_YSQLColumn0 = new YSQLSchema.YSQLColumn("4?", (YSQLSchema.YSQLDataType) null);
        YSQLConstant ySQLConstant0 = YSQLConstant.createIntConstant((-4L));
        YSQLColumnValue ySQLColumnValue0 = new YSQLColumnValue(ySQLSchema_YSQLColumn0, ySQLConstant0);
        YSQLSchema.YSQLColumn ySQLSchema_YSQLColumn1 = ySQLColumnValue0.getColumn();
        assertSame(ySQLSchema_YSQLColumn0, ySQLSchema_YSQLColumn1);
    }

    @Test
    public void test7() throws Throwable {
        YSQLSchema.YSQLColumn ySQLSchema_YSQLColumn0 = new YSQLSchema.YSQLColumn("4?", (YSQLSchema.YSQLDataType) null);
        YSQLConstant ySQLConstant0 = YSQLConstant.createIntConstant((-4L));
        YSQLColumnValue ySQLColumnValue0 = new YSQLColumnValue(ySQLSchema_YSQLColumn0, ySQLConstant0);
        ySQLColumnValue0.getExpressionType();
    }

    @Test
    public void test8() throws Throwable {
        YSQLColumnValue ySQLColumnValue0 = new YSQLColumnValue((YSQLSchema.YSQLColumn) null, (YSQLConstant) null);
        YSQLConstant ySQLConstant0 = ySQLColumnValue0.getExpectedValue();
        assertNull(ySQLConstant0);
    }

    @Test
    public void test9() throws Throwable {
        YSQLColumnValue ySQLColumnValue0 = YSQLColumnValue.create((YSQLSchema.YSQLColumn) null, (YSQLConstant) null);
        // Undeclared exception!
        try {
            ySQLColumnValue0.getExpressionType();
            fail("Expecting exception: NullPointerException");

        } catch (NullPointerException e) {
            //
            // no message in exception (getMessage() returned null)
            //
            verifyException("sqlancer.yugabyte.ysql.ast.YSQLColumnValue", e);
        }
    }
}
