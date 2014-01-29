package com.xyz.redis;

import java.io.Serializable;

/**
 * Created with IntelliJ IDEA.
 * User: vuclip123
 * Date: 1/29/14
 * Time: 2:08 PM
 * To change this template use File | Settings | File Templates.
 */
public interface RedisDAO {

    void sendMessage(String channel, Serializable message) ;
}
