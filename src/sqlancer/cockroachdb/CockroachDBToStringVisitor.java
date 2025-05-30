package sqlancer.cockroachdb;

import java.util.ArrayList;

import sqlancer.Randomly;
import sqlancer.cockroachdb.ast.CockroachDBAggregate;
import sqlancer.cockroachdb.ast.CockroachDBBetweenOperation;
import sqlancer.cockroachdb.ast.CockroachDBCaseOperation;
import sqlancer.cockroachdb.ast.CockroachDBColumnReference;
import sqlancer.cockroachdb.ast.CockroachDBConstant;
import sqlancer.cockroachdb.ast.CockroachDBExpression;
import sqlancer.cockroachdb.ast.CockroachDBFunctionCall;
import sqlancer.cockroachdb.ast.CockroachDBInOperation;
import sqlancer.cockroachdb.ast.CockroachDBJoin;
import sqlancer.cockroachdb.ast.CockroachDBMultiValuedComparison;
import sqlancer.cockroachdb.ast.CockroachDBSelect;
import sqlancer.cockroachdb.ast.CockroachDBTableReference;
import sqlancer.common.ast.JoinBase;
import sqlancer.common.ast.SelectBase;
import sqlancer.common.visitor.ToStringVisitor;

public class CockroachDBToStringVisitor extends ToStringVisitor<CockroachDBExpression> implements CockroachDBVisitor {

    @Override
    public void visitSpecific(CockroachDBExpression expr) {
        CockroachDBVisitor.super.visit(expr);
    }

    @Override
    public void visit(CockroachDBConstant c) {
        sb.append(c.toString());
    }

    public String getString() {
        return sb.toString();
    }

    @Override
    public void visit(CockroachDBColumnReference c) {
        if (c.getColumn().getTable() == null) {
            sb.append(c.getColumn().getName());
        } else {
            sb.append(c.getColumn().getFullQualifiedName());
        }
    }

    @Override
    public void visit(CockroachDBFunctionCall call) {
        sb.append(call.getName());
        sb.append("(");
        visit(call.getArguments());
        sb.append(")");
    }

    @Override
    public void visit(CockroachDBInOperation inOp) {
        sb.append("(");
        visit(inOp.getLeft());
        sb.append(") IN (");
        visit(inOp.getRight());
        sb.append(")");
    }

    @Override
    public void visit(CockroachDBBetweenOperation op) {
        sb.append("(");
        visit(op.getExpr());
        sb.append(")");
        sb.append(" ");
        sb.append(op.getType().getStringRepresentation());
        sb.append(" (");
        visit(op.getLeft());
        sb.append(") AND (");
        visit(op.getRight());
        sb.append(")");
    }

    @Override
    public void visit(CockroachDBSelect select) {
        visitSelect(select);
    }

    @Override
    public void visitSelectOption(SelectBase<CockroachDBExpression> select) {
        if (select.isDistinct()) {
            sb.append("DISTINCT ");
        } else if (Randomly.getBoolean()) {
            sb.append("ALL ");
        }
    }

    @Override
    protected CockroachDBExpression getDistinctOnClause(SelectBase<CockroachDBExpression> select) {
        return null;
    }

    @Override
    public void visitColumns(SelectBase<CockroachDBExpression> select) {
        visit(select.getFetchColumns());
        sb.append(" FROM ");
    }

    @Override
    protected void visitFromClause(SelectBase<CockroachDBExpression> select) {
        if (!select.getFromList().isEmpty()) {
            visit(new ArrayList<>(select.getFromList()));
        }
    }

    @Override
    protected void visitJoinClauses(SelectBase<CockroachDBExpression> select) {
        if (!select.getFromList().isEmpty() && !select.getJoinList().isEmpty()) {
            sb.append(", ");
        }
        visit(new ArrayList<>(select.getJoinList()));
    }

    @Override
    protected void visitGroupByClause(SelectBase<CockroachDBExpression> select) {
        if (select.getGroupByExpressions() != null && !select.getGroupByExpressions().isEmpty()) {
            sb.append(" GROUP BY ");
            visit(select.getGroupByExpressions());
        }
    }

    @Override
    protected CockroachDBExpression getJoinOnClause(JoinBase<CockroachDBExpression> join) {
        return null;
    }

    @Override
    protected CockroachDBExpression getJoinTableReference(JoinBase<CockroachDBExpression> join) {
        return null;
    }

    @Override
    public void visit(CockroachDBCaseOperation cases) {
        generateCaseStatement(null, cases.getConditions(), cases.getThenClauses(), cases.getElseClause(), false);
    }

    @Override
    public void visit(CockroachDBJoin join) {
        visit(join.getLeftTable());
        switch (join.getJoinType()) {
        case INNER:
            sb.append(" INNER ");
            potentiallyAddHint(false);
            sb.append("JOIN ");
            visit(join.getRightTable());
            sb.append(" ON ");
            visit(join.getOnClause());
            break;
        case LEFT:
            sb.append(" LEFT");
            sb.append(" OUTER ");
            potentiallyAddHint(true);
            sb.append("JOIN ");
            visit(join.getRightTable());
            sb.append(" ON ");
            visit(join.getOnClause());
            break;
        case RIGHT:
            sb.append(" RIGHT");
            sb.append(" OUTER ");
            potentiallyAddHint(true);
            sb.append("JOIN ");
            visit(join.getRightTable());
            sb.append(" ON ");
            visit(join.getOnClause());
            break;
        case FULL:
            sb.append(" FULL");
            sb.append(" OUTER ");
            potentiallyAddHint(true);
            sb.append("JOIN ");
            visit(join.getRightTable());
            sb.append(" ON ");
            visit(join.getOnClause());
            break;
        case CROSS:
            sb.append(" CROSS ");
            potentiallyAddHint(false);
            sb.append("JOIN ");
            visit(join.getRightTable());
            break;
        case NATURAL:
            sb.append(" NATURAL ");
            // potentiallyAddHint(false);
            sb.append("JOIN ");
            visit(join.getRightTable());
            break;
        default:
            throw new AssertionError();
        }
    }

    private void potentiallyAddHint(boolean isOuter) {
        if (Randomly.getBoolean()) {
            return;
        } else {
            if (isOuter) {
                sb.append(Randomly.fromOptions("HASH", "MERGE", "LOOKUP"));
            } else {
                sb.append(Randomly.fromOptions("HASH", "MERGE"));
            }
            sb.append(" ");
        }
    }

    @Override
    public void visit(CockroachDBTableReference tableRef) {
        sb.append(tableRef.getTable().getName());
    }

    @Override
    public void visit(CockroachDBAggregate aggr) {
        sb.append(aggr.getFunc().name());
        sb.append("(");
        visit(aggr.getExpr());
        sb.append(")");
    }

    @Override
    public void visit(CockroachDBMultiValuedComparison comp) {
        sb.append("(");
        visit(comp.getLeft());
        sb.append(" ");
        sb.append(comp.getOp().getStringRepr());
        sb.append(" ");
        sb.append(comp.getType());
        sb.append(" (");
        visit(comp.getRight());
        sb.append(")");
        sb.append(")");
    }
}
