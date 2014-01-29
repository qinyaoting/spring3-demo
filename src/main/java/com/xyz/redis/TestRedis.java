package com.xyz.redis;

import com.abin.lee.spring.redis.dao.UserDao;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.Date;

/**
 * Created with IntelliJ IDEA.
 * User: vuclip123
 * Date: 1/29/14
 * Time: 9:33 AM
 * To change this template use File | Settings | File Templates.
 */

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations={"classpath:pubsubAppContext1.xml"})
public class TestRedis {


    @Autowired
    private RedisDAO redisDAO;
    @Before
    public void before() throws Exception {
    }

    @Test
    public void testPublishMessage() throws Exception {
        String msg = "Hello, Redis!";
        redisDAO.sendMessage("java", msg); //发布字符串消息


        /*RedisTestBean bean = new RedisTestBean("123456");
        bean.setName("ZhenQin");
        bean.setOld((byte)23);
        bean.setSeliry((short)4000);
        bean.setManbers(new String[]{"234567", "3456789"});
        redisDAO.sendMessage("java", bean); //发布一个普通的javabean消息*/


        Integer[] values = new Integer[]{21341,123123,12323};
        redisDAO.sendMessage("java", values);  //发布一个数组消息
    }


}
