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

    public SalesOrder insertSalesOrder(Date date, double totalAmount, String deliveryStatus, Date deliveryDate, boolean retriveAssociation);
    
    public SalesOrder findSalesOrder(int id, boolean retriveAssociation);

    public double updateTotalAmount(int id, double totalAmount, boolean retriveAssociation);
}
