package com.xyz.effect.chapter1.optimize;


/**
 * Created with IntelliJ IDEA.
 * User: vuclip123
 * Date: 5/13/14
 * Time: 2:56 PM
 * To change this template use File | Settings | File Templates.
 */
public class Test {

    public static final void main(String[] args) {
        NutritionFacts nf = new NutritionFacts.Builder(240,80).calories(100).sodium(35).carbohydrate(27).build();
    }
}
