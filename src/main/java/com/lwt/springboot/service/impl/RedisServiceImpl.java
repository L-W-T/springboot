package com.lwt.springboot.service.impl;

import com.lwt.springboot.service.IRedisService;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.core.ZSetOperations;
import org.springframework.stereotype.Service;
import org.springframework.util.CollectionUtils;

import javax.annotation.Resource;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.TimeUnit;

/**
 * @program: springboot
 * @description:
 * @author: liangwt
 * @create: 2019-05-10 14:17
 **/
@Service
public class RedisServiceImpl implements IRedisService {
    @Resource
    private RedisTemplate redisTemplate;
    //=============================common============================
    /**
     * 指定缓存失效时间
     * @param key 键
     * @param time 时间(秒)
     * @return
     */
    @Override
    public boolean expire(String key,long time){
        if(time>0){
            redisTemplate.expire(key, time, TimeUnit.SECONDS);
        }
        return true;
    }

    /**
     * 根据key 获取过期时间
     * @param key 键 不能为null
     * @return 时间(秒) 返回0代表为永久有效
     */
    @Override
    public long getExpire(String key){
        return redisTemplate.getExpire(key,TimeUnit.SECONDS);
    }

    /**
     * 判断key是否存在
     * @param key 键
     * @return true 存在 false不存在
     */
    @Override
    public boolean hasKey(String key){
        return redisTemplate.hasKey(key);
    }

    /**
     * 删除缓存
     * @param key 可以传一个值 或多个
     */
    @Override
    @SuppressWarnings("unchecked")
    public void del(String ... key){
        if(key!=null&&key.length>0){
            if(key.length==1){
                redisTemplate.delete(key[0]);
            }else{
                redisTemplate.delete(CollectionUtils.arrayToList(key));
            }
        }
    }

    //============================String=============================
    /**
     * 普通缓存获取
     * @param key 键
     * @return 值
     */
    @Override
    public Object get(String key){
        return key==null?null:redisTemplate.opsForValue().get(key);
    }

    /**
     * 普通缓存放入
     * @param key 键
     * @param value 值
     * @return true成功 false失败
     */
    @Override
    public boolean set(String key,Object value) {
        redisTemplate.opsForValue().set(key, value);
        return true;

    }

    /**
     * 普通缓存放入并设置时间
     * @param key 键
     * @param value 值
     * @param time 时间(秒) time要大于0 如果time小于等于0 将设置无限期
     * @return true成功 false 失败
     */
    @Override
    public boolean set(String key,Object value,long time){
        if(time>0){
            redisTemplate.opsForValue().set(key, value, time, TimeUnit.SECONDS);
        }else{
            set(key, value);
        }
        return true;
    }

    /**
     * 递增
     * @param key 键
     * @param delta 要增加几(大于0)
     * @return
     */
    @Override
    public long incr(String key, long delta){
        if(delta<0){
            throw new RuntimeException("递增因子必须大于0");
        }
        return redisTemplate.opsForValue().increment(key, delta);
    }

    /**
     * 递减
     * @param key 键
     * @param delta 要减少几(小于0)
     * @return
     */
    @Override
    public long decr(String key, long delta){
        if(delta<0){
            throw new RuntimeException("递减因子必须大于0");
        }
        return redisTemplate.opsForValue().increment(key, -delta);
    }

    //================================Map=================================
    /**
     * HashGet
     * @param key 键 不能为null
     * @param item 项 不能为null
     * @return 值
     */
    @Override
    public Object hget(String key,String item){
        return redisTemplate.opsForHash().get(key, item);
    }

    /**
     * 获取hashKey对应的所有键值
     * @param key 键
     * @return 对应的多个键值
     */
    @Override
    public Map<Object,Object> hmget(String key){
        return redisTemplate.opsForHash().entries(key);
    }

    /**
     * HashSet
     * @param key 键
     * @param map 对应多个键值
     * @return true 成功 false 失败
     */
    @Override
    public boolean hmset(String key, Map<String,Object> map){
        redisTemplate.opsForHash().putAll(key, map);
        return true;
    }

    /**
     * HashSet 并设置时间
     * @param key 键
     * @param map 对应多个键值
     * @param time 时间(秒)
     * @return true成功 false失败
     */
    @Override
    public boolean hmset(String key, Map<String,Object> map, long time){
        redisTemplate.opsForHash().putAll(key, map);
        if(time>0){
            expire(key, time);
        }
        return true;
    }

    /**
     * 向一张hash表中放入数据,如果不存在将创建
     * @param key 键
     * @param item 项
     * @param value 值
     * @return true 成功 false失败
     */
    @Override
    public boolean hset(String key,String item,Object value) {
        redisTemplate.opsForHash().put(key, item, value);
        return true;
    }

    /**
     * 向一张hash表中放入数据,如果不存在将创建
     * @param key 键
     * @param item 项
     * @param value 值
     * @param time 时间(秒)  注意:如果已存在的hash表有时间,这里将会替换原有的时间
     * @return true 成功 false失败
     */
    @Override
    public boolean hset(String key,String item,Object value,long time) {
        redisTemplate.opsForHash().put(key, item, value);
        if(time>0){
            expire(key, time);
        }
        return true;
    }

    /**
     * 删除hash表中的值
     * @param key 键 不能为null
     * @param item 项 可以使多个 不能为null
     */
    @Override
    public void hdel(String key, Object... item){
        redisTemplate.opsForHash().delete(key,item);
    }

    /**
     * 判断hash表中是否有该项的值
     * @param key 键 不能为null
     * @param item 项 不能为null
     * @return true 存在 false不存在
     */
    @Override
    public boolean hHasKey(String key, String item){
        return redisTemplate.opsForHash().hasKey(key, item);
    }

    /**
     * hash递增 如果不存在,就会创建一个 并把新增后的值返回
     * @param key 键
     * @param item 项
     * @param by 要增加几(大于0)
     * @return
     */
    @Override
    public double hincr(String key, String item,double by){
        return redisTemplate.opsForHash().increment(key, item, by);
    }

    /**
     * hash递减
     * @param key 键
     * @param item 项
     * @param by 要减少记(小于0)
     * @return
     */
    @Override
    public double hdecr(String key, String item,double by){
        return redisTemplate.opsForHash().increment(key, item,-by);
    }

    //============================set=============================
    /**
     * 根据key获取Set中的所有值
     * @param key 键
     * @return
     */
    @Override
    public Set<Object> sGet(String key){
        return redisTemplate.opsForSet().members(key);
    }

    /**
     * 根据value从一个set中查询,是否存在
     * @param key 键
     * @param value 值
     * @return true 存在 false不存在
     */
    @Override
    public boolean sHasKey(String key,Object value){
        return redisTemplate.opsForSet().isMember(key, value);
    }

    /**
     * 将数据放入set缓存
     * @param key 键
     * @param values 值 可以是多个
     * @return 成功个数
     */
    @Override
    public long sSet(String key, Object...values) {
        return redisTemplate.opsForSet().add(key, values);
    }

    /**
     * 将set数据放入缓存
     * @param key 键
     * @param time 时间(秒)
     * @param values 值 可以是多个
     * @return 成功个数
     */
    @Override
    public long sSetAndTime(String key,long time,Object...values) {
        Long count = redisTemplate.opsForSet().add(key, values);
        if(time>0) expire(key, time);
        return count;
    }

    /**
     * 获取set缓存的长度
     * @param key 键
     * @return
     */
    @Override
    public long sGetSetSize(String key){
        return redisTemplate.opsForSet().size(key);
    }

    /**
     * 移除值为value的
     * @param key 键
     * @param values 值 可以是多个
     * @return 移除的个数
     */
    @Override
    public long setRemove(String key, Object ...values) {
        Long count = redisTemplate.opsForSet().remove(key, values);
        return count;
    }
    //===============================list=================================

    /**
     * 获取list缓存的内容
     * @param key 键
     * @param start 开始
     * @param end 结束  0 到 -1代表所有值
     * @return
     */
    @Override
    public List<Object> lGet(String key, long start, long end){
        return redisTemplate.opsForList().range(key, start, end);
    }

    /**
     * 获取list缓存的长度
     * @param key 键
     * @return
     */
    @Override
    public long lGetListSize(String key){
        return redisTemplate.opsForList().size(key);
    }

    /**
     * 通过索引 获取list中的值
     * @param key 键
     * @param index 索引  index>=0时， 0 表头，1 第二个元素，依次类推；index<0时，-1，表尾，-2倒数第二个元素，依次类推
     * @return
     */
    @Override
    public Object lGetIndex(String key,long index){
        return redisTemplate.opsForList().index(key, index);
    }

    /**
     * 将list放入缓存
     * @param key 键
     * @param value 值
     * @return
     */
    @Override
    public boolean lSet(String key, Object value) {
        redisTemplate.opsForList().rightPush(key, value);
        return true;
    }

    /**
     * 将list放入缓存
     * @param key 键
     * @param value 值
     * @param time 时间(秒)
     * @return
     */
    @Override
    public boolean lSet(String key, Object value, long time) {
        redisTemplate.opsForList().rightPush(key, value);
        if (time > 0) expire(key, time);
        return true;
    }

    /**
     * 将list放入缓存
     * @param key 键
     * @param value 值
     * @return
     */
    @Override
    public boolean lSet(String key, List<Object> value) {
        redisTemplate.opsForList().rightPushAll(key, value);
        return true;
    }

    /**
     * 将list放入缓存
     * @param key 键
     * @param value 值
     * @param time 时间(秒)
     * @return
     */
    @Override
    public boolean lSet(String key, List<Object> value, long time) {
        redisTemplate.opsForList().rightPushAll(key, value);
        if (time > 0) expire(key, time);
        return true;
    }

    /**
     * 根据索引修改list中的某条数据
     * @param key 键
     * @param index 索引
     * @param value 值
     * @return
     */
    @Override
    public boolean lUpdateIndex(String key, long index,Object value) {
        redisTemplate.opsForList().set(key, index, value);
        return true;
    }

    /**
     * 移除N个值为value
     * @param key 键
     * @param count 移除多少个
     * @param value 值
     * @return 移除的个数
     */
    @Override
    public long lRemove(String key,long count,Object value) {
        Long remove = redisTemplate.opsForList().remove(key, count, value);
        return remove;
    }
    /**
     *
     * @param:             @param key
     * @param:             @param tuples
     * @param:             @return
     * @return:            long
     * @Description:       新增有序集合
     */
    @Override
    public long zAdd(Object key, Set tuples){
        long add=redisTemplate.opsForZSet().add(key, tuples);
        return add;
    }
    /**
     *
     * @param:             @param key
     * @param:             @param tuples
     * @param:             @return
     * @return:            long
     * @Description:       新增有序集合
     */
    @Override
    public boolean zAdd(Object key, Object value,double score){
        boolean add=redisTemplate.opsForZSet().add(key, value, score);
        return add;
    }
    /**
     *
     * @Title:             zAdd
     * @param:             @param key
     * @param:             @param tuples
     * @param:             @return
     * @return:            long
     * @throws
     * @Description:       获取有序集合
     */
    @Override
    public Set<Object> zGet(Object key){
        ZSetOperations opsForZSet = redisTemplate.opsForZSet();
        Set<Object> zget=opsForZSet.range(key, 0, opsForZSet.size(key));
        return zget;
    }
    /**
     *
     * @Title:             zRemove
     * @param:             @param key
     * @param:             @param start
     * @param:             @param end
     * @param:             @return
     * @return:            long
     * @throws
     * @Description:       删除有序集合
     */
    @Override
    public long zRemove(Object key,long start, long end){
        return redisTemplate.opsForZSet().removeRange(key, start, end);
    }

    @Override
    public Set<Object> keys(String pattern){
        return redisTemplate.keys("*" + pattern + "*");
    }
}
