/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package DBLayer;

import ModelLayer.SalesOrder;
import java.beans.Statement;
import java.sql.Connection;
import java.sql.ResultSet;
import java.util.ArrayList;

/**
 *
 * @author Erik
 */
public class DBSalesOrder {

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

    public int insertSalesOrder(SalesOrder so) {  //call to get the next ssn number
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
        return (rc);
    }

    public int updateEmployee(Employee emp) {
        Employee empObj = emp;
        int rc = -1;

        String query = "UPDATE employee SET "
                + "fname ='" + empObj.getFname() + "', "
                + "lname ='" + empObj.getLname() + "' "
                + " WHERE ssn = '" + empObj.getSsn() + "'";
        System.out.println("Update query:" + query);
        try { // update employee
            Statement stmt = con.createStatement();
            stmt.setQueryTimeout(5);
            rc = stmt.executeUpdate(query);

            stmt.close();
        }//slut try
        catch (Exception ex) {
            System.out.println("Update exception in employee db: " + ex);
        }
        return (rc);
    }

    public int delete(String ssn) {
        int rc = -1;

        String query = "DELETE FROM employee WHERE ssn = '"
                + ssn + "'";
        System.out.println(query);
        try { // delete from employee
            Statement stmt = con.createStatement();
            stmt.setQueryTimeout(5);
            rc = stmt.executeUpdate(query);
            stmt.close();
        }//slut try
        catch (Exception ex) {
            System.out.println("Delete exception in employee db: " + ex);
        }
        return (rc);
    }

    //private methods
    //michWere is used whenever we want to select more than one employee
    private ArrayList<Employee> miscWhere(String wClause, boolean retrieveAssociation) {
        ResultSet results;
        ArrayList list = new ArrayList();

        String query = buildQuery(wClause);

        try { // read the employee from the database
            Statement stmt = con.createStatement();
            stmt.setQueryTimeout(5);
            results = stmt.executeQuery(query);

            int snr = 0;
            while (results.next()) {
                Employee empObj = new Employee();
                empObj = buildEmployee(results);
                list.add(empObj);
            }//end while
            // if retrieveAssociation is tru, the supervisor and department
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
    private Employee singleWhere(String wClause, boolean retrieveAssociation) {
        ResultSet results;
        Employee empObj = new Employee();
        empObj.setSsn("");
        String query = buildQuery(wClause);
        System.out.println(query);
        try { // read the employee from the database
            Statement stmt = con.createStatement();
            stmt.setQueryTimeout(5);
            results = stmt.executeQuery(query);

            if (results.next()) {
                empObj = buildEmployee(results);
                //assocaition is to be build
                stmt.close();
                if (retrieveAssociation) {   //The supervisor and department is to be build as well
                    String superssn = empObj.getSupervisor().getSsn();
                    Employee superEmp = singleWhere(" ssn = '" + superssn + "'", false);
                    empObj.setSupervisor(superEmp);
                    System.out.println("Supervisor er hentet");
                    //here the department has to be build

                }
            }

        }//end try
        catch (Exception e) {
            System.out.println("Query exception: " + e);
        }
        return empObj;
    }
    //method to build the query

    private String buildQuery(String wClause) {
        String query = "SELECT * FROM Employee";

        if (wClause.length() > 0) {
            query = query + " WHERE " + wClause;
        }

        return query;
    }
    //method to build an employee object

    private Employee buildEmployee(ResultSet results) {
        Employee empObj = new Employee();
        try {
            empObj.setFname(results.getString(1));
            empObj.setMinit(results.getString(2));
            empObj.setLname(results.getString(3));
            empObj.setSsn(results.getString(4));
            empObj.setBdate(results.getString(5));
            empObj.setAddress(results.getString(6));
            empObj.setSex(results.getString(7));
            empObj.setSalary(results.getDouble(8));
            empObj.setSupervisor(new Employee(results.getString(9)));
            empObj.setDepartment(new Department(results.getInt(10)));
        } catch (Exception e) {
            System.out.println("error in building the employee object");
        }
        return empObj;
    }
}
