package com.xyz.effect.chapter5.num27;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

/**
 * Created with IntelliJ IDEA.
 * User: vuclip123
 * Date: 6/16/14
 * Time: 10:50 AM
 * To change this template use File | Settings | File Templates.
 */
public class Test {

    // 优先考虑泛型方法



    //Uses raw types - unacceptable
    public static Set union(Set s1, Set s2) {
        Set result = new HashSet(s1);
        result.addAll(s2);
        return result;
    }

    //Generic method
    public static <E> Set<E> union2(Set<E> s1, Set<E> s2) {
        Set<E> result = new HashSet<E>(s1);
        result.addAll(s2);
        return result;
    }


    public static void main(String[] args) {

        Set<String> guys = new HashSet<String>(
                Arrays.asList("Tom","Dick", "Harry"));
        Set<String> stooges = new HashSet<String>(
                Arrays.asList("Larry","Moe", "Curly"));

        Set<String> aflCio = union2(guys, stooges);
        System.out.println(aflCio);
    }

}
