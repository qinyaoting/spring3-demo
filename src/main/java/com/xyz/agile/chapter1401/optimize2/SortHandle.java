package com.xyz.agile.chapter1401.optimize2;

/**
 * Created by windview on 11/30/14.
 */
public interface SortHandle {

    void swap(int index);
    boolean outOfOrder(int index);
    int length();
    void setArray(Object array);
}
