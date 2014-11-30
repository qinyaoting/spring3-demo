package com.xyz.agile.chapter1401.optimize2;

import com.xyz.agile.chapter1401.optimize.DoubleBubbleSorter;
import org.framework.business.exception.SystemException;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 * Created by windview on 11/30/14.
 */
public class ftocStrategy implements Application {


    private InputStreamReader isr;
    private BufferedReader br;
    private boolean isDone = false;

    public static void main(String[] args) throws Exception {
        (new ApplicationRunner(new ftocStrategy())).run();
    }

    @Override
    public void init() {
        isr  = new InputStreamReader(System.in);
        br = new BufferedReader(isr);
    }

    @Override
    public void idle() {
        String fahrString = readLineAndReturnNullIfError();
        if (fahrString == null || fahrString.length()==0)
            isDone = true;
        else {
            double fahr = Double.parseDouble(fahrString);
            double celcius = 5.0/9.0*(fahr-32);
            System.out.println("F=" + fahrString + ", C="+celcius);
        }
    }

    @Override
    public void cleanup() {
        System.out.println("fcoc exit");
    }

    @Override
    public boolean done() {
        return isDone;
    }

    private String readLineAndReturnNullIfError() {
        String s;
        try {
            s = br.readLine();
        } catch (Exception e) {
            s = null;
        }
        return s;
    }
}
