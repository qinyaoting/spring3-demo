package com.xyz.agile.chapter1401.optimize2;

/**
 * Created by windview on 11/30/14.
 */
public class ApplicationRunner {


    private Application itsApplication = null;

    public ApplicationRunner(Application itsApplication) {
        this.itsApplication = itsApplication;
    }
    public void run() {
        itsApplication.init();
        while (!itsApplication.done())
            itsApplication.idle();
        itsApplication.cleanup();
    }


}
