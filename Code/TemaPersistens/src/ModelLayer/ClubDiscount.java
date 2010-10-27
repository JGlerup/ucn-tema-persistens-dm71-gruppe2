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
    private int discount;
    private int minamount;

    public ClubDiscount(int discount, int minamount) {
        this.discount = discount;
        this.minamount = minamount;
    }

    public int getDiscount() {
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
