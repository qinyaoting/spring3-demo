package com.baobaotao.junit;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 * Created with IntelliJ IDEA.
 * User: vuclip123
 * Date: 1/25/14
 * Time: 8:45 AM
 * To change this template use File | Settings | File Templates.
 */
public class Junit4ExceptionTest {

    private User user;
    @Before
    public void init()
    {
        user = null;
    }
    // 测试类如果没有抛出异常，或抛出一个不同的异常，本测试方法就失败了
    // 预期抛出空指针
    @Test(expected = NullPointerException.class)
    public void setUser() {
        //判断user.getName()是否 非空
        assertNotNull(user.getName());
    }
}
