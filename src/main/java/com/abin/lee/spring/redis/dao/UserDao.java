package com.abin.lee.spring.redis.dao;
import com.abin.lee.spring.redis.pojo.User;
public interface UserDao {
    /**
     * @param uid
     * @param address
     */
    void save(User user);
    /**
     * @param uid
     * @return
     */
    User read(String uid);
    /**
     * @param uid
     */
    void delete(String uid);
}