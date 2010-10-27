/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package DBLayer;
import java.sql.*;
import ModelLayer.*;

/**
 *
 * @author Kristian Byrialsen
 */
public class DBCustomer implements IFDBCustomer {
private  Connection con;
    
 public DBCustomer() {
        con = DbConnection1.getInstance().getDBcon();

}

 public Customer findCustomer(int phoneno, boolean retriveAssociation)
    {
        Customer cusObj = new Customer();
        cusObj = singleWhere("phoneno = " + phoneno, false);
        return cusObj;

 }

 public int insertCustomer(Customer c) {

        int rc = -1;
        String query = "INSERT INTO customer(name, address, zipcode, city, phoneno, customertype, email)  VALUES('"
                + c.getName() + "','"
                + c.getAddress() + "','"
                + c.getZipcode() + "',"
                + c.getCity() + "','"
                + c.getPhoneno() + "',"
                + c.getCustomerType() + "','"
                + c.getEmail() + "','";

System.out.println("insert : " + query);
        try { // insert new deptloyee
            Statement stmt = con.createStatement();
            stmt.setQueryTimeout(5);
            rc = stmt.executeUpdate(query);
            stmt.close();
        }//end try
        catch (Exception ex) {
            System.out.println("Insert exception in customer db: " + ex);
        }
        return (rc);
    }

//singlewhere is used when only one customer object is to be build
    private Customer singleWhere(String wClause, boolean retrieveAssociation)
    {
        ResultSet results;
        Customer cusObj = new Customer();
        String query =  buildQuery(wClause);
        System.out.println("DbCustomer -singelWhere " + query);
        try{ // read from customer
	   Statement stmt = con.createStatement();
	   stmt.setQueryTimeout(5);
	   results = stmt.executeQuery(query);
	   int snr=0;
	   if( results.next() ){
	       cusObj = buildCustomer(results);
               //missing the test on retriveassociation

           }//end if
	   stmt.close();
	}//slut try
	catch(Exception c){
	   System.out.println("Query exception - select customer : "+c);
	   c.printStackTrace();
        }
	return cusObj;
    }}
