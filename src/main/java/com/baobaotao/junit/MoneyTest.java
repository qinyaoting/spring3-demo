package com.baobaotao.junit;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 * Created with IntelliJ IDEA.
 * User: vuclip123
 * Date: 1/25/14
 * Time: 7:43 AM
 * To change this template use File | Settings | File Templates.
 */
public class MoneyTest {

    private Money f12CHF;
    private Money f14CHF;
    private Money f28USD;

    @Before
    public void setUp() {
        f12CHF = new Money(12,"CHF");
        f14CHF = new Money(14,"CHF");
        f28USD = new Money(28,"USD");
    }

    //在需要测试的方法前添加 @Test标签 测试方法可以任意
    @Test
    public void moneyBag() {
        Money bag[] = {f14CHF,f28USD};
        MoneyBag expected = new MoneyBag(bag);
        //可以添加多个断言 ，断言是评测功能是否正确的依据
        assertEquals(expected, f12CHF.add(f28USD.add(f14CHF)));
    }

    @After
    public void tearDown(){

    }

    //@BeforeClass @AfterClass 和  @Before @After的区别
}
