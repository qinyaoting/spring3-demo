package com.baobaotao.junit.guava;

/**
 * Created with IntelliJ IDEA.
 * User: vuclip123
 * Date: 5/12/14
 * Time: 2:43 PM
 * To change this template use File | Settings | File Templates.
 */
public class TestEvent {



    private final int message;
    public TestEvent(int message) {
        this.message = message;
        System.out.println("event message:"+message);
    }
    public int getMessage() {
        return message;
    }
}
