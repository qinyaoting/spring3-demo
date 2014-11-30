package com.xyz.agile.chapter1401.optimize;

/**
 * Created by windview on 11/30/14.
 */
public abstract class BubbleSorter {

    private int operations = 0;
    protected int length = 0;

    protected int doSort() {
        operations = 0;
        if (length <= 1)
            return operations;
        for (int nextToLast = length - 2; nextToLast >= 0; nextToLast--)
            for (int index = 0; index <= nextToLast; index++)
            {
                if (outOfOrder(index))
                    swap(index);
                operations++;
            }
        return operations;
    }


    // 模板方法，定义在子类要执行的方法
    protected abstract void swap(int index);


    protected abstract boolean outOfOrder(int index);

}
