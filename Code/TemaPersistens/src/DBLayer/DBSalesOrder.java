/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package DBLayer;

import ModelLayer.SalesOrder;
//import java.beans.Statement;
//import java.beans.Statement;
import java.sql.*;
import java.util.ArrayList;

/**
 *
 * @author Erik
 */
public class DBSalesOrder implements IFDBSalesOrder {

    private Connection con;

    /** Creates a new instance
     * of DBEmployee */
    public DBSalesOrder() {
        con = DbConnection1.getInstance().getDBcon();
    }

    public SalesOrder findSalesOrder(int id, boolean retriveAssociation) {
        String wClause = "  id = " + id + "";
        return singleWhere(wClause, retriveAssociation);
    }
    //insert a new employee

    public void insertSalesOrder(SalesOrder so) {  //call to get the next ssn number
        int nextID = GetMax.getMaxId("Select max(id) from SalesOrder");
        //Date date, double totalAmount, String deliveryStatus, Date deliveryDate, boolean retriveAssociation
        nextID = nextID + 1;
        System.out.println("next id = " + nextID);

        int rc = -1;
        String query = "INSERT INTO SalesOrder(date, totalAmount, deliveryStatus, deliveryDate)  VALUES('"
                + so.getDate() + "',"
                + so.getTotalAmount() + " ,'"
                + so.getDeliveryStatus() + "','"
                + so.getDeliveryDate() + "')";


        System.out.println("insert : " + query);
        try { // insert new employee
            Statement stmt = con.createStatement();
            stmt.setQueryTimeout(5);
            rc = stmt.executeUpdate(query);
            stmt.close();
        }//end try
        catch (Exception ex) {
            System.out.println("Insert exception in employee db: " + ex);
        }
        //return (rc);
    }

//    public int updateEmployee(Employee emp) {
//        Employee empObj = emp;
//        int rc = -1;
//
//        String query = "UPDATE employee SET "
//                + "fname ='" + empObj.getFname() + "', "
//                + "lname ='" + empObj.getLname() + "' "
//                + " WHERE ssn = '" + empObj.getSsn() + "'";
//        System.out.println("Update query:" + query);
//        try { // update employee
//            Statement stmt = con.createStatement();
//            stmt.setQueryTimeout(5);
//            rc = stmt.executeUpdate(query);
//
//            stmt.close();
//        }//slut try
//        catch (Exception ex) {
//            System.out.println("Update exception in employee db: " + ex);
//        }
//        return (rc);
//    }
    public double getTotalAmount(int id) {
        double totalAmount = 0;
        ResultSet results;
        String query = "select totalAmount from SalesOrder where id = " + id;
        try { // insert new employee
            Statement stmt = con.createStatement();
            stmt.setQueryTimeout(5);
            results = stmt.executeQuery(query);
            
            if (results.next()) {
                totalAmount = results.getDouble(1);
            }//end if
            stmt.close();
        }//end try
        catch (Exception ex) {
            System.out.println("Select exception in SalesOrder so: " + ex);
        }
        System.out.println(totalAmount);
        return totalAmount;
    }

    public double updateTotalAmount(int id, double totalAmount, boolean retriveAssociation) {







//                String query = "INSERT INTO SalesOrder(date, totalAmount, deliveryStatus, deliveryDate)  VALUES('"
//                + so.getDate() + "',"
//                + so.getTotalAmount() + " ,'"
//                + so.getDeliveryStatus() + "','"
//                + so.getDeliveryDate() + "')";


        return totalAmount;
    }

//    public int delete(String ssn) {
//        int rc = -1;
//
//        String query = "DELETE FROM employee WHERE ssn = '"
//                + ssn + "'";
//        System.out.println(query);
//        try { // delete from employee
//            Statement stmt = con.createStatement();
//            stmt.setQueryTimeout(5);
//            rc = stmt.executeUpdate(query);
//            stmt.close();
//        }//slut try
//        catch (Exception ex) {
//            System.out.println("Delete exception in employee db: " + ex);
//        }
//        return (rc);
//    }
    //private methods
    //michWere is used whenever we want to select more than one employee
    private ArrayList<SalesOrder> miscWhere(String wClause, boolean retrieveAssociation) {
        ResultSet results;
        ArrayList list = new ArrayList();

        String query = buildQuery(wClause);

        try { // read the employee from the database
            Statement stmt = con.createStatement();
            stmt.setQueryTimeout(5);
            results = stmt.executeQuery(query);

            int snr = 0;
            while (results.next()) {
                SalesOrder soObj = new SalesOrder();
                soObj = buildSalesOrder(results);
                list.add(soObj);
            }//end while
            // if retrieveAssociation is true, the supervisor and department
            // has to be selected for each object in the list
            stmt.close();
        }//slut try
        catch (Exception e) {
            System.out.println("Query exception - select: " + e);
            e.printStackTrace();
        }
        return list;
    }

    //Singelwhere is used when we only select one employee
    private SalesOrder singleWhere(String wClause, boolean retrieveAssociation) {
        ResultSet results;
        SalesOrder soObj = new SalesOrder();
        String query = buildQuery(wClause);
        System.out.println("DbSalesOrder -singelWhere " + query);
        try { // read from soObjject
            Statement stmt = con.createStatement();
            stmt.setQueryTimeout(5);
            results = stmt.executeQuery(query);
            int snr = 0;
            if (results.next()) {
                soObj = buildSalesOrder(results);
                //missing the test on retriveassociation

            }//end if
            stmt.close();
        }//slut try
        catch (Exception e) {
            System.out.println("Query exception - select salesorder : " + e);
            e.printStackTrace();
        }
        return soObj;


    }
    //method to build the query

    private String buildQuery(String wClause) {
        String query = "SELECT * FROM SalesOrder";

        if (wClause.length() > 0) {
            query = query + " WHERE " + wClause;
        }

        return query;
    }
    //method to build an employee object

    private SalesOrder buildSalesOrder(ResultSet results) {
        SalesOrder soObj = new SalesOrder();
        try {
            soObj.setDate(results.getDate(1));
            soObj.setTotalAmount(results.getDouble(2));
            soObj.setDeliveryStatus(results.getString(3));
            soObj.setDeliveryDate(results.getDate(4));
        } catch (Exception e) {
            System.out.println("error in building the SalesOrder object");
        }
        return soObj;
    }
}
