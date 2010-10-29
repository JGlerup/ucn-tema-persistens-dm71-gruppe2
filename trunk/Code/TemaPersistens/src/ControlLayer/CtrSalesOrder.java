/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package ControlLayer;
import ModelLayer.*;
import DBLayer.*;

/**
 *
 * @author Paving
 */
public class CtrSalesOrder {
    private SalesOrder salesOrderObject;

    public Customer findCustomer(int customerNo)
    {

        IFDBCustomer dbCus = new DBCustomer();
        return dbCus.findCustomer(customerNo, true);
    }

    public Product searchProductByBarCode(int barcode)
    {

        IFDBProduct dbPro = new DBProduct();
        return dbPro.findProduct(barcode, true);
    }


        public SalesOrder insertSalesOrder(Customer customerID)
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
           return soObj;
      }

        public SalesLineItem SalesLineItem(int quantity, int saleOrderID, int barcode)
        {
           IFDBSalesLineItem dbSalesLineItem = new DBSalesLineItem();
           SalesLineItem sliObj = new SalesLineItem();
           try {
           checkQuantity(barcode, quantity);
           sliObj.setQuantity(quantity);
           sliObj.setTotalAmount(quantity);
           sliObj.setSaleOrderID(saleOrderID);
           dbSalesLineItem.insertSalesLineItem(sliObj);
           }
           catch(Exception e) {
               e.getMessage();
           }
           return sliObj;

        }

        public boolean checkQuantity(int barcode, int quantity) throws NotEnough
        {
           IFDBSalesLineItem dbSalesLineItem = new DBSalesLineItem();
           IFDBProduct dbProduct = new DBProduct();
           SalesLineItem sliObj = new SalesLineItem();
           int quantityProduct = dbProduct.findProduct(barcode,true).getQuantity();
           if(quantityProduct < quantity) {
               throw new NotEnough(quantityProduct, barcode);
           }
           else {
               return true;
           }

        }



}
