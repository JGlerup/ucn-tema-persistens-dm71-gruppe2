/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package DBLayer;

import ModelLayer.SalesOrder;
import java.util.Date;

/**
 *
 * @author Erik
 */
public interface IFDBSalesOrder {

    public void insertSalesOrder(SalesOrder so);
    //Date date, double totalAmount, String deliveryStatus, Date deliveryDate, boolean retriveAssociation
    public SalesOrder findSalesOrder(int id, boolean retriveAssociation);

    public double updateTotalAmountSalesOrder(int soID, int sliID);

    public double getTotalAmountSalesOrder(int id);

    public double getTotalAmountSalesLineItem(int id);
}
