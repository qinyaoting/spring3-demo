package com.xyz.agile.chapter27;

/**
 * Created by vuclip123 on 11/18/14.
 */
public class ProductData {

    public String name;
    public int price;
    public String sku;

    public ProductData() {
    }

    public ProductData(String name, int price, String sku) {
        this.name = name;
        this.price = price;
        this.sku = sku;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        ProductData that = (ProductData) o;

        if (price != that.price) return false;
        if (name != null ? !name.equals(that.name) : that.name != null) return false;
        if (sku != null ? !sku.equals(that.sku) : that.sku != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = name != null ? name.hashCode() : 0;
        result = 31 * result + price;
        result = 31 * result + (sku != null ? sku.hashCode() : 0);
        return result;
    }
}
