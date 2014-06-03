package com.xyz.effect.chapter7.num41;

/**
 * Created with IntelliJ IDEA.
 * User: vuclip123
 * Date: 6/3/14
 * Time: 5:12 PM
 * To change this template use File | Settings | File Templates.
 */
public class Overriding {

    public static void main(String[] args) {
        Wine[] wines = {
                new Wine(),new SparklingWine(),new Champagne()
        };
        for (Wine wine : wines) {
            System.out.println(wine.name());
        }

        /**
         *  wine
            sparkling wine
            champagne
         */
    }
}


class Wine{
    String name() {return "wine";}
}

class SparklingWine extends Wine {
    @Override String name() {return "sparkling wine";}
}

class Champagne extends SparklingWine {
    @Override String name() {return "champagne";}
}
