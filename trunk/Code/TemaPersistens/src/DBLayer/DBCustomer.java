/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package DBLayer;
import java.sql.*;
import java.util.ArrayList;
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

 public Customer findCustomer(int customerNo, boolean retriveAssociation)
    {
        Customer cusObj = new Customer();
        cusObj = singleWhere("customerno = " + customerNo, false);
        return cusObj;

 }

// public int insertCustomer(Customer c) {
//
//        int rc = -1;
//        String query = "INSERT INTO customer(name, address, zipcode, city, phoneno, customertype, email)  VALUES('"
//                + c.getName() + "','"
//                + c.getAddress() + "','"
//                + c.getZipcode() + "',"
//                + c.getCity() + "','"
//                + c.getPhoneno() + "',"
//                + c.getCustomerType() + "','"
//                + c.getEmail() + "','";
//
//System.out.println("insert : " + query);
//        try { // insert new deptloyee
//            Statement stmt = con.createStatement();
//            stmt.setQueryTimeout(5);
//            rc = stmt.executeUpdate(query);
//            stmt.close();
//        }//end try
//        catch (Exception ex) {
//            System.out.println("Insert exception in customer db: " + ex);
//        }
//        return (rc);
//    }

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
    }

     //miscWhere is used when more than one employee is selected and build
    private ArrayList miscWhere(String wClause, boolean retrieveAssociation)
	{
		ResultSet results;
		ArrayList list = new ArrayList();

		String query =  buildQuery(wClause);
                System.out.println("DbCustomer " + query);
  		try{ // read from employee
	 		Statement stmt = con.createStatement();
	 		stmt.setQueryTimeout(5);
	 		results = stmt.executeQuery(query);

			int snr=0;
			while( results.next() ){
		     	 Customer cusObj = new Customer();
			 cusObj = buildCustomer(results);
                         list.add(cusObj);
                         //missing tes on retriveAssociation
			}//end while
			stmt.close();
		}//slut try
	 	catch(Exception c){
	 		System.out.println("Query exception - select customer : "+c);
			c.printStackTrace();
	 	}
		return list;

    }
        private Customer buildCustomer(ResultSet results)
    {
       Customer cusObj = new Customer();

         try{
               cusObj.setId(results.getInt(1));
               cusObj.setName(results.getString(2));
               cusObj.setAddress(results.getString(3));
               cusObj.setZipcode(results.getInt(4));
               cusObj.setCity(results.getString(5));
               cusObj.setPhoneno(results.getInt(6));
               cusObj.setCustomerType(results.getString(7));
               cusObj.setEmail(results.getString(8));
          }
         catch(Exception c)
         {
             System.out.println("building customer object");
         }

        return cusObj;

    }

    //method to build the query
	private String buildQuery(String wClause)
	{
	    String query="SELECT * FROM customer";

		if (wClause.length()>0)
			query=query+" WHERE "+ wClause;

		return query;
	}
}