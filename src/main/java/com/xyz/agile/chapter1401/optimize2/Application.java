package com.xyz.agile.chapter1401.optimize2;

/**
 * Created by windview on 11/30/14.
 */
public interface Application {

    void init();
    void idle();
    void cleanup();
    boolean done();
}
