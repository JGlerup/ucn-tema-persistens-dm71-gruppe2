/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package ControlLayer;
import ModelLayer.*;
import DBLayer.*;
import java.util.ArrayList;

/**
 *
 * @author Paving
 */
public class CtrSalesOrder {
    private salesOrder salesOrderObject

    public Customer searchCostumerByPhoneNo(int phoneno)
    {

        IFDBCustomer dbCus = new DBCustomer();
        return dbCus.findCustomer(phoneno, true);
    }

    public Product searchProductByBarCode(int barcode)
    {

        IFDBCustomer dbPro = new DBProduct();
        return dbPro.findProduct(barcode, true);
    }


        public void insertNew(int customerID)
      {
           IFDBSalesOrder dbSalesOrder = new DBSalesOrder();
           SalesOrder soObj = new SalesOrder();
           /*soObj.setDate(date);
           soObj.setTotalAmount(totalAmount);
           soObj.setDeliveryStatus(deliveryStatus);
           soObj.setDeliveryDate(deliveryDate);
           soObj.setOrderno(orderNo);*/
           soObj.setCustomerid(customerID);
           dbSalesOrder.insertSalesOrder(soObj);
      }



}
