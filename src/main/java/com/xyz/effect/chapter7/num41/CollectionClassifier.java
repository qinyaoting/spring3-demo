package com.xyz.effect.chapter7.num41;

import java.math.BigInteger;
import java.util.*;

/**
 * Created with IntelliJ IDEA.
 * User: vuclip123
 * Date: 6/3/14
 * Time: 5:06 PM
 * To change this template use File | Settings | File Templates.
 */
public class CollectionClassifier {

    /*public static String classify(Set<?> s) {
        return "Set";
    }

    public static String classify(List<?> lst) {
        return "List";
    }

    public static String classify(Collection<?> c) {
        return "Unknown Collection";
    }*/

    public static void main(String[] args) {

        Collection<?>[] collections = {
                new HashSet<String>(),
                new ArrayList<BigInteger>(),
                new HashMap<String, String>().values()
        };

        for (Collection<?> c : collections) {
            System.out.print(classify(c));
        }


    }

    public static String classify(Collection<?> c) {
        return c instanceof Set?"Set":
                c instanceof List?"List":"unknown collection";
    }
}
