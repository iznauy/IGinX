package cn.edu.tsinghua.iginx.sharedstore.utils;

import cn.edu.tsinghua.iginx.conf.ConfigDescriptor;
import cn.edu.tsinghua.iginx.engine.physical.exception.PhysicalException;
import cn.edu.tsinghua.iginx.engine.physical.memory.execute.Table;
import cn.edu.tsinghua.iginx.engine.shared.data.read.Header;
import cn.edu.tsinghua.iginx.engine.shared.data.read.Row;
import cn.edu.tsinghua.iginx.engine.shared.data.read.RowStream;
import cn.edu.tsinghua.iginx.sharedstore.SharedStore;
import cn.edu.tsinghua.iginx.sharedstore.SharedStoreManager;
import cn.edu.tsinghua.iginx.thrift.DataType;
import com.alibaba.fastjson2.JSON;
import com.alibaba.fastjson2.JSONArray;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.nio.charset.StandardCharsets;
import java.util.List;

public class RowStreamStoreUtils {

    private static final Logger logger = LoggerFactory.getLogger(RowStreamStoreUtils.class);

    private static final SharedStore sharedStore = SharedStoreManager.getInstance().getSharedStore(ConfigDescriptor.getInstance().getConfig().getSharedStorage());

    public static long estimateRowStreamSize(RowStreamHolder holder) throws PhysicalException {
        Table table = holder.getAsTable();
        long estimatedSize = 46L;
        try {
            Header header = table.getHeader();
            estimatedSize += JSON.toJSONBytes(header).length;
            List<Row> rows = table.getRows();
            if (!rows.isEmpty()) {
                int sampleCnt = Math.min(5, rows.size());
                double sampleSize = 0.0;
                for (int i = 0; i < sampleCnt; i++) {
                    sampleSize += JSON.toJSONBytes(rows.get(i)).length;
                }
                estimatedSize += (long)((sampleSize / sampleCnt + 1) * rows.size());
            }
        } finally {
            table.reset();
            holder.setTable(table);
        }
        return estimatedSize;
    }

    public static boolean storeRowStream(String key, RowStreamHolder holder) throws PhysicalException {
        Table table = holder.getAsTable();
        try {
            byte[] bytes = JSON.toJSONBytes(table);
            logger.info("[storeRowStream] store key: " + key + ", store value: " + new String(bytes));
            return sharedStore.put(key.getBytes(StandardCharsets.UTF_8), bytes);
        } finally {
            table.reset();
            holder.setTable(table);
        }
    }

    public static RowStream loadRowStream(String key) {
        byte[] bytes = sharedStore.get(key.getBytes(StandardCharsets.UTF_8));
        if (bytes == null) {
            logger.info("row stream for key: " + key + " is not exists.");
            return null;
        }
        logger.info("[loadRowStream] load key: " + key + ", store value: " + new String(bytes));
        Table table = JSON.parseObject(bytes, Table.class);
        List<Row> rows = table.getRows();
        for (Row row: rows) {
            row.setHeader(table.getHeader());
            Object[] values = row.getValues();
            for (int i = 0; i < values.length; i++) {
                if (values[i] == null) {
                    continue;
                }
                if (row.getField(i).getType() == DataType.LONG) {
                    values[i] = ((Number) values[i]).longValue();
                } else if (row.getField(i).getType() == DataType.DOUBLE) {
                    values[i] = ((Number) values[i]).doubleValue();
                } else if (row.getField(i).getType() == DataType.BINARY) {
                    JSONArray jsonArr = (JSONArray) values[i];
                    byte[] arr = new byte[jsonArr.size()];
                    for (int j = 0; j < jsonArr.size(); j++) {
                        int value = jsonArr.getInteger(j);
                        arr[j] = (byte) value;
                    }
                    values[i] = arr;
                }
            }
        }
        return table;
    }

    public static boolean checkRowStream(String key) {
        return sharedStore.exists(key.getBytes(StandardCharsets.UTF_8));
    }

    public static String encodeKey(long queryId, int sequence) {
        return String.format("p_%d_%d", queryId, sequence);
    }


}
