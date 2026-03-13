package BurgerShop.view;

import BurgerShop.controller.BurgerController;
import BurgerShop.model.BurgerOrder;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class PlaceOrderForme extends javax.swing.JFrame {

    public PlaceOrderForme() throws FileNotFoundException {
        initComponents();
        orderIdTxt.setEditable(false);
        orderIdTxt.setText(BurgerController.generateOrderId());
        txtCustomerId.requestFocus();
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton3 = new javax.swing.JButton();
        jPanel8 = new javax.swing.JPanel();
        jPanel7 = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        orderIdTxt = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        txtCustomerId = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        txtCustomerName = new javax.swing.JTextField();
        txtBurgerQuntity = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        cbOrderStatus = new javax.swing.JComboBox<>();
        cancelButton = new javax.swing.JButton();
        btnHomePage = new javax.swing.JButton();
        btnPlaceOrder = new javax.swing.JButton();
        jLabel15 = new javax.swing.JLabel();
        lblTotal = new javax.swing.JLabel();

        jButton3.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jButton3.setText("Place Order");
        jButton3.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Place Order Form");
        setResizable(false);

        jPanel7.setBackground(new java.awt.Color(255, 102, 0));

        jLabel9.setBackground(new java.awt.Color(255, 102, 0));
        jLabel9.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel9.setText("Place Order");

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 6, Short.MAX_VALUE))
        );

        jLabel10.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel10.setText("Order ID                    :");

        orderIdTxt.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        orderIdTxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                orderIdTxtActionPerformed(evt);
            }
        });

        jLabel11.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel11.setText("Customer ID               :");

        txtCustomerId.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        txtCustomerId.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCustomerIdActionPerformed(evt);
            }
        });
        txtCustomerId.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtCustomerIdKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtCustomerIdKeyTyped(evt);
            }
        });

        jLabel12.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel12.setText("Customer Name        :");

        txtCustomerName.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        txtCustomerName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCustomerNameActionPerformed(evt);
            }
        });
        txtCustomerName.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtCustomerNameKeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtCustomerNameKeyTyped(evt);
            }
        });

        txtBurgerQuntity.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        txtBurgerQuntity.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtBurgerQuntityActionPerformed(evt);
            }
        });
        txtBurgerQuntity.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtBurgerQuntityKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtBurgerQuntityKeyTyped(evt);
            }
        });

        jLabel13.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel13.setText("Burger Quantity        :");

        jLabel14.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel14.setText("Order Status               :");

        cbOrderStatus.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        cbOrderStatus.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Preparing", "Delivered" }));
        cbOrderStatus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbOrderStatusActionPerformed(evt);
            }
        });
        cbOrderStatus.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                cbOrderStatusKeyTyped(evt);
            }
        });

        cancelButton.setBackground(new java.awt.Color(255, 51, 51));
        cancelButton.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        cancelButton.setForeground(new java.awt.Color(255, 255, 255));
        cancelButton.setText("Cancel");
        cancelButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelButtonActionPerformed(evt);
            }
        });

        btnHomePage.setBackground(new java.awt.Color(255, 102, 0));
        btnHomePage.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnHomePage.setForeground(new java.awt.Color(255, 255, 255));
        btnHomePage.setText("Back to Home Page");
        btnHomePage.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnHomePageActionPerformed(evt);
            }
        });

        btnPlaceOrder.setBackground(new java.awt.Color(0, 204, 51));
        btnPlaceOrder.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnPlaceOrder.setForeground(new java.awt.Color(255, 255, 255));
        btnPlaceOrder.setText("Place Order");
        btnPlaceOrder.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPlaceOrderActionPerformed(evt);
            }
        });

        jLabel15.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel15.setText("Net Total   : ");

        lblTotal.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lblTotal.setForeground(new java.awt.Color(255, 102, 102));
        lblTotal.setText("Rs.0.00");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel13)
                                .addComponent(jLabel12)
                                .addComponent(jLabel11))
                            .addGap(20, 20, 20))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                            .addComponent(jLabel14)
                            .addGap(18, 18, 18)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel10)
                        .addGap(24, 24, 24)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(cbOrderStatus, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtBurgerQuntity, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtCustomerName, javax.swing.GroupLayout.PREFERRED_SIZE, 218, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtCustomerId, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(orderIdTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 38, Short.MAX_VALUE)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(cancelButton, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 193, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnHomePage, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 193, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnPlaceOrder, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 193, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel15)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblTotal)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(54, 54, 54)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnPlaceOrder, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnHomePage, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(10, 10, 10))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel10)
                            .addComponent(orderIdTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(20, 20, 20)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel11)
                            .addComponent(txtCustomerId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel12)
                            .addComponent(txtCustomerName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(16, 16, 16)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel13)
                            .addComponent(txtBurgerQuntity, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel14)
                            .addComponent(cbOrderStatus, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(8, 8, 8)
                        .addComponent(cancelButton, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel15)
                            .addComponent(lblTotal))))
                .addContainerGap(56, Short.MAX_VALUE))
        );

        layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {jLabel10, orderIdTxt});

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void orderIdTxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_orderIdTxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_orderIdTxtActionPerformed

    private void txtCustomerIdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCustomerIdActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCustomerIdActionPerformed

    private void txtCustomerNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCustomerNameActionPerformed
        txtBurgerQuntity.requestFocus();
    }//GEN-LAST:event_txtCustomerNameActionPerformed

    private void txtBurgerQuntityActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtBurgerQuntityActionPerformed
        if (Integer.parseInt(txtBurgerQuntity.getText())==0){
            JOptionPane.showMessageDialog(this,"Burger quantity must be greater than 0");
            txtBurgerQuntity.setText("");
            txtBurgerQuntity.requestFocus();
        }
    }//GEN-LAST:event_txtBurgerQuntityActionPerformed

    private void cancelButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelButtonActionPerformed
        txtCustomerId.setText("");
        txtCustomerId.requestFocus();
        txtCustomerName.setText("");
        txtCustomerName.setEditable(true);
        txtBurgerQuntity.setText("");
        cbOrderStatus.setSelectedIndex(0);
        lblTotal.setText("Rs.0.00");
    }//GEN-LAST:event_cancelButtonActionPerformed

    private void btnHomePageActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHomePageActionPerformed
        dispose();
    }//GEN-LAST:event_btnHomePageActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton3ActionPerformed

    private void btnPlaceOrderActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPlaceOrderActionPerformed
        if (Integer.parseInt(txtBurgerQuntity.getText())==0){
            JOptionPane.showMessageDialog(this,"Burger quantity must be greater than 0");
            txtBurgerQuntity.setText("");
            txtBurgerQuntity.requestFocus();
        }
        if (txtCustomerId.getText().isEmpty()||txtCustomerName.getText().isEmpty()||txtBurgerQuntity.getText().isEmpty()) {
            JOptionPane.showMessageDialog(this,"Please fill all details before placing the order!");
        }else{
            try {
                String orderId = orderIdTxt.getText();
                String customerId = txtCustomerId.getText();
                String customerName = txtCustomerName.getText();
                int burgerQuntity = Integer.parseInt(txtBurgerQuntity.getText());
                double totalAmount = burgerQuntity*BurgerOrder.getBURGER_PRICE();
                int orderStatus;
                
                if(cbOrderStatus.getSelectedItem().toString().equalsIgnoreCase("Preparing")){
                    orderStatus = BurgerOrder.getPREPARING();
                }else{
                    orderStatus = BurgerOrder.getDELIVERED();
                }
                
                int rep = JOptionPane.showConfirmDialog(this,"Confirm Order","order",JOptionPane.YES_NO_OPTION);
                if (rep==JOptionPane.NO_OPTION) {
                    orderStatus = BurgerOrder.getCANCEL();
                }else{
                    JOptionPane.showMessageDialog(this,"Added success");
                }
                
                BurgerOrder burger = new BurgerOrder(orderId, customerId, customerName, burgerQuntity, orderStatus);
                try {
                    BurgerController.addBurger(burger);
                } catch (IOException ex) {
                    Logger.getLogger(PlaceOrderForme.class.getName()).log(Level.SEVERE, null, ex);
                }
                
                orderIdTxt.setText(BurgerController.generateOrderId());
                txtCustomerId.setText("");
                txtCustomerId.requestFocus();
                txtCustomerName.setText("");
                txtCustomerName.setEditable(true);
                txtBurgerQuntity.setText("");
                cbOrderStatus.setSelectedIndex(0);
                lblTotal.setText("Rs.0.00");
            } catch (FileNotFoundException ex) {
                Logger.getLogger(PlaceOrderForme.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }//GEN-LAST:event_btnPlaceOrderActionPerformed

    private void txtCustomerIdKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtCustomerIdKeyTyped
        char ch = evt.getKeyChar();
        
        if (!Character.isDigit(ch)){
            evt.consume();
        }
        
        if (txtCustomerId.getText().isEmpty() && ch!='0') {
            evt.consume();
            JOptionPane.showMessageDialog(this,"The customer id must start with 0");
        }        
    }//GEN-LAST:event_txtCustomerIdKeyTyped
 
    private void txtBurgerQuntityKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtBurgerQuntityKeyTyped
        char ch = evt.getKeyChar();
        if (!Character.isDigit(ch)) {
            evt.consume();
        }  
        
    }//GEN-LAST:event_txtBurgerQuntityKeyTyped

    private void txtBurgerQuntityKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtBurgerQuntityKeyReleased
        double total=0;
        if (txtBurgerQuntity.getText().isEmpty()) {
            lblTotal.setText("Rs.0.00");
        }else{
            total=Integer.parseInt(txtBurgerQuntity.getText())*BurgerOrder.getBURGER_PRICE();
            lblTotal.setText("Rs."+total);
        }
    }//GEN-LAST:event_txtBurgerQuntityKeyReleased

    private void txtCustomerIdKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtCustomerIdKeyReleased
        if (txtCustomerId.getText().length()==10) {
            
            try {
                if (BurgerController.hasFile()) {
                    txtCustomerName.requestFocus();
                }
                
                String customerName = BurgerController.getCustomerName(txtCustomerId.getText());
                if (customerName!=null) {
                    int rep = JOptionPane.showConfirmDialog(this,"User conformed "+customerName,"Customer name",JOptionPane.YES_NO_OPTION);
                    
                    if (rep == JOptionPane.YES_OPTION){
                        txtCustomerName.setText(customerName);
                        txtCustomerName.setEditable(false);
                        txtBurgerQuntity.requestFocus();
                    }else{
                        txtCustomerId.setText("");
                    }
                }else{
                    JOptionPane.showMessageDialog(this,"Add cutomer ID");
                    txtCustomerName.requestFocus();
                }      
            } catch (FileNotFoundException ex) {
                Logger.getLogger(PlaceOrderForme.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }//GEN-LAST:event_txtCustomerIdKeyReleased
    
    private void cbOrderStatusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbOrderStatusActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbOrderStatusActionPerformed

    private void cbOrderStatusKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_cbOrderStatusKeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_cbOrderStatusKeyTyped

    private void txtCustomerNameKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtCustomerNameKeyPressed

    }//GEN-LAST:event_txtCustomerNameKeyPressed

    private void txtCustomerNameKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtCustomerNameKeyTyped
        if (txtCustomerId.getText().length()!=10) {
            evt.consume();
            JOptionPane.showMessageDialog(this,"Customer id must be 10 digits");
            txtCustomerId.requestFocus();
        }
    }//GEN-LAST:event_txtCustomerNameKeyTyped

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnHomePage;
    private javax.swing.JButton btnPlaceOrder;
    private javax.swing.JButton cancelButton;
    private javax.swing.JComboBox<String> cbOrderStatus;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JLabel lblTotal;
    private javax.swing.JTextField orderIdTxt;
    private javax.swing.JTextField txtBurgerQuntity;
    private javax.swing.JTextField txtCustomerId;
    private javax.swing.JTextField txtCustomerName;
    // End of variables declaration//GEN-END:variables

    
}
