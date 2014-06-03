package com.xyz.effect.chapter7.num39;

import java.util.Date;

/**
 * Created with IntelliJ IDEA.
 * User: vuclip123
 * Date: 6/3/14
 * Time: 4:28 PM
 * To change this template use File | Settings | File Templates.
 */
public class Period {

    private final Date start;
    private final Date end;

    /*public Period(Date start, Date end) {

        if (start.compareTo(end) > 0)
            throw new IllegalArgumentException(start + " after " + end);
        this.start = start;
        this.end = end;
    }*/

    /*public Date getStart() {
        return start;
    }

    public Date getEnd() {
        return end;
    }*/


    public static final void main(String[] args) {

        Date start = new Date();
        Date end = new Date();

        Period p = new Period(start, end);

        end.setYear(78);//Modifies internals of p!
    }

    public Period(Date start, Date end) {

        //保护性拷贝
        this.start = new Date(start.getTime());
        this.end = new Date(end.getTime());

        if (this.start.compareTo(this.end) > 0)
            throw new IllegalArgumentException(start + " after " + end);

    }

    public Date getStart() {
        return new Date(start.getTime());
    }

    public Date getEnd() {
        return new Date(end.getTime());
    }
}
