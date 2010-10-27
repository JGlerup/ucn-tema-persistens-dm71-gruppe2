/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package ModelLayer;

/**
 *
 * @author Erik
 */
public class Product {
    private String productName;
    private double purchasePrice;
    private double salesPrice;
    private double rentPrice;
    private String countryOfOrigin;
    private int minStock;
    private int quantity;

    public Product(String productName, int purchasePrice, int salesPrice, int rentPrice, String countryOfOrigin, int minStock, int quantity) {
        this.productName = productName;
        this.purchasePrice = purchasePrice;
        this.salesPrice = salesPrice;
        this.rentPrice = rentPrice;
        this.countryOfOrigin = countryOfOrigin;
        this.minStock = minStock;
        this.quantity = quantity;
    }

    public String getCountryOfOrigin() {
        return countryOfOrigin;
    }

    public void setCountryOfOrigin(String countryOfOrigin) {
        this.countryOfOrigin = countryOfOrigin;
    }

    public int getMinStock() {
        return minStock;
    }

    public void setMinStock(int minStock) {
        this.minStock = minStock;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public double getPurchasePrice() {
        return purchasePrice;
    }

    public void setPurchasePrice(int purchasePrice) {
        this.purchasePrice = purchasePrice;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public double getRentPrice() {
        return rentPrice;
    }

    public void setRentPrice(int rentPrice) {
        this.rentPrice = rentPrice;
    }

    public double getSalesPrice() {
        return salesPrice;
    }

    public void setSalesPrice(int salesPrice) {
        this.salesPrice = salesPrice;
    }

    

}
