package com.xyz.effect.chapter6.num43;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * User: vuclip123
 * Date: 6/4/14
 * Time: 1:30 PM
 * To change this template use File | Settings | File Templates.
 */
public class Test {

    //返回0长度的数组或者集合，而不是null

    private final List<Cheese> cheeseInStock = new ArrayList<Cheese>();

    public Cheese[] getCheeses() {
        if (cheeseInStock.size() == 0)
            return null;
        return null;
    }


    public static final void main(String[] args) {

        Test test = new Test();
        Cheese[] cheeses = test.getCheeses();
        if (cheeses != null && Arrays.asList(cheeses).contains(Cheese.STILTON))
            System.out.print("111");

        //客户端必须判断是否为空，容易出错
    }


    private static final Cheese[] EMPTY_CHEESE_ARRAY = new Cheese[0];

    public Cheese[] getCheeses2() {
        return cheeseInStock.toArray(EMPTY_CHEESE_ARRAY);
    }



    public List<Cheese> getCheeseList() {
        if (cheeseInStock.isEmpty())
            return Collections.emptyList();
        else
            return new ArrayList<Cheese>(cheeseInStock);
    }
}
