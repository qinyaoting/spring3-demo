package com.xyz.agile.chapter27;

/**
 * Created by vuclip123 on 11/18/14.
 */
public class Product {

    private int itsPrice;
    public Product(String name, int price) {
        itsPrice = price;
    }

    public int getPrice(){
        return itsPrice;
    }
}
