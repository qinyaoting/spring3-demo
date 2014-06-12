package com.xyz.effect.chapter2.num2;

/**
 * Created with IntelliJ IDEA.
 * User: vuclip123
 * Date: 5/13/14
 * Time: 2:48 PM
 * To change this template use File | Settings | File Templates.
 */
public class NutritionFacts {

    private final int servingSize;  //(ml)                  required
    private final int servings;     //(per container)       required
    private final int calories;     //                      optional
    private final int fat;          // (g)                  optional
    private final int sodium;       // (mg)                 optional
    private final int carbohydrate; // (g)            optional

    public static class Builder {
        // Required parameters

        private final int servingSize;
        private final int servings;

        // Optional parameters - initialized to default values
        private int calories = 0;
        private int fat = 0;
        private int carbohydrate = 0;
        private int sodium = 0;

        public Builder(int servingSize, int servings) {
            this.servingSize = servingSize;
            this.servings = servings;
        }

        public Builder calories(int val) {
            calories = val;
            return this;
        }

        public Builder carbohydrate(int val) {
            carbohydrate = val;
            return this;
        }

        public Builder sodium(int val) {
            sodium = val;
            return this;
        }

        public NutritionFacts build() {
            return new NutritionFacts(this);
        }
    }

    private NutritionFacts(Builder builder) {
        servings = builder.servings;
        servingSize = builder.servingSize;
        calories = builder.calories;
        fat = builder.fat;
        sodium = builder.sodium;
        carbohydrate = builder.carbohydrate;
    }

    // 构建器不足：十分注重性能的情况下，可能有问题
    // 如果类的构造器或静态工厂中有多个参数，设计这种类时，Builder模式是不错的选择

}
