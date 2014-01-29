package com.baobaotao.junit;

import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static org.junit.Assert.*;
import static org.hamcrest.Matchers.*;

/**
 * Created with IntelliJ IDEA.
 * User: vuclip123
 * Date: 1/25/14
 * Time: 9:21 AM
 * To change this template use File | Settings | File Templates.
 */
public class Junit4AssertThatTest {

    private User tom;
    private User john;

    @Before
    public void init() {
        tom = new User("tom","1234");
        tom.setCredits(100);
        john = new User("john","1234");
        john.setCredits(50);
    }

    @Test
    public void testAssertThat() {
        //测试变量的值是否大于指定的值
        assertThat(tom.getCredits(),greaterThan(50));

        //测试变量的值是否小于指定的值
        assertThat(tom.getCredits(),lessThan(150));

        assertThat(tom.getCredits(),greaterThanOrEqualTo(100));
        assertThat(tom.getCredits(),lessThanOrEqualTo(100));

        //assertThat(tom.getCredits(),allOf(greaterThan(50),lessThan(150)));

        //assertThat(tom.getCredits(),anyOf(greaterThan(50),lessThan(200)));

        assertThat(tom.getCredits(),anything());

        assertThat(tom.getCredits(),is(100));

        assertThat(tom.getCredits(),not(50));


        String url = "http://www.baobaotao.com";
        // 变量是否包含给定的字符串
        assertThat(url,containsString("baobaotao.com"));
        // 变量开头是否是http://
        assertThat(url,startsWith("http://"));
        assertThat(url,endsWith(".com"));
        assertThat(url,equalTo("http://www.baobaotao.com"));
        assertThat(url,equalToIgnoringCase("http://www.BAOBAOTAO.com"));
        // 忽略头尾空格情况下是否相等
        assertThat(url,equalToIgnoringWhiteSpace("http://www.baobaotao.com "));

        List<User> users = new ArrayList<User>();
        users.add(tom);
        users.add(john);
        assertThat(users, hasItem(tom));
        assertThat(users,hasItem(john));

        Map<String,User> userMap = new HashMap<String, User>();
        userMap.put(tom.getName(),tom);
        userMap.put(john.getName(),john);

        assertThat(userMap,hasEntry(tom.getName(),tom));
        assertThat(userMap,hasKey(john.getName()));
        assertThat(userMap,hasValue(john));

        //===
    }

}
