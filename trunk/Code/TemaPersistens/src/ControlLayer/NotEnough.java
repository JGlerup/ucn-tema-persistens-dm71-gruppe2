/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package ControlLayer;

/**
 *
 * @author Rasmus
 */
public class NotEnough extends Exception {

    private int quantityProduct;
    private int productID;

    public NotEnough(int quantityProduct, int productID) {
        this.quantityProduct = quantityProduct;
        this.productID = productID;
    }

    public String getMessage()
    {
        return "Det ønskede antal for produktet" + productID +
                "er ikke på lageret." + "Der findes kun " + quantityProduct;
    }

    public String toString()
    {
        return "Det ønskede antal for produktet" + productID +
                "er ikke på lageret." + "Der findes kun " + quantityProduct;
    }
}
