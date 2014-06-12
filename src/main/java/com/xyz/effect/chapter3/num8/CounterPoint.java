package com.xyz.effect.chapter3.num8;

import java.util.concurrent.atomic.AtomicInteger;

/**
 * Created with IntelliJ IDEA.
 * User: vuclip123
 * Date: 6/12/14
 * Time: 3:36 PM
 * To change this template use File | Settings | File Templates.
 */
public class CounterPoint extends Point {


    private static final AtomicInteger counter = new AtomicInteger();

    public CounterPoint(int x, int y) {
        super(x, y);

        counter.incrementAndGet();
    }

    public int numberCreated() {
        return counter.get();
    }
}
