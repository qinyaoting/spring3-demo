package com.xyz.effect.chapter3.num9;

import java.util.HashMap;
import java.util.Map;

/**
 * Created with IntelliJ IDEA.
 * User: qinyaoting
 * Date: 6/12/14
 * Time: 9:10 PM
 * To change this template use File | Settings | File Templates.
 */
public class Test {

    // 覆盖equals时总要覆盖hashCode


    public static final void main(String[] args) {


        Map<PhoneNumber, String> m
                = new HashMap<PhoneNumber, String>();
        m.put(new PhoneNumber(707,867,5309), "Jenny");

        //PhoneNumber 中没有提供hashCode方法，下边返回null
        System.out.println(m.get(new PhoneNumber(707,867,5309)));
    }


}
