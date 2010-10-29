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

    public Customer searchCostumerByPhoneNo(int phoneno)
    {

        IFDBCustomer dbCus = new DBCustomer();
        return dbCus.findCustomer(phoneno, true);
    }

    public Product searchProductByBarCode(int barcode)
    {

        IFDBProduct dbPro = new DBProduct();
        return dbPro.findProduct(barcode, true);
    }


        public void insertSalesOrder(int customerID)
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

        public void SalesLineItem(int quantity, int saleOrderID, int barcode, int productID)
        {
           IFDBSalesLineItem dbSalesLineItem = new DBSalesLineItem();
           SalesLineItem sliObj = new SalesLineItem();
           IFDBProduct dbProduct = new DBProduct();
           Product proObj = dbProduct.findProduct(barcode, true);
           try {
           checkQuantity(productID, quantity);
           sliObj.setProductID(productID);
           sliObj.setQuantity(quantity);
           sliObj.setTotalAmount(quantity);
           sliObj.setSaleOrderID(saleOrderID);
           dbSalesLineItem.insertSalesLineItem(sliObj);
           }
           catch(Exception e) {
               e.getMessage();
           }


        }

        public boolean checkQuantity(int productID, int quantity) throws NotEnough
        {
           IFDBSalesLineItem dbSalesLineItem = new DBSalesLineItem();
           IFDBProduct dbProduct = new DBProduct();
           SalesLineItem sliObj = new SalesLineItem();
           int quantityProduct = dbProduct.checkQuantity(productID);
           if(quantityProduct < quantity) {
               throw new NotEnough(quantity, productID);
           }
           else {
               return true;
           }

        }



}
