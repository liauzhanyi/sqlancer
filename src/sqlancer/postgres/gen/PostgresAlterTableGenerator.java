package sqlancer.postgres.gen;

import java.util.List;

import sqlancer.IgnoreMeException;
import sqlancer.Randomly;
import sqlancer.SQLAlterTableGenerator;
import sqlancer.common.query.ExpectedErrors;
import sqlancer.common.query.SQLQueryAdapter;
import sqlancer.postgres.PostgresGlobalState;
import sqlancer.postgres.PostgresSchema.PostgresColumn;
import sqlancer.postgres.PostgresSchema.PostgresDataType;
import sqlancer.postgres.PostgresSchema.PostgresTable;
import sqlancer.postgres.PostgresVisitor;

public class PostgresAlterTableGenerator
        extends SQLAlterTableGenerator<PostgresTable, PostgresGlobalState, PostgresAlterTableGenerator.Action> {

    private static PostgresColumn randomColumn;
    private boolean generateOnlyKnown;
    private List<String> opClasses;

    protected enum Action {
        // ALTER_TABLE_ADD_COLUMN, // [ COLUMN ] column data_type [ COLLATE collation ] [
        // column_constraint [ ... ] ]
        ALTER_TABLE_DROP_COLUMN, // DROP [ COLUMN ] [ IF EXISTS ] column [ RESTRICT | CASCADE ]
        ALTER_COLUMN_TYPE, // ALTER [ COLUMN ] column [ SET DATA ] TYPE data_type [ COLLATE collation ] [
                           // USING expression ]
        ALTER_COLUMN_SET_DROP_DEFAULT, // ALTER [ COLUMN ] column SET DEFAULT expression and ALTER [ COLUMN ] column
                                       // DROP DEFAULT
        ALTER_COLUMN_SET_DROP_NULL, // ALTER [ COLUMN ] column { SET | DROP } NOT NULL
        ALTER_COLUMN_SET_STATISTICS, // ALTER [ COLUMN ] column SET STATISTICS integer
        ALTER_COLUMN_SET_ATTRIBUTE_OPTION, // ALTER [ COLUMN ] column SET ( attribute_option = value [, ... ] )
        ALTER_COLUMN_RESET_ATTRIBUTE_OPTION, // ALTER [ COLUMN ] column RESET ( attribute_option [, ... ] )
        ALTER_COLUMN_SET_STORAGE, // ALTER [ COLUMN ] column SET STORAGE { PLAIN | EXTERNAL | EXTENDED | MAIN }
        ADD_TABLE_CONSTRAINT, // ADD table_constraint [ NOT VALID ]
        ADD_TABLE_CONSTRAINT_USING_INDEX, // ADD table_constraint_using_index
        VALIDATE_CONSTRAINT, // VALIDATE CONSTRAINT constraint_name
        DISABLE_ROW_LEVEL_SECURITY, // DISABLE ROW LEVEL SECURITY
        ENABLE_ROW_LEVEL_SECURITY, // ENABLE ROW LEVEL SECURITY
        FORCE_ROW_LEVEL_SECURITY, // FORCE ROW LEVEL SECURITY
        NO_FORCE_ROW_LEVEL_SECURITY, // NO FORCE ROW LEVEL SECURITY
        CLUSTER_ON, // CLUSTER ON index_name
        SET_WITHOUT_CLUSTER, //
        SET_WITH_OIDS, //
        SET_WITHOUT_OIDS, //
        SET_LOGGED_UNLOGGED, //
        NOT_OF, //
        OWNER_TO, //
        REPLICA_IDENTITY
    }

    public PostgresAlterTableGenerator(PostgresTable randomTable, PostgresGlobalState globalState,
            boolean generateOnlyKnown) {
        super(randomTable, globalState);
        this.generateOnlyKnown = generateOnlyKnown;
        this.opClasses = globalState.getOpClasses();
    }

    public static SQLQueryAdapter create(PostgresTable randomTable, PostgresGlobalState globalState,
            boolean generateOnlyKnown) {
        return new PostgresAlterTableGenerator(randomTable, globalState, generateOnlyKnown).generate();
    }

    private enum Attribute {
        N_DISTINCT_INHERITED("n_distinct_inherited"), N_DISTINCT("n_distinct");

        private String val;

        Attribute(String val) {
            this.val = val;
        }
    };

    @Override
    public List<Action> getActions(ExpectedErrors errors) {
        PostgresCommon.addCommonExpressionErrors(errors);
        PostgresCommon.addCommonInsertUpdateErrors(errors);
        PostgresCommon.addCommonTableErrors(errors);
        errors.add("cannot drop desired object(s) because other objects depend on them");
        errors.add("invalid input syntax for");
        errors.add("it has pending trigger events");
        errors.add("could not open relation");
        errors.add("functions in index expression must be marked IMMUTABLE");
        errors.add("functions in index predicate must be marked IMMUTABLE");
        errors.add("has no default operator class for access method");
        errors.add("does not accept data type");
        errors.add("does not exist for access method");
        errors.add("could not find cast from");
        errors.add("does not exist"); // TODO: investigate
        errors.add("constraints on permanent tables may reference only permanent tables");
        List<Action> action;
        if (Randomly.getBoolean()) {
            action = Randomly.nonEmptySubset(Action.values());
        } else {
            // make it more likely that the ALTER TABLE succeeds
            action = Randomly.subset(Randomly.smallNumber(), Action.values());
        }
        if (randomTable.getColumns().size() == 1) {
            action.remove(Action.ALTER_TABLE_DROP_COLUMN);
        }
        if (randomTable.getIndexes().isEmpty()) {
            action.remove(Action.ADD_TABLE_CONSTRAINT_USING_INDEX);
            action.remove(Action.CLUSTER_ON);
        }
        action.remove(Action.SET_WITH_OIDS);
        if (!randomTable.hasIndexes()) {
            action.remove(Action.ADD_TABLE_CONSTRAINT_USING_INDEX);
        }
        if (action.isEmpty()) {
            throw new IgnoreMeException();
        }
        return action;
    }

    @Override
    public void addTableConstraintHelper(StringBuilder sb, ExpectedErrors errors) {
        PostgresCommon.addTableConstraint(sb, randomTable, globalState, errors);
    }

    private static void alterColumn(PostgresTable randomTable, StringBuilder sb) {
        sb.append("ALTER ");
        randomColumn = randomTable.getRandomColumn();
        sb.append(randomColumn.getName());
        sb.append(" ");
    }

    @Override
    public void alterColumnType(StringBuilder sb, ExpectedErrors errors, PostgresTable randomTable) {
        alterColumn(randomTable, sb);
        if (Randomly.getBoolean()) {
            sb.append(" SET DATA");
        }
        sb.append(" TYPE ");
        PostgresDataType randomType = PostgresDataType.getRandomType();
        PostgresCommon.appendDataType(randomType, sb, false, generateOnlyKnown, opClasses);
        // TODO [ COLLATE collation ] [ USING expression ]
        errors.add("cannot alter type of a column used by a view or rule");
        errors.add("cannot convert infinity to numeric");
        errors.add("is duplicated");
        errors.add("cannot be cast automatically");
        errors.add("is an identity column");
        errors.add("identity column type must be smallint, integer, or bigint");
        errors.add("out of range");
        errors.add("cannot alter type of column named in partition key");
        errors.add("cannot alter type of column referenced in partition key expression");
        errors.add("because it is part of the partition key of relation");
        errors.add("argument of CHECK must be type boolean");
        errors.add("operator does not exist");
        errors.add("must be type");
        errors.add("You might need to add explicit type casts");
        errors.add("cannot cast type");
        errors.add("foreign key constrain");
        errors.add("division by zero");
        errors.add("value too long for type character varying");
        errors.add("cannot drop index");
        errors.add("cannot alter inherited column");
        errors.add("must be changed in child tables too");
        errors.add("could not determine which collation to use for index expression");
        errors.add("bit string too long for type bit varying");
        errors.add("cannot alter type of a column used by a generated column");
    }

    @Override
    public void alterColumnSetDropDefault(StringBuilder sb, ExpectedErrors errors, PostgresTable randomTable) {
        alterColumn(randomTable, sb);
        if (Randomly.getBoolean()) {
            sb.append("DROP DEFAULT");
        } else {
            sb.append("SET DEFAULT ");
            sb.append(PostgresVisitor
                    .asString(PostgresExpressionGenerator.generateExpression(globalState, randomColumn.getType())));
            errors.add("is out of range");
            errors.add("but default expression is of type");
            errors.add("cannot cast");
        }
        errors.add("is a generated column");
        errors.add("is an identity column");
    }

    @Override
    public void alterColumnSetDropNull(StringBuilder sb, ExpectedErrors errors, PostgresTable randomTable) {
        alterColumn(randomTable, sb);
        if (Randomly.getBoolean()) {
            sb.append("SET NOT NULL");
            errors.add("contains null values");
        } else {
            sb.append("DROP NOT NULL");
            errors.add("is in a primary key");
            errors.add("is an identity column");
        }
    }

    @Override
    public void alterColumnSetStatistics(StringBuilder sb, ExpectedErrors errors, PostgresTable randomTable) {
        alterColumn(randomTable, sb);
        sb.append("SET STATISTICS ");
        sb.append(r.getInteger(0, 10000));
    }

    @Override
    public void alterColumnSetAttributeOption(StringBuilder sb, PostgresTable randomTable) {
        alterColumn(randomTable, sb);
        sb.append(" SET(");
        List<Attribute> subset = Randomly.nonEmptySubset(Attribute.values());
        int j = 0;
        for (Attribute attr : subset) {
            if (j++ != 0) {
                sb.append(", ");
            }
            sb.append(attr.val);
            sb.append("=");
            sb.append(Randomly.fromOptions(-1, -0.8, -0.5, -0.2, -0.1, -0.00001, -0.0000000001, 0, 0.000000001, 0.0001,
                    0.1, 1));
        }
        sb.append(")");
    }

    @Override
    public void alterColumnResetAttributeOption(StringBuilder sb, PostgresTable randomTable) {
        alterColumn(randomTable, sb);
        sb.append(" RESET(");
        List<Attribute> subset = Randomly.nonEmptySubset(Attribute.values());
        int j = 0;
        for (Attribute attr : subset) {
            if (j++ != 0) {
                sb.append(", ");
            }
            sb.append(attr.val);
        }
        sb.append(")");
    }

    @Override
    public void alterColumnSetStorage(StringBuilder sb, ExpectedErrors errors, PostgresTable randomTable) {
        alterColumn(randomTable, sb);
        sb.append("SET STORAGE ");
        sb.append(Randomly.fromOptions("PLAIN", "EXTERNAL", "EXTENDED", "MAIN"));
        errors.add("can only have storage");
        errors.add("is an identity column");
    }

    @Override
    public void validateConstraint(StringBuilder sb, ExpectedErrors errors) {
        sb.append("VALIDATE CONSTRAINT asdf");
        errors.add("does not exist");
        // FIXME select constraint
    }

    @Override
    public void clusterOn(StringBuilder sb, ExpectedErrors errors) {
        sb.append("CLUSTER ON ");
        sb.append(randomTable.getRandomIndex().getIndexName());
        errors.add("cannot cluster on");
        errors.add("cannot mark index clustered in partitioned table");
        errors.add("not valid");
    }

    @Override
    public void setWithoutCluster(StringBuilder sb, ExpectedErrors errors) {
        sb.append("SET WITHOUT CLUSTER");
        errors.add("cannot mark index clustered in partitioned table");
    }

    @Override
    public void setWithOIDS(StringBuilder sb) {
        sb.append("SET WITH OIDS");
    }

    @Override
    public void setWithoutOIDS(StringBuilder sb) {
        sb.append("SET WITHOUT OIDS");
    }

    @Override
    public void setLoggedUnlogged(StringBuilder sb, ExpectedErrors errors) {
        sb.append("SET ");
        sb.append(Randomly.fromOptions("LOGGED", "UNLOGGED"));
        errors.add("because it is temporary");
        errors.add("to logged because it references unlogged table");
        errors.add("to unlogged because it references logged table");
    }

    @Override
    public void notOf(StringBuilder sb, ExpectedErrors errors) {
        errors.add("is not a typed table");
        sb.append("NOT OF");
    }

    @Override
    public void ownerTo(StringBuilder sb) {
        sb.append("OWNER TO ");
        // TODO: new_owner
        sb.append(Randomly.fromOptions("CURRENT_USER", "SESSION_USER"));
    }

    @Override
    public void replicaIdentity(StringBuilder sb, ExpectedErrors errors, PostgresTable randomTable) {
        sb.append("REPLICA IDENTITY ");
        if (Randomly.getBoolean() || randomTable.getIndexes().isEmpty()) {
            sb.append(Randomly.fromOptions("DEFAULT", "FULL", "NOTHING"));
        } else {
            sb.append("USING INDEX ");
            sb.append(randomTable.getRandomIndex().getIndexName());
            errors.add("cannot be used as replica identity");
            errors.add("cannot use non-unique index");
            errors.add("cannot use expression index");
            errors.add("cannot use partial index");
            errors.add("cannot use invalid index");
        }
    }
}
