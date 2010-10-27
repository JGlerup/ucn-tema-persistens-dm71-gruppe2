/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package ModelLayer;

/**
 *
 * @author Erik
 */
public class ClubDiscount {
    private double discount;
    private int minamount;

    public ClubDiscount(int discount, int minamount) {
        this.discount = discount;
        this.minamount = minamount;
    }

    public double getDiscount() {
        return discount;
    }

    public void setDiscount(int discount) {
        this.discount = discount;
    }

    public int getMinamount() {
        return minamount;
    }

    public void setMinamount(int minamount) {
        this.minamount = minamount;
    }

    

}
