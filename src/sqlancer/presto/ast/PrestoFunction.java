package sqlancer.presto.ast;

import java.util.ArrayList;
import java.util.List;

import sqlancer.Randomly;
import sqlancer.SQLPair;
import sqlancer.presto.PrestoSchema;
import sqlancer.presto.PrestoUtils;
import sqlancer.presto.gen.PrestoTypedExpressionGenerator;

public interface PrestoFunction extends PrestoExpression {

    String getFunctionName();

    boolean isCompatibleWithReturnType(PrestoSchema.PrestoCompositeDataType returnType);

    PrestoSchema.PrestoDataType[] getArgumentTypes(PrestoSchema.PrestoCompositeDataType returnType);

    default List<PrestoExpression> getArgumentsForReturnType(PrestoTypedExpressionGenerator gen, int depth,
            PrestoSchema.PrestoDataType[] argumentTypes, PrestoSchema.PrestoCompositeDataType returnType) {

        List<PrestoExpression> arguments = new ArrayList<>();

        // This is a workaround based on the assumption that array types should refer to
        // the same element type.
        PrestoSchema.PrestoCompositeDataType savedArrayType = null;
        if (returnType.getPrimitiveDataType() == PrestoSchema.PrestoDataType.ARRAY) {
            savedArrayType = returnType;
        }
        // -1 - unlimited number of arguments
        if (getNumberOfArguments() == -1) {
            SQLPair<List<PrestoSchema.PrestoCompositeDataType>, PrestoSchema.PrestoCompositeDataType> result = PrestoUtils
                    .prepareVariadicArgumentTypes(argumentTypes[0], savedArrayType);

            List<PrestoSchema.PrestoCompositeDataType> typeList = result.getFirstValue();
            savedArrayType = result.getSecondValue();

            for (PrestoSchema.PrestoCompositeDataType type : typeList) {
                arguments.add(gen.generateExpression(type, depth + 1));
            }
        } else {
            for (PrestoSchema.PrestoDataType arg : argumentTypes) {
                PrestoSchema.PrestoCompositeDataType dataType;
                if (arg == PrestoSchema.PrestoDataType.ARRAY) {
                    if (savedArrayType == null) {
                        savedArrayType = arg.get();
                    }
                    dataType = savedArrayType;
                } else {
                    dataType = PrestoSchema.PrestoCompositeDataType.fromDataType(arg);
                }
                PrestoExpression expression = gen.generateExpression(dataType, depth + 1);
                arguments.add(expression);
            }
        }
        return arguments;
    }

    default List<PrestoExpression> getArgumentsForReturnType(PrestoTypedExpressionGenerator gen, int depth,
            PrestoSchema.PrestoCompositeDataType returnType, boolean orderable) {

        List<PrestoExpression> arguments = new ArrayList<>();

        // This is a workaround based on the assumption that array types should refer to
        // the same element type.
        PrestoSchema.PrestoCompositeDataType savedArrayType = null;
        if (returnType.getPrimitiveDataType() == PrestoSchema.PrestoDataType.ARRAY) {
            savedArrayType = returnType;
        }
        if (getNumberOfArguments() == -1) {
            PrestoSchema.PrestoDataType dataType = getArgumentTypes(returnType)[0];
            // TODO: consider upper
            long no = Randomly.getNotCachedInteger(2, 10);
            for (int i = 0; i < no; i++) {
                PrestoSchema.PrestoCompositeDataType compositeDataType;
                if (dataType == PrestoSchema.PrestoDataType.ARRAY) {
                    if (savedArrayType == null) {
                        savedArrayType = dataType.get();
                    }
                    compositeDataType = savedArrayType;
                } else {
                    compositeDataType = PrestoSchema.PrestoCompositeDataType.fromDataType(dataType);
                }
                arguments.add(gen.generateExpression(compositeDataType, depth + 1));
            }
        } else {
            for (PrestoSchema.PrestoDataType dataType : getArgumentTypes(returnType)) {
                PrestoSchema.PrestoCompositeDataType compositeDataType;
                if (dataType == PrestoSchema.PrestoDataType.ARRAY) {
                    if (savedArrayType == null) {
                        PrestoSchema.PrestoCompositeDataType arrayType;
                        do {
                            arrayType = dataType.get();
                        } while (!arrayType.getElementType().isOrderable());
                        savedArrayType = arrayType;
                    }
                    compositeDataType = savedArrayType;
                } else {
                    compositeDataType = PrestoSchema.PrestoCompositeDataType.fromDataType(dataType);
                }
                PrestoExpression expression = gen.generateExpression(compositeDataType, depth + 1);
                arguments.add(expression);
            }
        }
        return arguments;
    }

    default int getNumberOfArguments() {
        return getArgumentTypes(null).length;
    }

    default boolean shouldPreserveOrderOfArguments() {
        return false;
    }

    default boolean isStandardFunction() {
        return true;
    }

}
