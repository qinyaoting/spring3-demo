package com.xyz.effect.chapter3.num8;

/**
 * Created with IntelliJ IDEA.
 * User: vuclip123
 * Date: 6/12/14
 * Time: 4:00 PM
 * To change this template use File | Settings | File Templates.
 */
public class TestNonNullity {


    public boolean equals(Object obj) {

        /*if (obj ==null)
            return false;

         没有必要的做法
         */

        if (!(obj instanceof TestNonNullity)) //obj为空，直接返回false，所以不用上边的非空检查
            return false;
        TestNonNullity tnn = (TestNonNullity)obj;

        return true;
    }
}
