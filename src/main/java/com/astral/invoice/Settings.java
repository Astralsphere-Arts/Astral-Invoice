package com.astral.invoice;

import javax.swing.JOptionPane;

/**
 *
 * @author Astralsphere Arts
 */
public class Settings extends javax.swing.JPanel {

    /**
     * Creates new form Settings
     */
    public Settings() {
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

        Heading_Icon_Before = new javax.swing.JLabel();
        Heading = new javax.swing.JLabel();
        Current_Value_Label = new javax.swing.JLabel();
        New_Value_Label = new javax.swing.JLabel();
        Business_Name_Label = new javax.swing.JLabel();
        Current_Business_Name = new javax.swing.JTextField();
        New_Business_Name = new javax.swing.JTextField();
        Business_Owner_Label = new javax.swing.JLabel();
        Current_Business_Owner = new javax.swing.JTextField();
        New_Business_Owner = new javax.swing.JTextField();
        Contact_Number_Label = new javax.swing.JLabel();
        Current_Contact_Number = new javax.swing.JTextField();
        New_Contact_Number = new javax.swing.JTextField();
        Email_Address_Label = new javax.swing.JLabel();
        Current_Email_Address = new javax.swing.JTextField();
        New_Email_Address = new javax.swing.JTextField();
        Current_Business_Location_Label = new javax.swing.JLabel();
        Current_Business_Location = new javax.swing.JTextField();
        New_Business_Location_Label = new javax.swing.JLabel();
        New_Business_Location = new javax.swing.JTextField();
        Save_Changes_Button = new javax.swing.JButton();

        Heading_Icon_Before.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        Heading_Icon_Before.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/astral/resources/app-icon-45x45.png"))); // NOI18N

        Heading.setFont(new java.awt.Font("Segoe UI Semilight", 1, 24)); // NOI18N
        Heading.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        Heading.setText("Settings");

        Current_Value_Label.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        Current_Value_Label.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Current_Value_Label.setText("Current");
        Current_Value_Label.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        New_Value_Label.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        New_Value_Label.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        New_Value_Label.setText("New");
        New_Value_Label.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        Business_Name_Label.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        Business_Name_Label.setText("Business Name");

        Current_Business_Name.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        Current_Business_Name.setText(com.astral.internal.SQLite.getConfigValue("Business Name"));
        Current_Business_Name.setEnabled(false);

        New_Business_Name.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

        Business_Owner_Label.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        Business_Owner_Label.setText("Business Owner's Name");

        Current_Business_Owner.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        Current_Business_Owner.setText(com.astral.internal.SQLite.getConfigValue("Business Owner Name"));
        Current_Business_Owner.setEnabled(false);

        New_Business_Owner.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

        Contact_Number_Label.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        Contact_Number_Label.setText("Contact Number");

        Current_Contact_Number.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        Current_Contact_Number.setText(com.astral.internal.SQLite.getConfigValue("Contact Number"));
        Current_Contact_Number.setEnabled(false);

        New_Contact_Number.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        New_Contact_Number.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                New_Contact_NumberKeyPressed(evt);
            }
        });

        Email_Address_Label.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        Email_Address_Label.setText("Email Address");

        Current_Email_Address.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        Current_Email_Address.setText(com.astral.internal.SQLite.getConfigValue("Email Address"));
        Current_Email_Address.setEnabled(false);

        New_Email_Address.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

        Current_Business_Location_Label.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        Current_Business_Location_Label.setText("Business Location (Current)");

        Current_Business_Location.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        Current_Business_Location.setText(com.astral.internal.SQLite.getConfigValue("Business Location"));
        Current_Business_Location.setEnabled(false);

        New_Business_Location_Label.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        New_Business_Location_Label.setText("Business Location (New)");

        New_Business_Location.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

        Save_Changes_Button.setText("Save Changes");
        Save_Changes_Button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Save_Changes_ButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(45, 45, 45)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(Business_Owner_Label, javax.swing.GroupLayout.PREFERRED_SIZE, 260, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(Current_Business_Owner, javax.swing.GroupLayout.PREFERRED_SIZE, 280, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(New_Business_Owner))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(Current_Business_Location_Label, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 260, Short.MAX_VALUE)
                                    .addComponent(New_Business_Location_Label, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 260, Short.MAX_VALUE)
                                    .addComponent(Email_Address_Label, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 260, Short.MAX_VALUE)
                                    .addComponent(Contact_Number_Label, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 260, Short.MAX_VALUE)
                                    .addComponent(Business_Name_Label, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 260, Short.MAX_VALUE))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(Current_Contact_Number, javax.swing.GroupLayout.PREFERRED_SIZE, 280, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(Current_Business_Name, javax.swing.GroupLayout.PREFERRED_SIZE, 280, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(Current_Email_Address, javax.swing.GroupLayout.PREFERRED_SIZE, 280, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(18, 18, 18)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(New_Business_Name, javax.swing.GroupLayout.PREFERRED_SIZE, 280, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(New_Contact_Number, javax.swing.GroupLayout.PREFERRED_SIZE, 280, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(New_Email_Address, javax.swing.GroupLayout.PREFERRED_SIZE, 280, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addComponent(Current_Business_Location)
                                    .addComponent(New_Business_Location)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(Current_Value_Label, javax.swing.GroupLayout.PREFERRED_SIZE, 280, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(New_Value_Label, javax.swing.GroupLayout.PREFERRED_SIZE, 280, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(Heading_Icon_Before)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(Heading, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(406, 406, 406)
                        .addComponent(Save_Changes_Button, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(53, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(Heading_Icon_Before, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(Heading, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(New_Value_Label, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Current_Value_Label, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Business_Name_Label, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Current_Business_Name)
                    .addComponent(New_Business_Name))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Business_Owner_Label, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Current_Business_Owner, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(New_Business_Owner, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Contact_Number_Label, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Current_Contact_Number)
                    .addComponent(New_Contact_Number))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Email_Address_Label, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Current_Email_Address, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(New_Email_Address, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Current_Business_Location, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Current_Business_Location_Label, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(New_Business_Location, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(New_Business_Location_Label, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(32, 32, 32)
                .addComponent(Save_Changes_Button, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(157, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void New_Contact_NumberKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_New_Contact_NumberKeyPressed
        String Number = New_Contact_Number.getText();
        int length = Number.length();
        if (evt.getKeyChar() >= '0' && evt.getKeyChar() <= '9') {
            if (length < 10)
                New_Contact_Number.setEditable(true);
            else
                New_Contact_Number.setEditable(false);
        } else {
            switch (evt.getExtendedKeyCode()) {
                case java.awt.event.KeyEvent.VK_BACK_SPACE -> New_Contact_Number.setEditable(true);
                case java.awt.event.KeyEvent.VK_DELETE -> New_Contact_Number.setEditable(true);
                default -> New_Contact_Number.setEditable(false);
            }
        }
    }//GEN-LAST:event_New_Contact_NumberKeyPressed

    private void Save_Changes_ButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Save_Changes_ButtonActionPerformed
        String ownerName = New_Business_Owner.getText();
        String bizName = New_Business_Name.getText();
        String bizNumber = New_Contact_Number.getText();
        String bizMail = New_Email_Address.getText();
        String bizAddress = New_Business_Location.getText();
        if (ownerName.equals("") && bizName.equals("") && bizNumber.equals("") &&
            bizMail.equals("") && bizAddress.equals(""))
            JOptionPane.showMessageDialog(null, "You haven't made any Changes. Please"
                + " Try Again!", "No Changes Found", JOptionPane.ERROR_MESSAGE);
        else if (!bizNumber.equals("") && bizNumber.length() != 10)
            JOptionPane.showMessageDialog(null, "Contact Number Must be 10 Digit Long. Please"
                + " Try Again!", "Contact Number Too Short", JOptionPane.ERROR_MESSAGE);
        else {
            if (ownerName.equals(""))
                ownerName = Current_Business_Owner.getText();
            if (bizName.equals(""))
                bizName = Current_Business_Name.getText();
            if (bizNumber.equals(""))
                bizNumber = Current_Contact_Number.getText();
            if (bizMail.equals(""))
                bizMail = Current_Email_Address.getText();
            if (bizAddress.equals(""))
                bizAddress = Current_Business_Location.getText();
            com.astral.internal.SQLite.setConfigData(ownerName, bizName, bizNumber, bizMail, bizAddress);
            JOptionPane.showMessageDialog(null, "Your Changes Have Been Saved Successfully!",
                "Success", JOptionPane.INFORMATION_MESSAGE);
            com.astral.invoice.Main.Load_Settings();
        }
    }//GEN-LAST:event_Save_Changes_ButtonActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Business_Name_Label;
    private javax.swing.JLabel Business_Owner_Label;
    private javax.swing.JLabel Contact_Number_Label;
    private javax.swing.JTextField Current_Business_Location;
    private javax.swing.JLabel Current_Business_Location_Label;
    private javax.swing.JTextField Current_Business_Name;
    private javax.swing.JTextField Current_Business_Owner;
    private javax.swing.JTextField Current_Contact_Number;
    private javax.swing.JTextField Current_Email_Address;
    private javax.swing.JLabel Current_Value_Label;
    private javax.swing.JLabel Email_Address_Label;
    private javax.swing.JLabel Heading;
    private javax.swing.JLabel Heading_Icon_Before;
    private javax.swing.JTextField New_Business_Location;
    private javax.swing.JLabel New_Business_Location_Label;
    private javax.swing.JTextField New_Business_Name;
    private javax.swing.JTextField New_Business_Owner;
    private javax.swing.JTextField New_Contact_Number;
    private javax.swing.JTextField New_Email_Address;
    private javax.swing.JLabel New_Value_Label;
    private javax.swing.JButton Save_Changes_Button;
    // End of variables declaration//GEN-END:variables
}
