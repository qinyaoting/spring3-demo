package com.xyz.agile.chapter1401.optimize2;

/**
 * Created by windview on 11/30/14.
 */
public class QuickBubbleSorter {

    private int operations = 0;
    private int length = 0;
    private SortHandle itsSortHandle = null;

    public QuickBubbleSorter(SortHandle itsSortHandle) {
        this.itsSortHandle = itsSortHandle;
    }

    public int sort(Object array) {
        itsSortHandle.setArray(array);
        length = itsSortHandle.length();
        operations = 0;
        if (length<=1)
            return operations;
        boolean thisPassInOrder = false;
        for (int nextToLast = length-2;nextToLast>=0 &&
                !thisPassInOrder;nextToLast--) {
            thisPassInOrder = true;
            for (int index = 0;index<=nextToLast;index++) {
                if (itsSortHandle.outOfOrder(index)) {
                    itsSortHandle.swap(index);
                    thisPassInOrder = false;
                }
                operations++;
            }
        }
        return operations;
    }

    //Template和strategy模式都可以用来分离高层的算法和底层的具体实现细节。都允许高层的算法独立于他具体实现细节重用
    //此外，strategy也允许具体实现细节独立于高层的算法重用，不过要一些额外的复杂性、内存以及运行时间开销
}
