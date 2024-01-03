/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package GroceryManagementSystem;

import java.awt.Window;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import java.sql.*;

/**
 *
 * @author Sahil
 */
public class adminHome extends javax.swing.JFrame {

    /**
     * Creates new form adminHome
     */
    
    public adminHome() {
        
        initComponents();
        //setExtendedState(JFrame.MAXIMIZED_BOTH);
        newUserNotification();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        products = new javax.swing.JButton();
        customers = new javax.swing.JButton();
        staff = new javax.swing.JButton();
        calculator = new javax.swing.JButton();
        notepad = new javax.swing.JButton();
        users = new javax.swing.JButton();
        bills = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Admin Dashboard");
        setUndecorated(true);

        jPanel1.setBackground(new java.awt.Color(0, 0, 0));
        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jPanel2.setBackground(new java.awt.Color(51, 102, 255));

        jLabel1.setFont(new java.awt.Font("Ebrima", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("A D M I N   D A S H B O A R D");

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/icons8-macos-close-32.png"))); // NOI18N
        jLabel2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel2MouseClicked(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Ebrima", 1, 12)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 0, 51));
        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/icons8-back-26.png"))); // NOI18N
        jLabel5.setText("LOG OUT");
        jLabel5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel5MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jLabel1)
                        .addGap(359, 359, 359)))
                .addComponent(jLabel2)
                .addGap(27, 27, 27))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel2)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel5)
                                .addGap(6, 6, 6)))
                        .addGap(0, 14, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );

        products.setBackground(new java.awt.Color(255, 255, 255));
        products.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/icons8-fast-moving-consumer-goods-50.png"))); // NOI18N
        products.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        products.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                productsActionPerformed(evt);
            }
        });

        customers.setBackground(new java.awt.Color(255, 255, 255));
        customers.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/icons8-customer-50.png"))); // NOI18N
        customers.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        customers.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                customersActionPerformed(evt);
            }
        });

        staff.setBackground(new java.awt.Color(255, 255, 255));
        staff.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/icons8-user-groups-50.png"))); // NOI18N
        staff.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        staff.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                staffActionPerformed(evt);
            }
        });

        calculator.setBackground(new java.awt.Color(255, 255, 255));
        calculator.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/icons8-calculator-50.png"))); // NOI18N
        calculator.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        calculator.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                calculatorActionPerformed(evt);
            }
        });

        notepad.setBackground(new java.awt.Color(255, 255, 255));
        notepad.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/icons8-notepad-50.png"))); // NOI18N
        notepad.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        notepad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                notepadActionPerformed(evt);
            }
        });

        users.setBackground(new java.awt.Color(255, 255, 255));
        users.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/icons8-user-30.png"))); // NOI18N
        users.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        users.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                usersActionPerformed(evt);
            }
        });

        bills.setBackground(new java.awt.Color(255, 255, 255));
        bills.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/icons8-paid-bill-50.png"))); // NOI18N
        bills.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        bills.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                billsActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Ebrima", 1, 12)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("PRODUCTS");

        jLabel4.setFont(new java.awt.Font("Ebrima", 1, 12)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("CUSTOMERS");

        jLabel6.setFont(new java.awt.Font("Ebrima", 1, 12)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("STAFF");

        jLabel7.setFont(new java.awt.Font("Ebrima", 1, 12)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("USERS");

        jLabel8.setFont(new java.awt.Font("Ebrima", 1, 12)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("BILLS");

        jLabel9.setFont(new java.awt.Font("Ebrima", 1, 12)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("NOTEPAD");

        jLabel10.setFont(new java.awt.Font("Ebrima", 1, 12)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("CALCULATOR");

        jLabel11.setFont(new java.awt.Font("Ebrima", 1, 14)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setText("NEW USER REQUEST:");

        jLabel12.setFont(new java.awt.Font("Ebrima", 1, 14)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setText("0");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(products, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(12, 12, 12)
                                .addComponent(jLabel3)))
                        .addGap(44, 44, 44)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(customers, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(55, 55, 55)
                                .addComponent(staff, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(63, 63, 63)
                                .addComponent(users, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(59, 59, 59)
                                .addComponent(bills, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(12, 12, 12)
                                .addComponent(jLabel4)
                                .addGap(94, 94, 94)
                                .addComponent(jLabel6)
                                .addGap(121, 121, 121)
                                .addComponent(jLabel7)
                                .addGap(111, 111, 111)
                                .addComponent(jLabel8)))
                        .addGap(56, 56, 56)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(notepad, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(12, 12, 12)
                                .addComponent(jLabel9)))
                        .addGap(56, 56, 56)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(12, 12, 12)
                                .addComponent(jLabel10))
                            .addComponent(calculator, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(188, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jLabel11)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(124, 124, 124))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(46, 46, 46)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(staff, javax.swing.GroupLayout.DEFAULT_SIZE, 63, Short.MAX_VALUE)
                        .addComponent(users, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(bills, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(customers, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(products, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(notepad, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(calculator, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel3)
                        .addComponent(jLabel4)
                        .addComponent(jLabel6)
                        .addComponent(jLabel7)
                        .addComponent(jLabel8))
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel10)
                        .addComponent(jLabel9)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 120, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel12)
                    .addComponent(jLabel11))
                .addGap(179, 179, 179))
        );

        jScrollPane1.setViewportView(jPanel1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 1158, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 507, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void newUserNotification(){
        try{
            Class.forName("com.mysql.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/grocerydb", "root", "");
            String q1 = "select count(user_id) from signup_request";
            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery(q1);
            if(rs.next()){
                jLabel12.setText(String.valueOf(rs.getInt(1)));
            } 
        } catch(Exception e){
            JOptionPane.showMessageDialog(this, e);
        }
    }
    private void productsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_productsActionPerformed
        // TODO add your handling code here:
        this.setVisible(false);
        new controlProducts().setVisible(true);
    }//GEN-LAST:event_productsActionPerformed

    private void calculatorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_calculatorActionPerformed
        // TODO add your handling code here:
        Runtime cal = Runtime.getRuntime();
        try{
            cal.exec("calc");
        } catch(Exception e){
            JOptionPane.showMessageDialog(this, e);
        }
    }//GEN-LAST:event_calculatorActionPerformed

    private void notepadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_notepadActionPerformed
        // TODO add your handling code here:
        Runtime pad = Runtime.getRuntime();
        try{
            pad.exec("notepad");
        } catch(Exception e){
            JOptionPane.showMessageDialog(this, e);
        }
    }//GEN-LAST:event_notepadActionPerformed

    private void customersActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_customersActionPerformed
        // TODO add your handling code here:
        this.setVisible(false);
        new manageCustomers().setVisible(true);
    }//GEN-LAST:event_customersActionPerformed

    private void staffActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_staffActionPerformed
        // TODO add your handling code here:
        this.setVisible(false);
        new manageStaff().setVisible(true);
    }//GEN-LAST:event_staffActionPerformed

    private void jLabel2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel2MouseClicked
        // TODO add your handling code here:
        Window[] windows = Window.getWindows();
        for (Window window : windows) {
        if (window instanceof JFrame) {
            window.dispose();
        }
        }
    }//GEN-LAST:event_jLabel2MouseClicked

    private void jLabel5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel5MouseClicked
        // TODO add your handling code here:
        this.setVisible(false);
        new loginPage().setVisible(true);
        JOptionPane.showMessageDialog(this, "Logout successfully.");
    }//GEN-LAST:event_jLabel5MouseClicked

    private void usersActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_usersActionPerformed
        // TODO add your handling code here:
        this.setVisible(false);
        new manageUsers().setVisible(true);
    }//GEN-LAST:event_usersActionPerformed

    private void billsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_billsActionPerformed
        // TODO add your handling code here:
        this.setVisible(false);
        new manageBills().setVisible(true);
    }//GEN-LAST:event_billsActionPerformed
    
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
                if ("Windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(adminHome.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(adminHome.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(adminHome.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(adminHome.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new adminHome().setVisible(true);
            }
        });
        
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bills;
    private javax.swing.JButton calculator;
    private javax.swing.JButton customers;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton notepad;
    private javax.swing.JButton products;
    private javax.swing.JButton staff;
    private javax.swing.JButton users;
    // End of variables declaration//GEN-END:variables
}
