/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rss.gui;

import java.awt.Color;
import javax.swing.JOptionPane;
import rss.solution.*;

/**
 *
 * @author Admin
 */
public class AdminHome extends javax.swing.JFrame {

    /**
     * Creates new form AdminHome
     */
    public AdminHome() {
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

        pnlMenu = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        tabHome = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        tabProduct = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        tabOrder = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        tabSignout = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        pnlProduct = new javax.swing.JPanel();
        pnlOrder = new javax.swing.JPanel();
        pnlNewAdmin = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        lblAccType = new javax.swing.JLabel();
        txtUser = new javax.swing.JTextField();
        txtPhone = new javax.swing.JTextField();
        txtEmail = new javax.swing.JTextField();
        txtPass = new javax.swing.JTextField();
        btnRegister = new javax.swing.JButton();
        btnBack = new javax.swing.JButton();
        jLabel13 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setLocation(new java.awt.Point(300, 100));
        setMinimumSize(new java.awt.Dimension(800, 500));
        setPreferredSize(new java.awt.Dimension(800, 500));

        pnlMenu.setBackground(new java.awt.Color(153, 204, 255));
        pnlMenu.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 14)); // NOI18N
        pnlMenu.setName(""); // NOI18N
        pnlMenu.setPreferredSize(new java.awt.Dimension(200, 500));
        pnlMenu.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 14)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Welcome back");
        pnlMenu.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 150, 150, -1));

        tabHome.setBackground(new java.awt.Color(204, 204, 204));
        tabHome.setPreferredSize(new java.awt.Dimension(0, 60));
        tabHome.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tabHomeMouseClicked(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 14)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Add Admin Account");

        javax.swing.GroupLayout tabHomeLayout = new javax.swing.GroupLayout(tabHome);
        tabHome.setLayout(tabHomeLayout);
        tabHomeLayout.setHorizontalGroup(
            tabHomeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, tabHomeLayout.createSequentialGroup()
                .addContainerGap(37, Short.MAX_VALUE)
                .addComponent(jLabel3)
                .addGap(29, 29, 29))
        );
        tabHomeLayout.setVerticalGroup(
            tabHomeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(tabHomeLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, 38, Short.MAX_VALUE)
                .addContainerGap())
        );

        pnlMenu.add(tabHome, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 280, 200, -1));

        tabProduct.setBackground(new java.awt.Color(204, 204, 204));
        tabProduct.setPreferredSize(new java.awt.Dimension(0, 60));
        tabProduct.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tabProductMouseClicked(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 14)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Manage Product");

        javax.swing.GroupLayout tabProductLayout = new javax.swing.GroupLayout(tabProduct);
        tabProduct.setLayout(tabProductLayout);
        tabProductLayout.setHorizontalGroup(
            tabProductLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, tabProductLayout.createSequentialGroup()
                .addContainerGap(43, Short.MAX_VALUE)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(39, 39, 39))
        );
        tabProductLayout.setVerticalGroup(
            tabProductLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(tabProductLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, 38, Short.MAX_VALUE)
                .addContainerGap())
        );

        pnlMenu.add(tabProduct, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 350, 200, -1));

        tabOrder.setBackground(new java.awt.Color(204, 204, 204));
        tabOrder.setPreferredSize(new java.awt.Dimension(0, 60));
        tabOrder.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tabOrderMouseClicked(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 14)); // NOI18N
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("View Order List");

        javax.swing.GroupLayout tabOrderLayout = new javax.swing.GroupLayout(tabOrder);
        tabOrder.setLayout(tabOrderLayout);
        tabOrderLayout.setHorizontalGroup(
            tabOrderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, tabOrderLayout.createSequentialGroup()
                .addContainerGap(43, Short.MAX_VALUE)
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(39, 39, 39))
        );
        tabOrderLayout.setVerticalGroup(
            tabOrderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(tabOrderLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, 38, Short.MAX_VALUE)
                .addContainerGap())
        );

        pnlMenu.add(tabOrder, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 210, 200, -1));

        tabSignout.setBackground(new java.awt.Color(204, 204, 204));
        tabSignout.setPreferredSize(new java.awt.Dimension(0, 60));
        tabSignout.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tabSignoutMouseClicked(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 14)); // NOI18N
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("Sign Out");

        javax.swing.GroupLayout tabSignoutLayout = new javax.swing.GroupLayout(tabSignout);
        tabSignout.setLayout(tabSignoutLayout);
        tabSignoutLayout.setHorizontalGroup(
            tabSignoutLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, tabSignoutLayout.createSequentialGroup()
                .addContainerGap(43, Short.MAX_VALUE)
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(39, 39, 39))
        );
        tabSignoutLayout.setVerticalGroup(
            tabSignoutLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(tabSignoutLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, 38, Short.MAX_VALUE)
                .addContainerGap())
        );

        pnlMenu.add(tabSignout, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 420, 200, -1));

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/shopicon.jpg"))); // NOI18N
        pnlMenu.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 30, 100, 100));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setMinimumSize(new java.awt.Dimension(600, 510));
        jPanel1.setPreferredSize(new java.awt.Dimension(600, 0));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        pnlProduct.setBackground(new java.awt.Color(255, 204, 204));

        javax.swing.GroupLayout pnlProductLayout = new javax.swing.GroupLayout(pnlProduct);
        pnlProduct.setLayout(pnlProductLayout);
        pnlProductLayout.setHorizontalGroup(
            pnlProductLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 600, Short.MAX_VALUE)
        );
        pnlProductLayout.setVerticalGroup(
            pnlProductLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 510, Short.MAX_VALUE)
        );

        jPanel1.add(pnlProduct, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 600, 510));

        pnlOrder.setBackground(new java.awt.Color(255, 255, 204));

        javax.swing.GroupLayout pnlOrderLayout = new javax.swing.GroupLayout(pnlOrder);
        pnlOrder.setLayout(pnlOrderLayout);
        pnlOrderLayout.setHorizontalGroup(
            pnlOrderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 600, Short.MAX_VALUE)
        );
        pnlOrderLayout.setVerticalGroup(
            pnlOrderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 510, Short.MAX_VALUE)
        );

        jPanel1.add(pnlOrder, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 600, 510));

        pnlNewAdmin.setBackground(new java.awt.Color(204, 255, 255));

        jPanel2.setMinimumSize(new java.awt.Dimension(600, 504));
        jPanel2.setPreferredSize(new java.awt.Dimension(600, 500));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel7.setFont(new java.awt.Font("Elephant", 2, 36)); // NOI18N
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setText("New Admin");
        jPanel2.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 30, 420, 60));

        jLabel8.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 18)); // NOI18N
        jLabel8.setText("Username : ");
        jPanel2.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 110, -1, -1));

        jLabel9.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 18)); // NOI18N
        jLabel9.setText("Phone no. : ");
        jPanel2.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 150, -1, -1));

        jLabel10.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 18)); // NOI18N
        jLabel10.setText("E-mail        : ");
        jPanel2.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 190, -1, -1));

        jLabel11.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 18)); // NOI18N
        jLabel11.setText("Password  :");
        jPanel2.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 230, -1, -1));

        jLabel12.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 18)); // NOI18N
        jLabel12.setText("Account Type : ");
        jPanel2.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 280, -1, -1));

        lblAccType.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 14)); // NOI18N
        lblAccType.setText("admin");
        jPanel2.add(lblAccType, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 280, 128, 28));
        jPanel2.add(txtUser, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 110, 220, 25));

        txtPhone.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtPhoneKeyTyped(evt);
            }
        });
        jPanel2.add(txtPhone, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 150, 220, 25));
        jPanel2.add(txtEmail, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 190, 220, 25));
        jPanel2.add(txtPass, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 230, 220, 25));

        btnRegister.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 14)); // NOI18N
        btnRegister.setText("Add");
        btnRegister.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnRegisterMouseClicked(evt);
            }
        });
        jPanel2.add(btnRegister, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 380, 160, 50));

        btnBack.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 14)); // NOI18N
        btnBack.setText("Back");
        btnBack.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnBackMouseClicked(evt);
            }
        });
        jPanel2.add(btnBack, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 380, 160, 50));

        jLabel13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/register.png"))); // NOI18N
        jLabel13.setPreferredSize(new java.awt.Dimension(600, 500));
        jPanel2.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 4, 600, 500));

        javax.swing.GroupLayout pnlNewAdminLayout = new javax.swing.GroupLayout(pnlNewAdmin);
        pnlNewAdmin.setLayout(pnlNewAdminLayout);
        pnlNewAdminLayout.setHorizontalGroup(
            pnlNewAdminLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        pnlNewAdminLayout.setVerticalGroup(
            pnlNewAdminLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        jPanel1.add(pnlNewAdmin, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 600, 510));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(pnlMenu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(pnlMenu, javax.swing.GroupLayout.DEFAULT_SIZE, 510, Short.MAX_VALUE)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void tabHomeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabHomeMouseClicked
        pnlNewAdmin.setVisible(true);
        pnlOrder.setVisible(false);
        pnlProduct.setVisible(false);
        tabHome.setBackground(Color.WHITE);
        tabProduct.setBackground(new Color (204,204,204));
        tabOrder.setBackground(new Color (204,204,204));
        tabSignout.setBackground(new Color (204,204,204));
    }//GEN-LAST:event_tabHomeMouseClicked

    private void tabProductMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabProductMouseClicked
        pnlNewAdmin.setVisible(false);
        pnlOrder.setVisible(false);
        pnlProduct.setVisible(true);
        tabHome.setBackground(new Color (204,204,204));
        tabProduct.setBackground(Color.WHITE);
        tabOrder.setBackground(new Color (204,204,204));
        tabSignout.setBackground(new Color (204,204,204));
    }//GEN-LAST:event_tabProductMouseClicked

    private void tabOrderMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabOrderMouseClicked
        pnlNewAdmin.setVisible(false);
        pnlOrder.setVisible(true);
        pnlProduct.setVisible(false);
        tabHome.setBackground(new Color (204,204,204));
        tabProduct.setBackground(new Color (204,204,204));
        tabOrder.setBackground(Color.white);
        tabSignout.setBackground(new Color (204,204,204));

    }//GEN-LAST:event_tabOrderMouseClicked

    private void tabSignoutMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabSignoutMouseClicked
        this.setVisible(false);
        new Login().setVisible(true);
    }//GEN-LAST:event_tabSignoutMouseClicked

    private void txtPhoneKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtPhoneKeyTyped
        char c = evt.getKeyChar();

        if (Character.isLetter(c)){
            evt.consume();
        }
    }//GEN-LAST:event_txtPhoneKeyTyped

    private void btnRegisterMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnRegisterMouseClicked
        String userName, password, email;
        int phone;

        UserDao u = new UserDao();

        if(txtUser.getText().isEmpty()| txtPass.getText().isEmpty() |
            txtEmail.getText().isEmpty()|txtPhone.getText().isEmpty())
        {
            JOptionPane.showMessageDialog(null,"Missing Information!","Fail ", JOptionPane.ERROR_MESSAGE);
        }else
        {
            userName = txtUser.getText();
            password = txtPass.getText();
            email = txtEmail.getText();
            phone = Integer.parseInt(txtPhone.getText());
            if(u.addUser(userName, password,"Admin", email,phone))
            {
                JOptionPane.showMessageDialog(null,"Register Sccessful","Successful", 1);
            } else
            {
                JOptionPane.showMessageDialog(null,"Register Fail, username exist","Fail ", JOptionPane.ERROR_MESSAGE);
            }
        }

    }//GEN-LAST:event_btnRegisterMouseClicked

    private void btnBackMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnBackMouseClicked
        this.setVisible(false);
        new Login().setVisible(true);
    }//GEN-LAST:event_btnBackMouseClicked

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
            java.util.logging.Logger.getLogger(AdminHome.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AdminHome.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AdminHome.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AdminHome.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AdminHome().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnRegister;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
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
    private javax.swing.JLabel lblAccType;
    private javax.swing.JPanel pnlMenu;
    private javax.swing.JPanel pnlNewAdmin;
    private javax.swing.JPanel pnlOrder;
    private javax.swing.JPanel pnlProduct;
    private javax.swing.JPanel tabHome;
    private javax.swing.JPanel tabOrder;
    private javax.swing.JPanel tabProduct;
    private javax.swing.JPanel tabSignout;
    private javax.swing.JTextField txtEmail;
    private javax.swing.JTextField txtPass;
    private javax.swing.JTextField txtPhone;
    private javax.swing.JTextField txtUser;
    // End of variables declaration//GEN-END:variables
}