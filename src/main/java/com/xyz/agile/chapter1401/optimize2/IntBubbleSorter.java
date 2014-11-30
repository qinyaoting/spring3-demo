package com.xyz.agile.chapter1401.optimize2;

/**
 * Created by windview on 11/30/14.
 */
public class IntBubbleSorter implements SortHandle {

    private int[] array = null;

    @Override
    public void swap(int index) {
        int temp = array[index];
        array[index] = array[index+1];
        array[index+1] = temp;
    }

    @Override
    public void setArray(Object array) {
        this.array = (int[]) array;
    }

    @Override
    public boolean outOfOrder(int index) {
        return (array[index] > array[index+1]);
    }

    @Override
    public int length() {
        return array.length;
    }

    // InSortHandle类对BubbleSorter一无所知，他不依赖于冒泡排序的任何实现方式，这和template模式是不同的
    // 由于swap和outOfOrder方法的实现直接依赖于冒泡排序算法，所以template方法部分违反了dip，而
    // strategy方法中不包含这样的依赖


}
