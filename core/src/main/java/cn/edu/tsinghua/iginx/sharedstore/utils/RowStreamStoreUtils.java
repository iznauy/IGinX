package cn.edu.tsinghua.iginx.sharedstore.utils;

import cn.edu.tsinghua.iginx.engine.physical.exception.PhysicalException;
import cn.edu.tsinghua.iginx.engine.physical.memory.execute.Table;
import cn.edu.tsinghua.iginx.engine.shared.data.read.Header;
import cn.edu.tsinghua.iginx.engine.shared.data.read.Row;
import cn.edu.tsinghua.iginx.engine.shared.data.read.RowStream;
import cn.edu.tsinghua.iginx.sharedstore.SharedStore;
import cn.edu.tsinghua.iginx.sharedstore.redis.RedisStore;
import com.alibaba.fastjson2.JSON;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.nio.charset.StandardCharsets;
import java.util.List;

public class RowStreamStoreUtils {

    private static final Logger logger = LoggerFactory.getLogger(RowStreamStoreUtils.class);

    private static final SharedStore sharedStore = RedisStore.getInstance();

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

    public static RowStream loadRowStream(String key) throws IllegalArgumentException {
        byte[] bytes = sharedStore.get(key.getBytes(StandardCharsets.UTF_8));
        if (bytes == null) {
            throw new IllegalArgumentException("row stream for key: " + key + " is not exists.");
        }
        logger.info("[loadRowStream] load key: " + key + ", store value: " + new String(bytes));
        Table table = JSON.parseObject(bytes, Table.class);
        List<Row> rows = table.getRows();
        for (Row row: rows) {
            row.setHeader(table.getHeader());
        }
        return table;
    }

    public static String encodeKey(long queryId, int sequence) {
        return String.format("p_%d_%d", queryId, sequence);
    }


}
