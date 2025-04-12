/*
 * This file was automatically generated by EvoSuite
 * Fri Apr 11 20:02:51 GMT 2025
 */

package sqlancer.evosuite.mariadb.ast;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import sqlancer.mariadb.ast.MariaDBAggregate;
import sqlancer.mariadb.ast.MariaDBConstant;
import sqlancer.mariadb.ast.MariaDBExpression;
import sqlancer.mariadb.ast.MariaDBText;

public class MariaDBText_ESTest {

    @Test
    public void test0() throws Throwable {
        MariaDBConstant mariaDBConstant0 = MariaDBConstant.createBooleanConstant(false);
        MariaDBAggregate.MariaDBAggregateFunction mariaDBAggregate_MariaDBAggregateFunction0 = MariaDBAggregate.MariaDBAggregateFunction.COUNT;
        MariaDBAggregate mariaDBAggregate0 = new MariaDBAggregate(mariaDBConstant0,
                mariaDBAggregate_MariaDBAggregateFunction0);
        MariaDBText mariaDBText0 = new MariaDBText(mariaDBAggregate0, "f5*v", true);
        boolean boolean0 = mariaDBText0.isPrefix();
        assertTrue(boolean0);
    }

    @Test
    public void test1() throws Throwable {
        MariaDBConstant mariaDBConstant0 = MariaDBConstant.createBooleanConstant(false);
        MariaDBAggregate.MariaDBAggregateFunction mariaDBAggregate_MariaDBAggregateFunction0 = MariaDBAggregate.MariaDBAggregateFunction.COUNT;
        MariaDBAggregate mariaDBAggregate0 = new MariaDBAggregate(mariaDBConstant0,
                mariaDBAggregate_MariaDBAggregateFunction0);
        MariaDBText mariaDBText0 = new MariaDBText(mariaDBAggregate0, "f5*v", true);
        mariaDBText0.getText();
        assertTrue(mariaDBText0.isPrefix());
    }

    @Test
    public void test2() throws Throwable {
        MariaDBText mariaDBText0 = new MariaDBText((MariaDBExpression) null, "", false);
        mariaDBText0.getText();
        assertFalse(mariaDBText0.isPrefix());
    }

    @Test
    public void test3() throws Throwable {
        MariaDBText mariaDBText0 = new MariaDBText((MariaDBExpression) null, "", false);
        mariaDBText0.getExpr();
        assertFalse(mariaDBText0.isPrefix());
    }

    @Test
    public void test4() throws Throwable {
        MariaDBConstant.MariaDBNullConstant mariaDBConstant_MariaDBNullConstant0 = new MariaDBConstant.MariaDBNullConstant();
        MariaDBText mariaDBText0 = new MariaDBText(mariaDBConstant_MariaDBNullConstant0, (String) null, false);
        mariaDBText0.getText();
        assertFalse(mariaDBText0.isPrefix());
    }

    @Test
    public void test5() throws Throwable {
        MariaDBConstant.MariaDBNullConstant mariaDBConstant_MariaDBNullConstant0 = new MariaDBConstant.MariaDBNullConstant();
        MariaDBText mariaDBText0 = new MariaDBText(mariaDBConstant_MariaDBNullConstant0, (String) null, false);
        mariaDBText0.getExpr();
        assertFalse(mariaDBText0.isPrefix());
    }

    @Test
    public void test6() throws Throwable {
        MariaDBConstant.MariaDBNullConstant mariaDBConstant_MariaDBNullConstant0 = new MariaDBConstant.MariaDBNullConstant();
        MariaDBText mariaDBText0 = new MariaDBText(mariaDBConstant_MariaDBNullConstant0, (String) null, false);
        boolean boolean0 = mariaDBText0.isPrefix();
        assertFalse(boolean0);
    }
}
