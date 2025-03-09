package sqlancer;

public class SQLDiscardGenerator {

    protected SQLDiscardGenerator() {
    }

    protected static boolean canDiscardTemporaryTables(String what) {
        return what.contentEquals("TEMPORARY") || what.contentEquals("TEMP") || what.contentEquals("ALL");
    }
}
