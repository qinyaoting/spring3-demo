package com.xyz.effect.chapter10.optimize.optimize2;

import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

/**
 * Created with IntelliJ IDEA.
 * User: vuclip123
 * Date: 5/21/14
 * Time: 1:37 PM
 * To change this template use File | Settings | File Templates.
 */
public class Test69 {

    // 69并发工具优先与wait和notify

    private static final ConcurrentMap<String, String> map = new ConcurrentHashMap<String,String>();

    public static String intern(String s){
        String previousValue = map.putIfAbsent(s,s);
        return previousValue == null?s : previousValue;
    }



}
