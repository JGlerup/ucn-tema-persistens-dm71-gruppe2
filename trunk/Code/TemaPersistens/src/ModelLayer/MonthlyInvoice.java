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
public class MonthlyInvoice {
    private int invoiceNo;
    private Date paymentDate;
    private int totalAmount;

    public MonthlyInvoice(int invoiceNo, Date paymentDate, int totalAmount) {
        this.invoiceNo = invoiceNo;
        this.paymentDate = paymentDate;
        this.totalAmount = totalAmount;
    }

    public int getInvoiceNo() {
        return invoiceNo;
    }

    public void setInvoiceNo(int invoiceNo) {
        this.invoiceNo = invoiceNo;
    }

    public Date getPaymentDate() {
        return paymentDate;
    }

    public void setPaymentDate(Date paymentDate) {
        this.paymentDate = paymentDate;
    }

    public int getTotalAmount() {
        return totalAmount;
    }

    public void setTotalAmount(int totalAmount) {
        this.totalAmount = totalAmount;
    }

    

}
