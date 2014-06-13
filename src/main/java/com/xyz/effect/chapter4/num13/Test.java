package com.xyz.effect.chapter4.num13;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * User: vuclip123
 * Date: 6/13/14
 * Time: 10:01 AM
 * To change this template use File | Settings | File Templates.
 */
public class Test {

    // 13使类和成员的可访问性最小

    // potential security hole!
    // public static final Thing[] VALUES = {};

    /*private static final Thing[] PRIVATE_VALUES = {};
    public static final List<Thing> VALUES =
            Collections.unmodifiableList(Arrays.asList(PRIVATE_VALUES));*/

    private static final Thing[] PRIVATE_VALUES = {};
    public static final Thing[] values() {
        return PRIVATE_VALUES.clone();
    }
}
