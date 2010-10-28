/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ModelLayer;

/**
 *
 * @author Erik
 */
public class SalesLineItem {

    private int id;
    private int quantity;
    private double totalAmount;
    private int saleOrderID;
    private int productID;

    public SalesLineItem() {
    }

    public SalesLineItem(int id, int quantity, double totalAmount, int saleOrderID, int productID) {
        this.id = id;
        this.quantity = quantity;
        this.totalAmount = totalAmount;
        this.saleOrderID = saleOrderID;
        this.productID = productID;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getProductID() {
        return productID;
    }

    public void setProductID(int productID) {
        this.productID = productID;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public int getSaleOrderID() {
        return saleOrderID;
    }

    public void setSaleOrderID(int saleOrderID) {
        this.saleOrderID = saleOrderID;
    }

    public double getTotalAmount() {
        return totalAmount;
    }

    public void setTotalAmount(double totalAmount) {
        this.totalAmount = totalAmount;
    }
}
