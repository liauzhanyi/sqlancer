package sqlancer.yugabyte.ysql.oracle.tlp;

import static sqlancer.common.oracle.TestOracleUtils.executeAndCompareQueries;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import sqlancer.Randomly;
import sqlancer.common.ast.JoinBase;
import sqlancer.common.oracle.TestOracle;
import sqlancer.yugabyte.ysql.YSQLErrors;
import sqlancer.yugabyte.ysql.YSQLGlobalState;
import sqlancer.yugabyte.ysql.YSQLSchema.YSQLDataType;
import sqlancer.yugabyte.ysql.YSQLVisitor;
import sqlancer.yugabyte.ysql.ast.YSQLAggregate;
import sqlancer.yugabyte.ysql.ast.YSQLAggregate.YSQLAggregateFunction;
import sqlancer.yugabyte.ysql.ast.YSQLAlias;
import sqlancer.yugabyte.ysql.ast.YSQLExpression;
import sqlancer.yugabyte.ysql.ast.YSQLPostfixOperation;
import sqlancer.yugabyte.ysql.ast.YSQLPostfixOperation.PostfixOperator;
import sqlancer.yugabyte.ysql.ast.YSQLPrefixOperation;
import sqlancer.yugabyte.ysql.ast.YSQLPrefixOperation.PrefixOperator;
import sqlancer.yugabyte.ysql.ast.YSQLSelect;

public class YSQLTLPAggregateOracle extends YSQLTLPBase implements TestOracle<YSQLGlobalState> {

    private String originalQuery;
    private String metamorphicQuery;

    public YSQLTLPAggregateOracle(YSQLGlobalState state) {
        super(state);
        YSQLErrors.addGroupingErrors(errors);
    }

    @Override
    public void check() throws SQLException {
        super.check();
        aggregateCheck();
    }

    protected void aggregateCheck() throws SQLException {
        YSQLAggregateFunction aggregateFunction = Randomly.fromOptions(YSQLAggregateFunction.MAX,
                YSQLAggregateFunction.MIN, YSQLAggregateFunction.SUM, YSQLAggregateFunction.BIT_AND,
                YSQLAggregateFunction.BIT_OR, YSQLAggregateFunction.BOOL_AND, YSQLAggregateFunction.BOOL_OR,
                YSQLAggregateFunction.COUNT);
        YSQLAggregate aggregate = gen.generateArgsForAggregate(aggregateFunction.getRandomReturnType(),
                aggregateFunction);
        List<YSQLExpression> fetchColumns = new ArrayList<>();
        fetchColumns.add(aggregate);
        while (Randomly.getBooleanWithRatherLowProbability()) {
            fetchColumns.add(gen.generateAggregate());
        }
        select.setFetchColumns(Arrays.asList(aggregate));
        if (Randomly.getBooleanWithRatherLowProbability()) {
            select.setOrderByClauses(gen.generateOrderBys());
        }
        originalQuery = YSQLVisitor.asString(select);
        metamorphicQuery = createMetamorphicUnionQuery(select, aggregate, select.getFromList());
        executeAndCompareQueries(state, originalQuery, metamorphicQuery, errors);

    }

    private String createMetamorphicUnionQuery(YSQLSelect select, YSQLAggregate aggregate, List<YSQLExpression> from) {
        String metamorphicQuery;
        YSQLExpression whereClause = gen.generateExpression(YSQLDataType.BOOLEAN);
        YSQLExpression negatedClause = new YSQLPrefixOperation(whereClause, PrefixOperator.NOT);
        YSQLExpression notNullClause = new YSQLPostfixOperation(whereClause, PostfixOperator.IS_NULL);
        List<YSQLExpression> mappedAggregate = mapped(aggregate);
        YSQLSelect leftSelect = getSelect(mappedAggregate, from, whereClause, select.getJoinClauses());
        YSQLSelect middleSelect = getSelect(mappedAggregate, from, negatedClause, select.getJoinClauses());
        YSQLSelect rightSelect = getSelect(mappedAggregate, from, notNullClause, select.getJoinClauses());
        metamorphicQuery = "SELECT " + getOuterAggregateFunction(aggregate) + " FROM (";
        metamorphicQuery += YSQLVisitor.asString(leftSelect) + " UNION ALL " + YSQLVisitor.asString(middleSelect)
                + " UNION ALL " + YSQLVisitor.asString(rightSelect);
        metamorphicQuery += ") as asdf";
        return metamorphicQuery;
    }

    private List<YSQLExpression> mapped(YSQLAggregate aggregate) {
        switch (aggregate.getFunction()) {
        case SUM:
        case COUNT:
        case BIT_AND:
        case BIT_OR:
        case BOOL_AND:
        case BOOL_OR:
        case MAX:
        case MIN:
            return aliasArgs(Arrays.asList(aggregate));
        // case AVG:
        //// List<YSQLExpression> arg = Arrays.asList(new
        // YSQLCast(aggregate.getExpr().get(0),
        // YSQLDataType.DECIMAL.get()));
        // YSQLAggregate sum = new YSQLAggregate(YSQLAggregateFunction.SUM,
        // aggregate.getExpr());
        // YSQLCast count = new YSQLCast(
        // new YSQLAggregate(YSQLAggregateFunction.COUNT, aggregate.getExpr()),
        // YSQLDataType.DECIMAL.get());
        //// YSQLBinaryArithmeticOperation avg = new
        // YSQLBinaryArithmeticOperation(sum, count,
        // YSQLBinaryArithmeticOperator.DIV);
        // return aliasArgs(Arrays.asList(sum, count));
        default:
            throw new AssertionError(aggregate.getFunction());
        }
    }

    private List<YSQLExpression> aliasArgs(List<YSQLExpression> originalAggregateArgs) {
        List<YSQLExpression> args = new ArrayList<>();
        int i = 0;
        for (YSQLExpression expr : originalAggregateArgs) {
            args.add(new YSQLAlias(expr, "agg" + i++));
        }
        return args;
    }

    private String getOuterAggregateFunction(YSQLAggregate aggregate) {
        switch (aggregate.getFunction()) {
        // case AVG:
        // return "SUM(agg0::DECIMAL)/SUM(agg1)::DECIMAL";
        case COUNT:
            return YSQLAggregateFunction.SUM + "(agg0)";
        default:
            return aggregate.getFunction().toString() + "(agg0)";
        }
    }

    private YSQLSelect getSelect(List<YSQLExpression> aggregates, List<YSQLExpression> from, YSQLExpression whereClause,
            List<JoinBase<YSQLExpression>> joinList) {
        YSQLSelect leftSelect = new YSQLSelect();
        leftSelect.setFetchColumns(aggregates);
        leftSelect.setFromList(from);
        leftSelect.setWhereClause(whereClause);
        leftSelect.setJoinClauses(joinList);
        if (Randomly.getBooleanWithSmallProbability()) {
            leftSelect.setGroupByExpressions(gen.generateExpressions(Randomly.smallNumber() + 1));
        }
        return leftSelect;
    }

}
