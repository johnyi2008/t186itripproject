package com.yyaccp.common;

import redis.clients.jedis.Jedis;
import redis.clients.jedis.JedisPool;

public class RedisAPI {
    private JedisPool jedisPool;

    public void setJedisPool(JedisPool jedisPool) {
        this.jedisPool = jedisPool;
    }

    public String get(String key) {
        Jedis jedis = null;
        String value = null;
        try {
            jedis = jedisPool.getResource();
            value = jedis.get(key);
        } catch (Exception e) {
            e.printStackTrace();;
        } finally {
            jedisPool.returnResource(jedis);
        }
        return value;
    }

    public void set(String key, String value) {
        Jedis jedis = null;
        try {
            jedis = jedisPool.getResource();
            jedis.set(key, value);
        } catch (Exception e) {
            e.printStackTrace();;
        } finally {
            jedisPool.returnResource(jedis);
        }
    }
    public void setEx(String key, int seconds, String value) {
        Jedis jedis = null;
        try {
            jedis = jedisPool.getResource();
            jedis.setex(key, seconds,value);
        } catch (Exception e) {
            e.printStackTrace();;
        } finally {
            jedisPool.returnResource(jedis);
        }
    }

}
