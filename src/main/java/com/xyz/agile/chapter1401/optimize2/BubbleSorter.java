package com.xyz.agile.chapter1401.optimize2;

/**
 * Created by windview on 11/30/14.
 */
public class BubbleSorter {

    private int operations = 0;
    private int length = 0;
    private SortHandle itsSortHandle = null;

    public BubbleSorter(SortHandle itsSortHandle) {
        this.itsSortHandle = itsSortHandle;
    }

    public int sort(Object array) {
        itsSortHandle.setArray(array);
        length = itsSortHandle.length();
        operations = 0;
        if (length<=1)
            return operations;
        for (int nextToLast = length-2;nextToLast>=0;nextToLast--){
            for (int index = 0;index<=nextToLast;index++) {
                if (itsSortHandle.outOfOrder(index))
                    itsSortHandle.swap(index);
                operations++;
            }
        }
        return operations;
    }
}
