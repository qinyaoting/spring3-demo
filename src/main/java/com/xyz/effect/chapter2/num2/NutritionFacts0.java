package com.xyz.effect.chapter2.num2;

/**
 * Created with IntelliJ IDEA.
 * User: vuclip123
 * Date: 5/13/14
 * Time: 2:37 PM
 * To change this template use File | Settings | File Templates.
 */
public class NutritionFacts0 {



    // 遇到多个构造器参数时，考虑用构建器

    private final int servingSize;  //(ml)                  required
    private final int servings;     //(per container)       required
    private final int calories;     //                      optional
    private final int fat;          // (g)                  optional
    private final int sodium;       // (mg)                 optional
    private final int carbohydrate; // (g)            optional

    public NutritionFacts0(int servingSize, int servings) {
        this(servingSize, servings, 0);
    }

    public NutritionFacts0(int servingSize, int servings, int calories) {
        this(servingSize, servings, calories, 0);
    }

    public NutritionFacts0(int servingSize, int servings, int calories, int fat) {
        this(servingSize, servings, calories, fat, 0);
    }

    public NutritionFacts0(int servingSize, int servings, int calories, int fat, int sodium) {
        this(servingSize, servings, calories, fat, sodium, 0);
    }


    public NutritionFacts0(int servingSize, int servings, int calories, int fat, int sodium, int carbohydrate) {
        this.servingSize = servingSize;
        this.servings = servings;
        this.calories = calories;
        this.fat = fat;
        this.sodium = sodium;
        this.carbohydrate = carbohydrate;
    }

    // 重叠构造器模式，缺点：
    //==================================

    //==================================
    // JavaBean

}
