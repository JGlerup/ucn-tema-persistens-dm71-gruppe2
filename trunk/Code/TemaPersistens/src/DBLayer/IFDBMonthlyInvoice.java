/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package DBLayer;

/**
 *
 * @author Erik
 */
import ModelLayer.*;
import java.util.Date;
public interface IFDBMonthlyInvoice {

    public MonthlyInvoice findMonthlyInvoice(int invoiceno);

    public void insertMonthlyInvoice(int id, int invoiceno, Date paymentDate, double totalAmount, boolean retrieveAssociation);

}
