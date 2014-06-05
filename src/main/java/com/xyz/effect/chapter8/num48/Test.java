package com.xyz.effect.chapter8.num48;

import java.math.BigDecimal;

/**
 * Created with IntelliJ IDEA.
 * User: vuclip123
 * Date: 6/4/14
 * Time: 2:10 PM
 * To change this template use File | Settings | File Templates.
 */
public class Test {

    //如果需要精确的答案，请避免使用float和double


    //float和double类型尤其不适合用于货币计算

    // 假设你口袋里有$1，货架上有一排糖果，标价是 10美分 20美分 30美分...一直到$1
    // 从10美分开始，每种买一颗，直到不能支付为止


    public static final void main(String[] args) {

        /*double founds = 1.00;
        int itemBought = 0;
        for (double price = .10;founds >= price;price += .10) {

            founds -= price;
            itemBought++;
        }

        System.out.println(itemBought + " items bought.");
        System.out.println("Change:$" + founds);*/

        /**
         *
         3 items bought.
         Change:$0.3999999999999999

         使用BigDecimal int long进行货币计算
         */

        /*final BigDecimal TEN_CENTS = new BigDecimal(".10");
        int itemBought = 0;
        BigDecimal founds = new BigDecimal("1.00");
        for (BigDecimal price = TEN_CENTS;
                founds.compareTo(price) >= 0;
                price = price.add(TEN_CENTS)) {
            itemBought++;
            founds  = founds.subtract(price);
        }

        System.out.println(itemBought + " items bought.");
        System.out.println("Change:$" + founds);*/

        /**
         4 items bought.
         Change:$0.00
         BigDecimal 缺点：与基本运算类型相比，不方便，慢
         */

        int itemBought = 0;
        int founds = 100;
        for(int price = 10;founds >= price;price +=10) {
            itemBought++;
            founds -= price;
        }
        System.out.println(itemBought + " items bought.");
        System.out.println("Change:$" + founds);

        /**
         4 items bought.
         Change:$0
         */


    }
}
