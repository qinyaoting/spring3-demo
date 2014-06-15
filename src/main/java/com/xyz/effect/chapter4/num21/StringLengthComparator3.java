package com.xyz.effect.chapter4.num21;

/**
 * Created with IntelliJ IDEA.
 * User: qinyaoting
 * Date: 6/15/14
 * Time: 3:44 PM
 * To change this template use File | Settings | File Templates.
 */
public class StringLengthComparator3  implements Comparator{

    private StringLengthComparator3() {
    }

    public static final StringLengthComparator3 INSTANCE =
            new StringLengthComparator3();







    @Override
    public int compare(Object t1, Object t2) {
        return 0;  //To change body of implemented methods use File | Settings | File Templates.
    }

    public static void main(String[] args) {
        StringLengthComparator3.INSTANCE.compare("abc","xyz123");
    }
}
