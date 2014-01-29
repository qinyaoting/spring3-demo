package com.baobaotao.junit;

import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;
import static org.hamcrest.Matcher.*;

/**
 * Created with IntelliJ IDEA.
 * User: vuclip123
 * Date: 1/25/14
 * Time: 9:16 AM
 * To change this template use File | Settings | File Templates.
 */
public class Junit4ArrayTest {

    @Test
    public void testArrayAssert(){
        String users[] = new String[] {"tom","john","tony"};
        assertArrayEquals(new String[] {"tom","john","tony"},users);
    }
}
