package com.xyz.effect.chapter10.num67;

import com.google.common.collect.ForwardingSet;

import java.util.*;

/**
 * Created with IntelliJ IDEA.
 * User: qinyaoting
 * Date: 6/10/14
 * Time: 9:32 PM
 * To change this template use File | Settings | File Templates.
 */
public class ObservableSet<E> extends ForwardingSet<E> {
    @Override
    protected Set delegate() {
        return null;  //To change body of implemented methods use File | Settings | File Templates.
    }

    public ObservableSet(Set<E> set) {
        //super(set);
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

    private void notifElementAdded(E element) {

        synchronized (observers) {
            for (SetObserver<E> observer : observers) {
                observer.add(this, element);
            }
        }
    }

    public boolean add(E element) {
        boolean added = super.add(element);
        if(added)
            notifElementAdded(element);
        return added;
    }

    public boolean addAll(Collection<? extends E> c) {
        boolean result = false;
        for(E element : c) {
            result |= add(element);
        }
        return result;
    }

    public static final void main(String[] args) {

        ObservableSet<Integer> set = new ObservableSet<Integer>(new HashSet<Integer>());

        set.addObserver(new SetObserver<Integer>() {
            @Override
            public void add(ObservableSet<Integer> set, Integer element) {
                System.out.println(element);
            }
        });

        for(int i=0;i<100;i++) {
            set.add(i);
        }
    }
}
