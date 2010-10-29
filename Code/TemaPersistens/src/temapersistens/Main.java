/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package temapersistens;

import ControlLayer.CtrSalesOrder;

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
        //DBSalesOrder dbso = new DBSalesOrder();
        //dbso.updateTotalAmountSalesOrder(1, 1);
        //dbso.getTotalAmountSalesOrder(1);
        CtrSalesOrder ctrSO = new CtrSalesOrder();

        System.out.println(ctrSO.searchProductByBarCode(123456).getQuantity());
    }

}
