package com.xyz.agile.chapter27;

import junit.framework.TestCase;
import junit.textui.TestRunner;

/**
 * Created by vuclip123 on 11/18/14.
 */
public class DBTest extends TestCase {

    public static void main(String[] args) {
        TestRunner.main(new String[]{"DBTest"});
    }

    public DBTest(String name) {
        super(name);
    }

    @Override
    public void setUp() throws Exception {
        DB.init();
    }

    @Override
    public void tearDown() throws Exception {
        DB.close();
    }

    public void testStoreProduct() throws Exception {
        ProductData storeProduct = new ProductData();
        storeProduct.name = "MyProduct";
        storeProduct.price = 1234;
        storeProduct.sku = "999";
        DB.store(storeProduct);

        ProductData retrievedProduct = DB.getProductData("999");
        DB.deleteProductData("999");
        assertEquals(storeProduct,retrievedProduct);
    }
}
