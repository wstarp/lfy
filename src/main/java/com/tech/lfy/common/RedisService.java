//package com.tech.lfy.common;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.data.redis.core.HashOperations;
//import org.springframework.data.redis.core.ListOperations;
//import org.springframework.data.redis.core.RedisTemplate;
//import org.springframework.data.redis.core.ValueOperations;
//import org.springframework.stereotype.Service;
//
//import java.io.Serializable;
//import java.util.List;
//import java.util.concurrent.TimeUnit;
//
//
//@Service
//public class RedisService {
//
//    @Autowired
//    private RedisTemplate redisTemplate;
//    /**
//     * 写入缓存
//     * @param key
//     * @param value
//     * @return
//     */
//    public boolean set(String key, Object value) {
//        boolean result = false;
//        try {
//            ValueOperations<Serializable, Object> operations = redisTemplate.opsForValue();
//            operations.set(key, value);
//            result = true;
//        } catch (Exception e) {
//            e.printStackTrace();
//        }
//        return result;
//    }
//    /**
//     * 写入缓存设置时效时间
//     * @param key
//     * @param value
//     * @return
//     */
//    public boolean set(String key, Object value, Long expireTime) {
//        boolean result = false;
//        try {
//            ValueOperations<Serializable, Object> operations = redisTemplate.opsForValue();
//            operations.set(key, value);
//            redisTemplate.expire(key, expireTime, TimeUnit.SECONDS);
//            result = true;
//        } catch (Exception e) {
//            e.printStackTrace();
//        }
//        return result;
//    }
//    /**
//     * 批量删除对应的value
//     * @param keys
//     */
//    public void remove(String... keys) {
//        for (String key : keys) {
//            remove(key);
//        }
//    }
//
//    /**
//     * 删除对应的value
//     * @param key
//     */
//    public void remove(String key) {
//        if (exists(key)) {
//            redisTemplate.delete(key);
//        }
//    }
//    /**
//     * 判断缓存中是否有对应的value
//     * @param key
//     * @return
//     */
//    public boolean exists(String key) {
//        return redisTemplate.hasKey(key);
//    }
//    /**
//     * 读取缓存
//     * @param key
//     * @return
//     */
//    public Object get(String key) {
//        Object result = null;
//        ValueOperations<Serializable, Object> operations = redisTemplate.opsForValue();
//        result = operations.get(key);
//        return result;
//    }
//    /**
//     * 哈希 添加
//     * @param key
//     * @param hashKey
//     * @param value
//     */
//    public void hmSet(String key, Object hashKey, Object value){
//        HashOperations<String, Object, Object> hash = redisTemplate.opsForHash();
//        hash.put(key,hashKey,value);
//    }
//
//    /**
//     * 哈希获取数据
//     * @param key
//     * @param hashKey
//     * @return
//     */
//    public Object hmGet(String key, Object hashKey){
//        HashOperations<String, Object, Object>  hash = redisTemplate.opsForHash();
//        return hash.get(key,hashKey);
//    }
//
//    /**
//     * 列表添加
//     * @param k
//     * @param v
//     */
//    public void lPush(String k,Object v){
//        ListOperations<String, Object> list = redisTemplate.opsForList();
//        list.rightPush(k,v);
//    }
//
//    /**
//     * 列表获取
//     * @param k
//     * @param l
//     * @param l1
//     * @return
//     */
//    public List<Object> lRange(String k, long l, long l1){
//        ListOperations<String, Object> list = redisTemplate.opsForList();
//        return list.range(k,l,l1);
//    }
//
//}