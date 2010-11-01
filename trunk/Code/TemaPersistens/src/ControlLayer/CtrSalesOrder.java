/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ControlLayer;

import ModelLayer.*;
import DBLayer.*;
import DBLayer.IFDBSalesLineItem;
import java.util.Calendar;

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
        int nexID = dbSalesOrder.insertSalesOrder(soObj);
        soObj.setId(nexID);
        return soObj;
    }

    public double getTotalAmountSalesLineItem(int salesOrderID)
    {
        double totalAmountSalesLineItem = 0;
        IFDBSalesOrder dbSalesOrder = new DBSalesOrder();
        SalesOrder soObj = new SalesOrder();
        totalAmountSalesLineItem = dbSalesOrder.getTotalAmountSalesLineItem(salesOrderID);
        return totalAmountSalesLineItem;
    }

    public double getTotalAmountSalesOrder(int salesOrderID)
    {
        double totalAmountSalesOrder = 0;
        IFDBSalesOrder dbSalesOrder = new DBSalesOrder();
        SalesOrder soObj = new SalesOrder();
        totalAmountSalesOrder = dbSalesOrder.getTotalAmountSalesOrder(salesOrderID);
        return totalAmountSalesOrder;
    }

    public SalesLineItem insertSalesLineItem(int quantity, int saleOrderID, int productID)
    {
        IFDBSalesLineItem dbSalesLineItem = new DBSalesLineItem();
        SalesLineItem sliObj = new SalesLineItem();
        try
        {
           // checkQuantity(barcode, quantity);
            sliObj.setQuantity(quantity);
            sliObj.setTotalAmount(quantity);
            sliObj.setSaleOrderID(saleOrderID);
            sliObj.setProductID(productID);
            int nextID = dbSalesLineItem.insertSalesLineItem(sliObj);
            sliObj.setId(nextID);
        }
        catch (Exception e)
        {
            e.getMessage();
        }
        return sliObj;

    }

    public boolean checkQuantity(int barcode, int quantity) throws NotEnough
    {
        IFDBSalesLineItem dbSalesLineItem = new DBSalesLineItem();
        IFDBProduct dbProduct = new DBProduct();
        SalesLineItem sliObj = new SalesLineItem();
        int quantityProduct = dbProduct.findProduct(barcode, true).getQuantity();
        if (quantityProduct < quantity)
        {
            throw new NotEnough(quantityProduct, barcode);
        }
        else
        {
            return true;
        }

    }
}
