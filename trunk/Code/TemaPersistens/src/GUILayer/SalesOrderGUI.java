/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * SalesOrder.java
 *
 * Created on 28-10-2010, 10:38:22
 */

package GUILayer;

import ControlLayer.CtrSalesOrder;
import ModelLayer.Customer;
import ModelLayer.Product;
import ModelLayer.SalesOrder;

/**
 *
 * @author Kristian Byrialsen
 */
public class SalesOrderGUI extends javax.swing.JFrame
{

    private CtrSalesOrder ctrSO;
    private Customer customer;
    private int tableRow;
    private SalesOrder salesOrder;
    private Product product;
    /** Creates new form SalesOrder */
    public SalesOrderGUI()
    {
        initComponents(); 
        ctrSO = new CtrSalesOrder();
        customer = null;
        tableRow = 0;
        salesOrder = null;
        product = null;
    }

    public int getTableRow()
    {
        return tableRow;
    }

    public void setTableRow(int tableRow)
    {
        this.tableRow = tableRow;
    }



    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        txtKundeNr = new javax.swing.JTextField();
        btnFindCustomer = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblKunde = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();
        txtStregkode = new javax.swing.JTextField();
        btnFindProdukt = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblProduct = new javax.swing.JTable();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        btnCreateOrder = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        btnAfslutOrdre = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        txtTotalPris = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        txtOrdreNr = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        btnAnnullerOrdre = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("SalesOrder"));

        jLabel1.setText("Find kunde vha kundenr");

        txtKundeNr.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtKundeNrActionPerformed(evt);
            }
        });

        btnFindCustomer.setText("Søg");
        btnFindCustomer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFindCustomerActionPerformed(evt);
            }
        });

        tblKunde.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null}
            },
            new String [] {
                "Kundenavn", "Adresse", "Postnr", "By", "Tlfnr", "Kundetype", "Email", "Kundenr"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tblKunde);
        tblKunde.getColumnModel().getColumn(3).setResizable(false);
        tblKunde.getColumnModel().getColumn(4).setResizable(false);

        jLabel2.setText("Find produkt vha stregkode");

        btnFindProdukt.setText("Søg");
        btnFindProdukt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFindProduktActionPerformed(evt);
            }
        });

        tblProduct.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Produktnavn", "Stkpris", "Antal", "Subtotal"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, true, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane2.setViewportView(tblProduct);

        jLabel4.setText("Påbegynd ny ordre");

        btnCreateOrder.setText("Ok");
        btnCreateOrder.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCreateOrderActionPerformed(evt);
            }
        });

        jLabel5.setText("Afslut ordre");

        btnAfslutOrdre.setText("Ok");
        btnAfslutOrdre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAfslutOrdreActionPerformed(evt);
            }
        });

        jLabel6.setText("Totalpris");

        txtTotalPris.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtTotalPrisActionPerformed(evt);
            }
        });

        jLabel7.setText("Ordrenr");

        jLabel8.setText("Annuller ordre");

        btnAnnullerOrdre.setText("Annuller");
        btnAnnullerOrdre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAnnullerOrdreActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 690, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                        .addGap(27, 27, 27)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(27, 27, 27)
                        .addComponent(txtKundeNr, javax.swing.GroupLayout.PREFERRED_SIZE, 188, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(38, 38, 38)
                        .addComponent(btnFindCustomer))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 680, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                        .addGap(37, 37, 37)
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtStregkode, javax.swing.GroupLayout.PREFERRED_SIZE, 189, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(34, 34, 34)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(btnCreateOrder, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnFindProdukt, javax.swing.GroupLayout.DEFAULT_SIZE, 62, Short.MAX_VALUE))))
                .addContainerGap())
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(87, 87, 87)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtOrdreNr, javax.swing.GroupLayout.DEFAULT_SIZE, 142, Short.MAX_VALUE)
                            .addComponent(txtTotalPris, javax.swing.GroupLayout.DEFAULT_SIZE, 142, Short.MAX_VALUE))
                        .addGap(369, 369, 369))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel8))
                        .addGap(276, 276, 276)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(btnAfslutOrdre, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnAnnullerOrdre, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(216, 216, 216))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtKundeNr, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnFindCustomer))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel4)
                    .addComponent(btnCreateOrder))
                .addGap(26, 26, 26)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtStregkode, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnFindProdukt))
                .addGap(27, 27, 27)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(49, 49, 49)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(txtTotalPris, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel3)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(txtOrdreNr, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(55, 55, 55)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(btnAfslutOrdre))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnAnnullerOrdre)
                    .addComponent(jLabel8))
                .addContainerGap(29, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnAfslutOrdreActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_btnAfslutOrdreActionPerformed
    {//GEN-HEADEREND:event_btnAfslutOrdreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnAfslutOrdreActionPerformed

    private void txtTotalPrisActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_txtTotalPrisActionPerformed
    {//GEN-HEADEREND:event_txtTotalPrisActionPerformed
        if(salesOrder!=null)
        {
        txtTotalPris.setText(String.valueOf(salesOrder.getTotalAmount()));
        }
    }//GEN-LAST:event_txtTotalPrisActionPerformed

    private void btnFindCustomerActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_btnFindCustomerActionPerformed
    {//GEN-HEADEREND:event_btnFindCustomerActionPerformed
      int kundeNr = Integer.parseInt(txtKundeNr.getText());
     customer = ctrSO.findCustomer(kundeNr);
      tblKunde.setValueAt(customer.getName(), 0, 0);
      tblKunde.setValueAt(customer.getAddress(), 0, 1);
      tblKunde.setValueAt(customer.getZipcode(), 0, 2);
      tblKunde.setValueAt(customer.getCity(), 0, 3);
      tblKunde.setValueAt(customer.getPhoneno(), 0, 4);
      tblKunde.setValueAt(customer.getCustomerType(), 0, 5);
      tblKunde.setValueAt(customer.getEmail(), 0, 6);
      tblKunde.setValueAt(customer.getCustomerno(), 0, 7);
      
    }//GEN-LAST:event_btnFindCustomerActionPerformed

    private void txtKundeNrActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_txtKundeNrActionPerformed
    {//GEN-HEADEREND:event_txtKundeNrActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtKundeNrActionPerformed

    private void btnCreateOrderActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_btnCreateOrderActionPerformed
    {//GEN-HEADEREND:event_btnCreateOrderActionPerformed
        salesOrder = ctrSO.insertSalesOrder(customer);

    }//GEN-LAST:event_btnCreateOrderActionPerformed

    private void btnFindProduktActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_btnFindProduktActionPerformed
    {//GEN-HEADEREND:event_btnFindProduktActionPerformed
        int barcode = Integer.parseInt(txtStregkode.getText());
        int amount = 0;
        double subtotal = 0;
        product = ctrSO.searchProductByBarCode(barcode);
      tblProduct.setValueAt(product.getProductName(), tableRow, 0);
      tblProduct.setValueAt(product.getSalesPrice(), tableRow, 1);
      tblProduct.setValueAt(1,tableRow, 2);
      amount = Integer.parseInt((String)tblProduct.getValueAt(tableRow, 2));
      subtotal = amount * product.getSalesPrice();
      tblProduct.setValueAt(subtotal, tableRow, 3);
      tableRow++;
    }//GEN-LAST:event_btnFindProduktActionPerformed

    private void btnAnnullerOrdreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAnnullerOrdreActionPerformed
        txtKundeNr.setText(null);
        tblKunde.removeAll();
        txtStregkode.setText(null);
        tblProduct.removeAll();
        txtTotalPris.setText(null);
        txtOrdreNr.setText(null);
    }//GEN-LAST:event_btnAnnullerOrdreActionPerformed

    /**
    * @param args the command line arguments
    */
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new SalesOrderGUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAfslutOrdre;
    private javax.swing.JButton btnAnnullerOrdre;
    private javax.swing.JButton btnCreateOrder;
    private javax.swing.JButton btnFindCustomer;
    private javax.swing.JButton btnFindProdukt;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable tblKunde;
    private javax.swing.JTable tblProduct;
    private javax.swing.JTextField txtKundeNr;
    private javax.swing.JTextField txtOrdreNr;
    private javax.swing.JTextField txtStregkode;
    private javax.swing.JTextField txtTotalPris;
    // End of variables declaration//GEN-END:variables

   

}
