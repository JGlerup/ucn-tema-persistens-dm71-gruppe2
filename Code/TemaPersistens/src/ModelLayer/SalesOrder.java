/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ModelLayer;

import java.util.Date;

/**
 *
 * @author Erik
 */
public class SalesOrder {

    private Date date;
    private double totalAmount;
    private String deliveryStatus;
    private Date deliveryDate;

    public SalesOrder() {
    }

    public SalesOrder(Date date, double totalAmount, String deliveryStatus, Date deliveryDate) {
        this.date = date;
        this.totalAmount = totalAmount;
        this.deliveryStatus = deliveryStatus;
        this.deliveryDate = deliveryDate;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public Date getDeliveryDate() {
        return deliveryDate;
    }

    public void setDeliveryDate(Date deliveryDate) {
        this.deliveryDate = deliveryDate;
    }

    public String getDeliveryStatus() {
        return deliveryStatus;
    }

    public void setDeliveryStatus(String deliveryStatus) {
        this.deliveryStatus = deliveryStatus;
    }

    public double getTotalAmount() {
        return totalAmount;
    }

    public void setTotalAmount(double totalAmount) {
        this.totalAmount = totalAmount;
    }
}
