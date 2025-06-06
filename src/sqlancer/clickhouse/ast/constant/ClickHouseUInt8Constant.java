package sqlancer.clickhouse.ast.constant;

import com.clickhouse.client.ClickHouseDataType;

import sqlancer.clickhouse.ast.ClickHouseNumericConstant;

public class ClickHouseUInt8Constant extends ClickHouseNumericConstant<Integer> {

    public ClickHouseUInt8Constant(int value) {
        super(value);
    }

    @Override
    public ClickHouseDataType getDataType() {
        return ClickHouseDataType.UInt8;
    }

    @Override
    public boolean compareInternal(Object val) {
        return value == (int) val;
    }

    @Override
    public long asInt() {
        return value;
    }

}
