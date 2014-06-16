package com.xyz.effect.chapter5.num26.improve;

/**
 * Created with IntelliJ IDEA.
 * User: vuclip123
 * Date: 6/16/14
 * Time: 10:42 AM
 * To change this template use File | Settings | File Templates.
 */
public class Test {

    public static void main(String [] args) {

        Stack<String> stack = new Stack ();
        String[] strs = {"tom", "jack", "kkk", "Lucy"};
        for (String str: strs) {
            stack.push(str);
        }

        while (!stack.isEmpty()) {
            System.out.println(stack.pop().toUpperCase());
        }
    }
}
