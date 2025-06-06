package sqlancer.sqlite3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import sqlancer.common.query.ExpectedErrors;

public final class SQLite3Errors {

    private SQLite3Errors() {
    }

    public static List<String> getDeleteErrors() {
        ArrayList<String> errors = new ArrayList<>();

        // DELETE trigger for a view/table to which colomns were added or deleted
        errors.add("columns but");
        // trigger with on conflict clause
        errors.add("ON CONFLICT clause does not match any PRIMARY KEY or UNIQUE constraint");

        return errors;
    }

    public static void addDeleteErrors(ExpectedErrors errors) {
        errors.addAll(getDeleteErrors());
    }

    public static List<String> getExpectedExpressionErrors() {
        ArrayList<String> errors = new ArrayList<>();

        errors.add("[SQLITE_BUSY]  The database file is locked");
        errors.add("FTS expression tree is too large");
        errors.add("String or BLOB exceeds size limit");
        errors.add("[SQLITE_ERROR] SQL error or missing database (integer overflow)");
        errors.add("ORDER BY term out of range");
        errors.add("GROUP BY term out of range");
        errors.add("not authorized"); // load_extension
        errors.add("aggregate functions are not allowed in the GROUP BY clause");
        errors.add("parser stack overflow");

        // nested query
        errors.add("misuse of aggregate");
        errors.add("second argument to nth_value must be a positive integer");
        errors.add("parser stack overflow");

        // window functions
        errors.add("RANGE with offset PRECEDING/FOLLOWING requires one ORDER BY expression");
        errors.add("frame starting offset must be a non-negative integer");
        errors.add("frame starting offset must be a non-negative number");
        errors.add("unsupported frame specification");
        errors.add("frame ending offset must be a non-negative integer");
        errors.add("frame ending offset must be a non-negative number");
        errors.add("argument of ntile must be a positive integer");

        errors.add("malformed JSON");
        errors.add("JSON cannot hold BLOB values");
        errors.add("JSON path error");
        errors.add("bad JSON path");
        errors.add("json_insert() needs an odd number of arguments");
        errors.add("json_object() labels must be TEXT");
        errors.add("json_object() requires an even number of arguments");
        errors.add("argument of ntile must be a positive integer");

        // fts5 functions
        errors.add("unable to use function highlight in the requested context");
        errors.add("no such cursor");

        // INDEXED BY
        errors.add("no query solution");
        errors.add("no such index");

        // UNION/INTERSECT ...
        errors.add("ORDER BY term does not match any column in the result set");
        errors.add("ORDER BY clause should come after");
        errors.add("LIMIT clause should come after");

        errors.add("unsafe use of load_extension");
        errors.add("table does not support scanning");
        errors.add("circularly defined");
        errors.add("[SQLITE_ERROR] SQL error or missing database"); // A possible delay in the execution of DROP TABLE
                                                                    // statement.
        return errors;
    }

    public static void addExpectedExpressionErrors(ExpectedErrors errors) {
        errors.addAll(getExpectedExpressionErrors());
    }

    public static List<String> getMatchQueryErrors() {
        ArrayList<String> errors = new ArrayList<>();

        errors.add("unable to use function MATCH in the requested context");
        errors.add("malformed MATCH expression");
        errors.add("fts5: syntax error near");
        errors.add("no such column"); // vt0.c0 MATCH '-799256540'
        errors.add("unknown special query"); // vt0.c1 MATCH '*YD)LC3^cG|'
        errors.add("fts5: column queries are not supported"); // vt0.c0 MATCH '2016456922'
        errors.add("fts5: phrase queries are not supported");
        errors.add("unterminated string");

        return errors;
    }

    public static void addMatchQueryErrors(ExpectedErrors errors) {
        errors.addAll(getMatchQueryErrors());
    }

    public static List<String> getTableManipulationErrors() {
        ArrayList<String> errors = new ArrayList<>();

        errors.add("unsupported frame specification");
        errors.add("non-deterministic functions prohibited in CHECK constraints");
        errors.addAll(Arrays.asList("subqueries prohibited in CHECK constraints",
                "generated columns cannot be part of the PRIMARY KEY", "must have at least one non-generated column"));

        return errors;
    }

    public static void addTableManipulationErrors(ExpectedErrors errors) {
        errors.addAll(getTableManipulationErrors());
    }

    public static List<String> getQueryErrors() {
        ArrayList<String> errors = new ArrayList<>();

        errors.add("ON clause references tables to its right");

        return errors;
    }

    public static void addQueryErrors(ExpectedErrors errors) {
        errors.addAll(getQueryErrors());
    }

    public static List<String> getInsertNowErrors() {
        ArrayList<String> errors = new ArrayList<>();

        errors.add("non-deterministic use of strftime()");
        errors.add("non-deterministic use of time()");
        errors.add("non-deterministic use of datetime()");
        errors.add("non-deterministic use of julianday()");
        errors.add("non-deterministic use of date()");

        return errors;
    }

    public static void addInsertNowErrors(ExpectedErrors errors) {
        errors.addAll(getInsertNowErrors());
    }

    public static List<String> getInsertUpdateErrors() {
        ArrayList<String> errors = new ArrayList<>();

        errors.add("String or BLOB exceeds size limit");
        errors.add("[SQLITE_CONSTRAINT_CHECK]");
        errors.add("[SQLITE_CONSTRAINT_PRIMARYKEY]");
        errors.add("[SQLITE_CONSTRAINT]");
        errors.add("[SQLITE_CONSTRAINT_NOTNULL]");
        errors.add("[SQLITE_CONSTRAINT_UNIQUE]");
        errors.add("cannot INSERT into generated column"); // TODO: filter out generated columns
        errors.add("A table in the database is locked"); // https://www.sqlite.org/src/tktview?name=56a74875be
        errors.add("The database file is locked");
        errors.add("too many levels of trigger recursion");
        errors.add("cannot UPDATE generated column");
        errors.add("[SQLITE_ERROR] SQL error or missing database (no such table:");
        errors.add("[SQLITE_ERROR] SQL error or missing database (foreign key mismatch");
        errors.add("no such column"); // trigger

        return errors;
    }

    public static void addInsertUpdateErrors(ExpectedErrors errors) {
        errors.addAll(getInsertUpdateErrors());
    }

    public static List<String> getIOErrors() {
        ArrayList<String> errors = new ArrayList<>();

        errors.add("[SQLITE_IOERR_DELETE_NOENT] The file being deleted does not exist (disk I/O error)");
        errors.add("[SQLITE_CANTOPEN] Unable to open the database file (unable to open database file)");
        errors.add("[SQLITE_CORRUPT] The database disk image is malformed (database disk image is malformed)");
        errors.add(
                "[SQLITE_IOERR_SHORT_READ] The VFS layer was unable to obtain as many bytes as was requested (disk I/O error)");
        errors.add("[SQLITE_NOTADB] File opened that is not a database file (file is not a database)");
        errors.add("[SQLITE_PROTOCOL] NOT USED. Database lock protocol error (locking protocol)");
        errors.add(
                "[SQLITE_READONLY_DBMOVED] The database file has been moved since it was opened (attempt to write a readonly database)");

        return errors;
    }

    public static void addIOErrors(ExpectedErrors errors) {
        errors.addAll(getIOErrors());
    }

}
