package sqlancer;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import sqlancer.common.schema.AbstractSchema;

public abstract class ExpandedGlobalState<O extends DBMSSpecificOptions<?>, S extends AbstractSchema<?, ?>>
        extends SQLGlobalState<O, S> {

    public static final char IMMUTABLE = 'i';
    public static final char STABLE = 's';
    public static final char VOLATILE = 'v';

    protected List<String> operators = Collections.emptyList();
    protected List<String> collates = Collections.emptyList();
    protected List<String> opClasses = Collections.emptyList();
    protected List<String> tableAccessMethods = Collections.emptyList();
    // store and allow filtering by function volatility classifications
    protected final Map<String, Character> functionsAndTypes = new HashMap<>();
    protected List<Character> allowedFunctionTypes = Arrays.asList(IMMUTABLE, STABLE, VOLATILE);

    @Override
    public void setConnection(SQLConnection con) {
        super.setConnection(con);
        try {
            this.opClasses = getOpclasses(getConnection());
            this.operators = getOperators(getConnection());
            this.collates = getCollnames(getConnection());
            this.tableAccessMethods = getTableAccessMethods(getConnection());
        } catch (SQLException e) {
            throw new AssertionError(e);
        }
    }

    protected List<String> getCollnames(SQLConnection con) throws SQLException {
        List<String> collNames = new ArrayList<>();
        try (Statement s = con.createStatement()) {
            try (ResultSet rs = s
                    .executeQuery("SELECT collname FROM pg_collation WHERE collname LIKE '%utf8' or collname = 'C';")) {
                while (rs.next()) {
                    collNames.add(rs.getString(1));
                }
            }
        }
        return collNames;
    }

    protected List<String> getOpclasses(SQLConnection con) throws SQLException {
        List<String> opClasses = new ArrayList<>();
        try (Statement s = con.createStatement()) {
            try (ResultSet rs = s.executeQuery("select opcname FROM pg_opclass;")) {
                while (rs.next()) {
                    opClasses.add(rs.getString(1));
                }
            }
        }
        return opClasses;
    }

    protected List<String> getOperators(SQLConnection con) throws SQLException {
        List<String> operators = new ArrayList<>();
        try (Statement s = con.createStatement()) {
            try (ResultSet rs = s.executeQuery("SELECT oprname FROM pg_operator;")) {
                while (rs.next()) {
                    operators.add(rs.getString(1));
                }
            }
        }
        return operators;
    }

    private List<String> getTableAccessMethods(SQLConnection con) throws SQLException {
        List<String> tableAccessMethods = new ArrayList<>();
        try (Statement s = con.createStatement()) {
            /*
             * pg_am includes both index and table access methods so we need to filter with amtype = 't'
             */
            try (ResultSet rs = s.executeQuery("SELECT amname FROM pg_am WHERE amtype = 't';")) {
                while (rs.next()) {
                    tableAccessMethods.add(rs.getString(1));
                }
            }
        }
        return tableAccessMethods;
    }

    public List<String> getOperators() {
        return operators;
    }

    public String getRandomOperator() {
        return Randomly.fromList(operators);
    }

    public List<String> getCollates() {
        return collates;
    }

    public String getRandomCollate() {
        return Randomly.fromList(collates);
    }

    public List<String> getOpClasses() {
        return opClasses;
    }

    public String getRandomOpclass() {
        return Randomly.fromList(opClasses);
    }

    public List<String> getTableAccessMethods() {
        return tableAccessMethods;
    }

    public String getRandomTableAccessMethod() {
        return Randomly.fromList(tableAccessMethods);
    }

    @Override
    public abstract S readSchema() throws SQLException;

    public void addFunctionAndType(String functionName, Character functionType) {
        this.functionsAndTypes.put(functionName, functionType);
    }

    public Map<String, Character> getFunctionsAndTypes() {
        return this.functionsAndTypes;
    }

    public void setAllowedFunctionTypes(List<Character> types) {
        this.allowedFunctionTypes = types;
    }

    public void setDefaultAllowedFunctionTypes() {
        this.allowedFunctionTypes = Arrays.asList(IMMUTABLE, STABLE, VOLATILE);
    }

    public List<Character> getAllowedFunctionTypes() {
        return this.allowedFunctionTypes;
    }

}
