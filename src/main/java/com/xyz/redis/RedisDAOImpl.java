package com.xyz.redis;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;
import org.springframework.data.redis.core.RedisTemplate;

import java.io.Serializable;
import java.util.Date;

/**
 * Created with IntelliJ IDEA.
 * User: vuclip123
 * Date: 1/29/14
 * Time: 9:27 AM
 * To change this template use File | Settings | File Templates.
 */
public class RedisDAOImpl implements RedisDAO {

    private RedisTemplate<String, Object> redisTemplate = null;

    public RedisDAOImpl() {

    }

    //向redis中发消息
    public void sendMessage(String channel, Serializable message) {
        redisTemplate.convertAndSend(channel, message);
    }


    public RedisTemplate getRedisTemplate() {
        return redisTemplate;
    }

    public void setRedisTemplate(RedisTemplate redisTemplate) {
        this.redisTemplate = redisTemplate;
    }


    //启动spring
    public static void main(String[] args) {
        //ApplicationContext applicationContext = new FileSystemXmlApplicationContext("/home/vuclip123/workspace/idea_web/spring/src/main/java/test/com/xyz/redis/pubsubAppContext1.xml");
        new ClassPathXmlApplicationContext("pubsubAppContext1.xml");;
        while (true) { //这里是一个死循环,目的就是让进程不退出,用于接收发布的消息
            try {
                System.out.println("current time: " + new Date());

                Thread.sleep(3000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }


}
