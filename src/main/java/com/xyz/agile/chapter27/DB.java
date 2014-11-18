package com.xyz.agile.chapter27;

import java.sql.*;

/**
 * Created by vuclip123 on 11/18/14.
 */
public class DB {

    private static Connection con;

    public static void init() throws Exception {
        Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
        con = DriverManager.getConnection("jdbc:odbc:PPP Shopping Chart");
    }

    public static void close() throws Exception {
        con.close();
    }

    public static void store(ProductData pd) throws Exception {
        PreparedStatement s = buildProductInsertionStatement(pd);
        executeStatements(s);
    }

    private static PreparedStatement buildProductInsertionStatement(ProductData pd) throws Exception {
        PreparedStatement s = con.prepareStatement(
                "INSERT into Products Values(?,?,?)"
        );
        s.setString(1, pd.sku);
        s.setString(2, pd.name);
        s.setInt(3, pd.price);
        return s;
    }

    private static void executeStatements(PreparedStatement s) throws SQLException {
        s.execute();
        s.close();
    }

    public static ProductData getProductData(String sku) throws Exception {
        PreparedStatement s = buildProductQueryStatement(sku);
        ResultSet rs = executeQueryStatement(s);
        ProductData pd = extraProductDataFromResultSet(rs);
        rs.close();
        s.close();
        return pd;
    }

    private static PreparedStatement buildProductQueryStatement(String sku) throws Exception {
        PreparedStatement s = con.prepareStatement(
                "SELECT * FROM Products WHERE sku = ?;"
        );
        s.setString(1, sku);
        return s;
    }

    private static ResultSet executeQueryStatement (PreparedStatement p) throws SQLException {
        ResultSet rs = p.executeQuery();
        rs.next();
        return rs;
    }

    private static ProductData extraProductDataFromResultSet(ResultSet rs) throws SQLException {
        ProductData pd = new ProductData();
        pd.sku = rs.getString(1);
        pd.name = rs.getString(2);
        pd.price = rs.getInt(3);
        return pd;
    }

    public static void deleteProductData(String sku) throws Exception {
        executeStatements(buildProductDeleteStatement(sku));
    }

    private static PreparedStatement buildProductDeleteStatement(String sku) throws Exception {
        PreparedStatement s = con.prepareStatement(
                "DELETE FROM Products WHERE sku = ?;"
        );
        s.setString(1, sku);
        return s;
    }


}
