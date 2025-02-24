/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.mycompany.comprog2_exercise2;

import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author alasacriz
 */
public class CustomerRegForm extends javax.swing.JFrame {

    /**
     * Creates new form CustomerRegForm
     */
    public CustomerRegForm() {
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

        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenu2 = new javax.swing.JMenu();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        customerGender = new javax.swing.JComboBox<>();
        customerName = new javax.swing.JTextField();
        customerID = new javax.swing.JTextField();
        customerAddress = new javax.swing.JTextField();
        customerContact = new javax.swing.JTextField();
        customerEmail = new javax.swing.JTextField();
        customerBirthday = new javax.swing.JTextField();
        filler1 = new javax.swing.Box.Filler(new java.awt.Dimension(0, 0), new java.awt.Dimension(0, 0), new java.awt.Dimension(0, 0));
        buttonSave = new javax.swing.JButton();
        buttonEdit = new javax.swing.JButton();
        buttonDelete = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        customerTable = new javax.swing.JTable();
        jScrollPane2 = new javax.swing.JScrollPane();
        customerTable2 = new javax.swing.JTable();
        addOrder = new javax.swing.JButton();
        deleteOrder = new javax.swing.JButton();
        jMenuBar2 = new javax.swing.JMenuBar();
        menuOpen = new javax.swing.JMenu();
        menuProducts = new javax.swing.JMenuItem();
        menuSuppliers = new javax.swing.JMenuItem();
        menuExit = new javax.swing.JMenuItem();
        menuHelp = new javax.swing.JMenu();

        jMenu1.setText("File");
        jMenuBar1.add(jMenu1);

        jMenu2.setText("Edit");
        jMenuBar1.add(jMenu2);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Helvetica Neue", 0, 18)); // NOI18N
        jLabel1.setText("Customer Registration System");

        jLabel2.setText("Customer ID");

        jLabel3.setText("Customer Name");

        jLabel4.setText("Customer Address");

        jLabel5.setText("Customer Contact #");

        jLabel6.setText("Customer Email");

        jLabel7.setText("Customer Birthday");

        jLabel8.setText("Customer Gender");

        customerGender.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Male", "Female" }));

        customerName.setForeground(new java.awt.Color(153, 153, 153));

        customerID.setEditable(false);
        customerID.setForeground(new java.awt.Color(153, 153, 153));
        customerID.setToolTipText("ID");
        customerID.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                customerIDActionPerformed(evt);
            }
        });

        customerAddress.setForeground(new java.awt.Color(153, 153, 153));

        customerContact.setForeground(new java.awt.Color(153, 153, 153));
        customerContact.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                customerContactActionPerformed(evt);
            }
        });

        customerEmail.setForeground(new java.awt.Color(153, 153, 153));

        customerBirthday.setForeground(new java.awt.Color(153, 153, 153));

        buttonSave.setText("Save");
        buttonSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonSaveActionPerformed(evt);
            }
        });

        buttonEdit.setText("Edit");
        buttonEdit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonEditActionPerformed(evt);
            }
        });

        buttonDelete.setText("Delete");
        buttonDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonDeleteActionPerformed(evt);
            }
        });

        customerTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null}
            },
            new String [] {
                "ID", "Name", "Address", "Contact #", "Email", "Birthday", "Gender"
            }
        ));
        customerTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                customerTableMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(customerTable);
        if (customerTable.getColumnModel().getColumnCount() > 0) {
            customerTable.getColumnModel().getColumn(6).setHeaderValue("Gender");
        }

        customerTable2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "Product ID", "Product Type", "Product Description", "Unit Price", "Quantity", "Total Price"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, true, true, true, true
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        customerTable2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                customerTable2MouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(customerTable2);

        addOrder.setText("Add Order");

        deleteOrder.setText("Delete Order");

        menuOpen.setText("Open");

        menuProducts.setText("Products");
        menuProducts.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuProductsActionPerformed(evt);
            }
        });
        menuOpen.add(menuProducts);

        menuSuppliers.setText("Suppliers");
        menuSuppliers.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuSuppliersActionPerformed(evt);
            }
        });
        menuOpen.add(menuSuppliers);

        menuExit.setText("Exit");
        menuExit.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                menuExitMouseClicked(evt);
            }
        });
        menuExit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuExitActionPerformed(evt);
            }
        });
        menuOpen.add(menuExit);

        jMenuBar2.add(menuOpen);

        menuHelp.setText("Help");
        jMenuBar2.add(menuHelp);

        setJMenuBar(jMenuBar2);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(addOrder)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(deleteOrder))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(buttonSave)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(buttonEdit)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(buttonDelete))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel8)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel4)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel5)
                                    .addComponent(jLabel6)
                                    .addComponent(jLabel7))
                                .addGap(85, 85, 85)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(customerBirthday, javax.swing.GroupLayout.PREFERRED_SIZE, 202, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(customerName)
                                        .addComponent(customerGender, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(customerAddress)
                                        .addComponent(customerContact)
                                        .addComponent(customerEmail, javax.swing.GroupLayout.DEFAULT_SIZE, 201, Short.MAX_VALUE)
                                        .addComponent(customerID, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(183, 183, 183)
                        .addComponent(filler1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 530, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 530, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 219, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 219, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(18, 18, 18)
                        .addComponent(filler1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(33, 33, 33)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(customerID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(customerName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(customerAddress, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(customerContact, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6)
                            .addComponent(customerEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel7)
                            .addComponent(customerBirthday, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel8)
                            .addComponent(customerGender, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(46, 46, 46)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(buttonSave)
                            .addComponent(buttonEdit)
                            .addComponent(buttonDelete))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(addOrder)
                            .addComponent(deleteOrder))))
                .addContainerGap(29, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    // Initialize the array
    String[][] cust = new String[100][7];
    
    // Function definition
    // Refresh the table
    
    public void refreshtable()
    {
        DefaultTableModel cust_table = (DefaultTableModel) customerTable.getModel();
        cust_table.setRowCount(0);
        for(int i = 0; i < cnum; i++)
        {   
            // Prevents the array from printing null values
            if(cust[i][0] != null)
            {
                cust_table.addRow(cust[i]);
            }
        }
        
    }
    
    private int[] collectIDs() 
    {
        DefaultTableModel model = (DefaultTableModel) customerTable.getModel();
        int rowCount = model.getRowCount(); // Get the number of rows in the table
        int[] ids = new int[rowCount]; // Create an array to store IDs

        for (int i = 0; i < rowCount; i++)
        {
            Object idValue = model.getValueAt(i, 0); // Get the value from the first column (ID column)
            if(idValue != null)
            {
                ids[i] = Integer.parseInt(idValue.toString()); // Convert the value to an integer
            }
        }

    return ids;
    }

    
    
    private void customerIDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_customerIDActionPerformed

    }//GEN-LAST:event_customerIDActionPerformed

    private void customerContactActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_customerContactActionPerformed

    }//GEN-LAST:event_customerContactActionPerformed
    
    int cnum = 0;
    private void buttonSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonSaveActionPerformed
      
        
        // Asks the user for confirmation
        int response = JOptionPane.showConfirmDialog(
            this,
            "Do you want to save this entry?",
            "Confirm Save",
            JOptionPane.YES_NO_OPTION
        );
        
        // Checks the user's response
        if(response == JOptionPane.YES_OPTION)
        {
           DefaultTableModel cust_table = (DefaultTableModel) customerTable.getModel(); 
      
            // Clears the table
            if(cnum == 0)
            {
                cust_table.setRowCount(0);
            }

            // Sorts the existing IDs into an array
            int[] existingIDs = collectIDs();

            // Bubble sorts the array
            for(int i = 0; i < existingIDs.length - 1; i++) 
            {
                for(int j = 0; j < existingIDs.length - 1 - i; j++) 
                {
                    if(existingIDs[j] > existingIDs[j + 1]) 
                    {
                        int temp = existingIDs[j];
                        existingIDs[j] = existingIDs[j + 1];
                        existingIDs[j + 1] = temp;
                    }
                }
            }


            // Finds the smallest missing ID
            int newID = 1; // Starts the ID from 1
            for (int i = 0; i < existingIDs.length; i++)
            {
                int id = existingIDs[i];
                if(id == newID)
                {
                    newID++; // Increment if no gap is found
                }
                else if(id > newID)
                {
                    break; // If gap is found
                }
            }

            // Sets the new ID in the text field and array
            customerID.setText(String.valueOf(newID));
            cust[cnum][0] = String.valueOf(newID);

            // Gets data from input
            cust[cnum][1] = customerName.getText();
            cust[cnum][2] = customerAddress.getText();
            cust[cnum][3] = customerContact.getText();
            cust[cnum][4] = customerEmail.getText();
            cust[cnum][5] = customerBirthday.getText();
            cust[cnum][6] = (String) customerGender.getSelectedItem();

            // Adds rows to the array
            cust_table.addRow(cust[cnum]);

            // Increments the counter
            cnum++;
        }
        else
        {
            JOptionPane.showMessageDialog(
                this,
                "Save operation canceled.",
                "Save Canceled",
                JOptionPane.INFORMATION_MESSAGE
            );
        }
    }//GEN-LAST:event_buttonSaveActionPerformed
    private void buttonEditActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonEditActionPerformed
        
        // Asks the user for confirmation
        int response = JOptionPane.showConfirmDialog(
            this,
            "Do you want to modify this entry?",
            "Confirm Edit",
            JOptionPane.YES_NO_OPTION
        );
        
        // Checks the user's response
        if(response == JOptionPane.YES_OPTION)
        {
        
            // Searches the ID
            for(int i = 0; i < cnum; i++)
            {
                if(customerID.getText().equals(cust[i][0]))
                {
                    cust[i][1] = customerName.getText();
                    cust[i][2] = customerAddress.getText();
                    cust[i][3] = customerContact.getText();
                    cust[i][4] = customerEmail.getText();
                    cust[i][5] = customerBirthday.getText();
                    cust[i][6] = (String) customerGender.getSelectedItem();
                }
            }
            // Calls the refreshtable() function
            refreshtable();
        }
        else
        {
            JOptionPane.showMessageDialog(
                this,
                "No changes were made.",
                "Edit Canceled",
                JOptionPane.INFORMATION_MESSAGE
            );
        }
    }//GEN-LAST:event_buttonEditActionPerformed
 
    private void buttonDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonDeleteActionPerformed
    
        // Asks the user for confirmation
        int response = JOptionPane.showConfirmDialog(
            this,
            "Do you want to delete this entry?",
            "Confirm Save",
            JOptionPane.YES_NO_OPTION
        );
        
        // Checks the user's response
        if(response == JOptionPane.YES_OPTION)
        {
            // Pop-Up Confirmation
            JOptionPane.showMessageDialog(
                this,
                "Deleted one item successfully.",
                "Entry Deleted",
                JOptionPane.INFORMATION_MESSAGE
            );
            
            // Performs a search for the row that's going to be deleted
            for(int x = 0; x < cnum; x++)
            {
                int y = x;
                if(cust[x][0].equals(customerID.getText()))
                {
                    while(y < cnum)
                    {
                        cust[y][0] = cust[y + 1][0];
                        cust[y][1] = cust[y + 1][1];
                        cust[y][2] = cust[y + 1][2];
                        cust[y][3] = cust[y + 1][3];
                        cust[y][4] = cust[y + 1][4];
                        cust[y][5] = cust[y + 1][5];
                        y++;
                    }
                    break;
                }
            }
            cnum--;
            refreshtable();
        }
        else
        {
            JOptionPane.showMessageDialog(
                this,
                "Nothing was deleted.",
                "Delete Canceled",
                JOptionPane.INFORMATION_MESSAGE
            );
        }
    }//GEN-LAST:event_buttonDeleteActionPerformed

    private void customerTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_customerTableMouseClicked
        int[] selectedRow = customerTable.getSelectedRows();
        
        customerID.setText(customerTable.getValueAt(selectedRow[0], 0).toString());
        customerName.setText(customerTable.getValueAt(selectedRow[0], 1).toString());
        customerAddress.setText(customerTable.getValueAt(selectedRow[0], 2).toString());
        customerContact.setText(customerTable.getValueAt(selectedRow[0], 3).toString());
        customerEmail.setText(customerTable.getValueAt(selectedRow[0], 4).toString());
        customerBirthday.setText(customerTable.getValueAt(selectedRow[0], 5).toString());
       
        
    }//GEN-LAST:event_customerTableMouseClicked

    private void menuSuppliersActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuSuppliersActionPerformed
            SupplierForm suppliersForm = new SupplierForm();
        suppliersForm.show();
    }//GEN-LAST:event_menuSuppliersActionPerformed

    private void menuExitMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_menuExitMouseClicked
        System.exit(0);
    }//GEN-LAST:event_menuExitMouseClicked

    private void menuProductsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuProductsActionPerformed
            ProductsForm productsForm = new ProductsForm();
        productsForm.show(); 
    }//GEN-LAST:event_menuProductsActionPerformed

    private void menuExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuExitActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_menuExitActionPerformed

    private void customerTable2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_customerTable2MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_customerTable2MouseClicked

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(CustomerRegForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CustomerRegForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CustomerRegForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CustomerRegForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CustomerRegForm().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addOrder;
    private javax.swing.JButton buttonDelete;
    private javax.swing.JButton buttonEdit;
    private javax.swing.JButton buttonSave;
    private javax.swing.JTextField customerAddress;
    private javax.swing.JTextField customerBirthday;
    private javax.swing.JTextField customerContact;
    private javax.swing.JTextField customerEmail;
    private javax.swing.JComboBox<String> customerGender;
    private javax.swing.JTextField customerID;
    private javax.swing.JTextField customerName;
    private javax.swing.JTable customerTable;
    private javax.swing.JTable customerTable2;
    private javax.swing.JButton deleteOrder;
    private javax.swing.Box.Filler filler1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuBar jMenuBar2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JMenuItem menuExit;
    private javax.swing.JMenu menuHelp;
    private javax.swing.JMenu menuOpen;
    private javax.swing.JMenuItem menuProducts;
    private javax.swing.JMenuItem menuSuppliers;
    // End of variables declaration//GEN-END:variables
}
