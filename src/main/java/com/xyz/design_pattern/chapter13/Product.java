package com.xyz.design_pattern.chapter13;

import java.util.ArrayList;
import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * User: qinyaoting
 * Date: 6/4/14
 * Time: 9:27 PM
 * To change this template use File | Settings | File Templates.
 */
public class Product {

    List<String> parts = new ArrayList<String>();

    public void add(String part) {
        parts.add(part);
    }

    public void show() {
        for(String part: parts)
            System.out.println(part);
    }
}
