package com.xyz.effect.chapter4.num21;

import java.io.Serializable;

/**
 * Created with IntelliJ IDEA.
 * User: qinyaoting
 * Date: 6/15/14
 * Time: 3:53 PM
 * To change this template use File | Settings | File Templates.
 */
public class Host {

    private static class StrLenCmp implements Comparator<String>, Serializable {

        @Override
        public int compare(String t1, String t2) {
            return t1.length() - t2.length();  //To change body of implemented methods use File | Settings | File Templates.
        }
    }

    public static final Comparator<String>
        STRING_LENGTH_COMPARATOR = new StrLenCmp();

    public static void main(String[] args) {

        Host.STRING_LENGTH_COMPARATOR.compare("","");
    }
}
