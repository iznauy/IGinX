package cn.edu.tsinghua.iginx.sharedstore.utils;

import cn.edu.tsinghua.iginx.engine.shared.RequestContext;
import cn.edu.tsinghua.iginx.sharedstore.SharedStore;
import cn.edu.tsinghua.iginx.sharedstore.redis.RedisStore;
import com.alibaba.fastjson2.JSON;

import java.nio.charset.StandardCharsets;

public class QueryStoreUtils {

    private static final SharedStore sharedStore = RedisStore.getInstance();

    public static boolean storeQueryContext(RequestContext context){
        long queryId = context.getId();
        byte[] bytes = JSON.toJSONBytes(context);
        return sharedStore.put(Long.toString(queryId).getBytes(StandardCharsets.UTF_8), bytes);
    }

    public static RequestContext loadQueryContext(long queryId) throws IllegalArgumentException {
        byte[] bytes = sharedStore.get(Long.toString(queryId).getBytes(StandardCharsets.UTF_8));
        if (bytes == null) {
            throw new IllegalArgumentException("query context for key: " + queryId + " is not exists.");
        }
        return JSON.parseObject(bytes, RequestContext.class);
    }

}
