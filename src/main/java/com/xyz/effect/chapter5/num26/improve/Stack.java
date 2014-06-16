package com.xyz.effect.chapter5.num26.improve;

import java.util.Arrays;
import java.util.EmptyStackException;

/**
 * Created with IntelliJ IDEA.
 * User: vuclip123
 * Date: 5/14/14
 * Time: 4:15 PM
 * To change this template use File | Settings | File Templates.
 */
@SuppressWarnings("unchecked")
public class Stack<E> {

    private E[] elements;
    private int size = 0;

    private static final int DEFAULT_INITIAL_CAPACITY = 16;

    public Stack() {
        elements  = (E[])new Object[DEFAULT_INITIAL_CAPACITY];
    }

    public void push(E e) {
        ensureCapacity();
        elements[size++] = e;
    }

    public E pop() {
        if (size == 0)
            throw new EmptyStackException();
        E result = elements[--size];
        elements[size] = null;
        return result;
    }

    private void ensureCapacity() {
        if (elements.length == size)
            elements = Arrays.copyOf(elements, 2 * size + 1);
    }

    public boolean isEmpty() {
        return size ==0;
    }


}
