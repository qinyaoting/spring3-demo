package com.xyz.effect.chapter10.num67;

/**
 * Created with IntelliJ IDEA.
 * User: qinyaoting
 * Date: 6/10/14
 * Time: 9:35 PM
 * To change this template use File | Settings | File Templates.
 */
public interface SetObserver<E> {

    void add(ObservableSet<E> set, E element);
}
