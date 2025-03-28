package sqlancer.h2.ast;

import java.util.List;
import java.util.stream.Collectors;

import sqlancer.common.ast.JoinBase;
import sqlancer.common.ast.SelectBase;
import sqlancer.common.ast.newast.Select;
import sqlancer.h2.H2Schema.H2Column;
import sqlancer.h2.H2Schema.H2Table;
import sqlancer.h2.H2ToStringVisitor;

public class H2Select extends SelectBase<H2Expression>
        implements H2Expression, Select<H2Join, H2Expression, H2Table, H2Column> {

    @Override
    public boolean isDistinct() {
        return false;
    }

    @Override
    public void setJoinClauses(List<JoinBase<H2Expression>> joinStatements) {
        List<H2Expression> expressions = joinStatements.stream().map(e -> (H2Expression) e)
                .collect(Collectors.toList());
        setJoinList(expressions);
    }

    @SuppressWarnings("unchecked")
    @Override
    public List<JoinBase<H2Expression>> getJoinClauses() {
        return getJoinList().stream().map(e -> (JoinBase<H2Expression>) e).collect(Collectors.toList());
    }

    @Override
    public String asString() {
        return H2ToStringVisitor.asString(this);
    }
}
