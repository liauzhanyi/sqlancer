/*
 * This file was automatically generated by EvoSuite
 * Sat Apr 12 02:02:52 GMT 2025
 */

package sqlancer.evosuite.oceanbase.ast;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import sqlancer.oceanbase.ast.OceanBaseColumnReference;
import sqlancer.oceanbase.ast.OceanBaseConstant;
import sqlancer.oceanbase.OceanBaseSchema;

public class OceanBaseColumnReference_ESTest {

    @Test
    public void test00() throws Throwable {
        OceanBaseSchema.OceanBaseDataType oceanBaseSchema_OceanBaseDataType0 = OceanBaseSchema.OceanBaseDataType.DOUBLE;
        OceanBaseSchema.OceanBaseColumn oceanBaseSchema_OceanBaseColumn0 = new OceanBaseSchema.OceanBaseColumn(
                (String) null, oceanBaseSchema_OceanBaseDataType0, true, 598, true);
        OceanBaseConstant oceanBaseConstant0 = OceanBaseConstant.createNullConstant();
        OceanBaseColumnReference oceanBaseColumnReference0 = new OceanBaseColumnReference(
                oceanBaseSchema_OceanBaseColumn0, oceanBaseConstant0);
        OceanBaseConstant oceanBaseConstant1 = oceanBaseColumnReference0.getValue();
        assertSame(oceanBaseConstant1, oceanBaseConstant0);
    }

    @Test
    public void test01() throws Throwable {
        OceanBaseSchema.OceanBaseDataType oceanBaseSchema_OceanBaseDataType0 = OceanBaseSchema.OceanBaseDataType.DECIMAL;
        OceanBaseSchema.OceanBaseColumn oceanBaseSchema_OceanBaseColumn0 = new OceanBaseSchema.OceanBaseColumn("",
                oceanBaseSchema_OceanBaseDataType0, true, 0, true);
        OceanBaseConstant oceanBaseConstant0 = OceanBaseConstant.createFalse();
        OceanBaseColumnReference oceanBaseColumnReference0 = OceanBaseColumnReference
                .create(oceanBaseSchema_OceanBaseColumn0, oceanBaseConstant0);
        OceanBaseConstant oceanBaseConstant1 = oceanBaseColumnReference0.getValue();
        assertFalse(oceanBaseConstant1.asBooleanNotNull());
    }

    @Test
    public void test02() throws Throwable {
        OceanBaseSchema.OceanBaseDataType oceanBaseSchema_OceanBaseDataType0 = OceanBaseSchema.OceanBaseDataType.VARCHAR;
        OceanBaseSchema.OceanBaseColumn oceanBaseSchema_OceanBaseColumn0 = new OceanBaseSchema.OceanBaseColumn("",
                oceanBaseSchema_OceanBaseDataType0, true, 0, true);
        OceanBaseConstant oceanBaseConstant0 = OceanBaseConstant.createStringConstant("");
        OceanBaseColumnReference oceanBaseColumnReference0 = new OceanBaseColumnReference(
                oceanBaseSchema_OceanBaseColumn0, oceanBaseConstant0);
        OceanBaseConstant oceanBaseConstant1 = oceanBaseColumnReference0.getValue();
        assertFalse(oceanBaseConstant1.asBooleanNotNull());
    }

    @Test
    public void test03() throws Throwable {
        OceanBaseSchema.OceanBaseDataType oceanBaseSchema_OceanBaseDataType0 = OceanBaseSchema.OceanBaseDataType.INT;
        OceanBaseSchema.OceanBaseColumn oceanBaseSchema_OceanBaseColumn0 = new OceanBaseSchema.OceanBaseColumn(
                "I)i2=T[5h*+ZjxuQ", oceanBaseSchema_OceanBaseDataType0, true, 0, false);
        OceanBaseConstant.OceanBaseDoubleConstant oceanBaseConstant_OceanBaseDoubleConstant0 = new OceanBaseConstant.OceanBaseDoubleConstant(
                0.0);
        OceanBaseColumnReference oceanBaseColumnReference0 = new OceanBaseColumnReference(
                oceanBaseSchema_OceanBaseColumn0, oceanBaseConstant_OceanBaseDoubleConstant0);
        OceanBaseConstant oceanBaseConstant0 = oceanBaseColumnReference0.getValue();
        assertEquals(0L, oceanBaseConstant0.getInt());
    }

    @Test
    public void test04() throws Throwable {
        OceanBaseSchema.OceanBaseDataType oceanBaseSchema_OceanBaseDataType0 = OceanBaseSchema.OceanBaseDataType.DOUBLE;
        OceanBaseSchema.OceanBaseColumn oceanBaseSchema_OceanBaseColumn0 = new OceanBaseSchema.OceanBaseColumn(
                (String) null, oceanBaseSchema_OceanBaseDataType0, true, 598, true);
        OceanBaseConstant oceanBaseConstant0 = OceanBaseConstant.createNullConstant();
        OceanBaseColumnReference oceanBaseColumnReference0 = new OceanBaseColumnReference(
                oceanBaseSchema_OceanBaseColumn0, oceanBaseConstant0);
        OceanBaseColumnReference oceanBaseColumnReference1 = oceanBaseColumnReference0.setRef(true);
        boolean boolean0 = oceanBaseColumnReference1.getRef();
        assertTrue(boolean0);
    }

    @Test
    public void test05() throws Throwable {
        OceanBaseSchema.OceanBaseDataType oceanBaseSchema_OceanBaseDataType0 = OceanBaseSchema.OceanBaseDataType.DOUBLE;
        OceanBaseSchema.OceanBaseColumn oceanBaseSchema_OceanBaseColumn0 = new OceanBaseSchema.OceanBaseColumn(
                (String) null, oceanBaseSchema_OceanBaseDataType0, true, 598, true);
        OceanBaseConstant oceanBaseConstant0 = OceanBaseConstant.createNullConstant();
        OceanBaseColumnReference oceanBaseColumnReference0 = new OceanBaseColumnReference(
                oceanBaseSchema_OceanBaseColumn0, oceanBaseConstant0);
        OceanBaseConstant oceanBaseConstant1 = oceanBaseColumnReference0.getExpectedValue();
        assertTrue(oceanBaseConstant1.isNull());
    }

    @Test
    public void test06() throws Throwable {
        OceanBaseSchema.OceanBaseDataType oceanBaseSchema_OceanBaseDataType0 = OceanBaseSchema.OceanBaseDataType.DECIMAL;
        OceanBaseSchema.OceanBaseColumn oceanBaseSchema_OceanBaseColumn0 = new OceanBaseSchema.OceanBaseColumn("",
                oceanBaseSchema_OceanBaseDataType0, true, 0, true);
        OceanBaseConstant oceanBaseConstant0 = OceanBaseConstant.createFalse();
        OceanBaseColumnReference oceanBaseColumnReference0 = OceanBaseColumnReference
                .create(oceanBaseSchema_OceanBaseColumn0, oceanBaseConstant0);
        OceanBaseConstant oceanBaseConstant1 = oceanBaseColumnReference0.getExpectedValue();
        assertSame(oceanBaseConstant1, oceanBaseConstant0);
    }

    @Test
    public void test07() throws Throwable {
        OceanBaseSchema.OceanBaseDataType oceanBaseSchema_OceanBaseDataType0 = OceanBaseSchema.OceanBaseDataType.VARCHAR;
        OceanBaseSchema.OceanBaseColumn oceanBaseSchema_OceanBaseColumn0 = new OceanBaseSchema.OceanBaseColumn("",
                oceanBaseSchema_OceanBaseDataType0, true, 0, true);
        OceanBaseConstant oceanBaseConstant0 = OceanBaseConstant.createStringConstant("");
        OceanBaseColumnReference oceanBaseColumnReference0 = new OceanBaseColumnReference(
                oceanBaseSchema_OceanBaseColumn0, oceanBaseConstant0);
        OceanBaseConstant oceanBaseConstant1 = oceanBaseColumnReference0.getExpectedValue();
        assertFalse(oceanBaseConstant1.isNull());
    }

    @Test
    public void test08() throws Throwable {
        OceanBaseSchema.OceanBaseDataType oceanBaseSchema_OceanBaseDataType0 = OceanBaseSchema.OceanBaseDataType.INT;
        OceanBaseSchema.OceanBaseColumn oceanBaseSchema_OceanBaseColumn0 = new OceanBaseSchema.OceanBaseColumn(
                "I)i2=T[5h*+ZjxuQ", oceanBaseSchema_OceanBaseDataType0, true, 0, false);
        OceanBaseConstant.OceanBaseDoubleConstant oceanBaseConstant_OceanBaseDoubleConstant0 = new OceanBaseConstant.OceanBaseDoubleConstant(
                0.0);
        OceanBaseColumnReference oceanBaseColumnReference0 = new OceanBaseColumnReference(
                oceanBaseSchema_OceanBaseColumn0, oceanBaseConstant_OceanBaseDoubleConstant0);
        OceanBaseConstant oceanBaseConstant0 = oceanBaseColumnReference0.getExpectedValue();
        assertEquals(0L, oceanBaseConstant0.getInt());
    }

    @Test
    public void test09() throws Throwable {
        OceanBaseSchema.OceanBaseDataType oceanBaseSchema_OceanBaseDataType0 = OceanBaseSchema.OceanBaseDataType.DOUBLE;
        OceanBaseSchema.OceanBaseColumn oceanBaseSchema_OceanBaseColumn0 = new OceanBaseSchema.OceanBaseColumn("",
                oceanBaseSchema_OceanBaseDataType0, false, 0, false);
        OceanBaseColumnReference oceanBaseColumnReference0 = OceanBaseColumnReference
                .create(oceanBaseSchema_OceanBaseColumn0, (OceanBaseConstant) null);
        OceanBaseSchema.OceanBaseColumn oceanBaseSchema_OceanBaseColumn1 = oceanBaseColumnReference0.getColumn();
        assertFalse(oceanBaseSchema_OceanBaseColumn1.isZeroFill());
    }

    @Test
    public void test10() throws Throwable {
        OceanBaseSchema.OceanBaseDataType oceanBaseSchema_OceanBaseDataType0 = OceanBaseSchema.OceanBaseDataType.INT;
        OceanBaseSchema.OceanBaseColumn oceanBaseSchema_OceanBaseColumn0 = new OceanBaseSchema.OceanBaseColumn(
                "sqlancer.oceanbase.ast.OceanBaseColumnReference", oceanBaseSchema_OceanBaseDataType0, true, 844, true);
        OceanBaseConstant oceanBaseConstant0 = OceanBaseConstant
                .createStringConstant("sqlancer.oceanbase.ast.OceanBaseColumnReference");
        OceanBaseColumnReference oceanBaseColumnReference0 = OceanBaseColumnReference
                .create(oceanBaseSchema_OceanBaseColumn0, oceanBaseConstant0);
        OceanBaseSchema.OceanBaseColumn oceanBaseSchema_OceanBaseColumn1 = oceanBaseColumnReference0.getColumn();
        assertEquals("sqlancer.oceanbase.ast.OceanBaseColumnReference", oceanBaseSchema_OceanBaseColumn1.getName());
    }

    @Test
    public void test11() throws Throwable {
        OceanBaseSchema.OceanBaseDataType oceanBaseSchema_OceanBaseDataType0 = OceanBaseSchema.OceanBaseDataType.DOUBLE;
        OceanBaseSchema.OceanBaseColumn oceanBaseSchema_OceanBaseColumn0 = new OceanBaseSchema.OceanBaseColumn("",
                oceanBaseSchema_OceanBaseDataType0, false, (-2069), false);
        OceanBaseConstant.OceanBaseIntConstant oceanBaseConstant_OceanBaseIntConstant0 = new OceanBaseConstant.OceanBaseIntConstant(
                (-1174L), "");
        OceanBaseColumnReference oceanBaseColumnReference0 = OceanBaseColumnReference
                .create(oceanBaseSchema_OceanBaseColumn0, oceanBaseConstant_OceanBaseIntConstant0);
        OceanBaseSchema.OceanBaseColumn oceanBaseSchema_OceanBaseColumn1 = oceanBaseColumnReference0.getColumn();
        assertFalse(oceanBaseSchema_OceanBaseColumn1.isPrimaryKey());
    }

    @Test
    public void test12() throws Throwable {
        OceanBaseSchema.OceanBaseDataType oceanBaseSchema_OceanBaseDataType0 = OceanBaseSchema.OceanBaseDataType.DOUBLE;
        OceanBaseSchema.OceanBaseColumn oceanBaseSchema_OceanBaseColumn0 = new OceanBaseSchema.OceanBaseColumn("",
                oceanBaseSchema_OceanBaseDataType0, false, 0, false);
        OceanBaseColumnReference oceanBaseColumnReference0 = OceanBaseColumnReference
                .create(oceanBaseSchema_OceanBaseColumn0, (OceanBaseConstant) null);
        OceanBaseConstant oceanBaseConstant0 = oceanBaseColumnReference0.getValue();
        assertNull(oceanBaseConstant0);
    }

    @Test
    public void test13() throws Throwable {
        OceanBaseSchema.OceanBaseDataType oceanBaseSchema_OceanBaseDataType0 = OceanBaseSchema.OceanBaseDataType.INT;
        OceanBaseSchema.OceanBaseColumn oceanBaseSchema_OceanBaseColumn0 = new OceanBaseSchema.OceanBaseColumn(
                "sqlancer.oceanbase.ast.OceanBaseColumnReference", oceanBaseSchema_OceanBaseDataType0, true, 844, true);
        OceanBaseConstant oceanBaseConstant0 = OceanBaseConstant
                .createStringConstant("sqlancer.oceanbase.ast.OceanBaseColumnReference");
        OceanBaseColumnReference oceanBaseColumnReference0 = OceanBaseColumnReference
                .create(oceanBaseSchema_OceanBaseColumn0, oceanBaseConstant0);
        boolean boolean0 = oceanBaseColumnReference0.getRef();
        assertFalse(boolean0);
    }

    @Test
    public void test14() throws Throwable {
        OceanBaseSchema.OceanBaseDataType oceanBaseSchema_OceanBaseDataType0 = OceanBaseSchema.OceanBaseDataType.DOUBLE;
        OceanBaseSchema.OceanBaseColumn oceanBaseSchema_OceanBaseColumn0 = new OceanBaseSchema.OceanBaseColumn("",
                oceanBaseSchema_OceanBaseDataType0, false, 0, false);
        OceanBaseColumnReference oceanBaseColumnReference0 = OceanBaseColumnReference
                .create(oceanBaseSchema_OceanBaseColumn0, (OceanBaseConstant) null);
        OceanBaseConstant oceanBaseConstant0 = oceanBaseColumnReference0.getExpectedValue();
        assertNull(oceanBaseConstant0);
    }

    @Test
    public void test15() throws Throwable {
        OceanBaseConstant.OceanBaseNullConstant oceanBaseConstant_OceanBaseNullConstant0 = new OceanBaseConstant.OceanBaseNullConstant();
        OceanBaseColumnReference oceanBaseColumnReference0 = new OceanBaseColumnReference(
                (OceanBaseSchema.OceanBaseColumn) null, oceanBaseConstant_OceanBaseNullConstant0);
        OceanBaseSchema.OceanBaseColumn oceanBaseSchema_OceanBaseColumn0 = oceanBaseColumnReference0.getColumn();
        assertNull(oceanBaseSchema_OceanBaseColumn0);
    }

    @Test
    public void test16() throws Throwable {
        OceanBaseConstant.OceanBaseNullConstant oceanBaseConstant_OceanBaseNullConstant0 = new OceanBaseConstant.OceanBaseNullConstant();
        OceanBaseColumnReference oceanBaseColumnReference0 = new OceanBaseColumnReference(
                (OceanBaseSchema.OceanBaseColumn) null, oceanBaseConstant_OceanBaseNullConstant0);
        OceanBaseColumnReference oceanBaseColumnReference1 = oceanBaseColumnReference0.setRef(false);
        assertFalse(oceanBaseColumnReference1.getRef());
    }
}
