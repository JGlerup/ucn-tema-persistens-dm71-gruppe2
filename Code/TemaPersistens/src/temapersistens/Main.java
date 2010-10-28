/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package temapersistens;

import DBLayer.DBSalesOrder;
import ModelLayer.SalesOrder;

/**
 *
 * @author Erik
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        DBSalesOrder dbso = new DBSalesOrder();
        dbso.getTotalAmount(1);
    }

}
