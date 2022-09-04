package com.astral.invoice;

import java.awt.Component;
import java.awt.Desktop;
import java.io.IOException;
import javax.swing.JOptionPane;
import javax.swing.table.TableCellRenderer;
import javax.swing.table.TableColumnModel;

/**
 *
 * @author Astralsphere Arts
 */
public class New_Invoice extends javax.swing.JPanel {

    /**
     * Creates new form Invoicing
     */
    public New_Invoice() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Heading = new javax.swing.JLabel();
        Customer_Name_Label = new javax.swing.JLabel();
        Customer_Name = new javax.swing.JTextField();
        Contact_Number_Label = new javax.swing.JLabel();
        Contact_Number = new javax.swing.JTextField();
        Customer_Address_Label = new javax.swing.JLabel();
        Customer_Address = new javax.swing.JTextField();
        New_Invoice_Table_Container = new javax.swing.JScrollPane();
        New_Invoice_Table = new javax.swing.JTable();
        Invoices = new javax.swing.JButton();
        Edit_List = new javax.swing.JButton();
        Clear_All = new javax.swing.JButton();
        Create_Invoice = new javax.swing.JButton();

        Heading.setFont(new java.awt.Font("Segoe UI Semilight", 1, 24)); // NOI18N
        Heading.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        Heading.setText("Create New Invoice");
        Heading.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);

        Customer_Name_Label.setFont(new java.awt.Font("Segoe UI Semibold", 0, 12)); // NOI18N
        Customer_Name_Label.setText("Customer's Name");

        Contact_Number_Label.setFont(new java.awt.Font("Segoe UI Semibold", 0, 12)); // NOI18N
        Contact_Number_Label.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Contact_Number_Label.setText("Contact Number");
        Contact_Number_Label.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        Contact_Number.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                Contact_NumberKeyPressed(evt);
            }
        });

        Customer_Address_Label.setFont(new java.awt.Font("Segoe UI Semibold", 0, 12)); // NOI18N
        Customer_Address_Label.setText("Customer's Address");

        New_Invoice_Table.setModel(com.astral.internal.Function.newInvoTableModel());
        New_Invoice_Table.setShowGrid(true);
        New_Invoice_Table.getTableHeader().setReorderingAllowed(false);
        New_Invoice_Table_Container.setViewportView(New_Invoice_Table);
        final TableColumnModel NewColumnModel = New_Invoice_Table.getColumnModel();
        for (int column = 0; column < New_Invoice_Table.getColumnCount(); column++) {
            int width = 15;
            for (int row = 0; row < New_Invoice_Table.getRowCount(); row++) {
                TableCellRenderer renderer = New_Invoice_Table.getCellRenderer(row, column);
                Component comp = New_Invoice_Table.prepareRenderer(renderer, row, column);
                width = Math.max(comp.getPreferredSize().width + 1 , width);
            }
            if (width > 300) width=300;
            NewColumnModel.getColumn(column).setPreferredWidth(width);
        }

        Invoices.setText("Invoices");
        Invoices.setToolTipText("Show Previously Created Invoices");
        Invoices.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                InvoicesActionPerformed(evt);
            }
        });

        Edit_List.setText("Edit List");
        Edit_List.setToolTipText("Edit Product List");
        Edit_List.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Edit_ListActionPerformed(evt);
            }
        });

        Clear_All.setText("Clear All");
        Clear_All.setToolTipText("Clear All Entered Data");
        Clear_All.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Clear_AllActionPerformed(evt);
            }
        });

        Create_Invoice.setText("Create Invoice");
        Create_Invoice.setToolTipText("Create a New Invoice using given Data");
        Create_Invoice.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Create_InvoiceActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(45, 45, 45)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(Invoices, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(Edit_List, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(Clear_All, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(Create_Invoice, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(Heading, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGap(2, 2, 2)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(Customer_Address_Label, javax.swing.GroupLayout.DEFAULT_SIZE, 118, Short.MAX_VALUE)
                            .addComponent(Customer_Name_Label, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(Customer_Name)
                                .addGap(18, 18, 18)
                                .addComponent(Contact_Number_Label)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(Contact_Number, javax.swing.GroupLayout.PREFERRED_SIZE, 198, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(Customer_Address, javax.swing.GroupLayout.PREFERRED_SIZE, 724, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(New_Invoice_Table_Container))
                .addContainerGap(53, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addComponent(Heading, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Customer_Name_Label, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Customer_Name, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Contact_Number_Label, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Contact_Number, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Customer_Address_Label, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Customer_Address, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(New_Invoice_Table_Container, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(Create_Invoice, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Clear_All, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(Invoices, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(Edit_List, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(63, 63, 63))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void Contact_NumberKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_Contact_NumberKeyPressed
        String Number = Contact_Number.getText();
        int length = Number.length();
        if (evt.getKeyChar() >= '0' && evt.getKeyChar() <= '9') {
            if (length < 10)
                Contact_Number.setEditable(true);
            else
                Contact_Number.setEditable(false);
        } else {
            switch (evt.getExtendedKeyCode()) {
                case java.awt.event.KeyEvent.VK_BACK_SPACE -> Contact_Number.setEditable(true);
                case java.awt.event.KeyEvent.VK_DELETE -> Contact_Number.setEditable(true);
                default -> Contact_Number.setEditable(false);
            }
        }
    }//GEN-LAST:event_Contact_NumberKeyPressed

    private void InvoicesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_InvoicesActionPerformed
        com.astral.internal.Function.invFolder.mkdir();
        try {
            Desktop.getDesktop().open(com.astral.internal.Function.invFolder);
        } catch (IOException ex) {
            JOptionPane.showMessageDialog(null, ex, "Error", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_InvoicesActionPerformed

    private void Edit_ListActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Edit_ListActionPerformed
        com.astral.invoice.Main.Product_List_Icon_Active();
        com.astral.invoice.Main.Load_Product_List();
    }//GEN-LAST:event_Edit_ListActionPerformed

    private void Clear_AllActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Clear_AllActionPerformed
        com.astral.invoice.Main.Load_New_Invoice();
    }//GEN-LAST:event_Clear_AllActionPerformed

    private void Create_InvoiceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Create_InvoiceActionPerformed
        int prodSelected = 0;
        boolean emptyQuan = false;
        String invID = "INV-" + new java.text.SimpleDateFormat("yyyyMMdd").format(new java.util.Date())
            + "-" + com.astral.internal.Function.randomID(4);
        String custName = Customer_Name.getText();
        String custContact = Contact_Number.getText();
        String custAddress = Customer_Address.getText();
        String saleDate = new java.text.SimpleDateFormat("dd MMMM yyyy").format(new java.util.Date());
        String saleAmount = "0";
        for (int row = 0; row < New_Invoice_Table.getRowCount(); row++) {
            if (Boolean.valueOf(New_Invoice_Table.getValueAt(row, 0).toString())) {
                prodSelected++;
                String Quantity = "0";
                if (New_Invoice_Table.getValueAt(row, 4) != null)
                    Quantity = Integer.toString((Integer) New_Invoice_Table.getValueAt(row, 4));
                if (Quantity.equals("0"))
                    emptyQuan = true;
            }
        }
        if (custName.equals("") || custContact.equals("") || custAddress.equals(""))
            JOptionPane.showMessageDialog(null, "Customer Details can't be Empty. Please"
                + " Try Again!", "Customer Details Empty", JOptionPane.ERROR_MESSAGE);
        else if (custContact.length() != 10)
            JOptionPane.showMessageDialog(null, "Contact Number Must be 10 Digit Long. Please"
                + " Try Again!", "Contact Number Too Short", JOptionPane.ERROR_MESSAGE);
        else if (prodSelected == 0)
            JOptionPane.showMessageDialog(null, "At least one Product needs to be Selected. Please"
                + " Try Again!", "No Products Selected", JOptionPane.ERROR_MESSAGE);
        else if (emptyQuan)
            JOptionPane.showMessageDialog(null, "Purchased Quantity for one or more Products is Empty"
                + "/Zero. Please Try Again!", "Purchased Quantity Empty", JOptionPane.ERROR_MESSAGE);
        else {
            String invoiceTable[][] = new String[prodSelected][5];
            int tableRow = 0;
            for (int row = 0; row < New_Invoice_Table.getRowCount(); row++) {
                if (Boolean.valueOf(New_Invoice_Table.getValueAt(row, 0).toString())) {
                    String prodID = (String) New_Invoice_Table.getValueAt(row, 1);
                    String prodName = (String) New_Invoice_Table.getValueAt(row, 2);
                    String Price = Double.toString((Double) New_Invoice_Table.getValueAt(row, 3));
                    String Quantity = Integer.toString((Integer) New_Invoice_Table.getValueAt(row, 4));
                    String netAmount = Double.toString(Double.parseDouble(Price) *
                        Double.parseDouble(Quantity));
                    saleAmount = Double.toString(Double.parseDouble(saleAmount) +
                        Double.parseDouble(netAmount));
                    invoiceTable[tableRow][0] = prodID;
                    invoiceTable[tableRow][1] = prodName;
                    invoiceTable[tableRow][2] = Price;
                    invoiceTable[tableRow][3] = Quantity;
                    invoiceTable[tableRow][4] = netAmount;
                    tableRow++;
                }
            }
            com.astral.internal.Function.invoicePDF(invID, custName, custContact, custAddress,
                saleDate, saleAmount, prodSelected, invoiceTable);
            try {
                Desktop.getDesktop().open(com.astral.internal.Function.invPath);
            } catch (IOException ex) {
                JOptionPane.showMessageDialog(null, ex, "Error", JOptionPane.ERROR_MESSAGE);
            }
        }
    }//GEN-LAST:event_Create_InvoiceActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Clear_All;
    private javax.swing.JTextField Contact_Number;
    private javax.swing.JLabel Contact_Number_Label;
    private javax.swing.JButton Create_Invoice;
    private javax.swing.JTextField Customer_Address;
    private javax.swing.JLabel Customer_Address_Label;
    private javax.swing.JTextField Customer_Name;
    private javax.swing.JLabel Customer_Name_Label;
    private javax.swing.JButton Edit_List;
    private javax.swing.JLabel Heading;
    private javax.swing.JButton Invoices;
    private javax.swing.JTable New_Invoice_Table;
    private javax.swing.JScrollPane New_Invoice_Table_Container;
    // End of variables declaration//GEN-END:variables
}
