package com.xyz.effect.chapter4.num21;

/**
 * Created with IntelliJ IDEA.
 * User: qinyaoting
 * Date: 6/15/14
 * Time: 3:44 PM
 * To change this template use File | Settings | File Templates.
 */
public class StringLengthComparator2 {

    private StringLengthComparator2() {
    }

    public static final StringLengthComparator2 INSTANCE =
            new StringLengthComparator2();



    public int compare(String s1, String s2) {
        return s1.length() - s2.length();
    }

    // 无状态的，没有域，所以作为一个Singleton是非常合适的，可以节省不要的对象创建开销


    public static void main(String[] args) {
        StringLengthComparator2.INSTANCE.compare("abc","xyz123");
    }
}
