package com.xyz.effect.chapter5.num26;

import java.util.Arrays;
import java.util.EmptyStackException;

/**
 * Created with IntelliJ IDEA.
 * User: vuclip123
 * Date: 5/14/14
 * Time: 4:15 PM
 * To change this template use File | Settings | File Templates.
 */
public class Stack {

    private Object[] elements;
    private int size = 0;

    private static final int DEFAULT_INITIAL_CAPACITY = 16;

    public Stack() {
        elements  = new Object[DEFAULT_INITIAL_CAPACITY];
    }

    public void push(Object e) {
        ensureCapacity();
        elements[size++] = e;
    }


    /*public Object pop() {
        if (size ==0)
            throw new EmptyStackException();
        return elements[--size];    //有内存泄漏情况
    }*/

    // 如果一个栈先增长，然后收缩，那么从栈中弹出的对象将不会被gc回收，即使程序不再引用这些对象，他们也不会被回收
    // 是因为栈内部维护着对这些东西的过期引用（永远不会被解除的引用）

    // 改良后的方法
    public Object pop() {
        if (size == 0)
            throw new EmptyStackException();
        Object result = elements[--size];
        elements[size] = null;
        return result;
    }

    // 何时应该清空引用那？
    // Stack类自己管理内存，只要是类自己管理内存，就应该警惕内存泄露的问题
    // 内存泄漏另一个常见的来源是缓存
    // 第三个来源是监听器和其他回调  确保回调立即被回收的方法是保存它们的弱引用
    // 内存泄漏检测工具 Heap Profiler

    private void ensureCapacity() {
        if (elements.length == size)
            elements = Arrays.copyOf(elements, 2 * size + 1);
    }


}
