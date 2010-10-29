/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package DBLayer;

import ModelLayer.*;
import java.sql.*;

/**
 *
 * @author Glerup
 */
public class DBProduct implements IFDBProduct {

    private Connection con;

    public DBProduct() {
        con = DbConnection1.getInstance().getDBcon();
    }

    public Product findProduct(int barcode, boolean retrieveAssociation) {
        Product proObj = new Product();
        proObj = singleWhere("barcode = '" + barcode + "'", false);
        return proObj;
    }

    private Product singleWhere(String wClause, boolean retrieveAssociation) {
        ResultSet results;
        Product proObj = new Product();
        String query = buildQuery(wClause);
        System.out.println("DBProduct -singelWhere " + query);
        try { // read from product
            Statement stmt = con.createStatement();
            stmt.setQueryTimeout(5);
            results = stmt.executeQuery(query);
            int snr = 0;
            if (results.next()) {
                proObj = buildProduct(results);
                //missing the test on retriveassociation

            }//end if
            stmt.close();
        }//slut try
        catch (Exception e) {
            System.out.println("Query exception - select product : " + e);
            e.printStackTrace();
        }
        return proObj;


    }

    private Product buildProduct(ResultSet results) {
        Product proObj = new Product();

        try {
            proObj.setProductName(results.getString(1));
            proObj.setPurchasePrice(results.getDouble(2));
            proObj.setSalesPrice(results.getDouble(3));
            proObj.setRentPrice(results.getDouble(4));
            proObj.setCountryOfOrigin(results.getString(5));
            proObj.setMinStock(results.getInt(6));
            proObj.setQuantity(results.getInt(7));

        } catch (Exception e) {
            System.out.println("building product object");
        }

        return proObj;

    }
    //method to build the query

    private String buildQuery(String wClause) {
        String query = "SELECT * FROM product";

        if (wClause.length() > 0) {
            query = query + " WHERE " + wClause;
        }

        return query;
    }

    public int checkQuantity(int productID) {
        String query = "SELECT quantity FROM product WHERE ID=" + productID;
        int quantityProduct = 0;
        ResultSet results;
        try { // insert new employee
            Statement stmt = con.createStatement();
            stmt.setQueryTimeout(5);
            results = stmt.executeQuery(query);

            if (results.next()) {
                quantityProduct = results.getInt(1);
            }//end if
            stmt.close();
        }//end try
        catch (Exception ex) {
            System.out.println("Select exception in SalesLineItem sli: " + ex);
        }
        return quantityProduct;
    }
}
