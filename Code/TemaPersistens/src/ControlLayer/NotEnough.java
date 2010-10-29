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
    private int barcode;

    public NotEnough(int quantityProduct, int barcode) {
        this.quantityProduct = quantityProduct;
        this.barcode = barcode;
    }

    public String getMessage()
    {
        return "Det ønskede antal for produktet " + barcode +
                " er ikke på lageret." + " Der findes kun " + quantityProduct;
    }

    public String toString()
    {
        return "Det ønskede antal for produktet " + barcode +
                " er ikke på lageret." + " Der findes kun " + quantityProduct;
    }
}
