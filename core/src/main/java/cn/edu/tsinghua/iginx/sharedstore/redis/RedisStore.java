package cn.edu.tsinghua.iginx.sharedstore.redis;

import cn.edu.tsinghua.iginx.sharedstore.SharedStore;
import redis.clients.jedis.Jedis;

public class RedisStore implements SharedStore {

    private static final String REDIS_URL = "http://127.0.0.1:6379";

    private static final RedisStore INSTANCE = new RedisStore();

    private final Jedis jedis;

    private RedisStore() {
        jedis = new Jedis(REDIS_URL);
    }

    @Override
    public boolean put(byte[] key, byte[] value) {
        return "OK".equals(jedis.set(key, value));
    }

    @Override
    public byte[] get(byte[] key) {
        return jedis.get(key);
    }

    @Override
    public boolean delete(byte[] key) {
        return jedis.del(key) == 1L;
    }

    @Override
    public boolean exists(byte[] key) {
        return jedis.exists(key);
    }

    public static RedisStore getInstance() {
        return INSTANCE;
    }

}
