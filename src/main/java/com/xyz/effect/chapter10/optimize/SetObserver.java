package com.xyz.effect.chapter10.optimize;

/**
 * Created with IntelliJ IDEA.
 * User: vuclip123
 * Date: 5/21/14
 * Time: 2:34 PM
 * To change this template use File | Settings | File Templates.
 */
public interface SetObserver<E> {

    // Invoke when an element is added to the observable add
    void added(ObservableSet<E> set, E element);
}
