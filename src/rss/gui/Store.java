/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rss.gui;

import java.awt.Color;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import rss.solution.*;

/**
 *
 * @author Admin
 */
public class Store extends javax.swing.JFrame {

    /**
     * Creates new form Store
     */
    public Store(String username, String password){
        this.username = username;
        this.password = password;
        c = new Customer(username, password);
        initComponents();
        pnlHome.setVisible(true);
        pnlOrder.setVisible(false);
        pnlInfo.setVisible(false);
        lbloldPhone.setText(String.valueOf(c.getPhone()));
        lbloldMail.setText(c.getEmail());
        lbloldPass.setText(c.getPassword());
        
        productTableUpdate();
    }
    
    public Store() {
        initComponents();
        pnlHome.setVisible(true);
        pnlOrder.setVisible(false);
        pnlInfo.setVisible(false);
    }
    
     String username, password;
     Customer c;
     
    ProductDao pd = new ProductDao();

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jDialog1 = new javax.swing.JDialog();
        pnlMenu = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        tabHome = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        tabInfo = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        tabOrder = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        tabSignout = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        pnlHome = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        txtQuantity = new javax.swing.JTextField();
        jLabel15 = new javax.swing.JLabel();
        txtItemId = new javax.swing.JTextField();
        btnCheckOut = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        tbItem = new javax.swing.JTable();
        jLabel6 = new javax.swing.JLabel();
        txtFproduct = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        pnlInfo = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        label1 = new javax.swing.JLabel();
        lbloldPhone = new javax.swing.JLabel();
        label2 = new javax.swing.JLabel();
        txtNewPhone = new javax.swing.JTextField();
        label3 = new javax.swing.JLabel();
        lbloldMail = new javax.swing.JLabel();
        label4 = new javax.swing.JLabel();
        txtNewMail = new javax.swing.JTextField();
        label5 = new javax.swing.JLabel();
        lbloldPass = new javax.swing.JLabel();
        label6 = new javax.swing.JLabel();
        txtNewPass = new javax.swing.JTextField();
        btnCancel = new javax.swing.JButton();
        btnConfirm = new javax.swing.JButton();
        pnlOrder = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        txtSearchOrder = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        btnSearchOrder = new javax.swing.JButton();
        jLabel13 = new javax.swing.JLabel();
        txtDelOrder = new javax.swing.JTextField();
        btnDelOrder = new javax.swing.JButton();

        javax.swing.GroupLayout jDialog1Layout = new javax.swing.GroupLayout(jDialog1.getContentPane());
        jDialog1.getContentPane().setLayout(jDialog1Layout);
        jDialog1Layout.setHorizontalGroup(
            jDialog1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        jDialog1Layout.setVerticalGroup(
            jDialog1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setLocation(new java.awt.Point(300, 100));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        pnlMenu.setBackground(new java.awt.Color(153, 204, 255));
        pnlMenu.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 14)); // NOI18N
        pnlMenu.setName(""); // NOI18N
        pnlMenu.setPreferredSize(new java.awt.Dimension(200, 500));
        pnlMenu.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 14)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Welcome back to");
        pnlMenu.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 130, 150, -1));

        tabHome.setBackground(new java.awt.Color(204, 204, 204));
        tabHome.setPreferredSize(new java.awt.Dimension(0, 60));
        tabHome.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tabHomeMouseClicked(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 14)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Home");

        javax.swing.GroupLayout tabHomeLayout = new javax.swing.GroupLayout(tabHome);
        tabHome.setLayout(tabHomeLayout);
        tabHomeLayout.setHorizontalGroup(
            tabHomeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(tabHomeLayout.createSequentialGroup()
                .addGap(45, 45, 45)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        tabHomeLayout.setVerticalGroup(
            tabHomeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(tabHomeLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, 38, Short.MAX_VALUE)
                .addContainerGap())
        );

        pnlMenu.add(tabHome, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 210, 200, -1));

        tabInfo.setBackground(new java.awt.Color(204, 204, 204));
        tabInfo.setPreferredSize(new java.awt.Dimension(0, 60));
        tabInfo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tabInfoMouseClicked(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 14)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Edit Information");

        javax.swing.GroupLayout tabInfoLayout = new javax.swing.GroupLayout(tabInfo);
        tabInfo.setLayout(tabInfoLayout);
        tabInfoLayout.setHorizontalGroup(
            tabInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, tabInfoLayout.createSequentialGroup()
                .addContainerGap(43, Short.MAX_VALUE)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(39, 39, 39))
        );
        tabInfoLayout.setVerticalGroup(
            tabInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(tabInfoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, 38, Short.MAX_VALUE)
                .addContainerGap())
        );

        pnlMenu.add(tabInfo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 350, 200, -1));

        tabOrder.setBackground(new java.awt.Color(204, 204, 204));
        tabOrder.setPreferredSize(new java.awt.Dimension(0, 60));
        tabOrder.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tabOrderMouseClicked(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 14)); // NOI18N
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("My Order");

        javax.swing.GroupLayout tabOrderLayout = new javax.swing.GroupLayout(tabOrder);
        tabOrder.setLayout(tabOrderLayout);
        tabOrderLayout.setHorizontalGroup(
            tabOrderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, tabOrderLayout.createSequentialGroup()
                .addContainerGap(57, Short.MAX_VALUE)
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(45, 45, 45))
        );
        tabOrderLayout.setVerticalGroup(
            tabOrderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(tabOrderLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, 38, Short.MAX_VALUE)
                .addContainerGap())
        );

        pnlMenu.add(tabOrder, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 280, 200, -1));

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

        jLabel11.setFont(new java.awt.Font("Bodoni MT", 3, 18)); // NOI18N
        jLabel11.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel11.setText("Anvegave Retail Store");
        pnlMenu.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 150, 200, 40));

        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/shopicon.jpg"))); // NOI18N
        pnlMenu.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 30, 100, 100));

        getContentPane().add(pnlMenu, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, 500));

        pnlHome.setBackground(new java.awt.Color(204, 204, 204));
        pnlHome.setMaximumSize(new java.awt.Dimension(600, 500));
        pnlHome.setMinimumSize(new java.awt.Dimension(600, 500));
        pnlHome.setPreferredSize(new java.awt.Dimension(600, 500));
        pnlHome.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel7.setFont(new java.awt.Font("Elephant", 2, 28)); // NOI18N
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setText("Browse Anvegave Retail Store");
        pnlHome.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 0, 560, 60));

        jLabel14.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 12)); // NOI18N
        jLabel14.setText("Quantity :");
        pnlHome.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 450, 60, 30));
        pnlHome.add(txtQuantity, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 450, 110, 30));

        jLabel15.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 12)); // NOI18N
        jLabel15.setText("Product ID:");
        pnlHome.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 450, 70, 30));
        pnlHome.add(txtItemId, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 450, 110, 30));

        btnCheckOut.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 12)); // NOI18N
        btnCheckOut.setText("Check Out");
        pnlHome.add(btnCheckOut, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 440, 110, 40));

        tbItem.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Product ID", "Product Name", "Description", "Fragile", "Quantity", "Prize"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tbItem.getTableHeader().setReorderingAllowed(false);
        jScrollPane2.setViewportView(tbItem);
        if (tbItem.getColumnModel().getColumnCount() > 0) {
            tbItem.getColumnModel().getColumn(0).setResizable(false);
            tbItem.getColumnModel().getColumn(1).setResizable(false);
            tbItem.getColumnModel().getColumn(2).setResizable(false);
            tbItem.getColumnModel().getColumn(3).setResizable(false);
            tbItem.getColumnModel().getColumn(4).setResizable(false);
            tbItem.getColumnModel().getColumn(5).setResizable(false);
        }

        pnlHome.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 130, 530, 280));

        jLabel6.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 14)); // NOI18N
        jLabel6.setText("Product Search :");
        pnlHome.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 90, 120, 30));
        pnlHome.add(txtFproduct, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 90, 150, 30));

        jButton1.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 12)); // NOI18N
        jButton1.setText("Search");
        pnlHome.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 80, 90, 40));

        pnlInfo.setBackground(new java.awt.Color(204, 204, 204));
        pnlInfo.setPreferredSize(new java.awt.Dimension(600, 500));

        jLabel8.setFont(new java.awt.Font("Bodoni MT", 1, 24)); // NOI18N
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel8.setText("Information Update");

        label1.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 12)); // NOI18N
        label1.setText("Current Phone No:");

        lbloldPhone.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 12)); // NOI18N
        lbloldPhone.setText("old number");

        label2.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 12)); // NOI18N
        label2.setText("New Phone No:");

        txtNewPhone.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtNewPhoneKeyTyped(evt);
            }
        });

        label3.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 12)); // NOI18N
        label3.setText("Current E-mail     :");

        lbloldMail.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 12)); // NOI18N
        lbloldMail.setText("old email");

        label4.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 12)); // NOI18N
        label4.setText("New E-mail     :");

        label5.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 12)); // NOI18N
        label5.setText("Current Password:");

        lbloldPass.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 12)); // NOI18N
        lbloldPass.setText("old password");

        label6.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 12)); // NOI18N
        label6.setText("New Password:");

        btnCancel.setFont(new java.awt.Font("Yu Gothic UI Semibold", 1, 14)); // NOI18N
        btnCancel.setText("Cancel");
        btnCancel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnCancelMouseClicked(evt);
            }
        });

        btnConfirm.setFont(new java.awt.Font("Yu Gothic UI Semibold", 1, 14)); // NOI18N
        btnConfirm.setText("Confirm");
        btnConfirm.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnConfirmMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout pnlInfoLayout = new javax.swing.GroupLayout(pnlInfo);
        pnlInfo.setLayout(pnlInfoLayout);
        pnlInfoLayout.setHorizontalGroup(
            pnlInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlInfoLayout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addGroup(pnlInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlInfoLayout.createSequentialGroup()
                        .addComponent(btnCancel, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(181, 181, 181)
                        .addComponent(btnConfirm, javax.swing.GroupLayout.DEFAULT_SIZE, 151, Short.MAX_VALUE)
                        .addGap(81, 81, 81))
                    .addGroup(pnlInfoLayout.createSequentialGroup()
                        .addGroup(pnlInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(pnlInfoLayout.createSequentialGroup()
                                .addGroup(pnlInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(label1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(label3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(label5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(pnlInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(lbloldPhone, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(lbloldMail, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(lbloldPass, javax.swing.GroupLayout.DEFAULT_SIZE, 140, Short.MAX_VALUE))
                                .addGap(18, 18, 18)
                                .addGroup(pnlInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(pnlInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(label4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(label2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                    .addComponent(label6))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(pnlInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(txtNewPhone, javax.swing.GroupLayout.DEFAULT_SIZE, 190, Short.MAX_VALUE)
                                    .addComponent(txtNewPass)
                                    .addComponent(txtNewMail)))
                            .addGroup(pnlInfoLayout.createSequentialGroup()
                                .addGap(116, 116, 116)
                                .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 307, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        pnlInfoLayout.setVerticalGroup(
            pnlInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlInfoLayout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(34, 34, 34)
                .addGroup(pnlInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbloldPhone, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(label1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(label2, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtNewPhone, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(29, 29, 29)
                .addGroup(pnlInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(label3, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbloldMail, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(label4, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtNewMail, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(32, 32, 32)
                .addGroup(pnlInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(label5, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbloldPass, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(label6, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtNewPass, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(76, 76, 76)
                .addGroup(pnlInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnCancel, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnConfirm, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(50, Short.MAX_VALUE))
        );

        pnlOrder.setBackground(new java.awt.Color(204, 204, 204));
        pnlOrder.setPreferredSize(new java.awt.Dimension(600, 500));
        pnlOrder.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel9.setFont(new java.awt.Font("Bodoni MT", 3, 36)); // NOI18N
        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel9.setText("My Order");
        pnlOrder.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(109, 0, 361, -1));

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jScrollPane1.setViewportView(jTable1);

        pnlOrder.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 60, 500, 300));

        txtSearchOrder.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 12)); // NOI18N
        pnlOrder.add(txtSearchOrder, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 380, 180, 30));

        jLabel12.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 12)); // NOI18N
        jLabel12.setText("Search Order:");
        pnlOrder.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 380, 80, 32));

        btnSearchOrder.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 12)); // NOI18N
        btnSearchOrder.setText("Search");
        pnlOrder.add(btnSearchOrder, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 380, 90, 30));

        jLabel13.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 12)); // NOI18N
        jLabel13.setText("Delete Order ID:");
        pnlOrder.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 420, 90, 40));
        pnlOrder.add(txtDelOrder, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 430, 180, 30));

        btnDelOrder.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 12)); // NOI18N
        btnDelOrder.setText("Confirm");
        pnlOrder.add(btnDelOrder, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 430, 90, 30));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnlHome, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(pnlOrder, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(pnlInfo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnlHome, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(pnlOrder, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(pnlInfo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 0, 600, 500));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    public void productTableUpdate(){
        DefaultTableModel model = (DefaultTableModel)tbItem.getModel();
        Object[] lines = pd.getProductList();
        model.setRowCount(0);
        for(int i = 0; i < lines.length; i++){
                String line = lines[i].toString().trim();
                String[] row = line.split(",");
                model.addRow(row);
        }
    }
    
    private void tabHomeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabHomeMouseClicked
        pnlHome.setVisible(true);
        pnlOrder.setVisible(false);
        pnlInfo.setVisible(false);
        tabHome.setBackground(Color.WHITE);
        tabInfo.setBackground(new Color (204,204,204));
        tabOrder.setBackground(new Color (204,204,204));
        tabSignout.setBackground(new Color (204,204,204));
    }//GEN-LAST:event_tabHomeMouseClicked

    private void tabOrderMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabOrderMouseClicked
        pnlHome.setVisible(false);
        pnlOrder.setVisible(true);
        pnlInfo.setVisible(false);
        tabHome.setBackground(new Color (204,204,204));
        tabInfo.setBackground(new Color (204,204,204));
        tabOrder.setBackground(Color.white);
        tabSignout.setBackground(new Color (204,204,204));
    }//GEN-LAST:event_tabOrderMouseClicked

    private void tabInfoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabInfoMouseClicked
        pnlHome.setVisible(false);
        pnlOrder.setVisible(false);
        pnlInfo.setVisible(true);
        tabHome.setBackground(new Color (204,204,204));
        tabInfo.setBackground(Color.WHITE);
        tabOrder.setBackground(new Color (204,204,204));
        tabSignout.setBackground(new Color (204,204,204));
    }//GEN-LAST:event_tabInfoMouseClicked

    private void tabSignoutMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabSignoutMouseClicked
        this.setVisible(false);
        new Login().setVisible(true);
    }//GEN-LAST:event_tabSignoutMouseClicked

    private void btnConfirmMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnConfirmMouseClicked
        UserDao ud = new UserDao();
        String pass,email;
        int phone = 0;
        
        pass = txtNewPass.getText().toLowerCase();
        email = txtNewMail.getText().toLowerCase();
        //phone = Integer.parseInt(txtNewPhone.getText());
        
        if(txtNewPass.getText().isEmpty())
         {
            pass = password;
         }
        
        if(txtNewMail.getText().isEmpty())
        {
            email = c.getEmail();
        }
        
        if(txtNewPhone.getText().isEmpty())
        {
            phone = c.getPhone();
            String tempPhone = String.valueOf(phone);
            txtNewPhone.setText(tempPhone);
        }
        
        if (!ud.updateUser(username, pass,"Customer", email, phone))
        {
            JOptionPane.showMessageDialog(null,"Update Fail, Please try again !","Fail", 3);
        }else
        {
            JOptionPane.showMessageDialog(null,"Update Complete!","Success", 1);
            productTableUpdate();
            txtNewPhone.setText("");
            txtNewMail.setText("");
            txtNewPass.setText("");
        }
        
    }//GEN-LAST:event_btnConfirmMouseClicked

    private void btnCancelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCancelMouseClicked
        txtNewPhone.setText("");
        txtNewMail.setText("");
        txtNewPass.setText("");
    }//GEN-LAST:event_btnCancelMouseClicked

    private void txtNewPhoneKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNewPhoneKeyTyped
        char c = evt.getKeyChar();
        
        if (Character.isLetter(c)){
            evt.consume();
        }
    }//GEN-LAST:event_txtNewPhoneKeyTyped

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
            java.util.logging.Logger.getLogger(Store.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Store.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Store.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Store.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Store().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCancel;
    private javax.swing.JButton btnCheckOut;
    private javax.swing.JButton btnConfirm;
    private javax.swing.JButton btnDelOrder;
    private javax.swing.JButton btnSearchOrder;
    private javax.swing.JButton jButton1;
    private javax.swing.JDialog jDialog1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable1;
    private javax.swing.JLabel label1;
    private javax.swing.JLabel label2;
    private javax.swing.JLabel label3;
    private javax.swing.JLabel label4;
    private javax.swing.JLabel label5;
    private javax.swing.JLabel label6;
    private javax.swing.JLabel lbloldMail;
    private javax.swing.JLabel lbloldPass;
    private javax.swing.JLabel lbloldPhone;
    private javax.swing.JPanel pnlHome;
    private javax.swing.JPanel pnlInfo;
    private javax.swing.JPanel pnlMenu;
    private javax.swing.JPanel pnlOrder;
    private javax.swing.JPanel tabHome;
    private javax.swing.JPanel tabInfo;
    private javax.swing.JPanel tabOrder;
    private javax.swing.JPanel tabSignout;
    private javax.swing.JTable tbItem;
    private javax.swing.JTextField txtDelOrder;
    private javax.swing.JTextField txtFproduct;
    private javax.swing.JTextField txtItemId;
    private javax.swing.JTextField txtNewMail;
    private javax.swing.JTextField txtNewPass;
    private javax.swing.JTextField txtNewPhone;
    private javax.swing.JTextField txtQuantity;
    private javax.swing.JTextField txtSearchOrder;
    // End of variables declaration//GEN-END:variables
}
