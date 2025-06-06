package sqlancer.cnosdb.ast;

import sqlancer.cnosdb.CnosDBSchema.CnosDBColumn;
import sqlancer.cnosdb.CnosDBSchema.CnosDBDataType;
import sqlancer.cnosdb.CnosDBSchema.CnosDBTable;
import sqlancer.common.ast.JoinBase;
import sqlancer.common.ast.newast.Join;

public class CnosDBJoin extends JoinBase<CnosDBExpression>
        implements CnosDBExpression, Join<CnosDBExpression, CnosDBTable, CnosDBColumn> {

    public CnosDBJoin(CnosDBExpression tableReference, CnosDBExpression onClause, JoinType type) {
        super(tableReference, onClause, type);

    }

    @Override
    public CnosDBExpression getTableReference() {
        return tableReference;
    }

    @Override
    public CnosDBExpression getOnClause() {
        return onClause;
    }

    @Override
    public JoinType getType() {
        return type;
    }

    @Override
    public CnosDBDataType getExpressionType() {
        throw new AssertionError();
    }

    @Override
    public void setOnClause(CnosDBExpression onClause) {
        this.onClause = onClause;
    }

}
