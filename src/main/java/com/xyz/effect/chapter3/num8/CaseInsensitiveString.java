package com.xyz.effect.chapter3.num8;

/**
 * Created with IntelliJ IDEA.
 * User: vuclip123
 * Date: 6/12/14
 * Time: 12:11 PM
 * To change this template use File | Settings | File Templates.
 */
public class CaseInsensitiveString {


    private final String s;

    public CaseInsensitiveString(String s) {
        if (s == null)
            throw new NullPointerException();
        this.s = s;
    }

    @Override
    public boolean equals(Object obj) {


        //违反了对称性
        /*if (obj instanceof  CaseInsensitiveString) {
            CaseInsensitiveString tmp = (CaseInsensitiveString)obj;
            return s.equalsIgnoreCase(tmp.s);

        }
        if (obj instanceof String) {
            return s.equalsIgnoreCase((String)obj);
        }

        return false; */

        // 改正后的方法
        return obj instanceof  CaseInsensitiveString &&
                (((CaseInsensitiveString)obj).s.equalsIgnoreCase(s));
    }
}
