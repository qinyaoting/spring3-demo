package com.xyz.effect.chapter6.num32;

import java.util.EnumSet;
import java.util.Set;

/**
 * Created with IntelliJ IDEA.
 * User: qinyaoting
 * Date: 5/29/14
 * Time: 9:56 PM
 * To change this template use File | Settings | File Templates.
 */

// EnumSet a modern replacement for bit fields
public class Test2 {

    public enum Style{BOLD, ITALIC, UNDERLINE, STRIKETHROUGH}

    // Any Set could be passed in, but enumSet is clearly best
    public void applyStyles(Set<Style> styles){}

    public static final void main(String[] args) {
        Test2 test = new Test2();
        test.applyStyles(EnumSet.of(Style.BOLD, Style.ITALIC));

        // EnumSet用来创建集合
    }
}
