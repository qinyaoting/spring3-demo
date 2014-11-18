package com.xyz.agile.chapter27;

/**
 * Created by vuclip123 on 11/18/14.
 */
public class Item {

    private Product itsProduct;
    private int itsQuantity;

    public Item(Product p, int qty) {
        this.itsProduct = p;
        this.itsQuantity = qty;
    }

    public Product getProduct() {
        return itsProduct;
    }

    public int getQuantity() {
        return itsQuantity;
    }
}
