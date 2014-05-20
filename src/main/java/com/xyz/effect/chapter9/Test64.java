package com.xyz.effect.chapter9;

import java.util.EmptyStackException;

/**
 * Created with IntelliJ IDEA.
 * User: vuclip123
 * Date: 5/20/14
 * Time: 4:16 PM1
 * To change this template use File | Settings | File Templates.
 */
public class Test64 {

    // 努力是失败保持原子性

    private int size;
    private String[] elements;


    public Object pop() {
        if (size == 0)
            throw new EmptyStackException();
        Object result = elements[--size];
        elements[size] = null;
        return result;
    }

    // 如果取消对初始大小的检查，当这个方法企图从一个空栈弹出元素时
    // 它仍然会抛出异常，然而，这将导致size保持不一致的状态（负数）之中
    // 从而导致将来对该对象的任何方法调用都会失败

}
