package com.xyz.effect.chapter4;

import java.util.Collection;
import java.util.HashSet;

/**
 * Created with IntelliJ IDEA.
 * User: vuclip123
 * Date: 5/19/14
 * Time: 3:24 PM
 * To change this template use File | Settings | File Templates.
 */
public class InstrumentedhashSet<E> extends HashSet<E> {

    private int addCount = 0;

    public InstrumentedhashSet(){}

    public InstrumentedhashSet(int initCap, float loadFactor) {
        super(initCap, loadFactor);
    }

    public boolean add(E e) {
        addCount++;
        return super.add(e);
    }

    public boolean addAll(Collection<? extends E> c) {
        addCount += c.size();
        return super.addAll(c);
    }

    public int getAddCount() {
        return addCount;
    }
}
