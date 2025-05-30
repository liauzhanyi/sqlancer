package sqlancer.oceanbase;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Pattern;

import sqlancer.common.query.ExpectedErrors;

public final class OceanBaseErrors {

    private OceanBaseErrors() {
    }

    public static List<String> getExpressionErrors() {
        ArrayList<String> errors = new ArrayList<>();

        errors.add("BIGINT value is out of range"); // e.g., CAST(-('-1e500') AS SIGNED)
        errors.add("is not valid for CHARACTER SET");
        errors.add("The observer or zone is not the master");
        errors.add("Incorrect integer value");
        errors.add("Truncated incorrect DOUBLE value");
        errors.add("Invalid numeric");
        errors.add("Data truncated for argument");
        errors.add("Data truncated for column");

        return errors;
    }

    public static List<Pattern> getExpressionErrorsRegex() {
        ArrayList<Pattern> errors = new ArrayList<>();
        errors.add(Pattern.compile("Unknown column '.+' in 'order clause'"));

        return errors;
    }

    public static List<String> getInsertErrors() {
        ArrayList<String> errors = new ArrayList<>();

        errors.add("Duplicate entry");
        errors.add("cannot be null");
        errors.add("doesn't have a default value");
        errors.add("Out of range value");
        errors.add("Incorrect double value");
        errors.add("Incorrect float value");
        errors.add("Incorrect int value");
        errors.add("Incorrect tinyint value");
        errors.add("Data truncation");
        errors.add("Bad Number");
        errors.add("The value specified for generated column"); // TODO: do not insert data into generated columns
        errors.add("incorrect utf8 value");
        errors.add("Data truncation: %s value is out of range in '%s'");
        errors.add("Incorrect smallint value");
        errors.add("Incorrect bigint value");
        errors.add("Incorrect decimal value");
        errors.add("error parsing regexp");
        errors.add("The observer or zone is not the master");
        errors.add("Incorrect integer value");
        errors.add("Truncated incorrect DOUBLE value");
        errors.add("Data truncated for argument");
        errors.add("Invalid numeric");
        errors.add("Miss column");

        return errors;
    }

    public static void addInsertErrors(ExpectedErrors errors) {
        errors.addAll(getInsertErrors());
    }

    public static void addExpressionErrors(ExpectedErrors errors) {
        errors.addAll(getExpressionErrors());
    }
}
