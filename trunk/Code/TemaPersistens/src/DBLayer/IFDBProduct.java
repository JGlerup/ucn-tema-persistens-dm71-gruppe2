/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package DBLayer;
import ModelLayer.*;
/**
 *
 * @author Erik
 */
public interface IFDBProduct {
    public Product findProduct(int barcode, boolean retriveAssociation);

    public int checkQuantity(int productID);
}
