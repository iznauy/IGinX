package cn.edu.tsinghua.iginx.engine.shared.function.tsbs;

import cn.edu.tsinghua.iginx.engine.physical.memory.execute.Table;
import cn.edu.tsinghua.iginx.engine.shared.data.Value;
import cn.edu.tsinghua.iginx.engine.shared.data.read.Field;
import cn.edu.tsinghua.iginx.engine.shared.data.read.Header;
import cn.edu.tsinghua.iginx.engine.shared.data.read.Row;
import cn.edu.tsinghua.iginx.engine.shared.data.read.RowStream;
import cn.edu.tsinghua.iginx.engine.shared.function.FunctionType;
import cn.edu.tsinghua.iginx.engine.shared.function.MappingFunction;
import cn.edu.tsinghua.iginx.engine.shared.function.MappingType;
import cn.edu.tsinghua.iginx.engine.shared.function.system.ArithmeticExpr;
import cn.edu.tsinghua.iginx.thrift.DataType;
import cn.edu.tsinghua.iginx.utils.Pair;

import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Transposition implements MappingFunction {

    @Override
    public FunctionType getFunctionType() {
        return FunctionType.System;
    }

    @Override
    public MappingType getMappingType() {
        return MappingType.Mapping;
    }

    @Override
    public String getIdentifier() {
        return "tsbs_transposition";
    }

    @Override
    public RowStream transform(RowStream rows, Map<String, Value> params) throws Exception {
        boolean hasKey = rows.getHeader().hasKey();
        List<Pair<byte[], byte[]>> fields = rows.getHeader().getFields().stream().map(e -> {
            String name = e.getName();
            String[] parts = name.split("\\.");
            return new Pair<>(parts[1].getBytes(StandardCharsets.UTF_8), parts[parts.length - 1].getBytes(StandardCharsets.UTF_8));
        }).collect(Collectors.toList());

        List<Field> targetFields = new ArrayList<>();
        targetFields.add(new Field("truck", DataType.BINARY));
        targetFields.add(new Field("name", DataType.BINARY));
        targetFields.add(new Field("value", DataType.DOUBLE));

        Header header = new Header(hasKey? Field.KEY : null, targetFields);

        List<Row> rowList = new ArrayList<>();
        while (rows.hasNext()) {
            Row row = rows.next();
            for (int i = 0; i < fields.size(); i++) {
                Object[] values = new Object[3];
                values[0] = fields.get(i).k;
                values[1] = fields.get(i).v;
                values[2] = row.getValue(i);
                if (hasKey) {
                    rowList.add(new Row(header, row.getKey(), values));
                } else {
                    rowList.add(new Row(header, values));
                }
            }
        }

        return new Table(header, rowList);
    }

    private static final Transposition INSTANCE = new Transposition();

    private Transposition() {
    }

    public static Transposition getInstance() {
        return INSTANCE;
    }
}
