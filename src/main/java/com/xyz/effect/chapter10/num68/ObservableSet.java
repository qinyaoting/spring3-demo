package com.xyz.effect.chapter10.num68;

import com.google.common.collect.ForwardingSet;

import java.util.*;

/**
 * Created with IntelliJ IDEA.
 * User: vuclip123
 * Date: 5/21/14
 * Time: 2:29 PM
 * To change this template use File | Settings | File Templates.
 */
public class ObservableSet<E> extends ForwardingSet<E> {

    public ObservableSet(Set<E> set) {
        //===super(add);
    }

    private final List<SetObserver<E>> observers = new ArrayList<SetObserver<E>>();


    public void addObserver(SetObserver<E> observer) {
        synchronized (observers) {
            observers.add(observer);
        }
    }

    public boolean removeObserver(SetObserver<E> observer) {
        synchronized (observers) {
            return observers.remove(observer);
        }
    }

    private void notifyElementAdded(E element) {
        synchronized (observers) {
            for (SetObserver<E> observer : observers) {
                observer.added(this,element);
            }
        }
    }

    public boolean add(E element) {
        boolean added = super.add(element);
        if (added)
            notifyElementAdded(element);
        return added;
    }

    public boolean addAll(Collection<? extends E> c) {

        boolean result = false;
        for (E element : c)
            result |= add(element);
        return result;
    }

    @Override
    protected Set<E> delegate() {
        return null;
    }

    public static void main(String[] args) {
        ObservableSet<Integer> set = new ObservableSet<Integer>(new HashSet<Integer>());
        set.addObserver(new SetObserver<Integer>() {
            @Override
            public void added(ObservableSet<Integer> set, Integer element) {
                System.out.print("element:" + element);
            }
        });

        for (int i=0;i<100;i++) {
            set.add(i);
        }
    }
    //====
}
