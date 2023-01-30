package cn.edu.tsinghua.iginx.sharedstore;

import cn.edu.tsinghua.iginx.engine.physical.memory.execute.Table;
import cn.edu.tsinghua.iginx.engine.shared.data.read.Field;
import cn.edu.tsinghua.iginx.engine.shared.data.read.Header;
import cn.edu.tsinghua.iginx.engine.shared.data.read.Row;
import cn.edu.tsinghua.iginx.sharedstore.utils.RowStreamHolder;
import cn.edu.tsinghua.iginx.sharedstore.utils.RowStreamStoreUtils;
import cn.edu.tsinghua.iginx.thrift.DataType;
import com.alibaba.fastjson2.JSON;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class BinaryDemo {

    public static void main(String[] args) throws Exception {
        Table tableA = generateTableFromValues(
                true,
                Arrays.asList(
                        new Field("a.a", DataType.INTEGER),
                        new Field("a.b", DataType.DOUBLE),
                        new Field("a.c", DataType.BOOLEAN),
                        new Field("a.d", DataType.BINARY)
                ),
                Arrays.asList(
                        Arrays.asList(2, 2.1, true, "null".getBytes()),
                        Arrays.asList(3, null, false, null),
                        Arrays.asList(3, 3.2, false, null),
                        Arrays.asList(4, 4.1, null, null),
                        Arrays.asList(5, 5.1, false, null),
                        Arrays.asList(null, 6.1, true, null)
                ));
        byte[] bytes = JSON.toJSONBytes(tableA);
        System.out.println("TableA: " + new String(bytes));

        Table tableB = JSON.parseObject(bytes, Table.class);
        System.out.println("TableB:" + new String(JSON.toJSONBytes(tableB)));

        System.out.println("estimate: " + RowStreamStoreUtils.estimateRowStreamSize(new RowStreamHolder(tableA)));
        System.out.println("actual: " + bytes.length);

        RowStreamStoreUtils.storeRowStream("93589", new RowStreamHolder(tableA));
        tableB = (Table) RowStreamStoreUtils.loadRowStream("93589");
        System.out.println("TableB:" + new String(JSON.toJSONBytes(tableB)));
    }

    private static Table generateTableFromValues(boolean hasTimestamp, List<Field> fields, List<List<Object>> values) {
        Header header;
        if (hasTimestamp) {
            header = new Header(Field.KEY, fields);
        } else {
            header = new Header(fields);
        }
        List<Row> rows = new ArrayList<>();
        for (int i = 0; i < values.size(); i++) {
            if (hasTimestamp) {
                rows.add(new Row(header, i + 1, values.get(i).toArray()));
            } else {
                rows.add(new Row(header, values.get(i).toArray()));
            }
        }
        return new Table(header, rows);
    }

}
