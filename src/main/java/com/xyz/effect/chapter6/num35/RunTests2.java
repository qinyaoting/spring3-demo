package com.xyz.effect.chapter6.num35;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/**
 * Created with IntelliJ IDEA.
 * User: vuclip123
 * Date: 5/30/14
 * Time: 2:41 PM
 * To change this template use File | Settings | File Templates.
 */
public class RunTests2 {

    public static final void main(String[] args) throws Exception {

        int tests = 0;
        int passed = 0;
        Class testClass = Sample.class;
        for (Method m : testClass.getDeclaredMethods()) {
            if (m.isAnnotationPresent(Test.class)) {
                tests++;
                try {
                    m.invoke(null);
                    passed++;
                } catch (InvocationTargetException wrappedExc) {
                    Throwable exc = wrappedExc.getCause();
                    System.out.println(m + " failed:"  + exc);
                } catch (Exception exc) {
                    System.out.println("INVALID @test:"  + m);
                }
            }
        }
        System.out.printf("Passed: %d, Failed: %d%n",
                passed, tests - passed);
    }
}
