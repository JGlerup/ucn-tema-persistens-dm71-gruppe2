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
public class DBSalesLineItem implements IFDBSalesLineItem {
    
    private  Connection con;
    public DBSalesLineItem() {
        con = DbConnection1.getInstance().getDBcon();
    }

    public SalesLineItem insertSalesLineItem(SalesLineItem sli) {

        String query = "INSERT INTO saleslineitem(id, quantity, totalamount, saleorderid, productid)  VALUES('"
                + sli.getId() + ","
                + sli.getQuantity() + ","
                + sli.getTotalAmount() + ","
                + sli.getSaleOrderID() + ","
                + sli.getProductID() + ")";

System.out.println("insert : " + query);
        try { // insert new deptloyee
            Statement stmt = con.createStatement();
            stmt.setQueryTimeout(5);
            stmt.executeUpdate(query);
            stmt.close();
        }//end try
        catch (Exception ex) {
            System.out.println("Insert exception in customer db: " + ex);
        }
        return (sli);
    }

private SalesLineItem singleWhere(String wClause, boolean retrieveAssociation)
    {
        ResultSet results;
        SalesLineItem sliObj = new SalesLineItem();
        String query =  buildQuery(wClause);
        System.out.println("DBSalesLineItem -singelWhere " + query);
        try{ // read from product
	   Statement stmt = con.createStatement();
	   stmt.setQueryTimeout(5);
	   results = stmt.executeQuery(query);
	   int snr=0;
	   if( results.next() ){
	       sliObj = buildSalesLineItem(results);
               //missing the test on retriveassociation

           }//end if
	   stmt.close();
	}//slut try
	catch(Exception e){
	   System.out.println("Query exception - select product : "+e);
	   e.printStackTrace();
        }
	return sliObj;


    }

    private SalesLineItem buildSalesLineItem(ResultSet results)
    {
       SalesLineItem sliObj = new SalesLineItem();

         try{
               sliObj.setId(results.getInt(1));
               sliObj.setQuantity(results.getInt(2));
               sliObj.setTotalAmount(results.getDouble(3));
               sliObj.setSaleOrderID(results.getInt(4));
               sliObj.setProductID(results.getInt(5));
               
          }
         catch(Exception e)
         {
             System.out.println("building saleslineitem object");
         }

        return sliObj;

    }
    //method to build the query
	private String buildQuery(String wClause)
	{
	    String query="SELECT * FROM saleslineitem";

		if (wClause.length()>0)
			query=query+" WHERE "+ wClause;

		return query;
	}


}
