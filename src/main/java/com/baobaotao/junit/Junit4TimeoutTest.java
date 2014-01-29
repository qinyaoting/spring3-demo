package com.baobaotao.junit;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 * Created with IntelliJ IDEA.
 * User: vuclip123
 * Date: 1/25/14
 * Time: 8:50 AM
 * To change this template use File | Settings | File Templates.
 */
public class Junit4TimeoutTest {

    private User user;
    @Before
    public void init()
    {
        user = null;
    }

    // 比如设定时间3秒，如果进行耗时网络操作，超过3就错，3秒内正确
    //指定的时间内就算正确
    @Test(timeout = 10)
    public void testUser(){
        assertNotNull(user);
        assertEquals("tom",user.getName());
    }

}
